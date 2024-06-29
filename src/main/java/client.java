import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class199 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field776 = 0;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lkh;")
    public static class117 field777 = class224.method1450((byte) -37, "Fps:");

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lkh;")
    public static class117 field780 = class224.method1450((byte) 105, "");

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lkh;")
    public static class117 field791 = class224.method1450((byte) 123, " loggt sich aus)3");

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lai;")
    public static class10 field784;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lnb;")
    public static class144 field785;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field793;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    private final void method288(boolean arg0) {
        field783++;
        if (class176.field3179 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class4.method31((byte) 47);
            if (class61.field1219 == 0L) {
                class61.field1219 = var4;
            }
            if (var3 > 16384 && var4 - class61.field1219 < 5000L) {
                if (var4 - class96.field1751 > 1000L) {
                    System.gc();
                    class96.field1751 = var4;
                }
                class13.field410 = class151.field2752;
                class115.field2140 = 5;
            } else {
                class13.field410 = class230.field4132;
                class115.field2140 = 5;
                class176.field3179 = 10;
            }
        } else if (class176.field3179 == 10) {
            class103.method694(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class173.field3123[var6] = new class3(104, 104);
            }
            class176.field3179 = 30;
            class115.field2140 = 10;
            class13.field410 = class1.field8;
        } else if (class176.field3179 == 30) {
            class79.field1489 = class12.method121(0, true, (byte) 120, true, false);
            class218.field3965 = class12.method121(1, true, (byte) 121, true, false);
            class93.field1706 = class12.method121(2, true, (byte) 124, false, true);
            class69.field1313 = class12.method121(3, true, (byte) 125, true, false);
            class216.field3935 = class12.method121(4, true, (byte) 123, true, false);
            class78.field1486 = class12.method121(5, true, (byte) 126, true, true);
            class117.field2187 = class12.method121(6, false, (byte) 118, true, true);
            class78.field1483 = class12.method121(7, true, (byte) 125, true, false);
            class172.field3108 = class12.method121(8, true, (byte) 116, true, false);
            class61.field1222 = class12.method121(9, true, (byte) 122, true, false);
            class6.field101 = class12.method121(10, true, (byte) 123, true, false);
            class5.field80 = class12.method121(11, true, (byte) 116, true, false);
            class23.field580 = class12.method121(12, true, (byte) 127, true, false);
            class140.field2552 = class12.method121(13, true, (byte) 126, true, false);
            class23.field589 = class12.method121(14, false, (byte) 118, true, false);
            class78.field1479 = class12.method121(15, true, (byte) 126, true, false);
            class215.field3900 = class12.method121(16, true, (byte) 118, true, false);
            class71.field1376 = class12.method121(17, true, (byte) 118, true, false);
            class171.field3092 = class12.method121(18, true, (byte) 125, true, false);
            class112.field2104 = class12.method121(19, true, (byte) 121, true, false);
            class103.field1877 = class12.method121(20, true, (byte) 123, true, false);
            class28.field694 = class12.method121(21, true, (byte) 122, true, false);
            class73.field1395 = class12.method121(22, true, (byte) 119, true, false);
            class222.field4012 = class12.method121(23, true, (byte) 124, true, true);
            class179.field3251 = class12.method121(24, true, (byte) 118, true, false);
            class175.field3158 = class12.method121(25, true, (byte) 117, true, false);
            class32.field750 = class12.method121(26, true, (byte) 118, true, true);
            class115.field2140 = 15;
            class176.field3179 = 40;
            class13.field410 = class136.field2469;
        } else if (class176.field3179 == 40) {
            byte var7 = 0;
            int var8 = var7 + class79.field1489.method1502((byte) 111) * 4 / 100;
            int var9 = var8 + class218.field3965.method1502((byte) -20) * 4 / 100;
            int var10 = var9 + class93.field1706.method1502((byte) 83) / 100;
            int var11 = var10 + class69.field1313.method1502((byte) 104) * 2 / 100;
            int var12 = var11 + class216.field3935.method1502((byte) 125) * 6 / 100;
            int var13 = var12 + class78.field1486.method1502((byte) 89) * 4 / 100;
            int var14 = var13 + class117.field2187.method1502((byte) -24) * 2 / 100;
            int var15 = var14 + class78.field1483.method1502((byte) 107) * 50 / 100;
            int var16 = var15 + class172.field3108.method1502((byte) -23) * 2 / 100;
            int var17 = var16 + class61.field1222.method1502((byte) 83) * 2 / 100;
            int var18 = var17 + class6.field101.method1502((byte) -60) * 2 / 100;
            int var19 = var18 + class5.field80.method1502((byte) -100) * 2 / 100;
            int var20 = var19 + class23.field580.method1502((byte) -56) * 2 / 100;
            int var21 = var20 + class140.field2552.method1502((byte) -34) * 2 / 100;
            int var22 = var21 + class23.field589.method1502((byte) 110) * 2 / 100;
            int var23 = var22 + class78.field1479.method1502((byte) -38) * 2 / 100;
            int var24 = var23 + class215.field3900.method1502((byte) -100) / 100;
            int var25 = var24 + class71.field1376.method1502((byte) -78) / 100;
            int var26 = var25 + class171.field3092.method1502((byte) 107) / 100;
            int var27 = var26 + class112.field2104.method1502((byte) -28) / 100;
            int var28 = var27 + class103.field1877.method1502((byte) -93) / 100;
            int var29 = var28 + class28.field694.method1502((byte) -27) / 100;
            int var30 = var29 + class73.field1395.method1502((byte) -82) / 100;
            int var31 = var30 + class222.field4012.method1502((byte) 123) / 100;
            int var32 = var31 + class179.field3251.method1502((byte) 122) / 100;
            int var33 = var32 + class175.field3158.method1502((byte) 117) / 100;
            int var34 = var33 + class32.field750.method1502((byte) -59) / 100;
            if (var34 == 100) {
                class13.field410 = class209.field3740;
                class115.field2140 = 20;
                class100.method677(class117.field2187, class6.field101, class172.field3108, 126);
                class176.field3179 = 45;
            } else {
                if (var34 != 0) {
                    class13.field410 = class36.method316((byte) -34, new class117[] { class75.field1432, class42.method358(var34, (byte) 34), class40.field913 });
                }
                class115.field2140 = 20;
            }
        } else if (class176.field3179 == 45) {
            class217.method1422(2, -1579, !class167.field3021, 22050);
            class243 var35 = new class243();
            var35.method1557((byte) -112, 128, 9);
            class84.field1569 = class180.method1249(-100, 0, 22050, class130.field2397, class85.field1608);
            class84.field1569.method212(true, var35);
            class7.method54(class78.field1479, class23.field589, (byte) -38, class216.field3935, var35);
            class229.field4128 = class180.method1249(-123, 1, 2048, class130.field2397, class85.field1608);
            class187.field3351 = new class241();
            class229.field4128.method212(!arg0, class187.field3351);
            class157.field2859 = new class108(22050, class214.field3883);
            class115.field2140 = 30;
            class13.field410 = class145.field2657;
            class176.field3179 = 50;
        } else {
            if (arg0) {
                method289(true, null);
            }
            if (class176.field3179 == 50) {
                int var36 = 0;
                if (class172.field3108.method83(false, class172.field3105)) {
                    var36++;
                }
                if (class172.field3108.method83(arg0, class203.field3670)) {
                    var36++;
                }
                if (class172.field3108.method83(false, class136.field2455)) {
                    var36++;
                }
                if (class140.field2552.method83(arg0, class172.field3105)) {
                    var36++;
                }
                if (class140.field2552.method83(false, class203.field3670)) {
                    var36++;
                }
                if (class140.field2552.method83(false, class136.field2455)) {
                    var36++;
                }
                if (var36 < 6) {
                    class13.field410 = class36.method316((byte) -34, new class117[] { class33.field766, class42.method358(var36 * 100 / 6, (byte) 34), class40.field913 });
                    class115.field2140 = 35;
                } else {
                    class115.field2140 = 35;
                    class176.field3179 = 60;
                    class13.field410 = class217.field3950;
                }
            } else if (class176.field3179 == 60) {
                int var37 = class72.method510(class6.field101, 29, class172.field3108);
                int var38 = class26.method231((byte) -109);
                if (var37 < var38) {
                    class13.field410 = class36.method316((byte) -34, new class117[] { class169.field3045, class42.method358(var37 * 100 / var38, (byte) 34), class40.field913 });
                    class115.field2140 = 40;
                } else {
                    class13.field410 = class105.field1916;
                    class115.field2140 = 40;
                    class176.field3179 = 65;
                }
            } else if (class176.field3179 == 65) {
                class94.field1718 = class128.method878((byte) 90, class169.field3042, class140.field2552, class172.field3105, class172.field3108);
                class237.field4283 = (class235) class94.field1718;
                class53.field1081 = class128.method878((byte) 90, class169.field3042, class140.field2552, class203.field3670, class172.field3108);
                class199.field3603 = class128.method878((byte) 90, class169.field3042, class140.field2552, class136.field2455, class172.field3108);
                class13.field410 = class84.field1585;
                class115.field2140 = 45;
                class94.method647(5, (byte) 41);
                class176.field3179 = 70;
            } else if (class176.field3179 == 70) {
                class93.field1706.method105(0);
                byte var39 = 0;
                int var40 = var39 + class93.field1706.method96(73);
                class215.field3900.method105(0);
                int var41 = var40 + class215.field3900.method96(74);
                class71.field1376.method105(0);
                int var42 = var41 + class71.field1376.method96(74);
                class171.field3092.method105(0);
                int var43 = var42 + class171.field3092.method96(57);
                class112.field2104.method105(0);
                int var44 = var43 + class112.field2104.method96(46);
                class103.field1877.method105(0);
                int var45 = var44 + class103.field1877.method96(35);
                class28.field694.method105(0);
                int var46 = var45 + class28.field694.method96(114);
                class73.field1395.method105(0);
                int var47 = var46 + class73.field1395.method96(127);
                class179.field3251.method105(0);
                int var48 = var47 + class179.field3251.method96(117);
                class175.field3158.method105(0);
                int var49 = var48 + class175.field3158.method96(52);
                if (var49 < 1000) {
                    class13.field410 = class36.method316((byte) -34, new class117[] { class66.field1280, class42.method358(var49 / 10, (byte) 34), class40.field913 });
                    class115.field2140 = 50;
                } else {
                    class33.method284(class93.field1706, -113);
                    class201.method1344(class93.field1706, -10966);
                    class96.method655(class93.field1706, 0);
                    class218.method1429(125, class93.field1706, class78.field1483);
                    class84.method588(117, class167.field3021, class215.field3900, class78.field1483, class226.field4081);
                    class82.method561(class171.field3092, class78.field1483, 37);
                    class225.method1456(class112.field2104, class237.field4283, class226.field4081, class78.field1483, 104);
                    class44.method370((byte) 99, class93.field1706);
                    class237.method1516(class103.field1877, arg0, class218.field3965, class79.field1489);
                    class224.method1452((byte) 95, class28.field694, class78.field1483);
                    class6.method48((byte) 75, class73.field1395);
                    class169.method1196(16, class93.field1706);
                    class218.method1428(128, class140.field2552, class172.field3108, class69.field1313, class78.field1483);
                    class149.method1066(class93.field1706, -1);
                    class37.method328(-26, class71.field1376);
                    class27.method235((byte) -100, new class147(), class179.field3251, class175.field3158);
                    class61.method454(36, class175.field3158, class179.field3251);
                    class115.field2140 = 50;
                    class13.field410 = class13.field423;
                    class204.method1354(3018);
                    class176.field3179 = 80;
                }
            } else if (class176.field3179 == 80) {
                int var50 = 0;
                if (class143.field2582 == null) {
                    class144 var51 = class101.method683(class7.field119, -1595137716, class172.field3108, class169.field3042);
                    if (var51 != null) {
                        var51.method970();
                        class143.field2582 = var51;
                    }
                } else {
                    var50++;
                }
                if (class155.field2832 == null) {
                    class155.field2832 = class239.method1520(123, class169.field3042, class172.field3108, class157.field2864);
                } else {
                    var50++;
                }
                if (class1.field5 == null) {
                    class1.field5 = class200.method1333(class77.field1465, 0, class172.field3108, class169.field3042);
                } else {
                    var50++;
                }
                if (class56.field1135 == null) {
                    class56.field1135 = class81.method556((byte) -15, class169.field3042, class34.field808, class172.field3108);
                } else {
                    var50++;
                }
                if (class70.field1343 == null) {
                    class70.field1343 = class81.method556((byte) -15, class169.field3042, class225.field4061, class172.field3108);
                } else {
                    var50++;
                }
                if (class56.field1166 == null) {
                    class56.field1166 = class81.method556((byte) -15, class169.field3042, class55.field1120, class172.field3108);
                } else {
                    var50++;
                }
                if (class137.field2476 == null) {
                    class137.field2476 = class81.method556((byte) -15, class169.field3042, class108.field2002, class172.field3108);
                } else {
                    var50++;
                }
                if (class191.field3406 == null) {
                    class191.field3406 = class81.method556((byte) -15, class169.field3042, class1.field1, class172.field3108);
                } else {
                    var50++;
                }
                if (class177.field3216 == null) {
                    class144[] var52 = class200.method1333(class151.field2747, 0, class172.field3108, class169.field3042);
                    if (var52 != null) {
                        for (int var53 = 0; var53 < var52.length; var53++) {
                            var52[var53].method970();
                        }
                        class177.field3216 = var52;
                    }
                } else {
                    var50++;
                }
                if (class103.field1889 == null) {
                    class103.field1889 = class214.method1409(class172.field3108, class169.field3042, class49.field1031, 44);
                } else {
                    var50++;
                }
                if (class92.field1696 == null) {
                    class92.field1696 = class81.method556((byte) -15, class169.field3042, class149.field2720, class172.field3108);
                } else {
                    var50++;
                }
                if (class45.field971 == null) {
                    class45.field971 = class81.method556((byte) -15, class169.field3042, class210.field3763, class172.field3108);
                } else {
                    var50++;
                }
                if (class146.field2681 == null) {
                    class146.field2681 = class71.method505(class172.field3108, class31.field735, class169.field3042, (byte) 104);
                } else {
                    var50++;
                }
                if (class120.field2267 == null) {
                    class120.field2267 = class71.method505(class172.field3108, class56.field1153, class169.field3042, (byte) 104);
                } else {
                    var50++;
                }
                var50++;
                if (var50 < 15) {
                    class13.field410 = class36.method316((byte) -34, new class117[] { class40.field923, class42.method358(var50 * 100 / 15, (byte) 34), class40.field913 });
                    class115.field2140 = 60;
                } else {
                    class94.field1718.method931(class120.field2267, null);
                    int var54 = (int) (Math.random() * 21.0D) - 10;
                    class53.field1081.method931(class120.field2267, null);
                    class199.field3603.method931(class120.field2267, null);
                    int var55 = (int) (Math.random() * 41.0D) - 20;
                    int var56 = (int) (Math.random() * 21.0D) - 10;
                    int var57 = (int) (Math.random() * 21.0D) - 10;
                    for (int var58 = 0; var58 < class1.field5.length; var58++) {
                        class1.field5[var58].method977(var55 + var57, var54 + var55, var55 + var56);
                    }
                    class155.field2832[0].method1085(var55 + var57, var54 + var55, var55 + var56);
                    class13.field410 = class32.field759;
                    class176.field3179 = 90;
                    class123.field2305 = class1.field5;
                    class115.field2140 = 60;
                }
            } else if (class176.field3179 == 90) {
                if (class32.field750.method105(0)) {
                    class76 var59 = new class76(class61.field1222, class32.field750, class172.field3108, 20, class167.field3021);
                    class89.method619(var59);
                    class89.method609(0.7F);
                    class176.field3179 = 110;
                    class13.field410 = class58.field1200;
                    class115.field2140 = 70;
                } else {
                    class13.field410 = class36.method316((byte) -34, new class117[] { class125.field2336, class42.method358(class32.field750.method96(57), (byte) 34), class40.field913 });
                    class115.field2140 = 70;
                }
            } else if (class176.field3179 == 110) {
                class203.field3665 = new class34();
                class130.field2397.method890((byte) 44, 10, class203.field3665);
                class115.field2140 = 75;
                class176.field3179 = 120;
                class13.field410 = class172.field3111;
            } else if (class176.field3179 == 120) {
                if (class6.field101.method92(95, class169.field3042, class207.field3723)) {
                    class225 var60 = new class225(class6.field101.method107(false, class169.field3042, class207.field3723));
                    class146.method1050(var60, 100);
                    class176.field3179 = 130;
                    class115.field2140 = 80;
                    class13.field410 = class247.field4543;
                } else {
                    class13.field410 = class36.method316((byte) -34, new class117[] { class216.field3927, class219.field3971 });
                    class115.field2140 = 80;
                }
            } else if (class176.field3179 == 130) {
                if (!class69.field1313.method105(0)) {
                    class13.field410 = class36.method316((byte) -34, new class117[] { class27.field663, class42.method358(class69.field1313.method96(127) * 4 / 5, (byte) 34), class40.field913 });
                    class115.field2140 = 85;
                } else if (!class23.field580.method105(0)) {
                    class13.field410 = class36.method316((byte) -34, new class117[] { class27.field663, class42.method358(class23.field580.method96(80) / 6 + 80, (byte) 34), class40.field913 });
                    class115.field2140 = 85;
                } else if (class140.field2552.method105(0)) {
                    class115.field2140 = 100;
                    class176.field3179 = 140;
                    class13.field410 = class234.field4261;
                } else {
                    class13.field410 = class36.method316((byte) -34, new class117[] { class27.field663, class42.method358(class140.field2552.method96(108) / 20 + 96, (byte) 34), class40.field913 });
                    class115.field2140 = 85;
                }
            } else if (class176.field3179 == 140) {
                class78.field1486.method85(true, -28394, false);
                class117.field2187.method85(true, -28394, true);
                class172.field3108.method85(true, -28394, true);
                class140.field2552.method85(true, -28394, true);
                class6.field101.method85(true, -28394, true);
                class69.field1313.method85(true, -28394, true);
                class94.method647(10, (byte) -93);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLkh;)V")
    public static final void method289(boolean arg0, class117 arg1) {
        if (!arg0) {
            field786++;
            class187.field3354 = arg1;
            class53.method405((byte) -99);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIII)V")
    public static final void method290(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field778++;
        if (arg1) {
            method290(-44, false, -28, -38, 79);
        }
        if (arg0 >= class159.field2910 && arg0 <= class224.field4040) {
            int var5 = class119.method843(class240.field4355, -116, arg3, class146.field2678);
            int var6 = class119.method843(class240.field4355, -128, arg4, class146.field2678);
            class28.method237((byte) -80, var5, arg0, arg2, var6);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    private final void method291(int arg0) {
        field775++;
        if (class150.field2736 == 1000) {
            return;
        }
        boolean var2 = class177.method1236(8);
        if (!var2) {
            this.method298((byte) 60);
        }
        if (arg0 != 8134) {
            field780 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method292(boolean arg0) {
        if (class176.field3172 == 1) {
            class130.field2387 = class247.field4550;
            class11.field369 = class105.field1919;
            class213.field3876 = class156.field2840;
            class112.field2099 = class71.field1355;
        } else {
            class130.field2387 = class11.field381;
            class112.field2099 = class165.field2975;
            class213.field3876 = class68.field1303;
            class11.field369 = class58.field1194;
        }
        class112.field2107 = class68.field1304 = class193.field3455 = class7.field109 = new short[256];
        class36.field844 = class30.field723 == 0 ? 43594 : class10.field361 + 40000;
        field781++;
        class42.field943 = class36.field844;
        class182.field3295 = class30.field723 == 0 ? 443 : class10.field361 + 50000;
        class169.method1192(-81);
        class240.method1524(class85.field1608, (byte) 26);
        class202.method1347((byte) 113, class85.field1608);
        class231.field4156 = class226.method1468((byte) -102);
        if (class231.field4156 != null) {
            class231.field4156.method365(false, class85.field1608);
        }
        class19.field536 = class134.field2421;
        try {
            if (class130.field2397.field2412 != null) {
                class127.field2355 = new class136(class130.field2397.field2412, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class17.field500[var2] = new class136(class130.field2397.field2416[var2], 6000, 0);
                }
                class151.field2741 = new class136(class130.field2397.field2415, 6000, 0);
                class7.field107 = new class203(255, class127.field2355, class151.field2741, 500000);
                class88.field1638 = new class136(class130.field2397.field2408, 24, 0);
                class130.field2397.field2416 = null;
                class130.field2397.field2408 = null;
                class130.field2397.field2412 = null;
                class130.field2397.field2415 = null;
            }
            if (!arg0) {
                this.method295(true);
            }
        } catch (IOException var3) {
            class127.field2355 = null;
            class151.field2741 = null;
            class88.field1638 = null;
            class7.field107 = null;
        }
        class44.field963 = class6.field97;
        if (class30.field723 != 0) {
            class10.field356 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method293(int arg0, int arg1) {
        if (class42.field943 == class36.field844) {
            class42.field943 = class182.field3295;
        } else {
            class42.field943 = class36.field844;
        }
        class230.field4145 = 0;
        class37.field848 = null;
        class205.field3698 = null;
        class82.field1552++;
        if (class82.field1552 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class150.field2736 <= 5) {
                this.method1319(49, "js5connect_full");
                class150.field2736 = 1000;
            } else {
                class227.field4096 = 3000;
            }
        } else if (class82.field1552 >= 2 && arg0 == 6) {
            this.method1319(29, "js5connect_outofdate");
            class150.field2736 = 1000;
        } else if (class82.field1552 >= 4) {
            if (class150.field2736 > 5) {
                class227.field4096 = 3000;
            } else {
                this.method1319(72, "js5connect");
                class150.field2736 = 1000;
            }
        }
        field789++;
        if (arg1 != 1) {
            this.method299(-84);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)J")
    public static final long method294(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3065; var4++) {
            class57 var5 = var3.field3063[var4];
            if ((var5.field1171 >> 29 & 0x3L) == 2L && var5.field1186 == arg1 && var5.field1170 == arg2) {
                return var5.field1171;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method295(boolean arg0) {
        field790++;
        boolean var2 = class1.method3(16676);
        if (var2 && class115.field2137 && class84.field1569 != null) {
            class84.field1569.method226(2000);
        }
        boolean var3 = false;
        if (class54.field1110) {
            var3 = true;
            class54.field1110 = false;
        }
        if (class150.field2736 == 0) {
            class204.method1357(var3, class115.field2140, class13.field410, -16788, null);
        } else if (class150.field2736 == 5 || class150.field2736 == 10 || class150.field2736 == 20) {
            class4.method29(class199.field3603, -26503, class94.field1718);
        } else if (class150.field2736 == 25) {
            if (class23.field582 == 1) {
                if (class85.field1610 > class39.field890) {
                    class39.field890 = class85.field1610;
                }
                int var5 = (class39.field890 - class85.field1610) * 50 / class39.field890;
                class223.method1448(class36.method316((byte) -34, new class117[] { class61.field1220, class3.field25, class42.method358(var5, (byte) 34), class184.field3311 }), 1, false);
            } else if (class23.field582 == 2) {
                if (class4.field50 > class212.field3858) {
                    class212.field3858 = class4.field50;
                }
                int var4 = (class212.field3858 - class4.field50) * 50 / class212.field3858 + 50;
                class223.method1448(class36.method316((byte) -34, new class117[] { class61.field1220, class3.field25, class42.method358(var4, (byte) 34), class184.field3311 }), 1, false);
            } else {
                class223.method1448(class61.field1220, 1, false);
            }
        } else if (class150.field2736 == 30) {
            class143.method963((byte) -56);
        } else if (class150.field2736 == 40) {
            class223.method1448(class36.method316((byte) -34, new class117[] { class109.field2060, class225.field4054, class42.field942 }), 1, false);
        }
        Canvas var6 = class85.field1608;
        if (!arg0) {
            this.method299(25);
        }
        if (class150.field2736 == 30 && class93.field1711 == 0 && !var3) {
            try {
                Graphics var7 = var6.getGraphics();
                for (int var8 = 0; var8 < class139.field2530; var8++) {
                    if (class51.field1058[var8]) {
                        class23.field588.method41(class36.field843[var8], class1.field7[var8], class7.field114[var8], class100.field1834[var8], 64, var7);
                        class51.field1058[var8] = false;
                    }
                }
            } catch (Exception var11) {
                var6.repaint();
            }
        } else if (class150.field2736 > 0) {
            try {
                Graphics var9 = var6.getGraphics();
                class23.field588.method36(0, var9, (byte) -94, 0);
                for (int var10 = 0; var10 < class139.field2530; var10++) {
                    class51.field1058[var10] = false;
                }
            } catch (Exception var12) {
                var6.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public static void method296(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field791 = null;
        field777 = null;
        field780 = null;
        field785 = null;
        field784 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method297(byte arg0) {
        field779++;
        method296(-1);
        class117.method782(true);
        class199.method1330((byte) -4);
        class202.method1346(false);
        class130.method885(false);
        class34.method303((byte) 24);
        class209.method1369(8144);
        class145.method1020((byte) 49);
        class111.method752(62);
        class232.method1498(707);
        class136.method907((byte) -48);
        class203.method1350((byte) -74);
        class207.method1364(753704673);
        class52.method401((byte) -98);
        class138.method942();
        class3.method13((byte) 83);
        class31.method276((byte) 111);
        class186.method1266(true);
        class9.method71(0);
        class56.method426((byte) -122);
        class36.method317(-1);
        class62.method455(-9640);
        class43.method363((byte) -61);
        class218.method1427(0);
        class195.method1295(124);
        class25.method229(0);
        class108.method728(2016501090);
        class97.method660((byte) -112);
        class174.method1219(-10256);
        class234.method1515((byte) -100);
        class159.method1132(8);
        class109.method741((byte) 24);
        class73.method516(2);
        class12.method120((byte) 37);
        class213.method1399(96);
        class141.method960((byte) -29);
        class53.method407(96);
        class146.method1052(-14961);
        class102.method687(122);
        class206.method1361(true);
        class210.method1373(0);
        class170.method1198((byte) 116);
        class57.method432((byte) -54);
        class200.method1332(true);
        class38.method335((byte) 102);
        class90.method632(128);
        class239.method1519(200);
        class28.method240(-16701);
        class13.method124(39);
        class238.method1518();
        class184.method1263((byte) 112);
        class217.method1425(-2382);
        class211.method1390(9941);
        class182.method1257((byte) 118);
        class10.method98(17270);
        class71.method501(1);
        class15.method157();
        class1.method5((byte) -25);
        class154.method1104(4);
        class107.method717();
        class82.method564(-30);
        class103.method695(-5561);
        class4.method32((byte) 120);
        class60.method448(-1);
        class85.method594((byte) -104);
        class139.method947((byte) -62);
        class243.method1543(false);
        class165.method1172((byte) -10);
        class187.method1268((byte) -66);
        class37.method329(-1);
        class128.method875(-1608);
        class216.method1420((byte) 123);
        class247.method1620(0);
        class106.method710(true);
        class166.method1174(23723);
        class208.method1368(-124);
        class61.method452((byte) -92);
        class84.method591(127);
        class22.method192();
        class39.method339(14240);
        class8.method55(2);
        class66.method474((byte) 126);
        class204.method1356(54);
        class230.method1485(23180);
        class135.method902(false);
        class149.method1068((byte) 81);
        class215.method1415(-118);
        class69.method486(20626);
        class201.method1339(-1);
        class114.method764(-18);
        class80.method553(-7042);
        class122.method855(1);
        class20.method178(127);
        class14.method127(64);
        class148.method1061((byte) -98);
        class140.method952((byte) -128);
        class158.method1124(-87);
        class147.method1056(12106);
        class23.method205((byte) 123);
        class83.method574();
        class76.method532((byte) 106);
        class18.method171(-6841);
        class89.method627();
        class225.method1459(4);
        class133.method887((byte) -128);
        class44.method367((byte) -41);
        class41.method357((byte) -84);
        class55.method422(-33);
        class40.method350((byte) -121);
        class197.method1312();
        class124.method859(28315);
        class223.method1444(16777215);
        class173.method1208((byte) -51);
        class51.method393((byte) 61);
        class92.method633(81);
        class180.method1247((byte) -97);
        class95.method649(-1);
        class242.method1533();
        class175.method1220(-109);
        class231.method1492(-29726);
        class190.method1273((byte) 127);
        class177.method1234(true);
        class123.method857((byte) 92);
        class67.method476(16157);
        class45.method373((byte) -26);
        class19.method174((byte) -5);
        class214.method1404(18107);
        class33.method283((byte) -44);
        class224.method1451((byte) -80);
        class6.method46(-127);
        class191.method1278(2);
        class49.method384(1);
        class5.method40(-305);
        class112.method757(10);
        class194.method1293((byte) -128);
        class110.method746(91);
        class155.method1106((byte) 78);
        class132.method886();
        class121.method851();
        class142.method962();
        class179.method1240(18806);
        class64.method464();
        class196.method1302(true);
        class24.method208(-113);
        class185.method1264((byte) -22);
        class78.method545((byte) 125);
        class181.method1252(-128);
        class192.method1283();
        class35.method306();
        class212.method1392(true);
        class68.method478(-107);
        class167.method1181(-32492);
        class21.method182(-128);
        class161.method1145(0);
        class226.method1467(false);
        class228.method1479(0);
        class150.method1073(true);
        class17.method166(-30319);
        class193.method1291(false);
        class101.method680((byte) 70);
        class99.method670(3);
        class151.method1076(false);
        class240.method1525(127);
        class74.method518(-26619);
        class94.method644((byte) -75);
        class137.method917((byte) 76);
        class156.method1108(103);
        class70.method494((byte) 125);
        class100.method676(-31);
        class81.method559(true);
        class219.method1432((byte) -126);
        class50.method388(1566577612);
        if (arg0 >= -64) {
            this.method300((byte) -51);
        }
        class222.method1442(true);
        class7.method52((byte) 103);
        class198.method1317(true);
        class169.method1194(59);
        class104.method703((byte) 67);
        class120.method846(-2009459284);
        class26.method230((byte) -90);
        class11.method115(0);
        class227.method1470((byte) 111);
        class32.method278((byte) 90);
        class125.method866(0);
        class229.method1481((byte) -126);
        class205.method1359((byte) 31);
        class171.method1200(32271);
        class96.method650(-21696);
        class178.method1238(89);
        class246.method1613(2);
        class48.method382(0);
        class77.method542(-74);
        class162.method1157((byte) 127);
        class79.method550(-126);
        class75.method526(-4301);
        class233.method1503(0);
        class30.method263(-101);
        class93.method639((byte) -114);
        class54.method415(108);
        class58.method439((byte) 10);
        class42.method359(-122);
        class88.method604(-72);
        class163.method1159((byte) -110);
        class143.method965(0);
        class105.method705(7719);
        class221.method1437(-90);
        class127.method871(true);
        class157.method1111(-84);
        class72.method509((byte) 122);
        class115.method766(false);
        class27.method234(0);
        class98.method668(60);
        class237.method1517(7759444);
        class86.method597(127);
        class119.method835((byte) 81);
        class172.method1206((byte) 44);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field774++;
        if (!this.method1321(true)) {
            return;
        }
        class10.field361 = Integer.parseInt(this.getParameter("worldid"));
        class8.field132 = Integer.parseInt(this.getParameter("modewhat"));
        class30.field723 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class231.method1495(0);
        } else {
            class33.method287(8088);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class226.field4081 = true;
        } else {
            class226.field4081 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class93.method636(20626);
            class233.field4193 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class176.field3172 = 1;
        } else {
            class176.field3172 = 0;
        }
        try {
            class111.field2094 = Integer.parseInt(this.getParameter("js"));
            class143.field2588 = Integer.parseInt(this.getParameter("plug"));
            class182.field3288 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class5.field78 = class24.field595.method788(-71, this);
        if (class5.field78 == null) {
            class5.field78 = class169.field3042;
        }
        class201.field3648 = this.getCodeBase().getHost();
        this.method1328(499, class8.field132 + 32, (byte) 107, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field782++;
        try {
            if (arg0.length != 7) {
                class43.method364(true);
            }
            class10.field361 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class30.field723 = 0;
            } else if (arg0[1].equals("office")) {
                class30.field723 = 1;
            } else if (arg0[1].equals("local")) {
                class30.field723 = 2;
            } else {
                class43.method364(true);
            }
            if (arg0[2].equals("live")) {
                class8.field132 = 0;
            } else if (arg0[2].equals("rc")) {
                class8.field132 = 1;
            } else if (arg0[2].equals("wip")) {
                class8.field132 = 2;
            } else {
                class43.method364(true);
            }
            if (arg0[3].equals("lowmem")) {
                class231.method1495(0);
            } else if (arg0[3].equals("highmem")) {
                class33.method287(8088);
            } else {
                class43.method364(true);
            }
            if (arg0[4].equals("free")) {
                class226.field4081 = false;
            } else if (arg0[4].equals("members")) {
                class226.field4081 = true;
            } else {
                class43.method364(true);
            }
            if (arg0[5].equals("english")) {
                class233.field4193 = 0;
            } else if (arg0[5].equals("german")) {
                class93.method636(20626);
                class233.field4193 = 1;
            } else {
                class43.method364(true);
            }
            if (arg0[6].equals("game0")) {
                class176.field3172 = 0;
            } else if (arg0[6].equals("game1")) {
                class176.field3172 = 1;
            } else {
                class43.method364(true);
            }
            class5.field78 = class169.field3042;
            class182.field3288 = 0;
            class201.field3648 = "127.0.0.1";
            client var1 = new client();
            var1.method1325(27, class8.field132 + 32, 503, "runescape", 1, 499, 765);
            class108.field2011.setLocation(40, 40);
        } catch (Exception var3) {
            class147.method1055(6678, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method298(byte arg0) {
        field788++;
        if (class1.field4 >= 4) {
            this.method1319(67, "js5crc");
            class150.field2736 = 1000;
            return;
        }
        if (class5.field85 >= 4) {
            if (class150.field2736 <= 5) {
                this.method1319(105, "js5io");
                class150.field2736 = 1000;
                return;
            }
            class227.field4096 = 3000;
            class5.field85 = 3;
        }
        if (arg0 <= 34) {
            this.method288(true);
        }
        if (class227.field4096-- > 0) {
            return;
        }
        try {
            if (class230.field4145 == 0) {
                class205.field3698 = class130.field2397.method894((byte) -84, class42.field943, class201.field3648);
                class230.field4145++;
            }
            if (class230.field4145 == 1) {
                if (class205.field3698.field1262 == 2) {
                    this.method293(-1, 1);
                    return;
                }
                if (class205.field3698.field1262 == 1) {
                    class230.field4145++;
                }
            }
            if (class230.field4145 == 2) {
                class37.field848 = new class111((Socket) class205.field3698.field1259, class130.field2397);
                class145 var2 = new class145(5);
                var2.method1002(false, 15);
                var2.method1024(-93, 499);
                class37.field848.method750(0, var2.field2613, -7115, 5);
                class230.field4145++;
                class53.field1104 = class4.method31((byte) 47);
            }
            if (class230.field4145 == 3) {
                if (class150.field2736 <= 5 || class37.field848.method751(10364) > 0) {
                    int var3 = class37.field848.method747(1715);
                    if (var3 != 0) {
                        this.method293(var3, 1);
                        return;
                    }
                    class230.field4145++;
                } else if (class4.method31((byte) 47) - class53.field1104 > 30000L) {
                    this.method293(-2, 1);
                    return;
                }
            }
            if (class230.field4145 == 4) {
                class128.method876(0, class37.field848, class150.field2736 > 20);
                class82.field1552 = 0;
                class37.field848 = null;
                class230.field4145 = 0;
                class205.field3698 = null;
            }
        } catch (IOException var4) {
            this.method293(-3, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method299(int arg0) {
        if (class203.field3665 != null) {
            class203.field3665.field796 = false;
        }
        class203.field3665 = null;
        field792++;
        if (class207.field3717 != null) {
            class207.field3717.method748((byte) -84);
            class207.field3717 = null;
        }
        class179.method1242(true, class85.field1608);
        class80.method552(true, class85.field1608);
        if (class231.field4156 != null) {
            class231.field4156.method362(class85.field1608, -28077);
        }
        class88.method606(false);
        class112.method755(9584);
        class231.field4156 = null;
        if (class84.field1569 != null) {
            class84.field1569.method215((byte) -79);
        }
        if (class229.field4128 != null) {
            class229.field4128.method215((byte) -82);
        }
        class124.method861(-1);
        class225.method1457((byte) -77);
        try {
            if (class127.field2355 != null) {
                class127.field2355.method909((byte) 121);
            }
            if (arg0 != 0) {
                main(null);
            }
            if (class17.field500 != null) {
                for (int var2 = 0; var2 < class17.field500.length; var2++) {
                    if (class17.field500[var2] != null) {
                        class17.field500[var2].method909((byte) 60);
                    }
                }
            }
            if (class151.field2741 != null) {
                class151.field2741.method909((byte) 80);
            }
            if (class88.field1638 != null) {
                class88.field1638.method909((byte) 122);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        class44.field966++;
        field787++;
        if (class44.field966 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class145.field2667 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class42.field939.setSeed((long) class145.field2667);
        }
        this.method291(8134);
        class13.method126(255);
        class166.method1176(28415);
        class93.method637(10000);
        class95.method648(-95);
        class150.method1072(true);
        if (class231.field4156 != null) {
            int var3 = class231.field4156.method360((byte) -104);
            class195.field3485 = var3;
        }
        if (arg0 < 118) {
            field777 = null;
        }
        if (class150.field2736 == 0) {
            this.method288(false);
            class55.method423(0);
        } else if (class150.field2736 == 5) {
            class54.method414(this, true);
            this.method288(false);
            class55.method423(0);
        } else if (class150.field2736 == 10) {
            class54.method414(this, true);
        } else if (class150.field2736 == 20) {
            class54.method414(this, true);
            class3.method24((byte) 51);
        } else if (class150.field2736 == 25) {
            class105.method704(-106);
        }
        if (class150.field2736 == 30) {
            class160.method1137(94);
        } else if (class150.field2736 == 40) {
            class3.method24((byte) -127);
        }
    }
}
