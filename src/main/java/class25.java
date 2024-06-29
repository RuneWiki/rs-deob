import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class25 extends class26 {

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
    private int field517 = 0;

    @OriginalMember(owner = "client!e", name = "ob", descriptor = "Z")
    private boolean field519 = false;

    @OriginalMember(owner = "client!e", name = "Fb", descriptor = "I")
    private int field536 = 0;

    @OriginalMember(owner = "client!e", name = "Yb", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!e", name = "pb", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!e", name = "Qb", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "client!e", name = "Cb", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!e", name = "Hb", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client!e", name = "Lb", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!e", name = "Nb", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!e", name = "Mb", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!e", name = "Ab", descriptor = "Lmb;")
    private class74 field531;

    @OriginalMember(owner = "client!e", name = "nb", descriptor = "I")
    public static int field518 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!e", name = "Bb", descriptor = "Llc;")
    private static class69 field532 = class69.method470((byte) -96, "Hidden");

    @OriginalMember(owner = "client!e", name = "Db", descriptor = "Llc;")
    public static class69 field534 = field532;

    @OriginalMember(owner = "client!e", name = "Ib", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!e", name = "xb", descriptor = "Lfe;")
    public static class36 field528 = new class36(64);

    @OriginalMember(owner = "client!e", name = "Ob", descriptor = "Llc;")
    public static class69 field545 = class69.method470((byte) -99, "Message @whi@");

    @OriginalMember(owner = "client!e", name = "Tb", descriptor = "Llc;")
    public static class69 field550 = class69.method470((byte) -121, " with @lre@");

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "D")
    public double field511;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "D")
    private double field515;

    @OriginalMember(owner = "client!e", name = "sb", descriptor = "D")
    public double field523;

    @OriginalMember(owner = "client!e", name = "vb", descriptor = "D")
    public double field526;

    @OriginalMember(owner = "client!e", name = "wb", descriptor = "D")
    private double field527;

    @OriginalMember(owner = "client!e", name = "yb", descriptor = "D")
    private double field529;

    @OriginalMember(owner = "client!e", name = "zb", descriptor = "D")
    private double field530;

    @OriginalMember(owner = "client!e", name = "Gb", descriptor = "D")
    private double field537;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!e", name = "qb", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!e", name = "rb", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!e", name = "tb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!e", name = "ub", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!e", name = "Eb", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!e", name = "Jb", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!e", name = "Kb", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!e", name = "Rb", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!e", name = "Sb", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!e", name = "Vb", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!e", name = "Wb", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!e", name = "Xb", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!e", name = "Ub", descriptor = "Loa;")
    public static class85 field551;

    @OriginalMember(owner = "client!e", name = "Pb", descriptor = "Z")
    public static boolean field546;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(Z)Lhb;")
    public final class44 method144(boolean arg0) {
        field548++;
        if (!arg0) {
            return null;
        }
        class114 var2 = class89.method631(54, this.field513);
        class44 var3 = var2.method834(this.field536, (byte) -120);
        if (var3 == null) {
            return null;
        } else {
            var3.method274(this.field514);
            return var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
    public final void method162(int arg0, int arg1) {
        field524++;
        this.field523 += this.field527 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field537;
        if (arg1 != 21813) {
            return;
        }
        this.field526 += (double) arg0 * this.field530;
        this.field537 += (double) arg0 * this.field527;
        this.field519 = true;
        this.field511 += (double) arg0 * this.field515;
        this.field535 = (int) (Math.atan2(this.field530, this.field515) * 325.949D) + 1024 & 0x7FF;
        this.field514 = (int) (Math.atan2(this.field537, this.field529) * 325.949D) & 0x7FF;
        if (this.field531 == null) {
            return;
        }
        this.field517 += arg0;
        while (this.field531.field1658[this.field536] < this.field517) {
            this.field517 -= this.field531.field1658[this.field536];
            this.field536++;
            if (this.field536 >= this.field531.field1646.length) {
                this.field536 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
    public static void method163(int arg0) {
        field551 = null;
        field534 = null;
        if (arg0 == 7) {
            field545 = null;
            field528 = null;
            field532 = null;
            field550 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V")
    public static final void method164(int arg0) {
        field521++;
        int var1 = class107.field2319 * arg0 + 64;
        int var2 = class127.field2732 * 128 + 64;
        int var3 = class53.method341(0, var2, var1, class71.field1588) - class66.field1383;
        if (var2 > class55.field1164) {
            class55.field1164 += class82.field1863 + (var2 - class55.field1164) * class3.field55 / 1000;
            if (class55.field1164 > var2) {
                class55.field1164 = var2;
            }
        }
        if (class70.field1561 < var3) {
            class70.field1561 += (var3 - class70.field1561) * class3.field55 / 1000 + class82.field1863;
            if (class70.field1561 > var3) {
                class70.field1561 = var3;
            }
        }
        if (class108.field2395 < var1) {
            class108.field2395 += (var1 - class108.field2395) * class3.field55 / 1000 + class82.field1863;
            if (class108.field2395 > var1) {
                class108.field2395 = var1;
            }
        }
        if (class55.field1164 > var2) {
            class55.field1164 -= class82.field1863 + (class55.field1164 - var2) * class3.field55 / 1000;
            if (class55.field1164 < var2) {
                class55.field1164 = var2;
            }
        }
        int var4 = class33.field642 * 128 + 64;
        if (var3 < class70.field1561) {
            class70.field1561 -= (class70.field1561 - var3) * class3.field55 / 1000 + class82.field1863;
            if (class70.field1561 < var3) {
                class70.field1561 = var3;
            }
        }
        if (class108.field2395 > var1) {
            class108.field2395 -= (class108.field2395 - var1) * class3.field55 / 1000 + class82.field1863;
            if (class108.field2395 < var1) {
                class108.field2395 = var1;
            }
        }
        int var5 = class71.field1581 * 128 + 64;
        int var6 = class53.method341(0, var4, var5, class71.field1588) - class61.field1262;
        int var7 = var6 - class70.field1561;
        int var8 = var5 - class108.field2395;
        int var9 = var4 - class55.field1164;
        int var10 = (int) Math.sqrt((double) (var9 * var9 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        if (var11 > class85.field1900) {
            class85.field1900 += (var11 - class85.field1900) * class10.field209 / 1000 + class39.field773;
            if (var11 < class85.field1900) {
                class85.field1900 = var11;
            }
        }
        if (var11 < class85.field1900) {
            class85.field1900 -= (class85.field1900 - var11) * class10.field209 / 1000 + class39.field773;
            if (var11 > class85.field1900) {
                class85.field1900 = var11;
            }
        }
        int var13 = var12 - class24.field510;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class24.field510 += class10.field209 * var13 / 1000 + class39.field773;
            class24.field510 &= 0x7FF;
        }
        if (var13 < 0) {
            class24.field510 -= class39.field773 + -var13 * class10.field209 / 1000;
            class24.field510 &= 0x7FF;
        }
        int var14 = var12 - class24.field510;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class24.field510 = var12;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static final void method165(byte arg0) {
        if (arg0 != 109) {
            field546 = false;
        }
        field552++;
        if (class62.field1285) {
            class62.field1285 = false;
            class18.method105(class24.field509, 87);
            class110.field2418 = true;
            class35.field709 = true;
            class71.field1596 = true;
            class87.field1914 = true;
        }
        class68.method451(0);
        if (class127.field2738 && class77.field1718 == 1) {
            class110.field2418 = true;
        }
        if (class67.field1396 != -1) {
            boolean var1 = class24.method159(14762, class67.field1396);
            if (var1) {
                class110.field2418 = true;
            }
        }
        if (class93.field2039 == 2) {
            class110.field2418 = true;
        }
        if (class57.field1198 == 2) {
            class110.field2418 = true;
        }
        if (class110.field2418) {
            class110.field2418 = false;
            class46.method309(103);
        }
        if (class60.field1244 == -1) {
            class60.field1217.field153 = class89.field1947 - class47.field986 - 77;
            if (class101.field2193 > 448 && class101.field2193 < 560 && class74.field1666 > 332) {
                class24.method158(class101.field2193 - 17, 0, false, -1, class74.field1666 - 357, class60.field1217, class89.field1947, 463, 77);
            }
            int var2 = class89.field1947 - class60.field1217.field153 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class89.field1947 - 77) {
                var2 = class89.field1947 - 77;
            }
            if (class47.field986 != var2) {
                class47.field986 = var2;
                class35.field709 = true;
            }
        }
        if (class60.field1244 == -1 && class62.field1277 == 3) {
            class60.field1217.field153 = class79.field1796;
            int var3 = class115.field2496 * 14 + 7;
            if (class101.field2193 > 448 && class101.field2193 < 560 && class74.field1666 > 332) {
                class24.method158(class101.field2193 - 17, 0, false, -1, class74.field1666 - 357, class60.field1217, var3, 463, 77);
            }
            int var4 = class60.field1217.field153;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (class79.field1796 != var4) {
                class79.field1796 = var4;
                class35.field709 = true;
            }
        }
        if (class60.field1244 != -1) {
            boolean var5 = class24.method159(arg0 ^ 0x39C7, class60.field1244);
            if (var5) {
                class35.field709 = true;
            }
        }
        if (class93.field2039 == 3) {
            class35.field709 = true;
        }
        if (class57.field1198 == 3) {
            class35.field709 = true;
        }
        if (class6.field115 != null) {
            class35.field709 = true;
        }
        if (class127.field2738 && class77.field1718 == 2) {
            class35.field709 = true;
        }
        if (class35.field709) {
            class35.field709 = false;
            class93.method659((byte) -92);
        }
        class64.method409(arg0 - 105);
        if (class73.field1627 != -1) {
            class71.field1596 = true;
        }
        if (class71.field1596) {
            if (class73.field1627 != -1 && class73.field1627 == class40.field792) {
                class3.field45++;
                class73.field1627 = -1;
                class26.field557.method178(-5, 145);
                class26.field557.method675((byte) -98, class40.field792);
            }
            class106.field2307 = true;
            class71.field1596 = false;
            class120.method879(class51.field1110, class62.field1282 % 20 < 10 ? -1 : class73.field1627, class40.field792, true, class67.field1396 == -1, class24.field509);
        }
        if (class87.field1914) {
            class87.field1914 = false;
            class106.field2307 = true;
            class103.method778(class17.field323, true, class110.field2421, class24.field509, class119.field2552, class92.field2005);
        }
        class69.field1534 = 0;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Llc;")
    public static final class69 method166(int arg0, int arg1) {
        if (arg0 != 255) {
            field532 = null;
        }
        field549++;
        return class46.method305(20025, new class69[] { class106.method791(arg1 >> 24 & 0xFF, (byte) -52), class73.field1628, class106.method791(arg1 >> 16 & 0xFF, (byte) -65), class73.field1628, class106.method791(arg1 >> 8 & 0xFF, (byte) -54), class73.field1628, class106.method791(arg1 & 0xFF, (byte) -90) });
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field519) {
            double var6 = (double) (arg1 - this.field543);
            double var8 = (double) (arg2 - this.field516);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field526 = (double) this.field538 * var6 / var10 + (double) this.field543;
            this.field523 = this.field533;
            this.field511 = (double) this.field538 * var8 / var10 + (double) this.field516;
        }
        field540++;
        if (arg4 != -19860) {
            return;
        }
        double var12 = (double) (this.field512 + 1 - arg0);
        this.field530 = ((double) arg1 - this.field526) / var12;
        this.field515 = ((double) arg2 - this.field511) / var12;
        this.field529 = Math.sqrt(this.field530 * this.field530 + this.field515 * this.field515);
        if (!this.field519) {
            this.field537 = -this.field529 * Math.tan((double) this.field544 * 0.02454369D);
        }
        this.field527 = ((double) arg3 - this.field523 - this.field537 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!e", name = "i", descriptor = "(I)V")
    public static final void method168(int arg0) {
        class62.field1271 = null;
        class76.field1711 = null;
        class27.field581 = null;
        class49.field1003 = null;
        class46.field959 = null;
        class114.field2473 = null;
        class125.field2708 = null;
        class91.field1987 = null;
        class29.field604 = null;
        if (arg0 == 1024) {
            class90.field1958 = null;
            class67.field1390 = null;
            class24.field493 = null;
            field553++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I")
    public static final int method169(int arg0, int arg1, int arg2, int arg3) {
        field554++;
        if (arg2 > 179) {
            arg3 /= 2;
        }
        if (arg2 > 192) {
            arg3 /= 2;
        }
        if (arg2 > 217) {
            arg3 /= 2;
        }
        if (arg2 > 243) {
            arg3 /= 2;
        }
        int var4 = arg2 / 2 + (arg1 / 4 << 10) + (arg3 / 32 << 7);
        return arg0 >= -125 ? 90 : var4;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field555 = arg9;
        this.field513 = arg0;
        this.field520 = arg1;
        this.field547 = arg10;
        this.field516 = arg3;
        this.field512 = arg6;
        this.field533 = arg4;
        this.field538 = arg8;
        this.field542 = arg5;
        this.field544 = arg7;
        this.field543 = arg2;
        this.field519 = false;
        int var12 = class89.method631(20, this.field513).field2485;
        if (var12 == -1) {
            this.field531 = null;
        } else {
            this.field531 = class67.method435(93, var12);
        }
    }
}
