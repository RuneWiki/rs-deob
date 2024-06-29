import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class106 extends class131 {

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Z")
    public boolean field1435 = false;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZZZ)Lah;")
    public abstract class106 method641(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lfd;ILfd;IIILfd;ILfd;III[ZZ)V")
    public final void method642(class58 arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5, class58 arg6, int arg7, class58 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
        if (arg1 == -1) {
            return;
        }
        if (arg12 == null || arg7 == -1) {
            this.method647(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
        } else if (this.method651()) {
            class132 var15 = arg0.field686[arg1];
            class73 var16 = var15.field1903;
            class132 var17 = null;
            if (arg2 != null) {
                var17 = arg2.field686[arg3];
                if (var17.field1903 != var16) {
                    var17 = null;
                }
            }
            class132 var18 = arg6.field686[arg7];
            class132 var19 = null;
            if (arg8 != null) {
                var19 = arg8.field686[arg9];
                if (var19.field1903 != var16) {
                    var19 = null;
                }
            }
            this.method649(var16, var15, var17, arg4, arg5, arg12, false, arg13, 65535, (int[]) null);
            this.method659(0, new int[0], 0, 0, 0, arg13);
            this.method649(var16, var18, var19, arg10, arg11, arg12, true, arg13, 65535, (int[]) null);
            this.method658();
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([[IIIIII)V")
    public final void method643(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method669(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method669(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method669(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method669(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method666(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method646(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method645(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()I")
    public abstract int method227();

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public abstract void method644(int arg0);

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)V")
    public abstract void method645(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public abstract void method646(int arg0);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lfd;ILfd;IIIZ)V")
    public final void method647(class58 arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == -1 || !this.method651()) {
            return;
        }
        class132 var8 = arg0.field686[arg1];
        class73 var9 = var8.field1903;
        class132 var10 = null;
        if (arg2 != null) {
            var10 = arg2.field686[arg3];
            if (var10.field1903 != var9) {
                var10 = null;
            }
        }
        this.method649(var9, var8, var10, arg4, arg5, (boolean[]) null, false, arg6, 65535, (int[]) null);
        this.method658();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIIJILqd;)V")
    public abstract void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class162 arg10);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method648(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lqa;Lvb;Lvb;II[ZZZI[I)V")
    private final void method649(class73 arg0, class132 arg1, class132 arg2, int arg3, int arg4, boolean[] arg5, boolean arg6, boolean arg7, int arg8, int[] arg9) {
        if (arg2 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg1.field1907; var38++) {
                short var39 = arg1.field1899[var38];
                if (arg5 == null || arg5[var39] == arg6 || arg0.field876[var39] == 0) {
                    short var40 = arg1.field1908[var38];
                    if (var40 != -1) {
                        int var41 = arg8 & arg0.field877[var40];
                        if (var41 == 65535) {
                            this.method659(0, arg0.field874[var40], 0, 0, 0, arg7);
                        } else {
                            this.method648(0, arg0.field874[var40], 0, 0, 0, arg7, var41, arg9);
                        }
                    }
                    int var42 = arg8 & arg0.field877[var39];
                    if (var42 == 65535) {
                        this.method659(arg0.field876[var39], arg0.field874[var39], arg1.field1911[var38], arg1.field1897[var38], arg1.field1900[var38], arg7);
                    } else {
                        this.method648(arg0.field876[var39], arg0.field874[var39], arg1.field1911[var38], arg1.field1897[var38], arg1.field1900[var38], arg7, var42, arg9);
                    }
                }
            }
            return;
        }
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < arg0.field873; var13++) {
            boolean var14 = false;
            if (var11 < arg1.field1907 && arg1.field1899[var11] == var13) {
                var14 = true;
            }
            boolean var15 = false;
            if (var12 < arg2.field1907 && arg2.field1899[var12] == var13) {
                var15 = true;
            }
            if (var14 || var15) {
                if (arg5 == null || arg5[var13] == arg6 || arg0.field876[var13] == 0) {
                    short var16 = 0;
                    int var17 = arg0.field876[var13];
                    if (var17 == 3) {
                        var16 = 128;
                    }
                    short var18;
                    short var19;
                    short var20;
                    short var21;
                    byte var22;
                    if (var14) {
                        var18 = arg1.field1911[var11];
                        var19 = arg1.field1897[var11];
                        var20 = arg1.field1900[var11];
                        var21 = arg1.field1908[var11];
                        var22 = arg1.field1898[var11];
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
                        var23 = arg2.field1911[var12];
                        var24 = arg2.field1897[var12];
                        var25 = arg2.field1900[var12];
                        var26 = arg2.field1908[var12];
                        var27 = arg2.field1898[var12];
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
                        int var35 = arg8 & arg0.field877[var21];
                        if (var35 == 65535) {
                            this.method659(0, arg0.field874[var21], 0, 0, 0, arg7);
                        } else {
                            this.method648(0, arg0.field874[var21], 0, 0, 0, arg7, var35, arg9);
                        }
                    } else if (var26 != -1) {
                        int var36 = arg8 & arg0.field877[var26];
                        if (var36 == 65535) {
                            this.method659(0, arg0.field874[var26], 0, 0, 0, arg7);
                        } else {
                            this.method648(0, arg0.field874[var26], 0, 0, 0, arg7, var36, arg9);
                        }
                    }
                    int var37 = arg8 & arg0.field877[var13];
                    if (var37 == 65535) {
                        this.method659(var17, arg0.field874[var13], var31, var32, var33, arg7);
                    } else {
                        this.method648(var17, arg0.field874[var13], var31, var32, var33, arg7, var37, arg9);
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

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "()Z")
    public abstract boolean method651();

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "()I")
    public abstract int method652();

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "()I")
    public abstract int method653();

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "()I")
    public abstract int method654();

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "()V")
    public abstract void method655();

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)V")
    public abstract void method656(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "()I")
    public abstract int method657();

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "()V")
    public abstract void method658();

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[IIIIZ)V")
    public abstract void method659(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lfd;I)V")
    public final void method660(class58 arg0, int arg1) {
        if (arg1 == -1 || !this.method651()) {
            return;
        }
        class132 var3 = arg0.field686[arg1];
        class73 var4 = var3.field1903;
        for (int var5 = 0; var5 < var3.field1907; var5++) {
            short var6 = var3.field1899[var5];
            if (var4.field870[var6]) {
                if (var3.field1908[var5] != -1) {
                    this.method656(0, 0, 0, 0);
                }
                this.method656(var4.field876[var6], var3.field1911[var5], var3.field1897[var5], var3.field1900[var5]);
            }
        }
        this.method658();
    }

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "()I")
    public abstract int method661();

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(ZZZ)Lah;")
    public abstract class106 method662(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(III)V")
    public abstract void method663(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(ZZZ)Lah;")
    public abstract class106 method664(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lfd;ILfd;IIIIZ[I)V")
    public final void method665(class58 arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int[] arg8) {
        if (arg1 == -1 || !this.method651()) {
            return;
        }
        class132 var10 = arg0.field686[arg1];
        class73 var11 = var10.field1903;
        class132 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field686[arg3];
            if (var12.field1903 != var11) {
                var12 = null;
            }
        }
        this.method649(var11, var10, var12, arg4, arg5, (boolean[]) null, false, arg7, arg6, arg8);
        this.method658();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
    public abstract void method666(int arg0);

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "()V")
    public abstract void method667();

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "()V")
    public abstract void method668();

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([[III)I")
    private static final int method669(int[][] arg0, int arg1, int arg2) {
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
}
