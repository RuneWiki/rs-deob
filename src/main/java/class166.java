import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class166 {

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lbe;")
    private static class283 field2771 = class153.method941(125, "Loaded textures");

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lbe;")
    public static class283 field2764 = field2771;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field2765 = 100;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field2772 = 0;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field2774 = 0;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field2773 = 0;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "F")
    public static float field2767;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lek;")
    public static class172 field2766;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method1019(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class269.field4551 = arg0;
        class217.field3677 = arg3;
        if (arg1 != 14358) {
            field2772 = 91;
        }
        class247.field4220 = arg2;
        field2765 = arg4;
        field2763++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 29)
    public static void method1020(int arg0) {
        int var1 = 16 % ((arg0 - 5) / 34);
        field2771 = null;
        field2764 = null;
        field2766 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)V", line = 39)
    public static final void method1021(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1998761094) {
            method1020(92);
        }
        class283 var4 = class299.method2022(new class283[] { class249.field4248, class296.method2012(arg1, (byte) 127), class58.field799, class296.method2012(arg3 >> 6, (byte) 127), class58.field799, class296.method2012(arg2 >> 6, (byte) 111), class58.field799, class296.method2012(arg3 & 0x3F, (byte) -25), class58.field799, class296.method2012(arg2 & 0x3F, (byte) -21) }, (byte) 24);
        var4.method1932((byte) 38);
        class272.method1829(var4, arg0 ^ 0x7722D90F);
        field2769++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V", line = 55)
    public static final void method1022(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class221.field3716; var3++) {
            for (int var4 = 0; var4 < class246.field4176; var4++) {
                for (int var5 = 0; var5 < class76.field1325; var5++) {
                    class160 var6 = class86.field1459[var3][var4][var5];
                    if (var6 != null) {
                        class197 var7 = var6.field2632;
                        if (var7 != null && var7.field3375.method48()) {
                            class305.method2078(var7.field3375, var3, var4, var5, 1, 1);
                            if (var7.field3376 != null && var7.field3376.method48()) {
                                class305.method2078(var7.field3376, var3, var4, var5, 1, 1);
                                var7.field3375.method43(var7.field3376, 0, 0, 0, false);
                                var7.field3376 = var7.field3376.method46(arg0, arg1, arg2);
                            }
                            var7.field3375 = var7.field3375.method46(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2627; var8++) {
                            class26 var9 = var6.field2623[var8];
                            if (var9 != null && var9.field381.method48()) {
                                class305.method2078(var9.field381, var3, var4, var5, var9.field395 + 1 - var9.field398, var9.field378 - var9.field394 + 1);
                                var9.field381 = var9.field381.method46(arg0, arg1, arg2);
                            }
                        }
                        class110 var10 = var6.field2617;
                        if (var10 != null && var10.field1855.method48()) {
                            class116.method747(var10.field1855, var3, var4, var5);
                            var10.field1855 = var10.field1855.method46(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIII)V", line = 129)
    public static final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2768++;
        int var8 = 6 / ((arg2 + 51) / 59);
        if (arg0 == arg5) {
            class214.method1418(arg3, arg4, -18704, arg7, arg6, arg1, arg5);
        } else if (class269.field4551 <= (arg1 - arg5) && field2765 >= (arg1 + arg5) && class217.field3677 <= arg7 - arg0 && class247.field4220 >= arg0 + arg7) {
            class66.method422(arg4, arg7, arg1, arg6, arg5, arg3, true, arg0);
        } else {
            class5.method30(arg0, arg7, arg3, arg4, true, arg1, arg5, arg6);
        }
    }
}
