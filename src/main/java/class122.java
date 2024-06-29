import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class122 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field1869 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1868 = "glow3:";

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
    public static boolean field1866 = false;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Z")
    public static boolean field1874 = true;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Ljd;")
    public static class95 field1867;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Ljd;")
    public static class95 field1872;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[[S")
    public static short[][] field1870;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V", line = 18)
    public static void method916(boolean arg0) {
        field1868 = null;
        field1872 = null;
        if (arg0) {
            method916(false);
        }
        field1867 = null;
        field1870 = (short[][]) null;
    }
}
