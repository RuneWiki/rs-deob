import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class14 extends class114 {

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Z")
    public boolean field178 = false;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[IIIIZ)V")
    public abstract void method78(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Leb;ILeb;IIIIZ[I)V")
    public final void method79(class247 arg0, int arg1, class247 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int[] arg8) {
        if (arg1 == -1 || !this.method106()) {
            return;
        }
        class125 var10 = arg0.field3695[arg1];
        class244 var11 = var10.field1887;
        class125 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field3695[arg3];
            if (var12.field1887 != var11) {
                var12 = null;
            }
        }
        this.method80(var11, var10, var12, arg4, arg5, (boolean[]) null, false, arg7, arg6, arg8);
        this.method103();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ld;Ldl;Ldl;II[ZZZI[I)V")
    private final void method80(class244 arg0, class125 arg1, class125 arg2, int arg3, int arg4, boolean[] arg5, boolean arg6, boolean arg7, int arg8, int[] arg9) {
        if (arg2 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg1.field1885; var38++) {
                short var39 = arg1.field1898[var38];
                if (arg5 == null || arg5[var39] == arg6 || arg0.field3652[var39] == 0) {
                    short var40 = arg1.field1899[var38];
                    if (var40 != -1) {
                        int var41 = arg8 & arg0.field3649[var40];
                        if (var41 == 65535) {
                            this.method78(0, arg0.field3648[var40], 0, 0, 0, arg7);
                        } else {
                            this.method102(0, arg0.field3648[var40], 0, 0, 0, arg7, var41, arg9);
                        }
                    }
                    int var42 = arg8 & arg0.field3649[var39];
                    if (var42 == 65535) {
                        this.method78(arg0.field3652[var39], arg0.field3648[var39], arg1.field1896[var38], arg1.field1893[var38], arg1.field1891[var38], arg7);
                    } else {
                        this.method102(arg0.field3652[var39], arg0.field3648[var39], arg1.field1896[var38], arg1.field1893[var38], arg1.field1891[var38], arg7, var42, arg9);
                    }
                }
            }
            return;
        }
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < arg0.field3654; var13++) {
            boolean var14 = false;
            if (var11 < arg1.field1885 && arg1.field1898[var11] == var13) {
                var14 = true;
            }
            boolean var15 = false;
            if (var12 < arg2.field1885 && arg2.field1898[var12] == var13) {
                var15 = true;
            }
            if (var14 || var15) {
                if (arg5 == null || arg5[var13] == arg6 || arg0.field3652[var13] == 0) {
                    short var16 = 0;
                    int var17 = arg0.field3652[var13];
                    if (var17 == 3) {
                        var16 = 128;
                    }
                    short var18;
                    short var19;
                    short var20;
                    short var21;
                    byte var22;
                    if (var14) {
                        var18 = arg1.field1896[var11];
                        var19 = arg1.field1893[var11];
                        var20 = arg1.field1891[var11];
                        var21 = arg1.field1899[var11];
                        var22 = arg1.field1886[var11];
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
                        var23 = arg2.field1896[var12];
                        var24 = arg2.field1893[var12];
                        var25 = arg2.field1891[var12];
                        var26 = arg2.field1899[var12];
                        var27 = arg2.field1886[var12];
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
                        int var35 = arg8 & arg0.field3649[var21];
                        if (var35 == 65535) {
                            this.method78(0, arg0.field3648[var21], 0, 0, 0, arg7);
                        } else {
                            this.method102(0, arg0.field3648[var21], 0, 0, 0, arg7, var35, arg9);
                        }
                    } else if (var26 != -1) {
                        int var36 = arg8 & arg0.field3649[var26];
                        if (var36 == 65535) {
                            this.method78(0, arg0.field3648[var26], 0, 0, 0, arg7);
                        } else {
                            this.method102(0, arg0.field3648[var26], 0, 0, 0, arg7, var36, arg9);
                        }
                    }
                    int var37 = arg8 & arg0.field3649[var13];
                    if (var37 == 65535) {
                        this.method78(var17, arg0.field3648[var13], var31, var32, var33, arg7);
                    } else {
                        this.method102(var17, arg0.field3648[var13], var31, var32, var33, arg7, var37, arg9);
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

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()I")
    public abstract int method81();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Leb;I)V")
    public final void method82(class247 arg0, int arg1) {
        if (arg1 == -1 || !this.method106()) {
            return;
        }
        class125 var3 = arg0.field3695[arg1];
        class244 var4 = var3.field1887;
        for (int var5 = 0; var5 < var3.field1885; var5++) {
            short var6 = var3.field1898[var5];
            if (var4.field3645[var6]) {
                if (var3.field1899[var5] != -1) {
                    this.method88(0, 0, 0, 0);
                }
                this.method88(var4.field3652[var6], var3.field1896[var5], var3.field1893[var5], var3.field1891[var5]);
            }
        }
        this.method103();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZZZ)Lfk;")
    public abstract class14 method83(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([[IIIIII)V")
    public final void method84(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method87(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method87(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method87(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method87(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method96(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method91(var27);
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

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "()V")
    public abstract void method85();

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "()I")
    public abstract int method86();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([[III)I")
    private static final int method87(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)V")
    public abstract void method88(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public abstract void method89(int arg0);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIIJILs;)V")
    public abstract void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class245 arg10);

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public abstract void method91(int arg0);

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(III)V")
    public abstract void method92(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(III)V")
    public abstract void method93(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(ZZZ)Lfk;")
    public abstract class14 method94(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Leb;ILeb;IIILeb;ILeb;III[ZZ)V")
    public final void method95(class247 arg0, int arg1, class247 arg2, int arg3, int arg4, int arg5, class247 arg6, int arg7, class247 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
        if (arg1 == -1) {
            return;
        }
        if (arg12 == null || arg7 == -1) {
            this.method105(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
        } else if (this.method106()) {
            class125 var15 = arg0.field3695[arg1];
            class244 var16 = var15.field1887;
            class125 var17 = null;
            if (arg2 != null) {
                var17 = arg2.field3695[arg3];
                if (var17.field1887 != var16) {
                    var17 = null;
                }
            }
            class125 var18 = arg6.field3695[arg7];
            class125 var19 = null;
            if (arg8 != null) {
                var19 = arg8.field3695[arg9];
                if (var19.field1887 != var16) {
                    var19 = null;
                }
            }
            this.method80(var16, var15, var17, arg4, arg5, arg12, false, arg13, 65535, (int[]) null);
            this.method78(0, new int[0], 0, 0, 0, arg13);
            this.method80(var16, var18, var19, arg10, arg11, arg12, true, arg13, 65535, (int[]) null);
            this.method103();
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public abstract void method96(int arg0);

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "()V")
    public abstract void method97();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "()I")
    public abstract int method99();

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "()I")
    public abstract int method100();

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "()V")
    public abstract void method101();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method102(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "()V")
    public abstract void method103();

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "()I")
    public abstract int method104();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Leb;ILeb;IIIZ)V")
    public final void method105(class247 arg0, int arg1, class247 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == -1 || !this.method106()) {
            return;
        }
        class125 var8 = arg0.field3695[arg1];
        class244 var9 = var8.field1887;
        class125 var10 = null;
        if (arg2 != null) {
            var10 = arg2.field3695[arg3];
            if (var10.field1887 != var9) {
                var10 = null;
            }
        }
        this.method80(var9, var8, var10, arg4, arg5, (boolean[]) null, false, arg6, 65535, (int[]) null);
        this.method103();
    }

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "()Z")
    public abstract boolean method106();

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(ZZZ)Lfk;")
    public abstract class14 method107(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "()I")
    public abstract int method108();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);
}
