import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class320 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "[I")
    public static int[] field4084 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ki", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4085++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method1837(int arg0) {
        if (arg0 <= 78) {
            method1837(65);
        }
        field4084 = null;
    }
}
