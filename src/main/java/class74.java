import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class74 {

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Z")
    public static boolean field1110 = false;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lhf;")
    public static class363 field1107 = new class363();

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lkb;")
    public static class640 field1108;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Ljn;")
    public static class668 field1112;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[[[B")
    public static byte[][][] field1106;

    @OriginalMember(owner = "client!rf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1109++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method646(byte arg0) {
        if (arg0 != 10) {
            method646((byte) -105);
        }
        field1112 = null;
        field1107 = null;
        field1106 = null;
        field1108 = null;
    }
}
