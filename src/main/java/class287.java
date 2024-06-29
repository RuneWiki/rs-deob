import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class287 {

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public int field4841 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Luf;")
    private static class168 field4835 = class148.method1019(-1720, "Continue");

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Luf;")
    public static class168 field4843 = field4835;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Ldk;")
    public static class241 field4839;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[I")
    public static int[] field4846;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lij;IIIIIIIZ)V", line = 9)
    public static final void method1979(class264 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class187.field2968;
        int var11;
        int var12 = var11 = (arg7 << 7) - class205.field3375;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class227.field3686[arg1][arg6][arg7] - class140.field2153;
        int var18 = class227.field3686[arg1][arg6 + 1][arg7] - class140.field2153;
        int var19 = class227.field3686[arg1][arg6 + 1][arg7 + 1] - class140.field2153;
        int var20 = class227.field3686[arg1][arg6][arg7 + 1] - class140.field2153;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class173.field2820;
        int var46 = (var24 << 9) / var25 + class173.field2807;
        int var47 = (var27 << 9) / var31 + class173.field2820;
        int var48 = (var30 << 9) / var31 + class173.field2807;
        int var49 = (var33 << 9) / var37 + class173.field2820;
        int var50 = (var36 << 9) / var37 + class173.field2807;
        int var51 = (var39 << 9) / var43 + class173.field2820;
        int var52 = (var42 << 9) / var43 + class173.field2807;
        class173.field2814 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0 && class72.field965 && class179.method1285(class173.field2820 + class140.field2175, class173.field2807 + class114.field1786, var50, var52, var48, var49, var51, var47)) {
            class114.field1783 = arg6;
            class261.field4433 = arg7;
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0 && class72.field965 && class179.method1285(class173.field2820 + class140.field2175, class173.field2807 + class114.field1786, var46, var48, var52, var45, var47, var51)) {
            class114.field1783 = arg6;
            class261.field4433 = arg7;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILj;I)V", line = 125)
    private final void method1980(int arg0, class153 arg1, int arg2) {
        field4840++;
        if (arg0 != -4670) {
            field4839 = (class241) null;
        }
        if (arg2 == 5) {
            this.field4841 = arg1.method1069(58);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 146)
    public static void method1981(byte arg0) {
        field4835 = null;
        field4839 = null;
        field4843 = null;
        if (arg0 >= -32) {
            field4846 = (int[]) null;
        }
        field4846 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLj;)V", line = 161)
    public final void method1982(byte arg0, class153 arg1) {
        field4837++;
        while (true) {
            int var3 = arg1.method1042((byte) 101);
            if (var3 == 0) {
                if (arg0 > -110) {
                    field4843 = (class168) null;
                }
                return;
            }
            this.method1980(-4670, arg1, var3);
        }
    }
}
