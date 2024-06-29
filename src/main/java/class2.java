import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class2 {

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lwc;")
    private class232 field22;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lqe;")
    public static class168 field12 = class66.method448(" zuerst von Ihrer Ignorieren)2Liste(Q", -115);

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "J")
    public static long field18;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Loe;")
    public static class256 field17;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILqe;)V")
    public static final void method7(int arg0, class168 arg1) {
        field10++;
        if (class29.field356 >= 2) {
            if (arg1.method1106(-70, class4.field44)) {
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class229.method1475(null, class50.method347(2, new class168[] { class4.field46, class128.method867((byte) 82, var4), class107.field1715 }), -1, 0);
            }
            if (arg1.method1106(-103, class155.field2712)) {
                class230.method1489(128);
            }
            if (arg1.method1106(-25, class197.field3410)) {
                class84.method555(5, 25);
            }
            if (arg1.method1106(-100, class252.field4364)) {
                class70.field1028 = true;
            }
            if (arg1.method1106(-64, class149.field2594)) {
                class70.field1028 = false;
            }
            if (arg1.method1106(-69, class173.field3000)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class169.field2951[var5].field731[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1095(class96.field1505, true) && class23.field277 != 0) {
                class238.method1551(arg1.method1120(6, 37).method1085((byte) -109), -118);
            }
            if (arg1.method1106(-65, class162.field2779) && class23.field277 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1095(class162.field2782, true)) {
                class93.field1462 = arg1.method1120(12, 37).method1086((byte) -124).method1085((byte) -109);
                class229.method1475(null, class50.method347(2, new class168[] { class92.field1436, class128.method867((byte) 124, class93.field1462) }), -1, 0);
            }
            if (arg1.method1106(-94, class82.field1241)) {
                class125.field2051 = true;
            }
        }
        if (arg0 >= 30) {
            class87.field1348.method672(84, 238);
            class137.field2423++;
            class87.field1348.method768(arg1.method1109((byte) 126) - 1, 7295);
            class87.field1348.method721(arg1.method1120(2, 93), true);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(JB)V")
    public final void method8(long arg0, byte arg1) {
        if (arg1 <= -82) {
            this.field22.method1494(arg0, 21529);
            field25++;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class174.field3055 <= arg6 && arg2 <= class249.field4314 && class222.field3811 <= arg1 && arg3 <= class196.field3402) {
            if (arg4 == 1) {
                class169.method1122(arg0 ^ 0xFFFF9316, arg3, arg2, arg5, arg1, arg6);
            } else {
                class42.method281(-90, arg1, arg6, arg4, arg2, arg3, arg5);
            }
        } else if (arg4 == 1) {
            class198.method1271(-92, arg3, arg2, arg1, arg5, arg6);
        } else {
            class106.method698(arg4, arg6, arg2, arg3, false, arg5, arg1);
        }
        field14++;
        if (arg0 != 1) {
            field17 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJ)Lqf;")
    public final class13 method10(int arg0, long arg1) {
        field15++;
        class165 var4 = (class165) this.field22.method1499(0, arg1);
        if (arg0 == -22553) {
            return var4 == null ? null : var4.field2812;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lqf;JI)V")
    public final void method11(class13 arg0, long arg1, int arg2) {
        if (arg2 != 25) {
            field18 = 9L;
        }
        field13++;
        this.field22.method1502((byte) -18, new class165(arg0), arg1);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Lsj;")
    public static final class36 method12(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class36 var4 = var3.field3114;
            var3.field3114 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method13(int arg0) {
        field12 = null;
        if (arg0 == -104) {
            field17 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public final void method14(boolean arg0) {
        this.field22.method1497((byte) 109);
        field16++;
        if (arg0) {
            method13(123);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method15(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg1 + arg7;
        field24++;
        int var9 = arg6 - arg7;
        int var10 = arg5 + arg7;
        int var11 = arg3 - arg7;
        for (int var12 = arg1; var12 < var8; var12++) {
            class232.method1501(arg4, arg5, (byte) -108, class241.field4117[var12], arg3);
        }
        for (int var13 = arg6; var13 > var9; var13--) {
            class232.method1501(arg4, arg5, (byte) -108, class241.field4117[var13], arg3);
        }
        if (arg0 != 113) {
            field12 = null;
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class241.field4117[var14];
            class232.method1501(arg4, arg5, (byte) -108, var15, var10);
            class232.method1501(arg2, var10, (byte) -108, var15, var11);
            class232.method1501(arg4, var11, (byte) -108, var15, arg3);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static final void method16(byte arg0) {
        field11++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class109.field1748 - 1; var2++) {
                if (class51.field701[var2] < 1000 && class51.field701[var2 + 1] > 1000) {
                    var1 = false;
                    class168 var3 = class125.field2052[var2];
                    class125.field2052[var2] = class125.field2052[var2 + 1];
                    class125.field2052[var2 + 1] = var3;
                    class168 var4 = class151.field2640[var2];
                    class151.field2640[var2] = class151.field2640[var2 + 1];
                    class151.field2640[var2 + 1] = var4;
                    int var5 = class228.field3876[var2];
                    class228.field3876[var2] = class228.field3876[var2 + 1];
                    class228.field3876[var2 + 1] = var5;
                    int var6 = class35.field436[var2];
                    class35.field436[var2] = class35.field436[var2 + 1];
                    class35.field436[var2 + 1] = var6;
                    short var7 = class51.field701[var2];
                    class51.field701[var2] = class51.field701[var2 + 1];
                    class51.field701[var2 + 1] = var7;
                    long var8 = class3.field40[var2];
                    class3.field40[var2] = class3.field40[var2 + 1];
                    class3.field40[var2 + 1] = var8;
                }
            }
        }
        if (arg0 != -69) {
            method16((byte) 84);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
    public class2(int arg0) {
        this.field22 = new class232(arg0);
    }
}
