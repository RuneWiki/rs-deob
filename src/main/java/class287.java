import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class287 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lbe;")
    public static class283 field4884 = class153.method941(127, "settings=");

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[I")
    public static int[] field4885 = new int[256];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 4)
    public static void method1966(int arg0) {
        field4885 = null;
        if (arg0 == 256) {
            field4884 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([II)[I", line = 25)
    public static final int[] method1967(int[] arg0, int arg1) {
        field4887++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class136.method847(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 45)
    public static final void method1968(int arg0) {
        class170.field2860 = new class239(arg0);
        field4883++;
    }
}
