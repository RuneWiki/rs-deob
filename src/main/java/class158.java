import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class158 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Z")
    public static boolean field2174 = false;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
    public static int[] field2176 = new int[5];

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Z")
    public static boolean field2175 = false;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V", line = 10)
    public static void method926(boolean arg0) {
        if (!arg0) {
            field2176 = null;
        }
    }
}
