import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class647 extends class37 {

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    private int field9329 = -1;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Ldda;")
    private class351 field9312;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    private int field9314;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[[B")
    private byte[][] field9315;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[[B")
    private byte[][] field9319;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "F")
    private float field9313;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "F")
    private float field9316;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "F")
    private float field9318;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "F")
    private float field9320;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "F")
    private float field9321;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "F")
    private float field9322;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "F")
    private float field9323;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "F")
    private float field9324;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "F")
    private float field9325;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "F")
    private float field9326;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "F")
    private float field9330;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "F")
    private float field9331;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[[Lqo;")
    private class21[][] field9327;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[[Lni;")
    private class484[][] field9328;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[[Lkq;")
    private class551[][] field9332;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "[[Lke;")
    private class556[][] field9317;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[[ZZ)V")
    public final void method540(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class141 var6 = this.field9312.field5297;
        this.field9329 = -1;
        this.field9322 = var6.field2497;
        this.field9326 = var6.field2485;
        this.field9313 = var6.field2495;
        this.field9324 = var6.field2482;
        this.field9325 = var6.field2476;
        this.field9318 = var6.field2498;
        this.field9320 = var6.field2473;
        this.field9323 = var6.field2496;
        this.field9321 = var6.field2472;
        this.field9330 = var6.field2501;
        this.field9316 = var6.field2471;
        this.field9331 = var6.field2480;
        for (int var7 = 0; var7 < arg2 + arg2; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - arg2 + var7;
                    int var10 = arg1 - arg2 + var8;
                    if (var9 >= 0 && var9 < super.field1041 && var10 >= 0 && var10 < super.field1043) {
                        this.method545(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "(IILha;)Lha;")
    public final class54 method550(int arg0, int arg1, class54 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    private static final int method3690(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method542(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field9327 == null) {
            this.field9327 = new class21[super.field1041][super.field1043];
            this.field9332 = new class551[super.field1041][super.field1043];
        } else if (this.field9317 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class410.field5946[class414.method2528((byte) -109, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class410.field5946[class414.method2528((byte) 110, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field1040 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field1040 && arg4[var22] == super.field1040) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field1040) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field1040 != arg2[var24] && arg2[0] - super.field1040 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field1040 != arg4[var24] && arg4[0] - super.field1040 != arg4[var24]) {
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
                class21 var25 = new class21();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field856 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field853 = (byte) (var25.field853 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (super.field1042[arg0 + 1][arg1] == super.field1042[arg0][arg1] && super.field1042[arg0 + 1][arg1 + 1] == super.field1042[arg0][arg1] && super.field1042[arg0][arg1 + 1] == super.field1042[arg0][arg1]) {
                    var25.field853 = (byte) (var25.field853 | 1);
                }
                if (var27 != -1 && (var25.field853 & 2) == 0 && !this.field9312.field2768.method1500(var27, -101).field9844) {
                    var25.field851 = this.field9315[arg0][arg1] - this.field9319[arg0][arg1];
                    var25.field848 = this.field9315[arg0 + 1][arg1] - this.field9319[arg0 + 1][arg1];
                    var25.field849 = this.field9315[arg0 + 1][arg1 + 1] - this.field9319[arg0 + 1][arg1 + 1];
                    var25.field850 = this.field9315[arg0][arg1 + 1] - this.field9319[arg0][arg1 + 1];
                    var25.field852 = (short) var27;
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
                    var25.field851 = class263.method1725(arg10, (byte) 3, var28, method3690(arg6[var18] >> 8, this.field9315[arg0][arg1] - this.field9319[arg0][arg1]));
                    if (var25.field856 != 0) {
                        var25.field851 |= 255 - (this.field9315[arg0][arg1] - this.field9319[arg0][arg1]) << 25;
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
                    var25.field848 = class263.method1725(arg10, (byte) 3, var29, method3690(arg6[var19] >> 8, this.field9315[arg0 + 1][arg1] - this.field9319[arg0 + 1][arg1]));
                    if (var25.field856 != 0) {
                        var25.field848 |= 255 - (this.field9315[arg0 + 1][arg1] - this.field9319[arg0 + 1][arg1]) << 25;
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
                    var25.field849 = class263.method1725(arg10, (byte) 3, var30, method3690(arg6[var20] >> 8, this.field9315[arg0 + 1][arg1 + 1] - this.field9319[arg0 + 1][arg1 + 1]));
                    if (var25.field856 != 0) {
                        var25.field849 |= 255 - (this.field9315[arg0 + 1][arg1 + 1] - this.field9319[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field850 = class263.method1725(arg10, (byte) 3, var31, method3690(arg6[var21] >> 8, this.field9315[arg0][arg1 + 1] - this.field9319[arg0][arg1 + 1]));
                    if (var25.field856 != 0) {
                        var25.field850 |= 255 - (this.field9315[arg0][arg1 + 1] - this.field9319[arg0][arg1 + 1]) << 25;
                    }
                    var25.field852 = -1;
                }
                if (arg5 != null) {
                    var25.field855 = (short) arg5[var20];
                    var25.field854 = (short) arg5[var21];
                    var25.field858 = (short) arg5[var19];
                    var25.field857 = (short) arg5[var18];
                }
                this.field9327[arg0][arg1] = var25;
            } else {
                class551 var32 = new class551();
                var32.field7813 = (short) arg2.length;
                var32.field7809 = (short) (arg2.length / 3);
                var32.field7805 = new short[var32.field7813];
                var32.field7812 = new short[var32.field7813];
                var32.field7804 = new short[var32.field7813];
                var32.field7810 = new int[var32.field7813];
                if (arg5 != null) {
                    var32.field7811 = new short[var32.field7813];
                }
                for (int var33 = 0; var33 < var32.field7813; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field9315[arg0][arg1] - this.field9319[arg0][arg1];
                    } else if (var48 == 0 && super.field1040 == var49) {
                        var51 = this.field9315[arg0][arg1 + 1] - this.field9319[arg0][arg1 + 1];
                    } else if (super.field1040 == var48 && super.field1040 == var49) {
                        var51 = this.field9315[arg0 + 1][arg1 + 1] - this.field9319[arg0 + 1][arg1 + 1];
                    } else if (super.field1040 == var48 && var49 == 0) {
                        var51 = this.field9315[arg0 + 1][arg1] - this.field9319[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field9315[arg0 + 1][arg1] - this.field9319[arg0 + 1][arg1]) * var48 + (this.field9315[arg0][arg1] - this.field9319[arg0][arg1]) * (super.field1040 - var48);
                        int var53 = (this.field9315[arg0 + 1][arg1 + 1] - this.field9319[arg0 + 1][arg1 + 1]) * var48 + (this.field9315[arg0][arg1 + 1] - this.field9319[arg0][arg1 + 1]) * (super.field1040 - var48);
                        var51 = (super.field1040 - var49) * var52 + var49 * var53 >> super.field1038 * 2;
                    }
                    int var54 = (arg0 << super.field1038) + var48;
                    int var55 = (arg1 << super.field1038) + var49;
                    var32.field7805[var33] = (short) var48;
                    var32.field7804[var33] = (short) var49;
                    var32.field7812[var33] = (short) (this.method552(1, var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field9312.field2768.method1500(arg8[var33], -68).field9844) {
                        var32.field7810[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field7810[var33] = var51 << 25;
                        } else {
                            var32.field7810[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field7811[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field7810[var33] = class263.method1725(arg10, (byte) 3, var56, method3690(arg6[var33] >> 8, var51));
                        if (arg7 != null) {
                            var32.field7810[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field7809; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field9312.field2768.method1500(arg8[var35 * 3], -87).field9844) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field7806 = new int[var32.field7809];
                }
                if (var34) {
                    var32.field7807 = new short[var32.field7809];
                    var32.field7808 = new short[var32.field7809];
                }
                for (int var36 = 0; var36 < var32.field7809; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field7806[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field9312.field2768.method1500(var42, -104).field9844) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field9312.field2768.method1500(var43, -21).field9844) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field9312.field2768.method1500(var44, -87).field9844) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field7807[var36] = (short) var44;
                            var32.field7808[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field9312.field2768.method1500(var45, -21).field9844) {
                                    var32.field7810[var37] = class410.field5946[class414.method2528((byte) 7, this.field9312.field2768.method1500(var45, -96).field9828 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field9312.field2768.method1500(var46, -100).field9844) {
                                    var32.field7810[var38] = class410.field5946[class414.method2528((byte) 120, this.field9312.field2768.method1500(var46, -18).field9828 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field9312.field2768.method1500(var47, -19).field9844) {
                                    var32.field7810[var39] = class410.field5946[class414.method2528((byte) -69, this.field9312.field2768.method1500(var47, -45).field9828 & 65535) & 65535];
                                }
                            }
                            var32.field7807[var36] = -1;
                        }
                    }
                }
                this.field9332[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZLej;Llca;[I[I[I[I)V")
    private final void method3691(int arg0, int arg1, boolean arg2, class108 arg3, class599 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8) {
        class21 var10 = this.field9327[arg0][arg1];
        if (var10 != null) {
            if ((var10.field853 & 2) == 0) {
                int var11 = super.field1040 * arg0;
                int var12 = super.field1040 + var11;
                int var13 = super.field1040 * arg1;
                int var14 = super.field1040 + var13;
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
                if ((var10.field853 & 1) != 0 && !arg2) {
                    int var19 = super.field1042[arg0][arg1];
                    float var20 = (float) var19 * this.field9330;
                    if (this.field9329 == -1) {
                        var21 = (float) var13 * this.field9316 + (float) var11 * this.field9321 + var20 + this.field9331;
                        if (var21 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var22 = (float) var13 * this.field9316 + (float) var12 * this.field9321 + var20 + this.field9331;
                        if (var22 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var23 = (float) var14 * this.field9316 + (float) var12 * this.field9321 + var20 + this.field9331;
                        if (var23 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var24 = (float) var14 * this.field9316 + (float) var11 * this.field9321 + var20 + this.field9331;
                        if (var24 <= (float) this.field9312.field5299) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field9316 + (float) var11 * this.field9321 + var20 + this.field9331;
                        var22 = (float) var13 * this.field9316 + (float) var12 * this.field9321 + var20 + this.field9331;
                        var23 = (float) var14 * this.field9316 + (float) var12 * this.field9321 + var20 + this.field9331;
                        var24 = (float) var14 * this.field9316 + (float) var11 * this.field9321 + var20 + this.field9331;
                    }
                    if (arg3.field1873) {
                        int var25 = (int) (var21 - (float) arg3.field1866);
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = (int) (var22 - (float) arg3.field1866);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field1866);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field1866);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    float var29 = (float) var19 * this.field9326;
                    float var30 = (float) var19 * this.field9318;
                    if (this.field9329 == -1) {
                        var31 = (float) var13 * this.field9313 + (float) var11 * this.field9322 + var29 + this.field9324;
                        var32 = (int) ((float) this.field9312.field5298 * var31 / var21) + arg4.field8579;
                        var33 = (float) var13 * this.field9320 + (float) var11 * this.field9325 + var30 + this.field9323;
                        var34 = (int) ((float) this.field9312.field5290 * var33 / var21) + arg4.field8580;
                        var35 = (float) var13 * this.field9313 + (float) var12 * this.field9322 + var29 + this.field9324;
                        var36 = (int) ((float) this.field9312.field5298 * var35 / var22) + arg4.field8579;
                        var37 = (float) var13 * this.field9320 + (float) var12 * this.field9325 + var30 + this.field9323;
                        var38 = (int) ((float) this.field9312.field5290 * var37 / var22) + arg4.field8580;
                        var39 = (float) var14 * this.field9313 + (float) var12 * this.field9322 + var29 + this.field9324;
                        var40 = (int) ((float) this.field9312.field5298 * var39 / var23) + arg4.field8579;
                        var41 = (float) var14 * this.field9320 + (float) var12 * this.field9325 + var30 + this.field9323;
                        var42 = (int) ((float) this.field9312.field5290 * var41 / var23) + arg4.field8580;
                        var43 = (float) var14 * this.field9313 + (float) var11 * this.field9322 + var29 + this.field9324;
                        var44 = (int) ((float) this.field9312.field5298 * var43 / var24) + arg4.field8579;
                        var45 = (float) var14 * this.field9320 + (float) var11 * this.field9325 + var30 + this.field9323;
                        var46 = (int) ((float) this.field9312.field5290 * var45 / var24) + arg4.field8580;
                    } else {
                        var31 = (float) var13 * this.field9313 + (float) var11 * this.field9322 + var29 + this.field9324;
                        var32 = (int) ((float) this.field9312.field5298 * var31 / (float) this.field9329) + arg4.field8579;
                        var33 = (float) var13 * this.field9320 + (float) var11 * this.field9325 + var30 + this.field9323;
                        var34 = (int) ((float) this.field9312.field5290 * var33 / (float) this.field9329) + arg4.field8580;
                        var35 = (float) var13 * this.field9313 + (float) var12 * this.field9322 + var29 + this.field9324;
                        var36 = (int) ((float) this.field9312.field5298 * var35 / (float) this.field9329) + arg4.field8579;
                        var37 = (float) var13 * this.field9320 + (float) var12 * this.field9325 + var30 + this.field9323;
                        var38 = (int) ((float) this.field9312.field5290 * var37 / (float) this.field9329) + arg4.field8580;
                        var39 = (float) var14 * this.field9313 + (float) var12 * this.field9322 + var29 + this.field9324;
                        var40 = (int) ((float) this.field9312.field5298 * var39 / (float) this.field9329) + arg4.field8579;
                        var41 = (float) var14 * this.field9320 + (float) var12 * this.field9325 + var30 + this.field9323;
                        var42 = (int) ((float) this.field9312.field5290 * var41 / (float) this.field9329) + arg4.field8580;
                        var43 = (float) var14 * this.field9313 + (float) var11 * this.field9322 + var29 + this.field9324;
                        var44 = (int) ((float) this.field9312.field5298 * var43 / (float) this.field9329) + arg4.field8579;
                        var45 = (float) var14 * this.field9320 + (float) var11 * this.field9325 + var30 + this.field9323;
                        var46 = (int) ((float) this.field9312.field5290 * var45 / (float) this.field9329) + arg4.field8580;
                    }
                } else {
                    int var47 = super.field1042[arg0][arg1];
                    int var48 = super.field1042[arg0 + 1][arg1];
                    int var49 = super.field1042[arg0 + 1][arg1 + 1];
                    int var50 = super.field1042[arg0][arg1 + 1];
                    if (this.field9329 == -1) {
                        var21 = (float) var13 * this.field9316 + (float) var11 * this.field9321 + (float) var47 * this.field9330 + this.field9331;
                        if (var21 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var22 = (float) var13 * this.field9316 + (float) var12 * this.field9321 + (float) var48 * this.field9330 + this.field9331;
                        if (var22 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var23 = (float) var14 * this.field9316 + (float) var12 * this.field9321 + (float) var49 * this.field9330 + this.field9331;
                        if (var23 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var24 = (float) var14 * this.field9316 + (float) var11 * this.field9321 + (float) var50 * this.field9330 + this.field9331;
                        if (var24 <= (float) this.field9312.field5299) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field9316 + (float) var11 * this.field9321 + (float) var47 * this.field9330 + this.field9331;
                        var22 = (float) var13 * this.field9316 + (float) var12 * this.field9321 + (float) var48 * this.field9330 + this.field9331;
                        var23 = (float) var14 * this.field9316 + (float) var12 * this.field9321 + (float) var49 * this.field9330 + this.field9331;
                        var24 = (float) var14 * this.field9316 + (float) var11 * this.field9321 + (float) var50 * this.field9330 + this.field9331;
                    }
                    if (arg2) {
                        int var51 = (int) (var21 - (float) arg3.field1866);
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field857 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = (int) (var22 - (float) arg3.field1866);
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field858 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = (int) (var23 - (float) arg3.field1866);
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field855 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = (int) (var24 - (float) arg3.field1866);
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field854 * var57 / 255;
                            if (var58 > 0) {
                                var50 -= var58;
                            }
                        }
                    } else if (arg3.field1873) {
                        int var59 = (int) (var21 - (float) arg3.field1866);
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = (int) (var22 - (float) arg3.field1866);
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = (int) (var23 - (float) arg3.field1866);
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = (int) (var24 - (float) arg3.field1866);
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    if (this.field9329 == -1) {
                        var31 = (float) var13 * this.field9313 + (float) var11 * this.field9322 + (float) var47 * this.field9326 + this.field9324;
                        var32 = (int) ((float) this.field9312.field5298 * var31 / var21) + arg4.field8579;
                        var33 = (float) var13 * this.field9320 + (float) var11 * this.field9325 + (float) var47 * this.field9318 + this.field9323;
                        var34 = (int) ((float) this.field9312.field5290 * var33 / var21) + arg4.field8580;
                        var35 = (float) var13 * this.field9313 + (float) var12 * this.field9322 + (float) var48 * this.field9326 + this.field9324;
                        var36 = (int) ((float) this.field9312.field5298 * var35 / var22) + arg4.field8579;
                        var37 = (float) var13 * this.field9320 + (float) var12 * this.field9325 + (float) var48 * this.field9318 + this.field9323;
                        var38 = (int) ((float) this.field9312.field5290 * var37 / var22) + arg4.field8580;
                        var39 = (float) var14 * this.field9313 + (float) var12 * this.field9322 + (float) var49 * this.field9326 + this.field9324;
                        var40 = (int) ((float) this.field9312.field5298 * var39 / var23) + arg4.field8579;
                        var41 = (float) var14 * this.field9320 + (float) var12 * this.field9325 + (float) var49 * this.field9318 + this.field9323;
                        var42 = (int) ((float) this.field9312.field5290 * var41 / var23) + arg4.field8580;
                        var43 = (float) var14 * this.field9313 + (float) var11 * this.field9322 + (float) var50 * this.field9326 + this.field9324;
                        var44 = (int) ((float) this.field9312.field5298 * var43 / var24) + arg4.field8579;
                        var45 = (float) var14 * this.field9320 + (float) var11 * this.field9325 + (float) var50 * this.field9318 + this.field9323;
                        var46 = (int) ((float) this.field9312.field5290 * var45 / var24) + arg4.field8580;
                    } else {
                        var31 = (float) var13 * this.field9313 + (float) var11 * this.field9322 + (float) var47 * this.field9326 + this.field9324;
                        var32 = (int) ((float) this.field9312.field5298 * var31 / (float) this.field9329) + arg4.field8579;
                        var33 = (float) var13 * this.field9320 + (float) var11 * this.field9325 + (float) var47 * this.field9318 + this.field9323;
                        var34 = (int) ((float) this.field9312.field5290 * var33 / (float) this.field9329) + arg4.field8580;
                        var35 = (float) var13 * this.field9313 + (float) var12 * this.field9322 + (float) var48 * this.field9326 + this.field9324;
                        var36 = (int) ((float) this.field9312.field5298 * var35 / (float) this.field9329) + arg4.field8579;
                        var37 = (float) var13 * this.field9320 + (float) var12 * this.field9325 + (float) var48 * this.field9318 + this.field9323;
                        var38 = (int) ((float) this.field9312.field5290 * var37 / (float) this.field9329) + arg4.field8580;
                        var39 = (float) var14 * this.field9313 + (float) var12 * this.field9322 + (float) var49 * this.field9326 + this.field9324;
                        var40 = (int) ((float) this.field9312.field5298 * var39 / (float) this.field9329) + arg4.field8579;
                        var41 = (float) var14 * this.field9320 + (float) var12 * this.field9325 + (float) var49 * this.field9318 + this.field9323;
                        var42 = (int) ((float) this.field9312.field5290 * var41 / (float) this.field9329) + arg4.field8580;
                        var43 = (float) var14 * this.field9313 + (float) var11 * this.field9322 + (float) var50 * this.field9326 + this.field9324;
                        var44 = (int) ((float) this.field9312.field5298 * var43 / (float) this.field9329) + arg4.field8579;
                        var45 = (float) var14 * this.field9320 + (float) var11 * this.field9325 + (float) var50 * this.field9318 + this.field9323;
                        var46 = (int) ((float) this.field9312.field5290 * var45 / (float) this.field9329) + arg4.field8580;
                    }
                }
                boolean var63 = var10.field852 != -1 && this.method3693(this.field9312.field2768.method1500(var10.field852, -43).field9829);
                if (this.field9329 == -1) {
                    int var64 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field8584 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field8578 || var44 > arg4.field8578 || var36 > arg4.field8578;
                        if (var64 < 765) {
                            if (var63) {
                                arg4.field8590 = 100;
                            }
                            if (var64 > 0) {
                                if (var10.field852 >= 0) {
                                    arg4.method3406(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field1865, var17, var18, var16, var10.field849, var10.field850, var10.field848, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field852);
                                } else {
                                    arg4.method3417(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class104.method964(var10.field849, var17 << 24 | arg3.field1865, 14076), class104.method964(var10.field850, var18 << 24 | arg3.field1865, 14076), class104.method964(var10.field848, var16 << 24 | arg3.field1865, 14076));
                                }
                            } else if (var10.field852 >= 0) {
                                arg4.method3413(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field849, var10.field850, var10.field848, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field852);
                            } else {
                                arg4.method3417(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field849, var10.field850, var10.field848);
                            }
                            arg4.field8590 = 0;
                        } else {
                            arg4.method3412(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field1865);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field8584 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field8578 || var36 > arg4.field8578 || var44 > arg4.field8578;
                        if (var65 < 765) {
                            if (var63) {
                                arg4.field8590 = 100;
                            }
                            if (var65 > 0) {
                                if (var10.field852 >= 0) {
                                    arg4.method3406(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field1865, var15, var16, var18, var10.field851, var10.field848, var10.field850, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field852);
                                } else {
                                    arg4.method3417(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class104.method964(var10.field851, var15 << 24 | arg3.field1865, 14076), class104.method964(var10.field848, var16 << 24 | arg3.field1865, 14076), class104.method964(var10.field850, var18 << 24 | arg3.field1865, 14076));
                                }
                            } else if (var10.field852 >= 0) {
                                arg4.method3413(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field851, var10.field848, var10.field850, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field852);
                            } else {
                                arg4.method3417(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field851, var10.field848, var10.field850);
                            }
                            arg4.field8590 = 0;
                            return;
                        }
                        arg4.method3412(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field1865);
                        return;
                    }
                } else {
                    int var66 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field8584 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field8578 || var44 > arg4.field8578 || var36 > arg4.field8578;
                        if (var66 < 765) {
                            if (var63) {
                                arg4.field8590 = 100;
                            }
                            if (var66 > 0) {
                                if (var10.field852 >= 0) {
                                    arg4.method3406(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field1865, var17, var18, var16, var10.field849, var10.field850, var10.field848, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field9329, this.field9329, this.field9329, var10.field852);
                                } else {
                                    arg4.method3417(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class104.method964(var10.field849, var17 << 24 | arg3.field1865, 14076), class104.method964(var10.field850, var18 << 24 | arg3.field1865, 14076), class104.method964(var10.field848, var16 << 24 | arg3.field1865, 14076));
                                }
                            } else if (var10.field852 >= 0) {
                                arg4.method3413(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field849, var10.field850, var10.field848, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field9329, this.field9329, this.field9329, var10.field852);
                            } else {
                                arg4.method3417(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field849, var10.field850, var10.field848);
                            }
                            arg4.field8590 = 0;
                        } else {
                            arg4.method3412(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field1865);
                        }
                    }
                    int var67 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field8584 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field8578 || var36 > arg4.field8578 || var44 > arg4.field8578;
                        if (var67 < 765) {
                            if (var63) {
                                arg4.field8590 = 100;
                            }
                            if (var67 > 0) {
                                if (var10.field852 >= 0) {
                                    arg4.method3406(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field1865, var15, var16, var18, var10.field851, var10.field848, var10.field850, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field9329, this.field9329, this.field9329, var10.field852);
                                } else {
                                    arg4.method3417(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class104.method964(var10.field851, var15 << 24 | arg3.field1865, 14076), class104.method964(var10.field848, var16 << 24 | arg3.field1865, 14076), class104.method964(var10.field850, var18 << 24 | arg3.field1865, 14076));
                                }
                            } else if (var10.field852 >= 0) {
                                arg4.method3413(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field851, var10.field848, var10.field850, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field9329, this.field9329, this.field9329, var10.field852);
                            } else {
                                arg4.method3417(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field851, var10.field848, var10.field850);
                            }
                            arg4.field8590 = 0;
                            return;
                        }
                        arg4.method3412(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field1865);
                    }
                }
            }
        } else {
            class551 var68 = this.field9332[arg0][arg1];
            if (var68 != null) {
                if (this.field9329 == -1) {
                    for (int var69 = 0; var69 < var68.field7813; ++var69) {
                        int var70 = (arg0 << super.field1038) + var68.field7805[var69];
                        int var71 = var68.field7812[var69];
                        int var72 = (arg1 << super.field1038) + var68.field7804[var69];
                        float var73 = (float) var72 * this.field9316 + (float) var70 * this.field9321 + (float) var71 * this.field9330 + this.field9331;
                        if (var73 <= (float) this.field9312.field5299) {
                            return;
                        }
                        arg8[var69] = 0;
                        if (arg2) {
                            int var74 = (int) (var73 - (float) arg3.field1866);
                            if (var74 > 255) {
                                var74 = 255;
                            }
                            if (var74 > 0) {
                                arg8[var69] = var74;
                                int var75 = var68.field7811[var69] * var74 / 255;
                                if (var75 > 0) {
                                    var71 -= var75;
                                }
                            }
                        } else if (arg3.field1873) {
                            int var76 = (int) (var73 - (float) arg3.field1866);
                            if (var76 > 0) {
                                arg8[var69] = var76;
                                if (arg8[var69] > 255) {
                                    arg8[var69] = 255;
                                }
                            }
                        }
                        float var77 = (float) var72 * this.field9313 + (float) var70 * this.field9322 + (float) var71 * this.field9326 + this.field9324;
                        float var78 = (float) var72 * this.field9320 + (float) var70 * this.field9325 + (float) var71 * this.field9318 + this.field9323;
                        arg5[var69] = (int) ((float) this.field9312.field5298 * var77 / var73) + arg4.field8579;
                        arg6[var69] = (int) ((float) this.field9312.field5290 * var78 / var73) + arg4.field8580;
                        arg7[var69] = (int) var73;
                    }
                } else {
                    for (int var79 = 0; var79 < var68.field7813; ++var79) {
                        int var131 = (arg0 << super.field1038) + var68.field7805[var79];
                        int var132 = var68.field7812[var79];
                        int var133 = (arg1 << super.field1038) + var68.field7804[var79];
                        float var134 = (float) var133 * this.field9316 + (float) var131 * this.field9321 + (float) var132 * this.field9330 + this.field9331;
                        arg8[var79] = 0;
                        if (arg2) {
                            int var135 = this.field9329 - arg3.field1866;
                            if (var135 > 255) {
                                var135 = 255;
                            }
                            if (var135 > 0) {
                                arg8[var79] = var135;
                                int var136 = var68.field7811[var79] * var135 / 255;
                                if (var136 > 0) {
                                    var132 -= var136;
                                }
                            }
                        } else if (arg3.field1873) {
                            int var137 = this.field9329 - arg3.field1866;
                            if (var137 > 0) {
                                arg8[var79] = var137;
                                if (arg8[var79] > 255) {
                                    arg8[var79] = 255;
                                }
                            }
                        }
                        float var138 = (float) var133 * this.field9313 + (float) var131 * this.field9322 + (float) var132 * this.field9326 + this.field9324;
                        float var139 = (float) var133 * this.field9320 + (float) var131 * this.field9325 + (float) var132 * this.field9318 + this.field9323;
                        arg5[var79] = (int) ((float) this.field9312.field5298 * var138 / (float) this.field9329) + arg4.field8579;
                        arg6[var79] = (int) ((float) this.field9312.field5290 * var139 / (float) this.field9329) + arg4.field8580;
                        arg7[var79] = (int) var134;
                    }
                }
                if (var68.field7807 != null) {
                    int var80 = super.field1042[arg0][arg1];
                    int var81 = super.field1042[arg0 + 1][arg1];
                    int var82 = super.field1042[arg0][arg1 + 1];
                    int var83 = super.field1040 * arg0;
                    int var84 = super.field1040 + var83;
                    int var85 = super.field1040 * arg1;
                    int var86 = super.field1040 + var85;
                    float var87 = (float) var85 * this.field9313 + (float) var80 * this.field9326 + (float) var83 * this.field9322 + this.field9324;
                    float var88 = (float) var85 * this.field9320 + (float) var80 * this.field9318 + (float) var83 * this.field9325 + this.field9323;
                    float var89 = (float) var85 * this.field9316 + (float) var80 * this.field9330 + (float) var83 * this.field9321 + this.field9331;
                    float var90 = (float) var85 * this.field9313 + (float) var81 * this.field9326 + (float) var84 * this.field9322 + this.field9324;
                    float var91 = (float) var85 * this.field9320 + (float) var81 * this.field9318 + (float) var84 * this.field9325 + this.field9323;
                    float var92 = (float) var85 * this.field9316 + (float) var81 * this.field9330 + (float) var84 * this.field9321 + this.field9331;
                    float var93 = (float) var86 * this.field9313 + (float) var82 * this.field9326 + (float) var83 * this.field9322 + this.field9324;
                    float var94 = (float) var86 * this.field9320 + (float) var82 * this.field9318 + (float) var83 * this.field9325 + this.field9323;
                    float var95 = (float) var86 * this.field9316 + (float) var82 * this.field9330 + (float) var83 * this.field9321 + this.field9331;
                    if (this.field9329 == -1) {
                        for (int var96 = 0; var96 < var68.field7809; ++var96) {
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
                                arg4.field8584 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg4.field8578 || var101 > arg4.field8578 || var102 > arg4.field8578;
                                short var107 = var68.field7807[var96];
                                if (var106 < 765) {
                                    if (var107 != -1 && this.method3693(this.field9312.field2768.method1500(var107, -106).field9829)) {
                                        arg4.field8590 = 100;
                                    }
                                    if (var106 > 0) {
                                        if (var107 != -1) {
                                            arg4.method3406(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field1865, arg8[var97], arg8[var98], arg8[var99], var68.field7810[var97], var68.field7810[var98], var68.field7810[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                        } else if ((var68.field7810[var97] & 16777215) != 0) {
                                            arg4.method3417(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], class104.method964(var68.field7810[var97], arg8[var97] << 24 | arg3.field1865, 14076), class104.method964(var68.field7810[var98], arg8[var98] << 24 | arg3.field1865, 14076), class104.method964(var68.field7810[var99], arg8[var99] << 24 | arg3.field1865, 14076));
                                        }
                                    } else if (var107 != -1) {
                                        arg4.method3413(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field7810[var97], var68.field7810[var98], var68.field7810[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                    } else if ((var68.field7810[var97] & 16777215) != 0) {
                                        arg4.method3417(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field7810[var97], var68.field7810[var98], var68.field7810[var99]);
                                    }
                                    arg4.field8590 = 0;
                                } else {
                                    arg4.method3412(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field1865);
                                }
                            }
                        }
                        return;
                    }
                    for (int var108 = 0; var108 < var68.field7809; ++var108) {
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
                            arg4.field8584 = var112 < 0 || var113 < 0 || var114 < 0 || var112 > arg4.field8578 || var113 > arg4.field8578 || var114 > arg4.field8578;
                            short var119 = var68.field7807[var108];
                            if (var118 < 765) {
                                if (var119 != -1 && this.method3693(this.field9312.field2768.method1500(var119, -114).field9829)) {
                                    arg4.field8590 = 100;
                                }
                                if (var118 > 0) {
                                    if (var119 != -1) {
                                        arg4.method3406(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field1865, arg8[var109], arg8[var110], arg8[var111], var68.field7810[var109], var68.field7810[var110], var68.field7810[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field9329, this.field9329, this.field9329, var119);
                                    } else if ((var68.field7810[var109] & 16777215) != 0) {
                                        arg4.method3417(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], class104.method964(var68.field7810[var109], arg8[var109] << 24 | arg3.field1865, 14076), class104.method964(var68.field7810[var110], arg8[var110] << 24 | arg3.field1865, 14076), class104.method964(var68.field7810[var111], arg8[var111] << 24 | arg3.field1865, 14076));
                                    }
                                } else if (var119 != -1) {
                                    arg4.method3413(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field7810[var109], var68.field7810[var110], var68.field7810[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field9329, this.field9329, this.field9329, var119);
                                } else if ((var68.field7810[var109] & 16777215) != 0) {
                                    arg4.method3417(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field7810[var109], var68.field7810[var110], var68.field7810[var111]);
                                }
                                arg4.field8590 = 0;
                            } else {
                                arg4.method3412(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field1865);
                            }
                        }
                    }
                    return;
                }
                for (int var120 = 0; var120 < var68.field7809; ++var120) {
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
                        arg4.field8584 = var124 < 0 || var125 < 0 || var126 < 0 || var124 > arg4.field8578 || var125 > arg4.field8578 || var126 > arg4.field8578;
                        if (var130 < 765) {
                            if (var130 > 0) {
                                if ((var68.field7810[var121] & 16777215) != 0) {
                                    arg4.method3417(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], class263.method1725(arg3.field1865, (byte) 3, arg8[var121], var68.field7810[var121]), class263.method1725(arg3.field1865, (byte) 3, arg8[var122], var68.field7810[var122]), class263.method1725(arg3.field1865, (byte) 3, arg8[var123], var68.field7810[var123]));
                                }
                            } else if ((var68.field7810[var121] & 16777215) != 0) {
                                arg4.method3417(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], var68.field7810[var121], var68.field7810[var122], var68.field7810[var123]);
                            }
                        } else {
                            arg4.method3412(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], arg3.field1865);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public final void method545(int arg0, int arg1) {
        class108 var3 = this.field9312.method2278(Thread.currentThread());
        var3.field1911.field8590 = 0;
        if (this.field9327 != null) {
            this.method3691(arg0, arg1, var3.field1864, var3, var3.field1911, var3.field1889, var3.field1914, var3.field1898, var3.field1897);
        } else {
            if (this.field9317 != null) {
                this.method3695(arg0, arg1, var3.field1911, var3.field1889, var3.field1914, var3.field1898, var3.field1897);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[[ZZI)V")
    public final void method548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class141 var7 = this.field9312.field5297;
        this.field9329 = arg5;
        this.field9322 = var7.field2497;
        this.field9326 = var7.field2485;
        this.field9313 = var7.field2495;
        this.field9324 = var7.field2482;
        this.field9325 = var7.field2476;
        this.field9318 = var7.field2498;
        this.field9320 = var7.field2473;
        this.field9323 = var7.field2496;
        this.field9321 = var7.field2472;
        this.field9330 = var7.field2501;
        this.field9316 = var7.field2471;
        this.field9331 = var7.field2480;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field1041 && var11 >= 0 && var11 < super.field1043) {
                        this.method545(var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
    public final void method544(int arg0, int arg1, int arg2) {
        if (this.field9319[arg0][arg1] < arg2) {
            this.field9319[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII[[ZLej;Llca;[I[I)V")
    private final void method3692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class108 arg8, class599 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field1868;
        this.field9312.method81(false);
        arg9.field8581 = false;
        arg9.field8585 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field9327[var18][var19] != null) {
                        class21 var20 = this.field9327[var18][var19];
                        if (var20.field852 != -1 && (var20.field853 & 2) == 0 && var20.field856 == 0) {
                            int var21 = this.field9312.method2272(var20.field852);
                            arg9.method3419(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class649.method3702((byte) -84, var21, var20.field849), class649.method3702((byte) -84, var21, var20.field850), class649.method3702((byte) -84, var21, var20.field848));
                            arg9.method3419(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class649.method3702((byte) -84, var21, var20.field851), class649.method3702((byte) -84, var21, var20.field848), class649.method3702((byte) -84, var21, var20.field850));
                        } else if (var20.field856 == 0) {
                            arg9.method3417(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field849, var20.field850, var20.field848);
                            arg9.method3417(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field851, var20.field848, var20.field850);
                        } else {
                            int var22 = var20.field856;
                            arg9.method3417(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class104.method964(var22, var20.field849 & -16777216, 14076), class104.method964(var22, var20.field850 & -16777216, 14076), class104.method964(var22, var20.field848 & -16777216, 14076));
                            arg9.method3417(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class104.method964(var22, var20.field851 & -16777216, 14076), class104.method964(var22, var20.field848 & -16777216, 14076), class104.method964(var22, var20.field850 & -16777216, 14076));
                        }
                    } else if (this.field9332[var18][var19] != null) {
                        class551 var23 = this.field9332[var18][var19];
                        for (int var24 = 0; var24 < var23.field7813; ++var24) {
                            arg10[var24] = var23.field7805[var24] * var14 / super.field1040 + var16;
                            arg11[var24] = var17 - var23.field7804[var24] * var14 / super.field1040;
                        }
                        for (int var25 = 0; var25 < var23.field7809; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field7806 != null && var23.field7806[var25] != 0 && (var23.field7807 == null || var23.field7807 != null && var23.field7807[var25] == -1)) {
                                int var35 = var23.field7806[var25];
                                arg9.method3417(var32, var33, var34, var29, var30, var31, 100, 100, 100, class104.method964(var35, -16777216 - (var23.field7810[var26] & -16777216), 14076), class104.method964(var35, -16777216 - (var23.field7810[var27] & -16777216), 14076), class104.method964(var35, -16777216 - (var23.field7810[var28] & -16777216), 14076));
                            } else if (var23.field7807 != null && var23.field7807[var25] != -1) {
                                int var36 = this.field9312.method2272(var23.field7807[var25]);
                                arg9.method3419(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                            } else {
                                arg9.method3417(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field7810[var26], var23.field7810[var27], var23.field7810[var28]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field8581 = true;
        this.field9312.method81(var15);
    }

    @OriginalMember(owner = "client!oa", name = "BA", descriptor = "()V")
    public final void method547() {
        this.field9315 = null;
        this.field9319 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lff;[I)V")
    public final void method541(class9 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Z")
    private final boolean method3693(int arg0) {
        if ((this.field9314 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method539(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method537(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method538(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method543(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field9317 == null) {
            this.field9317 = new class556[super.field1041][super.field1043];
            this.field9328 = new class484[super.field1041][super.field1043];
        } else if (this.field9327 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field1040 != var20 || var21 != 0 && super.field1040 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class484 var22 = new class484();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field6925 = var23;
            var22.field6922 = new short[var23];
            var22.field6929 = new short[var23];
            var22.field6923 = new short[var23];
            var22.field6924 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field6922[var25] = (short) (this.field9315[arg0][arg1] - this.field9319[arg0][arg1]);
                } else if (var30 == 0 && super.field1040 == var31) {
                    var22.field6922[var25] = (short) (this.field9315[arg0][arg1 + 1] - this.field9319[arg0][arg1 + 1]);
                } else if (super.field1040 == var30 && super.field1040 == var31) {
                    var22.field6922[var25] = (short) (this.field9315[arg0 + 1][arg1 + 1] - this.field9319[arg0 + 1][arg1 + 1]);
                } else if (super.field1040 == var30 && var31 == 0) {
                    var22.field6922[var25] = (short) (this.field9315[arg0 + 1][arg1] - this.field9319[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field9315[arg0 + 1][arg1] - this.field9319[arg0 + 1][arg1]) * var30 + (this.field9315[arg0][arg1] - this.field9319[arg0][arg1]) * (super.field1040 - var30);
                    int var33 = (this.field9315[arg0 + 1][arg1 + 1] - this.field9319[arg0 + 1][arg1 + 1]) * var30 + (this.field9315[arg0][arg1 + 1] - this.field9319[arg0][arg1 + 1]) * (super.field1040 - var30);
                    var22.field6922[var25] = (short) ((super.field1040 - var31) * var32 + var31 * var33 >> super.field1038 * 2);
                }
                int var34 = (arg0 << super.field1038) + var30;
                int var35 = (arg1 << super.field1038) + var31;
                var22.field6929[var25] = (short) var30;
                var22.field6924[var25] = (short) var31;
                var22.field6923[var25] = (short) (this.method552(1, var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field6922[var25] < 2) {
                    var22.field6922[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field9312.field2768.method1500(arg11[var28], -10).field9844) {
                    var26 = true;
                }
            }
            var22.field6928 = new int[var27];
            if (arg10 != null) {
                var22.field6919 = new int[var27];
            }
            var22.field6926 = new short[var27];
            var22.field6931 = new short[var27];
            var22.field6921 = new short[var27];
            if (var26) {
                var22.field6920 = new short[var27];
                var22.field6927 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field6928[var22.field6930] = class414.method2528((byte) -58, arg9[var29]);
                    } else {
                        var22.field6928[var22.field6930] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field6919[var22.field6930] = class414.method2528((byte) -33, arg10[var29]);
                        } else {
                            var22.field6919[var22.field6930] = -1;
                        }
                    }
                    var22.field6926[var22.field6930] = (short) arg6[var29];
                    var22.field6931[var22.field6930] = (short) arg7[var29];
                    var22.field6921[var22.field6930] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field9312.field2768.method1500(arg11[var29], -29).field9844) {
                            var22.field6920[var22.field6930] = (short) arg11[var29];
                            var22.field6927[var22.field6930] = (short) arg12[var29];
                        } else {
                            var22.field6920[var22.field6930] = -1;
                        }
                    }
                    ++var22.field6930;
                }
            }
            this.field9328[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class556 var36 = new class556();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field7871 = class649.method3702((byte) -84, class414.method2528((byte) 117, arg10[0]), this.field9315[arg0][arg1] - this.field9319[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field7867 = (byte) (var36.field7867 | 2);
                    }
                }
                if (super.field1042[arg0 + 1][arg1] == super.field1042[arg0][arg1] && super.field1042[arg0 + 1][arg1 + 1] == super.field1042[arg0][arg1] && super.field1042[arg0][arg1 + 1] == super.field1042[arg0][arg1]) {
                    var36.field7867 = (byte) (var36.field7867 | 1);
                }
                if (var38 != -1 && (var36.field7867 & 2) == 0 && !this.field9312.field2768.method1500(var38, -17).field9844) {
                    var36.field7870 = (short) (this.field9315[arg0][arg1] - this.field9319[arg0][arg1]);
                    var36.field7872 = (short) (this.field9315[arg0 + 1][arg1] - this.field9319[arg0 + 1][arg1]);
                    var36.field7869 = (short) (this.field9315[arg0 + 1][arg1 + 1] - this.field9319[arg0 + 1][arg1 + 1]);
                    var36.field7868 = (short) (this.field9315[arg0][arg1 + 1] - this.field9319[arg0][arg1 + 1]);
                    var36.field7866 = (short) var38;
                } else {
                    short var39 = class414.method2528((byte) -71, var37);
                    var36.field7870 = (short) class649.method3702((byte) -84, var39, this.field9315[arg0][arg1] - this.field9319[arg0][arg1]);
                    var36.field7872 = (short) class649.method3702((byte) -84, var39, this.field9315[arg0 + 1][arg1] - this.field9319[arg0 + 1][arg1]);
                    var36.field7869 = (short) class649.method3702((byte) -84, var39, this.field9315[arg0 + 1][arg1 + 1] - this.field9319[arg0 + 1][arg1 + 1]);
                    var36.field7868 = (short) class649.method3702((byte) -84, var39, this.field9315[arg0][arg1 + 1] - this.field9319[arg0][arg1 + 1]);
                    var36.field7866 = -1;
                }
                this.field9317[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIIII[[ZLej;Llca;[I[I)V")
    private final void method3694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class108 arg8, class599 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field1868;
        this.field9312.method81(false);
        arg9.field8581 = false;
        arg9.field8585 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field9317[var18][var19] != null) {
                        class556 var20 = this.field9317[var18][var19];
                        if (var20.field7866 != -1 && (var20.field7867 & 2) == 0 && var20.field7871 == -1) {
                            int var21 = this.field9312.method2272(var20.field7866);
                            arg9.method3419(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class649.method3702((byte) -84, var21, var20.field7869 & 65535), class649.method3702((byte) -84, var21, var20.field7868 & 65535), class649.method3702((byte) -84, var21, var20.field7872 & 65535));
                            arg9.method3419(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class649.method3702((byte) -84, var21, var20.field7870 & 65535), class649.method3702((byte) -84, var21, var20.field7872 & 65535), class649.method3702((byte) -84, var21, var20.field7868 & 65535));
                        } else if (var20.field7871 == -1) {
                            arg9.method3419(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field7869 & 65535, var20.field7868 & 65535, var20.field7872 & 65535);
                            arg9.method3419(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field7870 & 65535, var20.field7872 & 65535, var20.field7868 & 65535);
                        } else {
                            int var22 = var20.field7871;
                            arg9.method3419(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg9.method3419(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (this.field9328[var18][var19] != null) {
                        class484 var23 = this.field9328[var18][var19];
                        for (int var24 = 0; var24 < var23.field6925; ++var24) {
                            arg10[var24] = var23.field6929[var24] * var14 / super.field1040 + var16;
                            arg11[var24] = var17 - var23.field6924[var24] * var14 / super.field1040;
                        }
                        for (int var25 = 0; var25 < var23.field6930; ++var25) {
                            short var26 = var23.field6926[var25];
                            short var27 = var23.field6931[var25];
                            short var28 = var23.field6921[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field6919 != null && var23.field6919[var25] != -1) {
                                int var35 = var23.field6919[var25];
                                arg9.method3419(var32, var33, var34, var29, var30, var31, 100, 100, 100, class649.method3702((byte) -84, var35, var23.field6922[var26]), class649.method3702((byte) -84, var35, var23.field6922[var27]), class649.method3702((byte) -84, var35, var23.field6922[var28]));
                            } else if (var23.field6920 != null && var23.field6920[var25] != -1) {
                                int var36 = this.field9312.method2272(var23.field6920[var25]);
                                arg9.method3419(var32, var33, var34, var29, var30, var31, 100, 100, 100, class649.method3702((byte) -84, var36, var23.field6922[var26]), class649.method3702((byte) -84, var36, var23.field6922[var27]), class649.method3702((byte) -84, var36, var23.field6922[var28]));
                            } else {
                                int var37 = var23.field6928[var25];
                                arg9.method3419(var32, var33, var34, var29, var30, var31, 100, 100, 100, class649.method3702((byte) -84, var37, var23.field6922[var26]), class649.method3702((byte) -84, var37, var23.field6922[var27]), class649.method3702((byte) -84, var37, var23.field6922[var28]));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field8581 = true;
        this.field9312.method81(var15);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class108 var9 = this.field9312.method2278(Thread.currentThread());
        class599 var10 = var9.field1911;
        var10.field8590 = 0;
        var10.field8584 = false;
        this.field9312.method28();
        if (this.field9327 != null) {
            this.method3692(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field1889, var9.field1914);
        } else {
            if (this.field9317 != null) {
                this.method3694(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field1889, var9.field1914);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILlca;[I[I[I[I)V")
    private final void method3695(int arg0, int arg1, class599 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        class556 var8 = this.field9317[arg0][arg1];
        if (var8 != null) {
            if ((var8.field7867 & 2) == 0) {
                int var9 = super.field1040 * arg0;
                int var10 = super.field1040 + var9;
                int var11 = super.field1040 * arg1;
                int var12 = super.field1040 + var11;
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
                if ((var8.field7867 & 1) != 0) {
                    int var13 = super.field1042[arg0][arg1];
                    float var14 = (float) var13 * this.field9330;
                    if (this.field9329 == -1) {
                        var15 = (float) var11 * this.field9316 + (float) var9 * this.field9321 + var14 + this.field9331;
                        if (var15 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var16 = (float) var11 * this.field9316 + (float) var10 * this.field9321 + var14 + this.field9331;
                        if (var16 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var17 = (float) var12 * this.field9316 + (float) var10 * this.field9321 + var14 + this.field9331;
                        if (var17 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var18 = (float) var12 * this.field9316 + (float) var9 * this.field9321 + var14 + this.field9331;
                        if (var18 <= (float) this.field9312.field5299) {
                            return;
                        }
                    } else {
                        var15 = (float) var11 * this.field9316 + (float) var9 * this.field9321 + var14 + this.field9331;
                        var16 = (float) var11 * this.field9316 + (float) var10 * this.field9321 + var14 + this.field9331;
                        var17 = (float) var12 * this.field9316 + (float) var10 * this.field9321 + var14 + this.field9331;
                        var18 = (float) var12 * this.field9316 + (float) var9 * this.field9321 + var14 + this.field9331;
                    }
                    float var19 = (float) var13 * this.field9326;
                    float var20 = (float) var13 * this.field9318;
                    if (this.field9329 == -1) {
                        var21 = (float) var11 * this.field9313 + (float) var9 * this.field9322 + var19 + this.field9324;
                        var22 = (int) ((float) this.field9312.field5298 * var21 / var15) + arg2.field8579;
                        var23 = (float) var11 * this.field9320 + (float) var9 * this.field9325 + var20 + this.field9323;
                        var24 = (int) ((float) this.field9312.field5290 * var23 / var15) + arg2.field8580;
                        var25 = (float) var11 * this.field9313 + (float) var10 * this.field9322 + var19 + this.field9324;
                        var26 = (int) ((float) this.field9312.field5298 * var25 / var16) + arg2.field8579;
                        var27 = (float) var11 * this.field9320 + (float) var10 * this.field9325 + var20 + this.field9323;
                        var28 = (int) ((float) this.field9312.field5290 * var27 / var16) + arg2.field8580;
                        float var29 = (float) var12 * this.field9313 + (float) var10 * this.field9322 + var19 + this.field9324;
                        var30 = (int) ((float) this.field9312.field5298 * var29 / var17) + arg2.field8579;
                        float var31 = (float) var12 * this.field9320 + (float) var10 * this.field9325 + var20 + this.field9323;
                        var32 = (int) ((float) this.field9312.field5290 * var31 / var17) + arg2.field8580;
                        var33 = (float) var12 * this.field9313 + (float) var9 * this.field9322 + var19 + this.field9324;
                        var34 = (int) ((float) this.field9312.field5298 * var33 / var18) + arg2.field8579;
                        var35 = (float) var12 * this.field9320 + (float) var9 * this.field9325 + var20 + this.field9323;
                        var36 = (int) ((float) this.field9312.field5290 * var35 / var18) + arg2.field8580;
                    } else {
                        var21 = (float) var11 * this.field9313 + (float) var9 * this.field9322 + var19 + this.field9324;
                        var22 = (int) ((float) this.field9312.field5298 * var21 / (float) this.field9329) + arg2.field8579;
                        var23 = (float) var11 * this.field9320 + (float) var9 * this.field9325 + var20 + this.field9323;
                        var24 = (int) ((float) this.field9312.field5290 * var23 / (float) this.field9329) + arg2.field8580;
                        var25 = (float) var11 * this.field9313 + (float) var10 * this.field9322 + var19 + this.field9324;
                        var26 = (int) ((float) this.field9312.field5298 * var25 / (float) this.field9329) + arg2.field8579;
                        var27 = (float) var11 * this.field9320 + (float) var10 * this.field9325 + var20 + this.field9323;
                        var28 = (int) ((float) this.field9312.field5290 * var27 / (float) this.field9329) + arg2.field8580;
                        float var37 = (float) var12 * this.field9313 + (float) var10 * this.field9322 + var19 + this.field9324;
                        var30 = (int) ((float) this.field9312.field5298 * var37 / (float) this.field9329) + arg2.field8579;
                        float var38 = (float) var12 * this.field9320 + (float) var10 * this.field9325 + var20 + this.field9323;
                        var32 = (int) ((float) this.field9312.field5290 * var38 / (float) this.field9329) + arg2.field8580;
                        var33 = (float) var12 * this.field9313 + (float) var9 * this.field9322 + var19 + this.field9324;
                        var34 = (int) ((float) this.field9312.field5298 * var33 / (float) this.field9329) + arg2.field8579;
                        var35 = (float) var12 * this.field9320 + (float) var9 * this.field9325 + var20 + this.field9323;
                        var36 = (int) ((float) this.field9312.field5290 * var35 / (float) this.field9329) + arg2.field8580;
                    }
                } else {
                    int var39 = super.field1042[arg0][arg1];
                    int var40 = super.field1042[arg0 + 1][arg1];
                    int var41 = super.field1042[arg0 + 1][arg1 + 1];
                    int var42 = super.field1042[arg0][arg1 + 1];
                    if (this.field9329 == -1) {
                        var15 = (float) var11 * this.field9316 + (float) var9 * this.field9321 + (float) var39 * this.field9330 + this.field9331;
                        if (var15 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var16 = (float) var11 * this.field9316 + (float) var10 * this.field9321 + (float) var40 * this.field9330 + this.field9331;
                        if (var16 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var17 = (float) var12 * this.field9316 + (float) var10 * this.field9321 + (float) var41 * this.field9330 + this.field9331;
                        if (var17 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var18 = (float) var12 * this.field9316 + (float) var9 * this.field9321 + (float) var42 * this.field9330 + this.field9331;
                        if (var18 <= (float) this.field9312.field5299) {
                            return;
                        }
                        var21 = (float) var11 * this.field9313 + (float) var9 * this.field9322 + (float) var39 * this.field9326 + this.field9324;
                        var22 = (int) ((float) this.field9312.field5298 * var21 / var15) + arg2.field8579;
                        var23 = (float) var11 * this.field9320 + (float) var9 * this.field9325 + (float) var39 * this.field9318 + this.field9323;
                        var24 = (int) ((float) this.field9312.field5290 * var23 / var15) + arg2.field8580;
                        var25 = (float) var11 * this.field9313 + (float) var10 * this.field9322 + (float) var40 * this.field9326 + this.field9324;
                        var26 = (int) ((float) this.field9312.field5298 * var25 / var16) + arg2.field8579;
                        var27 = (float) var11 * this.field9320 + (float) var10 * this.field9325 + (float) var40 * this.field9318 + this.field9323;
                        var28 = (int) ((float) this.field9312.field5290 * var27 / var16) + arg2.field8580;
                        float var43 = (float) var12 * this.field9313 + (float) var10 * this.field9322 + (float) var41 * this.field9326 + this.field9324;
                        var30 = (int) ((float) this.field9312.field5298 * var43 / var17) + arg2.field8579;
                        float var44 = (float) var12 * this.field9320 + (float) var10 * this.field9325 + (float) var41 * this.field9318 + this.field9323;
                        var32 = (int) ((float) this.field9312.field5290 * var44 / var17) + arg2.field8580;
                        var33 = (float) var12 * this.field9313 + (float) var9 * this.field9322 + (float) var42 * this.field9326 + this.field9324;
                        var34 = (int) ((float) this.field9312.field5298 * var33 / var18) + arg2.field8579;
                        var35 = (float) var12 * this.field9320 + (float) var9 * this.field9325 + (float) var42 * this.field9318 + this.field9323;
                        var36 = (int) ((float) this.field9312.field5290 * var35 / var18) + arg2.field8580;
                    } else {
                        var15 = (float) var11 * this.field9316 + (float) var9 * this.field9321 + (float) var39 * this.field9330 + this.field9331;
                        var16 = (float) var11 * this.field9316 + (float) var10 * this.field9321 + (float) var40 * this.field9330 + this.field9331;
                        var17 = (float) var12 * this.field9316 + (float) var10 * this.field9321 + (float) var41 * this.field9330 + this.field9331;
                        var18 = (float) var12 * this.field9316 + (float) var9 * this.field9321 + (float) var42 * this.field9330 + this.field9331;
                        var21 = (float) var11 * this.field9313 + (float) var9 * this.field9322 + (float) var39 * this.field9326 + this.field9324;
                        var22 = (int) ((float) this.field9312.field5298 * var21 / (float) this.field9329) + arg2.field8579;
                        var23 = (float) var11 * this.field9320 + (float) var9 * this.field9325 + (float) var39 * this.field9318 + this.field9323;
                        var24 = (int) ((float) this.field9312.field5290 * var23 / (float) this.field9329) + arg2.field8580;
                        var25 = (float) var11 * this.field9313 + (float) var10 * this.field9322 + (float) var40 * this.field9326 + this.field9324;
                        var26 = (int) ((float) this.field9312.field5298 * var25 / (float) this.field9329) + arg2.field8579;
                        var27 = (float) var11 * this.field9320 + (float) var10 * this.field9325 + (float) var40 * this.field9318 + this.field9323;
                        var28 = (int) ((float) this.field9312.field5290 * var27 / (float) this.field9329) + arg2.field8580;
                        float var45 = (float) var12 * this.field9313 + (float) var10 * this.field9322 + (float) var41 * this.field9326 + this.field9324;
                        var30 = (int) ((float) this.field9312.field5298 * var45 / (float) this.field9329) + arg2.field8579;
                        float var46 = (float) var12 * this.field9320 + (float) var10 * this.field9325 + (float) var41 * this.field9318 + this.field9323;
                        var32 = (int) ((float) this.field9312.field5290 * var46 / (float) this.field9329) + arg2.field8580;
                        var33 = (float) var12 * this.field9313 + (float) var9 * this.field9322 + (float) var42 * this.field9326 + this.field9324;
                        var34 = (int) ((float) this.field9312.field5298 * var33 / (float) this.field9329) + arg2.field8579;
                        var35 = (float) var12 * this.field9320 + (float) var9 * this.field9325 + (float) var42 * this.field9318 + this.field9323;
                        var36 = (int) ((float) this.field9312.field5290 * var35 / (float) this.field9329) + arg2.field8580;
                    }
                }
                if (this.field9329 == -1) {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field8584 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field8578 || var34 > arg2.field8578 || var26 > arg2.field8578;
                        if (var8.field7866 >= 0) {
                            if (this.method3693(this.field9312.field2768.method1500(var8.field7866, -121).field9829)) {
                                arg2.field8590 = 100;
                            }
                            arg2.method3413(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field7869 & 65535, var8.field7868 & 65535, var8.field7872 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field7866);
                            arg2.field8590 = 0;
                        } else {
                            arg2.method3419(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field7869 & 65535, var8.field7868 & 65535, var8.field7872 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field8584 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field8578 || var26 > arg2.field8578 || var34 > arg2.field8578;
                        if (var8.field7866 >= 0) {
                            if (this.method3693(this.field9312.field2768.method1500(var8.field7866, -45).field9829)) {
                                arg2.field8590 = 100;
                            }
                            arg2.method3413(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field7870 & 65535, var8.field7872 & 65535, var8.field7868 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field7866);
                            arg2.field8590 = 0;
                            return;
                        }
                        arg2.method3419(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field7870 & 65535, var8.field7872 & 65535, var8.field7868 & 65535);
                        return;
                    }
                } else {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field8584 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field8578 || var34 > arg2.field8578 || var26 > arg2.field8578;
                        if (var8.field7866 >= 0) {
                            if (this.method3693(this.field9312.field2768.method1500(var8.field7866, -78).field9829)) {
                                arg2.field8590 = 100;
                            }
                            arg2.method3413(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field7869 & 65535, var8.field7868 & 65535, var8.field7872 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field9329, this.field9329, this.field9329, var8.field7866);
                            arg2.field8590 = 0;
                        } else {
                            arg2.method3419(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field7869 & 65535, var8.field7868 & 65535, var8.field7872 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field8584 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field8578 || var26 > arg2.field8578 || var34 > arg2.field8578;
                        if (var8.field7866 >= 0) {
                            if (this.method3693(this.field9312.field2768.method1500(var8.field7866, -54).field9829)) {
                                arg2.field8590 = 100;
                            }
                            arg2.method3413(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field7870 & 65535, var8.field7872 & 65535, var8.field7868 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field9329, this.field9329, this.field9329, var8.field7866);
                            arg2.field8590 = 0;
                            return;
                        }
                        arg2.method3419(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field7870 & 65535, var8.field7872 & 65535, var8.field7868 & 65535);
                    }
                }
            }
        } else {
            class484 var47 = this.field9328[arg0][arg1];
            if (var47 != null) {
                if (this.field9329 == -1) {
                    for (int var48 = 0; var48 < var47.field6925; ++var48) {
                        int var49 = (arg0 << super.field1038) + var47.field6929[var48];
                        short var50 = var47.field6923[var48];
                        int var51 = (arg1 << super.field1038) + var47.field6924[var48];
                        float var52 = (float) var51 * this.field9316 + (float) var49 * this.field9321 + (float) var50 * this.field9330 + this.field9331;
                        if (var52 <= (float) this.field9312.field5299) {
                            return;
                        }
                        float var53 = (float) var51 * this.field9313 + (float) var49 * this.field9322 + (float) var50 * this.field9326 + this.field9324;
                        float var54 = (float) var51 * this.field9320 + (float) var49 * this.field9325 + (float) var50 * this.field9318 + this.field9323;
                        arg3[var48] = (int) ((float) this.field9312.field5298 * var53 / var52) + arg2.field8579;
                        arg4[var48] = (int) ((float) this.field9312.field5290 * var54 / var52) + arg2.field8580;
                        arg5[var48] = (int) var52;
                    }
                } else {
                    for (int var55 = 0; var55 < var47.field6925; ++var55) {
                        int var107 = (arg0 << super.field1038) + var47.field6929[var55];
                        short var108 = var47.field6923[var55];
                        int var109 = (arg1 << super.field1038) + var47.field6924[var55];
                        float var110 = (float) var109 * this.field9316 + (float) var107 * this.field9321 + (float) var108 * this.field9330 + this.field9331;
                        float var111 = (float) var109 * this.field9313 + (float) var107 * this.field9322 + (float) var108 * this.field9326 + this.field9324;
                        float var112 = (float) var109 * this.field9320 + (float) var107 * this.field9325 + (float) var108 * this.field9318 + this.field9323;
                        arg3[var55] = (int) ((float) this.field9312.field5298 * var111 / (float) this.field9329) + arg2.field8579;
                        arg4[var55] = (int) ((float) this.field9312.field5290 * var112 / (float) this.field9329) + arg2.field8580;
                        arg5[var55] = (int) var110;
                    }
                }
                if (var47.field6920 != null) {
                    int var56 = super.field1042[arg0][arg1];
                    int var57 = super.field1042[arg0 + 1][arg1];
                    int var58 = super.field1042[arg0][arg1 + 1];
                    int var59 = super.field1040 * arg0;
                    int var60 = super.field1040 + var59;
                    int var61 = super.field1040 * arg1;
                    int var62 = super.field1040 + var61;
                    float var63 = (float) var61 * this.field9313 + (float) var56 * this.field9326 + (float) var59 * this.field9322 + this.field9324;
                    float var64 = (float) var61 * this.field9320 + (float) var56 * this.field9318 + (float) var59 * this.field9325 + this.field9323;
                    float var65 = (float) var61 * this.field9316 + (float) var56 * this.field9330 + (float) var59 * this.field9321 + this.field9331;
                    float var66 = (float) var61 * this.field9313 + (float) var57 * this.field9326 + (float) var60 * this.field9322 + this.field9324;
                    float var67 = (float) var61 * this.field9320 + (float) var57 * this.field9318 + (float) var60 * this.field9325 + this.field9323;
                    float var68 = (float) var61 * this.field9316 + (float) var57 * this.field9330 + (float) var60 * this.field9321 + this.field9331;
                    float var69 = (float) var62 * this.field9313 + (float) var58 * this.field9326 + (float) var59 * this.field9322 + this.field9324;
                    float var70 = (float) var62 * this.field9320 + (float) var58 * this.field9318 + (float) var59 * this.field9325 + this.field9323;
                    float var71 = (float) var62 * this.field9316 + (float) var58 * this.field9330 + (float) var59 * this.field9321 + this.field9331;
                    if (this.field9329 == -1) {
                        for (int var72 = 0; var72 < var47.field6930; ++var72) {
                            short var73 = var47.field6926[var72];
                            short var74 = var47.field6931[var72];
                            short var75 = var47.field6921[var72];
                            int var76 = arg3[var73];
                            int var77 = arg3[var74];
                            int var78 = arg3[var75];
                            int var79 = arg4[var73];
                            int var80 = arg4[var74];
                            int var81 = arg4[var75];
                            if ((var76 - var77) * (var81 - var80) - (var78 - var77) * (var79 - var80) > 0) {
                                arg2.field8584 = var76 < 0 || var77 < 0 || var78 < 0 || var76 > arg2.field8578 || var77 > arg2.field8578 || var78 > arg2.field8578;
                                short var82 = var47.field6920[var72];
                                if (var82 != -1) {
                                    if (this.method3693(this.field9312.field2768.method1500(var82, -73).field9829)) {
                                        arg2.field8590 = 100;
                                    }
                                    arg2.method3413(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], var47.field6922[var73], var47.field6922[var74], var47.field6922[var75], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, (int) var65, (int) var68, (int) var71, var82);
                                    arg2.field8590 = 0;
                                } else {
                                    int var83 = var47.field6928[var72];
                                    if (var83 != -1) {
                                        arg2.method3419(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], class649.method3702((byte) -84, var83, var47.field6922[var73]), class649.method3702((byte) -84, var83, var47.field6922[var74]), class649.method3702((byte) -84, var83, var47.field6922[var75]));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var84 = 0; var84 < var47.field6930; ++var84) {
                        short var85 = var47.field6926[var84];
                        short var86 = var47.field6931[var84];
                        short var87 = var47.field6921[var84];
                        int var88 = arg3[var85];
                        int var89 = arg3[var86];
                        int var90 = arg3[var87];
                        int var91 = arg4[var85];
                        int var92 = arg4[var86];
                        int var93 = arg4[var87];
                        if ((var88 - var89) * (var93 - var92) - (var90 - var89) * (var91 - var92) > 0) {
                            arg2.field8584 = var88 < 0 || var89 < 0 || var90 < 0 || var88 > arg2.field8578 || var89 > arg2.field8578 || var90 > arg2.field8578;
                            short var94 = var47.field6920[var84];
                            if (var94 != -1) {
                                if (this.method3693(this.field9312.field2768.method1500(var94, -18).field9829)) {
                                    arg2.field8590 = 100;
                                }
                                arg2.method3413(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], var47.field6922[var85], var47.field6922[var86], var47.field6922[var87], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, this.field9329, this.field9329, this.field9329, var94);
                                arg2.field8590 = 0;
                            } else {
                                int var95 = var47.field6928[var84];
                                if (var95 != -1) {
                                    arg2.method3419(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], class649.method3702((byte) -84, var95, var47.field6922[var85]), class649.method3702((byte) -84, var95, var47.field6922[var86]), class649.method3702((byte) -84, var95, var47.field6922[var87]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var96 = 0; var96 < var47.field6930; ++var96) {
                    short var97 = var47.field6926[var96];
                    short var98 = var47.field6931[var96];
                    short var99 = var47.field6921[var96];
                    int var100 = arg3[var97];
                    int var101 = arg3[var98];
                    int var102 = arg3[var99];
                    int var103 = arg4[var97];
                    int var104 = arg4[var98];
                    int var105 = arg4[var99];
                    if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                        int var106 = var47.field6928[var96];
                        if (var106 != -1) {
                            arg2.field8584 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg2.field8578 || var101 > arg2.field8578 || var102 > arg2.field8578;
                            arg2.method3419(var103, var104, var105, var100, var101, var102, arg5[var97], arg5[var98], arg5[var99], class649.method3702((byte) -84, var106, var47.field6922[var97]), class649.method3702((byte) -84, var106, var47.field6922[var98]), class649.method3702((byte) -84, var106, var47.field6922[var99]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ldda;IIII[[I[[II)V")
    public class647(class351 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field9312 = arg0;
        this.field9314 = arg2;
        this.field9315 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field9312.field5291 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field9312.field5281 * var18 + this.field9312.field5295 * var16 + this.field9312.field5287 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field9315[var11][var10] = (byte) var20;
            }
        }
        this.field9319 = new byte[arg3 + 1][arg4 + 1];
    }
}
