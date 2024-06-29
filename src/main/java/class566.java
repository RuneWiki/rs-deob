import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class566 {

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "[I")
    public static int[] field8193 = new int[32];

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "Llc;")
    public static class435 field8195;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "Llc;")
    public static class435 field8196;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field8193[var1] = var0 - 1;
            var0 += var0;
        }
        field8194 = 0;
        field8195 = new class435(86, -1);
        field8196 = new class435(103, -1);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V", line = 10)
    public static void method3383(int arg0) {
        field8193 = null;
        field8195 = null;
        field8196 = null;
        if (arg0 > -20) {
            method3383(119);
        }
    }
}
