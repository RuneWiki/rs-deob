import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class14 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lwa;")
    public static class661 field117 = new class661(8);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lsb;")
    public static class305 field119 = new class305(6, 4);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 13)
    public static void method65(boolean arg0) {
        if (arg0) {
            method65(false);
        }
        field117 = null;
        field119 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V", line = 25)
    public class14(int arg0, int arg1) {
        this.field120 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "toString", descriptor = "()Ljava/lang/String;", line = 40)
    public final String toString() {
        field121++;
        throw new IllegalStateException();
    }
}
