import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 extends class124 {

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
    public int field495 = 0;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "[B")
    public static byte[] field480 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "Lr;")
    public static class118 field487 = class153.method1136(82, "mn");

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "Lr;")
    private static class118 field483 = class153.method1136(100, ":chalreq:");

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Lr;")
    public static class118 field484 = class153.method1136(106, "Angreifen");

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field492 = 0;

    @OriginalMember(owner = "client!ce", name = "mb", descriptor = "Lr;")
    private static class118 field503 = class153.method1136(80, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "Lr;")
    private static class118 field498 = class153.method1136(82, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ce", name = "lb", descriptor = "Lr;")
    public static class118 field502 = class153.method1136(122, "<col=ffffff>");

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "Lr;")
    public static class118 field494 = class153.method1136(111, " <col=00ff80>");

    @OriginalMember(owner = "client!ce", name = "jb", descriptor = "Lr;")
    public static class118 field500 = class153.method1136(96, "Passwort: ");

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "Lr;")
    public static class118 field489 = field503;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lr;")
    public static class118 field481 = field498;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ce", name = "ib", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ce", name = "kb", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!ce", name = "nb", descriptor = "Lvd;")
    public static class150 field504;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "[S")
    public static short[] field491;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBIII)V")
    private static final void method179(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 91) {
            method180(false);
        }
        field478++;
        class97 var5 = (class97) class64.field1464.method297((long) arg3, -1);
        if (var5 == null) {
            var5 = new class97();
            class64.field1464.method288(var5, (long) arg3, (byte) -91);
        }
        if (arg2 >= var5.field2260.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field2260.length; var8++) {
                var6[var8] = var5.field2260[var8];
                var7[var8] = var5.field2262[var8];
            }
            for (int var9 = var5.field2260.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2260 = var6;
            var5.field2262 = var7;
        }
        var5.field2260[arg2] = arg0;
        var5.field2262[arg2] = arg4;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
    public static void method180(boolean arg0) {
        if (!arg0) {
            field487 = null;
        }
        field481 = null;
        field498 = null;
        field489 = null;
        field502 = null;
        field491 = null;
        field504 = null;
        field484 = null;
        field500 = null;
        field487 = null;
        field480 = null;
        field483 = null;
        field494 = null;
        field503 = null;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Z")
    public static final boolean method181(int arg0) {
        field493++;
        if (class127.field2915 == null) {
            return false;
        }
        try {
            int var1 = class127.field2915.method406(-85);
            if (var1 == 0) {
                return false;
            }
            if (class80.field1947 == -1) {
                var1--;
                class127.field2915.method402(class53.field1253.field2405, 0, (byte) -62, 1);
                class53.field1253.field2404 = 0;
                class80.field1947 = class53.field1253.method724(255);
                class88.field2140 = class37.field926[class80.field1947];
            }
            if (class88.field2140 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class127.field2915.method402(class53.field1253.field2405, 0, (byte) -62, 1);
                class88.field2140 = class53.field1253.field2405[0] & 0xFF;
            }
            if (class88.field2140 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class127.field2915.method402(class53.field1253.field2405, 0, (byte) -62, 2);
                class53.field1253.field2404 = 0;
                class88.field2140 = class53.field1253.method838((byte) 5);
            }
            if (class88.field2140 > var1) {
                return false;
            }
            class53.field1253.field2404 = 0;
            class127.field2915.method402(class53.field1253.field2405, 0, (byte) -62, class88.field2140);
            class33.field828 = class149.field3361;
            class11.field254 = 0;
            class149.field3361 = class99.field2298;
            class99.field2298 = class80.field1947;
            if (class80.field1947 == 97) {
                class61.method542((byte) -116, class53.field1253);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 143) {
                class158.method1227(false, 8);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 217) {
                class22.method207(false);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 34) {
                class82.method679(13076);
                int var2 = class53.field1253.method803(-119);
                int var3 = class53.field1253.method789((byte) -105);
                int var4 = class53.field1253.method812(-24482);
                class115.field2704[var3] = var4;
                class139.field3173[var3] = var2;
                class25.field617[var3] = 1;
                for (int var5 = 0; var5 < 98; var5++) {
                    if (var4 >= class46.field1107[var5]) {
                        class25.field617[var3] = var5 + 2;
                    }
                }
                class81.field1962[class79.method669(31, class118.field2773++)] = var3;
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 117) {
                long var6 = class53.field1253.method792(18352);
                int var8 = class53.field1253.method838((byte) 5);
                int var9 = class53.field1253.method831((byte) 76);
                class118 var10 = class131.method1014(var6, 55).method903(38);
                for (int var11 = 0; var11 < class51.field1214; var11++) {
                    if (class77.field1877[var11] == var6) {
                        if (class128.field2923[var11] != var8) {
                            class128.field2923[var11] = var8;
                            if (var8 > 0) {
                                class103.method786(class110.field2567, class144.method1066(true, new class118[] { var10, class70.field1620 }), 5, (byte) -127);
                            }
                            if (var8 == 0) {
                                class103.method786(class110.field2567, class144.method1066(true, new class118[] { var10, class59.field1384 }), 5, (byte) -126);
                            }
                        }
                        class114.field2664[var11] = var9;
                        var10 = null;
                        break;
                    }
                }
                if (var10 != null && class51.field1214 < 200) {
                    class77.field1877[class51.field1214] = var6;
                    class1.field24[class51.field1214] = var10;
                    class128.field2923[class51.field1214] = var8;
                    class114.field2664[class51.field1214] = var9;
                    class51.field1214++;
                }
                class108.field2517 = class73.field1691;
                boolean var12 = false;
                int var13 = class51.field1214;
                while (var13 > 0) {
                    var13--;
                    boolean var14 = true;
                    for (int var15 = 0; var15 < var13; var15++) {
                        if (class128.field2923[var15] != class74.field1836 && class128.field2923[var15 + 1] == class74.field1836 || class128.field2923[var15] == 0 && class128.field2923[var15 + 1] != 0) {
                            var14 = false;
                            int var16 = class128.field2923[var15];
                            class128.field2923[var15] = class128.field2923[var15 + 1];
                            class128.field2923[var15 + 1] = var16;
                            class118 var17 = class1.field24[var15];
                            class1.field24[var15] = class1.field24[var15 + 1];
                            class1.field24[var15 + 1] = var17;
                            long var18 = class77.field1877[var15];
                            class77.field1877[var15] = class77.field1877[var15 + 1];
                            class77.field1877[var15 + 1] = var18;
                            int var20 = class114.field2664[var15];
                            class114.field2664[var15] = class114.field2664[var15 + 1];
                            class114.field2664[var15 + 1] = var20;
                        }
                    }
                    if (var14) {
                        break;
                    }
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 189) {
                class74.method623(-85);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 125) {
                class2.field51 = class53.field1253.method831((byte) 76);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 47) {
                int var21 = class53.field1253.method832(-4206);
                class10.method77(arg0 - 203, var21);
                class15.field387[class79.method669(31, class26.field635++)] = class79.method669(32767, var21);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 154) {
                class118 var22 = class53.field1253.method810(arg0 + 1347010391);
                int var23 = class53.field1253.method813(arg0 ^ 0xD5);
                class74 var24 = class99.method770(arg0 - 5103, var23);
                if (!var22.method938((byte) 53, var24.field1713)) {
                    var24.field1713 = var22;
                    class26.method232((byte) 97, var24);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 248) {
                int var25 = class53.field1253.method821((byte) 52);
                int var26 = class53.field1253.method819(false);
                class74 var27 = class99.method770(-4894, var25);
                if (var27.field1772 != 2 || var27.field1826 != var26) {
                    var27.field1772 = 2;
                    var27.field1826 = var26;
                    class26.method232((byte) 55, var27);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 46) {
                class99.field2296 = class53.field1253.method838((byte) 5) * 30;
                class84.field2015 = class73.field1691;
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 130) {
                class24.field575 = true;
                class75.field1854 = class53.field1253.method831((byte) 76);
                class48.field1182 = class53.field1253.method831((byte) 76);
                class88.field2118 = class53.field1253.method838((byte) 5);
                class113.field2629 = class53.field1253.method831((byte) 76);
                class97.field2264 = class53.field1253.method831((byte) 76);
                if (class97.field2264 >= 100) {
                    class44.field1051 = class48.field1182 * 128 + 64;
                    class24.field580 = class75.field1854 * 128 + 64;
                    class85.field2093 = class46.method386(arg0 - 15395, class106.field2468, class24.field580, class44.field1051) - class88.field2118;
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 163) {
                int var28 = class53.field1253.method832(-4206);
                if (var28 == 65535) {
                    var28 = -1;
                }
                class85.method691(var28, arg0 ^ 0xFFFFFF2E);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 19) {
                int var29 = class53.field1253.method826((byte) -73);
                int var30 = class53.field1253.method832(-4206);
                if (var30 == 65535) {
                    var30 = -1;
                }
                class51.method458(var30, var29, (byte) -125);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 76) {
                int var31 = class53.field1253.method834(123);
                class115.field2701 = class95.field2247.method1123(1048576, var31);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 205) {
                class112.field2598 = class53.field1253.method831((byte) 76);
                if (class112.field2598 == 1) {
                    class14.field298 = class53.field1253.method838((byte) 5);
                }
                if (class112.field2598 >= 2 && class112.field2598 <= 6) {
                    if (class112.field2598 == 2) {
                        class115.field2673 = 64;
                        class54.field1279 = 64;
                    }
                    if (class112.field2598 == 3) {
                        class115.field2673 = 64;
                        class54.field1279 = 0;
                    }
                    if (class112.field2598 == 4) {
                        class54.field1279 = 128;
                        class115.field2673 = 64;
                    }
                    if (class112.field2598 == 5) {
                        class115.field2673 = 0;
                        class54.field1279 = 64;
                    }
                    if (class112.field2598 == 6) {
                        class54.field1279 = 64;
                        class115.field2673 = 128;
                    }
                    class112.field2598 = 2;
                    class1.field30 = class53.field1253.method838((byte) 5);
                    class36.field910 = class53.field1253.method838((byte) 5);
                    class99.field2297 = class53.field1253.method831((byte) 76);
                }
                if (class112.field2598 == 10) {
                    class24.field606 = class53.field1253.method838((byte) 5);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 136) {
                int var32 = class88.field2140 + class53.field1253.field2404;
                int var33 = class53.field1253.method838((byte) 5);
                int var34 = class53.field1253.method838((byte) 5);
                if (class48.field1167 != var33) {
                    class48.field1167 = var33;
                    class130.method1008((byte) -111, class48.field1167);
                    class75.method632(class48.field1167, true);
                    for (int var35 = 0; var35 < 100; var35++) {
                        class54.field1274[var35] = true;
                    }
                }
                while (var34-- > 0) {
                    int var36 = class53.field1253.method821((byte) 51);
                    int var37 = class53.field1253.method838((byte) 5);
                    int var38 = class53.field1253.method831((byte) 76);
                    class87 var39 = (class87) class31.field797.method297((long) var36, -1);
                    if (var39 != null && var39.field2114 != var37) {
                        class144.method1067(var39, arg0 + 29766, true);
                        var39 = null;
                    }
                    if (var39 == null) {
                        var39 = class140.method1047(true, var37, var36, var38);
                    }
                    var39.field2104 = true;
                }
                for (class87 var40 = (class87) class31.field797.method296(0); var40 != null; var40 = (class87) class31.field797.method290(-1)) {
                    if (var40.field2104) {
                        var40.field2104 = false;
                    } else {
                        class144.method1067(var40, 29975, true);
                    }
                }
                class112.field2622 = new class35(512);
                while (var32 > class53.field1253.field2404) {
                    int var41 = class53.field1253.method821((byte) 63);
                    int var42 = class53.field1253.method838((byte) 5);
                    int var43 = class53.field1253.method838((byte) 5);
                    int var44 = class53.field1253.method821((byte) 86);
                    for (int var45 = var42; var45 <= var43; var45++) {
                        long var46 = ((long) var41 << 32) + (long) var45;
                        class112.field2622.method288(new class15(var44), var46, (byte) -91);
                    }
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 99) {
                if (class48.field1167 != -1) {
                    class113.method882((byte) 126, 0, class48.field1167);
                }
                class80.field1947 = -1;
                return true;
            }
            if (arg0 != 209) {
                return false;
            }
            if (class80.field1947 == 21) {
                class82.method679(13076);
                class120.field2777 = class53.field1253.method790((byte) 127);
                class80.field1947 = -1;
                class84.field2015 = class73.field1691;
                return true;
            }
            if (class80.field1947 == 90) {
                int var48 = class53.field1253.method812(-24482);
                int var49 = class53.field1253.method832(-4206);
                if (var49 == 65535) {
                    var49 = -1;
                }
                int var50 = class53.field1253.method812(-24482);
                class74 var51 = class99.method770(-4894, var48);
                if (var51.field1805) {
                    var51.field1710 = var49;
                    var51.field1737 = var50;
                    class85 var52 = class131.method1013(arg0 ^ 0xFFFFCE0B, var49);
                    var51.field1808 = var52.field2049;
                    var51.field1796 = var52.field2052;
                    var51.field1803 = var52.field2056;
                    if (var51.field1779 > 0) {
                        var51.field1803 = var51.field1803 * 32 / var51.field1779;
                    }
                    var51.field1814 = var52.field2055;
                    var51.field1770 = var52.field2044;
                    var51.field1809 = var52.field2066;
                    class26.method232((byte) 114, var51);
                } else if (var49 == -1) {
                    class80.field1947 = -1;
                    var51.field1772 = 0;
                    return true;
                } else {
                    class85 var53 = class131.method1013(arg0 ^ 0xFFFFCE0B, var49);
                    var51.field1826 = var49;
                    var51.field1770 = var53.field2044;
                    var51.field1772 = 4;
                    var51.field1803 = var53.field2056 * 100 / var50;
                    var51.field1809 = var53.field2066;
                    class26.method232((byte) 120, var51);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 67) {
                long var54 = class53.field1253.method792(18352);
                class53.field1253.method807(false);
                long var56 = class53.field1253.method792(arg0 + 18143);
                long var58 = (long) class53.field1253.method838((byte) 5);
                long var60 = (long) class53.field1253.method799(-1);
                int var62 = class53.field1253.method831((byte) 76);
                long var63 = (var58 << 32) + var60;
                boolean var65 = false;
                for (int var66 = 0; var66 < 100; var66++) {
                    if (class32.field819[var66] == var63) {
                        var65 = true;
                        break;
                    }
                }
                if (var62 <= 1) {
                    for (int var67 = 0; var67 < class134.field3055; var67++) {
                        if (class75.field1848[var67] == var54) {
                            var65 = true;
                            break;
                        }
                    }
                }
                if (!var65 && class9.field193 == 0) {
                    class32.field819[class27.field652] = var63;
                    class27.field652 = (class27.field652 + 1) % 100;
                    class118 var68 = class8.method59(class47.method389(-3073, class53.field1253).method939((byte) 121));
                    if (var62 == 2 || var62 == 3) {
                        class53.method481(class131.method1014(var56, 18).method903(38), 9, class144.method1066(true, new class118[] { class80.field1931, class131.method1014(var54, -104).method903(38) }), (byte) 1, var68);
                    } else if (var62 == 1) {
                        class53.method481(class131.method1014(var56, 45).method903(38), 9, class144.method1066(true, new class118[] { class141.field3195, class131.method1014(var54, 88).method903(arg0 ^ 0xF7) }), (byte) 1, var68);
                    } else {
                        class53.method481(class131.method1014(var56, -105).method903(38), 9, class131.method1014(var54, arg0 - 208).method903(38), (byte) 1, var68);
                    }
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 2) {
                int var69 = class53.field1253.method821((byte) 81);
                int var70 = class53.field1253.method838((byte) 5);
                class74 var71;
                if (var69 >= 0) {
                    var71 = class99.method770(-4894, var69);
                } else {
                    var71 = null;
                }
                if (var71 != null) {
                    for (int var72 = 0; var72 < var71.field1816.length; var72++) {
                        var71.field1816[var72] = 0;
                        var71.field1743[var72] = 0;
                    }
                }
                if (var69 < -70000) {
                    var70 += 32768;
                }
                class115.method897(var70, -1);
                int var73 = class53.field1253.method838((byte) 5);
                for (int var74 = 0; var74 < var73; var74++) {
                    int var75 = class53.field1253.method797(arg0 - 88);
                    int var76 = class53.field1253.method789((byte) -66);
                    if (var76 == 255) {
                        var76 = class53.field1253.method821((byte) 117);
                    }
                    if (var71 != null && var74 < var71.field1816.length) {
                        var71.field1816[var74] = var75;
                        var71.field1743[var74] = var76;
                    }
                    method179(var75 - 1, (byte) 127, var74, var70, var76);
                }
                if (var71 != null) {
                    class26.method232((byte) 116, var71);
                }
                class82.method679(13076);
                class15.field387[class79.method669(class26.field635++, 31)] = class79.method669(var70, 32767);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 61) {
                class56.method501(class53.field1253, class95.field2247, class88.field2140, false);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 252) {
                class139.method1040(-111);
                class80.field1947 = -1;
                return false;
            }
            if (class80.field1947 == 208) {
                int var77 = class53.field1253.method790((byte) 127);
                int var78 = class53.field1253.method813(4);
                int var79 = class53.field1253.method822(83);
                class74 var80 = class99.method770(-4894, var78);
                int var81 = var80.field1705 + var79;
                int var82 = var80.field1734 + var77;
                if (var80.field1798 != var81 || var80.field1791 != var82) {
                    var80.field1798 = var81;
                    var80.field1791 = var82;
                    class26.method232((byte) 122, var80);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 4) {
                int var83 = class53.field1253.method838((byte) 5);
                int var84 = class53.field1253.method819(false);
                int var85 = class53.field1253.method797(119);
                int var86 = class53.field1253.method821((byte) 59);
                class74 var87 = class99.method770(-4894, var86);
                if (var87.field1770 != var85 || var87.field1809 != var83 || var87.field1803 != var84) {
                    var87.field1803 = var84;
                    var87.field1770 = var85;
                    var87.field1809 = var83;
                    class26.method232((byte) 64, var87);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 5) {
                int var88 = class53.field1253.method819(false);
                int var89 = var88 >> 5 & 0x1F;
                int var90 = class53.field1253.method813(4);
                int var91 = var88 >> 10 & 0x1F;
                class74 var92 = class99.method770(-4894, var90);
                int var93 = var88 & 0x1F;
                int var94 = (var89 << 11) + (var91 << 19) + (var93 << 3);
                if (var92.field1700 != var94) {
                    var92.field1700 = var94;
                    class26.method232((byte) 92, var92);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 176) {
                long var95 = class53.field1253.method792(arg0 ^ 0x4761);
                class118 var97 = class8.method59(class47.method389(-3073, class53.field1253).method939((byte) 121));
                class103.method786(class131.method1014(var95, -111).method903(38), var97, 6, (byte) -126);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 164) {
                int var98 = class53.field1253.method823(arg0 ^ 0x4693);
                int var99 = class53.field1253.method812(-24482);
                int var100 = class53.field1253.method838((byte) 5);
                class87 var101 = (class87) class31.field797.method297((long) var99, -1);
                if (var101 != null) {
                    class144.method1067(var101, arg0 ^ 0x75C6, var101.field2114 != var100);
                }
                class140.method1047(true, var100, var99, var98);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 20) {
                long var102 = class53.field1253.method792(18352);
                boolean var104 = false;
                int var105 = class53.field1253.method838((byte) 5);
                if ((Long.MIN_VALUE & var102) != 0L) {
                    var104 = true;
                }
                byte var106 = class53.field1253.method807(false);
                if (var104) {
                    if (class105.field2419 == 0) {
                        class80.field1947 = -1;
                        return true;
                    }
                    long var111 = var102 & Long.MAX_VALUE;
                    boolean var113 = false;
                    int var114;
                    for (var114 = 0; class105.field2419 > var114 && (class99.field2294[var114].field2295 != var111 || class99.field2294[var114].field1967 != var105); var114++) {
                    }
                    if (class105.field2419 > var114) {
                        while (var114 < class105.field2419 - 1) {
                            class99.field2294[var114] = class99.field2294[var114 + 1];
                            var114++;
                        }
                        class105.field2419--;
                        class99.field2294[class105.field2419] = null;
                    }
                } else {
                    class81 var107 = new class81();
                    var107.field2295 = var102;
                    var107.field1965 = class131.method1014(var107.field2295, 44);
                    var107.field1967 = var105;
                    var107.field1959 = var106;
                    int var108;
                    for (var108 = class105.field2419 - 1; var108 >= 0; var108--) {
                        int var109 = class99.field2294[var108].field1965.method910(var107.field1965, arg0 ^ 0x86);
                        if (var109 == 0) {
                            class99.field2294[var108].field1967 = var105;
                            class99.field2294[var108].field1959 = var106;
                            class51.field1213 = class73.field1691;
                            class80.field1947 = -1;
                            if (class34.field852 == var102) {
                                class51.field1239 = var106;
                            }
                            return true;
                        }
                        if (var109 < 0) {
                            break;
                        }
                    }
                    if (class99.field2294.length <= class105.field2419) {
                        class80.field1947 = -1;
                        return true;
                    }
                    for (int var110 = class105.field2419 - 1; var110 > var108; var110--) {
                        class99.field2294[var110 + 1] = class99.field2294[var110];
                    }
                    if (class105.field2419 == 0) {
                        class99.field2294 = new class81[100];
                    }
                    class99.field2294[var108 + 1] = var107;
                    if (class34.field852 == var102) {
                        class51.field1239 = var106;
                    }
                    class105.field2419++;
                }
                class80.field1947 = -1;
                class51.field1213 = class73.field1691;
                return true;
            }
            if (class80.field1947 == 218) {
                int var115 = class53.field1253.method831((byte) 76);
                int var116 = class53.field1253.method803(-109);
                int var117 = class53.field1253.method831((byte) 76);
                class106.field2468 = var116 >> 1;
                class89.field2150.method255(var117, var115, -20149, ~(var116 & 0x1) == -2);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 158) {
                long var118 = class53.field1253.method792(arg0 ^ 0x4761);
                long var120 = (long) class53.field1253.method838((byte) 5);
                long var122 = (long) class53.field1253.method799(-1);
                int var124 = class53.field1253.method831((byte) 76);
                long var125 = (var120 << 32) + var122;
                boolean var127 = false;
                for (int var128 = 0; var128 < 100; var128++) {
                    if (class32.field819[var128] == var125) {
                        var127 = true;
                        break;
                    }
                }
                if (var124 <= 1) {
                    for (int var129 = 0; var129 < class134.field3055; var129++) {
                        if (class75.field1848[var129] == var118) {
                            var127 = true;
                            break;
                        }
                    }
                }
                if (!var127 && class9.field193 == 0) {
                    class32.field819[class27.field652] = var125;
                    class27.field652 = (class27.field652 + 1) % 100;
                    class118 var130 = class8.method59(class47.method389(-3073, class53.field1253).method939((byte) 121));
                    if (var124 == 2 || var124 == 3) {
                        class103.method786(class144.method1066(true, new class118[] { class80.field1931, class131.method1014(var118, -108).method903(arg0 ^ 0xF7) }), var130, 7, (byte) -128);
                    } else if (var124 == 1) {
                        class103.method786(class144.method1066(true, new class118[] { class141.field3195, class131.method1014(var118, 105).method903(38) }), var130, 7, (byte) -128);
                    } else {
                        class103.method786(class131.method1014(var118, 30).method903(38), var130, 3, (byte) -126);
                    }
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 62) {
                int var131 = class53.field1253.method834(118);
                class74 var132 = class99.method770(arg0 ^ 0xFFFFEC33, var131);
                var132.field1772 = 3;
                var132.field1826 = class89.field2150.field2993.method553((byte) 30);
                class26.method232((byte) 112, var132);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 195) {
                int var133 = class53.field1253.method831((byte) 76);
                int var134 = class53.field1253.method831((byte) 76);
                int var135 = class53.field1253.method831((byte) 76);
                int var136 = class53.field1253.method831((byte) 76);
                class110.field2577[var133] = true;
                class45.field1071[var133] = var134;
                class83.field1998[var133] = var135;
                class74.field1835[var133] = var136;
                class35.field873[var133] = 0;
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 165) {
                int var137 = class53.field1253.method819(false);
                int var138 = class53.field1253.method834(123);
                class27.field642[var137] = var138;
                if (class92.field2193[var137] != var138) {
                    class92.field2193[var137] = var138;
                    class32.method278((byte) -57, var137);
                }
                class72.field1671[class79.method669(31, class100.field2310++)] = var137;
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 27) {
                class149.field3353 = class53.field1253.method831((byte) 76);
                class108.field2517 = class73.field1691;
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 33) {
                for (int var139 = 0; var139 < class92.field2193.length; var139++) {
                    if (class92.field2193[var139] != class27.field642[var139]) {
                        class92.field2193[var139] = class27.field642[var139];
                        class32.method278((byte) -57, var139);
                        class72.field1671[class79.method669(class100.field2310++, 31)] = var139;
                    }
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 184) {
                class118 var140 = class53.field1253.method810(arg0 + 1347010391);
                if (var140.method912(31056, class130.field2974)) {
                    class118 var141 = var140.method932(var140.method933((byte) -122, class81.field1963), (byte) -36, 0);
                    long var142 = var141.method925(0);
                    boolean var144 = false;
                    for (int var145 = 0; var145 < class134.field3055; var145++) {
                        if (class75.field1848[var145] == var142) {
                            var144 = true;
                            break;
                        }
                    }
                    if (!var144 && class9.field193 == 0) {
                        class103.method786(var141, class14.field304, 4, (byte) -127);
                    }
                } else if (var140.method912(31056, class134.field3058)) {
                    boolean var146 = false;
                    class118 var147 = var140.method932(var140.method933((byte) -122, class81.field1963), (byte) -82, 0);
                    long var148 = var147.method925(arg0 ^ 0xD1);
                    for (int var150 = 0; var150 < class134.field3055; var150++) {
                        if (class75.field1848[var150] == var148) {
                            var146 = true;
                            break;
                        }
                    }
                    if (!var146 && class9.field193 == 0) {
                        class103.method786(var147, class148.field3305, 8, (byte) -127);
                    }
                } else if (var140.method912(31056, field483)) {
                    class118 var159 = var140.method932(var140.method933((byte) -124, class81.field1963), (byte) -25, 0);
                    long var160 = var159.method925(0);
                    boolean var162 = false;
                    for (int var163 = 0; var163 < class134.field3055; var163++) {
                        if (class75.field1848[var163] == var160) {
                            var162 = true;
                            break;
                        }
                    }
                    if (!var162 && class9.field193 == 0) {
                        class118 var164 = var140.method932(var140.method935(-77) - 9, (byte) -54, var140.method933((byte) -82, class81.field1963) + 1);
                        class103.method786(var159, var164, 8, (byte) -128);
                    }
                } else if (var140.method912(31056, class112.field2620)) {
                    class118 var151 = var140.method932(var140.method933((byte) -122, class81.field1963), (byte) 3, 0);
                    long var152 = var151.method925(0);
                    boolean var154 = false;
                    for (int var155 = 0; var155 < class134.field3055; var155++) {
                        if (class75.field1848[var155] == var152) {
                            var154 = true;
                            break;
                        }
                    }
                    if (!var154 && class9.field193 == 0) {
                        class103.method786(var151, class110.field2567, 10, (byte) -127);
                    }
                } else if (var140.method912(31056, class139.field3159)) {
                    class118 var156 = var140.method932(var140.method933((byte) -123, class139.field3159), (byte) 124, 0);
                    class103.method786(class110.field2567, var156, 11, (byte) -128);
                } else if (var140.method912(31056, class94.field2232)) {
                    class118 var158 = var140.method932(var140.method933((byte) -124, class94.field2232), (byte) 122, 0);
                    if (class9.field193 == 0) {
                        class103.method786(class110.field2567, var158, 12, (byte) -128);
                    }
                } else if (var140.method912(31056, class138.field3147)) {
                    class118 var157 = var140.method932(var140.method933((byte) -88, class138.field3147), (byte) 20, 0);
                    if (class9.field193 == 0) {
                        class103.method786(class110.field2567, var157, 13, (byte) -128);
                    }
                } else {
                    class103.method786(class110.field2567, var140, 0, (byte) -128);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 57) {
                class146.field3256 = class53.field1253.method831((byte) 76);
                class80.field1936 = class53.field1253.method831((byte) 76);
                field492 = class53.field1253.method831((byte) 76);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 213) {
                int var165 = class53.field1253.method821((byte) 104);
                int var166 = class53.field1253.method812(arg0 ^ 0xFFFFA08F);
                int var167 = class53.field1253.method797(122);
                if (var167 == 65535) {
                    var167 = -1;
                }
                int var168 = class53.field1253.method797(arg0 ^ 0xA3);
                if (var168 == 65535) {
                    var168 = -1;
                }
                for (int var169 = var168; var169 <= var167; var169++) {
                    long var170 = ((long) var165 << 32) + (long) var169;
                    class99 var172 = class112.field2622.method297(var170, arg0 - 210);
                    if (var172 != null) {
                        var172.method768(-1);
                    }
                    class112.field2622.method288(new class15(var166), var170, (byte) -91);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 177) {
                int var173 = class53.field1253.method819(false);
                int var174 = class53.field1253.method834(121);
                class74 var175 = class99.method770(-4894, var174);
                if (var175 != null && var175.field1807 == 0) {
                    if (var173 > var175.field1792 - var175.field1748) {
                        var173 = var175.field1792 - var175.field1748;
                    }
                    if (var173 < 0) {
                        var173 = 0;
                    }
                    if (var175.field1789 != var173) {
                        var175.field1789 = var173;
                        class26.method232((byte) 117, var175);
                    }
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 132) {
                int var176 = class53.field1253.method819(false);
                class48.field1167 = var176;
                class130.method1008((byte) -111, var176);
                class75.method632(class48.field1167, true);
                for (int var177 = 0; var177 < 100; var177++) {
                    class54.field1274[var177] = true;
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 60) {
                int var178 = class53.field1253.method821((byte) 126);
                int var179 = class53.field1253.method797(117);
                class74 var180 = class99.method770(-4894, var178);
                if (var180.field1772 != 1 || var180.field1826 != var179) {
                    var180.field1772 = 1;
                    var180.field1826 = var179;
                    class26.method232((byte) 123, var180);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 28) {
                int var181 = class53.field1253.method838((byte) 5);
                int var182 = class53.field1253.method831((byte) 76);
                int var183 = class53.field1253.method838((byte) 5);
                class124.method964(true, var183, var181, var182);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 224) {
                for (int var184 = 0; var184 < class128.field2954; var184++) {
                    class130 var185 = class91.method731(false, var184);
                    if (var185 != null && var185.field2969 == 0) {
                        class27.field642[var184] = 0;
                        class92.field2193[var184] = 0;
                    }
                }
                class82.method679(13076);
                class80.field1947 = -1;
                class100.field2310 += 32;
                return true;
            }
            if (class80.field1947 == 145 || class80.field1947 == 242 || class80.field1947 == 100 || class80.field1947 == 167 || class80.field1947 == 175 || class80.field1947 == 209 || class80.field1947 == 116 || class80.field1947 == 146 || class80.field1947 == 230 || class80.field1947 == 178 || class80.field1947 == 92) {
                class127.method986(-19910);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 169) {
                int var186 = class53.field1253.method813(4);
                int var187 = class53.field1253.method814(108);
                class74 var188 = class99.method770(-4894, var186);
                if (var188.field1726 != var187 || var187 == -1) {
                    var188.field1707 = 0;
                    var188.field1726 = var187;
                    var188.field1810 = 0;
                    class26.method232((byte) 118, var188);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 198) {
                class110.field2561 = 0;
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 87) {
                class118 var189 = class53.field1253.method810(1347010600);
                int var190 = class53.field1253.method831((byte) 76);
                int var191 = class53.field1253.method803(-109);
                if (var190 >= 1 && var190 <= 8) {
                    if (var189.method911(class142.field3217, 14934)) {
                        var189 = null;
                    }
                    class84.field2023[var190 - 1] = var189;
                    class103.field2383[var190 - 1] = var191 == 0;
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 204) {
                class91.field2182 = class53.field1253.method803(-111);
                class14.field360 = class53.field1253.method803(-122);
                for (int var192 = class14.field360; var192 < class14.field360 + 8; var192++) {
                    for (int var193 = class91.field2182; var193 < class91.field2182 + 8; var193++) {
                        if (class84.field2022[class106.field2468][var192][var193] != null) {
                            class84.field2022[class106.field2468][var192][var193] = null;
                            class35.method289(var193, 0, var192);
                        }
                    }
                }
                for (class13 var194 = (class13) class112.field2607.method889(-53); var194 != null; var194 = (class13) class112.field2607.method884(true)) {
                    if (class14.field360 <= var194.field282 && var194.field282 < class14.field360 + 8 && var194.field279 >= class91.field2182 && class91.field2182 + 8 > var194.field279 && class106.field2468 == var194.field280) {
                        var194.field273 = 0;
                    }
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 80) {
                class24.field575 = false;
                for (int var195 = 0; var195 < 5; var195++) {
                    class110.field2577[var195] = false;
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 6) {
                int var196 = class53.field1253.method838((byte) 5);
                byte var197 = class53.field1253.method847(-10482);
                class27.field642[var196] = var197;
                if (class92.field2193[var196] != var197) {
                    class92.field2193[var196] = var197;
                    class32.method278((byte) -57, var196);
                }
                class72.field1671[class79.method669(31, class100.field2310++)] = var196;
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 142) {
                class14.field360 = class53.field1253.method823(17986);
                class91.field2182 = class53.field1253.method789((byte) -96);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 110) {
                int var198 = class53.field1253.method821((byte) 51);
                int var199 = class53.field1253.method838((byte) 5);
                class74 var200;
                if (var198 < 0) {
                    var200 = null;
                } else {
                    var200 = class99.method770(-4894, var198);
                }
                if (var198 < -70000) {
                    var199 += 32768;
                }
                while (class88.field2140 > class53.field1253.field2404) {
                    int var201 = class53.field1253.method815((byte) 125);
                    int var202 = class53.field1253.method838((byte) 5);
                    int var203 = 0;
                    if (var202 != 0) {
                        var203 = class53.field1253.method831((byte) 76);
                        if (var203 == 255) {
                            var203 = class53.field1253.method821((byte) 61);
                        }
                    }
                    if (var200 != null && var201 >= 0 && var200.field1816.length > var201) {
                        var200.field1816[var201] = var202;
                        var200.field1743[var201] = var203;
                    }
                    method179(var202 - 1, (byte) 110, var201, var199, var203);
                }
                if (var200 != null) {
                    class26.method232((byte) 107, var200);
                }
                class82.method679(13076);
                class15.field387[class79.method669(31, class26.field635++)] = class79.method669(32767, var199);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 232) {
                class82.method679(13076);
                class31.field796 = class53.field1253.method831((byte) 76);
                class80.field1947 = -1;
                class84.field2015 = class73.field1691;
                return true;
            }
            if (class80.field1947 == 220) {
                boolean var204 = class53.field1253.method789((byte) -79) == 1;
                int var205 = class53.field1253.method813(arg0 ^ 0xD5);
                class74 var206 = class99.method770(arg0 - 5103, var205);
                if (var206.field1840 != var204) {
                    var206.field1840 = var204;
                    class26.method232((byte) 101, var206);
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 187) {
                class158.method1227(true, arg0 ^ 0xD9);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 38) {
                int var207 = class53.field1253.method821((byte) 86);
                class74 var208 = class99.method770(-4894, var207);
                for (int var209 = 0; var209 < var208.field1816.length; var209++) {
                    var208.field1816[var209] = -1;
                    var208.field1816[var209] = 0;
                }
                class26.method232((byte) 85, var208);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 39) {
                class134.field3055 = class88.field2140 / 8;
                for (int var210 = 0; var210 < class134.field3055; var210++) {
                    class75.field1848[var210] = class53.field1253.method792(arg0 + 18143);
                    class122.field2824[var210] = class131.method1014(class75.field1848[var210], -128);
                }
                class108.field2517 = class73.field1691;
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 3) {
                for (int var211 = 0; var211 < class108.field2526.length; var211++) {
                    if (class108.field2526[var211] != null) {
                        class108.field2526[var211].field746 = -1;
                    }
                }
                for (int var212 = 0; var212 < class74.field1833.length; var212++) {
                    if (class74.field1833[var212] != null) {
                        class74.field1833[var212].field746 = -1;
                    }
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 112) {
                class118 var213 = class53.field1253.method810(1347010600);
                Object[] var214 = new Object[var213.method935(-74) + 1];
                for (int var215 = var213.method935(-122) - 1; var215 >= 0; var215--) {
                    if (var213.method916(arg0 ^ 0xFFFF9E3A, var215) == 115) {
                        var214[var215 + 1] = class53.field1253.method810(class47.method392(arg0, 1347010809));
                    } else {
                        var214[var215 + 1] = Integer.valueOf(class53.field1253.method821((byte) 63));
                    }
                }
                var214[0] = Integer.valueOf(class53.field1253.method821((byte) 88));
                class136 var216 = new class136();
                var216.field3067 = var214;
                class83.method681(var216, (byte) -112);
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 113) {
                class51.field1213 = class73.field1691;
                long var217 = class53.field1253.method792(18352);
                if (var217 == 0L) {
                    class80.field1947 = -1;
                    class94.field2231 = null;
                    class99.field2294 = null;
                    class72.field1674 = null;
                    class105.field2419 = 0;
                    return true;
                }
                long var219 = class53.field1253.method792(18352);
                class94.field2231 = class131.method1014(var219, -122);
                class72.field1674 = class131.method1014(var217, -111);
                class159.field3668 = class53.field1253.method807(false);
                int var221 = class53.field1253.method831((byte) 76);
                if (var221 == 255) {
                    class80.field1947 = -1;
                    return true;
                }
                class105.field2419 = var221;
                class81[] var222 = new class81[100];
                for (int var223 = 0; var223 < class105.field2419; var223++) {
                    var222[var223] = new class81();
                    var222[var223].field2295 = class53.field1253.method792(arg0 + 18143);
                    var222[var223].field1965 = class131.method1014(var222[var223].field2295, 41);
                    var222[var223].field1967 = class53.field1253.method838((byte) 5);
                    var222[var223].field1959 = class53.field1253.method807(false);
                    if (class34.field852 == var222[var223].field2295) {
                        class51.field1239 = var222[var223].field1959;
                    }
                }
                boolean var224 = false;
                int var225 = class105.field2419;
                while (var225 > 0) {
                    var225--;
                    boolean var226 = true;
                    for (int var227 = 0; var227 < var225; var227++) {
                        if (var222[var227].field1965.method910(var222[var227 + 1].field1965, 41) > 0) {
                            class81 var228 = var222[var227];
                            var222[var227] = var222[var227 + 1];
                            var226 = false;
                            var222[var227 + 1] = var228;
                        }
                    }
                    if (var226) {
                        break;
                    }
                }
                class80.field1947 = -1;
                class99.field2294 = var222;
                return true;
            }
            if (class80.field1947 == 159) {
                int var229 = class53.field1253.method819(false);
                int var230 = class53.field1253.method832(-4206);
                int var231 = class53.field1253.method813(4);
                class74 var232 = class99.method770(arg0 - 5103, var231);
                class80.field1947 = -1;
                var232.field1821 = (var230 << 16) + var229;
                return true;
            }
            if (class80.field1947 == 196) {
                class24.field575 = true;
                class115.field2693 = class53.field1253.method831((byte) 76);
                class19.field468 = class53.field1253.method831((byte) 76);
                class10.field243 = class53.field1253.method838((byte) 5);
                class64.field1457 = class53.field1253.method831((byte) 76);
                class33.field840 = class53.field1253.method831((byte) 76);
                if (class33.field840 >= 100) {
                    int var233 = class115.field2693 * 128 + 64;
                    int var234 = class19.field468 * 128 + 64;
                    int var235 = class46.method386(-15186, class106.field2468, var233, var234) - class10.field243;
                    int var236 = var233 - class24.field580;
                    int var237 = var235 - class85.field2093;
                    int var238 = var234 - class44.field1051;
                    int var239 = (int) Math.sqrt((double) (var236 * var236 + var238 * var238));
                    class85.field2092 = (int) (Math.atan2((double) var237, (double) var239) * 325.949D) & 0x7FF;
                    class1.field25 = (int) (Math.atan2((double) var236, (double) var238) * -325.949D) & 0x7FF;
                    if (class85.field2092 < 128) {
                        class85.field2092 = 128;
                    }
                    if (class85.field2092 > 383) {
                        class85.field2092 = 383;
                    }
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 14) {
                int var240 = class53.field1253.method821((byte) 72);
                class87 var241 = (class87) class31.field797.method297((long) var240, arg0 ^ 0xFFFFFF2E);
                if (var241 != null) {
                    class144.method1067(var241, 29975, true);
                }
                if (class101.field2351 != null) {
                    class26.method232((byte) 127, class101.field2351);
                    class101.field2351 = null;
                }
                class80.field1947 = -1;
                return true;
            }
            if (class80.field1947 == 134) {
                class14.field360 = class53.field1253.method789((byte) -116);
                class91.field2182 = class53.field1253.method831((byte) 76);
                while (class53.field1253.field2404 < class88.field2140) {
                    class80.field1947 = class53.field1253.method831((byte) 76);
                    class127.method986(-19910);
                }
                class80.field1947 = -1;
                return true;
            }
            class23.method212("T1 - " + class80.field1947 + "," + class149.field3361 + "," + class33.field828 + " - " + class88.field2140, (byte) 99, null);
            class139.method1040(-56);
        } catch (IOException var245) {
            class1.method7(512600200);
        } catch (Exception var246) {
            String var243 = "T2 - " + class80.field1947 + "," + class149.field3361 + "," + class33.field828 + " - " + class88.field2140 + "," + (client.field524 + class89.field2150.field710[0]) + "," + (class89.field2150.field755[0] + class27.field646) + " - ";
            for (int var244 = 0; class88.field2140 > var244 && var244 < 50; var244++) {
                var243 = var243 + class53.field1253.field2405[var244] + ",";
            }
            class23.method212(var243, (byte) 110, var246);
            class139.method1040(-110);
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)V")
    public static final void method182(int arg0, int arg1, int arg2, int arg3) {
        field496++;
        if (arg3 < 106) {
            field502 = null;
        }
        class54.method490(262144);
        class52.method461(arg0, arg2, arg0 + class87.field2112.field2159, class87.field2112.field2158 + arg2);
        if (class2.field51 == 2 || class2.field51 == 5) {
            class52.method467(arg0 + 25, arg2 + 5, 0, class113.field2633, class37.field922);
        } else {
            int var4 = class153.field3460 + class103.field2375 & 0x7FF;
            int var5 = 464 - class89.field2150.field712 / 32;
            int var6 = class89.field2150.field760 / 32 + 48;
            class100.field2300.method1119(arg0 + 25, arg2 + 5, 146, 151, var6, var5, var4, class153.field3452 + 256, class113.field2633, class37.field922);
            for (int var7 = 0; var7 < class133.field3035; var7++) {
                int var37 = class79.field1928[var7] * 4 + 2 - class89.field2150.field712 / 32;
                int var38 = class153.field3465[var7] * 4 + 2 - class89.field2150.field760 / 32;
                class92.method735(var38, var37, class101.field2322[var7], 256, arg0, arg2);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class113 var34 = class84.field2022[class106.field2468][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class89.field2150.field760 / 32;
                        int var36 = var33 * 4 + 2 - class89.field2150.field712 / 32;
                        class92.method735(var35, var36, class136.field3091[0], 256, arg0, arg2);
                    }
                }
            }
            for (int var9 = 0; var9 < class115.field2702; var9++) {
                class83 var29 = class74.field1833[class68.field1580[var9]];
                if (var29 != null && var29.method253(-3)) {
                    class110 var30 = var29.field1989;
                    if (var30 != null && var30.field2537 != null) {
                        var30 = var30.method864((byte) -121);
                    }
                    if (var30 != null && var30.field2571 && var30.field2585) {
                        int var31 = var29.field760 / 32 - class89.field2150.field760 / 32;
                        int var32 = var29.field712 / 32 - class89.field2150.field712 / 32;
                        class92.method735(var31, var32, class136.field3091[1], 256, arg0, arg2);
                    }
                }
            }
            for (int var10 = 0; var10 < class105.field2425; var10++) {
                class132 var21 = class108.field2526[class73.field1685[var10]];
                if (var21 != null && var21.method253(-3)) {
                    int var22 = var21.field760 / 32 - class89.field2150.field760 / 32;
                    int var23 = var21.field712 / 32 - class89.field2150.field712 / 32;
                    boolean var24 = false;
                    long var25 = var21.field2996.method925(0);
                    for (int var27 = 0; var27 < class51.field1214; var27++) {
                        if (class77.field1877[var27] == var25 && class128.field2923[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class89.field2150.field3000 != 0 && var21.field3000 != 0 && class89.field2150.field3000 == var21.field3000) {
                        var28 = true;
                    }
                    if (var24) {
                        class92.method735(var22, var23, class136.field3091[3], 256, arg0, arg2);
                    } else if (var28) {
                        class92.method735(var22, var23, class136.field3091[4], 256, arg0, arg2);
                    } else {
                        class92.method735(var22, var23, class136.field3091[2], 256, arg0, arg2);
                    }
                }
            }
            if (class112.field2598 != 0 && class65.field1479 % 20 < 10) {
                if (class112.field2598 == 1 && class14.field298 >= 0 && class74.field1833.length > class14.field298) {
                    class83 var11 = class74.field1833[class14.field298];
                    if (var11 != null) {
                        int var12 = var11.field712 / 32 - class89.field2150.field712 / 32;
                        int var13 = var11.field760 / 32 - class89.field2150.field760 / 32;
                        class37.method308(class82.field1976[1], arg2, var12, arg0, var13, 20);
                    }
                }
                if (class112.field2598 == 2) {
                    int var14 = (class1.field30 - client.field524) * 4 + 2 - class89.field2150.field760 / 32;
                    int var15 = (class36.field910 - class27.field646) * 4 + 2 - class89.field2150.field712 / 32;
                    class37.method308(class82.field1976[1], arg2, var15, arg0, var14, 20);
                }
                if (class112.field2598 == 10 && class24.field606 >= 0 && class24.field606 < class108.field2526.length) {
                    class132 var16 = class108.field2526[class24.field606];
                    if (var16 != null) {
                        int var17 = var16.field760 / 32 - class89.field2150.field760 / 32;
                        int var18 = var16.field712 / 32 - class89.field2150.field712 / 32;
                        class37.method308(class82.field1976[1], arg2, var18, arg0, var17, 20);
                    }
                }
            }
            if (class110.field2561 != 0) {
                int var19 = class110.field2561 * 4 + 2 - class89.field2150.field760 / 32;
                int var20 = class122.field2823 * 4 + 2 - class89.field2150.field712 / 32;
                class92.method735(var19, var20, class82.field1976[0], 256, arg0, arg2);
            }
            class52.method473(arg0 + 97, arg2 - 4 + 82, 3, 3, 16777215);
        }
        if (class2.field51 < 3) {
            field504.method1119(arg0, arg2, 33, 33, 25, 25, class103.field2375, 256, class62.field1434, class130.field2963);
        } else {
            class52.method467(arg0, arg2, 0, class62.field1434, class130.field2963);
        }
        if (class39.field946[arg1]) {
            class87.field2112.method719(arg0, arg2);
        }
        class67.field1555[arg1] = true;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IIII)I")
    public static final int method183(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 61 / ((21 - arg0) / 37);
        field482++;
        int var5 = 256 - arg2;
        return ((arg1 & 0xFF00FF) * var5 + (arg3 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * var5 + (arg3 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
    public static final void method184(int arg0) {
        if (class152.field3435.toLowerCase().indexOf("microsoft") == -1) {
            class99.field2292[61] = 27;
            class99.field2292[47] = 73;
            class99.field2292[45] = 26;
            class99.field2292[44] = 71;
            class99.field2292[91] = 42;
            class99.field2292[59] = 57;
            class99.field2292[46] = 72;
            if (class152.field3424 == null) {
                class99.field2292[192] = 58;
                class99.field2292[222] = 59;
            } else {
                class99.field2292[520] = 59;
                class99.field2292[192] = 28;
                class99.field2292[222] = 58;
            }
            class99.field2292[93] = 43;
            class99.field2292[92] = 74;
        } else {
            class99.field2292[188] = 71;
            class99.field2292[221] = 43;
            class99.field2292[219] = 42;
            class99.field2292[220] = 74;
            class99.field2292[190] = 72;
            class99.field2292[186] = 57;
            class99.field2292[187] = 27;
            class99.field2292[223] = 28;
            class99.field2292[222] = 59;
            class99.field2292[189] = 26;
            class99.field2292[192] = 58;
            class99.field2292[191] = 73;
        }
        if (arg0 >= -54) {
            field481 = null;
        }
        field486++;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
    public static final void method185(byte arg0) {
        field479++;
        class56 var1 = class4.field68;
        synchronized (class4.field68) {
            class9.field197 = class158.field3635;
            class33.field827 = class34.field853;
            class44.field1049 = class80.field1933;
            if (arg0 != 97) {
                field498 = null;
            }
            class82.field1972 = class1.field11;
            class29.field701 = class33.field837;
            class14.field317 = class126.field2875;
            class37.field921 = class32.field824;
            class1.field11 = 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lpa;IB)V")
    private final void method186(class105 arg0, int arg1, byte arg2) {
        if (arg2 == -119) {
            if (arg1 == 2) {
                this.field495 = arg0.method838((byte) 5);
            }
            field485++;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)Z")
    public static final boolean method187(boolean arg0) {
        field501++;
        try {
            if (!arg0) {
                method179(43, (byte) 30, -77, 84, -60);
            }
            if (class65.field1486 == 2) {
                if (class35.field878 == null) {
                    class35.field878 = class109.method861(class112.field2615, class87.field2116, class140.field3180);
                    if (class35.field878 == null) {
                        return false;
                    }
                }
                if (class106.field2474 == null) {
                    class106.field2474 = new class125(class157.field3614, class92.field2219);
                }
                if (class131.field2991.method120(22050, class69.field1602, false, class106.field2474, class35.field878)) {
                    class131.field2991.method124(-101);
                    class131.field2991.method113(class69.field1593, (byte) -20);
                    class131.field2991.method95(class35.field878, class106.field2463, (byte) -56);
                    class35.field878 = null;
                    class112.field2615 = null;
                    class106.field2474 = null;
                    class65.field1486 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class131.field2991.method108(125);
            class112.field2615 = null;
            class106.field2474 = null;
            class35.field878 = null;
            class65.field1486 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILpa;)V")
    public final void method188(int arg0, class105 arg1) {
        field497++;
        int var3 = 87 / ((-arg0 - 2) / 54);
        while (true) {
            int var4 = arg1.method831((byte) 76);
            if (var4 == 0) {
                return;
            }
            this.method186(arg1, var4, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field499++;
        if (class23.method211(arg0, arg2 ^ arg2)) {
            class53.method484(-1, arg5, arg3, (byte) -98, arg6, arg7, class63.field1446[arg0], arg1, arg4);
        }
    }
}
