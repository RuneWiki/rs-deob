import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class395 implements Runnable {

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "Lbo;")
    private class355 field5535 = new class355();

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "Z")
    private boolean field5542 = false;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public int field5541 = 0;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field5538;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "Z")
    public static boolean field5525 = false;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5530 = new Rectangle[100];

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5534;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field5530[var0] = new Rectangle();
        }
        field5540 = -1;
        field5539 = 0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lan;BI)Lej;", line = 15)
    public final class74 method2427(class377 arg0, byte arg1, int arg2) {
        if (arg1 != 122) {
            return null;
        }
        field5526++;
        class74 var4 = new class74();
        var4.field1374 = false;
        var4.field3984 = (long) arg2;
        var4.field1106 = 3;
        var4.field1112 = arg0;
        this.method2432(-33, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 33)
    public final void method2428(int arg0) {
        this.field5542 = true;
        field5537++;
        class355 var2 = this.field5535;
        synchronized (this.field5535) {
            int var3 = -22 % ((arg0 + 26) / 57);
            this.field5535.notifyAll();
        }
        try {
            this.field5538.join();
        } catch (InterruptedException var4) {
        }
        this.field5538 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLrl;)V", line = 53)
    public static final void method2429(byte arg0, class264 arg1) {
        if (arg0 != -26) {
            field5530 = null;
        }
        field5531++;
        arg1.field3547 = null;
        if (class183.field2661 < 20) {
            class394.field5513.method901(false, arg1);
            class183.field2661++;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILan;[B)Lej;", line = 76)
    public final class74 method2430(int arg0, int arg1, class377 arg2, byte[] arg3) {
        field5536++;
        if (arg0 < 83) {
            method2435(true);
        }
        class74 var5 = new class74();
        var5.field1113 = arg3;
        var5.field1112 = arg2;
        var5.field1106 = 2;
        var5.field1374 = false;
        var5.field3984 = (long) arg1;
        this.method2432(-32, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V", line = 95)
    public static void method2431(int arg0) {
        field5534 = null;
        if (arg0 >= -3) {
            method2435(true);
        }
        field5530 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILej;)V", line = 118)
    private final void method2432(int arg0, class74 arg1) {
        class355 var3 = this.field5535;
        synchronized (this.field5535) {
            this.field5535.method2244(11310, arg1);
            this.field5541++;
            this.field5535.notifyAll();
        }
        field5533++;
        int var4 = -16 % ((arg0 - 90) / 32);
    }

    @OriginalMember(owner = "client!ps", name = "run", descriptor = "()V", line = 135)
    public final void run() {
        while (!this.field5542) {
            class355 var1 = this.field5535;
            class74 var2;
            synchronized (this.field5535) {
                var2 = (class74) this.field5535.method2243(0);
                if (var2 == null) {
                    try {
                        this.field5535.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5541--;
            }
            try {
                if (var2.field1106 == 2) {
                    var2.field1112.method2355(2, var2.field1113, (int) var2.field3984, var2.field1113.length);
                } else if (var2.field1106 == 3) {
                    var2.field1113 = var2.field1112.method2353((int) var2.field3984, -14608);
                }
            } catch (Exception var6) {
                class380.method2365(-2, (String) null, var6);
            }
            var2.field1384 = false;
        }
        field5528++;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lbd;)V", line = 313)
    public class395(class304 arg0) {
        class242 var2 = arg0.method1950(109, 5, this);
        while (var2.field3345 == 0) {
            class229.method1541(83, 10L);
        }
        if (var2.field3345 == 2) {
            throw new RuntimeException();
        }
        this.field5538 = (Thread) var2.field3341;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lbi;IIIIIII)V", line = 182)
    public static final void method2433(class139 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5527++;
        if (arg0.field2023 == 2) {
            int var8 = 99999;
            int var9 = 0;
            int var10 = 0;
            for (int var11 = 0; var11 < arg0.field2020; var11++) {
                for (int var12 = 0; var12 < arg0.field1956; var12++) {
                    int var13 = (arg0.field2056 + 32) * var12 + arg3;
                    int var14 = (arg0.field1966 + 32) * var11 + arg6;
                    if (var10 < 20) {
                        var14 += arg0.field2025[var10];
                        var13 += arg0.field2033[var10];
                    }
                    if (arg0.field2101[var10] > 0 && ((var13 + 32) > arg1 && var13 < arg2 && (var14 + 32) > arg7 && var14 < arg4 || class94.field1370 == arg0 && class298.field4015 == var10)) {
                        if (var10 > var9) {
                            var9 = var10;
                        }
                        if (var8 > var10) {
                            var8 = var10;
                        }
                    }
                    var10++;
                }
            }
            class393.method2423((byte) 112, class249.field3415, var9, var8, arg0);
        } else if (arg0.field2023 == 5 && arg0.field2034 != -1) {
            class156.method1195(arg0, class249.field3415, arg5 + 3997);
        }
        if (arg5 != -21) {
            method2431(-8);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lan;II)Lej;", line = 252)
    public final class74 method2434(class377 arg0, int arg1, int arg2) {
        field5529++;
        class74 var4 = new class74();
        var4.field1106 = 1;
        class355 var5 = this.field5535;
        synchronized (this.field5535) {
            if (arg1 != -16151) {
                method2435(true);
            }
            class74 var6 = (class74) this.field5535.method2234(9700);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field3984 && var6.field1112 == arg0 && var6.field1106 == 2) {
                    var4.field1113 = var6.field1113;
                    var4.field1384 = false;
                    return var4;
                }
                var6 = (class74) this.field5535.method2237((byte) 58);
            }
        }
        var4.field1113 = arg0.method2353(arg2, -14608);
        var4.field1374 = true;
        var4.field1384 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V", line = 287)
    public static final void method2435(boolean arg0) {
        field5524++;
        class284.field3805.method2539(50);
        if (!arg0) {
            field5534 = null;
        }
    }
}
