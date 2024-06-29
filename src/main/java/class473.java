import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class473 {

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
    public boolean field6817 = false;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field6813 = 0;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Z")
    public static boolean field6815 = false;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lkf;")
    public static class287 field6810 = new class287();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
    public abstract void method1900(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lufa;II)V")
    public abstract void method1875(class490 arg0, class374 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
    public abstract void method1888();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILi;I)V")
    public final void method2724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class274 arg7, int arg8) {
        field6811++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg1 / 2;
        int var14 = -arg4 / 2;
        int var15 = arg7.method1610(arg3 + var13, 108, arg8 + var14);
        if (arg2 < 15) {
            return;
        }
        int var16 = arg1 / 2;
        int var17 = -arg4 / 2;
        int var18 = arg7.method1610(arg3 + var16, 109, arg8 + var17);
        int var19 = -arg1 / 2;
        int var20 = arg4 / 2;
        int var21 = arg7.method1610(arg3 + var19, 93, arg8 + var20);
        int var22 = arg1 / 2;
        int var23 = arg4 / 2;
        int var24 = arg7.method1610(arg3 + var22, 116, arg8 + var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var18 >= var24 ? var24 : var18;
        int var28 = var21 <= var15 ? var21 : var15;
        if (arg4 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg0 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg0;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (var29 > arg0) {
                        var29 = arg0;
                    }
                }
                this.method1884(var29);
            }
        }
        if (arg1 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg5 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg5;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (var31 > arg5) {
                        var31 = arg5;
                    }
                }
                this.method1902(var31);
            }
        }
        int var33 = var15 + var24;
        if (var18 + var21 < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg6;
        if (var34 != 0) {
            this.method1915(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
    public abstract void method1866(int arg0);

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1876(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public abstract int method1865();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLej;ILej;IIII)V")
    public final void method2725(int arg0, boolean arg1, class479 arg2, int arg3, class479 arg4, int arg5, int arg6, int arg7, int arg8) {
        field6820++;
        if (arg0 == -1) {
            return;
        }
        this.method1855();
        if (!this.method1903()) {
            this.method1904();
            return;
        }
        if (arg3 != -3646) {
            this.method1853();
        }
        class523 var10 = arg4.field6901[arg0];
        class416 var11 = var10.field7416;
        class523 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field6901[arg6];
            if (var12.field7416 != var11) {
                var12 = null;
            }
        }
        this.method2730(null, arg7, 65535, var10, false, arg8, arg1, arg5, var12, null, var11, (byte) -123);
        this.method1898();
        this.method1904();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLej;IIII[IIILej;)V")
    public final void method2726(int arg0, boolean arg1, class479 arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, class479 arg10) {
        field6812++;
        if (~arg6 == arg5) {
            return;
        }
        this.method1855();
        if (!this.method1903()) {
            this.method1904();
            return;
        }
        class523 var12 = arg10.field6901[arg6];
        class416 var13 = var12.field7416;
        class523 var14 = null;
        if (arg2 != null) {
            var14 = arg2.field6901[arg0];
            if (var14.field7416 != var13) {
                var14 = null;
            }
        }
        this.method2730(null, arg8, arg9, var12, false, arg3, arg1, arg4, var14, arg7, var13, (byte) -95);
        this.method1898();
        this.method1904();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public abstract void method1904();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lda;")
    public abstract class473 method1877(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
    public abstract int method1887();

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public abstract int method1861();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lufa;I)V")
    public abstract void method1914(class490 arg0, class374 arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
    public abstract boolean method1903();

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
    public abstract void method1884(int arg0);

    @OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
    public abstract int method1868();

    @OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
    public abstract void method1854(int arg0);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
    public abstract void method1872();

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
    public abstract void method1906(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public abstract void method1858(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
    public abstract int method1853();

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
    public abstract int method1857();

    @OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
    public abstract void method1883(int arg0);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
    public abstract void method1879(int arg0);

    @OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
    public abstract void method1902(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public abstract void method1916(class473 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
    public abstract void method1885(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public abstract int method1870();

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
    public abstract void method1915(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
    public abstract boolean method1913();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public abstract void method1891(class490 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILej;)V")
    public final void method2727(int arg0, int arg1, class479 arg2) {
        field6814++;
        if (arg0 == -1) {
            return;
        }
        this.method1855();
        if (!this.method1903()) {
            this.method1904();
            return;
        }
        class523 var4 = arg2.field6901[arg0];
        class416 var5 = var4.field7416;
        if (arg1 != -5405) {
            this.method1856();
        }
        for (int var6 = 0; var6 < var4.field7401; var6++) {
            short var7 = var4.field7406[var6];
            if (var5.field5580[var7]) {
                if (var4.field7410[var6] != -1) {
                    this.method1900(0, 0, 0, 0);
                }
                this.method1900(var5.field5575[var7], var4.field7403[var6], var4.field7409[var6], var4.field7412[var6]);
            }
        }
        this.method1898();
        this.method1904();
    }

    @OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
    public abstract int method1899();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1880(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;ZI)Z")
    public abstract boolean method1896(int arg0, int arg1, class490 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()[Low;")
    public abstract class93[] method1910();

    @OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
    public abstract int method1886();

    @OriginalMember(owner = "client!da", name = "S", descriptor = "(Lha;)Lha;")
    public abstract class120 method1874(class120 arg0);

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILi;Li;III)V")
    public abstract void method1911(int arg0, int arg1, class274 arg2, class274 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[III[IIIIII)V")
    private final void method2728(boolean arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6819++;
        int var11 = -89 % ((-arg2 - 68) / 41);
        if (arg6 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var14 = -arg7;
                arg7 = arg8;
                arg8 = var14;
            } else if (arg9 == 3) {
                int var12 = arg7;
                arg7 = arg8;
                arg8 = var12;
            } else if (arg9 == 2) {
                int var13 = arg7;
                arg7 = -arg8 & 0x3FFF;
                arg8 = var13 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg8 = -arg8;
                arg7 = -arg7;
            } else if (arg9 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg7 = -arg7 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var17 = arg7;
                arg7 = -arg8;
                arg8 = var17;
            } else if (arg9 == 3) {
                int var16 = arg7;
                arg7 = arg8;
                arg8 = var16;
            } else if (arg9 == 2) {
                int var15 = arg7;
                arg7 = arg8 & 0x3FFF;
                arg8 = -var15 & 0x3FFF;
            }
        }
        if (arg3 == 65535) {
            this.method1880(arg9, arg4, arg7, arg5, arg8, arg6, arg0);
        } else {
            this.method1876(arg9, arg4, arg7, arg5, arg8, arg0, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
    public abstract void method1907(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILej;II[ZLej;IIIZLej;ILej;I)V")
    public final void method2729(int arg0, int arg1, class479 arg2, int arg3, int arg4, boolean[] arg5, class479 arg6, int arg7, int arg8, int arg9, boolean arg10, class479 arg11, int arg12, class479 arg13, int arg14) {
        field6816++;
        if (arg0 == -1) {
            return;
        }
        if (arg5 == null || arg4 == -1) {
            this.method2725(arg0, arg10, arg13, -3646, arg6, 0, arg12, arg1, arg3);
            return;
        }
        this.method1855();
        if (!this.method1903()) {
            this.method1904();
            return;
        }
        class523 var16 = arg6.field6901[arg0];
        class416 var17 = var16.field7416;
        class523 var18 = null;
        if (arg13 != null) {
            var18 = arg13.field6901[arg12];
            if (var18.field7416 != var17) {
                var18 = null;
            }
        }
        this.method2730(arg5, arg1, 65535, var16, false, arg3, arg10, 0, var18, null, var17, (byte) -98);
        if (arg8 != 1643) {
            return;
        }
        class523 var19 = arg2.field6901[arg4];
        class523 var20 = null;
        if (arg11 != null) {
            var20 = arg11.field6901[arg9];
            if (var20.field7416 != var17) {
                var20 = null;
            }
        }
        this.method1880(0, new int[0], 0, 0, 0, 0, arg10);
        this.method2730(arg5, arg7, 65535, var19, true, arg14, arg10, 0, var20, null, var19.field7416, (byte) -84);
        this.method1898();
        this.method1904();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([ZIILgf;ZIZILgf;[ILgo;B)V")
    private final void method2730(boolean[] arg0, int arg1, int arg2, class523 arg3, boolean arg4, int arg5, boolean arg6, int arg7, class523 arg8, int[] arg9, class416 arg10, byte arg11) {
        field6818++;
        if (arg8 == null || arg1 == 0) {
            for (int var38 = 0; var38 < arg3.field7401; var38++) {
                short var39 = arg3.field7406[var38];
                if (arg0 == null || arg0[var39] == arg4 || arg10.field5575[var39] == 0) {
                    short var40 = arg3.field7410[var38];
                    if (var40 != -1) {
                        this.method2728(arg6, arg9, 27, arg2 & arg10.field5583[var40], arg10.field5573[var40], 0, arg7, 0, 0, 0);
                    }
                    this.method2728(arg6, arg9, 117, arg2 & arg10.field5583[var39], arg10.field5573[var39], arg3.field7409[var38], arg7, arg3.field7403[var38], arg3.field7412[var38], arg10.field5575[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg10.field5576; var15++) {
            boolean var16 = false;
            if (arg3.field7401 > var13 && arg3.field7406[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg8.field7401 && arg8.field7406[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg0 == null || arg0[var15] == arg4 || arg10.field5575[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg10.field5575[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var24 = arg3.field7403[var13];
                        var20 = arg3.field7410[var13];
                        var21 = arg3.field7409[var13];
                        var23 = arg3.field7402[var13];
                        var22 = arg3.field7412[var13];
                        var13++;
                    } else {
                        var20 = -1;
                        var21 = var18;
                        var22 = var18;
                        var23 = 0;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var26 = arg8.field7412[var14];
                        var28 = arg8.field7402[var14];
                        var25 = arg8.field7410[var14];
                        var29 = arg8.field7409[var14];
                        var27 = arg8.field7403[var14];
                        var14++;
                    } else {
                        var25 = -1;
                        var26 = var18;
                        var27 = var18;
                        var28 = 0;
                        var29 = var18;
                    }
                    if (var20 != -1) {
                        this.method2728(arg6, arg9, 110, arg2 & arg10.field5583[var20], arg10.field5573[var20], 0, arg7, 0, 0, 0);
                    } else if (var25 != -1) {
                        this.method2728(arg6, arg9, -126, arg10.field5583[var25] & arg2, arg10.field5573[var25], 0, arg7, 0, 0, 0);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var23 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var33 = var21;
                        var31 = var24;
                        var32 = var22;
                    } else if (var19 == 2) {
                        int var35 = var27 - var24 & 0x3FFF;
                        int var36 = var29 - var21 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        int var37 = var26 - var22 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        var31 = var24 + (arg1 * var35 / arg5) & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = var21 + (arg1 * var36 / arg5) & 0x3FFF;
                        var32 = arg1 * var37 / arg5 + var22 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var27 - var24 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = arg1 * var30 / arg5 + var24 & 0x3FFF;
                        var32 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var34 = var27 - var24 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var33 = (var29 - var21) * arg1 / arg5 + var21;
                        var32 = (var26 - var22) * arg1 / arg5 + var22;
                        var31 = var24 + (arg1 * var34 / arg5) & 0x3F;
                    } else {
                        var31 = var24 + ((var27 - var24) * arg1 / arg5);
                        var32 = (var26 - var22) * arg1 / arg5 + var22;
                        var33 = (var29 - var21) * arg1 / arg5 + var21;
                    }
                    this.method2728(arg6, arg9, -113, arg2 & arg10.field5583[var15], arg10.field5573[var15], var33, arg7, var31, var32, var19);
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
        if (arg11 >= -70) {
            this.method1897();
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()Z")
    public abstract boolean method1856();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method2731(int arg0) {
        int var1 = 85 % ((arg0 + 18) / 58);
        field6810 = null;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()[Lqr;")
    public abstract class667[] method1897();

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
    public abstract void method1855();

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
    public abstract int method1912();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method1867(int arg0, int arg1, class490 arg2, boolean arg3);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
    public abstract void method1882(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
    public abstract int method1869();

    @OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
    public abstract void method1898();
}
