import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V", line = 4)
    public class9(int arg0) {
        this.field194 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;", line = 12)
    public final String toString() {
        field195++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 21)
    public static final void method121(int arg0) {
        if (arg0 >= -11) {
            return;
        }
        class191.method1248(false);
        field196++;
        class251.field3460 = null;
        class191.field2813 = null;
        class105.field1570 = null;
        class515.field6884 = null;
        class456.field6197 = null;
    }
}
