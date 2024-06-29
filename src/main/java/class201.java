import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class201 {

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lpg;")
    public static class492 field2832 = new class492(23, 3);

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lcm;")
    public static class449 field2835 = new class449(61, 7);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Lwi;")
    public static class340 field2836 = new class340(9, 0, 4, 1);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field2834;

    static {
        new class375("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 19)
    public static void method1397(byte arg0) {
        field2835 = null;
        field2832 = null;
        field2836 = null;
        if (arg0 != 18) {
            method1404(-51, 86);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIZLnl;ILnl;)V", line = 31)
    public final void method1398(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class472 arg6, int arg7, class472 arg8) {
        field2827++;
        if (~arg4 == arg3 || !this.method315()) {
            return;
        }
        class318 var10 = arg6.field6905[arg4];
        class183 var11 = var10.field4887;
        class318 var12 = null;
        if (arg8 != null) {
            var12 = arg8.field6905[arg2];
            if (var12.field4887 != var11) {
                var12 = null;
            }
        }
        this.method1400(arg5, arg0, 65535, (byte) 27, var12, var11, arg7, null, var10, false, arg1, null);
        this.method284();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 65)
    public static final void method1399(int arg0) {
        class339.field5359.method1015((byte) 127);
        if (arg0 != 30487) {
            method1397((byte) -87);
        }
        field2831++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIBLrq;Lmd;I[ILrq;ZI[Z)V", line = 80)
    private final void method1400(boolean arg0, int arg1, int arg2, byte arg3, class318 arg4, class183 arg5, int arg6, int[] arg7, class318 arg8, boolean arg9, int arg10, boolean[] arg11) {
        field2834++;
        if (arg4 == null || arg6 == 0) {
            for (int var38 = 0; var38 < arg8.field4881; var38++) {
                short var39 = arg8.field4882[var38];
                if (arg11 == null || arg11[var39] == arg9 || arg5.field2591[var39] == 0) {
                    short var40 = arg8.field4874[var38];
                    if (var40 != -1) {
                        this.method1401(0, 0, arg0, arg7, arg5.field2590[var40] & arg2, arg10, 0, arg5.field2592[var40], 16383, 0);
                    }
                    this.method1401(arg8.field4883[var38], arg5.field2591[var39], arg0, arg7, arg5.field2590[var39] & arg2, arg10, arg8.field4872[var38], arg5.field2592[var39], 16383, arg8.field4880[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg5.field2589; var15++) {
            boolean var16 = false;
            if (arg8.field4881 > var13 && arg8.field4882[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg4.field4881 && arg4.field4882[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg11 == null || arg9 == arg11[var15] || arg5.field2591[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg5.field2591[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var21 = arg8.field4880[var13];
                        var23 = arg8.field4874[var13];
                        var24 = arg8.field4883[var13];
                        var20 = arg8.field4878[var13];
                        var22 = arg8.field4872[var13];
                        var13++;
                    } else {
                        var20 = 0;
                        var21 = var18;
                        var22 = var18;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg4.field4874[var14];
                        var26 = arg4.field4878[var14];
                        var27 = arg4.field4872[var14];
                        var28 = arg4.field4883[var14];
                        var29 = arg4.field4880[var14];
                        var14++;
                    } else {
                        var26 = 0;
                        var25 = -1;
                        var28 = var18;
                        var27 = var18;
                        var29 = var18;
                    }
                    if (var23 != -1) {
                        this.method1401(0, 0, arg0, arg7, arg5.field2590[var23] & arg2, arg10, 0, arg5.field2592[var23], 16383, 0);
                    } else if (var25 != -1) {
                        this.method1401(0, 0, arg0, arg7, arg5.field2590[var25] & arg2, arg10, 0, arg5.field2592[var25], arg3 ^ 0x3FE4, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var20 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var33 = var21;
                        var35 = var24;
                        var34 = var22;
                    } else if (var19 == 2) {
                        int var30 = var27 - var22 & 0x3FFF;
                        int var31 = var29 - var21 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var28 - var24 & 0x3FFF;
                        var33 = arg6 * var31 / arg1 + var21 & 0x3FFF;
                        var34 = arg6 * var30 / arg1 + var22 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = var24 + (arg6 * var32 / arg1) & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var27 - var22 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var35 = 0;
                        var33 = 0;
                        var34 = arg6 * var37 / arg1 + var22 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var27 - var22 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = (var28 - var24) * arg6 / arg1 + var24;
                        var33 = (var29 - var21) * arg6 / arg1 + var21;
                        var34 = arg6 * var36 / arg1 + var22 & 0x3F;
                    } else {
                        var35 = (var28 - var24) * arg6 / arg1 + var24;
                        var34 = (var27 - var22) * arg6 / arg1 + var22;
                        var33 = (var29 - var21) * arg6 / arg1 + var21;
                    }
                    this.method1401(var35, var19, arg0, arg7, arg2 & arg5.field2590[var15], arg10, var34, arg5.field2592[var15], 16383, var33);
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
        if (arg3 != 27) {
            field2832 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZ[IIII[III)V", line = 291)
    private final void method1401(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        if (arg5 == 1) {
            if (arg1 == 0 || arg1 == 1) {
                int var13 = -arg6;
                arg6 = arg0;
                arg0 = var13;
            } else if (arg1 == 3) {
                int var12 = arg6;
                arg6 = arg0;
                arg0 = var12;
            } else if (arg1 == 2) {
                int var11 = arg6;
                arg6 = -arg0 & 0x3FFF;
                arg0 = var11 & 0x3FFF;
            }
        } else if (arg5 == 2) {
            if (arg1 == 0 || arg1 == 1) {
                arg6 = -arg6;
                arg0 = -arg0;
            } else if (arg1 == 2) {
                arg0 = -arg0 & 0x3FFF;
                arg6 = -arg6 & 0x3FFF;
            }
        } else if (arg5 == 3) {
            if (arg1 == 0 || arg1 == 1) {
                int var16 = arg6;
                arg6 = -arg0;
                arg0 = var16;
            } else if (arg1 == 3) {
                int var14 = arg6;
                arg6 = arg0;
                arg0 = var14;
            } else if (arg1 == 2) {
                int var15 = arg6;
                arg6 = arg0 & 0x3FFF;
                arg0 = -var15 & 0x3FFF;
            }
        }
        field2830++;
        if (arg8 != 16383) {
            field2832 = null;
        }
        if (arg4 == 65535) {
            this.method304(arg1, arg7, arg6, arg9, arg0, arg5, arg2);
        } else {
            this.method309(arg1, arg7, arg6, arg9, arg0, arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([ZIIILnl;ILnl;ILnl;IZILnl;II)V", line = 387)
    public final void method1402(boolean[] arg0, int arg1, int arg2, int arg3, class472 arg4, int arg5, class472 arg6, int arg7, class472 arg8, int arg9, boolean arg10, int arg11, class472 arg12, int arg13, int arg14) {
        field2829++;
        if (arg13 == -1) {
            return;
        }
        if (arg0 == null || arg1 == -1) {
            this.method1398(arg14, 0, arg7, 0, arg13, arg10, arg8, arg11, arg4);
        } else if (this.method315()) {
            class318 var16 = arg8.field6905[arg13];
            class183 var17 = var16.field4887;
            class318 var18 = null;
            if (arg4 != null) {
                var18 = arg4.field6905[arg7];
                if (var18.field4887 != var17) {
                    var18 = null;
                }
            }
            this.method1400(arg10, arg14, 65535, (byte) 27, var18, var17, arg11, null, var16, false, arg2, arg0);
            class318 var19 = arg6.field6905[arg1];
            class318 var20 = null;
            if (arg12 != null) {
                var20 = arg12.field6905[arg9];
                if (var20.field4887 != var17) {
                    var20 = null;
                }
            }
            this.method304(0, new int[0], 0, 0, 0, 0, arg10);
            this.method1400(arg10, arg3, 65535, (byte) 27, var20, var19.field4887, arg5, null, var19, true, 0, arg0);
            this.method284();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZLnl;IIILnl;II[I)V", line = 440)
    public final void method1403(int arg0, int arg1, boolean arg2, class472 arg3, int arg4, int arg5, int arg6, class472 arg7, int arg8, int arg9, int[] arg10) {
        field2825++;
        if (arg4 == -1 || !this.method315()) {
            return;
        }
        if (arg9 != 16383) {
            this.method289();
        }
        class318 var12 = arg3.field6905[arg4];
        class183 var13 = var12.field4887;
        class318 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field6905[arg0];
            if (var14.field4887 != var13) {
                var14 = null;
            }
        }
        this.method1400(arg2, arg1, arg6, (byte) 27, var14, var13, arg8, arg10, var12, false, arg5, null);
        this.method284();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V", line = 495)
    public static final void method1404(int arg0, int arg1) {
        field2833++;
        int var2 = -78 % ((arg1 + 49) / 51);
        if (class109.method719((byte) -124, arg0)) {
            class198.method1387(class59.field791[arg0], false, -1);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIILna;II)V", line = 512)
    public final void method1405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class206 arg6, int arg7, int arg8) {
        field2826++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg5 / 2;
        int var14 = -arg3 / 2;
        int var15 = arg6.method853(arg8 + var13, arg7 + var14);
        int var16 = arg5 / 2;
        int var17 = -arg3 / 2;
        int var18 = arg6.method853(arg8 + var16, arg7 - -var17);
        int var19 = -arg5 / 2;
        int var20 = arg3 / 2;
        int var21 = arg6.method853(arg8 + var19, arg7 + var20);
        int var22 = arg5 / 2;
        int var23 = arg3 / 2;
        int var24 = arg6.method853(arg8 + var22, arg7 + var23);
        int var25 = var18 <= var15 ? var18 : var15;
        int var26 = var21 >= var24 ? var24 : var21;
        if (arg1 != 28377) {
            this.method280((short) -16, (short) -20);
        }
        int var27 = var18 >= var24 ? var24 : var18;
        int var28 = var21 > var15 ? var15 : var21;
        if (arg3 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg4 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg4;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (arg4 < var29) {
                        var29 = arg4;
                    }
                }
                this.method293(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg5 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg0 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg0;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (var32 > arg0) {
                        var32 = arg0;
                    }
                }
                this.method287(var32);
            }
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg2;
        if (var34 != 0) {
            this.method307(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lnl;IB)V", line = 632)
    public final void method1406(class472 arg0, int arg1, byte arg2) {
        field2828++;
        if (arg2 != 65) {
            this.method287(108);
        }
        if (arg1 == -1 || !this.method315()) {
            return;
        }
        class318 var4 = arg0.field6905[arg1];
        class183 var5 = var4.field4887;
        for (int var6 = 0; var6 < var4.field4881; var6++) {
            short var7 = var4.field4882[var6];
            if (var5.field2586[var7]) {
                if (var4.field4874[var6] != -1) {
                    this.method281(0, 0, 0, 0);
                }
                this.method281(var5.field2591[var7], var4.field4872[var6], var4.field4880[var6], var4.field4883[var6]);
            }
        }
        this.method284();
    }

    @OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
    public abstract int method301();

    @OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
    public abstract void method277(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
    public abstract int method286();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lc;")
    public abstract class201 method292(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
    public abstract void method316(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lc;IIIZ)V")
    public abstract void method298(class201 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
    public abstract int method306();

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
    public abstract int method311();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILia;Z)Z")
    public abstract boolean method310(int arg0, int arg1, class23 arg2, boolean arg3);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
    public abstract void method287(int arg0);

    @OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
    public abstract void method297(int arg0);

    @OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
    public abstract int method289();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Lmn;II)V")
    public abstract void method291(class23 arg0, class159 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
    public abstract int method302();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    public abstract void method278(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()[Lil;")
    public abstract class439[] method283();

    @OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lj;)Lj;")
    public abstract class229 method285(class229 arg0);

    @OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
    public abstract int method282();

    @OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
    public abstract void method293(int arg0);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
    public abstract void method284();

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()Z")
    public abstract boolean method299();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Lmn;I)V")
    public abstract void method318(class23 arg0, class159 arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
    public abstract void method304(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
    public abstract void method312();

    @OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
    public abstract void method294(int arg0);

    @OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
    public abstract int method300();

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
    public abstract void method280(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
    public abstract void method281(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
    public abstract void method290(int arg0);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()[Le;")
    public abstract class525[] method296();

    @OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
    public abstract int method279();

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
    public abstract void method276(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
    public abstract void method303(int arg0);

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILna;Lna;III)V")
    public abstract void method305(int arg0, int arg1, class206 arg2, class206 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()V")
    public abstract void method295();

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
    public abstract void method307(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
    public abstract int method308();

    @OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
    public abstract boolean method315();

    @OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
    public abstract void method309(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);
}
