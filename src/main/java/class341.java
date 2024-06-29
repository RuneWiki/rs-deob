import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class341 extends class5 {

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "Z")
    public static boolean field4399 = false;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "[Llo;")
    public static class488[] field4394;

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
    public class341() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field4398;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = -21 % ((81 - arg0) / 36);
        if (super.field126.field8392) {
            int var5 = class272.field3439[arg1];
            for (int var6 = 0; var6 < class657.field9287; ++var6) {
                var3[var6] = this.method1907(var5, false, class269.field3405[var6]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
    public static void method1906(boolean arg0) {
        field4394 = null;
        if (arg0) {
            field4399 = false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(IZI)I")
    private final int method1907(int arg0, boolean arg1, int arg2) {
        ++field4395;
        if (arg1) {
            this.method1907(122, false, 0);
        }
        int var4 = arg2 - -(arg0 * 57);
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)V")
    public static final void method1908(int arg0, int arg1) {
        ++field4397;
        class592 var2 = class61.method371(arg1, arg0, (byte) 88);
        var2.method3253(0);
    }
}
