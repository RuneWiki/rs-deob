import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class343 extends class337 {

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    private int field5276 = -1;

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "Ldg;")
    private class13 field5282;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
    private int field5278;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "[[I")
    public int[][] field5269;

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "[[B")
    private byte[][] field5287;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "[[B")
    private byte[][] field5281;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    private int field5267;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    private int field5271;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    private int field5272;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    private int field5273;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    private int field5274;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    private int field5275;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
    private int field5277;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
    private int field5279;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
    private int field5283;

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
    private int field5284;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
    private int field5285;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
    private int field5286;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "[[Lci;")
    private class114[][] field5280;

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "[[Lvu;")
    private class156[][] field5288;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "[[Lnf;")
    private class28[][] field5270;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "[[Loq;")
    private class499[][] field5268;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 3)
    public final void method717(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field5288 == null) {
            this.field5288 = new class156[super.field5198][super.field5200];
            this.field5280 = new class114[super.field5198][super.field5200];
        } else if (this.field5268 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class85.field1347[class90.method696(1278910602, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class85.field1347[class90.method696(1278910602, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field5193 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field5193 && arg4[var22] == super.field5193) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field5193) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field5193 != arg2[var24] && arg2[0] - super.field5193 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field5193 != arg4[var24] && arg4[0] - super.field5193 != arg4[var24]) {
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
                class156 var25 = new class156();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field2353 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field2349 = (byte) (var25.field2349 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field5269[arg0 + 1][arg1] == this.field5269[arg0][arg1] && this.field5269[arg0 + 1][arg1 + 1] == this.field5269[arg0][arg1] && this.field5269[arg0][arg1 + 1] == this.field5269[arg0][arg1]) {
                    var25.field2349 = (byte) (var25.field2349 | 1);
                }
                if (var27 != -1 && (var25.field2349 & 2) == 0 && !this.field5282.field101.method1480(var27, 14270).field2405) {
                    var25.field2356 = this.field5287[arg0][arg1] - this.field5281[arg0][arg1];
                    var25.field2355 = this.field5287[arg0 + 1][arg1] - this.field5281[arg0 + 1][arg1];
                    var25.field2357 = this.field5287[arg0 + 1][arg1 + 1] - this.field5281[arg0 + 1][arg1 + 1];
                    var25.field2348 = this.field5287[arg0][arg1 + 1] - this.field5281[arg0][arg1 + 1];
                    var25.field2351 = (short) var27;
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
                    var25.field2356 = class445.method2611(method2088(arg6[var18] >> 8, this.field5287[arg0][arg1] - this.field5281[arg0][arg1]), (byte) -14, var28, arg10);
                    if (var25.field2353 != 0) {
                        var25.field2356 |= 255 - (this.field5287[arg0][arg1] - this.field5281[arg0][arg1]) << 25;
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
                    var25.field2355 = class445.method2611(method2088(arg6[var19] >> 8, this.field5287[arg0 + 1][arg1] - this.field5281[arg0 + 1][arg1]), (byte) -14, var29, arg10);
                    if (var25.field2353 != 0) {
                        var25.field2355 |= 255 - (this.field5287[arg0 + 1][arg1] - this.field5281[arg0 + 1][arg1]) << 25;
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
                    var25.field2357 = class445.method2611(method2088(arg6[var20] >> 8, this.field5287[arg0 + 1][arg1 + 1] - this.field5281[arg0 + 1][arg1 + 1]), (byte) -14, var30, arg10);
                    if (var25.field2353 != 0) {
                        var25.field2357 |= 255 - (this.field5287[arg0 + 1][arg1 + 1] - this.field5281[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field2348 = class445.method2611(method2088(arg6[var21] >> 8, this.field5287[arg0][arg1 + 1] - this.field5281[arg0][arg1 + 1]), (byte) -14, var31, arg10);
                    if (var25.field2353 != 0) {
                        var25.field2348 |= 255 - (this.field5287[arg0][arg1 + 1] - this.field5281[arg0][arg1 + 1]) << 25;
                    }
                    var25.field2351 = -1;
                }
                if (arg5 != null) {
                    var25.field2352 = (short) arg5[var20];
                    var25.field2358 = (short) arg5[var21];
                    var25.field2354 = (short) arg5[var19];
                    var25.field2350 = (short) arg5[var18];
                }
                this.field5288[arg0][arg1] = var25;
            } else {
                class114 var32 = new class114();
                var32.field1732 = (short) arg2.length;
                var32.field1733 = (short) (arg2.length / 3);
                var32.field1728 = new short[var32.field1732];
                var32.field1730 = new short[var32.field1732];
                var32.field1726 = new short[var32.field1732];
                var32.field1724 = new int[var32.field1732];
                if (arg5 != null) {
                    var32.field1725 = new short[var32.field1732];
                }
                for (int var33 = 0; var33 < var32.field1732; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field5287[arg0][arg1] - this.field5281[arg0][arg1];
                    } else if (var48 == 0 && super.field5193 == var49) {
                        var51 = this.field5287[arg0][arg1 + 1] - this.field5281[arg0][arg1 + 1];
                    } else if (super.field5193 == var48 && super.field5193 == var49) {
                        var51 = this.field5287[arg0 + 1][arg1 + 1] - this.field5281[arg0 + 1][arg1 + 1];
                    } else if (super.field5193 == var48 && var49 == 0) {
                        var51 = this.field5287[arg0 + 1][arg1] - this.field5281[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field5287[arg0 + 1][arg1] - this.field5281[arg0 + 1][arg1]) * var48 + (this.field5287[arg0][arg1] - this.field5281[arg0][arg1]) * (super.field5193 - var48);
                        int var53 = (this.field5287[arg0 + 1][arg1 + 1] - this.field5281[arg0 + 1][arg1 + 1]) * var48 + (this.field5287[arg0][arg1 + 1] - this.field5281[arg0][arg1 + 1]) * (super.field5193 - var48);
                        var51 = (super.field5193 - var49) * var52 + var49 * var53 >> super.field5197 * 2;
                    }
                    int var54 = (arg0 << super.field5197) + var48;
                    int var55 = (arg1 << super.field5197) + var49;
                    var32.field1728[var33] = (short) var48;
                    var32.field1726[var33] = (short) var49;
                    var32.field1730[var33] = (short) (this.method718(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field5282.field101.method1480(arg8[var33], 14270).field2405) {
                        var32.field1724[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field1724[var33] = var51 << 25;
                        } else {
                            var32.field1724[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field1725[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field1724[var33] = class445.method2611(method2088(arg6[var33] >> 8, var51), (byte) -14, var56, arg10);
                        if (arg7 != null) {
                            var32.field1724[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field1733; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field5282.field101.method1480(arg8[var35 * 3], 14270).field2405) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field1729 = new int[var32.field1733];
                }
                if (var34) {
                    var32.field1727 = new short[var32.field1733];
                    var32.field1731 = new short[var32.field1733];
                }
                for (int var36 = 0; var36 < var32.field1733; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field1729[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field5282.field101.method1480(var42, 14270).field2405) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field5282.field101.method1480(var43, 14270).field2405) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field5282.field101.method1480(var44, 14270).field2405) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field1727[var36] = (short) var44;
                            var32.field1731[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field5282.field101.method1480(var45, 14270).field2405) {
                                    var32.field1724[var37] = class85.field1347[class90.method696(1278910602, this.field5282.field101.method1480(var45, 14270).field2409 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field5282.field101.method1480(var46, 14270).field2405) {
                                    var32.field1724[var38] = class85.field1347[class90.method696(1278910602, this.field5282.field101.method1480(var46, 14270).field2409 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field5282.field101.method1480(var47, 14270).field2405) {
                                    var32.field1724[var39] = class85.field1347[class90.method696(1278910602, this.field5282.field101.method1480(var47, 14270).field2409 & 65535) & 65535];
                                }
                            }
                            var32.field1727[var36] = -1;
                        }
                    }
                }
                this.field5280[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(II)I", line = 498)
    private static final int method2088(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "(Lba;IIIIZ)V", line = 532)
    public final void method706(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(Lba;IIIIZ)V", line = 534)
    public final void method703(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)I", line = 539)
    public final int method718(int arg0, int arg1) {
        int var3 = arg0 >> super.field5197;
        int var4 = arg1 >> super.field5197;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field5198 - 1 && var4 <= super.field5200 - 1) {
            int var5 = arg0 & super.field5193 - 1;
            int var6 = arg1 & super.field5193 - 1;
            int var7 = (super.field5193 - var5) * this.field5269[var3][var4] + this.field5269[var3 + 1][var4] * var5 >> super.field5197;
            int var8 = (super.field5193 - var5) * this.field5269[var3][var4 + 1] + this.field5269[var3 + 1][var4 + 1] * var5 >> super.field5197;
            return (super.field5193 - var6) * var7 + var6 * var8 >> super.field5197;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mu", name = "ca", descriptor = "()V", line = 557)
    public final void method705() {
        this.field5287 = null;
        this.field5281 = null;
    }

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "(III)V", line = 562)
    public final void method719(int arg0, int arg1, int arg2) {
        if (this.field5281[arg0][arg1] < arg2) {
            this.field5281[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 567)
    public final void method714(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field5268 == null) {
            this.field5268 = new class499[super.field5198][super.field5200];
            this.field5270 = new class28[super.field5198][super.field5200];
        } else if (this.field5288 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field5193 != var20 || var21 != 0 && super.field5193 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class28 var22 = new class28();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field403 = var23;
            var22.field400 = new short[var23];
            var22.field401 = new short[var23];
            var22.field406 = new short[var23];
            var22.field398 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field400[var25] = (short) (this.field5287[arg0][arg1] - this.field5281[arg0][arg1]);
                } else if (var30 == 0 && super.field5193 == var31) {
                    var22.field400[var25] = (short) (this.field5287[arg0][arg1 + 1] - this.field5281[arg0][arg1 + 1]);
                } else if (super.field5193 == var30 && super.field5193 == var31) {
                    var22.field400[var25] = (short) (this.field5287[arg0 + 1][arg1 + 1] - this.field5281[arg0 + 1][arg1 + 1]);
                } else if (super.field5193 == var30 && var31 == 0) {
                    var22.field400[var25] = (short) (this.field5287[arg0 + 1][arg1] - this.field5281[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field5287[arg0 + 1][arg1] - this.field5281[arg0 + 1][arg1]) * var30 + (this.field5287[arg0][arg1] - this.field5281[arg0][arg1]) * (super.field5193 - var30);
                    int var33 = (this.field5287[arg0 + 1][arg1 + 1] - this.field5281[arg0 + 1][arg1 + 1]) * var30 + (this.field5287[arg0][arg1 + 1] - this.field5281[arg0][arg1 + 1]) * (super.field5193 - var30);
                    var22.field400[var25] = (short) ((super.field5193 - var31) * var32 + var31 * var33 >> super.field5197 * 2);
                }
                int var34 = (arg0 << super.field5197) + var30;
                int var35 = (arg1 << super.field5197) + var31;
                var22.field401[var25] = (short) var30;
                var22.field398[var25] = (short) var31;
                var22.field406[var25] = (short) (this.method718(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field400[var25] < 2) {
                    var22.field400[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field5282.field101.method1480(arg11[var28], 14270).field2405) {
                    var26 = true;
                }
            }
            var22.field397 = new int[var27];
            if (arg10 != null) {
                var22.field402 = new int[var27];
            }
            var22.field408 = new short[var27];
            var22.field407 = new short[var27];
            var22.field405 = new short[var27];
            if (var26) {
                var22.field404 = new short[var27];
                var22.field409 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field397[var22.field399] = class90.method696(1278910602, arg9[var29]);
                    } else {
                        var22.field397[var22.field399] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field402[var22.field399] = class90.method696(1278910602, arg10[var29]);
                        } else {
                            var22.field402[var22.field399] = -1;
                        }
                    }
                    var22.field408[var22.field399] = (short) arg6[var29];
                    var22.field407[var22.field399] = (short) arg7[var29];
                    var22.field405[var22.field399] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field5282.field101.method1480(arg11[var29], 14270).field2405) {
                            var22.field404[var22.field399] = (short) arg11[var29];
                            var22.field409[var22.field399] = (short) arg12[var29];
                        } else {
                            var22.field404[var22.field399] = -1;
                        }
                    }
                    ++var22.field399;
                }
            }
            this.field5270[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class499 var36 = new class499();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field7394 = class17.method197(class90.method696(1278910602, arg10[0]), -74, this.field5287[arg0][arg1] - this.field5281[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field7393 = (byte) (var36.field7393 | 2);
                    }
                }
                if (this.field5269[arg0 + 1][arg1] == this.field5269[arg0][arg1] && this.field5269[arg0 + 1][arg1 + 1] == this.field5269[arg0][arg1] && this.field5269[arg0][arg1 + 1] == this.field5269[arg0][arg1]) {
                    var36.field7393 = (byte) (var36.field7393 | 1);
                }
                if (var38 != -1 && (var36.field7393 & 2) == 0 && !this.field5282.field101.method1480(var38, 14270).field2405) {
                    var36.field7396 = (short) (this.field5287[arg0][arg1] - this.field5281[arg0][arg1]);
                    var36.field7391 = (short) (this.field5287[arg0 + 1][arg1] - this.field5281[arg0 + 1][arg1]);
                    var36.field7395 = (short) (this.field5287[arg0 + 1][arg1 + 1] - this.field5281[arg0 + 1][arg1 + 1]);
                    var36.field7397 = (short) (this.field5287[arg0][arg1 + 1] - this.field5281[arg0][arg1 + 1]);
                    var36.field7392 = (short) var38;
                } else {
                    short var39 = class90.method696(1278910602, var37);
                    var36.field7396 = (short) class17.method197(var39, -107, this.field5287[arg0][arg1] - this.field5281[arg0][arg1]);
                    var36.field7391 = (short) class17.method197(var39, -99, this.field5287[arg0 + 1][arg1] - this.field5281[arg0 + 1][arg1]);
                    var36.field7395 = (short) class17.method197(var39, -102, this.field5287[arg0 + 1][arg1 + 1] - this.field5281[arg0 + 1][arg1 + 1]);
                    var36.field7397 = (short) class17.method197(var39, -109, this.field5287[arg0][arg1 + 1] - this.field5281[arg0][arg1 + 1]);
                    var36.field7392 = -1;
                }
                this.field5268[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIII[[ZLbu;[I[I)V", line = 798)
    private final void method2089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class106 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field1583 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field5288[var16][var17] != null) {
                        class156 var18 = this.field5288[var16][var17];
                        if (var18.field2351 != -1 && (var18.field2349 & 2) == 0 && var18.field2353 == 0) {
                            int var19 = this.field5282.method176(var18.field2351);
                            arg8.method802(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class17.method197(var19, -83, var18.field2357), class17.method197(var19, -114, var18.field2348), class17.method197(var19, -114, var18.field2355));
                            arg8.method802(var15, var15, var15 - var13, var14, var13 + var14, var14, class17.method197(var19, -72, var18.field2356), class17.method197(var19, -88, var18.field2355), class17.method197(var19, -104, var18.field2348));
                        } else if (var18.field2353 == 0) {
                            arg8.method803(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field2357, var18.field2348, var18.field2355);
                            arg8.method803(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field2356, var18.field2355, var18.field2348);
                        } else {
                            int var20 = var18.field2353;
                            arg8.method803(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class290.method1800(var20, -82, var18.field2357 & -16777216), class290.method1800(var20, 103, var18.field2348 & -16777216), class290.method1800(var20, 48, var18.field2355 & -16777216));
                            arg8.method803(var15, var15, var15 - var13, var14, var13 + var14, var14, class290.method1800(var20, -86, var18.field2356 & -16777216), class290.method1800(var20, -81, var18.field2355 & -16777216), class290.method1800(var20, 40, var18.field2348 & -16777216));
                        }
                    } else if (this.field5280[var16][var17] != null) {
                        class114 var21 = this.field5280[var16][var17];
                        for (int var22 = 0; var22 < var21.field1732; ++var22) {
                            arg9[var22] = var21.field1728[var22] * var13 / super.field5193 + var14;
                            arg10[var22] = var15 - var21.field1726[var22] * var13 / super.field5193;
                        }
                        for (int var23 = 0; var23 < var21.field1733; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1729 != null && var21.field1729[var23] != 0 && (var21.field1727 == null || var21.field1727 != null && var21.field1727[var23] == -1)) {
                                int var33 = var21.field1729[var23];
                                arg8.method803(var30, var31, var32, var27, var28, var29, class290.method1800(var33, -123, -16777216 - (var21.field1724[var24] & -16777216)), class290.method1800(var33, 59, -16777216 - (var21.field1724[var25] & -16777216)), class290.method1800(var33, -105, -16777216 - (var21.field1724[var26] & -16777216)));
                            } else if (var21.field1727 != null && var21.field1727[var23] != -1) {
                                int var34 = this.field5282.method176(var21.field1727[var23]);
                                arg8.method802(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method803(var30, var31, var32, var27, var28, var29, var21.field1724[var24], var21.field1724[var25], var21.field1724[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field1583 = true;
    }

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "(IILba;)Lba;", line = 926)
    public final class502 method712(int arg0, int arg1, class502 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 930)
    public final boolean method710(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "(II)I", line = 935)
    public final int method707(int arg0, int arg1) {
        return this.field5269[arg0][arg1];
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(IIIIIII[[ZLbu;[I[I)V", line = 941)
    private final void method2090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class106 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field1583 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field5268[var16][var17] != null) {
                        class499 var18 = this.field5268[var16][var17];
                        if (var18.field7392 != -1 && (var18.field7393 & 2) == 0 && var18.field7394 == -1) {
                            int var19 = this.field5282.method176(var18.field7392);
                            arg8.method802(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class17.method197(var19, -80, var18.field7395 & 65535), class17.method197(var19, -110, var18.field7397 & 65535), class17.method197(var19, -80, var18.field7391 & 65535));
                            arg8.method802(var15, var15, var15 - var13, var14, var13 + var14, var14, class17.method197(var19, -105, var18.field7396 & 65535), class17.method197(var19, -92, var18.field7391 & 65535), class17.method197(var19, -94, var18.field7397 & 65535));
                        } else if (var18.field7394 == -1) {
                            arg8.method802(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field7395 & 65535, var18.field7397 & 65535, var18.field7391 & 65535);
                            arg8.method802(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field7396 & 65535, var18.field7391 & 65535, var18.field7397 & 65535);
                        } else {
                            int var20 = var18.field7394;
                            arg8.method802(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method802(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field5270[var16][var17] != null) {
                        class28 var21 = this.field5270[var16][var17];
                        for (int var22 = 0; var22 < var21.field403; ++var22) {
                            arg9[var22] = var21.field401[var22] * var13 / super.field5193 + var14;
                            arg10[var22] = var15 - var21.field398[var22] * var13 / super.field5193;
                        }
                        for (int var23 = 0; var23 < var21.field399; ++var23) {
                            short var24 = var21.field408[var23];
                            short var25 = var21.field407[var23];
                            short var26 = var21.field405[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field402 != null && var21.field402[var23] != -1) {
                                int var33 = var21.field402[var23];
                                arg8.method802(var30, var31, var32, var27, var28, var29, class17.method197(var33, -113, var21.field400[var24]), class17.method197(var33, -84, var21.field400[var25]), class17.method197(var33, -85, var21.field400[var26]));
                            } else if (var21.field404 != null && var21.field404[var23] != -1) {
                                int var34 = this.field5282.method176(var21.field404[var23]);
                                arg8.method802(var30, var31, var32, var27, var28, var29, class17.method197(var34, -122, var21.field400[var24]), class17.method197(var34, -90, var21.field400[var25]), class17.method197(var34, -117, var21.field400[var26]));
                            } else {
                                int var35 = var21.field397[var23];
                                arg8.method802(var30, var31, var32, var27, var28, var29, class17.method197(var35, -68, var21.field400[var24]), class17.method197(var35, -71, var21.field400[var25]), class17.method197(var35, -77, var21.field400[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field1583 = true;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIZLbu;[I[I[I)V", line = 1072)
    private final void method2091(int arg0, int arg1, boolean arg2, class106 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class156 var8 = this.field5288[arg0][arg1];
        if (var8 != null) {
            if ((var8.field2349 & 2) == 0) {
                int var9 = super.field5193 * arg0;
                int var10 = super.field5193 + var9;
                int var11 = super.field5193 * arg1;
                int var12 = super.field5193 + var11;
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
                if ((var8.field2349 & 1) != 0 && !arg2) {
                    int var17 = this.field5269[arg0][arg1];
                    if (this.field5276 == -1) {
                        int var18 = this.field5273 * var17;
                        var19 = (this.field5283 * var11 + this.field5272 * var9 + var18 >> 15) + this.field5274;
                        if (var19 <= this.field5282.field166) {
                            return;
                        }
                        var20 = (this.field5283 * var11 + this.field5272 * var10 + var18 >> 15) + this.field5274;
                        if (var20 <= this.field5282.field166) {
                            return;
                        }
                        var21 = (this.field5283 * var12 + this.field5272 * var10 + var18 >> 15) + this.field5274;
                        if (var21 <= this.field5282.field166) {
                            return;
                        }
                        var22 = (this.field5283 * var12 + this.field5272 * var9 + var18 >> 15) + this.field5274;
                        if (var22 <= this.field5282.field166) {
                            return;
                        }
                    } else {
                        var22 = this.field5276;
                        var21 = this.field5276;
                        var20 = this.field5276;
                        var19 = this.field5276;
                    }
                    if (this.field5282.field140) {
                        int var23 = var19 - this.field5282.field149;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field5282.field149;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field5282.field149;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field5282.field149;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field5271 * var17;
                    int var28 = this.field5284 * var17;
                    var29 = (this.field5267 * var11 + this.field5275 * var9 + var27 >> 15) + this.field5279;
                    var30 = this.field5282.field137 * var29 / var19 + arg3.field1582;
                    var31 = (this.field5285 * var11 + this.field5286 * var9 + var28 >> 15) + this.field5277;
                    var32 = this.field5282.field135 * var31 / var19 + arg3.field1592;
                    var33 = (this.field5267 * var11 + this.field5275 * var10 + var27 >> 15) + this.field5279;
                    var34 = this.field5282.field137 * var33 / var20 + arg3.field1582;
                    var35 = (this.field5285 * var11 + this.field5286 * var10 + var28 >> 15) + this.field5277;
                    var36 = this.field5282.field135 * var35 / var20 + arg3.field1592;
                    var37 = (this.field5267 * var12 + this.field5275 * var10 + var27 >> 15) + this.field5279;
                    var38 = this.field5282.field137 * var37 / var21 + arg3.field1582;
                    var39 = (this.field5285 * var12 + this.field5286 * var10 + var28 >> 15) + this.field5277;
                    var40 = this.field5282.field135 * var39 / var21 + arg3.field1592;
                    var41 = (this.field5267 * var12 + this.field5275 * var9 + var27 >> 15) + this.field5279;
                    var42 = this.field5282.field137 * var41 / var22 + arg3.field1582;
                    var43 = (this.field5285 * var12 + this.field5286 * var9 + var28 >> 15) + this.field5277;
                    var44 = this.field5282.field135 * var43 / var22 + arg3.field1592;
                } else {
                    int var45 = this.field5269[arg0][arg1];
                    int var46 = this.field5269[arg0 + 1][arg1];
                    int var47 = this.field5269[arg0 + 1][arg1 + 1];
                    int var48 = this.field5269[arg0][arg1 + 1];
                    if (this.field5276 == -1) {
                        var19 = (this.field5283 * var11 + this.field5273 * var45 + this.field5272 * var9 >> 15) + this.field5274;
                        if (var19 <= this.field5282.field166) {
                            return;
                        }
                        var20 = (this.field5283 * var11 + this.field5273 * var46 + this.field5272 * var10 >> 15) + this.field5274;
                        if (var20 <= this.field5282.field166) {
                            return;
                        }
                        var21 = (this.field5283 * var12 + this.field5273 * var47 + this.field5272 * var10 >> 15) + this.field5274;
                        if (var21 <= this.field5282.field166) {
                            return;
                        }
                        var22 = (this.field5283 * var12 + this.field5273 * var48 + this.field5272 * var9 >> 15) + this.field5274;
                        if (var22 <= this.field5282.field166) {
                            return;
                        }
                    } else {
                        var22 = this.field5276;
                        var21 = this.field5276;
                        var20 = this.field5276;
                        var19 = this.field5276;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field5282.field149;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field2350 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field5282.field149;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field2354 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field5282.field149;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field2352 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field5282.field149;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field2358 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field5282.field140) {
                        int var57 = var19 - this.field5282.field149;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field5282.field149;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field5282.field149;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field5282.field149;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field5267 * var11 + this.field5275 * var9 + this.field5271 * var45 >> 15) + this.field5279;
                    var30 = this.field5282.field137 * var29 / var19 + arg3.field1582;
                    var31 = (this.field5285 * var11 + this.field5286 * var9 + this.field5284 * var45 >> 15) + this.field5277;
                    var32 = this.field5282.field135 * var31 / var19 + arg3.field1592;
                    var33 = (this.field5267 * var11 + this.field5275 * var10 + this.field5271 * var46 >> 15) + this.field5279;
                    var34 = this.field5282.field137 * var33 / var20 + arg3.field1582;
                    var35 = (this.field5285 * var11 + this.field5286 * var10 + this.field5284 * var46 >> 15) + this.field5277;
                    var36 = this.field5282.field135 * var35 / var20 + arg3.field1592;
                    var37 = (this.field5267 * var12 + this.field5275 * var10 + this.field5271 * var47 >> 15) + this.field5279;
                    var38 = this.field5282.field137 * var37 / var21 + arg3.field1582;
                    var39 = (this.field5285 * var12 + this.field5286 * var10 + this.field5284 * var47 >> 15) + this.field5277;
                    var40 = this.field5282.field135 * var39 / var21 + arg3.field1592;
                    var41 = (this.field5267 * var12 + this.field5275 * var9 + this.field5271 * var48 >> 15) + this.field5279;
                    var42 = this.field5282.field137 * var41 / var22 + arg3.field1582;
                    var43 = (this.field5285 * var12 + this.field5286 * var9 + this.field5284 * var48 >> 15) + this.field5277;
                    var44 = this.field5282.field135 * var43 / var22 + arg3.field1592;
                }
                boolean var61 = var8.field2351 != -1 && this.method2092(this.field5282.field101.method1480(var8.field2351, 14270).field2412);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field1589 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field1586 || var42 > arg3.field1586 || var34 > arg3.field1586;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field1590 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field2351 >= 0) {
                                arg3.method797(var40, var44, var36, var38, var42, var34, this.field5282.field159, var15, var16, var14, var8.field2357, var8.field2348, var8.field2355, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field2351);
                            } else {
                                arg3.method803(var40, var44, var36, var38, var42, var34, class290.method1800(var8.field2357, 90, var15 << 24 | this.field5282.field159), class290.method1800(var8.field2348, -114, var16 << 24 | this.field5282.field159), class290.method1800(var8.field2355, 92, var14 << 24 | this.field5282.field159));
                            }
                        } else if (var8.field2351 >= 0) {
                            arg3.method799(var40, var44, var36, var38, var42, var34, var8.field2357, var8.field2348, var8.field2355, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field2351);
                        } else {
                            arg3.method803(var40, var44, var36, var38, var42, var34, var8.field2357, var8.field2348, var8.field2355);
                        }
                        arg3.field1590 = 0;
                    } else {
                        arg3.method793(var40, var44, var36, var38, var42, var34, this.field5282.field159);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field1589 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field1586 || var34 > arg3.field1586 || var42 > arg3.field1586;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field1590 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field2351 >= 0) {
                                arg3.method797(var32, var36, var44, var30, var34, var42, this.field5282.field159, var13, var14, var16, var8.field2356, var8.field2355, var8.field2348, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field2351);
                            } else {
                                arg3.method803(var32, var36, var44, var30, var34, var42, class290.method1800(var8.field2356, -112, var13 << 24 | this.field5282.field159), class290.method1800(var8.field2355, 107, var14 << 24 | this.field5282.field159), class290.method1800(var8.field2348, -80, var16 << 24 | this.field5282.field159));
                            }
                        } else if (var8.field2351 >= 0) {
                            arg3.method799(var32, var36, var44, var30, var34, var42, var8.field2356, var8.field2355, var8.field2348, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field2351);
                        } else {
                            arg3.method803(var32, var36, var44, var30, var34, var42, var8.field2356, var8.field2355, var8.field2348);
                        }
                        arg3.field1590 = 0;
                        return;
                    }
                    arg3.method793(var32, var36, var44, var30, var34, var42, this.field5282.field159);
                }
            }
        } else {
            class114 var64 = this.field5280[arg0][arg1];
            if (var64 != null) {
                if (this.field5276 == -1) {
                    for (int var65 = 0; var65 < var64.field1732; ++var65) {
                        int var66 = (arg0 << super.field5197) + var64.field1728[var65];
                        int var67 = var64.field1730[var65];
                        int var68 = (arg1 << super.field5197) + var64.field1726[var65];
                        int var69 = (this.field5283 * var68 + this.field5273 * var67 + this.field5272 * var66 >> 15) + this.field5274;
                        if (var69 <= this.field5282.field166) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field5282.field149;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field1725[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field5282.field140) {
                            int var72 = var69 - this.field5282.field149;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field5267 * var68 + this.field5275 * var66 + this.field5271 * var67 >> 15) + this.field5279;
                        int var74 = (this.field5285 * var68 + this.field5286 * var66 + this.field5284 * var67 >> 15) + this.field5277;
                        arg4[var65] = this.field5282.field137 * var73 / var69 + arg3.field1582;
                        arg5[var65] = this.field5282.field135 * var74 / var69 + arg3.field1592;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field1732; ++var75) {
                        int var115 = (arg0 << super.field5197) + var64.field1728[var75];
                        int var116 = var64.field1730[var75];
                        int var117 = (arg1 << super.field5197) + var64.field1726[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field5276 - this.field5282.field149;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field1725[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field5282.field140) {
                            int var120 = this.field5276 - this.field5282.field149;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field5267 * var117 + this.field5275 * var115 + this.field5271 * var116 >> 15) + this.field5279;
                        int var122 = (this.field5285 * var117 + this.field5286 * var115 + this.field5284 * var116 >> 15) + this.field5277;
                        arg4[var75] = this.field5282.field137 * var121 / this.field5276 + arg3.field1582;
                        arg5[var75] = this.field5282.field135 * var122 / this.field5276 + arg3.field1592;
                    }
                }
                if (var64.field1727 != null) {
                    int var76 = this.field5269[arg0][arg1];
                    int var77 = this.field5269[arg0 + 1][arg1];
                    int var78 = this.field5269[arg0][arg1 + 1];
                    int var79 = super.field5193 * arg0;
                    int var80 = super.field5193 + var79;
                    int var81 = super.field5193 * arg1;
                    int var82 = super.field5193 + var81;
                    int var83 = (this.field5267 * var81 + this.field5275 * var79 + this.field5271 * var76 >> 15) + this.field5279;
                    int var84 = (this.field5285 * var81 + this.field5286 * var79 + this.field5284 * var76 >> 15) + this.field5277;
                    int var85 = (this.field5283 * var81 + this.field5273 * var76 + this.field5272 * var79 >> 15) + this.field5274;
                    int var86 = (this.field5267 * var81 + this.field5275 * var80 + this.field5271 * var77 >> 15) + this.field5279;
                    int var87 = (this.field5285 * var81 + this.field5286 * var80 + this.field5284 * var77 >> 15) + this.field5277;
                    int var88 = (this.field5283 * var81 + this.field5273 * var77 + this.field5272 * var80 >> 15) + this.field5274;
                    int var89 = (this.field5267 * var82 + this.field5275 * var79 + this.field5271 * var78 >> 15) + this.field5279;
                    int var90 = (this.field5285 * var82 + this.field5286 * var79 + this.field5284 * var78 >> 15) + this.field5277;
                    int var91 = (this.field5283 * var82 + this.field5273 * var78 + this.field5272 * var79 >> 15) + this.field5274;
                    for (int var92 = 0; var92 < var64.field1733; ++var92) {
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
                            arg3.field1589 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field1586 || var97 > arg3.field1586 || var98 > arg3.field1586;
                            short var103 = var64.field1727[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method2092(this.field5282.field101.method1480(var103, 14270).field2412)) {
                                    arg3.field1590 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method797(var99, var100, var101, var96, var97, var98, this.field5282.field159, arg6[var93], arg6[var94], arg6[var95], var64.field1724[var93], var64.field1724[var94], var64.field1724[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field1724[var93] & 16777215) != 0) {
                                        arg3.method803(var99, var100, var101, var96, var97, var98, class290.method1800(var64.field1724[var93], 58, arg6[var93] << 24 | this.field5282.field159), class290.method1800(var64.field1724[var94], -116, arg6[var94] << 24 | this.field5282.field159), class290.method1800(var64.field1724[var95], -76, arg6[var95] << 24 | this.field5282.field159));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method799(var99, var100, var101, var96, var97, var98, var64.field1724[var93], var64.field1724[var94], var64.field1724[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field1724[var93] & 16777215) != 0) {
                                    arg3.method803(var99, var100, var101, var96, var97, var98, var64.field1724[var93], var64.field1724[var94], var64.field1724[var95]);
                                }
                                arg3.field1590 = 0;
                            } else {
                                arg3.method793(var99, var100, var101, var96, var97, var98, this.field5282.field159);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field1733; ++var104) {
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
                        arg3.field1589 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field1586 || var109 > arg3.field1586 || var110 > arg3.field1586;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field1724[var105] & 16777215) != 0) {
                                    arg3.method803(var111, var112, var113, var108, var109, var110, class445.method2611(var64.field1724[var105], (byte) -14, arg6[var105], this.field5282.field159), class445.method2611(var64.field1724[var106], (byte) -14, arg6[var106], this.field5282.field159), class445.method2611(var64.field1724[var107], (byte) -14, arg6[var107], this.field5282.field159));
                                }
                            } else if ((var64.field1724[var105] & 16777215) != 0) {
                                arg3.method803(var111, var112, var113, var108, var109, var110, var64.field1724[var105], var64.field1724[var106], var64.field1724[var107]);
                            }
                        } else {
                            arg3.method793(var111, var112, var113, var108, var109, var110, this.field5282.field159);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Z", line = 1711)
    private final boolean method2092(int arg0) {
        if ((this.field5278 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)V", line = 1727)
    public final void method704(int arg0, int arg1) {
        class215 var3 = this.field5282.method179(Thread.currentThread());
        var3.field3063.field1590 = 0;
        if (this.field5288 != null) {
            this.method2091(arg0, arg1, this.field5282.field169, var3.field3063, var3.field3103, var3.field3079, var3.field3075);
        } else {
            if (this.field5268 != null) {
                this.method2093(arg0, arg1, var3.field3063, var3.field3103, var3.field3079, var3.field3075);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Ldg;IIII[[I[[II)V", line = 2121)
    public class343(class13 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5282 = arg0;
        this.field5278 = arg2;
        this.field5269 = arg5;
        this.field5287 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field5282.field151 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field5282.field157 * var18 + this.field5282.field136 * var16 + this.field5282.field129 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field5287[var11][var10] = (byte) var20;
            }
        }
        this.field5281 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1748)
    public final void method713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class215 var9 = this.field5282.method179(Thread.currentThread());
        class106 var10 = var9.field3063;
        var10.field1590 = 0;
        var10.field1589 = false;
        if (this.field5288 != null) {
            this.method2089(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field3103, var9.field3079);
        } else {
            if (this.field5268 != null) {
                this.method2090(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field3103, var9.field3079);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IILbu;[I[I[I)V", line = 1763)
    private final void method2093(int arg0, int arg1, class106 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class499 var7 = this.field5268[arg0][arg1];
        if (var7 != null) {
            if ((var7.field7393 & 2) == 0) {
                int var8 = super.field5193 * arg0;
                int var9 = super.field5193 + var8;
                int var10 = super.field5193 * arg1;
                int var11 = super.field5193 + var10;
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
                if ((var7.field7393 & 1) != 0) {
                    int var12 = this.field5269[arg0][arg1];
                    int var16;
                    if (this.field5276 == -1) {
                        int var13 = this.field5273 * var12;
                        var14 = (this.field5283 * var10 + this.field5272 * var8 + var13 >> 15) + this.field5274;
                        if (var14 <= this.field5282.field166) {
                            return;
                        }
                        var15 = (this.field5283 * var10 + this.field5272 * var9 + var13 >> 15) + this.field5274;
                        if (var15 <= this.field5282.field166) {
                            return;
                        }
                        var16 = (this.field5283 * var11 + this.field5272 * var9 + var13 >> 15) + this.field5274;
                        if (var16 <= this.field5282.field166) {
                            return;
                        }
                        var17 = (this.field5283 * var11 + this.field5272 * var8 + var13 >> 15) + this.field5274;
                        if (var17 <= this.field5282.field166) {
                            return;
                        }
                    } else {
                        var17 = this.field5276;
                        var16 = this.field5276;
                        var15 = this.field5276;
                        var14 = this.field5276;
                    }
                    int var18 = this.field5271 * var12;
                    int var19 = this.field5284 * var12;
                    var20 = (this.field5267 * var10 + this.field5275 * var8 + var18 >> 15) + this.field5279;
                    var21 = this.field5282.field137 * var20 / var14 + arg2.field1582;
                    var22 = (this.field5285 * var10 + this.field5286 * var8 + var19 >> 15) + this.field5277;
                    var23 = this.field5282.field135 * var22 / var14 + arg2.field1592;
                    var24 = (this.field5267 * var10 + this.field5275 * var9 + var18 >> 15) + this.field5279;
                    var25 = this.field5282.field137 * var24 / var15 + arg2.field1582;
                    var26 = (this.field5285 * var10 + this.field5286 * var9 + var19 >> 15) + this.field5277;
                    var27 = this.field5282.field135 * var26 / var15 + arg2.field1592;
                    int var28 = (this.field5267 * var11 + this.field5275 * var9 + var18 >> 15) + this.field5279;
                    var29 = this.field5282.field137 * var28 / var16 + arg2.field1582;
                    int var30 = (this.field5285 * var11 + this.field5286 * var9 + var19 >> 15) + this.field5277;
                    var31 = this.field5282.field135 * var30 / var16 + arg2.field1592;
                    var32 = (this.field5267 * var11 + this.field5275 * var8 + var18 >> 15) + this.field5279;
                    var33 = this.field5282.field137 * var32 / var17 + arg2.field1582;
                    var34 = (this.field5285 * var11 + this.field5286 * var8 + var19 >> 15) + this.field5277;
                    var35 = this.field5282.field135 * var34 / var17 + arg2.field1592;
                } else {
                    int var36 = this.field5269[arg0][arg1];
                    int var37 = this.field5269[arg0 + 1][arg1];
                    int var38 = this.field5269[arg0 + 1][arg1 + 1];
                    int var39 = this.field5269[arg0][arg1 + 1];
                    int var40;
                    if (this.field5276 == -1) {
                        var14 = (this.field5283 * var10 + this.field5273 * var36 + this.field5272 * var8 >> 15) + this.field5274;
                        if (var14 <= this.field5282.field166) {
                            return;
                        }
                        var15 = (this.field5283 * var10 + this.field5273 * var37 + this.field5272 * var9 >> 15) + this.field5274;
                        if (var15 <= this.field5282.field166) {
                            return;
                        }
                        var40 = (this.field5283 * var11 + this.field5273 * var38 + this.field5272 * var9 >> 15) + this.field5274;
                        if (var40 <= this.field5282.field166) {
                            return;
                        }
                        var17 = (this.field5283 * var11 + this.field5273 * var39 + this.field5272 * var8 >> 15) + this.field5274;
                        if (var17 <= this.field5282.field166) {
                            return;
                        }
                    } else {
                        var17 = this.field5276;
                        var40 = this.field5276;
                        var15 = this.field5276;
                        var14 = this.field5276;
                    }
                    var20 = (this.field5267 * var10 + this.field5275 * var8 + this.field5271 * var36 >> 15) + this.field5279;
                    var21 = this.field5282.field137 * var20 / var14 + arg2.field1582;
                    var22 = (this.field5285 * var10 + this.field5286 * var8 + this.field5284 * var36 >> 15) + this.field5277;
                    var23 = this.field5282.field135 * var22 / var14 + arg2.field1592;
                    var24 = (this.field5267 * var10 + this.field5275 * var9 + this.field5271 * var37 >> 15) + this.field5279;
                    var25 = this.field5282.field137 * var24 / var15 + arg2.field1582;
                    var26 = (this.field5285 * var10 + this.field5286 * var9 + this.field5284 * var37 >> 15) + this.field5277;
                    var27 = this.field5282.field135 * var26 / var15 + arg2.field1592;
                    int var41 = (this.field5267 * var11 + this.field5275 * var9 + this.field5271 * var38 >> 15) + this.field5279;
                    var29 = this.field5282.field137 * var41 / var40 + arg2.field1582;
                    int var42 = (this.field5285 * var11 + this.field5286 * var9 + this.field5284 * var38 >> 15) + this.field5277;
                    var31 = this.field5282.field135 * var42 / var40 + arg2.field1592;
                    var32 = (this.field5267 * var11 + this.field5275 * var8 + this.field5271 * var39 >> 15) + this.field5279;
                    var33 = this.field5282.field137 * var32 / var17 + arg2.field1582;
                    var34 = (this.field5285 * var11 + this.field5286 * var8 + this.field5284 * var39 >> 15) + this.field5277;
                    var35 = this.field5282.field135 * var34 / var17 + arg2.field1592;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field1589 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field1586 || var33 > arg2.field1586 || var25 > arg2.field1586;
                    if (var7.field7392 >= 0) {
                        if (this.method2092(this.field5282.field101.method1480(var7.field7392, 14270).field2412)) {
                            arg2.field1590 = 100;
                        }
                        arg2.method799(var31, var35, var27, var29, var33, var25, var7.field7395 & 65535, var7.field7397 & 65535, var7.field7391 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field7392);
                        arg2.field1590 = 0;
                    } else {
                        arg2.method802(var31, var35, var27, var29, var33, var25, var7.field7395 & 65535, var7.field7397 & 65535, var7.field7391 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field1589 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field1586 || var25 > arg2.field1586 || var33 > arg2.field1586;
                    if (var7.field7392 >= 0) {
                        if (this.method2092(this.field5282.field101.method1480(var7.field7392, 14270).field2412)) {
                            arg2.field1590 = 100;
                        }
                        arg2.method799(var23, var27, var35, var21, var25, var33, var7.field7396 & 65535, var7.field7391 & 65535, var7.field7397 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field7392);
                        arg2.field1590 = 0;
                        return;
                    }
                    arg2.method802(var23, var27, var35, var21, var25, var33, var7.field7396 & 65535, var7.field7391 & 65535, var7.field7397 & 65535);
                }
            }
        } else {
            class28 var43 = this.field5270[arg0][arg1];
            if (var43 != null) {
                if (this.field5276 == -1) {
                    for (int var44 = 0; var44 < var43.field403; ++var44) {
                        int var45 = (arg0 << super.field5197) + var43.field401[var44];
                        short var46 = var43.field406[var44];
                        int var47 = (arg1 << super.field5197) + var43.field398[var44];
                        int var48 = (this.field5283 * var47 + this.field5273 * var46 + this.field5272 * var45 >> 15) + this.field5274;
                        if (var48 <= this.field5282.field166) {
                            return;
                        }
                        int var49 = (this.field5267 * var47 + this.field5275 * var45 + this.field5271 * var46 >> 15) + this.field5279;
                        int var50 = (this.field5285 * var47 + this.field5286 * var45 + this.field5284 * var46 >> 15) + this.field5277;
                        arg3[var44] = this.field5282.field137 * var49 / var48 + arg2.field1582;
                        arg4[var44] = this.field5282.field135 * var50 / var48 + arg2.field1592;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field403; ++var51) {
                        int var91 = (arg0 << super.field5197) + var43.field401[var51];
                        short var92 = var43.field406[var51];
                        int var93 = (arg1 << super.field5197) + var43.field398[var51];
                        int var94 = (this.field5267 * var93 + this.field5275 * var91 + this.field5271 * var92 >> 15) + this.field5279;
                        int var95 = (this.field5285 * var93 + this.field5286 * var91 + this.field5284 * var92 >> 15) + this.field5277;
                        arg3[var51] = this.field5282.field137 * var94 / this.field5276 + arg2.field1582;
                        arg4[var51] = this.field5282.field135 * var95 / this.field5276 + arg2.field1592;
                    }
                }
                if (var43.field404 != null) {
                    int var52 = this.field5269[arg0][arg1];
                    int var53 = this.field5269[arg0 + 1][arg1];
                    int var54 = this.field5269[arg0][arg1 + 1];
                    int var55 = super.field5193 * arg0;
                    int var56 = super.field5193 + var55;
                    int var57 = super.field5193 * arg1;
                    int var58 = super.field5193 + var57;
                    int var59 = (this.field5267 * var57 + this.field5275 * var55 + this.field5271 * var52 >> 15) + this.field5279;
                    int var60 = (this.field5285 * var57 + this.field5286 * var55 + this.field5284 * var52 >> 15) + this.field5277;
                    int var61 = (this.field5283 * var57 + this.field5273 * var52 + this.field5272 * var55 >> 15) + this.field5274;
                    int var62 = (this.field5267 * var57 + this.field5275 * var56 + this.field5271 * var53 >> 15) + this.field5279;
                    int var63 = (this.field5285 * var57 + this.field5286 * var56 + this.field5284 * var53 >> 15) + this.field5277;
                    int var64 = (this.field5283 * var57 + this.field5273 * var53 + this.field5272 * var56 >> 15) + this.field5274;
                    int var65 = (this.field5267 * var58 + this.field5275 * var55 + this.field5271 * var54 >> 15) + this.field5279;
                    int var66 = (this.field5285 * var58 + this.field5286 * var55 + this.field5284 * var54 >> 15) + this.field5277;
                    int var67 = (this.field5283 * var58 + this.field5273 * var54 + this.field5272 * var55 >> 15) + this.field5274;
                    for (int var68 = 0; var68 < var43.field399; ++var68) {
                        short var69 = var43.field408[var68];
                        short var70 = var43.field407[var68];
                        short var71 = var43.field405[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field1589 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field1586 || var73 > arg2.field1586 || var74 > arg2.field1586;
                            short var78 = var43.field404[var68];
                            if (var78 != -1) {
                                if (this.method2092(this.field5282.field101.method1480(var78, 14270).field2412)) {
                                    arg2.field1590 = 100;
                                }
                                arg2.method799(var75, var76, var77, var72, var73, var74, var43.field400[var69], var43.field400[var70], var43.field400[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field1590 = 0;
                            } else {
                                int var79 = var43.field397[var68];
                                if (var79 != -1) {
                                    arg2.method802(var75, var76, var77, var72, var73, var74, class17.method197(var79, -121, var43.field400[var69]), class17.method197(var79, -104, var43.field400[var70]), class17.method197(var79, -125, var43.field400[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field399; ++var80) {
                    short var81 = var43.field408[var80];
                    short var82 = var43.field407[var80];
                    short var83 = var43.field405[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field397[var80];
                        if (var90 != -1) {
                            arg2.field1589 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field1586 || var85 > arg2.field1586 || var86 > arg2.field1586;
                            arg2.method802(var87, var88, var89, var84, var85, var86, class17.method197(var90, -125, var43.field400[var81]), class17.method197(var90, -110, var43.field400[var82]), class17.method197(var90, -90, var43.field400[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lwr;[I)V", line = 2117)
    public final void method715(class531 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[[ZZ)V", line = 2175)
    public final void method711(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class308 var6 = this.field5282.field134;
        this.field5276 = -1;
        this.field5275 = var6.field4625;
        this.field5271 = var6.field4630;
        this.field5267 = var6.field4627;
        this.field5279 = var6.field4628;
        this.field5286 = var6.field4620;
        this.field5284 = var6.field4622;
        this.field5285 = var6.field4631;
        this.field5277 = var6.field4629;
        this.field5272 = var6.field4623;
        this.field5273 = var6.field4621;
        this.field5283 = var6.field4626;
        this.field5274 = var6.field4624;
    }
}
