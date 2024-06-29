import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class344 {

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
    public static int[] field4680 = new int[100];

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
    public static boolean field4679 = false;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lhq;")
    public static class365 field4678 = new class365(50);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIII)V")
    public static final void method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4675++;
        int var6 = arg5 - arg3;
        int var7 = arg1 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class122.method802(127, arg4, arg3, arg5, arg2);
            }
        } else if (var6 == 0) {
            class286.method1827(false, arg4, arg1, arg2, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                int var10 = arg1;
                arg2 = arg3;
                arg3 = var9;
                arg1 = arg5;
                arg5 = var10;
            }
            if (arg2 > arg1) {
                int var11 = arg2;
                arg2 = arg1;
                int var12 = arg3;
                arg1 = var11;
                arg3 = arg5;
                arg5 = var12;
            }
            int var13 = arg3;
            int var14 = arg1 - arg2;
            int var15 = arg5 - arg3;
            int var16 = -(var14 >> 1);
            int var17 = arg5 > arg3 ? 1 : -1;
            if (arg0 >= 72) {
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var18 = arg2; var18 <= arg1; var18++) {
                        var16 += var15;
                        class228.field2877[var18][var13] = arg4;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg2; var19 <= arg1; var19++) {
                        var16 += var15;
                        class228.field2877[var13][var19] = arg4;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method2190(int arg0) {
        class276.field3581.method752(class204.field2434, class20.field211 ? class439.field6035 + 256 : -1);
        if (arg0 == -26568) {
            field4674++;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static void method2191(int arg0) {
        field4680 = null;
        if (arg0 == 0) {
            field4678 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILpi;)V")
    public static final void method2192(int arg0, class298 arg1) {
        field4677++;
        if (arg0 != 0) {
            field4676 = -98;
        }
        for (class237 var2 = (class237) class59.field748.method1690((byte) -109); var2 != null; var2 = (class237) class59.field748.method1699((byte) 27)) {
            if (var2.field3115 == arg1) {
                if (var2.field3116 != null) {
                    class352.field4781.method1866(var2.field3116);
                    var2.field3116 = null;
                }
                var2.method263(false);
                return;
            }
        }
    }
}
