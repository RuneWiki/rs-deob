import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class107 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Z")
    public static boolean field1389 = false;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field1400 = -60;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "F")
    public static float field1397;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lvg;")
    public static class626 field1390;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method786(int arg0) {
        field1390 = null;
        if (arg0 != 22495) {
            field1389 = true;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ltc;II)I")
    public static final int method787(class477 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field1400 = -63;
        }
        field1391++;
        if (!client.method696(arg0).method1143(arg2 ^ 0x5B, arg1) && arg0.field6268 == null) {
            return -1;
        } else if (arg0.field6373 == null || arg1 >= arg0.field6373.length) {
            return -1;
        } else {
            return arg0.field6373[arg1];
        }
    }

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
    public abstract void method788();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lba;")
    public abstract class107 method479(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
    public abstract void method789(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
    public abstract void method790(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZLga;IIIIILga;I)V")
    public final void method791(boolean arg0, class63 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class63 arg7, int arg8) {
        field1387++;
        if (arg4 == -1 || !this.method802()) {
            return;
        }
        class163 var10 = arg7.field855[arg4];
        class174 var11 = var10.field2037;
        class163 var12 = null;
        if (arg1 != null) {
            var12 = arg1.field855[arg2];
            if (var12.field2037 != var11) {
                var12 = null;
            }
        }
        this.method823(null, var11, var10, arg8, arg5, arg0, var12, null, 65535, arg3, false, 0);
        if (arg6 == 10591) {
            this.method788();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lht;II)V")
    public abstract void method792(class151 arg0, class108 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
    public abstract int method793();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()Z")
    public abstract boolean method794();

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()[Lrea;")
    public abstract class32[] method795();

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
    public abstract int method796();

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
    public abstract void method797();

    @OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
    public abstract void method798(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
    public abstract int method799();

    @OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
    public abstract void method800(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZI[ZIBILga;Lga;IILga;ILga;II)V")
    public final void method801(boolean arg0, int arg1, boolean[] arg2, int arg3, byte arg4, int arg5, class63 arg6, class63 arg7, int arg8, int arg9, class63 arg10, int arg11, class63 arg12, int arg13, int arg14) {
        field1392++;
        if (arg11 == -1) {
            return;
        }
        if (arg2 == null || arg5 == -1) {
            this.method791(arg0, arg6, arg9, arg3, arg11, 0, 10591, arg12, arg13);
        } else if (this.method802()) {
            if (arg4 > -11) {
                field1397 = -0.56358194F;
            }
            class163 var16 = arg12.field855[arg11];
            class174 var17 = var16.field2037;
            class163 var18 = null;
            if (arg6 != null) {
                var18 = arg6.field855[arg9];
                if (var18.field2037 != var17) {
                    var18 = null;
                }
            }
            this.method823(null, var17, var16, arg13, 0, arg0, var18, arg2, 65535, arg3, false, 0);
            class163 var19 = arg10.field855[arg5];
            class163 var20 = null;
            if (arg7 != null) {
                var20 = arg7.field855[arg14];
                if (var20.field2037 != var17) {
                    var20 = null;
                }
            }
            this.method828(0, new int[0], 0, 0, 0, 0, arg0);
            this.method823(null, var19.field2037, var19, arg1, 0, arg0, var20, arg2, 65535, arg8, true, 0);
            this.method788();
        }
    }

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
    public abstract boolean method802();

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
    public abstract void method803(int arg0);

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
    public abstract void method804(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
    public abstract int method805();

    @OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
    public abstract void method806(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZI[I[IIIIII)V")
    private final void method807(int arg0, boolean arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = -arg5;
                arg5 = arg7;
                arg7 = var16;
            } else if (arg0 == 3) {
                int var14 = arg5;
                arg5 = arg7;
                arg7 = var14;
            } else if (arg0 == 2) {
                int var15 = arg5;
                arg5 = -arg7 & 0x3FFF;
                arg7 = var15 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg5 = -arg5;
                arg7 = -arg7;
            } else if (arg0 == 2) {
                arg5 = -arg5 & 0x3FFF;
                arg7 = -arg7 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = arg5;
                arg5 = -arg7;
                arg7 = var13;
            } else if (arg0 == 3) {
                int var12 = arg5;
                arg5 = arg7;
                arg7 = var12;
            } else if (arg0 == 2) {
                int var11 = arg5;
                arg5 = arg7 & 0x3FFF;
                arg7 = -var11 & 0x3FFF;
            }
        }
        field1399++;
        if (arg9 == 65535) {
            this.method828(arg0, arg3, arg5, arg8, arg7, arg6, arg1);
        } else {
            this.method806(arg0, arg3, arg5, arg8, arg7, arg1, arg9, arg4);
        }
        if (arg2 != -19352) {
            field1400 = 117;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()[Lgi;")
    public abstract class574[] method808();

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
    public abstract void method809(int arg0);

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
    public abstract int method810();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIILd;I)V")
    public final void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class88 arg7, int arg8) {
        field1396++;
        boolean var10 = false;
        if (arg0 != -19948) {
            method830(-102);
        }
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = arg7.method669(arg1 + var13, arg6 + var14);
        int var16 = arg4 / 2;
        int var17 = -arg5 / 2;
        int var18 = arg7.method669(arg1 + var16, arg6 + var17);
        int var19 = -arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = arg7.method669(arg1 + var19, arg6 - -var20);
        int var22 = arg4 / 2;
        int var23 = arg5 / 2;
        int var24 = arg7.method669(arg1 + var22, arg6 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var24 <= var21 ? var24 : var21;
        int var27 = var24 <= var18 ? var24 : var18;
        int var28 = var21 > var15 ? var15 : var21;
        if (arg5 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg2 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg2;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (var29 > arg2) {
                        var29 = arg2;
                    }
                }
                this.method800(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg4 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg3 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg3;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (arg3 < var32) {
                        var32 = arg3;
                    }
                }
                this.method803(var32);
            }
        }
        if (var31 > var18 + var21) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg8;
        if (var34 != 0) {
            this.method804(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static final void method812(int arg0) {
        class298.method1758(95);
        if (arg0 != 2904) {
            field1400 = -20;
        }
        field1393++;
        class408.field5286 = null;
        class215.field2772 = null;
        class381.field4889 = null;
        class287.field3714 = null;
        class17.field193 = null;
    }

    @OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
    public abstract int method813();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILga;I)V")
    public final void method814(int arg0, class63 arg1, int arg2) {
        field1388++;
        if (arg0 == -1 || !this.method802()) {
            return;
        }
        class163 var4 = arg1.field855[arg0];
        if (arg2 != -22627) {
            return;
        }
        class174 var5 = var4.field2037;
        for (int var6 = 0; var6 < var4.field2035; var6++) {
            short var7 = var4.field2031[var6];
            if (var5.field2185[var7]) {
                if (var4.field2036[var6] != -1) {
                    this.method798(0, 0, 0, 0);
                }
                this.method798(var5.field2179[var7], var4.field2032[var6], var4.field2023[var6], var4.field2026[var6]);
            }
        }
        this.method788();
    }

    @OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
    public abstract void method815(int arg0);

    @OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
    public abstract int method816();

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
    public abstract int method817();

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()V")
    public abstract void method818();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;)V")
    public abstract void method819(class151 arg0);

    @OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
    public abstract int method820();

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lw;)Lw;")
    public abstract class605 method821(class605 arg0);

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
    public abstract void method822(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([ILsfa;Leea;IIZLeea;[ZIIZI)V")
    private final void method823(int[] arg0, class174 arg1, class163 arg2, int arg3, int arg4, boolean arg5, class163 arg6, boolean[] arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field1398++;
        if (arg6 == null || arg9 == 0) {
            for (int var38 = 0; var38 < arg2.field2035; var38++) {
                short var39 = arg2.field2031[var38];
                if (arg7 == null || arg7[var39] == arg10 || arg1.field2179[var39] == 0) {
                    short var40 = arg2.field2036[var38];
                    if (var40 != -1) {
                        this.method807(0, arg5, -19352, arg1.field2180[var40], arg0, 0, arg4, 0, 0, arg1.field2186[var40] & arg8);
                    }
                    this.method807(arg1.field2179[var39], arg5, arg11 ^ 0xFFFFB468, arg1.field2180[var39], arg0, arg2.field2032[var38], arg4, arg2.field2026[var38], arg2.field2023[var38], arg1.field2186[var39] & arg8);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = arg11;
        for (int var15 = 0; var15 < arg1.field2182; var15++) {
            boolean var16 = false;
            if (var13 < arg2.field2035 && arg2.field2031[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg6.field2035 && arg6.field2031[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg7 == null || arg7[var15] == arg10 || arg1.field2179[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg1.field2179[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg2.field2023[var13];
                        var21 = arg2.field2022[var13];
                        var22 = arg2.field2032[var13];
                        var24 = arg2.field2026[var13];
                        var23 = arg2.field2036[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = 0;
                        var22 = var18;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var28 = arg6.field2023[var14];
                        var26 = arg6.field2032[var14];
                        var29 = arg6.field2022[var14];
                        var25 = arg6.field2026[var14];
                        var27 = arg6.field2036[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var27 = -1;
                        var28 = var18;
                        var29 = 0;
                    }
                    if (var23 != -1) {
                        this.method807(0, arg5, arg11 - 19352, arg1.field2180[var23], arg0, 0, arg4, 0, 0, arg8 & arg1.field2186[var23]);
                    } else if (var27 != -1) {
                        this.method807(0, arg5, -19352, arg1.field2180[var27], arg0, 0, arg4, 0, 0, arg8 & arg1.field2186[var27]);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var21 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var33 = var22;
                        var31 = var24;
                        var32 = var20;
                    } else if (var19 == 2) {
                        int var35 = var26 - var22 & 0x3FFF;
                        int var36 = var28 - var20 & 0x3FFF;
                        int var37 = var25 - var24 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var32 = arg9 * var36 / arg3 + var20 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg9 * var35 / arg3 + var22 & 0x3FFF;
                        var31 = arg9 * var37 / arg3 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var26 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = 0;
                        var32 = 0;
                        var33 = arg9 * var30 / arg3 + var22 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var34 = var26 - var22 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var31 = (var25 - var24) * arg9 / arg3 + var24;
                        var33 = arg9 * var34 / arg3 + var22 & 0x3F;
                        var32 = (var28 - var20) * arg9 / arg3 + var20;
                    } else {
                        var33 = (var26 - var22) * arg9 / arg3 + var22;
                        var32 = (var28 - var20) * arg9 / arg3 + var20;
                        var31 = (var25 - var24) * arg9 / arg3 + var24;
                    }
                    this.method807(var19, arg5, arg11 - 19352, arg1.field2180[var15], arg0, var33, arg4, var31, var32, arg1.field2186[var15] & arg8);
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

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
    public abstract int method824();

    @OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
    public abstract void method825(int arg0);

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
    public abstract void method826(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lht;I)V")
    public abstract void method827(class151 arg0, class108 arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
    public abstract void method828(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
    public abstract void method829(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public static final void method830(int arg0) {
        class667.field9255 = null;
        class165.field2055 = -1;
        if (arg0 > 100) {
            field1394++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lba;IIIZ)V")
    public abstract void method831(class107 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method832(int arg0, int arg1, class151 arg2, boolean arg3);

    @OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILd;Ld;III)V")
    public abstract void method833(int arg0, int arg1, class88 arg2, class88 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZLga;BIILga;[IIIII)V")
    public final void method834(boolean arg0, class63 arg1, byte arg2, int arg3, int arg4, class63 arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        field1395++;
        if (arg8 == -1 || !this.method802()) {
            return;
        }
        class163 var12 = arg1.field855[arg8];
        class174 var13 = var12.field2037;
        class163 var14 = null;
        if (arg5 != null) {
            var14 = arg5.field855[arg10];
            if (var14.field2037 != var13) {
                var14 = null;
            }
        }
        this.method823(arg6, var13, var12, arg3, arg7, arg0, var14, null, arg4, arg9, false, 0);
        if (arg2 < 11) {
            this.method813();
        }
        this.method788();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public abstract void method835(int arg0, int arg1, int arg2, int arg3);
}
