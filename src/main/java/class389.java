import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class389 {

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public int field5307 = -1;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public int field5308 = -1;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "[I")
    public int[] field5306;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLbg;I)V", line = 12)
    public final void method2413(byte arg0, class242 arg1, int arg2) {
        field5300++;
        while (true) {
            int var4 = arg1.method1563(-128);
            if (var4 == 0) {
                int var5 = 14 % ((-arg0 - 75) / 37);
                return;
            }
            this.method2414(arg1, false, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lbg;ZII)V", line = 34)
    private final void method2414(class242 arg0, boolean arg1, int arg2, int arg3) {
        field5304++;
        if (arg1) {
            this.field5307 = 36;
        }
        if (arg2 == 1) {
            this.field5307 = arg0.method1587((byte) -102);
        } else if (arg2 == 2) {
            this.field5306 = new int[arg0.method1563(-128)];
            for (int var5 = 0; var5 < this.field5306.length; var5++) {
                this.field5306[var5] = arg0.method1587((byte) -102);
            }
        } else if (arg2 == 3) {
            this.field5308 = arg0.method1563(-128);
            return;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIILjg;B)V", line = 67)
    public static final void method2415(int arg0, int arg1, int arg2, int arg3, class237 arg4, byte arg5) {
        field5302++;
        if (arg4.field3125 == -1 && arg4.field3117 == null) {
            return;
        }
        int var6 = 0;
        if (arg2 > arg4.field3122) {
            var6 += arg2 - arg4.field3122;
        } else if (arg4.field3114 > arg2) {
            var6 += arg4.field3114 - arg2;
        }
        int var7 = class330.field4500 * arg4.field3107 >> 8;
        if (arg4.field3124 < arg3) {
            var6 += arg3 - arg4.field3124;
        } else if (arg4.field3112 > arg3) {
            var6 += arg4.field3112 - arg3;
        }
        if (arg4.field3120 == 0 || arg4.field3120 < var6 - 64 || class330.field4500 == 0 || arg4.field3123 != arg1) {
            if (arg4.field3116 != null) {
                class352.field4781.method1866(arg4.field3116);
                arg4.field3116 = null;
            }
            if (arg4.field3108 != null) {
                class352.field4781.method1866(arg4.field3108);
                arg4.field3108 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field3120 - var6) * var7 / arg4.field3120;
        if (arg5 < 40) {
            field5303 = 75;
        }
        if (arg4.field3116 != null) {
            arg4.field3116.method489(var8);
        } else if (arg4.field3125 >= 0) {
            class417 var9 = class417.method2566(class349.field4759, arg4.field3125, 0);
            if (var9 != null) {
                class159 var10 = var9.method2565().method1017(class265.field3418);
                class77 var11 = class77.method496(var10, 100, var8);
                var11.method488(-1);
                class352.field4781.method1869(var11);
                arg4.field3116 = var11;
            }
        }
        if (arg4.field3108 != null) {
            arg4.field3108.method489(var8);
            if (arg4.field3108.method262((byte) 48)) {
                return;
            }
            arg4.field3108 = null;
        } else if (arg4.field3117 != null && (arg4.field3106 -= arg0) <= 0) {
            int var12 = (int) (Math.random() * (double) arg4.field3117.length);
            class417 var13 = class417.method2566(class349.field4759, arg4.field3117[var12], 0);
            if (var13 != null) {
                class159 var14 = var13.method2565().method1017(class265.field3418);
                class77 var15 = class77.method496(var14, 100, var8);
                var15.method488(0);
                class352.field4781.method1869(var15);
                arg4.field3106 = arg4.field3119 + (int) ((double) (arg4.field3121 - arg4.field3119) * Math.random());
                arg4.field3108 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)I", line = 193)
    public static final int method2416(int arg0) {
        if (arg0 != 32364) {
            method2415(64, 56, -3, -110, (class237) null, (byte) -52);
        }
        field5305++;
        return ((class96.field1136 == 0 ? 0 : 1) << 20) + ((class252.field3298 ? 1 : 0) << 13) + ((class333.field4548 & 0x3) << 11) + ((class194.field2296 ? 1 : 0) << 10) + ((class275.field3557 ? 1 : 0) << 9) + ((class40.field482 ? 1 : 0) << 8) + ((class147.field1727 ? 1 : 0) << 4) + ((class270.field3485 ? 1 : 0) << 3) + (class2.field18 & 0x7) + ((class167.field1948 ? 1 : 0) << 5) + ((class341.field4646 ? 1 : 0) << 6) + ((class183.field2125 ? 1 : 0) << 15) + ((class20.field211 ? 1 : 0) << 16) + (class276.field3580 << 17) + ((class373.field5049 ? 1 : 0) << 19) + ((class162.field1895 == 0 ? 0 : 1) << 21) + (((class330.field4500 == 0 ? 0 : 1) << 22) - -(class184.method1148((byte) 39) << 23) - (-(class403.field5601 << 25) + -((class362.field4906 ? 1 : 0) << 27)) - -(class121.field1382 << 28));
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Laq;I)Laq;", line = 210)
    public static final class453 method2417(class453 arg0, int arg1) {
        field5301++;
        if (arg0.field6462 != -1) {
            return class195.method1212(arg0.field6462, (byte) 49);
        }
        int var2 = arg0.field6475 >>> 16;
        class196 var3 = new class196(class282.field3678);
        class244 var4 = (class244) var3.method1216(-123);
        if (arg1 < 87) {
            field5303 = -104;
        }
        while (var4 != null) {
            if (var4.field3245 == var2) {
                return class195.method1212((int) var4.field505, (byte) 49);
            }
            var4 = (class244) var3.method1217((byte) 49);
        }
        return null;
    }
}
