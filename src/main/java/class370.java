import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class370 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "Lej;")
    public static class104 field5015 = new class104("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field5018 = 0;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!io", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5017++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method2211(int arg0) {
        field5015 = null;
        if (arg0 != 0) {
            field5015 = null;
        }
    }
}
