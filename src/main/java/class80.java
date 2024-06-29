import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class80 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
    public static int[] field1100 = new int[4096];

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lqw;")
    public static class84 field1101;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1099;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1100[var0] = class172.method1162(72, var0);
        }
        field1101 = new class84();
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 3)
    public static final void method639(int arg0) {
        if (arg0 <= 14) {
            field1100 = null;
        }
        class63.method384();
        field1099++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 14)
    public static void method640(boolean arg0) {
        field1100 = null;
        if (!arg0) {
            method639(-26);
        }
        field1101 = null;
    }
}
