import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class152 {

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2698 = 0;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lpj;")
    public static class237 field2700 = class33.method353("<col=ff9040>", 120);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "[Lpj;")
    public static class237[] field2694 = new class237[200];

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2701 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[Lgk;")
    public static class154[] field2696;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static final void method1035(byte arg0) {
        int var1 = -66 / ((arg0 - 4) / 43);
        field2695++;
        class114.field2007.method942(0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1036(int arg0) {
        field2700 = null;
        field2696 = null;
        field2694 = null;
        if (arg0 != 0) {
            method1037(5);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static final void method1037(int arg0) {
        if (arg0 > -51) {
            method1036(120);
        }
        field2697++;
        if (class12.field211 == 0 || class12.field211 == 5) {
            return;
        }
        try {
            if ((++class159.field2862) > 2000) {
                if (class127.field2219 != null) {
                    class127.field2219.method1431((byte) 49);
                    class127.field2219 = null;
                }
                if (class247.field4307 >= 1) {
                    class259.field4450 = -5;
                    class12.field211 = 0;
                    return;
                }
                if (class96.field1714 == class258.field4433) {
                    class96.field1714 = class56.field1162;
                } else {
                    class96.field1714 = class258.field4433;
                }
                class12.field211 = 1;
                class159.field2862 = 0;
                class247.field4307++;
            }
            if (class12.field211 == 1) {
                class52.field1100 = class268.field4572.method543(class174.field3042, class96.field1714, (byte) -115);
                class12.field211 = 2;
            }
            if (class12.field211 == 2) {
                if (class52.field1100.field1823 == 2) {
                    throw new IOException();
                }
                if (class52.field1100.field1823 != 1) {
                    return;
                }
                class127.field2219 = new class214((Socket) class52.field1100.field1826, class268.field4572);
                class52.field1100 = null;
                long var1 = class62.field1254 = class239.field4201.method1616(0);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class223.field3830.field647 = 0;
                class223.field3830.method293((byte) 125, 14);
                class223.field3830.method293((byte) 125, var3);
                class127.field2219.method1434(0, -26363, 2, class223.field3830.field644);
                if (class79.field1485 != null) {
                    class79.field1485.method1079(112);
                }
                if (class131.field2312 != null) {
                    class131.field2312.method1079(116);
                }
                int var4 = class127.field2219.method1437((byte) 85);
                if (class79.field1485 != null) {
                    class79.field1485.method1079(-92);
                }
                if (class131.field2312 != null) {
                    class131.field2312.method1079(-11);
                }
                if (var4 != 0) {
                    class259.field4450 = var4;
                    class12.field211 = 0;
                    class127.field2219.method1431((byte) 49);
                    class127.field2219 = null;
                    return;
                }
                class12.field211 = 3;
            }
            if (class12.field211 == 3) {
                if (class127.field2219.method1438(12) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class127.field2219.method1435(0, 18461, 8, class65.field1288.field644);
                class65.field1288.field647 = 0;
                class252.field4345 = class65.field1288.method298((byte) 112);
                var5[3] = (int) class252.field4345;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class252.field4345 >> 32);
                class223.field3830.field647 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class223.field3830.method293((byte) 125, 10);
                class223.field3830.method290((byte) -20, var5[0]);
                class223.field3830.method290((byte) -20, var5[1]);
                class223.field3830.method290((byte) -20, var5[2]);
                class223.field3830.method290((byte) -20, var5[3]);
                class223.field3830.method292(-71, class239.field4201.method1616(0));
                class223.field3830.method334(-128, class239.field4187);
                class223.field3830.method327(-10248, class177.field3116, class104.field1829);
                class244.field4279.field647 = 0;
                if (class264.field4507 == 40) {
                    class244.field4279.method293((byte) 125, 18);
                } else {
                    class244.field4279.method293((byte) 125, 16);
                }
                class244.field4279.method350((byte) 19, class223.field3830.field647 + (class252.method1708(82, class117.field2050) + 154));
                class244.field4279.method290((byte) -20, 515);
                class244.field4279.method293((byte) 125, class22.field403);
                class244.field4279.method293((byte) 125, class170.field2979 ? 1 : 0);
                class244.field4279.method293((byte) 125, 0);
                class244.field4279.method293((byte) 125, class37.method381(0));
                class244.field4279.method350((byte) 19, class142.field2585);
                class244.field4279.method350((byte) 19, class119.field2087);
                class218.method1457(class244.field4279, (byte) 101);
                class244.field4279.method334(-128, class117.field2050);
                class244.field4279.method290((byte) -20, class106.field1873);
                class244.field4279.method290((byte) -20, class262.method1758(-76));
                class117.field2047 = true;
                class244.field4279.method350((byte) 19, class8.field160);
                class244.field4279.method290((byte) -20, class105.field1854.method1653(0));
                class244.field4279.method290((byte) -20, class143.field2587.method1653(0));
                class244.field4279.method290((byte) -20, class177.field3123.method1653(0));
                class244.field4279.method290((byte) -20, class255.field4371.method1653(0));
                class244.field4279.method290((byte) -20, class108.field1928.method1653(0));
                class244.field4279.method290((byte) -20, class241.field4241.method1653(0));
                class244.field4279.method290((byte) -20, class151.field2685.method1653(0));
                class244.field4279.method290((byte) -20, class8.field118.method1653(0));
                class244.field4279.method290((byte) -20, class76.field1440.method1653(0));
                class244.field4279.method290((byte) -20, class21.field398.method1653(0));
                class244.field4279.method290((byte) -20, class223.field3825.method1653(0));
                class244.field4279.method290((byte) -20, class44.field969.method1653(0));
                class244.field4279.method290((byte) -20, class76.field1441.method1653(0));
                class244.field4279.method290((byte) -20, class104.field1842.method1653(0));
                class244.field4279.method290((byte) -20, class273.field4739.method1653(0));
                class244.field4279.method290((byte) -20, class97.field1750.method1653(0));
                class244.field4279.method290((byte) -20, class33.field721.method1653(0));
                class244.field4279.method290((byte) -20, class48.field1038.method1653(0));
                class244.field4279.method290((byte) -20, class210.field3575.method1653(0));
                class244.field4279.method290((byte) -20, class34.field746.method1653(0));
                class244.field4279.method290((byte) -20, class6.field63.method1653(0));
                class244.field4279.method290((byte) -20, class78.field1464.method1653(0));
                class244.field4279.method290((byte) -20, class160.field2882.method1653(0));
                class244.field4279.method290((byte) -20, class270.field4618.method1653(0));
                class244.field4279.method290((byte) -20, class58.field1193.method1653(0));
                class244.field4279.method290((byte) -20, class8.field139.method1653(0));
                class244.field4279.method290((byte) -20, class271.field4631.method1653(0));
                class244.field4279.method320(0, class223.field3830.field644, class223.field3830.field647, 16);
                class127.field2219.method1434(0, -26363, class244.field4279.field647, class244.field4279.field644);
                class223.field3830.method363(8, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class65.field1288.method363(8, var5);
                class12.field211 = 4;
            }
            if (class12.field211 == 4) {
                if (class127.field2219.method1438(12) < 1) {
                    return;
                }
                int var7 = class127.field2219.method1437((byte) 85);
                if (var7 == 21) {
                    class12.field211 = 7;
                } else if (var7 == 29) {
                    class12.field211 = 10;
                } else if (var7 == 1) {
                    class259.field4450 = var7;
                    class12.field211 = 5;
                    return;
                } else if (var7 == 2) {
                    class12.field211 = 8;
                } else if (var7 == 15) {
                    class12.field211 = 0;
                    class259.field4450 = var7;
                    return;
                } else if (var7 == 23 && class247.field4307 < 1) {
                    class247.field4307++;
                    class12.field211 = 1;
                    class159.field2862 = 0;
                    class127.field2219.method1431((byte) 49);
                    class127.field2219 = null;
                    return;
                } else {
                    class259.field4450 = var7;
                    class12.field211 = 0;
                    class127.field2219.method1431((byte) 49);
                    class127.field2219 = null;
                    return;
                }
            }
            if (class12.field211 == 6) {
                class223.field3830.field647 = 0;
                class223.field3830.method368(80, 17);
                class127.field2219.method1434(0, -26363, class223.field3830.field647, class223.field3830.field644);
                class12.field211 = 4;
            } else if (class12.field211 == 7) {
                if (class127.field2219.method1438(12) >= 1) {
                    class45.field977 = class127.field2219.method1437((byte) 85) * 60 + 180;
                    class259.field4450 = 21;
                    class12.field211 = 0;
                    class127.field2219.method1431((byte) 49);
                    class127.field2219 = null;
                }
            } else if (class12.field211 != 10) {
                if (class12.field211 == 8) {
                    if (class127.field2219.method1438(12) < 12) {
                        return;
                    }
                    class127.field2219.method1435(0, 18461, 12, class65.field1288.field644);
                    class65.field1288.field647 = 0;
                    class64.field1283 = class65.field1288.method316((byte) 107);
                    class172.field3015 = class65.field1288.method316((byte) 9);
                    class239.field4184 = class65.field1288.method316((byte) 123);
                    if (!class170.field2979) {
                        if (class239.field4184 == 1) {
                            try {
                                class193.field3344.method1622(class268.field4572.field1306, false);
                            } catch (Throwable var9) {
                            }
                        } else {
                            try {
                                class196.field3410.method1622(class268.field4572.field1306, false);
                            } catch (Throwable var8) {
                            }
                        }
                    }
                    class53.field1113 = class65.field1288.method316((byte) -113);
                    class126.field2198 = class65.field1288.method316((byte) -33) == 1;
                    class272.field4679 = class65.field1288.method339(-16777216);
                    class260.field4457 = class65.field1288.method316((byte) 0) == 1;
                    class29.field587 = class65.field1288.method316((byte) 116) == 1;
                    class170.method1180(class29.field587, (byte) -64);
                    class94.method699(class29.field587, -36);
                    class209.field3571 = class65.field1288.method361(24705);
                    class120.field2130 = class65.field1288.method339(-16777216);
                    class12.field211 = 9;
                }
                if (class12.field211 == 9 && class127.field2219.method1438(12) >= class120.field2130) {
                    class65.field1288.field647 = 0;
                    class127.field2219.method1435(0, 18461, class120.field2130, class65.field1288.field644);
                    class259.field4450 = 2;
                    class12.field211 = 0;
                    class273.method1827(0);
                    class263.field4495 = -1;
                    class54.method481(26654, false);
                    class209.field3571 = -1;
                }
            } else if (class127.field2219.method1438(12) >= 1) {
                class56.field1165 = class127.field2219.method1437((byte) 85);
                class12.field211 = 0;
                class259.field4450 = 29;
                class127.field2219.method1431((byte) 49);
                class127.field2219 = null;
            }
        } catch (IOException var10) {
            if (class127.field2219 != null) {
                class127.field2219.method1431((byte) 49);
                class127.field2219 = null;
            }
            if (class247.field4307 < 1) {
                class12.field211 = 1;
                if (class96.field1714 == class258.field4433) {
                    class96.field1714 = class56.field1162;
                } else {
                    class96.field1714 = class258.field4433;
                }
                class159.field2862 = 0;
                class247.field4307++;
            } else {
                class259.field4450 = -4;
                class12.field211 = 0;
            }
        }
    }
}
