import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class476 extends class270 {

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    private int field6643 = -1;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "Lrfa;")
    private class415 field6626;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    private int field6625;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "[[B")
    private byte[][] field6639;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "[[B")
    private byte[][] field6642;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "F")
    private float field6624;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "F")
    private float field6627;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "F")
    private float field6628;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "F")
    private float field6630;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "F")
    private float field6631;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "F")
    private float field6632;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "F")
    private float field6633;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "F")
    private float field6635;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "F")
    private float field6636;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "F")
    private float field6640;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "F")
    private float field6641;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "F")
    private float field6644;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "[[Lida;")
    private class136[][] field6629;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "[[Laj;")
    private class282[][] field6634;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "[[Lvd;")
    private class350[][] field6637;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[[Lsg;")
    private class430[][] field6638;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 6)
    public final boolean method1355(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Z", line = 11)
    private final boolean method2740(int arg0) {
        if ((this.field6625 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V", line = 28)
    public final void method1364(int arg0, int arg1) {
        class26 var3 = this.field6626.method2353(Thread.currentThread());
        var3.field362.field1930 = 0;
        if (this.field6634 != null) {
            this.method2741(arg0, arg1, var3.field342, var3, var3.field362, var3.field349, var3.field371, var3.field366, var3.field368);
        } else {
            if (this.field6637 != null) {
                this.method2743(arg0, arg1, var3.field362, var3.field349, var3.field371, var3.field366, var3.field368);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 39)
    public final void method1353(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field6634 == null) {
            this.field6634 = new class282[super.field3524][super.field3525];
            this.field6638 = new class430[super.field3524][super.field3525];
        } else if (this.field6637 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class310.field4189[class227.method1412(-46, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class310.field4189[class227.method1412(-128, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field3527 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field3527 && arg4[var22] == super.field3527) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field3527) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field3527 != arg2[var24] && arg2[0] - super.field3527 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field3527 != arg4[var24] && arg4[0] - super.field3527 != arg4[var24]) {
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
                class282 var25 = new class282();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field3719 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field3718 = (byte) (var25.field3718 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (super.field3523[arg0 + 1][arg1] == super.field3523[arg0][arg1] && super.field3523[arg0 + 1][arg1 + 1] == super.field3523[arg0][arg1] && super.field3523[arg0][arg1 + 1] == super.field3523[arg0][arg1]) {
                    var25.field3718 = (byte) (var25.field3718 | 1);
                }
                if (var27 != -1 && (var25.field3718 & 2) == 0 && !this.field6626.field7682.method2959(98, var27).field1249) {
                    var25.field3723 = this.field6639[arg0][arg1] - this.field6642[arg0][arg1];
                    var25.field3725 = this.field6639[arg0 + 1][arg1] - this.field6642[arg0 + 1][arg1];
                    var25.field3720 = this.field6639[arg0 + 1][arg1 + 1] - this.field6642[arg0 + 1][arg1 + 1];
                    var25.field3717 = this.field6639[arg0][arg1 + 1] - this.field6642[arg0][arg1 + 1];
                    var25.field3715 = (short) var27;
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
                    var25.field3723 = class240.method1489(arg10, var28, method2744(arg6[var18] >> 8, this.field6639[arg0][arg1] - this.field6642[arg0][arg1]), -639297016);
                    if (var25.field3719 != 0) {
                        var25.field3723 |= 255 - (this.field6639[arg0][arg1] - this.field6642[arg0][arg1]) << 25;
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
                    var25.field3725 = class240.method1489(arg10, var29, method2744(arg6[var19] >> 8, this.field6639[arg0 + 1][arg1] - this.field6642[arg0 + 1][arg1]), -639297016);
                    if (var25.field3719 != 0) {
                        var25.field3725 |= 255 - (this.field6639[arg0 + 1][arg1] - this.field6642[arg0 + 1][arg1]) << 25;
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
                    var25.field3720 = class240.method1489(arg10, var30, method2744(arg6[var20] >> 8, this.field6639[arg0 + 1][arg1 + 1] - this.field6642[arg0 + 1][arg1 + 1]), -639297016);
                    if (var25.field3719 != 0) {
                        var25.field3720 |= 255 - (this.field6639[arg0 + 1][arg1 + 1] - this.field6642[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field3717 = class240.method1489(arg10, var31, method2744(arg6[var21] >> 8, this.field6639[arg0][arg1 + 1] - this.field6642[arg0][arg1 + 1]), -639297016);
                    if (var25.field3719 != 0) {
                        var25.field3717 |= 255 - (this.field6639[arg0][arg1 + 1] - this.field6642[arg0][arg1 + 1]) << 25;
                    }
                    var25.field3715 = -1;
                }
                if (arg5 != null) {
                    var25.field3722 = (short) arg5[var20];
                    var25.field3721 = (short) arg5[var21];
                    var25.field3724 = (short) arg5[var19];
                    var25.field3716 = (short) arg5[var18];
                }
                this.field6634[arg0][arg1] = var25;
            } else {
                class430 var32 = new class430();
                var32.field5788 = (short) arg2.length;
                var32.field5783 = (short) (arg2.length / 3);
                var32.field5781 = new short[var32.field5788];
                var32.field5785 = new short[var32.field5788];
                var32.field5780 = new short[var32.field5788];
                var32.field5782 = new int[var32.field5788];
                if (arg5 != null) {
                    var32.field5779 = new short[var32.field5788];
                }
                for (int var33 = 0; var33 < var32.field5788; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field6639[arg0][arg1] - this.field6642[arg0][arg1];
                    } else if (var48 == 0 && super.field3527 == var49) {
                        var51 = this.field6639[arg0][arg1 + 1] - this.field6642[arg0][arg1 + 1];
                    } else if (super.field3527 == var48 && super.field3527 == var49) {
                        var51 = this.field6639[arg0 + 1][arg1 + 1] - this.field6642[arg0 + 1][arg1 + 1];
                    } else if (super.field3527 == var48 && var49 == 0) {
                        var51 = this.field6639[arg0 + 1][arg1] - this.field6642[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field6639[arg0 + 1][arg1] - this.field6642[arg0 + 1][arg1]) * var48 + (this.field6639[arg0][arg1] - this.field6642[arg0][arg1]) * (super.field3527 - var48);
                        int var53 = (this.field6639[arg0 + 1][arg1 + 1] - this.field6642[arg0 + 1][arg1 + 1]) * var48 + (this.field6639[arg0][arg1 + 1] - this.field6642[arg0][arg1 + 1]) * (super.field3527 - var48);
                        var51 = (super.field3527 - var49) * var52 + var49 * var53 >> super.field3530 * 2;
                    }
                    int var54 = (arg0 << super.field3530) + var48;
                    int var55 = (arg1 << super.field3530) + var49;
                    var32.field5781[var33] = (short) var48;
                    var32.field5780[var33] = (short) var49;
                    var32.field5785[var33] = (short) (this.method1609(var54, var55, 22) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field6626.field7682.method2959(98, arg8[var33]).field1249) {
                        var32.field5782[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field5782[var33] = var51 << 25;
                        } else {
                            var32.field5782[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field5779[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field5782[var33] = class240.method1489(arg10, var56, method2744(arg6[var33] >> 8, var51), -639297016);
                        if (arg7 != null) {
                            var32.field5782[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field5783; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field6626.field7682.method2959(70, arg8[var35 * 3]).field1249) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field5787 = new int[var32.field5783];
                }
                if (var34) {
                    var32.field5784 = new short[var32.field5783];
                    var32.field5786 = new short[var32.field5783];
                }
                for (int var36 = 0; var36 < var32.field5783; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field5787[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field6626.field7682.method2959(109, var42).field1249) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field6626.field7682.method2959(72, var43).field1249) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field6626.field7682.method2959(82, var44).field1249) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field5784[var36] = (short) var44;
                            var32.field5786[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field6626.field7682.method2959(64, var45).field1249) {
                                    var32.field5782[var37] = class310.field4189[class227.method1412(115, this.field6626.field7682.method2959(92, var45).field1262 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field6626.field7682.method2959(121, var46).field1249) {
                                    var32.field5782[var38] = class310.field4189[class227.method1412(-127, this.field6626.field7682.method2959(82, var46).field1262 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field6626.field7682.method2959(126, var47).field1249) {
                                    var32.field5782[var39] = class310.field4189[class227.method1412(119, this.field6626.field7682.method2959(64, var47).field1262 & 65535) & 65535];
                                }
                            }
                            var32.field5784[var36] = -1;
                        }
                    }
                }
                this.field6638[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lqea;[I)V", line = 531)
    public final void method1351(class392 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII[[Z)V", line = 535)
    public final void method1360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class26 var9 = this.field6626.method2353(Thread.currentThread());
        class142 var10 = var9.field362;
        var10.field1930 = 0;
        var10.field1924 = false;
        this.field6626.method1147();
        if (this.field6634 != null) {
            this.method2742(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field349, var9.field371);
        } else {
            if (this.field6637 != null) {
                this.method2745(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field349, var9.field371);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 550)
    public final void method1350(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field6637 == null) {
            this.field6637 = new class350[super.field3524][super.field3525];
            this.field6629 = new class136[super.field3524][super.field3525];
        } else if (this.field6634 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3527 != var20 || var21 != 0 && super.field3527 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class136 var22 = new class136();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1856 = var23;
            var22.field1867 = new short[var23];
            var22.field1860 = new short[var23];
            var22.field1868 = new short[var23];
            var22.field1863 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1867[var25] = (short) (this.field6639[arg0][arg1] - this.field6642[arg0][arg1]);
                } else if (var30 == 0 && super.field3527 == var31) {
                    var22.field1867[var25] = (short) (this.field6639[arg0][arg1 + 1] - this.field6642[arg0][arg1 + 1]);
                } else if (super.field3527 == var30 && super.field3527 == var31) {
                    var22.field1867[var25] = (short) (this.field6639[arg0 + 1][arg1 + 1] - this.field6642[arg0 + 1][arg1 + 1]);
                } else if (super.field3527 == var30 && var31 == 0) {
                    var22.field1867[var25] = (short) (this.field6639[arg0 + 1][arg1] - this.field6642[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field6639[arg0 + 1][arg1] - this.field6642[arg0 + 1][arg1]) * var30 + (this.field6639[arg0][arg1] - this.field6642[arg0][arg1]) * (super.field3527 - var30);
                    int var33 = (this.field6639[arg0 + 1][arg1 + 1] - this.field6642[arg0 + 1][arg1 + 1]) * var30 + (this.field6639[arg0][arg1 + 1] - this.field6642[arg0][arg1 + 1]) * (super.field3527 - var30);
                    var22.field1867[var25] = (short) ((super.field3527 - var31) * var32 + var31 * var33 >> super.field3530 * 2);
                }
                int var34 = (arg0 << super.field3530) + var30;
                int var35 = (arg1 << super.field3530) + var31;
                var22.field1860[var25] = (short) var30;
                var22.field1863[var25] = (short) var31;
                var22.field1868[var25] = (short) (this.method1609(var34, var35, -126) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1867[var25] < 2) {
                    var22.field1867[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field6626.field7682.method2959(95, arg11[var28]).field1249) {
                    var26 = true;
                }
            }
            var22.field1858 = new int[var27];
            if (arg10 != null) {
                var22.field1864 = new int[var27];
            }
            var22.field1857 = new short[var27];
            var22.field1859 = new short[var27];
            var22.field1865 = new short[var27];
            if (var26) {
                var22.field1861 = new short[var27];
                var22.field1866 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1858[var22.field1862] = class227.method1412(-16, arg9[var29]);
                    } else {
                        var22.field1858[var22.field1862] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1864[var22.field1862] = class227.method1412(126, arg10[var29]);
                        } else {
                            var22.field1864[var22.field1862] = -1;
                        }
                    }
                    var22.field1857[var22.field1862] = (short) arg6[var29];
                    var22.field1859[var22.field1862] = (short) arg7[var29];
                    var22.field1865[var22.field1862] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field6626.field7682.method2959(114, arg11[var29]).field1249) {
                            var22.field1861[var22.field1862] = (short) arg11[var29];
                            var22.field1866[var22.field1862] = (short) arg12[var29];
                        } else {
                            var22.field1861[var22.field1862] = -1;
                        }
                    }
                    ++var22.field1862;
                }
            }
            this.field6629[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class350 var36 = new class350();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field4658 = class686.method3883(this.field6639[arg0][arg1] - this.field6642[arg0][arg1], class227.method1412(126, arg10[0]), (byte) -61);
                    if (var37 == -1) {
                        var36.field4657 = (byte) (var36.field4657 | 2);
                    }
                }
                if (super.field3523[arg0 + 1][arg1] == super.field3523[arg0][arg1] && super.field3523[arg0 + 1][arg1 + 1] == super.field3523[arg0][arg1] && super.field3523[arg0][arg1 + 1] == super.field3523[arg0][arg1]) {
                    var36.field4657 = (byte) (var36.field4657 | 1);
                }
                if (var38 != -1 && (var36.field4657 & 2) == 0 && !this.field6626.field7682.method2959(120, var38).field1249) {
                    var36.field4661 = (short) (this.field6639[arg0][arg1] - this.field6642[arg0][arg1]);
                    var36.field4659 = (short) (this.field6639[arg0 + 1][arg1] - this.field6642[arg0 + 1][arg1]);
                    var36.field4660 = (short) (this.field6639[arg0 + 1][arg1 + 1] - this.field6642[arg0 + 1][arg1 + 1]);
                    var36.field4656 = (short) (this.field6639[arg0][arg1 + 1] - this.field6642[arg0][arg1 + 1]);
                    var36.field4662 = (short) var38;
                } else {
                    short var39 = class227.method1412(126, var37);
                    var36.field4661 = (short) class686.method3883(this.field6639[arg0][arg1] - this.field6642[arg0][arg1], var39, (byte) -61);
                    var36.field4659 = (short) class686.method3883(this.field6639[arg0 + 1][arg1] - this.field6642[arg0 + 1][arg1], var39, (byte) -61);
                    var36.field4660 = (short) class686.method3883(this.field6639[arg0 + 1][arg1 + 1] - this.field6642[arg0 + 1][arg1 + 1], var39, (byte) -61);
                    var36.field4656 = (short) class686.method3883(this.field6639[arg0][arg1 + 1] - this.field6642[arg0][arg1 + 1], var39, (byte) -61);
                    var36.field4662 = -1;
                }
                this.field6637[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZLmm;Lgw;[I[I[I[I)V", line = 780)
    private final void method2741(int arg0, int arg1, boolean arg2, class26 arg3, class142 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8) {
        class282 var10 = this.field6634[arg0][arg1];
        if (var10 != null) {
            if ((var10.field3718 & 2) == 0) {
                int var11 = super.field3527 * arg0;
                int var12 = super.field3527 + var11;
                int var13 = super.field3527 * arg1;
                int var14 = super.field3527 + var13;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                float var21;
                float var22;
                float var23;
                float var24;
                float var31;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                float var37;
                int var38;
                float var39;
                int var40;
                float var41;
                int var42;
                float var43;
                int var44;
                float var45;
                int var46;
                if ((var10.field3718 & 1) != 0 && !arg2) {
                    int var19 = super.field3523[arg0][arg1];
                    float var20 = (float) var19 * this.field6636;
                    if (this.field6643 == -1) {
                        var21 = (float) var13 * this.field6644 + (float) var11 * this.field6641 + var20 + this.field6628;
                        if (var21 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var22 = (float) var13 * this.field6644 + (float) var12 * this.field6641 + var20 + this.field6628;
                        if (var22 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var23 = (float) var14 * this.field6644 + (float) var12 * this.field6641 + var20 + this.field6628;
                        if (var23 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var24 = (float) var14 * this.field6644 + (float) var11 * this.field6641 + var20 + this.field6628;
                        if (var24 <= (float) this.field6626.field5475) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field6644 + (float) var11 * this.field6641 + var20 + this.field6628;
                        var22 = (float) var13 * this.field6644 + (float) var12 * this.field6641 + var20 + this.field6628;
                        var23 = (float) var14 * this.field6644 + (float) var12 * this.field6641 + var20 + this.field6628;
                        var24 = (float) var14 * this.field6644 + (float) var11 * this.field6641 + var20 + this.field6628;
                    }
                    if (arg3.field334) {
                        int var25 = (int) (var21 - (float) arg3.field336);
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = (int) (var22 - (float) arg3.field336);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field336);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field336);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    float var29 = (float) var19 * this.field6632;
                    float var30 = (float) var19 * this.field6624;
                    if (this.field6643 == -1) {
                        var31 = (float) var13 * this.field6640 + (float) var11 * this.field6631 + var29 + this.field6635;
                        var32 = (int) ((float) this.field6626.field5458 * var31 / var21) + arg4.field1920;
                        var33 = (float) var13 * this.field6633 + (float) var11 * this.field6630 + var30 + this.field6627;
                        var34 = (int) ((float) this.field6626.field5445 * var33 / var21) + arg4.field1921;
                        var35 = (float) var13 * this.field6640 + (float) var12 * this.field6631 + var29 + this.field6635;
                        var36 = (int) ((float) this.field6626.field5458 * var35 / var22) + arg4.field1920;
                        var37 = (float) var13 * this.field6633 + (float) var12 * this.field6630 + var30 + this.field6627;
                        var38 = (int) ((float) this.field6626.field5445 * var37 / var22) + arg4.field1921;
                        var39 = (float) var14 * this.field6640 + (float) var12 * this.field6631 + var29 + this.field6635;
                        var40 = (int) ((float) this.field6626.field5458 * var39 / var23) + arg4.field1920;
                        var41 = (float) var14 * this.field6633 + (float) var12 * this.field6630 + var30 + this.field6627;
                        var42 = (int) ((float) this.field6626.field5445 * var41 / var23) + arg4.field1921;
                        var43 = (float) var14 * this.field6640 + (float) var11 * this.field6631 + var29 + this.field6635;
                        var44 = (int) ((float) this.field6626.field5458 * var43 / var24) + arg4.field1920;
                        var45 = (float) var14 * this.field6633 + (float) var11 * this.field6630 + var30 + this.field6627;
                        var46 = (int) ((float) this.field6626.field5445 * var45 / var24) + arg4.field1921;
                    } else {
                        var31 = (float) var13 * this.field6640 + (float) var11 * this.field6631 + var29 + this.field6635;
                        var32 = (int) ((float) this.field6626.field5458 * var31 / (float) this.field6643) + arg4.field1920;
                        var33 = (float) var13 * this.field6633 + (float) var11 * this.field6630 + var30 + this.field6627;
                        var34 = (int) ((float) this.field6626.field5445 * var33 / (float) this.field6643) + arg4.field1921;
                        var35 = (float) var13 * this.field6640 + (float) var12 * this.field6631 + var29 + this.field6635;
                        var36 = (int) ((float) this.field6626.field5458 * var35 / (float) this.field6643) + arg4.field1920;
                        var37 = (float) var13 * this.field6633 + (float) var12 * this.field6630 + var30 + this.field6627;
                        var38 = (int) ((float) this.field6626.field5445 * var37 / (float) this.field6643) + arg4.field1921;
                        var39 = (float) var14 * this.field6640 + (float) var12 * this.field6631 + var29 + this.field6635;
                        var40 = (int) ((float) this.field6626.field5458 * var39 / (float) this.field6643) + arg4.field1920;
                        var41 = (float) var14 * this.field6633 + (float) var12 * this.field6630 + var30 + this.field6627;
                        var42 = (int) ((float) this.field6626.field5445 * var41 / (float) this.field6643) + arg4.field1921;
                        var43 = (float) var14 * this.field6640 + (float) var11 * this.field6631 + var29 + this.field6635;
                        var44 = (int) ((float) this.field6626.field5458 * var43 / (float) this.field6643) + arg4.field1920;
                        var45 = (float) var14 * this.field6633 + (float) var11 * this.field6630 + var30 + this.field6627;
                        var46 = (int) ((float) this.field6626.field5445 * var45 / (float) this.field6643) + arg4.field1921;
                    }
                } else {
                    int var47 = super.field3523[arg0][arg1];
                    int var48 = super.field3523[arg0 + 1][arg1];
                    int var49 = super.field3523[arg0 + 1][arg1 + 1];
                    int var50 = super.field3523[arg0][arg1 + 1];
                    if (this.field6643 == -1) {
                        var21 = (float) var13 * this.field6644 + (float) var11 * this.field6641 + (float) var47 * this.field6636 + this.field6628;
                        if (var21 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var22 = (float) var13 * this.field6644 + (float) var12 * this.field6641 + (float) var48 * this.field6636 + this.field6628;
                        if (var22 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var23 = (float) var14 * this.field6644 + (float) var12 * this.field6641 + (float) var49 * this.field6636 + this.field6628;
                        if (var23 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var24 = (float) var14 * this.field6644 + (float) var11 * this.field6641 + (float) var50 * this.field6636 + this.field6628;
                        if (var24 <= (float) this.field6626.field5475) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field6644 + (float) var11 * this.field6641 + (float) var47 * this.field6636 + this.field6628;
                        var22 = (float) var13 * this.field6644 + (float) var12 * this.field6641 + (float) var48 * this.field6636 + this.field6628;
                        var23 = (float) var14 * this.field6644 + (float) var12 * this.field6641 + (float) var49 * this.field6636 + this.field6628;
                        var24 = (float) var14 * this.field6644 + (float) var11 * this.field6641 + (float) var50 * this.field6636 + this.field6628;
                    }
                    if (arg2) {
                        int var51 = (int) (var21 - (float) arg3.field336);
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field3716 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = (int) (var22 - (float) arg3.field336);
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field3724 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = (int) (var23 - (float) arg3.field336);
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field3722 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = (int) (var24 - (float) arg3.field336);
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field3721 * var57 / 255;
                            if (var58 > 0) {
                                var50 -= var58;
                            }
                        }
                    } else if (arg3.field334) {
                        int var59 = (int) (var21 - (float) arg3.field336);
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = (int) (var22 - (float) arg3.field336);
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = (int) (var23 - (float) arg3.field336);
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = (int) (var24 - (float) arg3.field336);
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    if (this.field6643 == -1) {
                        var31 = (float) var13 * this.field6640 + (float) var11 * this.field6631 + (float) var47 * this.field6632 + this.field6635;
                        var32 = (int) ((float) this.field6626.field5458 * var31 / var21) + arg4.field1920;
                        var33 = (float) var13 * this.field6633 + (float) var11 * this.field6630 + (float) var47 * this.field6624 + this.field6627;
                        var34 = (int) ((float) this.field6626.field5445 * var33 / var21) + arg4.field1921;
                        var35 = (float) var13 * this.field6640 + (float) var12 * this.field6631 + (float) var48 * this.field6632 + this.field6635;
                        var36 = (int) ((float) this.field6626.field5458 * var35 / var22) + arg4.field1920;
                        var37 = (float) var13 * this.field6633 + (float) var12 * this.field6630 + (float) var48 * this.field6624 + this.field6627;
                        var38 = (int) ((float) this.field6626.field5445 * var37 / var22) + arg4.field1921;
                        var39 = (float) var14 * this.field6640 + (float) var12 * this.field6631 + (float) var49 * this.field6632 + this.field6635;
                        var40 = (int) ((float) this.field6626.field5458 * var39 / var23) + arg4.field1920;
                        var41 = (float) var14 * this.field6633 + (float) var12 * this.field6630 + (float) var49 * this.field6624 + this.field6627;
                        var42 = (int) ((float) this.field6626.field5445 * var41 / var23) + arg4.field1921;
                        var43 = (float) var14 * this.field6640 + (float) var11 * this.field6631 + (float) var50 * this.field6632 + this.field6635;
                        var44 = (int) ((float) this.field6626.field5458 * var43 / var24) + arg4.field1920;
                        var45 = (float) var14 * this.field6633 + (float) var11 * this.field6630 + (float) var50 * this.field6624 + this.field6627;
                        var46 = (int) ((float) this.field6626.field5445 * var45 / var24) + arg4.field1921;
                    } else {
                        var31 = (float) var13 * this.field6640 + (float) var11 * this.field6631 + (float) var47 * this.field6632 + this.field6635;
                        var32 = (int) ((float) this.field6626.field5458 * var31 / (float) this.field6643) + arg4.field1920;
                        var33 = (float) var13 * this.field6633 + (float) var11 * this.field6630 + (float) var47 * this.field6624 + this.field6627;
                        var34 = (int) ((float) this.field6626.field5445 * var33 / (float) this.field6643) + arg4.field1921;
                        var35 = (float) var13 * this.field6640 + (float) var12 * this.field6631 + (float) var48 * this.field6632 + this.field6635;
                        var36 = (int) ((float) this.field6626.field5458 * var35 / (float) this.field6643) + arg4.field1920;
                        var37 = (float) var13 * this.field6633 + (float) var12 * this.field6630 + (float) var48 * this.field6624 + this.field6627;
                        var38 = (int) ((float) this.field6626.field5445 * var37 / (float) this.field6643) + arg4.field1921;
                        var39 = (float) var14 * this.field6640 + (float) var12 * this.field6631 + (float) var49 * this.field6632 + this.field6635;
                        var40 = (int) ((float) this.field6626.field5458 * var39 / (float) this.field6643) + arg4.field1920;
                        var41 = (float) var14 * this.field6633 + (float) var12 * this.field6630 + (float) var49 * this.field6624 + this.field6627;
                        var42 = (int) ((float) this.field6626.field5445 * var41 / (float) this.field6643) + arg4.field1921;
                        var43 = (float) var14 * this.field6640 + (float) var11 * this.field6631 + (float) var50 * this.field6632 + this.field6635;
                        var44 = (int) ((float) this.field6626.field5458 * var43 / (float) this.field6643) + arg4.field1920;
                        var45 = (float) var14 * this.field6633 + (float) var11 * this.field6630 + (float) var50 * this.field6624 + this.field6627;
                        var46 = (int) ((float) this.field6626.field5445 * var45 / (float) this.field6643) + arg4.field1921;
                    }
                }
                boolean var63 = var10.field3715 != -1 && this.method2740(this.field6626.field7682.method2959(125, var10.field3715).field1255);
                if (this.field6643 == -1) {
                    int var64 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field1924 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field1923 || var44 > arg4.field1923 || var36 > arg4.field1923;
                        if (var64 < 765) {
                            if (var63) {
                                arg4.field1930 = 100;
                            }
                            if (var64 > 0) {
                                if (var10.field3715 >= 0) {
                                    arg4.method808(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field345, var17, var18, var16, var10.field3720, var10.field3717, var10.field3725, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field3715);
                                } else {
                                    arg4.method805(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class367.method2130(var10.field3720, 34037, var17 << 24 | arg3.field345), class367.method2130(var10.field3717, 34037, var18 << 24 | arg3.field345), class367.method2130(var10.field3725, 34037, var16 << 24 | arg3.field345));
                                }
                            } else if (var10.field3715 >= 0) {
                                arg4.method811(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field3720, var10.field3717, var10.field3725, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field3715);
                            } else {
                                arg4.method805(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field3720, var10.field3717, var10.field3725);
                            }
                            arg4.field1930 = 0;
                        } else {
                            arg4.method812(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field345);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field1924 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field1923 || var36 > arg4.field1923 || var44 > arg4.field1923;
                        if (var65 < 765) {
                            if (var63) {
                                arg4.field1930 = 100;
                            }
                            if (var65 > 0) {
                                if (var10.field3715 >= 0) {
                                    arg4.method808(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field345, var15, var16, var18, var10.field3723, var10.field3725, var10.field3717, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field3715);
                                } else {
                                    arg4.method805(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class367.method2130(var10.field3723, 34037, var15 << 24 | arg3.field345), class367.method2130(var10.field3725, 34037, var16 << 24 | arg3.field345), class367.method2130(var10.field3717, 34037, var18 << 24 | arg3.field345));
                                }
                            } else if (var10.field3715 >= 0) {
                                arg4.method811(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field3723, var10.field3725, var10.field3717, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field3715);
                            } else {
                                arg4.method805(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field3723, var10.field3725, var10.field3717);
                            }
                            arg4.field1930 = 0;
                            return;
                        }
                        arg4.method812(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field345);
                        return;
                    }
                } else {
                    int var66 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field1924 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field1923 || var44 > arg4.field1923 || var36 > arg4.field1923;
                        if (var66 < 765) {
                            if (var63) {
                                arg4.field1930 = 100;
                            }
                            if (var66 > 0) {
                                if (var10.field3715 >= 0) {
                                    arg4.method808(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field345, var17, var18, var16, var10.field3720, var10.field3717, var10.field3725, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field6643, this.field6643, this.field6643, var10.field3715);
                                } else {
                                    arg4.method805(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class367.method2130(var10.field3720, 34037, var17 << 24 | arg3.field345), class367.method2130(var10.field3717, 34037, var18 << 24 | arg3.field345), class367.method2130(var10.field3725, 34037, var16 << 24 | arg3.field345));
                                }
                            } else if (var10.field3715 >= 0) {
                                arg4.method811(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field3720, var10.field3717, var10.field3725, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field6643, this.field6643, this.field6643, var10.field3715);
                            } else {
                                arg4.method805(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field3720, var10.field3717, var10.field3725);
                            }
                            arg4.field1930 = 0;
                        } else {
                            arg4.method812(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field345);
                        }
                    }
                    int var67 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field1924 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field1923 || var36 > arg4.field1923 || var44 > arg4.field1923;
                        if (var67 < 765) {
                            if (var63) {
                                arg4.field1930 = 100;
                            }
                            if (var67 > 0) {
                                if (var10.field3715 >= 0) {
                                    arg4.method808(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field345, var15, var16, var18, var10.field3723, var10.field3725, var10.field3717, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field6643, this.field6643, this.field6643, var10.field3715);
                                } else {
                                    arg4.method805(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class367.method2130(var10.field3723, 34037, var15 << 24 | arg3.field345), class367.method2130(var10.field3725, 34037, var16 << 24 | arg3.field345), class367.method2130(var10.field3717, 34037, var18 << 24 | arg3.field345));
                                }
                            } else if (var10.field3715 >= 0) {
                                arg4.method811(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field3723, var10.field3725, var10.field3717, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field6643, this.field6643, this.field6643, var10.field3715);
                            } else {
                                arg4.method805(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field3723, var10.field3725, var10.field3717);
                            }
                            arg4.field1930 = 0;
                            return;
                        }
                        arg4.method812(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field345);
                    }
                }
            }
        } else {
            class430 var68 = this.field6638[arg0][arg1];
            if (var68 != null) {
                if (this.field6643 == -1) {
                    for (int var69 = 0; var69 < var68.field5788; ++var69) {
                        int var70 = (arg0 << super.field3530) + var68.field5781[var69];
                        int var71 = var68.field5785[var69];
                        int var72 = (arg1 << super.field3530) + var68.field5780[var69];
                        float var73 = (float) var72 * this.field6644 + (float) var70 * this.field6641 + (float) var71 * this.field6636 + this.field6628;
                        if (var73 <= (float) this.field6626.field5475) {
                            return;
                        }
                        arg8[var69] = 0;
                        if (arg2) {
                            int var74 = (int) (var73 - (float) arg3.field336);
                            if (var74 > 255) {
                                var74 = 255;
                            }
                            if (var74 > 0) {
                                arg8[var69] = var74;
                                int var75 = var68.field5779[var69] * var74 / 255;
                                if (var75 > 0) {
                                    var71 -= var75;
                                }
                            }
                        } else if (arg3.field334) {
                            int var76 = (int) (var73 - (float) arg3.field336);
                            if (var76 > 0) {
                                arg8[var69] = var76;
                                if (arg8[var69] > 255) {
                                    arg8[var69] = 255;
                                }
                            }
                        }
                        float var77 = (float) var72 * this.field6640 + (float) var70 * this.field6631 + (float) var71 * this.field6632 + this.field6635;
                        float var78 = (float) var72 * this.field6633 + (float) var70 * this.field6630 + (float) var71 * this.field6624 + this.field6627;
                        arg5[var69] = (int) ((float) this.field6626.field5458 * var77 / var73) + arg4.field1920;
                        arg6[var69] = (int) ((float) this.field6626.field5445 * var78 / var73) + arg4.field1921;
                        arg7[var69] = (int) var73;
                    }
                } else {
                    for (int var79 = 0; var79 < var68.field5788; ++var79) {
                        int var131 = (arg0 << super.field3530) + var68.field5781[var79];
                        int var132 = var68.field5785[var79];
                        int var133 = (arg1 << super.field3530) + var68.field5780[var79];
                        float var134 = (float) var133 * this.field6644 + (float) var131 * this.field6641 + (float) var132 * this.field6636 + this.field6628;
                        arg8[var79] = 0;
                        if (arg2) {
                            int var135 = this.field6643 - arg3.field336;
                            if (var135 > 255) {
                                var135 = 255;
                            }
                            if (var135 > 0) {
                                arg8[var79] = var135;
                                int var136 = var68.field5779[var79] * var135 / 255;
                                if (var136 > 0) {
                                    var132 -= var136;
                                }
                            }
                        } else if (arg3.field334) {
                            int var137 = this.field6643 - arg3.field336;
                            if (var137 > 0) {
                                arg8[var79] = var137;
                                if (arg8[var79] > 255) {
                                    arg8[var79] = 255;
                                }
                            }
                        }
                        float var138 = (float) var133 * this.field6640 + (float) var131 * this.field6631 + (float) var132 * this.field6632 + this.field6635;
                        float var139 = (float) var133 * this.field6633 + (float) var131 * this.field6630 + (float) var132 * this.field6624 + this.field6627;
                        arg5[var79] = (int) ((float) this.field6626.field5458 * var138 / (float) this.field6643) + arg4.field1920;
                        arg6[var79] = (int) ((float) this.field6626.field5445 * var139 / (float) this.field6643) + arg4.field1921;
                        arg7[var79] = (int) var134;
                    }
                }
                if (var68.field5784 != null) {
                    int var80 = super.field3523[arg0][arg1];
                    int var81 = super.field3523[arg0 + 1][arg1];
                    int var82 = super.field3523[arg0][arg1 + 1];
                    int var83 = super.field3527 * arg0;
                    int var84 = super.field3527 + var83;
                    int var85 = super.field3527 * arg1;
                    int var86 = super.field3527 + var85;
                    float var87 = (float) var85 * this.field6640 + (float) var80 * this.field6632 + (float) var83 * this.field6631 + this.field6635;
                    float var88 = (float) var85 * this.field6633 + (float) var80 * this.field6624 + (float) var83 * this.field6630 + this.field6627;
                    float var89 = (float) var85 * this.field6644 + (float) var80 * this.field6636 + (float) var83 * this.field6641 + this.field6628;
                    float var90 = (float) var85 * this.field6640 + (float) var81 * this.field6632 + (float) var84 * this.field6631 + this.field6635;
                    float var91 = (float) var85 * this.field6633 + (float) var81 * this.field6624 + (float) var84 * this.field6630 + this.field6627;
                    float var92 = (float) var85 * this.field6644 + (float) var81 * this.field6636 + (float) var84 * this.field6641 + this.field6628;
                    float var93 = (float) var86 * this.field6640 + (float) var82 * this.field6632 + (float) var83 * this.field6631 + this.field6635;
                    float var94 = (float) var86 * this.field6633 + (float) var82 * this.field6624 + (float) var83 * this.field6630 + this.field6627;
                    float var95 = (float) var86 * this.field6644 + (float) var82 * this.field6636 + (float) var83 * this.field6641 + this.field6628;
                    if (this.field6643 == -1) {
                        for (int var96 = 0; var96 < var68.field5783; ++var96) {
                            int var97 = var96 * 3;
                            int var98 = var97 + 1;
                            int var99 = var98 + 1;
                            int var100 = arg5[var97];
                            int var101 = arg5[var98];
                            int var102 = arg5[var99];
                            int var103 = arg6[var97];
                            int var104 = arg6[var98];
                            int var105 = arg6[var99];
                            int var106 = arg8[var97] + arg8[var98] + arg8[var99];
                            if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                                arg4.field1924 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg4.field1923 || var101 > arg4.field1923 || var102 > arg4.field1923;
                                short var107 = var68.field5784[var96];
                                if (var106 < 765) {
                                    if (var107 != -1 && this.method2740(this.field6626.field7682.method2959(80, var107).field1255)) {
                                        arg4.field1930 = 100;
                                    }
                                    if (var106 > 0) {
                                        if (var107 != -1) {
                                            arg4.method808(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field345, arg8[var97], arg8[var98], arg8[var99], var68.field5782[var97], var68.field5782[var98], var68.field5782[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                        } else if ((var68.field5782[var97] & 16777215) != 0) {
                                            arg4.method805(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], class367.method2130(var68.field5782[var97], 34037, arg8[var97] << 24 | arg3.field345), class367.method2130(var68.field5782[var98], 34037, arg8[var98] << 24 | arg3.field345), class367.method2130(var68.field5782[var99], 34037, arg8[var99] << 24 | arg3.field345));
                                        }
                                    } else if (var107 != -1) {
                                        arg4.method811(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field5782[var97], var68.field5782[var98], var68.field5782[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                    } else if ((var68.field5782[var97] & 16777215) != 0) {
                                        arg4.method805(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field5782[var97], var68.field5782[var98], var68.field5782[var99]);
                                    }
                                    arg4.field1930 = 0;
                                } else {
                                    arg4.method812(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field345);
                                }
                            }
                        }
                        return;
                    }
                    for (int var108 = 0; var108 < var68.field5783; ++var108) {
                        int var109 = var108 * 3;
                        int var110 = var109 + 1;
                        int var111 = var110 + 1;
                        int var112 = arg5[var109];
                        int var113 = arg5[var110];
                        int var114 = arg5[var111];
                        int var115 = arg6[var109];
                        int var116 = arg6[var110];
                        int var117 = arg6[var111];
                        int var118 = arg8[var109] + arg8[var110] + arg8[var111];
                        if ((var112 - var113) * (var117 - var116) - (var114 - var113) * (var115 - var116) > 0) {
                            arg4.field1924 = var112 < 0 || var113 < 0 || var114 < 0 || var112 > arg4.field1923 || var113 > arg4.field1923 || var114 > arg4.field1923;
                            short var119 = var68.field5784[var108];
                            if (var118 < 765) {
                                if (var119 != -1 && this.method2740(this.field6626.field7682.method2959(114, var119).field1255)) {
                                    arg4.field1930 = 100;
                                }
                                if (var118 > 0) {
                                    if (var119 != -1) {
                                        arg4.method808(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field345, arg8[var109], arg8[var110], arg8[var111], var68.field5782[var109], var68.field5782[var110], var68.field5782[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field6643, this.field6643, this.field6643, var119);
                                    } else if ((var68.field5782[var109] & 16777215) != 0) {
                                        arg4.method805(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], class367.method2130(var68.field5782[var109], 34037, arg8[var109] << 24 | arg3.field345), class367.method2130(var68.field5782[var110], 34037, arg8[var110] << 24 | arg3.field345), class367.method2130(var68.field5782[var111], 34037, arg8[var111] << 24 | arg3.field345));
                                    }
                                } else if (var119 != -1) {
                                    arg4.method811(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field5782[var109], var68.field5782[var110], var68.field5782[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field6643, this.field6643, this.field6643, var119);
                                } else if ((var68.field5782[var109] & 16777215) != 0) {
                                    arg4.method805(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field5782[var109], var68.field5782[var110], var68.field5782[var111]);
                                }
                                arg4.field1930 = 0;
                            } else {
                                arg4.method812(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field345);
                            }
                        }
                    }
                    return;
                }
                for (int var120 = 0; var120 < var68.field5783; ++var120) {
                    int var121 = var120 * 3;
                    int var122 = var121 + 1;
                    int var123 = var122 + 1;
                    int var124 = arg5[var121];
                    int var125 = arg5[var122];
                    int var126 = arg5[var123];
                    int var127 = arg6[var121];
                    int var128 = arg6[var122];
                    int var129 = arg6[var123];
                    int var130 = arg8[var121] + arg8[var122] + arg8[var123];
                    if ((var124 - var125) * (var129 - var128) - (var126 - var125) * (var127 - var128) > 0) {
                        arg4.field1924 = var124 < 0 || var125 < 0 || var126 < 0 || var124 > arg4.field1923 || var125 > arg4.field1923 || var126 > arg4.field1923;
                        if (var130 < 765) {
                            if (var130 > 0) {
                                if ((var68.field5782[var121] & 16777215) != 0) {
                                    arg4.method805(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], class240.method1489(arg3.field345, arg8[var121], var68.field5782[var121], -639297016), class240.method1489(arg3.field345, arg8[var122], var68.field5782[var122], -639297016), class240.method1489(arg3.field345, arg8[var123], var68.field5782[var123], -639297016));
                                }
                            } else if ((var68.field5782[var121] & 16777215) != 0) {
                                arg4.method805(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], var68.field5782[var121], var68.field5782[var122], var68.field5782[var123]);
                            }
                        } else {
                            arg4.method812(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], arg3.field345);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III[[ZZ)V", line = 1622)
    public final void method1362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class557 var6 = this.field6626.field5448;
        this.field6643 = -1;
        this.field6631 = var6.field7594;
        this.field6632 = var6.field7587;
        this.field6640 = var6.field7590;
        this.field6635 = var6.field7612;
        this.field6630 = var6.field7589;
        this.field6624 = var6.field7588;
        this.field6633 = var6.field7614;
        this.field6627 = var6.field7592;
        this.field6641 = var6.field7613;
        this.field6636 = var6.field7591;
        this.field6644 = var6.field7610;
        this.field6628 = var6.field7611;
        for (int var7 = 0; var7 < arg2 + arg2; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - arg2 + var7;
                    int var10 = arg1 - arg2 + var8;
                    if (var9 >= 0 && var9 < super.field3524 && var10 >= 0 && var10 < super.field3525) {
                        this.method1364(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V", line = 1667)
    public final void method1358(int arg0, int arg1, int arg2) {
        if (this.field6642[arg0][arg1] < arg2) {
            this.field6642[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ej", name = "BA", descriptor = "()V", line = 1672)
    public final void method1349() {
        this.field6639 = null;
        this.field6642 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII[[ZLmm;Lgw;[I[I)V", line = 1684)
    private final void method2742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class26 arg8, class142 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field339;
        this.field6626.method1091(false);
        arg9.field1934 = false;
        arg9.field1925 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field6634[var18][var19] != null) {
                        class282 var20 = this.field6634[var18][var19];
                        if (var20.field3715 != -1 && (var20.field3718 & 2) == 0 && var20.field3719 == 0) {
                            int var21 = this.field6626.method2352(var20.field3715);
                            arg9.method814(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class686.method3883(var20.field3720, var21, (byte) -61), class686.method3883(var20.field3717, var21, (byte) -61), class686.method3883(var20.field3725, var21, (byte) -61));
                            arg9.method814(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class686.method3883(var20.field3723, var21, (byte) -61), class686.method3883(var20.field3725, var21, (byte) -61), class686.method3883(var20.field3717, var21, (byte) -61));
                        } else if (var20.field3719 == 0) {
                            arg9.method805(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field3720, var20.field3717, var20.field3725);
                            arg9.method805(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field3723, var20.field3725, var20.field3717);
                        } else {
                            int var22 = var20.field3719;
                            arg9.method805(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class367.method2130(var22, 34037, var20.field3720 & -16777216), class367.method2130(var22, 34037, var20.field3717 & -16777216), class367.method2130(var22, 34037, var20.field3725 & -16777216));
                            arg9.method805(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class367.method2130(var22, 34037, var20.field3723 & -16777216), class367.method2130(var22, 34037, var20.field3725 & -16777216), class367.method2130(var22, 34037, var20.field3717 & -16777216));
                        }
                    } else if (this.field6638[var18][var19] != null) {
                        class430 var23 = this.field6638[var18][var19];
                        for (int var24 = 0; var24 < var23.field5788; ++var24) {
                            arg10[var24] = var23.field5781[var24] * var14 / super.field3527 + var16;
                            arg11[var24] = var17 - var23.field5780[var24] * var14 / super.field3527;
                        }
                        for (int var25 = 0; var25 < var23.field5783; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field5787 != null && var23.field5787[var25] != 0 && (var23.field5784 == null || var23.field5784 != null && var23.field5784[var25] == -1)) {
                                int var35 = var23.field5787[var25];
                                arg9.method805(var32, var33, var34, var29, var30, var31, 100, 100, 100, class367.method2130(var35, 34037, -16777216 - (var23.field5782[var26] & -16777216)), class367.method2130(var35, 34037, -16777216 - (var23.field5782[var27] & -16777216)), class367.method2130(var35, 34037, -16777216 - (var23.field5782[var28] & -16777216)));
                            } else if (var23.field5784 != null && var23.field5784[var25] != -1) {
                                int var36 = this.field6626.method2352(var23.field5784[var25]);
                                arg9.method814(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                            } else {
                                arg9.method805(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field5782[var26], var23.field5782[var27], var23.field5782[var28]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field1934 = true;
        this.field6626.method1091(var15);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILgw;[I[I[I[I)V", line = 1818)
    private final void method2743(int arg0, int arg1, class142 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        class350 var8 = this.field6637[arg0][arg1];
        if (var8 != null) {
            if ((var8.field4657 & 2) == 0) {
                int var9 = super.field3527 * arg0;
                int var10 = super.field3527 + var9;
                int var11 = super.field3527 * arg1;
                int var12 = super.field3527 + var11;
                float var15;
                float var16;
                float var17;
                float var18;
                float var21;
                int var22;
                float var23;
                int var24;
                float var25;
                int var26;
                float var27;
                int var28;
                int var30;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                if ((var8.field4657 & 1) != 0) {
                    int var13 = super.field3523[arg0][arg1];
                    float var14 = (float) var13 * this.field6636;
                    if (this.field6643 == -1) {
                        var15 = (float) var11 * this.field6644 + (float) var9 * this.field6641 + var14 + this.field6628;
                        if (var15 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var16 = (float) var11 * this.field6644 + (float) var10 * this.field6641 + var14 + this.field6628;
                        if (var16 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var17 = (float) var12 * this.field6644 + (float) var10 * this.field6641 + var14 + this.field6628;
                        if (var17 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var18 = (float) var12 * this.field6644 + (float) var9 * this.field6641 + var14 + this.field6628;
                        if (var18 <= (float) this.field6626.field5475) {
                            return;
                        }
                    } else {
                        var15 = (float) var11 * this.field6644 + (float) var9 * this.field6641 + var14 + this.field6628;
                        var16 = (float) var11 * this.field6644 + (float) var10 * this.field6641 + var14 + this.field6628;
                        var17 = (float) var12 * this.field6644 + (float) var10 * this.field6641 + var14 + this.field6628;
                        var18 = (float) var12 * this.field6644 + (float) var9 * this.field6641 + var14 + this.field6628;
                    }
                    float var19 = (float) var13 * this.field6632;
                    float var20 = (float) var13 * this.field6624;
                    if (this.field6643 == -1) {
                        var21 = (float) var11 * this.field6640 + (float) var9 * this.field6631 + var19 + this.field6635;
                        var22 = (int) ((float) this.field6626.field5458 * var21 / var15) + arg2.field1920;
                        var23 = (float) var11 * this.field6633 + (float) var9 * this.field6630 + var20 + this.field6627;
                        var24 = (int) ((float) this.field6626.field5445 * var23 / var15) + arg2.field1921;
                        var25 = (float) var11 * this.field6640 + (float) var10 * this.field6631 + var19 + this.field6635;
                        var26 = (int) ((float) this.field6626.field5458 * var25 / var16) + arg2.field1920;
                        var27 = (float) var11 * this.field6633 + (float) var10 * this.field6630 + var20 + this.field6627;
                        var28 = (int) ((float) this.field6626.field5445 * var27 / var16) + arg2.field1921;
                        float var29 = (float) var12 * this.field6640 + (float) var10 * this.field6631 + var19 + this.field6635;
                        var30 = (int) ((float) this.field6626.field5458 * var29 / var17) + arg2.field1920;
                        float var31 = (float) var12 * this.field6633 + (float) var10 * this.field6630 + var20 + this.field6627;
                        var32 = (int) ((float) this.field6626.field5445 * var31 / var17) + arg2.field1921;
                        var33 = (float) var12 * this.field6640 + (float) var9 * this.field6631 + var19 + this.field6635;
                        var34 = (int) ((float) this.field6626.field5458 * var33 / var18) + arg2.field1920;
                        var35 = (float) var12 * this.field6633 + (float) var9 * this.field6630 + var20 + this.field6627;
                        var36 = (int) ((float) this.field6626.field5445 * var35 / var18) + arg2.field1921;
                    } else {
                        var21 = (float) var11 * this.field6640 + (float) var9 * this.field6631 + var19 + this.field6635;
                        var22 = (int) ((float) this.field6626.field5458 * var21 / (float) this.field6643) + arg2.field1920;
                        var23 = (float) var11 * this.field6633 + (float) var9 * this.field6630 + var20 + this.field6627;
                        var24 = (int) ((float) this.field6626.field5445 * var23 / (float) this.field6643) + arg2.field1921;
                        var25 = (float) var11 * this.field6640 + (float) var10 * this.field6631 + var19 + this.field6635;
                        var26 = (int) ((float) this.field6626.field5458 * var25 / (float) this.field6643) + arg2.field1920;
                        var27 = (float) var11 * this.field6633 + (float) var10 * this.field6630 + var20 + this.field6627;
                        var28 = (int) ((float) this.field6626.field5445 * var27 / (float) this.field6643) + arg2.field1921;
                        float var37 = (float) var12 * this.field6640 + (float) var10 * this.field6631 + var19 + this.field6635;
                        var30 = (int) ((float) this.field6626.field5458 * var37 / (float) this.field6643) + arg2.field1920;
                        float var38 = (float) var12 * this.field6633 + (float) var10 * this.field6630 + var20 + this.field6627;
                        var32 = (int) ((float) this.field6626.field5445 * var38 / (float) this.field6643) + arg2.field1921;
                        var33 = (float) var12 * this.field6640 + (float) var9 * this.field6631 + var19 + this.field6635;
                        var34 = (int) ((float) this.field6626.field5458 * var33 / (float) this.field6643) + arg2.field1920;
                        var35 = (float) var12 * this.field6633 + (float) var9 * this.field6630 + var20 + this.field6627;
                        var36 = (int) ((float) this.field6626.field5445 * var35 / (float) this.field6643) + arg2.field1921;
                    }
                } else {
                    int var39 = super.field3523[arg0][arg1];
                    int var40 = super.field3523[arg0 + 1][arg1];
                    int var41 = super.field3523[arg0 + 1][arg1 + 1];
                    int var42 = super.field3523[arg0][arg1 + 1];
                    if (this.field6643 == -1) {
                        var15 = (float) var11 * this.field6644 + (float) var9 * this.field6641 + (float) var39 * this.field6636 + this.field6628;
                        if (var15 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var16 = (float) var11 * this.field6644 + (float) var10 * this.field6641 + (float) var40 * this.field6636 + this.field6628;
                        if (var16 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var17 = (float) var12 * this.field6644 + (float) var10 * this.field6641 + (float) var41 * this.field6636 + this.field6628;
                        if (var17 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var18 = (float) var12 * this.field6644 + (float) var9 * this.field6641 + (float) var42 * this.field6636 + this.field6628;
                        if (var18 <= (float) this.field6626.field5475) {
                            return;
                        }
                        var21 = (float) var11 * this.field6640 + (float) var9 * this.field6631 + (float) var39 * this.field6632 + this.field6635;
                        var22 = (int) ((float) this.field6626.field5458 * var21 / var15) + arg2.field1920;
                        var23 = (float) var11 * this.field6633 + (float) var9 * this.field6630 + (float) var39 * this.field6624 + this.field6627;
                        var24 = (int) ((float) this.field6626.field5445 * var23 / var15) + arg2.field1921;
                        var25 = (float) var11 * this.field6640 + (float) var10 * this.field6631 + (float) var40 * this.field6632 + this.field6635;
                        var26 = (int) ((float) this.field6626.field5458 * var25 / var16) + arg2.field1920;
                        var27 = (float) var11 * this.field6633 + (float) var10 * this.field6630 + (float) var40 * this.field6624 + this.field6627;
                        var28 = (int) ((float) this.field6626.field5445 * var27 / var16) + arg2.field1921;
                        float var43 = (float) var12 * this.field6640 + (float) var10 * this.field6631 + (float) var41 * this.field6632 + this.field6635;
                        var30 = (int) ((float) this.field6626.field5458 * var43 / var17) + arg2.field1920;
                        float var44 = (float) var12 * this.field6633 + (float) var10 * this.field6630 + (float) var41 * this.field6624 + this.field6627;
                        var32 = (int) ((float) this.field6626.field5445 * var44 / var17) + arg2.field1921;
                        var33 = (float) var12 * this.field6640 + (float) var9 * this.field6631 + (float) var42 * this.field6632 + this.field6635;
                        var34 = (int) ((float) this.field6626.field5458 * var33 / var18) + arg2.field1920;
                        var35 = (float) var12 * this.field6633 + (float) var9 * this.field6630 + (float) var42 * this.field6624 + this.field6627;
                        var36 = (int) ((float) this.field6626.field5445 * var35 / var18) + arg2.field1921;
                    } else {
                        var15 = (float) var11 * this.field6644 + (float) var9 * this.field6641 + (float) var39 * this.field6636 + this.field6628;
                        var16 = (float) var11 * this.field6644 + (float) var10 * this.field6641 + (float) var40 * this.field6636 + this.field6628;
                        var17 = (float) var12 * this.field6644 + (float) var10 * this.field6641 + (float) var41 * this.field6636 + this.field6628;
                        var18 = (float) var12 * this.field6644 + (float) var9 * this.field6641 + (float) var42 * this.field6636 + this.field6628;
                        var21 = (float) var11 * this.field6640 + (float) var9 * this.field6631 + (float) var39 * this.field6632 + this.field6635;
                        var22 = (int) ((float) this.field6626.field5458 * var21 / (float) this.field6643) + arg2.field1920;
                        var23 = (float) var11 * this.field6633 + (float) var9 * this.field6630 + (float) var39 * this.field6624 + this.field6627;
                        var24 = (int) ((float) this.field6626.field5445 * var23 / (float) this.field6643) + arg2.field1921;
                        var25 = (float) var11 * this.field6640 + (float) var10 * this.field6631 + (float) var40 * this.field6632 + this.field6635;
                        var26 = (int) ((float) this.field6626.field5458 * var25 / (float) this.field6643) + arg2.field1920;
                        var27 = (float) var11 * this.field6633 + (float) var10 * this.field6630 + (float) var40 * this.field6624 + this.field6627;
                        var28 = (int) ((float) this.field6626.field5445 * var27 / (float) this.field6643) + arg2.field1921;
                        float var45 = (float) var12 * this.field6640 + (float) var10 * this.field6631 + (float) var41 * this.field6632 + this.field6635;
                        var30 = (int) ((float) this.field6626.field5458 * var45 / (float) this.field6643) + arg2.field1920;
                        float var46 = (float) var12 * this.field6633 + (float) var10 * this.field6630 + (float) var41 * this.field6624 + this.field6627;
                        var32 = (int) ((float) this.field6626.field5445 * var46 / (float) this.field6643) + arg2.field1921;
                        var33 = (float) var12 * this.field6640 + (float) var9 * this.field6631 + (float) var42 * this.field6632 + this.field6635;
                        var34 = (int) ((float) this.field6626.field5458 * var33 / (float) this.field6643) + arg2.field1920;
                        var35 = (float) var12 * this.field6633 + (float) var9 * this.field6630 + (float) var42 * this.field6624 + this.field6627;
                        var36 = (int) ((float) this.field6626.field5445 * var35 / (float) this.field6643) + arg2.field1921;
                    }
                }
                if (this.field6643 == -1) {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field1924 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field1923 || var34 > arg2.field1923 || var26 > arg2.field1923;
                        if (var8.field4662 >= 0) {
                            if (this.method2740(this.field6626.field7682.method2959(95, var8.field4662).field1255)) {
                                arg2.field1930 = 100;
                            }
                            arg2.method811(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4660 & 65535, var8.field4656 & 65535, var8.field4659 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field4662);
                            arg2.field1930 = 0;
                        } else {
                            arg2.method814(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4660 & 65535, var8.field4656 & 65535, var8.field4659 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field1924 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field1923 || var26 > arg2.field1923 || var34 > arg2.field1923;
                        if (var8.field4662 >= 0) {
                            if (this.method2740(this.field6626.field7682.method2959(121, var8.field4662).field1255)) {
                                arg2.field1930 = 100;
                            }
                            arg2.method811(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4661 & 65535, var8.field4659 & 65535, var8.field4656 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field4662);
                            arg2.field1930 = 0;
                            return;
                        }
                        arg2.method814(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4661 & 65535, var8.field4659 & 65535, var8.field4656 & 65535);
                        return;
                    }
                } else {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field1924 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field1923 || var34 > arg2.field1923 || var26 > arg2.field1923;
                        if (var8.field4662 >= 0) {
                            if (this.method2740(this.field6626.field7682.method2959(84, var8.field4662).field1255)) {
                                arg2.field1930 = 100;
                            }
                            arg2.method811(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4660 & 65535, var8.field4656 & 65535, var8.field4659 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field6643, this.field6643, this.field6643, var8.field4662);
                            arg2.field1930 = 0;
                        } else {
                            arg2.method814(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4660 & 65535, var8.field4656 & 65535, var8.field4659 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field1924 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field1923 || var26 > arg2.field1923 || var34 > arg2.field1923;
                        if (var8.field4662 >= 0) {
                            if (this.method2740(this.field6626.field7682.method2959(89, var8.field4662).field1255)) {
                                arg2.field1930 = 100;
                            }
                            arg2.method811(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4661 & 65535, var8.field4659 & 65535, var8.field4656 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field6643, this.field6643, this.field6643, var8.field4662);
                            arg2.field1930 = 0;
                            return;
                        }
                        arg2.method814(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4661 & 65535, var8.field4659 & 65535, var8.field4656 & 65535);
                    }
                }
            }
        } else {
            class136 var47 = this.field6629[arg0][arg1];
            if (var47 != null) {
                if (this.field6643 == -1) {
                    for (int var48 = 0; var48 < var47.field1856; ++var48) {
                        int var49 = (arg0 << super.field3530) + var47.field1860[var48];
                        short var50 = var47.field1868[var48];
                        int var51 = (arg1 << super.field3530) + var47.field1863[var48];
                        float var52 = (float) var51 * this.field6644 + (float) var49 * this.field6641 + (float) var50 * this.field6636 + this.field6628;
                        if (var52 <= (float) this.field6626.field5475) {
                            return;
                        }
                        float var53 = (float) var51 * this.field6640 + (float) var49 * this.field6631 + (float) var50 * this.field6632 + this.field6635;
                        float var54 = (float) var51 * this.field6633 + (float) var49 * this.field6630 + (float) var50 * this.field6624 + this.field6627;
                        arg3[var48] = (int) ((float) this.field6626.field5458 * var53 / var52) + arg2.field1920;
                        arg4[var48] = (int) ((float) this.field6626.field5445 * var54 / var52) + arg2.field1921;
                        arg5[var48] = (int) var52;
                    }
                } else {
                    for (int var55 = 0; var55 < var47.field1856; ++var55) {
                        int var107 = (arg0 << super.field3530) + var47.field1860[var55];
                        short var108 = var47.field1868[var55];
                        int var109 = (arg1 << super.field3530) + var47.field1863[var55];
                        float var110 = (float) var109 * this.field6644 + (float) var107 * this.field6641 + (float) var108 * this.field6636 + this.field6628;
                        float var111 = (float) var109 * this.field6640 + (float) var107 * this.field6631 + (float) var108 * this.field6632 + this.field6635;
                        float var112 = (float) var109 * this.field6633 + (float) var107 * this.field6630 + (float) var108 * this.field6624 + this.field6627;
                        arg3[var55] = (int) ((float) this.field6626.field5458 * var111 / (float) this.field6643) + arg2.field1920;
                        arg4[var55] = (int) ((float) this.field6626.field5445 * var112 / (float) this.field6643) + arg2.field1921;
                        arg5[var55] = (int) var110;
                    }
                }
                if (var47.field1861 != null) {
                    int var56 = super.field3523[arg0][arg1];
                    int var57 = super.field3523[arg0 + 1][arg1];
                    int var58 = super.field3523[arg0][arg1 + 1];
                    int var59 = super.field3527 * arg0;
                    int var60 = super.field3527 + var59;
                    int var61 = super.field3527 * arg1;
                    int var62 = super.field3527 + var61;
                    float var63 = (float) var61 * this.field6640 + (float) var56 * this.field6632 + (float) var59 * this.field6631 + this.field6635;
                    float var64 = (float) var61 * this.field6633 + (float) var56 * this.field6624 + (float) var59 * this.field6630 + this.field6627;
                    float var65 = (float) var61 * this.field6644 + (float) var56 * this.field6636 + (float) var59 * this.field6641 + this.field6628;
                    float var66 = (float) var61 * this.field6640 + (float) var57 * this.field6632 + (float) var60 * this.field6631 + this.field6635;
                    float var67 = (float) var61 * this.field6633 + (float) var57 * this.field6624 + (float) var60 * this.field6630 + this.field6627;
                    float var68 = (float) var61 * this.field6644 + (float) var57 * this.field6636 + (float) var60 * this.field6641 + this.field6628;
                    float var69 = (float) var62 * this.field6640 + (float) var58 * this.field6632 + (float) var59 * this.field6631 + this.field6635;
                    float var70 = (float) var62 * this.field6633 + (float) var58 * this.field6624 + (float) var59 * this.field6630 + this.field6627;
                    float var71 = (float) var62 * this.field6644 + (float) var58 * this.field6636 + (float) var59 * this.field6641 + this.field6628;
                    if (this.field6643 == -1) {
                        for (int var72 = 0; var72 < var47.field1862; ++var72) {
                            short var73 = var47.field1857[var72];
                            short var74 = var47.field1859[var72];
                            short var75 = var47.field1865[var72];
                            int var76 = arg3[var73];
                            int var77 = arg3[var74];
                            int var78 = arg3[var75];
                            int var79 = arg4[var73];
                            int var80 = arg4[var74];
                            int var81 = arg4[var75];
                            if ((var76 - var77) * (var81 - var80) - (var78 - var77) * (var79 - var80) > 0) {
                                arg2.field1924 = var76 < 0 || var77 < 0 || var78 < 0 || var76 > arg2.field1923 || var77 > arg2.field1923 || var78 > arg2.field1923;
                                short var82 = var47.field1861[var72];
                                if (var82 != -1) {
                                    if (this.method2740(this.field6626.field7682.method2959(88, var82).field1255)) {
                                        arg2.field1930 = 100;
                                    }
                                    arg2.method811(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], var47.field1867[var73], var47.field1867[var74], var47.field1867[var75], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, (int) var65, (int) var68, (int) var71, var82);
                                    arg2.field1930 = 0;
                                } else {
                                    int var83 = var47.field1858[var72];
                                    if (var83 != -1) {
                                        arg2.method814(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], class686.method3883(var47.field1867[var73], var83, (byte) -61), class686.method3883(var47.field1867[var74], var83, (byte) -61), class686.method3883(var47.field1867[var75], var83, (byte) -61));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var84 = 0; var84 < var47.field1862; ++var84) {
                        short var85 = var47.field1857[var84];
                        short var86 = var47.field1859[var84];
                        short var87 = var47.field1865[var84];
                        int var88 = arg3[var85];
                        int var89 = arg3[var86];
                        int var90 = arg3[var87];
                        int var91 = arg4[var85];
                        int var92 = arg4[var86];
                        int var93 = arg4[var87];
                        if ((var88 - var89) * (var93 - var92) - (var90 - var89) * (var91 - var92) > 0) {
                            arg2.field1924 = var88 < 0 || var89 < 0 || var90 < 0 || var88 > arg2.field1923 || var89 > arg2.field1923 || var90 > arg2.field1923;
                            short var94 = var47.field1861[var84];
                            if (var94 != -1) {
                                if (this.method2740(this.field6626.field7682.method2959(82, var94).field1255)) {
                                    arg2.field1930 = 100;
                                }
                                arg2.method811(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], var47.field1867[var85], var47.field1867[var86], var47.field1867[var87], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, this.field6643, this.field6643, this.field6643, var94);
                                arg2.field1930 = 0;
                            } else {
                                int var95 = var47.field1858[var84];
                                if (var95 != -1) {
                                    arg2.method814(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], class686.method3883(var47.field1867[var85], var95, (byte) -61), class686.method3883(var47.field1867[var86], var95, (byte) -61), class686.method3883(var47.field1867[var87], var95, (byte) -61));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var96 = 0; var96 < var47.field1862; ++var96) {
                    short var97 = var47.field1857[var96];
                    short var98 = var47.field1859[var96];
                    short var99 = var47.field1865[var96];
                    int var100 = arg3[var97];
                    int var101 = arg3[var98];
                    int var102 = arg3[var99];
                    int var103 = arg4[var97];
                    int var104 = arg4[var98];
                    int var105 = arg4[var99];
                    if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                        int var106 = var47.field1858[var96];
                        if (var106 != -1) {
                            arg2.field1924 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg2.field1923 || var101 > arg2.field1923 || var102 > arg2.field1923;
                            arg2.method814(var103, var104, var105, var100, var101, var102, arg5[var97], arg5[var98], arg5[var99], class686.method3883(var47.field1867[var97], var106, (byte) -61), class686.method3883(var47.field1867[var98], var106, (byte) -61), class686.method3883(var47.field1867[var99], var106, (byte) -61));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "(Lha;IIIIZ)V", line = 2317)
    public final void method1352(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ej", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 2320)
    public final void method1357(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)I", line = 2325)
    private static final int method2744(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III[[ZZI)V", line = 2357)
    public final void method1363(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class557 var7 = this.field6626.field5448;
        this.field6643 = arg5;
        this.field6631 = var7.field7594;
        this.field6632 = var7.field7587;
        this.field6640 = var7.field7590;
        this.field6635 = var7.field7612;
        this.field6630 = var7.field7589;
        this.field6624 = var7.field7588;
        this.field6633 = var7.field7614;
        this.field6627 = var7.field7592;
        this.field6641 = var7.field7613;
        this.field6636 = var7.field7591;
        this.field6644 = var7.field7610;
        this.field6628 = var7.field7611;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3524 && var11 >= 0 && var11 < super.field3525) {
                        this.method1364(var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lrfa;IIII[[I[[II)V", line = 2403)
    public class476(class415 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6626 = arg0;
        this.field6625 = arg2;
        this.field6639 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field6626.field5466 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field6626.field5457 * var18 + this.field6626.field5473 * var16 + this.field6626.field5443 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field6639[var11][var10] = (byte) var20;
            }
        }
        this.field6642 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "(IILha;)Lha;", line = 2452)
    public final class117 method1361(int arg0, int arg1, class117 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIIIIII[[ZLmm;Lgw;[I[I)V", line = 2466)
    private final void method2745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class26 arg8, class142 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field339;
        this.field6626.method1091(false);
        arg9.field1934 = false;
        arg9.field1925 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field6637[var18][var19] != null) {
                        class350 var20 = this.field6637[var18][var19];
                        if (var20.field4662 != -1 && (var20.field4657 & 2) == 0 && var20.field4658 == -1) {
                            int var21 = this.field6626.method2352(var20.field4662);
                            arg9.method814(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class686.method3883(var20.field4660 & 65535, var21, (byte) -61), class686.method3883(var20.field4656 & 65535, var21, (byte) -61), class686.method3883(var20.field4659 & 65535, var21, (byte) -61));
                            arg9.method814(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class686.method3883(var20.field4661 & 65535, var21, (byte) -61), class686.method3883(var20.field4659 & 65535, var21, (byte) -61), class686.method3883(var20.field4656 & 65535, var21, (byte) -61));
                        } else if (var20.field4658 == -1) {
                            arg9.method814(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field4660 & 65535, var20.field4656 & 65535, var20.field4659 & 65535);
                            arg9.method814(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field4661 & 65535, var20.field4659 & 65535, var20.field4656 & 65535);
                        } else {
                            int var22 = var20.field4658;
                            arg9.method814(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg9.method814(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (this.field6629[var18][var19] != null) {
                        class136 var23 = this.field6629[var18][var19];
                        for (int var24 = 0; var24 < var23.field1856; ++var24) {
                            arg10[var24] = var23.field1860[var24] * var14 / super.field3527 + var16;
                            arg11[var24] = var17 - var23.field1863[var24] * var14 / super.field3527;
                        }
                        for (int var25 = 0; var25 < var23.field1862; ++var25) {
                            short var26 = var23.field1857[var25];
                            short var27 = var23.field1859[var25];
                            short var28 = var23.field1865[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field1864 != null && var23.field1864[var25] != -1) {
                                int var35 = var23.field1864[var25];
                                arg9.method814(var32, var33, var34, var29, var30, var31, 100, 100, 100, class686.method3883(var23.field1867[var26], var35, (byte) -61), class686.method3883(var23.field1867[var27], var35, (byte) -61), class686.method3883(var23.field1867[var28], var35, (byte) -61));
                            } else if (var23.field1861 != null && var23.field1861[var25] != -1) {
                                int var36 = this.field6626.method2352(var23.field1861[var25]);
                                arg9.method814(var32, var33, var34, var29, var30, var31, 100, 100, 100, class686.method3883(var23.field1867[var26], var36, (byte) -61), class686.method3883(var23.field1867[var27], var36, (byte) -61), class686.method3883(var23.field1867[var28], var36, (byte) -61));
                            } else {
                                int var37 = var23.field1858[var25];
                                arg9.method814(var32, var33, var34, var29, var30, var31, 100, 100, 100, class686.method3883(var23.field1867[var26], var37, (byte) -61), class686.method3883(var23.field1867[var27], var37, (byte) -61), class686.method3883(var23.field1867[var28], var37, (byte) -61));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field1934 = true;
        this.field6626.method1091(var15);
    }
}
