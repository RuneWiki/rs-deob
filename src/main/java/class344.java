import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class344 extends class220 {

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "[S")
    private short[] field5038 = new short[257];

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    private int field5048 = 0;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "[I")
    public static int[] field5046 = new int[128];

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field5039 = 999999;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "Lrc;")
    public static class100 field5041;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Ljava/lang/String;")
    public static String field5042;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "[I")
    private int[] field5040;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "[I")
    private int[] field5045;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "[[I")
    private int[][] field5055;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
    public static final void method2265(int arg0) {
        if (class439.field6431 >= arg0) {
            long var1 = class55.method375(-3913);
            class439.field6431 = (int) ((long) class439.field6431 - (-class275.field4037 + var1));
            if (class439.field6431 > 0) {
                int var3 = (class439.field6431 << 8) / class263.field3835;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = -var5 + 1.0F;
                class297.field4273 = ((class411.field6156 & 65280) * var3 - -((65280 & class161.field2109.field3809) * var4) & 16711680) + ((16711935 & class411.field6156) * var3 + (class161.field2109.field3809 & 16711935) * var4 & -16711936) >>> 8;
                class203.field2939 = (-class404.field6008 + class161.field2109.field3826) * var6 + class404.field6008;
                class199.field2838 = (class161.field2109.field3817 - class371.field5516) * var6 + class371.field5516;
                class425.field6313 = (class161.field2109.field3825 - class94.field1288) * var6 + class94.field1288;
                class246.field3429 = (class161.field2109.field3824 - class108.field1488) * var6 + class108.field1488;
                class336.field4960 = ((class154.field2017 & 65280) * var3 + (class161.field2109.field3816 & 65280) * var4 & 16711680) + ((class154.field2017 & 16711935) * var3 + (16711935 & class161.field2109.field3816) * var4 & -16711936) >>> 8;
                class381.field5713 = (class161.field2109.field3821 - class137.field1813) * var6 + class137.field1813;
                class274.field4031 = (class161.field2109.field3815 - class171.field2253) * var6 + class171.field2253;
                class41.field643 = class249.field3627 * var3 + class161.field2109.field3818 * var4 >> 8;
                if (class390.field5849 != class161.field2109.field3810) {
                    class273.field4010 = class24.field417.method2027(class390.field5849, class161.field2109.field3810, var6, class273.field4010);
                }
            } else {
                class297.field4273 = class161.field2109.field3809;
                class273.field4010 = class161.field2109.field3810;
                class203.field2939 = class161.field2109.field3826;
                class246.field3429 = class161.field2109.field3824;
                class439.field6431 = -1;
                class425.field6313 = class161.field2109.field3825;
                class381.field5713 = class161.field2109.field3821;
                class336.field4960 = class161.field2109.field3816;
                class274.field4031 = class161.field2109.field3815;
                class41.field643 = class161.field2109.field3818;
                class199.field2838 = class161.field2109.field3817;
            }
            class275.field4037 = var1;
        }
        ++field5050;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
    private final void method2266(int arg0) {
        ++field5051;
        if (arg0 == 754461868) {
            int[] var2 = this.field5055[0];
            int[] var3 = this.field5055[1];
            int[] var4 = this.field5055[this.field5055.length + -2];
            int[] var5 = this.field5055[this.field5055.length + -1];
            this.field5040 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
            this.field5045 = new int[] { var4[0] - var5[0] + var4[0], var4[1] - (var5[1] + -var4[1]) };
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)[I")
    private final int[] method2267(int arg0, int arg1) {
        ++field5056;
        if (~arg1 > -1) {
            return this.field5040;
        } else {
            if (arg0 != 2947) {
                field5046 = null;
            }
            return ~this.field5055.length >= ~arg1 ? this.field5045 : this.field5055[arg1];
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
    public final void method440(int arg0) {
        if (this.field5055 == null) {
            this.field5055 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field5054;
        if (this.field5055.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field5048 == -3) {
                this.method2266(754461868);
            }
            class261.method1638(arg0 ^ arg0);
            this.method2269((byte) -84);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class344() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field5044;
        int[] var3 = super.field3125.method2005(arg1, (byte) -72);
        if (arg0 != -11543) {
            return null;
        } else {
            if (super.field3125.field4676) {
                int[] var4 = this.method1366(0, (byte) -40, arg1);
                for (int var5 = 0; var5 < field5043; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field5038[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
    public static void method2268(int arg0) {
        field5042 = null;
        field5046 = null;
        if (arg0 <= 30) {
            method2268(-53);
        }
        field5041 = null;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(B)V")
    private final void method2269(byte arg0) {
        if (arg0 <= -42) {
            int var2 = this.field5048;
            if (var2 != 2) {
                if (var2 == 1) {
                    for (int var3 = 0; ~var3 > -258; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; ~var5 > ~(this.field5055.length + -1) && ~this.field5055[var5][0] >= ~var4; ++var5) {
                        }
                        int[] var6 = this.field5055[var5 + -1];
                        int[] var7 = this.field5055[var5];
                        int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                        int var9 = -class30.field520[(var8 & 8183) >> 5] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (~var11 >= 32767) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field5038[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; var12 < 257; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; ~(this.field5055.length - 1) < ~var14 && this.field5055[var14][0] <= var13; ++var14) {
                        }
                        int[] var15 = this.field5055[var14 + -1];
                        int[] var16 = this.field5055[var14];
                        int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                        int var18 = 4096 - var17;
                        int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                        if (var19 <= -32768) {
                            var19 = -32767;
                        }
                        if (~var19 <= -32769) {
                            var19 = 32767;
                        }
                        this.field5038[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; var20 < 257; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~(this.field5055.length - 1) < ~var22 && this.field5055[var22][0] <= var21; ++var22) {
                    }
                    int[] var23 = this.field5055[var22 + -1];
                    int[] var24 = this.field5055[var22];
                    int var25 = this.method2267(2947, var22 + -2)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method2267(2947, var22 + 1)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var25 + var26 + -var27 + var28;
                    int var32 = var25 - var26 + -var31;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var35 - -var37 + var36 - -var26;
                    if (var38 <= -32768) {
                        var38 = -32767;
                    }
                    if (var38 >= 32768) {
                        var38 = 32767;
                    }
                    this.field5038[var20] = (short) var38;
                }
            }
            ++field5049;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIZZ)V")
    public static final void method2270(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class308.field4403 = arg1;
        class413.field6175 = arg2;
        class27.field480 = arg3;
        class108.field1475 = new class10[arg0][class308.field4403][class413.field6175];
        class198.field2829 = new class337[arg0];
        if (arg4) {
            class39.field633 = new class10[1][class308.field4403][class413.field6175];
            class274.field4030 = new int[class308.field4403][class413.field6175];
            class425.field6324 = new class337[1];
        } else {
            class39.field633 = null;
            class274.field4030 = null;
            class425.field6324 = null;
        }
        if (arg5) {
            class38.field612 = new int[arg0][arg1][arg2];
            class74.field997 = new class413[255];
            class333.field4915 = new boolean[255];
            class134.field1789 = 0;
        } else {
            class38.field612 = null;
            class74.field997 = null;
            class333.field4915 = null;
            class134.field1789 = 0;
        }
        class247.method1523(false);
        class42.field654 = new class306[500];
        class37.field609 = 0;
        class79.field1086 = new class306[500];
        class369.field5489 = 0;
        class63.field900 = new int[arg0][class308.field4403 + 1][class413.field6175 + 1];
        class143.field1881 = new class361[5000];
        class401.field5966 = 0;
        class337.field4974 = new boolean[class27.field480 + class27.field480 + 1][class27.field480 + class27.field480 + 1];
        class19.field325 = new boolean[class27.field480 + class27.field480 + 2][class27.field480 + class27.field480 + 2];
        class30.field514 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (~arg0 == -1) {
            this.field5048 = arg2.method1697(115);
            this.field5055 = new int[arg2.method1697(arg1 + -17)][2];
            for (int var4 = 0; var4 < this.field5055.length; ++var4) {
                this.field5055[var4][0] = arg2.method1685(8104);
                this.field5055[var4][1] = arg2.method1685(8104);
            }
        }
        if (arg1 != -49) {
            this.method2269((byte) 119);
        }
        ++field5052;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([III)V")
    public static final void method2271(int[] arg0, int arg1, int arg2) {
        ++field5047;
        for (int var3 = 31; ~var3 < -1; --var3) {
            int var4 = var3 * 36;
            for (int var5 = 35; ~var5 < -1; --var5) {
                if (arg0[var5 - -var4] == 0 && ~arg0[var5 + -1 + var4 - 36] != -1) {
                    arg0[var4 + var5] = arg1;
                }
            }
        }
        if (arg2 != -22286) {
            method2268(-86);
        }
    }
}
