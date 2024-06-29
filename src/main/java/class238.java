import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class238 extends class161 {

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Lp;")
    public class280 field4124;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[I")
    public static int[] field4127 = new int[] { 0, 0, 0, 0, 3, 0, 0, -2, 6, 0, 8, -2, 0, 0, 0, 4, 0, 1, 0, 0, 5, 8, 0, 0, 0, 0, 12, 6, 0, 0, -1, 5, 0, 7, 0, 0, 0, 0, -1, 0, 0, 0, -2, 0, 0, 0, 0, -2, 20, 0, 0, 9, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 7, -1, -1, -2, 0, 0, 0, 0, 6, 0, 0, 9, 0, 2, 0, -1, 6, -2, -1, -2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, -2, -1, 0, -1, 0, 6, 0, 8, 0, 8, 0, 0, 0, 0, 0, -2, 0, 0, 0, 10, 3, 0, 2, 0, 0, 3, 0, 0, 6, 0, 0, 4, 0, 10, 0, 0, 0, 5, 0, 6, 1, 0, 15, 0, 0, 0, 0, 0, -1, 0, 6, 0, 0, 0, 0, 0, 0, 1, 0, 12, 0, 2, 0, 0, 0, 5, 0, 6, 0, 0, -2, 8, 0, 0, 5, 6, 0, 0, -2, 0, 0, 0, 0, 0, 5, -2, -1, 5, 0, 0, 4, 2, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, -1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 10, -1, 8, 0, 0, 10, 0, 0, 0, 24, 0, 0, -2, 15, -1, -1, 2, 7, 10, 0, 0, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Lp;")
    public static class280 field4130 = class18.method140((byte) -117, "::gc");

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "Lp;")
    public static class280 field4133 = class18.method140((byte) -122, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field4128 = 0;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZJII)Lp;")
    public static final class280 method1590(boolean arg0, long arg1, int arg2, int arg3) {
        field4125++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        long var5 = arg1 / (long) arg2;
        if (arg3 != 9851) {
            field4133 = null;
        }
        int var7 = 1;
        while (var5 != 0L) {
            var7++;
            var5 /= (long) arg2;
        }
        int var8 = var7;
        if (arg1 < 0L || arg0) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var12 = (int) (arg1 % (long) arg2);
            if (var12 < 0) {
                var12 = -var12;
            }
            arg1 /= (long) arg2;
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class280 var11 = new class280();
        var11.field4907 = var9;
        var11.field4908 = var8;
        return var11;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILua;)I")
    public static final int method1591(int arg0, int arg1, class113 arg2) {
        field4126++;
        if (!class254.method1710(client.method1099(arg2), (byte) 100, arg1) && arg2.field1861 == null) {
            return -1;
        } else if (arg0 == 0) {
            return arg2.field1873 == null || arg2.field1873.length <= arg1 ? -1 : arg2.field1873[arg1];
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class238() {
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static final void method1592(boolean arg0) {
        field4131++;
        class232.field4046.method1481(false);
        if (!arg0) {
            method1594(-59);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 <= 110) {
            return;
        }
        field4123++;
        if (arg8 >= class89.field1440 && arg8 <= class12.field249 && class89.field1440 <= arg7 && class12.field249 >= arg7 && class89.field1440 <= arg0 && class12.field249 >= arg0 && arg9 >= class89.field1440 && arg9 <= class12.field249 && arg4 >= class36.field654 && class249.field4360 >= arg4 && class36.field654 <= arg5 && arg5 <= class249.field4360 && arg3 >= class36.field654 && arg3 <= class249.field4360 && class36.field654 <= arg1 && arg1 <= class249.field4360) {
            class260.method1759(arg5, arg4, arg7, arg1, -124, arg6, arg0, arg8, arg3, arg9);
        } else {
            class250.method1686(arg6, arg4, arg0, arg9, arg7, arg8, (byte) 15, arg3, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static void method1594(int arg0) {
        field4133 = null;
        if (arg0 == 11738) {
            field4127 = null;
            field4130 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Z")
    public static final boolean method1595(byte arg0, int arg1) {
        field4129++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            if (arg0 > -117) {
                method1591(90, 72, (class113) null);
            }
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lp;)V")
    public class238(class280 arg0) {
        this.field4124 = arg0;
    }
}
