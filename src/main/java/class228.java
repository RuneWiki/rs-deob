import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class228 extends class715 {

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "[I")
    public static int[] field3261 = new int[16];

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lqaa;")
    public static class27 field3252 = new class27(32, 4);

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "F")
    public static float field3258;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public final void method689(int arg0) {
        int var2 = -63 % ((-71 - arg0) / 42);
        ++field3257;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lgt;)V")
    public class228(class453 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Z")
    public final boolean method690(byte arg0) {
        if (arg0 != -3) {
            field3258 = -1.3891867F;
        }
        ++field3254;
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
    public static final void method1567(byte arg0) {
        ++field3262;
        if (class323.field4588 != -1 && class84.field1533 != -1) {
            int var1 = ((-class395.field5535 + class638.field9103) * class148.field2256 >> 16) + class395.field5535;
            class148.field2256 += var1;
            if (class148.field2256 < 65535) {
                class182.field2605 = false;
                class402.field5621 = false;
            } else {
                if (!class182.field2605) {
                    class402.field5621 = true;
                } else {
                    class402.field5621 = false;
                }
                class148.field2256 = 65535;
                class182.field2605 = true;
            }
            float var2 = (float) class148.field2256 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class2.field20 * 2;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class756.field10528[class323.field4588][var4][var5] * 3;
                int var22 = class756.field10528[class323.field4588][var4 - -1][var5] * 3;
                int var23 = (class756.field10528[class323.field4588][var4 + 2][var5] - (class756.field10528[class323.field4588][var4 + 3][var5] - class756.field10528[class323.field4588][var4 + 2][var5])) * 3;
                int var24 = class756.field10528[class323.field4588][var4][var5];
                int var25 = -var21 + var22;
                int var26 = -(var22 * 2) + var23 + var21;
                int var27 = -var23 + var22 + class756.field10528[class323.field4588][var4 + 2][var5] + -var24;
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class685.field9660 = (int) var3[0] + -(class115.field1845 * 512);
            class136.field2118 = (int) var3[1] * -1;
            class260.field3810 = (int) var3[2] + -(class64.field1160 * 512);
            float[] var6 = new float[3];
            int var7 = class678.field9561 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var14 = class756.field10528[class84.field1533][var7][var8] * 3;
                int var15 = class756.field10528[class84.field1533][var7 + 1][var8] * 3;
                int var16 = (class756.field10528[class84.field1533][var7 + 2][var8] - (class756.field10528[class84.field1533][var7 - -3][var8] + -class756.field10528[class84.field1533][var7 + 2][var8])) * 3;
                int var17 = class756.field10528[class84.field1533][var7][var8];
                int var18 = var15 - var14;
                int var19 = -(var15 * 2) + var16 + var14;
                int var20 = class756.field10528[class84.field1533][var7 + 2][var8] - (-var15 + var16) + -var17;
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            float var9 = var6[0] - var3[0];
            float var10 = (var6[1] + -var3[1]) * -1.0F;
            if (arg0 < -31) {
                float var11 = var6[2] + -var3[2];
                double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
                class694.field9754 = (int) (2607.5945876176133D * Math.atan2((double) var10, var12)) & 16383;
                class239.field3371 = 16383 & (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D);
                class717.field10039 = ((class756.field10528[class323.field4588][var4 + 2][3] - class756.field10528[class323.field4588][var4][3]) * class148.field2256 >> 16) + class756.field10528[class323.field4588][var4][3];
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    public static final void method1568(int arg0) {
        ++field3263;
        int var1 = class644.field9146.method253(-13900);
        if (arg0 <= 119) {
            field3261 = null;
        }
        boolean var2 = class644.field9146.method236(115) == 1;
        int var3 = class644.field9146.method280((byte) -43);
        class564.field7978 = class644.field9146.method273(255);
        int var4 = class644.field9146.method236(124);
        class399.method2471((byte) -26);
        class414.method2519(var4, 9349);
        class644.field9146.method2688((byte) 3);
        for (int var5 = 0; ~var5 > -5; ++var5) {
            for (int var20 = 0; class174.field2540 >> 3 > var20; ++var20) {
                for (int var21 = 0; ~(class716.field9999 >> 3) < ~var21; ++var21) {
                    int var22 = class644.field9146.method2686(-9380, 1);
                    if (~var22 == -2) {
                        class247.field3464[var5][var20][var21] = class644.field9146.method2686(-9380, 26);
                    } else {
                        class247.field3464[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class644.field9146.method2684(true);
        int var6 = (-class644.field9146.field469 + class374.field5243) / 16;
        class35.field463 = new int[var6][4];
        for (int var7 = 0; var6 > var7; ++var7) {
            for (int var19 = 0; var19 < 4; ++var19) {
                class35.field463[var7][var19] = class644.field9146.method234((byte) -120);
            }
        }
        class68.field1233 = new int[var6];
        class697.field9800 = null;
        class390.field5453 = new int[var6];
        class493.field7032 = null;
        class412.field5705 = new int[var6];
        class190.field2743 = new byte[var6][];
        class430.field6023 = new byte[var6][];
        class109.field1777 = new int[var6];
        class190.field2739 = new byte[var6][];
        class630.field9040 = new byte[var6][];
        class561.field7959 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; ++var9) {
            for (int var10 = 0; ~var10 > ~(class174.field2540 >> 3); ++var10) {
                for (int var11 = 0; var11 < class716.field9999 >> 3; ++var11) {
                    int var12 = class247.field3464[var9][var10][var11];
                    if (~var12 != 0) {
                        int var13 = (var12 & 16772648) >> 14;
                        int var14 = (16376 & var12) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; ++var16) {
                            if (~class412.field5705[var16] == ~var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class412.field5705[var8] = var15;
                            int var17 = (65477 & var15) >> 8;
                            int var18 = var15 & 255;
                            class561.field7959[var8] = class391.field5460.method1482(-1, "m" + var17 + "_" + var18);
                            class68.field1233[var8] = class391.field5460.method1482(-1, "l" + var17 + "_" + var18);
                            class390.field5453[var8] = class391.field5460.method1482(-1, "um" + var17 + "_" + var18);
                            class109.field1777[var8] = class391.field5460.method1482(-1, "ul" + var17 + "_" + var18);
                            ++var8;
                        }
                    }
                }
            }
        }
        class68.method709(var2, var3, -1, 11, var1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILdu;I)V")
    public final void method693(int arg0, class355 arg1, int arg2) {
        ++field3259;
        int var4 = -128 % ((arg0 - 31) / 50);
        super.field9979.method2732(-83, arg1);
        super.field9979.method2721(arg2, true);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(Z)V")
    public static void method1569(boolean arg0) {
        if (!arg0) {
            field3252 = null;
            field3261 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BZ)V")
    public final void method686(byte arg0, boolean arg1) {
        if (arg0 < -105) {
            ++field3253;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
    public final void method691(boolean arg0, int arg1) {
        if (arg1 != 4) {
            field3252 = null;
        }
        ++field3256;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)I")
    public static final int method1570(byte arg0) {
        ++field3255;
        if (arg0 != 73) {
            field3252 = null;
        }
        return class435.field6079 == 1 ? class591.field8302 : 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        ++field3260;
        if (arg1 != 1782) {
            this.method691(true, -55);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Z")
    public static final boolean method1571(byte arg0, int arg1) {
        if (arg0 <= 115) {
            return false;
        } else {
            ++field3251;
            return ~arg1 <= -13 && ~arg1 >= -18;
        }
    }
}
