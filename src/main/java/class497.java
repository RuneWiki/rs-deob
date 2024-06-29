import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class497 extends class601 {

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!bia", name = "g", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!bia", name = "h", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!bia", name = "i", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!bia", name = "j", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!bia", name = "k", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!bia", name = "l", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)Z")
    public final boolean method2961(int arg0) {
        if (arg0 != -9242) {
            return true;
        } else {
            ++field7017;
            if (super.field8563.method3930(19)) {
                return false;
            } else {
                return super.field8563.method3926(108) == class101.field1048;
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(ILgn;)V")
    public class497(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(I)I")
    public final int method2962(int arg0) {
        int var2 = -122 % ((-59 - arg0) / 61);
        ++field7020;
        return super.field8565;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        ++field7019;
        if (super.field8563.method3926(19) != class101.field1048) {
            super.field8565 = 1;
        } else if (super.field8563.method3930(19)) {
            super.field8565 = 0;
        }
        if (arg0 >= -37) {
            this.method39((byte) -41);
        }
        if (super.field8565 != 0 && super.field8565 != 1) {
            super.field8565 = this.method39((byte) -17);
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "([BI)Lvga;")
    public static final class85 method2963(byte[] arg0, int arg1) {
        ++field7016;
        class85 var2 = new class85();
        class244 var3 = new class244(arg0);
        var3.field2903 = var3.field2912.length + -2;
        int var4 = var3.method1476(arg1 + 60);
        int var5 = var3.field2912.length - (var4 + 2 - -12);
        var3.field2903 = var5;
        int var6 = var3.method1438(arg1 + 89);
        var2.field890 = var3.method1476(arg1 ^ -94);
        var2.field891 = var3.method1476(24);
        var2.field889 = var3.method1476(arg1 ^ -121);
        var2.field895 = var3.method1476(-89);
        int var7 = var3.method1423(-81);
        if (var7 > arg1) {
            var2.field896 = new class295[var7];
            for (int var8 = 0; var7 > var8; ++var8) {
                int var9 = var3.method1476(48);
                class295 var10 = new class295(class756.method4202(true, var9));
                var2.field896[var8] = var10;
                while (~(var9--) < -1) {
                    int var11 = var3.method1438(100);
                    int var12 = var3.method1438(arg1 ^ 119);
                    var10.method1751(new class716(var12), arg1 + 3970, (long) var11);
                }
            }
        }
        var3.field2903 = 0;
        var2.field901 = var3.method1479((byte) 57);
        var2.field902 = new String[var6];
        var2.field898 = new int[var6];
        var2.field894 = new int[var6];
        int var13 = 0;
        while (~var5 < ~var3.field2903) {
            int var14 = var3.method1476(-127);
            if (var14 != 3) {
                if (~var14 > -101 && var14 != 21 && var14 != 38 && ~var14 != -40) {
                    var2.field898[var13] = var3.method1438(91);
                } else {
                    var2.field898[var13] = var3.method1423(-43);
                }
            } else {
                var2.field902[var13] = var3.method1468(-1468860088).intern();
            }
            var2.field894[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7023;
        for (int var6 = arg3; arg2 >= var6; ++var6) {
            for (int var7 = arg0; var7 <= arg4; ++var7) {
                if (class620.field8883[var6][var7] == arg1 && ~class140.field1582[var6][var7] >= -2) {
                    return true;
                }
            }
        }
        if (arg5 != 3) {
            method2964(102, 4, 3, -58, -57, 108);
        }
        return false;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        ++field7024;
        if (arg1) {
            field7021 = 42;
        }
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lgn;)V")
    public class497(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        ++field7022;
        if (super.field8563.method3930(19)) {
            return 3;
        } else {
            if (arg1 != 15706) {
                method2963((byte[]) null, 109);
            }
            return super.field8563.method3926(64) == class101.field1048 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            return 16;
        } else {
            ++field7018;
            return 1;
        }
    }
}
