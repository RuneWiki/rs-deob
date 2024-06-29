import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class403 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field2875 = new String[8];

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lao;")
    public static class188 field2878 = new class188(37, 6);

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lm;")
    public static class126 field2884;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltn;)Z")
    public static final boolean method1334(class58 arg0) {
        if (class38.field578) {
            if (method1349(arg0).field1626 != 0) {
                return false;
            }
            if (arg0.field843 == 0) {
                return false;
            }
        }
        return arg0.field924;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Ljava/lang/String;")
    public final String method1335(int arg0) {
        field2873++;
        String var2 = null;
        try {
            var2 = "[1)" + class483.field7082 + "," + class465.field6840 + "," + class237.field3436 + "," + class83.field1366 + "|";
            if (class95.field1558 != null) {
                var2 = var2 + "2)" + class434.field6317 + "," + (class95.field1558.field409[0] + class483.field7082) + "," + (class95.field1558.field416[0] + class465.field6840) + "|";
            }
            var2 = var2 + "3)" + class399.field5865 + "|4)" + class397.field5830.field142 + "|5)" + class428.method2611(arg0 ^ 0xFFFFFFC7) + "|6)" + class112.field1780 + "," + class477.field7003 + "|";
            var2 = var2 + "7)" + class397.field5830.method59((byte) 114, class399.field5865) + "|";
            var2 = var2 + "8)" + class397.field5830.method56((byte) 105, class399.field5865) + "|";
            if (arg0 != -58) {
                return null;
            }
            var2 = var2 + "9)" + class397.field5830.field136 + "|";
            var2 = var2 + "10)" + class397.field5830.field144 + "|";
            var2 = var2 + "11)" + class397.field5830.field130 + "|";
            var2 = var2 + "12)" + class397.field5830.method1292(class399.field5865, -2) + "|";
            var2 = var2 + "13)" + class445.field6538 + "]";
        } catch (Throwable var3) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Log;")
    private static final class456 method1336(int arg0, int arg1) {
        field2879++;
        class456[] var2 = class216.method1424(-47);
        int var3 = 47 % ((32 - arg1) / 62);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class456 var5 = var2[var4];
            if (var5.field6743 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method1337(int arg0) {
        field2872++;
        if (arg0 <= 119) {
            field2884 = null;
        }
        if (class17.field266 == 1000) {
            return;
        }
        class180.field2734++;
        if (class180.field2734 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class182.field2747 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class4.field75.setSeed((long) class182.field2747);
        }
        if (class180.field2734 % 50 == 0) {
            class209.field3003 = class422.field6202;
            class92.field1524 = class492.field7186;
            class422.field6202 = 0;
            class492.field7186 = 0;
        }
        this.method1357((byte) 110);
        if (class161.field2437 != null) {
            class161.field2437.method2412(-108);
        }
        class331.method2191((byte) -128);
        class351.field5334.method1769((byte) 36);
        class481.field7063.method708(2);
        if (class264.field3804 != null) {
            int var3 = class264.field3804.method537(true);
            class214.field3083 = var3;
        }
        if (class394.field5821 != null) {
            class394.field5821.method457((int) class464.method2773((byte) 103));
        }
        class375.method2394((byte) 62);
        class42.field643 = 0;
        for (class420 var4 = class351.field5334.method1766(-9422); var4 != null && class42.field643 < 128; var4 = class351.field5334.method1766(-9422)) {
            if (var4.method245((byte) -1) != 1) {
                char var5 = var4.method233((byte) 126);
                if (!class253.method1611((byte) -118) || var5 != '`' && var5 != '§') {
                    class125.field1922[class42.field643] = var4;
                    class42.field643++;
                } else if (class454.method2736(-24647)) {
                    class321.method2087(true);
                } else {
                    class377.method2397(-21986);
                }
            }
        }
        for (class157 var6 = class481.field7063.method704(105); var6 != null; var6 = class481.field7063.method704(66)) {
            int var7 = var6.method1097(-11);
            if (var7 == -1) {
                class371.field5562.method2270(0, var6);
            } else if (class33.method263(var7, (byte) -16)) {
                class448.field6552.method2270(0, var6);
            }
            if (class448.field6552.method2266(-1) > 10) {
                class448.field6552.method2254(-8);
            }
        }
        if (class454.method2736(-24647)) {
            class50.method364((byte) -76);
        }
        if (class17.field266 == 0) {
            this.method1358(75);
            class73.method617(88);
        } else if (class17.field266 == 5) {
            this.method1358(75);
            class73.method617(83);
        } else if (class17.field266 == 25 || class17.field266 == 28) {
            class155.method1120(4);
        }
        if (class17.field266 == 10) {
            this.method1343((byte) -58);
            class266.method1702((byte) -73);
            class310.method1942(17134);
            class348.method2263(false);
        } else if (class17.field266 == 30) {
            class57.method410((byte) 89);
        } else if (class17.field266 == 40) {
            class348.method2263(false);
            if (class72.field1206 != -3 && class72.field1206 != 2 && class72.field1206 != 15) {
                class196.method1359(0);
            }
        }
        class482.method2885(class394.field5821, -23440);
        class448.field6552.method2254(-8);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1338() {
        for (int var0 = 0; var0 < class237.field3436; var0++) {
            int[] var1 = class504.field7404[var0];
            for (int var2 = 0; var2 < class83.field1366; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1339(int arg0) {
        field2880++;
        if (class383.field5691.field3799 > class105.field1650) {
            if (class334.field5129 == class289.field4153) {
                class334.field5129 = class231.field3376;
            } else {
                class334.field5129 = class289.field4153;
            }
            class489.field7141 = (class383.field5691.field3799 * 50 - 50) * 5;
            if (class489.field7141 > 3000) {
                class489.field7141 = 3000;
            }
            if (class383.field5691.field3799 >= 2 && class383.field5691.field3801 == 6) {
                this.method2505(arg0 ^ 0xFFFF8B03, "js5connect_outofdate");
                class17.field266 = 1000;
                return;
            }
            if (class383.field5691.field3799 >= 4 && class383.field5691.field3801 == -1) {
                this.method2505(-1, "js5crc");
                class17.field266 = 1000;
                return;
            }
            if (class383.field5691.field3799 >= 4 && (class17.field266 == 0 || class17.field266 == 5)) {
                if (class383.field5691.field3801 == 7 || class383.field5691.field3801 == 9) {
                    this.method2505(-1, "js5connect_full");
                } else if (class383.field5691.field3801 <= 0) {
                    this.method2505(arg0 - 29949, "js5io");
                } else {
                    this.method2505(-1, "js5connect");
                }
                class17.field266 = 1000;
                return;
            }
        }
        class105.field1650 = class383.field5691.field3799;
        if (class489.field7141 > 0) {
            class489.field7141--;
            return;
        }
        try {
            if (class113.field1786 == 0) {
                class214.field3086 = class112.field1785.method1962(1, class102.field1633, class334.field5129);
                class113.field1786++;
            }
            if (class113.field1786 == 1) {
                if (class214.field3086.field1604 == 2) {
                    this.method1350(1000, Integer.MAX_VALUE);
                    return;
                }
                if (class214.field3086.field1604 == 1) {
                    class113.field1786++;
                }
            }
            if (class113.field1786 == 2) {
                class381.field5680 = new class85((Socket) class214.field3086.field1608, class112.field1785);
                class303 var2 = new class303(5);
                var2.method1923((byte) 62, class224.field3249.field6584);
                var2.method1892(397825512, 588);
                class381.field5680.method695(5, 0, var2.field4326, (byte) 112);
                class113.field1786++;
                class495.field7210 = class464.method2773((byte) 103);
            }
            if (arg0 == 29948) {
                if (class113.field1786 == 3) {
                    if (class17.field266 == 0 || class17.field266 == 5 || class381.field5680.method693((byte) -120) > 0) {
                        int var3 = class381.field5680.method697(0);
                        if (var3 != 0) {
                            this.method1350(var3, Integer.MAX_VALUE);
                            return;
                        }
                        class113.field1786++;
                    } else if (class464.method2773((byte) 103) - class495.field7210 > 30000L) {
                        this.method1350(1001, Integer.MAX_VALUE);
                        return;
                    }
                }
                if (class113.field1786 == 4) {
                    boolean var4 = class17.field266 == 5 || class17.field266 == 10 || class17.field266 == 28;
                    class383.field5691.method1684(!var4, class381.field5680, -27749);
                    class381.field5680 = null;
                    class113.field1786 = 0;
                    class214.field3086 = null;
                }
            }
        } catch (IOException var5) {
            this.method1350(1002, arg0 ^ 0x7FFF8B03);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1340(int arg0) {
        field2870++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class323.method2095(true);
        class327.field5067 = new class138(class112.field1785);
        class383.field5691 = new class263();
        if (class502.field7371 != class108.field1683) {
            class425.field6239 = new byte[50][];
        }
        class397.field5830 = new class187(class112.field1785);
        if (class502.field7371 == class108.field1683) {
            class68.field1189 = this.getCodeBase().getHost();
            class291.field4173 = 443;
            class447.field6546 = 43594;
        } else if (class466.method2776(class108.field1683, -118)) {
            class68.field1189 = this.getCodeBase().getHost();
            class447.field6546 = class16.field247 + 40000;
            class291.field4173 = class16.field247 + 50000;
        } else if (class461.field6804 == class108.field1683) {
            class68.field1189 = "127.0.0.1";
            class447.field6546 = class16.field247 + 40000;
            class291.field4173 = class16.field247 + 50000;
        }
        class289.field4153 = class447.field6546;
        class231.field3376 = class291.field4173;
        class102.field1633 = class68.field1189;
        class310.field4445 = class447.field6546;
        class334.field5129 = class310.field4445;
        if (class312.field4479 == 3) {
            class255.field3681 = class16.field247;
        }
        class379.field5650 = class151.field2309 = class497.field7232 = class388.field5754 = new short[256];
        if (class321.field4649 == class193.field2824) {
            class274.field3964 = class334.field5133;
            class497.field7230 = class497.field7237;
            class104.field1649 = 16777215;
            class477.field7000 = class120.field1882;
            class478.field7017 = 0;
            class76.field1245 = true;
            class469.field6909 = class527.field7764;
        } else {
            class274.field3964 = class380.field5671;
            class497.field7230 = class326.field5034;
            class469.field6909 = class322.field4948;
            class477.field7000 = class107.field1672;
        }
        class351.field5334 = class29.method235(true, class31.field503);
        class481.field7063 = class18.method168(true, arg0 ^ arg0, class31.field503);
        class264.field3804 = class210.method1397(arg0 ^ 0x1C7A);
        if (class264.field3804 != null) {
            class264.field3804.method541((byte) 108, class31.field503);
        }
        class143.field2122 = class312.field4479;
        try {
            if (class112.field1785.field4467 != null) {
                class33.field521 = new class275(class112.field1785.field4467, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class428.field6255[var3] = new class275(class112.field1785.field4477[var3], 6000, 0);
                }
                class456.field6744 = new class275(class112.field1785.field4462, 6000, 0);
                class180.field2736 = new class518(255, class33.field521, class456.field6744, 500000);
                class319.field4566 = new class275(class112.field1785.field4474, 24, 0);
                class112.field1785.field4474 = null;
                class112.field1785.field4467 = null;
                class112.field1785.field4477 = null;
                class112.field1785.field4462 = null;
            }
        } catch (IOException var4) {
            class319.field4566 = null;
            class456.field6744 = null;
            class180.field2736 = null;
            class33.field521 = null;
        }
        if (class502.field7371 != class108.field1683) {
            class183.field2754 = true;
        }
        class382.field5688 = (class371.field5565 == class321.field4649 ? class310.field4425 : class108.field1682).method1273(true, class370.field5530);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method1341(int arg0) {
        int var1 = class333.field5117;
        int[] var2 = class459.field6766;
        int var3 = class64.field1135 ? var1 : class322.field4943 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class22 var5;
            if (var4 < var1) {
                var5 = class390.field5783[var2[var4]];
            } else {
                var5 = class132.field2030[class101.field1623[var4 - var1]];
            }
            if (var5.field5538 == arg0) {
                var5.field317 = 0;
                if (var5.field334 < 0) {
                    var5.field366 = false;
                } else {
                    int var6 = var5.method184(1);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field5529 & 0x7F) != 0 || (var5.field5539 & 0x7F) != 0) {
                            var5.field366 = false;
                            continue;
                        }
                    } else if ((var5.field5529 & 0x7F) != 64 || (var5.field5539 & 0x7F) != 64) {
                        var5.field366 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field5529 >> 7;
                        int var8 = var5.field5539 >> 7;
                        if (class504.field7404[var7][var8] != var5.field334) {
                            var5.field366 = true;
                            continue;
                        }
                        if (class522.field7666[var7][var8] > 1) {
                            var10002 = class522.field7666[var7][var8]--;
                            var5.field366 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field5529 - var9 >> 7;
                        int var11 = var5.field5539 - var9 >> 7;
                        int var12 = var5.field5529 + var9 >> 7;
                        int var13 = var5.field5539 + var9 >> 7;
                        if (!class93.method750(var11, var12, var10, var13, var5.field334, false)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class504.field7404[var14][var15] == var5.field334) {
                                        var10002 = class522.field7666[var14][var15]--;
                                    }
                                }
                            }
                            var5.field366 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class62 && var5.field415 != null && class180.field2734 >= var5.field415.field3196 && class180.field2734 < var5.field415.field3189) {
                        ((class62) var5).field1095 = false;
                    }
                    var5.field366 = false;
                    var5.field5534 = class259.method1646(var5.field5539, var5.field5529, 851701031, var5.field5538);
                    class333.method2194(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method1342(int arg0) {
        if (class45.field678) {
            method1344((byte) 125);
        }
        field2876++;
        if (class394.field5821 != null) {
            class394.field5821.method1174(-1);
        }
        if (class320.field4577 != null) {
            class36.method288((byte) 111, class320.field4577, class112.field1785);
            class320.field4577 = null;
        }
        if (class138.field2091 != null) {
            class138.field2091.method694(false);
            class138.field2091 = null;
        }
        if (class264.field3804 != null) {
            class264.field3804.method539(true, class31.field503);
        }
        class264.field3804 = null;
        class321.method2045(true);
        class383.field5691.method1686(false);
        class327.field5067.method1021(true);
        if (class47.field722 != null) {
            class47.field722.method213(true);
            class47.field722 = null;
        }
        if (arg0 != 1) {
            this.method1350(68, -118);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method1343(byte arg0) {
        class228.field3343++;
        field2886++;
        class440.method2669(-1, (byte) -84, -1, null);
        class414.method2557(-1, null, true, -1);
        class22.method193(118);
        class285.field4130++;
        if (arg0 != -58) {
            field2884 = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            class13 var12 = class132.field2030[var2];
            if (var12 != null) {
                byte var13 = var12.field210.field2197;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method184(1);
                    if ((var13 & 0x2) != 0 && var12.field412 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field409[0] + var15;
                            int var18 = var12.field416[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > (class237.field3436 - var14 - 1)) {
                                var17 = class237.field3436 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if ((class83.field1366 - var14 - 1) < var18) {
                                var18 = class83.field1366 - (var14 + 1);
                            }
                            int var19 = class319.method2000(arg0 ^ 0x39, var14, class248.field3581, 0, var12.field416[0], 0, true, var17, var18, -1, var14, var14, class203.field2939, var12.field409[0], class255.field3679[var12.field5538]);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field409[var20] = class203.field2939[var19 - var20 - 1];
                                    var12.field416[var20] = class248.field3581[var19 - var20 - 1];
                                    var12.field413[var20] = 1;
                                }
                                var12.field412 = var19;
                            }
                        }
                    }
                    class186.method1288(true, arg0 ^ 0x206E, var12);
                    int var21 = class91.method739(var12, (byte) -82);
                    class261.method1659(class432.field6300, 0, var21, class459.field6769, var12);
                    class348.method2271((byte) -54, var12);
                }
            }
        }
        if (class112.field1784 == 0 && class267.field3859 == 0) {
            if (class403.field5944 == 2) {
                class120.method870(99);
            } else {
                class373.method2386(-115);
            }
            if (class430.field6262 >> 7 < 14 || class237.field3436 - 14 <= class430.field6262 >> 7 || class291.field4175 >> 7 < 14 || class83.field1366 - 14 <= class291.field4175 >> 7) {
                class332.method2192((byte) 48);
            }
        }
        while (true) {
            class519 var3;
            class58 var4;
            class58 var5;
            do {
                var3 = (class519) class98.field1595.method2254(-8);
                if (var3 == null) {
                    while (true) {
                        class519 var6;
                        class58 var7;
                        class58 var8;
                        do {
                            var6 = (class519) class407.field5986.method2254(arg0 + 50);
                            if (var6 == null) {
                                while (true) {
                                    class519 var9;
                                    class58 var10;
                                    class58 var11;
                                    do {
                                        var9 = (class519) class481.field7066.method2254(-8);
                                        if (var9 == null) {
                                            if (class13.field221 != null) {
                                                class206.method1380((byte) -99);
                                            }
                                            if ((class180.field2734 % 1500) == 0) {
                                                class99.method775(-20858);
                                            }
                                            class408.method2533(103);
                                            if (class45.field678 && class99.field1601 < (class464.method2773((byte) 103) - 60000L)) {
                                                method1344((byte) 121);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field7625;
                                        if (var10.field840 < 0) {
                                            break;
                                        }
                                        var11 = class421.method2578(-4179, var10.field876);
                                    } while (var11 == null || var11.field910 == null || var10.field840 >= var11.field910.length || var11.field910[var10.field840] != var10);
                                    class150.method1086(var9);
                                }
                            }
                            var7 = var6.field7625;
                            if (var7.field840 < 0) {
                                break;
                            }
                            var8 = class421.method2578(arg0 - 4121, var7.field876);
                        } while (var8 == null || var8.field910 == null || var8.field910.length <= var7.field840 || var8.field910[var7.field840] != var7);
                        class150.method1086(var6);
                    }
                }
                var4 = var3.field7625;
                if (var4.field840 < 0) {
                    break;
                }
                var5 = class421.method2578(arg0 ^ 0x106B, var4.field876);
            } while (var5 == null || var5.field910 == null || var5.field910.length <= var4.field840 || var5.field910[var4.field840] != var4);
            class150.method1086(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static final void method1344(byte arg0) {
        field2888++;
        class137 var1 = null;
        try {
            class100 var2 = class112.field1785.method1967(12619, "2");
            while (var2.field1604 == 0) {
                class185.method1285(107, 1L);
            }
            if (var2.field1604 == 1) {
                var1 = (class137) var2.field1608;
                class303 var3 = new class303(class475.field6996 * 6 + 3);
                var3.method1923((byte) 62, 1);
                var3.method1874(class475.field6996, (byte) -110);
                for (int var4 = 0; var4 < class400.field5869.length; var4++) {
                    if (class424.field6226[var4]) {
                        var3.method1874(var4, (byte) -110);
                        var3.method1892(397825512, class400.field5869[var4]);
                    }
                }
                var1.method1009(var3.field4326, 24238, var3.field4333, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1011(7734);
            }
            if (arg0 <= 120) {
                method1341(70);
            }
        } catch (Exception var5) {
        }
        class99.field1601 = class464.method2773((byte) 103);
        class45.field678 = false;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1345() {
        class374.field5590 = 0;
        for (int var0 = 0; var0 < class322.field4943; var0++) {
            class13 var1 = class132.field2030[class101.field1623[var0]];
            if (var1.field366 && var1.method116(0) != -1) {
                int var2 = (var1.method184(1) - 1) * 64 + 60;
                int var3 = var1.field5529 - var2 >> 7;
                int var4 = var1.field5539 - var2 >> 7;
                class22 var5 = class240.method1557(var4, -825703416, var3, var1.field5538);
                if (var5 != null) {
                    int var6 = var5.field331;
                    if (var5 instanceof class13) {
                        var6 += 2048;
                    }
                    if (var5.field317 == 0 && var5.method116(0) != -1) {
                        class46.field711[class374.field5590] = var6;
                        class226.field3305[class374.field5590] = var6;
                        class374.field5590++;
                        var5.field317++;
                    }
                    class46.field711[class374.field5590] = var6;
                    class226.field3305[class374.field5590] = var1.field331 + 2048;
                    class374.field5590++;
                    var5.field317++;
                }
            }
        }
        class437.method2641(120, 0, class46.field711, class374.field5590 - 1, class226.field3305);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1346() {
        int var0 = class333.field5117;
        int[] var1 = class459.field6766;
        int var2 = class64.field1135 ? var0 : class322.field4943 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class22 var4;
            if (var3 < var0) {
                var4 = class390.field5783[var1[var3]];
            } else {
                var4 = class132.field2030[class101.field1623[var3 - var0]];
            }
            if (var4.field334 >= 0) {
                int var5 = var4.method184(1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5529 & 0x7F) == 0 && (var4.field5539 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field5529 & 0x7F) == 64 && (var4.field5539 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class62 && var4.field415 != null && class180.field2734 >= var4.field415.field3196 && class180.field2734 < var4.field415.field3189) {
                    ((class62) var4).field1095 = false;
                }
                var4.field5534 = class259.method1646(var4.field5539, var4.field5529, 851701031, var4.field5538);
                class333.method2194(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltn;IIIIIIIII)V")
    public static final void method1347(class58[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class58 var11 = arg0[var10];
            if (var11 != null && var11.field876 == arg1) {
                int var12 = var11.field845 + arg6;
                int var13 = var11.field899 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field843 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field925 + var12;
                    int var19 = var11.field896 + var13;
                    if (var11.field843 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field843 == 0 || var11.field993 || method1349(var11).field1626 != 0 || class216.field3103 == var11 || class160.field2427 == var11.field892) {
                    if (!method1334(var11)) {
                        if (class13.field221 == var11) {
                            class83.field1363 = true;
                            class56.field819 = var12;
                            class189.field2792 = var13;
                        }
                        if (var11.field927 || var14 < var16 && var15 < var17) {
                            if (var11.field960 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class519 var20 = (class519) class481.field7066.method2257((byte) 112); var20 != null; var20 = (class519) class481.field7066.method2256(-92)) {
                                    if (var20.field7630) {
                                        var20.method2663(-122);
                                        var20.field7625.field950 = false;
                                    }
                                }
                                if (class393.field5817 == 0) {
                                    class13.field221 = null;
                                    class216.field3103 = null;
                                }
                                class459.field6781 = 0;
                                class225.field3274 = false;
                                class271.field3932 = false;
                                if (!class314.field4487) {
                                    class346.method2244(-89);
                                }
                            }
                            boolean var21;
                            if (class481.field7063.method713(67) >= var14 && class481.field7063.method712(-31039) >= var15 && class481.field7063.method713(104) < var16 && class481.field7063.method712(-31039) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class301.field4287 && var21) {
                                if (var11.field931 >= 0) {
                                    class508.field7429 = var11.field931;
                                } else if (var11.field960) {
                                    class508.field7429 = -1;
                                }
                            }
                            if (!class314.field4487 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class184.method1284(var11, arg8 - var12, (byte) 0, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class481.field7063.method711((byte) 126) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class157 var24 = (class157) class448.field6552.method2257((byte) 124);
                            if (var24 != null && var24.method1097(-125) == 0 && var24.method1102(true) >= var14 && var24.method1103(5) >= var15 && var24.method1102(true) < var16 && var24.method1103(5) < var17) {
                                var23 = true;
                            }
                            if (var11.field878 != null) {
                                for (int var25 = 0; var25 < var11.field878.length; var25++) {
                                    if (class351.field5334.method1767(var11.field878[var25], (byte) 13)) {
                                        if (var11.field856 == null || class180.field2734 >= var11.field856[var25]) {
                                            byte var26 = var11.field952[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class351.field5334.method1767(86, (byte) 10) && !class351.field5334.method1767(82, (byte) 109) && !class351.field5334.method1767(81, (byte) -103)) && ((var26 & 0x2) == 0 || class351.field5334.method1767(86, (byte) -108)) && ((var26 & 0x1) == 0 || class351.field5334.method1767(82, (byte) 107)) && ((var26 & 0x4) == 0 || class351.field5334.method1767(81, (byte) -120))) {
                                                if (var25 < 10) {
                                                    class291.method1809(-1, "", (byte) -107, var11.field955, var25 + 1);
                                                } else if (var25 == 10) {
                                                    class105.method798(-28860);
                                                    class102 var27 = method1349(var11);
                                                    class163.method1183(var27.method779((byte) 122), var27.field1634, var11, -51);
                                                    class200.field2920 = class114.method844((byte) 9, var11);
                                                    if (class200.field2920 == null) {
                                                        class200.field2920 = "Null";
                                                    }
                                                    class318.field4553 = var11.field992 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field911[var25];
                                                if (var11.field856 == null) {
                                                    var11.field856 = new int[var11.field878.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field856[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field856[var25] = class180.field2734 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field856 != null) {
                                        var11.field856[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class485.method2899(var11, var24.method1103(5) - var13, (byte) 15, var24.method1102(true) - var12);
                            }
                            if (class13.field221 != null && class13.field221 != var11 && var21 && method1349(var11).method781((byte) 106)) {
                                class427.field6247 = var11;
                            }
                            if (class216.field3103 == var11) {
                                class216.field3101 = true;
                                class436.field6327 = var12;
                                class414.field6085 = var13;
                            }
                            if (var11.field993 || var11.field892 != 0) {
                                if (var21 && class214.field3083 != 0 && var11.field956 != null) {
                                    class519 var29 = new class519();
                                    var29.field7630 = true;
                                    var29.field7625 = var11;
                                    var29.field7624 = class214.field3083;
                                    var29.field7627 = var11.field956;
                                    class481.field7066.method2270(0, var29);
                                }
                                if (class13.field221 != null || class314.field4487 || class277.field4004 != var11.field892 && class459.field6781 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field892 != 0) {
                                    if (class494.field7196 == var11.field892 || class8.field138 == var11.field892) {
                                        class212.field3067 = var11;
                                        if (class118.field1861 != null) {
                                            class118.field1861.method1514((byte) 116, class394.field5821, var11.field896);
                                        }
                                        if (class494.field7196 == var11.field892) {
                                            if (!class314.field4487 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class129.method954(arg9, -13821, class394.field5821, arg8);
                                                for (class301 var30 = (class301) class308.field4409.method1639(-1); var30 != null; var30 = (class301) class308.field4409.method1642((byte) 121)) {
                                                    if (arg8 >= var30.field4285 && arg8 < var30.field4283 && arg9 >= var30.field4286 && arg9 < var30.field4284) {
                                                        class346.method2244(-67);
                                                        class339.method2218(21, var30.field4280);
                                                    }
                                                }
                                            }
                                            class440.method2669(var12, (byte) -84, var13, var11);
                                            continue;
                                        }
                                    }
                                    if (class160.field2427 == var11.field892) {
                                        if (var11.method415(class394.field5821, 1816933795) == null || class406.field5977 != 0 && class406.field5977 != 3 || class314.field4487 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field964[var32];
                                        if (var31 < var33 || var31 > var11.field870[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field925 / 2;
                                        int var35 = var32 - var11.field896 / 2;
                                        int var36;
                                        if (class403.field5944 == 4) {
                                            var36 = (int) class66.field1161 & 0x3FFF;
                                        } else {
                                            var36 = (int) class66.field1161 + class8.field114 & 0x3FFF;
                                        }
                                        int var37 = class324.field4966[var36];
                                        int var38 = class324.field4974[var36];
                                        if (class403.field5944 != 4) {
                                            var37 = (class43.field662 + 256) * var37 >> 8;
                                            var38 = (class43.field662 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class403.field5944 == 4) {
                                            var41 = (class117.field1850 >> 7) + (var39 >> 2);
                                            var42 = (class380.field5663 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class95.field1558.method184(1) - 1) * 64;
                                            var41 = (class95.field1558.field5529 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class95.field1558.field5539 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class301.field4287 && (class288.field4144 & 0x40) != 0) {
                                            class58 var44 = class155.method1123(class153.field2343, class114.field1817, (byte) -83);
                                            if (var44 == null) {
                                                class105.method798(-28860);
                                            } else {
                                                class192.method1313(var11.field946, class189.field2797, " ->", class200.field2920, var41, false, 1L, (byte) 35, 58, true, var42);
                                            }
                                            continue;
                                        }
                                        if (class321.field4649 == class193.field2824) {
                                            class192.method1313(-1, -1, "", class104.field1645.method1273(true, class370.field5530), var41, false, 1L, (byte) 35, 16, true, var42);
                                        }
                                        class192.method1313(-1, class505.field7407, "", class27.field457, var41, false, 1L, (byte) 35, 48, true, var42);
                                        continue;
                                    }
                                    if (class277.field4004 == var11.field892) {
                                        class373.field5588 = var11;
                                        if (var21) {
                                            class225.field3274 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1102(true) - var12 - var11.field925 / 2) * 2.0D / (double) class2.field29);
                                            int var46 = (int) (-((double) (var24.method1103(5) - var13 - var11.field896 / 2) * 2.0D / (double) class2.field29));
                                            int var47 = class25.field439 + var45 + class2.field44;
                                            int var48 = class33.field522 + var46 + class2.field40;
                                            class145 var49 = class341.method2228(-71);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1048(var47, var50, var48, 1389751532);
                                            if (var50 != null) {
                                                if (class351.field5334.method1767(82, (byte) -6) && class42.field642 > 0) {
                                                    class364.method2341((byte) 123, var50[2], var50[1], var50[0]);
                                                    continue;
                                                }
                                                class271.field3932 = true;
                                                class530.field7825 = var50[0];
                                                class230.field3356 = var50[1];
                                                class188.field2787 = var50[2];
                                            }
                                            class459.field6781 = 1;
                                            class92.field1516 = false;
                                            class95.field1556 = class481.field7063.method713(83);
                                            class442.field6484 = class481.field7063.method712(-31039);
                                            continue;
                                        }
                                        if (var22 && class459.field6781 > 0) {
                                            if (class459.field6781 == 1 && (class95.field1556 != class481.field7063.method713(71) || class442.field6484 != class481.field7063.method712(-31039))) {
                                                class209.field2998 = class25.field439;
                                                class124.field1917 = class33.field522;
                                                class459.field6781 = 2;
                                            }
                                            if (class459.field6781 == 2) {
                                                class92.field1516 = true;
                                                class230.method1505(class209.field2998 + (int) ((double) (class95.field1556 - class481.field7063.method713(109)) * 2.0D / (double) class2.field22), (byte) 68);
                                                class152.method1099(-1, class124.field1917 - (int) ((double) (class442.field6484 - class481.field7063.method712(-31039)) * 2.0D / (double) class2.field22));
                                            }
                                            continue;
                                        }
                                        if (class459.field6781 > 0 && !class92.field1516) {
                                            if ((class369.field5525 == 1 || class365.method2351(126)) && class106.field1669 > 2) {
                                                class173.method1240(class95.field1556, class442.field6484, 0);
                                            } else if (class241.method1563((byte) 89)) {
                                                class173.method1240(class95.field1556, class442.field6484, 0);
                                            }
                                        }
                                        class459.field6781 = 0;
                                        continue;
                                    }
                                    if (class165.field2470 == var11.field892) {
                                        if (var22) {
                                            class217.method1441(var11.field896, -1, class481.field7063.method712(-31039) - var13, var11.field925, class481.field7063.method713(115) - var12);
                                        }
                                        continue;
                                    }
                                    if (class357.field5417 == var11.field892) {
                                        class414.method2557(var13, var11, true, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field868 && var23) {
                                    var11.field868 = true;
                                    if (var11.field920 != null) {
                                        class519 var51 = new class519();
                                        var51.field7630 = true;
                                        var51.field7625 = var11;
                                        var51.field7629 = var24.method1102(true) - var12;
                                        var51.field7624 = var24.method1103(5) - var13;
                                        var51.field7627 = var11.field920;
                                        class481.field7066.method2270(0, var51);
                                    }
                                }
                                if (var11.field868 && var22 && var11.field965 != null) {
                                    class519 var52 = new class519();
                                    var52.field7630 = true;
                                    var52.field7625 = var11;
                                    var52.field7629 = class481.field7063.method713(68) - var12;
                                    var52.field7624 = class481.field7063.method712(-31039) - var13;
                                    var52.field7627 = var11.field965;
                                    class481.field7066.method2270(0, var52);
                                }
                                if (var11.field868 && !var22) {
                                    var11.field868 = false;
                                    if (var11.field928 != null) {
                                        class519 var53 = new class519();
                                        var53.field7630 = true;
                                        var53.field7625 = var11;
                                        var53.field7629 = class481.field7063.method713(60) - var12;
                                        var53.field7624 = class481.field7063.method712(-31039) - var13;
                                        var53.field7627 = var11.field928;
                                        class407.field5986.method2270(0, var53);
                                    }
                                }
                                if (var22 && var11.field922 != null) {
                                    class519 var54 = new class519();
                                    var54.field7630 = true;
                                    var54.field7625 = var11;
                                    var54.field7629 = class481.field7063.method713(114) - var12;
                                    var54.field7624 = class481.field7063.method712(-31039) - var13;
                                    var54.field7627 = var11.field922;
                                    class481.field7066.method2270(0, var54);
                                }
                                if (!var11.field950 && var21) {
                                    var11.field950 = true;
                                    if (var11.field882 != null) {
                                        class519 var55 = new class519();
                                        var55.field7630 = true;
                                        var55.field7625 = var11;
                                        var55.field7629 = class481.field7063.method713(110) - var12;
                                        var55.field7624 = class481.field7063.method712(-31039) - var13;
                                        var55.field7627 = var11.field882;
                                        class481.field7066.method2270(0, var55);
                                    }
                                }
                                if (var11.field950 && var21 && var11.field979 != null) {
                                    class519 var56 = new class519();
                                    var56.field7630 = true;
                                    var56.field7625 = var11;
                                    var56.field7629 = class481.field7063.method713(122) - var12;
                                    var56.field7624 = class481.field7063.method712(-31039) - var13;
                                    var56.field7627 = var11.field979;
                                    class481.field7066.method2270(0, var56);
                                }
                                if (var11.field950 && !var21) {
                                    var11.field950 = false;
                                    if (var11.field978 != null) {
                                        class519 var57 = new class519();
                                        var57.field7630 = true;
                                        var57.field7625 = var11;
                                        var57.field7629 = class481.field7063.method713(81) - var12;
                                        var57.field7624 = class481.field7063.method712(-31039) - var13;
                                        var57.field7627 = var11.field978;
                                        class407.field5986.method2270(0, var57);
                                    }
                                }
                                if (var11.field919 != null) {
                                    class519 var58 = new class519();
                                    var58.field7625 = var11;
                                    var58.field7627 = var11.field919;
                                    class98.field1595.method2270(0, var58);
                                }
                                if (var11.field915 != null && class229.field3350 > var11.field958) {
                                    if (var11.field897 == null || class229.field3350 - var11.field958 > 32) {
                                        class519 var63 = new class519();
                                        var63.field7625 = var11;
                                        var63.field7627 = var11.field915;
                                        class481.field7066.method2270(0, var63);
                                    } else {
                                        label691: for (int var59 = var11.field958; var59 < class229.field3350; var59++) {
                                            int var60 = class202.field2926[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field897.length; var61++) {
                                                if (var11.field897[var61] == var60) {
                                                    class519 var62 = new class519();
                                                    var62.field7625 = var11;
                                                    var62.field7627 = var11.field915;
                                                    class481.field7066.method2270(0, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field958 = class229.field3350;
                                }
                                if (var11.field875 != null && class45.field684 > var11.field906) {
                                    if (var11.field849 == null || class45.field684 - var11.field906 > 32) {
                                        class519 var68 = new class519();
                                        var68.field7625 = var11;
                                        var68.field7627 = var11.field875;
                                        class481.field7066.method2270(0, var68);
                                    } else {
                                        label667: for (int var64 = var11.field906; var64 < class45.field684; var64++) {
                                            int var65 = class220.field3171[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field849.length; var66++) {
                                                if (var11.field849[var66] == var65) {
                                                    class519 var67 = new class519();
                                                    var67.field7625 = var11;
                                                    var67.field7627 = var11.field875;
                                                    class481.field7066.method2270(0, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field906 = class45.field684;
                                }
                                if (var11.field905 != null && class493.field7192 > var11.field963) {
                                    if (var11.field912 == null || class493.field7192 - var11.field963 > 32) {
                                        class519 var73 = new class519();
                                        var73.field7625 = var11;
                                        var73.field7627 = var11.field905;
                                        class481.field7066.method2270(0, var73);
                                    } else {
                                        label643: for (int var69 = var11.field963; var69 < class493.field7192; var69++) {
                                            int var70 = class411.field6047[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field912.length; var71++) {
                                                if (var11.field912[var71] == var70) {
                                                    class519 var72 = new class519();
                                                    var72.field7625 = var11;
                                                    var72.field7627 = var11.field905;
                                                    class481.field7066.method2270(0, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field963 = class493.field7192;
                                }
                                if (var11.field908 != null && class101.field1612 > var11.field991) {
                                    if (var11.field904 == null || class101.field1612 - var11.field991 > 32) {
                                        class519 var78 = new class519();
                                        var78.field7625 = var11;
                                        var78.field7627 = var11.field908;
                                        class481.field7066.method2270(0, var78);
                                    } else {
                                        label619: for (int var74 = var11.field991; var74 < class101.field1612; var74++) {
                                            int var75 = class265.field3830[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field904.length; var76++) {
                                                if (var11.field904[var76] == var75) {
                                                    class519 var77 = new class519();
                                                    var77.field7625 = var11;
                                                    var77.field7627 = var11.field908;
                                                    class481.field7066.method2270(0, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field991 = class101.field1612;
                                }
                                if (var11.field975 != null && class331.field5100 > var11.field848) {
                                    if (var11.field867 == null || class331.field5100 - var11.field848 > 32) {
                                        class519 var83 = new class519();
                                        var83.field7625 = var11;
                                        var83.field7627 = var11.field975;
                                        class481.field7066.method2270(0, var83);
                                    } else {
                                        label595: for (int var79 = var11.field848; var79 < class331.field5100; var79++) {
                                            int var80 = class310.field4448[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field867.length; var81++) {
                                                if (var11.field867[var81] == var80) {
                                                    class519 var82 = new class519();
                                                    var82.field7625 = var11;
                                                    var82.field7627 = var11.field975;
                                                    class481.field7066.method2270(0, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field848 = class331.field5100;
                                }
                                if (class461.field6808 > var11.field838 && var11.field844 != null) {
                                    class519 var84 = new class519();
                                    var84.field7625 = var11;
                                    var84.field7627 = var11.field844;
                                    class481.field7066.method2270(0, var84);
                                }
                                if (class92.field1521 > var11.field838 && var11.field884 != null) {
                                    class519 var85 = new class519();
                                    var85.field7625 = var11;
                                    var85.field7627 = var11.field884;
                                    class481.field7066.method2270(0, var85);
                                }
                                if (class202.field2928 > var11.field838 && var11.field987 != null) {
                                    class519 var86 = new class519();
                                    var86.field7625 = var11;
                                    var86.field7627 = var11.field987;
                                    class481.field7066.method2270(0, var86);
                                }
                                if (class415.field6110 > var11.field838 && var11.field873 != null) {
                                    class519 var87 = new class519();
                                    var87.field7625 = var11;
                                    var87.field7627 = var11.field873;
                                    class481.field7066.method2270(0, var87);
                                }
                                if (class371.field5563 > var11.field838 && var11.field883 != null) {
                                    class519 var88 = new class519();
                                    var88.field7625 = var11;
                                    var88.field7627 = var11.field883;
                                    class481.field7066.method2270(0, var88);
                                }
                                var11.field838 = class285.field4130;
                                if (var11.field985 != null) {
                                    for (int var89 = 0; var89 < class42.field643; var89++) {
                                        class519 var90 = new class519();
                                        var90.field7625 = var11;
                                        var90.field7628 = class125.field1922[var89].method244((byte) -121);
                                        var90.field7621 = class125.field1922[var89].method233((byte) -22);
                                        var90.field7627 = var11.field985;
                                        class481.field7066.method2270(0, var90);
                                    }
                                }
                                if (class261.field3763 && var11.field871 != null) {
                                    class519 var91 = new class519();
                                    var91.field7625 = var11;
                                    var91.field7627 = var11.field871;
                                    class481.field7066.method2270(0, var91);
                                }
                            }
                            if (var11.field843 == 5 && var11.field949 != -1) {
                                var11.method426(-125, class233.field3389, class25.field443).method1514((byte) 94, class394.field5821, var11.field896);
                            }
                            class397.method2473(var11, -128);
                            if (var11.field843 == 0) {
                                method1347(arg0, var11.field955, var14, var15, var16, var17, var12 - var11.field885, var13 - var11.field855, arg8, arg9);
                                if (var11.field910 != null) {
                                    method1347(var11.field910, var11.field955, var14, var15, var16, var17, var12 - var11.field885, var13 - var11.field855, arg8, arg9);
                                }
                                class183 var92 = (class183) class466.field6844.method2485(121, (long) var11.field955);
                                if (var92 != null) {
                                    if (class371.field5565 == class321.field4649 && var92.field2750 == 0 && !class314.field4487 && var21 && !class38.field578) {
                                        class346.method2244(-81);
                                    }
                                    class205.method1375(var15, var13, var92.field2753, arg9, var16, var17, arg8, var14, 105, var12);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class397.method2473(var11, -128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static void method1348(int arg0) {
        field2878 = null;
        field2884 = null;
        if (arg0 == -31) {
            field2875 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltn;)Ld;")
    public static final class102 method1349(class58 arg0) {
        class102 var1 = (class102) class392.field5803.method2485(109, ((long) arg0.field955 << 32) + (long) arg0.field840);
        return var1 == null ? arg0.field957 : var1;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2881++;
        try {
            if (arg0.length != 4) {
                class172.method1216(85, "argument count");
            }
            class16.field247 = Integer.parseInt(arg0[0]);
            class108.field1683 = class461.field6804;
            if (arg0[1].equals("live")) {
                class389.field5760 = class1.field11;
            } else if (arg0[1].equals("rc")) {
                class389.field5760 = class207.field2974;
            } else if (arg0[1].equals("wip")) {
                class389.field5760 = class165.field2472;
            } else {
                class172.method1216(116, "modewhat");
            }
            class370.field5530 = class55.method398(arg0[2], (byte) 9);
            if (class370.field5530 == -1) {
                if (arg0[2].equals("english")) {
                    class370.field5530 = 0;
                } else if (arg0[2].equals("german")) {
                    class370.field5530 = 1;
                } else {
                    class172.method1216(66, "language");
                }
            }
            class176.field2677 = false;
            class522.field7677 = false;
            if (arg0[3].equals("game0")) {
                class321.field4649 = class371.field5565;
            } else if (arg0[3].equals("game1")) {
                class321.field4649 = class193.field2824;
            } else {
                class172.method1216(88, "game");
            }
            class389.field5759 = 0;
            class17.field260 = 0;
            class192.field2821 = class321.field4649.field3929;
            class121.field1889 = true;
            class333.field5121 = true;
            class475.field6992 = "";
            client var1 = new client();
            class238.field3446 = var1;
            var1.method2513(class321.field4649.field3925, 588, true, 1024, 768, class389.field5760.method2742(-25320) + 32, 30, false);
            class409.field6029.setLocation(40, 40);
        } catch (Exception var3) {
            class169.method1200(null, var3, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    private final void method1350(int arg0, int arg1) {
        field2882++;
        class214.field3086 = null;
        class113.field1786 = 0;
        class381.field5680 = null;
        class383.field5691.field3799++;
        if (arg1 == Integer.MAX_VALUE) {
            class383.field5691.field3801 = arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method1351(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field2883++;
        if (class17.field266 == 1000) {
            return;
        }
        long var2 = class270.method1733(1) / 1000000L - class452.field6599;
        class452.field6599 = class270.method1733(1) / 1000000L;
        boolean var4 = class518.method3061((byte) 107);
        if (var4 && class124.field1918 && class84.field1407 != null) {
            class84.field1407.method1156(8);
        }
        if (class17.field266 == 30 || class17.field266 == 10) {
            if (class148.field2231 != 0L && class464.method2773((byte) 103) > class148.field2231) {
                class412.method2542(class397.field5830.field127, false, class397.field5830.field132, (byte) 83, class428.method2611(1));
            } else if (!class394.field5821.method484() && class425.field6241) {
                class382.method2418(65535);
            }
        }
        if (class320.field4577 == null) {
            Container var5;
            if (class409.field6029 == null) {
                var5 = class112.field1785.field4458;
            } else {
                var5 = class409.field6029;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class409.field6029 == var5) {
                Insets var8 = class409.field6029.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class382.field5683 != var6 || class183.field2752 != var7) {
                if (class394.field5821 == null || class394.field5821.method524()) {
                    class323.method2095(true);
                } else {
                    class382.field5683 = var6;
                    class183.field2752 = var7;
                }
                class148.field2231 = class464.method2773((byte) 103) + 500L;
            }
        }
        if (class320.field4577 != null && !class407.field5987 && (class17.field266 == 30 || class17.field266 == 10)) {
            class412.method2542(-1, false, -1, (byte) 76, class397.field5830.field124);
        }
        boolean var9 = false;
        if (class245.field3532) {
            class245.field3532 = false;
            var9 = true;
        }
        if (var9) {
            class248.method1582((byte) -23);
        }
        if (class394.field5821 != null && class394.field5821.method484() || class428.method2611(1) != 1) {
            class67.method582(-25099);
        }
        if (class17.field266 == 0) {
            class319.method1998(class162.field2446[class192.field2821], class37.field575, class112.field1779[class192.field2821], var9, class31.field499, 2, class203.field2936[class192.field2821]);
        } else if (class17.field266 == 5) {
            class7.method55(class394.field5821, class162.field2446[class192.field2821].getRGB(), class526.field7731, class203.field2936[class192.field2821].getRGB(), var9 | class394.field5821.method484(), class112.field1779[class192.field2821].getRGB(), true);
        } else if (class17.field266 == 10) {
            class360.method2317((byte) 121);
        } else if (class17.field266 == 25 || class17.field266 == 28) {
            if (class139.field2099 == 1) {
                if (class467.field6866 < class292.field4183) {
                    class467.field6866 = class292.field4183;
                }
                int var10 = (class467.field6866 - class292.field4183) * 50 / class467.field6866;
                class54.method392((byte) -6, true, class239.field3480.method1273(true, class370.field5530) + "<br>(" + var10 + "%)", class55.field808);
            } else if (class139.field2099 == 2) {
                if (class360.field5439 > class454.field6719) {
                    class454.field6719 = class360.field5439;
                }
                int var11 = (class454.field6719 - class360.field5439) * 50 / class454.field6719 + 50;
                class54.method392((byte) 11, true, class239.field3480.method1273(true, class370.field5530) + "<br>(" + var11 + "%)", class55.field808);
            } else {
                class54.method392((byte) -58, true, class239.field3480.method1273(true, class370.field5530), class55.field808);
            }
        } else if (class17.field266 == 30) {
            class6.method49(var2, 125);
        } else if (class17.field266 == 40) {
            class54.method392((byte) 116, true, class157.field2382.method1273(true, class370.field5530) + "<br>" + class386.field5720.method1273(true, class370.field5530), class55.field808);
        }
        if (class482.field7078 == 3) {
            for (int var12 = 0; var12 < class73.field1232; var12++) {
                Rectangle var13 = class135.field2072[var12];
                if (class459.field6776[var12]) {
                    class394.field5821.method1175(var13.width, 8, var13.x, -1996553985, var13.height, var13.y);
                } else if (class482.field7076[var12]) {
                    class394.field5821.method1175(var13.width, 8, var13.x, -1996554240, var13.height, var13.y);
                }
            }
        }
        if (class454.method2736(-24647)) {
            class290.method1802(0, class394.field5821);
        }
        if ((class17.field266 == 30 || class17.field266 == 10) && class482.field7078 == 0 && class428.method2611(arg0 + 2) == 1 && !var9 && class312.field4470.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class73.field1232; var15++) {
                if (class482.field7076[var15]) {
                    class482.field7076[var15] = false;
                    class289.field4157[var14++] = class135.field2072[var15];
                }
            }
            class394.field5821.method435(class289.field4157, var14);
        } else if (class17.field266 != 0) {
            class394.field5821.method521();
            for (int var16 = 0; var16 < class73.field1232; var16++) {
                class482.field7076[var16] = false;
            }
        }
        if (class397.field5830.field139 == 0) {
            class185.method1285(arg0 + 117, 15L);
        } else if (class397.field5830.field139 == 1) {
            class185.method1285(arg0 + 126, 10L);
        } else if (class397.field5830.field139 == 2) {
            class185.method1285(112, 5L);
        } else if (class397.field5830.field139 == 3) {
            class185.method1285(115, 2L);
        }
        if (class410.field6038) {
            class351.method2279(false);
        }
        if (class397.field5830.field122 && class17.field266 == 10 && class341.field5207 != -1) {
            class397.field5830.field122 = false;
            class397.field5830.method1299((byte) 99, class112.field1785);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method1352(int arg0) {
        int var1 = class333.field5117;
        int[] var2 = class459.field6766;
        for (int var3 = 0; var3 < class322.field4943 + var1; var3++) {
            class22 var4;
            if (var3 < var1) {
                var4 = class390.field5783[var2[var3]];
            } else {
                var4 = class132.field2030[class101.field1623[var3 - var1]];
            }
            if (var4.field5538 == arg0 && var4.field334 >= 0) {
                int var5 = var4.method184(1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5529 & 0x7F) != 0 || (var4.field5539 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field5529 & 0x7F) != 64 || (var4.field5539 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field5529 >> 7;
                    int var7 = var4.field5539 >> 7;
                    if (var4.field334 > class504.field7404[var6][var7]) {
                        class504.field7404[var6][var7] = var4.field334;
                        class522.field7666[var6][var7] = 1;
                    } else if (class504.field7404[var6][var7] == var4.field334) {
                        var10002 = class522.field7666[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field5529 - var8 >> 7;
                    int var10 = var4.field5539 - var8 >> 7;
                    int var11 = var4.field5529 + var8 >> 7;
                    int var12 = var4.field5539 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field334 > class504.field7404[var13][var14]) {
                                class504.field7404[var13][var14] = var4.field334;
                                class522.field7666[var13][var14] = 1;
                            } else if (class504.field7404[var13][var14] == var4.field334) {
                                var10002 = class522.field7666[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltn;)Ltn;")
    public static final class58 method1353(class58 arg0) {
        int var1 = method1349(arg0).method786((byte) -3);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class421.method2578(-4179, arg0.field876);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1354(int arg0) {
        method1348(-31);
        field2874++;
        class396.method2469(249);
        class369.method2369(-105);
        class434.method2625((byte) 102);
        class180.method1272((byte) 116);
        class282.method1780(29337);
        class278.method1768(false);
        class268.method1716(false);
        class117.method859(3);
        class439.method2662((byte) 103);
        class111.method824(1431655765);
        class398.method2474(0);
        class403.method2515(false);
        class287.method1794(-1);
        class456.method2740(97);
        class500.method2987((byte) 57);
        class271.method1741(57);
        class413.method2548(4);
        class162.method1172((byte) -26);
        class187.method1293((byte) 109);
        class324.method2098((byte) 103);
        class348.method2262((byte) -121);
        class60.method540(true);
        class85.method689(30000);
        class263.method1680((byte) -50);
        class138.method1019((byte) -58);
        class380.method2409(-14002);
        class84.method661(5);
        class275.method1752(28257);
        class518.method3059((byte) 69);
        class364.method2340(-1);
        class169.method1203((byte) 108);
        class461.method2761((byte) 84);
        class497.method2961(41);
        class340.method2224(false);
        class34.method268(false);
        class300.method1852(82);
        class48.method358(64);
        class182.method1277(true);
        class73.method610((byte) -13);
        class297.method1831(-95);
        class277.method1763(91);
        class253.method1609(9363);
        class522.method3082(50);
        class418.method2573(false);
        class261.method1662((byte) 115);
        class173.method1235(61);
        class170.method1211(122);
        class223.method1472(0);
        class511.method3035(false);
        class239.method1552((byte) 79);
        class344.method2238(99);
        class88.method719(-1);
        class89.method727(64);
        class334.method2198((byte) 82);
        class264.method1688(-3);
        class13.method115(false);
        class477.method2848(-1);
        class188.method1300(93);
        class26.method214((byte) 92);
        class323.method2096(107);
        class133.method976(false);
        class425.method2599(1);
        class145.method1047(-66);
        class388.method2438((byte) 119);
        class233.method1512(3499);
        class259.method1636(1349767207);
        class58.method423((byte) -29);
        class207.method1388(1);
        class62.method562(0);
        class21.method175(-15855);
        class294.method1819(261300);
        class22.method180(4466);
        class488.method2924(4);
        class165.method1185(-104);
        class489.method2930((byte) -74);
        class64.method566(-11563);
        class394.method2462((byte) 120);
        class102.method785((byte) 2);
        class123.method929((byte) 118);
        class90.method732((byte) -121);
        class292.method1810(-30848);
        class237.method1539(14);
        class397.method2471(84);
        class435.method2633(-229);
        class508.method3002(-4833);
        class447.method2706((byte) -117);
        class409.method2534(-123);
        class178.method1265(-100);
        class8.method58((byte) 4);
        class45.method339(true);
        class402.method2502((byte) 51);
        class357.method2306(28516);
        class121.method920(true);
        class142.method1033(11730);
        class151.method1094(-128);
        class379.method2403(false);
        class503.method2992(11);
        class510.method3024(96);
        class527.method3115((byte) 89);
        class35.method280(1);
        class148.method1064(-22259);
        class172.method1212(-87);
        class476.method2845(-51);
        class326.method2117(-8365);
        class160.method1165((byte) -116);
        class44.method332(1630200752);
        class310.method1944(true);
        class381.method2417((byte) 115);
        class16.method151(530071045);
        class12.method98(81);
        class492.method2941(211);
        class131.method963((byte) 127);
        class139.method1023(true);
        class493.method2942(-93);
        class248.method1584(0);
        class134.method990(1);
        class112.method827((byte) 76);
        class120.method871(false);
        class502.method2989(128);
        class67.method583(0);
        class410.method2540((byte) -68);
        class41.method322(0);
        class482.method2880(10);
        class484.method2889(6774);
        class234.method1524();
        class221.method1460(0);
        class441.method2679(-125);
        class373.method2388(false);
        class378.method2398((byte) 26);
        class20.method173((byte) 73);
        class108.method803(55);
        class317.method1991(-15838);
        class150.method1079();
        class2.method16();
        class104.method789(7083);
        class42.method326(0);
        class130.method956();
        class490.method2934(17);
        class210.method1395(true);
        if (arg0 >= -34) {
            field2878 = null;
        }
        class451.method2714(-128);
        class470.method2807((byte) -61);
        class257.method1629(-86);
        class105.method792((byte) -68);
        class216.method1425(17213);
        class251.method1600(21099);
        class23.method197(0);
        class93.method749(-26783);
        class241.method1561((byte) -80);
        class68.method589(-16777216);
        class220.method1459(1190717);
        class443.method2694(-1);
        class17.method162(5);
        class319.method2001(-120);
        class318.method1995((byte) -100);
        class494.method2948(-2);
        class390.method2449(-26745);
        class154.method1118(-116);
        class342.method2231(6879);
        class246.method1578(-10);
        class442.method2687((byte) -108);
        class256.method1626(-1);
        class51.method371(0);
        class290.method1801((byte) 88);
        class30.method249((byte) 115);
        class467.method2783(65535);
        class509.method3005(79);
        class307.method1931(false);
        class96.method765(true);
        class372.method2382(-23151);
        class260.method1658();
        class483.method2887(-106);
        class91.method741((byte) 122);
        class325.method2100(-10699);
        class455.method2739(93);
        class507.method2999((byte) -118);
        class27.method218(1);
        class86.method702((byte) 91);
        class407.method2524(-105);
        class274.method1748(-118);
        class519.method3069(0);
        class516.method3057((byte) 34);
        class322.method2094(-1);
        class480.method2867(31);
        class311.method1947(41);
        class438.method2661(121);
        class524.method3097(120);
        class177.method1261(40);
        class525.method3101(true);
        class255.method1621(-5588);
        class377.method2395(3358);
        class353.method2288((byte) 126);
        class78.method636(-1);
        class365.method2354((byte) -89);
        class229.method1502(-116);
        class360.method2319(false);
        class417.method2565((byte) 111);
        class72.method604((byte) -116);
        class81.method647(-1799743513);
        class53.method389(0);
        class341.method2227(-1);
        class74.method619((byte) 37);
        class298.method1838((byte) -43);
        class335.method2201((byte) -128);
        class36.method287(-7989);
        class301.method1857(6);
        class37.method292(-121);
        class400.method2490(1);
        class359.method2316(-30525);
        class63.method563(87);
        class331.method2190((byte) -126);
        class374.method2390(10999);
        class375.method2393(-94);
        class238.method1550((byte) -86);
        class258.method1631(-771161753);
        class52.method378(15502);
        class412.method2543(3);
        class107.method802((byte) 89);
        class54.method395(-27336);
        class168.method1195(true);
        class517.method3058();
        class46.method350(-1913087156);
        class113.method834((byte) -108);
        class444.method2696((byte) 108);
        class87.method707(true);
        class427.method2607(18545);
        class214.method1422((byte) -31);
        class219.method1453(3685);
        class404.method2518(4);
        class146.method1049(127);
        class14.method129((byte) 62);
        class383.method2422(100);
        class362.method2327();
        class415.method2560(100);
        class358.method2311(120);
        class285.method1788(1);
        class57.method405(31);
        class163.method1182((byte) -85);
        class371.method2373(83);
        class339.method2214(-29303);
        class225.method1495((byte) -122);
        class504.method2995(-1706797714);
        class227.method1498(24315);
        class448.method2707((byte) -119);
        class414.method2556(true);
        class242.method1564(true);
        class411.method2541((byte) 88);
        class25.method209((byte) -24);
        class283.method1784(-88);
        class269.method1731();
        class445.method2703(0);
        class195.method1332();
        class431.method2620();
        class462.method2769();
        class161.method1167(-20439);
        class95.method762(-123);
        class252.method1604();
        class224.method1480(-86);
        class347.method2253((byte) -125);
        class128.method942(15);
        class421.method2580(2);
        class495.method2951(true);
        class299.method1845();
        class530.method3139(-91);
        class354.method2292(false);
        class230.method1504((byte) 10);
        class226.method1497((byte) 125);
        class472.method2821((byte) -124);
        class118.method865((byte) -128);
        class24.method202((byte) 123);
        class79.method641(-22503);
        class103.method787((byte) 31);
        class106.method799((byte) 122);
        class389.method2442(-115);
        class460.method2758(-123);
        class529.method3134(-103);
        class515.method3051(28);
        class66.method573(-125);
        class167.method1190(13392);
        class458.method2748(122);
        class109.method809(-40);
        class321.method2063((byte) -117);
        class474.method2840(-1165);
        class387.method2433((byte) 123);
        class129.method955(-89);
        class179.method1269(false);
        class408.method2528(9);
        class122.method925(-2172);
        class308.method1935((byte) -125);
        class217.method1442((byte) 116);
        class440.method2667(126);
        class125.method932(false);
        class92.method746((byte) -37);
        class453.method2729(false);
        class202.method1366(-61);
        class329.method2145((byte) 92);
        class191.method1309();
        class193.method1319(true);
        class520.method3072(0);
        class491.method2937((byte) -115);
        class513.method3040(0);
        class457.method2747(-81);
        class38.method296((byte) -79);
        class265.method1696(107);
        class416.method2563(3);
        class436.method2638((byte) -112);
        class526.method3106((byte) 114);
        class452.method2716(0);
        class119.method868(false);
        class272.method1742(1);
        class450.method2711(-125);
        class55.method399(false);
        class459.method2752((byte) 80);
        class424.method2590((byte) -93);
        class127.method941((byte) 70);
        class399.method2487(3195);
        class186.method1290(-9061);
        class289.method1799((byte) -127);
        class80.method646(2);
        class291.method1808((byte) -124);
        class432.method2622((byte) -91);
        class101.method777(-61);
        class98.method774(-26401);
        class270.method1737((byte) 91);
        class132.method970((byte) -119);
        class367.method2362(false);
        class479.method2863((byte) -50);
        class305.method1928((byte) 102);
        class31.method255((byte) 70);
        class405.method2521(72);
        class454.method2738((byte) 103);
        class423.method2587();
        class498.method2986();
        class33.method262((byte) 107);
        class466.method2781((byte) 78);
        class4.method38(3);
        class382.method2419((byte) 114);
        class332.method2193(112);
        class406.method2523(false);
        class43.method327(false);
        class156.method1127((byte) -72);
        class11.method96((byte) -97);
        class366.method2357((byte) -93);
        class430.method2613(128);
        class296.method1829((byte) -87);
        class196.method1360((byte) -105);
        class481.method2874(-1);
        class205.method1373((byte) -61);
        class47.method352(-1);
        class124.method930(-128);
        class356.method2297(0);
        class267.method1712((byte) 32);
        class523.method3091((byte) -128);
        class471.method2812(false);
        class18.method166((byte) 116);
        class147.method1051((byte) -92);
        class94.method758((byte) -41);
        class320.method2004(true);
        class343.method2236((byte) 119);
        class327.method2141((byte) 126);
        class351.method2281(true);
        class309.method1937(0);
        class333.method2195((byte) 75);
        class266.method1703(13761);
        class1.method4(-35);
        class114.method843(302);
        class273.method1744((byte) -103);
        class496.method2952(0);
        class355.method2294(65535);
        class279.method1773((byte) -72);
        class288.method1796(0);
        class82.method652(true);
        class392.method2455(2);
        class204.method1370(-31263);
        class206.method1378(0);
        class485.method2895((byte) 2);
        class175.method1257(true);
        class250.method1594(4096);
        class203.method1368((byte) 77);
        class475.method2843(8);
        class254.method1617(true);
        class135.method991(-25034);
        class437.method2642(103);
        class185.method1286((byte) 33);
        class212.method1415(6634);
        class420.method2575((byte) -43);
        class157.method1129(110);
        class49.method361((byte) 118);
        class143.method1034(80);
        class240.method1556((byte) 109);
        class401.method2495(-219366424);
        class469.method2802(Integer.MIN_VALUE);
        class231.method1510((byte) -105);
        class29.method243(0);
        class152.method1098(false);
        class192.method1312(64);
        class5.method43(0);
        class428.method2609(-31);
        class245.method1569((byte) -49);
        class83.method654((byte) 45);
        class200.method1365(91);
        class97.method770(true);
        class222.method1465(-1);
        class65.method571(119);
        class386.method2429((byte) -115);
        class465.method2775(true);
        class6.method50(-1);
        class346.method2248((byte) -104);
        class56.method401(110);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1355() {
        int var0 = class333.field5117;
        int[] var1 = class459.field6766;
        boolean var2 = class397.field5830.field113 == 1 && var0 > 200 || class397.field5830.field113 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class62 var12 = class390.field5783[var1[var3]];
            if (var12.method557(3)) {
                var12.method188((byte) 76);
                if (var12.field5532 >= 0 && var12.field5535 >= 0 && var12.field5542 < class237.field3436 && var12.field5540 < class83.field1366) {
                    var12.field1095 = var12.field393 ? var2 : false;
                    if (class95.field1558 == var12) {
                        var12.field334 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field366) {
                            var13++;
                        }
                        if (var12.field336 > class180.field2734) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method184(1) << 2);
                        if (var12.field1102) {
                            var14 += 512;
                        } else {
                            if (class529.field7812 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field334 = var14 + 1;
                    }
                } else {
                    var12.field334 = -1;
                }
            } else {
                var12.field334 = -1;
            }
        }
        for (int var4 = 0; var4 < class322.field4943; var4++) {
            class13 var9 = class132.field2030[class101.field1623[var4]];
            if (var9.method118(3) && var9.field210.method1055(class526.field7733, 8840)) {
                var9.method188((byte) 76);
                if (var9.field5532 >= 0 && var9.field5535 >= 0 && var9.field5542 < class237.field3436 && var9.field5540 < class83.field1366) {
                    int var10 = 0;
                    if (!var9.field366) {
                        var10++;
                    }
                    if (var9.field336 > class180.field2734) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method184(1) << 2);
                    if (class529.field7812 == 0) {
                        if (var9.field210.field2175) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class529.field7812 == 1) {
                        if (var9.field210.field2175) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field210.field2179) {
                        var11 += 1024;
                    } else if (!var9.field210.field2213) {
                        var11 += 256;
                    }
                    var9.field334 = var11 + 1;
                } else {
                    var9.field334 = -1;
                }
            } else {
                var9.field334 = -1;
            }
        }
        for (int var5 = 0; var5 < class187.field2777.length; var5++) {
            class324 var6 = class187.field2777[var5];
            if (var6 != null) {
                if (var6.field4969 == 1) {
                    class13 var7 = class132.field2030[var6.field4972];
                    if (var7 != null && var7.field334 >= 0) {
                        var7.field334 += 2048;
                    }
                } else if (var6.field4969 == 10) {
                    class62 var8 = class390.field5783[var6.field4972];
                    if (var8 != null && class95.field1558 != var8 && var8.field334 >= 0) {
                        var8.field334 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2871++;
        if (!this.method2511((byte) 85)) {
            return;
        }
        class16.field247 = Integer.parseInt(this.getParameter("worldid"));
        class108.field1683 = class86.method698(Integer.parseInt(this.getParameter("modewhere")), (byte) -121);
        if (!class466.method2776(class108.field1683, -94) && class502.field7371 != class108.field1683) {
            class108.field1683 = class502.field7371;
        }
        class389.field5760 = method1336(Integer.parseInt(this.getParameter("modewhat")), -105);
        if (class389.field5760 != class165.field2472 && class389.field5760 != class207.field2974 && class389.field5760 != class1.field11) {
            class389.field5760 = class1.field11;
        }
        try {
            class370.field5530 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class370.field5530 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class522.field7677 = true;
        } else {
            class522.field7677 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class176.field2677 = true;
        } else {
            class176.field2677 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class8.field125 = true;
        } else {
            class8.field125 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class321.field4649 = class193.field2824;
        } else {
            class321.field4649 = class371.field5565;
        }
        try {
            class389.field5759 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class389.field5759 = 0;
        }
        class490.field7155 = this.getParameter("quiturl");
        class475.field6992 = this.getParameter("settings");
        if (class475.field6992 == null) {
            class475.field6992 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class17.field260 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class17.field260 = 0;
            }
        }
        class192.field2821 = Integer.parseInt(this.getParameter("colourid"));
        if (class192.field2821 < 0 || class192.field2821 >= class203.field2936.length) {
            class192.field2821 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class121.field1889 = true;
            class333.field5121 = true;
        }
        if (class371.field5565 == class321.field4649) {
            class353.field5345 = 503;
            class7.field107 = 765;
        } else if (class321.field4649 == class193.field2824) {
            class7.field107 = 640;
            class353.field5345 = 480;
        }
        class238.field3446 = this;
        this.method2512(588, class353.field5345, class7.field107, true, class389.field5760.method2742(-25320) + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
    private final void method1356(boolean arg0, byte[] arg1) {
        if (!arg0) {
            main(null);
        }
        field2885++;
        class303 var3 = new class303(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method1918((byte) 127);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class96.field1566 = new int[6];
                    var5[0] = var3.method1868(0);
                    var5[1] = var3.method1868(0);
                    var5[2] = var3.method1868(0);
                    var5[3] = var3.method1868(0);
                    var5[4] = var3.method1868(0);
                    var5[5] = var3.method1868(0);
                } else if (var4 == 4) {
                    int var8 = var3.method1918((byte) 115);
                    class500.field7357 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class500.field7357[var9] = var3.method1868(0);
                        if (class500.field7357[var9] == 65535) {
                            class500.field7357[var9] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var6 = var3.method1918((byte) -110);
                    class20.field294 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class20.field294[var7] = var3.method1868(0);
                        if (class20.field294[var7] == 65535) {
                            class20.field294[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1357(byte arg0) {
        field2877++;
        boolean var2 = class383.field5691.method1671(0);
        if (arg0 < 30) {
            field2875 = null;
        }
        if (!var2) {
            this.method1339(29948);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    private final void method1358(int arg0) {
        if (!class397.field5830.field122) {
            for (int var2 = 0; var2 < class42.field643; var2++) {
                if (class125.field1922[var2].method233((byte) -46) == 's' || class125.field1922[var2].method233((byte) -119) == 'S') {
                    class397.field5830.field122 = true;
                    break;
                }
            }
        }
        field2887++;
        if (class56.field817 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class464.method2773((byte) 103);
            if (class135.field2073 == 0L) {
                class135.field2073 = var5;
            }
            if (var4 > 16384 && (var5 - class135.field2073) < 5000L) {
                if ((var5 - class156.field2365) > 1000L) {
                    System.gc();
                    class156.field2365 = var5;
                }
                class31.field499 = class88.field1480.method1273(true, class370.field5530);
                class37.field575 = 5;
            } else {
                class31.field499 = class360.field5438.method1273(true, class370.field5530);
                class37.field575 = 5;
                class56.field817 = 10;
            }
        } else if (class56.field817 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class255.field3679[var7] = class189.method1303(class237.field3436, 1, class83.field1366);
            }
            class31.field499 = class74.field1240.method1273(true, class370.field5530);
            class37.field575 = 10;
            class56.field817 = 20;
        } else if (class56.field817 == 20) {
            if (class161.field2437 == null) {
                class161.field2437 = new class380(class383.field5691, class327.field5067);
            }
            if (class161.field2437.method2407((byte) -40)) {
                class445.field6540 = class81.method648((byte) -22, true, false, 1, 0);
                class327.field5068 = class81.method648((byte) -22, true, false, 1, 1);
                class200.field2917 = class81.method648((byte) -22, true, false, 1, 2);
                class104.field1648 = class81.method648((byte) -22, true, false, 1, 3);
                class250.field3600 = class81.method648((byte) -22, true, false, 1, 4);
                class490.field7157 = class81.method648((byte) -22, true, true, 1, 5);
                class427.field6244 = class81.method648((byte) -22, false, true, 1, 6);
                class300.field4276 = class81.method648((byte) -22, true, false, 1, 7);
                class460.field6798 = class81.method648((byte) -22, true, false, 1, 8);
                class488.field7115 = class81.method648((byte) -22, true, false, 1, 9);
                class515.field7577 = class81.method648((byte) -22, true, false, 1, 10);
                class515.field7580 = class81.method648((byte) -22, true, false, 1, 11);
                class334.field5125 = class81.method648((byte) -22, true, false, 1, 12);
                class420.field6181 = class81.method648((byte) -22, true, false, 1, 13);
                class272.field3933 = class81.method648((byte) -22, false, false, 1, 14);
                class380.field5670 = class81.method648((byte) -22, true, false, 1, 15);
                class34.field526 = class81.method648((byte) -22, true, false, 1, 16);
                class16.field249 = class81.method648((byte) -22, true, false, 1, 17);
                class36.field544 = class81.method648((byte) -22, true, false, 1, 18);
                class8.field120 = class81.method648((byte) -22, true, false, 1, 19);
                class484.field7095 = class81.method648((byte) -22, true, false, 1, 20);
                class496.field7216 = class81.method648((byte) -22, true, false, 1, 21);
                class24.field435 = class81.method648((byte) -22, true, false, 1, 22);
                class511.field7543 = class81.method648((byte) -22, true, true, 1, 23);
                class143.field2120 = class81.method648((byte) -22, true, false, 1, 24);
                class378.field5646 = class81.method648((byte) -22, true, false, 1, 25);
                class26.field454 = class81.method648((byte) -22, true, true, 1, 26);
                class387.field5735 = class81.method648((byte) -22, true, false, 1, 27);
                class93.field1533 = class81.method648((byte) -22, true, true, 1, 28);
                class447.field6544 = class81.method648((byte) -22, true, false, 1, 29);
                class31.field499 = class489.field7143.method1273(true, class370.field5530);
                class56.field817 = 30;
                class37.field575 = 15;
            } else {
                class31.field499 = class219.field3162.method1273(true, class370.field5530);
                class37.field575 = 12;
            }
        } else if (arg0 == 75) {
            if (class56.field817 == 30) {
                int var8 = 0;
                for (int var9 = 0; var9 < 30; var9++) {
                    var8 += class401.field5888[var9].method312(true) * class66.field1165[var9] / 100;
                }
                if (var8 == 100) {
                    class31.field499 = class179.field2729.method1273(true, class370.field5530);
                    class37.field575 = 20;
                    class327.method2142(false, class460.field6798);
                    class525.method3100(class460.field6798, 29055);
                    class56.field817 = 40;
                } else {
                    if (var8 != 0) {
                        class31.field499 = class504.field7394.method1273(true, class370.field5530) + var8 + "%";
                    }
                    class37.field575 = 20;
                }
            } else if (class56.field817 == 40) {
                if (class93.field1533.method687(0)) {
                    this.method1356(true, class93.field1533.method680(true, 1));
                    class31.field499 = class216.field3110.method1273(true, class370.field5530);
                    class37.field575 = 25;
                    class56.field817 = 50;
                } else {
                    class31.field499 = class300.field4270.method1273(true, class370.field5530) + class93.field1533.method666((byte) 19) + "%";
                    class37.field575 = 25;
                }
            } else if (class56.field817 == 50) {
                class434.method2626((byte) 19);
                class31.field499 = class24.field424.method1273(true, class370.field5530);
                class56.field817 = 60;
                class37.field575 = 30;
            } else if (class56.field817 == 60) {
                int var10 = class165.method1187(class460.field6798, (byte) -26, class420.field6181);
                int var11 = class318.method1993((byte) 127);
                if (var10 < var11) {
                    class31.field499 = class477.field7007.method1273(true, class370.field5530) + var10 * 100 / var11 + "%";
                    class37.field575 = 35;
                } else {
                    class31.field499 = class323.field4959.method1273(true, class370.field5530);
                    class37.field575 = 35;
                    class56.field817 = 70;
                }
            } else if (class56.field817 == 70) {
                int var12 = class142.method1032(class460.field6798, 0);
                int var13 = class67.method580(false);
                if (var12 < var13) {
                    class31.field499 = class114.field1812.method1273(true, class370.field5530) + var12 * 100 / var13 + "%";
                    class37.field575 = 40;
                } else {
                    class31.field499 = class438.field6392.method1273(true, class370.field5530);
                    class37.field575 = 40;
                    class56.field817 = 80;
                }
            } else if (class56.field817 == 80) {
                if (class26.field454.method687(0)) {
                    class237.field3440 = new class257(class26.field454, class488.field7115, class460.field6798);
                    class31.field499 = class125.field1925.method1273(true, class370.field5530);
                    class56.field817 = 90;
                    class37.field575 = 45;
                } else {
                    class31.field499 = class168.field2522.method1273(true, class370.field5530) + class26.field454.method666((byte) 19) + "%";
                    class37.field575 = 45;
                }
            } else if (class56.field817 == 90) {
                class31.field499 = class346.field5256.method1273(true, class370.field5530);
                class56.field817 = 95;
                class37.field575 = 50;
            } else if (class56.field817 == 95) {
                if (class397.field5830.field122) {
                    class397.field5830.field142 = 0;
                    class397.field5830.field143 = 0;
                    class397.field5830.field109 = 0;
                    class397.field5830.field124 = 1;
                    class397.field5830.field137 = 0;
                }
                class397.field5830.field122 = true;
                class397.field5830.method1299((byte) 106, class112.field1785);
                class348.method2261(class397.field5830.field143, (byte) -76, false);
                class31.field499 = class275.field3967.method1273(true, class370.field5530);
                class56.field817 = 100;
                class37.field575 = 55;
            } else if (class56.field817 == 100) {
                class381.method2413(class394.field5821, class460.field6798, class420.field6181, 6);
                class31.field499 = class333.field5118.method1273(true, class370.field5530);
                class37.field575 = 60;
                class138.method1022(5, 1);
                class56.field817 = 110;
            } else if (class56.field817 == 110) {
                byte var14 = 0;
                class200.field2917.method687(0);
                int var15 = var14 + class200.field2917.method666((byte) 19);
                class34.field526.method687(0);
                int var16 = var15 + class34.field526.method666((byte) 19);
                class16.field249.method687(0);
                int var17 = var16 + class16.field249.method666((byte) 19);
                class36.field544.method687(0);
                int var18 = var17 + class36.field544.method666((byte) 19);
                class8.field120.method687(arg0 - 75);
                int var19 = var18 + class8.field120.method666((byte) 19);
                class484.field7095.method687(0);
                int var20 = var19 + class484.field7095.method666((byte) 19);
                class496.field7216.method687(0);
                int var21 = var20 + class496.field7216.method666((byte) 19);
                class24.field435.method687(arg0 - 75);
                int var22 = var21 + class24.field435.method666((byte) 19);
                class143.field2120.method687(0);
                int var23 = var22 + class143.field2120.method666((byte) 19);
                class378.field5646.method687(0);
                int var24 = var23 + class378.field5646.method666((byte) 19);
                class387.field5735.method687(0);
                int var25 = var24 + class387.field5735.method666((byte) 19);
                class447.field6544.method687(0);
                int var26 = var25 + class447.field6544.method666((byte) 19);
                if (var26 < 1200) {
                    class31.field499 = class112.field1782.method1273(true, class370.field5530) + var26 / 12 + "%";
                    class37.field575 = 65;
                } else {
                    class219.field3164 = new class418(class321.field4649, class370.field5530, class200.field2917);
                    class4.field64 = new class169(class321.field4649, class370.field5530, class200.field2917);
                    class230.field3355 = new class461(class321.field4649, class370.field5530, class200.field2917, class460.field6798);
                    class405.field5963 = new class497(class321.field4649, class370.field5530, class16.field249);
                    class407.field5984 = new class340(class321.field4649, class370.field5530, class200.field2917);
                    class224.field3259 = new class34(class321.field4649, class370.field5530, class200.field2917);
                    class413.field6075 = new class300(class321.field4649, class370.field5530, class200.field2917, class300.field4276);
                    class458.field6760 = new class48(class321.field4649, class370.field5530, class200.field2917);
                    class17.field267 = new class182(class321.field4649, class370.field5530, class200.field2917);
                    class246.field3567 = new class73(class321.field4649, class370.field5530, true, class34.field526, class300.field4276);
                    class495.field7209 = new class297(class321.field4649, class370.field5530, class200.field2917, class460.field6798);
                    class173.field2651 = new class277(class321.field4649, class370.field5530, class200.field2917, class460.field6798);
                    class500.field7358 = new class253(class321.field4649, class370.field5530, true, class36.field544, class300.field4276);
                    class8.field111 = new class522(class321.field4649, class370.field5530, true, class219.field3164, class8.field120, class300.field4276);
                    class275.field3992 = new class261(class321.field4649, class370.field5530, class200.field2917);
                    class311.field4455 = new class173(class321.field4649, class370.field5530, class484.field7095, class445.field6540, class327.field5068);
                    class233.field3389 = new class170(class321.field4649, class370.field5530, class200.field2917);
                    class25.field443 = new class39(class321.field4649, class370.field5530, class200.field2917);
                    class450.field6582 = new class223(class321.field4649, class370.field5530, class496.field7216, class300.field4276);
                    class418.field6177 = new class511(class321.field4649, class370.field5530, class200.field2917);
                    class496.field7227 = new class239(class321.field4649, class370.field5530, class200.field2917);
                    class367.field5499 = new class344(class321.field4649, class370.field5530, class200.field2917);
                    class369.field5528 = new class88(class321.field4649, class370.field5530, class24.field435);
                    class85.field1409 = new class89(class321.field4649, class370.field5530, class200.field2917);
                    class224.method1482(class420.field6181, -9850, class104.field1648, class460.field6798, class300.field4276);
                    class225.method1494(class447.field6544, true);
                    class292.field4185 = new class334(class370.field5530, class143.field2120, class378.field5646);
                    class121.field1892 = new class264(class370.field5530, class143.field2120, class378.field5646, new class155());
                    class31.field499 = class254.field3662.method1273(true, class370.field5530);
                    class37.field575 = 65;
                    class371.method2375((byte) -84);
                    class246.field3567.method612((byte) 110, !class397.field5830.method1292(class399.field5865, -2));
                    class526.field7733 = new class473();
                    class185.method1287(1);
                    class417.method2567(class387.field5735, 0);
                    class396.method2470(-13704, class300.field4276, class237.field3440);
                    class56.field817 = 120;
                }
            } else if (class56.field817 == 120) {
                int var27 = class120.method872(0, class460.field6798);
                int var28 = class127.method939((byte) -104);
                if (var27 < var28) {
                    class31.field499 = class450.field6571.method1273(true, class370.field5530) + var27 * 100 / var28 + "%";
                    class37.field575 = 70;
                } else {
                    class122.method926(class394.field5821, 96, class460.field6798);
                    class229.method1503((byte) -128, class402.field5901);
                    class31.field499 = class78.field1303.method1273(true, class370.field5530);
                    class56.field817 = 130;
                    class37.field575 = 70;
                }
            } else if (class56.field817 == 130) {
                if (class515.field7577.method665("", (byte) 63, "huffman")) {
                    class61 var29 = new class61(class515.field7577.method674(-2, "", "huffman"));
                    class175.method1258(var29, -10220);
                    class31.field499 = class344.field5241.method1273(true, class370.field5530);
                    class37.field575 = 75;
                    class56.field817 = 140;
                } else {
                    class31.field499 = class424.field6222.method1273(true, class370.field5530) + "0%";
                    class37.field575 = 75;
                }
            } else if (class56.field817 == 140) {
                if (class104.field1648.method687(arg0 ^ 0x4B)) {
                    class31.field499 = class12.field198.method1273(true, class370.field5530);
                    class56.field817 = 150;
                    class37.field575 = 80;
                } else {
                    class31.field499 = class340.field5198.method1273(true, class370.field5530) + class104.field1648.method666((byte) 19) + "%";
                    class37.field575 = 80;
                }
            } else if (class56.field817 == 150) {
                if (class334.field5125.method687(arg0 ^ 0x4B)) {
                    class31.field499 = class466.field6857.method1273(true, class370.field5530);
                    class37.field575 = 82;
                    class56.field817 = 160;
                } else {
                    class31.field499 = class440.field6417.method1273(true, class370.field5530) + class334.field5125.method666((byte) 19) + "%";
                    class37.field575 = 82;
                }
            } else if (class56.field817 == 160) {
                if (class420.field6181.method687(0)) {
                    class31.field499 = class143.field2119.method1273(true, class370.field5530);
                    class56.field817 = 170;
                    class37.field575 = 85;
                } else {
                    class31.field499 = class143.field2119.method1273(true, class370.field5530) + class420.field6181.method666((byte) 19) + "%";
                    class37.field575 = 85;
                }
            } else if (class56.field817 == 170) {
                if (class511.field7543.method676("details", false)) {
                    class2.method27(class511.field7543, class407.field5984, class224.field3259, class246.field3567, class495.field7209, class173.field2651, class526.field7733);
                    class31.field499 = class298.field4255.method1273(true, class370.field5530);
                    class37.field575 = 89;
                    class56.field817 = 180;
                } else {
                    class31.field499 = class253.field3648.method1273(true, class370.field5530) + class511.field7543.method657((byte) 82, "details") + "%";
                    class37.field575 = 87;
                }
            } else if (class56.field817 == 180) {
                int var30 = class210.method1403(false);
                if (var30 == -1) {
                    class31.field499 = class357.field5400.method1273(true, class370.field5530);
                    class37.field575 = 90;
                } else if (var30 == 7 || var30 == 9) {
                    this.method2505(arg0 - 76, "worldlistfull");
                    class138.method1022(1000, 1);
                } else if (class324.field4977) {
                    class31.field499 = class72.field1203.method1273(true, class370.field5530);
                    class37.field575 = 90;
                    class56.field817 = 190;
                } else {
                    this.method2505(-1, "worldlistio_" + var30);
                    class138.method1022(1000, 1);
                }
            } else if (class56.field817 == 190) {
                class400.field5869 = new int[class367.field5499.field5242];
                class123.field1915 = new String[class496.field7227.field3478];
                class424.field6226 = new boolean[class367.field5499.field5242];
                for (int var31 = 0; var31 < class367.field5499.field5242; var31++) {
                    if (class367.field5499.method2239((byte) -102, var31).field3695 == 0) {
                        class424.field6226[var31] = true;
                        class475.field6996++;
                    }
                    class400.field5869[var31] = -1;
                }
                class248.method1583(-90);
                class31.field505 = class104.field1648.method677(-1, "loginscreen");
                class490.field7157.method660(false, true, arg0 ^ 0x4B);
                class427.field6244.method660(true, true, 0);
                class460.field6798.method660(true, true, 0);
                class420.field6181.method660(true, true, 0);
                class515.field7577.method660(true, true, 0);
                class104.field1648.method660(true, true, arg0 ^ 0x4B);
                class410.field6038 = true;
                class200.field2917.field1398 = 2;
                class16.field249.field1398 = 2;
                class34.field526.field1398 = 2;
                class36.field544.field1398 = 2;
                class8.field120.field1398 = 2;
                class484.field7095.field1398 = 2;
                class496.field7216.field1398 = 2;
                class412.method2542(-1, false, -1, (byte) 75, class397.field5830.field124);
                class31.field499 = class89.field1487.method1273(true, class370.field5530);
                class56.field817 = 200;
                class37.field575 = 95;
            } else if (class56.field817 == 200) {
                class410.method2536(true, -17143);
            }
        }
    }
}
