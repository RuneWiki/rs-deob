import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class386 {

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[Lqg;")
    public static class140[] field5277 = new class140[14];

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5280 = new String[5];

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lwp;")
    public static class288 field5275 = new class288();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public abstract void method1485(int arg0);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()Z")
    public abstract boolean method1470();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIBZIIIII[I)V")
    private final void method2400(int[] arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        field5274++;
        if (arg7 == 1) {
            if (arg5 == 0 || arg5 == 1) {
                int var16 = -arg4;
                arg4 = arg6;
                arg6 = var16;
            } else if (arg5 == 3) {
                int var15 = arg4;
                arg4 = arg6;
                arg6 = var15;
            } else if (arg5 == 2) {
                int var14 = arg4;
                arg4 = -arg6 & 0x3FFF;
                arg6 = var14 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg5 == 0 || arg5 == 1) {
                arg6 = -arg6;
                arg4 = -arg4;
            } else if (arg5 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg5 == 0 || arg5 == 1) {
                int var13 = arg4;
                arg4 = -arg6;
                arg6 = var13;
            } else if (arg5 == 3) {
                int var12 = arg4;
                arg4 = arg6;
                arg6 = var12;
            } else if (arg5 == 2) {
                int var11 = arg4;
                arg4 = arg6 & 0x3FFF;
                arg6 = -var11 & 0x3FFF;
            }
        }
        if (arg2 < 85) {
            field5275 = null;
        }
        if (arg1 == 65535) {
            this.method1449(arg5, arg0, arg4, arg8, arg6, arg7, arg3);
        } else {
            this.method1481(arg5, arg0, arg4, arg8, arg6, arg3, arg1, arg9);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public abstract void method1460(int arg0);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1481(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I")
    public abstract int method1484();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
    public abstract void method1467(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()I")
    public abstract int method1489();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(SS)V")
    public abstract void method1478(short arg0, short arg1);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
    public abstract void method1492(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
    public static final void method2401(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class162.field1895 * arg2 >> 8;
        field5271++;
        if (~var4 != arg3 && arg1 != -1) {
            class150.method967(false, -3063, 0, arg1, client.field6060, var4);
            class344.field4679 = true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()I")
    public abstract int method1442();

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public abstract void method1490(int arg0);

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "()I")
    public abstract int method1452();

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "()I")
    public abstract int method1465();

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public abstract void method1456(int arg0);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(SS)V")
    public abstract void method1463(short arg0, short arg1);

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public abstract void method1468(int arg0);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lqg;I[IIIIILqg;IZI)V")
    public final void method2402(class140 arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, class140 arg7, int arg8, boolean arg9, int arg10) {
        field5272++;
        if (arg5 == -1 || !this.method1470()) {
            return;
        }
        class99 var12 = arg0.field1627[arg5];
        class250 var13 = var12.field1165;
        class99 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field1627[arg3];
            if (var14.field1165 != var13) {
                var14 = null;
            }
        }
        if (arg4 > -66) {
            this.method1470();
        }
        this.method2408(arg8, var14, arg1, false, arg9, arg10, var13, arg2, false, var12, arg6, (boolean[]) null);
        this.method1486();
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    public static void method2403(int arg0) {
        if (arg0 != -10862) {
            field5281 = -74;
        }
        field5280 = null;
        field5275 = null;
        field5277 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lgi;)Lgi;")
    public abstract class416 method1461(class416 arg0);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lge;IIIZ)V")
    public abstract void method1476(class386 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIZ)Lge;")
    public abstract class386 method1459(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1449(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILqg;II[ZLqg;IIILqg;Lqg;ZIII)V")
    public final void method2404(int arg0, class140 arg1, int arg2, int arg3, boolean[] arg4, class140 arg5, int arg6, int arg7, int arg8, class140 arg9, class140 arg10, boolean arg11, int arg12, int arg13, int arg14) {
        field5273++;
        if (arg7 == -1) {
            return;
        }
        if (arg4 == null || arg8 == -1) {
            this.method2405(arg2, arg11, arg10, 0, arg1, arg14, 65535, arg7, arg13);
        } else if (this.method1470()) {
            class99 var16 = arg10.field1627[arg7];
            class250 var17 = var16.field1165;
            class99 var18 = null;
            if (arg1 != null) {
                var18 = arg1.field1627[arg14];
                if (var18.field1165 != var17) {
                    var18 = null;
                }
            }
            class99 var19 = arg9.field1627[arg8];
            class99 var20 = null;
            if (arg5 != null) {
                var20 = arg5.field1627[arg0];
                if (var20.field1165 != var17) {
                    var20 = null;
                }
            }
            if (arg3 == 11491) {
                this.method2408(arg13, var18, arg2, false, arg11, 0, var17, (int[]) null, false, var16, 65535, arg4);
                this.method1449(0, new int[0], 0, 0, 0, 0, arg11);
                this.method2408(arg12, var20, arg6, true, arg11, 0, var17, (int[]) null, false, var19, 65535, arg4);
                this.method1486();
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZLqg;ILqg;IIII)V")
    public final void method2405(int arg0, boolean arg1, class140 arg2, int arg3, class140 arg4, int arg5, int arg6, int arg7, int arg8) {
        field5282++;
        if (arg7 == -1 || !this.method1470()) {
            return;
        }
        class99 var10 = arg2.field1627[arg7];
        class250 var11 = var10.field1165;
        class99 var12 = null;
        if (arg4 != null) {
            var12 = arg4.field1627[arg5];
            if (var12.field1165 != var11) {
                var12 = null;
            }
        }
        this.method2408(arg8, var12, arg0, false, arg1, arg3, var11, (int[]) null, false, var10, arg6, (boolean[]) null);
        this.method1486();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lwr;Lfi;II)V")
    public abstract void method1436(class450 arg0, class34 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILip;BII)V")
    public final void method2406(int arg0, int arg1, int arg2, class279 arg3, byte arg4, int arg5, int arg6) {
        field5279++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg1 / 2;
        int var12 = -arg6 / 2;
        int var13 = arg3.method1054(arg2 + var11, arg5 - -var12);
        int var14 = arg1 / 2;
        int var15 = -arg6 / 2;
        int var16 = arg3.method1054(arg2 + var14, arg5 + var15);
        int var17 = -arg1 / 2;
        int var18 = arg6 / 2;
        int var19 = arg3.method1054(arg2 + var17, arg5 - -var18);
        int var20 = arg1 / 2;
        int var21 = arg6 / 2;
        int var22 = arg3.method1054(arg2 + var20, arg5 - -var21);
        int var23 = var13 < var16 ? var13 : var16;
        int var24 = var19 >= var22 ? var22 : var19;
        int var25 = var16 < var22 ? var16 : var22;
        int var26 = var19 <= var13 ? var19 : var13;
        if (arg4 != 42) {
            field5281 = -118;
        }
        if (arg6 != 0) {
            int var27 = (int) (Math.atan2((double) (var23 - var24), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var27 != 0) {
                this.method1485(var27);
            }
        }
        int var28 = var13 + var22;
        if (arg1 != 0) {
            int var29 = (int) (Math.atan2((double) (var26 - var25), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method1445(var29);
            }
        }
        if ((var16 + var19) < var28) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg0;
        if (var30 != 0) {
            this.method1492(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIII)V")
    public abstract void method1471(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "()Z")
    public abstract boolean method1439();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILip;Lip;III)V")
    public abstract void method1491(int arg0, int arg1, class279 arg2, class279 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "()I")
    public abstract int method1464();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lqg;II)V")
    public final void method2407(class140 arg0, int arg1, int arg2) {
        field5278++;
        if (arg2 == -1 || !this.method1470()) {
            return;
        }
        class99 var4 = arg0.field1627[arg2];
        int var5 = 97 / ((arg1 - 56) / 61);
        class250 var6 = var4.field1165;
        for (int var7 = 0; var7 < var4.field1161; var7++) {
            short var8 = var4.field1171[var7];
            if (var6.field3290[var8]) {
                if (var4.field1168[var7] != -1) {
                    this.method1471(0, 0, 0, 0);
                }
                this.method1471(var6.field3285[var8], var4.field1163[var7], var4.field1170[var7], var4.field1166[var7]);
            }
        }
        this.method1486();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILea;IZZILuf;[IZLea;I[Z)V")
    private final void method2408(int arg0, class99 arg1, int arg2, boolean arg3, boolean arg4, int arg5, class250 arg6, int[] arg7, boolean arg8, class99 arg9, int arg10, boolean[] arg11) {
        if (arg8) {
            field5277 = null;
        }
        field5276++;
        if (arg1 == null || arg0 == 0) {
            for (int var37 = 0; var37 < arg9.field1161; var37++) {
                short var38 = arg9.field1171[var37];
                if (arg11 == null || arg11[var38] == arg3 || arg6.field3285[var38] == 0) {
                    short var39 = arg9.field1168[var37];
                    if (var39 != -1) {
                        this.method2400(arg6.field3284[var39], arg10 & arg6.field3288[var39], (byte) 111, arg4, 0, 0, 0, arg5, 0, arg7);
                    }
                    this.method2400(arg6.field3284[var38], arg6.field3288[var38] & arg10, (byte) 96, arg4, arg9.field1163[var37], arg6.field3285[var38], arg9.field1166[var37], arg5, arg9.field1170[var37], arg7);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg6.field3292; var15++) {
            boolean var16 = false;
            if (var13 < arg9.field1161 && arg9.field1171[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg1.field1161 > var14 && arg1.field1171[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg11 == null || arg11[var15] == arg3 || arg6.field3285[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg6.field3285[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var22 = arg9.field1163[var13];
                        var23 = arg9.field1170[var13];
                        var20 = arg9.field1157[var13];
                        var24 = arg9.field1166[var13];
                        var21 = arg9.field1168[var13];
                        var13++;
                    } else {
                        var20 = 0;
                        var21 = -1;
                        var22 = var18;
                        var23 = var18;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg1.field1168[var14];
                        var26 = arg1.field1170[var14];
                        var27 = arg1.field1157[var14];
                        var28 = arg1.field1166[var14];
                        var29 = arg1.field1163[var14];
                        var14++;
                    } else {
                        var27 = 0;
                        var26 = var18;
                        var29 = var18;
                        var28 = var18;
                        var25 = -1;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var20 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var35 = var24;
                        var33 = var22;
                        var34 = var23;
                    } else if (var19 == 2) {
                        int var30 = var29 - var22 & 0x3FFF;
                        int var31 = var26 - var23 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var28 - var24 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var33 = var22 + (arg0 * var30 / arg2) & 0x3FFF;
                        var34 = arg0 * var31 / arg2 + var23 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = arg0 * var32 / arg2 + var24 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var29 - var22 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var34 = (var26 - var23) * arg0 / arg2 + var23;
                        var35 = (var28 - var24) * arg0 / arg2 + var24;
                        var33 = var22 + (arg0 * var36 / arg2) & 0x3F;
                    } else {
                        var35 = (var28 - var24) * arg0 / arg2 + var24;
                        var33 = (var29 - var22) * arg0 / arg2 + var22;
                        var34 = var23 + ((var26 - var23) * arg0 / arg2);
                    }
                    if (var21 != -1) {
                        this.method2400(arg6.field3284[var21], arg10 & arg6.field3288[var21], (byte) 120, arg4, 0, 0, 0, arg5, 0, arg7);
                    } else if (var25 != -1) {
                        this.method2400(arg6.field3284[var25], arg6.field3288[var25] & arg10, (byte) 122, arg4, 0, 0, 0, arg5, 0, arg7);
                    }
                    this.method2400(arg6.field3284[var15], arg6.field3288[var15] & arg10, (byte) 112, arg4, var33, var19, var35, arg5, var34, arg7);
                } else {
                    if (var16) {
                        var13++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "()V")
    public abstract void method1488();

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
    public abstract void method1487(int arg0);

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "()I")
    public abstract int method1438();

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "()V")
    public abstract void method1454();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lwr;Lfi;I)V")
    public abstract void method1441(class450 arg0, class34 arg1, int arg2);

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "()I")
    public abstract int method1473();

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
    public abstract void method1445(int arg0);

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "()[Lkh;")
    public abstract class345[] method1475();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILwr;Z)Z")
    public abstract boolean method1474(int arg0, int arg1, class450 arg2, boolean arg3);

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "()I")
    public abstract int method1458();

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "()I")
    public abstract int method1453();

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "()V")
    public abstract void method1486();

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "()[Lun;")
    public abstract class103[] method1443();
}
