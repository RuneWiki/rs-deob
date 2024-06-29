import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class48 extends class137 {

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "Lj;")
    public static class269 field659 = new class269();

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Z")
    public static volatile boolean field665 = true;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "Lbe;")
    public static class283 field662 = class153.method941(125, "Null");

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "[[I")
    public static int[][] field663 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "[I")
    public static int[] field666 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "[B")
    public static byte[] field664 = new byte[32896];

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Lbe;")
    public static class283 field668;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "Lek;")
    public static class172 field660;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 12)
    public static void method278(boolean arg0) {
        field659 = null;
        field660 = null;
        if (!arg0) {
            return;
        }
        field668 = null;
        field662 = null;
        field664 = null;
        field663 = (int[][]) null;
        field666 = null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 38)
    public static final void method279(int arg0) {
        field661++;
        class87.field1466.method1631(arg0 ^ 0x1A09);
        class150.field2445.method1631(-27875);
        class104.field1779.method1631(-27875);
        if (arg0 != -30444) {
            method280((byte) 9, (class283) null, -124, (class283) null, (class283) null);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLbe;ILbe;Lbe;)V", line = 56)
    public static final void method280(byte arg0, class283 arg1, int arg2, class283 arg3, class283 arg4) {
        int var5 = -103 / ((56 - arg0) / 57);
        class252.method1716(-1, arg2, arg4, 21, arg1, arg3);
        field656++;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field664[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field668 = class153.method941(-51, "<br>");
    }
}
