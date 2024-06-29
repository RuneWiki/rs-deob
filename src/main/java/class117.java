import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class117 extends class27 {

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    private int field2188 = 0;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "I")
    private int field2196 = 1365;

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
    private int field2194 = 0;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "I")
    private int field2198 = 20;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "Lkb;")
    public static class93 field2180 = class76.method390("m-Ochte mit Ihnen handeln)3", 0);

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "[B")
    public static byte[] field2187 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "J")
    public static long field2192 = 0L;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "Lkb;")
    public static class93 field2185 = class76.method390("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 0);

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "Lkf;")
    public static class97 field2190 = null;

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "Lkb;")
    public static class93 field2199 = class76.method390("Titelbild geladen)3", 0);

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "Ljg;")
    public static class89 field2182;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)Lkb;")
    public static final class93 method645(int arg0, int arg1) {
        if (arg1 < 8) {
            field2185 = null;
        }
        ++field2191;
        return class203.method1321(new class93[] { class67.method357((byte) -90, 255 & arg0 >> 24), class159.field3204, class67.method357((byte) -91, arg0 >> 16 & 255), class159.field3204, class67.method357((byte) -128, 255 & arg0 >> 8), class159.field3204, class67.method357((byte) -126, arg0 & 255) }, 17);
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
    public static void method646(int arg0) {
        field2187 = null;
        field2199 = null;
        field2182 = null;
        field2180 = null;
        field2185 = null;
        if (arg0 != 8) {
            method647((class65) null, -4, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lh;IB)I")
    public static final int method647(class65 arg0, int arg1, byte arg2) {
        ++field2193;
        if (arg0.field1105 != null && arg1 < arg0.field1105.length) {
            try {
                int var3 = 0;
                int var4 = -18 % ((arg2 - 1) / 34);
                int var5 = 0;
                int[] var6 = arg0.field1105[arg1];
                byte var7 = 0;
                while (true) {
                    byte var8 = 0;
                    int var9 = var6[var5++];
                    int var10 = 0;
                    if (var9 == 0) {
                        return var3;
                    }
                    if (~var9 == -16) {
                        var8 = 1;
                    }
                    if (var9 == 1) {
                        var10 = class180.field3575[var6[var5++]];
                    }
                    if (~var9 == -17) {
                        var8 = 2;
                    }
                    if (var9 == 2) {
                        var10 = class12.field193[var6[var5++]];
                    }
                    if (var9 == 3) {
                        var10 = class184.field3628[var6[var5++]];
                    }
                    if (var9 == 4) {
                        int var11 = var6[var5++] << 16;
                        int var12 = var11 + var6[var5++];
                        class65 var13 = class204.method1325(65535, var12);
                        int var14 = var6[var5++];
                        if (var14 != -1 && (!class166.method1126(-76, var14).field3284 || class62.field988)) {
                            for (int var15 = 0; var15 < var13.field1146.length; ++var15) {
                                if (~(var14 + 1) == ~var13.field1146[var15]) {
                                    var10 += var13.field1102[var15];
                                }
                            }
                        }
                    }
                    if (var9 == 5) {
                        var10 = class47.field758[var6[var5++]];
                    }
                    if (var9 == 6) {
                        var10 = class73.field1346[-1 + class12.field193[var6[var5++]]];
                    }
                    if (~var9 == -18) {
                        var8 = 3;
                    }
                    if (var9 == 7) {
                        var10 = 100 * class47.field758[var6[var5++]] / 46875;
                    }
                    if (var9 == 8) {
                        var10 = class106.field1940.field533;
                    }
                    if (~var9 == -10) {
                        for (int var16 = 0; ~var16 > -26; ++var16) {
                            if (class145.field2831[var16]) {
                                var10 += class12.field193[var16];
                            }
                        }
                    }
                    if (var9 == 10) {
                        int var17 = var6[var5++] << 16;
                        int var18 = var17 + var6[var5++];
                        class65 var19 = class204.method1325(65535, var18);
                        int var20 = var6[var5++];
                        if (~var20 != 0 && (!class166.method1126(88, var20).field3284 || class62.field988)) {
                            for (int var21 = 0; var19.field1146.length > var21; ++var21) {
                                if (~(var20 + 1) == ~var19.field1146[var21]) {
                                    var10 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var9 == 11) {
                        var10 = class16.field281;
                    }
                    if (~var9 == -13) {
                        var10 = class28.field463;
                    }
                    if (~var9 == -14) {
                        int var22 = class47.field758[var6[var5++]];
                        int var23 = var6[var5++];
                        var10 = ~(1 << var23 & var22) != -1 ? 1 : 0;
                    }
                    if (var9 == 14) {
                        int var24 = var6[var5++];
                        var10 = class21.method129(var24, 21497);
                    }
                    if (~var9 == -19) {
                        var10 = (class106.field1940.field2032 >> 7) + class49.field787;
                    }
                    if (var9 == 19) {
                        var10 = (class106.field1940.field2045 >> 7) + class68.field1242;
                    }
                    if (~var9 == -21) {
                        var10 = var6[var5++];
                    }
                    if (~var8 != -1) {
                        var7 = var8;
                    } else {
                        if (var7 == 0) {
                            var3 += var10;
                        }
                        if (var7 == 1) {
                            var3 -= var10;
                        }
                        if (~var7 == -3 && var10 != 0) {
                            var3 /= var10;
                        }
                        if (~var7 == -4) {
                            var3 *= var10;
                        }
                        var7 = 0;
                    }
                }
            } catch (Exception var25) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)I")
    public static final int method648(int arg0, int arg1, int arg2, int arg3) {
        ++field2181;
        int var4 = arg0 / arg2;
        if (arg3 != 5723) {
            method645(-3, 76);
        }
        int var5 = arg1 / arg2;
        int var6 = arg2 + -1 & arg1;
        int var7 = arg2 + -1 & arg0;
        int var8 = class193.method1244(var4, var5, (byte) -125);
        int var9 = class193.method1244(var4 + 1, var5, (byte) -85);
        int var10 = class193.method1244(var4, var5 - -1, (byte) -117);
        int var11 = class193.method1244(var4 + 1, var5 + 1, (byte) -118);
        int var12 = class68.method364(-8434, var9, arg2, var8, var7);
        int var13 = class68.method364(arg3 ^ -13995, var11, arg2, var10, var7);
        return class68.method364(-8434, var13, arg2, var12, var6);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
    public static final void method649(int arg0, int arg1) {
        ++field2189;
        if (~arg0 <= -1) {
            int var2 = class53.field897[arg0];
            int var3 = class152.field2944[arg0];
            int var4 = class178.field3535[arg0];
            int var5 = class112.field2084[arg0];
            if (~var3 <= -2001) {
                var3 -= 2000;
            }
            if (~var3 == -51) {
                class151.field2908.method47(180, 8);
                ++class155.field3052;
                class151.field2908.method1046((byte) 100, var2);
                class151.field2908.method1078(var5, arg1 ^ -592962360);
                class151.field2908.method1061(class188.field3693, arg1 + 12184);
                class151.field2908.method1061(var4, 12184);
                class151.field2908.method1082(class148.field2855, arg1 + 1838682736);
                class114.field2129 = 0;
                class107.field1947 = class204.method1325(65535, var5);
                class203.field3921 = var2;
            }
            if (var3 == 48) {
                class151.field2908.method47(188, 8);
                class151.field2908.method1087(arg1 + 423438748, class148.field2855);
                ++class183.field3614;
                class151.field2908.method1061(class188.field3693, 12184);
                class151.field2908.method1044(var2, (byte) 121);
                class151.field2908.method1078(var5, -592962360);
            }
            if (~var3 == -14 && class82.field1511 == null) {
                class29.method160(var2, (byte) -121, var5);
                class82.field1511 = class113.method621(var2, var5, -1);
                class160.method1095(0, class82.field1511);
            }
            if (~var3 == -26) {
                class34 var6 = class206.field4035[var4];
                if (var6 != null) {
                    class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var6.field2064[0], 0, 1, 0, var6.field2038[0]);
                    class25.field387 = 0;
                    class4.field71 = class57.field928;
                    ++class88.field1605;
                    class13.field216 = class88.field1592;
                    class207.field4063 = 2;
                    class151.field2908.method47(111, 8);
                    class151.field2908.method1046((byte) 111, var4);
                }
            }
            if (~var3 == -43) {
                class151.field2908.method47(64, 8);
                class151.field2908.method1046((byte) 74, var4);
                class151.field2908.method1082(var5, 1838682736);
                ++class201.field3894;
                class151.field2908.method1061(var2, 12184);
                class114.field2129 = 0;
                class107.field1947 = class204.method1325(65535, var5);
                class203.field3921 = var2;
            }
            if (~var3 == -16) {
                class124.method708(var5, var4, var2, true);
                ++class184.field3638;
                class151.field2908.method47(165, 8);
                class151.field2908.method1046((byte) 75, class68.field1242 + var5);
                class151.field2908.method1061((536857399 & var4) >> 14, 12184);
                class151.field2908.method1061(var2 - -class49.field787, 12184);
            }
            if (~var3 == -36) {
                class76 var7 = class143.field2791[var4];
                if (var7 != null) {
                    ++class147.field2839;
                    class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var7.field2064[0], 0, 1, 0, var7.field2038[0]);
                    class207.field4063 = 2;
                    class13.field216 = class88.field1592;
                    class25.field387 = 0;
                    class4.field71 = class57.field928;
                    class151.field2908.method47(171, 8);
                    class151.field2908.method1046((byte) 71, var4);
                }
            }
            if (var3 == 30) {
                ++class155.field3055;
                class151.field2908.method47(221, 8);
                class151.field2908.method1051(true, var5);
                class65 var8 = class204.method1325(65535, var5);
                if (var8.field1105 != null && var8.field1105[0][0] == 5) {
                    int var9 = var8.field1105[0][1];
                    class47.field758[var9] = -class47.field758[var9] + 1;
                    class141.method889(var9, arg1 + 26676);
                }
            }
            if (var3 == 45) {
                class124.method708(var5, var4, var2, true);
                class151.field2908.method47(151, arg1 ^ 8);
                ++class188.field3688;
                class151.field2908.method1061(var2 - -class49.field787, arg1 ^ 12184);
                class151.field2908.method1046((byte) 118, class68.field1242 + var5);
                class151.field2908.method1046((byte) 98, var4 >> 14 & 32767);
            }
            if (~var3 == -58) {
                class65 var10 = class113.method621(var2, var5, arg1 + -1);
                if (var10 != null) {
                    class26.method144((byte) -78);
                    class204.method1331(var2, arg1 ^ 8, var5, class158.method1084(74, class178.method1173(var10, 127)));
                    class144.field2800 = 0;
                    class207.field4040 = class28.method156((byte) 99, var10);
                    if (class207.field4040 == null) {
                        class207.field4040 = class34.field558;
                    }
                    if (!var10.field1152) {
                        class122.field2270 = class203.method1321(new class93[] { class57.field933, var10.field1077, class106.field1934 }, -114);
                        return;
                    }
                    class122.field2270 = class203.method1321(new class93[] { var10.field1096, class106.field1934 }, -74);
                }
            } else {
                if (var3 == 21 && class124.method708(var5, var4, var2, true)) {
                    ++class77.field1397;
                    class151.field2908.method47(174, 8);
                    class151.field2908.method1033(false, (var4 & 536868308) >> 14);
                    class151.field2908.method1061(class188.field3693, 12184);
                    class151.field2908.method1046((byte) 76, class68.field1242 + var5);
                    class151.field2908.method1044(var2 - -class49.field787, (byte) 123);
                    class151.field2908.method1051(true, class148.field2855);
                }
                if (~var3 == -30) {
                    class151.field2908.method47(84, 8);
                    class151.field2908.method1061(var4, 12184);
                    class151.field2908.method1087(423438748, var5);
                    ++class1.field2;
                    class151.field2908.method1046((byte) 91, var2);
                    class114.field2129 = 0;
                    class107.field1947 = class204.method1325(65535, var5);
                    class203.field3921 = var2;
                }
                if (~var3 == -13) {
                    class16.method95(0);
                }
                if (~var3 == -10) {
                    ++class127.field2390;
                    boolean var11 = class6.method36(0, false, class106.field1940.field2038[0], 0, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 0, 0, var2);
                    if (!var11) {
                        class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 1, 0, var2);
                    }
                    class25.field387 = 0;
                    class4.field71 = class57.field928;
                    class207.field4063 = 2;
                    class13.field216 = class88.field1592;
                    class151.field2908.method47(230, arg1 + 8);
                    class151.field2908.method1044(var4, (byte) 121);
                    class151.field2908.method1033(false, class49.field787 + var2);
                    class151.field2908.method1033(false, class68.field1242 + var5);
                }
                if (~var3 == -15) {
                    class76 var13 = class143.field2791[var4];
                    if (var13 != null) {
                        class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var13.field2064[0], 0, 1, 0, var13.field2038[0]);
                        ++class15.field269;
                        class4.field71 = class57.field928;
                        class207.field4063 = 2;
                        class13.field216 = class88.field1592;
                        class25.field387 = 0;
                        class151.field2908.method47(162, 8);
                        class151.field2908.method1061(var4, arg1 + 12184);
                    }
                }
                if (~var3 == -12) {
                    class124.method708(var5, var4, var2, true);
                    ++class122.field2263;
                    class151.field2908.method47(19, arg1 ^ 8);
                    class151.field2908.method1046((byte) 87, class68.field1242 + var5);
                    class151.field2908.method1044(32767 & var4 >> 14, (byte) 108);
                    class151.field2908.method1044(class49.field787 + var2, (byte) 125);
                }
                if (var3 == 1005) {
                    class65 var14 = class204.method1325(arg1 + 65535, var5);
                    if (var14 != null && ~var14.field1102[var2] <= -100001) {
                        class189.method1223(0, class43.field712, 2249, class203.method1321(new class93[] { class67.method357((byte) -114, var14.field1102[var2]), class133.field2545, class166.method1126(arg1 + -115, var4).field3281 }, 94));
                    } else {
                        ++class82.field1505;
                        class151.field2908.method47(182, 8);
                        class151.field2908.method1046((byte) 109, var4);
                    }
                    class114.field2129 = 0;
                    class107.field1947 = class204.method1325(65535, var5);
                    class203.field3921 = var2;
                }
                if (var3 == 3) {
                    ++class89.field1646;
                    boolean var15 = class6.method36(0, false, class106.field1940.field2038[0], 0, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 0, 0, var2);
                    if (!var15) {
                        class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 1, 0, var2);
                    }
                    class13.field216 = class88.field1592;
                    class207.field4063 = 2;
                    class4.field71 = class57.field928;
                    class25.field387 = 0;
                    class151.field2908.method47(213, 8);
                    class151.field2908.method1044(class68.field1242 + var5, (byte) 125);
                    class151.field2908.method1033(false, var4);
                    class151.field2908.method1046((byte) 112, class49.field787 + var2);
                }
                if (var3 == 16) {
                    class76 var17 = class143.field2791[var4];
                    if (var17 != null) {
                        ++class181.field3579;
                        class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var17.field2064[0], 0, 1, 0, var17.field2038[0]);
                        class25.field387 = 0;
                        class13.field216 = class88.field1592;
                        class207.field4063 = 2;
                        class4.field71 = class57.field928;
                        class151.field2908.method47(245, arg1 + 8);
                        class151.field2908.method1046((byte) 85, var4);
                    }
                }
                if (~var3 == -52) {
                    ++class16.field290;
                    boolean var18 = class6.method36(0, false, class106.field1940.field2038[0], 0, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 0, 0, var2);
                    if (!var18) {
                        class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 1, 0, var2);
                    }
                    class207.field4063 = 2;
                    class13.field216 = class88.field1592;
                    class4.field71 = class57.field928;
                    class25.field387 = 0;
                    class151.field2908.method47(32, 8);
                    class151.field2908.method1044(class93.field1725, (byte) 125);
                    class151.field2908.method1051(true, class141.field2753);
                    class151.field2908.method1046((byte) 75, class148.field2852);
                    class151.field2908.method1046((byte) 108, class68.field1242 + var5);
                    class151.field2908.method1046((byte) 90, var2 - -class49.field787);
                    class151.field2908.method1044(var4, (byte) 121);
                }
                if (~var3 == -37) {
                    class151.field2908.method47(135, 8);
                    class151.field2908.method1078(var5, arg1 + -592962360);
                    ++class88.field1597;
                    class151.field2908.method1033(false, var4);
                    class151.field2908.method1033(false, var2);
                    class114.field2129 = 0;
                    class107.field1947 = class204.method1325(65535, var5);
                    class203.field3921 = var2;
                }
                if (var3 == 40) {
                    ++class140.field2723;
                    class151.field2908.method47(228, arg1 + 8);
                    class151.field2908.method1033(false, var4);
                    class151.field2908.method1082(var5, 1838682736);
                    class151.field2908.method1046((byte) 98, var2);
                    class114.field2129 = 0;
                    class107.field1947 = class204.method1325(65535, var5);
                    class203.field3921 = var2;
                }
                if (var3 == 38) {
                    class34 var20 = class206.field4035[var4];
                    if (var20 != null) {
                        ++class127.field2393;
                        class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var20.field2064[0], 0, 1, 0, var20.field2038[0]);
                        class4.field71 = class57.field928;
                        class25.field387 = 0;
                        class13.field216 = class88.field1592;
                        class207.field4063 = 2;
                        class151.field2908.method47(115, 8);
                        class151.field2908.method1033(false, var4);
                    }
                }
                if (~var3 == -44) {
                    ++class204.field3942;
                    class124.method708(var5, var4, var2, true);
                    class151.field2908.method47(149, 8);
                    class151.field2908.method1046((byte) 80, (536860538 & var4) >> 14);
                    class151.field2908.method1061(var5 - -class68.field1242, 12184);
                    class151.field2908.method1046((byte) 98, class49.field787 + var2);
                }
                if (var3 == 1007) {
                    class4.field71 = class57.field928;
                    ++class178.field3538;
                    class13.field216 = class88.field1592;
                    class25.field387 = 0;
                    class207.field4063 = 2;
                    class151.field2908.method47(40, 8);
                    class151.field2908.method1061(var4 >> 14 & 32767, 12184);
                }
                if (~var3 == -29) {
                    boolean var21 = class6.method36(0, false, class106.field1940.field2038[0], 0, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 0, 0, var2);
                    ++class188.field3677;
                    if (!var21) {
                        class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 1, 0, var2);
                    }
                    class25.field387 = 0;
                    class13.field216 = class88.field1592;
                    class207.field4063 = 2;
                    class4.field71 = class57.field928;
                    class151.field2908.method47(75, 8);
                    class151.field2908.method1087(423438748, class148.field2855);
                    class151.field2908.method1046((byte) 94, class68.field1242 + var5);
                    class151.field2908.method1061(class188.field3693, 12184);
                    class151.field2908.method1044(class49.field787 + var2, (byte) 121);
                    class151.field2908.method1061(var4, 12184);
                }
                if (var3 == 39) {
                    class34 var23 = class206.field4035[var4];
                    if (var23 != null) {
                        ++class186.field3654;
                        class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var23.field2064[0], 0, 1, 0, var23.field2038[0]);
                        class13.field216 = class88.field1592;
                        class207.field4063 = 2;
                        class4.field71 = class57.field928;
                        class25.field387 = 0;
                        class151.field2908.method47(9, 8);
                        class151.field2908.method1046((byte) 71, var4);
                    }
                }
                if (~var3 == -19) {
                    class34 var24 = class206.field4035[var4];
                    if (var24 != null) {
                        ++class184.field3625;
                        class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var24.field2064[0], 0, 1, 0, var24.field2038[0]);
                        class25.field387 = 0;
                        class207.field4063 = 2;
                        class13.field216 = class88.field1592;
                        class4.field71 = class57.field928;
                        class151.field2908.method47(204, 8);
                        class151.field2908.method1061(var4, 12184);
                    }
                }
                if (var3 == 41) {
                    ++class69.field1269;
                    class151.field2908.method47(227, arg1 ^ 8);
                    class151.field2908.method1087(arg1 + 423438748, var5);
                    class151.field2908.method1033(false, var4);
                    class151.field2908.method1061(var2, 12184);
                    class114.field2129 = 0;
                    class107.field1947 = class204.method1325(65535, var5);
                    class203.field3921 = var2;
                }
                if (var3 == 37 && class124.method708(var5, var4, var2, true)) {
                    ++class13.field206;
                    class151.field2908.method47(13, 8);
                    class151.field2908.method1051(true, class141.field2753);
                    class151.field2908.method1046((byte) 99, (var4 & 536858508) >> 14);
                    class151.field2908.method1033(false, class148.field2852);
                    class151.field2908.method1033(false, class49.field787 + var2);
                    class151.field2908.method1061(class93.field1725, 12184);
                    class151.field2908.method1033(false, class68.field1242 + var5);
                }
                if (~var3 == -1005) {
                    ++class82.field1505;
                    class4.field71 = class57.field928;
                    class207.field4063 = 2;
                    class25.field387 = 0;
                    class13.field216 = class88.field1592;
                    class151.field2908.method47(182, 8);
                    class151.field2908.method1046((byte) 76, var4);
                }
                if (var3 == 1002) {
                    class124.method708(var5, var4, var2, true);
                    class151.field2908.method47(97, arg1 ^ 8);
                    ++class70.field1289;
                    class151.field2908.method1061(class68.field1242 + var5, 12184);
                    class151.field2908.method1033(false, class49.field787 + var2);
                    class151.field2908.method1044((536859261 & var4) >> 14, (byte) 116);
                }
                if (var3 == 6) {
                    class26.method144((byte) -78);
                    class65 var25 = class204.method1325(arg1 + 65535, var5);
                    class148.field2852 = var2;
                    class141.field2753 = var5;
                    class93.field1725 = var4;
                    class144.field2800 = 1;
                    class160.method1095(0, var25);
                    class108.field1957 = class203.method1321(new class93[] { class64.field1026, class166.method1126(102, var4).field3281, class106.field1934 }, arg1 ^ 92);
                    if (class108.field1957 == null) {
                        class108.field1957 = class73.field1345;
                    }
                } else {
                    if (var3 == 5) {
                        ++class112.field2072;
                        boolean var26 = class6.method36(0, false, class106.field1940.field2038[0], 0, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 0, 0, var2);
                        if (!var26) {
                            class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 1, 0, var2);
                        }
                        class13.field216 = class88.field1592;
                        class207.field4063 = 2;
                        class25.field387 = 0;
                        class4.field71 = class57.field928;
                        class151.field2908.method47(234, 8);
                        class151.field2908.method1061(class68.field1242 + var5, 12184);
                        class151.field2908.method1046((byte) 80, var2 - -class49.field787);
                        class151.field2908.method1046((byte) 84, var4);
                    }
                    if (~var3 == -27) {
                        ++class21.field339;
                        class151.field2908.method47(93, 8);
                        class151.field2908.method1044(var2, (byte) 103);
                        class151.field2908.method1061(var4, 12184);
                        class151.field2908.method1051(true, var5);
                        class114.field2129 = 0;
                        class107.field1947 = class204.method1325(65535, var5);
                        class203.field3921 = var2;
                    }
                    if (arg1 == 0) {
                        if (var3 == 19) {
                            class151.field2908.method47(221, 8);
                            ++class155.field3055;
                            class151.field2908.method1051(true, var5);
                            class65 var28 = class204.method1325(arg1 + 65535, var5);
                            if (var28.field1105 != null && var28.field1105[0][0] == 5) {
                                int var29 = var28.field1105[0][1];
                                if (class47.field758[var29] != var28.field1149[0]) {
                                    class47.field758[var29] = var28.field1149[0];
                                    class141.method889(var29, 26676);
                                }
                            }
                        }
                        if (~var3 == -3) {
                            ++class50.field798;
                            class151.field2908.method47(33, 8);
                            class151.field2908.method1078(var5, arg1 ^ -592962360);
                            class151.field2908.method1033(false, var4);
                            class151.field2908.method1046((byte) 98, var2);
                            class114.field2129 = 0;
                            class107.field1947 = class204.method1325(65535, var5);
                            class203.field3921 = var2;
                        }
                        if (~var3 == -59) {
                            class65 var30 = class204.method1325(65535, var5);
                            boolean var31 = true;
                            if (var30.field1056 > 0) {
                                var31 = class40.method215(arg1 ^ 1, var30);
                            }
                            if (var31) {
                                class151.field2908.method47(221, 8);
                                class151.field2908.method1051(true, var5);
                                ++class155.field3055;
                            }
                        }
                        if (var3 == 1) {
                            class151.field2908.method47(196, 8);
                            ++class190.field3709;
                            class151.field2908.method1061(var2, 12184);
                            class151.field2908.method1033(false, var4);
                            class151.field2908.method1051(true, var5);
                            class114.field2129 = 0;
                            class107.field1947 = class204.method1325(65535, var5);
                            class203.field3921 = var2;
                        }
                        if (~var3 == -9) {
                            class34 var32 = class206.field4035[var4];
                            if (var32 != null) {
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var32.field2064[0], 0, 1, 0, var32.field2038[0]);
                                class4.field71 = class57.field928;
                                ++class167.field3346;
                                class25.field387 = 0;
                                class13.field216 = class88.field1592;
                                class207.field4063 = 2;
                                class151.field2908.method47(67, arg1 ^ 8);
                                class151.field2908.method1044(var4, (byte) 81);
                            }
                        }
                        if (~var3 == -21) {
                            class34 var33 = class206.field4035[var4];
                            if (var33 != null) {
                                ++class104.field1907;
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var33.field2064[0], 0, 1, 0, var33.field2038[0]);
                                class4.field71 = class57.field928;
                                class13.field216 = class88.field1592;
                                class25.field387 = 0;
                                class207.field4063 = 2;
                                class151.field2908.method47(175, arg1 + 8);
                                class151.field2908.method1046((byte) 95, var4);
                            }
                        }
                        if (var3 == 32) {
                            ++class176.field3493;
                            boolean var34 = class6.method36(0, false, class106.field1940.field2038[0], 0, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 0, 0, var2);
                            if (!var34) {
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 1, 0, var2);
                            }
                            class25.field387 = 0;
                            class13.field216 = class88.field1592;
                            class4.field71 = class57.field928;
                            class207.field4063 = 2;
                            class151.field2908.method47(237, arg1 ^ 8);
                            class151.field2908.method1033(false, class49.field787 + var2);
                            class151.field2908.method1061(var4, 12184);
                            class151.field2908.method1033(false, class68.field1242 + var5);
                        }
                        if (var3 == 10) {
                            class76 var36 = class143.field2791[var4];
                            if (var36 != null) {
                                ++class67.field1231;
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var36.field2064[0], 0, 1, 0, var36.field2038[0]);
                                class207.field4063 = 2;
                                class4.field71 = class57.field928;
                                class25.field387 = 0;
                                class13.field216 = class88.field1592;
                                class151.field2908.method47(160, 8);
                                class151.field2908.method1046((byte) 101, var4);
                            }
                        }
                        if (var3 == 1001) {
                            class4.field71 = class57.field928;
                            class207.field4063 = 2;
                            class13.field216 = class88.field1592;
                            class25.field387 = 0;
                            class76 var37 = class143.field2791[var4];
                            if (var37 != null) {
                                class195 var38 = var37.field1364;
                                if (var38.field3815 != null) {
                                    var38 = var38.method1256(0);
                                }
                                if (var38 != null) {
                                    ++class151.field2926;
                                    class151.field2908.method47(48, arg1 ^ 8);
                                    class151.field2908.method1044(var38.field3808, (byte) 83);
                                }
                            }
                        }
                        if (~var3 == -45) {
                            class76 var39 = class143.field2791[var4];
                            if (var39 != null) {
                                ++class29.field466;
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var39.field2064[0], 0, 1, 0, var39.field2038[0]);
                                class207.field4063 = 2;
                                class4.field71 = class57.field928;
                                class25.field387 = 0;
                                class13.field216 = class88.field1592;
                                class151.field2908.method47(26, arg1 + 8);
                                class151.field2908.method1061(class148.field2852, 12184);
                                class151.field2908.method1046((byte) 125, class93.field1725);
                                class151.field2908.method1078(class141.field2753, -592962360);
                                class151.field2908.method1046((byte) 122, var4);
                            }
                        }
                        if (~var3 == -48) {
                            class76 var40 = class143.field2791[var4];
                            if (var40 != null) {
                                ++class16.field285;
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var40.field2064[0], 0, 1, 0, var40.field2038[0]);
                                class4.field71 = class57.field928;
                                class25.field387 = 0;
                                class207.field4063 = 2;
                                class13.field216 = class88.field1592;
                                class151.field2908.method47(140, 8);
                                class151.field2908.method1046((byte) 117, var4);
                                class151.field2908.method1082(class148.field2855, arg1 ^ 1838682736);
                                class151.field2908.method1046((byte) 87, class188.field3693);
                            }
                        }
                        if (~var3 == -25) {
                            ++class133.field2540;
                            boolean var41 = class6.method36(0, false, class106.field1940.field2038[0], 0, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 0, 0, var2);
                            if (!var41) {
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var5, 0, 1, 0, var2);
                            }
                            class207.field4063 = 2;
                            class13.field216 = class88.field1592;
                            class25.field387 = 0;
                            class4.field71 = class57.field928;
                            class151.field2908.method47(154, 8);
                            class151.field2908.method1033(false, class68.field1242 + var5);
                            class151.field2908.method1044(var4, (byte) 91);
                            class151.field2908.method1044(class49.field787 + var2, (byte) 105);
                        }
                        if (var3 == 22 || ~var3 == -1007) {
                            class13.method69(var5, class35.field575[arg0], var2, arg1 ^ -60, var4);
                        }
                        if (~var3 == -34) {
                            class34 var43 = class206.field4035[var4];
                            if (var43 != null) {
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var43.field2064[0], 0, 1, 0, var43.field2038[0]);
                                ++class123.field2300;
                                class13.field216 = class88.field1592;
                                class25.field387 = 0;
                                class4.field71 = class57.field928;
                                class207.field4063 = 2;
                                class151.field2908.method47(159, 8);
                                class151.field2908.method1061(var4, 12184);
                            }
                        }
                        if (var3 == 17) {
                            class175.field3458.method847(class114.field2145, var2, var5);
                        }
                        if (~var3 == -24) {
                            class76 var44 = class143.field2791[var4];
                            if (var44 != null) {
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var44.field2064[0], 0, 1, 0, var44.field2038[0]);
                                class4.field71 = class57.field928;
                                class13.field216 = class88.field1592;
                                class25.field387 = 0;
                                class207.field4063 = 2;
                                class151.field2908.method47(42, arg1 + 8);
                                ++client.field495;
                                class151.field2908.method1046((byte) 89, var4);
                            }
                        }
                        if (~var3 == -32) {
                            class34 var45 = class206.field4035[var4];
                            if (var45 != null) {
                                ++field2186;
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var45.field2064[0], 0, 1, 0, var45.field2038[0]);
                                class25.field387 = 0;
                                class4.field71 = class57.field928;
                                class207.field4063 = 2;
                                class13.field216 = class88.field1592;
                                class151.field2908.method47(90, 8);
                                class151.field2908.method1061(class188.field3693, 12184);
                                class151.field2908.method1078(class148.field2855, -592962360);
                                class151.field2908.method1033(false, var4);
                            }
                        }
                        if (~var3 == -50) {
                            class34 var46 = class206.field4035[var4];
                            if (var46 != null) {
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var46.field2064[0], 0, 1, 0, var46.field2038[0]);
                                class25.field387 = 0;
                                class207.field4063 = 2;
                                class4.field71 = class57.field928;
                                class13.field216 = class88.field1592;
                                class151.field2908.method47(99, 8);
                                class151.field2908.method1046((byte) 123, class148.field2852);
                                ++class30.field502;
                                class151.field2908.method1044(var4, (byte) 98);
                                class151.field2908.method1051(true, class141.field2753);
                                class151.field2908.method1046((byte) 115, class93.field1725);
                            }
                        }
                        if (~var3 == -47) {
                            class151.field2908.method47(249, 8);
                            ++class133.field2552;
                            class151.field2908.method1061(class148.field2852, arg1 ^ 12184);
                            class151.field2908.method1044(class93.field1725, (byte) 107);
                            class151.field2908.method1044(var2, (byte) 97);
                            class151.field2908.method1082(class141.field2753, 1838682736);
                            class151.field2908.method1087(423438748, var5);
                            class151.field2908.method1061(var4, 12184);
                            class114.field2129 = 0;
                            class107.field1947 = class204.method1325(arg1 ^ 65535, var5);
                            class203.field3921 = var2;
                        }
                        if (var3 == 34) {
                            class34 var47 = class206.field4035[var4];
                            if (var47 != null) {
                                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var47.field2064[0], 0, 1, 0, var47.field2038[0]);
                                ++class111.field1999;
                                class13.field216 = class88.field1592;
                                class207.field4063 = 2;
                                class25.field387 = 0;
                                class4.field71 = class57.field928;
                                class151.field2908.method47(0, 8);
                                class151.field2908.method1033(false, var4);
                            }
                        }
                        if (var3 == 4) {
                            ++class36.field589;
                            class151.field2908.method47(144, arg1 + 8);
                            class151.field2908.method1044(var4, (byte) 111);
                            class151.field2908.method1082(var5, 1838682736);
                            class151.field2908.method1061(var2, 12184);
                            class114.field2129 = 0;
                            class107.field1947 = class204.method1325(arg1 ^ 65535, var5);
                            class203.field3921 = var2;
                        }
                        if (var3 == 7) {
                            class151.field2908.method47(199, 8);
                            ++class182.field3591;
                            class151.field2908.method1078(var5, -592962360);
                            class151.field2908.method1033(false, var4);
                            class151.field2908.method1033(false, var2);
                            class114.field2129 = 0;
                            class107.field1947 = class204.method1325(65535, var5);
                            class203.field3921 = var2;
                        }
                        if (~class144.field2800 != -1) {
                            class144.field2800 = 0;
                            class160.method1095(0, class204.method1325(65535, class141.field2753));
                        }
                        if (class103.field1905) {
                            class26.method144((byte) -78);
                        }
                        if (class107.field1947 != null && class114.field2129 == 0) {
                            class160.method1095(0, class107.field1947);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)V")
    public static final void method650(int arg0, byte arg1) {
        class101.field1852 = null;
        class64.field1032 = -1;
        class148.field2861 = arg0;
        class88.field1593 = 0;
        class24.field365 = 1;
        ++field2184;
        if (arg1 <= 98) {
            field2180 = null;
        }
        class188.field3692 = -1;
        class166.field3327 = false;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field2195;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            for (int var4 = 0; var4 < class159.field3209; ++var4) {
                int var5 = (class97.field1808[var4] << 12) / this.field2196 + this.field2194;
                int var6 = (class142.field2781[arg0] << 12) / this.field2196 + this.field2188;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = var6;
                int var12 = 0;
                for (int var13 = var6 * var6 >> 12; ~(var10 + var13) > -16385 && ~var12 > ~this.field2198; var13 = var11 * var11 >> 12) {
                    ++var12;
                    var11 = (var9 * var11 >> 12) * 2 - -var7;
                    var9 = var8 + var10 + -var13;
                    var10 = var9 * var9 >> 12;
                }
                var3[var4] = var12 < this.field2198 + -1 ? (var12 << 12) / this.field2198 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        ++field2197;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field2188 = arg2.method1071(28101);
                    }
                } else {
                    this.field2194 = arg2.method1071(28101);
                }
            } else {
                this.field2198 = arg2.method1071(28101);
            }
        } else {
            this.field2196 = arg2.method1071(28101);
        }
        if (arg0 <= 106) {
            method649(43, -119);
        }
    }
}
