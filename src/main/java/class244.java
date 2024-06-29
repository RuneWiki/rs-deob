import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class244 extends class476 {

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
    public static int[] field3610 = new int[2048];

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "[F")
    public static float[] field3617 = new float[16];

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lho;")
    private class318 field3607;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "[[[B")
    public static byte[][][] field3608;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([BB)[B", line = 8)
    public static final byte[] method1630(byte[] arg0, byte arg1) {
        ++field3611;
        class511 var2 = new class511(arg0);
        if (arg1 != -23) {
            return null;
        } else {
            int var3 = var2.method3013(27);
            int var4 = var2.method3008(64);
            if (var4 < 0 || ~class111.field1359 != -1 && ~var4 < ~class111.field1359) {
                throw new RuntimeException();
            } else if (var3 == 0) {
                byte[] var8 = new byte[var4];
                var2.method3014(var4, var8, 75212712, 0);
                return var8;
            } else {
                int var5 = var2.method3008(arg1 ^ -87);
                if (var5 >= 0 && (~class111.field1359 == -1 || ~class111.field1359 <= ~var5)) {
                    byte[] var6 = new byte[var5];
                    if (var3 != 1) {
                        class342 var7 = class499.field6836;
                        synchronized (class499.field6836) {
                            class499.field6836.method2170(var2, var6, -105);
                        }
                    } else {
                        class38.method299(var6, var5, arg0, var4, 9);
                    }
                    return var6;
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)V", line = 67)
    public static final void method1631(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == -26) {
            ++field3614;
            class17 var4 = class245.method1634(1, (long) arg3, 11);
            var4.method66((byte) -123);
            var4.field107 = arg1;
            var4.field104 = arg0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 82)
    public final void method938(int arg0) {
        if (arg0 > 61) {
            super.method938(110);
            ++field3613;
            this.field3607 = class772.method4269(12, ((class713) super.field6598).field9922, super.field6603);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZII)V", line = 101)
    public final void method997(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3616;
        int var5 = this.method2838(true) * super.field6598.field5723 / 10000;
        int[] var6 = new int[4];
        class111.field1332.method160(var6);
        class111.field1332.method225(arg0, arg2 + 2, arg0 + var5, super.field6598.field5722 + arg2);
        this.field3607.method2031(arg0, arg2 + 2, super.field6598.field5723, super.field6598.field5722);
        int var7 = 62 / ((arg3 - -12) / 34);
        class111.field1332.method225(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)Z", line = 121)
    public final boolean method941(byte arg0) {
        ++field3606;
        return !super.method941(arg0) ? false : super.field6603.method1860(((class713) super.field6598).field9922, (byte) 124);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIZ)V", line = 133)
    public final void method995(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 != -29993) {
            this.field3607 = null;
        }
        class111.field1332.method171(arg1 + -2, arg2, super.field6598.field5723 - -4, super.field6598.field5722 - -2, ((class713) super.field6598).field9925, 0);
        ++field3609;
        class111.field1332.method171(arg1 + -1, arg2 + 1, super.field6598.field5723 + 2, super.field6598.field5722, 0, 0);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lgga;I)Lss;", line = 148)
    public static final class306 method1632(class511 arg0, int arg1) {
        if (arg1 <= 40) {
            return null;
        } else {
            ++field3615;
            return new class306(arg0.method3034(1), arg0.method3034(1), arg0.method3034(1), arg0.method3034(1), arg0.method2983(true), arg0.method3013(-5));
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lae;Lae;Lrl;)V", line = 162)
    public class244(class283 arg0, class283 arg1, class713 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V", line = 168)
    public static void method1633(int arg0) {
        field3617 = null;
        field3610 = null;
        field3608 = null;
        if (arg0 != 2048) {
            field3618 = -100;
        }
    }
}
