import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class class47 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lpi;")
    public static class340 field677 = new class340(43, 6);

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Z")
    public static boolean field679;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Loi;")
    public static class169 field680;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Ldn;")
    public static class201 field681;

    static {
        new class169("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field679 = false;
        field680 = new class169(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 3)
    public static void method295(byte arg0) {
        field681 = null;
        field680 = null;
        field677 = null;
        if (arg0 != -126) {
            field680 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V", line = 18)
    public static final void method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field678++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg4 - arg0;
        int var12 = arg7 - arg0;
        int var13 = arg4 * arg4;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        if (arg3 != -19812) {
            return;
        }
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class418.field5559 <= arg6 && class456.field6365 >= arg6) {
            int[] var39 = class333.field4265[arg6];
            int var40 = class141.method970(arg1 - arg4, class281.field3589, arg3 + 1150021888, class65.field827);
            int var41 = class141.method970(arg1 + arg4, class281.field3589, 1150002076, class65.field827);
            int var42 = class141.method970(arg1 - var11, class281.field3589, 1150002076, class65.field827);
            int var43 = class141.method970(arg1 + var11, class281.field3589, 1150002076, class65.field827);
            class183.method1212(arg2, var39, true, var40, var42);
            class183.method1212(arg5, var39, true, var42, var43);
            class183.method1212(arg2, var39, true, var43, var41);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (var46 >= class418.field5559 && var45 <= class456.field6365) {
                int var47 = class141.method970(arg1 + var8, class281.field3589, arg3 ^ 0xBB741100, class65.field827);
                int var48 = class141.method970(arg1 - var8, class281.field3589, 1150002076, class65.field827);
                if (var44) {
                    int var49 = class141.method970(arg1 + var10, class281.field3589, 1150002076, class65.field827);
                    int var50 = class141.method970(arg1 - var10, class281.field3589, arg3 ^ 0xBB741100, class65.field827);
                    if (class418.field5559 <= var45) {
                        int[] var51 = class333.field4265[var45];
                        class183.method1212(arg2, var51, true, var48, var50);
                        class183.method1212(arg5, var51, true, var50, var49);
                        class183.method1212(arg2, var51, true, var49, var47);
                    }
                    if (class456.field6365 >= var46) {
                        int[] var52 = class333.field4265[var46];
                        class183.method1212(arg2, var52, true, var48, var50);
                        class183.method1212(arg5, var52, true, var50, var49);
                        class183.method1212(arg2, var52, true, var49, var47);
                    }
                } else {
                    if (var45 >= class418.field5559) {
                        class183.method1212(arg2, class333.field4265[var45], true, var48, var47);
                    }
                    if (class456.field6365 >= var46) {
                        class183.method1212(arg2, class333.field4265[var46], true, var48, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Leo;B)Leo;", line = 227)
    public static final class423 method297(class423 arg0, byte arg1) {
        if (arg1 >= -102) {
            method295((byte) 76);
        }
        field676++;
        class423 var2 = client.method3032(arg0);
        if (var2 == null) {
            var2 = arg0.field5770;
        }
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILqq;)Lqq;")
    public abstract class491 method298(int arg0, class491 arg1);
}
