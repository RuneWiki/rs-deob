import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class102 extends class19 {

    @OriginalMember(owner = "client!ld", name = "qc", descriptor = "Lea;")
    private static class38 field2274 = class9.method46((byte) 111, "Aug");

    @OriginalMember(owner = "client!ld", name = "tc", descriptor = "Lea;")
    public static class38 field2277 = class9.method46((byte) 101, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!ld", name = "Dc", descriptor = "Lea;")
    private static class38 field2287 = class9.method46((byte) 106, "Nov");

    @OriginalMember(owner = "client!ld", name = "vc", descriptor = "Lea;")
    private static class38 field2279 = class9.method46((byte) 117, "Mar");

    @OriginalMember(owner = "client!ld", name = "rc", descriptor = "Lea;")
    private static class38 field2275 = class9.method46((byte) 114, "Jun");

    @OriginalMember(owner = "client!ld", name = "Hc", descriptor = "[Z")
    public static boolean[] field2291 = new boolean[100];

    @OriginalMember(owner = "client!ld", name = "Jc", descriptor = "I")
    public static int field2293 = 2301979;

    @OriginalMember(owner = "client!ld", name = "Bc", descriptor = "I")
    public static int field2285 = 1;

    @OriginalMember(owner = "client!ld", name = "Gc", descriptor = "Lea;")
    private static class38 field2290 = class9.method46((byte) 126, "Sep");

    @OriginalMember(owner = "client!ld", name = "Ec", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!ld", name = "uc", descriptor = "Lea;")
    private static class38 field2278 = class9.method46((byte) 123, "May");

    @OriginalMember(owner = "client!ld", name = "xc", descriptor = "Lea;")
    private static class38 field2281 = class9.method46((byte) 119, "Feb");

    @OriginalMember(owner = "client!ld", name = "Pc", descriptor = "Lea;")
    private static class38 field2299 = class9.method46((byte) 122, "Loaded input handler");

    @OriginalMember(owner = "client!ld", name = "Cc", descriptor = "Lea;")
    private static class38 field2286 = class9.method46((byte) 101, "Dec");

    @OriginalMember(owner = "client!ld", name = "wc", descriptor = "Lea;")
    private static class38 field2280 = class9.method46((byte) 110, "Apr");

    @OriginalMember(owner = "client!ld", name = "zc", descriptor = "Lea;")
    private static class38 field2283 = class9.method46((byte) 111, "Jan");

    @OriginalMember(owner = "client!ld", name = "Lc", descriptor = "Lea;")
    private static class38 field2295 = class9.method46((byte) 103, "Jul");

    @OriginalMember(owner = "client!ld", name = "Mc", descriptor = "I")
    public static int field2296 = 0;

    @OriginalMember(owner = "client!ld", name = "Nc", descriptor = "Lea;")
    public static class38 field2297 = class9.method46((byte) 113, "Texturen geladen)3");

    @OriginalMember(owner = "client!ld", name = "sc", descriptor = "Lea;")
    private static class38 field2276 = class9.method46((byte) 126, "Oct");

    @OriginalMember(owner = "client!ld", name = "Kc", descriptor = "[Lea;")
    public static class38[] field2294 = new class38[] { field2283, field2281, field2279, field2280, field2278, field2275, field2295, field2274, field2290, field2276, field2287, field2286 };

    @OriginalMember(owner = "client!ld", name = "Sc", descriptor = "Lea;")
    public static class38 field2302 = field2299;

    @OriginalMember(owner = "client!ld", name = "Qc", descriptor = "I")
    public static int field2300 = 0;

    @OriginalMember(owner = "client!ld", name = "yc", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ld", name = "Ac", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ld", name = "Fc", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ld", name = "Ic", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ld", name = "Rc", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!ld", name = "Oc", descriptor = "Lr;")
    public class152 field2298;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)Z")
    public final boolean method108(int arg0) {
        ++field2282;
        if (arg0 != 20542) {
            return false;
        } else {
            return this.field2298 != null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(Z)Lrg;")
    public final class159 method220(boolean arg0) {
        ++field2292;
        if (this.field2298 == null) {
            return null;
        } else {
            class140 var2 = ~super.field395 != 0 && super.field429 == 0 ? class139.method997(-38, super.field395) : null;
            if (!arg0) {
                field2302 = null;
            }
            class140 var3 = super.field387 == -1 || ~super.field441 == ~super.field387 && var2 != null ? null : class139.method997(-51, super.field387);
            class159 var4 = this.field2298.method1064(var3, var2, super.field417, super.field378, (byte) -93);
            if (var4 == null) {
                return null;
            } else {
                var4.method1151();
                super.field431 = var4.field1328;
                if (~super.field376 != 0 && super.field394 != -1) {
                    class159 var5 = class177.method1224((byte) 97, super.field376).method1304(super.field394, true);
                    if (var5 != null) {
                        var5.method1144(0, -super.field433, 0);
                        var4 = var4.method349(var5);
                    }
                }
                if (~this.field2298.field3173 == -2) {
                    var4.field3335 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)I")
    public static int method836(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)I")
    public static final int method837(byte arg0) {
        if (arg0 != 41) {
            return -1;
        } else {
            int var1 = 3;
            if (class144.field2998 < 310) {
                int var2 = class50.field1243 >> 7;
                int var3 = class42.field925 >> 7;
                int var4 = class195.field3842.field406 >> 7;
                int var5 = class195.field3842.field382 >> 7;
                if ((class3.field104[class10.field224][var2][var3] & 4) != 0) {
                    var1 = class10.field224;
                }
                int var6;
                if (var4 <= var2) {
                    var6 = -var4 + var2;
                } else {
                    var6 = var4 - var2;
                }
                int var7;
                if (var3 >= var5) {
                    var7 = -var5 + var3;
                } else {
                    var7 = var5 - var3;
                }
                if (var7 < var6) {
                    int var8 = 32768;
                    int var9 = var7 * 65536 / var6;
                    while (~var2 != ~var4) {
                        if (~var4 < ~var2) {
                            ++var2;
                        } else if (var4 < var2) {
                            --var2;
                        }
                        var8 += var9;
                        if (~(4 & class3.field104[class10.field224][var2][var3]) != -1) {
                            var1 = class10.field224;
                        }
                        if (var8 >= 65536) {
                            var8 -= 65536;
                            if (~var3 <= ~var5) {
                                if (~var5 > ~var3) {
                                    --var3;
                                }
                            } else {
                                ++var3;
                            }
                            if (~(class3.field104[class10.field224][var2][var3] & 4) != -1) {
                                var1 = class10.field224;
                            }
                        }
                    }
                } else {
                    int var10 = 32768;
                    int var11 = var6 * 65536 / var7;
                    while (var3 != var5) {
                        var10 += var11;
                        if (~var3 <= ~var5) {
                            if (var3 > var5) {
                                --var3;
                            }
                        } else {
                            ++var3;
                        }
                        if ((4 & class3.field104[class10.field224][var2][var3]) != 0) {
                            var1 = class10.field224;
                        }
                        if (~var10 <= -65537) {
                            var10 -= 65536;
                            if (var4 > var2) {
                                ++var2;
                            } else if (var2 > var4) {
                                --var2;
                            }
                            if (~(4 & class3.field104[class10.field224][var2][var3]) != -1) {
                                var1 = class10.field224;
                            }
                        }
                    }
                }
            }
            if ((4 & class3.field104[class10.field224][class195.field3842.field406 >> 7][class195.field3842.field382 >> 7]) != 0) {
                var1 = class10.field224;
            }
            ++field2289;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "(I)V")
    public static void method838(int arg0) {
        field2280 = null;
        field2277 = null;
        field2295 = null;
        field2274 = null;
        field2291 = null;
        if (arg0 != 1954378439) {
            field2275 = null;
        }
        field2286 = null;
        field2302 = null;
        field2287 = null;
        field2278 = null;
        field2299 = null;
        field2283 = null;
        field2290 = null;
        field2297 = null;
        field2275 = null;
        field2281 = null;
        field2276 = null;
        field2294 = null;
        field2279 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lea;ILea;B)V")
    public static final void method839(class38 arg0, int arg1, class38 arg2, byte arg3) {
        class101.method830(arg0, arg1, 38, arg2, (class38) null);
        ++field2284;
        int var4 = 85 % ((arg3 - 32) / 37);
    }
}
