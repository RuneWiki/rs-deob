import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class761 extends class649 implements class624 {

    @OriginalMember(owner = "client!eca", name = "pb", descriptor = "B")
    private byte field10606;

    @OriginalMember(owner = "client!eca", name = "qb", descriptor = "S")
    private short field10607;

    @OriginalMember(owner = "client!eca", name = "P", descriptor = "Z")
    private boolean field10580;

    @OriginalMember(owner = "client!eca", name = "T", descriptor = "Z")
    private boolean field10584;

    @OriginalMember(owner = "client!eca", name = "Y", descriptor = "B")
    private byte field10589;

    @OriginalMember(owner = "client!eca", name = "cb", descriptor = "Z")
    private boolean field10593;

    @OriginalMember(owner = "client!eca", name = "U", descriptor = "Z")
    private boolean field10585;

    @OriginalMember(owner = "client!eca", name = "ob", descriptor = "Lka;")
    public class475 field10605;

    @OriginalMember(owner = "client!eca", name = "L", descriptor = "Lr;")
    private class184 field10576;

    @OriginalMember(owner = "client!eca", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field10588 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!eca", name = "M", descriptor = "I")
    public static int field10577;

    @OriginalMember(owner = "client!eca", name = "N", descriptor = "I")
    public static int field10578;

    @OriginalMember(owner = "client!eca", name = "O", descriptor = "I")
    public static int field10579;

    @OriginalMember(owner = "client!eca", name = "R", descriptor = "I")
    public static int field10582;

    @OriginalMember(owner = "client!eca", name = "S", descriptor = "I")
    public static int field10583;

    @OriginalMember(owner = "client!eca", name = "V", descriptor = "I")
    public static int field10586;

    @OriginalMember(owner = "client!eca", name = "W", descriptor = "I")
    public static int field10587;

    @OriginalMember(owner = "client!eca", name = "Z", descriptor = "I")
    public static int field10590;

    @OriginalMember(owner = "client!eca", name = "ab", descriptor = "I")
    public static int field10591;

    @OriginalMember(owner = "client!eca", name = "bb", descriptor = "I")
    public static int field10592;

    @OriginalMember(owner = "client!eca", name = "db", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!eca", name = "eb", descriptor = "I")
    public static int field10595;

    @OriginalMember(owner = "client!eca", name = "fb", descriptor = "I")
    public static int field10596;

    @OriginalMember(owner = "client!eca", name = "gb", descriptor = "I")
    public static int field10597;

    @OriginalMember(owner = "client!eca", name = "hb", descriptor = "I")
    public static int field10598;

    @OriginalMember(owner = "client!eca", name = "ib", descriptor = "I")
    public static int field10599;

    @OriginalMember(owner = "client!eca", name = "jb", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!eca", name = "kb", descriptor = "I")
    public static int field10601;

    @OriginalMember(owner = "client!eca", name = "lb", descriptor = "I")
    public static int field10602;

    @OriginalMember(owner = "client!eca", name = "mb", descriptor = "I")
    public static int field10603;

    @OriginalMember(owner = "client!eca", name = "nb", descriptor = "I")
    public static int field10604;

    @OriginalMember(owner = "client!eca", name = "Q", descriptor = "Lck;")
    private class642 field10581;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "(B)I", line = 5)
    public final int method791(byte arg0) {
        if (arg0 <= 81) {
            return 81;
        } else {
            ++field10597;
            return this.field10605 == null ? 0 : this.field10605.method167();
        }
    }

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "(I)Z", line = 16)
    public final boolean method798(int arg0) {
        int var2 = 104 % ((arg0 - 53) / 45);
        ++field10596;
        return this.field10584;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLha;)Lck;", line = 27)
    public final class642 method808(byte arg0, class59 arg1) {
        if (this.field10581 == null) {
            this.field10581 = class549.method3072(super.field3502, super.field3505, super.field3510, 544, this.method4235((byte) 25, arg1, 0));
        }
        if (arg0 > -86) {
            return null;
        } else {
            ++field10604;
            return this.field10581;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lha;IZI)Lga;", line = 43)
    private final class407 method4232(class59 arg0, int arg1, boolean arg2, int arg3) {
        ++field10579;
        class100 var5 = class462.field6333.method2008((byte) -25, this.field10607 & 65535);
        if (arg1 != 3) {
            return null;
        } else {
            class282 var6;
            class282 var7;
            if (!this.field10593) {
                if (super.field3515 < 3) {
                    var6 = class113.field1866[super.field3515 - -1];
                } else {
                    var6 = null;
                }
                var7 = class113.field1866[super.field3515];
            } else {
                var7 = class588.field7675[super.field3515];
                var6 = class113.field1866[0];
            }
            return var5.method736(this.field10589, arg2, (class379) null, arg3, super.field3510, arg0, (byte) -127, super.field3502, this.field10606, super.field3505, var7, var6);
        }
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)I", line = 75)
    public final int method1757(byte arg0) {
        ++field10577;
        int var2 = 60 / ((arg0 - -57) / 53);
        return this.field10606;
    }

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "(B)Z", line = 86)
    public final boolean method806(byte arg0) {
        ++field10594;
        int var2 = 42 % ((14 - arg0) / 57);
        if (this.field10605 == null) {
            return true;
        } else {
            return !this.field10605.method192();
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLha;)V", line = 100)
    public final void method1756(boolean arg0, class59 arg1) {
        ++field10592;
        Object var3 = null;
        class184 var5;
        if (this.field10576 == null && this.field10585) {
            class407 var4 = this.method4232(arg1, 3, true, 262144);
            var5 = var4 == null ? null : var4.field5657;
        } else {
            var5 = this.field10576;
            this.field10576 = null;
        }
        if (!arg0) {
            method4233(-77);
        }
        if (var5 != null) {
            class265.method1601(var5, super.field3515, super.field3505, super.field3502, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "(I)V", line = 128)
    public static void method4233(int arg0) {
        field10588 = null;
        if (arg0 != 65535) {
            method4234(44, 19);
        }
    }

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "(I)V", line = 140)
    public final void method803(int arg0) {
        ++field10590;
        if (arg0 == 131072) {
            this.field10584 = false;
            if (this.field10605 != null) {
                this.field10605.method190(-65537 & this.field10605.method214());
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(ILha;)Lww;", line = 158)
    public final class733 method800(int arg0, class59 arg1) {
        ++field10587;
        if (this.field10605 == null) {
            return null;
        } else {
            class333 var3 = arg1.method451();
            var3.method1727(super.field3505, super.field3510, super.field3502);
            if (arg0 != -1) {
                this.field10580 = false;
            }
            class733 var4 = class397.method2338(this.field10580, (byte) 120, 1);
            if (class540.field7159) {
                this.field10605.method160(var3, var4.field10150[0], class100.field1358, 0);
            } else {
                this.field10605.method155(var3, var4.field10150[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lha;Lqfa;IIIIIZIIZ)V", line = 185)
    public class761(class59 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class200.method1349(arg9, arg8, 3));
        this.field10606 = (byte) arg8;
        super.field3502 = arg6;
        this.field10607 = (short) arg1.field1301;
        super.field3505 = arg4;
        this.field10580 = ~arg1.field1363 != -1 && !arg7;
        this.field10584 = arg10;
        this.field10589 = (byte) arg9;
        this.field10593 = arg7;
        this.field10585 = arg0.method468() && arg1.field1343 && !this.field10593 && ~class411.field5711.field3897.method1057(true) != -1;
        int var12 = 2048;
        if (this.field10584) {
            var12 |= 65536;
        }
        class407 var13 = this.method4232(arg0, 3, this.field10585, var12);
        if (var13 != null) {
            this.field10605 = var13.field5651;
            this.field10576 = var13.field5657;
            if (this.field10584) {
                this.field10605 = this.field10605.method171((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lha;B)V", line = 219)
    public final void method792(class59 arg0, byte arg1) {
        if (arg1 < 121) {
            field10588 = null;
        }
        ++field10600;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)I", line = 240)
    public final int method1759(byte arg0) {
        ++field10578;
        if (arg0 <= 63) {
            this.field10585 = false;
        }
        return 65535 & this.field10607;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILha;)V", line = 254)
    public final void method1758(int arg0, class59 arg1) {
        if (arg0 == 6120) {
            ++field10591;
            Object var3 = null;
            class184 var5;
            if (this.field10576 == null && this.field10585) {
                class407 var4 = this.method4232(arg1, 3, true, 262144);
                var5 = var4 == null ? null : var4.field5657;
            } else {
                var5 = this.field10576;
                this.field10576 = null;
            }
            if (var5 != null) {
                class562.method3115(var5, super.field3515, super.field3505, super.field3502, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)Z", line = 284)
    public final boolean method1761(int arg0) {
        if (arg0 != -28823) {
            this.field10585 = false;
        }
        ++field10598;
        return this.field10585;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)V", line = 295)
    public static final void method4234(int arg0, int arg1) {
        ++field10586;
        if (arg0 > -37) {
            field10588 = null;
        }
        class127 var2 = class760.method4231(arg1, -874792672, 14);
        var2.method1002(-70);
    }

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "(I)I", line = 311)
    public final int method789(int arg0) {
        ++field10595;
        if (arg0 != -32768) {
            this.method808((byte) -56, (class59) null);
        }
        return this.field10605 != null ? this.field10605.method180() : 0;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z)V", line = 323)
    public final void method1754(boolean arg0) {
        ++field10603;
        if (!arg0) {
            this.method800(85, (class59) null);
        }
        if (this.field10605 != null) {
            this.field10605.method181();
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lkf;Lha;IIIZI)V", line = 338)
    public final void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 >= 109) {
            if (arg0 instanceof class761) {
                class761 var8 = (class761) arg0;
                if (this.field10605 != null && var8.field10605 != null) {
                    this.field10605.method170(var8.field10605, arg2, arg6, arg4, arg5);
                }
            } else if (arg0 instanceof class389) {
                class389 var9 = (class389) arg0;
                if (this.field10605 != null && var9.field5435 != null) {
                    this.field10605.method170(var9.field5435, arg2, arg6, arg4, arg5);
                }
            }
            ++field10583;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLha;I)Lka;", line = 369)
    private final class475 method4235(byte arg0, class59 arg1, int arg2) {
        ++field10599;
        if (this.field10605 != null && arg1.method405(this.field10605.method214(), arg2) == 0) {
            return this.field10605;
        } else {
            class407 var4 = this.method4232(arg1, 3, false, arg2);
            if (arg0 < 22) {
                this.field10584 = true;
            }
            return var4 != null ? var4.field5651 : null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)I", line = 389)
    public final int method1752(byte arg0) {
        ++field10582;
        if (arg0 != -111) {
            this.field10605 = null;
        }
        return this.field10589;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lha;IIB)Z", line = 402)
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field10601;
        if (arg3 != 103) {
            this.method1761(119);
        }
        class475 var5 = this.method4235((byte) 52, arg0, 131072);
        if (var5 != null) {
            class333 var6 = arg0.method451();
            var6.method1727(super.field3505, super.field3510, super.field3502);
            return class540.field7159 ? var5.method203(arg2, arg1, var6, false, 0, class100.field1358) : var5.method158(arg2, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(Z)Z", line = 425)
    public final boolean method801(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field10602;
            return this.field10605 != null ? this.field10605.method159() : false;
        }
    }
}
