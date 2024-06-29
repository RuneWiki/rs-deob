import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class89 {

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    private int field2266;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    private int field2265;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[[I")
    private int[][] field2271;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lhb;")
    public static class44 field2269 = class102.method810("mapscene", -28606);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lhb;")
    private static class44 field2259 = class102.method810("skill)2", -28606);

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2263 = 0;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lhb;")
    public static class44 field2262 = field2259;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lhb;")
    public static class44 field2275 = class102.method810("Ihr Spielkonto wird bereits benutzt)3", -28606);

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lhb;")
    private static class44 field2264 = class102.method810("Enter object name", -28606);

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lhb;")
    public static class44 field2277 = class102.method810("Regelversto-8 melden", -28606);

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "Lhb;")
    public static class44 field2280 = field2264;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "Lhb;")
    public static class44 field2278 = class102.method810("Sie haben gerade eine andere Welt verlassen)3", -28606);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lfc;")
    public static class34 field2258 = new class34(30);

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "Lhb;")
    public static class44 field2286 = class102.method810("", -28606);

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field2287 = 0;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "Lhb;")
    public static class44 field2284 = field2286;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "Lhb;")
    public static class44 field2285 = field2286;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "Lhb;")
    public static class44 field2282 = field2286;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "Lhb;")
    public static class44 field2290 = field2286;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "Lhb;")
    public static class44 field2292 = field2286;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "Lhb;")
    public static class44 field2293 = class102.method810("Bitte versuchen Sie es in ", -28606);

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "Lhb;")
    public static class44 field2288 = field2286;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Ltd;")
    public static class116 field2267;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "Lva;")
    public static class123 field2289;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "Led;")
    public static class29 field2283;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[Lne;")
    public static class83[] field2272;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "[Lne;")
    public static class83[] field2279;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 4)
    public static final void method719(int arg0) {
        if (arg0 >= -49) {
            field2278 = null;
        }
        class111.field2763.method335((byte) 100);
        field2261++;
        class125.field3016.method335((byte) -126);
        class14.field274.method335((byte) 55);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I", line = 23)
    public final int method720(int arg0, int arg1) {
        if (this.field2271 != null) {
            arg1 = this.field2265 * arg1 / this.field2266 + 7;
        }
        if (arg0 == 7) {
            field2270++;
            return arg1;
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)Lhb;", line = 61)
    public static final class44 method721(byte arg0, int arg1) {
        field2274++;
        class44 var2 = new class44();
        if (arg0 <= 51) {
            field2279 = null;
        }
        var2.field1074 = new byte[arg1];
        var2.field1070 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z[B)[B", line = 81)
    public final byte[] method722(boolean arg0, byte[] arg1) {
        field2276++;
        if (this.field2271 != null) {
            int var3 = arg1.length * this.field2265 / this.field2266 + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2271[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2265 + var5;
                int var14 = var13 / this.field2266;
                var4 += var14;
                var5 = var13 - this.field2266 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        if (!arg0) {
            this.method723(76, 107);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II)V", line = 147)
    public class89(int arg0, int arg1) {
        int var3 = class40.method351(arg1, arg0, 82);
        int var4 = arg0 / var3;
        this.field2266 = var4;
        int var5 = arg1 / var3;
        this.field2265 = var5;
        if (var4 != var5) {
            this.field2271 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2271[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var5 / (double) var4;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I", line = 209)
    public final int method723(int arg0, int arg1) {
        field2281++;
        if (this.field2271 != null) {
            arg1 = this.field2265 * arg1 / this.field2266;
        }
        int var3 = 8 / ((-arg0 - 51) / 33);
        return arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 245)
    public static void method724(byte arg0) {
        field2293 = null;
        field2262 = null;
        field2269 = null;
        field2277 = null;
        field2279 = null;
        field2288 = null;
        field2280 = null;
        field2289 = null;
        field2259 = null;
        field2282 = null;
        field2284 = null;
        field2272 = null;
        if (arg0 > -96) {
            field2277 = null;
        }
        field2290 = null;
        field2275 = null;
        field2267 = null;
        field2286 = null;
        field2264 = null;
        field2258 = null;
        field2278 = null;
        field2292 = null;
        field2285 = null;
        field2283 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V", line = 309)
    public static final void method725(byte arg0) {
        class64 var1 = class57.field1506;
        synchronized (class57.field1506) {
            class121.field2960 = class84.field2130;
            class100.field2519 = class4.field111;
            class110.field2749 = class23.field487;
            class128.field3074 = class64.field1615;
            class57.field1508 = class1.field2;
            class40.field902 = class98.field2489;
            if (arg0 < 11) {
                field2285 = null;
            }
            class31.field764 = class131.field3165;
            class64.field1615 = 0;
        }
        field2291++;
    }
}
