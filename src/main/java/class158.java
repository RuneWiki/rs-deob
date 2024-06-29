import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class158 {

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Lqe;")
    public static class168 field2734 = class66.method448("null", -126);

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field2732 = 2;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "S")
    public static short field2738 = 32767;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "Lqe;")
    public static class168 field2741 = class66.method448("Ablegen", 8);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public int field2722;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public int field2739;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "Lvf;")
    public static class250 field2735;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Loe;")
    public static class256 field2728;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lcd;")
    public static class72 field2724;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "[Lgd;")
    public static class65[] field2733;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static final void method1030(int arg0) {
        class117.field1905.method1497((byte) 23);
        class175.field3076.method14(false);
        class198.field3427.method1497((byte) 58);
        if (arg0 == -23273) {
            field2736++;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lqe;Lqe;Lqe;II)V")
    public static final void method1031(class168 arg0, class168 arg1, class168 arg2, int arg3, int arg4) {
        class94.method626(arg2, (byte) 108, arg1, arg4, arg3, arg0);
        field2729++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ldc;BZ)V")
    public static final void method1032(class114 arg0, byte arg1, boolean arg2) {
        field2727++;
        int var3 = arg0.field1853;
        int var4 = (int) arg0.field3308;
        if (arg1 > -126) {
            method1037(51, false, -124);
        }
        arg0.method1234(17216);
        if (arg2) {
            class191.method1238(false, var3);
        }
        class118.method811(true, var3);
        class129 var5 = class257.method1713(var4, 127);
        if (var5 != null) {
            class65.method443(var5, 0);
        }
        class109.field1748 = 0;
        class169.field2956 = false;
        class208.method1352(class150.field2620, -622332702, class36.field443, class139.field2462, class16.field144);
        if (class137.field2426 != -1) {
            class87.method575((byte) -23, class137.field2426, 1);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)I")
    public static final int method1033(byte arg0) {
        field2726++;
        if (arg0 != -12) {
            method1031(null, null, null, 111, 66);
        }
        return ((class62.field847 == 0 ? 0 : 1) << 20) + ((class98.field1551 ? 1 : 0) << 16) + ((class101.field1601 ? 1 : 0) << 13) + ((class253.field4382 ? 1 : 0) << 10) + ((class207.field3593 ? 1 : 0) << 9) + ((class153.field2651 ? 1 : 0) << 8) + ((class17.field149 ? 1 : 0) << 7) + ((class227.field3866 ? 1 : 0) << 5) + ((class62.field844 ? 1 : 0) << 3) + (class132.field2323 & 0x7) + ((class249.field4315 ? 1 : 0) << 4) + ((class3.field34 ? 1 : 0) << 6) + ((class112.field1781 & 0x3) << 11) + ((class177.field3117 ? 1 : 0) << 15) + ((class191.field3333 & 0x3) << 17) - (-((class247.field4284 ? 1 : 0) << 19) - (((class93.field1464 == 0 ? 0 : 1) << 21) - -((class166.field2828 == 0 ? 0 : 1) << 22)));
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Z")
    public static final boolean method1034(int arg0, int arg1, int arg2) {
        int var3 = class93.field1467[arg0][arg1][arg2];
        if (-class129.field2266 == var3) {
            return false;
        } else if (class129.field2266 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class64.method428(var4 + 1, class23.field275[arg0][arg1][arg2], var5 + 1) && class64.method428(var4 + 128 - 1, class23.field275[arg0][arg1 + 1][arg2], var5 + 1) && class64.method428(var4 + 128 - 1, class23.field275[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class64.method428(var4 + 1, class23.field275[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class93.field1467[arg0][arg1][arg2] = class129.field2266;
                return true;
            } else {
                class93.field1467[arg0][arg1][arg2] = -class129.field2266;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
    public static void method1035(int arg0) {
        field2724 = null;
        field2741 = null;
        field2735 = null;
        field2733 = null;
        if (arg0 != 4) {
            method1032(null, (byte) -110, false);
        }
        field2728 = null;
        field2734 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)V")
    public abstract void method1036(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZI)V")
    public static final void method1037(int arg0, boolean arg1, int arg2) {
        field2725++;
        class47 var3 = class77.field1158[class196.field3401][arg2][arg0];
        if (var3 == null) {
            class2.method12(class196.field3401, arg2, arg0);
            return;
        }
        class159 var4 = null;
        int var5 = -99999999;
        for (class159 var6 = (class159) var3.method315(-31594); var6 != null; var6 = (class159) var3.method312(1012)) {
            class242 var13 = class151.method1005(520, var6.field2751.field2844);
            int var14 = var13.field4137;
            if (var13.field4178 == 1) {
                var14 = (var6.field2751.field2851 + 1) * var14;
            }
            if (var14 > var5) {
                var5 = var14;
                var4 = var6;
            }
        }
        if (var4 == null) {
            class2.method12(class196.field3401, arg2, arg0);
            return;
        }
        var3.method310(-15062, var4);
        class167 var7 = null;
        class159 var8 = (class159) var3.method315(-31594);
        class167 var9 = null;
        while (var8 != null) {
            class167 var12 = var8.field2751;
            if (var4.field2751.field2844 != var12.field2844) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field2844 != var12.field2844 && var9 == null) {
                    var9 = var12;
                }
            }
            var8 = (class159) var3.method312(1012);
        }
        long var10 = (long) ((arg0 << 7) + arg2 + 1610612736);
        class87.method573(class196.field3401, arg2, arg0, class236.method1535(arg2 * 128 + 64, class196.field3401, arg0 * 128 + 64, 0), var4.field2751, var10, var7, var9);
        if (!arg1) {
            field2733 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
    public abstract void method1038(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
    public static final void method1039(int arg0) {
        field2740++;
        try {
            if (class193.field3366 == 0) {
                if (class169.field2953 != null) {
                    class169.field2953.method1653(86);
                    class169.field2953 = null;
                }
                class120.field1974 = false;
                class193.field3366 = 1;
                class13.field118 = null;
                class252.field4370 = 0;
            }
            if (class193.field3366 == 1) {
                if (class13.field118 == null) {
                    class13.field118 = class205.field3559.method1558(true, class85.field1294, class240.field4111);
                }
                if (class13.field118.field57 == 2) {
                    throw new IOException();
                }
                if (class13.field118.field57 == 1) {
                    class169.field2953 = new class251((Socket) class13.field118.field59, class205.field3559);
                    class193.field3366 = 2;
                    class13.field118 = null;
                }
            }
            if (class193.field3366 == 2) {
                long var1 = class204.field3556 = class222.field3810.method1084(32383);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class87.field1348.field1821 = 0;
                class87.field1348.method768(14, 7295);
                class87.field1348.method768(var3, 7295);
                class169.field2953.method1650(12398, 0, class87.field1348.field1780, 2);
                class193.field3366 = 3;
                class112.field1815.field1821 = 0;
            }
            if (class193.field3366 == 3) {
                if (class179.field3156 != null) {
                    class179.field3156.method1148(255);
                }
                if (class45.field587 != null) {
                    class45.field587.method1148(255);
                }
                int var4 = class169.field2953.method1657(5000);
                if (class179.field3156 != null) {
                    class179.field3156.method1148(255);
                }
                if (class45.field587 != null) {
                    class45.field587.method1148(255);
                }
                if (var4 != 0) {
                    class202.method1289(var4, (byte) -88);
                    return;
                }
                class193.field3366 = 4;
                class112.field1815.field1821 = 0;
            }
            if (class193.field3366 == 4) {
                if (class112.field1815.field1821 < 8) {
                    int var5 = class169.field2953.method1648(-116);
                    if (8 - class112.field1815.field1821 < var5) {
                        var5 = 8 - class112.field1815.field1821;
                    }
                    if (var5 > 0) {
                        class169.field2953.method1652(-1, var5, class112.field1815.field1780, class112.field1815.field1821);
                        class112.field1815.field1821 += var5;
                    }
                }
                if (class112.field1815.field1821 == 8) {
                    class112.field1815.field1821 = 0;
                    class111.field1771 = class112.field1815.method759(125);
                    class193.field3366 = 5;
                }
            }
            if (arg0 < -61) {
                if (class193.field3366 == 5) {
                    int[] var6 = new int[4];
                    var6[2] = (int) (class111.field1771 >> 32);
                    class87.field1348.field1821 = 0;
                    var6[3] = (int) class111.field1771;
                    var6[0] = (int) (Math.random() * 9.9999999E7D);
                    var6[1] = (int) (Math.random() * 9.9999999E7D);
                    class87.field1348.method768(10, 7295);
                    class87.field1348.method770(var6[0], (byte) -10);
                    class87.field1348.method770(var6[1], (byte) -10);
                    class87.field1348.method770(var6[2], (byte) -10);
                    class87.field1348.method770(var6[3], (byte) -10);
                    class87.field1348.method739(class222.field3810.method1084(32383), -23147);
                    class87.field1348.method721(class222.field3805, true);
                    class87.field1348.method749(2, class23.field267, class61.field834);
                    class111.field1768.field1821 = 0;
                    if (class254.field4403 == 40) {
                        class111.field1768.method768(18, 7295);
                    } else {
                        class111.field1768.method768(16, 7295);
                    }
                    class111.field1768.method753(class87.field1348.field1821 + class19.method102(class172.field2989, (byte) 1) + 149, -242005080);
                    class111.field1768.method770(501, (byte) -10);
                    class111.field1768.method768(0, 7295);
                    class111.field1768.method753(class223.field3837, -242005080);
                    class111.field1768.method753(class42.field551, -242005080);
                    class135.method910((byte) 117, class111.field1768);
                    class111.field1768.method721(class172.field2989, true);
                    class111.field1768.method770(class153.field2661, (byte) -10);
                    class111.field1768.method770(method1033((byte) -12), (byte) -10);
                    class142.field2502 = true;
                    class111.field1768.method770(class82.field1248.field4445, (byte) -10);
                    class111.field1768.method770(class137.field2417.field4445, (byte) -10);
                    class111.field1768.method770(class191.field3325.field4445, (byte) -10);
                    class111.field1768.method770(class208.field3616.field4445, (byte) -10);
                    class111.field1768.method770(class127.field2111.field4445, (byte) -10);
                    class111.field1768.method770(class229.field3884.field4445, (byte) -10);
                    class111.field1768.method770(class159.field2749.field4445, (byte) -10);
                    class111.field1768.method770(class166.field2827.field4445, (byte) -10);
                    class111.field1768.method770(class152.field2645.field4445, (byte) -10);
                    class111.field1768.method770(class91.field1426.field4445, (byte) -10);
                    class111.field1768.method770(class200.field3452.field4445, (byte) -10);
                    class111.field1768.method770(class91.field1418.field4445, (byte) -10);
                    class111.field1768.method770(class142.field2500.field4445, (byte) -10);
                    class111.field1768.method770(class96.field1517.field4445, (byte) -10);
                    class111.field1768.method770(class21.field258.field4445, (byte) -10);
                    class111.field1768.method770(class31.field375.field4445, (byte) -10);
                    class111.field1768.method770(class135.field2356.field4445, (byte) -10);
                    class111.field1768.method770(class223.field3821.field4445, (byte) -10);
                    class111.field1768.method770(class167.field2855.field4445, (byte) -10);
                    class111.field1768.method770(class169.field2954.field4445, (byte) -10);
                    class111.field1768.method770(class214.field3709.field4445, (byte) -10);
                    class111.field1768.method770(class7.field83.field4445, (byte) -10);
                    class111.field1768.method770(class64.field907.field4445, (byte) -10);
                    class111.field1768.method770(class74.field1127.field4445, (byte) -10);
                    class111.field1768.method770(class34.field417.field4445, (byte) -10);
                    class111.field1768.method770(class97.field1533.field4445, (byte) -10);
                    class111.field1768.method770(class233.field3958.field4445, (byte) -10);
                    class111.field1768.method725(0, class87.field1348.field1821, class87.field1348.field1780, 1926268184);
                    class169.field2953.method1650(12398, 0, class111.field1768.field1780, class111.field1768.field1821);
                    class87.field1348.method665(-70, var6);
                    for (int var7 = 0; var7 < 4; var7++) {
                        var6[var7] += 50;
                    }
                    class112.field1815.method665(-67, var6);
                    class193.field3366 = 6;
                }
                if (class193.field3366 == 6 && class169.field2953.method1648(-102) > 0) {
                    int var8 = class169.field2953.method1657(5000);
                    if (var8 == 21 && class254.field4403 == 20) {
                        class193.field3366 = 7;
                    } else if (var8 == 2) {
                        class193.field3366 = 9;
                    } else if (var8 == 15 && class254.field4403 == 40) {
                        class118.method809((byte) -127);
                        return;
                    } else if (var8 == 23 && class118.field1924 < 1) {
                        class193.field3366 = 0;
                        class118.field1924++;
                    } else {
                        class202.method1289(var8, (byte) -88);
                        return;
                    }
                }
                if (class193.field3366 == 7 && class169.field2953.method1648(-103) > 0) {
                    class84.field1284 = (class169.field2953.method1657(5000) + 3) * 60;
                    class26.field320 = 21;
                    class193.field3366 = 8;
                }
                if (class193.field3366 == 8) {
                    class252.field4370 = 0;
                    if (--class84.field1284 <= 0) {
                        class193.field3366 = 0;
                    }
                } else {
                    if (class193.field3366 == 9 && class169.field2953.method1648(-106) >= 9) {
                        class29.field356 = class169.field2953.method1657(5000);
                        class135.field2367 = class169.field2953.method1657(5000);
                        class17.field155 = class169.field2953.method1657(5000);
                        if (class17.field155 == 1) {
                            try {
                                class83.field1251.method1069(19569, class205.field3559.field4088);
                            } catch (Throwable var9) {
                            }
                        } else {
                            try {
                                class214.field3698.method1069(19569, class205.field3559.field4088);
                            } catch (Throwable var10) {
                            }
                        }
                        class95.field1501 = class169.field2953.method1657(5000);
                        class152.field2644 = class169.field2953.method1657(5000) == 1;
                        class81.field1233 = class169.field2953.method1657(5000);
                        class81.field1233 <<= 0x8;
                        class81.field1233 += class169.field2953.method1657(5000);
                        class101.field1610 = class169.field2953.method1657(5000);
                        class169.field2953.method1652(-1, 1, class112.field1815.field1780, 0);
                        class112.field1815.field1821 = 0;
                        class108.field1740 = class112.field1815.method669((byte) -95);
                        class169.field2953.method1652(-1, 2, class112.field1815.field1780, 0);
                        class112.field1815.field1821 = 0;
                        class31.field377 = class112.field1815.method731(false);
                        class193.field3366 = 10;
                    }
                    if (class193.field3366 != 10) {
                        class252.field4370++;
                        if (class252.field4370 > 2000) {
                            if (class118.field1924 < 1) {
                                if (class240.field4111 == class121.field2009) {
                                    class240.field4111 = class88.field1376;
                                } else {
                                    class240.field4111 = class121.field2009;
                                }
                                class118.field1924++;
                                class193.field3366 = 0;
                            } else {
                                class202.method1289(-3, (byte) -88);
                            }
                        }
                    } else if (class169.field2953.method1648(-124) >= class31.field377) {
                        class112.field1815.field1821 = 0;
                        class169.field2953.method1652(-1, class31.field377, class112.field1815.field1780, 0);
                        class33.method213((byte) -118);
                        class159.field2743 = -1;
                        class80.method530(false, 17703);
                        class108.field1740 = -1;
                    }
                }
            }
        } catch (IOException var11) {
            if (class118.field1924 < 1) {
                class118.field1924++;
                class193.field3366 = 0;
                if (class240.field4111 == class121.field2009) {
                    class240.field4111 = class88.field1376;
                } else {
                    class240.field4111 = class121.field2009;
                }
            } else {
                class202.method1289(-2, (byte) -88);
            }
        }
    }
}
