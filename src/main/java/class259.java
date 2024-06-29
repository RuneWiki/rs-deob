import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class259 {

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field3864 = 0;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3865 = "Connected to update server";

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3869 = "glow3:";

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[I")
    public static int[] field3859 = new int[25];

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static volatile int field3867 = -1;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3862 = new String[100];

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lth;")
    public static class57 field3868 = new class57(4);

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "F")
    public static float field3863;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lqf;")
    public static class359 field3861;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ[[F[[FFLnk;[[FI[[III[[IIIIIBI)I", line = 15)
    public static final int method1902(int arg0, boolean arg1, float[][] arg2, float[][] arg3, float arg4, class224 arg5, float[][] arg6, int arg7, int[][] arg8, int arg9, int arg10, int[][] arg11, int arg12, int arg13, int arg14, int arg15, byte arg16, int arg17) {
        if (arg0 == 1) {
            int var19 = arg10;
            arg10 = arg12;
            arg12 = 128 - var19;
        } else if (arg0 == 2) {
            arg12 = 128 - arg12;
            arg10 = 128 - arg10;
        } else if (arg0 == 3) {
            int var18 = arg10;
            arg10 = 128 - arg12;
            arg12 = var18;
        }
        field3866++;
        float var20;
        int var21;
        float var22;
        float var23;
        if (arg10 == 0 && arg12 == 0) {
            var20 = arg2[arg17][arg9];
            var21 = arg14;
            var22 = arg3[arg17][arg9];
            var23 = arg6[arg17][arg9];
        } else if (arg10 == 128 && arg12 == 0) {
            var21 = arg15;
            var22 = arg3[arg17 + 1][arg9];
            var23 = arg6[arg17 + 1][arg9];
            var20 = arg2[arg17 + 1][arg9];
        } else if (arg10 == 128 && arg12 == 128) {
            var20 = arg2[arg17 + 1][arg9 + 1];
            var22 = arg3[arg17 + 1][arg9 + 1];
            var23 = arg6[arg17 + 1][arg9 + 1];
            var21 = arg13;
        } else if (arg10 == 0 && arg12 == 128) {
            var20 = arg2[arg17][arg9 + 1];
            var22 = arg3[arg17][arg9 + 1];
            var23 = arg6[arg17][arg9 + 1];
            var21 = arg7;
        } else {
            float var24 = arg3[arg17][arg9];
            float var25 = arg6[arg17][arg9];
            float var26 = arg2[arg17][arg9];
            float var27 = (float) arg10 / 128.0F;
            float var28 = (arg3[arg17 + 1][arg9] - var24) * var27 + var24;
            float var29 = (float) arg12 / 128.0F;
            float var30 = (arg2[arg17 + 1][arg9] - var26) * var27 + var26;
            float var31 = (arg6[arg17 + 1][arg9] - var25) * var27 + var25;
            float var32 = arg3[arg17][arg9 + 1];
            float var33 = arg6[arg17][arg9 + 1];
            float var34 = arg2[arg17][arg9 + 1];
            float var35 = (arg2[arg17 + 1][arg9 + 1] - var34) * var27 + var34;
            float var36 = (arg3[arg17 + 1][arg9 + 1] - var32) * var27 + var32;
            var20 = (var35 - var30) * var29 + var30;
            float var37 = (arg6[arg17 + 1][arg9 + 1] - var33) * var27 + var33;
            var22 = (var36 - var28) * var29 + var28;
            int var38 = class257.method1889(arg15, arg14, arg10, (byte) 90);
            int var39 = class257.method1889(arg13, arg7, arg10, (byte) 79);
            var23 = (var37 - var31) * var29 + var31;
            var21 = class257.method1889(var39, var38, arg12, (byte) 116);
        }
        if (arg16 < 35) {
            method1904(37);
        }
        int var40 = (arg9 << 7) + arg12;
        int var41 = (arg17 << 7) + arg10;
        int var42 = class88.method702(-82, arg9, arg10, arg12, arg17, arg8);
        return arg5.method1644(var41, var42, var40, var23, var22, var20, arg1 ? var21 & 0xFFFFFF00 : var21, arg11 == null ? 0.0F : (float) (var42 - class88.method702(-124, arg9, arg10, arg12, arg17, arg11)) / arg4);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lib;", line = 125)
    public static final class329 method1903(int arg0, int arg1) {
        field3860++;
        class329 var2 = (class329) class247.field3658.method461((byte) 120, (long) arg0);
        if (arg1 != -4576) {
            return (class329) null;
        } else if (var2 == null) {
            byte[] var3 = class220.field3288.method2520(34, arg0, (byte) -25);
            class329 var4 = new class329();
            if (var3 != null) {
                var4.method2281(arg0, true, new class190(var3));
            }
            class247.field3658.method460(var4, -26089, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 173)
    public static void method1904(int arg0) {
        field3868 = null;
        field3859 = null;
        field3865 = null;
        field3869 = null;
        if (arg0 > 18) {
            field3862 = null;
            field3861 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 198)
    public static final void method1905(int arg0) {
        if (arg0 >= -94) {
            return;
        }
        if (class147.field2114 < 0) {
            class147.field2114 = 0;
            class362.field5742 = -1;
            class299.field4473 = -1;
        }
        field3870++;
        if (class105.field1499 < class147.field2114) {
            class362.field5742 = -1;
            class299.field4473 = -1;
            class147.field2114 = class105.field1499;
        }
        if (class124.field1810 < 0) {
            class124.field1810 = 0;
            class299.field4473 = -1;
            class362.field5742 = -1;
        }
        if (class105.field1503 < class124.field1810) {
            class299.field4473 = -1;
            class124.field1810 = class105.field1503;
            class362.field5742 = -1;
        }
    }
}
