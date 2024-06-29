import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class158 extends class178 {

    @OriginalMember(owner = "client!p", name = "L", descriptor = "Lrb;")
    public class180 field2847;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "Loc;")
    public static class151 field2849 = class137.method873(2, "_");

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "[[[[Z")
    public static boolean[][][][] field2851;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljh;Ljh;I)V")
    public static final void method1032(class105 arg0, class105 arg1, int arg2) {
        if (arg2 >= -117) {
            method1036((byte) -80);
        }
        field2850++;
        if (class233.field4295) {
            class71.method473(arg0, (byte) 121, arg1);
            return;
        }
        if (class200.field3534 == 0 || class200.field3534 == 5) {
            byte var3 = 20;
            arg1.method1254(class156.field2830, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class221.method1374(230, var4, 304, 34, 9179409);
            class221.method1374(231, var4 + 1, 302, 32, 0);
            class221.method1375(232, var4 + 2, class123.field2209 * 3, 30, 9179409);
            class221.method1375(class123.field2209 * 3 + 232, var4 + 2, 300 - class123.field2209 * 3, 30, 0);
            arg1.method1254(class160.field2894, 382, 276 - var3, 16777215, -1);
        }
        if (class200.field3534 == 20) {
            class204.field3623.method229(382 - class204.field3623.field633 / 2, -(class204.field3623.field634 / 2) + 271);
            short var5 = 211;
            arg1.method1254(class160.field2895, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg1.method1254(class160.field2879, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg1.method1254(class160.field2873, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg1.method1256(class126.method761(new class151[] { class187.field3327, class201.method1278(class160.field2899) }, 10260), 272, var26, 16777215, 0);
            int var27 = var26 + 15;
            arg1.method1256(class126.method761(new class151[] { class69.field1354, class160.field2871.method971(false) }, 10260), 274, var27, 16777215, 0);
            int var28 = var27 + 15;
        }
        if (class200.field3534 == 10) {
            class204.field3623.method229(202, 171);
            if (class161.field2906 == 0) {
                short var6 = 302;
                short var7 = 291;
                short var8 = 251;
                arg1.method1254(class226.field3943, 382, var8, 16776960, 0);
                int var29 = var8 + 30;
                class116.field2086.method229(var6 - 73, var7 - 20);
                arg1.method1277(class144.field2602, var6 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class116.field2086.method229(var9 - 73, var7 - 20);
                arg1.method1277(class113.field2019, var9 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class161.field2906 == 2) {
                short var13 = 211;
                arg1.method1254(class160.field2895, 382, var13, 16776960, 0);
                short var14 = 302;
                short var15 = 321;
                int var34 = var13 + 15;
                arg1.method1254(class160.field2879, 382, var34, 16776960, 0);
                int var35 = var34 + 15;
                arg1.method1254(class160.field2873, 382, var35, 16776960, 0);
                boolean var16;
                if (class103.field1860 == 0 && class200.field3541 % 40 < 20 && class43.field879) {
                    var16 = true;
                } else {
                    var16 = false;
                }
                var34 = var35 + 15;
                var34 += 10;
                arg1.method1256(class126.method761(new class151[] { class187.field3327, class201.method1278(class160.field2899), var16 ? class69.field1356 : class160.field2876 }, 10260), 272, var34, 16777215, 0);
                var34 += 15;
                boolean var17;
                if (class103.field1860 == 1 && class200.field3541 % 40 < 20 && class43.field879) {
                    var17 = true;
                } else {
                    var17 = false;
                }
                arg1.method1256(class126.method761(new class151[] { class69.field1354, class160.field2871.method971(false), var17 ? class69.field1356 : class160.field2876 }, 10260), 274, var34, 16777215, 0);
                var34 += 15;
                class116.field2086.method229(var14 - 73, var15 + -20);
                arg1.method1254(class147.field2636, var14, var15 + 5, 16777215, 0);
                short var18 = 462;
                class116.field2086.method229(var18 - 73, var15 - 20);
                arg1.method1254(class205.field3634, var18, var15 + 5, 16777215, 0);
            } else if (class161.field2906 == 3) {
                arg1.method1254(class115.field2049, 382, 211, 16776960, 0);
                short var10 = 236;
                short var11 = 382;
                arg1.method1254(class163.field2955, 382, var10, 16777215, 0);
                short var12 = 321;
                int var30 = var10 + 15;
                arg1.method1254(class63.field1218, 382, var30, 16777215, 0);
                int var31 = var30 + 15;
                arg1.method1254(class115.field2039, 382, var31, 16777215, 0);
                int var32 = var31 + 15;
                arg1.method1254(class118.field2121, 382, var32, 16777215, 0);
                class116.field2086.method229(var11 - 73, var12 + -20);
                int var33 = var32 + 15;
                arg1.method1254(class205.field3634, var11, var12 + 5, 16777215, 0);
            }
        }
        if (class71.field1385 != 1) {
            if (class43.field882 > 0) {
                class113.method683(class43.field882, 27);
                class43.field882 = 0;
            }
            class25.method199(-1);
        }
        class9.field148[class13.field309 ? 1 : 0].method229(725, 463);
        if (class200.field3534 <= 5 || class159.field2869 == 2) {
            return;
        }
        if (class140.field2547 == null) {
            class140.field2547 = class94.method598(0, (byte) -13, class20.field442, class164.field2960);
        }
        if (class140.field2547 == null) {
            return;
        }
        byte var19 = 5;
        byte var20 = 100;
        short var21 = 463;
        class140.field2547.method229(var19, var21);
        byte var22 = 35;
        arg1.method1254(class126.method761(new class151[] { class1.field37, class179.field3248, class137.method874(class13.field296, false) }, 10260), var20 / 2 + var19, var22 / 2 - 2 + var21, 16777215, 0);
        if (class206.field3656 != null) {
            arg0.method1254(class235.field4333, var20 / 2 + var19, var21 - -(var22 / 2) + 12, 16777215, 0);
            return;
        }
        arg0.method1254(class31.field647, var20 / 2 + var19, var22 / 2 + var21 + 12, 16777215, 0);
        return;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public static final void method1033(int arg0) {
        field2848++;
        if (arg0 != 73) {
            method1033(-94);
        }
        class53.field1074.method1317((byte) -127);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
    public static final void method1034(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 118) {
            return;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class104.field1872[arg0][arg3 + var4][arg1 + var7] = 0;
            }
        }
        field2852++;
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class104.field1872[arg0][arg3][arg1 + var5] = class104.field1872[arg0][arg3 - 1][arg1 + var5];
            }
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class104.field1872[arg0][arg3 + var6][arg1] = class104.field1872[arg0][arg3 + var6][arg1 - 1];
            }
        }
        if (arg3 > 0 && class104.field1872[arg0][arg3 - 1][arg1] != 0) {
            class104.field1872[arg0][arg3][arg1] = class104.field1872[arg0][arg3 - 1][arg1];
        } else if (arg1 > 0 && class104.field1872[arg0][arg3][arg1 - 1] != 0) {
            class104.field1872[arg0][arg3][arg1] = class104.field1872[arg0][arg3][arg1 - 1];
        } else if (arg3 > 0 && arg1 > 0 && class104.field1872[arg0][arg3 - 1][arg1 - 1] != 0) {
            class104.field1872[arg0][arg3][arg1] = class104.field1872[arg0][arg3 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    public static final void method1035(int arg0) {
        if (class142.field2588 != null) {
            class142.field2588.method336(arg0 ^ 0xFFFFD87A);
            class142.field2588 = null;
        }
        class64.method429(-123);
        class224.method1409();
        field2846++;
        if (arg0 != 5298) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class95.field1768[var1].method886((byte) 122);
        }
        class117.method719((byte) -20);
        System.gc();
        class59.method396(2, 1);
        class149.field2669 = false;
        class12.field247 = -1;
        class102.method623(12051);
        class137.method871(10, (byte) 125);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    public static void method1036(byte arg0) {
        field2851 = null;
        field2849 = null;
        if (arg0 >= -93) {
            field2851 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLsd;Lsd;)V")
    public static final void method1037(boolean arg0, class192 arg1, class192 arg2) {
        if (arg0) {
            field2851 = null;
        }
        field2853++;
        class16.field389 = arg2;
        class215.field3758 = arg1;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lrb;)V")
    public class158(class180 arg0) {
        this.field2847 = arg0;
    }
}
