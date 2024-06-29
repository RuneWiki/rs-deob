import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class220 extends class419 {

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    private int field3222 = -1;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Lrp;")
    private class680 field3230;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    private int field3226;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "[[B")
    private byte[][] field3225;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "[[B")
    private byte[][] field3234;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "F")
    private float field3216;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "F")
    private float field3217;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "F")
    private float field3218;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "F")
    private float field3219;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "F")
    private float field3221;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "F")
    private float field3223;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "F")
    private float field3224;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "F")
    private float field3228;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "F")
    private float field3229;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "F")
    private float field3232;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "F")
    private float field3236;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "F")
    private float field3237;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "[[Lao;")
    private class536[][] field3227;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "[[Ltba;")
    private class59[][] field3235;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "[[Llc;")
    private class736[][] field3220;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "[[Lkd;")
    private class787[][] field3231;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "[[Lcba;")
    private class96[][] field3233;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Z")
    private final boolean method1512(int arg0) {
        if ((this.field3226 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method824(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method825(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class483 var9 = this.field3230.method3820(Thread.currentThread());
        class476 var10 = var9.field6644;
        var10.field6474 = 0;
        var10.field6463 = true;
        this.field3230.method91();
        if (this.field3235 == null && this.field3233 == null) {
            if (this.field3227 != null) {
                this.method1514(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field6678, var9.field6643);
            }
        } else {
            this.method1519(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field6678, var9.field6643);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method826(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field3227 == null) {
            this.field3227 = new class536[super.field5808][super.field5809];
            this.field3231 = new class787[super.field5808][super.field5809];
        } else if (this.field3235 != null || this.field3233 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field5805 != var20 || var21 != 0 && super.field5805 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class787 var22 = new class787();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field10774 = var23;
            var22.field10772 = new short[var23];
            var22.field10776 = new short[var23];
            var22.field10777 = new short[var23];
            var22.field10778 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field10772[var25] = (short) (this.field3225[arg0][arg1] - this.field3234[arg0][arg1]);
                } else if (var32 == 0 && super.field5805 == var33) {
                    var22.field10772[var25] = (short) (this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1]);
                } else if (super.field5805 == var32 && super.field5805 == var33) {
                    var22.field10772[var25] = (short) (this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1]);
                } else if (super.field5805 == var32 && var33 == 0) {
                    var22.field10772[var25] = (short) (this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1]) * var32 + (this.field3225[arg0][arg1] - this.field3234[arg0][arg1]) * (super.field5805 - var32);
                    int var35 = (this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1]) * var32 + (this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1]) * (super.field5805 - var32);
                    var22.field10772[var25] = (short) ((super.field5805 - var33) * var34 + var33 * var35 >> super.field5807 * 2);
                }
                int var36 = (arg0 << super.field5807) + var32;
                int var37 = (arg1 << super.field5807) + var33;
                var22.field10776[var25] = (short) var32;
                var22.field10778[var25] = (short) var33;
                var22.field10777[var25] = (short) (this.method2478(true, var37, var36) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field10772[var25] < 2) {
                    var22.field10772[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                int var30 = arg11[var28];
                if (var30 != -1) {
                    class719 var31 = this.field3230.field6447.method847(var30, -115);
                    if (!var31.field10029) {
                        var26 = true;
                        if (this.method1512(var31.field10031) || var31.field10028 != 0 || var31.field10038 != 0) {
                            var22.field10781 = (byte) (var22.field10781 | 4);
                        }
                    }
                }
            }
            var22.field10779 = new int[var27];
            if (arg10 != null) {
                var22.field10775 = new int[var27];
            }
            var22.field10784 = new short[var27];
            var22.field10782 = new short[var27];
            var22.field10771 = new short[var27];
            if (var26) {
                var22.field10773 = new short[var27];
                var22.field10780 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field10779[var22.field10783] = class314.method1915((byte) -111, arg9[var29]);
                    } else {
                        var22.field10779[var22.field10783] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field10775[var22.field10783] = class314.method1915((byte) 95, arg10[var29]);
                        } else {
                            var22.field10775[var22.field10783] = -1;
                        }
                    }
                    var22.field10784[var22.field10783] = (short) arg6[var29];
                    var22.field10782[var22.field10783] = (short) arg7[var29];
                    var22.field10771[var22.field10783] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field3230.field6447.method847(arg11[var29], -108).field10029) {
                            var22.field10773[var22.field10783] = (short) arg11[var29];
                            var22.field10780[var22.field10783] = (short) arg12[var29];
                        } else {
                            var22.field10773[var22.field10783] = -1;
                        }
                    }
                    ++var22.field10783;
                }
            }
            this.field3231[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class536 var38 = new class536();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field7453 = class670.method3761(class314.method1915((byte) -122, arg10[0]), (byte) -10, this.field3225[arg0][arg1] - this.field3234[arg0][arg1]);
                    if (var39 == -1) {
                        var38.field7451 = (byte) (var38.field7451 | 2);
                    }
                }
                if (super.field5801[arg0 + 1][arg1] == super.field5801[arg0][arg1] && super.field5801[arg0 + 1][arg1 + 1] == super.field5801[arg0][arg1] && super.field5801[arg0][arg1 + 1] == super.field5801[arg0][arg1]) {
                    var38.field7451 = (byte) (var38.field7451 | 1);
                }
                class719 var41 = null;
                if (var40 != -1) {
                    var41 = this.field3230.field6447.method847(var40, -94);
                }
                if (var41 != null && (var38.field7451 & 2) == 0 && !var41.field10029) {
                    var38.field7454 = (short) (this.field3225[arg0][arg1] - this.field3234[arg0][arg1]);
                    var38.field7452 = (short) (this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1]);
                    var38.field7456 = (short) (this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1]);
                    var38.field7455 = (short) (this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1]);
                    var38.field7457 = (short) var40;
                    if (this.method1512(var41.field10031) || var41.field10028 != 0 || var41.field10038 != 0) {
                        var38.field7451 = (byte) (var38.field7451 | 4);
                    }
                } else {
                    short var42 = class314.method1915((byte) 19, var39);
                    var38.field7454 = (short) class670.method3761(var42, (byte) -10, this.field3225[arg0][arg1] - this.field3234[arg0][arg1]);
                    var38.field7452 = (short) class670.method3761(var42, (byte) -10, this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1]);
                    var38.field7456 = (short) class670.method3761(var42, (byte) -10, this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1]);
                    var38.field7455 = (short) class670.method3761(var42, (byte) -10, this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1]);
                    var38.field7457 = -1;
                }
                this.field3227[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIZLtv;Ljw;[I[I[I[II)V")
    private final void method1513(int arg0, int arg1, boolean arg2, class483 arg3, class476 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class59 var11 = this.field3235[arg0][arg1];
        if (var11 != null) {
            if ((var11.field904 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field904 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field5805 * arg0;
                int var13 = super.field5805 + var12;
                int var14 = super.field5805 * arg1;
                int var15 = super.field5805 + var14;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                float var22;
                float var23;
                float var24;
                float var25;
                int var33;
                int var35;
                int var37;
                int var39;
                int var41;
                int var43;
                int var45;
                int var47;
                if ((var11.field904 & 1) != 0 && !arg2) {
                    int var20 = super.field5801[arg0][arg1];
                    float var21 = (float) var20 * this.field3232;
                    if (this.field3222 == -1) {
                        var22 = (float) var14 * this.field3217 + (float) var12 * this.field3223 + var21 + this.field3237;
                        if (var22 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var23 = (float) var14 * this.field3217 + (float) var13 * this.field3223 + var21 + this.field3237;
                        if (var23 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var24 = (float) var15 * this.field3217 + (float) var13 * this.field3223 + var21 + this.field3237;
                        if (var24 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var25 = (float) var15 * this.field3217 + (float) var12 * this.field3223 + var21 + this.field3237;
                        if (var25 <= (float) this.field3230.field9615) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field3217 + (float) var12 * this.field3223 + var21 + this.field3237;
                        var23 = (float) var14 * this.field3217 + (float) var13 * this.field3223 + var21 + this.field3237;
                        var24 = (float) var15 * this.field3217 + (float) var13 * this.field3223 + var21 + this.field3237;
                        var25 = (float) var15 * this.field3217 + (float) var12 * this.field3223 + var21 + this.field3237;
                    }
                    if (arg3.field6627) {
                        int var26 = (int) (var22 - (float) arg3.field6632);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field6632);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field6632);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field6632);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field3219;
                    float var31 = (float) var20 * this.field3229;
                    if (this.field3222 == -1) {
                        float var32 = (float) var14 * this.field3228 + (float) var12 * this.field3216 + var30 + this.field3224;
                        var33 = (int) ((float) this.field3230.field9621 * var32 / var22) + arg4.field6461;
                        float var34 = (float) var14 * this.field3221 + (float) var12 * this.field3236 + var31 + this.field3218;
                        var35 = (int) ((float) this.field3230.field9627 * var34 / var22) + arg4.field6472;
                        float var36 = (float) var14 * this.field3228 + (float) var13 * this.field3216 + var30 + this.field3224;
                        var37 = (int) ((float) this.field3230.field9621 * var36 / var23) + arg4.field6461;
                        float var38 = (float) var14 * this.field3221 + (float) var13 * this.field3236 + var31 + this.field3218;
                        var39 = (int) ((float) this.field3230.field9627 * var38 / var23) + arg4.field6472;
                        float var40 = (float) var15 * this.field3228 + (float) var13 * this.field3216 + var30 + this.field3224;
                        var41 = (int) ((float) this.field3230.field9621 * var40 / var24) + arg4.field6461;
                        float var42 = (float) var15 * this.field3221 + (float) var13 * this.field3236 + var31 + this.field3218;
                        var43 = (int) ((float) this.field3230.field9627 * var42 / var24) + arg4.field6472;
                        float var44 = (float) var15 * this.field3228 + (float) var12 * this.field3216 + var30 + this.field3224;
                        var45 = (int) ((float) this.field3230.field9621 * var44 / var25) + arg4.field6461;
                        float var46 = (float) var15 * this.field3221 + (float) var12 * this.field3236 + var31 + this.field3218;
                        var47 = (int) ((float) this.field3230.field9627 * var46 / var25) + arg4.field6472;
                    } else {
                        float var48 = (float) var14 * this.field3228 + (float) var12 * this.field3216 + var30 + this.field3224;
                        var33 = (int) ((float) this.field3230.field9621 * var48 / (float) this.field3222) + arg4.field6461;
                        float var49 = (float) var14 * this.field3221 + (float) var12 * this.field3236 + var31 + this.field3218;
                        var35 = (int) ((float) this.field3230.field9627 * var49 / (float) this.field3222) + arg4.field6472;
                        float var50 = (float) var14 * this.field3228 + (float) var13 * this.field3216 + var30 + this.field3224;
                        var37 = (int) ((float) this.field3230.field9621 * var50 / (float) this.field3222) + arg4.field6461;
                        float var51 = (float) var14 * this.field3221 + (float) var13 * this.field3236 + var31 + this.field3218;
                        var39 = (int) ((float) this.field3230.field9627 * var51 / (float) this.field3222) + arg4.field6472;
                        float var52 = (float) var15 * this.field3228 + (float) var13 * this.field3216 + var30 + this.field3224;
                        var41 = (int) ((float) this.field3230.field9621 * var52 / (float) this.field3222) + arg4.field6461;
                        float var53 = (float) var15 * this.field3221 + (float) var13 * this.field3236 + var31 + this.field3218;
                        var43 = (int) ((float) this.field3230.field9627 * var53 / (float) this.field3222) + arg4.field6472;
                        float var54 = (float) var15 * this.field3228 + (float) var12 * this.field3216 + var30 + this.field3224;
                        var45 = (int) ((float) this.field3230.field9621 * var54 / (float) this.field3222) + arg4.field6461;
                        float var55 = (float) var15 * this.field3221 + (float) var12 * this.field3236 + var31 + this.field3218;
                        var47 = (int) ((float) this.field3230.field9627 * var55 / (float) this.field3222) + arg4.field6472;
                    }
                } else {
                    int var56 = super.field5801[arg0][arg1];
                    int var57 = super.field5801[arg0 + 1][arg1];
                    int var58 = super.field5801[arg0 + 1][arg1 + 1];
                    int var59 = super.field5801[arg0][arg1 + 1];
                    if (this.field3222 == -1) {
                        var22 = (float) var14 * this.field3217 + (float) var12 * this.field3223 + (float) var56 * this.field3232 + this.field3237;
                        if (var22 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var23 = (float) var14 * this.field3217 + (float) var13 * this.field3223 + (float) var57 * this.field3232 + this.field3237;
                        if (var23 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var24 = (float) var15 * this.field3217 + (float) var13 * this.field3223 + (float) var58 * this.field3232 + this.field3237;
                        if (var24 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var25 = (float) var15 * this.field3217 + (float) var12 * this.field3223 + (float) var59 * this.field3232 + this.field3237;
                        if (var25 <= (float) this.field3230.field9615) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field3217 + (float) var12 * this.field3223 + (float) var56 * this.field3232 + this.field3237;
                        var23 = (float) var14 * this.field3217 + (float) var13 * this.field3223 + (float) var57 * this.field3232 + this.field3237;
                        var24 = (float) var15 * this.field3217 + (float) var13 * this.field3223 + (float) var58 * this.field3232 + this.field3237;
                        var25 = (float) var15 * this.field3217 + (float) var12 * this.field3223 + (float) var59 * this.field3232 + this.field3237;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field6632);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field900 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field6632);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field909 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field6632);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field908 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field6632);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field906 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field6627) {
                        int var68 = (int) (var22 - (float) arg3.field6632);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field6632);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field6632);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field6632);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field3222 == -1) {
                        float var72 = (float) var14 * this.field3228 + (float) var12 * this.field3216 + (float) var56 * this.field3219 + this.field3224;
                        var33 = (int) ((float) this.field3230.field9621 * var72 / var22) + arg4.field6461;
                        float var73 = (float) var14 * this.field3221 + (float) var12 * this.field3236 + (float) var56 * this.field3229 + this.field3218;
                        var35 = (int) ((float) this.field3230.field9627 * var73 / var22) + arg4.field6472;
                        float var74 = (float) var14 * this.field3228 + (float) var13 * this.field3216 + (float) var57 * this.field3219 + this.field3224;
                        var37 = (int) ((float) this.field3230.field9621 * var74 / var23) + arg4.field6461;
                        float var75 = (float) var14 * this.field3221 + (float) var13 * this.field3236 + (float) var57 * this.field3229 + this.field3218;
                        var39 = (int) ((float) this.field3230.field9627 * var75 / var23) + arg4.field6472;
                        float var76 = (float) var15 * this.field3228 + (float) var13 * this.field3216 + (float) var58 * this.field3219 + this.field3224;
                        var41 = (int) ((float) this.field3230.field9621 * var76 / var24) + arg4.field6461;
                        float var77 = (float) var15 * this.field3221 + (float) var13 * this.field3236 + (float) var58 * this.field3229 + this.field3218;
                        var43 = (int) ((float) this.field3230.field9627 * var77 / var24) + arg4.field6472;
                        float var78 = (float) var15 * this.field3228 + (float) var12 * this.field3216 + (float) var59 * this.field3219 + this.field3224;
                        var45 = (int) ((float) this.field3230.field9621 * var78 / var25) + arg4.field6461;
                        float var79 = (float) var15 * this.field3221 + (float) var12 * this.field3236 + (float) var59 * this.field3229 + this.field3218;
                        var47 = (int) ((float) this.field3230.field9627 * var79 / var25) + arg4.field6472;
                    } else {
                        float var80 = (float) var14 * this.field3228 + (float) var12 * this.field3216 + (float) var56 * this.field3219 + this.field3224;
                        var33 = (int) ((float) this.field3230.field9621 * var80 / (float) this.field3222) + arg4.field6461;
                        float var81 = (float) var14 * this.field3221 + (float) var12 * this.field3236 + (float) var56 * this.field3229 + this.field3218;
                        var35 = (int) ((float) this.field3230.field9627 * var81 / (float) this.field3222) + arg4.field6472;
                        float var82 = (float) var14 * this.field3228 + (float) var13 * this.field3216 + (float) var57 * this.field3219 + this.field3224;
                        var37 = (int) ((float) this.field3230.field9621 * var82 / (float) this.field3222) + arg4.field6461;
                        float var83 = (float) var14 * this.field3221 + (float) var13 * this.field3236 + (float) var57 * this.field3229 + this.field3218;
                        var39 = (int) ((float) this.field3230.field9627 * var83 / (float) this.field3222) + arg4.field6472;
                        float var84 = (float) var15 * this.field3228 + (float) var13 * this.field3216 + (float) var58 * this.field3219 + this.field3224;
                        var41 = (int) ((float) this.field3230.field9621 * var84 / (float) this.field3222) + arg4.field6461;
                        float var85 = (float) var15 * this.field3221 + (float) var13 * this.field3236 + (float) var58 * this.field3229 + this.field3218;
                        var43 = (int) ((float) this.field3230.field9627 * var85 / (float) this.field3222) + arg4.field6472;
                        float var86 = (float) var15 * this.field3228 + (float) var12 * this.field3216 + (float) var59 * this.field3219 + this.field3224;
                        var45 = (int) ((float) this.field3230.field9621 * var86 / (float) this.field3222) + arg4.field6461;
                        float var87 = (float) var15 * this.field3221 + (float) var12 * this.field3236 + (float) var59 * this.field3229 + this.field3218;
                        var47 = (int) ((float) this.field3230.field9627 * var87 / (float) this.field3222) + arg4.field6472;
                    }
                }
                boolean var88 = var11.field901 != -1 && this.method1512(this.field3230.field6447.method847(var11.field901, -128).field10031);
                if (this.field3222 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field6463 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field6464 || var45 > arg4.field6464 || var37 > arg4.field6464;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field901 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method2780((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field907 & 16777215, var90 | var11.field899 & 16777215, var90 | var11.field903 & 16777215, arg3.field6633, var18, var19, var17, var11.field901);
                                } else {
                                    if (var88) {
                                        arg4.field6474 = 100;
                                    }
                                    arg4.method2789((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class163.method1233(var18 << 24 | arg3.field6633, var11.field907, (byte) 80), class163.method1233(var19 << 24 | arg3.field6633, var11.field899, (byte) 75), class163.method1233(var17 << 24 | arg3.field6633, var11.field903, (byte) 91));
                                    arg4.field6474 = 0;
                                }
                            } else if (var11.field901 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method2780((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field907 & 16777215, var91 | var11.field899 & 16777215, var91 | var11.field903 & 16777215, 0, 0, 0, 0, var11.field901);
                            } else {
                                if (var88) {
                                    arg4.field6474 = 100;
                                }
                                arg4.method2789((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field907, var11.field899, var11.field903);
                                arg4.field6474 = 0;
                            }
                        } else {
                            arg4.method2790((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field6633);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field6463 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field6464 || var37 > arg4.field6464 || var45 > arg4.field6464;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field6474 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field901 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method2780((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field905 & 16777215, var93 | var11.field903 & 16777215, var93 | var11.field899 & 16777215, arg3.field6633, var16, var17, var19, var11.field901);
                                    return;
                                }
                                if (var88) {
                                    arg4.field6474 = 100;
                                }
                                arg4.method2789((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class163.method1233(var16 << 24 | arg3.field6633, var11.field905, (byte) 76), class163.method1233(var17 << 24 | arg3.field6633, var11.field903, (byte) 79), class163.method1233(var19 << 24 | arg3.field6633, var11.field899, (byte) 74));
                                arg4.field6474 = 0;
                                return;
                            }
                            if (var11.field901 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method2780((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field905 & 16777215, var94 | var11.field903 & 16777215, var94 | var11.field899 & 16777215, 0, 0, 0, 0, var11.field901);
                                return;
                            }
                            if (var88) {
                                arg4.field6474 = 100;
                            }
                            arg4.method2789((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field905, var11.field903, var11.field899);
                            arg4.field6474 = 0;
                            return;
                        }
                        arg4.method2790((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field6633);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field6463 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field6464 || var45 > arg4.field6464 || var37 > arg4.field6464;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field6474 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field901 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method2780((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field907 & 16777215, var96 | var11.field899 & 16777215, var96 | var11.field903 & 16777215, arg3.field6633, var18, var19, var17, var11.field901);
                                } else {
                                    if (var88) {
                                        arg4.field6474 = 100;
                                    }
                                    arg4.method2789((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class163.method1233(var18 << 24 | arg3.field6633, var11.field907, (byte) 119), class163.method1233(var19 << 24 | arg3.field6633, var11.field899, (byte) 101), class163.method1233(var17 << 24 | arg3.field6633, var11.field903, (byte) 113));
                                    arg4.field6474 = 0;
                                }
                            } else if (var11.field901 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method2780((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field907 & 16777215, var97 | var11.field899 & 16777215, var97 | var11.field903 & 16777215, 0, 0, 0, 0, var11.field901);
                            } else {
                                if (var88) {
                                    arg4.field6474 = 100;
                                }
                                arg4.method2789((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field907, var11.field899, var11.field903);
                                arg4.field6474 = 0;
                            }
                        } else {
                            arg4.method2790((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field6633);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field6463 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field6464 || var37 > arg4.field6464 || var45 > arg4.field6464;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field6474 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field901 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method2780((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field905 & 16777215, var99 | var11.field903 & 16777215, var99 | var11.field899 & 16777215, arg3.field6633, var16, var17, var19, var11.field901);
                                    return;
                                }
                                if (var88) {
                                    arg4.field6474 = 100;
                                }
                                arg4.method2789((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class163.method1233(var16 << 24 | arg3.field6633, var11.field905, (byte) 125), class163.method1233(var17 << 24 | arg3.field6633, var11.field903, (byte) 119), class163.method1233(var19 << 24 | arg3.field6633, var11.field899, (byte) 85));
                                arg4.field6474 = 0;
                                return;
                            }
                            if (var11.field901 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method2780((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field905 & 16777215, var100 | var11.field903 & 16777215, var100 | var11.field899 & 16777215, 0, 0, 0, 0, var11.field901);
                                return;
                            }
                            if (var88) {
                                arg4.field6474 = 100;
                            }
                            arg4.method2789((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field905, var11.field903, var11.field899);
                            arg4.field6474 = 0;
                            return;
                        }
                        arg4.method2790((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field6633);
                    }
                }
            }
        } else {
            class736 var101 = this.field3220[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field10220 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field3222 == -1) {
                    for (int var102 = 0; var102 < var101.field10219; ++var102) {
                        int var103 = (arg0 << super.field5807) + var101.field10216[var102];
                        int var104 = var101.field10212[var102];
                        int var105 = (arg1 << super.field5807) + var101.field10215[var102];
                        float var106 = (float) var105 * this.field3217 + (float) var103 * this.field3223 + (float) var104 * this.field3232 + this.field3237;
                        if (var106 <= (float) this.field3230.field9615) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field6632);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field10213[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field6627) {
                            int var109 = (int) (var106 - (float) arg3.field6632);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field3228 + (float) var103 * this.field3216 + (float) var104 * this.field3219 + this.field3224;
                        float var111 = (float) var105 * this.field3221 + (float) var103 * this.field3236 + (float) var104 * this.field3229 + this.field3218;
                        arg5[var102] = (int) ((float) this.field3230.field9621 * var110 / var106) + arg4.field6461;
                        arg6[var102] = (int) ((float) this.field3230.field9627 * var111 / var106) + arg4.field6472;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field10219; ++var112) {
                        int var152 = (arg0 << super.field5807) + var101.field10216[var112];
                        int var153 = var101.field10212[var112];
                        int var154 = (arg1 << super.field5807) + var101.field10215[var112];
                        float var155 = (float) var154 * this.field3217 + (float) var152 * this.field3223 + (float) var153 * this.field3232 + this.field3237;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field3222 - arg3.field6632;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field10213[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field6627) {
                            int var158 = this.field3222 - arg3.field6632;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field3228 + (float) var152 * this.field3216 + (float) var153 * this.field3219 + this.field3224;
                        float var160 = (float) var154 * this.field3221 + (float) var152 * this.field3236 + (float) var153 * this.field3229 + this.field3218;
                        arg5[var112] = (int) ((float) this.field3230.field9621 * var159 / (float) this.field3222) + arg4.field6461;
                        arg6[var112] = (int) ((float) this.field3230.field9627 * var160 / (float) this.field3222) + arg4.field6472;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field10217 != null) {
                    if (this.field3222 == -1) {
                        for (int var113 = 0; var113 < var101.field10214; ++var113) {
                            int var114 = var113 * 3;
                            int var115 = var114 + 1;
                            int var116 = var115 + 1;
                            int var117 = arg5[var114];
                            int var118 = arg5[var115];
                            int var119 = arg5[var116];
                            int var120 = arg6[var114];
                            int var121 = arg6[var115];
                            int var122 = arg6[var116];
                            int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                            if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                                arg4.field6463 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field6464 || var118 > arg4.field6464 || var119 > arg4.field6464;
                                short var124 = var101.field10217[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method1512(this.field3230.field6447.method847(var124, -117).field10031)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method2780((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field10216[var114] / (float) super.field5805, (float) var101.field10216[var115] / (float) super.field5805, (float) var101.field10216[var116] / (float) super.field5805, (float) var101.field10215[var114] / (float) super.field5805, (float) var101.field10215[var115] / (float) super.field5805, (float) var101.field10215[var116] / (float) super.field5805, var125 | var101.field10218[var114] & 16777215, var125 | var101.field10218[var115] & 16777215, var125 | var101.field10218[var116] & 16777215, arg3.field6633, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field10218[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method1512(this.field3230.field6447.method847(var124, -108).field10031)) {
                                                arg4.field6474 = -1694498816;
                                            }
                                            arg4.method2789((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class163.method1233(arg8[var114] << 24 | arg3.field6633, var101.field10218[var114], (byte) 121), class163.method1233(arg8[var115] << 24 | arg3.field6633, var101.field10218[var115], (byte) 83), class163.method1233(arg8[var116] << 24 | arg3.field6633, var101.field10218[var116], (byte) 123));
                                            arg4.field6474 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method1512(this.field3230.field6447.method847(var124, -91).field10031)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method2780((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field10216[var114] / (float) super.field5805, (float) var101.field10216[var115] / (float) super.field5805, (float) var101.field10216[var116] / (float) super.field5805, (float) var101.field10215[var114] / (float) super.field5805, (float) var101.field10215[var115] / (float) super.field5805, (float) var101.field10215[var116] / (float) super.field5805, var126 | var101.field10218[var114] & 16777215, var126 | var101.field10218[var115] & 16777215, var126 | var101.field10218[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field10218[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method1512(this.field3230.field6447.method847(var124, -107).field10031)) {
                                            arg4.field6474 = -1694498816;
                                        }
                                        arg4.method2789((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field10218[var114], var101.field10218[var115], var101.field10218[var116]);
                                        arg4.field6474 = 0;
                                    }
                                } else {
                                    arg4.method2790((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field6633);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field10214; ++var127) {
                        int var128 = var127 * 3;
                        int var129 = var128 + 1;
                        int var130 = var129 + 1;
                        int var131 = arg5[var128];
                        int var132 = arg5[var129];
                        int var133 = arg5[var130];
                        int var134 = arg6[var128];
                        int var135 = arg6[var129];
                        int var136 = arg6[var130];
                        int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                        if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                            arg4.field6463 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field6464 || var132 > arg4.field6464 || var133 > arg4.field6464;
                            short var138 = var101.field10217[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method1512(this.field3230.field6447.method847(var138, -113).field10031)) {
                                    arg4.field6474 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method1512(this.field3230.field6447.method847(var138, -95).field10031)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method2780((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field10216[var128] / (float) super.field5805, (float) var101.field10216[var129] / (float) super.field5805, (float) var101.field10216[var130] / (float) super.field5805, (float) var101.field10215[var128] / (float) super.field5805, (float) var101.field10215[var129] / (float) super.field5805, (float) var101.field10215[var130] / (float) super.field5805, var139 | var101.field10218[var128] & 16777215, var139 | var101.field10218[var129] & 16777215, var139 | var101.field10218[var130] & 16777215, arg3.field6633, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field10218[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method1512(this.field3230.field6447.method847(var138, -119).field10031)) {
                                            arg4.field6474 = -1694498816;
                                        }
                                        arg4.method2789((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class163.method1233(arg8[var128] << 24 | arg3.field6633, var101.field10218[var128], (byte) 115), class163.method1233(arg8[var129] << 24 | arg3.field6633, var101.field10218[var129], (byte) 84), class163.method1233(arg8[var130] << 24 | arg3.field6633, var101.field10218[var130], (byte) 113));
                                        arg4.field6474 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method1512(this.field3230.field6447.method847(var138, -108).field10031)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method2780((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field10216[var128] / (float) super.field5805, (float) var101.field10216[var129] / (float) super.field5805, (float) var101.field10216[var130] / (float) super.field5805, (float) var101.field10215[var128] / (float) super.field5805, (float) var101.field10215[var129] / (float) super.field5805, (float) var101.field10215[var130] / (float) super.field5805, var140 | var101.field10218[var128] & 16777215, var140 | var101.field10218[var129] & 16777215, var140 | var101.field10218[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field10218[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method1512(this.field3230.field6447.method847(var138, -128).field10031)) {
                                        arg4.field6474 = -1694498816;
                                    }
                                    arg4.method2789((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field10218[var128], var101.field10218[var129], var101.field10218[var130]);
                                    arg4.field6474 = 0;
                                }
                                arg4.field6474 = 0;
                            } else {
                                arg4.method2790((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field6633);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field10214; ++var141) {
                    int var142 = var141 * 3;
                    int var143 = var142 + 1;
                    int var144 = var143 + 1;
                    int var145 = arg5[var142];
                    int var146 = arg5[var143];
                    int var147 = arg5[var144];
                    int var148 = arg6[var142];
                    int var149 = arg6[var143];
                    int var150 = arg6[var144];
                    int var151 = arg8[var142] + arg8[var143] + arg8[var144];
                    if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                        arg4.field6463 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field6464 || var146 > arg4.field6464 || var147 > arg4.field6464;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field10218[var142] & 16777215) != 0) {
                                    arg4.method2789((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class509.method2973((byte) 28, arg3.field6633, arg8[var142], var101.field10218[var142]), class509.method2973((byte) 28, arg3.field6633, arg8[var143], var101.field10218[var143]), class509.method2973((byte) 28, arg3.field6633, arg8[var144], var101.field10218[var144]));
                                }
                            } else if ((var101.field10218[var142] & 16777215) != 0) {
                                arg4.method2789((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field10218[var142], var101.field10218[var143], var101.field10218[var144]);
                            }
                        } else {
                            arg4.method2790((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field6633);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III[[ZZI)V")
    public final void method816(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class532 var7 = this.field3230.field9617;
        this.field3222 = -1;
        this.field3216 = var7.field7430;
        this.field3219 = var7.field7401;
        this.field3228 = var7.field7412;
        this.field3224 = var7.field7415;
        this.field3236 = var7.field7427;
        this.field3229 = var7.field7429;
        this.field3221 = var7.field7410;
        this.field3218 = var7.field7421;
        this.field3223 = var7.field7403;
        this.field3232 = var7.field7402;
        this.field3217 = var7.field7407;
        this.field3237 = var7.field7428;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field5808 && var11 >= 0 && var11 < super.field5809) {
                        this.method1518(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III[[ZZII)V")
    public final void method817(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class532 var8 = this.field3230.field9617;
        this.field3222 = arg5;
        this.field3216 = var8.field7430;
        this.field3219 = var8.field7401;
        this.field3228 = var8.field7412;
        this.field3224 = var8.field7415;
        this.field3236 = var8.field7427;
        this.field3229 = var8.field7429;
        this.field3221 = var8.field7410;
        this.field3218 = var8.field7421;
        this.field3223 = var8.field7403;
        this.field3232 = var8.field7402;
        this.field3217 = var8.field7407;
        this.field3237 = var8.field7428;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field5808 && var12 >= 0 && var12 < super.field5809) {
                        this.method1518(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method828(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field3226 & 32) == 0;
        if (this.field3235 == null && !var15) {
            this.field3235 = new class59[super.field5808][super.field5809];
            this.field3220 = new class736[super.field5808][super.field5809];
        } else if (this.field3233 == null && var15) {
            this.field3233 = new class96[super.field5808][super.field5809];
        } else if (this.field3227 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class621.field8768[class314.method1915((byte) 69, arg6[var16]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class621.field8768[class314.method1915((byte) -124, arg7[var17]) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class96 var18 = new class96();
                var18.field1373 = (short) arg2.length;
                var18.field1363 = (short) (arg2.length / 3);
                var18.field1368 = new short[var18.field1373];
                var18.field1365 = new short[var18.field1373];
                var18.field1369 = new short[var18.field1373];
                var18.field1370 = new int[var18.field1373];
                var18.field1364 = new short[var18.field1373];
                var18.field1366 = new short[var18.field1373];
                var18.field1372 = new byte[var18.field1373];
                if (arg5 != null) {
                    var18.field1371 = new short[var18.field1373];
                }
                for (int var19 = 0; var19 < var18.field1373; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field3225[arg0][arg1] - this.field3234[arg0][arg1];
                    } else if (var22 == 0 && super.field5805 == var23) {
                        var25 = this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1];
                    } else if (super.field5805 == var22 && super.field5805 == var23) {
                        var25 = this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1];
                    } else if (super.field5805 == var22 && var23 == 0) {
                        var25 = this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1]) * var22 + (this.field3225[arg0][arg1] - this.field3234[arg0][arg1]) * (super.field5805 - var22);
                        int var27 = (this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1]) * var22 + (this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1]) * (super.field5805 - var22);
                        var25 = (super.field5805 - var23) * var26 + var23 * var27 >> super.field5807 * 2;
                    }
                    int var28 = (arg0 << super.field5807) + var22;
                    int var29 = (arg1 << super.field5807) + var23;
                    var18.field1368[var19] = (short) var22;
                    var18.field1369[var19] = (short) var23;
                    var18.field1365[var19] = (short) (this.method2478(true, var29, var28) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field1370[var19] = 0;
                        if (arg7 != null) {
                            var18.field1372[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field1371[var19] = (short) arg5[var19];
                            if (arg11 != 0) {
                                var30 = var31 * 255 / arg11;
                                if (var30 < 0) {
                                    var30 = 0;
                                } else if (var30 > 255) {
                                    var30 = 255;
                                }
                            }
                        }
                        int var32 = -16777216;
                        if (arg8[var19] != -1 && this.method1512(this.field3230.field6447.method847(arg8[var19], -127).field10031)) {
                            var32 = -1694498816;
                        }
                        var18.field1370[var19] = var32 | class509.method2973((byte) 28, arg10, var30, method1515(arg6[var19] >> 8, var25));
                        if (arg7 != null) {
                            var18.field1372[var19] = (byte) var25;
                        }
                    }
                    var18.field1364[var19] = (short) arg8[var19];
                    var18.field1366[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field1367 = new int[var18.field1363];
                }
                for (int var20 = 0; var20 < var18.field1363; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field1367[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field3233[arg0][arg1] = var18;
            } else {
                boolean var33 = true;
                int var34 = -1;
                int var35 = -1;
                int var36 = -1;
                int var37 = -1;
                if (arg2.length == 6) {
                    for (int var38 = 0; var38 < 6; ++var38) {
                        if (arg2[var38] == 0 && arg4[var38] == 0) {
                            if (var34 != -1 && arg6[var34] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var34 = var38;
                        } else if (arg2[var38] == super.field5805 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field5805 && arg4[var38] == super.field5805) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field5805) {
                            if (var37 != -1 && arg6[var37] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var37 = var38;
                        }
                    }
                    if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                        var33 = false;
                    }
                    if (var33) {
                        if (arg3 != null) {
                            for (int var39 = 0; var39 < 4; ++var39) {
                                if (arg3[var39] != 0) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                        if (var33) {
                            for (int var40 = 1; var40 < 4; ++var40) {
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field5805 != arg2[var40] && arg2[0] - super.field5805 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field5805 != arg4[var40] && arg4[0] - super.field5805 != arg4[var40]) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    var33 = false;
                }
                if (var33) {
                    class59 var41 = new class59();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field902 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field904 = (byte) (var41.field904 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field5801[arg0 + 1][arg1] == super.field5801[arg0][arg1] && super.field5801[arg0 + 1][arg1 + 1] == super.field5801[arg0][arg1] && super.field5801[arg0][arg1 + 1] == super.field5801[arg0][arg1]) {
                        var41.field904 = (byte) (var41.field904 | 1);
                    }
                    if (var43 != -1 && (var41.field904 & 2) == 0 && !this.field3230.field6447.method847(var43, -109).field10029) {
                        int var44;
                        if (arg5 != null && arg11 != 0) {
                            var44 = arg5[var34] * 255 / arg11;
                            if (var44 < 0) {
                                var44 = 0;
                            } else if (var44 > 255) {
                                var44 = 255;
                            }
                        } else {
                            var44 = 0;
                        }
                        var41.field905 = class509.method2973((byte) 28, arg10, var44, method1515(arg6[var34] >> 8, this.field3225[arg0][arg1] - this.field3234[arg0][arg1]));
                        if (var41.field902 != 0) {
                            var41.field905 |= 255 - (this.field3225[arg0][arg1] - this.field3234[arg0][arg1]) << 25;
                        }
                        int var45;
                        if (arg5 != null && arg11 != 0) {
                            var45 = arg5[var35] * 255 / arg11;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                        } else {
                            var45 = 0;
                        }
                        var41.field903 = class509.method2973((byte) 28, arg10, var45, method1515(arg6[var35] >> 8, this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1]));
                        if (var41.field902 != 0) {
                            var41.field903 |= 255 - (this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1]) << 25;
                        }
                        int var46;
                        if (arg5 != null && arg11 != 0) {
                            var46 = arg5[var36] * 255 / arg11;
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 > 255) {
                                var46 = 255;
                            }
                        } else {
                            var46 = 0;
                        }
                        var41.field907 = class509.method2973((byte) 28, arg10, var46, method1515(arg6[var36] >> 8, this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1]));
                        if (var41.field902 != 0) {
                            var41.field907 |= 255 - (this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var47;
                        if (arg5 != null && arg11 != 0) {
                            var47 = arg5[var37] * 255 / arg11;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 > 255) {
                                var47 = 255;
                            }
                        } else {
                            var47 = 0;
                        }
                        var41.field899 = class509.method2973((byte) 28, arg10, var47, method1515(arg6[var37] >> 8, this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1]));
                        var41.field901 = (short) var43;
                    } else {
                        int var48;
                        if (arg5 != null && arg11 != 0) {
                            var48 = arg5[var34] * 255 / arg11;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 > 255) {
                                var48 = 255;
                            }
                        } else {
                            var48 = 0;
                        }
                        var41.field905 = class509.method2973((byte) 28, arg10, var48, method1515(arg6[var34] >> 8, this.field3225[arg0][arg1] - this.field3234[arg0][arg1]));
                        if (var41.field902 != 0) {
                            var41.field905 |= 255 - (this.field3225[arg0][arg1] - this.field3234[arg0][arg1]) << 25;
                        }
                        int var49;
                        if (arg5 != null && arg11 != 0) {
                            var49 = arg5[var35] * 255 / arg11;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 > 255) {
                                var49 = 255;
                            }
                        } else {
                            var49 = 0;
                        }
                        var41.field903 = class509.method2973((byte) 28, arg10, var49, method1515(arg6[var35] >> 8, this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1]));
                        if (var41.field902 != 0) {
                            var41.field903 |= 255 - (this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1]) << 25;
                        }
                        int var50;
                        if (arg5 != null && arg11 != 0) {
                            var50 = arg5[var36] * 255 / arg11;
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 255) {
                                var50 = 255;
                            }
                        } else {
                            var50 = 0;
                        }
                        var41.field907 = class509.method2973((byte) 28, arg10, var50, method1515(arg6[var36] >> 8, this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1]));
                        if (var41.field902 != 0) {
                            var41.field907 |= 255 - (this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var51;
                        if (arg5 != null && arg11 != 0) {
                            var51 = arg5[var37] * 255 / arg11;
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 > 255) {
                                var51 = 255;
                            }
                        } else {
                            var51 = 0;
                        }
                        var41.field899 = class509.method2973((byte) 28, arg10, var51, method1515(arg6[var37] >> 8, this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1]));
                        if (var41.field902 != 0) {
                            var41.field899 |= 255 - (this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1]) << 25;
                        }
                        var41.field901 = -1;
                    }
                    if (arg5 != null) {
                        var41.field908 = (short) arg5[var36];
                        var41.field906 = (short) arg5[var37];
                        var41.field909 = (short) arg5[var35];
                        var41.field900 = (short) arg5[var34];
                    }
                    this.field3235[arg0][arg1] = var41;
                } else {
                    class736 var52 = new class736();
                    var52.field10219 = (short) arg2.length;
                    var52.field10214 = (short) (arg2.length / 3);
                    var52.field10216 = new short[var52.field10219];
                    var52.field10212 = new short[var52.field10219];
                    var52.field10215 = new short[var52.field10219];
                    var52.field10218 = new int[var52.field10219];
                    if (arg5 != null) {
                        var52.field10213 = new short[var52.field10219];
                    }
                    for (int var53 = 0; var53 < var52.field10219; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field3225[arg0][arg1] - this.field3234[arg0][arg1];
                        } else if (var68 == 0 && super.field5805 == var69) {
                            var71 = this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1];
                        } else if (super.field5805 == var68 && super.field5805 == var69) {
                            var71 = this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1];
                        } else if (super.field5805 == var68 && var69 == 0) {
                            var71 = this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field3225[arg0 + 1][arg1] - this.field3234[arg0 + 1][arg1]) * var68 + (this.field3225[arg0][arg1] - this.field3234[arg0][arg1]) * (super.field5805 - var68);
                            int var73 = (this.field3225[arg0 + 1][arg1 + 1] - this.field3234[arg0 + 1][arg1 + 1]) * var68 + (this.field3225[arg0][arg1 + 1] - this.field3234[arg0][arg1 + 1]) * (super.field5805 - var68);
                            var71 = (super.field5805 - var69) * var72 + var69 * var73 >> super.field5807 * 2;
                        }
                        int var74 = (arg0 << super.field5807) + var68;
                        int var75 = (arg1 << super.field5807) + var69;
                        var52.field10216[var53] = (short) var68;
                        var52.field10215[var53] = (short) var69;
                        var52.field10212[var53] = (short) (this.method2478(true, var75, var74) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field10218[var53] = var71 << 25;
                            } else {
                                var52.field10218[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field10213[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field10218[var53] = class509.method2973((byte) 28, arg10, var76, method1515(arg6[var53] >> 8, var71));
                            if (arg7 != null) {
                                var52.field10218[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field10214; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field3230.field6447.method847(arg8[var55 * 3], -106).field10029) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field10210 = new int[var52.field10214];
                    }
                    if (var54) {
                        var52.field10217 = new short[var52.field10214];
                        var52.field10211 = new short[var52.field10214];
                    }
                    for (int var56 = 0; var56 < var52.field10214; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field10210[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field3230.field6447.method847(var62, -106).field10029) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field3230.field6447.method847(var63, -92).field10029) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field3230.field6447.method847(var64, -118).field10029) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field10217[var56] = (short) var64;
                                var52.field10211[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field3230.field6447.method847(var65, -128).field10029) {
                                        var52.field10218[var57] = class621.field8768[class314.method1915((byte) -121, this.field3230.field6447.method847(var65, -108).field10035 & 65535) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field3230.field6447.method847(var66, -110).field10029) {
                                        var52.field10218[var58] = class621.field8768[class314.method1915((byte) 114, this.field3230.field6447.method847(var66, -108).field10035 & 65535) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field3230.field6447.method847(var67, -94).field10029) {
                                        var52.field10218[var59] = class621.field8768[class314.method1915((byte) -105, this.field3230.field6447.method847(var67, -122).field10035 & 65535) & 65535];
                                    }
                                }
                                var52.field10217[var56] = -1;
                            }
                        }
                    }
                    this.field3220[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII[[ZLtv;Ljw;[I[I)V")
    private final void method1514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class483 arg8, class476 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field6640;
        this.field3230.method513(false);
        arg9.field6475 = false;
        arg9.field6465 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field3227[var18][var19] != null) {
                        class536 var20 = this.field3227[var18][var19];
                        if (var20.field7457 != -1 && (var20.field7451 & 2) == 0 && var20.field7453 == -1) {
                            int var21 = this.field3230.method3827(var20.field7457);
                            arg9.method2788((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class670.method3761(var21, (byte) -10, var20.field7456 & 65535), (float) class670.method3761(var21, (byte) -10, var20.field7455 & 65535), (float) class670.method3761(var21, (byte) -10, var20.field7452 & 65535));
                            arg9.method2788((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class670.method3761(var21, (byte) -10, var20.field7454 & 65535), (float) class670.method3761(var21, (byte) -10, var20.field7452 & 65535), (float) class670.method3761(var21, (byte) -10, var20.field7455 & 65535));
                        } else if (var20.field7453 == -1) {
                            arg9.method2788((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field7456 & 65535), (float) (var20.field7455 & 65535), (float) (var20.field7452 & 65535));
                            arg9.method2788((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field7454 & 65535), (float) (var20.field7452 & 65535), (float) (var20.field7455 & 65535));
                        } else {
                            int var22 = var20.field7453;
                            arg9.method2788((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method2788((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field3231[var18][var19] != null) {
                        class787 var23 = this.field3231[var18][var19];
                        for (int var24 = 0; var24 < var23.field10774; ++var24) {
                            arg10[var24] = var23.field10776[var24] * var14 / super.field5805 + var16;
                            arg11[var24] = var17 - var23.field10778[var24] * var14 / super.field5805;
                        }
                        for (int var25 = 0; var25 < var23.field10783; ++var25) {
                            short var26 = var23.field10784[var25];
                            short var27 = var23.field10782[var25];
                            short var28 = var23.field10771[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field10775 != null && var23.field10775[var25] != -1) {
                                int var35 = var23.field10775[var25];
                                arg9.method2788((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class670.method3761(var35, (byte) -10, var23.field10772[var26]), (float) class670.method3761(var35, (byte) -10, var23.field10772[var27]), (float) class670.method3761(var35, (byte) -10, var23.field10772[var28]));
                            } else if (var23.field10773 != null && var23.field10773[var25] != -1) {
                                int var36 = this.field3230.method3827(var23.field10773[var25]);
                                arg9.method2788((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class670.method3761(var36, (byte) -10, var23.field10772[var26]), (float) class670.method3761(var36, (byte) -10, var23.field10772[var27]), (float) class670.method3761(var36, (byte) -10, var23.field10772[var28]));
                            } else {
                                int var37 = var23.field10779[var25];
                                arg9.method2788((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class670.method3761(var37, (byte) -10, var23.field10772[var26]), (float) class670.method3761(var37, (byte) -10, var23.field10772[var27]), (float) class670.method3761(var37, (byte) -10, var23.field10772[var28]));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field6475 = true;
        this.field3230.method513(var15);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)I")
    private static final int method1515(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIZLtv;Ljw;[I[I[I[II)V")
    private final void method1516(int arg0, int arg1, boolean arg2, class483 arg3, class476 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class96 var11 = this.field3233[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field3222 == -1) {
                    for (int var12 = 0; var12 < var11.field1373; ++var12) {
                        int var13 = (arg0 << super.field5807) + var11.field1368[var12];
                        int var14 = var11.field1365[var12];
                        int var15 = (arg1 << super.field5807) + var11.field1369[var12];
                        float var16 = (float) var15 * this.field3217 + (float) var13 * this.field3223 + (float) var14 * this.field3232 + this.field3237;
                        if (var16 <= (float) this.field3230.field9615) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field6632);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field1371[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field6627) {
                            int var19 = (int) (var16 - (float) arg3.field6632);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field3228 + (float) var13 * this.field3216 + (float) var14 * this.field3219 + this.field3224;
                        float var21 = (float) var15 * this.field3221 + (float) var13 * this.field3236 + (float) var14 * this.field3229 + this.field3218;
                        arg5[var12] = (int) ((float) this.field3230.field9621 * var20 / var16) + arg4.field6461;
                        arg6[var12] = (int) ((float) this.field3230.field9627 * var21 / var16) + arg4.field6472;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field1373; ++var22) {
                        int var36 = (arg0 << super.field5807) + var11.field1368[var22];
                        int var37 = var11.field1365[var22];
                        int var38 = (arg1 << super.field5807) + var11.field1369[var22];
                        float var39 = (float) var38 * this.field3217 + (float) var36 * this.field3223 + (float) var37 * this.field3232 + this.field3237;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field3222 - arg3.field6632;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field1371[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field6627) {
                            int var42 = this.field3222 - arg3.field6632;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field3228 + (float) var36 * this.field3216 + (float) var37 * this.field3219 + this.field3224;
                        float var44 = (float) var38 * this.field3221 + (float) var36 * this.field3236 + (float) var37 * this.field3229 + this.field3218;
                        arg5[var22] = (int) ((float) this.field3230.field9621 * var43 / (float) this.field3222) + arg4.field6461;
                        arg6[var22] = (int) ((float) this.field3230.field9627 * var44 / (float) this.field3222) + arg4.field6472;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field5805;
                for (int var24 = 0; var24 < var11.field1363; ++var24) {
                    int var25 = var24 * 3;
                    int var26 = var25 + 1;
                    int var27 = var26 + 1;
                    int var28 = arg5[var25];
                    int var29 = arg5[var26];
                    int var30 = arg5[var27];
                    int var31 = arg6[var25];
                    int var32 = arg6[var26];
                    int var33 = arg6[var27];
                    if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                        arg4.field6463 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field6464 || var29 > arg4.field6464 || var30 > arg4.field6464;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field5807;
                            int var35 = arg1 << super.field5807;
                            if ((var11.field1370[var25] & 16777215) != 0) {
                                if (var11.field1364[var25] == var11.field1364[var26] && var11.field1364[var25] == var11.field1364[var27] && var11.field1366[var25] == var11.field1366[var26] && var11.field1366[var25] == var11.field1366[var27]) {
                                    arg4.method2780((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field1368[var25] + var34) / (float) var11.field1366[var25], (float) (var11.field1368[var26] + var34) / (float) var11.field1366[var26], (float) (var11.field1368[var27] + var34) / (float) var11.field1366[var27], (float) (var11.field1369[var25] + var35) / (float) var11.field1366[var25], (float) (var11.field1369[var26] + var35) / (float) var11.field1366[var26], (float) (var11.field1369[var27] + var35) / (float) var11.field1366[var27], var11.field1370[var25], var11.field1370[var26], var11.field1370[var27], arg3.field6633, arg8[var25], arg8[var26], arg8[var27], var11.field1364[var25]);
                                } else {
                                    arg4.method2785((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field1368[var25] + var34) / var23, (float) (var11.field1368[var26] + var34) / var23, (float) (var11.field1368[var27] + var34) / var23, (float) (var11.field1369[var25] + var35) / var23, (float) (var11.field1369[var26] + var35) / var23, (float) (var11.field1369[var27] + var35) / var23, var11.field1370[var25], var11.field1370[var26], var11.field1370[var27], arg3.field6633, arg8[var25], arg8[var26], arg8[var27], var11.field1364[var25], var23 / (float) var11.field1366[var25], var11.field1364[var26], var23 / (float) var11.field1366[var26], var11.field1364[var27], var23 / (float) var11.field1366[var27]);
                                }
                            }
                        } else {
                            arg4.method2790((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field6633);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    public final void method821(int arg0, int arg1) {
        this.method1518(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!dg", name = "YA", descriptor = "()V")
    public final void method818() {
        this.field3225 = null;
        this.field3234 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILjw;[I[I[I[II)V")
    private final void method1517(int arg0, int arg1, class476 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class536 var9 = this.field3227[arg0][arg1];
        if (var9 != null) {
            if ((var9.field7451 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field7451 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field5805 * arg0;
                int var11 = super.field5805 + var10;
                int var12 = super.field5805 * arg1;
                int var13 = super.field5805 + var12;
                float var16;
                float var17;
                float var18;
                float var19;
                int var23;
                int var25;
                int var27;
                int var29;
                int var31;
                int var33;
                int var35;
                int var37;
                if ((var9.field7451 & 1) != 0) {
                    int var14 = super.field5801[arg0][arg1];
                    float var15 = (float) var14 * this.field3232;
                    if (this.field3222 == -1) {
                        var16 = (float) var12 * this.field3217 + (float) var10 * this.field3223 + var15 + this.field3237;
                        if (var16 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var17 = (float) var12 * this.field3217 + (float) var11 * this.field3223 + var15 + this.field3237;
                        if (var17 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var18 = (float) var13 * this.field3217 + (float) var11 * this.field3223 + var15 + this.field3237;
                        if (var18 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var19 = (float) var13 * this.field3217 + (float) var10 * this.field3223 + var15 + this.field3237;
                        if (var19 <= (float) this.field3230.field9615) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field3217 + (float) var10 * this.field3223 + var15 + this.field3237;
                        var17 = (float) var12 * this.field3217 + (float) var11 * this.field3223 + var15 + this.field3237;
                        var18 = (float) var13 * this.field3217 + (float) var11 * this.field3223 + var15 + this.field3237;
                        var19 = (float) var13 * this.field3217 + (float) var10 * this.field3223 + var15 + this.field3237;
                    }
                    float var20 = (float) var14 * this.field3219;
                    float var21 = (float) var14 * this.field3229;
                    if (this.field3222 == -1) {
                        float var22 = (float) var12 * this.field3228 + (float) var10 * this.field3216 + var20 + this.field3224;
                        var23 = (int) ((float) this.field3230.field9621 * var22 / var16) + arg2.field6461;
                        float var24 = (float) var12 * this.field3221 + (float) var10 * this.field3236 + var21 + this.field3218;
                        var25 = (int) ((float) this.field3230.field9627 * var24 / var16) + arg2.field6472;
                        float var26 = (float) var12 * this.field3228 + (float) var11 * this.field3216 + var20 + this.field3224;
                        var27 = (int) ((float) this.field3230.field9621 * var26 / var17) + arg2.field6461;
                        float var28 = (float) var12 * this.field3221 + (float) var11 * this.field3236 + var21 + this.field3218;
                        var29 = (int) ((float) this.field3230.field9627 * var28 / var17) + arg2.field6472;
                        float var30 = (float) var13 * this.field3228 + (float) var11 * this.field3216 + var20 + this.field3224;
                        var31 = (int) ((float) this.field3230.field9621 * var30 / var18) + arg2.field6461;
                        float var32 = (float) var13 * this.field3221 + (float) var11 * this.field3236 + var21 + this.field3218;
                        var33 = (int) ((float) this.field3230.field9627 * var32 / var18) + arg2.field6472;
                        float var34 = (float) var13 * this.field3228 + (float) var10 * this.field3216 + var20 + this.field3224;
                        var35 = (int) ((float) this.field3230.field9621 * var34 / var19) + arg2.field6461;
                        float var36 = (float) var13 * this.field3221 + (float) var10 * this.field3236 + var21 + this.field3218;
                        var37 = (int) ((float) this.field3230.field9627 * var36 / var19) + arg2.field6472;
                    } else {
                        float var38 = (float) var12 * this.field3228 + (float) var10 * this.field3216 + var20 + this.field3224;
                        var23 = (int) ((float) this.field3230.field9621 * var38 / (float) this.field3222) + arg2.field6461;
                        float var39 = (float) var12 * this.field3221 + (float) var10 * this.field3236 + var21 + this.field3218;
                        var25 = (int) ((float) this.field3230.field9627 * var39 / (float) this.field3222) + arg2.field6472;
                        float var40 = (float) var12 * this.field3228 + (float) var11 * this.field3216 + var20 + this.field3224;
                        var27 = (int) ((float) this.field3230.field9621 * var40 / (float) this.field3222) + arg2.field6461;
                        float var41 = (float) var12 * this.field3221 + (float) var11 * this.field3236 + var21 + this.field3218;
                        var29 = (int) ((float) this.field3230.field9627 * var41 / (float) this.field3222) + arg2.field6472;
                        float var42 = (float) var13 * this.field3228 + (float) var11 * this.field3216 + var20 + this.field3224;
                        var31 = (int) ((float) this.field3230.field9621 * var42 / (float) this.field3222) + arg2.field6461;
                        float var43 = (float) var13 * this.field3221 + (float) var11 * this.field3236 + var21 + this.field3218;
                        var33 = (int) ((float) this.field3230.field9627 * var43 / (float) this.field3222) + arg2.field6472;
                        float var44 = (float) var13 * this.field3228 + (float) var10 * this.field3216 + var20 + this.field3224;
                        var35 = (int) ((float) this.field3230.field9621 * var44 / (float) this.field3222) + arg2.field6461;
                        float var45 = (float) var13 * this.field3221 + (float) var10 * this.field3236 + var21 + this.field3218;
                        var37 = (int) ((float) this.field3230.field9627 * var45 / (float) this.field3222) + arg2.field6472;
                    }
                } else {
                    int var46 = super.field5801[arg0][arg1];
                    int var47 = super.field5801[arg0 + 1][arg1];
                    int var48 = super.field5801[arg0 + 1][arg1 + 1];
                    int var49 = super.field5801[arg0][arg1 + 1];
                    if (this.field3222 == -1) {
                        var16 = (float) var12 * this.field3217 + (float) var10 * this.field3223 + (float) var46 * this.field3232 + this.field3237;
                        if (var16 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var17 = (float) var12 * this.field3217 + (float) var11 * this.field3223 + (float) var47 * this.field3232 + this.field3237;
                        if (var17 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var18 = (float) var13 * this.field3217 + (float) var11 * this.field3223 + (float) var48 * this.field3232 + this.field3237;
                        if (var18 <= (float) this.field3230.field9615) {
                            return;
                        }
                        var19 = (float) var13 * this.field3217 + (float) var10 * this.field3223 + (float) var49 * this.field3232 + this.field3237;
                        if (var19 <= (float) this.field3230.field9615) {
                            return;
                        }
                        float var50 = (float) var12 * this.field3228 + (float) var10 * this.field3216 + (float) var46 * this.field3219 + this.field3224;
                        var23 = (int) ((float) this.field3230.field9621 * var50 / var16) + arg2.field6461;
                        float var51 = (float) var12 * this.field3221 + (float) var10 * this.field3236 + (float) var46 * this.field3229 + this.field3218;
                        var25 = (int) ((float) this.field3230.field9627 * var51 / var16) + arg2.field6472;
                        float var52 = (float) var12 * this.field3228 + (float) var11 * this.field3216 + (float) var47 * this.field3219 + this.field3224;
                        var27 = (int) ((float) this.field3230.field9621 * var52 / var17) + arg2.field6461;
                        float var53 = (float) var12 * this.field3221 + (float) var11 * this.field3236 + (float) var47 * this.field3229 + this.field3218;
                        var29 = (int) ((float) this.field3230.field9627 * var53 / var17) + arg2.field6472;
                        float var54 = (float) var13 * this.field3228 + (float) var11 * this.field3216 + (float) var48 * this.field3219 + this.field3224;
                        var31 = (int) ((float) this.field3230.field9621 * var54 / var18) + arg2.field6461;
                        float var55 = (float) var13 * this.field3221 + (float) var11 * this.field3236 + (float) var48 * this.field3229 + this.field3218;
                        var33 = (int) ((float) this.field3230.field9627 * var55 / var18) + arg2.field6472;
                        float var56 = (float) var13 * this.field3228 + (float) var10 * this.field3216 + (float) var49 * this.field3219 + this.field3224;
                        var35 = (int) ((float) this.field3230.field9621 * var56 / var19) + arg2.field6461;
                        float var57 = (float) var13 * this.field3221 + (float) var10 * this.field3236 + (float) var49 * this.field3229 + this.field3218;
                        var37 = (int) ((float) this.field3230.field9627 * var57 / var19) + arg2.field6472;
                    } else {
                        var16 = (float) var12 * this.field3217 + (float) var10 * this.field3223 + (float) var46 * this.field3232 + this.field3237;
                        var17 = (float) var12 * this.field3217 + (float) var11 * this.field3223 + (float) var47 * this.field3232 + this.field3237;
                        var18 = (float) var13 * this.field3217 + (float) var11 * this.field3223 + (float) var48 * this.field3232 + this.field3237;
                        var19 = (float) var13 * this.field3217 + (float) var10 * this.field3223 + (float) var49 * this.field3232 + this.field3237;
                        float var58 = (float) var12 * this.field3228 + (float) var10 * this.field3216 + (float) var46 * this.field3219 + this.field3224;
                        var23 = (int) ((float) this.field3230.field9621 * var58 / (float) this.field3222) + arg2.field6461;
                        float var59 = (float) var12 * this.field3221 + (float) var10 * this.field3236 + (float) var46 * this.field3229 + this.field3218;
                        var25 = (int) ((float) this.field3230.field9627 * var59 / (float) this.field3222) + arg2.field6472;
                        float var60 = (float) var12 * this.field3228 + (float) var11 * this.field3216 + (float) var47 * this.field3219 + this.field3224;
                        var27 = (int) ((float) this.field3230.field9621 * var60 / (float) this.field3222) + arg2.field6461;
                        float var61 = (float) var12 * this.field3221 + (float) var11 * this.field3236 + (float) var47 * this.field3229 + this.field3218;
                        var29 = (int) ((float) this.field3230.field9627 * var61 / (float) this.field3222) + arg2.field6472;
                        float var62 = (float) var13 * this.field3228 + (float) var11 * this.field3216 + (float) var48 * this.field3219 + this.field3224;
                        var31 = (int) ((float) this.field3230.field9621 * var62 / (float) this.field3222) + arg2.field6461;
                        float var63 = (float) var13 * this.field3221 + (float) var11 * this.field3236 + (float) var48 * this.field3229 + this.field3218;
                        var33 = (int) ((float) this.field3230.field9627 * var63 / (float) this.field3222) + arg2.field6472;
                        float var64 = (float) var13 * this.field3228 + (float) var10 * this.field3216 + (float) var49 * this.field3219 + this.field3224;
                        var35 = (int) ((float) this.field3230.field9621 * var64 / (float) this.field3222) + arg2.field6461;
                        float var65 = (float) var13 * this.field3221 + (float) var10 * this.field3236 + (float) var49 * this.field3229 + this.field3218;
                        var37 = (int) ((float) this.field3230.field9627 * var65 / (float) this.field3222) + arg2.field6472;
                    }
                }
                if (this.field3222 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field6463 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field6464 || var35 > arg2.field6464 || var27 > arg2.field6464;
                        if (var9.field7457 >= 0) {
                            arg2.method2780((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class621.field8768[var9.field7456 & 65535] & 16777215, -16777216 | class621.field8768[var9.field7455 & 65535] & 16777215, -16777216 | class621.field8768[var9.field7452 & 65535] & 16777215, 0, 0, 0, 0, var9.field7457);
                        } else {
                            arg2.method2788((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field7456 & 65535), (float) (var9.field7455 & 65535), (float) (var9.field7452 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field6463 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field6464 || var27 > arg2.field6464 || var35 > arg2.field6464;
                        if (var9.field7457 >= 0) {
                            arg2.method2780((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class621.field8768[var9.field7454 & 65535] & 16777215, -16777216 | class621.field8768[var9.field7452 & 65535] & 16777215, -16777216 | class621.field8768[var9.field7455 & 65535] & 16777215, 0, 0, 0, 0, var9.field7457);
                            return;
                        }
                        arg2.method2788((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field7454 & 65535), (float) (var9.field7452 & 65535), (float) (var9.field7455 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field6463 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field6464 || var35 > arg2.field6464 || var27 > arg2.field6464;
                        if (var9.field7457 >= 0) {
                            arg2.method2780((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class621.field8768[var9.field7456 & 65535] & 16777215, -16777216 | class621.field8768[var9.field7455 & 65535] & 16777215, -16777216 | class621.field8768[var9.field7452 & 65535] & 16777215, 0, 0, 0, 0, var9.field7457);
                        } else {
                            arg2.method2788((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field7456 & 65535), (float) (var9.field7455 & 65535), (float) (var9.field7452 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field6463 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field6464 || var27 > arg2.field6464 || var35 > arg2.field6464;
                        if (var9.field7457 >= 0) {
                            arg2.method2780((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class621.field8768[var9.field7454 & 65535] & 16777215, -16777216 | class621.field8768[var9.field7452 & 65535] & 16777215, -16777216 | class621.field8768[var9.field7455 & 65535] & 16777215, 0, 0, 0, 0, var9.field7457);
                            return;
                        }
                        arg2.method2788((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field7454 & 65535), (float) (var9.field7452 & 65535), (float) (var9.field7455 & 65535));
                    }
                }
            }
        } else {
            class787 var66 = this.field3231[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field10781 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field3222 == -1) {
                    for (int var67 = 0; var67 < var66.field10774; ++var67) {
                        int var68 = (arg0 << super.field5807) + var66.field10776[var67];
                        short var69 = var66.field10777[var67];
                        int var70 = (arg1 << super.field5807) + var66.field10778[var67];
                        float var71 = (float) var70 * this.field3217 + (float) var68 * this.field3223 + (float) var69 * this.field3232 + this.field3237;
                        if (var71 <= (float) this.field3230.field9615) {
                            return;
                        }
                        float var72 = (float) var70 * this.field3228 + (float) var68 * this.field3216 + (float) var69 * this.field3219 + this.field3224;
                        float var73 = (float) var70 * this.field3221 + (float) var68 * this.field3236 + (float) var69 * this.field3229 + this.field3218;
                        arg3[var67] = (int) ((float) this.field3230.field9621 * var72 / var71) + arg2.field6461;
                        arg4[var67] = (int) ((float) this.field3230.field9627 * var73 / var71) + arg2.field6472;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field10774; ++var74) {
                        int var110 = (arg0 << super.field5807) + var66.field10776[var74];
                        short var111 = var66.field10777[var74];
                        int var112 = (arg1 << super.field5807) + var66.field10778[var74];
                        float var113 = (float) var112 * this.field3217 + (float) var110 * this.field3223 + (float) var111 * this.field3232 + this.field3237;
                        float var114 = (float) var112 * this.field3228 + (float) var110 * this.field3216 + (float) var111 * this.field3219 + this.field3224;
                        float var115 = (float) var112 * this.field3221 + (float) var110 * this.field3236 + (float) var111 * this.field3229 + this.field3218;
                        arg3[var74] = (int) ((float) this.field3230.field9621 * var114 / (float) this.field3222) + arg2.field6461;
                        arg4[var74] = (int) ((float) this.field3230.field9627 * var115 / (float) this.field3222) + arg2.field6472;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field10773 != null) {
                    if (this.field3222 == -1) {
                        for (int var75 = 0; var75 < var66.field10783; ++var75) {
                            short var76 = var66.field10784[var75];
                            short var77 = var66.field10782[var75];
                            short var78 = var66.field10771[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field6463 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field6464 || var80 > arg2.field6464 || var81 > arg2.field6464;
                                short var85 = var66.field10773[var75];
                                if (var85 != -1) {
                                    arg2.method2780((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field10776[var76] / (float) super.field5805, (float) var66.field10776[var77] / (float) super.field5805, (float) var66.field10776[var78] / (float) super.field5805, (float) var66.field10778[var76] / (float) super.field5805, (float) var66.field10778[var77] / (float) super.field5805, (float) var66.field10778[var78] / (float) super.field5805, -16777216 | class621.field8768[var66.field10772[var76] & 65535] & 16777215, -16777216 | class621.field8768[var66.field10772[var77] & 65535] & 16777215, -16777216 | class621.field8768[var66.field10772[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field10779[var75];
                                    if (var86 != -1) {
                                        arg2.method2788((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class670.method3761(var86, (byte) -10, var66.field10772[var76]), (float) class670.method3761(var86, (byte) -10, var66.field10772[var77]), (float) class670.method3761(var86, (byte) -10, var66.field10772[var78]));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field10783; ++var87) {
                        short var88 = var66.field10784[var87];
                        short var89 = var66.field10782[var87];
                        short var90 = var66.field10771[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field6463 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field6464 || var92 > arg2.field6464 || var93 > arg2.field6464;
                            short var97 = var66.field10773[var87];
                            if (var97 != -1) {
                                arg2.method2780((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field10776[var88] / (float) super.field5805, (float) var66.field10776[var89] / (float) super.field5805, (float) var66.field10776[var90] / (float) super.field5805, (float) var66.field10778[var88] / (float) super.field5805, (float) var66.field10778[var89] / (float) super.field5805, (float) var66.field10778[var90] / (float) super.field5805, -16777216 | class621.field8768[var66.field10772[var88] & 65535] & 16777215, -16777216 | class621.field8768[var66.field10772[var89] & 65535] & 16777215, -16777216 | class621.field8768[var66.field10772[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field10779[var87];
                                if (var98 != -1) {
                                    arg2.method2788((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class670.method3761(var98, (byte) -10, var66.field10772[var88]), (float) class670.method3761(var98, (byte) -10, var66.field10772[var89]), (float) class670.method3761(var98, (byte) -10, var66.field10772[var90]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field10783; ++var99) {
                    short var100 = var66.field10784[var99];
                    short var101 = var66.field10782[var99];
                    short var102 = var66.field10771[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field10779[var99];
                        if (var109 != -1) {
                            arg2.field6463 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field6464 || var104 > arg2.field6464 || var105 > arg2.field6464;
                            arg2.method2788((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class670.method3761(var109, (byte) -10, var66.field10772[var100]), (float) class670.method3761(var109, (byte) -10, var66.field10772[var101]), (float) class670.method3761(var109, (byte) -10, var66.field10772[var102]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method823(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lmfa;[I)V")
    public final void method831(class217 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lrp;IIII[[I[[II)V")
    public class220(class680 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field3230 = arg0;
        this.field3226 = arg2;
        this.field3225 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field3230.field9611 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field3230.field9626 * var18 + this.field3230.field9633 * var16 + this.field3230.field9618 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field3225[var11][var10] = (byte) var20;
            }
        }
        this.field3234 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!dg", name = "fa", descriptor = "(IILr;)Lr;")
    public final class115 method830(int arg0, int arg1, class115 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "ka", descriptor = "(III)V")
    public final void method819(int arg0, int arg1, int arg2) {
        if (this.field3234[arg0][arg1] < arg2) {
            this.field3234[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V")
    private final void method1518(int arg0, int arg1, int arg2) {
        class483 var4 = this.field3230.method3820(Thread.currentThread());
        var4.field6644.field6474 = 0;
        if (this.field3235 != null) {
            this.method1513(arg0, arg1, var4.field6639, var4, var4.field6644, var4.field6678, var4.field6643, var4.field6667, var4.field6669, arg2);
        } else if (this.field3227 != null) {
            this.method1517(arg0, arg1, var4.field6644, var4.field6678, var4.field6643, var4.field6667, var4.field6669, arg2);
        } else {
            if (this.field3233 != null) {
                this.method1516(arg0, arg1, var4.field6639, var4, var4.field6644, var4.field6678, var4.field6643, var4.field6667, var4.field6669, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIIIIII[[ZLtv;Ljw;[I[I)V")
    private final void method1519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class483 arg8, class476 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field6640;
        this.field3230.method513(false);
        arg9.field6475 = false;
        arg9.field6465 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field3235 != null) {
                        if (this.field3235[var18][var19] != null) {
                            class59 var20 = this.field3235[var18][var19];
                            if (var20.field901 != -1 && (var20.field904 & 2) == 0 && var20.field902 == 0) {
                                int var21 = this.field3230.method3827(var20.field901);
                                arg9.method2788((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class670.method3761(var21, (byte) -10, var20.field907), (float) class670.method3761(var21, (byte) -10, var20.field899), (float) class670.method3761(var21, (byte) -10, var20.field903));
                                arg9.method2788((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class670.method3761(var21, (byte) -10, var20.field905), (float) class670.method3761(var21, (byte) -10, var20.field903), (float) class670.method3761(var21, (byte) -10, var20.field899));
                            } else if (var20.field902 == 0) {
                                arg9.method2789((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field907, var20.field899, var20.field903);
                                arg9.method2789((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field905, var20.field903, var20.field899);
                            } else {
                                int var22 = var20.field902;
                                arg9.method2789((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class163.method1233(var20.field907 & -16777216, var22, (byte) 77), class163.method1233(var20.field899 & -16777216, var22, (byte) 109), class163.method1233(var20.field903 & -16777216, var22, (byte) 121));
                                arg9.method2789((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class163.method1233(var20.field905 & -16777216, var22, (byte) 103), class163.method1233(var20.field903 & -16777216, var22, (byte) 112), class163.method1233(var20.field899 & -16777216, var22, (byte) 86));
                            }
                        } else if (this.field3220[var18][var19] != null) {
                            class736 var23 = this.field3220[var18][var19];
                            for (int var24 = 0; var24 < var23.field10219; ++var24) {
                                arg10[var24] = var23.field10216[var24] * var14 / super.field5805 + var16;
                                arg11[var24] = var17 - var23.field10215[var24] * var14 / super.field5805;
                            }
                            for (int var25 = 0; var25 < var23.field10214; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field10210 != null && var23.field10210[var25] != 0 && (var23.field10217 == null || var23.field10217 != null && var23.field10217[var25] == -1)) {
                                    int var35 = var23.field10210[var25];
                                    arg9.method2789((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class163.method1233(-16777216 - (var23.field10218[var26] & -16777216), var35, (byte) 105), class163.method1233(-16777216 - (var23.field10218[var27] & -16777216), var35, (byte) 126), class163.method1233(-16777216 - (var23.field10218[var28] & -16777216), var35, (byte) 105));
                                } else if (var23.field10217 != null && var23.field10217[var25] != -1) {
                                    int var36 = this.field3230.method3827(var23.field10217[var25]);
                                    arg9.method2788((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method2789((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field10218[var26], var23.field10218[var27], var23.field10218[var28]);
                                }
                            }
                        }
                    } else if (this.field3233[var18][var19] != null) {
                        class96 var37 = this.field3233[var18][var19];
                        for (int var38 = 0; var38 < var37.field1373; ++var38) {
                            arg10[var38] = var37.field1368[var38] * var14 / super.field5805 + var16;
                            arg11[var38] = var17 - var37.field1369[var38] * var14 / super.field5805;
                        }
                        for (int var39 = 0; var39 < var37.field1363; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field1367 != null && var37.field1367[var39] != 0) {
                                int var49 = var37.field1367[var39];
                                arg9.method2789((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method2789((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field1370[var40], var37.field1370[var41], var37.field1370[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field6475 = true;
        this.field3230.method513(var15);
    }
}
