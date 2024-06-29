import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class class447 {

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V")
    public static final void method2712(int arg0, int arg1) {
        field6568++;
        class582.method3395(-28900);
        class574.method3368(true);
        class243.method1568(true, (byte) -115, arg1);
        class59.method377(class379.field5558, class371.field5368, (byte) 8, class644.field9347);
        class361.method2212(class379.field5558, arg0 + 105, class371.field5368);
        class339.method2109(-30415);
        class636.method3688(class372.field5384, 1);
        class539.method3164(-125);
        class394.method2372(true);
        if (arg0 != 10) {
            return;
        }
        if (class192.field2903 == 2) {
            class463.method2749(1, 3);
        } else if (class192.field2903 == 6) {
            class463.method2749(1, 7);
        } else if (class192.field2903 == 9) {
            class463.method2749(1, 10);
        } else if (class192.field2903 == 1) {
            class15.method70(class371.field5368, class379.field5558, 2);
            return;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(FIFIFIZ[FIIF)V")
    public abstract void method2713(float arg0, int arg1, float arg2, int arg3, float arg4, int arg5, boolean arg6, float[] arg7, int arg8, int arg9, float arg10);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6567++;
        int var8 = arg1 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class290.field4262 - class70.field822) * var8 / 100 + class70.field822;
        int var10 = arg6 * var9 >> 8;
        int var11 = 16384 - arg2 & 0x3FFF;
        int var12 = 16384 - arg7 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class14.field129[var11] * -var10 >> 15;
            var15 = class14.field130[var11] * var10 >> 15;
        }
        if (arg3 != 7516) {
            return;
        }
        if (var12 != 0) {
            var13 = class14.field129[var12] * var15 >> 15;
            var15 = class14.field130[var12] * var15 >> 15;
        }
        class358.field5200 = arg4 - var13;
        class495.field7464 = 0;
        class367.field5319 = arg0 - var15;
        class111.field1412 = arg5 - var14;
        class543.field8120 = arg7;
        class151.field1935 = arg2;
    }
}
