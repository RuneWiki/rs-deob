import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class290 {

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Lwl;")
    private class280 field3795;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "Lff;")
    public static class9 field3793 = new class9(13, -1);

    @OriginalMember(owner = "client!un", name = "l", descriptor = "Lvj;")
    public static class304 field3799 = new class304("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Z")
    public static boolean field3801 = false;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field3800 = -1;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "[I")
    public static int[] field3803;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Lda;")
    private class42 field3791;

    static {
        new class304("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field3803 = new int[] { 1, 2, 4, 8 };
        field3802 = 0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIZLpc;ZI)V", line = 3)
    public static final void method1700(int arg0, int arg1, boolean arg2, class473 arg3, boolean arg4, int arg5) {
        class108.field1575 = 10000;
        class528.field7808 = arg5;
        class177.field2570 = arg2;
        field3798++;
        class433.field5910 = arg1;
        class60.field943 = arg3;
        class342.field4520 = 1;
        class49.field759 = arg0;
        if (!arg4) {
            field3802 = -29;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)I", line = 27)
    public static final int method1701(byte arg0, int arg1) {
        if (arg0 > -7) {
            method1700(-63, -43, false, null, false, 89);
        }
        field3788++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 41)
    public static void method1702(int arg0) {
        field3799 = null;
        field3803 = null;
        field3793 = null;
        if (arg0 != 0) {
            field3803 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)Lda;", line = 53)
    public final class42 method1703(int arg0) {
        field3790++;
        int var2 = 27 % ((-arg0 - 48) / 43);
        class42 var3 = this.field3791;
        if (this.field3795.field3684 == var3) {
            this.field3791 = null;
            return null;
        } else {
            this.field3791 = var3.field619;
            return var3;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIZII)V", line = 73)
    public static final void method1704(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field3796++;
        if (arg0 == arg2) {
            class520.method3064(arg5, arg1, arg2, arg4, 0);
            return;
        }
        if ((arg1 - arg2) >= class308.field4055 && arg1 + arg2 <= class71.field1077 && arg5 - arg0 >= class353.field4777 && arg0 + arg5 <= class300.field3971) {
            class428.method2472(arg0, arg1, arg4, 15464, arg5, arg2);
        } else {
            class374.method2162(arg5, arg2, arg1, arg4, arg0, (byte) 94);
        }
        if (arg3) {
            method1705(-105, 4, 21, -114, -57, -112, 17, null, null, -88, null, -76, (byte) -25, -70, false);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIILcl;[II[IIBIZ)I", line = 101)
    public static final int method1705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class173 arg7, int[] arg8, int arg9, int[] arg10, int arg11, byte arg12, int arg13, boolean arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class430.field5885[var15][var35] = 0;
                class494.field6867[var15][var35] = 99999999;
            }
        }
        field3792++;
        boolean var16;
        if (arg9 == 1) {
            var16 = class74.method480(arg7, arg3, arg5, arg2, arg4, arg0, arg6, arg11, arg1, arg13, (byte) -103);
        } else if (arg9 == 2) {
            var16 = class303.method1762(arg4, arg13, arg2, arg3, arg5, arg1, arg0, (byte) -64, arg6, arg11, arg7);
        } else {
            var16 = class530.method3120(arg1, arg7, arg9, arg6, arg11, 101, arg4, arg13, arg5, arg2, arg0, arg3);
        }
        int var17 = arg4 - 64;
        int var18 = arg6 - 64;
        int var19 = class296.field3878;
        if (arg12 != -76) {
            return -96;
        }
        int var20 = class212.field2888;
        if (!var16) {
            if (!arg14) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg11 - var23; var24 <= arg11 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class494.field6867[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg11 > var24) {
                            var28 = arg11 - var24;
                        } else if (arg13 + arg11 - 1 < var24) {
                            var28 = var24 - (arg11 + arg13 - 1);
                        }
                        int var29 = 0;
                        if (arg3 > var25) {
                            var29 = arg3 - var25;
                        } else if (var25 > (arg1 + arg3 - 1)) {
                            var29 = -arg1 - arg3 - (-1 - var25);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class494.field6867[var26][var27]) {
                            var19 = var24;
                            var22 = class494.field6867[var26][var27];
                            var21 = var30;
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg4 == var19 && arg6 == var20) {
            return 0;
        }
        byte var31 = 0;
        class153.field2210[var31] = var19;
        int var37 = var31 + 1;
        class71.field1066[var31] = var20;
        int var32;
        int var33 = var32 = class430.field5885[var19 - var17][var20 - var18];
        while (arg4 != var19 || arg6 != var20) {
            if (var32 != var33) {
                class153.field2210[var37] = var19;
                var32 = var33;
                class71.field1066[var37++] = var20;
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
            var33 = class430.field5885[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg10[var34] = class153.field2210[var37];
            arg8[var34++] = class71.field1066[var37];
            if (var34 >= arg10.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BLwl;)V", line = 277)
    public final void method1706(byte arg0, class280 arg1) {
        if (arg0 < 86) {
            method1701((byte) -30, 3);
        }
        this.field3795 = arg1;
        field3797++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Lda;", line = 289)
    public final class42 method1707(byte arg0) {
        field3789++;
        class42 var2 = this.field3795.field3684.field619;
        if (this.field3795.field3684 == var2) {
            this.field3791 = null;
            return null;
        } else if (arg0 == 124) {
            this.field3791 = var2.field619;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 314)
    public class290() {
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lwl;)V", line = 316)
    public class290(class280 arg0) {
        this.field3795 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lqa;Lcr;I)V", line = 326)
    public static final void method1708(class162 arg0, class403 arg1, int arg2) {
        field3794++;
        boolean var3 = class127.field1852.method2392(arg0, arg1.field5541, arg1.field5489 | arg2, (byte) 117, arg1.field5499, arg1.field5416, arg1.field5530, arg1.field5461 ? class385.field5232.field7627 : null) == null;
        if (var3) {
            class225.field3033.method1666((byte) 109, new class199(arg1.field5530, arg1.field5541, arg1.field5416, arg1.field5489 | 0xFF000000, arg1.field5499, arg1.field5461));
        }
    }
}
