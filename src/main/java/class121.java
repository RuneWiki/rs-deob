import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class121 extends class132 {

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "[Lca;")
    public class23[] field2297 = new class23[5];

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "[I")
    public int[] field2311 = new int[5];

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public int field2312 = 0;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public int field2289;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public int field2293;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "[Lve;")
    public static class223[] field2280 = new class223[256];

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "[I")
    public static int[] field2285 = new int[100];

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "Lvd;")
    private static class222 field2294 = class212.method1357("Checking for updates )2 ", 10731);

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Lvd;")
    public static class222 field2279 = field2294;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field2304 = 0;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Lvd;")
    public static class222 field2282 = class212.method1357("Bitte laden Sie die Seite neu)3", 10731);

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field2301 = 0;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "[I")
    public static int[] field2309 = new int[50];

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Lph;")
    public static class166 field2281 = new class166(260);

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field2314 = -1;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "Lvd;")
    private static class222 field2315 = class212.method1357("yellow:", 10731);

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
    public static int field2317 = 0;

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "Lvd;")
    public static class222 field2316 = field2315;

    @OriginalMember(owner = "client!lc", name = "gb", descriptor = "Lvd;")
    public static class222 field2318 = field2315;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "Llc;")
    public class121 field2303;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "Lnb;")
    public class140 field2313;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "Ltc;")
    public class201 field2302;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "Lth;")
    public class206 field2310;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Lad;")
    public class5 field2300;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Lff;")
    public class61 field2288;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "Lih;")
    public class94 field2306;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Z")
    public boolean field2290;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Z")
    public boolean field2295;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "Z")
    public boolean field2308;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
    public static final void method771(byte arg0) {
        field2287++;
        if (arg0 < 35) {
            method772((byte) -117);
        }
        if (class25.field571 != null && class8.field135 != null) {
            return;
        }
        class8.field135 = new int[256];
        class25.field571 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class25.field571[var1] = (int) (Math.sin(var2) * 4096.0D);
            class8.field135[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public static final void method772(byte arg0) {
        class13.field302 = null;
        if (arg0 != -93) {
            field2285 = null;
        }
        class140.field2701 = null;
        field2283++;
        class69.field1301 = null;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
    public static void method773(int arg0) {
        field2280 = null;
        field2318 = null;
        field2281 = null;
        field2309 = null;
        field2282 = null;
        field2316 = null;
        field2285 = null;
        field2315 = null;
        field2294 = null;
        if (arg0 != 5) {
            method771((byte) -70);
        }
        field2279 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(III)V")
    public class121(int arg0, int arg1, int arg2) {
        this.field2289 = arg1;
        this.field2284 = arg2;
        this.field2296 = this.field2293 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIILe;IZJ)Z")
    public static final boolean method774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class126.field2409 || var20 >= class181.field3357) {
                    return false;
                }
                class121 var21 = class204.field3800[arg0][var13][var20];
                if (var21 != null && var21.field2299 >= 5) {
                    return false;
                }
            }
        }
        class23 var14 = new class23();
        var14.field536 = arg11;
        var14.field548 = arg0;
        var14.field545 = arg5;
        var14.field541 = arg6;
        var14.field546 = arg7;
        var14.field543 = arg8;
        var14.field544 = arg9;
        var14.field534 = arg1;
        var14.field539 = arg2;
        var14.field549 = arg1 + arg3 - 1;
        var14.field535 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class204.field3800[var18][var15][var16] == null) {
                        class204.field3800[var18][var15][var16] = new class121(var18, var15, var16);
                    }
                }
                class121 var19 = class204.field3800[arg0][var15][var16];
                var19.field2297[var19.field2299] = var14;
                var19.field2311[var19.field2299] = var17;
                var19.field2312 |= var17;
                var19.field2299++;
            }
        }
        if (arg10) {
            class29.field632[class67.field1262++] = var14;
        }
        return true;
    }
}
