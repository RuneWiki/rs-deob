import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class170 extends class69 {

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "[I")
    public static int[] field2360 = new int[4];

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "Z")
    public static boolean field2362 = false;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
    public static void method1182(int arg0) {
        if (arg0 > -70) {
            method1182(-9);
        }
        field2360 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)I")
    public static final int method1183(int arg0, int arg1) {
        return class197.field2682 == null ? 0 : class197.field2682[arg0][arg1] & 0xFFFF;
    }
}
