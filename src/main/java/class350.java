import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class350 extends class35 {

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    private int field5308 = -1;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "Lin;")
    private class59 field5310;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    private int field5304;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "[[I")
    public int[][] field5298;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "[[B")
    private byte[][] field5302;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "[[B")
    private byte[][] field5314;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    private int field5296;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    private int field5300;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    private int field5301;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    private int field5303;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    private int field5305;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    private int field5306;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    private int field5307;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    private int field5312;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    private int field5313;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    private int field5315;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    private int field5316;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    private int field5317;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "[[Lgt;")
    private class315[][] field5311;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[[Lod;")
    private class349[][] field5297;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "[[Ltv;")
    private class391[][] field5309;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "[[Ldw;")
    private class501[][] field5299;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "()V")
    public final void method284() {
        this.field5302 = null;
        this.field5314 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method274(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field5309 == null) {
            this.field5309 = new class391[super.field532][super.field531];
            this.field5311 = new class315[super.field532][super.field531];
        } else if (this.field5299 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field534 != var20 || var21 != 0 && super.field534 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class315 var22 = new class315();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field4505 = var23;
            var22.field4496 = new short[var23];
            var22.field4500 = new short[var23];
            var22.field4501 = new short[var23];
            var22.field4497 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field4496[var25] = (short) (this.field5302[arg0][arg1] - this.field5314[arg0][arg1]);
                } else if (var30 == 0 && super.field534 == var31) {
                    var22.field4496[var25] = (short) (this.field5302[arg0][arg1 + 1] - this.field5314[arg0][arg1 + 1]);
                } else if (super.field534 == var30 && super.field534 == var31) {
                    var22.field4496[var25] = (short) (this.field5302[arg0 + 1][arg1 + 1] - this.field5314[arg0 + 1][arg1 + 1]);
                } else if (super.field534 == var30 && var31 == 0) {
                    var22.field4496[var25] = (short) (this.field5302[arg0 + 1][arg1] - this.field5314[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field5302[arg0 + 1][arg1] - this.field5314[arg0 + 1][arg1]) * var30 + (this.field5302[arg0][arg1] - this.field5314[arg0][arg1]) * (super.field534 - var30);
                    int var33 = (this.field5302[arg0 + 1][arg1 + 1] - this.field5314[arg0 + 1][arg1 + 1]) * var30 + (this.field5302[arg0][arg1 + 1] - this.field5314[arg0][arg1 + 1]) * (super.field534 - var30);
                    var22.field4496[var25] = (short) ((super.field534 - var31) * var32 + var31 * var33 >> super.field535 * 2);
                }
                int var34 = (arg0 << super.field535) + var30;
                int var35 = (arg1 << super.field535) + var31;
                var22.field4500[var25] = (short) var30;
                var22.field4497[var25] = (short) var31;
                var22.field4501[var25] = (short) (this.method273(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field4496[var25] < 2) {
                    var22.field4496[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field5310.field2449.method935(arg11[var28], -8037).field3114) {
                    var26 = true;
                }
            }
            var22.field4502 = new int[var27];
            if (arg10 != null) {
                var22.field4494 = new int[var27];
            }
            var22.field4506 = new short[var27];
            var22.field4499 = new short[var27];
            var22.field4504 = new short[var27];
            if (var26) {
                var22.field4495 = new short[var27];
                var22.field4498 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field4502[var22.field4503] = class443.method2695(arg9[var29], (byte) 86);
                    } else {
                        var22.field4502[var22.field4503] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field4494[var22.field4503] = class443.method2695(arg10[var29], (byte) 96);
                        } else {
                            var22.field4494[var22.field4503] = -1;
                        }
                    }
                    var22.field4506[var22.field4503] = (short) arg6[var29];
                    var22.field4499[var22.field4503] = (short) arg7[var29];
                    var22.field4504[var22.field4503] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field5310.field2449.method935(arg11[var29], -8037).field3114) {
                            var22.field4495[var22.field4503] = (short) arg11[var29];
                            var22.field4498[var22.field4503] = (short) arg12[var29];
                        } else {
                            var22.field4495[var22.field4503] = -1;
                        }
                    }
                    ++var22.field4503;
                }
            }
            this.field5311[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class391 var36 = new class391();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field5799 = class420.method2574(0, this.field5302[arg0][arg1] - this.field5314[arg0][arg1], class443.method2695(arg10[0], (byte) 61));
                    if (var37 == -1) {
                        var36.field5798 = (byte) (var36.field5798 | 2);
                    }
                }
                if (this.field5298[arg0 + 1][arg1] == this.field5298[arg0][arg1] && this.field5298[arg0 + 1][arg1 + 1] == this.field5298[arg0][arg1] && this.field5298[arg0][arg1 + 1] == this.field5298[arg0][arg1]) {
                    var36.field5798 = (byte) (var36.field5798 | 1);
                }
                if (var38 != -1 && (var36.field5798 & 2) == 0 && !this.field5310.field2449.method935(var38, -8037).field3114) {
                    var36.field5796 = (short) (this.field5302[arg0][arg1] - this.field5314[arg0][arg1]);
                    var36.field5795 = (short) (this.field5302[arg0 + 1][arg1] - this.field5314[arg0 + 1][arg1]);
                    var36.field5797 = (short) (this.field5302[arg0 + 1][arg1 + 1] - this.field5314[arg0 + 1][arg1 + 1]);
                    var36.field5800 = (short) (this.field5302[arg0][arg1 + 1] - this.field5314[arg0][arg1 + 1]);
                    var36.field5794 = (short) var38;
                } else {
                    short var39 = class443.method2695(var37, (byte) 109);
                    var36.field5796 = (short) class420.method2574(0, this.field5302[arg0][arg1] - this.field5314[arg0][arg1], var39);
                    var36.field5795 = (short) class420.method2574(0, this.field5302[arg0 + 1][arg1] - this.field5314[arg0 + 1][arg1], var39);
                    var36.field5797 = (short) class420.method2574(0, this.field5302[arg0 + 1][arg1 + 1] - this.field5314[arg0 + 1][arg1 + 1], var39);
                    var36.field5800 = (short) class420.method2574(0, this.field5302[arg0][arg1 + 1] - this.field5314[arg0][arg1 + 1], var39);
                    var36.field5794 = -1;
                }
                this.field5309[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)I")
    private static final int method2272(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "(Lj;IIIIZ)V")
    public final void method275(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIII[[ZLrn;[I[I)V")
    private final void method2273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class174 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2661 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field5299[var16][var17] != null) {
                        class501 var18 = this.field5299[var16][var17];
                        if (var18.field7359 != -1 && (var18.field7368 & 2) == 0 && var18.field7366 == 0) {
                            int var19 = this.field5310.method496(var18.field7359);
                            arg8.method1254(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class420.method2574(0, var18.field7369, var19), class420.method2574(0, var18.field7365, var19), class420.method2574(0, var18.field7360, var19));
                            arg8.method1254(var15, var15, var15 - var13, var14, var13 + var14, var14, class420.method2574(0, var18.field7362, var19), class420.method2574(0, var18.field7360, var19), class420.method2574(0, var18.field7365, var19));
                        } else if (var18.field7366 == 0) {
                            arg8.method1242(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field7369, var18.field7365, var18.field7360);
                            arg8.method1242(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field7362, var18.field7360, var18.field7365);
                        } else {
                            int var20 = var18.field7366;
                            arg8.method1242(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class51.method370(var18.field7369 & -16777216, var20, (byte) 70), class51.method370(var18.field7365 & -16777216, var20, (byte) 70), class51.method370(var18.field7360 & -16777216, var20, (byte) 70));
                            arg8.method1242(var15, var15, var15 - var13, var14, var13 + var14, var14, class51.method370(var18.field7362 & -16777216, var20, (byte) 70), class51.method370(var18.field7360 & -16777216, var20, (byte) 70), class51.method370(var18.field7365 & -16777216, var20, (byte) 70));
                        }
                    } else if (this.field5297[var16][var17] != null) {
                        class349 var21 = this.field5297[var16][var17];
                        for (int var22 = 0; var22 < var21.field5287; ++var22) {
                            arg9[var22] = var21.field5288[var22] * var13 / super.field534 + var14;
                            arg10[var22] = var15 - var21.field5286[var22] * var13 / super.field534;
                        }
                        for (int var23 = 0; var23 < var21.field5290; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5291 != null && var21.field5291[var23] != 0 && (var21.field5293 == null || var21.field5293 != null && var21.field5293[var23] == -1)) {
                                int var33 = var21.field5291[var23];
                                arg8.method1242(var30, var31, var32, var27, var28, var29, class51.method370(-16777216 - (var21.field5295[var24] & -16777216), var33, (byte) 70), class51.method370(-16777216 - (var21.field5295[var25] & -16777216), var33, (byte) 70), class51.method370(-16777216 - (var21.field5295[var26] & -16777216), var33, (byte) 70));
                            } else if (var21.field5293 != null && var21.field5293[var23] != -1) {
                                int var34 = this.field5310.method496(var21.field5293[var23]);
                                arg8.method1254(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1242(var30, var31, var32, var27, var28, var29, var21.field5295[var24], var21.field5295[var25], var21.field5295[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2661 = true;
    }

    @OriginalMember(owner = "client!ek", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method282(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field5299 == null) {
            this.field5299 = new class501[super.field532][super.field531];
            this.field5297 = new class349[super.field532][super.field531];
        } else if (this.field5309 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class258.field3724[class443.method2695(arg6[var15], (byte) 122) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class258.field3724[class443.method2695(arg7[var16], (byte) 91) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field534 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field534 && arg4[var22] == super.field534) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field534) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field534 != arg2[var24] && arg2[0] - super.field534 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field534 != arg4[var24] && arg4[0] - super.field534 != arg4[var24]) {
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
                class501 var25 = new class501();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field7366 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field7368 = (byte) (var25.field7368 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field5298[arg0 + 1][arg1] == this.field5298[arg0][arg1] && this.field5298[arg0 + 1][arg1 + 1] == this.field5298[arg0][arg1] && this.field5298[arg0][arg1 + 1] == this.field5298[arg0][arg1]) {
                    var25.field7368 = (byte) (var25.field7368 | 1);
                }
                if (var27 != -1 && (var25.field7368 & 2) == 0 && !this.field5310.field2449.method935(var27, -8037).field3114) {
                    var25.field7362 = this.field5302[arg0][arg1] - this.field5314[arg0][arg1];
                    var25.field7360 = this.field5302[arg0 + 1][arg1] - this.field5314[arg0 + 1][arg1];
                    var25.field7369 = this.field5302[arg0 + 1][arg1 + 1] - this.field5314[arg0 + 1][arg1 + 1];
                    var25.field7365 = this.field5302[arg0][arg1 + 1] - this.field5314[arg0][arg1 + 1];
                    var25.field7359 = (short) var27;
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
                    var25.field7362 = class13.method110(var28, 118, arg10, method2272(arg6[var18] >> 8, this.field5302[arg0][arg1] - this.field5314[arg0][arg1]));
                    if (var25.field7366 != 0) {
                        var25.field7362 |= 255 - (this.field5302[arg0][arg1] - this.field5314[arg0][arg1]) << 25;
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
                    var25.field7360 = class13.method110(var29, 111, arg10, method2272(arg6[var19] >> 8, this.field5302[arg0 + 1][arg1] - this.field5314[arg0 + 1][arg1]));
                    if (var25.field7366 != 0) {
                        var25.field7360 |= 255 - (this.field5302[arg0 + 1][arg1] - this.field5314[arg0 + 1][arg1]) << 25;
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
                    var25.field7369 = class13.method110(var30, 113, arg10, method2272(arg6[var20] >> 8, this.field5302[arg0 + 1][arg1 + 1] - this.field5314[arg0 + 1][arg1 + 1]));
                    if (var25.field7366 != 0) {
                        var25.field7369 |= 255 - (this.field5302[arg0 + 1][arg1 + 1] - this.field5314[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field7365 = class13.method110(var31, 109, arg10, method2272(arg6[var21] >> 8, this.field5302[arg0][arg1 + 1] - this.field5314[arg0][arg1 + 1]));
                    if (var25.field7366 != 0) {
                        var25.field7365 |= 255 - (this.field5302[arg0][arg1 + 1] - this.field5314[arg0][arg1 + 1]) << 25;
                    }
                    var25.field7359 = -1;
                }
                if (arg5 != null) {
                    var25.field7363 = (short) arg5[var20];
                    var25.field7364 = (short) arg5[var21];
                    var25.field7361 = (short) arg5[var19];
                    var25.field7367 = (short) arg5[var18];
                }
                this.field5299[arg0][arg1] = var25;
            } else {
                class349 var32 = new class349();
                var32.field5287 = (short) arg2.length;
                var32.field5290 = (short) (arg2.length / 3);
                var32.field5288 = new short[var32.field5287];
                var32.field5292 = new short[var32.field5287];
                var32.field5286 = new short[var32.field5287];
                var32.field5295 = new int[var32.field5287];
                if (arg5 != null) {
                    var32.field5289 = new short[var32.field5287];
                }
                for (int var33 = 0; var33 < var32.field5287; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field5302[arg0][arg1] - this.field5314[arg0][arg1];
                    } else if (var48 == 0 && super.field534 == var49) {
                        var51 = this.field5302[arg0][arg1 + 1] - this.field5314[arg0][arg1 + 1];
                    } else if (super.field534 == var48 && super.field534 == var49) {
                        var51 = this.field5302[arg0 + 1][arg1 + 1] - this.field5314[arg0 + 1][arg1 + 1];
                    } else if (super.field534 == var48 && var49 == 0) {
                        var51 = this.field5302[arg0 + 1][arg1] - this.field5314[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field5302[arg0 + 1][arg1] - this.field5314[arg0 + 1][arg1]) * var48 + (this.field5302[arg0][arg1] - this.field5314[arg0][arg1]) * (super.field534 - var48);
                        int var53 = (this.field5302[arg0 + 1][arg1 + 1] - this.field5314[arg0 + 1][arg1 + 1]) * var48 + (this.field5302[arg0][arg1 + 1] - this.field5314[arg0][arg1 + 1]) * (super.field534 - var48);
                        var51 = (super.field534 - var49) * var52 + var49 * var53 >> super.field535 * 2;
                    }
                    int var54 = (arg0 << super.field535) + var48;
                    int var55 = (arg1 << super.field535) + var49;
                    var32.field5288[var33] = (short) var48;
                    var32.field5286[var33] = (short) var49;
                    var32.field5292[var33] = (short) (this.method273(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field5310.field2449.method935(arg8[var33], -8037).field3114) {
                        var32.field5295[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field5295[var33] = var51 << 25;
                        } else {
                            var32.field5295[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field5289[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field5295[var33] = class13.method110(var56, 120, arg10, method2272(arg6[var33] >> 8, var51));
                        if (arg7 != null) {
                            var32.field5295[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field5290; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field5310.field2449.method935(arg8[var35 * 3], -8037).field3114) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field5291 = new int[var32.field5290];
                }
                if (var34) {
                    var32.field5293 = new short[var32.field5290];
                    var32.field5294 = new short[var32.field5290];
                }
                for (int var36 = 0; var36 < var32.field5290; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field5291[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field5310.field2449.method935(var42, -8037).field3114) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field5310.field2449.method935(var43, -8037).field3114) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field5310.field2449.method935(var44, -8037).field3114) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field5293[var36] = (short) var44;
                            var32.field5294[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field5310.field2449.method935(var45, -8037).field3114) {
                                    var32.field5295[var37] = class258.field3724[class443.method2695(this.field5310.field2449.method935(var45, -8037).field3119 & 65535, (byte) 55) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field5310.field2449.method935(var46, -8037).field3114) {
                                    var32.field5295[var38] = class258.field3724[class443.method2695(this.field5310.field2449.method935(var46, -8037).field3119 & 65535, (byte) 47) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field5310.field2449.method935(var47, -8037).field3114) {
                                    var32.field5295[var39] = class258.field3724[class443.method2695(this.field5310.field2449.method935(var47, -8037).field3119 & 65535, (byte) 96) & 65535];
                                }
                            }
                            var32.field5293[var36] = -1;
                        }
                    }
                }
                this.field5297[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIIIIII[[ZLrn;[I[I)V")
    private final void method2274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class174 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2661 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field5309[var16][var17] != null) {
                        class391 var18 = this.field5309[var16][var17];
                        if (var18.field5794 != -1 && (var18.field5798 & 2) == 0 && var18.field5799 == -1) {
                            int var19 = this.field5310.method496(var18.field5794);
                            arg8.method1254(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class420.method2574(0, var18.field5797 & 65535, var19), class420.method2574(0, var18.field5800 & 65535, var19), class420.method2574(0, var18.field5795 & 65535, var19));
                            arg8.method1254(var15, var15, var15 - var13, var14, var13 + var14, var14, class420.method2574(0, var18.field5796 & 65535, var19), class420.method2574(0, var18.field5795 & 65535, var19), class420.method2574(0, var18.field5800 & 65535, var19));
                        } else if (var18.field5799 == -1) {
                            arg8.method1254(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5797 & 65535, var18.field5800 & 65535, var18.field5795 & 65535);
                            arg8.method1254(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5796 & 65535, var18.field5795 & 65535, var18.field5800 & 65535);
                        } else {
                            int var20 = var18.field5799;
                            arg8.method1254(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1254(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field5311[var16][var17] != null) {
                        class315 var21 = this.field5311[var16][var17];
                        for (int var22 = 0; var22 < var21.field4505; ++var22) {
                            arg9[var22] = var21.field4500[var22] * var13 / super.field534 + var14;
                            arg10[var22] = var15 - var21.field4497[var22] * var13 / super.field534;
                        }
                        for (int var23 = 0; var23 < var21.field4503; ++var23) {
                            short var24 = var21.field4506[var23];
                            short var25 = var21.field4499[var23];
                            short var26 = var21.field4504[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4494 != null && var21.field4494[var23] != -1) {
                                int var33 = var21.field4494[var23];
                                arg8.method1254(var30, var31, var32, var27, var28, var29, class420.method2574(0, var21.field4496[var24], var33), class420.method2574(0, var21.field4496[var25], var33), class420.method2574(0, var21.field4496[var26], var33));
                            } else if (var21.field4495 != null && var21.field4495[var23] != -1) {
                                int var34 = this.field5310.method496(var21.field4495[var23]);
                                arg8.method1254(var30, var31, var32, var27, var28, var29, class420.method2574(0, var21.field4496[var24], var34), class420.method2574(0, var21.field4496[var25], var34), class420.method2574(0, var21.field4496[var26], var34));
                            } else {
                                int var35 = var21.field4502[var23];
                                arg8.method1254(var30, var31, var32, var27, var28, var29, class420.method2574(0, var21.field4496[var24], var35), class420.method2574(0, var21.field4496[var25], var35), class420.method2574(0, var21.field4496[var26], var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2661 = true;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    public final void method279(int arg0, int arg1) {
        class109 var3 = this.field5310.method451(Thread.currentThread());
        var3.field1690.field2662 = 0;
        if (this.field5299 != null) {
            this.method2277(arg0, arg1, this.field5310.field1008, var3.field1690, var3.field1708, var3.field1716, var3.field1711);
        } else {
            if (this.field5309 != null) {
                this.method2275(arg0, arg1, var3.field1690, var3.field1708, var3.field1716, var3.field1711);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class109 var9 = this.field5310.method451(Thread.currentThread());
        class174 var10 = var9.field1690;
        var10.field2662 = 0;
        var10.field2659 = false;
        if (this.field5299 != null) {
            this.method2273(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1708, var9.field1716);
        } else {
            if (this.field5309 != null) {
                this.method2274(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1708, var9.field1716);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "va", descriptor = "(II)I")
    public final int method273(int arg0, int arg1) {
        int var3 = arg0 >> super.field535;
        int var4 = arg1 >> super.field535;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field532 - 1 && var4 <= super.field531 - 1) {
            int var5 = arg0 & super.field534 - 1;
            int var6 = arg1 & super.field534 - 1;
            int var7 = (super.field534 - var5) * this.field5298[var3][var4] + this.field5298[var3 + 1][var4] * var5 >> super.field535;
            int var8 = (super.field534 - var5) * this.field5298[var3][var4 + 1] + this.field5298[var3 + 1][var4 + 1] * var5 >> super.field535;
            return (super.field534 - var6) * var7 + var6 * var8 >> super.field535;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lin;IIII[[I[[II)V")
    public class350(class59 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5310 = arg0;
        this.field5304 = arg2;
        this.field5298 = arg5;
        this.field5302 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field5310.field1012 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field5310.field1033 * var18 + this.field5310.field1036 * var16 + this.field5310.field1028 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field5302[var11][var10] = (byte) var20;
            }
        }
        this.field5314 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILrn;[I[I[I)V")
    private final void method2275(int arg0, int arg1, class174 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class391 var7 = this.field5309[arg0][arg1];
        if (var7 != null) {
            if ((var7.field5798 & 2) == 0) {
                int var8 = super.field534 * arg0;
                int var9 = super.field534 + var8;
                int var10 = super.field534 * arg1;
                int var11 = super.field534 + var10;
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
                if ((var7.field5798 & 1) != 0) {
                    int var12 = this.field5298[arg0][arg1];
                    int var16;
                    if (this.field5308 == -1) {
                        int var13 = this.field5315 * var12;
                        var14 = (this.field5300 * var10 + this.field5301 * var8 + var13 >> 15) + this.field5317;
                        if (var14 <= this.field5310.field1015) {
                            return;
                        }
                        var15 = (this.field5300 * var10 + this.field5301 * var9 + var13 >> 15) + this.field5317;
                        if (var15 <= this.field5310.field1015) {
                            return;
                        }
                        var16 = (this.field5300 * var11 + this.field5301 * var9 + var13 >> 15) + this.field5317;
                        if (var16 <= this.field5310.field1015) {
                            return;
                        }
                        var17 = (this.field5300 * var11 + this.field5301 * var8 + var13 >> 15) + this.field5317;
                        if (var17 <= this.field5310.field1015) {
                            return;
                        }
                    } else {
                        var17 = this.field5308;
                        var16 = this.field5308;
                        var15 = this.field5308;
                        var14 = this.field5308;
                    }
                    int var18 = this.field5316 * var12;
                    int var19 = this.field5306 * var12;
                    var20 = (this.field5312 * var10 + this.field5296 * var8 + var18 >> 15) + this.field5305;
                    var21 = this.field5310.field1013 * var20 / var14 + arg2.field2667;
                    var22 = (this.field5307 * var10 + this.field5303 * var8 + var19 >> 15) + this.field5313;
                    var23 = this.field5310.field1042 * var22 / var14 + arg2.field2658;
                    var24 = (this.field5312 * var10 + this.field5296 * var9 + var18 >> 15) + this.field5305;
                    var25 = this.field5310.field1013 * var24 / var15 + arg2.field2667;
                    var26 = (this.field5307 * var10 + this.field5303 * var9 + var19 >> 15) + this.field5313;
                    var27 = this.field5310.field1042 * var26 / var15 + arg2.field2658;
                    int var28 = (this.field5312 * var11 + this.field5296 * var9 + var18 >> 15) + this.field5305;
                    var29 = this.field5310.field1013 * var28 / var16 + arg2.field2667;
                    int var30 = (this.field5307 * var11 + this.field5303 * var9 + var19 >> 15) + this.field5313;
                    var31 = this.field5310.field1042 * var30 / var16 + arg2.field2658;
                    var32 = (this.field5312 * var11 + this.field5296 * var8 + var18 >> 15) + this.field5305;
                    var33 = this.field5310.field1013 * var32 / var17 + arg2.field2667;
                    var34 = (this.field5307 * var11 + this.field5303 * var8 + var19 >> 15) + this.field5313;
                    var35 = this.field5310.field1042 * var34 / var17 + arg2.field2658;
                } else {
                    int var36 = this.field5298[arg0][arg1];
                    int var37 = this.field5298[arg0 + 1][arg1];
                    int var38 = this.field5298[arg0 + 1][arg1 + 1];
                    int var39 = this.field5298[arg0][arg1 + 1];
                    int var40;
                    if (this.field5308 == -1) {
                        var14 = (this.field5300 * var10 + this.field5315 * var36 + this.field5301 * var8 >> 15) + this.field5317;
                        if (var14 <= this.field5310.field1015) {
                            return;
                        }
                        var15 = (this.field5300 * var10 + this.field5315 * var37 + this.field5301 * var9 >> 15) + this.field5317;
                        if (var15 <= this.field5310.field1015) {
                            return;
                        }
                        var40 = (this.field5300 * var11 + this.field5315 * var38 + this.field5301 * var9 >> 15) + this.field5317;
                        if (var40 <= this.field5310.field1015) {
                            return;
                        }
                        var17 = (this.field5300 * var11 + this.field5315 * var39 + this.field5301 * var8 >> 15) + this.field5317;
                        if (var17 <= this.field5310.field1015) {
                            return;
                        }
                    } else {
                        var17 = this.field5308;
                        var40 = this.field5308;
                        var15 = this.field5308;
                        var14 = this.field5308;
                    }
                    var20 = (this.field5312 * var10 + this.field5316 * var36 + this.field5296 * var8 >> 15) + this.field5305;
                    var21 = this.field5310.field1013 * var20 / var14 + arg2.field2667;
                    var22 = (this.field5307 * var10 + this.field5306 * var36 + this.field5303 * var8 >> 15) + this.field5313;
                    var23 = this.field5310.field1042 * var22 / var14 + arg2.field2658;
                    var24 = (this.field5312 * var10 + this.field5316 * var37 + this.field5296 * var9 >> 15) + this.field5305;
                    var25 = this.field5310.field1013 * var24 / var15 + arg2.field2667;
                    var26 = (this.field5307 * var10 + this.field5306 * var37 + this.field5303 * var9 >> 15) + this.field5313;
                    var27 = this.field5310.field1042 * var26 / var15 + arg2.field2658;
                    int var41 = (this.field5312 * var11 + this.field5316 * var38 + this.field5296 * var9 >> 15) + this.field5305;
                    var29 = this.field5310.field1013 * var41 / var40 + arg2.field2667;
                    int var42 = (this.field5307 * var11 + this.field5306 * var38 + this.field5303 * var9 >> 15) + this.field5313;
                    var31 = this.field5310.field1042 * var42 / var40 + arg2.field2658;
                    var32 = (this.field5312 * var11 + this.field5316 * var39 + this.field5296 * var8 >> 15) + this.field5305;
                    var33 = this.field5310.field1013 * var32 / var17 + arg2.field2667;
                    var34 = (this.field5307 * var11 + this.field5306 * var39 + this.field5303 * var8 >> 15) + this.field5313;
                    var35 = this.field5310.field1042 * var34 / var17 + arg2.field2658;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field2659 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field2663 || var33 > arg2.field2663 || var25 > arg2.field2663;
                    if (var7.field5794 >= 0) {
                        if (this.method2276(this.field5310.field2449.method935(var7.field5794, -8037).field3109)) {
                            arg2.field2662 = 100;
                        }
                        arg2.method1251(var31, var35, var27, var29, var33, var25, var7.field5797 & 65535, var7.field5800 & 65535, var7.field5795 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5794);
                        arg2.field2662 = 0;
                    } else {
                        arg2.method1254(var31, var35, var27, var29, var33, var25, var7.field5797 & 65535, var7.field5800 & 65535, var7.field5795 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field2659 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field2663 || var25 > arg2.field2663 || var33 > arg2.field2663;
                    if (var7.field5794 >= 0) {
                        if (this.method2276(this.field5310.field2449.method935(var7.field5794, -8037).field3109)) {
                            arg2.field2662 = 100;
                        }
                        arg2.method1251(var23, var27, var35, var21, var25, var33, var7.field5796 & 65535, var7.field5795 & 65535, var7.field5800 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5794);
                        arg2.field2662 = 0;
                        return;
                    }
                    arg2.method1254(var23, var27, var35, var21, var25, var33, var7.field5796 & 65535, var7.field5795 & 65535, var7.field5800 & 65535);
                }
            }
        } else {
            class315 var43 = this.field5311[arg0][arg1];
            if (var43 != null) {
                if (this.field5308 == -1) {
                    for (int var44 = 0; var44 < var43.field4505; ++var44) {
                        int var45 = (arg0 << super.field535) + var43.field4500[var44];
                        short var46 = var43.field4501[var44];
                        int var47 = (arg1 << super.field535) + var43.field4497[var44];
                        int var48 = (this.field5300 * var47 + this.field5315 * var46 + this.field5301 * var45 >> 15) + this.field5317;
                        if (var48 <= this.field5310.field1015) {
                            return;
                        }
                        int var49 = (this.field5312 * var47 + this.field5316 * var46 + this.field5296 * var45 >> 15) + this.field5305;
                        int var50 = (this.field5307 * var47 + this.field5306 * var46 + this.field5303 * var45 >> 15) + this.field5313;
                        arg3[var44] = this.field5310.field1013 * var49 / var48 + arg2.field2667;
                        arg4[var44] = this.field5310.field1042 * var50 / var48 + arg2.field2658;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field4505; ++var51) {
                        int var91 = (arg0 << super.field535) + var43.field4500[var51];
                        short var92 = var43.field4501[var51];
                        int var93 = (arg1 << super.field535) + var43.field4497[var51];
                        int var94 = (this.field5312 * var93 + this.field5316 * var92 + this.field5296 * var91 >> 15) + this.field5305;
                        int var95 = (this.field5307 * var93 + this.field5306 * var92 + this.field5303 * var91 >> 15) + this.field5313;
                        arg3[var51] = this.field5310.field1013 * var94 / this.field5308 + arg2.field2667;
                        arg4[var51] = this.field5310.field1042 * var95 / this.field5308 + arg2.field2658;
                    }
                }
                if (var43.field4495 != null) {
                    int var52 = this.field5298[arg0][arg1];
                    int var53 = this.field5298[arg0 + 1][arg1];
                    int var54 = this.field5298[arg0][arg1 + 1];
                    int var55 = super.field534 * arg0;
                    int var56 = super.field534 + var55;
                    int var57 = super.field534 * arg1;
                    int var58 = super.field534 + var57;
                    int var59 = (this.field5312 * var57 + this.field5316 * var52 + this.field5296 * var55 >> 15) + this.field5305;
                    int var60 = (this.field5307 * var57 + this.field5306 * var52 + this.field5303 * var55 >> 15) + this.field5313;
                    int var61 = (this.field5300 * var57 + this.field5315 * var52 + this.field5301 * var55 >> 15) + this.field5317;
                    int var62 = (this.field5312 * var57 + this.field5316 * var53 + this.field5296 * var56 >> 15) + this.field5305;
                    int var63 = (this.field5307 * var57 + this.field5306 * var53 + this.field5303 * var56 >> 15) + this.field5313;
                    int var64 = (this.field5300 * var57 + this.field5315 * var53 + this.field5301 * var56 >> 15) + this.field5317;
                    int var65 = (this.field5312 * var58 + this.field5316 * var54 + this.field5296 * var55 >> 15) + this.field5305;
                    int var66 = (this.field5307 * var58 + this.field5306 * var54 + this.field5303 * var55 >> 15) + this.field5313;
                    int var67 = (this.field5300 * var58 + this.field5315 * var54 + this.field5301 * var55 >> 15) + this.field5317;
                    for (int var68 = 0; var68 < var43.field4503; ++var68) {
                        short var69 = var43.field4506[var68];
                        short var70 = var43.field4499[var68];
                        short var71 = var43.field4504[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field2659 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field2663 || var73 > arg2.field2663 || var74 > arg2.field2663;
                            short var78 = var43.field4495[var68];
                            if (var78 != -1) {
                                if (this.method2276(this.field5310.field2449.method935(var78, -8037).field3109)) {
                                    arg2.field2662 = 100;
                                }
                                arg2.method1251(var75, var76, var77, var72, var73, var74, var43.field4496[var69], var43.field4496[var70], var43.field4496[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field2662 = 0;
                            } else {
                                int var79 = var43.field4502[var68];
                                if (var79 != -1) {
                                    arg2.method1254(var75, var76, var77, var72, var73, var74, class420.method2574(0, var43.field4496[var69], var79), class420.method2574(0, var43.field4496[var70], var79), class420.method2574(0, var43.field4496[var71], var79));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field4503; ++var80) {
                    short var81 = var43.field4506[var80];
                    short var82 = var43.field4499[var80];
                    short var83 = var43.field4504[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field4502[var80];
                        if (var90 != -1) {
                            arg2.field2659 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field2663 || var85 > arg2.field2663 || var86 > arg2.field2663;
                            arg2.method1254(var87, var88, var89, var84, var85, var86, class420.method2574(0, var43.field4496[var81], var90), class420.method2574(0, var43.field4496[var82], var90), class420.method2574(0, var43.field4496[var83], var90));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "QA", descriptor = "(III)V")
    public final void method272(int arg0, int arg1, int arg2) {
        if (this.field5314[arg0][arg1] < arg2) {
            this.field5314[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[[ZZ)V")
    public final void method283(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class487 var6 = this.field5310.field1005;
        this.field5308 = -1;
        this.field5296 = var6.field7105;
        this.field5316 = var6.field7108;
        this.field5312 = var6.field7109;
        this.field5305 = var6.field7112;
        this.field5303 = var6.field7110;
        this.field5306 = var6.field7102;
        this.field5307 = var6.field7106;
        this.field5313 = var6.field7104;
        this.field5301 = var6.field7107;
        this.field5315 = var6.field7111;
        this.field5300 = var6.field7103;
        this.field5317 = var6.field7113;
    }

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "(IILj;)Lj;")
    public final class377 method277(int arg0, int arg1, class377 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Z")
    private final boolean method2276(int arg0) {
        if ((this.field5304 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIZLrn;[I[I[I)V")
    private final void method2277(int arg0, int arg1, boolean arg2, class174 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class501 var8 = this.field5299[arg0][arg1];
        if (var8 != null) {
            if ((var8.field7368 & 2) == 0) {
                int var9 = super.field534 * arg0;
                int var10 = super.field534 + var9;
                int var11 = super.field534 * arg1;
                int var12 = super.field534 + var11;
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
                if ((var8.field7368 & 1) != 0 && !arg2) {
                    int var17 = this.field5298[arg0][arg1];
                    if (this.field5308 == -1) {
                        int var18 = this.field5315 * var17;
                        var19 = (this.field5300 * var11 + this.field5301 * var9 + var18 >> 15) + this.field5317;
                        if (var19 <= this.field5310.field1015) {
                            return;
                        }
                        var20 = (this.field5300 * var11 + this.field5301 * var10 + var18 >> 15) + this.field5317;
                        if (var20 <= this.field5310.field1015) {
                            return;
                        }
                        var21 = (this.field5300 * var12 + this.field5301 * var10 + var18 >> 15) + this.field5317;
                        if (var21 <= this.field5310.field1015) {
                            return;
                        }
                        var22 = (this.field5300 * var12 + this.field5301 * var9 + var18 >> 15) + this.field5317;
                        if (var22 <= this.field5310.field1015) {
                            return;
                        }
                    } else {
                        var22 = this.field5308;
                        var21 = this.field5308;
                        var20 = this.field5308;
                        var19 = this.field5308;
                    }
                    if (this.field5310.field1025) {
                        int var23 = var19 - this.field5310.field1031;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field5310.field1031;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field5310.field1031;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field5310.field1031;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field5316 * var17;
                    int var28 = this.field5306 * var17;
                    var29 = (this.field5312 * var11 + this.field5296 * var9 + var27 >> 15) + this.field5305;
                    var30 = this.field5310.field1013 * var29 / var19 + arg3.field2667;
                    var31 = (this.field5307 * var11 + this.field5303 * var9 + var28 >> 15) + this.field5313;
                    var32 = this.field5310.field1042 * var31 / var19 + arg3.field2658;
                    var33 = (this.field5312 * var11 + this.field5296 * var10 + var27 >> 15) + this.field5305;
                    var34 = this.field5310.field1013 * var33 / var20 + arg3.field2667;
                    var35 = (this.field5307 * var11 + this.field5303 * var10 + var28 >> 15) + this.field5313;
                    var36 = this.field5310.field1042 * var35 / var20 + arg3.field2658;
                    var37 = (this.field5312 * var12 + this.field5296 * var10 + var27 >> 15) + this.field5305;
                    var38 = this.field5310.field1013 * var37 / var21 + arg3.field2667;
                    var39 = (this.field5307 * var12 + this.field5303 * var10 + var28 >> 15) + this.field5313;
                    var40 = this.field5310.field1042 * var39 / var21 + arg3.field2658;
                    var41 = (this.field5312 * var12 + this.field5296 * var9 + var27 >> 15) + this.field5305;
                    var42 = this.field5310.field1013 * var41 / var22 + arg3.field2667;
                    var43 = (this.field5307 * var12 + this.field5303 * var9 + var28 >> 15) + this.field5313;
                    var44 = this.field5310.field1042 * var43 / var22 + arg3.field2658;
                } else {
                    int var45 = this.field5298[arg0][arg1];
                    int var46 = this.field5298[arg0 + 1][arg1];
                    int var47 = this.field5298[arg0 + 1][arg1 + 1];
                    int var48 = this.field5298[arg0][arg1 + 1];
                    if (this.field5308 == -1) {
                        var19 = (this.field5300 * var11 + this.field5315 * var45 + this.field5301 * var9 >> 15) + this.field5317;
                        if (var19 <= this.field5310.field1015) {
                            return;
                        }
                        var20 = (this.field5300 * var11 + this.field5315 * var46 + this.field5301 * var10 >> 15) + this.field5317;
                        if (var20 <= this.field5310.field1015) {
                            return;
                        }
                        var21 = (this.field5300 * var12 + this.field5315 * var47 + this.field5301 * var10 >> 15) + this.field5317;
                        if (var21 <= this.field5310.field1015) {
                            return;
                        }
                        var22 = (this.field5300 * var12 + this.field5315 * var48 + this.field5301 * var9 >> 15) + this.field5317;
                        if (var22 <= this.field5310.field1015) {
                            return;
                        }
                    } else {
                        var22 = this.field5308;
                        var21 = this.field5308;
                        var20 = this.field5308;
                        var19 = this.field5308;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field5310.field1031;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field7367 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field5310.field1031;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field7361 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field5310.field1031;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field7363 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field5310.field1031;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field7364 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field5310.field1025) {
                        int var57 = var19 - this.field5310.field1031;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field5310.field1031;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field5310.field1031;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field5310.field1031;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field5312 * var11 + this.field5316 * var45 + this.field5296 * var9 >> 15) + this.field5305;
                    var30 = this.field5310.field1013 * var29 / var19 + arg3.field2667;
                    var31 = (this.field5307 * var11 + this.field5306 * var45 + this.field5303 * var9 >> 15) + this.field5313;
                    var32 = this.field5310.field1042 * var31 / var19 + arg3.field2658;
                    var33 = (this.field5312 * var11 + this.field5316 * var46 + this.field5296 * var10 >> 15) + this.field5305;
                    var34 = this.field5310.field1013 * var33 / var20 + arg3.field2667;
                    var35 = (this.field5307 * var11 + this.field5306 * var46 + this.field5303 * var10 >> 15) + this.field5313;
                    var36 = this.field5310.field1042 * var35 / var20 + arg3.field2658;
                    var37 = (this.field5312 * var12 + this.field5316 * var47 + this.field5296 * var10 >> 15) + this.field5305;
                    var38 = this.field5310.field1013 * var37 / var21 + arg3.field2667;
                    var39 = (this.field5307 * var12 + this.field5306 * var47 + this.field5303 * var10 >> 15) + this.field5313;
                    var40 = this.field5310.field1042 * var39 / var21 + arg3.field2658;
                    var41 = (this.field5312 * var12 + this.field5316 * var48 + this.field5296 * var9 >> 15) + this.field5305;
                    var42 = this.field5310.field1013 * var41 / var22 + arg3.field2667;
                    var43 = (this.field5307 * var12 + this.field5306 * var48 + this.field5303 * var9 >> 15) + this.field5313;
                    var44 = this.field5310.field1042 * var43 / var22 + arg3.field2658;
                }
                boolean var61 = var8.field7359 != -1 && this.method2276(this.field5310.field2449.method935(var8.field7359, -8037).field3109);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field2659 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field2663 || var42 > arg3.field2663 || var34 > arg3.field2663;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field2662 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field7359 >= 0) {
                                arg3.method1244(var40, var44, var36, var38, var42, var34, this.field5310.field1038, var15, var16, var14, var8.field7369, var8.field7365, var8.field7360, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field7359);
                            } else {
                                arg3.method1242(var40, var44, var36, var38, var42, var34, class51.method370(var15 << 24 | this.field5310.field1038, var8.field7369, (byte) 70), class51.method370(var16 << 24 | this.field5310.field1038, var8.field7365, (byte) 70), class51.method370(var14 << 24 | this.field5310.field1038, var8.field7360, (byte) 70));
                            }
                        } else if (var8.field7359 >= 0) {
                            arg3.method1251(var40, var44, var36, var38, var42, var34, var8.field7369, var8.field7365, var8.field7360, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field7359);
                        } else {
                            arg3.method1242(var40, var44, var36, var38, var42, var34, var8.field7369, var8.field7365, var8.field7360);
                        }
                        arg3.field2662 = 0;
                    } else {
                        arg3.method1249(var40, var44, var36, var38, var42, var34, this.field5310.field1038);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field2659 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field2663 || var34 > arg3.field2663 || var42 > arg3.field2663;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field2662 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field7359 >= 0) {
                                arg3.method1244(var32, var36, var44, var30, var34, var42, this.field5310.field1038, var13, var14, var16, var8.field7362, var8.field7360, var8.field7365, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field7359);
                            } else {
                                arg3.method1242(var32, var36, var44, var30, var34, var42, class51.method370(var13 << 24 | this.field5310.field1038, var8.field7362, (byte) 70), class51.method370(var14 << 24 | this.field5310.field1038, var8.field7360, (byte) 70), class51.method370(var16 << 24 | this.field5310.field1038, var8.field7365, (byte) 70));
                            }
                        } else if (var8.field7359 >= 0) {
                            arg3.method1251(var32, var36, var44, var30, var34, var42, var8.field7362, var8.field7360, var8.field7365, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field7359);
                        } else {
                            arg3.method1242(var32, var36, var44, var30, var34, var42, var8.field7362, var8.field7360, var8.field7365);
                        }
                        arg3.field2662 = 0;
                        return;
                    }
                    arg3.method1249(var32, var36, var44, var30, var34, var42, this.field5310.field1038);
                }
            }
        } else {
            class349 var64 = this.field5297[arg0][arg1];
            if (var64 != null) {
                if (this.field5308 == -1) {
                    for (int var65 = 0; var65 < var64.field5287; ++var65) {
                        int var66 = (arg0 << super.field535) + var64.field5288[var65];
                        int var67 = var64.field5292[var65];
                        int var68 = (arg1 << super.field535) + var64.field5286[var65];
                        int var69 = (this.field5300 * var68 + this.field5315 * var67 + this.field5301 * var66 >> 15) + this.field5317;
                        if (var69 <= this.field5310.field1015) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field5310.field1031;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field5289[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field5310.field1025) {
                            int var72 = var69 - this.field5310.field1031;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field5312 * var68 + this.field5316 * var67 + this.field5296 * var66 >> 15) + this.field5305;
                        int var74 = (this.field5307 * var68 + this.field5306 * var67 + this.field5303 * var66 >> 15) + this.field5313;
                        arg4[var65] = this.field5310.field1013 * var73 / var69 + arg3.field2667;
                        arg5[var65] = this.field5310.field1042 * var74 / var69 + arg3.field2658;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field5287; ++var75) {
                        int var115 = (arg0 << super.field535) + var64.field5288[var75];
                        int var116 = var64.field5292[var75];
                        int var117 = (arg1 << super.field535) + var64.field5286[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field5308 - this.field5310.field1031;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field5289[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field5310.field1025) {
                            int var120 = this.field5308 - this.field5310.field1031;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field5312 * var117 + this.field5316 * var116 + this.field5296 * var115 >> 15) + this.field5305;
                        int var122 = (this.field5307 * var117 + this.field5306 * var116 + this.field5303 * var115 >> 15) + this.field5313;
                        arg4[var75] = this.field5310.field1013 * var121 / this.field5308 + arg3.field2667;
                        arg5[var75] = this.field5310.field1042 * var122 / this.field5308 + arg3.field2658;
                    }
                }
                if (var64.field5293 != null) {
                    int var76 = this.field5298[arg0][arg1];
                    int var77 = this.field5298[arg0 + 1][arg1];
                    int var78 = this.field5298[arg0][arg1 + 1];
                    int var79 = super.field534 * arg0;
                    int var80 = super.field534 + var79;
                    int var81 = super.field534 * arg1;
                    int var82 = super.field534 + var81;
                    int var83 = (this.field5312 * var81 + this.field5316 * var76 + this.field5296 * var79 >> 15) + this.field5305;
                    int var84 = (this.field5307 * var81 + this.field5306 * var76 + this.field5303 * var79 >> 15) + this.field5313;
                    int var85 = (this.field5300 * var81 + this.field5315 * var76 + this.field5301 * var79 >> 15) + this.field5317;
                    int var86 = (this.field5312 * var81 + this.field5316 * var77 + this.field5296 * var80 >> 15) + this.field5305;
                    int var87 = (this.field5307 * var81 + this.field5306 * var77 + this.field5303 * var80 >> 15) + this.field5313;
                    int var88 = (this.field5300 * var81 + this.field5315 * var77 + this.field5301 * var80 >> 15) + this.field5317;
                    int var89 = (this.field5312 * var82 + this.field5316 * var78 + this.field5296 * var79 >> 15) + this.field5305;
                    int var90 = (this.field5307 * var82 + this.field5306 * var78 + this.field5303 * var79 >> 15) + this.field5313;
                    int var91 = (this.field5300 * var82 + this.field5315 * var78 + this.field5301 * var79 >> 15) + this.field5317;
                    for (int var92 = 0; var92 < var64.field5290; ++var92) {
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
                            arg3.field2659 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field2663 || var97 > arg3.field2663 || var98 > arg3.field2663;
                            short var103 = var64.field5293[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method2276(this.field5310.field2449.method935(var103, -8037).field3109)) {
                                    arg3.field2662 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method1244(var99, var100, var101, var96, var97, var98, this.field5310.field1038, arg6[var93], arg6[var94], arg6[var95], var64.field5295[var93], var64.field5295[var94], var64.field5295[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field5295[var93] & 16777215) != 0) {
                                        arg3.method1242(var99, var100, var101, var96, var97, var98, class51.method370(arg6[var93] << 24 | this.field5310.field1038, var64.field5295[var93], (byte) 70), class51.method370(arg6[var94] << 24 | this.field5310.field1038, var64.field5295[var94], (byte) 70), class51.method370(arg6[var95] << 24 | this.field5310.field1038, var64.field5295[var95], (byte) 70));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method1251(var99, var100, var101, var96, var97, var98, var64.field5295[var93], var64.field5295[var94], var64.field5295[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field5295[var93] & 16777215) != 0) {
                                    arg3.method1242(var99, var100, var101, var96, var97, var98, var64.field5295[var93], var64.field5295[var94], var64.field5295[var95]);
                                }
                                arg3.field2662 = 0;
                            } else {
                                arg3.method1249(var99, var100, var101, var96, var97, var98, this.field5310.field1038);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field5290; ++var104) {
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
                        arg3.field2659 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field2663 || var109 > arg3.field2663 || var110 > arg3.field2663;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field5295[var105] & 16777215) != 0) {
                                    arg3.method1242(var111, var112, var113, var108, var109, var110, class13.method110(arg6[var105], 116, this.field5310.field1038, var64.field5295[var105]), class13.method110(arg6[var106], 112, this.field5310.field1038, var64.field5295[var106]), class13.method110(arg6[var107], 115, this.field5310.field1038, var64.field5295[var107]));
                                }
                            } else if ((var64.field5295[var105] & 16777215) != 0) {
                                arg3.method1242(var111, var112, var113, var108, var109, var110, var64.field5295[var105], var64.field5295[var106], var64.field5295[var107]);
                            }
                        } else {
                            arg3.method1249(var111, var112, var113, var108, var109, var110, this.field5310.field1038);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public final void method276(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ltj;[I)V")
    public final void method281(class131 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "(II)I")
    public final int method271(int arg0, int arg1) {
        return this.field5298[arg0][arg1];
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public final boolean method278(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }
}
