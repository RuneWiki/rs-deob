import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class494 extends class205 {

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Lwp;")
    public static class453 field6534 = new class453(63, 2);

    @OriginalMember(owner = "client!te", name = "B", descriptor = "Lfh;")
    public static class266 field6537 = new class266(2, -1);

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "Lf;")
    private class536 field6536;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 5)
    public final void method394(int arg0) {
        ++field6532;
        super.method394(-101);
        this.field6536 = class121.method649(super.field2604, 1024, ((class452) super.field2603).field5795);
        if (arg0 >= -41) {
            this.field6536 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIZI)V", line = 17)
    public final void method1240(int arg0, int arg1, boolean arg2, int arg3) {
        ++field6535;
        int var5 = this.method1242((byte) -8) * super.field2603.field1621 / 10000;
        int[] var6 = new int[4];
        class32.field452.method1060(var6);
        class32.field452.method1083(arg3, arg1 + 2, arg3 + var5, super.field2603.field1617 + arg1);
        this.field6536.method2909(arg3, arg1 + 2, super.field2603.field1621, super.field2603.field1617);
        class32.field452.method1083(var6[0], var6[1], var6[arg0], var6[3]);
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V", line = 35)
    public static void method2664(int arg0) {
        if (arg0 < -54) {
            field6537 = null;
            field6534 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V", line = 47)
    public static final void method2665(boolean arg0) {
        class39.field524.method641(0);
        ++field6528;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class503.field6665[var1] = 0L;
        }
        if (arg0) {
            for (int var2 = 0; var2 < 32; ++var2) {
                class344.field4421[var2] = 0L;
            }
            class343.field4401 = 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lpp;ILpp;)V", line = 73)
    public static final void method2666(class508 arg0, int arg1, class508 arg2) {
        if (arg2.field6877 != null) {
            arg2.method2744((byte) -106);
        }
        if (arg1 == 2) {
            ++field6529;
            arg2.field6876 = arg0.field6876;
            arg2.field6877 = arg0;
            arg2.field6877.field6876 = arg2;
            arg2.field6876.field6877 = arg2;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Z", line = 91)
    public final boolean method392(byte arg0) {
        ++field6533;
        return !super.method392(arg0) ? false : super.field2604.method3368(1912, ((class452) super.field2603).field5795);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLac;)I", line = 102)
    public static final int method2667(boolean arg0, class307 arg1) {
        ++field6527;
        class586 var2 = arg1.field3902;
        if (var2.field8205 != null) {
            var2 = var2.method3220(-4261, class684.field9606);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field8187;
        class601 var4 = arg1.method3872(32195);
        if (!arg1.field9660) {
            if (~arg1.field9744 != ~var4.field8426 && ~arg1.field9744 != ~var4.field8425 && ~arg1.field9744 != ~var4.field8468 && arg1.field9744 != var4.field8457) {
                if (~arg1.field9744 == ~var4.field8428 || ~arg1.field9744 == ~var4.field8423 || ~arg1.field9744 == ~var4.field8439 || ~arg1.field9744 == ~var4.field8431) {
                    var3 = var2.field8220;
                }
            } else {
                var3 = var2.field8238;
            }
        } else {
            var3 = var2.field8231;
        }
        if (arg0) {
            field6537 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lpl;Lpl;Lbw;)V", line = 139)
    public class494(class612 arg0, class612 arg1, class452 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILkp;)V", line = 143)
    public static final void method2668(int arg0, class507 arg1) {
        if (arg0 != 18259) {
            method2666((class508) null, 62, (class508) null);
        }
        if (~arg1.field6735 == -6 && arg1.field6832 != -1) {
            class586.method3226(class32.field452, arg1, -124);
        }
        ++field6531;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZI)V", line = 159)
    public final void method1239(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = 33 % ((arg0 - 50) / 49);
        class32.field452.method978(arg1 + -2, arg3, super.field2603.field1621 + 4, super.field2603.field1617 + 2, ((class452) super.field2603).field5798, 0);
        ++field6530;
        class32.field452.method978(arg1 + -1, arg3 + 1, super.field2603.field1621 + 2, super.field2603.field1617, 0, 0);
    }
}
