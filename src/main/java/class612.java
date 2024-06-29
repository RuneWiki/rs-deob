import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class612 {

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "Ldj;")
    public static class703 field8750 = new class703(2, 4, 4, 0);

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field8753 = 0;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "[I")
    public static int[] field8752 = new int[120];

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "[B")
    public static byte[] field8751;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field8752[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 8)
    public static void method3568(byte arg0) {
        if (arg0 > -94) {
            method3568((byte) 11);
        }
        field8750 = null;
        field8751 = null;
        field8752 = null;
    }
}
