import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class408 {

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field5833 = -1;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "[I")
    public static int[] field5834 = new int[5];

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public static void method2433(int arg0) {
        if (arg0 != -1) {
            method2433(35);
        }
        field5834 = null;
    }

    @OriginalMember(owner = "client!wo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5835++;
        throw new IllegalStateException();
    }
}
