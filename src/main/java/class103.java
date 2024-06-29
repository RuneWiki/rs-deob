import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class103 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lhda;")
    public static class752 field1428 = new class752(43, -1);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZI)V", line = 26)
    public static final void method766(int arg0, boolean arg1, int arg2) {
        field1429++;
        if (arg2 != 0) {
            field1428 = null;
        }
        class287 var3 = class271.method1629(arg1, arg0, (byte) -60);
        if (var3 != null) {
            var3.method3564(true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 58)
    public static void method767(int arg0) {
        field1428 = null;
        int var1 = -85 / (-arg0 / 33);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIILnl;)V", line = 85)
    public static final void method768(int arg0, int arg1, int arg2, class552 arg3) {
        class701 var4 = class229.method1455(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field9738 = arg3;
        int var5 = class588.field7675 == class507.field6771 ? 1 : 0;
        if (arg3.method806((byte) -59)) {
            if (arg3.method801(false)) {
                arg3.field3513 = class8.field162[var5];
                class8.field162[var5] = arg3;
                return;
            }
            arg3.field3513 = class496.field6694[var5];
            class496.field6694[var5] = arg3;
            class302.field4291 = true;
            return;
        }
        arg3.field3513 = class15.field214[var5];
        class15.field214[var5] = arg3;
    }
}
