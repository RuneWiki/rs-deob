import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class570 extends class292 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    private int field8069 = -1;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "Lni;")
    private class545 field8087;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    private int field8076;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[[B")
    private byte[][] field8071;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "[[B")
    private byte[][] field8084;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "F")
    private float field8067;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "F")
    private float field8070;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "F")
    private float field8072;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "F")
    private float field8073;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "F")
    private float field8074;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "F")
    private float field8075;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "F")
    private float field8077;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "F")
    private float field8079;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "F")
    private float field8080;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "F")
    private float field8082;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "F")
    private float field8083;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "F")
    private float field8086;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "[[Lkd;")
    private class294[][] field8078;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "[[Lvo;")
    private class47[][] field8081;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[[Lhka;")
    private class57[][] field8066;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "[[Loi;")
    private class80[][] field8085;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[[Law;")
    private class83[][] field8068;

    @OriginalMember(owner = "client!ea", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1247(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1239(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field8068 == null) {
            this.field8068 = new class83[super.field4420][super.field4425];
            this.field8085 = new class80[super.field4420][super.field4425];
        } else if (this.field8066 != null || this.field8081 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field4419 != var20 || var21 != 0 && super.field4419 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class80 var22 = new class80();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1056 = var23;
            var22.field1060 = new short[var23];
            var22.field1066 = new short[var23];
            var22.field1058 = new short[var23];
            var22.field1062 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field1060[var25] = (short) (this.field8071[arg0][arg1] - this.field8084[arg0][arg1]);
                } else if (var32 == 0 && super.field4419 == var33) {
                    var22.field1060[var25] = (short) (this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1]);
                } else if (super.field4419 == var32 && super.field4419 == var33) {
                    var22.field1060[var25] = (short) (this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1]);
                } else if (super.field4419 == var32 && var33 == 0) {
                    var22.field1060[var25] = (short) (this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1]) * var32 + (this.field8071[arg0][arg1] - this.field8084[arg0][arg1]) * (super.field4419 - var32);
                    int var35 = (this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1]) * var32 + (this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1]) * (super.field4419 - var32);
                    var22.field1060[var25] = (short) ((super.field4419 - var33) * var34 + var33 * var35 >> super.field4428 * 2);
                }
                int var36 = (arg0 << super.field4428) + var32;
                int var37 = (arg1 << super.field4428) + var33;
                var22.field1066[var25] = (short) var32;
                var22.field1062[var25] = (short) var33;
                var22.field1058[var25] = (short) (this.method1977((byte) -3, var36, var37) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1060[var25] < 2) {
                    var22.field1060[var25] = 2;
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
                    class181 var31 = this.field8087.field883.method1263(var30, (byte) 110);
                    if (!var31.field2744) {
                        var26 = true;
                        if (this.method3308(var31.field2745) || var31.field2740 != 0 || var31.field2736 != 0) {
                            var22.field1064 = (byte) (var22.field1064 | 4);
                        }
                    }
                }
            }
            var22.field1055 = new int[var27];
            if (arg10 != null) {
                var22.field1063 = new int[var27];
            }
            var22.field1053 = new short[var27];
            var22.field1054 = new short[var27];
            var22.field1061 = new short[var27];
            if (var26) {
                var22.field1057 = new short[var27];
                var22.field1065 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1055[var22.field1059] = class162.method1275(16287, arg9[var29]);
                    } else {
                        var22.field1055[var22.field1059] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1063[var22.field1059] = class162.method1275(16287, arg10[var29]);
                        } else {
                            var22.field1063[var22.field1059] = -1;
                        }
                    }
                    var22.field1053[var22.field1059] = (short) arg6[var29];
                    var22.field1054[var22.field1059] = (short) arg7[var29];
                    var22.field1061[var22.field1059] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field8087.field883.method1263(arg11[var29], (byte) 110).field2744) {
                            var22.field1057[var22.field1059] = (short) arg11[var29];
                            var22.field1065[var22.field1059] = (short) arg12[var29];
                        } else {
                            var22.field1057[var22.field1059] = -1;
                        }
                    }
                    ++var22.field1059;
                }
            }
            this.field8085[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class83 var38 = new class83();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field1099 = class187.method1388(this.field8071[arg0][arg1] - this.field8084[arg0][arg1], class162.method1275(16287, arg10[0]), 1023);
                    if (var39 == -1) {
                        var38.field1100 = (byte) (var38.field1100 | 2);
                    }
                }
                if (super.field4424[arg0 + 1][arg1] == super.field4424[arg0][arg1] && super.field4424[arg0 + 1][arg1 + 1] == super.field4424[arg0][arg1] && super.field4424[arg0][arg1 + 1] == super.field4424[arg0][arg1]) {
                    var38.field1100 = (byte) (var38.field1100 | 1);
                }
                class181 var41 = null;
                if (var40 != -1) {
                    var41 = this.field8087.field883.method1263(var40, (byte) 126);
                }
                if (var41 != null && (var38.field1100 & 2) == 0 && !var41.field2744) {
                    var38.field1095 = (short) (this.field8071[arg0][arg1] - this.field8084[arg0][arg1]);
                    var38.field1096 = (short) (this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1]);
                    var38.field1094 = (short) (this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1]);
                    var38.field1097 = (short) (this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1]);
                    var38.field1098 = (short) var40;
                    if (this.method3308(var41.field2745) || var41.field2740 != 0 || var41.field2736 != 0) {
                        var38.field1100 = (byte) (var38.field1100 | 4);
                    }
                } else {
                    short var42 = class162.method1275(16287, var39);
                    var38.field1095 = (short) class187.method1388(this.field8071[arg0][arg1] - this.field8084[arg0][arg1], var42, 1023);
                    var38.field1096 = (short) class187.method1388(this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1], var42, 1023);
                    var38.field1094 = (short) class187.method1388(this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1], var42, 1023);
                    var38.field1097 = (short) class187.method1388(this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1], var42, 1023);
                    var38.field1098 = -1;
                }
                this.field8068[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1250(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class628 var8 = this.field8087.field7666;
        this.field8069 = arg5;
        this.field8079 = var8.field8896;
        this.field8072 = var8.field8870;
        this.field8073 = var8.field8877;
        this.field8070 = var8.field8873;
        this.field8082 = var8.field8880;
        this.field8075 = var8.field8875;
        this.field8083 = var8.field8886;
        this.field8086 = var8.field8885;
        this.field8080 = var8.field8876;
        this.field8067 = var8.field8897;
        this.field8074 = var8.field8895;
        this.field8077 = var8.field8879;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field4420 && var12 >= 0 && var12 < super.field4425) {
                        this.method3314(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIII[[ZLlda;Lsia;[I[I)V")
    private final void method3307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class509 arg8, class765 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7263;
        this.field8087.method408(false);
        arg9.field10515 = false;
        arg9.field10520 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field8068[var18][var19] != null) {
                        class83 var20 = this.field8068[var18][var19];
                        if (var20.field1098 != -1 && (var20.field1100 & 2) == 0 && var20.field1099 == -1) {
                            int var21 = this.field8087.method3164(var20.field1098);
                            arg9.method4207((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class187.method1388(var20.field1094 & 65535, var21, 1023), (float) class187.method1388(var20.field1097 & 65535, var21, 1023), (float) class187.method1388(var20.field1096 & 65535, var21, 1023));
                            arg9.method4207((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class187.method1388(var20.field1095 & 65535, var21, 1023), (float) class187.method1388(var20.field1096 & 65535, var21, 1023), (float) class187.method1388(var20.field1097 & 65535, var21, 1023));
                        } else if (var20.field1099 == -1) {
                            arg9.method4207((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field1094 & 65535), (float) (var20.field1097 & 65535), (float) (var20.field1096 & 65535));
                            arg9.method4207((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field1095 & 65535), (float) (var20.field1096 & 65535), (float) (var20.field1097 & 65535));
                        } else {
                            int var22 = var20.field1099;
                            arg9.method4207((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method4207((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field8085[var18][var19] != null) {
                        class80 var23 = this.field8085[var18][var19];
                        for (int var24 = 0; var24 < var23.field1056; ++var24) {
                            arg10[var24] = var23.field1066[var24] * var14 / super.field4419 + var16;
                            arg11[var24] = var17 - var23.field1062[var24] * var14 / super.field4419;
                        }
                        for (int var25 = 0; var25 < var23.field1059; ++var25) {
                            short var26 = var23.field1053[var25];
                            short var27 = var23.field1054[var25];
                            short var28 = var23.field1061[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field1063 != null && var23.field1063[var25] != -1) {
                                int var35 = var23.field1063[var25];
                                arg9.method4207((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class187.method1388(var23.field1060[var26], var35, 1023), (float) class187.method1388(var23.field1060[var27], var35, 1023), (float) class187.method1388(var23.field1060[var28], var35, 1023));
                            } else if (var23.field1057 != null && var23.field1057[var25] != -1) {
                                int var36 = this.field8087.method3164(var23.field1057[var25]);
                                arg9.method4207((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class187.method1388(var23.field1060[var26], var36, 1023), (float) class187.method1388(var23.field1060[var27], var36, 1023), (float) class187.method1388(var23.field1060[var28], var36, 1023));
                            } else {
                                int var37 = var23.field1055[var25];
                                arg9.method4207((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class187.method1388(var23.field1060[var26], var37, 1023), (float) class187.method1388(var23.field1060[var27], var37, 1023), (float) class187.method1388(var23.field1060[var28], var37, 1023));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field10515 = true;
        this.field8087.method408(var15);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljw;[I)V")
    public final void method1248(class578 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class509 var9 = this.field8087.method3167(Thread.currentThread());
        class765 var10 = var9.field7291;
        var10.field10517 = 0;
        var10.field10521 = true;
        this.field8087.method449();
        if (this.field8066 == null && this.field8081 == null) {
            if (this.field8068 != null) {
                this.method3307(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7284, var9.field7264);
            }
        } else {
            this.method3311(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7284, var9.field7264);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z")
    private final boolean method3308(int arg0) {
        if ((this.field8076 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ea", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1251(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)I")
    private static final int method3309(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILsia;[I[I[I[II)V")
    private final void method3310(int arg0, int arg1, class765 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class83 var9 = this.field8068[arg0][arg1];
        if (var9 != null) {
            if ((var9.field1100 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field1100 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field4419 * arg0;
                int var11 = super.field4419 + var10;
                int var12 = super.field4419 * arg1;
                int var13 = super.field4419 + var12;
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
                if ((var9.field1100 & 1) != 0) {
                    int var14 = super.field4424[arg0][arg1];
                    float var15 = (float) var14 * this.field8067;
                    if (this.field8069 == -1) {
                        var16 = (float) var12 * this.field8074 + (float) var10 * this.field8080 + var15 + this.field8077;
                        if (var16 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var17 = (float) var12 * this.field8074 + (float) var11 * this.field8080 + var15 + this.field8077;
                        if (var17 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var18 = (float) var13 * this.field8074 + (float) var11 * this.field8080 + var15 + this.field8077;
                        if (var18 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var19 = (float) var13 * this.field8074 + (float) var10 * this.field8080 + var15 + this.field8077;
                        if (var19 <= (float) this.field8087.field7701) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field8074 + (float) var10 * this.field8080 + var15 + this.field8077;
                        var17 = (float) var12 * this.field8074 + (float) var11 * this.field8080 + var15 + this.field8077;
                        var18 = (float) var13 * this.field8074 + (float) var11 * this.field8080 + var15 + this.field8077;
                        var19 = (float) var13 * this.field8074 + (float) var10 * this.field8080 + var15 + this.field8077;
                    }
                    float var20 = (float) var14 * this.field8072;
                    float var21 = (float) var14 * this.field8075;
                    if (this.field8069 == -1) {
                        float var22 = (float) var12 * this.field8073 + (float) var10 * this.field8079 + var20 + this.field8070;
                        var23 = (int) ((float) this.field8087.field7682 * var22 / var16) + arg2.field10526;
                        float var24 = (float) var12 * this.field8083 + (float) var10 * this.field8082 + var21 + this.field8086;
                        var25 = (int) ((float) this.field8087.field7667 * var24 / var16) + arg2.field10527;
                        float var26 = (float) var12 * this.field8073 + (float) var11 * this.field8079 + var20 + this.field8070;
                        var27 = (int) ((float) this.field8087.field7682 * var26 / var17) + arg2.field10526;
                        float var28 = (float) var12 * this.field8083 + (float) var11 * this.field8082 + var21 + this.field8086;
                        var29 = (int) ((float) this.field8087.field7667 * var28 / var17) + arg2.field10527;
                        float var30 = (float) var13 * this.field8073 + (float) var11 * this.field8079 + var20 + this.field8070;
                        var31 = (int) ((float) this.field8087.field7682 * var30 / var18) + arg2.field10526;
                        float var32 = (float) var13 * this.field8083 + (float) var11 * this.field8082 + var21 + this.field8086;
                        var33 = (int) ((float) this.field8087.field7667 * var32 / var18) + arg2.field10527;
                        float var34 = (float) var13 * this.field8073 + (float) var10 * this.field8079 + var20 + this.field8070;
                        var35 = (int) ((float) this.field8087.field7682 * var34 / var19) + arg2.field10526;
                        float var36 = (float) var13 * this.field8083 + (float) var10 * this.field8082 + var21 + this.field8086;
                        var37 = (int) ((float) this.field8087.field7667 * var36 / var19) + arg2.field10527;
                    } else {
                        float var38 = (float) var12 * this.field8073 + (float) var10 * this.field8079 + var20 + this.field8070;
                        var23 = (int) ((float) this.field8087.field7682 * var38 / (float) this.field8069) + arg2.field10526;
                        float var39 = (float) var12 * this.field8083 + (float) var10 * this.field8082 + var21 + this.field8086;
                        var25 = (int) ((float) this.field8087.field7667 * var39 / (float) this.field8069) + arg2.field10527;
                        float var40 = (float) var12 * this.field8073 + (float) var11 * this.field8079 + var20 + this.field8070;
                        var27 = (int) ((float) this.field8087.field7682 * var40 / (float) this.field8069) + arg2.field10526;
                        float var41 = (float) var12 * this.field8083 + (float) var11 * this.field8082 + var21 + this.field8086;
                        var29 = (int) ((float) this.field8087.field7667 * var41 / (float) this.field8069) + arg2.field10527;
                        float var42 = (float) var13 * this.field8073 + (float) var11 * this.field8079 + var20 + this.field8070;
                        var31 = (int) ((float) this.field8087.field7682 * var42 / (float) this.field8069) + arg2.field10526;
                        float var43 = (float) var13 * this.field8083 + (float) var11 * this.field8082 + var21 + this.field8086;
                        var33 = (int) ((float) this.field8087.field7667 * var43 / (float) this.field8069) + arg2.field10527;
                        float var44 = (float) var13 * this.field8073 + (float) var10 * this.field8079 + var20 + this.field8070;
                        var35 = (int) ((float) this.field8087.field7682 * var44 / (float) this.field8069) + arg2.field10526;
                        float var45 = (float) var13 * this.field8083 + (float) var10 * this.field8082 + var21 + this.field8086;
                        var37 = (int) ((float) this.field8087.field7667 * var45 / (float) this.field8069) + arg2.field10527;
                    }
                } else {
                    int var46 = super.field4424[arg0][arg1];
                    int var47 = super.field4424[arg0 + 1][arg1];
                    int var48 = super.field4424[arg0 + 1][arg1 + 1];
                    int var49 = super.field4424[arg0][arg1 + 1];
                    if (this.field8069 == -1) {
                        var16 = (float) var12 * this.field8074 + (float) var10 * this.field8080 + (float) var46 * this.field8067 + this.field8077;
                        if (var16 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var17 = (float) var12 * this.field8074 + (float) var11 * this.field8080 + (float) var47 * this.field8067 + this.field8077;
                        if (var17 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var18 = (float) var13 * this.field8074 + (float) var11 * this.field8080 + (float) var48 * this.field8067 + this.field8077;
                        if (var18 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var19 = (float) var13 * this.field8074 + (float) var10 * this.field8080 + (float) var49 * this.field8067 + this.field8077;
                        if (var19 <= (float) this.field8087.field7701) {
                            return;
                        }
                        float var50 = (float) var12 * this.field8073 + (float) var10 * this.field8079 + (float) var46 * this.field8072 + this.field8070;
                        var23 = (int) ((float) this.field8087.field7682 * var50 / var16) + arg2.field10526;
                        float var51 = (float) var12 * this.field8083 + (float) var10 * this.field8082 + (float) var46 * this.field8075 + this.field8086;
                        var25 = (int) ((float) this.field8087.field7667 * var51 / var16) + arg2.field10527;
                        float var52 = (float) var12 * this.field8073 + (float) var11 * this.field8079 + (float) var47 * this.field8072 + this.field8070;
                        var27 = (int) ((float) this.field8087.field7682 * var52 / var17) + arg2.field10526;
                        float var53 = (float) var12 * this.field8083 + (float) var11 * this.field8082 + (float) var47 * this.field8075 + this.field8086;
                        var29 = (int) ((float) this.field8087.field7667 * var53 / var17) + arg2.field10527;
                        float var54 = (float) var13 * this.field8073 + (float) var11 * this.field8079 + (float) var48 * this.field8072 + this.field8070;
                        var31 = (int) ((float) this.field8087.field7682 * var54 / var18) + arg2.field10526;
                        float var55 = (float) var13 * this.field8083 + (float) var11 * this.field8082 + (float) var48 * this.field8075 + this.field8086;
                        var33 = (int) ((float) this.field8087.field7667 * var55 / var18) + arg2.field10527;
                        float var56 = (float) var13 * this.field8073 + (float) var10 * this.field8079 + (float) var49 * this.field8072 + this.field8070;
                        var35 = (int) ((float) this.field8087.field7682 * var56 / var19) + arg2.field10526;
                        float var57 = (float) var13 * this.field8083 + (float) var10 * this.field8082 + (float) var49 * this.field8075 + this.field8086;
                        var37 = (int) ((float) this.field8087.field7667 * var57 / var19) + arg2.field10527;
                    } else {
                        var16 = (float) var12 * this.field8074 + (float) var10 * this.field8080 + (float) var46 * this.field8067 + this.field8077;
                        var17 = (float) var12 * this.field8074 + (float) var11 * this.field8080 + (float) var47 * this.field8067 + this.field8077;
                        var18 = (float) var13 * this.field8074 + (float) var11 * this.field8080 + (float) var48 * this.field8067 + this.field8077;
                        var19 = (float) var13 * this.field8074 + (float) var10 * this.field8080 + (float) var49 * this.field8067 + this.field8077;
                        float var58 = (float) var12 * this.field8073 + (float) var10 * this.field8079 + (float) var46 * this.field8072 + this.field8070;
                        var23 = (int) ((float) this.field8087.field7682 * var58 / (float) this.field8069) + arg2.field10526;
                        float var59 = (float) var12 * this.field8083 + (float) var10 * this.field8082 + (float) var46 * this.field8075 + this.field8086;
                        var25 = (int) ((float) this.field8087.field7667 * var59 / (float) this.field8069) + arg2.field10527;
                        float var60 = (float) var12 * this.field8073 + (float) var11 * this.field8079 + (float) var47 * this.field8072 + this.field8070;
                        var27 = (int) ((float) this.field8087.field7682 * var60 / (float) this.field8069) + arg2.field10526;
                        float var61 = (float) var12 * this.field8083 + (float) var11 * this.field8082 + (float) var47 * this.field8075 + this.field8086;
                        var29 = (int) ((float) this.field8087.field7667 * var61 / (float) this.field8069) + arg2.field10527;
                        float var62 = (float) var13 * this.field8073 + (float) var11 * this.field8079 + (float) var48 * this.field8072 + this.field8070;
                        var31 = (int) ((float) this.field8087.field7682 * var62 / (float) this.field8069) + arg2.field10526;
                        float var63 = (float) var13 * this.field8083 + (float) var11 * this.field8082 + (float) var48 * this.field8075 + this.field8086;
                        var33 = (int) ((float) this.field8087.field7667 * var63 / (float) this.field8069) + arg2.field10527;
                        float var64 = (float) var13 * this.field8073 + (float) var10 * this.field8079 + (float) var49 * this.field8072 + this.field8070;
                        var35 = (int) ((float) this.field8087.field7682 * var64 / (float) this.field8069) + arg2.field10526;
                        float var65 = (float) var13 * this.field8083 + (float) var10 * this.field8082 + (float) var49 * this.field8075 + this.field8086;
                        var37 = (int) ((float) this.field8087.field7667 * var65 / (float) this.field8069) + arg2.field10527;
                    }
                }
                if (this.field8069 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field10521 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field10524 || var35 > arg2.field10524 || var27 > arg2.field10524;
                        if (var9.field1098 >= 0) {
                            arg2.method4210((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class595.field8378[var9.field1094 & 65535] & 16777215, -16777216 | class595.field8378[var9.field1097 & 65535] & 16777215, -16777216 | class595.field8378[var9.field1096 & 65535] & 16777215, 0, 0, 0, 0, var9.field1098);
                        } else {
                            arg2.method4207((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field1094 & 65535), (float) (var9.field1097 & 65535), (float) (var9.field1096 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field10521 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field10524 || var27 > arg2.field10524 || var35 > arg2.field10524;
                        if (var9.field1098 >= 0) {
                            arg2.method4210((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class595.field8378[var9.field1095 & 65535] & 16777215, -16777216 | class595.field8378[var9.field1096 & 65535] & 16777215, -16777216 | class595.field8378[var9.field1097 & 65535] & 16777215, 0, 0, 0, 0, var9.field1098);
                            return;
                        }
                        arg2.method4207((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field1095 & 65535), (float) (var9.field1096 & 65535), (float) (var9.field1097 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field10521 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field10524 || var35 > arg2.field10524 || var27 > arg2.field10524;
                        if (var9.field1098 >= 0) {
                            arg2.method4210((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class595.field8378[var9.field1094 & 65535] & 16777215, -16777216 | class595.field8378[var9.field1097 & 65535] & 16777215, -16777216 | class595.field8378[var9.field1096 & 65535] & 16777215, 0, 0, 0, 0, var9.field1098);
                        } else {
                            arg2.method4207((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field1094 & 65535), (float) (var9.field1097 & 65535), (float) (var9.field1096 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field10521 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field10524 || var27 > arg2.field10524 || var35 > arg2.field10524;
                        if (var9.field1098 >= 0) {
                            arg2.method4210((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class595.field8378[var9.field1095 & 65535] & 16777215, -16777216 | class595.field8378[var9.field1096 & 65535] & 16777215, -16777216 | class595.field8378[var9.field1097 & 65535] & 16777215, 0, 0, 0, 0, var9.field1098);
                            return;
                        }
                        arg2.method4207((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field1095 & 65535), (float) (var9.field1096 & 65535), (float) (var9.field1097 & 65535));
                    }
                }
            }
        } else {
            class80 var66 = this.field8085[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field1064 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field8069 == -1) {
                    for (int var67 = 0; var67 < var66.field1056; ++var67) {
                        int var68 = (arg0 << super.field4428) + var66.field1066[var67];
                        short var69 = var66.field1058[var67];
                        int var70 = (arg1 << super.field4428) + var66.field1062[var67];
                        float var71 = (float) var70 * this.field8074 + (float) var68 * this.field8080 + (float) var69 * this.field8067 + this.field8077;
                        if (var71 <= (float) this.field8087.field7701) {
                            return;
                        }
                        float var72 = (float) var70 * this.field8073 + (float) var68 * this.field8079 + (float) var69 * this.field8072 + this.field8070;
                        float var73 = (float) var70 * this.field8083 + (float) var68 * this.field8082 + (float) var69 * this.field8075 + this.field8086;
                        arg3[var67] = (int) ((float) this.field8087.field7682 * var72 / var71) + arg2.field10526;
                        arg4[var67] = (int) ((float) this.field8087.field7667 * var73 / var71) + arg2.field10527;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field1056; ++var74) {
                        int var110 = (arg0 << super.field4428) + var66.field1066[var74];
                        short var111 = var66.field1058[var74];
                        int var112 = (arg1 << super.field4428) + var66.field1062[var74];
                        float var113 = (float) var112 * this.field8074 + (float) var110 * this.field8080 + (float) var111 * this.field8067 + this.field8077;
                        float var114 = (float) var112 * this.field8073 + (float) var110 * this.field8079 + (float) var111 * this.field8072 + this.field8070;
                        float var115 = (float) var112 * this.field8083 + (float) var110 * this.field8082 + (float) var111 * this.field8075 + this.field8086;
                        arg3[var74] = (int) ((float) this.field8087.field7682 * var114 / (float) this.field8069) + arg2.field10526;
                        arg4[var74] = (int) ((float) this.field8087.field7667 * var115 / (float) this.field8069) + arg2.field10527;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field1057 != null) {
                    if (this.field8069 == -1) {
                        for (int var75 = 0; var75 < var66.field1059; ++var75) {
                            short var76 = var66.field1053[var75];
                            short var77 = var66.field1054[var75];
                            short var78 = var66.field1061[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field10521 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field10524 || var80 > arg2.field10524 || var81 > arg2.field10524;
                                short var85 = var66.field1057[var75];
                                if (var85 != -1) {
                                    arg2.method4210((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field1066[var76] / (float) super.field4419, (float) var66.field1066[var77] / (float) super.field4419, (float) var66.field1066[var78] / (float) super.field4419, (float) var66.field1062[var76] / (float) super.field4419, (float) var66.field1062[var77] / (float) super.field4419, (float) var66.field1062[var78] / (float) super.field4419, -16777216 | class595.field8378[var66.field1060[var76] & 65535] & 16777215, -16777216 | class595.field8378[var66.field1060[var77] & 65535] & 16777215, -16777216 | class595.field8378[var66.field1060[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field1055[var75];
                                    if (var86 != -1) {
                                        arg2.method4207((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class187.method1388(var66.field1060[var76], var86, 1023), (float) class187.method1388(var66.field1060[var77], var86, 1023), (float) class187.method1388(var66.field1060[var78], var86, 1023));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field1059; ++var87) {
                        short var88 = var66.field1053[var87];
                        short var89 = var66.field1054[var87];
                        short var90 = var66.field1061[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field10521 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field10524 || var92 > arg2.field10524 || var93 > arg2.field10524;
                            short var97 = var66.field1057[var87];
                            if (var97 != -1) {
                                arg2.method4210((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field1066[var88] / (float) super.field4419, (float) var66.field1066[var89] / (float) super.field4419, (float) var66.field1066[var90] / (float) super.field4419, (float) var66.field1062[var88] / (float) super.field4419, (float) var66.field1062[var89] / (float) super.field4419, (float) var66.field1062[var90] / (float) super.field4419, -16777216 | class595.field8378[var66.field1060[var88] & 65535] & 16777215, -16777216 | class595.field8378[var66.field1060[var89] & 65535] & 16777215, -16777216 | class595.field8378[var66.field1060[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field1055[var87];
                                if (var98 != -1) {
                                    arg2.method4207((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class187.method1388(var66.field1060[var88], var98, 1023), (float) class187.method1388(var66.field1060[var89], var98, 1023), (float) class187.method1388(var66.field1060[var90], var98, 1023));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field1059; ++var99) {
                    short var100 = var66.field1053[var99];
                    short var101 = var66.field1054[var99];
                    short var102 = var66.field1061[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field1055[var99];
                        if (var109 != -1) {
                            arg2.field10521 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field10524 || var104 > arg2.field10524 || var105 > arg2.field10524;
                            arg2.method4207((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class187.method1388(var66.field1060[var100], var109, 1023), (float) class187.method1388(var66.field1060[var101], var109, 1023), (float) class187.method1388(var66.field1060[var102], var109, 1023));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIIII[[ZLlda;Lsia;[I[I)V")
    private final void method3311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class509 arg8, class765 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7263;
        this.field8087.method408(false);
        arg9.field10515 = false;
        arg9.field10520 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field8066 != null) {
                        if (this.field8066[var18][var19] != null) {
                            class57 var20 = this.field8066[var18][var19];
                            if (var20.field811 != -1 && (var20.field805 & 2) == 0 && var20.field813 == 0) {
                                int var21 = this.field8087.method3164(var20.field811);
                                arg9.method4207((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class187.method1388(var20.field804, var21, 1023), (float) class187.method1388(var20.field810, var21, 1023), (float) class187.method1388(var20.field808, var21, 1023));
                                arg9.method4207((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class187.method1388(var20.field806, var21, 1023), (float) class187.method1388(var20.field808, var21, 1023), (float) class187.method1388(var20.field810, var21, 1023));
                            } else if (var20.field813 == 0) {
                                arg9.method4212((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field804, var20.field810, var20.field808);
                                arg9.method4212((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field806, var20.field808, var20.field810);
                            } else {
                                int var22 = var20.field813;
                                arg9.method4212((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class623.method3557(var20.field804 & -16777216, -114, var22), class623.method3557(var20.field810 & -16777216, -93, var22), class623.method3557(var20.field808 & -16777216, -124, var22));
                                arg9.method4212((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class623.method3557(var20.field806 & -16777216, -121, var22), class623.method3557(var20.field808 & -16777216, -86, var22), class623.method3557(var20.field810 & -16777216, -125, var22));
                            }
                        } else if (this.field8078[var18][var19] != null) {
                            class294 var23 = this.field8078[var18][var19];
                            for (int var24 = 0; var24 < var23.field4444; ++var24) {
                                arg10[var24] = var23.field4434[var24] * var14 / super.field4419 + var16;
                                arg11[var24] = var17 - var23.field4441[var24] * var14 / super.field4419;
                            }
                            for (int var25 = 0; var25 < var23.field4437; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field4443 != null && var23.field4443[var25] != 0 && (var23.field4436 == null || var23.field4436 != null && var23.field4436[var25] == -1)) {
                                    int var35 = var23.field4443[var25];
                                    arg9.method4212((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class623.method3557(-16777216 - (var23.field4439[var26] & -16777216), -114, var35), class623.method3557(-16777216 - (var23.field4439[var27] & -16777216), -106, var35), class623.method3557(-16777216 - (var23.field4439[var28] & -16777216), -120, var35));
                                } else if (var23.field4436 != null && var23.field4436[var25] != -1) {
                                    int var36 = this.field8087.method3164(var23.field4436[var25]);
                                    arg9.method4207((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method4212((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field4439[var26], var23.field4439[var27], var23.field4439[var28]);
                                }
                            }
                        }
                    } else if (this.field8081[var18][var19] != null) {
                        class47 var37 = this.field8081[var18][var19];
                        for (int var38 = 0; var38 < var37.field666; ++var38) {
                            arg10[var38] = var37.field671[var38] * var14 / super.field4419 + var16;
                            arg11[var38] = var17 - var37.field665[var38] * var14 / super.field4419;
                        }
                        for (int var39 = 0; var39 < var37.field668; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field667 != null && var37.field667[var39] != 0) {
                                int var49 = var37.field667[var39];
                                arg9.method4212((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method4212((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field662[var40], var37.field662[var41], var37.field662[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field10515 = true;
        this.field8087.method408(var15);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public final void method1237(int arg0, int arg1) {
        this.method3314(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1241(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field8076 & 32) == 0;
        if (this.field8066 == null && !var15) {
            this.field8066 = new class57[super.field4420][super.field4425];
            this.field8078 = new class294[super.field4420][super.field4425];
        } else if (this.field8081 == null && var15) {
            this.field8081 = new class47[super.field4420][super.field4425];
        } else if (this.field8068 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class595.field8378[class162.method1275(16287, arg6[var16]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class595.field8378[class162.method1275(16287, arg7[var17]) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class47 var18 = new class47();
                var18.field666 = (short) arg2.length;
                var18.field668 = (short) (arg2.length / 3);
                var18.field671 = new short[var18.field666];
                var18.field663 = new short[var18.field666];
                var18.field665 = new short[var18.field666];
                var18.field662 = new int[var18.field666];
                var18.field661 = new short[var18.field666];
                var18.field670 = new short[var18.field666];
                var18.field664 = new byte[var18.field666];
                if (arg5 != null) {
                    var18.field669 = new short[var18.field666];
                }
                for (int var19 = 0; var19 < var18.field666; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field8071[arg0][arg1] - this.field8084[arg0][arg1];
                    } else if (var22 == 0 && super.field4419 == var23) {
                        var25 = this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1];
                    } else if (super.field4419 == var22 && super.field4419 == var23) {
                        var25 = this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1];
                    } else if (super.field4419 == var22 && var23 == 0) {
                        var25 = this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1]) * var22 + (this.field8071[arg0][arg1] - this.field8084[arg0][arg1]) * (super.field4419 - var22);
                        int var27 = (this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1]) * var22 + (this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1]) * (super.field4419 - var22);
                        var25 = (super.field4419 - var23) * var26 + var23 * var27 >> super.field4428 * 2;
                    }
                    int var28 = (arg0 << super.field4428) + var22;
                    int var29 = (arg1 << super.field4428) + var23;
                    var18.field671[var19] = (short) var22;
                    var18.field665[var19] = (short) var23;
                    var18.field663[var19] = (short) (this.method1977((byte) 112, var28, var29) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field662[var19] = 0;
                        if (arg7 != null) {
                            var18.field664[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field669[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method3308(this.field8087.field883.method1263(arg8[var19], (byte) 117).field2745)) {
                            var32 = -1694498816;
                        }
                        var18.field662[var19] = var32 | class246.method1656(var30, true, arg10, method3309(arg6[var19] >> 8, var25));
                        if (arg7 != null) {
                            var18.field664[var19] = (byte) var25;
                        }
                    }
                    var18.field661[var19] = (short) arg8[var19];
                    var18.field670[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field667 = new int[var18.field668];
                }
                for (int var20 = 0; var20 < var18.field668; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field667[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field8081[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field4419 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field4419 && arg4[var38] == super.field4419) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field4419) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field4419 != arg2[var40] && arg2[0] - super.field4419 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field4419 != arg4[var40] && arg4[0] - super.field4419 != arg4[var40]) {
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
                    class57 var41 = new class57();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field813 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field805 = (byte) (var41.field805 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field4424[arg0 + 1][arg1] == super.field4424[arg0][arg1] && super.field4424[arg0 + 1][arg1 + 1] == super.field4424[arg0][arg1] && super.field4424[arg0][arg1 + 1] == super.field4424[arg0][arg1]) {
                        var41.field805 = (byte) (var41.field805 | 1);
                    }
                    if (var43 != -1 && (var41.field805 & 2) == 0 && !this.field8087.field883.method1263(var43, (byte) 125).field2744) {
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
                        var41.field806 = class246.method1656(var44, true, arg10, method3309(arg6[var34] >> 8, this.field8071[arg0][arg1] - this.field8084[arg0][arg1]));
                        if (var41.field813 != 0) {
                            var41.field806 |= 255 - (this.field8071[arg0][arg1] - this.field8084[arg0][arg1]) << 25;
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
                        var41.field808 = class246.method1656(var45, true, arg10, method3309(arg6[var35] >> 8, this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1]));
                        if (var41.field813 != 0) {
                            var41.field808 |= 255 - (this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1]) << 25;
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
                        var41.field804 = class246.method1656(var46, true, arg10, method3309(arg6[var36] >> 8, this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1]));
                        if (var41.field813 != 0) {
                            var41.field804 |= 255 - (this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field810 = class246.method1656(var47, true, arg10, method3309(arg6[var37] >> 8, this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1]));
                        var41.field811 = (short) var43;
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
                        var41.field806 = class246.method1656(var48, true, arg10, method3309(arg6[var34] >> 8, this.field8071[arg0][arg1] - this.field8084[arg0][arg1]));
                        if (var41.field813 != 0) {
                            var41.field806 |= 255 - (this.field8071[arg0][arg1] - this.field8084[arg0][arg1]) << 25;
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
                        var41.field808 = class246.method1656(var49, true, arg10, method3309(arg6[var35] >> 8, this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1]));
                        if (var41.field813 != 0) {
                            var41.field808 |= 255 - (this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1]) << 25;
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
                        var41.field804 = class246.method1656(var50, true, arg10, method3309(arg6[var36] >> 8, this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1]));
                        if (var41.field813 != 0) {
                            var41.field804 |= 255 - (this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field810 = class246.method1656(var51, true, arg10, method3309(arg6[var37] >> 8, this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1]));
                        if (var41.field813 != 0) {
                            var41.field810 |= 255 - (this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1]) << 25;
                        }
                        var41.field811 = -1;
                    }
                    if (arg5 != null) {
                        var41.field809 = (short) arg5[var36];
                        var41.field812 = (short) arg5[var37];
                        var41.field807 = (short) arg5[var35];
                        var41.field814 = (short) arg5[var34];
                    }
                    this.field8066[arg0][arg1] = var41;
                } else {
                    class294 var52 = new class294();
                    var52.field4444 = (short) arg2.length;
                    var52.field4437 = (short) (arg2.length / 3);
                    var52.field4434 = new short[var52.field4444];
                    var52.field4438 = new short[var52.field4444];
                    var52.field4441 = new short[var52.field4444];
                    var52.field4439 = new int[var52.field4444];
                    if (arg5 != null) {
                        var52.field4440 = new short[var52.field4444];
                    }
                    for (int var53 = 0; var53 < var52.field4444; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field8071[arg0][arg1] - this.field8084[arg0][arg1];
                        } else if (var68 == 0 && super.field4419 == var69) {
                            var71 = this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1];
                        } else if (super.field4419 == var68 && super.field4419 == var69) {
                            var71 = this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1];
                        } else if (super.field4419 == var68 && var69 == 0) {
                            var71 = this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field8071[arg0 + 1][arg1] - this.field8084[arg0 + 1][arg1]) * var68 + (this.field8071[arg0][arg1] - this.field8084[arg0][arg1]) * (super.field4419 - var68);
                            int var73 = (this.field8071[arg0 + 1][arg1 + 1] - this.field8084[arg0 + 1][arg1 + 1]) * var68 + (this.field8071[arg0][arg1 + 1] - this.field8084[arg0][arg1 + 1]) * (super.field4419 - var68);
                            var71 = (super.field4419 - var69) * var72 + var69 * var73 >> super.field4428 * 2;
                        }
                        int var74 = (arg0 << super.field4428) + var68;
                        int var75 = (arg1 << super.field4428) + var69;
                        var52.field4434[var53] = (short) var68;
                        var52.field4441[var53] = (short) var69;
                        var52.field4438[var53] = (short) (this.method1977((byte) 116, var74, var75) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field4439[var53] = var71 << 25;
                            } else {
                                var52.field4439[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field4440[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field4439[var53] = class246.method1656(var76, true, arg10, method3309(arg6[var53] >> 8, var71));
                            if (arg7 != null) {
                                var52.field4439[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field4437; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field8087.field883.method1263(arg8[var55 * 3], (byte) 116).field2744) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field4443 = new int[var52.field4437];
                    }
                    if (var54) {
                        var52.field4436 = new short[var52.field4437];
                        var52.field4442 = new short[var52.field4437];
                    }
                    for (int var56 = 0; var56 < var52.field4437; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field4443[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field8087.field883.method1263(var62, (byte) 124).field2744) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field8087.field883.method1263(var63, (byte) 119).field2744) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field8087.field883.method1263(var64, (byte) 124).field2744) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field4436[var56] = (short) var64;
                                var52.field4442[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field8087.field883.method1263(var65, (byte) 120).field2744) {
                                        var52.field4439[var57] = class595.field8378[class162.method1275(16287, this.field8087.field883.method1263(var65, (byte) 117).field2747 & 65535) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field8087.field883.method1263(var66, (byte) 110).field2744) {
                                        var52.field4439[var58] = class595.field8378[class162.method1275(16287, this.field8087.field883.method1263(var66, (byte) 119).field2747 & 65535) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field8087.field883.method1263(var67, (byte) 119).field2744) {
                                        var52.field4439[var59] = class595.field8378[class162.method1275(16287, this.field8087.field883.method1263(var67, (byte) 123).field2747 & 65535) & 65535];
                                    }
                                }
                                var52.field4436[var56] = -1;
                            }
                        }
                    }
                    this.field8078[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "fa", descriptor = "(IILr;)Lr;")
    public final class192 method1249(int arg0, int arg1, class192 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1243(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class628 var7 = this.field8087.field7666;
        this.field8069 = -1;
        this.field8079 = var7.field8896;
        this.field8072 = var7.field8870;
        this.field8073 = var7.field8877;
        this.field8070 = var7.field8873;
        this.field8082 = var7.field8880;
        this.field8075 = var7.field8875;
        this.field8083 = var7.field8886;
        this.field8086 = var7.field8885;
        this.field8080 = var7.field8876;
        this.field8067 = var7.field8897;
        this.field8074 = var7.field8895;
        this.field8077 = var7.field8879;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field4420 && var11 >= 0 && var11 < super.field4425) {
                        this.method3314(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "YA", descriptor = "()V")
    public final void method1238() {
        this.field8071 = null;
        this.field8084 = null;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lni;IIII[[I[[II)V")
    public class570(class545 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field8087 = arg0;
        this.field8076 = arg2;
        this.field8071 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field8087.field7676 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field8087.field7690 * var18 + this.field8087.field7693 * var17 + this.field8087.field7691 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field8071[var11][var10] = (byte) var20;
            }
        }
        this.field8084 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZLlda;Lsia;[I[I[I[II)V")
    private final void method3312(int arg0, int arg1, boolean arg2, class509 arg3, class765 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class47 var11 = this.field8081[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field8069 == -1) {
                    for (int var12 = 0; var12 < var11.field666; ++var12) {
                        int var13 = (arg0 << super.field4428) + var11.field671[var12];
                        int var14 = var11.field663[var12];
                        int var15 = (arg1 << super.field4428) + var11.field665[var12];
                        float var16 = (float) var15 * this.field8074 + (float) var13 * this.field8080 + (float) var14 * this.field8067 + this.field8077;
                        if (var16 <= (float) this.field8087.field7701) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field7260);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field669[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field7248) {
                            int var19 = (int) (var16 - (float) arg3.field7260);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field8073 + (float) var13 * this.field8079 + (float) var14 * this.field8072 + this.field8070;
                        float var21 = (float) var15 * this.field8083 + (float) var13 * this.field8082 + (float) var14 * this.field8075 + this.field8086;
                        arg5[var12] = (int) ((float) this.field8087.field7682 * var20 / var16) + arg4.field10526;
                        arg6[var12] = (int) ((float) this.field8087.field7667 * var21 / var16) + arg4.field10527;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field666; ++var22) {
                        int var36 = (arg0 << super.field4428) + var11.field671[var22];
                        int var37 = var11.field663[var22];
                        int var38 = (arg1 << super.field4428) + var11.field665[var22];
                        float var39 = (float) var38 * this.field8074 + (float) var36 * this.field8080 + (float) var37 * this.field8067 + this.field8077;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field8069 - arg3.field7260;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field669[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field7248) {
                            int var42 = this.field8069 - arg3.field7260;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field8073 + (float) var36 * this.field8079 + (float) var37 * this.field8072 + this.field8070;
                        float var44 = (float) var38 * this.field8083 + (float) var36 * this.field8082 + (float) var37 * this.field8075 + this.field8086;
                        arg5[var22] = (int) ((float) this.field8087.field7682 * var43 / (float) this.field8069) + arg4.field10526;
                        arg6[var22] = (int) ((float) this.field8087.field7667 * var44 / (float) this.field8069) + arg4.field10527;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field4419;
                for (int var24 = 0; var24 < var11.field668; ++var24) {
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
                        arg4.field10521 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field10524 || var29 > arg4.field10524 || var30 > arg4.field10524;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field4428;
                            int var35 = arg1 << super.field4428;
                            if ((var11.field662[var25] & 16777215) != 0) {
                                if (var11.field661[var25] == var11.field661[var26] && var11.field661[var25] == var11.field661[var27] && var11.field670[var25] == var11.field670[var26] && var11.field670[var25] == var11.field670[var27]) {
                                    arg4.method4210((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field671[var25] + var34) / (float) var11.field670[var25], (float) (var11.field671[var26] + var34) / (float) var11.field670[var26], (float) (var11.field671[var27] + var34) / (float) var11.field670[var27], (float) (var11.field665[var25] + var35) / (float) var11.field670[var25], (float) (var11.field665[var26] + var35) / (float) var11.field670[var26], (float) (var11.field665[var27] + var35) / (float) var11.field670[var27], var11.field662[var25], var11.field662[var26], var11.field662[var27], arg3.field7249, arg8[var25], arg8[var26], arg8[var27], var11.field661[var25]);
                                } else {
                                    arg4.method4204((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field671[var25] + var34) / var23, (float) (var11.field671[var26] + var34) / var23, (float) (var11.field671[var27] + var34) / var23, (float) (var11.field665[var25] + var35) / var23, (float) (var11.field665[var26] + var35) / var23, (float) (var11.field665[var27] + var35) / var23, var11.field662[var25], var11.field662[var26], var11.field662[var27], arg3.field7249, arg8[var25], arg8[var26], arg8[var27], var11.field661[var25], var23 / (float) var11.field670[var25], var11.field661[var26], var23 / (float) var11.field670[var26], var11.field661[var27], var23 / (float) var11.field670[var27]);
                                }
                            }
                        } else {
                            arg4.method4200((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field7249);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIZLlda;Lsia;[I[I[I[II)V")
    private final void method3313(int arg0, int arg1, boolean arg2, class509 arg3, class765 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class57 var11 = this.field8066[arg0][arg1];
        if (var11 != null) {
            if ((var11.field805 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field805 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field4419 * arg0;
                int var13 = super.field4419 + var12;
                int var14 = super.field4419 * arg1;
                int var15 = super.field4419 + var14;
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
                if ((var11.field805 & 1) != 0 && !arg2) {
                    int var20 = super.field4424[arg0][arg1];
                    float var21 = (float) var20 * this.field8067;
                    if (this.field8069 == -1) {
                        var22 = (float) var14 * this.field8074 + (float) var12 * this.field8080 + var21 + this.field8077;
                        if (var22 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var23 = (float) var14 * this.field8074 + (float) var13 * this.field8080 + var21 + this.field8077;
                        if (var23 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var24 = (float) var15 * this.field8074 + (float) var13 * this.field8080 + var21 + this.field8077;
                        if (var24 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var25 = (float) var15 * this.field8074 + (float) var12 * this.field8080 + var21 + this.field8077;
                        if (var25 <= (float) this.field8087.field7701) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field8074 + (float) var12 * this.field8080 + var21 + this.field8077;
                        var23 = (float) var14 * this.field8074 + (float) var13 * this.field8080 + var21 + this.field8077;
                        var24 = (float) var15 * this.field8074 + (float) var13 * this.field8080 + var21 + this.field8077;
                        var25 = (float) var15 * this.field8074 + (float) var12 * this.field8080 + var21 + this.field8077;
                    }
                    if (arg3.field7248) {
                        int var26 = (int) (var22 - (float) arg3.field7260);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field7260);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field7260);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field7260);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field8072;
                    float var31 = (float) var20 * this.field8075;
                    if (this.field8069 == -1) {
                        float var32 = (float) var14 * this.field8073 + (float) var12 * this.field8079 + var30 + this.field8070;
                        var33 = (int) ((float) this.field8087.field7682 * var32 / var22) + arg4.field10526;
                        float var34 = (float) var14 * this.field8083 + (float) var12 * this.field8082 + var31 + this.field8086;
                        var35 = (int) ((float) this.field8087.field7667 * var34 / var22) + arg4.field10527;
                        float var36 = (float) var14 * this.field8073 + (float) var13 * this.field8079 + var30 + this.field8070;
                        var37 = (int) ((float) this.field8087.field7682 * var36 / var23) + arg4.field10526;
                        float var38 = (float) var14 * this.field8083 + (float) var13 * this.field8082 + var31 + this.field8086;
                        var39 = (int) ((float) this.field8087.field7667 * var38 / var23) + arg4.field10527;
                        float var40 = (float) var15 * this.field8073 + (float) var13 * this.field8079 + var30 + this.field8070;
                        var41 = (int) ((float) this.field8087.field7682 * var40 / var24) + arg4.field10526;
                        float var42 = (float) var15 * this.field8083 + (float) var13 * this.field8082 + var31 + this.field8086;
                        var43 = (int) ((float) this.field8087.field7667 * var42 / var24) + arg4.field10527;
                        float var44 = (float) var15 * this.field8073 + (float) var12 * this.field8079 + var30 + this.field8070;
                        var45 = (int) ((float) this.field8087.field7682 * var44 / var25) + arg4.field10526;
                        float var46 = (float) var15 * this.field8083 + (float) var12 * this.field8082 + var31 + this.field8086;
                        var47 = (int) ((float) this.field8087.field7667 * var46 / var25) + arg4.field10527;
                    } else {
                        float var48 = (float) var14 * this.field8073 + (float) var12 * this.field8079 + var30 + this.field8070;
                        var33 = (int) ((float) this.field8087.field7682 * var48 / (float) this.field8069) + arg4.field10526;
                        float var49 = (float) var14 * this.field8083 + (float) var12 * this.field8082 + var31 + this.field8086;
                        var35 = (int) ((float) this.field8087.field7667 * var49 / (float) this.field8069) + arg4.field10527;
                        float var50 = (float) var14 * this.field8073 + (float) var13 * this.field8079 + var30 + this.field8070;
                        var37 = (int) ((float) this.field8087.field7682 * var50 / (float) this.field8069) + arg4.field10526;
                        float var51 = (float) var14 * this.field8083 + (float) var13 * this.field8082 + var31 + this.field8086;
                        var39 = (int) ((float) this.field8087.field7667 * var51 / (float) this.field8069) + arg4.field10527;
                        float var52 = (float) var15 * this.field8073 + (float) var13 * this.field8079 + var30 + this.field8070;
                        var41 = (int) ((float) this.field8087.field7682 * var52 / (float) this.field8069) + arg4.field10526;
                        float var53 = (float) var15 * this.field8083 + (float) var13 * this.field8082 + var31 + this.field8086;
                        var43 = (int) ((float) this.field8087.field7667 * var53 / (float) this.field8069) + arg4.field10527;
                        float var54 = (float) var15 * this.field8073 + (float) var12 * this.field8079 + var30 + this.field8070;
                        var45 = (int) ((float) this.field8087.field7682 * var54 / (float) this.field8069) + arg4.field10526;
                        float var55 = (float) var15 * this.field8083 + (float) var12 * this.field8082 + var31 + this.field8086;
                        var47 = (int) ((float) this.field8087.field7667 * var55 / (float) this.field8069) + arg4.field10527;
                    }
                } else {
                    int var56 = super.field4424[arg0][arg1];
                    int var57 = super.field4424[arg0 + 1][arg1];
                    int var58 = super.field4424[arg0 + 1][arg1 + 1];
                    int var59 = super.field4424[arg0][arg1 + 1];
                    if (this.field8069 == -1) {
                        var22 = (float) var14 * this.field8074 + (float) var12 * this.field8080 + (float) var56 * this.field8067 + this.field8077;
                        if (var22 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var23 = (float) var14 * this.field8074 + (float) var13 * this.field8080 + (float) var57 * this.field8067 + this.field8077;
                        if (var23 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var24 = (float) var15 * this.field8074 + (float) var13 * this.field8080 + (float) var58 * this.field8067 + this.field8077;
                        if (var24 <= (float) this.field8087.field7701) {
                            return;
                        }
                        var25 = (float) var15 * this.field8074 + (float) var12 * this.field8080 + (float) var59 * this.field8067 + this.field8077;
                        if (var25 <= (float) this.field8087.field7701) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field8074 + (float) var12 * this.field8080 + (float) var56 * this.field8067 + this.field8077;
                        var23 = (float) var14 * this.field8074 + (float) var13 * this.field8080 + (float) var57 * this.field8067 + this.field8077;
                        var24 = (float) var15 * this.field8074 + (float) var13 * this.field8080 + (float) var58 * this.field8067 + this.field8077;
                        var25 = (float) var15 * this.field8074 + (float) var12 * this.field8080 + (float) var59 * this.field8067 + this.field8077;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field7260);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field814 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field7260);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field807 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field7260);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field809 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field7260);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field812 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field7248) {
                        int var68 = (int) (var22 - (float) arg3.field7260);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field7260);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field7260);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field7260);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field8069 == -1) {
                        float var72 = (float) var14 * this.field8073 + (float) var12 * this.field8079 + (float) var56 * this.field8072 + this.field8070;
                        var33 = (int) ((float) this.field8087.field7682 * var72 / var22) + arg4.field10526;
                        float var73 = (float) var14 * this.field8083 + (float) var12 * this.field8082 + (float) var56 * this.field8075 + this.field8086;
                        var35 = (int) ((float) this.field8087.field7667 * var73 / var22) + arg4.field10527;
                        float var74 = (float) var14 * this.field8073 + (float) var13 * this.field8079 + (float) var57 * this.field8072 + this.field8070;
                        var37 = (int) ((float) this.field8087.field7682 * var74 / var23) + arg4.field10526;
                        float var75 = (float) var14 * this.field8083 + (float) var13 * this.field8082 + (float) var57 * this.field8075 + this.field8086;
                        var39 = (int) ((float) this.field8087.field7667 * var75 / var23) + arg4.field10527;
                        float var76 = (float) var15 * this.field8073 + (float) var13 * this.field8079 + (float) var58 * this.field8072 + this.field8070;
                        var41 = (int) ((float) this.field8087.field7682 * var76 / var24) + arg4.field10526;
                        float var77 = (float) var15 * this.field8083 + (float) var13 * this.field8082 + (float) var58 * this.field8075 + this.field8086;
                        var43 = (int) ((float) this.field8087.field7667 * var77 / var24) + arg4.field10527;
                        float var78 = (float) var15 * this.field8073 + (float) var12 * this.field8079 + (float) var59 * this.field8072 + this.field8070;
                        var45 = (int) ((float) this.field8087.field7682 * var78 / var25) + arg4.field10526;
                        float var79 = (float) var15 * this.field8083 + (float) var12 * this.field8082 + (float) var59 * this.field8075 + this.field8086;
                        var47 = (int) ((float) this.field8087.field7667 * var79 / var25) + arg4.field10527;
                    } else {
                        float var80 = (float) var14 * this.field8073 + (float) var12 * this.field8079 + (float) var56 * this.field8072 + this.field8070;
                        var33 = (int) ((float) this.field8087.field7682 * var80 / (float) this.field8069) + arg4.field10526;
                        float var81 = (float) var14 * this.field8083 + (float) var12 * this.field8082 + (float) var56 * this.field8075 + this.field8086;
                        var35 = (int) ((float) this.field8087.field7667 * var81 / (float) this.field8069) + arg4.field10527;
                        float var82 = (float) var14 * this.field8073 + (float) var13 * this.field8079 + (float) var57 * this.field8072 + this.field8070;
                        var37 = (int) ((float) this.field8087.field7682 * var82 / (float) this.field8069) + arg4.field10526;
                        float var83 = (float) var14 * this.field8083 + (float) var13 * this.field8082 + (float) var57 * this.field8075 + this.field8086;
                        var39 = (int) ((float) this.field8087.field7667 * var83 / (float) this.field8069) + arg4.field10527;
                        float var84 = (float) var15 * this.field8073 + (float) var13 * this.field8079 + (float) var58 * this.field8072 + this.field8070;
                        var41 = (int) ((float) this.field8087.field7682 * var84 / (float) this.field8069) + arg4.field10526;
                        float var85 = (float) var15 * this.field8083 + (float) var13 * this.field8082 + (float) var58 * this.field8075 + this.field8086;
                        var43 = (int) ((float) this.field8087.field7667 * var85 / (float) this.field8069) + arg4.field10527;
                        float var86 = (float) var15 * this.field8073 + (float) var12 * this.field8079 + (float) var59 * this.field8072 + this.field8070;
                        var45 = (int) ((float) this.field8087.field7682 * var86 / (float) this.field8069) + arg4.field10526;
                        float var87 = (float) var15 * this.field8083 + (float) var12 * this.field8082 + (float) var59 * this.field8075 + this.field8086;
                        var47 = (int) ((float) this.field8087.field7667 * var87 / (float) this.field8069) + arg4.field10527;
                    }
                }
                boolean var88 = var11.field811 != -1 && this.method3308(this.field8087.field883.method1263(var11.field811, (byte) 122).field2745);
                if (this.field8069 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field10521 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field10524 || var45 > arg4.field10524 || var37 > arg4.field10524;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field811 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method4210((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field804 & 16777215, var90 | var11.field810 & 16777215, var90 | var11.field808 & 16777215, arg3.field7249, var18, var19, var17, var11.field811);
                                } else {
                                    if (var88) {
                                        arg4.field10517 = 100;
                                    }
                                    arg4.method4212((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class623.method3557(var18 << 24 | arg3.field7249, -79, var11.field804), class623.method3557(var19 << 24 | arg3.field7249, -100, var11.field810), class623.method3557(var17 << 24 | arg3.field7249, -85, var11.field808));
                                    arg4.field10517 = 0;
                                }
                            } else if (var11.field811 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method4210((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field804 & 16777215, var91 | var11.field810 & 16777215, var91 | var11.field808 & 16777215, 0, 0, 0, 0, var11.field811);
                            } else {
                                if (var88) {
                                    arg4.field10517 = 100;
                                }
                                arg4.method4212((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field804, var11.field810, var11.field808);
                                arg4.field10517 = 0;
                            }
                        } else {
                            arg4.method4200((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7249);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field10521 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field10524 || var37 > arg4.field10524 || var45 > arg4.field10524;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field10517 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field811 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method4210((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field806 & 16777215, var93 | var11.field808 & 16777215, var93 | var11.field810 & 16777215, arg3.field7249, var16, var17, var19, var11.field811);
                                    return;
                                }
                                if (var88) {
                                    arg4.field10517 = 100;
                                }
                                arg4.method4212((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class623.method3557(var16 << 24 | arg3.field7249, -127, var11.field806), class623.method3557(var17 << 24 | arg3.field7249, -73, var11.field808), class623.method3557(var19 << 24 | arg3.field7249, -80, var11.field810));
                                arg4.field10517 = 0;
                                return;
                            }
                            if (var11.field811 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method4210((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field806 & 16777215, var94 | var11.field808 & 16777215, var94 | var11.field810 & 16777215, 0, 0, 0, 0, var11.field811);
                                return;
                            }
                            if (var88) {
                                arg4.field10517 = 100;
                            }
                            arg4.method4212((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field806, var11.field808, var11.field810);
                            arg4.field10517 = 0;
                            return;
                        }
                        arg4.method4200((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7249);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field10521 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field10524 || var45 > arg4.field10524 || var37 > arg4.field10524;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field10517 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field811 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method4210((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field804 & 16777215, var96 | var11.field810 & 16777215, var96 | var11.field808 & 16777215, arg3.field7249, var18, var19, var17, var11.field811);
                                } else {
                                    if (var88) {
                                        arg4.field10517 = 100;
                                    }
                                    arg4.method4212((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class623.method3557(var18 << 24 | arg3.field7249, -126, var11.field804), class623.method3557(var19 << 24 | arg3.field7249, -103, var11.field810), class623.method3557(var17 << 24 | arg3.field7249, -112, var11.field808));
                                    arg4.field10517 = 0;
                                }
                            } else if (var11.field811 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method4210((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field804 & 16777215, var97 | var11.field810 & 16777215, var97 | var11.field808 & 16777215, 0, 0, 0, 0, var11.field811);
                            } else {
                                if (var88) {
                                    arg4.field10517 = 100;
                                }
                                arg4.method4212((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field804, var11.field810, var11.field808);
                                arg4.field10517 = 0;
                            }
                        } else {
                            arg4.method4200((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7249);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field10521 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field10524 || var37 > arg4.field10524 || var45 > arg4.field10524;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field10517 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field811 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method4210((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field806 & 16777215, var99 | var11.field808 & 16777215, var99 | var11.field810 & 16777215, arg3.field7249, var16, var17, var19, var11.field811);
                                    return;
                                }
                                if (var88) {
                                    arg4.field10517 = 100;
                                }
                                arg4.method4212((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class623.method3557(var16 << 24 | arg3.field7249, -80, var11.field806), class623.method3557(var17 << 24 | arg3.field7249, -85, var11.field808), class623.method3557(var19 << 24 | arg3.field7249, -124, var11.field810));
                                arg4.field10517 = 0;
                                return;
                            }
                            if (var11.field811 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method4210((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field806 & 16777215, var100 | var11.field808 & 16777215, var100 | var11.field810 & 16777215, 0, 0, 0, 0, var11.field811);
                                return;
                            }
                            if (var88) {
                                arg4.field10517 = 100;
                            }
                            arg4.method4212((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field806, var11.field808, var11.field810);
                            arg4.field10517 = 0;
                            return;
                        }
                        arg4.method4200((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7249);
                    }
                }
            }
        } else {
            class294 var101 = this.field8078[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field4435 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field8069 == -1) {
                    for (int var102 = 0; var102 < var101.field4444; ++var102) {
                        int var103 = (arg0 << super.field4428) + var101.field4434[var102];
                        int var104 = var101.field4438[var102];
                        int var105 = (arg1 << super.field4428) + var101.field4441[var102];
                        float var106 = (float) var105 * this.field8074 + (float) var103 * this.field8080 + (float) var104 * this.field8067 + this.field8077;
                        if (var106 <= (float) this.field8087.field7701) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field7260);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field4440[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field7248) {
                            int var109 = (int) (var106 - (float) arg3.field7260);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field8073 + (float) var103 * this.field8079 + (float) var104 * this.field8072 + this.field8070;
                        float var111 = (float) var105 * this.field8083 + (float) var103 * this.field8082 + (float) var104 * this.field8075 + this.field8086;
                        arg5[var102] = (int) ((float) this.field8087.field7682 * var110 / var106) + arg4.field10526;
                        arg6[var102] = (int) ((float) this.field8087.field7667 * var111 / var106) + arg4.field10527;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field4444; ++var112) {
                        int var152 = (arg0 << super.field4428) + var101.field4434[var112];
                        int var153 = var101.field4438[var112];
                        int var154 = (arg1 << super.field4428) + var101.field4441[var112];
                        float var155 = (float) var154 * this.field8074 + (float) var152 * this.field8080 + (float) var153 * this.field8067 + this.field8077;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field8069 - arg3.field7260;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field4440[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field7248) {
                            int var158 = this.field8069 - arg3.field7260;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field8073 + (float) var152 * this.field8079 + (float) var153 * this.field8072 + this.field8070;
                        float var160 = (float) var154 * this.field8083 + (float) var152 * this.field8082 + (float) var153 * this.field8075 + this.field8086;
                        arg5[var112] = (int) ((float) this.field8087.field7682 * var159 / (float) this.field8069) + arg4.field10526;
                        arg6[var112] = (int) ((float) this.field8087.field7667 * var160 / (float) this.field8069) + arg4.field10527;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field4436 != null) {
                    if (this.field8069 == -1) {
                        for (int var113 = 0; var113 < var101.field4437; ++var113) {
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
                                arg4.field10521 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field10524 || var118 > arg4.field10524 || var119 > arg4.field10524;
                                short var124 = var101.field4436[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method3308(this.field8087.field883.method1263(var124, (byte) 127).field2745)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method4210((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field4434[var114] / (float) super.field4419, (float) var101.field4434[var115] / (float) super.field4419, (float) var101.field4434[var116] / (float) super.field4419, (float) var101.field4441[var114] / (float) super.field4419, (float) var101.field4441[var115] / (float) super.field4419, (float) var101.field4441[var116] / (float) super.field4419, var125 | var101.field4439[var114] & 16777215, var125 | var101.field4439[var115] & 16777215, var125 | var101.field4439[var116] & 16777215, arg3.field7249, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field4439[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method3308(this.field8087.field883.method1263(var124, (byte) 111).field2745)) {
                                                arg4.field10517 = -1694498816;
                                            }
                                            arg4.method4212((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class623.method3557(arg8[var114] << 24 | arg3.field7249, -76, var101.field4439[var114]), class623.method3557(arg8[var115] << 24 | arg3.field7249, -104, var101.field4439[var115]), class623.method3557(arg8[var116] << 24 | arg3.field7249, -104, var101.field4439[var116]));
                                            arg4.field10517 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method3308(this.field8087.field883.method1263(var124, (byte) 120).field2745)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method4210((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field4434[var114] / (float) super.field4419, (float) var101.field4434[var115] / (float) super.field4419, (float) var101.field4434[var116] / (float) super.field4419, (float) var101.field4441[var114] / (float) super.field4419, (float) var101.field4441[var115] / (float) super.field4419, (float) var101.field4441[var116] / (float) super.field4419, var126 | var101.field4439[var114] & 16777215, var126 | var101.field4439[var115] & 16777215, var126 | var101.field4439[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field4439[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method3308(this.field8087.field883.method1263(var124, (byte) 124).field2745)) {
                                            arg4.field10517 = -1694498816;
                                        }
                                        arg4.method4212((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field4439[var114], var101.field4439[var115], var101.field4439[var116]);
                                        arg4.field10517 = 0;
                                    }
                                } else {
                                    arg4.method4200((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field7249);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field4437; ++var127) {
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
                            arg4.field10521 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field10524 || var132 > arg4.field10524 || var133 > arg4.field10524;
                            short var138 = var101.field4436[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method3308(this.field8087.field883.method1263(var138, (byte) 118).field2745)) {
                                    arg4.field10517 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method3308(this.field8087.field883.method1263(var138, (byte) 123).field2745)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method4210((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field4434[var128] / (float) super.field4419, (float) var101.field4434[var129] / (float) super.field4419, (float) var101.field4434[var130] / (float) super.field4419, (float) var101.field4441[var128] / (float) super.field4419, (float) var101.field4441[var129] / (float) super.field4419, (float) var101.field4441[var130] / (float) super.field4419, var139 | var101.field4439[var128] & 16777215, var139 | var101.field4439[var129] & 16777215, var139 | var101.field4439[var130] & 16777215, arg3.field7249, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field4439[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method3308(this.field8087.field883.method1263(var138, (byte) 125).field2745)) {
                                            arg4.field10517 = -1694498816;
                                        }
                                        arg4.method4212((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class623.method3557(arg8[var128] << 24 | arg3.field7249, -127, var101.field4439[var128]), class623.method3557(arg8[var129] << 24 | arg3.field7249, -124, var101.field4439[var129]), class623.method3557(arg8[var130] << 24 | arg3.field7249, -92, var101.field4439[var130]));
                                        arg4.field10517 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method3308(this.field8087.field883.method1263(var138, (byte) 115).field2745)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method4210((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field4434[var128] / (float) super.field4419, (float) var101.field4434[var129] / (float) super.field4419, (float) var101.field4434[var130] / (float) super.field4419, (float) var101.field4441[var128] / (float) super.field4419, (float) var101.field4441[var129] / (float) super.field4419, (float) var101.field4441[var130] / (float) super.field4419, var140 | var101.field4439[var128] & 16777215, var140 | var101.field4439[var129] & 16777215, var140 | var101.field4439[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field4439[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method3308(this.field8087.field883.method1263(var138, (byte) 113).field2745)) {
                                        arg4.field10517 = -1694498816;
                                    }
                                    arg4.method4212((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field4439[var128], var101.field4439[var129], var101.field4439[var130]);
                                    arg4.field10517 = 0;
                                }
                                arg4.field10517 = 0;
                            } else {
                                arg4.method4200((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field7249);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field4437; ++var141) {
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
                        arg4.field10521 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field10524 || var146 > arg4.field10524 || var147 > arg4.field10524;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field4439[var142] & 16777215) != 0) {
                                    arg4.method4212((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class246.method1656(arg8[var142], true, arg3.field7249, var101.field4439[var142]), class246.method1656(arg8[var143], true, arg3.field7249, var101.field4439[var143]), class246.method1656(arg8[var144], true, arg3.field7249, var101.field4439[var144]));
                                }
                            } else if ((var101.field4439[var142] & 16777215) != 0) {
                                arg4.method4212((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field4439[var142], var101.field4439[var143], var101.field4439[var144]);
                            }
                        } else {
                            arg4.method4200((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field7249);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(III)V")
    private final void method3314(int arg0, int arg1, int arg2) {
        class509 var4 = this.field8087.method3167(Thread.currentThread());
        var4.field7291.field10517 = 0;
        if (this.field8066 != null) {
            this.method3313(arg0, arg1, var4.field7257, var4, var4.field7291, var4.field7284, var4.field7264, var4.field7290, var4.field7275, arg2);
        } else if (this.field8068 != null) {
            this.method3310(arg0, arg1, var4.field7291, var4.field7284, var4.field7264, var4.field7290, var4.field7275, arg2);
        } else {
            if (this.field8081 != null) {
                this.method3312(arg0, arg1, var4.field7257, var4, var4.field7291, var4.field7284, var4.field7264, var4.field7290, var4.field7275, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1240(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ea", name = "ka", descriptor = "(III)V")
    public final void method1245(int arg0, int arg1, int arg2) {
        if (this.field8084[arg0][arg1] < arg2) {
            this.field8084[arg0][arg1] = (byte) arg2;
        }
    }
}
