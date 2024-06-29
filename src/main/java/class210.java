import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class210 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[C")
    public static char[] field2978 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field2981 = 52;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field2991 = 0;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Liq;")
    public static class362 field2985 = new class362("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Z")
    public static boolean field2997 = true;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Ljj;")
    public static class60 field2994;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field2998;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "[I")
    public static int[] field2989;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1423(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZIILac;II[IZ[ZLac;Lmk;)V", line = 5)
    private final void method1375(int arg0, boolean arg1, int arg2, int arg3, class320 arg4, int arg5, int arg6, int[] arg7, boolean arg8, boolean[] arg9, class320 arg10, class33 arg11) {
        field2980++;
        if (arg4 == null || arg0 == 0) {
            for (int var37 = 0; var37 < arg10.field4570; var37++) {
                short var38 = arg10.field4564[var37];
                if (arg9 == null || arg8 == arg9[var38] || arg11.field385[var38] == 0) {
                    short var39 = arg10.field4565[var37];
                    if (var39 != -1) {
                        this.method1383(arg11.field382[var39] & arg5, 0, (byte) -76, arg7, arg2, arg11.field379[var39], 0, arg1, 0, 0);
                    }
                    this.method1383(arg11.field382[var38] & arg5, arg10.field4556[var37], (byte) -61, arg7, arg2, arg11.field379[var38], arg10.field4563[var37], arg1, arg10.field4560[var37], arg11.field385[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = arg3; var15 < arg11.field376; var15++) {
            boolean var16 = false;
            if (arg10.field4570 > var13 && arg10.field4564[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg4.field4570 && arg4.field4564[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg9 == null || arg8 == arg9[var15] || arg11.field385[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg11.field385[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var24 = arg10.field4563[var13];
                        var20 = arg10.field4558[var13];
                        var22 = arg10.field4560[var13];
                        var21 = arg10.field4565[var13];
                        var23 = arg10.field4556[var13];
                        var13++;
                    } else {
                        var20 = 0;
                        var21 = -1;
                        var22 = var18;
                        var23 = var18;
                        var24 = var18;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg4.field4556[var14];
                        var26 = arg4.field4558[var14];
                        var27 = arg4.field4565[var14];
                        var28 = arg4.field4563[var14];
                        var29 = arg4.field4560[var14];
                        var14++;
                    } else {
                        var29 = var18;
                        var26 = 0;
                        var25 = var18;
                        var27 = -1;
                        var28 = var18;
                    }
                    if (var21 != -1) {
                        this.method1383(arg5 & arg11.field382[var21], 0, (byte) -97, arg7, arg2, arg11.field379[var21], 0, arg1, 0, 0);
                    } else if (var27 != -1) {
                        this.method1383(arg11.field382[var27] & arg5, 0, (byte) -81, arg7, arg2, arg11.field379[var27], 0, arg1, 0, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var20 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var35 = var23;
                        var33 = var24;
                        var34 = var22;
                    } else if (var19 == 2) {
                        int var30 = var28 - var24 & 0x3FFF;
                        int var31 = var29 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var25 - var23 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg0 * var30 / arg6 + var24 & 0x3FFF;
                        var34 = var22 + (arg0 * var31 / arg6) & 0x3FFF;
                        var35 = arg0 * var32 / arg6 + var23 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var28 - var24 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = (var25 - var23) * arg0 / arg6 + var23;
                        var34 = (var29 - var22) * arg0 / arg6 + var22;
                        var33 = arg0 * var36 / arg6 + var24 & 0x3F;
                    } else {
                        var33 = var24 + ((var28 - var24) * arg0 / arg6);
                        var34 = var22 + ((var29 - var22) * arg0 / arg6);
                        var35 = var23 + ((var25 - var23) * arg0 / arg6);
                    }
                    this.method1383(arg5 & arg11.field382[var15], var35, (byte) -65, arg7, arg2, arg11.field379[var15], var33, arg1, var34, var19);
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

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIILgh;II)V", line = 209)
    public final void method1381(int arg0, int arg1, int arg2, int arg3, class327 arg4, int arg5, int arg6) {
        if (arg5 != -3) {
            field2985 = null;
        }
        field2992++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg1 / 2;
        int var12 = -arg0 / 2;
        int var13 = arg4.method342(arg3 + var11, arg6 + var12);
        int var14 = arg1 / 2;
        int var15 = -arg0 / 2;
        int var16 = arg4.method342(arg3 + var14, arg6 + var15);
        int var17 = -arg1 / 2;
        int var18 = arg0 / 2;
        int var19 = arg4.method342(arg3 + var17, arg6 + var18);
        int var20 = arg1 / 2;
        int var21 = arg0 / 2;
        int var22 = arg4.method342(arg3 + var20, arg6 - -var21);
        int var23 = var13 < var16 ? var13 : var16;
        int var24 = var19 >= var22 ? var22 : var19;
        int var25 = var22 <= var16 ? var22 : var16;
        int var26 = var19 > var13 ? var13 : var19;
        if (arg0 != 0) {
            int var27 = (int) (Math.atan2((double) (var23 - var24), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var27 != 0) {
                this.method1403(var27);
            }
        }
        if (arg1 != 0) {
            int var28 = (int) (Math.atan2((double) (var26 - var25), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                this.method1407(var28);
            }
        }
        int var29 = var13 + var22;
        if ((var16 + var19) < var29) {
            var29 = var16 + var19;
        }
        int var30 = (var29 >> 1) - arg2;
        if (var30 != 0) {
            this.method1388(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIB[II[IIZII)V", line = 284)
    private final void method1383(int arg0, int arg1, byte arg2, int[] arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field2979++;
        if (arg4 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var16 = -arg6;
                arg6 = arg1;
                arg1 = var16;
            } else if (arg9 == 3) {
                int var14 = arg6;
                arg6 = arg1;
                arg1 = var14;
            } else if (arg9 == 2) {
                int var15 = arg6;
                arg6 = -arg1 & 0x3FFF;
                arg1 = var15 & 0x3FFF;
            }
        } else if (arg4 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg1 = -arg1;
                arg6 = -arg6;
            } else if (arg9 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg1 = -arg1 & 0x3FFF;
            }
        } else if (arg4 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var13 = arg6;
                arg6 = -arg1;
                arg1 = var13;
            } else if (arg9 == 3) {
                int var12 = arg6;
                arg6 = arg1;
                arg1 = var12;
            } else if (arg9 == 2) {
                int var11 = arg6;
                arg6 = arg1 & 0x3FFF;
                arg1 = -var11 & 0x3FFF;
            }
        }
        if (arg0 == 65535) {
            this.method1417(arg9, arg5, arg6, arg8, arg1, arg4, arg7);
        } else {
            this.method1389(arg9, arg5, arg6, arg8, arg1, arg7, arg0, arg3);
        }
        if (arg2 > -38) {
            field2995 = 49;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ldi;ZLdi;IIIIII)V", line = 382)
    public final void method1384(class64 arg0, boolean arg1, class64 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2984++;
        if (arg7 == -1 || !this.method1419()) {
            return;
        }
        class320 var10 = arg0.field731[arg7];
        class33 var11 = var10.field4568;
        class320 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field731[arg6];
            if (var12.field4568 != var11) {
                var12 = null;
            }
        }
        this.method1375(arg3, arg1, arg4, arg5, var12, 65535, arg8, (int[]) null, false, (boolean[]) null, var10, var11);
        this.method1378();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V", line = 413)
    public static final void method1385(int arg0, int arg1, int arg2) {
        field2988++;
        class20 var3 = class369.method2351((byte) 103, arg2, arg1);
        var3.method146(113);
        var3.field252 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ldi;IILdi;IIIZLdi;Z[ZILdi;II)V", line = 432)
    public final void method1391(class64 arg0, int arg1, int arg2, class64 arg3, int arg4, int arg5, int arg6, boolean arg7, class64 arg8, boolean arg9, boolean[] arg10, int arg11, class64 arg12, int arg13, int arg14) {
        field2987++;
        if (arg4 == -1) {
            return;
        }
        if (arg10 == null || arg14 == -1) {
            this.method1384(arg0, arg7, arg8, arg1, 0, 0, arg6, arg4, arg11);
        } else if (this.method1419()) {
            class320 var16 = arg0.field731[arg4];
            class33 var17 = var16.field4568;
            class320 var18 = null;
            if (arg8 != null) {
                var18 = arg8.field731[arg6];
                if (var18.field4568 != var17) {
                    var18 = null;
                }
            }
            class320 var19 = arg12.field731[arg14];
            class320 var20 = null;
            if (arg3 != null) {
                var20 = arg3.field731[arg5];
                if (var20.field4568 != var17) {
                    var20 = null;
                }
            }
            this.method1375(arg1, arg7, 0, 0, var18, 65535, arg11, (int[]) null, false, arg10, var16, var17);
            this.method1417(0, new int[0], 0, 0, 0, 0, arg7);
            this.method1375(arg2, arg7, 0, 0, var20, 65535, arg13, (int[]) null, arg9, arg10, var19, var17);
            this.method1378();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)Z", line = 489)
    public static final boolean method1393(int arg0, int arg1, int arg2, int arg3) {
        field2982++;
        class9 var4 = (class9) class137.method847(arg0, arg2, arg1);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class29.method198(var4, 0);
        }
        if (arg3 != 228) {
            return true;
        }
        class9 var6 = (class9) class159.method1013(arg0, arg2, arg1, field2998 == null ? (field2998 = method1423("vl")) : field2998);
        if (var6 != null) {
            var5 &= class29.method198(var6, 0);
        }
        class9 var7 = (class9) class327.method2118(arg0, arg2, arg1);
        if (var7 != null) {
            var5 &= class29.method198(var7, 0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILdi;I)V", line = 531)
    public final void method1396(int arg0, class64 arg1, int arg2) {
        field2993++;
        if (arg0 == -1 || !this.method1419()) {
            return;
        }
        if (arg2 >= -25) {
            field2989 = null;
        }
        class320 var4 = arg1.field731[arg0];
        class33 var5 = var4.field4568;
        for (int var6 = 0; var6 < var4.field4570; var6++) {
            short var7 = var4.field4564[var6];
            if (var5.field375[var7]) {
                if (var4.field4565[var6] != -1) {
                    this.method1398(0, 0, 0, 0);
                }
                this.method1398(var5.field385[var7], var4.field4563[var6], var4.field4560[var6], var4.field4556[var6]);
            }
        }
        this.method1378();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIZI[IILdi;Ldi;II)V", line = 574)
    public final void method1397(int arg0, int arg1, int arg2, boolean arg3, int arg4, int[] arg5, int arg6, class64 arg7, class64 arg8, int arg9, int arg10) {
        field2983++;
        if (arg6 == -1 || !this.method1419()) {
            return;
        }
        class320 var12 = arg7.field731[arg6];
        class33 var13 = var12.field4568;
        if (arg4 != 63) {
            return;
        }
        class320 var14 = null;
        if (arg8 != null) {
            var14 = arg8.field731[arg9];
            if (var14.field4568 != var13) {
                var14 = null;
            }
        }
        this.method1375(arg0, arg3, arg2, 0, var14, arg1, arg10, arg5, false, (boolean[]) null, var12, var13);
        this.method1378();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 628)
    public static void method1408(boolean arg0) {
        field2989 = null;
        field2994 = null;
        field2978 = null;
        if (arg0) {
            method1408(false);
        }
        field2985 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ID)V", line = 649)
    public static final void method1414(int arg0, double arg1) {
        field2986++;
        if (class183.field2495 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class327.field4649[var3] = var4 > 255 ? 255 : var4;
            }
            class183.field2495 = arg1;
        }
        if (arg0 >= -37) {
            method1393(71, 53, 85, 69);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()[Ldj;")
    public abstract class190[] method1374();

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(SS)V")
    public abstract void method1376(short arg0, short arg1);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()I")
    public abstract int method1377();

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()V")
    public abstract void method1378();

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lmm;)Lmm;")
    public abstract class152 method1379(class152 arg0);

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()I")
    public abstract int method1380();

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILnc;Z)Z")
    public abstract boolean method1382(int arg0, int arg1, class18 arg2, boolean arg3);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILgh;Lgh;III)V")
    public abstract void method1386(int arg0, int arg1, class327 arg2, class327 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public abstract void method1387(int arg0);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(III)V")
    public abstract void method1388(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1389(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public abstract void method1390(int arg0);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(SS)V")
    public abstract void method1392(short arg0, short arg1);

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "()V")
    public abstract void method1394();

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "()I")
    public abstract int method1395();

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIII)V")
    public abstract void method1398(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "()[Lqh;")
    public abstract class42[] method1399();

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "()I")
    public abstract int method1400();

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "()I")
    public abstract int method1401();

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "()Z")
    public abstract boolean method1402();

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public abstract void method1403(int arg0);

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
    public abstract void method1404(int arg0);

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "()I")
    public abstract int method1405();

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V")
    public abstract void method1406(int arg0);

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
    public abstract void method1407(int arg0);

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "()V")
    public abstract void method1409();

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "()I")
    public abstract int method1410();

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BIZ)Lbk;")
    public abstract class210 method1411(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lnc;Lkf;II)V")
    public abstract void method1412(class18 arg0, class136 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)V")
    public abstract void method1413(int arg0);

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "()I")
    public abstract int method1415();

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lnc;Lkf;I)V")
    public abstract void method1416(class18 arg0, class136 arg1, int arg2);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1417(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "()I")
    public abstract int method1418();

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "()Z")
    public abstract boolean method1419();

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(III)V")
    public abstract void method1420(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lbk;IIIZ)V")
    public abstract void method1421(class210 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "()I")
    public abstract int method1422();
}
