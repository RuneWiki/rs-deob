import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class97 {

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[Lhh;")
    public static class163[] field1825 = new class163[8];

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field1824 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lhh;")
    private static class163 field1821 = class137.method1065("yellow:", 17);

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[[I")
    public static int[][] field1829 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "[I")
    public static int[] field1828 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Lhh;")
    public static class163 field1830 = class137.method1065("T", 17);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lhh;")
    public static class163 field1819 = field1821;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lhh;")
    public static class163 field1827 = field1821;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field1818 = 0;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lhh;")
    public static class163 field1834 = class137.method1065("scape main", 17);

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field1837 = 0;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)I")
    public static final int method764(int arg0, int arg1) {
        if (arg0 <= 67) {
            method769((class79) null, (byte) -73);
        }
        field1823++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method765(int arg0) {
        field1829 = null;
        field1830 = null;
        if (arg0 != 21913) {
            field1830 = null;
        }
        field1825 = null;
        field1821 = null;
        field1827 = null;
        field1828 = null;
        field1834 = null;
        field1819 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZLhh;)V")
    public static final void method766(int arg0, boolean arg1, class163 arg2) {
        field1833++;
        class113 var3 = class126.method1001(94, 2, arg0);
        if (!arg1) {
            field1820 = 117;
        }
        var3.method898(-124);
        var3.field2122 = arg2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Z")
    public static final boolean method767(int arg0, byte arg1) {
        field1835++;
        if (arg1 != 101) {
            field1837 = 112;
        }
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static final void method768(int arg0) {
        int var1 = class264.field4593.length;
        if (arg0 != -1) {
            method765(11);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class264.field4593[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class84.field1602; var4++) {
                    if (class238.field4242[var4] == class199.field3572[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class238.field4242[class84.field1602] = class199.field3572[var2];
                    var3 = class84.field1602++;
                }
                class81 var5 = new class81(class264.field4593[var2]);
                int var6 = 0;
                while (class264.field4593[var2].length > var5.field1541 && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method658(-96);
                    int var9 = (var8 & 0x1FD0) >> 7;
                    int var10 = var8 & 0x3F;
                    int var11 = (class199.field3572[var2] & 0xFF) * 64 + var10 - class257.field4500;
                    int var12 = (class199.field3572[var2] >> 8) * 64 + var9 - class62.field1035;
                    class181 var13 = class220.method1556(var5.method658(-73), true);
                    int var14 = var8 >> 14;
                    if (class111.field2098[var7] == null && (var13.field3291 & 0x1) > 0 && class233.field4167 == var14 && var12 >= 0 && (var13.field3274 + var12) < 104 && var11 >= 0 && (var13.field3274 + var11) < 104) {
                        class111.field2098[var7] = new class2();
                        class2 var15 = class111.field2098[var7];
                        class155.field2887[class199.field3573++] = var7;
                        var15.field41 = var13;
                        var15.field3628 = class227.field4092;
                        var15.field3679 = var15.field41.field3332;
                        var15.field3651 = var15.field41.field3282;
                        var15.field3648 = var15.field41.field3281;
                        var15.field3656 = var15.field41.field3298;
                        if (var15.field3648 == 0) {
                            var15.field3667 = 0;
                        }
                        var15.field3652 = var15.field41.field3275;
                        var15.field3645 = var15.field41.field3274;
                        var15.field3663 = var15.field41.field3334;
                        var15.field3635 = var15.field41.field3303;
                        var15.field3670 = var15.field41.field3312;
                        var15.method1444(var12, arg0 + 85, var11, true);
                    }
                }
            }
        }
        field1826++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Loh;B)V")
    public static final void method769(class79 arg0, byte arg1) {
        field1822++;
        byte var2 = 20;
        arg0.method584(class258.field4524, 382, 245 - var2, 16777215, -1);
        int var3 = 253 - var2;
        class206.method1471(230, var3, 304, 34, 9179409);
        if (arg1 == 96) {
            class206.method1471(231, var3 + 1, 302, 32, 0);
            class206.method1483(232, var3 + 2, class87.field1621 * 3, 30, 9179409);
            class206.method1483((class87.field1621 * 3) + 232, var3 + 2, 300 - (class87.field1621 * 3), 30, 0);
            arg0.method584(class140.field2678, 382, 276 - var2, 16777215, -1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BII)I")
    public static final int method770(byte arg0, int arg1, int arg2) {
        int var3 = arg2 + (arg1 * 57);
        field1836++;
        int var4 = 15 / ((arg0 + 65) / 43);
        int var5 = var3 ^ var3 << 13;
        int var6 = Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589;
        return var6 >> 19 & 0xFF;
    }
}
