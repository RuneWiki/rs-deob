import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class120 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "J")
    public static long field1703 = 0L;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
    public static int[] field1705 = new int[4096];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[Lgg;")
    public static class61[] field1704;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method782(byte arg0) {
        if (arg0 <= 32) {
            method783(-64, 38);
        }
        field1705 = null;
        field1704 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Z")
    public static final boolean method783(int arg0, int arg1) {
        if (arg0 != 18287) {
            field1705 = null;
        }
        field1706++;
        return (-arg1 & arg1) == arg1;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1705[var0] = class165.method1144((byte) -126, var0);
        }
    }
}
