import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class22 extends class178 {

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Z")
    public boolean field246 = false;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lil;ILil;IIIZ)V")
    public final void method139(class165 arg0, int arg1, class165 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == -1 || !this.method151()) {
            return;
        }
        class249 var8 = arg0.field2675[arg1];
        class191 var9 = var8.field4148;
        class249 var10 = null;
        if (arg2 != null) {
            var10 = arg2.field2675[arg3];
            if (var10.field4148 != var9) {
                var10 = null;
            }
        }
        this.method162(var9, var8, var10, arg4, arg5, (boolean[]) null, false, arg6, 65535, (int[]) null);
        this.method163();
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "()I")
    public abstract int method140();

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lil;ILil;IIILil;ILil;III[ZZ)V")
    public final void method141(class165 arg0, int arg1, class165 arg2, int arg3, int arg4, int arg5, class165 arg6, int arg7, class165 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
        if (arg1 == -1) {
            return;
        }
        if (arg12 == null || arg7 == -1) {
            this.method139(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
        } else if (this.method151()) {
            class249 var15 = arg0.field2675[arg1];
            class191 var16 = var15.field4148;
            class249 var17 = null;
            if (arg2 != null) {
                var17 = arg2.field2675[arg3];
                if (var17.field4148 != var16) {
                    var17 = null;
                }
            }
            class249 var18 = arg6.field2675[arg7];
            class249 var19 = null;
            if (arg8 != null) {
                var19 = arg8.field2675[arg9];
                if (var19.field4148 != var16) {
                    var19 = null;
                }
            }
            this.method162(var16, var15, var17, arg4, arg5, arg12, false, arg13, 65535, (int[]) null);
            this.method142(0, new int[0], 0, 0, 0, arg13);
            this.method162(var16, var18, var19, arg10, arg11, arg12, true, arg13, 65535, (int[]) null);
            this.method163();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[IIIIZ)V")
    public abstract void method142(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "()V")
    public abstract void method143();

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([[IIIIII)V")
    public final void method144(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method150(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method150(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method150(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method150(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method161(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method152(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method156(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZZ)Lpc;")
    public abstract class22 method145(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIIJILbj;)V")
    public abstract void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class157 arg10);

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "()I")
    public abstract int method146();

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public abstract void method147(int arg0);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lil;I)V")
    public final void method148(class165 arg0, int arg1) {
        if (arg1 == -1 || !this.method151()) {
            return;
        }
        class249 var3 = arg0.field2675[arg1];
        class191 var4 = var3.field4148;
        for (int var5 = 0; var5 < var3.field4141; var5++) {
            short var6 = var3.field4143[var5];
            if (var4.field3080[var6]) {
                if (var3.field4135[var5] != -1) {
                    this.method164(0, 0, 0, 0);
                }
                this.method164(var4.field3084[var6], var3.field4144[var5], var3.field4140[var5], var3.field4133[var5]);
            }
        }
        this.method163();
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "()I")
    public abstract int method149();

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([[III)I")
    private static final int method150(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "()Z")
    public abstract boolean method151();

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public abstract void method152(int arg0);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)V")
    public abstract void method153(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(ZZZ)Lpc;")
    public abstract class22 method155(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(III)V")
    public abstract void method156(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "()V")
    public abstract void method157();

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(ZZZ)Lpc;")
    public abstract class22 method158(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "()I")
    public abstract int method159();

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "()V")
    public abstract void method160();

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public abstract void method161(int arg0);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lbd;Lcb;Lcb;II[ZZZI[I)V")
    private final void method162(class191 arg0, class249 arg1, class249 arg2, int arg3, int arg4, boolean[] arg5, boolean arg6, boolean arg7, int arg8, int[] arg9) {
        if (arg2 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg1.field4141; var38++) {
                short var39 = arg1.field4143[var38];
                if (arg5 == null || arg5[var39] == arg6 || arg0.field3084[var39] == 0) {
                    short var40 = arg1.field4135[var38];
                    if (var40 != -1) {
                        int var41 = arg8 & arg0.field3078[var40];
                        if (var41 == 65535) {
                            this.method142(0, arg0.field3077[var40], 0, 0, 0, arg7);
                        } else {
                            this.method167(0, arg0.field3077[var40], 0, 0, 0, arg7, var41, arg9);
                        }
                    }
                    int var42 = arg8 & arg0.field3078[var39];
                    if (var42 == 65535) {
                        this.method142(arg0.field3084[var39], arg0.field3077[var39], arg1.field4144[var38], arg1.field4140[var38], arg1.field4133[var38], arg7);
                    } else {
                        this.method167(arg0.field3084[var39], arg0.field3077[var39], arg1.field4144[var38], arg1.field4140[var38], arg1.field4133[var38], arg7, var42, arg9);
                    }
                }
            }
            return;
        }
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < arg0.field3074; var13++) {
            boolean var14 = false;
            if (var11 < arg1.field4141 && arg1.field4143[var11] == var13) {
                var14 = true;
            }
            boolean var15 = false;
            if (var12 < arg2.field4141 && arg2.field4143[var12] == var13) {
                var15 = true;
            }
            if (var14 || var15) {
                if (arg5 == null || arg5[var13] == arg6 || arg0.field3084[var13] == 0) {
                    short var16 = 0;
                    int var17 = arg0.field3084[var13];
                    if (var17 == 3) {
                        var16 = 128;
                    }
                    short var18;
                    short var19;
                    short var20;
                    short var21;
                    byte var22;
                    if (var14) {
                        var18 = arg1.field4144[var11];
                        var19 = arg1.field4140[var11];
                        var20 = arg1.field4133[var11];
                        var21 = arg1.field4135[var11];
                        var22 = arg1.field4137[var11];
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
                        var23 = arg2.field4144[var12];
                        var24 = arg2.field4140[var12];
                        var25 = arg2.field4133[var12];
                        var26 = arg2.field4135[var12];
                        var27 = arg2.field4137[var12];
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
                        int var35 = arg8 & arg0.field3078[var21];
                        if (var35 == 65535) {
                            this.method142(0, arg0.field3077[var21], 0, 0, 0, arg7);
                        } else {
                            this.method167(0, arg0.field3077[var21], 0, 0, 0, arg7, var35, arg9);
                        }
                    } else if (var26 != -1) {
                        int var36 = arg8 & arg0.field3078[var26];
                        if (var36 == 65535) {
                            this.method142(0, arg0.field3077[var26], 0, 0, 0, arg7);
                        } else {
                            this.method167(0, arg0.field3077[var26], 0, 0, 0, arg7, var36, arg9);
                        }
                    }
                    int var37 = arg8 & arg0.field3078[var13];
                    if (var37 == 65535) {
                        this.method142(var17, arg0.field3077[var13], var31, var32, var33, arg7);
                    } else {
                        this.method167(var17, arg0.field3077[var13], var31, var32, var33, arg7, var37, arg9);
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

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "()V")
    public abstract void method163();

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)V")
    public abstract void method164(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lil;ILil;IIIIZ[I)V")
    public final void method165(class165 arg0, int arg1, class165 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int[] arg8) {
        if (arg1 == -1 || !this.method151()) {
            return;
        }
        class249 var10 = arg0.field2675[arg1];
        class191 var11 = var10.field4148;
        class249 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field2675[arg3];
            if (var12.field4148 != var11) {
                var12 = null;
            }
        }
        this.method162(var11, var10, var12, arg4, arg5, (boolean[]) null, false, arg7, arg6, arg8);
        this.method163();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()I")
    public abstract int method3();

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "()I")
    public abstract int method166();

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method167(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }
}
