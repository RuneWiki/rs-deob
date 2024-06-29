import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class63 {

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "[I")
    public static int[] field791 = new int[120];

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "Llu;")
    public static class610 field792;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "Lh;")
    public static class572 field794;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
    public static void method411(int arg0) {
        field794 = null;
        field792 = null;
        field791 = null;
        if (arg0 > -97) {
            field795 = 97;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field791[var1] = var0 / 4;
        }
        field793 = 1405;
        field792 = new class610(49, 5);
        field794 = new class572("wave2:", "welle2:", "ondulation2:", "onda2:");
        field795 = 0;
    }
}
