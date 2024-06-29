import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class103 {

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[I")
    private int[] field1687 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "[I")
    private int[] field1697 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Z")
    public boolean field1679;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "Lus;")
    private class308 field1705;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Lud;")
    private class86 field1695;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[[[B")
    private byte[][][] field1684;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "[[[B")
    private byte[][][] field1693;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "[[[B")
    private byte[][][] field1689;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "[[[B")
    private byte[][][] field1703;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "[[[I")
    public int[][][] field1692;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "[[[B")
    public byte[][][] field1700;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "Leda;")
    public static class116 field1701 = new class116(13, 0);

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "Leda;")
    public static class116 field1704 = new class116(58, 7);

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "Leda;")
    public static class116 field1707 = new class116(61, 6);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "Lhw;")
    public static class270 field1708;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "Lrg;")
    public static class525 field1706;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "[[[B")
    public byte[][][] field1696;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZIIIILek;IIIII)V")
    private final void method859(boolean arg0, int arg1, int arg2, int arg3, int arg4, class465 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg1 == 1) {
            arg4 = 1;
        } else if (arg1 == 2) {
            arg4 = 1;
            arg10 = 1;
        } else if (arg1 == 3) {
            arg10 = 1;
        }
        if (arg8 != -49) {
            this.method869(null, null, null, -66, -117, null, null);
        }
        field1688++;
        if (arg7 < 0 || arg7 >= this.field1698 || arg3 < 0 || this.field1702 <= arg3) {
            while (true) {
                int var14 = arg5.method2705(arg8 ^ 0x11);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg5.method2705(-107);
                    return;
                }
                if (var14 <= 49) {
                    arg5.method2705(-99);
                }
            }
        }
        if (!this.field1679 && !arg0) {
            class548.field8052[arg9][arg7][arg3] = 0;
        }
        while (true) {
            int var12 = arg5.method2705(-21);
            if (var12 == 0) {
                if (this.field1679) {
                    this.field1692[0][arg7 + arg10][arg3 + arg4] = 0;
                    return;
                } else if (arg9 == 0) {
                    this.field1692[0][arg7 + arg10][arg3 + arg4] = -class416.method2473(arg6 + 556238, arg2 + 932731, -43) * 8 << 2;
                    return;
                } else {
                    this.field1692[arg9][arg7 + arg10][arg3 + arg4] = this.field1692[arg9 - 1][arg7 + arg10][arg3 + arg4] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg5.method2705(-92);
                if (!this.field1679) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg9 == 0) {
                        this.field1692[0][arg7 + arg10][arg3 + arg4] = -var13 * 8 << 2;
                        return;
                    }
                    this.field1692[arg9][arg7 + arg10][arg3 + arg4] = this.field1692[arg9 - 1][arg7 + arg10][arg3 + arg4] - (var13 * 8 << 2);
                    return;
                }
                this.field1692[0][arg7 + arg10][arg3 + arg4] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg0) {
                    arg5.method2705(-85);
                } else {
                    this.field1684[arg9][arg7][arg3] = arg5.method2712(-73);
                    this.field1689[arg9][arg7][arg3] = (byte) ((var12 - 2) / 4);
                    this.field1693[arg9][arg7][arg3] = (byte) class248.method1593(var12 + arg1 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field1679 && !arg0) {
                    class548.field8052[arg9][arg7][arg3] = (byte) (var12 - 49);
                }
            } else if (!arg0) {
                this.field1703[arg9][arg7][arg3] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lr;Li;Li;I)V")
    public final void method860(class98 arg0, class682 arg1, class682 arg2, int arg3) {
        field1686++;
        if (class275.field3909 == null || class275.field3909.length != this.field1702) {
            class355.field4981 = new int[this.field1702];
            class382.field5412 = new int[this.field1702];
            class528.field7731 = new int[this.field1702];
            class666.field9357 = new int[this.field1702];
            class275.field3909 = new int[this.field1702];
        }
        int[][] var5 = new int[this.field1698][this.field1702];
        if (arg3 != 3) {
            this.field1702 = 100;
        }
        for (int var6 = 0; var6 < this.field1683; var6++) {
            for (int var8 = 0; var8 < this.field1702; var8++) {
                class275.field3909[var8] = 0;
                class382.field5412[var8] = 0;
                class666.field9357[var8] = 0;
                class355.field4981[var8] = 0;
                class528.field7731[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field1698; var9++) {
                for (int var10 = 0; var10 < this.field1702; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field1698 > var19) {
                        int var20 = this.field1703[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class177 var21 = this.field1705.method1868(var20 - 1, arg3 + -2);
                            class275.field3909[var10] += var21.field2817;
                            class382.field5412[var10] += var21.field2826;
                            class666.field9357[var10] += var21.field2823;
                            class355.field4981[var10] += var21.field2829;
                            var10002 = class528.field7731[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field1703[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class177 var24 = this.field1705.method1868(var23 - 1, 1);
                            class275.field3909[var10] -= var24.field2817;
                            class382.field5412[var10] -= var24.field2826;
                            class666.field9357[var10] -= var24.field2823;
                            class355.field4981[var10] -= var24.field2829;
                            var10002 = class528.field7731[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field1702; var16++) {
                        int var17 = var16 + 5;
                        if (this.field1702 > var17) {
                            var13 += class666.field9357[var17];
                            var12 += class382.field5412[var17];
                            var14 += class355.field4981[var17];
                            var11 += class275.field3909[var17];
                            var15 += class528.field7731[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class275.field3909[var18];
                            var12 -= class382.field5412[var18];
                            var13 -= class666.field9357[var18];
                            var15 -= class528.field7731[var18];
                            var14 -= class355.field4981[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class503.method3001(var12 / var15, var11 * 256 / var14, var13 / var15, class565.method3310(arg3, 5));
                        }
                    }
                }
            }
            if (class542.field7984) {
                this.method862(true, class687.field9745[var6], var6, arg0, var6 == 0 ? arg1 : null, var5, var6 == 0 ? arg2 : null);
            } else {
                this.method869(arg0, var6 == 0 ? arg2 : null, var5, var6, arg3 - 4, var6 == 0 ? arg1 : null, class687.field9745[var6]);
            }
            this.field1703[var6] = null;
            this.field1684[var6] = null;
            this.field1689[var6] = null;
            this.field1693[var6] = null;
        }
        if (!this.field1679) {
            if (class74.field1175 != 0) {
                class62.method518();
            }
            if (class363.field5056) {
                class487.method2848();
            }
        }
        for (int var7 = 0; var7 < this.field1683; var7++) {
            class687.field9745[var7].method1371();
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIII)V")
    public final void method861(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg0; var6 < this.field1683; var6++) {
            this.method865(arg3, var6, arg2, arg4, true, arg1);
        }
        field1678++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLi;ILr;Li;[[ILi;)V")
    private final void method862(boolean arg0, class682 arg1, int arg2, class98 arg3, class682 arg4, int[][] arg5, class682 arg6) {
        field1690++;
        byte[][] var8 = this.field1689[arg2];
        if (!arg0) {
            return;
        }
        byte[][] var9 = this.field1693[arg2];
        byte[][] var10 = this.field1703[arg2];
        byte[][] var11 = this.field1684[arg2];
        for (int var12 = 0; var12 < this.field1698; var12++) {
            int var13 = this.field1698 - 1 <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field1702; var14++) {
                int var15 = this.field1702 - 1 <= var14 ? var14 : var14 + 1;
                if (class447.field6461 == -1 || class470.method2774(var12, 75, var14, class447.field6461, arg2)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class219 var26 = var21 == 0 ? null : this.field1695.method647(4, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class177 var27 = var22 == 0 ? null : this.field1705.method1868(var22 - 1, 1);
                        class219 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3290 == -1 && var26.field3283 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3291;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field1698 > var12 && this.field1702 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var33++;
                            } else {
                                var34--;
                                var33--;
                            }
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var33--;
                                var36--;
                            }
                            int var37 = var33 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg1.method3858(var14, var12, (byte) 106) - arg1.method3858(var15, var13, (byte) 47);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg1.method3858(var14, var13, (byte) 34) - arg1.method3858(var15, var12, (byte) 36);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class323.field4499[var39] = -1;
                            class528.field7801[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3291 ? class397.field5753[var19] : class28.field400[var19];
                        this.method871(var14, var18, var12, this.field1702, var11, this.field1698, var27, arg3, var19, var9, true, var8, var20, var26);
                        boolean var41 = var26 != null && var26.field3290 != var26.field3283;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class323.field4499[var42] >= 0 && class695.field9874[var42] != class455.field6542[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class702.method3944(var18[1], class248.method1593(class528.field7801[2], class528.field7801[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class702.method3944(var18[3], class248.method1593(class528.field7801[6], class528.field7801[0]) == 0);
                        }
                        if (!var40[-(-var20) & 0x3]) {
                            var18[0] = class702.method3944(var18[0], class248.method1593(class528.field7801[0], class528.field7801[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class702.method3944(var18[2], class248.method1593(class528.field7801[6], class528.field7801[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = class572.field8417[var19];
                            var46 = class541.field7944[var19];
                            var47 = var26 == null ? 0 : class218.field3274[var19];
                            var48 = var27 == null ? 0 : class3.field40[var19];
                            var49 = class431.field6137[var19];
                        } else if (var17) {
                            var47 = var26 == null ? 0 : class305.field4258[var19];
                            var48 = var27 == null ? 0 : class78.field1199[var19];
                            var49 = class27.field387[var19];
                            var46 = class269.field3829[var19];
                            var45 = class309.field4297[var19];
                            var44 = class515.field7632[var19];
                        } else {
                            var49 = class265.field3817[var19];
                            var46 = class676.field9628[var19];
                            var45 = class676.field9624[var19];
                            var44 = class358.field5001[var19];
                            var47 = var26 == null ? 0 : class168.field2749[var19];
                            var48 = var27 == null ? 0 : class278.field3936[var19];
                        }
                        int var50 = var47 + var48;
                        if (var50 <= 0) {
                            class526.method3099(arg2, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg4 == null ? null : new int[var53];
                            int[] var61 = arg4 == null && arg6 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var63 = var26.field3284;
                                var62 = var26.field3290;
                                var64 = var26.field3289;
                                int var65 = class646.method3625(var26, arg3, -55);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class371.field5144[0] = var45[var51];
                                        class371.field5144[1] = 1;
                                        class371.field5144[2] = var46[var51];
                                        class371.field5144[3] = 1;
                                        class371.field5144[4] = var49[var51];
                                        class371.field5144[5] = var46[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class371.field5144[0] = var45[var51];
                                        class371.field5144[1] = 5;
                                        class371.field5144[2] = var46[var51];
                                        class371.field5144[3] = 5;
                                        class371.field5144[4] = var49[var51];
                                        var68 = 6;
                                        class371.field5144[5] = var46[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class371.field5144[0] = var45[var51];
                                        class371.field5144[1] = 3;
                                        class371.field5144[2] = var46[var51];
                                        class371.field5144[3] = 3;
                                        class371.field5144[4] = var49[var51];
                                        class371.field5144[5] = var46[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class371.field5144[0] = var45[var51];
                                        class371.field5144[1] = 7;
                                        class371.field5144[2] = var46[var51];
                                        class371.field5144[3] = 7;
                                        class371.field5144[4] = var49[var51];
                                        class371.field5144[5] = var46[var51];
                                        var68 = 6;
                                    } else {
                                        class371.field5144[0] = var45[var51];
                                        class371.field5144[1] = var49[var51];
                                        var68 = 3;
                                        class371.field5144[2] = var46[var51];
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class371.field5144[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field1697[var70];
                                        int var73 = this.field1687[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 2) {
                                            var75 = 512 - var73;
                                            var74 = 512 - var72;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 512 - var73;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class104.field1717[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg4.method3861((byte) 85, var76, var77) - arg1.method3861((byte) 111, var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class104.field1717[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg1.method3861((byte) 80, var78, var79) - arg4.method3861((byte) -90, var78, var79);
                                            } else if (arg6 != null && !class468.field6753[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg6.method3861((byte) -7, var80, var81) - arg1.method3861((byte) -3, var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && class323.field4499[var71] > var26.field3287) {
                                            if (var54 != null) {
                                                var54[var52] = class455.field6542[var71];
                                            }
                                            var59[var52] = class45.field606[var71];
                                            var58[var52] = class448.field6466[var71];
                                            var57[var52] = class695.field9874[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field3284;
                                            var59[var52] = var26.field3289;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field1679 && arg2 == 0) {
                                    class102.method854(var12, var14, var26.field3288, var26.field3292 * 8, var26.field3295);
                                }
                                if (var19 != 12 && var26.field3290 != -1 && var26.field3285) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class218.field3274[var19];
                            } else if (var17) {
                                var51 += class305.field4258[var19];
                            } else {
                                var51 += class168.field2749[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class177 var82 = this.field1705.method1868(var22 - 1, 1);
                                class177 var83 = this.field1705.method1868(var23 - 1, 1);
                                class177 var84 = this.field1705.method1868(var24 - 1, 1);
                                class177 var85 = this.field1705.method1868(var25 - 1, 1);
                                for (int var86 = 0; var86 < var48; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class371.field5144[0] = var45[var51];
                                        class371.field5144[1] = 1;
                                        class371.field5144[2] = var46[var51];
                                        class371.field5144[3] = 1;
                                        class371.field5144[4] = var49[var51];
                                        var88 = 6;
                                        class371.field5144[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class371.field5144[0] = var45[var51];
                                        class371.field5144[1] = 5;
                                        class371.field5144[2] = var46[var51];
                                        class371.field5144[3] = 5;
                                        class371.field5144[4] = var49[var51];
                                        class371.field5144[5] = var46[var51];
                                        var88 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class371.field5144[0] = var45[var51];
                                        class371.field5144[1] = 3;
                                        class371.field5144[2] = var46[var51];
                                        class371.field5144[3] = 3;
                                        class371.field5144[4] = var49[var51];
                                        var88 = 6;
                                        class371.field5144[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class371.field5144[0] = var45[var51];
                                        class371.field5144[1] = 7;
                                        class371.field5144[2] = var46[var51];
                                        class371.field5144[3] = 7;
                                        class371.field5144[4] = var49[var51];
                                        class371.field5144[5] = var46[var51];
                                        var88 = 6;
                                    } else {
                                        class371.field5144[0] = var45[var51];
                                        class371.field5144[1] = var49[var51];
                                        var88 = 3;
                                        class371.field5144[2] = var46[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class371.field5144[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field1697[var90];
                                        int var93 = this.field1687[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var92;
                                            var95 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 512 - var93;
                                        } else {
                                            var94 = var92;
                                            var95 = var93;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class104.field1717[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg4.method3861((byte) 115, var96, var97) - arg1.method3861((byte) -123, var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class104.field1717[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg1.method3861((byte) -15, var98, var99) - arg4.method3861((byte) -109, var98, var99);
                                            } else if (arg6 != null && !class468.field6753[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg6.method3861((byte) -25, var100, var101) - arg1.method3861((byte) 76, var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class323.field4499[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class455.field6542[var91];
                                            }
                                            var59[var52] = class45.field606[var91];
                                            var58[var52] = class448.field6466[var91];
                                            var57[var52] = class695.field9874[var91];
                                        } else {
                                            if (var17 && class104.field1717[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg5[var12][var14];
                                                var58[var52] = var82.field2828;
                                                var59[var52] = var82.field2819;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg5[var12][var15];
                                                var58[var52] = var83.field2828;
                                                var59[var52] = var83.field2819;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg5[var13][var15];
                                                var58[var52] = var84.field2828;
                                                var59[var52] = var84.field2819;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg5[var13][var14];
                                                var58[var52] = var85.field2828;
                                                var59[var52] = var85.field2819;
                                            } else {
                                                if (var94 >= 256) {
                                                    if (var95 >= 256) {
                                                        var58[var52] = var84.field2828;
                                                        var59[var52] = var84.field2819;
                                                    } else {
                                                        var58[var52] = var85.field2828;
                                                        var59[var52] = var85.field2819;
                                                    }
                                                } else if (var95 >= 256) {
                                                    var58[var52] = var83.field2828;
                                                    var59[var52] = var83.field2819;
                                                } else {
                                                    var58[var52] = var82.field2828;
                                                    var59[var52] = var82.field2819;
                                                }
                                                int var102 = class392.method2383(arg5[var13][var14], arg5[var12][var14], var94 << 7 >> 9, (byte) -86);
                                                int var103 = class392.method2383(arg5[var13][var15], arg5[var12][var15], var94 << 7 >> 9, (byte) -55);
                                                var57[var52] = class392.method2383(var103, var102, var95 << 7 >> 9, (byte) -72);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field2822) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg1.method3858(var14, var12, (byte) 56);
                            int var105 = arg1.method3858(var14, var13, (byte) 63);
                            int var106 = arg1.method3858(var15, var13, (byte) 24);
                            int var107 = arg1.method3858(var15, var12, (byte) 70);
                            boolean var108 = class151.method1151(var14, var12, (byte) -49);
                            if (var108 && arg2 > 1 || !var108 && arg2 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field2820) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field3293) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field1700[arg2][var12][var14] = (byte) class460.method2676(this.field1700[arg2][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field1679) {
                                var110 = class152.method1154(var12, var14);
                                var111 = class62.method517(var12, var14);
                                var112 = class626.method3531(var12, var14);
                            }
                            arg1.method1365(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class526.method3099(arg2, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static void method863(boolean arg0) {
        if (arg0) {
            return;
        }
        field1701 = null;
        field1704 = null;
        field1707 = null;
        field1706 = null;
        field1708 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILek;I[Lnea;III)V")
    public final void method864(int arg0, class465 arg1, int arg2, class538[] arg3, int arg4, int arg5, int arg6) {
        if (!this.field1679) {
            for (int var8 = 0; var8 < 4; var8++) {
                class538 var9 = arg3[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg2 + var10;
                        int var13 = arg0 + var11;
                        if (var12 >= 0 && var12 < this.field1698 && var13 >= 0 && var13 < this.field1702) {
                            var9.method3159((byte) -91, var12, var13);
                        }
                    }
                }
            }
        }
        field1680++;
        int var14 = arg2 + arg6;
        int var15 = arg0 + arg5;
        int var16 = 94 / ((arg4 - 68) / 32);
        for (int var17 = 0; var17 < this.field1683; var17++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method859(false, 0, var14 + var18, arg0 + var19, 0, arg1, var15 + var19, arg2 + var18, -49, var17, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIZI)V")
    private final void method865(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1694++;
        if (!arg4) {
            field1707 = null;
        }
        for (int var7 = arg3; var7 < arg0 + arg3; var7++) {
            for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
                if (var10 >= 0 && var10 < this.field1698 && var7 >= 0 && this.field1702 > var7) {
                    this.field1692[arg1][var10][var7] = arg1 > 0 ? this.field1692[arg1 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < this.field1698) {
            for (int var8 = arg3 + 1; var8 < (arg0 + arg3); var8++) {
                if (var8 >= 0 && var8 < this.field1702) {
                    this.field1692[arg1][arg2][var8] = this.field1692[arg1][arg2 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && this.field1702 > arg3) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg5; var9++) {
                if (var9 >= 0 && this.field1698 > var9) {
                    this.field1692[arg1][var9][arg3] = this.field1692[arg1][var9][arg3 - 1];
                }
            }
        }
        if (arg2 < 0 || arg3 < 0 || this.field1698 <= arg2 || arg3 >= this.field1702) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 > 0 && this.field1692[arg1][arg2 - 1][arg3] != 0) {
                this.field1692[arg1][arg2][arg3] = this.field1692[arg1][arg2 - 1][arg3];
                return;
            }
            if (arg3 > 0 && this.field1692[arg1][arg2][arg3 - 1] != 0) {
                this.field1692[arg1][arg2][arg3] = this.field1692[arg1][arg2][arg3 - 1];
                return;
            }
            if (arg2 > 0 && arg3 > 0 && this.field1692[arg1][arg2 - 1][arg3 - 1] != 0) {
                this.field1692[arg1][arg2][arg3] = this.field1692[arg1][arg2 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg2 > 0 && this.field1692[arg1 - 1][arg2 - 1][arg3] != this.field1692[arg1][arg2 - 1][arg3]) {
            this.field1692[arg1][arg2][arg3] = this.field1692[arg1][arg2 - 1][arg3];
            return;
        }
        if (arg3 > 0 && this.field1692[arg1 - 1][arg2][arg3 - 1] != this.field1692[arg1][arg2][arg3 - 1]) {
            this.field1692[arg1][arg2][arg3] = this.field1692[arg1][arg2][arg3 - 1];
            return;
        }
        if (arg2 > 0 && arg3 > 0 && this.field1692[arg1 - 1][arg2 - 1][arg3 - 1] != this.field1692[arg1][arg2 - 1][arg3 - 1]) {
            this.field1692[arg1][arg2][arg3] = this.field1692[arg1][arg2 - 1][arg3 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([[[ILr;Z[Lnea;)V")
    public final void method866(int[][][] arg0, class98 arg1, boolean arg2, class538[] arg3) {
        if (!this.field1679) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1698; var6++) {
                    for (int var7 = 0; var7 < this.field1702; var7++) {
                        if ((class548.field8052[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class548.field8052[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method3158(0, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        field1691++;
        if (arg2) {
            return;
        }
        for (int var9 = 0; var9 < this.field1683; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field1679) {
                if (class167.field2739) {
                    var11 |= 0x8;
                }
                if (class363.field5056) {
                    var10 |= 0x2;
                }
                if (class74.field1175 != 0) {
                    if (var9 == 0 | class73.field1168) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class363.field5056) {
                var11 |= 0x7;
            }
            if (!class701.field9925) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || arg0.length <= var9 ? this.field1692[var9] : arg0[var9];
            class117.method938(var9, arg1.method768(this.field1698, this.field1702, this.field1692[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lis;ILis;)V")
    public static final void method867(class101 arg0, int arg1, class101 arg2) {
        class498.field7414++;
        field1682++;
        if (arg1 != -1) {
            method863(true);
        }
        class699 var3 = class452.method2630(class699.field9897, class550.field8069, (byte) 121);
        var3.field9908.method2733(false, arg2.field1577);
        var3.field9908.method2700(arg0.field1565, 0);
        var3.field9908.method2739((byte) -86, arg2.field1528);
        var3.field9908.method2741(arg0.field1577, -1147494600);
        var3.field9908.method2702((byte) 28, arg0.field1528);
        var3.field9908.method2700(arg2.field1565, 0);
        class149.method1134(var3, true);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLek;IIIIIII[Lnea;)V")
    public final void method868(byte arg0, class465 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class538[] arg9) {
        field1681++;
        int var11 = (arg3 & 0x7) * 8;
        int var12 = (arg6 & 0x7) * 8;
        if (!this.field1679) {
            class538 var13 = arg9[arg7];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg5 + class70.method577(arg8, var14 & 0x7, var15 & 0x7, (byte) 125);
                    int var17 = class112.method910(var15 & 0x7, var14 & 0x7, arg8, (byte) -17) + arg2;
                    if (var16 > 0 && (this.field1698 - 1) > var16 && var17 > 0 && var17 < this.field1702 - 1) {
                        var13.method3159((byte) -91, var16, var17);
                    }
                }
            }
        }
        if (arg0 < 21) {
            this.field1695 = null;
        }
        int var18 = (arg3 & 0xFFFFFFF8) << 3;
        int var19 = (arg6 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field1683; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg4 == var22 && var11 <= var23 && var23 <= var11 + 8 && var24 >= var12 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var12 + 8) == var24) {
                            if (arg8 == 0) {
                                var26 = arg2 + var24 - var12;
                                var25 = var23 + arg5 - var11;
                            } else if (arg8 == 1) {
                                var26 = var11 + (arg2 - -8) - var23;
                                var25 = arg5 + var24 - var12;
                            } else if (arg8 == 2) {
                                var25 = arg5 + var11 + 8 - var23;
                                var26 = var12 + arg2 + 8 - var24;
                            } else {
                                var25 = arg5 - var24 - (-var12 - 8);
                                var26 = arg2 + var23 - var11;
                            }
                            this.method859(true, 0, var18 + var23, var26, 0, arg1, var19 + var24, var25, -49, arg7, 0);
                        } else {
                            var25 = arg5 + class70.method577(arg8, var23 & 0x7, var24 & 0x7, (byte) -69);
                            var26 = class112.method910(var24 & 0x7, var23 & 0x7, arg8, (byte) -17) + arg2;
                            this.method859(false, arg8, var18 + var23, var26, var21, arg1, var19 + var24, var25, -49, arg7, var20);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var30 = var24 == 63 ? 64 : var24;
                                    var29 = var23 == 63 ? 64 : var23;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg8 == 0) {
                                    var32 = arg2 + var30 - var12;
                                    var31 = var29 + arg5 - var11;
                                } else if (arg8 == 1) {
                                    var31 = arg5 + var30 - var12;
                                    var32 = var11 - (var29 - arg2 - 8);
                                } else if (arg8 == 2) {
                                    var32 = arg2 + var12 + 8 - var30;
                                    var31 = arg5 + 8 - (-var11 + var29);
                                } else {
                                    var31 = arg5 + 8 - (-var12 + var30);
                                    var32 = arg2 + var29 - var11;
                                }
                                if (var31 >= 0 && var31 < this.field1698 && var32 >= 0 && this.field1702 > var32) {
                                    this.field1692[arg7][var31][var32] = this.field1692[arg7][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method859(false, 0, 0, -1, 0, arg1, 0, -1, -49, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lr;Li;[[IIILi;Li;)V")
    private final void method869(class98 arg0, class682 arg1, int[][] arg2, int arg3, int arg4, class682 arg5, class682 arg6) {
        int var8 = 0;
        if (arg4 != -1) {
            this.method871(-14, null, -39, -3, null, -78, null, null, 78, null, false, null, 1, null);
        }
        while (this.field1698 > var8) {
            for (int var9 = 0; var9 < this.field1702; var9++) {
                if (class447.field6461 == -1 || class470.method2774(var8, 42, var9, class447.field6461, arg3)) {
                    byte var10 = this.field1689[arg3][var8][var9];
                    byte var11 = this.field1693[arg3][var8][var9];
                    int var12 = this.field1684[arg3][var8][var9] & 0xFF;
                    int var13 = this.field1703[arg3][var8][var9] & 0xFF;
                    class219 var14 = var12 == 0 ? null : this.field1695.method647(arg4 ^ 0xFFFFFFFB, var12 - 1);
                    class177 var15 = var13 == 0 ? null : this.field1705.method1868(var13 - 1, 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class3.field40[var10];
                        var17 = var14 == null ? 0 : class218.field3274[var10];
                    } else if (var14 != null) {
                        var17 = class218.field3274[var10];
                    } else if (var15 != null) {
                        var16 = class218.field3274[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20;
                        if (class412.field5868) {
                            var20 = var14 == null ? -1 : var14.field3284;
                        } else {
                            var20 = -1;
                        }
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        boolean var25 = false;
                        if (var14 != null && (var14.field3290 != -1 || var14.field3283 != -1 || var20 != -1)) {
                            for (int var26 = 0; var26 < var17; var26++) {
                                var23[var19] = var20;
                                var24[var19] = var14.field3289;
                                if (var14.field3290 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field3290;
                                }
                                if (var14.field3283 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field3283;
                                    var25 = true;
                                }
                                var19++;
                            }
                            if (!this.field1679 && arg3 == 0) {
                                class102.method854(var8, var9, var14.field3288, var14.field3292 * 8, var14.field3295);
                            }
                        } else {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        }
                        if (!var25) {
                            var22 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field2828;
                            if (class412.field5868) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var23[var19] = var29;
                                var24[var19] = var15.field2819;
                                var21[var19] = arg2[var8][var9];
                                if (var22 != null) {
                                    var22[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field1697.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg5 == null ? null : new int[var31];
                        int[] var35 = arg5 == null && arg1 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var46 = this.field1697[var36];
                            int var47 = this.field1687[var36];
                            if (var11 == 0) {
                                var32[var36] = var46;
                                var33[var36] = var47;
                            } else if (var11 == 1) {
                                var32[var36] = var47;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var46;
                                var33[var36] = 512 - var47;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var47;
                                var33[var36] = var46;
                            }
                            if (var34 != null && class104.field1717[var10][var36]) {
                                int var50 = (var8 << 9) + var46;
                                int var51 = (var9 << 9) + var46;
                                var34[var36] = arg5.method3861((byte) 98, var50, var51) - arg6.method3861((byte) 94, var50, var51);
                            }
                            if (var35 != null) {
                                if (arg5 != null && !class104.field1717[var10][var36]) {
                                    int var52 = (var8 << 9) + var46;
                                    int var53 = (var9 << 9) + var46;
                                    var35[var36] = arg6.method3861((byte) -103, var52, var53) - arg5.method3861((byte) 95, var52, var53);
                                } else if (arg1 != null && !class468.field6753[var10][var36]) {
                                    int var54 = (var8 << 9) + var46;
                                    int var55 = (var9 << 9) + var46;
                                    var35[var36] = arg1.method3861((byte) 82, var54, var55) - arg6.method3861((byte) 107, var54, var55);
                                }
                            }
                        }
                        int var37 = arg6.method3858(var9, var8, (byte) 42);
                        int var38 = arg6.method3858(var9, var8 + 1, (byte) 125);
                        int var39 = arg6.method3858(var9 + 1, var8 + 1, (byte) 33);
                        int var40 = arg6.method3858(var9 + 1, var8, (byte) 116);
                        boolean var41 = class151.method1151(var9, var8, (byte) -49);
                        if (var41 && arg3 > 1 || !var41 && arg3 > 0) {
                            boolean var42 = true;
                            if (var15 != null && !var15.field2820) {
                                var42 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var42 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field3293) {
                                var42 = false;
                            }
                            if (var42 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field1700[arg3][var8][var9] = (byte) class460.method2676(this.field1700[arg3][var8][var9], 4);
                            }
                        }
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        if (this.field1679) {
                            var43 = class152.method1154(var8, var9);
                            var44 = class62.method517(var8, var9);
                            var45 = class626.method3531(var8, var9);
                        }
                        arg6.method1364(var8, var9, var32, var34, var33, var35, class572.field8417[var10], class431.field6137[var10], class541.field7944[var10], var21, var22, var23, var24, var43, var44, var45, false);
                        class526.method3099(arg3, var8, var9);
                    }
                }
            }
            var8++;
        }
        field1699++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([[III)V")
    public final void method870(int[][] arg0, int arg1, int arg2) {
        field1685++;
        int[][] var4 = this.field1692[arg2];
        for (int var5 = 0; var5 < this.field1698 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field1702 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
        if (arg1 != 2) {
            this.method864(1, null, -29, null, 106, 65, -116);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIZLud;Lus;)V")
    public class103(int arg0, int arg1, int arg2, boolean arg3, class86 arg4, class308 arg5) {
        this.field1679 = arg3;
        this.field1705 = arg5;
        this.field1698 = arg1;
        this.field1683 = arg0;
        this.field1695 = arg4;
        this.field1702 = arg2;
        this.field1684 = new byte[this.field1683][this.field1698][this.field1702];
        this.field1693 = new byte[this.field1683][this.field1698][this.field1702];
        this.field1689 = new byte[this.field1683][this.field1698][this.field1702];
        this.field1703 = new byte[this.field1683][this.field1698][this.field1702];
        this.field1692 = new int[this.field1683][this.field1698 + 1][this.field1702 + 1];
        this.field1700 = new byte[this.field1683][this.field1698 + 1][this.field1702 + 1];
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[ZII[[BILb;Lr;I[[BZ[[BILch;)V")
    private final void method871(int arg0, boolean[] arg1, int arg2, int arg3, byte[][] arg4, int arg5, class177 arg6, class98 arg7, int arg8, byte[][] arg9, boolean arg10, byte[][] arg11, int arg12, class219 arg13) {
        if (!arg10) {
            this.field1702 = 97;
        }
        field1677++;
        boolean[] var15 = arg13 != null && arg13.field3291 ? class397.field5753[arg8] : class28.field400[arg8];
        if (arg0 > 0) {
            if (arg2 > 0) {
                int var16 = arg4[arg2 - 1][arg0 - 1] & 0xFF;
                if (var16 > 0) {
                    class219 var17 = this.field1695.method647(4, var16 - 1);
                    if (var17.field3290 != -1 && var17.field3291) {
                        byte var18 = arg11[arg2 - 1][arg0 - 1];
                        int var19 = arg9[arg2 - 1][arg0 - 1] * 2 + 4 & 0x7;
                        int var20 = class646.method3625(var17, arg7, -78);
                        if (class104.field1717[var18][var19]) {
                            class695.field9874[0] = var17.field3290;
                            class455.field6542[0] = var20;
                            class448.field6466[0] = var17.field3284;
                            class45.field606[0] = var17.field3289;
                            class323.field4499[0] = var17.field3287;
                            class528.field7801[0] = 256;
                        }
                    }
                }
            }
            if (arg2 < (arg5 - 1)) {
                int var21 = arg4[arg2 + 1][arg0 - 1] & 0xFF;
                if (var21 > 0) {
                    class219 var22 = this.field1695.method647(4, var21 - 1);
                    if (var22.field3290 != -1 && var22.field3291) {
                        byte var23 = arg11[arg2 + 1][arg0 - 1];
                        int var24 = arg9[arg2 + 1][arg0 - 1] * 2 + 6 & 0x7;
                        int var25 = class646.method3625(var22, arg7, -94);
                        if (class104.field1717[var23][var24]) {
                            class695.field9874[2] = var22.field3290;
                            class455.field6542[2] = var25;
                            class448.field6466[2] = var22.field3284;
                            class45.field606[2] = var22.field3289;
                            class323.field4499[2] = var22.field3287;
                            class528.field7801[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg0 < arg3 - 1) {
            if (arg2 > 0) {
                int var26 = arg4[arg2 - 1][arg0 + 1] & 0xFF;
                if (var26 > 0) {
                    class219 var27 = this.field1695.method647(4, var26 - 1);
                    if (var27.field3290 != -1 && var27.field3291) {
                        byte var28 = arg11[arg2 - 1][arg0 + 1];
                        int var29 = arg9[arg2 - 1][arg0 + 1] * 2 + 2 & 0x7;
                        int var30 = class646.method3625(var27, arg7, -117);
                        if (class104.field1717[var28][var29]) {
                            class695.field9874[6] = var27.field3290;
                            class455.field6542[6] = var30;
                            class448.field6466[6] = var27.field3284;
                            class45.field606[6] = var27.field3289;
                            class323.field4499[6] = var27.field3287;
                            class528.field7801[6] = 64;
                        }
                    }
                }
            }
            if (arg5 - 1 > arg2) {
                int var31 = arg4[arg2 + 1][arg0 + 1] & 0xFF;
                if (var31 > 0) {
                    class219 var32 = this.field1695.method647(4, var31 - 1);
                    if (var32.field3290 != -1 && var32.field3291) {
                        byte var33 = arg11[arg2 + 1][arg0 + 1];
                        int var34 = -(-(arg9[arg2 + 1][arg0 + 1] * 2)) & 0x7;
                        int var35 = class646.method3625(var32, arg7, -62);
                        if (class104.field1717[var33][var34]) {
                            class695.field9874[4] = var32.field3290;
                            class455.field6542[4] = var35;
                            class448.field6466[4] = var32.field3284;
                            class45.field606[4] = var32.field3289;
                            class323.field4499[4] = var32.field3287;
                            class528.field7801[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var36 = arg4[arg2][arg0 - 1] & 0xFF;
            if (var36 > 0) {
                class219 var37 = this.field1695.method647(4, var36 - 1);
                if (var37.field3290 != -1) {
                    byte var38 = arg11[arg2][arg0 - 1];
                    byte var39 = arg9[arg2][arg0 - 1];
                    if (var37.field3291) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class646.method3625(var37, arg7, -62);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class104.field1717[var38][var41] && var37.field3287 >= class323.field4499[var40]) {
                                class695.field9874[var40] = var37.field3290;
                                class455.field6542[var40] = var42;
                                class448.field6466[var40] = var37.field3284;
                                class45.field606[var40] = var37.field3289;
                                if (class323.field4499[var40] == var37.field3287) {
                                    class528.field7801[var40] = class460.method2676(class528.field7801[var40], 32);
                                } else {
                                    class528.field7801[var40] = 32;
                                }
                                class323.field4499[var40] = var37.field3287;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg12 & 0x3]) {
                            arg1[0] = class397.field5753[var38][class248.method1593(var39 + 2, 3)];
                        }
                    } else if (!var15[arg12 & 0x3]) {
                        arg1[0] = class28.field400[var38][class248.method1593(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg3 - 1 > arg0) {
            int var44 = arg4[arg2][arg0 + 1] & 0xFF;
            if (var44 > 0) {
                class219 var45 = this.field1695.method647(4, var44 - 1);
                if (var45.field3290 != -1) {
                    byte var46 = arg11[arg2][arg0 + 1];
                    byte var47 = arg9[arg2][arg0 + 1];
                    if (var45.field3291) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class646.method3625(var45, arg7, -91);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class104.field1717[var46][var49] && var45.field3287 >= class323.field4499[var48]) {
                                class695.field9874[var48] = var45.field3290;
                                class455.field6542[var48] = var50;
                                class448.field6466[var48] = var45.field3284;
                                class45.field606[var48] = var45.field3289;
                                if (class323.field4499[var48] == var45.field3287) {
                                    class528.field7801[var48] = class460.method2676(class528.field7801[var48], 16);
                                } else {
                                    class528.field7801[var48] = 16;
                                }
                                class323.field4499[var48] = var45.field3287;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg12 + 2 & 0x3]) {
                            arg1[2] = class397.field5753[var46][class248.method1593(-(-var47), 3)];
                        }
                    } else if (!var15[arg12 + 2 & 0x3]) {
                        arg1[2] = class28.field400[var46][class248.method1593(-(-var47), 3)];
                    }
                }
            }
        }
        if (arg2 > 0) {
            int var52 = arg4[arg2 - 1][arg0] & 0xFF;
            if (var52 > 0) {
                class219 var53 = this.field1695.method647(4, var52 - 1);
                if (var53.field3290 != -1) {
                    byte var54 = arg11[arg2 - 1][arg0];
                    byte var55 = arg9[arg2 - 1][arg0];
                    if (var53.field3291) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class646.method3625(var53, arg7, -68);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class104.field1717[var54][var57] && class323.field4499[var56] <= var53.field3287) {
                                class695.field9874[var56] = var53.field3290;
                                class455.field6542[var56] = var58;
                                class448.field6466[var56] = var53.field3284;
                                class45.field606[var56] = var53.field3289;
                                if (class323.field4499[var56] == var53.field3287) {
                                    class528.field7801[var56] = class460.method2676(class528.field7801[var56], 8);
                                } else {
                                    class528.field7801[var56] = 8;
                                }
                                class323.field4499[var56] = var53.field3287;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg12 + 3 & 0x3]) {
                            arg1[3] = class397.field5753[var54][class248.method1593(3, var55 + 1)];
                        }
                    } else if (!var15[arg12 + 3 & 0x3]) {
                        arg1[3] = class28.field400[var54][class248.method1593(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg5 - 1 > arg2) {
            int var60 = arg4[arg2 + 1][arg0] & 0xFF;
            if (var60 > 0) {
                class219 var61 = this.field1695.method647(4, var60 - 1);
                if (var61.field3290 != -1) {
                    byte var62 = arg11[arg2 + 1][arg0];
                    byte var63 = arg9[arg2 + 1][arg0];
                    if (var61.field3291) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class646.method3625(var61, arg7, -65);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class104.field1717[var62][var65] && var61.field3287 >= class323.field4499[var64]) {
                                class695.field9874[var64] = var61.field3290;
                                class455.field6542[var64] = var66;
                                class448.field6466[var64] = var61.field3284;
                                class45.field606[var64] = var61.field3289;
                                if (class323.field4499[var64] == var61.field3287) {
                                    class528.field7801[var64] = class460.method2676(class528.field7801[var64], 4);
                                } else {
                                    class528.field7801[var64] = 4;
                                }
                                class323.field4499[var64] = var61.field3287;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg12 + 1 & 0x3]) {
                            arg1[1] = class397.field5753[var62][class248.method1593(var63 + 3, 3)];
                        }
                    } else if (!var15[arg12 + 1 & 0x3]) {
                        arg1[1] = class28.field400[var62][class248.method1593(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg13 == null) {
            return;
        }
        int var68 = class646.method3625(arg13, arg7, -94);
        if (!arg13.field3291) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg12 * 2) & 0x7;
            if (class104.field1717[arg8][var69] && class323.field4499[var70] <= arg13.field3287) {
                class695.field9874[var70] = arg13.field3290;
                class455.field6542[var70] = var68;
                class448.field6466[var70] = arg13.field3284;
                class45.field606[var70] = arg13.field3289;
                if (class323.field4499[var70] == arg13.field3287) {
                    class528.field7801[var70] = class460.method2676(class528.field7801[var70], 2);
                } else {
                    class528.field7801[var70] = 2;
                }
                class323.field4499[var70] = arg13.field3287;
            }
        }
        return;
    }
}
