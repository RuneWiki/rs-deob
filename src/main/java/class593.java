import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class593 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "[I")
    public static int[] field8367 = new int[1];

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[F")
    public static float[] field8364 = new float[4];

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field8366 = 0;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIB)I", line = 4)
    public static final int method3433(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field8363++;
        if (arg4 < 126) {
            return 68;
        } else {
            int var5 = 65536 - class601.field8473[arg3 * 8192 / arg2] >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)Z", line = 23)
    public static final boolean method3434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8365++;
        if (arg3 != -2) {
            field8367 = null;
        }
        for (int var6 = arg1; var6 <= arg5; var6++) {
            for (int var7 = arg4; var7 <= arg2; var7++) {
                if (class303.field4547[var6][var7] == arg0 && class502.field7185[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 63)
    public static void method3435(int arg0) {
        field8367 = null;
        field8364 = null;
        if (arg0 != 0) {
            method3433(-1, 8, 52, 23, (byte) 87);
        }
    }
}
