import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class272 extends class199 {

    @OriginalMember(owner = "client!em", name = "B", descriptor = "Lge;")
    public class10 field4218;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "Lql;")
    public static class87 field4223 = new class87();

    @OriginalMember(owner = "client!em", name = "I", descriptor = "[I")
    public static int[] field4225 = new int[1000];

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "Loj;")
    public static class284 field4224;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Lkh;I)Lqk;", line = 6)
    public static final class1 method1871(class166 arg0, int arg1) {
        field4222++;
        return arg1 == 28363 ? new class1(arg0.method1166(52), arg0.method1166(52), arg0.method1166(52), arg0.method1166(52), arg0.method1166(52), arg0.method1166(52), arg0.method1166(52), arg0.method1166(52), arg0.method1156((byte) 109), arg0.method1178(0)) : (class1) null;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)V", line = 17)
    public static void method1872(boolean arg0) {
        field4224 = null;
        field4225 = null;
        field4223 = null;
        if (!arg0) {
            field4223 = (class87) null;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lge;)V", line = 35)
    public class272(class10 arg0) {
        this.field4218 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(II)V", line = 48)
    public static final void method1873(int arg0, int arg1) {
        if (arg0 != 384) {
            method1872(true);
        }
        field4219++;
        class30.field438.method2175(arg1, arg0 ^ 0xAC7A92E7);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIILwb;IJZ)Z", line = 58)
    public static final boolean method1874(int arg0, int arg1, int arg2, int arg3, int arg4, class253 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class189.method1347(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjava/lang/String;)I", line = 93)
    public static final int method1875(int arg0, String arg1) {
        field4221++;
        if (class162.field2445 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class162.field2445.field4696; var2++) {
            if (class194.method1383(arg1, 0, class67.method516(class162.field2445.field4693[var2], " ", "<br>", false))) {
                return var2;
            }
        }
        if (arg0 != 32028) {
            field4224 = (class284) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([IIIIB)V", line = 128)
    public static final void method1876(int[] arg0, int arg1, int arg2, int arg3, byte arg4) {
        arg2--;
        if (arg4 >= -8) {
            field4223 = (class87) null;
        }
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        field4217++;
        while (var5 > arg2) {
            int var7 = arg2 + 1;
            arg0[var7] = arg3;
            int var8 = var7 + 1;
            arg0[var8] = arg3;
            int var9 = var8 + 1;
            arg0[var9] = arg3;
            int var10 = var9 + 1;
            arg0[var10] = arg3;
            int var11 = var10 + 1;
            arg0[var11] = arg3;
            int var12 = var11 + 1;
            arg0[var12] = arg3;
            int var13 = var12 + 1;
            arg0[var13] = arg3;
            arg2 = var13 + 1;
            arg0[arg2] = arg3;
        }
        while (var6 > arg2) {
            arg2++;
            arg0[arg2] = arg3;
        }
    }
}
