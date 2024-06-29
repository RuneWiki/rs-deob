import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 implements Runnable {

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[Lld;")
    public volatile class80[] field2376 = new class80[2];

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Z")
    public volatile boolean field2375 = false;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Z")
    public volatile boolean field2369 = false;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lhe;")
    private static class54 field2380 = class6.method58("Loaded config", false);

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lhe;")
    public static class54 field2382 = null;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lhe;")
    public static class54 field2379 = class6.method58("<col=00ff00>", false);

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    public static int[] field2368 = new int[200];

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lhe;")
    public static class54 field2381 = class6.method58("Bitte benutzen Sie eine andere Welt)3", false);

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lhe;")
    public static class54 field2386 = class6.method58("Spieler kann nicht gefunden werden: ", false);

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Lhe;")
    public static class54 field2387 = class6.method58("<col=ffb000>", false);

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lhe;")
    private static class54 field2389 = class6.method58("Ok", false);

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lhe;")
    public static class54 field2378 = field2380;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "J")
    public static long field2390 = 0L;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lhe;")
    public static class54 field2374 = field2389;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lvb;")
    public class148 field2377;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lef;")
    public static class35 field2384;

    @OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
    public final void run() {
        this.field2369 = true;
        try {
            while (!this.field2375) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class80 var2 = this.field2376[var1];
                    if (var2 != null) {
                        var2.method611((byte) -125);
                    }
                }
                class50.method360(10L, 10);
                class48.method347((byte) -61, null, this.field2377);
            }
        } catch (Exception var9) {
            class48.method345(var9, -82, null);
        } finally {
            Object var6 = null;
            this.field2369 = false;
        }
        field2385++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Z")
    public static final boolean method749(int arg0, byte arg1) {
        if (arg1 > -63) {
            field2368 = null;
        }
        field2372++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method750(int arg0) {
        field2384 = null;
        field2380 = null;
        field2387 = null;
        field2374 = null;
        field2378 = null;
        field2368 = null;
        field2386 = null;
        field2379 = null;
        field2381 = null;
        field2389 = null;
        int var1 = -42 / ((arg0 - 76) / 39);
        field2382 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static final void method751(int arg0) {
        class131.field2978.method992(0);
        if (arg0 > 109) {
            field2371++;
            class134.field3040.method992(0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public static final void method752(int arg0) {
        field2383++;
        class134.method1005(class133.field3017, 0);
        class53.field1288++;
        if (class111.field2660 && class65.field1564) {
            int var1 = class71.field1772;
            int var2 = var1 - class147.field3318;
            int var3 = class7.field211;
            int var4 = var3 - class140.field3204;
            if (class3.field82 > var2) {
                var2 = class3.field82;
            }
            int var5 = -21 / ((-arg0 - 41) / 39);
            if (class3.field82 + class115.field2725.field2257 < var2 - -class133.field3017.field2257) {
                var2 = class3.field82 + class115.field2725.field2257 - class133.field3017.field2257;
            }
            int var6 = var2 - class65.field1567;
            if (var4 < class53.field1282) {
                var4 = class53.field1282;
            }
            if (class133.field3017.field2286 + var4 > class53.field1282 + class115.field2725.field2286) {
                var4 = class53.field1282 + class115.field2725.field2286 - class133.field3017.field2286;
            }
            int var7 = var4 - class38.field991;
            int var8 = class133.field3017.field2349;
            int var9 = class115.field2725.field2339 + var4 - class53.field1282;
            int var10 = var2 + class115.field2725.field2332 - class3.field82;
            if (class53.field1288 > class133.field3017.field2299 && (var8 < var6 || var6 < -var8 || var8 < var7 || -var8 > var7)) {
                class39.field1006 = true;
            }
            if (class133.field3017.field2236 != null && class39.field1006) {
                class100 var11 = new class100();
                var11.field2537 = class133.field3017;
                var11.field2535 = var9;
                var11.field2522 = class133.field3017.field2236;
                var11.field2523 = var10;
                class32.method242(1, var11);
            }
            if (class22.field620 == 0) {
                if (class39.field1006) {
                    if (class133.field3017.field2265 != null) {
                        class100 var12 = new class100();
                        var12.field2537 = class133.field3017;
                        var12.field2522 = class133.field3017.field2265;
                        var12.field2523 = var10;
                        var12.field2535 = var9;
                        var12.field2525 = class108.field2638;
                        class32.method242(1, var12);
                    }
                    if (class108.field2638 != null && class6.method54(class133.field3017, true) != null) {
                        class87.field2143++;
                        class131.field2969.method454(233, -105);
                        class131.field2969.method629(class108.field2638.field2264, 2018779304);
                        class131.field2969.method640(94, class133.field3017.field2264);
                        class131.field2969.method666(89, class133.field3017.field2273);
                        class131.field2969.method633(class108.field2638.field2273, -1387540232);
                    }
                } else if ((class156.field3543 == 1 || class79.method599(-56, class67.field1641 - 1)) && class67.field1641 > 2) {
                    class16.method144(-21);
                } else if (class67.field1641 > 0) {
                    class83.method643(0, class67.field1641 - 1);
                }
                class133.field3017 = null;
            }
        } else if (class53.field1288 > 1) {
            class133.field3017 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)I")
    public static final int method753(int arg0, int arg1, int arg2) {
        field2370++;
        class7 var3 = (class7) class63.field1524.method246((byte) 117, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (~arg1 <= arg0 && var3.field218.length > arg1) {
            return var3.field218[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)I")
    public static final int method754(int arg0, int arg1, int arg2) {
        field2388++;
        int var3 = class22.method180(arg2 - 1, arg1 + -1, 32315) + class22.method180(arg2 + 1, arg1 - 1, arg0 ^ 0xFFFF81C4) + class22.method180(arg2 - 1, arg1 - arg0, 32315) + class22.method180(arg2 + 1, arg1 + 1, 32315);
        int var4 = class22.method180(arg2 - 1, arg1, arg0 + 32316) + class22.method180(arg2 + 1, arg1, 32315) + class22.method180(arg2, arg1 - 1, 32315) + class22.method180(arg2, arg1 + 1, 32315);
        int var5 = class22.method180(arg2, arg1, 32315);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }
}
