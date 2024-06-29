import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class239 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "Lam;")
    public class413 field3579 = new class413();

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Lwf;")
    public static class79 field3583 = new class79(69, 3);

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field3588 = 0;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "Lvp;")
    public static class112 field3587 = new class112("", 16);

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "Lam;")
    private class413 field3585;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Ljava/awt/Frame;")
    public static Frame field3589;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Lam;")
    public final class413 method1514(int arg0) {
        field3581++;
        class413 var2 = this.field3585;
        if (this.field3579 == var2) {
            this.field3585 = null;
            return null;
        }
        if (arg0 != 0) {
            field3583 = null;
        }
        this.field3585 = var2.field5807;
        return var2;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)Lam;")
    public final class413 method1515(byte arg0) {
        if (arg0 <= 38) {
            this.method1514(101);
        }
        field3586++;
        class413 var2 = this.field3579.field5807;
        if (this.field3579 == var2) {
            this.field3585 = null;
            return null;
        } else {
            this.field3585 = var2.field5807;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
    public final void method1516(byte arg0) {
        while (true) {
            class413 var2 = this.field3579.field5807;
            if (this.field3579 == var2) {
                field3584++;
                this.field3585 = null;
                int var3 = -65 / ((arg0 - 60) / 48);
                return;
            }
            var2.method2438((byte) 30);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lam;I)V")
    public final void method1517(class413 arg0, int arg1) {
        if (arg0.field5812 != null) {
            arg0.method2438((byte) 30);
        }
        field3580++;
        arg0.field5807 = this.field3579;
        arg0.field5812 = this.field3579.field5812;
        arg0.field5812.field5807 = arg0;
        if (arg1 <= -8) {
            arg0.field5807.field5812 = arg0;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZII[IIII[IIIBIILee;I)I")
    public static final int method1518(boolean arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, byte arg10, int arg11, int arg12, class441 arg13, int arg14) {
        field3582++;
        int var15 = 0;
        if (arg10 <= 108) {
            method1518(true, 116, -120, (int[]) null, 43, -112, 127, (int[]) null, -42, -127, (byte) -89, -94, 97, (class441) null, -10);
        }
        while (var15 < 128) {
            for (int var35 = 0; var35 < 128; var35++) {
                class168.field2448[var15][var35] = 0;
                class258.field3784[var15][var35] = 99999999;
            }
            var15++;
        }
        boolean var16;
        if (arg11 == 1) {
            var16 = class168.method1037(arg13, arg9, arg1, arg8, arg12, arg4, -1, arg5, arg2, arg14, arg6);
        } else if (arg11 == 2) {
            var16 = class20.method137(arg9, arg1, arg5, 4095, arg13, arg4, arg6, arg2, arg8, arg14, arg12);
        } else {
            var16 = class401.method2397(arg2, arg13, arg14, (byte) 94, arg4, arg6, arg8, arg5, arg12, arg1, arg11, arg9);
        }
        int var17 = arg4 - 64;
        int var18 = arg14 - 64;
        int var19 = class245.field3646;
        int var20 = class411.field5763;
        if (!var16) {
            if (!arg0) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg1 - var23; var24 <= (arg1 + var23); var24++) {
                for (int var25 = arg6 - var23; var25 <= (arg6 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class258.field3784[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg1) {
                            var28 = arg1 - var24;
                        } else if ((arg1 + arg2 - 1) < var24) {
                            var28 = var24 + 1 - arg1 - arg2;
                        }
                        int var29 = 0;
                        if (var25 < arg6) {
                            var29 = arg6 - var25;
                        } else if ((arg6 + arg8 - 1) < var25) {
                            var29 = var25 + 1 - arg8 - arg6;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class258.field3784[var26][var27]) {
                            var22 = class258.field3784[var26][var27];
                            var19 = var24;
                            var20 = var25;
                            var21 = var30;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg4 == var19 && arg14 == var20) {
            return 0;
        }
        byte var31 = 0;
        class368.field5326[var31] = var19;
        int var37 = var31 + 1;
        class89.field1098[var31] = var20;
        int var32;
        int var33 = var32 = class168.field2448[var19 - var17][var20 - var18];
        while (arg4 != var19 || arg14 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class368.field5326[var37] = var19;
                class89.field1098[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class168.field2448[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg3[var34] = class368.field5326[var37];
            arg7[var34++] = class89.field1098[var37];
            if (var34 >= arg3.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
    public static void method1519(int arg0) {
        field3583 = null;
        field3589 = null;
        if (arg0 == 1) {
            field3587 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
    public class239() {
        this.field3579.field5812 = this.field3579;
        this.field3579.field5807 = this.field3579;
    }
}
