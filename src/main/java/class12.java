import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 extends class49 {

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "Lod;")
    public static class101 field238 = class46.method335(-72, "<img=1>");

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "Lod;")
    public static class101 field243 = class46.method335(-63, "Mem:");

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "Lod;")
    public static class101 field246 = class46.method335(-74, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "Lod;")
    public static class101 field240 = class46.method335(-113, "null");

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "Lod;")
    private static class101 field250 = class46.method335(-56, "Service unavailable)3");

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "Lod;")
    public static class101 field249 = class46.method335(90, "blinken2:");

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "Lod;")
    public static class101 field242 = field250;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!bd", name = "ib", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "Lt;")
    public static class132 field245;

    @OriginalMember(owner = "client!bd", name = "kb", descriptor = "Lc;")
    public static class15 field254;

    @OriginalMember(owner = "client!bd", name = "jb", descriptor = "[I")
    public static int[] field253;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Lqb;")
    public final class113 method88(byte arg0) {
        field247++;
        return arg0 == -93 ? class137.method1045((byte) -31, this.field241).method1201(this.field251, (byte) 117) : null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILqd;III)V")
    public static final void method89(int arg0, class115 arg1, int arg2, int arg3, int arg4) {
        field237++;
        if (class54.field1244 >= 400) {
            return;
        }
        if (arg1.field2555 != null) {
            arg1 = arg1.method879((byte) 75);
        }
        if (arg1 == null || !arg1.field2518) {
            return;
        }
        class101 var5 = arg1.field2556;
        if (arg1.field2548 != 0) {
            var5 = class15.method101(-25, new class101[] { var5, class153.method1187(arg1.field2548, class82.field1778.field265, (byte) -113), class119.field2628, class49.field1161, class82.method592(false, arg1.field2548), class53.field1214 });
        }
        if (~class49.field1158 == arg2) {
            class67.field1508++;
            class138.method1096(class15.method101(-15, new class101[] { class132.field3036, class1.field3, var5 }), class101.field2208, arg4, arg2 + 1, 1, arg3, arg0);
        } else if (!class106.field2292) {
            class101[] var6 = arg1.field2524;
            if (class120.field2645) {
                var6 = class26.method209(-8940, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method710(class112.field2400, 6587)) {
                        class75.field1607++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 13;
                        }
                        if (var7 == 1) {
                            var8 = 49;
                        }
                        if (var7 == 2) {
                            var8 = 44;
                        }
                        if (var7 == 3) {
                            var8 = 40;
                        }
                        if (var7 == 4) {
                            var8 = 45;
                        }
                        class138.method1096(class15.method101(79, new class101[] { class41.field998, var5 }), var6[var7], arg4, -1, var8, arg3, arg0);
                    }
                }
            }
            class64.field1454++;
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method710(class112.field2400, arg2 ^ 0xFFFFE645)) {
                        class142.field3262++;
                        int var10 = 0;
                        short var11 = 0;
                        if (arg1.field2548 > class82.field1778.field265) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = var11 + 13;
                        }
                        if (var9 == 1) {
                            var10 = var11 + 49;
                        }
                        if (var9 == 2) {
                            var10 = var11 + 44;
                        }
                        if (var9 == 3) {
                            var10 = var11 + 40;
                        }
                        if (var9 == 4) {
                            var10 = var11 + 45;
                        }
                        class138.method1096(class15.method101(-107, new class101[] { class41.field998, var5 }), var6[var9], arg4, -1, var10, arg3, arg0);
                    }
                }
            }
            class138.method1096(class15.method101(107, new class101[] { class41.field998, var5 }), class26.field694, arg4, -1, 1003, arg3, arg0);
            return;
        } else if ((class135.field3095 & 0x2) == 2) {
            class101.field2207++;
            class138.method1096(class15.method101(110, new class101[] { class15.field302, class1.field3, var5 }), class149.field3395, arg4, -1, 33, arg3, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
    public static void method90(byte arg0) {
        field240 = null;
        field249 = null;
        field238 = null;
        if (arg0 > -28) {
            method89(-109, null, 83, -21, 78);
        }
        field253 = null;
        field246 = null;
        field242 = null;
        field250 = null;
        field243 = null;
        field254 = null;
        field245 = null;
    }
}
