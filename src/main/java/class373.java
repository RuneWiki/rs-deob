import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class373 {

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lho;")
    public static class103 field5062 = new class103(82, -1);

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Ld;")
    public static class104 field5065 = new class104("stellardawn", 1);

    @OriginalMember(owner = "client!e", name = "m", descriptor = "[I")
    public static int[] field5066 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lhq;")
    public static class110 field5063;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5060;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILcc;ZLcc;ILcc;Lcc;IIIIIIB[Z)V", line = 4)
    public final void method2202(int arg0, class516 arg1, boolean arg2, class516 arg3, int arg4, class516 arg5, class516 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, byte arg13, boolean[] arg14) {
        field5056++;
        if (arg9 == -1) {
            return;
        }
        int var16 = 37 % ((53 - arg13) / 54);
        if (arg14 == null || arg0 == -1) {
            this.method2208(arg3, 0, arg10, arg4, arg7, arg9, 1, arg2, arg5);
        } else if (this.method2021()) {
            class39 var17 = arg3.field7510[arg9];
            class123 var18 = var17.field399;
            class39 var19 = null;
            if (arg5 != null) {
                var19 = arg5.field7510[arg7];
                if (var19.field399 != var18) {
                    var19 = null;
                }
            }
            this.method2203(arg14, null, arg4, 0, var19, false, arg10, 65535, var18, var17, -30865, arg2);
            class39 var20 = arg6.field7510[arg0];
            class39 var21 = null;
            if (arg1 != null) {
                var21 = arg1.field7510[arg8];
                if (var21.field399 != var18) {
                    var21 = null;
                }
            }
            this.method2047(0, new int[0], 0, 0, 0, 0, arg2);
            this.method2203(arg14, null, arg11, 0, var21, true, arg12, 65535, var20.field399, var20, -30865, arg2);
            this.method2029();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([Z[IIILvg;ZIILr;Lvg;IZ)V", line = 68)
    private final void method2203(boolean[] arg0, int[] arg1, int arg2, int arg3, class39 arg4, boolean arg5, int arg6, int arg7, class123 arg8, class39 arg9, int arg10, boolean arg11) {
        field5055++;
        if (arg4 == null || arg2 == 0) {
            for (int var38 = 0; var38 < arg9.field401; var38++) {
                short var39 = arg9.field407[var38];
                if (arg0 == null || arg0[var39] == arg5 || arg8.field1591[var39] == 0) {
                    short var40 = arg9.field410[var38];
                    if (var40 != -1) {
                        this.method2205(0, arg8.field1600[var40] & arg7, arg11, 0, arg8.field1603[var40], arg1, (byte) 120, arg3, 0, 0);
                    }
                    this.method2205(arg9.field402[var38], arg8.field1600[var39] & arg7, arg11, arg9.field409[var38], arg8.field1603[var39], arg1, (byte) 122, arg3, arg8.field1591[var39], arg9.field413[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (arg10 != -30865) {
            this.method2034(-13);
        }
        while (arg8.field1592 > var15) {
            boolean var16 = false;
            if (var13 < arg9.field401 && arg9.field407[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg4.field401 > var14 && arg4.field407[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg0 == null || arg0[var15] == arg5 || arg8.field1591[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg8.field1591[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var24 = arg9.field410[var13];
                        var20 = arg9.field409[var13];
                        var21 = arg9.field413[var13];
                        var23 = arg9.field408[var13];
                        var22 = arg9.field402[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = var18;
                        var23 = 0;
                        var24 = -1;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg4.field409[var14];
                        var26 = arg4.field402[var14];
                        var27 = arg4.field408[var14];
                        var28 = arg4.field413[var14];
                        var29 = arg4.field410[var14];
                        var14++;
                    } else {
                        var28 = var18;
                        var29 = -1;
                        var27 = 0;
                        var25 = var18;
                        var26 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var23 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var33 = var20;
                        var34 = var22;
                        var35 = var21;
                    } else if (var19 == 2) {
                        int var30 = var25 - var20 & 0x3FFF;
                        int var31 = var26 - var22 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var28 - var21 & 0x3FFF;
                        var33 = arg2 * var30 / arg6 + var20 & 0x3FFF;
                        var34 = arg2 * var31 / arg6 + var22 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = arg2 * var32 / arg6 + var21 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var25 - var20 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg2 * var37 / arg6 + var20 & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var36 = var25 - var20 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var34 = (var26 - var22) * arg2 / arg6 + var22;
                        var35 = (var28 - var21) * arg2 / arg6 + var21;
                        var33 = var20 + (arg2 * var36 / arg6) & 0x3F;
                    } else {
                        var33 = (var25 - var20) * arg2 / arg6 + var20;
                        var35 = var21 + ((var28 - var21) * arg2 / arg6);
                        var34 = (var26 - var22) * arg2 / arg6 + var22;
                    }
                    if (var24 != -1) {
                        this.method2205(0, arg7 & arg8.field1600[var24], arg11, 0, arg8.field1603[var24], arg1, (byte) 124, arg3, 0, 0);
                    } else if (var29 != -1) {
                        this.method2205(0, arg8.field1600[var29] & arg7, arg11, 0, arg8.field1603[var29], arg1, (byte) 120, arg3, 0, 0);
                    }
                    this.method2205(var34, arg7 & arg8.field1600[var15], arg11, var33, arg8.field1603[var15], arg1, (byte) 125, arg3, var19, var35);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILya;IIIII)V", line = 287)
    public final void method2204(int arg0, int arg1, int arg2, class38 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5061++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg5 / 2;
        int var14 = -arg6 / 2;
        int var15 = arg3.method216(arg2 + var13, arg0 + var14);
        int var16 = arg5 / 2;
        int var17 = -arg6 / 2;
        int var18 = arg3.method216(arg2 + var16, arg0 + var17);
        int var19 = -arg5 / 2;
        int var20 = arg6 / 2;
        int var21 = arg3.method216(arg2 + var19, arg0 + var20);
        int var22 = arg5 / 2;
        int var23 = arg6 / 2;
        int var24 = arg3.method216(arg2 + var22, arg0 + var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var24 > var18 ? var18 : var24;
        if (arg6 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg8 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg8;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (arg8 < var28) {
                        var28 = arg8;
                    }
                }
                this.method2022(var28);
            }
        }
        int var30 = var21 <= var15 ? var21 : var15;
        int var31 = var15 + var24;
        if (arg5 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
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
                this.method2039(var32);
            }
        }
        if ((var18 + var21) < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg1;
        if (var34 != 0) {
            this.method2044(0, var34, 0);
        }
        if (arg7 != 11628) {
            field5066 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZI[I[IBIII)V", line = 404)
    private final void method2205(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int[] arg5, byte arg6, int arg7, int arg8, int arg9) {
        field5054++;
        if (arg7 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = -arg3;
                arg3 = arg9;
                arg9 = var13;
            } else if (arg8 == 3) {
                int var11 = arg3;
                arg3 = arg9;
                arg9 = var11;
            } else if (arg8 == 2) {
                int var12 = arg3;
                arg3 = -arg9 & 0x3FFF;
                arg9 = var12 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg9 = -arg9;
                arg3 = -arg3;
            } else if (arg8 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = arg3;
                arg3 = -arg9;
                arg9 = var16;
            } else if (arg8 == 3) {
                int var14 = arg3;
                arg3 = arg9;
                arg9 = var14;
            } else if (arg8 == 2) {
                int var15 = arg3;
                arg3 = arg9 & 0x3FFF;
                arg9 = -var15 & 0x3FFF;
            }
        }
        int var17 = -114 % ((arg6 - 62) / 56);
        if (arg1 == 65535) {
            this.method2047(arg8, arg4, arg3, arg0, arg9, arg7, arg2);
        } else {
            this.method2042(arg8, arg4, arg3, arg0, arg9, arg2, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III)I", line = 518)
    public static final int method2206(int arg0, int arg1, int arg2) {
        field5064++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            if (arg2 >= -119) {
                method2206(-124, -124, 19);
            }
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIZIIII[ILcc;Lcc;)V", line = 558)
    public final void method2207(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, class516 arg9, class516 arg10) {
        field5058++;
        if (arg6 == -1 || !this.method2021()) {
            return;
        }
        class39 var12 = arg10.field7510[arg6];
        class123 var13 = var12.field399;
        class39 var14 = null;
        if (arg9 != null) {
            var14 = arg9.field7510[arg1];
            if (var14.field399 != var13) {
                var14 = null;
            }
        }
        this.method2203(null, arg8, arg5, arg4, var14, false, arg7, arg2, var13, var12, -30865, arg3);
        if (arg0 != -23551) {
            this.method2050(-104, 19, 89, -119);
        }
        this.method2029();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcc;IIIIIIZLcc;)V", line = 596)
    public final void method2208(class516 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class516 arg8) {
        if (arg6 != 1) {
            return;
        }
        field5059++;
        if (arg5 == -1 || !this.method2021()) {
            return;
        }
        class39 var10 = arg0.field7510[arg5];
        class123 var11 = var10.field399;
        class39 var12 = null;
        if (arg8 != null) {
            var12 = arg8.field7510[arg4];
            if (var12.field399 != var11) {
                var12 = null;
            }
        }
        this.method2203(null, null, arg3, arg1, var12, false, arg2, 65535, var11, var10, -30865, arg7);
        this.method2029();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILcc;)V", line = 633)
    public final void method2209(int arg0, int arg1, class516 arg2) {
        field5057++;
        if (~arg1 == arg0 || !this.method2021()) {
            return;
        }
        class39 var4 = arg2.field7510[arg1];
        class123 var5 = var4.field399;
        for (int var6 = 0; var6 < var4.field401; var6++) {
            short var7 = var4.field407[var6];
            if (var5.field1597[var7]) {
                if (var4.field410[var6] != -1) {
                    this.method2050(0, 0, 0, 0);
                }
                this.method2050(var5.field1591[var7], var4.field409[var6], var4.field402[var6], var4.field413[var6]);
            }
        }
        this.method2029();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 672)
    public static void method2210(byte arg0) {
        field5066 = null;
        field5062 = null;
        field5065 = null;
        if (arg0 > -19) {
            method2206(-85, -8, 73);
        }
        field5063 = null;
        field5060 = null;
    }

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
    public abstract int method2048();

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
    public abstract int method2045();

    @OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
    public abstract int method2043();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public abstract void method2030(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
    public abstract int method2028();

    @OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
    public abstract void method2022(int arg0);

    @OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
    public abstract void method2032(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public abstract void method2042(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
    public abstract int method2025();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()Z")
    public abstract boolean method2020();

    @OriginalMember(owner = "client!e", name = "da", descriptor = "(IILya;Lya;III)V")
    public abstract void method2038(int arg0, int arg1, class38 arg2, class38 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lut;I)V")
    public abstract void method2051(class124 arg0, class82 arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
    public abstract void method2047(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
    public abstract void method2018(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;IIIZ)V")
    public abstract void method2049(class373 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!e", name = "EA", descriptor = "(Li;)Li;")
    public abstract class31 method2017(class31 arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method2026(int arg0, int arg1, class124 arg2, boolean arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public abstract void method2044(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
    public abstract void method2037(int arg0);

    @OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
    public abstract void method2010();

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()[Lsu;")
    public abstract class142[] method2009();

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()[Lop;")
    public abstract class127[] method2015();

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
    public abstract int method2023();

    @OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
    public abstract void method2034(int arg0);

    @OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
    public abstract void method2011(int arg0);

    @OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
    public abstract int method2024();

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
    public abstract boolean method2021();

    @OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
    public abstract void method2040(int arg0);

    @OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
    public abstract void method2035(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
    public abstract int method2019();

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
    public abstract void method2013();

    @OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
    public abstract int method2036();

    @OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
    public abstract void method2039(int arg0);

    @OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
    public abstract void method2014(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Le;")
    public abstract class373 method2027(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
    public abstract void method2050(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lut;II)V")
    public abstract void method2016(class124 arg0, class82 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
    public abstract int method2041();

    @OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
    public abstract void method2029();
}
