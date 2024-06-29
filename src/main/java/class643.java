import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class643 extends class354 {

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lcha;")
    public static class220 field8919 = new class220(9, 3);

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "D")
    public static double field8916;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "J")
    public static long field8911;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (super.field4544.method4149((byte) 33)) {
            super.field4545 = 0;
        }
        ++field8915;
        if (super.field4545 != 1 && super.field4545 != 0) {
            super.field4545 = this.method393((byte) 113);
        }
        if (arg0 != 6384) {
            field8911 = 105L;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field8910;
        if (arg0 != 3) {
            this.method388(101);
        }
        return super.field4544.method4149((byte) 33) ? 3 : 1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method3607(int arg0, String arg1) {
        ++field8914;
        int var2 = arg1.length();
        if (~var2 == -1) {
            return new byte[0];
        } else {
            int var3 = arg0 + var2 & -4;
            int var4 = var3 / 4 * 3;
            if (var2 > var3 + -2 && ~class475.method2716(0, arg1.charAt(var3 - 2)) != 0) {
                if (var3 + -1 >= var2 || ~class475.method2716(0, arg1.charAt(var3 + -1)) == 0) {
                    --var4;
                }
            } else {
                var4 -= 2;
            }
            byte[] var5 = new byte[var4];
            class739.method4121(0, var5, arg1, -1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lwo;)V")
    public class643(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIILkv;)V")
    public static final void method3608(int arg0, int arg1, int arg2, int arg3, class272 arg4) {
        class14 var5 = class700.method3936(arg0, arg1, arg2);
        if (var5 != null) {
            arg4.field5801 = (arg1 << class480.field6531) + class139.field1991;
            arg4.field5800 = arg3;
            arg4.field5797 = (arg2 << class480.field6531) + class139.field1991;
            var5.field284 = arg4;
            int var6 = class395.field5009 == class195.field2669 ? 1 : 0;
            if (arg4.method83((byte) -69)) {
                if (arg4.method85(-113)) {
                    arg4.field5791 = class72.field1005[var6];
                    class72.field1005[var6] = arg4;
                    return;
                }
                arg4.field5791 = class730.field10164[var6];
                class730.field10164[var6] = arg4;
                class563.field7924 = true;
                return;
            }
            arg4.field5791 = class259.field3278[var6];
            class259.field3278[var6] = arg4;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        super.field4545 = arg1;
        ++field8909;
        if (arg0 != -1) {
            method3607(124, (String) null);
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(ILwo;)V")
    public class643(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public static void method3609(int arg0) {
        field8919 = null;
        if (arg0 != -1) {
            method3609(23);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZII)V")
    public static final void method3610(boolean arg0, int arg1, int arg2) {
        ++field8917;
        class557.field7751 = -class73.field1042 + arg1;
        class108.field1561 = arg2 - class73.field1041;
        if (arg0) {
            field8919 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)I")
    public final int method3611(byte arg0) {
        ++field8918;
        int var2 = 72 % ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field8920;
        int var2 = 101 % ((37 - arg0) / 63);
        return 1;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)Z")
    public final boolean method3612(int arg0) {
        ++field8913;
        if (super.field4544.method4149((byte) 33)) {
            return false;
        } else {
            int var2 = 79 / ((arg0 - -34) / 41);
            return true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZII[Lria;II)V")
    public static final void method3613(boolean arg0, int arg1, int arg2, class288[] arg3, int arg4, int arg5) {
        ++field8912;
        int var6 = 0;
        if (arg5 > 84) {
            while (~arg3.length < ~var6) {
                class288 var7 = arg3[var6];
                if (var7 != null && var7.field3743 == arg2) {
                    class408.method2276(-92, var7, arg4, arg0, arg1);
                    class707.method3957(arg4, var7, 118, arg1);
                    if (~(-var7.field3617 + var7.field3666) > ~var7.field3628) {
                        var7.field3628 = -var7.field3617 + var7.field3666;
                    }
                    if (~var7.field3737 < ~(-var7.field3714 + var7.field3656)) {
                        var7.field3737 = var7.field3656 - var7.field3714;
                    }
                    if (var7.field3628 < 0) {
                        var7.field3628 = 0;
                    }
                    if (var7.field3737 < 0) {
                        var7.field3737 = 0;
                    }
                    if (~var7.field3655 == -1) {
                        class236.method1483(var7, -1, arg0);
                    }
                }
                ++var6;
            }
        }
    }
}
