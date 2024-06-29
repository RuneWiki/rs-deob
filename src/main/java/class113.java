import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class113 extends class337 {

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lcs;")
    private class389 field1529;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[[I")
    public int[][] field1525;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[[I")
    private int[][] field1527;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "[[B")
    private byte[][] field1544;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "[[B")
    private byte[][] field1533;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "[[Lbb;")
    private class136[][] field1534;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "[[Lkg;")
    private class216[][] field1542;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "[[Ld;")
    private class379[][] field1531;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "[[Lkl;")
    private class412[][] field1546;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Loc;IIIIZ)Z")
    public final boolean method778(class93 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method779(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field1546 == null) {
            this.field1546 = new class412[super.field4978][super.field4970];
            this.field1542 = new class216[super.field4978][super.field4970];
        } else if (this.field1531 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class300.field4317[class196.method1227((byte) 46, arg5[var13]) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class300.field4317[class196.method1227((byte) -23, arg6[var14]) & 65535] << 8 | 255;
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
                    } else if (arg2[var20] == this.field1530 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field1530 && arg4[var20] == this.field1530) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field1530) {
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
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field1530 != arg2[var22] && arg2[0] - this.field1530 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field1530 != arg4[var22] && arg4[0] - this.field1530 != arg4[var22]) {
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
                class412 var23 = new class412();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field6157 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field6162 = (byte) (var23.field6162 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field1525[arg0 + 1][arg1] == this.field1525[arg0][arg1] && this.field1525[arg0 + 1][arg1 + 1] == this.field1525[arg0][arg1] && this.field1525[arg0][arg1 + 1] == this.field1525[arg0][arg1]) {
                    var23.field6162 = (byte) (var23.field6162 | 1);
                }
                if (var25 != -1 && (var23.field6162 & 2) == 0 && !this.field1529.field5841.method1760(-19907, var25).field2273) {
                    var23.field6163 = this.field1544[arg0][arg1] - this.field1533[arg0][arg1];
                    var23.field6158 = this.field1544[arg0 + 1][arg1] - this.field1533[arg0 + 1][arg1];
                    var23.field6160 = this.field1544[arg0 + 1][arg1 + 1] - this.field1533[arg0 + 1][arg1 + 1];
                    var23.field6161 = this.field1544[arg0][arg1 + 1] - this.field1533[arg0][arg1 + 1];
                    var23.field6159 = (short) var25;
                } else {
                    int var26;
                    if (this.field1527 != null && arg10 != 0) {
                        var26 = this.field1527[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field6163 = class339.method2242(-16711936, var26, method792(arg5[var16] >> 8, this.field1544[arg0][arg1] - this.field1533[arg0][arg1]), arg9);
                    if (var23.field6157 != 0) {
                        var23.field6163 |= 255 - (this.field1544[arg0][arg1] - this.field1533[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field1527 != null && arg10 != 0) {
                        var27 = this.field1527[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field6158 = class339.method2242(-16711936, var27, method792(arg5[var17] >> 8, this.field1544[arg0 + 1][arg1] - this.field1533[arg0 + 1][arg1]), arg9);
                    if (var23.field6157 != 0) {
                        var23.field6158 |= 255 - (this.field1544[arg0 + 1][arg1] - this.field1533[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field1527 != null && arg10 != 0) {
                        var28 = this.field1527[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field6160 = class339.method2242(-16711936, var28, method792(arg5[var18] >> 8, this.field1544[arg0 + 1][arg1 + 1] - this.field1533[arg0 + 1][arg1 + 1]), arg9);
                    if (var23.field6157 != 0) {
                        var23.field6160 |= 255 - (this.field1544[arg0 + 1][arg1 + 1] - this.field1533[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field1527 != null && arg10 != 0) {
                        var29 = this.field1527[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field6161 = class339.method2242(-16711936, var29, method792(arg5[var19] >> 8, this.field1544[arg0][arg1 + 1] - this.field1533[arg0][arg1 + 1]), arg9);
                    if (var23.field6157 != 0) {
                        var23.field6161 |= 255 - (this.field1544[arg0][arg1 + 1] - this.field1533[arg0][arg1 + 1]) << 25;
                    }
                    var23.field6159 = -1;
                }
                this.field1546[arg0][arg1] = var23;
            } else {
                class216 var30 = new class216();
                var30.field3091 = (short) arg2.length;
                var30.field3094 = (short) (arg2.length / 3);
                var30.field3097 = new short[var30.field3091];
                var30.field3093 = new short[var30.field3091];
                var30.field3090 = new short[var30.field3091];
                var30.field3089 = new int[var30.field3091];
                if (this.field1527 != null) {
                    var30.field3088 = new short[var30.field3091];
                }
                for (int var31 = 0; var31 < var30.field3091; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field1544[arg0][arg1] - this.field1533[arg0][arg1];
                    } else if (var46 == 0 && this.field1530 == var47) {
                        var49 = this.field1544[arg0][arg1 + 1] - this.field1533[arg0][arg1 + 1];
                    } else if (this.field1530 == var46 && this.field1530 == var47) {
                        var49 = this.field1544[arg0 + 1][arg1 + 1] - this.field1533[arg0 + 1][arg1 + 1];
                    } else if (this.field1530 == var46 && var47 == 0) {
                        var49 = this.field1544[arg0 + 1][arg1] - this.field1533[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field1544[arg0 + 1][arg1] - this.field1533[arg0 + 1][arg1]) * var46 + (this.field1544[arg0][arg1] - this.field1533[arg0][arg1]) * (this.field1530 - var46);
                        int var51 = (this.field1544[arg0 + 1][arg1 + 1] - this.field1533[arg0 + 1][arg1 + 1]) * var46 + (this.field1544[arg0][arg1 + 1] - this.field1533[arg0][arg1 + 1]) * (this.field1530 - var46);
                        var49 = (this.field1530 - var47) * var50 + var47 * var51 >> this.field1545 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field1545) + var46);
                    short var53 = (short) ((arg1 << this.field1545) + var47);
                    var30.field3097[var31] = var52;
                    var30.field3090[var31] = var53;
                    var30.field3093[var31] = (short) (this.method797(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field1529.field5841.method1760(-19907, arg7[var31]).field2273) {
                        var30.field3089[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field3089[var31] = var49 << 25;
                        } else {
                            var30.field3089[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field1527 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field1527[arg0][arg1];
                            } else if (var46 == 0 && this.field1530 == var47) {
                                var56 = this.field1527[arg0][arg1 + 1];
                            } else if (this.field1530 == var46 && this.field1530 == var47) {
                                var56 = this.field1527[arg0 + 1][arg1 + 1];
                            } else if (this.field1530 == var46 && var47 == 0) {
                                var56 = this.field1527[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field1530 - var46) * this.field1527[arg0][arg1] + this.field1527[arg0 + 1][arg1] * var46;
                                int var58 = (this.field1530 - var46) * this.field1527[arg0][arg1 + 1] + this.field1527[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field1530 - var47) * var57 + var47 * var58 >> this.field1545 * 2;
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
                        var30.field3089[var31] = class339.method2242(-16711936, var54, method792(arg5[var31] >> 8, var49), arg9);
                        if (arg6 != null) {
                            var30.field3089[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field3094; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field1529.field5841.method1760(-19907, arg7[var33 * 3]).field2273) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field3092 = new int[var30.field3094];
                }
                if (var32) {
                    var30.field3095 = new short[var30.field3094];
                    var30.field3096 = new short[var30.field3094];
                }
                for (int var34 = 0; var34 < var30.field3094; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field3092[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field1529.field5841.method1760(-19907, var40).field2273) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field1529.field5841.method1760(-19907, var41).field2273) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field1529.field5841.method1760(-19907, var42).field2273) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field3095[var34] = (short) var42;
                            var30.field3096[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field1529.field5841.method1760(-19907, var43).field2273) {
                                    var30.field3089[var35] = class300.field4317[class196.method1227((byte) 125, this.field1529.field5841.method1760(-19907, var43).field2295 & 65535) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field1529.field5841.method1760(-19907, var44).field2273) {
                                    var30.field3089[var36] = class300.field4317[class196.method1227((byte) -128, this.field1529.field5841.method1760(-19907, var44).field2295 & 65535) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field1529.field5841.method1760(-19907, var45).field2273) {
                                    var30.field3089[var37] = class300.field4317[class196.method1227((byte) -20, this.field1529.field5841.method1760(-19907, var45).field2295 & 65535) & 65535];
                                }
                            }
                            var30.field3095[var34] = -1;
                        }
                    }
                }
                this.field1542[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class50 var9 = this.field1529.method2537(Thread.currentThread());
        class254 var10 = var9.field704;
        var10.field3692 = 0;
        var10.field3693 = false;
        if (this.field1546 != null) {
            this.method796(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field712, var9.field728);
        } else {
            if (this.field1531 != null) {
                this.method794(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field712, var9.field728);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
    public final int method781(int arg0, int arg1) {
        return this.field1525[arg0][arg1];
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILgi;[I[I[I)V")
    private final void method782(int arg0, int arg1, class254 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class379 var7 = this.field1531[arg0][arg1];
        if (var7 != null) {
            if ((var7.field5702 & 2) == 0) {
                int var8 = this.field1530 * arg0;
                int var9 = this.field1530 + var8;
                int var10 = this.field1530 * arg1;
                int var11 = this.field1530 + var10;
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
                if ((var7.field5702 & 1) != 0) {
                    int var12 = this.field1525[arg0][arg1];
                    int var13 = this.field1539 * var12;
                    var14 = (this.field1526 * var10 + this.field1540 * var8 + var13 >> 15) + this.field1537;
                    if (var14 <= this.field1529.field5815) {
                        return;
                    }
                    var15 = (this.field1526 * var10 + this.field1540 * var9 + var13 >> 15) + this.field1537;
                    if (var15 <= this.field1529.field5815) {
                        return;
                    }
                    int var16 = (this.field1526 * var11 + this.field1540 * var9 + var13 >> 15) + this.field1537;
                    if (var16 <= this.field1529.field5815) {
                        return;
                    }
                    var17 = (this.field1526 * var11 + this.field1540 * var8 + var13 >> 15) + this.field1537;
                    if (var17 <= this.field1529.field5815) {
                        return;
                    }
                    int var18 = this.field1524 * var12;
                    int var19 = this.field1547 * var12;
                    var20 = (this.field1541 * var10 + this.field1528 * var8 + var18 >> 15) + this.field1532;
                    var21 = this.field1529.field5840 * var20 / var14 + arg2.field3695;
                    var22 = (this.field1538 * var10 + this.field1543 * var8 + var19 >> 15) + this.field1535;
                    var23 = this.field1529.field5808 * var22 / var14 + arg2.field3694;
                    var24 = (this.field1541 * var10 + this.field1528 * var9 + var18 >> 15) + this.field1532;
                    var25 = this.field1529.field5840 * var24 / var15 + arg2.field3695;
                    var26 = (this.field1538 * var10 + this.field1543 * var9 + var19 >> 15) + this.field1535;
                    var27 = this.field1529.field5808 * var26 / var15 + arg2.field3694;
                    int var28 = (this.field1541 * var11 + this.field1528 * var9 + var18 >> 15) + this.field1532;
                    var29 = this.field1529.field5840 * var28 / var16 + arg2.field3695;
                    int var30 = (this.field1538 * var11 + this.field1543 * var9 + var19 >> 15) + this.field1535;
                    var31 = this.field1529.field5808 * var30 / var16 + arg2.field3694;
                    var32 = (this.field1541 * var11 + this.field1528 * var8 + var18 >> 15) + this.field1532;
                    var33 = this.field1529.field5840 * var32 / var17 + arg2.field3695;
                    var34 = (this.field1538 * var11 + this.field1543 * var8 + var19 >> 15) + this.field1535;
                    var35 = this.field1529.field5808 * var34 / var17 + arg2.field3694;
                } else {
                    int var36 = this.field1525[arg0][arg1];
                    int var37 = this.field1525[arg0 + 1][arg1];
                    int var38 = this.field1525[arg0 + 1][arg1 + 1];
                    int var39 = this.field1525[arg0][arg1 + 1];
                    var14 = (this.field1526 * var10 + this.field1540 * var8 + this.field1539 * var36 >> 15) + this.field1537;
                    if (var14 <= this.field1529.field5815) {
                        return;
                    }
                    var15 = (this.field1526 * var10 + this.field1540 * var9 + this.field1539 * var37 >> 15) + this.field1537;
                    if (var15 <= this.field1529.field5815) {
                        return;
                    }
                    int var40 = (this.field1526 * var11 + this.field1540 * var9 + this.field1539 * var38 >> 15) + this.field1537;
                    if (var40 <= this.field1529.field5815) {
                        return;
                    }
                    var17 = (this.field1526 * var11 + this.field1540 * var8 + this.field1539 * var39 >> 15) + this.field1537;
                    if (var17 <= this.field1529.field5815) {
                        return;
                    }
                    var20 = (this.field1541 * var10 + this.field1528 * var8 + this.field1524 * var36 >> 15) + this.field1532;
                    var21 = this.field1529.field5840 * var20 / var14 + arg2.field3695;
                    var22 = (this.field1538 * var10 + this.field1547 * var36 + this.field1543 * var8 >> 15) + this.field1535;
                    var23 = this.field1529.field5808 * var22 / var14 + arg2.field3694;
                    var24 = (this.field1541 * var10 + this.field1528 * var9 + this.field1524 * var37 >> 15) + this.field1532;
                    var25 = this.field1529.field5840 * var24 / var15 + arg2.field3695;
                    var26 = (this.field1538 * var10 + this.field1547 * var37 + this.field1543 * var9 >> 15) + this.field1535;
                    var27 = this.field1529.field5808 * var26 / var15 + arg2.field3694;
                    int var41 = (this.field1541 * var11 + this.field1528 * var9 + this.field1524 * var38 >> 15) + this.field1532;
                    var29 = this.field1529.field5840 * var41 / var40 + arg2.field3695;
                    int var42 = (this.field1538 * var11 + this.field1547 * var38 + this.field1543 * var9 >> 15) + this.field1535;
                    var31 = this.field1529.field5808 * var42 / var40 + arg2.field3694;
                    var32 = (this.field1541 * var11 + this.field1528 * var8 + this.field1524 * var39 >> 15) + this.field1532;
                    var33 = this.field1529.field5840 * var32 / var17 + arg2.field3695;
                    var34 = (this.field1538 * var11 + this.field1547 * var39 + this.field1543 * var8 >> 15) + this.field1535;
                    var35 = this.field1529.field5808 * var34 / var17 + arg2.field3694;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field3693 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field3698 || var33 > arg2.field3698 || var25 > arg2.field3698;
                    if (var7.field5701 >= 0) {
                        if (this.method788(this.field1529.field5841.method1760(-19907, var7.field5701).field2293)) {
                            arg2.field3692 = 100;
                        }
                        arg2.method1591(var31, var35, var27, var29, var33, var25, var7.field5700 & 65535, var7.field5699 & 65535, var7.field5697 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5701);
                        arg2.field3692 = 0;
                    } else {
                        arg2.method1596(var31, var35, var27, var29, var33, var25, var7.field5700 & 65535, var7.field5699 & 65535, var7.field5697 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field3693 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field3698 || var25 > arg2.field3698 || var33 > arg2.field3698;
                    if (var7.field5701 >= 0) {
                        if (this.method788(this.field1529.field5841.method1760(-19907, var7.field5701).field2293)) {
                            arg2.field3692 = 100;
                        }
                        arg2.method1591(var23, var27, var35, var21, var25, var33, var7.field5696 & 65535, var7.field5697 & 65535, var7.field5699 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5701);
                        arg2.field3692 = 0;
                        return;
                    }
                    arg2.method1596(var23, var27, var35, var21, var25, var33, var7.field5696 & 65535, var7.field5697 & 65535, var7.field5699 & 65535);
                }
            }
        } else {
            class136 var43 = this.field1534[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field1798; ++var44) {
                    int var84 = var43.field1804[var44];
                    int var85 = var43.field1810[var44];
                    int var86 = var43.field1809[var44];
                    int var87 = (this.field1526 * var86 + this.field1540 * var84 + this.field1539 * var85 >> 15) + this.field1537;
                    if (var87 <= this.field1529.field5815) {
                        return;
                    }
                    int var88 = (this.field1541 * var86 + this.field1528 * var84 + this.field1524 * var85 >> 15) + this.field1532;
                    int var89 = (this.field1538 * var86 + this.field1547 * var85 + this.field1543 * var84 >> 15) + this.field1535;
                    arg3[var44] = this.field1529.field5840 * var88 / var87 + arg2.field3695;
                    arg4[var44] = this.field1529.field5808 * var89 / var87 + arg2.field3694;
                }
                if (var43.field1801 != null) {
                    int var45 = this.field1525[arg0][arg1];
                    int var46 = this.field1525[arg0 + 1][arg1];
                    int var47 = this.field1525[arg0][arg1 + 1];
                    int var48 = this.field1530 * arg0;
                    int var49 = this.field1530 + var48;
                    int var50 = this.field1530 * arg1;
                    int var51 = this.field1530 + var50;
                    int var52 = (this.field1541 * var50 + this.field1528 * var48 + this.field1524 * var45 >> 15) + this.field1532;
                    int var53 = (this.field1538 * var50 + this.field1547 * var45 + this.field1543 * var48 >> 15) + this.field1535;
                    int var54 = (this.field1526 * var50 + this.field1540 * var48 + this.field1539 * var45 >> 15) + this.field1537;
                    int var55 = (this.field1541 * var50 + this.field1528 * var49 + this.field1524 * var46 >> 15) + this.field1532;
                    int var56 = (this.field1538 * var50 + this.field1547 * var46 + this.field1543 * var49 >> 15) + this.field1535;
                    int var57 = (this.field1526 * var50 + this.field1540 * var49 + this.field1539 * var46 >> 15) + this.field1537;
                    int var58 = (this.field1541 * var51 + this.field1528 * var48 + this.field1524 * var47 >> 15) + this.field1532;
                    int var59 = (this.field1538 * var51 + this.field1547 * var47 + this.field1543 * var48 >> 15) + this.field1535;
                    int var60 = (this.field1526 * var51 + this.field1540 * var48 + this.field1539 * var47 >> 15) + this.field1537;
                    for (int var61 = 0; var61 < var43.field1802; ++var61) {
                        short var62 = var43.field1800[var61];
                        short var63 = var43.field1805[var61];
                        short var64 = var43.field1806[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field3693 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field3698 || var66 > arg2.field3698 || var67 > arg2.field3698;
                            short var71 = var43.field1801[var61];
                            if (var71 != -1) {
                                if (this.method788(this.field1529.field5841.method1760(-19907, var71).field2293)) {
                                    arg2.field3692 = 100;
                                }
                                arg2.method1591(var68, var69, var70, var65, var66, var67, var43.field1807[var62], var43.field1807[var63], var43.field1807[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field3692 = 0;
                            } else {
                                int var72 = var43.field1808[var61];
                                if (var72 != -1) {
                                    arg2.method1596(var68, var69, var70, var65, var66, var67, class227.method1409(var43.field1807[var62], (byte) -33, var72), class227.method1409(var43.field1807[var63], (byte) -33, var72), class227.method1409(var43.field1807[var64], (byte) -33, var72));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field1802; ++var73) {
                    short var74 = var43.field1800[var73];
                    short var75 = var43.field1805[var73];
                    short var76 = var43.field1806[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field1808[var73];
                        if (var83 != -1) {
                            arg2.field3693 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field3698 || var78 > arg2.field3698 || var79 > arg2.field3698;
                            arg2.method1596(var80, var81, var82, var77, var78, var79, class227.method1409(var43.field1807[var74], (byte) -33, var83), class227.method1409(var43.field1807[var75], (byte) -33, var83), class227.method1409(var43.field1807[var76], (byte) -33, var83));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Loc;IIIIZ)V")
    public final void method783(class93 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILoc;)Loc;")
    public final class93 method784(int arg0, int arg1, class93 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
    public final void method785() {
        this.field1544 = null;
        this.field1533 = null;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)V")
    public final void method786(int arg0, int arg1) {
        class50 var3 = this.field1529.method2537(Thread.currentThread());
        var3.field704.field3692 = 0;
        if (this.field1546 != null) {
            this.method789(arg0, arg1, this.field1529.field5828, var3.field704, var3.field712, var3.field728, var3.field740);
        } else {
            if (this.field1531 != null) {
                this.method782(arg0, arg1, var3.field704, var3.field712, var3.field728, var3.field740);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(Loc;IIIIZ)V")
    public final void method787(class93 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)Z")
    private final boolean method788(int arg0) {
        if ((this.field1536 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIZLgi;[I[I[I)V")
    private final void method789(int arg0, int arg1, boolean arg2, class254 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class412 var8 = this.field1546[arg0][arg1];
        if (var8 != null) {
            if ((var8.field6162 & 2) == 0) {
                int var9 = this.field1530 * arg0;
                int var10 = this.field1530 + var9;
                int var11 = this.field1530 * arg1;
                int var12 = this.field1530 + var11;
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
                if ((var8.field6162 & 1) != 0 && !arg2) {
                    int var17 = this.field1525[arg0][arg1];
                    int var18 = this.field1539 * var17;
                    var19 = (this.field1526 * var11 + this.field1540 * var9 + var18 >> 15) + this.field1537;
                    if (var19 <= this.field1529.field5815) {
                        return;
                    }
                    var20 = (this.field1526 * var11 + this.field1540 * var10 + var18 >> 15) + this.field1537;
                    if (var20 <= this.field1529.field5815) {
                        return;
                    }
                    var21 = (this.field1526 * var12 + this.field1540 * var10 + var18 >> 15) + this.field1537;
                    if (var21 <= this.field1529.field5815) {
                        return;
                    }
                    var22 = (this.field1526 * var12 + this.field1540 * var9 + var18 >> 15) + this.field1537;
                    if (var22 <= this.field1529.field5815) {
                        return;
                    }
                    if (this.field1529.field5818) {
                        int var23 = var19 - this.field1529.field5820;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1529.field5820;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1529.field5820;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1529.field5820;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1524 * var17;
                    int var28 = this.field1547 * var17;
                    var29 = (this.field1541 * var11 + this.field1528 * var9 + var27 >> 15) + this.field1532;
                    var30 = this.field1529.field5840 * var29 / var19 + arg3.field3695;
                    var31 = (this.field1538 * var11 + this.field1543 * var9 + var28 >> 15) + this.field1535;
                    var32 = this.field1529.field5808 * var31 / var19 + arg3.field3694;
                    var33 = (this.field1541 * var11 + this.field1528 * var10 + var27 >> 15) + this.field1532;
                    var34 = this.field1529.field5840 * var33 / var20 + arg3.field3695;
                    var35 = (this.field1538 * var11 + this.field1543 * var10 + var28 >> 15) + this.field1535;
                    var36 = this.field1529.field5808 * var35 / var20 + arg3.field3694;
                    var37 = (this.field1541 * var12 + this.field1528 * var10 + var27 >> 15) + this.field1532;
                    var38 = this.field1529.field5840 * var37 / var21 + arg3.field3695;
                    var39 = (this.field1538 * var12 + this.field1543 * var10 + var28 >> 15) + this.field1535;
                    var40 = this.field1529.field5808 * var39 / var21 + arg3.field3694;
                    var41 = (this.field1541 * var12 + this.field1528 * var9 + var27 >> 15) + this.field1532;
                    var42 = this.field1529.field5840 * var41 / var22 + arg3.field3695;
                    var43 = (this.field1538 * var12 + this.field1543 * var9 + var28 >> 15) + this.field1535;
                    var44 = this.field1529.field5808 * var43 / var22 + arg3.field3694;
                } else {
                    int var45 = this.field1525[arg0][arg1];
                    int var46 = this.field1525[arg0 + 1][arg1];
                    int var47 = this.field1525[arg0 + 1][arg1 + 1];
                    int var48 = this.field1525[arg0][arg1 + 1];
                    var19 = (this.field1526 * var11 + this.field1540 * var9 + this.field1539 * var45 >> 15) + this.field1537;
                    if (var19 <= this.field1529.field5815) {
                        return;
                    }
                    var20 = (this.field1526 * var11 + this.field1540 * var10 + this.field1539 * var46 >> 15) + this.field1537;
                    if (var20 <= this.field1529.field5815) {
                        return;
                    }
                    var21 = (this.field1526 * var12 + this.field1540 * var10 + this.field1539 * var47 >> 15) + this.field1537;
                    if (var21 <= this.field1529.field5815) {
                        return;
                    }
                    var22 = (this.field1526 * var12 + this.field1540 * var9 + this.field1539 * var48 >> 15) + this.field1537;
                    if (var22 <= this.field1529.field5815) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1529.field5820;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field1527[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1529.field5820;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field1527[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1529.field5820;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field1527[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1529.field5820;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field1527[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1529.field5818) {
                        int var57 = var19 - this.field1529.field5820;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1529.field5820;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1529.field5820;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1529.field5820;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1541 * var11 + this.field1528 * var9 + this.field1524 * var45 >> 15) + this.field1532;
                    var30 = this.field1529.field5840 * var29 / var19 + arg3.field3695;
                    var31 = (this.field1538 * var11 + this.field1547 * var45 + this.field1543 * var9 >> 15) + this.field1535;
                    var32 = this.field1529.field5808 * var31 / var19 + arg3.field3694;
                    var33 = (this.field1541 * var11 + this.field1528 * var10 + this.field1524 * var46 >> 15) + this.field1532;
                    var34 = this.field1529.field5840 * var33 / var20 + arg3.field3695;
                    var35 = (this.field1538 * var11 + this.field1547 * var46 + this.field1543 * var10 >> 15) + this.field1535;
                    var36 = this.field1529.field5808 * var35 / var20 + arg3.field3694;
                    var37 = (this.field1541 * var12 + this.field1528 * var10 + this.field1524 * var47 >> 15) + this.field1532;
                    var38 = this.field1529.field5840 * var37 / var21 + arg3.field3695;
                    var39 = (this.field1538 * var12 + this.field1547 * var47 + this.field1543 * var10 >> 15) + this.field1535;
                    var40 = this.field1529.field5808 * var39 / var21 + arg3.field3694;
                    var41 = (this.field1541 * var12 + this.field1528 * var9 + this.field1524 * var48 >> 15) + this.field1532;
                    var42 = this.field1529.field5840 * var41 / var22 + arg3.field3695;
                    var43 = (this.field1538 * var12 + this.field1547 * var48 + this.field1543 * var9 >> 15) + this.field1535;
                    var44 = this.field1529.field5808 * var43 / var22 + arg3.field3694;
                }
                boolean var61 = var8.field6159 != -1 && this.method788(this.field1529.field5841.method1760(-19907, var8.field6159).field2293);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field3693 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field3698 || var42 > arg3.field3698 || var34 > arg3.field3698;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field3692 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field6159 >= 0) {
                                arg3.method1588(var40, var44, var36, var38, var42, var34, this.field1529.field5817, var15, var16, var14, var8.field6160, var8.field6161, var8.field6158, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6159);
                            } else {
                                arg3.method1597(var40, var44, var36, var38, var42, var34, class407.method2644(var8.field6160, var15 << 24 | this.field1529.field5817, (byte) 58), class407.method2644(var8.field6161, var16 << 24 | this.field1529.field5817, (byte) 58), class407.method2644(var8.field6158, var14 << 24 | this.field1529.field5817, (byte) 58));
                            }
                        } else if (var8.field6159 >= 0) {
                            arg3.method1591(var40, var44, var36, var38, var42, var34, var8.field6160, var8.field6161, var8.field6158, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6159);
                        } else {
                            arg3.method1597(var40, var44, var36, var38, var42, var34, var8.field6160, var8.field6161, var8.field6158);
                        }
                        arg3.field3692 = 0;
                    } else {
                        arg3.method1590(var40, var44, var36, var38, var42, var34, this.field1529.field5817);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field3693 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field3698 || var34 > arg3.field3698 || var42 > arg3.field3698;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field3692 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field6159 >= 0) {
                                arg3.method1588(var32, var36, var44, var30, var34, var42, this.field1529.field5817, var13, var14, var16, var8.field6163, var8.field6158, var8.field6161, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6159);
                            } else {
                                arg3.method1597(var32, var36, var44, var30, var34, var42, class407.method2644(var8.field6163, var13 << 24 | this.field1529.field5817, (byte) 58), class407.method2644(var8.field6158, var14 << 24 | this.field1529.field5817, (byte) 58), class407.method2644(var8.field6161, var16 << 24 | this.field1529.field5817, (byte) 58));
                            }
                        } else if (var8.field6159 >= 0) {
                            arg3.method1591(var32, var36, var44, var30, var34, var42, var8.field6163, var8.field6158, var8.field6161, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6159);
                        } else {
                            arg3.method1597(var32, var36, var44, var30, var34, var42, var8.field6163, var8.field6158, var8.field6161);
                        }
                        arg3.field3692 = 0;
                        return;
                    }
                    arg3.method1590(var32, var36, var44, var30, var34, var42, this.field1529.field5817);
                }
            }
        } else {
            class216 var64 = this.field1542[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field3091; ++var65) {
                    short var105 = var64.field3097[var65];
                    int var106 = var64.field3093[var65];
                    short var107 = var64.field3090[var65];
                    int var108 = (this.field1526 * var107 + this.field1540 * var105 + this.field1539 * var106 >> 15) + this.field1537;
                    if (var108 <= this.field1529.field5815) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field1529.field5820;
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
                    } else if (this.field1529.field5818) {
                        int var111 = var108 - this.field1529.field5820;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field1541 * var107 + this.field1528 * var105 + this.field1524 * var106 >> 15) + this.field1532;
                    int var113 = (this.field1538 * var107 + this.field1547 * var106 + this.field1543 * var105 >> 15) + this.field1535;
                    arg4[var65] = this.field1529.field5840 * var112 / var108 + arg3.field3695;
                    arg5[var65] = this.field1529.field5808 * var113 / var108 + arg3.field3694;
                }
                if (var64.field3095 != null) {
                    int var66 = this.field1525[arg0][arg1];
                    int var67 = this.field1525[arg0 + 1][arg1];
                    int var68 = this.field1525[arg0][arg1 + 1];
                    int var69 = this.field1530 * arg0;
                    int var70 = this.field1530 + var69;
                    int var71 = this.field1530 * arg1;
                    int var72 = this.field1530 + var71;
                    int var73 = (this.field1541 * var71 + this.field1528 * var69 + this.field1524 * var66 >> 15) + this.field1532;
                    int var74 = (this.field1538 * var71 + this.field1547 * var66 + this.field1543 * var69 >> 15) + this.field1535;
                    int var75 = (this.field1526 * var71 + this.field1540 * var69 + this.field1539 * var66 >> 15) + this.field1537;
                    int var76 = (this.field1541 * var71 + this.field1528 * var70 + this.field1524 * var67 >> 15) + this.field1532;
                    int var77 = (this.field1538 * var71 + this.field1547 * var67 + this.field1543 * var70 >> 15) + this.field1535;
                    int var78 = (this.field1526 * var71 + this.field1540 * var70 + this.field1539 * var67 >> 15) + this.field1537;
                    int var79 = (this.field1541 * var72 + this.field1528 * var69 + this.field1524 * var68 >> 15) + this.field1532;
                    int var80 = (this.field1538 * var72 + this.field1547 * var68 + this.field1543 * var69 >> 15) + this.field1535;
                    int var81 = (this.field1526 * var72 + this.field1540 * var69 + this.field1539 * var68 >> 15) + this.field1537;
                    for (int var82 = 0; var82 < var64.field3094; ++var82) {
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
                            arg3.field3693 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field3698 || var87 > arg3.field3698 || var88 > arg3.field3698;
                            short var93 = var64.field3095[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method788(this.field1529.field5841.method1760(-19907, var93).field2293)) {
                                    arg3.field3692 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method1588(var89, var90, var91, var86, var87, var88, this.field1529.field5817, arg6[var83], arg6[var84], arg6[var85], var64.field3089[var83], var64.field3089[var84], var64.field3089[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field3089[var83] & 16777215) != 0) {
                                        arg3.method1597(var89, var90, var91, var86, var87, var88, class407.method2644(var64.field3089[var83], arg6[var83] << 24 | this.field1529.field5817, (byte) 58), class407.method2644(var64.field3089[var84], arg6[var84] << 24 | this.field1529.field5817, (byte) 58), class407.method2644(var64.field3089[var85], arg6[var85] << 24 | this.field1529.field5817, (byte) 58));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method1591(var89, var90, var91, var86, var87, var88, var64.field3089[var83], var64.field3089[var84], var64.field3089[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field3089[var83] & 16777215) != 0) {
                                    arg3.method1597(var89, var90, var91, var86, var87, var88, var64.field3089[var83], var64.field3089[var84], var64.field3089[var85]);
                                }
                                arg3.field3692 = 0;
                            } else {
                                arg3.method1590(var89, var90, var91, var86, var87, var88, this.field1529.field5817);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field3094; ++var94) {
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
                        arg3.field3693 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field3698 || var99 > arg3.field3698 || var100 > arg3.field3698;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field3089[var95] & 16777215) != 0) {
                                    arg3.method1597(var101, var102, var103, var98, var99, var100, class339.method2242(-16711936, arg6[var95], var64.field3089[var95], this.field1529.field5817), class339.method2242(-16711936, arg6[var96], var64.field3089[var96], this.field1529.field5817), class339.method2242(-16711936, arg6[var97], var64.field3089[var97], this.field1529.field5817));
                                }
                            } else if ((var64.field3089[var95] & 16777215) != 0) {
                                arg3.method1597(var101, var102, var103, var98, var99, var100, var64.field3089[var95], var64.field3089[var96], var64.field3089[var97]);
                            }
                        } else {
                            arg3.method1590(var101, var102, var103, var98, var99, var100, this.field1529.field5817);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[[ZZ)V")
    public final void method790(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class131 var6 = this.field1529.field5830;
        this.field1528 = var6.field1753;
        this.field1524 = var6.field1751;
        this.field1541 = var6.field1754;
        this.field1532 = var6.field1762;
        this.field1543 = var6.field1761;
        this.field1547 = var6.field1752;
        this.field1538 = var6.field1758;
        this.field1535 = var6.field1760;
        this.field1540 = var6.field1759;
        this.field1539 = var6.field1757;
        this.field1526 = var6.field1756;
        this.field1537 = var6.field1755;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
    public final void method791(int arg0, int arg1, int arg2) {
        if (this.field1533[arg0][arg1] < arg2) {
            this.field1533[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(II)I")
    private static final int method792(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method793(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field1531 == null) {
            this.field1531 = new class379[super.field4978][super.field4970];
            this.field1534 = new class136[super.field4978][super.field4970];
        } else if (this.field1546 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field1530 != var18 || var19 != 0 && this.field1530 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class136 var20 = new class136();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field1798 = var21;
            var20.field1807 = new short[var21];
            var20.field1804 = new int[var21];
            var20.field1810 = new int[var21];
            var20.field1809 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field1807[var23] = (short) (this.field1544[arg0][arg1] - this.field1533[arg0][arg1]);
                } else if (var28 == 0 && this.field1530 == var29) {
                    var20.field1807[var23] = (short) (this.field1544[arg0][arg1 + 1] - this.field1533[arg0][arg1 + 1]);
                } else if (this.field1530 == var28 && this.field1530 == var29) {
                    var20.field1807[var23] = (short) (this.field1544[arg0 + 1][arg1 + 1] - this.field1533[arg0 + 1][arg1 + 1]);
                } else if (this.field1530 == var28 && var29 == 0) {
                    var20.field1807[var23] = (short) (this.field1544[arg0 + 1][arg1] - this.field1533[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field1544[arg0 + 1][arg1] - this.field1533[arg0 + 1][arg1]) * var28 + (this.field1544[arg0][arg1] - this.field1533[arg0][arg1]) * (this.field1530 - var28);
                    int var31 = (this.field1544[arg0 + 1][arg1 + 1] - this.field1533[arg0 + 1][arg1 + 1]) * var28 + (this.field1544[arg0][arg1 + 1] - this.field1533[arg0][arg1 + 1]) * (this.field1530 - var28);
                    var20.field1807[var23] = (short) ((this.field1530 - var29) * var30 + var29 * var31 >> this.field1545 * 2);
                }
                int var32 = (arg0 << this.field1545) + var28;
                int var33 = (arg1 << this.field1545) + var29;
                var20.field1804[var23] = var32;
                var20.field1809[var23] = var33;
                var20.field1810[var23] = this.method797(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field1807[var23] < 2) {
                    var20.field1807[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field1529.field5841.method1760(-19907, arg10[var26]).field2273) {
                    var24 = true;
                }
            }
            var20.field1808 = new int[var25];
            if (arg9 != null) {
                var20.field1799 = new int[var25];
            }
            var20.field1800 = new short[var25];
            var20.field1805 = new short[var25];
            var20.field1806 = new short[var25];
            if (var24) {
                var20.field1801 = new short[var25];
                var20.field1803 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field1808[var20.field1802] = class196.method1227((byte) 67, arg8[var27]);
                    } else {
                        var20.field1808[var20.field1802] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field1799[var20.field1802] = class196.method1227((byte) -127, arg9[var27]);
                        } else {
                            var20.field1799[var20.field1802] = -1;
                        }
                    }
                    var20.field1800[var20.field1802] = (short) arg5[var27];
                    var20.field1805[var20.field1802] = (short) arg6[var27];
                    var20.field1806[var20.field1802] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field1529.field5841.method1760(-19907, arg10[var27]).field2273) {
                            var20.field1801[var20.field1802] = (short) arg10[var27];
                            var20.field1803[var20.field1802] = (short) arg11[var27];
                        } else {
                            var20.field1801[var20.field1802] = -1;
                        }
                    }
                    ++var20.field1802;
                }
            }
            this.field1534[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class379 var34 = new class379();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field5698 = class227.method1409(this.field1544[arg0][arg1] - this.field1533[arg0][arg1], (byte) -33, class196.method1227((byte) -14, arg9[0]));
                    if (var35 == -1) {
                        var34.field5702 = (byte) (var34.field5702 | 2);
                    }
                }
                if (this.field1525[arg0 + 1][arg1] == this.field1525[arg0][arg1] && this.field1525[arg0 + 1][arg1 + 1] == this.field1525[arg0][arg1] && this.field1525[arg0][arg1 + 1] == this.field1525[arg0][arg1]) {
                    var34.field5702 = (byte) (var34.field5702 | 1);
                }
                if (var36 != -1 && (var34.field5702 & 2) == 0 && !this.field1529.field5841.method1760(-19907, var36).field2273) {
                    var34.field5696 = (short) (this.field1544[arg0][arg1] - this.field1533[arg0][arg1]);
                    var34.field5697 = (short) (this.field1544[arg0 + 1][arg1] - this.field1533[arg0 + 1][arg1]);
                    var34.field5700 = (short) (this.field1544[arg0 + 1][arg1 + 1] - this.field1533[arg0 + 1][arg1 + 1]);
                    var34.field5699 = (short) (this.field1544[arg0][arg1 + 1] - this.field1533[arg0][arg1 + 1]);
                    var34.field5701 = (short) var36;
                } else {
                    short var37 = class196.method1227((byte) -127, var35);
                    var34.field5696 = (short) class227.method1409(this.field1544[arg0][arg1] - this.field1533[arg0][arg1], (byte) -33, var37);
                    var34.field5697 = (short) class227.method1409(this.field1544[arg0 + 1][arg1] - this.field1533[arg0 + 1][arg1], (byte) -33, var37);
                    var34.field5700 = (short) class227.method1409(this.field1544[arg0 + 1][arg1 + 1] - this.field1533[arg0 + 1][arg1 + 1], (byte) -33, var37);
                    var34.field5699 = (short) class227.method1409(this.field1544[arg0][arg1 + 1] - this.field1533[arg0][arg1 + 1], (byte) -33, var37);
                    var34.field5701 = -1;
                }
                this.field1531[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII[[ZLgi;[I[I)V")
    private final void method794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class254 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3696 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1531[var16][var17] != null) {
                        class379 var18 = this.field1531[var16][var17];
                        if (var18.field5701 != -1 && (var18.field5702 & 2) == 0 && var18.field5698 == -1) {
                            int var19 = this.field1529.method2541(var18.field5701);
                            arg8.method1596(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class227.method1409(var18.field5700 & 65535, (byte) -33, var19), class227.method1409(var18.field5699 & 65535, (byte) -33, var19), class227.method1409(var18.field5697 & 65535, (byte) -33, var19));
                            arg8.method1596(var15, var15, var15 - var13, var14, var13 + var14, var14, class227.method1409(var18.field5696 & 65535, (byte) -33, var19), class227.method1409(var18.field5697 & 65535, (byte) -33, var19), class227.method1409(var18.field5699 & 65535, (byte) -33, var19));
                        } else if (var18.field5698 == -1) {
                            arg8.method1596(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5700 & 65535, var18.field5699 & 65535, var18.field5697 & 65535);
                            arg8.method1596(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5696 & 65535, var18.field5697 & 65535, var18.field5699 & 65535);
                        } else {
                            int var20 = var18.field5698;
                            arg8.method1596(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1596(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1534[var16][var17] != null) {
                        class136 var21 = this.field1534[var16][var17];
                        for (int var22 = 0; var22 < var21.field1798; ++var22) {
                            arg9[var22] = (var21.field1804[var22] - this.field1530 * var16) * var13 / this.field1530 + var14;
                            arg10[var22] = var15 - (var21.field1809[var22] - this.field1530 * var17) * var13 / this.field1530;
                        }
                        for (int var23 = 0; var23 < var21.field1802; ++var23) {
                            short var24 = var21.field1800[var23];
                            short var25 = var21.field1805[var23];
                            short var26 = var21.field1806[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1799 != null && var21.field1799[var23] != -1) {
                                int var33 = var21.field1799[var23];
                                arg8.method1596(var30, var31, var32, var27, var28, var29, class227.method1409(var21.field1807[var24], (byte) -33, var33), class227.method1409(var21.field1807[var25], (byte) -33, var33), class227.method1409(var21.field1807[var26], (byte) -33, var33));
                            } else if (var21.field1801 != null && var21.field1801[var23] != -1) {
                                int var34 = this.field1529.method2541(var21.field1801[var23]);
                                arg8.method1596(var30, var31, var32, var27, var28, var29, class227.method1409(var21.field1807[var24], (byte) -33, var34), class227.method1409(var21.field1807[var25], (byte) -33, var34), class227.method1409(var21.field1807[var26], (byte) -33, var34));
                            } else {
                                int var35 = var21.field1808[var23];
                                arg8.method1596(var30, var31, var32, var27, var28, var29, class227.method1409(var21.field1807[var24], (byte) -33, var35), class227.method1409(var21.field1807[var25], (byte) -33, var35), class227.method1409(var21.field1807[var26], (byte) -33, var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3696 = true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lfe;[I)V")
    public final void method795(class403 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lcs;IIII[[I[[II)V")
    public class113(class389 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1529 = arg0;
        this.field1536 = arg2;
        this.field1525 = arg5;
        this.field1527 = arg6;
        this.field1530 = arg7;
        this.field1545 = 0;
        while (arg7 > 1) {
            ++this.field1545;
            arg7 >>= 1;
        }
        this.field1544 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1529.field5823 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field1525[var11 + 1][var10] - this.field1525[var11 - 1][var10];
                int var14 = this.field1525[var11][var10 + 1] - this.field1525[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1529.field5819 * var18 + this.field1529.field5842 * var17 + this.field1529.field5824 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1544[var11][var10] = (byte) var20;
            }
        }
        this.field1533 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIIIIII[[ZLgi;[I[I)V")
    private final void method796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class254 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3696 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1546[var16][var17] != null) {
                        class412 var18 = this.field1546[var16][var17];
                        if (var18.field6159 != -1 && (var18.field6162 & 2) == 0 && var18.field6157 == 0) {
                            int var19 = this.field1529.method2541(var18.field6159);
                            arg8.method1596(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class227.method1409(var18.field6160, (byte) -33, var19), class227.method1409(var18.field6161, (byte) -33, var19), class227.method1409(var18.field6158, (byte) -33, var19));
                            arg8.method1596(var15, var15, var15 - var13, var14, var13 + var14, var14, class227.method1409(var18.field6163, (byte) -33, var19), class227.method1409(var18.field6158, (byte) -33, var19), class227.method1409(var18.field6161, (byte) -33, var19));
                        } else if (var18.field6157 == 0) {
                            arg8.method1597(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6160, var18.field6161, var18.field6158);
                            arg8.method1597(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6163, var18.field6158, var18.field6161);
                        } else {
                            int var20 = var18.field6157;
                            arg8.method1597(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class407.method2644(var20, var18.field6160 & -16777216, (byte) 58), class407.method2644(var20, var18.field6161 & -16777216, (byte) 58), class407.method2644(var20, var18.field6158 & -16777216, (byte) 58));
                            arg8.method1597(var15, var15, var15 - var13, var14, var13 + var14, var14, class407.method2644(var20, var18.field6163 & -16777216, (byte) 58), class407.method2644(var20, var18.field6158 & -16777216, (byte) 58), class407.method2644(var20, var18.field6161 & -16777216, (byte) 58));
                        }
                    } else if (this.field1542[var16][var17] != null) {
                        class216 var21 = this.field1542[var16][var17];
                        for (int var22 = 0; var22 < var21.field3091; ++var22) {
                            arg9[var22] = (var21.field3097[var22] - this.field1530 * var16) * var13 / this.field1530 + var14;
                            arg10[var22] = var15 - (var21.field3090[var22] - this.field1530 * var17) * var13 / this.field1530;
                        }
                        for (int var23 = 0; var23 < var21.field3094; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3092 != null && var21.field3092[var23] != 0 && (var21.field3095 == null || var21.field3095 != null && var21.field3095[var23] == -1)) {
                                int var33 = var21.field3092[var23];
                                arg8.method1597(var30, var31, var32, var27, var28, var29, class407.method2644(var33, -16777216 - (var21.field3089[var24] & -16777216), (byte) 58), class407.method2644(var33, -16777216 - (var21.field3089[var25] & -16777216), (byte) 58), class407.method2644(var33, -16777216 - (var21.field3089[var26] & -16777216), (byte) 58));
                            } else if (var21.field3095 != null && var21.field3095[var23] != -1) {
                                int var34 = this.field1529.method2541(var21.field3095[var23]);
                                arg8.method1596(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1597(var30, var31, var32, var27, var28, var29, var21.field3089[var24], var21.field3089[var25], var21.field3089[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3696 = true;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)I")
    public final int method797(int arg0, int arg1) {
        int var3 = arg0 >> this.field1545;
        int var4 = arg1 >> this.field1545;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field4978 - 1 && var4 <= super.field4970 - 1) {
            int var5 = arg0 & this.field1530 - 1;
            int var6 = arg1 & this.field1530 - 1;
            int var7 = (this.field1530 - var5) * this.field1525[var3][var4] + this.field1525[var3 + 1][var4] * var5 >> this.field1545;
            int var8 = (this.field1530 - var5) * this.field1525[var3][var4 + 1] + this.field1525[var3 + 1][var4 + 1] * var5 >> this.field1545;
            return (this.field1530 - var6) * var7 + var6 * var8 >> this.field1545;
        } else {
            return 0;
        }
    }
}
