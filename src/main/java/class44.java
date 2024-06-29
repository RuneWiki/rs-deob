import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class44 extends class343 {

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    private int field646 = -1;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "Llo;")
    private class509 field645;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "[[I")
    public int[][] field656;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "[[B")
    private byte[][] field650;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "[[B")
    private byte[][] field647;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    private int field639;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    private int field641;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    private int field642;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    private int field648;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "[[Ldp;")
    private class3[][] field644;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "[[Ldl;")
    private class43[][] field637;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "[[Lhg;")
    private class468[][] field655;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "[[Lqm;")
    private class92[][] field649;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Lh;IIIIZ)V")
    public final void method299(class452 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Llo;IIII[[I[[II)V")
    public class44(class509 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field645 = arg0;
        this.field654 = arg2;
        this.field656 = arg5;
        this.field650 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field645.field7727 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field645.field7728 * var18 + this.field645.field7729 * var17 + this.field645.field7708 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field650[var11][var10] = (byte) var20;
            }
        }
        this.field647 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)V")
    public final void method300(int arg0, int arg1, int arg2) {
        if (this.field647[arg0][arg1] < arg2) {
            this.field647[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIIII[[ZLb;[I[I)V")
    private final void method301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class210 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3273 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field637[var16][var17] != null) {
                        class43 var18 = this.field637[var16][var17];
                        if (var18.field634 != -1 && (var18.field624 & 2) == 0 && var18.field632 == 0) {
                            int var19 = this.field645.method3047(var18.field634);
                            arg8.method1282(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class400.method2376(2, var19, var18.field626), class400.method2376(2, var19, var18.field628), class400.method2376(2, var19, var18.field629));
                            arg8.method1282(var15, var15, var15 - var13, var14, var13 + var14, var14, class400.method2376(2, var19, var18.field633), class400.method2376(2, var19, var18.field629), class400.method2376(2, var19, var18.field628));
                        } else if (var18.field632 == 0) {
                            arg8.method1292(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field626, var18.field628, var18.field629);
                            arg8.method1292(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field633, var18.field629, var18.field628);
                        } else {
                            int var20 = var18.field632;
                            arg8.method1292(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class105.method774(var20, var18.field626 & -16777216, true), class105.method774(var20, var18.field628 & -16777216, true), class105.method774(var20, var18.field629 & -16777216, true));
                            arg8.method1292(var15, var15, var15 - var13, var14, var13 + var14, var14, class105.method774(var20, var18.field633 & -16777216, true), class105.method774(var20, var18.field629 & -16777216, true), class105.method774(var20, var18.field628 & -16777216, true));
                        }
                    } else if (this.field649[var16][var17] != null) {
                        class92 var21 = this.field649[var16][var17];
                        for (int var22 = 0; var22 < var21.field1650; ++var22) {
                            arg9[var22] = var21.field1648[var22] * var13 / super.field5107 + var14;
                            arg10[var22] = var15 - var21.field1652[var22] * var13 / super.field5107;
                        }
                        for (int var23 = 0; var23 < var21.field1644; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1647 == null || var21.field1647[var23] == 0 || var21.field1646 != null && (var21.field1646 == null || var21.field1646[var23] != -1)) {
                                if (var21.field1646 != null && var21.field1646[var23] != -1) {
                                    int var34 = this.field645.method3047(var21.field1646[var23]);
                                    arg8.method1282(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method1292(var30, var31, var32, var27, var28, var29, var21.field1649[var24], var21.field1649[var25], var21.field1649[var26]);
                                }
                            } else {
                                int var33 = var21.field1647[var23];
                                arg8.method1292(var30, var31, var32, var27, var28, var29, class105.method774(var33, -16777216 - (var21.field1649[var24] & -16777216), true), class105.method774(var33, -16777216 - (var21.field1649[var25] & -16777216), true), class105.method774(var33, -16777216 - (var21.field1649[var26] & -16777216), true));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3273 = true;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(Lh;IIIIZ)Z")
    public final boolean method302(class452 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class86 var9 = this.field645.method3046(Thread.currentThread());
        class210 var10 = var9.field1441;
        var10.field3272 = 0;
        var10.field3266 = false;
        if (this.field637 != null) {
            this.method301(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1481, var9.field1450);
        } else {
            if (this.field644 != null) {
                this.method313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1481, var9.field1450);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lh;IIIIZ)V")
    public final void method304(class452 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIZLb;[I[I[I)V")
    private final void method305(int arg0, int arg1, boolean arg2, class210 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class43 var8 = this.field637[arg0][arg1];
        if (var8 != null) {
            if ((var8.field624 & 2) == 0) {
                int var9 = super.field5107 * arg0;
                int var10 = super.field5107 + var9;
                int var11 = super.field5107 * arg1;
                int var12 = super.field5107 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
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
                if ((var8.field624 & 1) != 0 && !arg2) {
                    int var17 = this.field656[arg0][arg1];
                    if (this.field646 == -1) {
                        int var18 = this.field643 * var17;
                        var19 = (this.field639 * var11 + this.field651 * var9 + var18 >> 15) + this.field648;
                        if (var19 <= this.field645.field7709) {
                            return;
                        }
                        var20 = (this.field639 * var11 + this.field651 * var10 + var18 >> 15) + this.field648;
                        if (var20 <= this.field645.field7709) {
                            return;
                        }
                        var21 = (this.field639 * var12 + this.field651 * var10 + var18 >> 15) + this.field648;
                        if (var21 <= this.field645.field7709) {
                            return;
                        }
                        var22 = (this.field639 * var12 + this.field651 * var9 + var18 >> 15) + this.field648;
                        if (var22 <= this.field645.field7709) {
                            return;
                        }
                    } else {
                        var22 = this.field646;
                        var21 = this.field646;
                        var20 = this.field646;
                        var19 = this.field646;
                    }
                    if (this.field645.field7719) {
                        int var23 = var19 - this.field645.field7732;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field645.field7732;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field645.field7732;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field645.field7732;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field653 * var17;
                    int var28 = this.field642 * var17;
                    var29 = (this.field638 * var11 + this.field652 * var9 + var27 >> 15) + this.field636;
                    var30 = this.field645.field7700 * var29 / var19 + arg3.field3270;
                    var31 = (this.field640 * var11 + this.field635 * var9 + var28 >> 15) + this.field641;
                    var32 = this.field645.field7697 * var31 / var19 + arg3.field3275;
                    var33 = (this.field638 * var11 + this.field652 * var10 + var27 >> 15) + this.field636;
                    var34 = this.field645.field7700 * var33 / var20 + arg3.field3270;
                    var35 = (this.field640 * var11 + this.field635 * var10 + var28 >> 15) + this.field641;
                    var36 = this.field645.field7697 * var35 / var20 + arg3.field3275;
                    var37 = (this.field638 * var12 + this.field652 * var10 + var27 >> 15) + this.field636;
                    var38 = this.field645.field7700 * var37 / var21 + arg3.field3270;
                    var39 = (this.field640 * var12 + this.field635 * var10 + var28 >> 15) + this.field641;
                    var40 = this.field645.field7697 * var39 / var21 + arg3.field3275;
                    var41 = (this.field638 * var12 + this.field652 * var9 + var27 >> 15) + this.field636;
                    var42 = this.field645.field7700 * var41 / var22 + arg3.field3270;
                    var43 = (this.field640 * var12 + this.field635 * var9 + var28 >> 15) + this.field641;
                    var44 = this.field645.field7697 * var43 / var22 + arg3.field3275;
                } else {
                    int var45 = this.field656[arg0][arg1];
                    int var46 = this.field656[arg0 + 1][arg1];
                    int var47 = this.field656[arg0 + 1][arg1 + 1];
                    int var48 = this.field656[arg0][arg1 + 1];
                    if (this.field646 == -1) {
                        var19 = (this.field639 * var11 + this.field651 * var9 + this.field643 * var45 >> 15) + this.field648;
                        if (var19 <= this.field645.field7709) {
                            return;
                        }
                        var20 = (this.field639 * var11 + this.field651 * var10 + this.field643 * var46 >> 15) + this.field648;
                        if (var20 <= this.field645.field7709) {
                            return;
                        }
                        var21 = (this.field639 * var12 + this.field651 * var10 + this.field643 * var47 >> 15) + this.field648;
                        if (var21 <= this.field645.field7709) {
                            return;
                        }
                        var22 = (this.field639 * var12 + this.field651 * var9 + this.field643 * var48 >> 15) + this.field648;
                        if (var22 <= this.field645.field7709) {
                            return;
                        }
                    } else {
                        var22 = this.field646;
                        var21 = this.field646;
                        var20 = this.field646;
                        var19 = this.field646;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field645.field7732;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field631 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field645.field7732;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field625 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field645.field7732;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field630 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field645.field7732;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field627 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field645.field7719) {
                        int var57 = var19 - this.field645.field7732;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field645.field7732;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field645.field7732;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field645.field7732;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field638 * var11 + this.field653 * var45 + this.field652 * var9 >> 15) + this.field636;
                    var30 = this.field645.field7700 * var29 / var19 + arg3.field3270;
                    var31 = (this.field640 * var11 + this.field642 * var45 + this.field635 * var9 >> 15) + this.field641;
                    var32 = this.field645.field7697 * var31 / var19 + arg3.field3275;
                    var33 = (this.field638 * var11 + this.field653 * var46 + this.field652 * var10 >> 15) + this.field636;
                    var34 = this.field645.field7700 * var33 / var20 + arg3.field3270;
                    var35 = (this.field640 * var11 + this.field642 * var46 + this.field635 * var10 >> 15) + this.field641;
                    var36 = this.field645.field7697 * var35 / var20 + arg3.field3275;
                    var37 = (this.field638 * var12 + this.field653 * var47 + this.field652 * var10 >> 15) + this.field636;
                    var38 = this.field645.field7700 * var37 / var21 + arg3.field3270;
                    var39 = (this.field640 * var12 + this.field642 * var47 + this.field635 * var10 >> 15) + this.field641;
                    var40 = this.field645.field7697 * var39 / var21 + arg3.field3275;
                    var41 = (this.field638 * var12 + this.field653 * var48 + this.field652 * var9 >> 15) + this.field636;
                    var42 = this.field645.field7700 * var41 / var22 + arg3.field3270;
                    var43 = (this.field640 * var12 + this.field642 * var48 + this.field635 * var9 >> 15) + this.field641;
                    var44 = this.field645.field7697 * var43 / var22 + arg3.field3275;
                }
                boolean var61 = var8.field634 != -1 && this.method317(this.field645.field4784.method59(var8.field634, 21645).field728);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field3266 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field3274 || var42 > arg3.field3274 || var34 > arg3.field3274;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field3272 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field634 >= 0) {
                                arg3.method1287(var40, var44, var36, var38, var42, var34, this.field645.field7714, var15, var16, var14, var8.field626, var8.field628, var8.field629, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field634);
                            } else {
                                arg3.method1292(var40, var44, var36, var38, var42, var34, class105.method774(var8.field626, var15 << 24 | this.field645.field7714, true), class105.method774(var8.field628, var16 << 24 | this.field645.field7714, true), class105.method774(var8.field629, var14 << 24 | this.field645.field7714, true));
                            }
                        } else if (var8.field634 >= 0) {
                            arg3.method1284(var40, var44, var36, var38, var42, var34, var8.field626, var8.field628, var8.field629, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field634);
                        } else {
                            arg3.method1292(var40, var44, var36, var38, var42, var34, var8.field626, var8.field628, var8.field629);
                        }
                        arg3.field3272 = 0;
                    } else {
                        arg3.method1288(var40, var44, var36, var38, var42, var34, this.field645.field7714);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field3266 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field3274 || var34 > arg3.field3274 || var42 > arg3.field3274;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field3272 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field634 >= 0) {
                                arg3.method1287(var32, var36, var44, var30, var34, var42, this.field645.field7714, var13, var14, var16, var8.field633, var8.field629, var8.field628, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field634);
                            } else {
                                arg3.method1292(var32, var36, var44, var30, var34, var42, class105.method774(var8.field633, var13 << 24 | this.field645.field7714, true), class105.method774(var8.field629, var14 << 24 | this.field645.field7714, true), class105.method774(var8.field628, var16 << 24 | this.field645.field7714, true));
                            }
                        } else if (var8.field634 >= 0) {
                            arg3.method1284(var32, var36, var44, var30, var34, var42, var8.field633, var8.field629, var8.field628, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field634);
                        } else {
                            arg3.method1292(var32, var36, var44, var30, var34, var42, var8.field633, var8.field629, var8.field628);
                        }
                        arg3.field3272 = 0;
                        return;
                    }
                    arg3.method1288(var32, var36, var44, var30, var34, var42, this.field645.field7714);
                }
            }
        } else {
            class92 var64 = this.field649[arg0][arg1];
            if (var64 != null) {
                if (this.field646 == -1) {
                    for (int var65 = 0; var65 < var64.field1650; ++var65) {
                        int var66 = (arg0 << super.field5112) + var64.field1648[var65];
                        int var67 = var64.field1645[var65];
                        int var68 = (arg1 << super.field5112) + var64.field1652[var65];
                        int var69 = (this.field639 * var68 + this.field651 * var66 + this.field643 * var67 >> 15) + this.field648;
                        if (var69 <= this.field645.field7709) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field645.field7732;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field1643[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field645.field7719) {
                            int var72 = var69 - this.field645.field7732;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field638 * var68 + this.field653 * var67 + this.field652 * var66 >> 15) + this.field636;
                        int var74 = (this.field640 * var68 + this.field642 * var67 + this.field635 * var66 >> 15) + this.field641;
                        arg4[var65] = this.field645.field7700 * var73 / var69 + arg3.field3270;
                        arg5[var65] = this.field645.field7697 * var74 / var69 + arg3.field3275;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field1650; ++var75) {
                        int var115 = (arg0 << super.field5112) + var64.field1648[var75];
                        int var116 = var64.field1645[var75];
                        int var117 = (arg1 << super.field5112) + var64.field1652[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field646 - this.field645.field7732;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field1643[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field645.field7719) {
                            int var120 = this.field646 - this.field645.field7732;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field638 * var117 + this.field653 * var116 + this.field652 * var115 >> 15) + this.field636;
                        int var122 = (this.field640 * var117 + this.field642 * var116 + this.field635 * var115 >> 15) + this.field641;
                        arg4[var75] = this.field645.field7700 * var121 / this.field646 + arg3.field3270;
                        arg5[var75] = this.field645.field7697 * var122 / this.field646 + arg3.field3275;
                    }
                }
                if (var64.field1646 != null) {
                    int var76 = this.field656[arg0][arg1];
                    int var77 = this.field656[arg0 + 1][arg1];
                    int var78 = this.field656[arg0][arg1 + 1];
                    int var79 = super.field5107 * arg0;
                    int var80 = super.field5107 + var79;
                    int var81 = super.field5107 * arg1;
                    int var82 = super.field5107 + var81;
                    int var83 = (this.field638 * var81 + this.field653 * var76 + this.field652 * var79 >> 15) + this.field636;
                    int var84 = (this.field640 * var81 + this.field642 * var76 + this.field635 * var79 >> 15) + this.field641;
                    int var85 = (this.field639 * var81 + this.field651 * var79 + this.field643 * var76 >> 15) + this.field648;
                    int var86 = (this.field638 * var81 + this.field653 * var77 + this.field652 * var80 >> 15) + this.field636;
                    int var87 = (this.field640 * var81 + this.field642 * var77 + this.field635 * var80 >> 15) + this.field641;
                    int var88 = (this.field639 * var81 + this.field651 * var80 + this.field643 * var77 >> 15) + this.field648;
                    int var89 = (this.field638 * var82 + this.field653 * var78 + this.field652 * var79 >> 15) + this.field636;
                    int var90 = (this.field640 * var82 + this.field642 * var78 + this.field635 * var79 >> 15) + this.field641;
                    int var91 = (this.field639 * var82 + this.field651 * var79 + this.field643 * var78 >> 15) + this.field648;
                    for (int var92 = 0; var92 < var64.field1644; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg5[var93];
                        int var100 = arg5[var94];
                        int var101 = arg5[var95];
                        int var102 = arg6[var93] + arg6[var94] + arg6[var95];
                        if ((var96 - var97) * (var101 - var100) - (var98 - var97) * (var99 - var100) > 0) {
                            arg3.field3266 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field3274 || var97 > arg3.field3274 || var98 > arg3.field3274;
                            short var103 = var64.field1646[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method317(this.field645.field4784.method59(var103, 21645).field728)) {
                                    arg3.field3272 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method1287(var99, var100, var101, var96, var97, var98, this.field645.field7714, arg6[var93], arg6[var94], arg6[var95], var64.field1649[var93], var64.field1649[var94], var64.field1649[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field1649[var93] & 16777215) != 0) {
                                        arg3.method1292(var99, var100, var101, var96, var97, var98, class105.method774(var64.field1649[var93], arg6[var93] << 24 | this.field645.field7714, true), class105.method774(var64.field1649[var94], arg6[var94] << 24 | this.field645.field7714, true), class105.method774(var64.field1649[var95], arg6[var95] << 24 | this.field645.field7714, true));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method1284(var99, var100, var101, var96, var97, var98, var64.field1649[var93], var64.field1649[var94], var64.field1649[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field1649[var93] & 16777215) != 0) {
                                    arg3.method1292(var99, var100, var101, var96, var97, var98, var64.field1649[var93], var64.field1649[var94], var64.field1649[var95]);
                                }
                                arg3.field3272 = 0;
                            } else {
                                arg3.method1288(var99, var100, var101, var96, var97, var98, this.field645.field7714);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field1644; ++var104) {
                    int var105 = var104 * 3;
                    int var106 = var105 + 1;
                    int var107 = var106 + 1;
                    int var108 = arg4[var105];
                    int var109 = arg4[var106];
                    int var110 = arg4[var107];
                    int var111 = arg5[var105];
                    int var112 = arg5[var106];
                    int var113 = arg5[var107];
                    int var114 = arg6[var105] + arg6[var106] + arg6[var107];
                    if ((var108 - var109) * (var113 - var112) - (var110 - var109) * (var111 - var112) > 0) {
                        arg3.field3266 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field3274 || var109 > arg3.field3274 || var110 > arg3.field3274;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field1649[var105] & 16777215) != 0) {
                                    arg3.method1292(var111, var112, var113, var108, var109, var110, class329.method2046(-849096504, var64.field1649[var105], this.field645.field7714, arg6[var105]), class329.method2046(-849096504, var64.field1649[var106], this.field645.field7714, arg6[var106]), class329.method2046(-849096504, var64.field1649[var107], this.field645.field7714, arg6[var107]));
                                }
                            } else if ((var64.field1649[var105] & 16777215) != 0) {
                                arg3.method1292(var111, var112, var113, var108, var109, var110, var64.field1649[var105], var64.field1649[var106], var64.field1649[var107]);
                            }
                        } else {
                            arg3.method1288(var111, var112, var113, var108, var109, var110, this.field645.field7714);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)V")
    public final void method306(int arg0, int arg1) {
        class86 var3 = this.field645.method3046(Thread.currentThread());
        var3.field1441.field3272 = 0;
        if (this.field637 != null) {
            this.method305(arg0, arg1, this.field645.field7707, var3.field1441, var3.field1481, var3.field1450, var3.field1453);
        } else {
            if (this.field644 != null) {
                this.method315(arg0, arg1, var3.field1441, var3.field1481, var3.field1450, var3.field1453);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(II)I")
    private static final int method307(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "()V")
    public final void method308() {
        this.field650 = null;
        this.field647 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILh;)Lh;")
    public final class452 method309(int arg0, int arg1, class452 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method310(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field644 == null) {
            this.field644 = new class3[super.field5108][super.field5105];
            this.field655 = new class468[super.field5108][super.field5105];
        } else if (this.field637 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field5107 != var20 || var21 != 0 && super.field5107 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class468 var22 = new class468();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field7172 = var23;
            var22.field7184 = new short[var23];
            var22.field7181 = new short[var23];
            var22.field7182 = new short[var23];
            var22.field7177 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field7184[var25] = (short) (this.field650[arg0][arg1] - this.field647[arg0][arg1]);
                } else if (var30 == 0 && super.field5107 == var31) {
                    var22.field7184[var25] = (short) (this.field650[arg0][arg1 + 1] - this.field647[arg0][arg1 + 1]);
                } else if (super.field5107 == var30 && super.field5107 == var31) {
                    var22.field7184[var25] = (short) (this.field650[arg0 + 1][arg1 + 1] - this.field647[arg0 + 1][arg1 + 1]);
                } else if (super.field5107 == var30 && var31 == 0) {
                    var22.field7184[var25] = (short) (this.field650[arg0 + 1][arg1] - this.field647[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field650[arg0 + 1][arg1] - this.field647[arg0 + 1][arg1]) * var30 + (this.field650[arg0][arg1] - this.field647[arg0][arg1]) * (super.field5107 - var30);
                    int var33 = (this.field650[arg0 + 1][arg1 + 1] - this.field647[arg0 + 1][arg1 + 1]) * var30 + (this.field650[arg0][arg1 + 1] - this.field647[arg0][arg1 + 1]) * (super.field5107 - var30);
                    var22.field7184[var25] = (short) ((super.field5107 - var31) * var32 + var31 * var33 >> super.field5112 * 2);
                }
                int var34 = (arg0 << super.field5112) + var30;
                int var35 = (arg1 << super.field5112) + var31;
                var22.field7181[var25] = (short) var30;
                var22.field7177[var25] = (short) var31;
                var22.field7182[var25] = (short) (this.method314(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field7184[var25] < 2) {
                    var22.field7184[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field645.field4784.method59(arg11[var28], 21645).field733) {
                    var26 = true;
                }
            }
            var22.field7174 = new int[var27];
            if (arg10 != null) {
                var22.field7178 = new int[var27];
            }
            var22.field7179 = new short[var27];
            var22.field7173 = new short[var27];
            var22.field7183 = new short[var27];
            if (var26) {
                var22.field7180 = new short[var27];
                var22.field7176 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field7174[var22.field7175] = class460.method2751(arg9[var29], 903);
                    } else {
                        var22.field7174[var22.field7175] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field7178[var22.field7175] = class460.method2751(arg10[var29], 903);
                        } else {
                            var22.field7178[var22.field7175] = -1;
                        }
                    }
                    var22.field7179[var22.field7175] = (short) arg6[var29];
                    var22.field7173[var22.field7175] = (short) arg7[var29];
                    var22.field7183[var22.field7175] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field645.field4784.method59(arg11[var29], 21645).field733) {
                            var22.field7180[var22.field7175] = (short) arg11[var29];
                            var22.field7176[var22.field7175] = (short) arg12[var29];
                        } else {
                            var22.field7180[var22.field7175] = -1;
                        }
                    }
                    ++var22.field7175;
                }
            }
            this.field655[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class3 var36 = new class3();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field21 = class400.method2376(2, class460.method2751(arg10[0], 903), this.field650[arg0][arg1] - this.field647[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field24 = (byte) (var36.field24 | 2);
                    }
                }
                if (this.field656[arg0 + 1][arg1] == this.field656[arg0][arg1] && this.field656[arg0 + 1][arg1 + 1] == this.field656[arg0][arg1] && this.field656[arg0][arg1 + 1] == this.field656[arg0][arg1]) {
                    var36.field24 = (byte) (var36.field24 | 1);
                }
                if (var38 != -1 && (var36.field24 & 2) == 0 && !this.field645.field4784.method59(var38, 21645).field733) {
                    var36.field23 = (short) (this.field650[arg0][arg1] - this.field647[arg0][arg1]);
                    var36.field26 = (short) (this.field650[arg0 + 1][arg1] - this.field647[arg0 + 1][arg1]);
                    var36.field25 = (short) (this.field650[arg0 + 1][arg1 + 1] - this.field647[arg0 + 1][arg1 + 1]);
                    var36.field22 = (short) (this.field650[arg0][arg1 + 1] - this.field647[arg0][arg1 + 1]);
                    var36.field27 = (short) var38;
                } else {
                    short var39 = class460.method2751(var37, 903);
                    var36.field23 = (short) class400.method2376(2, var39, this.field650[arg0][arg1] - this.field647[arg0][arg1]);
                    var36.field26 = (short) class400.method2376(2, var39, this.field650[arg0 + 1][arg1] - this.field647[arg0 + 1][arg1]);
                    var36.field25 = (short) class400.method2376(2, var39, this.field650[arg0 + 1][arg1 + 1] - this.field647[arg0 + 1][arg1 + 1]);
                    var36.field22 = (short) class400.method2376(2, var39, this.field650[arg0][arg1 + 1] - this.field647[arg0][arg1 + 1]);
                    var36.field27 = -1;
                }
                this.field644[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method311(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field637 == null) {
            this.field637 = new class43[super.field5108][super.field5105];
            this.field649 = new class92[super.field5108][super.field5105];
        } else if (this.field644 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class143.field2332[class460.method2751(arg6[var15], 903) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class143.field2332[class460.method2751(arg7[var16], 903) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field5107 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field5107 && arg4[var22] == super.field5107) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field5107) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field5107 != arg2[var24] && arg2[0] - super.field5107 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field5107 != arg4[var24] && arg4[0] - super.field5107 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class43 var25 = new class43();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field632 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field624 = (byte) (var25.field624 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field656[arg0 + 1][arg1] == this.field656[arg0][arg1] && this.field656[arg0 + 1][arg1 + 1] == this.field656[arg0][arg1] && this.field656[arg0][arg1 + 1] == this.field656[arg0][arg1]) {
                    var25.field624 = (byte) (var25.field624 | 1);
                }
                if (var27 != -1 && (var25.field624 & 2) == 0 && !this.field645.field4784.method59(var27, 21645).field733) {
                    var25.field633 = this.field650[arg0][arg1] - this.field647[arg0][arg1];
                    var25.field629 = this.field650[arg0 + 1][arg1] - this.field647[arg0 + 1][arg1];
                    var25.field626 = this.field650[arg0 + 1][arg1 + 1] - this.field647[arg0 + 1][arg1 + 1];
                    var25.field628 = this.field650[arg0][arg1 + 1] - this.field647[arg0][arg1 + 1];
                    var25.field634 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field633 = class329.method2046(-849096504, method307(arg6[var18] >> 8, this.field650[arg0][arg1] - this.field647[arg0][arg1]), arg10, var28);
                    if (var25.field632 != 0) {
                        var25.field633 |= 255 - (this.field650[arg0][arg1] - this.field647[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field629 = class329.method2046(-849096504, method307(arg6[var19] >> 8, this.field650[arg0 + 1][arg1] - this.field647[arg0 + 1][arg1]), arg10, var29);
                    if (var25.field632 != 0) {
                        var25.field629 |= 255 - (this.field650[arg0 + 1][arg1] - this.field647[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field626 = class329.method2046(-849096504, method307(arg6[var20] >> 8, this.field650[arg0 + 1][arg1 + 1] - this.field647[arg0 + 1][arg1 + 1]), arg10, var30);
                    if (var25.field632 != 0) {
                        var25.field626 |= 255 - (this.field650[arg0 + 1][arg1 + 1] - this.field647[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field628 = class329.method2046(-849096504, method307(arg6[var21] >> 8, this.field650[arg0][arg1 + 1] - this.field647[arg0][arg1 + 1]), arg10, var31);
                    if (var25.field632 != 0) {
                        var25.field628 |= 255 - (this.field650[arg0][arg1 + 1] - this.field647[arg0][arg1 + 1]) << 25;
                    }
                    var25.field634 = -1;
                }
                if (arg5 != null) {
                    var25.field630 = (short) arg5[var20];
                    var25.field627 = (short) arg5[var21];
                    var25.field625 = (short) arg5[var19];
                    var25.field631 = (short) arg5[var18];
                }
                this.field637[arg0][arg1] = var25;
            } else {
                class92 var32 = new class92();
                var32.field1650 = (short) arg2.length;
                var32.field1644 = (short) (arg2.length / 3);
                var32.field1648 = new short[var32.field1650];
                var32.field1645 = new short[var32.field1650];
                var32.field1652 = new short[var32.field1650];
                var32.field1649 = new int[var32.field1650];
                if (arg5 != null) {
                    var32.field1643 = new short[var32.field1650];
                }
                for (int var33 = 0; var33 < var32.field1650; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field650[arg0][arg1] - this.field647[arg0][arg1];
                    } else if (var48 == 0 && super.field5107 == var49) {
                        var51 = this.field650[arg0][arg1 + 1] - this.field647[arg0][arg1 + 1];
                    } else if (super.field5107 == var48 && super.field5107 == var49) {
                        var51 = this.field650[arg0 + 1][arg1 + 1] - this.field647[arg0 + 1][arg1 + 1];
                    } else if (super.field5107 == var48 && var49 == 0) {
                        var51 = this.field650[arg0 + 1][arg1] - this.field647[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field650[arg0 + 1][arg1] - this.field647[arg0 + 1][arg1]) * var48 + (this.field650[arg0][arg1] - this.field647[arg0][arg1]) * (super.field5107 - var48);
                        int var53 = (this.field650[arg0 + 1][arg1 + 1] - this.field647[arg0 + 1][arg1 + 1]) * var48 + (this.field650[arg0][arg1 + 1] - this.field647[arg0][arg1 + 1]) * (super.field5107 - var48);
                        var51 = (super.field5107 - var49) * var52 + var49 * var53 >> super.field5112 * 2;
                    }
                    int var54 = (arg0 << super.field5112) + var48;
                    int var55 = (arg1 << super.field5112) + var49;
                    var32.field1648[var33] = (short) var48;
                    var32.field1652[var33] = (short) var49;
                    var32.field1645[var33] = (short) (this.method314(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field645.field4784.method59(arg8[var33], 21645).field733) {
                        var32.field1649[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field1649[var33] = var51 << 25;
                        } else {
                            var32.field1649[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field1643[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field1649[var33] = class329.method2046(-849096504, method307(arg6[var33] >> 8, var51), arg10, var56);
                        if (arg7 != null) {
                            var32.field1649[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field1644; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field645.field4784.method59(arg8[var35 * 3], 21645).field733) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field1647 = new int[var32.field1644];
                }
                if (var34) {
                    var32.field1646 = new short[var32.field1644];
                    var32.field1651 = new short[var32.field1644];
                }
                for (int var36 = 0; var36 < var32.field1644; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field1647[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field645.field4784.method59(var42, 21645).field733) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field645.field4784.method59(var43, 21645).field733) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field645.field4784.method59(var44, 21645).field733) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field1646[var36] = (short) var44;
                            var32.field1651[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field645.field4784.method59(var45, 21645).field733) {
                                    var32.field1649[var37] = class143.field2332[class460.method2751(this.field645.field4784.method59(var45, 21645).field737 & 65535, 903) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field645.field4784.method59(var46, 21645).field733) {
                                    var32.field1649[var38] = class143.field2332[class460.method2751(this.field645.field4784.method59(var46, 21645).field737 & 65535, 903) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field645.field4784.method59(var47, 21645).field733) {
                                    var32.field1649[var39] = class143.field2332[class460.method2751(this.field645.field4784.method59(var47, 21645).field737 & 65535, 903) & 65535];
                                }
                            }
                            var32.field1646[var36] = -1;
                        }
                    }
                }
                this.field649[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[[ZZ)V")
    public final void method312(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class68 var6 = this.field645.field7718;
        this.field646 = -1;
        this.field652 = var6.field1107;
        this.field653 = var6.field1097;
        this.field638 = var6.field1105;
        this.field636 = var6.field1104;
        this.field635 = var6.field1103;
        this.field642 = var6.field1108;
        this.field640 = var6.field1098;
        this.field641 = var6.field1099;
        this.field651 = var6.field1106;
        this.field643 = var6.field1102;
        this.field639 = var6.field1100;
        this.field648 = var6.field1101;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IIIIIII[[ZLb;[I[I)V")
    private final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class210 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3273 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field644[var16][var17] != null) {
                        class3 var18 = this.field644[var16][var17];
                        if (var18.field27 != -1 && (var18.field24 & 2) == 0 && var18.field21 == -1) {
                            int var19 = this.field645.method3047(var18.field27);
                            arg8.method1282(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class400.method2376(2, var19, var18.field25 & 65535), class400.method2376(2, var19, var18.field22 & 65535), class400.method2376(2, var19, var18.field26 & 65535));
                            arg8.method1282(var15, var15, var15 - var13, var14, var13 + var14, var14, class400.method2376(2, var19, var18.field23 & 65535), class400.method2376(2, var19, var18.field26 & 65535), class400.method2376(2, var19, var18.field22 & 65535));
                        } else if (var18.field21 == -1) {
                            arg8.method1282(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field25 & 65535, var18.field22 & 65535, var18.field26 & 65535);
                            arg8.method1282(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field23 & 65535, var18.field26 & 65535, var18.field22 & 65535);
                        } else {
                            int var20 = var18.field21;
                            arg8.method1282(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1282(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field655[var16][var17] != null) {
                        class468 var21 = this.field655[var16][var17];
                        for (int var22 = 0; var22 < var21.field7172; ++var22) {
                            arg9[var22] = var21.field7181[var22] * var13 / super.field5107 + var14;
                            arg10[var22] = var15 - var21.field7177[var22] * var13 / super.field5107;
                        }
                        for (int var23 = 0; var23 < var21.field7175; ++var23) {
                            short var24 = var21.field7179[var23];
                            short var25 = var21.field7173[var23];
                            short var26 = var21.field7183[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field7178 != null && var21.field7178[var23] != -1) {
                                int var33 = var21.field7178[var23];
                                arg8.method1282(var30, var31, var32, var27, var28, var29, class400.method2376(2, var33, var21.field7184[var24]), class400.method2376(2, var33, var21.field7184[var25]), class400.method2376(2, var33, var21.field7184[var26]));
                            } else if (var21.field7180 != null && var21.field7180[var23] != -1) {
                                int var34 = this.field645.method3047(var21.field7180[var23]);
                                arg8.method1282(var30, var31, var32, var27, var28, var29, class400.method2376(2, var34, var21.field7184[var24]), class400.method2376(2, var34, var21.field7184[var25]), class400.method2376(2, var34, var21.field7184[var26]));
                            } else {
                                int var35 = var21.field7174[var23];
                                arg8.method1282(var30, var31, var32, var27, var28, var29, class400.method2376(2, var35, var21.field7184[var24]), class400.method2376(2, var35, var21.field7184[var25]), class400.method2376(2, var35, var21.field7184[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3273 = true;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)I")
    public final int method314(int arg0, int arg1) {
        int var3 = arg0 >> super.field5112;
        int var4 = arg1 >> super.field5112;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field5108 - 1 && var4 <= super.field5105 - 1) {
            int var5 = arg0 & super.field5107 - 1;
            int var6 = arg1 & super.field5107 - 1;
            int var7 = (super.field5107 - var5) * this.field656[var3][var4] + this.field656[var3 + 1][var4] * var5 >> super.field5112;
            int var8 = (super.field5107 - var5) * this.field656[var3][var4 + 1] + this.field656[var3 + 1][var4 + 1] * var5 >> super.field5112;
            return (super.field5107 - var6) * var7 + var6 * var8 >> super.field5112;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILb;[I[I[I)V")
    private final void method315(int arg0, int arg1, class210 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class3 var7 = this.field644[arg0][arg1];
        if (var7 != null) {
            if ((var7.field24 & 2) == 0) {
                int var8 = super.field5107 * arg0;
                int var9 = super.field5107 + var8;
                int var10 = super.field5107 * arg1;
                int var11 = super.field5107 + var10;
                int var14;
                int var15;
                int var17;
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
                if ((var7.field24 & 1) != 0) {
                    int var12 = this.field656[arg0][arg1];
                    int var16;
                    if (this.field646 == -1) {
                        int var13 = this.field643 * var12;
                        var14 = (this.field639 * var10 + this.field651 * var8 + var13 >> 15) + this.field648;
                        if (var14 <= this.field645.field7709) {
                            return;
                        }
                        var15 = (this.field639 * var10 + this.field651 * var9 + var13 >> 15) + this.field648;
                        if (var15 <= this.field645.field7709) {
                            return;
                        }
                        var16 = (this.field639 * var11 + this.field651 * var9 + var13 >> 15) + this.field648;
                        if (var16 <= this.field645.field7709) {
                            return;
                        }
                        var17 = (this.field639 * var11 + this.field651 * var8 + var13 >> 15) + this.field648;
                        if (var17 <= this.field645.field7709) {
                            return;
                        }
                    } else {
                        var17 = this.field646;
                        var16 = this.field646;
                        var15 = this.field646;
                        var14 = this.field646;
                    }
                    int var18 = this.field653 * var12;
                    int var19 = this.field642 * var12;
                    var20 = (this.field638 * var10 + this.field652 * var8 + var18 >> 15) + this.field636;
                    var21 = this.field645.field7700 * var20 / var14 + arg2.field3270;
                    var22 = (this.field640 * var10 + this.field635 * var8 + var19 >> 15) + this.field641;
                    var23 = this.field645.field7697 * var22 / var14 + arg2.field3275;
                    var24 = (this.field638 * var10 + this.field652 * var9 + var18 >> 15) + this.field636;
                    var25 = this.field645.field7700 * var24 / var15 + arg2.field3270;
                    var26 = (this.field640 * var10 + this.field635 * var9 + var19 >> 15) + this.field641;
                    var27 = this.field645.field7697 * var26 / var15 + arg2.field3275;
                    int var28 = (this.field638 * var11 + this.field652 * var9 + var18 >> 15) + this.field636;
                    var29 = this.field645.field7700 * var28 / var16 + arg2.field3270;
                    int var30 = (this.field640 * var11 + this.field635 * var9 + var19 >> 15) + this.field641;
                    var31 = this.field645.field7697 * var30 / var16 + arg2.field3275;
                    var32 = (this.field638 * var11 + this.field652 * var8 + var18 >> 15) + this.field636;
                    var33 = this.field645.field7700 * var32 / var17 + arg2.field3270;
                    var34 = (this.field640 * var11 + this.field635 * var8 + var19 >> 15) + this.field641;
                    var35 = this.field645.field7697 * var34 / var17 + arg2.field3275;
                } else {
                    int var36 = this.field656[arg0][arg1];
                    int var37 = this.field656[arg0 + 1][arg1];
                    int var38 = this.field656[arg0 + 1][arg1 + 1];
                    int var39 = this.field656[arg0][arg1 + 1];
                    int var40;
                    if (this.field646 == -1) {
                        var14 = (this.field639 * var10 + this.field651 * var8 + this.field643 * var36 >> 15) + this.field648;
                        if (var14 <= this.field645.field7709) {
                            return;
                        }
                        var15 = (this.field639 * var10 + this.field651 * var9 + this.field643 * var37 >> 15) + this.field648;
                        if (var15 <= this.field645.field7709) {
                            return;
                        }
                        var40 = (this.field639 * var11 + this.field651 * var9 + this.field643 * var38 >> 15) + this.field648;
                        if (var40 <= this.field645.field7709) {
                            return;
                        }
                        var17 = (this.field639 * var11 + this.field651 * var8 + this.field643 * var39 >> 15) + this.field648;
                        if (var17 <= this.field645.field7709) {
                            return;
                        }
                    } else {
                        var17 = this.field646;
                        var40 = this.field646;
                        var15 = this.field646;
                        var14 = this.field646;
                    }
                    var20 = (this.field638 * var10 + this.field653 * var36 + this.field652 * var8 >> 15) + this.field636;
                    var21 = this.field645.field7700 * var20 / var14 + arg2.field3270;
                    var22 = (this.field640 * var10 + this.field642 * var36 + this.field635 * var8 >> 15) + this.field641;
                    var23 = this.field645.field7697 * var22 / var14 + arg2.field3275;
                    var24 = (this.field638 * var10 + this.field653 * var37 + this.field652 * var9 >> 15) + this.field636;
                    var25 = this.field645.field7700 * var24 / var15 + arg2.field3270;
                    var26 = (this.field640 * var10 + this.field642 * var37 + this.field635 * var9 >> 15) + this.field641;
                    var27 = this.field645.field7697 * var26 / var15 + arg2.field3275;
                    int var41 = (this.field638 * var11 + this.field653 * var38 + this.field652 * var9 >> 15) + this.field636;
                    var29 = this.field645.field7700 * var41 / var40 + arg2.field3270;
                    int var42 = (this.field640 * var11 + this.field642 * var38 + this.field635 * var9 >> 15) + this.field641;
                    var31 = this.field645.field7697 * var42 / var40 + arg2.field3275;
                    var32 = (this.field638 * var11 + this.field653 * var39 + this.field652 * var8 >> 15) + this.field636;
                    var33 = this.field645.field7700 * var32 / var17 + arg2.field3270;
                    var34 = (this.field640 * var11 + this.field642 * var39 + this.field635 * var8 >> 15) + this.field641;
                    var35 = this.field645.field7697 * var34 / var17 + arg2.field3275;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field3266 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field3274 || var33 > arg2.field3274 || var25 > arg2.field3274;
                    if (var7.field27 >= 0) {
                        if (this.method317(this.field645.field4784.method59(var7.field27, 21645).field728)) {
                            arg2.field3272 = 100;
                        }
                        arg2.method1284(var31, var35, var27, var29, var33, var25, var7.field25 & 65535, var7.field22 & 65535, var7.field26 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field27);
                        arg2.field3272 = 0;
                    } else {
                        arg2.method1282(var31, var35, var27, var29, var33, var25, var7.field25 & 65535, var7.field22 & 65535, var7.field26 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field3266 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field3274 || var25 > arg2.field3274 || var33 > arg2.field3274;
                    if (var7.field27 >= 0) {
                        if (this.method317(this.field645.field4784.method59(var7.field27, 21645).field728)) {
                            arg2.field3272 = 100;
                        }
                        arg2.method1284(var23, var27, var35, var21, var25, var33, var7.field23 & 65535, var7.field26 & 65535, var7.field22 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field27);
                        arg2.field3272 = 0;
                        return;
                    }
                    arg2.method1282(var23, var27, var35, var21, var25, var33, var7.field23 & 65535, var7.field26 & 65535, var7.field22 & 65535);
                }
            }
        } else {
            class468 var43 = this.field655[arg0][arg1];
            if (var43 != null) {
                if (this.field646 == -1) {
                    for (int var44 = 0; var44 < var43.field7172; ++var44) {
                        int var45 = (arg0 << super.field5112) + var43.field7181[var44];
                        short var46 = var43.field7182[var44];
                        int var47 = (arg1 << super.field5112) + var43.field7177[var44];
                        int var48 = (this.field639 * var47 + this.field651 * var45 + this.field643 * var46 >> 15) + this.field648;
                        if (var48 <= this.field645.field7709) {
                            return;
                        }
                        int var49 = (this.field638 * var47 + this.field653 * var46 + this.field652 * var45 >> 15) + this.field636;
                        int var50 = (this.field640 * var47 + this.field642 * var46 + this.field635 * var45 >> 15) + this.field641;
                        arg3[var44] = this.field645.field7700 * var49 / var48 + arg2.field3270;
                        arg4[var44] = this.field645.field7697 * var50 / var48 + arg2.field3275;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field7172; ++var51) {
                        int var91 = (arg0 << super.field5112) + var43.field7181[var51];
                        short var92 = var43.field7182[var51];
                        int var93 = (arg1 << super.field5112) + var43.field7177[var51];
                        int var94 = (this.field638 * var93 + this.field653 * var92 + this.field652 * var91 >> 15) + this.field636;
                        int var95 = (this.field640 * var93 + this.field642 * var92 + this.field635 * var91 >> 15) + this.field641;
                        arg3[var51] = this.field645.field7700 * var94 / this.field646 + arg2.field3270;
                        arg4[var51] = this.field645.field7697 * var95 / this.field646 + arg2.field3275;
                    }
                }
                if (var43.field7180 != null) {
                    int var52 = this.field656[arg0][arg1];
                    int var53 = this.field656[arg0 + 1][arg1];
                    int var54 = this.field656[arg0][arg1 + 1];
                    int var55 = super.field5107 * arg0;
                    int var56 = super.field5107 + var55;
                    int var57 = super.field5107 * arg1;
                    int var58 = super.field5107 + var57;
                    int var59 = (this.field638 * var57 + this.field653 * var52 + this.field652 * var55 >> 15) + this.field636;
                    int var60 = (this.field640 * var57 + this.field642 * var52 + this.field635 * var55 >> 15) + this.field641;
                    int var61 = (this.field639 * var57 + this.field651 * var55 + this.field643 * var52 >> 15) + this.field648;
                    int var62 = (this.field638 * var57 + this.field653 * var53 + this.field652 * var56 >> 15) + this.field636;
                    int var63 = (this.field640 * var57 + this.field642 * var53 + this.field635 * var56 >> 15) + this.field641;
                    int var64 = (this.field639 * var57 + this.field651 * var56 + this.field643 * var53 >> 15) + this.field648;
                    int var65 = (this.field638 * var58 + this.field653 * var54 + this.field652 * var55 >> 15) + this.field636;
                    int var66 = (this.field640 * var58 + this.field642 * var54 + this.field635 * var55 >> 15) + this.field641;
                    int var67 = (this.field639 * var58 + this.field651 * var55 + this.field643 * var54 >> 15) + this.field648;
                    for (int var68 = 0; var68 < var43.field7175; ++var68) {
                        short var69 = var43.field7179[var68];
                        short var70 = var43.field7173[var68];
                        short var71 = var43.field7183[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field3266 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field3274 || var73 > arg2.field3274 || var74 > arg2.field3274;
                            short var78 = var43.field7180[var68];
                            if (var78 != -1) {
                                if (this.method317(this.field645.field4784.method59(var78, 21645).field728)) {
                                    arg2.field3272 = 100;
                                }
                                arg2.method1284(var75, var76, var77, var72, var73, var74, var43.field7184[var69], var43.field7184[var70], var43.field7184[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field3272 = 0;
                            } else {
                                int var79 = var43.field7174[var68];
                                if (var79 != -1) {
                                    arg2.method1282(var75, var76, var77, var72, var73, var74, class400.method2376(2, var79, var43.field7184[var69]), class400.method2376(2, var79, var43.field7184[var70]), class400.method2376(2, var79, var43.field7184[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field7175; ++var80) {
                    short var81 = var43.field7179[var80];
                    short var82 = var43.field7173[var80];
                    short var83 = var43.field7183[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field7174[var80];
                        if (var90 != -1) {
                            arg2.field3266 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field3274 || var85 > arg2.field3274 || var86 > arg2.field3274;
                            arg2.method1282(var87, var88, var89, var84, var85, var86, class400.method2376(2, var90, var43.field7184[var81]), class400.method2376(2, var90, var43.field7184[var82]), class400.method2376(2, var90, var43.field7184[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lki;[I)V")
    public final void method316(class480 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Z")
    private final boolean method317(int arg0) {
        if ((this.field654 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I")
    public final int method318(int arg0, int arg1) {
        return this.field656[arg0][arg1];
    }
}
