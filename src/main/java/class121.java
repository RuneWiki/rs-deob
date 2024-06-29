import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class121 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
    public static boolean field1889 = false;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lvb;")
    public static class130 field1896;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Ltm;")
    public static class264 field1892;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([IZII[IIIIII)V", line = 5)
    private final void method875(int[] arg0, boolean arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -123 % ((arg3 - 12) / 62);
        if (arg7 == 1) {
            if (arg2 == 0 || arg2 == 1) {
                int var14 = -arg8;
                arg8 = arg5;
                arg5 = var14;
            } else if (arg2 == 3) {
                int var12 = arg8;
                arg8 = arg5;
                arg5 = var12;
            } else if (arg2 == 2) {
                int var13 = arg8;
                arg8 = -arg5 & 0x3FFF;
                arg5 = var13 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg2 == 0 || arg2 == 1) {
                arg8 = -arg8;
                arg5 = -arg5;
            } else if (arg2 == 2) {
                arg5 = -arg5 & 0x3FFF;
                arg8 = -arg8 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg2 == 0 || arg2 == 1) {
                int var17 = arg8;
                arg8 = -arg5;
                arg5 = var17;
            } else if (arg2 == 3) {
                int var15 = arg8;
                arg8 = arg5;
                arg5 = var15;
            } else if (arg2 == 2) {
                int var16 = arg8;
                arg8 = arg5 & 0x3FFF;
                arg5 = -var16 & 0x3FFF;
            }
        }
        field1898++;
        if (arg9 == 65535) {
            this.method905(arg2, arg0, arg8, arg6, arg5, arg7, arg1);
        } else {
            this.method882(arg2, arg0, arg8, arg6, arg5, arg1, arg9, arg4);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lul;ZIIIIII[IILul;)V", line = 120)
    public final void method887(class402 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, class402 arg10) {
        field1891++;
        if (arg3 == -1) {
            return;
        }
        if (arg2 > -30) {
            field1892 = null;
        }
        if (!this.method901()) {
            return;
        }
        class517 var12 = arg0.field5891[arg3];
        class168 var13 = var12.field7597;
        class517 var14 = null;
        if (arg10 != null) {
            var14 = arg10.field5891[arg5];
            if (var14.field7597 != var13) {
                var14 = null;
            }
        }
        this.method900(var13, arg6, null, arg9, arg8, var14, arg1, false, arg7, arg4, false, var12);
        this.method874();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIIIILna;II)V", line = 160)
    public final void method892(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, int arg7, int arg8) {
        if (!arg0) {
            this.method902(123, null, 79);
        }
        field1897++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg7 / 2;
        int var14 = -arg5 / 2;
        int var15 = arg6.method273(arg4 + var13, arg2 + var14);
        int var16 = arg7 / 2;
        int var17 = -arg5 / 2;
        int var18 = arg6.method273(arg4 + var16, arg2 + var17);
        int var19 = -arg7 / 2;
        int var20 = arg5 / 2;
        int var21 = arg6.method273(arg4 + var19, arg2 + var20);
        int var22 = arg7 / 2;
        int var23 = arg5 / 2;
        int var24 = arg6.method273(arg4 + var22, arg2 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var18 < var24 ? var18 : var24;
        int var28 = var15 < var21 ? var15 : var21;
        if (arg5 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg1 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg1;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (arg1 < var29) {
                        var29 = arg1;
                    }
                }
                this.method886(var29);
            }
        }
        if (arg7 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg3 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg3;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (var31 > arg3) {
                        var31 = arg3;
                    }
                }
                this.method895(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > var18 + var21) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg8;
        if (var34 != 0) {
            this.method884(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZLul;IILul;IIZ)V", line = 275)
    public final void method893(int arg0, boolean arg1, class402 arg2, int arg3, int arg4, class402 arg5, int arg6, int arg7, boolean arg8) {
        field1895++;
        if (arg3 == -1 || !this.method901()) {
            return;
        }
        class517 var10 = arg2.field5891[arg3];
        class168 var11 = var10.field7597;
        class517 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field5891[arg6];
            if (var12.field7597 != var11) {
                var12 = null;
            }
        }
        this.method900(var11, arg7, null, arg0, null, var12, arg1, arg8, 65535, arg4, false, var10);
        this.method874();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lpd;I[ZI[ILfl;ZZIIZLfl;)V", line = 318)
    private final void method900(class168 arg0, int arg1, boolean[] arg2, int arg3, int[] arg4, class517 arg5, boolean arg6, boolean arg7, int arg8, int arg9, boolean arg10, class517 arg11) {
        field1894++;
        if (arg5 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg11.field7596; var38++) {
                short var39 = arg11.field7589[var38];
                if (arg2 == null || arg2[var39] == arg10 || arg0.field2515[var39] == 0) {
                    short var40 = arg11.field7590[var38];
                    if (var40 != -1) {
                        this.method875(arg0.field2517[var40], arg6, 0, 106, arg4, 0, 0, arg1, 0, arg0.field2524[var40] & arg8);
                    }
                    this.method875(arg0.field2517[var39], arg6, arg0.field2515[var39], 113, arg4, arg11.field7595[var38], arg11.field7588[var38], arg1, arg11.field7587[var38], arg0.field2524[var39] & arg8);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (arg7) {
            field1896 = null;
        }
        while (var15 < arg0.field2518) {
            boolean var16 = false;
            if (arg11.field7596 > var13 && arg11.field7589[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg5.field7596 && arg5.field7589[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg2 == null || arg2[var15] == arg10 || arg0.field2515[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field2515[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var24 = arg11.field7595[var13];
                        var21 = arg11.field7590[var13];
                        var20 = arg11.field7588[var13];
                        var22 = arg11.field7587[var13];
                        var23 = arg11.field7601[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = -1;
                        var22 = var18;
                        var23 = 0;
                        var24 = var18;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg5.field7601[var14];
                        var26 = arg5.field7595[var14];
                        var27 = arg5.field7587[var14];
                        var28 = arg5.field7588[var14];
                        var29 = arg5.field7590[var14];
                        var14++;
                    } else {
                        var26 = var18;
                        var25 = 0;
                        var29 = -1;
                        var28 = var18;
                        var27 = var18;
                    }
                    if (var21 != -1) {
                        this.method875(arg0.field2517[var21], arg6, 0, 87, arg4, 0, 0, arg1, 0, arg0.field2524[var21] & arg8);
                    } else if (var29 != -1) {
                        this.method875(arg0.field2517[var29], arg6, 0, -102, arg4, 0, 0, arg1, 0, arg8 & arg0.field2524[var29]);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var23 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var33 = var22;
                        var31 = var24;
                        var32 = var20;
                    } else if (var19 == 2) {
                        int var35 = var27 - var22 & 0x3FFF;
                        int var36 = var28 - var20 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var26 - var24 & 0x3FFF;
                        var33 = arg3 * var35 / arg9 + var22 & 0x3FFF;
                        var32 = arg3 * var36 / arg9 + var20 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var31 = arg3 * var37 / arg9 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var27 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = 0;
                        var32 = 0;
                        var33 = arg3 * var30 / arg9 + var22 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var34 = var27 - var22 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var31 = (var26 - var24) * arg3 / arg9 + var24;
                        var33 = arg3 * var34 / arg9 + var22 & 0x3F;
                        var32 = (var28 - var20) * arg3 / arg9 + var20;
                    } else {
                        var31 = var24 + ((var26 - var24) * arg3 / arg9);
                        var33 = (var27 - var22) * arg3 / arg9 + var22;
                        var32 = (var28 - var20) * arg3 / arg9 + var20;
                    }
                    this.method875(arg0.field2517[var15], arg6, var19, -50, arg4, var31, var32, arg1, var33, arg0.field2524[var15] & arg8);
                } else {
                    if (var16) {
                        var13++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILul;I)V", line = 529)
    public final void method902(int arg0, class402 arg1, int arg2) {
        field1899++;
        if (arg0 == arg2 || !this.method901()) {
            return;
        }
        class517 var4 = arg1.field5891[arg2];
        class168 var5 = var4.field7597;
        for (int var6 = 0; var6 < var4.field7596; var6++) {
            short var7 = var4.field7589[var6];
            if (var5.field2519[var7]) {
                if (var4.field7590[var6] != -1) {
                    this.method919(0, 0, 0, 0);
                }
                this.method919(var5.field2515[var7], var4.field7587[var6], var4.field7588[var6], var4.field7595[var6]);
            }
        }
        this.method874();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIIIIII)V", line = 585)
    public static final void method914(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1890++;
        if (class91.method738(false, arg6)) {
            if (arg1 != 114) {
                field1889 = false;
            }
            if (class103.field1643[arg6] == null) {
                class296.method1825(class416.field6157[arg6], arg7, 1, arg4, -1, arg2, arg0, arg8, arg3, arg5);
            } else {
                class296.method1825(class103.field1643[arg6], arg7, 1, arg4, -1, arg2, arg0, arg8, arg3, arg5);
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class165.field2473[var9] = true;
            }
        } else {
            class165.field2473[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 629)
    public static void method920(boolean arg0) {
        field1892 = null;
        if (!arg0) {
            field1889 = true;
        }
        field1896 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[ZILul;ZLul;IILul;IILul;I)V", line = 640)
    public final void method921(int arg0, int arg1, int arg2, boolean[] arg3, int arg4, class402 arg5, boolean arg6, class402 arg7, int arg8, int arg9, class402 arg10, int arg11, int arg12, class402 arg13, int arg14) {
        field1893++;
        if (arg0 == -1) {
            return;
        }
        if (arg9 >= -30) {
            field1892 = null;
        }
        if (arg3 == null || arg11 == -1) {
            this.method893(arg8, arg6, arg5, arg0, arg2, arg7, arg14, 0, false);
        } else if (this.method901()) {
            class517 var16 = arg5.field5891[arg0];
            class168 var17 = var16.field7597;
            class517 var18 = null;
            if (arg7 != null) {
                var18 = arg7.field5891[arg14];
                if (var18.field7597 != var17) {
                    var18 = null;
                }
            }
            this.method900(var17, 0, arg3, arg8, null, var18, arg6, false, 65535, arg2, false, var16);
            class517 var19 = arg10.field5891[arg11];
            class517 var20 = null;
            if (arg13 != null) {
                var20 = arg13.field5891[arg12];
                if (var20.field7597 != var17) {
                    var20 = null;
                }
            }
            this.method905(0, new int[0], 0, 0, 0, 0, arg6);
            this.method900(var19.field7597, 0, arg3, arg4, null, var20, arg6, false, 65535, arg1, true, var19);
            this.method874();
        }
    }

    @OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
    public abstract void method874();

    @OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
    public abstract int method876();

    @OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
    public abstract void method877(int arg0);

    @OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
    public abstract void method878(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILna;Lna;III)V")
    public abstract void method879(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
    public abstract void method880(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lc;")
    public abstract class121 method881(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
    public abstract void method882(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
    public abstract int method883();

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
    public abstract void method884(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lj;)Lj;")
    public abstract class377 method885(class377 arg0);

    @OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
    public abstract void method886(int arg0);

    @OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
    public abstract int method888();

    @OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
    public abstract void method889();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()[Lwq;")
    public abstract class113[] method890();

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()V")
    public abstract void method891();

    @OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
    public abstract void method894(int arg0);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
    public abstract void method895(int arg0);

    @OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
    public abstract int method896();

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
    public abstract void method897(int arg0);

    @OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
    public abstract int method898();

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
    public abstract int method899();

    @OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
    public abstract boolean method901();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Lsf;II)V")
    public abstract void method903(class413 arg0, class361 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    public abstract void method904(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
    public abstract void method905(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
    public abstract void method906(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lc;IIIZ)V")
    public abstract void method907(class121 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
    public abstract int method908();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILia;Z)Z")
    public abstract boolean method909(int arg0, int arg1, class413 arg2, boolean arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Lsf;I)V")
    public abstract void method910(class413 arg0, class361 arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
    public abstract void method911(int arg0);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()Z")
    public abstract boolean method912();

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()[Lqr;")
    public abstract class46[] method913();

    @OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
    public abstract int method915();

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
    public abstract int method916();

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
    public abstract void method917(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
    public abstract int method918();

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
    public abstract void method919(int arg0, int arg1, int arg2, int arg3);
}
