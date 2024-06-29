import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class109 {

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2500 = new CRC32();

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Lrd;")
    private static class114 field2516 = class84.method656(" has logged out)3", (byte) 123);

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "Lrd;")
    private static class114 field2517 = class84.method656("flash3:", (byte) 125);

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "[I")
    public static int[] field2523 = new int[128];

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "Lrd;")
    public static class114 field2525 = class84.method656("Fallen lassen", (byte) 126);

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public static int field2524 = 0;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "Lrd;")
    public static class114 field2518 = field2517;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "Lrd;")
    public static class114 field2526 = field2516;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "Lpc;")
    public static class101 field2520 = new class101(4096);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public int field2494;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public int field2497;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field2501;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public int field2505;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field2507;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field2509;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Lgb;")
    public static class45 field2529;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "[I")
    public static int[] field2522;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "[Loa;")
    public static class93[] field2528;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method825(int arg0) {
        field2525 = null;
        field2523 = null;
        field2529 = null;
        field2518 = null;
        field2517 = null;
        field2522 = null;
        field2520 = null;
        field2500 = null;
        if (arg0 != 10517) {
            method825(-94);
        }
        field2526 = null;
        field2516 = null;
        field2528 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)Lrd;")
    public static final class114 method826(byte arg0, int arg1) {
        class114 var2 = new class114();
        field2510++;
        var2.field2676 = new byte[arg1];
        if (arg0 == -8) {
            var2.field2660 = 0;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
    public static final int method827(int arg0, int arg1, int arg2) {
        int var3 = class117.method914(arg1 + 45365, 17470, arg2 + 91923, 4) + (class117.method914(arg1 + 10294, arg0 ^ 0x54B3, arg2 + 37821, 2) - 128 >> 1) + (class117.method914(arg1, arg0 + 13233, arg2, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field2503++;
        if (arg0 != 4237) {
            return 38;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)I")
    public static final int method828(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2499++;
        if (arg0 != -35) {
            method829(113);
        }
        int var5 = 65536 - class134.field3279[arg3 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public static final void method829(int arg0) {
        field2496++;
        int var1 = client.field399.method326(class64.field1380);
        for (int var2 = 0; var2 < class60.field1263; var2++) {
            int var12 = client.field399.method325(class123.field2878[var2]);
            if (var1 < var12) {
                var1 = var12;
            }
        }
        var1 += 8;
        if (arg0 >= -37) {
            field2524 = -10;
        }
        int var3 = class60.field1263 * 15 + 21;
        if (class34.field671 != -1) {
            class132.field3190 = var1;
            class143.field3414 = class60.field1263 * 15 + 22;
            class116.field2714 = true;
            class14.field304 = 0;
            int var10 = class142.field3392 - var1 / 2;
            if (var1 + var10 > 765) {
                var10 = 765 - var1;
            }
            if (var10 < 0) {
                var10 = 0;
            }
            class131.field3165 = var10;
            int var11 = class118.field2758;
            if (var3 + var11 > 503) {
                var11 = 503 - var3;
            }
            if (var11 < 0) {
                var11 = 0;
            }
            class86.field1930 = var11;
            return;
        }
        if (class142.field3392 > 4 && class118.field2758 > 4 && class142.field3392 < 516 && class118.field2758 < 338) {
            class116.field2714 = true;
            int var4 = class142.field3392 - var1 / 2 - 4;
            class132.field3190 = var1;
            if (var1 + var4 > 512) {
                var4 = 512 - var1;
            }
            class14.field304 = 0;
            class143.field3414 = class60.field1263 * 15 + 22;
            int var5 = class118.field2758 - 4;
            if (var3 + var5 > 334) {
                var5 = 334 - var3;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            class131.field3165 = var4;
            if (var5 < 0) {
                var5 = 0;
            }
            class86.field1930 = var5;
            return;
        }
        if (class142.field3392 > 553 && class118.field2758 > 205 && class142.field3392 < 743 && class118.field2758 < 466) {
            class14.field304 = 1;
            class116.field2714 = true;
            class143.field3414 = class60.field1263 * 15 + 22;
            int var6 = class142.field3392 - var1 / 2 - 553;
            int var7 = class118.field2758 - 205;
            class132.field3190 = var1;
            if (var6 < 0) {
                var6 = 0;
            } else if (var1 + var6 > 190) {
                var6 = 190 - var1;
            }
            class131.field3165 = var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var3 + var7 > 261) {
                var7 = 261 - var3;
            }
            class86.field1930 = var7;
            return;
        }
        if (class142.field3392 <= 17 || class118.field2758 <= 357 || class142.field3392 >= 496 || class118.field2758 >= 453) {
            return;
        }
        class132.field3190 = var1;
        class143.field3414 = class60.field1263 * 15 + 22;
        class14.field304 = 2;
        class116.field2714 = true;
        int var8 = class142.field3392 - var1 / 2 - 17;
        int var9 = class118.field2758 - 357;
        if (var9 < 0) {
            var9 = 0;
        } else if (var3 + var9 > 96) {
            var9 = 96 - var3;
        }
        class86.field1930 = var9;
        if (var8 < 0) {
            var8 = 0;
        } else if (var1 + var8 > 479) {
            var8 = 479 - var1;
        }
        class131.field3165 = var8;
        return;
    }
}
