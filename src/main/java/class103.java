import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class103 extends class53 {

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public int field1706 = 0;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public int field1704 = 12800;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public int field1703 = 0;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public int field1714 = -1;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public int field1715 = -1;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "Z")
    public boolean field1711 = true;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public int field1719 = 12800;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "Lp;")
    public class280 field1716;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "Lp;")
    public class280 field1718;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "Lbb;")
    public class90 field1712;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "Lhe;")
    public static class19 field1708 = new class19(32);

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "Lp;")
    public static class280 field1717 = class18.method140((byte) -127, "l");

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "Lp;")
    public static class280 field1723 = class18.method140((byte) -124, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "Lp;")
    public static class280 field1720 = class18.method140((byte) -119, "sch-Utteln:");

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "Lwi;")
    public static class133 field1721;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Z")
    public final boolean method724(int arg0, int arg1, int arg2) {
        field1709++;
        if (arg0 < this.field1704 || arg0 > this.field1706 || arg1 < this.field1719 || this.field1703 < arg1) {
            return false;
        }
        for (class52 var4 = (class52) this.field1712.method651(12916); var4 != null; var4 = (class52) this.field1712.method643(11066)) {
            if (var4.method383((byte) 118, arg0, arg1)) {
                return true;
            }
        }
        if (arg2 < 17) {
            field1708 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIILua;)V")
    public static final void method725(int arg0, int arg1, int arg2, class113 arg3) {
        field1707++;
        if (arg2 != -1) {
            field1724 = -30;
        }
        if (arg3.field1931 == 1) {
            class184.method1276(0, arg3.field1930, 6479, (short) 2, -1, 0L, class229.field3959, arg3.field1964);
            class54.field878++;
        }
        if (arg3.field1931 == 2 && !class263.field4647) {
            class280 var4 = class204.method1393((byte) 103, arg3);
            if (var4 != null) {
                class184.method1276(-1, var4, arg2 + 6480, (short) 30, -1, 0L, class30.method266(new class280[] { class58.field933, arg3.field1987 }, (byte) -87), arg3.field1964);
                class117.field2103++;
            }
        }
        if (arg3.field1931 == 3) {
            class184.method1276(0, class196.field3438, 6479, (short) 47, -1, 0L, class229.field3959, arg3.field1964);
            class21.field382++;
        }
        if (arg3.field1931 == 4) {
            class184.method1276(0, arg3.field1930, 6479, (short) 13, -1, 0L, class229.field3959, arg3.field1964);
            class249.field4363++;
        }
        if (arg3.field1931 == 5) {
            class184.method1276(0, arg3.field1930, arg2 ^ 0xFFFFE6B0, (short) 10, -1, 0L, class229.field3959, arg3.field1964);
            class98.field1576++;
        }
        if (arg3.field1931 == 6 && class180.field3157 == null) {
            class184.method1276(-1, arg3.field1930, 6479, (short) 60, -1, 0L, class229.field3959, arg3.field1964);
            class43.field720++;
        }
        if (arg3.field1879 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field1957; var6++) {
                for (int var7 = 0; var7 < arg3.field2005; var7++) {
                    int var8 = (arg3.field1878 + 32) * var7;
                    int var9 = (arg3.field1876 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg3.field2018[var5];
                        var9 += arg3.field1959[var5];
                    }
                    if (arg0 >= var8 && var9 <= arg1 && arg0 < var8 + 32 && var9 + 32 > arg1) {
                        class162.field2857 = var5;
                        class33.field612 = arg3;
                        if (arg3.field1889[var5] > 0) {
                            class220 var10 = class23.method177((byte) -73, arg3.field1889[var5] - 1);
                            if (class112.field1836 == 1 && class94.method665(arg2 + 2, client.method1099(arg3))) {
                                if (class268.field4704 != arg3.field1964 || class35.field647 != var5) {
                                    class184.method1276(var5, class182.field3199, 6479, (short) 11, -1, (long) var10.field3825, class30.method266(new class280[] { class48.field791, class38.field674, var10.field3818 }, (byte) -87), arg3.field1964);
                                    class25.field453++;
                                }
                            } else if (!class263.field4647 || !class94.method665(1, client.method1099(arg3))) {
                                class100.field1630++;
                                class280[] var11 = var10.field3779;
                                if (class54.field888) {
                                    var11 = class234.method1575((byte) -88, var11);
                                }
                                if (class94.method665(1, client.method1099(arg3))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class257.field4541++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 31;
                                            } else {
                                                var13 = 32;
                                            }
                                            class184.method1276(var5, var11[var12], 6479, var13, -1, (long) var10.field3825, class30.method266(new class280[] { class173.field3015, var10.field3818 }, (byte) -87), arg3.field1964);
                                        }
                                    }
                                }
                                if (class112.method780((byte) -113, client.method1099(arg3))) {
                                    class48.field788++;
                                    class184.method1276(var5, class182.field3199, 6479, (short) 45, class248.field4347, (long) var10.field3825, class30.method266(new class280[] { class173.field3015, var10.field3818 }, (byte) -87), arg3.field1964);
                                }
                                if (class94.method665(1, client.method1099(arg3)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class252.field4416++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 24;
                                            }
                                            if (var14 == 1) {
                                                var15 = 25;
                                            }
                                            if (var14 == 2) {
                                                var15 = 39;
                                            }
                                            class184.method1276(var5, var11[var14], 6479, var15, -1, (long) var10.field3825, class30.method266(new class280[] { class173.field3015, var10.field3818 }, (byte) -87), arg3.field1964);
                                        }
                                    }
                                }
                                class280[] var16 = arg3.field1976;
                                if (class54.field888) {
                                    var16 = class234.method1575((byte) -88, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class13.field265++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 7;
                                            }
                                            if (var17 == 1) {
                                                var18 = 48;
                                            }
                                            if (var17 == 2) {
                                                var18 = 38;
                                            }
                                            if (var17 == 3) {
                                                var18 = 19;
                                            }
                                            if (var17 == 4) {
                                                var18 = 50;
                                            }
                                            class184.method1276(var5, var16[var17], 6479, var18, -1, (long) var10.field3825, class30.method266(new class280[] { class173.field3015, var10.field3818 }, (byte) -87), arg3.field1964);
                                        }
                                    }
                                }
                                class184.method1276(var5, class126.field2214, arg2 + 6480, (short) 1004, class127.field2225, (long) var10.field3825, class30.method266(new class280[] { class173.field3015, var10.field3818 }, (byte) -87), arg3.field1964);
                            } else if ((class167.field2931 & 0x10) == 16) {
                                class175.field3039++;
                                class184.method1276(var5, class90.field1473, arg2 + 6480, (short) 18, -1, (long) var10.field3825, class30.method266(new class280[] { class268.field4702, class38.field674, var10.field3818 }, (byte) -87), arg3.field1964);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field2008) {
            return;
        }
        if (class263.field4647) {
            if (class29.method259(client.method1099(arg3), arg2 - 25776) && (class167.field2931 & 0x20) == 32) {
                class184.method1276(arg3.field1955, class90.field1473, 6479, (short) 49, -1, 0L, class30.method266(new class280[] { class268.field4702, class35.field652, arg3.field1904 }, (byte) -87), arg3.field1964);
                class258.field4575++;
                return;
            }
            return;
        }
        for (int var19 = 9; var19 >= 5; var19--) {
            class280 var23 = class62.method440(arg3, var19, 116);
            if (var23 != null) {
                class184.method1276(arg3.field1955, var23, 6479, (short) 1001, class238.method1591(0, var19, arg3), (long) (var19 + 1), arg3.field1904, arg3.field1964);
                class258.field4571++;
            }
        }
        class280 var20 = class204.method1393((byte) 103, arg3);
        if (var20 != null) {
            class184.method1276(arg3.field1955, var20, 6479, (short) 30, -1, 0L, arg3.field1904, arg3.field1964);
            class117.field2103++;
        }
        for (int var21 = 4; var21 >= 0; var21--) {
            class280 var22 = class62.method440(arg3, var21, 94);
            if (var22 != null) {
                class184.method1276(arg3.field1955, var22, arg2 ^ 0xFFFFE6B0, (short) 14, class238.method1591(~arg2, var21, arg3), (long) (var21 + 1), arg3.field1904, arg3.field1964);
                class258.field4571++;
            }
        }
        if (class191.method1323(arg2 ^ 0xFFFFF4B4, client.method1099(arg3))) {
            class184.method1276(arg3.field1955, class80.field1308, arg2 + 6480, (short) 60, -1, 0L, class229.field3959, arg3.field1964);
            class43.field720++;
            return;
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
    public static void method726(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1721 = null;
        field1720 = null;
        field1708 = null;
        field1723 = null;
        field1717 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZIIILtg;IB)V")
    public static final void method727(boolean arg0, int arg1, int arg2, int arg3, class180 arg4, int arg5, byte arg6) {
        field1710++;
        class222.field3849 = arg3;
        class253.field4441 = 1;
        class102.field1654 = arg0;
        class115.field2092 = arg2;
        class181.field3168 = arg5;
        class268.field4707 = arg4;
        class275.field4780 = arg1;
        if (arg6 <= 95) {
            method729(99, (byte) 59, 65);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
    public final void method728(byte arg0) {
        if (arg0 != 114) {
            return;
        }
        this.field1703 = 0;
        this.field1719 = 12800;
        this.field1704 = 12800;
        this.field1706 = 0;
        field1722++;
        for (class52 var2 = (class52) this.field1712.method651(12916); var2 != null; var2 = (class52) this.field1712.method643(11066)) {
            if (var2.field852 > this.field1703) {
                this.field1703 = var2.field852;
            }
            if (var2.field851 > this.field1706) {
                this.field1706 = var2.field851;
            }
            if (this.field1704 > var2.field860) {
                this.field1704 = var2.field860;
            }
            if (this.field1719 > var2.field849) {
                this.field1719 = var2.field849;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBI)V")
    public static final void method729(int arg0, byte arg1, int arg2) {
        field1705++;
        class157 var3 = class257.method1740(arg0, (byte) 125, 13);
        var3.method1112((byte) 107);
        var3.field2748 = arg2;
        if (arg1 != -100) {
            field1708 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lp;Lp;IIIZI)V")
    public class103(class280 arg0, class280 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field1715 = arg4;
        this.field1713 = arg2;
        this.field1702 = arg3;
        this.field1716 = arg0;
        this.field1718 = arg1;
        this.field1714 = arg6;
        if (this.field1714 == 255) {
            this.field1714 = 0;
        }
        this.field1711 = arg5;
        this.field1712 = new class90();
    }
}
