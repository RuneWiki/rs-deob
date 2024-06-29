import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class283 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4441 = 0;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4442 = "slide:";

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4446 = "shake:";

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4444 = "glow2:";

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field4447 = -1;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Z")
    public static boolean field4449 = false;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "F")
    public static float field4438;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "F")
    public static float field4443;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Llc;")
    public static class175 field4439;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Llc;")
    public static class175 field4440;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "[I")
    public static int[] field4448;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 37)
    public static void method2026(int arg0) {
        field4439 = null;
        field4446 = null;
        field4440 = null;
        field4442 = null;
        field4448 = null;
        if (arg0 == 315) {
            field4444 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILmn;)V", line = 55)
    public static final void method2027(int arg0, class176 arg1) {
        class313.method2195(arg1, arg0, true);
        field4445++;
    }
}
