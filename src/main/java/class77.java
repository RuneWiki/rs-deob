import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class77 extends class19 {

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public int field1566 = 32;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public int field1562 = 1;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public int field1558 = -1;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "Z")
    public boolean field1570 = true;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public int field1574 = -1;

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
    private int field1577 = -1;

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    public int field1580 = -1;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public int field1563 = -1;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public int field1559 = -1;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    private int field1564 = 128;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "Z")
    public boolean field1572 = false;

    @OriginalMember(owner = "client!id", name = "sb", descriptor = "I")
    public int field1588 = -1;

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "I")
    private int field1581 = 128;

    @OriginalMember(owner = "client!id", name = "pb", descriptor = "Z")
    public boolean field1585 = true;

    @OriginalMember(owner = "client!id", name = "vb", descriptor = "[Lsd;")
    public class166[] field1591 = new class166[5];

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    public int field1576 = -1;

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "Lsd;")
    public class166 field1582 = class145.field2826;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "Z")
    public boolean field1565 = true;

    @OriginalMember(owner = "client!id", name = "yb", descriptor = "I")
    private int field1594 = 0;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public int field1571 = -1;

    @OriginalMember(owner = "client!id", name = "zb", descriptor = "I")
    private int field1595 = -1;

    @OriginalMember(owner = "client!id", name = "Db", descriptor = "I")
    private int field1599 = 0;

    @OriginalMember(owner = "client!id", name = "Hb", descriptor = "I")
    public int field1603 = -1;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "[I")
    public static int[] field1575 = new int[256];

    @OriginalMember(owner = "client!id", name = "tb", descriptor = "Lsd;")
    public static class166 field1589;

    @OriginalMember(owner = "client!id", name = "wb", descriptor = "Lsd;")
    public static class166 field1592;

    @OriginalMember(owner = "client!id", name = "xb", descriptor = "[S")
    public static short[] field1593;

    @OriginalMember(owner = "client!id", name = "Ab", descriptor = "Lsd;")
    public static class166 field1596;

    @OriginalMember(owner = "client!id", name = "ub", descriptor = "Lb;")
    public static class11 field1590;

    @OriginalMember(owner = "client!id", name = "Eb", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!id", name = "Gb", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!id", name = "ob", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!id", name = "qb", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!id", name = "Bb", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!id", name = "Fb", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "[I")
    private int[] field1568;

    @OriginalMember(owner = "client!id", name = "rb", descriptor = "[I")
    private int[] field1587;

    @OriginalMember(owner = "client!id", name = "Cb", descriptor = "[I")
    public int[] field1598;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "[S")
    private short[] field1556;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "[S")
    private short[] field1560;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "[S")
    private short[] field1561;

    @OriginalMember(owner = "client!id", name = "nb", descriptor = "[S")
    private short[] field1583;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
    public final boolean method634(byte arg0) {
        field1569++;
        if (this.field1598 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field1577 != -1) {
            var2 = class88.method698(0, this.field1577);
        } else if (this.field1595 != -1) {
            var2 = class91.field1785[this.field1595];
        }
        if (arg0 != -99) {
            this.method636(-107, null, (byte) -34);
        }
        return var2 >= 0 && this.field1598.length > var2 && this.field1598[var2] != -1;
    }

    @OriginalMember(owner = "client!id", name = "i", descriptor = "(I)V")
    public static void method635(int arg0) {
        field1592 = null;
        field1590 = null;
        field1589 = null;
        field1596 = null;
        field1593 = null;
        field1575 = null;
        if (arg0 >= -89) {
            field1600 = -123;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILff;B)V")
    private final void method636(int arg0, class53 arg1, byte arg2) {
        int var4 = -119 / ((arg2 - 86) / 38);
        if (arg0 == 1) {
            int var5 = arg1.method400(255);
            this.field1587 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1587[var6] = arg1.method405(2);
            }
        } else if (arg0 == 2) {
            this.field1582 = arg1.method436((byte) -53);
        } else if (arg0 == 12) {
            this.field1562 = arg1.method400(255);
        } else if (arg0 == 13) {
            this.field1603 = arg1.method405(2);
        } else if (arg0 == 14) {
            this.field1576 = arg1.method405(2);
        } else if (arg0 == 15) {
            this.field1563 = arg1.method405(2);
        } else if (arg0 == 16) {
            this.field1574 = arg1.method405(2);
        } else if (arg0 == 17) {
            this.field1576 = arg1.method405(2);
            this.field1571 = arg1.method405(2);
            this.field1580 = arg1.method405(2);
            this.field1559 = arg1.method405(2);
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field1591[arg0 - 30] = arg1.method436((byte) 121);
            if (this.field1591[arg0 - 30].method1146((byte) -103, class67.field1367)) {
                this.field1591[arg0 - 30] = null;
            }
        } else if (arg0 == 40) {
            int var13 = arg1.method400(255);
            this.field1560 = new short[var13];
            this.field1561 = new short[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1561[var14] = (short) arg1.method405(2);
                this.field1560[var14] = (short) arg1.method405(2);
            }
        } else if (arg0 == 41) {
            int var7 = arg1.method400(255);
            this.field1583 = new short[var7];
            this.field1556 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1583[var8] = (short) arg1.method405(2);
                this.field1556[var8] = (short) arg1.method405(2);
            }
        } else if (arg0 == 60) {
            int var11 = arg1.method400(255);
            this.field1568 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1568[var12] = arg1.method405(2);
            }
        } else if (arg0 == 93) {
            this.field1570 = false;
        } else if (arg0 == 95) {
            this.field1558 = arg1.method405(2);
        } else if (arg0 == 97) {
            this.field1564 = arg1.method405(2);
        } else if (arg0 == 98) {
            this.field1581 = arg1.method405(2);
        } else if (arg0 == 99) {
            this.field1572 = true;
        } else if (arg0 == 100) {
            this.field1599 = arg1.method388(-29381);
        } else if (arg0 == 101) {
            this.field1594 = arg1.method388(-29381) * 5;
        } else if (arg0 == 102) {
            this.field1588 = arg1.method405(2);
        } else if (arg0 == 103) {
            this.field1566 = arg1.method405(2);
        } else if (arg0 == 106) {
            this.field1577 = arg1.method405(2);
            if (this.field1577 == 65535) {
                this.field1577 = -1;
            }
            this.field1595 = arg1.method405(2);
            if (this.field1595 == 65535) {
                this.field1595 = -1;
            }
            int var9 = arg1.method400(255);
            this.field1598 = new int[var9 + 1];
            for (int var10 = 0; var10 <= var9; var10++) {
                this.field1598[var10] = arg1.method405(2);
                if (this.field1598[var10] == 65535) {
                    this.field1598[var10] = -1;
                }
            }
        } else if (arg0 == 107) {
            this.field1565 = false;
        } else if (arg0 == 109) {
            this.field1585 = false;
        }
        field1567++;
    }

    @OriginalMember(owner = "client!id", name = "j", descriptor = "(I)Lid;")
    public final class77 method637(int arg0) {
        if (arg0 >= -4) {
            this.field1556 = null;
        }
        field1578++;
        int var2 = -1;
        if (this.field1577 != -1) {
            var2 = class88.method698(0, this.field1577);
        } else if (this.field1595 != -1) {
            var2 = class91.field1785[this.field1595];
        }
        return var2 < 0 || this.field1598.length <= var2 || this.field1598[var2] == -1 ? null : class185.method1252(this.field1598[var2], 24851);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lff;I)V")
    public final void method638(class53 arg0, int arg1) {
        if (arg1 != 1) {
            this.field1599 = -18;
        }
        field1573++;
        while (true) {
            int var3 = arg0.method400(255);
            if (var3 == 0) {
                return;
            }
            this.method636(var3, arg0, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!id", name = "k", descriptor = "(I)V")
    public final void method639(int arg0) {
        if (arg0 <= -71) {
            field1555++;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLgg;I)Lo;")
    public final class126 method640(byte arg0, class62 arg1, int arg2) {
        if (arg0 >= -98) {
            method635(42);
        }
        field1584++;
        if (this.field1598 != null) {
            class77 var4 = this.method637(-23);
            return var4 == null ? null : var4.method640((byte) -117, arg1, arg2);
        } else if (this.field1568 == null) {
            return null;
        } else {
            class126 var5 = (class126) class10.field191.method64((byte) 28, (long) this.field1579);
            if (var5 == null) {
                boolean var6 = false;
                for (int var7 = 0; var7 < this.field1568.length; var7++) {
                    if (!class4.field72.method354(0, this.field1568[var7], -37)) {
                        var6 = true;
                    }
                }
                if (var6) {
                    return null;
                }
                class101[] var8 = new class101[this.field1568.length];
                for (int var9 = 0; var9 < this.field1568.length; var9++) {
                    var8[var9] = class101.method768(class4.field72, this.field1568[var9], 0);
                }
                class101 var10;
                if (var8.length == 1) {
                    var10 = var8[0];
                } else {
                    var10 = new class101(var8, var8.length);
                }
                if (this.field1561 != null) {
                    for (int var11 = 0; var11 < this.field1561.length; var11++) {
                        var10.method749(this.field1561[var11], this.field1560[var11]);
                    }
                }
                if (this.field1583 != null) {
                    for (int var12 = 0; var12 < this.field1583.length; var12++) {
                        var10.method762(this.field1583[var12], this.field1556[var12]);
                    }
                }
                var5 = var10.method755(64, 768, -50, -10, -50, true, true);
                class10.field191.method67(var5, 15266, (long) this.field1579);
            }
            if (arg1 != null) {
                var5 = arg1.method519(-25747, var5, arg2);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLgg;Lgg;II)Lo;")
    public final class126 method641(boolean arg0, class62 arg1, class62 arg2, int arg3, int arg4) {
        if (!arg0) {
            this.method636(-95, null, (byte) -50);
        }
        field1597++;
        if (this.field1598 != null) {
            class77 var6 = this.method637(-118);
            return var6 == null ? null : var6.method641(true, arg1, arg2, arg3, arg4);
        }
        class126 var7 = (class126) class191.field3629.method64((byte) 28, (long) this.field1579);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1587.length; var9++) {
                if (!class4.field72.method354(0, this.field1587[var9], -103)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class101[] var10 = new class101[this.field1587.length];
            for (int var11 = 0; var11 < this.field1587.length; var11++) {
                var10[var11] = class101.method768(class4.field72, this.field1587[var11], 0);
            }
            class101 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class101(var10, var10.length);
            }
            if (this.field1561 != null) {
                for (int var13 = 0; var13 < this.field1561.length; var13++) {
                    var12.method749(this.field1561[var13], this.field1560[var13]);
                }
            }
            if (this.field1583 != null) {
                for (int var14 = 0; var14 < this.field1583.length; var14++) {
                    var12.method762(this.field1583[var14], this.field1556[var14]);
                }
            }
            var7 = var12.method755(this.field1599 + 64, this.field1594 + 850, -30, -50, -30, true, true);
            class191.field3629.method67(var7, 15266, (long) this.field1579);
        }
        class126 var15;
        if (arg1 != null && arg2 != null) {
            var15 = arg1.method515(arg2, arg4, var7, (byte) 65, arg3);
        } else if (arg1 != null) {
            var15 = arg1.method524(arg3, var7, (byte) 74);
        } else if (arg2 == null) {
            var15 = var7.method852(true);
        } else {
            var15 = arg2.method524(arg4, var7, (byte) -121);
        }
        if (this.field1564 != 128 || this.field1581 != 128) {
            var15.method898(this.field1564, this.field1581, this.field1564);
        }
        return var15;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1575[var0] = var1;
        }
        field1589 = class135.method935("(U(Y", 0);
        field1592 = class135.method935("http:)4)4", 0);
        field1593 = new short[] { -1, -1, -1, -1, -1 };
        field1596 = class135.method935("oder benutzen Sie eine andere Welt)3", 0);
        field1590 = new class11(64);
        field1600 = 0;
        field1602 = 0;
    }
}
