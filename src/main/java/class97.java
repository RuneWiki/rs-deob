import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class97 {

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Z")
    public boolean field1558 = false;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    private int field1555 = 0;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    private int field1566 = 128;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public int field1563 = -1;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    private int field1565 = 128;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    private int field1571 = 0;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    private int field1576 = 0;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lsc;")
    public static class181 field1560 = class149.method967(255, "hint_mapedge");

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Lsc;")
    public static class181 field1564 = null;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Ljd;")
    public static class265 field1568 = new class265(50);

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field1575 = 0;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "Lsc;")
    public static class181 field1578 = class149.method967(255, "gr-Un:");

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    private int field1573;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "[Ltg;")
    public static class107[] field1579;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[S")
    private short[] field1557;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "[S")
    private short[] field1570;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[S")
    private short[] field1572;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "[S")
    private short[] field1574;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Led;B)V")
    public static final void method640(class116 arg0, byte arg1) {
        field1567++;
        int var2 = -57 / ((40 - arg1) / 56);
        class264 var3 = (class264) class123.field2014.method1424(true, arg0.field1883.method1197(-108));
        if (var3 == null) {
            return;
        }
        if (var3.field4606 != null) {
            class90.field1420.method696(var3.field4606);
            var3.field4606 = null;
        }
        var3.method290((byte) -48);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
    public static void method641(boolean arg0) {
        field1560 = null;
        field1578 = null;
        field1568 = null;
        if (arg0) {
            field1579 = null;
            field1564 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Lnb;")
    public final class249 method642(int arg0, int arg1) {
        field1569++;
        class249 var3 = (class249) class170.field2848.method1794(arg0 - 129, (long) this.field1559);
        if (var3 == null) {
            class50 var4 = class50.method354(class51.field810, this.field1573, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1570 != null) {
                for (int var5 = 0; var5 < this.field1570.length; var5++) {
                    var4.method348(this.field1570[var5], this.field1557[var5]);
                }
            }
            if (this.field1572 != null) {
                for (int var6 = 0; var6 < this.field1572.length; var6++) {
                    var4.method356(this.field1572[var6], this.field1574[var6]);
                }
            }
            var3 = var4.method351(this.field1576 + 64, this.field1555 + 850, -30, -50, -30);
            class170.field2848.method1795(14177, (long) this.field1559, var3);
        }
        class249 var7;
        if (this.field1563 == -1 || arg1 == -1) {
            var7 = var3.method1581(true, true);
        } else {
            var7 = class128.method827(this.field1563, 115).method1729(var3, 1908, arg1);
        }
        if (this.field1566 != arg0 || this.field1565 != 128) {
            var7.method1578(this.field1566, this.field1565, this.field1566);
        }
        if (this.field1571 != 0) {
            if (this.field1571 == 90) {
                var7.method1577();
            }
            if (this.field1571 == 180) {
                var7.method1585();
            }
            if (this.field1571 == 270) {
                var7.method1595();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lvf;I)V")
    public final void method643(class230 arg0, int arg1) {
        int var3 = 24 % ((arg1 - 19) / 49);
        field1561++;
        while (true) {
            int var4 = arg0.method1516((byte) 82);
            if (var4 == 0) {
                return;
            }
            this.method645(var4, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static final void method644(byte arg0) {
        int var1 = 17 / ((-arg0 - 31) / 59);
        class86 var2 = (class86) class52.field827.method1686((byte) -83);
        field1556++;
        while (var2 != null) {
            class125 var3 = var2.field1374;
            if (class38.field581 != var3.field2066 || var3.field2042 < class237.field4125) {
                var2.method290((byte) -48);
            } else if (var3.field2076 <= class237.field4125) {
                if (var3.field2049 > 0) {
                    class178 var4 = class129.field2140[var3.field2049 - 1];
                    if (var4 != null && var4.field2654 >= 0 && var4.field2654 < 13312 && var4.field2681 >= 0 && var4.field2681 < 13312) {
                        var3.method814(class232.method1606(var3.field2066, (byte) -53, var4.field2681, var4.field2654) - var3.field2040, var4.field2681, 118, var4.field2654, class237.field4125);
                    }
                }
                if (var3.field2049 < 0) {
                    int var5 = -var3.field2049 - 1;
                    class116 var6;
                    if (class199.field3452 == var5) {
                        var6 = class258.field4507;
                    } else {
                        var6 = class39.field602[var5];
                    }
                    if (var6 != null && var6.field2654 >= 0 && var6.field2654 < 13312 && var6.field2681 >= 0 && var6.field2681 < 13312) {
                        var3.method814(class232.method1606(var3.field2066, (byte) -20, var6.field2681, var6.field2654) - var3.field2040, var6.field2681, 113, var6.field2654, class237.field4125);
                    }
                }
                var3.method807(class258.field4504, (byte) -108);
                class188.method1304(class38.field581, (int) var3.field2069, (int) var3.field2047, (int) var3.field2077, 60, var3, var3.field2034, -1L, false);
            }
            var2 = (class86) class52.field827.method1683(140);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILvf;)V")
    private final void method645(int arg0, int arg1, class230 arg2) {
        if (arg1 != 0) {
            this.field1570 = null;
        }
        if (arg0 == 1) {
            this.field1573 = arg2.method1535(2);
        } else if (arg0 == 2) {
            this.field1563 = arg2.method1535(arg1 ^ 0x2);
        } else if (arg0 == 4) {
            this.field1566 = arg2.method1535(arg1 + 2);
        } else if (arg0 == 5) {
            this.field1565 = arg2.method1535(2);
        } else if (arg0 == 6) {
            this.field1571 = arg2.method1535(2);
        } else if (arg0 == 7) {
            this.field1576 = arg2.method1516((byte) 82);
        } else if (arg0 == 8) {
            this.field1555 = arg2.method1516((byte) 82);
        } else if (arg0 == 9) {
            this.field1558 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method1516((byte) 82);
            this.field1570 = new short[var6];
            this.field1557 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1570[var7] = (short) arg2.method1535(class102.method690(arg1, 2));
                this.field1557[var7] = (short) arg2.method1535(2);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method1516((byte) 82);
            this.field1574 = new short[var4];
            this.field1572 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1572[var5] = (short) arg2.method1535(2);
                this.field1574[var5] = (short) arg2.method1535(2);
            }
        }
        field1562++;
    }
}
