import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class402 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public int field5354;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field5355 = 1;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "[I")
    public static int[] field5357 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method2190(byte arg0) {
        if (arg0 != -98) {
            field5357 = null;
        }
        field5357 = null;
    }

    @OriginalMember(owner = "client!vj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5356++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
    public class402(int arg0) {
        this.field5354 = arg0;
    }

    static {
        new class604("", 76);
    }
}
