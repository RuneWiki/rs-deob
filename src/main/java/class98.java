import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class98 extends class333 implements class331 {

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
    private int field1617 = 50;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "Z")
    private boolean field1627 = false;

    @OriginalMember(owner = "client!vn", name = "Y", descriptor = "Lth;")
    private class57 field1639;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "Lth;")
    private class57 field1619;

    @OriginalMember(owner = "client!vn", name = "S", descriptor = "Lta;")
    private class300 field1633;

    @OriginalMember(owner = "client!vn", name = "Z", descriptor = "Lta;")
    private class300 field1640;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1604 = new String[100];

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field1603 = 0;

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
    public static int field1623 = 0;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
    public static int field1622 = 0;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!vn", name = "T", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!vn", name = "U", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!vn", name = "V", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!vn", name = "W", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!vn", name = "X", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!vn", name = "bb", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!vn", name = "ab", descriptor = "[Lml;")
    public static class17[] field1641;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(BI)V", line = 5)
    public static final void method755(byte arg0, int arg1) {
        field1611++;
        class285.field4643 = 1000 / arg1;
        int var2 = -8 / ((83 - arg0) / 33);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 22)
    public final void method756(int arg0) {
        if (arg0 != 255) {
            return;
        }
        this.field1633.method2150((byte) 127);
        if (this.field1640 != null) {
            this.field1640.method2150((byte) 100);
        }
        class108.field1785 = null;
        field1620++;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lth;Lth;Lth;IZ)V", line = 37)
    public class98(class57 arg0, class57 arg1, class57 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field1639 = arg2;
        this.field1627 = arg4;
        this.field1619 = arg0;
        this.field1617 = arg3;
        this.field1633 = new class300(this.field1617);
        if (class42.field607) {
            this.field1640 = new class300(this.field1617);
        } else {
            this.field1640 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIB)V", line = 55)
    public final void method757(int arg0, int arg1, byte arg2) {
        field1615++;
        class310.method2203(this.method1559(arg1, (byte) -94).field4601 & 0xFF, this.method1559(arg1, (byte) -94).field4599 & 0xFF, -127);
        boolean var4 = false;
        class108 var5 = this.method777(arg1, 255);
        if (var5 != null) {
            var4 = var5.method831(this, this.field1639, arg0);
        }
        if (arg2 != -45) {
            this.field1639 = (class57) null;
        }
        if (!var4) {
            class168 var6 = this.method758(arg1, true);
            var6.method1306(-19228);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IZ)Lwa;", line = 89)
    private final class168 method758(int arg0, boolean arg1) {
        field1626++;
        class168 var3 = (class168) this.field1640.method2147((byte) 108, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        class168 var4 = new class168(this.method1559(arg0, (byte) -94).field4608 & 0xFFFF);
        if (!arg1) {
            this.method759(-34, -82);
        }
        this.field1640.method2149(var4, -32563, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "(II)V", line = 107)
    public final void method759(int arg0, int arg1) {
        this.field1617 = arg1;
        field1607++;
        if (arg0 != 128) {
            field1623 = 98;
        }
        this.field1633 = new class300(this.field1617);
        if (class42.field607) {
            this.field1640 = new class300(this.field1617);
        } else {
            this.field1640 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)Z", line = 125)
    public final boolean method760(byte arg0, int arg1) {
        field1635++;
        if (arg0 == -127) {
            class108 var3 = this.method777(arg1, 255);
            return var3 == null ? false : var3.method830(this, this.field1639);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lmf;I)Z", line = 143)
    public static final boolean method761(class213 arg0, int arg1) {
        field1624++;
        if (arg0 == null) {
            return false;
        } else if (arg0.field3400) {
            int var2 = -98 / ((arg1 + 8) / 35);
            if (!arg0.method1610((byte) -105)) {
                return false;
            } else if (class193.field3074.method1268(93, (long) arg0.field3391) == null) {
                return class327.field5194.method1268(96, (long) arg0.field3421) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(II)V", line = 169)
    public final void method762(int arg0, int arg1) {
        this.method757(this.field1627 || this.method1559(arg1, (byte) -94).field4610 ? 64 : 128, arg1, (byte) -45);
        field1637++;
        if (arg0 >= -101) {
            field1622 = 9;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZ)Z", line = 183)
    public final boolean method763(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field1613++;
            return this.method1559(arg0, (byte) -94).field4607;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IB)Z", line = 199)
    public final boolean method764(int arg0, byte arg1) {
        field1609++;
        if (arg1 != 65) {
            this.method760((byte) 124, -37);
        }
        return !this.method1559(arg0, (byte) -94).field4605;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 215)
    public static void method765(byte arg0) {
        if (arg0 != -66) {
            field1622 = -60;
        }
        field1641 = null;
        field1604 = null;
    }

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "(II)V", line = 228)
    public final void method766(int arg0, int arg1) {
        if (arg0 != -25285) {
            field1623 = -31;
        }
        for (class108 var3 = (class108) this.field1633.method2151(-12417); var3 != null; var3 = (class108) this.field1633.method2144(32767)) {
            if (var3.field1789) {
                var3.method828(arg1);
                var3.field1789 = false;
            }
        }
        field1621++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZB)V", line = 252)
    public final void method767(boolean arg0, byte arg1) {
        field1629++;
        if (arg1 == 48) {
            this.field1627 = arg0;
            this.method756(255);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)[I", line = 265)
    public final int[] method768(int arg0, int arg1) {
        field1605++;
        class108 var3 = this.method777(arg1, 255);
        if (arg0 >= -62) {
            return (int[]) null;
        } else if (var3 == null) {
            return null;
        } else {
            return var3.method832(this, this.field1639, this.field1627 || this.method1559(arg1, (byte) -94).field4610);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIFZI)Lsi;", line = 288)
    public final class351 method769(int arg0, int arg1, float arg2, boolean arg3, int arg4) {
        field1638++;
        class108 var6 = this.method777(arg4, arg1 + 255);
        if (arg1 != 0) {
            return (class351) null;
        } else if (var6 != null && var6.method830(this, this.field1639)) {
            return arg3 ? var6.field1781.method2393(false, this, (byte) -62, arg0, arg0, (double) arg2, this.field1639) : var6.field1781.method2392(false, arg0, this, arg0, -45, (double) arg2, this.field1639);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "(II)I", line = 313)
    public final int method770(int arg0, int arg1) {
        field1618++;
        int var3 = 122 % ((arg1 - 51) / 35);
        return this.method1559(arg0, (byte) -94).field4608 & 0xFFFF;
    }

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "(II)Z", line = 325)
    public final boolean method771(int arg0, int arg1) {
        field1632++;
        if (arg1 == 255) {
            return this.field1627 || this.method1559(arg0, (byte) -94).field4610;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I", line = 339)
    public final int method772(int arg0, int arg1) {
        field1614++;
        int var3 = 108 % ((-arg0 - 33) / 54);
        return this.method1559(arg1, (byte) -94).field4601 & 0xFF;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZI)I", line = 349)
    public final int method773(boolean arg0, int arg1) {
        if (arg0) {
            return -28;
        } else {
            field1630++;
            return this.method1559(arg1, (byte) -94).field4603 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)V", line = 364)
    public static final void method774(boolean arg0) {
        if (arg0) {
            field1634 = 88;
        }
        field1636++;
        class216.field3467.method2327(1);
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(II)I", line = 376)
    public final int method775(int arg0, int arg1) {
        int var3 = 108 % ((arg1 - 10) / 52);
        field1631++;
        return this.method1559(arg0, (byte) -94).field4606 & 0xFF;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)I", line = 385)
    public final int method776(int arg0, byte arg1) {
        field1608++;
        if (arg1 < 17) {
            method765((byte) 90);
        }
        return this.method1559(arg0, (byte) -94).field4599 & 0xFF;
    }

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "(II)Lto;", line = 397)
    private final class108 method777(int arg0, int arg1) {
        field1606++;
        class108 var3 = (class108) this.field1633.method2147((byte) -124, (long) arg0);
        if (arg1 != 255) {
            method761((class213) null, -51);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1619.method472(0, 79, arg0);
        if (var4 == null) {
            return null;
        } else {
            class108 var5 = new class108(new class227(var4));
            this.field1633.method2149(var5, -32563, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(FIB)[I", line = 421)
    public final int[] method778(float arg0, int arg1, byte arg2) {
        field1642++;
        class108 var4 = this.method777(arg1, 255);
        if (var4 == null) {
            return null;
        } else {
            int var5 = -36 % ((-arg2 - 44) / 60);
            var4.field1789 = true;
            return var4.method833(this, this.field1639, arg0, this.field1627 || this.method1559(arg1, (byte) -94).field4610);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIII)V", line = 444)
    public static final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1612++;
        if (arg1 == arg3) {
            class355.method2512(arg2, 64, arg5, arg1, arg4);
            return;
        }
        if (arg2 - arg1 >= class74.field1269 && class355.field5640 >= arg1 + arg2 && arg4 - arg3 >= class296.field4758 && class273.field4522 >= arg3 + arg4) {
            class141.method1090(arg3, arg4, arg5, arg2, -35, arg1);
        } else {
            class336.method2341(arg4, (byte) -53, arg3, arg2, arg5, arg1);
        }
        int var6 = -90 / ((-arg0 - 1) / 47);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)Z", line = 485)
    public final boolean method780(int arg0, int arg1) {
        field1616++;
        if (arg0 != 65535) {
            this.method777(-87, -51);
        }
        return this.method1559(arg1, (byte) -94).field4604;
    }

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "(II)Ljb;", line = 498)
    public final class340 method781(int arg0, int arg1) {
        class108 var3 = this.method777(arg0, arg1);
        field1625++;
        return var3 == null ? null : var3.field1781;
    }
}
