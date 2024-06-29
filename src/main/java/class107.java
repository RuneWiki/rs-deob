import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class107 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[[Z")
    public static boolean[][] field1994 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Ldg;")
    public static class317 field1996 = new class317();

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 12)
    public static void method889(int arg0) {
        if (arg0 == 7) {
            field1996 = null;
            field1994 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V", line = 31)
    public static final void method890(int arg0, int arg1, int arg2) {
        field1995++;
        class104 var3 = class293.method2085(arg1, arg0, false);
        var3.method879(0);
        var3.field1966 = arg2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 42)
    public static final void method891(byte arg0) {
        if (arg0 < -101) {
            field1993++;
            class173.field3125.method1338((byte) -119);
        }
    }
}
