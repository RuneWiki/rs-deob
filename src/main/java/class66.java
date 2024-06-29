import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 extends class60 {

    @OriginalMember(owner = "client!l", name = "yb", descriptor = "I")
    private int field1703;

    @OriginalMember(owner = "client!l", name = "Eb", descriptor = "I")
    private int field1709;

    @OriginalMember(owner = "client!l", name = "vb", descriptor = "I")
    private int field1700;

    @OriginalMember(owner = "client!l", name = "jb", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client!l", name = "nb", descriptor = "I")
    private int field1692;

    @OriginalMember(owner = "client!l", name = "qb", descriptor = "I")
    private int field1695;

    @OriginalMember(owner = "client!l", name = "rb", descriptor = "I")
    private int field1696;

    @OriginalMember(owner = "client!l", name = "Bb", descriptor = "Loe;")
    private class89 field1706;

    @OriginalMember(owner = "client!l", name = "mb", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client!l", name = "Ab", descriptor = "I")
    private int field1705;

    @OriginalMember(owner = "client!l", name = "ub", descriptor = "I")
    public static int field1699 = 0;

    @OriginalMember(owner = "client!l", name = "kb", descriptor = "Lv;")
    public static class122 field1689 = class55.method425(-68, "Einloggen");

    @OriginalMember(owner = "client!l", name = "zb", descriptor = "Lv;")
    private static class122 field1704 = class55.method425(-78, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!l", name = "Db", descriptor = "I")
    public static int field1708 = 0;

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "Lv;")
    public static class122 field1685 = field1704;

    @OriginalMember(owner = "client!l", name = "tb", descriptor = "Lv;")
    private static class122 field1698 = class55.method425(-55, "Hide");

    @OriginalMember(owner = "client!l", name = "ib", descriptor = "Lv;")
    public static class122 field1687 = field1698;

    @OriginalMember(owner = "client!l", name = "lb", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!l", name = "ob", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!l", name = "wb", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!l", name = "xb", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!l", name = "Cb", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!l", name = "Fb", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!l", name = "sb", descriptor = "Luc;")
    public static class120 field1697;

    @OriginalMember(owner = "client!l", name = "pb", descriptor = "Lkb;")
    public static class62 field1694;

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "Lm;")
    public static class72 field1686;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)Llb;", line = 11)
    public final class68 method424(boolean arg0) {
        if (this.field1706 != null) {
            int var2 = class16.field396 - this.field1691;
            if (var2 > 100 && this.field1706.field2283 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (var2 <= this.field1706.field2287[this.field1705]) {
                            break label42;
                        }
                        var2 -= this.field1706.field2287[this.field1705];
                        this.field1705++;
                    } while (this.field1706.field2299.length > this.field1705);
                    this.field1705 -= this.field1706.field2283;
                } while (this.field1705 >= 0 && this.field1705 < this.field1706.field2299.length);
                this.field1706 = null;
            }
            this.field1691 = class16.field396 - var2;
        }
        if (arg0) {
            return null;
        }
        field1702++;
        class42 var3 = class14.method124((byte) 52, this.field1696);
        if (var3.field1067 != null) {
            var3 = var3.method364(3863);
        }
        return var3 == null ? null : var3.method355((byte) 43, this.field1692, this.field1709, this.field1695, this.field1688, this.field1706, this.field1700, this.field1703, this.field1705);
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V", line = 64)
    public static void method532(int arg0) {
        field1685 = null;
        field1704 = null;
        field1694 = null;
        field1687 = null;
        field1698 = null;
        field1686 = null;
        field1697 = null;
        field1689 = null;
        if (arg0 <= 50) {
            field1694 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZLm;I)V", line = 81)
    public static final void method533(boolean arg0, class72 arg1, int arg2) {
        field1710++;
        if (class113.field2759 != null) {
            try {
                class113.field2759.method586(99);
            } catch (Exception var8) {
            }
            class113.field2759 = null;
        }
        class113.field2759 = arg1;
        class55.method423(arg0, true);
        if (arg2 != -27147) {
            field1701 = 0;
        }
        class131.field3179.field1617 = 0;
        class64.field1643 = null;
        class23.field610 = 0;
        class75.field2025 = null;
        while (true) {
            class82 var3 = (class82) class51.field1297.method639((byte) -121);
            if (var3 == null) {
                while (true) {
                    class82 var4 = (class82) class22.field600.method639((byte) -121);
                    if (var4 == null) {
                        if (class122.field2989 != 0) {
                            try {
                                class64 var5 = new class64(4);
                                var5.method523(255, 4);
                                var5.method523(arg2 ^ 0xFFFF950A, class122.field2989);
                                var5.method479(1436108328, 0);
                                class113.field2759.method594((byte) 111, 0, var5.field1679, 4);
                            } catch (IOException var7) {
                                try {
                                    class113.field2759.method586(102);
                                } catch (Exception var6) {
                                }
                                class113.field2759 = null;
                                class22.field588++;
                            }
                        }
                        class36.field887 = 0;
                        class107.field2639 = System.currentTimeMillis();
                        return;
                    }
                    class28.field730.method576(var4, false);
                    class18.field440.method633(var4.field644, -100, var4);
                    class8.field206--;
                    class73.field1922++;
                }
            }
            class56.field1474.method633(var3.field644, -100, var3);
            class118.field2843++;
            class122.field2976--;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIZIZ)Lrd;", line = 157)
    public static final class106 method534(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        int var5 = -127 % ((-arg1 - 54) / 61);
        field1707++;
        class83 var6 = null;
        if (class82.field2128 != null) {
            var6 = new class83(arg3, class82.field2128, class115.field2820[arg3], 1000000);
        }
        return new class106(var6, class62.field1594, arg3, arg2, arg0, arg4);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBI)I", line = 191)
    public static final int method535(int arg0, byte arg1, int arg2) {
        field1690++;
        int var3 = 18 % ((arg1 + 13) / 60);
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 ^ var4 << 13;
        int var6 = (var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 232)
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field1703 = arg4;
        this.field1709 = arg5;
        this.field1700 = arg3;
        this.field1688 = arg2;
        this.field1692 = arg6;
        this.field1695 = arg1;
        this.field1696 = arg0;
        if (arg7 != -1) {
            this.field1706 = class51.method401(-30325, arg7);
            this.field1691 = class16.field396 - 1;
            this.field1705 = 0;
            if (arg8 && this.field1706.field2283 != -1) {
                this.field1705 = (int) (Math.random() * (double) this.field1706.field2299.length);
                this.field1691 -= (int) (Math.random() * (double) this.field1706.field2287[this.field1705]);
                return;
            }
        }
    }
}
