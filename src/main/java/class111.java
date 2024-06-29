import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class111 extends class135 {

    @OriginalMember(owner = "client!mj", name = "lb", descriptor = "Ljd;")
    public static class86 field2119 = class122.method868("m", true);

    @OriginalMember(owner = "client!mj", name = "tb", descriptor = "I")
    public static int field2127 = 0;

    @OriginalMember(owner = "client!mj", name = "ob", descriptor = "Ljd;")
    public static class86 field2122 = class122.method868("Eingabeprozedur geladen)3", true);

    @OriginalMember(owner = "client!mj", name = "ub", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!mj", name = "vb", descriptor = "Z")
    public static boolean field2129 = true;

    @OriginalMember(owner = "client!mj", name = "mb", descriptor = "Ljd;")
    public static class86 field2120 = class122.method868(" <col=ffffff>", true);

    @OriginalMember(owner = "client!mj", name = "qb", descriptor = "[I")
    public static int[] field2124 = new int[4096];

    @OriginalMember(owner = "client!mj", name = "wb", descriptor = "Ljd;")
    public static class86 field2130 = class122.method868("<col=ffff00>", true);

    @OriginalMember(owner = "client!mj", name = "pb", descriptor = "[Lwh;")
    public static class188[] field2123 = new class188[6];

    @OriginalMember(owner = "client!mj", name = "xb", descriptor = "Ljd;")
    private static class86 field2131 = class122.method868("Started 3d Library", true);

    @OriginalMember(owner = "client!mj", name = "rb", descriptor = "Ljd;")
    public static class86 field2125 = field2131;

    @OriginalMember(owner = "client!mj", name = "yb", descriptor = "Ljd;")
    public static class86 field2132 = class122.method868("underlay", true);

    @OriginalMember(owner = "client!mj", name = "nb", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!mj", name = "sb", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public static void method785(int arg0) {
        if (arg0 != 20207) {
            method785(60);
        }
        field2130 = null;
        field2131 = null;
        field2124 = null;
        field2123 = null;
        field2122 = null;
        field2119 = null;
        field2120 = null;
        field2125 = null;
        field2132 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = 111 % ((arg1 - 12) / 58);
        ++field2126;
        int[][] var4 = super.field4787.method1657(arg0, (byte) -107);
        if (super.field4787.field4355 && this.method967(-2951)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int var7 = arg0 % super.field2579 * super.field2579;
            int[] var8 = var4[2];
            for (int var9 = 0; ~var9 > ~class176.field3200; ++var9) {
                int var10 = super.field2589[var9 % super.field2591 + var7];
                var8[var9] = class1.method5(var10 << 4, 4080);
                var6[var9] = class1.method5(4080, var10 >> 4);
                var5[var9] = class1.method5(var10 >> 12, 4080);
            }
        }
        return var4;
    }
}
