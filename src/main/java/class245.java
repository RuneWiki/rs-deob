import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class245 extends class447 implements class395 {

    @OriginalMember(owner = "client!wp", name = "gb", descriptor = "B")
    private byte field3575;

    @OriginalMember(owner = "client!wp", name = "V", descriptor = "Z")
    private boolean field3564;

    @OriginalMember(owner = "client!wp", name = "mb", descriptor = "B")
    private byte field3581;

    @OriginalMember(owner = "client!wp", name = "jb", descriptor = "Z")
    private boolean field3578;

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "Z")
    private boolean field3555;

    @OriginalMember(owner = "client!wp", name = "O", descriptor = "S")
    private short field3558;

    @OriginalMember(owner = "client!wp", name = "Q", descriptor = "B")
    private byte field3560;

    @OriginalMember(owner = "client!wp", name = "kb", descriptor = "Z")
    private boolean field3579;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "Lsr;")
    private class135 field3553;

    @OriginalMember(owner = "client!wp", name = "N", descriptor = "Lrc;")
    public class100 field3557;

    @OriginalMember(owner = "client!wp", name = "bb", descriptor = "Lob;")
    public static class209 field3570 = new class209();

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!wp", name = "M", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!wp", name = "P", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!wp", name = "S", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!wp", name = "T", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!wp", name = "U", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!wp", name = "W", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!wp", name = "X", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!wp", name = "Y", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!wp", name = "Z", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!wp", name = "ab", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!wp", name = "cb", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!wp", name = "db", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!wp", name = "eb", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!wp", name = "fb", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!wp", name = "hb", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!wp", name = "ib", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!wp", name = "lb", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!wp", name = "ob", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!wp", name = "nb", descriptor = "Lof;")
    public static class421 field3582;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZILja;Z)Lob;", line = 5)
    private final class209 method1778(boolean arg0, int arg1, class90 arg2, boolean arg3) {
        ++field3574;
        class45 var5 = class451.method2812(113, this.field3558 & 65535);
        if (!arg3) {
            this.method54(29);
        }
        class126 var6;
        class126 var7;
        if (!this.field3578) {
            var6 = class311.field4527[this.field3560];
            if (~this.field3560 <= -4) {
                var7 = null;
            } else {
                var7 = class311.field4527[this.field3560 + 1];
            }
        } else {
            var7 = class311.field4527[0];
            var6 = class18.field262[this.field3560];
        }
        return var5.method361(-183837885, this.field3575 == 11 ? 10 : this.field3575, arg2, arg0, super.field6506, var7, super.field6520, this.field3575 != 11 ? this.field3581 : 4 - -this.field3581, arg1, var6, super.field6519);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILja;)Lrc;", line = 35)
    public final class100 method1025(byte arg0, int arg1, class90 arg2) {
        ++field3568;
        if (arg0 != -84) {
            this.field3558 = 42;
        }
        return this.method1783(arg1, arg2, (byte) -100);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lja;I)V", line = 48)
    public final void method1021(class90 arg0, int arg1) {
        ++field3552;
        Object var3 = null;
        class135 var5;
        if (this.field3553 == null && this.field3579) {
            class209 var4 = this.method1778(true, 131072, arg0, true);
            var5 = var4 == null ? null : var4.field3046;
        } else {
            var5 = this.field3553;
            this.field3553 = null;
        }
        if (var5 != null) {
            class50.method395(var5, this.field3560, super.field6520, super.field6519, (boolean[]) null);
        }
        int var6 = 46 / ((-58 - arg1) / 56);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILja;)V", line = 74)
    public final void method137(int arg0, class90 arg1) {
        ++field3583;
        int var3 = 63 % ((arg0 - -31) / 51);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIB)I", line = 85)
    public static final int method1779(int arg0, int arg1, byte arg2) {
        ++field3561;
        int var3 = class7.method51(4, (byte) -52, arg1 + 45365, arg0 + 91923) - (128 - ((class7.method51(2, (byte) -52, arg1 + 10294, arg0 - -37821) - 128 >> 1) - -(-128 + class7.method51(1, (byte) -52, arg1, arg0) >> 2)));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (~var4 > -11) {
            var4 = 10;
        } else if (~var4 < -61) {
            var4 = 60;
        }
        return arg2 < 62 ? -35 : var4;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBZIILnf;Lja;)V", line = 110)
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        if (arg5 instanceof class121) {
            class121 var8 = (class121) arg5;
            if (this.field3557 != null && var8.field1913 != null) {
                this.field3557.method552(var8.field1913, arg3, arg0, arg4, arg2);
            }
        } else if (arg5 instanceof class245) {
            class245 var9 = (class245) arg5;
            if (this.field3557 != null && var9.field3557 != null) {
                this.field3557.method552(var9.field3557, arg3, arg0, arg4, arg2);
            }
        }
        if (arg1 == 47) {
            ++field3569;
        }
    }

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "(I)I", line = 140)
    public final int method136(int arg0) {
        ++field3554;
        if (arg0 != 0) {
            return 43;
        } else {
            return this.field3557 == null ? 0 : this.field3557.method541();
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLja;)Lkh;", line = 152)
    public final class69 method134(byte arg0, class90 arg1) {
        ++field3577;
        if (this.field3557 == null) {
            return null;
        } else {
            class202 var3 = arg1.method709();
            var3.method1527(super.field6520, super.field6506, super.field6519);
            class69 var4 = null;
            if (arg0 <= 90) {
                this.field3557 = null;
            }
            if (this.field3564) {
                var4 = class256.method1849(1, 63);
            }
            this.field3557.method530(var3, var4 != null ? var4.field1128[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)I", line = 184)
    public final int method1024(int arg0) {
        ++field3567;
        if (arg0 != 20691) {
            this.method1023(95);
        }
        return this.field3575;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLja;)V", line = 195)
    public final void method1022(boolean arg0, class90 arg1) {
        ++field3576;
        Object var3 = null;
        class135 var5;
        if (this.field3553 == null && this.field3579) {
            class209 var4 = this.method1778(true, 131072, arg1, arg0);
            var5 = var4 != null ? var4.field3046 : null;
        } else {
            var5 = this.field3553;
            this.field3553 = null;
        }
        if (var5 != null) {
            class365.method2332(var5, this.field3560, super.field6520, super.field6519, (boolean[]) null);
        }
        if (!arg0) {
            this.field3579 = true;
        }
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V", line = 222)
    public final void method1023(int arg0) {
        ++field3562;
        if (this.field3557 != null) {
            this.field3557.method520();
        }
        if (arg0 <= 40) {
            this.method1021((class90) null, 35);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lja;Lfb;IIIIIZIIIIIIZ)V", line = 236)
    public class245(class90 arg0, class45 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field671 == 1, class419.method2626(arg13, 61, arg12));
        this.field3575 = (byte) arg12;
        this.field3564 = arg1.field697 != 0;
        this.field3581 = (byte) arg13;
        this.field3578 = arg7;
        this.field3555 = arg14;
        this.field3558 = (short) arg1.field733;
        this.field3560 = (byte) arg3;
        this.field3579 = arg0.method730() && arg1.field728 && !this.field3578 && ~class238.field3438 != -1;
        int var16 = 1024;
        if (this.field3555) {
            var16 |= 32768;
        }
        class209 var17 = this.method1778(this.field3579, var16, arg0, true);
        if (var17 != null) {
            this.field3553 = var17.field3046;
            this.field3557 = var17.field3048;
            if (this.field3555) {
                this.field3557 = this.field3557.method518((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)I", line = 268)
    public final int method1020(int arg0) {
        ++field3580;
        return arg0 != 15829 ? -63 : this.field3581;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILja;II)Z", line = 282)
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        ++field3563;
        class100 var5 = this.method1783(65536, arg1, (byte) -99);
        if (arg2 != 28033) {
            this.method1023(115);
        }
        if (var5 != null) {
            class202 var6 = arg1.method709();
            var6.method1527(super.field6520, super.field6506, super.field6519);
            return var5.method574(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)I", line = 319)
    public final int method1013(boolean arg0) {
        ++field3556;
        return arg0 ? -110 : 65535 & this.field3558;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Z", line = 331)
    public final boolean method1018(byte arg0) {
        if (arg0 >= -16) {
            return false;
        } else {
            ++field3571;
            return this.field3579;
        }
    }

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)V", line = 345)
    public static final void method1780(int arg0) {
        class389.field5591 = 0;
        ++field3566;
        if (arg0 <= 27) {
            field3582 = null;
        }
        class276.field4153.method147(35);
        class84.field1365 = false;
    }

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "(I)V", line = 362)
    public static void method1781(int arg0) {
        field3582 = null;
        if (arg0 != 5877) {
            method1780(-121);
        }
        field3570 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 373)
    public static final String[] method1782(String[] arg0, int arg1) {
        ++field3551;
        String[] var2 = new String[5];
        for (int var3 = arg1; var3 < 5; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILja;B)Lrc;", line = 395)
    private final class100 method1783(int arg0, class90 arg1, byte arg2) {
        ++field3573;
        if (arg2 > -3) {
            return null;
        } else if (this.field3557 != null && arg1.method677(this.field3557.method560(), arg0) == 0) {
            return this.field3557;
        } else {
            class209 var4 = this.method1778(false, arg0, arg1, true);
            return var4 != null ? var4.field3048 : null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)Z", line = 415)
    public final boolean method53(byte arg0) {
        if (arg0 < 58) {
            this.field3581 = 22;
        }
        ++field3559;
        return this.field3555;
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V", line = 426)
    public final void method54(int arg0) {
        ++field3565;
        this.field3555 = false;
        if (this.field3557 != null) {
            this.field3557.method525(-32769 & this.field3557.method560());
        }
        if (arg0 != 0) {
            this.field3558 = 9;
        }
    }

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)I", line = 442)
    public final int method1784(int arg0) {
        ++field3572;
        int var2 = -34 / ((arg0 - 38) / 63);
        return this.field3557 != null ? this.field3557.method567() / 4 : 15;
    }
}
