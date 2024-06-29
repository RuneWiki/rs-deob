import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class40 {

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field608 = 0;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field609 = new String[200];

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V", line = 11)
    public static final void method281(int arg0, int arg1) {
        field607++;
        class446.field6433.method1254(arg0, 124);
        int var2 = -16 % ((arg1 - 15) / 51);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZII)I", line = 31)
    public static final int method282(int arg0, boolean arg1, int arg2, int arg3) {
        field611++;
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        if (arg1) {
            method282(62, false, -116, 57);
        }
        return (arg0 >> 5 << 7) + ((arg3 >> 2 & 0x3F) << 10) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILaa;Ltm;IIIIZLrg;)V", line = 65)
    public static final void method283(int arg0, class281 arg1, class220 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class383 arg8) {
        if (arg7) {
            method282(86, true, -57, -33);
        }
        field610++;
        class46 var9 = class368.method2358(arg4, 36);
        if (var9 == null || !var9.field687 || !var9.method330((byte) 123)) {
            return;
        }
        if (var9.field698 != null) {
            int[] var10 = new int[var9.field698.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class123.field1731 == 4) {
                    var13 = (int) class6.field98 & 0x3FFF;
                } else {
                    var13 = (int) class6.field98 + class390.field5737 & 0x3FFF;
                }
                int var14 = class362.field5083[var13];
                int var15 = class362.field5082[var13];
                if (class123.field1731 != 4) {
                    var15 = var15 * 256 / (class23.field312 + 256);
                    var14 = var14 * 256 / (class23.field312 + 256);
                }
                var10[var11 * 2] = ((arg6 + (var9.field698[var11 * 2 + 1] * 4)) * var14 + (var9.field698[var11 * 2] * 4 + arg5) * var15 >> 15) + arg8.field5431 / 2 + arg0;
                var10[var11 * 2 + 1] = arg8.field5491 / 2 + (arg3 - ((var9.field698[var11 * 2 + 1] * 4 + arg6) * var15 - ((arg5 + (var9.field698[var11 * 2] * 4)) * var14) >> 15));
            }
            class187.method1229(arg1, var10, var9.field693, arg8.field5566, arg8.field5529);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg1.method1781(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 2 + 1], var9.field689, 1, arg2, arg0, arg3);
            }
            arg1.method1781(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field689, 1, arg2, arg0, arg3);
        }
        class130 var16 = null;
        if (var9.field690 != -1) {
            var16 = var9.method324(false, 0, arg1);
            if (var16 != null) {
                class209.method1360(arg8, (byte) -27, arg5, arg6, var16, arg0, arg3, arg2);
            }
        }
        if (var9.field711 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method876();
        }
        class352 var18 = class403.field5875;
        class65 var19 = class439.field6374;
        if (var9.field708 == 1) {
            var19 = class235.field3194;
            var18 = class216.field2867;
        }
        if (var9.field708 == 2) {
            var19 = class204.field2769;
            var18 = class220.field2899;
        }
        class103.method711(var9.field711, arg8, arg5, (byte) 34, var17, var19, var18, var9.field716, arg3, arg0, arg6, arg2);
        return;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V", line = 180)
    public static void method284(byte arg0) {
        field609 = null;
        if (arg0 <= 93) {
            method282(65, false, 85, -15);
        }
    }
}
