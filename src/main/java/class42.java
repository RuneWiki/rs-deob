import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class42 extends class152 {

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Z")
    public boolean field895 = false;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lcc;Ln;Ln;II[ZZZI[I)V", line = 6)
    private final void method328(class276 arg0, class315 arg1, class315 arg2, int arg3, int arg4, boolean[] arg5, boolean arg6, boolean arg7, int arg8, int[] arg9) {
        if (arg2 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg1.field5128; var38++) {
                short var39 = arg1.field5119[var38];
                if (arg5 == null || arg5[var39] == arg6 || arg0.field4500[var39] == 0) {
                    short var40 = arg1.field5124[var38];
                    if (var40 != -1) {
                        int var41 = arg8 & arg0.field4504[var40];
                        if (var41 == 65535) {
                            this.method357(0, arg0.field4503[var40], 0, 0, 0, arg7);
                        } else {
                            this.method330(0, arg0.field4503[var40], 0, 0, 0, arg7, var41, arg9);
                        }
                    }
                    int var42 = arg8 & arg0.field4504[var39];
                    if (var42 == 65535) {
                        this.method357(arg0.field4500[var39], arg0.field4503[var39], arg1.field5120[var38], arg1.field5134[var38], arg1.field5127[var38], arg7);
                    } else {
                        this.method330(arg0.field4500[var39], arg0.field4503[var39], arg1.field5120[var38], arg1.field5134[var38], arg1.field5127[var38], arg7, var42, arg9);
                    }
                }
            }
            return;
        }
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < arg0.field4495; var13++) {
            boolean var14 = false;
            if (var11 < arg1.field5128 && arg1.field5119[var11] == var13) {
                var14 = true;
            }
            boolean var15 = false;
            if (var12 < arg2.field5128 && arg2.field5119[var12] == var13) {
                var15 = true;
            }
            if (var14 || var15) {
                if (arg5 == null || arg5[var13] == arg6 || arg0.field4500[var13] == 0) {
                    short var16 = 0;
                    int var17 = arg0.field4500[var13];
                    if (var17 == 3) {
                        var16 = 128;
                    }
                    short var18;
                    short var19;
                    short var20;
                    short var21;
                    byte var22;
                    if (var14) {
                        var18 = arg1.field5120[var11];
                        var19 = arg1.field5134[var11];
                        var20 = arg1.field5127[var11];
                        var21 = arg1.field5124[var11];
                        var22 = arg1.field5126[var11];
                        var11++;
                    } else {
                        var18 = var16;
                        var19 = var16;
                        var20 = var16;
                        var21 = -1;
                        var22 = 0;
                    }
                    short var23;
                    short var24;
                    short var25;
                    short var26;
                    byte var27;
                    if (var15) {
                        var23 = arg2.field5120[var12];
                        var24 = arg2.field5134[var12];
                        var25 = arg2.field5127[var12];
                        var26 = arg2.field5124[var12];
                        var27 = arg2.field5126[var12];
                        var12++;
                    } else {
                        var23 = var16;
                        var24 = var16;
                        var25 = var16;
                        var26 = -1;
                        var27 = 0;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var22 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var31 = var18;
                        var32 = var19;
                        var33 = var20;
                    } else if (var17 == 2) {
                        int var28 = var23 - var18 & 0x7FF;
                        int var29 = var24 - var19 & 0x7FF;
                        int var30 = var25 - var20 & 0x7FF;
                        if (var28 >= 1024) {
                            var28 -= 2048;
                        }
                        if (var29 >= 1024) {
                            var29 -= 2048;
                        }
                        if (var30 >= 1024) {
                            var30 -= 2048;
                        }
                        var31 = arg3 * var28 / arg4 + var18 & 0x7FF;
                        var32 = arg3 * var29 / arg4 + var19 & 0x7FF;
                        var33 = arg3 * var30 / arg4 + var20 & 0x7FF;
                    } else if (var17 == 7) {
                        int var34 = var23 - var18 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var31 = arg3 * var34 / arg4 + var18 & 0x3F;
                        var32 = (var24 - var19) * arg3 / arg4 + var19;
                        var33 = (var25 - var20) * arg3 / arg4 + var20;
                    } else {
                        var31 = (var23 - var18) * arg3 / arg4 + var18;
                        var32 = (var24 - var19) * arg3 / arg4 + var19;
                        var33 = (var25 - var20) * arg3 / arg4 + var20;
                    }
                    if (var21 != -1) {
                        int var35 = arg8 & arg0.field4504[var21];
                        if (var35 == 65535) {
                            this.method357(0, arg0.field4503[var21], 0, 0, 0, arg7);
                        } else {
                            this.method330(0, arg0.field4503[var21], 0, 0, 0, arg7, var35, arg9);
                        }
                    } else if (var26 != -1) {
                        int var36 = arg8 & arg0.field4504[var26];
                        if (var36 == 65535) {
                            this.method357(0, arg0.field4503[var26], 0, 0, 0, arg7);
                        } else {
                            this.method330(0, arg0.field4503[var26], 0, 0, 0, arg7, var36, arg9);
                        }
                    }
                    int var37 = arg8 & arg0.field4504[var13];
                    if (var37 == 65535) {
                        this.method357(var17, arg0.field4503[var13], var31, var32, var33, arg7);
                    } else {
                        this.method330(var17, arg0.field4503[var13], var31, var32, var33, arg7, var37, arg9);
                    }
                } else {
                    if (var14) {
                        var11++;
                    }
                    if (var15) {
                        var12++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([[IIIIII)V", line = 221)
    public final void method332(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method333(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method333(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method333(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method333(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method344(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method329(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method353(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([[III)I", line = 285)
    private static final int method333(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V", line = 302)
    public final void method334(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Leb;ILeb;IIIZ)V", line = 304)
    public final void method335(class133 arg0, int arg1, class133 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == -1 || !this.method336()) {
            return;
        }
        class315 var8 = arg0.field2291[arg1];
        class276 var9 = var8.field5121;
        class315 var10 = null;
        if (arg2 != null) {
            var10 = arg2.field2291[arg3];
            if (var10.field5121 != var9) {
                var10 = null;
            }
        }
        this.method328(var9, var8, var10, arg4, arg5, (boolean[]) null, false, arg6, 65535, (int[]) null);
        this.method348();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Leb;ILeb;IIILeb;ILeb;III[ZZ)V", line = 334)
    public final void method338(class133 arg0, int arg1, class133 arg2, int arg3, int arg4, int arg5, class133 arg6, int arg7, class133 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
        if (arg1 == -1) {
            return;
        }
        if (arg12 == null || arg7 == -1) {
            this.method335(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
        } else if (this.method336()) {
            class315 var15 = arg0.field2291[arg1];
            class276 var16 = var15.field5121;
            class315 var17 = null;
            if (arg2 != null) {
                var17 = arg2.field2291[arg3];
                if (var17.field5121 != var16) {
                    var17 = null;
                }
            }
            class315 var18 = arg6.field2291[arg7];
            class315 var19 = null;
            if (arg8 != null) {
                var19 = arg8.field2291[arg9];
                if (var19.field5121 != var16) {
                    var19 = null;
                }
            }
            this.method328(var16, var15, var17, arg4, arg5, arg12, false, arg13, 65535, (int[]) null);
            this.method357(0, new int[0], 0, 0, 0, arg13);
            this.method328(var16, var18, var19, arg10, arg11, arg12, true, arg13, 65535, (int[]) null);
            this.method348();
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Leb;ILeb;IIIIZ[I)V", line = 381)
    public final void method342(class133 arg0, int arg1, class133 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int[] arg8) {
        if (arg1 == -1 || !this.method336()) {
            return;
        }
        class315 var10 = arg0.field2291[arg1];
        class276 var11 = var10.field5121;
        class315 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field2291[arg3];
            if (var12.field5121 != var11) {
                var12 = null;
            }
        }
        this.method328(var11, var10, var12, arg4, arg5, (boolean[]) null, false, arg7, arg6, arg8);
        this.method348();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Leb;I)V", line = 417)
    public final void method352(class133 arg0, int arg1) {
        if (arg1 == -1 || !this.method336()) {
            return;
        }
        class315 var3 = arg0.field2291[arg1];
        class276 var4 = var3.field5121;
        for (int var5 = 0; var5 < var3.field5128; var5++) {
            short var6 = var3.field5119[var5];
            if (var4.field4501[var6]) {
                if (var3.field5124[var5] != -1) {
                    this.method337(0, 0, 0, 0);
                }
                this.method337(var4.field4500[var6], var3.field5120[var5], var3.field5134[var5], var3.field5127[var5]);
            }
        }
        this.method348();
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "()I")
    public abstract int method325();

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIIJILgl;)V")
    public abstract void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class214 arg10);

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public abstract void method329(int arg0);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method330(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "()I")
    public abstract int method331();

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "()Z")
    public abstract boolean method336();

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)V")
    public abstract void method337(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "()I")
    public abstract int method339();

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()I")
    public abstract int method340();

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "()V")
    public abstract void method341();

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "()V")
    public abstract void method343();

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public abstract void method344(int arg0);

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
    public abstract void method345(int arg0);

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "()I")
    public abstract int method346();

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZZZ)Lhb;")
    public abstract class42 method347(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "()V")
    public abstract void method348();

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(ZZZ)Lhb;")
    public abstract class42 method349(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "()I")
    public abstract int method350();

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V")
    public abstract void method351(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(III)V")
    public abstract void method353(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "()V")
    public abstract void method354();

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(ZZZ)Lhb;")
    public abstract class42 method355(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "()I")
    public abstract int method356();

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[IIIIZ)V")
    public abstract void method357(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5);
}
