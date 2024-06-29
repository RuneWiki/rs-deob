import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class508 {

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Lnga;")
    private class510 field7242 = new class510(64);

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "Lnga;")
    public class510 field7252 = new class510(50);

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "Lnga;")
    public class510 field7253 = new class510(5);

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Lcw;")
    public class179 field7240;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "Z")
    public boolean field7247;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Leq;")
    public class209 field7244;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Leq;")
    private class209 field7238;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Ldm;")
    public static class50 field7243 = null;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field7250 = 2;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public int field7254;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lgba;")
    public static class664 field7235;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method3031(int arg0) {
        field7235 = null;
        field7243 = null;
        if (arg0 != 50) {
            field7250 = -63;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public final void method3032(byte arg0) {
        class510 var2 = this.field7252;
        synchronized (this.field7252) {
            this.field7252.method3048(false);
        }
        field7246++;
        class510 var3 = this.field7253;
        synchronized (this.field7253) {
            this.field7253.method3048(false);
            if (arg0 > -65) {
                this.method3033((byte) 62);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public final void method3033(byte arg0) {
        class510 var2 = this.field7242;
        synchronized (this.field7242) {
            this.field7242.method3050(false);
        }
        field7248++;
        class510 var3 = this.field7252;
        synchronized (this.field7252) {
            this.field7252.method3050(false);
        }
        if (arg0 != 13) {
            this.method3033((byte) -44);
        }
        class510 var4 = this.field7253;
        synchronized (this.field7253) {
            this.field7253.method3050(false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIBZ)Lnl;")
    public static final class548 method3034(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field7236++;
        class548 var5 = new class548();
        var5.field7723 = arg1;
        var5.field7725 = arg0;
        class310.field4383.method4211(var5, (byte) 110, (long) arg2);
        class301.method1959(arg1, arg3 ^ 0x16);
        class50 var6 = class545.method3220(65535, arg2);
        if (var6 != null) {
            class262.method1776(arg3 - 22, var6);
        }
        if (arg3 != 22) {
            method3031(73);
        }
        if (field7243 != null) {
            class262.method1776(0, field7243);
            field7243 = null;
        }
        class740.method4118(true);
        if (var6 != null) {
            class756.method4196((byte) -62, !arg4, var6);
        }
        if (!arg4) {
            class357.method2231(arg1);
        }
        if (!arg4 && class401.field5610 != -1) {
            class425.method2588(1, -2, class401.field5610);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V")
    public final void method3035(byte arg0) {
        if (arg0 < 77) {
            this.field7240 = null;
        }
        class510 var2 = this.field7242;
        synchronized (this.field7242) {
            this.field7242.method3048(false);
        }
        field7249++;
        class510 var3 = this.field7252;
        synchronized (this.field7252) {
            this.field7252.method3048(false);
        }
        class510 var4 = this.field7253;
        synchronized (this.field7253) {
            this.field7253.method3048(false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
    public final void method3036(int arg0, int arg1) {
        class510 var3 = this.field7242;
        synchronized (this.field7242) {
            if (arg1 != 5) {
                return;
            }
            this.field7242.method3049(arg0, (byte) 126);
        }
        field7241++;
        class510 var4 = this.field7252;
        synchronized (this.field7252) {
            this.field7252.method3049(arg0, (byte) 126);
        }
        class510 var5 = this.field7253;
        synchronized (this.field7253) {
            this.field7253.method3049(arg0, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)V")
    public final void method3037(byte arg0, int arg1) {
        this.field7254 = arg1;
        field7251++;
        if (arg0 != 28) {
            this.method3033((byte) -50);
        }
        class510 var3 = this.field7252;
        synchronized (this.field7252) {
            this.field7252.method3048(false);
        }
        class510 var4 = this.field7253;
        synchronized (this.field7253) {
            this.field7253.method3048(false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lnp;")
    public final class488 method3038(int arg0, byte arg1) {
        field7237++;
        int var3 = -9 % ((-arg1 - 55) / 51);
        class510 var4 = this.field7242;
        class488 var5;
        synchronized (this.field7242) {
            var5 = (class488) this.field7242.method3054((byte) -97, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class209 var6 = this.field7238;
        byte[] var7;
        synchronized (this.field7238) {
            var7 = this.field7238.method1453(class464.method2816(-6273, arg0), 33, class409.method2499((byte) -125, arg0));
        }
        class488 var8 = new class488();
        var8.field6916 = arg0;
        var8.field6938 = this;
        if (var7 != null) {
            var8.method2930(-1776, new class35(var7));
        }
        var8.method2936(115);
        class510 var9 = this.field7242;
        synchronized (this.field7242) {
            this.field7242.method3047(false, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
    public final void method3039(int arg0, boolean arg1) {
        field7245++;
        if (arg1 == this.field7247) {
            return;
        }
        this.field7247 = arg1;
        this.method3035((byte) 84);
        if (arg0 != 64) {
            this.method3037((byte) 54, -86);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lcw;IZLeq;Leq;)V")
    public class508(class179 arg0, int arg1, boolean arg2, class209 arg3, class209 arg4) {
        this.field7240 = arg0;
        this.field7247 = arg2;
        this.field7244 = arg4;
        this.field7238 = arg3;
        if (this.field7238 != null) {
            int var6 = this.field7238.method1454(-1) - 1;
            this.field7238.method1477(0, var6);
        }
    }
}
