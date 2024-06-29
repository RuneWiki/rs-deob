import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class374 {

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lbj;")
    public static class162 field5475 = new class162(6, -1);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lbj;")
    public static class162 field5482 = new class162(55, 4);

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Los;")
    public static class309 field5484 = new class309("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lph;")
    public static class459 field5483;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
    public abstract boolean method740();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method2293(int arg0) {
        field5482 = null;
        if (arg0 != 0) {
            field5484 = null;
        }
        field5483 = null;
        field5475 = null;
        field5484 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lnj;ZZZLeb;[II[ZIIILnj;)V")
    private final void method2294(class164 arg0, boolean arg1, boolean arg2, boolean arg3, class444 arg4, int[] arg5, int arg6, boolean[] arg7, int arg8, int arg9, int arg10, class164 arg11) {
        field5478++;
        if (arg11 == null || arg6 == 0) {
            for (int var38 = 0; var38 < arg0.field2625; var38++) {
                short var39 = arg0.field2630[var38];
                if (arg7 == null || arg1 == arg7[var39] || arg4.field6598[var39] == 0) {
                    short var40 = arg0.field2626[var38];
                    if (var40 != -1) {
                        this.method2298(0, arg5, 0, arg8, arg4.field6603[var40] & arg9, 0, 0, arg3, 65535, arg4.field6599[var40]);
                    }
                    this.method2298(arg4.field6598[var39], arg5, arg0.field2635[var38], arg8, arg9 & arg4.field6603[var39], arg0.field2632[var38], arg0.field2621[var38], arg3, 65535, arg4.field6599[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (!arg2) {
            field5475 = null;
        }
        for (int var15 = 0; var15 < arg4.field6602; var15++) {
            boolean var16 = false;
            if (var13 < arg0.field2625 && arg0.field2630[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg11.field2625 && arg11.field2630[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg7 == null || arg7[var15] == arg1 || arg4.field6598[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg4.field6598[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var20 = arg0.field2632[var13];
                        var21 = arg0.field2626[var13];
                        var22 = arg0.field2621[var13];
                        var23 = arg0.field2635[var13];
                        var24 = arg0.field2622[var13];
                        var13++;
                    } else {
                        var21 = -1;
                        var23 = var18;
                        var20 = var18;
                        var22 = var18;
                        var24 = 0;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg11.field2632[var14];
                        var26 = arg11.field2635[var14];
                        var27 = arg11.field2622[var14];
                        var28 = arg11.field2626[var14];
                        var29 = arg11.field2621[var14];
                        var14++;
                    } else {
                        var26 = var18;
                        var27 = 0;
                        var29 = var18;
                        var28 = -1;
                        var25 = var18;
                    }
                    int var30;
                    int var31;
                    int var32;
                    if ((var24 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var32 = var22;
                        var31 = var20;
                        var30 = var23;
                    } else if (var19 == 2) {
                        int var35 = var25 - var20 & 0x3FFF;
                        int var36 = var29 - var22 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        int var37 = var26 - var23 & 0x3FFF;
                        var31 = arg6 * var35 / arg10 + var20 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var32 = arg6 * var36 / arg10 + var22 & 0x3FFF;
                        var30 = var23 + (arg6 * var37 / arg10) & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var25 - var20 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var31 = arg6 * var34 / arg10 + var20 & 0x3FFF;
                        var30 = 0;
                        var32 = 0;
                    } else if (var19 == 7) {
                        int var33 = var25 - var20 & 0x3F;
                        if (var33 >= 32) {
                            var33 -= 64;
                        }
                        var31 = var20 + (arg6 * var33 / arg10) & 0x3F;
                        var32 = (var29 - var22) * arg6 / arg10 + var22;
                        var30 = var23 + ((var26 - var23) * arg6 / arg10);
                    } else {
                        var30 = (var26 - var23) * arg6 / arg10 + var23;
                        var31 = (var25 - var20) * arg6 / arg10 + var20;
                        var32 = var22 + ((var29 - var22) * arg6 / arg10);
                    }
                    if (var21 != -1) {
                        this.method2298(0, arg5, 0, arg8, arg9 & arg4.field6603[var21], 0, 0, arg3, 65535, arg4.field6599[var21]);
                    } else if (var28 != -1) {
                        this.method2298(0, arg5, 0, arg8, arg4.field6603[var28] & arg9, 0, 0, arg3, 65535, arg4.field6599[var28]);
                    }
                    this.method2298(var19, arg5, var30, arg8, arg4.field6603[var15] & arg9, var31, var32, arg3, 65535, arg4.field6599[var15]);
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

    @OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
    public abstract int method768();

    @OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
    public abstract void method769(int arg0);

    @OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
    public abstract int method729();

    @OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
    public abstract void method754(int arg0);

    @OriginalMember(owner = "client!e", name = "EA", descriptor = "(Li;)Li;")
    public abstract class31 method731(class31 arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;IIIZ)V")
    public abstract void method741(class374 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
    public abstract void method726();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public abstract void method756(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILei;I)V")
    public final void method2295(int arg0, class119 arg1, int arg2) {
        field5472++;
        if (arg2 == -1 || !this.method740()) {
            return;
        }
        class164 var4 = arg1.field2081[arg2];
        class444 var5 = var4.field2631;
        for (int var6 = arg0; var6 < var4.field2625; var6++) {
            short var7 = var4.field2630[var6];
            if (var5.field6601[var7]) {
                if (var4.field2626[var6] != -1) {
                    this.method767(0, 0, 0, 0);
                }
                this.method767(var5.field6598[var7], var4.field2632[var6], var4.field2621[var6], var4.field2635[var6]);
            }
        }
        this.method758();
    }

    @OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
    public abstract void method738(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
    public abstract void method747(int arg0);

    @OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
    public abstract void method725(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
    public abstract void method718();

    @OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
    public abstract void method755(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
    public abstract int method750();

    @OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
    public abstract void method717(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
    public abstract int method722();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lpr;I)V")
    public abstract void method723(class124 arg0, class313 arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
    public abstract int method736();

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
    public abstract int method733();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZIIILei;ILei;II)V")
    public final void method2296(boolean arg0, int arg1, int arg2, int arg3, class119 arg4, int arg5, class119 arg6, int arg7, int arg8) {
        field5473++;
        if (arg8 == -1 || !this.method740()) {
            return;
        }
        class164 var10 = arg4.field2081[arg8];
        class444 var11 = var10.field2631;
        class164 var12 = null;
        if (arg6 != null) {
            var12 = arg6.field2081[arg5];
            if (var12.field2631 != var11) {
                var12 = null;
            }
        }
        if (arg7 != 16383) {
            this.method763(127, -32, null, false);
        }
        this.method2294(var10, false, true, arg0, var11, null, arg3, null, arg1, 65535, arg2, var12);
        this.method758();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lda;II[IIZ)Lal;")
    public static final class67 method2297(class44 arg0, int arg1, int arg2, int[] arg3, int arg4, boolean arg5) {
        if (arg4 != 34037) {
            field5484 = null;
        }
        field5474++;
        if (!arg0.field878 && (!class388.method2381(arg2, 122) || !class388.method2381(arg1, 98))) {
            return arg0.field898 ? new class67(arg0, 34037, arg2, arg1, arg5, arg3) : new class67(arg0, arg2, arg1, class184.method1256(arg2, (byte) 120), class184.method1256(arg1, (byte) 126), arg3);
        } else {
            return new class67(arg0, 3553, arg2, arg1, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Le;")
    public abstract class374 method746(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
    public abstract int method751();

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()[Lfi;")
    public abstract class393[] method737();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[IIIIIIZI[I)V")
    private final void method2298(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int[] arg9) {
        field5477++;
        if (arg3 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = -arg5;
                arg5 = arg2;
                arg2 = var13;
            } else if (arg0 == 3) {
                int var12 = arg5;
                arg5 = arg2;
                arg2 = var12;
            } else if (arg0 == 2) {
                int var11 = arg5;
                arg5 = -arg2 & 0x3FFF;
                arg2 = var11 & 0x3FFF;
            }
        } else if (arg3 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg2 = -arg2;
                arg5 = -arg5;
            } else if (arg0 == 2) {
                arg2 = -arg2 & 0x3FFF;
                arg5 = -arg5 & 0x3FFF;
            }
        } else if (arg3 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = arg5;
                arg5 = -arg2;
                arg2 = var16;
            } else if (arg0 == 3) {
                int var14 = arg5;
                arg5 = arg2;
                arg2 = var14;
            } else if (arg0 == 2) {
                int var15 = arg5;
                arg5 = arg2 & 0x3FFF;
                arg2 = -var15 & 0x3FFF;
            }
        }
        if (arg4 == arg8) {
            this.method724(arg0, arg9, arg5, arg6, arg2, arg3, arg7);
        } else {
            this.method727(arg0, arg9, arg5, arg6, arg2, arg7, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
    public abstract void method758();

    @OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public abstract void method727(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()Z")
    public abstract boolean method761();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lpr;II)V")
    public abstract void method721(class124 arg0, class313 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
    public abstract void method749(int arg0);

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()[Lkh;")
    public abstract class13[] method720();

    @OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
    public abstract void method732(int arg0);

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
    public abstract int method728();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILya;IIIII)V")
    public final void method2299(int arg0, int arg1, int arg2, class38 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5476++;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg5 / 2;
        int var14 = -arg4 / 2;
        int var15 = arg3.method186(arg6 + var13, arg1 + var14);
        int var16 = arg5 / 2;
        int var17 = -arg4 / 2;
        int var18 = arg3.method186(arg6 + var16, arg1 + var17);
        int var19 = -arg5 / 2;
        int var20 = arg4 / 2;
        int var21 = arg3.method186(arg6 + var19, arg1 - -var20);
        int var22 = arg5 / 2;
        int var23 = arg4 / 2;
        int var24 = arg3.method186(arg6 + var22, arg1 + var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var24 > var18 ? var18 : var24;
        int var28 = var21 <= var15 ? var21 : var15;
        if (arg4 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg0 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg0;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (var29 > arg0) {
                        var29 = arg0;
                    }
                }
                this.method725(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg5 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg8 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg8;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (var32 > arg8) {
                        var32 = arg8;
                    }
                }
                this.method754(var32);
            }
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg2;
        if (var34 != 0) {
            this.method730(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
    public abstract int method744();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[ZLei;IBLei;IIIIZILei;Lei;I)V")
    public final void method2300(int arg0, boolean[] arg1, class119 arg2, int arg3, byte arg4, class119 arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, class119 arg12, class119 arg13, int arg14) {
        field5480++;
        if (arg9 == -1) {
            return;
        }
        if (arg1 == null || arg11 == -1) {
            this.method2296(arg10, 0, arg6, arg0, arg2, arg3, arg5, arg4 ^ 0xFFFFC046, arg9);
        } else if (this.method740()) {
            class164 var16 = arg2.field2081[arg9];
            class444 var17 = var16.field2631;
            class164 var18 = null;
            if (arg4 != -71) {
                this.method754(43);
            }
            if (arg5 != null) {
                var18 = arg5.field2081[arg3];
                if (var18.field2631 != var17) {
                    var18 = null;
                }
            }
            this.method2294(var16, false, true, arg10, var17, null, arg0, arg1, 0, 65535, arg6, var18);
            class164 var19 = arg13.field2081[arg11];
            class164 var20 = null;
            if (arg12 != null) {
                var20 = arg12.field2081[arg8];
                if (var20.field2631 != var17) {
                    var20 = null;
                }
            }
            this.method724(0, new int[0], 0, 0, 0, 0, arg10);
            this.method2294(var19, true, true, arg10, var19.field2631, null, arg7, arg1, 0, 65535, arg14, var20);
            this.method758();
        }
    }

    @OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
    public abstract void method767(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method763(int arg0, int arg1, class124 arg2, boolean arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lda;IIIIB)Lal;")
    public static final class67 method2301(class44 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 3) {
            return null;
        }
        field5481++;
        if (!arg0.field878 && (!class388.method2381(arg1, 100) || !class388.method2381(arg2, arg5 ^ 0x74))) {
            return arg0.field898 ? new class67(arg0, 34037, arg4, arg3, arg1, arg2, true) : new class67(arg0, arg4, arg3, arg1, arg2, class184.method1256(arg1, (byte) 85), class184.method1256(arg2, (byte) 82), true);
        } else {
            return new class67(arg0, 3553, arg4, arg3, arg1, arg2, true);
        }
    }

    @OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
    public abstract void method724(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lei;I[IIIZILei;IZI)V")
    public final void method2302(class119 arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5, int arg6, class119 arg7, int arg8, boolean arg9, int arg10) {
        field5479++;
        if (arg8 == -1 || !this.method740()) {
            return;
        }
        class164 var12 = arg0.field2081[arg8];
        class444 var13 = var12.field2631;
        class164 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field2081[arg3];
            if (var14.field2631 != var13) {
                var14 = null;
            }
        }
        this.method2294(var12, arg9, true, arg5, var13, arg2, arg4, null, arg1, arg6, arg10, var14);
        this.method758();
    }

    @OriginalMember(owner = "client!e", name = "da", descriptor = "(IILya;Lya;III)V")
    public abstract void method764(int arg0, int arg1, class38 arg2, class38 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public abstract void method730(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
    public abstract void method748(int arg0);

    @OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
    public abstract int method716();
}
