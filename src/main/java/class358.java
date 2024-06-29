import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class358 {

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lmga;")
    public static class666 field4846 = new class666(10);

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "[I")
    public static int[] field4848 = new int[200];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lbi;")
    public static class449 field4844;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
    public abstract void method1918(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
    public abstract void method1911(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILd;IIIII)V")
    public final void method2109(int arg0, int arg1, int arg2, class139 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4838++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg1 / 2;
        int var14 = -arg0 / 2;
        if (arg5 != -2461) {
            field4848 = null;
        }
        int var15 = arg3.method200(arg8 + var13, arg2 + var14);
        int var16 = arg1 / 2;
        int var17 = -arg0 / 2;
        int var18 = arg3.method200(arg8 + var16, arg2 + var17);
        int var19 = -arg1 / 2;
        int var20 = arg0 / 2;
        int var21 = arg3.method200(arg8 + var19, arg2 + var20);
        int var22 = arg1 / 2;
        int var23 = arg0 / 2;
        int var24 = arg3.method200(arg8 + var22, arg2 + var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var24 > var18 ? var18 : var24;
        int var28 = var21 <= var15 ? var21 : var15;
        if (arg0 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg7 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg7;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (var29 > arg7) {
                        var29 = arg7;
                    }
                }
                this.method1933(var29);
            }
        }
        if (arg1 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg6 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg6;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (var31 > arg6) {
                        var31 = arg6;
                    }
                }
                this.method1904(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > (var18 + var21)) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg4;
        if (var34 != 0) {
            this.method1932(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lot;II)V")
    public abstract void method1906(class397 arg0, class552 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIIILwo;ILwo;I)V")
    public final void method2110(boolean arg0, int arg1, int arg2, int arg3, int arg4, class696 arg5, int arg6, class696 arg7, int arg8) {
        field4847++;
        if (arg6 == -1 || !this.method1900()) {
            return;
        }
        class478 var10 = arg7.field9767[arg6];
        class247 var11 = var10.field6372;
        class478 var12 = null;
        int var13 = 107 % ((5 - arg4) / 36);
        if (arg5 != null) {
            var12 = arg5.field9767[arg3];
            if (var12.field6372 != var11) {
                var12 = null;
            }
        }
        this.method2114(64, var11, null, 65535, var10, arg0, arg2, false, arg1, var12, null, arg8);
        this.method1901();
    }

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
    public abstract void method1946(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lba;")
    public abstract class358 method1519(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method1931(int arg0, int arg1, class397 arg2, boolean arg3);

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
    public abstract boolean method1900();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIB)V")
    public static final void method2111(int arg0, int arg1, int arg2, byte arg3) {
        field4841++;
        if (arg0 == 1002) {
            class544.method3007(class195.field2860, arg1, arg2);
        } else if (arg0 == 1008) {
            class544.method3007(class467.field6280, arg1, arg2);
        } else if (arg0 == 1009) {
            class544.method3007(class369.field4983, arg1, arg2);
        } else if (arg0 == 1007) {
            class544.method3007(class75.field1192, arg1, arg2);
        } else if (arg0 == 1011) {
            class544.method3007(class87.field1327, arg1, arg2);
        }
        if (arg3 < 13) {
            method2112(-111, 24, -0.3444613F, -8, -68, false, -36, 9);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIFIIZII)[I")
    public static final int[] method2112(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field4845++;
        int[] var8 = new int[arg3];
        class63 var9 = new class63();
        var9.field971 = arg0;
        var9.field976 = arg5;
        var9.field963 = arg6;
        var9.field972 = (int) (arg2 * 4096.0F);
        var9.field967 = arg4;
        var9.field975 = arg7;
        var9.method10(arg1 - 53131);
        class665.method3734((byte) 16, arg3, 1);
        var9.method506(var8, arg1 ^ 0xFFFF7956, 0);
        if (arg1 != 65535) {
            field4848 = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
    public abstract int method1935();

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
    public abstract int method1936();

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
    public abstract void method1937(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
    public abstract int method1934();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lba;IIIZ)V")
    public abstract void method1923(class358 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
    public abstract void method1929(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
    public abstract int method1945();

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
    public abstract void method1904(int arg0);

    @OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
    public abstract void method1933(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;)V")
    public abstract void method1949(class397 arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZIILwo;IIILwo;[ZILwo;IZLwo;)V")
    public final void method2113(int arg0, boolean arg1, int arg2, int arg3, class696 arg4, int arg5, int arg6, int arg7, class696 arg8, boolean[] arg9, int arg10, class696 arg11, int arg12, boolean arg13, class696 arg14) {
        field4840++;
        if (arg10 == -1) {
            return;
        }
        if (arg9 == null || arg12 == -1) {
            this.method2110(arg1, 0, arg5, arg0, -33, arg8, arg10, arg11, arg7);
        } else if (this.method1900()) {
            class478 var16 = arg11.field9767[arg10];
            class247 var17 = var16.field6372;
            class478 var18 = null;
            if (arg8 != null) {
                var18 = arg8.field9767[arg0];
                if (var18.field6372 != var17) {
                    var18 = null;
                }
            }
            this.method2114(64, var17, null, 65535, var16, arg1, arg5, arg13, 0, var18, arg9, arg7);
            class478 var19 = arg4.field9767[arg12];
            class478 var20 = null;
            if (arg14 != null) {
                var20 = arg14.field9767[arg2];
                if (var20.field6372 != var17) {
                    var20 = null;
                }
            }
            this.method1924(0, new int[0], 0, 0, 0, 0, arg1);
            this.method2114(64, var19.field6372, null, 65535, var19, arg1, arg3, true, 0, var20, arg9, arg6);
            this.method1901();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILrh;[IILjq;ZIZILjq;[ZI)V")
    private final void method2114(int arg0, class247 arg1, int[] arg2, int arg3, class478 arg4, boolean arg5, int arg6, boolean arg7, int arg8, class478 arg9, boolean[] arg10, int arg11) {
        if (arg0 != 64) {
            this.method1948();
        }
        field4842++;
        if (arg9 == null || arg11 == 0) {
            for (int var38 = 0; var38 < arg4.field6379; var38++) {
                short var39 = arg4.field6371[var38];
                if (arg10 == null || arg7 == arg10[var39] || arg1.field3439[var39] == 0) {
                    short var40 = arg4.field6368[var38];
                    if (var40 != -1) {
                        this.method2115(arg5, 0, 0, 0, arg1.field3435[var40] & arg3, arg8, (byte) 122, arg1.field3442[var40], 0, arg2);
                    }
                    this.method2115(arg5, arg4.field6365[var38], arg1.field3439[var39], arg4.field6375[var38], arg1.field3435[var39] & arg3, arg8, (byte) -123, arg1.field3442[var39], arg4.field6376[var38], arg2);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg1.field3438; var15++) {
            boolean var16 = false;
            if (arg4.field6379 > var13 && arg4.field6371[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg9.field6379 > var14 && arg9.field6371[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg10 == null || arg7 == arg10[var15] || arg1.field3439[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg1.field3439[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var24 = arg4.field6367[var13];
                        var21 = arg4.field6365[var13];
                        var20 = arg4.field6375[var13];
                        var23 = arg4.field6376[var13];
                        var22 = arg4.field6368[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = -1;
                        var23 = var18;
                        var24 = 0;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var28 = arg9.field6375[var14];
                        var29 = arg9.field6368[var14];
                        var26 = arg9.field6376[var14];
                        var27 = arg9.field6367[var14];
                        var25 = arg9.field6365[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var27 = 0;
                        var28 = var18;
                        var29 = -1;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var24 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var34 = var21;
                        var33 = var23;
                        var35 = var20;
                    } else if (var19 == 2) {
                        int var30 = var25 - var21 & 0x3FFF;
                        int var31 = var26 - var23 & 0x3FFF;
                        int var32 = var28 - var20 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var33 = arg11 * var31 / arg6 + var23 & 0x3FFF;
                        var34 = arg11 * var30 / arg6 + var21 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = arg11 * var32 / arg6 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var25 - var21 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var35 = 0;
                        var33 = 0;
                        var34 = arg11 * var36 / arg6 + var21 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var37 = var25 - var21 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var34 = arg11 * var37 / arg6 + var21 & 0x3F;
                        var35 = var20 + ((var28 - var20) * arg11 / arg6);
                        var33 = var23 + ((var26 - var23) * arg11 / arg6);
                    } else {
                        var34 = (var25 - var21) * arg11 / arg6 + var21;
                        var35 = (var28 - var20) * arg11 / arg6 + var20;
                        var33 = (var26 - var23) * arg11 / arg6 + var23;
                    }
                    if (var22 != -1) {
                        this.method2115(arg5, 0, 0, 0, arg3 & arg1.field3435[var22], arg8, (byte) 47, arg1.field3442[var22], 0, arg2);
                    } else if (var29 != -1) {
                        this.method2115(arg5, 0, 0, 0, arg3 & arg1.field3435[var29], arg8, (byte) 22, arg1.field3442[var29], 0, arg2);
                    }
                    this.method2115(arg5, var34, var19, var35, arg3 & arg1.field3435[var15], arg8, (byte) -33, arg1.field3442[var15], var33, arg2);
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

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
    public abstract void method1932(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
    public abstract void method1901();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIIIIB[II[I)V")
    private final void method2115(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int[] arg7, int arg8, int[] arg9) {
        int var11 = -94 / ((-arg6 - 79) / 35);
        if (arg5 == 1) {
            if (arg2 == 0 || arg2 == 1) {
                int var14 = -arg1;
                arg1 = arg3;
                arg3 = var14;
            } else if (arg2 == 3) {
                int var13 = arg1;
                arg1 = arg3;
                arg3 = var13;
            } else if (arg2 == 2) {
                int var12 = arg1;
                arg1 = -arg3 & 0x3FFF;
                arg3 = var12 & 0x3FFF;
            }
        } else if (arg5 == 2) {
            if (arg2 == 0 || arg2 == 1) {
                arg1 = -arg1;
                arg3 = -arg3;
            } else if (arg2 == 2) {
                arg1 = -arg1 & 0x3FFF;
                arg3 = -arg3 & 0x3FFF;
            }
        } else if (arg5 == 3) {
            if (arg2 == 0 || arg2 == 1) {
                int var17 = arg1;
                arg1 = -arg3;
                arg3 = var17;
            } else if (arg2 == 3) {
                int var15 = arg1;
                arg1 = arg3;
                arg3 = var15;
            } else if (arg2 == 2) {
                int var16 = arg1;
                arg1 = arg3 & 0x3FFF;
                arg3 = -var16 & 0x3FFF;
            }
        }
        field4849++;
        if (arg4 == 65535) {
            this.method1924(arg2, arg7, arg1, arg8, arg3, arg5, arg0);
        } else {
            this.method1914(arg2, arg7, arg1, arg8, arg3, arg0, arg4, arg9);
        }
    }

    @OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
    public abstract int method1940();

    @OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
    public abstract int method1951();

    @OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1914(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()[Lefa;")
    public abstract class171[] method1917();

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
    public abstract void method1903();

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lw;)Lw;")
    public abstract class276 method1930(class276 arg0);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()V")
    public abstract void method1913();

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
    public abstract void method1942(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILwo;I)V")
    public final void method2116(int arg0, class696 arg1, int arg2) {
        field4843++;
        if (arg0 == -1 || !this.method1900()) {
            return;
        }
        class478 var4 = arg1.field9767[arg0];
        class247 var5 = var4.field6372;
        for (int var6 = 0; var6 < var4.field6379; var6++) {
            short var7 = var4.field6371[var6];
            if (var5.field3434[var7]) {
                if (var4.field6368[var6] != -1) {
                    this.method1911(0, 0, 0, 0);
                }
                this.method1911(var5.field3439[var7], var4.field6365[var6], var4.field6376[var6], var4.field6375[var6]);
            }
        }
        if (arg2 != -1) {
            this.method2115(true, -85, -18, 111, 122, 104, (byte) -30, null, 57, null);
        }
        this.method1901();
    }

    @OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
    public abstract int method1939();

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()Z")
    public abstract boolean method1948();

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
    public abstract int method1928();

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()[Ljt;")
    public abstract class93[] method1920();

    @OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
    public abstract void method1899(int arg0);

    @OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
    public abstract void method1907(int arg0);

    @OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
    public abstract int method1952();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public abstract void method1897(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILd;Ld;III)V")
    public abstract void method1919(int arg0, int arg1, class139 arg2, class139 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZLwo;ILwo;IIII[II)V")
    public final void method2117(int arg0, boolean arg1, class696 arg2, int arg3, class696 arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        field4839++;
        if (~arg3 == arg8 || !this.method1900()) {
            return;
        }
        class478 var12 = arg2.field9767[arg3];
        class247 var13 = var12.field6372;
        class478 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field9767[arg7];
            if (var14.field6372 != var13) {
                var14 = null;
            }
        }
        this.method2114(64, var13, arg9, arg0, var12, arg1, arg10, false, arg6, var14, null, arg5);
        this.method1901();
    }

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
    public abstract void method1898(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method2118(byte arg0) {
        field4844 = null;
        field4848 = null;
        field4846 = null;
        if (arg0 <= 97) {
            field4848 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
    public abstract void method1924(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lot;I)V")
    public abstract void method1947(class397 arg0, class552 arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
    public abstract int method1950();
}
