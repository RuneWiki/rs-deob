import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class138 extends class14 {

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
    public int field1808 = -1;

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
    public static int field1812 = 0;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "Lme;")
    public static class668 field1810 = new class668(8);

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "Ljava/lang/String;")
    public String field1809;

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "Ljava/lang/String;")
    public String field1817;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(II)V", line = 13)
    public static final void method1038(int arg0, int arg1) {
        class693.field9478 = arg0;
        ++field1813;
        class527.field6862 = arg1;
        class693.field9478 = -1;
        class109.method840((byte) -98);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V", line = 26)
    public static final void method1039(byte arg0) {
        ++field1815;
        class346.field4418.method3658(arg0 ^ -2);
        if (arg0 != -2) {
            method1038(2, -44);
        }
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)Ldm;", line = 39)
    public final class684 method1040(byte arg0) {
        ++field1816;
        if (arg0 <= 57) {
            field1810 = null;
        }
        return class225.field2928[super.field160];
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(B)V", line = 51)
    public static void method1041(byte arg0) {
        if (arg0 > -110) {
            field1814 = 24;
        }
        field1810 = null;
    }
}
