import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class95 extends class102 {

    @OriginalMember(owner = "client!ii", name = "fb", descriptor = "I")
    private int field1790 = 1024;

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
    private int field1788 = 1024;

    @OriginalMember(owner = "client!ii", name = "hb", descriptor = "I")
    private int field1792 = 819;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    private int field1781 = 0;

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
    private int field1787 = 409;

    @OriginalMember(owner = "client!ii", name = "nb", descriptor = "I")
    private int field1798 = 1024;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    private int field1776 = 1024;

    @OriginalMember(owner = "client!ii", name = "tb", descriptor = "I")
    private int field1804 = 0;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    private int field1780 = 2048;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "Lqe;")
    private static class179 field1777 = class206.method1380("Thu", (byte) 17);

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
    public static int field1785 = 0;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "Lqe;")
    private static class179 field1786 = class206.method1380("Sat", (byte) -126);

    @OriginalMember(owner = "client!ii", name = "eb", descriptor = "Lqe;")
    private static class179 field1789 = class206.method1380("Wed", (byte) 24);

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "[I")
    public static int[] field1779 = new int[5];

    @OriginalMember(owner = "client!ii", name = "qb", descriptor = "Lqe;")
    private static class179 field1801 = class206.method1380("Mon", (byte) -128);

    @OriginalMember(owner = "client!ii", name = "ob", descriptor = "I")
    public static int field1799 = 0;

    @OriginalMember(owner = "client!ii", name = "lb", descriptor = "Lqe;")
    private static class179 field1796 = class206.method1380("Fri", (byte) -128);

    @OriginalMember(owner = "client!ii", name = "rb", descriptor = "Lqe;")
    private static class179 field1802 = class206.method1380("Tue", (byte) 10);

    @OriginalMember(owner = "client!ii", name = "ub", descriptor = "Lqe;")
    private static class179 field1805 = class206.method1380("Sun", (byte) 60);

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "[Lqe;")
    public static class179[] field1782 = new class179[] { field1805, field1801, field1802, field1789, field1777, field1796, field1786 };

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    private int field1775;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ii", name = "gb", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ii", name = "ib", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ii", name = "jb", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ii", name = "mb", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ii", name = "pb", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ii", name = "sb", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ii", name = "kb", descriptor = "Z")
    public static boolean field1795;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
    public static void method610(boolean arg0) {
        field1796 = null;
        field1777 = null;
        if (arg0) {
            method612(-41, -52, (class179) null);
        }
        field1802 = null;
        field1786 = null;
        field1789 = null;
        field1805 = null;
        field1779 = null;
        field1782 = null;
        field1801 = null;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        ++field1794;
        if (arg0 != 14005) {
            this.field1775 = -93;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)I")
    public static final int method611(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 1431655765) + (1431655765 & arg0);
        ++field1772;
        int var3 = (-1288490189 & var2 >>> 2) + (var2 & arg1);
        int var4 = (var3 >>> 4) + var3 & 252645135;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 255;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field1793;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (!arg0) {
            this.field1798 = 67;
        }
        if (super.field1960.field2007) {
            int[][] var4 = super.field1960.method700((byte) -67);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            boolean var13 = true;
            int var14 = class155.field2796 * this.field1776 >> 12;
            int var15 = class155.field2796 * this.field1780 >> 12;
            int var16 = class117.field2216 * this.field1792 >> 12;
            int var17 = class117.field2216 * this.field1787 >> 12;
            if (var16 <= 1) {
                return var4[arg1];
            } else {
                this.field1775 = class155.field2796 / 8 * this.field1790 >> 12;
                int var18 = 1 - -(class155.field2796 / var14);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field1804);
                while (true) {
                    while (true) {
                        int var22 = class4.method26(var21, 12024, -var14 + var15) + var14;
                        int var23 = class4.method26(var21, 12024, -var17 + var16) + var17;
                        int var24 = var7 + var22;
                        if (~class155.field2796 > ~var24) {
                            var22 = -var7 + class155.field2796;
                            var24 = class155.field2796;
                        }
                        int var27;
                        if (var10) {
                            var27 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var19[var9];
                            var27 = var26[2];
                            int var28 = 0;
                            int var29 = var6 + var24;
                            if (~var29 > -1) {
                                var29 += class155.field2796;
                            }
                            if (~class155.field2796 > ~var29) {
                                var29 -= class155.field2796;
                            }
                            while (true) {
                                int[] var30 = var19[var25];
                                if (~var29 <= ~var30[0] && var29 <= var30[1]) {
                                    if (var9 != var25) {
                                        int var31 = var6 + var7;
                                        if (~var31 > -1) {
                                            var31 += class155.field2796;
                                        }
                                        if (class155.field2796 < var31) {
                                            var31 -= class155.field2796;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var19[(var9 + var32) % var11];
                                            var27 = Math.max(var27, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var28; ++var33) {
                                            int[] var34 = var19[(var9 + var33) % var11];
                                            int var35 = var34[2];
                                            if (var27 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class155.field2796;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                                this.method616(var21, var4, 6859, -var38 + var39, -var35 + var27, var35, var8 + var38);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var28;
                                ++var25;
                                if (~var25 <= ~var11) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (var23 + var27 > class117.field2216) {
                            var23 = class117.field2216 - var27;
                        } else {
                            var13 = false;
                        }
                        if (~class155.field2796 == ~var24) {
                            this.method616(var21, var4, 6859, var22, var23, var27, var5 + var7);
                            if (var13) {
                                return var3;
                            }
                            var10 = false;
                            var8 = var5;
                            var13 = true;
                            var9 = 0;
                            int[][] var41 = var19;
                            int[] var42 = var20[var12++];
                            var42[2] = var27 - -var23;
                            var42[0] = var7;
                            var7 = 0;
                            var42[1] = var24;
                            var11 = var12;
                            var5 = class4.method26(var21, 12024, class155.field2796);
                            var19 = var20;
                            var12 = 0;
                            var6 = -var8 + var5;
                            int var43 = var6;
                            if (~var6 > -1) {
                                var43 = class155.field2796 + var6;
                            }
                            var20 = var41;
                            if (~var43 < ~class155.field2796) {
                                var43 -= class155.field2796;
                            }
                            while (true) {
                                int[] var44 = var19[var9];
                                if (~var44[0] >= ~var43 && var43 <= var44[1]) {
                                    break;
                                }
                                ++var9;
                                if (var9 >= var11) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var20[var12++];
                            var45[0] = var7;
                            var45[1] = var24;
                            var45[2] = var23 + var27;
                            this.method616(var21, var4, 6859, var22, var23, var27, var7 - -var5);
                            var7 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILqe;)V")
    public static final void method612(int arg0, int arg1, class179 arg2) {
        ++class113.field2120;
        class81.field1564.method70((byte) -62, 200);
        if (arg0 != 10074) {
            field1799 = 3;
        }
        ++field1771;
        class81.field1564.method1211(false, arg2.method1137(75));
        class81.field1564.method1230((byte) -63, arg1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)I")
    public static final int method613(int arg0, boolean arg1, int arg2) {
        ++field1773;
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        if (!arg1) {
            return 100;
        } else {
            int var5 = (var4 * var4 * 15731 - -789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return 255 & var5 >> 19;
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)[Lfc;")
    public static final class58[] method614(int arg0) {
        ++field1783;
        class58[] var1 = new class58[class226.field4186];
        for (int var2 = arg0; class226.field4186 > var2; ++var2) {
            var1[var2] = new class72(class22.field544, class9.field257, class31.field674[var2], class143.field2611[var2], class187.field3493[var2], class150.field2703[var2], class173.field3102[var2], class175.field3185);
        }
        class17.method129((byte) -85);
        return var1;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class95() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI[IIII[BIII)V")
    public static final void method615(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        int var11 = ((65280 & arg2) * arg9 & 16711680) + ((16711935 & arg2) * arg9 & -16711936) >> 8;
        if (!arg1) {
            method612(34, 28, (class179) null);
        }
        ++field1774;
        int var12 = -arg9 + 256;
        for (int var13 = -arg8; var13 < 0; ++var13) {
            for (int var14 = -arg4; var14 < 0; ++var14) {
                if (arg7[arg6++] == 0) {
                    ++arg10;
                } else {
                    int var15 = arg3[arg10];
                    arg3[arg10++] = (class107.method696(var12 * class107.method696(var15, 65280), 16711680) + class107.method696(class107.method696(var15, 16711935) * var12, -16711936) >> 8) - -var11;
                }
            }
            arg10 += arg5;
            arg6 += arg0;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/util/Random;[[IIIIII)V")
    private final void method616(Random arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1791;
        int var8 = ~this.field1798 < -1 ? 4096 + -class4.method26(arg0, 12024, this.field1798) : 4096;
        if (arg2 == 6859) {
            int var9 = this.field1788 * this.field1775 >> 12;
            int var10 = this.field1775 - (~var9 < -1 ? class4.method26(arg0, 12024, var9) : 0);
            if (~arg6 <= ~class155.field2796) {
                arg6 -= class155.field2796;
            }
            if (var10 <= 0) {
                if (arg3 + arg6 <= class155.field2796) {
                    for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                        class154.method988(arg1[arg5 + var11], arg6, arg3, var8);
                    }
                } else {
                    int var12 = -arg6 + class155.field2796;
                    for (int var13 = 0; ~arg4 < ~var13; ++var13) {
                        int[] var14 = arg1[arg5 + var13];
                        class154.method988(var14, arg6, var12, var8);
                        class154.method988(var14, 0, arg3 - var12, var8);
                    }
                }
            } else if (~arg4 < -1 && arg3 > 0) {
                int var15 = arg3 / 2;
                int var16 = arg4 / 2;
                int var17 = var15 < var10 ? var15 : var10;
                int var18 = arg6 + var17;
                int var19 = ~var10 < ~var16 ? var16 : var10;
                int var20 = -(var17 * 2) + arg3;
                for (int var21 = 0; arg4 > var21; ++var21) {
                    int[] var22 = arg1[arg5 + var21];
                    if (~var21 > ~var19) {
                        int var23 = var8 * var21 / var19;
                        if (this.field1781 != 0) {
                            for (int var24 = 0; var24 < var17; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class107.method696(arg6 + var24, class227.field4193)] = var22[class107.method696(-var24 + arg3 + arg6 + -1, class227.field4193)] = var25 < var23 ? var25 : var23;
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~var17; ++var26) {
                                int var28 = var8 * var26 / var17;
                                var22[class107.method696(class227.field4193, arg6 - -var26)] = var22[class107.method696(-var26 + -1 + arg3 + arg6, class227.field4193)] = var23 * var28 >> 12;
                            }
                        }
                        if (class155.field2796 < var18 + var20) {
                            int var27 = class155.field2796 - var18;
                            class154.method988(var22, var18, var27, var23);
                            class154.method988(var22, 0, var20 - var27, var23);
                        } else {
                            class154.method988(var22, var18, var20, var23);
                        }
                    } else {
                        int var29 = -var21 + arg4 + -1;
                        if (~var29 > ~var19) {
                            int var30 = var8 * var29 / var19;
                            if (~this.field1781 == -1) {
                                for (int var31 = 0; var31 < var17; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class107.method696(arg6 - -var31, class227.field4193)] = var22[class107.method696(class227.field4193, arg6 + -1 - (-arg3 + var31))] = var30 * var32 >> 12;
                                }
                            } else {
                                for (int var33 = 0; var17 > var33; ++var33) {
                                    int var35 = var8 * var33 / var17;
                                    var22[class107.method696(arg6 + var33, class227.field4193)] = var22[class107.method696(class227.field4193, arg6 - 1 + -var33 + arg3)] = ~var30 >= ~var35 ? var30 : var35;
                                }
                            }
                            if (var18 + var20 > class155.field2796) {
                                int var34 = class155.field2796 - var18;
                                class154.method988(var22, var18, var34, var30);
                                class154.method988(var22, 0, -var34 + var20, var30);
                            } else {
                                class154.method988(var22, var18, var20, var30);
                            }
                        } else {
                            for (int var36 = 0; var36 < var17; ++var36) {
                                var22[class107.method696(class227.field4193, arg6 + var36)] = var22[class107.method696(class227.field4193, -var36 + arg3 - 1 + arg6)] = var8 * var36 / var17;
                            }
                            if (~(var18 + var20) >= ~class155.field2796) {
                                class154.method988(var22, var18, var20, var8);
                            } else {
                                int var37 = -var18 + class155.field2796;
                                class154.method988(var22, var18, var37, var8);
                                class154.method988(var22, 0, -var37 + var20, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lqa;I)V")
    public static final void method617(class175 arg0, int arg1) {
        ++field1803;
        if (~arg0.field3194 != -1) {
            if (~arg0.field3142 != 0 && ~arg0.field3142 > -32769) {
                class188 var2 = class53.field1152[arg0.field3142];
                if (var2 != null) {
                    int var3 = -var2.field3198 + arg0.field3198;
                    int var4 = arg0.field3159 - var2.field3159;
                    if (~var4 != -1 || ~var3 != -1) {
                        arg0.field3162 = 2047 & (int) (Math.atan2((double) var4, (double) var3) * 325.949D);
                    }
                }
            }
            if (~arg0.field3142 <= -32769) {
                int var5 = arg0.field3142 - 32768;
                if (class159.field2871 == var5) {
                    var5 = 2047;
                }
                class115 var6 = class23.field554[var5];
                if (var6 != null) {
                    int var7 = -var6.field3198 + arg0.field3198;
                    int var8 = -var6.field3159 + arg0.field3159;
                    if (var8 != 0 || ~var7 != -1) {
                        arg0.field3162 = 2047 & (int) (Math.atan2((double) var8, (double) var7) * 325.949D);
                    }
                }
            }
            if ((arg0.field3149 != 0 || arg0.field3164 != 0) && (~arg0.field3176 == -1 || arg0.field3186 > 0)) {
                int var9 = (arg0.field3178 + -1) * 64 + -((-class2.field26 - class2.field26 + arg0.field3149) * 64) + arg0.field3159;
                int var10 = arg0.field3198 - (-((arg0.field3178 - 1) * 64) - -((-class141.field2582 + arg0.field3164 + -class141.field2582) * 64));
                if (var9 != 0 || ~var10 != -1) {
                    arg0.field3162 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                }
                arg0.field3164 = 0;
                arg0.field3149 = 0;
            }
            int var11 = -arg0.field3177 + arg0.field3162 & 2047;
            if (~var11 != -1) {
                ++arg0.field3167;
                if (var11 > 1024) {
                    arg0.field3177 -= arg0.field3194;
                    boolean var12 = true;
                    if (~arg0.field3194 < ~var11 || ~var11 < ~(-arg0.field3194 + 2048)) {
                        arg0.field3177 = arg0.field3162;
                        var12 = false;
                    }
                    if (arg0.field3153 == arg0.field3130 && (~arg0.field3167 < -26 || var12)) {
                        if (arg0.field3172 == -1) {
                            arg0.field3153 = arg0.field3129;
                        } else {
                            arg0.field3153 = arg0.field3172;
                        }
                    }
                } else {
                    boolean var13 = true;
                    arg0.field3177 += arg0.field3194;
                    if (~var11 > ~arg0.field3194 || ~(2048 - arg0.field3194) > ~var11) {
                        var13 = false;
                        arg0.field3177 = arg0.field3162;
                    }
                    if (arg0.field3153 == arg0.field3130 && (arg0.field3167 > 25 || var13)) {
                        if (~arg0.field3173 == 0) {
                            arg0.field3153 = arg0.field3129;
                        } else {
                            arg0.field3153 = arg0.field3173;
                        }
                    }
                }
                arg0.field3177 &= 2047;
            } else {
                arg0.field3167 = 0;
            }
            if (arg1 != -21250) {
                method614(19);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field1800;
        if (arg2) {
            field1782 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field1798 = arg0.method1252(2);
                                        }
                                    } else {
                                        this.field1788 = arg0.method1252(2);
                                    }
                                } else {
                                    this.field1781 = arg0.method1243(3);
                                }
                            } else {
                                this.field1790 = arg0.method1252(2);
                            }
                        } else {
                            this.field1792 = arg0.method1252(2);
                        }
                    } else {
                        this.field1787 = arg0.method1252(2);
                    }
                } else {
                    this.field1780 = arg0.method1252(2);
                }
            } else {
                this.field1776 = arg0.method1252(2);
            }
        } else {
            this.field1804 = arg0.method1243(3);
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)I")
    public static final int method618(int arg0, int arg1) {
        ++field1797;
        if (arg0 != 1663202705) {
            method615(119, false, 70, (int[]) null, -33, -115, 96, (byte[]) null, 94, -123, -116);
        }
        return (arg1 & 934096) >> 17;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(ZI)Lca;")
    public static final class23 method619(boolean arg0, int arg1) {
        if (!arg0) {
            method614(11);
        }
        class23 var2 = (class23) class49.field1061.method1299((byte) -119, (long) arg1);
        ++field1778;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class89.field1689.method342(class61.method413(arg1, 1023), class144.method910(arg1, (byte) 116), (byte) 89);
            class23 var4 = new class23();
            if (var3 != null) {
                var4.method154(new class185(var3), -1);
            }
            class49.field1061.method1303(var4, (long) arg1, (byte) -107);
            return var4;
        }
    }
}
