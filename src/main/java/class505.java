import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class505 {

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Ljha;")
    public static class692 field7210 = new class692();

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field7212 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static void method3030(int arg0) {
        if (arg0 == 0) {
            field7210 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7209++;
        throw new IllegalStateException();
    }
}
