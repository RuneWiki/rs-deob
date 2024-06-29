import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class568 extends class748 {

    @OriginalMember(owner = "client!vv", name = "I", descriptor = "[I")
    public static int[] field8061 = new int[8];

    @OriginalMember(owner = "client!vv", name = "H", descriptor = "Lju;")
    public static class102 field8060 = new class102(18, 8);

    @OriginalMember(owner = "client!vv", name = "J", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!vv", name = "L", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!vv", name = "M", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(Z)V", line = 7)
    public static final void method3398(boolean arg0) {
        class335.field4302 = arg0;
        class520.field7272 = class96.field1402;
        class565.field8029 = new class27[2000];
        class290.field3802 = 0;
        class425.field5891 = new class27[500];
        class679.field9573 = 0;
        class163.field2248 = 0;
        class256.field3513 = class96.field1402;
        class78.field1059 = new class27[1000];
        class75.field1036 = 0;
        class573.field8104 = new int[class214.field3021][class485.field6556 - -1][class314.field4059 + 1];
        ++field8062;
        class313.field4023 = new class27[500];
        if (!(class646.field9160 instanceof class406)) {
            class57.field802 = true;
        } else {
            class57.field802 = false;
        }
    }

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "(B)V", line = 33)
    public static void method3399(byte arg0) {
        field8060 = null;
        field8061 = null;
        if (arg0 != -56) {
            field8060 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V", line = 44)
    public class568() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)[I", line = 53)
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != 255) {
            field8060 = null;
        }
        ++field8065;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            int var4 = class370.field4727[arg0];
            for (int var5 = 0; ~class424.field5889 < ~var5; ++var5) {
                var3[var5] = this.method3400(class237.field3298[var5], var4, (byte) 112) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIB)I", line = 88)
    private final int method3400(int arg0, int arg1, byte arg2) {
        ++field8064;
        int var4 = arg0 - -(arg1 * 57);
        int var5 = var4 << 1 ^ var4;
        int var6 = -28 / ((31 - arg2) / 62);
        return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 - -1376312589) / 262144;
    }
}
