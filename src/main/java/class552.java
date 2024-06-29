import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class552 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field7816 = 1;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "[I")
    public static int[] field7825 = new int[8];

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "[[I")
    public static int[][] field7817 = new int[128][128];

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "F")
    public static float field7826;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Lcba;")
    public static class232 field7820;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "Leo;")
    public static class515 field7819;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lgp;")
    public static class561 field7818;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBII)I")
    public static final int method3100(int arg0, byte arg1, int arg2, int arg3) {
        field7821++;
        if (class210.field2970 < 100) {
            return -2;
        }
        if (arg1 < 54) {
            field7816 = 108;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg2 - class212.field3118;
        int var7 = arg3 - class212.field3120;
        for (class153 var8 = (class153) class212.field3106.method427(true); var8 != null; var8 = (class153) class212.field3106.method420(false)) {
            if (var8.field2298 == arg0) {
                int var9 = var8.field2295;
                int var10 = var8.field2305;
                int var11 = class212.field3120 + var10 | class212.field3118 + var9 << 14;
                int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                if (var4 < 0 || var12 < var5) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public static void method3101(byte arg0) {
        field7819 = null;
        if (arg0 == -37) {
            field7820 = null;
            field7817 = null;
            field7818 = null;
            field7825 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
    public static final void method3102(int arg0, int arg1) {
        field7822++;
        class21 var2 = class601.method3413(arg1, arg0, (byte) 87);
        var2.method227(true);
    }
}
