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
public class client extends class116 {

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Llc;")
    private static class143 field4022 = class66.method374("Members object", -1);

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Llc;")
    public static class143 field4014 = field4022;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lli;")
    public static class191 field4020 = new class191();

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method1504(int arg0) {
        for (class163 var1 = (class163) class212.field3942.method1818(false); var1 != null; var1 = (class163) class212.field3942.method1834((byte) 114)) {
            int var3 = var1.field2929;
            if (class47.method289((byte) 78, var3)) {
                boolean var4 = true;
                class43[] var5 = class223.field4045[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field786;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var1.field1162;
                    class43 var8 = class27.method186(1341, var7);
                    if (var8 != null) {
                        class141.method844((byte) -122, var8);
                    }
                }
            }
        }
        int var2 = -12 % ((arg0 - 32) / 48);
        field4015++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lvh;)Z")
    public static final boolean method1505(class43 arg0) {
        if (class184.field3341) {
            if (method1514(arg0) != 0) {
                return false;
            }
            if (arg0.field769 == 0) {
                return false;
            }
        }
        return arg0.field865;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method1506(byte arg0) {
        for (class88.field1596 = 0; class261.method1742((byte) 71) && class88.field1596 < 128; class88.field1596++) {
            class190.field3484[class88.field1596] = class263.field4689;
            class134.field2355[class88.field1596] = class229.field4191;
        }
        field4026++;
        class128.field2252++;
        if (arg0 != 41) {
            return;
        }
        if (class7.field138 != -1) {
            class82.method468(class269.field4820, class7.field138, (byte) -114, 0, 0, class10.field222, 0, 0);
        }
        class13.field249++;
        class250.method1660(-18512);
        while (true) {
            class91 var2;
            class43 var3;
            class43 var4;
            do {
                var2 = (class91) field4020.method1291(0);
                if (var2 == null) {
                    while (true) {
                        class91 var5;
                        class43 var6;
                        class43 var7;
                        do {
                            var5 = (class91) class231.field4221.method1291(arg0 ^ 0x29);
                            if (var5 == null) {
                                while (true) {
                                    class91 var8;
                                    class43 var9;
                                    class43 var10;
                                    do {
                                        var8 = (class91) class230.field4203.method1291(arg0 - 41);
                                        if (var8 == null) {
                                            if (class50.field996 != null) {
                                                class47.method288(-1);
                                            }
                                            if (class16.field285 != null && class16.field285.field3241 == 1) {
                                                if (class16.field285.field3239 != null) {
                                                    class62.method355(class245.field4393, arg0 ^ 0xFFFFFF96, class161.field2910);
                                                }
                                                class245.field4393 = null;
                                                class161.field2910 = false;
                                                class16.field285 = null;
                                            }
                                            if ((class146.field2635 % 1500) == 0) {
                                                class290.method1938(2750);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field1641;
                                        if (var9.field719 < 0) {
                                            break;
                                        }
                                        var10 = class27.method186(1341, var9.field789);
                                    } while (var10 == null || var10.field885 == null || var10.field885.length <= var9.field719 || var10.field885[var9.field719] != var9);
                                    class247.method1638(var8, (byte) -91);
                                }
                            }
                            var6 = var5.field1641;
                            if (var6.field719 < 0) {
                                break;
                            }
                            var7 = class27.method186(1341, var6.field789);
                        } while (var7 == null || var7.field885 == null || var7.field885.length <= var6.field719 || var7.field885[var6.field719] != var6);
                        class247.method1638(var5, (byte) -91);
                    }
                }
                var3 = var2.field1641;
                if (var3.field719 < 0) {
                    break;
                }
                var4 = class27.method186(1341, var3.field789);
            } while (var4 == null || var4.field885 == null || var3.field719 >= var4.field885.length || var4.field885[var3.field719] != var3);
            class247.method1638(var2, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1507(int arg0) {
        if (!class63.field1185) {
            label233: while (true) {
                do {
                    if (!class261.method1742((byte) 75)) {
                        break label233;
                    }
                } while (class229.field4191 != 115 && class229.field4191 != 83);
                class63.field1185 = true;
            }
        }
        field4019++;
        if (class1.field7 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class205.method1403(-83);
            if (class62.field1175 == 0L) {
                class62.field1175 = var4;
            }
            if (var3 > 16384 && (var4 - class62.field1175) < 5000L) {
                if ((var4 - class258.field4632) > 1000L) {
                    System.gc();
                    class258.field4632 = var4;
                }
                class194.field3592 = class259.field4640;
                class43.field876 = 5;
            } else {
                class43.field876 = 5;
                class194.field3592 = class218.field3989;
                class1.field7 = 10;
            }
        } else if (class1.field7 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class171.field3052[var6] = new class106(104, 104);
            }
            class194.field3592 = class30.field475;
            class1.field7 = 30;
            class43.field876 = 10;
        } else if (class1.field7 == 30) {
            if (class71.field1352 == null) {
                class71.field1352 = new class5(class79.field1430, class243.field4367);
            }
            if (class71.field1352.method21(-19361)) {
                class143.field2566 = class55.method331(13140, false, true, 0, true);
                class31.field488 = class55.method331(13140, false, true, 1, true);
                class134.field2359 = class55.method331(13140, true, true, 2, false);
                class132.field2321 = class55.method331(13140, false, true, 3, true);
                class89.field1614 = class55.method331(13140, false, true, 4, true);
                class57.field1110 = class55.method331(13140, true, true, 5, true);
                class278.field4911 = class55.method331(13140, true, false, 6, true);
                class109.field1915 = class55.method331(13140, false, true, 7, true);
                class140.field2439 = class55.method331(13140, false, true, 8, true);
                class266.field4777 = class55.method331(13140, false, true, 9, true);
                class109.field1911 = class55.method331(13140, false, true, 10, true);
                class14.field254 = class55.method331(13140, false, true, 11, true);
                class66.field1244 = class55.method331(13140, false, true, 12, true);
                class171.field3063 = class55.method331(13140, false, true, 13, true);
                class116.field2036 = class55.method331(13140, false, false, 14, true);
                class66.field1230 = class55.method331(13140, false, true, 15, true);
                class50.field1001 = class55.method331(13140, false, true, 16, true);
                class234.field4245 = class55.method331(13140, false, true, 17, true);
                class31.field487 = class55.method331(13140, false, true, 18, true);
                class49.field952 = class55.method331(13140, false, true, 19, true);
                class32.field538 = class55.method331(13140, false, true, 20, true);
                class54.field1047 = class55.method331(13140, false, true, 21, true);
                class194.field3609 = class55.method331(13140, false, true, 22, true);
                class227.field4099 = class55.method331(13140, true, true, 23, true);
                class185.field3364 = class55.method331(13140, false, true, 24, true);
                class229.field4192 = class55.method331(13140, false, true, 25, true);
                class17.field297 = class55.method331(13140, true, true, 26, true);
                class235.field4291 = class55.method331(13140, false, true, 27, true);
                class194.field3592 = class285.field5005;
                class43.field876 = 15;
                class1.field7 = 40;
            } else {
                class43.field876 = 12;
                class194.field3592 = class76.field1418;
            }
        } else if (class1.field7 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class136.field2395[var8].method937(4015) * class163.field2920[var8] / 100;
            }
            if (var7 == 100) {
                class43.field876 = 20;
                class194.field3592 = class139.field2409;
                class54.method329(81, class140.field2439);
                class283.method1868(true, class140.field2439);
                class173.method1136(class140.field2439, (byte) 76);
                class1.field7 = 45;
            } else {
                if (var7 != 0) {
                    class194.field3592 = class25.method179(0, new class143[] { class87.field1592, class274.method1806(var7, true), class80.field1459 });
                }
                class43.field876 = 20;
            }
        } else if (class1.field7 == 45) {
            class269.method1780(-1, class88.field1594, 2, 22050);
            class174.field3121 = new class206();
            class174.field3121.method1404(9, 255, 128);
            class185.field3366 = class172.method1126(class155.field2792, 0, class4.field62, -69, 22050);
            class185.field3366.method1655(class174.field3121, (byte) 119);
            class24.method168(class116.field2036, class66.field1230, class174.field3121, class89.field1614, 5000);
            class231.field4232 = class172.method1126(class155.field2792, 1, class4.field62, -52, 2048);
            class86.field1578 = new class151();
            class231.field4232.method1655(class86.field1578, (byte) 121);
            class134.field2345 = new class82(22050, class190.field3494);
            field4012 = class278.field4911.method55(-1, class126.field2232);
            class194.field3592 = class282.field4954;
            class1.field7 = 50;
            class43.field876 = 30;
        } else if (class1.field7 == 50) {
            int var9 = class50.method307(20720, class171.field3063, class140.field2439);
            int var10 = class144.method916(false);
            if (var9 < var10) {
                class194.field3592 = class25.method179(0, new class143[] { class290.field5101, class274.method1806(var9 * 100 / var10, true), class80.field1459 });
                class43.field876 = 35;
            } else {
                class1.field7 = 60;
                class194.field3592 = class29.field464;
                class43.field876 = 35;
            }
        } else if (class1.field7 == 60) {
            int var11 = class145.method924(class140.field2439, 0);
            int var12 = class128.method775((byte) -116);
            if (var12 > var11) {
                class194.field3592 = class25.method179(0, new class143[] { class184.field3348, class274.method1806(var11 * 100 / var12, true), class80.field1459 });
                class43.field876 = 40;
            } else {
                class194.field3592 = class164.field2938;
                class43.field876 = 40;
                class1.field7 = 65;
            }
        } else if (class1.field7 == 65) {
            class62.method356(class140.field2439, -23090, class171.field3063);
            class194.field3592 = class101.field1790;
            class43.field876 = 45;
            class43.method271(5, -126);
            class1.field7 = 70;
        } else if (class1.field7 == 70) {
            byte var13 = 0;
            class134.field2359.method62(true);
            int var14 = var13 + class134.field2359.method51(118);
            class50.field1001.method62(true);
            int var15 = var14 + class50.field1001.method51(101);
            class234.field4245.method62(true);
            int var16 = var15 + class234.field4245.method51(114);
            class31.field487.method62(true);
            int var17 = var16 + class31.field487.method51(103);
            class49.field952.method62(true);
            int var18 = var17 + class49.field952.method51(126);
            class32.field538.method62(true);
            int var19 = var18 + class32.field538.method51(121);
            class54.field1047.method62(true);
            int var20 = var19 + class54.field1047.method51(123);
            class194.field3609.method62(true);
            int var21 = var20 + class194.field3609.method51(108);
            class185.field3364.method62(true);
            int var22 = var21 + class185.field3364.method51(123);
            class229.field4192.method62(true);
            int var23 = var22 + class229.field4192.method51(113);
            class235.field4291.method62(true);
            int var24 = var23 + class235.field4291.method51(112);
            if (var24 < 1100) {
                class194.field3592 = class25.method179(0, new class143[] { class119.field2110, class274.method1806(var24 / 11, true), class80.field1459 });
                class43.field876 = 50;
            } else {
                class25.method175(16, class134.field2359);
                class157.method1033((byte) 55, class134.field2359);
                class95.method563(1, class134.field2359);
                class99.method588(class134.field2359, class109.field1915, 23450);
                class245.method1627(-7270, true, class109.field1915, class50.field1001);
                class71.method410(class31.field487, -12606, class109.field1915);
                class50.method308(-1, true, class49.field952, class116.field2068, class109.field1915);
                class10.method88(class134.field2359, 103);
                class166.method1091(-17113, class31.field488, class143.field2566, class32.field538);
                class74.method428(true, class54.field1047, class109.field1915);
                class72.method417(-84, class194.field3609);
                class140.method841(class134.field2359, -120);
                class37.method245(class171.field3063, class140.field2439, (byte) 122, class109.field1915, class132.field2321);
                class278.method1840(class134.field2359, -13570);
                class146.method940(class234.field4245, 6118);
                class185.method1206(new class136(), class185.field3364, 1, class229.field4192);
                class234.method1583(125, class185.field3364, class229.field4192);
                class194.field3592 = class136.field2383;
                class43.field876 = 50;
                class192.method1299(-1);
                class1.field7 = 80;
            }
        } else if (class1.field7 == 80) {
            int var25 = class33.method224(14508, class140.field2439);
            int var26 = class59.method342((byte) 93);
            if (var25 < var26) {
                class194.field3592 = class25.method179(0, new class143[] { class235.field4285, class274.method1806(var25 * 100 / var26, true), class80.field1459 });
                class43.field876 = 60;
            } else {
                class132.method792((byte) 4, class140.field2439);
                class1.field7 = 90;
                class194.field3592 = class79.field1439;
                class43.field876 = 60;
            }
        } else {
            if (arg0 >= -41) {
                field4022 = null;
            }
            if (class1.field7 == 90) {
                if (class17.field297.method62(true)) {
                    class66 var27 = new class66(class266.field4777, class17.field297, class140.field2439, 20, !class43.field847);
                    class196.method1354(var27);
                    if (class182.field3257 == 1) {
                        class196.method1362(0.9F);
                    }
                    if (class182.field3257 == 2) {
                        class196.method1362(0.8F);
                    }
                    if (class182.field3257 == 3) {
                        class196.method1362(0.7F);
                    }
                    if (class182.field3257 == 4) {
                        class196.method1362(0.6F);
                    }
                    class194.field3592 = class37.field657;
                    class43.field876 = 70;
                    class1.field7 = 100;
                } else {
                    class194.field3592 = class25.method179(0, new class143[] { class247.field4430, class274.method1806(class17.field297.method51(113), true), class80.field1459 });
                    class43.field876 = 70;
                }
            } else if (class1.field7 == 100) {
                if (class82.method474(class140.field2439, (byte) -80)) {
                    class1.field7 = 110;
                }
            } else if (class1.field7 == 110) {
                class282.field4960 = new class15();
                class4.field62.method460(class282.field4960, (byte) 62, 10);
                class1.field7 = 120;
                class194.field3592 = class21.field340;
                class43.field876 = 75;
            } else if (class1.field7 == 120) {
                if (class109.field1911.method46(0, class21.field342, class65.field1218)) {
                    class169 var28 = new class169(class109.field1911.method45(class21.field342, class65.field1218, -119));
                    class164.method1083(true, var28);
                    class194.field3592 = class255.field4583;
                    class1.field7 = 130;
                    class43.field876 = 80;
                } else {
                    class194.field3592 = class25.method179(0, new class143[] { class141.field2455, class164.field2941 });
                    class43.field876 = 80;
                }
            } else if (class1.field7 == 130) {
                if (!class132.field2321.method62(true)) {
                    class194.field3592 = class25.method179(0, new class143[] { class75.field1396, class274.method1806(class132.field2321.method51(99) * 3 / 4, true), class80.field1459 });
                    class43.field876 = 85;
                } else if (!class66.field1244.method62(true)) {
                    class194.field3592 = class25.method179(0, new class143[] { class75.field1396, class274.method1806(class66.field1244.method51(119) / 10 + 75, true), class80.field1459 });
                    class43.field876 = 85;
                } else if (!class171.field3063.method62(true)) {
                    class194.field3592 = class25.method179(0, new class143[] { class75.field1396, class274.method1806(class171.field3063.method51(106) / 20 + 85, true), class80.field1459 });
                    class43.field876 = 85;
                } else if (class227.field4099.method56(true, class152.field2758)) {
                    class1.method5(class214.field3952, class227.field4099, class71.field1348, class3.field46, class283.field4993, class115.field2026, 0);
                    class125.method750(class235.field4291);
                    class1.field7 = 135;
                    class43.field876 = 95;
                    class194.field3592 = class154.field2791;
                } else {
                    class194.field3592 = class25.method179(0, new class143[] { class75.field1396, class274.method1806(class227.field4099.method30(0, class152.field2758) / 10 + 90, true), class80.field1459 });
                    class43.field876 = 85;
                }
            } else if (class1.field7 == 135) {
                int var29 = class49.method296(false);
                if (var29 == -1) {
                    class43.field876 = 95;
                    class194.field3592 = class26.field434;
                } else if (var29 == 7 || var29 == 9) {
                    this.method713("worldlistfull", 125);
                    class43.method271(1000, -29);
                } else if (class270.field4825) {
                    class43.field876 = 96;
                    class1.field7 = 140;
                    class194.field3592 = class203.field3689;
                } else {
                    this.method713("worldlistio_" + var29, 121);
                    class43.method271(1000, -36);
                }
            } else if (class1.field7 == 140) {
                class37.field635 = class132.field2321.method55(-1, class37.field650);
                class57.field1110.method48(85, true, false);
                class278.field4911.method48(114, true, true);
                class140.field2439.method48(123, true, true);
                class171.field3063.method48(124, true, true);
                class109.field1911.method48(110, true, true);
                class132.field2321.method48(88, true, true);
                class1.field7 = 150;
                class194.field3592 = class228.field4112;
                class43.field876 = 97;
                class282.field4950 = true;
            } else if (class1.field7 == 150) {
                if (class63.field1185) {
                    class127.field2244 = 0;
                    class74.field1385 = 0;
                    class120.field2126 = 0;
                }
                class63.field1185 = true;
                class290.method1945(class4.field62, (byte) -124);
                class127.method772(-1, class120.field2126, -1, false, 10979);
                class194.field3592 = class135.field2380;
                class43.field876 = 100;
                class1.field7 = 160;
            } else if (class1.field7 == 160) {
                class29.method196(true, 108);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method1508(int arg0) {
        field4016++;
        if (class79.field1430.field4982 > class249.field4493) {
            if (class92.field1656 == class266.field4778) {
                class266.field4778 = class209.field3843;
            } else {
                class266.field4778 = class92.field1656;
            }
            class248.field4446 = (class79.field1430.field4982 - 1) * 250;
            if (class248.field4446 > 3000) {
                class248.field4446 = 3000;
            }
            if (class79.field1430.field4982 >= 2 && class79.field1430.field4980 == 6) {
                this.method713("js5connect_outofdate", 123);
                class147.field2652 = 1000;
                return;
            }
            if (class79.field1430.field4982 >= 4 && class79.field1430.field4980 == -1) {
                this.method713("js5crc", 126);
                class147.field2652 = 1000;
                return;
            }
            if (class79.field1430.field4982 >= 4 && (class147.field2652 == 0 || class147.field2652 == 5)) {
                if (class79.field1430.field4980 == 7 || class79.field1430.field4980 == 9) {
                    this.method713("js5connect_full", 126);
                } else if (class79.field1430.field4980 > 0) {
                    this.method713("js5connect", 124);
                } else {
                    this.method713("js5io", 121);
                }
                class147.field2652 = 1000;
                return;
            }
        }
        class249.field4493 = class79.field1430.field4982;
        if (class248.field4446 > 0) {
            class248.field4446--;
            return;
        }
        try {
            if (class15.field270 == 0) {
                class217.field3966 = class4.field62.method461(class229.field4194, class266.field4778, (byte) -46);
                class15.field270++;
            }
            if (class15.field270 == 1) {
                if (class217.field3966.field3241 == 2) {
                    this.method1512(1000, (byte) 96);
                    return;
                }
                if (class217.field3966.field3241 == 1) {
                    class15.field270++;
                }
            }
            if (class15.field270 == 2) {
                class33.field567 = new class255((Socket) class217.field3966.field3239, class4.field62);
                class190 var2 = new class190(5);
                var2.method1276(844519173, 15);
                var2.method1280(-121, 522);
                class33.field567.method1685(var2.field3465, 5, false, 0);
                class15.field270++;
                class212.field3946 = class205.method1403(-51);
            }
            if (class15.field270 == 3) {
                if (class147.field2652 == 0 || class147.field2652 == 5 || class33.field567.method1681((byte) -128) > 0) {
                    int var3 = class33.field567.method1679(false);
                    if (var3 != 0) {
                        this.method1512(var3, (byte) 96);
                        return;
                    }
                    class15.field270++;
                } else if (class205.method1403(-51) - class212.field3946 > 30000L) {
                    this.method1512(1001, (byte) 96);
                    return;
                }
            }
            if (class15.field270 == 4) {
                boolean var4 = class147.field2652 == 5 || class147.field2652 == 10 || class147.field2652 == 28;
                class79.field1430.method1862(class33.field567, -100, !var4);
                class15.field270 = 0;
                class217.field3966 = null;
                class33.field567 = null;
            }
        } catch (IOException var5) {
            this.method1512(1002, (byte) 96);
        }
        if (arg0 > -41) {
            method1505((class43) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static void method1509(int arg0) {
        field4020 = null;
        if (arg0 != -1001) {
            field4020 = null;
        }
        field4014 = null;
        field4022 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method701(int arg0) {
        if (class282.field4960 != null) {
            class282.field4960.field273 = false;
        }
        class282.field4960 = null;
        if (class17.field298 != null) {
            class17.field298.method1682(1);
            class17.field298 = null;
        }
        class82.method470(class155.field2792, -2);
        class66.method387(111, class155.field2792);
        field4009++;
        if (class191.field3508 != null) {
            class191.field3508.method138(-26216, class155.field2792);
        }
        class55.method332(arg0 ^ 0xFFFFE199);
        class116.method706(arg0 - 22819);
        if (arg0 != 22818) {
            method1513((byte) -43);
        }
        class191.field3508 = null;
        if (class185.field3366 != null) {
            class185.field3366.method1652(1024);
        }
        if (class231.field4232 != null) {
            class231.field4232.method1652(1024);
        }
        class79.field1430.method1858(-104);
        class243.field4367.method1130(arg0 - 22818);
        try {
            if (class257.field4619 != null) {
                class257.field4619.method1931(false);
            }
            if (class254.field4558 != null) {
                for (int var2 = 0; var2 < class254.field4558.length; var2++) {
                    if (class254.field4558[var2] != null) {
                        class254.field4558[var2].method1931(false);
                    }
                }
            }
            if (class247.field4427 != null) {
                class247.field4427.method1931(false);
            }
            if (class29.field460 != null) {
                class29.field460.method1931(false);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1510(boolean arg0) {
        if (!arg0) {
            field4012 = 22;
        }
        field4010++;
        boolean var2 = class79.field1430.method1853(100);
        if (!var2) {
            this.method1508(-54);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private static final void method1511(byte arg0) {
        class33.method221(25964, 5);
        field4027++;
        class12.method100(arg0 + 4087, 5);
        class271.method1792(5, (byte) -111);
        class259.method1714(5, 32768);
        class206.method1419(255, 5);
        class146.method934(5, arg0 + 16374);
        class248.method1649(5, (byte) 82);
        class263.method1747(5, 0);
        class176.method1156((byte) 123, 5);
        class231.method1570(5, true);
        class114.method693(3, 5);
        class236.method1592((byte) -104, 50);
        if (arg0 == 9) {
            class203.method1387(5, false);
            class31.method208(5, (byte) 67);
            class5.field74.method835(1, 5);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method702(int arg0) {
        field4024++;
        if (class147.field2652 == 1000) {
            return;
        }
        boolean var2 = class157.method1026((byte) -76);
        if (var2 && class175.field3142 && class185.field3366 != null) {
            class185.field3366.method1642((byte) -54);
        }
        if ((class147.field2652 == 30 || class147.field2652 == 10) && (class201.field3672 || class273.field4864 != 0L && class205.method1403(arg0 ^ 0xFFFFFFD8) > class273.field4864)) {
            class127.method772(class75.field1400, class69.method399(arg0 - 128), class155.field2795, class201.field3672, 10979);
        }
        if (class23.field384 == null) {
            Container var3;
            if (class23.field384 != null) {
                var3 = class23.field384;
            } else if (class8.field155 == null) {
                var3 = class4.field62.field1469;
            } else {
                var3 = class8.field155;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class8.field155 == var3) {
                Insets var6 = class8.field155.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class159.field2883 != var4 || class217.field3979 != var5) {
                if (class81.field1482.startsWith("mac")) {
                    class217.field3979 = var5;
                    class159.field2883 = var4;
                } else {
                    class127.method769(2);
                }
                class273.field4864 = class205.method1403(-46) + 500L;
            }
        }
        boolean var7 = false;
        if (class105.field1851) {
            var7 = true;
            class105.field1851 = false;
        }
        if (var7) {
            class163.method1073((byte) -3);
        }
        if (class147.field2652 == 0) {
            class243.method1618(class43.field876, (Color) null, var7, class194.field3592, arg0 ^ 0x3224);
        } else if (class147.field2652 == 5) {
            class268.method1778(class239.field4326, (byte) -55, false);
        } else if (class147.field2652 == 10) {
            class232.method1573(arg0 ^ 0xFFFFEC41);
        } else if (class147.field2652 == 25 || class147.field2652 == 28) {
            if (class232.field4244 == 1) {
                if (class26.field443 < class13.field250) {
                    class26.field443 = class13.field250;
                }
                int var8 = (class26.field443 - class13.field250) * 50 / class26.field443;
                class236.method1593(16777215, false, class25.method179(0, new class143[] { class243.field4365, class71.field1349, class274.method1806(var8, true), class132.field2322 }));
            } else if (class232.field4244 == 2) {
                if (class75.field1399 > class21.field345) {
                    class21.field345 = class75.field1399;
                }
                int var9 = (class21.field345 - class75.field1399) * 50 / class21.field345 + 50;
                class236.method1593(arg0 + 16777215, false, class25.method179(0, new class143[] { class243.field4365, class71.field1349, class274.method1806(var9, true), class132.field2322 }));
            } else {
                class236.method1593(16777215, false, class243.field4365);
            }
        } else if (class147.field2652 == 30) {
            class158.method1037((byte) 58);
        } else if (class147.field2652 == 40) {
            class236.method1593(arg0 + 16777215, false, class25.method179(0, new class143[] { class114.field1989, class239.field4319, class25.field420 }));
        }
        if ((class147.field2652 == 30 || class147.field2652 == 10) && class57.field1109 == 0 && !var7) {
            try {
                Graphics var10 = class155.field2792.getGraphics();
                for (int var11 = 0; var11 < class128.field2260; var11++) {
                    if (class136.field2384[var11]) {
                        class35.field608.method323(class255.field4572[var11], var10, class133.field2330[var11], class176.field3151[var11], 2500, class237.field4306[var11]);
                        class136.field2384[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class155.field2792.repaint();
            }
        } else if (class147.field2652 != 0) {
            try {
                Graphics var12 = class155.field2792.getGraphics();
                class35.field608.method321(0, 0, var12, 0);
                for (int var13 = 0; var13 < class128.field2260; var13++) {
                    class136.field2384[var13] = false;
                }
            } catch (Exception var14) {
                class155.field2792.repaint();
            }
        }
        if (arg0 != 0) {
            this.method1506((byte) 51);
        }
        if (class282.field4950) {
            method1511((byte) 9);
        }
        if (class63.field1185 && class147.field2652 == 10 && class7.field138 != -1) {
            class63.field1185 = false;
            class290.method1945(class4.field62, (byte) -7);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    private final void method1512(int arg0, byte arg1) {
        class79.field1430.field4982++;
        class217.field3966 = null;
        class79.field1430.field4980 = arg0;
        class33.field567 = null;
        class15.field270 = 0;
        if (arg1 != 96) {
            field4012 = 113;
        }
        field4023++;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)Z")
    public static final boolean method1513(byte arg0) {
        if (arg0 != 71) {
            field4020 = null;
        }
        field4011++;
        return class24.field416 == 0 ? class184.field3342.method1418(-127) : true;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lvh;)I")
    public static final int method1514(class43 arg0) {
        class3 var1 = (class3) class12.field228.method1824(((long) arg0.field722 << 32) + (long) arg0.field719, 0);
        return var1 == null ? arg0.field799 : var1.field49;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method714(boolean arg0) {
        field4018++;
        if (class147.field2652 == 1000) {
            return;
        }
        class146.field2635++;
        if ((class146.field2635 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class227.field4103 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class16.field280.setSeed((long) class227.field4103);
        }
        this.method1510(true);
        if (class71.field1352 != null) {
            class71.field1352.method19(-30735);
        }
        class130.method788(-1);
        class224.method1543((byte) -56);
        class109.method657(-1433);
        class264.method1761(19190);
        if (arg0) {
            this.method1507(-53);
        }
        if (class191.field3508 != null) {
            int var3 = class191.field3508.method137(-45);
            class228.field4111 = var3;
        }
        if (class147.field2652 == 0) {
            this.method1507(-76);
            class110.method661(-32769);
        } else if (class147.field2652 == 5) {
            this.method1507(-42);
            class110.method661(-32769);
        } else if (class147.field2652 == 25 || class147.field2652 == 28) {
            class169.method1113(!arg0);
        }
        if (class147.field2652 == 10) {
            this.method1506((byte) 41);
            class195.method1349((byte) 29);
            class82.method472(-1);
            class70.method409(4);
        } else if (class147.field2652 == 30) {
            class201.method1379(false);
        } else if (class147.field2652 == 40) {
            class70.method409(4);
            if (class105.field1857 != -3) {
                if (class105.field1857 == 15) {
                    class44.method276(18990);
                    return;
                }
                if (class105.field1857 != 2) {
                    class39.method252((byte) -128);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lvh;)Lvh;")
    public static final class43 method1515(class43 arg0) {
        int var1 = class118.method725(method1514(arg0), (byte) -18);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class27.method186(1341, arg0.field789);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field4008++;
        try {
            if (arg0.length != 4) {
                class64.method365("argument count", 0);
            }
            class231.field4231 = Integer.parseInt(arg0[0]);
            class235.field4290 = 2;
            int var1 = -1;
            if (arg0[1].equals("live")) {
                class26.field444 = 0;
            } else if (arg0[1].equals("rc")) {
                class26.field444 = 1;
            } else if (arg0[1].equals("wip")) {
                class26.field444 = 2;
            } else {
                class64.method365("modewhat", 0);
            }
            class112.field1971 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class21.method150(class224.method1539(0, var2.length, -113, var2), 13349);
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class141.field2467 = var1;
            } else if (arg0[2].equals("english")) {
                class141.field2467 = 0;
            } else if (arg0[2].equals("german")) {
                class141.field2467 = 1;
            } else {
                class64.method365("language", 0);
            }
            class109.method656(class141.field2467, -125);
            class247.field4440 = false;
            class182.field3260 = false;
            if (arg0[3].equals("game0")) {
                class153.field2764 = 0;
            } else if (arg0[3].equals("game1")) {
                class153.field2764 = 1;
            } else {
                class64.method365("game", 0);
            }
            class254.field4561 = false;
            class173.field3104 = class21.field342;
            class267.field4792 = 0;
            class188.field3414 = 0;
            client var3 = new client();
            class63.field1201 = var3;
            var3.method703(1024, 28, class26.field444 + 32, "runescape", 522, 768, (byte) -110);
            class8.field155.setLocation(40, 40);
        } catch (Exception var6) {
            class255.method1689(69, (String) null, var6);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method709(int arg0) {
        field4013++;
        method1509(-1001);
        class143.method894((byte) 91);
        class125.method755();
        class290.method1936((byte) -84);
        class263.method1751(1);
        class189.method1225(11361);
        class80.method453(-7646);
        class135.method811(121);
        class116.method710((byte) 114);
        class12.method98((byte) -102);
        class145.method926((byte) 112);
        class15.method116((byte) -82);
        class58.method340((byte) -91);
        class190.method1281(true);
        class255.method1683((byte) 73);
        class282.method1866(0);
        class172.method1132((byte) -120);
        class5.method20(0);
        class7.method52(-67);
        class289.method1930(true);
        class164.method1082(6);
        class139.method828(0);
        class187.method1218(406674800);
        class134.method802(122);
        class106.method635(true);
        class43.method265((byte) -105);
        class32.method213(-102);
        class191.method1295((byte) 2);
        class277.method1821(-3);
        class38.method249(false);
        class25.method176(-25392);
        class171.method1124((byte) 127);
        class230.method1568(false);
        class206.method1410(29347);
        class248.method1656(0);
        class82.method475(-2);
        class114.method685(118);
        class104.method622((byte) 110);
        class228.method1556(85);
        class120.method735(22658);
        class249.method1658(true);
        class85.method491((byte) 5);
        class163.method1074((byte) -72);
        class256.method1696(false);
        class30.method200((byte) -48);
        class132.method791(-25480);
        class167.method1102(0);
        class152.method1009(255);
        class273.method1802((byte) -71);
        class101.method600((byte) -79);
        class115.method696(122);
        class195.method1346(true);
        class44.method275((byte) 65);
        class168.method1105((byte) 66);
        class227.method1550(109);
        class283.method1867(21457);
        class174.method1149((byte) -75);
        class137.method821(-1);
        class238.method1598(-1);
        class88.method504((byte) -123);
        class219.method1499(3);
        class13.method106(3);
        class94.method547();
        class268.method1779(19);
        class148.method962(0);
        class183.method1196();
        class192.method1301(11592);
        class161.method1066(-118);
        class97.method573(30085);
        class194.method1334(0);
        class264.method1758(-2761);
        class127.method770(2);
        class212.method1478(-124);
        class193.method1305();
        class141.method850(-32385);
        class159.method1040(1);
        class222.method1531();
        class176.method1162(0);
        class67.method390((byte) 47);
        class274.method1807(0);
        class102.method616();
        class232.method1572(12032);
        class252.method1670((byte) -119);
        class54.method325((byte) 96);
        class29.method195(15);
        class260.method1725();
        class64.method363(true);
        class118.method722(0);
        class217.method1488(1);
        class4.method15(5869);
        class11.method92((byte) 96);
        class272.method1794(-1);
        class89.method511(5);
        class175.method1153((byte) 94);
        class119.method733(64);
        class224.method1542((byte) -100);
        class225.method1546(1);
        class173.method1144(-50);
        class149.method970(-123);
        class218.method1493(false);
        class153.method1012(1);
        class9.method81(false);
        class204.method1390(-48);
        class136.method817((byte) -116);
        class74.method425(67);
        class66.method380(true);
        class95.method560(122);
        class196.method1355();
        class169.method1112((byte) -94);
        class8.method65((byte) 120);
        class259.method1712(1);
        class202.method1382(-121);
        class133.method796(0);
        class165.method1088(true);
        class18.method134(17708);
        class246.method1634(-14798);
        class26.method183((byte) -112);
        class91.method518(-17546);
        class51.method310((byte) -85);
        class1.method3(614264688);
        class211.method1474(1312);
        class223.method1536((byte) 8);
        class57.method338(-16589);
        class63.method358(false);
        class140.method837(-126);
        class105.method628(83);
        class117.method721((byte) -121);
        class93.method524();
        class72.method414((byte) -45);
        class266.method1769((byte) 35);
        class271.method1791(105);
        class270.method1786(true);
        class109.method654(16);
        class244.method1622(-3);
        class208.method1452(false);
        class166.method1089(31803);
        class162.method1072((byte) -97);
        class124.method747((byte) -98);
        class122.method740(true);
        if (arg0 >= -46) {
            return;
        }
        class182.method1184(32766);
        class250.method1663(18467);
        class180.method1180();
        class278.method1836(82);
        class258.method1704(1);
        class229.method1562(false);
        class157.method1032((byte) -84);
        class24.method165(5000);
        class47.method287(-23045);
        class3.method12(72);
        class257.method1701(false);
        class34.method227(true);
        class52.method317((byte) -28);
        class35.method236(true);
        class265.method1766((byte) 95);
        class65.method371(1);
        class37.method243((byte) -47);
        class92.method521((byte) -15);
        class184.method1204((byte) -97);
        class262.method1745((byte) 125);
        class20.method143(97);
        class251.method1664(-5);
        class53.method324((byte) 92);
        class55.method333(1000000);
        class33.method223((byte) 124);
        class56.method334(true);
        class276.method1816(-58);
        class98.method580();
        class49.method299(0);
        class254.method1676(-30105);
        class185.method1207((byte) 118);
        class242.method1614(0);
        class237.method1594((byte) 99);
        class6.method28((byte) 0);
        class284.method1869();
        class96.method564();
        class60.method344();
        class147.method947((byte) 110);
        class179.method1175(-36);
        class142.method854();
        class45.method280();
        class10.method87(255);
        class99.method583(-18000);
        class23.method158(126);
        class279.method1841(false);
        class31.method206(-9);
        class50.method303((byte) -60);
        class107.method648(0);
        class239.method1602((byte) -121);
        class14.method110((byte) 49);
        class267.method1775(-14421);
        class144.method920(-27076);
        class236.method1589(-12529);
        class201.method1381((byte) -117);
        class79.method449(-11438);
        class70.method403((byte) 10);
        class27.method185(12);
        class68.method395(-7);
        class48.method294(1);
        class22.method153(1);
        class41.method259(113);
        class110.method659((byte) 111);
        class247.method1637(83);
        class36.method241(-107);
        class178.method1172(127);
        class200.method1376(false);
        class155.method1019(93);
        class240.method1609((byte) 38);
        class188.method1220(-60);
        class126.method765((byte) 78);
        class170.method1115(0);
        class40.method258((byte) -76);
        class287.method1880((byte) 91);
        class128.method774(true);
        class154.method1017(8);
        class83.method477(false);
        class207.method1446(23955);
        class186.method1215((byte) 84);
        class214.method1483(-55);
        class231.method1569((byte) 119);
        class285.method1871(false);
        class245.method1631((byte) -115);
        class234.method1584((byte) -119);
        class69.method398(65280);
        class235.method1586(true);
        class75.method434(124);
        class111.method668(false);
        class76.method435(126);
        class261.method1739(20148);
        class17.method130((byte) 106);
        class243.method1616(92);
        class130.method785(4096);
        class90.method517(0);
        class226.method1547(32);
        class221.method1503(13626);
        class71.method412((byte) -82);
        class16.method123(-1);
        class39.method250(-117);
        class21.method147((byte) 91);
        class113.method679((byte) -95);
        class62.method351(123);
        class59.method341(4);
        class158.method1035(64);
        class123.method744(-19);
        class87.method503(16);
        class269.method1782(false);
        class42.method261((byte) -102);
        class203.method1386((byte) -107);
        class86.method499((byte) -1);
        class129.method783((byte) -116);
        class210.method1470(true);
        class281.method1847((byte) 108);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method1516(int arg0, int arg1) {
        class159.field2863 = new int[arg1];
        class13.field245 = new int[arg1];
        field4021++;
        if (arg0 != -17526) {
            field4022 = null;
        }
        class42.field707 = new int[arg1];
        class158.field2858 = new int[arg1];
        class63.field1196 = new int[arg1];
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4017++;
        if (!this.method708(84)) {
            return;
        }
        class231.field4231 = Integer.parseInt(this.getParameter("worldid"));
        class235.field4290 = Integer.parseInt(this.getParameter("modewhere"));
        if (class235.field4290 < 0 || class235.field4290 > 1) {
            class235.field4290 = 0;
        }
        class26.field444 = Integer.parseInt(this.getParameter("modewhat"));
        if (class26.field444 < 0 || class26.field444 > 2) {
            class26.field444 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class112.field1971 = true;
        } else {
            class112.field1971 = false;
        }
        try {
            class141.field2467 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class141.field2467 = 0;
        }
        class109.method656(class141.field2467, -121);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class182.field3260 = true;
        } else {
            class182.field3260 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class247.field4440 = true;
        } else {
            class247.field4440 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class153.field2764 = 1;
        } else {
            class153.field2764 = 0;
        }
        try {
            class188.field3414 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class188.field3414 = 0;
        }
        class173.field3104 = class117.field2090.method865(this, (byte) 77);
        if (class173.field3104 == null) {
            class173.field3104 = class21.field342;
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class267.field4792 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class267.field4792 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class254.field4561 = true;
        } else {
            class254.field4561 = false;
        }
        class63.field1201 = this;
        this.method715(765, class26.field444 + 32, (byte) -116, 503, 522);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lvh;IIIIIII)V")
    public static final void method1517(class43[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class43 var9 = arg0[var8];
            if (var9 != null && var9.field789 == arg1 && (!var9.field786 || var9.field769 == 0 || var9.field730 || method1514(var9) != 0 || class129.field2278 == var9 || var9.field862 == 1338) && (!var9.field786 || !method1505(var9))) {
                int var10 = var9.field873 + arg6;
                int var11 = var9.field748 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field769 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field735 + var10;
                    int var17 = var9.field831 + var11;
                    if (var9.field769 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class50.field996 == var9) {
                    class25.field427 = true;
                    class251.field4523 = var10;
                    class179.field3212 = var11;
                }
                if (!var9.field786 || var12 < var14 && var13 < var15) {
                    if (var9.field769 == 0) {
                        if (!var9.field786 && method1505(var9) && class126.field2230 != var9) {
                            continue;
                        }
                        if (var9.field726 && class235.field4292 >= var12 && class158.field2859 >= var13 && class235.field4292 < var14 && class158.field2859 < var15) {
                            for (class91 var18 = (class91) class230.field4203.method1294(false); var18 != null; var18 = (class91) class230.field4203.method1292((byte) 115)) {
                                if (var18.field1634) {
                                    var18.method349(0);
                                    var18.field1641.field728 = false;
                                }
                            }
                            if (class146.field2632 == 0) {
                                class50.field996 = null;
                                class129.field2278 = null;
                            }
                            class282.field4955 = false;
                        }
                    }
                    if (var9.field786) {
                        boolean var19;
                        if (class235.field4292 >= var12 && class158.field2859 >= var13 && class235.field4292 < var14 && class158.field2859 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class147.field2660 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class92.field1653 == 1 && class31.field499 >= var12 && class67.field1279 >= var13 && class31.field499 < var14 && class67.field1279 < var15) {
                            var21 = true;
                        }
                        if (class88.field1596 > 0 && var9.field846 != null) {
                            for (int var22 = 0; var22 < var9.field846.length; var22++) {
                                for (int var23 = 0; var23 < class88.field1596; var23++) {
                                    int var24 = var9.field846[var22] & 0xFF;
                                    if (class190.field3484[var23] == var24) {
                                        if (var9.field740 != null) {
                                            byte var25 = var9.field740[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class128.field2264[86] || (var25 & 0x1) != 0 && !class128.field2264[82] || (var25 & 0x4) != 0 && !class128.field2264[81])) {
                                                continue;
                                            }
                                        }
                                        class63.method359(class21.field342, (byte) 50, -1, var9.field722, var22 + 1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class164.method1085(class67.field1279 - var11, true, var9, class31.field499 - var10);
                        }
                        if (class50.field996 != null && class50.field996 != var9 && var19 && class56.method336(method1514(var9), -27838)) {
                            class117.field2087 = var9;
                        }
                        if (class129.field2278 == var9) {
                            class176.field3144 = true;
                            class79.field1432 = var10;
                            class140.field2440 = var11;
                        }
                        if (var9.field730 || var9.field862 != 0) {
                            if (var19 && class228.field4111 != 0 && var9.field720 != null) {
                                class91 var26 = new class91();
                                var26.field1634 = true;
                                var26.field1641 = var9;
                                var26.field1642 = class228.field4111;
                                var26.field1639 = var9.field720;
                                class230.field4203.method1290((byte) -44, var26);
                            }
                            if (class50.field996 != null || class165.field2966 != null || class139.field2415 || var9.field862 != 1400 && class282.field4955) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field862 != 0) {
                                if (var9.field862 == 1337) {
                                    class9.field185 = var9;
                                    class141.method844((byte) -124, var9);
                                    continue;
                                }
                                if (var9.field862 == 1338) {
                                    if (var21) {
                                        class194.field3600 = class31.field499 - var10;
                                        class234.field4246 = class67.field1279 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field862 == 1400) {
                                    class12.field236 = var9;
                                    if (var21) {
                                        if (class128.field2264[82] && class162.field2914 > 0) {
                                            int var27 = (int) ((double) (class31.field499 - var10 - var9.field735 / 2) * 2.0D / (double) class5.field80);
                                            int var28 = (int) ((double) (class67.field1279 - var11 - var9.field831 / 2) * 2.0D / (double) class5.field80);
                                            int var29 = class41.field691 + var27;
                                            int var30 = class203.field3691 + var28;
                                            int var31 = class245.field4412 + var29;
                                            int var32 = class25.field426 + class236.field4298 - var30 - 1;
                                            class146.method935(var31, 0, var32, false);
                                            class116.method704((byte) -63);
                                            continue;
                                        }
                                        class282.field4955 = true;
                                        class10.field212 = class235.field4292;
                                        class185.field3369 = class158.field2859;
                                        class8.field151 = class41.field691;
                                        class283.field4996 = class203.field3691;
                                        continue;
                                    }
                                    if (var20 && class282.field4955) {
                                        class76.method437(-13314, (int) ((double) (class10.field212 - class235.field4292) * 2.0D / (double) class143.field2564) + class8.field151);
                                        class34.method231((int) ((double) (class185.field3369 - class158.field2859) * 2.0D / (double) class143.field2564) + class283.field4996, -60);
                                        continue;
                                    }
                                    class282.field4955 = false;
                                    continue;
                                }
                                if (var9.field862 == 1401) {
                                    if (var20) {
                                        class63.method361(class158.field2859 - var11, -104, var9.field831, class235.field4292 - var10, var9.field735);
                                    }
                                    continue;
                                }
                                if (var9.field862 == 1402) {
                                    class141.method844((byte) -127, var9);
                                    continue;
                                }
                            }
                            if (!var9.field759 && var21) {
                                var9.field759 = true;
                                if (var9.field790 != null) {
                                    class91 var33 = new class91();
                                    var33.field1634 = true;
                                    var33.field1641 = var9;
                                    var33.field1643 = class31.field499 - var10;
                                    var33.field1642 = class67.field1279 - var11;
                                    var33.field1639 = var9.field790;
                                    class230.field4203.method1290((byte) -44, var33);
                                }
                            }
                            if (var9.field759 && var20 && var9.field792 != null) {
                                class91 var34 = new class91();
                                var34.field1634 = true;
                                var34.field1641 = var9;
                                var34.field1643 = class235.field4292 - var10;
                                var34.field1642 = class158.field2859 - var11;
                                var34.field1639 = var9.field792;
                                class230.field4203.method1290((byte) -44, var34);
                            }
                            if (var9.field759 && !var20) {
                                var9.field759 = false;
                                if (var9.field886 != null) {
                                    class91 var35 = new class91();
                                    var35.field1634 = true;
                                    var35.field1641 = var9;
                                    var35.field1643 = class235.field4292 - var10;
                                    var35.field1642 = class158.field2859 - var11;
                                    var35.field1639 = var9.field886;
                                    class231.field4221.method1290((byte) -44, var35);
                                }
                            }
                            if (var20 && var9.field825 != null) {
                                class91 var36 = new class91();
                                var36.field1634 = true;
                                var36.field1641 = var9;
                                var36.field1643 = class235.field4292 - var10;
                                var36.field1642 = class158.field2859 - var11;
                                var36.field1639 = var9.field825;
                                class230.field4203.method1290((byte) -44, var36);
                            }
                            if (!var9.field728 && var19) {
                                var9.field728 = true;
                                if (var9.field856 != null) {
                                    class91 var37 = new class91();
                                    var37.field1634 = true;
                                    var37.field1641 = var9;
                                    var37.field1643 = class235.field4292 - var10;
                                    var37.field1642 = class158.field2859 - var11;
                                    var37.field1639 = var9.field856;
                                    class230.field4203.method1290((byte) -44, var37);
                                }
                            }
                            if (var9.field728 && var19 && var9.field713 != null) {
                                class91 var38 = new class91();
                                var38.field1634 = true;
                                var38.field1641 = var9;
                                var38.field1643 = class235.field4292 - var10;
                                var38.field1642 = class158.field2859 - var11;
                                var38.field1639 = var9.field713;
                                class230.field4203.method1290((byte) -44, var38);
                            }
                            if (var9.field728 && !var19) {
                                var9.field728 = false;
                                if (var9.field795 != null) {
                                    class91 var39 = new class91();
                                    var39.field1634 = true;
                                    var39.field1641 = var9;
                                    var39.field1643 = class235.field4292 - var10;
                                    var39.field1642 = class158.field2859 - var11;
                                    var39.field1639 = var9.field795;
                                    class231.field4221.method1290((byte) -44, var39);
                                }
                            }
                            if (var9.field836 != null) {
                                class91 var40 = new class91();
                                var40.field1641 = var9;
                                var40.field1639 = var9.field836;
                                field4020.method1290((byte) -44, var40);
                            }
                            if (var9.field864 != null && class144.field2568 > var9.field852) {
                                if (var9.field798 == null || class144.field2568 - var9.field852 > 32) {
                                    class91 var45 = new class91();
                                    var45.field1641 = var9;
                                    var45.field1639 = var9.field864;
                                    class230.field4203.method1290((byte) -44, var45);
                                } else {
                                    label546: for (int var41 = var9.field852; var41 < class144.field2568; var41++) {
                                        int var42 = class182.field3259[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field798.length; var43++) {
                                            if (var9.field798[var43] == var42) {
                                                class91 var44 = new class91();
                                                var44.field1641 = var9;
                                                var44.field1639 = var9.field864;
                                                class230.field4203.method1290((byte) -44, var44);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field852 = class144.field2568;
                            }
                            if (var9.field817 != null && class144.field2594 > var9.field751) {
                                if (var9.field892 == null || class144.field2594 - var9.field751 > 32) {
                                    class91 var50 = new class91();
                                    var50.field1641 = var9;
                                    var50.field1639 = var9.field817;
                                    class230.field4203.method1290((byte) -44, var50);
                                } else {
                                    label522: for (int var46 = var9.field751; var46 < class144.field2594; var46++) {
                                        int var47 = class203.field3690[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field892.length; var48++) {
                                            if (var9.field892[var48] == var47) {
                                                class91 var49 = new class91();
                                                var49.field1641 = var9;
                                                var49.field1639 = var9.field817;
                                                class230.field4203.method1290((byte) -44, var49);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field751 = class144.field2594;
                            }
                            if (var9.field867 != null && class33.field560 > var9.field763) {
                                if (var9.field770 == null || class33.field560 - var9.field763 > 32) {
                                    class91 var55 = new class91();
                                    var55.field1641 = var9;
                                    var55.field1639 = var9.field867;
                                    class230.field4203.method1290((byte) -44, var55);
                                } else {
                                    label498: for (int var51 = var9.field763; var51 < class33.field560; var51++) {
                                        int var52 = class132.field2317[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field770.length; var53++) {
                                            if (var9.field770[var53] == var52) {
                                                class91 var54 = new class91();
                                                var54.field1641 = var9;
                                                var54.field1639 = var9.field867;
                                                class230.field4203.method1290((byte) -44, var54);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field763 = class33.field560;
                            }
                            if (var9.field883 != null && class192.field3525 > var9.field747) {
                                if (var9.field805 == null || class192.field3525 - var9.field747 > 32) {
                                    class91 var60 = new class91();
                                    var60.field1641 = var9;
                                    var60.field1639 = var9.field883;
                                    class230.field4203.method1290((byte) -44, var60);
                                } else {
                                    label474: for (int var56 = var9.field747; var56 < class192.field3525; var56++) {
                                        int var57 = class74.field1381[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field805.length; var58++) {
                                            if (var9.field805[var58] == var57) {
                                                class91 var59 = new class91();
                                                var59.field1641 = var9;
                                                var59.field1639 = var9.field883;
                                                class230.field4203.method1290((byte) -44, var59);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field747 = class192.field3525;
                            }
                            if (var9.field716 != null && class35.field609 > var9.field822) {
                                if (var9.field877 == null || class35.field609 - var9.field822 > 32) {
                                    class91 var65 = new class91();
                                    var65.field1641 = var9;
                                    var65.field1639 = var9.field716;
                                    class230.field4203.method1290((byte) -44, var65);
                                } else {
                                    label450: for (int var61 = var9.field822; var61 < class35.field609; var61++) {
                                        int var62 = class21.field339[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field877.length; var63++) {
                                            if (var9.field877[var63] == var62) {
                                                class91 var64 = new class91();
                                                var64.field1641 = var9;
                                                var64.field1639 = var9.field716;
                                                class230.field4203.method1290((byte) -44, var64);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field822 = class35.field609;
                            }
                            if (class92.field1652 > var9.field844 && var9.field750 != null) {
                                class91 var66 = new class91();
                                var66.field1641 = var9;
                                var66.field1639 = var9.field750;
                                class230.field4203.method1290((byte) -44, var66);
                            }
                            if (class129.field2294 > var9.field844 && var9.field783 != null) {
                                class91 var67 = new class91();
                                var67.field1641 = var9;
                                var67.field1639 = var9.field783;
                                class230.field4203.method1290((byte) -44, var67);
                            }
                            if (class57.field1098 > var9.field844 && var9.field714 != null) {
                                class91 var68 = new class91();
                                var68.field1641 = var9;
                                var68.field1639 = var9.field714;
                                class230.field4203.method1290((byte) -44, var68);
                            }
                            if (class70.field1338 > var9.field844 && var9.field870 != null) {
                                class91 var69 = new class91();
                                var69.field1641 = var9;
                                var69.field1639 = var9.field870;
                                class230.field4203.method1290((byte) -44, var69);
                            }
                            if (class26.field435 > var9.field844 && var9.field849 != null) {
                                class91 var70 = new class91();
                                var70.field1641 = var9;
                                var70.field1639 = var9.field849;
                                class230.field4203.method1290((byte) -44, var70);
                            }
                            var9.field844 = class13.field249;
                            if (var9.field890 != null) {
                                for (int var71 = 0; var71 < class88.field1596; var71++) {
                                    class91 var72 = new class91();
                                    var72.field1641 = var9;
                                    var72.field1633 = class190.field3484[var71];
                                    var72.field1645 = class134.field2355[var71];
                                    var72.field1639 = var9.field890;
                                    class230.field4203.method1290((byte) -44, var72);
                                }
                            }
                            if (class70.field1340 && var9.field772 != null) {
                                class91 var73 = new class91();
                                var73.field1641 = var9;
                                var73.field1639 = var9.field772;
                                class230.field4203.method1290((byte) -44, var73);
                            }
                        }
                    }
                    if (!var9.field786 && class50.field996 == null && class165.field2966 == null && !class139.field2415) {
                        if ((var9.field866 >= 0 || var9.field837 != 0) && class235.field4292 >= var12 && class158.field2859 >= var13 && class235.field4292 < var14 && class158.field2859 < var15) {
                            if (var9.field866 >= 0) {
                                class126.field2230 = arg0[var9.field866];
                            } else {
                                class126.field2230 = var9;
                            }
                        }
                        if (var9.field769 == 8 && class235.field4292 >= var12 && class158.field2859 >= var13 && class235.field4292 < var14 && class158.field2859 < var15) {
                            class169.field3017 = var9;
                        }
                        if (var9.field732 > var9.field831) {
                            class179.method1177(var9, var11, class158.field2859, var9.field831, var9.field735 + var10, class235.field4292, 45, var9.field732);
                        }
                    }
                    if (var9.field769 == 0) {
                        method1517(arg0, var9.field722, var12, var13, var14, var15, var10 - var9.field879, var11 - var9.field882);
                        if (var9.field885 != null) {
                            method1517(var9.field885, var9.field722, var12, var13, var14, var15, var10 - var9.field879, var11 - var9.field882);
                        }
                        class163 var74 = (class163) class212.field3942.method1824((long) var9.field722, 0);
                        if (var74 != null) {
                            class82.method468(var15, var74.field2929, (byte) -113, var13, var10, var14, var12, var11);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method716(byte arg0) {
        class127.method769(2);
        field4025++;
        class243.field4367 = new class172();
        class79.field1430 = new class282();
        class176.method1157(class4.field62, (byte) -97);
        if (class235.field4290 == 0) {
            class164.field2940 = this.getCodeBase().getHost();
            class80.field1455 = 43594;
            class57.field1108 = 443;
        } else if (class235.field4290 == 1) {
            class164.field2940 = this.getCodeBase().getHost();
            class57.field1108 = class231.field4231 + 50000;
            class80.field1455 = class231.field4231 + 40000;
        } else if (class235.field4290 == 2) {
            class57.field1108 = class231.field4231 + 50000;
            class80.field1455 = class231.field4231 + 40000;
            class164.field2940 = "127.0.0.1";
        }
        if (class81.field1473 == 3 && class235.field4290 != 2) {
            class23.field380 = class231.field4231;
        }
        if (arg0 >= -31) {
            method1517((class43[]) null, -62, -58, 127, -121, -70, -48, -117);
        }
        class229.field4194 = class164.field2940;
        class130.field2311 = class153.field2773 = class168.field3001 = class22.field351 = new short[256];
        if (class153.field2764 == 1) {
            class107.field1888 = class289.field5084;
            class41.field699 = true;
            class192.field3534 = class7.field125;
            class173.field3103 = class134.field2346;
            class256.field4601 = class240.field4340;
        } else {
            class192.field3534 = class256.field4603;
            class107.field1888 = class208.field3815;
            class173.field3103 = class43.field742;
            class256.field4601 = class27.field453;
        }
        class92.field1656 = class80.field1455;
        class209.field3843 = class57.field1108;
        class49.field945 = class80.field1455;
        class266.field4778 = class49.field945;
        class3.method8(true);
        class20.method141(class155.field2792, -120);
        class140.method838((byte) 104, class155.field2792);
        class191.field3508 = class141.method848((byte) 113);
        if (class191.field3508 != null) {
            class191.field3508.method139((byte) 81, class155.field2792);
        }
        class59.field1135 = class81.field1473;
        try {
            if (class4.field62.field1467 != null) {
                class257.field4619 = new class289(class4.field62.field1467, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class254.field4558[var2] = new class289(class4.field62.field1480[var2], 6000, 0);
                }
                class247.field4427 = new class289(class4.field62.field1471, 6000, 0);
                class71.field1347 = new class164(255, class257.field4619, class247.field4427, 500000);
                class29.field460 = new class289(class4.field62.field1466, 24, 0);
                class4.field62.field1471 = null;
                class4.field62.field1466 = null;
                class4.field62.field1480 = null;
                class4.field62.field1467 = null;
            }
        } catch (IOException var3) {
            class257.field4619 = null;
            class247.field4427 = null;
            class71.field1347 = null;
            class29.field460 = null;
        }
        if (class235.field4290 != 0) {
            class194.field3593 = true;
        }
        class158.field2853 = class191.field3511;
    }
}
