import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class81 {

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Llc;")
    private static class69 field1831 = class69.method470((byte) -124, "Take");

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Llc;")
    public static class69 field1837 = class69.method470((byte) -123, "*6n*6nYou have @gre@");

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1835 = 0;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1836 = 0;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field1834 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Llc;")
    public static class69 field1830 = field1831;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Llc;")
    public static class69 field1839 = class69.method470((byte) -121, "backbase1");

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lcb;")
    public static class15 field1844;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lcc;")
    public static class16 field1833;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Lkc;")
    public static class63 field1832;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[I")
    public static int[] field1842;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lkc;Lkc;IZ)V")
    public static final void method586(class63 arg0, class63 arg1, int arg2, boolean arg3) {
        class108.field2394 = arg1;
        class3.field64 = arg3;
        if (arg2 != 146) {
            method586(null, null, 64, true);
        }
        class91.field1979 = arg0;
        field1843++;
        class49.field1004 = class91.field1979.method382(10, (byte) 24);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lkc;B)V")
    public static final void method587(class63 arg0, byte arg1) {
        if (arg1 == -53) {
            field1841++;
            class36.field732 = arg0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)I")
    public static final int method588(boolean arg0, int arg1) {
        if (!arg0) {
            return 19;
        }
        class2 var2 = class61.method372(104, arg1);
        int var3 = var2.field8;
        int var4 = var2.field7;
        int var5 = var2.field18;
        field1840++;
        int var6 = class119.field2540[var5 - var4];
        return var6 & class10.field204[var3] >> var4;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static final void method589(byte arg0) {
        field1838++;
        if (class10.field194 != 0) {
            return;
        }
        if (class62.field1278 == 1) {
            int var1 = class19.field417 - 5 - 4;
            int var2 = class127.field2733 - 25 - 550;
            if (var2 >= 0 && var1 >= 0 && var2 < 146 && var1 < 151) {
                var1 -= 75;
                var2 -= 73;
                int var3 = class17.field342 + class128.field2757 & 0x7FF;
                int var4 = class117.field2527[var3];
                int var5 = (class70.field1558 + 256) * var4 >> 8;
                int var6 = class117.field2514[var3];
                int var7 = (class70.field1558 + 256) * var6 >> 8;
                int var8 = var1 * var7 - var2 * var5 >> 11;
                int var9 = var1 * var5 + var2 * var7 >> 11;
                int var10 = class46.field974.field1058 + var9 >> 7;
                int var11 = class46.field974.field1065 - var8 >> 7;
                boolean var12 = class85.method609(0, 0, true, 0, 0, 0, class46.field974.field1097[0], class46.field974.field1041[0], 130, var11, 1, var10);
                if (var12) {
                    class26.field557.method675((byte) -97, var2);
                    class26.field557.method675((byte) -67, var1);
                    class26.field557.method686(16711680, class17.field342);
                    class26.field557.method675((byte) -126, 57);
                    class26.field557.method675((byte) -31, class128.field2757);
                    class26.field557.method675((byte) -36, class70.field1558);
                    class26.field557.method675((byte) -124, 89);
                    class26.field557.method686(16711680, class46.field974.field1058);
                    class26.field557.method686(16711680, class46.field974.field1065);
                    class26.field557.method675((byte) -118, class43.field857);
                    class26.field557.method675((byte) -53, 63);
                }
            }
        }
        if (arg0 > -70) {
            field1839 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
    public static int method590(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method591(int arg0) {
        field1842 = null;
        field1839 = null;
        field1832 = null;
        field1844 = null;
        field1830 = null;
        field1837 = null;
        field1833 = null;
        field1831 = null;
        if (arg0 != 256) {
            method586(null, null, 15, true);
        }
    }
}
