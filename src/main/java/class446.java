import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class446 implements Runnable {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    private int field5900 = 0;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    private int field5907 = 0;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    private int field5912;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5911;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "[B")
    private byte[] field5910;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field5906;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Ldn;")
    public static class276 field5908 = new class276();

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Leba;")
    public static class550 field5913 = new class550(76, 0);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field5904;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[Li;")
    public static class270[] field5914;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 3)
    public final void method2513(int arg0) {
        this.field5911 = new class616();
        if (arg0 == -1) {
            field5903++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method2514(boolean arg0) {
        field5899++;
        if (arg0) {
            return;
        }
        if (class576.field7861 == 3) {
            class28.method182(4, 29697);
        } else if (class576.field7861 == 7) {
            class28.method182(8, 29697);
            return;
        } else if (class576.field7861 == 10) {
            class28.method182(11, 29697);
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BIIB)V", line = 43)
    public final void method2515(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field5909++;
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field5904 != null) {
                throw new IOException(this.field5904.toString());
            }
            int var6;
            if (this.field5907 >= this.field5900) {
                var6 = this.field5912 + this.field5900 - this.field5907 - 1;
            } else {
                var6 = this.field5900 - this.field5907 - 1;
            }
            if (arg2 > var6) {
                throw new IOException("");
            }
            if ((this.field5907 + arg2) <= this.field5912) {
                class2.method9(arg0, arg1, this.field5910, this.field5907, arg2);
            } else {
                int var7 = this.field5912 - this.field5907;
                class2.method9(arg0, arg1, this.field5910, this.field5907, var7);
                class2.method9(arg0, arg1 + var7, this.field5910, 0, arg2 - var7);
            }
            this.field5907 = (this.field5907 + arg2) % this.field5912;
            this.notifyAll();
            if (arg3 < 24) {
                this.method2513(53);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 87)
    public final void method2516(boolean arg0) {
        synchronized (this) {
            if (this.field5904 == null) {
                this.field5904 = new IOException("");
            }
            this.notifyAll();
        }
        field5901++;
        if (!arg0) {
            method2514(true);
        }
        try {
            this.field5906.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!tb", name = "run", descriptor = "()V", line = 108)
    public final void run() {
        field5905++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5904 != null) {
                        return;
                    }
                    if (this.field5907 >= this.field5900) {
                        var2 = this.field5907 - this.field5900;
                    } else {
                        var2 = this.field5912 + this.field5907 - this.field5900;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                if ((this.field5900 + var2) > this.field5912) {
                    int var3 = this.field5912 - this.field5900;
                    this.field5911.write(this.field5910, this.field5900, var3);
                    this.field5911.write(this.field5910, 0, var2 - var3);
                } else {
                    this.field5911.write(this.field5910, this.field5900, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field5904 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field5900 = (this.field5900 + var2) % this.field5912;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 189)
    public class446(OutputStream arg0, int arg1) {
        this.field5912 = arg1 + 1;
        this.field5911 = arg0;
        this.field5910 = new byte[this.field5912];
        this.field5906 = new Thread(this);
        this.field5906.setDaemon(true);
        this.field5906.start();
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(Z)V", line = 171)
    public static void method2517(boolean arg0) {
        if (arg0) {
            field5902 = -72;
        }
        field5914 = null;
        field5913 = null;
        field5908 = null;
    }
}
