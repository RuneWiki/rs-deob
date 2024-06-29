import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class174 implements Runnable {

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    private int field2470 = 0;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    private int field2477 = 0;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    private int field2479;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2467;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "[B")
    private byte[] field2474;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field2472;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2478;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2475;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "[Luaa;")
    public static class101[] field2480;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Ljava/io/IOException;")
    private IOException field2471;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field2478 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field2475 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field2480 = new class101[35];
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 4)
    public final void method1188(byte arg0) {
        synchronized (this) {
            if (this.field2471 == null) {
                this.field2471 = new IOException("");
            }
            this.notifyAll();
        }
        field2468++;
        if (arg0 > -4) {
            field2475 = null;
        }
        try {
            this.field2472.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 27)
    public final void method1189(byte arg0) {
        field2473++;
        if (arg0 == 27) {
            this.field2467 = new class95();
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 41)
    public static void method1190(int arg0) {
        field2478 = null;
        if (arg0 != 0) {
            field2478 = null;
        }
        field2480 = null;
        field2475 = null;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 219)
    public class174(OutputStream arg0, int arg1) {
        this.field2479 = arg1 + 1;
        this.field2467 = arg0;
        this.field2474 = new byte[this.field2479];
        this.field2472 = new Thread(this);
        this.field2472.setDaemon(true);
        this.field2472.start();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B[BII)V", line = 58)
    public final void method1191(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2469++;
        if (arg2 < 0 || arg3 < 0 || arg1.length < (arg2 + arg3)) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg0 >= -111) {
                method1190(77);
            }
            if (this.field2471 != null) {
                throw new IOException(this.field2471.toString());
            }
            int var6;
            if (this.field2470 <= this.field2477) {
                var6 = this.field2479 + this.field2470 - this.field2477 - 1;
            } else {
                var6 = this.field2470 - this.field2477 - 1;
            }
            if (arg2 > var6) {
                throw new IOException("");
            }
            if ((this.field2477 + arg2) <= this.field2479) {
                class476.method2792(arg1, arg3, this.field2474, this.field2477, arg2);
            } else {
                int var7 = this.field2479 - this.field2477;
                class476.method2792(arg1, arg3, this.field2474, this.field2477, var7);
                class476.method2792(arg1, arg3 + var7, this.field2474, 0, arg2 - var7);
            }
            this.field2477 = (this.field2477 + arg2) % this.field2479;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kk", name = "run", descriptor = "()V", line = 101)
    public final void run() {
        field2476++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2471 != null) {
                        return;
                    }
                    if (this.field2470 <= this.field2477) {
                        var2 = this.field2477 - this.field2470;
                    } else {
                        var2 = this.field2477 + this.field2479 - this.field2470;
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
                if (this.field2479 >= this.field2470 + var2) {
                    this.field2467.write(this.field2474, this.field2470, var2);
                } else {
                    int var3 = this.field2479 - this.field2470;
                    this.field2467.write(this.field2474, this.field2470, var3);
                    this.field2467.write(this.field2474, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2471 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2470 = (this.field2470 + var2) % this.field2479;
            }
        }
    }
}
