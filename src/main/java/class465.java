import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class465 {

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lui;")
    public static class375 field6790 = new class375("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Lvq;")
    public static class338 field6792;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method2778(int arg0) {
        field6790 = null;
        field6792 = null;
        if (arg0 != 317769057) {
            field6792 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6788++;
        if (arg1 != 13950) {
            field6790 = null;
        }
        int var8 = arg4 - arg3;
        int var9 = arg3 + arg7;
        for (int var10 = arg7; var10 < var9; var10++) {
            class271.method1736(arg0, arg2, arg5, -11, class23.field356[var10]);
        }
        int var11 = arg3 + arg5;
        for (int var12 = arg4; var12 > var8; var12--) {
            class271.method1736(arg0, arg2, arg5, arg1 - 13961, class23.field356[var12]);
        }
        int var13 = arg0 - arg3;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class23.field356[var14];
            class271.method1736(var11, arg2, arg5, -11, var15);
            class271.method1736(var13, arg6, var11, arg1 - 13961, var15);
            class271.method1736(arg0, arg2, var13, arg1 ^ 0xFFFFC98B, var15);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method2780(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6787++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg4 - arg5;
        int var12 = arg2 - arg5;
        int var13 = arg4 * arg4;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        if (arg1 != 30) {
            field6790 = null;
        }
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class23.field356[arg0];
        class271.method1736(arg7 - var11, arg6, arg7 - arg4, -11, var39);
        class271.method1736(arg7 + var11, arg3, arg7 - var11, -11, var39);
        class271.method1736(arg4 + arg7, arg6, arg7 + var11, -11, var39);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var41 = arg0 - var9;
            int var42 = arg0 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class271.method1736(var46, arg6, var44, -11, class23.field356[var41]);
                class271.method1736(var45, arg3, var46, arg1 - 41, class23.field356[var41]);
                class271.method1736(var43, arg6, var45, arg1 - 41, class23.field356[var41]);
                class271.method1736(var46, arg6, var44, -11, class23.field356[var42]);
                class271.method1736(var45, arg3, var46, -11, class23.field356[var42]);
                class271.method1736(var43, arg6, var45, -11, class23.field356[var42]);
            } else {
                class271.method1736(var43, arg6, var44, arg1 ^ 0xFFFFFFEB, class23.field356[var41]);
                class271.method1736(var43, arg6, var44, -11, class23.field356[var42]);
            }
        }
    }
}
