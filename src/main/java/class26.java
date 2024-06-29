import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class26 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Ljava/lang/String;")
    public static String field367 = null;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Ljava/lang/String;")
    public static String field370 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[Lea;")
    public static class235[] field371;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 10)
    public static void method169(int arg0) {
        int var1 = -9 % ((arg0 + 30) / 63);
        field370 = null;
        field367 = null;
        field371 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Z", line = 31)
    public static final boolean method170(int arg0, int arg1, int arg2, int arg3) {
        if (class310.method2143(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class3.method7(var4 + 1, class294.field4502[arg0][arg1][arg2] + arg3, var5 + 1) && class3.method7(var4 + 128 - 1, class294.field4502[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class3.method7(var4 + 128 - 1, class294.field4502[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class3.method7(var4 + 1, class294.field4502[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 45)
    public static final void method171(int arg0) {
        field369++;
        int var1 = -121 / ((36 - arg0) / 61);
        class274.field4203.method2182(false);
    }
}
