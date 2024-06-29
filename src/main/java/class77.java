import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class77 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1004 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1005 = "Loaded sprites";

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lqj;")
    public static class280 field1013 = new class280(64);

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[I")
    public static int[] field1012;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[Lbi;")
    public static class96[] field1008;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I", line = 4)
    public static int method492(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V", line = 21)
    public static final void method493(boolean arg0) {
        if (arg0) {
            method493(true);
        }
        class328.field5282.method304(227, 19830);
        class166.field2562++;
        field1007++;
        class328.field5282.method1003(class227.field3429, -2);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V", line = 37)
    public static final void method494(int arg0, int arg1) {
        field1011++;
        class26.method187(class26.field304, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class26.method190(-50.0F, -60.0F, -50.0F);
        class26.method194(class26.field303, 0, false);
        if (arg1 != 19974) {
            method494(101, -42);
        }
        class26.method186();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 52)
    public static void method495(int arg0) {
        if (arg0 != 7329) {
            method494(41, 109);
        }
        field1004 = null;
        field1013 = null;
        field1005 = null;
        field1008 = null;
        field1012 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIII)V", line = 66)
    public static final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != -5605) {
            method497(-107, (byte) 83);
        }
        if (arg3 == arg4 && arg0 == arg6 && arg1 == arg7 && arg2 == arg8) {
            class156.method1140(arg5 + 28799, arg4, arg7, arg0, arg9, arg2);
        } else {
            int var10 = arg0;
            int var11 = arg4;
            int var12 = arg0 * 3;
            int var13 = arg4 * 3;
            int var14 = arg3 * 3;
            int var15 = arg6 * 3;
            int var16 = arg8 * 3;
            int var17 = arg1 * 3;
            int var18 = var13 + (var17 - var14) - var14;
            int var19 = var16 + var12 - var15 - var15;
            int var20 = var14 - var13;
            int var21 = var15 - var12;
            int var22 = arg7 - (var17 - var14) - arg4;
            int var23 = var15 + arg2 - var16 - arg0;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var22 * var26;
                int var28 = var18 * var25;
                int var29 = var23 * var26;
                int var30 = var19 * var25;
                int var31 = var20 * var24;
                int var32 = var21 * var24;
                int var33 = (var27 + var28 + var31 >> 12) + arg4;
                int var34 = arg0 + (var29 - (-var30 - var32) >> 12);
                class156.method1140(23194, var11, var33, var10, arg9, var34);
                var10 = var34;
                var11 = var33;
            }
        }
        field1010++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Z", line = 141)
    public static final boolean method497(int arg0, byte arg1) {
        if (arg1 != 96) {
            field1005 = (String) null;
        }
        field1006++;
        return arg0 == 4 || arg0 == 8;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILua;)Z", line = 153)
    public static final boolean method498(int arg0, class103 arg1) {
        field1009++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field1415) {
            return false;
        } else if (!arg1.method657(127)) {
            return false;
        } else if (class247.field3901.method770((long) arg1.field1391, 104) != null) {
            return false;
        } else if (class180.field2697.method770((long) arg1.field1397, -33) == null) {
            return arg0 >= -97 ? true : true;
        } else {
            return false;
        }
    }
}
