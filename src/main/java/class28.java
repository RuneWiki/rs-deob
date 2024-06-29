import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 {

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Lv;")
    public static class146 field591 = class159.method1226((byte) -37, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field588 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "J")
    public static volatile long field582 = 0L;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lv;")
    public static class146 field593 = class159.method1226((byte) -37, " ");

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field590 = 2;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "J")
    public static long field589;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Ldc;")
    public static class25 field587;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Ldd;")
    public static class26 field594;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[Lie;")
    public static class61[] field583;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIB)V")
    public static final void method193(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 113) {
            field593 = null;
        }
        field584++;
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class78.field1891[arg1][arg0 + var4][arg2 + var7] = 0;
            }
        }
        if (arg0 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class78.field1891[arg1][arg0][arg2 + var5] = class78.field1891[arg1][arg0 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class78.field1891[arg1][arg0 + var6][arg2] = class78.field1891[arg1][arg0 + var6][arg2 - 1];
            }
        }
        if (arg0 > 0 && class78.field1891[arg1][arg0 - 1][arg2] != 0) {
            class78.field1891[arg1][arg0][arg2] = class78.field1891[arg1][arg0 - 1][arg2];
        } else if (arg2 > 0 && class78.field1891[arg1][arg0][arg2 - 1] != 0) {
            class78.field1891[arg1][arg0][arg2] = class78.field1891[arg1][arg0][arg2 - 1];
        } else if (arg0 > 0 && arg2 > 0 && class78.field1891[arg1][arg0 - 1][arg2 - 1] != 0) {
            class78.field1891[arg1][arg0][arg2] = class78.field1891[arg1][arg0 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lwc;[B[Lna;III)V")
    public static final void method194(class156 arg0, byte[] arg1, class91[] arg2, int arg3, int arg4, int arg5) {
        field585++;
        if (arg4 <= 103) {
            field587 = null;
        }
        class95 var6 = new class95(arg1);
        int var7 = -1;
        while (true) {
            int var8 = var6.method759((byte) 123);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method759((byte) 125);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 >> 6 & 0x3F;
                int var14 = var6.method790((byte) 73);
                int var15 = var14 & 0x3;
                int var16 = arg3 + var13;
                int var17 = var14 >> 2;
                int var18 = var11 + arg5;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class91 var19 = null;
                    int var20 = var12;
                    if ((class74.field1772[1][var16][var18] & 0x2) == 2) {
                        var20 = var12 - 1;
                    }
                    if (var20 >= 0) {
                        var19 = arg2[var20];
                    }
                    class105.method855(var16, arg0, var19, -1, var18, var7, var15, var12, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
    public static final void method195(boolean arg0, int arg1) {
        field586++;
        class105.field2529 = arg0;
        if (arg1 != 15942) {
            method196(96, 125, 58, 123, 26, -93, 1, -53);
        }
        if (!class105.field2529) {
            int var25 = class29.field597.method795(1);
            int var26 = class29.field597.method784(false);
            int var27 = (class35.field815 - class29.field597.field2304) / 16;
            class57.field1286 = new int[var27][4];
            for (int var28 = 0; var28 < var27; var28++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class57.field1286[var28][var37] = class29.field597.method748(arg1 - 16042);
                }
            }
            int var29 = class29.field597.method784(false);
            int var30 = class29.field597.method787((byte) -43);
            boolean var31 = false;
            int var32 = class29.field597.method784(false);
            class113.field2643 = new int[var27];
            class126.field2915 = new int[var27];
            class116.field2716 = new int[var27];
            if ((var29 / 8 == 48 || var29 / 8 == 49) && (var25 / 8) == 48) {
                var31 = true;
            }
            class41.field928 = new byte[var27][];
            if (var29 / 8 == 48 && var25 / 8 == 148) {
                var31 = true;
            }
            class49.field1125 = new byte[var27][];
            int var33 = 0;
            for (int var34 = (var29 - 6) / 8; var34 <= (var29 + 6) / 8; var34++) {
                for (int var35 = (var25 - 6) / 8; var35 <= (var25 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var31 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class116.field2716[var33] = var36;
                        class113.field2643[var33] = class8.field163.method593(59, class71.method509(new class146[] { class150.field3471, class75.method564(false, var34), class157.field3628, class75.method564(false, var35) }, (byte) 71));
                        class126.field2915[var33] = class8.field163.method593(arg1 - 15892, class71.method509(new class146[] { class143.field3273, class75.method564(false, var34), class157.field3628, class75.method564(false, var35) }, (byte) 55));
                        var33++;
                    }
                }
            }
            class64.method464(var29, var32, 0, var30, var26, var25);
            return;
        }
        int var2 = class29.field597.method754((byte) -49);
        int var3 = class29.field597.method754((byte) -49);
        int var4 = class29.field597.method784(false);
        class29.field597.method267(75);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class29.field597.method262(86, 1);
                    if (var24 == 1) {
                        class58.field1297[var5][var22][var23] = class29.field597.method262(-117, 26);
                    } else {
                        class58.field1297[var5][var22][var23] = -1;
                    }
                }
            }
        }
        class29.field597.method260(arg1 - 15894);
        int var6 = (class35.field815 - class29.field597.field2304) / 16;
        class57.field1286 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class57.field1286[var7][var21] = class29.field597.method748(-76);
            }
        }
        int var8 = class29.field597.method789(-32769);
        int var9 = class29.field597.method754((byte) -49);
        class49.field1125 = new byte[var6][];
        class126.field2915 = new int[var6];
        class116.field2716 = new int[var6];
        class113.field2643 = new int[var6];
        class41.field928 = new byte[var6][];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class58.field1297[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class116.field2716[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            int var19 = var17 >> 8 & 0xFF;
                            class116.field2716[var10] = var17;
                            int var20 = var17 & 0xFF;
                            class113.field2643[var10] = class8.field163.method593(arg1 - 15875, class71.method509(new class146[] { class150.field3471, class75.method564(false, var19), class157.field3628, class75.method564(false, var20) }, (byte) -88));
                            class126.field2915[var10] = class8.field163.method593(100, class71.method509(new class146[] { class143.field3273, class75.method564(false, var19), class157.field3628, class75.method564(false, var20) }, (byte) -113));
                            var10++;
                        }
                    }
                }
            }
        }
        class64.method464(var3, var9, arg1 - 15942, var8, var2, var4);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field592++;
        if (class54.method365(29657, arg3)) {
            class5.method38(-1, arg0, 0, arg4, arg2, class34.field736[arg3], arg6, arg5, arg1);
            if (arg7 > -77) {
                method193(109, -74, 6, (byte) 28);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method197(byte arg0) {
        field583 = null;
        field593 = null;
        field594 = null;
        if (arg0 != 37) {
            field590 = 53;
        }
        field591 = null;
        field587 = null;
    }
}
