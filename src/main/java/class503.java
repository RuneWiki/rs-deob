import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class503 {

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "[Lco;")
    public static class121[] field6751 = new class121[50];

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "[I")
    public static int[] field6750;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "[Lvfa;")
    public static class672[] field6747;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method2832(boolean arg0) {
        if (arg0) {
            class660.field8718 = class681.field9516;
            class507.field6771 = class588.field7675;
        } else {
            class660.field8718 = class483.field6607;
            class507.field6771 = class113.field1866;
        }
        class225.field3201 = class660.field8718.length;
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(Z)V", line = 25)
    public static void method2833(boolean arg0) {
        field6751 = null;
        if (!arg0) {
            method2834(true, false, null, -57, (byte) -52, null, 96);
        }
        field6750 = null;
        field6747 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZZLrs;IBLrs;I)I", line = 38)
    public static final int method2834(boolean arg0, boolean arg1, class653 arg2, int arg3, byte arg4, class653 arg5, int arg6) {
        field6748++;
        int var7 = class734.method4106(arg2, -18646, arg5, arg1, arg3);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class734.method4106(arg2, -18646, arg5, arg0, arg6);
            if (arg4 < 92) {
                field6749 = 40;
            }
            return arg0 ? -var8 : var8;
        }
    }
}
