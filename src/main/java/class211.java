import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class211 extends class233 {

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field2985 = 0;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field2982 = 128;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "[I")
    public static int[] field2984 = new int[1000];

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public static int field2989 = 0;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Z")
    public static boolean field2983;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "[Luj;")
    public static class158[] field2986;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "[Luj;")
    public static class158[] field2987;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 13)
    public static void method1549(int arg0) {
        field2984 = null;
        if (arg0 != 0) {
            method1549(-112);
        }
        field2986 = null;
        field2987 = null;
    }
}
