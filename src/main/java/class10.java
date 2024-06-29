import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 {

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Laa;")
    public class2 field212 = new class2();

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lkc;")
    public static class67 field213 = class19.method144("Konfig geladen)3", 127);

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lkc;")
    public static class67 field214 = class19.method144("Side panel redrawn", 82);

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lkc;")
    public static class67 field225 = class19.method144(":tradereq:", 110);

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lgd;")
    public static class44 field207 = new class44(64);

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Lkc;")
    public static class67 field227 = class19.method144(" )2> @lre@", 127);

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Lkc;")
    private static class67 field226 = class19.method144("To play on this world move to a free area first", 117);

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Lkc;")
    public static class67 field228 = class19.method144(" weitere Optionen", 119);

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Lkc;")
    public static class67 field229 = field226;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "Lkc;")
    public static class67 field232 = class19.method144("Wen m-Ochten Sie hinzuf-Ugen?", 116);

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[Lkc;")
    public static class67[] field230 = new class67[100];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Laa;")
    private class2 field222;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Laa;", line = 7)
    public final class2 method81(int arg0) {
        if (arg0 > -45) {
            field226 = null;
        }
        class2 var2 = this.field222;
        field215++;
        if (this.field212 == var2) {
            this.field222 = null;
            return null;
        } else {
            this.field222 = var2.field27;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBII)I", line = 32)
    public static final int method82(int arg0, byte arg1, int arg2, int arg3) {
        if (arg0 > 179) {
            arg3 /= 2;
        }
        if (arg0 > 192) {
            arg3 /= 2;
        }
        if (arg0 > 217) {
            arg3 /= 2;
        }
        field206++;
        if (arg0 > 243) {
            arg3 /= 2;
        }
        if (arg1 != 8) {
            method85(50, null);
        }
        return arg0 / 2 + (arg2 / 4 << 10) + (arg3 / 32 << 7);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Laa;", line = 71)
    public final class2 method83(int arg0) {
        if (arg0 != 64) {
            return null;
        }
        class2 var2 = this.field212.field27;
        field210++;
        if (this.field212 == var2) {
            this.field222 = null;
            return null;
        } else {
            this.field222 = var2.field27;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Laa;", line = 93)
    public final class2 method84(int arg0) {
        field219++;
        if (arg0 < 76) {
            return null;
        }
        class2 var2 = this.field222;
        if (this.field212 == var2) {
            this.field222 = null;
            return null;
        } else {
            this.field222 = var2.field26;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILac;)I", line = 116)
    public static final int method85(int arg0, class4 arg1) {
        field223++;
        int var2 = 0;
        if (arg1.method25(class73.field1741, -109, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class129.field3009, 126, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class135.field3249, -40, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class77.field1837, 113, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class138.field3305, -96, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class129.field3010, 108, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class83.field1974, -61, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class108.field2439, -39, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class12.field258, 107, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class99.field2232, -79, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class69.field1645, -38, class25.field528)) {
            var2++;
        }
        if (arg0 <= 76) {
            method90((byte) 70, 44);
        }
        if (arg1.method25(class75.field1797, -40, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class90.field2074, -74, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class132.field3140, 116, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class7.field171, -44, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class111.field2544, 109, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class80.field1902, 125, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class98.field2214, -103, class25.field528)) {
            var2++;
        }
        if (arg1.method25(class125.field2917, -66, class25.field528)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Laa;", line = 197)
    public final class2 method86(int arg0) {
        if (arg0 > -11) {
            field207 = null;
        }
        field216++;
        class2 var2 = this.field212.field26;
        if (this.field212 == var2) {
            return null;
        } else {
            var2.method13(118);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 216)
    public final void method87(byte arg0) {
        if (arg0 > -37) {
            method85(-86, null);
        }
        field202++;
        while (true) {
            class2 var2 = this.field212.field27;
            if (this.field212 == var2) {
                return;
            }
            var2.method13(112);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 236)
    public static final void method88(boolean arg0) {
        field211++;
        for (class55 var1 = (class55) class25.field527.method83(64); var1 != null; var1 = (class55) class25.field527.method81(-121)) {
            if (var1.field1336 != null) {
                var1.method444((byte) 36);
            }
        }
        if (arg0) {
            method91(-41);
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V", line = 260)
    public static final void method89(int arg0) {
        field218++;
        if (arg0 >= -26) {
            field231 = -37;
        }
        class24.field511.method939((byte) -53);
        class77.field1830 = class105.method799(class77.field1830);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V", line = 277)
    public static final void method90(byte arg0, int arg1) {
        if (arg0 != -80) {
            return;
        }
        field209++;
        if (class52.field1280 == null) {
            return;
        }
        if (class48.field1163 != 0) {
            if (client.field465 == null) {
                return;
            }
            class106.field2413 = arg1;
        } else if (class97.field2189 >= 0) {
            class97.field2189 = arg1;
            class52.field1280.method451(0, arg0 + 171, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V", line = 315)
    public static void method91(int arg0) {
        if (arg0 > -45) {
            return;
        }
        field229 = null;
        field230 = null;
        field232 = null;
        field227 = null;
        field213 = null;
        field226 = null;
        field214 = null;
        field225 = null;
        field207 = null;
        field228 = null;
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V", line = 347)
    public static final void method92(int arg0) {
        field221++;
        int var1 = class84.field1975 * 128 + 64;
        int var2 = class38.field893 * 128 + 64;
        int var3 = class70.method575(var2, 1, var1, class112.field2593) - class32.field689;
        if (class127.field2980 < var1) {
            class127.field2980 += (var1 - class127.field2980) * class127.field2979 / 1000 + class81.field1930;
            if (var1 < class127.field2980) {
                class127.field2980 = var1;
            }
        }
        if (var2 > class74.field1776) {
            class74.field1776 += (var2 - class74.field1776) * class127.field2979 / 1000 + class81.field1930;
            if (var2 < class74.field1776) {
                class74.field1776 = var2;
            }
        }
        if (class127.field2980 > var1) {
            class127.field2980 -= class81.field1930 + (class127.field2980 - var1) * class127.field2979 / 1000;
            if (class127.field2980 < var1) {
                class127.field2980 = var1;
            }
        }
        if (class133.field3164 < var3) {
            class133.field3164 += class81.field1930 + (var3 - class133.field3164) * class127.field2979 / 1000;
            if (var3 < class133.field3164) {
                class133.field3164 = var3;
            }
        }
        int var4 = class132.field3134 * 128 + 64;
        if (class74.field1776 > var2) {
            class74.field1776 -= class81.field1930 + (class74.field1776 - var2) * class127.field2979 / 1000;
            if (var2 > class74.field1776) {
                class74.field1776 = var2;
            }
        }
        int var5 = class98.field2216 * 128 + 64;
        if (var3 < class133.field3164) {
            class133.field3164 -= (class133.field3164 - var3) * class127.field2979 / 1000 + class81.field1930;
            if (var3 > class133.field3164) {
                class133.field3164 = var3;
            }
        }
        int var6 = class70.method575(var5, arg0 ^ 0xFFFFFBFE, var4, class112.field2593) - class66.field1562;
        int var7 = var6 - class133.field3164;
        int var8 = var4 - class127.field2980;
        int var9 = var5 - class74.field1776;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var9)) & 0x7FF;
        if (class116.field2737 < var11) {
            class116.field2737 += (var11 - class116.field2737) * class33.field816 / 1000 + class11.field248;
            if (var11 < class116.field2737) {
                class116.field2737 = var11;
            }
        }
        int var13 = var12 - class65.field1535;
        if (arg0 > ~var13) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class116.field2737 > var11) {
            class116.field2737 -= class11.field248 + (class116.field2737 - var11) * class33.field816 / 1000;
            if (class116.field2737 < var11) {
                class116.field2737 = var11;
            }
        }
        if (var13 > 0) {
            class65.field1535 += class11.field248 + class33.field816 * var13 / 1000;
            class65.field1535 &= 0x7FF;
        }
        if (var13 < 0) {
            class65.field1535 -= -var13 * class33.field816 / 1000 + class11.field248;
            class65.field1535 &= 0x7FF;
        }
        int var14 = var12 - class65.field1535;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class65.field1535 = var12;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Laa;", line = 493)
    public final class2 method93(byte arg0) {
        field220++;
        class2 var2 = this.field212.field26;
        if (this.field212 == var2) {
            this.field222 = null;
            return null;
        } else {
            this.field222 = var2.field26;
            return arg0 == -54 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Laa;ILaa;)V", line = 514)
    public final void method94(class2 arg0, int arg1, class2 arg2) {
        field224++;
        if (arg2.field26 != null) {
            arg2.method13(119);
        }
        arg2.field26 = arg0.field26;
        int var4 = 85 % ((30 - arg1) / 41);
        arg2.field27 = arg0;
        arg2.field26.field27 = arg2;
        arg2.field27.field26 = arg2;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 591)
    public class10() {
        this.field212.field27 = this.field212;
        this.field212.field26 = this.field212;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLaa;)V", line = 549)
    public final void method95(byte arg0, class2 arg1) {
        field208++;
        if (arg1.field26 != null) {
            arg1.method13(103);
        }
        arg1.field27 = this.field212;
        arg1.field26 = this.field212.field26;
        arg1.field26.field27 = arg1;
        arg1.field27.field26 = arg1;
        if (arg0 <= 60) {
            method85(-24, null);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILaa;)V", line = 566)
    public final void method96(int arg0, class2 arg1) {
        if (arg0 != 32) {
            return;
        }
        if (arg1.field26 != null) {
            arg1.method13(95);
        }
        arg1.field27 = this.field212.field27;
        arg1.field26 = this.field212;
        field203++;
        arg1.field26.field27 = arg1;
        arg1.field27.field26 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)Laa;", line = 603)
    public final class2 method97(byte arg0) {
        if (arg0 != 81) {
            this.field222 = null;
        }
        field217++;
        class2 var2 = this.field212.field27;
        if (this.field212 == var2) {
            return null;
        } else {
            var2.method13(77);
            return var2;
        }
    }
}
