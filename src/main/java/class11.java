import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class class11 extends class55 {

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Z")
    public boolean field170 = false;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V")
    public abstract void method64(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZZZ)Lhd;")
    public abstract class11 method65(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public abstract void method66(int arg0);

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "()I")
    public abstract int method67();

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(ZZZ)Lhd;")
    public abstract class11 method68(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public abstract void method69(int arg0);

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "()Z")
    public abstract boolean method70();

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lsj;ILsj;IIIZ)V")
    public final void method71(class50 arg0, int arg1, class50 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == -1 || !this.method70()) {
            return;
        }
        class158 var8 = arg0.field820[arg1];
        class8 var9 = var8.field2359;
        class158 var10 = null;
        if (arg2 != null) {
            var10 = arg2.field820[arg3];
            if (var10.field2359 != var9) {
                var10 = null;
            }
        }
        this.method83(var9, var8, var10, arg4, arg5, (boolean[]) null, false, arg6, 65535, (int[]) null);
        this.method79();
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "()I")
    public abstract int method72();

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "()V")
    public abstract void method73();

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)V")
    public abstract void method74(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public abstract void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10);

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "()I")
    public abstract int method76();

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "()V")
    public abstract void method77();

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "()V")
    public abstract void method78();

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "()V")
    public abstract void method79();

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lsj;ILsj;IIIIZ[I)V")
    public final void method80(class50 arg0, int arg1, class50 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int[] arg8) {
        if (arg1 == -1 || !this.method70()) {
            return;
        }
        class158 var10 = arg0.field820[arg1];
        class8 var11 = var10.field2359;
        class158 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field820[arg3];
            if (var12.field2359 != var11) {
                var12 = null;
            }
        }
        this.method83(var11, var10, var12, arg4, arg5, (boolean[]) null, false, arg7, arg6, arg8);
        this.method79();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([[III)I")
    private static final int method81(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()I")
    public abstract int method82();

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lrj;Lib;Lib;II[ZZZI[I)V")
    private final void method83(class8 arg0, class158 arg1, class158 arg2, int arg3, int arg4, boolean[] arg5, boolean arg6, boolean arg7, int arg8, int[] arg9) {
        if (arg2 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg1.field2369; var38++) {
                short var39 = arg1.field2360[var38];
                if (arg5 == null || arg5[var39] == arg6 || arg0.field132[var39] == 0) {
                    short var40 = arg1.field2365[var38];
                    if (var40 != -1) {
                        int var41 = arg8 & arg0.field139[var40];
                        if (var41 == 65535) {
                            this.method92(0, arg0.field136[var40], 0, 0, 0, arg7);
                        } else {
                            this.method84(0, arg0.field136[var40], 0, 0, 0, arg7, var41, arg9);
                        }
                    }
                    int var42 = arg8 & arg0.field139[var39];
                    if (var42 == 65535) {
                        this.method92(arg0.field132[var39], arg0.field136[var39], arg1.field2368[var38], arg1.field2362[var38], arg1.field2356[var38], arg7);
                    } else {
                        this.method84(arg0.field132[var39], arg0.field136[var39], arg1.field2368[var38], arg1.field2362[var38], arg1.field2356[var38], arg7, var42, arg9);
                    }
                }
            }
            return;
        }
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < arg0.field143; var13++) {
            boolean var14 = false;
            if (var11 < arg1.field2369 && arg1.field2360[var11] == var13) {
                var14 = true;
            }
            boolean var15 = false;
            if (var12 < arg2.field2369 && arg2.field2360[var12] == var13) {
                var15 = true;
            }
            if (var14 || var15) {
                if (arg5 == null || arg5[var13] == arg6 || arg0.field132[var13] == 0) {
                    short var16 = 0;
                    int var17 = arg0.field132[var13];
                    if (var17 == 3) {
                        var16 = 128;
                    }
                    short var18;
                    short var19;
                    short var20;
                    short var21;
                    byte var22;
                    if (var14) {
                        var18 = arg1.field2368[var11];
                        var19 = arg1.field2362[var11];
                        var20 = arg1.field2356[var11];
                        var21 = arg1.field2365[var11];
                        var22 = arg1.field2363[var11];
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
                        var23 = arg2.field2368[var12];
                        var24 = arg2.field2362[var12];
                        var25 = arg2.field2356[var12];
                        var26 = arg2.field2365[var12];
                        var27 = arg2.field2363[var12];
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
                        int var35 = arg8 & arg0.field139[var21];
                        if (var35 == 65535) {
                            this.method92(0, arg0.field136[var21], 0, 0, 0, arg7);
                        } else {
                            this.method84(0, arg0.field136[var21], 0, 0, 0, arg7, var35, arg9);
                        }
                    } else if (var26 != -1) {
                        int var36 = arg8 & arg0.field139[var26];
                        if (var36 == 65535) {
                            this.method92(0, arg0.field136[var26], 0, 0, 0, arg7);
                        } else {
                            this.method84(0, arg0.field136[var26], 0, 0, 0, arg7, var36, arg9);
                        }
                    }
                    int var37 = arg8 & arg0.field139[var13];
                    if (var37 == 65535) {
                        this.method92(var17, arg0.field136[var13], var31, var32, var33, arg7);
                    } else {
                        this.method84(var17, arg0.field136[var13], var31, var32, var33, arg7, var37, arg9);
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

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method84(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "()I")
    public abstract int method85();

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([[IIIIII)V")
    public final void method86(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method81(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method81(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method81(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method81(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method87(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method69(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method93(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public abstract void method87(int arg0);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lsj;I)V")
    public final void method88(class50 arg0, int arg1) {
        if (arg1 == -1 || !this.method70()) {
            return;
        }
        class158 var3 = arg0.field820[arg1];
        class8 var4 = var3.field2359;
        for (int var5 = 0; var5 < var3.field2369; var5++) {
            short var6 = var3.field2360[var5];
            if (var4.field140[var6]) {
                if (var3.field2365[var5] != -1) {
                    this.method74(0, 0, 0, 0);
                }
                this.method74(var4.field132[var6], var3.field2368[var5], var3.field2362[var5], var3.field2356[var5]);
            }
        }
        this.method79();
    }

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "()I")
    public abstract int method89();

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(ZZZ)Lhd;")
    public abstract class11 method90(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[IIIIZ)V")
    public abstract void method92(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(III)V")
    public abstract void method93(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lsj;ILsj;IIILsj;ILsj;III[ZZ)V")
    public final void method95(class50 arg0, int arg1, class50 arg2, int arg3, int arg4, int arg5, class50 arg6, int arg7, class50 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
        if (arg1 == -1) {
            return;
        }
        if (arg12 == null || arg7 == -1) {
            this.method71(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
        } else if (this.method70()) {
            class158 var15 = arg0.field820[arg1];
            class8 var16 = var15.field2359;
            class158 var17 = null;
            if (arg2 != null) {
                var17 = arg2.field820[arg3];
                if (var17.field2359 != var16) {
                    var17 = null;
                }
            }
            class158 var18 = arg6.field820[arg7];
            class158 var19 = null;
            if (arg8 != null) {
                var19 = arg8.field820[arg9];
                if (var19.field2359 != var16) {
                    var19 = null;
                }
            }
            this.method83(var16, var15, var17, arg4, arg5, arg12, false, arg13, 65535, (int[]) null);
            this.method92(0, new int[0], 0, 0, 0, arg13);
            this.method83(var16, var18, var19, arg10, arg11, arg12, true, arg13, 65535, (int[]) null);
            this.method79();
        }
    }
}
