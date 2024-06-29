import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class55 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lhb;")
    public static class250 field747 = new class250(25, 4);

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Lpi;")
    public static class340 field748 = new class340(99, -2);

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!vg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field749++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method318(int arg0) {
        field748 = null;
        if (arg0 == -2) {
            field747 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)I")
    public final int method319(byte arg0) {
        field750++;
        if (arg0 >= -5) {
            field748 = null;
        }
        return this.field746;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class55(String arg0, int arg1) {
        this.field746 = arg1;
    }
}
