import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class84 extends class339 {

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    private int field1178 = -1;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "Lii;")
    private class521 field1173;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    private int field1169;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "[[B")
    private byte[][] field1172;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "[[B")
    private byte[][] field1166;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "F")
    private float field1159;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "F")
    private float field1160;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "F")
    private float field1161;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "F")
    private float field1162;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "F")
    private float field1163;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "F")
    private float field1167;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "F")
    private float field1170;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "F")
    private float field1174;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "F")
    private float field1175;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "F")
    private float field1176;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "F")
    private float field1177;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "F")
    private float field1180;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "[[Lrga;")
    private class291[][] field1168;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "[[Lpj;")
    private class39[][] field1171;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "[[Lbs;")
    private class434[][] field1164;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "[[Lus;")
    private class454[][] field1165;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "[[Lhc;")
    private class73[][] field1179;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)I", line = 4)
    private static final int method498(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZLae;Lvk;[I[I[I[II)V", line = 34)
    private final void method499(int arg0, int arg1, boolean arg2, class351 arg3, class239 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class454 var11 = this.field1165[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field1178 == -1) {
                    for (int var12 = 0; var12 < var11.field6252; ++var12) {
                        int var13 = (arg0 << super.field4349) + var11.field6255[var12];
                        int var14 = var11.field6249[var12];
                        int var15 = (arg1 << super.field4349) + var11.field6248[var12];
                        float var16 = (float) var15 * this.field1163 + (float) var13 * this.field1167 + (float) var14 * this.field1177 + this.field1175;
                        if (var16 <= (float) this.field1173.field7300) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field4455);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field6250[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field4470) {
                            int var19 = (int) (var16 - (float) arg3.field4455);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field1180 + (float) var13 * this.field1159 + (float) var14 * this.field1161 + this.field1162;
                        float var21 = (float) var15 * this.field1160 + (float) var13 * this.field1174 + (float) var14 * this.field1176 + this.field1170;
                        arg5[var12] = (int) ((float) this.field1173.field7305 * var20 / var16) + arg4.field3322;
                        arg6[var12] = (int) ((float) this.field1173.field7318 * var21 / var16) + arg4.field3326;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field6252; ++var22) {
                        int var36 = (arg0 << super.field4349) + var11.field6255[var22];
                        int var37 = var11.field6249[var22];
                        int var38 = (arg1 << super.field4349) + var11.field6248[var22];
                        float var39 = (float) var38 * this.field1163 + (float) var36 * this.field1167 + (float) var37 * this.field1177 + this.field1175;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field1178 - arg3.field4455;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field6250[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field4470) {
                            int var42 = this.field1178 - arg3.field4455;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field1180 + (float) var36 * this.field1159 + (float) var37 * this.field1161 + this.field1162;
                        float var44 = (float) var38 * this.field1160 + (float) var36 * this.field1174 + (float) var37 * this.field1176 + this.field1170;
                        arg5[var22] = (int) ((float) this.field1173.field7305 * var43 / (float) this.field1178) + arg4.field3322;
                        arg6[var22] = (int) ((float) this.field1173.field7318 * var44 / (float) this.field1178) + arg4.field3326;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field4346;
                for (int var24 = 0; var24 < var11.field6251; ++var24) {
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
                        arg4.field3317 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field3324 || var29 > arg4.field3324 || var30 > arg4.field3324;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field4349;
                            int var35 = arg1 << super.field4349;
                            if ((var11.field6245[var25] & 16777215) != 0) {
                                if (var11.field6247[var25] == var11.field6247[var26] && var11.field6247[var25] == var11.field6247[var27] && var11.field6246[var25] == var11.field6246[var26] && var11.field6246[var25] == var11.field6246[var27]) {
                                    arg4.method1530((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field6255[var25] + var34) / (float) var11.field6246[var25], (float) (var11.field6255[var26] + var34) / (float) var11.field6246[var26], (float) (var11.field6255[var27] + var34) / (float) var11.field6246[var27], (float) (var11.field6248[var25] + var35) / (float) var11.field6246[var25], (float) (var11.field6248[var26] + var35) / (float) var11.field6246[var26], (float) (var11.field6248[var27] + var35) / (float) var11.field6246[var27], var11.field6245[var25], var11.field6245[var26], var11.field6245[var27], arg3.field4459, arg8[var25], arg8[var26], arg8[var27], var11.field6247[var25]);
                                } else {
                                    arg4.method1520((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field6255[var25] + var34) / var23, (float) (var11.field6255[var26] + var34) / var23, (float) (var11.field6255[var27] + var34) / var23, (float) (var11.field6248[var25] + var35) / var23, (float) (var11.field6248[var26] + var35) / var23, (float) (var11.field6248[var27] + var35) / var23, var11.field6245[var25], var11.field6245[var26], var11.field6245[var27], arg3.field4459, arg8[var25], arg8[var26], arg8[var27], var11.field6247[var25], var23 / (float) var11.field6246[var25], var11.field6247[var26], var23 / (float) var11.field6246[var26], var11.field6247[var27], var23 / (float) var11.field6246[var27]);
                                }
                            }
                        } else {
                            arg4.method1518((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field4459);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 226)
    public final void method500(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(III)V", line = 231)
    private final void method501(int arg0, int arg1, int arg2) {
        class351 var4 = this.field1173.method3097(Thread.currentThread());
        var4.field4494.field3329 = 0;
        if (this.field1179 != null) {
            this.method509(arg0, arg1, var4.field4461, var4, var4.field4494, var4.field4493, var4.field4472, var4.field4474, var4.field4488, arg2);
        } else if (this.field1171 != null) {
            this.method503(arg0, arg1, var4.field4494, var4.field4493, var4.field4472, var4.field4474, var4.field4488, arg2);
        } else {
            if (this.field1165 != null) {
                this.method499(arg0, arg1, var4.field4461, var4, var4.field4494, var4.field4493, var4.field4472, var4.field4474, var4.field4488, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 246)
    public final void method502(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILvk;[I[I[I[II)V", line = 251)
    private final void method503(int arg0, int arg1, class239 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class39 var9 = this.field1171[arg0][arg1];
        if (var9 != null) {
            if ((var9.field545 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field545 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field4346 * arg0;
                int var11 = super.field4346 + var10;
                int var12 = super.field4346 * arg1;
                int var13 = super.field4346 + var12;
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
                if ((var9.field545 & 1) != 0) {
                    int var14 = super.field4343[arg0][arg1];
                    float var15 = (float) var14 * this.field1177;
                    if (this.field1178 == -1) {
                        var16 = (float) var12 * this.field1163 + (float) var10 * this.field1167 + var15 + this.field1175;
                        if (var16 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var17 = (float) var12 * this.field1163 + (float) var11 * this.field1167 + var15 + this.field1175;
                        if (var17 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var18 = (float) var13 * this.field1163 + (float) var11 * this.field1167 + var15 + this.field1175;
                        if (var18 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var19 = (float) var13 * this.field1163 + (float) var10 * this.field1167 + var15 + this.field1175;
                        if (var19 <= (float) this.field1173.field7300) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field1163 + (float) var10 * this.field1167 + var15 + this.field1175;
                        var17 = (float) var12 * this.field1163 + (float) var11 * this.field1167 + var15 + this.field1175;
                        var18 = (float) var13 * this.field1163 + (float) var11 * this.field1167 + var15 + this.field1175;
                        var19 = (float) var13 * this.field1163 + (float) var10 * this.field1167 + var15 + this.field1175;
                    }
                    float var20 = (float) var14 * this.field1161;
                    float var21 = (float) var14 * this.field1176;
                    if (this.field1178 == -1) {
                        float var22 = (float) var12 * this.field1180 + (float) var10 * this.field1159 + var20 + this.field1162;
                        var23 = (int) ((float) this.field1173.field7305 * var22 / var16) + arg2.field3322;
                        float var24 = (float) var12 * this.field1160 + (float) var10 * this.field1174 + var21 + this.field1170;
                        var25 = (int) ((float) this.field1173.field7318 * var24 / var16) + arg2.field3326;
                        float var26 = (float) var12 * this.field1180 + (float) var11 * this.field1159 + var20 + this.field1162;
                        var27 = (int) ((float) this.field1173.field7305 * var26 / var17) + arg2.field3322;
                        float var28 = (float) var12 * this.field1160 + (float) var11 * this.field1174 + var21 + this.field1170;
                        var29 = (int) ((float) this.field1173.field7318 * var28 / var17) + arg2.field3326;
                        float var30 = (float) var13 * this.field1180 + (float) var11 * this.field1159 + var20 + this.field1162;
                        var31 = (int) ((float) this.field1173.field7305 * var30 / var18) + arg2.field3322;
                        float var32 = (float) var13 * this.field1160 + (float) var11 * this.field1174 + var21 + this.field1170;
                        var33 = (int) ((float) this.field1173.field7318 * var32 / var18) + arg2.field3326;
                        float var34 = (float) var13 * this.field1180 + (float) var10 * this.field1159 + var20 + this.field1162;
                        var35 = (int) ((float) this.field1173.field7305 * var34 / var19) + arg2.field3322;
                        float var36 = (float) var13 * this.field1160 + (float) var10 * this.field1174 + var21 + this.field1170;
                        var37 = (int) ((float) this.field1173.field7318 * var36 / var19) + arg2.field3326;
                    } else {
                        float var38 = (float) var12 * this.field1180 + (float) var10 * this.field1159 + var20 + this.field1162;
                        var23 = (int) ((float) this.field1173.field7305 * var38 / (float) this.field1178) + arg2.field3322;
                        float var39 = (float) var12 * this.field1160 + (float) var10 * this.field1174 + var21 + this.field1170;
                        var25 = (int) ((float) this.field1173.field7318 * var39 / (float) this.field1178) + arg2.field3326;
                        float var40 = (float) var12 * this.field1180 + (float) var11 * this.field1159 + var20 + this.field1162;
                        var27 = (int) ((float) this.field1173.field7305 * var40 / (float) this.field1178) + arg2.field3322;
                        float var41 = (float) var12 * this.field1160 + (float) var11 * this.field1174 + var21 + this.field1170;
                        var29 = (int) ((float) this.field1173.field7318 * var41 / (float) this.field1178) + arg2.field3326;
                        float var42 = (float) var13 * this.field1180 + (float) var11 * this.field1159 + var20 + this.field1162;
                        var31 = (int) ((float) this.field1173.field7305 * var42 / (float) this.field1178) + arg2.field3322;
                        float var43 = (float) var13 * this.field1160 + (float) var11 * this.field1174 + var21 + this.field1170;
                        var33 = (int) ((float) this.field1173.field7318 * var43 / (float) this.field1178) + arg2.field3326;
                        float var44 = (float) var13 * this.field1180 + (float) var10 * this.field1159 + var20 + this.field1162;
                        var35 = (int) ((float) this.field1173.field7305 * var44 / (float) this.field1178) + arg2.field3322;
                        float var45 = (float) var13 * this.field1160 + (float) var10 * this.field1174 + var21 + this.field1170;
                        var37 = (int) ((float) this.field1173.field7318 * var45 / (float) this.field1178) + arg2.field3326;
                    }
                } else {
                    int var46 = super.field4343[arg0][arg1];
                    int var47 = super.field4343[arg0 + 1][arg1];
                    int var48 = super.field4343[arg0 + 1][arg1 + 1];
                    int var49 = super.field4343[arg0][arg1 + 1];
                    if (this.field1178 == -1) {
                        var16 = (float) var12 * this.field1163 + (float) var10 * this.field1167 + (float) var46 * this.field1177 + this.field1175;
                        if (var16 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var17 = (float) var12 * this.field1163 + (float) var11 * this.field1167 + (float) var47 * this.field1177 + this.field1175;
                        if (var17 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var18 = (float) var13 * this.field1163 + (float) var11 * this.field1167 + (float) var48 * this.field1177 + this.field1175;
                        if (var18 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var19 = (float) var13 * this.field1163 + (float) var10 * this.field1167 + (float) var49 * this.field1177 + this.field1175;
                        if (var19 <= (float) this.field1173.field7300) {
                            return;
                        }
                        float var50 = (float) var12 * this.field1180 + (float) var10 * this.field1159 + (float) var46 * this.field1161 + this.field1162;
                        var23 = (int) ((float) this.field1173.field7305 * var50 / var16) + arg2.field3322;
                        float var51 = (float) var12 * this.field1160 + (float) var10 * this.field1174 + (float) var46 * this.field1176 + this.field1170;
                        var25 = (int) ((float) this.field1173.field7318 * var51 / var16) + arg2.field3326;
                        float var52 = (float) var12 * this.field1180 + (float) var11 * this.field1159 + (float) var47 * this.field1161 + this.field1162;
                        var27 = (int) ((float) this.field1173.field7305 * var52 / var17) + arg2.field3322;
                        float var53 = (float) var12 * this.field1160 + (float) var11 * this.field1174 + (float) var47 * this.field1176 + this.field1170;
                        var29 = (int) ((float) this.field1173.field7318 * var53 / var17) + arg2.field3326;
                        float var54 = (float) var13 * this.field1180 + (float) var11 * this.field1159 + (float) var48 * this.field1161 + this.field1162;
                        var31 = (int) ((float) this.field1173.field7305 * var54 / var18) + arg2.field3322;
                        float var55 = (float) var13 * this.field1160 + (float) var11 * this.field1174 + (float) var48 * this.field1176 + this.field1170;
                        var33 = (int) ((float) this.field1173.field7318 * var55 / var18) + arg2.field3326;
                        float var56 = (float) var13 * this.field1180 + (float) var10 * this.field1159 + (float) var49 * this.field1161 + this.field1162;
                        var35 = (int) ((float) this.field1173.field7305 * var56 / var19) + arg2.field3322;
                        float var57 = (float) var13 * this.field1160 + (float) var10 * this.field1174 + (float) var49 * this.field1176 + this.field1170;
                        var37 = (int) ((float) this.field1173.field7318 * var57 / var19) + arg2.field3326;
                    } else {
                        var16 = (float) var12 * this.field1163 + (float) var10 * this.field1167 + (float) var46 * this.field1177 + this.field1175;
                        var17 = (float) var12 * this.field1163 + (float) var11 * this.field1167 + (float) var47 * this.field1177 + this.field1175;
                        var18 = (float) var13 * this.field1163 + (float) var11 * this.field1167 + (float) var48 * this.field1177 + this.field1175;
                        var19 = (float) var13 * this.field1163 + (float) var10 * this.field1167 + (float) var49 * this.field1177 + this.field1175;
                        float var58 = (float) var12 * this.field1180 + (float) var10 * this.field1159 + (float) var46 * this.field1161 + this.field1162;
                        var23 = (int) ((float) this.field1173.field7305 * var58 / (float) this.field1178) + arg2.field3322;
                        float var59 = (float) var12 * this.field1160 + (float) var10 * this.field1174 + (float) var46 * this.field1176 + this.field1170;
                        var25 = (int) ((float) this.field1173.field7318 * var59 / (float) this.field1178) + arg2.field3326;
                        float var60 = (float) var12 * this.field1180 + (float) var11 * this.field1159 + (float) var47 * this.field1161 + this.field1162;
                        var27 = (int) ((float) this.field1173.field7305 * var60 / (float) this.field1178) + arg2.field3322;
                        float var61 = (float) var12 * this.field1160 + (float) var11 * this.field1174 + (float) var47 * this.field1176 + this.field1170;
                        var29 = (int) ((float) this.field1173.field7318 * var61 / (float) this.field1178) + arg2.field3326;
                        float var62 = (float) var13 * this.field1180 + (float) var11 * this.field1159 + (float) var48 * this.field1161 + this.field1162;
                        var31 = (int) ((float) this.field1173.field7305 * var62 / (float) this.field1178) + arg2.field3322;
                        float var63 = (float) var13 * this.field1160 + (float) var11 * this.field1174 + (float) var48 * this.field1176 + this.field1170;
                        var33 = (int) ((float) this.field1173.field7318 * var63 / (float) this.field1178) + arg2.field3326;
                        float var64 = (float) var13 * this.field1180 + (float) var10 * this.field1159 + (float) var49 * this.field1161 + this.field1162;
                        var35 = (int) ((float) this.field1173.field7305 * var64 / (float) this.field1178) + arg2.field3322;
                        float var65 = (float) var13 * this.field1160 + (float) var10 * this.field1174 + (float) var49 * this.field1176 + this.field1170;
                        var37 = (int) ((float) this.field1173.field7318 * var65 / (float) this.field1178) + arg2.field3326;
                    }
                }
                if (this.field1178 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field3317 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field3324 || var35 > arg2.field3324 || var27 > arg2.field3324;
                        if (var9.field546 >= 0) {
                            arg2.method1530((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class278.field3718[var9.field547 & 65535] & 16777215, -16777216 | class278.field3718[var9.field548 & 65535] & 16777215, -16777216 | class278.field3718[var9.field549 & 65535] & 16777215, 0, 0, 0, 0, var9.field546);
                        } else {
                            arg2.method1522((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field547 & 65535), (float) (var9.field548 & 65535), (float) (var9.field549 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field3317 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field3324 || var27 > arg2.field3324 || var35 > arg2.field3324;
                        if (var9.field546 >= 0) {
                            arg2.method1530((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class278.field3718[var9.field551 & 65535] & 16777215, -16777216 | class278.field3718[var9.field549 & 65535] & 16777215, -16777216 | class278.field3718[var9.field548 & 65535] & 16777215, 0, 0, 0, 0, var9.field546);
                            return;
                        }
                        arg2.method1522((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field551 & 65535), (float) (var9.field549 & 65535), (float) (var9.field548 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field3317 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field3324 || var35 > arg2.field3324 || var27 > arg2.field3324;
                        if (var9.field546 >= 0) {
                            arg2.method1530((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class278.field3718[var9.field547 & 65535] & 16777215, -16777216 | class278.field3718[var9.field548 & 65535] & 16777215, -16777216 | class278.field3718[var9.field549 & 65535] & 16777215, 0, 0, 0, 0, var9.field546);
                        } else {
                            arg2.method1522((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field547 & 65535), (float) (var9.field548 & 65535), (float) (var9.field549 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field3317 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field3324 || var27 > arg2.field3324 || var35 > arg2.field3324;
                        if (var9.field546 >= 0) {
                            arg2.method1530((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class278.field3718[var9.field551 & 65535] & 16777215, -16777216 | class278.field3718[var9.field549 & 65535] & 16777215, -16777216 | class278.field3718[var9.field548 & 65535] & 16777215, 0, 0, 0, 0, var9.field546);
                            return;
                        }
                        arg2.method1522((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field551 & 65535), (float) (var9.field549 & 65535), (float) (var9.field548 & 65535));
                    }
                }
            }
        } else {
            class291 var66 = this.field1168[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field3808 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field1178 == -1) {
                    for (int var67 = 0; var67 < var66.field3817; ++var67) {
                        int var68 = (arg0 << super.field4349) + var66.field3814[var67];
                        short var69 = var66.field3809[var67];
                        int var70 = (arg1 << super.field4349) + var66.field3816[var67];
                        float var71 = (float) var70 * this.field1163 + (float) var68 * this.field1167 + (float) var69 * this.field1177 + this.field1175;
                        if (var71 <= (float) this.field1173.field7300) {
                            return;
                        }
                        float var72 = (float) var70 * this.field1180 + (float) var68 * this.field1159 + (float) var69 * this.field1161 + this.field1162;
                        float var73 = (float) var70 * this.field1160 + (float) var68 * this.field1174 + (float) var69 * this.field1176 + this.field1170;
                        arg3[var67] = (int) ((float) this.field1173.field7305 * var72 / var71) + arg2.field3322;
                        arg4[var67] = (int) ((float) this.field1173.field7318 * var73 / var71) + arg2.field3326;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field3817; ++var74) {
                        int var110 = (arg0 << super.field4349) + var66.field3814[var74];
                        short var111 = var66.field3809[var74];
                        int var112 = (arg1 << super.field4349) + var66.field3816[var74];
                        float var113 = (float) var112 * this.field1163 + (float) var110 * this.field1167 + (float) var111 * this.field1177 + this.field1175;
                        float var114 = (float) var112 * this.field1180 + (float) var110 * this.field1159 + (float) var111 * this.field1161 + this.field1162;
                        float var115 = (float) var112 * this.field1160 + (float) var110 * this.field1174 + (float) var111 * this.field1176 + this.field1170;
                        arg3[var74] = (int) ((float) this.field1173.field7305 * var114 / (float) this.field1178) + arg2.field3322;
                        arg4[var74] = (int) ((float) this.field1173.field7318 * var115 / (float) this.field1178) + arg2.field3326;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field3812 != null) {
                    if (this.field1178 == -1) {
                        for (int var75 = 0; var75 < var66.field3807; ++var75) {
                            short var76 = var66.field3813[var75];
                            short var77 = var66.field3815[var75];
                            short var78 = var66.field3806[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field3317 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field3324 || var80 > arg2.field3324 || var81 > arg2.field3324;
                                short var85 = var66.field3812[var75];
                                if (var85 != -1) {
                                    arg2.method1530((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field3814[var76] / (float) super.field4346, (float) var66.field3814[var77] / (float) super.field4346, (float) var66.field3814[var78] / (float) super.field4346, (float) var66.field3816[var76] / (float) super.field4346, (float) var66.field3816[var77] / (float) super.field4346, (float) var66.field3816[var78] / (float) super.field4346, -16777216 | class278.field3718[var66.field3810[var76] & 65535] & 16777215, -16777216 | class278.field3718[var66.field3810[var77] & 65535] & 16777215, -16777216 | class278.field3718[var66.field3810[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field3805[var75];
                                    if (var86 != -1) {
                                        arg2.method1522((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class192.method1276(var86, (byte) 121, var66.field3810[var76]), (float) class192.method1276(var86, (byte) -22, var66.field3810[var77]), (float) class192.method1276(var86, (byte) -11, var66.field3810[var78]));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field3807; ++var87) {
                        short var88 = var66.field3813[var87];
                        short var89 = var66.field3815[var87];
                        short var90 = var66.field3806[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field3317 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field3324 || var92 > arg2.field3324 || var93 > arg2.field3324;
                            short var97 = var66.field3812[var87];
                            if (var97 != -1) {
                                arg2.method1530((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field3814[var88] / (float) super.field4346, (float) var66.field3814[var89] / (float) super.field4346, (float) var66.field3814[var90] / (float) super.field4346, (float) var66.field3816[var88] / (float) super.field4346, (float) var66.field3816[var89] / (float) super.field4346, (float) var66.field3816[var90] / (float) super.field4346, -16777216 | class278.field3718[var66.field3810[var88] & 65535] & 16777215, -16777216 | class278.field3718[var66.field3810[var89] & 65535] & 16777215, -16777216 | class278.field3718[var66.field3810[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field3805[var87];
                                if (var98 != -1) {
                                    arg2.method1522((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class192.method1276(var98, (byte) -117, var66.field3810[var88]), (float) class192.method1276(var98, (byte) -73, var66.field3810[var89]), (float) class192.method1276(var98, (byte) 120, var66.field3810[var90]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field3807; ++var99) {
                    short var100 = var66.field3813[var99];
                    short var101 = var66.field3815[var99];
                    short var102 = var66.field3806[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field3805[var99];
                        if (var109 != -1) {
                            arg2.field3317 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field3324 || var104 > arg2.field3324 || var105 > arg2.field3324;
                            arg2.method1522((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class192.method1276(var109, (byte) -104, var66.field3810[var100]), (float) class192.method1276(var109, (byte) 125, var66.field3810[var101]), (float) class192.method1276(var109, (byte) -107, var66.field3810[var102]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "fa", descriptor = "(IILr;)Lr;", line = 728)
    public final class706 method504(int arg0, int arg1, class706 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIII[[ZLae;Lvk;[I[I)V", line = 732)
    private final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class351 arg8, class239 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field4457;
        this.field1173.method2148(false);
        arg9.field3325 = false;
        arg9.field3327 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field1171[var18][var19] != null) {
                        class39 var20 = this.field1171[var18][var19];
                        if (var20.field546 != -1 && (var20.field545 & 2) == 0 && var20.field550 == -1) {
                            int var21 = this.field1173.method3101(var20.field546);
                            arg9.method1522((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class192.method1276(var21, (byte) -6, var20.field547 & 65535), (float) class192.method1276(var21, (byte) -100, var20.field548 & 65535), (float) class192.method1276(var21, (byte) -35, var20.field549 & 65535));
                            arg9.method1522((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class192.method1276(var21, (byte) -30, var20.field551 & 65535), (float) class192.method1276(var21, (byte) 127, var20.field549 & 65535), (float) class192.method1276(var21, (byte) -70, var20.field548 & 65535));
                        } else if (var20.field550 == -1) {
                            arg9.method1522((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field547 & 65535), (float) (var20.field548 & 65535), (float) (var20.field549 & 65535));
                            arg9.method1522((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field551 & 65535), (float) (var20.field549 & 65535), (float) (var20.field548 & 65535));
                        } else {
                            int var22 = var20.field550;
                            arg9.method1522((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method1522((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field1168[var18][var19] != null) {
                        class291 var23 = this.field1168[var18][var19];
                        for (int var24 = 0; var24 < var23.field3817; ++var24) {
                            arg10[var24] = var23.field3814[var24] * var14 / super.field4346 + var16;
                            arg11[var24] = var17 - var23.field3816[var24] * var14 / super.field4346;
                        }
                        for (int var25 = 0; var25 < var23.field3807; ++var25) {
                            short var26 = var23.field3813[var25];
                            short var27 = var23.field3815[var25];
                            short var28 = var23.field3806[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field3811 != null && var23.field3811[var25] != -1) {
                                int var35 = var23.field3811[var25];
                                arg9.method1522((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class192.method1276(var35, (byte) -74, var23.field3810[var26]), (float) class192.method1276(var35, (byte) 117, var23.field3810[var27]), (float) class192.method1276(var35, (byte) 122, var23.field3810[var28]));
                            } else if (var23.field3812 != null && var23.field3812[var25] != -1) {
                                int var36 = this.field1173.method3101(var23.field3812[var25]);
                                arg9.method1522((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class192.method1276(var36, (byte) 117, var23.field3810[var26]), (float) class192.method1276(var36, (byte) -66, var23.field3810[var27]), (float) class192.method1276(var36, (byte) 127, var23.field3810[var28]));
                            } else {
                                int var37 = var23.field3805[var25];
                                arg9.method1522((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class192.method1276(var37, (byte) 2, var23.field3810[var26]), (float) class192.method1276(var37, (byte) -19, var23.field3810[var27]), (float) class192.method1276(var37, (byte) 126, var23.field3810[var28]));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field3325 = true;
        this.field1173.method2148(var15);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(IIIIIII[[ZLae;Lvk;[I[I)V", line = 869)
    private final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class351 arg8, class239 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field4457;
        this.field1173.method2148(false);
        arg9.field3325 = false;
        arg9.field3327 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field1179 != null) {
                        if (this.field1179[var18][var19] != null) {
                            class73 var20 = this.field1179[var18][var19];
                            if (var20.field1021 != -1 && (var20.field1018 & 2) == 0 && var20.field1028 == 0) {
                                int var21 = this.field1173.method3101(var20.field1021);
                                arg9.method1522((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class192.method1276(var21, (byte) 126, var20.field1025), (float) class192.method1276(var21, (byte) 0, var20.field1019), (float) class192.method1276(var21, (byte) 127, var20.field1026));
                                arg9.method1522((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class192.method1276(var21, (byte) 126, var20.field1024), (float) class192.method1276(var21, (byte) 123, var20.field1026), (float) class192.method1276(var21, (byte) 125, var20.field1019));
                            } else if (var20.field1028 == 0) {
                                arg9.method1526((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field1025, var20.field1019, var20.field1026);
                                arg9.method1526((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field1024, var20.field1026, var20.field1019);
                            } else {
                                int var22 = var20.field1028;
                                arg9.method1526((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class72.method456(var22, (byte) -52, var20.field1025 & -16777216), class72.method456(var22, (byte) -52, var20.field1019 & -16777216), class72.method456(var22, (byte) -52, var20.field1026 & -16777216));
                                arg9.method1526((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class72.method456(var22, (byte) -52, var20.field1024 & -16777216), class72.method456(var22, (byte) -52, var20.field1026 & -16777216), class72.method456(var22, (byte) -52, var20.field1019 & -16777216));
                            }
                        } else if (this.field1164[var18][var19] != null) {
                            class434 var23 = this.field1164[var18][var19];
                            for (int var24 = 0; var24 < var23.field5956; ++var24) {
                                arg10[var24] = var23.field5959[var24] * var14 / super.field4346 + var16;
                                arg11[var24] = var17 - var23.field5954[var24] * var14 / super.field4346;
                            }
                            for (int var25 = 0; var25 < var23.field5957; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field5950 != null && var23.field5950[var25] != 0 && (var23.field5955 == null || var23.field5955 != null && var23.field5955[var25] == -1)) {
                                    int var35 = var23.field5950[var25];
                                    arg9.method1526((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class72.method456(var35, (byte) -52, -16777216 - (var23.field5952[var26] & -16777216)), class72.method456(var35, (byte) -52, -16777216 - (var23.field5952[var27] & -16777216)), class72.method456(var35, (byte) -52, -16777216 - (var23.field5952[var28] & -16777216)));
                                } else if (var23.field5955 != null && var23.field5955[var25] != -1) {
                                    int var36 = this.field1173.method3101(var23.field5955[var25]);
                                    arg9.method1522((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method1526((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field5952[var26], var23.field5952[var27], var23.field5952[var28]);
                                }
                            }
                        }
                    } else if (this.field1165[var18][var19] != null) {
                        class454 var37 = this.field1165[var18][var19];
                        for (int var38 = 0; var38 < var37.field6252; ++var38) {
                            arg10[var38] = var37.field6255[var38] * var14 / super.field4346 + var16;
                            arg11[var38] = var17 - var37.field6248[var38] * var14 / super.field4346;
                        }
                        for (int var39 = 0; var39 < var37.field6251; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field6254 != null && var37.field6254[var39] != 0) {
                                int var49 = var37.field6254[var39];
                                arg9.method1526((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method1526((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field6245[var40], var37.field6245[var41], var37.field6245[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field3325 = true;
        this.field1173.method2148(var15);
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lii;IIII[[I[[II)V", line = 1060)
    public class84(class521 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field1173 = arg0;
        this.field1169 = arg2;
        this.field1172 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1173.field7290 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1173.field7289 * var18 + this.field1173.field7304 * var16 + this.field1173.field7298 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1172[var11][var10] = (byte) var20;
            }
        }
        this.field1166 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z", line = 1118)
    private final boolean method507(int arg0) {
        if ((this.field1169 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1135)
    public final void method508(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field1169 & 32) == 0;
        if (this.field1179 == null && !var15) {
            this.field1179 = new class73[super.field4344][super.field4348];
            this.field1164 = new class434[super.field4344][super.field4348];
        } else if (this.field1165 == null && var15) {
            this.field1165 = new class454[super.field4344][super.field4348];
        } else if (this.field1171 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class278.field3718[class704.method3958((byte) 123, arg6[var16]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class278.field3718[class704.method3958((byte) 108, arg7[var17]) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class454 var18 = new class454();
                var18.field6252 = (short) arg2.length;
                var18.field6251 = (short) (arg2.length / 3);
                var18.field6255 = new short[var18.field6252];
                var18.field6249 = new short[var18.field6252];
                var18.field6248 = new short[var18.field6252];
                var18.field6245 = new int[var18.field6252];
                var18.field6247 = new short[var18.field6252];
                var18.field6246 = new short[var18.field6252];
                var18.field6253 = new byte[var18.field6252];
                if (arg5 != null) {
                    var18.field6250 = new short[var18.field6252];
                }
                for (int var19 = 0; var19 < var18.field6252; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field1172[arg0][arg1] - this.field1166[arg0][arg1];
                    } else if (var22 == 0 && super.field4346 == var23) {
                        var25 = this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1];
                    } else if (super.field4346 == var22 && super.field4346 == var23) {
                        var25 = this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1];
                    } else if (super.field4346 == var22 && var23 == 0) {
                        var25 = this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1]) * var22 + (this.field1172[arg0][arg1] - this.field1166[arg0][arg1]) * (super.field4346 - var22);
                        int var27 = (this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1]) * var22 + (this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1]) * (super.field4346 - var22);
                        var25 = (super.field4346 - var23) * var26 + var23 * var27 >> super.field4349 * 2;
                    }
                    int var28 = (arg0 << super.field4349) + var22;
                    int var29 = (arg1 << super.field4349) + var23;
                    var18.field6255[var19] = (short) var22;
                    var18.field6248[var19] = (short) var23;
                    var18.field6249[var19] = (short) (this.method1960(var28, var29, 115) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field6245[var19] = 0;
                        if (arg7 != null) {
                            var18.field6253[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field6250[var19] = (short) arg5[var19];
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
                        if (arg8[var19] != -1 && this.method507(this.field1173.field7694.method91(arg8[var19], -22805).field6386)) {
                            var32 = -1694498816;
                        }
                        var18.field6245[var19] = var32 | class751.method4166(method498(arg6[var19] >> 8, var25), var30, arg10, 2600);
                        if (arg7 != null) {
                            var18.field6253[var19] = (byte) var25;
                        }
                    }
                    var18.field6247[var19] = (short) arg8[var19];
                    var18.field6246[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field6254 = new int[var18.field6251];
                }
                for (int var20 = 0; var20 < var18.field6251; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field6254[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field1165[arg0][arg1] = var18;
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
                        } else if (arg2[var38] == super.field4346 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field4346 && arg4[var38] == super.field4346) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field4346) {
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
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field4346 != arg2[var40] && arg2[0] - super.field4346 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field4346 != arg4[var40] && arg4[0] - super.field4346 != arg4[var40]) {
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
                    class73 var41 = new class73();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field1028 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field1018 = (byte) (var41.field1018 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field4343[arg0 + 1][arg1] == super.field4343[arg0][arg1] && super.field4343[arg0 + 1][arg1 + 1] == super.field4343[arg0][arg1] && super.field4343[arg0][arg1 + 1] == super.field4343[arg0][arg1]) {
                        var41.field1018 = (byte) (var41.field1018 | 1);
                    }
                    if (var43 != -1 && (var41.field1018 & 2) == 0 && !this.field1173.field7694.method91(var43, -22805).field6389) {
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
                        var41.field1024 = class751.method4166(method498(arg6[var34] >> 8, this.field1172[arg0][arg1] - this.field1166[arg0][arg1]), var44, arg10, 2600);
                        if (var41.field1028 != 0) {
                            var41.field1024 |= 255 - (this.field1172[arg0][arg1] - this.field1166[arg0][arg1]) << 25;
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
                        var41.field1026 = class751.method4166(method498(arg6[var35] >> 8, this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1]), var45, arg10, 2600);
                        if (var41.field1028 != 0) {
                            var41.field1026 |= 255 - (this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1]) << 25;
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
                        var41.field1025 = class751.method4166(method498(arg6[var36] >> 8, this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1]), var46, arg10, 2600);
                        if (var41.field1028 != 0) {
                            var41.field1025 |= 255 - (this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field1019 = class751.method4166(method498(arg6[var37] >> 8, this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1]), var47, arg10, 2600);
                        var41.field1021 = (short) var43;
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
                        var41.field1024 = class751.method4166(method498(arg6[var34] >> 8, this.field1172[arg0][arg1] - this.field1166[arg0][arg1]), var48, arg10, 2600);
                        if (var41.field1028 != 0) {
                            var41.field1024 |= 255 - (this.field1172[arg0][arg1] - this.field1166[arg0][arg1]) << 25;
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
                        var41.field1026 = class751.method4166(method498(arg6[var35] >> 8, this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1]), var49, arg10, 2600);
                        if (var41.field1028 != 0) {
                            var41.field1026 |= 255 - (this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1]) << 25;
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
                        var41.field1025 = class751.method4166(method498(arg6[var36] >> 8, this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1]), var50, arg10, 2600);
                        if (var41.field1028 != 0) {
                            var41.field1025 |= 255 - (this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1]) << 25;
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
                        var41.field1019 = class751.method4166(method498(arg6[var37] >> 8, this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1]), var51, arg10, 2600);
                        if (var41.field1028 != 0) {
                            var41.field1019 |= 255 - (this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1]) << 25;
                        }
                        var41.field1021 = -1;
                    }
                    if (arg5 != null) {
                        var41.field1022 = (short) arg5[var36];
                        var41.field1020 = (short) arg5[var37];
                        var41.field1027 = (short) arg5[var35];
                        var41.field1023 = (short) arg5[var34];
                    }
                    this.field1179[arg0][arg1] = var41;
                } else {
                    class434 var52 = new class434();
                    var52.field5956 = (short) arg2.length;
                    var52.field5957 = (short) (arg2.length / 3);
                    var52.field5959 = new short[var52.field5956];
                    var52.field5951 = new short[var52.field5956];
                    var52.field5954 = new short[var52.field5956];
                    var52.field5952 = new int[var52.field5956];
                    if (arg5 != null) {
                        var52.field5949 = new short[var52.field5956];
                    }
                    for (int var53 = 0; var53 < var52.field5956; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field1172[arg0][arg1] - this.field1166[arg0][arg1];
                        } else if (var68 == 0 && super.field4346 == var69) {
                            var71 = this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1];
                        } else if (super.field4346 == var68 && super.field4346 == var69) {
                            var71 = this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1];
                        } else if (super.field4346 == var68 && var69 == 0) {
                            var71 = this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1]) * var68 + (this.field1172[arg0][arg1] - this.field1166[arg0][arg1]) * (super.field4346 - var68);
                            int var73 = (this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1]) * var68 + (this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1]) * (super.field4346 - var68);
                            var71 = (super.field4346 - var69) * var72 + var69 * var73 >> super.field4349 * 2;
                        }
                        int var74 = (arg0 << super.field4349) + var68;
                        int var75 = (arg1 << super.field4349) + var69;
                        var52.field5959[var53] = (short) var68;
                        var52.field5954[var53] = (short) var69;
                        var52.field5951[var53] = (short) (this.method1960(var74, var75, 125) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field5952[var53] = var71 << 25;
                            } else {
                                var52.field5952[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field5949[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field5952[var53] = class751.method4166(method498(arg6[var53] >> 8, var71), var76, arg10, 2600);
                            if (arg7 != null) {
                                var52.field5952[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field5957; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field1173.field7694.method91(arg8[var55 * 3], -22805).field6389) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field5950 = new int[var52.field5957];
                    }
                    if (var54) {
                        var52.field5955 = new short[var52.field5957];
                        var52.field5958 = new short[var52.field5957];
                    }
                    for (int var56 = 0; var56 < var52.field5957; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field5950[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field1173.field7694.method91(var62, -22805).field6389) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field1173.field7694.method91(var63, -22805).field6389) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field1173.field7694.method91(var64, -22805).field6389) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field5955[var56] = (short) var64;
                                var52.field5958[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field1173.field7694.method91(var65, -22805).field6389) {
                                        var52.field5952[var57] = class278.field3718[class704.method3958((byte) 115, this.field1173.field7694.method91(var65, -22805).field6394 & 65535) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field1173.field7694.method91(var66, -22805).field6389) {
                                        var52.field5952[var58] = class278.field3718[class704.method3958((byte) 111, this.field1173.field7694.method91(var66, -22805).field6394 & 65535) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field1173.field7694.method91(var67, -22805).field6389) {
                                        var52.field5952[var59] = class278.field3718[class704.method3958((byte) 118, this.field1173.field7694.method91(var67, -22805).field6394 & 65535) & 65535];
                                    }
                                }
                                var52.field5955[var56] = -1;
                            }
                        }
                    }
                    this.field1164[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(IIZLae;Lvk;[I[I[I[II)V", line = 1833)
    private final void method509(int arg0, int arg1, boolean arg2, class351 arg3, class239 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class73 var11 = this.field1179[arg0][arg1];
        if (var11 != null) {
            if ((var11.field1018 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field1018 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field4346 * arg0;
                int var13 = super.field4346 + var12;
                int var14 = super.field4346 * arg1;
                int var15 = super.field4346 + var14;
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
                if ((var11.field1018 & 1) != 0 && !arg2) {
                    int var20 = super.field4343[arg0][arg1];
                    float var21 = (float) var20 * this.field1177;
                    if (this.field1178 == -1) {
                        var22 = (float) var14 * this.field1163 + (float) var12 * this.field1167 + var21 + this.field1175;
                        if (var22 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var23 = (float) var14 * this.field1163 + (float) var13 * this.field1167 + var21 + this.field1175;
                        if (var23 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var24 = (float) var15 * this.field1163 + (float) var13 * this.field1167 + var21 + this.field1175;
                        if (var24 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var25 = (float) var15 * this.field1163 + (float) var12 * this.field1167 + var21 + this.field1175;
                        if (var25 <= (float) this.field1173.field7300) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field1163 + (float) var12 * this.field1167 + var21 + this.field1175;
                        var23 = (float) var14 * this.field1163 + (float) var13 * this.field1167 + var21 + this.field1175;
                        var24 = (float) var15 * this.field1163 + (float) var13 * this.field1167 + var21 + this.field1175;
                        var25 = (float) var15 * this.field1163 + (float) var12 * this.field1167 + var21 + this.field1175;
                    }
                    if (arg3.field4470) {
                        int var26 = (int) (var22 - (float) arg3.field4455);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field4455);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field4455);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field4455);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field1161;
                    float var31 = (float) var20 * this.field1176;
                    if (this.field1178 == -1) {
                        float var32 = (float) var14 * this.field1180 + (float) var12 * this.field1159 + var30 + this.field1162;
                        var33 = (int) ((float) this.field1173.field7305 * var32 / var22) + arg4.field3322;
                        float var34 = (float) var14 * this.field1160 + (float) var12 * this.field1174 + var31 + this.field1170;
                        var35 = (int) ((float) this.field1173.field7318 * var34 / var22) + arg4.field3326;
                        float var36 = (float) var14 * this.field1180 + (float) var13 * this.field1159 + var30 + this.field1162;
                        var37 = (int) ((float) this.field1173.field7305 * var36 / var23) + arg4.field3322;
                        float var38 = (float) var14 * this.field1160 + (float) var13 * this.field1174 + var31 + this.field1170;
                        var39 = (int) ((float) this.field1173.field7318 * var38 / var23) + arg4.field3326;
                        float var40 = (float) var15 * this.field1180 + (float) var13 * this.field1159 + var30 + this.field1162;
                        var41 = (int) ((float) this.field1173.field7305 * var40 / var24) + arg4.field3322;
                        float var42 = (float) var15 * this.field1160 + (float) var13 * this.field1174 + var31 + this.field1170;
                        var43 = (int) ((float) this.field1173.field7318 * var42 / var24) + arg4.field3326;
                        float var44 = (float) var15 * this.field1180 + (float) var12 * this.field1159 + var30 + this.field1162;
                        var45 = (int) ((float) this.field1173.field7305 * var44 / var25) + arg4.field3322;
                        float var46 = (float) var15 * this.field1160 + (float) var12 * this.field1174 + var31 + this.field1170;
                        var47 = (int) ((float) this.field1173.field7318 * var46 / var25) + arg4.field3326;
                    } else {
                        float var48 = (float) var14 * this.field1180 + (float) var12 * this.field1159 + var30 + this.field1162;
                        var33 = (int) ((float) this.field1173.field7305 * var48 / (float) this.field1178) + arg4.field3322;
                        float var49 = (float) var14 * this.field1160 + (float) var12 * this.field1174 + var31 + this.field1170;
                        var35 = (int) ((float) this.field1173.field7318 * var49 / (float) this.field1178) + arg4.field3326;
                        float var50 = (float) var14 * this.field1180 + (float) var13 * this.field1159 + var30 + this.field1162;
                        var37 = (int) ((float) this.field1173.field7305 * var50 / (float) this.field1178) + arg4.field3322;
                        float var51 = (float) var14 * this.field1160 + (float) var13 * this.field1174 + var31 + this.field1170;
                        var39 = (int) ((float) this.field1173.field7318 * var51 / (float) this.field1178) + arg4.field3326;
                        float var52 = (float) var15 * this.field1180 + (float) var13 * this.field1159 + var30 + this.field1162;
                        var41 = (int) ((float) this.field1173.field7305 * var52 / (float) this.field1178) + arg4.field3322;
                        float var53 = (float) var15 * this.field1160 + (float) var13 * this.field1174 + var31 + this.field1170;
                        var43 = (int) ((float) this.field1173.field7318 * var53 / (float) this.field1178) + arg4.field3326;
                        float var54 = (float) var15 * this.field1180 + (float) var12 * this.field1159 + var30 + this.field1162;
                        var45 = (int) ((float) this.field1173.field7305 * var54 / (float) this.field1178) + arg4.field3322;
                        float var55 = (float) var15 * this.field1160 + (float) var12 * this.field1174 + var31 + this.field1170;
                        var47 = (int) ((float) this.field1173.field7318 * var55 / (float) this.field1178) + arg4.field3326;
                    }
                } else {
                    int var56 = super.field4343[arg0][arg1];
                    int var57 = super.field4343[arg0 + 1][arg1];
                    int var58 = super.field4343[arg0 + 1][arg1 + 1];
                    int var59 = super.field4343[arg0][arg1 + 1];
                    if (this.field1178 == -1) {
                        var22 = (float) var14 * this.field1163 + (float) var12 * this.field1167 + (float) var56 * this.field1177 + this.field1175;
                        if (var22 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var23 = (float) var14 * this.field1163 + (float) var13 * this.field1167 + (float) var57 * this.field1177 + this.field1175;
                        if (var23 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var24 = (float) var15 * this.field1163 + (float) var13 * this.field1167 + (float) var58 * this.field1177 + this.field1175;
                        if (var24 <= (float) this.field1173.field7300) {
                            return;
                        }
                        var25 = (float) var15 * this.field1163 + (float) var12 * this.field1167 + (float) var59 * this.field1177 + this.field1175;
                        if (var25 <= (float) this.field1173.field7300) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field1163 + (float) var12 * this.field1167 + (float) var56 * this.field1177 + this.field1175;
                        var23 = (float) var14 * this.field1163 + (float) var13 * this.field1167 + (float) var57 * this.field1177 + this.field1175;
                        var24 = (float) var15 * this.field1163 + (float) var13 * this.field1167 + (float) var58 * this.field1177 + this.field1175;
                        var25 = (float) var15 * this.field1163 + (float) var12 * this.field1167 + (float) var59 * this.field1177 + this.field1175;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field4455);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field1023 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field4455);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field1027 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field4455);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field1022 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field4455);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field1020 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field4470) {
                        int var68 = (int) (var22 - (float) arg3.field4455);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field4455);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field4455);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field4455);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field1178 == -1) {
                        float var72 = (float) var14 * this.field1180 + (float) var12 * this.field1159 + (float) var56 * this.field1161 + this.field1162;
                        var33 = (int) ((float) this.field1173.field7305 * var72 / var22) + arg4.field3322;
                        float var73 = (float) var14 * this.field1160 + (float) var12 * this.field1174 + (float) var56 * this.field1176 + this.field1170;
                        var35 = (int) ((float) this.field1173.field7318 * var73 / var22) + arg4.field3326;
                        float var74 = (float) var14 * this.field1180 + (float) var13 * this.field1159 + (float) var57 * this.field1161 + this.field1162;
                        var37 = (int) ((float) this.field1173.field7305 * var74 / var23) + arg4.field3322;
                        float var75 = (float) var14 * this.field1160 + (float) var13 * this.field1174 + (float) var57 * this.field1176 + this.field1170;
                        var39 = (int) ((float) this.field1173.field7318 * var75 / var23) + arg4.field3326;
                        float var76 = (float) var15 * this.field1180 + (float) var13 * this.field1159 + (float) var58 * this.field1161 + this.field1162;
                        var41 = (int) ((float) this.field1173.field7305 * var76 / var24) + arg4.field3322;
                        float var77 = (float) var15 * this.field1160 + (float) var13 * this.field1174 + (float) var58 * this.field1176 + this.field1170;
                        var43 = (int) ((float) this.field1173.field7318 * var77 / var24) + arg4.field3326;
                        float var78 = (float) var15 * this.field1180 + (float) var12 * this.field1159 + (float) var59 * this.field1161 + this.field1162;
                        var45 = (int) ((float) this.field1173.field7305 * var78 / var25) + arg4.field3322;
                        float var79 = (float) var15 * this.field1160 + (float) var12 * this.field1174 + (float) var59 * this.field1176 + this.field1170;
                        var47 = (int) ((float) this.field1173.field7318 * var79 / var25) + arg4.field3326;
                    } else {
                        float var80 = (float) var14 * this.field1180 + (float) var12 * this.field1159 + (float) var56 * this.field1161 + this.field1162;
                        var33 = (int) ((float) this.field1173.field7305 * var80 / (float) this.field1178) + arg4.field3322;
                        float var81 = (float) var14 * this.field1160 + (float) var12 * this.field1174 + (float) var56 * this.field1176 + this.field1170;
                        var35 = (int) ((float) this.field1173.field7318 * var81 / (float) this.field1178) + arg4.field3326;
                        float var82 = (float) var14 * this.field1180 + (float) var13 * this.field1159 + (float) var57 * this.field1161 + this.field1162;
                        var37 = (int) ((float) this.field1173.field7305 * var82 / (float) this.field1178) + arg4.field3322;
                        float var83 = (float) var14 * this.field1160 + (float) var13 * this.field1174 + (float) var57 * this.field1176 + this.field1170;
                        var39 = (int) ((float) this.field1173.field7318 * var83 / (float) this.field1178) + arg4.field3326;
                        float var84 = (float) var15 * this.field1180 + (float) var13 * this.field1159 + (float) var58 * this.field1161 + this.field1162;
                        var41 = (int) ((float) this.field1173.field7305 * var84 / (float) this.field1178) + arg4.field3322;
                        float var85 = (float) var15 * this.field1160 + (float) var13 * this.field1174 + (float) var58 * this.field1176 + this.field1170;
                        var43 = (int) ((float) this.field1173.field7318 * var85 / (float) this.field1178) + arg4.field3326;
                        float var86 = (float) var15 * this.field1180 + (float) var12 * this.field1159 + (float) var59 * this.field1161 + this.field1162;
                        var45 = (int) ((float) this.field1173.field7305 * var86 / (float) this.field1178) + arg4.field3322;
                        float var87 = (float) var15 * this.field1160 + (float) var12 * this.field1174 + (float) var59 * this.field1176 + this.field1170;
                        var47 = (int) ((float) this.field1173.field7318 * var87 / (float) this.field1178) + arg4.field3326;
                    }
                }
                boolean var88 = var11.field1021 != -1 && this.method507(this.field1173.field7694.method91(var11.field1021, -22805).field6386);
                if (this.field1178 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field3317 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field3324 || var45 > arg4.field3324 || var37 > arg4.field3324;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field1021 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method1530((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field1025 & 16777215, var90 | var11.field1019 & 16777215, var90 | var11.field1026 & 16777215, arg3.field4459, var18, var19, var17, var11.field1021);
                                } else {
                                    if (var88) {
                                        arg4.field3329 = 100;
                                    }
                                    arg4.method1526((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class72.method456(var11.field1025, (byte) -52, var18 << 24 | arg3.field4459), class72.method456(var11.field1019, (byte) -52, var19 << 24 | arg3.field4459), class72.method456(var11.field1026, (byte) -52, var17 << 24 | arg3.field4459));
                                    arg4.field3329 = 0;
                                }
                            } else if (var11.field1021 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method1530((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field1025 & 16777215, var91 | var11.field1019 & 16777215, var91 | var11.field1026 & 16777215, 0, 0, 0, 0, var11.field1021);
                            } else {
                                if (var88) {
                                    arg4.field3329 = 100;
                                }
                                arg4.method1526((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1025, var11.field1019, var11.field1026);
                                arg4.field3329 = 0;
                            }
                        } else {
                            arg4.method1518((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field4459);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field3317 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field3324 || var37 > arg4.field3324 || var45 > arg4.field3324;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field3329 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field1021 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method1530((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field1024 & 16777215, var93 | var11.field1026 & 16777215, var93 | var11.field1019 & 16777215, arg3.field4459, var16, var17, var19, var11.field1021);
                                    return;
                                }
                                if (var88) {
                                    arg4.field3329 = 100;
                                }
                                arg4.method1526((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class72.method456(var11.field1024, (byte) -52, var16 << 24 | arg3.field4459), class72.method456(var11.field1026, (byte) -52, var17 << 24 | arg3.field4459), class72.method456(var11.field1019, (byte) -52, var19 << 24 | arg3.field4459));
                                arg4.field3329 = 0;
                                return;
                            }
                            if (var11.field1021 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method1530((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field1024 & 16777215, var94 | var11.field1026 & 16777215, var94 | var11.field1019 & 16777215, 0, 0, 0, 0, var11.field1021);
                                return;
                            }
                            if (var88) {
                                arg4.field3329 = 100;
                            }
                            arg4.method1526((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1024, var11.field1026, var11.field1019);
                            arg4.field3329 = 0;
                            return;
                        }
                        arg4.method1518((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field4459);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field3317 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field3324 || var45 > arg4.field3324 || var37 > arg4.field3324;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field3329 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field1021 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method1530((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field1025 & 16777215, var96 | var11.field1019 & 16777215, var96 | var11.field1026 & 16777215, arg3.field4459, var18, var19, var17, var11.field1021);
                                } else {
                                    if (var88) {
                                        arg4.field3329 = 100;
                                    }
                                    arg4.method1526((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class72.method456(var11.field1025, (byte) -52, var18 << 24 | arg3.field4459), class72.method456(var11.field1019, (byte) -52, var19 << 24 | arg3.field4459), class72.method456(var11.field1026, (byte) -52, var17 << 24 | arg3.field4459));
                                    arg4.field3329 = 0;
                                }
                            } else if (var11.field1021 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method1530((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field1025 & 16777215, var97 | var11.field1019 & 16777215, var97 | var11.field1026 & 16777215, 0, 0, 0, 0, var11.field1021);
                            } else {
                                if (var88) {
                                    arg4.field3329 = 100;
                                }
                                arg4.method1526((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1025, var11.field1019, var11.field1026);
                                arg4.field3329 = 0;
                            }
                        } else {
                            arg4.method1518((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field4459);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field3317 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field3324 || var37 > arg4.field3324 || var45 > arg4.field3324;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field3329 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field1021 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method1530((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field1024 & 16777215, var99 | var11.field1026 & 16777215, var99 | var11.field1019 & 16777215, arg3.field4459, var16, var17, var19, var11.field1021);
                                    return;
                                }
                                if (var88) {
                                    arg4.field3329 = 100;
                                }
                                arg4.method1526((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class72.method456(var11.field1024, (byte) -52, var16 << 24 | arg3.field4459), class72.method456(var11.field1026, (byte) -52, var17 << 24 | arg3.field4459), class72.method456(var11.field1019, (byte) -52, var19 << 24 | arg3.field4459));
                                arg4.field3329 = 0;
                                return;
                            }
                            if (var11.field1021 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method1530((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field1024 & 16777215, var100 | var11.field1026 & 16777215, var100 | var11.field1019 & 16777215, 0, 0, 0, 0, var11.field1021);
                                return;
                            }
                            if (var88) {
                                arg4.field3329 = 100;
                            }
                            arg4.method1526((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1024, var11.field1026, var11.field1019);
                            arg4.field3329 = 0;
                            return;
                        }
                        arg4.method1518((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field4459);
                    }
                }
            }
        } else {
            class434 var101 = this.field1164[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field5953 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field1178 == -1) {
                    for (int var102 = 0; var102 < var101.field5956; ++var102) {
                        int var103 = (arg0 << super.field4349) + var101.field5959[var102];
                        int var104 = var101.field5951[var102];
                        int var105 = (arg1 << super.field4349) + var101.field5954[var102];
                        float var106 = (float) var105 * this.field1163 + (float) var103 * this.field1167 + (float) var104 * this.field1177 + this.field1175;
                        if (var106 <= (float) this.field1173.field7300) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field4455);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field5949[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field4470) {
                            int var109 = (int) (var106 - (float) arg3.field4455);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field1180 + (float) var103 * this.field1159 + (float) var104 * this.field1161 + this.field1162;
                        float var111 = (float) var105 * this.field1160 + (float) var103 * this.field1174 + (float) var104 * this.field1176 + this.field1170;
                        arg5[var102] = (int) ((float) this.field1173.field7305 * var110 / var106) + arg4.field3322;
                        arg6[var102] = (int) ((float) this.field1173.field7318 * var111 / var106) + arg4.field3326;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field5956; ++var112) {
                        int var152 = (arg0 << super.field4349) + var101.field5959[var112];
                        int var153 = var101.field5951[var112];
                        int var154 = (arg1 << super.field4349) + var101.field5954[var112];
                        float var155 = (float) var154 * this.field1163 + (float) var152 * this.field1167 + (float) var153 * this.field1177 + this.field1175;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field1178 - arg3.field4455;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field5949[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field4470) {
                            int var158 = this.field1178 - arg3.field4455;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field1180 + (float) var152 * this.field1159 + (float) var153 * this.field1161 + this.field1162;
                        float var160 = (float) var154 * this.field1160 + (float) var152 * this.field1174 + (float) var153 * this.field1176 + this.field1170;
                        arg5[var112] = (int) ((float) this.field1173.field7305 * var159 / (float) this.field1178) + arg4.field3322;
                        arg6[var112] = (int) ((float) this.field1173.field7318 * var160 / (float) this.field1178) + arg4.field3326;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field5955 != null) {
                    if (this.field1178 == -1) {
                        for (int var113 = 0; var113 < var101.field5957; ++var113) {
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
                                arg4.field3317 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field3324 || var118 > arg4.field3324 || var119 > arg4.field3324;
                                short var124 = var101.field5955[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method507(this.field1173.field7694.method91(var124, -22805).field6386)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method1530((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field5959[var114] / (float) super.field4346, (float) var101.field5959[var115] / (float) super.field4346, (float) var101.field5959[var116] / (float) super.field4346, (float) var101.field5954[var114] / (float) super.field4346, (float) var101.field5954[var115] / (float) super.field4346, (float) var101.field5954[var116] / (float) super.field4346, var125 | var101.field5952[var114] & 16777215, var125 | var101.field5952[var115] & 16777215, var125 | var101.field5952[var116] & 16777215, arg3.field4459, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field5952[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method507(this.field1173.field7694.method91(var124, -22805).field6386)) {
                                                arg4.field3329 = -1694498816;
                                            }
                                            arg4.method1526((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class72.method456(var101.field5952[var114], (byte) -52, arg8[var114] << 24 | arg3.field4459), class72.method456(var101.field5952[var115], (byte) -52, arg8[var115] << 24 | arg3.field4459), class72.method456(var101.field5952[var116], (byte) -52, arg8[var116] << 24 | arg3.field4459));
                                            arg4.field3329 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method507(this.field1173.field7694.method91(var124, -22805).field6386)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method1530((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field5959[var114] / (float) super.field4346, (float) var101.field5959[var115] / (float) super.field4346, (float) var101.field5959[var116] / (float) super.field4346, (float) var101.field5954[var114] / (float) super.field4346, (float) var101.field5954[var115] / (float) super.field4346, (float) var101.field5954[var116] / (float) super.field4346, var126 | var101.field5952[var114] & 16777215, var126 | var101.field5952[var115] & 16777215, var126 | var101.field5952[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field5952[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method507(this.field1173.field7694.method91(var124, -22805).field6386)) {
                                            arg4.field3329 = -1694498816;
                                        }
                                        arg4.method1526((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field5952[var114], var101.field5952[var115], var101.field5952[var116]);
                                        arg4.field3329 = 0;
                                    }
                                } else {
                                    arg4.method1518((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field4459);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field5957; ++var127) {
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
                            arg4.field3317 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field3324 || var132 > arg4.field3324 || var133 > arg4.field3324;
                            short var138 = var101.field5955[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method507(this.field1173.field7694.method91(var138, -22805).field6386)) {
                                    arg4.field3329 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method507(this.field1173.field7694.method91(var138, -22805).field6386)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method1530((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field5959[var128] / (float) super.field4346, (float) var101.field5959[var129] / (float) super.field4346, (float) var101.field5959[var130] / (float) super.field4346, (float) var101.field5954[var128] / (float) super.field4346, (float) var101.field5954[var129] / (float) super.field4346, (float) var101.field5954[var130] / (float) super.field4346, var139 | var101.field5952[var128] & 16777215, var139 | var101.field5952[var129] & 16777215, var139 | var101.field5952[var130] & 16777215, arg3.field4459, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field5952[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method507(this.field1173.field7694.method91(var138, -22805).field6386)) {
                                            arg4.field3329 = -1694498816;
                                        }
                                        arg4.method1526((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class72.method456(var101.field5952[var128], (byte) -52, arg8[var128] << 24 | arg3.field4459), class72.method456(var101.field5952[var129], (byte) -52, arg8[var129] << 24 | arg3.field4459), class72.method456(var101.field5952[var130], (byte) -52, arg8[var130] << 24 | arg3.field4459));
                                        arg4.field3329 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method507(this.field1173.field7694.method91(var138, -22805).field6386)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method1530((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field5959[var128] / (float) super.field4346, (float) var101.field5959[var129] / (float) super.field4346, (float) var101.field5959[var130] / (float) super.field4346, (float) var101.field5954[var128] / (float) super.field4346, (float) var101.field5954[var129] / (float) super.field4346, (float) var101.field5954[var130] / (float) super.field4346, var140 | var101.field5952[var128] & 16777215, var140 | var101.field5952[var129] & 16777215, var140 | var101.field5952[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field5952[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method507(this.field1173.field7694.method91(var138, -22805).field6386)) {
                                        arg4.field3329 = -1694498816;
                                    }
                                    arg4.method1526((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field5952[var128], var101.field5952[var129], var101.field5952[var130]);
                                    arg4.field3329 = 0;
                                }
                                arg4.field3329 = 0;
                            } else {
                                arg4.method1518((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field4459);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field5957; ++var141) {
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
                        arg4.field3317 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field3324 || var146 > arg4.field3324 || var147 > arg4.field3324;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field5952[var142] & 16777215) != 0) {
                                    arg4.method1526((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class751.method4166(var101.field5952[var142], arg8[var142], arg3.field4459, 2600), class751.method4166(var101.field5952[var143], arg8[var143], arg3.field4459, 2600), class751.method4166(var101.field5952[var144], arg8[var144], arg3.field4459, 2600));
                                }
                            } else if ((var101.field5952[var142] & 16777215) != 0) {
                                arg4.method1526((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field5952[var142], var101.field5952[var143], var101.field5952[var144]);
                            }
                        } else {
                            arg4.method1518((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field4459);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III[[ZZI)V", line = 2822)
    public final void method510(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class349 var7 = this.field1173.field7308;
        this.field1178 = -1;
        this.field1159 = var7.field4446;
        this.field1161 = var7.field4436;
        this.field1180 = var7.field4440;
        this.field1162 = var7.field4424;
        this.field1174 = var7.field4438;
        this.field1176 = var7.field4433;
        this.field1160 = var7.field4442;
        this.field1170 = var7.field4439;
        this.field1167 = var7.field4435;
        this.field1177 = var7.field4419;
        this.field1163 = var7.field4445;
        this.field1175 = var7.field4428;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field4344 && var11 >= 0 && var11 < super.field4348) {
                        this.method501(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V", line = 2867)
    public final void method511(int arg0, int arg1) {
        this.method501(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIII[[Z)V", line = 2871)
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class351 var9 = this.field1173.method3097(Thread.currentThread());
        class239 var10 = var9.field4494;
        var10.field3329 = 0;
        var10.field3317 = true;
        this.field1173.method610();
        if (this.field1179 == null && this.field1165 == null) {
            if (this.field1171 != null) {
                this.method505(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field4493, var9.field4472);
            }
        } else {
            this.method506(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field4493, var9.field4472);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lkb;[I)V", line = 2887)
    public final void method513(class757 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!hn", name = "YA", descriptor = "()V", line = 2891)
    public final void method514() {
        this.field1172 = null;
        this.field1166 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 2896)
    public final boolean method515(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!hn", name = "ka", descriptor = "(III)V", line = 2900)
    public final void method516(int arg0, int arg1, int arg2) {
        if (this.field1166[arg0][arg1] < arg2) {
            this.field1166[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III[[ZZII)V", line = 2908)
    public final void method517(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class349 var8 = this.field1173.field7308;
        this.field1178 = arg5;
        this.field1159 = var8.field4446;
        this.field1161 = var8.field4436;
        this.field1180 = var8.field4440;
        this.field1162 = var8.field4424;
        this.field1174 = var8.field4438;
        this.field1176 = var8.field4433;
        this.field1160 = var8.field4442;
        this.field1170 = var8.field4439;
        this.field1167 = var8.field4435;
        this.field1177 = var8.field4419;
        this.field1163 = var8.field4445;
        this.field1175 = var8.field4428;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field4344 && var12 >= 0 && var12 < super.field4348) {
                        this.method501(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 2952)
    public final void method518(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field1171 == null) {
            this.field1171 = new class39[super.field4344][super.field4348];
            this.field1168 = new class291[super.field4344][super.field4348];
        } else if (this.field1179 != null || this.field1165 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field4346 != var20 || var21 != 0 && super.field4346 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class291 var22 = new class291();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field3817 = var23;
            var22.field3810 = new short[var23];
            var22.field3814 = new short[var23];
            var22.field3809 = new short[var23];
            var22.field3816 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field3810[var25] = (short) (this.field1172[arg0][arg1] - this.field1166[arg0][arg1]);
                } else if (var32 == 0 && super.field4346 == var33) {
                    var22.field3810[var25] = (short) (this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1]);
                } else if (super.field4346 == var32 && super.field4346 == var33) {
                    var22.field3810[var25] = (short) (this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1]);
                } else if (super.field4346 == var32 && var33 == 0) {
                    var22.field3810[var25] = (short) (this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1]) * var32 + (this.field1172[arg0][arg1] - this.field1166[arg0][arg1]) * (super.field4346 - var32);
                    int var35 = (this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1]) * var32 + (this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1]) * (super.field4346 - var32);
                    var22.field3810[var25] = (short) ((super.field4346 - var33) * var34 + var33 * var35 >> super.field4349 * 2);
                }
                int var36 = (arg0 << super.field4349) + var32;
                int var37 = (arg1 << super.field4349) + var33;
                var22.field3814[var25] = (short) var32;
                var22.field3816[var25] = (short) var33;
                var22.field3809[var25] = (short) (this.method1960(var36, var37, 119) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field3810[var25] < 2) {
                    var22.field3810[var25] = 2;
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
                    class468 var31 = this.field1173.field7694.method91(var30, -22805);
                    if (!var31.field6389) {
                        var26 = true;
                        if (this.method507(var31.field6386) || var31.field6388 != 0 || var31.field6390 != 0) {
                            var22.field3808 = (byte) (var22.field3808 | 4);
                        }
                    }
                }
            }
            var22.field3805 = new int[var27];
            if (arg10 != null) {
                var22.field3811 = new int[var27];
            }
            var22.field3813 = new short[var27];
            var22.field3815 = new short[var27];
            var22.field3806 = new short[var27];
            if (var26) {
                var22.field3812 = new short[var27];
                var22.field3818 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field3805[var22.field3807] = class704.method3958((byte) 118, arg9[var29]);
                    } else {
                        var22.field3805[var22.field3807] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field3811[var22.field3807] = class704.method3958((byte) 114, arg10[var29]);
                        } else {
                            var22.field3811[var22.field3807] = -1;
                        }
                    }
                    var22.field3813[var22.field3807] = (short) arg6[var29];
                    var22.field3815[var22.field3807] = (short) arg7[var29];
                    var22.field3806[var22.field3807] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field1173.field7694.method91(arg11[var29], -22805).field6389) {
                            var22.field3812[var22.field3807] = (short) arg11[var29];
                            var22.field3818[var22.field3807] = (short) arg12[var29];
                        } else {
                            var22.field3812[var22.field3807] = -1;
                        }
                    }
                    ++var22.field3807;
                }
            }
            this.field1168[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class39 var38 = new class39();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field550 = class192.method1276(class704.method3958((byte) 107, arg10[0]), (byte) 118, this.field1172[arg0][arg1] - this.field1166[arg0][arg1]);
                    if (var39 == -1) {
                        var38.field545 = (byte) (var38.field545 | 2);
                    }
                }
                if (super.field4343[arg0 + 1][arg1] == super.field4343[arg0][arg1] && super.field4343[arg0 + 1][arg1 + 1] == super.field4343[arg0][arg1] && super.field4343[arg0][arg1 + 1] == super.field4343[arg0][arg1]) {
                    var38.field545 = (byte) (var38.field545 | 1);
                }
                class468 var41 = null;
                if (var40 != -1) {
                    var41 = this.field1173.field7694.method91(var40, -22805);
                }
                if (var41 != null && (var38.field545 & 2) == 0 && !var41.field6389) {
                    var38.field551 = (short) (this.field1172[arg0][arg1] - this.field1166[arg0][arg1]);
                    var38.field549 = (short) (this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1]);
                    var38.field547 = (short) (this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1]);
                    var38.field548 = (short) (this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1]);
                    var38.field546 = (short) var40;
                    if (this.method507(var41.field6386) || var41.field6388 != 0 || var41.field6390 != 0) {
                        var38.field545 = (byte) (var38.field545 | 4);
                    }
                } else {
                    short var42 = class704.method3958((byte) 125, var39);
                    var38.field551 = (short) class192.method1276(var42, (byte) -87, this.field1172[arg0][arg1] - this.field1166[arg0][arg1]);
                    var38.field549 = (short) class192.method1276(var42, (byte) -39, this.field1172[arg0 + 1][arg1] - this.field1166[arg0 + 1][arg1]);
                    var38.field547 = (short) class192.method1276(var42, (byte) 127, this.field1172[arg0 + 1][arg1 + 1] - this.field1166[arg0 + 1][arg1 + 1]);
                    var38.field548 = (short) class192.method1276(var42, (byte) -112, this.field1172[arg0][arg1 + 1] - this.field1166[arg0][arg1 + 1]);
                    var38.field546 = -1;
                }
                this.field1171[arg0][arg1] = var38;
            }
        }
    }
}
