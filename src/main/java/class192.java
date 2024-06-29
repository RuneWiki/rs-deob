import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class192 extends class262 {

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "Ljava/lang/Object;")
    private Object field2674;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field2671 = 0;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "Z")
    public static boolean field2665 = false;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "Z")
    public static boolean field2667;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lc;Ljava/lang/Object;)V")
    public class192(class100 arg0, Object arg1) {
        super(arg0);
        this.field2674 = arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lqj;ILqj;)V")
    public static final void method1270(class296 arg0, int arg1, class296 arg2) {
        if (arg1 >= -70) {
            method1274((byte) -44, false);
        }
        field2666++;
        class446.field6438 = arg2;
        class250.field3463 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1271(byte arg0) {
        field2672++;
        if (arg0 != -98) {
            method1276(16, 13, 51, -41);
        }
        return this.field2674;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
    public static final void method1272(int arg0, int arg1) {
        field2669++;
        if (arg0 == -1 || !class270.field3678[arg0]) {
            return;
        }
        class120.field1700.method1894(23740, arg0);
        if (class333.field4511[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 <= 124) {
            field2665 = true;
        }
        for (int var3 = 0; var3 < class333.field4511[arg0].length; var3++) {
            if (class333.field4511[arg0][var3] != null) {
                if (class333.field4511[arg0][var3].field5488 == 2) {
                    var2 = false;
                } else {
                    class333.field4511[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class333.field4511[arg0] = null;
        }
        class270.field3678[arg0] = false;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(B)Z")
    public final boolean method1273(byte arg0) {
        if (arg0 <= 88) {
            field2665 = true;
        }
        field2668++;
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)I")
    public static final int method1274(byte arg0, boolean arg1) {
        if (arg0 <= 21) {
            field2671 = -67;
        }
        field2675++;
        long var2 = class224.method1425(-26805);
        for (class322 var4 = arg1 ? (class322) class341.field4756.method1413(30381) : (class322) class341.field4756.method1420((byte) 58); var4 != null; var4 = (class322) class341.field4756.method1420((byte) -38)) {
            if (var2 > (var4.field4417 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field4417 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field5363;
                    class447.field6439[var5] = class300.field4147[var5];
                    var4.method2459(198);
                    return var5;
                }
                var4.method2459(198);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLjava/lang/String;Lqj;I)Laf;")
    public static final class249 method1275(boolean arg0, String arg1, class296 arg2, int arg3) {
        field2673++;
        int var4 = arg2.method1914(-1, arg1);
        if (var4 == -1) {
            return new class249(0);
        }
        int[] var5 = arg2.method1912(var4, 18197);
        class249 var6 = new class249(var5.length);
        if (arg3 > -43) {
            method1276(-20, -58, 83, 54);
        }
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field3449 > var7) {
                class371 var9 = new class371(arg2.method1920(var5[var8++], false, var4));
                int var10 = var9.method2413((byte) -30);
                int var11 = var9.method2403((byte) 113);
                int var12 = var9.method2429(0);
                if (!arg0 && var12 == 1) {
                    var6.field3449--;
                } else {
                    var6.field3443[var7] = var10;
                    var6.field3444[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V")
    public static final void method1276(int arg0, int arg1, int arg2, int arg3) {
        field2670++;
        if (class5.field79 == null) {
            return;
        }
        long var4 = (long) (arg1 | arg2 << 28 | arg3 << 14);
        if (arg0 != -18330) {
            method1270((class296) null, 78, (class296) null);
        }
        class26 var6 = (class26) class272.field3718.method1412((byte) -54, var4);
        if (var6 == null) {
            class357.method2306(arg2, arg1, arg3);
            return;
        }
        class210 var7 = (class210) var6.field423.method1312((byte) 25);
        if (var7 == null) {
            class357.method2306(arg2, arg1, arg3);
            return;
        }
        class166 var8 = (class166) class357.method2306(arg2, arg1, arg3);
        if (var8 == null) {
            var8 = new class166();
        } else {
            var8.field2366 = var8.field2363 = -1;
        }
        var8.field2364 = var7.field2827;
        var8.field2371 = var7.field2829;
        label48: while (true) {
            class210 var9 = (class210) var6.field423.method1304(-60);
            if (var9 == null) {
                break;
            }
            if (var8.field2371 != var9.field2829) {
                var8.field2366 = var9.field2829;
                var8.field2370 = var9.field2827;
                while (true) {
                    class210 var10 = (class210) var6.field423.method1304(-43);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field2371 != var10.field2829 && var8.field2366 != var10.field2829) {
                        var8.field2363 = var10.field2829;
                        var8.field2367 = var10.field2827;
                    }
                }
            }
        }
        int var11 = class279.method1698((arg1 << 7) + 64, (arg3 << 7) - -64, arg2, (byte) 3);
        class451.method2823(arg2, arg1, arg3, var11, var8);
    }
}
