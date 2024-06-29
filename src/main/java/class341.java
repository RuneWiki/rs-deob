import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class341 {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Z")
    public static boolean field4646 = true;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lpj;")
    public static class153 field4649;

    static {
        new class72("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field4651 = 0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 9)
    public static void method2181(int arg0) {
        int var1 = 37 / ((61 - arg0) / 61);
        field4649 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILaq;Luo;Lem;IBIII)V", line = 18)
    public static final void method2182(int arg0, class453 arg1, class118 arg2, class423 arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field4648++;
        class222 var9 = class339.method2178(false, arg7);
        if (var9 != null && var9.field2776 && var9.method1345((byte) 55)) {
            if (var9.field2773 != null) {
                int[] var10 = new int[var9.field2773.length];
                for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                    int var13;
                    if (class320.field4294 == 4) {
                        var13 = (int) class434.field5929 & 0x3FFF;
                    } else {
                        var13 = (int) class434.field5929 + class231.field3043 & 0x3FFF;
                    }
                    int var14 = class363.field4927[var13];
                    int var15 = class363.field4917[var13];
                    if (class320.field4294 != 4) {
                        var14 = var14 * 256 / (class280.field3627 + 256);
                        var15 = var15 * 256 / (class280.field3627 + 256);
                    }
                    var10[var11 * 2] = arg1.field6377 / 2 + ((var9.field2773[var11 * 2 + 1] * 4 + arg4) * var14 + ((arg8 + (var9.field2773[var11 * 2] * 4)) * var15) >> 15) + arg0;
                    var10[var11 * 2 + 1] = arg6 + (arg1.field6432 / 2) - ((var9.field2773[var11 * 2 + 1] * 4 + arg4) * var15 - (var9.field2773[var11 * 2] * 4 + arg8) * var14 >> 15);
                }
                class88.method544(arg2, var10, var9.field2767, arg1.field6322, arg1.field6334);
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    arg2.method702(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field2744, 1, arg3, arg0, arg6);
                }
                arg2.method702(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field2744, 1, arg3, arg0, arg6);
            }
            class436 var16 = null;
            if (var9.field2783 != -1) {
                var16 = var9.method1353(0, false, arg2);
                if (var16 != null) {
                    class173.method1090(arg6, true, arg1, arg0, arg8, var16, arg3, arg4);
                }
            }
            if (var9.field2785 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method237();
                }
                class31 var18 = class363.field4933;
                class347 var19 = class207.field2509;
                if (var9.field2765 == 1) {
                    var18 = class55.field636;
                    var19 = class236.field3101;
                }
                if (var9.field2765 == 2) {
                    var19 = class213.field2611;
                    var18 = class210.field2544;
                }
                class118.method698(var9.field2785, arg8, arg0, (byte) -120, var18, arg6, var19, var9.field2777, arg3, var17, arg1, arg4);
            }
        }
        int var20 = -127 / ((13 - arg5) / 32);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)Ljava/lang/String;", line = 120)
    public static final String method2183(int arg0, byte arg1, int arg2) {
        if (arg1 >= -68) {
            field4650 = 15;
        }
        field4645++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)V", line = 167)
    public static final void method2184(int arg0, int arg1, byte arg2) {
        if (arg2 > -32) {
            method2181(-23);
        }
        field4647++;
        class225.field2845 = new class365(arg0);
        class298.field3973 = new class365(arg1);
    }
}
