import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class272 extends class478 {

    @OriginalMember(owner = "client!caa", name = "q", descriptor = "I")
    private int field4100;

    @OriginalMember(owner = "client!caa", name = "r", descriptor = "I")
    private int field4101;

    @OriginalMember(owner = "client!caa", name = "u", descriptor = "I")
    private int field4104;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
    private int field4095;

    @OriginalMember(owner = "client!caa", name = "s", descriptor = "[F")
    public static float[] field4102 = new float[4];

    @OriginalMember(owner = "client!caa", name = "t", descriptor = "I")
    public static int field4103 = 0;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!caa", name = "p", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "[Lf;")
    public static class702[] field4093;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lmo;I)Lnd;")
    public static final class504 method1793(class695 arg0, int arg1) {
        if (arg1 > -42) {
            return null;
        } else {
            ++field4094;
            int var2 = arg0.method3826(false);
            class109 var3 = class192.method1294(-11879)[arg0.method3826(false)];
            class630 var4 = class257.method1709(109)[arg0.method3826(false)];
            int var5 = arg0.method3814(false);
            int var6 = arg0.method3814(false);
            int var7 = arg0.method3847((byte) 118);
            int var8 = arg0.method3847((byte) 118);
            int var9 = arg0.method3880(8);
            int var10 = arg0.method3880(8);
            int var11 = arg0.method3880(8);
            boolean var12 = ~arg0.method3826(false) == -2;
            return new class504(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public static final void method1794(int arg0) {
        ++field4097;
        if (class245.field3797) {
            class49 var1 = class639.method3557(class19.field223, class189.field2716, 1);
            if (var1 != null && var1.field896 != null) {
                class14 var2 = new class14();
                var2.field122 = var1.field896;
                var2.field129 = var1;
                class220.method1443(var2);
            }
            if (arg0 <= 100) {
                method1795(84, (byte) 50, -101);
            }
            class190.field2750 = -1;
            class654.field9181 = -1;
            class245.field3797 = false;
            if (var1 != null) {
                class563.method3215(true, var1);
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(IBI)Z")
    public static final boolean method1795(int arg0, byte arg1, int arg2) {
        ++field4091;
        int var3 = 49 / ((arg1 - 42) / 33);
        return class156.method1088(arg0, -17, arg2) || class328.method2064(arg2, arg0, 128);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)V")
    public final void method1340(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field4093 = null;
        }
        ++field4096;
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)V")
    public static void method1796(byte arg0) {
        field4102 = null;
        if (arg0 > 9) {
            field4093 = null;
        }
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(III)Z")
    public static final boolean method1797(int arg0, int arg1, int arg2) {
        if (arg0 != 544) {
            method1797(96, -77, -46);
        }
        ++field4092;
        return (24 & arg2) != 0 | (arg2 & 544) == 544;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IBI)V")
    public final void method1343(int arg0, byte arg1, int arg2) {
        ++field4099;
        if (arg1 != 56) {
            method1795(-31, (byte) 3, -85);
        }
        int var4 = this.field4104 * arg2 >> 12;
        int var5 = this.field4100 * arg2 >> 12;
        int var6 = this.field4101 * arg0 >> 12;
        int var7 = this.field4095 * arg0 >> 12;
        class195.method1320(var7, var5, true, var4, super.field6796, var6);
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(IIIIIII)V")
    public class272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4100 = arg2;
        this.field4101 = arg1;
        this.field4104 = arg0;
        this.field4095 = arg3;
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(III)V")
    public final void method1339(int arg0, int arg1, int arg2) {
        ++field4090;
        int var4 = this.field4104 * arg0 >> 12;
        int var5 = this.field4100 * arg0 >> 12;
        int var6 = this.field4101 * arg2 >> 12;
        int var7 = this.field4095 * arg2 >> 12;
        class355.method2170(super.field6794, var7, super.field6796, arg1 ^ -2, var6, super.field6795, var4, var5);
        if (arg1 != 0) {
            method1797(-1, -40, 18);
        }
    }
}
