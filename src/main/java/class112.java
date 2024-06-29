import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class112 extends class147 implements class425 {

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "Z")
    private boolean field1579;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "Z")
    private boolean field1582;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "S")
    private short field1588;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "Z")
    private boolean field1593;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "B")
    private byte field1573;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "B")
    private byte field1585;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Z")
    private boolean field1581;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "Ldc;")
    private class375 field1589;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "Lri;")
    private class98 field1586;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1583 = "Ok";

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field1574 = 0;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field1577 = 0;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "Llm;")
    public static class347 field1599;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public final void method112(byte arg0) {
        if (this.field1589 != null) {
            this.field1589.method1598();
        }
        ++field1570;
        if (arg0 >= -108) {
            this.method120(-39);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLii;)V")
    public final void method102(byte arg0, class405 arg1) {
        if (arg0 == 76) {
            ++field1587;
            Object var3 = null;
            class98 var5;
            if (this.field1586 == null && this.field1581) {
                class386 var4 = this.method733(131072, arg1, true, true);
                var5 = var4 == null ? null : var4.field5595;
            } else {
                var5 = this.field1586;
                this.field1586 = null;
            }
            if (var5 != null) {
                class161.method995(var5, this.field1573, super.field2012, super.field2010, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILii;I)Ldc;")
    public final class375 method111(int arg0, class405 arg1, int arg2) {
        if (arg2 <= 27) {
            this.method112((byte) -12);
        }
        ++field1580;
        return this.method732(arg0, arg1, 47);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        this.field1579 = arg0;
        ++field1575;
        if (this.field1589 != null) {
            this.field1589.method1593(this.field1589.method1608() & -32769);
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        ++field1592;
        if (arg0 != -17506) {
            this.method118((class405) null, 96);
        }
        return this.field1579;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V")
    public static void method730(byte arg0) {
        field1583 = null;
        int var1 = 106 / ((-73 - arg0) / 34);
        field1599 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILii;)V")
    public final void method103(int arg0, class405 arg1) {
        if (arg0 <= 102) {
            this.method120(40);
        }
        ++field1595;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lii;I)V")
    public final void method118(class405 arg0, int arg1) {
        ++field1584;
        Object var3 = null;
        class98 var5;
        if (this.field1586 == null && this.field1581) {
            class386 var4 = this.method733(131072, arg0, true, true);
            var5 = var4 != null ? var4.field5595 : null;
        } else {
            var5 = this.field1586;
            this.field1586 = null;
        }
        if (var5 != null) {
            class142.method903(var5, this.field1573, super.field2012, super.field2010, (boolean[]) null);
        }
        if (arg1 != 22295) {
            this.method166(47);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)I")
    public final int method120(int arg0) {
        ++field1591;
        return arg0 != 25940 ? 89 : this.field1585;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)I")
    public final int method105(int arg0) {
        ++field1572;
        return arg0 >= -4 ? 108 : 22;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I")
    public final int method121(int arg0) {
        ++field1576;
        if (arg0 != -15123) {
            this.method114(-93);
        }
        return 65535 & this.field1588;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZLii;)Z")
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field1571;
        if (arg2) {
            this.field1588 = 4;
        }
        class375 var5 = this.method732(65536, arg3, 59);
        if (var5 != null) {
            class177 var6 = arg3.method1735();
            var6.method985(super.field2012, super.field2019, super.field2010);
            return var5.method1594(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Z")
    public final boolean method114(int arg0) {
        if (arg0 != 30582) {
            this.method117((class405) null, 22);
        }
        ++field1594;
        return this.field1581;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
    public static final void method731(int arg0, int arg1) {
        ++field1596;
        class431.field6336.method1142((byte) -83, arg0);
        if (arg1 != 22) {
            field1577 = -2;
        }
        class110.field1548.method1142((byte) -103, arg0);
        class278.field4052.method1142((byte) -86, arg0);
        class374.field5442.method1142((byte) -69, arg0);
        class219.field2901.method1142((byte) -80, arg0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lii;IIIILnc;Z)V")
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        if (arg3 > -106) {
            this.field1579 = false;
        }
        if (arg5 instanceof class112) {
            class112 var8 = (class112) arg5;
            if (this.field1589 != null && var8.field1589 != null) {
                this.field1589.method1599(var8.field1589, arg4, arg2, arg1, arg6);
            }
        }
        ++field1578;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lii;Lge;IIIIZIZ)V")
    public class112(class405 arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field1475, arg1.field1512);
        this.field1579 = arg8;
        this.field1582 = arg1.field1455 != 0 && !arg6;
        super.field2012 = (short) arg3;
        this.field1588 = (short) arg1.field1507;
        super.field2010 = (short) arg5;
        this.field1593 = arg6;
        this.field1573 = (byte) arg2;
        this.field1585 = (byte) arg7;
        this.field1581 = arg0.method1740() && arg1.field1464 && !this.field1593 && ~class423.field6238 != -1;
        int var10 = 1024;
        if (this.field1579) {
            var10 |= 32768;
        }
        class386 var11 = this.method733(var10, arg0, this.field1581, true);
        if (var11 != null) {
            this.field1589 = var11.field5592;
            this.field1586 = var11.field5595;
            if (this.field1579) {
                this.field1589 = this.field1589.method1568((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lii;I)Leb;")
    public final class382 method117(class405 arg0, int arg1) {
        if (arg1 != -1) {
            field1574 = 62;
        }
        ++field1598;
        if (this.field1589 == null) {
            return null;
        } else {
            class177 var3 = arg0.method1735();
            var3.method985(super.field2012, super.field2019, super.field2010);
            class382 var4 = null;
            if (this.field1582) {
                var4 = class397.method2554(1, 0);
            }
            this.field1589.method1601(var3, var4 == null ? null : var4.field5543[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(ILii;I)Ldc;")
    private final class375 method732(int arg0, class405 arg1, int arg2) {
        ++field1597;
        if (this.field1589 != null && arg1.method1643(this.field1589.method1608(), arg0) == 0) {
            return this.field1589;
        } else {
            class386 var4 = this.method733(arg0, arg1, false, true);
            int var5 = -24 / ((-72 - arg2) / 39);
            return var4 != null ? var4.field5592 : null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILii;ZZ)Lcb;")
    private final class386 method733(int arg0, class405 arg1, boolean arg2, boolean arg3) {
        ++field1590;
        class104 var5 = class329.method2190((byte) 63, this.field1588 & 65535);
        if (!arg3) {
            this.field1586 = null;
        }
        class351 var6;
        class351 var7;
        if (this.field1593) {
            var6 = class265.field3846[0];
            var7 = class191.field2557[this.field1573];
        } else {
            if (~this.field1573 <= -4) {
                var6 = null;
            } else {
                var6 = class265.field3846[this.field1573 + 1];
            }
            var7 = class265.field3846[this.field1573];
        }
        return var5.method706(false, var6, super.field2010, arg2, super.field2012, arg0, 22, this.field1585, var7, super.field2019, arg1);
    }
}
