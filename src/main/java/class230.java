import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public abstract class class230 extends class209 {

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "Ljava/util/Random;")
    public static Random field3644 = new Random();

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "Ljava/lang/String;")
    public static String field3646 = " is already on your friend list.";

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "Z")
    public static boolean field3648 = true;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    public static int field3649 = 0;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method348(int arg0);

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)Ldf;")
    public static final class56 method1582(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        return var3 == null ? null : var3.field364;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
    public static final void method1583(int arg0) {
        if (arg0 != 0) {
            field3647 = -52;
        }
        class98.field1571.method1169(true);
        field3645++;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)Z")
    public abstract boolean method347(byte arg0);

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
    public static void method1584(int arg0) {
        field3644 = null;
        if (arg0 != 1504) {
            field3648 = true;
        }
        field3646 = null;
    }
}
