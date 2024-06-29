import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class225 implements class94 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Leb;")
    private static class230 field3879 = class68.method589(0, "Loading)3)3)3");

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Leb;")
    public static class230 field3880 = field3879;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lpk;")
    public static class98 field3883 = new class98();

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3888 = -1;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3886 = 0;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "[I")
    public static int[] field3894 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field3893 = 3353893;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "[I")
    public static int[] field3887 = new int[2000];

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[S")
    public static short[] field3890 = new short[500];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Lec;")
    public static final class23 method1552(boolean arg0) {
        field3882++;
        if (class6.field85 < class189.field3325.length) {
            return class189.field3325[class6.field85++];
        } else {
            if (!arg0) {
                method1552(true);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[IJI)Leb;")
    public final class230 method806(int arg0, int[] arg1, long arg2, int arg3) {
        int var6 = 52 % ((arg0 - 46) / 47);
        field3884++;
        if (arg3 == 0) {
            class77 var7 = class249.method1742(-10314, arg1[0]);
            return var7.method642((byte) 15, (int) arg2);
        } else if (arg3 == 1 || arg3 == 10) {
            class12 var8 = class214.method1484((int) arg2, -1);
            return var8.field191;
        } else if (arg3 == 6 || arg3 == 7) {
            return class249.method1742(-10314, arg1[0]).method642((byte) 107, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1553(int arg0) {
        field3880 = null;
        field3890 = null;
        field3879 = null;
        int var1 = 25 / ((-arg0 - 3) / 35);
        field3894 = null;
        field3887 = null;
        field3883 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILkk;)V")
    public static final void method1554(int arg0, class223 arg1) {
        field3881++;
        class145.field2594 = arg1;
        if (arg0 != 11) {
            method1552(false);
        }
        field3889 = class145.field2594.method1533((byte) 124, 16);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZIIZIZ)Leh;")
    public static final class80 method1555(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7) {
        field3885++;
        class12 var8 = class214.method1484(arg1, -1);
        if (arg4 > 1 && var8.field222 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg4 >= var8.field186[var10] && var8.field186[var10] != 0) {
                    var9 = var8.field222[var10];
                }
            }
            if (var9 != -1) {
                var8 = class214.method1484(var9, -1);
            }
        }
        class90 var11 = var8.method118((byte) 89);
        if (var11 == null) {
            return null;
        }
        class10 var12 = null;
        if (var8.field192 != -1) {
            var12 = (class10) method1555(0, var8.field232, false, 1, 10, true, -106, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field206 != -1) {
            var12 = (class10) method1555(arg0, var8.field190, false, arg3, arg4, false, -92, true);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class87.field1523;
        int[] var14 = class87.field1516;
        int var15 = class87.field1524;
        int[] var16 = new int[4];
        class87.method702(var16);
        class10 var17 = new class10(36, 32);
        class87.method710(var17.field165, 36, 32);
        class3.method33();
        class3.method24(16, 16);
        class3.field31 = false;
        if (arg6 > -41) {
            method1555(-120, -93, true, -98, -98, true, -58, false);
        }
        int var18 = var8.field223;
        if (arg5) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg3 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class3.field21[var8.field169] * var18 >> 16;
        int var20 = class3.field24[var8.field169] * var18 >> 16;
        var11.method752(0, var8.field233, var8.field234, var8.field169, var8.field201, var8.field202 + var19 - (var11.method496() / 2), var8.field202 + var20);
        if (arg3 >= 1) {
            var17.method109(1);
            if (arg3 >= 2) {
                var17.method109(16777215);
            }
            class87.method710(var17.field165, 36, 32);
        }
        if (arg0 != 0) {
            var17.method92(arg0);
        }
        if (var8.field192 != -1) {
            var12.method106(0, 0);
        } else if (var8.field206 != -1) {
            class87.method710(var12.field165, 36, 32);
            var17.method106(0, 0);
            var17 = var12;
        }
        if (arg2 && (var8.field213 == 1 || arg4 != 1) && arg4 != -1) {
            class177.field3113.method800(class247.method1723(-11076, arg4), 0, 9, 16776960, 1);
        }
        class87.method710(var14, var13, var15);
        class87.method703(var16);
        class3.method33();
        class3.field31 = true;
        return var17;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)Lge;")
    public static final class69 method1556(int arg0) {
        field3878++;
        class69 var1 = new class69(class47.field839, class15.field346, class96.field1735[0], class113.field2034[0], class7.field124[0], class273.field4806[0], class215.field3725[arg0], class263.field4676);
        class78.method650(true);
        return var1;
    }
}
