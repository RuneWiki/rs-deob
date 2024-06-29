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
public class client extends class287 {

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lve;")
    public static class255 field4034 = class87.method607(74, ":assist:");

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field4022 = 0;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4040 = -1;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lve;")
    private static class255 field4029 = class87.method607(111, "Loaded title screen");

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lve;")
    public static class255 field4028 = field4029;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[[Z")
    public static boolean[][] field4038 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Ltk;")
    public static class239 field4041;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 6)
    private final void method1664(int arg0, int arg1) {
        class294.field5057++;
        field4031++;
        class116.field1973 = null;
        if (class294.field5051 == class155.field2650) {
            class294.field5051 = class232.field3853;
        } else {
            class294.field5051 = class155.field2650;
        }
        class107.field1809 = null;
        class192.field3062 = arg0;
        if (class294.field5057 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class18.field281 == 0 || class18.field281 == 5) {
                this.method2039(false, "js5connect_full");
                class18.field281 = 1000;
            } else {
                class145.field2427 = 3000;
            }
        } else if (class294.field5057 >= 2 && arg1 == 6) {
            this.method2039(false, "js5connect_outofdate");
            class18.field281 = 1000;
        } else if (class294.field5057 >= 4) {
            if (class18.field281 == 0 || class18.field281 == 5) {
                this.method2039(false, "js5connect");
                class18.field281 = 1000;
            } else {
                class145.field2427 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 59)
    private final void method1665(boolean arg0) {
        if (!class63.field959) {
            label241: while (true) {
                do {
                    if (!class181.method1275(20936)) {
                        break label241;
                    }
                } while (class13.field183 != 115 && class13.field183 != 83);
                class63.field959 = true;
            }
        }
        field4037++;
        if (class20.field325 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class218.method1541(119);
            if (class205.field3526 == 0L) {
                class205.field3526 = var4;
            }
            if (var3 > 16384 && var4 - class205.field3526 < 5000L) {
                if ((var4 - class153.field2596) > 1000L) {
                    System.gc();
                    class153.field2596 = var4;
                }
                class145.field2456 = 5;
                class148.field2508 = class7.field98;
            } else {
                class20.field325 = 10;
                class145.field2456 = 5;
                class148.field2508 = class30.field501;
            }
        } else if (class20.field325 == 10) {
            class164.method1193(4, 104, 104);
            for (int var27 = 0; var27 < 4; var27++) {
                class310.field5292[var27] = new class163(104, 104);
            }
            class148.field2508 = class268.field4586;
            class20.field325 = 30;
            class145.field2456 = 10;
        } else if (class20.field325 == 30) {
            if (class268.field4594 == null) {
                class268.field4594 = new class291(class297.field5078, class37.field562);
            }
            if (class268.field4594.method2061(0)) {
                class46.field695 = class149.method1107(0, (byte) 113, false, true, true);
                class235.field3869 = class149.method1107(1, (byte) 113, false, true, true);
                class144.field2401 = class149.method1107(2, (byte) 113, true, false, true);
                class183.field2955 = class149.method1107(3, (byte) 113, false, true, true);
                class87.field1422 = class149.method1107(4, (byte) 113, false, true, true);
                class174.field2883 = class149.method1107(5, (byte) 113, true, true, true);
                class143.field2379 = class149.method1107(6, (byte) 113, true, true, false);
                class97.field1675 = class149.method1107(7, (byte) 113, false, true, true);
                class220.field3707 = class149.method1107(8, (byte) 113, false, true, true);
                class115.field1955 = class149.method1107(9, (byte) 113, false, true, true);
                class74.field1229 = class149.method1107(10, (byte) 113, false, true, true);
                class285.field4895 = class149.method1107(11, (byte) 113, false, true, true);
                class315.field5348 = class149.method1107(12, (byte) 113, false, true, true);
                class167.field2814 = class149.method1107(13, (byte) 113, false, true, true);
                class282.field4856 = class149.method1107(14, (byte) 113, false, true, false);
                class251.field4230 = class149.method1107(15, (byte) 113, false, true, true);
                class137.field2300 = class149.method1107(16, (byte) 113, false, true, true);
                class296.field5070 = class149.method1107(17, (byte) 113, false, true, true);
                class116.field1974 = class149.method1107(18, (byte) 113, false, true, true);
                class206.field3546 = class149.method1107(19, (byte) 113, false, true, true);
                class185.field2989 = class149.method1107(20, (byte) 113, false, true, true);
                class101.field1712 = class149.method1107(21, (byte) 113, false, true, true);
                class32.field524 = class149.method1107(22, (byte) 113, false, true, true);
                class159.field2686 = class149.method1107(23, (byte) 113, true, true, true);
                class210.field3586 = class149.method1107(24, (byte) 113, false, true, true);
                class238.field3965 = class149.method1107(25, (byte) 113, false, true, true);
                class181.field2921 = class149.method1107(26, (byte) 113, true, true, true);
                class20.field325 = 40;
                class148.field2508 = class6.field90;
                class145.field2456 = 15;
            } else {
                class145.field2456 = 12;
                class148.field2508 = class314.field5332;
            }
        } else if (class20.field325 == 40) {
            int var6 = 0;
            for (int var7 = 0; var7 < 27; var7++) {
                var6 += class187.field3024[var7].method105((byte) 115) * class264.field4471[var7] / 100;
            }
            if (var6 == 100) {
                class148.field2508 = class249.field4178;
                class145.field2456 = 20;
                class25.method139(class220.field3707, false);
                class297.method2090(0, class220.field3707);
                class149.method1104(class220.field3707, (byte) 89);
                class20.field325 = 45;
            } else {
                if (var6 != 0) {
                    class148.field2508 = class3.method14(new class255[] { class196.field3241, class215.method1532(var6, !arg0), class116.field1969 }, (byte) -51);
                }
                class145.field2456 = 20;
            }
        } else if (class20.field325 == 45) {
            class130.method962(11034, class150.field2546, 22050, 2);
            class17.field256 = new class90();
            class17.field256.method678(9, (byte) 91, 128);
            class195.field3208 = class151.method1118(class221.field3728, 0, 117, class240.field3999, 22050);
            class195.field3208.method1031(class17.field256, true);
            class254.method1736(class87.field1422, 0, class17.field256, class282.field4856, class251.field4230);
            class250.field4219 = class151.method1118(class221.field3728, 1, 70, class240.field3999, 2048);
            class230.field3813 = new class204();
            class250.field4219.method1031(class230.field3813, true);
            class32.field517 = new class82(22050, class92.field1584);
            class238.field3959 = class143.field2379.method619(class3.field49, 20053);
            class148.field2508 = class54.field849;
            class145.field2456 = 30;
            class20.field325 = 50;
        } else if (class20.field325 == 50) {
            int var8 = class206.method1491(class167.field2814, class220.field3707, -90);
            int var9 = class96.method753((byte) 126);
            if (var9 <= var8) {
                class148.field2508 = class59.field908;
                class145.field2456 = 35;
                class20.field325 = 60;
            } else {
                class148.field2508 = class3.method14(new class255[] { class165.field2786, class215.method1532(var8 * 100 / var9, true), class116.field1969 }, (byte) -98);
                class145.field2456 = 35;
            }
        } else if (class20.field325 == 60) {
            int var10 = class79.method546(class220.field3707, (byte) -103);
            int var11 = class215.method1537(-91);
            if (var11 > var10) {
                class148.field2508 = class3.method14(new class255[] { class136.field2258, class215.method1532(var10 * 100 / var11, true), class116.field1969 }, (byte) -112);
                class145.field2456 = 40;
            } else {
                class20.field325 = 65;
                class148.field2508 = field4028;
                class145.field2456 = 40;
            }
        } else if (class20.field325 == 65) {
            class103.method792(class220.field3707, -11933, class167.field2814);
            class145.field2456 = 45;
            class148.field2508 = class288.field4954;
            class256.method1798(-88, 5);
            class20.field325 = 70;
        } else if (class20.field325 == 70) {
            class144.field2401.method642(71);
            byte var12 = 0;
            int var13 = var12 + class144.field2401.method639(0);
            class137.field2300.method642(67);
            int var14 = var13 + class137.field2300.method639(0);
            class296.field5070.method642(89);
            int var15 = var14 + class296.field5070.method639(0);
            class116.field1974.method642(121);
            int var16 = var15 + class116.field1974.method639(0);
            class206.field3546.method642(75);
            int var17 = var16 + class206.field3546.method639(0);
            class185.field2989.method642(86);
            int var18 = var17 + class185.field2989.method639(0);
            class101.field1712.method642(84);
            int var19 = var18 + class101.field1712.method639(0);
            class32.field524.method642(79);
            int var20 = var19 + class32.field524.method639(0);
            class210.field3586.method642(93);
            int var21 = var20 + class210.field3586.method639(0);
            class238.field3965.method642(64);
            int var22 = var21 + class238.field3965.method639(0);
            if (var22 >= 1000) {
                class293.method2070(class144.field2401, 0);
                class13.method65((byte) -126, class144.field2401);
                class308.method2140(class144.field2401, 1376312589);
                class130.method961(class97.field1675, -15268, class144.field2401);
                class162.method1166(false, true, class97.field1675, class137.field2300);
                class195.method1394(class116.field1974, 1, class97.field1675);
                class293.method2069(true, class276.field4735, class97.field1675, class206.field3546, false);
                class80.method551(14512, class144.field2401);
                class111.method847(20674, class235.field3869, class46.field695, class185.field2989);
                class308.method2141(class97.field1675, -128, class101.field1712);
                class148.method1098(14872, class32.field524);
                class174.method1233(class144.field2401, (byte) 85);
                class223.method1565(class97.field1675, (byte) 108, class220.field3707, class167.field2814, class183.field2955);
                class172.method1226(class144.field2401, -47);
                class109.method843(2, class296.field5070);
                class244.method1692(class238.field3965, (byte) -105, new class125(), class210.field3586);
                class92.method690(class238.field3965, 1, class210.field3586);
                class145.field2456 = 50;
                class148.field2508 = class50.field748;
                class129.method954(true);
                class20.field325 = 80;
            } else {
                class148.field2508 = class3.method14(new class255[] { class191.field3050, class215.method1532(var22 / 10, true), class116.field1969 }, (byte) -61);
                class145.field2456 = 50;
            }
        } else if (class20.field325 == 80) {
            int var23 = class209.method1506(class220.field3707, (byte) 104);
            int var24 = class113.method862(-32263);
            if (var24 > var23) {
                class148.field2508 = class3.method14(new class255[] { class111.field1861, class215.method1532(var23 * 100 / var24, true), class116.field1969 }, (byte) -56);
                class145.field2456 = 60;
            } else {
                class20.method113(class220.field3707, -12777);
                class20.field325 = 90;
                class148.field2508 = class104.field1748;
                class145.field2456 = 60;
            }
        } else if (class20.field325 != 90) {
            if (arg0) {
                this.method1666(-40);
            }
            if (class20.field325 == 100) {
                if (class7.method39((byte) 96, class220.field3707)) {
                    class20.field325 = 110;
                }
            } else if (class20.field325 == 110) {
                class230.field3810 = new class256();
                class221.field3728.method241(8851, 10, class230.field3810);
                class145.field2456 = 75;
                class20.field325 = 120;
                class148.field2508 = class289.field4973;
            } else if (class20.field325 == 120) {
                if (class74.field1229.method612(class49.field728, -209, class67.field1002)) {
                    class34 var26 = new class34(class74.field1229.method641((byte) 126, class49.field728, class67.field1002));
                    class239.method1649(104, var26);
                    class148.field2508 = class293.field5027;
                    class145.field2456 = 80;
                    class20.field325 = 130;
                } else {
                    class148.field2508 = class3.method14(new class255[] { class158.field2672, class136.field2266 }, (byte) -92);
                    class145.field2456 = 80;
                }
            } else if (class20.field325 == 130) {
                if (!class183.field2955.method642(68)) {
                    class148.field2508 = class3.method14(new class255[] { class107.field1803, class215.method1532(class183.field2955.method639(0) * 3 / 4, true), class116.field1969 }, (byte) -85);
                    class145.field2456 = 85;
                } else if (!class315.field5348.method642(91)) {
                    class148.field2508 = class3.method14(new class255[] { class107.field1803, class215.method1532(class315.field5348.method639(0) / 10 + 75, true), class116.field1969 }, (byte) -116);
                    class145.field2456 = 85;
                } else if (!class167.field2814.method642(111)) {
                    class148.field2508 = class3.method14(new class255[] { class107.field1803, class215.method1532(class167.field2814.method639(0) / 20 + 85, !arg0), class116.field1969 }, (byte) -96);
                    class145.field2456 = 85;
                } else if (class159.field2686.method629(class92.field1582, 19531)) {
                    class229.method1586(class252.field4245, class172.field2847, class15.field220, class115.field1954, (byte) -107, class159.field2686, class271.field4681);
                    class20.field325 = 135;
                    class148.field2508 = class2.field32;
                    class145.field2456 = 95;
                } else {
                    class148.field2508 = class3.method14(new class255[] { class107.field1803, class215.method1532(class159.field2686.method621(class92.field1582, (byte) -71) / 10 + 90, true), class116.field1969 }, (byte) -113);
                    class145.field2456 = 85;
                }
            } else if (class20.field325 == 135) {
                if (class76.method538((byte) 127)) {
                    class145.field2456 = 96;
                    class20.field325 = 140;
                    class148.field2508 = class16.field229;
                } else {
                    class145.field2456 = 95;
                    class148.field2508 = class1.field26;
                }
            } else if (class20.field325 == 140) {
                class252.field4243 = class183.field2955.method619(class206.field3543, 20053);
                class174.field2883.method632(-2, true, false);
                class143.field2379.method632(-2, true, true);
                class220.field3707.method632(-2, true, true);
                class167.field2814.method632(-2, true, true);
                class74.field1229.method632(-2, true, true);
                class183.field2955.method632(-2, true, true);
                class20.field325 = 150;
                class145.field2456 = 97;
                class148.field2508 = class247.field4145;
                class261.field4424 = true;
            } else if (class20.field325 == 150) {
                class86.method598();
                if (class63.field959) {
                    class289.field4979 = 0;
                }
                class63.field959 = true;
                class174.method1235(100, class221.field3728);
                class149.method1105(false, -1, -1, false, class289.field4979);
                class20.field325 = 160;
                class148.field2508 = class274.field4719;
                class145.field2456 = 100;
            } else if (class20.field325 == 160) {
                class199.method1428(true, 31);
            }
        } else if (class181.field2921.method642(94)) {
            class132 var25 = new class132(class115.field1955, class181.field2921, class220.field3707, 20, !class298.field5094);
            class283.method2007(var25);
            if (class79.field1291 == 1) {
                class283.method2008(0.9F);
            }
            if (class79.field1291 == 2) {
                class283.method2008(0.8F);
            }
            if (class79.field1291 == 3) {
                class283.method2008(0.7F);
            }
            if (class79.field1291 == 4) {
                class283.method2008(0.6F);
            }
            class148.field2508 = class113.field1905;
            class145.field2456 = 70;
            class20.field325 = 100;
        } else {
            class148.field2508 = class3.method14(new class255[] { class18.field267, class215.method1532(class181.field2921.method639(0), true), class116.field1969 }, (byte) -125);
            class145.field2456 = 70;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 539)
    public final void method1666(int arg0) {
        field4032++;
        if (class18.field281 == 1000) {
            return;
        }
        class277.field4768++;
        if (arg0 <= 72) {
            return;
        }
        if ((class277.field4768 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class147.field2496 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class49.field732.setSeed((long) class147.field2496);
        }
        this.method1678(-15);
        if (class268.field4594 != null) {
            class268.field4594.method2057(66);
        }
        class242.method1682((byte) 109);
        class118.method885(true);
        class206.method1495((byte) -119);
        class128.method947(-76);
        if (class281.field4827) {
            class139.method1040();
        }
        if (class69.field1036 != null) {
            int var3 = class69.field1036.method698((byte) -47);
            class19.field320 = var3;
        }
        if (class18.field281 == 0) {
            this.method1665(false);
            class68.method414((byte) -82);
        } else if (class18.field281 == 5) {
            this.method1665(false);
            class68.method414((byte) -107);
        } else if (class18.field281 == 25 || class18.field281 == 28) {
            class239.method1654(22121);
        }
        if (class18.field281 == 10) {
            this.method1679(150);
            class18.method100(-2);
            class145.method1079(2);
            class305.method2116(-10758);
        } else if (class18.field281 == 30) {
            class3.method19(-60);
        } else if (class18.field281 == 40) {
            class305.method2116(-10758);
            if (class284.field4886 != -3) {
                if (class284.field4886 == 15) {
                    class265.method1847(true);
                } else if (class284.field4886 != 2) {
                    class199.method1428(true, 127);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 637)
    private final void method1667(int arg0) {
        field4023++;
        if (class297.field5078.field2253 >= 4) {
            this.method2039(false, "js5crc");
            class18.field281 = 1000;
            return;
        }
        if (class297.field5078.field2255 >= 4) {
            if (class18.field281 == 0 || class18.field281 == 5) {
                this.method2039(false, "js5io");
                class18.field281 = 1000;
                return;
            }
            class297.field5078.field2255 = 3;
            class145.field2427 = 3000;
        }
        if (arg0 < 66 || (class145.field2427--) > 0) {
            return;
        }
        try {
            if (class192.field3062 == 0) {
                class116.field1973 = class221.field3728.method237(0, class294.field5051, class248.field4153);
                class192.field3062++;
            }
            if (class192.field3062 == 1) {
                if (class116.field1973.field2833 == 2) {
                    this.method1664(0, -1);
                    return;
                }
                if (class116.field1973.field2833 == 1) {
                    class192.field3062++;
                }
            }
            if (class192.field3062 == 2) {
                class107.field1809 = new class239((Socket) class116.field1973.field2832, class221.field3728);
                class70 var2 = new class70(5);
                var2.method463(false, 15);
                var2.method436(515, -18820);
                class107.field1809.method1653(0, var2.field1066, (byte) 47, 5);
                class192.field3062++;
                class97.field1681 = class218.method1541(58);
            }
            if (class192.field3062 == 3) {
                if (class18.field281 == 0 || class18.field281 == 5 || class107.field1809.method1652(-13301) > 0) {
                    int var3 = class107.field1809.method1655(28982);
                    if (var3 != 0) {
                        this.method1664(0, var3);
                        return;
                    }
                    class192.field3062++;
                } else if (class218.method1541(64) - class97.field1681 > 30000L) {
                    this.method1664(0, -2);
                    return;
                }
            }
            if (class192.field3062 == 4) {
                boolean var4 = class18.field281 == 5 || class18.field281 == 10 || class18.field281 == 28;
                class297.field5078.method1011(class107.field1809, !var4, -110);
                class116.field1973 = null;
                class192.field3062 = 0;
                class294.field5057 = 0;
                class107.field1809 = null;
            }
        } catch (IOException var6) {
            this.method1664(0, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 759)
    public static void method1668(int arg0) {
        field4038 = (boolean[][]) null;
        field4041 = null;
        field4029 = null;
        field4028 = null;
        int var1 = -18 / ((arg0 + 54) / 40);
        field4034 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltl;IIIIIII)V", line = 793)
    public static final void method1669(class197[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class197 var9 = arg0[var8];
            if (var9 != null && var9.field3353 == arg1 && (!var9.field3365 || var9.field3281 == 0 || var9.field3272 || method1673(var9) != 0 || class30.field493 == var9 || var9.field3392 == 1338) && (!var9.field3365 || !method1674(var9))) {
                int var10 = var9.field3332 + arg6;
                int var11 = var9.field3305 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3281 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3294 + var10;
                    int var17 = var9.field3253 + var11;
                    if (var9.field3281 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class300.field5110 == var9) {
                    class160.field2698 = true;
                    class201.field3478 = var10;
                    class47.field719 = var11;
                }
                if (!var9.field3365 || var12 < var14 && var13 < var15) {
                    if (var9.field3281 == 0) {
                        if (!var9.field3365 && method1674(var9) && class56.field874 != var9) {
                            continue;
                        }
                        if (var9.field3344 && class2.field31 >= var12 && class67.field994 >= var13 && class2.field31 < var14 && class67.field994 < var15) {
                            for (class26 var18 = (class26) class151.field2562.method1471((byte) -123); var18 != null; var18 = (class26) class151.field2562.method1475((byte) 83)) {
                                if (var18.field422) {
                                    var18.method1502((byte) -82);
                                }
                            }
                            if (class246.field4127 == 0) {
                                class300.field5110 = null;
                                class30.field493 = null;
                            }
                            class246.field4126 = false;
                            class162.field2730 = null;
                        }
                    }
                    if (var9.field3365) {
                        boolean var19;
                        if (class2.field31 >= var12 && class67.field994 >= var13 && class2.field31 < var14 && class67.field994 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class235.field3871 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class119.field1994 == 1 && class184.field2973 >= var12 && class115.field1953 >= var13 && class184.field2973 < var14 && class115.field1953 < var15) {
                            var21 = true;
                        }
                        if (class184.field2962 > 0 && var9.field3243 != null) {
                            for (int var22 = 0; var22 < var9.field3243.length; var22++) {
                                for (int var23 = 0; var23 < class184.field2962; var23++) {
                                    int var24 = var9.field3243[var22] & 0xFF;
                                    if (class75.field1242[var23] == var24) {
                                        if (var9.field3319 != null) {
                                            byte var25 = var9.field3319[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class128.field2114[86] || (var25 & 0x1) != 0 && !class128.field2114[82] || (var25 & 0x4) != 0 && !class128.field2114[81])) {
                                                continue;
                                            }
                                        }
                                        class309.method2146(var22 + 1, -6, class49.field728, -1, var9.field3256);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class123.method909(-61, var9, class184.field2973 - var10, class115.field1953 - var11);
                        }
                        if (class300.field5110 != null && class300.field5110 != var9 && var19 && class64.method390((byte) -64, method1673(var9))) {
                            class116.field1971 = var9;
                        }
                        if (class30.field493 == var9) {
                            class130.field2142 = true;
                            class156.field2658 = var10;
                            class50.field755 = var11;
                        }
                        if (var9.field3272 || var9.field3392 != 0) {
                            if (var19 && class19.field320 != 0 && var9.field3396 != null) {
                                class26 var26 = new class26();
                                var26.field422 = true;
                                var26.field424 = var9;
                                var26.field423 = class19.field320;
                                var26.field414 = var9.field3396;
                                class151.field2562.method1472(true, var26);
                            }
                            if (class300.field5110 != null || class51.field767 != null || class156.field2651 || var9.field3392 != 1400 && class246.field4126) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3392 != 0) {
                                if (var9.field3392 == 1337) {
                                    class288.field4961 = var9;
                                    class108.method834((byte) 49, var9);
                                    continue;
                                }
                                if (var9.field3392 == 1338) {
                                    if (var21) {
                                        class162.field2730 = var9;
                                        class237.field3946 = class184.field2973 - var10;
                                        class70.field1114 = class115.field1953 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3392 == 1400) {
                                    class285.field4900 = var9;
                                    if (var21) {
                                        if (class128.field2114[82] && class201.field3483 > 0) {
                                            int var27 = (int) ((double) (class184.field2973 - var10 - var9.field3294 / 2) * 2.0D / (double) class59.field905);
                                            int var28 = (int) ((double) (class115.field1953 - var11 - var9.field3253 / 2) * 2.0D / (double) class59.field905);
                                            int var29 = class85.field1369 + var27;
                                            int var30 = class149.field2520 + var28;
                                            int var31 = class225.field3768 + var29;
                                            int var32 = class41.field636 + class297.field5084 - var30 - 1;
                                            class68.method412(var32, 0, var31, 906);
                                            class121.method899(-121);
                                            continue;
                                        }
                                        class246.field4126 = true;
                                        class16.field232 = class2.field31;
                                        class197.field3255 = class67.field994;
                                        class147.field2493 = class85.field1369;
                                        class10.field144 = class149.field2520;
                                        continue;
                                    }
                                    if (var20 && class246.field4126) {
                                        class184.method1289((int) ((double) (class16.field232 - class2.field31) * 2.0D / (double) class97.field1683) + class147.field2493, (byte) -96);
                                        class106.method818((int) ((double) (class197.field3255 - class67.field994) * 2.0D / (double) class97.field1683) + class10.field144, (byte) -91);
                                        continue;
                                    }
                                    class246.field4126 = false;
                                    continue;
                                }
                                if (var9.field3392 == 1401) {
                                    if (var20) {
                                        class20.method115(-117, class2.field31 - var10, var9.field3253, var9.field3294, class67.field994 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field3392 == 1402) {
                                    if (!class281.field4827) {
                                        class108.method834((byte) 49, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field3277 && var21) {
                                var9.field3277 = true;
                                if (var9.field3318 != null) {
                                    class26 var33 = new class26();
                                    var33.field422 = true;
                                    var33.field424 = var9;
                                    var33.field420 = class184.field2973 - var10;
                                    var33.field423 = class115.field1953 - var11;
                                    var33.field414 = var9.field3318;
                                    class151.field2562.method1472(true, var33);
                                }
                            }
                            if (var9.field3277 && var20 && var9.field3302 != null) {
                                class26 var34 = new class26();
                                var34.field422 = true;
                                var34.field424 = var9;
                                var34.field420 = class2.field31 - var10;
                                var34.field423 = class67.field994 - var11;
                                var34.field414 = var9.field3302;
                                class151.field2562.method1472(true, var34);
                            }
                            if (var9.field3277 && !var20) {
                                var9.field3277 = false;
                                if (var9.field3411 != null) {
                                    class26 var35 = new class26();
                                    var35.field422 = true;
                                    var35.field424 = var9;
                                    var35.field420 = class2.field31 - var10;
                                    var35.field423 = class67.field994 - var11;
                                    var35.field414 = var9.field3411;
                                    class301.field5181.method1472(true, var35);
                                }
                            }
                            if (var20 && var9.field3308 != null) {
                                class26 var36 = new class26();
                                var36.field422 = true;
                                var36.field424 = var9;
                                var36.field420 = class2.field31 - var10;
                                var36.field423 = class67.field994 - var11;
                                var36.field414 = var9.field3308;
                                class151.field2562.method1472(true, var36);
                            }
                            if (!var9.field3347 && var19) {
                                var9.field3347 = true;
                                if (var9.field3270 != null) {
                                    class26 var37 = new class26();
                                    var37.field422 = true;
                                    var37.field424 = var9;
                                    var37.field420 = class2.field31 - var10;
                                    var37.field423 = class67.field994 - var11;
                                    var37.field414 = var9.field3270;
                                    class151.field2562.method1472(true, var37);
                                }
                            }
                            if (var9.field3347 && var19 && var9.field3380 != null) {
                                class26 var38 = new class26();
                                var38.field422 = true;
                                var38.field424 = var9;
                                var38.field420 = class2.field31 - var10;
                                var38.field423 = class67.field994 - var11;
                                var38.field414 = var9.field3380;
                                class151.field2562.method1472(true, var38);
                            }
                            if (var9.field3347 && !var19) {
                                var9.field3347 = false;
                                if (var9.field3401 != null) {
                                    class26 var39 = new class26();
                                    var39.field422 = true;
                                    var39.field424 = var9;
                                    var39.field420 = class2.field31 - var10;
                                    var39.field423 = class67.field994 - var11;
                                    var39.field414 = var9.field3401;
                                    class301.field5181.method1472(true, var39);
                                }
                            }
                            if (var9.field3406 != null) {
                                class26 var40 = new class26();
                                var40.field424 = var9;
                                var40.field414 = var9.field3406;
                                class56.field872.method1472(true, var40);
                            }
                            if (var9.field3366 != null && class127.field2101 > var9.field3413) {
                                if (var9.field3287 == null || class127.field2101 - var9.field3413 > 32) {
                                    class26 var45 = new class26();
                                    var45.field424 = var9;
                                    var45.field414 = var9.field3366;
                                    class151.field2562.method1472(true, var45);
                                } else {
                                    label548: for (int var41 = var9.field3413; var41 < class127.field2101; var41++) {
                                        int var42 = class10.field149[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field3287.length; var43++) {
                                            if (var9.field3287[var43] == var42) {
                                                class26 var44 = new class26();
                                                var44.field424 = var9;
                                                var44.field414 = var9.field3366;
                                                class151.field2562.method1472(true, var44);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field3413 = class127.field2101;
                            }
                            if (var9.field3295 != null && class156.field2659 > var9.field3264) {
                                if (var9.field3409 == null || class156.field2659 - var9.field3264 > 32) {
                                    class26 var50 = new class26();
                                    var50.field424 = var9;
                                    var50.field414 = var9.field3295;
                                    class151.field2562.method1472(true, var50);
                                } else {
                                    label524: for (int var46 = var9.field3264; var46 < class156.field2659; var46++) {
                                        int var47 = class184.field2967[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field3409.length; var48++) {
                                            if (var9.field3409[var48] == var47) {
                                                class26 var49 = new class26();
                                                var49.field424 = var9;
                                                var49.field414 = var9.field3295;
                                                class151.field2562.method1472(true, var49);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field3264 = class156.field2659;
                            }
                            if (var9.field3349 != null && class262.field4441 > var9.field3404) {
                                if (var9.field3249 == null || class262.field4441 - var9.field3404 > 32) {
                                    class26 var55 = new class26();
                                    var55.field424 = var9;
                                    var55.field414 = var9.field3349;
                                    class151.field2562.method1472(true, var55);
                                } else {
                                    label500: for (int var51 = var9.field3404; var51 < class262.field4441; var51++) {
                                        int var52 = class68.field1018[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field3249.length; var53++) {
                                            if (var9.field3249[var53] == var52) {
                                                class26 var54 = new class26();
                                                var54.field424 = var9;
                                                var54.field414 = var9.field3349;
                                                class151.field2562.method1472(true, var54);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field3404 = class262.field4441;
                            }
                            if (var9.field3376 != null && class274.field4714 > var9.field3284) {
                                if (var9.field3304 == null || class274.field4714 - var9.field3284 > 32) {
                                    class26 var60 = new class26();
                                    var60.field424 = var9;
                                    var60.field414 = var9.field3376;
                                    class151.field2562.method1472(true, var60);
                                } else {
                                    label476: for (int var56 = var9.field3284; var56 < class274.field4714; var56++) {
                                        int var57 = class113.field1917[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field3304.length; var58++) {
                                            if (var9.field3304[var58] == var57) {
                                                class26 var59 = new class26();
                                                var59.field424 = var9;
                                                var59.field414 = var9.field3376;
                                                class151.field2562.method1472(true, var59);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field3284 = class274.field4714;
                            }
                            if (var9.field3346 != null && class149.field2526 > var9.field3356) {
                                if (var9.field3245 == null || class149.field2526 - var9.field3356 > 32) {
                                    class26 var65 = new class26();
                                    var65.field424 = var9;
                                    var65.field414 = var9.field3346;
                                    class151.field2562.method1472(true, var65);
                                } else {
                                    label452: for (int var61 = var9.field3356; var61 < class149.field2526; var61++) {
                                        int var62 = class187.field3029[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field3245.length; var63++) {
                                            if (var9.field3245[var63] == var62) {
                                                class26 var64 = new class26();
                                                var64.field424 = var9;
                                                var64.field414 = var9.field3346;
                                                class151.field2562.method1472(true, var64);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field3356 = class149.field2526;
                            }
                            if (class201.field3482 > var9.field3387 && var9.field3372 != null) {
                                class26 var66 = new class26();
                                var66.field424 = var9;
                                var66.field414 = var9.field3372;
                                class151.field2562.method1472(true, var66);
                            }
                            if (class251.field4224 > var9.field3387 && var9.field3313 != null) {
                                class26 var67 = new class26();
                                var67.field424 = var9;
                                var67.field414 = var9.field3313;
                                class151.field2562.method1472(true, var67);
                            }
                            if (class111.field1867 > var9.field3387 && var9.field3260 != null) {
                                class26 var68 = new class26();
                                var68.field424 = var9;
                                var68.field414 = var9.field3260;
                                class151.field2562.method1472(true, var68);
                            }
                            if (class173.field2855 > var9.field3387 && var9.field3375 != null) {
                                class26 var69 = new class26();
                                var69.field424 = var9;
                                var69.field414 = var9.field3375;
                                class151.field2562.method1472(true, var69);
                            }
                            if (class163.field2750 > var9.field3387 && var9.field3296 != null) {
                                class26 var70 = new class26();
                                var70.field424 = var9;
                                var70.field414 = var9.field3296;
                                class151.field2562.method1472(true, var70);
                            }
                            var9.field3387 = class251.field4240;
                            if (var9.field3370 != null) {
                                for (int var71 = 0; var71 < class184.field2962; var71++) {
                                    class26 var72 = new class26();
                                    var72.field424 = var9;
                                    var72.field417 = class75.field1242[var71];
                                    var72.field415 = class265.field4477[var71];
                                    var72.field414 = var9.field3370;
                                    class151.field2562.method1472(true, var72);
                                }
                            }
                            if (class249.field4167 && var9.field3361 != null) {
                                class26 var73 = new class26();
                                var73.field424 = var9;
                                var73.field414 = var9.field3361;
                                class151.field2562.method1472(true, var73);
                            }
                        }
                    }
                    if (!var9.field3365 && class300.field5110 == null && class51.field767 == null && !class156.field2651) {
                        if ((var9.field3389 >= 0 || var9.field3390 != 0) && class2.field31 >= var12 && class67.field994 >= var13 && class2.field31 < var14 && class67.field994 < var15) {
                            if (var9.field3389 >= 0) {
                                class56.field874 = arg0[var9.field3389];
                            } else {
                                class56.field874 = var9;
                            }
                        }
                        if (var9.field3281 == 8 && class2.field31 >= var12 && class67.field994 >= var13 && class2.field31 < var14 && class67.field994 < var15) {
                            class264.field4472 = var9;
                        }
                        if (var9.field3384 > var9.field3253) {
                            class74.method531(var9.field3294 + var10, var11, class2.field31, var9, 120, var9.field3384, class67.field994, var9.field3253);
                        }
                    }
                    if (var9.field3281 == 0) {
                        method1669(arg0, var9.field3256, var12, var13, var14, var15, var10 - var9.field3371, var11 - var9.field3310);
                        if (var9.field3359 != null) {
                            method1669(var9.field3359, var9.field3256, var12, var13, var14, var15, var10 - var9.field3371, var11 - var9.field3310);
                        }
                        class155 var74 = (class155) class158.field2675.method280((long) var9.field3256, 29153);
                        if (var74 != null) {
                            class84.method590(var74.field2637, var10, var11, var14, false, var12, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1542)
    public final void method1670(int arg0) {
        field4025++;
        method1668(-97);
        class255.method1747(23949);
        class92.method689((byte) -97);
        class91.method687(true);
        class54.method336(2);
        class287.method2031(false);
        class281.method1979();
        class303.method2114(arg0 - 1155027582);
        class240.method1659(121);
        class256.method1792(arg0 - 2962);
        class190.method1311((byte) 110);
        class70.method445((byte) 99);
        class239.method1656(-3917);
        class135.method1014(arg0 ^ 0xFFFFF329);
        class154.method1136((byte) -57);
        class291.method2063(-13053);
        class18.method93(arg0 - 2784);
        class88.method620(0);
        class307.method2139((byte) 112);
        class131.method971((byte) -123);
        class81.method560((byte) 0);
        class186.method1300(true);
        class212.method1519((byte) 0);
        class163.method1179(-7155);
        class197.method1412(21679);
        class248.method1708((byte) 71);
        class242.method1686(0);
        class203.method1476(64);
        class47.method281((byte) -104);
        class93.method697(arg0 + 12578);
        class251.method1722(3);
        class269.method1871((byte) 104);
        class90.method668(32);
        class137.method1028(0);
        class82.method565((byte) 91);
        class310.method2150(-4748);
        class271.method1889(-90);
        class301.method2103(false);
        class249.method1716(2);
        class294.method2077(-7182);
        class236.method1629(110);
        class155.method1145(false);
        class208.method1498(-107);
        class274.method1925(-1);
        class150.method1114((byte) 109);
        class121.method897(-80);
        class258.method1800((byte) 70);
        class168.method1220(arg0 + 12465);
        class43.method262(0);
        class22.method125((byte) -124);
        class16.method81(-1412584499);
        class37.method220((byte) 81);
        class151.method1116(arg0 + 28962);
        class46.method273(-2);
        class145.method1087((byte) -21);
        class223.method1563(2013);
        class118.method884((byte) -118);
        class272.method1897();
        class58.method352((byte) -35);
        class200.method1447();
        class209.method1503((byte) -124);
        class193.method1362();
        class192.method1321(true);
        class267.method1866();
        class97.method764(2);
        class231.method1600(-125);
        class218.method1543(29808);
        class148.method1099(-99165208);
        class17.method89((byte) 27);
        class139.method1039();
        class315.method2175((byte) 63);
        class111.method851(false);
        class198.method1427(false);
        class71.method512();
        class123.method910(arg0 + 12578);
        class109.method842(4);
        class105.method810();
        class60.method371(false);
        class106.method821((byte) 6);
        class120.method890((byte) -118);
        class228.method1581();
        class164.method1203();
        class1.method4(768);
        class55.method346(-106);
        class112.method853((byte) 71);
        class222.method1559(123);
        class9.method50((byte) -125);
        class175.method1245();
        class245.method1693(49);
        class78.method543(true);
        class149.method1108(34);
        class285.method2026(100);
        class13.method62(-78);
        class289.method2045(arg0 ^ 0xFFFFA84F);
        class127.method941((byte) -108);
        class277.method1940((byte) -105);
        class96.method749(0);
        class107.method824((byte) -72);
        class295.method2079(false);
        class116.method880((byte) 55);
        class42.method258(-31239);
        class87.method608(1);
        class246.method1700(-58);
        class102.method788(true);
        class264.method1837(arg0 + 12550);
        class51.method305((byte) 118);
        class229.method1587((byte) 123);
        class125.method924(-124);
        class69.method420(-57);
        class132.method977(arg0 ^ 0xFFFFCECB);
        class14.method70(-74628703);
        class183.method1281(-15);
        class283.method2014();
        class34.method192((byte) -96);
        class133.method996(true);
        class195.method1398(-515504848);
        class44.method267(101);
        class238.method1646(0);
        class86.method600();
        class235.method1626((byte) -119);
        class11.method55(arg0 + 4725);
        class288.method2042(arg0 ^ 0xFFFFADD6);
        class26.method143((byte) -99);
        class177.method1262((byte) -51);
        class181.method1272((byte) 71);
        class142.method1059();
        class250.method1719((byte) 124);
        class253.method1730((byte) -14);
        class216.method1538(false);
        class213.method1527((byte) 105);
        class304.method2115(false);
        class293.method2072((byte) 127);
        class84.method588(1);
        class243.method1689();
        class237.method1641(arg0 ^ 0xFFFFCE90);
        class254.method1734((byte) -55);
        class41.method255((byte) 93);
        class57.method351();
        class32.method183(true);
        class35.method199();
        class270.method1877();
        class215.method1533((byte) 78);
        class191.method1314(false);
        class15.method75((byte) -121);
        class53.method320(15731);
        class262.method1824((byte) 119);
        class152.method1120((byte) -121);
        class305.method2121(-25);
        class313.method2162(true);
        class100.method781((byte) 60);
        class39.method230();
        class276.method1934(-1);
        class126.method931();
        class56.method348(arg0 ^ 0xFFFFADAA);
        class10.method53(false);
        class30.method173(false);
        class128.method951((byte) 3);
        class244.method1690(0);
        class172.method1227(-81);
        class173.method1228(116);
        class72.method515(100);
        class59.method361(-117);
        class184.method1290(92);
        class50.method294(arg0 + 12579);
        class101.method787(arg0 ^ 0xFFFFCE94);
        class157.method1153((byte) -121);
        class296.method2085(arg0 ^ 0xFFFFCEDC);
        class74.method534((byte) 39);
        class266.method1852(arg0 + 12578);
        class153.method1122((byte) 106);
        class147.method1094((byte) -116);
        class205.method1487(-1);
        class156.method1150(5);
        class141.method1049((byte) -106);
        class233.method1614();
        class268.method1869(256);
        class2.method11(arg0 ^ 0xFFFFCEA7);
        class144.method1069(125);
        class225.method1571((byte) 36);
        class259.method1803(arg0 + 12583);
        class167.method1214((byte) -70);
        class219.method1546();
        class302.method2108();
        class207.method1497();
        class199.method1430(0);
        class284.method2020(0);
        class25.method141(0);
        class52.method311();
        class27.method150();
        class114.method864(1638);
        class252.method1728((byte) 38);
        class261.method1821((byte) -126);
        class95.method745(arg0 ^ 0x3144);
        class6.method33(10461);
        class122.method908(arg0 ^ arg0);
        class165.method1209(64);
        class4.method24(true);
        class282.method1993((byte) -87);
        class24.method137(true);
        class211.method1510(false);
        class275.method1931((byte) 112);
        class280.method1948(arg0 + 12706);
        class75.method535(83);
        class247.method1706(15448);
        class138.method1035();
        class182.method1279();
        class314.method2172((byte) -124);
        class196.method1404(false);
        class300.method2095(-29);
        class201.method1461(-128);
        class217.method1540((byte) -97);
        class85.method593(-113);
        class77.method540((byte) -121);
        class80.method552((byte) -104);
        class3.method12(-1979359896);
        class162.method1167(1697479500);
        class158.method1156((byte) -90);
        class104.method797(3);
        class166.method1212((byte) -95);
        class20.method114((byte) -20);
        class38.method227(false);
        class265.method1846(326807948);
        class19.method108(0);
        class174.method1232(-1);
        class115.method875(-108);
        class292.method2068(arg0 ^ 0x314D);
        class232.method1608((byte) -84);
        class187.method1303(-18951);
        class297.method2086(true);
        class76.method539(true);
        class206.method1492((byte) -92);
        class63.method383(102);
        class230.method1597(false);
        class185.method1292(arg0 - 1253589052);
        class309.method2145(103);
        class124.method916((byte) -126);
        class220.method1548((byte) -103);
        class49.method292((byte) 58);
        class119.method887(0);
        class143.method1066((byte) -3);
        class241.method1662(-11773);
        class108.method830((byte) 53);
        class64.method391((byte) -114);
        class279.method1941((byte) -55);
        class210.method1509(arg0 + 16767778);
        class68.method413(80);
        class7.method38(true);
        class221.method1552((byte) 126);
        class136.method1018(arg0 ^ 0xFFFFCE9E);
        class23.method126((byte) 119);
        class159.method1157(24987);
        class298.method2093((byte) 78);
        class130.method963(-21863);
        class67.method410((byte) -45);
        class129.method955(1);
        class260.method1811(arg0 - 11400);
        class113.method859((byte) 25);
        class160.method1164((byte) -115);
        class29.method166((byte) -14);
        class194.method1390((byte) -88);
        class33.method186(-1760702484);
        class73.method529(16777215);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltl;)Ltl;", line = 1813)
    public static final class197 method1671(class197 arg0) {
        int var1 = class295.method2081(method1673(arg0), 7);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class58.method353(arg0.field3353, (byte) 50);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1846)
    public static final void method1672(int arg0) {
        class149.field2522 = arg0;
        for (int var1 = 0; var1 < class29.field449; var1++) {
            for (int var2 = 0; var2 < class315.field5347; var2++) {
                if (class118.field1984[arg0][var1][var2] == null) {
                    class118.field1984[arg0][var1][var2] = new class249(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1903)
    public static final void main(String[] arg0) {
        field4036++;
        try {
            if (arg0.length != 4) {
                class167.method1218("argument count", 300);
            }
            class60.field919 = Integer.parseInt(arg0[0]);
            class53.field831 = 2;
            if (arg0[1].equals("live")) {
                class41.field639 = 0;
            } else if (arg0[1].equals("rc")) {
                class41.field639 = 1;
            } else if (arg0[1].equals("wip")) {
                class41.field639 = 2;
            } else {
                class167.method1218("modewhat", 300);
            }
            class22.field348 = false;
            int var1 = -1;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class70.method427(class33.method185(var2, var2.length, 0, false), false);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class166.field2791 = var1;
            } else if (arg0[2].equals("english")) {
                class166.field2791 = 0;
            } else if (arg0[2].equals("german")) {
                class166.field2791 = 1;
            } else {
                class167.method1218("language", 300);
            }
            class41.method254(class166.field2791, -6402);
            class55.field864 = false;
            class92.field1588 = false;
            if (arg0[3].equals("game0")) {
                class245.field4123 = 0;
            } else if (arg0[3].equals("game1")) {
                class245.field4123 = 1;
            } else {
                class167.method1218("game", 300);
            }
            field4022 = 0;
            class135.field2245 = class49.field728;
            class137.field2292 = false;
            client var4 = new client();
            class85.field1385 = var4;
            var4.method2038(27, 1, "runescape", 1024, class41.field639 + 32, 768, 515);
            class37.field561.setLocation(40, 40);
        } catch (Exception var7) {
            class195.method1393(var7, 0, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltl;)I", line = 1977)
    public static final int method1673(class197 arg0) {
        class172 var1 = (class172) class74.field1222.method280(((long) arg0.field3256 << 32) + (long) arg0.field3273, 29153);
        return var1 == null ? arg0.field3266 : var1.field2849;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltl;)Z", line = 1986)
    public static final boolean method1674(class197 arg0) {
        if (class198.field3421) {
            if (method1673(arg0) != 0) {
                return false;
            }
            if (arg0.field3281 == 0) {
                return false;
            }
        }
        return arg0.field3250;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 2015)
    public final void method1675(int arg0) {
        class288.method2041(arg0 + 30426);
        class37.field562 = new class154();
        if (arg0 != -30330) {
            return;
        }
        class297.field5078 = new class135();
        if (class41.field639 != 0) {
        }
        field4027++;
        class237.method1643(class221.field3728, arg0 ^ 0x762F);
        if (class53.field831 == 0) {
            class68.field1024 = this.getCodeBase().getHost();
            class18.field285 = 443;
            class24.field367 = 43594;
        } else if (class53.field831 == 1) {
            class68.field1024 = this.getCodeBase().getHost();
            class24.field367 = class60.field919 + 40000;
            class18.field285 = class60.field919 + 50000;
        } else if (class53.field831 == 2) {
            class18.field285 = class60.field919 + 50000;
            class24.field367 = class60.field919 + 40000;
            class68.field1024 = "127.0.0.1";
        }
        if (class245.field4123 == 1) {
            class272.field4691 = 16777215;
            class272.field4689 = 0;
            class125.field2078 = class76.field1245;
            class107.field1789 = class127.field2097;
            class30.field492 = class295.field5064;
            class154.field2631 = class221.field3729;
        } else {
            class154.field2631 = class291.field4992;
            class107.field1789 = class216.field3672;
            class125.field2078 = class258.field4386;
            class30.field492 = class246.field4132;
        }
        if (class40.field624 == 3 && class53.field831 != 2) {
            class25.field386 = class60.field919;
        }
        class185.field2976 = class24.field367;
        class294.field5051 = class185.field2976;
        class232.field3853 = class18.field285;
        class248.field4153 = class68.field1024;
        class155.field2650 = class24.field367;
        class150.field2544 = class177.field2900 = class150.field2553 = class251.field4226 = new short[256];
        class310.method2159((byte) 77);
        class127.method946(class240.field3999, (byte) -79);
        class120.method892(class240.field3999, false);
        class69.field1036 = class181.method1270(16);
        if (class69.field1036 != null) {
            class69.field1036.method695(class240.field3999, arg0 + 30450);
        }
        class314.field5323 = class40.field624;
        try {
            if (class221.field3728.field622 != null) {
                class87.field1410 = new class307(class221.field3728.field622, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class300.field5109[var2] = new class307(class221.field3728.field627[var2], 6000, 0);
                }
                class51.field775 = new class307(class221.field3728.field621, 6000, 0);
                class54.field838 = new class131(255, class87.field1410, class51.field775, 500000);
                class2.field28 = new class307(class221.field3728.field628, 24, 0);
                class221.field3728.field621 = null;
                class221.field3728.field622 = null;
                class221.field3728.field627 = null;
                class221.field3728.field628 = null;
            }
        } catch (IOException var4) {
            class2.field28 = null;
            class87.field1410 = null;
            class51.field775 = null;
            class54.field838 = null;
        }
        class217.field3679 = class58.field882;
        if (class53.field831 != 0) {
            class103.field1734 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 2126)
    public final void method1676(int arg0) {
        if (class281.field4827) {
            class281.method1982();
        }
        field4042++;
        if (class307.field5221 != null) {
            class3.method22(class221.field3728, class307.field5221, -50);
            class307.field5221 = null;
        }
        if (class221.field3728 != null) {
            class221.field3728.method249(this.getClass(), 6);
        }
        if (class230.field3810 != null) {
            class230.field3810.field4364 = false;
        }
        class230.field3810 = null;
        int var2 = 120 / ((arg0 + 18) / 61);
        if (field4041 != null) {
            field4041.method1650((byte) -105);
            field4041 = null;
        }
        class23.method127(66, class240.field3999);
        class248.method1711(0, class240.field3999);
        if (class69.field1036 != null) {
            class69.field1036.method693((byte) 90, class240.field3999);
        }
        class124.method921(false);
        class114.method868((byte) 82);
        class69.field1036 = null;
        if (class195.field3208 != null) {
            class195.field3208.method1034(256);
        }
        if (class250.field4219 != null) {
            class250.field4219.method1034(256);
        }
        class297.field5078.method1007((byte) 105);
        class37.field562.method1135(false);
        try {
            if (class87.field1410 != null) {
                class87.field1410.method2135(-1);
            }
            if (class300.field5109 != null) {
                for (int var3 = 0; var3 < class300.field5109.length; var3++) {
                    if (class300.field5109[var3] != null) {
                        class300.field5109[var3].method2135(-1);
                    }
                }
            }
            if (class51.field775 != null) {
                class51.field775.method2135(-1);
            }
            if (class2.field28 != null) {
                class2.field28.method2135(-1);
            }
        } catch (IOException var5) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 2206)
    public final void method1677(byte arg0) {
        field4026++;
        if (class18.field281 == 1000) {
            return;
        }
        boolean var2 = class122.method905(true);
        if (var2 && class148.field2505 && class195.field3208 != null) {
            class195.field3208.method1029(false);
        }
        if ((class18.field281 == 30 || class18.field281 == 10) && (class37.field570 || class19.field318 != 0L && class218.method1541(-80) > class19.field318)) {
            class149.method1105(false, class264.field4469, class9.field133, class37.field570, class261.method1820((byte) 115));
        }
        if (class307.field5221 == null) {
            Container var3;
            if (class307.field5221 != null) {
                var3 = class307.field5221;
            } else if (class37.field561 == null) {
                var3 = class221.field3728.field626;
            } else {
                var3 = class37.field561;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class37.field561 == var3) {
                Insets var6 = class37.field561.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class289.field4980 != var4 || class107.field1790 != var5) {
                if (class40.field619.startsWith("mac")) {
                    class107.field1790 = var5;
                    class289.field4980 = var4;
                } else {
                    class288.method2041(82);
                }
                class19.field318 = class218.method1541(75) + 500L;
            }
        }
        if (arg0 < 90) {
            return;
        }
        if (class307.field5221 != null && !class23.field353 && (class18.field281 == 30 || class18.field281 == 10)) {
            class149.method1105(false, -1, -1, false, class289.field4979);
        }
        boolean var7 = false;
        if (class17.field254) {
            var7 = true;
            class17.field254 = false;
        }
        if (var7) {
            class252.method1726((byte) 122);
        }
        if (class281.field4827) {
            for (int var8 = 0; var8 < 100; var8++) {
                class187.field3008[var8] = true;
            }
        }
        if (class18.field281 == 0) {
            class114.method870((Color) null, 0, class145.field2456, var7, class148.field2508);
        } else if (class18.field281 == 5) {
            class271.method1895(class277.field4761, (byte) -77, false);
        } else if (class18.field281 == 10) {
            class16.method78(0);
        } else if (class18.field281 == 25 || class18.field281 == 28) {
            if (class232.field3851 == 1) {
                if (class131.field2155 < class90.field1532) {
                    class131.field2155 = class90.field1532;
                }
                int var10 = (class131.field2155 - class90.field1532) * 50 / class131.field2155;
                class256.method1796(class3.method14(new class255[] { class241.field4009, class183.field2948, class215.method1532(var10, true), class136.field2264 }, (byte) -62), -8921, false);
            } else if (class232.field3851 == 2) {
                if (class242.field4082 > class235.field3873) {
                    class235.field3873 = class242.field4082;
                }
                int var9 = (class235.field3873 - class242.field4082) * 50 / class235.field3873 + 50;
                class256.method1796(class3.method14(new class255[] { class241.field4009, class183.field2948, class215.method1532(var9, true), class136.field2264 }, (byte) -111), -8921, false);
            } else {
                class256.method1796(class241.field4009, -8921, false);
            }
        } else if (class18.field281 == 30) {
            class50.method296(false);
        } else if (class18.field281 == 40) {
            class256.method1796(class3.method14(new class255[] { class289.field4971, class216.field3669, class240.field4008 }, (byte) -126), -8921, false);
        }
        if (class281.field4827 && class18.field281 != 0) {
            class281.method1973();
            for (int var17 = 0; var17 < class279.field4784; var17++) {
                class236.field3931[var17] = false;
            }
        } else if ((class18.field281 == 30 || class18.field281 == 10) && class239.field3995 == 0 && !var7) {
            try {
                Graphics var11 = class240.field3999.getGraphics();
                for (int var12 = 0; var12 < class279.field4784; var12++) {
                    if (class236.field3931[var12]) {
                        class69.field1033.method1128(class49.field745[var12], class271.field4679[var12], var11, class247.field4147[var12], class10.field146[var12], (byte) 62);
                        class236.field3931[var12] = false;
                    }
                }
            } catch (Exception var19) {
                class240.field3999.repaint();
            }
        } else if (class18.field281 != 0) {
            try {
                Graphics var14 = class240.field3999.getGraphics();
                class69.field1033.method1123(0, var14, (byte) 82, 0);
                for (int var15 = 0; var15 < class279.field4784; var15++) {
                    class236.field3931[var15] = false;
                }
            } catch (Exception var18) {
                class240.field3999.repaint();
            }
        }
        if (class261.field4424) {
            class259.method1805((byte) -43);
        }
        if (class63.field959 && class18.field281 == 10 && class264.field4459 != -1) {
            class63.field959 = false;
            class174.method1235(100, class221.field3728);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2429)
    public final void init() {
        field4033++;
        if (!this.method2034(1)) {
            return;
        }
        class60.field919 = Integer.parseInt(this.getParameter("worldid"));
        class53.field831 = Integer.parseInt(this.getParameter("modewhere"));
        if (class53.field831 < 0 || class53.field831 > 1) {
            class53.field831 = 0;
        }
        class41.field639 = Integer.parseInt(this.getParameter("modewhat"));
        if (class41.field639 < 0 || class41.field639 > 2) {
            class41.field639 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class22.field348 = true;
        } else {
            class22.field348 = false;
        }
        try {
            class166.field2791 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class166.field2791 = 0;
        }
        class41.method254(class166.field2791, -6402);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class92.field1588 = true;
        } else {
            class92.field1588 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class55.field864 = true;
        } else {
            class55.field864 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class245.field4123 = 1;
        } else {
            class245.field4123 = 0;
        }
        try {
            field4022 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            field4022 = 0;
        }
        class135.field2245 = class249.field4186.method1751(this, 0);
        if (class135.field2245 == null) {
            class135.field2245 = class49.field728;
        }
        String var7 = this.getParameter("haveie6");
        if (var7 != null && var7.equals("1")) {
            class137.field2292 = true;
        } else {
            class137.field2292 = false;
        }
        class85.field1385 = this;
        this.method2037(765, 503, class41.field639 + 32, 0, 515);
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2505)
    private final void method1678(int arg0) {
        field4024++;
        boolean var2 = class297.field5078.method1005(17636);
        if (arg0 == -15 && !var2) {
            this.method1667(103);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2540)
    private final void method1679(int arg0) {
        field4035++;
        for (class184.field2962 = 0; class181.method1275(arg0 + 20786) && class184.field2962 < 128; class184.field2962++) {
            class75.field1242[class184.field2962] = class216.field3671;
            class265.field4477[class184.field2962] = class13.field183;
        }
        class122.field2036++;
        if (class264.field4459 != -1) {
            class84.method590(class264.field4459, 0, 0, class210.field3589, false, 0, 0, class201.field3479);
        }
        class251.field4240++;
        if (class281.field4827) {
            int var2 = 19137023;
            label189: for (int var3 = 0; var3 < 32768; var3++) {
                class186 var4 = class82.field1334[var3];
                if (var4 != null) {
                    byte var5 = var4.field2996.field3914;
                    if ((var5 & 0x2) > 0 && var4.field5127 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field5125[0] = (var4.field5130 >> 7) + var6;
                            var4.field5154[0] = (var4.field5173 >> 7) + var7;
                            class310.field5292[field4039].method1186(var4.method1680(arg0 - 276), var4.field5173 >> 7, var4.method1680(arg0 ^ 0xFFFFFF06), 0, var4.field5130 >> 7, false, false);
                            if (var4.field5125[0] >= 0 && var4.field5125[0] <= (104 - var4.method1680(arg0 - 259)) && var4.field5154[0] >= 0 && var4.field5154[0] <= 104 - var4.method1680(-111) && class310.field5292[field4039].method1188(var4.field5125[0], var4.field5173 >> 7, var4.field5130 >> 7, (byte) 108, var4.field5154[0])) {
                                if (var4.method1680(-124) > 1) {
                                    for (int var8 = var4.field5125[0]; var4.field5125[0] + var4.method1680(-108) > var8; var8++) {
                                        for (int var9 = var4.field5154[0]; var4.field5154[0] + var4.method1680(arg0 - 261) > var9; var9++) {
                                            if ((class310.field5292[field4039].field2743[var8][var9] & var2) != 0) {
                                                continue label189;
                                            }
                                        }
                                    }
                                }
                                var4.field5127 = 1;
                            }
                        }
                    }
                    class116.method882(var4, false);
                    class9.method49(var4, true);
                    class121.method898(var4, -1);
                    class310.field5292[field4039].method1174(125, var4.method1680(arg0 - 248), false, var4.field5173 >> 7, var4.method1680(-125), var4.field5130 >> 7);
                }
            }
        }
        if (!class281.field4827) {
            class205.method1485(arg0 ^ 0xFFFFFF69);
        } else if (class160.field2702 == 0 && class88.field1433 == 0) {
            if (class3.field50 == 2) {
                class25.method138(-122);
            } else {
                class282.method1992((byte) 121);
            }
            if ((class221.field3723 >> 7) < 14 || class221.field3723 >> 7 >= 90 || (class256.field4373 >> 7) < 14 || (class256.field4373 >> 7) >= 90) {
                class249.method1715((byte) 92);
            }
        }
        while (true) {
            class26 var10;
            class197 var11;
            class197 var12;
            do {
                var10 = (class26) class56.field872.method1468(-116);
                if (var10 == null) {
                    while (true) {
                        class26 var13;
                        class197 var17;
                        class197 var18;
                        do {
                            var13 = (class26) class301.field5181.method1468(-120);
                            if (var13 == null) {
                                while (true) {
                                    class26 var14;
                                    class197 var15;
                                    class197 var16;
                                    do {
                                        var14 = (class26) class151.field2562.method1468(-104);
                                        if (var14 == null) {
                                            if (class300.field5110 != null) {
                                                class55.method345(-63);
                                            }
                                            if (class235.field3867 != null && class235.field3867.field2833 == 1) {
                                                if (class235.field3867.field2832 != null) {
                                                    class130.method958(class81.field1317, (byte) -114, class147.field2494);
                                                }
                                                class147.field2494 = null;
                                                class235.field3867 = null;
                                                class81.field1317 = false;
                                            }
                                            if (arg0 != 150) {
                                                field4038 = (boolean[][]) ((boolean[][]) null);
                                            }
                                            return;
                                        }
                                        var15 = var14.field424;
                                        if (var15.field3273 < 0) {
                                            break;
                                        }
                                        var16 = class58.method353(var15.field3353, (byte) -112);
                                    } while (var16 == null || var16.field3359 == null || var16.field3359.length <= var15.field3273 || var16.field3359[var15.field3273] != var15);
                                    class114.method873(-67, var14);
                                }
                            }
                            var17 = var13.field424;
                            if (var17.field3273 < 0) {
                                break;
                            }
                            var18 = class58.method353(var17.field3353, (byte) 1);
                        } while (var18 == null || var18.field3359 == null || var18.field3359.length <= var17.field3273 || var18.field3359[var17.field3273] != var17);
                        class114.method873(125, var13);
                    }
                }
                var11 = var10.field424;
                if (var11.field3273 < 0) {
                    break;
                }
                var12 = class58.method353(var11.field3353, (byte) 3);
            } while (var12 == null || var12.field3359 == null || var11.field3273 >= var12.field3359.length || var12.field3359[var11.field3273] != var11);
            class114.method873(-78, var10);
        }
    }
}
