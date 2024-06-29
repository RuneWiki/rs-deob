import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class279 extends class102 {

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    private final int field4904;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    private final int field4906;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    private final int field4909;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    private final int field4902;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
    public static int[] field4895 = new int[5];

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Lqk;")
    public static class207 field4888 = class24.method212(255, "www)2wtqa");

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "Lqk;")
    public static class207 field4893 = class24.method212(255, "(U0a )2 via: ");

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public static int field4897 = 0;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public static int field4905 = 0;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "Lqk;")
    private static class207 field4907 = class24.method212(255, "Loaded interfaces");

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "Lqk;")
    public static class207 field4896 = class24.method212(255, "Cache:");

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "Lqk;")
    public static class207 field4899 = field4907;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Lqk;")
    private static class207 field4891 = class24.method212(255, "Prepared sound engine");

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "Lqk;")
    public static class207 field4903 = field4891;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "Lpk;")
    public static class99 field4911;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lbb;")
    public static final class89 method1893(int arg0) {
        if (arg0 > -6) {
            method1896((byte) 28, (class256) null);
        }
        ++field4901;
        try {
            return (class89) Class.forName("ni").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
    public final void method25(int arg0, int arg1, int arg2) {
        int var4 = this.field4904 * arg0 >> 12;
        ++field4910;
        int var5 = this.field4902 * arg2 >> 12;
        int var6 = this.field4909 * arg2 >> 12;
        int var7 = this.field4906 * arg0 >> 12;
        class196.method1363(var4, var5, var7, super.field1834, var6, (byte) -128);
        if (arg1 != 1) {
            this.method22(-118, -86, 66);
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIIIII)V")
    public class279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4904 = arg2;
        this.field4906 = arg0;
        this.field4909 = arg3;
        this.field4902 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)V")
    public final void method22(int arg0, int arg1, int arg2) {
        if (arg0 == 29635) {
            ++field4912;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4894;
        if (~arg4 == ~arg9 && ~arg0 == ~arg1 && arg7 == arg8 && arg5 == arg6) {
            class129.method903(0, arg9, arg3, arg8, arg0, arg6);
        } else {
            int var10 = arg9;
            int var11 = arg9 * 3;
            int var12 = arg0;
            int var13 = arg0 * 3;
            int var14 = arg4 * 3;
            int var15 = arg1 * 3;
            int var16 = arg5 * 3;
            int var17 = -var11 + var14;
            int var18 = arg6 - -var15 + -var16 + -arg0;
            int var19 = arg7 * 3;
            int var20 = -arg9 + var14 + -var19 + arg8;
            int var21 = -var15 + var13 + -var15 + var16;
            int var22 = -var14 + var19 - var14 + var11;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var26;
                int var28 = var18 * var26;
                int var29 = var22 * var25;
                int var30 = var23 * var24;
                int var31 = var17 * var24;
                int var32 = (var27 + var29 + var31 >> 12) + arg9;
                int var33 = var21 * var25;
                int var34 = (var30 + var33 + var28 >> 12) + arg0;
                class129.method903(0, var10, arg3, var32, var12, var34);
                var10 = var32;
                var12 = var34;
            }
        }
        if (arg2 > -103) {
            method1895((byte) -4);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static final void method1895(byte arg0) {
        ++field4887;
        for (int var1 = 0; var1 < class65.field1179; ++var1) {
            int var2 = class180.field3233[var1];
            class14 var3 = class169.field2953[var2];
            int var4 = class17.field262.method1045((byte) 97);
            if ((16 & var4) != 0) {
                var4 += class17.field262.method1045((byte) 93) << 8;
            }
            class121.method861(var3, var4, var2, -127);
        }
        if (arg0 != -92) {
            method1895((byte) 28);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZI)V")
    public final void method23(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field4908 = -11;
        }
        ++field4889;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLka;)I")
    public static final int method1896(byte arg0, class256 arg1) {
        ++field4900;
        if (arg0 != -6) {
            return -15;
        } else {
            class72 var2 = arg1.field4581;
            if (var2.field1293 != null) {
                var2 = var2.method517(-126);
                if (var2 == null) {
                    return -1;
                }
            }
            int var3 = var2.field1296;
            class200 var4 = arg1.method1947(9);
            if (arg1.field5039 == var4.field3539) {
                var3 = var2.field1291;
            } else if (arg1.field5039 != var4.field3528 && arg1.field5039 != var4.field3541 && arg1.field5039 != var4.field3519 && ~arg1.field5039 != ~var4.field3527) {
                if (~arg1.field5039 == ~var4.field3531 || ~arg1.field5039 == ~var4.field3545 || arg1.field5039 == var4.field3536 || arg1.field5039 == var4.field3540) {
                    var3 = var2.field1279;
                }
            } else {
                var3 = var2.field1285;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
    public static void method1897(int arg0) {
        field4896 = null;
        field4911 = null;
        field4903 = null;
        field4899 = null;
        field4895 = null;
        field4888 = null;
        field4891 = null;
        field4907 = null;
        int var1 = -85 / ((2 - arg0) / 52);
        field4893 = null;
    }
}
