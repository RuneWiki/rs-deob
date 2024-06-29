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
public class client extends class115 {

    @OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
    public static int[] field4120 = new int[50];

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4130 = 1;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4135 = 0;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
    public static boolean field4137;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
    public static int[] field4117;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 6)
    public final void method908(byte arg0) {
        if (class162.field2623) {
            class162.method1222();
        }
        field4121++;
        if (class244.field3646 != null) {
            class34.method315(class92.field1484, class244.field3646, true);
            class244.field3646 = null;
        }
        if (class92.field1484 != null) {
            class92.field1484.method554(this.getClass(), false);
        }
        if (class49.field755 != null) {
            class49.field755.field3629 = false;
        }
        class49.field755 = null;
        if (class319.field5005 != null) {
            class319.field5005.method371(-2);
            class319.field5005 = null;
        }
        if (arg0 != 30) {
            field4130 = -121;
        }
        class118.method925(class334.field5197, (byte) 117);
        class251.method1739((byte) -50, class334.field5197);
        if (class345.field5350 != null) {
            class345.field5350.method1669(arg0 + 98, class334.field5197);
        }
        class78.method613(-18425);
        class113.method876(0);
        class345.field5350 = null;
        if (class55.field837 != null) {
            class55.field837.method2321((byte) -119);
        }
        if (class255.field3765 != null) {
            class255.field3765.method2321((byte) -119);
        }
        class53.field809.method2005(62);
        class133.field2112.method1569((byte) -27);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 61)
    private final void method1861(byte arg0) {
        if (!class306.field4859) {
            label244: while (true) {
                do {
                    if (!class103.method839(-14632)) {
                        break label244;
                    }
                } while (class327.field5115 != 's' && class327.field5115 != 'S');
                class306.field4859 = true;
            }
        }
        field4126++;
        if (class174.field2798 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class212.method1543(arg0 ^ 0x5773);
            if (class176.field2813 == 0L) {
                class176.field2813 = var4;
            }
            if (var3 > 16384 && var4 - class176.field2813 < 5000L) {
                if ((var4 - class266.field4006) > 1000L) {
                    System.gc();
                    class266.field4006 = var4;
                }
                class126.field2019 = 5;
                class44.field696 = class285.field4452;
            } else {
                class126.field2019 = 5;
                class44.field696 = class174.field2797;
                class174.field2798 = 10;
            }
        } else if (class174.field2798 == 10) {
            class219.method1584(4, 104, 104);
            for (int var29 = 0; var29 < 4; var29++) {
                class166.field2686[var29] = new class53(104, 104);
            }
            class44.field696 = class299.field4780;
            class126.field2019 = 10;
            class174.field2798 = 30;
        } else if (arg0 == 69) {
            if (class174.field2798 == 30) {
                if (class173.field2773 == null) {
                    class173.field2773 = new class36(class53.field809, class133.field2112);
                }
                if (class173.field2773.method322(0)) {
                    class74.field1138 = class190.method1369(false, 99, 0, true, true);
                    class185.field2932 = class190.method1369(false, 99, 1, true, true);
                    class144.field2328 = class190.method1369(true, arg0 ^ 0x26, 2, false, true);
                    class52.field771 = class190.method1369(false, arg0 ^ 0x26, 3, true, true);
                    class208.field3288 = class190.method1369(false, 99, 4, true, true);
                    class200.field3062 = class190.method1369(true, arg0 + 30, 5, true, true);
                    class79.field1232 = class190.method1369(true, 99, 6, true, false);
                    class147.field2407 = class190.method1369(false, 99, 7, true, true);
                    class176.field2815 = class190.method1369(false, arg0 ^ 0x26, 8, true, true);
                    class181.field2878 = class190.method1369(false, 99, 9, true, true);
                    class110.field1793 = class190.method1369(false, arg0 + 30, 10, true, true);
                    class136.field2209 = class190.method1369(false, 99, 11, true, true);
                    class111.field1809 = class190.method1369(false, 99, 12, true, true);
                    class140.field2262 = class190.method1369(false, 99, 13, true, true);
                    class243.field3643 = class190.method1369(false, arg0 + 30, 14, true, false);
                    class62.field910 = class190.method1369(false, 99, 15, true, true);
                    class30.field468 = class190.method1369(false, 99, 16, true, true);
                    class337.field5215 = class190.method1369(false, 99, 17, true, true);
                    class85.field1370 = class190.method1369(false, 99, 18, true, true);
                    class281.field4407 = class190.method1369(false, arg0 ^ 0x26, 19, true, true);
                    class20.field363 = class190.method1369(false, 99, 20, true, true);
                    class242.field3626 = class190.method1369(false, 99, 21, true, true);
                    class106.field1747 = class190.method1369(false, 99, 22, true, true);
                    class73.field1113 = class190.method1369(true, 99, 23, true, true);
                    class120.field1965 = class190.method1369(false, arg0 + 30, 24, true, true);
                    class122.field1982 = class190.method1369(false, arg0 + 30, 25, true, true);
                    class120.field1938 = class190.method1369(true, arg0 + 30, 26, true, true);
                    class180.field2864 = class190.method1369(false, 99, 27, true, true);
                    class5.field122 = class190.method1369(true, 99, 28, true, true);
                    class174.field2798 = 40;
                    class44.field696 = class220.field3437;
                    class126.field2019 = 15;
                } else {
                    class126.field2019 = 12;
                    class44.field696 = class136.field2216;
                }
            } else if (class174.field2798 == 40) {
                int var6 = 0;
                for (int var7 = 0; var7 < 29; var7++) {
                    var6 += class21.field383[var7].method2096(0) * class73.field1110[var7] / 100;
                }
                if (var6 == 100) {
                    class44.field696 = class280.field4386;
                    class126.field2019 = 20;
                    class87.method689(124, class176.field2815);
                    class52.method431(class176.field2815, (byte) -30);
                    class34.method316(93, class176.field2815);
                    class174.field2798 = 41;
                } else {
                    class126.field2019 = 20;
                    if (var6 != 0) {
                        class44.field696 = class91.field1473 + var6 + "%";
                    }
                }
            } else if (class174.field2798 == 41) {
                if (class5.field122.method960((byte) -93)) {
                    this.method1871(true, class5.field122.method950(-1516, 1));
                    class44.field696 = class296.field4736;
                    class174.field2798 = 45;
                    class126.field2019 = 25;
                } else {
                    class44.field696 = class112.field1815 + class5.field122.method942((byte) -32) + "%";
                    class126.field2019 = 25;
                }
            } else if (class174.field2798 == 45) {
                class93.method741(2, class60.field881, (byte) 89, 22050);
                class2.field78 = new class201();
                class2.field78.method1422(128, 127, 9);
                class55.field837 = class343.method2383(22050, class92.field1484, 0, 123, class334.field5197);
                class55.field837.method2324((byte) -125, class2.field78);
                class131.method1015(class243.field3643, class208.field3288, class62.field910, 119, class2.field78);
                class255.field3765 = class343.method2383(2048, class92.field1484, 1, 124, class334.field5197);
                class181.field2877 = new class336();
                class255.field3765.method2324((byte) -94, class181.field2877);
                class342.field5293 = new class22(22050, class297.field4778);
                class50.field761 = class79.field1232.method958(103, "scape main");
                class174.field2798 = 50;
                class126.field2019 = 30;
                class44.field696 = class200.field3071;
            } else if (class174.field2798 == 50) {
                int var8 = class92.method734((byte) 53, class140.field2262, class176.field2815);
                int var9 = class71.method573(6);
                if (var8 < var9) {
                    class126.field2019 = 35;
                    class44.field696 = class118.field1914 + var8 * 100 / var9 + "%";
                } else {
                    class174.field2798 = 60;
                    class126.field2019 = 35;
                    class44.field696 = class157.field2568;
                }
            } else if (class174.field2798 == 60) {
                int var27 = class345.method2392((byte) -125, class176.field2815);
                int var28 = class49.method414(-125);
                if (var27 >= var28) {
                    class174.field2798 = 65;
                    class126.field2019 = 40;
                    class44.field696 = class76.field1166;
                } else {
                    class44.field696 = class207.field3273 + var27 * 100 / var28 + "%";
                    class126.field2019 = 40;
                }
            } else if (class174.field2798 == 65) {
                class71.method575(class176.field2815, 14765, class140.field2262);
                class126.field2019 = 45;
                class44.field696 = class280.field4379;
                class117.method921((byte) -128, 5);
                class174.field2798 = 70;
            } else if (class174.field2798 == 70) {
                byte var15 = 0;
                class144.field2328.method960((byte) -115);
                int var16 = var15 + class144.field2328.method942((byte) -66);
                class30.field468.method960((byte) -112);
                int var17 = var16 + class30.field468.method942((byte) -69);
                class337.field5215.method960((byte) -56);
                int var18 = var17 + class337.field5215.method942((byte) -90);
                class85.field1370.method960((byte) -80);
                int var19 = var18 + class85.field1370.method942((byte) -96);
                class281.field4407.method960((byte) -103);
                int var20 = var19 + class281.field4407.method942((byte) -124);
                class20.field363.method960((byte) -81);
                int var21 = var20 + class20.field363.method942((byte) -40);
                class242.field3626.method960((byte) -46);
                int var22 = var21 + class242.field3626.method942((byte) -113);
                class106.field1747.method960((byte) -94);
                int var23 = var22 + class106.field1747.method942((byte) -123);
                class120.field1965.method960((byte) -91);
                int var24 = var23 + class120.field1965.method942((byte) -51);
                class122.field1982.method960((byte) -63);
                int var25 = var24 + class122.field1982.method942((byte) -110);
                class180.field2864.method960((byte) -68);
                int var26 = var25 + class180.field2864.method942((byte) -45);
                if (var26 >= 1100) {
                    class204.method1465(false, class144.field2328);
                    class80.method626(class144.field2328, (byte) 120);
                    class21.method216(class144.field2328, (byte) -117);
                    class3.method82(class147.field2407, 3, class144.field2328);
                    class172.method1278(110, true, class147.field2407, class30.field468);
                    class277.method1965(class147.field2407, class85.field1370, -80);
                    class258.method1789(class147.field2407, class281.field4407, class110.field1791, -1, true);
                    class113.method880(class144.field2328, 34);
                    class216.method1562(class185.field2932, class20.field363, -128, class74.field1138);
                    class32.method287(class144.field2328, (byte) 72);
                    class146.method1112(class242.field3626, class147.field2407, 30820);
                    class171.method1274(class106.field1747, 106);
                    class291.method2043(class144.field2328, 2371);
                    class12.method166(-103, class176.field2815, class140.field2262, class52.field771, class147.field2407);
                    class176.method1294(22527, class144.field2328);
                    class244.method1721(class337.field5215, 39);
                    class268.method1859(class122.field1982, new class25(), class120.field1965, (byte) 24);
                    class45.method390(class122.field1982, class120.field1965, false);
                    class164.method1236(87, class144.field2328);
                    class64.method512(-1, class144.field2328);
                    class137.method1059(class144.field2328, 0);
                    class343.method2377(2, class176.field2815, class144.field2328);
                    class93.method742(class176.field2815, class144.field2328, -13294);
                    class126.field2019 = 50;
                    class44.field696 = class333.field5190;
                    class104.method842((byte) 110);
                    class174.field2798 = 80;
                } else {
                    class44.field696 = class93.field1521 + var26 / 11 + "%";
                    class126.field2019 = 50;
                }
            } else if (class174.field2798 == 80) {
                int var13 = class147.method1115(class176.field2815, arg0 ^ 0x11);
                int var14 = class320.method2256((byte) 39);
                if (var13 >= var14) {
                    class296.method2095((byte) 2, class176.field2815);
                    class44.field696 = class320.field5016;
                    class174.field2798 = 90;
                    class126.field2019 = 60;
                } else {
                    class126.field2019 = 60;
                    class44.field696 = class76.field1191 + var13 * 100 / var14 + "%";
                }
            } else if (class174.field2798 == 90) {
                if (class120.field1938.method960((byte) -111)) {
                    class277 var10 = new class277(class181.field2878, class120.field1938, class176.field2815, 20, !class257.field3810);
                    class40.method351(var10);
                    if (class343.field5310 == 1) {
                        class40.method352(0.9F);
                    }
                    if (class343.field5310 == 2) {
                        class40.method352(0.8F);
                    }
                    if (class343.field5310 == 3) {
                        class40.method352(0.7F);
                    }
                    if (class343.field5310 == 4) {
                        class40.method352(0.6F);
                    }
                    class126.field2019 = 70;
                    class174.field2798 = 100;
                    class44.field696 = class308.field4883;
                } else {
                    class44.field696 = class243.field3637 + class120.field1938.method942((byte) -76) + "%";
                    class126.field2019 = 70;
                }
            } else if (class174.field2798 == 100) {
                if (class179.method1315((byte) 118, class176.field2815)) {
                    class174.field2798 = 110;
                }
            } else if (class174.field2798 == 110) {
                class49.field755 = new class242();
                class92.field1484.method553(class49.field755, (byte) 77, 10);
                class44.field696 = class303.field4833;
                class126.field2019 = 75;
                class174.field2798 = 120;
            } else if (class174.field2798 == 120) {
                if (class110.field1793.method952("huffman", "", 29098)) {
                    class20 var11 = new class20(class110.field1793.method935("huffman", arg0 ^ 0xFFFFFFE7, ""));
                    class260.method1806(var11, (byte) 78);
                    class44.field696 = class112.field1814;
                    class174.field2798 = 130;
                    class126.field2019 = 80;
                } else {
                    class44.field696 = class165.field2674 + "0%";
                    class126.field2019 = 80;
                }
            } else if (class174.field2798 == 130) {
                if (!class52.field771.method960((byte) -110)) {
                    class44.field696 = class328.field5132 + class52.field771.method942((byte) -62) * 3 / 4 + "%";
                    class126.field2019 = 85;
                } else if (!class111.field1809.method960((byte) -114)) {
                    class44.field696 = class328.field5132 + ((class111.field1809.method942((byte) -29) / 10) + 75) + "%";
                    class126.field2019 = 85;
                } else if (!class140.field2262.method960((byte) -81)) {
                    class44.field696 = class328.field5132 + (class140.field2262.method942((byte) -121) / 20 + 85) + "%";
                    class126.field2019 = 85;
                } else if (class73.field1113.method951(0, "details")) {
                    class296.method2090(0, class338.field5220, class73.field1113);
                    class250.method1735(class147.field2407);
                    class126.field2019 = 95;
                    class174.field2798 = 135;
                    class44.field696 = class266.field3997;
                } else {
                    class44.field696 = class328.field5132 + ((class73.field1113.method955((byte) -125, "details") / 10) + 90) + "%";
                    class126.field2019 = 85;
                }
            } else if (class174.field2798 == 135) {
                int var12 = class99.method798((byte) -68);
                if (var12 == -1) {
                    class126.field2019 = 95;
                    class44.field696 = class320.field5014;
                } else if (var12 == 7 || var12 == 9) {
                    this.method902((byte) 21, "worldlistfull");
                    class117.method921((byte) -128, 1000);
                } else if (class53.field812) {
                    class174.field2798 = 140;
                    class44.field696 = class233.field3544;
                    class126.field2019 = 96;
                } else {
                    this.method902((byte) 21, "worldlistio_" + var12);
                    class117.method921((byte) 86, 1000);
                }
            } else if (class174.field2798 == 140) {
                class285.field4451 = class52.field771.method958(124, "loginscreen");
                class200.field3062.method937(true, (byte) 125, false);
                class79.field1232.method937(true, (byte) 125, true);
                class176.field2815.method937(true, (byte) 125, true);
                class140.field2262.method937(true, (byte) 125, true);
                class110.field1793.method937(true, (byte) 125, true);
                class52.field771.method937(true, (byte) 127, true);
                class44.field696 = class320.field5012;
                class174.field2798 = 150;
                class126.field2019 = 97;
                class91.field1457 = true;
            } else if (class174.field2798 == 150) {
                class252.method1748();
                if (class306.field4859) {
                    class144.field2326 = 0;
                    class124.field2007 = 0;
                    class101.field1636 = 0;
                    class315.field4973 = 0;
                }
                class306.field4859 = true;
                class281.method1976(class92.field1484, -7136);
                class184.method1342(arg0 - 70, -1, -1, false, class101.field1636);
                class174.field2798 = 160;
                class126.field2019 = 100;
                class44.field696 = class328.field5125;
            } else if (class174.field2798 == 160) {
                class198.method1402(true, (byte) 86);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltk;)Z", line = 588)
    public static final boolean method1862(class266 arg0) {
        if (class320.field5011) {
            if (method1867(arg0).field3822 != 0) {
                return false;
            }
            if (arg0.field4084 == 0) {
                return false;
            }
        }
        return arg0.field4046;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 605)
    private final void method1863(byte arg0) {
        field4131++;
        if (arg0 != 67) {
            field4120 = (int[]) null;
        }
        boolean var2 = class53.field809.method1999(false);
        if (!var2) {
            this.method1869((byte) -73);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 620)
    public static void method1864(int arg0) {
        if (arg0 <= 105) {
            method1864(52);
        }
        field4117 = null;
        field4120 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 640)
    public final void method910(int arg0) {
        field4127++;
        if (class289.field4548 == 1000) {
            return;
        }
        int var2 = -31 % ((arg0 + 28) / 41);
        class307.field4869++;
        if (class307.field4869 % 1000 == 1) {
            GregorianCalendar var3 = new GregorianCalendar();
            class242.field3633 = var3.get(11) * 600 - (-(var3.get(12) * 10) - (var3.get(13) / 6));
            class99.field1587.setSeed((long) class242.field3633);
        }
        this.method1863((byte) 67);
        if (class173.field2773 != null) {
            class173.field2773.method326((byte) -45);
        }
        class282.method1985(0);
        class178.method1310(16);
        class274.method1953(true);
        class139.method1066(8);
        if (class162.field2623) {
            class177.method1303();
        }
        if (class345.field5350 != null) {
            int var4 = class345.field5350.method1667(-2005100980);
            class307.field4865 = var4;
        }
        if (class289.field4548 == 0) {
            this.method1861((byte) 69);
            class166.method1241(2);
        } else if (class289.field4548 == 5) {
            this.method1861((byte) 69);
            class166.method1241(2);
        } else if (class289.field4548 == 25 || class289.field4548 == 28) {
            class13.method180((byte) -79);
        }
        if (class289.field4548 == 10) {
            this.method1873(-15);
            class90.method710((byte) -50);
            class322.method2267(18705);
            class257.method1783(123);
        } else if (class289.field4548 == 30) {
            class26.method234(18);
        } else if (class289.field4548 == 40) {
            class257.method1783(119);
            if (class133.field2117 != -3) {
                if (class133.field2117 == 15) {
                    class31.method280(-77);
                } else if (class133.field2117 != 2) {
                    class111.method867(87);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 730)
    public final void method911(byte arg0) {
        class28.method248(84);
        field4134++;
        class133.field2112 = new class217();
        class53.field809 = new class286();
        if (class209.field3298 != 0) {
            class258.field3832 = new byte[50][];
        }
        class320.method2257(class92.field1484, 62);
        if (class260.field3874 == 0) {
            class322.field5050 = this.getCodeBase().getHost();
            class149.field2427 = 43594;
            class139.field2254 = 443;
        } else if (class260.field3874 == 1) {
            class322.field5050 = this.getCodeBase().getHost();
            class149.field2427 = class60.field890 + 40000;
            class139.field2254 = class60.field890 + 50000;
        } else if (class260.field3874 == 2) {
            class322.field5050 = "127.0.0.1";
            class139.field2254 = class60.field890 + 50000;
            class149.field2427 = class60.field890 + 40000;
        }
        class264.field3913 = class149.field2427;
        class247.field3681 = class139.field2254;
        if (class109.field1773 == 1) {
            class345.field5362 = class70.field1061;
            class281.field4404 = true;
            class176.field2816 = class78.field1221;
            class167.field2688 = class57.field868;
            class309.field4888 = class102.field1682;
            class261.field3886 = 0;
            class261.field3887 = 16777215;
        } else {
            class345.field5362 = class311.field4916;
            class176.field2816 = class344.field5335;
            class309.field4888 = class274.field4279;
            class167.field2688 = class66.field981;
        }
        class56.field858 = class191.field2997 = class213.field3324 = class207.field3272 = new short[256];
        if (class69.field1039 == 3 && class260.field3874 != 2) {
            class1.field72 = class60.field890;
        }
        class166.field2679 = class264.field3913;
        class10.field237 = class149.field2427;
        class342.field5303 = class322.field5050;
        if (arg0 != -28) {
            return;
        }
        class314.method2216(-105);
        class183.method1338(false, class334.field5197);
        class34.method317(class334.field5197, arg0 + 125);
        class345.field5350 = class146.method1109((byte) -51);
        if (class345.field5350 != null) {
            class345.field5350.method1668(class334.field5197, 128);
        }
        class273.field4271 = class69.field1039;
        try {
            if (class92.field1484.field1044 != null) {
                class241.field3612 = new class52(class92.field1484.field1044, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class242.field3624[var2] = new class52(class92.field1484.field1053[var2], 6000, 0);
                }
                class213.field3335 = new class52(class92.field1484.field1038, 6000, 0);
                class310.field4906 = new class111(255, class241.field3612, class213.field3335, 500000);
                class63.field928 = new class52(class92.field1484.field1052, 24, 0);
                class92.field1484.field1038 = null;
                class92.field1484.field1053 = null;
                class92.field1484.field1044 = null;
                class92.field1484.field1052 = null;
            }
        } catch (IOException var4) {
            class310.field4906 = null;
            class241.field3612 = null;
            class213.field3335 = null;
            class63.field928 = null;
        }
        if (class260.field3874 != 0) {
            class318.field4993 = true;
        }
        class160.field2601 = class111.field1803;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltk;)Ltk;", line = 847)
    public static final class266 method1865(class266 arg0) {
        int var1 = method1867(arg0).method1782(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class171.method1276(arg0.field3926, (byte) 113);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltk;IIIIIII)V", line = 873)
    public static final void method1866(class266[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class266 var9 = arg0[var8];
            if (var9 != null && var9.field3926 == arg1 && (!var9.field4043 || var9.field4084 == 0 || var9.field4017 || method1867(var9).field3822 != 0 || class55.field841 == var9 || var9.field4064 == 1338) && (!var9.field4043 || !method1862(var9))) {
                int var10 = var9.field4099 + arg6;
                int var11 = var9.field4087 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4084 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3941 + var10;
                    int var17 = var9.field3939 + var11;
                    if (var9.field4084 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class86.field1377 == var9) {
                    class66.field1010 = true;
                    class115.field1873 = var10;
                    class26.field437 = var11;
                }
                if (!var9.field4043 || var12 < var14 && var13 < var15) {
                    if (var9.field4084 == 0) {
                        if (!var9.field4043 && method1862(var9) && class143.field2313 != var9) {
                            continue;
                        }
                        if (var9.field4058 && class303.field4832 >= var12 && class22.field389 >= var13 && class303.field4832 < var14 && class22.field389 < var15) {
                            for (class150 var18 = (class150) class44.field698.method268(-1); var18 != null; var18 = (class150) class44.field698.method278(1)) {
                                if (var18.field2443) {
                                    var18.method489(false);
                                    var18.field2458.field4015 = false;
                                }
                            }
                            if (class122.field1981 == 0) {
                                class86.field1377 = null;
                                class55.field841 = null;
                            }
                            class70.field1058 = 0;
                        }
                    }
                    if (var9.field4043) {
                        boolean var19;
                        if (class303.field4832 >= var12 && class22.field389 >= var13 && class303.field4832 < var14 && class22.field389 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class129.field2062 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class200.field3072 == 1 && class170.field2740 >= var12 && class243.field3639 >= var13 && class170.field2740 < var14 && class243.field3639 < var15) {
                            var21 = true;
                        }
                        if (var9.field3929 != null) {
                            for (int var22 = 0; var22 < var9.field3929.length; var22++) {
                                if (class48.field737[var9.field3929[var22]]) {
                                    if (var9.field4098 == null || class307.field4869 >= var9.field4098[var22]) {
                                        byte var23 = var9.field4000[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class48.field737[86] && !class48.field737[82] && !class48.field737[81]) && ((var23 & 0x2) == 0 || class48.field737[86]) && ((var23 & 0x1) == 0 || class48.field737[82]) && ((var23 & 0x4) == 0 || class48.field737[81])) {
                                            class243.method1716(-108, var22 + 1, "", -1, var9.field4088);
                                            int var24 = var9.field3992[var22];
                                            if (var9.field4098 == null) {
                                                var9.field4098 = new int[var9.field3929.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4098[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4098[var22] = class307.field4869 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4098 != null) {
                                    var9.field4098[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class281.method1977((byte) 106, class170.field2740 - var10, var9, class243.field3639 - var11);
                        }
                        if (class86.field1377 != null && class86.field1377 != var9 && var19 && method1867(var9).method1788(true)) {
                            class128.field2056 = var9;
                        }
                        if (class55.field841 == var9) {
                            class314.field4959 = true;
                            class92.field1489 = var10;
                            class338.field5227 = var11;
                        }
                        if (var9.field4017 || var9.field4064 != 0) {
                            if (var19 && class307.field4865 != 0 && var9.field4100 != null) {
                                class150 var25 = new class150();
                                var25.field2443 = true;
                                var25.field2458 = var9;
                                var25.field2457 = class307.field4865;
                                var25.field2450 = var9.field4100;
                                class44.field698.method277(var25, (byte) -119);
                            }
                            if (class86.field1377 != null || class109.field1774 != null || class260.field3858 || var9.field4064 != 1400 && class70.field1058 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4064 != 0) {
                                if (var9.field4064 == 1337) {
                                    class342.field5302 = var9;
                                    continue;
                                }
                                if (var9.field4064 == 1338) {
                                    if (var21) {
                                        class28.field459 = class170.field2740 - var10;
                                        class260.field3871 = class243.field3639 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4064 == 1400) {
                                    class133.field2119 = var9;
                                    if (var21) {
                                        if (class48.field737[82] && class233.field3543 > 0) {
                                            int var26 = (int) ((double) (class170.field2740 - var10 - var9.field3941 / 2) * 2.0D / (double) class342.field5298);
                                            int var27 = (int) ((double) (class243.field3639 - var11 - var9.field3939 / 2) * 2.0D / (double) class342.field5298);
                                            int var28 = class180.field2863 + var26;
                                            int var29 = class67.field1013 + var27;
                                            int var30 = class227.field3512 + var28;
                                            int var31 = class286.field4473 + class188.field2953 - var29 - 1;
                                            class91 var32 = class274.method1947(116);
                                            int[] var33 = var32.method719(-23306, var31, var30);
                                            if (var33 != null) {
                                                class71.method571(var33[1], var33[0], var33[2], -115);
                                                class86.method683(9049);
                                            }
                                            continue;
                                        }
                                        class70.field1058 = 1;
                                        class178.field2838 = class303.field4832;
                                        class120.field1937 = class22.field389;
                                        continue;
                                    }
                                    if (var20 && class70.field1058 > 0) {
                                        if (class70.field1058 == 1 && (class303.field4832 != class178.field2838 || class22.field389 != class120.field1937)) {
                                            class64.field930 = class180.field2863;
                                            class76.field1193 = class67.field1013;
                                            class70.field1058 = 2;
                                        }
                                        if (class70.field1058 == 2) {
                                            class227.method1661(-1, (int) ((double) (class178.field2838 - class303.field4832) * 2.0D / (double) class16.field333) + class64.field930);
                                            class209.method1534((int) ((double) (class120.field1937 - class22.field389) * 2.0D / (double) class16.field333) + class76.field1193, 99);
                                        }
                                        continue;
                                    }
                                    class70.field1058 = 0;
                                    continue;
                                }
                                if (var9.field4064 == 1401) {
                                    if (var20) {
                                        class191.method1373((byte) 72, class303.field4832 - var10, var9.field3939, var9.field3941, class22.field389 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field4064 == 1402) {
                                    if (!class162.field2623) {
                                        class280.method1971((byte) 101, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field4061 && var21) {
                                var9.field4061 = true;
                                if (var9.field4071 != null) {
                                    class150 var34 = new class150();
                                    var34.field2443 = true;
                                    var34.field2458 = var9;
                                    var34.field2449 = class170.field2740 - var10;
                                    var34.field2457 = class243.field3639 - var11;
                                    var34.field2450 = var9.field4071;
                                    class44.field698.method277(var34, (byte) -119);
                                }
                            }
                            if (var9.field4061 && var20 && var9.field4101 != null) {
                                class150 var35 = new class150();
                                var35.field2443 = true;
                                var35.field2458 = var9;
                                var35.field2449 = class303.field4832 - var10;
                                var35.field2457 = class22.field389 - var11;
                                var35.field2450 = var9.field4101;
                                class44.field698.method277(var35, (byte) -119);
                            }
                            if (var9.field4061 && !var20) {
                                var9.field4061 = false;
                                if (var9.field4056 != null) {
                                    class150 var36 = new class150();
                                    var36.field2443 = true;
                                    var36.field2458 = var9;
                                    var36.field2449 = class303.field4832 - var10;
                                    var36.field2457 = class22.field389 - var11;
                                    var36.field2450 = var9.field4056;
                                    class247.field3675.method277(var36, (byte) -119);
                                }
                            }
                            if (var20 && var9.field3959 != null) {
                                class150 var37 = new class150();
                                var37.field2443 = true;
                                var37.field2458 = var9;
                                var37.field2449 = class303.field4832 - var10;
                                var37.field2457 = class22.field389 - var11;
                                var37.field2450 = var9.field3959;
                                class44.field698.method277(var37, (byte) -119);
                            }
                            if (!var9.field4015 && var19) {
                                var9.field4015 = true;
                                if (var9.field3985 != null) {
                                    class150 var38 = new class150();
                                    var38.field2443 = true;
                                    var38.field2458 = var9;
                                    var38.field2449 = class303.field4832 - var10;
                                    var38.field2457 = class22.field389 - var11;
                                    var38.field2450 = var9.field3985;
                                    class44.field698.method277(var38, (byte) -119);
                                }
                            }
                            if (var9.field4015 && var19 && var9.field3995 != null) {
                                class150 var39 = new class150();
                                var39.field2443 = true;
                                var39.field2458 = var9;
                                var39.field2449 = class303.field4832 - var10;
                                var39.field2457 = class22.field389 - var11;
                                var39.field2450 = var9.field3995;
                                class44.field698.method277(var39, (byte) -119);
                            }
                            if (var9.field4015 && !var19) {
                                var9.field4015 = false;
                                if (var9.field3944 != null) {
                                    class150 var40 = new class150();
                                    var40.field2443 = true;
                                    var40.field2458 = var9;
                                    var40.field2449 = class303.field4832 - var10;
                                    var40.field2457 = class22.field389 - var11;
                                    var40.field2450 = var9.field3944;
                                    class247.field3675.method277(var40, (byte) -119);
                                }
                            }
                            if (var9.field3946 != null) {
                                class150 var41 = new class150();
                                var41.field2458 = var9;
                                var41.field2450 = var9.field3946;
                                class299.field4787.method277(var41, (byte) -119);
                            }
                            if (var9.field4092 != null && class56.field856 > var9.field3972) {
                                if (var9.field3965 == null || class56.field856 - var9.field3972 > 32) {
                                    class150 var46 = new class150();
                                    var46.field2458 = var9;
                                    var46.field2450 = var9.field4092;
                                    class44.field698.method277(var46, (byte) -119);
                                } else {
                                    label575: for (int var42 = var9.field3972; var42 < class56.field856; var42++) {
                                        int var43 = class75.field1165[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3965.length; var44++) {
                                            if (var9.field3965[var44] == var43) {
                                                class150 var45 = new class150();
                                                var45.field2458 = var9;
                                                var45.field2450 = var9.field4092;
                                                class44.field698.method277(var45, (byte) -119);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field3972 = class56.field856;
                            }
                            if (var9.field3963 != null && class294.field4706 > var9.field3974) {
                                if (var9.field4030 == null || class294.field4706 - var9.field3974 > 32) {
                                    class150 var51 = new class150();
                                    var51.field2458 = var9;
                                    var51.field2450 = var9.field3963;
                                    class44.field698.method277(var51, (byte) -119);
                                } else {
                                    label551: for (int var47 = var9.field3974; var47 < class294.field4706; var47++) {
                                        int var48 = class36.field548[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field4030.length; var49++) {
                                            if (var9.field4030[var49] == var48) {
                                                class150 var50 = new class150();
                                                var50.field2458 = var9;
                                                var50.field2450 = var9.field3963;
                                                class44.field698.method277(var50, (byte) -119);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field3974 = class294.field4706;
                            }
                            if (var9.field3924 != null && class121.field1980 > var9.field3962) {
                                if (var9.field4083 == null || class121.field1980 - var9.field3962 > 32) {
                                    class150 var56 = new class150();
                                    var56.field2458 = var9;
                                    var56.field2450 = var9.field3924;
                                    class44.field698.method277(var56, (byte) -119);
                                } else {
                                    label527: for (int var52 = var9.field3962; var52 < class121.field1980; var52++) {
                                        int var53 = class117.field1900[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field4083.length; var54++) {
                                            if (var9.field4083[var54] == var53) {
                                                class150 var55 = new class150();
                                                var55.field2458 = var9;
                                                var55.field2450 = var9.field3924;
                                                class44.field698.method277(var55, (byte) -119);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field3962 = class121.field1980;
                            }
                            if (var9.field3986 != null && class78.field1217 > var9.field4075) {
                                if (var9.field4065 == null || class78.field1217 - var9.field4075 > 32) {
                                    class150 var61 = new class150();
                                    var61.field2458 = var9;
                                    var61.field2450 = var9.field3986;
                                    class44.field698.method277(var61, (byte) -119);
                                } else {
                                    label503: for (int var57 = var9.field4075; var57 < class78.field1217; var57++) {
                                        int var58 = class259.field3846[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field4065.length; var59++) {
                                            if (var9.field4065[var59] == var58) {
                                                class150 var60 = new class150();
                                                var60.field2458 = var9;
                                                var60.field2450 = var9.field3986;
                                                class44.field698.method277(var60, (byte) -119);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field4075 = class78.field1217;
                            }
                            if (var9.field3981 != null && class39.field600 > var9.field4047) {
                                if (var9.field3984 == null || class39.field600 - var9.field4047 > 32) {
                                    class150 var66 = new class150();
                                    var66.field2458 = var9;
                                    var66.field2450 = var9.field3981;
                                    class44.field698.method277(var66, (byte) -119);
                                } else {
                                    label479: for (int var62 = var9.field4047; var62 < class39.field600; var62++) {
                                        int var63 = class264.field3915[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field3984.length; var64++) {
                                            if (var9.field3984[var64] == var63) {
                                                class150 var65 = new class150();
                                                var65.field2458 = var9;
                                                var65.field2450 = var9.field3981;
                                                class44.field698.method277(var65, (byte) -119);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field4047 = class39.field600;
                            }
                            if (class326.field5090 > var9.field3925 && var9.field4066 != null) {
                                class150 var67 = new class150();
                                var67.field2458 = var9;
                                var67.field2450 = var9.field4066;
                                class44.field698.method277(var67, (byte) -119);
                            }
                            if (class11.field254 > var9.field3925 && var9.field4026 != null) {
                                class150 var68 = new class150();
                                var68.field2458 = var9;
                                var68.field2450 = var9.field4026;
                                class44.field698.method277(var68, (byte) -119);
                            }
                            if (class42.field650 > var9.field3925 && var9.field3977 != null) {
                                class150 var69 = new class150();
                                var69.field2458 = var9;
                                var69.field2450 = var9.field3977;
                                class44.field698.method277(var69, (byte) -119);
                            }
                            if (class144.field2329 > var9.field3925 && var9.field4054 != null) {
                                class150 var70 = new class150();
                                var70.field2458 = var9;
                                var70.field2450 = var9.field4054;
                                class44.field698.method277(var70, (byte) -119);
                            }
                            if (class142.field2294 > var9.field3925 && var9.field3983 != null) {
                                class150 var71 = new class150();
                                var71.field2458 = var9;
                                var71.field2450 = var9.field3983;
                                class44.field698.method277(var71, (byte) -119);
                            }
                            var9.field3925 = class200.field3060;
                            if (var9.field3988 != null) {
                                for (int var72 = 0; var72 < class185.field2930; var72++) {
                                    class150 var73 = new class150();
                                    var73.field2458 = var9;
                                    var73.field2444 = class113.field1832[var72];
                                    var73.field2456 = class338.field5217[var72];
                                    var73.field2450 = var9.field3988;
                                    class44.field698.method277(var73, (byte) -119);
                                }
                            }
                            if (class191.field2994 && var9.field3967 != null) {
                                class150 var74 = new class150();
                                var74.field2458 = var9;
                                var74.field2450 = var9.field3967;
                                class44.field698.method277(var74, (byte) -119);
                            }
                        }
                    }
                    if (!var9.field4043 && class86.field1377 == null && class109.field1774 == null && !class260.field3858) {
                        if ((var9.field4034 >= 0 || var9.field3920 != 0) && class303.field4832 >= var12 && class22.field389 >= var13 && class303.field4832 < var14 && class22.field389 < var15) {
                            if (var9.field4034 >= 0) {
                                class143.field2313 = arg0[var9.field4034];
                            } else {
                                class143.field2313 = var9;
                            }
                        }
                        if (var9.field4084 == 8 && class303.field4832 >= var12 && class22.field389 >= var13 && class303.field4832 < var14 && class22.field389 < var15) {
                            class321.field5028 = var9;
                        }
                        if (var9.field4097 > var9.field3939) {
                            class327.method2302(var9, var9.field4097, class22.field389, var9.field3941 + var10, var11, var9.field3939, class303.field4832, (byte) -2);
                        }
                    }
                    if (var9.field4084 == 0) {
                        method1866(arg0, var9.field4088, var12, var13, var14, var15, var10 - var9.field3951, var11 - var9.field4045);
                        if (var9.field3994 != null) {
                            method1866(var9.field3994, var9.field4088, var12, var13, var14, var15, var10 - var9.field3951, var11 - var9.field4045);
                        }
                        class24 var75 = (class24) class158.field2584.method79((long) var9.field4088, (byte) 0);
                        if (var75 != null) {
                            class160.method1175(var14, false, var75.field417, var12, var10, var13, var11, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltk;)Lqg;", line = 1643)
    public static final class257 method1867(class266 arg0) {
        class257 var1 = (class257) class233.field3545.method79(((long) arg0.field4088 << 32) + (long) arg0.field3958, (byte) 0);
        return var1 == null ? arg0.field3936 : var1;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1649)
    public static final void main(String[] arg0) {
        field4124++;
        try {
            if (arg0.length != 4) {
                class343.method2382(-122, "argument count");
            }
            class60.field890 = Integer.parseInt(arg0[0]);
            class260.field3874 = 2;
            if (arg0[1].equals("live")) {
                class209.field3298 = 0;
            } else if (arg0[1].equals("rc")) {
                class209.field3298 = 1;
            } else if (arg0[1].equals("wip")) {
                class209.field3298 = 2;
            } else {
                class343.method2382(-52, "modewhat");
            }
            class67.field1020 = false;
            class28.field453 = class314.method2220(-1, arg0[2]);
            if (class28.field453 == -1) {
                if (arg0[2].equals("english")) {
                    class28.field453 = 0;
                } else if (arg0[2].equals("german")) {
                    class28.field453 = 1;
                } else {
                    class343.method2382(-64, "language");
                }
            }
            class17.method197((byte) -40, class28.field453);
            class115.field1849 = false;
            class32.field494 = false;
            if (arg0[3].equals("game0")) {
                class109.field1773 = 0;
            } else if (arg0[3].equals("game1")) {
                class109.field1773 = 1;
            } else {
                class343.method2382(-86, "game");
            }
            class77.field1212 = 0;
            class259.field3844 = "";
            class151.field2464 = 0;
            class144.field2342 = false;
            client var1 = new client();
            class5.field118 = var1;
            var1.method909(false, "runescape", class209.field3298 + 32, 544, 1024, 0, 29, 768);
            class139.field2247.setLocation(40, 40);
        } catch (Exception var3) {
            class79.method622((String) null, var3, -652852820);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 1719)
    public final void method914(byte arg0) {
        field4129++;
        method1864(113);
        class209.method1535((byte) 102);
        class91.method726((byte) 81);
        class109.method864(4);
        class282.method1983((byte) 88);
        class140.method1071((byte) -128);
        class243.method1717((byte) -81);
        class115.method904(114);
        class162.method1210();
        class14.method183(-33);
        class281.method1982(9568256);
        class242.method1709(-76);
        class1.method25(true);
        class41.method369(14709);
        class286.method2007(true);
        class217.method1570(3018);
        class36.method324(65536);
        class296.method2092((byte) -28);
        class120.method941(-1);
        class52.method423((byte) -117);
        class111.method874(-10139);
        class325.method2284(1044);
        class86.method685(58);
        class260.method1802((byte) -63);
        class53.method436(-80);
        class266.method1848((byte) 3);
        class108.method858(8);
        class92.method729(-111);
        class30.method270(76);
        class88.method696(-1491191832);
        class3.method72(7);
        class244.method1724(true);
        class315.method2227(-1);
        class16.method193((byte) 109);
        class201.method1421(-118);
        class331.method2323((byte) 103);
        class22.method223((byte) -65);
        class38.method337(124);
        class42.method382((byte) -6);
        class101.method825((byte) 78);
        class84.method672((byte) -77);
        class24.method227(true);
        class60.method491(false);
        class202.method1447(1);
        class322.method2266((byte) -37);
        class176.method1295(true);
        class64.method507(1793136328);
        class63.method505(23098);
        class117.method919((byte) 111);
        class113.method877(-111);
        class332.method2331(32);
        class171.method1277(-18686);
        class56.method473(-25693);
        class152.method1146((byte) -98);
        class207.method1528(-9359);
        class259.method1794(116);
        class185.method1343((byte) -9);
        class54.method460();
        class58.method482(-20761);
        class78.method616((byte) -110);
        class226.method1654((byte) -124);
        class165.method1239(-1);
        class305.method2165(124);
        class261.method1810();
        class289.method2033(256);
        class7.method123();
        class102.method829(119);
        class206.method1516();
        class135.method1047(0);
        class271.method1925();
        class339.method2351(-77);
        class274.method1948(false);
        class145.method1106((byte) 13);
        class122.method972(true);
        class177.method1306();
        class290.method2040();
        class62.method499(true);
        class316.method2231((byte) -116);
        class31.method279(1);
        class200.method1408(-78);
        class205.method1490();
        class61.method494(6);
        class218.method1581(-110);
        class222.method1619();
        class26.method238(0);
        class49.method416(-23071);
        class132.method1019();
        class219.method1588();
        class253.method1751((byte) -112);
        class89.method704(false);
        class13.method176(-6);
        class149.method1127((byte) 123);
        class181.method1323(-10912);
        class33.method295();
        class180.method1322(0);
        class2.method68((byte) -61);
        class139.method1068((byte) 23);
        class123.method980(86);
        class160.method1178((byte) -128);
        class183.method1332(54);
        class142.method1095(-82);
        class141.method1080((byte) 108);
        class255.method1762(1000);
        class340.method2356(false);
        class129.method1004(-107);
        class175.method1292((byte) -36);
        class66.method523(1);
        class74.method588((byte) 11);
        class18.method200(34);
        class6.method102((byte) 104);
        class250.method1737();
        class19.method202(0);
        class326.method2295((byte) -97);
        class225.method1645(95);
        class90.method717(true);
        class302.method2148();
        class264.method1827(false);
        class166.method1244((byte) 0);
        class321.method2260(-1);
        class277.method1968(65535);
        class128.method1001(false);
        class10.method150(-117);
        class314.method2208((byte) -43);
        class292.method2050();
        class40.method362();
        class20.method208(1);
        class198.method1400(-29575);
        class104.method841(127);
        class272.method1942((byte) -37);
        class44.method388(-111);
        class252.method1744();
        class75.method594(17349);
        class72.method582();
        class4.method87(-27355);
        class55.method467(false);
        class190.method1368(true);
        class150.method1137(true);
        class179.method1316((byte) -84);
        class256.method1768();
        class144.method1105(-54);
        class47.method404(5);
        class241.method1707((byte) 124);
        class106.method853(-37);
        class127.method996();
        class9.method146(77);
        class303.method2158(-1);
        class57.method477(20160);
        class278.method1969();
        class295.method2079();
        class215.method1559();
        class320.method2258(0);
        class112.method875(0);
        class46.method393();
        class114.method882();
        class287.method2020();
        class82.method644((byte) 36);
        class309.method2187(128);
        class80.method624((byte) -59);
        class173.method1282(-1);
        class170.method1270((byte) -94);
        class307.method2175((byte) 116);
        class71.method569((byte) -44);
        class45.method391(114);
        class77.method605(127);
        class275.method1954();
        class333.method2334(true);
        class124.method983((byte) -121);
        class121.method969(-116);
        class288.method2027((byte) 102);
        class76.method603(-1);
        class308.method2178(50);
        class68.method539(123);
        class83.method657(-67);
        class155.method1154(1);
        class167.method1247((byte) -110);
        class304.method2160(-4980);
        class147.method1118((byte) 107);
        class342.method2376(124);
        class233.method1681(-126);
        class174.method1284((byte) 101);
        class232.method1676(-102);
        class158.method1168(false);
        class334.method2335(5000);
        class5.method93((byte) -34);
        class311.method2197(0);
        class298.method2115();
        class146.method1111(2828);
        class107.method855(0);
        class337.method2348((byte) 20);
        class85.method679(32);
        class17.method196((byte) 79);
        class284.method1989((byte) -102);
        class324.method2278();
        class119.method934();
        class214.method1555(15228);
        class220.method1599((byte) -55);
        class126.method992(true);
        class276.method1959();
        class203.method1455();
        class204.method1458(31685);
        class285.method1991(2);
        class148.method1124();
        class154.method1151((byte) 127);
        class341.method2368();
        class98.method791();
        class237.method1697(86);
        class344.method2386((byte) 105);
        class297.method2103(2);
        class151.method1140(true);
        class21.method217((byte) -1);
        class251.method1742(2048);
        class216.method1564(-118);
        class318.method2252((byte) 79);
        class96.method782(65);
        class116.method917(true);
        class178.method1314(-100);
        class103.method840((byte) -23);
        class11.method158((byte) -1);
        class73.method584(1);
        class310.method2190(-1);
        class211.method1541((byte) -66);
        class70.method565((byte) 98);
        class95.method774(-93);
        class34.method314((byte) 115);
        class247.method1732((byte) 122);
        class156.method1163(0);
        class39.method343((byte) -118);
        class195.method1383((byte) -122);
        class221.method1616(124);
        class81.method634(3787757);
        class137.method1056(-24127);
        class323.method2277(true);
        class184.method1340(false);
        class48.method409(-789221);
        class319.method2253((byte) 80);
        class143.method1096(false);
        class273.method1946((byte) -36);
        class87.method688(3);
        class338.method2350(1);
        class208.method1530(114);
        class197.method1393(0);
        class258.method1792(2);
        class50.method418(0);
        class213.method1550(255);
        class164.method1237(false);
        class345.method2393((byte) -128);
        class328.method2303(4096);
        class130.method1007(-31845);
        class99.method802(false);
        class12.method168((byte) -82);
        class191.method1371(1078);
        class15.method189(-85);
        class28.method244(113);
        class169.method1264(-128);
        class229.method1666(-1);
        class131.method1011(63);
        class79.method620((byte) -23);
        class245.method1726(false);
        class110.method866(0);
        class299.method2121((byte) -65);
        class301.method2129(-40);
        class67.method534(0);
        class306.method2172(99);
        class227.method1660(false);
        class32.method285(-256);
        class93.method739((byte) -128);
        int var2 = -62 % ((24 - arg0) / 61);
        class172.method1279(8138);
        class37.method329(-133);
        class100.method806((byte) 119);
        class118.method926((byte) 124);
        class133.method1029(-120);
        class157.method1166((byte) -119);
        class313.method2205(-16872);
        class280.method1970(-1);
        class136.method1052(18098);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2006)
    public final void init() {
        field4136++;
        if (!this.method913(28030)) {
            return;
        }
        class60.field890 = Integer.parseInt(this.getParameter("worldid"));
        class260.field3874 = Integer.parseInt(this.getParameter("modewhere"));
        if (class260.field3874 < 0 || class260.field3874 > 1) {
            class260.field3874 = 0;
        }
        class209.field3298 = Integer.parseInt(this.getParameter("modewhat"));
        if (class209.field3298 < 0 || class209.field3298 > 2) {
            class209.field3298 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class67.field1020 = true;
        } else {
            class67.field1020 = false;
        }
        try {
            class28.field453 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class28.field453 = 0;
        }
        class17.method197((byte) -91, class28.field453);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class32.field494 = true;
        } else {
            class32.field494 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class115.field1849 = true;
        } else {
            class115.field1849 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class109.field1773 = 1;
        } else {
            class109.field1773 = 0;
        }
        try {
            class151.field2464 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class151.field2464 = 0;
        }
        class259.field3844 = this.getParameter("settings");
        if (class259.field3844 == null) {
            class259.field3844 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class77.field1212 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class77.field1212 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class144.field2342 = true;
        } else {
            class144.field2342 = false;
        }
        class5.field118 = this;
        this.method907(class209.field3298 + 32, true, 1544, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[[FBIII[[F[[IIBIIIBLtd;[[F)V", line = 2095)
    public static final void method1868(boolean arg0, float[][] arg1, byte arg2, int arg3, int arg4, int arg5, float[][] arg6, int[][] arg7, int arg8, byte arg9, int arg10, int arg11, int arg12, byte arg13, class256 arg14, float[][] arg15) {
        field4133++;
        int var16 = (arg5 << 8) + 255;
        int var17 = (arg11 << 8) + 255;
        int var18 = (arg3 << 8) + 255;
        int var19 = (arg4 << 8) + 255;
        int[] var20 = class122.field1995[arg2];
        int[] var21 = null;
        if (arg9 > -31) {
            method1870((byte) -15, -99L);
        }
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, var20[var23 + var23 + 1], var20[var23 + var23], (int[][]) null, arg7, arg13, -8515, false, arg8, arg1, arg6, var18);
        }
        if (arg0) {
            if (arg2 == 1) {
                var21 = new int[6];
                int var25 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 128, 64, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                int var26 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 64, 128, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21[2] = var22[2];
                var21[5] = var22[2];
                var21[1] = var25;
                var21[3] = var25;
                var21[0] = var26;
                var21[4] = var22[0];
            } else if (arg2 == 2) {
                var21 = new int[6];
                int var42 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 128, 128, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                int var43 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 0, 64, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21[1] = var43;
                var21[3] = var42;
                var21[2] = var42;
                var21[0] = var22[0];
                var21[5] = var22[0];
                var21[4] = var22[1];
            } else if (arg2 == 3) {
                var21 = new int[6];
                int var27 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 128, 0, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                int var28 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 0, 64, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21[1] = var22[1];
                var21[3] = var27;
                var21[0] = var22[2];
                var21[4] = var28;
                var21[2] = var27;
                var21[5] = var22[2];
            } else if (arg2 == 4) {
                int var29 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 128, 0, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21 = new int[] { var22[3], var29, var22[0] };
            } else if (arg2 == 5) {
                int var30 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 128, 128, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21 = new int[] { var22[2], var30, var22[3] };
            } else if (arg2 == 6) {
                var21 = new int[6];
                int var31 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 0, 128, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                int var32 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 128, 128, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21[1] = var31;
                var21[0] = var22[3];
                var21[4] = var22[0];
                var21[2] = var32;
                var21[3] = var32;
                var21[5] = var22[3];
            } else if (arg2 == 7) {
                var21 = new int[6];
                int var40 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 128, 0, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                int var41 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 0, 128, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21[3] = var40;
                var21[2] = var40;
                var21[4] = var22[2];
                var21[0] = var22[1];
                var21[1] = var41;
                var21[5] = var22[1];
            } else if (arg2 == 8) {
                int var39 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 0, 0, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21 = new int[] { var22[3], var39, var22[4] };
            } else if (arg2 == 9) {
                var21 = new int[15];
                int var33 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 64, 128, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                int var34 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 32, 96, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                int var35 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 0, 64, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21[1] = var33;
                var21[6] = var34;
                var21[13] = var22[1];
                var21[14] = var35;
                var21[0] = var34;
                var21[11] = var22[1];
                var21[2] = var22[4];
                var21[4] = var22[4];
                var21[12] = var34;
                var21[8] = var22[2];
                var21[3] = var34;
                var21[9] = var34;
                var21[5] = var22[3];
                var21[7] = var22[3];
                var21[10] = var22[2];
            } else if (arg2 == 10) {
                var21 = new int[9];
                int var36 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 128, 0, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21[1] = var36;
                var21[4] = var36;
                var21[0] = var22[2];
                var21[7] = var36;
                var21[6] = var22[4];
                var21[8] = var22[0];
                var21[2] = var22[3];
                var21[3] = var22[3];
                var21[5] = var22[4];
            } else if (arg2 == 11) {
                var21 = new int[12];
                int var37 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 64, 0, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                int var38 = class218.method1575(var17, var19, 0.0F, arg15, arg14, arg10, var16, 64, 128, (int[][]) null, arg7, arg13, -8515, true, arg8, arg1, arg6, var18);
                var21[7] = var38;
                var21[5] = var37;
                var21[0] = var22[3];
                var21[2] = var22[0];
                var21[1] = var37;
                var21[4] = var22[2];
                var21[10] = var22[1];
                var21[11] = var38;
                var21[8] = var37;
                var21[6] = var22[2];
                var21[3] = var22[3];
                var21[9] = var22[2];
            }
        }
        arg14.method1772(arg12, arg8, arg10, var22, var21, false);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V", line = 2369)
    private final void method1869(byte arg0) {
        field4128++;
        if (class53.field809.field4483 > class44.field700) {
            if (class166.field2679 == class10.field237) {
                class166.field2679 = class247.field3681;
            } else {
                class166.field2679 = class10.field237;
            }
            class305.field4852 = (class53.field809.field4483 - 1) * 250;
            if (class305.field4852 > 3000) {
                class305.field4852 = 3000;
            }
            if (class53.field809.field4483 >= 2 && class53.field809.field4484 == 6) {
                this.method902((byte) 21, "js5connect_outofdate");
                class289.field4548 = 1000;
                return;
            }
            if (class53.field809.field4483 >= 4 && class53.field809.field4484 == -1) {
                this.method902((byte) 21, "js5crc");
                class289.field4548 = 1000;
                return;
            }
            if (class53.field809.field4483 >= 4 && (class289.field4548 == 0 || class289.field4548 == 5)) {
                if (class53.field809.field4484 == 7 || class53.field809.field4484 == 9) {
                    this.method902((byte) 21, "js5connect_full");
                } else if (class53.field809.field4484 <= 0) {
                    this.method902((byte) 21, "js5io");
                } else {
                    this.method902((byte) 21, "js5connect");
                }
                class289.field4548 = 1000;
                return;
            }
        }
        class44.field700 = class53.field809.field4483;
        if (class305.field4852 > 0) {
            class305.field4852--;
            return;
        }
        try {
            if (arg0 != -73) {
                field4130 = 27;
            }
            if (class172.field2766 == 0) {
                class156.field2564 = class92.field1484.method549(class342.field5303, class166.field2679, (byte) 92);
                class172.field2766++;
            }
            if (class172.field2766 == 1) {
                if (class156.field2564.field405 == 2) {
                    this.method1872(-75, 1000);
                    return;
                }
                if (class156.field2564.field405 == 1) {
                    class172.field2766++;
                }
            }
            if (class172.field2766 == 2) {
                class88.field1418 = new class41((Socket) class156.field2564.field409, class92.field1484);
                class1 var2 = new class1(5);
                var2.method21(arg0 + 156, 15);
                var2.method11(544, 31932);
                class88.field1418.method373(arg0 + 74, 0, var2.field34, 5);
                class172.field2766++;
                class67.field1014 = class212.method1543(22326);
            }
            if (class172.field2766 == 3) {
                if (class289.field4548 == 0 || class289.field4548 == 5 || class88.field1418.method370((byte) 124) > 0) {
                    int var3 = class88.field1418.method372(arg0 + 73);
                    if (var3 != 0) {
                        this.method1872(112, var3);
                        return;
                    }
                    class172.field2766++;
                } else if ((class212.method1543(22326) - class67.field1014) > 30000L) {
                    this.method1872(-126, 1001);
                    return;
                }
            }
            if (class172.field2766 == 4) {
                boolean var4 = class289.field4548 == 5 || class289.field4548 == 10 || class289.field4548 == 28;
                class53.field809.method2003(class88.field1418, !var4, (byte) -119);
                class156.field2564 = null;
                class172.field2766 = 0;
                class88.field1418 = null;
            }
        } catch (IOException var6) {
            this.method1872(-89, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V", line = 2511)
    public static final void method1870(byte arg0, long arg1) {
        if (!class126.field2018) {
            class86.field1388 += (float) arg1 * class104.field1712 / 40.0F;
            class171.field2747 += (float) arg1 * class217.field3376 / 40.0F;
        }
        int var3 = -66 % ((arg0 + 60) / 34);
        int var4 = class294.field4694 + class345.field5363.field4671;
        field4125++;
        int var5 = class144.field2331 + class345.field5363.field4672;
        if (class306.field4858 - var4 < -500 || class306.field4858 - var4 > 500 || class2.field77 - var5 < -500 || class2.field77 - var5 > 500) {
            class2.field77 = var5;
            class306.field4858 = var4;
        }
        if (class306.field4858 != var4) {
            int var6 = var4 - class306.field4858;
            int var7 = (int) ((long) var6 * arg1 / 320L);
            if (var6 > 0) {
                if (var7 == 0) {
                    var7 = 1;
                } else if (var6 < var7) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = -1;
            } else if (var7 < var6) {
                var7 = var6;
            }
            class306.field4858 += var7;
        }
        if (class2.field77 != var5) {
            int var8 = var5 - class2.field77;
            int var9 = (int) ((long) var8 * arg1 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var9 < var8) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var8 < var9) {
                var9 = var8;
            }
            class2.field77 += var9;
        }
        class58.method484(false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V", line = 2601)
    private final void method1871(boolean arg0, byte[] arg1) {
        if (!arg0) {
            field4119 = -105;
        }
        field4123++;
        class1 var3 = new class1(arg1);
        while (true) {
            int var4 = var3.method15((byte) 116);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                int[] var5 = class36.field532 = new int[6];
                var5[0] = var3.method56(19612);
                var5[1] = var3.method56(19612);
                var5[2] = var3.method56(19612);
                var5[3] = var3.method56(19612);
                var5[4] = var3.method56(19612);
                var5[5] = var3.method56(19612);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 2639)
    private final void method1872(int arg0, int arg1) {
        class172.field2766 = 0;
        field4118++;
        class88.field1418 = null;
        class156.field2564 = null;
        int var3 = -20 / ((36 - arg0) / 44);
        class53.field809.field4484 = arg1;
        class53.field809.field4483++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2657)
    private final void method1873(int arg0) {
        field4132++;
        for (class185.field2930 = 0; class103.method839(-14632) && class185.field2930 < 128; class185.field2930++) {
            class113.field1832[class185.field2930] = class217.field3371;
            class338.field5217[class185.field2930] = class327.field5115;
        }
        class137.field2241++;
        if (class168.field2707 != -1) {
            class160.method1175(class211.field3314, false, class168.field2707, 0, 0, 0, 0, class338.field5219);
        }
        class200.field3060++;
        if (class162.field2623) {
            int var2 = 2359807;
            label200: for (int var3 = 0; var3 < 32768; var3++) {
                class86 var4 = class197.field3029[var3];
                if (var4 != null) {
                    byte var5 = var4.field1381.field1330;
                    if ((var5 & 0x2) > 0 && var4.field4645 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field4709[0] = 1;
                            var4.field4643[0] = (var4.field4671 >> 7) + var6;
                            var4.field4619[0] = (var4.field4672 >> 7) + var7;
                            class166.field2686[class75.field1153].method439(0, 131072, var4.field4672 >> 7, false, var4.method738(-6421), var4.field4671 >> 7, false, var4.method738(-6421));
                            if (var4.field4643[0] >= 0 && var4.field4643[0] <= 104 - var4.method738(arg0 ^ 0x191A) && var4.field4619[0] >= 0 && var4.field4619[0] <= (104 - var4.method738(arg0 - 6406)) && class166.field2686[class75.field1153].method451(var4.field4619[0], var4.field4672 >> 7, arg0 ^ 0xFFFFFFF1, var4.field4671 >> 7, var4.field4643[0])) {
                                if (var4.method738(-6421) > 1) {
                                    for (int var8 = var4.field4643[0]; var4.field4643[0] + var4.method738(arg0 ^ 0x191A) > var8; var8++) {
                                        for (int var9 = var4.field4619[0]; (var4.field4619[0] + var4.method738(-6421)) > var9; var9++) {
                                            if ((class166.field2686[class75.field1153].field796[var8][var9] & var2) != 0) {
                                                continue label200;
                                            }
                                        }
                                    }
                                }
                                var4.field4645 = 1;
                            }
                        }
                    }
                    class289.method2038((byte) 112, var4);
                    class36.method328(var4, false);
                    class6.method95(1, var4);
                    class166.field2686[class75.field1153].method435(var4.method738(-6421), var4.field4671 >> 7, (byte) -75, false, var4.field4672 >> 7, var4.method738(-6421), false);
                }
            }
        }
        if (!class162.field2623 && class109.field1773 == 0) {
            class133.method1028((byte) -91);
        } else if (class107.field1758 == 0 && class74.field1118 == 0) {
            if (class73.field1112 == 2) {
                class71.method572((byte) 73);
            } else {
                class258.method1790(-4422);
            }
            if ((class152.field2498 >> 7) < 14 || (class152.field2498 >> 7) >= 90 || class137.field2239 >> 7 < 14 || class137.field2239 >> 7 >= 90) {
                class61.method492((byte) -126);
            }
        }
        while (true) {
            class150 var10;
            class266 var11;
            class266 var12;
            do {
                var10 = (class150) class299.field4787.method275(arg0 ^ 0xE);
                if (var10 == null) {
                    while (true) {
                        class150 var13;
                        class266 var14;
                        class266 var15;
                        do {
                            var13 = (class150) class247.field3675.method275(-1);
                            if (var13 == null) {
                                while (true) {
                                    class150 var16;
                                    class266 var17;
                                    class266 var18;
                                    do {
                                        var16 = (class150) class44.field698.method275(-1);
                                        if (var16 == null) {
                                            if (arg0 != -15) {
                                                this.method908((byte) 69);
                                            }
                                            if (class86.field1377 != null) {
                                                class306.method2171(true);
                                            }
                                            if (class157.field2575 != null && class157.field2575.field405 == 1) {
                                                if (class157.field2575.field409 != null) {
                                                    class149.method1129(class255.field3753, class308.field4882, (byte) 116);
                                                }
                                                class255.field3753 = null;
                                                class308.field4882 = false;
                                                class157.field2575 = null;
                                            }
                                            if (class307.field4869 % 1500 == 0) {
                                                class289.method2036(true);
                                            }
                                            return;
                                        }
                                        var17 = var16.field2458;
                                        if (var17.field3958 < 0) {
                                            break;
                                        }
                                        var18 = class171.method1276(var17.field3926, (byte) 62);
                                    } while (var18 == null || var18.field3994 == null || var18.field3994.length <= var17.field3958 || var18.field3994[var17.field3958] != var17);
                                    class172.method1280(var16, (byte) 12);
                                }
                            }
                            var14 = var13.field2458;
                            if (var14.field3958 < 0) {
                                break;
                            }
                            var15 = class171.method1276(var14.field3926, (byte) -123);
                        } while (var15 == null || var15.field3994 == null || var14.field3958 >= var15.field3994.length || var15.field3994[var14.field3958] != var14);
                        class172.method1280(var13, (byte) 12);
                    }
                }
                var11 = var10.field2458;
                if (var11.field3958 < 0) {
                    break;
                }
                var12 = class171.method1276(var11.field3926, (byte) -126);
            } while (var12 == null || var12.field3994 == null || var11.field3958 >= var12.field3994.length || var12.field3994[var11.field3958] != var11);
            class172.method1280(var10, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 2875)
    public final void method900(byte arg0) {
        field4122++;
        if (class289.field4548 == 1000) {
            return;
        }
        long var2 = class42.method380((byte) -113) / 1000000L - class245.field3663;
        class245.field3663 = class42.method380((byte) -113) / 1000000L;
        boolean var4 = class66.method531((byte) -96);
        if (var4 && class188.field2957 && class55.field837 != null) {
            class55.field837.method2316(111);
        }
        if ((class289.field4548 == 30 || class289.field4548 == 10) && (class313.field4930 || class140.field2263 != 0L && class140.field2263 < class212.method1543(22326))) {
            class184.method1342(-1, class146.field2393, class73.field1105, class313.field4930, class101.method823(-40));
        }
        if (class244.field3646 == null) {
            Container var5;
            if (class244.field3646 != null) {
                var5 = class244.field3646;
            } else if (class139.field2247 == null) {
                var5 = class92.field1484.field1037;
            } else {
                var5 = class139.field2247;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class139.field2247 == var5) {
                Insets var8 = class139.field2247.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class1.field46 != var6 || class294.field4625 != var7) {
                if (class69.field1047.startsWith("mac")) {
                    class1.field46 = var6;
                    class294.field4625 = var7;
                } else {
                    class28.method248(61);
                }
                class140.field2263 = class212.method1543(22326) + 500L;
            }
        }
        if (class244.field3646 != null && !class281.field4413 && (class289.field4548 == 30 || class289.field4548 == 10)) {
            class184.method1342(-1, -1, -1, false, class101.field1636);
        }
        boolean var9 = false;
        if (class49.field752) {
            class49.field752 = false;
            var9 = true;
        }
        if (arg0 <= 33) {
            return;
        }
        if (var9) {
            class310.method2192(-97);
        }
        if (class162.field2623) {
            for (int var10 = 0; var10 < 100; var10++) {
                class280.field4378[var10] = true;
            }
        }
        if (class289.field4548 == 0) {
            class149.method1133(class44.field696, (byte) 103, var9, class126.field2019, (Color) null);
        } else if (class289.field4548 == 5) {
            class257.method1781(false, class146.field2392, -4535);
        } else if (class289.field4548 == 10) {
            class308.method2181(false);
        } else if (class289.field4548 == 25 || class289.field4548 == 28) {
            if (class270.field4168 == 1) {
                if (class68.field1030 > class309.field4885) {
                    class309.field4885 = class68.field1030;
                }
                int var11 = (class309.field4885 - class68.field1030) * 50 / class309.field4885;
                class121.method968(class244.field3655 + "<br>(" + var11 + "%)", (byte) -52, false);
            } else if (class270.field4168 == 2) {
                if (class174.field2786 > class24.field412) {
                    class24.field412 = class174.field2786;
                }
                int var12 = ((class24.field412 - class174.field2786) * 50 / class24.field412) + 50;
                class121.method968(class244.field3655 + "<br>(" + var12 + "%)", (byte) -50, false);
            } else {
                class121.method968(class244.field3655, (byte) -128, false);
            }
        } else if (class289.field4548 == 30) {
            class221.method1606((byte) -65, var2);
        } else if (class289.field4548 == 40) {
            class121.method968(class120.field1971 + "<br>" + class184.field2922, (byte) -81, false);
        }
        if (class162.field2623 && class289.field4548 != 0) {
            class162.method1201();
            for (int var19 = 0; var19 < class288.field4545; var19++) {
                class282.field4415[var19] = false;
            }
        } else if ((class289.field4548 == 30 || class289.field4548 == 10) && class16.field329 == 0 && !var9) {
            try {
                Graphics var13 = class334.field5197.getGraphics();
                for (int var14 = 0; var14 < class288.field4545; var14++) {
                    if (class282.field4415[var14]) {
                        class101.field1666.method1289(var13, class277.field4356[var14], class211.field3315[var14], class301.field4798[var14], class11.field250[var14], -111);
                        class282.field4415[var14] = false;
                    }
                }
            } catch (Exception var21) {
                class334.field5197.repaint();
            }
        } else if (class289.field4548 != 0) {
            try {
                Graphics var16 = class334.field5197.getGraphics();
                class101.field1666.method1290(-1, var16, 0, 0);
                for (int var17 = 0; var17 < class288.field4545; var17++) {
                    class282.field4415[var17] = false;
                }
            } catch (Exception var20) {
                class334.field5197.repaint();
            }
        }
        if (class91.field1457) {
            class128.method1000((byte) -77);
        }
        if (class306.field4859 && class289.field4548 == 10 && class168.field2707 != -1) {
            class306.field4859 = false;
            class281.method1976(class92.field1484, -7136);
        }
    }
}
