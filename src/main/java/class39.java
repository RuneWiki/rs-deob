import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class39 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[[I")
    public static int[][] field930 = new int[5][5000];

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Z")
    public static boolean field928 = true;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field931 = 0;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method407(byte arg0) {
        field930 = null;
        if (arg0 > -98) {
            field931 = 18;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII)V")
    public static final void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field929++;
        int var6 = arg0 - arg3;
        int var7 = arg4 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class134.method1013(arg5 + 1450271216, arg1, arg3, arg2, arg4);
            }
        } else if (var7 == 0) {
            class101.method823(arg0, 23, arg3, arg1, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class48.field1096) {
                var10 = class48.field1096;
                var11 = var9 + (class48.field1096 * var8 >> 12);
            } else if (arg0 <= class252.field4458) {
                var10 = arg0;
                var11 = arg4;
            } else {
                var10 = class252.field4458;
                var11 = (class252.field4458 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (class48.field1096 > arg3) {
                var13 = (class48.field1096 * var8 >> 12) + var9;
                var12 = class48.field1096;
            } else if (arg3 > class252.field4458) {
                var12 = class252.field4458;
                var13 = (class252.field4458 * var8 >> 12) + var9;
            } else {
                var12 = arg3;
                var13 = arg1;
            }
            if (class275.field4804 > var13) {
                var12 = (class275.field4804 - var9 << 12) / var8;
                var13 = class275.field4804;
            } else if (var13 > class167.field3064) {
                var12 = (class167.field3064 - var9 << 12) / var8;
                var13 = class167.field3064;
            }
            if (arg5 != -1450271316) {
                field931 = -118;
            }
            if (class275.field4804 > var11) {
                var10 = (class275.field4804 - var9 << 12) / var8;
                var11 = class275.field4804;
            } else if (class167.field3064 < var11) {
                var11 = class167.field3064;
                var10 = (class167.field3064 - var9 << 12) / var8;
            }
            class182.method1313(var11, var13, arg2, var12, true, var10);
        }
    }
}
