import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class376 implements Runnable {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    private int field5734 = 0;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
    private boolean field5732 = false;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Z")
    private boolean field5731 = false;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    private int field5739 = 0;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field5744;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lji;")
    private class432 field5733;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Ljava/io/InputStream;")
    private InputStream field5745;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5730;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field5736 = -1;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Z")
    public static boolean field5740 = false;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5746 = null;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lrm;")
    private class281 field5742;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "[B")
    private byte[] field5743;

    @OriginalMember(owner = "client!ac", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field5748++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field5739 == this.field5734) {
                        if (this.field5732) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field5739 <= this.field5734) {
                        var2 = this.field5734 - this.field5739;
                    } else {
                        var2 = 5000 - this.field5739;
                    }
                    var3 = this.field5739;
                }
                if (var2 > 0) {
                    try {
                        this.field5730.write(this.field5743, var3, var2);
                    } catch (IOException var9) {
                        this.field5731 = true;
                    }
                    this.field5739 = (this.field5739 + var2) % 5000;
                    try {
                        if (this.field5739 == this.field5734) {
                            this.field5730.flush();
                        }
                    } catch (IOException var8) {
                        this.field5731 = true;
                    }
                }
            }
            try {
                if (this.field5745 != null) {
                    this.field5745.close();
                }
                if (this.field5730 != null) {
                    this.field5730.close();
                }
                if (this.field5744 != null) {
                    this.field5744.close();
                }
            } catch (IOException var7) {
            }
            this.field5743 = null;
        } catch (Exception var12) {
            class235.method1598(var12, null, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 78)
    public static void method2305(int arg0) {
        if (arg0 == 0) {
            field5746 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I", line = 91)
    public final int method2306(byte arg0) throws IOException {
        field5741++;
        if (this.field5732) {
            return 0;
        } else {
            int var2 = -116 % ((arg0 + 48) / 33);
            return this.field5745.read();
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 104)
    public final void method2307(byte arg0) {
        field5750++;
        if (!this.field5732) {
            this.field5745 = new class531();
            if (arg0 == -120) {
                this.field5730 = new class303();
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/net/Socket;Lji;)V", line = 305)
    public class376(Socket arg0, class432 arg1) throws IOException {
        this.field5744 = arg0;
        this.field5733 = arg1;
        this.field5744.setSoTimeout(30000);
        this.field5744.setTcpNoDelay(true);
        this.field5745 = this.field5744.getInputStream();
        this.field5730 = this.field5744.getOutputStream();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([BIII)V", line = 125)
    public final void method2308(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5751++;
        if (arg3 <= 17 || this.field5732) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field5745.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 152)
    public final void method2309(int arg0) throws IOException {
        int var2 = 99 / ((arg0 + 38) / 59);
        field5737++;
        if (!this.field5732 && this.field5731) {
            this.field5731 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)I", line = 177)
    public final int method2310(int arg0) throws IOException {
        field5747++;
        if (this.field5732) {
            return 0;
        } else {
            int var2 = -80 / ((arg0 - 18) / 62);
            return this.field5745.available();
        }
    }

    @OriginalMember(owner = "client!ac", name = "finalize", descriptor = "()V", line = 193)
    protected final void finalize() {
        field5735++;
        this.method2312(false);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BII)V", line = 204)
    public final void method2311(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field5738++;
        if (arg2 != 4900 || this.field5732) {
            return;
        }
        if (this.field5731) {
            this.field5731 = false;
            throw new IOException();
        }
        if (this.field5743 == null) {
            this.field5743 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field5743[this.field5734] = arg1[arg3 + var6];
                this.field5734 = (this.field5734 + 1) % 5000;
                if ((this.field5739 + 4900) % 5000 == this.field5734) {
                    throw new IOException();
                }
            }
            if (this.field5742 == null) {
                this.field5742 = this.field5733.method2595(this, 3, 75);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 269)
    public final void method2312(boolean arg0) {
        field5749++;
        if (this.field5732) {
            return;
        }
        synchronized (this) {
            this.field5732 = true;
            this.notifyAll();
        }
        if (this.field5742 != null) {
            while (this.field5742.field4032 == 0) {
                class246.method1659((byte) 117, 1L);
            }
            if (this.field5742.field4032 == 1) {
                try {
                    ((Thread) this.field5742.field4030).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5742 = null;
        if (arg0) {
            this.method2307((byte) -117);
        }
    }
}
