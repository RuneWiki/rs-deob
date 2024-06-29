import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class247 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field3935 = 0;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field3938 = 0;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lfa;")
    public static class273 field3937;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Lfa;")
    public static class273 field3939;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class258.method1797(arg5, 66);
        field3936++;
        int var7 = 0;
        int var8 = -arg5;
        int var9 = arg5 - arg4;
        int var10 = arg5;
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = -1;
        int var12 = -var9;
        int[] var13 = class130.field2005[arg1];
        int var14 = -1;
        int var15 = arg3 + var9;
        int var16 = arg3 - var9;
        int var17 = var9;
        class71.method451(arg2, arg6, var16, arg3 - arg5, var13);
        class71.method451(arg0, arg6, var15, var16, var13);
        class71.method451(arg2, arg6, arg3 + arg5, var15, var13);
        while (var7 < var10) {
            var11 += 2;
            var12 += var11;
            var14 += 2;
            var8 += var14;
            if (var12 >= 0 && var17 >= 1) {
                class242.field3835[var17] = var7;
                var17--;
                var12 -= var17 << 1;
            }
            var7++;
            if (var8 >= 0) {
                var10--;
                if (var9 <= var10) {
                    int[] var18 = class130.field2005[arg1 + var10];
                    int[] var19 = class130.field2005[arg1 - var10];
                    int var20 = arg3 + var7;
                    int var21 = arg3 - var7;
                    class71.method451(arg2, true, var20, var21, var18);
                    class71.method451(arg2, true, var20, var21, var19);
                } else {
                    int[] var22 = class130.field2005[arg1 + var10];
                    int[] var23 = class130.field2005[arg1 - var10];
                    int var24 = class242.field3835[var10];
                    int var25 = arg3 - var7;
                    int var26 = arg3 + var7;
                    int var27 = arg3 + var24;
                    int var28 = arg3 - var24;
                    class71.method451(arg2, true, var28, var25, var22);
                    class71.method451(arg0, true, var27, var28, var22);
                    class71.method451(arg2, arg6, var26, var27, var22);
                    class71.method451(arg2, true, var28, var25, var23);
                    class71.method451(arg0, true, var27, var28, var23);
                    class71.method451(arg2, arg6, var26, var27, var23);
                }
                var8 -= var10 << 1;
            }
            int[] var29 = class130.field2005[arg1 + var7];
            int[] var30 = class130.field2005[arg1 - var7];
            int var31 = arg3 + var10;
            int var32 = arg3 - var10;
            if (var7 >= var9) {
                class71.method451(arg2, true, var31, var32, var29);
                class71.method451(arg2, true, var31, var32, var30);
            } else {
                int var33 = var17 < var7 ? class242.field3835[var7] : var17;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class71.method451(arg2, true, var35, var32, var29);
                class71.method451(arg0, arg6, var34, var35, var29);
                class71.method451(arg2, true, var31, var34, var29);
                class71.method451(arg2, true, var35, var32, var30);
                class71.method451(arg0, arg6, var34, var35, var30);
                class71.method451(arg2, true, var31, var34, var30);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)Z")
    public static final boolean method1725(int arg0) {
        field3934++;
        if (arg0 != 22050) {
            return false;
        }
        try {
            if (class202.field3238 == 2) {
                if (class87.field1368 == null) {
                    class87.field1368 = class21.method124(class79.field1257, class124.field1909, class180.field2793);
                    if (class87.field1368 == null) {
                        return false;
                    }
                }
                if (class187.field2892 == null) {
                    class187.field2892 = new class56(class74.field1147, class286.field4770);
                }
                if (class72.field1040.method1990(class187.field2892, false, 22050, class20.field276, class87.field1368)) {
                    class72.field1040.method1972(-32585);
                    class72.field1040.method1982(4029, class231.field3705);
                    class72.field1040.method1981(0, class87.field1368, class278.field4621);
                    class202.field3238 = 0;
                    class87.field1368 = null;
                    class79.field1257 = null;
                    class187.field2892 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class72.field1040.method1979(arg0 ^ 0xCC285C3);
            class79.field1257 = null;
            class202.field3238 = 0;
            class87.field1368 = null;
            class187.field2892 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public static void method1726(int arg0) {
        field3937 = null;
        field3939 = null;
        if (arg0 < 87) {
            method1725(-74);
        }
    }
}
