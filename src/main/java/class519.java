import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class519 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "[F")
    public static float[] field6794 = new float[4];

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field6792 = 0;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[S")
    public static short[] field6793 = new short[256];

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lnj;")
    public static class415 field6795 = new class415(61, 6);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "[Lxa;")
    public static class511[] field6797;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZI)I", line = 4)
    public static final int method2793(int arg0, int arg1, boolean arg2, int arg3) {
        field6791++;
        class263 var4 = class265.method1643(false, arg2, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            if (arg0 <= 31) {
                field6796 = -118;
            }
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field3525.length; var6++) {
                if (var4.field3523[var6] == arg1) {
                    var5 += var4.field3525[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 57)
    public static void method2794(int arg0) {
        field6793 = null;
        field6794 = null;
        field6797 = null;
        if (arg0 == 0) {
            field6795 = null;
        }
    }
}
