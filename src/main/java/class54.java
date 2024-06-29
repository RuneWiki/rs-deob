import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class54 extends class393 {

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "Ljava/lang/String;")
    public String field804;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field800 = -11713997;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field801 = 52;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field803 = -1;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "Lmi;")
    public static class408 field805 = new class408();

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field807 = 2;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "Z")
    public static boolean field806 = false;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Lhj;")
    public static class106 field802;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public static void method373(int arg0) {
        int var1 = 44 % ((arg0 + 20) / 53);
        field802 = null;
        field805 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z")
    public static final boolean method374(int arg0, int arg1, int arg2) {
        int var3 = class63.field900[arg0][arg1][arg2];
        if (-class246.field3431 == var3) {
            return false;
        } else if (class246.field3431 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class447.method2814(var4 + 1, class88.field1226[arg0].method781(arg1, arg2), var5 + 1) && class447.method2814(var4 + 128 - 1, class88.field1226[arg0].method781(arg1 + 1, arg2), var5 + 1) && class447.method2814(var4 + 128 - 1, class88.field1226[arg0].method781(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class447.method2814(var4 + 1, class88.field1226[arg0].method781(arg1, arg2 + 1), var5 + 128 - 1)) {
                class63.field900[arg0][arg1][arg2] = class246.field3431;
                return true;
            } else {
                class63.field900[arg0][arg1][arg2] = -class246.field3431;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class54() {
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class54(String arg0, int arg1) {
        this.field804 = arg0;
    }
}
