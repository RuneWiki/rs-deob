import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class class288 {

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Lra;")
    public static class361 field3720 = new class361(62, 7);

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "[I")
    public static int[] field3722 = new int[5];

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "Z")
    public static boolean field3723 = false;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
    public static void method1711(boolean arg0) {
        if (!arg0) {
            method1711(false);
        }
        field3722 = null;
        field3720 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IF[FIBIIIFFF)V")
    public abstract void method1712(int arg0, float arg1, float[] arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIII)V")
    public static final void method1713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3721++;
        int var6 = arg5 - arg0;
        if (arg2 != 1902406796) {
            field3722 = null;
        }
        int var7 = arg3 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class229.method1442(true, arg4, arg3, arg1, arg0);
            }
        } else if (var7 == 0) {
            class176.method1185(arg0, arg4, arg1, true, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class265.field3552) {
                var10 = class265.field3552;
                var11 = var9 + (class265.field3552 * var8 >> 12);
            } else if (arg5 <= class641.field8924) {
                var10 = arg5;
                var11 = arg3;
            } else {
                var11 = var9 + (class641.field8924 * var8 >> 12);
                var10 = class641.field8924;
            }
            int var12;
            int var13;
            if (class265.field3552 > arg0) {
                var12 = (class265.field3552 * var8 >> 12) + var9;
                var13 = class265.field3552;
            } else if (class641.field8924 >= arg0) {
                var12 = arg1;
                var13 = arg0;
            } else {
                var13 = class641.field8924;
                var12 = (class641.field8924 * var8 >> 12) + var9;
            }
            if (class165.field2061 > var12) {
                var13 = (class165.field2061 - var9 << 12) / var8;
                var12 = class165.field2061;
            } else if (class99.field1309 < var12) {
                var12 = class99.field1309;
                var13 = (class99.field1309 - var9 << 12) / var8;
            }
            if (var11 < class165.field2061) {
                var11 = class165.field2061;
                var10 = (class165.field2061 - var9 << 12) / var8;
            } else if (var11 > class99.field1309) {
                var10 = (class99.field1309 - var9 << 12) / var8;
                var11 = class99.field1309;
            }
            class590.method3218(var11, (byte) 53, var13, arg4, var10, var12);
        }
    }
}
