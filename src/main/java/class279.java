import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class279 extends class184 {

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Z")
    public boolean field4448 = false;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZZZ)Lba;")
    public abstract class279 method99(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public abstract void method115(int arg0);

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()V")
    public abstract void method133();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([[III)I")
    private static final int method1821(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lpg;Lqb;Lqb;II[ZZZI[I)V")
    private final void method1822(class186 arg0, class289 arg1, class289 arg2, int arg3, int arg4, boolean[] arg5, boolean arg6, boolean arg7, int arg8, int[] arg9) {
        if (arg2 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg1.field4608; var38++) {
                short var39 = arg1.field4617[var38];
                if (arg5 == null || arg5[var39] == arg6 || arg0.field3011[var39] == 0) {
                    short var40 = arg1.field4613[var38];
                    if (var40 != -1) {
                        int var41 = arg8 & arg0.field3022[var40];
                        if (var41 == 65535) {
                            this.method131(0, arg0.field3019[var40], 0, 0, 0, arg7);
                        } else {
                            this.method112(0, arg0.field3019[var40], 0, 0, 0, arg7, var41, arg9);
                        }
                    }
                    int var42 = arg8 & arg0.field3022[var39];
                    if (var42 == 65535) {
                        this.method131(arg0.field3011[var39], arg0.field3019[var39], arg1.field4609[var38], arg1.field4611[var38], arg1.field4614[var38], arg7);
                    } else {
                        this.method112(arg0.field3011[var39], arg0.field3019[var39], arg1.field4609[var38], arg1.field4611[var38], arg1.field4614[var38], arg7, var42, arg9);
                    }
                }
            }
            return;
        }
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < arg0.field3021; var13++) {
            boolean var14 = false;
            if (var11 < arg1.field4608 && arg1.field4617[var11] == var13) {
                var14 = true;
            }
            boolean var15 = false;
            if (var12 < arg2.field4608 && arg2.field4617[var12] == var13) {
                var15 = true;
            }
            if (var14 || var15) {
                if (arg5 == null || arg5[var13] == arg6 || arg0.field3011[var13] == 0) {
                    short var16 = 0;
                    int var17 = arg0.field3011[var13];
                    if (var17 == 3) {
                        var16 = 128;
                    }
                    short var18;
                    short var19;
                    short var20;
                    short var21;
                    byte var22;
                    if (var14) {
                        var18 = arg1.field4609[var11];
                        var19 = arg1.field4611[var11];
                        var20 = arg1.field4614[var11];
                        var21 = arg1.field4613[var11];
                        var22 = arg1.field4615[var11];
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
                        var23 = arg2.field4609[var12];
                        var24 = arg2.field4611[var12];
                        var25 = arg2.field4614[var12];
                        var26 = arg2.field4613[var12];
                        var27 = arg2.field4615[var12];
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
                        int var35 = arg8 & arg0.field3022[var21];
                        if (var35 == 65535) {
                            this.method131(0, arg0.field3019[var21], 0, 0, 0, arg7);
                        } else {
                            this.method112(0, arg0.field3019[var21], 0, 0, 0, arg7, var35, arg9);
                        }
                    } else if (var26 != -1) {
                        int var36 = arg8 & arg0.field3022[var26];
                        if (var36 == 65535) {
                            this.method131(0, arg0.field3019[var26], 0, 0, 0, arg7);
                        } else {
                            this.method112(0, arg0.field3019[var26], 0, 0, 0, arg7, var36, arg9);
                        }
                    }
                    int var37 = arg8 & arg0.field3022[var13];
                    if (var37 == 65535) {
                        this.method131(var17, arg0.field3019[var13], var31, var32, var33, arg7);
                    } else {
                        this.method112(var17, arg0.field3019[var13], var31, var32, var33, arg7, var37, arg9);
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

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()I")
    public abstract int method104();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lgk;I)V")
    public final void method1823(class259 arg0, int arg1) {
        if (arg1 == -1 || !this.method105()) {
            return;
        }
        class289 var3 = arg0.field4241[arg1];
        class186 var4 = var3.field4610;
        for (int var5 = 0; var5 < var3.field4608; var5++) {
            short var6 = var3.field4617[var5];
            if (var4.field3018[var6]) {
                if (var3.field4613[var5] != -1) {
                    this.method111(0, 0, 0, 0);
                }
                this.method111(var4.field3011[var6], var3.field4609[var5], var3.field4611[var5], var3.field4614[var5]);
            }
        }
        this.method123();
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)V")
    public abstract void method106(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(III)V")
    public abstract void method126(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "()V")
    public abstract void method117();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method112(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(ZZZ)Lba;")
    public abstract class279 method129(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "()I")
    public abstract int method113();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public abstract void method111(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIIJILgh;)V")
    public abstract void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class32 arg10);

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public abstract void method118(int arg0);

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public abstract void method128(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lgk;ILgk;IIILgk;ILgk;III[ZZ)V")
    public final void method1824(class259 arg0, int arg1, class259 arg2, int arg3, int arg4, int arg5, class259 arg6, int arg7, class259 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
        if (arg1 == -1) {
            return;
        }
        if (arg12 == null || arg7 == -1) {
            this.method1827(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
        } else if (this.method105()) {
            class289 var15 = arg0.field4241[arg1];
            class186 var16 = var15.field4610;
            class289 var17 = null;
            if (arg2 != null) {
                var17 = arg2.field4241[arg3];
                if (var17.field4610 != var16) {
                    var17 = null;
                }
            }
            class289 var18 = arg6.field4241[arg7];
            class289 var19 = null;
            if (arg8 != null) {
                var19 = arg8.field4241[arg9];
                if (var19.field4610 != var16) {
                    var19 = null;
                }
            }
            this.method1822(var16, var15, var17, arg4, arg5, arg12, false, arg13, 65535, (int[]) null);
            this.method131(0, new int[0], 0, 0, 0, arg13);
            this.method1822(var16, var18, var19, arg10, arg11, arg12, true, arg13, 65535, (int[]) null);
            this.method123();
        }
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "()Z")
    public abstract boolean method105();

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(ZZZ)Lba;")
    public abstract class279 method121(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lgk;ILgk;IIIIZ[I)V")
    public final void method1825(class259 arg0, int arg1, class259 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int[] arg8) {
        if (arg1 == -1 || !this.method105()) {
            return;
        }
        class289 var10 = arg0.field4241[arg1];
        class186 var11 = var10.field4610;
        class289 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field4241[arg3];
            if (var12.field4610 != var11) {
                var12 = null;
            }
        }
        this.method1822(var11, var10, var12, arg4, arg5, (boolean[]) null, false, arg7, arg6, arg8);
        this.method123();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[IIIIZ)V")
    public abstract void method131(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "()V")
    public abstract void method123();

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "()I")
    public abstract int method98();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "()V")
    public abstract void method130();

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "()I")
    public abstract int method114();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()I")
    public abstract int method110();

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "()I")
    public abstract int method109();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([[IIIIII)V")
    public final void method1826(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1821(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1821(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1821(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1821(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method128(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method118(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method126(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lgk;ILgk;IIIZ)V")
    public final void method1827(class259 arg0, int arg1, class259 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == -1 || !this.method105()) {
            return;
        }
        class289 var8 = arg0.field4241[arg1];
        class186 var9 = var8.field4610;
        class289 var10 = null;
        if (arg2 != null) {
            var10 = arg2.field4241[arg3];
            if (var10.field4610 != var9) {
                var10 = null;
            }
        }
        this.method1822(var9, var8, var10, arg4, arg5, (boolean[]) null, false, arg6, 65535, (int[]) null);
        this.method123();
    }
}
