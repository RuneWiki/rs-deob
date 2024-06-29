import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class81 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1562 = 0;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[I")
    public static int[] field1560 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
    public static int[] field1563 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lok;Lok;B)V", line = 5)
    public static final void method678(class149 arg0, class149 arg1, byte arg2) {
        class69.field1357 = arg1;
        class149.field2713 = arg0;
        field1561++;
        if (arg2 < 23) {
            field1560 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 33)
    public static void method679(int arg0) {
        if (arg0 <= -71) {
            field1560 = null;
            field1563 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)V", line = 64)
    public static final void method680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1559++;
        int var7 = arg3 + arg4;
        int var8 = arg2 + arg4;
        int var9 = arg0 - arg4;
        int var10 = arg5 - arg4;
        for (int var11 = arg3; var11 < var7; var11++) {
            class152.method1208(arg2, arg6, arg5, class182.field3348[var11], -7);
        }
        for (int var12 = arg0; var12 > var9; var12--) {
            class152.method1208(arg2, arg6, arg5, class182.field3348[var12], -7);
        }
        if (arg1 != 7565) {
            method680(25, 35, -77, 9, -85, -7, -1);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class182.field3348[var13];
            class152.method1208(arg2, arg6, var8, var14, arg1 ^ 0xFFFFE274);
            class152.method1208(var10, arg6, arg5, var14, -7);
        }
    }
}
