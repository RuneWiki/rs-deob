import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class11 {

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "[I")
    public static int[] field200 = new int[256];

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field207 = 0;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field209 = -1;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Loc;")
    private static class151 field208 = class137.method873(2, "Loaded sprites");

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Loc;")
    public static class151 field198 = field208;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Loc;")
    public static class151 field206 = class137.method873(2, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Lhh;")
    public static class84 field203;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field210;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method82(int arg0) {
        field200 = null;
        field210 = null;
        field203 = null;
        field206 = null;
        field198 = null;
        field208 = null;
        if (arg0 != 10852) {
            field203 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
    public static final boolean method83(int arg0, int arg1) {
        if (arg0 <= 71) {
            return true;
        } else {
            field202++;
            return (arg1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg0;
            arg0 = var7;
        }
        int var8 = arg4 & 0x3;
        field199++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 1 + 7 - arg6 - arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg0 - arg2;
        } else {
            if (arg1 < 114) {
                field211 = -87;
            }
            return arg6;
        }
    }
}
