import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class98 extends class42 {

    @OriginalMember(owner = "client!qb", name = "rb", descriptor = "[Lge;")
    public class41[] field2379;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "[I")
    public static int[] field2367 = new int[25];

    @OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
    public static int field2372 = 1;

    @OriginalMember(owner = "client!qb", name = "ob", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!qb", name = "mb", descriptor = "I")
    public static int field2374 = 0;

    @OriginalMember(owner = "client!qb", name = "sb", descriptor = "Lad;")
    public static class5 field2380 = class88.method674("Ausw-=hlen", 29);

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "Lad;")
    public static class5 field2369 = class88.method674("p11_full", -82);

    @OriginalMember(owner = "client!qb", name = "lb", descriptor = "Lad;")
    public static class5 field2373 = class88.method674("Wen m-Ochten Sie von der Liste entfernen?", 86);

    @OriginalMember(owner = "client!qb", name = "tb", descriptor = "Lad;")
    public static class5 field2381 = class88.method674("sich mit einer anderen Welt zu verbinden)3", -125);

    @OriginalMember(owner = "client!qb", name = "ub", descriptor = "I")
    public static int field2382 = 0;

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "Lad;")
    public static class5 field2368 = class88.method674(")1", -77);

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!qb", name = "ib", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!qb", name = "pb", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!qb", name = "qb", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!qb", name = "nb", descriptor = "Lqd;")
    public static class100 field2375;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "[I")
    public static int[] field2366;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V", line = 8)
    public static final void method789(int arg0) {
        field2370++;
        class5 var1 = null;
        if (arg0 > -93) {
            method791(-5);
        }
        for (int var2 = 0; var2 < class4.field145; var2++) {
            if (class121.field3008[var2].method32(class118.field2943, 0) != -1) {
                var1 = class121.field3008[var2].method52(class121.field3008[var2].method32(class118.field2943, 0), (byte) -84);
                break;
            }
        }
        if (var1 == null) {
            class121.method955(-26266);
            return;
        }
        int var3 = class43.field1102;
        if (var3 < 0) {
            var3 = 0;
        }
        int var4 = class88.field2054;
        int var5 = class9.field310;
        int var6 = field2371;
        if (var6 > 190) {
            var6 = 190;
        }
        int var7 = 6116423;
        class55.method443(var3, var4, var6, var5, var7);
        class55.method443(var3 + 1, var4 + 1, var6 - 2, 16, 0);
        class55.method452(var3 + 1, var4 + 18, var6 - 2, var5 + -19, 0);
        class135.field3263.method1016(var1, var3 + 3, var4 + 14, var7, false);
        int var8 = class22.field564;
        int var9 = class91.field2131;
        if (class89.field2103 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (class89.field2103 == 1) {
            var9 -= 205;
            var8 -= 553;
        }
        if (class89.field2103 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < class4.field145; var10++) {
            int var11 = 16777215;
            class5 var12 = class121.field3008[var10];
            int var13 = (class4.field145 - var10 - 1) * 15 + var4 + 31;
            if (var12.method56(-28480, var1)) {
                var12 = var12.method51((byte) -67, 0, var12.method33(115) - var1.method33(127));
                if (var12.method56(-28480, class4.field144)) {
                    var12 = var12.method51((byte) -60, 0, var12.method33(100) - class4.field144.method33(57));
                }
            }
            if (var3 < var8 && var8 < var3 + var6 && var9 > var13 - 13 && var9 < var13 + 3) {
                var11 = 16776960;
            }
            class135.field3263.method1016(var12, var3 + 3, var13, var11, true);
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V", line = 114)
    public static void method790(byte arg0) {
        field2368 = null;
        if (arg0 >= -73) {
            field2373 = null;
        }
        field2366 = null;
        field2367 = null;
        field2381 = null;
        field2369 = null;
        field2380 = null;
        field2375 = null;
        field2373 = null;
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V", line = 152)
    public static final void method791(int arg0) {
        field2377++;
        int var1 = class19.field521 + class82.field1932.field112;
        int var2 = class18.field478 + class82.field1932.field120;
        int var3 = -41 % (arg0 / 50);
        if (class105.field2567 - var1 < -500 || class105.field2567 - var1 > 500 || class89.field2107 - var2 < -500 || class89.field2107 - var2 > 500) {
            class105.field2567 = var1;
            class89.field2107 = var2;
        }
        if (class105.field2567 != var1) {
            class105.field2567 += (var1 - class105.field2567) / 16;
        }
        if (class89.field2107 != var2) {
            class89.field2107 += (var2 - class89.field2107) / 16;
        }
        if (class43.field1109[96]) {
            class3.field71 += (-class3.field71 - 24) / 2;
        } else if (class43.field1109[97]) {
            class3.field71 += (24 - class3.field71) / 2;
        } else {
            class3.field71 /= 2;
        }
        if (class43.field1109[98]) {
            class16.field442 += (12 - class16.field442) / 2;
        } else if (class43.field1109[99]) {
            class16.field442 += (-class16.field442 - 12) / 2;
        } else {
            class16.field442 /= 2;
        }
        int var4 = class105.field2567 >> 7;
        int var5 = class89.field2107 >> 7;
        class69.field1643 += class16.field442 / 2;
        if (class69.field1643 < 128) {
            class69.field1643 = 128;
        }
        if (class69.field1643 > 383) {
            class69.field1643 = 383;
        }
        int var6 = 0;
        class131.field3177 = class131.field3177 + class3.field71 / 2 & 0x7FF;
        int var7 = class95.method730(60, class105.field2567, class54.field1344, class89.field2107);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = class54.field1344;
                    if (var10 < 3 && (class12.field371[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var7 - class42.field1062[var10][var8][var9];
                    if (var6 < var11) {
                        var6 = var11;
                    }
                }
            }
        }
        int var12 = var6 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (class120.field2993 < var12) {
            class120.field2993 += (var12 - class120.field2993) / 24;
        } else if (class120.field2993 > var12) {
            class120.field2993 += (var12 - class120.field2993) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lrd;Lrd;IZ)V", line = 290)
    public class98(class106 arg0, class106 arg1, int arg2, boolean arg3) {
        class23 var5 = new class23();
        int var6 = arg0.method869(22222, arg2);
        this.field2379 = new class41[var6];
        int[] var7 = arg0.method847(arg2, 6431);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method857(30580, arg2, var7[var8]);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class135 var11 = (class135) var5.method180(0);
            class135 var12 = null;
            while (var11 != null) {
                if (var11.field3271 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class135) var5.method181(0);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method852(0, 98, var10);
                } else {
                    var13 = arg1.method852(var10, 118, 0);
                }
                var12 = new class135(var10, var13);
                var5.method176(var12, -19597);
            }
            this.field2379[var7[var8]] = new class41(var9, var12);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Z", line = 348)
    public final boolean method792(byte arg0, int arg1) {
        field2364++;
        if (arg0 != 55) {
            method789(-60);
        }
        return this.field2379[arg1].field1059;
    }
}
