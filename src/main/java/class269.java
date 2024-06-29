import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class269 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field4618 = -1;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[Z")
    public static boolean[] field4623 = new boolean[100];

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[B")
    public static byte[] field4621 = new byte[32896];

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Loh;")
    public static class15 field4619;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4621[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V", line = 31)
    public static void method1949(boolean arg0) {
        if (!arg0) {
            method1949(true);
        }
        field4619 = null;
        field4621 = null;
        field4623 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Loh;BLoh;)I", line = 56)
    public static final int method1950(class15 arg0, byte arg1, class15 arg2) {
        field4622++;
        int var3 = 0;
        if (arg2.method117(-32236, class100.field1618)) {
            var3++;
        }
        if (arg2.method117(-32236, class196.field3266)) {
            var3++;
        }
        if (arg2.method117(-32236, class94.field1512)) {
            var3++;
        }
        if (arg1 != 60) {
            return -53;
        }
        if (arg0.method117(arg1 ^ 0xFFFF8228, class100.field1618)) {
            var3++;
        }
        if (arg0.method117(-32236, class196.field3266)) {
            var3++;
        }
        if (arg0.method117(-32236, class94.field1512)) {
            var3++;
        }
        return var3;
    }
}
