import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class48 extends class148 {

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "Lbg;")
    public static class400 field509 = new class400(2);

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "Loc;")
    public static class175 field511;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "[Lgda;")
    public static class49[] field512;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public final void method254(int arg0, int arg1) {
        ++field507;
        class365 var3 = (class365) super.field1824.method732(Thread.currentThread());
        var3.field5523.field8347 = 0;
        if (super.field1832 != null) {
            this.method270(super.field1824.field8169, arg1, arg0, -20330, var3.field5523, var3.field7423, var3.field7460, var3.field7429);
        } else if (super.field1822 != null) {
            this.method268(var3.field5523, arg1, arg0, var3.field7423, var3.field7429, var3.field7460, 255);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILraa;)Z")
    public static final boolean method265(int arg0, class528 arg1) {
        ++field510;
        if (arg0 != 663028206) {
            return true;
        } else {
            return class224.field3156 == arg1 || class605.field8857 == arg1 || class3.field16 == arg1 || class67.field738 == arg1;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lfk;IIII[[I[[II)V")
    public class48(class569 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIII[[Z[IIILrda;[I)V")
    private final void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean[][] arg6, int[] arg7, int arg8, int arg9, class578 arg10, int[] arg11) {
        ++field503;
        int var13 = (-arg9 + arg2) * arg5 / 256;
        int var14 = 101 % ((arg1 - 13) / 36);
        arg10.field8341 = false;
        int var15 = arg5 >> 8;
        arg10.field8343 = false;
        int var16 = arg0;
        int var17 = arg3 + var13;
        for (int var18 = arg8; var18 < arg4; ++var18) {
            for (int var19 = arg9; ~var19 > ~arg2; ++var19) {
                if (arg6[var18 - arg8][-arg9 + var19]) {
                    if (super.field1832[var18][var19] != null) {
                        class482 var34 = super.field1832[var18][var19];
                        if (~var34.field7072 != 0 && ~(2 & var34.field7079) == -1 && var34.field7070 == 0) {
                            int var35 = super.field1824.method3304(var34.field7072);
                            arg10.method3365(-var15 + var17, -var15 + var17, var17, var16 - -var15, var16, var15 + var16, class326.method2114(var34.field7073, (byte) -42, var35), class326.method2114(var34.field7076, (byte) -42, var35), class326.method2114(var34.field7069, (byte) -42, var35));
                            arg10.method3365(var17, var17, -var15 + var17, var16, var15 + var16, var16, class326.method2114(var34.field7075, (byte) -42, var35), class326.method2114(var34.field7069, (byte) -42, var35), class326.method2114(var34.field7076, (byte) -42, var35));
                        } else if (var34.field7070 == 0) {
                            arg10.method3367(-var15 + var17, var17 - var15, var17, var15 + var16, var16, var16 - -var15, var34.field7073, var34.field7076, var34.field7069);
                            arg10.method3367(var17, var17, -var15 + var17, var16, var15 + var16, var16, var34.field7075, var34.field7069, var34.field7076);
                        } else {
                            int var36 = var34.field7070;
                            arg10.method3367(-var15 + var17, var17 - var15, var17, var15 + var16, var16, var15 + var16, class1.method3(-125, var36, -16777216 & var34.field7073), class1.method3(-126, var36, -16777216 & var34.field7076), class1.method3(-128, var36, -16777216 & var34.field7069));
                            arg10.method3367(var17, var17, -var15 + var17, var16, var16 - -var15, var16, class1.method3(-126, var36, var34.field7075 & -16777216), class1.method3(-128, var36, var34.field7069 & -16777216), class1.method3(-128, var36, -16777216 & var34.field7076));
                        }
                    } else if (super.field1821[var18][var19] != null) {
                        class423 var20 = super.field1821[var18][var19];
                        for (int var21 = 0; ~var21 > ~var20.field6316; ++var21) {
                            arg7[var21] = var16 - -(var20.field6314[var21] * var15 / super.field1662);
                            arg11[var21] = var17 - var20.field6313[var21] * var15 / super.field1662;
                        }
                        for (int var22 = 0; ~var22 > ~var20.field6318; ++var22) {
                            int var23 = var22 * 3;
                            int var24 = var23 + 1;
                            int var25 = var24 - -1;
                            int var26 = arg7[var23];
                            int var27 = arg7[var24];
                            int var28 = arg7[var25];
                            int var29 = arg11[var23];
                            int var30 = arg11[var24];
                            int var31 = arg11[var25];
                            if (var20.field6315 == null || ~var20.field6315[var22] == -1 || var20.field6320 != null && (var20.field6320 == null || var20.field6320[var22] != -1)) {
                                if (var20.field6320 != null && ~var20.field6320[var22] != 0) {
                                    int var33 = super.field1824.method3304(var20.field6320[var22]);
                                    arg10.method3365(var29, var30, var31, var26, var27, var28, var33, var33, var33);
                                } else {
                                    arg10.method3367(var29, var30, var31, var26, var27, var28, var20.field6311[var23], var20.field6311[var24], var20.field6311[var25]);
                                }
                            } else {
                                int var32 = var20.field6315[var22];
                                arg10.method3367(var29, var30, var31, var26, var27, var28, class1.method3(-128, var32, -(var20.field6311[var23] & -16777216) + -16777216), class1.method3(-125, var32, -(var20.field6311[var24] & -16777216) + -16777216), class1.method3(-126, var32, -(var20.field6311[var25] & -16777216) + -16777216));
                            }
                        }
                    }
                }
                var17 -= var15;
            }
            var16 += var15;
            var17 = arg3 + var13;
        }
        arg10.field8343 = true;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static void method267(boolean arg0) {
        field512 = null;
        field509 = null;
        field511 = null;
        if (arg0) {
            field509 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lrda;II[I[I[II)V")
    private final void method268(class578 arg0, int arg1, int arg2, int[] arg3, int[] arg4, int[] arg5, int arg6) {
        if (arg6 != 255) {
            field511 = null;
        }
        ++field505;
        class617 var8 = super.field1822[arg2][arg1];
        if (var8 != null) {
            if ((var8.field8968 & 2) == 0) {
                int var9 = super.field1662 * arg2;
                int var10 = super.field1662 + var9;
                int var11 = super.field1662 * arg1;
                int var12 = var11 - -super.field1662;
                int var17;
                int var19;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                if ((var8.field8968 & 1) == 0) {
                    int var13 = super.field1816[arg2][arg1];
                    int var14 = super.field1816[arg2 + 1][arg1];
                    int var15 = super.field1816[arg2 + 1][arg1 + 1];
                    int var16 = super.field1816[arg2][arg1 - -1];
                    int var18;
                    if (super.field1823 != -1) {
                        var17 = super.field1823;
                        var18 = super.field1823;
                        var19 = super.field1823;
                        var20 = super.field1823;
                    } else {
                        var20 = super.field1828 - -(super.field1827 * var9 - (-(super.field1833 * var11) + -(super.field1826 * var13)) >> 14);
                        if (var20 <= super.field1824.field8204) {
                            return;
                        }
                        var19 = super.field1828 - -(super.field1827 * var10 - -(super.field1826 * var14) - -(super.field1833 * var11) >> 14);
                        if (~var19 >= ~super.field1824.field8204) {
                            return;
                        }
                        var18 = super.field1828 - -(super.field1827 * var10 - (-(super.field1826 * var15) - super.field1833 * var12) >> 14);
                        if (~super.field1824.field8204 <= ~var18) {
                            return;
                        }
                        var17 = super.field1828 - -(super.field1827 * var9 + super.field1826 * var16 - -(super.field1833 * var12) >> 14);
                        if (~super.field1824.field8204 <= ~var17) {
                            return;
                        }
                    }
                    var21 = (super.field1818 * var11 + (super.field1831 * var9 - -(super.field1813 * var13)) >> 14) + super.field1825;
                    var22 = (super.field1829 * var11 + super.field1834 * var13 + super.field1815 * var9 >> 14) + super.field1814;
                    var23 = arg0.field8342 - -(super.field1824.field8178 * var21 / var20);
                    var24 = super.field1824.field8173 * var22 / var20 + arg0.field8346;
                    var25 = (super.field1831 * var10 + super.field1813 * var14 - -(super.field1818 * var11) >> 14) + super.field1825;
                    var26 = super.field1824.field8178 * var25 / var19 + arg0.field8342;
                    var27 = (super.field1815 * var10 + super.field1834 * var14 + super.field1829 * var11 >> 14) + super.field1814;
                    int var28 = super.field1825 - -(super.field1818 * var12 + super.field1831 * var10 + super.field1813 * var15 >> 14);
                    var29 = arg0.field8346 - -(super.field1824.field8173 * var27 / var19);
                    int var30 = (super.field1815 * var10 + super.field1834 * var15 + super.field1829 * var12 >> 14) + super.field1814;
                    var31 = super.field1824.field8178 * var28 / var18 + arg0.field8342;
                    var32 = (super.field1831 * var9 - -(super.field1813 * var16) - -(super.field1818 * var12) >> 14) + super.field1825;
                    var33 = super.field1824.field8173 * var30 / var18 + arg0.field8346;
                    var34 = (super.field1829 * var12 + super.field1815 * var9 - -(super.field1834 * var16) >> 14) + super.field1814;
                    var35 = super.field1824.field8178 * var32 / var17 + arg0.field8342;
                    var36 = super.field1824.field8173 * var34 / var17 + arg0.field8346;
                } else {
                    int var37 = super.field1816[arg2][arg1];
                    int var38;
                    if (super.field1823 != -1) {
                        var17 = super.field1823;
                        var38 = super.field1823;
                        var19 = super.field1823;
                        var20 = super.field1823;
                    } else {
                        int var39 = super.field1826 * var37;
                        var20 = (super.field1827 * var9 - -(super.field1833 * var11) + var39 >> 14) + super.field1828;
                        if (~var20 >= ~super.field1824.field8204) {
                            return;
                        }
                        var19 = (super.field1827 * var10 + super.field1833 * var11 + var39 >> 14) + super.field1828;
                        if (~super.field1824.field8204 <= ~var19) {
                            return;
                        }
                        var38 = super.field1828 - -(super.field1833 * var12 + super.field1827 * var10 + var39 >> 14);
                        if (~var38 >= ~super.field1824.field8204) {
                            return;
                        }
                        var17 = super.field1828 - -(super.field1833 * var12 + super.field1827 * var9 + var39 >> 14);
                        if (~super.field1824.field8204 <= ~var17) {
                            return;
                        }
                    }
                    int var40 = super.field1813 * var37;
                    var21 = super.field1825 - -(super.field1831 * var9 - (-var40 - super.field1818 * var11) >> 14);
                    int var41 = super.field1834 * var37;
                    var23 = super.field1824.field8178 * var21 / var20 + arg0.field8342;
                    var22 = (super.field1829 * var11 + super.field1815 * var9 + var41 >> 14) + super.field1814;
                    var25 = (super.field1818 * var11 + super.field1831 * var10 + var40 >> 14) + super.field1825;
                    var24 = super.field1824.field8173 * var22 / var20 + arg0.field8346;
                    var26 = arg0.field8342 - -(super.field1824.field8178 * var25 / var19);
                    var27 = super.field1814 - -(super.field1829 * var11 + super.field1815 * var10 + var41 >> 14);
                    int var42 = (super.field1818 * var12 + (super.field1831 * var10 - -var40) >> 14) + super.field1825;
                    var29 = super.field1824.field8173 * var27 / var19 + arg0.field8346;
                    int var43 = (super.field1815 * var10 - -(super.field1829 * var12) + var41 >> 14) + super.field1814;
                    var31 = super.field1824.field8178 * var42 / var38 + arg0.field8342;
                    var32 = (super.field1831 * var9 + super.field1818 * var12 + var40 >> 14) + super.field1825;
                    var33 = super.field1824.field8173 * var43 / var38 + arg0.field8346;
                    var35 = arg0.field8342 - -(super.field1824.field8178 * var32 / var17);
                    var34 = (super.field1829 * var12 + super.field1815 * var9 + var41 >> 14) + super.field1814;
                    var36 = super.field1824.field8173 * var34 / var17 + arg0.field8346;
                }
                if (~((var29 - var36) * (-var35 + var31) + -((-var35 + var26) * (-var36 + var33))) < -1) {
                    arg0.field8345 = ~var31 > -1 || ~var35 > -1 || var26 < 0 || arg0.field8335 < var31 || ~arg0.field8335 > ~var35 || var26 > arg0.field8335;
                    if (~var8.field8969 > -1) {
                        arg0.method3365(var33, var36, var29, var31, var35, var26, 65535 & var8.field8965, var8.field8967 & 65535, 65535 & var8.field8970);
                    } else {
                        if (this.method880(super.field1824.field8852.method438(43, var8.field8969).field8935)) {
                            arg0.field8347 = 100;
                        }
                        arg0.method3361(var33, var36, var29, var31, var35, var26, 65535 & var8.field8965, 65535 & var8.field8967, var8.field8970 & 65535, var21, var25, var32, var22, var27, var34, var20, var19, var17, var8.field8969);
                        arg0.field8347 = 0;
                    }
                }
                if (~((-var26 + var23) * (-var29 + var36) + -((-var26 + var35) * (-var29 + var24))) < -1) {
                    arg0.field8345 = ~var23 > -1 || var26 < 0 || var35 < 0 || ~arg0.field8335 > ~var23 || ~arg0.field8335 > ~var26 || arg0.field8335 < var35;
                    if (~var8.field8969 <= -1) {
                        if (this.method880(super.field1824.field8852.method438(82, var8.field8969).field8935)) {
                            arg0.field8347 = 100;
                        }
                        arg0.method3361(var24, var29, var36, var23, var26, var35, 65535 & var8.field8971, 65535 & var8.field8970, var8.field8967 & 65535, var21, var25, var32, var22, var27, var34, var20, var19, var17, var8.field8969);
                        arg0.field8347 = 0;
                        return;
                    }
                    arg0.method3365(var24, var29, var36, var23, var26, var35, var8.field8971 & 65535, var8.field8970 & 65535, 65535 & var8.field8967);
                }
            }
        } else {
            class105 var44 = super.field1830[arg2][arg1];
            if (var44 != null) {
                if (~super.field1823 != 0) {
                    for (int var45 = 0; var45 < var44.field1263; ++var45) {
                        int var46 = var44.field1264[var45] - -(arg2 << super.field1663);
                        short var47 = var44.field1257[var45];
                        int var48 = (arg1 << super.field1663) + var44.field1261[var45];
                        int var49 = (super.field1834 * var47 + super.field1815 * var46 - -(super.field1829 * var48) >> 14) + super.field1814;
                        int var50 = super.field1825 - -(super.field1818 * var48 + super.field1831 * var46 + super.field1813 * var47 >> 14);
                        arg4[var45] = super.field1824.field8178 * var50 / super.field1823 + arg0.field8342;
                        arg3[var45] = super.field1824.field8173 * var49 / super.field1823 + arg0.field8346;
                    }
                } else {
                    for (int var51 = 0; ~var44.field1263 < ~var51; ++var51) {
                        int var91 = (arg2 << super.field1663) + var44.field1264[var51];
                        short var92 = var44.field1257[var51];
                        int var93 = var44.field1261[var51] - -(arg1 << super.field1663);
                        int var94 = (super.field1833 * var93 + super.field1827 * var91 + super.field1826 * var92 >> 14) + super.field1828;
                        if (var94 <= super.field1824.field8204) {
                            return;
                        }
                        int var95 = (super.field1818 * var93 + super.field1831 * var91 + super.field1813 * var92 >> 14) + super.field1825;
                        int var96 = (super.field1815 * var91 + (super.field1834 * var92 - -(super.field1829 * var93)) >> 14) + super.field1814;
                        arg4[var51] = arg0.field8342 - -(super.field1824.field8178 * var95 / var94);
                        arg3[var51] = super.field1824.field8173 * var96 / var94 + arg0.field8346;
                    }
                }
                if (var44.field1258 == null) {
                    for (int var52 = 0; ~var52 > ~var44.field1267; ++var52) {
                        short var53 = var44.field1259[var52];
                        short var54 = var44.field1265[var52];
                        short var55 = var44.field1262[var52];
                        int var56 = arg4[var53];
                        int var57 = arg4[var54];
                        int var58 = arg4[var55];
                        int var59 = arg3[var53];
                        int var60 = arg3[var54];
                        int var61 = arg3[var55];
                        if ((-var57 + var56) * (-var60 + var61) + -((-var57 + var58) * (-var60 + var59)) > 0) {
                            int var62 = var44.field1256[var52];
                            if (var62 != -1) {
                                arg0.field8345 = ~var56 > -1 || ~var57 > -1 || ~var58 > -1 || ~arg0.field8335 > ~var56 || var57 > arg0.field8335 || ~arg0.field8335 > ~var58;
                                arg0.method3365(var59, var60, var61, var56, var57, var58, class326.method2114(var44.field1255[var53], (byte) -42, var62), class326.method2114(var44.field1255[var54], (byte) -42, var62), class326.method2114(var44.field1255[var55], (byte) -42, var62));
                            }
                        }
                    }
                } else {
                    int var63 = super.field1816[arg2][arg1];
                    int var64 = super.field1816[arg2 + 1][arg1];
                    int var65 = super.field1816[arg2][arg1 - -1];
                    int var66 = super.field1662 * arg2;
                    int var67 = super.field1662 + var66;
                    int var68 = super.field1662 * arg1;
                    int var69 = var68 - -super.field1662;
                    int var70 = super.field1825 - -(super.field1831 * var66 + super.field1818 * var68 + super.field1813 * var63 >> 14);
                    int var71 = (super.field1829 * var68 + (super.field1815 * var66 - -(super.field1834 * var63)) >> 14) + super.field1814;
                    int var72 = (super.field1833 * var68 + super.field1827 * var66 - -(super.field1826 * var63) >> 14) + super.field1828;
                    int var73 = (super.field1813 * var64 + super.field1831 * var67 + super.field1818 * var68 >> 14) + super.field1825;
                    int var74 = (super.field1815 * var67 - (-(super.field1834 * var64) - super.field1829 * var68) >> 14) + super.field1814;
                    int var75 = (super.field1827 * var67 + super.field1826 * var64 - -(super.field1833 * var68) >> 14) + super.field1828;
                    int var76 = (super.field1818 * var69 + super.field1831 * var66 + super.field1813 * var65 >> 14) + super.field1825;
                    int var77 = (super.field1829 * var69 + (super.field1815 * var66 - -(super.field1834 * var65)) >> 14) + super.field1814;
                    int var78 = (super.field1833 * var69 + super.field1827 * var66 + super.field1826 * var65 >> 14) + super.field1828;
                    for (int var79 = 0; ~var79 > ~var44.field1267; ++var79) {
                        short var80 = var44.field1259[var79];
                        short var81 = var44.field1265[var79];
                        short var82 = var44.field1262[var79];
                        int var83 = arg4[var80];
                        int var84 = arg4[var81];
                        int var85 = arg4[var82];
                        int var86 = arg3[var80];
                        int var87 = arg3[var81];
                        int var88 = arg3[var82];
                        if (~((-var84 + var83) * (-var87 + var88) + -((var85 - var84) * (-var87 + var86))) < -1) {
                            arg0.field8345 = var83 < 0 || var84 < 0 || var85 < 0 || ~arg0.field8335 > ~var83 || ~arg0.field8335 > ~var84 || ~arg0.field8335 > ~var85;
                            short var89 = var44.field1258[var79];
                            if (var89 != -1) {
                                if (this.method880(super.field1824.field8852.method438(47, var89).field8935)) {
                                    arg0.field8347 = 100;
                                }
                                arg0.method3361(var86, var87, var88, var83, var84, var85, var44.field1255[var80], var44.field1255[var81], var44.field1255[var82], var70, var73, var76, var71, var74, var77, var72, var75, var78, var89);
                                arg0.field8347 = 0;
                            } else {
                                int var90 = var44.field1256[var79];
                                if (~var90 != 0) {
                                    arg0.method3365(var86, var87, var88, var83, var84, var85, class326.method2114(var44.field1255[var80], (byte) -42, var90), class326.method2114(var44.field1255[var81], (byte) -42, var90), class326.method2114(var44.field1255[var82], (byte) -42, var90));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lrda;[IIIIIII[[Z[III)V")
    private final void method269(class578 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8, int[] arg9, int arg10, int arg11) {
        ++field504;
        int var13 = (-arg6 + arg2) * arg5 / 256;
        arg0.field8343 = false;
        int var14 = arg5 >> 8;
        arg0.field8341 = false;
        int var15 = arg3;
        int var16 = arg4 + var13;
        int var17 = arg10;
        if (arg11 <= -5) {
            while (var17 < arg7) {
                for (int var18 = arg6; var18 < arg2; ++var18) {
                    if (arg8[-arg10 + var17][-arg6 + var18]) {
                        if (super.field1822[var17][var18] != null) {
                            class617 var34 = super.field1822[var17][var18];
                            if (var34.field8969 != -1 && ~(2 & var34.field8968) == -1 && var34.field8966 == -1) {
                                int var35 = super.field1824.method3304(var34.field8969);
                                arg0.method3365(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, class326.method2114(var34.field8965 & 65535, (byte) -42, var35), class326.method2114(var34.field8967 & 65535, (byte) -42, var35), class326.method2114(65535 & var34.field8970, (byte) -42, var35));
                                arg0.method3365(var16, var16, -var14 + var16, var15, var14 + var15, var15, class326.method2114(var34.field8971 & 65535, (byte) -42, var35), class326.method2114(65535 & var34.field8970, (byte) -42, var35), class326.method2114(var34.field8967 & 65535, (byte) -42, var35));
                            } else if (~var34.field8966 != 0) {
                                int var36 = var34.field8966;
                                arg0.method3365(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var36, var36, var36);
                                arg0.method3365(var16, var16, -var14 + var16, var15, var14 + var15, var15, var36, var36, var36);
                            } else {
                                arg0.method3365(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var34.field8965 & 65535, 65535 & var34.field8967, 65535 & var34.field8970);
                                arg0.method3365(var16, var16, -var14 + var16, var15, var14 + var15, var15, 65535 & var34.field8971, 65535 & var34.field8970, var34.field8967 & 65535);
                            }
                        } else if (super.field1830[var17][var18] != null) {
                            class105 var19 = super.field1830[var17][var18];
                            for (int var20 = 0; var20 < var19.field1263; ++var20) {
                                arg1[var20] = var19.field1264[var20] * var14 / super.field1662 + var15;
                                arg9[var20] = -(var19.field1261[var20] * var14 / super.field1662) + var16;
                            }
                            for (int var21 = 0; ~var21 > ~var19.field1267; ++var21) {
                                short var22 = var19.field1259[var21];
                                short var23 = var19.field1265[var21];
                                short var24 = var19.field1262[var21];
                                int var25 = arg1[var22];
                                int var26 = arg1[var23];
                                int var27 = arg1[var24];
                                int var28 = arg9[var22];
                                int var29 = arg9[var23];
                                int var30 = arg9[var24];
                                if (var19.field1266 != null && ~var19.field1266[var21] != 0) {
                                    int var31 = var19.field1266[var21];
                                    arg0.method3365(var28, var29, var30, var25, var26, var27, class326.method2114(var19.field1255[var22], (byte) -42, var31), class326.method2114(var19.field1255[var23], (byte) -42, var31), class326.method2114(var19.field1255[var24], (byte) -42, var31));
                                } else if (var19.field1258 != null && ~var19.field1258[var21] != 0) {
                                    int var32 = super.field1824.method3304(var19.field1258[var21]);
                                    arg0.method3365(var28, var29, var30, var25, var26, var27, class326.method2114(var19.field1255[var22], (byte) -42, var32), class326.method2114(var19.field1255[var23], (byte) -42, var32), class326.method2114(var19.field1255[var24], (byte) -42, var32));
                                } else {
                                    int var33 = var19.field1256[var21];
                                    arg0.method3365(var28, var29, var30, var25, var26, var27, class326.method2114(var19.field1255[var22], (byte) -42, var33), class326.method2114(var19.field1255[var23], (byte) -42, var33), class326.method2114(var19.field1255[var24], (byte) -42, var33));
                                }
                            }
                        }
                    }
                    var16 -= var14;
                }
                var16 = arg4 - -var13;
                var15 += var14;
                ++var17;
            }
            arg0.field8343 = true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field508;
        class365 var9 = (class365) super.field1824.method732(Thread.currentThread());
        class578 var10 = var9.field5523;
        var10.field8347 = 0;
        var10.field8345 = false;
        if (super.field1832 == null) {
            if (super.field1822 != null) {
                this.method269(var10, var9.field7429, arg6, arg0, arg1, arg2, arg4, arg5, arg7, var9.field7423, arg3, -106);
                return;
            }
        } else {
            this.method266(arg0, 74, arg6, arg1, arg5, arg2, arg7, var9.field7429, arg3, arg4, var10, var9.field7423);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIIILrda;[I[I[I)V")
    private final void method270(boolean arg0, int arg1, int arg2, int arg3, class578 arg4, int[] arg5, int[] arg6, int[] arg7) {
        ++field506;
        class482 var9 = super.field1832[arg2][arg1];
        if (var9 != null) {
            if ((2 & var9.field7079) == 0) {
                int var10 = super.field1662 * arg2;
                int var11 = var10 - -super.field1662;
                int var12 = super.field1662 * arg1;
                int var13 = super.field1662 + var12;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                int var45;
                if (~(var9.field7079 & 1) != -1 && !arg0) {
                    int var18 = super.field1816[arg2][arg1];
                    if (super.field1823 != -1) {
                        var19 = super.field1823;
                        var20 = super.field1823;
                        var21 = super.field1823;
                        var22 = super.field1823;
                    } else {
                        int var23 = super.field1826 * var18;
                        var22 = (super.field1833 * var12 + super.field1827 * var10 + var23 >> 14) + super.field1828;
                        if (super.field1824.field8204 >= var22) {
                            return;
                        }
                        var21 = (super.field1833 * var12 + super.field1827 * var11 + var23 >> 14) + super.field1828;
                        if (~var21 >= ~super.field1824.field8204) {
                            return;
                        }
                        var20 = (super.field1833 * var13 + (super.field1827 * var11 - -var23) >> 14) + super.field1828;
                        if (~super.field1824.field8204 <= ~var20) {
                            return;
                        }
                        var19 = (super.field1827 * var10 - -(super.field1833 * var13) + var23 >> 14) + super.field1828;
                        if (~super.field1824.field8204 <= ~var19) {
                            return;
                        }
                    }
                    if (super.field1824.field8184) {
                        int var24 = -super.field1824.field8186 + var22;
                        if (var24 > 0) {
                            var14 = var24;
                            if (~var24 < -256) {
                                var14 = 255;
                            }
                        }
                        int var25 = -super.field1824.field8186 + var21;
                        if (~var25 < -1) {
                            var15 = var25;
                            if (~var25 < -256) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field1824.field8186 + var20;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = var19 - super.field1824.field8186;
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field1813 * var18;
                    var29 = super.field1825 - -(super.field1831 * var10 - -var28 - -(super.field1818 * var12) >> 14);
                    int var30 = super.field1834 * var18;
                    var31 = super.field1824.field8178 * var29 / var22 + arg4.field8342;
                    var32 = super.field1814 - -(super.field1815 * var10 + var30 - -(super.field1829 * var12) >> 14);
                    var33 = super.field1824.field8173 * var32 / var22 + arg4.field8346;
                    var34 = (super.field1818 * var12 + super.field1831 * var11 + var28 >> 14) + super.field1825;
                    var35 = super.field1814 - -(super.field1815 * var11 - (-var30 - super.field1829 * var12) >> 14);
                    var36 = super.field1824.field8178 * var34 / var21 + arg4.field8342;
                    var37 = super.field1825 - -(super.field1818 * var13 + (super.field1831 * var11 - -var28) >> 14);
                    var38 = super.field1824.field8173 * var35 / var21 + arg4.field8346;
                    var39 = (super.field1829 * var13 + super.field1815 * var11 + var30 >> 14) + super.field1814;
                    var40 = super.field1824.field8178 * var37 / var20 + arg4.field8342;
                    var41 = super.field1825 - -(super.field1818 * var13 + super.field1831 * var10 + var28 >> 14);
                    var42 = super.field1824.field8173 * var39 / var20 + arg4.field8346;
                    var43 = (super.field1829 * var13 + super.field1815 * var10 + var30 >> 14) + super.field1814;
                    var44 = super.field1824.field8178 * var41 / var19 + arg4.field8342;
                    var45 = super.field1824.field8173 * var43 / var19 + arg4.field8346;
                } else {
                    int var46 = super.field1816[arg2][arg1];
                    int var47 = super.field1816[arg2 + 1][arg1];
                    int var48 = super.field1816[arg2 + 1][arg1 + 1];
                    int var49 = super.field1816[arg2][arg1 + 1];
                    if (super.field1823 != -1) {
                        var19 = super.field1823;
                        var20 = super.field1823;
                        var21 = super.field1823;
                        var22 = super.field1823;
                    } else {
                        var22 = (super.field1827 * var10 - -(super.field1826 * var46) - -(super.field1833 * var12) >> 14) + super.field1828;
                        if (super.field1824.field8204 >= var22) {
                            return;
                        }
                        var21 = (super.field1827 * var11 + super.field1833 * var12 + super.field1826 * var47 >> 14) + super.field1828;
                        if (~var21 >= ~super.field1824.field8204) {
                            return;
                        }
                        var20 = super.field1828 - -(super.field1827 * var11 + super.field1833 * var13 + super.field1826 * var48 >> 14);
                        if (var20 <= super.field1824.field8204) {
                            return;
                        }
                        var19 = (super.field1826 * var49 + (super.field1827 * var10 - -(super.field1833 * var13)) >> 14) + super.field1828;
                        if (~super.field1824.field8204 <= ~var19) {
                            return;
                        }
                    }
                    if (arg0) {
                        int var50 = -super.field1824.field8186 + var22;
                        if (var50 > 255) {
                            var50 = 255;
                        }
                        if (var50 > 0) {
                            var14 = var50;
                            int var51 = var9.field7077 * var50 / 255;
                            if (var51 > 0) {
                                var46 -= var51;
                            }
                        }
                        int var52 = var21 - super.field1824.field8186;
                        if (var52 > 255) {
                            var52 = 255;
                        }
                        if (var52 > 0) {
                            var15 = var52;
                            int var53 = var9.field7071 * var52 / 255;
                            if (~var53 < -1) {
                                var47 -= var53;
                            }
                        }
                        int var54 = -super.field1824.field8186 + var20;
                        if (var54 > 255) {
                            var54 = 255;
                        }
                        if (var54 > 0) {
                            var16 = var54;
                            int var55 = var9.field7078 * var54 / 255;
                            if (var55 > 0) {
                                var48 -= var55;
                            }
                        }
                        int var56 = var19 - super.field1824.field8186;
                        if (var56 > 255) {
                            var56 = 255;
                        }
                        if (var56 > 0) {
                            var17 = var56;
                            int var57 = var9.field7074 * var56 / 255;
                            if (var57 > 0) {
                                var49 -= var57;
                            }
                        }
                    } else if (super.field1824.field8184) {
                        int var58 = var22 - super.field1824.field8186;
                        if (var58 > 0) {
                            var14 = var58;
                            if (~var58 < -256) {
                                var14 = 255;
                            }
                        }
                        int var59 = -super.field1824.field8186 + var21;
                        if (~var59 < -1) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = -super.field1824.field8186 + var20;
                        if (~var60 < -1) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = -super.field1824.field8186 + var19;
                        if (var61 > 0) {
                            var17 = var61;
                            if (~var61 < -256) {
                                var17 = 255;
                            }
                        }
                    }
                    var29 = (super.field1818 * var12 + super.field1831 * var10 + super.field1813 * var46 >> 14) + super.field1825;
                    var31 = super.field1824.field8178 * var29 / var22 + arg4.field8342;
                    var32 = (super.field1829 * var12 + super.field1815 * var10 - -(super.field1834 * var46) >> 14) + super.field1814;
                    var33 = super.field1824.field8173 * var32 / var22 + arg4.field8346;
                    var34 = (super.field1831 * var11 - -(super.field1813 * var47) - -(super.field1818 * var12) >> 14) + super.field1825;
                    var36 = super.field1824.field8178 * var34 / var21 + arg4.field8342;
                    var35 = (super.field1815 * var11 - (-(super.field1834 * var47) - super.field1829 * var12) >> 14) + super.field1814;
                    var37 = (super.field1813 * var48 + (super.field1831 * var11 - -(super.field1818 * var13)) >> 14) + super.field1825;
                    var38 = arg4.field8346 - -(super.field1824.field8173 * var35 / var21);
                    var39 = (super.field1829 * var13 + super.field1834 * var48 + super.field1815 * var11 >> 14) + super.field1814;
                    var40 = super.field1824.field8178 * var37 / var20 + arg4.field8342;
                    var42 = super.field1824.field8173 * var39 / var20 + arg4.field8346;
                    var41 = super.field1825 - -(super.field1813 * var49 + super.field1831 * var10 + super.field1818 * var13 >> 14);
                    var43 = (super.field1834 * var49 + super.field1829 * var13 + super.field1815 * var10 >> 14) + super.field1814;
                    var44 = super.field1824.field8178 * var41 / var19 + arg4.field8342;
                    var45 = arg4.field8346 - -(super.field1824.field8173 * var43 / var19);
                }
                boolean var62 = var9.field7072 != -1 && this.method880(super.field1824.field8852.method438(110, var9.field7072).field8935);
                int var63 = var15 + var16 - -var17;
                if ((-var44 + var40) * (-var45 + var38) + -((var42 - var45) * (-var44 + var36)) > 0) {
                    arg4.field8345 = var40 < 0 || ~var44 > -1 || var36 < 0 || ~var40 < ~arg4.field8335 || ~var44 < ~arg4.field8335 || ~var36 < ~arg4.field8335;
                    if (~var63 <= -766) {
                        arg4.method3358(var42, var45, var38, var40, var44, var36, super.field1824.field8181);
                    } else {
                        if (var62) {
                            arg4.field8347 = 100;
                        }
                        if (var63 > 0) {
                            if (var9.field7072 < 0) {
                                arg4.method3367(var42, var45, var38, var40, var44, var36, class1.method3(-125, var9.field7073, super.field1824.field8181 | var16 << 24), class1.method3(arg3 ^ 20247, var9.field7076, var17 << 24 | super.field1824.field8181), class1.method3(arg3 + 20204, var9.field7069, var15 << 24 | super.field1824.field8181));
                            } else {
                                arg4.method3355(var42, var45, var38, var40, var44, var36, super.field1824.field8181, var16, var17, var15, var9.field7073, var9.field7076, var9.field7069, var37, var41, var34, var39, var43, var35, var20, var19, var21, var9.field7072);
                            }
                        } else if (~var9.field7072 <= -1) {
                            arg4.method3361(var42, var45, var38, var40, var44, var36, var9.field7073, var9.field7076, var9.field7069, var37, var41, var34, var39, var43, var35, var20, var19, var21, var9.field7072);
                        } else {
                            arg4.method3367(var42, var45, var38, var40, var44, var36, var9.field7073, var9.field7076, var9.field7069);
                        }
                        arg4.field8347 = 0;
                    }
                }
                int var64 = var14 + var17 - -var15;
                if ((-var36 + var31) * (-var38 + var45) + -((var33 - var38) * (var44 - var36)) > 0) {
                    arg4.field8345 = ~var31 > -1 || ~var36 > -1 || var44 < 0 || ~var31 < ~arg4.field8335 || ~arg4.field8335 > ~var36 || var44 > arg4.field8335;
                    if (~var64 <= -766) {
                        arg4.method3358(var33, var38, var45, var31, var36, var44, super.field1824.field8181);
                        return;
                    }
                    if (var62) {
                        arg4.field8347 = 100;
                    }
                    if (var64 <= 0) {
                        if (~var9.field7072 <= -1) {
                            arg4.method3361(var33, var38, var45, var31, var36, var44, var9.field7075, var9.field7069, var9.field7076, var29, var34, var41, var32, var35, var43, var22, var21, var19, var9.field7072);
                        } else {
                            arg4.method3367(var33, var38, var45, var31, var36, var44, var9.field7075, var9.field7069, var9.field7076);
                        }
                    } else if (~var9.field7072 <= -1) {
                        arg4.method3355(var33, var38, var45, var31, var36, var44, super.field1824.field8181, var14, var15, var17, var9.field7075, var9.field7069, var9.field7076, var29, var34, var41, var32, var35, var43, var22, var21, var19, var9.field7072);
                    } else {
                        arg4.method3367(var33, var38, var45, var31, var36, var44, class1.method3(arg3 ^ 20244, var9.field7075, super.field1824.field8181 | var14 << 24), class1.method3(arg3 ^ 20246, var9.field7069, var15 << 24 | super.field1824.field8181), class1.method3(-127, var9.field7076, var17 << 24 | super.field1824.field8181));
                    }
                    arg4.field8347 = 0;
                }
            }
        } else {
            if (arg3 != -20330) {
                method265(71, (class528) null);
            }
            class423 var65 = super.field1821[arg2][arg1];
            if (var65 != null) {
                if (super.field1823 != -1) {
                    for (int var66 = 0; var65.field6316 > var66; ++var66) {
                        int var67 = var65.field6314[var66] - -(arg2 << super.field1663);
                        int var68 = var65.field6319[var66];
                        int var69 = (arg1 << super.field1663) + var65.field6313[var66];
                        arg6[var66] = 0;
                        if (!arg0) {
                            if (super.field1824.field8184) {
                                int var70 = -super.field1824.field8186 + super.field1823;
                                if (var70 > 0) {
                                    arg6[var66] = var70;
                                    if (~arg6[var66] < -256) {
                                        arg6[var66] = 255;
                                    }
                                }
                            }
                        } else {
                            int var71 = -super.field1824.field8186 + super.field1823;
                            if (var71 > 255) {
                                var71 = 255;
                            }
                            if (~var71 < -1) {
                                arg6[var66] = var71;
                                int var72 = var65.field6317[var66] * var71 / 255;
                                if (var72 > 0) {
                                    var68 -= var72;
                                }
                            }
                        }
                        int var73 = (super.field1815 * var67 + (super.field1834 * var68 - -(super.field1829 * var69)) >> 14) + super.field1814;
                        int var74 = (super.field1813 * var68 + super.field1831 * var67 + super.field1818 * var69 >> 14) + super.field1825;
                        arg7[var66] = super.field1824.field8178 * var74 / super.field1823 + arg4.field8342;
                        arg5[var66] = arg4.field8346 - -(super.field1824.field8173 * var73 / super.field1823);
                    }
                } else {
                    for (int var75 = 0; ~var65.field6316 < ~var75; ++var75) {
                        int var115 = (arg2 << super.field1663) + var65.field6314[var75];
                        int var116 = var65.field6319[var75];
                        int var117 = (arg1 << super.field1663) + var65.field6313[var75];
                        int var118 = (super.field1827 * var115 + super.field1833 * var117 + super.field1826 * var116 >> 14) + super.field1828;
                        if (~super.field1824.field8204 <= ~var118) {
                            return;
                        }
                        arg6[var75] = 0;
                        if (!arg0) {
                            if (super.field1824.field8184) {
                                int var119 = var118 - super.field1824.field8186;
                                if (var119 > 0) {
                                    arg6[var75] = var119;
                                    if (~arg6[var75] < -256) {
                                        arg6[var75] = 255;
                                    }
                                }
                            }
                        } else {
                            int var120 = -super.field1824.field8186 + var118;
                            if (var120 > 255) {
                                var120 = 255;
                            }
                            if (~var120 < -1) {
                                arg6[var75] = var120;
                                int var121 = var65.field6317[var75] * var120 / 255;
                                if (var121 > 0) {
                                    var116 -= var121;
                                }
                            }
                        }
                        int var122 = (super.field1815 * var115 + super.field1834 * var116 + super.field1829 * var117 >> 14) + super.field1814;
                        int var123 = (super.field1818 * var117 + super.field1831 * var115 + super.field1813 * var116 >> 14) + super.field1825;
                        arg7[var75] = super.field1824.field8178 * var123 / var118 + arg4.field8342;
                        arg5[var75] = super.field1824.field8173 * var122 / var118 + arg4.field8346;
                    }
                }
                if (var65.field6320 == null) {
                    for (int var76 = 0; var76 < var65.field6318; ++var76) {
                        int var77 = var76 * 3;
                        int var78 = var77 + 1;
                        int var79 = var78 - -1;
                        int var80 = arg7[var77];
                        int var81 = arg7[var78];
                        int var82 = arg7[var79];
                        int var83 = arg5[var77];
                        int var84 = arg5[var78];
                        int var85 = arg5[var79];
                        int var86 = arg6[var77] + arg6[var78] - -arg6[var79];
                        if ((-var81 + var80) * (-var84 + var85) + -((-var81 + var82) * (-var84 + var83)) > 0) {
                            arg4.field8345 = ~var80 > -1 || var81 < 0 || var82 < 0 || arg4.field8335 < var80 || var81 > arg4.field8335 || ~var82 < ~arg4.field8335;
                            if (~var86 > -766) {
                                if (~var86 >= -1) {
                                    if ((16777215 & var65.field6311[var77]) != 0) {
                                        arg4.method3367(var83, var84, var85, var80, var81, var82, var65.field6311[var77], var65.field6311[var78], var65.field6311[var79]);
                                    }
                                } else if (~(16777215 & var65.field6311[var77]) != -1) {
                                    arg4.method3367(var83, var84, var85, var80, var81, var82, class496.method2974(var65.field6311[var77], arg6[var77], 94, super.field1824.field8181), class496.method2974(var65.field6311[var78], arg6[var78], arg3 ^ -20269, super.field1824.field8181), class496.method2974(var65.field6311[var79], arg6[var79], arg3 + 20430, super.field1824.field8181));
                                }
                            } else {
                                arg4.method3358(var83, var84, var85, var80, var81, var82, super.field1824.field8181);
                            }
                        }
                    }
                } else {
                    int var87 = super.field1816[arg2][arg1];
                    int var88 = super.field1816[arg2 + 1][arg1];
                    int var89 = super.field1816[arg2][arg1 + 1];
                    int var90 = super.field1662 * arg2;
                    int var91 = var90 - -super.field1662;
                    int var92 = super.field1662 * arg1;
                    int var93 = super.field1662 + var92;
                    int var94 = (super.field1831 * var90 + super.field1813 * var87 - -(super.field1818 * var92) >> 14) + super.field1825;
                    int var95 = (super.field1829 * var92 + super.field1834 * var87 + super.field1815 * var90 >> 14) + super.field1814;
                    int var96 = super.field1828 - -(super.field1826 * var87 + (super.field1827 * var90 - -(super.field1833 * var92)) >> 14);
                    int var97 = (super.field1831 * var91 + super.field1813 * var88 - -(super.field1818 * var92) >> 14) + super.field1825;
                    int var98 = (super.field1815 * var91 - (-(super.field1834 * var88) + -(super.field1829 * var92)) >> 14) + super.field1814;
                    int var99 = (super.field1826 * var88 + super.field1833 * var92 + super.field1827 * var91 >> 14) + super.field1828;
                    int var100 = (super.field1818 * var93 + super.field1831 * var90 + super.field1813 * var89 >> 14) + super.field1825;
                    int var101 = (super.field1815 * var90 + super.field1834 * var89 + super.field1829 * var93 >> 14) + super.field1814;
                    int var102 = (super.field1833 * var93 + super.field1827 * var90 + super.field1826 * var89 >> 14) + super.field1828;
                    for (int var103 = 0; var65.field6318 > var103; ++var103) {
                        int var104 = var103 * 3;
                        int var105 = var104 + 1;
                        int var106 = var105 + 1;
                        int var107 = arg7[var104];
                        int var108 = arg7[var105];
                        int var109 = arg7[var106];
                        int var110 = arg5[var104];
                        int var111 = arg5[var105];
                        int var112 = arg5[var106];
                        int var113 = arg6[var104] + arg6[var105] - -arg6[var106];
                        if (~((var107 - var108) * (-var111 + var112) + -((var109 - var108) * (var110 - var111))) < -1) {
                            arg4.field8345 = var107 < 0 || ~var108 > -1 || ~var109 > -1 || var107 > arg4.field8335 || arg4.field8335 < var108 || arg4.field8335 < var109;
                            short var114 = var65.field6320[var103];
                            if (~var113 > -766) {
                                if (~var114 != 0 && this.method880(super.field1824.field8852.method438(91, var114).field8935)) {
                                    arg4.field8347 = 100;
                                }
                                if (var113 > 0) {
                                    if (~var114 != 0) {
                                        arg4.method3355(var110, var111, var112, var107, var108, var109, super.field1824.field8181, arg6[var104], arg6[var105], arg6[var106], var65.field6311[var104], var65.field6311[var105], var65.field6311[var106], var94, var97, var100, var95, var98, var101, var96, var99, var102, var114);
                                    } else if (~(16777215 & var65.field6311[var104]) != -1) {
                                        arg4.method3367(var110, var111, var112, var107, var108, var109, class1.method3(-128, var65.field6311[var104], arg6[var104] << 24 | super.field1824.field8181), class1.method3(-128, var65.field6311[var105], super.field1824.field8181 | arg6[var105] << 24), class1.method3(-126, var65.field6311[var106], arg6[var106] << 24 | super.field1824.field8181));
                                    }
                                } else if (~var114 == 0) {
                                    if ((16777215 & var65.field6311[var104]) != 0) {
                                        arg4.method3367(var110, var111, var112, var107, var108, var109, var65.field6311[var104], var65.field6311[var105], var65.field6311[var106]);
                                    }
                                } else {
                                    arg4.method3361(var110, var111, var112, var107, var108, var109, var65.field6311[var104], var65.field6311[var105], var65.field6311[var106], var94, var97, var100, var95, var98, var101, var96, var99, var102, var114);
                                }
                                arg4.field8347 = 0;
                            } else {
                                arg4.method3358(var110, var111, var112, var107, var108, var109, super.field1824.field8181);
                            }
                        }
                    }
                }
            }
        }
    }
}
