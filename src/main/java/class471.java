import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class471 {

    @OriginalMember(owner = "client!via", name = "b", descriptor = "[I")
    public static int[] field6841 = new int[3];

    @OriginalMember(owner = "client!via", name = "a", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "Lha;")
    public static class544 field6843;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2872(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field6840++;
            return (arg0 & 0x40000) != 0 | class328.method2117(arg1, arg0, true) || class496.method3008(arg1, arg2 ^ 0xB000, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lpj;[III[II)Lsea;", line = 17)
    public static final class281 method2873(class38 arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        if (arg3 != 0) {
            field6843 = null;
        }
        field6842++;
        if (!arg0.method399(18154, class121.field1859, class215.field3556)) {
            int[] var10 = new int[arg2 * arg5];
            for (int var11 = 0; var11 < arg5; var11++) {
                int var12 = arg2 * var11 + arg1[var11];
                for (int var13 = 0; var13 < arg4[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class281(arg0, arg2, arg5, var10);
        }
        byte[] var6 = new byte[arg2 * arg5];
        for (int var7 = 0; var7 < arg5; var7++) {
            int var8 = arg2 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class281(arg0, arg2, arg5, var6);
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Z)V", line = 75)
    public static void method2874(boolean arg0) {
        field6843 = null;
        field6841 = null;
        if (!arg0) {
            method2872(-20, 127, -115);
        }
    }
}
