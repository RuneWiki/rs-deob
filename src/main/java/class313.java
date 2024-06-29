import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class313 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public int field4421;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "[I")
    public static int[] field4422 = new int[32];

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4423 = -1;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(II)V")
    public class313(int arg0, int arg1) {
        this.field4421 = arg1;
    }

    @OriginalMember(owner = "client!eo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4424++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public static void method2008(int arg0) {
        field4422 = null;
        if (arg0 > -26) {
            field4423 = 16;
        }
    }
}
