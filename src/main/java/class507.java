import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class507 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "[[B")
    public static byte[][] field7443;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
    public abstract int method507();

    @OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
    public abstract int method475();

    @OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
    public abstract void method502();

    @OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
    public abstract void method536();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lc;IIIZ)V")
    public abstract void method483(class507 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
    public abstract void method487(int arg0);

    @OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
    public abstract void method486(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Z")
    public abstract boolean method523();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILia;Z)Z")
    public abstract boolean method499(int arg0, int arg1, class142 arg2, boolean arg3);

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
    public abstract void method478(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIII[I[IIZ)V")
    private final void method3011(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, boolean arg9) {
        field7446++;
        if (arg5 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = -arg0;
                arg0 = arg3;
                arg3 = var13;
            } else if (arg4 == 3) {
                int var12 = arg0;
                arg0 = arg3;
                arg3 = var12;
            } else if (arg4 == 2) {
                int var11 = arg0;
                arg0 = -arg3 & 0x3FFF;
                arg3 = var11 & 0x3FFF;
            }
        } else if (arg5 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg0 = -arg0;
                arg3 = -arg3;
            } else if (arg4 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg0 = -arg0 & 0x3FFF;
            }
        } else if (arg5 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = arg0;
                arg0 = -arg3;
                arg3 = var16;
            } else if (arg4 == 3) {
                int var15 = arg0;
                arg0 = arg3;
                arg3 = var15;
            } else if (arg4 == 2) {
                int var14 = arg0;
                arg0 = arg3 & 0x3FFF;
                arg3 = -var14 & 0x3FFF;
            }
        }
        int var17 = -76 % ((57 - arg1) / 43);
        if (arg2 == 65535) {
            this.method521(arg4, arg7, arg0, arg8, arg3, arg5, arg9);
        } else {
            this.method533(arg4, arg7, arg0, arg8, arg3, arg9, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
    public abstract void method506(int arg0);

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILna;Lna;III)V")
    public abstract void method534(int arg0, int arg1, class251 arg2, class251 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
    public abstract int method524();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Laq;I)V")
    public abstract void method520(class142 arg0, class530 arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lj;)Lj;")
    public abstract class254 method525(class254 arg0);

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
    public abstract void method537(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
    public abstract int method490();

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
    public abstract void method508(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
    public abstract void method482(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()[Lot;")
    public abstract class165[] method476();

    @OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
    public abstract void method533(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Laq;II)V")
    public abstract void method512(class142 arg0, class530 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
    public abstract int method491();

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()[Lsm;")
    public abstract class473[] method493();

    @OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
    public abstract int method531();

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
    public abstract void method521(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method3012(int arg0) {
        if (arg0 < -89) {
            field7443 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
    public abstract void method522(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBLiu;)V")
    public final void method3013(int arg0, byte arg1, class424 arg2) {
        field7449++;
        if (arg0 == -1 || !this.method518()) {
            return;
        }
        class15 var4 = arg2.field5830[arg0];
        if (arg1 != 63) {
            this.method487(-12);
        }
        class509 var5 = var4.field246;
        for (int var6 = 0; var6 < var4.field243; var6++) {
            short var7 = var4.field248[var6];
            if (var5.field7470[var7]) {
                if (var4.field244[var6] != -1) {
                    this.method505(0, 0, 0, 0);
                }
                this.method505(var5.field7467[var7], var4.field242[var6], var4.field252[var6], var4.field254[var6]);
            }
        }
        this.method502();
    }

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
    public abstract int method519();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lc;")
    public abstract class507 method510(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
    public abstract void method505(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[ZIIILiu;ZILiu;Liu;IIILiu;)V")
    public final void method3014(int arg0, int arg1, boolean[] arg2, int arg3, int arg4, int arg5, class424 arg6, boolean arg7, int arg8, class424 arg9, class424 arg10, int arg11, int arg12, int arg13, class424 arg14) {
        field7448++;
        if (arg3 == -1) {
            return;
        }
        if (arg2 == null || arg11 == -1) {
            this.method3018(arg3, arg14, arg4, arg1, 0, arg12, arg9, arg7, (byte) 59);
        } else if (this.method518()) {
            int var16 = -33 / ((arg8 + 42) / 42);
            class15 var17 = arg14.field5830[arg3];
            class509 var18 = var17.field246;
            class15 var19 = null;
            if (arg9 != null) {
                var19 = arg9.field5830[arg12];
                if (var19.field246 != var18) {
                    var19 = null;
                }
            }
            this.method3017(var19, arg4, 0, arg7, arg2, false, false, null, var18, arg1, var17, 65535);
            class15 var20 = arg6.field5830[arg11];
            class15 var21 = null;
            if (arg10 != null) {
                var21 = arg10.field5830[arg5];
                if (var21.field246 != var18) {
                    var21 = null;
                }
            }
            this.method521(0, new int[0], 0, 0, 0, 0, arg7);
            this.method3017(var21, arg13, 0, arg7, arg2, true, false, null, var20.field246, arg0, var20, 65535);
            this.method502();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIBILna;)V")
    public final void method3015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, class251 arg8) {
        field7450++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg3 / 2;
        int var14 = -arg2 / 2;
        int var15 = arg8.method1185(arg7 + var13, arg5 - -var14);
        int var16 = arg3 / 2;
        int var17 = -arg2 / 2;
        int var18 = arg8.method1185(arg7 + var16, arg5 + var17);
        int var19 = -arg3 / 2;
        int var20 = arg2 / 2;
        int var21 = arg8.method1185(arg7 + var19, arg5 + var20);
        int var22 = arg3 / 2;
        int var23 = arg2 / 2;
        int var24 = arg8.method1185(arg7 + var22, arg5 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        if (arg2 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg0 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg0;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (var28 > arg0) {
                        var28 = arg0;
                    }
                }
                this.method535(var28);
            }
        }
        int var30 = var21 <= var15 ? var21 : var15;
        int var31 = var15 + var24;
        if (arg6 < 57) {
            this.method515();
        }
        if (arg3 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg1 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg1;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (var32 > arg1) {
                        var32 = arg1;
                    }
                }
                this.method506(var32);
            }
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg4;
        if (var34 != 0) {
            this.method537(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
    public abstract int method497();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Liu;I[IZIIIZIILiu;)V")
    public final void method3016(class424 arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, class424 arg10) {
        field7444++;
        if (arg6 == -1 || !arg7 || !this.method518()) {
            return;
        }
        class15 var12 = arg0.field5830[arg6];
        class509 var13 = var12.field246;
        class15 var14 = null;
        if (arg10 != null) {
            var14 = arg10.field5830[arg8];
            if (var14.field246 != var13) {
                var14 = null;
            }
        }
        this.method3017(var14, arg5, arg4, arg3, null, false, !arg7, arg2, var13, arg9, var12, arg1);
        this.method502();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    public abstract void method485(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ldc;IIZ[ZZZ[ILsp;ILdc;I)V")
    private final void method3017(class15 arg0, int arg1, int arg2, boolean arg3, boolean[] arg4, boolean arg5, boolean arg6, int[] arg7, class509 arg8, int arg9, class15 arg10, int arg11) {
        field7447++;
        if (arg0 == null || arg9 == 0) {
            for (int var38 = 0; var38 < arg10.field243; var38++) {
                short var39 = arg10.field248[var38];
                if (arg4 == null || arg4[var39] == arg5 || arg8.field7467[var39] == 0) {
                    short var40 = arg10.field244[var38];
                    if (var40 != -1) {
                        this.method3011(0, (byte) -120, arg8.field7466[var40] & arg11, 0, 0, arg2, arg7, arg8.field7469[var40], 0, arg3);
                    }
                    this.method3011(arg10.field242[var38], (byte) 104, arg11 & arg8.field7466[var39], arg10.field254[var38], arg8.field7467[var39], arg2, arg7, arg8.field7469[var39], arg10.field252[var38], arg3);
                }
            }
        } else if (!arg6) {
            int var13 = 0;
            int var14 = 0;
            for (int var15 = 0; var15 < arg8.field7468; var15++) {
                boolean var16 = false;
                if (arg10.field243 > var13 && arg10.field248[var13] == var15) {
                    var16 = true;
                }
                boolean var17 = false;
                if (var14 < arg0.field243 && arg0.field248[var14] == var15) {
                    var17 = true;
                }
                if (var16 || var17) {
                    if (arg4 == null || arg4[var15] == arg5 || arg8.field7467[var15] == 0) {
                        short var18 = 0;
                        int var19 = arg8.field7467[var15];
                        if (var19 == 3 || var19 == 10) {
                            var18 = 128;
                        }
                        short var20;
                        byte var21;
                        short var22;
                        short var23;
                        short var24;
                        if (var16) {
                            var20 = arg10.field252[var13];
                            var21 = arg10.field255[var13];
                            var22 = arg10.field244[var13];
                            var23 = arg10.field254[var13];
                            var24 = arg10.field242[var13];
                            var13++;
                        } else {
                            var24 = var18;
                            var22 = -1;
                            var23 = var18;
                            var21 = 0;
                            var20 = var18;
                        }
                        short var25;
                        byte var26;
                        short var27;
                        short var28;
                        short var29;
                        if (var17) {
                            var26 = arg0.field255[var14];
                            var27 = arg0.field254[var14];
                            var25 = arg0.field252[var14];
                            var28 = arg0.field244[var14];
                            var29 = arg0.field242[var14];
                            var14++;
                        } else {
                            var25 = var18;
                            var26 = 0;
                            var27 = var18;
                            var28 = -1;
                            var29 = var18;
                        }
                        int var30;
                        int var31;
                        int var32;
                        if ((var21 & 0x2) != 0 || (var26 & 0x1) != 0) {
                            var30 = var23;
                            var31 = var20;
                            var32 = var24;
                        } else if (var19 == 2) {
                            int var35 = var29 - var24 & 0x3FFF;
                            int var36 = var25 - var20 & 0x3FFF;
                            int var37 = var27 - var23 & 0x3FFF;
                            if (var35 >= 8192) {
                                var35 -= 16384;
                            }
                            if (var36 >= 8192) {
                                var36 -= 16384;
                            }
                            if (var37 >= 8192) {
                                var37 -= 16384;
                            }
                            var31 = var20 + (arg9 * var36 / arg1) & 0x3FFF;
                            var32 = arg9 * var35 / arg1 + var24 & 0x3FFF;
                            var30 = arg9 * var37 / arg1 + var23 & 0x3FFF;
                        } else if (var19 == 9) {
                            int var34 = var29 - var24 & 0x3FFF;
                            if (var34 >= 8192) {
                                var34 -= 16384;
                            }
                            var30 = 0;
                            var31 = 0;
                            var32 = arg9 * var34 / arg1 + var24 & 0x3FFF;
                        } else if (var19 == 7) {
                            int var33 = var29 - var24 & 0x3F;
                            if (var33 >= 32) {
                                var33 -= 64;
                            }
                            var31 = (var25 - var20) * arg9 / arg1 + var20;
                            var30 = var23 + ((var27 - var23) * arg9 / arg1);
                            var32 = var24 + (arg9 * var33 / arg1) & 0x3F;
                        } else {
                            var30 = var23 + ((var27 - var23) * arg9 / arg1);
                            var31 = (var25 - var20) * arg9 / arg1 + var20;
                            var32 = var24 + ((var29 - var24) * arg9 / arg1);
                        }
                        if (var22 != -1) {
                            this.method3011(0, (byte) 7, arg8.field7466[var22] & arg11, 0, 0, arg2, arg7, arg8.field7469[var22], 0, arg3);
                        } else if (var28 != -1) {
                            this.method3011(0, (byte) 102, arg11 & arg8.field7466[var28], 0, 0, arg2, arg7, arg8.field7469[var28], 0, arg3);
                        }
                        this.method3011(var32, (byte) -82, arg8.field7466[var15] & arg11, var30, var19, arg2, arg7, arg8.field7469[var15], var31, arg3);
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
    }

    @OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
    public abstract void method517(int arg0);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()V")
    public abstract void method492();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILiu;IIIILiu;ZB)V")
    public final void method3018(int arg0, class424 arg1, int arg2, int arg3, int arg4, int arg5, class424 arg6, boolean arg7, byte arg8) {
        if (arg8 != 59) {
            return;
        }
        field7445++;
        if (arg0 == -1 || !this.method518()) {
            return;
        }
        class15 var10 = arg1.field5830[arg0];
        class509 var11 = var10.field246;
        class15 var12 = null;
        if (arg6 != null) {
            var12 = arg6.field5830[arg5];
            if (var12.field246 != var11) {
                var12 = null;
            }
        }
        this.method3017(var12, arg2, arg4, arg7, null, false, false, null, var11, arg3, var10, 65535);
        this.method502();
    }

    @OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
    public abstract int method511();

    @OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
    public abstract void method535(int arg0);

    @OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
    public abstract void method516(int arg0);

    @OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
    public abstract int method515();

    @OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
    public abstract boolean method518();
}
