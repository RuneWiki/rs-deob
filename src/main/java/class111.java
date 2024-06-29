import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class111 {

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public int field1713 = -1;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[I")
    private int[] field1712 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Z")
    public boolean field1722 = false;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1711 = -1;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "[I")
    public static int[] field1716 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "[[Z")
    public static boolean[][] field1720 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "[I")
    private int[] field1714;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[S")
    private short[] field1706;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[S")
    private short[] field1709;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "[S")
    private short[] field1718;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "[S")
    private short[] field1721;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
    public static final int method846(int arg0) {
        field1717++;
        if (arg0 != -12334) {
            method852(-79, -117, 90);
        }
        if (class261.field3604 == null) {
            return class115.field1753 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Lri;")
    public final class98 method847(byte arg0) {
        field1724++;
        class98[] var2 = new class98[5];
        int var3 = 0;
        class316 var4 = class309.field4194;
        synchronized (class309.field4194) {
            int var5 = 0;
            if (arg0 >= -81) {
                this.field1709 = null;
            }
            while (var5 < 5) {
                if (this.field1712[var5] != -1) {
                    var2[var3++] = class267.method1702((byte) -105, this.field1712[var5], 0, class309.field4194);
                }
                var5++;
            }
        }
        class98 var6 = new class98(var2, var3);
        if (this.field1718 != null) {
            for (int var7 = 0; var7 < this.field1718.length; var7++) {
                var6.method766(this.field1718[var7], this.field1709[var7], (byte) -13);
            }
        }
        if (this.field1721 != null) {
            for (int var8 = 0; var8 < this.field1721.length; var8++) {
                var6.method763(this.field1706[var8], this.field1721[var8], 0);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Lrg;")
    public static final class366 method848(byte arg0) {
        field1719++;
        class366 var1 = new class366(38);
        var1.method2280(15, arg0 ^ 0xA4565376);
        var1.method2280(class359.field4957, 1537846408);
        var1.method2280(class86.field1206 ? 1 : 0, 1537846408);
        var1.method2280(class230.field3237 ? 1 : 0, arg0 ^ 0xA4565376);
        var1.method2280(class441.field6201 ? 1 : 0, 1537846408);
        var1.method2280(class215.field3009 ? 1 : 0, arg0 ^ 0xA4565376);
        var1.method2280(0, arg0 + 1537846410);
        var1.method2280(class341.field4607 ? 1 : 0, 1537846408);
        var1.method2280(class107.field1521 ? 1 : 0, 1537846408);
        var1.method2280(class404.field5593 ? 1 : 0, 1537846408);
        var1.method2280(class228.field3188, 1537846408);
        if (arg0 != -2) {
            field1711 = -14;
        }
        var1.method2280(class428.field5958 ? 1 : 0, 1537846408);
        var1.method2280(class152.field2192 ? 1 : 0, 1537846408);
        var1.method2280(class160.field2272 ? 1 : 0, 1537846408);
        var1.method2280(class98.field1360, 1537846408);
        var1.method2280(class119.field1814 ? 1 : 0, arg0 ^ 0xA4565376);
        var1.method2280(class231.field3253, 1537846408);
        var1.method2280(class1.field2, 1537846408);
        var1.method2280(class336.field4540, 1537846408);
        var1.method2275(122, class258.field3585);
        var1.method2275(arg0 + 126, class361.field4985);
        var1.method2280(class244.method1590(-28442), arg0 + 1537846410);
        var1.method2261(class50.field638, -176);
        var1.method2280(class211.field2956, 1537846408);
        var1.method2280(class30.field416 ? 1 : 0, 1537846408);
        var1.method2280(class229.field3214 ? 1 : 0, 1537846408);
        var1.method2280(class294.field3962, arg0 ^ 0xA4565376);
        var1.method2280(class415.field5752 ? 1 : 0, 1537846408);
        var1.method2280(class314.field4262 ? 1 : 0, arg0 + 1537846410);
        var1.method2280(class316.field4264, 1537846408);
        var1.method2280(class319.field4357 ? 1 : 0, arg0 + 1537846410);
        var1.method2280(class344.field4647, 1537846408);
        var1.method2280(class236.field3363, arg0 ^ 0xA4565376);
        return var1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI[Lvg;)V")
    public static final void method849(byte arg0, int arg1, class108[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class108 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field1666 == 0) {
                    if (var4.field1651 != null) {
                        method849((byte) -98, arg1, var4.field1651);
                    }
                    class435 var5 = (class435) class171.field2415.method837((byte) -72, (long) var4.field1631);
                    if (var5 != null) {
                        class282.method1769(0, arg1, var5.field6146);
                    }
                }
                if (arg1 == 0 && var4.field1653 != null) {
                    class101 var6 = new class101();
                    var6.field1403 = var4;
                    var6.field1393 = var4.field1653;
                    class172.method1230(var6);
                }
                if (arg1 == 1 && var4.field1627 != null) {
                    if (var4.field1647 >= 0) {
                        class108 var7 = class157.method1139(var4.field1631, false);
                        if (var7 == null || var7.field1651 == null || var7.field1651.length <= var4.field1647 || var7.field1651[var4.field1647] != var4) {
                            continue;
                        }
                    }
                    class101 var8 = new class101();
                    var8.field1393 = var4.field1627;
                    var8.field1403 = var4;
                    class172.method1230(var8);
                }
            }
        }
        if (arg0 >= -88) {
            field1704 = 55;
        }
        field1723++;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Lri;")
    public final class98 method850(byte arg0) {
        field1703++;
        if (this.field1714 == null) {
            return null;
        }
        class98[] var2 = new class98[this.field1714.length];
        if (arg0 >= -1) {
            return null;
        }
        class316 var3 = class309.field4194;
        synchronized (class309.field4194) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field1714.length) {
                    break;
                }
                var2[var4] = class267.method1702((byte) -67, this.field1714[var4], 0, class309.field4194);
                var4++;
            }
        }
        class98 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class98(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field1718 != null) {
            for (int var6 = 0; var6 < this.field1718.length; var6++) {
                var5.method766(this.field1718[var6], this.field1709[var6], (byte) -13);
            }
        }
        if (this.field1721 != null) {
            for (int var7 = 0; var7 < this.field1721.length; var7++) {
                var5.method763(this.field1706[var7], this.field1721[var7], 0);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZILrg;)V")
    private final void method851(boolean arg0, int arg1, class366 arg2) {
        field1707++;
        if (!arg0) {
            method852(-7, -87, 106);
        }
        if (arg1 == 1) {
            this.field1713 = arg2.method2306((byte) 70);
        } else if (arg1 == 2) {
            int var8 = arg2.method2306((byte) 103);
            this.field1714 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1714[var9] = arg2.method2297(13352);
            }
        } else if (arg1 == 3) {
            this.field1722 = true;
        } else if (arg1 == 40) {
            int var6 = arg2.method2306((byte) 28);
            this.field1718 = new short[var6];
            this.field1709 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1718[var7] = (short) arg2.method2297(13352);
                this.field1709[var7] = (short) arg2.method2297(13352);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method2306((byte) 64);
            this.field1706 = new short[var4];
            this.field1721 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1721[var5] = (short) arg2.method2297(13352);
                this.field1706[var5] = (short) arg2.method2297(13352);
            }
            return;
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1712[arg1 - 60] = arg2.method2297(13352);
            return;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lje;")
    public static final class301 method852(int arg0, int arg1, int arg2) {
        class63 var3 = class341.field4617[arg0][arg1][arg2];
        return var3 == null || var3.field854 == null ? null : var3.field854;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static void method853(int arg0) {
        field1720 = null;
        field1716 = null;
        if (arg0 != 1) {
            field1704 = 5;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)Z")
    public final boolean method854(boolean arg0) {
        field1705++;
        if (this.field1714 == null) {
            return true;
        }
        boolean var2 = arg0;
        class316 var3 = class309.field4194;
        synchronized (class309.field4194) {
            for (int var4 = 0; var4 < this.field1714.length; var4++) {
                if (!class309.field4194.method1906(-1, 0, this.field1714[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lrg;I)V")
    public final void method855(class366 arg0, int arg1) {
        field1710++;
        while (true) {
            int var3 = arg0.method2306((byte) 48);
            if (var3 == 0) {
                int var4 = 65 % ((arg1 + 27) / 39);
                return;
            }
            this.method851(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)Z")
    public final boolean method856(boolean arg0) {
        field1715++;
        boolean var2 = arg0;
        class316 var3 = class309.field4194;
        synchronized (class309.field4194) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field1712[var4] != -1 && !class309.field4194.method1906(-1, 0, this.field1712[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
