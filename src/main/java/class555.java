import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class555 implements Runnable {

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "Z")
    private boolean field7870 = false;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    private int field7873 = 0;

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "Z")
    private boolean field7889 = false;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
    private int field7881 = 0;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "Ltq;")
    private class545 field7882;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field7874;

    @OriginalMember(owner = "client!wda", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field7888;

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7887;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field7871 = -1;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "Lig;")
    public static class206 field7872 = new class206(48, 3);

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "[I")
    public static int[] field7884 = new int[6];

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "Llk;")
    public static class510 field7885 = new class510();

    @OriginalMember(owner = "client!wda", name = "x", descriptor = "I")
    public static int field7891 = 0;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!wda", name = "w", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "Loc;")
    private class175 field7886;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "[B")
    private byte[] field7883;

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljava/net/Socket;Ltq;)V", line = 316)
    public class555(Socket arg0, class545 arg1) throws IOException {
        this.field7882 = arg1;
        this.field7874 = arg0;
        this.field7874.setSoTimeout(30000);
        this.field7874.setTcpNoDelay(true);
        this.field7888 = this.field7874.getInputStream();
        this.field7887 = this.field7874.getOutputStream();
    }

    @OriginalMember(owner = "client!wda", name = "run", descriptor = "()V", line = 13)
    public final void run() {
        field7875++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field7881 == this.field7873) {
                        if (this.field7889) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field7881;
                    if (this.field7881 <= this.field7873) {
                        var3 = this.field7873 - this.field7881;
                    } else {
                        var3 = 5000 - this.field7881;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field7887.write(this.field7883, var2, var3);
                    } catch (IOException var9) {
                        this.field7870 = true;
                    }
                    this.field7881 = (this.field7881 + var3) % 5000;
                    try {
                        if (this.field7881 == this.field7873) {
                            this.field7887.flush();
                        }
                    } catch (IOException var8) {
                        this.field7870 = true;
                    }
                }
            }
            try {
                if (this.field7888 != null) {
                    this.field7888.close();
                }
                if (this.field7887 != null) {
                    this.field7887.close();
                }
                if (this.field7874 != null) {
                    this.field7874.close();
                }
            } catch (IOException var7) {
            }
            this.field7883 = null;
        } catch (Exception var12) {
            class630.method3607(7, var12, null);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([BIIB)V", line = 89)
    public final void method3204(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field7879++;
        if (this.field7889) {
            return;
        }
        while (arg2 > 0) {
            int var6 = this.field7888.read(arg0, arg1, arg2);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg2 -= var6;
            arg1 += var6;
        }
        int var5 = 99 / ((68 - arg3) / 54);
    }

    @OriginalMember(owner = "client!wda", name = "finalize", descriptor = "()V", line = 113)
    protected final void finalize() {
        field7880++;
        this.method3210(-120);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)I", line = 125)
    public final int method3205(int arg0) throws IOException {
        field7869++;
        if (this.field7889) {
            return 0;
        } else if (arg0 < 112) {
            return 27;
        } else {
            return this.field7888.available();
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)I", line = 140)
    public final int method3206(int arg0) throws IOException {
        field7876++;
        if (this.field7889) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field7886 = null;
            }
            return this.field7888.read();
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(II[BI)V", line = 160)
    public final void method3207(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field7868++;
        if (this.field7889) {
            return;
        }
        if (this.field7870) {
            this.field7870 = false;
            throw new IOException();
        }
        if (this.field7883 == null) {
            this.field7883 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = arg3; var6 < arg1; var6++) {
                this.field7883[this.field7873] = arg2[arg0 + var6];
                this.field7873 = (this.field7873 + 1) % 5000;
                if ((this.field7881 + 4900) % 5000 == this.field7873) {
                    throw new IOException();
                }
            }
            if (this.field7886 == null) {
                this.field7886 = this.field7882.method3177(3, 1, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)V", line = 209)
    public final void method3208(byte arg0) throws IOException {
        if (arg0 > -39) {
            field7884 = null;
        }
        field7877++;
        if (!this.field7889 && this.field7870) {
            this.field7870 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)V", line = 231)
    public static void method3209(int arg0) {
        field7885 = null;
        if (arg0 != -11835) {
            field7871 = 113;
        }
        field7884 = null;
        field7872 = null;
    }

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "(I)V", line = 243)
    public final void method3210(int arg0) {
        field7878++;
        if (this.field7889) {
            return;
        }
        synchronized (this) {
            this.field7889 = true;
            this.notifyAll();
            int var3 = -87 / ((4 - arg0) / 40);
        }
        if (this.field7886 != null) {
            while (this.field7886.field2138 == 0) {
                class646.method3696(1, 1L);
            }
            if (this.field7886.field2138 == 1) {
                try {
                    ((Thread) this.field7886.field2140).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field7886 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V", line = 281)
    public final void method3211(boolean arg0) {
        field7890++;
        if (this.field7889) {
            return;
        }
        this.field7888 = new class237();
        this.field7887 = new class352();
        if (!arg0) {
            this.field7873 = 83;
        }
    }
}
