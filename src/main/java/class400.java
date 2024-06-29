import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class400 extends class251 {

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    private int field5311 = -1;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "Lfe;")
    private class150 field5330;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    private int field5310;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[[I")
    public int[][] field5322;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "[[B")
    private byte[][] field5318;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "[[B")
    private byte[][] field5331;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    private int field5313;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    private int field5314;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    private int field5315;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    private int field5316;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    private int field5319;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    private int field5320;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    private int field5321;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    private int field5323;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    private int field5324;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    private int field5325;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    private int field5326;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    private int field5328;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "[[Lmh;")
    private class110[][] field5317;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "[[Lwb;")
    private class134[][] field5327;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "[[Leg;")
    private class33[][] field5329;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "[[Lmg;")
    private class525[][] field5312;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "()V")
    public final void method1183() {
        this.field5318 = null;
        this.field5331 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lve;[I)V")
    public final void method1186(class182 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII[[ZLip;[I[I)V")
    private final void method2375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class320 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4118 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field5329[var16][var17] != null) {
                        class33 var18 = this.field5329[var16][var17];
                        if (var18.field534 != -1 && (var18.field533 & 2) == 0 && var18.field536 == -1) {
                            int var19 = this.field5330.method1038(var18.field534);
                            arg8.method1902(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class162.method1077(2, var19, var18.field531 & 65535), class162.method1077(2, var19, var18.field532 & 65535), class162.method1077(2, var19, var18.field537 & 65535));
                            arg8.method1902(var15, var15, var15 - var13, var14, var13 + var14, var14, class162.method1077(2, var19, var18.field535 & 65535), class162.method1077(2, var19, var18.field537 & 65535), class162.method1077(2, var19, var18.field532 & 65535));
                        } else if (var18.field536 == -1) {
                            arg8.method1902(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field531 & 65535, var18.field532 & 65535, var18.field537 & 65535);
                            arg8.method1902(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field535 & 65535, var18.field537 & 65535, var18.field532 & 65535);
                        } else {
                            int var20 = var18.field536;
                            arg8.method1902(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1902(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field5312[var16][var17] != null) {
                        class525 var21 = this.field5312[var16][var17];
                        for (int var22 = 0; var22 < var21.field7780; ++var22) {
                            arg9[var22] = var21.field7773[var22] * var13 / super.field3198 + var14;
                            arg10[var22] = var15 - var21.field7777[var22] * var13 / super.field3198;
                        }
                        for (int var23 = 0; var23 < var21.field7774; ++var23) {
                            short var24 = var21.field7772[var23];
                            short var25 = var21.field7782[var23];
                            short var26 = var21.field7771[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field7775 != null && var21.field7775[var23] != -1) {
                                int var33 = var21.field7775[var23];
                                arg8.method1902(var30, var31, var32, var27, var28, var29, class162.method1077(2, var33, var21.field7778[var24]), class162.method1077(2, var33, var21.field7778[var25]), class162.method1077(2, var33, var21.field7778[var26]));
                            } else if (var21.field7781 != null && var21.field7781[var23] != -1) {
                                int var34 = this.field5330.method1038(var21.field7781[var23]);
                                arg8.method1902(var30, var31, var32, var27, var28, var29, class162.method1077(2, var34, var21.field7778[var24]), class162.method1077(2, var34, var21.field7778[var25]), class162.method1077(2, var34, var21.field7778[var26]));
                            } else {
                                int var35 = var21.field7776[var23];
                                arg8.method1902(var30, var31, var32, var27, var28, var29, class162.method1077(2, var35, var21.field7778[var24]), class162.method1077(2, var35, var21.field7778[var25]), class162.method1077(2, var35, var21.field7778[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4118 = true;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lfe;IIII[[I[[II)V")
    public class400(class150 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5330 = arg0;
        this.field5310 = arg2;
        this.field5322 = arg5;
        this.field5318 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field5330.field1998 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field5330.field1991 * var18 + this.field5330.field2006 * var16 + this.field5330.field1982 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field5318[var11][var10] = (byte) var20;
            }
        }
        this.field5331 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "(Lj;IIIIZ)V")
    public final void method1170(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "(IILj;)Lj;")
    public final class254 method1180(int arg0, int arg1, class254 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1176(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field5329 == null) {
            this.field5329 = new class33[super.field3197][super.field3194];
            this.field5312 = new class525[super.field3197][super.field3194];
        } else if (this.field5317 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3198 != var20 || var21 != 0 && super.field3198 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class525 var22 = new class525();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field7780 = var23;
            var22.field7778 = new short[var23];
            var22.field7773 = new short[var23];
            var22.field7779 = new short[var23];
            var22.field7777 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field7778[var25] = (short) (this.field5318[arg0][arg1] - this.field5331[arg0][arg1]);
                } else if (var30 == 0 && super.field3198 == var31) {
                    var22.field7778[var25] = (short) (this.field5318[arg0][arg1 + 1] - this.field5331[arg0][arg1 + 1]);
                } else if (super.field3198 == var30 && super.field3198 == var31) {
                    var22.field7778[var25] = (short) (this.field5318[arg0 + 1][arg1 + 1] - this.field5331[arg0 + 1][arg1 + 1]);
                } else if (super.field3198 == var30 && var31 == 0) {
                    var22.field7778[var25] = (short) (this.field5318[arg0 + 1][arg1] - this.field5331[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field5318[arg0 + 1][arg1] - this.field5331[arg0 + 1][arg1]) * var30 + (this.field5318[arg0][arg1] - this.field5331[arg0][arg1]) * (super.field3198 - var30);
                    int var33 = (this.field5318[arg0 + 1][arg1 + 1] - this.field5331[arg0 + 1][arg1 + 1]) * var30 + (this.field5318[arg0][arg1 + 1] - this.field5331[arg0][arg1 + 1]) * (super.field3198 - var30);
                    var22.field7778[var25] = (short) ((super.field3198 - var31) * var32 + var31 * var33 >> super.field3193 * 2);
                }
                int var34 = (arg0 << super.field3193) + var30;
                int var35 = (arg1 << super.field3193) + var31;
                var22.field7773[var25] = (short) var30;
                var22.field7777[var25] = (short) var31;
                var22.field7779[var25] = (short) (this.method1185(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field7778[var25] < 2) {
                    var22.field7778[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field5330.field1765.method460(-26282, arg11[var28]).field7335) {
                    var26 = true;
                }
            }
            var22.field7776 = new int[var27];
            if (arg10 != null) {
                var22.field7775 = new int[var27];
            }
            var22.field7772 = new short[var27];
            var22.field7782 = new short[var27];
            var22.field7771 = new short[var27];
            if (var26) {
                var22.field7781 = new short[var27];
                var22.field7770 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field7776[var22.field7774] = class339.method1998(arg9[var29], (byte) 30);
                    } else {
                        var22.field7776[var22.field7774] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field7775[var22.field7774] = class339.method1998(arg10[var29], (byte) 30);
                        } else {
                            var22.field7775[var22.field7774] = -1;
                        }
                    }
                    var22.field7772[var22.field7774] = (short) arg6[var29];
                    var22.field7782[var22.field7774] = (short) arg7[var29];
                    var22.field7771[var22.field7774] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field5330.field1765.method460(-26282, arg11[var29]).field7335) {
                            var22.field7781[var22.field7774] = (short) arg11[var29];
                            var22.field7770[var22.field7774] = (short) arg12[var29];
                        } else {
                            var22.field7781[var22.field7774] = -1;
                        }
                    }
                    ++var22.field7774;
                }
            }
            this.field5312[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class33 var36 = new class33();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field536 = class162.method1077(2, class339.method1998(arg10[0], (byte) 30), this.field5318[arg0][arg1] - this.field5331[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field533 = (byte) (var36.field533 | 2);
                    }
                }
                if (this.field5322[arg0 + 1][arg1] == this.field5322[arg0][arg1] && this.field5322[arg0 + 1][arg1 + 1] == this.field5322[arg0][arg1] && this.field5322[arg0][arg1 + 1] == this.field5322[arg0][arg1]) {
                    var36.field533 = (byte) (var36.field533 | 1);
                }
                if (var38 != -1 && (var36.field533 & 2) == 0 && !this.field5330.field1765.method460(-26282, var38).field7335) {
                    var36.field535 = (short) (this.field5318[arg0][arg1] - this.field5331[arg0][arg1]);
                    var36.field537 = (short) (this.field5318[arg0 + 1][arg1] - this.field5331[arg0 + 1][arg1]);
                    var36.field531 = (short) (this.field5318[arg0 + 1][arg1 + 1] - this.field5331[arg0 + 1][arg1 + 1]);
                    var36.field532 = (short) (this.field5318[arg0][arg1 + 1] - this.field5331[arg0][arg1 + 1]);
                    var36.field534 = (short) var38;
                } else {
                    short var39 = class339.method1998(var37, (byte) 30);
                    var36.field535 = (short) class162.method1077(2, var39, this.field5318[arg0][arg1] - this.field5331[arg0][arg1]);
                    var36.field537 = (short) class162.method1077(2, var39, this.field5318[arg0 + 1][arg1] - this.field5331[arg0 + 1][arg1]);
                    var36.field531 = (short) class162.method1077(2, var39, this.field5318[arg0 + 1][arg1 + 1] - this.field5331[arg0 + 1][arg1 + 1]);
                    var36.field532 = (short) class162.method1077(2, var39, this.field5318[arg0][arg1 + 1] - this.field5331[arg0][arg1 + 1]);
                    var36.field534 = -1;
                }
                this.field5329[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "(II)I")
    public final int method1187(int arg0, int arg1) {
        return this.field5322[arg0][arg1];
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public final boolean method1172(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!uh", name = "va", descriptor = "(II)I")
    public final int method1185(int arg0, int arg1) {
        int var3 = arg0 >> super.field3193;
        int var4 = arg1 >> super.field3193;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field3197 - 1 && var4 <= super.field3194 - 1) {
            int var5 = arg0 & super.field3198 - 1;
            int var6 = arg1 & super.field3198 - 1;
            int var7 = (super.field3198 - var5) * this.field5322[var3][var4] + this.field5322[var3 + 1][var4] * var5 >> super.field3193;
            int var8 = (super.field3198 - var5) * this.field5322[var3][var4 + 1] + this.field5322[var3 + 1][var4 + 1] * var5 >> super.field3193;
            return (super.field3198 - var6) * var7 + var6 * var8 >> super.field3193;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1175(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field5317 == null) {
            this.field5317 = new class110[super.field3197][super.field3194];
            this.field5327 = new class134[super.field3197][super.field3194];
        } else if (this.field5329 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class272.field3455[class339.method1998(arg6[var15], (byte) 30) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class272.field3455[class339.method1998(arg7[var16], (byte) 30) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field3198 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field3198 && arg4[var22] == super.field3198) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field3198) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field3198 != arg2[var24] && arg2[0] - super.field3198 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field3198 != arg4[var24] && arg4[0] - super.field3198 != arg4[var24]) {
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
                class110 var25 = new class110();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field1530 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field1527 = (byte) (var25.field1527 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field5322[arg0 + 1][arg1] == this.field5322[arg0][arg1] && this.field5322[arg0 + 1][arg1 + 1] == this.field5322[arg0][arg1] && this.field5322[arg0][arg1 + 1] == this.field5322[arg0][arg1]) {
                    var25.field1527 = (byte) (var25.field1527 | 1);
                }
                if (var27 != -1 && (var25.field1527 & 2) == 0 && !this.field5330.field1765.method460(-26282, var27).field7335) {
                    var25.field1521 = this.field5318[arg0][arg1] - this.field5331[arg0][arg1];
                    var25.field1525 = this.field5318[arg0 + 1][arg1] - this.field5331[arg0 + 1][arg1];
                    var25.field1520 = this.field5318[arg0 + 1][arg1 + 1] - this.field5331[arg0 + 1][arg1 + 1];
                    var25.field1522 = this.field5318[arg0][arg1 + 1] - this.field5331[arg0][arg1 + 1];
                    var25.field1523 = (short) var27;
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
                    var25.field1521 = class520.method3095(var28, method2376(arg6[var18] >> 8, this.field5318[arg0][arg1] - this.field5331[arg0][arg1]), arg10, (byte) -47);
                    if (var25.field1530 != 0) {
                        var25.field1521 |= 255 - (this.field5318[arg0][arg1] - this.field5331[arg0][arg1]) << 25;
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
                    var25.field1525 = class520.method3095(var29, method2376(arg6[var19] >> 8, this.field5318[arg0 + 1][arg1] - this.field5331[arg0 + 1][arg1]), arg10, (byte) -47);
                    if (var25.field1530 != 0) {
                        var25.field1525 |= 255 - (this.field5318[arg0 + 1][arg1] - this.field5331[arg0 + 1][arg1]) << 25;
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
                    var25.field1520 = class520.method3095(var30, method2376(arg6[var20] >> 8, this.field5318[arg0 + 1][arg1 + 1] - this.field5331[arg0 + 1][arg1 + 1]), arg10, (byte) -47);
                    if (var25.field1530 != 0) {
                        var25.field1520 |= 255 - (this.field5318[arg0 + 1][arg1 + 1] - this.field5331[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field1522 = class520.method3095(var31, method2376(arg6[var21] >> 8, this.field5318[arg0][arg1 + 1] - this.field5331[arg0][arg1 + 1]), arg10, (byte) -47);
                    if (var25.field1530 != 0) {
                        var25.field1522 |= 255 - (this.field5318[arg0][arg1 + 1] - this.field5331[arg0][arg1 + 1]) << 25;
                    }
                    var25.field1523 = -1;
                }
                if (arg5 != null) {
                    var25.field1526 = (short) arg5[var20];
                    var25.field1524 = (short) arg5[var21];
                    var25.field1529 = (short) arg5[var19];
                    var25.field1528 = (short) arg5[var18];
                }
                this.field5317[arg0][arg1] = var25;
            } else {
                class134 var32 = new class134();
                var32.field1817 = (short) arg2.length;
                var32.field1822 = (short) (arg2.length / 3);
                var32.field1819 = new short[var32.field1817];
                var32.field1818 = new short[var32.field1817];
                var32.field1815 = new short[var32.field1817];
                var32.field1820 = new int[var32.field1817];
                if (arg5 != null) {
                    var32.field1816 = new short[var32.field1817];
                }
                for (int var33 = 0; var33 < var32.field1817; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field5318[arg0][arg1] - this.field5331[arg0][arg1];
                    } else if (var48 == 0 && super.field3198 == var49) {
                        var51 = this.field5318[arg0][arg1 + 1] - this.field5331[arg0][arg1 + 1];
                    } else if (super.field3198 == var48 && super.field3198 == var49) {
                        var51 = this.field5318[arg0 + 1][arg1 + 1] - this.field5331[arg0 + 1][arg1 + 1];
                    } else if (super.field3198 == var48 && var49 == 0) {
                        var51 = this.field5318[arg0 + 1][arg1] - this.field5331[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field5318[arg0 + 1][arg1] - this.field5331[arg0 + 1][arg1]) * var48 + (this.field5318[arg0][arg1] - this.field5331[arg0][arg1]) * (super.field3198 - var48);
                        int var53 = (this.field5318[arg0 + 1][arg1 + 1] - this.field5331[arg0 + 1][arg1 + 1]) * var48 + (this.field5318[arg0][arg1 + 1] - this.field5331[arg0][arg1 + 1]) * (super.field3198 - var48);
                        var51 = (super.field3198 - var49) * var52 + var49 * var53 >> super.field3193 * 2;
                    }
                    int var54 = (arg0 << super.field3193) + var48;
                    int var55 = (arg1 << super.field3193) + var49;
                    var32.field1819[var33] = (short) var48;
                    var32.field1815[var33] = (short) var49;
                    var32.field1818[var33] = (short) (this.method1185(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field5330.field1765.method460(-26282, arg8[var33]).field7335) {
                        var32.field1820[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field1820[var33] = var51 << 25;
                        } else {
                            var32.field1820[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field1816[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field1820[var33] = class520.method3095(var56, method2376(arg6[var33] >> 8, var51), arg10, (byte) -47);
                        if (arg7 != null) {
                            var32.field1820[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field1822; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field5330.field1765.method460(-26282, arg8[var35 * 3]).field7335) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field1823 = new int[var32.field1822];
                }
                if (var34) {
                    var32.field1824 = new short[var32.field1822];
                    var32.field1821 = new short[var32.field1822];
                }
                for (int var36 = 0; var36 < var32.field1822; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field1823[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field5330.field1765.method460(-26282, var42).field7335) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field5330.field1765.method460(-26282, var43).field7335) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field5330.field1765.method460(-26282, var44).field7335) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field1824[var36] = (short) var44;
                            var32.field1821[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field5330.field1765.method460(-26282, var45).field7335) {
                                    var32.field1820[var37] = class272.field3455[class339.method1998(this.field5330.field1765.method460(-26282, var45).field7344 & 65535, (byte) 30) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field5330.field1765.method460(-26282, var46).field7335) {
                                    var32.field1820[var38] = class272.field3455[class339.method1998(this.field5330.field1765.method460(-26282, var46).field7344 & 65535, (byte) 30) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field5330.field1765.method460(-26282, var47).field7335) {
                                    var32.field1820[var39] = class272.field3455[class339.method1998(this.field5330.field1765.method460(-26282, var47).field7344 & 65535, (byte) 30) & 65535];
                                }
                            }
                            var32.field1824[var36] = -1;
                        }
                    }
                }
                this.field5327[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)I")
    private static final int method2376(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!uh", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public final void method1181(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z")
    private final boolean method2377(int arg0) {
        if ((this.field5310 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    public final void method1174(int arg0, int arg1) {
        class115 var3 = this.field5330.method1039(Thread.currentThread());
        var3.field1567.field4121 = 0;
        if (this.field5317 != null) {
            this.method2379(arg0, arg1, this.field5330.field1993, var3.field1567, var3.field1620, var3.field1587, var3.field1603);
        } else {
            if (this.field5329 != null) {
                this.method2380(arg0, arg1, var3.field1567, var3.field1620, var3.field1587, var3.field1603);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(IIIIIII[[ZLip;[I[I)V")
    private final void method2378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class320 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4118 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field5317[var16][var17] != null) {
                        class110 var18 = this.field5317[var16][var17];
                        if (var18.field1523 != -1 && (var18.field1527 & 2) == 0 && var18.field1530 == 0) {
                            int var19 = this.field5330.method1038(var18.field1523);
                            arg8.method1902(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class162.method1077(2, var19, var18.field1520), class162.method1077(2, var19, var18.field1522), class162.method1077(2, var19, var18.field1525));
                            arg8.method1902(var15, var15, var15 - var13, var14, var13 + var14, var14, class162.method1077(2, var19, var18.field1521), class162.method1077(2, var19, var18.field1525), class162.method1077(2, var19, var18.field1522));
                        } else if (var18.field1530 == 0) {
                            arg8.method1915(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field1520, var18.field1522, var18.field1525);
                            arg8.method1915(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field1521, var18.field1525, var18.field1522);
                        } else {
                            int var20 = var18.field1530;
                            arg8.method1915(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class483.method2895(var18.field1520 & -16777216, var20, -16711936), class483.method2895(var18.field1522 & -16777216, var20, -16711936), class483.method2895(var18.field1525 & -16777216, var20, -16711936));
                            arg8.method1915(var15, var15, var15 - var13, var14, var13 + var14, var14, class483.method2895(var18.field1521 & -16777216, var20, -16711936), class483.method2895(var18.field1525 & -16777216, var20, -16711936), class483.method2895(var18.field1522 & -16777216, var20, -16711936));
                        }
                    } else if (this.field5327[var16][var17] != null) {
                        class134 var21 = this.field5327[var16][var17];
                        for (int var22 = 0; var22 < var21.field1817; ++var22) {
                            arg9[var22] = var21.field1819[var22] * var13 / super.field3198 + var14;
                            arg10[var22] = var15 - var21.field1815[var22] * var13 / super.field3198;
                        }
                        for (int var23 = 0; var23 < var21.field1822; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1823 == null || var21.field1823[var23] == 0 || var21.field1824 != null && (var21.field1824 == null || var21.field1824[var23] != -1)) {
                                if (var21.field1824 != null && var21.field1824[var23] != -1) {
                                    int var34 = this.field5330.method1038(var21.field1824[var23]);
                                    arg8.method1902(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method1915(var30, var31, var32, var27, var28, var29, var21.field1820[var24], var21.field1820[var25], var21.field1820[var26]);
                                }
                            } else {
                                int var33 = var21.field1823[var23];
                                arg8.method1915(var30, var31, var32, var27, var28, var29, class483.method2895(-16777216 - (var21.field1820[var24] & -16777216), var33, -16711936), class483.method2895(-16777216 - (var21.field1820[var25] & -16777216), var33, -16711936), class483.method2895(-16777216 - (var21.field1820[var26] & -16777216), var33, -16711936));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4118 = true;
    }

    @OriginalMember(owner = "client!uh", name = "QA", descriptor = "(III)V")
    public final void method1182(int arg0, int arg1, int arg2) {
        if (this.field5331[arg0][arg1] < arg2) {
            this.field5331[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1177(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class155 var6 = this.field5330.field1999;
        this.field5311 = -1;
        this.field5328 = var6.field2051;
        this.field5314 = var6.field2060;
        this.field5315 = var6.field2054;
        this.field5320 = var6.field2057;
        this.field5324 = var6.field2055;
        this.field5326 = var6.field2052;
        this.field5316 = var6.field2058;
        this.field5319 = var6.field2050;
        this.field5313 = var6.field2059;
        this.field5325 = var6.field2056;
        this.field5323 = var6.field2061;
        this.field5321 = var6.field2053;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class115 var9 = this.field5330.method1039(Thread.currentThread());
        class320 var10 = var9.field1567;
        var10.field4121 = 0;
        var10.field4124 = false;
        if (this.field5317 != null) {
            this.method2378(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1620, var9.field1587);
        } else {
            if (this.field5329 != null) {
                this.method2375(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1620, var9.field1587);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZLip;[I[I[I)V")
    private final void method2379(int arg0, int arg1, boolean arg2, class320 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class110 var8 = this.field5317[arg0][arg1];
        if (var8 != null) {
            if ((var8.field1527 & 2) == 0) {
                int var9 = super.field3198 * arg0;
                int var10 = super.field3198 + var9;
                int var11 = super.field3198 * arg1;
                int var12 = super.field3198 + var11;
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
                if ((var8.field1527 & 1) != 0 && !arg2) {
                    int var17 = this.field5322[arg0][arg1];
                    if (this.field5311 == -1) {
                        int var18 = this.field5325 * var17;
                        var19 = (this.field5323 * var11 + this.field5313 * var9 + var18 >> 15) + this.field5321;
                        if (var19 <= this.field5330.field2000) {
                            return;
                        }
                        var20 = (this.field5323 * var11 + this.field5313 * var10 + var18 >> 15) + this.field5321;
                        if (var20 <= this.field5330.field2000) {
                            return;
                        }
                        var21 = (this.field5323 * var12 + this.field5313 * var10 + var18 >> 15) + this.field5321;
                        if (var21 <= this.field5330.field2000) {
                            return;
                        }
                        var22 = (this.field5323 * var12 + this.field5313 * var9 + var18 >> 15) + this.field5321;
                        if (var22 <= this.field5330.field2000) {
                            return;
                        }
                    } else {
                        var22 = this.field5311;
                        var21 = this.field5311;
                        var20 = this.field5311;
                        var19 = this.field5311;
                    }
                    if (this.field5330.field1994) {
                        int var23 = var19 - this.field5330.field1989;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field5330.field1989;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field5330.field1989;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field5330.field1989;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field5314 * var17;
                    int var28 = this.field5326 * var17;
                    var29 = (this.field5315 * var11 + this.field5328 * var9 + var27 >> 15) + this.field5320;
                    var30 = this.field5330.field2005 * var29 / var19 + arg3.field4114;
                    var31 = (this.field5316 * var11 + this.field5324 * var9 + var28 >> 15) + this.field5319;
                    var32 = this.field5330.field1984 * var31 / var19 + arg3.field4119;
                    var33 = (this.field5315 * var11 + this.field5328 * var10 + var27 >> 15) + this.field5320;
                    var34 = this.field5330.field2005 * var33 / var20 + arg3.field4114;
                    var35 = (this.field5316 * var11 + this.field5324 * var10 + var28 >> 15) + this.field5319;
                    var36 = this.field5330.field1984 * var35 / var20 + arg3.field4119;
                    var37 = (this.field5315 * var12 + this.field5328 * var10 + var27 >> 15) + this.field5320;
                    var38 = this.field5330.field2005 * var37 / var21 + arg3.field4114;
                    var39 = (this.field5316 * var12 + this.field5324 * var10 + var28 >> 15) + this.field5319;
                    var40 = this.field5330.field1984 * var39 / var21 + arg3.field4119;
                    var41 = (this.field5315 * var12 + this.field5328 * var9 + var27 >> 15) + this.field5320;
                    var42 = this.field5330.field2005 * var41 / var22 + arg3.field4114;
                    var43 = (this.field5316 * var12 + this.field5324 * var9 + var28 >> 15) + this.field5319;
                    var44 = this.field5330.field1984 * var43 / var22 + arg3.field4119;
                } else {
                    int var45 = this.field5322[arg0][arg1];
                    int var46 = this.field5322[arg0 + 1][arg1];
                    int var47 = this.field5322[arg0 + 1][arg1 + 1];
                    int var48 = this.field5322[arg0][arg1 + 1];
                    if (this.field5311 == -1) {
                        var19 = (this.field5323 * var11 + this.field5325 * var45 + this.field5313 * var9 >> 15) + this.field5321;
                        if (var19 <= this.field5330.field2000) {
                            return;
                        }
                        var20 = (this.field5323 * var11 + this.field5325 * var46 + this.field5313 * var10 >> 15) + this.field5321;
                        if (var20 <= this.field5330.field2000) {
                            return;
                        }
                        var21 = (this.field5323 * var12 + this.field5325 * var47 + this.field5313 * var10 >> 15) + this.field5321;
                        if (var21 <= this.field5330.field2000) {
                            return;
                        }
                        var22 = (this.field5323 * var12 + this.field5325 * var48 + this.field5313 * var9 >> 15) + this.field5321;
                        if (var22 <= this.field5330.field2000) {
                            return;
                        }
                    } else {
                        var22 = this.field5311;
                        var21 = this.field5311;
                        var20 = this.field5311;
                        var19 = this.field5311;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field5330.field1989;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field1528 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field5330.field1989;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field1529 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field5330.field1989;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field1526 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field5330.field1989;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field1524 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field5330.field1994) {
                        int var57 = var19 - this.field5330.field1989;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field5330.field1989;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field5330.field1989;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field5330.field1989;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field5315 * var11 + this.field5328 * var9 + this.field5314 * var45 >> 15) + this.field5320;
                    var30 = this.field5330.field2005 * var29 / var19 + arg3.field4114;
                    var31 = (this.field5316 * var11 + this.field5326 * var45 + this.field5324 * var9 >> 15) + this.field5319;
                    var32 = this.field5330.field1984 * var31 / var19 + arg3.field4119;
                    var33 = (this.field5315 * var11 + this.field5328 * var10 + this.field5314 * var46 >> 15) + this.field5320;
                    var34 = this.field5330.field2005 * var33 / var20 + arg3.field4114;
                    var35 = (this.field5316 * var11 + this.field5326 * var46 + this.field5324 * var10 >> 15) + this.field5319;
                    var36 = this.field5330.field1984 * var35 / var20 + arg3.field4119;
                    var37 = (this.field5315 * var12 + this.field5328 * var10 + this.field5314 * var47 >> 15) + this.field5320;
                    var38 = this.field5330.field2005 * var37 / var21 + arg3.field4114;
                    var39 = (this.field5316 * var12 + this.field5326 * var47 + this.field5324 * var10 >> 15) + this.field5319;
                    var40 = this.field5330.field1984 * var39 / var21 + arg3.field4119;
                    var41 = (this.field5315 * var12 + this.field5328 * var9 + this.field5314 * var48 >> 15) + this.field5320;
                    var42 = this.field5330.field2005 * var41 / var22 + arg3.field4114;
                    var43 = (this.field5316 * var12 + this.field5326 * var48 + this.field5324 * var9 >> 15) + this.field5319;
                    var44 = this.field5330.field1984 * var43 / var22 + arg3.field4119;
                }
                boolean var61 = var8.field1523 != -1 && this.method2377(this.field5330.field1765.method460(-26282, var8.field1523).field7352);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field4124 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field4122 || var42 > arg3.field4122 || var34 > arg3.field4122;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field4121 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field1523 >= 0) {
                                arg3.method1904(var40, var44, var36, var38, var42, var34, this.field5330.field1986, var15, var16, var14, var8.field1520, var8.field1522, var8.field1525, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1523);
                            } else {
                                arg3.method1915(var40, var44, var36, var38, var42, var34, class483.method2895(var15 << 24 | this.field5330.field1986, var8.field1520, -16711936), class483.method2895(var16 << 24 | this.field5330.field1986, var8.field1522, -16711936), class483.method2895(var14 << 24 | this.field5330.field1986, var8.field1525, -16711936));
                            }
                        } else if (var8.field1523 >= 0) {
                            arg3.method1908(var40, var44, var36, var38, var42, var34, var8.field1520, var8.field1522, var8.field1525, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1523);
                        } else {
                            arg3.method1915(var40, var44, var36, var38, var42, var34, var8.field1520, var8.field1522, var8.field1525);
                        }
                        arg3.field4121 = 0;
                    } else {
                        arg3.method1906(var40, var44, var36, var38, var42, var34, this.field5330.field1986);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field4124 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field4122 || var34 > arg3.field4122 || var42 > arg3.field4122;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field4121 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field1523 >= 0) {
                                arg3.method1904(var32, var36, var44, var30, var34, var42, this.field5330.field1986, var13, var14, var16, var8.field1521, var8.field1525, var8.field1522, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1523);
                            } else {
                                arg3.method1915(var32, var36, var44, var30, var34, var42, class483.method2895(var13 << 24 | this.field5330.field1986, var8.field1521, -16711936), class483.method2895(var14 << 24 | this.field5330.field1986, var8.field1525, -16711936), class483.method2895(var16 << 24 | this.field5330.field1986, var8.field1522, -16711936));
                            }
                        } else if (var8.field1523 >= 0) {
                            arg3.method1908(var32, var36, var44, var30, var34, var42, var8.field1521, var8.field1525, var8.field1522, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1523);
                        } else {
                            arg3.method1915(var32, var36, var44, var30, var34, var42, var8.field1521, var8.field1525, var8.field1522);
                        }
                        arg3.field4121 = 0;
                        return;
                    }
                    arg3.method1906(var32, var36, var44, var30, var34, var42, this.field5330.field1986);
                }
            }
        } else {
            class134 var64 = this.field5327[arg0][arg1];
            if (var64 != null) {
                if (this.field5311 == -1) {
                    for (int var65 = 0; var65 < var64.field1817; ++var65) {
                        int var66 = (arg0 << super.field3193) + var64.field1819[var65];
                        int var67 = var64.field1818[var65];
                        int var68 = (arg1 << super.field3193) + var64.field1815[var65];
                        int var69 = (this.field5323 * var68 + this.field5325 * var67 + this.field5313 * var66 >> 15) + this.field5321;
                        if (var69 <= this.field5330.field2000) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field5330.field1989;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field1816[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field5330.field1994) {
                            int var72 = var69 - this.field5330.field1989;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field5315 * var68 + this.field5328 * var66 + this.field5314 * var67 >> 15) + this.field5320;
                        int var74 = (this.field5316 * var68 + this.field5326 * var67 + this.field5324 * var66 >> 15) + this.field5319;
                        arg4[var65] = this.field5330.field2005 * var73 / var69 + arg3.field4114;
                        arg5[var65] = this.field5330.field1984 * var74 / var69 + arg3.field4119;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field1817; ++var75) {
                        int var115 = (arg0 << super.field3193) + var64.field1819[var75];
                        int var116 = var64.field1818[var75];
                        int var117 = (arg1 << super.field3193) + var64.field1815[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field5311 - this.field5330.field1989;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field1816[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field5330.field1994) {
                            int var120 = this.field5311 - this.field5330.field1989;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field5315 * var117 + this.field5328 * var115 + this.field5314 * var116 >> 15) + this.field5320;
                        int var122 = (this.field5316 * var117 + this.field5326 * var116 + this.field5324 * var115 >> 15) + this.field5319;
                        arg4[var75] = this.field5330.field2005 * var121 / this.field5311 + arg3.field4114;
                        arg5[var75] = this.field5330.field1984 * var122 / this.field5311 + arg3.field4119;
                    }
                }
                if (var64.field1824 != null) {
                    int var76 = this.field5322[arg0][arg1];
                    int var77 = this.field5322[arg0 + 1][arg1];
                    int var78 = this.field5322[arg0][arg1 + 1];
                    int var79 = super.field3198 * arg0;
                    int var80 = super.field3198 + var79;
                    int var81 = super.field3198 * arg1;
                    int var82 = super.field3198 + var81;
                    int var83 = (this.field5315 * var81 + this.field5328 * var79 + this.field5314 * var76 >> 15) + this.field5320;
                    int var84 = (this.field5316 * var81 + this.field5326 * var76 + this.field5324 * var79 >> 15) + this.field5319;
                    int var85 = (this.field5323 * var81 + this.field5325 * var76 + this.field5313 * var79 >> 15) + this.field5321;
                    int var86 = (this.field5315 * var81 + this.field5328 * var80 + this.field5314 * var77 >> 15) + this.field5320;
                    int var87 = (this.field5316 * var81 + this.field5326 * var77 + this.field5324 * var80 >> 15) + this.field5319;
                    int var88 = (this.field5323 * var81 + this.field5325 * var77 + this.field5313 * var80 >> 15) + this.field5321;
                    int var89 = (this.field5315 * var82 + this.field5328 * var79 + this.field5314 * var78 >> 15) + this.field5320;
                    int var90 = (this.field5316 * var82 + this.field5326 * var78 + this.field5324 * var79 >> 15) + this.field5319;
                    int var91 = (this.field5323 * var82 + this.field5325 * var78 + this.field5313 * var79 >> 15) + this.field5321;
                    for (int var92 = 0; var92 < var64.field1822; ++var92) {
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
                            arg3.field4124 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field4122 || var97 > arg3.field4122 || var98 > arg3.field4122;
                            short var103 = var64.field1824[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method2377(this.field5330.field1765.method460(-26282, var103).field7352)) {
                                    arg3.field4121 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method1904(var99, var100, var101, var96, var97, var98, this.field5330.field1986, arg6[var93], arg6[var94], arg6[var95], var64.field1820[var93], var64.field1820[var94], var64.field1820[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field1820[var93] & 16777215) != 0) {
                                        arg3.method1915(var99, var100, var101, var96, var97, var98, class483.method2895(arg6[var93] << 24 | this.field5330.field1986, var64.field1820[var93], -16711936), class483.method2895(arg6[var94] << 24 | this.field5330.field1986, var64.field1820[var94], -16711936), class483.method2895(arg6[var95] << 24 | this.field5330.field1986, var64.field1820[var95], -16711936));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method1908(var99, var100, var101, var96, var97, var98, var64.field1820[var93], var64.field1820[var94], var64.field1820[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field1820[var93] & 16777215) != 0) {
                                    arg3.method1915(var99, var100, var101, var96, var97, var98, var64.field1820[var93], var64.field1820[var94], var64.field1820[var95]);
                                }
                                arg3.field4121 = 0;
                            } else {
                                arg3.method1906(var99, var100, var101, var96, var97, var98, this.field5330.field1986);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field1822; ++var104) {
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
                        arg3.field4124 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field4122 || var109 > arg3.field4122 || var110 > arg3.field4122;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field1820[var105] & 16777215) != 0) {
                                    arg3.method1915(var111, var112, var113, var108, var109, var110, class520.method3095(arg6[var105], var64.field1820[var105], this.field5330.field1986, (byte) -47), class520.method3095(arg6[var106], var64.field1820[var106], this.field5330.field1986, (byte) -47), class520.method3095(arg6[var107], var64.field1820[var107], this.field5330.field1986, (byte) -47));
                                }
                            } else if ((var64.field1820[var105] & 16777215) != 0) {
                                arg3.method1915(var111, var112, var113, var108, var109, var110, var64.field1820[var105], var64.field1820[var106], var64.field1820[var107]);
                            }
                        } else {
                            arg3.method1906(var111, var112, var113, var108, var109, var110, this.field5330.field1986);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILip;[I[I[I)V")
    private final void method2380(int arg0, int arg1, class320 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class33 var7 = this.field5329[arg0][arg1];
        if (var7 != null) {
            if ((var7.field533 & 2) == 0) {
                int var8 = super.field3198 * arg0;
                int var9 = super.field3198 + var8;
                int var10 = super.field3198 * arg1;
                int var11 = super.field3198 + var10;
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
                if ((var7.field533 & 1) != 0) {
                    int var12 = this.field5322[arg0][arg1];
                    int var16;
                    if (this.field5311 == -1) {
                        int var13 = this.field5325 * var12;
                        var14 = (this.field5323 * var10 + this.field5313 * var8 + var13 >> 15) + this.field5321;
                        if (var14 <= this.field5330.field2000) {
                            return;
                        }
                        var15 = (this.field5323 * var10 + this.field5313 * var9 + var13 >> 15) + this.field5321;
                        if (var15 <= this.field5330.field2000) {
                            return;
                        }
                        var16 = (this.field5323 * var11 + this.field5313 * var9 + var13 >> 15) + this.field5321;
                        if (var16 <= this.field5330.field2000) {
                            return;
                        }
                        var17 = (this.field5323 * var11 + this.field5313 * var8 + var13 >> 15) + this.field5321;
                        if (var17 <= this.field5330.field2000) {
                            return;
                        }
                    } else {
                        var17 = this.field5311;
                        var16 = this.field5311;
                        var15 = this.field5311;
                        var14 = this.field5311;
                    }
                    int var18 = this.field5314 * var12;
                    int var19 = this.field5326 * var12;
                    var20 = (this.field5315 * var10 + this.field5328 * var8 + var18 >> 15) + this.field5320;
                    var21 = this.field5330.field2005 * var20 / var14 + arg2.field4114;
                    var22 = (this.field5316 * var10 + this.field5324 * var8 + var19 >> 15) + this.field5319;
                    var23 = this.field5330.field1984 * var22 / var14 + arg2.field4119;
                    var24 = (this.field5315 * var10 + this.field5328 * var9 + var18 >> 15) + this.field5320;
                    var25 = this.field5330.field2005 * var24 / var15 + arg2.field4114;
                    var26 = (this.field5316 * var10 + this.field5324 * var9 + var19 >> 15) + this.field5319;
                    var27 = this.field5330.field1984 * var26 / var15 + arg2.field4119;
                    int var28 = (this.field5315 * var11 + this.field5328 * var9 + var18 >> 15) + this.field5320;
                    var29 = this.field5330.field2005 * var28 / var16 + arg2.field4114;
                    int var30 = (this.field5316 * var11 + this.field5324 * var9 + var19 >> 15) + this.field5319;
                    var31 = this.field5330.field1984 * var30 / var16 + arg2.field4119;
                    var32 = (this.field5315 * var11 + this.field5328 * var8 + var18 >> 15) + this.field5320;
                    var33 = this.field5330.field2005 * var32 / var17 + arg2.field4114;
                    var34 = (this.field5316 * var11 + this.field5324 * var8 + var19 >> 15) + this.field5319;
                    var35 = this.field5330.field1984 * var34 / var17 + arg2.field4119;
                } else {
                    int var36 = this.field5322[arg0][arg1];
                    int var37 = this.field5322[arg0 + 1][arg1];
                    int var38 = this.field5322[arg0 + 1][arg1 + 1];
                    int var39 = this.field5322[arg0][arg1 + 1];
                    int var40;
                    if (this.field5311 == -1) {
                        var14 = (this.field5323 * var10 + this.field5325 * var36 + this.field5313 * var8 >> 15) + this.field5321;
                        if (var14 <= this.field5330.field2000) {
                            return;
                        }
                        var15 = (this.field5323 * var10 + this.field5325 * var37 + this.field5313 * var9 >> 15) + this.field5321;
                        if (var15 <= this.field5330.field2000) {
                            return;
                        }
                        var40 = (this.field5323 * var11 + this.field5325 * var38 + this.field5313 * var9 >> 15) + this.field5321;
                        if (var40 <= this.field5330.field2000) {
                            return;
                        }
                        var17 = (this.field5323 * var11 + this.field5325 * var39 + this.field5313 * var8 >> 15) + this.field5321;
                        if (var17 <= this.field5330.field2000) {
                            return;
                        }
                    } else {
                        var17 = this.field5311;
                        var40 = this.field5311;
                        var15 = this.field5311;
                        var14 = this.field5311;
                    }
                    var20 = (this.field5315 * var10 + this.field5328 * var8 + this.field5314 * var36 >> 15) + this.field5320;
                    var21 = this.field5330.field2005 * var20 / var14 + arg2.field4114;
                    var22 = (this.field5316 * var10 + this.field5326 * var36 + this.field5324 * var8 >> 15) + this.field5319;
                    var23 = this.field5330.field1984 * var22 / var14 + arg2.field4119;
                    var24 = (this.field5315 * var10 + this.field5328 * var9 + this.field5314 * var37 >> 15) + this.field5320;
                    var25 = this.field5330.field2005 * var24 / var15 + arg2.field4114;
                    var26 = (this.field5316 * var10 + this.field5326 * var37 + this.field5324 * var9 >> 15) + this.field5319;
                    var27 = this.field5330.field1984 * var26 / var15 + arg2.field4119;
                    int var41 = (this.field5315 * var11 + this.field5328 * var9 + this.field5314 * var38 >> 15) + this.field5320;
                    var29 = this.field5330.field2005 * var41 / var40 + arg2.field4114;
                    int var42 = (this.field5316 * var11 + this.field5326 * var38 + this.field5324 * var9 >> 15) + this.field5319;
                    var31 = this.field5330.field1984 * var42 / var40 + arg2.field4119;
                    var32 = (this.field5315 * var11 + this.field5328 * var8 + this.field5314 * var39 >> 15) + this.field5320;
                    var33 = this.field5330.field2005 * var32 / var17 + arg2.field4114;
                    var34 = (this.field5316 * var11 + this.field5326 * var39 + this.field5324 * var8 >> 15) + this.field5319;
                    var35 = this.field5330.field1984 * var34 / var17 + arg2.field4119;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field4124 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field4122 || var33 > arg2.field4122 || var25 > arg2.field4122;
                    if (var7.field534 >= 0) {
                        if (this.method2377(this.field5330.field1765.method460(-26282, var7.field534).field7352)) {
                            arg2.field4121 = 100;
                        }
                        arg2.method1908(var31, var35, var27, var29, var33, var25, var7.field531 & 65535, var7.field532 & 65535, var7.field537 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field534);
                        arg2.field4121 = 0;
                    } else {
                        arg2.method1902(var31, var35, var27, var29, var33, var25, var7.field531 & 65535, var7.field532 & 65535, var7.field537 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field4124 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field4122 || var25 > arg2.field4122 || var33 > arg2.field4122;
                    if (var7.field534 >= 0) {
                        if (this.method2377(this.field5330.field1765.method460(-26282, var7.field534).field7352)) {
                            arg2.field4121 = 100;
                        }
                        arg2.method1908(var23, var27, var35, var21, var25, var33, var7.field535 & 65535, var7.field537 & 65535, var7.field532 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field534);
                        arg2.field4121 = 0;
                        return;
                    }
                    arg2.method1902(var23, var27, var35, var21, var25, var33, var7.field535 & 65535, var7.field537 & 65535, var7.field532 & 65535);
                }
            }
        } else {
            class525 var43 = this.field5312[arg0][arg1];
            if (var43 != null) {
                if (this.field5311 == -1) {
                    for (int var44 = 0; var44 < var43.field7780; ++var44) {
                        int var45 = (arg0 << super.field3193) + var43.field7773[var44];
                        short var46 = var43.field7779[var44];
                        int var47 = (arg1 << super.field3193) + var43.field7777[var44];
                        int var48 = (this.field5323 * var47 + this.field5325 * var46 + this.field5313 * var45 >> 15) + this.field5321;
                        if (var48 <= this.field5330.field2000) {
                            return;
                        }
                        int var49 = (this.field5315 * var47 + this.field5328 * var45 + this.field5314 * var46 >> 15) + this.field5320;
                        int var50 = (this.field5316 * var47 + this.field5326 * var46 + this.field5324 * var45 >> 15) + this.field5319;
                        arg3[var44] = this.field5330.field2005 * var49 / var48 + arg2.field4114;
                        arg4[var44] = this.field5330.field1984 * var50 / var48 + arg2.field4119;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field7780; ++var51) {
                        int var91 = (arg0 << super.field3193) + var43.field7773[var51];
                        short var92 = var43.field7779[var51];
                        int var93 = (arg1 << super.field3193) + var43.field7777[var51];
                        int var94 = (this.field5315 * var93 + this.field5328 * var91 + this.field5314 * var92 >> 15) + this.field5320;
                        int var95 = (this.field5316 * var93 + this.field5326 * var92 + this.field5324 * var91 >> 15) + this.field5319;
                        arg3[var51] = this.field5330.field2005 * var94 / this.field5311 + arg2.field4114;
                        arg4[var51] = this.field5330.field1984 * var95 / this.field5311 + arg2.field4119;
                    }
                }
                if (var43.field7781 != null) {
                    int var52 = this.field5322[arg0][arg1];
                    int var53 = this.field5322[arg0 + 1][arg1];
                    int var54 = this.field5322[arg0][arg1 + 1];
                    int var55 = super.field3198 * arg0;
                    int var56 = super.field3198 + var55;
                    int var57 = super.field3198 * arg1;
                    int var58 = super.field3198 + var57;
                    int var59 = (this.field5315 * var57 + this.field5328 * var55 + this.field5314 * var52 >> 15) + this.field5320;
                    int var60 = (this.field5316 * var57 + this.field5326 * var52 + this.field5324 * var55 >> 15) + this.field5319;
                    int var61 = (this.field5323 * var57 + this.field5325 * var52 + this.field5313 * var55 >> 15) + this.field5321;
                    int var62 = (this.field5315 * var57 + this.field5328 * var56 + this.field5314 * var53 >> 15) + this.field5320;
                    int var63 = (this.field5316 * var57 + this.field5326 * var53 + this.field5324 * var56 >> 15) + this.field5319;
                    int var64 = (this.field5323 * var57 + this.field5325 * var53 + this.field5313 * var56 >> 15) + this.field5321;
                    int var65 = (this.field5315 * var58 + this.field5328 * var55 + this.field5314 * var54 >> 15) + this.field5320;
                    int var66 = (this.field5316 * var58 + this.field5326 * var54 + this.field5324 * var55 >> 15) + this.field5319;
                    int var67 = (this.field5323 * var58 + this.field5325 * var54 + this.field5313 * var55 >> 15) + this.field5321;
                    for (int var68 = 0; var68 < var43.field7774; ++var68) {
                        short var69 = var43.field7772[var68];
                        short var70 = var43.field7782[var68];
                        short var71 = var43.field7771[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field4124 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field4122 || var73 > arg2.field4122 || var74 > arg2.field4122;
                            short var78 = var43.field7781[var68];
                            if (var78 != -1) {
                                if (this.method2377(this.field5330.field1765.method460(-26282, var78).field7352)) {
                                    arg2.field4121 = 100;
                                }
                                arg2.method1908(var75, var76, var77, var72, var73, var74, var43.field7778[var69], var43.field7778[var70], var43.field7778[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field4121 = 0;
                            } else {
                                int var79 = var43.field7776[var68];
                                if (var79 != -1) {
                                    arg2.method1902(var75, var76, var77, var72, var73, var74, class162.method1077(2, var79, var43.field7778[var69]), class162.method1077(2, var79, var43.field7778[var70]), class162.method1077(2, var79, var43.field7778[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field7774; ++var80) {
                    short var81 = var43.field7772[var80];
                    short var82 = var43.field7782[var80];
                    short var83 = var43.field7771[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field7776[var80];
                        if (var90 != -1) {
                            arg2.field4124 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field4122 || var85 > arg2.field4122 || var86 > arg2.field4122;
                            arg2.method1902(var87, var88, var89, var84, var85, var86, class162.method1077(2, var90, var43.field7778[var81]), class162.method1077(2, var90, var43.field7778[var82]), class162.method1077(2, var90, var43.field7778[var83]));
                        }
                    }
                }
            }
        }
    }
}
