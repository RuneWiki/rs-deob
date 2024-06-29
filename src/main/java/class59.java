import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class59 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Leb;")
    private static class230 field1128 = class68.method589(0, "Loaded update list");

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
    public static int[] field1130 = new int[200];

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Leb;")
    public static class230 field1127 = field1128;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[[S")
    public static short[][] field1126;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method505(byte arg0) {
        field1126 = null;
        field1128 = null;
        if (arg0 < 89) {
            method505((byte) 35);
        }
        field1127 = null;
        field1130 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method506(int arg0) {
        field1131++;
        if (arg0 == 200) {
            class102.field1865.method1124(0);
        }
    }
}
