import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class80 extends class243 {

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field1391 = 0;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "[[[Luh;")
    public static class198[][][] field1389 = new class198[4][104][104];

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "Lub;")
    public static class227 field1395 = class257.method1749("<col=ffffff> )4 ", 17263);

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "Lwa;")
    public static class135 field1393;

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "[Lec;")
    private class26[] field1394;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[[I)V")
    private final void method465(int arg0, int[][] arg1) {
        ++field1397;
        int var3 = class193.field3280;
        int var4 = class212.field3586;
        if (arg0 >= 63) {
            class174.method1112(arg1, (byte) -15);
            class235.method1570(0, class254.field4469, 1, 0, class179.field3062);
            if (this.field1394 != null) {
                for (int var5 = 0; var5 < this.field1394.length; ++var5) {
                    class26 var6 = this.field1394[var5];
                    int var7 = var6.field433;
                    int var8 = var6.field436;
                    if (~var8 > -1) {
                        if (var7 >= 0) {
                            var6.method106(var4, var3, (byte) -75);
                        }
                    } else if (var7 >= 0) {
                        var6.method100(512, var4, var3);
                    } else {
                        var6.method103(var3, var4, (byte) 122);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[B)Lpd;")
    public static final class196 method466(int arg0, byte[] arg1) {
        ++field1390;
        if (arg1 == null) {
            return null;
        } else {
            if (arg0 != 6169) {
                field1395 = null;
            }
            class202 var2 = new class202(arg1, class58.field1068, class176.field2934, class177.field2982, class214.field3613, class26.field427);
            class57.method350((byte) -112);
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field1396;
        if (arg2 == 0) {
            this.field1394 = new class26[arg0.method1471(255)];
            for (int var4 = 0; ~this.field1394.length < ~var4; ++var4) {
                int var5 = arg0.method1471(255);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field1394[var4] = class220.method1394(true, arg0);
                            }
                        } else {
                            this.field1394[var4] = class199.method1283(arg0, (byte) -59);
                        }
                    } else {
                        this.field1394[var4] = class59.method360(arg0, -60);
                    }
                } else {
                    this.field1394[var4] = class28.method146(arg0, -28300);
                }
            }
        } else if (arg2 == 1) {
            super.field4230 = arg0.method1471(255) == 1;
        }
        if (arg1) {
            this.method465(106, (int[][]) null);
        }
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
    public static void method467(int arg0) {
        if (arg0 == 10818) {
            field1393 = null;
            field1395 = null;
            field1389 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field1392;
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (arg0 != 230) {
            this.method80(47, 36);
        }
        if (super.field4213.field3771) {
            int var4 = class212.field3586;
            int var5 = class193.field3280;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field4213.method1403((byte) -73);
            this.method465(103, var6);
            for (int var8 = 0; var8 < class193.field3280; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[2];
                int[] var13 = var10[0];
                for (int var14 = 0; ~class212.field3586 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class76.method446(var15 << 4, 4080);
                    var11[var14] = class76.method446(4080, var15 >> 4);
                    var13[var14] = class76.method446(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class80() {
        super(0, true);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int var3 = -17 % ((arg0 - -15) / 51);
        ++field1388;
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            this.method465(127, super.field4215.method986((byte) -89));
        }
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)V")
    public static final void method468(int arg0, byte arg1) {
        ++field1387;
        if (arg0 >= 0) {
            if (arg1 == 119) {
                int var2 = class236.field4099[arg0];
                int var3 = (int) class161.field2720[arg0];
                int var4 = class19.field327[arg0];
                if (~var4 <= -2001) {
                    var4 -= 2000;
                }
                int var5 = class210.field3562[arg0];
                long var6 = class161.field2720[arg0];
                if (var4 == 28 || ~var4 == -1005) {
                    class11.method51(var5, (byte) 40, class213.field3607[arg0], var3, var2);
                }
                if (var4 == 20) {
                    class176.field2935.method664((byte) -111, 8);
                    ++class175.field2911;
                    class176.field2935.method1449(var5, (byte) 123);
                    class176.field2935.method1475(true, var2);
                    class176.field2935.method1449(var3, (byte) 111);
                    class193.field3296 = 0;
                    class77.field1349 = class27.method137(var2, -954490064);
                    class103.field1806 = var5;
                }
                if (~var4 == -43) {
                    ++class178.field3003;
                    boolean var8 = class117.method736(63, 0, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 0);
                    if (!var8) {
                        class117.method736(96, 1, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 1);
                    }
                    class144.field2471 = class81.field1403;
                    class14.field257 = 2;
                    class177.field2966 = class232.field4043;
                    class193.field3288 = 0;
                    class176.field2935.method664((byte) -123, 224);
                    class176.field2935.method1451(class78.field1367 + var2, (byte) -127);
                    class176.field2935.method1427(class167.field2789, (byte) -111);
                    class176.field2935.method1449(class5.field116, (byte) 120);
                    class176.field2935.method1476(var3, -109);
                    class176.field2935.method1451(class192.field3267 + var5, (byte) -116);
                    class176.field2935.method1476(class119.field2162, -115);
                }
                if (var4 == 1003) {
                    class105 var10 = class27.method137(var2, -954490064);
                    if (var10 != null && var10.field1921[var5] >= 100000) {
                        class130.method799(1403, 0, class91.field1558, class76.method445((byte) -116, new class227[] { class204.method1303(var10.field1921[var5], 1), class179.field3067, class133.method815(var3, (byte) -70).field3048 }));
                    } else {
                        class176.field2935.method664((byte) -106, 147);
                        class176.field2935.method1451(var3, (byte) -115);
                        ++class91.field1550;
                    }
                    class193.field3296 = 0;
                    class77.field1349 = class27.method137(var2, arg1 ^ -954490041);
                    class103.field1806 = var5;
                }
                if (~var4 == -47) {
                    class105 var11 = class255.method1738(var2, (byte) -63, var5);
                    if (var11 != null) {
                        class142.method900((byte) -77);
                        class173.method1109(var2, -125, class208.method1320(false, client.method494(var11)), var5);
                        class122.field2199 = 0;
                        class88.field1528 = class169.method1043(1291001114, var11);
                        if (class88.field1528 == null) {
                            class88.field1528 = class174.field2909;
                        }
                        if (!var11.field1853) {
                            class149.field2608 = class76.method445((byte) -92, new class227[] { class215.field3634, var11.field1846, class221.field3743 });
                            return;
                        }
                        class149.field2608 = class76.method445((byte) 80, new class227[] { var11.field1870, class221.field3743 });
                    }
                } else {
                    if (var4 == 30) {
                        class195 var12 = class220.field3715[var3];
                        if (var12 != null) {
                            class117.method736(73, 1, 0, var12.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var12.field49[0], 2, false, 1);
                            class193.field3288 = 0;
                            class14.field257 = 2;
                            class144.field2471 = class81.field1403;
                            class177.field2966 = class232.field4043;
                            class176.field2935.method664((byte) 25, 29);
                            class176.field2935.method1451(var3, (byte) -110);
                            ++class11.field228;
                        }
                    }
                    if (~var4 == -48) {
                        ++class198.field3394;
                        class176.field2935.method664((byte) 38, 99);
                        class176.field2935.method1476(var3, -78);
                        class176.field2935.method1427(var2, (byte) -115);
                        class176.field2935.method1451(var5, (byte) -113);
                        class193.field3296 = 0;
                        class77.field1349 = class27.method137(var2, -954490064);
                        class103.field1806 = var5;
                    }
                    if (~var4 == -38) {
                        class176.field2935.method664((byte) -108, 54);
                        ++class85.field1480;
                        class176.field2935.method1449(var5, (byte) 121);
                        class176.field2935.method1445(var2, arg1 + -718520591);
                        class176.field2935.method1476(var3, 25);
                        class193.field3296 = 0;
                        class77.field1349 = class27.method137(var2, -954490064);
                        class103.field1806 = var5;
                    }
                    if (~var4 == -19) {
                        class195 var13 = class220.field3715[var3];
                        if (var13 != null) {
                            class117.method736(arg1 ^ 45, 1, 0, var13.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var13.field49[0], 2, false, 1);
                            class14.field257 = 2;
                            ++class8.field163;
                            class193.field3288 = 0;
                            class177.field2966 = class232.field4043;
                            class144.field2471 = class81.field1403;
                            class176.field2935.method664((byte) 45, 13);
                            class176.field2935.method1451(var3, (byte) -118);
                        }
                    }
                    if (var4 == 26) {
                        class174.method1113(arg1 ^ 119, var5, var6, var2);
                        class176.field2935.method664((byte) -127, 116);
                        class176.field2935.method1476(var2 - -class78.field1367, arg1 ^ -44);
                        ++class208.field3527;
                        class176.field2935.method1451(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -125);
                        class176.field2935.method1449(class192.field3267 + var5, (byte) 107);
                    }
                    if (var4 == 17) {
                        class195 var14 = class220.field3715[var3];
                        if (var14 != null) {
                            class117.method736(arg1 ^ 8, 1, 0, var14.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var14.field49[0], 2, false, 1);
                            class193.field3288 = 0;
                            class144.field2471 = class81.field1403;
                            class177.field2966 = class232.field4043;
                            class14.field257 = 2;
                            ++class174.field2904;
                            class176.field2935.method664((byte) 122, 161);
                            class176.field2935.method1476(var3, -105);
                        }
                    }
                    if (var4 == 57) {
                        class225 var15 = class27.field446[var3];
                        if (var15 != null) {
                            ++class44.field729;
                            class117.method736(48, 1, 0, var15.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var15.field49[0], 2, false, 1);
                            class14.field257 = 2;
                            class177.field2966 = class232.field4043;
                            class144.field2471 = class81.field1403;
                            class193.field3288 = 0;
                            class176.field2935.method664((byte) 87, 191);
                            class176.field2935.method1449(var3, (byte) 107);
                        }
                    }
                    if (~var4 == -10) {
                        class195 var16 = class220.field3715[var3];
                        if (var16 != null) {
                            class117.method736(arg1 + -9, 1, 0, var16.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var16.field49[0], 2, false, 1);
                            class144.field2471 = class81.field1403;
                            class177.field2966 = class232.field4043;
                            class14.field257 = 2;
                            class193.field3288 = 0;
                            class176.field2935.method664((byte) 74, 113);
                            class176.field2935.method1468(var3, 0);
                            ++class243.field4226;
                        }
                    }
                    if (~var4 == -37) {
                        ++class146.field2515;
                        class174.method1113(arg1 ^ 119, var5, var6, var2);
                        class176.field2935.method664((byte) -125, 66);
                        class176.field2935.method1451(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -123);
                        class176.field2935.method1468(class192.field3267 + var5, 0);
                        class176.field2935.method1468(class78.field1367 + var2, 0);
                    }
                    if (var4 == 48) {
                        class225 var17 = class27.field446[var3];
                        if (var17 != null) {
                            class117.method736(98, 1, 0, var17.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var17.field49[0], 2, false, 1);
                            ++class47.field838;
                            class144.field2471 = class81.field1403;
                            class177.field2966 = class232.field4043;
                            class14.field257 = 2;
                            class193.field3288 = 0;
                            class176.field2935.method664((byte) -128, 248);
                            class176.field2935.method1424(class143.field2452, false);
                            class176.field2935.method1476(class147.field2558, arg1 ^ 126);
                            class176.field2935.method1451(var3, (byte) -113);
                        }
                    }
                    if (~var4 == -4) {
                        class142.method900((byte) -66);
                        class105 var18 = class27.method137(var2, -954490064);
                        class119.field2162 = var5;
                        class5.field116 = var3;
                        class167.field2789 = var2;
                        class122.field2199 = 1;
                        class198.method1268(80, var18);
                        class184.field3130 = class76.method445((byte) -124, new class227[] { class99.field1735, class133.method815(var3, (byte) -70).field3048, class221.field3743 });
                        if (class184.field3130 == null) {
                            class184.field3130 = class54.field946;
                        }
                    } else {
                        if (~var4 == -36) {
                            ++class192.field3259;
                            class176.field2935.method664((byte) 46, 2);
                            class176.field2935.method1427(var2, (byte) -100);
                            class105 var19 = class27.method137(var2, -954490064);
                            if (var19.field1979 != null && var19.field1979[0][0] == 5) {
                                int var20 = var19.field1979[0][1];
                                if (~class139.field2416[var20] != ~var19.field1936[0]) {
                                    class139.field2416[var20] = var19.field1936[0];
                                    class225.method1417(var20, (byte) 123);
                                }
                            }
                        }
                        if (var4 == 50) {
                            ++class125.field2231;
                            class176.field2935.method664((byte) 110, 238);
                            class176.field2935.method1445(var2, -718520472);
                            class176.field2935.method1468(var5, 0);
                            class176.field2935.method1449(var3, (byte) 116);
                            class193.field3296 = 0;
                            class77.field1349 = class27.method137(var2, -954490064);
                            class103.field1806 = var5;
                        }
                        if (~var4 == -39 && class125.field2249 == null) {
                            class131.method811(73, var2, var5);
                            class125.field2249 = class255.method1738(var2, (byte) -63, var5);
                            class198.method1268(125, class125.field2249);
                        }
                        if (~var4 == -11) {
                            class195 var21 = class220.field3715[var3];
                            if (var21 != null) {
                                class117.method736(arg1 + -5, 1, 0, var21.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var21.field49[0], 2, false, 1);
                                class177.field2966 = class232.field4043;
                                class144.field2471 = class81.field1403;
                                ++class3.field37;
                                class14.field257 = 2;
                                class193.field3288 = 0;
                                class176.field2935.method664((byte) -112, 23);
                                class176.field2935.method1476(var3, 119);
                            }
                        }
                        if (var4 == 22) {
                            ++class191.field3231;
                            class176.field2935.method664((byte) 96, 101);
                            class176.field2935.method1475(true, class167.field2789);
                            class176.field2935.method1449(var5, (byte) 121);
                            class176.field2935.method1451(class5.field116, (byte) -111);
                            class176.field2935.method1449(class119.field2162, (byte) 121);
                            class176.field2935.method1468(var3, 0);
                            class176.field2935.method1424(var2, false);
                            class193.field3296 = 0;
                            class77.field1349 = class27.method137(var2, -954490064);
                            class103.field1806 = var5;
                        }
                        if (var4 == 43) {
                            class225 var22 = class27.field446[var3];
                            if (var22 != null) {
                                class117.method736(126, 1, 0, var22.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var22.field49[0], 2, false, 1);
                                class177.field2966 = class232.field4043;
                                class193.field3288 = 0;
                                class144.field2471 = class81.field1403;
                                class14.field257 = 2;
                                ++class122.field2196;
                                class176.field2935.method664((byte) -100, 255);
                                class176.field2935.method1468(var3, 0);
                            }
                        }
                        if (~var4 == -42) {
                            ++class194.field3308;
                            class176.field2935.method664((byte) -106, 31);
                            class176.field2935.method1451(var5, (byte) -118);
                            class176.field2935.method1475(true, var2);
                            class176.field2935.method1449(var3, (byte) 108);
                            class193.field3296 = 0;
                            class77.field1349 = class27.method137(var2, arg1 + -954490183);
                            class103.field1806 = var5;
                        }
                        if (var4 == 15 && class174.method1113(0, var5, var6, var2)) {
                            ++class145.field2493;
                            class176.field2935.method664((byte) 69, 126);
                            class176.field2935.method1424(class167.field2789, false);
                            class176.field2935.method1449(class192.field3267 + var5, (byte) 110);
                            class176.field2935.method1451(class119.field2162, (byte) -120);
                            class176.field2935.method1449(class5.field116, (byte) 124);
                            class176.field2935.method1449(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 114);
                            class176.field2935.method1451(var2 - -class78.field1367, (byte) -116);
                        }
                        if (var4 == 14) {
                            ++class185.field3148;
                            boolean var23 = class117.method736(64, 0, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 0);
                            if (!var23) {
                                class117.method736(arg1 + -48, 1, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 1);
                            }
                            class144.field2471 = class81.field1403;
                            class177.field2966 = class232.field4043;
                            class14.field257 = 2;
                            class193.field3288 = 0;
                            class176.field2935.method664((byte) 72, 100);
                            class176.field2935.method1468(class192.field3267 + var5, 0);
                            class176.field2935.method1451(var3, (byte) -122);
                            class176.field2935.method1468(class78.field1367 + var2, 0);
                        }
                        if (var4 == 1002) {
                            ++class13.field244;
                            class174.method1113(0, var5, var6, var2);
                            class176.field2935.method664((byte) 100, 46);
                            class176.field2935.method1451(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -114);
                            class176.field2935.method1451(class192.field3267 + var5, (byte) -126);
                            class176.field2935.method1468(class78.field1367 + var2, 0);
                        }
                        if (var4 == 16) {
                            class105 var25 = class27.method137(var2, -954490064);
                            boolean var26 = true;
                            if (~var25.field1975 < -1) {
                                var26 = class186.method1181(205, var25);
                            }
                            if (var26) {
                                class176.field2935.method664((byte) -105, 2);
                                class176.field2935.method1427(var2, (byte) -110);
                                ++class192.field3259;
                            }
                        }
                        if (~var4 == -12) {
                            class225 var27 = class27.field446[var3];
                            if (var27 != null) {
                                class117.method736(96, 1, 0, var27.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var27.field49[0], 2, false, 1);
                                class144.field2471 = class81.field1403;
                                class177.field2966 = class232.field4043;
                                class14.field257 = 2;
                                ++class190.field3223;
                                class193.field3288 = 0;
                                class176.field2935.method664((byte) -127, 35);
                                class176.field2935.method1475(true, class167.field2789);
                                class176.field2935.method1468(class119.field2162, 0);
                                class176.field2935.method1468(class5.field116, 0);
                                class176.field2935.method1449(var3, (byte) 113);
                            }
                        }
                        if (~var4 == -13 && class174.method1113(0, var5, var6, var2)) {
                            ++class18.field302;
                            class176.field2935.method664((byte) -101, 202);
                            class176.field2935.method1476(class147.field2558, 24);
                            class176.field2935.method1468((int) (var6 >>> 32) & Integer.MAX_VALUE, 0);
                            class176.field2935.method1449(class192.field3267 + var5, (byte) 115);
                            class176.field2935.method1475(true, class143.field2452);
                            class176.field2935.method1449(class78.field1367 + var2, (byte) 125);
                        }
                        if (~var4 == -14) {
                            class225 var28 = class27.field446[var3];
                            if (var28 != null) {
                                ++class229.field3991;
                                class117.method736(76, 1, 0, var28.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var28.field49[0], 2, false, 1);
                                class144.field2471 = class81.field1403;
                                class193.field3288 = 0;
                                class14.field257 = 2;
                                class177.field2966 = class232.field4043;
                                class176.field2935.method664((byte) 127, 221);
                                class176.field2935.method1476(var3, arg1 + -228);
                            }
                        }
                        if (var4 == 5) {
                            class176.field2935.method664((byte) 27, 97);
                            ++class134.field2326;
                            class176.field2935.method1476(var3, -100);
                            class176.field2935.method1476(var5, arg1 ^ 61);
                            class176.field2935.method1475(true, var2);
                            class193.field3296 = 0;
                            class77.field1349 = class27.method137(var2, -954490064);
                            class103.field1806 = var5;
                        }
                        if (~var4 == -46) {
                            ++class185.field3153;
                            boolean var29 = class117.method736(55, 0, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 0);
                            if (!var29) {
                                class117.method736(arg1 ^ 23, 1, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 1);
                            }
                            class144.field2471 = class81.field1403;
                            class193.field3288 = 0;
                            class177.field2966 = class232.field4043;
                            class14.field257 = 2;
                            class176.field2935.method664((byte) 47, 241);
                            class176.field2935.method1468(var3, 0);
                            class176.field2935.method1476(class147.field2558, 104);
                            class176.field2935.method1468(class192.field3267 + var5, 0);
                            class176.field2935.method1449(class78.field1367 + var2, (byte) 125);
                            class176.field2935.method1445(class143.field2452, arg1 + -718520591);
                        }
                        if (~var4 == -59) {
                            ++class192.field3259;
                            class176.field2935.method664((byte) 102, 2);
                            class176.field2935.method1427(var2, (byte) -122);
                            class105 var31 = class27.method137(var2, -954490064);
                            if (var31.field1979 != null && var31.field1979[0][0] == 5) {
                                int var32 = var31.field1979[0][1];
                                class139.field2416[var32] = -class139.field2416[var32] + 1;
                                class225.method1417(var32, (byte) 117);
                            }
                        }
                        if (~var4 == -35) {
                            class225 var33 = class27.field446[var3];
                            if (var33 != null) {
                                class117.method736(67, 1, 0, var33.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var33.field49[0], 2, false, 1);
                                class177.field2966 = class232.field4043;
                                ++class98.field1715;
                                class144.field2471 = class81.field1403;
                                class14.field257 = 2;
                                class193.field3288 = 0;
                                class176.field2935.method664((byte) -105, 227);
                                class176.field2935.method1449(var3, (byte) 121);
                            }
                        }
                        if (~var4 == -52) {
                            ++class182.field3101;
                            class176.field2935.method664((byte) -111, 57);
                            class176.field2935.method1449(var3, (byte) 117);
                            class176.field2935.method1424(var2, false);
                            class176.field2935.method1451(var5, (byte) -117);
                            class193.field3296 = 0;
                            class77.field1349 = class27.method137(var2, -954490064);
                            class103.field1806 = var5;
                        }
                        if (~var4 == -2) {
                            ++class41.field676;
                            class174.method1113(0, var5, var6, var2);
                            class176.field2935.method664((byte) -120, 51);
                            class176.field2935.method1468((int) (var6 >>> 32) & Integer.MAX_VALUE, 0);
                            class176.field2935.method1476(class78.field1367 + var2, 11);
                            class176.field2935.method1468(class192.field3267 + var5, 0);
                        }
                        if (var4 == 44) {
                            class225 var34 = class27.field446[var3];
                            if (var34 != null) {
                                class117.method736(124, 1, 0, var34.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var34.field49[0], 2, false, 1);
                                class144.field2471 = class81.field1403;
                                class193.field3288 = 0;
                                ++class31.field497;
                                class14.field257 = 2;
                                class177.field2966 = class232.field4043;
                                class176.field2935.method664((byte) 90, 252);
                                class176.field2935.method1451(var3, (byte) -112);
                            }
                        }
                        if (~var4 == -7) {
                            class225 var35 = class27.field446[var3];
                            if (var35 != null) {
                                ++class145.field2491;
                                class117.method736(83, 1, 0, var35.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var35.field49[0], 2, false, 1);
                                class144.field2471 = class81.field1403;
                                class177.field2966 = class232.field4043;
                                class193.field3288 = 0;
                                class14.field257 = 2;
                                class176.field2935.method664((byte) -117, 203);
                                class176.field2935.method1468(var3, 0);
                            }
                        }
                        if (~var4 == -41) {
                            class65.method411(arg1 ^ 22410);
                        }
                        if (var4 == 23) {
                            class225 var36 = class27.field446[var3];
                            if (var36 != null) {
                                ++class15.field282;
                                class117.method736(118, 1, 0, var36.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var36.field49[0], 2, false, 1);
                                class144.field2471 = class81.field1403;
                                class193.field3288 = 0;
                                class14.field257 = 2;
                                class177.field2966 = class232.field4043;
                                class176.field2935.method664((byte) -124, 152);
                                class176.field2935.method1451(var3, (byte) -126);
                            }
                        }
                        if (var4 == 39) {
                            class79.method462(class64.field1171, var5, var2);
                        }
                        if (~var4 == -1008) {
                            class144.field2471 = class81.field1403;
                            class14.field257 = 2;
                            ++class2.field27;
                            class193.field3288 = 0;
                            class177.field2966 = class232.field4043;
                            class176.field2935.method664((byte) 119, 159);
                            class176.field2935.method1476(var3, -76);
                        }
                        if (var4 == 19) {
                            class225 var37 = class27.field446[var3];
                            if (var37 != null) {
                                class117.method736(arg1 + -52, 1, 0, var37.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var37.field49[0], 2, false, 1);
                                ++class175.field2917;
                                class177.field2966 = class232.field4043;
                                class14.field257 = 2;
                                class193.field3288 = 0;
                                class144.field2471 = class81.field1403;
                                class176.field2935.method664((byte) -118, 38);
                                class176.field2935.method1449(var3, (byte) 107);
                            }
                        }
                        if (var4 == 33) {
                            ++class28.field454;
                            boolean var38 = class117.method736(arg1 ^ 18, 0, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 0);
                            if (!var38) {
                                class117.method736(arg1 ^ 46, 1, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 1);
                            }
                            class177.field2966 = class232.field4043;
                            class14.field257 = 2;
                            class193.field3288 = 0;
                            class144.field2471 = class81.field1403;
                            class176.field2935.method664((byte) -99, 160);
                            class176.field2935.method1449(class78.field1367 + var2, (byte) 127);
                            class176.field2935.method1468(var3, 0);
                            class176.field2935.method1468(class192.field3267 + var5, 0);
                        }
                        if (~var4 == -32) {
                            ++class179.field3066;
                            boolean var40 = class117.method736(104, 0, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 0);
                            if (!var40) {
                                class117.method736(110, 1, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 1);
                            }
                            class14.field257 = 2;
                            class177.field2966 = class232.field4043;
                            class193.field3288 = 0;
                            class144.field2471 = class81.field1403;
                            class176.field2935.method664((byte) -114, 107);
                            class176.field2935.method1468(class192.field3267 + var5, 0);
                            class176.field2935.method1451(var2 - -class78.field1367, (byte) -124);
                            class176.field2935.method1449(var3, (byte) 122);
                        }
                        if (~var4 == -1002) {
                            class177.field2966 = class232.field4043;
                            class193.field3288 = 0;
                            class144.field2471 = class81.field1403;
                            class14.field257 = 2;
                            class195 var42 = class220.field3715[var3];
                            if (var42 != null) {
                                class147 var43 = var42.field3315;
                                if (var43.field2563 != null) {
                                    var43 = var43.method933(arg1 ^ 29901);
                                }
                                if (var43 != null) {
                                    class176.field2935.method664((byte) 64, 205);
                                    ++class125.field2240;
                                    class176.field2935.method1451(var43.field2526, (byte) -123);
                                }
                            }
                        }
                        if (~var4 == -5) {
                            ++class96.field1674;
                            boolean var44 = class117.method736(89, 0, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 0);
                            if (!var44) {
                                class117.method736(114, 1, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 1);
                            }
                            class193.field3288 = 0;
                            class144.field2471 = class81.field1403;
                            class177.field2966 = class232.field4043;
                            class14.field257 = 2;
                            class176.field2935.method664((byte) -125, 247);
                            class176.field2935.method1449(var3, (byte) 126);
                            class176.field2935.method1449(class192.field3267 + var5, (byte) 120);
                            class176.field2935.method1468(var2 - -class78.field1367, 0);
                        }
                        if (var4 == 25) {
                            class195 var46 = class220.field3715[var3];
                            if (var46 != null) {
                                ++class167.field2796;
                                class117.method736(76, 1, 0, var46.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var46.field49[0], 2, false, 1);
                                class193.field3288 = 0;
                                class144.field2471 = class81.field1403;
                                class177.field2966 = class232.field4043;
                                class14.field257 = 2;
                                class176.field2935.method664((byte) -125, 231);
                                class176.field2935.method1468(class147.field2558, 0);
                                class176.field2935.method1424(class143.field2452, false);
                                class176.field2935.method1468(var3, 0);
                            }
                        }
                        if (var4 == 49) {
                            class195 var47 = class220.field3715[var3];
                            if (var47 != null) {
                                ++class222.field3756;
                                class117.method736(arg1 ^ 18, 1, 0, var47.field78[0], class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var47.field49[0], 2, false, 1);
                                class144.field2471 = class81.field1403;
                                class14.field257 = 2;
                                class177.field2966 = class232.field4043;
                                class193.field3288 = 0;
                                class176.field2935.method664((byte) -116, 220);
                                class176.field2935.method1424(class167.field2789, false);
                                class176.field2935.method1449(var3, (byte) 106);
                                class176.field2935.method1468(class5.field116, 0);
                                class176.field2935.method1451(class119.field2162, (byte) -110);
                            }
                        }
                        if (~var4 == -9) {
                            class176.field2935.method664((byte) -104, 90);
                            class176.field2935.method1451(var3, (byte) -124);
                            ++class57.field1045;
                            class176.field2935.method1468(var5, 0);
                            class176.field2935.method1445(var2, -718520472);
                            class193.field3296 = 0;
                            class77.field1349 = class27.method137(var2, -954490064);
                            class103.field1806 = var5;
                        }
                        if (var4 == 21) {
                            class176.field2935.method664((byte) -104, 167);
                            ++class168.field2815;
                            class176.field2935.method1476(var3, 116);
                            class176.field2935.method1451(var5, (byte) -115);
                            class176.field2935.method1427(var2, (byte) -101);
                            class193.field3296 = 0;
                            class77.field1349 = class27.method137(var2, -954490064);
                            class103.field1806 = var5;
                        }
                        if (var4 == 32) {
                            class176.field2935.method664((byte) 46, 71);
                            ++class41.field677;
                            class176.field2935.method1475(true, var2);
                            class176.field2935.method1451(var5, (byte) -113);
                            class176.field2935.method1476(var3, 68);
                            class193.field3296 = 0;
                            class77.field1349 = class27.method137(var2, arg1 ^ -954490041);
                            class103.field1806 = var5;
                        }
                        if (var4 == 24) {
                            ++class58.field1063;
                            boolean var48 = class117.method736(117, 0, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 0);
                            if (!var48) {
                                class117.method736(78, 1, 0, var5, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var2, 2, false, 1);
                            }
                            class144.field2471 = class81.field1403;
                            class193.field3288 = 0;
                            class177.field2966 = class232.field4043;
                            class14.field257 = 2;
                            class176.field2935.method664((byte) -104, 209);
                            class176.field2935.method1468(var3, 0);
                            class176.field2935.method1468(class78.field1367 + var2, 0);
                            class176.field2935.method1468(class192.field3267 + var5, 0);
                        }
                        if (~var4 == -3) {
                            class176.field2935.method664((byte) -102, 102);
                            class176.field2935.method1445(class143.field2452, -718520472);
                            ++class71.field1246;
                            class176.field2935.method1476(var5, 127);
                            class176.field2935.method1427(var2, (byte) 48);
                            class176.field2935.method1449(class147.field2558, (byte) 120);
                        }
                        if (~var4 == -30) {
                            ++class52.field915;
                            class174.method1113(0, var5, var6, var2);
                            class176.field2935.method664((byte) -119, 174);
                            class176.field2935.method1468(class78.field1367 + var2, 0);
                            class176.field2935.method1449(class192.field3267 + var5, (byte) 116);
                            class176.field2935.method1468(Integer.MAX_VALUE & (int) (var6 >>> 32), 0);
                        }
                        if (var4 == 1005) {
                            class177.field2966 = class232.field4043;
                            ++class91.field1550;
                            class193.field3288 = 0;
                            class14.field257 = 2;
                            class144.field2471 = class81.field1403;
                            class176.field2935.method664((byte) -107, 147);
                            class176.field2935.method1451(var3, (byte) -122);
                        }
                        if (var4 == 7) {
                            class176.field2935.method664((byte) 16, 83);
                            class176.field2935.method1427(class143.field2452, (byte) -115);
                            ++class59.field1095;
                            class176.field2935.method1449(var5, (byte) 111);
                            class176.field2935.method1468(class147.field2558, 0);
                            class176.field2935.method1449(var3, (byte) 111);
                            class176.field2935.method1427(var2, (byte) -116);
                            class193.field3296 = 0;
                            class77.field1349 = class27.method137(var2, arg1 + -954490183);
                            class103.field1806 = var5;
                        }
                        if (~class122.field2199 != -1) {
                            class122.field2199 = 0;
                            class198.method1268(124, class27.method137(class167.field2789, -954490064));
                        }
                        if (class57.field1050) {
                            class142.method900((byte) -120);
                        }
                        if (class77.field1349 != null && class193.field3296 == 0) {
                            class198.method1268(107, class77.field1349);
                        }
                    }
                }
            }
        }
    }
}
