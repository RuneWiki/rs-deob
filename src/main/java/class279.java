import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class279 implements Runnable {

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lmm;")
    private class43 field4301 = new class43();

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Z")
    private boolean field4304 = false;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public int field4310 = 0;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field4309;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Z")
    public static boolean field4299 = false;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[I")
    public static int[] field4303 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field4302 = 0;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4307 = "Connection lost.";

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4313 = "green:";

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4306 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!na", name = "p", descriptor = "F")
    public static float field4312 = 128.0F;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field4314++;
        while (!this.field4304) {
            class43 var1 = this.field4301;
            class157 var2;
            synchronized (this.field4301) {
                var2 = (class157) this.field4301.method445(2);
                if (var2 == null) {
                    try {
                        this.field4301.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4310--;
            }
            try {
                if (var2.field2514 == 2) {
                    var2.field2512.method1259((byte) -49, var2.field2510, (int) var2.field4932, var2.field2510.length);
                } else if (var2.field2514 == 3) {
                    var2.field2510 = var2.field2512.method1261(true, (int) var2.field4932);
                }
            } catch (Exception var6) {
                client.method1023((byte) -103, (String) null, var6);
            }
            var2.field4435 = false;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljb;I)V", line = 59)
    private final void method2038(class157 arg0, int arg1) {
        class43 var3 = this.field4301;
        synchronized (this.field4301) {
            this.field4301.method438(true, arg0);
            this.field4310++;
            if (arg1 > -68) {
                method2040(true);
            }
            this.field4301.notifyAll();
        }
        field4297++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lth;I[BI)Ljb;", line = 77)
    public final class157 method2039(class153 arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 >= -44) {
            return (class157) null;
        }
        field4298++;
        class157 var5 = new class157();
        var5.field2510 = arg2;
        var5.field4932 = (long) arg1;
        var5.field4437 = false;
        var5.field2512 = arg0;
        var5.field2514 = 2;
        this.method2038(var5, -111);
        return var5;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V", line = 220)
    public class279() {
        class95 var1 = class340.field5234.method2290((byte) -103, this, 5);
        while (var1.field1447 == 0) {
            class188.method1443(10, 10L);
        }
        if (var1.field1447 == 2) {
            throw new RuntimeException();
        }
        this.field4309 = (Thread) var1.field1446;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 119)
    public static void method2040(boolean arg0) {
        if (!arg0) {
            field4312 = 0.9448672F;
        }
        field4307 = null;
        field4306 = null;
        field4313 = null;
        field4303 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lth;II)Ljb;", line = 138)
    public final class157 method2041(class153 arg0, int arg1, int arg2) {
        field4300++;
        class157 var4 = new class157();
        var4.field4932 = (long) arg1;
        var4.field4437 = false;
        var4.field2512 = arg0;
        var4.field2514 = 3;
        int var5 = 19 / ((arg2 + 38) / 43);
        this.method2038(var4, -85);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Lth;II)Ljb;", line = 156)
    public final class157 method2042(class153 arg0, int arg1, int arg2) {
        field4311++;
        if (arg1 != -19929) {
            this.field4309 = (Thread) null;
        }
        class157 var4 = new class157();
        var4.field2514 = 1;
        class43 var5 = this.field4301;
        synchronized (this.field4301) {
            class157 var6 = (class157) this.field4301.method442((byte) -72);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field4932 && var6.field2512 == arg0 && var6.field2514 == 2) {
                    var4.field2510 = var6.field2510;
                    var4.field4435 = false;
                    return var4;
                }
                var6 = (class157) this.field4301.method448(0);
            }
        }
        var4.field2510 = arg0.method1261(true, arg2);
        var4.field4437 = true;
        var4.field4435 = false;
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 194)
    public final void method2043(byte arg0) {
        this.field4304 = true;
        int var2 = -52 / ((arg0 - 17) / 50);
        class43 var3 = this.field4301;
        synchronized (this.field4301) {
            this.field4301.notifyAll();
        }
        field4308++;
        try {
            this.field4309.join();
        } catch (InterruptedException var6) {
        }
        this.field4309 = null;
    }
}
