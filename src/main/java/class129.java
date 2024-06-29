import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class129 {

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public int field2273;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "[S")
    public short[] field2277;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[Lcf;")
    public class93[] field2260;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "[S")
    public short[] field2265;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "[B")
    public byte[] field2259;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "[I")
    public int[] field2276;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lcf;")
    private static class93 field2262 = class147.method1066("wave2:", -48);

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lcf;")
    public static class93 field2267 = field2262;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field2270 = 0;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Lcf;")
    public static class93 field2268 = class147.method1066("unzap", -48);

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lcf;")
    public static class93 field2266 = field2262;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field2275 = 0;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Lnh;")
    public static class54 field2272 = new class54(260);

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Lcf;")
    private static class93 field2280 = class147.method1066("Hidden", -48);

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "Lcf;")
    public static class93 field2278 = field2280;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
    public final boolean method936(int arg0, int arg1) {
        if (arg1 == 0) {
            field2261++;
            return (this.field2259[arg0] & 0x10) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
    public static final void method937(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class170.field3002; var3++) {
            for (int var4 = 0; var4 < class210.field3821; var4++) {
                for (int var5 = 0; var5 < class256.field4623; var5++) {
                    class41 var6 = class232.field4138[var3][var4][var5];
                    if (var6 != null) {
                        class70 var7 = var6.field643;
                        if (var7 != null && var7.field1269.method444()) {
                            class279.method1868(var7.field1269, var3, var4, var5, 1, 1);
                            if (var7.field1274 != null && var7.field1274.method444()) {
                                class279.method1868(var7.field1274, var3, var4, var5, 1, 1);
                                var7.field1269.method432(var7.field1274, 0, 0, 0, false);
                                var7.field1274 = var7.field1274.method437(arg0, arg1, arg2);
                            }
                            var7.field1269 = var7.field1269.method437(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field645; var8++) {
                            class229 var10 = var6.field637[var8];
                            if (var10 != null && var10.field4104.method444()) {
                                class279.method1868(var10.field4104, var3, var4, var5, var10.field4100 + 1 - var10.field4095, var10.field4110 - var10.field4099 + 1);
                                var10.field4104 = var10.field4104.method437(arg0, arg1, arg2);
                            }
                        }
                        class30 var9 = var6.field652;
                        if (var9 != null && var9.field459.method444()) {
                            class94.method692(var9.field459, var3, var4, var5);
                            var9.field459 = var9.field459.method437(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Lee;")
    public static final class280 method938(byte arg0) {
        field2263++;
        class280 var1 = new class280(34);
        var1.method1916(11, 92);
        var1.method1916(class66.field1216, 75);
        var1.method1916(class152.field2658 ? 1 : 0, 98);
        var1.method1916(class170.field3000 ? 1 : 0, 81);
        var1.method1916(class154.field2704 ? 1 : 0, 64);
        var1.method1916(class46.field739 ? 1 : 0, 91);
        var1.method1916(class230.field4124 ? 1 : 0, 104);
        var1.method1916(class280.field5059 ? 1 : 0, 117);
        var1.method1916(class119.field2117 ? 1 : 0, 90);
        var1.method1916(class154.field2697 ? 1 : 0, 103);
        var1.method1916(class280.field5052, 121);
        int var2 = -126 % ((arg0 + 65) / 36);
        var1.method1916(class235.field4195 ? 1 : 0, 68);
        var1.method1916(class110.field1876 ? 1 : 0, 73);
        var1.method1916(class207.field3717 ? 1 : 0, 97);
        var1.method1916(class154.field2699, 122);
        var1.method1916(class161.field2832 ? 1 : 0, 72);
        var1.method1916(class267.field4756, 69);
        var1.method1916(class195.field3552, 117);
        var1.method1916(class143.field2480, 126);
        var1.method1908(-120, class46.field748);
        var1.method1908(-116, class48.field772);
        var1.method1916(class91.method628(), 99);
        var1.method1886(class133.field2340, 2);
        var1.method1916(class180.field3168, 95);
        var1.method1916(class193.field3539 ? 1 : 0, 71);
        var1.method1916(class223.field4026 ? 1 : 0, 65);
        var1.method1916(class66.field1219, 90);
        var1.method1916(class152.field2678 ? 1 : 0, 92);
        var1.method1916(class42.field667 ? 1 : 0, 75);
        return var1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIZI)I")
    public static final int method939(int arg0, int arg1, boolean arg2, int arg3) {
        field2271++;
        if ((class4.field53[arg1][arg0][arg3] & 0x8) == 0) {
            if (arg2) {
                field2270 = -111;
            }
            return arg1 <= 0 || (class4.field53[1][arg0][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)I")
    public final int method940(int arg0, byte arg1) {
        if (arg1 != -112) {
            this.method936(-23, 24);
        }
        field2264++;
        return this.field2259[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static void method941(boolean arg0) {
        field2272 = null;
        field2267 = null;
        field2280 = null;
        field2268 = null;
        field2262 = null;
        if (!arg0) {
            field2266 = null;
            field2278 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Z")
    public static final boolean method942(int arg0) {
        field2274++;
        if (arg0 < 78) {
            return true;
        }
        if (class234.field4186) {
            try {
                if ((Boolean) class238.field4253.method646(class169.field2967.field5113, 0)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)Z")
    public final boolean method943(int arg0, int arg1) {
        if (arg0 > -47) {
            return true;
        } else {
            field2258++;
            return (this.field2259[arg1] & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
    public class129(int arg0) {
        this.field2273 = arg0;
        this.field2277 = new short[this.field2273];
        this.field2260 = new class93[this.field2273];
        this.field2265 = new short[this.field2273];
        this.field2259 = new byte[this.field2273];
        this.field2276 = new int[this.field2273];
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Z")
    public final boolean method944(boolean arg0, int arg1) {
        field2269++;
        if (arg0) {
            return false;
        } else {
            return (this.field2259[arg1] & 0x4) != 0;
        }
    }
}
