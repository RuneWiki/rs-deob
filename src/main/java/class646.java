import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class646 {

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public int field9180;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "J")
    public static long field9181;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lria;")
    public static class23 field9182;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Liv;")
    public static class635 field9183;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Z")
    public static boolean field9184;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V", line = 7)
    public class646(int arg0) {
        this.field9180 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 15)
    public static final void method3658(byte arg0) {
        if (arg0 > -22) {
            field9177 = -6;
        }
        field9178++;
        class705.method3943(false, 255, -1);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 28)
    public static void method3659(int arg0) {
        field9183 = null;
        field9182 = null;
        if (arg0 != -1) {
            field9177 = -87;
        }
    }

    @OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;", line = 43)
    public final String toString() {
        field9179++;
        throw new IllegalStateException();
    }
}
