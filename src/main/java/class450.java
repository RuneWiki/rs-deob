import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class450 {

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "I")
    public static int field6275 = 0;

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "I")
    public static int field6276 = -1;

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(IILaa;Lha;IILor;II)V", line = 13)
    public static final void method2687(int arg0, int arg1, class514 arg2, class65 arg3, int arg4, int arg5, class668 arg6, int arg7, int arg8) {
        field6277++;
        class680 var9 = class495.field6846.method2232(arg8, arg0 ^ 0xFFFFFF3B);
        if (var9 != null && var9.field9501 && var9.method3759((byte) -125, class382.field5602)) {
            if (var9.field9539 != null) {
                int[] var10 = new int[var9.field9539.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var28;
                    if (class502.field6938 == 4) {
                        var28 = (int) class135.field1974 & 0x3FFF;
                    } else {
                        var28 = (int) class135.field1974 + class594.field8116 & 0x3FFF;
                    }
                    int var29 = class749.field10324[var28];
                    int var30 = class749.field10316[var28];
                    if (class502.field6938 != 4) {
                        var30 = var30 * 256 / (class299.field4334 + 256);
                        var29 = var29 * 256 / (class299.field4334 + 256);
                    }
                    var10[var11 * 2] = ((arg4 + (var9.field9539[var11 * 2 + 1] * 4)) * var29 + (var9.field9539[var11 * 2] * 4 + arg1) * var30 >> 14) + arg6.field9282 / 2 + arg7;
                    var10[var11 * 2 + 1] = arg6.field9297 / 2 + arg5 - ((var9.field9539[var11 * 2 + 1] * 4 + arg4) * var30 - ((var9.field9539[var11 * 2] * 4 + arg1) * var29) >> 14);
                }
                class36.method251(arg3, var10, var9.field9524, arg6.field9320, arg6.field9249);
                if (var9.field9530 > 0) {
                    for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                        int var20 = var10[var12 * 2];
                        int var21 = var10[var12 * 2 + 1];
                        int var22 = var10[(var12 + 1) * 2];
                        int var23 = var10[(var12 + 1) * 2 + 1];
                        if (var20 > var22) {
                            int var25 = var20;
                            int var26 = var21;
                            var20 = var22;
                            var21 = var23;
                            var22 = var25;
                            var23 = var26;
                        } else if (var20 == var22 && var23 < var21) {
                            int var24 = var21;
                            var21 = var23;
                            var23 = var24;
                        }
                        arg3.method525(var20, var21, var22, var23, var9.field9545[var9.field9502[var12] & 0xFF], 1, arg2, arg7, arg5, var9.field9530, var9.field9510, var9.field9540);
                    }
                    int var13 = var10[var10.length - 2];
                    int var14 = var10[var10.length - 1];
                    int var15 = var10[0];
                    int var16 = var10[1];
                    if (var15 < var13) {
                        int var18 = var13;
                        var13 = var15;
                        int var19 = var14;
                        var14 = var16;
                        var15 = var18;
                        var16 = var19;
                    } else if (var13 == var15 && var16 < var14) {
                        int var17 = var14;
                        var14 = var16;
                        var16 = var17;
                    }
                    arg3.method525(var13, var14, var15, var16, var9.field9545[var9.field9502[var9.field9502.length - 1] & 0xFF], 1, arg2, arg7, arg5, var9.field9530, var9.field9510, var9.field9540);
                } else {
                    for (int var27 = 0; var27 < (var10.length / 2 - 1); var27++) {
                        arg3.method475(var10[var27 * 2], var10[var27 * 2 + 1], var10[var27 * 2 + 2], var10[var27 * 2 + 2 + 1], var9.field9545[var9.field9502[var27] & 0xFF], 1, arg2, arg7, arg5);
                    }
                    arg3.method475(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field9545[var9.field9502[var9.field9502.length - 1] & 0xFF], 1, arg2, arg7, arg5);
                }
            }
            class147 var31 = null;
            if (var9.field9536 != -1) {
                var31 = var9.method3761(false, arg0 - 255, arg3);
                if (var31 != null) {
                    class546.method3105(arg1, arg4, arg5, arg6, arg2, var31, arg7, 2);
                }
            }
            if (var9.field9496 != null) {
                int var32 = 0;
                if (var31 != null) {
                    var32 = var31.method1110();
                }
                class66 var33 = class541.field7353;
                class255 var34 = class22.field336;
                if (var9.field9541 == 1) {
                    var33 = class105.field1452;
                    var34 = class7.field76;
                }
                if (var9.field9541 == 2) {
                    var33 = class251.field3716;
                    var34 = class548.field7413;
                }
                class103.method794(var9.field9496, arg2, arg4, var32, arg6, arg7, 68, var34, var33, arg5, arg1, var9.field9537);
            }
        }
        if (arg0 != 255) {
            method2687(-25, 12, null, null, -119, -60, null, -10, 78);
        }
    }
}
