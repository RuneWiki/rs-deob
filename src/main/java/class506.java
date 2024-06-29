import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class506 {

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "J")
    public static long field7289 = 0L;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "[I")
    public static int[] field7288 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBIIIII)V", line = 7)
    public static final void method2912(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 98) {
            field7289 = -37L;
        }
        field7286++;
        if (class326.field4246 <= arg4 - arg5 && class163.field1942 >= arg4 + arg5 && arg6 - arg5 >= class58.field602 && class501.field7217 >= arg6 + arg5) {
            class443.method2453(arg3, arg0, arg6, arg5, arg2, (byte) -114, arg4);
        } else {
            class233.method1352(arg2, arg5, (byte) -101, arg0, arg3, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIBILoa;)V", line = 27)
    public static final void method2913(int arg0, int arg1, int arg2, byte arg3, int arg4, class635 arg5) {
        arg5.method314(arg0, arg4, arg0 + arg1, arg2 + arg4);
        field7287++;
        arg5.method3552(arg2, arg1, 7, -16777216, arg4, arg0);
        if (class376.field4887 < 100) {
            return;
        }
        float var6 = (float) class637.field9032 / (float) class637.field9030;
        int var7 = arg1;
        int var8 = arg2;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg1 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg2 - var8) / 2 + arg4;
        int var10 = (arg1 - var7) / 2 + arg0;
        if (class627.field8901 == null || class627.field8901.method415() != arg1 || class627.field8901.method417() != arg2) {
            class637.method3567(class637.field9039, class637.field9043 + class637.field9032, class637.field9039 + class637.field9030, class637.field9043, var10, var9, var7 + var10, var8 + var9);
            class637.method3580(arg5);
            class627.field8901 = arg5.method279(var10, var9, var7, var8, false);
        }
        class627.field8901.method2612(var10, var9);
        int var11 = class107.field1244 * var7 / class637.field9030;
        int var12 = class156.field1748 * var8 / class637.field9032;
        if (arg3 > -44) {
            method2914(-78);
        }
        int var13 = class369.field4793 * var7 / class637.field9030 + var10;
        int var14 = var9 - (class579.field8244 * var8 / class637.field9032) - (-var8 + var12);
        int var15 = -1996554240;
        if (class343.field4453 == class220.field2668) {
            var15 = -1996488705;
        }
        arg5.method286(var13, var14, var11, var12, var15, 1);
        arg5.method334(var13, var14, var11, var12, var15, 0);
        if (class235.field2997 <= 0) {
            return;
        }
        int var16;
        if (class2.field19 > 50) {
            var16 = 500 - class2.field19 * 5;
        } else {
            var16 = class2.field19 * 5;
        }
        for (class276 var17 = (class276) class637.field9021.method3174((byte) 49); var17 != null; var17 = (class276) class637.field9021.method3168(false)) {
            class89 var18 = class637.field9013.method1972(var17.field3483, (byte) -18);
            if (class139.method774(-127, var18)) {
                if (class388.field5189 == var17.field3483) {
                    int var19 = var17.field3479 * var7 / class637.field9030 + var10;
                    int var20 = var9 + ((class637.field9032 - var17.field3484) * var8 / class637.field9032);
                    arg5.method3552(4, 4, 7, var16 << 24 | 0xFFFF00, var20 - 2, var19 - 2);
                } else if (class685.field9699 != -1 && class685.field9699 == var18.field967) {
                    int var21 = var10 + (var17.field3479 * var7 / class637.field9030);
                    int var22 = (class637.field9032 - var17.field3484) * var8 / class637.field9032 + var9;
                    arg5.method3552(4, 4, 7, var16 << 24 | 0xFFFF00, var22 - 2, var21 + -2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V", line = 125)
    public static void method2914(int arg0) {
        field7288 = null;
        if (arg0 != 2) {
            method2913(85, 7, 92, (byte) 47, 120, null);
        }
    }
}
