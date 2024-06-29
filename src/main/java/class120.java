import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class120 extends class29 implements class599 {

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "B")
    private byte field1532;

    @OriginalMember(owner = "client!ud", name = "yb", descriptor = "Z")
    private boolean field1560;

    @OriginalMember(owner = "client!ud", name = "tb", descriptor = "Z")
    private boolean field1555;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "B")
    private byte field1527;

    @OriginalMember(owner = "client!ud", name = "sb", descriptor = "Z")
    private boolean field1554;

    @OriginalMember(owner = "client!ud", name = "ib", descriptor = "S")
    private short field1544;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "Z")
    private boolean field1535;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "Lha;")
    private class117 field1542;

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "Lda;")
    public class470 field1547;

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "Z")
    public static boolean field1546 = false;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public static int field1537 = -1;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ud", name = "mb", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ud", name = "nb", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!ud", name = "ob", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ud", name = "qb", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ud", name = "rb", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ud", name = "ub", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ud", name = "vb", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ud", name = "wb", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ud", name = "xb", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ud", name = "pb", descriptor = "Lcu;")
    private class475 field1551;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "[Lgg;")
    public static class293[] field1534;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V", line = 5)
    public final void method175(byte arg0) {
        ++field1558;
        if (arg0 > 24) {
            this.field1554 = false;
            if (this.field1547 != null) {
                this.field1547.method602(this.field1547.method604() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILir;ZILr;IB)V", line = 21)
    public final void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6) {
        if (arg6 >= -117) {
            method702(23, 118, 84);
        }
        ++field1526;
        if (arg1 instanceof class617) {
            class617 var8 = (class617) arg1;
            if (this.field1547 != null && var8.field8548 != null) {
                this.field1547.method617(var8.field8548, arg5, arg3, arg0, arg2);
            }
        } else {
            if (arg1 instanceof class120) {
                class120 var9 = (class120) arg1;
                if (this.field1547 != null && var9.field1547 != null) {
                    this.field1547.method617(var9.field1547, arg5, arg3, arg0, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLr;)Lqw;", line = 52)
    public final class329 method165(byte arg0, class562 arg1) {
        if (arg0 < 109) {
            this.method701(121);
        }
        ++field1559;
        if (this.field1547 == null) {
            return null;
        } else {
            class487 var3 = arg1.method1153();
            var3.method359(super.field398, super.field388, super.field397);
            class329 var4 = null;
            if (this.field1560) {
                var4 = class541.method3035(27479, 1);
            }
            if (class347.field4632) {
                this.field1547.method648(var3, var4 != null ? var4.field4414[0] : null, class414.field5430, 0);
            } else {
                this.field1547.method625(var3, var4 == null ? null : var4.field4414[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lr;Ltc;IIIIIZIIIIIIZ)V", line = 82)
    public class120(class562 arg0, class600 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field8322 == -2, class627.method3475(arg12, arg13, true));
        this.field1532 = (byte) arg13;
        this.field1560 = ~arg1.field8293 != -1 && !arg7;
        super.field386 = (byte) arg3;
        this.field1555 = arg7;
        this.field1527 = (byte) arg12;
        this.field1554 = arg14;
        this.field1544 = (short) arg1.field8345;
        this.field1535 = arg0.method1084() && arg1.field8305 && !this.field1555 && class602.field8408.method1870((byte) -45, class618.field8566) != 0;
        int var16 = 2048;
        if (this.field1554) {
            var16 |= 65536;
        }
        class606 var17 = this.method711(arg0, var16, this.field1535, 124);
        if (var17 != null) {
            this.field1542 = var17.field8446;
            this.field1547 = var17.field8448;
            if (this.field1554) {
                this.field1547 = this.field1547.method649((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)I", line = 114)
    public final int method699(byte arg0) {
        if (arg0 > -32) {
            return 100;
        } else {
            ++field1540;
            return this.field1527;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lr;I)V", line = 126)
    public final void method700(class562 arg0, int arg1) {
        if (arg1 == -21186) {
            ++field1536;
            Object var3 = null;
            class117 var5;
            if (this.field1542 == null && this.field1535) {
                class606 var4 = this.method711(arg0, 262144, true, 102);
                var5 = var4 == null ? null : var4.field8446;
            } else {
                var5 = this.field1542;
                this.field1542 = null;
            }
            if (var5 != null) {
                class201.method1287(var5, super.field386, super.field398, super.field397, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "(I)I", line = 156)
    public final int method701(int arg0) {
        int var2 = 60 / ((arg0 - 12) / 52);
        ++field1549;
        return this.field1547 == null ? 15 : this.field1547.method636() / 4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z", line = 166)
    public static final boolean method702(int arg0, int arg1, int arg2) {
        if (arg0 < 26) {
            field1534 = null;
        }
        ++field1531;
        return ~(1408 & arg1) != -1;
    }

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)Z", line = 182)
    public final boolean method168(int arg0) {
        if (arg0 != 20071) {
            return true;
        } else {
            ++field1543;
            return this.field1547 == null ? false : this.field1547.method657();
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 197)
    public final void method703(int arg0) {
        ++field1529;
        if (this.field1547 != null) {
            this.field1547.method634();
        }
        if (arg0 != 6956) {
            this.method711((class562) null, -122, false, -93);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V", line = 216)
    public static final void method704(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            field1534 = null;
        }
        ++field1528;
        if (class281.field3703 <= arg0 && ~arg0 >= ~class255.field3350) {
            int var5 = class496.method2826(arg2, (byte) 36, class6.field66, class151.field2071);
            int var6 = class496.method2826(arg1, (byte) 36, class6.field66, class151.field2071);
            class499.method2835(arg0, var6, 0, var5, arg4);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Z", line = 233)
    public final boolean method705(int arg0) {
        if (arg0 < 67) {
            this.field1560 = false;
        }
        ++field1550;
        return this.field1535;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I", line = 245)
    public final int method706(int arg0) {
        if (arg0 != 16259) {
            return 103;
        } else {
            ++field1552;
            return this.field1532;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lr;B)V", line = 256)
    public final void method707(class562 arg0, byte arg1) {
        ++field1525;
        Object var3 = null;
        class117 var5;
        if (this.field1542 == null && this.field1535) {
            class606 var4 = this.method711(arg0, 262144, true, 112);
            var5 = var4 == null ? null : var4.field8446;
        } else {
            var5 = this.field1542;
            this.field1542 = null;
        }
        int var6 = -11 % ((-28 - arg1) / 54);
        if (var5 != null) {
            class614.method3395(var5, super.field386, super.field398, super.field397, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "(I)V", line = 285)
    public static void method708(int arg0) {
        field1534 = null;
        if (arg0 != 1) {
            method702(26, -58, 79);
        }
    }

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "(I)I", line = 298)
    public final int method173(int arg0) {
        ++field1539;
        if (arg0 != 0) {
            this.method711((class562) null, -56, true, -16);
        }
        return this.field1547 != null ? this.field1547.method621() : 0;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Lr;I)Lcu;", line = 309)
    public final class475 method174(class562 arg0, int arg1) {
        if (this.field1551 == null) {
            this.field1551 = class258.method1562(super.field398, (byte) -47, super.field397, this.method709((byte) -105, arg0, 0), super.field388);
        }
        if (arg1 != -14700) {
            this.method168(79);
        }
        ++field1548;
        return this.field1551;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLr;I)Lda;", line = 324)
    private final class470 method709(byte arg0, class562 arg1, int arg2) {
        ++field1545;
        if (this.field1547 != null && arg1.method1053(this.field1547.method604(), arg2) == 0) {
            return this.field1547;
        } else {
            int var4 = 21 % ((arg0 - -51) / 44);
            class606 var5 = this.method711(arg1, arg2, false, 109);
            return var5 != null ? var5.field8448 : null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)Z", line = 344)
    public final boolean method166(int arg0) {
        ++field1533;
        return arg0 != 0 ? false : this.field1554;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lr;Z)V", line = 356)
    public final void method177(class562 arg0, boolean arg1) {
        ++field1541;
        if (!arg1) {
            field1534 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)I", line = 369)
    public final int method176(byte arg0) {
        ++field1557;
        if (arg0 >= -114) {
            return -43;
        } else {
            return this.field1547 != null ? this.field1547.method613() : 0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)Z", line = 386)
    public final boolean method161(int arg0) {
        ++field1556;
        return arg0 == 28602;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)I", line = 398)
    public final int method710(byte arg0) {
        if (arg0 < 55) {
            this.field1527 = 13;
        }
        ++field1530;
        return this.field1544 & 65535;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lr;IZI)Lht;", line = 409)
    private final class606 method711(class562 arg0, int arg1, boolean arg2, int arg3) {
        ++field1553;
        class600 var5 = class118.field1510.method3921(65535 & this.field1544, -86);
        class270 var6;
        class270 var7;
        if (!this.field1555) {
            var6 = class454.field5981[super.field386];
            if (~super.field386 <= -4) {
                var7 = null;
            } else {
                var7 = class454.field5981[super.field386 + 1];
            }
        } else {
            var7 = class454.field5981[0];
            var6 = class446.field5914[super.field386];
        }
        if (arg3 <= 90) {
            this.method177((class562) null, false);
        }
        return var5.method3321(super.field388, ~this.field1527 != -12 ? this.field1532 : this.field1532 + 4, arg2, arg0, super.field397, false, super.field398, arg1, ~this.field1527 == -12 ? 10 : this.field1527, var7, var6);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLr;II)Z", line = 439)
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        if (arg0) {
            return true;
        } else {
            ++field1538;
            class470 var5 = this.method709((byte) -118, arg1, 131072);
            if (var5 != null) {
                class487 var6 = arg1.method1153();
                var6.method359(super.field398, super.field388, super.field397);
                return class347.field4632 ? var5.method603(arg3, arg2, var6, false, class414.field5430) : var5.method655(arg3, arg2, var6, false);
            } else {
                return false;
            }
        }
    }
}
