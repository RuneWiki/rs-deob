import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class348 extends class143 {

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public int field4918 = 0;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public static int field4915 = -1;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "Lek;")
    public static class465 field4920;

    @OriginalMember(owner = "client!jq", name = "H", descriptor = "Lga;")
    public static class63 field4921;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)I", line = 3)
    public static final int method2116(boolean arg0) {
        field4914++;
        if (!class525.field7713.field5970) {
            for (int var1 = 0; var1 < class443.field6418; var1++) {
                if (class336.field4674[var1].method2467(24968) == 's' || class336.field4674[var1].method2467(24968) == 'S') {
                    class525.field7713.field5970 = true;
                    break;
                }
            }
        }
        if (class508.field7537 == class230.field3406) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class254.method1619(!arg0);
            if (class190.field2972 == 0L) {
                class190.field2972 = var4;
            }
            if (var3 > 16384 && (var4 - class190.field2972) < 5000L) {
                if (var4 - class702.field9930 > 1000L) {
                    System.gc();
                    class702.field9930 = var4;
                }
                return 0;
            }
        }
        if (class508.field7541 == class230.field3406) {
            if (class454.field6530 == null) {
                class454.field6530 = new class314(class511.field7607, class644.field9145, class512.field7622, class373.field5178);
            }
            if (!class454.field6530.method1897(36)) {
                return 0;
            }
            class122.method982(false, 0, null);
            class501.field7450 = !class397.method2409((byte) -102);
            class410.field5867 = class104.method873(false, 1, -10371, class501.field7450 ? 34 : 32);
            class259.field3715 = class104.method873(false, 1, -10371, 33);
            class399.field5771 = class104.method873(false, 1, -10371, 13);
        }
        if (class508.field7545 == class230.field3406) {
            class259.field3715.method2076(94);
            int var6 = class53.field688[33].method1318(19997);
            int var7 = var6 + class53.field688[class501.field7450 ? 34 : 32].method1318(19997);
            int var8 = var7 + class53.field688[13].method1318(19997);
            int var9 = var8 + class259.field3715.method2079(0);
            if (var9 != 400) {
                return var9 / 4;
            }
            class148.field2504 = class410.field5867.method2091((byte) -45);
            class673.field9558 = class259.field3715.method2091((byte) -45);
            class541.method3186(class410.field5867, (byte) 89);
            int var10 = class525.field7713.field5975;
            class455.field6541 = new class437(class486.field6942, class238.field3511, class259.field3715);
            int[] var11 = class455.field6541.method2560(2, var10);
            class399 var12 = new class399(class410.field5867, class399.field5771);
            if (var11.length > 0) {
                class565.field8275 = new class200[var11.length];
                for (int var13 = 0; var13 < class565.field8275.length; var13++) {
                    class565.field8275[var13] = new class150(class455.field6541.method2562(var11[var13], false), var12);
                }
            }
        }
        if (arg0) {
            method2117(122);
        }
        if (class508.field7546 == class230.field3406) {
            class644.method3622(class188.method1343(!arg0), class399.field5771, class410.field5867, (byte) -123);
        }
        if (class508.field7548 == class230.field3406) {
            int var14 = class582.method3370(-1);
            int var15 = class180.method1302(126);
            if (var14 < var15) {
                return var14 * 100 / var15;
            }
        }
        if (class508.field7549 == class230.field3406) {
            if (class565.field8275 != null && class565.field8275.length > 0) {
                if (class565.field8275[0].method1143(-12150) < 100) {
                    return 0;
                }
                if (class565.field8275.length > 1 && class455.field6541.method2559((byte) -124) && class565.field8275[1].method1143(-12150) < 100) {
                    return 0;
                }
            }
            class303.method1856((byte) 97, class637.field9048);
            class9.method53(-1, class637.field9048);
            class595.method3408((byte) 82, 1);
        }
        if (class508.field7550 == class230.field3406) {
            for (int var16 = 0; var16 < 4; var16++) {
                class45.field609[var16] = class128.method1010(class430.field6136, 1, class580.field8504);
            }
        }
        if (class508.field7551 == class230.field3406) {
            class468.field6754 = class104.method873(false, 1, -10371, 8);
            class26.field371 = class104.method873(false, 1, -10371, 0);
            class137.field2218 = class104.method873(false, 1, -10371, 1);
            class379.field5241 = class104.method873(false, 1, -10371, 2);
            class522.field7698 = class104.method873(false, 1, -10371, 3);
            class233.field3455 = class104.method873(false, 1, -10371, 4);
            class466.field6733 = class104.method873(true, 1, -10371, 5);
            class97.field1451 = class104.method873(true, 1, -10371, 6);
            class205.field3168 = class104.method873(false, 1, -10371, 7);
            class691.field9792 = class104.method873(false, 1, -10371, 9);
            class177.field2831 = class104.method873(false, 1, -10371, 10);
            class418.field5944 = class104.method873(false, 1, -10371, 11);
            class563.field8216 = class104.method873(false, 1, -10371, 12);
            class445.field6444 = class104.method873(false, 1, -10371, 14);
            class156.field2569 = class104.method873(false, 1, -10371, 15);
            class240.field3534 = class104.method873(false, 1, -10371, 16);
            class183.field2905 = class104.method873(false, 1, -10371, 17);
            class337.field4697 = class104.method873(false, 1, -10371, 18);
            class400.field5781 = class104.method873(false, 1, -10371, 19);
            class57.field852 = class104.method873(false, 1, -10371, 20);
            class23.field305 = class104.method873(false, 1, -10371, 21);
            class487.field6954 = class104.method873(false, 1, -10371, 22);
            class72.field1152 = class104.method873(true, 1, -10371, 23);
            class580.field8502 = class104.method873(false, 1, -10371, 24);
            class89.field1329 = class104.method873(false, 1, -10371, 25);
            class76.field1183 = class104.method873(true, 1, -10371, 26);
            class386.field5664 = class104.method873(false, 1, -10371, 27);
            class634.field8977 = class104.method873(true, 1, -10371, 28);
            class608.field8739 = class104.method873(false, 1, -10371, 29);
            class425.field6073 = class104.method873(true, 1, -10371, 30);
            class450.field6495 = class104.method873(true, 1, -10371, 31);
        }
        if (class508.field7552 == class230.field3406) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class53.field688[var18] != null) {
                    var17 += class53.field688[var18].method1318(19997) * class130.field2120[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class98.field1454 < 0) {
                    class98.field1454 = var17;
                }
                return (var17 - class98.field1454) * 100 / (100 - class98.field1454);
            }
            class530.method3118(class468.field6754, (byte) -115);
            class644.method3622(class188.method1343(true), class399.field5771, class468.field6754, (byte) -14);
        }
        if (class508.field7553 == class230.field3406) {
            class233.method1531((byte) -107);
            class595.method3408((byte) 118, 2);
        }
        if (class508.field7554 == class230.field3406) {
            class667.method3756(6627, class653.field9220, class425.field6073);
        }
        if (class508.field7555 == class230.field3406) {
            int var19 = class457.method2654(-53);
            if (var19 < 100) {
                return var19;
            }
            class561.method3282(-1, class634.field8977.method2086(1024, 1));
            class102.method853(class634.field8977.method2086(1024, 3), (byte) 121);
        }
        if (class508.field7556 == class230.field3406) {
            if (class577.field8455 != -1 && !class205.field3168.method2089(class577.field8455, -127, 0)) {
                return 99;
            }
            class703.field9939 = new class386(class76.field1183, class691.field9792, class468.field6754);
            class237.field3504 = new class238(class486.field6942, class238.field3511, class379.field5241);
            class625.field8919 = new class121(class486.field6942, class238.field3511, class379.field5241);
            class329.field4559 = new class376(class486.field6942, class238.field3511, class379.field5241, class468.field6754);
            class103.field1706 = new class525(class486.field6942, class238.field3511, class183.field2905);
            class344.field4826 = new class86(class486.field6942, class238.field3511, class379.field5241);
            class621.field8844 = new class308(class486.field6942, class238.field3511, class379.field5241);
            class235.field3484 = new class509(class486.field6942, class238.field3511, class379.field5241, class205.field3168);
            class63.field914 = new class596(class486.field6942, class238.field3511, class379.field5241);
            class27.field385 = new class69(class486.field6942, class238.field3511, class379.field5241);
            class14.field224 = new class485(class486.field6942, class238.field3511, true, class240.field3534, class205.field3168);
            class304.field4255 = new class486(class486.field6942, class238.field3511, class379.field5241, class468.field6754);
            class624.field8902 = new class229(class486.field6942, class238.field3511, class379.field5241, class468.field6754);
            class564.field8259 = new class664(class486.field6942, class238.field3511, true, class337.field4697, class205.field3168);
            class430.field6132 = new class9(class486.field6942, class238.field3511, true, class237.field3504, class400.field5781, class205.field3168);
            class659.field9287 = new class491(class486.field6942, class238.field3511, class379.field5241);
            class480.field6871 = new class205(class486.field6942, class238.field3511, class57.field852, class26.field371, class137.field2218);
            class104.field1715 = new class556(class486.field6942, class238.field3511, class379.field5241);
            class111.field1777 = new class59(class486.field6942, class238.field3511, class379.field5241);
            class554.field8108 = new class73(class486.field6942, class238.field3511, class23.field305, class205.field3168);
            class667.field9380 = new class540(class486.field6942, class238.field3511, class379.field5241);
            class430.field6135 = new class1(class486.field6942, class238.field3511, class379.field5241);
            class678.field9650 = new class262(class486.field6942, class238.field3511, class379.field5241);
            class56.field781 = new class563(class486.field6942, class238.field3511, class487.field6954);
            class545.field8005 = new class494(class486.field6942, class238.field3511, class379.field5241);
            class511.method3044(class522.field7698, class399.field5771, class205.field3168, class468.field6754, (byte) 47);
            class219.method1471(class608.field8739, 1190717);
            class304.field4254 = new class213(class238.field3511, class580.field8502, class89.field1329);
            class116.field1840 = new class357(class238.field3511, class580.field8502, class89.field1329, new class327());
            class65.method537(-12515);
            class14.field224.method2829((byte) -117, !class525.field7713.method3471(class76.field1182, false));
            class230.field3404 = new class206();
            class69.method566((byte) -126);
            class557.method3265(false, class386.field5664);
            class541.method3188(class205.field3168, 6, class703.field9939);
            class516 var20 = new class516(class177.field2831.method2073((byte) 87, "", "huffman"));
            class289.method1779(var20, false);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class418.field5949 = class551.method3233((byte) -58);
            class265.field3816 = new class641(true, class653.field9220);
        }
        if (class508.field7558 == class230.field3406) {
            int var21 = class682.method3857(class468.field6754, (byte) 102) + class199.method1396(!arg0, true);
            int var22 = class446.method2604(80) + class180.method1302(114);
            if (var22 > var21) {
                return var21 * 100 / var22;
            }
        }
        if (class508.field7559 == class230.field3406) {
            class161.method1227(class72.field1152, class344.field4826, class621.field8844, class14.field224, class304.field4255, class624.field8902, class230.field3404);
        }
        if (class508.field7560 == class230.field3406) {
            class331.field4580 = new boolean[class678.field9650.field3779];
            class39.field532 = new String[class430.field6135.field1];
            class384.field5620 = new int[class678.field9650.field3779];
            for (int var23 = 0; var23 < class678.field9650.field3779; var23++) {
                if (class678.field9650.method1670(-62, var23).field8620 == 0) {
                    class331.field4580[var23] = true;
                    class453.field6522++;
                }
                class384.field5620[var23] = -1;
            }
            class272.method1714((byte) 101);
            class486.field6938 = class522.field7698.method2083(2, "loginscreen");
            class408.field5845 = class522.field7698.method2083(2, "lobbyscreen");
            class466.field6733.method2067(false, true, true);
            class97.field1451.method2067(true, true, true);
            class468.field6754.method2067(true, true, !arg0);
            class399.field5771.method2067(true, true, !arg0);
            class177.field2831.method2067(true, true, true);
            class522.field7698.method2067(true, true, true);
            class379.field5241.field4849 = 2;
            class114.field1824 = true;
            class183.field2905.field4849 = 2;
            class240.field3534.field4849 = 2;
            class337.field4697.field4849 = 2;
            class400.field5781.field4849 = 2;
            class57.field852.field4849 = 2;
            class23.field305.field4849 = 2;
        }
        if (class508.field7561 == class230.field3406) {
            if (!class56.method437((byte) 61, class486.field6938)) {
                return 0;
            }
            for (int var24 = 0; var24 < class265.field3806[class486.field6938].length; var24++) {
                class101 var25 = class265.field3806[class486.field6938][var24];
                if (var25.field1584 == 5 && var25.field1628 != -1) {
                    var25.method832(class637.field9048, (byte) -106);
                }
            }
        }
        if (class508.field7562 == class230.field3406) {
            for (int var26 = 0; var26 < class265.field3806[class486.field6938].length; var26++) {
                class101 var27 = class265.field3806[class486.field6938][var26];
                if (var27.field1584 == 5 && var27.field1628 != -1 && var27.method832(class637.field9048, (byte) -106) == null && class466.field6734) {
                    return 0;
                }
            }
        }
        if (class508.field7563 == class230.field3406) {
            class473.method2779(true, -76);
        }
        if (class508.field7564 == class230.field3406) {
            class406.field5827.method252(true);
            try {
                class260.field3751.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class406.field5827 = null;
            class259.field3715 = null;
            class455.field6541 = null;
            class565.field8275 = null;
            class260.field3751 = null;
            class410.field5867 = null;
            class607.method3453(-114);
            class383.field5613 = class525.field7713.field5970;
            class525.field7713.field5970 = true;
            class525.field7713.method3481(true, class653.field9220);
            if (class383.field5613) {
                class251.method1604(62, 0);
            } else {
                class251.method1604(46, class525.field7713.field6000);
            }
            class246.method1584((byte) 104, -1, class525.field7713.field5974, false, -1);
            class303.method1856((byte) 123, class637.field9048);
            class9.method53(-1, class637.field9048);
            class163.method1239(class468.field6754, true, class637.field9048);
            class616.method3476(class541.field7948, (byte) 117);
        }
        return class108.method891(-124);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 452)
    public static void method2117(int arg0) {
        field4921 = null;
        if (arg0 != -2915) {
            method2116(true);
        }
        field4920 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z", line = 464)
    public static final boolean method2118(int arg0, int arg1) {
        if (arg1 != -2) {
            method2118(-96, -117);
        }
        field4917++;
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lek;B)V", line = 479)
    public final void method2119(class465 arg0, byte arg1) {
        int var3 = 55 / ((arg1 + 20) / 42);
        while (true) {
            int var4 = arg0.method2705(-121);
            if (var4 == 0) {
                field4919++;
                return;
            }
            this.method2120(-90, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IILek;)V", line = 503)
    private final void method2120(int arg0, int arg1, class465 arg2) {
        if (arg0 > -42) {
            method2117(91);
        }
        if (arg1 == 2) {
            this.field4918 = arg2.method2755((byte) -53);
        }
        field4916++;
    }
}
