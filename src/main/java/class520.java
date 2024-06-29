import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class520 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
    public abstract void method1957(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lvq;IIIZLvq;[ZZLvq;IIIILvq;I)V")
    public final void method3081(class433 arg0, int arg1, int arg2, int arg3, boolean arg4, class433 arg5, boolean[] arg6, boolean arg7, class433 arg8, int arg9, int arg10, int arg11, int arg12, class433 arg13, int arg14) {
        field7717++;
        if (arg14 == -1) {
            return;
        }
        if (arg6 == null || arg3 == -1) {
            this.method3084(arg13, 122, arg7, arg14, 0, arg8, arg2, arg11, arg10);
        } else if (this.method1948()) {
            class246 var16 = arg13.field6335[arg14];
            class181 var17 = var16.field3597;
            class246 var18 = null;
            if (arg8 != null) {
                var18 = arg8.field6335[arg10];
                if (var18.field3597 != var17) {
                    var18 = null;
                }
            }
            this.method3082(arg7, var18, arg4, var16, arg2, 0, (byte) -90, null, 65535, arg11, var17, arg6);
            class246 var19 = arg5.field6335[arg3];
            class246 var20 = null;
            if (arg0 != null) {
                var20 = arg0.field6335[arg1];
                if (var20.field3597 != var17) {
                    var20 = null;
                }
            }
            this.method1951(0, new int[0], 0, 0, 0, 0, arg7);
            this.method3082(arg7, var20, true, var19, arg9, 0, (byte) -90, null, 65535, arg12, var19.field3597, arg6);
            this.method1985();
        }
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method1980(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLvaa;ZLvaa;IIB[IIILwe;[Z)V")
    private final void method3082(boolean arg0, class246 arg1, boolean arg2, class246 arg3, int arg4, int arg5, byte arg6, int[] arg7, int arg8, int arg9, class181 arg10, boolean[] arg11) {
        field7719++;
        if (arg1 == null || arg9 == 0) {
            for (int var38 = 0; var38 < arg3.field3592; var38++) {
                short var39 = arg3.field3593[var38];
                if (arg11 == null || arg2 == arg11[var39] || arg10.field2779[var39] == 0) {
                    short var40 = arg3.field3596[var38];
                    if (var40 != -1) {
                        this.method3087(0, arg5, arg8 & arg10.field2780[var40], arg7, 0, false, arg10.field2776[var40], 0, arg0, 0);
                    }
                    this.method3087(arg3.field3598[var38], arg5, arg10.field2780[var39] & arg8, arg7, arg10.field2779[var39], false, arg10.field2776[var39], arg3.field3601[var38], arg0, arg3.field3605[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg6 != -90) {
            this.method1982();
        }
        for (int var15 = 0; var15 < arg10.field2775; var15++) {
            boolean var16 = false;
            if (var13 < arg3.field3592 && arg3.field3593[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg1.field3592 && arg1.field3593[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg11 == null || arg11[var15] == arg2 || arg10.field2779[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg10.field2779[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var23 = arg3.field3605[var13];
                        var20 = arg3.field3598[var13];
                        var24 = arg3.field3604[var13];
                        var22 = arg3.field3596[var13];
                        var21 = arg3.field3601[var13];
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
                        var25 = arg1.field3596[var14];
                        var26 = arg1.field3601[var14];
                        var27 = arg1.field3604[var14];
                        var28 = arg1.field3605[var14];
                        var29 = arg1.field3598[var14];
                        var14++;
                    } else {
                        var27 = 0;
                        var25 = -1;
                        var26 = var18;
                        var29 = var18;
                        var28 = var18;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var24 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var32 = var21;
                        var33 = var20;
                        var31 = var23;
                    } else if (var19 == 2) {
                        int var35 = var26 - var21 & 0x3FFF;
                        int var36 = var29 - var20 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var28 - var23 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var33 = var20 + (arg9 * var36 / arg4) & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var32 = arg9 * var35 / arg4 + var21 & 0x3FFF;
                        var31 = arg9 * var37 / arg4 + var23 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var26 - var21 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var31 = 0;
                        var33 = 0;
                        var32 = var21 + (arg9 * var34 / arg4) & 0x3FFF;
                    } else if (var19 == 7) {
                        int var30 = var26 - var21 & 0x3F;
                        if (var30 >= 32) {
                            var30 -= 64;
                        }
                        var31 = (var28 - var23) * arg9 / arg4 + var23;
                        var32 = arg9 * var30 / arg4 + var21 & 0x3F;
                        var33 = var20 + ((var29 - var20) * arg9 / arg4);
                    } else {
                        var32 = (var26 - var21) * arg9 / arg4 + var21;
                        var33 = (var29 - var20) * arg9 / arg4 + var20;
                        var31 = var23 + ((var28 - var23) * arg9 / arg4);
                    }
                    if (var22 != -1) {
                        this.method3087(0, arg5, arg10.field2780[var22] & arg8, arg7, 0, false, arg10.field2776[var22], 0, arg0, 0);
                    } else if (var25 != -1) {
                        this.method3087(0, arg5, arg10.field2780[var25] & arg8, arg7, 0, false, arg10.field2776[var25], 0, arg0, 0);
                    }
                    this.method3087(var33, arg5, arg8 & arg10.field2780[var15], arg7, var19, false, arg10.field2776[var15], var32, arg0, var31);
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

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
    public abstract void method1973(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method1949(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public abstract void method1945(int arg0, int arg1, class543 arg2, class543 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
    public abstract void method1978(int arg0);

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
    public abstract void method1985();

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method1971();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILsa;IIIIII)V")
    public final void method3083(int arg0, int arg1, class543 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7718++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg7 / 2;
        int var14 = -arg8 / 2;
        int var15 = arg2.method1323(arg6 + var13, arg4 + var14);
        int var16 = arg7 / 2;
        int var17 = -arg8 / 2;
        int var18 = arg2.method1323(arg6 + var16, arg4 + var17);
        int var19 = -arg7 / 2;
        int var20 = arg8 / 2;
        int var21 = arg2.method1323(arg6 + var19, arg4 + var20);
        int var22 = arg7 / 2;
        int var23 = arg8 / 2;
        int var24 = arg2.method1323(arg6 + var22, arg4 + var23);
        if (arg1 <= 31) {
            return;
        }
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var18 >= var24 ? var24 : var18;
        if (arg8 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg0 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg0;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (var28 > arg0) {
                        var28 = arg0;
                    }
                }
                this.method1966(var28);
            }
        }
        int var30 = var15 < var21 ? var15 : var21;
        if (arg7 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg3 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg3;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (arg3 < var31) {
                        var31 = arg3;
                    }
                }
                this.method1972(var31);
            }
        }
        int var33 = var15 + var24;
        if ((var18 + var21) < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg5;
        if (var34 != 0) {
            this.method1984(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
    public abstract int method1954();

    @OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
    public abstract void method1979(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    public abstract void method1961();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
    public abstract int method1958();

    @OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
    public abstract void method1947(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1977(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method1972(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILm;Z)Z")
    public abstract boolean method1963(int arg0, int arg1, class105 arg2, boolean arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lvq;IZIILvq;III)V")
    public final void method3084(class433 arg0, int arg1, boolean arg2, int arg3, int arg4, class433 arg5, int arg6, int arg7, int arg8) {
        field7722++;
        if (arg3 == -1 || !this.method1948()) {
            return;
        }
        int var10 = 16 % ((arg1 - 42) / 62);
        class246 var11 = arg0.field6335[arg3];
        class181 var12 = var11.field3597;
        class246 var13 = null;
        if (arg5 != null) {
            var13 = arg5.field6335[arg8];
            if (var13.field3597 != var12) {
                var13 = null;
            }
        }
        this.method3082(arg2, var13, false, var11, arg6, arg4, (byte) -90, null, 65535, arg7, var12, null);
        this.method1985();
    }

    @OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
    public abstract void method1984(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lk;)Lk;")
    public abstract class88 method1960(class88 arg0);

    @OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
    public abstract int method1962();

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
    public abstract int method1981();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB[IILvq;ZIIILvq;I)V")
    public final void method3085(int arg0, byte arg1, int[] arg2, int arg3, class433 arg4, boolean arg5, int arg6, int arg7, int arg8, class433 arg9, int arg10) {
        field7721++;
        if (arg0 == -1 || !this.method1948()) {
            return;
        }
        int var12 = 5 % ((-arg1 - 58) / 47);
        class246 var13 = arg9.field6335[arg0];
        class181 var14 = var13.field3597;
        class246 var15 = null;
        if (arg4 != null) {
            var15 = arg4.field6335[arg8];
            if (var15.field3597 != var14) {
                var15 = null;
            }
        }
        this.method3082(arg5, var15, false, var13, arg3, arg7, (byte) -90, arg2, arg6, arg10, var14, null);
        this.method1985();
    }

    @OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
    public abstract int method1982();

    @OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
    public abstract void method1976(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
    public abstract void method1959();

    @OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
    public abstract int method1969();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Lgr;I)V")
    public abstract void method1965(class105 arg0, class525 arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
    public abstract void method1974(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
    public abstract void method1966(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lvq;IB)V")
    public final void method3086(class433 arg0, int arg1, byte arg2) {
        field7723++;
        if (arg1 == -1 || !this.method1948()) {
            return;
        }
        class246 var4 = arg0.field6335[arg1];
        class181 var5 = var4.field3597;
        for (int var6 = 0; var6 < var4.field3592; var6++) {
            short var7 = var4.field3593[var6];
            if (var5.field2777[var7]) {
                if (var4.field3596[var6] != -1) {
                    this.method1976(0, 0, 0, 0);
                }
                this.method1976(var5.field2779[var7], var4.field3601[var6], var4.field3598[var6], var4.field3605[var6]);
            }
        }
        if (arg2 != 28) {
            this.method3081(null, 55, -49, 22, true, null, null, false, null, 116, -88, 78, 124, null, 93);
        }
        this.method1985();
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()[Lkv;")
    public abstract class200[] method1970();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Lgr;II)V")
    public abstract void method1975(class105 arg0, class525 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
    public abstract void method1951(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
    public abstract int method1950();

    @OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
    public abstract int method1968();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III[IIZ[IIZI)V")
    private final void method3087(int arg0, int arg1, int arg2, int[] arg3, int arg4, boolean arg5, int[] arg6, int arg7, boolean arg8, int arg9) {
        field7720++;
        if (arg1 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = -arg7;
                arg7 = arg9;
                arg9 = var13;
            } else if (arg4 == 3) {
                int var11 = arg7;
                arg7 = arg9;
                arg9 = var11;
            } else if (arg4 == 2) {
                int var12 = arg7;
                arg7 = -arg9 & 0x3FFF;
                arg9 = var12 & 0x3FFF;
            }
        } else if (arg1 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg9 = -arg9;
                arg7 = -arg7;
            } else if (arg4 == 2) {
                arg9 = -arg9 & 0x3FFF;
                arg7 = -arg7 & 0x3FFF;
            }
        } else if (arg1 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = arg7;
                arg7 = -arg9;
                arg9 = var16;
            } else if (arg4 == 3) {
                int var15 = arg7;
                arg7 = arg9;
                arg9 = var15;
            } else if (arg4 == 2) {
                int var14 = arg7;
                arg7 = arg9 & 0x3FFF;
                arg9 = -var14 & 0x3FFF;
            }
        }
        if (arg2 == 65535) {
            this.method1951(arg4, arg6, arg7, arg0, arg9, arg1, arg8);
        } else {
            this.method1977(arg4, arg6, arg7, arg0, arg9, arg8, arg2, arg3);
        }
        if (arg5) {
            this.method369((byte) 15, -47, false);
        }
    }

    @OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
    public abstract void method1983(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lr;IIIZ)V")
    public abstract void method1952(class520 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lr;")
    public abstract class520 method369(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
    public abstract boolean method1946();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()[Lmm;")
    public abstract class26[] method1964();

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
    public abstract int method1986();

    @OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
    public abstract boolean method1948();
}
