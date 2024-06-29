import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class181 {

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "J")
    public long field3270 = 0L;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field3263 = -1;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lcc;")
    public static class209 field3261 = class95.method669(115, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "[J")
    public static long[] field3271 = new long[256];

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lcc;")
    public static class209 field3268 = class95.method669(118, "null");

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field3278 = -1;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Z")
    public static boolean field3284;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lpb;")
    public class126 field3265;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lpb;")
    public class126 field3269;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[[[B")
    public static byte[][][] field3264;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)I")
    public static final int method1237(byte arg0, int arg1) {
        field3276++;
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        int var7 = -90 % ((-arg0 - 34) / 35);
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method1238(int arg0) {
        field3261 = null;
        field3264 = null;
        field3268 = null;
        if (arg0 != -12136) {
            method1239((class126) null, 119, -127, -54);
        }
        field3271 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lpb;III)V")
    public static final void method1239(class126 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class56.field1154) {
            class109 var4 = class106.field2089[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2198 != null && var4.field2198.field4183.method909()) {
                arg0.method910(var4.field2198.field4183, 128, 0, 0, true);
            }
        }
        if (arg3 < class56.field1154) {
            class109 var5 = class106.field2089[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2198 != null && var5.field2198.field4183.method909()) {
                arg0.method910(var5.field2198.field4183, 0, 0, 128, true);
            }
        }
        if (arg2 < class56.field1154 && arg3 < class277.field4879) {
            class109 var6 = class106.field2089[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2198 != null && var6.field2198.field4183.method909()) {
                arg0.method910(var6.field2198.field4183, 128, 0, 128, true);
            }
        }
        if (arg2 < class56.field1154 && arg3 > 0) {
            class109 var7 = class106.field2089[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2198 != null && var7.field2198.field4183.method909()) {
                arg0.method910(var7.field2198.field4183, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLmh;)V")
    public static final void method1240(byte arg0, class151 arg1) {
        if (arg1.field2751 != null) {
            arg1.field2751.field483 = 0;
        }
        if (arg0 != -82) {
            method1239((class126) null, -12, -23, -60);
        }
        field3273++;
        arg1.field2754 = false;
        for (class151 var2 = arg1.method137(); var2 != null; var2 = arg1.method148()) {
            method1240((byte) -82, var2);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method1241(byte arg0) {
        field3272++;
        for (class111 var1 = (class111) class88.field1744.method1119(20896); var1 != null; var1 = (class111) class88.field1744.method1120(55)) {
            if (var1.field2238 > 0) {
                var1.field2238--;
            }
            if (var1.field2238 != 0) {
                if (var1.field2239 > 0) {
                    var1.field2239--;
                }
                if (var1.field2239 == 0 && var1.field2234 >= 1 && var1.field2243 >= 1 && var1.field2234 <= 102 && var1.field2243 <= 102 && (var1.field2232 < 0 || class56.method436((byte) 2, var1.field2232, var1.field2242))) {
                    class56.method443(var1.field2235, var1.field2242, var1.field2232, var1.field2234, var1.field2236, var1.field2249, 2, var1.field2243);
                    var1.field2239 = -1;
                    if (var1.field2232 == var1.field2231 && var1.field2231 == -1) {
                        var1.method269(-214950896);
                    } else if (var1.field2232 == var1.field2231 && var1.field2237 == var1.field2236 && var1.field2247 == var1.field2242) {
                        var1.method269(-214950896);
                    }
                }
            } else if (var1.field2231 < 0 || class56.method436((byte) 2, var1.field2231, var1.field2247)) {
                class56.method443(var1.field2235, var1.field2247, var1.field2231, var1.field2234, var1.field2237, var1.field2249, 2, var1.field2243);
                var1.method269(-214950896);
            }
        }
        if (arg0 <= 78) {
            method1239((class126) null, -50, -50, -118);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lsj;I)V")
    public static final void method1242(class49 arg0, int arg1) {
        if (arg1 != 1) {
            method1238(-69);
        }
        class81.field1536 = arg0;
        field3279++;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3271[var0] = var1;
        }
        field3282 = 0;
        field3283 = 0;
        field3284 = false;
    }
}
