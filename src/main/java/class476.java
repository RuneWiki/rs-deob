import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class476 extends class471 implements class381 {

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "B")
    private byte field6555;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "B")
    private byte field6547;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "Z")
    private boolean field6551;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "Z")
    private boolean field6545;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "Z")
    private boolean field6563;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "S")
    private short field6558;

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "B")
    private byte field6571;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "Z")
    private boolean field6565;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "Lgn;")
    public class456 field6567;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "Lkb;")
    private class449 field6560;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method7(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field6562;
            return this.field6565;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)Lgq;", line = 16)
    public static final class327 method2778(int arg0, int arg1, int arg2) {
        class491 var3 = class289.field3897[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6847;
    }

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "(I)V", line = 24)
    public static final void method2779(int arg0) {
        if (class280.field3743 != null) {
            class280.field3743.method2310(-125);
            class280.field3743 = null;
        }
        ++field6554;
        class412.method2470(0);
        class235.method1309();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class60.field805[var1].method1469(-113);
        }
        class294.method1651(false, 64);
        System.gc();
        class449.method2641(2, 2);
        class219.field2925 = false;
        class60.field811 = -1;
        class263.method1489(16955, true);
        class162.field2260 = 0;
        class391.field5426 = 0;
        class323.field4311 = false;
        class4.field60 = 0;
        class266.field3511 = 0;
        for (int var2 = 0; ~class88.field1295.length < ~var2; ++var2) {
            class88.field1295[var2] = null;
        }
        class345.method2116(-1);
        for (int var3 = 0; ~var3 > -2049; ++var3) {
            class413.field5644[var3] = null;
        }
        class202.field2734 = 0;
        for (int var4 = 0; ~var4 > -32769; ++var4) {
            class221.field2941[var4] = null;
        }
        class33.field505.method1519(-16576);
        class35.method264((byte) 36);
        class45.field618 = arg0;
        class38.field562.method1944((byte) 9);
        class70.method459((byte) 69);
        class71.method460(false);
        class88.method566(true, false);
        try {
            class361.method2207(class251.field3359.field3209, "loggedout", (byte) -64);
        } catch (Throwable var5) {
        }
        class385.field5339 = 0L;
        class299.field4003 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIILwm;ZLhp;Z)V", line = 96)
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        ++field6561;
        if (!arg6) {
            this.method4(97);
        }
        if (!(arg5 instanceof class486)) {
            if (arg5 instanceof class476) {
                class476 var8 = (class476) arg5;
                if (this.field6567 != null && var8.field6567 != null) {
                    this.field6567.method1869(var8.field6567, arg0, arg2, arg1, arg4);
                    return;
                }
            }
        } else {
            class486 var9 = (class486) arg5;
            if (this.field6567 == null || var9.field6736 == null) {
                return;
            }
            this.field6567.method1869(var9.field6736, arg0, arg2, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Lwm;B)Lnf;", line = 126)
    public final class374 method3(class364 arg0, byte arg1) {
        ++field6557;
        if (this.field6567 == null) {
            return null;
        } else {
            class203 var3 = arg0.method1960();
            var3.method1029(super.field6501, super.field6503, super.field6507);
            if (arg1 <= 99) {
                this.field6567 = null;
            }
            class374 var4 = null;
            if (this.field6545) {
                var4 = class358.method2196(1, (byte) -54);
            }
            this.field6567.method1880(var3, var4 == null ? null : var4.field5156[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)Z", line = 154)
    public final boolean method17(int arg0) {
        if (arg0 != 7) {
            return true;
        } else {
            ++field6573;
            return this.field6551;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 165)
    public final void method1(int arg0) {
        if (arg0 > -105) {
            this.method8(54);
        }
        if (this.field6567 != null) {
            this.field6567.method1843();
        }
        ++field6569;
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)I", line = 178)
    public final int method13(int arg0) {
        if (arg0 <= 51) {
            this.field6560 = null;
        }
        ++field6543;
        return 65535 & this.field6558;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILwm;)Lgn;", line = 190)
    private final class456 method2780(int arg0, int arg1, class364 arg2) {
        ++field6566;
        if (arg1 != -2049) {
            return null;
        } else if (this.field6567 != null && ~arg2.method2103(this.field6567.method1863(), arg0) == -1) {
            return this.field6567;
        } else {
            class266 var4 = this.method2782((byte) -108, false, arg2, arg0);
            return var4 != null ? var4.field3514 : null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "(I)I", line = 210)
    public final int method6(int arg0) {
        ++field6548;
        if (arg0 != 0) {
            this.method2783(60);
        }
        return this.field6567 != null ? this.field6567.method1871() : 0;
    }

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "(I)V", line = 223)
    public static final void method2781(int arg0) {
        ++field6570;
        class453.field6147.method2087(((float) class488.field6789.field6664 * 0.1F + 0.7F) * 1.1523438F);
        class453.field6147.method2075(class425.field5768, 0.69921875F, 1.2F, -50.0F, (float) arg0, -50.0F);
        class453.field6147.method2108(class483.field6661, -1);
        class453.field6147.method2112(class36.field546);
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V", line = 236)
    public final void method8(int arg0) {
        this.field6551 = false;
        ++field6572;
        if (this.field6567 != null) {
            this.field6567.method1841(this.field6567.method1863() & -32769);
        }
        if (arg0 >= -74) {
            this.field6545 = false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLwm;)V", line = 255)
    public final void method12(byte arg0, class364 arg1) {
        ++field6559;
        Object var3 = null;
        if (arg0 > 27) {
            class449 var5;
            if (this.field6560 == null && this.field6565) {
                class266 var4 = this.method2782((byte) -116, true, arg1, 131072);
                var5 = var4 == null ? null : var4.field3512;
            } else {
                var5 = this.field6560;
                this.field6560 = null;
            }
            if (var5 != null) {
                class252.method1412(var5, this.field6547, super.field6501, super.field6507, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BZLwm;I)Lij;", line = 283)
    private final class266 method2782(byte arg0, boolean arg1, class364 arg2, int arg3) {
        ++field6546;
        class88 var5 = class1.field23.method935(this.field6558 & 65535, (byte) 71);
        class177 var6;
        class177 var7;
        if (!this.field6563) {
            var6 = class289.field3896[this.field6547];
            if (this.field6547 < 3) {
                var7 = class289.field3896[this.field6547 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class289.field3896[0];
            var6 = class312.field4112[this.field6547];
        }
        if (arg0 > -99) {
            this.field6547 = -123;
        }
        return var5.method560(super.field6503, var6, this.field6555 == 11 ? this.field6571 + 4 : this.field6571, super.field6507, super.field6501, false, arg3, arg1, arg2, var7, ~this.field6555 == -12 ? 10 : this.field6555);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lwm;B)V", line = 315)
    public final void method10(class364 arg0, byte arg1) {
        ++field6544;
        if (arg1 >= -48) {
            this.field6551 = false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I", line = 326)
    public final int method4(int arg0) {
        if (arg0 != -10666) {
            method2779(12);
        }
        ++field6549;
        return this.field6555;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILwm;I)Lgn;", line = 338)
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        ++field6553;
        if (arg2 != -28045) {
            this.method14(-25, -106, (byte) 112, (class364) null);
        }
        return this.method2780(arg0, -2049, arg1);
    }

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "(I)I", line = 350)
    public final int method2783(int arg0) {
        int var2 = -125 / ((arg0 - 19) / 44);
        ++field6550;
        return this.field6567 != null ? this.field6567.method1868() / 4 : 15;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBLwm;)Z", line = 361)
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        ++field6564;
        class456 var5 = this.method2780(65536, -2049, arg3);
        if (var5 != null) {
            class203 var6 = arg3.method1960();
            var6.method1029(super.field6501, super.field6503, super.field6507);
            return var5.method1882(arg0, arg1, var6, false);
        } else {
            if (arg2 > -107) {
                this.field6551 = true;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)I", line = 382)
    public final int method9(int arg0) {
        if (arg0 != -769) {
            return 83;
        } else {
            ++field6552;
            return this.field6571;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lwm;Lct;IIIIIZIIIIIIZ)V", line = 395)
    public class476(class364 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1302 == -2, class186.method1076(arg13, true, arg12));
        this.field6555 = (byte) arg12;
        this.field6547 = (byte) arg3;
        this.field6551 = arg14;
        this.field6545 = arg1.field1265 != 0 && !arg7;
        this.field6563 = arg7;
        this.field6558 = (short) arg1.field1298;
        this.field6571 = (byte) arg13;
        this.field6565 = arg0.method2011() && arg1.field1264 && !this.field6563 && ~class488.field6789.field6682 != -1;
        int var16 = 1024;
        if (this.field6551) {
            var16 |= 32768;
        }
        class266 var17 = this.method2782((byte) -111, this.field6565, arg0, var16);
        if (var17 != null) {
            this.field6567 = var17.field3514;
            this.field6560 = var17.field3512;
            if (this.field6551) {
                this.field6567 = this.field6567.method1893((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lwm;I)V", line = 429)
    public final void method16(class364 arg0, int arg1) {
        ++field6556;
        if (arg1 == 31591) {
            Object var3 = null;
            class449 var5;
            if (this.field6560 == null && this.field6565) {
                class266 var4 = this.method2782((byte) -121, true, arg0, 131072);
                var5 = var4 != null ? var4.field3512 : null;
            } else {
                var5 = this.field6560;
                this.field6560 = null;
            }
            if (var5 != null) {
                class318.method1742(var5, this.field6547, super.field6501, super.field6507, (boolean[]) null);
            }
        }
    }
}
