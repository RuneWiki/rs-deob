import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class5 {

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[I")
    public static int[] field38 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lqj;")
    private static class196 field43 = class80.method502("wishes to trade with you)3", -48);

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lqj;")
    private static class196 field40 = class80.method502("Discard", -48);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lqj;")
    public static class196 field34 = field40;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lqj;")
    public static class196 field37 = class80.method502(":", -48);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lqj;")
    public static class196 field44 = field43;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lbk;")
    public static class136 field41;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lgh;")
    public static class168 field35;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILpe;IJ)Z")
    public static final boolean method17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class258 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class219.method1496(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method18(byte arg0) {
        field37 = null;
        field35 = null;
        field40 = null;
        field38 = null;
        field43 = null;
        field34 = null;
        field44 = null;
        if (arg0 < -109) {
            field41 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I")
    public static final int method19(int arg0, int arg1, int arg2) {
        int var3 = class13.method60(arg1 + 91923, -29696, 4, arg0 + 45365) + (class13.method60(arg1 + 37821, -29696, 2, arg0 + 10294) - 128 >> 1) + (class13.method60(arg1, -29696, 1, arg0) + -128 >> 2) - 128;
        field39++;
        if (arg2 >= -6) {
            field35 = null;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
