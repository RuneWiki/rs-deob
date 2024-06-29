import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class187 implements Runnable {

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "Z")
    private boolean field2773 = false;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    private int field2788 = 0;

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "I")
    private int field2796 = 0;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "Z")
    private boolean field2780 = false;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "Lli;")
    private class293 field2786;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field2783;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field2776;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2794;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "[I")
    public static int[] field2782 = new int[4096];

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Lcq;")
    private class324 field2774;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "[B")
    private byte[] field2792;

    @OriginalMember(owner = "client!uu", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        this.method1305((byte) 107);
        field2791++;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V", line = 11)
    public final void method1301(int arg0) {
        field2787++;
        if (this.field2773) {
            return;
        }
        if (arg0 != 16180) {
            method1307(30);
        }
        this.field2776 = new class530();
        this.field2794 = new class237();
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V", line = 27)
    public final void method1302(int arg0) throws IOException {
        field2785++;
        if (this.field2773) {
            return;
        }
        if (this.field2780) {
            this.field2780 = false;
            throw new IOException();
        } else if (arg0 != 0) {
            this.field2788 = -89;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BII)Z", line = 50)
    public static final boolean method1303(byte arg0, int arg1, int arg2) {
        if (arg0 == 48) {
            field2775++;
            return (arg1 & 0x800) != 0 | class402.method2462((byte) -124, arg2, arg1) || class281.method1797(arg1, arg2, arg0 - 4590);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Ljava/net/Socket;Lli;)V", line = 318)
    public class187(Socket arg0, class293 arg1) throws IOException {
        this.field2786 = arg1;
        this.field2783 = arg0;
        this.field2783.setSoTimeout(30000);
        this.field2783.setTcpNoDelay(true);
        this.field2776 = this.field2783.getInputStream();
        this.field2794 = this.field2783.getOutputStream();
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "([BIIB)V", line = 70)
    public final void method1304(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field2795++;
        if (this.field2773) {
            return;
        }
        if (this.field2780) {
            this.field2780 = false;
            throw new IOException();
        }
        if (this.field2792 == null) {
            this.field2792 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 107 / ((21 - arg3) / 56);
            for (int var7 = 0; var7 < arg2; var7++) {
                this.field2792[this.field2796] = arg0[arg1 + var7];
                this.field2796 = (this.field2796 + 1) % 5000;
                if ((this.field2788 + 4900) % 5000 == this.field2796) {
                    throw new IOException();
                }
            }
            if (this.field2774 == null) {
                this.field2774 = this.field2786.method1859(3, true, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 121)
    public final void method1305(byte arg0) {
        field2777++;
        if (this.field2773) {
            return;
        }
        synchronized (this) {
            this.field2773 = true;
            this.notifyAll();
        }
        if (this.field2774 != null) {
            while (this.field2774.field4940 == 0) {
                class71.method583(1L, 100);
            }
            if (this.field2774.field4940 == 1) {
                try {
                    ((Thread) this.field2774.field4939).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        int var3 = -49 / ((arg0 - 44) / 47);
        this.field2774 = null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II[BI)V", line = 163)
    public final void method1306(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2784++;
        if (this.field2773) {
            return;
        }
        if (arg1 != 0) {
            field2793 = 94;
        }
        while (arg3 > 0) {
            int var5 = this.field2776.read(arg2, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!uu", name = "run", descriptor = "()V", line = 194)
    public final void run() {
        field2789++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2796 == this.field2788) {
                        if (this.field2773) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2788 <= this.field2796) {
                        var2 = this.field2796 - this.field2788;
                    } else {
                        var2 = 5000 - this.field2788;
                    }
                    var3 = this.field2788;
                }
                if (var2 > 0) {
                    try {
                        this.field2794.write(this.field2792, var3, var2);
                    } catch (IOException var9) {
                        this.field2780 = true;
                    }
                    this.field2788 = (this.field2788 + var2) % 5000;
                    try {
                        if (this.field2796 == this.field2788) {
                            this.field2794.flush();
                        }
                    } catch (IOException var8) {
                        this.field2780 = true;
                    }
                }
            }
            try {
                if (this.field2776 != null) {
                    this.field2776.close();
                }
                if (this.field2794 != null) {
                    this.field2794.close();
                }
                if (this.field2783 != null) {
                    this.field2783.close();
                }
            } catch (IOException var7) {
            }
            this.field2792 = null;
        } catch (Exception var12) {
            class320.method2087(0, var12, null);
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V", line = 272)
    public static void method1307(int arg0) {
        field2782 = null;
        if (arg0 != -2) {
            field2781 = 12;
        }
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)I", line = 283)
    public final int method1308(int arg0) throws IOException {
        if (arg0 != 14971) {
            method1307(125);
        }
        field2790++;
        return this.field2773 ? 0 : this.field2776.available();
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)I", line = 302)
    public final int method1309(int arg0) throws IOException {
        if (arg0 <= 104) {
            return 71;
        } else {
            field2779++;
            return this.field2773 ? 0 : this.field2776.read();
        }
    }
}
