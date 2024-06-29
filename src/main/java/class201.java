import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class201 extends class47 {

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Z")
    public boolean field2845 = false;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lai;Lkd;Lkd;II[ZZZI[I)V", line = 9)
    private final void method1376(class134 arg0, class83 arg1, class83 arg2, int arg3, int arg4, boolean[] arg5, boolean arg6, boolean arg7, int arg8, int[] arg9) {
        if (arg2 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg1.field1064; var38++) {
                short var39 = arg1.field1057[var38];
                if (arg5 == null || arg5[var39] == arg6 || arg0.field1845[var39] == 0) {
                    short var40 = arg1.field1062[var38];
                    if (var40 != -1) {
                        int var41 = arg8 & arg0.field1841[var40];
                        if (var41 == 65535) {
                            this.method723(0, arg0.field1842[var40], 0, 0, 0, arg7);
                        } else {
                            this.method702(0, arg0.field1842[var40], 0, 0, 0, arg7, var41, arg9);
                        }
                    }
                    int var42 = arg8 & arg0.field1841[var39];
                    if (var42 == 65535) {
                        this.method723(arg0.field1845[var39], arg0.field1842[var39], arg1.field1056[var38], arg1.field1055[var38], arg1.field1051[var38], arg7);
                    } else {
                        this.method702(arg0.field1845[var39], arg0.field1842[var39], arg1.field1056[var38], arg1.field1055[var38], arg1.field1051[var38], arg7, var42, arg9);
                    }
                }
            }
            return;
        }
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < arg0.field1856; var13++) {
            boolean var14 = false;
            if (var11 < arg1.field1064 && arg1.field1057[var11] == var13) {
                var14 = true;
            }
            boolean var15 = false;
            if (var12 < arg2.field1064 && arg2.field1057[var12] == var13) {
                var15 = true;
            }
            if (var14 || var15) {
                if (arg5 == null || arg5[var13] == arg6 || arg0.field1845[var13] == 0) {
                    short var16 = 0;
                    int var17 = arg0.field1845[var13];
                    if (var17 == 3) {
                        var16 = 128;
                    }
                    short var18;
                    short var19;
                    short var20;
                    short var21;
                    byte var22;
                    if (var14) {
                        var18 = arg1.field1056[var11];
                        var19 = arg1.field1055[var11];
                        var20 = arg1.field1051[var11];
                        var21 = arg1.field1062[var11];
                        var22 = arg1.field1060[var11];
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
                        var23 = arg2.field1056[var12];
                        var24 = arg2.field1055[var12];
                        var25 = arg2.field1051[var12];
                        var26 = arg2.field1062[var12];
                        var27 = arg2.field1060[var12];
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
                        int var35 = arg8 & arg0.field1841[var21];
                        if (var35 == 65535) {
                            this.method723(0, arg0.field1842[var21], 0, 0, 0, arg7);
                        } else {
                            this.method702(0, arg0.field1842[var21], 0, 0, 0, arg7, var35, arg9);
                        }
                    } else if (var26 != -1) {
                        int var36 = arg8 & arg0.field1841[var26];
                        if (var36 == 65535) {
                            this.method723(0, arg0.field1842[var26], 0, 0, 0, arg7);
                        } else {
                            this.method702(0, arg0.field1842[var26], 0, 0, 0, arg7, var36, arg9);
                        }
                    }
                    int var37 = arg8 & arg0.field1841[var13];
                    if (var37 == 65535) {
                        this.method723(var17, arg0.field1842[var13], var31, var32, var33, arg7);
                    } else {
                        this.method702(var17, arg0.field1842[var13], var31, var32, var33, arg7, var37, arg9);
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

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([[III)I", line = 225)
    private static final int method1377(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lsf;ILsf;IIIIZ[I)V", line = 242)
    public final void method1378(class115 arg0, int arg1, class115 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int[] arg8) {
        if (arg1 == -1 || !this.method736()) {
            return;
        }
        class83 var10 = arg0.field1626[arg1];
        class134 var11 = var10.field1063;
        class83 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field1626[arg3];
            if (var12.field1063 != var11) {
                var12 = null;
            }
        }
        this.method1376(var11, var10, var12, arg4, arg5, (boolean[]) null, false, arg7, arg6, arg8);
        this.method685();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lsf;ILsf;IIILsf;ILsf;III[ZZ)V", line = 267)
    public final void method1379(class115 arg0, int arg1, class115 arg2, int arg3, int arg4, int arg5, class115 arg6, int arg7, class115 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
        if (arg1 == -1) {
            return;
        }
        if (arg12 == null || arg7 == -1) {
            this.method1381(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
        } else if (this.method736()) {
            class83 var15 = arg0.field1626[arg1];
            class134 var16 = var15.field1063;
            class83 var17 = null;
            if (arg2 != null) {
                var17 = arg2.field1626[arg3];
                if (var17.field1063 != var16) {
                    var17 = null;
                }
            }
            class83 var18 = arg6.field1626[arg7];
            class83 var19 = null;
            if (arg8 != null) {
                var19 = arg8.field1626[arg9];
                if (var19.field1063 != var16) {
                    var19 = null;
                }
            }
            this.method1376(var16, var15, var17, arg4, arg5, arg12, false, arg13, 65535, (int[]) null);
            this.method723(0, new int[0], 0, 0, 0, arg13);
            this.method1376(var16, var18, var19, arg10, arg11, arg12, true, arg13, 65535, (int[]) null);
            this.method685();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V", line = 323)
    public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lsf;I)V", line = 327)
    public final void method1380(class115 arg0, int arg1) {
        if (arg1 == -1 || !this.method736()) {
            return;
        }
        class83 var3 = arg0.field1626[arg1];
        class134 var4 = var3.field1063;
        for (int var5 = 0; var5 < var3.field1064; var5++) {
            short var6 = var3.field1057[var5];
            if (var4.field1857[var6]) {
                if (var3.field1062[var5] != -1) {
                    this.method709(0, 0, 0, 0);
                }
                this.method709(var4.field1845[var6], var3.field1056[var5], var3.field1055[var5], var3.field1051[var5]);
            }
        }
        this.method685();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lsf;ILsf;IIIZ)V", line = 358)
    public final void method1381(class115 arg0, int arg1, class115 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == -1 || !this.method736()) {
            return;
        }
        class83 var8 = arg0.field1626[arg1];
        class134 var9 = var8.field1063;
        class83 var10 = null;
        if (arg2 != null) {
            var10 = arg2.field1626[arg3];
            if (var10.field1063 != var9) {
                var10 = null;
            }
        }
        this.method1376(var9, var8, var10, arg4, arg5, (boolean[]) null, false, arg6, 65535, (int[]) null);
        this.method685();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([[IIIIII)V", line = 385)
    public final void method1382(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1377(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1377(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1377(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1377(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method700(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method734(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method688(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
    public abstract void method685();

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
    public abstract void method689();

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()V")
    public abstract void method738();

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "()I")
    public abstract int method697();

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "()Z")
    public abstract boolean method736();

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public abstract void method698(int arg0);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()I")
    public abstract int method11();

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "()I")
    public abstract int method721();

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "()I")
    public abstract int method718();

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "()I")
    public abstract int method728();

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)V")
    public abstract void method740(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "()I")
    public abstract int method696();

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZZ)Luc;")
    public abstract class201 method716(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(III)V")
    public abstract void method688(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(ZZZ)Luc;")
    public abstract class201 method707(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
    public abstract void method709(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public abstract void method700(int arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method702(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "()I")
    public abstract int method699();

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIIIZ)V")
    public abstract void method723(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIIJILid;)V")
    public abstract void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class274 arg10);

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public abstract void method734(int arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "()V")
    public abstract void method704();

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(ZZZ)Luc;")
    public abstract class201 method695(boolean arg0, boolean arg1, boolean arg2);
}
