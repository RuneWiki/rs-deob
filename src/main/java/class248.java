import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class248 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public int field3815 = 443;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Z")
    public boolean field3822 = false;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public int field3824 = 43594;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Lae;")
    public static class166 field3819 = new class166();

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Lbj;")
    public static class162 field3827 = new class162(23, 3);

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Lmn;")
    public static class249 field3828 = new class249(512);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/lang/String;")
    public String field3826;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "[Lsm;")
    public static class188[] field3825;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method1603(int arg0) {
        field3828 = null;
        if (arg0 != -14722) {
            method1609(null, 34, -41);
        }
        field3825 = null;
        field3819 = null;
        field3827 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILbc;)Z")
    public final boolean method1604(int arg0, class248 arg1) {
        if (arg0 != 10) {
            this.field3826 = null;
        }
        field3817++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field3818 == arg1.field3818 && this.field3826.equals(arg1.field3826);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)I")
    public final int method1605(byte arg0) {
        if (arg0 >= -65) {
            method1610(-21, -31, 16, -11, 50);
        }
        field3813++;
        return this.field3822 ? this.field3815 : this.field3824;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([[II)V")
    public static final void method1606(int[][] arg0, int arg1) {
        if (arg1 != -27678) {
            field3827 = null;
        }
        field3816++;
        class316.field4797 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(JZII)V")
    public static final void method1607(long arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            method1608(-12, -94);
        }
        field3820++;
        int var5 = ((int) arg0 & 0x7EC71) >> 14;
        int var6 = ((int) arg0 & 0x3C3068) >> 20;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class377.method2317(-1, 0, arg3, true, 0, arg2, var5, 0, var6);
            return;
        }
        class306 var8 = class123.field2142.method1530((byte) -107, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field4595;
            var9 = var8.field4601;
        } else {
            var9 = var8.field4595;
            var10 = var8.field4601;
        }
        int var11 = var8.field4603;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class377.method2317(-1, var11, arg3, true, var9, arg2, 0, var10, 0);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public static final void method1608(int arg0, int arg1) {
        field3814++;
        int var2 = 123 / ((-arg0 - 46) / 45);
        class18 var3 = class140.method1047(4, arg1, false);
        var3.method123(20983);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lgh;II)Ljava/lang/String;")
    public static final String method1609(class388 arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            field3827 = null;
        }
        field3821++;
        if (!client.method1371(arg0).method887(arg2, -91) && arg0.field5686 == null) {
            return null;
        } else if (arg0.field5731 == null || arg0.field5731.length <= arg2 || arg0.field5731[arg2] == null || arg0.field5731[arg2].trim().length() == 0) {
            return class321.field4902 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field5731[arg2];
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
    public static final void method1610(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3823++;
        class18 var5 = class140.method1047(8, arg4, false);
        var5.method122(true);
        var5.field291 = arg1;
        int var6 = 125 / ((4 - arg0) / 52);
        var5.field284 = arg3;
        var5.field283 = arg2;
    }
}
