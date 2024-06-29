import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class103 extends class129 {

    @OriginalMember(owner = "client!m", name = "x", descriptor = "Lkd;")
    private class154 field1446;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "[[I")
    public int[][] field1450;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "[[I")
    private int[][] field1453;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "[[B")
    private byte[][] field1448;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[[B")
    private byte[][] field1439;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "[[Lcs;")
    private class188[][] field1435;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "[[Lhr;")
    private class307[][] field1441;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "[[Lmk;")
    private class34[][] field1440;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[[Lji;")
    private class363[][] field1431;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method768(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field1440 == null) {
            this.field1440 = new class34[super.field2036][super.field2040];
            this.field1435 = new class188[super.field2036][super.field2040];
        } else if (this.field1431 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class62.field814[class99.method747(arg5[var13], -9560) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class62.field814[class99.method747(arg6[var14], -9560) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var15 = true;
            int var16 = -1;
            int var17 = -1;
            int var18 = -1;
            int var19 = -1;
            if (arg2.length == 6) {
                for (int var20 = 0; var20 < 6; ++var20) {
                    if (arg2[var20] == 0 && arg4[var20] == 0) {
                        if (var16 != -1 && arg5[var16] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var16 = var20;
                    } else if (arg2[var20] == this.field1454 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field1454 && arg4[var20] == this.field1454) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field1454) {
                        if (var19 != -1 && arg5[var19] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var19 = var20;
                    }
                }
                if (var16 == -1 || var17 == -1 || var18 == -1 || var19 == -1) {
                    var15 = false;
                }
                if (var15) {
                    if (arg3 != null) {
                        for (int var21 = 0; var21 < 4; ++var21) {
                            if (arg3[var21] != 0) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        for (int var22 = 1; var22 < 4; ++var22) {
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field1454 != arg2[var22] && arg2[0] - this.field1454 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field1454 != arg4[var22] && arg4[0] - this.field1454 != arg4[var22]) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var15 = false;
            }
            if (var15) {
                class34 var23 = new class34();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field418 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field421 = (byte) (var23.field421 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field1450[arg0 + 1][arg1] == this.field1450[arg0][arg1] && this.field1450[arg0 + 1][arg1 + 1] == this.field1450[arg0][arg1] && this.field1450[arg0][arg1 + 1] == this.field1450[arg0][arg1]) {
                    var23.field421 = (byte) (var23.field421 | 1);
                }
                if (var25 != -1 && (var23.field421 & 2) == 0 && !this.field1446.field2395.method989(var25, (byte) 100).field4269) {
                    var23.field422 = this.field1448[arg0][arg1] - this.field1439[arg0][arg1];
                    var23.field424 = this.field1448[arg0 + 1][arg1] - this.field1439[arg0 + 1][arg1];
                    var23.field420 = this.field1448[arg0 + 1][arg1 + 1] - this.field1439[arg0 + 1][arg1 + 1];
                    var23.field419 = this.field1448[arg0][arg1 + 1] - this.field1439[arg0][arg1 + 1];
                    var23.field423 = (short) var25;
                } else {
                    int var26;
                    if (this.field1453 != null && arg10 != 0) {
                        var26 = this.field1453[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field422 = class386.method2446(method774(arg5[var16] >> 8, this.field1448[arg0][arg1] - this.field1439[arg0][arg1]), -2240, var26, arg9);
                    if (var23.field418 != 0) {
                        var23.field422 |= 255 - (this.field1448[arg0][arg1] - this.field1439[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field1453 != null && arg10 != 0) {
                        var27 = this.field1453[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field424 = class386.method2446(method774(arg5[var17] >> 8, this.field1448[arg0 + 1][arg1] - this.field1439[arg0 + 1][arg1]), -2240, var27, arg9);
                    if (var23.field418 != 0) {
                        var23.field424 |= 255 - (this.field1448[arg0 + 1][arg1] - this.field1439[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field1453 != null && arg10 != 0) {
                        var28 = this.field1453[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field420 = class386.method2446(method774(arg5[var18] >> 8, this.field1448[arg0 + 1][arg1 + 1] - this.field1439[arg0 + 1][arg1 + 1]), -2240, var28, arg9);
                    if (var23.field418 != 0) {
                        var23.field420 |= 255 - (this.field1448[arg0 + 1][arg1 + 1] - this.field1439[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field1453 != null && arg10 != 0) {
                        var29 = this.field1453[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field419 = class386.method2446(method774(arg5[var19] >> 8, this.field1448[arg0][arg1 + 1] - this.field1439[arg0][arg1 + 1]), -2240, var29, arg9);
                    if (var23.field418 != 0) {
                        var23.field419 |= 255 - (this.field1448[arg0][arg1 + 1] - this.field1439[arg0][arg1 + 1]) << 25;
                    }
                    var23.field423 = -1;
                }
                this.field1440[arg0][arg1] = var23;
            } else {
                class188 var30 = new class188();
                var30.field3087 = (short) arg2.length;
                var30.field3093 = (short) (arg2.length / 3);
                var30.field3089 = new short[var30.field3087];
                var30.field3092 = new short[var30.field3087];
                var30.field3095 = new short[var30.field3087];
                var30.field3094 = new int[var30.field3087];
                if (this.field1453 != null) {
                    var30.field3088 = new short[var30.field3087];
                }
                for (int var31 = 0; var31 < var30.field3087; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field1448[arg0][arg1] - this.field1439[arg0][arg1];
                    } else if (var46 == 0 && this.field1454 == var47) {
                        var49 = this.field1448[arg0][arg1 + 1] - this.field1439[arg0][arg1 + 1];
                    } else if (this.field1454 == var46 && this.field1454 == var47) {
                        var49 = this.field1448[arg0 + 1][arg1 + 1] - this.field1439[arg0 + 1][arg1 + 1];
                    } else if (this.field1454 == var46 && var47 == 0) {
                        var49 = this.field1448[arg0 + 1][arg1] - this.field1439[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field1448[arg0 + 1][arg1] - this.field1439[arg0 + 1][arg1]) * var46 + (this.field1448[arg0][arg1] - this.field1439[arg0][arg1]) * (this.field1454 - var46);
                        int var51 = (this.field1448[arg0 + 1][arg1 + 1] - this.field1439[arg0 + 1][arg1 + 1]) * var46 + (this.field1448[arg0][arg1 + 1] - this.field1439[arg0][arg1 + 1]) * (this.field1454 - var46);
                        var49 = (this.field1454 - var47) * var50 + var47 * var51 >> this.field1433 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field1433) + var46);
                    short var53 = (short) ((arg1 << this.field1433) + var47);
                    var30.field3089[var31] = var52;
                    var30.field3095[var31] = var53;
                    var30.field3092[var31] = (short) (this.method771(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field1446.field2395.method989(arg7[var31], (byte) 121).field4269) {
                        var30.field3094[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field3094[var31] = var49 << 25;
                        } else {
                            var30.field3094[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field1453 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field1453[arg0][arg1];
                            } else if (var46 == 0 && this.field1454 == var47) {
                                var56 = this.field1453[arg0][arg1 + 1];
                            } else if (this.field1454 == var46 && this.field1454 == var47) {
                                var56 = this.field1453[arg0 + 1][arg1 + 1];
                            } else if (this.field1454 == var46 && var47 == 0) {
                                var56 = this.field1453[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field1454 - var46) * this.field1453[arg0][arg1] + this.field1453[arg0 + 1][arg1] * var46;
                                int var58 = (this.field1454 - var46) * this.field1453[arg0][arg1 + 1] + this.field1453[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field1454 - var47) * var57 + var47 * var58 >> this.field1433 * 2;
                            }
                            var30.field3088[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field3094[var31] = class386.method2446(method774(arg5[var31] >> 8, var49), -2240, var54, arg9);
                        if (arg6 != null) {
                            var30.field3094[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field3093; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field1446.field2395.method989(arg7[var33 * 3], (byte) 29).field4269) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field3086 = new int[var30.field3093];
                }
                if (var32) {
                    var30.field3091 = new short[var30.field3093];
                    var30.field3090 = new short[var30.field3093];
                }
                for (int var34 = 0; var34 < var30.field3093; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field3086[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field1446.field2395.method989(var40, (byte) 103).field4269) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field1446.field2395.method989(var41, (byte) 45).field4269) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field1446.field2395.method989(var42, (byte) 59).field4269) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field3091[var34] = (short) var42;
                            var30.field3090[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field1446.field2395.method989(var43, (byte) 105).field4269) {
                                    var30.field3094[var35] = class62.field814[class99.method747(this.field1446.field2395.method989(var43, (byte) 113).field4284 & 65535, -9560) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field1446.field2395.method989(var44, (byte) 101).field4269) {
                                    var30.field3094[var36] = class62.field814[class99.method747(this.field1446.field2395.method989(var44, (byte) 34).field4284 & 65535, -9560) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field1446.field2395.method989(var45, (byte) 120).field4269) {
                                    var30.field3094[var37] = class62.field814[class99.method747(this.field1446.field2395.method989(var45, (byte) 100).field4284 & 65535, -9560) & 65535];
                                }
                            }
                            var30.field3091[var34] = -1;
                        }
                    }
                }
                this.field1435[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class141 var9 = this.field1446.method1085(Thread.currentThread());
        class25 var10 = var9.field2193;
        var10.field294 = 0;
        var10.field291 = false;
        if (this.field1440 != null) {
            this.method781(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2222, var9.field2239);
        } else {
            if (this.field1431 != null) {
                this.method783(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2222, var9.field2239);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public final void method770(int arg0, int arg1) {
        class141 var3 = this.field1446.method1085(Thread.currentThread());
        var3.field2193.field294 = 0;
        if (this.field1440 != null) {
            this.method785(arg0, arg1, this.field1446.field2415, var3.field2193, var3.field2222, var3.field2239, var3.field2221);
        } else {
            if (this.field1431 != null) {
                this.method773(arg0, arg1, var3.field2193, var3.field2222, var3.field2239, var3.field2221);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)I")
    public final int method771(int arg0, int arg1) {
        int var3 = arg0 >> this.field1433;
        int var4 = arg1 >> this.field1433;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2036 - 1 && var4 <= super.field2040 - 1) {
            int var5 = arg0 & this.field1454 - 1;
            int var6 = arg1 & this.field1454 - 1;
            int var7 = (this.field1454 - var5) * this.field1450[var3][var4] + this.field1450[var3 + 1][var4] * var5 >> this.field1433;
            int var8 = (this.field1454 - var5) * this.field1450[var3][var4 + 1] + this.field1450[var3 + 1][var4 + 1] * var5 >> this.field1433;
            return (this.field1454 - var6) * var7 + var6 * var8 >> this.field1433;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lej;[I)V")
    public final void method772(class62 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILbe;[I[I[I)V")
    private final void method773(int arg0, int arg1, class25 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class363 var7 = this.field1431[arg0][arg1];
        if (var7 != null) {
            if ((var7.field5534 & 2) == 0) {
                int var8 = this.field1454 * arg0;
                int var9 = this.field1454 + var8;
                int var10 = this.field1454 * arg1;
                int var11 = this.field1454 + var10;
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
                if ((var7.field5534 & 1) != 0) {
                    int var12 = this.field1450[arg0][arg1];
                    int var13 = this.field1445 * var12;
                    var14 = (this.field1432 * var10 + this.field1449 * var8 + var13 >> 15) + this.field1437;
                    if (var14 <= this.field1446.field2429) {
                        return;
                    }
                    var15 = (this.field1432 * var10 + this.field1449 * var9 + var13 >> 15) + this.field1437;
                    if (var15 <= this.field1446.field2429) {
                        return;
                    }
                    int var16 = (this.field1432 * var11 + this.field1449 * var9 + var13 >> 15) + this.field1437;
                    if (var16 <= this.field1446.field2429) {
                        return;
                    }
                    var17 = (this.field1432 * var11 + this.field1449 * var8 + var13 >> 15) + this.field1437;
                    if (var17 <= this.field1446.field2429) {
                        return;
                    }
                    int var18 = this.field1434 * var12;
                    int var19 = this.field1436 * var12;
                    var20 = (this.field1444 * var10 + this.field1452 * var8 + var18 >> 15) + this.field1443;
                    var21 = this.field1446.field2422 * var20 / var14 + arg2.field301;
                    var22 = (this.field1438 * var10 + this.field1442 * var8 + var19 >> 15) + this.field1451;
                    var23 = this.field1446.field2411 * var22 / var14 + arg2.field296;
                    var24 = (this.field1444 * var10 + this.field1452 * var9 + var18 >> 15) + this.field1443;
                    var25 = this.field1446.field2422 * var24 / var15 + arg2.field301;
                    var26 = (this.field1438 * var10 + this.field1442 * var9 + var19 >> 15) + this.field1451;
                    var27 = this.field1446.field2411 * var26 / var15 + arg2.field296;
                    int var28 = (this.field1444 * var11 + this.field1452 * var9 + var18 >> 15) + this.field1443;
                    var29 = this.field1446.field2422 * var28 / var16 + arg2.field301;
                    int var30 = (this.field1438 * var11 + this.field1442 * var9 + var19 >> 15) + this.field1451;
                    var31 = this.field1446.field2411 * var30 / var16 + arg2.field296;
                    var32 = (this.field1444 * var11 + this.field1452 * var8 + var18 >> 15) + this.field1443;
                    var33 = this.field1446.field2422 * var32 / var17 + arg2.field301;
                    var34 = (this.field1438 * var11 + this.field1442 * var8 + var19 >> 15) + this.field1451;
                    var35 = this.field1446.field2411 * var34 / var17 + arg2.field296;
                } else {
                    int var36 = this.field1450[arg0][arg1];
                    int var37 = this.field1450[arg0 + 1][arg1];
                    int var38 = this.field1450[arg0 + 1][arg1 + 1];
                    int var39 = this.field1450[arg0][arg1 + 1];
                    var14 = (this.field1432 * var10 + this.field1449 * var8 + this.field1445 * var36 >> 15) + this.field1437;
                    if (var14 <= this.field1446.field2429) {
                        return;
                    }
                    var15 = (this.field1432 * var10 + this.field1449 * var9 + this.field1445 * var37 >> 15) + this.field1437;
                    if (var15 <= this.field1446.field2429) {
                        return;
                    }
                    int var40 = (this.field1432 * var11 + this.field1449 * var9 + this.field1445 * var38 >> 15) + this.field1437;
                    if (var40 <= this.field1446.field2429) {
                        return;
                    }
                    var17 = (this.field1432 * var11 + this.field1449 * var8 + this.field1445 * var39 >> 15) + this.field1437;
                    if (var17 <= this.field1446.field2429) {
                        return;
                    }
                    var20 = (this.field1444 * var10 + this.field1452 * var8 + this.field1434 * var36 >> 15) + this.field1443;
                    var21 = this.field1446.field2422 * var20 / var14 + arg2.field301;
                    var22 = (this.field1438 * var10 + this.field1442 * var8 + this.field1436 * var36 >> 15) + this.field1451;
                    var23 = this.field1446.field2411 * var22 / var14 + arg2.field296;
                    var24 = (this.field1444 * var10 + this.field1452 * var9 + this.field1434 * var37 >> 15) + this.field1443;
                    var25 = this.field1446.field2422 * var24 / var15 + arg2.field301;
                    var26 = (this.field1438 * var10 + this.field1442 * var9 + this.field1436 * var37 >> 15) + this.field1451;
                    var27 = this.field1446.field2411 * var26 / var15 + arg2.field296;
                    int var41 = (this.field1444 * var11 + this.field1452 * var9 + this.field1434 * var38 >> 15) + this.field1443;
                    var29 = this.field1446.field2422 * var41 / var40 + arg2.field301;
                    int var42 = (this.field1438 * var11 + this.field1442 * var9 + this.field1436 * var38 >> 15) + this.field1451;
                    var31 = this.field1446.field2411 * var42 / var40 + arg2.field296;
                    var32 = (this.field1444 * var11 + this.field1452 * var8 + this.field1434 * var39 >> 15) + this.field1443;
                    var33 = this.field1446.field2422 * var32 / var17 + arg2.field301;
                    var34 = (this.field1438 * var11 + this.field1442 * var8 + this.field1436 * var39 >> 15) + this.field1451;
                    var35 = this.field1446.field2411 * var34 / var17 + arg2.field296;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field291 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field293 || var33 > arg2.field293 || var25 > arg2.field293;
                    if (var7.field5533 >= 0) {
                        if (this.method775(this.field1446.field2395.method989(var7.field5533, (byte) 36).field4279)) {
                            arg2.field294 = 100;
                        }
                        arg2.method165(var31, var35, var27, var29, var33, var25, var7.field5537 & 65535, var7.field5538 & 65535, var7.field5532 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5533);
                        arg2.field294 = 0;
                    } else {
                        arg2.method164(var31, var35, var27, var29, var33, var25, var7.field5537 & 65535, var7.field5538 & 65535, var7.field5532 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field291 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field293 || var25 > arg2.field293 || var33 > arg2.field293;
                    if (var7.field5533 >= 0) {
                        if (this.method775(this.field1446.field2395.method989(var7.field5533, (byte) 38).field4279)) {
                            arg2.field294 = 100;
                        }
                        arg2.method165(var23, var27, var35, var21, var25, var33, var7.field5536 & 65535, var7.field5532 & 65535, var7.field5538 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5533);
                        arg2.field294 = 0;
                        return;
                    }
                    arg2.method164(var23, var27, var35, var21, var25, var33, var7.field5536 & 65535, var7.field5532 & 65535, var7.field5538 & 65535);
                }
            }
        } else {
            class307 var43 = this.field1441[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field4863; ++var44) {
                    int var84 = var43.field4860[var44];
                    int var85 = var43.field4864[var44];
                    int var86 = var43.field4871[var44];
                    int var87 = (this.field1432 * var86 + this.field1449 * var84 + this.field1445 * var85 >> 15) + this.field1437;
                    if (var87 <= this.field1446.field2429) {
                        return;
                    }
                    int var88 = (this.field1444 * var86 + this.field1452 * var84 + this.field1434 * var85 >> 15) + this.field1443;
                    int var89 = (this.field1438 * var86 + this.field1442 * var84 + this.field1436 * var85 >> 15) + this.field1451;
                    arg3[var44] = this.field1446.field2422 * var88 / var87 + arg2.field301;
                    arg4[var44] = this.field1446.field2411 * var89 / var87 + arg2.field296;
                }
                if (var43.field4865 != null) {
                    int var45 = this.field1450[arg0][arg1];
                    int var46 = this.field1450[arg0 + 1][arg1];
                    int var47 = this.field1450[arg0][arg1 + 1];
                    int var48 = this.field1454 * arg0;
                    int var49 = this.field1454 + var48;
                    int var50 = this.field1454 * arg1;
                    int var51 = this.field1454 + var50;
                    int var52 = (this.field1444 * var50 + this.field1452 * var48 + this.field1434 * var45 >> 15) + this.field1443;
                    int var53 = (this.field1438 * var50 + this.field1442 * var48 + this.field1436 * var45 >> 15) + this.field1451;
                    int var54 = (this.field1432 * var50 + this.field1449 * var48 + this.field1445 * var45 >> 15) + this.field1437;
                    int var55 = (this.field1444 * var50 + this.field1452 * var49 + this.field1434 * var46 >> 15) + this.field1443;
                    int var56 = (this.field1438 * var50 + this.field1442 * var49 + this.field1436 * var46 >> 15) + this.field1451;
                    int var57 = (this.field1432 * var50 + this.field1449 * var49 + this.field1445 * var46 >> 15) + this.field1437;
                    int var58 = (this.field1444 * var51 + this.field1452 * var48 + this.field1434 * var47 >> 15) + this.field1443;
                    int var59 = (this.field1438 * var51 + this.field1442 * var48 + this.field1436 * var47 >> 15) + this.field1451;
                    int var60 = (this.field1432 * var51 + this.field1449 * var48 + this.field1445 * var47 >> 15) + this.field1437;
                    for (int var61 = 0; var61 < var43.field4861; ++var61) {
                        short var62 = var43.field4870[var61];
                        short var63 = var43.field4868[var61];
                        short var64 = var43.field4869[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field291 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field293 || var66 > arg2.field293 || var67 > arg2.field293;
                            short var71 = var43.field4865[var61];
                            if (var71 != -1) {
                                if (this.method775(this.field1446.field2395.method989(var71, (byte) 114).field4279)) {
                                    arg2.field294 = 100;
                                }
                                arg2.method165(var68, var69, var70, var65, var66, var67, var43.field4867[var62], var43.field4867[var63], var43.field4867[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field294 = 0;
                            } else {
                                int var72 = var43.field4872[var61];
                                if (var72 != -1) {
                                    arg2.method164(var68, var69, var70, var65, var66, var67, class114.method838(256, var43.field4867[var62], var72), class114.method838(256, var43.field4867[var63], var72), class114.method838(256, var43.field4867[var64], var72));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field4861; ++var73) {
                    short var74 = var43.field4870[var73];
                    short var75 = var43.field4868[var73];
                    short var76 = var43.field4869[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field4872[var73];
                        if (var83 != -1) {
                            arg2.field291 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field293 || var78 > arg2.field293 || var79 > arg2.field293;
                            arg2.method164(var80, var81, var82, var77, var78, var79, class114.method838(256, var43.field4867[var74], var83), class114.method838(256, var43.field4867[var75], var83), class114.method838(256, var43.field4867[var76], var83));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(II)I")
    private static final int method774(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Z")
    private final boolean method775(int arg0) {
        if ((this.field1447 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method776(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field1431 == null) {
            this.field1431 = new class363[super.field2036][super.field2040];
            this.field1441 = new class307[super.field2036][super.field2040];
        } else if (this.field1440 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field1454 != var18 || var19 != 0 && this.field1454 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class307 var20 = new class307();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field4863 = var21;
            var20.field4867 = new short[var21];
            var20.field4860 = new int[var21];
            var20.field4864 = new int[var21];
            var20.field4871 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field4867[var23] = (short) (this.field1448[arg0][arg1] - this.field1439[arg0][arg1]);
                } else if (var28 == 0 && this.field1454 == var29) {
                    var20.field4867[var23] = (short) (this.field1448[arg0][arg1 + 1] - this.field1439[arg0][arg1 + 1]);
                } else if (this.field1454 == var28 && this.field1454 == var29) {
                    var20.field4867[var23] = (short) (this.field1448[arg0 + 1][arg1 + 1] - this.field1439[arg0 + 1][arg1 + 1]);
                } else if (this.field1454 == var28 && var29 == 0) {
                    var20.field4867[var23] = (short) (this.field1448[arg0 + 1][arg1] - this.field1439[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field1448[arg0 + 1][arg1] - this.field1439[arg0 + 1][arg1]) * var28 + (this.field1448[arg0][arg1] - this.field1439[arg0][arg1]) * (this.field1454 - var28);
                    int var31 = (this.field1448[arg0 + 1][arg1 + 1] - this.field1439[arg0 + 1][arg1 + 1]) * var28 + (this.field1448[arg0][arg1 + 1] - this.field1439[arg0][arg1 + 1]) * (this.field1454 - var28);
                    var20.field4867[var23] = (short) ((this.field1454 - var29) * var30 + var29 * var31 >> this.field1433 * 2);
                }
                int var32 = (arg0 << this.field1433) + var28;
                int var33 = (arg1 << this.field1433) + var29;
                var20.field4860[var23] = var32;
                var20.field4871[var23] = var33;
                var20.field4864[var23] = this.method771(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field4867[var23] < 2) {
                    var20.field4867[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field1446.field2395.method989(arg10[var26], (byte) 61).field4269) {
                    var24 = true;
                }
            }
            var20.field4872 = new int[var25];
            if (arg9 != null) {
                var20.field4862 = new int[var25];
            }
            var20.field4870 = new short[var25];
            var20.field4868 = new short[var25];
            var20.field4869 = new short[var25];
            if (var24) {
                var20.field4865 = new short[var25];
                var20.field4866 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field4872[var20.field4861] = class99.method747(arg8[var27], -9560);
                    } else {
                        var20.field4872[var20.field4861] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field4862[var20.field4861] = class99.method747(arg9[var27], -9560);
                        } else {
                            var20.field4862[var20.field4861] = -1;
                        }
                    }
                    var20.field4870[var20.field4861] = (short) arg5[var27];
                    var20.field4868[var20.field4861] = (short) arg6[var27];
                    var20.field4869[var20.field4861] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field1446.field2395.method989(arg10[var27], (byte) 28).field4269) {
                            var20.field4865[var20.field4861] = (short) arg10[var27];
                            var20.field4866[var20.field4861] = (short) arg11[var27];
                        } else {
                            var20.field4865[var20.field4861] = -1;
                        }
                    }
                    ++var20.field4861;
                }
            }
            this.field1441[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class363 var34 = new class363();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field5535 = class114.method838(256, this.field1448[arg0][arg1] - this.field1439[arg0][arg1], class99.method747(arg9[0], -9560));
                    if (var35 == -1) {
                        var34.field5534 = (byte) (var34.field5534 | 2);
                    }
                }
                if (this.field1450[arg0 + 1][arg1] == this.field1450[arg0][arg1] && this.field1450[arg0 + 1][arg1 + 1] == this.field1450[arg0][arg1] && this.field1450[arg0][arg1 + 1] == this.field1450[arg0][arg1]) {
                    var34.field5534 = (byte) (var34.field5534 | 1);
                }
                if (var36 != -1 && (var34.field5534 & 2) == 0 && !this.field1446.field2395.method989(var36, (byte) 100).field4269) {
                    var34.field5536 = (short) (this.field1448[arg0][arg1] - this.field1439[arg0][arg1]);
                    var34.field5532 = (short) (this.field1448[arg0 + 1][arg1] - this.field1439[arg0 + 1][arg1]);
                    var34.field5537 = (short) (this.field1448[arg0 + 1][arg1 + 1] - this.field1439[arg0 + 1][arg1 + 1]);
                    var34.field5538 = (short) (this.field1448[arg0][arg1 + 1] - this.field1439[arg0][arg1 + 1]);
                    var34.field5533 = (short) var36;
                } else {
                    short var37 = class99.method747(var35, -9560);
                    var34.field5536 = (short) class114.method838(256, this.field1448[arg0][arg1] - this.field1439[arg0][arg1], var37);
                    var34.field5532 = (short) class114.method838(256, this.field1448[arg0 + 1][arg1] - this.field1439[arg0 + 1][arg1], var37);
                    var34.field5537 = (short) class114.method838(256, this.field1448[arg0 + 1][arg1 + 1] - this.field1439[arg0 + 1][arg1 + 1], var37);
                    var34.field5538 = (short) class114.method838(256, this.field1448[arg0][arg1 + 1] - this.field1439[arg0][arg1 + 1], var37);
                    var34.field5533 = -1;
                }
                this.field1431[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILas;)Las;")
    public final class84 method777(int arg0, int arg1, class84 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Las;IIIIZ)V")
    public final void method778(class84 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lkd;IIII[[I[[II)V")
    public class103(class154 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1446 = arg0;
        this.field1447 = arg2;
        this.field1450 = arg5;
        this.field1453 = arg6;
        this.field1454 = arg7;
        this.field1433 = 0;
        while (arg7 > 1) {
            ++this.field1433;
            arg7 >>= 1;
        }
        this.field1448 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1446.field2410 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field1450[var11 + 1][var10] - this.field1450[var11 - 1][var10];
                int var14 = this.field1450[var11][var10 + 1] - this.field1450[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1446.field2424 * var18 + this.field1446.field2398 * var17 + this.field1446.field2383 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1448[var11][var10] = (byte) var20;
            }
        }
        this.field1439 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)I")
    public final int method779(int arg0, int arg1) {
        return this.field1450[arg0][arg1];
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
    public final void method780() {
        this.field1448 = null;
        this.field1439 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII[[ZLbe;[I[I)V")
    private final void method781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class25 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field300 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1440[var16][var17] != null) {
                        class34 var18 = this.field1440[var16][var17];
                        if (var18.field423 != -1 && (var18.field421 & 2) == 0 && var18.field418 == 0) {
                            int var19 = this.field1446.method1082(var18.field423);
                            arg8.method164(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class114.method838(256, var18.field420, var19), class114.method838(256, var18.field419, var19), class114.method838(256, var18.field424, var19));
                            arg8.method164(var15, var15, var15 - var13, var14, var13 + var14, var14, class114.method838(256, var18.field422, var19), class114.method838(256, var18.field424, var19), class114.method838(256, var18.field419, var19));
                        } else if (var18.field418 == 0) {
                            arg8.method171(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field420, var18.field419, var18.field424);
                            arg8.method171(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field422, var18.field424, var18.field419);
                        } else {
                            int var20 = var18.field418;
                            arg8.method171(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class426.method2640(2, var20, var18.field420 & -16777216), class426.method2640(2, var20, var18.field419 & -16777216), class426.method2640(2, var20, var18.field424 & -16777216));
                            arg8.method171(var15, var15, var15 - var13, var14, var13 + var14, var14, class426.method2640(2, var20, var18.field422 & -16777216), class426.method2640(2, var20, var18.field424 & -16777216), class426.method2640(2, var20, var18.field419 & -16777216));
                        }
                    } else if (this.field1435[var16][var17] != null) {
                        class188 var21 = this.field1435[var16][var17];
                        for (int var22 = 0; var22 < var21.field3087; ++var22) {
                            arg9[var22] = (var21.field3089[var22] - this.field1454 * var16) * var13 / this.field1454 + var14;
                            arg10[var22] = var15 - (var21.field3095[var22] - this.field1454 * var17) * var13 / this.field1454;
                        }
                        for (int var23 = 0; var23 < var21.field3093; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3086 == null || var21.field3086[var23] == 0 || var21.field3091 != null && (var21.field3091 == null || var21.field3091[var23] != -1)) {
                                if (var21.field3091 != null && var21.field3091[var23] != -1) {
                                    int var34 = this.field1446.method1082(var21.field3091[var23]);
                                    arg8.method164(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method171(var30, var31, var32, var27, var28, var29, var21.field3094[var24], var21.field3094[var25], var21.field3094[var26]);
                                }
                            } else {
                                int var33 = var21.field3086[var23];
                                arg8.method171(var30, var31, var32, var27, var28, var29, class426.method2640(2, var33, -16777216 - (var21.field3094[var24] & -16777216)), class426.method2640(2, var33, -16777216 - (var21.field3094[var25] & -16777216)), class426.method2640(2, var33, -16777216 - (var21.field3094[var26] & -16777216)));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field300 = true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Las;IIIIZ)Z")
    public final boolean method782(class84 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIIII[[ZLbe;[I[I)V")
    private final void method783(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class25 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field300 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1431[var16][var17] != null) {
                        class363 var18 = this.field1431[var16][var17];
                        if (var18.field5533 != -1 && (var18.field5534 & 2) == 0 && var18.field5535 == -1) {
                            int var19 = this.field1446.method1082(var18.field5533);
                            arg8.method164(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class114.method838(256, var18.field5537 & 65535, var19), class114.method838(256, var18.field5538 & 65535, var19), class114.method838(256, var18.field5532 & 65535, var19));
                            arg8.method164(var15, var15, var15 - var13, var14, var13 + var14, var14, class114.method838(256, var18.field5536 & 65535, var19), class114.method838(256, var18.field5532 & 65535, var19), class114.method838(256, var18.field5538 & 65535, var19));
                        } else if (var18.field5535 == -1) {
                            arg8.method164(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5537 & 65535, var18.field5538 & 65535, var18.field5532 & 65535);
                            arg8.method164(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5536 & 65535, var18.field5532 & 65535, var18.field5538 & 65535);
                        } else {
                            int var20 = var18.field5535;
                            arg8.method164(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method164(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1441[var16][var17] != null) {
                        class307 var21 = this.field1441[var16][var17];
                        for (int var22 = 0; var22 < var21.field4863; ++var22) {
                            arg9[var22] = (var21.field4860[var22] - this.field1454 * var16) * var13 / this.field1454 + var14;
                            arg10[var22] = var15 - (var21.field4871[var22] - this.field1454 * var17) * var13 / this.field1454;
                        }
                        for (int var23 = 0; var23 < var21.field4861; ++var23) {
                            short var24 = var21.field4870[var23];
                            short var25 = var21.field4868[var23];
                            short var26 = var21.field4869[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4862 != null && var21.field4862[var23] != -1) {
                                int var33 = var21.field4862[var23];
                                arg8.method164(var30, var31, var32, var27, var28, var29, class114.method838(256, var21.field4867[var24], var33), class114.method838(256, var21.field4867[var25], var33), class114.method838(256, var21.field4867[var26], var33));
                            } else if (var21.field4865 != null && var21.field4865[var23] != -1) {
                                int var34 = this.field1446.method1082(var21.field4865[var23]);
                                arg8.method164(var30, var31, var32, var27, var28, var29, class114.method838(256, var21.field4867[var24], var34), class114.method838(256, var21.field4867[var25], var34), class114.method838(256, var21.field4867[var26], var34));
                            } else {
                                int var35 = var21.field4872[var23];
                                arg8.method164(var30, var31, var32, var27, var28, var29, class114.method838(256, var21.field4867[var24], var35), class114.method838(256, var21.field4867[var25], var35), class114.method838(256, var21.field4867[var26], var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field300 = true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[[ZZ)V")
    public final void method784(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class294 var6 = this.field1446.field2417;
        this.field1452 = var6.field4705;
        this.field1434 = var6.field4709;
        this.field1444 = var6.field4699;
        this.field1443 = var6.field4703;
        this.field1442 = var6.field4706;
        this.field1436 = var6.field4698;
        this.field1438 = var6.field4702;
        this.field1451 = var6.field4708;
        this.field1449 = var6.field4707;
        this.field1445 = var6.field4704;
        this.field1432 = var6.field4701;
        this.field1437 = var6.field4700;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZLbe;[I[I[I)V")
    private final void method785(int arg0, int arg1, boolean arg2, class25 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class34 var8 = this.field1440[arg0][arg1];
        if (var8 != null) {
            if ((var8.field421 & 2) == 0) {
                int var9 = this.field1454 * arg0;
                int var10 = this.field1454 + var9;
                int var11 = this.field1454 * arg1;
                int var12 = this.field1454 + var11;
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
                if ((var8.field421 & 1) != 0 && !arg2) {
                    int var17 = this.field1450[arg0][arg1];
                    int var18 = this.field1445 * var17;
                    var19 = (this.field1432 * var11 + this.field1449 * var9 + var18 >> 15) + this.field1437;
                    if (var19 <= this.field1446.field2429) {
                        return;
                    }
                    var20 = (this.field1432 * var11 + this.field1449 * var10 + var18 >> 15) + this.field1437;
                    if (var20 <= this.field1446.field2429) {
                        return;
                    }
                    var21 = (this.field1432 * var12 + this.field1449 * var10 + var18 >> 15) + this.field1437;
                    if (var21 <= this.field1446.field2429) {
                        return;
                    }
                    var22 = (this.field1432 * var12 + this.field1449 * var9 + var18 >> 15) + this.field1437;
                    if (var22 <= this.field1446.field2429) {
                        return;
                    }
                    if (this.field1446.field2405) {
                        int var23 = var19 - this.field1446.field2394;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1446.field2394;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1446.field2394;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1446.field2394;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1434 * var17;
                    int var28 = this.field1436 * var17;
                    var29 = (this.field1444 * var11 + this.field1452 * var9 + var27 >> 15) + this.field1443;
                    var30 = this.field1446.field2422 * var29 / var19 + arg3.field301;
                    var31 = (this.field1438 * var11 + this.field1442 * var9 + var28 >> 15) + this.field1451;
                    var32 = this.field1446.field2411 * var31 / var19 + arg3.field296;
                    var33 = (this.field1444 * var11 + this.field1452 * var10 + var27 >> 15) + this.field1443;
                    var34 = this.field1446.field2422 * var33 / var20 + arg3.field301;
                    var35 = (this.field1438 * var11 + this.field1442 * var10 + var28 >> 15) + this.field1451;
                    var36 = this.field1446.field2411 * var35 / var20 + arg3.field296;
                    var37 = (this.field1444 * var12 + this.field1452 * var10 + var27 >> 15) + this.field1443;
                    var38 = this.field1446.field2422 * var37 / var21 + arg3.field301;
                    var39 = (this.field1438 * var12 + this.field1442 * var10 + var28 >> 15) + this.field1451;
                    var40 = this.field1446.field2411 * var39 / var21 + arg3.field296;
                    var41 = (this.field1444 * var12 + this.field1452 * var9 + var27 >> 15) + this.field1443;
                    var42 = this.field1446.field2422 * var41 / var22 + arg3.field301;
                    var43 = (this.field1438 * var12 + this.field1442 * var9 + var28 >> 15) + this.field1451;
                    var44 = this.field1446.field2411 * var43 / var22 + arg3.field296;
                } else {
                    int var45 = this.field1450[arg0][arg1];
                    int var46 = this.field1450[arg0 + 1][arg1];
                    int var47 = this.field1450[arg0 + 1][arg1 + 1];
                    int var48 = this.field1450[arg0][arg1 + 1];
                    var19 = (this.field1432 * var11 + this.field1449 * var9 + this.field1445 * var45 >> 15) + this.field1437;
                    if (var19 <= this.field1446.field2429) {
                        return;
                    }
                    var20 = (this.field1432 * var11 + this.field1449 * var10 + this.field1445 * var46 >> 15) + this.field1437;
                    if (var20 <= this.field1446.field2429) {
                        return;
                    }
                    var21 = (this.field1432 * var12 + this.field1449 * var10 + this.field1445 * var47 >> 15) + this.field1437;
                    if (var21 <= this.field1446.field2429) {
                        return;
                    }
                    var22 = (this.field1432 * var12 + this.field1449 * var9 + this.field1445 * var48 >> 15) + this.field1437;
                    if (var22 <= this.field1446.field2429) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1446.field2394;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field1453[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1446.field2394;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field1453[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1446.field2394;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field1453[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1446.field2394;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field1453[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1446.field2405) {
                        int var57 = var19 - this.field1446.field2394;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1446.field2394;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1446.field2394;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1446.field2394;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1444 * var11 + this.field1452 * var9 + this.field1434 * var45 >> 15) + this.field1443;
                    var30 = this.field1446.field2422 * var29 / var19 + arg3.field301;
                    var31 = (this.field1438 * var11 + this.field1442 * var9 + this.field1436 * var45 >> 15) + this.field1451;
                    var32 = this.field1446.field2411 * var31 / var19 + arg3.field296;
                    var33 = (this.field1444 * var11 + this.field1452 * var10 + this.field1434 * var46 >> 15) + this.field1443;
                    var34 = this.field1446.field2422 * var33 / var20 + arg3.field301;
                    var35 = (this.field1438 * var11 + this.field1442 * var10 + this.field1436 * var46 >> 15) + this.field1451;
                    var36 = this.field1446.field2411 * var35 / var20 + arg3.field296;
                    var37 = (this.field1444 * var12 + this.field1452 * var10 + this.field1434 * var47 >> 15) + this.field1443;
                    var38 = this.field1446.field2422 * var37 / var21 + arg3.field301;
                    var39 = (this.field1438 * var12 + this.field1442 * var10 + this.field1436 * var47 >> 15) + this.field1451;
                    var40 = this.field1446.field2411 * var39 / var21 + arg3.field296;
                    var41 = (this.field1444 * var12 + this.field1452 * var9 + this.field1434 * var48 >> 15) + this.field1443;
                    var42 = this.field1446.field2422 * var41 / var22 + arg3.field301;
                    var43 = (this.field1438 * var12 + this.field1442 * var9 + this.field1436 * var48 >> 15) + this.field1451;
                    var44 = this.field1446.field2411 * var43 / var22 + arg3.field296;
                }
                boolean var61 = var8.field423 != -1 && this.method775(this.field1446.field2395.method989(var8.field423, (byte) 29).field4279);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field291 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field293 || var42 > arg3.field293 || var34 > arg3.field293;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field294 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field423 >= 0) {
                                arg3.method173(var40, var44, var36, var38, var42, var34, this.field1446.field2387, var15, var16, var14, var8.field420, var8.field419, var8.field424, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field423);
                            } else {
                                arg3.method171(var40, var44, var36, var38, var42, var34, class426.method2640(2, var8.field420, var15 << 24 | this.field1446.field2387), class426.method2640(2, var8.field419, var16 << 24 | this.field1446.field2387), class426.method2640(2, var8.field424, var14 << 24 | this.field1446.field2387));
                            }
                        } else if (var8.field423 >= 0) {
                            arg3.method165(var40, var44, var36, var38, var42, var34, var8.field420, var8.field419, var8.field424, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field423);
                        } else {
                            arg3.method171(var40, var44, var36, var38, var42, var34, var8.field420, var8.field419, var8.field424);
                        }
                        arg3.field294 = 0;
                    } else {
                        arg3.method176(var40, var44, var36, var38, var42, var34, this.field1446.field2387);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field291 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field293 || var34 > arg3.field293 || var42 > arg3.field293;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field294 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field423 >= 0) {
                                arg3.method173(var32, var36, var44, var30, var34, var42, this.field1446.field2387, var13, var14, var16, var8.field422, var8.field424, var8.field419, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field423);
                            } else {
                                arg3.method171(var32, var36, var44, var30, var34, var42, class426.method2640(2, var8.field422, var13 << 24 | this.field1446.field2387), class426.method2640(2, var8.field424, var14 << 24 | this.field1446.field2387), class426.method2640(2, var8.field419, var16 << 24 | this.field1446.field2387));
                            }
                        } else if (var8.field423 >= 0) {
                            arg3.method165(var32, var36, var44, var30, var34, var42, var8.field422, var8.field424, var8.field419, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field423);
                        } else {
                            arg3.method171(var32, var36, var44, var30, var34, var42, var8.field422, var8.field424, var8.field419);
                        }
                        arg3.field294 = 0;
                        return;
                    }
                    arg3.method176(var32, var36, var44, var30, var34, var42, this.field1446.field2387);
                }
            }
        } else {
            class188 var64 = this.field1435[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field3087; ++var65) {
                    short var105 = var64.field3089[var65];
                    int var106 = var64.field3092[var65];
                    short var107 = var64.field3095[var65];
                    int var108 = (this.field1432 * var107 + this.field1449 * var105 + this.field1445 * var106 >> 15) + this.field1437;
                    if (var108 <= this.field1446.field2429) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field1446.field2394;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field3088[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field1446.field2405) {
                        int var111 = var108 - this.field1446.field2394;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field1444 * var107 + this.field1452 * var105 + this.field1434 * var106 >> 15) + this.field1443;
                    int var113 = (this.field1438 * var107 + this.field1442 * var105 + this.field1436 * var106 >> 15) + this.field1451;
                    arg4[var65] = this.field1446.field2422 * var112 / var108 + arg3.field301;
                    arg5[var65] = this.field1446.field2411 * var113 / var108 + arg3.field296;
                }
                if (var64.field3091 != null) {
                    int var66 = this.field1450[arg0][arg1];
                    int var67 = this.field1450[arg0 + 1][arg1];
                    int var68 = this.field1450[arg0][arg1 + 1];
                    int var69 = this.field1454 * arg0;
                    int var70 = this.field1454 + var69;
                    int var71 = this.field1454 * arg1;
                    int var72 = this.field1454 + var71;
                    int var73 = (this.field1444 * var71 + this.field1452 * var69 + this.field1434 * var66 >> 15) + this.field1443;
                    int var74 = (this.field1438 * var71 + this.field1442 * var69 + this.field1436 * var66 >> 15) + this.field1451;
                    int var75 = (this.field1432 * var71 + this.field1449 * var69 + this.field1445 * var66 >> 15) + this.field1437;
                    int var76 = (this.field1444 * var71 + this.field1452 * var70 + this.field1434 * var67 >> 15) + this.field1443;
                    int var77 = (this.field1438 * var71 + this.field1442 * var70 + this.field1436 * var67 >> 15) + this.field1451;
                    int var78 = (this.field1432 * var71 + this.field1449 * var70 + this.field1445 * var67 >> 15) + this.field1437;
                    int var79 = (this.field1444 * var72 + this.field1452 * var69 + this.field1434 * var68 >> 15) + this.field1443;
                    int var80 = (this.field1438 * var72 + this.field1442 * var69 + this.field1436 * var68 >> 15) + this.field1451;
                    int var81 = (this.field1432 * var72 + this.field1449 * var69 + this.field1445 * var68 >> 15) + this.field1437;
                    for (int var82 = 0; var82 < var64.field3093; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field291 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field293 || var87 > arg3.field293 || var88 > arg3.field293;
                            short var93 = var64.field3091[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method775(this.field1446.field2395.method989(var93, (byte) 123).field4279)) {
                                    arg3.field294 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method173(var89, var90, var91, var86, var87, var88, this.field1446.field2387, arg6[var83], arg6[var84], arg6[var85], var64.field3094[var83], var64.field3094[var84], var64.field3094[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field3094[var83] & 16777215) != 0) {
                                        arg3.method171(var89, var90, var91, var86, var87, var88, class426.method2640(2, var64.field3094[var83], arg6[var83] << 24 | this.field1446.field2387), class426.method2640(2, var64.field3094[var84], arg6[var84] << 24 | this.field1446.field2387), class426.method2640(2, var64.field3094[var85], arg6[var85] << 24 | this.field1446.field2387));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method165(var89, var90, var91, var86, var87, var88, var64.field3094[var83], var64.field3094[var84], var64.field3094[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field3094[var83] & 16777215) != 0) {
                                    arg3.method171(var89, var90, var91, var86, var87, var88, var64.field3094[var83], var64.field3094[var84], var64.field3094[var85]);
                                }
                                arg3.field294 = 0;
                            } else {
                                arg3.method176(var89, var90, var91, var86, var87, var88, this.field1446.field2387);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field3093; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field291 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field293 || var99 > arg3.field293 || var100 > arg3.field293;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field3094[var95] & 16777215) != 0) {
                                    arg3.method171(var101, var102, var103, var98, var99, var100, class386.method2446(var64.field3094[var95], -2240, arg6[var95], this.field1446.field2387), class386.method2446(var64.field3094[var96], -2240, arg6[var96], this.field1446.field2387), class386.method2446(var64.field3094[var97], -2240, arg6[var97], this.field1446.field2387));
                                }
                            } else if ((var64.field3094[var95] & 16777215) != 0) {
                                arg3.method171(var101, var102, var103, var98, var99, var100, var64.field3094[var95], var64.field3094[var96], var64.field3094[var97]);
                            }
                        } else {
                            arg3.method176(var101, var102, var103, var98, var99, var100, this.field1446.field2387);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
    public final void method786(int arg0, int arg1, int arg2) {
        if (this.field1439[arg0][arg1] < arg2) {
            this.field1439[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Las;IIIIZ)V")
    public final void method787(class84 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
