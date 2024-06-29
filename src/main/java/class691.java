import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class691 implements Runnable {

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "Z")
    private boolean field9842 = false;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    private int field9849 = 0;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Z")
    private boolean field9846 = false;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    private int field9853 = 0;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field9838;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Llaa;")
    private class105 field9845;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field9844;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9841;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    private int field9852;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "Llh;")
    public static class487 field9858 = new class487(60, -1);

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "[Lrt;")
    public static class208[] field9860 = new class208[35];

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field9851;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "Lsea;")
    public static class648 field9859;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "Lkl;")
    private class70 field9848;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "[B")
    private byte[] field9839;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)I", line = 5)
    public final int method3887(int arg0) throws IOException {
        if (arg0 <= 20) {
            this.method3893((byte) -122);
        }
        field9847++;
        return this.field9846 ? 0 : this.field9844.read();
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V", line = 21)
    public final void method3888(int arg0) {
        field9856++;
        if (!this.field9846) {
            this.field9844 = new class293();
            if (arg0 <= -20) {
                this.field9841 = new class35();
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V", line = 37)
    public final void method3889(int arg0) throws IOException {
        field9840++;
        if (this.field9846) {
            return;
        }
        if (this.field9842) {
            this.field9842 = false;
            throw new IOException();
        } else if (arg0 != 1) {
            this.method3893((byte) 64);
        }
    }

    @OriginalMember(owner = "client!wo", name = "run", descriptor = "()V", line = 62)
    public final void run() {
        field9850++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field9853 == this.field9849) {
                        if (this.field9846) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field9853 < this.field9849) {
                        var2 = this.field9852 - this.field9849;
                    } else {
                        var2 = this.field9853 - this.field9849;
                    }
                    var3 = this.field9849;
                }
                if (var2 > 0) {
                    try {
                        this.field9841.write(this.field9839, var3, var2);
                    } catch (IOException var9) {
                        this.field9842 = true;
                    }
                    this.field9849 = (this.field9849 + var2) % this.field9852;
                    try {
                        if (this.field9853 == this.field9849) {
                            this.field9841.flush();
                        }
                    } catch (IOException var8) {
                        this.field9842 = true;
                    }
                }
            }
            try {
                if (this.field9844 != null) {
                    this.field9844.close();
                }
                if (this.field9841 != null) {
                    this.field9841.close();
                }
                if (this.field9838 != null) {
                    this.field9838.close();
                }
            } catch (IOException var7) {
            }
            this.field9839 = null;
        } catch (Exception var12) {
            class413.method2400(null, var12, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!wo", name = "finalize", descriptor = "()V", line = 137)
    protected final void finalize() {
        this.method3893((byte) -126);
        field9857++;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ljava/net/Socket;Llaa;I)V", line = 291)
    public class691(Socket arg0, class105 arg1, int arg2) throws IOException {
        this.field9838 = arg0;
        this.field9845 = arg1;
        this.field9838.setSoTimeout(30000);
        this.field9838.setTcpNoDelay(true);
        this.field9844 = this.field9838.getInputStream();
        this.field9841 = this.field9838.getOutputStream();
        this.field9852 = arg2;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V", line = 150)
    public static void method3890(int arg0) {
        field9860 = null;
        field9859 = null;
        if (arg0 != 0) {
            method3890(11);
        }
        field9858 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "([BIII)V", line = 165)
    public final void method3891(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field9855++;
        if (this.field9846) {
            return;
        }
        if (this.field9842) {
            this.field9842 = false;
            throw new IOException();
        }
        if (this.field9839 == null) {
            this.field9839 = new byte[this.field9852];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg2 >= 66) {
                while (arg3 > var6) {
                    this.field9839[this.field9853] = arg0[arg1 + var6];
                    this.field9853 = (this.field9853 + 1) % this.field9852;
                    if (((this.field9852 + this.field9849 - 100) % this.field9852) == this.field9853) {
                        throw new IOException();
                    }
                    var6++;
                }
                if (this.field9848 == null) {
                    this.field9848 = this.field9845.method757((byte) 74, 3, this);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "([BIII)V", line = 223)
    public final void method3892(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field9851++;
        if (this.field9846) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field9844.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
        if (arg1 != 2656) {
            this.method3888(-19);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 255)
    public final void method3893(byte arg0) {
        field9854++;
        if (arg0 >= -121) {
            method3890(66);
        }
        if (this.field9846) {
            return;
        }
        synchronized (this) {
            this.field9846 = true;
            this.notifyAll();
        }
        if (this.field9848 != null) {
            while (this.field9848.field948 == 0) {
                class519.method2960(-44, 1L);
            }
            if (this.field9848.field948 == 1) {
                try {
                    ((Thread) this.field9848.field946).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field9848 = null;
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)I", line = 305)
    public final int method3894(int arg0) throws IOException {
        field9843++;
        if (this.field9846) {
            return 0;
        } else if (arg0 == 3) {
            return this.field9844.available();
        } else {
            return -69;
        }
    }
}
