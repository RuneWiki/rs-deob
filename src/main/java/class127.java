import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class127 {

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Lok;")
    public static class41 field1887 = class137.method956("hitbar_default", 45);

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field1886 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field1882 = 0;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lok;")
    public static class41 field1884 = class137.method956("Fertigkeit: ", 45);

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lok;")
    public static class41 field1885 = class137.method956("leuchten3:", 45);

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "Lok;")
    public static class41 field1890 = class137.method956(" <col=ffff00>", 45);

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "[Lok;")
    public static class41[] field1883;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "[S")
    public static short[] field1889;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 8)
    public static void method891(boolean arg0) {
        field1885 = null;
        field1889 = null;
        field1890 = null;
        field1883 = null;
        field1884 = null;
        if (arg0) {
            method892(13);
        }
        field1887 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 38)
    public static final void method892(int arg0) {
        field1888++;
        class210.field3379.method1052((byte) -119);
        class199.field3199 = arg0;
        class301.field4874 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILmh;)V", line = 54)
    public static final void method893(int arg0, class65 arg1) {
        if (arg0 != 11586) {
            method893(109, (class65) null);
        }
        field1894++;
        class239.field3821 = arg1;
        field1892 = class239.field3821.method481(17377, 16);
    }
}
