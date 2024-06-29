import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class210 extends class136 {

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public static int field3992 = 0;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Li;")
    public static class88 field3985 = class208.method1425(105, "http:)4)4www)3runescape)3com)4l=");

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Lid;")
    public static class92 field3991 = new class92(100);

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Li;")
    private static class88 field3994 = class208.method1425(105, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Li;")
    public static class88 field3993 = field3994;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Lnc;")
    public class145 field3986;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public static void method1438(int arg0) {
        field3991 = null;
        field3985 = null;
        field3993 = null;
        field3994 = null;
        if (arg0 < 94) {
            method1440(-84, 104, -72, -40, -117, -11);
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public static final void method1439(int arg0) {
        if (arg0 != 0) {
            method1440(86, -94, -13, -16, -121, 71);
        }
        class159 var1 = (class159) class62.field1140.method1612(false);
        field3987++;
        while (var1 != null) {
            if (var1.field3063 == -1) {
                var1.field3056 = 0;
                class172.method1221(-2, var1);
            } else {
                var1.method460(true);
            }
            var1 = (class159) class62.field1140.method1621(82);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3989++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg5 * arg5;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - arg1) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        if (class49.field919 <= arg3 && arg3 <= class18.field279) {
            int var21 = class156.method1060(class67.field1207, class12.field183, -113, arg0 + arg5);
            int var22 = class156.method1060(class67.field1207, class12.field183, -124, arg0 - arg5);
            class230.method1536(var22, arg4, -7, var21, class3.field42[arg3]);
        }
        while (var7 > 0) {
            var7--;
            int var23 = arg3 - var7;
            int var24 = arg3 + var7;
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var6++;
                    var19 += var16;
                    var13 += var17;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var6++;
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            if (var24 >= class49.field919 && class18.field279 >= var23) {
                int var25 = class156.method1060(class67.field1207, class12.field183, -113, arg0 + var6);
                int var26 = class156.method1060(class67.field1207, class12.field183, -109, arg0 - var6);
                if (var23 >= class49.field919) {
                    class230.method1536(var26, arg4, -7, var25, class3.field42[var23]);
                }
                if (class18.field279 >= var24) {
                    class230.method1536(var26, arg4, arg1 - 10, var25, class3.field42[var24]);
                }
            }
            var18 -= var15;
            var13 += -var20;
            var20 -= var15;
        }
    }
}
