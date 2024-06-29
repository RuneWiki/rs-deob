import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class46 implements Runnable {

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    private int field1009 = 0;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    private int field1003 = 0;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Z")
    private boolean field989 = false;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "Z")
    private boolean field1013 = false;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "La;")
    private class1 field1014;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field1007;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field990;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1015;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lqe;")
    private static class179 field999 = class206.method1380("Too many connections from your address)3", (byte) -126);

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lqe;")
    public static class179 field992 = field999;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public static int field1010 = 99;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "Lqe;")
    public static class179 field1016 = null;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Lqe;")
    public static class179 field1011 = class206.method1380("W-=hlen Sie eine Welt", (byte) 53);

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lqe;")
    public static class179 field1001 = class206.method1380(" weitere Optionen", (byte) -127);

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lcd;")
    private class26 field998;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[B")
    private byte[] field993;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static final void method302(byte arg0) {
        if (class149.field2681 > 1) {
            class149.field2681--;
            class225.field4172 = class32.field693;
        }
        field997++;
        if (class129.field2356 > 0) {
            class129.field2356--;
        }
        if (class4.field57) {
            class4.field57 = false;
            class84.method571((byte) -92);
            return;
        }
        for (int var1 = 0; var1 < 100 && class40.method271(56); var1++) {
        }
        if (class80.field1545 != 30) {
            return;
        }
        class146.method940(226, class81.field1564, false);
        Object var2 = class199.field3702.field1750;
        synchronized (class199.field3702.field1750) {
            if (!class221.field4080) {
                class199.field3702.field1763 = 0;
            } else if (class70.field1405 != 0 || class199.field3702.field1763 >= 40) {
                class114.field2130++;
                class81.field1564.method70((byte) -62, 26);
                class81.field1564.method1230((byte) -66, 0);
                int var3 = class81.field1564.field3432;
                int var4 = 0;
                for (int var5 = 0; class199.field3702.field1763 > var5 && class81.field1564.field3432 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class199.field3702.field1761[var5];
                    int var7 = class199.field3702.field1765[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = var7 * 765 + var6;
                    if (class199.field3702.field1765[var5] == -1 && class199.field3702.field1761[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (class59.field1272 != var6 || class198.field3696 != var7) {
                        int var9 = var6 - class59.field1272;
                        int var10 = var7 - class198.field3696;
                        class198.field3696 = var7;
                        class59.field1272 = var6;
                        if (class232.field4281 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class81.field1564.method1222((byte) -109, (var9 << 6) + (class232.field4281 << 12) + var10);
                            class232.field4281 = 0;
                        } else if (class232.field4281 < 8) {
                            class81.field1564.method1214(1200707720, (class232.field4281 << 19) + var8 + 8388608);
                            class232.field4281 = 0;
                        } else {
                            class81.field1564.method1229((byte) -111, var8 + (class232.field4281 << 19) - 1073741824);
                            class232.field4281 = 0;
                        }
                    } else if (class232.field4281 < 2047) {
                        class232.field4281++;
                    }
                }
                class81.field1564.method1238(Integer.MAX_VALUE, class81.field1564.field3432 - var3);
                if (var4 < class199.field3702.field1763) {
                    class199.field3702.field1763 -= var4;
                    for (int var11 = 0; var11 < class199.field3702.field1763; var11++) {
                        class199.field3702.field1761[var11] = class199.field3702.field1761[var11 + var4];
                        class199.field3702.field1765[var11] = class199.field3702.field1765[var4 + var11];
                    }
                } else {
                    class199.field3702.field1763 = 0;
                }
            }
        }
        if (class70.field1405 != 0) {
            class151.field2723++;
            long var12 = (class56.field1230 - class226.field4187) / 50L;
            class226.field4187 = class56.field1230;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            int var14 = class68.field1361;
            int var15 = class175.field3141;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 764) {
                var14 = 764;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var16 = var15 * 765 + var14;
            int var17 = (int) var12;
            byte var18 = 0;
            if (class70.field1405 == 2) {
                var18 = 1;
            }
            class81.field1564.method70((byte) -62, 72);
            class81.field1564.method1229((byte) -85, (var17 << 20) + (var18 << 19) + var16);
        }
        if (class84.field1618[96] || class84.field1618[97] || class84.field1618[98] || class84.field1618[99]) {
            class12.field317 = true;
        }
        if (class70.field1398 > 0) {
            class70.field1398--;
        }
        if (class12.field317 && class70.field1398 <= 0) {
            class226.field4183++;
            class70.field1398 = 20;
            class12.field317 = false;
            class81.field1564.method70((byte) -62, 255);
            class81.field1564.method1208(arg0 - 28384, class175.field3145);
            class81.field1564.method1222((byte) -107, class236.field4342);
        }
        if (class97.field1825 && !class191.field3570) {
            class191.field3570 = true;
            class81.field1564.method70((byte) -62, 11);
            class62.field1309++;
            class81.field1564.method1230((byte) -96, 1);
        }
        if (!class97.field1825 && class191.field3570) {
            class62.field1309++;
            class191.field3570 = false;
            class81.field1564.method70((byte) -62, 11);
            class81.field1564.method1230((byte) -63, 0);
        }
        class113.method727(112);
        if (class80.field1545 != 30) {
            return;
        }
        class17.method130((byte) 62);
        class92.method605((byte) -69);
        class17.field460++;
        if (class17.field460 > 750) {
            class84.method571((byte) 103);
            return;
        }
        class107.method698(67);
        class151.method964(-92);
        method310((byte) 103);
        if (class48.field1036 != null) {
            class10.method68(true);
        }
        class66.field1342++;
        if (class42.field909 != 0) {
            class52.field1095 += 20;
            if (class52.field1095 >= 400) {
                class42.field909 = 0;
            }
        }
        if (class208.field3895 != null) {
            class108.field2017++;
            if (class108.field2017 >= 15) {
                class139.method880(class208.field3895, 121);
                class208.field3895 = null;
            }
        }
        if (class143.field2599 != null) {
            class139.method880(class143.field2599, arg0 + 137);
            class196.field3645++;
            if (class167.field3005 + 5 < class4.field61 || class167.field3005 - 5 > class4.field61 || class139.field2559 > class217.field4023 + 5 || class139.field2559 < class217.field4023 - 5) {
                class81.field1576 = true;
            }
            if (class40.field868 == 0) {
                if (class81.field1576 && class196.field3645 >= 5) {
                    if (class143.field2599 == class100.field1868 && class78.field1521 != class163.field2950) {
                        class89.field1684++;
                        byte var19 = 0;
                        class6 var20 = class143.field2599;
                        if (class155.field2794 == 1 && var20.field220 == 206) {
                            var19 = 1;
                        }
                        if (var20.field111[class78.field1521] <= 0) {
                            var19 = 0;
                        }
                        if (class194.method1300(0, class159.method1026(var20, -1493540320))) {
                            int var23 = class163.field2950;
                            int var24 = class78.field1521;
                            var20.field111[var24] = var20.field111[var23];
                            var20.field68[var24] = var20.field68[var23];
                            var20.field111[var23] = -1;
                            var20.field68[var23] = 0;
                        } else if (var19 == 1) {
                            int var21 = class163.field2950;
                            int var22 = class78.field1521;
                            while (var21 != var22) {
                                if (var21 > var22) {
                                    var20.method40(var21, var21 - 1, 80);
                                    var21--;
                                } else if (var21 < var22) {
                                    var20.method40(var21, var21 + 1, 99);
                                    var21++;
                                }
                            }
                        } else {
                            var20.method40(class163.field2950, class78.field1521, arg0 ^ 0x72);
                        }
                        class81.field1564.method70((byte) -62, 150);
                        class81.field1564.method1216((byte) 112, class143.field2599.field173);
                        class81.field1564.method1222((byte) -84, class78.field1521);
                        class81.field1564.method1230((byte) -57, var19);
                        class81.field1564.method1208(-28417, class163.field2950);
                    }
                } else if ((class205.field3839 == 1 || class202.method1346(class113.field2118 - 1, arg0 ^ 0xFFFFFFB7)) && class113.field2118 > 2) {
                    class191.method1285((byte) 79);
                } else if (class113.field2118 > 0) {
                    class8.method54(class113.field2118 - 1, 180);
                }
                class108.field2017 = 10;
                class143.field2599 = null;
                class70.field1405 = 0;
            }
        }
        class55.field1219 = 0;
        class23.field560 = null;
        class54.field1187 = false;
        class84.field1628 = false;
        class6 var25 = class155.field2790;
        class6 var26 = class132.field2397;
        class132.field2397 = null;
        class155.field2790 = null;
        while (class218.method1425((byte) -117) && class55.field1219 < 128) {
            class34.field775[class55.field1219] = class106.field1984;
            class174.field3126[class55.field1219] = class60.field1291;
            class55.field1219++;
        }
        class48.field1036 = null;
        if (class159.field2899 != -1) {
            class64.method418(0, class102.field1962, 0, class159.field2899, 0, class216.field4001, true, 0);
        }
        class32.field693++;
        while (true) {
            class19 var27;
            class6 var28;
            class6 var29;
            do {
                var27 = (class19) class174.field3119.method230(arg0 - 90);
                if (var27 == null) {
                    while (true) {
                        class19 var30;
                        class6 var31;
                        class6 var32;
                        do {
                            var30 = (class19) class54.field1183.method230(arg0 - 84);
                            if (var30 == null) {
                                while (true) {
                                    class19 var33;
                                    class6 var34;
                                    class6 var35;
                                    do {
                                        var33 = (class19) class193.field3590.method230(arg0 - 86);
                                        if (var33 == null) {
                                            if (class168.field3035 && class48.field1036 == null) {
                                                class168.field3035 = false;
                                            }
                                            if (class86.field1647 != null) {
                                                class190.method1277((byte) -51);
                                            }
                                            if (class151.field2729 != -1) {
                                                int var36 = class227.field4206;
                                                int var37 = class151.field2729;
                                                boolean var38 = class190.method1278(0, var37, 0, var36, 41, true, 0, class61.field1298.field3160[0], 0, 0, class61.field1298.field3200[0], 0);
                                                if (var38) {
                                                    class42.field909 = 1;
                                                    class98.field1838 = class68.field1361;
                                                    class52.field1095 = 0;
                                                    class36.field799 = class175.field3141;
                                                }
                                                class151.field2729 = -1;
                                            }
                                            class38.method249(arg0 + 17525);
                                            if (class155.field2790 != var25) {
                                                if (var25 != null) {
                                                    class139.method880(var25, 126);
                                                }
                                                if (class155.field2790 != null) {
                                                    class139.method880(class155.field2790, 110);
                                                }
                                            }
                                            if (class132.field2397 != var26 && class44.field953 == class23.field569) {
                                                if (var26 != null) {
                                                    class139.method880(var26, 119);
                                                }
                                                if (class132.field2397 != null) {
                                                    class139.method880(class132.field2397, 109);
                                                }
                                            }
                                            if (class132.field2397 == null) {
                                                if (class23.field569 > 0) {
                                                    class23.field569--;
                                                }
                                            } else if (class44.field953 > class23.field569) {
                                                class23.field569++;
                                                if (class44.field953 == class23.field569) {
                                                    class139.method880(class132.field2397, 108);
                                                }
                                            }
                                            class176.method1112(arg0 ^ 0xFFFFFFC4);
                                            if (class112.field2108) {
                                                class222.method1441(false);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class71.field1424[var39]++;
                                            }
                                            int var40 = class148.method947(-124);
                                            int var41 = class188.method1271(127);
                                            if (arg0 != -33) {
                                                return;
                                            }
                                            if (var40 > 4500 && var41 > 4500) {
                                                class129.field2356 = 250;
                                                class151.method965(4000, arg0 ^ 0xFFFFDB1F);
                                                class134.field2478++;
                                                class81.field1564.method70((byte) -62, 154);
                                            }
                                            class88.field1681++;
                                            class61.field1299++;
                                            if (class61.field1299 > 500) {
                                                class61.field1299 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x1) == 1) {
                                                    class144.field2633 += class159.field2890;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class195.field3627 += class211.field3940;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class18.field485 += class240.field4415;
                                                }
                                            }
                                            class44.field968++;
                                            if (class195.field3627 < -40) {
                                                class211.field3940 = 1;
                                            }
                                            if (class44.field968 > 500) {
                                                class44.field968 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class143.field2608 += class208.field3879;
                                                }
                                                if ((var43 & 0x2) == 2) {
                                                    class68.field1364 += class164.field2964;
                                                }
                                            }
                                            if (class195.field3627 > 40) {
                                                class211.field3940 = -1;
                                            }
                                            if (class68.field1364 < -20) {
                                                class164.field2964 = 1;
                                            }
                                            if (class68.field1364 > 10) {
                                                class164.field2964 = -1;
                                            }
                                            if (class143.field2608 < -60) {
                                                class208.field3879 = 2;
                                            }
                                            if (class144.field2633 < -50) {
                                                class159.field2890 = 2;
                                            }
                                            if (class18.field485 < -55) {
                                                class240.field4415 = 2;
                                            }
                                            if (class144.field2633 > 50) {
                                                class159.field2890 = -2;
                                            }
                                            if (class143.field2608 > 60) {
                                                class208.field3879 = -2;
                                            }
                                            if (class18.field485 > 55) {
                                                class240.field4415 = -2;
                                            }
                                            if (class88.field1681 > 50) {
                                                class162.field2927++;
                                                class81.field1564.method70((byte) -62, 155);
                                            }
                                            try {
                                                if (class199.field3714 != null && class81.field1564.field3432 > 0) {
                                                    class199.field3714.method307(-58, 0, class81.field1564.field3397, class81.field1564.field3432);
                                                    class88.field1681 = 0;
                                                    class81.field1564.field3432 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class84.method571((byte) -64);
                                                return;
                                            }
                                        }
                                        var34 = var33.field499;
                                        if (var34.field130 < 0) {
                                            break;
                                        }
                                        var35 = class87.method580(var34.field131, arg0 ^ 0xFFFFFFE2);
                                    } while (var35 == null || var35.field206 == null || var34.field130 >= var35.field206.length || var35.field206[var34.field130] != var34);
                                    class102.method681(200000, var33);
                                }
                            }
                            var31 = var30.field499;
                            if (var31.field130 < 0) {
                                break;
                            }
                            var32 = class87.method580(var31.field131, 114);
                        } while (var32 == null || var32.field206 == null || var31.field130 >= var32.field206.length || var32.field206[var31.field130] != var31);
                        class102.method681(200000, var30);
                    }
                }
                var28 = var27.field499;
                if (var28.field130 < 0) {
                    break;
                }
                var29 = class87.method580(var28.field131, arg0 + 76);
            } while (var29 == null || var29.field206 == null || var29.field206.length <= var28.field130 || var29.field206[var28.field130] != var28);
            class102.method681(arg0 + 200033, var27);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public final void method303(int arg0) {
        field995++;
        if (this.field989) {
            return;
        }
        synchronized (this) {
            this.field989 = true;
            if (arg0 != 1) {
                this.method303(-103);
            }
            this.notifyAll();
        }
        if (this.field998 != null) {
            while (this.field998.field595 == 0) {
                class137.method873(1L, -967787128);
            }
            if (this.field998.field595 == 1) {
                try {
                    ((Thread) this.field998.field591).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field998 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lae;III)V")
    public static final void method304(class6 arg0, int arg1, int arg2, int arg3) {
        field1012++;
        if (class86.field1647 != null || class182.field3358 || (arg0 == null || class205.method1375(27875, arg0) == null)) {
            return;
        }
        class86.field1647 = arg0;
        class123.field2280 = class205.method1375(27875, arg0);
        class233.field4304 = 0;
        class227.field4207 = false;
        if (arg3 != -1446) {
            field992 = null;
        }
        class233.field4307 = arg1;
        class150.field2701 = arg2;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
    public final int method305(byte arg0) throws IOException {
        if (arg0 <= 67) {
            method302((byte) -52);
        }
        field1008++;
        return this.field989 ? 0 : this.field990.available();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lqe;")
    public static final class179 method306(int arg0, int arg1) {
        field987++;
        if (arg0 != 24994) {
            field1011 = null;
        }
        return class78.method502((byte) -85, new class179[] { class148.method949((byte) -14, arg1 >> 24 & 0xFF), class69.field1385, class148.method949((byte) -14, arg1 >> 16 & 0xFF), class69.field1385, class148.method949((byte) -14, arg1 >> 8 & 0xFF), class69.field1385, class148.method949((byte) -14, arg1 & 0xFF) });
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[BI)V")
    public final void method307(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1004++;
        if (this.field989) {
            return;
        }
        if (this.field1013) {
            this.field1013 = false;
            throw new IOException();
        }
        if (this.field993 == null) {
            this.field993 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field993[this.field1009] = arg2[arg1 + var6];
                this.field1009 = (this.field1009 + 1) % 5000;
                if ((this.field1003 + 4900) % 5000 == this.field1009) {
                    throw new IOException();
                }
            }
            if (this.field998 == null) {
                this.field998 = this.field1014.method8(0, this, 3);
            }
            this.notifyAll();
            if (arg0 > -30) {
                method310((byte) -46);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
    public static void method308(byte arg0) {
        field1001 = null;
        if (arg0 != -106) {
            field1011 = null;
        }
        field992 = null;
        field1011 = null;
        field1016 = null;
        field999 = null;
    }

    @OriginalMember(owner = "client!eb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field994++;
        this.method303(1);
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
    public final int method309(byte arg0) throws IOException {
        int var2 = 67 % ((-arg0 - 86) / 39);
        field988++;
        return this.field989 ? 0 : this.field990.read();
    }

    @OriginalMember(owner = "client!eb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1009 == this.field1003) {
                            if (this.field989) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1003 <= this.field1009) {
                            var2 = this.field1009 - this.field1003;
                        } else {
                            var2 = 5000 - this.field1003;
                        }
                        var3 = this.field1003;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1015.write(this.field993, var3, var2);
                    } catch (IOException var9) {
                        this.field1013 = true;
                    }
                    this.field1003 = (this.field1003 + var2) % 5000;
                    try {
                        if (this.field1009 == this.field1003) {
                            this.field1015.flush();
                        }
                    } catch (IOException var8) {
                        this.field1013 = true;
                    }
                    continue;
                }
                try {
                    if (this.field990 != null) {
                        this.field990.close();
                    }
                    if (this.field1015 != null) {
                        this.field1015.close();
                    }
                    if (this.field1007 != null) {
                        this.field1007.close();
                    }
                } catch (IOException var7) {
                }
                this.field993 = null;
                break;
            }
        } catch (Exception var12) {
            class214.method1406(null, true, var12);
        }
        field1005++;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V")
    private static final void method310(byte arg0) {
        field1017++;
        for (int var1 = -1; var1 < class22.field548; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class10.field279[var1];
            }
            class115 var7 = class23.field554[var6];
            if (var7 != null && var7.field3137 > 0) {
                var7.field3137--;
                if (var7.field3137 == 0) {
                    var7.field3187 = null;
                }
            }
        }
        int var2 = -108 % ((-arg0 - 8) / 62);
        for (int var3 = 0; var3 < class186.field3456; var3++) {
            int var4 = class233.field4297[var3];
            class188 var5 = class53.field1152[var4];
            if (var5 != null && var5.field3137 > 0) {
                var5.field3137--;
                if (var5.field3137 == 0) {
                    var5.field3187 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[BII)V")
    public final void method311(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1002++;
        if (this.field989) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field990.read(arg1, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg2 += var5;
        }
        if (arg0 > -40) {
            method304(null, 26, -40, -73);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILqe;)V")
    public static final void method312(int arg0, class179 arg1) {
        field991++;
        if (class155.field2786 == null) {
            return;
        }
        int var2 = 0;
        if (arg0 < 119) {
            method302((byte) -5);
        }
        long var3 = arg1.method1137(113);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class155.field2786.length && class155.field2786[var2].field1694 != var3) {
            var2++;
        }
        if (class155.field2786.length > var2 && class155.field2786[var2] != null) {
            class230.field4247++;
            class81.field1564.method70((byte) -62, 45);
            class81.field1564.method1232(class155.field2786[var2].field1694, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJ)V")
    public static final void method313(byte arg0, long arg1) {
        field1000++;
        if (arg1 == 0L) {
            return;
        }
        if (class202.field3741 >= 100 && class132.field2394 != 1 || class202.field3741 >= 200) {
            class189.method1276(0, (byte) 1, class123.field2283, class207.field3868);
            return;
        }
        class179 var3 = class12.method82(4, arg1).method1140((byte) 32);
        for (int var4 = 0; var4 < class202.field3741; var4++) {
            if (class160.field2908[var4] == arg1) {
                class189.method1276(0, (byte) 1, class78.method502((byte) -97, new class179[] { var3, class232.field4275 }), class207.field3868);
                return;
            }
        }
        for (int var5 = 0; var5 < class98.field1840; var5++) {
            if (class237.field4358[var5] == arg1) {
                class189.method1276(0, (byte) 1, class78.method502((byte) -120, new class179[] { class173.field3093, var3, class183.field3382 }), class207.field3868);
                return;
            }
        }
        if (var3.method1142(class61.field1298.field2168, (byte) -114)) {
            class189.method1276(0, (byte) 1, class180.field3348, class207.field3868);
            return;
        }
        class152.field2743[class202.field3741] = var3;
        class160.field2908[class202.field3741] = arg1;
        int var6 = 125 % ((arg0 - 32) / 33);
        class10.field288[class202.field3741] = 0;
        class56.field1236++;
        class237.field4372[class202.field3741] = class207.field3868;
        class139.field2569[class202.field3741] = 0;
        class43.field936 = class32.field693;
        class202.field3741++;
        class81.field1564.method70((byte) -62, 40);
        class81.field1564.method1232(arg1, (byte) 124);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljava/net/Socket;La;)V")
    public class46(Socket arg0, class1 arg1) throws IOException {
        this.field1014 = arg1;
        this.field1007 = arg0;
        this.field1007.setSoTimeout(30000);
        this.field1007.setTcpNoDelay(true);
        this.field990 = this.field1007.getInputStream();
        this.field1015 = this.field1007.getOutputStream();
    }
}
