import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class283 extends class90 {

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field4508 = 0;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "J")
    public static long field4512 = 0L;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "Lqd;")
    public static class37 field4513 = new class37(30);

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "[I")
    public static int[] field4511;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "[Lja;")
    public static class55[] field4514;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V")
    public static final void method1902(boolean arg0, int arg1) {
        field4505++;
        if (arg0) {
            if (class193.field2774 != -1) {
                class71.method486(class193.field2774, (byte) 56);
            }
            for (class261 var2 = (class261) class128.field1874.method1219(1); var2 != null; var2 = (class261) class128.field1874.method1223(116)) {
                class69.method466((byte) -94, var2, true);
            }
            class193.field2774 = -1;
            class128.field1874 = new class190(8);
            class245.method1601(25598);
            class193.field2774 = class259.field3925;
            class38.method266(0, false);
            class153.method1037(26566);
            class89.method601(class193.field2774, true);
        }
        class275.field4416 = -1;
        class258.method1731((byte) 105, class82.field1263);
        class55.field847 = new class53();
        if (arg1 < 45) {
            field4508 = -8;
        }
        class55.field847.field94 = 3000;
        class55.field847.field45 = 3000;
        class184.method1186(class45.field634, true);
        class245.method1608((byte) 84, 10);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Z")
    public abstract boolean method694(byte arg0);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lha;I)Z")
    public static final boolean method1903(class267 arg0, int arg1) {
        if (arg1 <= 45) {
            method1907(65, 29, -28);
        }
        field4507++;
        if (arg0.field4095 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field4095.length; var2++) {
            int var3 = class227.method1483(true, var2, arg0);
            int var4 = arg0.field4036[var2];
            if (arg0.field4095[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field4095[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field4095[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(II)V")
    public static final void method1904(int arg0, int arg1) {
        field4504++;
        if (arg1 < -71) {
            class270 var2 = class190.method1213(25702, arg0, 7);
            var2.method1806(-8173);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static final void method1905(byte arg0) {
        field4515++;
        int var1 = 6 / ((arg0 - 60) / 52);
        class138.field1999.method257(false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(JZ)V")
    public static final void method1906(long arg0, boolean arg1) {
        field4506++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1) {
            method1902(true, 94);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)Lrc;")
    public static final class288 method1907(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class288 var4 = var3.field1923;
            var3.field1923 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method693(byte arg0);

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
    public static void method1908(int arg0) {
        if (arg0 == 0) {
            field4514 = null;
            field4513 = null;
            field4511 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
    public static final void method1909(byte arg0) {
        field4509++;
        if (class194.field2782 == 0 || class194.field2782 == 5) {
            return;
        }
        try {
            if ((++class259.field3924) > 2000) {
                if (class10.field180 != null) {
                    class10.field180.method362(false);
                    class10.field180 = null;
                }
                if (class59.field905 >= 1) {
                    class194.field2782 = 0;
                    class118.field1741 = -5;
                    return;
                }
                class194.field2782 = 1;
                class259.field3924 = 0;
                class59.field905++;
                if (class39.field581 == class224.field3349) {
                    class224.field3349 = class132.field1939;
                } else {
                    class224.field3349 = class39.field581;
                }
            }
            if (class194.field2782 == 1) {
                class182.field2600 = class163.field2378.method550(class60.field910, 32606, class224.field3349);
                class194.field2782 = 2;
            }
            if (class194.field2782 == 2) {
                if (class182.field2600.field3588 == 2) {
                    throw new IOException();
                }
                if (class182.field2600.field3588 != 1) {
                    return;
                }
                class10.field180 = new class54((Socket) class182.field2600.field3585, class163.field2378);
                class182.field2600 = null;
                long var1 = class68.field1054 = class109.method712((byte) -126, class280.field4469);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class95.field1451.field1673 = 0;
                class95.field1451.method775(14, -114);
                class95.field1451.method775(var3, -116);
                class10.field180.method356((byte) 13, class95.field1451.field1629, 0, 2);
                if (class217.field3198 != null) {
                    class217.field3198.method1455(false);
                }
                if (class240.field3599 != null) {
                    class240.field3599.method1455(false);
                }
                int var4 = class10.field180.method358(24);
                if (class217.field3198 != null) {
                    class217.field3198.method1455(false);
                }
                if (class240.field3599 != null) {
                    class240.field3599.method1455(false);
                }
                if (var4 != 0) {
                    class194.field2782 = 0;
                    class118.field1741 = var4;
                    class10.field180.method362(false);
                    class10.field180 = null;
                    return;
                }
                class194.field2782 = 3;
            }
            if (class194.field2782 == 3) {
                if (class10.field180.method357((byte) 32) < 8) {
                    return;
                }
                class10.field180.method363(class68.field1071.field1629, -5942, 8, 0);
                int[] var5 = new int[4];
                class68.field1071.field1673 = 0;
                class136.field1972 = class68.field1071.method769(-1682);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class136.field1972 >> 32);
                class95.field1451.field1673 = 0;
                var5[3] = (int) class136.field1972;
                class95.field1451.method775(10, arg0 - 37);
                class95.field1451.method737(-2645, var5[0]);
                class95.field1451.method737(arg0 - 2567, var5[1]);
                class95.field1451.method737(-2645, var5[2]);
                class95.field1451.method737(-2645, var5[3]);
                class95.field1451.method765(arg0 + 532401390, class109.method712((byte) 13, class280.field4469));
                class95.field1451.method734((byte) 92, class173.field2479);
                class95.field1451.method744(class75.field1167, 20819, class101.field1502);
                class189.field2680.field1673 = 0;
                if (class192.field2754 == 40) {
                    class189.field2680.method775(18, -117);
                } else {
                    class189.field2680.method775(16, -113);
                }
                class189.field2680.method794(class95.field1451.field1673 + class136.method918((byte) 123, class39.field585) + 159, (byte) -84);
                class189.field2680.method737(-2645, 534);
                class189.field2680.method775(class194.field2781, arg0 - 47);
                class189.field2680.method775(class182.field2604 ? 1 : 0, -121);
                class189.field2680.method775(0, arg0 ^ 0x3B);
                class189.field2680.method775(class24.method178(-16648), -126);
                class189.field2680.method794(class214.field3080, (byte) -95);
                class189.field2680.method794(class250.field3813, (byte) -122);
                class189.field2680.method775(class243.field3661, -119);
                class184.method1185(class189.field2680, (byte) -85);
                class189.field2680.method734((byte) -128, class39.field585);
                class189.field2680.method737(-2645, class76.field1177);
                class189.field2680.method737(arg0 - 2567, class54.method360(arg0 ^ 0x72F02522));
                class15.field229 = true;
                class189.field2680.method794(class30.field426, (byte) -95);
                class189.field2680.method737(-2645, class118.field1727.method1518(100));
                class189.field2680.method737(-2645, class246.field3675.method1518(arg0 + 178));
                class189.field2680.method737(arg0 - 2567, class155.field2275.method1518(100));
                class189.field2680.method737(-2645, class181.field2597.method1518(100));
                class189.field2680.method737(-2645, class67.field1040.method1518(100));
                class189.field2680.method737(arg0 ^ 0xA19, class136.field1971.method1518(100));
                class189.field2680.method737(-2645, class53.field777.method1518(arg0 ^ -42));
                class189.field2680.method737(-2645, class26.field378.method1518(100));
                class189.field2680.method737(-2645, class45.field634.method1518(100));
                class189.field2680.method737(-2645, class65.field1024.method1518(100));
                class189.field2680.method737(-2645, class37.field557.method1518(100));
                class189.field2680.method737(-2645, class211.field3030.method1518(100));
                class189.field2680.method737(-2645, class236.field3557.method1518(100));
                class189.field2680.method737(-2645, class10.field179.method1518(arg0 ^ -42));
                class189.field2680.method737(-2645, class190.field2705.method1518(100));
                class189.field2680.method737(-2645, class243.field3659.method1518(100));
                class189.field2680.method737(-2645, class175.field2496.method1518(100));
                class189.field2680.method737(-2645, class225.field3388.method1518(100));
                class189.field2680.method737(-2645, class257.field3908.method1518(100));
                class189.field2680.method737(arg0 ^ 0xA19, class94.field1434.method1518(100));
                class189.field2680.method737(-2645, class149.field2150.method1518(100));
                class189.field2680.method737(-2645, class128.field1884.method1518(100));
                class189.field2680.method737(arg0 - 2567, class210.field3027.method1518(100));
                class189.field2680.method737(arg0 ^ 0xA19, class132.field1936.method1518(100));
                class189.field2680.method737(arg0 - 2567, class234.field3533.method1518(100));
                class189.field2680.method737(arg0 ^ 0xA19, class242.field3648.method1518(100));
                class189.field2680.method737(-2645, class123.field1787.method1518(100));
                class189.field2680.method737(arg0 - 2567, class138.field2003.method1518(arg0 + 178));
                class189.field2680.method774((byte) -128, class95.field1451.field1673, 0, class95.field1451.field1629);
                class10.field180.method356((byte) 13, class189.field2680.field1629, 0, class189.field2680.field1673);
                class95.field1451.method528(var5, (byte) -38);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class68.field1071.method528(var5, (byte) -109);
                class194.field2782 = 4;
            }
            if (class194.field2782 == 4) {
                if (class10.field180.method357((byte) -120) < 1) {
                    return;
                }
                int var7 = class10.field180.method358(arg0 + 104);
                if (var7 == 21) {
                    class194.field2782 = 7;
                } else if (var7 == 29) {
                    class194.field2782 = 10;
                } else if (var7 == 1) {
                    class118.field1741 = var7;
                    class194.field2782 = 5;
                    return;
                } else if (var7 == 2) {
                    class194.field2782 = 8;
                } else if (var7 == 15) {
                    class118.field1741 = var7;
                    class194.field2782 = 0;
                    return;
                } else if (var7 == 23 && class59.field905 < 1) {
                    class259.field3924 = 0;
                    class59.field905++;
                    class194.field2782 = 1;
                    class10.field180.method362(false);
                    class10.field180 = null;
                    return;
                } else {
                    class118.field1741 = var7;
                    class194.field2782 = 0;
                    class10.field180.method362(false);
                    class10.field180 = null;
                    return;
                }
            }
            if (class194.field2782 == 6) {
                class95.field1451.field1673 = 0;
                class95.field1451.method522(17, 28727);
                class10.field180.method356((byte) 13, class95.field1451.field1629, 0, class95.field1451.field1673);
                class194.field2782 = 4;
            } else if (class194.field2782 == 7) {
                if (class10.field180.method357((byte) 113) >= 1) {
                    class62.field994 = class10.field180.method358(arg0 + 136) * 60 + 180;
                    class118.field1741 = 21;
                    class194.field2782 = 0;
                    class10.field180.method362(false);
                    class10.field180 = null;
                }
            } else if (class194.field2782 != 10) {
                if (class194.field2782 == 8) {
                    if (class10.field180.method357((byte) -117) < 14) {
                        return;
                    }
                    class10.field180.method363(class68.field1071.field1629, -5942, 14, 0);
                    class68.field1071.field1673 = 0;
                    class270.field4228 = class68.field1071.method760(false);
                    class31.field463 = class68.field1071.method760(false);
                    class108.field1560 = class68.field1071.method760(false) == 1;
                    class24.field320 = class68.field1071.method760(false) == 1;
                    class45.field640 = class68.field1071.method760(false) == 1;
                    class136.field1965 = class68.field1071.method760(false) == 1;
                    class103.field1533 = class68.field1071.method760(false) == 1;
                    class73.field1133 = class68.field1071.method756(arg0 ^ 0x7481);
                    class279.field4462 = class68.field1071.method760(false) == 1;
                    class77.field1186 = class68.field1071.method760(false) == 1;
                    class217.method1395(class77.field1186, (byte) -77);
                    class71.method485(-14492, class77.field1186);
                    if (!class182.field2604) {
                        if ((!class108.field1560 || class45.field640) && !class279.field4462) {
                            try {
                                class6.method74("unzap", 26638, class163.field2378.field1273);
                            } catch (Throwable var8) {
                            }
                        } else {
                            try {
                                class6.method74("zap", 26638, class163.field2378.field1273);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    class195.field2807 = class68.field1071.method526(false);
                    class7.field140 = class68.field1071.method756(-29901);
                    class194.field2782 = 9;
                }
                if (arg0 != -78) {
                    method1903((class267) null, -114);
                }
                if (class194.field2782 == 9 && class10.field180.method357((byte) -125) >= class7.field140) {
                    class68.field1071.field1673 = 0;
                    class10.field180.method363(class68.field1071.field1629, -5942, class7.field140, 0);
                    class194.field2782 = 0;
                    class118.field1741 = 2;
                    class147.method985(true);
                    class156.field2280 = -1;
                    class149.method998(false, false);
                    class195.field2807 = -1;
                }
            } else if (class10.field180.method357((byte) 96) >= 1) {
                class90.field1366 = class10.field180.method358(arg0 + 184);
                class194.field2782 = 0;
                class118.field1741 = 29;
                class10.field180.method362(false);
                class10.field180 = null;
            }
        } catch (IOException var10) {
            if (class10.field180 != null) {
                class10.field180.method362(false);
                class10.field180 = null;
            }
            if (class59.field905 < 1) {
                class59.field905++;
                if (class39.field581 == class224.field3349) {
                    class224.field3349 = class132.field1939;
                } else {
                    class224.field3349 = class39.field581;
                }
                class259.field3924 = 0;
                class194.field2782 = 1;
            } else {
                class194.field2782 = 0;
                class118.field1741 = -4;
            }
        }
    }
}
