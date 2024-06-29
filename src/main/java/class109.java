import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class109 extends class40 {

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public int field2275 = 0;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public int field2285 = -1;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field2273 = 0;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "[I")
    public static int[] field2291 = new int[5];

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "[I")
    public static int[] field2276 = new int[1000];

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "Z")
    public static boolean field2290 = false;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field2279 = 50;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "Lec;")
    public static class28 field2298 = class28.method210(-46, "shake:");

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "Lec;")
    public static class28 field2294 = class28.method210(-46, "titlebutton");

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "[I")
    public static int[] field2282 = new int[field2279];

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "[I")
    public static int[] field2299 = new int[field2279];

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "[I")
    public static int[] field2289 = new int[field2279];

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "[Z")
    public static boolean[] field2271 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false };

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "[I")
    public static int[] field2284 = new int[field2279];

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "[I")
    public static int[] field2302 = new int[field2279];

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "[I")
    public static int[] field2278 = new int[field2279];

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "Lec;")
    public static class28 field2293 = class28.method210(-46, "Choose Option");

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "[I")
    public static int[] field2305 = new int[field2279];

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "[Lec;")
    public static class28[] field2307 = new class28[field2279];

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public int field2281;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "Lvb;")
    public static class122 field2287;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lqa;")
    public static class96 field2283;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "Lbb;")
    public static class9 field2309;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Z")
    public static boolean field2288;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "[I")
    public static int[] field2272;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "[I")
    public static int[] field2280;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "[I")
    public static int[] field2303;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lsd;I)V")
    public static final void method748(class109 arg0, int arg1) {
        field2277++;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2295 == 0) {
            var4 = class11.field179.method783(arg0.field2301, arg0.field2286, arg0.field2296);
        }
        if (arg0.field2295 == 1) {
            var4 = class11.field179.method767(arg0.field2301, arg0.field2286, arg0.field2296);
        }
        if (arg0.field2295 == 2) {
            var4 = class11.field179.method796(arg0.field2301, arg0.field2286, arg0.field2296);
        }
        if (arg0.field2295 == arg1) {
            var4 = class11.field179.method774(arg0.field2301, arg0.field2286, arg0.field2296);
        }
        if (var4 != 0) {
            int var6 = class11.field179.method795(arg0.field2301, arg0.field2286, arg0.field2296, var4);
            var3 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
            var2 = var4 >> 14 & 0x7FFF;
        }
        arg0.field2281 = var2;
        arg0.field2310 = var5;
        arg0.field2304 = var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[Lub;II[BLta;)V")
    public static final void method749(int arg0, class117[] arg1, int arg2, int arg3, byte[] arg4, class111 arg5) {
        field2297++;
        int var6 = -1;
        class119 var7 = new class119(arg4);
        if (arg3 < 108) {
            method750((byte) 100);
        }
        while (true) {
            int var8 = var7.method899(-4);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method899(-4);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var7.method879((byte) 45);
                int var14 = var9 >> 6 & 0x3F;
                int var15 = var13 & 0x3;
                int var16 = arg0 + var14;
                int var17 = var13 >> 2;
                int var18 = arg2 + var11;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class117 var19 = null;
                    int var20 = var12;
                    if ((class47.field1080[1][var16][var18] & 0x2) == 2) {
                        var20 = var12 - 1;
                    }
                    if (var20 >= 0) {
                        var19 = arg1[var20];
                    }
                    class3.method16(var18, var15, var6, arg5, var19, -2, var16, var12, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
    public static void method750(byte arg0) {
        field2289 = null;
        field2307 = null;
        field2309 = null;
        field2272 = null;
        field2282 = null;
        field2305 = null;
        field2280 = null;
        field2276 = null;
        field2303 = null;
        field2283 = null;
        field2284 = null;
        if (arg0 != -80) {
            return;
        }
        field2293 = null;
        field2302 = null;
        field2278 = null;
        field2298 = null;
        field2287 = null;
        field2294 = null;
        field2291 = null;
        field2299 = null;
        field2271 = null;
    }
}
