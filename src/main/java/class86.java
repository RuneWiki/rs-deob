import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class86 {

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    private int field1624 = -1;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    private int field1625 = 0;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lcf;")
    private class28 field1631 = new class28();

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Z")
    public boolean field1635 = false;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "[Llb;")
    private class120[] field1632;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[[I")
    private int[][] field1626;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lvd;")
    public static class222 field1629 = class212.method1357("Bitte warten Sie eine Minute", 10731);

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lba;")
    public static class13 field1622;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "[I")
    public static int[] field1619;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method553(int arg0) {
        if (arg0 != -1495) {
            method553(-2);
        }
        field1619 = null;
        field1622 = null;
        field1629 = null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)[[I")
    public final int[][] method554(int arg0) {
        if (arg0 != -5038) {
            this.method557(117, -14);
        }
        field1623++;
        if (this.field1628 != this.field1621) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1621; var2++) {
            this.field1632[var2] = class97.field1821;
        }
        return this.field1626;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public final void method555(int arg0) {
        for (int var2 = 0; var2 < this.field1621; var2++) {
            this.field1626[var2] = null;
        }
        this.field1626 = null;
        this.field1632 = null;
        field1633++;
        this.field1631.method238(1);
        if (arg0 != 200652353) {
            field1630 = 82;
        }
        this.field1631 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B[IIIIIIZIII)V")
    public static final void method556(byte arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field1634++;
        if (arg2 == 9) {
            arg6 = arg6 + 1 & 0x3;
            arg2 = 1;
        }
        if (arg9 < class53.field1013) {
            arg4 -= class53.field1013 - arg9;
            arg9 = class53.field1013;
        }
        if (arg3 < class53.field1008) {
            arg8 -= class53.field1008 - arg3;
            arg3 = class53.field1008;
        }
        if (class53.field1012 < arg9 + arg4) {
            arg4 = class53.field1012 - arg9;
        }
        if (arg2 == 10) {
            arg6 = arg6 + 3 & 0x3;
            arg2 = 1;
        }
        int var11 = class53.field1010 - arg4;
        int var12 = class53.field1010 * arg3 + arg9;
        int var13 = -83 / ((27 - arg0) / 53);
        if (arg2 == 11) {
            arg2 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg3 + arg8 > class53.field1011) {
            arg8 = class53.field1011 - arg3;
        }
        if (arg2 == 1) {
            if (arg6 == 0) {
                for (int var14 = 0; var14 < arg8; var14++) {
                    for (int var15 = 0; var15 < arg4; var15++) {
                        if (var14 >= var15) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 1) {
                for (int var16 = arg8 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg4; var17++) {
                        if (var17 <= var16) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 2) {
                for (int var18 = 0; var18 < arg8; var18++) {
                    for (int var19 = 0; var19 < arg4; var19++) {
                        if (var18 <= var19) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 3) {
                for (int var20 = arg8 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg4; var21++) {
                        if (var21 >= var20) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg2 == 2) {
            if (arg6 == 0) {
                for (int var22 = arg8 - 1; var22 >= 0; var22--) {
                    for (int var23 = 0; var23 < arg4; var23++) {
                        if (var22 >> 1 >= var23) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 1) {
                for (int var24 = 0; var24 < arg8; var24++) {
                    for (int var25 = 0; var25 < arg4; var25++) {
                        if (var24 << 1 <= var25) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 2) {
                for (int var26 = 0; var26 < arg8; var26++) {
                    for (int var27 = arg4 - 1; var27 >= 0; var27--) {
                        if (var26 >> 1 >= var27) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 3) {
                for (int var28 = arg8 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg4 - 1; var29 >= 0; var29--) {
                        if (var28 << 1 <= var29) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg2 == 3) {
            if (arg6 == 0) {
                for (int var30 = arg8 - 1; var30 >= 0; var30--) {
                    for (int var31 = arg4 - 1; var31 >= 0; var31--) {
                        if (var30 >> 1 >= var31) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 1) {
                for (int var32 = arg8 - 1; var32 >= 0; var32--) {
                    for (int var33 = 0; var33 < arg4; var33++) {
                        if (var32 << 1 <= var33) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 2) {
                for (int var34 = 0; var34 < arg8; var34++) {
                    for (int var35 = 0; var35 < arg4; var35++) {
                        if (var34 >> 1 >= var35) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 3) {
                for (int var36 = 0; var36 < arg8; var36++) {
                    for (int var37 = arg4 - 1; var37 >= 0; var37--) {
                        if (var36 << 1 <= var37) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg2 == 4) {
            if (arg6 == 0) {
                for (int var38 = arg8 - 1; var38 >= 0; var38--) {
                    for (int var39 = 0; var39 < arg4; var39++) {
                        if (var38 >> 1 <= var39) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 1) {
                for (int var40 = 0; var40 < arg8; var40++) {
                    for (int var41 = 0; var41 < arg4; var41++) {
                        if (var41 <= var40 << 1) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 2) {
                for (int var42 = 0; var42 < arg8; var42++) {
                    for (int var43 = arg4 - 1; var43 >= 0; var43--) {
                        if (var43 >= var42 >> 1) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg6 == 3) {
                for (int var44 = arg8 - 1; var44 >= 0; var44--) {
                    for (int var45 = arg4 - 1; var45 >= 0; var45--) {
                        if (var45 <= var44 << 1) {
                            arg1[var12] = arg10;
                        } else if (arg7) {
                            arg1[var12] = arg5;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg2 != 5) {
            if (arg2 == 6) {
                if (arg6 == 0) {
                    for (int var54 = 0; var54 < arg8; var54++) {
                        for (int var55 = 0; var55 < arg4; var55++) {
                            if (arg4 / 2 >= var55) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var56 = 0; var56 < arg8; var56++) {
                        for (int var57 = 0; var57 < arg4; var57++) {
                            if (arg8 / 2 >= var56) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var58 = 0; var58 < arg8; var58++) {
                        for (int var59 = 0; var59 < arg4; var59++) {
                            if (arg4 / 2 <= var59) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var60 = 0; var60 < arg8; var60++) {
                        for (int var61 = 0; var61 < arg4; var61++) {
                            if (var60 >= arg8 / 2) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
            if (arg2 == 7) {
                if (arg6 == 0) {
                    for (int var62 = 0; var62 < arg8; var62++) {
                        for (int var63 = 0; var63 < arg4; var63++) {
                            if (var63 <= var62 - arg8 / 2) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var64 = arg8 - 1; var64 >= 0; var64--) {
                        for (int var65 = 0; var65 < arg4; var65++) {
                            if (var64 - arg8 / 2 >= var65) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var66 = arg8 - 1; var66 >= 0; var66--) {
                        for (int var67 = arg4 - 1; var67 >= 0; var67--) {
                            if (var67 <= var66 - arg8 / 2) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var68 = 0; var68 < arg8; var68++) {
                        for (int var69 = arg4 - 1; var69 >= 0; var69--) {
                            if (var69 <= var68 - arg8 / 2) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
            if (arg2 == 8) {
                if (arg6 == 0) {
                    for (int var70 = 0; var70 < arg8; var70++) {
                        for (int var71 = 0; var71 < arg4; var71++) {
                            if (var71 >= var70 - arg8 / 2) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var72 = arg8 - 1; var72 >= 0; var72--) {
                        for (int var73 = 0; var73 < arg4; var73++) {
                            if (var73 >= var72 - arg8 / 2) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var74 = arg8 - 1; var74 >= 0; var74--) {
                        for (int var75 = arg4 - 1; var75 >= 0; var75--) {
                            if (var74 - arg8 / 2 <= var75) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var76 = 0; var76 < arg8; var76++) {
                        for (int var77 = arg4 - 1; var77 >= 0; var77--) {
                            if (var76 - arg8 / 2 <= var77) {
                                arg1[var12] = arg10;
                            } else if (arg7) {
                                arg1[var12] = arg5;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var46 = arg8 - 1; var46 >= 0; var46--) {
                for (int var47 = arg4 - 1; var47 >= 0; var47--) {
                    if (var46 >> 1 <= var47) {
                        arg1[var12] = arg10;
                    } else if (arg7) {
                        arg1[var12] = arg5;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg6 == 1) {
            for (int var48 = arg8 - 1; var48 >= 0; var48--) {
                for (int var49 = 0; var49 < arg4; var49++) {
                    if (var49 <= var48 << 1) {
                        arg1[var12] = arg10;
                    } else if (arg7) {
                        arg1[var12] = arg5;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg6 == 2) {
            for (int var50 = 0; var50 < arg8; var50++) {
                for (int var51 = 0; var51 < arg4; var51++) {
                    if (var51 >= var50 >> 1) {
                        arg1[var12] = arg10;
                    } else if (arg7) {
                        arg1[var12] = arg5;
                    }
                    var12++;
                }
                var12 += var11;
            }
        } else if (arg6 == 3) {
            for (int var52 = 0; var52 < arg8; var52++) {
                for (int var53 = arg4 - 1; var53 >= 0; var53--) {
                    if (var52 << 1 >= var53) {
                        arg1[var12] = arg10;
                    } else if (arg7) {
                        arg1[var12] = arg5;
                    }
                    var12++;
                }
                var12 += var11;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I")
    public final int[] method557(int arg0, int arg1) {
        field1627++;
        if (arg0 != 6978) {
            method556((byte) 28, null, 10, -56, 15, -119, 14, false, -13, 21, 103);
        }
        if (this.field1628 == this.field1621) {
            this.field1635 = this.field1632[arg1] == null;
            this.field1632[arg1] = class97.field1821;
            return this.field1626[arg1];
        } else if (this.field1621 == 1) {
            this.field1635 = this.field1624 != arg1;
            this.field1624 = arg1;
            return this.field1626[0];
        } else {
            class120 var3 = this.field1632[arg1];
            if (var3 == null) {
                this.field1635 = true;
                if (this.field1625 < this.field1621) {
                    var3 = new class120(arg1, this.field1625);
                    this.field1625++;
                } else {
                    class120 var4 = (class120) this.field1631.method246(arg0 ^ 0x1B42);
                    var3 = new class120(arg1, var4.field2272);
                    this.field1632[var4.field2271] = null;
                    var4.method826(arg0 ^ 0xFFFFB2E9);
                }
                this.field1632[arg1] = var3;
            } else {
                this.field1635 = false;
            }
            this.field1631.method240(var3, (byte) 60);
            return this.field1626[var3.field2272];
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(III)V")
    public class86(int arg0, int arg1, int arg2) {
        this.field1628 = arg1;
        this.field1632 = new class120[this.field1628];
        this.field1621 = arg0;
        this.field1626 = new int[this.field1621][arg2];
    }
}
