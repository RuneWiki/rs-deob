import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class377 {

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "[I")
    public static int[] field5369 = new int[1];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public int field5366;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field5368;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[Lwaa;")
    public class653[] field5365;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V", line = 13)
    public static final void method2267(int arg0, boolean arg1) {
        field5360++;
        class382 var2 = class341.field5007;
        synchronized (class341.field5007) {
            class341.field5007.method2290(arg1, arg0);
        }
        class382 var3 = class622.field8668;
        synchronized (class622.field8668) {
            class622.field8668.method2290(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lvq;ZI)V", line = 26)
    public static final void method2268(class425 arg0, boolean arg1, int arg2) {
        field5363++;
        int var3 = -1;
        if (!arg1) {
            method2268(null, false, 124);
        }
        int var4 = 0;
        if (arg0.field6169 > class564.field7962) {
            class135.method984(false, arg0);
        } else if (arg0.field6203 >= class564.field7962) {
            class515.method2946((byte) 18, arg0);
        } else {
            class666.method3682(false, (byte) -66, arg0);
            var3 = class132.field1954;
            var4 = class369.field5276;
        }
        if (arg0.field3024 < 512 || arg0.field3029 < 512 || arg0.field3024 >= (class199.field2812 - 1) * 512 || (class232.field3611 * 512 - 512) <= arg0.field3029) {
            arg0.field6172 = -1;
            var4 = 0;
            arg0.field6218 = -1;
            arg0.field6203 = 0;
            arg0.field6259 = null;
            var3 = -1;
            arg0.field6227 = -1;
            arg0.field6169 = 0;
            arg0.field3024 = arg0.field6271[0] * 512 + (arg0.method2553((byte) 127) * 256);
            arg0.field3029 = arg0.field6262[0] * 512 + (arg0.method2553((byte) 126) * 256);
            arg0.method2557(0);
        }
        if (class648.field9106 == arg0 && (arg0.field3024 < 6144 || arg0.field3029 < 6144 || (class199.field2812 - 12) * 512 <= arg0.field3024 || (class232.field3611 - 12) * 512 <= arg0.field3029)) {
            var4 = 0;
            arg0.field6203 = 0;
            arg0.field6227 = -1;
            arg0.field6172 = -1;
            arg0.field6218 = -1;
            arg0.field6259 = null;
            var3 = -1;
            arg0.field6169 = 0;
            arg0.field3024 = arg0.field6271[0] * 512 + arg0.method2553((byte) 93) * 256;
            arg0.field3029 = arg0.field6262[0] * 512 + (arg0.method2553((byte) 109) * 256);
            arg0.method2557(0);
        }
        int var5 = class700.method3902((byte) 103, arg0);
        class637.method3544(var5, (byte) -114, var3, arg0, var4);
        class633.method3534(arg0, var3, (byte) 120);
        class326.method2052(arg0, -1);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILrw;Lmo;)Lwaa;", line = 96)
    private final class653 method2269(int arg0, class703 arg1, class695 arg2) {
        if (arg0 != -5660) {
            method2267(-55, false);
        }
        field5364++;
        if (class573.field8065 == arg1) {
            return class612.method3419(109, arg2);
        } else if (class188.field2710 == arg1) {
            return class458.method2688(-104, arg2);
        } else if (class336.field4962 == arg1) {
            return class272.method1793(arg2, -62);
        } else if (class500.field7080 == arg1) {
            return class84.method744(arg2, true);
        } else if (class56.field1092 == arg1) {
            return class457.method2686(arg2, 22466);
        } else if (class224.field3167 == arg1) {
            return class640.method3564((byte) -108, arg2);
        } else if (class333.field4944 == arg1) {
            return class493.method2861(false, arg2);
        } else if (class224.field3156 == arg1) {
            return class641.method3573(arg2, arg0 + 5568);
        } else if (class701.field9907 == arg1) {
            return class206.method1369(arg2, (byte) -76);
        } else if (class548.field7699 == arg1) {
            return class30.method349(126, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 142)
    public static void method2270(boolean arg0) {
        field5369 = null;
        if (arg0) {
            method2268(null, false, 43);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILmo;)V", line = 153)
    public final void method2271(int arg0, class695 arg1) {
        this.field5366 = arg1.method3873(255);
        field5367++;
        this.field5368 = arg1.method3847((byte) 118);
        this.field5365 = new class653[arg1.method3826(false)];
        class703[] var3 = class406.method2461(false);
        for (int var4 = arg0; var4 < this.field5365.length; var4++) {
            this.field5365[var4] = this.method2269(-5660, var3[arg1.method3826(false)], arg1);
        }
    }
}
