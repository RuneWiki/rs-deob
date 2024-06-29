import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class146 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "[I")
    public static int[] field2150 = new int[32];

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "J")
    public static long field2155;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[Lhc;")
    public static class229[] field2152;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BZ)V")
    public static final void method969(byte arg0, boolean arg1) {
        class74.method507(-1, arg1, class242.field3880, class98.field1510, class135.field1960);
        int var2 = 74 % ((-arg0 - 22) / 47);
        field2151++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method970(byte arg0) {
        if (arg0 != 113) {
            method969((byte) 30, true);
        }
        field2152 = null;
        field2150 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2150[var1] = var0 - 1;
            var0 += var0;
        }
        field2154 = 0;
        field2155 = 0L;
    }
}
