import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class152 extends class30 {

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "Lje;")
    public class67 field3472 = class149.field3418;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
    public int field3470 = 0;

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "Ljf;")
    public static class68 field3478 = new class68();

    @OriginalMember(owner = "client!vf", name = "kb", descriptor = "I")
    public static int field3482 = -2;

    @OriginalMember(owner = "client!vf", name = "hb", descriptor = "[Ldb;")
    public static class24[] field3479 = new class24[32768];

    @OriginalMember(owner = "client!vf", name = "ib", descriptor = "I")
    public static int field3480 = 0;

    @OriginalMember(owner = "client!vf", name = "mb", descriptor = "Lje;")
    public static class67 field3484 = class85.method592(255, "leuchten2:");

    @OriginalMember(owner = "client!vf", name = "nb", descriptor = "[Lje;")
    public static class67[] field3485 = new class67[100];

    @OriginalMember(owner = "client!vf", name = "lb", descriptor = "Lob;")
    public static class99 field3483 = new class99(200);

    @OriginalMember(owner = "client!vf", name = "sb", descriptor = "I")
    public static int field3490 = 0;

    @OriginalMember(owner = "client!vf", name = "qb", descriptor = "Lje;")
    public static class67 field3488 = class85.method592(255, "mapfunction");

    @OriginalMember(owner = "client!vf", name = "ub", descriptor = "Z")
    public static volatile boolean field3492 = false;

    @OriginalMember(owner = "client!vf", name = "pb", descriptor = "Lac;")
    public static class4 field3487 = new class4();

    @OriginalMember(owner = "client!vf", name = "vb", descriptor = "Lje;")
    public static class67 field3493 = class85.method592(255, "::noclip");

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "I")
    public int field3476;

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!vf", name = "jb", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!vf", name = "ob", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "[I")
    public int[] field3466;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "[I")
    public int[] field3469;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "[Lje;")
    public class67[] field3474;

    @OriginalMember(owner = "client!vf", name = "rb", descriptor = "[[B")
    public static byte[][] field3489;

    @OriginalMember(owner = "client!vf", name = "tb", descriptor = "[[B")
    public static byte[][] field3491;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLna;)V")
    public final void method1159(byte arg0, class91 arg1) {
        if (arg0 < 100) {
            field3493 = null;
        }
        while (true) {
            int var3 = arg1.method649(false);
            if (var3 == 0) {
                field3471++;
                return;
            }
            this.method1161(var3, arg1, 112);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public static final void method1160(boolean arg0) {
        field3473++;
        while (class9.field196.method286(class155.field3544, -5) >= 27) {
            int var1 = class9.field196.method283(8, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (field3479[var1] == null) {
                field3479[var1] = new class24();
                var2 = true;
            }
            class24 var3 = field3479[var1];
            class45.field836[class123.field2743++] = var1;
            var3.field2979 = class34.field627;
            int var4 = class9.field196.method283(8, 5);
            int var5 = class9.field196.method283(8, 1);
            if (var4 > 15) {
                var4 -= 32;
            }
            var3.field442 = class106.method838(12861, class9.field196.method283(8, 14));
            int var6 = class9.field196.method283(8, 5);
            int var7 = class9.field196.method283(8, 1);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 == 1) {
                class89.field1961[class71.field1442++] = var1;
            }
            int var8 = class55.field1109[class9.field196.method283(8, 3)];
            var3.field2954 = var3.field442.field2544;
            var3.field2986 = var3.field442.field2569;
            var3.field2967 = var3.field442.field2559;
            var3.field2984 = var3.field442.field2530;
            var3.field2997 = var3.field442.field2529;
            var3.field2958 = var3.field442.field2538;
            var3.field2945 = var3.field442.field2555;
            if (var2) {
                var3.field2972 = var3.field2992 = var8;
            }
            if (var3.field2967 == 0) {
                var3.field2992 = 0;
            }
            var3.field2935 = var3.field442.field2557;
            var3.field2998 = var3.field442.field2516;
            var3.method1013(var5 == 1, class37.field667.field2993[0] + var4, class37.field667.field2942[0] - -var6, -9);
        }
        if (!arg0) {
            field3485 = null;
        }
        class9.field196.method287(51);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILna;I)V")
    private final void method1161(int arg0, class91 arg1, int arg2) {
        field3481++;
        if (arg2 <= 103) {
            return;
        }
        if (arg0 == 1) {
            this.field3476 = arg1.method649(false);
        } else if (arg0 == 2) {
            this.field3475 = arg1.method649(false);
        } else if (arg0 == 3) {
            this.field3472 = arg1.method634(-1);
        } else if (arg0 == 4) {
            this.field3467 = arg1.method631(-44);
            return;
        } else if (arg0 == 5) {
            this.field3470 = arg1.method641(255);
            this.field3469 = new int[this.field3470];
            this.field3474 = new class67[this.field3470];
            for (int var4 = 0; var4 < this.field3470; var4++) {
                this.field3469[var4] = arg1.method631(-117);
                this.field3474[var4] = arg1.method634(-1);
            }
            return;
        } else if (arg0 == 6) {
            this.field3470 = arg1.method641(255);
            this.field3469 = new int[this.field3470];
            this.field3466 = new int[this.field3470];
            for (int var5 = 0; var5 < this.field3470; var5++) {
                this.field3469[var5] = arg1.method631(-39);
                this.field3466[var5] = arg1.method631(-31);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    public static final void method1162(int arg0) {
        field3468++;
        int var1 = class4.field62 * 128 + 64;
        int var2 = class140.field3160 * 128 + 64;
        int var3 = class114.method924(var1, class128.field2817, var2, -106) - class30.field526;
        if (var2 > field3486) {
            field3486 += (var2 - field3486) * class82.field1803 / 1000 + class144.field3326;
            if (var2 < field3486) {
                field3486 = var2;
            }
        }
        if (class101.field2274 < var1) {
            class101.field2274 += (var1 - class101.field2274) * class82.field1803 / 1000 + class144.field3326;
            if (var1 < class101.field2274) {
                class101.field2274 = var1;
            }
        }
        if (class101.field2274 > var1) {
            class101.field2274 -= (class101.field2274 - var1) * class82.field1803 / 1000 + class144.field3326;
            if (var1 > class101.field2274) {
                class101.field2274 = var1;
            }
        }
        if (var2 < field3486) {
            field3486 -= class144.field3326 + (field3486 - var2) * class82.field1803 / 1000;
            if (var2 > field3486) {
                field3486 = var2;
            }
        }
        int var4 = class15.field268 * 128 + 64;
        if (var3 > class3.field42) {
            class3.field42 += (var3 - class3.field42) * class82.field1803 / 1000 + class144.field3326;
            if (class3.field42 > var3) {
                class3.field42 = var3;
            }
        }
        int var5 = class103.field2343 * 128 + 64;
        if (var3 < class3.field42) {
            class3.field42 -= class144.field3326 + (class3.field42 - var3) * class82.field1803 / 1000;
            if (var3 > class3.field42) {
                class3.field42 = var3;
            }
        }
        int var6 = class114.method924(var5, class128.field2817, var4, -108) - class150.field3435;
        int var7 = var4 - field3486;
        int var8 = var5 - class101.field2274;
        int var9 = var6 - class3.field42;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var7) * -325.949D) & 0x7FF;
        if (var11 > class46.field853) {
            class46.field853 += (var11 - class46.field853) * class77.field1659 / 1000 + class35.field658;
            if (var11 < class46.field853) {
                class46.field853 = var11;
            }
        }
        if (arg0 != 1) {
            method1160(false);
        }
        if (class46.field853 > var11) {
            class46.field853 -= class35.field658 + (class46.field853 - var11) * class77.field1659 / 1000;
            if (class46.field853 < var11) {
                class46.field853 = var11;
            }
        }
        int var13 = var12 - class83.field1828;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class83.field1828 += class77.field1659 * var13 / 1000 + class35.field658;
            class83.field1828 &= 0x7FF;
        }
        if (var13 < 0) {
            class83.field1828 -= -var13 * class77.field1659 / 1000 + class35.field658;
            class83.field1828 &= 0x7FF;
        }
        int var14 = var12 - class83.field1828;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class83.field1828 = var12;
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public static void method1163(int arg0) {
        field3493 = null;
        if (arg0 > -127) {
            return;
        }
        field3484 = null;
        field3487 = null;
        field3489 = null;
        field3485 = null;
        field3478 = null;
        field3483 = null;
        field3491 = null;
        field3488 = null;
        field3479 = null;
    }
}
