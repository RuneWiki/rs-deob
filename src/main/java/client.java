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
public class client extends class327 {

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Lvh;")
    public static class62 field4423 = new class62(16);

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field4440 = null;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4441 = 0;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field4439 = "shake:";

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Ljava/lang/String;")
    public static String field4444 = null;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4443 = 0;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field4445;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method2009(boolean arg0) {
        field4426++;
        if (class103.field1423 < 128.0F) {
            class103.field1423 = 128.0F;
        }
        int var1 = class313.field4897 >> 7;
        if (!arg0) {
            field4423 = (class62) null;
        }
        if (class103.field1423 > 383.0F) {
            class103.field1423 = 383.0F;
        }
        while (class190.field2855 >= 2048.0F) {
            class190.field2855 -= 2048.0F;
        }
        int var2 = class347.field5497 >> 7;
        while (class190.field2855 < 0.0F) {
            class190.field2855 += 2048.0F;
        }
        int var3 = class14.method80(class347.field5497, class219.field3290, class313.field4897, (byte) -126);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class219.field3290;
                    if (var7 < 3 && (class225.field3398[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class207.field3132[var7][var5][var6] & 0xFF) * 8 + var3 - class72.field902[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class283.field4507) {
            class283.field4507 += (var9 - class283.field4507) / 24;
        } else if (var9 < class283.field4507) {
            class283.field4507 += (var9 - class283.field4507) / 80;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 91)
    public final void method2010(int arg0) {
        field4422++;
        if (field4443 == 1000) {
            return;
        }
        long var2 = class32.method226((byte) -88) / 1000000L - class71.field887;
        class71.field887 = class32.method226((byte) -88) / 1000000L;
        boolean var4 = class100.method637(arg0 ^ 0x6A);
        if (var4 && class327.field5234 && class192.field2881 != null) {
            class192.field2881.method1404(8);
        }
        if ((field4443 == 30 || field4443 == 10) && (class345.field5475 || class99.field1345 != 0L && class9.method57(arg0 - 14157) > class99.field1345)) {
            class145.method1074(class345.field5475, class117.method768(-122), class352.field5609, class226.field3413, 127);
        }
        if (class80.field1065 == null) {
            Container var5;
            if (class80.field1065 != null) {
                var5 = class80.field1065;
            } else if (class231.field3498 == null) {
                var5 = class156.field2451.field254;
            } else {
                var5 = class231.field3498;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class231.field3498 == var5) {
                Insets var8 = class231.field3498.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class56.field670 != var6 || class168.field2580 != var7) {
                if (class22.field262.startsWith("mac")) {
                    class56.field670 = var6;
                    class168.field2580 = var7;
                } else {
                    class348.method2413(-1);
                }
                class99.field1345 = class9.method57(-14133) + 500L;
            }
        }
        if (arg0 != 24) {
            main((String[]) null);
        }
        boolean var9 = false;
        if (class80.field1065 != null && !class282.field4500 && (field4443 == 30 || field4443 == 10)) {
            class145.method1074(false, class161.field2482, -1, -1, 38);
        }
        if (class237.field3646) {
            class237.field3646 = false;
            var9 = true;
        }
        if (var9) {
            class282.method2044((byte) 45);
        }
        if (class272.field4317) {
            for (int var10 = 0; var10 < 100; var10++) {
                class302.field4702[var10] = true;
            }
        }
        if (field4443 == 0) {
            class229.method1589((Color) null, 117, class101.field1370, class65.field778, var9);
        } else if (field4443 == 5) {
            class252.method1785(false, class93.field1233, (byte) 126);
        } else if (field4443 == 10) {
            class276.method1977((byte) -93);
        } else if (field4443 == 25 || field4443 == 28) {
            if (class333.field5331 == 1) {
                if (class227.field3437 < class36.field420) {
                    class227.field3437 = class36.field420;
                }
                int var11 = (class227.field3437 - class36.field420) * 50 / class227.field3437;
                class305.method2152(false, class174.field2628 + "<br>(" + var11 + "%)", -9223);
            } else if (class333.field5331 == 2) {
                if (class65.field779 > class308.field4779) {
                    class308.field4779 = class65.field779;
                }
                int var12 = ((class308.field4779 - class65.field779) * 50 / class308.field4779) + 50;
                class305.method2152(false, class174.field2628 + "<br>(" + var12 + "%)", -9223);
            } else {
                class305.method2152(false, class174.field2628, arg0 - 9247);
            }
        } else if (field4443 == 30) {
            class84.method538(var2, 53);
        } else if (field4443 == 40) {
            class305.method2152(false, class102.field1379 + "<br>" + class316.field4954, -9223);
        }
        if (class272.field4317 && field4443 != 0) {
            class272.method1928();
            for (int var19 = 0; var19 < class63.field765; var19++) {
                class135.field2012[var19] = false;
            }
        } else if ((field4443 == 30 || field4443 == 10) && class92.field1208 == 0 && !var9) {
            try {
                Graphics var16 = class328.field5287.getGraphics();
                for (int var17 = 0; var17 < class63.field765; var17++) {
                    if (class135.field2012[var17]) {
                        class10.field107.method64(class116.field1612[var17], class71.field891[var17], false, class213.field3239[var17], var16, class280.field4417[var17]);
                        class135.field2012[var17] = false;
                    }
                }
            } catch (Exception var20) {
                class328.field5287.repaint();
            }
        } else if (field4443 != 0) {
            try {
                Graphics var13 = class328.field5287.getGraphics();
                class10.field107.method58(0, -113, 0, var13);
                for (int var14 = 0; var14 < class63.field765; var14++) {
                    class135.field2012[var14] = false;
                }
            } catch (Exception var21) {
                class328.field5287.repaint();
            }
        }
        if (class260.field4116) {
            class236.method1635(arg0 + 29);
        }
        if (class283.field4519 && field4443 == 10 && class345.field5482 != -1) {
            class283.field4519 = false;
            class160.method1162(class156.field2451, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 320)
    private final void method2011(int arg0) {
        field4435++;
        if (!class283.field4519) {
            label247: while (true) {
                do {
                    if (!class171.method1201(127)) {
                        break label247;
                    }
                } while (class99.field1339 != 's' && class99.field1339 != 'S');
                class283.field4519 = true;
            }
        }
        if (class44.field506 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class9.method57(arg0 ^ 0x2AC0);
            if (class90.field1191 == 0L) {
                class90.field1191 = var4;
            }
            if (var3 > 16384 && (var4 - class90.field1191) < 5000L) {
                if ((var4 - class56.field668) > 1000L) {
                    System.gc();
                    class56.field668 = var4;
                }
                class101.field1370 = 5;
                class65.field778 = class300.field4686;
            } else {
                class44.field506 = 10;
                class101.field1370 = 5;
                class65.field778 = class259.field4096;
            }
        } else if (class44.field506 == 10) {
            for (int var29 = 0; var29 < 4; var29++) {
                class247.field3914[var29] = new class262(104, 104);
            }
            class65.field778 = class325.field5218;
            class101.field1370 = 10;
            class44.field506 = 30;
        } else if (class44.field506 == 30) {
            if (class179.field2685 == null) {
                class179.field2685 = new class154(class179.field2684, class79.field1050);
            }
            if (class179.field2685.method1119(-15627)) {
                class327.field5227 = class188.method1291(false, true, true, (byte) -106, 0);
                class79.field1045 = class188.method1291(false, true, true, (byte) -123, 1);
                class171.field2600 = class188.method1291(true, false, true, (byte) -116, 2);
                class353.field5630 = class188.method1291(false, true, true, (byte) -126, 3);
                class69.field856 = class188.method1291(false, true, true, (byte) -112, 4);
                class102.field1380 = class188.method1291(true, true, true, (byte) -124, 5);
                class60.field714 = class188.method1291(true, true, false, (byte) -116, 6);
                class166.field2567 = class188.method1291(false, true, true, (byte) -128, 7);
                class65.field786 = class188.method1291(false, true, true, (byte) -125, 8);
                class178.field2675 = class188.method1291(false, true, true, (byte) -107, 9);
                class169.field2583 = class188.method1291(false, true, true, (byte) -103, 10);
                class276.field4351 = class188.method1291(false, true, true, (byte) -124, 11);
                class309.field4821 = class188.method1291(false, true, true, (byte) -108, 12);
                class107.field1476 = class188.method1291(false, true, true, (byte) -122, 13);
                class271.field4260 = class188.method1291(false, true, false, (byte) -120, 14);
                class207.field3130 = class188.method1291(false, true, true, (byte) -105, 15);
                class220.field3308 = class188.method1291(false, true, true, (byte) -105, 16);
                class154.field2428 = class188.method1291(false, true, true, (byte) -113, 17);
                class142.field2222 = class188.method1291(false, true, true, (byte) -110, 18);
                class355.field5644 = class188.method1291(false, true, true, (byte) -109, 19);
                class230.field3486 = class188.method1291(false, true, true, (byte) -116, 20);
                class19.field226 = class188.method1291(false, true, true, (byte) -110, 21);
                class293.field4619 = class188.method1291(false, true, true, (byte) -126, 22);
                class308.field4782 = class188.method1291(true, true, true, (byte) -127, 23);
                class85.field1115 = class188.method1291(false, true, true, (byte) -111, 24);
                class325.field5216 = class188.method1291(false, true, true, (byte) -119, 25);
                class72.field903 = class188.method1291(true, true, true, (byte) -109, 26);
                class101.field1372 = class188.method1291(false, true, true, (byte) -104, 27);
                class79.field1056 = class188.method1291(true, true, true, (byte) -118, 28);
                class44.field506 = 40;
                class101.field1370 = 15;
                class65.field778 = class166.field2563;
            } else {
                class101.field1370 = 12;
                class65.field778 = class146.field2314;
            }
        } else if (class44.field506 == 40) {
            int var27 = 0;
            for (int var28 = 0; var28 < 29; var28++) {
                var27 += class147.field2337[var28].method1472(false) * class106.field1463[var28] / 100;
            }
            if (var27 == 100) {
                class65.field778 = class154.field2438;
                class101.field1370 = 20;
                class164.method1179(class65.field786, (byte) -128);
                class265.method1870(class65.field786, (byte) -84);
                class191.method1306(true, class65.field786);
                class44.field506 = 41;
            } else {
                if (var27 != 0) {
                    class65.field778 = class247.field3916 + var27 + "%";
                }
                class101.field1370 = 20;
            }
        } else if (class44.field506 == 41) {
            if (class79.field1056.method102(-1)) {
                this.method2014(class79.field1056.method124(1, arg0 ^ 0xFFFFD397), false);
                class44.field506 = 45;
                class101.field1370 = 25;
                class65.field778 = class233.field3523;
            } else {
                class65.field778 = class156.field2450 + class79.field1056.method111((byte) 63) + "%";
                class101.field1370 = 25;
            }
        } else if (class44.field506 == 45) {
            class280.method2005(22050, -107, class90.field1192, 2);
            class135.field2007 = new class93();
            class135.field2007.method613((byte) -100, 128, 9);
            class192.field2881 = class18.method137(22050, class328.field5287, 0, 1, class156.field2451);
            class192.field2881.method1405(class135.field2007, false);
            class10.method63(class135.field2007, class207.field3130, -34, class69.field856, class271.field4260);
            class273.field4330 = class18.method137(2048, class328.field5287, 1, 1, class156.field2451);
            class20.field239 = new class340();
            class273.field4330.method1405(class20.field239, false);
            class55.field662 = new class164(22050, class361.field5710);
            field4442 = class60.field714.method93(-72, "scape main");
            class65.field778 = class192.field2879;
            class101.field1370 = 30;
            class44.field506 = 50;
        } else if (class44.field506 == 50) {
            int var6 = class215.method1498(arg0 + 7792, class65.field786, class107.field1476);
            int var7 = class107.method691(6);
            if (var6 < var7) {
                class65.field778 = class237.field3640 + var6 * 100 / var7 + "%";
                class101.field1370 = 35;
            } else {
                class44.field506 = 60;
                class101.field1370 = 35;
                class65.field778 = class180.field2710;
            }
        } else if (class44.field506 == 60) {
            int var25 = class300.method2117((byte) -92, class65.field786);
            int var26 = class69.method434(125);
            if (var25 < var26) {
                class101.field1370 = 40;
                class65.field778 = class179.field2686 + var25 * 100 / var26 + "%";
            } else {
                class101.field1370 = 40;
                class44.field506 = 65;
                class65.field778 = class28.field341;
            }
        } else if (class44.field506 == 65) {
            class232.method1606(class65.field786, arg0 ^ 0x1D83, class107.field1476);
            class65.field778 = class258.field4077;
            class101.field1370 = 45;
            class219.method1525((byte) 89, 5);
            class44.field506 = 70;
        } else if (class44.field506 == 70) {
            class171.field2600.method102(-1);
            byte var8 = 0;
            int var9 = var8 + class171.field2600.method111((byte) 88);
            class220.field3308.method102(-1);
            int var10 = var9 + class220.field3308.method111((byte) 57);
            class154.field2428.method102(-1);
            int var11 = var10 + class154.field2428.method111((byte) 98);
            class142.field2222.method102(-1);
            int var12 = var11 + class142.field2222.method111((byte) 88);
            class355.field5644.method102(-1);
            int var13 = var12 + class355.field5644.method111((byte) 104);
            class230.field3486.method102(-1);
            int var14 = var13 + class230.field3486.method111((byte) 47);
            class19.field226.method102(-1);
            int var15 = var14 + class19.field226.method111((byte) 11);
            class293.field4619.method102(-1);
            int var16 = var15 + class293.field4619.method111((byte) 51);
            class85.field1115.method102(-1);
            int var17 = var16 + class85.field1115.method111((byte) 19);
            class325.field5216.method102(-1);
            int var18 = var17 + class325.field5216.method111((byte) 86);
            class101.field1372.method102(-1);
            int var19 = var18 + class101.field1372.method111((byte) 58);
            if (var19 >= 1100) {
                class357.method2458(2, class171.field2600);
                class122.method784(class171.field2600, true);
                class361.method2520(73, class171.field2600);
                class355.method2452(class166.field2567, arg0 ^ 0xFFFFE25D, class171.field2600);
                class312.method2203(class166.field2567, arg0 + 13472, class220.field3308, true);
                class136.method935(true, 2, class142.field2222, class166.field2567);
                class93.method595(class149.field2364, class166.field2567, class355.field5644, true, arg0 ^ 0x5AF4);
                class184.method1275(1, class171.field2600);
                class119.method772(class79.field1045, class230.field3486, 15099, class327.field5227);
                class211.method1475(arg0 + 4992, class171.field2600);
                class60.method367(class166.field2567, class19.field226, (byte) 111);
                class5.method34(class293.field4619, -30767);
                class301.method2126(class171.field2600, 21);
                class190.method1301(-119, class353.field5630, class65.field786, class107.field1476, class166.field2567);
                class68.method423(class171.field2600, arg0 + 7669);
                class99.method629(arg0 + 7655, class154.field2428);
                class303.method2142(new class13(), -1, class85.field1115, class325.field5216);
                class237.method1645(class325.field5216, 93, class85.field1115);
                class61.method371(class171.field2600, -1);
                class293.method2090(class171.field2600, 74);
                class168.method1192(512, class171.field2600);
                class212.method1484(class171.field2600, class65.field786, 23008);
                class263.method1864(class65.field786, (byte) 73, class171.field2600);
                class135.method928(class65.field786, class171.field2600, (byte) -71);
                class101.field1370 = 50;
                class65.field778 = class126.field1790;
                class164.method1180(arg0 ^ 0xFFFFE269);
                class44.field506 = 80;
            } else {
                class101.field1370 = 50;
                class65.field778 = class331.field5303 + var19 / 11 + "%";
            }
        } else if (class44.field506 == 80) {
            int var23 = class45.method276(0, class65.field786);
            int var24 = class214.method1492(14);
            if (var24 <= var23) {
                class120.method778((byte) -124, class65.field786);
                class44.field506 = 90;
                class65.field778 = class77.field1005;
                class101.field1370 = 60;
            } else {
                class65.field778 = class5.field51 + var23 * 100 / var24 + "%";
                class101.field1370 = 60;
            }
        } else if (class44.field506 == 90) {
            if (class72.field903.method102(-1)) {
                class138 var22 = new class138(class178.field2675, class72.field903, class65.field786, 20, !class13.field136);
                class104.method667(var22);
                if (class164.field2522 == 1) {
                    class104.method658(0.9F);
                }
                if (class164.field2522 == 2) {
                    class104.method658(0.8F);
                }
                if (class164.field2522 == 3) {
                    class104.method658(0.7F);
                }
                if (class164.field2522 == 4) {
                    class104.method658(0.6F);
                }
                class44.field506 = 100;
                class101.field1370 = 70;
                class65.field778 = class321.field4988;
            } else {
                class65.field778 = class12.field122 + class72.field903.method111((byte) 108) + "%";
                class101.field1370 = 70;
            }
        } else if (class44.field506 != 100) {
            if (arg0 != -7669) {
                method2020(-47);
            }
            if (class44.field506 == 110) {
                class142.field2214 = new class43();
                class156.field2451.method155(10, class142.field2214, -3);
                class65.field778 = class223.field3381;
                class44.field506 = 120;
                class101.field1370 = 75;
            } else if (class44.field506 == 120) {
                if (class169.field2583.method103(arg0 ^ 0xFF001DF4, "huffman", "")) {
                    class119 var21 = new class119(class169.field2583.method119("huffman", "", 125));
                    class62.method386(var21, true);
                    class65.field778 = class106.field1461;
                    class101.field1370 = 80;
                    class44.field506 = 130;
                } else {
                    class65.field778 = class107.field1475 + "0%";
                    class101.field1370 = 80;
                }
            } else if (class44.field506 == 130) {
                if (!class353.field5630.method102(-1)) {
                    class65.field778 = class181.field2731 + class353.field5630.method111((byte) 58) * 3 / 4 + "%";
                    class101.field1370 = 85;
                } else if (!class309.field4821.method102(-1)) {
                    class65.field778 = class181.field2731 + (class309.field4821.method111((byte) 25) / 10 + 75) + "%";
                    class101.field1370 = 85;
                } else if (!class107.field1476.method102(-1)) {
                    class65.field778 = class181.field2731 + (class107.field1476.method111((byte) 126) / 20 + 85) + "%";
                    class101.field1370 = 85;
                } else if (class308.field4782.method99("details", (byte) -104)) {
                    class336.method2318(class308.field4782);
                    class141.method978(class101.field1372);
                    class3.method23(class166.field2567);
                    class44.field506 = 135;
                    class65.field778 = class247.field3918;
                    class101.field1370 = 95;
                } else {
                    class65.field778 = class181.field2731 + ((class308.field4782.method98("details", arg0 + 7668) / 10) + 90) + "%";
                    class101.field1370 = 85;
                }
            } else if (class44.field506 == 135) {
                int var20 = class6.method36(1);
                if (var20 == -1) {
                    class65.field778 = class256.field4046;
                    class101.field1370 = 95;
                } else if (var20 == 7 || var20 == 9) {
                    this.method2266("worldlistfull", -15309);
                    class219.method1525((byte) -116, 1000);
                } else if (class115.field1602) {
                    class101.field1370 = 96;
                    class65.field778 = class93.field1253;
                    class44.field506 = 140;
                } else {
                    this.method2266("worldlistio_" + var20, -15309);
                    class219.method1525((byte) -127, 1000);
                }
            } else if (class44.field506 == 140) {
                class14.field143 = class353.field5630.method93(arg0 ^ 0x1D86, "loginscreen");
                class102.field1380.method106(arg0 ^ 0xFFFFE2CC, false, true);
                class60.field714.method106(199, true, true);
                class65.field786.method106(199, true, true);
                class107.field1476.method106(arg0 ^ 0xFFFFE2CC, true, true);
                class169.field2583.method106(arg0 ^ 0xFFFFE2CC, true, true);
                class353.field5630.method106(199, true, true);
                class101.field1370 = 97;
                class260.field4116 = true;
                class65.field778 = class355.field5647;
                class44.field506 = 150;
            } else if (class44.field506 == 150) {
                class144.method1067();
                if (class283.field4519) {
                    class75.field966 = 0;
                    field4441 = 0;
                    class24.field285 = 0;
                    class161.field2482 = 0;
                }
                class283.field4519 = true;
                class160.method1162(class156.field2451, (byte) -125);
                class145.method1074(false, class161.field2482, -1, -1, 111);
                class65.field778 = class226.field3422;
                class44.field506 = 160;
                class101.field1370 = 100;
            } else if (class44.field506 == 160) {
                class88.method561(true, 8);
            }
        } else if (class10.method60(arg0 ^ 0x6218, class65.field786)) {
            class44.field506 = 110;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 847)
    public final void method2012(int arg0) {
        field4436++;
        method2026(arg0 ^ 0xFFFFFFED);
        class141.method985();
        class147.method1079(25419);
        class127.method863((byte) -97);
        class336.method2326();
        class212.method1483(true);
        class301.method2122(-19081);
        class327.method2270(29821);
        class272.method1960();
        class274.method1974(false);
        class10.method62(-45);
        class43.method269((byte) -105);
        class89.method563((byte) -93);
        class143.method1005(2);
        class220.method1530((byte) -114);
        class78.method500((byte) -66);
        class207.method1449(true);
        class154.method1125(-81);
        class211.method1465(0);
        class16.method94(-1);
        class74.method465((byte) -92);
        class205.method1436(-49);
        class62.method379(arg0 + 125);
        class231.method1598((byte) -117);
        class49.method298(false);
        class262.method1853(-13957);
        class323.method2253(arg0 ^ 0x0);
        class84.method537(1);
        class67.method409(true);
        class257.method1813(10057);
        class2.method12((byte) -67);
        class117.method755((byte) -95);
        class73.method456(26884);
        class96.method625(true);
        class223.method1559((byte) -106);
        class93.method603(123);
        class201.method1397(true);
        class246.method1749(63);
        class111.method716(true);
        class242.method1708(false);
        class196.method1370(0);
        class254.method1798(20);
        class140.method957((byte) -96);
        class238.method1650(125);
        class100.method634(67758055);
        class188.method1292(-17080);
        class345.method2398((byte) 2);
        class95.method621(arg0 ^ 0xFFFFD553);
        class24.method179((byte) 67);
        class293.method2085(arg0 - 113);
        class69.method431((byte) -73);
        class171.method1202((byte) -99);
        class11.method67(-4654);
        class38.method241(arg0 ^ 0xFFFFFFC4);
        class304.method2143(0);
        class32.method223((byte) -86);
        class218.method1516(-53);
        class99.method631((byte) 65);
        class312.method2202((byte) 114);
        class128.method874((byte) -117);
        class152.method1106();
        class332.method2298(-22396);
        class45.method279((byte) -117);
        class315.method2223(-11371);
        class331.method2293(0);
        class29.method212((byte) -105);
        class130.method897(arg0 - 67595544);
        class176.method1222(arg0 - 25156);
        class26.method188();
        class241.method1703(-57);
        class193.method1327();
        class19.method141(50);
        class124.method821();
        class309.method2191(96);
        class133.method923();
        class321.method2238((byte) 127);
        class296.method2100((byte) -23);
        class6.method37(false);
        class289.method2066(arg0 ^ 0x2301);
        class1.method6();
        class335.method2307();
        class258.method1819(-98);
        class253.method1797(-32682);
        class20.method146(false);
        class149.method1090((byte) -101);
        class240.method1676();
        class302.method2130((byte) -107);
        class180.method1243((byte) 57);
        class59.method349();
        class351.method2435((byte) 117);
        class252.method1789(-123);
        class334.method2306((byte) 100);
        class182.method1253((byte) -90);
        class249.method1764();
        class5.method35(0);
        class276.method1975(-71);
        class250.method1779((byte) -51);
        class179.method1239(1);
        class197.method1375((byte) -47);
        class343.method2353();
        class352.method2438((byte) -123);
        class178.method1232((byte) -103);
        class303.method2132(true);
        class259.method1825((byte) -55);
        class280.method2004((byte) -113);
        class146.method1077((byte) 49);
        class291.method2075(arg0 + 256);
        class55.method327(arg0 ^ 0x52);
        class245.method1732(-69);
        class90.method566(-127);
        class125.method857(true);
        class282.method2036(-34);
        class314.method2218(0);
        class72.method442(arg0 + 1);
        class3.method22();
        class79.method522(-10595);
        class344.method2387(false);
        class328.method2280(arg0 + 112);
        class13.method78((byte) -5);
        class222.method1551(true);
        class271.method1917((byte) 6);
        class269.method1902();
        class184.method1273(arg0 - 19356);
        class18.method138((byte) -49);
        class244.method1726((byte) -60);
        class42.method261(1);
        class313.method2214((byte) 39);
        class138.method945(255);
        class172.method1205((byte) -110);
        class347.method2405(637);
        class87.method552((byte) 121);
        class114.method734();
        class57.method344(arg0 + 29656);
        class104.method664();
        class119.method773(arg0 ^ 0xFFFFD412);
        class52.method314(arg0);
        class310.method2193((byte) -82);
        class88.method560((byte) 104);
        class122.method788(~arg0);
        class285.method2054(true);
        class144.method1070();
        class322.method2241((byte) -100);
        class248.method1758();
        class307.method2164(0);
        class256.method1806((byte) 121);
        class232.method1601((byte) -96);
        class185.method1279((byte) -125);
        class126.method860(false);
        class294.method2094(arg0 - 94);
        class175.method1217();
        class44.method272(true);
        class85.method540(111);
        class123.method792((byte) -67);
        class54.method324(-1);
        class360.method2519(arg0 + 95);
        class353.method2445(-122);
        class33.method230(-5734);
        class51.method311();
        class355.method2453((byte) -121);
        class77.method495(7329);
        class229.method1590((byte) -84);
        class318.method2231();
        class195.method1358();
        class358.method2468();
        class206.method1440();
        class58.method347((byte) 105);
        class255.method1800(true);
        class71.method440((byte) -89);
        class204.method1423();
        class239.method1660();
        class66.method405();
        class226.method1573((byte) -10);
        class192.method1309(-112);
        class132.method908(123);
        class161.method1167((byte) -107);
        class279.method1993(-102);
        class337.method2327(255);
        class12.method72(0);
        class268.method1881();
        class28.method206(true);
        class166.method1184((byte) 103);
        class68.method427((byte) 27);
        class281.method2032(true);
        class349.method2414(true);
        class227.method1579(true);
        class213.method1487(-22113);
        class60.method370(true);
        class75.method476(true);
        class236.method1633(32517);
        class63.method389(17340);
        class41.method252(false);
        class305.method2149(arg0 ^ 0x2);
        class183.method1268();
        class260.method1832(-8351);
        class174.method1212(126);
        class189.method1297(115);
        class187.method1289(116);
        class36.method239(-28918);
        class80.method523(1);
        class115.method747(arg0 - 110);
        class216.method1503();
        class247.method1756(1);
        class102.method644(29069);
        class170.method1197(false);
        class325.method2261((byte) 61);
        class251.method1784((byte) 109);
        class48.method297(true);
        class297.method2105();
        class341.method2344();
        class23.method177(-104);
        class230.method1594((byte) -73);
        class346.method2400(-8606);
        class120.method779(arg0 + 6);
        class202.method1414();
        class137.method940();
        class61.method375(-100);
        class163.method1172(0);
        class159.method1156();
        class107.method692(104);
        class221.method1545();
        class150.method1096();
        class311.method2201(false);
        class101.method643(-21573);
        class237.method1639(false);
        class306.method2154(true);
        class263.method1863(arg0 ^ 0x79);
        class131.method898(31105);
        class316.method2230(arg0 ^ 0xFFFFFF8E);
        class194.method1351(~arg0);
        class235.method1628((byte) 86);
        class109.method703(7303);
        class333.method2303(arg0 - 114);
        class46.method283();
        class27.method200(-121);
        class203.method1420(-1);
        class31.method217(97);
        class136.method936(false);
        class25.method184((byte) -112);
        class300.method2115((byte) -63);
        class278.method1988(-90);
        class214.method1497(-98);
        class186.method1281(1810482956);
        class151.method1102((byte) 18);
        class116.method752(-20262);
        class106.method686(-18355);
        class290.method2072((byte) -105);
        class142.method998(-29921);
        class265.method1872(arg0 + 12345679);
        class228.method1584(arg0 ^ 0xFFFFFFFE);
        class86.method544((byte) -107);
        class342.method2348(true);
        class348.method2410(-159174072);
        class357.method2459(0);
        class324.method2257(arg0 ^ 0xFFFFFF8D);
        class108.method699(false);
        class70.method435(255);
        class105.method684((byte) -79);
        class156.method1136((byte) -116);
        class7.method42((byte) 109);
        class35.method236(-26211);
        class308.method2168(arg0 ^ arg0);
        class210.method1462(true);
        class225.method1563((byte) 5);
        class295.method2097(-75);
        class233.method1609((byte) 108);
        class139.method954(arg0 + 2);
        class261.method1843(-107);
        class135.method926((byte) -15);
        class50.method310(-19262);
        class215.method1500(0);
        class169.method1195(0);
        class181.method1249((byte) -99);
        class208.method1455((byte) -117);
        class168.method1194((byte) 110);
        class91.method571(arg0 + 33);
        class298.method2109(-3419);
        class110.method712((byte) -109);
        class4.method28((byte) -49);
        class92.method576((byte) 8);
        class65.method394(false);
        class267.method1877((byte) 46);
        class266.method1873(-103);
        class148.method1086(~arg0);
        class14.method83(101);
        class112.method729((byte) -12);
        class191.method1307((byte) -118);
        class273.method1968((byte) -79);
        if (class327.field5265) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lhi;)Lnf;", line = 1141)
    public static final class76 method2013(class323 arg0) {
        class76 var1 = (class76) class186.field2804.method770(((long) arg0.field5073 << 32) + (long) arg0.field5112, 104);
        return var1 == null ? arg0.field5015 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V", line = 1148)
    private final void method2014(byte[] arg0, boolean arg1) {
        field4424++;
        if (arg1) {
            return;
        }
        class143 var3 = new class143(arg0);
        while (true) {
            int var4 = var3.method1043(true);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                int[] var5 = class218.field3278 = new int[6];
                var5[0] = var3.method1051(1);
                var5[1] = var3.method1051(1);
                var5[2] = var3.method1051(1);
                var5[3] = var3.method1051(1);
                var5[4] = var3.method1051(1);
                var5[5] = var3.method1051(1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lhi;)Z", line = 1190)
    public static final boolean method2015(class323 arg0) {
        if (class214.field3244) {
            if (method2013(arg0).field994 != 0) {
                return false;
            }
            if (arg0.field5107 == 0) {
                return false;
            }
        }
        return arg0.field5132;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1205)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class18.method135("argument count", (byte) 73);
            }
            class171.field2603 = Integer.parseInt(arg0[0]);
            class296.field4656 = 2;
            if (arg0[1].equals("live")) {
                class313.field4898 = 0;
            } else if (arg0[1].equals("rc")) {
                class313.field4898 = 1;
            } else if (arg0[1].equals("wip")) {
                class313.field4898 = 2;
            } else {
                class18.method135("modewhat", (byte) 107);
            }
            class241.field3699 = false;
            class234.field3567 = class226.method1569(arg0[2], -1);
            if (class234.field3567 == -1) {
                if (arg0[2].equals("english")) {
                    class234.field3567 = 0;
                } else if (arg0[2].equals("german")) {
                    class234.field3567 = 1;
                } else {
                    class18.method135("language", (byte) 43);
                }
            }
            class189.method1294(class234.field3567, -1);
            class140.field2131 = false;
            class324.field5210 = false;
            if (arg0[3].equals("game0")) {
                class199.field3024 = 0;
            } else if (arg0[3].equals("game1")) {
                class199.field3024 = 1;
            } else {
                class18.method135("game", (byte) 107);
            }
            class186.field2797 = false;
            field4444 = "";
            class233.field3522 = 0;
            class115.field1599 = 0;
            client var1 = new client();
            class5.field59 = var1;
            var1.method2276(false, (byte) 83, 549, class313.field4898 + 32, 1024, 768, class199.field3024 == 1 ? "mechscape" : "runescape", 29);
            class231.field3498.setLocation(40, 40);
        } catch (Exception var3) {
            class27.method198(var3, (byte) 62, (String) null);
        }
        field4431++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lhi;)Lhi;", line = 1271)
    public static final class323 method2016(class323 arg0) {
        int var1 = method2013(arg0).method484(74);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class45.method277(-12866, arg0.field5196);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 1293)
    public final void method2017(byte arg0) {
        class348.method2413(-1);
        class79.field1050 = new class207();
        field4430++;
        class179.field2684 = new class78();
        if (class313.field4898 != 0) {
            class19.field234 = new byte[50][];
        }
        class132.method906(class156.field2451, -6177);
        if (class296.field4656 == 0) {
            class185.field2792 = this.getCodeBase().getHost();
            class108.field1489 = 443;
            class245.field3861 = 43594;
        } else if (class296.field4656 == 1) {
            class185.field2792 = this.getCodeBase().getHost();
            class245.field3861 = class171.field2603 + 40000;
            class108.field1489 = class171.field2603 + 50000;
        } else if (class296.field4656 == 2) {
            class185.field2792 = "127.0.0.1";
            class245.field3861 = class171.field2603 + 40000;
            class108.field1489 = class171.field2603 + 50000;
        }
        if (class22.field253 == 3 && class296.field4656 != 2) {
            class196.field2976 = class171.field2603;
        }
        class43.field490 = class245.field3861;
        class345.field5479 = class108.field1489;
        if (arg0 > -27) {
            return;
        }
        class218.field3281 = class245.field3861;
        class125.field1773 = class184.field2778 = class38.field432 = class271.field4266 = new short[256];
        if (class199.field3024 == 1) {
            class54.field618 = class265.field4187;
            class127.field1862 = class128.field1866;
            class67.field847 = true;
            class79.field1059 = class298.field4680;
            class26.field303 = 0;
            class26.field304 = 16777215;
            class130.field1881 = class36.field419;
        } else {
            class79.field1059 = class207.field3137;
            class54.field618 = class235.field3623;
            class127.field1862 = class123.field1692;
            class130.field1881 = class236.field3626;
        }
        class10.field111 = class218.field3281;
        class61.field726 = class185.field2792;
        class252.method1788(191);
        class52.method315(-92, class328.field5287);
        class306.method2162(-1, class328.field5287);
        class171.field2599 = class347.method2408(1);
        if (class171.field2599 != null) {
            class171.field2599.method453(-37, class328.field5287);
        }
        class69.field865 = class22.field253;
        try {
            if (class156.field2451.field256 != null) {
                class274.field4336 = new class74(class156.field2451.field256, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class23.field276[var2] = new class74(class156.field2451.field257[var2], 6000, 0);
                }
                class80.field1062 = new class74(class156.field2451.field246, 6000, 0);
                class263.field4168 = new class205(255, class274.field4336, class80.field1062, 500000);
                class49.field564 = new class74(class156.field2451.field252, 24, 0);
                class156.field2451.field257 = null;
                class156.field2451.field252 = null;
                class156.field2451.field246 = null;
                class156.field2451.field256 = null;
            }
        } catch (IOException var4) {
            class49.field564 = null;
            class80.field1062 = null;
            class274.field4336 = null;
            class263.field4168 = null;
        }
        if (class199.field3024 == 0) {
            class84.field1092 = class70.field878;
        } else if (class199.field3024 == 1) {
            class84.field1092 = class263.field4174;
        }
        if (class296.field4656 != 0) {
            class226.field3425 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1419)
    private final void method2018(int arg0) {
        class295.field4641 = 0;
        if (arg0 != 485412359) {
            return;
        }
        while (class171.method1201(127) && class295.field4641 < 128) {
            class309.field4839[class295.field4641] = class87.field1147;
            class327.field5260[class295.field4641] = class99.field1339;
            class295.field4641++;
        }
        field4429++;
        class266.field4193++;
        if (class345.field5482 != -1) {
            class309.method2182(class345.field5482, 0, class165.field2546, 0, class95.field1307, 0, 0, false);
        }
        class181.field2734++;
        if (class272.field4317) {
            int var2 = 2359807;
            label196: for (int var3 = 0; var3 < 32768; var3++) {
                class231 var4 = class251.field3974[var3];
                if (var4 != null) {
                    byte var5 = var4.field3503.field2155;
                    if ((var5 & 0x2) > 0 && var4.field3789 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field3747[0] = (var4.field3767 >> 7) + var6;
                            var4.field3720[0] = 1;
                            var4.field3786[0] = (var4.field3763 >> 7) + var7;
                            class247.field3914[class219.field3290].method1850(var4.field3767 >> 7, false, -30321, 0, var4.method412((byte) 72), var4.field3763 >> 7, false, var4.method412((byte) 121));
                            if (var4.field3747[0] >= 0 && var4.field3747[0] <= 104 - var4.method412((byte) 107) && var4.field3786[0] >= 0 && var4.field3786[0] <= (104 - var4.method412((byte) 81)) && class247.field3914[class219.field3290].method1849(var4.field3763 >> 7, var4.field3747[0], var4.field3786[0], var4.field3767 >> 7, (byte) 127)) {
                                if (var4.method412((byte) 126) > 1) {
                                    for (int var8 = var4.field3747[0]; var8 < var4.field3747[0] + var4.method412((byte) 104); var8++) {
                                        for (int var9 = var4.field3786[0]; (var4.field3786[0] + var4.method412((byte) 94)) > var9; var9++) {
                                            if ((var2 & class247.field3914[class219.field3290].field4156[var8][var9]) != 0) {
                                                continue label196;
                                            }
                                        }
                                    }
                                }
                                var4.field3789 = 1;
                            }
                        }
                    }
                    class63.method390(var4, (byte) -85);
                    class127.method868(var4, (byte) -100);
                    class96.method624(0, var4);
                    class247.field3914[class219.field3290].method1854(false, false, var4.method412((byte) 96), var4.method412((byte) 89), var4.field3763 >> 7, false, var4.field3767 >> 7);
                }
            }
        }
        if (!class272.field4317 && class199.field3024 == 0) {
            class250.method1776(true);
        } else if (class231.field3500 == 0 && class148.field2354 == 0) {
            if (class120.field1667 == 2) {
                class85.method542((byte) -106);
            } else {
                class143.method1034((byte) 121);
            }
            if (class10.field96 >> 7 < 14 || class10.field96 >> 7 >= 90 || (class280.field4415 >> 7) < 14 || class280.field4415 >> 7 >= 90) {
                class135.method934(2048);
            }
        }
        while (true) {
            class185 var10;
            class323 var11;
            class323 var12;
            do {
                var10 = (class185) class349.field5553.method1808(0);
                if (var10 == null) {
                    while (true) {
                        class185 var13;
                        class323 var14;
                        class323 var15;
                        do {
                            var13 = (class185) class154.field2439.method1808(0);
                            if (var13 == null) {
                                while (true) {
                                    class185 var16;
                                    class323 var17;
                                    class323 var18;
                                    do {
                                        var16 = (class185) class282.field4482.method1808(0);
                                        if (var16 == null) {
                                            if (class147.field2341 != null) {
                                                class259.method1824(27636);
                                            }
                                            if (class323.field5159 != null && class323.field5159.field2419 == 1) {
                                                if (class323.field5159.field2421 != null) {
                                                    class180.method1240(class191.field2874, 88, class162.field2490);
                                                }
                                                class191.field2874 = null;
                                                class162.field2490 = false;
                                                class323.field5159 = null;
                                            }
                                            if ((class102.field1381 % 1500) == 0) {
                                                class111.method725(arg0 - 485398957);
                                            }
                                            return;
                                        }
                                        var17 = var16.field2793;
                                        if (var17.field5112 < 0) {
                                            break;
                                        }
                                        var18 = class45.method277(-12866, var17.field5196);
                                    } while (var18 == null || var18.field5036 == null || var18.field5036.length <= var17.field5112 || var18.field5036[var17.field5112] != var17);
                                    class208.method1456(-7155, var16);
                                }
                            }
                            var14 = var13.field2793;
                            if (var14.field5112 < 0) {
                                break;
                            }
                            var15 = class45.method277(-12866, var14.field5196);
                        } while (var15 == null || var15.field5036 == null || var15.field5036.length <= var14.field5112 || var15.field5036[var14.field5112] != var14);
                        class208.method1456(-7155, var13);
                    }
                }
                var11 = var10.field2793;
                if (var11.field5112 < 0) {
                    break;
                }
                var12 = class45.method277(-12866, var11.field5196);
            } while (var12 == null || var12.field5036 == null || var11.field5112 >= var12.field5036.length || var12.field5036[var11.field5112] != var11);
            class208.method1456(-7155, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lhi;IIIIIII)V", line = 1643)
    public static final void method2019(class323[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class323 var9 = arg0[var8];
            if (var9 != null && var9.field5196 == arg1 && (!var9.field5172 || var9.field5107 == 0 || var9.field5048 || method2013(var9).field994 != 0 || class67.field838 == var9 || var9.field5182 == 1338) && (!var9.field5172 || !method2015(var9))) {
                int var10 = var9.field5029 + arg6;
                int var11 = var9.field5104 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field5107 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field5169 + var10;
                    int var17 = var9.field5174 + var11;
                    if (var9.field5107 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class147.field2341 == var9) {
                    class334.field5337 = true;
                    class162.field2488 = var10;
                    class78.field1015 = var11;
                }
                if (!var9.field5172 || var12 < var14 && var13 < var15) {
                    if (var9.field5107 == 0) {
                        if (!var9.field5172 && method2015(var9) && class131.field1888 != var9) {
                            continue;
                        }
                        if (var9.field5129 && class197.field3009 >= var12 && class128.field1873 >= var13 && class197.field3009 < var14 && class128.field1873 < var15) {
                            for (class185 var18 = (class185) class282.field4482.method1812(1); var18 != null; var18 = (class185) class282.field4482.method1809(128)) {
                                if (var18.field2781) {
                                    var18.method1290(-87);
                                    var18.field2793.field5089 = false;
                                }
                            }
                            if (class253.field4003 == 0) {
                                class147.field2341 = null;
                                class67.field838 = null;
                            }
                            class361.field5711 = 0;
                            class246.field3867 = false;
                        }
                    }
                    if (var9.field5172) {
                        boolean var19;
                        if (class197.field3009 >= var12 && class128.field1873 >= var13 && class197.field3009 < var14 && class128.field1873 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class312.field4891 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class251.field3982 == 1 && class301.field4694 >= var12 && class19.field223 >= var13 && class301.field4694 < var14 && class19.field223 < var15) {
                            var21 = true;
                        }
                        if (var9.field5057 != null) {
                            for (int var22 = 0; var22 < var9.field5057.length; var22++) {
                                if (class276.field4349[var9.field5057[var22]]) {
                                    if (var9.field5056 == null || class102.field1381 >= var9.field5056[var22]) {
                                        byte var23 = var9.field5087[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class276.field4349[86] && !class276.field4349[82] && !class276.field4349[81]) && ((var23 & 0x2) == 0 || class276.field4349[86]) && ((var23 & 0x1) == 0 || class276.field4349[82]) && ((var23 & 0x4) == 0 || class276.field4349[81])) {
                                            class230.method1595(var22 + 1, var9.field5073, "", -5568, -1);
                                            int var24 = var9.field5030[var22];
                                            if (var9.field5056 == null) {
                                                var9.field5056 = new int[var9.field5057.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field5056[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field5056[var22] = class102.field1381 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field5056 != null) {
                                    var9.field5056[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class310.method2195(class19.field223 - var11, class301.field4694 - var10, false, var9);
                        }
                        if (class147.field2341 != null && class147.field2341 != var9 && var19 && method2013(var9).method488(2332046)) {
                            class148.field2353 = var9;
                        }
                        if (class67.field838 == var9) {
                            class205.field3110 = true;
                            class360.field5703 = var10;
                            class35.field402 = var11;
                        }
                        if (var9.field5048 || var9.field5182 != 0) {
                            if (var19 && class228.field3468 != 0 && var9.field5201 != null) {
                                class185 var25 = new class185();
                                var25.field2781 = true;
                                var25.field2793 = var9;
                                var25.field2780 = class228.field3468;
                                var25.field2789 = var9.field5201;
                                class282.field4482.method1814(var25, true);
                            }
                            if (class147.field2341 != null || class203.field3088 != null || class38.field437 || var9.field5182 != 1400 && class361.field5711 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field5182 != 0) {
                                if (var9.field5182 == 1337) {
                                    class131.field1883 = var9;
                                    continue;
                                }
                                if (var9.field5182 == 1338) {
                                    if (var21) {
                                        class271.field4269 = class301.field4694 - var10;
                                        class20.field240 = class19.field223 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field5182 == 1400) {
                                    class68.field852 = var9;
                                    if (var19) {
                                        class246.field3867 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class301.field4694 - var10 - var9.field5169 / 2) * 2.0D / (double) class336.field5351);
                                        int var27 = (int) ((double) (class19.field223 - var11 - var9.field5174 / 2) * 2.0D / (double) class336.field5351);
                                        int var28 = class315.field4950 + var26;
                                        int var29 = class63.field752 + var27;
                                        int var30 = class336.field5346 + var28;
                                        int var31 = class336.field5350 + class336.field5354 - var29 - 1;
                                        class212 var32 = class229.method1593((byte) -70);
                                        int[] var33 = new int[3];
                                        var32.method1481(var33, 126, var30, var31);
                                        if (var33 != null) {
                                            if (class276.field4349[82] && class100.field1350 > 0) {
                                                class123.method793(var33[0], var33[2], -2266, var33[1]);
                                                class154.method1124(-77);
                                                continue;
                                            }
                                            class201.field3056++;
                                            class328.field5282.method304(221, 19830);
                                            class328.field5282.method1052(var33[0] << 28 | var33[1] << 14 | var33[2], false);
                                        }
                                        class361.field5711 = 1;
                                        class12.field123 = false;
                                        class247.field3928 = class197.field3009;
                                        class85.field1120 = class128.field1873;
                                        continue;
                                    }
                                    if (var20 && class361.field5711 > 0) {
                                        if (class361.field5711 == 1 && (class247.field3928 != class197.field3009 || class85.field1120 != class128.field1873)) {
                                            class10.field99 = class315.field4950;
                                            class132.field1900 = class63.field752;
                                            class361.field5711 = 2;
                                        }
                                        if (class361.field5711 == 2) {
                                            class12.field123 = true;
                                            class227.method1576((int) ((double) (class247.field3928 - class197.field3009) * 2.0D / (double) class336.field5349) + class10.field99, false);
                                            class296.method2101((int) ((double) (class85.field1120 - class128.field1873) * 2.0D / (double) class336.field5349) + class132.field1900, 98);
                                        }
                                        continue;
                                    }
                                    if (class361.field5711 > 0 && !class12.field123) {
                                        if ((class52.field602 == 1 || class89.method562(14, class74.field924 - 1)) && class74.field924 > 2) {
                                            class92.method573(-1);
                                        } else if (class74.field924 > 0) {
                                            class65.method393(97);
                                        }
                                    }
                                    class361.field5711 = 0;
                                    continue;
                                }
                                if (var9.field5182 == 1401) {
                                    if (var20) {
                                        class160.method1158(class128.field1873 - var11, var9.field5169, var9.field5174, class197.field3009 - var10, -24);
                                    }
                                    continue;
                                }
                                if (var9.field5182 == 1402) {
                                    if (!class272.field4317) {
                                        class107.method693(var9, 6);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field5162 && var21) {
                                var9.field5162 = true;
                                if (var9.field5086 != null) {
                                    class185 var34 = new class185();
                                    var34.field2781 = true;
                                    var34.field2793 = var9;
                                    var34.field2785 = class301.field4694 - var10;
                                    var34.field2780 = class19.field223 - var11;
                                    var34.field2789 = var9.field5086;
                                    class282.field4482.method1814(var34, true);
                                }
                            }
                            if (var9.field5162 && var20 && var9.field5049 != null) {
                                class185 var35 = new class185();
                                var35.field2781 = true;
                                var35.field2793 = var9;
                                var35.field2785 = class197.field3009 - var10;
                                var35.field2780 = class128.field1873 - var11;
                                var35.field2789 = var9.field5049;
                                class282.field4482.method1814(var35, true);
                            }
                            if (var9.field5162 && !var20) {
                                var9.field5162 = false;
                                if (var9.field5192 != null) {
                                    class185 var36 = new class185();
                                    var36.field2781 = true;
                                    var36.field2793 = var9;
                                    var36.field2785 = class197.field3009 - var10;
                                    var36.field2780 = class128.field1873 - var11;
                                    var36.field2789 = var9.field5192;
                                    class154.field2439.method1814(var36, true);
                                }
                            }
                            if (var20 && var9.field5157 != null) {
                                class185 var37 = new class185();
                                var37.field2781 = true;
                                var37.field2793 = var9;
                                var37.field2785 = class197.field3009 - var10;
                                var37.field2780 = class128.field1873 - var11;
                                var37.field2789 = var9.field5157;
                                class282.field4482.method1814(var37, true);
                            }
                            if (!var9.field5089 && var19) {
                                var9.field5089 = true;
                                if (var9.field5077 != null) {
                                    class185 var38 = new class185();
                                    var38.field2781 = true;
                                    var38.field2793 = var9;
                                    var38.field2785 = class197.field3009 - var10;
                                    var38.field2780 = class128.field1873 - var11;
                                    var38.field2789 = var9.field5077;
                                    class282.field4482.method1814(var38, true);
                                }
                            }
                            if (var9.field5089 && var19 && var9.field5149 != null) {
                                class185 var39 = new class185();
                                var39.field2781 = true;
                                var39.field2793 = var9;
                                var39.field2785 = class197.field3009 - var10;
                                var39.field2780 = class128.field1873 - var11;
                                var39.field2789 = var9.field5149;
                                class282.field4482.method1814(var39, true);
                            }
                            if (var9.field5089 && !var19) {
                                var9.field5089 = false;
                                if (var9.field5027 != null) {
                                    class185 var40 = new class185();
                                    var40.field2781 = true;
                                    var40.field2793 = var9;
                                    var40.field2785 = class197.field3009 - var10;
                                    var40.field2780 = class128.field1873 - var11;
                                    var40.field2789 = var9.field5027;
                                    class154.field2439.method1814(var40, true);
                                }
                            }
                            if (var9.field5031 != null) {
                                class185 var41 = new class185();
                                var41.field2793 = var9;
                                var41.field2789 = var9.field5031;
                                class349.field5553.method1814(var41, true);
                            }
                            if (var9.field5115 != null && class218.field3279 > var9.field5164) {
                                if (var9.field5059 == null || class218.field3279 - var9.field5164 > 32) {
                                    class185 var46 = new class185();
                                    var46.field2793 = var9;
                                    var46.field2789 = var9.field5115;
                                    class282.field4482.method1814(var46, true);
                                } else {
                                    label600: for (int var42 = var9.field5164; var42 < class218.field3279; var42++) {
                                        int var43 = class163.field2506[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field5059.length; var44++) {
                                            if (var9.field5059[var44] == var43) {
                                                class185 var45 = new class185();
                                                var45.field2793 = var9;
                                                var45.field2789 = var9.field5115;
                                                class282.field4482.method1814(var45, true);
                                                break label600;
                                            }
                                        }
                                    }
                                }
                                var9.field5164 = class218.field3279;
                            }
                            if (var9.field5047 != null && class265.field4190 > var9.field5177) {
                                if (var9.field5082 == null || class265.field4190 - var9.field5177 > 32) {
                                    class185 var51 = new class185();
                                    var51.field2793 = var9;
                                    var51.field2789 = var9.field5047;
                                    class282.field4482.method1814(var51, true);
                                } else {
                                    label576: for (int var47 = var9.field5177; var47 < class265.field4190; var47++) {
                                        int var48 = class31.field363[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field5082.length; var49++) {
                                            if (var9.field5082[var49] == var48) {
                                                class185 var50 = new class185();
                                                var50.field2793 = var9;
                                                var50.field2789 = var9.field5047;
                                                class282.field4482.method1814(var50, true);
                                                break label576;
                                            }
                                        }
                                    }
                                }
                                var9.field5177 = class265.field4190;
                            }
                            if (var9.field5119 != null && class231.field3490 > var9.field5150) {
                                if (var9.field5179 == null || class231.field3490 - var9.field5150 > 32) {
                                    class185 var56 = new class185();
                                    var56.field2793 = var9;
                                    var56.field2789 = var9.field5119;
                                    class282.field4482.method1814(var56, true);
                                } else {
                                    label552: for (int var52 = var9.field5150; var52 < class231.field3490; var52++) {
                                        int var53 = class235.field3612[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field5179.length; var54++) {
                                            if (var9.field5179[var54] == var53) {
                                                class185 var55 = new class185();
                                                var55.field2793 = var9;
                                                var55.field2789 = var9.field5119;
                                                class282.field4482.method1814(var55, true);
                                                break label552;
                                            }
                                        }
                                    }
                                }
                                var9.field5150 = class231.field3490;
                            }
                            if (var9.field5044 != null && class27.field328 > var9.field5193) {
                                if (var9.field5154 == null || class27.field328 - var9.field5193 > 32) {
                                    class185 var61 = new class185();
                                    var61.field2793 = var9;
                                    var61.field2789 = var9.field5044;
                                    class282.field4482.method1814(var61, true);
                                } else {
                                    label528: for (int var57 = var9.field5193; var57 < class27.field328; var57++) {
                                        int var58 = class90.field1188[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field5154.length; var59++) {
                                            if (var9.field5154[var59] == var58) {
                                                class185 var60 = new class185();
                                                var60.field2793 = var9;
                                                var60.field2789 = var9.field5044;
                                                class282.field4482.method1814(var60, true);
                                                break label528;
                                            }
                                        }
                                    }
                                }
                                var9.field5193 = class27.field328;
                            }
                            if (var9.field5090 != null && class109.field1495 > var9.field5102) {
                                if (var9.field5083 == null || class109.field1495 - var9.field5102 > 32) {
                                    class185 var66 = new class185();
                                    var66.field2793 = var9;
                                    var66.field2789 = var9.field5090;
                                    class282.field4482.method1814(var66, true);
                                } else {
                                    label504: for (int var62 = var9.field5102; var62 < class109.field1495; var62++) {
                                        int var63 = class143.field2245[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field5083.length; var64++) {
                                            if (var9.field5083[var64] == var63) {
                                                class185 var65 = new class185();
                                                var65.field2793 = var9;
                                                var65.field2789 = var9.field5090;
                                                class282.field4482.method1814(var65, true);
                                                break label504;
                                            }
                                        }
                                    }
                                }
                                var9.field5102 = class109.field1495;
                            }
                            if (class263.field4170 > var9.field5070 && var9.field5170 != null) {
                                class185 var67 = new class185();
                                var67.field2793 = var9;
                                var67.field2789 = var9.field5170;
                                class282.field4482.method1814(var67, true);
                            }
                            if (class49.field566 > var9.field5070 && var9.field5028 != null) {
                                class185 var68 = new class185();
                                var68.field2793 = var9;
                                var68.field2789 = var9.field5028;
                                class282.field4482.method1814(var68, true);
                            }
                            if (class232.field3505 > var9.field5070 && var9.field5123 != null) {
                                class185 var69 = new class185();
                                var69.field2793 = var9;
                                var69.field2789 = var9.field5123;
                                class282.field4482.method1814(var69, true);
                            }
                            if (class190.field2860 > var9.field5070 && var9.field5178 != null) {
                                class185 var70 = new class185();
                                var70.field2793 = var9;
                                var70.field2789 = var9.field5178;
                                class282.field4482.method1814(var70, true);
                            }
                            if (class13.field134 > var9.field5070 && var9.field5017 != null) {
                                class185 var71 = new class185();
                                var71.field2793 = var9;
                                var71.field2789 = var9.field5017;
                                class282.field4482.method1814(var71, true);
                            }
                            var9.field5070 = class181.field2734;
                            if (var9.field5101 != null) {
                                for (int var72 = 0; var72 < class295.field4641; var72++) {
                                    class185 var73 = new class185();
                                    var73.field2793 = var9;
                                    var73.field2794 = class309.field4839[var72];
                                    var73.field2796 = class327.field5260[var72];
                                    var73.field2789 = var9.field5101;
                                    class282.field4482.method1814(var73, true);
                                }
                            }
                            if (class43.field480 && var9.field5075 != null) {
                                class185 var74 = new class185();
                                var74.field2793 = var9;
                                var74.field2789 = var9.field5075;
                                class282.field4482.method1814(var74, true);
                            }
                        }
                    }
                    if (!var9.field5172 && class147.field2341 == null && class203.field3088 == null && !class38.field437) {
                        if ((var9.field5052 >= 0 || var9.field5074 != 0) && class197.field3009 >= var12 && class128.field1873 >= var13 && class197.field3009 < var14 && class128.field1873 < var15) {
                            if (var9.field5052 >= 0) {
                                class131.field1888 = arg0[var9.field5052];
                            } else {
                                class131.field1888 = var9;
                            }
                        }
                        if (var9.field5107 == 8 && class197.field3009 >= var12 && class128.field1873 >= var13 && class197.field3009 < var14 && class128.field1873 < var15) {
                            class182.field2744 = var9;
                        }
                        if (var9.field5187 > var9.field5174) {
                            class113.method732(var11, var9.field5169 + var10, class128.field1873, var9.field5174, class197.field3009, false, var9.field5187, var9);
                        }
                    }
                    if (var9.field5107 == 0) {
                        method2019(arg0, var9.field5073, var12, var13, var14, var15, var10 - var9.field5142, var11 - var9.field5188);
                        if (var9.field5036 != null) {
                            method2019(var9.field5036, var9.field5073, var12, var13, var14, var15, var10 - var9.field5142, var11 - var9.field5188);
                        }
                        class238 var75 = (class238) class88.field1166.method770((long) var9.field5073, -93);
                        if (var75 != null) {
                            class309.method2182(var75.field3658, var13, var14, var10, var15, var12, var11, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2436)
    public static final void method2020(int arg0) {
        field4428++;
        for (int var1 = arg0; var1 < class298.field4681; var1++) {
            int var10002 = class14.field150[var1]--;
            if (class14.field150[var1] >= -10) {
                class284 var3 = class247.field3913[var1];
                if (var3 == null) {
                    var3 = class284.method2050(class69.field856, class187.field2811[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class14.field150[var1] += var3.method2049();
                    class247.field3913[var1] = var3;
                }
                if (class14.field150[var1] < 0) {
                    int var4;
                    if (class87.field1144[var1] == 0) {
                        var4 = class327.field5239[var1] * class189.field2847 >> 8;
                    } else {
                        int var5 = (class87.field1144[var1] & 0xFF) * 128;
                        int var6 = class87.field1144[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + (64 - class11.field113.field3767);
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = (class87.field1144[var1] & 0xFFA2) >> 8;
                        int var9 = var8 * 128 + 64 - class11.field113.field3763;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class14.field150[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class213.field3240 * class327.field5239[var1] / var5 >> 8;
                    }
                    if (var4 > 0) {
                        class37 var11 = var3.method2051().method240(class55.field662);
                        class359 var12 = class359.method2507(var11, 100, var4);
                        var12.method2500(class88.field1161[var1] - 1);
                        class20.field239.method2335(var12);
                    }
                    class14.field150[var1] = -100;
                }
            } else {
                class298.field4681--;
                for (int var2 = var1; var2 < class298.field4681; var2++) {
                    class187.field2811[var2] = class187.field2811[var2 + 1];
                    class247.field3913[var2] = class247.field3913[var2 + 1];
                    class88.field1161[var2] = class88.field1161[var2 + 1];
                    class14.field150[var2] = class14.field150[var2 + 1];
                    class87.field1144[var2] = class87.field1144[var2 + 1];
                    class327.field5239[var2] = class327.field5239[var2 + 1];
                }
                var1--;
            }
        }
        if (class327.field5234 && !class14.method81(6567)) {
            if (class31.field365 != 0 && class278.field4370 != -1) {
                class132.method904(class31.field365, false, class278.field4370, class60.field714, 1, 0);
            }
            class327.field5234 = false;
        } else if (class31.field365 != 0 && class278.field4370 != -1 && !class14.method81(6567)) {
            class285.field4528++;
            class328.field5282.method304(247, 19830);
            class328.field5282.method1052(class278.field4370, false);
            class278.field4370 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2560)
    public final void init() {
        field4438++;
        if (!this.method2268(0)) {
            return;
        }
        class171.field2603 = Integer.parseInt(this.getParameter("worldid"));
        class296.field4656 = Integer.parseInt(this.getParameter("modewhere"));
        if (class296.field4656 < 0 || class296.field4656 > 1) {
            class296.field4656 = 0;
        }
        class313.field4898 = Integer.parseInt(this.getParameter("modewhat"));
        if (class313.field4898 < 0 || class313.field4898 > 2) {
            class313.field4898 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class241.field3699 = true;
        } else {
            class241.field3699 = false;
        }
        try {
            class234.field3567 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class234.field3567 = 0;
        }
        class189.method1294(class234.field3567, -1);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class140.field2131 = true;
        } else {
            class140.field2131 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class324.field5210 = true;
        } else {
            class324.field5210 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class199.field3024 = 1;
        } else {
            class199.field3024 = 0;
        }
        try {
            class233.field3522 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class233.field3522 = 0;
        }
        field4444 = this.getParameter("settings");
        if (field4444 == null) {
            field4444 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class115.field1599 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class115.field1599 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class186.field2797 = true;
        } else {
            class186.field2797 = false;
        }
        class5.field59 = this;
        this.method2269(1549, -29, class313.field4898 + 32, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V", line = 2642)
    private final void method2021(byte arg0, int arg1) {
        class179.field2684.field1041 = arg1;
        class79.field1053 = null;
        class63.field764 = null;
        class179.field2684.field1042++;
        field4425++;
        if (arg0 < 75) {
            this.method2011(56);
        }
        class346.field5492 = 0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 2662)
    public final void method2022(byte arg0) {
        field4434++;
        if (field4443 == 1000) {
            return;
        }
        class102.field1381++;
        if (class102.field1381 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class323.field5118 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class70.field873.setSeed((long) class323.field5118);
        }
        this.method2024((byte) -124);
        if (class179.field2685 != null) {
            class179.field2685.method1121(0);
        }
        class283.method2046((byte) 110);
        class108.method698(-91);
        class10.method66((byte) 127);
        class346.method2403(20421);
        if (class272.field4317) {
            class1.method8();
        }
        if (class171.field2599 != null) {
            int var3 = class171.field2599.method451(127);
            class228.field3468 = var3;
        }
        if (field4443 == 0) {
            this.method2011(-7669);
            class227.method1577(-8588);
        } else if (field4443 == 5) {
            this.method2011(-7669);
            class227.method1577(-8588);
        } else if (field4443 == 25 || field4443 == 28) {
            class122.method783(-27592);
        }
        int var4 = -51 / ((72 - arg0) / 50);
        if (field4443 == 10) {
            this.method2018(485412359);
            class302.method2127(0);
            class35.method237(false);
            class69.method429((byte) 117);
        } else if (field4443 == 30) {
            class182.method1254(128);
        } else if (field4443 == 40) {
            class69.method429((byte) 117);
            if (class30.field353 != -3) {
                if (class30.field353 == 15) {
                    class302.method2129(0);
                } else if (class30.field353 != 2) {
                    class68.method425(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 2752)
    public final void method2023(byte arg0) {
        int var2 = -55 % ((-arg0 - 11) / 58);
        field4432++;
        if (class272.field4317) {
            class272.method1963();
        }
        if (class80.field1065 != null) {
            class250.method1774(class156.field2451, class80.field1065, 0);
            class80.field1065 = null;
        }
        if (class142.field2214 != null) {
            class142.field2214.field479 = false;
        }
        class142.field2214 = null;
        if (class147.field2352 != null) {
            class147.field2352.method1527(63);
            class147.field2352 = null;
        }
        class180.method1244(-1, class328.field5287);
        class190.method1300((byte) -18, class328.field5287);
        if (class171.field2599 != null) {
            class171.field2599.method455(class328.field5287, -5680);
        }
        class38.method244(false);
        class304.method2144((byte) 15);
        class171.field2599 = null;
        if (class192.field2881 != null) {
            class192.field2881.method1409(500000);
        }
        if (class273.field4330 != null) {
            class273.field4330.method1409(500000);
        }
        class179.field2684.method508(false);
        class79.field1050.method1453(true);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2801)
    private final void method2024(byte arg0) {
        if (arg0 > -11) {
            field4441 = -72;
        }
        field4427++;
        boolean var2 = class179.field2684.method502((byte) -122);
        if (!var2) {
            this.method2025(-3);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2816)
    private final void method2025(int arg0) {
        field4433++;
        if (class179.field2684.field1042 > class120.field1665) {
            class226.field3414 = (class179.field2684.field1042 - 1) * 50 * 5;
            if (class43.field490 == class10.field111) {
                class10.field111 = class345.field5479;
            } else {
                class10.field111 = class43.field490;
            }
            if (class226.field3414 > 3000) {
                class226.field3414 = 3000;
            }
            if (class179.field2684.field1042 >= 2 && class179.field2684.field1041 == 6) {
                this.method2266("js5connect_outofdate", -15309);
                field4443 = 1000;
                return;
            }
            if (class179.field2684.field1042 >= 4 && class179.field2684.field1041 == -1) {
                this.method2266("js5crc", -15309);
                field4443 = 1000;
                return;
            }
            if (class179.field2684.field1042 >= 4 && (field4443 == 0 || field4443 == 5)) {
                if (class179.field2684.field1041 == 7 || class179.field2684.field1041 == 9) {
                    this.method2266("js5connect_full", -15309);
                } else if (class179.field2684.field1041 > 0) {
                    this.method2266("js5connect", -15309);
                } else {
                    this.method2266("js5io", -15309);
                }
                field4443 = 1000;
                return;
            }
        }
        class120.field1665 = class179.field2684.field1042;
        if (class226.field3414 > 0) {
            class226.field3414--;
            return;
        }
        try {
            if (arg0 != -3) {
                method2016((class323) null);
            }
            if (class346.field5492 == 0) {
                class79.field1053 = class156.field2451.method166((byte) 75, class61.field726, class10.field111);
                class346.field5492++;
            }
            if (class346.field5492 == 1) {
                if (class79.field1053.field2419 == 2) {
                    this.method2021((byte) 107, 1000);
                    return;
                }
                if (class79.field1053.field2419 == 1) {
                    class346.field5492++;
                }
            }
            if (class346.field5492 == 2) {
                class63.field764 = new class220((Socket) class79.field1053.field2421, class156.field2451);
                class143 var2 = new class143(5);
                var2.method1055(15, 84);
                var2.method1052(549, false);
                class63.field764.method1532(5, 0, -84, var2.field2260);
                class346.field5492++;
                class312.field4894 = class9.method57(-14133);
            }
            if (class346.field5492 == 3) {
                if (field4443 == 0 || field4443 == 5 || class63.field764.method1531((byte) 122) > 0) {
                    int var3 = class63.field764.method1528(arg0 - 29738);
                    if (var3 != 0) {
                        this.method2021((byte) 117, var3);
                        return;
                    }
                    class346.field5492++;
                } else if (class9.method57(arg0 ^ 0x3736) - class312.field4894 > 30000L) {
                    this.method2021((byte) 123, 1001);
                    return;
                }
            }
            if (class346.field5492 == 4) {
                boolean var4 = field4443 == 5 || field4443 == 10 || field4443 == 28;
                class179.field2684.method504(!var4, class63.field764, false);
                class79.field1053 = null;
                class346.field5492 = 0;
                class63.field764 = null;
            }
        } catch (IOException var6) {
            this.method2021((byte) 86, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2964)
    public static void method2026(int arg0) {
        field4439 = null;
        field4423 = null;
        field4444 = null;
        if (arg0 != 18) {
            method2020(-42);
        }
        field4440 = null;
    }
}
