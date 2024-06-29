import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class773 extends class399 implements class484 {

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Z")
    private boolean field10617;

    @OriginalMember(owner = "client!hd", name = "mb", descriptor = "Z")
    private boolean field10637;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "B")
    private byte field10610;

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "Z")
    private boolean field10633;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "S")
    private short field10629;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "Z")
    private boolean field10615;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "Lka;")
    private class496 field10627;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lr;")
    private class194 field10626;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field10608;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field10609;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field10611;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field10612;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field10613;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field10614;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field10616;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field10618;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field10619;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field10620;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public static int field10621;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field10622;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public static int field10624;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "I")
    public static int field10625;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    public static int field10628;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "I")
    public static int field10630;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "I")
    public static int field10631;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "I")
    public static int field10632;

    @OriginalMember(owner = "client!hd", name = "jb", descriptor = "I")
    public static int field10634;

    @OriginalMember(owner = "client!hd", name = "kb", descriptor = "I")
    public static int field10635;

    @OriginalMember(owner = "client!hd", name = "lb", descriptor = "I")
    public static int field10636;

    @OriginalMember(owner = "client!hd", name = "nb", descriptor = "I")
    public static int field10638;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "Lrn;")
    private class281 field10623;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public final void method1484(int arg0) {
        if (arg0 > -107) {
            this.method1487(49, (class65) null);
        }
        if (this.field10627 != null) {
            this.field10627.method107();
        }
        ++field10638;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(Z)Z")
    public final boolean method909(boolean arg0) {
        if (arg0) {
            this.method1487(-115, (class65) null);
        }
        ++field10611;
        if (this.field10627 == null) {
            return true;
        } else {
            return !this.field10627.method72();
        }
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
    public final void method903(int arg0) {
        this.field10637 = false;
        if (arg0 == -772) {
            ++field10632;
            if (this.field10627 != null) {
                this.field10627.method111(-65537 & this.field10627.method68());
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;I)Lmaa;")
    public final class495 method918(class65 arg0, int arg1) {
        ++field10636;
        if (this.field10627 == null) {
            return null;
        } else {
            if (arg1 != -30514) {
                this.method1479((byte) 34, (class65) null);
            }
            class326 var3 = arg0.method514();
            var3.method1869(super.field5742, super.field5741, super.field5746);
            class495 var4 = class86.method652(this.field10633, arg1 + 30514, 1);
            if (!class576.field8120) {
                this.field10627.method88(var3, var4.field7067[0], 0);
            } else {
                this.field10627.method106(var3, var4.field7067[0], class740.field10205, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Z")
    public final boolean method1488(byte arg0) {
        int var2 = -53 % ((arg0 - -7) / 60);
        ++field10608;
        return this.field10615;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)I")
    public final int method1478(byte arg0) {
        if (arg0 < 108) {
            this.field10629 = -14;
        }
        ++field10628;
        return this.field10610;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method4258(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field10630;
        if (arg1 >= 512 && arg5 >= 512 && arg1 <= (class768.field10571 - 2) * 512 && (class350.field4898 + -2) * 512 >= arg5) {
            int var10 = -arg7 + class702.method3970(arg1, arg6, -20103, arg5);
            if (class195.field2997) {
                class626.method3602(true, 0);
            } else {
                class494.field7044.method1878(arg8, 0, 0);
                class37.field491.method550(class494.field7044);
            }
            if (!class576.field8120) {
                class37.field491.method485(arg1, var10, arg5, class470.field6591);
            } else {
                class37.field491.method435(arg1, var10, arg5, class740.field10205, class470.field6591);
            }
            if (arg2 == -125) {
                if (class195.field2997) {
                    class128.method958((byte) 91);
                } else {
                    class494.field7044.method1878(-arg8, 0, 0);
                    class37.field491.method550(class494.field7044);
                }
            }
        } else {
            class470.field6591[0] = class470.field6591[1] = -1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILha;)V")
    public final void method1487(int arg0, class65 arg1) {
        int var3 = 52 % ((arg0 - 4) / 39);
        ++field10616;
        Object var4 = null;
        class194 var6;
        if (this.field10626 == null && this.field10615) {
            class547 var5 = this.method4260(arg1, 262144, true, true);
            var6 = var5 != null ? var5.field7863 : null;
        } else {
            var6 = this.field10626;
            this.field10626 = null;
        }
        if (var6 != null) {
            class46.method336(var6, super.field5749, super.field5742, super.field5746, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lha;I)Lrn;")
    public final class281 method901(class65 arg0, int arg1) {
        if (this.field10623 == null) {
            this.field10623 = class490.method2922((byte) 121, super.field5742, this.method4259(-24935, arg0, 0), super.field5746, super.field5741);
        }
        if (arg1 < 50) {
            this.method4259(-110, (class65) null, 29);
        }
        ++field10624;
        return this.field10623;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
    public final int method1483(int arg0) {
        if (arg0 != 24853) {
            this.field10610 = -9;
        }
        ++field10612;
        return this.field10629 & 65535;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)Z")
    public final boolean method910(boolean arg0) {
        ++field10635;
        if (!arg0) {
            this.field10627 = null;
        }
        return this.field10637;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)I")
    public final int method1482(boolean arg0) {
        ++field10614;
        if (!arg0) {
            this.field10629 = 13;
        }
        return 22;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLje;IIILha;I)V")
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        ++field10625;
        if (arg1 instanceof class773) {
            class773 var8 = (class773) arg1;
            if (this.field10627 != null && var8.field10627 != null) {
                this.field10627.method67(var8.field10627, arg4, arg6, arg3, arg0);
            }
        }
        if (arg2 != 0) {
            this.field10615 = true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLha;)V")
    public final void method1479(byte arg0, class65 arg1) {
        ++field10621;
        Object var3 = null;
        class194 var5;
        if (this.field10626 == null && this.field10615) {
            class547 var4 = this.method4260(arg1, 262144, true, true);
            var5 = var4 == null ? null : var4.field7863;
        } else {
            var5 = this.field10626;
            this.field10626 = null;
        }
        if (var5 != null) {
            class759.method4223(var5, super.field5749, super.field5742, super.field5746, (boolean[]) null);
        }
        int var6 = 98 % ((arg0 - -19) / 48);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(ILha;)V")
    public final void method912(int arg0, class65 arg1) {
        if (arg0 > 52) {
            ++field10634;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lha;Lkv;IIIIIZIZ)V")
    public class773(class65 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4180);
        this.field10617 = arg7;
        this.field10637 = arg9;
        super.field5746 = arg6;
        this.field10610 = (byte) arg8;
        this.field10633 = ~arg1.field4149 != -1 && !arg7;
        super.field5742 = arg4;
        this.field10629 = (short) arg1.field4100;
        this.field10615 = arg0.method483() && arg1.field4115 && !this.field10617 && class21.field353.field10062.method4001(-44) != 0;
        int var11 = 2048;
        if (this.field10637) {
            var11 |= 65536;
        }
        class547 var12 = this.method4260(arg0, var11, this.field10615, true);
        if (var12 != null) {
            this.field10627 = var12.field7866;
            this.field10626 = var12.field7863;
            if (this.field10637) {
                this.field10627 = this.field10627.method93((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)I")
    public final int method917(int arg0) {
        ++field10631;
        if (arg0 != -1760267218) {
            this.field10617 = false;
        }
        return this.field10627 != null ? this.field10627.method75() : 0;
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)Z")
    public final boolean method906(int arg0) {
        ++field10619;
        int var2 = 0 % ((11 - arg0) / 35);
        return this.field10627 != null ? this.field10627.method121() : false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILha;I)Lka;")
    private final class496 method4259(int arg0, class65 arg1, int arg2) {
        ++field10609;
        if (this.field10627 != null && arg1.method512(this.field10627.method68(), arg2) == 0) {
            return this.field10627;
        } else {
            class547 var4 = this.method4260(arg1, arg2, false, true);
            if (arg0 != -24935) {
                this.field10615 = true;
            }
            return var4 != null ? var4.field7866 : null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;IZZ)Lbaa;")
    private final class547 method4260(class65 arg0, int arg1, boolean arg2, boolean arg3) {
        ++field10620;
        class282 var5 = class277.field4038.method3919(arg3, this.field10629 & 65535);
        class294 var6;
        class294 var7;
        if (!this.field10617) {
            if (super.field5749 >= 3) {
                var6 = null;
            } else {
                var6 = class411.field5572[super.field5749 + 1];
            }
            var7 = class411.field5572[super.field5749];
        } else {
            var7 = class774.field10642[super.field5749];
            var6 = class411.field5572[0];
        }
        return var5.method1827((byte) 121, 22, arg1, (class520) null, arg0, var6, var7, arg2, super.field5742, super.field5741, super.field5746, this.field10610);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;Lmea;I)V")
    public static final void method4261(class65 arg0, class451 arg1, int arg2) {
        ++field10613;
        if (arg2 == -19780) {
            boolean var3 = class313.field4456.method1676(arg1.field6204 ? class210.field3250.field9765 : null, 40, arg1.field6183, arg1.field6303, arg0, arg1.field6268, arg1.field6318, arg1.field6282 | -16777216) == null;
            if (var3) {
                class543.field7798.method1727(new class70(arg1.field6183, arg1.field6268, arg1.field6303, arg1.field6282 | -16777216, arg1.field6318, arg1.field6204), (byte) 103);
                class564.method3329(arg1, 8195);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)I")
    public final int method916(boolean arg0) {
        if (!arg0) {
            this.method1488((byte) -31);
        }
        ++field10618;
        return this.field10627 != null ? this.field10627.method118() : 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        ++field10622;
        if (arg1 != -17458) {
            this.method901((class65) null, 12);
        }
        class496 var5 = this.method4259(-24935, arg3, 131072);
        if (var5 != null) {
            class326 var6 = arg3.method514();
            var6.method1869(super.field5742, super.field5741, super.field5746);
            return !class576.field8120 ? var5.method95(arg0, arg2, var6, false, 0) : var5.method77(arg0, arg2, var6, false, 0, class740.field10205);
        } else {
            return false;
        }
    }
}
