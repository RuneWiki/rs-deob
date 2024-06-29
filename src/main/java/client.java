import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class115 {

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1994 = -1;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1987 = -1;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Loj;")
    public static class17 field2001 = new class17(32);

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "[Lrg;")
    public static class55[] field2004 = new class55[6];

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lhh;")
    public static class163 field2005 = class137.method1065("", 17);

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Z")
    public static boolean field2006 = true;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lvf;")
    public static class71 field2003;

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class11.method72(true);
            }
            class142.field2696 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class147.field2794 = 0;
            } else if (arg0[1].equals("office")) {
                class147.field2794 = 1;
            } else if (arg0[1].equals("local")) {
                class147.field2794 = 2;
            } else {
                class11.method72(true);
            }
            if (arg0[2].equals("live")) {
                class63.field1076 = 0;
            } else if (arg0[2].equals("rc")) {
                class63.field1076 = 1;
            } else if (arg0[2].equals("wip")) {
                class63.field1076 = 2;
            } else {
                class11.method72(true);
            }
            if (arg0[4].equals("free")) {
                class161.field2956 = false;
            } else if (arg0[4].equals("members")) {
                class161.field2956 = true;
            } else {
                class11.method72(true);
            }
            if (arg0[5].equals("english")) {
                class218.field3968 = 0;
            } else if (arg0[5].equals("german")) {
                class54.method375((byte) 75);
                class218.field3968 = 1;
            } else {
                class11.method72(true);
            }
            if (arg0[6].equals("game0")) {
                class137.field2651 = 0;
            } else if (arg0[6].equals("game1")) {
                class137.field2651 = 1;
            } else {
                class11.method72(true);
            }
            if (arg0.length != 8) {
                class23.field382 = false;
            } else if (arg0[7].equals("safemode")) {
                class23.field382 = true;
            } else {
                class11.method72(true);
            }
            class129.field2514 = "127.0.0.1";
            class227.field4099 = 0;
            class149.field2809 = class170.field3120;
            client var1 = new client();
            var1.method924(506, 27, 765, 503, class63.field1076 + 32, "runescape", false);
            class45.field754.setLocation(40, 40);
        } catch (Exception var3) {
            class107.method865(-128, var3, (String) null);
        }
        field2002++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method823(int arg0) {
        field1984++;
        if (class49.field831 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class7.method55(0);
            if (class39.field658 == 0L) {
                class39.field658 = var4;
            }
            if (var3 > 16384 && var4 - class39.field658 < 5000L) {
                if ((var4 - class211.field3818) > 1000L) {
                    System.gc();
                    class211.field3818 = var4;
                }
                class87.field1621 = 5;
                class140.field2678 = class143.field2704;
            } else {
                class87.field1621 = 5;
                class140.field2678 = class92.field1732;
                class49.field831 = 10;
            }
        } else if (class49.field831 == 10) {
            class114.method910(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class140.field2670[var6] = new class1(104, 104);
            }
            class140.field2678 = class265.field4614;
            class49.field831 = 30;
            class87.field1621 = 10;
        } else if (class49.field831 == 30) {
            class75.field1418 = class48.method346(1000000, true, false, 0, true);
            class38.field640 = class48.method346(1000000, true, false, 1, true);
            class219.field3986 = class48.method346(1000000, true, true, 2, false);
            class90.field1646 = class48.method346(1000000, true, false, 3, true);
            class149.field2805 = class48.method346(1000000, true, false, 4, true);
            class139.field2667 = class48.method346(1000000, true, true, 5, true);
            class59.field969 = class48.method346(1000000, false, true, 6, true);
            class221.field4012 = class48.method346(1000000, true, false, 7, true);
            class94.field1786 = class48.method346(1000000, true, false, 8, true);
            class4.field89 = class48.method346(1000000, true, false, 9, true);
            class213.field3880 = class48.method346(1000000, true, false, 10, true);
            class20.field327 = class48.method346(1000000, true, false, 11, true);
            class165.field3050 = class48.method346(1000000, true, false, 12, true);
            class28.field426 = class48.method346(1000000, true, false, 13, true);
            class191.field3489 = class48.method346(1000000, false, false, 14, true);
            class30.field475 = class48.method346(1000000, true, false, 15, true);
            class228.field4108 = class48.method346(1000000, true, false, 16, true);
            class28.field438 = class48.method346(1000000, true, false, 17, true);
            class95.field1796 = class48.method346(1000000, true, false, 18, true);
            class63.field1074 = class48.method346(1000000, true, false, 19, true);
            class221.field4031 = class48.method346(1000000, true, false, 20, true);
            class234.field4176 = class48.method346(1000000, true, false, 21, true);
            class196.field3540 = class48.method346(1000000, true, false, 22, true);
            class107.field2049 = class48.method346(1000000, true, true, 23, true);
            class181.field3278 = class48.method346(1000000, true, false, 24, true);
            class93.field1765 = class48.method346(1000000, true, false, 25, true);
            class11.field173 = class48.method346(1000000, true, true, 26, true);
            class140.field2678 = class77.field1454;
            class87.field1621 = 15;
            class49.field831 = 40;
        } else if (class49.field831 == 40) {
            byte var7 = 0;
            int var8 = var7 + class75.field1418.method145((byte) -65) * 4 / 100;
            int var9 = var8 + class38.field640.method145((byte) -65) * 4 / 100;
            int var10 = var9 + class219.field3986.method145((byte) -65) / 100;
            int var11 = var10 + class90.field1646.method145((byte) -65) * 2 / 100;
            int var12 = var11 + class149.field2805.method145((byte) -65) * 6 / 100;
            int var13 = var12 + class139.field2667.method145((byte) -65) * 4 / 100;
            int var14 = var13 + class59.field969.method145((byte) -65) * 2 / 100;
            int var15 = var14 + class221.field4012.method145((byte) -65) * 50 / 100;
            int var16 = var15 + class94.field1786.method145((byte) -65) * 2 / 100;
            int var17 = var16 + class4.field89.method145((byte) -65) * 2 / 100;
            int var18 = var17 + class213.field3880.method145((byte) -65) * 2 / 100;
            int var19 = var18 + class20.field327.method145((byte) -65) * 2 / 100;
            int var20 = var19 + class165.field3050.method145((byte) -65) * 2 / 100;
            int var21 = var20 + class28.field426.method145((byte) -65) * 2 / 100;
            int var22 = var21 + class191.field3489.method145((byte) -65) * 2 / 100;
            int var23 = var22 + class30.field475.method145((byte) -65) * 2 / 100;
            int var24 = var23 + class228.field4108.method145((byte) -65) / 100;
            int var25 = var24 + class28.field438.method145((byte) -65) / 100;
            int var26 = var25 + class95.field1796.method145((byte) -65) / 100;
            int var27 = var26 + class63.field1074.method145((byte) -65) / 100;
            int var28 = var27 + class221.field4031.method145((byte) -65) / 100;
            int var29 = var28 + class234.field4176.method145((byte) -65) / 100;
            int var30 = var29 + class196.field3540.method145((byte) -65) / 100;
            int var31 = var30 + class107.field2049.method145((byte) -65) / 100;
            int var32 = var31 + class181.field3278.method145((byte) -65) / 100;
            int var33 = var32 + class93.field1765.method145((byte) -65) / 100;
            int var34 = var33 + class11.field173.method145((byte) -65) / 100;
            if (var34 == 100) {
                class87.field1621 = 20;
                class140.field2678 = class18.field289;
                class40.method278(class94.field1786, -653652382);
                class31.method186(class94.field1786, (byte) 28);
                class132.method1043((byte) -97, class94.field1786);
                class40.method281(class94.field1786, (byte) -51);
                class49.field831 = 45;
            } else {
                if (var34 != 0) {
                    class140.field2678 = class145.method1101(0, new class163[] { class162.field2960, class136.method1061(var34, (byte) 115), class215.field3927 });
                }
                class87.field1621 = 20;
            }
        } else if (class49.field831 == 45) {
            class262.method1770(2, class244.field4306, true, 22050);
            class215.field3916 = new class92();
            class215.field3916.method726(9, (byte) -65, 128);
            class59.field973 = class50.method354(0, class202.field3675, (byte) 94, class169.field3090, 22050);
            class59.field973.method434(class215.field3916, 0);
            class133.method1045(class191.field3489, class149.field2805, class30.field475, class215.field3916, false);
            class253.field4431 = class50.method354(1, class202.field3675, (byte) -125, class169.field3090, 2048);
            class225.field4085 = new class80();
            class253.field4431.method434(class225.field4085, 0);
            class51.field855 = new class58(22050, class255.field4454);
            class171.field3126 = class59.field969.method983(24108, class97.field1834);
            class87.field1621 = 30;
            class140.field2678 = class111.field2109;
            class49.field831 = 50;
        } else if (class49.field831 == 50) {
            int var35 = class210.method1504(class28.field426, 4197, class94.field1786);
            int var36 = class28.method172((byte) 115);
            if (var36 > var35) {
                class140.field2678 = class145.method1101(0, new class163[] { class84.field1595, class136.method1061(var35 * 100 / var36, (byte) 104), class215.field3927 });
                class87.field1621 = 35;
            } else {
                class140.field2678 = class38.field643;
                class87.field1621 = 35;
                class49.field831 = 60;
            }
        } else if (class49.field831 == 60) {
            int var37 = class92.method717(class94.field1786, 119);
            int var38 = class116.method925(20680);
            if (var38 > var37) {
                class140.field2678 = class145.method1101(0, new class163[] { class122.field2333, class136.method1061(var37 * 100 / var38, (byte) 117), class215.field3927 });
                class87.field1621 = 40;
            } else {
                class140.field2678 = class177.field3225;
                class87.field1621 = 40;
                class49.field831 = 65;
            }
        } else if (class49.field831 == 65) {
            class62.method427((byte) -121, class28.field426, class94.field1786);
            class140.field2678 = class155.field2885;
            class87.field1621 = 45;
            class174.method1292(5, true);
            class49.field831 = 70;
        } else if (class49.field831 == 70) {
            byte var39 = 0;
            class219.field3986.method962((byte) -10);
            int var40 = var39 + class219.field3986.method987(-15316);
            class228.field4108.method962((byte) -22);
            int var41 = var40 + class228.field4108.method987(-15316);
            class28.field438.method962((byte) -83);
            int var42 = var41 + class28.field438.method987(-15316);
            class95.field1796.method962((byte) -92);
            int var43 = var42 + class95.field1796.method987(-15316);
            class63.field1074.method962((byte) -12);
            int var44 = var43 + class63.field1074.method987(-15316);
            class221.field4031.method962((byte) -120);
            int var45 = var44 + class221.field4031.method987(-15316);
            class234.field4176.method962((byte) -13);
            int var46 = var45 + class234.field4176.method987(-15316);
            class196.field3540.method962((byte) -118);
            int var47 = var46 + class196.field3540.method987(-15316);
            class181.field3278.method962((byte) -93);
            int var48 = var47 + class181.field3278.method987(-15316);
            class93.field1765.method962((byte) -78);
            int var49 = var48 + class93.field1765.method987(-15316);
            if (var49 < 1000) {
                class140.field2678 = class145.method1101(0, new class163[] { class239.field4263, class136.method1061(var49 / 10, (byte) 126), class215.field3927 });
                class87.field1621 = 50;
            } else {
                class43.method322(class219.field3986, 250);
                class182.method1347(class219.field3986, (byte) -64);
                class54.method377(class219.field3986, 2047);
                class183.method1355(class221.field4012, 3, class219.field3986);
                class12.method78(class228.field4108, 17674, class161.field2956, class221.field4012);
                class55.method391((byte) 79, class95.field1796, class221.field4012);
                class199.method1430(class161.field2956, class221.field4012, 117, class63.field1074, class36.field613);
                class139.method1075(-76, class219.field3986);
                class159.method1172(class221.field4031, true, class75.field1418, class38.field640);
                class49.method350(-61, class221.field4012, class234.field4176);
                class55.method386(0, class196.field3540);
                class3.method29(117, class219.field3986);
                class116.method927(class94.field1786, class221.field4012, class28.field426, (byte) 95, class90.field1646);
                class81.method645(class219.field3986, -1700693788);
                class140.method1077(class28.field438, 31012);
                class52.method361(new class259(), 32767, class93.field1765, class181.field3278);
                method837(100, class93.field1765, class181.field3278);
                class140.field2678 = class239.field4256;
                class87.field1621 = 50;
                class133.method1050(true);
                class49.field831 = 80;
            }
        } else if (class49.field831 == 80) {
            int var50 = class160.method1174(class94.field1786, 5440);
            int var51 = class19.method131(-6);
            if (var51 > var50) {
                class140.field2678 = class145.method1101(0, new class163[] { class152.field2848, class136.method1061(var50 * 100 / var51, (byte) 120), class215.field3927 });
                class87.field1621 = 60;
            } else {
                class71.method518(false, class94.field1786);
                class140.field2678 = class31.field487;
                class87.field1621 = 60;
                class49.field831 = 90;
            }
        } else if (class49.field831 != 90) {
            int var53 = -43 % ((57 - arg0) / 52);
            if (class49.field831 == 100) {
                if (class82.method665(class94.field1786, 0)) {
                    class49.field831 = 110;
                }
            } else if (class49.field831 == 110) {
                class146.field2783 = new class130();
                class169.field3090.method1253(class146.field2783, 10, 2244);
                class140.field2678 = class247.field4372;
                class49.field831 = 120;
                class87.field1621 = 75;
            } else if (class49.field831 == 120) {
                if (class213.field3880.method969(class1.field12, class170.field3120, 0)) {
                    class64 var54 = new class64(class213.field3880.method982(0, class170.field3120, class1.field12));
                    class147.method1106(true, var54);
                    class49.field831 = 130;
                    class140.field2678 = class110.field2082;
                    class87.field1621 = 80;
                } else {
                    class140.field2678 = class145.method1101(0, new class163[] { class35.field546, class27.field423 });
                    class87.field1621 = 80;
                }
            } else if (class49.field831 == 130) {
                if (!class90.field1646.method962((byte) -95)) {
                    class140.field2678 = class145.method1101(0, new class163[] { class140.field2682, class136.method1061(class90.field1646.method987(-15316) * 3 / 4, (byte) 127), class215.field3927 });
                    class87.field1621 = 85;
                } else if (!class165.field3050.method962((byte) -31)) {
                    class140.field2678 = class145.method1101(0, new class163[] { class140.field2682, class136.method1061(class165.field3050.method987(-15316) / 10 + 75, (byte) 106), class215.field3927 });
                    class87.field1621 = 85;
                } else if (!class28.field426.method962((byte) -80)) {
                    class140.field2678 = class145.method1101(0, new class163[] { class140.field2682, class136.method1061(class28.field426.method987(-15316) / 20 + 85, (byte) 125), class215.field3927 });
                    class87.field1621 = 85;
                } else if (class107.field2049.method960((byte) 122, class99.field1917)) {
                    class181.method1326(class238.field4243, class64.field1080, false, class107.field2042, class107.field2049, class89.field1642, class239.field4248);
                    class49.field831 = 140;
                    class140.field2678 = class132.field2553;
                    class87.field1621 = 100;
                } else {
                    class140.field2678 = class145.method1101(0, new class163[] { class140.field2682, class136.method1061(class107.field2049.method978(class99.field1917, (byte) 122) / 10 + 90, (byte) 109), class215.field3927 });
                    class87.field1621 = 85;
                }
            } else if (class49.field831 == 140) {
                class238.field4238 = class90.field1646.method983(24108, class130.field2532);
                class139.field2667.method988(true, 100, false);
                class59.field969.method988(true, 100, true);
                class94.field1786.method988(true, 100, true);
                class28.field426.method988(true, 100, true);
                class213.field3880.method988(true, 100, true);
                class90.field1646.method988(true, 100, true);
                class40.field669 = true;
                class116.method930(-71);
            }
        } else if (class11.field173.method962((byte) -50)) {
            class122 var52 = new class122(class4.field89, class11.field173, class94.field1786, 20, !class208.field3781);
            class98.method785(var52);
            if (class211.field3824 == 1) {
                class98.method781(0.9F);
            }
            if (class211.field3824 == 2) {
                class98.method781(0.8F);
            }
            if (class211.field3824 == 3) {
                class98.method781(0.7F);
            }
            if (class211.field3824 == 4) {
                class98.method781(0.6F);
            }
            class140.field2678 = class223.field4057;
            class49.field831 = 100;
            class87.field1621 = 70;
        } else {
            class140.field2678 = class145.method1101(0, new class163[] { class231.field4150, class136.method1061(class11.field173.method987(-15316), (byte) 104), class215.field3927 });
            class87.field1621 = 70;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lqh;)Lqh;")
    public static final class69 method824(class69 arg0) {
        int var1 = class54.method374(method826(arg0), (byte) -6);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class124.method989((byte) 117, arg0.field1302);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method825(int arg0) {
        int var1 = -2 % ((arg0 + 18) / 45);
        field1991++;
        class18.field278.method120((byte) -101);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lqh;)I")
    public static final int method826(class69 arg0) {
        class129 var1 = (class129) class192.field3514.method1743(((long) arg0.field1188 << 32) + (long) arg0.field1205, false);
        return var1 == null ? arg0.field1305 : var1.field2503;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method827(int arg0, int arg1) {
        class256.field4472 = null;
        field1999++;
        if (arg0 != 1) {
            this.method840(-128);
        }
        class67.field1132 = null;
        if (class256.field4492 == class243.field4295) {
            class243.field4295 = class256.field4483;
        } else {
            class243.field4295 = class256.field4492;
        }
        class145.field2768++;
        class56.field926 = 0;
        if (class145.field2768 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class262.field4583 == 0 || class262.field4583 == 5) {
                this.method911((byte) -128, "js5connect_full");
                class262.field4583 = 1000;
            } else {
                class239.field4272 = 3000;
            }
        } else if (class145.field2768 >= 2 && arg1 == 6) {
            this.method911((byte) -128, "js5connect_outofdate");
            class262.field4583 = 1000;
        } else if (class145.field2768 >= 4) {
            if (class262.field4583 == 0 || class262.field4583 == 5) {
                this.method911((byte) -128, "js5connect");
                class262.field4583 = 1000;
            } else {
                class239.field4272 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method828(int arg0) {
        field1992++;
        if (class262.field4583 == 1000) {
            return;
        }
        class227.field4092++;
        if ((class227.field4092 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class171.field3142 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class210.field3800.setSeed((long) class171.field3142);
        }
        this.method836(100);
        class162.method1181(38);
        class228.method1591(-101);
        class229.method1593(-124);
        class55.method389(381);
        class19.method133((byte) -85);
        if (class205.field3700 != null) {
            int var3 = class205.field3700.method317((byte) -115);
            class264.field4591 = var3;
        }
        if (class262.field4583 == 0) {
            this.method823(125);
            class157.method1165(false);
        } else if (class262.field4583 == 5) {
            this.method823(-79);
            class157.method1165(false);
        } else if (class262.field4583 == 25 || class262.field4583 == 28) {
            class102.method816(1);
        }
        int var4 = -43 / ((arg0 - 84) / 37);
        if (class262.field4583 == 10) {
            this.method831((byte) 28);
            class161.method1176(false);
            class109.method878((byte) -74);
        } else if (class262.field4583 == 30) {
            class52.method367(128);
        } else if (class262.field4583 == 40) {
            class109.method878((byte) -74);
            if (class128.field2492 != -3) {
                if (class128.field2492 == 15) {
                    class176.method1305(-45);
                } else if (class128.field2492 != 2) {
                    class116.method930(-73);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method829(int arg0) {
        if (arg0 != -27504) {
            field2006 = false;
        }
        field1998++;
        if (class250.field4402 != null) {
            class250.field4402.destroy();
            class250.field4402 = null;
        }
        if (class169.field3090 != null) {
            class169.field3090.method1255(0, this.getClass());
        }
        if (class146.field2783 != null) {
            class146.field2783.field2523 = false;
        }
        class146.field2783 = null;
        if (class188.field3443 != null) {
            class188.field3443.method1724(true);
            class188.field3443 = null;
        }
        class157.method1163(class202.field3675, -1);
        class203.method1452((byte) 107, class202.field3675);
        if (class205.field3700 != null) {
            class205.field3700.method316(false, class202.field3675);
        }
        class120.method944((byte) -96);
        class259.method1748(-11);
        class205.field3700 = null;
        if (class59.field973 != null) {
            class59.field973.method423((byte) -30);
        }
        if (class253.field4431 != null) {
            class253.field4431.method423((byte) -30);
        }
        class146.method1103((byte) 96);
        class50.method358(127);
        try {
            if (class134.field2597 != null) {
                class134.field2597.method1562(arg0 + 27504);
            }
            if (class131.field2540 != null) {
                for (int var2 = 0; var2 < class131.field2540.length; var2++) {
                    if (class131.field2540[var2] != null) {
                        class131.field2540[var2].method1562(0);
                    }
                }
            }
            if (class48.field801 != null) {
                class48.field801.method1562(arg0 + 27504);
            }
            if (class247.field4346 != null) {
                class247.field4346.method1562(0);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method830(int arg0) {
        class76.method556((byte) 100, class23.field382, class169.field3090);
        class58.field963 = class96.field1813 = class203.field3688 = class265.field4602 = new short[256];
        if (class137.field2651 == 1) {
            class135.field2621 = class87.field1631;
            class16.field237 = class127.field2463;
            class38.field636 = class187.field3425;
            class24.field391 = class160.field2942;
        } else {
            class24.field391 = class197.field3550;
            class38.field636 = class209.field3794;
            class16.field237 = class257.field4498;
            class135.field2621 = class247.field4349;
        }
        field1985++;
        class256.field4483 = class147.field2794 == arg0 ? 443 : class142.field2696 + 50000;
        class256.field4492 = class147.field2794 == 0 ? 43594 : class142.field2696 + 40000;
        class243.field4295 = class256.field4492;
        class236.method1640(1);
        class17.method119((byte) 119, class202.field3675);
        class220.method1555(class202.field3675, true);
        class205.field3700 = class144.method1091(arg0 ^ 0xA5362EA2);
        if (class205.field3700 != null) {
            class205.field3700.method315(class202.field3675, (byte) 104);
        }
        class60.field1010 = class166.field3060;
        try {
            if (class169.field3090.field3051 != null) {
                class134.field2597 = new class221(class169.field3090.field3051, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class131.field2540[var2] = new class221(class169.field3090.field3063[var2], 6000, 0);
                }
                class48.field801 = new class221(class169.field3090.field3056, 6000, 0);
                class246.field4334 = new class262(255, class134.field2597, class48.field801, 500000);
                class247.field4346 = new class221(class169.field3090.field3061, 24, 0);
                class169.field3090.field3061 = null;
                class169.field3090.field3056 = null;
                class169.field3090.field3051 = null;
                class169.field3090.field3063 = null;
            }
        } catch (IOException var3) {
            class246.field4334 = null;
            class48.field801 = null;
            class134.field2597 = null;
            class247.field4346 = null;
        }
        if (class147.field2794 != 0) {
            class174.field3172 = true;
        }
        class220.field4001 = class258.field4524;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1995++;
        if (!this.method917((byte) 107)) {
            return;
        }
        class142.field2696 = Integer.parseInt(this.getParameter("worldid"));
        class63.field1076 = Integer.parseInt(this.getParameter("modewhat"));
        class147.field2794 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class23.field382 = true;
        } else {
            class23.field382 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class161.field2956 = true;
        } else {
            class161.field2956 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class54.method375((byte) -87);
            class218.field3968 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class137.field2651 = 1;
        } else {
            class137.field2651 = 0;
        }
        try {
            class135.field2617 = Integer.parseInt(this.getParameter("js"));
            class29.field449 = Integer.parseInt(this.getParameter("plug"));
            class227.field4099 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var10) {
        }
        class149.field2809 = class152.field2842.method1196((byte) -118, this);
        if (class149.field2809 == null) {
            class149.field2809 = class170.field3120;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6;
            try {
                var6 = var5.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var9) {
                var6 = var5.getBytes();
            }
            class163 var7 = class129.method1025(var6.length, 84, 0, var6);
            boolean var8 = class29.method182(-1, var7);
            if (var8) {
                class169.field3091 = var7;
            }
        }
        class129.field2514 = this.getCodeBase().getHost();
        this.method921(class63.field1076 + 32, 506, 0, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method831(byte arg0) {
        field1989++;
        class43.method321(16, this);
        for (class130.field2531 = 0; class201.method1440((byte) 67) && class130.field2531 < 128; class130.field2531++) {
            class99.field1900[class130.field2531] = class45.field759;
            class137.field2642[class130.field2531] = class76.field1445;
        }
        if (arg0 != 28) {
            method837(70, (class123) null, (class123) null);
        }
        class52.field877++;
        if (class193.field3521 != -1) {
            class30.method183(class205.field3706, 0, 0, class233.field4160, 0, -37, class193.field3521, 0);
        }
        class24.field384++;
        class213.method1520(13738);
        while (true) {
            class225 var2;
            class69 var3;
            class69 var4;
            do {
                var2 = (class225) class214.field3897.method1019((byte) -5);
                if (var2 == null) {
                    while (true) {
                        class225 var5;
                        class69 var6;
                        class69 var7;
                        do {
                            var5 = (class225) class223.field4058.method1019((byte) -5);
                            if (var5 == null) {
                                while (true) {
                                    class225 var8;
                                    class69 var9;
                                    class69 var10;
                                    do {
                                        var8 = (class225) class11.field170.method1019((byte) -5);
                                        if (var8 == null) {
                                            if (class109.field2063 != null) {
                                                class75.method545(arg0 - 106);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field4076;
                                        if (var9.field1205 < 0) {
                                            break;
                                        }
                                        var10 = class124.method989((byte) 124, var9.field1302);
                                    } while (var10 == null || var10.field1291 == null || var10.field1291.length <= var9.field1205 || var10.field1291[var9.field1205] != var9);
                                    class192.method1406(var8, (byte) -111);
                                }
                            }
                            var6 = var5.field4076;
                            if (var6.field1205 < 0) {
                                break;
                            }
                            var7 = class124.method989((byte) 122, var6.field1302);
                        } while (var7 == null || var7.field1291 == null || var7.field1291.length <= var6.field1205 || var7.field1291[var6.field1205] != var6);
                        class192.method1406(var5, (byte) -127);
                    }
                }
                var3 = var2.field4076;
                if (var3.field1205 < 0) {
                    break;
                }
                var4 = class124.method989((byte) 125, var3.field1302);
            } while (var4 == null || var4.field1291 == null || var4.field1291.length <= var3.field1205 || var4.field1291[var3.field1205] != var3);
            class192.method1406(var2, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method832(int arg0) {
        field2004 = null;
        field2001 = null;
        field2005 = null;
        field2003 = null;
        if (arg0 != -8560) {
            field1994 = -113;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method833(int arg0) {
        field2000++;
        if (class17.field248 >= 4) {
            this.method911((byte) -128, "js5crc");
            class262.field4583 = 1000;
            return;
        }
        if (arg0 != 9926) {
            field1990 = -67;
        }
        if (class81.field1532 >= 4) {
            if (class262.field4583 == 0 || class262.field4583 == 5) {
                this.method911((byte) -128, "js5io");
                class262.field4583 = 1000;
                return;
            }
            class81.field1532 = 3;
            class239.field4272 = 3000;
        }
        if ((class239.field4272--) > 0) {
            return;
        }
        try {
            if (class56.field926 == 0) {
                class256.field4472 = class169.field3090.method1245(false, class243.field4295, class129.field2514);
                class56.field926++;
            }
            if (class56.field926 == 1) {
                if (class256.field4472.field3566 == 2) {
                    this.method827(1, -1);
                    return;
                }
                if (class256.field4472.field3566 == 1) {
                    class56.field926++;
                }
            }
            if (class56.field926 == 2) {
                class67.field1132 = new class255((Socket) class256.field4472.field3563, class169.field3090);
                class81 var2 = new class81(5);
                var2.method655(0, 15);
                var2.method604(506, arg0 ^ 0x5BFB8FB6);
                class67.field1132.method1729(var2.field1562, 5, 0, 5000);
                class56.field926++;
                class126.field2422 = class7.method55(arg0 - 9926);
            }
            if (class56.field926 == 3) {
                if (class262.field4583 == 0 || class262.field4583 == 5 || class67.field1132.method1725(false) > 0) {
                    int var3 = class67.field1132.method1730(false);
                    if (var3 != 0) {
                        this.method827(arg0 ^ 0x26C7, var3);
                        return;
                    }
                    class56.field926++;
                } else if ((class7.method55(0) - class126.field2422) > 30000L) {
                    this.method827(1, -2);
                    return;
                }
            }
            if (class56.field926 == 4) {
                boolean var4 = class262.field4583 == 5 || class262.field4583 == 10 || class262.field4583 == 28;
                class191.method1401(class67.field1132, 0, !var4);
                class256.field4472 = null;
                class56.field926 = 0;
                class145.field2768 = 0;
                class67.field1132 = null;
            }
        } catch (IOException var5) {
            this.method827(1, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lqh;IIIIIII)V")
    public static final void method834(class69[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class69 var9 = arg0[var8];
            if (var9 != null && var9.field1302 == arg1 && (!var9.field1240 || var9.field1294 == 0 || var9.field1233 || method826(var9) != 0 || class144.field2730 == var9 || var9.field1217 == 1338) && (!var9.field1240 || !method839(var9))) {
                int var10 = var9.field1243 + arg6;
                int var11 = var9.field1218 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1294 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1183 + var10;
                    int var17 = var9.field1220 + var11;
                    if (var9.field1294 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class109.field2063 == var9) {
                    class170.field3118 = true;
                    class84.field1600 = var10;
                    class7.field124 = var11;
                }
                if (!var9.field1240 || var12 < var14 && var13 < var15) {
                    if (var9.field1294 == 0) {
                        if (!var9.field1240 && method839(var9) && class186.field3408 != var9) {
                            continue;
                        }
                        if (var9.field1166 && class36.field608 >= var12 && class240.field4281 >= var13 && class36.field608 < var14 && class240.field4281 < var15) {
                            for (class225 var18 = (class225) class11.field170.method1017(73); var18 != null; var18 = (class225) class11.field170.method1016((byte) -31)) {
                                if (var18.field4086) {
                                    var18.method1063(70);
                                }
                            }
                            if (class122.field2317 == 0) {
                                class109.field2063 = null;
                                class144.field2730 = null;
                            }
                            class54.field901 = false;
                        }
                    }
                    if (var9.field1240) {
                        boolean var19;
                        if (class36.field608 >= var12 && class240.field4281 >= var13 && class36.field608 < var14 && class240.field4281 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class219.field3981 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class31.field489 == 1 && class84.field1598 >= var12 && class265.field4604 >= var13 && class84.field1598 < var14 && class265.field4604 < var15) {
                            var21 = true;
                        }
                        if (class130.field2531 > 0 && var9.field1284 != null) {
                            for (int var22 = 0; var22 < var9.field1284.length; var22++) {
                                for (int var23 = 0; var23 < class130.field2531; var23++) {
                                    int var24 = var9.field1284[var22] & 0xFF;
                                    if (class99.field1900[var23] == var24) {
                                        class169.method1260(-1, var22 + 1, var9.field1188, class170.field3120, 11901);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class94.method752(true, class265.field4604 - var11, class84.field1598 - var10, var9);
                        }
                        if (class109.field2063 != null && class109.field2063 != var9 && var19 && class120.method945(method826(var9), true)) {
                            class247.field4345 = var9;
                        }
                        if (class144.field2730 == var9) {
                            class193.field3523 = true;
                            class188.field3449 = var10;
                            class81.field1563 = var11;
                        }
                        if (var9.field1233 || var9.field1217 != 0) {
                            if (var19 && class264.field4591 != 0 && var9.field1168 != null) {
                                class225 var25 = new class225();
                                var25.field4086 = true;
                                var25.field4076 = var9;
                                var25.field4084 = class264.field4591;
                                var25.field4079 = var9.field1168;
                                class11.field170.method1018((byte) 89, var25);
                            }
                            if (class109.field2063 != null || class23.field380 != null || class130.field2530 || var9.field1217 != 1400 && class54.field901) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1217 != 0) {
                                if (var9.field1217 == 1337) {
                                    class137.field2646 = var9;
                                    class213.method1517((byte) 11, var9);
                                    continue;
                                }
                                if (var9.field1217 == 1338) {
                                    if (var21) {
                                        class170.method1265(class265.field4604 - var11, var9, class84.field1598 - var10, 81);
                                    }
                                    continue;
                                }
                                if (var9.field1217 == 1400) {
                                    class87.field1630 = var9;
                                    if (var21) {
                                        if (class217.field3942[82] && class99.field1920 > 0) {
                                            int var26 = (int) ((double) (class84.field1598 - var10 - var9.field1183 / 2) * 2.0D / (double) class21.field335);
                                            int var27 = (int) ((double) (class265.field4604 - var11 - var9.field1220 / 2) * 2.0D / (double) class21.field335);
                                            int var28 = class169.field3086 + var26;
                                            int var29 = class201.field3611 + var27;
                                            int var30 = class54.field892 + var28;
                                            int var31 = class58.field952 + class218.field3965 - var29 - 1;
                                            class120.method943(var31, 0, 29862, var30);
                                            class175.method1302(3);
                                            continue;
                                        }
                                        class54.field901 = true;
                                        class4.field88 = class36.field608;
                                        class204.field3699 = class240.field4281;
                                        class245.field4326 = class169.field3086;
                                        class190.field3473 = class201.field3611;
                                        continue;
                                    }
                                    if (var20 && class54.field901) {
                                        class10.method69(-1, (int) ((double) (class4.field88 - class36.field608) * 2.0D / (double) class219.field3985) + class245.field4326);
                                        class94.method749(false, (int) ((double) (class204.field3699 - class240.field4281) * 2.0D / (double) class219.field3985) + class190.field3473);
                                        continue;
                                    }
                                    class54.field901 = false;
                                    continue;
                                }
                                if (var9.field1217 == 1401) {
                                    if (var20) {
                                        class197.method1423(class240.field4281 - var11, class36.field608 - var10, var9.field1220, var9.field1183, -1);
                                    }
                                    continue;
                                }
                                if (var9.field1217 == 1402) {
                                    class213.method1517((byte) 11, var9);
                                    continue;
                                }
                                if (var9.field1217 == 1404) {
                                    class213.method1517((byte) 11, var9);
                                    continue;
                                }
                            }
                            if (!var9.field1186 && var21) {
                                var9.field1186 = true;
                                if (var9.field1195 != null) {
                                    class225 var32 = new class225();
                                    var32.field4086 = true;
                                    var32.field4076 = var9;
                                    var32.field4075 = class84.field1598 - var10;
                                    var32.field4084 = class265.field4604 - var11;
                                    var32.field4079 = var9.field1195;
                                    class11.field170.method1018((byte) 83, var32);
                                }
                            }
                            if (var9.field1186 && var20 && var9.field1235 != null) {
                                class225 var33 = new class225();
                                var33.field4086 = true;
                                var33.field4076 = var9;
                                var33.field4075 = class36.field608 - var10;
                                var33.field4084 = class240.field4281 - var11;
                                var33.field4079 = var9.field1235;
                                class11.field170.method1018((byte) 70, var33);
                            }
                            if (var9.field1186 && !var20) {
                                var9.field1186 = false;
                                if (var9.field1163 != null) {
                                    class225 var34 = new class225();
                                    var34.field4086 = true;
                                    var34.field4076 = var9;
                                    var34.field4075 = class36.field608 - var10;
                                    var34.field4084 = class240.field4281 - var11;
                                    var34.field4079 = var9.field1163;
                                    class223.field4058.method1018((byte) 103, var34);
                                }
                            }
                            if (var20 && var9.field1181 != null) {
                                class225 var35 = new class225();
                                var35.field4086 = true;
                                var35.field4076 = var9;
                                var35.field4075 = class36.field608 - var10;
                                var35.field4084 = class240.field4281 - var11;
                                var35.field4079 = var9.field1181;
                                class11.field170.method1018((byte) 76, var35);
                            }
                            if (!var9.field1266 && var19) {
                                var9.field1266 = true;
                                if (var9.field1194 != null) {
                                    class225 var36 = new class225();
                                    var36.field4086 = true;
                                    var36.field4076 = var9;
                                    var36.field4075 = class36.field608 - var10;
                                    var36.field4084 = class240.field4281 - var11;
                                    var36.field4079 = var9.field1194;
                                    class11.field170.method1018((byte) 113, var36);
                                }
                            }
                            if (var9.field1266 && var19 && var9.field1256 != null) {
                                class225 var37 = new class225();
                                var37.field4086 = true;
                                var37.field4076 = var9;
                                var37.field4075 = class36.field608 - var10;
                                var37.field4084 = class240.field4281 - var11;
                                var37.field4079 = var9.field1256;
                                class11.field170.method1018((byte) 84, var37);
                            }
                            if (var9.field1266 && !var19) {
                                var9.field1266 = false;
                                if (var9.field1323 != null) {
                                    class225 var38 = new class225();
                                    var38.field4086 = true;
                                    var38.field4076 = var9;
                                    var38.field4075 = class36.field608 - var10;
                                    var38.field4084 = class240.field4281 - var11;
                                    var38.field4079 = var9.field1323;
                                    class223.field4058.method1018((byte) 92, var38);
                                }
                            }
                            if (var9.field1297 != null) {
                                class225 var39 = new class225();
                                var39.field4076 = var9;
                                var39.field4079 = var9.field1297;
                                class214.field3897.method1018((byte) 75, var39);
                            }
                            if (var9.field1174 != null && class55.field915 > var9.field1203) {
                                if (var9.field1213 == null || class55.field915 - var9.field1203 > 32) {
                                    class225 var44 = new class225();
                                    var44.field4076 = var9;
                                    var44.field4079 = var9.field1174;
                                    class11.field170.method1018((byte) 110, var44);
                                } else {
                                    label543: for (int var40 = var9.field1203; var40 < class55.field915; var40++) {
                                        int var41 = class178.field3245[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field1213.length; var42++) {
                                            if (var9.field1213[var42] == var41) {
                                                class225 var43 = new class225();
                                                var43.field4076 = var9;
                                                var43.field4079 = var9.field1174;
                                                class11.field170.method1018((byte) 102, var43);
                                                break label543;
                                            }
                                        }
                                    }
                                }
                                var9.field1203 = class55.field915;
                            }
                            if (var9.field1237 != null && class106.field2031 > var9.field1248) {
                                if (var9.field1221 == null || class106.field2031 - var9.field1248 > 32) {
                                    class225 var49 = new class225();
                                    var49.field4076 = var9;
                                    var49.field4079 = var9.field1237;
                                    class11.field170.method1018((byte) 113, var49);
                                } else {
                                    label519: for (int var45 = var9.field1248; var45 < class106.field2031; var45++) {
                                        int var46 = class77.field1452[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field1221.length; var47++) {
                                            if (var9.field1221[var47] == var46) {
                                                class225 var48 = new class225();
                                                var48.field4076 = var9;
                                                var48.field4079 = var9.field1237;
                                                class11.field170.method1018((byte) 69, var48);
                                                break label519;
                                            }
                                        }
                                    }
                                }
                                var9.field1248 = class106.field2031;
                            }
                            if (var9.field1257 != null && class132.field2547 > var9.field1250) {
                                if (var9.field1161 == null || class132.field2547 - var9.field1250 > 32) {
                                    class225 var54 = new class225();
                                    var54.field4076 = var9;
                                    var54.field4079 = var9.field1257;
                                    class11.field170.method1018((byte) 65, var54);
                                } else {
                                    label495: for (int var50 = var9.field1250; var50 < class132.field2547; var50++) {
                                        int var51 = class107.field2047[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field1161.length; var52++) {
                                            if (var9.field1161[var52] == var51) {
                                                class225 var53 = new class225();
                                                var53.field4076 = var9;
                                                var53.field4079 = var9.field1257;
                                                class11.field170.method1018((byte) 91, var53);
                                                break label495;
                                            }
                                        }
                                    }
                                }
                                var9.field1250 = class132.field2547;
                            }
                            if (var9.field1269 != null && class147.field2787 > var9.field1253) {
                                if (var9.field1187 == null || class147.field2787 - var9.field1253 > 32) {
                                    class225 var59 = new class225();
                                    var59.field4076 = var9;
                                    var59.field4079 = var9.field1269;
                                    class11.field170.method1018((byte) 71, var59);
                                } else {
                                    label471: for (int var55 = var9.field1253; var55 < class147.field2787; var55++) {
                                        int var56 = class217.field3956[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field1187.length; var57++) {
                                            if (var9.field1187[var57] == var56) {
                                                class225 var58 = new class225();
                                                var58.field4076 = var9;
                                                var58.field4079 = var9.field1269;
                                                class11.field170.method1018((byte) 70, var58);
                                                break label471;
                                            }
                                        }
                                    }
                                }
                                var9.field1253 = class147.field2787;
                            }
                            if (var9.field1267 != null && class75.field1402 > var9.field1307) {
                                if (var9.field1315 == null || class75.field1402 - var9.field1307 > 32) {
                                    class225 var64 = new class225();
                                    var64.field4076 = var9;
                                    var64.field4079 = var9.field1267;
                                    class11.field170.method1018((byte) 94, var64);
                                } else {
                                    label447: for (int var60 = var9.field1307; var60 < class75.field1402; var60++) {
                                        int var61 = class37.field621[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field1315.length; var62++) {
                                            if (var9.field1315[var62] == var61) {
                                                class225 var63 = new class225();
                                                var63.field4076 = var9;
                                                var63.field4079 = var9.field1267;
                                                class11.field170.method1018((byte) 105, var63);
                                                break label447;
                                            }
                                        }
                                    }
                                }
                                var9.field1307 = class75.field1402;
                            }
                            if (class149.field2810 > var9.field1247 && var9.field1254 != null) {
                                class225 var65 = new class225();
                                var65.field4076 = var9;
                                var65.field4079 = var9.field1254;
                                class11.field170.method1018((byte) 79, var65);
                            }
                            if (class208.field3780 > var9.field1247 && var9.field1308 != null) {
                                class225 var66 = new class225();
                                var66.field4076 = var9;
                                var66.field4079 = var9.field1308;
                                class11.field170.method1018((byte) 82, var66);
                            }
                            if (class233.field4166 > var9.field1247 && var9.field1268 != null) {
                                class225 var67 = new class225();
                                var67.field4076 = var9;
                                var67.field4079 = var9.field1268;
                                class11.field170.method1018((byte) 90, var67);
                            }
                            if (class62.field1041 > var9.field1247 && var9.field1286 != null) {
                                class225 var68 = new class225();
                                var68.field4076 = var9;
                                var68.field4079 = var9.field1286;
                                class11.field170.method1018((byte) 98, var68);
                            }
                            if (class204.field3693 > var9.field1247 && var9.field1238 != null) {
                                class225 var69 = new class225();
                                var69.field4076 = var9;
                                var69.field4079 = var9.field1238;
                                class11.field170.method1018((byte) 83, var69);
                            }
                            var9.field1247 = class24.field384;
                            if (var9.field1277 != null) {
                                for (int var70 = 0; var70 < class130.field2531; var70++) {
                                    class225 var71 = new class225();
                                    var71.field4076 = var9;
                                    var71.field4083 = class99.field1900[var70];
                                    var71.field4078 = class137.field2642[var70];
                                    var71.field4079 = var9.field1277;
                                    class11.field170.method1018((byte) 74, var71);
                                }
                            }
                            if (class252.field4422 && var9.field1224 != null) {
                                class225 var72 = new class225();
                                var72.field4076 = var9;
                                var72.field4079 = var9.field1224;
                                class11.field170.method1018((byte) 96, var72);
                            }
                        }
                    }
                    if (!var9.field1240 && class109.field2063 == null && class23.field380 == null && !class130.field2530) {
                        if ((var9.field1165 >= 0 || var9.field1273 != 0) && class36.field608 >= var12 && class240.field4281 >= var13 && class36.field608 < var14 && class240.field4281 < var15) {
                            if (var9.field1165 >= 0) {
                                class186.field3408 = arg0[var9.field1165];
                            } else {
                                class186.field3408 = var9;
                            }
                        }
                        if (var9.field1294 == 8 && class36.field608 >= var12 && class240.field4281 >= var13 && class36.field608 < var14 && class240.field4281 < var15) {
                            class2.field38 = var9;
                        }
                        if (var9.field1160 > var9.field1220) {
                            class88.method688(class240.field4281, var9.field1160, var11, var9.field1183 + var10, var9.field1220, var9, class36.field608, -58);
                        }
                    }
                    if (var9.field1294 == 0) {
                        method834(arg0, var9.field1188, var12, var13, var14, var15, var10 - var9.field1287, var11 - var9.field1196);
                        if (var9.field1291 != null) {
                            method834(var9.field1291, var9.field1188, var12, var13, var14, var15, var10 - var9.field1287, var11 - var9.field1196);
                        }
                        class222 var73 = (class222) class92.field1739.method1743((long) var9.field1188, false);
                        if (var73 != null) {
                            class30.method183(var15, var11, var10, var14, var13, -125, var73.field4049, var12);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method835(byte arg0) {
        field1997++;
        method832(arg0 - 8665);
        class76.method560((byte) -117);
        class115.method914(false);
        class90.method696(-76);
        class130.method1031(1824902384);
        class135.method1057(arg0 ^ 0x3F);
        class81.method621(arg0 - 97);
        class255.method1726(4719);
        class22.method152((byte) -95);
        class221.method1566((byte) 123);
        class262.method1777(0);
        class17.method115((byte) -91);
        class2.method22(arg0 ^ 0x2FDB);
        class12.method77((byte) -81);
        class128.method1020(15288);
        class1.method4((byte) -121);
        class69.method476(13264);
        class126.method996(false);
        class258.method1739(32);
        class139.method1076(0);
        class27.method169(41);
        class55.method383(arg0 - 15205);
        class71.method524((byte) 89);
        class92.method734(-119);
        class62.method440(arg0 ^ 0x1E);
        class58.method407((byte) 107);
        class182.method1344(false);
        class18.method129(-112);
        class202.method1445((byte) 30);
        class144.method1092(arg0 - 9267);
        class250.method1711(1);
        class181.method1334(114);
        class222.method1573((byte) 50);
        class137.method1064((byte) -22);
        class67.method469((byte) 123);
        class172.method1284(arg0 - 204);
        class243.method1682((byte) -47);
        class183.method1351(16);
        class236.method1638((byte) -17);
        class162.method1182((byte) -87);
        class254.method1722(-81);
        class131.method1039(31);
        class229.method1597((byte) -75);
        class35.method250((byte) -43);
        class88.method687((byte) -33);
        class199.method1427(arg0 - 105);
        class123.method966((byte) -80);
        class41.method310();
        class99.method792(2000);
        class207.method1494();
        class9.method65((byte) 14);
        class237.method1642(16);
        class7.method53(71);
        class97.method765(arg0 ^ 0x55F0);
        class82.method662(0);
        class264.method1783(107);
        class231.method1609(true);
        class109.method877(true);
        class48.method342(arg0 - 3166);
        class94.method747((byte) -31);
        class79.method571();
        class39.method276(arg0 ^ 0xFFFFE4B8);
        class132.method1041(1);
        class201.method1437(arg0 ^ 0x79);
        class165.method1242(-2);
        class159.method1171(-89);
        class93.method742(0);
        class211.method1508((byte) 62);
        class125.method994(108);
        class29.method178(arg0 ^ 0x69);
        class47.method341();
        class152.method1126((byte) 13);
        class43.method327(98);
        class122.method953(arg0 - 105);
        class98.method787();
        class206.method1465();
        class217.method1544(true);
        class63.method445(true);
        class155.method1152((byte) -115);
        class84.method673((byte) 126);
        class151.method1123(122);
        class116.method928((byte) 112);
        class108.method870();
        class233.method1619(-79);
        class23.method155(true);
        class146.method1104(127);
        class46.method339((byte) -113);
        class190.method1396(arg0 + 11);
        class154.method1150();
        class252.method1716((byte) 113);
        class4.method36(67);
        class45.method335((byte) 7);
        class51.method359(true);
        class54.method380(arg0 ^ 0xFFFFFFD6);
        class36.method264((byte) -90);
        class37.method269(true);
        class95.method756(arg0 - 208);
        class171.method1276(10055);
        class187.method1379((byte) 2);
        class40.method279((byte) 70);
        class141.method1083(false);
        class111.method884((byte) 54);
        class215.method1530(15);
        class75.method547(true);
        class14.method94(0);
        class157.method1157((byte) 65);
        class234.method1626(true);
        class259.method1750((byte) -72);
        class239.method1655(1);
        class64.method450(2145254081);
        class226.method1581(arg0 - 196);
        class149.method1110(100);
        class178.method1312(true);
        class186.method1372(0);
        class225.method1580(true);
        class216.method1537(false);
        class245.method1690((byte) -122);
        class213.method1519(-614);
        class127.method1005((byte) 44);
        class113.method894((byte) 39);
        class197.method1421((byte) 109);
        class247.method1700((byte) -58);
        class38.method272(77);
        class114.method908(-77);
        class124.method990((byte) 68);
        class121.method948();
        class11.method73(36);
        class191.method1402(-1244216794);
        class142.method1085(-97);
        class212.method1514(125);
        class106.method860(true);
        class129.method1028(156);
        class74.method542(arg0);
        class3.method30(-1277866879);
        class30.method184(24640);
        class119.method938(-96);
        class5.method41(32252);
        class265.method1787((byte) 115);
        class205.method1458(true);
        class143.method1087(true);
        class107.method864((byte) 56);
        class220.method1559(-5152);
        class196.method1416((byte) -92);
        class57.method401((byte) 110);
        class72.method528((byte) 82);
        class56.method397(arg0 ^ 0x69);
        class134.method1055((byte) 47);
        class177.method1309(64);
        class77.method565(32767);
        class140.method1078(-73);
        class195.method1414();
        class138.method1071();
        class101.method812();
        class61.method416();
        class60.method411(258);
        class16.method109(false);
        class103.method821(86);
        class185.method1368();
        class150.method1118();
        class66.method458(-1746);
        class117.method933(arg0 ^ 0x67);
        class175.method1296(33);
        class160.method1173(63);
        class194.method1412(9);
        class176.method1303((byte) 116);
        class133.method1051((byte) -95);
        class85.method681(arg0 ^ 0xFFFFDB61);
        class96.method760(arg0 - 42);
        class20.method138((byte) -127);
        class10.method67((byte) 95);
        class13.method89((byte) -128);
        class170.method1263((byte) -35);
        class174.method1290(-11);
        class24.method158(64);
        class238.method1650((byte) -123);
        class145.method1100(24913);
        class244.method1683(123);
        class228.method1589(true);
        class257.method1738(arg0 - 16);
        class26.method166(-14508);
        class87.method686(-92);
        class65.method456(104);
        class52.method363((byte) -66);
        class209.method1501(30775);
        class253.method1720(arg0 - 789326);
        class59.method410(arg0 ^ 0x646F5D79);
        class256.method1733((byte) -69);
        class50.method356((byte) 12);
        class214.method1523(-3);
        class203.method1449(true);
        class210.method1503(false);
        class91.method702(false);
        class164.method1237((byte) 65);
        class102.method815(arg0 ^ 0xFFFFFFED);
        class110.method880((byte) -126);
        class192.method1407(24771);
        class240.method1664(arg0 - 39);
        class188.method1390(106);
        class100.method810((byte) 106);
        class73.method537(arg0 + 304);
        class33.method192((byte) -127);
        class260.method1760((byte) -128);
        class49.method353(-4010);
        class68.method472(2048);
        class153.method1134((byte) 95);
        class8.method62((byte) 69);
        class180.method1319((byte) 50);
        class235.method1636(-5987);
        class89.method691(-122);
        class204.method1453((byte) 123);
        class193.method1409(arg0 - 41);
        class169.method1261(31790);
        class161.method1179(41);
        class120.method946(arg0 ^ 0x16);
        class32.method190(79);
        class179.method1317(63);
        class31.method185((byte) -96);
        class223.method1575((byte) 107);
        class219.method1552(-26946);
        class21.method140((byte) 127);
        class147.method1105(1837977384);
        class246.method1695(17798);
        class6.method47(true);
        class19.method132((byte) 127);
        class28.method175((byte) 53);
        class136.method1058((byte) 118);
        if (class115.field2194) {
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method836(int arg0) {
        if (arg0 != 100) {
            method824((class69) null);
        }
        boolean var2 = class45.method333(true);
        if (!var2) {
            this.method833(9926);
        }
        field1993++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILpa;Lpa;)V")
    private static final void method837(int arg0, class123 arg1, class123 arg2) {
        if (arg0 != 100) {
            method832(-58);
        }
        class123.field2336 = arg1;
        field1986++;
        class133.field2574 = arg2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lpg;I)V")
    public static final void method838(class81 arg0, int arg1) {
        while (arg0.field1541 < arg0.field1562.length) {
            int var2 = 0;
            boolean var3 = false;
            int var4 = 0;
            if (arg0.method622(true) == 1) {
                var3 = true;
                var2 = arg0.method622(true);
                var4 = arg0.method622(true);
            }
            int var5 = arg0.method622(true);
            int var6 = arg0.method622(true);
            int var7 = var5 * 64 - class54.field892;
            int var8 = class218.field3965 - (var6 * 64 - class58.field952) - 1;
            if (var7 >= 0 && (var8 - 63) >= 0 && class124.field2395 > (var7 + 63) && var8 < class58.field952) {
                int var9 = var8 >> 6;
                int var10 = var7 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var3 || var2 * 8 <= var11 && var11 < var2 * 8 + 8 && (var4 * 8) <= var12 && (var4 * 8 + 8) > var12) {
                            int var13 = arg0.method622(true);
                            if (var13 != 0) {
                                if ((var13 & 0x1) == 1) {
                                    int var14 = arg0.method622(true);
                                    if (class55.field911[var10][var9] == null) {
                                        class55.field911[var10][var9] = new byte[4096];
                                    }
                                    class55.field911[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                }
                                if ((var13 & 0x2) == 2) {
                                    int var15 = arg0.method658(-121);
                                    if (class203.field3683[var10][var9] == null) {
                                        class203.field3683[var10][var9] = new short[4096];
                                    }
                                    class203.field3683[var10][var9][(63 - var12 << 6) + var11] = (short) var15;
                                }
                                if ((var13 & 0x4) == 4) {
                                    int var16 = (arg0.method622(true) & 0xFF << 16) + ((arg0.method622(true) & 0xFF) << 8) + (arg0.method622(true) & 0xFF);
                                    if (class75.field1409[var10][var9] == null) {
                                        class75.field1409[var10][var9] = new int[4096];
                                    }
                                    var16--;
                                    class35 var17 = class9.method64(false, var16);
                                    if (var17.field577 != null) {
                                        var17 = var17.method252(-32);
                                        if (var17 == null || var17.field580 == -1) {
                                            continue;
                                        }
                                    }
                                    class75.field1409[var10][var9][(63 - var12 << 6) + var11] = var17.field538 + 1;
                                    class31 var18 = new class31();
                                    var18.field479 = var7;
                                    var18.field483 = var8;
                                    var18.field490 = var17.field580;
                                    class40.field662.method1018((byte) 117, var18);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                    int var20 = arg0.method622(true);
                    if (var20 != 0) {
                        if ((var20 & 0x1) == 1) {
                            arg0.field1541++;
                        }
                        if ((var20 & 0x2) == 2) {
                            arg0.field1541 += 2;
                        }
                        if ((var20 & 0x4) == 4) {
                            arg0.field1541 += 3;
                        }
                    }
                }
            }
        }
        field1988++;
        if (arg1 != 1) {
            main((String[]) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lqh;)Z")
    public static final boolean method839(class69 arg0) {
        if (class127.field2470) {
            if (method826(arg0) != 0) {
                return false;
            }
            if (arg0.field1294 == 0) {
                return false;
            }
        }
        return arg0.field1312;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method840(int arg0) {
        field1996++;
        if (class262.field4583 == 1000 || arg0 != -3) {
            return;
        }
        boolean var2 = class82.method663(-12559);
        if (var2 && class123.field2360 && class59.field973 != null) {
            class59.field973.method441((byte) -117);
        }
        if (class99.field1857 && (class262.field4583 == 30 || class262.field4583 == 10)) {
            class183.method1352((byte) -21);
        }
        boolean var3 = false;
        if (class38.field637) {
            var3 = true;
            class38.field637 = false;
        }
        if (class262.field4583 == 0) {
            class20.method137(class87.field1621, (Color) null, var3, -152, class140.field2678);
        } else if (class262.field4583 == 5) {
            class97.method769(class216.field3932, (byte) 96);
        } else if (class262.field4583 == 10) {
            class182.method1339(arg0 ^ 0xFFFFCF49);
        } else if (class262.field4583 == 25 || class262.field4583 == 28) {
            if (class236.field4211 == 1) {
                if (class176.field3223 < class111.field2106) {
                    class176.field3223 = class111.field2106;
                }
                int var5 = (class176.field3223 - class111.field2106) * 50 / class176.field3223;
                class68.method473(false, class145.method1101(arg0 + 3, new class163[] { class191.field3492, class1.field16, class136.method1061(var5, (byte) 103), class155.field2890 }), (byte) -99);
            } else if (class236.field4211 == 2) {
                if (class231.field4154 > class92.field1698) {
                    class92.field1698 = class231.field4154;
                }
                int var4 = ((class92.field1698 - class231.field4154) * 50 / class92.field1698) + 50;
                class68.method473(false, class145.method1101(0, new class163[] { class191.field3492, class1.field16, class136.method1061(var4, (byte) 110), class155.field2890 }), (byte) -99);
            } else {
                class68.method473(false, class191.field3492, (byte) -99);
            }
        } else if (class262.field4583 == 30) {
            class62.method433(256);
        } else if (class262.field4583 == 40) {
            class68.method473(false, class145.method1101(0, new class163[] { class132.field2562, class187.field3433, class5.field96 }), (byte) -99);
        }
        if ((class262.field4583 == 30 || class262.field4583 == 10) && class129.field2515 == 0 && !var3) {
            try {
                Graphics var8 = class202.field3675.getGraphics();
                for (int var9 = 0; var9 < class52.field880; var9++) {
                    if (class91.field1671[var9]) {
                        class128.field2496.method694(class116.field2197[var9], (byte) 84, class82.field1590[var9], class236.field4216[var9], var8, class252.field4416[var9]);
                        class91.field1671[var9] = false;
                    }
                }
            } catch (Exception var12) {
                class202.field3675.repaint();
            }
        } else if (class262.field4583 != 0) {
            try {
                Graphics var6 = class202.field3675.getGraphics();
                class128.field2496.method693(0, var6, arg0 ^ 0xFFFFFF9C, 0);
                for (int var7 = 0; var7 < class52.field880; var7++) {
                    class91.field1671[var7] = false;
                }
            } catch (Exception var13) {
                class202.field3675.repaint();
            }
        }
        if (class40.field669) {
            class149.method1111(5);
        }
        if (class250.field4402 != null && class236.field4213 != 0) {
            Point var10 = class202.field3675.getLocationOnScreen();
            Dimension var11 = class202.field3675.getSize();
            class250.field4402.set_position(var10.x, var10.y - class236.field4213, var11.width, class236.field4213);
        }
    }
}
