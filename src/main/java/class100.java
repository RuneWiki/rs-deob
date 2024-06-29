import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class100 {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1564 = "slide:";

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Ldp;")
    public static class174 field1561;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method825(int arg0) {
        field1561 = null;
        field1564 = null;
        if (arg0 != -22109) {
            field1564 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()I")
    public abstract int method558();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILnc;IIII)V")
    public final void method826(int arg0, int arg1, class126 arg2, int arg3, int arg4, int arg5, int arg6) {
        field1559++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg1 / 2;
        int var12 = -arg6 / 2;
        int var13 = arg2.method809(arg0 + var11, arg5 + var12);
        if (arg4 != 26471) {
            field1555 = -95;
        }
        int var14 = arg1 / 2;
        int var15 = -arg6 / 2;
        int var16 = arg2.method809(arg0 + var14, arg5 + var15);
        int var17 = -arg1 / 2;
        int var18 = arg6 / 2;
        int var19 = arg2.method809(arg0 + var17, arg5 + var18);
        int var20 = arg1 / 2;
        int var21 = arg6 / 2;
        int var22 = arg2.method809(arg0 + var20, arg5 + var21);
        int var23 = var13 >= var16 ? var16 : var13;
        int var24 = var19 < var22 ? var19 : var22;
        int var25 = var22 > var16 ? var16 : var22;
        if (arg6 != 0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method543(var26);
            }
        }
        int var27 = var19 <= var13 ? var19 : var13;
        int var28 = var13 + var22;
        if (arg1 != 0) {
            int var29 = (int) (Math.atan2((double) (var27 - var25), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method519(var29);
            }
        }
        if (var28 > var16 + var19) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg3;
        if (var30 != 0) {
            this.method523(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()I")
    public abstract int method521();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lb;BI[ZIIZZLq;ILq;[I)V")
    private final void method827(class122 arg0, byte arg1, int arg2, boolean[] arg3, int arg4, int arg5, boolean arg6, boolean arg7, class203 arg8, int arg9, class203 arg10, int[] arg11) {
        field1566++;
        if (arg8 == null || arg4 == 0) {
            for (int var37 = 0; var37 < arg10.field2963; var37++) {
                short var38 = arg10.field2961[var37];
                if (arg3 == null || arg3[var38] == arg7 || arg0.field1934[var38] == 0) {
                    short var39 = arg10.field2959[var37];
                    if (var39 != -1) {
                        this.method830(0, arg9, 0, 0, 0, arg0.field1921[var39], true, arg11, arg6, arg5 & arg0.field1915[var39]);
                    }
                    this.method830(arg10.field2960[var37], arg9, arg10.field2949[var37], arg10.field2954[var37], arg0.field1934[var38], arg0.field1921[var38], true, arg11, arg6, arg5 & arg0.field1915[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (arg1 < 38) {
            field1565 = -37;
        }
        while (var15 < arg0.field1933) {
            boolean var16 = false;
            if (var13 < arg10.field2963 && arg10.field2961[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg8.field2963 > var14 && arg8.field2961[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg3 == null || arg7 == arg3[var15] || arg0.field1934[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field1934[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg10.field2954[var13];
                        var21 = arg10.field2960[var13];
                        var23 = arg10.field2959[var13];
                        var22 = arg10.field2958[var13];
                        var24 = arg10.field2949[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = 0;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var25 = arg8.field2959[var14];
                        var26 = arg8.field2960[var14];
                        var27 = arg8.field2949[var14];
                        var28 = arg8.field2958[var14];
                        var29 = arg8.field2954[var14];
                        var14++;
                    } else {
                        var27 = var18;
                        var25 = -1;
                        var28 = 0;
                        var26 = var18;
                        var29 = var18;
                    }
                    if (var23 != -1) {
                        this.method830(0, arg9, 0, 0, 0, arg0.field1921[var23], true, arg11, arg6, arg5 & arg0.field1915[var23]);
                    } else if (var25 != -1) {
                        this.method830(0, arg9, 0, 0, 0, arg0.field1921[var25], true, arg11, arg6, arg5 & arg0.field1915[var25]);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var22 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var33 = var21;
                        var34 = var20;
                        var35 = var24;
                    } else if (var19 == 2) {
                        int var30 = var26 - var21 & 0x3FFF;
                        int var31 = var29 - var20 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var27 - var24 & 0x3FFF;
                        var33 = var21 + (arg4 * var30 / arg2) & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg4 * var31 / arg2 + var20 & 0x3FFF;
                        var35 = arg4 * var32 / arg2 + var24 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var26 - var21 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var34 = (var29 - var20) * arg4 / arg2 + var20;
                        var35 = var24 + ((var27 - var24) * arg4 / arg2);
                        var33 = arg4 * var36 / arg2 + var21 & 0x3F;
                    } else {
                        var33 = (var26 - var21) * arg4 / arg2 + var21;
                        var34 = (var29 - var20) * arg4 / arg2 + var20;
                        var35 = (var27 - var24) * arg4 / arg2 + var24;
                    }
                    this.method830(var33, arg9, var35, var34, var19, arg0.field1921[var15], true, arg11, arg6, arg0.field1915[var15] & arg5);
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

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "()I")
    public abstract int method567();

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public abstract void method525(int arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([ZIIIILkf;ZLkf;ILkf;IBLkf;II)V")
    public final void method828(boolean[] arg0, int arg1, int arg2, int arg3, int arg4, class293 arg5, boolean arg6, class293 arg7, int arg8, class293 arg9, int arg10, byte arg11, class293 arg12, int arg13, int arg14) {
        field1558++;
        if (arg2 == -1) {
            return;
        }
        if (arg0 == null || arg1 == -1) {
            this.method829(arg9, arg3, arg4, arg6, -58, arg7, 0, arg10, arg2);
        } else if (this.method563()) {
            if (arg11 != 3) {
                this.method572(-65);
            }
            class203 var16 = arg9.field4354[arg2];
            class122 var17 = var16.field2962;
            class203 var18 = null;
            if (arg7 != null) {
                var18 = arg7.field4354[arg3];
                if (var18.field2962 != var17) {
                    var18 = null;
                }
            }
            class203 var19 = arg12.field4354[arg1];
            class203 var20 = null;
            if (arg5 != null) {
                var20 = arg5.field4354[arg8];
                if (var20.field2962 != var17) {
                    var20 = null;
                }
            }
            this.method827(var17, (byte) 98, arg4, arg0, arg10, 65535, arg6, false, var18, 0, var16, (int[]) null);
            this.method571(0, new int[0], 0, 0, 0, 0, arg6);
            this.method827(var17, (byte) 46, arg13, arg0, arg14, 65535, arg6, true, var20, 0, var19, (int[]) null);
            this.method553();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(SS)V")
    public abstract void method570(short arg0, short arg1);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lrc;IIIZ)V")
    public abstract void method552(class100 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lkf;IIZILkf;III)V")
    public final void method829(class293 arg0, int arg1, int arg2, boolean arg3, int arg4, class293 arg5, int arg6, int arg7, int arg8) {
        field1563++;
        if (arg8 == -1 || !this.method563()) {
            return;
        }
        class203 var10 = arg0.field4354[arg8];
        if (arg4 > -51) {
            field1565 = -65;
        }
        class122 var11 = var10.field2962;
        class203 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field4354[arg1];
            if (var12.field2962 != var11) {
                var12 = null;
            }
        }
        this.method827(var11, (byte) 61, arg2, (boolean[]) null, arg7, 65535, arg3, false, var12, arg6, var10, (int[]) null);
        this.method553();
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "()V")
    public abstract void method548();

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "()I")
    public abstract int method546();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII[IZ[IZI)V")
    private final void method830(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6, int[] arg7, boolean arg8, int arg9) {
        if (!arg6) {
            field1565 = -114;
        }
        field1562++;
        if (arg1 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = -arg0;
                arg0 = arg2;
                arg2 = var13;
            } else if (arg4 == 3) {
                int var12 = arg0;
                arg0 = arg2;
                arg2 = var12;
            } else if (arg4 == 2) {
                int var11 = arg0;
                arg0 = -arg2 & 0x3FFF;
                arg2 = var11 & 0x3FFF;
            }
        } else if (arg1 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg2 = -arg2;
                arg0 = -arg0;
            } else if (arg4 == 2) {
                arg2 = -arg2 & 0x3FFF;
                arg0 = -arg0 & 0x3FFF;
            }
        } else if (arg1 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = arg0;
                arg0 = -arg2;
                arg2 = var16;
            } else if (arg4 == 3) {
                int var14 = arg0;
                arg0 = arg2;
                arg2 = var14;
            } else if (arg4 == 2) {
                int var15 = arg0;
                arg0 = arg2 & 0x3FFF;
                arg2 = -var15 & 0x3FFF;
            }
        }
        if (arg9 == 65535) {
            this.method571(arg4, arg5, arg0, arg3, arg2, arg1, arg8);
        } else {
            this.method529(arg4, arg5, arg0, arg3, arg2, arg8, arg9, arg7);
        }
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "()Z")
    public abstract boolean method549();

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "()V")
    public abstract void method520();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method571(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public abstract void method572(int arg0);

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "()I")
    public abstract int method565();

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "()Z")
    public abstract boolean method563();

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    public abstract void method524(int arg0);

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "()I")
    public abstract int method541();

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "()I")
    public abstract int method561();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
    public abstract void method523(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "()I")
    public abstract int method534();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII)V")
    public static final void method831(byte arg0, int arg1, int arg2) {
        if (arg0 != -77) {
            method831((byte) 8, 109, 75);
        }
        field1556++;
        class221 var3 = class447.method2795(15, (byte) -49, 0);
        var3.method1692(0);
        var3.field3297 = arg2;
        var3.field3291 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILpo;Z)Z")
    public abstract boolean method574(int arg0, int arg1, class202 arg2, boolean arg3);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(SS)V")
    public abstract void method554(short arg0, short arg1);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILnc;Lnc;III)V")
    public abstract void method528(int arg0, int arg1, class126 arg2, class126 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLkf;I)V")
    public final void method832(boolean arg0, class293 arg1, int arg2) {
        field1557++;
        if (arg2 == -1 || !this.method563()) {
            return;
        }
        class203 var4 = arg1.field4354[arg2];
        class122 var5 = var4.field2962;
        if (arg0) {
            field1561 = null;
        }
        for (int var6 = 0; var6 < var4.field2963; var6++) {
            short var7 = var4.field2961[var6];
            if (var5.field1919[var7]) {
                if (var4.field2959[var6] != -1) {
                    this.method533(0, 0, 0, 0);
                }
                this.method533(var5.field1934[var7], var4.field2960[var6], var4.field2954[var6], var4.field2949[var6]);
            }
        }
        this.method553();
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public abstract void method538(int arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lpo;Ltc;I)V")
    public abstract void method530(class202 arg0, class290 arg1, int arg2);

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "()[Lbo;")
    public abstract class354[] method547();

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public abstract void method543(int arg0);

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "()I")
    public abstract int method560();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lpo;Ltc;II)V")
    public abstract void method531(class202 arg0, class290 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
    public abstract void method555(int arg0);

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "()V")
    public abstract void method553();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lsr;)Lsr;")
    public abstract class135 method568(class135 arg0);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V")
    public abstract void method539(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)V")
    public abstract void method519(int arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method529(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
    public abstract void method533(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIZ)Lrc;")
    public abstract class100 method518(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "()[Loo;")
    public abstract class383[] method542();

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "()I")
    public abstract int method566();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILkf;Lkf;[IIIIIIIZ)V")
    public final void method833(int arg0, class293 arg1, class293 arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field1560++;
        if (~arg5 == arg7 || !this.method563()) {
            return;
        }
        class203 var12 = arg1.field4354[arg5];
        class122 var13 = var12.field2962;
        class203 var14 = null;
        if (arg2 != null) {
            var14 = arg2.field4354[arg6];
            if (var14.field2962 != var13) {
                var14 = null;
            }
        }
        this.method827(var13, (byte) 41, arg4, (boolean[]) null, arg0, arg8, arg10, false, var14, arg9, var12, arg3);
        this.method553();
    }
}
