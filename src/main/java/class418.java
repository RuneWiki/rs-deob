import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class418 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Ltj;")
    public static class108 field6002;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V", line = 8)
    public static final void method2633(int arg0, int arg1, int arg2) {
        class74 var3 = class385.field5449[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field967 != null) {
            var3.field967 = null;
        }
        if (var3.field976 != null) {
            var3.field976 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 28)
    public static void method2634(int arg0) {
        int var1 = 72 % ((arg0 + 56) / 49);
        field6002 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)Z", line = 37)
    public static final boolean method2635(int arg0, byte arg1) {
        if (arg1 < 88) {
            return true;
        } else {
            field6004++;
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        }
    }
}
