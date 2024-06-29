import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class694 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lmv;")
    public static class297 field9485 = new class297(13, 0, 1, 0);

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lra;")
    public static class361 field9489 = new class361(14, 1);

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Lnj;")
    public static class415 field9490 = new class415(36, -1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!ej", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9487++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method3776(int arg0) {
        if (arg0 != 13) {
            method3776(7);
        }
        field9490 = null;
        field9485 = null;
        field9489 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)J")
    public static final long method3777(byte arg0) {
        field9484++;
        if (arg0 != -97) {
            field9488 = -66;
        }
        return class492.field6520.method612((byte) 67);
    }
}
