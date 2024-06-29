import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class116 extends class218 {

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    private final int field2201;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    private final int field2202;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    private final int field2212;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    private final int field2205;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    private final int field2204;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    private final int field2214;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    private final int field2206;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    private final int field2211;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field2209 = 0;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "[J")
    public static long[] field2210 = new long[200];

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "Lph;")
    public static class166 field2208 = new class166(30);

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public static int field2216 = 0;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field2215 = 0;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field2218 = 0;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "Lig;")
    public static class93 field2219 = new class93(100);

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "Lvd;")
    public static class222 field2223 = class212.method1357(")2", 10731);

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "Lph;")
    public static class166 field2221 = new class166(50);

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "Lwd;")
    public static class232 field2224 = new class232(4096);

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "Lve;")
    public static class223 field2217;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "Lab;")
    public static class3 field2222;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
    public final void method433(int arg0, int arg1, int arg2) {
        ++field2207;
        if (arg0 != 71) {
            this.method434((byte) 108, 52, 38);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        ++field2203;
        int var4 = this.field2206 * arg0 >> 12;
        int var5 = this.field2214 * arg0 >> 12;
        int var6 = this.field2212 * arg1 >> 12;
        int var7 = this.field2204 * arg1 >> 12;
        if (arg2 != 59) {
            field2208 = null;
        }
        int var8 = this.field2211 * arg0 >> 12;
        int var9 = this.field2202 * arg1 >> 12;
        int var10 = this.field2201 * arg0 >> 12;
        int var11 = this.field2205 * arg1 >> 12;
        class191.method1195((byte) 112, var9, var4, var11, var5, var10, var8, var7, super.field4042, var6);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static final void method747(int arg0) {
        ++field2213;
        int var1 = class108.field1985 * 128 + 64;
        int var2 = class81.field1561 * 128 + 64;
        int var3 = class71.method482(var2, var1, class217.field4036, (byte) 118) - class225.field4211;
        if (~var1 < ~class211.field3923) {
            class211.field3923 += (-class211.field3923 + var1) * class161.field3072 / 1000 + class20.field473;
            if (~var1 > ~class211.field3923) {
                class211.field3923 = var1;
            }
        }
        if (class110.field2059 < var2) {
            class110.field2059 += class20.field473 - -((-class110.field2059 + var2) * class161.field3072 / 1000);
            if (~class110.field2059 < ~var2) {
                class110.field2059 = var2;
            }
        }
        if (class211.field3923 > var1) {
            class211.field3923 -= (-var1 + class211.field3923) * class161.field3072 / 1000 + class20.field473;
            if (~class211.field3923 > ~var1) {
                class211.field3923 = var1;
            }
        }
        if (~var2 > ~class110.field2059) {
            class110.field2059 -= class20.field473 - -((class110.field2059 - var2) * class161.field3072 / 1000);
            if (class110.field2059 < var2) {
                class110.field2059 = var2;
            }
        }
        int var4 = class212.field3944 * 128 + 64;
        int var5 = field2220 * 128 + 64;
        if (class118.field2243 < var3) {
            class118.field2243 += (-class118.field2243 + var3) * class161.field3072 / 1000 + class20.field473;
            if (var3 < class118.field2243) {
                class118.field2243 = var3;
            }
        }
        if (~class118.field2243 < ~var3) {
            class118.field2243 -= (-var3 + class118.field2243) * class161.field3072 / 1000 + class20.field473;
            if (~var3 < ~class118.field2243) {
                class118.field2243 = var3;
            }
        }
        int var6 = class71.method482(var4, var5, class217.field4036, (byte) 127) - class203.field3726;
        int var7 = -class118.field2243 + var6;
        int var8 = -class110.field2059 + var4;
        int var9 = -class211.field3923 + var5;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 2047;
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 2047;
        int var13 = -class54.field1021 + var12;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (~var13 > 1023) {
            var13 += 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (arg0 != 9187) {
            method747(126);
        }
        if (~var13 < -1) {
            class54.field1021 += class213.field3956 * var13 / 1000 + class233.field4357;
            class54.field1021 &= 2047;
        }
        if (var13 < 0) {
            class54.field1021 -= -var13 * class213.field3956 / 1000 + class233.field4357;
            class54.field1021 &= 2047;
        }
        if (~var11 < -384) {
            var11 = 383;
        }
        if (~class11.field213 > ~var11) {
            class11.field213 += class233.field4357 - -((var11 - class11.field213) * class213.field3956 / 1000);
            if (~var11 > ~class11.field213) {
                class11.field213 = var11;
            }
        }
        int var14 = var12 - class54.field1021;
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (class11.field213 > var11) {
            class11.field213 -= (-var11 + class11.field213) * class213.field3956 / 1000 + class233.field4357;
            if (class11.field213 < var11) {
                class11.field213 = var11;
            }
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || ~var14 < -1 && var13 < 0) {
            class54.field1021 = var12;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
    public static void method748(int arg0) {
        field2219 = null;
        if (arg0 != 1000) {
            method748(-101);
        }
        field2222 = null;
        field2224 = null;
        field2208 = null;
        field2223 = null;
        field2217 = null;
        field2221 = null;
        field2210 = null;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2201 = arg6;
        this.field2202 = arg7;
        this.field2212 = arg1;
        this.field2205 = arg5;
        this.field2204 = arg3;
        this.field2214 = arg2;
        this.field2206 = arg0;
        this.field2211 = arg4;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BII)V")
    public final void method434(byte arg0, int arg1, int arg2) {
        if (arg0 > 55) {
            ++field2200;
        }
    }
}
