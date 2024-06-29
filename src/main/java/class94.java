import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class94 {

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2330 = 0;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lmb;")
    public static class84 field2332 = class79.method672(true, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lmb;")
    public static class84 field2329 = class79.method672(true, "Benutzername: ");

    @OriginalMember(owner = "client!o", name = "j", descriptor = "J")
    public static long field2334 = 0L;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Z")
    public static boolean field2335 = false;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lmb;")
    public static class84 field2328 = class79.method672(true, "blinken1:");

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field2339 = 0;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lmb;")
    private static class84 field2331 = class79.method672(true, "Enter amount:");

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lmb;")
    public static class84 field2326 = field2331;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lsd;")
    public static class122 field2327;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lge;")
    public static class47 field2333;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lia;")
    public static class57 field2340;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public static final void method789(boolean arg0) {
        field2337++;
        if (class88.field2209 != null) {
            class115 var1 = class88.field2209;
            synchronized (class88.field2209) {
                class88.field2209 = null;
            }
        }
        if (arg0) {
            method791(89, 77, 65, -87, false, 1);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
    public static final int method790(int arg0, int arg1) {
        field2338++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg1 != 36) {
            method791(-46, 103, -84, -23, true, -72);
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIZI)Lr;")
    public static final class112 method791(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2336++;
        long var6 = ((long) arg1 << 16) + ((long) arg3 << 40) + ((long) arg5 << 38) + (long) arg2;
        if (!arg4) {
            class112 var8 = (class112) class24.field564.method970(-27059, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class13 var9 = class98.method813(arg0 ^ 0x1, arg2);
        if (arg0 > ~arg1 && var9.field248 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field237[var11] <= arg1 && var9.field237[var11] != 0) {
                    var10 = var9.field248[var11];
                }
            }
            if (var10 != -1) {
                var9 = class98.method813(-1, var10);
            }
        }
        class26 var12 = var9.method73(1, (byte) -89);
        if (var12 == null) {
            return null;
        }
        class112 var13 = null;
        if (var9.field266 != -1) {
            var13 = method791(-2, 10, var9.field211, 0, true, 1);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class142.field3426;
        int var15 = class142.field3422;
        int var16 = class142.field3425;
        int var17 = class142.field3421;
        int var18 = class142.field3424;
        int var19 = class142.field3423;
        int var20 = class142.field3420;
        int[] var21 = class104.method868();
        int var22 = class104.field2524;
        int var23 = class104.field2519;
        class112 var24 = new class112(36, 32);
        class142.method1152(var24.field2691, 36, 32);
        class54.field1249 = class104.method860(class54.field1249);
        class142.method1151(0, 0, 36, 32, 0);
        class104.field2536 = false;
        class104.method872(16, 16);
        int var25 = var9.field218;
        if (arg4) {
            var25 = (int) ((double) var25 * 1.5D);
        } else if (arg5 == 2) {
            var25 = (int) ((double) var25 * 1.04D);
        }
        int var26 = class104.field2527[var9.field227] * var25 >> 16;
        int var27 = class104.field2520[var9.field227] * var25 >> 16;
        var12.method175();
        var12.method185(0, var9.field258, var9.field236, var9.field227, var9.field259, var12.field1668 / 2 + var27 + var9.field230, var26 - -var9.field230);
        if (arg5 >= 1) {
            var24.method907(1);
        }
        if (arg5 >= 2) {
            var24.method907(16777215);
        }
        if (arg3 != 0) {
            var24.method911(arg3);
        }
        class142.method1152(var24.field2691, 36, 32);
        if (var9.field266 != -1) {
            var13.method928(0, 0);
        }
        if (!arg4 && (var9.field257 == 1 || arg1 != 1) && arg1 != -1) {
            class39.field877.method205(class76.method652((byte) -107, arg1), 1, 10, 1);
            class39.field877.method205(class76.method652((byte) 67, arg1), 0, 9, 16776960);
        }
        if (!arg4) {
            class24.field564.method965(var24, 208, var6);
        }
        class142.method1152(var14, var15, var16);
        class142.method1162(var17, var18, var19, var20);
        class104.method860(var21);
        class104.field2519 = var23;
        class104.field2524 = var22;
        class104.method870();
        class104.field2536 = true;
        return var24;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method792(int arg0) {
        field2331 = null;
        field2329 = null;
        field2328 = null;
        if (arg0 != 16) {
            return;
        }
        field2332 = null;
        field2340 = null;
        field2333 = null;
        field2327 = null;
        field2326 = null;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static final void method793(int arg0) {
        class69.field1689.method1108((byte) -108);
        class60.field1486 = null;
        class58.field1453 = 1;
        field2325++;
        if (arg0 < 33) {
            method789(true);
        }
    }
}
