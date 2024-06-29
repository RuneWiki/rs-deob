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
public class client extends class73 {

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lcf;")
    public static class93 field2722 = class147.method1066("floorshadows", -48);

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lcf;")
    public static class93 field2726 = class147.method1066(" s(West d-Bconnect-B)3", -48);

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    private static int field2725 = 0;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lcf;")
    public static class93 field2732 = class147.method1066("blanc:", -48);

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static volatile int field2739 = 0;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field2736 = 0;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
    public static int[] field2738;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[Lcf;")
    public static class93[] field2716;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[[S")
    public static short[][] field2730;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method484(byte arg0) {
        field2718++;
        if (class199.field3609 == 1000) {
            return;
        }
        if (arg0 != -120) {
            field2738 = null;
        }
        class275.field4921++;
        if (class275.field4921 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class47.field768 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class108.field1849.setSeed((long) class47.field768);
        }
        this.method1107(-125);
        if (class190.field3480 != null) {
            class190.field3480.method548((byte) 127);
        }
        class272.method1803(111);
        class226.method1559(false);
        class135.method988((byte) -56);
        class224.method1552(0);
        if (class260.field4670 != null) {
            int var3 = class260.field4670.method483(-1749410640);
            class78.field1462 = var3;
        }
        if (class199.field3609 == 0) {
            this.method1106(false);
            class110.method788((byte) -115);
        } else if (class199.field3609 == 5) {
            this.method1106(false);
            class110.method788((byte) -114);
        } else if (class199.field3609 == 25 || class199.field3609 == 28) {
            class288.method1971(arg0 ^ 0xFFFFFFA8);
        }
        if (class199.field3609 == 10) {
            this.method1111((byte) 78);
            class47.method264(103);
            method1113(-1);
            class211.method1490(16984);
        } else if (class199.field3609 == 30) {
            class226.method1556(0);
        } else if (class199.field3609 == 40) {
            class211.method1490(16984);
            if (class242.field4371 != -3) {
                if (class242.field4371 == 15) {
                    class49.method270(true);
                    return;
                }
                if (class242.field4371 != 2) {
                    class121.method895(arg0 + 211);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1106(boolean arg0) {
        if (arg0) {
            this.method484((byte) -90);
        }
        field2731++;
        if (!class193.field3539) {
            label237: while (true) {
                do {
                    if (!class61.method387(10)) {
                        break label237;
                    }
                } while (class217.field3945 != 115 && class217.field3945 != 83);
                class193.field3539 = true;
            }
        }
        if (class57.field949 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class28.method155((byte) -21);
            if (class279.field4982 == 0L) {
                class279.field4982 = var4;
            }
            if (var3 > 16384 && var4 - class279.field4982 < 5000L) {
                if ((var4 - class213.field3900) > 1000L) {
                    System.gc();
                    class213.field3900 = var4;
                }
                class4.field54 = 5;
                class276.field4934 = class152.field2671;
            } else {
                class57.field949 = 10;
                class276.field4934 = class277.field4969;
                class4.field54 = 5;
            }
        } else if (class57.field949 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class148.field2605[var6] = new class102(104, 104);
            }
            class4.field54 = 10;
            class276.field4934 = class205.field3697;
            class57.field949 = 30;
        } else if (class57.field949 == 30) {
            if (class190.field3480 == null) {
                class190.field3480 = new class79(class26.field345, class51.field840);
            }
            if (class190.field3480.method547((byte) 97)) {
                class246.field4438 = class70.method474(0, true, false, true, (byte) 95);
                class131.field2321 = class70.method474(1, true, false, true, (byte) 85);
                class226.field4049 = class70.method474(2, false, true, true, (byte) 112);
                class229.field4097 = class70.method474(3, true, false, true, (byte) 127);
                class144.field2487 = class70.method474(4, true, false, true, (byte) 123);
                class1.field11 = class70.method474(5, true, true, true, (byte) 56);
                class189.field3468 = class70.method474(6, true, true, false, (byte) 60);
                class185.field3399 = class70.method474(7, true, false, true, (byte) 117);
                class246.field4436 = class70.method474(8, true, false, true, (byte) 91);
                class105.field1817 = class70.method474(9, true, false, true, (byte) 99);
                class162.field2870 = class70.method474(10, true, false, true, (byte) 100);
                class232.field4144 = class70.method474(11, true, false, true, (byte) 119);
                class48.field773 = class70.method474(12, true, false, true, (byte) 95);
                class136.field2378 = class70.method474(13, true, false, true, (byte) 69);
                class284.field5089 = class70.method474(14, true, false, false, (byte) 49);
                class73.field1312 = class70.method474(15, true, false, true, (byte) 121);
                class199.field3616 = class70.method474(16, true, false, true, (byte) 74);
                class18.field236 = class70.method474(17, true, false, true, (byte) 99);
                class169.field2969 = class70.method474(18, true, false, true, (byte) 100);
                class58.field989 = class70.method474(19, true, false, true, (byte) 66);
                class269.field4810 = class70.method474(20, true, false, true, (byte) 108);
                class58.field982 = class70.method474(21, true, false, true, (byte) 99);
                class229.field4105 = class70.method474(22, true, false, true, (byte) 106);
                class148.field2609 = class70.method474(23, true, true, true, (byte) 127);
                class102.field1771 = class70.method474(24, true, false, true, (byte) 64);
                class214.field3915 = class70.method474(25, true, false, true, (byte) 56);
                class218.field3977 = class70.method474(26, true, true, true, (byte) 80);
                class272.field4830 = class70.method474(27, true, false, true, (byte) 107);
                class57.field949 = 40;
                class4.field54 = 15;
                class276.field4934 = class141.field2444;
            } else {
                class4.field54 = 12;
                class276.field4934 = class276.field4942;
            }
        } else if (class57.field949 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class266.field4741[var8].method318((byte) -24) * class137.field2397[var8] / 100;
            }
            if (var7 == 100) {
                class4.field54 = 20;
                class276.field4934 = class45.field735;
                class270.method1798(100, class246.field4436);
                class224.method1551(-120, class246.field4436);
                class139.method1015(-1, class246.field4436);
                class57.field949 = 45;
            } else {
                if (var7 != 0) {
                    class276.field4934 = class130.method949((byte) -77, new class93[] { class276.field4956, class148.method1067(-7015, var7), class232.field4145 });
                }
                class4.field54 = 20;
            }
        } else if (class57.field949 == 45) {
            class283.method1940(2, class161.field2832, true, 22050);
            class243.field4389 = new class115();
            class243.field4389.method841(128, 9, (byte) -126);
            class237.field4235 = class133.method970(0, 22050, class169.field2967, arg0, class190.field3481);
            class237.field4235.method1721((byte) 77, class243.field4389);
            class159.method1147(class73.field1312, class144.field2487, class243.field4389, arg0, class284.field5089);
            class11.field155 = class133.method970(1, 2048, class169.field2967, false, class190.field3481);
            class35.field543 = new class244();
            class11.field155.method1721((byte) 79, class35.field543);
            class209.field3766 = new class198(22050, class140.field2443);
            class255.field4617 = class189.field3468.method1277(class150.field2628, (byte) 74);
            class276.field4934 = class126.field2235;
            class57.field949 = 50;
            class4.field54 = 30;
        } else if (class57.field949 == 50) {
            int var9 = class246.method1674(19, class136.field2378, class246.field4436);
            int var10 = class250.method1699(-96);
            if (var9 < var10) {
                class276.field4934 = class130.method949((byte) -77, new class93[] { class124.field2210, class148.method1067(-7015, var9 * 100 / var10), class232.field4145 });
                class4.field54 = 35;
            } else {
                class4.field54 = 35;
                class57.field949 = 60;
                class276.field4934 = class73.field1337;
            }
        } else if (class57.field949 == 60) {
            int var11 = class106.method766((byte) 102, class246.field4436);
            int var12 = class101.method728((byte) -118);
            if (var11 < var12) {
                class276.field4934 = class130.method949((byte) -77, new class93[] { class140.field2430, class148.method1067(-7015, var11 * 100 / var12), class232.field4145 });
                class4.field54 = 40;
            } else {
                class276.field4934 = class85.field1548;
                class57.field949 = 65;
                class4.field54 = 40;
            }
        } else if (class57.field949 == 65) {
            class133.method976(13572, class246.field4436, class136.field2378);
            class276.field4934 = class43.field696;
            class4.field54 = 45;
            class19.method88(5, false);
            class57.field949 = 70;
        } else if (class57.field949 == 70) {
            class226.field4049.method1266(-14358);
            byte var13 = 0;
            int var14 = var13 + class226.field4049.method1289((byte) 119);
            class199.field3616.method1266(-14358);
            int var15 = var14 + class199.field3616.method1289((byte) 114);
            class18.field236.method1266(-14358);
            int var16 = var15 + class18.field236.method1289((byte) 54);
            class169.field2969.method1266(-14358);
            int var17 = var16 + class169.field2969.method1289((byte) 48);
            class58.field989.method1266(-14358);
            int var18 = var17 + class58.field989.method1289((byte) 37);
            class269.field4810.method1266(-14358);
            int var19 = var18 + class269.field4810.method1289((byte) 93);
            class58.field982.method1266(-14358);
            int var20 = var19 + class58.field982.method1289((byte) 113);
            class229.field4105.method1266(-14358);
            int var21 = var20 + class229.field4105.method1289((byte) 105);
            class102.field1771.method1266(-14358);
            int var22 = var21 + class102.field1771.method1289((byte) 81);
            class214.field3915.method1266(-14358);
            int var23 = var22 + class214.field3915.method1289((byte) 122);
            class272.field4830.method1266(-14358);
            int var24 = var23 + class272.field4830.method1289((byte) 34);
            if (var24 < 1100) {
                class276.field4934 = class130.method949((byte) -77, new class93[] { class131.field2322, class148.method1067(-7015, var24 / 11), class232.field4145 });
                class4.field54 = 50;
            } else {
                class208.method1466((byte) 110, class226.field4049);
                class190.method1370(class226.field4049, -1);
                class66.method453(class226.field4049, (byte) 117);
                class276.method1849(class226.field4049, false, class185.field3399);
                class138.method1009(!arg0, class185.field3399, true, class199.field3616);
                class14.method61(class185.field3399, 26061, class169.field2969);
                class180.method1321(true, class58.field989, class185.field3399, (byte) 86, class266.field4736);
                class103.method755(25361, class226.field4049);
                class58.method334(class131.field2321, class246.field4438, 0, class269.field4810);
                class145.method1052(class226.field4049, 64);
                class61.method388(73, class185.field3399, class58.field982);
                class154.method1101(class229.field4105, 0);
                class214.method1513(16, class226.field4049);
                class87.method596(0, class136.field2378, class185.field3399, class246.field4436, class229.field4097);
                class232.method1585(64, class226.field4049);
                class9.method41(class18.field236, 1516874416);
                class191.method1373(class214.field3915, -1, class102.field1771, new class278());
                class80.method551(class214.field3915, class102.field1771, 8326);
                class113.method807(class226.field4049, (byte) 118);
                class284.method1947(class226.field4049, class246.field4436, false);
                class195.method1403(class226.field4049, 4, class246.field4436);
                class4.field54 = 50;
                class276.field4934 = class275.field4927;
                class266.method1778(-26817);
                class57.field949 = 80;
            }
        } else if (class57.field949 == 80) {
            int var25 = class140.method1019(class246.field4436, 0);
            int var26 = class6.method23(false);
            if (var26 > var25) {
                class276.field4934 = class130.method949((byte) -77, new class93[] { class32.field502, class148.method1067(-7015, var25 * 100 / var26), class232.field4145 });
                class4.field54 = 60;
            } else {
                class187.method1357(class246.field4436, (byte) 66);
                class57.field949 = 90;
                class276.field4934 = class253.field4566;
                class4.field54 = 60;
            }
        } else if (class57.field949 == 90) {
            if (class218.field3977.method1266(-14358)) {
                class209 var27 = new class209(class105.field1817, class218.field3977, class246.field4436, 20, !class46.field739);
                class179.method1306(var27);
                if (class66.field1216 == 1) {
                    class179.method1305(0.9F);
                }
                if (class66.field1216 == 2) {
                    class179.method1305(0.8F);
                }
                if (class66.field1216 == 3) {
                    class179.method1305(0.7F);
                }
                if (class66.field1216 == 4) {
                    class179.method1305(0.6F);
                }
                class276.field4934 = class126.field2239;
                class57.field949 = 100;
                class4.field54 = 70;
            } else {
                class276.field4934 = class130.method949((byte) -77, new class93[] { class147.field2591, class148.method1067(-7015, class218.field3977.method1289((byte) 100)), class232.field4145 });
                class4.field54 = 70;
            }
        } else if (class57.field949 == 100) {
            if (class152.method1091(119, class246.field4436)) {
                class57.field949 = 110;
            }
        } else if (class57.field949 == 110) {
            class160.field2817 = new class183();
            class169.field2967.method1960(10, class160.field2817, (byte) -40);
            class4.field54 = 75;
            class276.field4934 = class200.field3621;
            class57.field949 = 120;
        } else if (class57.field949 == 120) {
            if (class162.field2870.method1288(class178.field3144, -21595, class217.field3960)) {
                class94 var28 = new class94(class162.field2870.method1278(class178.field3144, arg0, class217.field3960));
                class137.method1004(true, var28);
                class57.field949 = 130;
                class276.field4934 = class53.field884;
                class4.field54 = 80;
            } else {
                class276.field4934 = class130.method949((byte) -77, new class93[] { class285.field5108, class130.field2296 });
                class4.field54 = 80;
            }
        } else if (class57.field949 == 130) {
            if (!class229.field4097.method1266(-14358)) {
                class276.field4934 = class130.method949((byte) -77, new class93[] { class19.field245, class148.method1067(-7015, class229.field4097.method1289((byte) 81) * 3 / 4), class232.field4145 });
                class4.field54 = 85;
            } else if (!class48.field773.method1266(-14358)) {
                class276.field4934 = class130.method949((byte) -77, new class93[] { class19.field245, class148.method1067(-7015, class48.field773.method1289((byte) 68) / 10 + 75), class232.field4145 });
                class4.field54 = 85;
            } else if (!class136.field2378.method1266(-14358)) {
                class276.field4934 = class130.method949((byte) -77, new class93[] { class19.field245, class148.method1067(-7015, class136.field2378.method1289((byte) 16) / 20 + 85), class232.field4145 });
                class4.field54 = 85;
            } else if (class148.field2609.method1286((byte) 56, class78.field1466)) {
                class169.method1220(class73.field1324, class148.field2609, (byte) -82);
                class4.field54 = 95;
                class57.field949 = 135;
                class276.field4934 = class256.field4618;
            } else {
                class276.field4934 = class130.method949((byte) -77, new class93[] { class19.field245, class148.method1067(-7015, class148.field2609.method1276(class78.field1466, 117) / 10 + 90), class232.field4145 });
                class4.field54 = 85;
            }
        } else if (class57.field949 == 135) {
            int var29 = class58.method338((byte) -44);
            if (var29 == -1) {
                class276.field4934 = class5.field72;
                class4.field54 = 95;
            } else if (var29 == 7 || var29 == 9) {
                this.method498("worldlistfull", -99);
                class19.method88(1000, false);
            } else if (class48.field775) {
                class57.field949 = 140;
                class4.field54 = 96;
                class276.field4934 = class264.field4704;
            } else {
                this.method498("worldlistio_" + var29, 16);
                class19.method88(1000, arg0);
            }
        } else if (class57.field949 == 140) {
            class16.field226 = class229.field4097.method1277(class32.field504, (byte) 74);
            class1.field11.method1267(-1, true, false);
            class189.field3468.method1267(-1, true, true);
            class246.field4436.method1267(-1, true, true);
            class136.field2378.method1267(-1, true, true);
            class162.field2870.method1267(-1, true, true);
            class229.field4097.method1267(-1, true, true);
            class154.field2701 = true;
            class4.field54 = 97;
            class57.field949 = 150;
            class276.field4934 = class134.field2349;
        } else if (class57.field949 == 150) {
            if (class193.field3539) {
                class180.field3168 = 0;
                class66.field1219 = 0;
                class154.field2699 = 0;
                class119.field2121 = 0;
            }
            class193.field3539 = true;
            class271.method1800(class169.field2967, -2);
            class112.method804(false, -1, -1, -1, class180.field3168);
            class276.field4934 = class205.field3698;
            class4.field54 = 100;
            class57.field949 = 160;
        } else if (class57.field949 == 160) {
            class222.method1542((byte) -60, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method499(int arg0) {
        if (arg0 != 5) {
            return;
        }
        field2723++;
        if (class160.field2817 != null) {
            class160.field2817.field3375 = false;
        }
        class160.field2817 = null;
        if (class92.field1625 != null) {
            class92.field1625.method947((byte) 28);
            class92.field1625 = null;
        }
        class252.method1712(class190.field3481, (byte) -52);
        class155.method1103((byte) 85, class190.field3481);
        if (class260.field4670 != null) {
            class260.field4670.method480(false, class190.field3481);
        }
        class31.method182(arg0 - 7);
        class18.method84(arg0 ^ 0x63);
        class260.field4670 = null;
        if (class237.field4235 != null) {
            class237.field4235.method1715(-3139);
        }
        if (class11.field155 != null) {
            class11.field155.method1715(-3139);
        }
        class26.field345.method1401(11427);
        class51.field840.method1603((byte) 85);
        try {
            if (class68.field1243 != null) {
                class68.field1243.method1662(false);
            }
            if (class278.field4980 != null) {
                for (int var2 = 0; var2 < class278.field4980.length; var2++) {
                    if (class278.field4980[var2] != null) {
                        class278.field4980[var2].method1662(false);
                    }
                }
            }
            if (class134.field2346 != null) {
                class134.field2346.method1662(false);
            }
            if (class30.field444 != null) {
                class30.field444.method1662(false);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2721++;
        if (!this.method492(true)) {
            return;
        }
        class180.field3173 = Integer.parseInt(this.getParameter("worldid"));
        class106.field1843 = Integer.parseInt(this.getParameter("modewhere"));
        if (class106.field1843 < 0 || class106.field1843 > 1) {
            class106.field1843 = 0;
        }
        class163.field2873 = Integer.parseInt(this.getParameter("modewhat"));
        if (class163.field2873 < 0 || class163.field2873 > 2) {
            class163.field2873 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class128.field2255 = true;
        } else {
            class128.field2255 = false;
        }
        try {
            class104.field1802 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class104.field1802 = 0;
        }
        class245.method1661(true, class104.field1802);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class104.field1805 = true;
        } else {
            class104.field1805 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class234.field4186 = true;
        } else {
            class234.field4186 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class78.field1460 = 1;
        } else {
            class78.field1460 = 0;
        }
        try {
            class276.field4943 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class276.field4943 = 0;
        }
        class123.field2197 = class121.field2140.method656(this, 0);
        if (class123.field2197 == null) {
            class123.field2197 = class178.field3144;
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class160.field2815 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class160.field2815 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class73.field1314 = true;
        } else {
            class73.field1314 = false;
        }
        class11.field157 = this;
        this.method493(503, class163.field2873 + 32, 57, 765, 531);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1107(int arg0) {
        field2735++;
        boolean var2 = class26.field345.method1395(88);
        int var3 = -50 % ((arg0 + 75) / 35);
        if (!var2) {
            this.method1112(7099);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method490(byte arg0) {
        class101.method731(-1206350292);
        field2715++;
        class51.field840 = new class235();
        class26.field345 = new class195();
        if (class163.field2873 != 0) {
            class234.field4183 = new byte[50][];
        }
        class196.method1410(class169.field2967, -12060);
        if (class106.field1843 == 0) {
            class174.field3024 = this.getCodeBase().getHost();
            class105.field1820 = 43594;
            class268.field4792 = 443;
        } else if (class106.field1843 == 1) {
            class174.field3024 = this.getCodeBase().getHost();
            class105.field1820 = class180.field3173 + 40000;
            class268.field4792 = class180.field3173 + 50000;
        } else if (class106.field1843 == 2) {
            class174.field3024 = "127.0.0.1";
            class268.field4792 = class180.field3173 + 50000;
            class105.field1820 = class180.field3173 + 40000;
        }
        class157.field2787 = class174.field3024;
        class148.field2608 = class268.field4792;
        class177.field3097 = class214.field3910 = class210.field3778 = class220.field3996 = new short[256];
        int var2 = 8 % ((arg0 + 72) / 47);
        if (class78.field1460 == 1) {
            class258.field4645 = class87.field1564;
            field2730 = class263.field4690;
            class108.field1851 = true;
            class83.field1519 = class214.field3919;
            class208.field3734 = class92.field1619;
        } else {
            field2730 = class247.field4454;
            class83.field1519 = class5.field71;
            class208.field3734 = class216.field3943;
            class258.field4645 = class143.field2486;
        }
        if (class286.field5122 == 3 && class106.field1843 != 2) {
            class74.field1352 = class180.field3173;
        }
        class283.field5082 = class105.field1820;
        class275.field4930 = class105.field1820;
        class137.field2390 = class275.field4930;
        class140.method1021(true);
        class1.method2(class190.field3481, false);
        class235.method1608(class190.field3481, (byte) -15);
        class260.field4670 = class252.method1711(50);
        if (class260.field4670 != null) {
            class260.field4670.method481((byte) 120, class190.field3481);
        }
        class285.field5103 = class286.field5122;
        try {
            if (class169.field2967.field5123 != null) {
                class68.field1243 = new class245(class169.field2967.field5123, 5200, 0);
                for (int var3 = 0; var3 < 28; var3++) {
                    class278.field4980[var3] = new class245(class169.field2967.field5110[var3], 6000, 0);
                }
                class134.field2346 = new class245(class169.field2967.field5120, 6000, 0);
                class162.field2860 = new class277(255, class68.field1243, class134.field2346, 500000);
                class30.field444 = new class245(class169.field2967.field5117, 24, 0);
                class169.field2967.field5120 = null;
                class169.field2967.field5117 = null;
                class169.field2967.field5123 = null;
                class169.field2967.field5110 = null;
            }
        } catch (IOException var4) {
            class30.field444 = null;
            class68.field1243 = null;
            class134.field2346 = null;
            class162.field2860 = null;
        }
        if (class106.field1843 != 0) {
            class43.field673 = true;
        }
        class245.field4414 = class18.field233;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method1108(int arg0, int arg1) {
        field2725 = 0;
        if (arg1 != 13436) {
            return;
        }
        class146.field2576 = null;
        class26.field345.field3579++;
        field2728++;
        class26.field345.field3581 = arg0;
        class235.field4192 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method489(int arg0) {
        field2719++;
        if (class199.field3609 == 1000) {
            return;
        }
        boolean var2 = class113.method808(0);
        if (var2 && class254.field4599 && class237.field4235 != null) {
            class237.field4235.method1722(arg0 - 52);
        }
        if ((class199.field3609 == 30 || class199.field3609 == 10) && (class157.field2791 || class57.field942 != 0L && class57.field942 < class28.method155((byte) -31))) {
            class112.method804(class157.field2791, class48.field772, class46.field748, arg0 ^ 0xFFFFFFFE, class55.method311(false));
        }
        if (class126.field2236 == null) {
            Container var3;
            if (class126.field2236 != null) {
                var3 = class126.field2236;
            } else if (class246.field4432 == null) {
                var3 = class169.field2967.field5113;
            } else {
                var3 = class246.field4432;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class246.field4432 == var3) {
                Insets var6 = class246.field4432.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class189.field3465 != var4 || class47.field756 != var5) {
                if (class286.field5121.startsWith("mac")) {
                    class189.field3465 = var4;
                    class47.field756 = var5;
                } else {
                    class101.method731(-1206350292);
                }
                class57.field942 = class28.method155((byte) 115) + 500L;
            }
        }
        boolean var7 = false;
        if (class282.field5062) {
            var7 = true;
            class282.field5062 = false;
        }
        if (var7) {
            class24.method126((byte) -70);
        }
        if (class199.field3609 == 0) {
            class287.method1968(class276.field4934, 3, class4.field54, (Color) null, var7);
        } else if (class199.field3609 == 5) {
            class76.method529((byte) -111, false, class183.field3383);
        } else if (class199.field3609 == 10) {
            class146.method1060(-37);
        } else if (class199.field3609 == 25 || class199.field3609 == 28) {
            if (class8.field111 == 1) {
                if (class181.field3359 > class32.field505) {
                    class32.field505 = class181.field3359;
                }
                int var8 = (class32.field505 - class181.field3359) * 50 / class32.field505;
                class30.method175((byte) 1, false, class130.method949((byte) -77, new class93[] { class200.field3635, class94.field1707, class148.method1067(-7015, var8), class172.field3012 }));
            } else if (class8.field111 == 2) {
                if (class148.field2610 < class72.field1302) {
                    class148.field2610 = class72.field1302;
                }
                int var9 = (class148.field2610 - class72.field1302) * 50 / class148.field2610 + 50;
                class30.method175((byte) 1, false, class130.method949((byte) -77, new class93[] { class200.field3635, class94.field1707, class148.method1067(-7015, var9), class172.field3012 }));
            } else {
                class30.method175((byte) 1, false, class200.field3635);
            }
        } else if (class199.field3609 == 30) {
            class203.method1444((byte) -94);
        } else if (class199.field3609 == 40) {
            class30.method175((byte) 1, false, class130.method949((byte) -77, new class93[] { class232.field4137, class101.field1754, class104.field1800 }));
        }
        if (arg0 != 1) {
            return;
        }
        if ((class199.field3609 == 30 || class199.field3609 == 10) && class26.field348 == 0 && !var7) {
            try {
                Graphics var12 = class190.field3481.getGraphics();
                for (int var13 = 0; var13 < class161.field2845; var13++) {
                    if (class252.field4541[var13]) {
                        class159.field2799.method45(class170.field2985[var13], class40.field616[var13], class110.field1877[var13], class25.field311[var13], var12, arg0 ^ 0x1);
                        class252.field4541[var13] = false;
                    }
                }
            } catch (Exception var14) {
                class190.field3481.repaint();
            }
        } else if (class199.field3609 != 0) {
            try {
                Graphics var10 = class190.field3481.getGraphics();
                class159.field2799.method46(0, 0, 23, var10);
                for (int var11 = 0; var11 < class161.field2845; var11++) {
                    class252.field4541[var11] = false;
                }
            } catch (Exception var15) {
                class190.field3481.repaint();
            }
        }
        if (class154.field2701) {
            class269.method1796(true);
        }
        if (class193.field3539 && class199.field3609 == 10 && class69.field1262 != -1) {
            class193.field3539 = false;
            class271.method1800(class169.field2967, -2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltg;)Lbf;")
    public static final class200 method1109(class181 arg0) {
        class200 var1 = (class200) class140.field2439.method135(((long) arg0.field3219 << 32) + (long) arg0.field3293, true);
        return var1 == null ? arg0.field3349 : var1;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class136.method993("argument count", false);
            }
            class180.field3173 = Integer.parseInt(arg0[0]);
            class106.field1843 = 2;
            if (arg0[1].equals("live")) {
                class163.field2873 = 0;
            } else if (arg0[1].equals("rc")) {
                class163.field2873 = 1;
            } else if (arg0[1].equals("wip")) {
                class163.field2873 = 2;
            } else {
                class136.method993("modewhat", false);
            }
            int var1 = -1;
            class128.field2255 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class66.method456(class65.method450(var2.length, 0, -126, var2), (byte) -54);
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class104.field1802 = var1;
            } else if (arg0[2].equals("english")) {
                class104.field1802 = 0;
            } else if (arg0[2].equals("german")) {
                class104.field1802 = 1;
            } else {
                class136.method993("language", false);
            }
            class245.method1661(true, class104.field1802);
            class234.field4186 = false;
            class104.field1805 = false;
            if (arg0[3].equals("game0")) {
                class78.field1460 = 0;
            } else if (arg0[3].equals("game1")) {
                class78.field1460 = 1;
            } else {
                class136.method993("game", false);
            }
            class123.field2197 = class178.field3144;
            class73.field1314 = false;
            class276.field4943 = 0;
            class160.field2815 = 0;
            client var3 = new client();
            class11.field157 = var3;
            var3.method497("runescape", false, 531, 8, class163.field2873 + 32, 28, 1024, 768);
            class246.field4432.setLocation(40, 40);
        } catch (Exception var6) {
            class127.method931((byte) -124, (String) null, var6);
        }
        field2714++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public static void method1110(byte arg0) {
        field2716 = null;
        field2722 = null;
        field2738 = null;
        field2726 = null;
        field2730 = null;
        field2732 = null;
        if (arg0 != 115) {
            field2722 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method1111(byte arg0) {
        field2733++;
        if (arg0 < 20) {
            return;
        }
        for (class243.field4386 = 0; class61.method387(10) && class243.field4386 < 128; class243.field4386++) {
            class257.field4629[class243.field4386] = class131.field2318;
            class32.field507[class243.field4386] = class217.field3945;
        }
        class203.field3670++;
        if (class69.field1262 != -1) {
            class243.method1652(-21606, 0, 0, class169.field2968, 0, class150.field2629, class69.field1262, 0);
        }
        class193.field3542++;
        class121.method899(105);
        while (true) {
            class223 var2;
            class181 var3;
            class181 var4;
            do {
                var2 = (class223) class67.field1229.method1158(1375765729);
                if (var2 == null) {
                    while (true) {
                        class223 var5;
                        class181 var6;
                        class181 var7;
                        do {
                            var5 = (class223) class85.field1547.method1158(1375765729);
                            if (var5 == null) {
                                while (true) {
                                    class223 var8;
                                    class181 var9;
                                    class181 var10;
                                    do {
                                        var8 = (class223) class40.field623.method1158(1375765729);
                                        if (var8 == null) {
                                            if (class148.field2611 != null) {
                                                class124.method911(-2);
                                            }
                                            if (class166.field2932 != null && class166.field2932.field290 == 1) {
                                                if (class166.field2932.field292 != null) {
                                                    class120.method892((byte) 91, class141.field2448, class257.field4637);
                                                }
                                                class257.field4637 = null;
                                                class141.field2448 = false;
                                                class166.field2932 = null;
                                            }
                                            if ((class275.field4921 % 1500) == 0) {
                                                class240.method1641((byte) 123);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field4017;
                                        if (var9.field3293 < 0) {
                                            break;
                                        }
                                        var10 = method1114(-20985, var9.field3321);
                                    } while (var10 == null || var10.field3336 == null || var9.field3293 >= var10.field3336.length || var10.field3336[var9.field3293] != var9);
                                    class106.method763(var8, (byte) -63);
                                }
                            }
                            var6 = var5.field4017;
                            if (var6.field3293 < 0) {
                                break;
                            }
                            var7 = method1114(-20985, var6.field3321);
                        } while (var7 == null || var7.field3336 == null || var7.field3336.length <= var6.field3293 || var7.field3336[var6.field3293] != var6);
                        class106.method763(var5, (byte) -70);
                    }
                }
                var3 = var2.field4017;
                if (var3.field3293 < 0) {
                    break;
                }
                var4 = method1114(-20985, var3.field3321);
            } while (var4 == null || var4.field3336 == null || var4.field3336.length <= var3.field3293 || var4.field3336[var3.field3293] != var3);
            class106.method763(var2, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1112(int arg0) {
        field2729++;
        if (class26.field345.field3579 > class187.field3445) {
            if (class283.field5082 == class137.field2390) {
                class137.field2390 = class148.field2608;
            } else {
                class137.field2390 = class283.field5082;
            }
            class241.field4345 = (class26.field345.field3579 * 50 - 50) * 5;
            if (class241.field4345 > 3000) {
                class241.field4345 = 3000;
            }
            if (class26.field345.field3579 >= 2 && class26.field345.field3581 == 6) {
                this.method498("js5connect_outofdate", 11);
                class199.field3609 = 1000;
                return;
            }
            if (class26.field345.field3579 >= 4 && class26.field345.field3581 == -1) {
                this.method498("js5crc", 77);
                class199.field3609 = 1000;
                return;
            }
            if (class26.field345.field3579 >= 4 && (class199.field3609 == 0 || class199.field3609 == 5)) {
                if (class26.field345.field3581 == 7 || class26.field345.field3581 == 9) {
                    this.method498("js5connect_full", arg0 - 7022);
                } else if (class26.field345.field3581 <= 0) {
                    this.method498("js5io", -103);
                } else {
                    this.method498("js5connect", arg0 - 7194);
                }
                class199.field3609 = 1000;
                return;
            }
        }
        class187.field3445 = class26.field345.field3579;
        if (class241.field4345 > 0) {
            class241.field4345--;
            return;
        }
        try {
            if (arg0 != 7099) {
                this.method1106(true);
            }
            if (field2725 == 0) {
                class235.field4192 = class169.field2967.method1959((byte) -5, class137.field2390, class157.field2787);
                field2725++;
            }
            if (field2725 == 1) {
                if (class235.field4192.field290 == 2) {
                    this.method1108(1000, 13436);
                    return;
                }
                if (class235.field4192.field290 == 1) {
                    field2725++;
                }
            }
            if (field2725 == 2) {
                class146.field2576 = new class130((Socket) class235.field4192.field292, class169.field2967);
                class280 var2 = new class280(5);
                var2.method1916(15, 122);
                var2.method1886(531, 2);
                class146.field2576.method945(var2.field5011, (byte) 127, 0, 5);
                field2725++;
                class42.field669 = class28.method155((byte) 109);
            }
            if (field2725 == 3) {
                if (class199.field3609 == 0 || class199.field3609 == 5 || class146.field2576.method950(false) > 0) {
                    int var3 = class146.field2576.method951(0);
                    if (var3 != 0) {
                        this.method1108(var3, 13436);
                        return;
                    }
                    field2725++;
                } else if ((class28.method155((byte) -96) - class42.field669) > 30000L) {
                    this.method1108(1001, 13436);
                    return;
                }
            }
            if (field2725 == 4) {
                boolean var4 = class199.field3609 == 5 || class199.field3609 == 10 || class199.field3609 == 28;
                class26.field345.method1402(class146.field2576, 41, !var4);
                class235.field4192 = null;
                field2725 = 0;
                class146.field2576 = null;
            }
        } catch (IOException var5) {
            this.method1108(1002, 13436);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private static final void method1113(int arg0) {
        field2734++;
        if (~class101.field1762 == arg0) {
            return;
        }
        try {
            if ((++class167.field2945) > 1500) {
                if (class92.field1625 != null) {
                    class92.field1625.method947((byte) 94);
                    class92.field1625 = null;
                }
                if (class29.field437 >= 1) {
                    class242.field4371 = -5;
                    class101.field1762 = 0;
                    return;
                }
                class101.field1762 = 1;
                class167.field2945 = 0;
                if (class275.field4930 == class105.field1820) {
                    class275.field4930 = class268.field4792;
                } else {
                    class275.field4930 = class105.field1820;
                }
                class29.field437++;
            }
            if (class101.field1762 == 1) {
                class57.field957 = class169.field2967.method1959((byte) 121, class275.field4930, class174.field3024);
                class101.field1762 = 2;
            }
            if (class101.field1762 == 2) {
                if (class57.field957.field290 == 2) {
                    throw new IOException();
                }
                if (class57.field957.field290 != 1) {
                    return;
                }
                class92.field1625 = new class130((Socket) class57.field957.field292, class169.field2967);
                class57.field957 = null;
                class92.field1625.method945(class285.field5105.field5011, (byte) 127, 0, class285.field5105.field5027);
                if (class237.field4235 != null) {
                    class237.field4235.method1714((byte) 91);
                }
                if (class11.field155 != null) {
                    class11.field155.method1714((byte) 91);
                }
                int var1 = class92.field1625.method951(~arg0);
                if (class237.field4235 != null) {
                    class237.field4235.method1714((byte) 91);
                }
                if (class11.field155 != null) {
                    class11.field155.method1714((byte) 91);
                }
                if (var1 != 101) {
                    class101.field1762 = 0;
                    class242.field4371 = var1;
                    class92.field1625.method947((byte) 15);
                    class92.field1625 = null;
                    return;
                }
                class101.field1762 = 3;
            }
            if (class101.field1762 == 3 && class92.field1625.method950(false) >= 2) {
                int var2 = class92.field1625.method951(0) << 8 | class92.field1625.method951(~arg0);
                class254.method1727(var2, -25805);
                if (class74.field1352 == -1) {
                    class242.field4371 = 6;
                    class101.field1762 = 0;
                    class92.field1625.method947((byte) 86);
                    class92.field1625 = null;
                } else {
                    class101.field1762 = 0;
                    class92.field1625.method947((byte) 51);
                    class92.field1625 = null;
                    class110.method787(-1);
                }
            }
        } catch (IOException var3) {
            if (class92.field1625 != null) {
                class92.field1625.method947((byte) 97);
                class92.field1625 = null;
            }
            if (class29.field437 < 1) {
                class167.field2945 = 0;
                class101.field1762 = 1;
                class29.field437++;
                if (class275.field4930 == class105.field1820) {
                    class275.field4930 = class268.field4792;
                } else {
                    class275.field4930 = class105.field1820;
                }
            } else {
                class101.field1762 = 0;
                class242.field4371 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ltg;")
    public static final class181 method1114(int arg0, int arg1) {
        field2737++;
        if (arg0 != -20985) {
            field2736 = 73;
        }
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class6.field82[var3] == null || class6.field82[var3][var2] == null) {
            boolean var4 = class146.method1062((byte) -103, var3);
            if (!var4) {
                return null;
            }
        }
        return class6.field82[var3][var2];
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltg;)Z")
    public static final boolean method1115(class181 arg0) {
        if (class252.field4546) {
            if (method1109(arg0).field3646 != 0) {
                return false;
            }
            if (arg0.field3289 == 0) {
                return false;
            }
        }
        return arg0.field3290;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltg;)Ltg;")
    public static final class181 method1116(class181 arg0) {
        int var1 = method1109(arg0).method1434(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = method1114(-20985, arg0.field3321);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltg;IIIIIII)V")
    public static final void method1117(class181[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class181 var9 = arg0[var8];
            if (var9 != null && var9.field3321 == arg1 && (!var9.field3307 || var9.field3289 == 0 || var9.field3237 || method1109(var9).field3646 != 0 || class1.field8 == var9 || var9.field3218 == 1338) && (!var9.field3307 || !method1115(var9))) {
                int var10 = var9.field3214 + arg6;
                int var11 = var9.field3189 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3289 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3270 + var10;
                    int var17 = var9.field3252 + var11;
                    if (var9.field3289 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class148.field2611 == var9) {
                    class241.field4363 = true;
                    class160.field2819 = var10;
                    class25.field317 = var11;
                }
                if (!var9.field3307 || var12 < var14 && var13 < var15) {
                    if (var9.field3289 == 0) {
                        if (!var9.field3307 && method1115(var9) && class232.field4146 != var9) {
                            continue;
                        }
                        if (var9.field3268 && class227.field4056 >= var12 && class157.field2793 >= var13 && class227.field4056 < var14 && class157.field2793 < var15) {
                            for (class223 var18 = (class223) class40.field623.method1151(119); var18 != null; var18 = (class223) class40.field623.method1159(69)) {
                                if (var18.field4011) {
                                    var18.method1544((byte) -122);
                                    var18.field4017.field3335 = false;
                                }
                            }
                            if (class273.field4857 == 0) {
                                class148.field2611 = null;
                                class1.field8 = null;
                            }
                            class267.field4767 = 0;
                        }
                    }
                    if (var9.field3307) {
                        boolean var19;
                        if (class227.field4056 >= var12 && class157.field2793 >= var13 && class227.field4056 < var14 && class157.field2793 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class218.field3969 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class93.field1648 == 1 && class193.field3527 >= var12 && class58.field992 >= var13 && class193.field3527 < var14 && class58.field992 < var15) {
                            var21 = true;
                        }
                        if (var9.field3297 != null) {
                            for (int var22 = 0; var22 < var9.field3297.length; var22++) {
                                if (class176.field3048[var9.field3297[var22]]) {
                                    if (var9.field3215 == null || class275.field4921 >= var9.field3215[var22]) {
                                        byte var23 = var9.field3340[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class176.field3048[86]) && ((var23 & 0x1) == 0 || class176.field3048[82]) && ((var23 & 0x4) == 0 || class176.field3048[81])) {
                                            class282.method1936(-1, -1, var9.field3219, class178.field3144, var22 + 1);
                                            int var24 = var9.field3276[var22];
                                            if (var9.field3215 == null) {
                                                var9.field3215 = new int[var9.field3297.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3215[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3215[var22] = class275.field4921 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3215 != null) {
                                    var9.field3215[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class35.method205((byte) 117, class193.field3527 - var10, class58.field992 - var11, var9);
                        }
                        if (class148.field2611 != null && class148.field2611 != var9 && var19 && method1109(var9).method1439(1)) {
                            class272.field4851 = var9;
                        }
                        if (class1.field8 == var9) {
                            class54.field894 = true;
                            class220.field3993 = var10;
                            class233.field4153 = var11;
                        }
                        if (var9.field3237 || var9.field3218 != 0) {
                            if (var19 && class78.field1462 != 0 && var9.field3329 != null) {
                                class223 var25 = new class223();
                                var25.field4011 = true;
                                var25.field4017 = var9;
                                var25.field4014 = class78.field1462;
                                var25.field4015 = var9.field3329;
                                class40.field623.method1152((byte) -5, var25);
                            }
                            if (class148.field2611 != null || class228.field4080 != null || class58.field991 || var9.field3218 != 1400 && class267.field4767 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3218 != 0) {
                                if (var9.field3218 == 1337) {
                                    class34.field538 = var9;
                                    class254.method1731(var9, (byte) 86);
                                    continue;
                                }
                                if (var9.field3218 == 1338) {
                                    if (var21) {
                                        class216.field3938 = class193.field3527 - var10;
                                        class131.field2327 = class58.field992 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3218 == 1400) {
                                    class89.field1579 = var9;
                                    if (var21) {
                                        if (class176.field3048[82] && class285.field5109 > 0) {
                                            int var26 = (int) ((double) (class193.field3527 - var10 - var9.field3270 / 2) * 2.0D / (double) class105.field1823);
                                            int var27 = (int) ((double) (class58.field992 - var11 - var9.field3252 / 2) * 2.0D / (double) class105.field1823);
                                            int var28 = class71.field1287 + var26;
                                            int var29 = class154.field2700 + var27;
                                            int var30 = class251.field4518 + var28;
                                            int var31 = class183.field3373 + class76.field1404 - var29 - 1;
                                            class61.method381(0, var30, (byte) 61, var31);
                                            class246.method1678(0);
                                            continue;
                                        }
                                        class267.field4767 = 1;
                                        class31.field493 = class227.field4056;
                                        class74.field1353 = class157.field2793;
                                        continue;
                                    }
                                    if (var20 && class267.field4767 > 0) {
                                        if (class267.field4767 == 1 && (class31.field493 != class227.field4056 || class74.field1353 != class157.field2793)) {
                                            class80.field1496 = class71.field1287;
                                            class108.field1853 = class154.field2700;
                                            class267.field4767 = 2;
                                        }
                                        if (class267.field4767 == 2) {
                                            class203.method1443((int) ((double) (class31.field493 - class227.field4056) * 2.0D / (double) class178.field3134) + class80.field1496, (byte) 79);
                                            class211.method1491(29568, (int) ((double) (class74.field1353 - class157.field2793) * 2.0D / (double) class178.field3134) + class108.field1853);
                                        }
                                        continue;
                                    }
                                    class267.field4767 = 0;
                                    continue;
                                }
                                if (var9.field3218 == 1401) {
                                    if (var20) {
                                        class280.method1881(class157.field2793 - var11, var9.field3252, class227.field4056 - var10, (byte) -77, var9.field3270);
                                    }
                                    continue;
                                }
                                if (var9.field3218 == 1402) {
                                    class254.method1731(var9, (byte) 57);
                                    continue;
                                }
                            }
                            if (!var9.field3291 && var21) {
                                var9.field3291 = true;
                                if (var9.field3222 != null) {
                                    class223 var32 = new class223();
                                    var32.field4011 = true;
                                    var32.field4017 = var9;
                                    var32.field4022 = class193.field3527 - var10;
                                    var32.field4014 = class58.field992 - var11;
                                    var32.field4015 = var9.field3222;
                                    class40.field623.method1152((byte) -5, var32);
                                }
                            }
                            if (var9.field3291 && var20 && var9.field3235 != null) {
                                class223 var33 = new class223();
                                var33.field4011 = true;
                                var33.field4017 = var9;
                                var33.field4022 = class227.field4056 - var10;
                                var33.field4014 = class157.field2793 - var11;
                                var33.field4015 = var9.field3235;
                                class40.field623.method1152((byte) -5, var33);
                            }
                            if (var9.field3291 && !var20) {
                                var9.field3291 = false;
                                if (var9.field3227 != null) {
                                    class223 var34 = new class223();
                                    var34.field4011 = true;
                                    var34.field4017 = var9;
                                    var34.field4022 = class227.field4056 - var10;
                                    var34.field4014 = class157.field2793 - var11;
                                    var34.field4015 = var9.field3227;
                                    class85.field1547.method1152((byte) -5, var34);
                                }
                            }
                            if (var20 && var9.field3275 != null) {
                                class223 var35 = new class223();
                                var35.field4011 = true;
                                var35.field4017 = var9;
                                var35.field4022 = class227.field4056 - var10;
                                var35.field4014 = class157.field2793 - var11;
                                var35.field4015 = var9.field3275;
                                class40.field623.method1152((byte) -5, var35);
                            }
                            if (!var9.field3335 && var19) {
                                var9.field3335 = true;
                                if (var9.field3302 != null) {
                                    class223 var36 = new class223();
                                    var36.field4011 = true;
                                    var36.field4017 = var9;
                                    var36.field4022 = class227.field4056 - var10;
                                    var36.field4014 = class157.field2793 - var11;
                                    var36.field4015 = var9.field3302;
                                    class40.field623.method1152((byte) -5, var36);
                                }
                            }
                            if (var9.field3335 && var19 && var9.field3196 != null) {
                                class223 var37 = new class223();
                                var37.field4011 = true;
                                var37.field4017 = var9;
                                var37.field4022 = class227.field4056 - var10;
                                var37.field4014 = class157.field2793 - var11;
                                var37.field4015 = var9.field3196;
                                class40.field623.method1152((byte) -5, var37);
                            }
                            if (var9.field3335 && !var19) {
                                var9.field3335 = false;
                                if (var9.field3269 != null) {
                                    class223 var38 = new class223();
                                    var38.field4011 = true;
                                    var38.field4017 = var9;
                                    var38.field4022 = class227.field4056 - var10;
                                    var38.field4014 = class157.field2793 - var11;
                                    var38.field4015 = var9.field3269;
                                    class85.field1547.method1152((byte) -5, var38);
                                }
                            }
                            if (var9.field3350 != null) {
                                class223 var39 = new class223();
                                var39.field4017 = var9;
                                var39.field4015 = var9.field3350;
                                class67.field1229.method1152((byte) -5, var39);
                            }
                            if (var9.field3278 != null && class256.field4621 > var9.field3264) {
                                if (var9.field3245 == null || class256.field4621 - var9.field3264 > 32) {
                                    class223 var44 = new class223();
                                    var44.field4017 = var9;
                                    var44.field4015 = var9.field3278;
                                    class40.field623.method1152((byte) -5, var44);
                                } else {
                                    label565: for (int var40 = var9.field3264; var40 < class256.field4621; var40++) {
                                        int var41 = class140.field2441[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field3245.length; var42++) {
                                            if (var9.field3245[var42] == var41) {
                                                class223 var43 = new class223();
                                                var43.field4017 = var9;
                                                var43.field4015 = var9.field3278;
                                                class40.field623.method1152((byte) -5, var43);
                                                break label565;
                                            }
                                        }
                                    }
                                }
                                var9.field3264 = class256.field4621;
                            }
                            if (var9.field3300 != null && class251.field4517 > var9.field3205) {
                                if (var9.field3279 == null || class251.field4517 - var9.field3205 > 32) {
                                    class223 var49 = new class223();
                                    var49.field4017 = var9;
                                    var49.field4015 = var9.field3300;
                                    class40.field623.method1152((byte) -5, var49);
                                } else {
                                    label541: for (int var45 = var9.field3205; var45 < class251.field4517; var45++) {
                                        int var46 = class70.field1282[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field3279.length; var47++) {
                                            if (var9.field3279[var47] == var46) {
                                                class223 var48 = new class223();
                                                var48.field4017 = var9;
                                                var48.field4015 = var9.field3300;
                                                class40.field623.method1152((byte) -5, var48);
                                                break label541;
                                            }
                                        }
                                    }
                                }
                                var9.field3205 = class251.field4517;
                            }
                            if (var9.field3188 != null && class211.field3872 > var9.field3223) {
                                if (var9.field3317 == null || class211.field3872 - var9.field3223 > 32) {
                                    class223 var54 = new class223();
                                    var54.field4017 = var9;
                                    var54.field4015 = var9.field3188;
                                    class40.field623.method1152((byte) -5, var54);
                                } else {
                                    label517: for (int var50 = var9.field3223; var50 < class211.field3872; var50++) {
                                        int var51 = class124.field2209[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field3317.length; var52++) {
                                            if (var9.field3317[var52] == var51) {
                                                class223 var53 = new class223();
                                                var53.field4017 = var9;
                                                var53.field4015 = var9.field3188;
                                                class40.field623.method1152((byte) -5, var53);
                                                break label517;
                                            }
                                        }
                                    }
                                }
                                var9.field3223 = class211.field3872;
                            }
                            if (var9.field3356 != null && class54.field905 > var9.field3271) {
                                if (var9.field3309 == null || class54.field905 - var9.field3271 > 32) {
                                    class223 var59 = new class223();
                                    var59.field4017 = var9;
                                    var59.field4015 = var9.field3356;
                                    class40.field623.method1152((byte) -5, var59);
                                } else {
                                    label493: for (int var55 = var9.field3271; var55 < class54.field905; var55++) {
                                        int var56 = class9.field131[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field3309.length; var57++) {
                                            if (var9.field3309[var57] == var56) {
                                                class223 var58 = new class223();
                                                var58.field4017 = var9;
                                                var58.field4015 = var9.field3356;
                                                class40.field623.method1152((byte) -5, var58);
                                                break label493;
                                            }
                                        }
                                    }
                                }
                                var9.field3271 = class54.field905;
                            }
                            if (var9.field3316 != null && class259.field4658 > var9.field3354) {
                                if (var9.field3345 == null || class259.field4658 - var9.field3354 > 32) {
                                    class223 var64 = new class223();
                                    var64.field4017 = var9;
                                    var64.field4015 = var9.field3316;
                                    class40.field623.method1152((byte) -5, var64);
                                } else {
                                    label469: for (int var60 = var9.field3354; var60 < class259.field4658; var60++) {
                                        int var61 = class249.field4482[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field3345.length; var62++) {
                                            if (var9.field3345[var62] == var61) {
                                                class223 var63 = new class223();
                                                var63.field4017 = var9;
                                                var63.field4015 = var9.field3316;
                                                class40.field623.method1152((byte) -5, var63);
                                                break label469;
                                            }
                                        }
                                    }
                                }
                                var9.field3354 = class259.field4658;
                            }
                            if (class72.field1293 > var9.field3348 && var9.field3225 != null) {
                                class223 var65 = new class223();
                                var65.field4017 = var9;
                                var65.field4015 = var9.field3225;
                                class40.field623.method1152((byte) -5, var65);
                            }
                            if (class9.field128 > var9.field3348 && var9.field3358 != null) {
                                class223 var66 = new class223();
                                var66.field4017 = var9;
                                var66.field4015 = var9.field3358;
                                class40.field623.method1152((byte) -5, var66);
                            }
                            if (class253.field4561 > var9.field3348 && var9.field3343 != null) {
                                class223 var67 = new class223();
                                var67.field4017 = var9;
                                var67.field4015 = var9.field3343;
                                class40.field623.method1152((byte) -5, var67);
                            }
                            if (class76.field1427 > var9.field3348 && var9.field3217 != null) {
                                class223 var68 = new class223();
                                var68.field4017 = var9;
                                var68.field4015 = var9.field3217;
                                class40.field623.method1152((byte) -5, var68);
                            }
                            if (class167.field2951 > var9.field3348 && var9.field3182 != null) {
                                class223 var69 = new class223();
                                var69.field4017 = var9;
                                var69.field4015 = var9.field3182;
                                class40.field623.method1152((byte) -5, var69);
                            }
                            var9.field3348 = class193.field3542;
                            if (var9.field3236 != null) {
                                for (int var70 = 0; var70 < class243.field4386; var70++) {
                                    class223 var71 = new class223();
                                    var71.field4017 = var9;
                                    var71.field4010 = class257.field4629[var70];
                                    var71.field4013 = class32.field507[var70];
                                    var71.field4015 = var9.field3236;
                                    class40.field623.method1152((byte) -5, var71);
                                }
                            }
                            if (class38.field585 && var9.field3241 != null) {
                                class223 var72 = new class223();
                                var72.field4017 = var9;
                                var72.field4015 = var9.field3241;
                                class40.field623.method1152((byte) -5, var72);
                            }
                        }
                    }
                    if (!var9.field3307 && class148.field2611 == null && class228.field4080 == null && !class58.field991) {
                        if ((var9.field3197 >= 0 || var9.field3187 != 0) && class227.field4056 >= var12 && class157.field2793 >= var13 && class227.field4056 < var14 && class157.field2793 < var15) {
                            if (var9.field3197 >= 0) {
                                class232.field4146 = arg0[var9.field3197];
                            } else {
                                class232.field4146 = var9;
                            }
                        }
                        if (var9.field3289 == 8 && class227.field4056 >= var12 && class157.field2793 >= var13 && class227.field4056 < var14 && class157.field2793 < var15) {
                            class78.field1463 = var9;
                        }
                        if (var9.field3334 > var9.field3252) {
                            class35.method204(var9.field3270 + var10, true, var9.field3252, class227.field4056, var9, var11, var9.field3334, class157.field2793);
                        }
                    }
                    if (var9.field3289 == 0) {
                        method1117(arg0, var9.field3219, var12, var13, var14, var15, var10 - var9.field3310, var11 - var9.field3282);
                        if (var9.field3336 != null) {
                            method1117(var9.field3336, var9.field3219, var12, var13, var14, var15, var10 - var9.field3310, var11 - var9.field3282);
                        }
                        class214 var73 = (class214) class255.field4610.method135((long) var9.field3219, true);
                        if (var73 != null) {
                            class243.method1652(-21606, var13, var12, var15, var11, var14, var73.field3912, var10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method485(int arg0) {
        field2727++;
        method1110((byte) 115);
        class93.method675((byte) 127);
        class206.method1455((byte) -61);
        class157.method1128(true);
        class129.method941(false);
        class73.method488(83);
        class134.method981(true);
        class238.method1624(-1019);
        class183.method1343(true);
        class174.method1246((byte) 117);
        class280.method1911(-1);
        class130.method956((byte) -61);
        class195.method1399(3);
        class235.method1606(-13);
        class79.method546(5821);
        class57.method325(0);
        class177.method1258(100);
        class245.method1667((byte) 68);
        class277.method1855(6);
        class54.method304(85);
        class227.method1562(15);
        class228.method1566((byte) -87);
        class102.method733((byte) -93);
        class181.method1335(15730);
        class237.method1619((byte) -1);
        class160.method1154(-1);
        class120.method893(82);
        class25.method138(-96);
        class72.method482(26144);
        class67.method458((byte) 59);
        class78.method539(-39);
        class115.method849(16);
        class253.method1720((byte) 30);
        class198.method1419(true);
        class162.method1176((byte) 49);
        class31.method185(-124);
        class210.method1484((byte) 89);
        class41.method235(81);
        class240.method1642(-80);
        class53.method291(113);
        class145.method1053(17037);
        class214.method1509(false);
        class200.method1437(27513);
        class222.method1541(3000);
        class165.method1198(true);
        class267.method1785((byte) 116);
        class171.method1230(-123);
        class138.method1008(-111);
        class208.method1465(-126);
        class258.method1741(11411);
        class147.method1064(2047);
        class108.method777((byte) -117);
        class37.method216(false);
        class205.method1451(-61);
        class40.method231(false);
        class58.method335(true);
        class92.method633(128);
        class175.method1249(true);
        class204.method1449(true);
        class220.method1535(false);
        class128.method933(false);
        class168.method1214(107);
        class172.method1231(16);
        class64.method439();
        class143.method1037((byte) -6);
        class29.method171((byte) 6);
        class62.method398();
        class266.method1779(62);
        class11.method47((byte) 103);
        class137.method1000(1);
        class111.method790(1136421227);
        class230.method1576((byte) -114);
        class87.method595(1);
        class193.method1387(84);
        class274.method1837();
        class242.method1649(-27250);
        class88.method606();
        class191.method1374(0);
        class104.method756(false);
        class27.method149();
        class246.method1676(0);
        class272.method1805((byte) -122);
        class26.method140(-9043);
        class151.method1085((byte) 2);
        class75.method523();
        class19.method87(-1295262521);
        class263.method1763((byte) -79);
        class131.method958(6210);
        class254.method1730((byte) 93);
        class276.method1851(9276);
        class148.method1071((byte) 21);
        class250.method1697(-119);
        class136.method992((byte) 67);
        class45.method248(49);
        class89.method623(3008);
        class287.method1969(25073);
        class13.method55((byte) 89);
        class50.method273((byte) -124);
        class135.method986(-30);
        class141.method1026(-1);
        class34.method198(-114);
        class282.method1934(-1);
        class118.method873(false);
        class63.method412(2);
        class278.method1861(-8);
        class234.method1595(2);
        class124.method914(127);
        class139.method1014(true);
        class259.method1749((byte) -94);
        class209.method1470((byte) 24);
        class117.method864(0);
        class179.method1314();
        class94.method690(4);
        class52.method288(-7155);
        class283.method1941(87);
        class32.method191((byte) 29);
        class288.method1972(2);
        class49.method269(14041);
        class149.method1079(0);
        class1.method4(106);
        class95.method698(40);
        class223.method1546(32);
        class229.method1574(5);
        class268.method1790(2);
        class70.method473((byte) 107);
        class24.method127(false);
        class30.method177(-80);
        class112.method805(-102);
        class61.method382(-244);
        class21.method122();
        int var2 = 100 / ((67 - arg0) / 47);
        class3.method11(-81);
        class7.method31((byte) 26);
        class231.method1580(116);
        class116.method861();
        class279.method1869((byte) 123);
        class42.method236(0);
        class256.method1737((byte) -122);
        class60.method379(126);
        class212.method1501(18352);
        class249.method1694((byte) 113);
        class43.method242(true);
        class65.method449((byte) 124);
        class216.method1520(-126);
        class192.method1379();
        class167.method1210(52);
        class155.method1104(32768);
        class260.method1751(121);
        class121.method900(true);
        class185.method1350(2992);
        class199.method1426(25996);
        class224.method1554(7095);
        class241.method1644(false);
        class178.method1295(-52);
        class126.method924(110);
        class127.method927((byte) 99);
        class82.method577(0);
        class103.method753(-107);
        class236.method1609((byte) 93);
        class9.method38((byte) 0);
        class187.method1355(48);
        class257.method1739(false);
        class140.method1020((byte) 57);
        class156.method1122(false);
        class33.method195(4);
        class190.method1366(1);
        class251.method1702(25288);
        class47.method262(true);
        class262.method1754();
        class74.method501(true);
        class196.method1407(18);
        class218.method1530((byte) 111);
        class232.method1587(10215);
        class270.method1799(true);
        class252.method1708((byte) -119);
        class281.method1932();
        class100.method723();
        class133.method974(true);
        class233.method1590(0);
        class114.method818();
        class142.method1034();
        class85.method588(-105);
        class186.method1353(14);
        class264.method1770(0);
        class39.method224((byte) -109);
        class152.method1092((byte) -111);
        class76.method531(-1);
        class83.method581(0);
        class46.method257(false);
        class55.method306(false);
        class271.method1801(false);
        class4.method15(66);
        class71.method476((byte) 110);
        class68.method462((byte) -119);
        class207.method1461(true);
        class86.method593(-19498);
        class144.method1043(true);
        class38.method221((byte) 66);
        class150.method1083((byte) -126);
        class56.method315(1);
        class5.method18(true);
        class170.method1221(0);
        class146.method1063(0);
        class226.method1557(115);
        class166.method1202((byte) 98);
        class182.method1340((byte) 84);
        class80.method556(false);
        class66.method457(4095);
        class106.method764(true);
        class217.method1523((byte) 118);
        class176.method1255((byte) -109);
        class97.method710(0);
        class269.method1793(-96);
        class44.method245((byte) -73);
        class169.method1219((byte) -126);
        class273.method1809(6820);
        class48.method267((byte) -26);
        class284.method1945((byte) -115);
        class105.method761((byte) 66);
        class243.method1651(false);
        class8.method36(3552);
        class14.method59((byte) -76);
        class16.method78((byte) 125);
        class119.method887(98);
        class275.method1843((byte) 59);
        class247.method1682(0);
        class153.method1099((byte) 122);
        class285.method1949((byte) -22);
        class101.method727(-113);
        class15.method74(-1);
        class203.method1442(97);
        class164.method1182(-20236);
        class213.method1506(-16214);
        class154.method1100((byte) -81);
        class189.method1365(0);
        class110.method784(18044);
        class18.method81(117);
        class180.method1323(false);
        class51.method284(124);
        class255.method1734(true);
        class35.method208((byte) 55);
        class163.method1178(5);
        class123.method908(-115);
        class109.method782(-94);
        class188.method1362((byte) -57);
        class125.method917((byte) -60);
        class6.method26(1);
        class69.method464(-16);
        class77.method537(0);
        class248.method1685((byte) -77);
        class159.method1149(1053812876);
        class113.method809(114);
        if (class73.field1346) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1118(int arg0, byte[] arg1) {
        field2724++;
        class280 var2 = new class280(arg1);
        int var3 = var2.method1907(16832);
        int var4 = var2.method1872(122);
        if (var4 < 0 || !(class277.field4957 == 0 || var4 <= class277.field4957)) {
            throw new RuntimeException();
        } else if (arg0 == var3) {
            byte[] var7 = new byte[var4];
            var2.method1928(var4, var7, -16777216, 0);
            return var7;
        } else {
            int var5 = var2.method1872(108);
            if (var5 < 0 || class277.field4957 != 0 && class277.field4957 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class262.method1761(var6, var5, arg1, var4, 9);
            } else {
                class231.field4128.method1765(var6, var2, false);
            }
            return var6;
        }
    }
}
