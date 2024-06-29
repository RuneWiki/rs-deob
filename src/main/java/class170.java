import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class170 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field2352 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
    public static int[] field2353 = new int[25];

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Z")
    public static boolean field2354 = false;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field2357 = 999999;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "[I")
    public static int[] field2356 = new int[14];

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "[Lgj;")
    public static class381[] field2351;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 3)
    public static void method1143(int arg0) {
        if (arg0 == 14) {
            field2356 = null;
            field2351 = null;
            field2353 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILon;)Ljava/lang/String;", line = 18)
    public static final String method1144(int arg0, class184 arg1) {
        if (arg0 != 25) {
            method1143(-122);
        }
        field2355++;
        if (client.method1121(arg1).method1860(-1) == 0) {
            return null;
        } else if (arg1.field2638 == null || arg1.field2638.trim().length() == 0) {
            return class367.field5204 ? "Hidden-use" : null;
        } else {
            return arg1.field2638;
        }
    }
}
