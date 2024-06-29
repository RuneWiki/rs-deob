import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class253 extends class25 {

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field4401 = 0;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "Lcd;")
    public static class64 field4400 = class44.method335((byte) 71, "Fallen lassen");

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "[I")
    public static int[] field4398 = new int[128];

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Lqm;")
    public static class222 field4399;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "Lqm;")
    public static class222 field4413;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "Lqm;")
    public static class222 field4418;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "[I")
    public int[] field4402;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "[I")
    public int[] field4406;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "[I")
    public int[] field4414;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "[Llh;")
    public class22[] field4408;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "[Llh;")
    public class22[] field4419;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "[[[B")
    public byte[][][] field4404;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "[[[B")
    public static byte[][][] field4416;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)Lcd;", line = 5)
    public static final class64 method1809(boolean arg0, int arg1) {
        field4410++;
        if (arg0) {
            field4400 = (class64) null;
        }
        return class69.field1334[arg1].method540(28981) <= 0 ? class153.field2715[arg1] : class104.method768(new class64[] { class153.field2715[arg1], class261.field4493, class69.field1334[arg1] }, false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZIZI)Lqd;", line = 39)
    public static final class40 method1810(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field4409++;
        if (!arg2) {
            return (class40) null;
        }
        int var7 = (arg4 ? 65536 : 0) + (arg1 << 19) + (arg5 << 17) + arg0;
        long var8 = (long) arg3 * 3147483667L + (long) var7 * 3849834839L;
        class40 var10 = (class40) class280.field4824.method1194(var8, (byte) -122);
        if (var10 != null) {
            return var10;
        }
        class50.field815 = false;
        class40 var11 = class80.method621(arg3, false, arg4, arg0, arg5, arg1, -7026, false);
        if (var11 != null && !class50.field815) {
            class280.field4824.method1190(12669, var11, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 71)
    public static void method1811(int arg0) {
        int var1 = -7 / ((53 - arg0) / 46);
        field4398 = null;
        field4399 = null;
        field4413 = null;
        field4400 = null;
        field4416 = (byte[][][]) null;
        field4418 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JI)V", line = 104)
    public static final void method1812(long arg0, int arg1) {
        field4405++;
        if (arg0 == 0L) {
            return;
        }
        if (class61.field1194 >= 100) {
            class233.method1670(class114.field2103, class188.field3240, 0, (byte) -123);
            return;
        }
        class64 var3 = class99.method734(true, arg0).method510(arg1 ^ 0x6583);
        if (arg1 != -26074) {
            method1810(70, -5, true, 32, false, 59);
        }
        for (int var4 = 0; var4 < class61.field1194; var4++) {
            if (class173.field2981[var4] == arg0) {
                class233.method1670(class104.method768(new class64[] { var3, class196.field3346 }, false), class188.field3240, 0, (byte) -116);
                return;
            }
        }
        for (int var5 = 0; var5 < class202.field3453; var5++) {
            if (class47.field776[var5] == arg0) {
                class233.method1670(class104.method768(new class64[] { class138.field2452, var3, class315.field5346 }, false), class188.field3240, 0, (byte) -126);
                return;
            }
        }
        if (var3.method519((byte) 120, class139.field2472.field672)) {
            class233.method1670(class161.field2833, class188.field3240, 0, (byte) -121);
            return;
        }
        class173.field2981[class61.field1194] = arg0;
        class244.field4237++;
        class267.field4607[class61.field1194++] = class99.method734(true, arg0);
        class47.field781 = class238.field4039;
        class17.field353.method1214(-8, 91);
        class17.field353.method161((byte) 120, arg0);
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V", line = 168)
    public static final void method1813(int arg0) {
        field4417++;
        for (class55 var1 = (class55) class313.field5312.method778(arg0 + arg0); var1 != null; var1 = (class55) class313.field5312.method775(arg0 + 26517)) {
            if (var1.field923 == -1) {
                var1.field916 = 0;
                class140.method997(var1, -97);
            } else {
                var1.method232(arg0 + 128);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)V", line = 196)
    public static final void method1814(int arg0, int arg1, byte arg2) {
        int var3 = 0;
        if (arg2 > -14) {
            return;
        }
        while (class85.field1574 > var3) {
            class135 var4 = class42.method327((byte) -33, var3);
            if (var4 != null) {
                int var5 = var4.field2403;
                if (var5 >= 0 && !class50.field816.method669(var5, 0)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field2402 >= 0) {
                    int var6 = var4.field2402;
                    int var7 = (var6 & 0x7F) + arg1;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class50.field829[class197.method1383(2, var8, 96)];
                } else if (var5 >= 0) {
                    var9 = class50.field829[class197.method1383(2, class50.field816.method666(true, var5), 96)];
                } else if (var4.field2397 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field2397;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg0 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class50.field829[class197.method1383(2, var12, 96)];
                }
                class288.field4920[var3 + 1] = var9;
            }
            var3++;
        }
        field4412++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIII)I", line = 268)
    public static final int method1815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4407++;
        int var7 = arg5 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        if (arg2 != -18506) {
            method1812(84L, -89);
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg6;
        } else {
            return 7 + 1 - arg0 - arg3;
        }
    }
}
