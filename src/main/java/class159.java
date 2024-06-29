import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class159 extends class337 {

    @OriginalMember(owner = "client!jka", name = "n", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!jka", name = "m", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!jka", name = "l", descriptor = "Z")
    public static boolean field2065 = false;

    @OriginalMember(owner = "client!jka", name = "o", descriptor = "[I")
    public static int[] field2068 = new int[14];

    @OriginalMember(owner = "client!jka", name = "p", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(I)V", line = 7)
    public static void method1016(int arg0) {
        int var1 = -47 / ((arg0 - 5) / 39);
        field2068 = null;
    }

    @OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(II)V", line = 15)
    public class159(int arg0, int arg1) {
        this.field2067 = arg1;
        this.field2066 = arg0;
    }
}
