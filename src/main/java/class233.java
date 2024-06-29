import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class233 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lvd;")
    public static class222 field4355 = class212.method1357("Fps:", 10731);

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lvd;")
    public static class222 field4359 = class212.method1357("Mem:", 10731);

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lve;")
    public static class223 field4360;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V")
    public static final void method1525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4356++;
        if (arg0 != -17881) {
            return;
        }
        class208 var5 = (class208) class78.field1505.method1520((long) arg3, 42);
        if (var5 == null) {
            var5 = new class208();
            class78.field1505.method1519(true, var5, (long) arg3);
        }
        if (var5.field3868.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field3868.length; var8++) {
                var6[var8] = var5.field3868[var8];
                var7[var8] = var5.field3865[var8];
            }
            for (int var9 = var5.field3868.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3865 = var7;
            var5.field3868 = var6;
        }
        var5.field3868[arg2] = arg4;
        var5.field3865[arg2] = arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1526(int arg0) {
        field4355 = null;
        field4360 = null;
        field4359 = null;
        if (arg0 <= 50) {
            field4355 = null;
        }
    }
}
