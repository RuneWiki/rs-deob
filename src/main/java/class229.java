import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class229 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
    public static int[] field3246 = new int[14];

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Ljava/lang/String;")
    public String field3247;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1421(boolean arg0) {
        if (arg0) {
            method1421(true);
        }
        field3246 = null;
    }
}
