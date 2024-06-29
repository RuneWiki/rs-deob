import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class409 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public int field5751;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5747 = 0;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Ljj;")
    public static class398 field5750 = new class398(44, 4);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!nd", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field5749++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I", line = 21)
    public final int method2402(int arg0) {
        field5748++;
        if (arg0 != 17903) {
            method2403((byte) -21);
        }
        return this.field5751;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 38)
    public static void method2403(byte arg0) {
        field5750 = null;
        if (arg0 != 86) {
            method2403((byte) 11);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 47)
    public class409(String arg0, int arg1) {
        this.field5751 = arg1;
    }
}
