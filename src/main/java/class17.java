import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class17 {

    @OriginalMember(owner = "mapview!ia", name = "i", descriptor = "[I")
    private int[] field244;

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "Lt;")
    private static class31 field238 = class11.method64(-113, "POH Portal");

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "Lt;")
    private static class31 field236 = class11.method64(125, "Estate Agent");

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "[J")
    public static long[] field237 = new long[32];

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "Lt;")
    private static class31 field239 = class11.method64(-95, "Makeover Mage");

    @OriginalMember(owner = "mapview!ia", name = "g", descriptor = "[Z")
    public static boolean[] field242 = new boolean[112];

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "Lt;")
    public static class31 field240 = class11.method64(-121, "75(U");

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "mapview!ia", name = "h", descriptor = "Lg;")
    public static class12 field243;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)V", line = 30)
    public static void method98(int arg0) {
        field236 = null;
        int var1 = 15 % ((-arg0 - 58) / 50);
        field239 = null;
        field238 = null;
        field242 = null;
        field237 = null;
        field243 = null;
        field240 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)V", line = 56)
    public static final void method99(byte arg0) {
        class33.field390 = null;
        class28.field309 = null;
        class18.field245 = null;
        class32.field364 = null;
        if (arg0 <= 25) {
            field241 = -125;
        }
        class6.field115 = null;
        class10.field166 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)[Lt;", line = 71)
    public static final class31[] method100(int arg0) {
        if (arg0 != 1) {
            field241 = -82;
        }
        return new class31[] { class22.field265, class4.field111, class9.field143, class6.field121, class31.field342, class32.field362, class27.field305, class3.field99, class6.field117, class32.field371, class28.field310, class16.field228, class2.field90, class33.field379, class33.field381, class28.field316, class3.field101, class28.field313, class30.field333, class15.field223, class8.field133, class6.field124, class11.field185, class26.field298, class26.field292, class30.field335, class28.field317, class33.field389, class18.field247, class10.field153, class1.field80, class4.field112, class8.field132, class16.field229, class3.field95, class15.field221, class33.field385, class2.field91, class11.field187, class1.field77, mapview.field18, class2.field82, class30.field328, class15.field219, class6.field123, class4.field105, class32.field372, class3.field104, class31.field355, class30.field330, class32.field363, class8.field139, class8.field137, class16.field230, field239, class29.field325, class6.field122, field238, class10.field160, class2.field87, class25.field279, class11.field184, class18.field248, class18.field248, class18.field248, class18.field248, class18.field248, field236, class6.field119, class18.field248, class31.field341 };
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IB)I", line = 129)
    public final int method101(int arg0, byte arg1) {
        int var3 = this.field244.length - 2;
        int var4 = arg0 << 1 & var3;
        if (arg1 != 87) {
            return 22;
        }
        while (true) {
            int var5 = this.field244[var4];
            if (arg0 == var5) {
                return this.field244[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "([I)V", line = 159)
    public class17(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field244 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field244[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field244[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field244[var5 + var5] = arg0[var4];
            this.field244[var5 + var5 + 1] = var4++;
        }
    }
}
