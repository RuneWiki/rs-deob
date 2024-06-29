import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class515 {

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "[[I")
    public static int[][] field7632 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public static int field7636 = 0;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "Lvo;")
    public static class345 field7631;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIII)V")
    public static final void method3054(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7637++;
        if (arg2 != 0) {
            method3054(-28, 83, -101, 65, 3);
        }
        if ((arg3 - arg0) >= class512.field7620 && (arg0 + arg3) <= class94.field1398 && class198.field3084 <= (arg4 - arg0) && class627.field8931 >= arg4 + arg0) {
            class699.method3927((byte) -108, arg1, arg4, arg0, arg3);
        } else {
            class703.method3946(arg1, 520, arg4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lfu;IILrca;Lr;Llq;II)V")
    public static final void method3055(class66 arg0, int arg1, int arg2, class30 arg3, class98 arg4, class292 arg5, int arg6, int arg7) {
        field7634++;
        int var8 = arg0.field945 - (arg1 / 2) - 5;
        int var9 = arg7 + 2;
        if (arg3.field451 != 0) {
            arg4.method792(arg2 * arg5.method1784() + arg7 + 1 - var9, (byte) -88, arg1 + 10, var9, arg3.field451, var8);
        }
        if (arg3.field435 != 0) {
            arg4.method762(var9, arg1 + 10, arg3.field435, arg2 * arg5.method1784() + (arg7 - var9) + 1, var8, (byte) 73);
        }
        int var10 = arg3.field427;
        if (arg0.field947 && arg3.field414 != -1) {
            var10 = arg3.field414;
        }
        if (arg6 != -1) {
            method3054(-73, 7, 84, 73, 114);
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            String var12 = class629.field8943[var11];
            if ((arg2 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg5.method1785(arg4, var12, arg0.field945, arg7, var10, true);
            arg7 += arg5.method1784();
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)V")
    public static final void method3056(int arg0, int arg1, int arg2, int arg3) {
        class293 var4 = class541.field7946[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class306 var5 = var4.field4093;
        class306 var6 = var4.field4090;
        if (var5 != null) {
            var5.field4270 = (short) (var5.field4270 * arg3 / (0x10 << class49.field637 - 7));
            var5.field4269 = (short) (var5.field4269 * arg3 / (0x10 << class49.field637 - 7));
        }
        if (var6 != null) {
            var6.field4270 = (short) (var6.field4270 * arg3 / (0x10 << class49.field637 - 7));
            var6.field4269 = (short) (var6.field4269 * arg3 / (0x10 << class49.field637 - 7));
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
    public static void method3057(byte arg0) {
        if (arg0 < 95) {
            field7632 = null;
        }
        field7631 = null;
        field7632 = null;
    }
}
