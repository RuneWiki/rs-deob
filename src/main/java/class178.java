import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class178 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2964 = "wave2:";

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
    public static int[] field2962 = new int[128];

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Z")
    public static boolean field2968 = false;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lbf;")
    public static class102 field2966;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lcd;")
    public static class35 field2965;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[[B")
    public static byte[][] field2967;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
    public static void method1263(boolean arg0) {
        field2962 = null;
        field2966 = null;
        field2967 = null;
        if (arg0) {
            field2966 = null;
        }
        field2965 = null;
        field2964 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)V")
    public static final void method1264(byte arg0, int arg1) {
        field2963++;
        class23 var2 = class91.method694(arg1, 10, 119);
        if (arg0 == 63) {
            var2.method183(-93);
        }
    }
}
