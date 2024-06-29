import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class28 extends class1 {

    @OriginalMember(owner = "client!ce", name = "lb", descriptor = "I")
    private int field590 = 0;

    @OriginalMember(owner = "client!ce", name = "jb", descriptor = "I")
    private int field588 = 0;

    @OriginalMember(owner = "client!ce", name = "ib", descriptor = "I")
    private int field587 = 1024;

    @OriginalMember(owner = "client!ce", name = "wb", descriptor = "I")
    private int field601 = 1024;

    @OriginalMember(owner = "client!ce", name = "Ab", descriptor = "I")
    private int field605 = 1024;

    @OriginalMember(owner = "client!ce", name = "yb", descriptor = "I")
    private int field603 = 1024;

    @OriginalMember(owner = "client!ce", name = "Bb", descriptor = "I")
    private int field606 = 819;

    @OriginalMember(owner = "client!ce", name = "pb", descriptor = "I")
    private int field594 = 409;

    @OriginalMember(owner = "client!ce", name = "Cb", descriptor = "I")
    private int field607 = 2048;

    @OriginalMember(owner = "client!ce", name = "vb", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!ce", name = "Db", descriptor = "I")
    public static int field608 = 0;

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ce", name = "kb", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ce", name = "mb", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ce", name = "nb", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ce", name = "ob", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!ce", name = "rb", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ce", name = "sb", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ce", name = "tb", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ce", name = "ub", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ce", name = "xb", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!ce", name = "zb", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ce", name = "Eb", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "[Lid;")
    public static class91[] field585;

    @OriginalMember(owner = "client!ce", name = "qb", descriptor = "[[S")
    public static short[][] field595;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (arg0 == 3) {
            ++field591;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)I")
    public static final int method211(byte arg0, int arg1, int arg2) {
        ++field589;
        class110 var3 = (class110) class166.field3032.method1538((long) arg1, (byte) 127);
        if (arg0 != -23) {
            return 49;
        } else if (var3 == null) {
            return 0;
        } else if (~arg2 == 0) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; ~var3.field1953.length < ~var5; ++var5) {
                if (var3.field1952[var5] == arg2) {
                    var4 += var3.field1953[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field597;
        if (arg0 != 0) {
            field585 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field605 = arg2.method1490((byte) 73);
                                        }
                                    } else {
                                        this.field587 = arg2.method1490((byte) 73);
                                    }
                                } else {
                                    this.field588 = arg2.method1475(arg0 ^ 255);
                                }
                            } else {
                                this.field603 = arg2.method1490((byte) 73);
                            }
                        } else {
                            this.field606 = arg2.method1490((byte) 73);
                        }
                    } else {
                        this.field594 = arg2.method1490((byte) 73);
                    }
                } else {
                    this.field607 = arg2.method1490((byte) 73);
                }
            } else {
                this.field601 = arg2.method1490((byte) 73);
            }
        } else {
            this.field590 = arg2.method1475(255);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(III)V")
    public static final void method212(int arg0, int arg1, int arg2) {
        ++field602;
        if (class117.field2108 >= 2 || class166.field3017 != 0 || class159.field2859) {
            class151 var3;
            if (class166.field3017 == 1 && ~class117.field2108 > -3) {
                var3 = class126.method761(new class151[] { class14.field318, class68.field1345, class29.field613, class151.field2722 }, 10260);
            } else if (class159.field2859 && class117.field2108 < 2) {
                var3 = class126.method761(new class151[] { class95.field1770, class68.field1345, class20.field447, class151.field2722 }, 10260);
            } else {
                var3 = class149.method947(class117.field2108 + -1, true);
            }
            if (class117.field2108 > arg0) {
                var3 = class126.method761(new class151[] { var3, class20.field449, class137.method874(class117.field2108 - 2, false), class124.field2237 }, 10260);
            }
            int var4 = class19.field403.method1267(var3, arg1 + 4, arg2 + 15, 16777215, 0, class130.field2384, class48.field992);
            class5.method31(arg2, 15, -9529, arg1 - -4, class19.field403.method1259(var3) - -var4);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method213(byte arg0, Component arg1) {
        arg1.removeMouseListener(class16.field362);
        ++field598;
        arg1.removeMouseMotionListener(class16.field362);
        arg1.removeFocusListener(class16.field362);
        if (arg0 < -15) {
            class7.field112 = 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public static final void method214(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field609;
        int var5 = 0;
        if (arg1 != -7205) {
            field608 = -126;
        }
        int var6 = -arg3;
        int var7 = arg3;
        int var8 = -1;
        int var9 = class116.method704(class25.field524, arg3 + arg4, 27104, class79.field1526);
        int var10 = class116.method704(class25.field524, -arg3 + arg4, 27104, class79.field1526);
        class55.method380(arg2, arg1 + 7325, class43.field887[arg0], var9, var10);
        while (var5 < var7) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                --var7;
                var6 -= var7 << 1;
                int var11 = arg0 + var7;
                int var12 = arg0 - var7;
                if (~class233.field4281 >= ~var11 && class154.field2793 >= var12) {
                    int var13 = class116.method704(class25.field524, arg4 + var5, 27104, class79.field1526);
                    int var14 = class116.method704(class25.field524, -var5 + arg4, 27104, class79.field1526);
                    if (~var11 >= ~class154.field2793) {
                        class55.method380(arg2, 121, class43.field887[var11], var13, var14);
                    }
                    if (~class233.field4281 >= ~var12) {
                        class55.method380(arg2, 127, class43.field887[var12], var13, var14);
                    }
                }
            }
            ++var5;
            int var15 = arg0 - -var5;
            int var16 = -var5 + arg0;
            if (~class233.field4281 >= ~var15 && var16 <= class154.field2793) {
                int var17 = class116.method704(class25.field524, arg4 - -var7, arg1 ^ -30149, class79.field1526);
                int var18 = class116.method704(class25.field524, arg4 - var7, arg1 + 34309, class79.field1526);
                if (class154.field2793 >= var15) {
                    class55.method380(arg2, arg1 ^ -7244, class43.field887[var15], var17, var18);
                }
                if (~class233.field4281 >= ~var16) {
                    class55.method380(arg2, 110, class43.field887[var16], var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V")
    public static void method215(int arg0) {
        field585 = null;
        field595 = null;
        if (arg0 != -18572) {
            field585 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIBI)I")
    public static final int method216(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = -83 % ((-23 - arg3) / 62);
        ++field599;
        int var6 = -class61.field1208[arg0 * 1024 / arg2] + 65536 >> 1;
        return ((-var6 + 65536) * arg1 >> 16) + (arg4 * var6 >> 16);
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)V")
    public static final void method217(int arg0) {
        ++field604;
        class21.field462 = 0;
        class111.field1956 = 0;
        class32.method236(-97);
        class26.method203(true);
        class189.method1174(false);
        class19.method165((byte) -123);
        for (int var1 = 0; var1 < class21.field462; ++var1) {
            int var3 = class163.field2942[var1];
            if (~class200.field3541 != ~class179.field3229[var3].field4028) {
                class179.field3229[var3] = null;
            }
        }
        if (class68.field1329 != class1.field34.field4101) {
            throw new RuntimeException("gpp1 pos:" + class1.field34.field4101 + " psize:" + class68.field1329);
        } else {
            for (int var2 = 0; class47.field961 > var2; ++var2) {
                if (class179.field3229[class159.field2866[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class47.field961);
                }
            }
            if (arg0 != 1) {
                field600 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        int[] var3 = super.field21.method1182(arg1, -31709);
        ++field586;
        if (super.field21.field3388) {
            int[][] var4 = super.field21.method1183(arg0 + -107);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class202.field3603 * this.field601 >> 12;
            int var15 = class129.field2354 * this.field594 >> 12;
            int var16 = class202.field3603 * this.field607 >> 12;
            int var17 = class129.field2354 * this.field606 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field593 = class202.field3603 / 8 * this.field603 >> 12;
            int var18 = class202.field3603 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field590);
            label128: while (true) {
                while (true) {
                    int var22 = class3.method28(var21, 127, -var14 + var16) + var14;
                    int var23 = var8 + var22;
                    int var24 = class3.method28(var21, arg0 ^ 30, -var15 + var17) + var15;
                    if (var23 > class202.field3603) {
                        var23 = class202.field3603;
                        var22 = -var8 + class202.field3603;
                    }
                    int var29;
                    if (var12) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int var26 = 0;
                        int var27 = var5 + var23;
                        if (~var27 > -1) {
                            var27 += class202.field3603;
                        }
                        if (class202.field3603 < var27) {
                            var27 -= class202.field3603;
                        }
                        int[] var28 = var20[var9];
                        var29 = var28[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (var30[0] <= var27 && ~var30[1] <= ~var27) {
                                if (~var9 != ~var25) {
                                    int var31 = var8 - -var5;
                                    if (~var31 > -1) {
                                        var31 += class202.field3603;
                                    }
                                    if (class202.field3603 < var31) {
                                        var31 -= class202.field3603;
                                    }
                                    for (int var32 = 1; var32 <= var26; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var11];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; var26 >= var33; ++var33) {
                                        int[] var34 = var20[(var9 - -var33) % var11];
                                        int var35 = var34[2];
                                        if (~var29 != ~var35) {
                                            int var36 = var34[1];
                                            int var37 = var34[0];
                                            int var38;
                                            int var39;
                                            if (~var31 > ~var27) {
                                                var38 = Math.max(var31, var37);
                                                var39 = Math.min(var27, var36);
                                            } else if (var37 != 0) {
                                                var38 = Math.max(var31, var37);
                                                var39 = class202.field3603;
                                            } else {
                                                var39 = Math.min(var27, var36);
                                                var38 = 0;
                                            }
                                            this.method218(var7 + var38, var4, var35, -var38 + var39, var21, (byte) 112, -var35 + var29);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var26;
                            ++var25;
                            if (~var25 <= ~var11) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~class129.field2354 > ~(var29 - -var24)) {
                        var24 = -var29 + class129.field2354;
                    } else {
                        var10 = false;
                    }
                    if (class202.field3603 != var23) {
                        int[] var41 = var19[var13++];
                        var41[1] = var23;
                        var41[2] = var24 + var29;
                        var41[0] = var8;
                        this.method218(var8 - -var6, var4, var29, var22, var21, (byte) 112, var24);
                        var8 = var23;
                    } else {
                        this.method218(var6 + var8, var4, var29, var22, var21, (byte) 112, var24);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        var9 = 0;
                        var12 = false;
                        int[] var42 = var19[var13++];
                        var11 = var13;
                        var42[2] = var24 + var29;
                        var13 = 0;
                        var42[1] = var23;
                        var42[0] = var8;
                        var7 = var6;
                        var6 = class3.method28(var21, 107, class202.field3603);
                        int[][] var43 = var20;
                        var20 = var19;
                        var19 = var43;
                        var5 = var6 - var7;
                        int var44 = var5;
                        if (~var5 > -1) {
                            var44 = class202.field3603 + var5;
                        }
                        if (~var44 < ~class202.field3603) {
                            var44 -= class202.field3603;
                        }
                        var8 = 0;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var45[0] <= var44 && ~var44 >= ~var45[1]) {
                                break;
                            }
                            ++var9;
                            if (var9 >= var11) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 107) {
            method211((byte) -25, -84, -89);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class28() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[[IIILjava/util/Random;BI)V")
    private final void method218(int arg0, int[][] arg1, int arg2, int arg3, Random arg4, byte arg5, int arg6) {
        if (arg5 == 112) {
            int var8 = this.field605 > 0 ? 4096 + -class3.method28(arg4, arg5 ^ 40, this.field605) : 4096;
            int var9 = this.field593 * this.field587 >> 12;
            ++field596;
            int var10 = this.field593 + -(var9 > 0 ? class3.method28(arg4, 86, var9) : 0);
            if (class202.field3603 <= arg0) {
                arg0 -= class202.field3603;
            }
            if (~var10 >= -1) {
                if (arg0 + arg3 <= class202.field3603) {
                    for (int var11 = 0; ~arg6 < ~var11; ++var11) {
                        class145.method923(arg1[arg2 + var11], arg0, arg3, var8);
                    }
                } else {
                    int var12 = -arg0 + class202.field3603;
                    for (int var13 = 0; arg6 > var13; ++var13) {
                        int[] var14 = arg1[arg2 + var13];
                        class145.method923(var14, arg0, var12, var8);
                        class145.method923(var14, 0, -var12 + arg3, var8);
                    }
                }
            } else if (arg6 > 0 && arg3 > 0) {
                int var15 = arg3 / 2;
                int var16 = ~var15 > ~var10 ? var15 : var10;
                int var17 = arg6 / 2;
                int var18 = arg0 - -var16;
                int var19 = -(var16 * 2) + arg3;
                int var20 = ~var17 > ~var10 ? var17 : var10;
                for (int var21 = 0; ~var21 > ~arg6; ++var21) {
                    int[] var22 = arg1[arg2 + var21];
                    if (var21 < var20) {
                        int var23 = var8 * var21 / var20;
                        if (~this.field588 == -1) {
                            for (int var24 = 0; ~var24 > ~var16; ++var24) {
                                int var25 = var8 * var24 / var16;
                                var22[class26.method206(arg0 + var24, class78.field1510)] = var22[class26.method206(class78.field1510, arg0 + arg3 + -var24 + -1)] = var23 * var25 >> 12;
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~var16; ++var26) {
                                int var28 = var8 * var26 / var16;
                                var22[class26.method206(arg0 + var26, class78.field1510)] = var22[class26.method206(class78.field1510, -var26 + -1 + arg0 + arg3)] = ~var28 <= ~var23 ? var23 : var28;
                            }
                        }
                        if (~(var18 + var19) < ~class202.field3603) {
                            int var27 = -var18 + class202.field3603;
                            class145.method923(var22, var18, var27, var23);
                            class145.method923(var22, 0, -var27 + var19, var23);
                        } else {
                            class145.method923(var22, var18, var19, var23);
                        }
                    } else {
                        int var29 = arg6 - (var21 + 1);
                        if (~var29 > ~var20) {
                            int var30 = var8 * var29 / var20;
                            if (this.field588 == 0) {
                                for (int var31 = 0; ~var31 > ~var16; ++var31) {
                                    int var32 = var8 * var31 / var16;
                                    var22[class26.method206(class78.field1510, arg0 + var31)] = var22[class26.method206(class78.field1510, arg0 + arg3 + -var31 + -1)] = var30 * var32 >> 12;
                                }
                            } else {
                                for (int var33 = 0; var33 < var16; ++var33) {
                                    int var35 = var8 * var33 / var16;
                                    var22[class26.method206(arg0 + var33, class78.field1510)] = var22[class26.method206(class78.field1510, -var33 + arg3 + arg0 + -1)] = var35 < var30 ? var35 : var30;
                                }
                            }
                            if (var18 - -var19 <= class202.field3603) {
                                class145.method923(var22, var18, var19, var30);
                            } else {
                                int var34 = -var18 + class202.field3603;
                                class145.method923(var22, var18, var34, var30);
                                class145.method923(var22, 0, -var34 + var19, var30);
                            }
                        } else {
                            for (int var36 = 0; var16 > var36; ++var36) {
                                var22[class26.method206(class78.field1510, arg0 + var36)] = var22[class26.method206(class78.field1510, -var36 + arg0 - -arg3 - 1)] = var8 * var36 / var16;
                            }
                            if (~class202.field3603 <= ~(var18 + var19)) {
                                class145.method923(var22, var18, var19, var8);
                            } else {
                                int var37 = -var18 + class202.field3603;
                                class145.method923(var22, var18, var37, var8);
                                class145.method923(var22, 0, -var37 + var19, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(III)J")
    public static final long method219(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        return var3 != null && var3.field1400 != null ? var3.field1400.field1421 : 0L;
    }
}
