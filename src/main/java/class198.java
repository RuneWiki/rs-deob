import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class198 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lfn;")
    public static class118 field2387 = new class118(128);

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZIB)V")
    public static final void method1069(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field2388++;
        if (class640.method3678(false, arg3)) {
            if (arg4 < 73) {
                method1070(-10, 91);
            }
            class629.method3604(class459.field6326[arg3], -1, 0, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
    public static final int method1070(int arg0, int arg1) {
        return class523.field7333 == null ? 0 : class523.field7333[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method1071(int arg0) {
        field2387 = null;
        if (arg0 < 29) {
            field2387 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILjava/lang/Class;)Lgn;")
    public static final class598 method1072(int arg0, int arg1, int arg2, Class arg3) {
        class349 var4 = class383.field5070[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class61 var5 = var4.field4499; var5 != null; var5 = var5.field595) {
            class598 var6 = var5.field589;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8653 == arg1 && var6.field8650 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
