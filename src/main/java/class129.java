import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class129 extends class32 {

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "[Ldg;")
    public static class206[] field2257 = new class206[50];

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Le;")
    public static class86 field2259 = new class86();

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Ltb;")
    public static class253 field2271;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Lij;")
    public class50 field2263;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "[I")
    public static int[] field2272;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[Lij;")
    public class50[] field2256;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static final void method917(byte arg0) {
        field2269++;
        if (class178.field2970 == 0 || class178.field2970 == 5) {
            return;
        }
        try {
            if (++class238.field4044 > 2000) {
                if (class148.field2547 != null) {
                    class148.field2547.method630(2);
                    class148.field2547 = null;
                }
                if (class34.field671 >= 1) {
                    class91.field1719 = -5;
                    class178.field2970 = 0;
                    return;
                }
                if (class82.field1479 == class15.field344) {
                    class15.field344 = class249.field4319;
                } else {
                    class15.field344 = class82.field1479;
                }
                class34.field671++;
                class178.field2970 = 1;
                class238.field4044 = 0;
            }
            if (class178.field2970 == 1) {
                class163.field2797 = class186.field3058.method966((byte) 51, class176.field2950, class15.field344);
                class178.field2970 = 2;
            }
            if (class178.field2970 == 2) {
                if (class163.field2797.field133 == 2) {
                    throw new IOException();
                }
                if (class163.field2797.field133 != 1) {
                    return;
                }
                class148.field2547 = new class83((Socket) class163.field2797.field132, class186.field3058);
                class163.field2797 = null;
                long var1 = class132.field2308 = class245.field4276.method368((byte) -103);
                class190.field3141.field3581 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class190.field3141.method1471(14, (byte) 24);
                class190.field3141.method1471(var3, (byte) 24);
                class148.field2547.method632(0, class190.field3141.field3633, 2, true);
                if (class219.field3664 != null) {
                    class219.field3664.method596((byte) 29);
                }
                if (class133.field2330 != null) {
                    class133.field2330.method596((byte) 95);
                }
                int var4 = class148.field2547.method627((byte) 48);
                if (class219.field3664 != null) {
                    class219.field3664.method596((byte) -115);
                }
                if (class133.field2330 != null) {
                    class133.field2330.method596((byte) 68);
                }
                if (var4 != 0) {
                    class91.field1719 = var4;
                    class178.field2970 = 0;
                    class148.field2547.method630(2);
                    class148.field2547 = null;
                    return;
                }
                class178.field2970 = 3;
            }
            int var5 = -25 % ((arg0 - 37) / 54);
            if (class178.field2970 == 3) {
                if (class148.field2547.method631((byte) -43) < 8) {
                    return;
                }
                int[] var6 = new int[4];
                class148.field2547.method633(false, class119.field2109.field3633, 0, 8);
                class119.field2109.field3581 = 0;
                class231.field3878 = class119.field2109.method1443(50);
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                var6[3] = (int) class231.field3878;
                var6[2] = (int) (class231.field3878 >> 32);
                class190.field3141.field3581 = 0;
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                class190.field3141.method1471(10, (byte) 24);
                class190.field3141.method1446(125, var6[0]);
                class190.field3141.method1446(102, var6[1]);
                class190.field3141.method1446(126, var6[2]);
                class190.field3141.method1446(-6, var6[3]);
                class190.field3141.method1464(class245.field4276.method368((byte) -103), 867341416);
                class190.field3141.method1482(class245.field4275, -29586);
                class190.field3141.method1481(-5409, class141.field2478, class43.field786);
                class76.field1436.field3581 = 0;
                if (class25.field537 == 40) {
                    class76.field1436.method1471(18, (byte) 24);
                } else {
                    class76.field1436.method1471(16, (byte) 24);
                }
                class76.field1436.method1494((class190.field3141.field3581 + class122.method886(class144.field2505, 50)) + 149, (byte) -19);
                class76.field1436.method1446(104, 505);
                class76.field1436.method1471(0, (byte) 24);
                class76.field1436.method1494(class1.field1, (byte) -33);
                class76.field1436.method1494(class136.field2370, (byte) -49);
                class195.method1319(9157, class76.field1436);
                class76.field1436.method1482(class144.field2505, -29586);
                class76.field1436.method1446(-69, class89.field1693);
                class76.field1436.method1446(0, class190.method1284(false));
                class190.field3152 = true;
                class76.field1436.method1446(120, class10.field179.field492);
                class76.field1436.method1446(114, class219.field3653.field492);
                class76.field1436.method1446(116, class48.field865.field492);
                class76.field1436.method1446(-93, class71.field1365.field492);
                class76.field1436.method1446(122, class124.field2181.field492);
                class76.field1436.method1446(-84, class142.field2495.field492);
                class76.field1436.method1446(-8, class56.field1014.field492);
                class76.field1436.method1446(104, class97.field1809.field492);
                class76.field1436.method1446(-116, class24.field530.field492);
                class76.field1436.method1446(-9, class6.field74.field492);
                class76.field1436.method1446(115, class140.field2451.field492);
                class76.field1436.method1446(-90, class66.field1264.field492);
                class76.field1436.method1446(-114, class245.field4265.field492);
                class76.field1436.method1446(-25, class87.field1675.field492);
                class76.field1436.method1446(120, class82.field1476.field492);
                class76.field1436.method1446(96, class219.field3659.field492);
                class76.field1436.method1446(-116, class102.field1877.field492);
                class76.field1436.method1446(127, class137.field2375.field492);
                class76.field1436.method1446(123, class46.field838.field492);
                class76.field1436.method1446(113, class245.field4281.field492);
                class76.field1436.method1446(114, class118.field2081.field492);
                class76.field1436.method1446(106, class195.field3238.field492);
                class76.field1436.method1446(126, class177.field2967.field492);
                class76.field1436.method1446(106, class37.field715.field492);
                class76.field1436.method1446(-32, class27.field585.field492);
                class76.field1436.method1446(127, class10.field293.field492);
                class76.field1436.method1446(102, class20.field417.field492);
                class76.field1436.method1491(0, class190.field3141.field3633, class190.field3141.field3581, (byte) 123);
                class148.field2547.method632(0, class76.field1436.field3633, class76.field1436.field3581, true);
                class190.field3141.method1594((byte) -83, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class119.field2109.method1594((byte) 62, var6);
                class178.field2970 = 4;
            }
            if (class178.field2970 == 4) {
                if (class148.field2547.method631((byte) -23) < 1) {
                    return;
                }
                int var8 = class148.field2547.method627((byte) 48);
                if (var8 == 21) {
                    class178.field2970 = 7;
                } else if (var8 == 1) {
                    class91.field1719 = var8;
                    class178.field2970 = 5;
                    return;
                } else if (var8 == 2) {
                    class178.field2970 = 8;
                } else if (var8 == 15) {
                    class178.field2970 = 0;
                    class91.field1719 = var8;
                    return;
                } else if (var8 == 23 && class34.field671 < 1) {
                    class178.field2970 = 1;
                    class238.field4044 = 0;
                    class34.field671++;
                    class148.field2547.method630(2);
                    class148.field2547 = null;
                    return;
                } else {
                    class178.field2970 = 0;
                    class91.field1719 = var8;
                    class148.field2547.method630(2);
                    class148.field2547 = null;
                    return;
                }
            }
            if (class178.field2970 == 6) {
                class190.field3141.field3581 = 0;
                class190.field3141.method1598((byte) -101, 17);
                class148.field2547.method632(0, class190.field3141.field3633, class190.field3141.field3581, true);
                class178.field2970 = 4;
            } else if (class178.field2970 != 7) {
                if (class178.field2970 == 8) {
                    if (class148.field2547.method631((byte) -103) < 11) {
                        return;
                    }
                    class148.field2547.method633(false, class119.field2109.field3633, 0, 11);
                    class119.field2109.field3581 = 0;
                    class18.field397 = class119.field2109.method1487(255);
                    class24.field532 = class119.field2109.method1487(255);
                    class255.field4403 = class119.field2109.method1487(255);
                    if (class255.field4403 == 1) {
                        try {
                            class48.field869.method378(class186.field3058.field2408, 105);
                        } catch (Throwable var9) {
                        }
                    } else {
                        try {
                            class255.field4415.method378(class186.field3058.field2408, 57);
                        } catch (Throwable var10) {
                        }
                    }
                    class66.field1262 = class119.field2109.method1487(255);
                    class243.field4216 = class119.field2109.method1487(255) == 1;
                    class240.field4124 = class119.field2109.method1441(113);
                    class1.field14 = class119.field2109.method1487(255);
                    class213.field3523 = class119.field2109.method1599(-128);
                    class20.field428 = class119.field2109.method1441(107);
                    class178.field2970 = 9;
                }
                if (class178.field2970 == 9 && class148.field2547.method631((byte) -56) >= class20.field428) {
                    class119.field2109.field3581 = 0;
                    class148.field2547.method633(false, class119.field2109.field3633, 0, class20.field428);
                    class91.field1719 = 2;
                    class178.field2970 = 0;
                    class175.method1208(85);
                    class31.field619 = -1;
                    class176.method1211(false, false);
                    class213.field3523 = -1;
                }
            } else if (class148.field2547.method631((byte) -95) >= 1) {
                class65.field1231 = (class148.field2547.method627((byte) 48) + 3) * 60;
                class91.field1719 = 21;
                class178.field2970 = 0;
                class148.field2547.method630(2);
                class148.field2547 = null;
            }
        } catch (IOException var11) {
            if (class148.field2547 != null) {
                class148.field2547.method630(2);
                class148.field2547 = null;
            }
            if (class34.field671 >= 1) {
                class178.field2970 = 0;
                class91.field1719 = -4;
            } else {
                if (class82.field1479 == class15.field344) {
                    class15.field344 = class249.field4319;
                } else {
                    class15.field344 = class82.field1479;
                }
                class238.field4044 = 0;
                class34.field671++;
                class178.field2970 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
    public static final void method918(int arg0) {
        class161.field2767.method762((byte) 117);
        field2261++;
        if (arg0 != -10158) {
            field2271 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public static void method919(int arg0) {
        field2272 = null;
        field2259 = null;
        if (arg0 == 4) {
            field2257 = null;
            field2271 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
    public static final void method920(int arg0, int arg1) {
        field2262++;
        class169 var2;
        if (class228.field3831 == null) {
            var2 = new class169(512, 512);
        } else {
            var2 = (class169) class228.field3831;
        }
        int[] var3 = var2.field2836;
        int var4 = var3.length;
        int var5 = -77 % ((-arg1 - 39) / 61);
        for (int var6 = 0; var6 < var4; var6++) {
            var3[var6] = 1;
        }
        for (int var7 = 1; var7 < 103; var7++) {
            int var25 = (103 - var7) * 512 * 4 + 24628;
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class210.field3495[arg0][var26][var7] & 0x18) == 0) {
                    class31.method266(var3, var25, 512, arg0, var26, var7);
                }
                if (arg0 < 3 && (class210.field3495[arg0 + 1][var26][var7] & 0x8) != 0) {
                    class31.method266(var3, var25, 512, arg0 + 1, var26, var7);
                }
                var25 += 4;
            }
        }
        int var8 = (int) (Math.random() * 20.0D) + 228 << 16;
        int var9 = -(-((int) (Math.random() * 20.0D)) - ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - ((int) (Math.random() * 20.0D) + 238 + -10 << 8) - 238) - 10;
        var2.method1164();
        for (int var10 = 1; var10 < 103; var10++) {
            for (int var24 = 1; var24 < 103; var24++) {
                if ((class210.field3495[arg0][var24][var10] & 0x18) == 0) {
                    class36.method284((byte) -12, var10, arg0, var9, var24, var8);
                }
                if (arg0 < 3 && (class210.field3495[arg0 + 1][var24][var10] & 0x8) != 0) {
                    class36.method284((byte) -78, var10, arg0 + 1, var9, var24, var8);
                }
            }
        }
        class250.field4345 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = class17.method132(class201.field3312, var11, var12);
                if (var13 != 0L) {
                    class243 var15 = class53.method426((byte) -90, Integer.MAX_VALUE & (int) (var13 >>> 32));
                    int var16 = var15.field4179;
                    if (var15.field4197 != null) {
                        for (int var17 = 0; var17 < var15.field4197.length; var17++) {
                            if (var15.field4197[var17] != -1) {
                                class243 var18 = class53.method426((byte) -90, var15.field4197[var17]);
                                if (var18.field4179 >= 0) {
                                    var16 = var18.field4179;
                                    break;
                                }
                            }
                        }
                    }
                    if (var16 >= 0) {
                        int var19 = var11;
                        int var20 = var12;
                        if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
                            int[][] var21 = class45.field826[class201.field3312].field814;
                            for (int var22 = 0; var22 < 10; var22++) {
                                int var23 = (int) (Math.random() * 4.0D);
                                if (var23 == 0 && var19 > 0 && var19 > (var11 - 3) && (var21[var19 - 1][var20] & 0x12C0108) == 0) {
                                    var19--;
                                }
                                if (var23 == 1 && var19 < 103 && var19 < var11 + 3 && (var21[var19 + 1][var20] & 0x12C0180) == 0) {
                                    var19++;
                                }
                                if (var23 == 2 && var20 > 0 && var12 - 3 < var20 && (var21[var19][var20 - 1] & 0x12C0102) == 0) {
                                    var20--;
                                }
                                if (var23 == 3 && var20 < 103 && var20 < var12 + 3 && (var21[var19][var20 + 1] & 0x12C0120) == 0) {
                                    var20++;
                                }
                            }
                        }
                        class89.field1704[class250.field4345] = var15.field4200;
                        class39.field721[class250.field4345] = var19;
                        class256.field4431[class250.field4345] = var20;
                        class250.field4345++;
                    }
                }
            }
        }
        class228.field3831 = var2;
        class221.field3725.method454(123);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lij;Lij;IISZJ)V")
    public static final void method921(class50 arg0, class50 arg1, int arg2, int arg3, short arg4, boolean arg5, long arg6) {
        field2264++;
        if (!arg5) {
            method917((byte) -111);
        }
        if (class205.field3406 || class136.field2368 >= 500) {
            return;
        }
        class250.field4334[class136.field2368] = arg0;
        class36.field691[class136.field2368] = arg1;
        class17.field379[class136.field2368] = arg4;
        class215.field3551[class136.field2368] = arg6;
        class41.field755[class136.field2368] = arg2;
        class206.field3423[class136.field2368] = arg3;
        class136.field2368++;
    }
}
