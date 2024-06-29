import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class636 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lfda;")
    public static class340 field8785;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 5)
    public static void method3553(int arg0) {
        if (arg0 >= 3) {
            field8785 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)V", line = 16)
    public static final void method3554(int arg0, byte arg1, int arg2) {
        field8784++;
        if (class769.field10597 != arg2) {
            class172.field2750 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class172.field2750[var3] = (var3 << 12) / arg2;
            }
            class769.field10597 = arg2;
            class549.field7457 = arg2 * 32;
            class522.field7083 = arg2 - 1;
        }
        int var4 = 114 / ((10 - arg1) / 55);
        if (class555.field7845 == arg0) {
            return;
        }
        if (class769.field10597 == arg0) {
            class135.field2287 = class172.field2750;
        } else {
            class135.field2287 = new int[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                class135.field2287[var5] = (var5 << 12) / arg0;
            }
        }
        class555.field7845 = arg0;
        class606.field8463 = arg0 - 1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)I", line = 65)
    public static final int method3555(int arg0, byte arg1) {
        if (arg1 > -95) {
            field8785 = null;
        }
        field8786++;
        return arg0 & 0x7F;
    }
}
