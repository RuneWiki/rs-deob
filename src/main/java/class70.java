import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class70 {

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "[I")
    public static int[] field1743 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lfe;")
    public static class36 field1729 = new class36(5000);

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field1752 = 0;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "La;")
    public static class1 field1754 = class113.method934(-11538, "title)3jpg");

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "La;")
    public static class1 field1748 = class113.method934(-11538, "Ignorieren");

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "[I")
    public static int[] field1756 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field1753 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public int field1739;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "Lu;")
    public static class120 field1755;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "Lna;")
    public static class79 field1750;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 14)
    public static final void method663(int arg0) {
        class1 var1 = null;
        for (int var2 = 0; var2 < class42.field1105; var2++) {
            if (class102.field2589[var2].method11(class93.field2337, 32) != -1) {
                var1 = class102.field2589[var2].method1((byte) 95, class102.field2589[var2].method11(class93.field2337, 32));
                break;
            }
        }
        field1747++;
        if (var1 == null) {
            class46.method485(-1);
            return;
        }
        int var3 = class93.field2309;
        int var4 = class37.field987;
        if (var3 > 190) {
            var3 = 190;
        }
        int var5 = class5.field220;
        int var6 = client.field580;
        if (var4 < 0) {
            var4 = 0;
        }
        int var7 = 6116423;
        class111.method916(var4, var6, var3, var5, var7);
        class111.method916(var4 + 1, var6 - -1, arg0 + var3, 16, 0);
        class111.method925(var4 + 1, var6 + 18, var3 - 2, var5 + -19, 0);
        class116.field2905.method207(var1, var4 + 3, var6 + 14, var7, false);
        int var8 = class24.field742;
        int var9 = class102.field2571;
        if (class19.field641 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (class19.field641 == 1) {
            var8 -= 553;
            var9 -= 205;
        }
        if (class19.field641 == 2) {
            var9 -= 357;
            var8 -= 17;
        }
        for (int var10 = 0; var10 < class42.field1105; var10++) {
            int var11 = (class42.field1105 - var10 - 1) * 15 + var6 + 31;
            class1 var12 = class102.field2589[var10];
            int var13 = 16777215;
            if (var12.method38(arg0 + 112, var1)) {
                var12 = var12.method19(0, 0, var12.method10(-3136) - var1.method10(arg0 - 3134));
                if (var12.method38(arg0 ^ 0xFFFFFF90, class93.field2340)) {
                    var12 = var12.method19(0, 0, var12.method10(-3136) - class93.field2340.method10(-3136));
                }
            }
            if (var4 < var8 && var8 < var3 + var4 && var11 - 13 < var9 && var11 + 3 > var9) {
                var13 = 16776960;
            }
            class116.field2905.method207(var12, var4 + 3, var11, var13, true);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V", line = 128)
    public static final void method664(int arg0, int arg1, int arg2) {
        field1726++;
        long var3 = (long) ((arg0 << 16) + arg2);
        class104 var5 = (class104) class49.field1330.method501(var3, 6120);
        if (var5 != null) {
            class37.field997.method616(true, var5);
            if (arg1 <= 11) {
                field1748 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I", line = 146)
    public static final int method665(int arg0) {
        if (arg0 != -1) {
            field1729 = null;
        }
        field1735++;
        return class92.field2296++;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V", line = 168)
    public static void method666(int arg0) {
        field1756 = null;
        field1750 = null;
        field1748 = null;
        field1754 = null;
        field1743 = null;
        field1729 = null;
        if (arg0 >= 29) {
            field1755 = null;
        }
    }
}
