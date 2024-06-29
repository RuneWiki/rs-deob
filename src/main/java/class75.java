import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class75 {

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "[I")
    private int[] field973 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "[I")
    private int[] field975 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "Z")
    public boolean field978;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lfe;")
    private class403 field954;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "Lam;")
    private class448 field980;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "[[[B")
    private byte[][][] field958;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "[[[B")
    private byte[][][] field957;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "[[[B")
    public byte[][][] field955;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "[[[I")
    public int[][][] field967;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "[[[B")
    private byte[][][] field965;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[[[B")
    private byte[][][] field951;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "[S")
    public static short[] field970;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "[[[B")
    public byte[][][] field956;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static void method647(byte arg0) {
        if (arg0 <= 15) {
            field972 = -58;
        }
        field970 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLya;ILta;Lta;Lta;[[I)V")
    private final void method648(byte arg0, class38 arg1, int arg2, class143 arg3, class143 arg4, class143 arg5, int[][] arg6) {
        field962++;
        byte[][] var8 = this.field958[arg2];
        byte[][] var9 = this.field957[arg2];
        byte[][] var10 = this.field965[arg2];
        byte[][] var11 = this.field951[arg2];
        if (arg0 > -71) {
            return;
        }
        for (int var12 = 0; var12 < this.field961; var12++) {
            int var13 = this.field961 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field952; var14++) {
                int var15 = var14 >= this.field952 - 1 ? var14 : var14 + 1;
                if (class140.field1810 == -1 || class471.method2842(arg2, (byte) -84, var12, class140.field1810, var14)) {
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
                        class196 var26 = var21 == 0 ? null : this.field954.method2381(4, var21 - 1);
                        class324 var27 = var22 == 0 ? null : this.field980.method2631(32768, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class196 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2544 == -1 && var26.field2532 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2527;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field961 && var14 < this.field952) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var32--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            int var37 = var33 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method399(var12, var14) - arg5.method399(var13, var15);
                                var38 = arg5.method399(var13, var14) - arg5.method399(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class196.field2523[var39] = -1;
                            class118.field1583[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2527 ? class201.field2615[var19] : class137.field1760[var19];
                        this.method657(var12, var20, var8, -55, var14, var19, var18, var11, this.field952, this.field961, var9, var27, var26, arg1);
                        boolean var41 = var26 != null && var26.field2544 != var26.field2532;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class196.field2523[var42] >= 0 && class477.field6986[var42] != class215.field2758[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class297.method1753(var18[1], class378.method2145(class118.field1583[4], class118.field1583[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class297.method1753(var18[3], class378.method2145(class118.field1583[0], class118.field1583[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class297.method1753(var18[0], class378.method2145(class118.field1583[0], class118.field1583[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class297.method1753(var18[2], class378.method2145(class118.field1583[4], class118.field1583[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var45 = class218.field2782[var19];
                            var46 = var26 == null ? 0 : class301.field3875[var19];
                            var47 = class429.field6093[var19];
                            var48 = class510.field7365[var19];
                            var49 = var27 == null ? 0 : class21.field308[var19];
                        } else if (var17) {
                            var47 = class521.field7546[var19];
                            var46 = var26 == null ? 0 : class352.field4519[var19];
                            var44 = class440.field6302[var19];
                            var45 = class525.field7758[var19];
                            var49 = var27 == null ? 0 : class528.field7786[var19];
                            var48 = class434.field6173[var19];
                        } else {
                            var48 = class479.field7010[var19];
                            var46 = var26 == null ? 0 : class453.field6539[var19];
                            var49 = var27 == null ? 0 : class11.field188[var19];
                            var45 = class507.field7302[var19];
                            var47 = class87.field1083[var19];
                            var44 = class384.field5060[var19];
                        }
                        int var50 = var46 + var49;
                        if (var50 <= 0) {
                            class178.method1138(arg2, var12, var14);
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
                            int[] var61 = arg4 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field2544;
                                var63 = arg1.method322() ? var26.field2535 : var26.field2524;
                                var64 = var26.field2522;
                                int var65 = class279.method1649(var26, arg1, 0);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class468.field6771[0] = var47[var51];
                                        class468.field6771[1] = 1;
                                        class468.field6771[2] = var45[var51];
                                        class468.field6771[3] = 1;
                                        class468.field6771[4] = var48[var51];
                                        var98 = 6;
                                        class468.field6771[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class468.field6771[0] = var47[var51];
                                        class468.field6771[1] = 5;
                                        class468.field6771[2] = var45[var51];
                                        class468.field6771[3] = 5;
                                        class468.field6771[4] = var48[var51];
                                        class468.field6771[5] = var45[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class468.field6771[0] = var47[var51];
                                        class468.field6771[1] = 3;
                                        class468.field6771[2] = var45[var51];
                                        class468.field6771[3] = 3;
                                        class468.field6771[4] = var48[var51];
                                        class468.field6771[5] = var45[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class468.field6771[0] = var47[var51];
                                        class468.field6771[1] = 7;
                                        class468.field6771[2] = var45[var51];
                                        class468.field6771[3] = 7;
                                        class468.field6771[4] = var48[var51];
                                        var98 = 6;
                                        class468.field6771[5] = var45[var51];
                                    } else {
                                        class468.field6771[0] = var47[var51];
                                        class468.field6771[1] = var48[var51];
                                        var98 = 3;
                                        class468.field6771[2] = var45[var51];
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class468.field6771[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field973[var100];
                                        int var103 = this.field975[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 2) {
                                            var104 = 128 - var102;
                                            var105 = 128 - var103;
                                        } else if (var20 == 3) {
                                            var105 = var102;
                                            var104 = 128 - var103;
                                        } else {
                                            var104 = var102;
                                            var105 = var103;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class196.field2526[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg4.method396(var106, var107) - arg5.method396(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class196.field2526[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg5.method396(var108, var109) - arg4.method396(var108, var109);
                                            } else if (arg3 != null && !class527.field7773[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg3.method396(var110, var111) - arg5.method396(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field2531 < class196.field2523[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class215.field2758[var101];
                                            }
                                            var59[var52] = class52.field694[var101];
                                            var58[var52] = class23.field342[var101];
                                            var57[var52] = class477.field6986[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg1.method322() ? var26.field2535 : var26.field2524;
                                            var59[var52] = var26.field2522;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field978 && arg2 == 0) {
                                    class33.method241(var12, var14, var26.field2533, var26.field2529 * 8, var26.field2525);
                                }
                                if (var19 != 12 && var26.field2544 != -1 && var26.field2540) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class301.field3875[var19];
                            } else if (var17) {
                                var51 += class352.field4519[var19];
                            } else {
                                var51 += class453.field6539[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class324 var67 = this.field980.method2631(32768, var22 - 1);
                                class324 var68 = this.field980.method2631(32768, var23 - 1);
                                class324 var69 = this.field980.method2631(32768, var24 - 1);
                                class324 var70 = this.field980.method2631(32768, var25 - 1);
                                for (int var71 = 0; var71 < var49; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class468.field6771[0] = var47[var51];
                                        class468.field6771[1] = 1;
                                        class468.field6771[2] = var45[var51];
                                        class468.field6771[3] = 1;
                                        class468.field6771[4] = var48[var51];
                                        class468.field6771[5] = var45[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class468.field6771[0] = var47[var51];
                                        class468.field6771[1] = 5;
                                        class468.field6771[2] = var45[var51];
                                        class468.field6771[3] = 5;
                                        class468.field6771[4] = var48[var51];
                                        var73 = 6;
                                        class468.field6771[5] = var45[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class468.field6771[0] = var47[var51];
                                        class468.field6771[1] = 3;
                                        class468.field6771[2] = var45[var51];
                                        class468.field6771[3] = 3;
                                        class468.field6771[4] = var48[var51];
                                        class468.field6771[5] = var45[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class468.field6771[0] = var47[var51];
                                        class468.field6771[1] = 7;
                                        class468.field6771[2] = var45[var51];
                                        class468.field6771[3] = 7;
                                        class468.field6771[4] = var48[var51];
                                        class468.field6771[5] = var45[var51];
                                        var73 = 6;
                                    } else {
                                        class468.field6771[0] = var47[var51];
                                        class468.field6771[1] = var48[var51];
                                        class468.field6771[2] = var45[var51];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class468.field6771[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field973[var75];
                                        int var78 = this.field975[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 128 - var78;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class196.field2526[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg4.method396(var81, var82) - arg5.method396(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class196.field2526[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg5.method396(var83, var84) - arg4.method396(var83, var84);
                                            } else if (arg3 != null && !class527.field7773[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg3.method396(var85, var86) - arg5.method396(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class196.field2523[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class215.field2758[var76];
                                            }
                                            var59[var52] = class52.field694[var76];
                                            var58[var52] = class23.field342[var76];
                                            var57[var52] = class477.field6986[var76];
                                        } else {
                                            if (var17 && class196.field2526[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var67.field4110;
                                                var59[var52] = var67.field4106;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var68.field4110;
                                                var59[var52] = var68.field4106;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var69.field4110;
                                                var59[var52] = var69.field4106;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var70.field4110;
                                                var59[var52] = var70.field4106;
                                            } else {
                                                if (var80 >= 64) {
                                                    if (var79 < 64) {
                                                        var58[var52] = var70.field4110;
                                                        var59[var52] = var70.field4106;
                                                    } else {
                                                        var58[var52] = var69.field4110;
                                                        var59[var52] = var69.field4106;
                                                    }
                                                } else if (var79 >= 64) {
                                                    var58[var52] = var68.field4110;
                                                    var59[var52] = var68.field4106;
                                                } else {
                                                    var58[var52] = var67.field4110;
                                                    var59[var52] = var67.field4106;
                                                }
                                                int var87 = class122.method870(var80 << 7 >> 7, arg6[var13][var14], arg6[var12][var14], 101);
                                                int var88 = class122.method870(var80 << 7 >> 7, arg6[var13][var15], arg6[var12][var15], 110);
                                                var57[var52] = class122.method870(var79 << 7 >> 7, var88, var87, 117);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field4113) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg5.method399(var12, var14);
                            int var90 = arg5.method399(var13, var14);
                            int var91 = arg5.method399(var13, var15);
                            int var92 = arg5.method399(var12, var15);
                            if (arg2 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field2537) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field955[arg2][var12][var14] = (byte) class215.method1323(this.field955[arg2][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field978) {
                                var94 = class297.method1758(var12, var14);
                                var95 = class106.method784(var12, var14);
                                var96 = class211.method1311(var12, var14);
                            }
                            arg5.method395(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class178.method1138(arg2, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;Lpc;II)Lcw;")
    public static final class121 method649(String arg0, class476 arg1, int arg2, int arg3) {
        field950++;
        if (arg3 == 0) {
            return arg1.method2887(arg0, (byte) -71);
        } else if (arg3 == 1) {
            try {
                class114.method826(new Object[] { (new URL(arg1.field6891.getCodeBase(), arg0)).toString() }, "openjs", -8456, arg1.field6891);
                class121 var4 = new class121();
                var4.field1628 = 1;
                return var4;
            } catch (Throwable var10) {
                class121 var5 = new class121();
                var5.field1628 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                arg1.field6891.getAppletContext().showDocument(new URL(arg1.field6891.getCodeBase(), arg0), "_blank");
                class121 var6 = new class121();
                var6.field1628 = 1;
                return var6;
            } catch (Exception var11) {
                class121 var7 = new class121();
                var7.field1628 = 2;
                return var7;
            }
        } else if (arg2 != -14861) {
            return null;
        } else if (arg3 == 3) {
            try {
                class114.method825("loggedout", 13324, arg1.field6891);
            } catch (Throwable var13) {
            }
            try {
                arg1.field6891.getAppletContext().showDocument(new URL(arg1.field6891.getCodeBase(), arg0), "_top");
                class121 var8 = new class121();
                var8.field1628 = 1;
                return var8;
            } catch (Exception var12) {
                class121 var9 = new class121();
                var9.field1628 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lta;Lta;ILta;Lya;[[IB)V")
    private final void method650(class143 arg0, class143 arg1, int arg2, class143 arg3, class38 arg4, int[][] arg5, byte arg6) {
        field968++;
        int var8 = 0;
        if (arg6 >= -98) {
            this.method651((byte) -86, null, null, null);
        }
        while (var8 < this.field961) {
            for (int var9 = 0; var9 < this.field952; var9++) {
                if (class140.field1810 == -1 || class471.method2842(arg2, (byte) -88, var8, class140.field1810, var9)) {
                    byte var10 = this.field958[arg2][var8][var9];
                    byte var11 = this.field957[arg2][var8][var9];
                    int var12 = this.field951[arg2][var8][var9] & 0xFF;
                    int var13 = this.field965[arg2][var8][var9] & 0xFF;
                    class196 var14 = var12 == 0 ? null : this.field954.method2381(4, var12 - 1);
                    class324 var15 = var13 == 0 ? null : this.field980.method2631(32768, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class21.field308[var10];
                        var17 = var14 == null ? 0 : class301.field3875[var10];
                    } else if (var14 != null) {
                        var17 = class301.field3875[var10];
                    } else if (var15 != null) {
                        var16 = class301.field3875[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field2544 == -1 && var14.field2532 == -1 && var14.field2535 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg4.method322() ? var14.field2535 : var14.field2524;
                            if (class433.field6156) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field2522;
                                if (var14.field2544 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field2544;
                                }
                                if (var14.field2532 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field2532;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field978 && arg2 == 0) {
                                class33.method241(var8, var9, var14.field2533, var14.field2529 * 8, var14.field2525);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field4110;
                            if (class433.field6156) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field4106;
                                var20[var19] = arg5[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field973.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg3 == null ? null : new int[var31];
                        int[] var35 = arg3 == null && arg0 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field973[var36];
                            int var46 = this.field975[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class196.field2526[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg3.method396(var49, var50) - arg1.method396(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg3 != null && !class196.field2526[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg1.method396(var51, var52) - arg3.method396(var51, var52);
                                } else if (arg0 != null && !class527.field7773[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg0.method396(var53, var54) - arg1.method396(var53, var54);
                                }
                            }
                        }
                        int var37 = arg1.method399(var8, var9);
                        int var38 = arg1.method399(var8 + 1, var9);
                        int var39 = arg1.method399(var8 + 1, var9 + 1);
                        int var40 = arg1.method399(var8, var9 + 1);
                        if (arg2 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field2537) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field955[arg2][var8][var9] = (byte) class215.method1323(this.field955[arg2][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field978) {
                            var42 = class297.method1758(var8, var9);
                            var43 = class106.method784(var8, var9);
                            var44 = class211.method1311(var8, var9);
                        }
                        arg1.method392(var8, var9, var32, var34, var33, var35, class429.field6093[var10], class510.field7365[var10], class218.field2782[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class178.method1138(arg2, var8, var9);
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[Lis;[[[ILya;)V")
    public final void method651(byte arg0, class348[] arg1, int[][][] arg2, class38 arg3) {
        if (!this.field978) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field961; var6++) {
                    for (int var7 = 0; var7 < this.field952; var7++) {
                        if ((class379.field4998[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class379.field4998[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1998((byte) 117, var6, var7);
                            }
                        }
                    }
                }
            }
        }
        field971++;
        for (int var9 = 0; var9 < this.field959; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field978) {
                if (class266.field3354) {
                    var10 |= 0x2;
                }
                if (class223.field2822) {
                    var11 |= 0x8;
                }
                if (class228.field2923 != 0) {
                    if (var9 == 0 | class376.field4947) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class266.field3354) {
                var11 |= 0x7;
            }
            if (!class455.field6552) {
                var11 |= 0x20;
            }
            int[][] var12 = arg2 == null || var9 >= arg2.length ? this.field967[var9] : arg2[var9];
            class394.method2268(var9, arg3.method344(this.field961, this.field952, this.field967[var9], var12, 128, var10, var11));
        }
        if (arg0 > -56) {
            this.field952 = -67;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIII)V")
    public final void method652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 72) {
            this.method651((byte) -105, null, null, null);
        }
        field964++;
        for (int var7 = arg1; var7 < (arg1 + arg3); var7++) {
            for (int var10 = arg0; var10 < (arg0 + arg2); var10++) {
                if (var10 >= 0 && var10 < this.field961 && var7 >= 0 && this.field952 > var7) {
                    this.field967[arg4][var10][var7] = arg4 <= 0 ? 0 : this.field967[arg4 - 1][var10][var7] - 240;
                }
            }
        }
        if (arg0 > 0 && this.field961 > arg0) {
            for (int var8 = arg1 + 1; var8 < (arg1 + arg3); var8++) {
                if (var8 >= 0 && this.field952 > var8) {
                    this.field967[arg4][arg0][var8] = this.field967[arg4][arg0 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < this.field952) {
            for (int var9 = arg0 + 1; var9 < (arg0 + arg2); var9++) {
                if (var9 >= 0 && var9 < this.field961) {
                    this.field967[arg4][var9][arg1] = this.field967[arg4][var9][arg1 - 1];
                }
            }
        }
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field961 || this.field952 <= arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 > 0 && this.field967[arg4][arg0 - 1][arg1] != 0) {
                this.field967[arg4][arg0][arg1] = this.field967[arg4][arg0 - 1][arg1];
                return;
            }
            if (arg1 > 0 && this.field967[arg4][arg0][arg1 - 1] != 0) {
                this.field967[arg4][arg0][arg1] = this.field967[arg4][arg0][arg1 - 1];
                return;
            }
            if (arg0 > 0 && arg1 > 0 && this.field967[arg4][arg0 - 1][arg1 - 1] != 0) {
                this.field967[arg4][arg0][arg1] = this.field967[arg4][arg0 - 1][arg1 - 1];
                return;
            }
            return;
        }
        if (arg0 > 0 && this.field967[arg4][arg0 - 1][arg1] != this.field967[arg4 - 1][arg0 - 1][arg1]) {
            this.field967[arg4][arg0][arg1] = this.field967[arg4][arg0 - 1][arg1];
            return;
        }
        if (arg1 > 0 && this.field967[arg4 - 1][arg0][arg1 - 1] != this.field967[arg4][arg0][arg1 - 1]) {
            this.field967[arg4][arg0][arg1] = this.field967[arg4][arg0][arg1 - 1];
            return;
        }
        if (arg0 > 0 && arg1 > 0 && this.field967[arg4 - 1][arg0 - 1][arg1 - 1] != this.field967[arg4][arg0 - 1][arg1 - 1]) {
            this.field967[arg4][arg0][arg1] = this.field967[arg4][arg0 - 1][arg1 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILfh;IIIIBI[Lis;)V")
    public final void method653(int arg0, int arg1, class463 arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, class348[] arg9) {
        field966++;
        int var11 = (arg5 & 0x7) * 8;
        int var12 = (arg3 & 0x7) * 8;
        if (!this.field978) {
            class348 var13 = arg9[arg1];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg0 + class470.method2841(false, var14 & 0x7, arg8, var15 & 0x7);
                    int var17 = class222.method1352(var14 & 0x7, var15 & 0x7, arg8, -59) + arg4;
                    if (var16 > 0 && this.field961 - 1 > var16 && var17 > 0 && var17 < this.field952 - 1) {
                        var13.method1989(1, var16, var17);
                    }
                }
            }
        }
        int var18 = (arg5 & 0xFFFFFFF8) << 3;
        int var19 = arg3 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field959; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg6 != var22 || var11 > var23 || var11 + 8 < var23 || var12 > var24 || var12 + 8 < var24) {
                        this.method654(0, 0, -1, 0, 0, 0, false, 0, arg2, -1, true);
                    } else if ((var11 + 8) == var23 || (var12 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg8 == 0) {
                            var31 = var24 + arg4 - var12;
                            var32 = var23 + arg0 - var11;
                        } else if (arg8 == 1) {
                            var31 = var11 + arg4 + 8 - var23;
                            var32 = arg0 + var24 - var12;
                        } else if (arg8 == 2) {
                            var31 = arg4 - (var24 - var12 - 8);
                            var32 = var11 + arg0 + 8 - var23;
                        } else {
                            var31 = var23 - (var11 - arg4);
                            var32 = arg0 + 8 - (-var12 + var24);
                        }
                        this.method654(0, arg1, var32, var19 + var24, 0, 0, true, var18 + var23, arg2, var31, true);
                    } else {
                        int var25 = arg0 + class470.method2841(false, var23 & 0x7, arg8, var24 & 0x7);
                        int var26 = class222.method1352(var23 & 0x7, var24 & 0x7, arg8, -108) + arg4;
                        this.method654(var20, arg1, var25, var19 + var24, var21, arg8, false, var18 + var23, arg2, var26, true);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg8 == 0) {
                                var29 = var27 + arg0 - var11;
                                var30 = -var12 - (-var28 - arg4);
                            } else if (arg8 == 1) {
                                var30 = arg4 + 8 - (var27 - var11);
                                var29 = var28 + arg0 - var12;
                            } else if (arg8 == 2) {
                                var29 = arg0 + var11 + 8 - var27;
                                var30 = var12 + arg4 + 8 - var28;
                            } else {
                                var30 = var27 + arg4 - var11;
                                var29 = 8 - var28 - (-var12 - arg0);
                            }
                            if (var29 >= 0 && var29 < this.field961 && var30 >= 0 && var30 < this.field952) {
                                this.field967[arg1][var29][var30] = this.field967[arg1][var20 + var25][var26 + var21];
                            }
                        }
                    }
                }
            }
        }
        if (arg7 <= 113) {
            this.field952 = -27;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIZILfh;IZ)V")
    private final void method654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class463 arg8, int arg9, boolean arg10) {
        if (!arg10) {
            return;
        }
        if (arg5 == 1) {
            arg4 = 1;
        } else if (arg5 == 2) {
            arg4 = 1;
            arg0 = 1;
        } else if (arg5 == 3) {
            arg0 = 1;
        }
        field977++;
        if (arg2 < 0 || this.field961 <= arg2 || arg9 < 0 || this.field952 <= arg9) {
            while (true) {
                int var14 = arg8.method2737(false);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg8.method2737(false);
                    return;
                }
                if (var14 <= 49) {
                    arg8.method2737(false);
                }
            }
        }
        if (!this.field978 && !arg6) {
            class379.field4998[arg1][arg2][arg9] = 0;
        }
        while (true) {
            int var12 = arg8.method2737(false);
            if (var12 == 0) {
                if (this.field978) {
                    this.field967[0][arg0 + arg2][arg4 + arg9] = 0;
                    return;
                } else if (arg1 == 0) {
                    this.field967[0][arg0 + arg2][arg4 + arg9] = -class404.method2391((byte) -46, arg3 + 556238, arg7 + 932731) * 8 << 0;
                    return;
                } else {
                    this.field967[arg1][arg0 + arg2][arg4 + arg9] = this.field967[arg1 - 1][arg0 + arg2][arg4 + arg9] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg8.method2737(false);
                if (this.field978) {
                    this.field967[0][arg0 + arg2][arg4 + arg9] = var13 * 8 << 0;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg1 == 0) {
                    this.field967[0][arg0 + arg2][arg9 + arg4] = -var13 * 8 << 0;
                    return;
                }
                this.field967[arg1][arg0 + arg2][arg9 + arg4] = this.field967[arg1 - 1][arg0 + arg2][arg4 + arg9] - (var13 * 8 << 0);
                return;
            }
            if (var12 <= 49) {
                if (arg6) {
                    arg8.method2737(false);
                } else {
                    this.field951[arg1][arg2][arg9] = arg8.method2793(32767);
                    this.field958[arg1][arg2][arg9] = (byte) ((var12 - 2) / 4);
                    this.field957[arg1][arg2][arg9] = (byte) class378.method2145(3, var12 + arg5 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field978 && !arg6) {
                    class379.field4998[arg1][arg2][arg9] = (byte) (var12 - 49);
                }
            } else if (!arg6) {
                this.field965[arg1][arg2][arg9] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II[[I)V")
    public final void method655(int arg0, int arg1, int[][] arg2) {
        field979++;
        int[][] var4 = this.field967[arg1];
        if (arg0 < 68) {
            this.field951 = null;
        }
        for (int var5 = 0; var5 < this.field961 + 1; var5++) {
            for (int var6 = 0; var6 < this.field952 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)Lui;")
    public static final class153 method656(int arg0, int arg1, int arg2) {
        field976++;
        class153 var3 = (class153) class498.field7214.method2022(-1, (long) arg2 | (long) arg0 << 32);
        if (var3 == null) {
            var3 = new class153(arg0, arg2);
            class498.field7214.method2019((byte) -111, var3, var3.field5043);
        }
        if (arg1 != 255) {
            method647((byte) 127);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II[[BIII[Z[[BII[[BLqg;Lw;Lya;)V")
    private final void method657(int arg0, int arg1, byte[][] arg2, int arg3, int arg4, int arg5, boolean[] arg6, byte[][] arg7, int arg8, int arg9, byte[][] arg10, class324 arg11, class196 arg12, class38 arg13) {
        field974++;
        boolean[] var15 = arg12 != null && arg12.field2527 ? class201.field2615[arg5] : class137.field1760[arg5];
        if (arg4 > 0) {
            if (arg0 > 0) {
                int var16 = arg7[arg0 - 1][arg4 - 1] & 0xFF;
                if (var16 > 0) {
                    class196 var17 = this.field954.method2381(4, var16 - 1);
                    if (var17.field2544 != -1 && var17.field2527) {
                        byte var18 = arg2[arg0 - 1][arg4 - 1];
                        int var19 = (arg10[arg0 - 1][arg4 - 1] * 2) + 4 & 0x7;
                        int var20 = class279.method1649(var17, arg13, 0);
                        if (class196.field2526[var18][var19]) {
                            class477.field6986[0] = var17.field2544;
                            class215.field2758[0] = var20;
                            class23.field342[0] = arg13.method322() ? var17.field2535 : var17.field2524;
                            class52.field694[0] = var17.field2522;
                            class196.field2523[0] = var17.field2531;
                            class118.field1583[0] = 256;
                        }
                    }
                }
            }
            if ((arg9 - 1) > arg0) {
                int var21 = arg7[arg0 + 1][arg4 - 1] & 0xFF;
                if (var21 > 0) {
                    class196 var22 = this.field954.method2381(4, var21 - 1);
                    if (var22.field2544 != -1 && var22.field2527) {
                        byte var23 = arg2[arg0 + 1][arg4 - 1];
                        int var24 = arg10[arg0 + 1][arg4 - 1] * 2 + 6 & 0x7;
                        int var25 = class279.method1649(var22, arg13, 0);
                        if (class196.field2526[var23][var24]) {
                            class477.field6986[2] = var22.field2544;
                            class215.field2758[2] = var25;
                            class23.field342[2] = arg13.method322() ? var22.field2535 : var22.field2524;
                            class52.field694[2] = var22.field2522;
                            class196.field2523[2] = var22.field2531;
                            class118.field1583[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg3 > -2) {
            this.field973 = null;
        }
        if (arg8 - 1 > arg4) {
            if (arg0 > 0) {
                int var26 = arg7[arg0 - 1][arg4 + 1] & 0xFF;
                if (var26 > 0) {
                    class196 var27 = this.field954.method2381(4, var26 - 1);
                    if (var27.field2544 != -1 && var27.field2527) {
                        byte var28 = arg2[arg0 - 1][arg4 + 1];
                        int var29 = arg10[arg0 - 1][arg4 + 1] * 2 + 2 & 0x7;
                        int var30 = class279.method1649(var27, arg13, 0);
                        if (class196.field2526[var28][var29]) {
                            class477.field6986[6] = var27.field2544;
                            class215.field2758[6] = var30;
                            class23.field342[6] = arg13.method322() ? var27.field2535 : var27.field2524;
                            class52.field694[6] = var27.field2522;
                            class196.field2523[6] = var27.field2531;
                            class118.field1583[6] = 64;
                        }
                    }
                }
            }
            if ((arg9 - 1) > arg0) {
                int var31 = arg7[arg0 + 1][arg4 + 1] & 0xFF;
                if (var31 > 0) {
                    class196 var32 = this.field954.method2381(4, var31 - 1);
                    if (var32.field2544 != -1 && var32.field2527) {
                        byte var33 = arg2[arg0 + 1][arg4 + 1];
                        int var34 = arg10[arg0 + 1][arg4 + 1] * 2 & 0x7;
                        int var35 = class279.method1649(var32, arg13, 0);
                        if (class196.field2526[var33][var34]) {
                            class477.field6986[4] = var32.field2544;
                            class215.field2758[4] = var35;
                            class23.field342[4] = arg13.method322() ? var32.field2535 : var32.field2524;
                            class52.field694[4] = var32.field2522;
                            class196.field2523[4] = var32.field2531;
                            class118.field1583[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg4 > 0) {
            int var36 = arg7[arg0][arg4 - 1] & 0xFF;
            if (var36 > 0) {
                class196 var37 = this.field954.method2381(4, var36 - 1);
                if (var37.field2544 != -1) {
                    byte var38 = arg2[arg0][arg4 - 1];
                    byte var39 = arg10[arg0][arg4 - 1];
                    if (var37.field2527) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class279.method1649(var37, arg13, 0);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class196.field2526[var38][var41] && var37.field2531 >= class196.field2523[var40]) {
                                class477.field6986[var40] = var37.field2544;
                                class215.field2758[var40] = var42;
                                class23.field342[var40] = arg13.method322() ? var37.field2535 : var37.field2524;
                                class52.field694[var40] = var37.field2522;
                                if (class196.field2523[var40] == var37.field2531) {
                                    class118.field1583[var40] = class215.method1323(class118.field1583[var40], 32);
                                } else {
                                    class118.field1583[var40] = 32;
                                }
                                class196.field2523[var40] = var37.field2531;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg1 & 0x3]) {
                            arg6[0] = class201.field2615[var38][class378.method2145(3, var39 + 2)];
                        }
                    } else if (!var15[arg1 & 0x3]) {
                        arg6[0] = class137.field1760[var38][class378.method2145(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg4 < arg8 - 1) {
            int var44 = arg7[arg0][arg4 + 1] & 0xFF;
            if (var44 > 0) {
                class196 var45 = this.field954.method2381(4, var44 - 1);
                if (var45.field2544 != -1) {
                    byte var46 = arg2[arg0][arg4 + 1];
                    byte var47 = arg10[arg0][arg4 + 1];
                    if (var45.field2527) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class279.method1649(var45, arg13, 0);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class196.field2526[var46][var49] && var45.field2531 >= class196.field2523[var48]) {
                                class477.field6986[var48] = var45.field2544;
                                class215.field2758[var48] = var50;
                                class23.field342[var48] = arg13.method322() ? var45.field2535 : var45.field2524;
                                class52.field694[var48] = var45.field2522;
                                if (class196.field2523[var48] == var45.field2531) {
                                    class118.field1583[var48] = class215.method1323(class118.field1583[var48], 16);
                                } else {
                                    class118.field1583[var48] = 16;
                                }
                                class196.field2523[var48] = var45.field2531;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg1 + 2 & 0x3]) {
                            arg6[2] = class201.field2615[var46][class378.method2145(3, -(-var47))];
                        }
                    } else if (!var15[arg1 + 2 & 0x3]) {
                        arg6[2] = class137.field1760[var46][class378.method2145(-(-var47), 3)];
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var52 = arg7[arg0 - 1][arg4] & 0xFF;
            if (var52 > 0) {
                class196 var53 = this.field954.method2381(4, var52 - 1);
                if (var53.field2544 != -1) {
                    byte var54 = arg2[arg0 - 1][arg4];
                    byte var55 = arg10[arg0 - 1][arg4];
                    if (var53.field2527) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class279.method1649(var53, arg13, 0);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class196.field2526[var54][var57] && var53.field2531 >= class196.field2523[var56]) {
                                class477.field6986[var56] = var53.field2544;
                                class215.field2758[var56] = var58;
                                class23.field342[var56] = arg13.method322() ? var53.field2535 : var53.field2524;
                                class52.field694[var56] = var53.field2522;
                                if (class196.field2523[var56] == var53.field2531) {
                                    class118.field1583[var56] = class215.method1323(class118.field1583[var56], 8);
                                } else {
                                    class118.field1583[var56] = 8;
                                }
                                class196.field2523[var56] = var53.field2531;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg1 + 3 & 0x3]) {
                            arg6[3] = class201.field2615[var54][class378.method2145(var55 + 1, 3)];
                        }
                    } else if (!var15[arg1 + 3 & 0x3]) {
                        arg6[3] = class137.field1760[var54][class378.method2145(var55 + 1, 3)];
                    }
                }
            }
        }
        if ((arg9 - 1) > arg0) {
            int var60 = arg7[arg0 + 1][arg4] & 0xFF;
            if (var60 > 0) {
                class196 var61 = this.field954.method2381(4, var60 - 1);
                if (var61.field2544 != -1) {
                    byte var62 = arg2[arg0 + 1][arg4];
                    byte var63 = arg10[arg0 + 1][arg4];
                    if (var61.field2527) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class279.method1649(var61, arg13, 0);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class196.field2526[var62][var65] && var61.field2531 >= class196.field2523[var64]) {
                                class477.field6986[var64] = var61.field2544;
                                class215.field2758[var64] = var66;
                                class23.field342[var64] = arg13.method322() ? var61.field2535 : var61.field2524;
                                class52.field694[var64] = var61.field2522;
                                if (class196.field2523[var64] == var61.field2531) {
                                    class118.field1583[var64] = class215.method1323(class118.field1583[var64], 4);
                                } else {
                                    class118.field1583[var64] = 4;
                                }
                                class196.field2523[var64] = var61.field2531;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg1 + 1 & 0x3]) {
                            arg6[1] = class201.field2615[var62][class378.method2145(var63 + 3, 3)];
                        }
                    } else if (!var15[arg1 + 1 & 0x3]) {
                        arg6[1] = class137.field1760[var62][class378.method2145(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg12 == null) {
            return;
        }
        int var68 = class279.method1649(arg12, arg13, 0);
        if (!arg12.field2527) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg1 * 2 & 0x7;
            if (class196.field2526[arg5][var69] && arg12.field2531 >= class196.field2523[var70]) {
                class477.field6986[var70] = arg12.field2544;
                class215.field2758[var70] = var68;
                class23.field342[var70] = arg13.method322() ? arg12.field2535 : arg12.field2524;
                class52.field694[var70] = arg12.field2522;
                if (class196.field2523[var70] == arg12.field2531) {
                    class118.field1583[var70] = class215.method1323(class118.field1583[var70], 2);
                } else {
                    class118.field1583[var70] = 2;
                }
                class196.field2523[var70] = arg12.field2531;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lya;ILta;Lta;)V")
    public final void method658(class38 arg0, int arg1, class143 arg2, class143 arg3) {
        field969++;
        if (class378.field4967 == null || class378.field4967.length != this.field952) {
            class175.field2275 = new int[this.field952];
            class327.field4132 = new int[this.field952];
            class518.field7499 = new int[this.field952];
            class249.field3193 = new int[this.field952];
            class378.field4967 = new int[this.field952];
        }
        int[][] var5 = new int[this.field961][this.field952];
        int var6 = 0;
        if (arg1 != -24983) {
            this.field975 = null;
        }
        while (var6 < this.field959) {
            for (int var8 = 0; var8 < this.field952; var8++) {
                class378.field4967[var8] = 0;
                class518.field7499[var8] = 0;
                class175.field2275[var8] = 0;
                class327.field4132[var8] = 0;
                class249.field3193[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field961; var9++) {
                for (int var10 = 0; var10 < this.field952; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field961 > var19) {
                        int var20 = this.field965[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class324 var21 = this.field980.method2631(32768, var20 - 1);
                            class378.field4967[var10] += var21.field4115;
                            class518.field7499[var10] += var21.field4121;
                            class175.field2275[var10] += var21.field4117;
                            class327.field4132[var10] += var21.field4116;
                            var10002 = class249.field3193[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field965[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class324 var24 = this.field980.method2631(arg1 + 57751, var23 + -1);
                            class378.field4967[var10] -= var24.field4115;
                            class518.field7499[var10] -= var24.field4121;
                            class175.field2275[var10] -= var24.field4117;
                            class327.field4132[var10] -= var24.field4116;
                            var10002 = class249.field3193[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field952; var16++) {
                        int var17 = var16 + 5;
                        if (this.field952 > var17) {
                            var15 += class249.field3193[var17];
                            var14 += class327.field4132[var17];
                            var12 += class518.field7499[var17];
                            var13 += class175.field2275[var17];
                            var11 += class378.field4967[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class518.field7499[var18];
                            var15 -= class249.field3193[var18];
                            var13 -= class175.field2275[var18];
                            var11 -= class378.field4967[var18];
                            var14 -= class327.field4132[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class254.method1527(var12 / var15, var11 * 256 / var14, var13 / var15, -80);
                        }
                    }
                }
            }
            if (class24.field354) {
                this.method648((byte) -120, arg0, var6, var6 == 0 ? arg3 : null, var6 == 0 ? arg2 : null, class520.field7520[var6], var5);
            } else {
                this.method650(var6 == 0 ? arg3 : null, class520.field7520[var6], var6, var6 == 0 ? arg2 : null, arg0, var5, (byte) -125);
            }
            this.field965[var6] = null;
            this.field951[var6] = null;
            this.field958[var6] = null;
            this.field957[var6] = null;
            var6++;
        }
        if (!this.field978) {
            if (class228.field2923 != 0) {
                class248.method1506();
            }
            if (class266.field3354) {
                class320.method1882();
            }
        }
        for (int var7 = 0; var7 < this.field959; var7++) {
            class520.field7520[var7].method401();
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
    public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field959; var6++) {
            this.method652(arg4, arg3, arg0, arg1, var6, arg2 - 26019);
        }
        if (arg2 != 26135) {
            this.field975 = null;
        }
        field960++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[Lis;IIIILfh;)V")
    public final void method660(byte arg0, class348[] arg1, int arg2, int arg3, int arg4, int arg5, class463 arg6) {
        if (!this.field978) {
            for (int var8 = 0; var8 < 4; var8++) {
                class348 var9 = arg1[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg2 + var11;
                        if (var12 >= 0 && this.field961 > var12 && var13 >= 0 && this.field952 > var13) {
                            var9.method1989(1, var12, var13);
                        }
                    }
                }
            }
        }
        if (arg0 >= -47) {
            this.field973 = null;
        }
        field953++;
        int var14 = arg5 + arg4;
        int var15 = arg2 + arg3;
        for (int var16 = 0; var16 < this.field959; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method654(0, var16, var17 + arg4, var15 + var18, 0, 0, false, var14 + var17, arg6, var18 + arg2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(IIIZLfe;Lam;)V")
    public class75(int arg0, int arg1, int arg2, boolean arg3, class403 arg4, class448 arg5) {
        this.field978 = arg3;
        this.field961 = arg1;
        this.field954 = arg4;
        this.field980 = arg5;
        this.field959 = arg0;
        this.field952 = arg2;
        this.field958 = new byte[this.field959][this.field961][this.field952];
        this.field957 = new byte[this.field959][this.field961][this.field952];
        this.field955 = new byte[this.field959][this.field961 + 1][this.field952 + 1];
        this.field967 = new int[this.field959][this.field961 + 1][this.field952 + 1];
        this.field965 = new byte[this.field959][this.field961][this.field952];
        this.field951 = new byte[this.field959][this.field961][this.field952];
    }
}
