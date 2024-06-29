import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class626 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    public static int[] field8308 = new int[1];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[I")
    public static int[] field8307 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZI)V", line = 3)
    public static final void method3443(int arg0, boolean arg1, int arg2) {
        if (class171.field2624 != arg2) {
            class453.field6186 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class453.field6186[var3] = (var3 << 12) / arg2;
            }
            class445.field6116 = arg2 - 1;
            class171.field2624 = arg2;
            class562.field7372 = arg2 * 32;
        }
        field8309++;
        if (class671.field9149 != arg0) {
            if (class171.field2624 == arg0) {
                class250.field3446 = class453.field6186;
            } else {
                class250.field3446 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class250.field3446[var4] = (var4 << 12) / arg0;
                }
            }
            class671.field9149 = arg0;
            class112.field1855 = arg0 - 1;
        }
        if (arg1) {
            method3443(-43, true, 103);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 49)
    public static void method3444(int arg0) {
        field8308 = null;
        if (arg0 != 128) {
            method3443(19, true, 57);
        }
        field8307 = null;
    }
}
