import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class162 extends class61 {

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
    public int[] field2911 = new int[1];

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "[I")
    public int[] field2916 = new int[] { -1 };

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field2914 = 0;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lng;")
    public static class139 field2915 = new class139(30);

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Llc;")
    public static class143 field2919 = class66.method374("mapdots", -1);

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILh;)Ljj;")
    public static final class129 method1069(int arg0, class190 arg1) {
        field2917++;
        int var2 = 20 / ((arg0 - 20) / 52);
        return new class129(arg1.method1274((byte) -71), arg1.method1274((byte) -83), arg1.method1274((byte) 87), arg1.method1274((byte) 105), arg1.method1274((byte) 107), arg1.method1274((byte) 86), arg1.method1274((byte) 108), arg1.method1274((byte) -84), arg1.method1282(117), arg1.method1265(126));
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLlc;)Llc;")
    public static final class143 method1070(byte arg0, class143 arg1) {
        field2918++;
        int var2 = class139.method831(arg1, arg0);
        return var2 == -1 ? class270.field4829 : class90.field1628.field2375[var2].method877(-53, class41.field696, class175.field3141);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIZIZZ)Lvg;")
    public static final class230 method1071(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, boolean arg7) {
        field2913++;
        class148 var8 = class262.method1743(arg0, 17366);
        if (arg2 > 1 && var8.field2684 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg2 >= var8.field2696[var10] && var8.field2696[var10] != 0) {
                    var9 = var8.field2684[var10];
                }
            }
            if (var9 != -1) {
                var8 = class262.method1743(var9, 17366);
            }
        }
        class183 var11 = var8.method964(0);
        if (var11 == null) {
            return null;
        }
        class160 var12 = null;
        if (var8.field2713 != -1) {
            var12 = (class160) method1071(var8.field2715, -33, 10, 1, false, 0, true, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field2672 != -1) {
            var12 = (class160) method1071(var8.field2666, -126, arg2, arg3, false, arg5, true, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class260.field4651;
        int var14 = class260.field4654;
        int[] var15 = new int[4];
        int var16 = class260.field4650;
        class260.method1731(var15);
        class160 var17 = new class160(36, 32);
        class260.method1733(var17.field2894, 36, 32);
        class196.method1353();
        class196.method1367(16, 16);
        int var18 = var8.field2669;
        int var19 = 68 / ((arg1 - 51) / 50);
        if (arg7) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg3 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class196.field3633 = false;
        int var20 = class196.field3635[var8.field2668] * var18 >> 16;
        int var21 = class196.field3630[var8.field2668] * var18 >> 16;
        var11.method987(0, var8.field2728, var8.field2665, var8.field2668, var8.field2676, var20 - (var11.method166() / 2 - var8.field2732), var8.field2732 + var21, -1L);
        if (arg3 >= 1) {
            var17.method1044(1);
            if (arg3 >= 2) {
                var17.method1044(16777215);
            }
            class260.method1733(var17.field2894, 36, 32);
        }
        if (arg5 != 0) {
            var17.method1057(arg5);
        }
        if (var8.field2713 != -1) {
            var12.method1058(0, 0);
        } else if (var8.field2672 != -1) {
            class260.method1733(var12.field2894, 36, 32);
            var17.method1058(0, 0);
            var17 = var12;
        }
        if (arg4 && (var8.field2693 == 1 || arg2 != 1) && arg2 != -1) {
            class170.field3036.method1319(class245.method1628(-100001, arg2), 0, 9, 16776960, 1);
        }
        class260.method1733(var13, var16, var14);
        class260.method1732(var15);
        class196.method1353();
        class196.field3633 = true;
        return var17;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method1072(byte arg0) {
        field2915 = null;
        if (arg0 >= -11) {
            method1069(-39, (class190) null);
        }
        field2919 = null;
    }
}
