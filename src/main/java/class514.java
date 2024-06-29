import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class514 extends class108 {

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public int field7146;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public int field7148;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "[I")
    public static int[] field7144 = new int[2048];

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    public static int field7145 = -1;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lkr;Lkr;II)V")
    public static final void method2862(class329 arg0, class329 arg1, int arg2, int arg3) {
        class179.field2312 = arg1;
        if (arg2 != 2048) {
            field7145 = 40;
        }
        field7147++;
        class401.field5486 = arg0;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static void method2863(int arg0) {
        field7144 = null;
        if (arg0 >= -119) {
            field7144 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(II)V")
    public class514(int arg0, int arg1) {
        this.field7146 = arg0;
        this.field7148 = arg1;
    }
}
