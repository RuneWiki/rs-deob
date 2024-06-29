import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class425 implements Runnable {

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    private int field5906 = 0;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    private int field5911 = 0;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5900;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    private int field5913;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "[B")
    private byte[] field5914;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field5907;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "Z")
    public static boolean field5910 = false;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "Lin;")
    public static class380 field5905 = new class380(45, 4);

    @OriginalMember(owner = "client!du", name = "p", descriptor = "Lsv;")
    public static class570 field5915 = new class570(31, 6);

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Ld;")
    public static class103 field5903;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field5901;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([BIII)V")
    public final void method2497(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5912++;
        if (arg1 < 0 || arg3 < 0 || (arg1 + arg3) > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field5901 != null) {
                throw new IOException(this.field5901.toString());
            }
            int var6;
            if (this.field5906 <= this.field5911) {
                var6 = this.field5906 + this.field5913 - this.field5911 - 1;
            } else {
                var6 = this.field5906 - this.field5911 - 1;
            }
            if (arg2 == -1) {
                if (var6 < arg1) {
                    throw new IOException("");
                }
                if (this.field5911 + arg1 <= this.field5913) {
                    class171.method1263(arg0, arg3, this.field5914, this.field5911, arg1);
                } else {
                    int var7 = this.field5913 - this.field5911;
                    class171.method1263(arg0, arg3, this.field5914, this.field5911, var7);
                    class171.method1263(arg0, arg3 + var7, this.field5914, 0, arg1 - var7);
                }
                this.field5911 = (this.field5911 + arg1) % this.field5913;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "run", descriptor = "()V")
    public final void run() {
        field5909++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5901 != null) {
                        return;
                    }
                    if (this.field5906 > this.field5911) {
                        var2 = this.field5913 + this.field5911 - this.field5906;
                    } else {
                        var2 = this.field5911 - this.field5906;
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
                if ((this.field5906 + var2) > this.field5913) {
                    int var3 = this.field5913 - this.field5906;
                    this.field5900.write(this.field5914, this.field5906, var3);
                    this.field5900.write(this.field5914, 0, var2 - var3);
                } else {
                    this.field5900.write(this.field5914, this.field5906, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field5901 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field5906 = (this.field5906 + var2) % this.field5913;
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public final void method2498(int arg0) {
        this.field5900 = new class366();
        if (arg0 != 25860) {
            this.field5901 = null;
        }
        field5904++;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lbm;B)V")
    public static final void method2499(class712 arg0, byte arg1) {
        field5902++;
        if (arg1 <= 70) {
            field5905 = null;
        }
        class528.field7367 = arg0;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
    public static void method2500(boolean arg0) {
        field5903 = null;
        field5905 = null;
        if (arg0) {
            field5915 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
    public final void method2501(int arg0) {
        synchronized (this) {
            if (this.field5901 == null) {
                this.field5901 = new IOException("");
            }
            this.notifyAll();
        }
        field5908++;
        try {
            this.field5907.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 0) {
            method2499(null, (byte) -42);
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class425(OutputStream arg0, int arg1) {
        this.field5900 = arg0;
        this.field5913 = arg1 + 1;
        this.field5914 = new byte[this.field5913];
        this.field5907 = new Thread(this);
        this.field5907.setDaemon(true);
        this.field5907.start();
    }
}
