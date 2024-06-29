import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class289 {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Ljp;")
    public static class55 field4480 = new class55(21, 6);

    @OriginalMember(owner = "client!e", name = "g", descriptor = "[I")
    public static int[] field4486 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!e", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4483 = new String[200];

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILgo;IIILgo;ZII[II)V", line = 7)
    public final void method1936(int arg0, class313 arg1, int arg2, int arg3, int arg4, class313 arg5, boolean arg6, int arg7, int arg8, int[] arg9, int arg10) {
        field4488++;
        if (arg4 == -1 || !this.method650()) {
            return;
        }
        class212 var12 = arg1.field4760[arg4];
        class416 var13 = var12.field3219;
        class212 var14 = null;
        if (arg5 != null) {
            var14 = arg5.field4760[arg7];
            if (var14.field3219 != var13) {
                var14 = null;
            }
        }
        this.method1942(arg9, arg10, arg8, arg0, arg2, 3317, null, var12, var13, arg6, var14, false);
        this.method622();
        if (arg3 != 18421) {
            this.method669((byte) 10, -112, false);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lgo;ZLgo;IIIIBI)V", line = 43)
    public final void method1937(class313 arg0, boolean arg1, class313 arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field4482++;
        if (arg6 == -1 || !this.method650()) {
            return;
        }
        class212 var10 = arg2.field4760[arg6];
        class416 var11 = var10.field3219;
        int var12 = 102 % ((-arg7 - 13) / 46);
        class212 var13 = null;
        if (arg0 != null) {
            var13 = arg0.field4760[arg5];
            if (var13.field3219 != var11) {
                var13 = null;
            }
        }
        this.method1942(null, arg8, 65535, arg3, arg4, 3317, null, var10, var11, arg1, var13, false);
        this.method622();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[ZIILgo;ZILgo;ILgo;ILgo;II)V", line = 83)
    public final void method1938(int arg0, int arg1, boolean[] arg2, int arg3, int arg4, class313 arg5, boolean arg6, int arg7, class313 arg8, int arg9, class313 arg10, int arg11, class313 arg12, int arg13, int arg14) {
        field4485++;
        if (arg0 == -1) {
            return;
        }
        if (arg2 == null || arg1 == -1) {
            this.method1937(arg8, arg6, arg12, arg3, arg9, arg13, arg0, (byte) -61, 0);
        } else if (this.method650()) {
            class212 var16 = arg12.field4760[arg0];
            class416 var17 = var16.field3219;
            class212 var18 = null;
            if (arg8 != null) {
                var18 = arg8.field4760[arg13];
                if (var18.field3219 != var17) {
                    var18 = null;
                }
            }
            this.method1942(null, 0, 65535, arg3, arg9, 3317, arg2, var16, var17, arg6, var18, false);
            class212 var19 = arg5.field4760[arg1];
            class212 var20 = null;
            if (arg10 != null) {
                var20 = arg10.field4760[arg11];
                if (var20.field3219 != var17) {
                    var20 = null;
                }
            }
            this.method637(0, new int[0], arg14, 0, 0, 0, arg6);
            this.method1942(null, 0, 65535, arg7, arg4, arg14 ^ 0xCF5, arg2, var19, var19.field3219, arg6, var20, true);
            this.method622();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIILya;II)V", line = 136)
    public final void method1939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8) {
        field4487++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg5 / 2;
        if (arg7 != 200) {
            this.method648(62, 109, -59, -71);
        }
        int var14 = -arg0 / 2;
        int var15 = arg6.method68(arg1 + var13, arg8 + var14);
        int var16 = arg5 / 2;
        int var17 = -arg0 / 2;
        int var18 = arg6.method68(arg1 + var16, arg8 - -var17);
        int var19 = -arg5 / 2;
        int var20 = arg0 / 2;
        int var21 = arg6.method68(arg1 + var19, arg8 + var20);
        int var22 = arg5 / 2;
        int var23 = arg0 / 2;
        int var24 = arg6.method68(arg1 + var22, arg8 + var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var24 <= var18 ? var24 : var18;
        int var28 = var15 < var21 ? var15 : var21;
        if (arg0 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg3 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg3;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (arg3 < var29) {
                        var29 = arg3;
                    }
                }
                this.method666(var29);
            }
        }
        if (arg5 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg2 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg2;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (var31 > arg2) {
                        var31 = arg2;
                    }
                }
                this.method639(var31);
            }
        }
        int var33 = var15 + var24;
        if ((var18 + var21) < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg4;
        if (var34 != 0) {
            this.method678(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lgo;BI)V", line = 263)
    public final void method1940(class313 arg0, byte arg1, int arg2) {
        field4481++;
        if (arg2 == -1 || !this.method650()) {
            return;
        }
        class212 var4 = arg0.field4760[arg2];
        class416 var5 = var4.field3219;
        for (int var6 = 0; var6 < var4.field3233; var6++) {
            short var7 = var4.field3232[var6];
            if (var5.field6110[var7]) {
                if (var4.field3224[var6] != -1) {
                    this.method648(0, 0, 0, 0);
                }
                this.method648(var5.field6118[var7], var4.field3230[var6], var4.field3231[var6], var4.field3225[var6]);
            }
        }
        this.method622();
        if (arg1 <= 106) {
            method1943(10);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[IIBIZIII[I)V", line = 316)
    private final void method1941(int arg0, int[] arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9) {
        if (arg6 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = -arg2;
                arg2 = arg0;
                arg0 = var13;
            } else if (arg4 == 3) {
                int var11 = arg2;
                arg2 = arg0;
                arg0 = var11;
            } else if (arg4 == 2) {
                int var12 = arg2;
                arg2 = -arg0 & 0x3FFF;
                arg0 = var12 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg0 = -arg0;
                arg2 = -arg2;
            } else if (arg4 == 2) {
                arg0 = -arg0 & 0x3FFF;
                arg2 = -arg2 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = arg2;
                arg2 = -arg0;
                arg0 = var16;
            } else if (arg4 == 3) {
                int var15 = arg2;
                arg2 = arg0;
                arg0 = var15;
            } else if (arg4 == 2) {
                int var14 = arg2;
                arg2 = arg0 & 0x3FFF;
                arg0 = -var14 & 0x3FFF;
            }
        }
        field4484++;
        if (arg8 == 65535) {
            this.method637(arg4, arg9, arg2, arg7, arg0, arg6, arg5);
        } else {
            this.method649(arg4, arg9, arg2, arg7, arg0, arg5, arg8, arg1);
        }
        if (arg3 <= 112) {
            field4483 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([IIIIII[ZLjm;Ljd;ZLjm;Z)V", line = 416)
    private final void method1942(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean[] arg6, class212 arg7, class416 arg8, boolean arg9, class212 arg10, boolean arg11) {
        field4489++;
        if (arg10 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg7.field3233; var38++) {
                short var39 = arg7.field3232[var38];
                if (arg6 == null || arg11 == arg6[var39] || arg8.field6118[var39] == 0) {
                    short var40 = arg7.field3224[var38];
                    if (var40 != -1) {
                        this.method1941(0, arg0, 0, (byte) 122, 0, arg9, arg1, 0, arg8.field6113[var40] & arg2, arg8.field6112[var40]);
                    }
                    this.method1941(arg7.field3225[var38], arg0, arg7.field3230[var38], (byte) 116, arg8.field6118[var39], arg9, arg1, arg7.field3231[var38], arg2 & arg8.field6113[var39], arg8.field6112[var39]);
                }
            }
            return;
        }
        if (arg5 != 3317) {
            this.method630();
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg8.field6109; var15++) {
            boolean var16 = false;
            if (var13 < arg7.field3233 && arg7.field3232[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg10.field3233 > var14 && arg10.field3232[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg6 == null || arg11 == arg6[var15] || arg8.field6118[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg8.field6118[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var21 = arg7.field3224[var13];
                        var20 = arg7.field3231[var13];
                        var22 = arg7.field3226[var13];
                        var23 = arg7.field3230[var13];
                        var24 = arg7.field3225[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = -1;
                        var22 = 0;
                        var23 = var18;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg10.field3231[var14];
                        var26 = arg10.field3225[var14];
                        var27 = arg10.field3226[var14];
                        var28 = arg10.field3224[var14];
                        var29 = arg10.field3230[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var28 = -1;
                        var27 = 0;
                        var29 = var18;
                        var26 = var18;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var22 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var32 = var20;
                        var31 = var24;
                        var33 = var23;
                    } else if (var19 == 2) {
                        int var35 = var29 - var23 & 0x3FFF;
                        int var36 = var25 - var20 & 0x3FFF;
                        int var37 = var26 - var24 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var33 = arg3 * var35 / arg4 + var23 & 0x3FFF;
                        var32 = arg3 * var36 / arg4 + var20 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var31 = arg3 * var37 / arg4 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var29 - var23 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = 0;
                        var32 = 0;
                        var33 = arg3 * var30 / arg4 + var23 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var34 = var29 - var23 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var31 = (var26 - var24) * arg3 / arg4 + var24;
                        var32 = (var25 - var20) * arg3 / arg4 + var20;
                        var33 = arg3 * var34 / arg4 + var23 & 0x3F;
                    } else {
                        var32 = var20 + ((var25 - var20) * arg3 / arg4);
                        var31 = var24 + ((var26 - var24) * arg3 / arg4);
                        var33 = (var29 - var23) * arg3 / arg4 + var23;
                    }
                    if (var21 != -1) {
                        this.method1941(0, arg0, 0, (byte) 115, 0, arg9, arg1, 0, arg8.field6113[var21] & arg2, arg8.field6112[var21]);
                    } else if (var28 != -1) {
                        this.method1941(0, arg0, 0, (byte) 123, 0, arg9, arg1, 0, arg8.field6113[var28] & arg2, arg8.field6112[var28]);
                    }
                    this.method1941(var31, arg0, var33, (byte) 125, var19, arg9, arg1, var32, arg8.field6113[var15] & arg2, arg8.field6112[var15]);
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

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 662)
    public static void method1943(int arg0) {
        if (arg0 != 0) {
            method1943(-53);
        }
        field4480 = null;
        field4486 = null;
        field4483 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public abstract void method664(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
    public abstract int method630();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lwg;I)V")
    public abstract void method673(class517 arg0, class41 arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
    public abstract void method620(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;IIIZ)V")
    public abstract void method625(class289 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
    public abstract boolean method650();

    @OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
    public abstract void method666(int arg0);

    @OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
    public abstract int method624();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()[Lu;")
    public abstract class349[] method634();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Le;")
    public abstract class289 method669(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
    public abstract int method674();

    @OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
    public abstract void method672();

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
    public abstract int method658();

    @OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
    public abstract void method631(int arg0);

    @OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
    public abstract void method667(int arg0);

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
    public abstract int method641();

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()Z")
    public abstract boolean method633();

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()V")
    public abstract void method657();

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
    public abstract int method655();

    @OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
    public abstract void method622();

    @OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
    public abstract void method662(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method638(int arg0, int arg1, class517 arg2, boolean arg3);

    @OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
    public abstract void method632(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lwg;II)V")
    public abstract void method656(class517 arg0, class41 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
    public abstract int method643();

    @OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
    public abstract void method647(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "da", descriptor = "(IILya;Lya;III)V")
    public abstract void method677(int arg0, int arg1, class11 arg2, class11 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!e", name = "EA", descriptor = "(Li;)Li;")
    public abstract class200 method636(class200 arg0);

    @OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
    public abstract int method679();

    @OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public abstract void method649(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
    public abstract void method648(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
    public abstract void method676(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
    public abstract void method639(int arg0);

    @OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
    public abstract int method652();

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()[Lod;")
    public abstract class476[] method665();

    @OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
    public abstract void method637(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public abstract void method678(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
    public abstract void method640(int arg0);

    @OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
    public abstract int method654();
}
