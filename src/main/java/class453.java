import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class453 extends class37 {

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    private int field6368 = -1;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Lcb;")
    private class483 field6365;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    private int field6360;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "[[B")
    private byte[][] field6358;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "[[B")
    private byte[][] field6374;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "F")
    private float field6355;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "F")
    private float field6356;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "F")
    private float field6359;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "F")
    private float field6361;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "F")
    private float field6362;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "F")
    private float field6364;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "F")
    private float field6366;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "F")
    private float field6367;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "F")
    private float field6369;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "F")
    private float field6370;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "F")
    private float field6373;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "F")
    private float field6375;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "[[Lafa;")
    private class316[][] field6357;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "[[Lde;")
    private class492[][] field6363;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "[[Lwc;")
    private class60[][] field6371;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "[[Lrv;")
    private class93[][] field6372;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII[[ZLqr;Lue;[I[I)V")
    private final void method2683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class59 arg8, class211 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field932;
        this.field6365.method309(false);
        arg9.field2558 = false;
        arg9.field2562 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field6357[var18][var19] != null) {
                        class316 var20 = this.field6357[var18][var19];
                        if (var20.field4181 != -1 && (var20.field4183 & 2) == 0 && var20.field4182 == -1) {
                            int var21 = this.field6365.method2828(var20.field4181);
                            arg9.method1259(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class693.method3906(var20.field4186 & 65535, 126, var21), class693.method3906(var20.field4184 & 65535, 126, var21), class693.method3906(var20.field4180 & 65535, 126, var21));
                            arg9.method1259(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class693.method3906(var20.field4185 & 65535, 126, var21), class693.method3906(var20.field4180 & 65535, 126, var21), class693.method3906(var20.field4184 & 65535, 126, var21));
                        } else if (var20.field4182 == -1) {
                            arg9.method1259(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field4186 & 65535, var20.field4184 & 65535, var20.field4180 & 65535);
                            arg9.method1259(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field4185 & 65535, var20.field4180 & 65535, var20.field4184 & 65535);
                        } else {
                            int var22 = var20.field4182;
                            arg9.method1259(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg9.method1259(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (this.field6372[var18][var19] != null) {
                        class93 var23 = this.field6372[var18][var19];
                        for (int var24 = 0; var24 < var23.field1290; ++var24) {
                            arg10[var24] = var23.field1291[var24] * var14 / super.field695 + var16;
                            arg11[var24] = var17 - var23.field1295[var24] * var14 / super.field695;
                        }
                        for (int var25 = 0; var25 < var23.field1285; ++var25) {
                            short var26 = var23.field1296[var25];
                            short var27 = var23.field1288[var25];
                            short var28 = var23.field1284[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field1289 != null && var23.field1289[var25] != -1) {
                                int var35 = var23.field1289[var25];
                                arg9.method1259(var32, var33, var34, var29, var30, var31, 100, 100, 100, class693.method3906(var23.field1287[var26], 126, var35), class693.method3906(var23.field1287[var27], 126, var35), class693.method3906(var23.field1287[var28], 126, var35));
                            } else if (var23.field1294 != null && var23.field1294[var25] != -1) {
                                int var36 = this.field6365.method2828(var23.field1294[var25]);
                                arg9.method1259(var32, var33, var34, var29, var30, var31, 100, 100, 100, class693.method3906(var23.field1287[var26], 126, var36), class693.method3906(var23.field1287[var27], 126, var36), class693.method3906(var23.field1287[var28], 126, var36));
                            } else {
                                int var37 = var23.field1293[var25];
                                arg9.method1259(var32, var33, var34, var29, var30, var31, 100, 100, 100, class693.method3906(var23.field1287[var26], 126, var37), class693.method3906(var23.field1287[var27], 126, var37), class693.method3906(var23.field1287[var28], 126, var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field2558 = true;
        this.field6365.method309(var15);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field6357 == null) {
            this.field6357 = new class316[super.field702][super.field706];
            this.field6372 = new class93[super.field702][super.field706];
        } else if (this.field6363 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field695 != var20 || var21 != 0 && super.field695 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class93 var22 = new class93();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1290 = var23;
            var22.field1287 = new short[var23];
            var22.field1291 = new short[var23];
            var22.field1286 = new short[var23];
            var22.field1295 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1287[var25] = (short) (this.field6358[arg0][arg1] - this.field6374[arg0][arg1]);
                } else if (var30 == 0 && super.field695 == var31) {
                    var22.field1287[var25] = (short) (this.field6358[arg0][arg1 + 1] - this.field6374[arg0][arg1 + 1]);
                } else if (super.field695 == var30 && super.field695 == var31) {
                    var22.field1287[var25] = (short) (this.field6358[arg0 + 1][arg1 + 1] - this.field6374[arg0 + 1][arg1 + 1]);
                } else if (super.field695 == var30 && var31 == 0) {
                    var22.field1287[var25] = (short) (this.field6358[arg0 + 1][arg1] - this.field6374[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field6358[arg0 + 1][arg1] - this.field6374[arg0 + 1][arg1]) * var30 + (this.field6358[arg0][arg1] - this.field6374[arg0][arg1]) * (super.field695 - var30);
                    int var33 = (this.field6358[arg0 + 1][arg1 + 1] - this.field6374[arg0 + 1][arg1 + 1]) * var30 + (this.field6358[arg0][arg1 + 1] - this.field6374[arg0][arg1 + 1]) * (super.field695 - var30);
                    var22.field1287[var25] = (short) ((super.field695 - var31) * var32 + var31 * var33 >> super.field696 * 2);
                }
                int var34 = (arg0 << super.field696) + var30;
                int var35 = (arg1 << super.field696) + var31;
                var22.field1291[var25] = (short) var30;
                var22.field1295[var25] = (short) var31;
                var22.field1286[var25] = (short) (this.method428(true, var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1287[var25] < 2) {
                    var22.field1287[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field6365.field2023.method397(arg11[var28], (byte) 84).field4706) {
                    var26 = true;
                }
            }
            var22.field1293 = new int[var27];
            if (arg10 != null) {
                var22.field1289 = new int[var27];
            }
            var22.field1296 = new short[var27];
            var22.field1288 = new short[var27];
            var22.field1284 = new short[var27];
            if (var26) {
                var22.field1294 = new short[var27];
                var22.field1292 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1293[var22.field1285] = class642.method3653((byte) 3, arg9[var29]);
                    } else {
                        var22.field1293[var22.field1285] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1289[var22.field1285] = class642.method3653((byte) 3, arg10[var29]);
                        } else {
                            var22.field1289[var22.field1285] = -1;
                        }
                    }
                    var22.field1296[var22.field1285] = (short) arg6[var29];
                    var22.field1288[var22.field1285] = (short) arg7[var29];
                    var22.field1284[var22.field1285] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field6365.field2023.method397(arg11[var29], (byte) 11).field4706) {
                            var22.field1294[var22.field1285] = (short) arg11[var29];
                            var22.field1292[var22.field1285] = (short) arg12[var29];
                        } else {
                            var22.field1294[var22.field1285] = -1;
                        }
                    }
                    ++var22.field1285;
                }
            }
            this.field6372[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class316 var36 = new class316();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field4182 = class693.method3906(this.field6358[arg0][arg1] - this.field6374[arg0][arg1], 126, class642.method3653((byte) 3, arg10[0]));
                    if (var37 == -1) {
                        var36.field4183 = (byte) (var36.field4183 | 2);
                    }
                }
                if (super.field700[arg0 + 1][arg1] == super.field700[arg0][arg1] && super.field700[arg0 + 1][arg1 + 1] == super.field700[arg0][arg1] && super.field700[arg0][arg1 + 1] == super.field700[arg0][arg1]) {
                    var36.field4183 = (byte) (var36.field4183 | 1);
                }
                if (var38 != -1 && (var36.field4183 & 2) == 0 && !this.field6365.field2023.method397(var38, (byte) -121).field4706) {
                    var36.field4185 = (short) (this.field6358[arg0][arg1] - this.field6374[arg0][arg1]);
                    var36.field4180 = (short) (this.field6358[arg0 + 1][arg1] - this.field6374[arg0 + 1][arg1]);
                    var36.field4186 = (short) (this.field6358[arg0 + 1][arg1 + 1] - this.field6374[arg0 + 1][arg1 + 1]);
                    var36.field4184 = (short) (this.field6358[arg0][arg1 + 1] - this.field6374[arg0][arg1 + 1]);
                    var36.field4181 = (short) var38;
                } else {
                    short var39 = class642.method3653((byte) 3, var37);
                    var36.field4185 = (short) class693.method3906(this.field6358[arg0][arg1] - this.field6374[arg0][arg1], 126, var39);
                    var36.field4180 = (short) class693.method3906(this.field6358[arg0 + 1][arg1] - this.field6374[arg0 + 1][arg1], 126, var39);
                    var36.field4186 = (short) class693.method3906(this.field6358[arg0 + 1][arg1 + 1] - this.field6374[arg0 + 1][arg1 + 1], 126, var39);
                    var36.field4184 = (short) class693.method3906(this.field6358[arg0][arg1 + 1] - this.field6374[arg0][arg1 + 1], 126, var39);
                    var36.field4181 = -1;
                }
                this.field6357[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIIII[[ZLqr;Lue;[I[I)V")
    private final void method2684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class59 arg8, class211 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field932;
        this.field6365.method309(false);
        arg9.field2558 = false;
        arg9.field2562 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field6363[var18][var19] != null) {
                        class492 var20 = this.field6363[var18][var19];
                        if (var20.field6880 != -1 && (var20.field6887 & 2) == 0 && var20.field6884 == 0) {
                            int var21 = this.field6365.method2828(var20.field6880);
                            arg9.method1259(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class693.method3906(var20.field6879, 126, var21), class693.method3906(var20.field6888, 126, var21), class693.method3906(var20.field6883, 126, var21));
                            arg9.method1259(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class693.method3906(var20.field6882, 126, var21), class693.method3906(var20.field6883, 126, var21), class693.method3906(var20.field6888, 126, var21));
                        } else if (var20.field6884 == 0) {
                            arg9.method1257(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field6879, var20.field6888, var20.field6883);
                            arg9.method1257(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field6882, var20.field6883, var20.field6888);
                        } else {
                            int var22 = var20.field6884;
                            arg9.method1257(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class478.method2807((byte) 59, var22, var20.field6879 & -16777216), class478.method2807((byte) 110, var22, var20.field6888 & -16777216), class478.method2807((byte) 101, var22, var20.field6883 & -16777216));
                            arg9.method1257(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class478.method2807((byte) 126, var22, var20.field6882 & -16777216), class478.method2807((byte) 96, var22, var20.field6883 & -16777216), class478.method2807((byte) 63, var22, var20.field6888 & -16777216));
                        }
                    } else if (this.field6371[var18][var19] != null) {
                        class60 var23 = this.field6371[var18][var19];
                        for (int var24 = 0; var24 < var23.field979; ++var24) {
                            arg10[var24] = var23.field986[var24] * var14 / super.field695 + var16;
                            arg11[var24] = var17 - var23.field981[var24] * var14 / super.field695;
                        }
                        for (int var25 = 0; var25 < var23.field985; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field980 != null && var23.field980[var25] != 0 && (var23.field984 == null || var23.field984 != null && var23.field984[var25] == -1)) {
                                int var35 = var23.field980[var25];
                                arg9.method1257(var32, var33, var34, var29, var30, var31, 100, 100, 100, class478.method2807((byte) 127, var35, -16777216 - (var23.field988[var26] & -16777216)), class478.method2807((byte) 63, var35, -16777216 - (var23.field988[var27] & -16777216)), class478.method2807((byte) 105, var35, -16777216 - (var23.field988[var28] & -16777216)));
                            } else if (var23.field984 != null && var23.field984[var25] != -1) {
                                int var36 = this.field6365.method2828(var23.field984[var25]);
                                arg9.method1259(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                            } else {
                                arg9.method1257(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field988[var26], var23.field988[var27], var23.field988[var28]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field2558 = true;
        this.field6365.method309(var15);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lul;[I)V")
    public final void method426(class530 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
    public final void method434(int arg0, int arg1, int arg2) {
        if (this.field6374[arg0][arg1] < arg2) {
            this.field6374[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
    private static final int method2685(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Z")
    private final boolean method2686(int arg0) {
        if ((this.field6360 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method429(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZLqr;Lue;[I[I[I[I)V")
    private final void method2687(int arg0, int arg1, boolean arg2, class59 arg3, class211 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8) {
        class492 var10 = this.field6363[arg0][arg1];
        if (var10 != null) {
            if ((var10.field6887 & 2) == 0) {
                int var11 = super.field695 * arg0;
                int var12 = super.field695 + var11;
                int var13 = super.field695 * arg1;
                int var14 = super.field695 + var13;
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
                if ((var10.field6887 & 1) != 0 && !arg2) {
                    int var19 = super.field700[arg0][arg1];
                    float var20 = (float) var19 * this.field6361;
                    if (this.field6368 == -1) {
                        var21 = (float) var13 * this.field6369 + (float) var11 * this.field6355 + var20 + this.field6356;
                        if (var21 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var22 = (float) var13 * this.field6369 + (float) var12 * this.field6355 + var20 + this.field6356;
                        if (var22 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var23 = (float) var14 * this.field6369 + (float) var12 * this.field6355 + var20 + this.field6356;
                        if (var23 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var24 = (float) var14 * this.field6369 + (float) var11 * this.field6355 + var20 + this.field6356;
                        if (var24 <= (float) this.field6365.field6762) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field6369 + (float) var11 * this.field6355 + var20 + this.field6356;
                        var22 = (float) var13 * this.field6369 + (float) var12 * this.field6355 + var20 + this.field6356;
                        var23 = (float) var14 * this.field6369 + (float) var12 * this.field6355 + var20 + this.field6356;
                        var24 = (float) var14 * this.field6369 + (float) var11 * this.field6355 + var20 + this.field6356;
                    }
                    if (arg3.field942) {
                        int var25 = (int) (var21 - (float) arg3.field938);
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = (int) (var22 - (float) arg3.field938);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field938);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field938);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    float var29 = (float) var19 * this.field6364;
                    float var30 = (float) var19 * this.field6375;
                    if (this.field6368 == -1) {
                        var31 = (float) var13 * this.field6362 + (float) var11 * this.field6370 + var29 + this.field6373;
                        var32 = (int) ((float) this.field6365.field6772 * var31 / var21) + arg4.field2564;
                        var33 = (float) var13 * this.field6367 + (float) var11 * this.field6359 + var30 + this.field6366;
                        var34 = (int) ((float) this.field6365.field6771 * var33 / var21) + arg4.field2559;
                        var35 = (float) var13 * this.field6362 + (float) var12 * this.field6370 + var29 + this.field6373;
                        var36 = (int) ((float) this.field6365.field6772 * var35 / var22) + arg4.field2564;
                        var37 = (float) var13 * this.field6367 + (float) var12 * this.field6359 + var30 + this.field6366;
                        var38 = (int) ((float) this.field6365.field6771 * var37 / var22) + arg4.field2559;
                        var39 = (float) var14 * this.field6362 + (float) var12 * this.field6370 + var29 + this.field6373;
                        var40 = (int) ((float) this.field6365.field6772 * var39 / var23) + arg4.field2564;
                        var41 = (float) var14 * this.field6367 + (float) var12 * this.field6359 + var30 + this.field6366;
                        var42 = (int) ((float) this.field6365.field6771 * var41 / var23) + arg4.field2559;
                        var43 = (float) var14 * this.field6362 + (float) var11 * this.field6370 + var29 + this.field6373;
                        var44 = (int) ((float) this.field6365.field6772 * var43 / var24) + arg4.field2564;
                        var45 = (float) var14 * this.field6367 + (float) var11 * this.field6359 + var30 + this.field6366;
                        var46 = (int) ((float) this.field6365.field6771 * var45 / var24) + arg4.field2559;
                    } else {
                        var31 = (float) var13 * this.field6362 + (float) var11 * this.field6370 + var29 + this.field6373;
                        var32 = (int) ((float) this.field6365.field6772 * var31 / (float) this.field6368) + arg4.field2564;
                        var33 = (float) var13 * this.field6367 + (float) var11 * this.field6359 + var30 + this.field6366;
                        var34 = (int) ((float) this.field6365.field6771 * var33 / (float) this.field6368) + arg4.field2559;
                        var35 = (float) var13 * this.field6362 + (float) var12 * this.field6370 + var29 + this.field6373;
                        var36 = (int) ((float) this.field6365.field6772 * var35 / (float) this.field6368) + arg4.field2564;
                        var37 = (float) var13 * this.field6367 + (float) var12 * this.field6359 + var30 + this.field6366;
                        var38 = (int) ((float) this.field6365.field6771 * var37 / (float) this.field6368) + arg4.field2559;
                        var39 = (float) var14 * this.field6362 + (float) var12 * this.field6370 + var29 + this.field6373;
                        var40 = (int) ((float) this.field6365.field6772 * var39 / (float) this.field6368) + arg4.field2564;
                        var41 = (float) var14 * this.field6367 + (float) var12 * this.field6359 + var30 + this.field6366;
                        var42 = (int) ((float) this.field6365.field6771 * var41 / (float) this.field6368) + arg4.field2559;
                        var43 = (float) var14 * this.field6362 + (float) var11 * this.field6370 + var29 + this.field6373;
                        var44 = (int) ((float) this.field6365.field6772 * var43 / (float) this.field6368) + arg4.field2564;
                        var45 = (float) var14 * this.field6367 + (float) var11 * this.field6359 + var30 + this.field6366;
                        var46 = (int) ((float) this.field6365.field6771 * var45 / (float) this.field6368) + arg4.field2559;
                    }
                } else {
                    int var47 = super.field700[arg0][arg1];
                    int var48 = super.field700[arg0 + 1][arg1];
                    int var49 = super.field700[arg0 + 1][arg1 + 1];
                    int var50 = super.field700[arg0][arg1 + 1];
                    if (this.field6368 == -1) {
                        var21 = (float) var13 * this.field6369 + (float) var11 * this.field6355 + (float) var47 * this.field6361 + this.field6356;
                        if (var21 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var22 = (float) var13 * this.field6369 + (float) var12 * this.field6355 + (float) var48 * this.field6361 + this.field6356;
                        if (var22 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var23 = (float) var14 * this.field6369 + (float) var12 * this.field6355 + (float) var49 * this.field6361 + this.field6356;
                        if (var23 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var24 = (float) var14 * this.field6369 + (float) var11 * this.field6355 + (float) var50 * this.field6361 + this.field6356;
                        if (var24 <= (float) this.field6365.field6762) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field6369 + (float) var11 * this.field6355 + (float) var47 * this.field6361 + this.field6356;
                        var22 = (float) var13 * this.field6369 + (float) var12 * this.field6355 + (float) var48 * this.field6361 + this.field6356;
                        var23 = (float) var14 * this.field6369 + (float) var12 * this.field6355 + (float) var49 * this.field6361 + this.field6356;
                        var24 = (float) var14 * this.field6369 + (float) var11 * this.field6355 + (float) var50 * this.field6361 + this.field6356;
                    }
                    if (arg2) {
                        int var51 = (int) (var21 - (float) arg3.field938);
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field6885 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = (int) (var22 - (float) arg3.field938);
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field6886 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = (int) (var23 - (float) arg3.field938);
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field6881 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = (int) (var24 - (float) arg3.field938);
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field6878 * var57 / 255;
                            if (var58 > 0) {
                                var50 -= var58;
                            }
                        }
                    } else if (arg3.field942) {
                        int var59 = (int) (var21 - (float) arg3.field938);
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = (int) (var22 - (float) arg3.field938);
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = (int) (var23 - (float) arg3.field938);
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = (int) (var24 - (float) arg3.field938);
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    if (this.field6368 == -1) {
                        var31 = (float) var13 * this.field6362 + (float) var11 * this.field6370 + (float) var47 * this.field6364 + this.field6373;
                        var32 = (int) ((float) this.field6365.field6772 * var31 / var21) + arg4.field2564;
                        var33 = (float) var13 * this.field6367 + (float) var11 * this.field6359 + (float) var47 * this.field6375 + this.field6366;
                        var34 = (int) ((float) this.field6365.field6771 * var33 / var21) + arg4.field2559;
                        var35 = (float) var13 * this.field6362 + (float) var12 * this.field6370 + (float) var48 * this.field6364 + this.field6373;
                        var36 = (int) ((float) this.field6365.field6772 * var35 / var22) + arg4.field2564;
                        var37 = (float) var13 * this.field6367 + (float) var12 * this.field6359 + (float) var48 * this.field6375 + this.field6366;
                        var38 = (int) ((float) this.field6365.field6771 * var37 / var22) + arg4.field2559;
                        var39 = (float) var14 * this.field6362 + (float) var12 * this.field6370 + (float) var49 * this.field6364 + this.field6373;
                        var40 = (int) ((float) this.field6365.field6772 * var39 / var23) + arg4.field2564;
                        var41 = (float) var14 * this.field6367 + (float) var12 * this.field6359 + (float) var49 * this.field6375 + this.field6366;
                        var42 = (int) ((float) this.field6365.field6771 * var41 / var23) + arg4.field2559;
                        var43 = (float) var14 * this.field6362 + (float) var11 * this.field6370 + (float) var50 * this.field6364 + this.field6373;
                        var44 = (int) ((float) this.field6365.field6772 * var43 / var24) + arg4.field2564;
                        var45 = (float) var14 * this.field6367 + (float) var11 * this.field6359 + (float) var50 * this.field6375 + this.field6366;
                        var46 = (int) ((float) this.field6365.field6771 * var45 / var24) + arg4.field2559;
                    } else {
                        var31 = (float) var13 * this.field6362 + (float) var11 * this.field6370 + (float) var47 * this.field6364 + this.field6373;
                        var32 = (int) ((float) this.field6365.field6772 * var31 / (float) this.field6368) + arg4.field2564;
                        var33 = (float) var13 * this.field6367 + (float) var11 * this.field6359 + (float) var47 * this.field6375 + this.field6366;
                        var34 = (int) ((float) this.field6365.field6771 * var33 / (float) this.field6368) + arg4.field2559;
                        var35 = (float) var13 * this.field6362 + (float) var12 * this.field6370 + (float) var48 * this.field6364 + this.field6373;
                        var36 = (int) ((float) this.field6365.field6772 * var35 / (float) this.field6368) + arg4.field2564;
                        var37 = (float) var13 * this.field6367 + (float) var12 * this.field6359 + (float) var48 * this.field6375 + this.field6366;
                        var38 = (int) ((float) this.field6365.field6771 * var37 / (float) this.field6368) + arg4.field2559;
                        var39 = (float) var14 * this.field6362 + (float) var12 * this.field6370 + (float) var49 * this.field6364 + this.field6373;
                        var40 = (int) ((float) this.field6365.field6772 * var39 / (float) this.field6368) + arg4.field2564;
                        var41 = (float) var14 * this.field6367 + (float) var12 * this.field6359 + (float) var49 * this.field6375 + this.field6366;
                        var42 = (int) ((float) this.field6365.field6771 * var41 / (float) this.field6368) + arg4.field2559;
                        var43 = (float) var14 * this.field6362 + (float) var11 * this.field6370 + (float) var50 * this.field6364 + this.field6373;
                        var44 = (int) ((float) this.field6365.field6772 * var43 / (float) this.field6368) + arg4.field2564;
                        var45 = (float) var14 * this.field6367 + (float) var11 * this.field6359 + (float) var50 * this.field6375 + this.field6366;
                        var46 = (int) ((float) this.field6365.field6771 * var45 / (float) this.field6368) + arg4.field2559;
                    }
                }
                boolean var63 = var10.field6880 != -1 && this.method2686(this.field6365.field2023.method397(var10.field6880, (byte) 35).field4707);
                if (this.field6368 == -1) {
                    int var64 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field2572 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field2573 || var44 > arg4.field2573 || var36 > arg4.field2573;
                        if (var64 < 765) {
                            if (var63) {
                                arg4.field2563 = 100;
                            }
                            if (var64 > 0) {
                                if (var10.field6880 >= 0) {
                                    arg4.method1272(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field927, var17, var18, var16, var10.field6879, var10.field6888, var10.field6883, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field6880);
                                } else {
                                    arg4.method1257(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class478.method2807((byte) 63, var10.field6879, var17 << 24 | arg3.field927), class478.method2807((byte) 95, var10.field6888, var18 << 24 | arg3.field927), class478.method2807((byte) 74, var10.field6883, var16 << 24 | arg3.field927));
                                }
                            } else if (var10.field6880 >= 0) {
                                arg4.method1270(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field6879, var10.field6888, var10.field6883, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field6880);
                            } else {
                                arg4.method1257(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field6879, var10.field6888, var10.field6883);
                            }
                            arg4.field2563 = 0;
                        } else {
                            arg4.method1263(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field927);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field2572 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field2573 || var36 > arg4.field2573 || var44 > arg4.field2573;
                        if (var65 < 765) {
                            if (var63) {
                                arg4.field2563 = 100;
                            }
                            if (var65 > 0) {
                                if (var10.field6880 >= 0) {
                                    arg4.method1272(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field927, var15, var16, var18, var10.field6882, var10.field6883, var10.field6888, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field6880);
                                } else {
                                    arg4.method1257(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class478.method2807((byte) 107, var10.field6882, var15 << 24 | arg3.field927), class478.method2807((byte) 81, var10.field6883, var16 << 24 | arg3.field927), class478.method2807((byte) 61, var10.field6888, var18 << 24 | arg3.field927));
                                }
                            } else if (var10.field6880 >= 0) {
                                arg4.method1270(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field6882, var10.field6883, var10.field6888, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field6880);
                            } else {
                                arg4.method1257(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field6882, var10.field6883, var10.field6888);
                            }
                            arg4.field2563 = 0;
                            return;
                        }
                        arg4.method1263(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field927);
                        return;
                    }
                } else {
                    int var66 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field2572 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field2573 || var44 > arg4.field2573 || var36 > arg4.field2573;
                        if (var66 < 765) {
                            if (var63) {
                                arg4.field2563 = 100;
                            }
                            if (var66 > 0) {
                                if (var10.field6880 >= 0) {
                                    arg4.method1272(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field927, var17, var18, var16, var10.field6879, var10.field6888, var10.field6883, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field6368, this.field6368, this.field6368, var10.field6880);
                                } else {
                                    arg4.method1257(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class478.method2807((byte) 126, var10.field6879, var17 << 24 | arg3.field927), class478.method2807((byte) 122, var10.field6888, var18 << 24 | arg3.field927), class478.method2807((byte) 92, var10.field6883, var16 << 24 | arg3.field927));
                                }
                            } else if (var10.field6880 >= 0) {
                                arg4.method1270(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field6879, var10.field6888, var10.field6883, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field6368, this.field6368, this.field6368, var10.field6880);
                            } else {
                                arg4.method1257(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field6879, var10.field6888, var10.field6883);
                            }
                            arg4.field2563 = 0;
                        } else {
                            arg4.method1263(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field927);
                        }
                    }
                    int var67 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field2572 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field2573 || var36 > arg4.field2573 || var44 > arg4.field2573;
                        if (var67 < 765) {
                            if (var63) {
                                arg4.field2563 = 100;
                            }
                            if (var67 > 0) {
                                if (var10.field6880 >= 0) {
                                    arg4.method1272(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field927, var15, var16, var18, var10.field6882, var10.field6883, var10.field6888, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field6368, this.field6368, this.field6368, var10.field6880);
                                } else {
                                    arg4.method1257(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class478.method2807((byte) 96, var10.field6882, var15 << 24 | arg3.field927), class478.method2807((byte) 69, var10.field6883, var16 << 24 | arg3.field927), class478.method2807((byte) 121, var10.field6888, var18 << 24 | arg3.field927));
                                }
                            } else if (var10.field6880 >= 0) {
                                arg4.method1270(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field6882, var10.field6883, var10.field6888, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field6368, this.field6368, this.field6368, var10.field6880);
                            } else {
                                arg4.method1257(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field6882, var10.field6883, var10.field6888);
                            }
                            arg4.field2563 = 0;
                            return;
                        }
                        arg4.method1263(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field927);
                    }
                }
            }
        } else {
            class60 var68 = this.field6371[arg0][arg1];
            if (var68 != null) {
                if (this.field6368 == -1) {
                    for (int var69 = 0; var69 < var68.field979; ++var69) {
                        int var70 = (arg0 << super.field696) + var68.field986[var69];
                        int var71 = var68.field987[var69];
                        int var72 = (arg1 << super.field696) + var68.field981[var69];
                        float var73 = (float) var72 * this.field6369 + (float) var70 * this.field6355 + (float) var71 * this.field6361 + this.field6356;
                        if (var73 <= (float) this.field6365.field6762) {
                            return;
                        }
                        arg8[var69] = 0;
                        if (arg2) {
                            int var74 = (int) (var73 - (float) arg3.field938);
                            if (var74 > 255) {
                                var74 = 255;
                            }
                            if (var74 > 0) {
                                arg8[var69] = var74;
                                int var75 = var68.field983[var69] * var74 / 255;
                                if (var75 > 0) {
                                    var71 -= var75;
                                }
                            }
                        } else if (arg3.field942) {
                            int var76 = (int) (var73 - (float) arg3.field938);
                            if (var76 > 0) {
                                arg8[var69] = var76;
                                if (arg8[var69] > 255) {
                                    arg8[var69] = 255;
                                }
                            }
                        }
                        float var77 = (float) var72 * this.field6362 + (float) var70 * this.field6370 + (float) var71 * this.field6364 + this.field6373;
                        float var78 = (float) var72 * this.field6367 + (float) var70 * this.field6359 + (float) var71 * this.field6375 + this.field6366;
                        arg5[var69] = (int) ((float) this.field6365.field6772 * var77 / var73) + arg4.field2564;
                        arg6[var69] = (int) ((float) this.field6365.field6771 * var78 / var73) + arg4.field2559;
                        arg7[var69] = (int) var73;
                    }
                } else {
                    for (int var79 = 0; var79 < var68.field979; ++var79) {
                        int var131 = (arg0 << super.field696) + var68.field986[var79];
                        int var132 = var68.field987[var79];
                        int var133 = (arg1 << super.field696) + var68.field981[var79];
                        float var134 = (float) var133 * this.field6369 + (float) var131 * this.field6355 + (float) var132 * this.field6361 + this.field6356;
                        arg8[var79] = 0;
                        if (arg2) {
                            int var135 = this.field6368 - arg3.field938;
                            if (var135 > 255) {
                                var135 = 255;
                            }
                            if (var135 > 0) {
                                arg8[var79] = var135;
                                int var136 = var68.field983[var79] * var135 / 255;
                                if (var136 > 0) {
                                    var132 -= var136;
                                }
                            }
                        } else if (arg3.field942) {
                            int var137 = this.field6368 - arg3.field938;
                            if (var137 > 0) {
                                arg8[var79] = var137;
                                if (arg8[var79] > 255) {
                                    arg8[var79] = 255;
                                }
                            }
                        }
                        float var138 = (float) var133 * this.field6362 + (float) var131 * this.field6370 + (float) var132 * this.field6364 + this.field6373;
                        float var139 = (float) var133 * this.field6367 + (float) var131 * this.field6359 + (float) var132 * this.field6375 + this.field6366;
                        arg5[var79] = (int) ((float) this.field6365.field6772 * var138 / (float) this.field6368) + arg4.field2564;
                        arg6[var79] = (int) ((float) this.field6365.field6771 * var139 / (float) this.field6368) + arg4.field2559;
                        arg7[var79] = (int) var134;
                    }
                }
                if (var68.field984 != null) {
                    int var80 = super.field700[arg0][arg1];
                    int var81 = super.field700[arg0 + 1][arg1];
                    int var82 = super.field700[arg0][arg1 + 1];
                    int var83 = super.field695 * arg0;
                    int var84 = super.field695 + var83;
                    int var85 = super.field695 * arg1;
                    int var86 = super.field695 + var85;
                    float var87 = (float) var85 * this.field6362 + (float) var80 * this.field6364 + (float) var83 * this.field6370 + this.field6373;
                    float var88 = (float) var85 * this.field6367 + (float) var80 * this.field6375 + (float) var83 * this.field6359 + this.field6366;
                    float var89 = (float) var85 * this.field6369 + (float) var80 * this.field6361 + (float) var83 * this.field6355 + this.field6356;
                    float var90 = (float) var85 * this.field6362 + (float) var81 * this.field6364 + (float) var84 * this.field6370 + this.field6373;
                    float var91 = (float) var85 * this.field6367 + (float) var81 * this.field6375 + (float) var84 * this.field6359 + this.field6366;
                    float var92 = (float) var85 * this.field6369 + (float) var81 * this.field6361 + (float) var84 * this.field6355 + this.field6356;
                    float var93 = (float) var86 * this.field6362 + (float) var82 * this.field6364 + (float) var83 * this.field6370 + this.field6373;
                    float var94 = (float) var86 * this.field6367 + (float) var82 * this.field6375 + (float) var83 * this.field6359 + this.field6366;
                    float var95 = (float) var86 * this.field6369 + (float) var82 * this.field6361 + (float) var83 * this.field6355 + this.field6356;
                    if (this.field6368 == -1) {
                        for (int var96 = 0; var96 < var68.field985; ++var96) {
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
                                arg4.field2572 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg4.field2573 || var101 > arg4.field2573 || var102 > arg4.field2573;
                                short var107 = var68.field984[var96];
                                if (var106 < 765) {
                                    if (var107 != -1 && this.method2686(this.field6365.field2023.method397(var107, (byte) 8).field4707)) {
                                        arg4.field2563 = 100;
                                    }
                                    if (var106 > 0) {
                                        if (var107 != -1) {
                                            arg4.method1272(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field927, arg8[var97], arg8[var98], arg8[var99], var68.field988[var97], var68.field988[var98], var68.field988[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                        } else if ((var68.field988[var97] & 16777215) != 0) {
                                            arg4.method1257(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], class478.method2807((byte) 65, var68.field988[var97], arg8[var97] << 24 | arg3.field927), class478.method2807((byte) 87, var68.field988[var98], arg8[var98] << 24 | arg3.field927), class478.method2807((byte) 89, var68.field988[var99], arg8[var99] << 24 | arg3.field927));
                                        }
                                    } else if (var107 != -1) {
                                        arg4.method1270(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field988[var97], var68.field988[var98], var68.field988[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                    } else if ((var68.field988[var97] & 16777215) != 0) {
                                        arg4.method1257(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field988[var97], var68.field988[var98], var68.field988[var99]);
                                    }
                                    arg4.field2563 = 0;
                                } else {
                                    arg4.method1263(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field927);
                                }
                            }
                        }
                        return;
                    }
                    for (int var108 = 0; var108 < var68.field985; ++var108) {
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
                            arg4.field2572 = var112 < 0 || var113 < 0 || var114 < 0 || var112 > arg4.field2573 || var113 > arg4.field2573 || var114 > arg4.field2573;
                            short var119 = var68.field984[var108];
                            if (var118 < 765) {
                                if (var119 != -1 && this.method2686(this.field6365.field2023.method397(var119, (byte) -122).field4707)) {
                                    arg4.field2563 = 100;
                                }
                                if (var118 > 0) {
                                    if (var119 != -1) {
                                        arg4.method1272(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field927, arg8[var109], arg8[var110], arg8[var111], var68.field988[var109], var68.field988[var110], var68.field988[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field6368, this.field6368, this.field6368, var119);
                                    } else if ((var68.field988[var109] & 16777215) != 0) {
                                        arg4.method1257(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], class478.method2807((byte) 100, var68.field988[var109], arg8[var109] << 24 | arg3.field927), class478.method2807((byte) 107, var68.field988[var110], arg8[var110] << 24 | arg3.field927), class478.method2807((byte) 67, var68.field988[var111], arg8[var111] << 24 | arg3.field927));
                                    }
                                } else if (var119 != -1) {
                                    arg4.method1270(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field988[var109], var68.field988[var110], var68.field988[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field6368, this.field6368, this.field6368, var119);
                                } else if ((var68.field988[var109] & 16777215) != 0) {
                                    arg4.method1257(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field988[var109], var68.field988[var110], var68.field988[var111]);
                                }
                                arg4.field2563 = 0;
                            } else {
                                arg4.method1263(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field927);
                            }
                        }
                    }
                    return;
                }
                for (int var120 = 0; var120 < var68.field985; ++var120) {
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
                        arg4.field2572 = var124 < 0 || var125 < 0 || var126 < 0 || var124 > arg4.field2573 || var125 > arg4.field2573 || var126 > arg4.field2573;
                        if (var130 < 765) {
                            if (var130 > 0) {
                                if ((var68.field988[var121] & 16777215) != 0) {
                                    arg4.method1257(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], class435.method2606(var68.field988[var121], arg3.field927, arg8[var121], 51), class435.method2606(var68.field988[var122], arg3.field927, arg8[var122], 82), class435.method2606(var68.field988[var123], arg3.field927, arg8[var123], 52));
                                }
                            } else if ((var68.field988[var121] & 16777215) != 0) {
                                arg4.method1257(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], var68.field988[var121], var68.field988[var122], var68.field988[var123]);
                            }
                        } else {
                            arg4.method1263(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], arg3.field927);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
    public final void method424(int arg0, int arg1) {
        class59 var3 = this.field6365.method2816(Thread.currentThread());
        var3.field965.field2563 = 0;
        if (this.field6363 != null) {
            this.method2687(arg0, arg1, var3.field929, var3, var3.field965, var3.field952, var3.field967, var3.field970, var3.field968);
        } else {
            if (this.field6357 != null) {
                this.method2688(arg0, arg1, var3.field965, var3.field952, var3.field967, var3.field970, var3.field968);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILue;[I[I[I[I)V")
    private final void method2688(int arg0, int arg1, class211 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        class316 var8 = this.field6357[arg0][arg1];
        if (var8 != null) {
            if ((var8.field4183 & 2) == 0) {
                int var9 = super.field695 * arg0;
                int var10 = super.field695 + var9;
                int var11 = super.field695 * arg1;
                int var12 = super.field695 + var11;
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
                if ((var8.field4183 & 1) != 0) {
                    int var13 = super.field700[arg0][arg1];
                    float var14 = (float) var13 * this.field6361;
                    if (this.field6368 == -1) {
                        var15 = (float) var11 * this.field6369 + (float) var9 * this.field6355 + var14 + this.field6356;
                        if (var15 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var16 = (float) var11 * this.field6369 + (float) var10 * this.field6355 + var14 + this.field6356;
                        if (var16 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var17 = (float) var12 * this.field6369 + (float) var10 * this.field6355 + var14 + this.field6356;
                        if (var17 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var18 = (float) var12 * this.field6369 + (float) var9 * this.field6355 + var14 + this.field6356;
                        if (var18 <= (float) this.field6365.field6762) {
                            return;
                        }
                    } else {
                        var15 = (float) var11 * this.field6369 + (float) var9 * this.field6355 + var14 + this.field6356;
                        var16 = (float) var11 * this.field6369 + (float) var10 * this.field6355 + var14 + this.field6356;
                        var17 = (float) var12 * this.field6369 + (float) var10 * this.field6355 + var14 + this.field6356;
                        var18 = (float) var12 * this.field6369 + (float) var9 * this.field6355 + var14 + this.field6356;
                    }
                    float var19 = (float) var13 * this.field6364;
                    float var20 = (float) var13 * this.field6375;
                    if (this.field6368 == -1) {
                        var21 = (float) var11 * this.field6362 + (float) var9 * this.field6370 + var19 + this.field6373;
                        var22 = (int) ((float) this.field6365.field6772 * var21 / var15) + arg2.field2564;
                        var23 = (float) var11 * this.field6367 + (float) var9 * this.field6359 + var20 + this.field6366;
                        var24 = (int) ((float) this.field6365.field6771 * var23 / var15) + arg2.field2559;
                        var25 = (float) var11 * this.field6362 + (float) var10 * this.field6370 + var19 + this.field6373;
                        var26 = (int) ((float) this.field6365.field6772 * var25 / var16) + arg2.field2564;
                        var27 = (float) var11 * this.field6367 + (float) var10 * this.field6359 + var20 + this.field6366;
                        var28 = (int) ((float) this.field6365.field6771 * var27 / var16) + arg2.field2559;
                        float var29 = (float) var12 * this.field6362 + (float) var10 * this.field6370 + var19 + this.field6373;
                        var30 = (int) ((float) this.field6365.field6772 * var29 / var17) + arg2.field2564;
                        float var31 = (float) var12 * this.field6367 + (float) var10 * this.field6359 + var20 + this.field6366;
                        var32 = (int) ((float) this.field6365.field6771 * var31 / var17) + arg2.field2559;
                        var33 = (float) var12 * this.field6362 + (float) var9 * this.field6370 + var19 + this.field6373;
                        var34 = (int) ((float) this.field6365.field6772 * var33 / var18) + arg2.field2564;
                        var35 = (float) var12 * this.field6367 + (float) var9 * this.field6359 + var20 + this.field6366;
                        var36 = (int) ((float) this.field6365.field6771 * var35 / var18) + arg2.field2559;
                    } else {
                        var21 = (float) var11 * this.field6362 + (float) var9 * this.field6370 + var19 + this.field6373;
                        var22 = (int) ((float) this.field6365.field6772 * var21 / (float) this.field6368) + arg2.field2564;
                        var23 = (float) var11 * this.field6367 + (float) var9 * this.field6359 + var20 + this.field6366;
                        var24 = (int) ((float) this.field6365.field6771 * var23 / (float) this.field6368) + arg2.field2559;
                        var25 = (float) var11 * this.field6362 + (float) var10 * this.field6370 + var19 + this.field6373;
                        var26 = (int) ((float) this.field6365.field6772 * var25 / (float) this.field6368) + arg2.field2564;
                        var27 = (float) var11 * this.field6367 + (float) var10 * this.field6359 + var20 + this.field6366;
                        var28 = (int) ((float) this.field6365.field6771 * var27 / (float) this.field6368) + arg2.field2559;
                        float var37 = (float) var12 * this.field6362 + (float) var10 * this.field6370 + var19 + this.field6373;
                        var30 = (int) ((float) this.field6365.field6772 * var37 / (float) this.field6368) + arg2.field2564;
                        float var38 = (float) var12 * this.field6367 + (float) var10 * this.field6359 + var20 + this.field6366;
                        var32 = (int) ((float) this.field6365.field6771 * var38 / (float) this.field6368) + arg2.field2559;
                        var33 = (float) var12 * this.field6362 + (float) var9 * this.field6370 + var19 + this.field6373;
                        var34 = (int) ((float) this.field6365.field6772 * var33 / (float) this.field6368) + arg2.field2564;
                        var35 = (float) var12 * this.field6367 + (float) var9 * this.field6359 + var20 + this.field6366;
                        var36 = (int) ((float) this.field6365.field6771 * var35 / (float) this.field6368) + arg2.field2559;
                    }
                } else {
                    int var39 = super.field700[arg0][arg1];
                    int var40 = super.field700[arg0 + 1][arg1];
                    int var41 = super.field700[arg0 + 1][arg1 + 1];
                    int var42 = super.field700[arg0][arg1 + 1];
                    if (this.field6368 == -1) {
                        var15 = (float) var11 * this.field6369 + (float) var9 * this.field6355 + (float) var39 * this.field6361 + this.field6356;
                        if (var15 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var16 = (float) var11 * this.field6369 + (float) var10 * this.field6355 + (float) var40 * this.field6361 + this.field6356;
                        if (var16 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var17 = (float) var12 * this.field6369 + (float) var10 * this.field6355 + (float) var41 * this.field6361 + this.field6356;
                        if (var17 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var18 = (float) var12 * this.field6369 + (float) var9 * this.field6355 + (float) var42 * this.field6361 + this.field6356;
                        if (var18 <= (float) this.field6365.field6762) {
                            return;
                        }
                        var21 = (float) var11 * this.field6362 + (float) var9 * this.field6370 + (float) var39 * this.field6364 + this.field6373;
                        var22 = (int) ((float) this.field6365.field6772 * var21 / var15) + arg2.field2564;
                        var23 = (float) var11 * this.field6367 + (float) var9 * this.field6359 + (float) var39 * this.field6375 + this.field6366;
                        var24 = (int) ((float) this.field6365.field6771 * var23 / var15) + arg2.field2559;
                        var25 = (float) var11 * this.field6362 + (float) var10 * this.field6370 + (float) var40 * this.field6364 + this.field6373;
                        var26 = (int) ((float) this.field6365.field6772 * var25 / var16) + arg2.field2564;
                        var27 = (float) var11 * this.field6367 + (float) var10 * this.field6359 + (float) var40 * this.field6375 + this.field6366;
                        var28 = (int) ((float) this.field6365.field6771 * var27 / var16) + arg2.field2559;
                        float var43 = (float) var12 * this.field6362 + (float) var10 * this.field6370 + (float) var41 * this.field6364 + this.field6373;
                        var30 = (int) ((float) this.field6365.field6772 * var43 / var17) + arg2.field2564;
                        float var44 = (float) var12 * this.field6367 + (float) var10 * this.field6359 + (float) var41 * this.field6375 + this.field6366;
                        var32 = (int) ((float) this.field6365.field6771 * var44 / var17) + arg2.field2559;
                        var33 = (float) var12 * this.field6362 + (float) var9 * this.field6370 + (float) var42 * this.field6364 + this.field6373;
                        var34 = (int) ((float) this.field6365.field6772 * var33 / var18) + arg2.field2564;
                        var35 = (float) var12 * this.field6367 + (float) var9 * this.field6359 + (float) var42 * this.field6375 + this.field6366;
                        var36 = (int) ((float) this.field6365.field6771 * var35 / var18) + arg2.field2559;
                    } else {
                        var15 = (float) var11 * this.field6369 + (float) var9 * this.field6355 + (float) var39 * this.field6361 + this.field6356;
                        var16 = (float) var11 * this.field6369 + (float) var10 * this.field6355 + (float) var40 * this.field6361 + this.field6356;
                        var17 = (float) var12 * this.field6369 + (float) var10 * this.field6355 + (float) var41 * this.field6361 + this.field6356;
                        var18 = (float) var12 * this.field6369 + (float) var9 * this.field6355 + (float) var42 * this.field6361 + this.field6356;
                        var21 = (float) var11 * this.field6362 + (float) var9 * this.field6370 + (float) var39 * this.field6364 + this.field6373;
                        var22 = (int) ((float) this.field6365.field6772 * var21 / (float) this.field6368) + arg2.field2564;
                        var23 = (float) var11 * this.field6367 + (float) var9 * this.field6359 + (float) var39 * this.field6375 + this.field6366;
                        var24 = (int) ((float) this.field6365.field6771 * var23 / (float) this.field6368) + arg2.field2559;
                        var25 = (float) var11 * this.field6362 + (float) var10 * this.field6370 + (float) var40 * this.field6364 + this.field6373;
                        var26 = (int) ((float) this.field6365.field6772 * var25 / (float) this.field6368) + arg2.field2564;
                        var27 = (float) var11 * this.field6367 + (float) var10 * this.field6359 + (float) var40 * this.field6375 + this.field6366;
                        var28 = (int) ((float) this.field6365.field6771 * var27 / (float) this.field6368) + arg2.field2559;
                        float var45 = (float) var12 * this.field6362 + (float) var10 * this.field6370 + (float) var41 * this.field6364 + this.field6373;
                        var30 = (int) ((float) this.field6365.field6772 * var45 / (float) this.field6368) + arg2.field2564;
                        float var46 = (float) var12 * this.field6367 + (float) var10 * this.field6359 + (float) var41 * this.field6375 + this.field6366;
                        var32 = (int) ((float) this.field6365.field6771 * var46 / (float) this.field6368) + arg2.field2559;
                        var33 = (float) var12 * this.field6362 + (float) var9 * this.field6370 + (float) var42 * this.field6364 + this.field6373;
                        var34 = (int) ((float) this.field6365.field6772 * var33 / (float) this.field6368) + arg2.field2564;
                        var35 = (float) var12 * this.field6367 + (float) var9 * this.field6359 + (float) var42 * this.field6375 + this.field6366;
                        var36 = (int) ((float) this.field6365.field6771 * var35 / (float) this.field6368) + arg2.field2559;
                    }
                }
                if (this.field6368 == -1) {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field2572 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field2573 || var34 > arg2.field2573 || var26 > arg2.field2573;
                        if (var8.field4181 >= 0) {
                            if (this.method2686(this.field6365.field2023.method397(var8.field4181, (byte) -122).field4707)) {
                                arg2.field2563 = 100;
                            }
                            arg2.method1270(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4186 & 65535, var8.field4184 & 65535, var8.field4180 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field4181);
                            arg2.field2563 = 0;
                        } else {
                            arg2.method1259(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4186 & 65535, var8.field4184 & 65535, var8.field4180 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field2572 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field2573 || var26 > arg2.field2573 || var34 > arg2.field2573;
                        if (var8.field4181 >= 0) {
                            if (this.method2686(this.field6365.field2023.method397(var8.field4181, (byte) -126).field4707)) {
                                arg2.field2563 = 100;
                            }
                            arg2.method1270(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4185 & 65535, var8.field4180 & 65535, var8.field4184 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field4181);
                            arg2.field2563 = 0;
                            return;
                        }
                        arg2.method1259(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4185 & 65535, var8.field4180 & 65535, var8.field4184 & 65535);
                        return;
                    }
                } else {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field2572 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field2573 || var34 > arg2.field2573 || var26 > arg2.field2573;
                        if (var8.field4181 >= 0) {
                            if (this.method2686(this.field6365.field2023.method397(var8.field4181, (byte) 7).field4707)) {
                                arg2.field2563 = 100;
                            }
                            arg2.method1270(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4186 & 65535, var8.field4184 & 65535, var8.field4180 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field6368, this.field6368, this.field6368, var8.field4181);
                            arg2.field2563 = 0;
                        } else {
                            arg2.method1259(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field4186 & 65535, var8.field4184 & 65535, var8.field4180 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field2572 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field2573 || var26 > arg2.field2573 || var34 > arg2.field2573;
                        if (var8.field4181 >= 0) {
                            if (this.method2686(this.field6365.field2023.method397(var8.field4181, (byte) 1).field4707)) {
                                arg2.field2563 = 100;
                            }
                            arg2.method1270(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4185 & 65535, var8.field4180 & 65535, var8.field4184 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field6368, this.field6368, this.field6368, var8.field4181);
                            arg2.field2563 = 0;
                            return;
                        }
                        arg2.method1259(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field4185 & 65535, var8.field4180 & 65535, var8.field4184 & 65535);
                    }
                }
            }
        } else {
            class93 var47 = this.field6372[arg0][arg1];
            if (var47 != null) {
                if (this.field6368 == -1) {
                    for (int var48 = 0; var48 < var47.field1290; ++var48) {
                        int var49 = (arg0 << super.field696) + var47.field1291[var48];
                        short var50 = var47.field1286[var48];
                        int var51 = (arg1 << super.field696) + var47.field1295[var48];
                        float var52 = (float) var51 * this.field6369 + (float) var49 * this.field6355 + (float) var50 * this.field6361 + this.field6356;
                        if (var52 <= (float) this.field6365.field6762) {
                            return;
                        }
                        float var53 = (float) var51 * this.field6362 + (float) var49 * this.field6370 + (float) var50 * this.field6364 + this.field6373;
                        float var54 = (float) var51 * this.field6367 + (float) var49 * this.field6359 + (float) var50 * this.field6375 + this.field6366;
                        arg3[var48] = (int) ((float) this.field6365.field6772 * var53 / var52) + arg2.field2564;
                        arg4[var48] = (int) ((float) this.field6365.field6771 * var54 / var52) + arg2.field2559;
                        arg5[var48] = (int) var52;
                    }
                } else {
                    for (int var55 = 0; var55 < var47.field1290; ++var55) {
                        int var107 = (arg0 << super.field696) + var47.field1291[var55];
                        short var108 = var47.field1286[var55];
                        int var109 = (arg1 << super.field696) + var47.field1295[var55];
                        float var110 = (float) var109 * this.field6369 + (float) var107 * this.field6355 + (float) var108 * this.field6361 + this.field6356;
                        float var111 = (float) var109 * this.field6362 + (float) var107 * this.field6370 + (float) var108 * this.field6364 + this.field6373;
                        float var112 = (float) var109 * this.field6367 + (float) var107 * this.field6359 + (float) var108 * this.field6375 + this.field6366;
                        arg3[var55] = (int) ((float) this.field6365.field6772 * var111 / (float) this.field6368) + arg2.field2564;
                        arg4[var55] = (int) ((float) this.field6365.field6771 * var112 / (float) this.field6368) + arg2.field2559;
                        arg5[var55] = (int) var110;
                    }
                }
                if (var47.field1294 != null) {
                    int var56 = super.field700[arg0][arg1];
                    int var57 = super.field700[arg0 + 1][arg1];
                    int var58 = super.field700[arg0][arg1 + 1];
                    int var59 = super.field695 * arg0;
                    int var60 = super.field695 + var59;
                    int var61 = super.field695 * arg1;
                    int var62 = super.field695 + var61;
                    float var63 = (float) var61 * this.field6362 + (float) var56 * this.field6364 + (float) var59 * this.field6370 + this.field6373;
                    float var64 = (float) var61 * this.field6367 + (float) var56 * this.field6375 + (float) var59 * this.field6359 + this.field6366;
                    float var65 = (float) var61 * this.field6369 + (float) var56 * this.field6361 + (float) var59 * this.field6355 + this.field6356;
                    float var66 = (float) var61 * this.field6362 + (float) var57 * this.field6364 + (float) var60 * this.field6370 + this.field6373;
                    float var67 = (float) var61 * this.field6367 + (float) var57 * this.field6375 + (float) var60 * this.field6359 + this.field6366;
                    float var68 = (float) var61 * this.field6369 + (float) var57 * this.field6361 + (float) var60 * this.field6355 + this.field6356;
                    float var69 = (float) var62 * this.field6362 + (float) var58 * this.field6364 + (float) var59 * this.field6370 + this.field6373;
                    float var70 = (float) var62 * this.field6367 + (float) var58 * this.field6375 + (float) var59 * this.field6359 + this.field6366;
                    float var71 = (float) var62 * this.field6369 + (float) var58 * this.field6361 + (float) var59 * this.field6355 + this.field6356;
                    if (this.field6368 == -1) {
                        for (int var72 = 0; var72 < var47.field1285; ++var72) {
                            short var73 = var47.field1296[var72];
                            short var74 = var47.field1288[var72];
                            short var75 = var47.field1284[var72];
                            int var76 = arg3[var73];
                            int var77 = arg3[var74];
                            int var78 = arg3[var75];
                            int var79 = arg4[var73];
                            int var80 = arg4[var74];
                            int var81 = arg4[var75];
                            if ((var76 - var77) * (var81 - var80) - (var78 - var77) * (var79 - var80) > 0) {
                                arg2.field2572 = var76 < 0 || var77 < 0 || var78 < 0 || var76 > arg2.field2573 || var77 > arg2.field2573 || var78 > arg2.field2573;
                                short var82 = var47.field1294[var72];
                                if (var82 != -1) {
                                    if (this.method2686(this.field6365.field2023.method397(var82, (byte) 57).field4707)) {
                                        arg2.field2563 = 100;
                                    }
                                    arg2.method1270(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], var47.field1287[var73], var47.field1287[var74], var47.field1287[var75], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, (int) var65, (int) var68, (int) var71, var82);
                                    arg2.field2563 = 0;
                                } else {
                                    int var83 = var47.field1293[var72];
                                    if (var83 != -1) {
                                        arg2.method1259(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], class693.method3906(var47.field1287[var73], 126, var83), class693.method3906(var47.field1287[var74], 126, var83), class693.method3906(var47.field1287[var75], 126, var83));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var84 = 0; var84 < var47.field1285; ++var84) {
                        short var85 = var47.field1296[var84];
                        short var86 = var47.field1288[var84];
                        short var87 = var47.field1284[var84];
                        int var88 = arg3[var85];
                        int var89 = arg3[var86];
                        int var90 = arg3[var87];
                        int var91 = arg4[var85];
                        int var92 = arg4[var86];
                        int var93 = arg4[var87];
                        if ((var88 - var89) * (var93 - var92) - (var90 - var89) * (var91 - var92) > 0) {
                            arg2.field2572 = var88 < 0 || var89 < 0 || var90 < 0 || var88 > arg2.field2573 || var89 > arg2.field2573 || var90 > arg2.field2573;
                            short var94 = var47.field1294[var84];
                            if (var94 != -1) {
                                if (this.method2686(this.field6365.field2023.method397(var94, (byte) -126).field4707)) {
                                    arg2.field2563 = 100;
                                }
                                arg2.method1270(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], var47.field1287[var85], var47.field1287[var86], var47.field1287[var87], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, this.field6368, this.field6368, this.field6368, var94);
                                arg2.field2563 = 0;
                            } else {
                                int var95 = var47.field1293[var84];
                                if (var95 != -1) {
                                    arg2.method1259(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], class693.method3906(var47.field1287[var85], 126, var95), class693.method3906(var47.field1287[var86], 126, var95), class693.method3906(var47.field1287[var87], 126, var95));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var96 = 0; var96 < var47.field1285; ++var96) {
                    short var97 = var47.field1296[var96];
                    short var98 = var47.field1288[var96];
                    short var99 = var47.field1284[var96];
                    int var100 = arg3[var97];
                    int var101 = arg3[var98];
                    int var102 = arg3[var99];
                    int var103 = arg4[var97];
                    int var104 = arg4[var98];
                    int var105 = arg4[var99];
                    if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                        int var106 = var47.field1293[var96];
                        if (var106 != -1) {
                            arg2.field2572 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg2.field2573 || var101 > arg2.field2573 || var102 > arg2.field2573;
                            arg2.method1259(var103, var104, var105, var100, var101, var102, arg5[var97], arg5[var98], arg5[var99], class693.method3906(var47.field1287[var97], 126, var106), class693.method3906(var47.field1287[var98], 126, var106), class693.method3906(var47.field1287[var99], 126, var106));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "(IILha;)Lha;")
    public final class54 method423(int arg0, int arg1, class54 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method431(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field6363 == null) {
            this.field6363 = new class492[super.field702][super.field706];
            this.field6371 = new class60[super.field702][super.field706];
        } else if (this.field6357 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class119.field1524[class642.method3653((byte) 3, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class119.field1524[class642.method3653((byte) 3, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field695 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field695 && arg4[var22] == super.field695) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field695) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field695 != arg2[var24] && arg2[0] - super.field695 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field695 != arg4[var24] && arg4[0] - super.field695 != arg4[var24]) {
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
                class492 var25 = new class492();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field6884 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field6887 = (byte) (var25.field6887 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (super.field700[arg0 + 1][arg1] == super.field700[arg0][arg1] && super.field700[arg0 + 1][arg1 + 1] == super.field700[arg0][arg1] && super.field700[arg0][arg1 + 1] == super.field700[arg0][arg1]) {
                    var25.field6887 = (byte) (var25.field6887 | 1);
                }
                if (var27 != -1 && (var25.field6887 & 2) == 0 && !this.field6365.field2023.method397(var27, (byte) -123).field4706) {
                    var25.field6882 = this.field6358[arg0][arg1] - this.field6374[arg0][arg1];
                    var25.field6883 = this.field6358[arg0 + 1][arg1] - this.field6374[arg0 + 1][arg1];
                    var25.field6879 = this.field6358[arg0 + 1][arg1 + 1] - this.field6374[arg0 + 1][arg1 + 1];
                    var25.field6888 = this.field6358[arg0][arg1 + 1] - this.field6374[arg0][arg1 + 1];
                    var25.field6880 = (short) var27;
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
                    var25.field6882 = class435.method2606(method2685(arg6[var18] >> 8, this.field6358[arg0][arg1] - this.field6374[arg0][arg1]), arg10, var28, 107);
                    if (var25.field6884 != 0) {
                        var25.field6882 |= 255 - (this.field6358[arg0][arg1] - this.field6374[arg0][arg1]) << 25;
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
                    var25.field6883 = class435.method2606(method2685(arg6[var19] >> 8, this.field6358[arg0 + 1][arg1] - this.field6374[arg0 + 1][arg1]), arg10, var29, 119);
                    if (var25.field6884 != 0) {
                        var25.field6883 |= 255 - (this.field6358[arg0 + 1][arg1] - this.field6374[arg0 + 1][arg1]) << 25;
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
                    var25.field6879 = class435.method2606(method2685(arg6[var20] >> 8, this.field6358[arg0 + 1][arg1 + 1] - this.field6374[arg0 + 1][arg1 + 1]), arg10, var30, 85);
                    if (var25.field6884 != 0) {
                        var25.field6879 |= 255 - (this.field6358[arg0 + 1][arg1 + 1] - this.field6374[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field6888 = class435.method2606(method2685(arg6[var21] >> 8, this.field6358[arg0][arg1 + 1] - this.field6374[arg0][arg1 + 1]), arg10, var31, 84);
                    if (var25.field6884 != 0) {
                        var25.field6888 |= 255 - (this.field6358[arg0][arg1 + 1] - this.field6374[arg0][arg1 + 1]) << 25;
                    }
                    var25.field6880 = -1;
                }
                if (arg5 != null) {
                    var25.field6881 = (short) arg5[var20];
                    var25.field6878 = (short) arg5[var21];
                    var25.field6886 = (short) arg5[var19];
                    var25.field6885 = (short) arg5[var18];
                }
                this.field6363[arg0][arg1] = var25;
            } else {
                class60 var32 = new class60();
                var32.field979 = (short) arg2.length;
                var32.field985 = (short) (arg2.length / 3);
                var32.field986 = new short[var32.field979];
                var32.field987 = new short[var32.field979];
                var32.field981 = new short[var32.field979];
                var32.field988 = new int[var32.field979];
                if (arg5 != null) {
                    var32.field983 = new short[var32.field979];
                }
                for (int var33 = 0; var33 < var32.field979; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field6358[arg0][arg1] - this.field6374[arg0][arg1];
                    } else if (var48 == 0 && super.field695 == var49) {
                        var51 = this.field6358[arg0][arg1 + 1] - this.field6374[arg0][arg1 + 1];
                    } else if (super.field695 == var48 && super.field695 == var49) {
                        var51 = this.field6358[arg0 + 1][arg1 + 1] - this.field6374[arg0 + 1][arg1 + 1];
                    } else if (super.field695 == var48 && var49 == 0) {
                        var51 = this.field6358[arg0 + 1][arg1] - this.field6374[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field6358[arg0 + 1][arg1] - this.field6374[arg0 + 1][arg1]) * var48 + (this.field6358[arg0][arg1] - this.field6374[arg0][arg1]) * (super.field695 - var48);
                        int var53 = (this.field6358[arg0 + 1][arg1 + 1] - this.field6374[arg0 + 1][arg1 + 1]) * var48 + (this.field6358[arg0][arg1 + 1] - this.field6374[arg0][arg1 + 1]) * (super.field695 - var48);
                        var51 = (super.field695 - var49) * var52 + var49 * var53 >> super.field696 * 2;
                    }
                    int var54 = (arg0 << super.field696) + var48;
                    int var55 = (arg1 << super.field696) + var49;
                    var32.field986[var33] = (short) var48;
                    var32.field981[var33] = (short) var49;
                    var32.field987[var33] = (short) (this.method428(true, var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field6365.field2023.method397(arg8[var33], (byte) -122).field4706) {
                        var32.field988[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field988[var33] = var51 << 25;
                        } else {
                            var32.field988[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field983[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field988[var33] = class435.method2606(method2685(arg6[var33] >> 8, var51), arg10, var56, 78);
                        if (arg7 != null) {
                            var32.field988[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field985; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field6365.field2023.method397(arg8[var35 * 3], (byte) -126).field4706) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field980 = new int[var32.field985];
                }
                if (var34) {
                    var32.field984 = new short[var32.field985];
                    var32.field982 = new short[var32.field985];
                }
                for (int var36 = 0; var36 < var32.field985; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field980[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field6365.field2023.method397(var42, (byte) 87).field4706) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field6365.field2023.method397(var43, (byte) 23).field4706) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field6365.field2023.method397(var44, (byte) -126).field4706) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field984[var36] = (short) var44;
                            var32.field982[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field6365.field2023.method397(var45, (byte) 39).field4706) {
                                    var32.field988[var37] = class119.field1524[class642.method3653((byte) 3, this.field6365.field2023.method397(var45, (byte) 45).field4713 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field6365.field2023.method397(var46, (byte) -122).field4706) {
                                    var32.field988[var38] = class119.field1524[class642.method3653((byte) 3, this.field6365.field2023.method397(var46, (byte) -122).field4713 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field6365.field2023.method397(var47, (byte) 103).field4706) {
                                    var32.field988[var39] = class119.field1524[class642.method3653((byte) 3, this.field6365.field2023.method397(var47, (byte) -122).field4713 & 65535) & 65535];
                                }
                            }
                            var32.field984[var36] = -1;
                        }
                    }
                }
                this.field6371[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "BA", descriptor = "()V")
    public final void method432() {
        this.field6358 = null;
        this.field6374 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class59 var9 = this.field6365.method2816(Thread.currentThread());
        class211 var10 = var9.field965;
        var10.field2563 = 0;
        var10.field2572 = false;
        this.field6365.method246();
        if (this.field6363 != null) {
            this.method2684(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field952, var9.field967);
        } else {
            if (this.field6357 != null) {
                this.method2683(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field952, var9.field967);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III[[ZZI)V")
    public final void method435(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class228 var7 = this.field6365.field6757;
        this.field6368 = arg5;
        this.field6370 = var7.field2953;
        this.field6364 = var7.field2943;
        this.field6362 = var7.field2965;
        this.field6373 = var7.field2951;
        this.field6359 = var7.field2957;
        this.field6375 = var7.field2962;
        this.field6367 = var7.field2942;
        this.field6366 = var7.field2954;
        this.field6355 = var7.field2960;
        this.field6361 = var7.field2949;
        this.field6369 = var7.field2969;
        this.field6356 = var7.field2952;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field702 && var11 >= 0 && var11 < super.field706) {
                        this.method424(var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method427(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lcb;IIII[[I[[II)V")
    public class453(class483 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6365 = arg0;
        this.field6360 = arg2;
        this.field6358 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field6365.field6766 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field6365.field6752 * var18 + this.field6365.field6747 * var16 + this.field6365.field6745 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field6358[var11][var10] = (byte) var20;
            }
        }
        this.field6374 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III[[ZZ)V")
    public final void method436(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class228 var6 = this.field6365.field6757;
        this.field6368 = -1;
        this.field6370 = var6.field2953;
        this.field6364 = var6.field2943;
        this.field6362 = var6.field2965;
        this.field6373 = var6.field2951;
        this.field6359 = var6.field2957;
        this.field6375 = var6.field2962;
        this.field6367 = var6.field2942;
        this.field6366 = var6.field2954;
        this.field6355 = var6.field2960;
        this.field6361 = var6.field2949;
        this.field6369 = var6.field2969;
        this.field6356 = var6.field2952;
        for (int var7 = 0; var7 < arg2 + arg2; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - arg2 + var7;
                    int var10 = arg1 - arg2 + var8;
                    if (var9 >= 0 && var9 < super.field702 && var10 >= 0 && var10 < super.field706) {
                        this.method424(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method430(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
