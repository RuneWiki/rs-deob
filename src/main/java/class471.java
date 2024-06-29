import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class471 {

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Z")
    public static boolean field6952 = false;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field6950 = 0;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lbg;")
    public static class324 field6961;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "[[I")
    public static int[][] field6962;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lc;Lmi;II)V")
    public abstract void method464(class122 arg0, class341 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "(I)V")
    public abstract void method447(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()[Lbu;")
    public abstract class17[] method454();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZLjava/awt/Component;)Ljn;")
    public static final class503 method2848(int arg0, boolean arg1, Component arg2) {
        field6953++;
        int var3 = 65 % ((11 - arg0) / 58);
        return new class181(arg2, arg1);
    }

    @OriginalMember(owner = "client!t", name = "MA", descriptor = "()I")
    public abstract int method463();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZIILpt;Lpt;II)V")
    public final void method2849(int arg0, int arg1, boolean arg2, int arg3, int arg4, class367 arg5, class367 arg6, int arg7, int arg8) {
        field6949++;
        if (arg3 == -1 || !this.method436()) {
            return;
        }
        class298 var10 = arg5.field5463[arg3];
        class501 var11 = var10.field4272;
        class298 var12 = null;
        if (arg6 != null) {
            var12 = arg6.field5463[arg4];
            if (var12.field4272 != var11) {
                var12 = null;
            }
        }
        this.method2854(var12, null, var11, arg7, arg2, arg0, -1707, var10, false, arg1, 65535, null);
        if (arg8 != 0) {
            field6963 = -119;
        }
        this.method440();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIILta;III)V")
    public final void method2850(int arg0, int arg1, int arg2, int arg3, int arg4, class142 arg5, int arg6, int arg7, int arg8) {
        field6955++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        if (arg0 != 16384) {
            field6950 = 101;
        }
        int var13 = -arg6 / 2;
        int var14 = -arg3 / 2;
        int var15 = arg5.method426(arg1 + var13, arg2 + var14);
        int var16 = arg6 / 2;
        int var17 = -arg3 / 2;
        int var18 = arg5.method426(arg1 + var16, arg2 + var17);
        int var19 = -arg6 / 2;
        int var20 = arg3 / 2;
        int var21 = arg5.method426(arg1 + var19, arg2 + var20);
        int var22 = arg6 / 2;
        int var23 = arg3 / 2;
        int var24 = arg5.method426(arg1 + var22, arg2 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
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
                    } else if (var29 > arg4) {
                        var29 = arg4;
                    }
                }
                this.method447(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg6 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg7 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg7;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (var32 > arg7) {
                        var32 = arg7;
                    }
                }
                this.method455(var32);
            }
        }
        if (var31 > (var18 + var21)) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg8;
        if (var34 != 0) {
            this.method446(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!t", name = "PA", descriptor = "()I")
    public abstract int method453();

    @OriginalMember(owner = "client!t", name = "JA", descriptor = "(III)V")
    public abstract void method446(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "E", descriptor = "(I)V")
    public abstract void method468(int arg0);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()[Lpf;")
    public abstract class410[] method444();

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()V")
    public abstract void method441();

    @OriginalMember(owner = "client!t", name = "IA", descriptor = "()V")
    public abstract void method469();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BIZ)Lt;")
    public abstract class471 method458(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[IIIIZI[III)V")
    private final void method2851(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7, int arg8, int arg9) {
        if (arg6 != 3) {
            this.method465(-15);
        }
        field6959++;
        if (arg4 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = -arg9;
                arg9 = arg2;
                arg2 = var16;
            } else if (arg0 == 3) {
                int var15 = arg9;
                arg9 = arg2;
                arg2 = var15;
            } else if (arg0 == 2) {
                int var14 = arg9;
                arg9 = -arg2 & 0x3FFF;
                arg2 = var14 & 0x3FFF;
            }
        } else if (arg4 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg2 = -arg2;
                arg9 = -arg9;
            } else if (arg0 == 2) {
                arg2 = -arg2 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg4 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = arg9;
                arg9 = -arg2;
                arg2 = var13;
            } else if (arg0 == 3) {
                int var11 = arg9;
                arg9 = arg2;
                arg2 = var11;
            } else if (arg0 == 2) {
                int var12 = arg9;
                arg9 = arg2 & 0x3FFF;
                arg2 = -var12 & 0x3FFF;
            }
        }
        if (arg3 == 65535) {
            this.method471(arg0, arg7, arg9, arg8, arg2, arg4, arg5);
        } else {
            this.method435(arg0, arg7, arg9, arg8, arg2, arg5, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lc;Lmi;I)V")
    public abstract void method457(class122 arg0, class341 arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "XA", descriptor = "(I[IIIIIZ)V")
    public abstract void method471(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "()I")
    public abstract int method460();

    @OriginalMember(owner = "client!t", name = "M", descriptor = "(I[IIIIZI[I)V")
    public abstract void method435(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(Lba;)Lba;")
    public abstract class263 method449(class263 arg0);

    @OriginalMember(owner = "client!t", name = "P", descriptor = "()I")
    public abstract int method459();

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()Z")
    public abstract boolean method461();

    @OriginalMember(owner = "client!t", name = "HA", descriptor = "()I")
    public abstract int method456();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lt;IIIZ)V")
    public abstract void method437(class471 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!t", name = "NA", descriptor = "()I")
    public abstract int method450();

    @OriginalMember(owner = "client!t", name = "m", descriptor = "()I")
    public abstract int method433();

    @OriginalMember(owner = "client!t", name = "BA", descriptor = "(SS)V")
    public abstract void method467(short arg0, short arg1);

    @OriginalMember(owner = "client!t", name = "R", descriptor = "(I)V")
    public abstract void method455(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILpt;)V")
    public final void method2852(int arg0, int arg1, class367 arg2) {
        field6957++;
        if (arg1 == -1 || !this.method436()) {
            return;
        }
        class298 var4 = arg2.field5463[arg1];
        class501 var5 = var4.field4272;
        for (int var6 = 0; var6 < var4.field4280; var6++) {
            short var7 = var4.field4276[var6];
            if (var5.field7427[var7]) {
                if (var4.field4275[var6] != -1) {
                    this.method439(0, 0, 0, 0);
                }
                this.method439(var5.field7425[var7], var4.field4270[var6], var4.field4274[var6], var4.field4283[var6]);
            }
        }
        this.method440();
        if (arg0 != -5561) {
            this.method2854(null, null, null, 91, true, 12, 122, null, false, 73, -73, null);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
    public abstract void method434(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public abstract void method438(int arg0);

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(IILta;Lta;III)V")
    public abstract void method473(int arg0, int arg1, class142 arg2, class142 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "aa", descriptor = "(I)V")
    public abstract void method452(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method443(int arg0, int arg1, class122 arg2, boolean arg3);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 >= class72.field992 && arg6 <= class126.field1842 && class72.field992 <= arg4 && class126.field1842 >= arg4 && class72.field992 <= arg1 && class126.field1842 >= arg1 && class72.field992 <= arg0 && class126.field1842 >= arg0 && field6963 <= arg8 && arg8 <= class401.field5947 && arg2 >= field6963 && class401.field5947 >= arg2 && field6963 <= arg5 && arg5 <= class401.field5947 && arg3 >= field6963 && class401.field5947 >= arg3) {
            class369.method2279(arg8, arg7, arg3, arg9 ^ 0x1D, arg2, arg5, arg0, arg4, arg6, arg1);
        } else {
            class386.method2350(arg0, arg7, arg4, arg5, arg6, arg2, (byte) 72, arg3, arg1, arg8);
        }
        field6954++;
        if (arg9 != -1) {
            field6960 = 67;
        }
    }

    @OriginalMember(owner = "client!t", name = "UA", descriptor = "(I)V")
    public abstract void method465(int arg0);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "(III)V")
    public abstract void method462(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "(I)V")
    public abstract void method451(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lgr;[ZLnk;IZIILgr;ZII[I)V")
    private final void method2854(class298 arg0, boolean[] arg1, class501 arg2, int arg3, boolean arg4, int arg5, int arg6, class298 arg7, boolean arg8, int arg9, int arg10, int[] arg11) {
        field6956++;
        if (arg0 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg7.field4280; var38++) {
                short var39 = arg7.field4276[var38];
                if (arg1 == null || arg1[var39] == arg8 || arg2.field7425[var39] == 0) {
                    short var40 = arg7.field4275[var38];
                    if (var40 != -1) {
                        this.method2851(0, arg11, 0, arg2.field7429[var40] & arg10, arg5, arg4, 3, arg2.field7431[var40], 0, 0);
                    }
                    this.method2851(arg2.field7425[var39], arg11, arg7.field4283[var38], arg10 & arg2.field7429[var39], arg5, arg4, arg6 ^ 0xFFFFF956, arg2.field7431[var39], arg7.field4274[var38], arg7.field4270[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        if (arg6 != -1707) {
            field6960 = -4;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg2.field7423; var15++) {
            boolean var16 = false;
            if (var13 < arg7.field4280 && arg7.field4276[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg0.field4280 > var14 && arg0.field4276[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg1 == null || arg1[var15] == arg8 || arg2.field7425[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg2.field7425[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg7.field4274[var13];
                        var21 = arg7.field4281[var13];
                        var22 = arg7.field4283[var13];
                        var23 = arg7.field4275[var13];
                        var24 = arg7.field4270[var13];
                        var13++;
                    } else {
                        var21 = 0;
                        var24 = var18;
                        var22 = var18;
                        var23 = -1;
                        var20 = var18;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var27 = arg0.field4275[var14];
                        var29 = arg0.field4283[var14];
                        var26 = arg0.field4274[var14];
                        var28 = arg0.field4270[var14];
                        var25 = arg0.field4281[var14];
                        var14++;
                    } else {
                        var25 = 0;
                        var26 = var18;
                        var27 = -1;
                        var28 = var18;
                        var29 = var18;
                    }
                    if (var23 != -1) {
                        this.method2851(0, arg11, 0, arg2.field7429[var23] & arg10, arg5, arg4, arg6 ^ 0xFFFFF956, arg2.field7431[var23], 0, 0);
                    } else if (var27 != -1) {
                        this.method2851(0, arg11, 0, arg10 & arg2.field7429[var27], arg5, arg4, 3, arg2.field7431[var27], 0, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var34 = var20;
                        var33 = var24;
                        var35 = var22;
                    } else if (var19 == 2) {
                        int var30 = var28 - var24 & 0x3FFF;
                        int var31 = var26 - var20 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var29 - var22 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        var33 = arg3 * var30 / arg9 + var24 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg3 * var31 / arg9 + var20 & 0x3FFF;
                        var35 = arg3 * var32 / arg9 + var22 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var28 - var24 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var35 = 0;
                        var34 = 0;
                        var33 = arg3 * var36 / arg9 + var24 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var37 = var28 - var24 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var34 = (var26 - var20) * arg3 / arg9 + var20;
                        var35 = (var29 - var22) * arg3 / arg9 + var22;
                        var33 = arg3 * var37 / arg9 + var24 & 0x3F;
                    } else {
                        var35 = (var29 - var22) * arg3 / arg9 + var22;
                        var34 = var20 + ((var26 - var20) * arg3 / arg9);
                        var33 = var24 + ((var28 - var24) * arg3 / arg9);
                    }
                    this.method2851(var19, arg11, var35, arg2.field7429[var15] & arg10, arg5, arg4, 3, arg2.field7431[var15], var34, var33);
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

    @OriginalMember(owner = "client!t", name = "I", descriptor = "(SS)V")
    public abstract void method445(short arg0, short arg1);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILpt;[IZIIIILpt;II)V")
    public final void method2855(int arg0, class367 arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class367 arg8, int arg9, int arg10) {
        field6951++;
        if (arg5 == -1 || !this.method436()) {
            return;
        }
        class298 var12 = arg8.field5463[arg5];
        class501 var13 = var12.field4272;
        int var14 = 10 % ((83 - arg6) / 43);
        class298 var15 = null;
        if (arg1 != null) {
            var15 = arg1.field5463[arg0];
            if (var15.field4272 != var13) {
                var15 = null;
            }
        }
        this.method2854(var15, null, var13, arg9, arg3, arg4, -1707, var12, false, arg7, arg10, arg2);
        this.method440();
    }

    @OriginalMember(owner = "client!t", name = "WA", descriptor = "()I")
    public abstract int method448();

    @OriginalMember(owner = "client!t", name = "D", descriptor = "()I")
    public abstract int method432();

    @OriginalMember(owner = "client!t", name = "w", descriptor = "()Z")
    public abstract boolean method436();

    @OriginalMember(owner = "client!t", name = "j", descriptor = "()V")
    public abstract void method440();

    @OriginalMember(owner = "client!t", name = "U", descriptor = "()I")
    public abstract int method470();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method2856(byte arg0) {
        field6962 = null;
        if (arg0 != 55) {
            method2856((byte) -2);
        }
        field6961 = null;
    }

    @OriginalMember(owner = "client!t", name = "N", descriptor = "(IIII)V")
    public abstract void method439(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILpt;ZIIILpt;Lpt;I[ZLpt;III)V")
    public final void method2857(int arg0, int arg1, class367 arg2, boolean arg3, int arg4, int arg5, int arg6, class367 arg7, class367 arg8, int arg9, boolean[] arg10, class367 arg11, int arg12, int arg13, int arg14) {
        field6958++;
        if (arg0 == -1) {
            return;
        }
        if (arg14 > -60) {
            field6962 = null;
        }
        if (arg10 == null || arg6 == -1) {
            this.method2849(0, arg1, arg3, arg0, arg13, arg8, arg11, arg12, 0);
        } else if (this.method436()) {
            class298 var16 = arg8.field5463[arg0];
            class501 var17 = var16.field4272;
            class298 var18 = null;
            if (arg11 != null) {
                var18 = arg11.field5463[arg13];
                if (var18.field4272 != var17) {
                    var18 = null;
                }
            }
            this.method2854(var18, arg10, var17, arg12, arg3, 0, -1707, var16, false, arg1, 65535, null);
            class298 var19 = arg7.field5463[arg6];
            class298 var20 = null;
            if (arg2 != null) {
                var20 = arg2.field5463[arg9];
                if (var20.field4272 != var17) {
                    var20 = null;
                }
            }
            this.method471(0, new int[0], 0, 0, 0, 0, arg3);
            this.method2854(var20, arg10, var19.field4272, arg5, arg3, 0, -1707, var19, true, arg4, 65535, null);
            this.method440();
        }
    }

    static {
        new class331("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field6961 = new class324(9, 6);
        field6963 = 0;
    }
}
