import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class38 extends class102 {

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    private int field815 = 1;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    private int field825 = 1;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "Lqe;")
    private static class179 field819 = class206.method1380("Please wait )2 attempting to reestablish)3", (byte) 32);

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Lqe;")
    public static class179 field821 = field819;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "Lr;")
    public static class184 field824;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Lee;")
    public static class49 field822;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field816;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field1957 = ~arg0.method1243(3) == -2;
                }
            } else {
                this.field815 = arg0.method1243(3);
            }
        } else {
            this.field825 = arg0.method1243(3);
        }
        if (arg2) {
            method249(61);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != 64) {
            method248((byte) -113);
        }
        ++field818;
        int[][] var3 = super.field1950.method598((byte) -72, arg0);
        if (super.field1950.field1724) {
            int var4 = this.field815 + 1 + this.field815;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field825 + 1 - -this.field825;
            int var8 = 65536 / var7;
            for (int var9 = -this.field815 + arg0; this.field815 + arg0 >= var9; ++var9) {
                int[][] var19 = this.method677(arg1 + 30, var9 & class233.field4296, 0);
                int var20 = 0;
                int var21 = 0;
                int[][] var22 = new int[3][class155.field2796];
                int[] var23 = var19[0];
                int[] var24 = var19[1];
                int var25 = 0;
                int[] var26 = var19[2];
                for (int var27 = -this.field825; ~var27 >= ~this.field825; ++var27) {
                    int var37 = var27 & class227.field4193;
                    var20 += var23[var37];
                    var25 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var22[1];
                int[] var29 = var22[2];
                int[] var30 = var22[0];
                int var31 = 0;
                while (var31 < class155.field2796) {
                    var30[var31] = var8 * var20 >> 16;
                    var28[var31] = var8 * var21 >> 16;
                    var29[var31] = var8 * var25 >> 16;
                    int var32 = class227.field4193 & -this.field825 + var31;
                    int var33 = var20 - var23[var32];
                    int var34 = var25 - var26[var32];
                    ++var31;
                    int var35 = var21 - var24[var32];
                    int var36 = class227.field4193 & var31 - -this.field825;
                    var25 = var26[var36] + var34;
                    var21 = var24[var36] + var35;
                    var20 = var23[var36] + var33;
                }
                var6[-arg0 + var9 - -this.field815] = var22;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class155.field2796 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var6[var17];
                    var16 += var18[2][var13];
                    var15 += var18[0][var13];
                    var14 += var18[1][var13];
                }
                var10[var13] = var5 * var15 >> 16;
                var11[var13] = var5 * var14 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIZZIIIZ)Lnb;")
    public static final class143 method247(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        ++field823;
        class15 var8 = class131.method835((byte) -20, arg4);
        if (~arg5 < -2 && var8.field428 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; ++var10) {
                if (~arg5 <= ~var8.field386[var10] && var8.field386[var10] != 0) {
                    var9 = var8.field428[var10];
                }
            }
            if (~var9 != 0) {
                var8 = class131.method835((byte) -20, var9);
            }
        }
        class203 var11 = var8.method119(true);
        if (var11 == null) {
            return null;
        } else {
            class143 var12 = null;
            if (~var8.field431 == 0) {
                if (~var8.field409 != 0) {
                    var12 = method247(false, arg1, false, true, var8.field426, arg5, arg6, true);
                    if (var12 == null) {
                        return null;
                    }
                }
            } else {
                var12 = method247(false, 0, true, true, var8.field370, 10, 1, true);
                if (var12 == null) {
                    return null;
                }
            }
            int[] var13 = class145.field2640;
            int var14 = class145.field2637;
            int var15 = class145.field2635;
            int[] var16 = new int[4];
            class145.method925(var16);
            class126 var17 = new class126(36, 32);
            class145.method930(var17.field2315, 36, 32);
            class145.method929();
            class27.method169();
            class27.method180(16, 16);
            class27.field601 = false;
            if (~var8.field409 != 0) {
                var12.method799(0, 0);
            }
            int var18 = var8.field368;
            if (arg2) {
                var18 = (int) ((double) var18 * 1.5D);
            } else if (~arg6 == -3) {
                var18 = (int) ((double) var18 * 1.04D);
            }
            int var19 = class27.field612[var8.field403] * var18 >> 16;
            int var20 = class27.field600[var8.field403] * var18 >> 16;
            var11.method485(0, var8.field424, var8.field387, var8.field403, var8.field380, var19 + -(var11.method295() / 2) + var8.field385, var8.field385 + var20);
            if (var8.field409 == -1) {
                if (~arg6 <= -2) {
                    var17.method800(1);
                }
                if (~arg6 <= -3) {
                    var17.method800(16777215);
                }
                if (~arg1 != -1) {
                    var17.method804(arg1);
                }
            }
            class145.method930(var17.field2315, 36, 32);
            if (~var8.field431 != 0) {
                var12.method799(0, 0);
            }
            if (arg0 && (~var8.field430 == -2 || arg5 != 1) && ~arg5 != 0) {
                class64.field1327.method1015(class208.method1387(100000, arg5), 0, 9, 16776960, 1);
            }
            class145.method930(var13, var14, var15);
            class145.method927(var16);
            class27.method169();
            class27.field601 = arg3;
            return var17;
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V")
    public static void method248(byte arg0) {
        field824 = null;
        field821 = null;
        if (arg0 != 96) {
            method250(124, -14);
        }
        field819 = null;
        field822 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            field821 = null;
        }
        ++field820;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int var4 = this.field825 - -this.field825 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field815 + 1 + this.field815;
            int[][] var7 = new int[var6][];
            for (int var8 = -this.field815 + arg1; var8 <= this.field815 + arg1; ++var8) {
                int[] var13 = this.method679(class233.field4296 & var8, 0, (byte) -109);
                int[] var14 = new int[class155.field2796];
                int var15 = 0;
                for (int var16 = -this.field825; ~var16 >= ~this.field825; ++var16) {
                    var15 += var13[var16 & class227.field4193];
                }
                int var17 = 0;
                while (class155.field2796 > var17) {
                    var14[var17] = var5 * var15 >> 16;
                    int var18 = var15 - var13[-this.field825 + var17 & class227.field4193];
                    ++var17;
                    var15 = var13[this.field825 + var17 & class227.field4193] + var18;
                }
                var7[var8 - (-this.field815 - -arg1)] = var14;
            }
            int var9 = 65536 / var6;
            for (int var10 = 0; ~var10 > ~class155.field2796; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var6 > var12; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var9 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class38() {
        super(1, false);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
    public static final void method249(int arg0) {
        ++field817;
        if (class143.field2599 == null) {
            if (class86.field1647 == null) {
                int var1 = class70.field1405;
                if (arg0 != 17492) {
                    method250(122, -48);
                }
                if (class182.field3358) {
                    if (~var1 != -2) {
                        int var6 = class139.field2559;
                        int var7 = class4.field61;
                        if (~var7 > ~(class202.field3749 + -10) || ~var7 < ~(class202.field3749 + class186.field3459 - -10) || ~var6 > ~(class49.field1051 - 10) || ~(class49.field1051 - (-class183.field3378 + -10)) > ~var6) {
                            class182.field3358 = false;
                            class143.method900(class186.field3459, class183.field3378, (byte) -69, class49.field1051, class202.field3749);
                        }
                    }
                    if (var1 != 1) {
                        return;
                    }
                    int var8 = class202.field3749;
                    int var9 = class186.field3459;
                    int var10 = class49.field1051;
                    int var11 = class175.field3141;
                    int var12 = -1;
                    int var13 = class68.field1361;
                    for (int var14 = 0; var14 < class113.field2118; ++var14) {
                        int var15 = (-var14 + -1 + class113.field2118) * 15 + var10 + 31;
                        if (~var13 < ~var8 && var13 < var8 + var9 && ~var11 < ~(var15 + -13) && var15 + 3 > var11) {
                            var12 = var14;
                        }
                    }
                    if (var12 != -1) {
                        class8.method54(var12, 180);
                    }
                    class182.field3358 = false;
                    class143.method900(class186.field3459, class183.field3378, (byte) 108, class49.field1051, class202.field3749);
                } else {
                    if (var1 == 1 && ~class113.field2118 < -1) {
                        short var2 = class23.field552[class113.field2118 + -1];
                        if (~var2 == -17 || var2 == 51 || var2 == 41 || var2 == 22 || ~var2 == -30 || ~var2 == -47 || ~var2 == -26 || var2 == 34 || ~var2 == -36 || ~var2 == -44 || ~var2 == -20 || ~var2 == -1003) {
                            int var3 = class2.field21[class113.field2118 + -1];
                            int var4 = class109.field2038[class113.field2118 + -1];
                            class6 var5 = class87.method580(var4, 47);
                            if (class159.method1032(class159.method1026(var5, arg0 ^ -1493555596), -37) || class194.method1300(0, class159.method1026(var5, -1493540320))) {
                                class196.field3645 = 0;
                                class81.field1576 = false;
                                if (class143.field2599 != null) {
                                    class139.method880(class143.field2599, arg0 + -17388);
                                }
                                class143.field2599 = class87.method580(var4, arg0 ^ 17431);
                                class217.field4023 = class175.field3141;
                                class167.field3005 = class68.field1361;
                                class163.field2950 = var3;
                                class139.method880(class143.field2599, 96);
                                return;
                            }
                        }
                    }
                    if (var1 == 1 && (class205.field3839 == 1 && class113.field2118 > 2 || class202.method1346(class113.field2118 + -1, 104))) {
                        var1 = 2;
                    }
                    if (var1 == 1 && ~class113.field2118 < -1) {
                        class8.method54(class113.field2118 + -1, 180);
                    }
                    if (~var1 == -3 && ~class113.field2118 < -1) {
                        class191.method1285((byte) 79);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
    public static final void method250(int arg0, int arg1) {
        ++field826;
        int var2 = 65 / ((42 - arg1) / 43);
        class131.method841(128);
        class179.method1154((byte) -39);
        int var3 = class243.method1565(arg0, (byte) -101).field46;
        if (var3 != 0) {
            int var4 = class14.field355[arg0];
            if (~var3 == -2) {
                class16.field435 = var4;
                if (~class16.field435 == -2) {
                    class27.method164(0.9F);
                }
                if (class16.field435 == 2) {
                    class27.method164(0.8F);
                }
                if (class16.field435 == 3) {
                    class27.method164(0.7F);
                }
                if (~class16.field435 == -5) {
                    class27.method164(0.6F);
                }
                class179.method1134(125);
            }
            if (var3 == 3) {
                short var5 = 0;
                if (~var4 == -1) {
                    var5 = 255;
                }
                if (~var4 == -2) {
                    var5 = 192;
                }
                if (var4 == 2) {
                    var5 = 128;
                }
                if (~var4 == -4) {
                    var5 = 64;
                }
                if (~var4 == -5) {
                    var5 = 0;
                }
                if (~class130.field2364 != ~var5) {
                    if (class130.field2364 == 0 && ~class136.field2520 != 0) {
                        class3.method19(4095, class136.field2520, false, class179.field3251, 0, var5);
                        class144.field2618 = false;
                    } else if (~var5 == -1) {
                        class68.method439(1);
                        class144.field2618 = false;
                    } else {
                        class48.method319(var5, 124);
                    }
                    class130.field2364 = var5;
                }
            }
            if (~var3 == -10) {
                class155.field2794 = var4;
            }
            if (~var3 == -6) {
                class205.field3839 = var4;
            }
            if (~var3 == -11) {
                if (var4 == 0) {
                    class102.field1963 = 127;
                }
                if (var4 == 1) {
                    class102.field1963 = 96;
                }
                if (~var4 == -3) {
                    class102.field1963 = 64;
                }
                if (~var4 == -4) {
                    class102.field1963 = 32;
                }
                if (~var4 == -5) {
                    class102.field1963 = 0;
                }
            }
            if (~var3 == -7) {
                class112.field2116 = var4;
            }
            if (~var3 == -5) {
                if (~var4 == -1) {
                    class151.field2714 = 127;
                }
                if (var4 == 1) {
                    class151.field2714 = 96;
                }
                if (~var4 == -3) {
                    class151.field2714 = 64;
                }
                if (~var4 == -4) {
                    class151.field2714 = 32;
                }
                if (var4 == 4) {
                    class151.field2714 = 0;
                    return;
                }
            }
        }
    }
}
