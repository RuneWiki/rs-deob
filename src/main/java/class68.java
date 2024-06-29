import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 {

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
    public static int[] field1367 = new int[128];

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[Lje;")
    public static class67[] field1377 = new class67[100];

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field1380 = 0;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1373 = 0;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Lje;")
    public static class67 field1385 = class85.method592(255, "Fps:");

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "Lje;")
    public static class67 field1387 = class85.method592(255, "null");

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Lkc;")
    public static class72 field1384 = null;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1362 = -1;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "J")
    private long field1386;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "J")
    private long field1389;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
    public boolean field1363;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "[I")
    private int[] field1374;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "[I")
    private int[] field1379;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[I")
    public static int[] field1381;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
    public final void method488(int arg0, boolean arg1) {
        field1382++;
        if (this.field1363 != arg1) {
            this.method502(arg0, null, (byte) 77, this.field1374, arg1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I")
    public final int method489(int arg0) {
        if (arg0 != 0) {
            this.method488(85, false);
        }
        field1366++;
        return this.field1390 == -1 ? (this.field1379[0] << 15) + (this.field1374[4] << 20) + (this.field1379[8] << 10) + (this.field1374[0] << 25) - (-(this.field1379[11] << 5) - this.field1379[1]) : class106.method838(arg0 + 12861, this.field1390).field2541 + 305419896;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static final void method490(boolean arg0) {
        class107.field2448 = new class4();
        field1364++;
        if (arg0) {
            method494(-28);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lnc;IILnc;I)Lad;")
    public final class5 method491(class93 arg0, int arg1, int arg2, class93 arg3, int arg4) {
        field1361++;
        if (this.field1390 != -1) {
            return class106.method838(arg2 ^ 0x3231, this.field1390).method886(arg1, arg3, -15725, arg0, arg4);
        }
        long var6 = this.field1389;
        int[] var8 = this.field1379;
        if (arg3 != null && (arg3.field2080 >= 0 || arg3.field2076 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1379[var9];
            }
            if (arg3.field2080 >= 0) {
                var6 += arg3.field2080 - this.field1379[5] << 8;
                var8[5] = arg3.field2080;
            }
            if (arg3.field2076 >= 0) {
                var6 += arg3.field2076 - this.field1379[3] << 16;
                var8[3] = arg3.field2076;
            }
        }
        class5 var10 = (class5) class66.field1284.method764(var6, 24182);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class117.method937(arg2 - 9, var21 + -256).method1227(true)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class123.method961(var21 - 512, 1658).method814(this.field1363, false)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1386 != -1L) {
                    var10 = (class5) class66.field1284.method764(this.field1386, 24182);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class156[] var14 = new class156[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class156 var19 = class117.method937(3, var18 - 256).method1216(-15815);
                        if (var19 != null) {
                            var14[var13++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class156 var20 = class123.method961(var18 - 512, 1658).method820(this.field1363, -27547);
                        if (var20 != null) {
                            var14[var13++] = var20;
                        }
                    }
                }
                class156 var16 = new class156(var14, var13);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class151.field3457[var17].length > this.field1374[var17]) {
                        var16.method1195(class32.field567[var17], class151.field3457[var17][this.field1374[var17]]);
                    }
                    if (this.field1374[var17] < class31.field553[var17].length) {
                        var16.method1195(class116.field2613[var17], class31.field553[var17][this.field1374[var17]]);
                    }
                }
                var10 = var16.method1187(64, 850, -30, -50, -30);
                class66.field1284.method765(var6, var10, (byte) -28);
                this.field1386 = var6;
            }
        }
        if (arg2 != 12) {
            this.field1389 = 76L;
        }
        if (arg3 == null && arg0 == null) {
            return var10;
        }
        class5 var22;
        if (arg3 != null && arg0 != null) {
            var22 = arg3.method690(arg1, arg2 - 121, arg0, arg4, var10);
        } else if (arg3 == null) {
            var22 = arg0.method689(var10, false, arg1);
        } else {
            var22 = arg3.method689(var10, false, arg4);
        }
        return var22;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lna;B)V")
    public final void method492(class91 arg0, byte arg1) {
        if (arg1 >= -114) {
            return;
        }
        field1376++;
        arg0.method653(this.field1363 ? 1 : 0, 115);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1379[class79.field1751[var3]];
            if (var5 == 0) {
                arg0.method653(-1, 69);
            } else {
                arg0.method653(var5 - 256, 97);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method653(this.field1374[var4], 82);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZB)V")
    public final void method493(int arg0, boolean arg1, byte arg2) {
        field1371++;
        int var4 = this.field1374[arg0];
        if (arg1) {
            var4++;
            if (var4 >= class151.field3457[arg0].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class151.field3457[arg0].length - 1;
            }
        }
        this.field1374[arg0] = var4;
        this.method495(29352);
        if (arg2 != -64) {
            this.field1374 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static final void method494(int arg0) {
        if (arg0 != 256) {
            method501(null, null, null, (byte) -8);
        }
        class51.field1006 = false;
        class41.field773 = false;
        field1365++;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    private final void method495(int arg0) {
        field1368++;
        int var2 = this.field1379[5];
        if (arg0 != 29352) {
            this.method495(-116);
        }
        long var3 = this.field1389;
        int var5 = this.field1379[9];
        this.field1379[9] = var2;
        this.field1379[5] = var5;
        this.field1389 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1389 <<= 0x4;
            if (this.field1379[var6] >= 256) {
                this.field1389 += this.field1379[var6] - 256;
            }
        }
        if (this.field1379[0] >= 256) {
            this.field1389 += this.field1379[0] - 256 >> 4;
        }
        if (this.field1379[1] >= 256) {
            this.field1389 += this.field1379[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1389 <<= 0x3;
            this.field1389 += this.field1374[var7];
        }
        this.field1379[5] = var2;
        this.field1379[9] = var5;
        this.field1389 <<= 0x1;
        this.field1389 += this.field1363 ? 1 : 0;
        if (var3 != 0L && this.field1389 != var3) {
            class66.field1284.method770(false, var3);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZI)V")
    public final void method496(int arg0, boolean arg1, int arg2) {
        field1378++;
        if (arg2 == 1 && this.field1363) {
            return;
        }
        int var4 = 62 / ((arg0 + 67) / 50);
        int var5 = this.field1379[class79.field1751[arg2]];
        if (var5 == 0) {
            return;
        }
        var5 -= 256;
        class158 var6;
        do {
            if (arg1) {
                var5++;
                if (class76.field1633 <= var5) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = class76.field1633 - 1;
                }
            }
            var6 = class117.method937(3, var5);
        } while (var6 == null || var6.field3616 || arg2 + (this.field1363 ? 7 : 0) != var6.field3635);
        this.field1379[class79.field1751[arg2]] = var5 + 256;
        this.method495(29352);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILje;Lje;ILje;)V")
    public static final void method497(int arg0, class67 arg1, class67 arg2, int arg3, class67 arg4) {
        for (int var5 = 99; var5 > 0; var5--) {
            class14.field249[var5] = class14.field249[var5 - 1];
            class38.field684[var5] = class38.field684[var5 - 1];
            class152.field3485[var5] = class152.field3485[var5 - 1];
            class144.field3320[var5] = class144.field3320[var5 - 1];
        }
        if (arg3 != -1) {
            return;
        }
        field1373++;
        class118.field2652 = class86.field1899;
        class14.field249[0] = arg0;
        field1370++;
        class38.field684[0] = arg2;
        class152.field3485[0] = arg4;
        class144.field3320[0] = arg1;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public static void method498(int arg0) {
        field1367 = null;
        if (arg0 != 1) {
            method501(null, null, null, (byte) 92);
        }
        field1377 = null;
        field1384 = null;
        field1381 = null;
        field1387 = null;
        field1385 = null;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)Lwc;")
    public final class156 method499(int arg0) {
        field1360++;
        if (this.field1390 != -1) {
            return class106.method838(arg0 ^ 0x31B8, this.field1390).method892(-104);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1379[var3];
            if (var12 >= 256 && var12 < 512 && !class117.method937(3, var12 - 256).method1217(-122)) {
                var2 = true;
            }
            if (var12 >= 512 && !class123.method961(var12 - 512, 1658).method816(this.field1363, (byte) -95)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class156[] var4 = new class156[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1379[var6];
            if (var9 >= 256 && var9 < 512) {
                class156 var10 = class117.method937(3, var9 - 256).method1226(-21918);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class156 var11 = class123.method961(var9 - 512, arg0 ^ 0x5FF).method808(this.field1363, -129);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class156 var7 = new class156(var4, var5);
        int var8 = 0;
        if (arg0 != 901) {
            field1373 = -56;
        }
        while (var8 < 5) {
            if (this.field1374[var8] < class151.field3457[var8].length) {
                var7.method1195(class32.field567[var8], class151.field3457[var8][this.field1374[var8]]);
            }
            if (this.field1374[var8] < class31.field553[var8].length) {
                var7.method1195(class116.field2613[var8], class31.field553[var8][this.field1374[var8]]);
            }
            var8++;
        }
        return var7;
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)I")
    public static final int method500(int arg0) {
        field1372++;
        int var1 = class114.method924(class101.field2274, class128.field2817, class152.field3486, -118);
        if (arg0 == 512) {
            return var1 - class3.field42 >= 800 || (class82.field1809[class128.field2817][class101.field2274 >> 7][class152.field3486 >> 7] & 0x4) == 0 ? 3 : class128.field2817;
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lje;Lje;Lje;B)V")
    public static final void method501(class67 arg0, class67 arg1, class67 arg2, byte arg3) {
        field1375++;
        class106.field2412 = arg1;
        if (arg3 >= -2) {
            field1381 = null;
        }
        class106.field2423 = arg2;
        class106.field2414 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[IB[IZ)V")
    public final void method502(int arg0, int[] arg1, byte arg2, int[] arg3, boolean arg4) {
        field1388++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class76.field1633; var7++) {
                    class158 var8 = class117.method937(3, var7);
                    if (var8 != null && !var8.field3616 && var8.field3635 == (arg4 ? 7 : 0) + var6) {
                        arg1[class79.field1751[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1374 = arg3;
        if (arg2 != 77) {
            this.method491(null, 57, 80, null, -49);
        }
        this.field1379 = arg1;
        this.field1363 = arg4;
        this.field1390 = arg0;
        this.method495(29352);
    }
}
