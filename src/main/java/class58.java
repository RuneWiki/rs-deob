import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 extends RuntimeException {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Ljava/lang/String;")
    public String field1199;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1198;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[Lhe;")
    public static class54[] field1197 = new class54[1000];

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[[B")
    public static byte[][] field1202 = new byte[50][];

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1205 = 0;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lrd;")
    public static class114 field1195 = class84.method656("Okay", (byte) 119);

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lrd;")
    public static class114 field1206 = class84.method656("titlebox", (byte) 121);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lmd;")
    public static class84 field1194 = new class84();

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1209 = 0;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1208 = 127;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "J")
    public static long field1201;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "J")
    public static long field1210;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Ljd;")
    public static class66 field1207;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Loa;")
    public static class93 field1211;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method422(byte arg0) {
        field1194 = null;
        if (arg0 <= 51) {
            method424(null, -53, -51, -77);
        }
        field1197 = null;
        field1202 = null;
        field1195 = null;
        field1207 = null;
        field1206 = null;
        field1211 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Z")
    public static final boolean method423(boolean arg0) {
        field1196++;
        if (class18.field343 == null) {
            return false;
        }
        try {
            int var1 = class18.field343.method289((byte) -127);
            if (var1 == 0) {
                return false;
            }
            if (class66.field1423 == -1) {
                class18.field343.method293(0, class77.field1752.field1248, 1, 0);
                var1--;
                class77.field1752.field1227 = 0;
                class66.field1423 = class77.field1752.method1051(50);
                class74.field1697 = class56.field1181[class66.field1423];
            }
            if (class74.field1697 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class18.field343.method293(0, class77.field1752.field1248, 1, 0);
                class74.field1697 = class77.field1752.field1248[0] & 0xFF;
            }
            if (class74.field1697 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class18.field343.method293(0, class77.field1752.field1248, 2, 0);
                var1 -= 2;
                class77.field1752.field1227 = 0;
                class74.field1697 = class77.field1752.method467(255);
            }
            if (class74.field1697 > var1) {
                return false;
            }
            class77.field1752.field1227 = 0;
            class18.field343.method293(0, class77.field1752.field1248, class74.field1697, 0);
            class137.field3311 = class24.field462;
            class24.field462 = class123.field2882;
            class123.field2882 = class66.field1423;
            class88.field1964 = 0;
            if (class66.field1423 == 193) {
                class11.field181 = false;
                for (int var2 = 0; var2 < 5; var2++) {
                    class28.field570[var2] = false;
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 71) {
                long var3 = class77.field1752.method490(false);
                int var5 = class77.field1752.method467(255);
                int var6 = class77.field1752.method462((byte) 116);
                class114 var7 = class42.method295(-26567, var3).method863(-94);
                for (int var8 = 0; var8 < class128.field3058; var8++) {
                    if (class18.field338[var8] == var3) {
                        if (class34.field674[var8] != var5) {
                            class34.field674[var8] = var5;
                            class24.field460 = true;
                            if (var5 > 0) {
                                class86.method660(class72.field1610, class101.method786((byte) 127, new class114[] { var7, class89.field1999 }), true, 5);
                            }
                            if (var5 == 0) {
                                class86.method660(class72.field1610, class101.method786((byte) 127, new class114[] { var7, class109.field2526 }), true, 5);
                            }
                        }
                        class67.field1444[var8] = var6;
                        var7 = null;
                        break;
                    }
                }
                if (var7 != null && class128.field3058 < 200) {
                    class18.field338[class128.field3058] = var3;
                    class5.field64[class128.field3058] = var7;
                    class34.field674[class128.field3058] = var5;
                    class67.field1444[class128.field3058] = var6;
                    class32.field653 = class20.field370;
                    class24.field460 = true;
                    class128.field3058++;
                }
                boolean var9 = false;
                while (!var9) {
                    var9 = true;
                    for (int var10 = 0; var10 < class128.field3058 - 1; var10++) {
                        if (class34.field674[var10] != class117.field2741 && class34.field674[var10 + 1] == class117.field2741 || class34.field674[var10] == 0 && class34.field674[var10 + 1] != 0) {
                            var9 = false;
                            int var11 = class34.field674[var10];
                            class34.field674[var10] = class34.field674[var10 + 1];
                            class34.field674[var10 + 1] = var11;
                            class114 var12 = class5.field64[var10];
                            class5.field64[var10] = class5.field64[var10 + 1];
                            class5.field64[var10 + 1] = var12;
                            long var13 = class18.field338[var10];
                            class18.field338[var10] = class18.field338[var10 + 1];
                            class18.field338[var10 + 1] = var13;
                            int var15 = class67.field1444[var10];
                            class67.field1444[var10] = class67.field1444[var10 + 1];
                            class67.field1444[var10 + 1] = var15;
                            class24.field460 = true;
                        }
                    }
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 106) {
                for (int var16 = 0; var16 < class123.field2896.length; var16++) {
                    if (class125.field2971[var16] != class123.field2896[var16]) {
                        class123.field2896[var16] = class125.field2971[var16];
                        class72.method587((byte) -73, var16);
                        class24.field460 = true;
                    }
                }
                class66.field1423 = -1;
                class32.field653 = class20.field370;
                return true;
            }
            if (class66.field1423 == 191) {
                class47.field981 = class77.field1752.method462((byte) 116);
                class20.field372 = class77.field1752.method482(255);
                for (int var17 = class47.field981; var17 < class47.field981 + 8; var17++) {
                    for (int var18 = class20.field372; var18 < class20.field372 + 8; var18++) {
                        if (class77.field1767[class20.field346][var17][var18] != null) {
                            class77.field1767[class20.field346][var17][var18] = null;
                            class32.method237(var17, 55, var18);
                        }
                    }
                }
                for (class98 var19 = (class98) class72.field1598.method654((byte) 64); var19 != null; var19 = (class98) class72.field1598.method644((byte) -68)) {
                    if (var19.field2237 >= class47.field981 && var19.field2237 < class47.field981 + 8 && var19.field2225 >= class20.field372 && var19.field2225 < class20.field372 + 8 && class20.field346 == var19.field2233) {
                        var19.field2230 = 0;
                    }
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 59) {
                class118.field2757 = class77.field1752.method462((byte) 116);
                if (class118.field2757 == 1) {
                    class51.field1063 = class77.field1752.method467(255);
                }
                if (class118.field2757 >= 2 && class118.field2757 <= 6) {
                    if (class118.field2757 == 2) {
                        class123.field2897 = 64;
                        class11.field195 = 64;
                    }
                    if (class118.field2757 == 3) {
                        class123.field2897 = 64;
                        class11.field195 = 0;
                    }
                    if (class118.field2757 == 4) {
                        class123.field2897 = 64;
                        class11.field195 = 128;
                    }
                    if (class118.field2757 == 5) {
                        class11.field195 = 64;
                        class123.field2897 = 0;
                    }
                    if (class118.field2757 == 6) {
                        class11.field195 = 64;
                        class123.field2897 = 128;
                    }
                    class118.field2757 = 2;
                    class46.field955 = class77.field1752.method467(255);
                    class123.field2898 = class77.field1752.method467(255);
                    class80.field1810 = class77.field1752.method462((byte) 116);
                }
                if (class118.field2757 == 10) {
                    class109.field2512 = class77.field1752.method467(255);
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 13) {
                class12.field253 = class77.field1752.method462((byte) 116);
                class130.field3149 = class77.field1752.method462((byte) 116);
                class99.field2255 = class77.field1752.method462((byte) 116);
                class140.field3335 = true;
                class24.field466 = true;
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 43) {
                class24.field460 = true;
                int var20 = class77.field1752.method442((byte) -63);
                int var21 = class77.field1752.method467(255);
                if (var20 < -70000) {
                    var21 += 32768;
                }
                class90 var22;
                if (var20 < 0) {
                    var22 = null;
                } else {
                    var22 = class14.method115(65535, var20);
                }
                while (class74.field1697 > class77.field1752.field1227) {
                    int var23 = class77.field1752.method469((byte) -68);
                    int var24 = class77.field1752.method467(255);
                    int var25 = 0;
                    if (var24 != 0) {
                        var25 = class77.field1752.method462((byte) 116);
                        if (var25 == 255) {
                            var25 = class77.field1752.method442((byte) -72);
                        }
                    }
                    if (var22 != null && var23 >= 0 && var23 < var22.field2019.length) {
                        var22.field2019[var23] = var24;
                        var22.field2082[var23] = var25;
                    }
                    class49.method355(var21, 42, var25, var24 - 1, var23);
                }
                class101.field2314 = class20.field370;
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 97) {
                if (class123.field2905 != -1) {
                    class104.method800(class123.field2905, (byte) -90);
                    class123.field2905 = -1;
                    class24.field460 = true;
                    class103.field2410 = true;
                }
                if (class123.field2899 != -1) {
                    class104.method800(class123.field2899, (byte) -90);
                    class123.field2899 = -1;
                    class140.field3335 = true;
                }
                if (class34.field671 != -1) {
                    class104.method800(class34.field671, (byte) -90);
                    class34.field671 = -1;
                    class12.method101(false, 30);
                }
                if (class56.field1188 != -1) {
                    class104.method800(class56.field1188, (byte) -90);
                    class56.field1188 = -1;
                }
                if (class117.field2747 != -1) {
                    class104.method800(class117.field2747, (byte) -90);
                    class117.field2747 = -1;
                }
                class66.field1423 = -1;
                class20.field357 = -1;
                if (class142.field3382 != 0) {
                    class140.field3335 = true;
                    class142.field3382 = 0;
                }
                return true;
            }
            if (class66.field1423 == 84) {
                int var26 = class77.field1752.method462((byte) 116);
                class114 var27 = class77.field1752.method456(-1);
                int var28 = class77.field1752.method466(0);
                if (var26 >= 1 && var26 <= 5) {
                    if (var27.method886(class145.field3455, !arg0)) {
                        var27 = null;
                    }
                    class116.field2716[var26 - 1] = var27;
                    class124.field2949[var26 - 1] = var28 == 0;
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 184) {
                class106.method814((byte) -72);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 180) {
                int var29 = class77.field1752.method467(255);
                int var30 = class77.field1752.method462((byte) 116);
                int var31 = class77.field1752.method467(255);
                class12.method94(var30, -125, var31, var29);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 7) {
                int var32 = class77.field1752.method486(1331464976);
                if (class8.field120 != var32) {
                    class104.method800(class8.field120, (byte) -90);
                    class8.field120 = var32;
                }
                class140.field3335 = true;
                class77.method616((byte) -123, class8.field120);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 210) {
                int var33 = class77.field1752.method475((byte) 107);
                int var34 = class77.field1752.method470((byte) 119);
                class90 var35 = class14.method115(65535, var34);
                class66.field1423 = -1;
                var35.field2067 = var33;
                var35.field2123 = 2;
                return true;
            }
            if (class66.field1423 == 176) {
                for (int var36 = 0; var36 < class122.field2860; var36++) {
                    class86 var37 = class141.method1127(var36, -1);
                    if (var37 != null && var37.field1936 == 0) {
                        class125.field2971[var36] = 0;
                        class123.field2896[var36] = 0;
                    }
                }
                if (class8.field120 != -1) {
                    class140.field3335 = true;
                }
                class32.field653 = class20.field370;
                class24.field460 = true;
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 41) {
                int var38 = class77.field1752.method457(false);
                class82.method637(true, var38);
                if (class123.field2899 != -1) {
                    class104.method800(class123.field2899, (byte) -90);
                    class140.field3335 = true;
                    class123.field2899 = -1;
                }
                if (class34.field671 != -1) {
                    class104.method800(class34.field671, (byte) -90);
                    class34.field671 = -1;
                    class12.method101(false, 30);
                }
                if (class56.field1188 != -1) {
                    class104.method800(class56.field1188, (byte) -90);
                    class56.field1188 = -1;
                }
                if (class117.field2747 != -1) {
                    class104.method800(class117.field2747, (byte) -90);
                    class117.field2747 = -1;
                }
                if (class123.field2905 == var38) {
                    class5.method48(class123.field2905, (byte) -73);
                } else {
                    class104.method800(class123.field2905, (byte) -90);
                    class123.field2905 = var38;
                }
                class103.field2410 = true;
                class20.field357 = -1;
                class24.field460 = true;
                if (class142.field3382 != 0) {
                    class140.field3335 = true;
                    class142.field3382 = 0;
                }
                class77.method616((byte) -126, class123.field2905);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 60) {
                int var39 = class77.field1752.method480((byte) 104);
                class66.method529(var39, (byte) -122);
                class66.field1423 = -1;
                class101.field2314 = class20.field370;
                return true;
            }
            if (class66.field1423 == 167) {
                int var40 = class77.field1752.method447(false);
                int var41 = class77.field1752.method472((byte) -89);
                int var42 = class77.field1752.method446(false);
                class90 var43 = class14.method115(65535, var41);
                class66.field1423 = -1;
                var43.field2038 = var43.field2098 + var42;
                var43.field2015 = var43.field2051 + var40;
                return true;
            }
            if (class66.field1423 == 66) {
                int var44 = class77.field1752.method492((byte) -53);
                class90 var45 = class14.method115(65535, var44);
                for (int var46 = 0; var46 < var45.field2019.length; var46++) {
                    var45.field2019[var46] = -1;
                    var45.field2019[var46] = 0;
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 21) {
                if (class123.field2899 != -1) {
                    class104.method800(class123.field2899, (byte) -90);
                    class123.field2899 = -1;
                }
                class142.field3382 = 1;
                class72.field1612 = class72.field1610;
                class5.field75 = false;
                class66.field1423 = -1;
                class140.field3335 = true;
                return true;
            }
            if (class66.field1423 == 57) {
                if (class102.field2351 == 12) {
                    class24.field460 = true;
                }
                class131.field3170 = class77.field1752.method486(1331464976);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 194) {
                int var47 = class77.field1752.method442((byte) -40);
                int var48 = class77.field1752.method446(false);
                class90 var49 = class14.method115(65535, var47);
                if (var49.field2022 != var48 || var48 == -1) {
                    var49.field2042 = 0;
                    var49.field2022 = var48;
                    var49.field2007 = 0;
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 254) {
                int var50 = class77.field1752.method467(255);
                int var51 = class77.field1752.method475((byte) 102);
                int var52 = class77.field1752.method472((byte) -89);
                int var53 = class77.field1752.method457(false);
                class90 var54 = class14.method115(65535, var52);
                var54.field2008 = var53;
                var54.field2127 = var50;
                var54.field2117 = var51;
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 248) {
                class24.field460 = true;
                int var55 = class77.field1752.method442((byte) -46);
                int var56 = class77.field1752.method467(255);
                if (var55 < -70000) {
                    var56 += 32768;
                }
                class90 var57;
                if (var55 >= 0) {
                    var57 = class14.method115(65535, var55);
                } else {
                    var57 = null;
                }
                if (var57 != null) {
                    for (int var58 = 0; var58 < var57.field2019.length; var58++) {
                        var57.field2019[var58] = 0;
                        var57.field2082[var58] = 0;
                    }
                }
                class102.method792(59, var56);
                int var59 = class77.field1752.method467(255);
                for (int var60 = 0; var60 < var59; var60++) {
                    int var61 = class77.field1752.method482(255);
                    if (var61 == 255) {
                        var61 = class77.field1752.method492((byte) -53);
                    }
                    int var62 = class77.field1752.method475((byte) 111);
                    if (var57 != null && var57.field2019.length > var60) {
                        var57.field2019[var60] = var62;
                        var57.field2082[var60] = var61;
                    }
                    class49.method355(var56, 61, var61, var62 - 1, var60);
                }
                class66.field1423 = -1;
                class101.field2314 = class20.field370;
                return true;
            }
            if (class66.field1423 == 214) {
                class79.field1805 = class77.field1752.method457(arg0) * 30;
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 91 || class66.field1423 == 80 || class66.field1423 == 178 || class66.field1423 == 8 || class66.field1423 == 190 || class66.field1423 == 65 || class66.field1423 == 244 || class66.field1423 == 39 || class66.field1423 == 152 || class66.field1423 == 207 || class66.field1423 == 17) {
                class114.method851(false);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 230) {
                class11.field181 = true;
                class32.field658 = class77.field1752.method462((byte) 116);
                class144.field3418 = class77.field1752.method462((byte) 116);
                class143.field3412 = class77.field1752.method467(255);
                class77.field1757 = class77.field1752.method462((byte) 116);
                class140.field3332 = class77.field1752.method462((byte) 116);
                if (class140.field3332 >= 100) {
                    int var63 = class144.field3418 * 128 + 64;
                    int var64 = class32.field658 * 128 + 64;
                    int var65 = class137.method1110(class20.field346, var64, var63, (byte) 37) - class143.field3412;
                    int var66 = var64 - class143.field3404;
                    int var67 = var65 - class128.field3075;
                    int var68 = var63 - class99.field2253;
                    int var69 = (int) Math.sqrt((double) (var66 * var66 + var68 * var68));
                    class88.field1966 = (int) (Math.atan2((double) var67, (double) var69) * 325.949D) & 0x7FF;
                    class140.field3337 = (int) (Math.atan2((double) var66, (double) var68) * -325.949D) & 0x7FF;
                    if (class88.field1966 < 128) {
                        class88.field1966 = 128;
                    }
                    if (class88.field1966 > 383) {
                        class88.field1966 = 383;
                    }
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 37) {
                int var70 = class77.field1752.method482(255);
                int var71 = class77.field1752.method462((byte) 116);
                int var72 = class77.field1752.method451((byte) 117);
                class20.field346 = var70 >> 1;
                class7.field103.method255((byte) -121, (var70 & 0x1) == 1, var71, var72);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 145) {
                class18.method128((byte) -61);
                class66.field1423 = -1;
                return false;
            }
            if (class66.field1423 == 173) {
                int var73 = class77.field1752.method457(false);
                int var74 = class77.field1752.method470((byte) 119);
                class125.field2971[var73] = var74;
                if (class123.field2896[var73] != var74) {
                    class123.field2896[var73] = var74;
                    class72.method587((byte) -125, var73);
                    if (class8.field120 != -1) {
                        class140.field3335 = true;
                    }
                    class24.field460 = true;
                }
                class32.field653 = class20.field370;
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 255) {
                int var75 = class77.field1752.method472((byte) -89);
                boolean var76 = class77.field1752.method466(0) == 1;
                class90 var77 = class14.method115(65535, var75);
                class66.field1423 = -1;
                var77.field2092 = var76;
                return true;
            }
            if (class66.field1423 == 112) {
                class128.field3057 = class77.field1752.method480((byte) -72);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 15) {
                int var78 = class77.field1752.method492((byte) -53);
                int var79 = class77.field1752.method457(false);
                int var80 = class77.field1752.method492((byte) -53);
                if (var79 == 65535) {
                    var79 = -1;
                }
                long var81 = ((long) var78 << 32) + (long) var79;
                class67 var83 = class12.field248.method783(-1, var81);
                if (var83 != null) {
                    var83.method540(-26669);
                }
                class12.field248.method781((byte) -7, var81, new class130(var80));
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 129) {
                class73.field1630 = class77.field1752.method462((byte) 116);
                class24.field460 = true;
                class32.field653 = class20.field370;
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 19) {
                int var84 = class77.field1752.method457(arg0);
                if (var84 == 65535) {
                    var84 = -1;
                }
                class126.method973(0, var84);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 34) {
                int var85 = class77.field1752.method457(false);
                if (var85 == 65535) {
                    var85 = -1;
                }
                int var86 = class77.field1752.method458(22604);
                class46.method341(var85, var86, -69);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 220) {
                class51.method362((byte) -106);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 211) {
                class100.field2259 = class77.field1752.method462((byte) 116);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 16) {
                long var87 = class77.field1752.method490(false);
                long var89 = (long) class77.field1752.method467(255);
                long var91 = (long) class77.field1752.method493((byte) -48);
                int var93 = class77.field1752.method462((byte) 116);
                long var94 = (var89 << 32) + var91;
                boolean var96 = false;
                for (int var97 = 0; var97 < 100; var97++) {
                    if (class142.field3383[var97] == var94) {
                        var96 = true;
                        break;
                    }
                }
                if (var93 <= 1) {
                    for (int var98 = 0; var98 < class89.field1986; var98++) {
                        if (class84.field1874[var98] == var87) {
                            var96 = true;
                            break;
                        }
                    }
                }
                if (!var96 && client.field415 == 0) {
                    class142.field3383[class10.field156] = var94;
                    class10.field156 = (class10.field156 + 1) % 100;
                    class114 var99 = class61.method497(0, class77.field1752).method865(-115);
                    if (var93 == 2 || var93 == 3) {
                        class86.method660(class101.method786((byte) 127, new class114[] { class79.field1788, class42.method295(-26567, var87).method863(-85) }), var99, true, 7);
                    } else if (var93 == 1) {
                        class86.method660(class101.method786((byte) 125, new class114[] { class50.field1035, class42.method295(-26567, var87).method863(-126) }), var99, true, 7);
                    } else {
                        class86.method660(class42.method295(-26567, var87).method863(-118), var99, !arg0, 3);
                    }
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 98) {
                int var100 = class77.field1752.method472((byte) -89);
                class46.field945 = class36.field764.method300(0, var100);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 246) {
                int var101 = class77.field1752.method472((byte) -89);
                int var102 = class77.field1752.method480((byte) -127);
                int var103 = class77.field1752.method457(false);
                class90 var104 = class14.method115(65535, var101);
                class66.field1423 = -1;
                var104.field2096 = (var102 << 16) + var103;
                return true;
            }
            if (class66.field1423 == 156) {
                int var105 = class77.field1752.method475((byte) 119);
                if (var105 == 65535) {
                    var105 = -1;
                }
                int var106 = class77.field1752.method482(255);
                if (class123.field2906[var106] == var105) {
                    class5.method48(class123.field2906[var106], (byte) -124);
                } else {
                    class104.method800(class123.field2906[var106], (byte) -90);
                    class123.field2906[var106] = var105;
                }
                class103.field2410 = true;
                class24.field460 = true;
                class77.method616((byte) -124, class123.field2906[var106]);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 48) {
                int var107 = class77.field1752.method475((byte) 108);
                class82.method637(!arg0, var107);
                if (class123.field2905 != -1) {
                    class104.method800(class123.field2905, (byte) -90);
                    class24.field460 = true;
                    class103.field2410 = true;
                    class123.field2905 = -1;
                }
                if (class34.field671 != -1) {
                    class104.method800(class34.field671, (byte) -90);
                    class34.field671 = -1;
                    class12.method101(false, 30);
                }
                if (class56.field1188 != -1) {
                    class104.method800(class56.field1188, (byte) -90);
                    class56.field1188 = -1;
                }
                if (class117.field2747 != -1) {
                    class104.method800(class117.field2747, (byte) -90);
                    class117.field2747 = -1;
                }
                if (class123.field2899 == var107) {
                    class5.method48(class123.field2899, (byte) -101);
                } else {
                    class104.method800(class123.field2899, (byte) -90);
                    class123.field2899 = var107;
                }
                class20.field357 = -1;
                class77.method616((byte) -128, class123.field2899);
                class66.field1423 = -1;
                class140.field3335 = true;
                return true;
            }
            if (class66.field1423 == 53) {
                class114 var108 = class77.field1752.method456(-1);
                if (var108.method859(-31152, class63.field1353)) {
                    class114 var120 = var108.method860(var108.method858((byte) 92, class101.field2323), -23745, 0);
                    boolean var121 = false;
                    long var122 = var120.method877(29486);
                    for (int var124 = 0; var124 < class89.field1986; var124++) {
                        if (class84.field1874[var124] == var122) {
                            var121 = true;
                            break;
                        }
                    }
                    if (!var121 && client.field415 == 0) {
                        class86.method660(var120, class84.field1879, !arg0, 4);
                    }
                } else if (var108.method859(-31152, class3.field37)) {
                    class114 var109 = var108.method860(var108.method858((byte) 96, class101.field2323), -23745, 0);
                    long var110 = var109.method877(29486);
                    boolean var112 = false;
                    for (int var113 = 0; var113 < class89.field1986; var113++) {
                        if (class84.field1874[var113] == var110) {
                            var112 = true;
                            break;
                        }
                    }
                    if (!var112 && client.field415 == 0) {
                        class86.method660(var109, class99.field2246, true, 8);
                    }
                } else if (var108.method859(-31152, class63.field1344)) {
                    class114 var114 = var108.method860(var108.method858((byte) 78, class101.field2323), -23745, 0);
                    long var115 = var114.method877(29486);
                    boolean var117 = false;
                    for (int var118 = 0; var118 < class89.field1986; var118++) {
                        if (class84.field1874[var118] == var115) {
                            var117 = true;
                            break;
                        }
                    }
                    if (!var117 && client.field415 == 0) {
                        class114 var119 = var108.method860(var108.method854(-29348) - 9, -23745, var108.method858((byte) 84, class101.field2323) + 1);
                        class86.method660(var114, var119, true, 8);
                    }
                } else {
                    class86.method660(class72.field1610, var108, true, 0);
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 89) {
                long var125 = class77.field1752.method490(false);
                class114 var127 = class61.method497(0, class77.field1752).method865(-39);
                class86.method660(class42.method295(-26567, var125).method863(-118), var127, true, 6);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 162) {
                class42.method294(false, (byte) -85);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 217) {
                int var128 = class77.field1752.method467(255);
                int var129 = class77.field1752.method480((byte) 92);
                class82.method637(true, var129);
                if (var128 != -1) {
                    class82.method637(!arg0, var128);
                }
                if (class117.field2747 != -1) {
                    class104.method800(class117.field2747, (byte) -90);
                    class117.field2747 = -1;
                }
                if (class123.field2905 != -1) {
                    class104.method800(class123.field2905, (byte) -90);
                    class123.field2905 = -1;
                }
                if (class123.field2899 != -1) {
                    class104.method800(class123.field2899, (byte) -90);
                    class123.field2899 = -1;
                }
                if (class34.field671 == var129) {
                    class5.method48(class34.field671, (byte) -95);
                } else {
                    class104.method800(class34.field671, (byte) -90);
                    class34.field671 = var129;
                    class12.method101(false, 35);
                }
                if (class56.field1188 == var129) {
                    class5.method48(class56.field1188, (byte) -109);
                } else {
                    class104.method800(class56.field1188, (byte) -90);
                    class56.field1188 = var128;
                }
                class20.field357 = -1;
                class142.field3382 = 0;
                class77.method616((byte) 110, class34.field671);
                class77.method616((byte) -124, class56.field1188);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 92) {
                int var130 = class77.field1752.method472((byte) -89);
                int var131 = class77.field1752.method480((byte) -103);
                if (var131 == 65535) {
                    var131 = -1;
                }
                int var132 = class77.field1752.method470((byte) 126);
                class90 var133 = class14.method115(65535, var132);
                if (var133.field2011) {
                    var133.field2099 = var131;
                    var133.field2063 = var130;
                    class52 var135 = class128.method988(var131, false);
                    var133.field2057 = var135.field1090;
                    var133.field2008 = var135.field1112;
                    var133.field2113 = var135.field1124;
                    var133.field2023 = var135.field1105;
                    var133.field2117 = var135.field1125;
                    var133.field2127 = var135.field1089;
                    if (var133.field2032 > 0) {
                        var133.field2008 = var133.field2008 * 32 / var133.field2032;
                    }
                    class110.method843(var133, (byte) -57);
                } else if (var131 == -1) {
                    class66.field1423 = -1;
                    var133.field2123 = 0;
                    return true;
                } else {
                    class52 var134 = class128.method988(var131, false);
                    var133.field2117 = var134.field1125;
                    var133.field2008 = var134.field1112 * 100 / var130;
                    var133.field2123 = 4;
                    var133.field2067 = var131;
                    var133.field2127 = var134.field1089;
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 10) {
                if (class102.field2351 == 12) {
                    class24.field460 = true;
                }
                class107.field2472 = class77.field1752.method462((byte) 116);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 177) {
                int var136 = class77.field1752.method467(255);
                class82.method637(true, var136);
                if (class123.field2905 != -1) {
                    class104.method800(class123.field2905, (byte) -90);
                    class123.field2905 = -1;
                    class103.field2410 = true;
                    class24.field460 = true;
                }
                if (class123.field2899 != -1) {
                    class104.method800(class123.field2899, (byte) -90);
                    class123.field2899 = -1;
                    class140.field3335 = true;
                }
                if (class34.field671 != -1) {
                    class104.method800(class34.field671, (byte) -90);
                    class34.field671 = -1;
                    class12.method101(arg0, 30);
                }
                if (class56.field1188 != -1) {
                    class104.method800(class56.field1188, (byte) -90);
                    class56.field1188 = -1;
                }
                if (class117.field2747 == var136) {
                    class5.method48(class117.field2747, (byte) -104);
                } else {
                    class104.method800(class117.field2747, (byte) -90);
                    class117.field2747 = var136;
                }
                class20.field357 = -1;
                if (class142.field3382 != 0) {
                    class142.field3382 = 0;
                    class140.field3335 = true;
                }
                class77.method616((byte) -122, class117.field2747);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 90) {
                int var137 = class77.field1752.method443((byte) 127);
                if (var137 >= 0) {
                    class82.method637(true, var137);
                }
                if (class72.field1608 != var137) {
                    class104.method800(class72.field1608, (byte) -90);
                    class72.field1608 = var137;
                }
                class77.method616((byte) -123, class72.field1608);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 245) {
                int var138 = class77.field1752.method472((byte) -89);
                class114 var139 = class77.field1752.method456(-1);
                class90 var140 = class14.method115(65535, var138);
                var140.field2025 = var139;
                if (var138 >> 16 == class123.field2906[class102.field2351]) {
                    class24.field460 = true;
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 132) {
                class42.method294(true, (byte) -85);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 26) {
                for (int var141 = 0; var141 < class36.field762.length; var141++) {
                    if (class36.field762[var141] != null) {
                        class36.field762[var141].field750 = -1;
                    }
                }
                for (int var142 = 0; var142 < class123.field2894.length; var142++) {
                    if (class123.field2894[var142] != null) {
                        class123.field2894[var142].field750 = -1;
                    }
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 117) {
                class131.field3154 = class77.field1752.method462((byte) 116);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 3) {
                long var143 = class77.field1752.method490(false);
                byte var145 = class77.field1752.method449(true);
                long var146 = class77.field1752.method490(false);
                long var148 = (long) class77.field1752.method467(255);
                boolean var150 = false;
                long var151 = (long) class77.field1752.method493((byte) -99);
                long var153 = (var148 << 32) + var151;
                int var155 = class77.field1752.method462((byte) 116);
                for (int var156 = 0; var156 < 100; var156++) {
                    if (class142.field3383[var156] == var153) {
                        var150 = true;
                        break;
                    }
                }
                if (var155 <= 1) {
                    for (int var157 = 0; var157 < class89.field1986; var157++) {
                        if (class84.field1874[var157] == var143) {
                            var150 = true;
                            break;
                        }
                    }
                }
                if (!var150 && client.field415 == 0) {
                    class142.field3383[class10.field156] = var153;
                    class10.field156 = (class10.field156 + 1) % 100;
                    class114 var158 = class61.method497(0, class77.field1752).method865(-66);
                    class114 var159 = class101.method786((byte) 126, new class114[] { class38.field788, class42.method295(-26567, var146), class106.field2449, class14.method113(var145, -31766), class135.field3287 });
                    if (var155 == 2 || var155 == 3) {
                        class86.method660(class101.method786((byte) 125, new class114[] { var159, class79.field1788, class42.method295(-26567, var143).method863(-98) }), var158, true, 7);
                    } else if (var155 == 1) {
                        class86.method660(class101.method786((byte) 127, new class114[] { var159, class50.field1035, class42.method295(-26567, var143).method863(-73) }), var158, true, 7);
                    } else {
                        class86.method660(class101.method786((byte) 125, new class114[] { var159, class42.method295(-26567, var143).method863(-128) }), var158, true, 3);
                    }
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 137) {
                class72.field1615 = class77.field1752.method456(-1);
                if (class123.field2899 != -1) {
                    class104.method800(class123.field2899, (byte) -90);
                    class123.field2899 = -1;
                }
                class140.field3335 = true;
                class66.field1423 = -1;
                class5.field75 = false;
                class72.field1612 = class72.field1610;
                class142.field3382 = 4;
                return true;
            }
            if (class66.field1423 == 163) {
                class47.field981 = class77.field1752.method451((byte) 88);
                class20.field372 = class77.field1752.method482(255);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 166) {
                class102.field2351 = class77.field1752.method451((byte) 96);
                class103.field2410 = true;
                class24.field460 = true;
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 141) {
                int var160 = class77.field1752.method442((byte) -78);
                class90 var161 = class14.method115(65535, var160);
                var161.field2123 = 3;
                var161.field2067 = class7.field103.field2995.method713(70);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 83) {
                class39.field822 = class77.field1752.method451((byte) 106);
                if (class39.field822 == class102.field2351) {
                    if (class39.field822 == 3) {
                        class102.field2351 = 1;
                    } else {
                        class102.field2351 = 3;
                    }
                    class24.field460 = true;
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 63) {
                class24.field460 = true;
                int var162 = class77.field1752.method451((byte) 106);
                int var163 = class77.field1752.method451((byte) 111);
                int var164 = class77.field1752.method472((byte) -89);
                class98.field2229[var162] = var164;
                class73.field1625[var162] = var163;
                class31.field632[var162] = 1;
                for (int var165 = 0; var165 < 98; var165++) {
                    if (var164 >= class1.field7[var165]) {
                        class31.field632[var162] = var165 + 2;
                    }
                }
                class73.field1659 = class20.field370;
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 155) {
                class11.field181 = true;
                class143.field3406 = class77.field1752.method462((byte) 116);
                class55.field1150 = class77.field1752.method462((byte) 116);
                class100.field2273 = class77.field1752.method467(255);
                class65.field1397 = class77.field1752.method462((byte) 116);
                class85.field1889 = class77.field1752.method462((byte) 116);
                if (class85.field1889 >= 100) {
                    class143.field3404 = class143.field3406 * 128 + 64;
                    class99.field2253 = class55.field1150 * 128 + 64;
                    class128.field3075 = class137.method1110(class20.field346, class143.field3404, class99.field2253, (byte) 37) - class100.field2273;
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 189) {
                int var166 = class77.field1752.method467(255);
                int var167 = class77.field1752.method457(false);
                if (class123.field2899 != -1) {
                    class104.method800(class123.field2899, (byte) -90);
                    class123.field2899 = -1;
                    class140.field3335 = true;
                }
                if (class34.field671 != -1) {
                    class104.method800(class34.field671, (byte) -90);
                    class34.field671 = -1;
                    class12.method101(arg0, 30);
                }
                if (class56.field1188 != -1) {
                    class104.method800(class56.field1188, (byte) -90);
                    class56.field1188 = -1;
                }
                if (class117.field2747 == var166) {
                    class5.method48(class117.field2747, (byte) -113);
                } else {
                    class104.method800(class117.field2747, (byte) -90);
                    class117.field2747 = var166;
                }
                if (class123.field2905 == var167) {
                    class5.method48(class123.field2905, (byte) -85);
                } else {
                    class104.method800(class123.field2905, (byte) -90);
                    class123.field2905 = var167;
                }
                class103.field2410 = true;
                if (class142.field3382 != 0) {
                    class140.field3335 = true;
                    class142.field3382 = 0;
                }
                class24.field460 = true;
                class20.field357 = -1;
                class77.method616((byte) -121, class117.field2747);
                class77.method616((byte) -23, class123.field2905);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 218) {
                class114 var168 = class77.field1752.method456(-1);
                Object[] var169 = new Object[var168.method854(-29348) + 1];
                for (int var170 = var168.method854(-29348) - 1; var170 >= 0; var170--) {
                    if (var168.method861(var170, -14412) == 115) {
                        var169[var170 + 1] = class77.field1752.method456(-1);
                    } else {
                        var169[var170 + 1] = Integer.valueOf(class77.field1752.method442((byte) -23));
                    }
                }
                var169[0] = Integer.valueOf(class77.field1752.method442((byte) -90));
                class80.method636(var169, 0, 0, 0, 116, null, null);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 133) {
                class75.method610((byte) -116, class74.field1697, class36.field764, class77.field1752);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 2) {
                class89.field1986 = class74.field1697 / 8;
                for (int var171 = 0; var171 < class89.field1986; var171++) {
                    class84.field1874[var171] = class77.field1752.method490(false);
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 138) {
                int var172 = class77.field1752.method480((byte) 100);
                int var173 = class77.field1752.method442((byte) -77);
                class90 var174 = class14.method115(65535, var173);
                var174.field2067 = var172;
                var174.field2123 = 1;
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 161) {
                if (class123.field2899 != -1) {
                    class104.method800(class123.field2899, (byte) -90);
                    class123.field2899 = -1;
                }
                class5.field75 = false;
                class140.field3335 = true;
                class66.field1423 = -1;
                class142.field3382 = 2;
                class72.field1612 = class72.field1610;
                return true;
            }
            if (class66.field1423 == 72) {
                class66.field1423 = -1;
                class64.field1371 = 0;
                return true;
            }
            if (class66.field1423 == 100) {
                class47.field981 = class77.field1752.method466(0);
                class20.field372 = class77.field1752.method482(255);
                while (class74.field1697 > class77.field1752.field1227) {
                    class66.field1423 = class77.field1752.method462((byte) 116);
                    class114.method851(false);
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 74) {
                int var175 = class77.field1752.method470((byte) 121);
                int var176 = class77.field1752.method480((byte) -99);
                int var177 = var176 >> 10 & 0x1F;
                int var178 = var176 >> 5 & 0x1F;
                int var179 = var176 & 0x1F;
                class90 var180 = class14.method115(65535, var175);
                var180.field2004 = (var179 << 3) + (var177 << 19) + (var178 << 11);
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 108) {
                int var181 = class77.field1752.method480((byte) -103);
                byte var182 = class77.field1752.method485(false);
                class125.field2971[var181] = var182;
                if (class123.field2896[var181] != var182) {
                    class123.field2896[var181] = var182;
                    class72.method587((byte) -90, var181);
                    if (class8.field120 != -1) {
                        class140.field3335 = true;
                    }
                    class24.field460 = true;
                }
                class32.field653 = class20.field370;
                class66.field1423 = -1;
                return true;
            }
            if (arg0) {
                method423(true);
            }
            if (class66.field1423 == 67) {
                int var183 = class77.field1752.method472((byte) -89);
                int var184 = class77.field1752.method475((byte) 90);
                class90 var185 = class14.method115(65535, var183);
                if (var185 != null && var185.field2024 == 0) {
                    if (var184 > var185.field2017 - var185.field2044) {
                        var184 = var185.field2017 - var185.field2044;
                    }
                    if (var184 < 0) {
                        var184 = 0;
                    }
                    var185.field2013 = var184;
                }
                class66.field1423 = -1;
                return true;
            }
            if (class66.field1423 == 241) {
                int var186 = class77.field1752.method462((byte) 116);
                int var187 = class77.field1752.method462((byte) 116);
                int var188 = class77.field1752.method462((byte) 116);
                int var189 = class77.field1752.method462((byte) 116);
                class28.field570[var186] = true;
                class56.field1179[var186] = var187;
                class78.field1784[var186] = var188;
                class131.field3166[var186] = var189;
                class28.field555[var186] = 0;
                class66.field1423 = -1;
                return true;
            }
            class121.method943((byte) -122, null, "T1 - " + class66.field1423 + "," + class24.field462 + "," + class137.field3311 + " - " + class74.field1697);
            class18.method128((byte) -61);
        } catch (IOException var193) {
            class86.method663(32129);
        } catch (Exception var194) {
            String var191 = "T2 - " + class66.field1423 + "," + class24.field462 + "," + class137.field3311 + " - " + class74.field1697 + "," + (class7.field103.field748[0] + class72.field1611) + "," + (class7.field103.field758[0] + class65.field1408) + " - ";
            for (int var192 = 0; class74.field1697 > var192 && var192 < 50; var192++) {
                var191 = var191 + class77.field1752.field1248[var192] + ",";
            }
            class121.method943((byte) 15, var194, var191);
            class18.method128((byte) -61);
        }
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lpb;III)Lhe;")
    public static final class54 method424(class100 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -218) {
            field1211 = null;
        }
        field1200++;
        return class122.method955(arg2, (byte) -126, arg1, arg0) ? class75.method608((byte) 99) : null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class58(Throwable arg0, String arg1) {
        this.field1199 = arg1;
        this.field1198 = arg0;
    }
}
