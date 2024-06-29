import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class58 {

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
    private int[] field1365 = new int[256];

    @OriginalMember(owner = "client!j", name = "l", descriptor = "[I")
    private int[] field1367 = new int[256];

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lkc;")
    public static class67 field1362 = class19.method144("Aus", 105);

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lkc;")
    public static class67 field1366 = class19.method144("Hidden)2use", 94);

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Lbb;")
    public static class10 field1369 = new class10();

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[Lkc;")
    public static class67[] field1372 = new class67[5];

    @OriginalMember(owner = "client!j", name = "r", descriptor = "[Lnd;")
    public static class86[] field1373 = new class86[1000];

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field1375 = 0;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Loc;")
    public static class91 field1374 = new class91(5000);

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Lkc;")
    public static class67 field1380 = class19.method144("mapdots", 80);

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Lkc;")
    public static class67 field1376 = class19.method144("System)2Update in: ", 80);

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field1378 = 7759444;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "Lkc;")
    public static class67 field1382 = class19.method144("Lade Eingabe)2Steuerungsprogramm)3)3)3", 78);

    @OriginalMember(owner = "client!j", name = "C", descriptor = "Lkc;")
    private static class67 field1384 = class19.method144("glow3:", 69);

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Lkc;")
    public static class67 field1377 = field1384;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Lkc;")
    private static class67 field1381 = class19.method144("Service unavailable)3", 92);

    @OriginalMember(owner = "client!j", name = "B", descriptor = "Lkc;")
    public static class67 field1383 = field1381;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lac;")
    public static class4 field1370;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)I", line = 6)
    public final int method453(int arg0) {
        if (this.field1357-- == 0) {
            this.method456((byte) -127);
            this.field1357 = 255;
        }
        field1368++;
        if (arg0 != -26972) {
            this.method455(-66);
        }
        return this.field1365[this.field1357];
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 26)
    public static void method454(byte arg0) {
        field1382 = null;
        field1383 = null;
        field1384 = null;
        if (arg0 > -40) {
            return;
        }
        field1370 = null;
        field1373 = null;
        field1366 = null;
        field1377 = null;
        field1362 = null;
        field1369 = null;
        field1374 = null;
        field1381 = null;
        field1372 = null;
        field1380 = null;
        field1376 = null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 50)
    private final void method455(int arg0) {
        if (arg0 <= 24) {
            this.field1364 = -28;
        }
        field1363++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1365[var11 + 6] + var3;
            int var38 = this.field1365[var11 + 2] + var7;
            int var39 = this.field1365[var11 + 7] + var2;
            int var40 = this.field1365[var11 + 5] + var4;
            int var41 = this.field1365[var11 + 4] + var5;
            int var42 = this.field1365[var11 + 1] + var8;
            int var43 = this.field1365[var11] + var9;
            int var44 = var43 ^ var42 << 11;
            int var45 = var38 + var42;
            int var46 = var45 ^ var38 >>> 2;
            int var47 = var41 + var46;
            int var48 = this.field1365[var11 + 3] + var6;
            int var49 = var44 + var48;
            int var50 = var38 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var47 + var49;
            var6 = var52 ^ var47 >>> 16;
            int var53 = var6 + var37;
            int var54 = var40 + var51;
            int var55 = var47 + var54;
            var5 = var55 ^ var54 << 10;
            int var56 = var53 + var54;
            var4 = var56 ^ var53 >>> 4;
            int var57 = var4 + var44;
            int var58 = var5 + var39;
            int var59 = var53 + var58;
            var3 = var59 ^ var58 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var46;
            var2 = var60 ^ var57 >>> 9;
            var9 = var8 + var57;
            this.field1367[var11] = var9;
            var7 = var2 + var51;
            this.field1367[var11 + 1] = var8;
            this.field1367[var11 + 2] = var7;
            this.field1367[var11 + 3] = var6;
            this.field1367[var11 + 4] = var5;
            this.field1367[var11 + 5] = var4;
            this.field1367[var11 + 6] = var3;
            this.field1367[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1367[var12] + var9;
            int var14 = this.field1367[var12 + 4] + var5;
            int var15 = this.field1367[var12 + 5] + var4;
            int var16 = this.field1367[var12 + 6] + var3;
            int var17 = this.field1367[var12 + 1] + var8;
            int var18 = this.field1367[var12 + 7] + var2;
            int var19 = this.field1367[var12 + 2] + var7;
            int var20 = var13 ^ var17 << 11;
            int var21 = this.field1367[var12 + 3] + var6;
            int var22 = var20 + var21;
            int var23 = var17 + var19;
            int var24 = var23 ^ var19 >>> 2;
            int var25 = var14 + var24;
            int var26 = var19 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var15 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var5 + var18;
            int var32 = var6 + var16;
            int var33 = var28 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var20;
            var3 = var34 ^ var31 << 8;
            var8 = var3 + var24;
            int var36 = var31 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field1367[var12] = var9;
            this.field1367[var12 + 1] = var8;
            this.field1367[var12 + 2] = var7;
            this.field1367[var12 + 3] = var6;
            this.field1367[var12 + 4] = var5;
            this.field1367[var12 + 5] = var4;
            this.field1367[var12 + 6] = var3;
            this.field1367[var12 + 7] = var2;
        }
        this.method456((byte) -15);
        this.field1357 = 256;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V", line = 198)
    private final void method456(byte arg0) {
        this.field1359 += ++this.field1364;
        field1371++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1367[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1356 ^= this.field1356 << 13;
                } else {
                    this.field1356 ^= this.field1356 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1356 ^= this.field1356 << 2;
            } else {
                this.field1356 ^= this.field1356 >>> 16;
            }
            this.field1356 += this.field1367[var2 + 128 & 0xFF];
            int var4;
            this.field1367[var2] = var4 = this.field1359 + this.field1356 + this.field1367[class90.method693(var3 >> 2, 255)];
            this.field1365[var2] = this.field1359 = this.field1367[class90.method693(255, var4 >> 8 >> 2)] + var3;
        }
        if (arg0 > -13) {
            this.method456((byte) -122);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 243)
    public static final void method457(int arg0) {
        field1361++;
        if (arg0 > -28 || class31.field654 == null) {
            return;
        }
        class33 var1 = class31.field654;
        class33 var2 = class11.method98((byte) 80, var1);
        if (var2 == null) {
            class31.field654 = null;
            return;
        }
        class63.field1480++;
        int[] var3 = class38.method310(false, var2);
        int[] var4 = class38.method310(false, var1);
        int var5 = class138.field3298 - class129.field3031;
        int var6 = class80.field1889 - class75.field1800;
        if (var1.field799 >= var5 && -var1.field799 <= var5 && var6 <= var1.field799 && var6 >= -var1.field799 && !class88.field2034) {
            var6 = 0;
            var5 = 0;
        } else if (class63.field1480 > var1.field795 || class88.field2034) {
            class88.field2034 = true;
        } else {
            var6 = 0;
            var5 = 0;
        }
        int var7 = var4[1] + var6 - var3[1];
        int var8 = var4[0] + var5 - var3[0];
        if (var7 < 0) {
            var7 = 0;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        if (var1.field704 + var7 > var2.field704) {
            var7 = var2.field704 - var1.field704;
        }
        if (var1.field733 + var8 > var2.field733) {
            var8 = var2.field733 - var1.field733;
        }
        if (class31.field654.field784 != null && class88.field2034) {
            class112.method853(var1, var1.field784, false, var8, 0, var7, null);
        }
        if (class90.field2084 != 0) {
            return;
        }
        if (class88.field2034) {
            int var9 = class138.field3298 - var3[0];
            if (var9 < 0) {
                var9 = 0;
            }
            int var10 = class80.field1889 - var3[1];
            if (var9 > var2.field733 - 1) {
                var9 = var2.field733 - 1;
            }
            if (var10 < 0) {
                var10 = 0;
            }
            if (var2.field704 - 1 < var10) {
                var10 = var2.field704 - 1;
            }
            class33 var11 = class76.method613(var1, var10, var2, var9, (byte) -102);
            if (class31.field654.field791 != null) {
                class112.method853(var1, var1.field791, false, var8, 0, var7, var11);
            }
            if (var11 != null && class22.method177(-111, var1) != null) {
                class54.field1295.method713(503, 182);
                class54.field1295.method1100(var1.field740, (byte) 95);
                class54.field1295.method1086((byte) -119, var11.field740);
                class61.field1437++;
                class54.field1295.method1079(-106701336, var1.field800);
                class54.field1295.method1085(var11.field800, (byte) 32);
            }
        } else {
            if (class31.field654.field697 != null) {
                class112.method853(var1, var1.field697, false, var8, 0, var7, null);
            }
            if ((class121.field2839 == 1 || class66.method512((byte) -17, class55.field1323 - 1)) && class55.field1323 > 2) {
                class135.method1048(-126);
            } else if (class55.field1323 > 0) {
                class69.method573(class55.field1323 - 1, (byte) 72);
            }
        }
        class31.field654 = null;
        return;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)I", line = 377)
    public static final int method458(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 / arg0;
        field1358++;
        int var5 = arg3 & arg0 - 1;
        if (arg2 >= -82) {
            return -15;
        }
        int var6 = arg0 - 1 & arg1;
        int var7 = arg1 / arg0;
        int var8 = class74.method603(var7, -1, var4);
        int var9 = class74.method603(var7, -1, var4 + 1);
        int var10 = class74.method603(var7 + 1, -1, var4);
        int var11 = class74.method603(var7 + 1, -1, var4 + 1);
        int var12 = class108.method828(var8, arg0, var5, var9, -7);
        int var13 = class108.method828(var10, arg0, var5, var11, 116);
        return class108.method828(var12, arg0, var6, var13, 126);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)Z", line = 426)
    public static final boolean method459(int arg0, byte arg1, int arg2) {
        int var3 = -23 / ((arg1 + 4) / 38);
        field1360++;
        if (arg2 == 0 && class21.field438 == arg0) {
            return true;
        } else if (arg2 == 1 && class5.field97 == arg0) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class44.field1069 == arg0;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "([I)V", line = 456)
    public class58(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1365[var2] = arg0[var2];
        }
        this.method455(54);
    }
}
