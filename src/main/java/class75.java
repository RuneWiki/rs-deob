import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class75 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lim;")
    public static class353 field1020 = new class353(37, 6);

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[Lvda;")
    public static class311[] field1023 = new class311[5];

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Llda;")
    public class192 field1024;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
    public int[] field1022;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static void method436(boolean arg0) {
        field1020 = null;
        field1023 = null;
        if (arg0) {
            field1020 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < field1023.length; var0++) {
            field1023[var0] = new class311();
        }
    }
}
