import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class48 {

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lcm;")
    public static class449 field672 = new class449(79, -1);

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Lpg;")
    public static class492 field673 = new class492(4, -2);

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lui;")
    public static class375 field674 = new class375("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field676 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lns;")
    public static class438 field675;

    @OriginalMember(owner = "client!dl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field669++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
    public class48(int arg0) {
        this.field671 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method349(byte arg0) {
        field675 = null;
        field674 = null;
        field673 = null;
        field672 = null;
        if (arg0 <= 36) {
            field674 = null;
        }
    }
}
