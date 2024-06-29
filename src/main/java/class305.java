import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class305 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field4446 = -1;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field4451 = new String[100];

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[I")
    public static int[] field4450 = new int[13];

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "J")
    public static long field4449 = 0L;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method2055(int arg0) {
        field4451 = null;
        if (arg0 != -8193) {
            method2063((Component) null, (byte) -22, false);
        }
        field4450 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
    public abstract void method201(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)V")
    public abstract void method240(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method208(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(SS)V")
    public abstract void method196(short arg0, short arg1);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILrg;Lrg;BIIZI)V")
    public final void method2056(int arg0, int arg1, class385 arg2, class385 arg3, byte arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field4445++;
        if (arg8 == -1 || !this.method248() || arg4 != -82) {
            return;
        }
        class124 var10 = arg2.field5447[arg8];
        class23 var11 = var10.field1655;
        class124 var12 = null;
        if (arg3 != null) {
            var12 = arg3.field5447[arg1];
            if (var12.field1655 != var11) {
                var12 = null;
            }
        }
        this.method2060(arg0, 65535, 16383, var10, var11, var12, (int[]) null, arg7, arg5, false, arg6, (boolean[]) null);
        this.method241();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()I")
    public abstract int method252();

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILrg;Lrg;[ZLrg;IILrg;IIIIZ)V")
    public final void method2057(int arg0, int arg1, int arg2, class385 arg3, class385 arg4, boolean[] arg5, class385 arg6, int arg7, int arg8, class385 arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        field4455++;
        if (arg2 == -1) {
            return;
        }
        if (arg5 == null || arg0 == -1) {
            this.method2056(0, arg10, arg3, arg4, (byte) -82, arg11, arg13, arg14, arg2);
        } else if (this.method248()) {
            class124 var16 = arg3.field5447[arg2];
            class23 var17 = var16.field1655;
            class124 var18 = null;
            if (arg4 != null) {
                var18 = arg4.field5447[arg10];
                if (var18.field1655 != var17) {
                    var18 = null;
                }
            }
            if (arg7 != -1) {
                field4450 = null;
            }
            class124 var19 = arg9.field5447[arg0];
            class124 var20 = null;
            if (arg6 != null) {
                var20 = arg6.field5447[arg8];
                if (var20.field1655 != var17) {
                    var20 = null;
                }
            }
            this.method2060(0, 65535, 16383, var16, var17, var18, (int[]) null, arg14, arg11, false, arg13, arg5);
            this.method234(0, new int[0], 0, 0, 0, 0, arg14);
            this.method2060(0, 65535, arg7 ^ 0xFFFFC000, var19, var17, var20, (int[]) null, arg14, arg1, true, arg12, arg5);
            this.method241();
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public abstract void method233(int arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIZI[II[IZI)V")
    private final void method2058(int arg0, int arg1, int arg2, boolean arg3, int arg4, int[] arg5, int arg6, int[] arg7, boolean arg8, int arg9) {
        field4444++;
        if (arg9 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = -arg6;
                arg6 = arg1;
                arg1 = var13;
            } else if (arg4 == 3) {
                int var12 = arg6;
                arg6 = arg1;
                arg1 = var12;
            } else if (arg4 == 2) {
                int var11 = arg6;
                arg6 = -arg1 & 0x3FFF;
                arg1 = var11 & 0x3FFF;
            }
        } else if (arg9 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg1 = -arg1;
                arg6 = -arg6;
            } else if (arg4 == 2) {
                arg1 = -arg1 & 0x3FFF;
                arg6 = -arg6 & 0x3FFF;
            }
        } else if (arg9 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = arg6;
                arg6 = -arg1;
                arg1 = var16;
            } else if (arg4 == 3) {
                int var14 = arg6;
                arg6 = arg1;
                arg1 = var14;
            } else if (arg4 == 2) {
                int var15 = arg6;
                arg6 = arg1 & 0x3FFF;
                arg1 = -var15 & 0x3FFF;
            }
        }
        if (!arg8) {
            this.method252();
        }
        if (arg0 == 65535) {
            this.method234(arg4, arg5, arg6, arg2, arg1, arg9, arg3);
        } else {
            this.method208(arg4, arg5, arg6, arg2, arg1, arg3, arg0, arg7);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()I")
    public abstract int method235();

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public abstract void method220(int arg0);

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()I")
    public abstract int method239();

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method234(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()V")
    public abstract void method225();

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    public abstract void method197(int arg0);

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "()I")
    public abstract int method247();

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
    public abstract void method198(int arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lni;IIIZ)V")
    public abstract void method232(class305 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "()[Lrl;")
    public abstract class430[] method238();

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "()V")
    public abstract void method241();

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZLrg;ILrg;II[IIII)V")
    public final void method2059(int arg0, boolean arg1, class385 arg2, int arg3, class385 arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        field4453++;
        if (arg3 == -1 || !this.method248()) {
            return;
        }
        class124 var12 = arg4.field5447[arg3];
        class23 var13 = var12.field1655;
        class124 var14 = null;
        if (arg2 != null) {
            var14 = arg2.field5447[arg5];
            if (var14.field1655 != var13) {
                var14 = null;
            }
        }
        this.method2060(arg9, arg8, 16383, var12, var13, var14, arg7, arg1, arg10, false, arg6, (boolean[]) null);
        if (arg0 != 0) {
            field4449 = -57L;
        }
        this.method241();
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(SS)V")
    public abstract void method222(short arg0, short arg1);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILs;Z)Z")
    public abstract boolean method209(int arg0, int arg1, class154 arg2, boolean arg3);

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "()I")
    public abstract int method228();

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "()I")
    public abstract int method202();

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "()I")
    public abstract int method217();

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "()I")
    public abstract int method199();

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILuh;Luh;III)V")
    public abstract void method218(int arg0, int arg1, class92 arg2, class92 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILui;Lud;Lui;[IZIZI[Z)V")
    private final void method2060(int arg0, int arg1, int arg2, class124 arg3, class23 arg4, class124 arg5, int[] arg6, boolean arg7, int arg8, boolean arg9, int arg10, boolean[] arg11) {
        field4452++;
        if (arg5 == null || arg10 == 0) {
            for (int var37 = 0; var37 < arg3.field1653; var37++) {
                short var38 = arg3.field1650[var37];
                if (arg11 == null || arg9 == arg11[var38] || arg4.field288[var38] == 0) {
                    short var39 = arg3.field1647[var37];
                    if (var39 != -1) {
                        this.method2058(arg4.field286[var39] & arg1, 0, 0, arg7, 0, arg4.field282[var39], 0, arg6, true, arg0);
                    }
                    this.method2058(arg1 & arg4.field286[var38], arg3.field1651[var37], arg3.field1649[var37], arg7, arg4.field288[var38], arg4.field282[var38], arg3.field1645[var37], arg6, true, arg0);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (arg2 != 16383) {
            this.method2056(-50, -105, (class385) null, (class385) null, (byte) -124, -35, 16, false, -127);
        }
        while (var15 < arg4.field287) {
            boolean var16 = false;
            if (arg3.field1653 > var13 && arg3.field1650[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg5.field1653 > var14 && arg5.field1650[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg11 == null || arg11[var15] == arg9 || arg4.field288[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg4.field288[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var20 = arg3.field1651[var13];
                        var21 = arg3.field1645[var13];
                        var22 = arg3.field1647[var13];
                        var23 = arg3.field1649[var13];
                        var24 = arg3.field1654[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var22 = -1;
                        var24 = 0;
                        var23 = var18;
                        var21 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var25 = arg5.field1649[var14];
                        var26 = arg5.field1645[var14];
                        var27 = arg5.field1651[var14];
                        var28 = arg5.field1647[var14];
                        var29 = arg5.field1654[var14];
                        var14++;
                    } else {
                        var26 = var18;
                        var29 = 0;
                        var25 = var18;
                        var27 = var18;
                        var28 = -1;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var24 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var35 = var20;
                        var33 = var23;
                        var34 = var21;
                    } else if (var19 == 2) {
                        int var30 = var26 - var21 & 0x3FFF;
                        int var31 = var25 - var23 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var27 - var20 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        var33 = var23 + (arg10 * var31 / arg8) & 0x3FFF;
                        var34 = var21 + (arg10 * var30 / arg8) & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = arg10 * var32 / arg8 + var20 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var26 - var21 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var34 = var21 + (arg10 * var36 / arg8) & 0x3F;
                        var33 = var23 + ((var25 - var23) * arg10 / arg8);
                        var35 = var20 + ((var27 - var20) * arg10 / arg8);
                    } else {
                        var33 = (var25 - var23) * arg10 / arg8 + var23;
                        var35 = var20 + ((var27 - var20) * arg10 / arg8);
                        var34 = var21 + ((var26 - var21) * arg10 / arg8);
                    }
                    if (var22 != -1) {
                        this.method2058(arg1 & arg4.field286[var22], 0, 0, arg7, 0, arg4.field282[var22], 0, arg6, true, arg0);
                    } else if (var28 != -1) {
                        this.method2058(arg4.field286[var28] & arg1, 0, 0, arg7, 0, arg4.field282[var28], 0, arg6, true, arg0);
                    }
                    this.method2058(arg4.field286[var15] & arg1, var35, var33, arg7, var19, arg4.field282[var15], var34, arg6, true, arg0);
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

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "()Z")
    public abstract boolean method244();

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V")
    public abstract void method207(int arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lo;)Lo;")
    public abstract class21 method227(class21 arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIZ)Lni;")
    public abstract class305 method200(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "()Z")
    public abstract boolean method248();

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "()[Lhq;")
    public abstract class88[] method210();

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "()I")
    public abstract int method214();

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)V")
    public abstract void method215(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ls;Lrh;II)V")
    public abstract void method223(class154 arg0, class144 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "()I")
    public abstract int method221();

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V")
    public abstract void method251(int arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lrg;II)V")
    public final void method2061(class385 arg0, int arg1, int arg2) {
        field4448++;
        if (arg2 == -1 || !this.method248()) {
            return;
        }
        if (arg1 <= 115) {
            this.method198(-89);
        }
        class124 var4 = arg0.field5447[arg2];
        class23 var5 = var4.field1655;
        for (int var6 = 0; var6 < var4.field1653; var6++) {
            short var7 = var4.field1650[var6];
            if (var5.field284[var7]) {
                if (var4.field1647[var6] != -1) {
                    this.method240(0, 0, 0, 0);
                }
                this.method240(var5.field288[var7], var4.field1645[var6], var4.field1649[var6], var4.field1651[var6]);
            }
        }
        this.method241();
    }

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "()V")
    public abstract void method204();

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ls;Lrh;I)V")
    public abstract void method230(class154 arg0, class144 arg1, int arg2);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILuh;IIIII)V")
    public final void method2062(int arg0, class92 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4454++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg6 / 2;
        int var12 = -arg4 / 2;
        int var13 = arg1.method360(arg3 + var11, arg2 + var12);
        int var14 = arg6 / 2;
        int var15 = -arg4 / 2;
        int var16 = arg1.method360(arg3 + var14, arg2 + var15);
        if (arg5 != -31849) {
            this.method244();
        }
        int var17 = -arg6 / 2;
        int var18 = arg4 / 2;
        int var19 = arg1.method360(arg3 + var17, arg2 - -var18);
        int var20 = arg6 / 2;
        int var21 = arg4 / 2;
        int var22 = arg1.method360(arg3 + var20, arg2 + var21);
        int var23 = var13 < var16 ? var13 : var16;
        int var24 = var19 >= var22 ? var22 : var19;
        int var25 = var16 >= var22 ? var22 : var16;
        int var26 = var13 < var19 ? var13 : var19;
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var23 - var24), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var27 != 0) {
                this.method207(var27);
            }
        }
        int var28 = var13 + var22;
        if (arg6 != 0) {
            int var29 = (int) (Math.atan2((double) (var26 - var25), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method197(var29);
            }
        }
        if (var16 + var19 < var28) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg0;
        if (var30 != 0) {
            this.method201(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Component;BZ)Luq;")
    public static final class91 method2063(Component arg0, byte arg1, boolean arg2) {
        field4447++;
        return arg1 >= -113 ? null : new class450(arg0, arg2);
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)V")
    public abstract void method237(int arg0);
}
