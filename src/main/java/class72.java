import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 extends class119 {

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public int field1664 = -1;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "Z")
    public boolean field1653 = false;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public int field1656 = 5;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    public int field1671 = 99;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public int field1669 = -1;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public int field1672 = 2;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public int field1670 = -1;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    public int field1682 = -1;

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "I")
    public int field1683 = -1;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "Lv;")
    private static class146 field1666 = class159.method1226((byte) -37, "Choose Option");

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "Lv;")
    public static class146 field1657 = field1666;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "Lv;")
    private static class146 field1654 = class159.method1226((byte) -37, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "Lv;")
    public static class146 field1658 = class159.method1226((byte) -37, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "Lv;")
    public static class146 field1676 = class159.method1226((byte) -37, "AUS");

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "Lv;")
    public static class146 field1673 = field1654;

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lua;")
    public static class140 field1674 = new class140(100);

    @OriginalMember(owner = "client!kc", name = "pb", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "I")
    public static int field1684 = 0;

    @OriginalMember(owner = "client!kc", name = "rb", descriptor = "[I")
    public static int[] field1689 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!kc", name = "sb", descriptor = "I")
    public static int field1690 = 1;

    @OriginalMember(owner = "client!kc", name = "ub", descriptor = "I")
    public static int field1692 = 0;

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "[I")
    public static int[] field1685 = new int[2048];

    @OriginalMember(owner = "client!kc", name = "vb", descriptor = "Lv;")
    public static class146 field1693 = class159.method1226((byte) -37, "<col=c0ff00>");

    @OriginalMember(owner = "client!kc", name = "tb", descriptor = "I")
    public static int field1691 = 0;

    @OriginalMember(owner = "client!kc", name = "qb", descriptor = "I")
    public static int field1688 = 0;

    @OriginalMember(owner = "client!kc", name = "wb", descriptor = "B")
    public static byte field1694;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "[I")
    public int[] field1651;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "[I")
    private int[] field1655;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "[I")
    public int[] field1665;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "[I")
    private int[] field1668;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "[I")
    public int[] field1680;

    @OriginalMember(owner = "client!kc", name = "ob", descriptor = "[I")
    public static int[] field1686;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILkc;Lu;ZI)Lu;")
    public final class139 method511(int arg0, class72 arg1, class139 arg2, boolean arg3, int arg4) {
        int var6 = this.field1651[arg4];
        field1659++;
        class155 var7 = class105.method853((byte) 100, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method519(arg0, -100, arg2);
        }
        int var9 = arg1.field1651[arg0];
        class155 var10 = class105.method853((byte) 125, var9 >> 16);
        if (arg3) {
            this.field1672 = -56;
        }
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class139 var12 = arg2.method1035(!var7.method1162((byte) -103, var8));
            var12.method1040(var7, var8);
            return var12;
        } else {
            class139 var13 = arg2.method1035(!var7.method1162((byte) -103, var8) & !var10.method1162((byte) -103, var11));
            var13.method1043(var7, var8, var10, var11, this.field1668);
            return var13;
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    public final void method512(int arg0) {
        field1667++;
        if (this.field1683 == -1) {
            if (this.field1668 == null) {
                this.field1683 = 0;
            } else {
                this.field1683 = 2;
            }
        }
        if (this.field1669 == -1) {
            if (this.field1668 == null) {
                this.field1669 = 0;
            } else {
                this.field1669 = 2;
            }
        }
        if (arg0 != 27488) {
            this.method517(-16, null, 87, -128);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lne;I)V")
    public final void method513(class95 arg0, int arg1) {
        field1652++;
        if (arg1 != -1) {
            field1689 = null;
        }
        while (true) {
            int var3 = arg0.method790((byte) 73);
            if (var3 == 0) {
                return;
            }
            this.method523((byte) -127, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)I")
    public static final int method514(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1660++;
        int var5 = 65536 - class45.field1032[arg3 * 1024 / arg4] >> 1;
        if (arg2 != 1255230384) {
            field1673 = null;
        }
        return ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)I")
    public static final int method515(int arg0) {
        field1679++;
        if (arg0 != -2077634032) {
            method522((byte) -128);
        }
        return 6;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILu;)Lu;")
    public final class139 method516(int arg0, int arg1, class139 arg2) {
        field1661++;
        int var4 = this.field1651[arg0];
        class155 var5 = class105.method853((byte) 126, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1035(true);
        }
        class155 var7 = null;
        int var8 = 0;
        if (arg1 != -1) {
            return null;
        }
        if (this.field1655 != null && this.field1655.length > arg0) {
            int var9 = this.field1655[arg0];
            var7 = class105.method853((byte) 97, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class139 var11 = arg2.method1035(!var5.method1162((byte) -103, var6));
            var11.method1040(var5, var6);
            return var11;
        } else {
            class139 var10 = arg2.method1035(!var5.method1162((byte) -103, var6) & !var7.method1162((byte) -103, var8));
            var10.method1040(var5, var6);
            var10.method1040(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILu;II)Lu;")
    public final class139 method517(int arg0, class139 arg1, int arg2, int arg3) {
        int var5 = this.field1651[arg0];
        field1663++;
        class155 var6 = class105.method853((byte) 119, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method1035(true);
        }
        int var8 = arg2 & 0x3;
        class139 var9 = arg1.method1035(!var6.method1162((byte) -103, var7));
        if (var8 == 1) {
            var9.method1026();
        } else if (var8 == 2) {
            var9.method1025();
        } else if (var8 == 3) {
            var9.method1029();
        }
        var9.method1040(var6, var7);
        if (~var8 == arg3) {
            var9.method1029();
        } else if (var8 == 2) {
            var9.method1025();
        } else if (var8 == 3) {
            var9.method1026();
        }
        return var9;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILla;I)[Lie;")
    public static final class61[] method518(int arg0, int arg1, class77 arg2, int arg3) {
        if (arg1 != 99) {
            field1654 = null;
        }
        field1662++;
        return class1.method3(arg0, arg3, -112, arg2) ? class125.method935(21226) : null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IILu;)Lu;")
    public final class139 method519(int arg0, int arg1, class139 arg2) {
        int var4 = this.field1651[arg0];
        field1678++;
        class155 var5 = class105.method853((byte) 99, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg1 >= -41) {
            field1691 = 53;
        }
        if (var5 == null) {
            return arg2.method1035(true);
        } else {
            class139 var7 = arg2.method1035(!var5.method1162((byte) -103, var6));
            var7.method1040(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method520(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1677++;
        class125 var5 = (class125) class124.field2868.method332((byte) -79, (long) arg3);
        if (var5 == null) {
            var5 = new class125();
            class124.field2868.method336((long) arg3, var5, -8899);
        }
        if (arg4) {
            return;
        }
        if (arg1 >= var5.field2899.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field2899.length; var8++) {
                var6[var8] = var5.field2899[var8];
                var7[var8] = var5.field2900[var8];
            }
            for (int var9 = var5.field2899.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2899 = var6;
            var5.field2900 = var7;
        }
        var5.field2899[arg1] = arg2;
        var5.field2900[arg1] = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lu;II)Lu;")
    public final class139 method521(class139 arg0, int arg1, int arg2) {
        int var4 = this.field1651[arg1];
        field1681++;
        class155 var5 = class105.method853((byte) 123, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1041(true);
        }
        if (arg2 != 12) {
            field1685 = null;
        }
        class139 var7 = arg0.method1041(!var5.method1162((byte) -103, var6));
        var7.method1040(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public static void method522(byte arg0) {
        field1666 = null;
        field1673 = null;
        field1657 = null;
        field1658 = null;
        field1693 = null;
        field1685 = null;
        field1674 = null;
        if (arg0 >= 21) {
            field1676 = null;
            field1654 = null;
            field1689 = null;
            field1686 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLne;I)V")
    private final void method523(byte arg0, class95 arg1, int arg2) {
        field1675++;
        if (arg2 == 1) {
            int var4 = arg1.method795(1);
            this.field1680 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1680[var5] = arg1.method795(1);
            }
            this.field1651 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1651[var6] = arg1.method795(1);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1651[var7] = (arg1.method795(1) << 16) + this.field1651[var7];
            }
        } else if (arg2 == 2) {
            this.field1682 = arg1.method795(arg0 ^ 0xFFFFFF80);
        } else if (arg2 == 3) {
            int var8 = arg1.method790((byte) 73);
            this.field1668 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1668[var9] = arg1.method790((byte) 73);
            }
            this.field1668[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field1653 = true;
        } else if (arg2 == 5) {
            this.field1656 = arg1.method790((byte) 73);
        } else if (arg2 == 6) {
            this.field1670 = arg1.method795(arg0 + 128);
        } else if (arg2 == 7) {
            this.field1664 = arg1.method795(1);
        } else if (arg2 == 8) {
            this.field1671 = arg1.method790((byte) 73);
        } else if (arg2 == 9) {
            this.field1669 = arg1.method790((byte) 73);
        } else if (arg2 == 10) {
            this.field1683 = arg1.method790((byte) 73);
        } else if (arg2 == 11) {
            this.field1672 = arg1.method790((byte) 73);
        } else if (arg2 == 12) {
            int var12 = arg1.method790((byte) 73);
            this.field1655 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1655[var13] = arg1.method795(class79.method609(arg0, -128));
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field1655[var14] += arg1.method795(class79.method609(arg0, -128)) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg1.method790((byte) 73);
            this.field1665 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1665[var11] = arg1.method763(true);
            }
        }
        if (arg0 != -127) {
            field1686 = null;
        }
    }
}
