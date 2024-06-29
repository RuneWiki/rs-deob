import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class482 extends class215 {

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "F")
    public static float field6220;

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "Lwm;")
    public static class30 field6224;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method2708(int arg0, int arg1, int arg2) {
        if (arg0 == -23648) {
            field6221++;
            return (arg1 & 0x800) != 0 | class469.method2653(arg2, arg0 ^ 0x5C29, arg1) || class92.method554(arg1, (byte) 51, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIILda;Luaa;Laa;IIILjava/lang/String;Lne;)V", line = 21)
    public static final void method2709(int arg0, int arg1, int arg2, int arg3, class420 arg4, class391 arg5, class596 arg6, int arg7, int arg8, int arg9, String arg10, class166 arg11) {
        field6223++;
        int var12;
        if (class507.field6476 == 4) {
            var12 = (int) class698.field9250 & 0x3FFF;
        } else {
            var12 = (int) class698.field9250 + class757.field10329 & 0x3FFF;
        }
        int var13 = Math.max(arg5.field5117 / 2, arg5.field5031 / 2) + 10;
        int var14 = arg0 * arg0 + arg3 * arg3;
        if (var14 > var13 * var13) {
            return;
        }
        int var15 = -35 / ((arg1 - 42) / 33);
        int var16 = class541.field6805[var12];
        int var17 = class541.field6806[var12];
        if (class507.field6476 != 4) {
            var17 = var17 * 256 / (class718.field9432 + 256);
            var16 = var16 * 256 / (class718.field9432 + 256);
        }
        int var18 = arg0 * var17 + arg3 * var16 >> 14;
        int var19 = arg3 * var17 - arg0 * var16 >> 14;
        int var20 = arg11.method1059((byte) -119, arg10, null, 100);
        int var21 = arg11.method1053(arg10, null, 100, 0, 22036);
        int var22 = var18 - var20 / 2;
        if (var22 >= -arg5.field5117 && arg5.field5117 >= var22 && -arg5.field5031 <= var19 && arg5.field5031 >= var19) {
            arg4.method2426((byte) -104, 1, arg6, arg5.field5117 / 2 + arg7 + var22, arg5.field5031 / 2 + -var21 + -arg9 + -var19 + arg8, arg10, arg7, 0, null, var20, arg8, 0, 0, arg2, 50, null);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V", line = 67)
    public static void method2710(boolean arg0) {
        field6224 = null;
        if (arg0) {
            field6222 = -122;
        }
    }
}
