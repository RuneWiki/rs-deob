import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class295 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BILic;)Lje;")
    public static final class275 method1870(byte arg0, int arg1, class491 arg2) {
        field4204++;
        if (arg0 > -21) {
            return null;
        } else {
            byte[] var3 = arg2.method2944(arg1, 127);
            return var3 == null ? null : new class275(var3);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4203++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg2 - arg1;
        int var12 = arg6 - arg1;
        int var13 = arg2 * arg2;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (arg7 + var22) * var20;
        int var35 = var28;
        int var36 = (arg6 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class339.field4800[arg3];
        class415.method2491(arg0 - var11, -arg2 + arg0, var39, arg4, -31541);
        class415.method2491(arg0 + var11, -var11 + arg0, var39, arg5, -31541);
        class415.method2491(arg0 + arg2, arg0 + var11, var39, arg4, -31541);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg3 - var9;
            int var42 = arg3 + var9;
            int var43 = arg0 + var8;
            int var44 = arg0 - var8;
            if (var40) {
                int var45 = arg0 + var10;
                int var46 = arg0 - var10;
                class415.method2491(var46, var44, class339.field4800[var41], arg4, arg7 - 31538);
                class415.method2491(var45, var46, class339.field4800[var41], arg5, -31541);
                class415.method2491(var43, var45, class339.field4800[var41], arg4, -31541);
                class415.method2491(var46, var44, class339.field4800[var42], arg4, arg7 ^ 0x7B36);
                class415.method2491(var45, var46, class339.field4800[var42], arg5, -31541);
                class415.method2491(var43, var45, class339.field4800[var42], arg4, -31541);
            } else {
                class415.method2491(var43, var44, class339.field4800[var41], arg4, arg7 - 31538);
                class415.method2491(var43, var44, class339.field4800[var42], arg4, -31541);
            }
        }
    }

    static {
        new class475("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }
}
