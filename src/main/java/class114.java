import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class114 extends class170 {

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "Lok;")
    public static class146 field1842 = class235.method1724(-12908, "<col=ffff00>");

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Z")
    public static boolean field1838 = false;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Z")
    public static boolean field1840 = false;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field1843 = 0;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Lok;")
    public static class146 field1844 = class235.method1724(-12908, "brillant1:");

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "[Lan;")
    public static class315[] field1839;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Lok;", line = 10)
    public static final class146 method776(int arg0, int arg1) {
        class146 var2 = new class146();
        field1841++;
        var2.field2462 = new byte[arg1];
        var2.field2461 = 0;
        int var3 = -118 % ((20 - arg0) / 39);
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lkj;Lkj;I)V", line = 24)
    public static final void method777(class171 arg0, class171 arg1, int arg2) {
        if (arg1.field2895 != null) {
            arg1.method1325(-2935);
        }
        arg1.field2895 = arg0.field2895;
        arg1.field2896 = arg0;
        field1837++;
        arg1.field2895.field2896 = arg1;
        arg1.field2896.field2895 = arg1;
        if (arg2 != 126) {
            method776(69, -90);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)I", line = 42)
    public static final int method778(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 79)
    public static void method779(int arg0) {
        field1844 = null;
        field1842 = null;
        field1839 = null;
        if (arg0 != 21454) {
            field1844 = (class146) null;
        }
    }
}
