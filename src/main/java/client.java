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
public class client extends class205 {

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lce;")
    public static class126 field2072 = class206.method1445(-7923, "jaune:");

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2058 = 1;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lce;")
    public static class126 field2066 = class206.method1445(-7923, "comp-Btence ");

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lce;")
    public static class126 field2074 = class206.method1445(-7923, "name_icons");

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lvj;")
    public static class184 field2076;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    public static boolean field2077;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[Ljk;")
    public static class273[] field2075;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 14)
    private final void method803(int arg0) {
        if (!class228.field3846) {
            label239: while (true) {
                do {
                    if (!class296.method2001((byte) -43)) {
                        break label239;
                    }
                } while (class190.field3261 != 115 && class190.field3261 != 83);
                class228.field3846 = true;
            }
        }
        if (arg0 != 23) {
            method805(false);
        }
        field2059++;
        if (class166.field2962 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class261.method1765(16299);
            if (class255.field4298 == 0L) {
                class255.field4298 = var4;
            }
            if (var3 > 16384 && (var4 - class255.field4298) < 5000L) {
                if ((var4 - class214.field3646) > 1000L) {
                    System.gc();
                    class214.field3646 = var4;
                }
                class131.field2256 = class16.field218;
                class21.field280 = 5;
            } else {
                class166.field2962 = 10;
                class131.field2256 = class93.field1455;
                class21.field280 = 5;
            }
        } else if (class166.field2962 == 10) {
            class256.method1739(4, 104, 104);
            for (int var6 = 0; var6 < 4; var6++) {
                class94.field1475[var6] = new class32(104, 104);
            }
            class21.field280 = 10;
            class131.field2256 = class40.field641;
            class166.field2962 = 30;
        } else if (class166.field2962 == 30) {
            if (class64.field1085 == null) {
                class64.field1085 = new class87(class200.field3405, class195.field3356);
            }
            if (class64.field1085.method611(arg0 + 92)) {
                class167.field2971 = class195.method1391(true, 0, true, false, (byte) -96);
                class293.field4864 = class195.method1391(true, 1, true, false, (byte) -96);
                class91.field1423 = class195.method1391(true, 2, false, true, (byte) -96);
                class12.field161 = class195.method1391(true, 3, true, false, (byte) -96);
                class273.field4598 = class195.method1391(true, 4, true, false, (byte) -96);
                class168.field3000 = class195.method1391(true, 5, true, true, (byte) -96);
                class4.field28 = class195.method1391(false, 6, true, true, (byte) -96);
                class309.field5239 = class195.method1391(true, 7, true, false, (byte) -96);
                class127.field2170 = class195.method1391(true, 8, true, false, (byte) -96);
                class273.field4589 = class195.method1391(true, 9, true, false, (byte) -96);
                class228.field3840 = class195.method1391(true, 10, true, false, (byte) -96);
                class112.field1756 = class195.method1391(true, 11, true, false, (byte) -96);
                class70.field1148 = class195.method1391(true, 12, true, false, (byte) -96);
                class274.field4612 = class195.method1391(true, 13, true, false, (byte) -96);
                class73.field1166 = class195.method1391(false, 14, true, false, (byte) -96);
                class266.field4510 = class195.method1391(true, 15, true, false, (byte) -96);
                class280.field4654 = class195.method1391(true, 16, true, false, (byte) -96);
                class68.field1124 = class195.method1391(true, 17, true, false, (byte) -96);
                class148.field2729 = class195.method1391(true, 18, true, false, (byte) -96);
                class161.field2904 = class195.method1391(true, 19, true, false, (byte) -96);
                class153.field2795 = class195.method1391(true, 20, true, false, (byte) -96);
                class40.field646 = class195.method1391(true, 21, true, false, (byte) -96);
                class279.field4644 = class195.method1391(true, 22, true, false, (byte) -96);
                class165.field2942 = class195.method1391(true, 23, true, true, (byte) -96);
                class301.field4999 = class195.method1391(true, 24, true, false, (byte) -96);
                class93.field1450 = class195.method1391(true, 25, true, false, (byte) -96);
                class21.field278 = class195.method1391(true, 26, true, true, (byte) -96);
                class283.field4711 = class195.method1391(true, 27, true, false, (byte) -96);
                class21.field280 = 15;
                class131.field2256 = class81.field1302;
                class166.field2962 = 40;
            } else {
                class21.field280 = 12;
                class131.field2256 = class244.field4125;
            }
        } else if (class166.field2962 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class293.field4868[var8].method1388((byte) -87) * class159.field2860[var8] / 100;
            }
            if (var7 == 100) {
                class131.field2256 = class45.field692;
                class21.field280 = 20;
                class126.method871(true, class127.field2170);
                class294.method1948(86, class127.field2170);
                class45.method280(class127.field2170, (byte) 92);
                class166.field2962 = 45;
            } else {
                if (var7 != 0) {
                    class131.field2256 = class12.method69(new class126[] { class285.field4722, class195.method1386((byte) 20, var7), class189.field3243 }, (byte) 120);
                }
                class21.field280 = 20;
            }
        } else if (class166.field2962 == 45) {
            class33.method177(-29991, 22050, 2, class280.field4660);
            class106.field1669 = new class307();
            class106.field1669.method2064(128, -16385, 9);
            class118.field1993 = class175.method1268(false, class24.field342, 0, 22050, class161.field2907);
            class118.field1993.method1053(0, class106.field1669);
            class252.method1707(1, class106.field1669, class273.field4598, class266.field4510, class73.field1166);
            class125.field2109 = class175.method1268(false, class24.field342, 1, 2048, class161.field2907);
            class278.field4633 = new class79();
            class125.field2109.method1053(0, class278.field4633);
            class84.field1340 = new class315(22050, class102.field1633);
            class238.field4014 = class4.field28.method2176(class70.field1149, 0);
            class21.field280 = 30;
            class166.field2962 = 50;
            class131.field2256 = class166.field2964;
        } else if (class166.field2962 == 50) {
            int var9 = class274.method1834(class274.field4612, class127.field2170, -17232);
            int var10 = class7.method37((byte) -68);
            if (var10 > var9) {
                class131.field2256 = class12.method69(new class126[] { class320.field5488, class195.method1386((byte) 20, var9 * 100 / var10), class189.field3243 }, (byte) 121);
                class21.field280 = 35;
            } else {
                class166.field2962 = 60;
                class131.field2256 = class89.field1399;
                class21.field280 = 35;
            }
        } else if (class166.field2962 == 60) {
            int var11 = class314.method2191(class127.field2170, (byte) 83);
            int var12 = class282.method1887(arg0 ^ 0x17);
            if (var11 < var12) {
                class131.field2256 = class12.method69(new class126[] { class59.field946, class195.method1386((byte) 20, var11 * 100 / var12), class189.field3243 }, (byte) 120);
                class21.field280 = 40;
            } else {
                class21.field280 = 40;
                class166.field2962 = 65;
                class131.field2256 = class27.field381;
            }
        } else if (class166.field2962 == 65) {
            class44.method274((byte) 79, class127.field2170, class274.field4612);
            class131.field2256 = class242.field4101;
            class21.field280 = 45;
            class280.method1872(-91, 5);
            class166.field2962 = 70;
        } else if (class166.field2962 == 70) {
            class91.field1423.method2172(24103);
            byte var18 = 0;
            int var19 = var18 + class91.field1423.method2170(110);
            class280.field4654.method2172(24103);
            int var20 = var19 + class280.field4654.method2170(94);
            class68.field1124.method2172(24103);
            int var21 = var20 + class68.field1124.method2170(-29);
            class148.field2729.method2172(24103);
            int var22 = var21 + class148.field2729.method2170(arg0 ^ 0x4E);
            class161.field2904.method2172(24103);
            int var23 = var22 + class161.field2904.method2170(100);
            class153.field2795.method2172(24103);
            int var24 = var23 + class153.field2795.method2170(-48);
            class40.field646.method2172(arg0 ^ 0x5E30);
            int var25 = var24 + class40.field646.method2170(-94);
            class279.field4644.method2172(24103);
            int var26 = var25 + class279.field4644.method2170(arg0 ^ 0xFFFFFFA1);
            class301.field4999.method2172(24103);
            int var27 = var26 + class301.field4999.method2170(-101);
            class93.field1450.method2172(24103);
            int var28 = var27 + class93.field1450.method2170(arg0 - 64);
            class283.field4711.method2172(arg0 + 24080);
            int var29 = var28 + class283.field4711.method2170(-60);
            if (var29 >= 1100) {
                class298.method2013(arg0 + 105, class91.field1423);
                class157.method1141(class91.field1423, (byte) -115);
                class251.method1698(0, class91.field1423);
                class181.method1299(class91.field1423, class309.field5239, (byte) -76);
                class10.method58(-22413, true, class309.field5239, class280.field4654);
                class81.method580((byte) 63, class148.field2729, class309.field5239);
                class74.method535(class161.field2904, -1, class209.field3592, true, class309.field5239);
                class128.method888(class91.field1423, false);
                class54.method339(class153.field2795, class167.field2971, (byte) 27, class293.field4864);
                class74.method538(arg0 - 21, class40.field646, class309.field5239);
                class262.method1768(-15198, class279.field4644);
                class41.method260(class91.field1423, (byte) 30);
                class47.method295(class309.field5239, class12.field161, class274.field4612, (byte) 34, class127.field2170);
                class128.method891(class91.field1423, -119);
                class166.method1219((byte) 21, class68.field1124);
                class15.method83(true, class93.field1450, new class213(), class301.field4999);
                class158.method1163(class93.field1450, class301.field4999, arg0 ^ 0xD80);
                class307.method2068(class127.field2170, class91.field1423, -14470);
                class131.field2256 = class177.field3123;
                class21.field280 = 50;
                class281.method1883((byte) -115);
                class166.field2962 = 80;
            } else {
                class131.field2256 = class12.method69(new class126[] { class170.field3031, class195.method1386((byte) 20, var29 / 11), class189.field3243 }, (byte) 119);
                class21.field280 = 50;
            }
        } else if (class166.field2962 == 80) {
            int var16 = class44.method272(class127.field2170, arg0 ^ 0x15);
            int var17 = class175.method1269(false);
            if (var17 > var16) {
                class131.field2256 = class12.method69(new class126[] { class75.field1218, class195.method1386((byte) 20, var16 * 100 / var17), class189.field3243 }, (byte) 120);
                class21.field280 = 60;
            } else {
                class286.method1901(class127.field2170, arg0 - 23);
                class131.field2256 = class270.field4561;
                class21.field280 = 60;
                class166.field2962 = 90;
            }
        } else if (class166.field2962 == 90) {
            if (class21.field278.method2172(24103)) {
                class232 var13 = new class232(class273.field4589, class21.field278, class127.field2170, 20, !class214.field3644);
                class236.method1615(var13);
                if (class287.field4776 == 1) {
                    class236.method1614(0.9F);
                }
                if (class287.field4776 == 2) {
                    class236.method1614(0.8F);
                }
                if (class287.field4776 == 3) {
                    class236.method1614(0.7F);
                }
                if (class287.field4776 == 4) {
                    class236.method1614(0.6F);
                }
                class131.field2256 = class45.field696;
                class166.field2962 = 100;
                class21.field280 = 70;
            } else {
                class131.field2256 = class12.method69(new class126[] { class90.field1416, class195.method1386((byte) 20, class21.field278.method2170(-52)), class189.field3243 }, (byte) 119);
                class21.field280 = 70;
            }
        } else if (class166.field2962 == 100) {
            if (class219.method1502(class127.field2170, (byte) -124)) {
                class166.field2962 = 110;
            }
        } else if (class166.field2962 == 110) {
            class125.field2106 = new class100();
            class161.field2907.method1105(8, class125.field2106, 10);
            class21.field280 = 75;
            class131.field2256 = class252.field4220;
            class166.field2962 = 120;
        } else if (class166.field2962 == 120) {
            if (class228.field3840.method2169(arg0 - 93, class224.field3772, class153.field2801)) {
                class289 var14 = new class289(class228.field3840.method2157((byte) -57, class153.field2801, class224.field3772));
                class50.method320(var14, -96);
                class131.field2256 = class291.field4818;
                class166.field2962 = 130;
                class21.field280 = 80;
            } else {
                class131.field2256 = class12.method69(new class126[] { class32.field462, class69.field1130 }, (byte) 127);
                class21.field280 = 80;
            }
        } else if (class166.field2962 == 130) {
            if (!class12.field161.method2172(arg0 ^ 0x5E30)) {
                class131.field2256 = class12.method69(new class126[] { class159.field2869, class195.method1386((byte) 20, class12.field161.method2170(108) * 3 / 4), class189.field3243 }, (byte) 118);
                class21.field280 = 85;
            } else if (!class70.field1148.method2172(24103)) {
                class131.field2256 = class12.method69(new class126[] { class159.field2869, class195.method1386((byte) 20, class70.field1148.method2170(91) / 10 + 75), class189.field3243 }, (byte) 125);
                class21.field280 = 85;
            } else if (!class274.field4612.method2172(24103)) {
                class131.field2256 = class12.method69(new class126[] { class159.field2869, class195.method1386((byte) 20, class274.field4612.method2170(arg0 + 70) / 20 + 85), class189.field3243 }, (byte) 126);
                class21.field280 = 85;
            } else if (class165.field2942.method2161(class278.field4629, -63)) {
                class17.method96(class279.field4645, class165.field2942, class303.field5047, (byte) 127, class18.field247, class19.field265, class174.field3072);
                class21.field280 = 95;
                class131.field2256 = class74.field1202;
                class166.field2962 = 135;
            } else {
                class131.field2256 = class12.method69(new class126[] { class159.field2869, class195.method1386((byte) 20, class165.field2942.method2159((byte) -62, class278.field4629) / 10 + 90), class189.field3243 }, (byte) 127);
                class21.field280 = 85;
            }
        } else if (class166.field2962 == 135) {
            int var15 = class117.method768(true);
            if (var15 == -1) {
                class21.field280 = 95;
                class131.field2256 = class130.field2242;
            } else if (var15 == 7 || var15 == 9) {
                this.method1439(true, "worldlistfull");
                class280.method1872(-105, 1000);
            } else if (class46.field712) {
                class21.field280 = 96;
                class131.field2256 = class32.field475;
                class166.field2962 = 140;
            } else {
                this.method1439(true, "worldlistio_" + var15);
                class280.method1872(arg0 ^ 0xFFFFFFA4, 1000);
            }
        } else if (class166.field2962 == 140) {
            class85.field1357 = class12.field161.method2176(class152.field2793, 0);
            class168.field3000.method2160(-86, false, true);
            class4.field28.method2160(arg0 ^ 0xFFFFFFAF, true, true);
            class127.field2170.method2160(arg0 + 91, true, true);
            class274.field4612.method2160(122, true, true);
            class228.field3840.method2160(118, true, true);
            class12.field161.method2160(arg0 ^ 0x67, true, true);
            class131.field2256 = class88.field1383;
            class166.field2962 = 150;
            class300.field4965 = true;
            class21.field280 = 97;
        } else if (class166.field2962 == 150) {
            class149.method1115();
            if (class228.field3846) {
                class22.field300 = 0;
                class226.field3814 = 0;
                class71.field1163 = 0;
                class189.field3242 = 0;
            }
            class228.field3846 = true;
            class123.method823(-21165, class161.field2907);
            class152.method1134(-1, class189.field3242, -1, false, -1);
            class21.field280 = 100;
            class131.field2256 = class318.field5457;
            class166.field2962 = 160;
        } else if (class166.field2962 == 160) {
            class144.method1054((byte) 5, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwd;)I", line = 520)
    public static final int method804(class112 arg0) {
        class27 var1 = (class27) class183.field3191.method1631(false, ((long) arg0.field1833 << 32) + (long) arg0.field1875);
        return var1 == null ? arg0.field1869 : var1.field383;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 536)
    public static void method805(boolean arg0) {
        if (arg0) {
            return;
        }
        field2066 = null;
        field2072 = null;
        field2075 = null;
        field2074 = null;
        field2076 = null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 567)
    public static final void method806(int arg0) {
        int var1 = class183.field3192 + class286.field4744.field2461;
        int var2 = class71.field1160 + class286.field4744.field2487;
        field2055++;
        if (arg0 != 0) {
            field2074 = (class126) null;
        }
        if ((class317.field5430 - var1) < -500 || class317.field5430 - var1 > 500 || (class119.field1999 - var2) < -500 || (class119.field1999 - var2) > 500) {
            class119.field1999 = var2;
            class317.field5430 = var1;
        }
        if (class317.field5430 != var1) {
            class317.field5430 += (var1 - class317.field5430) / 16;
        }
        if (class119.field1999 != var2) {
            class119.field1999 += (var2 - class119.field1999) / 16;
        }
        if (class68.field1121) {
            for (int var3 = 0; var3 < class105.field1660; var3++) {
                int var4 = class241.field4083[var3];
                if (var4 == 98) {
                    class292.field4832 = class292.field4832 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class292.field4832 = class292.field4832 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class144.field2618 = class144.field2618 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class144.field2618 = class144.field2618 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class217.field3655[98]) {
                class158.field2857 += (12 - class158.field2857) / 2;
            } else if (class217.field3655[99]) {
                class158.field2857 += (-class158.field2857 - 12) / 2;
            } else {
                class158.field2857 /= 2;
            }
            class292.field4832 += class158.field2857 / 2;
            if (class217.field3655[96]) {
                class36.field536 += (-class36.field536 - 24) / 2;
            } else if (class217.field3655[97]) {
                class36.field536 += (24 - class36.field536) / 2;
            } else {
                class36.field536 /= 2;
            }
            class144.field2618 += class36.field536 / 2;
        }
        class234.method1592((byte) -102);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lce;Lce;IILce;I)V", line = 648)
    public static final void method807(class126 arg0, class126 arg1, int arg2, int arg3, class126 arg4, int arg5) {
        field2060++;
        int var6 = 4 % ((arg2 + 9) / 33);
        for (int var7 = 99; var7 > 0; var7--) {
            class122.field2040[var7] = class122.field2040[var7 - 1];
            class48.field744[var7] = class48.field744[var7 - 1];
            class169.field3005[var7] = class169.field3005[var7 - 1];
            class172.field3034[var7] = class172.field3034[var7 - 1];
            class290.field4814[var7] = class290.field4814[var7 - 1];
        }
        class122.field2040[0] = arg3;
        class54.field815 = class50.field777;
        class48.field744[0] = arg4;
        class169.field3005[0] = arg1;
        class172.field3034[0] = arg0;
        class290.field4814[0] = arg5;
        class234.field3953++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 700)
    public final void method808(int arg0) {
        method805(false);
        class321.method2233(-6204);
        class229.method1558((byte) 120);
        field2068++;
        class57.method392(4550);
        class205.method1436((byte) 63);
        class56.method378();
        class262.method1766((byte) -89);
        class29.method140(11619);
        class100.method677(26442);
        class190.method1357((byte) 104);
        class134.method979(255);
        class293.method1943(106);
        class63.method458(127);
        class165.method1213(255);
        class87.method612((byte) 0);
        class195.method1385(99);
        class313.method2171((byte) 100);
        class157.method1152(8);
        class58.method401(65280);
        class160.method1183(1179648);
        class89.method624(-24914);
        class169.method1236(-14936);
        class32.method161(-14408);
        class112.method745((byte) -76);
        class161.method1190(false);
        class301.method2020((byte) 115);
        class129.method901((byte) -99);
        class273.method1829(11);
        class78.method556(2048);
        class82.method583(126);
        class120.method790(-30597);
        class307.method2093((byte) 121);
        class315.method2200(6);
        class241.method1649((byte) -83);
        class294.method1956(-117);
        class138.method1014(105);
        class5.method29(1);
        class252.method1703(-17);
        class304.method2044((byte) 108);
        class65.method474(-28196);
        class68.method494(-4928);
        class181.method1298((byte) 102);
        class11.method65((byte) 82);
        class296.method2000((byte) -64);
        class158.method1157(0);
        class167.method1222(0);
        class93.method639(9);
        class300.method2018(true);
        class17.method95(63);
        class35.method193(-11269);
        class90.method627(false);
        class132.method920(2);
        class16.method92(-2);
        class106.method707(false);
        class283.method1892((byte) 109);
        class151.method1125((byte) 125);
        class265.method1780((byte) 127);
        class317.method2208(-128);
        class73.method532(-1);
        class235.method1600();
        class217.method1489(-10878);
        class146.method1068();
        class21.method105(true);
        class62.method433();
        class137.method991(9110);
        class38.method213();
        class264.method1774(false);
        class127.method886(-12075);
        class46.method286((byte) 21);
        class269.method1814(983040);
        class121.method792();
        class172.method1249(4400);
        class174.method1264((byte) -92);
        class143.method1043(-119);
        class26.method124(false);
        class312.method2139();
        class103.method701((byte) 70);
        class221.method1520(-111);
        class308.method2099();
        class182.method1308(-115);
        class150.method1119(21290);
        class128.method889(false);
        class164.method1206();
        class256.method1738();
        class209.method1461(3);
        class71.method516(28608);
        class142.method1037((byte) 116);
        class13.method74((byte) 60);
        class18.method98(0);
        class276.method1846();
        class64.method472(false);
        class285.method1896((byte) 80);
        class199.method1406(-3);
        class15.method87((byte) 23);
        class48.method302(-32020);
        class94.method644(-115);
        class303.method2032(103);
        class224.method1534(1);
        class111.method729(0);
        class40.method256(-91);
        class125.method834(25);
        class206.method1448(255);
        class219.method1500((byte) 39);
        class168.method1231(48);
        class176.method1281(99);
        class12.method70((byte) 109);
        class291.method1928(0);
        class319.method2223(-1);
        class220.method1506((byte) 109);
        class213.method1482(true);
        class173.method1260(0);
        class69.method504(-13269);
        class232.method1577((byte) 84);
        class139.method1020((byte) 39);
        class39.method247(false);
        class236.method1620();
        class289.method1920((byte) 69);
        class37.method205((byte) -61);
        class189.method1355(-5);
        class298.method2008(-26495);
        class88.method619(113);
        class45.method281(110);
        class149.method1111();
        class162.method1192((byte) 126);
        class183.method1310(false);
        class85.method595(-118);
        class282.method1886(-81);
        class114.method754(91);
        class98.method663((byte) -50);
        class201.method1422();
        class240.method1645(85);
        class76.method552(true);
        class130.method907(1);
        class107.method710(115);
        class8.method47((byte) -117);
        class74.method537(101);
        class260.method1760(115);
        class77.method554();
        class180.method1290((byte) 76);
        class136.method988((byte) 65);
        class279.method1871(128);
        class187.method1351((byte) -128);
        class104.method705();
        class251.method1702(-1);
        class66.method484();
        class135.method986();
        class234.method1593(9);
        class218.method1495(1);
        class44.method277(2);
        class245.method1681((byte) -11);
        class192.method1367((byte) 63);
        class314.method2192(22142);
        class118.method775((byte) 125);
        class267.method1804(23047);
        class239.method1642((byte) -54);
        class108.method712();
        class242.method1668(26828);
        class24.method118(true);
        class101.method693();
        class320.method2231(false);
        class59.method406(1024);
        class238.method1639(-1);
        class97.method661(255);
        class27.method128(false);
        class227.method1550(96);
        class95.method651(true);
        class185.method1339(false);
        class31.method151((byte) 80);
        class305.method2050(2);
        class186.method1347(30705);
        class244.method1678(-123);
        class119.method782(0);
        class278.method1869((byte) -86);
        class23.method111(false);
        class116.method762((byte) -14);
        class170.method1247(-75);
        class223.method1530(-1);
        class41.method265(true);
        class200.method1413(-12);
        class72.method526();
        class96.method657((byte) -97);
        class247.method1691(4);
        class148.method1110((byte) 71);
        class124.method828(126);
        class306.method2052(-30192);
        class249.method1692(-2480);
        class49.method309();
        class316.method2206();
        class145.method1058();
        class54.method338((byte) -126);
        class53.method332(128);
        class179.method1288();
        class191.method1364();
        class292.method1932(46);
        class25.method123(true);
        class310.method2124();
        class210.method1465();
        class91.method630((byte) 72);
        class166.method1218((byte) -31);
        class152.method1131(-124);
        class259.method1757(107);
        class50.method318(1);
        class266.method1795(-1);
        class55.method348((byte) 57);
        class287.method1911(7922);
        class33.method185(true);
        class253.method1713(-11730);
        class123.method824(1220);
        class51.method324(-9196);
        int var2 = -125 % ((17 - arg0) / 55);
        class202.method1428(85);
        class322.method2234(false);
        class318.method2214(false);
        class226.method1541(-3560);
        class7.method36(-118);
        class212.method1478(-116);
        class102.method699((byte) 54);
        class22.method107((byte) -26);
        class257.method1745((byte) 110);
        class36.method195(2);
        class19.method102(4096);
        class47.method294(-18886);
        class270.method1816(-2);
        class272.method1822(0);
        class255.method1724(53);
        class1.method1(-4528);
        class28.method131(false);
        class228.method1552(12);
        class203.method1433(5);
        class122.method801(false);
        class131.method915(3);
        class4.method25((byte) 34);
        class214.method1487(true);
        class20.method104((byte) 48);
        class197.method1398((byte) -62);
        class250.method1695((byte) -55);
        class243.method1673(false);
        class153.method1136((byte) -126);
        class263.method1772(false);
        class10.method60(364953964);
        class175.method1272(122);
        class159.method1168((byte) 122);
        class254.method1719(0);
        class52.method326(-1);
        class281.method1879(1024);
        class194.method1375(true);
        class207.method1449(false);
        class280.method1875(-82);
        class193.method1370(-1577522388);
        class75.method541((byte) 97);
        class140.method1033((byte) -95);
        class309.method2113(742);
        class117.method770(20429);
        class290.method1922(104);
        class70.method511((byte) -122);
        class110.method719(-124);
        class34.method188(true);
        class84.method590(0);
        class81.method578((byte) -104);
        class297.method2004(-98);
        class288.method1915((byte) -114);
        class231.method1573(0);
        class30.method143(32767);
        class163.method1195(11835);
        class177.method1283((byte) 90);
        class14.method80(123);
        class302.method2030(3523);
        class274.method1835((byte) 75);
        class99.method673(11868);
        class286.method1906(-92);
        class105.method706(139069932);
        class9.method49((byte) -51);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 990)
    private final void method809(byte arg0, int arg1) {
        class282.field4691 = 0;
        field2061++;
        class300.field4967 = null;
        if (arg0 != 118) {
            field2058 = 121;
        }
        class200.field3405.field1076 = arg1;
        class200.field3405.field1074++;
        class4.field24 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1014)
    public final void method810(byte arg0) {
        field2067++;
        if (class280.field4662 == 1000) {
            return;
        }
        class249.field4174++;
        if (arg0 >= -120) {
            return;
        }
        if (class249.field4174 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class23.field338 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class107.field1680.setSeed((long) class23.field338);
        }
        this.method815(-5889);
        if (class64.field1085 != null) {
            class64.field1085.method617((byte) -107);
        }
        class190.method1359(true);
        class181.method1294(true);
        class30.method142((byte) -70);
        class307.method2056(false);
        if (class56.field846) {
            class121.method797();
        }
        if (class44.field685 != null) {
            int var3 = class44.field685.method558(true);
            class75.field1212 = var3;
        }
        if (class280.field4662 == 0) {
            this.method803(23);
            class9.method55(0);
        } else if (class280.field4662 == 5) {
            this.method803(23);
            class9.method55(0);
        } else if (class280.field4662 == 25 || class280.field4662 == 28) {
            class100.method675(71);
        }
        if (class280.field4662 == 10) {
            this.method817(-25);
            class25.method122(-360001);
            class285.method1897(true);
            class119.method784((byte) 65);
        } else if (class280.field4662 == 30) {
            class32.method167((byte) -45);
        } else if (class280.field4662 == 40) {
            class119.method784((byte) 65);
            if (class289.field4792 != -3) {
                if (class289.field4792 == 15) {
                    class118.method777(0);
                } else if (class289.field4792 != 2) {
                    class189.method1356((byte) -103);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwd;)Lwd;", line = 1116)
    public static final class112 method811(class112 arg0) {
        int var1 = class172.method1248(method804(arg0), (byte) -124);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class252.method1706(5157, arg0.field1865);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwd;IIIIIII)V", line = 1147)
    public static final void method812(class112[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class112 var9 = arg0[var8];
            if (var9 != null && var9.field1865 == arg1 && (!var9.field1916 || var9.field1780 == 0 || var9.field1857 || method804(var9) != 0 || class88.field1378 == var9 || var9.field1885 == 1338) && (!var9.field1916 || !method814(var9))) {
                int var10 = var9.field1919 + arg6;
                int var11 = var9.field1784 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1780 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1766 + var10;
                    int var17 = var9.field1753 + var11;
                    if (var9.field1780 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class82.field1324 == var9) {
                    class75.field1220 = true;
                    class307.field5199 = var10;
                    class30.field413 = var11;
                }
                if (!var9.field1916 || var12 < var14 && var13 < var15) {
                    if (var9.field1780 == 0) {
                        if (!var9.field1916 && method814(var9) && class74.field1197 != var9) {
                            continue;
                        }
                        if (var9.field1892 && class138.field2493 >= var12 && class260.field4366 >= var13 && class138.field2493 < var14 && class260.field4366 < var15) {
                            for (class282 var18 = (class282) class305.field5124.method898((byte) -100); var18 != null; var18 = (class282) class305.field5124.method893((byte) 22)) {
                                if (var18.field4690) {
                                    var18.method499((byte) 64);
                                    var18.field4697.field1838 = false;
                                }
                            }
                            if (class306.field5131 == 0) {
                                class82.field1324 = null;
                                class88.field1378 = null;
                            }
                            class52.field798 = false;
                        }
                    }
                    if (var9.field1916) {
                        boolean var19;
                        if (class138.field2493 >= var12 && class260.field4366 >= var13 && class138.field2493 < var14 && class260.field4366 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class317.field5442 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class232.field3889 == 1 && class53.field804 >= var12 && class152.field2782 >= var13 && class53.field804 < var14 && class152.field2782 < var15) {
                            var21 = true;
                        }
                        if (class105.field1660 > 0 && var9.field1816 != null) {
                            for (int var22 = 0; var22 < var9.field1816.length; var22++) {
                                for (int var23 = 0; var23 < class105.field1660; var23++) {
                                    int var24 = var9.field1816[var22] & 0xFF;
                                    if (class241.field4083[var23] == var24) {
                                        if (var9.field1839 != null) {
                                            byte var25 = var9.field1839[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class217.field3655[86] || (var25 & 0x1) != 0 && !class217.field3655[82] || (var25 & 0x4) != 0 && !class217.field3655[81])) {
                                                continue;
                                            }
                                        }
                                        class217.method1493(var9.field1833, var22 + 1, 59, class224.field3772, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class185.method1341(class53.field804 - var10, 31, var9, class152.field2782 - var11);
                        }
                        if (class82.field1324 != null && class82.field1324 != var9 && var19 && class273.method1827(method804(var9), -9275)) {
                            class122.field2043 = var9;
                        }
                        if (class88.field1378 == var9) {
                            class286.field4760 = true;
                            class32.field471 = var10;
                            class234.field3954 = var11;
                        }
                        if (var9.field1857 || var9.field1885 != 0) {
                            if (var19 && class75.field1212 != 0 && var9.field1787 != null) {
                                class282 var26 = new class282();
                                var26.field4690 = true;
                                var26.field4697 = var9;
                                var26.field4696 = class75.field1212;
                                var26.field4699 = var9.field1787;
                                class305.field5124.method899(var26, -28);
                            }
                            if (class82.field1324 != null || class122.field2052 != null || class51.field783 || var9.field1885 != 1400 && class52.field798) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1885 != 0) {
                                if (var9.field1885 == 1337) {
                                    class46.field717 = var9;
                                    class23.method114(var9, (byte) 94);
                                    continue;
                                }
                                if (var9.field1885 == 1338) {
                                    if (var21) {
                                        class84.field1339 = class53.field804 - var10;
                                        class320.field5482 = class152.field2782 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1885 == 1400) {
                                    class307.field5192 = var9;
                                    if (var21) {
                                        if (class217.field3655[82] && class73.field1172 > 0) {
                                            int var27 = (int) ((double) (class53.field804 - var10 - var9.field1766 / 2) * 2.0D / (double) class232.field3896);
                                            int var28 = (int) ((double) (class152.field2782 - var11 - var9.field1753 / 2) * 2.0D / (double) class232.field3896);
                                            int var29 = class139.field2522 + var27;
                                            int var30 = class253.field4249 + var28;
                                            int var31 = class220.field3702 + var29;
                                            int var32 = class143.field2602 + class306.field5140 - var30 - 1;
                                            class76.method549(var31, var32, 0, true);
                                            class234.method1591(true);
                                            continue;
                                        }
                                        class52.field798 = true;
                                        class102.field1638 = class138.field2493;
                                        class174.field3085 = class260.field4366;
                                        class286.field4753 = class139.field2522;
                                        class16.field227 = class253.field4249;
                                        continue;
                                    }
                                    if (var20 && class52.field798) {
                                        class218.method1497(false, (int) ((double) (class102.field1638 - class138.field2493) * 2.0D / (double) class15.field200) + class286.field4753);
                                        class57.method389((int) ((double) (class174.field3085 - class260.field4366) * 2.0D / (double) class15.field200) + class16.field227, -121);
                                        continue;
                                    }
                                    class52.field798 = false;
                                    continue;
                                }
                                if (var9.field1885 == 1401) {
                                    if (var20) {
                                        class139.method1021(-1, class260.field4366 - var11, var9.field1766, class138.field2493 - var10, var9.field1753);
                                    }
                                    continue;
                                }
                                if (var9.field1885 == 1402) {
                                    if (!class56.field846) {
                                        class23.method114(var9, (byte) 94);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field1874 && var21) {
                                var9.field1874 = true;
                                if (var9.field1852 != null) {
                                    class282 var33 = new class282();
                                    var33.field4690 = true;
                                    var33.field4697 = var9;
                                    var33.field4685 = class53.field804 - var10;
                                    var33.field4696 = class152.field2782 - var11;
                                    var33.field4699 = var9.field1852;
                                    class305.field5124.method899(var33, -28);
                                }
                            }
                            if (var9.field1874 && var20 && var9.field1889 != null) {
                                class282 var34 = new class282();
                                var34.field4690 = true;
                                var34.field4697 = var9;
                                var34.field4685 = class138.field2493 - var10;
                                var34.field4696 = class260.field4366 - var11;
                                var34.field4699 = var9.field1889;
                                class305.field5124.method899(var34, -28);
                            }
                            if (var9.field1874 && !var20) {
                                var9.field1874 = false;
                                if (var9.field1914 != null) {
                                    class282 var35 = new class282();
                                    var35.field4690 = true;
                                    var35.field4697 = var9;
                                    var35.field4685 = class138.field2493 - var10;
                                    var35.field4696 = class260.field4366 - var11;
                                    var35.field4699 = var9.field1914;
                                    class227.field3832.method899(var35, -28);
                                }
                            }
                            if (var20 && var9.field1847 != null) {
                                class282 var36 = new class282();
                                var36.field4690 = true;
                                var36.field4697 = var9;
                                var36.field4685 = class138.field2493 - var10;
                                var36.field4696 = class260.field4366 - var11;
                                var36.field4699 = var9.field1847;
                                class305.field5124.method899(var36, -28);
                            }
                            if (!var9.field1838 && var19) {
                                var9.field1838 = true;
                                if (var9.field1853 != null) {
                                    class282 var37 = new class282();
                                    var37.field4690 = true;
                                    var37.field4697 = var9;
                                    var37.field4685 = class138.field2493 - var10;
                                    var37.field4696 = class260.field4366 - var11;
                                    var37.field4699 = var9.field1853;
                                    class305.field5124.method899(var37, -28);
                                }
                            }
                            if (var9.field1838 && var19 && var9.field1845 != null) {
                                class282 var38 = new class282();
                                var38.field4690 = true;
                                var38.field4697 = var9;
                                var38.field4685 = class138.field2493 - var10;
                                var38.field4696 = class260.field4366 - var11;
                                var38.field4699 = var9.field1845;
                                class305.field5124.method899(var38, -28);
                            }
                            if (var9.field1838 && !var19) {
                                var9.field1838 = false;
                                if (var9.field1785 != null) {
                                    class282 var39 = new class282();
                                    var39.field4690 = true;
                                    var39.field4697 = var9;
                                    var39.field4685 = class138.field2493 - var10;
                                    var39.field4696 = class260.field4366 - var11;
                                    var39.field4699 = var9.field1785;
                                    class227.field3832.method899(var39, -28);
                                }
                            }
                            if (var9.field1915 != null) {
                                class282 var40 = new class282();
                                var40.field4697 = var9;
                                var40.field4699 = var9.field1915;
                                class192.field3280.method899(var40, -28);
                            }
                            if (var9.field1841 != null && class64.field1087 > var9.field1900) {
                                if (var9.field1918 == null || class64.field1087 - var9.field1900 > 32) {
                                    class282 var45 = new class282();
                                    var45.field4697 = var9;
                                    var45.field4699 = var9.field1841;
                                    class305.field5124.method899(var45, -28);
                                } else {
                                    label548: for (int var41 = var9.field1900; var41 < class64.field1087; var41++) {
                                        int var42 = class19.field254[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field1918.length; var43++) {
                                            if (var9.field1918[var43] == var42) {
                                                class282 var44 = new class282();
                                                var44.field4697 = var9;
                                                var44.field4699 = var9.field1841;
                                                class305.field5124.method899(var44, -28);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field1900 = class64.field1087;
                            }
                            if (var9.field1864 != null && class100.field1617 > var9.field1901) {
                                if (var9.field1763 == null || class100.field1617 - var9.field1901 > 32) {
                                    class282 var50 = new class282();
                                    var50.field4697 = var9;
                                    var50.field4699 = var9.field1864;
                                    class305.field5124.method899(var50, -28);
                                } else {
                                    label524: for (int var46 = var9.field1901; var46 < class100.field1617; var46++) {
                                        int var47 = class269.field4537[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field1763.length; var48++) {
                                            if (var9.field1763[var48] == var47) {
                                                class282 var49 = new class282();
                                                var49.field4697 = var9;
                                                var49.field4699 = var9.field1864;
                                                class305.field5124.method899(var49, -28);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field1901 = class100.field1617;
                            }
                            if (var9.field1855 != null && class124.field2100 > var9.field1820) {
                                if (var9.field1866 == null || class124.field2100 - var9.field1820 > 32) {
                                    class282 var55 = new class282();
                                    var55.field4697 = var9;
                                    var55.field4699 = var9.field1855;
                                    class305.field5124.method899(var55, -28);
                                } else {
                                    label500: for (int var51 = var9.field1820; var51 < class124.field2100; var51++) {
                                        int var52 = class254.field4268[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field1866.length; var53++) {
                                            if (var9.field1866[var53] == var52) {
                                                class282 var54 = new class282();
                                                var54.field4697 = var9;
                                                var54.field4699 = var9.field1855;
                                                class305.field5124.method899(var54, -28);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field1820 = class124.field2100;
                            }
                            if (var9.field1822 != null && class176.field3101 > var9.field1858) {
                                if (var9.field1896 == null || class176.field3101 - var9.field1858 > 32) {
                                    class282 var60 = new class282();
                                    var60.field4697 = var9;
                                    var60.field4699 = var9.field1822;
                                    class305.field5124.method899(var60, -28);
                                } else {
                                    label476: for (int var56 = var9.field1858; var56 < class176.field3101; var56++) {
                                        int var57 = class180.field3135[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field1896.length; var58++) {
                                            if (var9.field1896[var58] == var57) {
                                                class282 var59 = new class282();
                                                var59.field4697 = var9;
                                                var59.field4699 = var9.field1822;
                                                class305.field5124.method899(var59, -28);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field1858 = class176.field3101;
                            }
                            if (var9.field1767 != null && class107.field1693 > var9.field1817) {
                                if (var9.field1823 == null || class107.field1693 - var9.field1817 > 32) {
                                    class282 var65 = new class282();
                                    var65.field4697 = var9;
                                    var65.field4699 = var9.field1767;
                                    class305.field5124.method899(var65, -28);
                                } else {
                                    label452: for (int var61 = var9.field1817; var61 < class107.field1693; var61++) {
                                        int var62 = class221.field3749[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field1823.length; var63++) {
                                            if (var9.field1823[var63] == var62) {
                                                class282 var64 = new class282();
                                                var64.field4697 = var9;
                                                var64.field4699 = var9.field1767;
                                                class305.field5124.method899(var64, -28);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field1817 = class107.field1693;
                            }
                            if (class54.field815 > var9.field1871 && var9.field1879 != null) {
                                class282 var66 = new class282();
                                var66.field4697 = var9;
                                var66.field4699 = var9.field1879;
                                class305.field5124.method899(var66, -28);
                            }
                            if (class130.field2227 > var9.field1871 && var9.field1890 != null) {
                                class282 var67 = new class282();
                                var67.field4697 = var9;
                                var67.field4699 = var9.field1890;
                                class305.field5124.method899(var67, -28);
                            }
                            if (class250.field4182 > var9.field1871 && var9.field1909 != null) {
                                class282 var68 = new class282();
                                var68.field4697 = var9;
                                var68.field4699 = var9.field1909;
                                class305.field5124.method899(var68, -28);
                            }
                            if (class285.field4727 > var9.field1871 && var9.field1760 != null) {
                                class282 var69 = new class282();
                                var69.field4697 = var9;
                                var69.field4699 = var9.field1760;
                                class305.field5124.method899(var69, -28);
                            }
                            if (class45.field700 > var9.field1871 && var9.field1761 != null) {
                                class282 var70 = new class282();
                                var70.field4697 = var9;
                                var70.field4699 = var9.field1761;
                                class305.field5124.method899(var70, -28);
                            }
                            var9.field1871 = class50.field777;
                            if (var9.field1893 != null) {
                                for (int var71 = 0; var71 < class105.field1660; var71++) {
                                    class282 var72 = new class282();
                                    var72.field4697 = var9;
                                    var72.field4694 = class241.field4083[var71];
                                    var72.field4687 = class122.field2033[var71];
                                    var72.field4699 = var9.field1893;
                                    class305.field5124.method899(var72, -28);
                                }
                            }
                            if (class281.field4667 && var9.field1832 != null) {
                                class282 var73 = new class282();
                                var73.field4697 = var9;
                                var73.field4699 = var9.field1832;
                                class305.field5124.method899(var73, -28);
                            }
                        }
                    }
                    if (!var9.field1916 && class82.field1324 == null && class122.field2052 == null && !class51.field783) {
                        if ((var9.field1808 >= 0 || var9.field1789 != 0) && class138.field2493 >= var12 && class260.field4366 >= var13 && class138.field2493 < var14 && class260.field4366 < var15) {
                            if (var9.field1808 >= 0) {
                                class74.field1197 = arg0[var9.field1808];
                            } else {
                                class74.field1197 = var9;
                            }
                        }
                        if (var9.field1780 == 8 && class138.field2493 >= var12 && class260.field4366 >= var13 && class138.field2493 < var14 && class260.field4366 < var15) {
                            class150.field2742 = var9;
                        }
                        if (var9.field1791 > var9.field1753) {
                            class55.method346(var9.field1766 + var10, -27265, class138.field2493, var11, var9.field1753, class260.field4366, var9, var9.field1791);
                        }
                    }
                    if (var9.field1780 == 0) {
                        method812(arg0, var9.field1833, var12, var13, var14, var15, var10 - var9.field1880, var11 - var9.field1827);
                        if (var9.field1810 != null) {
                            method812(var9.field1810, var9.field1833, var12, var13, var14, var15, var10 - var9.field1880, var11 - var9.field1827);
                        }
                        class65 var74 = (class65) class16.field222.method1631(false, (long) var9.field1833);
                        if (var74 != null) {
                            class187.method1352(var11, var12, var14, var74.field1097, -1, var15, var10, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1896)
    public final void method813(byte arg0) {
        field2057++;
        if (class56.field846) {
            class56.method380();
        }
        if (class45.field693 != null) {
            class244.method1680(class45.field693, (byte) 125, class161.field2907);
            class45.field693 = null;
        }
        if (class161.field2907 != null) {
            class161.field2907.method1095(84, this.getClass());
        }
        if (class125.field2106 != null) {
            class125.field2106.field1613 = false;
        }
        class125.field2106 = null;
        if (class59.field953 != null) {
            class59.field953.method1941((byte) -116);
            class59.field953 = null;
        }
        class163.method1193((byte) -6, class24.field342);
        class47.method291(class24.field342, 0);
        if (class44.field685 != null) {
            class44.field685.method555((byte) 19, class24.field342);
        }
        int var2 = -114 / ((77 - arg0) / 33);
        class53.method334(-29640);
        class207.method1450((byte) 83);
        class44.field685 = null;
        if (class118.field1993 != null) {
            class118.field1993.method1052((byte) 123);
        }
        if (class125.field2109 != null) {
            class125.field2109.method1052((byte) 123);
        }
        class200.field3405.method461(0);
        class195.field3356.method1214((byte) -100);
        try {
            if (class202.field3466 != null) {
                class202.field3466.method1145(-69);
            }
            if (class13.field180 != null) {
                for (int var3 = 0; var3 < class13.field180.length; var3++) {
                    if (class13.field180[var3] != null) {
                        class13.field180[var3].method1145(-113);
                    }
                }
            }
            if (class47.field728 != null) {
                class47.field728.method1145(-113);
            }
            if (class63.field1059 != null) {
                class63.field1059.method1145(-95);
            }
        } catch (IOException var5) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwd;)Z", line = 1977)
    public static final boolean method814(class112 arg0) {
        if (class241.field4091) {
            if (method804(arg0) != 0) {
                return false;
            }
            if (arg0.field1780 == 0) {
                return false;
            }
        }
        return arg0.field1776;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 1992)
    private final void method815(int arg0) {
        field2070++;
        if (arg0 != -5889) {
            field2075 = (class273[]) null;
        }
        boolean var2 = class200.field3405.method460((byte) 16);
        if (!var2) {
            this.method818(-61);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2018)
    public final void init() {
        field2071++;
        if (!this.method1444(false)) {
            return;
        }
        class91.field1446 = Integer.parseInt(this.getParameter("worldid"));
        class194.field3305 = Integer.parseInt(this.getParameter("modewhere"));
        if (class194.field3305 < 0 || class194.field3305 > 1) {
            class194.field3305 = 0;
        }
        class255.field4290 = Integer.parseInt(this.getParameter("modewhat"));
        if (class255.field4290 < 0 || class255.field4290 > 2) {
            class255.field4290 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class314.field5394 = true;
        } else {
            class314.field5394 = false;
        }
        try {
            class226.field3813 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class226.field3813 = 0;
        }
        class252.method1708(-2, class226.field3813);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class231.field3877 = true;
        } else {
            class231.field3877 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class206.field3538 = true;
        } else {
            class206.field3538 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class23.field335 = 1;
        } else {
            class23.field335 = 0;
        }
        try {
            class126.field2121 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class126.field2121 = 0;
        }
        class23.field321 = class134.field2319.method880((byte) -55, this);
        if (class23.field321 == null) {
            class23.field321 = class224.field3772;
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class90.field1415 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class90.field1415 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class111.field1746 = true;
        } else {
            class111.field1746 = false;
        }
        class19.field260 = this;
        this.method1443(-1, class255.field4290 + 32, 765, 527, 503);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2109)
    public static final void main(String[] arg0) {
        field2064++;
        try {
            if (arg0.length != 4) {
                class200.method1415(2, "argument count");
            }
            int var1 = -1;
            class91.field1446 = Integer.parseInt(arg0[0]);
            class194.field3305 = 2;
            if (arg0[1].equals("live")) {
                class255.field4290 = 0;
            } else if (arg0[1].equals("rc")) {
                class255.field4290 = 1;
            } else if (arg0[1].equals("wip")) {
                class255.field4290 = 2;
            } else {
                class200.method1415(2, "modewhat");
            }
            class314.field5394 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class158.method1158(class301.method2021(0, var2.length, var2, false), 127);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class226.field3813 = var1;
            } else if (arg0[2].equals("english")) {
                class226.field3813 = 0;
            } else if (arg0[2].equals("german")) {
                class226.field3813 = 1;
            } else {
                class200.method1415(2, "language");
            }
            class252.method1708(-2, class226.field3813);
            class206.field3538 = false;
            class231.field3877 = false;
            if (arg0[3].equals("game0")) {
                class23.field335 = 0;
            } else if (arg0[3].equals("game1")) {
                class23.field335 = 1;
            } else {
                class200.method1415(2, "game");
            }
            class23.field321 = class224.field3772;
            class90.field1415 = 0;
            class126.field2121 = 0;
            class111.field1746 = false;
            client var4 = new client();
            class19.field260 = var4;
            var4.method1442(28, "runescape", 527, class255.field4290 + 32, 768, false, 1024, 0);
            class253.field4250.setLocation(40, 40);
        } catch (Exception var7) {
            class54.method345((String) null, -56, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 2184)
    public final void method816(byte arg0) {
        field2073++;
        if (class280.field4662 == 1000) {
            return;
        }
        if (arg0 > -122) {
            field2075 = (class273[]) null;
        }
        boolean var2 = class142.method1039(-17021);
        if (var2 && class51.field785 && class118.field1993 != null) {
            class118.field1993.method1049(86);
        }
        if ((class280.field4662 == 30 || class280.field4662 == 10) && (class139.field2538 || class143.field2598 != 0L && class261.method1765(16299) > class143.field2598)) {
            class152.method1134(class95.field1503, class45.method282(89), class212.field3613, class139.field2538, -1);
        }
        if (class45.field693 == null) {
            Container var3;
            if (class45.field693 != null) {
                var3 = class45.field693;
            } else if (class253.field4250 == null) {
                var3 = class161.field2907.field2705;
            } else {
                var3 = class253.field4250;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class253.field4250 == var3) {
                Insets var6 = class253.field4250.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class9.field117 != var4 || class22.field307 != var5) {
                if (class147.field2715.startsWith("mac")) {
                    class22.field307 = var5;
                    class9.field117 = var4;
                } else {
                    class82.method582(114);
                }
                class143.field2598 = class261.method1765(16299) + 500L;
            }
        }
        if (class45.field693 != null && !class317.field5443 && (class280.field4662 == 30 || class280.field4662 == 10)) {
            class152.method1134(-1, class189.field3242, -1, false, -1);
        }
        boolean var7 = false;
        if (class111.field1751) {
            var7 = true;
            class111.field1751 = false;
        }
        if (var7) {
            class14.method82(500);
        }
        if (class56.field846) {
            for (int var8 = 0; var8 < 100; var8++) {
                class220.field3698[var8] = true;
            }
        }
        if (class280.field4662 == 0) {
            class181.method1302(class21.field280, (byte) -72, (Color) null, var7, class131.field2256);
        } else if (class280.field4662 == 5) {
            class107.method708(class200.field3414, 4, false);
        } else if (class280.field4662 == 10) {
            class69.method508((byte) -93);
        } else if (class280.field4662 == 25 || class280.field4662 == 28) {
            if (class267.field4529 == 1) {
                if (class244.field4130 > class249.field4176) {
                    class249.field4176 = class244.field4130;
                }
                int var9 = (class249.field4176 - class244.field4130) * 50 / class249.field4176;
                class250.method1693(false, class12.method69(new class126[] { class302.field5036, class123.field2079, class195.method1386((byte) 20, var9), class96.field1530 }, (byte) 116), true);
            } else if (class267.field4529 == 2) {
                if (class41.field660 > class15.field209) {
                    class15.field209 = class41.field660;
                }
                int var10 = (class15.field209 - class41.field660) * 50 / class15.field209 + 50;
                class250.method1693(false, class12.method69(new class126[] { class302.field5036, class123.field2079, class195.method1386((byte) 20, var10), class96.field1530 }, (byte) 119), true);
            } else {
                class250.method1693(false, class302.field5036, true);
            }
        } else if (class280.field4662 == 30) {
            class243.method1672(-3592);
        } else if (class280.field4662 == 40) {
            class250.method1693(false, class12.method69(new class126[] { class214.field3630, class265.field4491, class95.field1508 }, (byte) 118), true);
        }
        if (class56.field846 && class280.field4662 != 0) {
            class56.method371();
            for (int var17 = 0; var17 < class320.field5481; var17++) {
                class250.field4186[var17] = false;
            }
        } else if ((class280.field4662 == 30 || class280.field4662 == 10) && class226.field3804 == 0 && !var7) {
            try {
                Graphics var14 = class24.field342.getGraphics();
                for (int var15 = 0; var15 < class320.field5481; var15++) {
                    if (class250.field4186[var15]) {
                        class106.field1668.method139(class123.field2089[var15], class14.field198[var15], 977463824, class175.field3087[var15], class36.field519[var15], var14);
                        class250.field4186[var15] = false;
                    }
                }
            } catch (Exception var18) {
                class24.field342.repaint();
            }
        } else if (class280.field4662 != 0) {
            try {
                Graphics var11 = class24.field342.getGraphics();
                class106.field1668.method135(0, 0, (byte) 125, var11);
                for (int var12 = 0; var12 < class320.field5481; var12++) {
                    class250.field4186[var12] = false;
                }
            } catch (Exception var19) {
                class24.field342.repaint();
            }
        }
        if (class300.field4965) {
            class278.method1868(-26307);
        }
        if (class228.field3846 && class280.field4662 == 10 && class182.field3162 != -1) {
            class228.field3846 = false;
            class123.method823(-21165, class161.field2907);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2424)
    private final void method817(int arg0) {
        field2062++;
        class105.field1660 = 0;
        int var2 = 106 / ((arg0 - 54) / 44);
        while (class296.method2001((byte) -87) && class105.field1660 < 128) {
            class241.field4083[class105.field1660] = class65.field1095;
            class122.field2033[class105.field1660] = class190.field3261;
            class105.field1660++;
        }
        class303.field5038++;
        if (class182.field3162 != -1) {
            class187.method1352(0, 0, class7.field87, class182.field3162, -1, class1.field6, 0, 0);
        }
        class50.field777++;
        if (class56.field846) {
            int var3 = 19137023;
            label190: for (int var4 = 0; var4 < 32768; var4++) {
                class89 var5 = class199.field3391[var4];
                if (var5 != null) {
                    byte var6 = var5.field1389.field5108;
                    if ((var6 & 0x2) > 0 && var5.field2489 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var8 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var7 != 0 || var8 != 0) {
                            var5.field2460[0] = (var5.field2461 >> 7) + var7;
                            var5.field2471[0] = (var5.field2487 >> 7) + var8;
                            class94.field1475[class131.field2250].method160(false, 119, var5.field2461 >> 7, 0, var5.field2487 >> 7, var5.method1013(false), var5.method1013(false));
                            if (var5.field2460[0] >= 0 && var5.field2460[0] <= 104 - var5.method1013(false) && var5.field2471[0] >= 0 && var5.field2471[0] <= (104 - var5.method1013(false)) && class94.field1475[class131.field2250].method163(80, var5.field2471[0], var5.field2487 >> 7, var5.field2460[0], var5.field2461 >> 7)) {
                                if (var5.method1013(false) > 1) {
                                    for (int var9 = var5.field2460[0]; (var5.field2460[0] + var5.method1013(false)) > var9; var9++) {
                                        for (int var10 = var5.field2471[0]; var10 < var5.field2471[0] + var5.method1013(false); var10++) {
                                            if ((class94.field1475[class131.field2250].field460[var9][var10] & var3) != 0) {
                                                continue label190;
                                            }
                                        }
                                    }
                                }
                                var5.field2489 = 1;
                            }
                        }
                    }
                    class282.method1885(var5, 255);
                    class24.method116(var5, 0);
                    class317.method2209(1, var5);
                    class94.field1475[class131.field2250].method174(var5.field2487 >> 7, 1, var5.method1013(false), var5.field2461 >> 7, var5.method1013(false), false);
                }
            }
        }
        if (!class56.field846) {
            class241.method1651(0);
        } else if (class281.field4680 == 0 && class267.field4522 == 0) {
            if (class254.field4261 == 2) {
                class78.method561((byte) 29);
            } else {
                class73.method527(2);
            }
            if ((class152.field2780 >> 7) < 14 || class152.field2780 >> 7 >= 90 || class223.field3755 >> 7 < 14 || class223.field3755 >> 7 >= 90) {
                class292.method1934((byte) -51);
            }
        }
        while (true) {
            class282 var11;
            class112 var18;
            class112 var19;
            do {
                var11 = (class282) class192.field3280.method895(14189);
                if (var11 == null) {
                    while (true) {
                        class282 var12;
                        class112 var13;
                        class112 var14;
                        do {
                            var12 = (class282) class227.field3832.method895(14189);
                            if (var12 == null) {
                                while (true) {
                                    class282 var15;
                                    class112 var16;
                                    class112 var17;
                                    do {
                                        var15 = (class282) class305.field5124.method895(14189);
                                        if (var15 == null) {
                                            if (class82.field1324 != null) {
                                                class110.method720(-3);
                                            }
                                            if (class257.field4317 != null && class257.field4317.field965 == 1) {
                                                if (class257.field4317.field967 != null) {
                                                    class315.method2196((byte) 111, class5.field63, class207.field3549);
                                                }
                                                class257.field4317 = null;
                                                class207.field3549 = null;
                                                class5.field63 = false;
                                            }
                                            if ((class249.field4174 % 1500) == 0) {
                                                class159.method1167((byte) 109);
                                            }
                                            return;
                                        }
                                        var16 = var15.field4697;
                                        if (var16.field1875 < 0) {
                                            break;
                                        }
                                        var17 = class252.method1706(5157, var16.field1865);
                                    } while (var17 == null || var17.field1810 == null || var16.field1875 >= var17.field1810.length || var17.field1810[var16.field1875] != var16);
                                    class309.method2111(var15, 200000);
                                }
                            }
                            var13 = var12.field4697;
                            if (var13.field1875 < 0) {
                                break;
                            }
                            var14 = class252.method1706(5157, var13.field1865);
                        } while (var14 == null || var14.field1810 == null || var13.field1875 >= var14.field1810.length || var14.field1810[var13.field1875] != var13);
                        class309.method2111(var12, 200000);
                    }
                }
                var18 = var11.field4697;
                if (var18.field1875 < 0) {
                    break;
                }
                var19 = class252.method1706(5157, var18.field1865);
            } while (var19 == null || var19.field1810 == null || var19.field1810.length <= var18.field1875 || var19.field1810[var18.field1875] != var18);
            class309.method2111(var11, 200000);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 2655)
    private final void method818(int arg0) {
        field2063++;
        if (class200.field3405.field1074 > class41.field665) {
            if (class63.field1069 == class239.field4040) {
                class239.field4040 = class172.field3035;
            } else {
                class239.field4040 = class63.field1069;
            }
            class221.field3732 = (class200.field3405.field1074 - 1) * 5 * 50;
            if (class221.field3732 > 3000) {
                class221.field3732 = 3000;
            }
            if (class200.field3405.field1074 >= 2 && class200.field3405.field1076 == 6) {
                this.method1439(true, "js5connect_outofdate");
                class280.field4662 = 1000;
                return;
            }
            if (class200.field3405.field1074 >= 4 && class200.field3405.field1076 == -1) {
                this.method1439(true, "js5crc");
                class280.field4662 = 1000;
                return;
            }
            if (class200.field3405.field1074 >= 4 && (class280.field4662 == 0 || class280.field4662 == 5)) {
                if (class200.field3405.field1076 == 7 || class200.field3405.field1076 == 9) {
                    this.method1439(true, "js5connect_full");
                } else if (class200.field3405.field1076 <= 0) {
                    this.method1439(true, "js5io");
                } else {
                    this.method1439(true, "js5connect");
                }
                class280.field4662 = 1000;
                return;
            }
        }
        class41.field665 = class200.field3405.field1074;
        if (class221.field3732 > 0) {
            class221.field3732--;
            return;
        }
        try {
            if (class282.field4691 == 0) {
                class4.field24 = class161.field2907.method1092(class239.field4040, class190.field3258, true);
                class282.field4691++;
            }
            if (class282.field4691 == 1) {
                if (class4.field24.field965 == 2) {
                    this.method809((byte) 118, 1000);
                    return;
                }
                if (class4.field24.field965 == 1) {
                    class282.field4691++;
                }
            }
            if (class282.field4691 == 2) {
                class300.field4967 = new class293((Socket) class4.field24.field967, class161.field2907);
                class134 var2 = new class134(5);
                var2.method933(-3, 15);
                var2.method947(527, (byte) 114);
                class300.field4967.method1945(5, true, 0, var2.field2282);
                class282.field4691++;
                class82.field1328 = class261.method1765(16299);
            }
            if (class282.field4691 == 3) {
                if (class280.field4662 == 0 || class280.field4662 == 5 || class300.field4967.method1939((byte) 86) > 0) {
                    int var3 = class300.field4967.method1938((byte) 41);
                    if (var3 != 0) {
                        this.method809((byte) 118, var3);
                        return;
                    }
                    class282.field4691++;
                } else if (class261.method1765(16299) - class82.field1328 > 30000L) {
                    this.method809((byte) 118, 1001);
                    return;
                }
            }
            if (class282.field4691 == 4) {
                boolean var4 = class280.field4662 == 5 || class280.field4662 == 10 || class280.field4662 == 28;
                class200.field3405.method462(!var4, true, class300.field4967);
                class282.field4691 = 0;
                class4.field24 = null;
                class300.field4967 = null;
            }
        } catch (IOException var7) {
            this.method809((byte) 118, 1002);
        }
        int var6 = -61 / ((arg0 + 13) / 33);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 2807)
    public final void method819(byte arg0) {
        class82.method582(-34);
        field2056++;
        class195.field3356 = new class165();
        class200.field3405 = new class63();
        if (class255.field4290 != 0) {
            class298.field4947 = new byte[50][];
        }
        class10.method61(-12114, class161.field2907);
        if (class194.field3305 == 0) {
            class251.field4201 = this.getCodeBase().getHost();
            class206.field3529 = 443;
            class243.field4113 = 43594;
        } else if (class194.field3305 == 1) {
            class251.field4201 = this.getCodeBase().getHost();
            class243.field4113 = class91.field1446 + 40000;
            class206.field3529 = class91.field1446 + 50000;
        } else if (class194.field3305 == 2) {
            class206.field3529 = class91.field1446 + 50000;
            class251.field4201 = "127.0.0.1";
            class243.field4113 = class91.field1446 + 40000;
        }
        class63.field1069 = class243.field4113;
        class172.field3035 = class206.field3529;
        class119.field1997 = class161.field2913 = class136.field2361 = class50.field769 = new short[256];
        class172.field3039 = class243.field4113;
        class190.field3258 = class251.field4201;
        if (class147.field2708 == 3 && class194.field3305 != 2) {
            class91.field1422 = class91.field1446;
        }
        class239.field4040 = class172.field3039;
        if (class23.field335 == 1) {
            class232.field3905 = class172.field3042;
            class235.field3964 = 0;
            class235.field3967 = 16777215;
            class134.field2302 = class255.field4289;
            class172.field3049 = class99.field1593;
            class39.field626 = true;
            class53.field812 = class107.field1677;
        } else {
            class134.field2302 = class57.field896;
            class172.field3049 = class306.field5136;
            class232.field3905 = class9.field121;
            class53.field812 = class90.field1408;
        }
        class97.method659(arg0 ^ 0x6147);
        class238.method1640(class24.field342, (byte) 31);
        class31.method152(1, class24.field342);
        class44.field685 = class243.method1674(0);
        if (class44.field685 != null) {
            class44.field685.method559(class24.field342, 17330);
        }
        class244.field4136 = class147.field2708;
        if (arg0 != 19) {
            field2074 = (class126) null;
        }
        try {
            if (class161.field2907.field2719 != null) {
                class202.field3466 = new class157(class161.field2907.field2719, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class13.field180[var2] = new class157(class161.field2907.field2721[var2], 6000, 0);
                }
                class47.field728 = new class157(class161.field2907.field2714, 6000, 0);
                class194.field3306 = new class58(255, class202.field3466, class47.field728, 500000);
                class63.field1059 = new class157(class161.field2907.field2713, 24, 0);
                class161.field2907.field2714 = null;
                class161.field2907.field2713 = null;
                class161.field2907.field2719 = null;
                class161.field2907.field2721 = null;
            }
        } catch (IOException var4) {
            class47.field728 = null;
            class202.field3466 = null;
            class63.field1059 = null;
            class194.field3306 = null;
        }
        if (class194.field3305 != 0) {
            class37.field550 = true;
        }
        class12.field163 = class140.field2553;
    }
}
