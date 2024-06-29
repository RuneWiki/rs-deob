import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public abstract class class609 extends class88 {

    @OriginalMember(owner = "client!fea", name = "m", descriptor = "I")
    public int field8227 = -1;

    @OriginalMember(owner = "client!fea", name = "r", descriptor = "Lql;")
    public class173 field8232;

    @OriginalMember(owner = "client!fea", name = "C", descriptor = "I")
    private int field8243;

    @OriginalMember(owner = "client!fea", name = "v", descriptor = "[[I")
    public int[][] field8236;

    @OriginalMember(owner = "client!fea", name = "t", descriptor = "[[B")
    private byte[][] field8234;

    @OriginalMember(owner = "client!fea", name = "n", descriptor = "[[B")
    private byte[][] field8228;

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
    public int field8223;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public int field8224;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
    public int field8225;

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "I")
    public int field8226;

    @OriginalMember(owner = "client!fea", name = "o", descriptor = "I")
    public int field8229;

    @OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
    public int field8230;

    @OriginalMember(owner = "client!fea", name = "s", descriptor = "I")
    public int field8233;

    @OriginalMember(owner = "client!fea", name = "w", descriptor = "I")
    public int field8237;

    @OriginalMember(owner = "client!fea", name = "x", descriptor = "I")
    public int field8238;

    @OriginalMember(owner = "client!fea", name = "y", descriptor = "I")
    public int field8239;

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "I")
    public int field8240;

    @OriginalMember(owner = "client!fea", name = "B", descriptor = "I")
    public int field8242;

    @OriginalMember(owner = "client!fea", name = "q", descriptor = "[[Lsea;")
    public class375[][] field8231;

    @OriginalMember(owner = "client!fea", name = "A", descriptor = "[[Lrga;")
    public class58[][] field8241;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "[[Luo;")
    public class624[][] field8222;

    @OriginalMember(owner = "client!fea", name = "u", descriptor = "[[Lfda;")
    public class632[][] field8235;

    @OriginalMember(owner = "client!fea", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method658(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field8231 == null) {
            this.field8231 = new class375[super.field1166][super.field1164];
            this.field8222 = new class624[super.field1166][super.field1164];
        } else if (this.field8235 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class127.field1637[class111.method855(arg6[var15], -3159) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class127.field1637[class111.method855(arg7[var16], -3159) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field1163 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field1163 && arg4[var22] == super.field1163) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field1163) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field1163 != arg2[var24] && arg2[0] - super.field1163 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field1163 != arg4[var24] && arg4[0] - super.field1163 != arg4[var24]) {
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
                class375 var25 = new class375();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field4811 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field4806 = (byte) (var25.field4806 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field8236[arg0 + 1][arg1] == this.field8236[arg0][arg1] && this.field8236[arg0 + 1][arg1 + 1] == this.field8236[arg0][arg1] && this.field8236[arg0][arg1 + 1] == this.field8236[arg0][arg1]) {
                    var25.field4806 = (byte) (var25.field4806 | 1);
                }
                if (var27 != -1 && (var25.field4806 & 2) == 0 && !this.field8232.field598.method3162((byte) -104, var27).field799) {
                    var25.field4805 = this.field8234[arg0][arg1] - this.field8228[arg0][arg1];
                    var25.field4803 = this.field8234[arg0 + 1][arg1] - this.field8228[arg0 + 1][arg1];
                    var25.field4802 = this.field8234[arg0 + 1][arg1 + 1] - this.field8228[arg0 + 1][arg1 + 1];
                    var25.field4810 = this.field8234[arg0][arg1 + 1] - this.field8228[arg0][arg1 + 1];
                    var25.field4809 = (short) var27;
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
                    var25.field4805 = class14.method84(arg10, var28, false, method3310(arg6[var18] >> 8, this.field8234[arg0][arg1] - this.field8228[arg0][arg1]));
                    if (var25.field4811 != 0) {
                        var25.field4805 |= 255 - (this.field8234[arg0][arg1] - this.field8228[arg0][arg1]) << 25;
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
                    var25.field4803 = class14.method84(arg10, var29, false, method3310(arg6[var19] >> 8, this.field8234[arg0 + 1][arg1] - this.field8228[arg0 + 1][arg1]));
                    if (var25.field4811 != 0) {
                        var25.field4803 |= 255 - (this.field8234[arg0 + 1][arg1] - this.field8228[arg0 + 1][arg1]) << 25;
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
                    var25.field4802 = class14.method84(arg10, var30, false, method3310(arg6[var20] >> 8, this.field8234[arg0 + 1][arg1 + 1] - this.field8228[arg0 + 1][arg1 + 1]));
                    if (var25.field4811 != 0) {
                        var25.field4802 |= 255 - (this.field8234[arg0 + 1][arg1 + 1] - this.field8228[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field4810 = class14.method84(arg10, var31, false, method3310(arg6[var21] >> 8, this.field8234[arg0][arg1 + 1] - this.field8228[arg0][arg1 + 1]));
                    if (var25.field4811 != 0) {
                        var25.field4810 |= 255 - (this.field8234[arg0][arg1 + 1] - this.field8228[arg0][arg1 + 1]) << 25;
                    }
                    var25.field4809 = -1;
                }
                if (arg5 != null) {
                    var25.field4807 = (short) arg5[var20];
                    var25.field4812 = (short) arg5[var21];
                    var25.field4804 = (short) arg5[var19];
                    var25.field4808 = (short) arg5[var18];
                }
                this.field8231[arg0][arg1] = var25;
            } else {
                class624 var32 = new class624();
                var32.field8731 = (short) arg2.length;
                var32.field8732 = (short) (arg2.length / 3);
                var32.field8737 = new short[var32.field8731];
                var32.field8733 = new short[var32.field8731];
                var32.field8734 = new short[var32.field8731];
                var32.field8736 = new int[var32.field8731];
                if (arg5 != null) {
                    var32.field8738 = new short[var32.field8731];
                }
                for (int var33 = 0; var33 < var32.field8731; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field8234[arg0][arg1] - this.field8228[arg0][arg1];
                    } else if (var48 == 0 && super.field1163 == var49) {
                        var51 = this.field8234[arg0][arg1 + 1] - this.field8228[arg0][arg1 + 1];
                    } else if (super.field1163 == var48 && super.field1163 == var49) {
                        var51 = this.field8234[arg0 + 1][arg1 + 1] - this.field8228[arg0 + 1][arg1 + 1];
                    } else if (super.field1163 == var48 && var49 == 0) {
                        var51 = this.field8234[arg0 + 1][arg1] - this.field8228[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field8234[arg0 + 1][arg1] - this.field8228[arg0 + 1][arg1]) * var48 + (this.field8234[arg0][arg1] - this.field8228[arg0][arg1]) * (super.field1163 - var48);
                        int var53 = (this.field8234[arg0 + 1][arg1 + 1] - this.field8228[arg0 + 1][arg1 + 1]) * var48 + (this.field8234[arg0][arg1 + 1] - this.field8228[arg0][arg1 + 1]) * (super.field1163 - var48);
                        var51 = (super.field1163 - var49) * var52 + var49 * var53 >> super.field1168 * 2;
                    }
                    int var54 = (arg0 << super.field1168) + var48;
                    int var55 = (arg1 << super.field1168) + var49;
                    var32.field8737[var33] = (short) var48;
                    var32.field8734[var33] = (short) var49;
                    var32.field8733[var33] = (short) (this.method669(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field8232.field598.method3162((byte) -104, arg8[var33]).field799) {
                        var32.field8736[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field8736[var33] = var51 << 25;
                        } else {
                            var32.field8736[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field8738[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field8736[var33] = class14.method84(arg10, var56, false, method3310(arg6[var33] >> 8, var51));
                        if (arg7 != null) {
                            var32.field8736[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field8732; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field8232.field598.method3162((byte) -104, arg8[var35 * 3]).field799) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field8735 = new int[var32.field8732];
                }
                if (var34) {
                    var32.field8739 = new short[var32.field8732];
                    var32.field8730 = new short[var32.field8732];
                }
                for (int var36 = 0; var36 < var32.field8732; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field8735[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field8232.field598.method3162((byte) -104, var42).field799) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field8232.field598.method3162((byte) -104, var43).field799) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field8232.field598.method3162((byte) -104, var44).field799) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field8739[var36] = (short) var44;
                            var32.field8730[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field8232.field598.method3162((byte) -104, var45).field799) {
                                    var32.field8736[var37] = class127.field1637[class111.method855(this.field8232.field598.method3162((byte) -104, var45).field804 & 65535, -3159) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field8232.field598.method3162((byte) -104, var46).field799) {
                                    var32.field8736[var38] = class127.field1637[class111.method855(this.field8232.field598.method3162((byte) -104, var46).field804 & 65535, -3159) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field8232.field598.method3162((byte) -104, var47).field799) {
                                    var32.field8736[var39] = class127.field1637[class111.method855(this.field8232.field598.method3162((byte) -104, var47).field804 & 65535, -3159) & 65535];
                                }
                            }
                            var32.field8739[var36] = -1;
                        }
                    }
                }
                this.field8222[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method661(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field8235 == null) {
            this.field8235 = new class632[super.field1166][super.field1164];
            this.field8241 = new class58[super.field1166][super.field1164];
        } else if (this.field8231 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field1163 != var20 || var21 != 0 && super.field1163 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class58 var22 = new class58();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field790 = var23;
            var22.field788 = new short[var23];
            var22.field781 = new short[var23];
            var22.field789 = new short[var23];
            var22.field782 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field788[var25] = (short) (this.field8234[arg0][arg1] - this.field8228[arg0][arg1]);
                } else if (var30 == 0 && super.field1163 == var31) {
                    var22.field788[var25] = (short) (this.field8234[arg0][arg1 + 1] - this.field8228[arg0][arg1 + 1]);
                } else if (super.field1163 == var30 && super.field1163 == var31) {
                    var22.field788[var25] = (short) (this.field8234[arg0 + 1][arg1 + 1] - this.field8228[arg0 + 1][arg1 + 1]);
                } else if (super.field1163 == var30 && var31 == 0) {
                    var22.field788[var25] = (short) (this.field8234[arg0 + 1][arg1] - this.field8228[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field8234[arg0 + 1][arg1] - this.field8228[arg0 + 1][arg1]) * var30 + (this.field8234[arg0][arg1] - this.field8228[arg0][arg1]) * (super.field1163 - var30);
                    int var33 = (this.field8234[arg0 + 1][arg1 + 1] - this.field8228[arg0 + 1][arg1 + 1]) * var30 + (this.field8234[arg0][arg1 + 1] - this.field8228[arg0][arg1 + 1]) * (super.field1163 - var30);
                    var22.field788[var25] = (short) ((super.field1163 - var31) * var32 + var31 * var33 >> super.field1168 * 2);
                }
                int var34 = (arg0 << super.field1168) + var30;
                int var35 = (arg1 << super.field1168) + var31;
                var22.field781[var25] = (short) var30;
                var22.field782[var25] = (short) var31;
                var22.field789[var25] = (short) (this.method669(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field788[var25] < 2) {
                    var22.field788[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field8232.field598.method3162((byte) -104, arg11[var28]).field799) {
                    var26 = true;
                }
            }
            var22.field784 = new int[var27];
            if (arg10 != null) {
                var22.field787 = new int[var27];
            }
            var22.field783 = new short[var27];
            var22.field785 = new short[var27];
            var22.field779 = new short[var27];
            if (var26) {
                var22.field786 = new short[var27];
                var22.field791 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field784[var22.field780] = class111.method855(arg9[var29], -3159);
                    } else {
                        var22.field784[var22.field780] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field787[var22.field780] = class111.method855(arg10[var29], -3159);
                        } else {
                            var22.field787[var22.field780] = -1;
                        }
                    }
                    var22.field783[var22.field780] = (short) arg6[var29];
                    var22.field785[var22.field780] = (short) arg7[var29];
                    var22.field779[var22.field780] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field8232.field598.method3162((byte) -104, arg11[var29]).field799) {
                            var22.field786[var22.field780] = (short) arg11[var29];
                            var22.field791[var22.field780] = (short) arg12[var29];
                        } else {
                            var22.field786[var22.field780] = -1;
                        }
                    }
                    ++var22.field780;
                }
            }
            this.field8241[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class632 var36 = new class632();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field8813 = class82.method639(3626, class111.method855(arg10[0], -3159), this.field8234[arg0][arg1] - this.field8228[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field8812 = (byte) (var36.field8812 | 2);
                    }
                }
                if (this.field8236[arg0 + 1][arg1] == this.field8236[arg0][arg1] && this.field8236[arg0 + 1][arg1 + 1] == this.field8236[arg0][arg1] && this.field8236[arg0][arg1 + 1] == this.field8236[arg0][arg1]) {
                    var36.field8812 = (byte) (var36.field8812 | 1);
                }
                if (var38 != -1 && (var36.field8812 & 2) == 0 && !this.field8232.field598.method3162((byte) -104, var38).field799) {
                    var36.field8815 = (short) (this.field8234[arg0][arg1] - this.field8228[arg0][arg1]);
                    var36.field8811 = (short) (this.field8234[arg0 + 1][arg1] - this.field8228[arg0 + 1][arg1]);
                    var36.field8809 = (short) (this.field8234[arg0 + 1][arg1 + 1] - this.field8228[arg0 + 1][arg1 + 1]);
                    var36.field8814 = (short) (this.field8234[arg0][arg1 + 1] - this.field8228[arg0][arg1 + 1]);
                    var36.field8810 = (short) var38;
                } else {
                    short var39 = class111.method855(var37, -3159);
                    var36.field8815 = (short) class82.method639(3626, var39, this.field8234[arg0][arg1] - this.field8228[arg0][arg1]);
                    var36.field8811 = (short) class82.method639(3626, var39, this.field8234[arg0 + 1][arg1] - this.field8228[arg0 + 1][arg1]);
                    var36.field8809 = (short) class82.method639(3626, var39, this.field8234[arg0 + 1][arg1 + 1] - this.field8228[arg0 + 1][arg1 + 1]);
                    var36.field8814 = (short) class82.method639(3626, var39, this.field8234[arg0][arg1 + 1] - this.field8228[arg0][arg1 + 1]);
                    var36.field8810 = -1;
                }
                this.field8235[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)V")
    public abstract void method659(int arg0, int arg1);

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(III[[ZZ)V")
    public void method660(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class488 var6 = this.field8232.field2151;
        this.field8227 = -1;
        this.field8230 = var6.field6478;
        this.field8229 = var6.field6482;
        this.field8226 = var6.field6484;
        this.field8240 = var6.field6485;
        this.field8238 = var6.field6486;
        this.field8225 = var6.field6488;
        this.field8239 = var6.field6480;
        this.field8237 = var6.field6483;
        this.field8242 = var6.field6477;
        this.field8224 = var6.field6479;
        this.field8233 = var6.field6481;
        this.field8223 = var6.field6487;
    }

    @OriginalMember(owner = "client!fea", name = "EA", descriptor = "(III)V")
    public final void method662(int arg0, int arg1, int arg2) {
        if (this.field8228[arg0][arg1] < arg2) {
            this.field8228[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(II)I")
    private static final int method3310(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method665(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!fea", name = "JA", descriptor = "(II)I")
    public final int method668(int arg0, int arg1) {
        return this.field8236[arg0][arg1];
    }

    @OriginalMember(owner = "client!fea", name = "sa", descriptor = "(II)I")
    public final int method669(int arg0, int arg1) {
        int var3 = arg0 >> super.field1168;
        int var4 = arg1 >> super.field1168;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field1166 - 1 && var4 <= super.field1164 - 1) {
            int var5 = arg0 & super.field1163 - 1;
            int var6 = arg1 & super.field1163 - 1;
            int var7 = (super.field1163 - var5) * this.field8236[var3][var4] + this.field8236[var3 + 1][var4] * var5 >> super.field1168;
            int var8 = (super.field1163 - var5) * this.field8236[var3][var4 + 1] + this.field8236[var3 + 1][var4 + 1] * var5 >> super.field1168;
            return (super.field1163 - var6) * var7 + var6 * var8 >> super.field1168;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fea", name = "ba", descriptor = "()V")
    public final void method663() {
        this.field8234 = null;
        this.field8228 = null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)Z")
    public final boolean method3311(int arg0) {
        if ((this.field8243 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!fea", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method667(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lql;IIII[[I[[II)V")
    public class609(class173 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field8232 = arg0;
        this.field8243 = arg2;
        this.field8236 = arg5;
        this.field8234 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field8232.field2158 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field8232.field2153 * var18 + this.field8232.field2176 * var17 + this.field8232.field2168 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field8234[var11][var10] = (byte) var20;
            }
        }
        this.field8228 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lpn;[I)V")
    public final void method672(class296 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(IILw;)Lw;")
    public final class605 method664(int arg0, int arg1, class605 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!fea", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method666(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
