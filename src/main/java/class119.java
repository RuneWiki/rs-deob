import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class119 {

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
    public static int[] field2161 = new int[50];

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field2163 = 0;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "Lqm;")
    public static class222 field2164;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Lpb;")
    public class71 field2158;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
    public int[] field2160;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "[Z")
    public static boolean[] field2162;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 19)
    public static void method843(byte arg0) {
        field2161 = null;
        field2162 = null;
        field2164 = null;
        if (arg0 <= 10) {
            field2161 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIJ)Z", line = 32)
    public static final boolean method844(int arg0, int arg1, int arg2, long arg3) {
        class295 var5 = class304.field5203[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field5092 != null && var5.field5092.field2848 == arg3) {
            return true;
        } else if (var5.field5079 != null && var5.field5079.field3141 == arg3) {
            return true;
        } else if (var5.field5095 != null && var5.field5095.field593 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field5075; var6++) {
                if (var5.field5090[var6].field3324 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 76)
    public static final void method845(int arg0) {
        field2157++;
        if (class131.field2333 == 0 || class131.field2333 == 5) {
            return;
        }
        try {
            if (++class55.field926 > 2000) {
                if (class216.field3626 != null) {
                    class216.field3626.method225(1);
                    class216.field3626 = null;
                }
                if (class17.field355 >= 1) {
                    class125.field2260 = -5;
                    class131.field2333 = 0;
                    return;
                }
                class55.field926 = 0;
                class17.field355++;
                class131.field2333 = 1;
                if (class60.field1174 == class230.field3909) {
                    class230.field3909 = class180.field3089;
                } else {
                    class230.field3909 = class60.field1174;
                }
            }
            if (class131.field2333 == 1) {
                class283.field4873 = class228.field3876.method1948(class230.field3909, class247.field4296, (byte) -16);
                class131.field2333 = 2;
            }
            if (class131.field2333 == 2) {
                if (class283.field4873.field375 == 2) {
                    throw new IOException();
                }
                if (class283.field4873.field375 != 1) {
                    return;
                }
                class216.field3626 = new class24((Socket) class283.field4873.field377, class228.field3876);
                class283.field4873 = null;
                long var1 = class15.field323 = class188.field3232.method509(31492);
                class17.field353.field281 = 0;
                class17.field353.method130(-1, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class17.field353.method130(-1, var3);
                class216.field3626.method227(class17.field353.field254, 0, 3, 2);
                if (class94.field1747 != null) {
                    class94.field1747.method1055(2000);
                }
                if (class315.field5334 != null) {
                    class315.field5334.method1055(2000);
                }
                int var4 = class216.field3626.method223((byte) 122);
                if (class94.field1747 != null) {
                    class94.field1747.method1055(2000);
                }
                if (class315.field5334 != null) {
                    class315.field5334.method1055(2000);
                }
                if (var4 != 0) {
                    class125.field2260 = var4;
                    class131.field2333 = 0;
                    class216.field3626.method225(1);
                    class216.field3626 = null;
                    return;
                }
                class131.field2333 = 3;
            }
            if (class131.field2333 == 3) {
                if (class216.field3626.method219(0) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class216.field3626.method221(class108.field1991.field254, 0, 10, 8);
                class108.field1991.field281 = 0;
                class15.field322 = class108.field1991.method146((byte) 123);
                class17.field353.field281 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class15.field322;
                var5[2] = (int) (class15.field322 >> 32);
                class17.field353.method130(-1, 10);
                class17.field353.method128((byte) -14, var5[0]);
                class17.field353.method128((byte) -79, var5[1]);
                class17.field353.method128((byte) -49, var5[2]);
                class17.field353.method128((byte) 121, var5[3]);
                class17.field353.method161((byte) -114, class188.field3232.method509(31492));
                class17.field353.method116(false, class188.field3221);
                class17.field353.method144(class60.field1151, (byte) -127, class234.field3947);
                class260.field4477.field281 = 0;
                if (class128.field2277 == 40) {
                    class260.field4477.method130(-1, 18);
                } else {
                    class260.field4477.method130(-1, 16);
                }
                class260.field4477.method145(101, 154 - (-class17.field353.field281 - class122.method861(class145.field2560, -27)));
                class260.field4477.method128((byte) -17, 514);
                class260.field4477.method130(-1, class101.field1824);
                class260.field4477.method130(-1, class267.field4604 ? 1 : 0);
                class260.field4477.method130(-1, 1);
                class260.field4477.method130(-1, class97.method731(29983));
                class260.field4477.method145(119, class13.field290);
                class260.field4477.method145(106, class58.field960);
                class287.method1984(class260.field4477, (byte) -76);
                class260.field4477.method116(false, class145.field2560);
                class260.field4477.method128((byte) 123, class188.field3241);
                class260.field4477.method128((byte) 126, class241.method1751((byte) -83));
                class259.field4465 = true;
                class260.field4477.method145(83, class265.field4562);
                class260.field4477.method128((byte) 119, class213.field3578.method1587(-2));
                class260.field4477.method128((byte) -15, class138.field2449.method1587(-2));
                class260.field4477.method128((byte) 126, class65.field1299.method1587(-2));
                class260.field4477.method128((byte) 119, class140.field2474.method1587(-2));
                class260.field4477.method128((byte) 109, class299.field5161.method1587(-2));
                class260.field4477.method128((byte) -13, class253.field4413.method1587(-2));
                class260.field4477.method128((byte) -13, class297.field5114.method1587(-2));
                class260.field4477.method128((byte) -79, class19.field359.method1587(-2));
                class260.field4477.method128((byte) -86, class3.field17.method1587(-2));
                class260.field4477.method128((byte) 114, class222.field3775.method1587(-2));
                class260.field4477.method128((byte) 123, class241.field4155.method1587(-2));
                class260.field4477.method128((byte) -59, class226.field3843.method1587(-2));
                class260.field4477.method128((byte) -43, class253.field4399.method1587(-2));
                class260.field4477.method128((byte) 121, class143.field2504.method1587(-2));
                class260.field4477.method128((byte) 109, class141.field2483.method1587(-2));
                class260.field4477.method128((byte) 117, field2164.method1587(-2));
                class260.field4477.method128((byte) 125, class278.field4810.method1587(-2));
                class260.field4477.method128((byte) -67, class41.field665.method1587(-2));
                class260.field4477.method128((byte) 119, class69.field1332.method1587(-2));
                class260.field4477.method128((byte) -108, class193.field3287.method1587(-2));
                class260.field4477.method128((byte) -110, class64.field1233.method1587(-2));
                class260.field4477.method128((byte) 125, class110.field2038.method1587(-2));
                class260.field4477.method128((byte) 126, class94.field1753.method1587(-2));
                class260.field4477.method128((byte) -47, class114.field2096.method1587(-2));
                class260.field4477.method128((byte) -54, class82.field1518.method1587(-2));
                class260.field4477.method128((byte) 113, class88.field1594.method1587(-2));
                class260.field4477.method128((byte) 114, class299.field5154.method1587(-2));
                class260.field4477.method157(class17.field353.field281, true, class17.field353.field254, 0);
                class216.field3626.method227(class260.field4477.field254, 0, 3, class260.field4477.field281);
                class17.field353.method1218(var5, -126);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class108.field1991.method1218(var5, 74);
                class131.field2333 = 4;
            }
            if (class131.field2333 == 4) {
                if (class216.field3626.method219(0) < 1) {
                    return;
                }
                int var7 = class216.field3626.method223((byte) 112);
                if (var7 == 21) {
                    class131.field2333 = 7;
                } else if (var7 == 29) {
                    class131.field2333 = 10;
                } else if (var7 == 1) {
                    class131.field2333 = 5;
                    class125.field2260 = var7;
                    return;
                } else if (var7 == 2) {
                    class131.field2333 = 8;
                } else if (var7 == 15) {
                    class131.field2333 = 0;
                    class125.field2260 = var7;
                    return;
                } else if (var7 == 23 && class17.field355 < 1) {
                    class55.field926 = 0;
                    class17.field355++;
                    class131.field2333 = 1;
                    class216.field3626.method225(1);
                    class216.field3626 = null;
                    return;
                } else {
                    class125.field2260 = var7;
                    class131.field2333 = 0;
                    class216.field3626.method225(1);
                    class216.field3626 = null;
                    return;
                }
            }
            if (arg0 < 59) {
                field2164 = (class222) null;
            }
            if (class131.field2333 == 6) {
                class17.field353.field281 = 0;
                class17.field353.method1214(-79, 17);
                class216.field3626.method227(class17.field353.field254, 0, 3, class17.field353.field281);
                class131.field2333 = 4;
                return;
            }
            if (class131.field2333 == 7) {
                if (class216.field3626.method219(0) < 1) {
                    return;
                }
                class80.field1491 = class216.field3626.method223((byte) 120) * 60 + 180;
                class125.field2260 = 21;
                class131.field2333 = 0;
                class216.field3626.method225(1);
                class216.field3626 = null;
                return;
            }
            if (class131.field2333 == 10) {
                if (class216.field3626.method219(0) < 1) {
                    return;
                }
                class229.field3883 = class216.field3626.method223((byte) 121);
                class125.field2260 = 29;
                class131.field2333 = 0;
                class216.field3626.method225(1);
                class216.field3626 = null;
                return;
            }
            if (class131.field2333 == 8) {
                if (class216.field3626.method219(0) < 12) {
                    return;
                }
                class216.field3626.method221(class108.field1991.field254, 0, 31, 12);
                class108.field1991.field281 = 0;
                class301.field5174 = class108.field1991.method152((byte) -120);
                class103.field1871 = class108.field1991.method152((byte) -95);
                class41.field642 = class108.field1991.method152((byte) -91);
                if (!class267.field4604) {
                    if (class41.field642 == 1) {
                        try {
                            class160.field2825.method530(0, class228.field3876.field4845);
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            class201.field3446.method530(0, class228.field3876.field4845);
                        } catch (Throwable var11) {
                        }
                    }
                }
                class130.field2308 = class108.field1991.method152((byte) -90);
                class211.field3541 = class108.field1991.method152((byte) -106) == 1;
                class149.field2632 = class108.field1991.method112((byte) 92);
                class141.field2491 = class108.field1991.method152((byte) -93) == 1;
                class269.field4641 = class108.field1991.method152((byte) -78) == 1;
                class194.method1365(true, class269.field4641);
                class233.method1669(class269.field4641, (byte) -120);
                class274.field4709 = class108.field1991.method1219((byte) 126);
                class26.field428 = class108.field1991.method112((byte) 92);
                class131.field2333 = 9;
            }
            if (class131.field2333 == 9) {
                if (class216.field3626.method219(0) < class26.field428) {
                    return;
                }
                class108.field1991.field281 = 0;
                class216.field3626.method221(class108.field1991.field254, 0, -128, class26.field428);
                class125.field2260 = 2;
                class131.field2333 = 0;
                class168.method1193(0);
                class295.field5066 = -1;
                class2.method4(false, -4121);
                class274.field4709 = -1;
                return;
            }
        } catch (IOException var13) {
            if (class216.field3626 != null) {
                class216.field3626.method225(1);
                class216.field3626 = null;
            }
            if (class17.field355 >= 1) {
                class131.field2333 = 0;
                class125.field2260 = -4;
            } else {
                class131.field2333 = 1;
                class17.field355++;
                class55.field926 = 0;
                if (class60.field1174 == class230.field3909) {
                    class230.field3909 = class180.field3089;
                } else {
                    class230.field3909 = class60.field1174;
                }
            }
        }
    }
}
