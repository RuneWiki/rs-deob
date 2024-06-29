import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class61 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lmb;")
    public static class132 field1032 = class166.method1092("Spielwelt erstellt)3", 112);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Loc;")
    public static class155 field1031;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[[I")
    public static int[][] field1033;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Z")
    public static final boolean method395(byte arg0, int arg1) {
        field1035++;
        if (arg0 == -100) {
            return arg1 >= 48 && arg1 <= 57;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method396(byte arg0) {
        field1031 = null;
        field1033 = null;
        if (arg0 > -100) {
            field1031 = null;
        }
        field1032 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
    public static final void method397(int arg0, int arg1, int arg2) {
        field1029++;
        class64.field1054.method660(arg1, 3);
        class65.field1077++;
        class64.field1054.method726((byte) 96, arg0);
        class64.field1054.method715(106, arg2);
    }
}
