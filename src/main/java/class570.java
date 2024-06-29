import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class570 {

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "Z")
    public static boolean field8336 = true;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "[Z")
    public static boolean[] field8337 = new boolean[100];

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "Ljk;")
    public static class585 field8338 = new class585(12, 8);

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public int field8335;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "Ljava/lang/String;")
    public String field8339;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)I")
    public static int method3340(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V")
    public static void method3341(boolean arg0) {
        field8337 = null;
        if (arg0) {
            field8338 = null;
        }
    }
}
