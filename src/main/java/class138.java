import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class138 extends class35 {

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Ljava/lang/String;")
    public String field2305;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2299 = "wave2:";

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Z")
    public static boolean field2302 = false;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Z")
    public static boolean field2298 = true;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "S")
    public static short field2306 = 256;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Lbm;")
    public static class307 field2304;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "[[Lkl;")
    public static class68[][] field2300;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([SZ[Ljava/lang/String;)V", line = 5)
    public static final void method906(short[] arg0, boolean arg1, String[] arg2) {
        class190.method1215(0, arg2.length - 1, arg2, arg0, arg1);
        field2303++;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V", line = 16)
    public static void method907(boolean arg0) {
        field2299 = null;
        field2304 = null;
        field2300 = (class68[][]) null;
        if (arg0) {
            field2306 = 68;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 45)
    public class138() {
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 48)
    public class138(String arg0, int arg1) {
        this.field2305 = arg0;
    }
}
