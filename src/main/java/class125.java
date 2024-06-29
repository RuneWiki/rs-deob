import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class125 extends class68 {

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    private int field3060;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "[[I")
    public int[][] field3044;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "[I")
    public int[] field3057;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Lae;")
    private static class6 field3040 = class64.method474(110, "scrollbar");

    @OriginalMember(owner = "client!u", name = "I", descriptor = "[I")
    public static int[] field3050 = new int[25];

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Lae;")
    private static class6 field3047 = class64.method474(111, "Enter name of player to add to list");

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Lae;")
    public static class6 field3042 = class64.method474(109, "Sprites geladen)3");

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Lae;")
    public static class6 field3041 = class64.method474(117, "Untersuchen");

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Z")
    public static boolean field3046 = false;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "Lae;")
    public static class6 field3056 = field3047;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Z")
    public static boolean field3052 = false;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "Lae;")
    public static class6 field3051 = class64.method474(116, "");

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Lae;")
    private static class6 field3059 = class64.method474(111, "red:");

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Z")
    public static boolean field3048 = false;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lae;")
    public static class6 field3043 = field3059;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Lva;")
    public static class128 field3054;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Z")
    public static boolean field3058;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1021(byte arg0) {
        field3045++;
        if (class43.field981 == 0) {
            class81.field1967 = new class71(4, 104, 104, class137.field3331);
            for (int var1 = 0; var1 < 4; var1++) {
                class90.field2160[var1] = new class47(104, 104);
            }
            class46.field1026 = new class101(512, 512);
            class78.field1899 = 5;
            class102.field2416 = class122.field3015;
            class43.field981 = 20;
        } else if (class43.field981 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = class29.field702[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class71.method568(var2, 500, 800, 512, 334);
            class78.field1899 = 10;
            class43.field981 = 30;
            class102.field2416 = class50.field1119;
        } else {
            int var7 = -55 / ((arg0 + 38) / 46);
            if (class43.field981 == 30) {
                class77.field1822 = class78.method676(0, true, true, false, (byte) 115);
                class24.field605 = class78.method676(1, true, true, false, (byte) 115);
                class137.field3325 = class78.method676(2, false, true, true, (byte) 115);
                class68.field1507 = class78.method676(3, true, true, false, (byte) 115);
                class68.field1499 = class78.method676(4, true, true, false, (byte) 115);
                class21.field518 = class78.method676(5, true, true, true, (byte) 115);
                class41.field913 = class78.method676(6, true, false, true, (byte) 115);
                class82.field2020 = class78.method676(7, true, true, false, (byte) 115);
                class47.field1074 = class78.method676(8, true, true, false, (byte) 115);
                class121.field2930 = class78.method676(9, true, true, false, (byte) 115);
                class133.field3248 = class78.method676(10, true, true, false, (byte) 115);
                class62.field1368 = class78.method676(11, true, true, false, (byte) 115);
                class57.field1249 = class78.method676(12, true, true, false, (byte) 115);
                class108.field2577 = class78.method676(13, false, true, true, (byte) 115);
                class78.field1899 = 20;
                class102.field2416 = class88.field2114;
                class43.field981 = 40;
            } else if (class43.field981 == 40) {
                byte var8 = 0;
                int var9 = var8 + class77.field1822.method1047(0) * 5 / 100;
                int var10 = var9 + class24.field605.method1047(0) * 5 / 100;
                int var11 = var10 + class137.field3325.method1047(0) * 5 / 100;
                int var12 = var11 + class68.field1507.method1047(0) * 5 / 100;
                int var13 = var12 + class68.field1499.method1047(0) * 5 / 100;
                int var14 = var13 + class21.field518.method1047(0) * 5 / 100;
                int var15 = var14 + class41.field913.method1047(0) * 5 / 100;
                int var16 = var15 + class82.field2020.method1047(0) * 40 / 100;
                int var17 = var16 + class47.field1074.method1047(0) * 5 / 100;
                int var18 = var17 + class121.field2930.method1047(0) * 3 / 100;
                int var19 = var18 + class133.field3248.method1047(0) * 5 / 100;
                int var20 = var19 + class62.field1368.method1047(0) * 5 / 100;
                int var21 = var20 + class57.field1249.method1047(0) * 5 / 100;
                int var22 = var21 + class108.field2577.method1047(0) * 2 / 100;
                if (var22 == 100) {
                    class78.field1899 = 30;
                    class102.field2416 = class136.field3310;
                    class43.field981 = 45;
                } else {
                    if (var22 != 0) {
                        class102.field2416 = class85.method731(new class6[] { class61.field1335, class114.method942((byte) 71, var22), class134.field3283 }, 14569);
                    }
                    class78.field1899 = 30;
                }
            } else if (class43.field981 == 45) {
                class133.method1090(0, class64.field1391, 32031, !class82.field2017);
                class4.field35 = class130.method1053(false, class64.field1391, class70.field1564, 20697, 22050);
                class32.field776 = new class79(22050, class24.field603);
                class78.field1899 = 35;
                class43.field981 = 50;
                class102.field2416 = class51.field1130;
            } else if (class43.field981 == 50) {
                int var23 = 0;
                if (class2.field15 == null) {
                    class2.field15 = class58.method433(class102.field2388, class47.field1074, (byte) 32, class133.field3262);
                } else {
                    var23++;
                }
                if (class102.field2397 == null) {
                    class102.field2397 = class58.method433(class96.field2283, class47.field1074, (byte) -106, class133.field3262);
                } else {
                    var23++;
                }
                if (class56.field1229 == null) {
                    class56.field1229 = class58.method433(class111.field2674, class47.field1074, (byte) -83, class133.field3262);
                } else {
                    var23++;
                }
                if (var23 < 3) {
                    class102.field2416 = class85.method731(new class6[] { class95.field2265, class114.method942((byte) 71, var23 * 100 / 3), class134.field3283 }, 14569);
                    class78.field1899 = 40;
                } else {
                    class78.field1899 = 40;
                    class43.field981 = 60;
                    class102.field2416 = class65.field1427;
                }
            } else if (class43.field981 == 60) {
                int var24 = class26.method238(true, class133.field3248, class47.field1074);
                int var25 = class61.method454((byte) 64);
                if (var25 > var24) {
                    class102.field2416 = class85.method731(new class6[] { class109.field2648, class114.method942((byte) 71, var24 * 100 / var25), class134.field3283 }, 14569);
                    class78.field1899 = 50;
                } else {
                    class78.field1899 = 50;
                    class102.field2416 = class138.field3349;
                    class139.method1122((byte) 40, 5);
                    class43.field981 = 70;
                }
            } else if (class43.field981 == 70) {
                if (class137.field3325.method154(1278)) {
                    class130.method1056((byte) 119, class137.field3325);
                    class75.method597(16965, class137.field3325);
                    class60.method448(class82.field2020, (byte) 9, class137.field3325);
                    class38.method330(class82.field2017, class82.field2020, class137.field3325, 64);
                    class88.method746(class137.field3325, class82.field2020, 1);
                    class116.method952(class82.field2020, (byte) -113, class137.field3325, class2.field15, class30.field725);
                    class137.method1112(class24.field605, class137.field3325, class77.field1822, 102);
                    class100.method836((byte) -16, class137.field3325, class82.field2020);
                    class57.method428((byte) 80, class137.field3325);
                    class89.method753(52, class137.field3325);
                    class100.method835(class82.field2020, (byte) 64, class47.field1074, class68.field1507);
                    class102.field2416 = class103.field2445;
                    class43.field981 = 80;
                    class78.field1899 = 60;
                } else {
                    class102.field2416 = class85.method731(new class6[] { client.field479, class114.method942((byte) 71, class137.field3325.method1039(125)), class134.field3283 }, 14569);
                    class78.field1899 = 60;
                }
            } else if (class43.field981 == 80) {
                int var26 = 0;
                if (class14.field281 == null) {
                    class14.field281 = class64.method467(class70.field1568, -12078, class133.field3262, class47.field1074);
                } else {
                    var26++;
                }
                if (class32.field800 == null) {
                    class32.field800 = class64.method467(class138.field3362, -12078, class133.field3262, class47.field1074);
                } else {
                    var26++;
                }
                if (class129.field3130 == null) {
                    class129.field3130 = class90.method760((byte) 122, class47.field1074, class133.field3262, class57.field1240);
                } else {
                    var26++;
                }
                if (class41.field942 == null) {
                    class41.field942 = class78.method678(class78.field1900, class47.field1074, class133.field3262, -30253);
                } else {
                    var26++;
                }
                if (class118.field2819 == null) {
                    class118.field2819 = class78.method678(class103.field2450, class47.field1074, class133.field3262, -30253);
                } else {
                    var26++;
                }
                if (class59.field1305 == null) {
                    class59.field1305 = class78.method678(class103.field2451, class47.field1074, class133.field3262, -30253);
                } else {
                    var26++;
                }
                if (class122.field3003 == null) {
                    class122.field3003 = class78.method678(class96.field2275, class47.field1074, class133.field3262, -30253);
                } else {
                    var26++;
                }
                if (class27.field678 == null) {
                    class27.field678 = class78.method678(class12.field238, class47.field1074, class133.field3262, -30253);
                } else {
                    var26++;
                }
                if (class121.field2994 == null) {
                    class121.field2994 = class64.method467(class78.field1896, -12078, class133.field3262, class47.field1074);
                } else {
                    var26++;
                }
                if (class62.field1366 == null) {
                    class62.field1366 = class78.method678(class57.field1238, class47.field1074, class133.field3262, -30253);
                } else {
                    var26++;
                }
                if (class88.field2110 == null) {
                    class88.field2110 = class78.method678(class38.field865, class47.field1074, class133.field3262, -30253);
                } else {
                    var26++;
                }
                if (class118.field2813 == null) {
                    class118.field2813 = class78.method678(class95.field2266, class47.field1074, class133.field3262, -30253);
                } else {
                    var26++;
                }
                if (class75.field1716 == null) {
                    class75.field1716 = class90.method760((byte) -86, class47.field1074, class133.field3262, field3040);
                } else {
                    var26++;
                }
                if (class108.field2585 == null) {
                    class108.field2585 = class90.method760((byte) 99, class47.field1074, class133.field3262, class46.field1037);
                } else {
                    var26++;
                }
                if (var26 < 14) {
                    class102.field2416 = class85.method731(new class6[] { class43.field987, class114.method942((byte) 71, var26 * 100 / 14), class134.field3283 }, 14569);
                    class78.field1899 = 70;
                } else {
                    int var27 = (int) (Math.random() * 21.0D) - 10;
                    class32.field800.method869();
                    int var28 = (int) (Math.random() * 21.0D) - 10;
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    int var30 = (int) (Math.random() * 41.0D) - 20;
                    for (int var31 = 0; var31 < class41.field942.length; var31++) {
                        class41.field942[var31].method847(var27 + var30, var29 + var30, var28 + var30);
                    }
                    class129.field3130[0].method1034(var27 + var30, var29 + var30, var28 + var30);
                    class43.field981 = 85;
                    class102.field2416 = class14.field299;
                    class78.field1899 = 70;
                }
            } else if (class43.field981 == 85) {
                int var32 = class87.method741((byte) -63, class47.field1074);
                int var33 = class26.method244(false);
                if (var32 < var33) {
                    class102.field2416 = class85.method731(new class6[] { class61.field1334, class114.method942((byte) 71, var32 * 100 / var33), class134.field3283 }, 14569);
                    class78.field1899 = 80;
                } else {
                    class78.field1899 = 80;
                    class102.field2416 = client.field483;
                    class43.field981 = 90;
                }
            } else if (class43.field981 == 90) {
                if (class121.field2930.method154(1278)) {
                    class108 var34 = new class108(class121.field2930, class47.field1074, 20, 0.8D, class82.field2017 ? 64 : 128);
                    class29.method256(var34);
                    class29.method251(0.8D);
                    class43.field981 = 110;
                    class78.field1899 = 90;
                    class102.field2416 = class30.field747;
                } else {
                    class102.field2416 = class85.method731(new class6[] { class32.field771, class114.method942((byte) 71, class121.field2930.method1039(79)), class134.field3283 }, 14569);
                    class78.field1899 = 90;
                }
            } else if (class43.field981 == 110) {
                class12.field250 = new class59();
                class64.field1391.method280(-81, class12.field250, 10);
                class102.field2416 = class5.field71;
                class43.field981 = 120;
                class78.field1899 = 94;
            } else if (class43.field981 == 120) {
                if (class133.field3248.method147(22411, class133.field3262, class12.field236)) {
                    class69 var35 = new class69(class133.field3248.method162(class12.field236, class133.field3262, 114));
                    class35.method313((byte) -12, var35);
                    class78.field1899 = 96;
                    class102.field2416 = class66.field1465;
                    class43.field981 = 130;
                } else {
                    class102.field2416 = class85.method731(new class6[] { class20.field397, class77.field1855 }, 14569);
                    class78.field1899 = 96;
                }
            } else if (class43.field981 == 130) {
                if (!class68.field1507.method154(1278)) {
                    class102.field2416 = class85.method731(new class6[] { class107.field2564, class114.method942((byte) 71, class68.field1507.method1039(71) * 4 / 5), class134.field3283 }, 14569);
                    class78.field1899 = 100;
                } else if (!class57.field1249.method154(1278)) {
                    class102.field2416 = class85.method731(new class6[] { class107.field2564, class114.method942((byte) 71, class57.field1249.method1039(108) / 6 + 80), class134.field3283 }, 14569);
                    class78.field1899 = 100;
                } else if (class108.field2577.method154(1278)) {
                    class78.field1899 = 100;
                    class43.field981 = 140;
                    class102.field2416 = class62.field1351;
                } else {
                    class102.field2416 = class85.method731(new class6[] { class107.field2564, class114.method942((byte) 71, class108.field2577.method1039(74) / 20 + 96), class134.field3283 }, 14569);
                    class78.field1899 = 100;
                }
            } else if (class43.field981 == 140) {
                class139.method1122((byte) 40, 10);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V", line = 430)
    public static void method1022(int arg0) {
        field3050 = null;
        field3059 = null;
        field3042 = null;
        if (arg0 != 15003) {
            return;
        }
        field3056 = null;
        field3054 = null;
        field3041 = null;
        field3051 = null;
        field3043 = null;
        field3047 = null;
        field3040 = null;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V", line = 472)
    public static final void method1023(int arg0) {
        field3055++;
        if (arg0 < 14) {
            method1023(103);
        }
        if (class65.field1416 != 0 || class89.field2140 != 1) {
            return;
        }
        int var1 = class52.field1170 - 25 - 550;
        int var2 = class116.field2728 - 4 - 5;
        if (var1 < 0 || var2 < 0 || var1 >= 146 || var2 >= 151) {
            return;
        }
        var1 -= 73;
        int var3 = class60.field1307 + class87.field2083 & 0x7FF;
        int var4 = class29.field702[var3];
        int var5 = (class78.field1898 + 256) * var4 >> 8;
        var2 -= 75;
        int var6 = class29.field689[var3];
        int var7 = (class78.field1898 + 256) * var6 >> 8;
        int var8 = var1 * var7 + var2 * var5 >> 11;
        int var9 = class12.field229.field1783 + var8 >> 7;
        int var10 = var2 * var7 - var1 * var5 >> 11;
        int var11 = class12.field229.field1752 - var10 >> 7;
        boolean var12 = class43.method358(24134, 0, var11, 0, 1, 0, 0, true, 0, class12.field229.field1796[0], class12.field229.field1726[0], var9);
        if (!var12) {
            return;
        }
        class111.field2660.method641((byte) -28, var1);
        class111.field2660.method641((byte) -28, var2);
        class111.field2660.method667((byte) 97, class60.field1307);
        class111.field2660.method641((byte) -28, 57);
        class111.field2660.method641((byte) -28, class87.field2083);
        class111.field2660.method641((byte) -28, class78.field1898);
        class111.field2660.method641((byte) -28, 89);
        class111.field2660.method667((byte) 97, class12.field229.field1783);
        class111.field2660.method667((byte) 97, class12.field229.field1752);
        class111.field2660.method641((byte) -28, class8.field179);
        class111.field2660.method641((byte) -28, 63);
        return;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(I[B)V", line = 589)
    public class125(int arg0, byte[] arg1) {
        this.field3053 = arg0;
        class77 var3 = new class77(arg1);
        this.field3060 = var3.method620((byte) -8);
        this.field3044 = new int[this.field3060][];
        this.field3057 = new int[this.field3060];
        for (int var4 = 0; var4 < this.field3060; var4++) {
            this.field3057[var4] = var3.method620((byte) -8);
        }
        for (int var5 = 0; var5 < this.field3060; var5++) {
            this.field3044[var5] = new int[var3.method620((byte) -8)];
        }
        for (int var6 = 0; var6 < this.field3060; var6++) {
            for (int var7 = 0; var7 < this.field3044[var6].length; var7++) {
                this.field3044[var6][var7] = var3.method620((byte) -8);
            }
        }
    }
}
