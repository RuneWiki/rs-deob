import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 extends class137 {

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "Laf;")
    private static class7 field1829 = class48.method406(40, "Cancel");

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Laf;")
    public static class7 field1835 = class48.method406(40, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "Laf;")
    public static class7 field1843 = class48.method406(40, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "[Laf;")
    public static class7[] field1841 = new class7[1000];

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Laf;")
    public static class7 field1842 = field1829;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Laf;")
    public class7 field1837;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Ln;")
    public static class90 field1834;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Z")
    public static final boolean method667(boolean arg0) {
        if (!arg0) {
            method668(25);
        }
        field1832++;
        return class148.field3479 == 0 ? class3.field22.method626(192) : true;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
    public static final int method668(int arg0) {
        field1840++;
        return arg0 == 6 ? 6 : -113;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static final void method669(int arg0) {
        field1830++;
        if (class91.field2106 && class8.field186 != class45.field1078) {
            class131.method1070(-1, class8.field186, class45.field1080, class21.field531.field509[0], class126.field3010, class21.field531.field493[0]);
            return;
        }
        if (class8.field186 != class127.field3062) {
            class127.field3062 = class8.field186;
            class21.method195((byte) -67, class8.field186);
        }
        if (arg0 != -30553) {
            method668(34);
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public static void method670(int arg0) {
        field1842 = null;
        field1835 = null;
        field1834 = null;
        field1843 = null;
        field1841 = null;
        field1829 = null;
        if (arg0 != 18084) {
            field1843 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
    public static final void method671(int arg0) {
        field1844++;
        if (class119.field2818[96]) {
            class94.field2208 += (-class94.field2208 - 24) / 2;
        } else if (class119.field2818[97]) {
            class94.field2208 += (24 - class94.field2208) / 2;
        } else {
            class94.field2208 /= 2;
        }
        class4.field48 = class94.field2208 / 2 + class4.field48 & 0x7FF;
        if (class119.field2818[98]) {
            class19.field439 += (12 - class19.field439) / 2;
        } else if (class119.field2818[99]) {
            class19.field439 += (-class19.field439 - 12) / 2;
        } else {
            class19.field439 /= 2;
        }
        class9.field239 += class19.field439 / 2;
        if (class9.field239 < 128) {
            class9.field239 = 128;
        }
        if (class9.field239 > 383) {
            class9.field239 = 383;
        }
        int var1 = class89.field2083 + class21.field531.field505;
        int var2 = class78.field1811 + class21.field531.field491;
        if (class66.field1431 - var1 < -500 || class66.field1431 - var1 > 500 || class148.field3486 - var2 < -500 || class148.field3486 - var2 > 500) {
            class148.field3486 = var2;
            class66.field1431 = var1;
        }
        if (arg0 < 19) {
            return;
        }
        if (class66.field1431 != var1) {
            class66.field1431 += (var1 - class66.field1431) / 16;
        }
        if (class148.field3486 != var2) {
            class148.field3486 += (var2 - class148.field3486) / 16;
        }
        int var3 = class66.field1431 >> 7;
        int var4 = 0;
        int var5 = class148.field3486 >> 7;
        int var6 = class119.method921(class148.field3486, -21697, class8.field186, class66.field1431);
        if (var3 > 3 && var5 > 3 && var3 < 100 && var5 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class8.field186;
                    if (var9 < 3 && (class25.field670[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class108.field2636[var9][var7][var8];
                    if (var4 < var10) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class12.field304 < var11) {
            class12.field304 += (var11 - class12.field304) / 24;
        } else if (var11 < class12.field304) {
            class12.field304 += (var11 - class12.field304) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)Loa;")
    public static final class98 method672(boolean arg0, int arg1) {
        field1838++;
        class98 var2 = (class98) class78.field1808.method395(125, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1825.method572(3, arg0, arg1);
        class98 var4 = new class98();
        if (var3 != null) {
            var4.method800(new class122(var3), (byte) -126);
        }
        class78.field1808.method388(var4, (long) arg1, 2047);
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)V")
    public static final void method673(int arg0, long arg1) {
        field1836++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class23.method223(arg1 - 1L, 0);
            class23.method223(1L, 0);
        } else {
            class23.method223(arg1, 0);
        }
        if (arg0 != 2) {
            field1841 = null;
        }
    }
}
