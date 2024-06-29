import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class52 {

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "Ltt;")
    public static class338 field666 = new class338(48, 18);

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "F")
    public static float field667 = 0.25F;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "Lbca;")
    public class307 field664;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "[I")
    public int[] field669;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIZI)I", line = 8)
    public static final int method307(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field662 = 22;
        }
        field668++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return 4095 - arg3;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V", line = 34)
    public static void method308(int arg0) {
        field666 = null;
        if (arg0 <= 123) {
            method308(-126);
        }
    }
}
