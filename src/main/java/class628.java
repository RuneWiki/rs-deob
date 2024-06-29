import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class628 {

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    private int field8705 = 0;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "Lvf;")
    private class136 field8710 = null;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    private int field8708 = 0;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    private int field8715 = 0;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "Llj;")
    private class565 field8709;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "Lud;")
    private class33 field8714;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "[Luc;")
    private class27[] field8706;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Leo;")
    public class268 field8703;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "Leg;")
    public static class93 field8698 = new class93();

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "J")
    public static long field8700;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "Lf;")
    public static class702 field8704;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BZIZII)V", line = 3)
    public final void method3508(byte arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field8712++;
        boolean var7 = arg1 & this.field8709.method88();
        if (arg0 != -100) {
            field8700 = -94L;
        }
        if (!var7 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
            if (arg4 == 4) {
                arg5 = arg2;
            }
            arg4 = 2;
        }
        if (arg4 != 0 && arg3) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (this.field8708 != arg4) {
            if (this.field8708 != 0) {
                this.field8706[this.field8708 & Integer.MAX_VALUE].method256((byte) 50);
            }
            if (arg4 != 0) {
                this.field8706[arg4 & Integer.MAX_VALUE].method258((byte) -82, arg3);
                this.field8706[Integer.MAX_VALUE & arg4].method263(arg3, arg0 + 108);
                this.field8706[Integer.MAX_VALUE & arg4].method261(arg2, arg5, 4);
            }
            this.field8715 = arg5;
            this.field8710 = null;
            this.field8705 = arg2;
            this.field8708 = arg4;
        } else if (this.field8708 != 0) {
            this.field8706[Integer.MAX_VALUE & this.field8708].method263(arg3, 8);
            if (this.field8705 != arg2 || this.field8715 != arg5) {
                this.field8706[this.field8708 & Integer.MAX_VALUE].method261(arg2, arg5, 4);
                this.field8715 = arg5;
                this.field8705 = arg2;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 58)
    public static final void method3509(int arg0) {
        class502.field6898.method3749(7648);
        field8701++;
        if (arg0 != -1) {
            method3511((byte) -118);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 75)
    public static final void method3510(String arg0, int arg1, int arg2, int arg3, String arg4, String arg5, String arg6) {
        class398.method2332(arg5, arg0, arg3, arg6, false, arg1, null, arg4, arg2);
        field8707++;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V", line = 85)
    public static final void method3511(byte arg0) {
        field8699++;
        int var1 = 0;
        if (class366.field4875.method3766(class503.field6917, (byte) -66)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class366.field4875.field9344) {
            var1 |= 0x40;
        }
        class684.method3873(var1, (byte) -19);
        class475.field6543.method2684((byte) -51, var1);
        class599.field8366.method3951(101, var1);
        class347.field4640.method2579(var1, 26447);
        class430.field5994.method1997(-20444, var1);
        class27.method264(var1, -5048);
        if (arg0 == -108) {
            class670.method3780(var1, false);
            class80.method628(var1, (byte) -26);
            class407.method2374(var1, -70);
            class115.method822(-113);
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Llj;)V", line = 223)
    public class628(class565 arg0) {
        this.field8709 = arg0;
        this.field8714 = new class33(arg0);
        this.field8706 = new class27[10];
        this.field8706[1] = new class557(arg0);
        this.field8706[2] = new class233(arg0, this.field8714);
        this.field8706[4] = new class620(arg0, this.field8714);
        this.field8706[5] = new class607(arg0, this.field8714);
        this.field8706[6] = new class436(arg0);
        this.field8706[7] = new class185(arg0);
        this.field8706[3] = this.field8703 = new class268(arg0);
        this.field8706[8] = new class183(arg0, this.field8714);
        this.field8706[9] = new class597(arg0, this.field8714);
        if (!this.field8706[8].method260(false)) {
            this.field8706[8] = this.field8706[4];
        }
        if (!this.field8706[9].method260(false)) {
            this.field8706[9] = this.field8706[8];
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)Z", line = 136)
    public final boolean method3512(int arg0, byte arg1) {
        if (arg1 != -40) {
            method3514(-57, (byte) 53);
        }
        field8716++;
        return this.field8706[arg0].method260(false);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)Z", line = 147)
    public static final boolean method3513(int arg0, int arg1, int arg2) {
        if (arg0 != 134) {
            method3514(-27, (byte) 110);
        }
        field8711++;
        return class649.method3659(arg1, arg2, (byte) -64) & class167.method1176((byte) -118, arg1, arg2);
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(IB)Z", line = 159)
    public static final boolean method3514(int arg0, byte arg1) {
        field8702++;
        if (arg0 == 6 || arg0 == 57 || arg0 == 10 || arg0 == 47 || arg0 == 49) {
            return true;
        } else if (arg0 == 22 || arg0 == 1012) {
            return true;
        } else {
            if (arg1 != 49) {
                field8700 = -111L;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lvf;IB)Z", line = 183)
    public final boolean method3515(class136 arg0, int arg1, byte arg2) {
        field8713++;
        if (this.field8708 == 0) {
            return false;
        }
        if (this.field8710 != arg0) {
            this.field8706[Integer.MAX_VALUE & this.field8708].method257(arg1, -10479, arg0);
            this.field8710 = arg0;
        }
        if (arg2 < 88) {
            method3513(-125, -123, 57);
        }
        return true;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V", line = 205)
    public static void method3516(byte arg0) {
        field8704 = null;
        if (arg0 < -119) {
            field8698 = null;
        }
    }
}
