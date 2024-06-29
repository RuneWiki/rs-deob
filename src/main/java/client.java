import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class488 {

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
    public static int field4512;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "Ljava/lang/Class;")
    public static Class field4511;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[[B")
    public static byte[][] field4492;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "[[B")
    public static byte[][] field4500;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method2028(int arg0, int arg1) {
        class778.field10682 = arg1;
        class65.field783.field8473++;
        class65.field783.field8472 = arg0;
        class35.field473 = null;
        field4498++;
        class132.field1994 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method2029(byte arg0) {
        if (class274.field3955) {
            class787.method4312(-30475);
        }
        field4493++;
        class544.method3251((byte) -126);
        if (class37.field491 != null) {
            class37.field491.method533(113);
        }
        if (class161.field2561 != null) {
            class432.method2587(class161.field2561, -4286143, class519.field7328);
            class161.field2561 = null;
        }
        if (class527.field7529 != null) {
            class527.field7529.method612((byte) 103);
            class527.field7529 = null;
        }
        class478.method2853(2);
        class65.field783.method3503(110);
        class785.field10777.method674(2);
        if (class173.field2683 != null) {
            class173.field2683.method2934(2004);
            class173.field2683 = null;
        }
        try {
            class582.field8222.method3631(118);
            for (int var2 = 0; var2 < 37; var2++) {
                class465.field6548[var2].method3631(124);
            }
            class305.field4396.method3631(110);
            class78.field886.method3631(101);
            class633.method3623((byte) 119);
        } catch (Exception var3) {
        }
        if (arg0 < 19) {
            method2040(-119);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method2030(int arg0) {
        field4497++;
        if (class266.field3873 == 14) {
            return;
        }
        long var2 = class538.method3233(true) / 1000000L - class762.field10499;
        class762.field10499 = class538.method3233(true) / 1000000L;
        boolean var4 = class571.method3363((byte) -122);
        if (var4 && class169.field2642 && class16.field299 != null) {
            class16.field299.method2197(false);
        }
        if (class656.method3753(class266.field3873, 79)) {
            if (class787.field10813 != 0L && class459.method2731(127) > class787.field10813) {
                class666.method3797(class462.field6523, -96, class204.field3168, false, class592.method3442((byte) -112));
            } else if (!class37.field491.method462() && class629.field8822) {
                class467.method2789(124);
            }
        }
        if (class161.field2561 == null) {
            Container var5;
            if (class384.field5278 != null) {
                var5 = class384.field5278;
            } else if (class319.field4527 == null) {
                var5 = class742.field10293;
            } else {
                var5 = class319.field4527;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class384.field5278 == var5) {
                Insets var8 = class384.field5278.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class179.field2787 != var6 || class63.field759 != var7 || class446.field6088) {
                if (class37.field491 == null || class37.field491.method494()) {
                    class606.method3517(31719);
                } else {
                    class179.field2787 = var6;
                    class63.field759 = var7;
                }
                class787.field10813 = class459.method2731(121) + 500L;
                class446.field6088 = false;
            }
        }
        if (class161.field2561 != null && !class319.field4529 && class656.method3753(class266.field3873, arg0 ^ 0x30)) {
            class666.method3797(-1, -112, -1, false, class21.field353.field10097.method3352(-83));
        }
        boolean var9 = false;
        if (class599.field8412) {
            class599.field8412 = false;
            var9 = true;
        }
        if (var9) {
            class33.method270(arg0 - 5);
        }
        if (class37.field491 != null && class37.field491.method462() || class592.method3442((byte) -82) != 1) {
            class351.method2224((byte) 119);
        }
        if (class673.method3827(class266.field3873, -28639)) {
            class416.method2534(93, var9);
        } else if (class80.method617(-92, class266.field3873)) {
            class767.method4237((byte) -125);
        } else if (class345.method2189(111, class266.field3873)) {
            class767.method4237((byte) -14);
        } else if (class36.method284(arg0 + 79, class266.field3873)) {
            if (class339.field4746 == 1) {
                if (class777.field10675 < class268.field3902) {
                    class777.field10675 = class268.field3902;
                }
                int var10 = (class777.field10675 - class268.field3902) * 50 / class777.field10675;
                class66.method569(arg0 - 91, class449.field6148, true, class37.field491, class620.field8673.method3580(class140.field2081, 12) + "<br>(" + var10 + "%)", class368.field5111);
            } else if (class339.field4746 == 2) {
                if (class48.field613 > class133.field2009) {
                    class133.field2009 = class48.field613;
                }
                int var11 = ((class133.field2009 - class48.field613) * 50 / class133.field2009) + 50;
                class66.method569(arg0 ^ 0xFFFFFFAC, class449.field6148, true, class37.field491, class620.field8673.method3580(class140.field2081, 12) + "<br>(" + var11 + "%)", class368.field5111);
            } else {
                class66.method569(arg0 - 90, class449.field6148, true, class37.field491, class620.field8673.method3580(class140.field2081, 12), class368.field5111);
            }
        } else if (class266.field3873 == 10) {
            class661.method3772((byte) 96, var2);
        } else if (class266.field3873 == 13) {
            class66.method569(-120, class449.field6148, false, class37.field491, class620.field8675.method3580(class140.field2081, arg0 + 7) + "<br>" + class620.field8676.method3580(class140.field2081, 12), class368.field5111);
        }
        if (arg0 != 5) {
            field4492 = null;
        }
        if (class42.field545 == 3) {
            for (int var12 = 0; var12 < class470.field6596; var12++) {
                Rectangle var13 = class663.field9227[var12];
                if (class466.field6553[var12]) {
                    class37.field491.method540(var13.height, var13.x, 25951, -65281, var13.y, var13.width);
                } else if (class744.field10313[var12]) {
                    class37.field491.method540(var13.height, var13.x, 25951, -65536, var13.y, var13.width);
                } else {
                    class37.field491.method540(var13.height, var13.x, 25951, -16711936, var13.y, var13.width);
                }
            }
        }
        if (class474.method2818((byte) -122)) {
            class238.method1594(class37.field491, true);
        }
        if (class519.field7328.field6692 && class656.method3753(class266.field3873, 54) && class42.field545 == 0 && class592.method3442((byte) -117) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class470.field6596; var17++) {
                if (class744.field10313[var17]) {
                    class744.field10313[var17] = false;
                    class335.field4719[var16++] = class663.field9227[var17];
                }
            }
            try {
                if (class195.field2997) {
                    class680.method3855(var16, class335.field4719, -27);
                } else {
                    class37.field491.method543(class335.field4719, false, var16);
                }
            } catch (class736 var19) {
            }
        } else if (!class673.method3827(class266.field3873, -28639)) {
            for (int var14 = 0; var14 < class470.field6596; var14++) {
                class744.field10313[var14] = false;
            }
            try {
                if (class195.field2997) {
                    class762.method4228(arg0 ^ 0x50);
                } else {
                    class37.field491.method508(125);
                }
            } catch (class736 var20) {
                class678.method3848(var20.getMessage() + " (Recovered) " + this.method2039(1001), var20, false);
                class9.method61(0, false, (byte) -40);
            }
        }
        class395.method2440((byte) -38);
        int var18 = class21.field353.field10059.method4252(-111);
        if (var18 == 0) {
            class107.method828(15L, (byte) 88);
        } else if (var18 == 1) {
            class107.method828(10L, (byte) 57);
        } else if (var18 == 2) {
            class107.method828(5L, (byte) 35);
        } else if (var18 == 3) {
            class107.method828(2L, (byte) 99);
        }
        if (class159.field2535) {
            class377.method2335(-119);
        }
        if (class21.field353.field10085.method156(-93) == 1 && class266.field3873 == 3 && class371.field5137 != -1) {
            class21.field353.method4080(true, class21.field353.field10085, 0);
            class580.method3397((byte) 13);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2031() {
        int var0 = class514.field7278;
        int[] var1 = class522.field7381;
        int var2 = class21.field353.field10104.method3376(-73);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class702 var14 = class767.field10560[var1[var4]];
            if (!var14.method3974(255)) {
                var14.field4610 = -1;
            } else if (var14.field9770) {
                var14.field4610 = -1;
            } else {
                var14.method913(-13764);
                if (var14.field9368 >= 0 && var14.field9364 >= 0 && var14.field9371 < class768.field10571 && var14.field9360 < class350.field4898) {
                    var14.field9751 = var14.field4615 ? var3 : false;
                    if (class210.field3250 == var14) {
                        var14.field4610 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field4577) {
                            var15++;
                        }
                        if (var14.field4651 > class192.field2961) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method2102(true) << 2);
                        if (var14.field9767 || var14.field9777) {
                            var16 += 512;
                        } else {
                            if (class86.field950 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field4610 = var16 + 1;
                    }
                } else {
                    var14.field4610 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class235.field3545; var5++) {
            class665 var11 = ((class205) class645.field9014.method2242((long) class216.field3356[var5], -1)).field3181;
            if (var11.method3787(255) && var11.field9240.method844(class537.field7727, (byte) 0)) {
                var11.method913(-13764);
                if (var11.field9368 >= 0 && var11.field9364 >= 0 && var11.field9371 < class768.field10571 && var11.field9360 < class350.field4898) {
                    int var12 = 0;
                    if (!var11.field4577) {
                        var12++;
                    }
                    if (var11.field4651 > class192.field2961) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method2102(true) << 2);
                    if (class86.field950 == 0) {
                        if (var11.field9240.field1685) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class86.field950 == 1) {
                        if (var11.field9240.field1685) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field9240.field1644) {
                        var13 += 1024;
                    } else if (!var11.field9240.field1617) {
                        var13 += 256;
                    }
                    var11.field4610 = var13 + 1;
                } else {
                    var11.field4610 = -1;
                }
            } else {
                var11.field4610 = -1;
            }
        }
        for (int var6 = 0; var6 < class693.field9665.length; var6++) {
            class589 var7 = class693.field9665[var6];
            if (var7 != null) {
                if (var7.field8302 == 1) {
                    class205 var8 = (class205) class645.field9014.method2242((long) var7.field8307, -1);
                    if (var8 != null) {
                        class665 var9 = var8.field3181;
                        if (var9.field4610 >= 0) {
                            var9.field4610 += 2048;
                        }
                    }
                } else if (var7.field8302 == 10) {
                    class702 var10 = class767.field10560[var7.field8307];
                    if (var10 != null && class210.field3250 != var10 && var10.field4610 >= 0) {
                        var10.field4610 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2032() {
        for (int var0 = 0; var0 < class768.field10571; var0++) {
            int[] var1 = class663.field9226[var0];
            for (int var2 = 0; var2 < class350.field4898; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrr;[[BB)V")
    public static final void method2033(class381 arg0, byte[][] arg1, byte arg2) {
        field4506++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field7824; var4++) {
            class265.method1722(16033);
            for (int var9 = 0; var9 < class768.field10571 >> 3; var9++) {
                for (int var10 = 0; var10 < (class350.field4898 >> 3); var10++) {
                    int var11 = class650.field9080[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (var11 & 0x3896662) >> 24;
                        if (!arg0.field7823 || var12 == 0) {
                            int var13 = (var11 & 0x6) >> 1;
                            int var14 = (var11 & 0xFFF7B7) >> 14;
                            int var15 = (var11 & 0x3FFB) >> 3;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class551.field7919.length; var17++) {
                                if (class551.field7919[var17] == var16 && arg1[var17] != null) {
                                    class494 var18 = new class494(arg1[var17]);
                                    arg0.method3260(var15, var13, var14, 95, var4, var12, var9 * 8, var18, var10 * 8, class346.field4838);
                                    arg0.method2374(var18, var9 * 8, var15, var10 * 8, var13, -116, var3[0] == -1 ? var3 : null, var4, class37.field491, var14, var12);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 < 26) {
            field4500 = null;
        }
        for (int var5 = 0; var5 < arg0.field7824; var5++) {
            class265.method1722(16033);
            for (int var6 = 0; var6 < class768.field10571 >> 3; var6++) {
                for (int var7 = 0; var7 < class350.field4898 >> 3; var7++) {
                    int var8 = class650.field9080[var5][var6][var7];
                    if (var8 == -1) {
                        arg0.method3263((byte) -88, var6 * 8, 8, 8, var7 * 8, var5);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class416.field5698 = class107.field1602.method1937(var3[2], 97, var3[1], var3[3], var3[0], class316.field4491);
            class212.field3296 = var3[4];
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lmea;)Z")
    public static final boolean method2034(class451 arg0) {
        if (class81.field901) {
            if (method2046(arg0).field441 != 0) {
                return false;
            }
            if (arg0.field6210 == 0) {
                return false;
            }
        }
        return arg0.field6255;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method2035(boolean arg0) {
        field4507++;
        method2048(116);
        class600.method3493((byte) 120);
        class313.method2007(31529);
        class620.method3579(3825);
        class337.method2141(10520);
        class597.method3485((byte) 67);
        class228.method1552((byte) -35);
        class30.method253(2);
        class599.method3489((byte) -30);
        class178.method1284(114);
        class674.method3832((byte) -127);
        class211.method1450(125);
        class643.method3663((byte) 87);
        class545.method3257(0);
        class107.method829(true);
        class577.method3389(-25713);
        class353.method2246(-2534);
        class488.method2913(1);
        class280.method1819((byte) -120);
        class149.method1038(-102);
        class252.method1655((byte) 73);
        class65.method482((byte) 3);
        class12.method130(119);
        class589.method3434(109);
        class743.method4140((byte) 3);
        class266.method1734(false);
        class686.method3874(true);
        class605.method3505((byte) 12);
        class537.method3226(-5333);
        class596.method3478((byte) 126);
        class791.method4338(0);
        class635.method3627(65280);
        class126.method952((byte) 124);
        class652.method3731(arg0);
        class265.method1723((byte) 98);
        class543.method3245(false);
        class105.method737((byte) 120);
        class695.method3922(11);
        class163.method1222((byte) -55);
        class305.method1976(5);
        class5.method30((byte) 110);
        class694.method3917((byte) 116);
        class165.method1236(36);
        class395.method2445(64);
        class257.method1682((byte) 34);
        class739.method4113(-16977);
        class588.method3428((byte) -128);
        class436.method2610((byte) -67);
        class384.method2381(arg0);
        class624.method3592(-1);
        class780.method4287(!arg0);
        class3.method24(0);
        class401.method2472((byte) -123);
        class666.method3793((byte) 30);
        class205.method1429((byte) 97);
        class80.method613(-6);
        class494.method2968(8250);
        class377.method2337(12);
        class21.method221(-118);
        class493.method2935((byte) -42);
        class768.method4239(-65);
        class274.method1764(0);
        class758.method4213(-1);
        class519.method3126(-116);
        class343.method2171(28);
        class451.method2692(1);
        class293.method1901((byte) -106);
        class702.method3971(1);
        class387.method2414(0);
        class342.method2165((byte) 16);
        class276.method1789(true);
        class344.method2183((byte) 125);
        class269.method1743(2);
        class312.method1996(-1);
        class330.method2111(arg0);
        class46.method335(20397);
        class37.method288((byte) -113);
        class744.method4145((byte) 34);
        class33.method269(-41);
        class691.method3904(127);
        class584.method3414((byte) -66);
        class432.method2589(3786);
        class571.method3360((byte) -77);
        class523.method3150(false);
        class745.method4152(90);
        class459.method2730(-126);
        class308.method1988((byte) -71);
        class204.method1425(0);
        class243.method1617((byte) 98);
        class63.method418(-121);
        class683.method3859((byte) 99);
        class142.method1018((byte) 124);
        class792.method4363(-15130);
        class376.method2327(16384);
        class147.method1034(8);
        class190.method1331((byte) -72);
        class148.method1035(arg0);
        class220.method1511(arg0);
        class108.method832((byte) -43);
        class29.method251(-7628);
        class453.method2705(!arg0);
        class282.method1833(false);
        class100.method714(568);
        class547.method3270(-114);
        class520.method3129(0);
        class110.method839(!arg0);
        class688.method3879((byte) 107);
        class689.method3891(-19592);
        class66.method562((byte) 67);
        class23.method231(5);
        class474.method2817((byte) -15);
        class245.method1624(2);
        class392.method2425(0);
        class41.method313((byte) 33);
        class254.method1661(Integer.MAX_VALUE);
        class206.method1430((byte) 44);
        class11.method127(21963);
        class562.method3317((byte) 124);
        class575.method3377(false);
        class710.method4003(17);
        class726.method4065(118);
        class740.method4119(-78);
        class242.method1615((byte) 54);
        class656.method3751(-5);
        class164.method1227((byte) -107);
        class514.method3100((byte) 102);
        class145.method1028(106);
        class238.method1589((byte) -128);
        class249.method1643(3);
        class96.method700((byte) 63);
        class58.method398((byte) -105);
        class181.method1293((byte) 85);
        class36.method285(8);
        class16.method155(1);
        class486.method2898(1);
        class260.method1692(true);
        class56.method390(true);
        class491.method2927(20488);
        class736.method4100(112);
        class511.method3091(10);
        class434.method2598(100);
        class6.method38(0);
        class296.method1926(2);
        class154.method1062(86);
        class468.method2793((byte) 123);
        class672.method3823((byte) -86);
        class421.method2545((byte) -39);
        class462.method2758(-1);
        class346.method2198(13288);
        class751.method4178(!arg0);
        class481.method2863(-86);
        class379.method2345();
        class27.method242(false);
        class174.method1263((byte) -73);
        class202.method1412(15979);
        class754.method4195(37);
        class460.method2732((byte) -57);
        class352.method2232(-28435);
        class648.method3715(2835);
        class127.method953(-21830);
        class338.method2143(13052);
        class53.method368(19);
        class724.method4061(21);
        class55.method385((byte) -117);
        class273.method1758((byte) -21);
        class250.method1645((byte) 99);
        class195.method1353(0);
        class306.method1984(true);
        class233.method1564(31936);
        class262.method1703(127);
        class143.method1019(106);
        class117.method889();
        class521.method3132(arg0);
        class541.method3241((byte) 50);
        class133.method986(24139);
        class366.method2294((byte) -33);
        class339.method2147(-5850);
        class465.method2784(false);
        class97.method705(0);
        class463.method2780(false);
        class7.method48(false);
        class318.method2061(972836960);
        class397.method2447(-32842);
        class495.method3009(3512);
        class281.method1824(72);
        class756.method4198(0);
        class593.method3459();
        class572.method3365(-110);
        class551.method3288((byte) -117);
        class527.method3177((byte) -126);
        class443.method2640((byte) -123);
        class226.method1540((byte) -102);
        class492.method2929((byte) -117);
        class413.method2503(-1);
        class660.method3771();
        class518.method3120(true);
        class633.method3622((byte) 119);
        class483.method2887(2099177217);
        class673.method3824((byte) 127);
        class166.method1239(false);
        class581.method3403(-93);
        class284.method1847(-7848);
        class84.method639(arg0);
        class788.method4318(-18);
        class456.method2723(-18);
        class399.method2461(25915);
        class617.method3567(113);
        class613.method3558(-25696);
        class48.method343(54);
        class194.method1352(false);
        class319.method2063((byte) 121);
        class364.method2291();
        class88.method658((byte) -61);
        class378.method2341((byte) 119);
        class727.method4070(103);
        class134.method990();
        class578.method3391(13101);
        class414.method2516(false);
        class278.method1809((byte) 110);
        class591.method3440((byte) 11);
        class787.method4311(-2008);
        class210.method1447((byte) -59);
        class513.method3096(1);
        class175.method1269();
        class268.method1742(false);
        class642.method3659(-105);
        class411.method2496((byte) -17);
        class374.method2318((byte) 0);
        class510.method3083(-21084);
        class128.method955((byte) 22);
        class641.method3658(false);
        class699.method3934(125);
        class546.method3269((byte) 125);
        class784.method4297(127);
        class645.method3703(64);
        class576.method3385(-1);
        class398.method2455((byte) 112);
        class720.method4030(-98);
        class741.method4122(-1);
        class132.method974(1);
        class565.method3332((byte) 106);
        class721.method4034(false);
        class680.method3853(-1);
        class651.method3729(79);
        class418.method2538(44);
        class712.method4006(77);
        class506.method3051(-89);
        class602.method3498(0);
        class554.method3293((byte) -119);
        class300.method1946(8);
        class574.method3370(-124);
        class360.method2273((byte) 80);
        class120.method908(0);
        class485.method2888(118);
        class544.method3250(25216);
        class561.method3312((byte) -99);
        class81.method621(-25604);
        class309.method1991(-43);
        class310.method1993(-100);
        class256.method1664(7);
        class716.method4019((byte) 61);
        class604.method3501(false);
        class193.method1348((byte) 32);
        class176.method1280(1);
        class785.method4303(2);
        class216.method1480(121);
        class671.method3822(107);
        class715.method4015(18383);
        class291.method1867((byte) -124);
        class438.method2616(-20120);
        class370.method2307(-3549);
        class359.method2268(!arg0);
        class445.method2654(true);
        class345.method2188(896);
        class718.method4026(6);
        class668.method3799(-126);
        class606.method3519((byte) -67);
        class457.method2726((byte) -70);
        class713.method4009(53);
        class253.method1657(-22860);
        class449.method2677(0);
        class629.method3604((byte) -59);
        class287.method1855(1377);
        class687.method3876(1);
        class730.method4085((byte) 121);
        class393.method2432((byte) 64);
        class467.method2792(-45);
        class335.method2128(arg0);
        class759.method4219((byte) -110);
        class317.method2058(16384);
        class659.method3760(-79);
        class728.method4071((byte) -61);
        class622.method3588(0);
        class777.method4276(122);
        class698.method3931((byte) 0);
        class333.method2120(125);
        class357.method2261(-21697);
        class447.method2667(-22866);
        class270.method1748(-127);
        class85.method645(-786311592);
        class4.method27(-64);
        class264.method1712();
        class124.method940(-108);
        class277.method1807((byte) -63);
        class89.method665(-30548);
        class115.method862(65);
        class198.method1367(-1386);
        class442.method2633(0);
        class658.method3757((byte) 52);
        class530.method3202(-1);
        class490.method2920((byte) -106);
        class489.method2919(61);
        class261.method1697(38400);
        class340.method2154();
        class207.method1437((byte) 113);
        class714.method4010((byte) 82);
        class570.method3357();
        class499.method3026();
        class480.method2857(3);
        class356.method2260(1339);
        class441.method2631();
        class314.method2013(12);
        class60.method405((byte) -40);
        class585.method3416(true);
        class325.method2086(121);
        class410.method2494(-98);
        class208.method1439((byte) -57);
        class719.method4028(12);
        class661.method3774(arg0);
        class295.method1922(1);
        class407.method2490((byte) -36);
        class764.method4232((byte) -91);
        class476.method2828((byte) 73);
        class159.method1206((byte) 85);
        class603.method3499((byte) 94);
        class234.method1566(false);
        class678.method3847((byte) 121);
        class322.method2075();
        class448.method2668(false);
        class409.method2491(25);
        class354.method2254(5623);
        class559.method3308(13467);
        class774.method4262(-13062);
        class109.method833((byte) 47);
        class569.method3353(14);
        class17.method161((byte) -111);
        class235.method1579(14);
        class248.method1634((byte) -86);
        class650.method3722(14);
        class304.method1973(-1);
        class371.method2309((byte) 41);
        class610.method3547((byte) -15);
        class123.method934(arg0);
        class197.method1364(-25267);
        class67.method575(4);
        class22.method228(21);
        class227.method1549((byte) 70);
        class781.method4290(-19341);
        class685.method3864(96);
        class106.method761(15);
        class415.method2524(!arg0);
        class440.method2623(0);
        class161.method1214(840653224);
        class630.method3612(!arg0);
        class199.method1370(1);
        class54.method377(-1721922967);
        class188.method1309((byte) -118);
        class168.method1249(-24659);
        class189.method1323(-32289784);
        class425.method2571(127);
        class156.method1120(8);
        class631.method3618((byte) 125);
        class34.method279((byte) 113);
        class240.method1599(128);
        class385.method2397((byte) -127);
        class329.method2091(76);
        class556.method3298((byte) -22);
        class28.method246(true);
        class267.method1738(-118);
        class503.method3036(26412);
        class618.method3571((byte) -90);
        class525.method3173(115);
        class288.method1857(108);
        class735.method4097(5907);
        class446.method2662(16711935);
        class152.method1046(127);
        class529.method3201((byte) -108);
        class169.method1252((byte) 120);
        class136.method1000();
        class646.method3707(1);
        class15.method153(127);
        class479.method2856(-18588);
        class473.method2812(1);
        class289.method1859((byte) 100);
        class732.method4093((byte) 99);
        class138.method1004(-124);
        class437.method2613(17777);
        class404.method2484(11);
        class42.method318(-9840);
        class679.method3850(-127);
        class111.method849(-1);
        class153.method1050(1);
        class258.method1683(0);
        class8.method57(-128);
        class103.method727(123);
        class31.method259(0);
        class619.method3574(0);
        class237.method1586(!arg0);
        class703.method3983(!arg0);
        class454.method2709((byte) -110);
        class9.method60((byte) 125);
        class772.method4256(1297447720);
        class742.method4130(5971);
        class225.method1538((byte) -56);
        class640.method3653((byte) -87);
        class433.method2593((byte) -124);
        class723.method4058(-14604);
        class563.method3321(91);
        class420.method2544();
        class515.method3105(1873296578);
        class386.method2412((byte) -79);
        class62.method415(-1);
        class351.method2222((byte) -87);
        class582.method3409(arg0);
        class738.method4109((byte) 122);
        class626.method3600(-127);
        class140.method1011(31882);
        class532.method3209((byte) 76);
        class516.method3110(13492);
        class125.method942(-1);
        class531.method3207(-18861);
        class653.method3745(53);
        class209.method1445(-128);
        class191.method1336((byte) 77);
        class251.method1652(128);
        class45.method327((byte) -53);
        class466.method2788((byte) 111);
        class444.method2644((byte) -124);
        class78.method609((byte) -79);
        class416.method2531(95);
        class747.method4160(true);
        class94.method692(-105);
        class586.method3422(-127);
        class167.method1241(2);
        class470.method2796((byte) -108);
        class180.method1291(77);
        class186.method1308((byte) -91);
        class564.method3325(117);
        class95.method693(0);
        class347.method2203(false);
        class428.method2577(arg0);
        class40.method303(10684);
        class286.method1852(0);
        class394.method2435(-2);
        class502.method3033(15);
        class119.method898(true);
        class663.method3781((byte) 127);
        class598.method3488(-19372);
        class522.method3148((byte) 115);
        class776.method4268((byte) 126);
        class402.method2475(85);
        class170.method1257((byte) 77);
        class259.method1687((byte) 49);
        class439.method2620(-126);
        class471.method2801(80);
        class528.method3189((byte) 33);
        class400.method2463((byte) 60);
        class534.method3219((byte) 75);
        class139.method1009(0);
        class765.method4234(-115);
        class368.method2297((byte) 84);
        class549.method3277(-69);
        class239.method1595(-110);
        class129.method965((byte) 124);
        class450.method2679((byte) 76);
        class422.method2552(0);
        class315.method2017(3317);
        class789.method4319((byte) -121);
        class505.method3048(true);
        class57.method391((byte) -52);
        class171.method1258(1);
        class625.method3595(10286);
        class116.method867(-6999);
        class752.method4186(-89);
        class380.method2364(4);
        class173.method1262(-23102);
        class614.method3564((byte) 100);
        class757.method4203(9422);
        class75.method594(-6242);
        class212.method1459(83);
        class647.method3709(125);
        class20.method216(-21585);
        class184.method1303(81);
        class229.method1554(119);
        class430.method2584(-6982);
        class244.method1620((byte) 127);
        class35.method283(false);
        class290.method1863((byte) 8);
        class87.method655((byte) 49);
        class301.method1950((byte) -120);
        class70.method581(true);
        class348.method2206((byte) 62);
        class753.method4193(18749);
        class746.method4157(1);
        class316.method2027(-96);
        class255.method1663((byte) 30);
        class47.method337(6);
        class760.method4226(102);
        class762.method4229((byte) 22);
        class639.method3652((byte) 90);
        class98.method706(16777215);
        class767.method4238(-22794);
        class737.method4105((byte) 77);
        class14.method151((byte) 73);
        class182.method1296(255);
        class375.method2326(1);
        class693.method3908((byte) -113);
        class217.method1492(arg0);
        class601.method3497((byte) 122);
        class749.method4176(4);
        class104.method729(16671);
        class361.method2275(0);
        class763.method4230(-20);
        class550.method3282((byte) -119);
        class299.method1941((byte) -122);
        class2.method16(23338);
        class263.method1707((byte) 50);
        class92.method683(64);
        class458.method2729((byte) 77);
        class452.method2702(17942);
        class670.method3808(255);
        class779.method4284((byte) 123);
        class157.method1200(40000);
        class391.method2422(arg0);
        class500.method3031((byte) -124);
        class704.method3984((byte) 102);
        class590.method3436(-87);
        class621.method3584(false);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2036() {
        class367.field5103 = 0;
        for (int var0 = 0; var0 < class235.field3545; var0++) {
            class665 var1 = ((class205) class645.field9014.method2242((long) class216.field3356[var0], -1)).field3181;
            if (var1.field4577 && var1.method2101(-96) != -1) {
                int var2 = (var1.method2102(true) - 1) * 256 + 252;
                int var3 = var1.field5742 - var2 >> 9;
                int var4 = var1.field5746 - var2 >> 9;
                class330 var5 = class70.method580((byte) -107, var4, var1.field5755, var3);
                if (var5 != null) {
                    int var6 = var5.field4640;
                    if (var5 instanceof class665) {
                        var6 += 2048;
                    }
                    if (var5.field4588 == 0 && var5.method2101(-117) != -1) {
                        class181.field2807[class367.field5103] = var6;
                        class738.field10182[class367.field5103] = var6;
                        class367.field5103++;
                        var5.field4588++;
                    }
                    class181.field2807[class367.field5103] = var6;
                    class738.field10182[class367.field5103] = var1.field4640 + 2048;
                    class367.field5103++;
                    var5.field4588++;
                }
            }
        }
        class710.method4000(0, -50, class738.field10182, class367.field5103 - 1, class181.field2807);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lmea;IIIIIIIIIII)V")
    public static final void method2037(class451[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label824: for (int var12 = 0; var12 < arg0.length; var12++) {
            class451 var13 = arg0[var12];
            if (var13 != null && var13.field6233 == arg1) {
                int var14 = var13.field6333 + arg6;
                int var15 = var13.field6242 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field6210 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field6290 + var14;
                    int var21 = var13.field6288 + var15;
                    if (var13.field6210 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field6210 == 0 || var13.field6313 || method2046(var13).field441 != 0 || class226.field3479 == var13 || class6.field58 == var13.field6271 || class683.field9466 == var13.field6271) {
                    if (!method2034(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class195.field2997) {
                            var22 = class493.method2933((byte) -59);
                            var23 = class242.method1613(8220);
                        }
                        if (class265.field3871 == var13 && class188.method1316(-18441, class265.field3871) != null) {
                            class559.field7950 = true;
                            class343.field4790 = var14;
                            class41.field539 = var15;
                        }
                        if (var13.field6256 || var16 < var18 && var17 < var19) {
                            if (var13.field6212 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class166 var24 = (class166) class208.field3220.method1731((byte) -123); var24 != null; var24 = (class166) class208.field3220.method1724(0)) {
                                    if (var24.field2615) {
                                        var24.method3387((byte) -56);
                                        var24.field2627.field6259 = false;
                                    }
                                }
                                if (class720.field9972 == 0) {
                                    class265.field3871 = null;
                                    class226.field3479 = null;
                                }
                                class651.field9094 = 0;
                                class467.field6578 = false;
                                class178.field2783 = false;
                                if (!class626.field8777) {
                                    class344.method2177(false);
                                }
                            }
                            boolean var25;
                            if (class152.field2154.method2646(9) + var22 >= var16 && class152.field2154.method2650((byte) -90) + var23 >= var17 && class152.field2154.method2646(9) + var22 < var18 && class152.field2154.method2650((byte) -88) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class691.field9660 && var25) {
                                if (var13.field6192 >= 0) {
                                    class275.field3980 = var13.field6192;
                                } else if (var13.field6212) {
                                    class275.field3980 = -1;
                                }
                            }
                            if (!class626.field8777 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class743.method4144((byte) 24, arg10 - var14, var13, arg11 - var15);
                            }
                            boolean var26 = false;
                            if (class152.field2154.method2647(121) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class430 var28 = (class430) class772.field10602.method1731((byte) -108);
                            if (var28 != null && var28.method993(-1) == 0 && var28.method992((byte) 123) + var22 >= var16 && var28.method991(7) + var23 >= var17 && var28.method992((byte) 81) + var22 < var18 && var28.method991(7) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field6315 != null && !class474.method2818((byte) -119)) {
                                for (int var29 = 0; var29 < var13.field6315.length; var29++) {
                                    if (class629.field8820.method2138(var13.field6315[var29], -6759)) {
                                        if (var13.field6182 == null || class192.field2961 >= var13.field6182[var29]) {
                                            byte var30 = var13.field6302[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class629.field8820.method2138(86, -6759) && !class629.field8820.method2138(82, -6759) && !class629.field8820.method2138(81, -6759)) && ((var30 & 0x2) == 0 || class629.field8820.method2138(86, -6759)) && ((var30 & 0x1) == 0 || class629.field8820.method2138(82, -6759)) && ((var30 & 0x4) == 0 || class629.field8820.method2138(81, -6759))) {
                                                if (var29 < 10) {
                                                    class179.method1287(-1, false, var13.field6222, var29 + 1, "");
                                                } else if (var29 == 10) {
                                                    class337.method2136(-161);
                                                    class33 var31 = method2046(var13);
                                                    class262.method1701(0, var31.method267((byte) 115), var31.field442, var13);
                                                    class572.field8070 = class198.method1365(var13, 6858);
                                                    if (class572.field8070 == null) {
                                                        class572.field8070 = "Null";
                                                    }
                                                    class714.field9904 = var13.field6211 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field6203[var29];
                                                if (var13.field6182 == null) {
                                                    var13.field6182 = new int[var13.field6315.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field6182[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field6182[var29] = class192.field2961 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field6182 != null) {
                                        var13.field6182[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class82.method624(var23 + var28.method991(7) - var15, false, var13, var22 + var28.method992((byte) 65) - var14);
                            }
                            if (class265.field3871 != null && class265.field3871 != var13 && var25 && method2046(var13).method277(323119221)) {
                                class439.field5918 = var13;
                            }
                            if (class226.field3479 == var13) {
                                class394.field5429 = true;
                                class422.field5782 = var14;
                                class157.field2527 = var15;
                            }
                            if (var13.field6313 || var13.field6271 != 0) {
                                if (var25 && class170.field2660 != 0 && var13.field6214 != null) {
                                    class166 var33 = new class166();
                                    var33.field2615 = true;
                                    var33.field2627 = var13;
                                    var33.field2616 = class170.field2660;
                                    var33.field2619 = var13.field6214;
                                    class208.field3220.method1727(var33, (byte) 96);
                                }
                                if (class265.field3871 != null || class626.field8777 || class192.field2964 != var13.field6271 && class651.field9094 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field6271 != 0) {
                                    if (class256.field3762 == var13.field6271 || class190.field2938 == var13.field6271) {
                                        class209.field3245 = var13;
                                        if (class416.field5698 != null) {
                                            class416.field5698.method3124(-28184, var13.field6288, class37.field491);
                                        }
                                        if (class256.field3762 == var13.field6271) {
                                            if (class626.field8777 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class790.method4327(80, class37.field491, arg9, arg8);
                                            class360 var34 = (class360) class306.field4398.method2170(false);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label824;
                                                }
                                                if (arg10 >= var34.field5051 && arg10 < var34.field5055 && arg11 >= var34.field5052 && arg11 < var34.field5056) {
                                                    class344.method2177(false);
                                                    class471.method2804(38, var34.field5053);
                                                }
                                                var34 = (class360) class306.field4398.method2176(-17754);
                                            }
                                        }
                                    }
                                    if (class6.field58 == var13.field6271) {
                                        if (var13.method2685(class37.field491, (byte) -121) == null || class760.field10484 != 0 && class760.field10484 != 3 || class626.field8777 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field6254[var36];
                                        if (var35 < var37 || var35 > var13.field6320[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field6290 / 2;
                                        int var39 = var36 - var13.field6288 / 2;
                                        int var40;
                                        if (class416.field5704 == 4) {
                                            var40 = (int) class758.field10460 & 0x3FFF;
                                        } else {
                                            var40 = (int) class758.field10460 + class29.field416 & 0x3FFF;
                                        }
                                        int var41 = class376.field5186[var40];
                                        int var42 = class376.field5188[var40];
                                        if (class416.field5704 != 4) {
                                            var41 = (class347.field4853 + 256) * var41 >> 8;
                                            var42 = (class347.field4853 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class416.field5704 == 4) {
                                            var45 = (class574.field8093 >> 9) + (var43 >> 2);
                                            var46 = (class207.field3211 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class210.field3250.method2102(true) - 1) * 256;
                                            var45 = (class210.field3250.field5742 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class210.field3250.field5746 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class691.field9660 && (class197.field3008 & 0x40) != 0) {
                                            class451 var48 = class63.method422(class714.field9898, 17492, class497.field7084);
                                            if (var48 == null) {
                                                class337.method2136(-161);
                                            } else {
                                                class105.method738(1L, var13.field6183, true, " ->", false, class169.field2646, true, var45, (long) (var13.field6246 << 0 | var13.field6222), var46, (byte) -42, class572.field8070, 51);
                                            }
                                            continue;
                                        }
                                        if (class60.field734 == class588.field8297) {
                                            class105.method738(1L, -1, true, "", false, -1, true, var45, 0L, var46, (byte) -42, class620.field8688.method3580(class140.field2081, 12), 20);
                                        }
                                        class105.method738(1L, -1, true, "", false, class342.field4763, true, var45, 0L, var46, (byte) -42, class80.field895, 23);
                                        continue;
                                    }
                                    if (class192.field2964 == var13.field6271) {
                                        class120.field1850 = var13;
                                        if (var25) {
                                            class467.field6578 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method992((byte) 82) - var14 - var13.field6290 / 2) * 2.0D / (double) class117.field1796);
                                            int var50 = (int) (-((double) (var23 + var28.method991(7) - var15 - var13.field6288 / 2) * 2.0D / (double) class117.field1796));
                                            int var51 = class671.field9338 + var49 + class117.field1804;
                                            int var52 = class752.field10398 + var50 + class117.field1806;
                                            class758 var53 = class142.method1014(-126);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method4208(0, var51, var54, var52);
                                            if (var54 != null) {
                                                if (class629.field8820.method2138(82, -6759) && class745.field10317 > 0) {
                                                    class678.method3845(0, var54[1], var54[2], var54[0]);
                                                    continue;
                                                }
                                                class178.field2783 = true;
                                                class191.field2949 = var54[0];
                                                class5.field45 = var54[1];
                                                class785.field10786 = var54[2];
                                            }
                                            class651.field9094 = 1;
                                            class167.field2636 = false;
                                            class180.field2796 = class152.field2154.method2646(9);
                                            class603.field8441 = class152.field2154.method2650((byte) -62);
                                            continue;
                                        }
                                        if (var26 && class651.field9094 > 0) {
                                            if (class651.field9094 == 1 && (class180.field2796 != class152.field2154.method2646(9) || class603.field8441 != class152.field2154.method2650((byte) -62))) {
                                                class123.field1914 = class671.field9338;
                                                class119.field1834 = class752.field10398;
                                                class651.field9094 = 2;
                                            }
                                            if (class651.field9094 == 2) {
                                                class167.field2636 = true;
                                                class511.method3092(class123.field1914 + (int) ((double) (class180.field2796 - class152.field2154.method2646(9)) * 2.0D / (double) class117.field1802), false);
                                                class380.method2363(class119.field1834 - (int) ((double) (class603.field8441 - class152.field2154.method2650((byte) -64)) * 2.0D / (double) class117.field1802), true);
                                            }
                                            continue;
                                        }
                                        if (class651.field9094 > 0 && !class167.field2636) {
                                            if ((class16.field303 == 1 || class296.method1929(2000)) && class618.field8644 > 2) {
                                                class66.method574(class603.field8441, 16777215, class180.field2796);
                                            } else if (class12.method131(true)) {
                                                class66.method574(class603.field8441, 16777215, class180.field2796);
                                            }
                                        }
                                        class651.field9094 = 0;
                                        continue;
                                    }
                                    if (class790.field10831 == var13.field6271) {
                                        if (var26) {
                                            class527.method3179(var23 + class152.field2154.method2650((byte) -95) - var15, var13.field6290, -108, var22 + class152.field2154.method2646(9) - var14, var13.field6288);
                                        }
                                        continue;
                                    }
                                    if (class683.field9466 == var13.field6271) {
                                        class475.method2823(var13, var15, var14, 256);
                                        continue;
                                    }
                                }
                                if (!var13.field6331 && var27) {
                                    var13.field6331 = true;
                                    if (var13.field6276 != null) {
                                        class166 var55 = new class166();
                                        var55.field2615 = true;
                                        var55.field2627 = var13;
                                        var55.field2614 = var22 + var28.method992((byte) -120) - var14;
                                        var55.field2616 = var23 + var28.method991(7) - var15;
                                        var55.field2619 = var13.field6276;
                                        class208.field3220.method1727(var55, (byte) 122);
                                    }
                                }
                                if (var13.field6331 && var26 && var13.field6329 != null) {
                                    class166 var56 = new class166();
                                    var56.field2615 = true;
                                    var56.field2627 = var13;
                                    var56.field2614 = var22 + class152.field2154.method2646(9) - var14;
                                    var56.field2616 = var23 + class152.field2154.method2650((byte) -63) - var15;
                                    var56.field2619 = var13.field6329;
                                    class208.field3220.method1727(var56, (byte) 85);
                                }
                                if (var13.field6331 && !var26) {
                                    var13.field6331 = false;
                                    if (var13.field6341 != null) {
                                        class166 var57 = new class166();
                                        var57.field2615 = true;
                                        var57.field2627 = var13;
                                        var57.field2614 = var22 + class152.field2154.method2646(9) - var14;
                                        var57.field2616 = var23 + class152.field2154.method2650((byte) -82) - var15;
                                        var57.field2619 = var13.field6341;
                                        class683.field9464.method1727(var57, (byte) 116);
                                    }
                                }
                                if (var26 && var13.field6190 != null) {
                                    class166 var58 = new class166();
                                    var58.field2615 = true;
                                    var58.field2627 = var13;
                                    var58.field2614 = var22 + class152.field2154.method2646(9) - var14;
                                    var58.field2616 = var23 + class152.field2154.method2650((byte) -115) - var15;
                                    var58.field2619 = var13.field6190;
                                    class208.field3220.method1727(var58, (byte) 103);
                                }
                                if (!var13.field6259 && var25) {
                                    var13.field6259 = true;
                                    if (var13.field6250 != null) {
                                        class166 var59 = new class166();
                                        var59.field2615 = true;
                                        var59.field2627 = var13;
                                        var59.field2614 = var22 + class152.field2154.method2646(9) - var14;
                                        var59.field2616 = var23 + class152.field2154.method2650((byte) -126) - var15;
                                        var59.field2619 = var13.field6250;
                                        class208.field3220.method1727(var59, (byte) 94);
                                    }
                                }
                                if (var13.field6259 && var25 && var13.field6175 != null) {
                                    class166 var60 = new class166();
                                    var60.field2615 = true;
                                    var60.field2627 = var13;
                                    var60.field2614 = var22 + class152.field2154.method2646(9) - var14;
                                    var60.field2616 = var23 + class152.field2154.method2650((byte) -71) - var15;
                                    var60.field2619 = var13.field6175;
                                    class208.field3220.method1727(var60, (byte) 103);
                                }
                                if (var13.field6259 && !var25) {
                                    var13.field6259 = false;
                                    if (var13.field6232 != null) {
                                        class166 var61 = new class166();
                                        var61.field2615 = true;
                                        var61.field2627 = var13;
                                        var61.field2614 = var22 + class152.field2154.method2646(9) - var14;
                                        var61.field2616 = var23 + class152.field2154.method2650((byte) -127) - var15;
                                        var61.field2619 = var13.field6232;
                                        class683.field9464.method1727(var61, (byte) 120);
                                    }
                                }
                                if (var13.field6227 != null) {
                                    class166 var62 = new class166();
                                    var62.field2627 = var13;
                                    var62.field2619 = var13.field6227;
                                    class267.field3891.method1727(var62, (byte) 87);
                                }
                                if (var13.field6314 != null && class284.field4196 > var13.field6317) {
                                    if (var13.field6342 == null || class284.field4196 - var13.field6317 > 32) {
                                        class166 var67 = new class166();
                                        var67.field2627 = var13;
                                        var67.field2619 = var13.field6314;
                                        class208.field3220.method1727(var67, (byte) 113);
                                    } else {
                                        label711: for (int var63 = var13.field6317; var63 < class284.field4196; var63++) {
                                            int var64 = class290.field4241[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field6342.length; var65++) {
                                                if (var13.field6342[var65] == var64) {
                                                    class166 var66 = new class166();
                                                    var66.field2627 = var13;
                                                    var66.field2619 = var13.field6314;
                                                    class208.field3220.method1727(var66, (byte) 119);
                                                    break label711;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6317 = class284.field4196;
                                }
                                if (var13.field6186 != null && class646.field9030 > var13.field6238) {
                                    if (var13.field6253 == null || class646.field9030 - var13.field6238 > 32) {
                                        class166 var72 = new class166();
                                        var72.field2627 = var13;
                                        var72.field2619 = var13.field6186;
                                        class208.field3220.method1727(var72, (byte) 125);
                                    } else {
                                        label687: for (int var68 = var13.field6238; var68 < class646.field9030; var68++) {
                                            int var69 = class15.field294[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field6253.length; var70++) {
                                                if (var13.field6253[var70] == var69) {
                                                    class166 var71 = new class166();
                                                    var71.field2627 = var13;
                                                    var71.field2619 = var13.field6186;
                                                    class208.field3220.method1727(var71, (byte) 73);
                                                    break label687;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6238 = class646.field9030;
                                }
                                if (var13.field6220 != null && class280.field4069 > var13.field6298) {
                                    if (var13.field6216 == null || class280.field4069 - var13.field6298 > 32) {
                                        class166 var77 = new class166();
                                        var77.field2627 = var13;
                                        var77.field2619 = var13.field6220;
                                        class208.field3220.method1727(var77, (byte) 114);
                                    } else {
                                        label663: for (int var73 = var13.field6298; var73 < class280.field4069; var73++) {
                                            int var74 = class528.field7549[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field6216.length; var75++) {
                                                if (var13.field6216[var75] == var74) {
                                                    class166 var76 = new class166();
                                                    var76.field2627 = var13;
                                                    var76.field2619 = var13.field6220;
                                                    class208.field3220.method1727(var76, (byte) 93);
                                                    break label663;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6298 = class280.field4069;
                                }
                                if (var13.field6226 != null && class194.field2991 > var13.field6198) {
                                    if (var13.field6338 == null || class194.field2991 - var13.field6198 > 32) {
                                        class166 var82 = new class166();
                                        var82.field2627 = var13;
                                        var82.field2619 = var13.field6226;
                                        class208.field3220.method1727(var82, (byte) 113);
                                    } else {
                                        label639: for (int var78 = var13.field6198; var78 < class194.field2991; var78++) {
                                            int var79 = class689.field9619[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field6338.length; var80++) {
                                                if (var13.field6338[var80] == var79) {
                                                    class166 var81 = new class166();
                                                    var81.field2627 = var13;
                                                    var81.field2619 = var13.field6226;
                                                    class208.field3220.method1727(var81, (byte) 90);
                                                    break label639;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6198 = class194.field2991;
                                }
                                if (var13.field6217 != null && class353.field4955 > var13.field6309) {
                                    if (var13.field6261 == null || class353.field4955 - var13.field6309 > 32) {
                                        class166 var87 = new class166();
                                        var87.field2627 = var13;
                                        var87.field2619 = var13.field6217;
                                        class208.field3220.method1727(var87, (byte) 112);
                                    } else {
                                        label615: for (int var83 = var13.field6309; var83 < class353.field4955; var83++) {
                                            int var84 = class749.field10367[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field6261.length; var85++) {
                                                if (var13.field6261[var85] == var84) {
                                                    class166 var86 = new class166();
                                                    var86.field2627 = var13;
                                                    var86.field2619 = var13.field6217;
                                                    class208.field3220.method1727(var86, (byte) 84);
                                                    break label615;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6309 = class353.field4955;
                                }
                                if (class300.field4335 > var13.field6176 && var13.field6230 != null) {
                                    class166 var88 = new class166();
                                    var88.field2627 = var13;
                                    var88.field2619 = var13.field6230;
                                    class208.field3220.method1727(var88, (byte) 93);
                                }
                                if (class493.field6979 > var13.field6176 && var13.field6166 != null) {
                                    class166 var89 = new class166();
                                    var89.field2627 = var13;
                                    var89.field2619 = var13.field6166;
                                    class208.field3220.method1727(var89, (byte) 118);
                                }
                                if (class614.field8623 > var13.field6176 && var13.field6195 != null) {
                                    class166 var90 = new class166();
                                    var90.field2627 = var13;
                                    var90.field2619 = var13.field6195;
                                    class208.field3220.method1727(var90, (byte) 69);
                                }
                                if (class139.field2074 > var13.field6176 && var13.field6296 != null) {
                                    class166 var91 = new class166();
                                    var91.field2627 = var13;
                                    var91.field2619 = var13.field6296;
                                    class208.field3220.method1727(var91, (byte) 72);
                                }
                                if (class649.field9066 > var13.field6176 && var13.field6245 != null) {
                                    class166 var92 = new class166();
                                    var92.field2627 = var13;
                                    var92.field2619 = var13.field6245;
                                    class208.field3220.method1727(var92, (byte) 113);
                                }
                                if (class85.field935 > var13.field6176 && var13.field6330 != null) {
                                    class166 var93 = new class166();
                                    var93.field2627 = var13;
                                    var93.field2619 = var13.field6330;
                                    class208.field3220.method1727(var93, (byte) 88);
                                }
                                if (class620.field8726 > var13.field6176 && var13.field6168 != null) {
                                    class166 var94 = new class166();
                                    var94.field2627 = var13;
                                    var94.field2619 = var13.field6168;
                                    class208.field3220.method1727(var94, (byte) 92);
                                }
                                var13.field6176 = class366.field5096;
                                if (var13.field6278 != null) {
                                    for (int var95 = 0; var95 < class310.field4431; var95++) {
                                        class166 var96 = new class166();
                                        var96.field2627 = var13;
                                        var96.field2620 = class354.field4983[var95].method1496(21053);
                                        var96.field2613 = class354.field4983[var95].method1489(60);
                                        var96.field2619 = var13.field6278;
                                        class208.field3220.method1727(var96, (byte) 123);
                                    }
                                }
                                if (class174.field2696 && var13.field6275 != null) {
                                    class166 var97 = new class166();
                                    var97.field2627 = var13;
                                    var97.field2619 = var13.field6275;
                                    class208.field3220.method1727(var97, (byte) 82);
                                }
                            }
                            if (var13.field6210 == 5 && var13.field6316 != -1) {
                                var13.method2684(8, class107.field1602, class316.field4491).method3124(-28184, var13.field6288, class37.field491);
                            }
                            class2.method17(var13, true);
                            if (var13.field6210 == 0) {
                                method2037(arg0, var13.field6222, var16, var17, var18, var19, var14 - var13.field6292, var15 - var13.field6173, arg8, arg9, arg10, arg11);
                                if (var13.field6270 != null) {
                                    method2037(var13.field6270, var13.field6222, var16, var17, var18, var19, var14 - var13.field6292, var15 - var13.field6173, arg8, arg9, arg10, arg11);
                                }
                                class744 var98 = (class744) class11.field217.method2242((long) var13.field6222, -1);
                                if (var98 != null) {
                                    if (class60.field734 == class422.field5780 && var98.field10312 == 0 && !class626.field8777 && var25 && !class81.field901) {
                                        class344.method2177(false);
                                    }
                                    class381.method2370(arg8, (byte) -107, var19, arg11, var17, var98.field10314, var14, arg9, arg10, var16, var18, var15);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class2.method17(var13, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method2038(int arg0) {
        field4505++;
        if (class266.field3873 == 14) {
            return;
        }
        class192.field2961++;
        if (class192.field2961 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class277.field4035 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class70.field833.setSeed((long) class277.field4035);
        }
        if (class192.field2961 % 50 == 0) {
            class771.field10589 = class270.field3921;
            class270.field3921 = 0;
            class694.field9695 = class156.field2372;
            class156.field2372 = 0;
        }
        this.method2041(10);
        if (class639.field8960 != null) {
            class639.field8960.method3223((byte) 41);
        }
        class731.method4089(110);
        class445.method2657(arg0 ^ 0xFFFFE482);
        class629.field8820.method2137(-93);
        class152.field2154.method2655((byte) 121);
        if (class37.field491 != null) {
            class37.field491.method454((int) class459.method2731(104));
        }
        class533.method3213(-5846);
        class310.field4431 = 0;
        class54.field688 = 0;
        if (arg0 != 6924) {
            method2034(null);
        }
        for (class542 var3 = class629.field8820.method2140(false); var3 != null; var3 = class629.field8820.method2140(false)) {
            int var6 = var3.method1491(-29344);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method1489(arg0 - 6843);
                if (class586.method3421((byte) 125) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class474.method2818((byte) -126)) {
                        class619.method3576(arg0 ^ 0x1B30);
                    } else {
                        class376.method2329(0);
                    }
                } else if (class310.field4431 < 128) {
                    class354.field4983[class310.field4431] = var3;
                    class310.field4431++;
                }
            } else if (var6 == 0 && class54.field688 < 75) {
                class30.field421[class54.field688] = var3;
                class54.field688++;
            }
        }
        class170.field2660 = 0;
        for (class430 var4 = class152.field2154.method2651(-2); var4 != null; var4 = class152.field2154.method2651(-2)) {
            int var5 = var4.method993(-1);
            if (var5 == -1) {
                class87.field970.method1727(var4, (byte) 106);
            } else if (var5 == 6) {
                class170.field2660 += var4.method994((byte) -75);
            } else if (class278.method1813(var5, arg0 - 6810)) {
                class772.field10602.method1727(var4, (byte) 112);
                if (class772.field10602.method1735(-116) > 10) {
                    class772.field10602.method1736(0);
                }
            }
        }
        if (class474.method2818((byte) -121)) {
            class421.method2549(arg0 ^ 0x343C);
        }
        if (class673.method3827(class266.field3873, arg0 - 35563)) {
            class250.method1648(636002721);
            class561.method3315(-15168);
        } else if (class36.method284(arg0 - 6818, class266.field3873)) {
            class532.method3210(3317);
        }
        if (class260.method1691(class266.field3873, 126) && !class36.method284(97, class266.field3873)) {
            this.method2050(90);
            class347.method2201((byte) 110);
            class792.method4364((byte) 120);
        } else if (class397.method2450((byte) 43, class266.field3873) && !class36.method284(82, class266.field3873)) {
            this.method2050(78);
            class792.method4364((byte) 120);
        } else if (class266.field3873 == 12) {
            class792.method4364((byte) 120);
        } else if (class695.method3923(class266.field3873, false) && !class36.method284(arg0 ^ 0x1B74, class266.field3873)) {
            class496.method3018(false);
        } else if (class266.field3873 == 13) {
            class792.method4364((byte) 120);
            if (class200.field3046 != -3 && class200.field3046 != 2 && class200.field3046 != 15) {
                class195.method1354((byte) -61, false);
            }
        }
        class287.method1853((byte) 49, class37.field491);
        class772.field10602.method1736(0);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class268.method1741("Argument count", (byte) 117);
            }
            class277.field4037 = new class63();
            class277.field4037.field763 = Integer.parseInt(arg0[0]);
            class680.field9439 = new class63();
            class680.field9439.field763 = Integer.parseInt(arg0[1]);
            class780.field10705 = new class63();
            class780.field10705.field763 = Integer.parseInt(arg0[2]);
            class300.field4326 = class694.field9699;
            if (arg0[3].equals("live")) {
                class589.field8303 = class407.field5548;
            } else if (arg0[3].equals("rc")) {
                class589.field8303 = class361.field5059;
            } else if (arg0[3].equals("wip")) {
                class589.field8303 = class723.field10013;
            } else {
                class268.method1741("modewhat", (byte) 117);
            }
            class140.field2081 = class580.method3399(0, arg0[4]);
            if (class140.field2081 == -1) {
                if (arg0[4].equals("english")) {
                    class140.field2081 = 0;
                } else if (arg0[4].equals("german")) {
                    class140.field2081 = 1;
                } else {
                    class268.method1741("language", (byte) 117);
                }
            }
            class685.field9515 = false;
            class22.field367 = false;
            if (arg0[5].equals("game0")) {
                class60.field734 = class422.field5780;
            } else if (arg0[5].equals("game1")) {
                class60.field734 = class588.field8297;
            } else if (arg0[5].equals("game2")) {
                class60.field734 = class599.field8411;
            } else if (arg0[5].equals("game3")) {
                class60.field734 = class551.field7918;
            } else {
                class268.method1741("game", (byte) 117);
            }
            class192.field2962 = false;
            class425.field5804 = 0;
            class613.field8606 = true;
            class678.field9432 = true;
            class120.field1872 = false;
            class12.field231 = null;
            class450.field6162 = 0;
            class222.field3426 = class60.field734.field3718;
            class357.field5022 = "";
            class243.field3624 = 0L;
            class467.field6560 = 0;
            class378.field5220 = null;
            client var1 = new client();
            class256.field3768 = var1;
            var1.method2911(768, false, 88, 650, class589.field8303.method1037((byte) -79) + 32, class60.field734.field3719, 37, 1024);
            class384.field5278.setLocation(40, 40);
        } catch (Exception var3) {
            class678.method3848(null, var3, false);
        }
        field4509++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method2039(int arg0) {
        field4501++;
        String var2 = null;
        try {
            var2 = "[1)" + class124.field1922 + "," + class88.field999 + "," + class768.field10571 + "," + class350.field4898 + "|";
            if (class210.field3250 != null) {
                var2 = var2 + "2)" + class368.field5113 + "," + (class210.field3250.field4670[0] + class124.field1922) + "," + (class210.field3250.field4672[0] + class88.field999) + "|";
            }
            if (arg0 != 1001) {
                this.method2039(-81);
            }
            var2 = var2 + "3)" + class21.field353.field10098.method1588(-59) + "|4)" + class21.field353.field10096.method1629(-71) + "|5)" + class592.method3442((byte) -37) + "|6)" + class428.field5825 + "," + class714.field9895 + "|";
            var2 = var2 + "7)" + class21.field353.field10080.method4366(-84) + "|";
            var2 = var2 + "8)" + class21.field353.field10062.method4001(arg0 ^ 0xFFFFFC4C) + "|";
            var2 = var2 + "9)" + class21.field353.field10072.method697(arg0 - 1089) + "|";
            var2 = var2 + "10)" + class21.field353.field10057.method1024(-67) + "|";
            var2 = var2 + "11)" + class21.field353.field10090.method2426(-83) + "|";
            var2 = var2 + "12)" + class21.field353.field10086.method1642(arg0 ^ 0xFFFFFC6A) + "|";
            var2 = var2 + "13)" + class54.field676 + "|";
            var2 = var2 + "14)" + class266.field3873;
            if (class716.field9938 != null) {
                var2 = var2 + "|15)" + class716.field9938.field249;
            }
            try {
                if (class21.field353.field10098.method1588(-128) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4511 == null ? (field4511 = method2054("client")) : field4511).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var15) {
            }
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method2040(int arg0) {
        int var1 = class514.field7278;
        int[] var2 = class522.field7381;
        for (int var3 = 0; var3 < class235.field3545 + var1; var3++) {
            class330 var4;
            if (var3 < var1) {
                var4 = class767.field10560[var2[var3]];
            } else {
                var4 = ((class205) class645.field9014.method2242((long) class216.field3356[var3 - var1], -1)).field3181;
            }
            if (var4.field5755 == arg0 && var4.field4610 >= 0) {
                int var5 = var4.method2102(true);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5742 & 0x1FF) != 0 || (var4.field5746 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field5742 & 0x1FF) != 256 || (var4.field5746 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field5742 >> 9;
                    int var7 = var4.field5746 >> 9;
                    if (var4.field4610 > class663.field9226[var6][var7]) {
                        class663.field9226[var6][var7] = var4.field4610;
                        class9.field81[var6][var7] = 1;
                    } else if (class663.field9226[var6][var7] == var4.field4610) {
                        var10002 = class9.field81[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field5742 - var8 >> 9;
                    int var10 = var4.field5746 - var8 >> 9;
                    int var11 = var4.field5742 + var8 >> 9;
                    int var12 = var4.field5746 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field4610 > class663.field9226[var13][var14]) {
                                class663.field9226[var13][var14] = var4.field4610;
                                class9.field81[var13][var14] = 1;
                            } else if (class663.field9226[var13][var14] == var4.field4610) {
                                var10002 = class9.field81[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method2041(int arg0) {
        field4494++;
        boolean var2 = class65.field783.method3511(126);
        if (!var2) {
            this.method2047(false);
        }
        if (arg0 != 10) {
            field4492 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method2042(byte arg0) {
        if (arg0 >= -68) {
            field4500 = null;
        }
        field4510++;
        if (class21.field353.field10098.method1588(-99) != 2) {
            this.method2030(5);
            return;
        }
        try {
            this.method2030(5);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class678.method3848(var5.getMessage() + " (Recovered) " + this.method2039(1001), var5, false);
            class678.field9431 = true;
            class9.method61(0, false, (byte) -40);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)V")
    public static final void method2043(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4502++;
        class313 var5 = class312.method1998((long) arg0, 10, arg4 ^ 0xFFFFA0B4);
        var5.method2001((byte) 120);
        var5.field4464 = arg3;
        var5.field4450 = arg2;
        var5.field4455 = arg1;
        if (arg4 != 24395) {
            method2051(-113);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method2044(byte arg0) {
        field4496++;
        if (class21.field353.field10098.method1588(-74) == 2) {
            try {
                this.method2038(6924);
            } catch (ThreadDeath var5) {
                throw var5;
            } catch (Throwable var6) {
                class678.method3848(var6.getMessage() + " (Recovered) " + this.method2039(1001), var6, false);
                class678.field9431 = true;
                class9.method61(0, false, (byte) -40);
            }
        } else {
            this.method2038(6924);
        }
        int var4 = 49 / ((arg0 + 52) / 56);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lmea;)Lmea;")
    public static final class451 method2045(class451 arg0) {
        int var1 = method2046(arg0).method271(1745399410);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class166.method1238((byte) -71, arg0.field6233);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lmea;)Lmca;")
    public static final class33 method2046(class451 arg0) {
        class33 var1 = (class33) class111.field1713.method2242(((long) arg0.field6222 << 32) + (long) arg0.field6246, -1);
        return var1 == null ? arg0.field6171 : var1;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4504++;
        if (!this.method2902(true)) {
            return;
        }
        class277.field4037 = new class63();
        class277.field4037.field763 = Integer.parseInt(this.getParameter("worldid"));
        class680.field9439 = new class63();
        class680.field9439.field763 = Integer.parseInt(this.getParameter("lobbyid"));
        class680.field9439.field760 = this.getParameter("lobbyaddress");
        class780.field10705 = new class63();
        class780.field10705.field763 = Integer.parseInt(this.getParameter("demoid"));
        class780.field10705.field760 = this.getParameter("demoaddress");
        class300.field4326 = class285.method1849(Integer.parseInt(this.getParameter("modewhere")), 8);
        if (class694.field9699 == class300.field4326) {
            class300.field4326 = class189.field2913;
        } else if (!class278.method1812(class300.field4326, -139215363) && class622.field8739 != class300.field4326) {
            class300.field4326 = class622.field8739;
        }
        class589.field8303 = class311.method1994(Integer.parseInt(this.getParameter("modewhat")), 98);
        if (class723.field10013 != class589.field8303 && class589.field8303 != class361.field5059 && class589.field8303 != class407.field5548) {
            class589.field8303 = class407.field5548;
        }
        try {
            class140.field2081 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var15) {
            class140.field2081 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class22.field367 = true;
        } else {
            class22.field367 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class685.field9515 = true;
        } else {
            class685.field9515 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class13.field278 = true;
        } else {
            class13.field278 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class60.field734 = class422.field5780;
            } else if (var4.equals("1")) {
                class60.field734 = class588.field8297;
            } else if (var4.equals("2")) {
                class60.field734 = class599.field8411;
            } else if (var4.equals("3")) {
                class60.field734 = class551.field7918;
            }
        }
        try {
            class467.field6560 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var14) {
            class467.field6560 = 0;
        }
        class666.field9267 = this.getParameter("quiturl");
        class357.field5022 = this.getParameter("settings");
        if (class357.field5022 == null) {
            class357.field5022 = "";
        }
        class337.field4726 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class450.field6162 = Integer.parseInt(var5);
            } catch (Exception var13) {
                class450.field6162 = 0;
            }
        }
        class222.field3426 = Integer.parseInt(this.getParameter("colourid"));
        if (class222.field3426 < 0 || class222.field3426 >= class688.field9562.length) {
            class222.field3426 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class613.field8606 = true;
            class678.field9432 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class192.field2962 = true;
        }
        String var7 = this.getParameter("sskey");
        if (var7 != null) {
            class378.field5220 = class275.method1781(class212.method1463(16, var7), 255);
            if (class378.field5220.length < 16) {
                class378.field5220 = null;
            }
        }
        String var8 = this.getParameter("force64mb");
        if (var8 != null && var8.equals("true")) {
            class120.field1872 = true;
        }
        String var9 = this.getParameter("worldflags");
        if (var9 != null) {
            try {
                class425.field5804 = Integer.parseInt(var9);
            } catch (Exception var12) {
            }
        }
        String var10 = this.getParameter("userFlow");
        if (var10 != null) {
            try {
                class243.field3624 = Long.parseLong(var10);
            } catch (NumberFormatException var11) {
            }
        }
        class12.field231 = this.getParameter("additionalInfo");
        if (class12.field231 != null && class12.field231.length() > 50) {
            class12.field231 = null;
        }
        if (class60.field734 == class422.field5780) {
            class296.field4307 = 503;
            class527.field7532 = 765;
        } else if (class60.field734 == class588.field8297) {
            class527.field7532 = 640;
            class296.field4307 = 480;
        }
        class256.field3768 = this;
        this.method2906(class296.field4307, 650, class589.field8303.method1037((byte) -79) + 32, class527.field7532, 37, class60.field734.field3719, -2783);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    private final void method2047(boolean arg0) {
        field4495++;
        if (arg0) {
            field4500 = null;
        }
        if (class100.field1148 < class65.field783.field8473) {
            class5.field34.method417((byte) -96);
            class159.field2545 = (class65.field783.field8473 * 50 - 50) * 5;
            if (class159.field2545 > 3000) {
                class159.field2545 = 3000;
            }
            if (class65.field783.field8473 >= 2 && class65.field783.field8472 == 6) {
                this.method2903(-1, "js5connect_outofdate");
                class266.field3873 = 14;
                return;
            }
            if (class65.field783.field8473 >= 4 && class65.field783.field8472 == -1) {
                this.method2903(-1, "js5crc");
                class266.field3873 = 14;
                return;
            }
            if (class65.field783.field8473 >= 4 && class673.method3827(class266.field3873, -28639)) {
                if (class65.field783.field8472 == 7 || class65.field783.field8472 == 9) {
                    this.method2903(-1, "js5connect_full");
                } else if (class65.field783.field8472 <= 0) {
                    this.method2903(-1, "js5io");
                } else if (class152.field2162 == null) {
                    this.method2903(-1, "js5connect");
                } else {
                    this.method2903(-1, "js5proxy_" + class152.field2162.trim());
                }
                class266.field3873 = 14;
                return;
            }
        }
        class100.field1148 = class65.field783.field8473;
        if (class159.field2545 > 0) {
            class159.field2545--;
            return;
        }
        try {
            if (class778.field10682 == 0) {
                class132.field1994 = class5.field34.method416(class519.field7328, false);
                class778.field10682++;
            }
            if (class778.field10682 == 1) {
                if (class132.field1994.field2089 == 2) {
                    if (class132.field1994.field2092 != null) {
                        class152.field2162 = (String) class132.field1994.field2092;
                    }
                    this.method2028(1000, 0);
                    return;
                }
                if (class132.field1994.field2089 == 1) {
                    class778.field10682++;
                }
            }
            if (class778.field10682 == 2) {
                class35.field473 = new class686((Socket) class132.field1994.field2092, class519.field7328, 25000);
                class494 var2 = new class494(5);
                var2.method2952(0, class763.field10506.field7314);
                var2.method2959(650, (byte) 119);
                class35.field473.method3875(0, 99, var2.field7050, 5);
                class778.field10682++;
                class605.field8466 = class459.method2731(108);
            }
            if (class778.field10682 == 3) {
                if (class673.method3827(class266.field3873, -28639) || class35.field473.method3868((byte) 47) > 0) {
                    int var3 = class35.field473.method3869((byte) -64);
                    if (var3 != 0) {
                        this.method2028(var3, 0);
                        return;
                    }
                    class778.field10682++;
                } else if ((class459.method2731(120) - class605.field8466) > 30000L) {
                    this.method2028(1001, 0);
                    return;
                }
            }
            if (class778.field10682 == 4) {
                boolean var4 = class673.method3827(class266.field3873, -28639) || class260.method1691(class266.field3873, 127) || class397.method2450((byte) 125, class266.field3873);
                class178[] var5 = class178.method1281(-2);
                class494 var6 = new class494(var5.length * 4);
                class35.field473.method3872(0, !arg0, var6.field7050.length, var6.field7050);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method1283(var6.method2976(-125), 10410);
                }
                class65.field783.method3512(-2, !var4, class35.field473);
                class132.field1994 = null;
                class35.field473 = null;
                class778.field10682 = 0;
            }
        } catch (IOException var8) {
            this.method2028(1002, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static void method2048(int arg0) {
        field4500 = null;
        if (arg0 < 61) {
            method2033(null, null, (byte) 98);
        }
        field4492 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method2049(int arg0) {
        if (class120.field1872) {
            class54.field676 = 64;
        }
        field4508++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class606.method3517(31719);
        class785.field10777 = new class90(class519.field7328);
        class65.field783 = new class605();
        class531.method3204(0, new int[] { 1000, 100 }, new int[] { 20, 260 });
        if (class622.field8739 != class300.field4326) {
            class710.field9861 = new byte[50][];
        }
        class21.field353 = class561.method3314((byte) -25);
        if (arg0 != 3172) {
            return;
        }
        if (class622.field8739 == class300.field4326) {
            class277.field4037.field760 = this.getCodeBase().getHost();
        } else if (class278.method1812(class300.field4326, -139215363)) {
            class277.field4037.field760 = this.getCodeBase().getHost();
            class277.field4037.field767 = class277.field4037.field763 + 40000;
            class680.field9439.field767 = class680.field9439.field763 + 40000;
            class780.field10705.field767 = class780.field10705.field763 + 40000;
            class277.field4037.field766 = class277.field4037.field763 + 50000;
            class680.field9439.field766 = class680.field9439.field763 + 50000;
            class780.field10705.field766 = class780.field10705.field763 + 50000;
        } else if (class694.field9699 == class300.field4326) {
            class277.field4037.field760 = "127.0.0.1";
            class680.field9439.field760 = "127.0.0.1";
            class277.field4037.field767 = class277.field4037.field763 + 40000;
            class780.field10705.field760 = "127.0.0.1";
            class680.field9439.field767 = class680.field9439.field763 + 40000;
            class277.field4037.field766 = class277.field4037.field763 + 50000;
            class780.field10705.field767 = class780.field10705.field763 + 40000;
            class680.field9439.field766 = class680.field9439.field763 + 50000;
            class780.field10705.field766 = class780.field10705.field763 + 50000;
        }
        class5.field34 = class277.field4037;
        if (class60.field734 == class422.field5780) {
            class127.field1955 = false;
        }
        class116.field1780 = class625.field8753 = class411.field5575 = class344.field4807 = new short[256];
        if (class60.field734 == class588.field8297) {
            class668.field9301 = class740.field10206;
            class763.field10521 = 16777215;
            class548.field7872 = true;
            class8.field78 = class438.field5912;
            class251.field3707 = 0;
        } else if (class60.field734 == class551.field7918) {
            class668.field9301 = class14.field287;
            class8.field78 = class543.field7810;
        } else {
            class8.field78 = class338.field4736;
            class668.field9301 = class34.field465;
        }
        try {
            class430.field5834 = class256.field3768.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class629.field8820 = class342.method2167(class629.field8819, true);
        class152.field2154 = class45.method325(0, true, class629.field8819);
        try {
            if (class519.field7328.field6695 != null) {
                class582.field8222 = new class635(class519.field7328.field6695, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class465.field6548[var3] = new class635(class519.field7328.field6698[var3], 6000, 0);
                }
                class305.field4396 = new class635(class519.field7328.field6696, 6000, 0);
                class574.field8102 = new class126(255, class582.field8222, class305.field4396, 500000);
                class78.field886 = new class635(class519.field7328.field6691, 24, 0);
                class519.field7328.field6696 = null;
                class519.field7328.field6691 = null;
                class519.field7328.field6698 = null;
                class519.field7328.field6695 = null;
            }
        } catch (IOException var5) {
            class582.field8222 = null;
            class574.field8102 = null;
            class305.field4396 = null;
            class78.field886 = null;
        }
        if (class622.field8739 != class300.field4326) {
            class216.field3351 = true;
        }
        class411.field5576 = class620.field8673.method3580(class140.field2081, 12);
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method2050(int arg0) {
        field4503++;
        if (class266.field3873 == 7 && !class140.method1013((byte) -122)) {
            if (class625.field8754 > 1) {
                class625.field8754--;
                class620.field8726 = class366.field5096;
            }
            if (!class626.field8777) {
                class344.method2177(false);
            }
            for (int var2 = 0; var2 < 100 && class715.method4014(-32); var2++) {
            }
        }
        class471.field6608++;
        class440.method2622(null, 111, -1, -1);
        class475.method2823(null, -1, -1, 256);
        class554.method3295(-31004);
        class366.field5096++;
        for (int var3 = 0; var3 < class36.field483; var3++) {
            class665 var4 = class164.field2601[var3].field3181;
            if (var4 != null) {
                byte var5 = var4.field9240.field1652;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2102(true);
                    if ((var5 & 0x2) != 0 && var4.field4668 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field4670[0] + var7;
                            int var10 = var4.field4672[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class768.field10571 - var6 - 1) {
                                var9 = class768.field10571 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > class350.field4898 - var6 - 1) {
                                var10 = class350.field4898 - var6 - 1;
                            }
                            int var11 = class460.method2734(-1, var6, 0, var9, (byte) 55, class346.field4838[var4.field5755], true, var6, class347.field4858, var4.field4670[0], 0, var6, var4.field4672[0], class777.field10671, var10);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field4670[var12] = class347.field4858[var11 - var12 - 1];
                                    var4.field4672[var12] = class777.field10671[var11 - var12 - 1];
                                    var4.field4674[var12] = 1;
                                }
                                var4.field4668 = var11;
                            }
                        }
                    }
                    class549.method3280(5, var4, true);
                    int var13 = class281.method1822(19594, var4);
                    class216.method1485(var4, true);
                    class31.method257((byte) 57, class206.field3194, class348.field4868, var4, var13);
                    class622.method3587(class348.field4868, var4, -20365);
                    class275.method1780(32, var4);
                }
            }
        }
        if (!class140.method1013((byte) -106) && class339.field4745 == 0) {
            if (class416.field5704 == 2) {
                class647.method3711(-31);
            } else {
                class109.method834(105);
            }
            if (class614.field8619 >> 9 < 14 || (class768.field10571 - 14) <= (class614.field8619 >> 9) || class472.field6622 >> 9 < 14 || (class350.field4898 - 14) <= (class472.field6622 >> 9)) {
                class594.method3463(1);
            }
        }
        if (arg0 < 58) {
            this.method2038(4);
        }
        while (true) {
            class166 var14;
            class451 var15;
            class451 var16;
            do {
                var14 = (class166) class267.field3891.method1736(0);
                if (var14 == null) {
                    while (true) {
                        class166 var17;
                        class451 var18;
                        class451 var19;
                        do {
                            var17 = (class166) class683.field9464.method1736(0);
                            if (var17 == null) {
                                while (true) {
                                    class166 var20;
                                    class451 var21;
                                    class451 var22;
                                    do {
                                        var20 = (class166) class208.field3220.method1736(0);
                                        if (var20 == null) {
                                            if (class265.field3871 != null) {
                                                class527.method3182(11942);
                                            }
                                            if ((class192.field2961 % 1500) == 0) {
                                                class237.method1587((byte) -127);
                                            }
                                            if (class266.field3873 == 7 && !class140.method1013((byte) -119)) {
                                                class788.method4317(-111);
                                            }
                                            class80.method614(0);
                                            if (class274.field3955 && class561.field7978 < class459.method2731(116) - 60000L) {
                                                class787.method4312(-30475);
                                            }
                                            for (class20 var23 = (class20) class648.field9061.method2170(false); var23 != null; var23 = (class20) class648.field9061.method2176(-17754)) {
                                                if ((class459.method2731(124) / 1000L - 5L) > ((long) var23.field338)) {
                                                    if (var23.field342 > 0) {
                                                        class788.method4313("", (byte) 51, "", var23.field337 + class620.field8680.method3580(class140.field2081, 12), 5, 0, "");
                                                    }
                                                    if (var23.field342 == 0) {
                                                        class788.method4313("", (byte) 51, "", var23.field337 + class620.field8681.method3580(class140.field2081, 12), 5, 0, "");
                                                    }
                                                    var23.method3358(-113);
                                                }
                                            }
                                            if (class266.field3873 == 7 && !class140.method1013((byte) -72)) {
                                                if (class527.field7529 == null) {
                                                    class195.method1354((byte) -61, false);
                                                    return;
                                                }
                                                class374.field5165++;
                                                if (class374.field5165 > 50) {
                                                    class290.field4247++;
                                                    class312 var24 = class353.method2245(class87.field971, class421.field5756, (byte) 97);
                                                    class208.method1440(var24, 113);
                                                }
                                                try {
                                                    class158.method1205((byte) -30);
                                                    return;
                                                } catch (IOException var25) {
                                                    class195.method1354((byte) -61, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field2627;
                                        if (var21.field6246 < 0) {
                                            break;
                                        }
                                        var22 = class166.method1238((byte) -50, var21.field6233);
                                    } while (var22 == null || var22.field6270 == null || var21.field6246 >= var22.field6270.length || var22.field6270[var21.field6246] != var21);
                                    class379.method2349(var20);
                                }
                            }
                            var18 = var17.field2627;
                            if (var18.field6246 < 0) {
                                break;
                            }
                            var19 = class166.method1238((byte) -57, var18.field6233);
                        } while (var19 == null || var19.field6270 == null || var18.field6246 >= var19.field6270.length || var19.field6270[var18.field6246] != var18);
                        class379.method2349(var17);
                    }
                }
                var15 = var14.field2627;
                if (var15.field6246 < 0) {
                    break;
                }
                var16 = class166.method1238((byte) -98, var15.field6233);
            } while (var16 == null || var16.field6270 == null || var15.field6246 >= var16.field6270.length || var16.field6270[var15.field6246] != var15);
            class379.method2349(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method2051(int arg0) {
        int var1 = class514.field7278;
        int[] var2 = class522.field7381;
        int var3 = class197.field3006 ? var1 : class235.field3545 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class330 var5;
            if (var4 < var1) {
                var5 = class767.field10560[var2[var4]];
            } else {
                var5 = ((class205) class645.field9014.method2242((long) class216.field3356[var4 - var1], -1)).field3181;
            }
            if (var5.field5755 == arg0) {
                var5.field4588 = 0;
                if (var5.field4610 < 0) {
                    var5.field4577 = false;
                } else {
                    int var6 = var5.method2102(true);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field5742 & 0x1FF) != 0 || (var5.field5746 & 0x1FF) != 0) {
                            var5.field4577 = false;
                            continue;
                        }
                    } else if ((var5.field5742 & 0x1FF) != 256 || (var5.field5746 & 0x1FF) != 256) {
                        var5.field4577 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field5742 >> 9;
                        int var8 = var5.field5746 >> 9;
                        if (class663.field9226[var7][var8] != var5.field4610) {
                            var5.field4577 = true;
                            continue;
                        }
                        if (class9.field81[var7][var8] > 1) {
                            var10002 = class9.field81[var7][var8]--;
                            var5.field4577 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field5742 - var9 >> 9;
                        int var11 = var5.field5746 - var9 >> 9;
                        int var12 = var5.field5742 + var9 >> 9;
                        int var13 = var5.field5746 + var9 >> 9;
                        if (!class392.method2428(var13, var5.field4610, var12, var10, (byte) 125, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class663.field9226[var14][var15] == var5.field4610) {
                                        var10002 = class9.field81[var14][var15]--;
                                    }
                                }
                            }
                            var5.field4577 = true;
                            continue;
                        }
                    }
                    var5.field4577 = false;
                    var5.field5741 = class702.method3970(var5.field5742, var5.field5755, -20103, var5.field5746);
                    class490.method2926(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final synchronized void method2052(int arg0) {
        field4499++;
        if (class319.field4527 != null && class629.field8819 == null && !class519.field7328.field6692) {
            try {
                Class var2 = class319.field4527.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class629.field8819 = (Canvas) var3.get(class319.field4527);
                var3.set(class319.field4527, null);
                if (class629.field8819 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method2052(arg0);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2053() {
        int var0 = class514.field7278;
        int[] var1 = class522.field7381;
        int var2 = class197.field3006 ? var0 : class235.field3545 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class330 var4;
            if (var3 < var0) {
                var4 = class767.field10560[var1[var3]];
            } else {
                var4 = ((class205) class645.field9014.method2242((long) class216.field3356[var3 - var0], -1)).field3181;
            }
            if (var4.field4610 >= 0) {
                int var5 = var4.method2102(true);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5742 & 0x1FF) == 0 && (var4.field5746 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field5742 & 0x1FF) == 256 && (var4.field5746 & 0x1FF) == 256) {
                    continue;
                }
                var4.field5741 = class702.method3970(var4.field5742, var4.field5755, -20103, var4.field5746);
                class490.method2926(var4, true);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2054(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
