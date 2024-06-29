import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class107 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[I")
    public static int[] field1765 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1767 = 0;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lp;")
    public static class280 field1773 = class18.method140((byte) -125, ":allyreq:");

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Z")
    public static boolean field1775 = false;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lp;")
    private static class280 field1766 = class18.method140((byte) -123, "Loading world list data");

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lp;")
    public static class280 field1774 = field1766;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Ltg;")
    public static class180 field1769;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
    public static final void method745(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class162.method1151(arg2 + arg1, arg3, 126, arg2 - arg1, class91.field1484[arg0]);
        int var5 = arg1;
        int var6 = -arg1;
        int var7 = -1;
        field1772++;
        int var8 = arg4;
        while (var8 < var5) {
            var7 += 2;
            var8++;
            var6 += var7;
            if (var6 >= 0) {
                var5--;
                var6 -= var5 << 1;
                int var9 = arg2 + var8;
                int[] var10 = class91.field1484[arg0 - var5];
                int var11 = arg2 - var8;
                int[] var12 = class91.field1484[arg0 + var5];
                class162.method1151(var9, arg3, 106, var11, var12);
                class162.method1151(var9, arg3, -74, var11, var10);
            }
            int var13 = arg2 + var5;
            int var14 = arg2 - var5;
            int[] var15 = class91.field1484[arg0 - var8];
            int[] var16 = class91.field1484[arg0 + var8];
            class162.method1151(var13, arg3, 6, var14, var16);
            class162.method1151(var13, arg3, -2, var14, var15);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method746(int arg0) {
        field1773 = null;
        field1766 = null;
        field1774 = null;
        if (arg0 > -32) {
            method747(-100);
        }
        field1769 = null;
        field1765 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Llj;")
    public static final class25 method747(int arg0) {
        field1771++;
        class25 var1 = new class25(34);
        var1.method227(arg0 - 20435, 11);
        var1.method227(-20435, class120.field2126);
        var1.method227(arg0 ^ 0xFFFFB02D, class92.field1501 ? 1 : 0);
        var1.method227(-20435, class140.field2430 ? 1 : 0);
        var1.method227(-20435, class12.field252 ? 1 : 0);
        var1.method227(arg0 - 20435, class83.field1376 ? 1 : 0);
        var1.method227(-20435, class160.field2810 ? 1 : 0);
        var1.method227(-20435, class2.field80 ? 1 : 0);
        var1.method227(arg0 - 20435, class81.field1332 ? 1 : 0);
        var1.method227(-20435, class215.field3720 ? 1 : 0);
        var1.method227(-20435, class17.field316);
        var1.method227(arg0 ^ 0xFFFFB02D, class273.field4754 ? 1 : 0);
        var1.method227(-20435, class183.field3219 ? 1 : 0);
        var1.method227(arg0 - 20435, class3.field101 ? 1 : 0);
        var1.method227(-20435, class9.field190);
        var1.method227(-20435, class157.field2752 ? 1 : 0);
        var1.method227(-20435, class261.field4617);
        var1.method227(arg0 - 20435, class188.field3307);
        var1.method227(-20435, class54.field892);
        var1.method214(-3, class175.field3029);
        var1.method214(-3, class222.field3854);
        var1.method227(-20435, class95.method669());
        var1.method231(11510, class64.field1053);
        var1.method227(arg0 - 20435, class98.field1573);
        var1.method227(arg0 - 20435, class242.field4247 ? 1 : 0);
        var1.method227(arg0 - 20435, class185.field3267 ? 1 : 0);
        var1.method227(-20435, class50.field817);
        var1.method227(arg0 - 20435, class9.field193 ? 1 : 0);
        var1.method227(-20435, class190.field3332 ? 1 : 0);
        return arg0 == 0 ? var1 : null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lrk;III)V")
    public static final void method748(class265 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class57.field928) {
            class162 var4 = class220.field3787[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2839 != null && var4.field2839.field4301.method825()) {
                arg0.method827(var4.field2839.field4301, 128, 0, 0, true);
            }
        }
        if (arg3 < class57.field928) {
            class162 var5 = class220.field3787[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2839 != null && var5.field2839.field4301.method825()) {
                arg0.method827(var5.field2839.field4301, 0, 0, 128, true);
            }
        }
        if (arg2 < class57.field928 && arg3 < class86.field1411) {
            class162 var6 = class220.field3787[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2839 != null && var6.field2839.field4301.method825()) {
                arg0.method827(var6.field2839.field4301, 128, 0, 128, true);
            }
        }
        if (arg2 < class57.field928 && arg3 > 0) {
            class162 var7 = class220.field3787[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2839 != null && var7.field2839.field4301.method825()) {
                arg0.method827(var7.field2839.field4301, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(JI)V")
    public static final void method749(long arg0, int arg1) {
        field1770++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class208.field3590 < 100 || class215.field3711) || class208.field3590 >= 200) {
            class188.method1312(-1117075764, 0, class229.field3959, class185.field3256);
            return;
        }
        class280 var3 = class152.method1071(-82, arg0).method1881((byte) 125);
        for (int var4 = 0; var4 < class208.field3590; var4++) {
            if (class49.field794[var4] == arg0) {
                class188.method1312(-1117075764, 0, class229.field3959, class30.method266(new class280[] { var3, class203.field3535 }, (byte) -87));
                return;
            }
        }
        for (int var5 = 0; var5 < class273.field4753; var5++) {
            if (class76.field1248[var5] == arg0) {
                class188.method1312(-1117075764, 0, class229.field3959, class30.method266(new class280[] { class226.field3905, var3, class60.field965 }, (byte) -87));
                return;
            }
        }
        if (var3.method1888(class262.field4631.field2458, arg1 ^ 0xFFFFF47C)) {
            class188.method1312(-1117075764, 0, class229.field3959, class219.field3745);
            return;
        }
        class123.field2162++;
        class129.field2236[class208.field3590] = var3;
        class49.field794[class208.field3590] = arg0;
        class50.field826[class208.field3590] = 0;
        class30.field571[class208.field3590] = class229.field3959;
        if (arg1 != -28596) {
            field1769 = null;
        }
        class200.field3497[class208.field3590] = 0;
        class158.field2757[class208.field3590] = false;
        class208.field3590++;
        class259.field4597 = class237.field4118;
        class34.field627.method551(1, true);
        class34.field627.method219(arg0, arg1 ^ 0x6FC6);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Llj;B)V")
    public static final void method750(class25 arg0, byte arg1) {
        if (arg1 <= 66) {
            method749(50L, -93);
        }
        field1768++;
        while (true) {
            while (arg0.field481 < arg0.field475.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method189((byte) -103) == 1) {
                    var3 = arg0.method189((byte) -103);
                    var2 = true;
                    var4 = arg0.method189((byte) -103);
                }
                int var5 = arg0.method189((byte) -103);
                int var6 = arg0.method189((byte) -103);
                int var7 = class74.field1222 - (var6 * 64 + 1 - class243.field4268);
                int var8 = var5 * 64 - class113.field2023;
                if (var8 >= 0 && (var7 - 63) >= 0 && (var8 + 63) < class47.field779 && var7 < class74.field1222) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < var3 * 8 + 8 && var12 >= (var4 * 8) && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method200(32768);
                                if (var13 != 0) {
                                    if (class74.field1236[var9][var10] == null) {
                                        class74.field1236[var9][var10] = new byte[4096];
                                    }
                                    class74.field1236[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method200(32768);
                                    if (class113.field2029[var9][var10] == null) {
                                        class113.field2029[var9][var10] = new byte[4096];
                                    }
                                    class113.field2029[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method200(32768);
                        if (var16 != 0) {
                            arg0.field481++;
                        }
                    }
                }
            }
            return;
        }
    }
}
