import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class191 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lhj;")
    public static class29 field3794 = new class29(8);

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field3800 = "Connecting to update server";

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 4)
    public final void method1375(byte arg0) {
        field3791++;
        if (class36.field534) {
            class36.method306();
        }
        if (class63.field951 != null) {
            class173.method1263(100, class301.field4715, class63.field951);
            class63.field951 = null;
        }
        if (class301.field4715 != null) {
            class301.field4715.method173(30004, this.getClass());
        }
        if (class109.field1719 != null) {
            class109.field1719.field3689 = false;
        }
        class109.field1719 = null;
        if (class297.field4661 != null) {
            class297.field4661.method916(-25224);
            class297.field4661 = null;
        }
        class76.method615(115, class171.field2548);
        class119.method922((byte) 86, class171.field2548);
        if (class95.field1392 != null) {
            class95.field1392.method989(0, class171.field2548);
        }
        class304.method2118((byte) -120);
        class108.method834(0);
        class95.field1392 = null;
        if (class256.field3818 != null) {
            class256.field3818.method1852(arg0 ^ 0x4039);
        }
        if (class261.field3861 != null) {
            class261.field3861.method1852(16384);
        }
        class110.field1746.method53(false);
        class292.field4587.method537(arg0 - 30489);
        try {
            if (class176.field2626 != null) {
                class176.field2626.method1846((byte) 59);
            }
            if (class77.field1090 != null) {
                for (int var2 = 0; var2 < class77.field1090.length; var2++) {
                    if (class77.field1090[var2] != null) {
                        class77.field1090[var2].method1846((byte) -126);
                    }
                }
            }
            if (class110.field1738 != null) {
                class110.field1738.method1846((byte) 61);
            }
            if (class278.field4273 != null) {
                class278.field4273.method1846((byte) 91);
            }
            if (arg0 != 57) {
                method1770((class184) null);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 89)
    public final void method1376(int arg0) {
        field3788++;
        class188.method1356(-119);
        class292.field4587 = new class60();
        class110.field1746 = new class4();
        if (class183.field2755 != 0) {
            class33.field411 = new byte[50][];
        }
        class308.method2134(-96, class301.field4715);
        if (class20.field222 == 0) {
            class193.field3088 = this.getCodeBase().getHost();
            class294.field4627 = 443;
            class93.field1341 = 43594;
        } else if (class20.field222 == 1) {
            class193.field3088 = this.getCodeBase().getHost();
            class93.field1341 = class110.field1739 + 40000;
            class294.field4627 = class110.field1739 + 50000;
        } else if (class20.field222 == 2) {
            class193.field3088 = "127.0.0.1";
            class93.field1341 = class110.field1739 + 40000;
            class294.field4627 = class110.field1739 + 50000;
        }
        class31.field398 = class93.field1341;
        class196.field3101 = class93.field1341;
        if (arg0 != -29) {
            return;
        }
        class208.field3276 = class31.field398;
        if (class3.field12 == 1) {
            class92.field1333 = class204.field3242;
            class264.field3950 = 16777215;
            class264.field3949 = 0;
            class11.field116 = true;
            class304.field4761 = class204.field3239;
            class62.field948 = class78.field1101;
            class37.field558 = class197.field3120;
        } else {
            class62.field948 = class105.field1616;
            class37.field558 = class282.field4352;
            class92.field1333 = class262.field3920;
            class304.field4761 = class190.field3042;
        }
        if (class26.field298 == 3 && class20.field222 != 2) {
            class73.field1051 = class110.field1739;
        }
        class255.field3816 = class193.field3088;
        class4.field20 = class294.field4627;
        class3.field13 = class119.field1879 = class311.field4846 = class44.field688 = new short[256];
        class220.method1573((byte) 74);
        class292.method2058(-127, class171.field2548);
        class262.method1812((byte) 105, class171.field2548);
        class95.field1392 = class277.method1944(-98);
        if (class95.field1392 != null) {
            class95.field1392.method990(class171.field2548, -4);
        }
        class163.field2431 = class26.field298;
        try {
            if (class301.field4715.field283 != null) {
                class176.field2626 = new class266(class301.field4715.field283, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class77.field1090[var2] = new class266(class301.field4715.field289[var2], 6000, 0);
                }
                class110.field1738 = new class266(class301.field4715.field281, 6000, 0);
                class225.field3501 = new class137(255, class176.field2626, class110.field1738, 500000);
                class278.field4273 = new class266(class301.field4715.field288, 24, 0);
                class301.field4715.field283 = null;
                class301.field4715.field281 = null;
                class301.field4715.field288 = null;
                class301.field4715.field289 = null;
            }
        } catch (IOException var4) {
            class225.field3501 = null;
            class278.field4273 = null;
            class110.field1738 = null;
            class176.field2626 = null;
        }
        if (class20.field222 != 0) {
            class87.field1285 = true;
        }
        class33.field413 = class142.field2203;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 205)
    private final void method1762(int arg0) {
        for (class179.field2681 = 0; class325.method2231((byte) -80) && class179.field2681 < 128; class179.field2681++) {
            class320.field4985[class179.field2681] = class170.field2532;
            class31.field399[class179.field2681] = class60.field896;
        }
        field3786++;
        class88.field1297++;
        if (arg0 < 120) {
            this.method1385((byte) 108);
        }
        if (class319.field4972 != -1) {
            class146.method1090(0, class319.field4972, -1, 0, class125.field1972, 0, 0, class210.field3314);
        }
        class319.field4980++;
        if (class36.field534) {
            int var2 = 19137023;
            label190: for (int var3 = 0; var3 < 32768; var3++) {
                class45 var4 = class161.field2394[var3];
                if (var4 != null) {
                    byte var5 = var4.field698.field2754;
                    if ((var5 & 0x2) > 0 && var4.field4453 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field4477[0] = (var4.field4507 >> 7) + var6;
                            var4.field4501[0] = 1;
                            var4.field4470[0] = (var4.field4496 >> 7) + var7;
                            class90.field1309[class50.field775].method2214(false, 0, 21011, var4.method929(12), var4.field4496 >> 7, var4.method929(12), var4.field4507 >> 7);
                            if (var4.field4477[0] >= 0 && var4.field4477[0] <= (104 - var4.method929(12)) && var4.field4470[0] >= 0 && var4.field4470[0] <= (104 - var4.method929(12)) && class90.field1309[class50.field775].method2205(19661058, var4.field4477[0], var4.field4496 >> 7, var4.field4470[0], var4.field4507 >> 7)) {
                                if (var4.method929(12) > 1) {
                                    for (int var8 = var4.field4477[0]; var4.field4477[0] + var4.method929(12) > var8; var8++) {
                                        for (int var9 = var4.field4470[0]; var9 < (var4.field4470[0] + var4.method929(12)); var9++) {
                                            if ((var2 & class90.field1309[class50.field775].field5037[var8][var9]) != 0) {
                                                continue label190;
                                            }
                                        }
                                    }
                                }
                                var4.field4453 = 1;
                            }
                        }
                    }
                    class271.method1883(var4, 104);
                    class34.method237(-116, var4);
                    class218.method1562(var4, false);
                    class90.field1309[class50.field775].method2216(var4.method929(12), false, (byte) -94, var4.method929(12), var4.field4507 >> 7, var4.field4496 >> 7);
                }
            }
        }
        if (!class36.field534) {
            class65.method560(78);
        } else if (class242.field3637 == 0 && class204.field3240 == 0) {
            if (class78.field1104 == 2) {
                class171.method1253(true);
            } else {
                class171.method1255(89);
            }
            if ((class220.field3455 >> 7) < 14 || (class220.field3455 >> 7) >= 90 || class311.field4845 >> 7 < 14 || class311.field4845 >> 7 >= 90) {
                class50.method459(8);
            }
        }
        while (true) {
            class167 var10;
            class184 var11;
            class184 var12;
            do {
                var10 = (class167) class109.field1672.method979(49);
                if (var10 == null) {
                    while (true) {
                        class167 var13;
                        class184 var17;
                        class184 var18;
                        do {
                            var13 = (class167) class271.field4085.method979(49);
                            if (var13 == null) {
                                while (true) {
                                    class167 var14;
                                    class184 var15;
                                    class184 var16;
                                    do {
                                        var14 = (class167) class35.field473.method979(49);
                                        if (var14 == null) {
                                            if (class152.field2290 != null) {
                                                class33.method231(117);
                                            }
                                            if (class138.field2159 != null && class138.field2159.field3585 == 1) {
                                                if (class138.field2159.field3590 != null) {
                                                    class80.method631(class137.field2134, class45.field700, (byte) 118);
                                                }
                                                class45.field700 = false;
                                                class137.field2134 = null;
                                                class138.field2159 = null;
                                            }
                                            if ((class312.field4852 % 1500) == 0) {
                                                class310.method2146(-121);
                                            }
                                            return;
                                        }
                                        var15 = var14.field2518;
                                        if (var15.field2893 < 0) {
                                            break;
                                        }
                                        var16 = class100.method781((byte) 48, var15.field2974);
                                    } while (var16 == null || var16.field2946 == null || var16.field2946.length <= var15.field2893 || var16.field2946[var15.field2893] != var15);
                                    class272.method1889(1, var14);
                                }
                            }
                            var17 = var13.field2518;
                            if (var17.field2893 < 0) {
                                break;
                            }
                            var18 = class100.method781((byte) 48, var17.field2974);
                        } while (var18 == null || var18.field2946 == null || var17.field2893 >= var18.field2946.length || var18.field2946[var17.field2893] != var17);
                        class272.method1889(1, var13);
                    }
                }
                var11 = var10.field2518;
                if (var11.field2893 < 0) {
                    break;
                }
                var12 = class100.method781((byte) 48, var11.field2974);
            } while (var12 == null || var12.field2946 == null || var11.field2893 >= var12.field2946.length || var12.field2946[var11.field2893] != var11);
            class272.method1889(1, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 420)
    private final void method1763(byte arg0) {
        if (!class235.field3605) {
            label241: while (true) {
                do {
                    if (!class325.method2231((byte) 117)) {
                        break label241;
                    }
                } while (class60.field896 != 's' && class60.field896 != 'S');
                class235.field3605 = true;
            }
        }
        field3783++;
        if (class116.field1818 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class234.method1650((byte) 50);
            if (class260.field3853 == 0L) {
                class260.field3853 = var28;
            }
            if (var27 > 16384 && var28 - class260.field3853 < 5000L) {
                if (var28 - class274.field4214 > 1000L) {
                    System.gc();
                    class274.field4214 = var28;
                }
                class38.field569 = 5;
                class69.field1012 = class153.field2302;
            } else {
                class116.field1818 = 10;
                class69.field1012 = class29.field331;
                class38.field569 = 5;
            }
        } else if (class116.field1818 == 10) {
            class286.method2005(4, 104, 104);
            for (int var25 = 0; var25 < 4; var25++) {
                class90.field1309[var25] = new class323(104, 104);
            }
            class38.field569 = 10;
            class69.field1012 = class315.field4902;
            class116.field1818 = 30;
        } else if (class116.field1818 == 30) {
            if (class277.field4264 == null) {
                class277.field4264 = new class196(class110.field1746, class292.field4587);
            }
            if (class277.field4264.method1423(-32)) {
                class260.field3854 = class65.method559(false, true, 0, 76, true);
                class154.field2325 = class65.method559(false, true, 1, 121, true);
                class301.field4719 = class65.method559(true, false, 2, 117, true);
                class248.field3724 = class65.method559(false, true, 3, 48, true);
                class232.field3582 = class65.method559(false, true, 4, 118, true);
                class246.field3710 = class65.method559(true, true, 5, 72, true);
                class178.field2663 = class65.method559(true, true, 6, 90, false);
                class302.field4728 = class65.method559(false, true, 7, 31, true);
                class80.field1118 = class65.method559(false, true, 8, 66, true);
                class17.field203 = class65.method559(false, true, 9, 22, true);
                class154.field2322 = class65.method559(false, true, 10, 84, true);
                class136.field2123 = class65.method559(false, true, 11, 112, true);
                class133.field2098 = class65.method559(false, true, 12, 40, true);
                class51.field786 = class65.method559(false, true, 13, 45, true);
                class282.field4357 = class65.method559(false, true, 14, 21, false);
                class14.field158 = class65.method559(false, true, 15, 12, true);
                class86.field1263 = class65.method559(false, true, 16, 95, true);
                class299.field4708 = class65.method559(false, true, 17, 30, true);
                class322.field5011 = class65.method559(false, true, 18, 6, true);
                class205.field3249 = class65.method559(false, true, 19, 25, true);
                class17.field204 = class65.method559(false, true, 20, 91, true);
                class51.field794 = class65.method559(false, true, 21, 103, true);
                class301.field4717 = class65.method559(false, true, 22, 68, true);
                class220.field3451 = class65.method559(true, true, 23, 37, true);
                class319.field4974 = class65.method559(false, true, 24, 25, true);
                class291.field4574 = class65.method559(false, true, 25, 106, true);
                class279.field4295 = class65.method559(true, true, 26, 29, true);
                class125.field1967 = class65.method559(false, true, 27, 56, true);
                class69.field1012 = class146.field2234;
                class38.field569 = 15;
                class116.field1818 = 40;
            } else {
                class38.field569 = 12;
                class69.field1012 = field3800;
            }
        } else if (class116.field1818 == 40) {
            int var23 = 0;
            for (int var24 = 0; var24 < 28; var24++) {
                var23 += class142.field2204[var24].method757((byte) -94) * class132.field2068[var24] / 100;
            }
            if (var23 == 100) {
                class38.field569 = 20;
                class69.field1012 = class309.field4809;
                class190.method1369(class80.field1118, true);
                class315.method2169(class80.field1118, -79);
                class95.method752(0, class80.field1118);
                class116.field1818 = 45;
            } else {
                class38.field569 = 20;
                if (var23 != 0) {
                    class69.field1012 = class58.field867 + var23 + "%";
                }
            }
        } else if (class116.field1818 == 45) {
            class50.method460((byte) 98, class213.field3387, 22050, 2);
            class110.field1747 = new class109();
            class110.field1747.method836(128, (byte) 126, 9);
            class256.field3818 = class171.method1252(class301.field4715, -101, class171.field2548, 0, 22050);
            class256.field3818.method1856(117, class110.field1747);
            class238.method1659(class110.field1747, 11, class282.field4357, class232.field3582, class14.field158);
            class261.field3861 = class171.method1252(class301.field4715, -22, class171.field2548, 1, 2048);
            class200.field3165 = new class313();
            class261.field3861.method1856(117, class200.field3165);
            class293.field4599 = new class302(22050, class41.field607);
            class232.field3584 = class178.field2663.method1519((byte) 16, "scape main");
            class69.field1012 = class310.field4829;
            class38.field569 = 30;
            class116.field1818 = 50;
        } else if (class116.field1818 == 50) {
            int var21 = class314.method2168(0, class80.field1118, class51.field786);
            int var22 = class248.method1724(14183);
            if (var21 >= var22) {
                class69.field1012 = class143.field2210;
                class116.field1818 = 60;
                class38.field569 = 35;
            } else {
                class69.field1012 = class12.field134 + var21 * 100 / var22 + "%";
                class38.field569 = 35;
            }
        } else if (class116.field1818 == 60) {
            int var2 = class188.method1360(0, class80.field1118);
            int var3 = class83.method686((byte) -105);
            if (var3 <= var2) {
                class69.field1012 = class55.field821;
                class116.field1818 = 65;
                class38.field569 = 40;
            } else {
                class38.field569 = 40;
                class69.field1012 = class302.field4741 + var2 * 100 / var3 + "%";
            }
        } else if (class116.field1818 == 65) {
            class293.method2065(class80.field1118, class51.field786, true);
            class69.field1012 = class132.field2070;
            class38.field569 = 45;
            class113.method889(108, 5);
            class116.field1818 = 70;
        } else if (class116.field1818 == 70) {
            class301.field4719.method1514((byte) 77);
            byte var9 = 0;
            int var10 = var9 + class301.field4719.method1518(-29040);
            class86.field1263.method1514((byte) -117);
            int var11 = var10 + class86.field1263.method1518(-29040);
            class299.field4708.method1514((byte) -127);
            int var12 = var11 + class299.field4708.method1518(-29040);
            class322.field5011.method1514((byte) 84);
            int var13 = var12 + class322.field5011.method1518(-29040);
            class205.field3249.method1514((byte) -119);
            int var14 = var13 + class205.field3249.method1518(-29040);
            class17.field204.method1514((byte) -123);
            int var15 = var14 + class17.field204.method1518(-29040);
            class51.field794.method1514((byte) 81);
            int var16 = var15 + class51.field794.method1518(-29040);
            class301.field4717.method1514((byte) 8);
            int var17 = var16 + class301.field4717.method1518(-29040);
            class319.field4974.method1514((byte) 113);
            int var18 = var17 + class319.field4974.method1518(-29040);
            class291.field4574.method1514((byte) 79);
            int var19 = var18 + class291.field4574.method1518(-29040);
            class125.field1967.method1514((byte) -116);
            int var20 = var19 + class125.field1967.method1518(-29040);
            if (var20 < 1100) {
                class38.field569 = 50;
                class69.field1012 = class329.field5099 + var20 / 11 + "%";
            } else {
                class95.method754(class301.field4719, true);
                class197.method1431(14, class301.field4719);
                class158.method1140(class301.field4719, false);
                class38.method351((byte) 125, class301.field4719, class302.field4728);
                class231.method1644(class302.field4728, class86.field1263, true, (byte) -51);
                class92.method732(class302.field4728, -9345, class322.field5011);
                class13.method101(true, -126, class205.field3249, class302.field4728, class159.field2371);
                class116.method903(true, class301.field4719);
                class276.method1940(class154.field2325, class17.field204, class260.field3854, -84);
                class242.method1676(114, class301.field4719);
                class117.method909(class51.field794, class302.field4728, 14);
                class203.method1464(class301.field4717, (byte) 112);
                class96.method766(-65, class301.field4719);
                class117.method911(true, class248.field3724, class51.field786, class302.field4728, class80.field1118);
                class73.method606(-82, class301.field4719);
                class178.method1288((byte) 83, class299.field4708);
                class147.method1094(false, class319.field4974, class291.field4574, new class238());
                class178.method1292(23, class291.field4574, class319.field4974);
                class31.method217((byte) -102, class301.field4719);
                class53.method477(class301.field4719, 32203, class80.field1118);
                class241.method1669((byte) -40, class301.field4719, class80.field1118);
                class38.field569 = 50;
                class69.field1012 = class156.field2347;
                class218.method1566((byte) -108);
                class116.field1818 = 80;
            }
        } else if (class116.field1818 == 80) {
            int var4 = class258.method1791(false, class80.field1118);
            int var5 = class161.method1152(-1);
            if (var4 < var5) {
                class38.field569 = 60;
                class69.field1012 = class253.field3775 + var4 * 100 / var5 + "%";
            } else {
                class54.method478((byte) 62, class80.field1118);
                class38.field569 = 60;
                class116.field1818 = 90;
                class69.field1012 = class154.field2328;
            }
        } else if (class116.field1818 == 90) {
            if (class279.field4295.method1514((byte) -128)) {
                class262 var8 = new class262(class17.field203, class279.field4295, class80.field1118, 20, !class325.field5062);
                class56.method501(var8);
                if (class317.field4926 == 1) {
                    class56.method508(0.9F);
                }
                if (class317.field4926 == 2) {
                    class56.method508(0.8F);
                }
                if (class317.field4926 == 3) {
                    class56.method508(0.7F);
                }
                if (class317.field4926 == 4) {
                    class56.method508(0.6F);
                }
                class116.field1818 = 100;
                class69.field1012 = class11.field126;
                class38.field569 = 70;
            } else {
                class69.field1012 = class158.field2369 + class279.field4295.method1518(-29040) + "%";
                class38.field569 = 70;
            }
        } else if (arg0 <= -25) {
            if (class116.field1818 == 100) {
                if (class13.method100(19461, class80.field1118)) {
                    class116.field1818 = 110;
                }
            } else if (class116.field1818 == 110) {
                class109.field1719 = new class245();
                class301.field4715.method163(10, (byte) -126, class109.field1719);
                class116.field1818 = 120;
                class69.field1012 = class33.field416;
                class38.field569 = 75;
            } else if (class116.field1818 == 120) {
                if (class154.field2322.method1530("huffman", "", (byte) -115)) {
                    class314 var6 = new class314(class154.field2322.method1529("", -1, "huffman"));
                    class110.method878(2, var6);
                    class38.field569 = 80;
                    class116.field1818 = 130;
                    class69.field1012 = class224.field3491;
                } else {
                    class69.field1012 = class281.field4335 + "0%";
                    class38.field569 = 80;
                }
            } else if (class116.field1818 == 130) {
                if (!class248.field3724.method1514((byte) -128)) {
                    class69.field1012 = class22.field234 + class248.field3724.method1518(-29040) * 3 / 4 + "%";
                    class38.field569 = 85;
                } else if (!class133.field2098.method1514((byte) 71)) {
                    class69.field1012 = class22.field234 + ((class133.field2098.method1518(-29040) / 10) + 75) + "%";
                    class38.field569 = 85;
                } else if (!class51.field786.method1514((byte) -116)) {
                    class69.field1012 = class22.field234 + (class51.field786.method1518(-29040) / 20 + 85) + "%";
                    class38.field569 = 85;
                } else if (class220.field3451.method1524(127, "details")) {
                    class182.method1312(class38.field577, false, class220.field3451);
                    class38.field569 = 95;
                    class116.field1818 = 135;
                    class69.field1012 = class10.field107;
                } else {
                    class69.field1012 = class22.field234 + (class220.field3451.method1499((byte) -67, "details") / 10 + 90) + "%";
                    class38.field569 = 85;
                }
            } else if (class116.field1818 == 135) {
                int var7 = class294.method2074(-110);
                if (var7 == -1) {
                    class69.field1012 = class65.field967;
                    class38.field569 = 95;
                } else if (var7 == 7 || var7 == 9) {
                    this.method1381("worldlistfull", 0);
                    class113.method889(115, 1000);
                } else if (class10.field105) {
                    class38.field569 = 96;
                    class116.field1818 = 140;
                    class69.field1012 = class236.field3613;
                } else {
                    this.method1381("worldlistio_" + var7, 0);
                    class113.method889(112, 1000);
                }
            } else if (class116.field1818 == 140) {
                class3.field5 = class248.field3724.method1519((byte) 16, "loginscreen");
                class246.field3710.method1521(-92, true, false);
                class178.field2663.method1521(-82, true, true);
                class80.field1118.method1521(-40, true, true);
                class51.field786.method1521(-17, true, true);
                class154.field2322.method1521(-72, true, true);
                class248.field3724.method1521(-42, true, true);
                class38.field569 = 97;
                class69.field1012 = class133.field2095;
                class41.field617 = true;
                class116.field1818 = 150;
            } else if (class116.field1818 == 150) {
                class19.method133();
                if (class235.field3605) {
                    class117.field1834 = 0;
                    class107.field1647 = 0;
                    class6.field63 = 0;
                    class204.field3246 = 0;
                }
                class235.field3605 = true;
                class128.method987(0, class301.field4715);
                class94.method743(class6.field63, -1, 114, -1, false);
                class116.field1818 = 160;
                class38.field569 = 100;
                class69.field1012 = class80.field1119;
            } else if (class116.field1818 == 160) {
                class146.method1088(3000, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 926)
    public final void method1385(byte arg0) {
        method1771(arg0 + 27044);
        field3798++;
        class116.method902(-113);
        class190.method1367(false);
        class11.method90(arg0 + 125);
        class171.method1251(128);
        class21.method147(93);
        class249.method1726((byte) 53);
        class191.method1389(87);
        class36.method304();
        class209.method1488((byte) 15);
        class206.method1475((byte) 13);
        class245.method1697(-56);
        class273.method1897(true);
        class35.method271((byte) 107);
        class118.method913((byte) 98);
        class4.method51(0);
        class60.method539(0);
        class196.method1424(4652);
        class95.method747(-18347);
        class211.method1516((byte) 127);
        class266.method1841((byte) -112);
        class137.method1044(27327);
        class197.method1438(arg0 - 15002);
        class45.method411(105);
        class7.method68(arg0 ^ 0x44);
        class323.method2217(true);
        class184.method1345((byte) -105);
        class44.method408(1);
        class121.method930((byte) 82);
        class128.method978(arg0 ^ 0xFFFFFF9F);
        class27.method179(false);
        class29.method204(true);
        class241.method1668((byte) -68);
        class175.method1270(false);
        class304.method2119(-512);
        class109.method851(24087);
        class267.method1850(0);
        class302.method2114(true);
        class230.method1628((byte) -124);
        class162.method1165(-122);
        class288.method2041(7);
        class99.method775(-13856);
        class101.method789(-14328);
        class152.method1120(arg0 ^ 0x56FA);
        class183.method1322(0);
        class111.method882(85);
        class276.method1929((byte) -103);
        class142.method1073(arg0 + 62);
        class287.method2021(true);
        class271.method1886((byte) 120);
        class160.method1151((byte) 108);
        class69.method578(24502);
        class108.method832(-97);
        class258.method1796(false);
        class98.method773(-998);
        class308.method2135((byte) 123);
        class55.method486(103);
        class224.method1600((byte) 122);
        class49.method456((byte) 49);
        class324.method2225(-9);
        class154.method1129(false);
        class6.method57((byte) 116);
        class188.method1357(2);
        class51.method467(87);
        class321.method2194((byte) -90);
        class264.method1821();
        class75.method611(arg0 - 29012);
        class42.method389();
        class136.method1038((byte) 26);
        class165.method1206();
        class274.method1914((byte) 108);
        class85.method695();
        class37.method343((byte) 126);
        class155.method1134((byte) -112);
        class166.method1218();
        class265.method1832(false);
        class149.method1106(12158);
        class76.method612((byte) -20);
        class292.method2063(false);
        class48.method451();
        class232.method1646(3);
        class127.method967();
        class210.method1492(-22349);
        class312.method2154(0);
        class283.method1990();
        class286.method2014();
        class318.method2179((byte) -102);
        class32.method228((byte) 105);
        class180.method1304(121);
        class322.method2201(true);
        class260.method1799(arg0 ^ 0x21);
        class168.method1225();
        class326.method2235(arg0 ^ 0xFFFFFFF2);
        class144.method1083((byte) -43);
        class86.method710(-126);
        class106.method823((byte) -47);
        class319.method2184(arg0 + 20798);
        class193.method1401(-20564);
        class200.method1449(128);
        class279.method1963(arg0 + 130);
        class277.method1952(arg0 ^ 0x3D);
        class204.method1468(-3);
        class132.method1003(1);
        class269.method1872(0);
        class126.method953((byte) 33);
        class105.method814((byte) 47);
        class87.method719(true);
        class218.method1567(-24946);
        class243.method1687(-94);
        class238.method1660((byte) -112);
        class270.method1877(107);
        class138.method1049(-81);
        class110.method872(true);
        class73.method604(16915);
        class262.method1806(-1);
        class272.method1890(64);
        class89.method722(arg0 ^ 0x3D);
        class56.method495();
        class314.method2165(true);
        class90.method726((byte) 96);
        class65.method556(false);
        class133.method1011(-113);
        class220.method1572(222);
        class80.method630(false);
        class19.method138();
        class297.method2092(-124);
        class13.method105(-127);
        class167.method1221(32);
        class310.method2147((byte) 123);
        class123.method941();
        class96.method767(true);
        class10.method79(21736);
        class290.method2047(false);
        class173.method1261((byte) -128);
        class107.method827((byte) 112);
        class24.method153();
        class112.method884(arg0 ^ 0xFFFFFF85);
        class225.method1606((byte) 74);
        class81.method634(arg0 ^ 0xFFFFFFCA);
        class202.method1461();
        class102.method801(3);
        class284.method1999();
        class320.method2189(-1);
        class247.method1705();
        class223.method1592();
        class236.method1655((byte) 99);
        class58.method520(true);
        class147.method1097((byte) 75);
        class278.method1957(7);
        class16.method122((byte) 7);
        class17.method125((byte) 25);
        class61.method545();
        class141.method1061(arg0 + 72);
        class54.method480(21);
        class194.method1417();
        class159.method1146((byte) -35);
        class176.method1275(1);
        class67.method569((byte) 119);
        class63.method551(true);
        class307.method2131(205);
        class97.method771(1);
        class30.method215(arg0 - 2118089248);
        class14.method108(-21708);
        class181.method1308(false);
        class253.method1758((byte) -128);
        class293.method2064((byte) -58);
        class246.method1700(true);
        class158.method1145(2560);
        class77.method621((byte) 75);
        class244.method1690(arg0 + 127);
        class150.method1111(true);
        class227.method1610((byte) 82);
        class328.method2240(arg0 ^ 0xFFFFC31E);
        class207.method1477((byte) 112);
        class164.method1173();
        class315.method2170(arg0 ^ 0xFFFFFEC2);
        class40.method357(-32);
        class252.method1751(113);
        class100.method779(94);
        class161.method1156((byte) -113);
        class329.method2243(4);
        class131.method996();
        class84.method689();
        class255.method1780(-119);
        class257.method1788(86);
        class291.method2054(arg0 + 8669);
        class163.method1171((byte) 29);
        class46.method417();
        class316.method2172();
        class268.method1862(arg0 ^ 0xFFFFFFC2);
        class33.method230(-80);
        class280.method1968();
        class139.method1055();
        class289.method2044(-108);
        class177.method1286(arg0 ^ 0xFFFFFFC1);
        class294.method2078((byte) 115);
        class201.method1458((byte) 113);
        class208.method1483((byte) 102);
        if (arg0 != -62) {
            this.method1762(-117);
        }
        class124.method947((byte) -100);
        class83.method683(0);
        class222.method1591((byte) -98);
        class153.method1124(83);
        class92.method734(0);
        class282.method1988(-5279);
        class327.method2238(-81);
        class311.method2151(-2);
        class38.method350(5899);
        class53.method476(-15651);
        class143.method1079(true);
        class22.method148(0);
        class248.method1723(true);
        class199.method1445(-25367);
        class119.method924((byte) 41);
        class12.method98((byte) -114);
        class299.method2102(-124);
        class62.method549(true);
        class250.method1734(3);
        class28.method193((byte) -127);
        class50.method462(52);
        class182.method1316(15731);
        class235.method1651(1);
        class298.method2098(arg0 ^ 0xFFFFFF8B);
        class256.method1783(true);
        class57.method517(true);
        class263.method1815((byte) 93);
        class66.method563(arg0 ^ 0x3843D14E);
        class34.method232(true);
        class178.method1291((byte) -42);
        class213.method1540(45);
        class179.method1299(80);
        class79.method626(101);
        class135.method1035((byte) -99);
        class261.method1801(57);
        class281.method1982(-30742);
        class309.method2140(0);
        class130.method993(false);
        class88.method721(0);
        class146.method1091(false);
        class59.method523(1539230348);
        class39.method354(false);
        class231.method1643(114);
        class15.method119((byte) 99);
        class125.method951(4096);
        class242.method1675((byte) 85);
        class64.method553(false);
        class170.method1250(2);
        class301.method2107(11808);
        class43.method405(0);
        class3.method39((byte) -111);
        class317.method2175(97);
        class205.method1470(13295);
        class41.method367(0);
        class156.method1138(0);
        class113.method885(arg0 - 241468696);
        class78.method625(-32631);
        class305.method2128(64);
        class31.method219((byte) 94);
        class20.method141(arg0 + 62);
        class228.method1620((byte) -98);
        class71.method594((byte) -50);
        class114.method891((byte) -51);
        class212.method1533((byte) 106);
        if (class191.field3078) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1201)
    public static final void main(String[] arg0) {
        field3784++;
        try {
            if (arg0.length != 4) {
                class179.method1302("argument count", 1);
            }
            class110.field1739 = Integer.parseInt(arg0[0]);
            class20.field222 = 2;
            if (arg0[1].equals("live")) {
                class183.field2755 = 0;
            } else if (arg0[1].equals("rc")) {
                class183.field2755 = 1;
            } else if (arg0[1].equals("wip")) {
                class183.field2755 = 2;
            } else {
                class179.method1302("modewhat", 1);
            }
            class212.field3367 = false;
            class98.field1452 = class115.method898((byte) 110, arg0[2]);
            if (class98.field1452 == -1) {
                if (arg0[2].equals("english")) {
                    class98.field1452 = 0;
                } else if (arg0[2].equals("german")) {
                    class98.field1452 = 1;
                } else {
                    class179.method1302("language", 1);
                }
            }
            class128.method983((byte) 104, class98.field1452);
            class244.field3681 = false;
            class162.field2408 = false;
            if (arg0[3].equals("game0")) {
                class3.field12 = 0;
            } else if (arg0[3].equals("game1")) {
                class3.field12 = 1;
            } else {
                class179.method1302("game", 1);
            }
            class92.field1339 = false;
            class317.field4923 = 0;
            class180.field2701 = 0;
            class287.field4426 = "";
            client var1 = new client();
            class99.field1457 = var1;
            var1.method1379("runescape", false, 1024, class183.field2755 + 32, 532, -89, 28, 768);
            class184.field2857.setLocation(40, 40);
        } catch (Exception var3) {
            class50.method464((byte) 45, (String) null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lek;)Lrf;", line = 1270)
    public static final class276 method1764(class184 arg0) {
        class276 var1 = (class276) class76.field1074.method203(1710, ((long) arg0.field2806 << 32) + (long) arg0.field2893);
        return var1 == null ? arg0.field2833 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1275)
    private final void method1765(boolean arg0) {
        if (!arg0) {
            this.method1378(101);
        }
        field3789++;
        boolean var2 = class110.field1746.method44(false);
        if (!var2) {
            this.method1769(102);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1291)
    public final void method1377(int arg0) {
        field3799++;
        if (class305.field4771 == 1000) {
            return;
        }
        class312.field4852++;
        if ((class312.field4852 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class159.field2373 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class3.field7.setSeed((long) class159.field2373);
        }
        this.method1765(true);
        if (class277.field4264 != null) {
            class277.field4264.method1427(-6715);
        }
        class80.method629(13751);
        method1774(-102);
        class122.method936(122);
        class171.method1254(false);
        if (arg0 != -29461) {
            return;
        }
        if (class36.field534) {
            class166.method1214();
        }
        if (class95.field1392 != null) {
            int var3 = class95.field1392.method988(false);
            class109.field1715 = var3;
        }
        if (class305.field4771 == 0) {
            this.method1763((byte) -117);
            class16.method121(false);
        } else if (class305.field4771 == 5) {
            this.method1763((byte) -32);
            class16.method121(false);
        } else if (class305.field4771 == 25 || class305.field4771 == 28) {
            class184.method1347((byte) -128);
        }
        if (class305.field4771 == 10) {
            this.method1762(125);
            class54.method484(255);
            class39.method355((byte) -65);
            class94.method744((byte) -10);
        } else if (class305.field4771 == 30) {
            class287.method2023(-5);
        } else if (class305.field4771 == 40) {
            class94.method744((byte) -10);
            if (class311.field4847 != -3) {
                if (class311.field4847 == 15) {
                    class327.method2237(arg0 + 29460);
                } else if (class311.field4847 != 2) {
                    class205.method1471((byte) 114);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1393)
    public final void method1378(int arg0) {
        field3792++;
        if (class305.field4771 == 1000) {
            return;
        }
        boolean var2 = class94.method741((byte) 72);
        if (var2 && class213.field3386 && class256.field3818 != null) {
            class256.field3818.method1851((byte) 24);
        }
        if ((class305.field4771 == 30 || class305.field4771 == 10) && (class79.field1114 || class212.field3361 != 0L && class212.field3361 < class234.method1650((byte) -117))) {
            class94.method743(class76.method613((byte) 110), class44.field684, 115, class100.field1498, class79.field1114);
        }
        if (class63.field951 == null) {
            Container var3;
            if (class63.field951 != null) {
                var3 = class63.field951;
            } else if (class184.field2857 == null) {
                var3 = class301.field4715.field285;
            } else {
                var3 = class184.field2857;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class184.field2857 == var3) {
                Insets var6 = class184.field2857.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class99.field1461 != var4 || class255.field3814 != var5) {
                if (class26.field294.startsWith("mac")) {
                    class255.field3814 = var5;
                    class99.field1461 = var4;
                } else {
                    class188.method1356(-118);
                }
                class212.field3361 = class234.method1650((byte) 67) + 500L;
            }
        }
        if (class63.field951 != null && !class28.field321 && (class305.field4771 == 30 || class305.field4771 == 10)) {
            class94.method743(class6.field63, -1, 126, -1, false);
        }
        boolean var7 = false;
        if (class188.field2994) {
            class188.field2994 = false;
            var7 = true;
        }
        if (var7) {
            class130.method991(arg0 - 85);
        }
        if (class36.field534) {
            for (int var8 = 0; var8 < 100; var8++) {
                class40.field597[var8] = true;
            }
        }
        if (class305.field4771 == arg0) {
            class45.method416(class38.field569, (Color) null, class69.field1012, var7, -31017);
        } else if (class305.field4771 == 5) {
            class51.method466(false, (byte) 10, class64.field956);
        } else if (class305.field4771 == 10) {
            class15.method116(false);
        } else if (class305.field4771 == 25 || class305.field4771 == 28) {
            if (class78.field1097 == 1) {
                if (class55.field824 > class302.field4725) {
                    class302.field4725 = class55.field824;
                }
                int var10 = (class302.field4725 - class55.field824) * 50 / class302.field4725;
                class47.method421(class107.field1646 + "<br>(" + var10 + "%)", false, (byte) 34);
            } else if (class78.field1097 == 2) {
                if (class78.field1102 < class163.field2427) {
                    class78.field1102 = class163.field2427;
                }
                int var9 = (class78.field1102 - class163.field2427) * 50 / class78.field1102 + 50;
                class47.method421(class107.field1646 + "<br>(" + var9 + "%)", false, (byte) 54);
            } else {
                class47.method421(class107.field1646, false, (byte) 47);
            }
        } else if (class305.field4771 == 30) {
            class232.method1647((byte) -123);
        } else if (class305.field4771 == 40) {
            class47.method421(class59.field884 + "<br>" + class43.field678, false, (byte) 76);
        }
        if (class36.field534 && class305.field4771 != 0) {
            class36.method327();
            for (int var17 = 0; var17 < class112.field1762; var17++) {
                class238.field3621[var17] = false;
            }
        } else if ((class305.field4771 == 30 || class305.field4771 == 10) && class301.field4718 == 0 && !var7) {
            try {
                Graphics var11 = class171.field2548.getGraphics();
                for (int var12 = 0; var12 < class112.field1762; var12++) {
                    if (class238.field3621[var12]) {
                        class128.field2023.method619(class266.field3990[var12], 0, class154.field2331[var12], class245.field3687[var12], var11, class304.field4765[var12]);
                        class238.field3621[var12] = false;
                    }
                }
            } catch (Exception var19) {
                class171.field2548.repaint();
            }
        } else if (class305.field4771 != 0) {
            try {
                Graphics var14 = class171.field2548.getGraphics();
                class128.field2023.method623(0, var14, 0, -117);
                for (int var15 = 0; var15 < class112.field1762; var15++) {
                    class238.field3621[var15] = false;
                }
            } catch (Exception var18) {
                class171.field2548.repaint();
            }
        }
        if (class41.field617) {
            class263.method1816((byte) -35);
        }
        if (class235.field3605 && class305.field4771 == 10 && class319.field4972 != -1) {
            class235.field3605 = false;
            class128.method987(arg0, class301.field4715);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 1615)
    private final void method1766(int arg0, int arg1) {
        field3795++;
        class110.field1746.field44++;
        class288.field4441 = null;
        class110.field1746.field45 = arg1;
        class105.field1613 = arg0;
        class274.field4212 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lek;)Z", line = 1629)
    public static final boolean method1767(class184 arg0) {
        if (class199.field3147) {
            if (method1764(arg0).field4234 != 0) {
                return false;
            }
            if (arg0.field2945 == 0) {
                return false;
            }
        }
        return arg0.field2939;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lek;IIIIIII)V", line = 1644)
    public static final void method1768(class184[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class184 var9 = arg0[var8];
            if (var9 != null && var9.field2974 == arg1 && (!var9.field2802 || var9.field2945 == 0 || var9.field2957 || method1764(var9).field4234 != 0 || class102.field1581 == var9 || var9.field2881 == 1338) && (!var9.field2802 || !method1767(var9))) {
                int var10 = var9.field2948 + arg6;
                int var11 = var9.field2887 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2945 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2890 + var10;
                    int var17 = var9.field2904 + var11;
                    if (var9.field2945 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class152.field2290 == var9) {
                    class106.field1621 = true;
                    class311.field4843 = var10;
                    class298.field4676 = var11;
                }
                if (!var9.field2802 || var12 < var14 && var13 < var15) {
                    if (var9.field2945 == 0) {
                        if (!var9.field2802 && method1767(var9) && class322.field5012 != var9) {
                            continue;
                        }
                        if (var9.field2886 && class273.field4129 >= var12 && class295.field4646 >= var13 && class273.field4129 < var14 && class295.field4646 < var15) {
                            for (class167 var18 = (class167) class35.field473.method986(false); var18 != null; var18 = (class167) class35.field473.method982(14877)) {
                                if (var18.field2509) {
                                    var18.method1554((byte) -58);
                                    var18.field2518.field2875 = false;
                                }
                            }
                            if (class96.field1404 == 0) {
                                class152.field2290 = null;
                                class102.field1581 = null;
                            }
                            class250.field3752 = 0;
                        }
                    }
                    if (var9.field2802) {
                        boolean var19;
                        if (class273.field4129 >= var12 && class295.field4646 >= var13 && class273.field4129 < var14 && class295.field4646 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class31.field400 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class292.field4593 == 1 && class97.field1446 >= var12 && class38.field573 >= var13 && class97.field1446 < var14 && class38.field573 < var15) {
                            var21 = true;
                        }
                        if (var9.field2940 != null) {
                            for (int var22 = 0; var22 < var9.field2940.length; var22++) {
                                if (class50.field768[var9.field2940[var22]]) {
                                    if (var9.field2888 == null || class312.field4852 >= var9.field2888[var22]) {
                                        byte var23 = var9.field2851[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class50.field768[86]) && ((var23 & 0x1) == 0 || class50.field768[82]) && ((var23 & 0x4) == 0 || class50.field768[81])) {
                                            class219.method1570("", -1, -4620, var22 + 1, var9.field2806);
                                            int var24 = var9.field2835[var22];
                                            if (var9.field2888 == null) {
                                                var9.field2888 = new int[var9.field2940.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field2888[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field2888[var22] = class312.field4852 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field2888 != null) {
                                    var9.field2888[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class258.method1793(class97.field1446 - var10, class38.field573 - var11, (byte) 91, var9);
                        }
                        if (class152.field2290 != null && class152.field2290 != var9 && var19 && method1764(var9).method1938((byte) 78)) {
                            class227.field3514 = var9;
                        }
                        if (class102.field1581 == var9) {
                            class205.field3248 = true;
                            class161.field2389 = var10;
                            class122.field1925 = var11;
                        }
                        if (var9.field2957 || var9.field2881 != 0) {
                            if (var19 && class109.field1715 != 0 && var9.field2828 != null) {
                                class167 var25 = new class167();
                                var25.field2509 = true;
                                var25.field2518 = var9;
                                var25.field2508 = class109.field1715;
                                var25.field2510 = var9.field2828;
                                class35.field473.method977(4, var25);
                            }
                            if (class152.field2290 != null || class66.field976 != null || class67.field982 || var9.field2881 != 1400 && class250.field3752 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2881 != 0) {
                                if (var9.field2881 == 1337) {
                                    class252.field3768 = var9;
                                    class133.method1007(var9, 126);
                                    continue;
                                }
                                if (var9.field2881 == 1338) {
                                    if (var21) {
                                        class4.field21 = class97.field1446 - var10;
                                        class71.field1026 = class38.field573 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2881 == 1400) {
                                    class253.field3774 = var9;
                                    if (var21) {
                                        if (class50.field768[82] && class287.field4421 > 0) {
                                            int var26 = (int) ((double) (class97.field1446 - var10 - var9.field2890 / 2) * 2.0D / (double) class79.field1111);
                                            int var27 = (int) ((double) (class38.field573 - var11 - var9.field2904 / 2) * 2.0D / (double) class79.field1111);
                                            int var28 = class12.field136 + var26;
                                            int var29 = class241.field3631 + var27;
                                            int var30 = class69.field1018 + var28;
                                            int var31 = class193.field3089 + class318.field4932 - var29 - 1;
                                            class11.method88(var30, 24179, 0, var31);
                                            class22.method150((byte) -125);
                                            continue;
                                        }
                                        class250.field3752 = 1;
                                        class69.field1010 = class273.field4129;
                                        class43.field675 = class295.field4646;
                                        continue;
                                    }
                                    if (var20 && class250.field3752 > 0) {
                                        if (class250.field3752 == 1 && (class69.field1010 != class273.field4129 || class43.field675 != class295.field4646)) {
                                            class307.field4791 = class12.field136;
                                            class298.field4679 = class241.field3631;
                                            class250.field3752 = 2;
                                        }
                                        if (class250.field3752 == 2) {
                                            class87.method718((int) ((double) (class69.field1010 - class273.field4129) * 2.0D / (double) class175.field2588) + class307.field4791, (byte) 81);
                                            class16.method124((int) ((double) (class43.field675 - class295.field4646) * 2.0D / (double) class175.field2588) + class298.field4679, -1);
                                        }
                                        continue;
                                    }
                                    class250.field3752 = 0;
                                    continue;
                                }
                                if (var9.field2881 == 1401) {
                                    if (var20) {
                                        class276.method1930(var9.field2890, 19446, var9.field2904, class295.field4646 - var11, class273.field4129 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field2881 == 1402) {
                                    if (!class36.field534) {
                                        class133.method1007(var9, 119);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field2960 && var21) {
                                var9.field2960 = true;
                                if (var9.field2895 != null) {
                                    class167 var32 = new class167();
                                    var32.field2509 = true;
                                    var32.field2518 = var9;
                                    var32.field2513 = class97.field1446 - var10;
                                    var32.field2508 = class38.field573 - var11;
                                    var32.field2510 = var9.field2895;
                                    class35.field473.method977(4, var32);
                                }
                            }
                            if (var9.field2960 && var20 && var9.field2869 != null) {
                                class167 var33 = new class167();
                                var33.field2509 = true;
                                var33.field2518 = var9;
                                var33.field2513 = class273.field4129 - var10;
                                var33.field2508 = class295.field4646 - var11;
                                var33.field2510 = var9.field2869;
                                class35.field473.method977(4, var33);
                            }
                            if (var9.field2960 && !var20) {
                                var9.field2960 = false;
                                if (var9.field2854 != null) {
                                    class167 var34 = new class167();
                                    var34.field2509 = true;
                                    var34.field2518 = var9;
                                    var34.field2513 = class273.field4129 - var10;
                                    var34.field2508 = class295.field4646 - var11;
                                    var34.field2510 = var9.field2854;
                                    class271.field4085.method977(4, var34);
                                }
                            }
                            if (var20 && var9.field2838 != null) {
                                class167 var35 = new class167();
                                var35.field2509 = true;
                                var35.field2518 = var9;
                                var35.field2513 = class273.field4129 - var10;
                                var35.field2508 = class295.field4646 - var11;
                                var35.field2510 = var9.field2838;
                                class35.field473.method977(4, var35);
                            }
                            if (!var9.field2875 && var19) {
                                var9.field2875 = true;
                                if (var9.field2926 != null) {
                                    class167 var36 = new class167();
                                    var36.field2509 = true;
                                    var36.field2518 = var9;
                                    var36.field2513 = class273.field4129 - var10;
                                    var36.field2508 = class295.field4646 - var11;
                                    var36.field2510 = var9.field2926;
                                    class35.field473.method977(4, var36);
                                }
                            }
                            if (var9.field2875 && var19 && var9.field2947 != null) {
                                class167 var37 = new class167();
                                var37.field2509 = true;
                                var37.field2518 = var9;
                                var37.field2513 = class273.field4129 - var10;
                                var37.field2508 = class295.field4646 - var11;
                                var37.field2510 = var9.field2947;
                                class35.field473.method977(4, var37);
                            }
                            if (var9.field2875 && !var19) {
                                var9.field2875 = false;
                                if (var9.field2884 != null) {
                                    class167 var38 = new class167();
                                    var38.field2509 = true;
                                    var38.field2518 = var9;
                                    var38.field2513 = class273.field4129 - var10;
                                    var38.field2508 = class295.field4646 - var11;
                                    var38.field2510 = var9.field2884;
                                    class271.field4085.method977(4, var38);
                                }
                            }
                            if (var9.field2935 != null) {
                                class167 var39 = new class167();
                                var39.field2518 = var9;
                                var39.field2510 = var9.field2935;
                                class109.field1672.method977(4, var39);
                            }
                            if (var9.field2825 != null && class99.field1464 > var9.field2818) {
                                if (var9.field2855 == null || class99.field1464 - var9.field2818 > 32) {
                                    class167 var44 = new class167();
                                    var44.field2518 = var9;
                                    var44.field2510 = var9.field2825;
                                    class35.field473.method977(4, var44);
                                } else {
                                    label568: for (int var40 = var9.field2818; var40 < class99.field1464; var40++) {
                                        int var41 = class167.field2517[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field2855.length; var42++) {
                                            if (var9.field2855[var42] == var41) {
                                                class167 var43 = new class167();
                                                var43.field2518 = var9;
                                                var43.field2510 = var9.field2825;
                                                class35.field473.method977(4, var43);
                                                break label568;
                                            }
                                        }
                                    }
                                }
                                var9.field2818 = class99.field1464;
                            }
                            if (var9.field2917 != null && class64.field954 > var9.field2889) {
                                if (var9.field2849 == null || class64.field954 - var9.field2889 > 32) {
                                    class167 var49 = new class167();
                                    var49.field2518 = var9;
                                    var49.field2510 = var9.field2917;
                                    class35.field473.method977(4, var49);
                                } else {
                                    label544: for (int var45 = var9.field2889; var45 < class64.field954; var45++) {
                                        int var46 = class290.field4568[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field2849.length; var47++) {
                                            if (var9.field2849[var47] == var46) {
                                                class167 var48 = new class167();
                                                var48.field2518 = var9;
                                                var48.field2510 = var9.field2917;
                                                class35.field473.method977(4, var48);
                                                break label544;
                                            }
                                        }
                                    }
                                }
                                var9.field2889 = class64.field954;
                            }
                            if (var9.field2841 != null && class297.field4663 > var9.field2853) {
                                if (var9.field2907 == null || class297.field4663 - var9.field2853 > 32) {
                                    class167 var54 = new class167();
                                    var54.field2518 = var9;
                                    var54.field2510 = var9.field2841;
                                    class35.field473.method977(4, var54);
                                } else {
                                    label520: for (int var50 = var9.field2853; var50 < class297.field4663; var50++) {
                                        int var51 = class58.field866[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field2907.length; var52++) {
                                            if (var9.field2907[var52] == var51) {
                                                class167 var53 = new class167();
                                                var53.field2518 = var9;
                                                var53.field2510 = var9.field2841;
                                                class35.field473.method977(4, var53);
                                                break label520;
                                            }
                                        }
                                    }
                                }
                                var9.field2853 = class297.field4663;
                            }
                            if (var9.field2928 != null && class301.field4714 > var9.field2870) {
                                if (var9.field2846 == null || class301.field4714 - var9.field2870 > 32) {
                                    class167 var59 = new class167();
                                    var59.field2518 = var9;
                                    var59.field2510 = var9.field2928;
                                    class35.field473.method977(4, var59);
                                } else {
                                    label496: for (int var55 = var9.field2870; var55 < class301.field4714; var55++) {
                                        int var56 = class73.field1055[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field2846.length; var57++) {
                                            if (var9.field2846[var57] == var56) {
                                                class167 var58 = new class167();
                                                var58.field2518 = var9;
                                                var58.field2510 = var9.field2928;
                                                class35.field473.method977(4, var58);
                                                break label496;
                                            }
                                        }
                                    }
                                }
                                var9.field2870 = class301.field4714;
                            }
                            if (var9.field2934 != null && class79.field1113 > var9.field2951) {
                                if (var9.field2971 == null || class79.field1113 - var9.field2951 > 32) {
                                    class167 var64 = new class167();
                                    var64.field2518 = var9;
                                    var64.field2510 = var9.field2934;
                                    class35.field473.method977(4, var64);
                                } else {
                                    label472: for (int var60 = var9.field2951; var60 < class79.field1113; var60++) {
                                        int var61 = class252.field3770[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field2971.length; var62++) {
                                            if (var9.field2971[var62] == var61) {
                                                class167 var63 = new class167();
                                                var63.field2518 = var9;
                                                var63.field2510 = var9.field2934;
                                                class35.field473.method977(4, var63);
                                                break label472;
                                            }
                                        }
                                    }
                                }
                                var9.field2951 = class79.field1113;
                            }
                            if (class227.field3517 > var9.field2874 && var9.field2915 != null) {
                                class167 var65 = new class167();
                                var65.field2518 = var9;
                                var65.field2510 = var9.field2915;
                                class35.field473.method977(4, var65);
                            }
                            if (class271.field4090 > var9.field2874 && var9.field2912 != null) {
                                class167 var66 = new class167();
                                var66.field2518 = var9;
                                var66.field2510 = var9.field2912;
                                class35.field473.method977(4, var66);
                            }
                            if (class235.field3599 > var9.field2874 && var9.field2923 != null) {
                                class167 var67 = new class167();
                                var67.field2518 = var9;
                                var67.field2510 = var9.field2923;
                                class35.field473.method977(4, var67);
                            }
                            if (class245.field3693 > var9.field2874 && var9.field2834 != null) {
                                class167 var68 = new class167();
                                var68.field2518 = var9;
                                var68.field2510 = var9.field2834;
                                class35.field473.method977(4, var68);
                            }
                            if (class199.field3153 > var9.field2874 && var9.field2902 != null) {
                                class167 var69 = new class167();
                                var69.field2518 = var9;
                                var69.field2510 = var9.field2902;
                                class35.field473.method977(4, var69);
                            }
                            var9.field2874 = class319.field4980;
                            if (var9.field2898 != null) {
                                for (int var70 = 0; var70 < class179.field2681; var70++) {
                                    class167 var71 = new class167();
                                    var71.field2518 = var9;
                                    var71.field2512 = class320.field4985[var70];
                                    var71.field2519 = class31.field399[var70];
                                    var71.field2510 = var9.field2898;
                                    class35.field473.method977(4, var71);
                                }
                            }
                            if (class170.field2540 && var9.field2862 != null) {
                                class167 var72 = new class167();
                                var72.field2518 = var9;
                                var72.field2510 = var9.field2862;
                                class35.field473.method977(4, var72);
                            }
                        }
                    }
                    if (!var9.field2802 && class152.field2290 == null && class66.field976 == null && !class67.field982) {
                        if ((var9.field2876 >= 0 || var9.field2880 != 0) && class273.field4129 >= var12 && class295.field4646 >= var13 && class273.field4129 < var14 && class295.field4646 < var15) {
                            if (var9.field2876 >= 0) {
                                class322.field5012 = arg0[var9.field2876];
                            } else {
                                class322.field5012 = var9;
                            }
                        }
                        if (var9.field2945 == 8 && class273.field4129 >= var12 && class295.field4646 >= var13 && class273.field4129 < var14 && class295.field4646 < var15) {
                            class299.field4707 = var9;
                        }
                        if (var9.field2882 > var9.field2904) {
                            class3.method35(class273.field4129, (byte) 122, var9.field2890 + var10, var9.field2904, class295.field4646, var9.field2882, var9, var11);
                        }
                    }
                    if (var9.field2945 == 0) {
                        method1768(arg0, var9.field2806, var12, var13, var14, var15, var10 - var9.field2970, var11 - var9.field2808);
                        if (var9.field2946 != null) {
                            method1768(var9.field2946, var9.field2806, var12, var13, var14, var15, var10 - var9.field2970, var11 - var9.field2808);
                        }
                        class111 var73 = (class111) field3794.method203(1710, (long) var9.field2806);
                        if (var73 != null) {
                            class146.method1090(var10, var73.field1750, -1, var13, var14, var11, var12, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2407)
    private final void method1769(int arg0) {
        field3787++;
        if (arg0 <= 32) {
            this.method1385((byte) 118);
        }
        if (class110.field1746.field44 > class150.field2264) {
            class59.field890 = (class110.field1746.field44 - 1) * 50 * 5;
            if (class59.field890 > 3000) {
                class59.field890 = 3000;
            }
            if (class208.field3276 == class196.field3101) {
                class208.field3276 = class4.field20;
            } else {
                class208.field3276 = class196.field3101;
            }
            if (class110.field1746.field44 >= 2 && class110.field1746.field45 == 6) {
                this.method1381("js5connect_outofdate", 0);
                class305.field4771 = 1000;
                return;
            }
            if (class110.field1746.field44 >= 4 && class110.field1746.field45 == -1) {
                this.method1381("js5crc", 0);
                class305.field4771 = 1000;
                return;
            }
            if (class110.field1746.field44 >= 4 && (class305.field4771 == 0 || class305.field4771 == 5)) {
                if (class110.field1746.field45 == 7 || class110.field1746.field45 == 9) {
                    this.method1381("js5connect_full", 0);
                } else if (class110.field1746.field45 <= 0) {
                    this.method1381("js5io", 0);
                } else {
                    this.method1381("js5connect", 0);
                }
                class305.field4771 = 1000;
                return;
            }
        }
        class150.field2264 = class110.field1746.field44;
        if (class59.field890 > 0) {
            class59.field890--;
            return;
        }
        try {
            if (class105.field1613 == 0) {
                class288.field4441 = class301.field4715.method162(class208.field3276, (byte) -70, class255.field3816);
                class105.field1613++;
            }
            if (class105.field1613 == 1) {
                if (class288.field4441.field3585 == 2) {
                    this.method1766(0, 1000);
                    return;
                }
                if (class288.field4441.field3585 == 1) {
                    class105.field1613++;
                }
            }
            if (class105.field1613 == 2) {
                class274.field4212 = new class118((Socket) class288.field4441.field3590, class301.field4715);
                class35 var2 = new class35(5);
                var2.method262((byte) 81, 15);
                var2.method259(-15195, 532);
                class274.field4212.method920((byte) -76, var2.field437, 0, 5);
                class105.field1613++;
                class110.field1743 = class234.method1650((byte) -111);
            }
            if (class105.field1613 == 3) {
                if (class305.field4771 == 0 || class305.field4771 == 5 || class274.field4212.method915(0) > 0) {
                    int var3 = class274.field4212.method918(0);
                    if (var3 != 0) {
                        this.method1766(0, var3);
                        return;
                    }
                    class105.field1613++;
                } else if (class234.method1650((byte) -108) - class110.field1743 > 30000L) {
                    this.method1766(0, 1001);
                    return;
                }
            }
            if (class105.field1613 == 4) {
                boolean var4 = class305.field4771 == 5 || class305.field4771 == 10 || class305.field4771 == 28;
                class110.field1746.method48(class274.field4212, -12984, !var4);
                class274.field4212 = null;
                class288.field4441 = null;
                class105.field1613 = 0;
            }
        } catch (IOException var6) {
            this.method1766(0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lek;)Lek;", line = 2556)
    public static final class184 method1770(class184 arg0) {
        int var1 = method1764(arg0).method1937(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class100.method781((byte) 48, arg0.field2974);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2578)
    public final void init() {
        field3797++;
        if (!this.method1386(0)) {
            return;
        }
        class110.field1739 = Integer.parseInt(this.getParameter("worldid"));
        class20.field222 = Integer.parseInt(this.getParameter("modewhere"));
        if (class20.field222 < 0 || class20.field222 > 1) {
            class20.field222 = 0;
        }
        class183.field2755 = Integer.parseInt(this.getParameter("modewhat"));
        if (class183.field2755 < 0 || class183.field2755 > 2) {
            class183.field2755 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class212.field3367 = true;
        } else {
            class212.field3367 = false;
        }
        try {
            class98.field1452 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class98.field1452 = 0;
        }
        class128.method983((byte) 104, class98.field1452);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class244.field3681 = true;
        } else {
            class244.field3681 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class162.field2408 = true;
        } else {
            class162.field2408 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class3.field12 = 1;
        } else {
            class3.field12 = 0;
        }
        try {
            class317.field4923 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class317.field4923 = 0;
        }
        class287.field4426 = this.getParameter("settings");
        if (class287.field4426 == null) {
            class287.field4426 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class180.field2701 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class180.field2701 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class92.field1339 = true;
        } else {
            class92.field1339 = false;
        }
        class99.field1457 = this;
        this.method1383(765, 1532, class183.field2755 + 32, 118, 503);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2664)
    public static void method1771(int arg0) {
        field3800 = null;
        if (arg0 == 26982) {
            field3794 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2675)
    public static final void method1772(int arg0) {
        field3793++;
        class314.field4872 = (byte[][][]) null;
        class65.field963 = (byte[][][]) null;
        class272.field4118 = (byte[][][]) null;
        class199.field3148 = null;
        class263.field3931 = null;
        class323.field5018 = (byte[][][]) null;
        class328.field5085 = null;
        if (arg0 != 40) {
            field3794 = (class29) null;
        }
        class125.field1983 = null;
        class58.field868 = (int[][][]) null;
        class17.field191 = null;
        class277.field4260 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2696)
    public static final void method1773(byte arg0) {
        if (arg0 <= 66) {
            field3800 = (String) null;
        }
        if (class32.field408 != null) {
            class135.method1036(class32.field408, 101);
            class32.field408 = null;
        }
        field3790++;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2713)
    public static final void method1774(int arg0) {
        if (arg0 >= -101) {
            field3794 = (class29) null;
        }
        field3785++;
        if (class261.field3861 != null) {
            class261.field3861.method1855((byte) 83);
        }
        if (class256.field3818 != null) {
            class256.field3818.method1855((byte) 119);
        }
    }
}
