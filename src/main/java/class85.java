import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class85 extends class221 {

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "Lc;")
    public class125 field1665 = new class125();

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "Lre;")
    public class152 field1678 = new class152();

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "Ldd;")
    private class43 field1666;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "Lqc;")
    public static class245 field1667 = new class245(4);

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "Lr;")
    public static class66 field1672 = class93.method641(43, "Konfig geladen)3");

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "Lr;")
    public static class66 field1673 = class93.method641(43, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "Lr;")
    public static class66 field1671 = class93.method641(43, "settings=");

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field1670 = 0;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field1668 = -1;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "Lr;")
    public static class66 field1679 = class93.method641(43, "");

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "Lr;")
    public static class66 field1675 = field1679;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "Lr;")
    public static class66 field1674 = field1679;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "[I")
    public static int[] field1669;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "([III)V")
    public final void method277(int[] arg0, int arg1, int arg2) {
        this.field1678.method277(arg0, arg1, arg2);
        field1654++;
        for (class254 var4 = (class254) this.field1665.method873((byte) 76); var4 != null; var4 = (class254) this.field1665.method870((byte) -114)) {
            if (!this.field1666.method279(var4, (byte) -42)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field4462) {
                        this.method602(var4, var5, 24981, var6, var6 + var5, arg0);
                        var4.field4462 -= var5;
                        break;
                    }
                    this.method602(var4, var4.field4462, 24981, var6, var6 + var5, arg0);
                    var6 += var4.field4462;
                    var5 -= var4.field4462;
                } while (!this.field1666.method301(var5, var6, var4, (byte) -68, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
    public static final void method597(int arg0) {
        field1656++;
        if (arg0 != -2 || class51.field902 != null || class241.field4187 != null) {
            return;
        }
        int var1 = class264.field4627;
        if (class115.field2177) {
            if (var1 != 1) {
                int var2 = class50.field896;
                int var3 = class170.field3021;
                if (var3 < (class129.field2407 - 10) || class187.field3240 + class129.field2407 + 10 < var3 || var2 < (class70.field1405 - 10) || var2 > (class9.field102 + class70.field1405 + 10)) {
                    class115.field2177 = false;
                    class100.method689(class129.field2407, class70.field1405, class187.field3240, class9.field102, (byte) -45);
                }
            }
            if (var1 == 1) {
                int var4 = class129.field2407;
                int var5 = class70.field1405;
                int var6 = class188.field3274;
                int var7 = class174.field3068;
                int var8 = -1;
                int var9 = class187.field3240;
                for (int var10 = 0; var10 < class176.field3105; var10++) {
                    int var11 = var5 + ((-var10 + class176.field3105 + -1) * 15) + 31;
                    if (var6 > var4 && (var4 + var9) > var6 && var7 > var11 - 13 && var7 < (var11 + 3)) {
                        var8 = var10;
                    }
                }
                if (var8 != -1) {
                    class41.method261((byte) 51, var8);
                }
                class115.field2177 = false;
                class100.method689(class129.field2407, class70.field1405, class187.field3240, class9.field102, (byte) -95);
                return;
            }
            return;
        }
        if (var1 == 1 && class176.field3105 > 0) {
            short var12 = class43.field710[class176.field3105 - 1];
            if (var12 == 41 || var12 == 40 || var12 == 43 || var12 == 38 || var12 == 58 || var12 == 14 || var12 == 17 || var12 == 13 || var12 == 7 || var12 == 22 || var12 == 16 || var12 == 1001) {
                int var13 = class60.field1025[class176.field3105 - 1];
                int var14 = class188.field3272[class176.field3105 - 1];
                class63 var15 = class54.method367(var14, (byte) -80);
                if (class242.method1595(client.method592(var15), true) || class84.method582(0, client.method592(var15))) {
                    class68.field1360 = 0;
                    class211.field3628 = false;
                    if (class51.field902 != null) {
                        class215.method1385(class51.field902, -115);
                    }
                    class51.field902 = class54.method367(var14, (byte) -80);
                    class217.field3728 = class174.field3068;
                    class78.field1541 = class188.field3274;
                    class198.field3422 = var13;
                    class215.method1385(class51.field902, -114);
                    return;
                }
            }
        }
        if (var1 == 1 && (class133.field2475 == 1 && class176.field3105 > 2 || class40.method241((byte) -121, class176.field3105 - 1))) {
            var1 = 2;
        }
        if (var1 == 2 && class176.field3105 > 0 || class90.field1743 == 1) {
            class105.method723((byte) -15);
        }
        if ((var1 != 1 || class176.field3105 <= 0) && class90.field1743 != 2) {
            return;
        }
        class21.method92((byte) 106);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lvg;II)V")
    private final void method598(class254 arg0, int arg1, int arg2) {
        if ((this.field1666.field763[arg0.field4459] & 0x4) != 0 && arg0.field4454 < 0) {
            int var4 = this.field1666.field700[arg0.field4459] / class200.field3446;
            int var5 = (var4 + 1048575 - arg0.field4446) / var4;
            arg0.field4446 = arg1 * var4 + arg0.field4446 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field1666.field740[arg0.field4459] == 0) {
                    arg0.field4451 = class258.method1742(arg0.field4470, arg0.field4451.method1749(), arg0.field4451.method1746(), arg0.field4451.method1739());
                } else {
                    arg0.field4451 = class258.method1742(arg0.field4470, arg0.field4451.method1749(), 0, arg0.field4451.method1739());
                    this.field1666.method292(arg0, arg0.field4460.field3754[arg0.field4464] < 0, (byte) 59);
                }
                if (arg0.field4460.field3754[arg0.field4464] < 0) {
                    arg0.field4451.method1727(-1);
                }
                arg1 = arg0.field4446 / var4;
            }
        }
        if (arg2 != -1) {
            field1673 = null;
        }
        arg0.field4451.method302(arg1);
        field1657++;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()Lwd;")
    public final class221 method278() {
        class254 var1 = (class254) this.field1665.method873((byte) 76);
        field1658++;
        if (var1 == null) {
            return null;
        } else if (var1.field4451 == null) {
            return this.method308();
        } else {
            return var1.field4451;
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
    public static final void method599(int arg0) {
        class114.field2162.method1613((byte) 94);
        class48.field867.method1613((byte) 94);
        field1660++;
        if (arg0 <= 67) {
            field1667 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
    public static void method600(int arg0) {
        field1673 = null;
        field1667 = null;
        field1675 = null;
        field1679 = null;
        field1671 = null;
        field1669 = null;
        field1672 = null;
        if (arg0 > -19) {
            field1668 = -57;
        }
        field1674 = null;
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
    public static final void method601(int arg0) {
        field1664++;
        class208.field3605.method1614(arg0 ^ 0x1632);
        if (arg0 != 5698) {
            field1679 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lvg;IIII[I)V")
    private final void method602(class254 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if ((this.field1666.field763[arg0.field4459] & 0x4) != 0 && arg0.field4454 < 0) {
            int var7 = this.field1666.field700[arg0.field4459] / class200.field3446;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field4446) / var7;
                if (arg1 < var8) {
                    arg0.field4446 += arg1 * var7;
                    break;
                }
                arg0.field4451.method277(arg5, arg3, var8);
                arg0.field4446 += var7 * var8 - 1048576;
                arg1 -= var8;
                int var9 = class200.field3446 / 100;
                arg3 += var8;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class258 var11 = arg0.field4451;
                if (this.field1666.field740[arg0.field4459] == 0) {
                    arg0.field4451 = class258.method1742(arg0.field4470, var11.method1749(), var11.method1746(), var11.method1739());
                } else {
                    arg0.field4451 = class258.method1742(arg0.field4470, var11.method1749(), 0, var11.method1739());
                    this.field1666.method292(arg0, arg0.field4460.field3754[arg0.field4464] < 0, (byte) 56);
                    arg0.field4451.method1735(var9, var11.method1746());
                }
                if (arg0.field4460.field3754[arg0.field4464] < 0) {
                    arg0.field4451.method1727(-1);
                }
                var11.method1743(var9);
                var11.method277(arg5, arg3, arg4 - arg3);
                if (var11.method1733()) {
                    this.field1678.method1033(var11);
                }
            }
        }
        field1659++;
        if (arg2 != 24981) {
            field1671 = null;
        }
        arg0.field4451.method277(arg5, arg3, arg1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static final void method603(byte arg0) {
        if (arg0 != -38) {
            method597(-58);
        }
        field1655++;
        while (true) {
            class125 var1 = class256.field4499;
            class147 var2;
            synchronized (class256.field4499) {
                var2 = (class147) class100.field1955.method874(-110);
            }
            if (var2 == null) {
                return;
            }
            var2.field2682.method1622(-83, false, var2.field2672, var2.field2677, (int) var2.field1560);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()I")
    public final int method285() {
        field1663++;
        return 0;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    public final void method302(int arg0) {
        this.field1678.method302(arg0);
        field1661++;
        for (class254 var2 = (class254) this.field1665.method873((byte) 76); var2 != null; var2 = (class254) this.field1665.method870((byte) -117)) {
            if (!this.field1666.method279(var2, (byte) -42)) {
                int var3 = arg0;
                do {
                    if (var2.field4462 >= var3) {
                        this.method598(var2, var3, -1);
                        var2.field4462 -= var3;
                        break;
                    }
                    this.method598(var2, var2.field4462, -1);
                    var3 -= var2.field4462;
                } while (!this.field1666.method301(var3, 0, var2, (byte) -68, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()Lwd;")
    public final class221 method308() {
        field1677++;
        class254 var1;
        do {
            var1 = (class254) this.field1665.method870((byte) 61);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4451 == null);
        return var1.field4451;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ldd;)V")
    public class85(class43 arg0) {
        this.field1666 = arg0;
    }
}
