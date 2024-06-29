import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class93 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Lem;")
    public static class206 field1328 = new class206(7, -1);

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "F")
    public static float field1330;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method672(int arg0) {
        field1328 = null;
        if (arg0 != -6971) {
            field1328 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1329++;
        throw new IllegalStateException();
    }
}
