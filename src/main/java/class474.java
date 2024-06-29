import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class474 {

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lup;")
    public static class181 field6867 = new class181(12, 4);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field6872 = 2;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "()V")
    public abstract void method417();

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "(I)V")
    public abstract void method436(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lc;Lvs;II)V")
    public abstract void method413(class123 arg0, class419 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public abstract void method439();

    @OriginalMember(owner = "client!t", name = "MA", descriptor = "()I")
    public abstract int method418();

    @OriginalMember(owner = "client!t", name = "PA", descriptor = "()I")
    public abstract int method409();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIILta;Z)V")
    public final void method2853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class143 arg7, boolean arg8) {
        field6862++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg0 / 2;
        int var14 = -arg1 / 2;
        int var15 = arg7.method396(arg3 + var13, arg2 + var14);
        int var16 = arg0 / 2;
        int var17 = -arg1 / 2;
        int var18 = arg7.method396(arg3 + var16, arg2 + var17);
        int var19 = -arg0 / 2;
        int var20 = arg1 / 2;
        int var21 = arg7.method396(arg3 + var19, arg2 + var20);
        int var22 = arg0 / 2;
        int var23 = arg1 / 2;
        int var24 = arg7.method396(arg3 + var22, arg2 + var23);
        int var25 = var18 <= var15 ? var18 : var15;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var24 <= var18 ? var24 : var18;
        int var28 = var15 < var21 ? var15 : var21;
        if (arg1 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg5 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg5;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (var29 > arg5) {
                        var29 = arg5;
                    }
                }
                this.method436(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg0 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg4 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg4;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (var32 > arg4) {
                        var32 = arg4;
                    }
                }
                this.method405(var32);
            }
        }
        if (!arg8) {
            return;
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg6;
        if (var34 != 0) {
            this.method443(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!t", name = "R", descriptor = "(I)V")
    public abstract void method405(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method412(int arg0, int arg1, class123 arg2, boolean arg3);

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(IILta;Lta;III)V")
    public abstract void method404(int arg0, int arg1, class143 arg2, class143 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lcm;II)V")
    public final void method2854(class513 arg0, int arg1, int arg2) {
        if (arg1 > -120) {
            field6872 = 4;
        }
        field6871++;
        if (arg2 == -1 || !this.method411()) {
            return;
        }
        class509 var4 = arg0.field7440[arg2];
        class382 var5 = var4.field7328;
        for (int var6 = 0; var6 < var4.field7317; var6++) {
            short var7 = var4.field7321[var6];
            if (var5.field5032[var7]) {
                if (var4.field7316[var6] != -1) {
                    this.method414(0, 0, 0, 0);
                }
                this.method414(var5.field5030[var7], var4.field7314[var6], var4.field7319[var6], var4.field7318[var6]);
            }
        }
        this.method417();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLcm;IILcm;IIII)V")
    public final void method2855(boolean arg0, class513 arg1, int arg2, int arg3, class513 arg4, int arg5, int arg6, int arg7, int arg8) {
        field6870++;
        if (arg7 == -1 || !this.method411()) {
            return;
        }
        class509 var10 = arg1.field7440[arg7];
        class382 var11 = var10.field7328;
        class509 var12 = null;
        if (arg4 != null) {
            var12 = arg4.field7440[arg5];
            if (var12.field7328 != var11) {
                var12 = null;
            }
        }
        this.method2861(arg8, null, arg3, arg2, var10, var11, false, -31243, var12, arg6, arg0, null);
        this.method417();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static void method2856(boolean arg0) {
        if (!arg0) {
            field6867 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(Lba;)Lba;")
    public abstract class264 method433(class264 arg0);

    @OriginalMember(owner = "client!t", name = "XA", descriptor = "(I[IIIIIZ)V")
    public abstract void method420(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "()I")
    public abstract int method431();

    @OriginalMember(owner = "client!t", name = "m", descriptor = "()I")
    public abstract int method437();

    @OriginalMember(owner = "client!t", name = "M", descriptor = "(I[IIIIZI[I)V")
    public abstract void method444(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()[Lew;")
    public abstract class342[] method441();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I")
    public static final int method2857(int arg0, int arg1) {
        field6861++;
        return arg0 >= -67 ? 113 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([IIZILcm;IIILcm;II)V")
    public final void method2858(int[] arg0, int arg1, boolean arg2, int arg3, class513 arg4, int arg5, int arg6, int arg7, class513 arg8, int arg9, int arg10) {
        field6864++;
        if (arg1 == -1 || !this.method411()) {
            return;
        }
        if (arg3 < 92) {
            field6867 = null;
        }
        class509 var12 = arg8.field7440[arg1];
        class382 var13 = var12.field7328;
        class509 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field7440[arg10];
            if (var14.field7328 != var13) {
                var14 = null;
            }
        }
        this.method2861(arg5, null, arg6, arg7, var12, var13, false, -31243, var14, arg9, arg2, arg0);
        this.method417();
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public abstract void method402(int arg0);

    @OriginalMember(owner = "client!t", name = "D", descriptor = "()I")
    public abstract int method429();

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "()V")
    public abstract void method403();

    @OriginalMember(owner = "client!t", name = "NA", descriptor = "()I")
    public abstract int method434();

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "()I")
    public abstract int method426();

    @OriginalMember(owner = "client!t", name = "aa", descriptor = "(I)V")
    public abstract void method430(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method2859(int arg0) {
        class533.field7841 = -1;
        if (arg0 >= -10) {
            field6867 = null;
        }
        field6869++;
        class230.field2942 = 0;
        class274.field3441 = -1;
        class247.field3176 = -1;
    }

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(I)V")
    public abstract void method442(int arg0);

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()[Lfs;")
    public abstract class390[] method427();

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)Z")
    public static final boolean method2860(int arg0, int arg1) {
        if (arg1 == 4) {
            field6865++;
            return arg0 == 47 || arg0 == 58 || arg0 == 1012 || arg0 == 12 || arg0 == 4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!t", name = "E", descriptor = "(I)V")
    public abstract void method438(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lc;Lvs;I)V")
    public abstract void method415(class123 arg0, class419 arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "I", descriptor = "(SS)V")
    public abstract void method423(short arg0, short arg1);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lt;IIIZ)V")
    public abstract void method435(class474 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "P", descriptor = "()I")
    public abstract int method422();

    @OriginalMember(owner = "client!t", name = "U", descriptor = "()I")
    public abstract int method424();

    @OriginalMember(owner = "client!t", name = "w", descriptor = "()Z")
    public abstract boolean method411();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
    public abstract void method419(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()Z")
    public abstract boolean method432();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[ZIILrl;Lmd;ZILrl;IZ[I)V")
    private final void method2861(int arg0, boolean[] arg1, int arg2, int arg3, class509 arg4, class382 arg5, boolean arg6, int arg7, class509 arg8, int arg9, boolean arg10, int[] arg11) {
        if (arg7 != -31243) {
            this.method438(-82);
        }
        field6868++;
        if (arg8 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg4.field7317; var38++) {
                short var39 = arg4.field7321[var38];
                if (arg1 == null || arg1[var39] == arg6 || arg5.field5030[var39] == 0) {
                    short var40 = arg4.field7316[var38];
                    if (var40 != -1) {
                        this.method2863(-113, arg5.field5039[var40], 0, arg2 & arg5.field5033[var40], 0, arg10, arg9, arg11, 0, 0);
                    }
                    this.method2863(126, arg5.field5039[var39], arg4.field7319[var38], arg2 & arg5.field5033[var39], arg5.field5030[var39], arg10, arg9, arg11, arg4.field7318[var38], arg4.field7314[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg5.field5035; var15++) {
            boolean var16 = false;
            if (var13 < arg4.field7317 && arg4.field7321[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg8.field7317 && arg8.field7321[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg1 == null || arg1[var15] == arg6 || arg5.field5030[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg5.field5030[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var20 = arg4.field7318[var13];
                        var21 = arg4.field7316[var13];
                        var22 = arg4.field7319[var13];
                        var23 = arg4.field7314[var13];
                        var24 = arg4.field7326[var13];
                        var13++;
                    } else {
                        var24 = 0;
                        var21 = -1;
                        var23 = var18;
                        var20 = var18;
                        var22 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var25 = arg8.field7318[var14];
                        var26 = arg8.field7314[var14];
                        var27 = arg8.field7319[var14];
                        var28 = arg8.field7316[var14];
                        var29 = arg8.field7326[var14];
                        var14++;
                    } else {
                        var28 = -1;
                        var27 = var18;
                        var25 = var18;
                        var29 = 0;
                        var26 = var18;
                    }
                    if (var21 != -1) {
                        this.method2863(-95, arg5.field5039[var21], 0, arg2 & arg5.field5033[var21], 0, arg10, arg9, arg11, 0, 0);
                    } else if (var28 != -1) {
                        this.method2863(117, arg5.field5039[var28], 0, arg5.field5033[var28] & arg2, 0, arg10, arg9, arg11, 0, 0);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var24 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var31 = var20;
                        var32 = var22;
                        var33 = var23;
                    } else if (var19 == 2) {
                        int var35 = var26 - var23 & 0x3FFF;
                        int var36 = var27 - var22 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var25 - var20 & 0x3FFF;
                        var32 = var22 + (arg3 * var36 / arg0) & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg3 * var35 / arg0 + var23 & 0x3FFF;
                        var31 = arg3 * var37 / arg0 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var26 - var23 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = 0;
                        var32 = 0;
                        var33 = arg3 * var30 / arg0 + var23 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var34 = var26 - var23 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var32 = (var27 - var22) * arg3 / arg0 + var22;
                        var31 = (var25 - var20) * arg3 / arg0 + var20;
                        var33 = arg3 * var34 / arg0 + var23 & 0x3F;
                    } else {
                        var31 = (var25 - var20) * arg3 / arg0 + var20;
                        var33 = (var26 - var23) * arg3 / arg0 + var23;
                        var32 = (var27 - var22) * arg3 / arg0 + var22;
                    }
                    this.method2863(116, arg5.field5039[var15], var32, arg5.field5033[var15] & arg2, var19, arg10, arg9, arg11, var31, var33);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(III)V")
    public abstract void method443(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "BA", descriptor = "(SS)V")
    public abstract void method425(short arg0, short arg1);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B[ZIIZIIIILcm;ILcm;ILcm;Lcm;)V")
    public final void method2862(byte arg0, boolean[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, class513 arg9, int arg10, class513 arg11, int arg12, class513 arg13, class513 arg14) {
        field6863++;
        if (arg8 == -1) {
            return;
        }
        if (arg1 == null || arg10 == -1) {
            this.method2855(arg4, arg14, arg12, 65535, arg13, arg2, 0, arg8, arg5);
        } else if (this.method411()) {
            class509 var16 = arg14.field7440[arg8];
            class382 var17 = var16.field7328;
            if (arg0 == -19) {
                class509 var18 = null;
                if (arg13 != null) {
                    var18 = arg13.field7440[arg2];
                    if (var18.field7328 != var17) {
                        var18 = null;
                    }
                }
                this.method2861(arg5, arg1, 65535, arg12, var16, var17, false, -31243, var18, 0, arg4, null);
                class509 var19 = arg11.field7440[arg10];
                class509 var20 = null;
                if (arg9 != null) {
                    var20 = arg9.field7440[arg7];
                    if (var20.field7328 != var17) {
                        var20 = null;
                    }
                }
                this.method420(0, new int[0], 0, 0, 0, 0, arg4);
                this.method2861(arg3, arg1, 65535, arg6, var19, var19.field7328, true, -31243, var20, 0, arg4, null);
                this.method417();
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BIZ)Lt;")
    public abstract class474 method416(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(III)V")
    public abstract void method440(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[IIIIZI[III)V")
    private final void method2863(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7, int arg8, int arg9) {
        if (arg6 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = -arg9;
                arg9 = arg8;
                arg8 = var13;
            } else if (arg4 == 3) {
                int var11 = arg9;
                arg9 = arg8;
                arg8 = var11;
            } else if (arg4 == 2) {
                int var12 = arg9;
                arg9 = -arg8 & 0x3FFF;
                arg8 = var12 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg9 = -arg9;
                arg8 = -arg8;
            } else if (arg4 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = arg9;
                arg9 = -arg8;
                arg8 = var16;
            } else if (arg4 == 3) {
                int var15 = arg9;
                arg9 = arg8;
                arg8 = var15;
            } else if (arg4 == 2) {
                int var14 = arg9;
                arg9 = arg8 & 0x3FFF;
                arg8 = -var14 & 0x3FFF;
            }
        }
        field6866++;
        int var17 = -16 / ((75 - arg0) / 34);
        if (arg3 == 65535) {
            this.method420(arg4, arg1, arg9, arg2, arg8, arg6, arg5);
        } else {
            this.method444(arg4, arg1, arg9, arg2, arg8, arg5, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(I)V")
    public abstract void method421(int arg0);

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(IIII)V")
    public abstract void method414(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "()I")
    public abstract int method408();
}
