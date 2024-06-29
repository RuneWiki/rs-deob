import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class236 extends class727 implements class466 {

    @OriginalMember(owner = "client!iba", name = "ob", descriptor = "Z")
    private boolean field3557 = false;

    @OriginalMember(owner = "client!iba", name = "fb", descriptor = "Lwm;")
    public class443 field3548;

    @OriginalMember(owner = "client!iba", name = "sb", descriptor = "Z")
    private boolean field3561;

    @OriginalMember(owner = "client!iba", name = "qb", descriptor = "F")
    public static float field3559;

    @OriginalMember(owner = "client!iba", name = "S", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!iba", name = "T", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!iba", name = "U", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!iba", name = "V", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!iba", name = "W", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!iba", name = "Y", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!iba", name = "Z", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!iba", name = "ab", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!iba", name = "bb", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!iba", name = "cb", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!iba", name = "db", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!iba", name = "eb", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!iba", name = "gb", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!iba", name = "hb", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!iba", name = "ib", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!iba", name = "jb", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!iba", name = "kb", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!iba", name = "lb", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!iba", name = "mb", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!iba", name = "nb", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!iba", name = "pb", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!iba", name = "rb", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!iba", name = "tb", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!iba", name = "X", descriptor = "Ltja;")
    private class491 field3540;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "(I)Z")
    public final boolean method80(int arg0) {
        if (arg0 < 63) {
            return false;
        } else {
            ++field3543;
            return this.field3557;
        }
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(Z)V")
    public final void method754(boolean arg0) {
        ++field3555;
        if (arg0) {
            this.field3548 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILha;)Lrk;")
    public final class289 method74(int arg0, class473 arg1) {
        ++field3541;
        class231 var3 = this.field3548.method2660((byte) -88, false, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class12 var4 = arg1.method153();
            var4.method50(super.field3470, super.field3464, super.field3460);
            class289 var5 = class122.method863(1, (byte) 88, this.field3561);
            int var6 = super.field3470 >> 9;
            if (arg0 <= 75) {
                this.method760(61);
            }
            int var7 = super.field3460 >> 9;
            this.field3548.method2667(var7, var6, 1, var6, true, var7, arg1, var3, var4);
            if (!class529.field7284) {
                var3.method1586(var4, var5.field4255[0], 0);
            } else {
                var3.method1580(var4, var5.field4255[0], class775.field10662, 0);
            }
            if (this.field3548.field6127 != null) {
                class714 var8 = this.field3548.field6127.method2402();
                if (class529.field7284) {
                    arg1.method134(var8, class775.field10662);
                } else {
                    arg1.method253(var8);
                }
            }
            this.field3557 = var3.method1575() || this.field3548.field6127 != null;
            if (this.field3540 != null) {
                class33.method276(super.field3470, this.field3540, false, super.field3460, var3, super.field3464);
            } else {
                this.field3540 = class486.method2885(super.field3470, super.field3464, var3, super.field3460, 29289);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Loq;IZILha;II)V")
    public final void method73(class230 arg0, int arg1, boolean arg2, int arg3, class473 arg4, int arg5, int arg6) {
        ++field3556;
        if (arg6 < 96) {
            method1612(-5, -40, (byte) -113, -112);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lha;Z)V")
    public final void method763(class473 arg0, boolean arg1) {
        this.field3548.method2658(10, arg0);
        ++field3539;
        if (arg1) {
            this.field3561 = true;
        }
    }

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "(B)V")
    public final void method81(byte arg0) {
        if (arg0 != 29) {
            method1611(67);
        }
        ++field3537;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILaka;)V")
    public final void method1610(int arg0, class413 arg1) {
        this.field3548.method2654(arg1, 24841);
        ++field3544;
        int var3 = 120 / ((4 - arg0) / 42);
    }

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "(Z)Z")
    public final boolean method83(boolean arg0) {
        ++field3542;
        if (arg0) {
            field3559 = 0.545677F;
        }
        return false;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)I")
    public final int method756(byte arg0) {
        ++field3554;
        int var2 = -122 % ((arg0 - 48) / 51);
        return this.field3548.field6126;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(B)Z")
    public final boolean method755(byte arg0) {
        if (arg0 != -111) {
            return true;
        } else {
            ++field3538;
            return this.field3548.method2663(arg0 ^ -10600);
        }
    }

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "(I)I")
    public static final int method1611(int arg0) {
        if (arg0 != -5110) {
            return -17;
        } else {
            ++field3536;
            return ~class166.field2118 == -2 ? class517.field7135 : 0;
        }
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(Lha;I)Ltja;")
    public final class491 method72(class473 arg0, int arg1) {
        ++field3553;
        return arg1 != -5047 ? null : this.field3540;
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)I")
    public final int method89(int arg0) {
        ++field3558;
        int var2 = 77 / ((arg0 - 69) / 48);
        return this.field3548.method2661(-16897);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Z)I")
    public final int method762(boolean arg0) {
        if (!arg0) {
            return 104;
        } else {
            ++field3560;
            return this.field3548.field6119;
        }
    }

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "(B)I")
    public final int method78(byte arg0) {
        ++field3551;
        if (arg0 > -31) {
            field3559 = 0.31903023F;
        }
        return this.field3548.method2664((byte) -90);
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(Lha;I)V")
    public final void method76(class473 arg0, int arg1) {
        ++field3550;
        class231 var3 = this.field3548.method2660((byte) -88, true, arg0, 262144, true);
        int var4 = 84 / ((arg1 - -30) / 42);
        if (var3 != null) {
            int var5 = super.field3470 >> 9;
            int var6 = super.field3460 >> 9;
            class12 var7 = arg0.method153();
            var7.method50(super.field3470, super.field3464, super.field3460);
            this.field3548.method2667(var6, var5, 1, var5, false, var6, arg0, var3, var7);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIBI)Liaa;")
    public static final class116 method1612(int arg0, int arg1, byte arg2, int arg3) {
        ++field3545;
        class116 var4 = null;
        if (arg0 == 0) {
            var4 = class248.method1672(class84.field1023, class267.field3876, -20647);
            ++class97.field1134;
        }
        if (arg0 == 1) {
            var4 = class248.method1672(class84.field1023, class660.field9290, -20647);
            ++class88.field1050;
        }
        var4.field1575.method2981(arg3 - -class444.field6151, 128);
        var4.field1575.method3001(!class479.field6647.method273(82, Integer.MAX_VALUE) ? 0 : 1, 1719860128);
        var4.field1575.method3044(arg1 - -field3535, -123);
        class461.field6447 = arg1;
        class773.field10654 = false;
        class683.field9568 = arg3;
        int var5 = 125 % ((arg2 - -69) / 35);
        class313.method2014(-128);
        return var4;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lha;I)V")
    public final void method757(class473 arg0, int arg1) {
        ++field3549;
        int var3 = -87 / ((13 - arg1) / 37);
        this.field3548.method2657((byte) 51, arg0);
    }

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        ++field3562;
        if (arg0 != 25833) {
            method1611(-124);
        }
        return false;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)I")
    public final int method760(int arg0) {
        ++field3552;
        return arg0 != -27640 ? 94 : this.field3548.field6111;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method1613(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3546;
        if (arg9 >= 512 && arg3 >= 512 && (class741.field10208 - 2) * 512 >= arg9 && arg3 <= (class525.field7224 - 2) * 512) {
            if (arg5 >= -69) {
                method1611(-19);
            }
            int var10 = class373.method2316(arg9, arg0, arg3, 71) + -arg2;
            if (class55.field651) {
                class340.method2159(true, (byte) 108);
            } else {
                class732.field10111.method47(arg7, 0, 0);
                class111.field1332.method194(class732.field10111);
            }
            if (!class529.field7284) {
                class111.field1332.method142(arg9, var10, arg3, class491.field6769);
            } else {
                class111.field1332.method251(arg9, var10, arg3, class775.field10662, class491.field6769);
            }
            if (!class55.field651) {
                class732.field10111.method47(-arg7, 0, 0);
                class111.field1332.method194(class732.field10111);
            } else {
                class634.method3641((byte) -72);
            }
        } else {
            class491.field6769[0] = class491.field6769[1] = -1;
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lha;Lro;IIIIIZII)V")
    public class236(class473 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4117);
        this.field3548 = new class443(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field3561 = arg1.field4137 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method88(int arg0, class473 arg1, int arg2, int arg3) {
        ++field3547;
        if (arg2 != -31634) {
            this.field3548 = null;
        }
        class231 var5 = this.field3548.method2660((byte) -88, false, arg1, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class12 var6 = arg1.method153();
            var6.method50(super.field3470, super.field3464, super.field3460);
            return !class529.field7284 ? var5.method1578(arg0, arg3, var6, false, 0) : var5.method1570(arg0, arg3, var6, false, 0, class775.field10662);
        }
    }
}
