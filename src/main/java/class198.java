import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class198 {

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[[I")
    public static int[][] field3418 = new int[104][104];

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[Lve;")
    public static class255[] field3420 = new class255[200];

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Z")
    public static boolean field3421 = false;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    public static int[] field3419 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 3)
    public static final void method1424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class84 var20 = new class84(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class118.field1984[var21][arg1][arg2] == null) {
                    class118.field1984[var21][arg1][arg2] = new class249(var21, arg1, arg2);
                }
            }
            class118.field1984[arg0][arg1][arg2].field4189 = var20;
        } else if (arg3 == 1) {
            class84 var22 = new class84(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class118.field1984[var23][arg1][arg2] == null) {
                    class118.field1984[var23][arg1][arg2] = new class249(var23, arg1, arg2);
                }
            }
            class118.field1984[arg0][arg1][arg2].field4189 = var22;
        } else {
            class243 var24 = new class243(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class118.field1984[var25][arg1][arg2] == null) {
                    class118.field1984[var25][arg1][arg2] = new class249(var25, arg1, arg2);
                }
            }
            class118.field1984[arg0][arg1][arg2].field4179 = var24;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZII)I", line = 58)
    public static final int method1425(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            method1427(true);
        }
        field3417++;
        return arg2 < arg3 ? arg3 : (arg2 > arg0 ? arg0 : arg2);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILpb;)V", line = 84)
    public static final void method1426(int arg0, class70 arg1) {
        field3416++;
        int var2 = arg1.method486((byte) 112);
        class14.field217 = new class282[var2];
        for (int var3 = arg0; var3 < var2; var3++) {
            class14.field217[var3] = new class282();
            class14.field217[var3].field4848 = arg1.method486((byte) 117);
            class14.field217[var3].field4854 = arg1.method451((byte) -115);
        }
        class100.field1693 = arg1.method486((byte) 126);
        class297.field5090 = arg1.method486((byte) 65);
        class206.field3539 = arg1.method486((byte) 120);
        class213.field3631 = new class238[class297.field5090 + 1 - class100.field1693];
        for (int var4 = 0; var4 < class206.field3539; var4++) {
            int var5 = arg1.method486((byte) 95);
            class238 var6 = class213.field3631[var5] = new class238();
            var6.field357 = arg1.method481(0);
            var6.field378 = arg1.method469(121);
            var6.field3951 = var5 + class100.field1693;
            var6.field3948 = arg1.method451((byte) -115);
            var6.field3950 = arg1.method451((byte) -115);
        }
        class32.field520 = arg1.method469(98);
        class277.field4760 = true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 137)
    public static void method1427(boolean arg0) {
        field3420 = null;
        if (arg0) {
            method1427(false);
        }
        field3419 = null;
        field3418 = (int[][]) null;
    }
}
