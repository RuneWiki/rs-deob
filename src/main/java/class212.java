import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class212 extends class143 {

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3196 = 0;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Ljb;")
    public static class224 field3199;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Z")
    public static boolean field3197;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method1322(int arg0) {
        field3199 = null;
        if (arg0 <= 75) {
            method1322(92);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method1323(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3198++;
        if (arg4 < 128 || arg2 < 128 || arg4 > 13056 || arg2 > 13056) {
            class161.field2250 = -1;
            class105.field1512 = -1;
            return;
        }
        int var9 = class58.method360(arg2, arg4, false, class166.field2364) - arg5;
        int var10 = arg2 - class188.field2848;
        int var11 = var9 - class27.field423;
        int var12 = class118.field1697[class277.field4407];
        int var13 = class118.field1690[class277.field4407];
        int var14 = arg4 - class178.field2603;
        int var15 = class118.field1697[class246.field3870];
        if (arg0 != -120) {
            return;
        }
        int var16 = class118.field1690[class246.field3870];
        int var17 = var10 * var15 + var14 * var16 >> 16;
        int var18 = var10 * var16 - (var14 * var15) >> 16;
        int var20 = var11 * var13 - var12 * var18 >> 16;
        int var21 = var11 * var12 + var13 * var18 >> 16;
        int var23 = arg6 + var17;
        if (var21 < 50) {
            class161.field2250 = -1;
            class105.field1512 = -1;
        } else {
            class161.field2250 = (var20 << 9) / var21 + arg3;
            class105.field1512 = (var23 << 9) / var21 + arg8;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)V")
    public static final void method1324(int arg0, byte arg1) {
        class205 var2 = (class205) class278.field4412.method1453(true, (long) arg0);
        if (arg1 != -90) {
            field3197 = true;
        }
        field3194++;
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field3069.length; var3++) {
                var2.field3069[var3] = -1;
                var2.field3061[var3] = 0;
            }
        }
    }
}
