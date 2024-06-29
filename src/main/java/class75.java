import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class75 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lo;")
    public static class208 field834 = new class208(15, 0, 1, 0);

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[S")
    private static short[] field836 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "[S")
    private static short[] field840 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "[I")
    public static int[] field842 = null;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "[S")
    private static short[] field839 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[[S")
    public static short[][] field835 = new short[][] { field839, field840, field836 };

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lpb;")
    public static class2 field837 = new class2(4);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lae;")
    public static class283 field841;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLpq;)V")
    public static final void method550(byte arg0, class194 arg1) {
        field838++;
        if (class61.field699 == null) {
            class109 var2 = new class109();
            byte[] var3 = var2.method799((byte) -80, 128, 128, 16);
            class61.field699 = class485.method2881(-137, var3, false);
        }
        if (arg0 > -101) {
            method551(-127, true);
        }
        if (class341.field4950 == null) {
            class393 var4 = new class393();
            byte[] var5 = var4.method2426(16, 128, 0, 128);
            class341.field4950 = class485.method2881(-137, var5, false);
        }
        class627 var6 = arg1.field2613;
        if (var6.method3609(35632) && class770.field10598 == null) {
            byte[] var7 = class678.method3860(16.0F, 128, 0.6F, 0.5F, 16, new class494(419684), 4.0F, -19839, 128, 4.0F, 8);
            class770.field10598 = class485.method2881(-137, var7, false);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Lgda;")
    public static final class542 method551(int arg0, boolean arg1) {
        if (!arg1) {
            field840 = null;
        }
        field833++;
        class542 var2 = (class542) class387.field5519.method312(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class502.field6860.method1849(arg0, (byte) 48, 0);
        class542 var4 = new class542();
        if (var3 != null) {
            var4.method3214((byte) 36, new class511(var3));
        }
        var4.method3215(1017636072);
        class387.field5519.method305(var4, (long) arg0, 18320);
        return var4;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method552(byte arg0) {
        field837 = null;
        field839 = null;
        field836 = null;
        field842 = null;
        field840 = null;
        field834 = null;
        if (arg0 < -65) {
            field841 = null;
            field835 = null;
        }
    }
}
