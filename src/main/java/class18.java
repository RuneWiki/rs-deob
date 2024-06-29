import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class18 {

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public int field263 = -1;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field261 = 99;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field269 = -1;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public int field273 = 5;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public int field276 = -1;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Z")
    public boolean field275 = false;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public int field280 = -1;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public int field277 = 2;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public int field271 = -1;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "Z")
    private boolean field279 = false;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field258 = -1;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "Loj;")
    public static class17 field278 = new class17(50);

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Lqh;")
    public static class69 field283 = null;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Lhh;")
    public static class163 field284 = class137.method1065("blinken3:", 17);

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "[I")
    public static int[] field286 = new int[100];

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Loj;")
    public static class17 field285 = new class17(20);

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "[Lqj;")
    public static class201[] field287 = new class201[500];

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field290 = 500;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "Lhh;")
    private static class163 field288 = class137.method1065("Loaded update list", 17);

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "Lhh;")
    public static class163 field289 = field288;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[I")
    public int[] field265;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "[I")
    private int[] field267;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "[I")
    public int[] field268;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "[I")
    private int[] field274;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "[[I")
    public int[][] field282;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILra;)Lra;")
    public final class70 method121(int arg0, int arg1, class70 arg2) {
        int var4 = this.field265[arg0];
        class63 var5 = class120.method941(var4 >> 16, 3697);
        field270++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method511(true, true);
        }
        if (arg1 != 10) {
            this.method128(-77);
        }
        class70 var7 = arg2.method511(!var5.method446(var6, 29255), !this.field279);
        var7.method505(var5, var6, this.field279);
        return var7;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lra;Ltc;III)Lra;")
    public final class70 method122(class70 arg0, class18 arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -674) {
            this.field273 = -50;
        }
        field266++;
        int var6 = this.field265[arg2];
        class63 var7 = class120.method941(var6 >> 16, 3697);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method121(arg4, 10, arg0);
        }
        int var9 = arg1.field265[arg4];
        class63 var10 = class120.method941(var9 >> 16, arg3 + 4371);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class70 var12 = arg0.method511(!var7.method446(var8, arg3 ^ 0xFFFF8F19), !this.field279);
            var12.method505(var7, var8, this.field279);
            return var12;
        } else {
            class70 var13 = arg0.method511(!var7.method446(var8, 29255) & !var10.method446(var11, 29255), !this.field279 & !arg1.field279);
            var13.method501(var7, var8, var10, var11, this.field274, arg1.field279 | this.field279);
            return var13;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lpg;I)V")
    public final void method123(class81 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method622(true);
            if (var3 == 0) {
                field256++;
                if (arg1 != 26) {
                    this.field276 = 67;
                    return;
                }
                return;
            }
            this.method124(arg0, -5499, var3);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lpg;II)V")
    private final void method124(class81 arg0, int arg1, int arg2) {
        if (arg1 != -5499) {
            this.method127((class70) null, (byte) -63, -27);
        }
        if (arg2 == 1) {
            int var4 = arg0.method658(-118);
            this.field268 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field268[var5] = arg0.method658(-122);
            }
            this.field265 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field265[var6] = arg0.method658(-88);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field265[var7] += arg0.method658(arg1 + 5569) << 16;
            }
        } else if (arg2 == 2) {
            this.field271 = arg0.method658(-108);
        } else if (arg2 == 3) {
            int var15 = arg0.method622(true);
            this.field274 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field274[var16] = arg0.method622(true);
            }
            this.field274[var15] = 9999999;
        } else if (arg2 == 4) {
            this.field275 = true;
        } else if (arg2 == 5) {
            this.field273 = arg0.method622(true);
        } else if (arg2 == 6) {
            this.field280 = arg0.method658(-69);
        } else if (arg2 == 7) {
            this.field269 = arg0.method658(-98);
        } else if (arg2 == 8) {
            this.field261 = arg0.method622(true);
        } else if (arg2 == 9) {
            this.field276 = arg0.method622(true);
        } else if (arg2 == 10) {
            this.field263 = arg0.method622(true);
        } else if (arg2 == 11) {
            this.field277 = arg0.method622(true);
        } else if (arg2 == 12) {
            int var8 = arg0.method622(true);
            this.field267 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field267[var9] = arg0.method658(122);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field267[var10] = (arg0.method658(class46.method340(arg1, -5435)) << 16) + this.field267[var10];
            }
        } else if (arg2 == 13) {
            int var11 = arg0.method658(-62);
            this.field282 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method622(true);
                if (var13 > 0) {
                    this.field282[var12] = new int[var13];
                    this.field282[var12][0] = arg0.method615(-115);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field282[var12][var14] = arg0.method658(class46.method340(arg1, 5396));
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field279 = true;
        }
        field259++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static final void method125(byte arg0) {
        field257++;
        if (class253.field4430 == null) {
            return;
        }
        if (class160.field2947 < 10) {
            if (!class265.field4610.method960((byte) 121, class253.field4430.field1438) || !class265.field4610.method960((byte) 122, class145.method1101(0, new class163[] { class253.field4430.field1438, class134.field2593 }))) {
                class160.field2947 = class107.field2049.method978(class253.field4430.field1438, (byte) 124) / 10;
                return;
            }
            class159.method1169((byte) -36);
            class160.field2947 = 10;
        }
        if (arg0 > -72) {
            return;
        }
        if (class160.field2947 == 10) {
            class54.field892 = class253.field4430.field1420 >> 6 << 6;
            class218.field3965 = class253.field4430.field1444 >> 6 << 6;
            class58.field952 = (class253.field4430.field1435 >> 6 << 6) + 64 - class218.field3965;
            int var1 = class58.field952 + class218.field3965 - (class235.field4203.field3615 >> 7) - class257.field4500 - 1;
            class124.field2395 = (class253.field4430.field1430 >> 6 << 6) + 64 - class54.field892;
            class21.field335 = 8.0F;
            class219.field3985 = 8.0F;
            int var2 = var1 + ((int) (Math.random() * 10.0D) - 5);
            int var3 = (class235.field4203.field3633 >> 7) + class62.field1035 - class54.field892;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var4 >= 0 && var4 < class124.field2395 && var2 >= 0 && var2 < class58.field952) {
                class201.field3611 = var2;
                class169.field3086 = var4;
            } else {
                class201.field3611 = class58.field952 + class218.field3965 - (class253.field4430.field1431 * 64) - 1;
                class169.field3086 = class253.field4430.field1425 * 64 - class54.field892;
            }
            class227.method1583((byte) 60);
            int var5 = class136.field2623 >> 2 << 10;
            int var6 = class124.field2395 >> 6;
            class231.field4151 = new int[class40.field664 + 1];
            int var7 = class17.field243 >> 1;
            int var8 = class58.field952 >> 6;
            class55.field911 = new byte[var6][var8][];
            class19.field300 = new byte[var6][var8][];
            class203.field3683 = new short[var6][var8][];
            class151.field2828 = new byte[var6][var8][];
            class75.field1409 = new int[var6][var8][];
            class38.field633 = new byte[var6][var8][];
            class215.field3917 = new int[var6][var8][];
            class32.field495 = new byte[var6][var8][];
            class46.method337(var7, (byte) -58, var5);
            class160.field2947 = 20;
        } else if (class160.field2947 == 20) {
            class40.method280(new class81(class265.field4610.method982(0, class213.field3891, class253.field4430.field1438)), (byte) -122);
            class160.field2947 = 30;
            class54.method376((byte) 126, true);
            class157.method1165(false);
        } else if (class160.field2947 == 30) {
            class191.method1403(new class81(class265.field4610.method982(0, class146.field2785, class253.field4430.field1438)), -1804892218);
            class160.field2947 = 40;
            class157.method1165(false);
        } else if (class160.field2947 == 40) {
            class179.method1318(new class81(class265.field4610.method982(0, class201.field3612, class253.field4430.field1438)), true);
            class160.field2947 = 50;
            class157.method1165(false);
        } else if (class160.field2947 == 50) {
            client.method838(new class81(class265.field4610.method982(0, class58.field958, class253.field4430.field1438)), 1);
            class160.field2947 = 60;
            class54.method376((byte) 126, true);
            class157.method1165(false);
        } else if (class160.field2947 == 60) {
            class127.field2469 = class259.method1754(class265.field4610, 0, class145.method1101(0, new class163[] { class253.field4430.field1438, class134.field2593 }));
            class160.field2947 = 70;
            class157.method1165(false);
        } else if (class160.field2947 == 70) {
            class64.field1081 = new class108(11, true, class202.field3675);
            class160.field2947 = 73;
            class54.method376((byte) 126, true);
            class157.method1165(false);
        } else if (class160.field2947 == 73) {
            class51.field859 = new class108(12, true, class202.field3675);
            class160.field2947 = 76;
            class54.method376((byte) 126, true);
            class157.method1165(false);
        } else if (class160.field2947 == 76) {
            class127.field2477 = new class108(14, true, class202.field3675);
            class160.field2947 = 79;
            class54.method376((byte) 126, true);
            class157.method1165(false);
        } else if (class160.field2947 == 79) {
            class43.field734 = new class108(17, true, class202.field3675);
            class160.field2947 = 82;
            class54.method376((byte) 126, true);
            class157.method1165(false);
        } else if (class160.field2947 == 82) {
            class82.field1588 = new class108(19, true, class202.field3675);
            class160.field2947 = 85;
            class54.method376((byte) 126, true);
            class157.method1165(false);
        } else if (class160.field2947 == 85) {
            class181.field3306 = new class108(22, true, class202.field3675);
            class160.field2947 = 88;
            class54.method376((byte) 126, true);
            class157.method1165(false);
        } else if (class160.field2947 == 88) {
            class253.field4433 = new class108(26, true, class202.field3675);
            class160.field2947 = 91;
            class54.method376((byte) 126, true);
            class157.method1165(false);
        } else {
            class10.field163 = new class108(30, true, class202.field3675);
            class160.field2947 = 100;
            class54.method376((byte) 126, true);
            class157.method1165(false);
            class27.field419 = -1;
            class175.field3192 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILra;I)Lra;")
    public final class70 method126(int arg0, int arg1, class70 arg2, int arg3) {
        field264++;
        int var5 = this.field265[arg1];
        class63 var6 = class120.method941(var5 >> 16, 3697);
        if (arg3 > -44) {
            this.method122((class70) null, (class18) null, -20, -9, 27);
        }
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method511(true, true);
        }
        int var8 = arg0 & 0x3;
        class70 var9 = arg2.method511(!var6.method446(var7, 29255), !this.field279);
        if (var8 == 1) {
            var9.method512();
        } else if (var8 == 2) {
            var9.method498();
        } else if (var8 == 3) {
            var9.method515();
        }
        var9.method505(var6, var7, this.field279);
        if (var8 == 1) {
            var9.method515();
        } else if (var8 == 2) {
            var9.method498();
        } else if (var8 == 3) {
            var9.method512();
        }
        return var9;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lra;BI)Lra;")
    public final class70 method127(class70 arg0, byte arg1, int arg2) {
        field260++;
        int var4 = this.field265[arg2];
        class63 var5 = class120.method941(var4 >> 16, 3697);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method514(true, true);
        }
        if (arg1 >= -87) {
            this.field277 = 9;
        }
        class70 var7 = arg0.method514(!var5.method446(var6, 29255), !this.field279);
        var7.method505(var5, var6, this.field279);
        return var7;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public final void method128(int arg0) {
        if (arg0 <= 125) {
            this.method124((class81) null, 57, -102);
        }
        if (this.field263 == -1) {
            if (this.field274 == null) {
                this.field263 = 0;
            } else {
                this.field263 = 2;
            }
        }
        if (this.field276 == -1) {
            if (this.field274 == null) {
                this.field276 = 0;
            } else {
                this.field276 = 2;
            }
        }
        field281++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method129(int arg0) {
        field283 = null;
        field287 = null;
        field288 = null;
        int var1 = -48 % ((arg0 + 37) / 34);
        field289 = null;
        field285 = null;
        field284 = null;
        field286 = null;
        field278 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IILra;)Lra;")
    public final class70 method130(int arg0, int arg1, class70 arg2) {
        int var4 = this.field265[arg0];
        class63 var5 = class120.method941(var4 >> 16, 3697);
        field262++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method511(true, true);
        }
        int var7 = 0;
        class63 var8 = null;
        if (this.field267 != null && this.field267.length > arg0) {
            int var9 = this.field267[arg0];
            var8 = class120.method941(var9 >> 16, 3697);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class70 var11 = arg2.method511(!var5.method446(var6, 29255), !this.field279);
            var11.method505(var5, var6, this.field279);
            return var11;
        }
        class70 var10 = arg2.method511(!var5.method446(var6, 29255) & !var8.method446(var7, arg1 + 29156), !this.field279);
        if (arg1 == 99) {
            var10.method505(var5, var6, this.field279);
            var10.method505(var8, var7, this.field279);
            return var10;
        } else {
            return null;
        }
    }
}
