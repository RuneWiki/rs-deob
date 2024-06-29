import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class242 extends class312 {

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Z")
    public boolean field4072 = false;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "()I")
    public abstract int method834();

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZZ)Lud;")
    public abstract class242 method838(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lwg;Lea;Lea;II[ZZZI[I)V")
    private final void method1732(class267 arg0, class252 arg1, class252 arg2, int arg3, int arg4, boolean[] arg5, boolean arg6, boolean arg7, int arg8, int[] arg9) {
        if (arg2 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg1.field4263; var38++) {
                short var39 = arg1.field4259[var38];
                if (arg5 == null || arg5[var39] == arg6 || arg0.field4451[var39] == 0) {
                    short var40 = arg1.field4261[var38];
                    if (var40 != -1) {
                        int var41 = arg8 & arg0.field4450[var40];
                        if (var41 == 65535) {
                            this.method859(0, arg0.field4444[var40], 0, 0, 0, arg7);
                        } else {
                            this.method846(0, arg0.field4444[var40], 0, 0, 0, arg7, var41, arg9);
                        }
                    }
                    int var42 = arg8 & arg0.field4450[var39];
                    if (var42 == 65535) {
                        this.method859(arg0.field4451[var39], arg0.field4444[var39], arg1.field4265[var38], arg1.field4258[var38], arg1.field4268[var38], arg7);
                    } else {
                        this.method846(arg0.field4451[var39], arg0.field4444[var39], arg1.field4265[var38], arg1.field4258[var38], arg1.field4268[var38], arg7, var42, arg9);
                    }
                }
            }
            return;
        }
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < arg0.field4448; var13++) {
            boolean var14 = false;
            if (var11 < arg1.field4263 && arg1.field4259[var11] == var13) {
                var14 = true;
            }
            boolean var15 = false;
            if (var12 < arg2.field4263 && arg2.field4259[var12] == var13) {
                var15 = true;
            }
            if (var14 || var15) {
                if (arg5 == null || arg5[var13] == arg6 || arg0.field4451[var13] == 0) {
                    short var16 = 0;
                    int var17 = arg0.field4451[var13];
                    if (var17 == 3) {
                        var16 = 128;
                    }
                    short var18;
                    short var19;
                    short var20;
                    short var21;
                    byte var22;
                    if (var14) {
                        var18 = arg1.field4265[var11];
                        var19 = arg1.field4258[var11];
                        var20 = arg1.field4268[var11];
                        var21 = arg1.field4261[var11];
                        var22 = arg1.field4270[var11];
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
                        var23 = arg2.field4265[var12];
                        var24 = arg2.field4258[var12];
                        var25 = arg2.field4268[var12];
                        var26 = arg2.field4261[var12];
                        var27 = arg2.field4270[var12];
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
                        int var35 = arg8 & arg0.field4450[var21];
                        if (var35 == 65535) {
                            this.method859(0, arg0.field4444[var21], 0, 0, 0, arg7);
                        } else {
                            this.method846(0, arg0.field4444[var21], 0, 0, 0, arg7, var35, arg9);
                        }
                    } else if (var26 != -1) {
                        int var36 = arg8 & arg0.field4450[var26];
                        if (var36 == 65535) {
                            this.method859(0, arg0.field4444[var26], 0, 0, 0, arg7);
                        } else {
                            this.method846(0, arg0.field4444[var26], 0, 0, 0, arg7, var36, arg9);
                        }
                    }
                    int var37 = arg8 & arg0.field4450[var13];
                    if (var37 == 65535) {
                        this.method859(var17, arg0.field4444[var13], var31, var32, var33, arg7);
                    } else {
                        this.method846(var17, arg0.field4444[var13], var31, var32, var33, arg7, var37, arg9);
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

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIJILge;)V")
    public abstract void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class139 arg10);

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "()I")
    public abstract int method854();

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "()V")
    public abstract void method849();

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "()I")
    public abstract int method835();

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(ZZZ)Lud;")
    public abstract class242 method857(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lbf;I)V")
    public final void method1733(class31 arg0, int arg1) {
        if (arg1 == -1 || !this.method855()) {
            return;
        }
        class252 var3 = arg0.field507[arg1];
        class267 var4 = var3.field4267;
        for (int var5 = 0; var5 < var3.field4263; var5++) {
            short var6 = var3.field4259[var5];
            if (var4.field4452[var6]) {
                if (var3.field4261[var5] != -1) {
                    this.method833(0, 0, 0, 0);
                }
                this.method833(var4.field4451[var6], var3.field4265[var5], var3.field4258[var5], var3.field4268[var5]);
            }
        }
        this.method832();
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)V")
    public abstract void method836(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "()I")
    public abstract int method860();

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([[IIIIII)V")
    public final void method1734(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1738(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1738(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1738(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1738(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method840(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method863(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method836(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lbf;ILbf;IIILbf;ILbf;III[ZZ)V")
    public final void method1735(class31 arg0, int arg1, class31 arg2, int arg3, int arg4, int arg5, class31 arg6, int arg7, class31 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
        if (arg1 == -1) {
            return;
        }
        if (arg12 == null || arg7 == -1) {
            this.method1737(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
        } else if (this.method855()) {
            class252 var15 = arg0.field507[arg1];
            class267 var16 = var15.field4267;
            class252 var17 = null;
            if (arg2 != null) {
                var17 = arg2.field507[arg3];
                if (var17.field4267 != var16) {
                    var17 = null;
                }
            }
            class252 var18 = arg6.field507[arg7];
            class252 var19 = null;
            if (arg8 != null) {
                var19 = arg8.field507[arg9];
                if (var19.field4267 != var16) {
                    var19 = null;
                }
            }
            this.method1732(var16, var15, var17, arg4, arg5, arg12, false, arg13, 65535, (int[]) null);
            this.method859(0, new int[0], 0, 0, 0, arg13);
            this.method1732(var16, var18, var19, arg10, arg11, arg12, true, arg13, 65535, (int[]) null);
            this.method832();
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "()V")
    public abstract void method832();

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method846(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "()V")
    public abstract void method851();

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lbf;ILbf;IIIIZ[I)V")
    public final void method1736(class31 arg0, int arg1, class31 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int[] arg8) {
        if (arg1 == -1 || !this.method855()) {
            return;
        }
        class252 var10 = arg0.field507[arg1];
        class267 var11 = var10.field4267;
        class252 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field507[arg3];
            if (var12.field4267 != var11) {
                var12 = null;
            }
        }
        this.method1732(var11, var10, var12, arg4, arg5, (boolean[]) null, false, arg7, arg6, arg8);
        this.method832();
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "()V")
    public abstract void method850();

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "()I")
    public abstract int method861();

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V")
    public abstract void method833(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lbf;ILbf;IIIZ)V")
    public final void method1737(class31 arg0, int arg1, class31 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == -1 || !this.method855()) {
            return;
        }
        class252 var8 = arg0.field507[arg1];
        class267 var9 = var8.field4267;
        class252 var10 = null;
        if (arg2 != null) {
            var10 = arg2.field507[arg3];
            if (var10.field4267 != var9) {
                var10 = null;
            }
        }
        this.method1732(var9, var8, var10, arg4, arg5, (boolean[]) null, false, arg6, 65535, (int[]) null);
        this.method832();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([[III)I")
    private static final int method1738(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(ZZZ)Lud;")
    public abstract class242 method841(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "()Z")
    public abstract boolean method855();

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIIII)V")
    public final void method930(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "()I")
    public abstract int method844();

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public abstract void method858(int arg0);

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(III)V")
    public abstract void method845(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[IIIIZ)V")
    public abstract void method859(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public abstract void method840(int arg0);

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public abstract void method863(int arg0);
}
