import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class339 extends class425 {

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Ljava/lang/String;")
    public String field5055;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Lf;")
    public static class702 field5053;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Z")
    public static boolean field5051;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "[Ljr;")
    public static class96[] field5054;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "[[[B")
    public static byte[][][] field5056;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I")
    public static final int method2177(int arg0) {
        field5052++;
        return arg0 == -24814 ? class696.field9800 : 18;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
    public static void method2178(boolean arg0) {
        field5053 = null;
        if (!arg0) {
            field5056 = null;
            field5054 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class339() {
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class339(String arg0, int arg1) {
        this.field5055 = arg0;
    }
}
