import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class367 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    private int field5614;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Lof;")
    public static class446 field5613 = new class446("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field5621 = 0;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field5619 = 0;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lni;")
    public static class367 field5620 = new class367(77, 3);

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ni", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field5617++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I", line = 16)
    public static final int method2336(int arg0, int arg1) {
        field5616++;
        if (arg1 >= -55) {
            field5619 = 3;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)I", line = 27)
    public final int method2337(boolean arg0) {
        if (arg0) {
            return 93;
        } else {
            field5615++;
            return this.field5614;
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(II)V", line = 43)
    public class367(int arg0, int arg1) {
        this.field5614 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 56)
    public static void method2338(byte arg0) {
        if (arg0 != 90) {
            field5619 = 59;
        }
        field5620 = null;
        field5613 = null;
    }
}
