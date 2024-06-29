import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class55 {

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
    public boolean field724 = false;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field717 = -1;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "[Z")
    public static boolean[] field726 = new boolean[100];

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lcf;")
    public static class561 field723 = new class561();

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field727 = -1;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([III[IIZIIIB)V", line = 14)
    private final void method605(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, byte arg9) {
        field722++;
        int var11 = 104 % ((-arg9 - 34) / 43);
        if (arg4 == 1) {
            if (arg6 == 0 || arg6 == 1) {
                int var14 = -arg1;
                arg1 = arg8;
                arg8 = var14;
            } else if (arg6 == 3) {
                int var13 = arg1;
                arg1 = arg8;
                arg8 = var13;
            } else if (arg6 == 2) {
                int var12 = arg1;
                arg1 = -arg8 & 0x3FFF;
                arg8 = var12 & 0x3FFF;
            }
        } else if (arg4 == 2) {
            if (arg6 == 0 || arg6 == 1) {
                arg1 = -arg1;
                arg8 = -arg8;
            } else if (arg6 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg1 = -arg1 & 0x3FFF;
            }
        } else if (arg4 == 3) {
            if (arg6 == 0 || arg6 == 1) {
                int var17 = arg1;
                arg1 = -arg8;
                arg8 = var17;
            } else if (arg6 == 3) {
                int var16 = arg1;
                arg1 = arg8;
                arg8 = var16;
            } else if (arg6 == 2) {
                int var15 = arg1;
                arg1 = arg8 & 0x3FFF;
                arg8 = -var15 & 0x3FFF;
            }
        }
        if (arg2 == 65535) {
            this.method628(arg6, arg0, arg1, arg7, arg8, arg4, arg5);
        } else {
            this.method649(arg6, arg0, arg1, arg7, arg8, arg5, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILpea;I)V", line = 120)
    public final void method615(int arg0, class675 arg1, int arg2) {
        field721++;
        if (arg0 == -1) {
            return;
        }
        this.method603();
        if (!this.method625()) {
            this.method633();
            return;
        }
        class237 var4 = arg1.field9511[arg0];
        class652 var5 = var4.field3760;
        if (arg2 != -30515) {
            field727 = 88;
        }
        for (int var6 = 0; var6 < var4.field3767; var6++) {
            short var7 = var4.field3768[var6];
            if (var5.field9131[var7]) {
                if (var4.field3756[var6] != -1) {
                    this.method627(0, 0, 0, 0);
                }
                this.method627(var5.field9129[var7], var4.field3762[var6], var4.field3771[var6], var4.field3770[var6]);
            }
        }
        this.method647();
        this.method633();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 164)
    public static void method616(int arg0) {
        field726 = null;
        if (arg0 != 0) {
            method640(null, -18, null);
        }
        field723 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([ZIBILno;IZZI[ILsda;Lsda;)V", line = 178)
    private final void method619(boolean[] arg0, int arg1, byte arg2, int arg3, class652 arg4, int arg5, boolean arg6, boolean arg7, int arg8, int[] arg9, class237 arg10, class237 arg11) {
        int var13 = -11 % (-arg2 / 34);
        field720++;
        if (arg10 == null || arg5 == 0) {
            for (int var39 = 0; var39 < arg11.field3767; var39++) {
                short var40 = arg11.field3768[var39];
                if (arg0 == null || arg6 == arg0[var40] || arg4.field9129[var40] == 0) {
                    short var41 = arg11.field3756[var39];
                    if (var41 != -1) {
                        this.method605(arg4.field9133[var41], 0, arg1 & arg4.field9130[var41], arg9, arg8, arg7, 0, 0, 0, (byte) -100);
                    }
                    this.method605(arg4.field9133[var40], arg11.field3762[var39], arg1 & arg4.field9130[var40], arg9, arg8, arg7, arg4.field9129[var40], arg11.field3771[var39], arg11.field3770[var39], (byte) -117);
                }
            }
            return;
        }
        int var14 = 0;
        int var15 = 0;
        for (int var16 = 0; var16 < arg4.field9128; var16++) {
            boolean var17 = false;
            if (arg11.field3767 > var14 && arg11.field3768[var14] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (arg10.field3767 > var15 && arg10.field3768[var15] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg0 == null || arg0[var16] == arg6 || arg4.field9129[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg4.field9129[var16];
                    if (var20 == 3 || var20 == 10) {
                        var19 = 128;
                    }
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    short var25;
                    if (var17) {
                        var21 = arg11.field3761[var14];
                        var22 = arg11.field3771[var14];
                        var23 = arg11.field3770[var14];
                        var24 = arg11.field3762[var14];
                        var25 = arg11.field3756[var14];
                        var14++;
                    } else {
                        var25 = -1;
                        var22 = var19;
                        var24 = var19;
                        var23 = var19;
                        var21 = 0;
                    }
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    byte var30;
                    if (var18) {
                        var26 = arg10.field3771[var15];
                        var27 = arg10.field3762[var15];
                        var28 = arg10.field3770[var15];
                        var29 = arg10.field3756[var15];
                        var30 = arg10.field3761[var15];
                        var15++;
                    } else {
                        var30 = 0;
                        var26 = var19;
                        var27 = var19;
                        var28 = var19;
                        var29 = -1;
                    }
                    if (var25 != -1) {
                        this.method605(arg4.field9133[var25], 0, arg1 & arg4.field9130[var25], arg9, arg8, arg7, 0, 0, 0, (byte) 43);
                    } else if (var29 != -1) {
                        this.method605(arg4.field9133[var29], 0, arg4.field9130[var29] & arg1, arg9, arg8, arg7, 0, 0, 0, (byte) -85);
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var21 & 0x2) != 0 || (var30 & 0x1) != 0) {
                        var35 = var22;
                        var34 = var24;
                        var36 = var23;
                    } else if (var20 == 2) {
                        int var31 = var27 - var24 & 0x3FFF;
                        int var32 = var26 - var22 & 0x3FFF;
                        int var33 = var28 - var23 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg5 * var31 / arg3 + var24 & 0x3FFF;
                        var35 = arg5 * var32 / arg3 + var22 & 0x3FFF;
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var36 = var23 + (arg5 * var33 / arg3) & 0x3FFF;
                    } else if (var20 == 9) {
                        int var37 = var27 - var24 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var34 = arg5 * var37 / arg3 + var24 & 0x3FFF;
                        var36 = 0;
                        var35 = 0;
                    } else if (var20 == 7) {
                        int var38 = var27 - var24 & 0x3F;
                        if (var38 >= 32) {
                            var38 -= 64;
                        }
                        var34 = arg5 * var38 / arg3 + var24 & 0x3F;
                        var35 = var22 + ((var26 - var22) * arg5 / arg3);
                        var36 = var23 + ((var28 - var23) * arg5 / arg3);
                    } else {
                        var35 = (var26 - var22) * arg5 / arg3 + var22;
                        var34 = (var27 - var24) * arg5 / arg3 + var24;
                        var36 = (var28 - var23) * arg5 / arg3 + var23;
                    }
                    this.method605(arg4.field9133[var16], var34, arg4.field9130[var16] & arg1, arg9, arg8, arg7, var20, var35, var36, (byte) 84);
                } else {
                    if (var18) {
                        var15++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lpea;IIIILpea;Lpea;ILpea;I[ZIIZI)V", line = 390)
    public final void method621(class675 arg0, int arg1, int arg2, int arg3, int arg4, class675 arg5, class675 arg6, int arg7, class675 arg8, int arg9, boolean[] arg10, int arg11, int arg12, boolean arg13, int arg14) {
        field716++;
        if (arg4 == -1) {
            return;
        }
        if (arg10 == null || arg12 == -1) {
            this.method635(arg13, arg14, (byte) -123, arg8, arg7, arg4, arg2, 0, arg0);
            return;
        }
        this.method603();
        if (!this.method625()) {
            this.method633();
            return;
        }
        class237 var16 = arg0.field9511[arg4];
        class652 var17 = var16.field3760;
        class237 var18 = null;
        if (arg8 != null) {
            var18 = arg8.field9511[arg14];
            if (var18.field3760 != var17) {
                var18 = null;
            }
        }
        this.method619(arg10, 65535, (byte) 76, arg7, var17, arg2, false, arg13, 0, null, var18, var16);
        class237 var19 = arg6.field9511[arg12];
        class237 var20 = null;
        if (arg5 != null) {
            var20 = arg5.field9511[arg1];
            if (var20.field3760 != var17) {
                var20 = null;
            }
        }
        if (arg11 != -9349) {
            this.method626();
        }
        this.method628(0, new int[0], 0, 0, 0, 0, arg13);
        this.method619(arg10, 65535, (byte) 51, arg9, var19.field3760, arg3, true, arg13, 0, null, var20, var19);
        this.method647();
        this.method633();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBII[IIZLpea;ILpea;)V", line = 464)
    public final void method630(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6, boolean arg7, class675 arg8, int arg9, class675 arg10) {
        field718++;
        if (arg9 == -1) {
            return;
        }
        int var12 = -109 % ((arg2 - 70) / 37);
        this.method603();
        if (!this.method625()) {
            this.method633();
            return;
        }
        class237 var13 = arg8.field9511[arg9];
        class652 var14 = var13.field3760;
        class237 var15 = null;
        if (arg10 != null) {
            var15 = arg10.field9511[arg3];
            if (var15.field3760 != var14) {
                var15 = null;
            }
        }
        this.method619(null, arg0, (byte) -117, arg4, var14, arg1, false, arg7, arg6, arg5, var15, var13);
        this.method647();
        this.method633();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILi;ZIII)V", line = 503)
    public final void method632(int arg0, int arg1, int arg2, int arg3, class37 arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field719++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg1 / 2;
        int var14 = -arg8 / 2;
        int var15 = arg4.method477(-1, arg6 + var14, arg0 + var13);
        int var16 = arg1 / 2;
        int var17 = -arg8 / 2;
        int var18 = arg4.method477(-1, arg6 + var17, arg0 - -var16);
        int var19 = -arg1 / 2;
        int var20 = arg8 / 2;
        int var21 = arg4.method477(-1, arg6 + var20, arg0 - -var19);
        int var22 = arg1 / 2;
        int var23 = arg8 / 2;
        int var24 = arg4.method477(-1, arg6 + var23, arg0 + var22);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        if (arg8 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg2 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg2;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (var28 > arg2) {
                        var28 = arg2;
                    }
                }
                this.method644(var28);
            }
        }
        int var30 = var15 < var21 ? var15 : var21;
        if (arg1 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg7 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg7;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (arg7 < var31) {
                        var31 = arg7;
                    }
                }
                this.method610(var31);
            }
        }
        int var33 = var15 + var24;
        if ((var18 + var21) < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg3;
        if (var34 != 0) {
            this.method639(0, var34, 0);
        }
        if (!arg5) {
            this.method603();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIBLpea;IIIILpea;)V", line = 628)
    public final void method635(boolean arg0, int arg1, byte arg2, class675 arg3, int arg4, int arg5, int arg6, int arg7, class675 arg8) {
        field725++;
        if (arg5 == -1) {
            return;
        }
        this.method603();
        if (!this.method625()) {
            this.method633();
            return;
        }
        class237 var10 = arg8.field9511[arg5];
        class652 var11 = var10.field3760;
        class237 var12 = null;
        if (arg3 != null) {
            var12 = arg3.field9511[arg1];
            if (var12.field3760 != var11) {
                var12 = null;
            }
        }
        this.method619(null, 65535, (byte) -88, arg4, var11, arg6, false, arg0, arg7, null, var12, var10);
        this.method647();
        if (arg2 >= -99) {
            this.method604();
        }
        this.method633();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lpca;ILpca;)V", line = 673)
    public static final void method640(class665 arg0, int arg1, class665 arg2) {
        field715++;
        class444.field6748++;
        if (arg1 != 23009) {
            return;
        }
        class165 var3 = class271.method1917(class420.field6424, (byte) -76, class502.field7348);
        var3.field2776.method82(false, arg0.field9400);
        var3.field2776.method56(arg0.field9354, true);
        var3.field2776.method56(arg2.field9380, true);
        var3.field2776.method26((byte) -47, arg2.field9400);
        var3.field2776.method76(false, arg2.field9354);
        var3.field2776.method51(31557, arg0.field9380);
        class642.method3726(-684096285, var3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;ZI)Z")
    public abstract boolean method598(int arg0, int arg1, class393 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()[Lti;")
    public abstract class406[] method599();

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
    public abstract void method600(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public abstract void method601(class393 arg0);

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
    public abstract void method602(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
    public abstract void method603();

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
    public abstract int method604();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lb;I)V")
    public abstract void method606(class393 arg0, class306 arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
    public abstract int method607();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
    public abstract void method608(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lda;")
    public abstract class55 method609(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
    public abstract void method610(int arg0);

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public abstract int method611();

    @OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
    public abstract int method612();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lb;II)V")
    public abstract void method613(class393 arg0, class306 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
    public abstract boolean method614();

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
    public abstract void method617();

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
    public abstract void method618(int arg0);

    @OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
    public abstract void method620(int arg0);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public abstract int method622();

    @OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
    public abstract int method623();

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILi;Li;III)V")
    public abstract void method624(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
    public abstract boolean method625();

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
    public abstract void method626();

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
    public abstract void method627(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method628(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
    public abstract void method629(int arg0);

    @OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
    public abstract int method631();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
    public abstract void method633();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;IZ)V")
    public abstract void method634(class393 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public abstract void method636(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
    public abstract boolean method637();

    @OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
    public abstract void method638(int arg0);

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
    public abstract void method639(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public abstract void method641(class55 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
    public abstract int method642();

    @OriginalMember(owner = "client!da", name = "S", descriptor = "(Lha;)Lha;")
    public abstract class54 method643(class54 arg0);

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
    public abstract void method644(int arg0);

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
    public abstract int method645();

    @OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
    public abstract int method646();

    @OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
    public abstract void method647();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method648(int arg0, int arg1, class393 arg2, boolean arg3);

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
    public abstract void method649(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
    public abstract void method650(int arg0);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public abstract int method651();

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()[Lrea;")
    public abstract class192[] method652();
}
