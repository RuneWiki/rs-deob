import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 {

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lse;")
    private class124 field2214 = new class124();

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lqb;")
    private class109 field2217 = new class109();

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    private int field2235;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Laa;")
    private class2 field2222;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lrd;")
    private static class117 field2212 = class95.method812("Loading wordpack )2 ", (byte) 8);

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lrd;")
    public static class117 field2204 = field2212;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lmb;")
    public static class85 field2209 = new class85(100);

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lrd;")
    private static class117 field2220 = class95.method812("Username: ", (byte) 8);

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lrd;")
    public static class117 field2223 = class95.method812("Lade Freunde)2Liste)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "J")
    public static volatile long field2228 = 0L;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Z")
    public static boolean field2227 = false;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field2230 = -1;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lrd;")
    private static class117 field2219 = class95.method812("Loaded sprites", (byte) 8);

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Lrd;")
    public static class117 field2229 = field2219;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "Lrd;")
    private static class117 field2234 = class95.method812("Side panel redrawn", (byte) 8);

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Lrd;")
    public static class117 field2221 = class95.method812("Bitte versuchen Sie es in ", (byte) 8);

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field2236 = 0;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "Lrd;")
    public static class117 field2231 = class95.method812("Hierhin gehen", (byte) 8);

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "Lrd;")
    public static class117 field2233 = class95.method812("Handel)4Duell", (byte) 8);

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lrd;")
    public static class117 field2226 = field2220;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Ll;")
    public static class76 field2206;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[Lra;")
    public static class114[] field2208;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public final void method766(int arg0) {
        field2203++;
        while (true) {
            class124 var2 = this.field2217.method903(false);
            if (var2 == null) {
                if (arg0 != 5) {
                    field2220 = null;
                }
                this.field2218 = this.field2235;
                return;
            }
            var2.method691(arg0 ^ 0x5);
            var2.method1000(-114);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)V")
    public static final void method767(byte arg0, int arg1, int arg2) {
        class1 var3 = class105.field2631[class120.field2940][arg2][arg1];
        field2205++;
        if (var3 == null) {
            class90.field2308.method367(class120.field2940, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class135 var5 = (class135) var3.method3(false);
        class135 var6 = null;
        while (var5 != null) {
            class49 var12 = class108.method887(-1, var5.field3227);
            int var13 = var12.field1402;
            if (var12.field1432 == 1) {
                var13 = (var5.field3226 + 1) * var13;
            }
            if (var4 < var13) {
                var6 = var5;
                var4 = var13;
            }
            var5 = (class135) var3.method14(127);
        }
        if (var6 == null) {
            class90.field2308.method367(class120.field2940, arg2, arg1);
            return;
        }
        var3.method4(var6, false);
        class135 var7 = null;
        class135 var8 = (class135) var3.method3(false);
        class135 var9 = null;
        while (var8 != null) {
            if (var6.field3227 != var8.field3227) {
                if (var7 == null) {
                    var7 = var8;
                }
                if (var7.field3227 != var8.field3227 && var9 == null) {
                    var9 = var8;
                }
            }
            var8 = (class135) var3.method14(127);
        }
        int var10 = (arg1 << 7) + arg2 + 1610612736;
        class90.field2308.method366(class120.field2940, arg2, arg1, class133.method1091(class120.field2940, arg1 * 128 + 64, (byte) -125, arg2 * 128 + 64), var6, var10, var7, var9);
        int var11 = -42 / ((arg0 - 9) / 47);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method768(int arg0) {
        field2231 = null;
        field2212 = null;
        field2229 = null;
        field2234 = null;
        field2206 = null;
        field2208 = null;
        field2223 = null;
        field2226 = null;
        field2209 = null;
        field2220 = null;
        field2204 = null;
        field2221 = null;
        field2233 = null;
        field2219 = null;
        int var1 = -44 % ((-arg0 - 29) / 43);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
    public static final void method769(int arg0, int arg1) {
        field2207++;
        if (class52.field1464 == arg1) {
            return;
        }
        if (class52.field1464 == 0) {
            class124.method1001(56);
        }
        if (arg1 == 20 || arg1 == 40) {
            class144.field3542 = 0;
            class54.field1540 = 0;
            class110.field2762 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class35.field1040 != null) {
            class35.field1040.method755(-2);
            class35.field1040 = null;
        }
        if (class52.field1464 == 25 || class52.field1464 == 40) {
            class68.method668((byte) 68);
            class145.method1159();
        }
        if (class52.field1464 == 25) {
            class59.field1642 = 1;
            class59.field1637 = 0;
            class142.field3367 = 0;
            class1.field12 = 0;
            class90.field2306 = 1;
        }
        if (arg0 == arg1 || arg1 == 35) {
            class65.method650(-123);
            class63.method642(false);
            if (class101.field2512 == null) {
                class101.field2512 = class80.method749(765, -325, 503, class42.field1216);
            }
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class101.field2512 = null;
            class65.method650(-113);
            class16.method180(class83.field2162, class59.field1678, class42.field1216, (byte) 97);
        }
        if (arg1 == 25 || arg1 == 30 || arg1 == 40) {
            class101.field2512 = null;
            class63.method642(false);
            class111.method913(class42.field1216, class59.field1678, arg0 ^ 0xFFFFFFDD);
        }
        class109.field2727 = true;
        class52.field1464 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJ)V")
    public final void method770(int arg0, long arg1) {
        field2215++;
        if (arg0 != 20) {
            return;
        }
        class124 var4 = (class124) this.field2222.method20(arg1, true);
        if (var4 != null) {
            var4.method691(0);
            var4.method1000(111);
            this.field2218++;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public static final void method771(int arg0) {
        field2213++;
        class61.method623(false);
        if (class135.field3228 == 1) {
            class41.field1201[class38.field1097 / 100].method712(class99.field2458 - 12, class90.field2311 + -12);
        }
        if (class135.field3228 == 2) {
            class41.field1201[class38.field1097 / 100 + 4].method712(class99.field2458 - 12, class90.field2311 + -8 + -4);
        }
        if (class35.field1038 != -1) {
            class99.method840((byte) 41, class35.field1038);
            class84.method762(4, (byte) 104, 512, 334, class35.field1038, 0, 0);
        }
        if (arg0 < 10) {
            return;
        }
        if (class121.field2977 != -1) {
            class99.method840((byte) 41, class121.field2977);
            class84.method762(0, (byte) 96, 512, 334, class121.field2977, 0, 0);
        }
        class25.method262(-9493);
        if (!class15.field354) {
            class135.method1101((byte) -82);
            class58.method600(-3);
        } else if (client.field613 == 0) {
            class56.method593((byte) -89);
        }
        if (class18.field457 == 1) {
            field2206.method712(472, 296);
        }
        if (class32.field969) {
            short var1 = 507;
            byte var2 = 20;
            class54.field1533.method214(class18.method193(new class117[] { class120.field2938, class142.method1131(class137.field3300, true) }, 100), var1, var2, 16776960);
            Runtime var3 = Runtime.getRuntime();
            int var9 = var2 + 15;
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            int var5 = 16776960;
            if (var4 > 32768 && class68.field1925) {
                var5 = 16711680;
            }
            if (var4 > 65536 && !class68.field1925) {
                var5 = 16711680;
            }
            class54.field1533.method214(class18.method193(new class117[] { class41.field1200, class142.method1131(var4, true), class107.field2658 }, 62), var1, var9, var5);
            var9 += 15;
            if (class39.field1135) {
                class54.field1533.method214(field2234, var1, var9, 16711680);
                var9 += 15;
                class39.field1135 = false;
            }
            if (class59.field1653) {
                class54.field1533.method214(class140.field3332, var1, var9, 16711680);
                class59.field1653 = false;
                var9 += 15;
            }
            if (class58.field1617) {
                class54.field1533.method214(class13.field253, var1, var9, 16711680);
                class58.field1617 = false;
                var9 += 15;
            }
        }
        if (class35.field1025 == 0) {
            return;
        }
        int var6 = class35.field1025 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 >= 10) {
            class54.field1533.method215(class18.method193(new class117[] { class36.field1053, class142.method1131(var7, true), class144.field3537, class142.method1131(var8, true) }, 91), 4, 329, 16776960);
        } else {
            class54.field1533.method215(class18.method193(new class117[] { class36.field1053, class142.method1131(var7, true), class62.field1755, class142.method1131(var8, true) }, 60), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILwa;)V")
    public static final void method772(int arg0, class144 arg1) {
        field2211++;
        int var2 = arg1.field3441 >> 16;
        if (arg0 != -41) {
            method771(-128);
        }
        if (class56.field1553 == var2 || class94.field2352 == var2) {
            class18.field458 = true;
        }
        if (class27.field805 == var2 || class134.field3210[class101.field2518] == var2) {
            class13.field262 = true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(JBLse;)V")
    public final void method773(long arg0, byte arg1, class124 arg2) {
        if (this.field2218 == 0) {
            class124 var5 = this.field2217.method903(false);
            var5.method691(arg1 + 17);
            var5.method1000(-9);
            if (this.field2214 == var5) {
                class124 var6 = this.field2217.method903(false);
                var6.method691(0);
                var6.method1000(arg1 + 129);
            }
        } else {
            this.field2218--;
        }
        this.field2222.method18(arg2, arg0, arg1 ^ 0x10);
        this.field2217.method904((byte) 38, arg2);
        if (arg1 != -17) {
            field2229 = null;
        }
        field2216++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(JI)Lse;")
    public final class124 method774(long arg0, int arg1) {
        field2232++;
        class124 var4 = (class124) this.field2222.method20(arg0, true);
        if (arg1 != 329) {
            method772(58, null);
        }
        if (var4 != null) {
            this.field2217.method904((byte) 38, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
    public class85(int arg0) {
        this.field2235 = arg0;
        int var2 = 1;
        this.field2218 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field2222 = new class2(var2);
    }
}
