import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class394 {

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lkn;")
    public static class442 field5644 = new class442("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Lql;")
    public static class439 field5647;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILph;I)V")
    public final void method2490(int arg0, class386 arg1, int arg2) {
        field5641++;
        if (~arg2 == arg0 || !this.method1457()) {
            return;
        }
        class60 var4 = arg1.field5547[arg2];
        class180 var5 = var4.field820;
        for (int var6 = 0; var6 < var4.field823; var6++) {
            short var7 = var4.field818[var6];
            if (var5.field2474[var7]) {
                if (var4.field828[var6] != -1) {
                    this.method1434(0, 0, 0, 0);
                }
                this.method1434(var5.field2473[var7], var4.field819[var6], var4.field830[var6], var4.field821[var6]);
            }
        }
        this.method1423();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lmc;)Lmc;")
    public abstract class69 method1422(class69 arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
    public abstract int method1450();

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()I")
    public abstract int method1458();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILij;Lij;III)V")
    public abstract void method1435(int arg0, int arg1, class242 arg2, class242 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()I")
    public abstract int method1433();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lmj;IIIZ)V")
    public abstract void method1454(class394 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "()I")
    public abstract int method1429();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([ZIILph;IILph;ZLph;ILph;IIIZ)V")
    public final void method2491(boolean[] arg0, int arg1, int arg2, class386 arg3, int arg4, int arg5, class386 arg6, boolean arg7, class386 arg8, int arg9, class386 arg10, int arg11, int arg12, int arg13, boolean arg14) {
        field5648++;
        if (arg1 == -1) {
            return;
        }
        if (arg0 == null || arg2 == -1) {
            this.method2495(arg9, arg6, arg14, arg1, (byte) 113, arg10, 0, arg12, arg4);
        } else if (this.method1457()) {
            class60 var16 = arg6.field5547[arg1];
            class180 var17 = var16.field820;
            class60 var18 = null;
            if (arg10 != null) {
                var18 = arg10.field5547[arg9];
                if (var18.field820 != var17) {
                    var18 = null;
                }
            }
            class60 var19 = arg3.field5547[arg2];
            class60 var20 = null;
            if (arg8 != null) {
                var20 = arg8.field5547[arg5];
                if (var20.field820 != var17) {
                    var20 = null;
                }
            }
            this.method2497(108, false, arg0, 65535, arg14, 0, arg12, var16, (int[]) null, var17, arg4, var18);
            this.method1412(0, new int[0], 0, 0, 0, 0, arg14);
            this.method2497(-126, arg7, arg0, 65535, arg14, 0, arg13, var19, (int[]) null, var17, arg11, var20);
            this.method1423();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public abstract void method1451(int arg0);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public abstract void method1441(int arg0);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public abstract void method1461(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1412(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public abstract void method1455(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[II[IIIZII)V")
    private final void method2492(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (arg8 == 1) {
            if (arg5 == 0 || arg5 == 1) {
                int var16 = -arg0;
                arg0 = arg3;
                arg3 = var16;
            } else if (arg5 == 3) {
                int var14 = arg0;
                arg0 = arg3;
                arg3 = var14;
            } else if (arg5 == 2) {
                int var15 = arg0;
                arg0 = -arg3 & 0x3FFF;
                arg3 = var15 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg5 == 0 || arg5 == 1) {
                arg0 = -arg0;
                arg3 = -arg3;
            } else if (arg5 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg0 = -arg0 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg5 == 0 || arg5 == 1) {
                int var13 = arg0;
                arg0 = -arg3;
                arg3 = var13;
            } else if (arg5 == 3) {
                int var12 = arg0;
                arg0 = arg3;
                arg3 = var12;
            } else if (arg5 == 2) {
                int var11 = arg0;
                arg0 = arg3 & 0x3FFF;
                arg3 = -var11 & 0x3FFF;
            }
        }
        field5639++;
        int var17 = -44 % ((arg6 - 1) / 47);
        if (arg9 == 65535) {
            this.method1412(arg5, arg2, arg0, arg1, arg3, arg8, arg7);
        } else {
            this.method1445(arg5, arg2, arg0, arg1, arg3, arg7, arg9, arg4);
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public abstract void method1440(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1445(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILph;Lph;IIII[IZII)V")
    public final void method2493(int arg0, class386 arg1, class386 arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, boolean arg8, int arg9, int arg10) {
        field5640++;
        if (~arg0 == arg10 || !this.method1457()) {
            return;
        }
        class60 var12 = arg2.field5547[arg0];
        class180 var13 = var12.field820;
        class60 var14 = null;
        if (arg1 != null) {
            var14 = arg1.field5547[arg6];
            if (var14.field820 != var13) {
                var14 = null;
            }
        }
        this.method2497(arg10 - 122, false, (boolean[]) null, arg9, arg8, arg4, arg5, var12, arg7, var13, arg3, var14);
        this.method1423();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lic;Lvf;II)V")
    public abstract void method1464(class417 arg0, class84 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V")
    public abstract void method1415(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "()V")
    public abstract void method1467();

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)Ljava/lang/String;")
    public static final String method2494(int arg0) {
        field5645++;
        String var1 = "www";
        if (arg0 != 2) {
            return null;
        }
        if (class203.field2787 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class386.field5539 != null) {
            var2 = "/p=" + class386.field5539;
        }
        return class129.field1827 == 1 ? "http://" + var1 + ".stellardawn.com/l=" + class210.field2935 + "/a=" + class331.field4578 + var2 + "/" : "http://" + var1 + ".runescape.com/l=" + class210.field2935 + "/a=" + class331.field4578 + var2 + "/";
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "()I")
    public abstract int method1459();

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "()I")
    public abstract int method1414();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lic;Lvf;I)V")
    public abstract void method1416(class417 arg0, class84 arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "()I")
    public abstract int method1462();

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "()[Lwg;")
    public abstract class245[] method1456();

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "()I")
    public abstract int method1424();

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V")
    public abstract void method1453(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILph;ZIBLph;III)V")
    public final void method2495(int arg0, class386 arg1, boolean arg2, int arg3, byte arg4, class386 arg5, int arg6, int arg7, int arg8) {
        field5643++;
        if (arg3 == -1 || !this.method1457()) {
            return;
        }
        class60 var10 = arg1.field5547[arg3];
        class180 var11 = var10.field820;
        class60 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field5547[arg0];
            if (var12.field820 != var11) {
                var12 = null;
            }
        }
        this.method2497(-127, false, (boolean[]) null, 65535, arg2, arg6, arg7, var10, (int[]) null, var11, arg8, var12);
        int var13 = 114 / ((arg4 + 55) / 49);
        this.method1423();
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public abstract void method1413(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(SS)V")
    public abstract void method1452(short arg0, short arg1);

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "()V")
    public abstract void method1436();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lij;IIIIII)V")
    public final void method2496(class242 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5646++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg4 / 2;
        int var12 = -arg2 / 2;
        int var13 = arg0.method725(arg6 + var11, arg1 + var12);
        int var14 = arg4 / 2;
        int var15 = -arg2 / 2;
        int var16 = arg0.method725(arg6 + var14, arg1 + var15);
        int var17 = -arg4 / 2;
        int var18 = arg2 / 2;
        int var19 = arg0.method725(arg6 + var17, arg1 + var18);
        int var20 = arg4 / 2;
        int var21 = arg2 / 2;
        int var22 = arg0.method725(arg6 + var20, arg1 + var21);
        int var23 = var16 > var13 ? var13 : var16;
        int var24 = var22 > var19 ? var19 : var22;
        int var25 = var22 > var16 ? var16 : var22;
        if (arg2 != 0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method1413(var26);
            }
        }
        int var27 = var13 >= var19 ? var19 : var13;
        int var28 = var13 + var22;
        if (arg4 != 0) {
            int var29 = (int) (Math.atan2((double) (var27 - var25), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method1427(var29);
            }
        }
        if (arg3 <= 68) {
            this.method1413(-30);
        }
        if (var28 > var16 + var19) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg5;
        if (var30 != 0) {
            this.method1455(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ[ZIZIILbm;[ILwb;ILbm;)V")
    private final void method2497(int arg0, boolean arg1, boolean[] arg2, int arg3, boolean arg4, int arg5, int arg6, class60 arg7, int[] arg8, class180 arg9, int arg10, class60 arg11) {
        field5649++;
        int var13 = 49 % ((-arg0 - 78) / 44);
        if (arg11 == null || arg10 == 0) {
            for (int var38 = 0; var38 < arg7.field823; var38++) {
                short var39 = arg7.field818[var38];
                if (arg2 == null || arg1 == arg2[var39] || arg9.field2473[var39] == 0) {
                    short var40 = arg7.field828[var38];
                    if (var40 != -1) {
                        this.method2492(0, 0, arg9.field2468[var40], 0, arg8, 0, -63, arg4, arg5, arg3 & arg9.field2470[var40]);
                    }
                    this.method2492(arg7.field819[var38], arg7.field830[var38], arg9.field2468[var39], arg7.field821[var38], arg8, arg9.field2473[var39], 50, arg4, arg5, arg9.field2470[var39] & arg3);
                }
            }
            return;
        }
        int var14 = 0;
        int var15 = 0;
        for (int var16 = 0; var16 < arg9.field2472; var16++) {
            boolean var17 = false;
            if (arg7.field823 > var14 && arg7.field818[var14] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (var15 < arg11.field823 && arg11.field818[var15] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg2 == null || arg2[var16] == arg1 || arg9.field2473[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg9.field2473[var16];
                    if (var20 == 3) {
                        var19 = 128;
                    }
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    short var25;
                    if (var17) {
                        var22 = arg7.field819[var14];
                        var25 = arg7.field830[var14];
                        var21 = arg7.field821[var14];
                        var23 = arg7.field828[var14];
                        var24 = arg7.field829[var14];
                        var14++;
                    } else {
                        var21 = var19;
                        var22 = var19;
                        var23 = -1;
                        var24 = 0;
                        var25 = var19;
                    }
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    short var30;
                    if (var18) {
                        var26 = arg11.field830[var15];
                        var27 = arg11.field819[var15];
                        var28 = arg11.field821[var15];
                        var29 = arg11.field829[var15];
                        var30 = arg11.field828[var15];
                        var15++;
                    } else {
                        var30 = -1;
                        var28 = var19;
                        var26 = var19;
                        var27 = var19;
                        var29 = 0;
                    }
                    if (var23 != -1) {
                        this.method2492(0, 0, arg9.field2468[var23], 0, arg8, 0, -99, arg4, arg5, arg3 & arg9.field2470[var23]);
                    } else if (var30 != -1) {
                        this.method2492(0, 0, arg9.field2468[var30], 0, arg8, 0, -58, arg4, arg5, arg9.field2470[var30] & arg3);
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var24 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var36 = var21;
                        var35 = var25;
                        var34 = var22;
                    } else if (var20 == 2) {
                        int var31 = var27 - var22 & 0x3FFF;
                        int var32 = var26 - var25 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        int var33 = var28 - var21 & 0x3FFF;
                        var34 = arg10 * var31 / arg6 + var22 & 0x3FFF;
                        var35 = arg10 * var32 / arg6 + var25 & 0x3FFF;
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var36 = arg10 * var33 / arg6 + var21 & 0x3FFF;
                    } else if (var20 == 7) {
                        int var37 = var27 - var22 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var35 = var25 + ((var26 - var25) * arg10 / arg6);
                        var34 = arg10 * var37 / arg6 + var22 & 0x3F;
                        var36 = (var28 - var21) * arg10 / arg6 + var21;
                    } else {
                        var34 = (var27 - var22) * arg10 / arg6 + var22;
                        var35 = (var26 - var25) * arg10 / arg6 + var25;
                        var36 = var21 + ((var28 - var21) * arg10 / arg6);
                    }
                    this.method2492(var34, var35, arg9.field2468[var16], var36, arg8, var20, -108, arg4, arg5, arg3 & arg9.field2470[var16]);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var18) {
                        var15++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "()I")
    public abstract int method1426();

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "()[Lrf;")
    public abstract class48[] method1437();

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "()V")
    public abstract void method1423();

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "()Z")
    public abstract boolean method1457();

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)V")
    public static void method2498(int arg0) {
        field5647 = null;
        field5644 = null;
        if (arg0 >= -126) {
            field5647 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "()I")
    public abstract int method1443();

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
    public abstract void method1427(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V")
    public abstract void method1434(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIZ)Lmj;")
    public abstract class394 method1430(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([[B[[B[BI[I[IIB)I")
    public static final int method2499(byte[][] arg0, byte[][] arg1, byte[] arg2, int arg3, int[] arg4, int[] arg5, int arg6, byte arg7) {
        field5642++;
        int var8 = arg4[arg6];
        int var9 = arg5[arg6] + var8;
        int var10 = arg4[arg3];
        int var11 = var10 + arg5[arg3];
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg2[arg6] & 0xFF;
        if ((arg2[arg3] & 0xFF) < var14) {
            var14 = arg2[arg3] & 0xFF;
        }
        byte[] var15 = arg0[arg6];
        byte[] var16 = arg1[arg3];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        int var19 = 10 / ((arg7 + 37) / 44);
        for (int var20 = var12; var20 < var13; var20++) {
            int var21 = var15[var17++] + var16[var18++];
            if (var21 < var14) {
                var14 = var21;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILic;Z)Z")
    public abstract boolean method1465(int arg0, int arg1, class417 arg2, boolean arg3);

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "()Z")
    public abstract boolean method1468();

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(SS)V")
    public abstract void method1460(short arg0, short arg1);

    static {
        new class442("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field5647 = new class439();
    }
}
