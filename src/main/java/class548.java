import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class548 {

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "Loca;")
    public static class221 field7579 = new class221(6, 0, 4, 2);

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
    public static void method3123(int arg0) {
        if (arg0 != 2) {
            method3127(78, 68, -36);
        }
        field7579 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZIIIIIF)[I")
    public static final int[] method3124(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7) {
        field7581++;
        int[] var8 = new int[arg6];
        class168 var9 = new class168();
        var9.field2421 = arg3;
        var9.field2420 = arg2;
        var9.field2422 = arg4;
        var9.field2426 = (int) (arg7 * 4096.0F);
        var9.field2435 = arg0;
        var9.field2437 = arg1;
        var9.method7(arg5 - 806066389);
        class33.method342(arg5, arg6, (byte) 9);
        var9.method1076(arg5 + 110, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
    public static final void method3125(int arg0) {
        field7582++;
        if (arg0 != 15327) {
            field7579 = null;
        }
        class134.method909((byte) 4);
        class184.method1146(-62);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIBII)V")
    public static final void method3126(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field7580++;
        int var6 = class646.method3722(arg4, class264.field3687, class591.field8435, false);
        int var7 = class646.method3722(arg2, class264.field3687, class591.field8435, false);
        int var8 = -84 % ((arg3 + 88) / 33);
        int var9 = class646.method3722(arg0, class326.field4387, class596.field8621, false);
        int var10 = class646.method3722(arg1, class326.field4387, class596.field8621, false);
        for (int var11 = var6; var11 <= var7; var11++) {
            class266.method1742(26844, class182.field2580[var11], var10, arg5, var9);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(III)Lfba;")
    public static final class23 method3127(int arg0, int arg1, int arg2) {
        class622 var3 = class356.field4807[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8981;
    }
}
