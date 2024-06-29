import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class350 {

    @OriginalMember(owner = "client!client", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1837 = "Created gameworld";

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lie;")
    public static class330 field1848;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrn;Z)V", line = 4)
    private static final void method1020(class18 arg0, boolean arg1) {
        field1850++;
        class286.field4442 = arg0.method186(false, "p11_full");
        class281.field4352 = arg0.method186(false, "p12_full");
        class264.field4097 = arg0.method186(false, "b12_full");
        class337.field5181 = arg0.method186(false, "hitmarks");
        class44.field704 = arg0.method186(false, "hitbar_default");
        class36.field546 = arg0.method186(arg1, "headicons_pk");
        class227.field3536 = arg0.method186(false, "headicons_prayer");
        class148.field2411 = arg0.method186(arg1, "hint_headicons");
        class264.field4100 = arg0.method186(arg1, "hint_mapmarkers");
        class288.field4473 = arg0.method186(false, "mapflag");
        class59.field915 = arg0.method186(arg1, "cross");
        class162.field2574 = arg0.method186(arg1, "mapdots");
        class53.field806 = arg0.method186(false, "scrollbar");
        class362.field5739 = arg0.method186(false, "name_icons");
        class215.field3368 = arg0.method186(arg1, "floorshadows");
        class209.field3213 = arg0.method186(arg1, "compass");
        class29.field466 = arg0.method186(false, "hint_mapedge");
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 28)
    private final void method1021(int arg0) {
        class58.field910 = 0;
        field1847++;
        while (class23.method238((byte) -21) && class58.field910 < 128) {
            class166.field2644[class58.field910] = class328.field5043;
            class362.field5742[class58.field910] = class209.field3221;
            class58.field910++;
        }
        class247.field3840++;
        if (class164.field2604 != -1) {
            class31.method334(class164.field2604, 0, (byte) -127, 0, class362.field5740, class126.field2113, 0, 0);
        }
        class327.field5030++;
        if (class240.field3737) {
            int var2 = 2359807;
            label200: for (int var3 = 0; var3 < 32768; var3++) {
                class244 var4 = class110.field1683[var3];
                if (var4 != null) {
                    byte var5 = var4.field3802.field2159;
                    if ((var5 & 0x2) > 0 && var4.field1321 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1300[0] = (var4.field1359 >> 7) + var6;
                            var4.field1290[0] = (var4.field1286 >> 7) + var7;
                            var4.field1375[0] = 1;
                            class57.field905[class119.field1826].method2105(var4.field1286 >> 7, false, 0, var4.method808(101), 1, false, var4.field1359 >> 7, var4.method808(arg0 + 16));
                            if (var4.field1300[0] >= 0 && var4.field1300[0] <= 104 - var4.method808(103) && var4.field1290[0] >= 0 && var4.field1290[0] <= 104 - var4.method808(arg0 ^ 0x1A) && class57.field905[class119.field1826].method2092(var4.field1286 >> 7, var4.field1359 >> 7, var4.field1290[0], false, var4.field1300[0])) {
                                if (var4.method808(99) > 1) {
                                    for (int var8 = var4.field1300[0]; var8 < var4.field1300[0] + var4.method808(-22); var8++) {
                                        for (int var9 = var4.field1290[0]; var9 < (var4.field1290[0] + var4.method808(86)); var9++) {
                                            if ((class57.field905[class119.field1826].field4520[var8][var9] & var2) != 0) {
                                                continue label200;
                                            }
                                        }
                                    }
                                }
                                var4.field1321 = 1;
                            }
                        }
                    }
                    class356.method2503(var4, (byte) 115);
                    class85.method768(0, var4);
                    class262.method1924(var4, (byte) 71);
                    class57.field905[class119.field1826].method2091(var4.field1359 >> 7, var4.method808(-16), 0, false, var4.field1286 >> 7, var4.method808(127), false);
                }
            }
        }
        if (!class240.field3737 && class165.field2629 == 0) {
            class212.method1572(1530158186);
        } else if (class290.field4509 == 0 && class129.field2139 == 0) {
            if (class314.field4858 == 2) {
                class350.method2466((byte) 67);
            } else {
                class303.method2185(arg0 + 214);
            }
            if ((class151.field2465 >> 7) < 14 || class151.field2465 >> 7 >= 90 || class10.field143 >> 7 < 14 || class10.field143 >> 7 >= 90) {
                class109.method947(8);
            }
        }
        while (true) {
            class112 var10;
            class342 var17;
            class342 var18;
            do {
                var10 = (class112) class276.field4272.method2242((byte) -110);
                if (var10 == null) {
                    while (true) {
                        class112 var11;
                        class342 var15;
                        class342 var16;
                        do {
                            var11 = (class112) class126.field2106.method2242((byte) 76);
                            if (var11 == null) {
                                while (true) {
                                    class112 var12;
                                    class342 var13;
                                    class342 var14;
                                    do {
                                        var12 = (class112) class197.field3073.method2242((byte) 10);
                                        if (var12 == null) {
                                            if (class256.field3937 != null) {
                                                class76.method699(-3);
                                            }
                                            if (class74.field1097 != null && class74.field1097.field1447 == 1) {
                                                if (class74.field1097.field1446 != null) {
                                                    class33.method343(class58.field912, arg0 ^ 0xFFFFFF91, class62.field954);
                                                }
                                                class74.field1097 = null;
                                                class62.field954 = false;
                                                class58.field912 = null;
                                            }
                                            if (arg0 != -111) {
                                                method1038((class342) null);
                                            }
                                            if ((class360.field5718 % 1500) == 0) {
                                                class23.method239(2);
                                            }
                                            return;
                                        }
                                        var13 = var12.field1706;
                                        if (var13.field5380 < 0) {
                                            break;
                                        }
                                        var14 = class355.method2497(0, var13.field5296);
                                    } while (var14 == null || var14.field5312 == null || var14.field5312.length <= var13.field5380 || var14.field5312[var13.field5380] != var13);
                                    class160.method1288((byte) -45, var12);
                                }
                            }
                            var15 = var11.field1706;
                            if (var15.field5380 < 0) {
                                break;
                            }
                            var16 = class355.method2497(arg0 + 111, var15.field5296);
                        } while (var16 == null || var16.field5312 == null || var15.field5380 >= var16.field5312.length || var16.field5312[var15.field5380] != var15);
                        class160.method1288((byte) -45, var11);
                    }
                }
                var17 = var10.field1706;
                if (var17.field5380 < 0) {
                    break;
                }
                var18 = class355.method2497(0, var17.field5296);
            } while (var18 == null || var18.field5312 == null || var17.field5380 >= var18.field5312.length || var18.field5312[var17.field5380] != var17);
            class160.method1288((byte) -45, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrg;)Lve;", line = 245)
    public static final class227 method1022(class342 arg0) {
        class227 var1 = (class227) class149.field2435.method370((byte) -120, ((long) arg0.field5433 << 32) + (long) arg0.field5380);
        return var1 == null ? arg0.field5386 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 251)
    public static final void method1023(byte arg0, String arg1, Throwable arg2) {
        field1843++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class266.method1962((byte) -73, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class243.method1834(var3, (byte) -55);
            String var4 = class64.method633("%3a", var3, ":", (byte) -127);
            String var5 = class64.method633("%40", var4, "@", (byte) -126);
            String var6 = class64.method633("%26", var5, "&", (byte) -126);
            String var7 = class64.method633("%23", var6, "#", (byte) -127);
            if (class71.field1063.field4975 == null) {
                return;
            }
            if (arg0 >= -92) {
                method1037((class342[]) null, -26, -27, -9, 28, 8, 19, 38);
            }
            class95 var8 = class71.field1063.method2282((byte) 99, new URL(class71.field1063.field4975.getCodeBase(), "clienterror.ws?c=" + class144.field2359 + "&u=" + class38.field575 + "&v1=" + class323.field4966 + "&v2=" + class323.field4969 + "&e=" + var7));
            while (var8.field1447 == 0) {
                class188.method1443(10, 1L);
            }
            if (var8.field1447 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field1446;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 303)
    private final void method1024(int arg0) {
        field1851++;
        boolean var2 = class160.field2553.method1720(false);
        if (!var2) {
            this.method1026(false);
        }
        if (arg0 != -27637) {
            field1837 = (String) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)J", line = 318)
    public static final long method1025(int arg0, String arg1) {
        long var2 = 0L;
        field1854++;
        int var4 = arg1.length();
        if (arg0 != 768) {
            method1022((class342) null);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            var2 *= 37L;
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 364)
    private final void method1026(boolean arg0) {
        field1838++;
        if (class160.field2553.field3582 > class48.field752) {
            if (class301.field4681 == class207.field3188) {
                class301.field4681 = class66.field1011;
            } else {
                class301.field4681 = class207.field3188;
            }
            class300.field4663 = (class160.field2553.field3582 - 1) * 5 * 50;
            if (class300.field4663 > 3000) {
                class300.field4663 = 3000;
            }
            if (class160.field2553.field3582 >= 2 && class160.field2553.field3580 == 6) {
                this.method2460("js5connect_outofdate", -6835);
                class295.field4578 = 1000;
                return;
            }
            if (class160.field2553.field3582 >= 4 && class160.field2553.field3580 == -1) {
                this.method2460("js5crc", -6835);
                class295.field4578 = 1000;
                return;
            }
            if (class160.field2553.field3582 >= 4 && (class295.field4578 == 0 || class295.field4578 == 5)) {
                if (class160.field2553.field3580 == 7 || class160.field2553.field3580 == 9) {
                    this.method2460("js5connect_full", -6835);
                } else if (class160.field2553.field3580 <= 0) {
                    this.method2460("js5io", -6835);
                } else {
                    this.method2460("js5connect", -6835);
                }
                class295.field4578 = 1000;
                return;
            }
        }
        class48.field752 = class160.field2553.field3582;
        if (class300.field4663 > 0) {
            class300.field4663--;
            return;
        }
        try {
            if (class328.field5041 == 0) {
                class72.field1086 = class340.field5234.method2288(class166.field2643, class301.field4681, 25);
                class328.field5041++;
            }
            if (arg0) {
                this.method1036(106);
            }
            if (class328.field5041 == 1) {
                if (class72.field1086.field1447 == 2) {
                    this.method1027(1000, true);
                    return;
                }
                if (class72.field1086.field1447 == 1) {
                    class328.field5041++;
                }
            }
            if (class328.field5041 == 2) {
                class146.field2391 = new class344((Socket) class72.field1086.field1446, class340.field5234);
                class25 var2 = new class25(5);
                var2.method273(0, 15);
                var2.method310(115, 554);
                class146.field2391.method2426(0, -28332, var2.field448, 5);
                class328.field5041++;
                class61.field938 = class156.method1273((byte) -97);
            }
            if (class328.field5041 == 3) {
                if (class295.field4578 == 0 || class295.field4578 == 5 || class146.field2391.method2424((byte) 21) > 0) {
                    int var3 = class146.field2391.method2423(false);
                    if (var3 != 0) {
                        this.method1027(var3, !arg0);
                        return;
                    }
                    class328.field5041++;
                } else if (class156.method1273((byte) -119) - class61.field938 > 30000L) {
                    this.method1027(1001, !arg0);
                    return;
                }
            }
            if (class328.field5041 == 4) {
                boolean var4 = class295.field4578 == 5 || class295.field4578 == 10 || class295.field4578 == 28;
                class160.field2553.method1715(class146.field2391, 122, !var4);
                class146.field2391 = null;
                class328.field5041 = 0;
                class72.field1086 = null;
            }
        } catch (IOException var6) {
            this.method1027(1002, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V", line = 506)
    private final void method1027(int arg0, boolean arg1) {
        class160.field2553.field3580 = arg0;
        class72.field1086 = null;
        class160.field2553.field3582++;
        class328.field5041 = 0;
        field1841++;
        if (arg1) {
            class146.field2391 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 522)
    public static final void method1028() {
        for (int var0 = -1; var0 < class66.field995 + class6.field80; var0++) {
            class91 var1;
            long var2;
            if (var0 < 0) {
                var1 = class173.field2746;
                var2 = 8791798054912L;
            } else if (var0 < class66.field995) {
                int var4 = class345.field5495[var0];
                var1 = class177.field2795[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class126.field2114[var0 - class66.field995];
                class244 var6 = class110.field1683[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field3802.field2205) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field1387 < 0) {
                var1.field1291 = false;
            } else {
                var1.field1306 = -1;
                int var7 = var1.method808(126);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field1359 & 0x7F) != 0 || (var1.field1286 & 0x7F) != 0) {
                        var1.field1291 = false;
                        continue;
                    }
                } else if ((var1.field1359 & 0x7F) != 64 || (var1.field1286 & 0x7F) != 64) {
                    var1.field1291 = false;
                    continue;
                }
                int var10002;
                if (var7 == 1) {
                    int var8 = var1.field1359 >> 7;
                    int var9 = var1.field1286 >> 7;
                    if (var8 < 0 || var8 >= 104 || var9 < 0 || var9 >= 104) {
                        var1.field1291 = true;
                        continue;
                    }
                    if (class244.field3809[var8][var9] != var1.field1387) {
                        var1.field1291 = true;
                        continue;
                    }
                    if (class206.field3171[var8][var9] > 1) {
                        var10002 = class206.field3171[var8][var9]--;
                        var1.field1291 = true;
                        continue;
                    }
                } else {
                    int var10 = var1.field1359 - var7 * 64 >> 7;
                    int var11 = var1.field1286 - var7 * 64 >> 7;
                    int var12 = var7 + var10;
                    int var13 = var7 + var11;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    if (!class188.method1439(var1.field1387, var11, var10, var13, 9462, var12)) {
                        for (int var14 = var10; var14 < var12; var14++) {
                            for (int var15 = var11; var15 < var13; var15++) {
                                if (class244.field3809[var14][var15] == var1.field1387) {
                                    var10002 = class206.field3171[var14][var15]--;
                                }
                            }
                        }
                        var1.field1291 = true;
                        continue;
                    }
                }
                if (var1 instanceof class171 && var1.field1322 != null && class360.field5718 >= var1.field1370 && class360.field5718 < var1.field1388) {
                    ((class171) var1).field2705 = false;
                    var1.field1291 = false;
                    var1.field1325 = class193.method1469(var1.field1286, var1.field1359, (byte) -47, class119.field1826);
                    class319.method2251(class119.field1826, var1.field1359, var1.field1286, var1.field1325, var1, var1.field1320, var2, var1.field1313, var1.field1365, var1.field1318, var1.field1311);
                } else {
                    var1.field1291 = false;
                    var1.field1325 = class193.method1469(var1.field1286, var1.field1359, (byte) -47, class119.field1826);
                    class276.method2028(class119.field1826, var1.field1359, var1.field1286, var1.field1325, (var7 - 1) * 64 + 60, var1, var1.field1320, var2, var1.field1383);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 678)
    public static final void method1029() {
        class178.field2810 = 0;
        for (int var0 = 0; var0 < class6.field80; var0++) {
            class244 var1 = class110.field1683[class126.field2114[var0]];
            if (var1.field1291 && var1.method812(120) != -1) {
                int var2 = var1.field1359 - (var1.method808(97) - 1) * 64;
                int var3 = var1.field1286 - (var1.method808(-2) - 1) * 64;
                class297 var4 = class249.method1864(class119.field1826, var2 >> 7, var3 >> 7);
                if (var4 != null) {
                    long var5 = var4.field4611;
                    int var7 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
                    class91 var8;
                    if ((var5 >>> 29 & 0x3L) == 0L) {
                        var8 = class177.field2795[var7];
                    } else {
                        var8 = class110.field1683[var7];
                        var7 += 2048;
                    }
                    if (var8.field1306 == -1) {
                        class277.field4280[class178.field2810] = var7;
                        class146.field2392[class178.field2810++] = var7;
                        var8.field1306 = 0;
                    }
                    class277.field4280[class178.field2810] = var7;
                    class146.field2392[class178.field2810++] = class126.field2114[var0] + 2048;
                }
            }
        }
        class157.method1274(class277.field4280, (byte) 68, class178.field2810 - 1, 0, class146.field2392);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 730)
    public static final void method1030(byte arg0) {
        field1855++;
        class9.field129.method656(0);
        if (arg0 >= -66) {
            method1022((class342) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 742)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class252.method1875("argument count", -30184);
            }
            class264.field4106 = Integer.parseInt(arg0[0]);
            class353.field5636 = 2;
            if (arg0[1].equals("live")) {
                class232.field3624 = 0;
            } else if (arg0[1].equals("rc")) {
                class232.field3624 = 1;
            } else if (arg0[1].equals("wip")) {
                class232.field3624 = 2;
            } else {
                class252.method1875("modewhat", -30184);
            }
            class148.field2428 = false;
            class339.field5211 = class233.method1742(25680, arg0[2]);
            if (class339.field5211 == -1) {
                if (arg0[2].equals("english")) {
                    class339.field5211 = 0;
                } else if (arg0[2].equals("german")) {
                    class339.field5211 = 1;
                } else {
                    class252.method1875("language", -30184);
                }
            }
            class314.method2222(-97, class339.field5211);
            class89.field1266 = false;
            class23.field354 = false;
            if (arg0[3].equals("game0")) {
                class165.field2629 = 0;
            } else if (arg0[3].equals("game1")) {
                class165.field2629 = 1;
            } else {
                class252.method1875("game", -30184);
            }
            class350.field5549 = 0;
            class181.field2833 = false;
            class181.field2853 = "";
            class99.field1487 = 0;
            client var1 = new client();
            class110.field1674 = var1;
            var1.method2459(-73, 1024, 554, class232.field3624 + 32, class165.field2629 == 1 ? "mechscape" : "runescape", 768, false, 29);
            class67.field1028.setLocation(40, 40);
        } catch (Exception var3) {
            method1023((byte) -119, (String) null, var3);
        }
        field1853++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 813)
    public static final void method1031() {
        for (int var0 = -1; var0 < class66.field995 + class6.field80; var0++) {
            class91 var1;
            if (var0 < 0) {
                var1 = class173.field2746;
            } else if (var0 < class66.field995) {
                var1 = class177.field2795[class345.field5495[var0]];
            } else {
                var1 = class110.field1683[class126.field2114[var0 - class66.field995]];
            }
            if (var1.field1387 >= 0) {
                int var2 = var1.method808(122);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field1359 & 0x7F) != 0 || (var1.field1286 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field1359 & 0x7F) != 64 || (var1.field1286 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field1359 >> 7;
                    int var4 = var1.field1286 >> 7;
                    if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104 && var1.field1387 >= class244.field3809[var3][var4]) {
                        if (var1.field1387 > class244.field3809[var3][var4]) {
                            class244.field3809[var3][var4] = var1.field1387;
                            class206.field3171[var3][var4] = 1;
                        } else {
                            var10002 = class206.field3171[var3][var4]++;
                        }
                    }
                } else {
                    int var5 = var1.field1359 - var2 * 64 >> 7;
                    int var6 = var1.field1286 - var2 * 64 >> 7;
                    int var7 = var5 + var1.method808(87);
                    int var8 = var6 + var1.method808(-65);
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    if (var7 > 104) {
                        var7 = 104;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var8 > 104) {
                        var8 = 104;
                    }
                    for (int var9 = var5; var9 < var7; var9++) {
                        for (int var10 = var6; var10 < var8; var10++) {
                            if (var1.field1387 > class244.field3809[var9][var10]) {
                                class244.field3809[var9][var10] = var1.field1387;
                                class206.field3171[var9][var10] = 1;
                            } else if (class244.field3809[var9][var10] == var1.field1387) {
                                var10002 = class206.field3171[var9][var10]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 919)
    public final void method1032(int arg0) {
        method1040(15418);
        class273.method2005();
        class122.method1060(-113);
        field1845++;
        class121.method1052((byte) -89);
        class351.method2470();
        class57.method569((byte) 14);
        class59.method581(arg0 - 6);
        class350.method2455(106);
        class240.method1804();
        class211.method1561(104);
        class68.method665((byte) -104);
        class25.method271(arg0 + 95);
        class344.method2422((byte) 32);
        class228.method1717(127);
        class279.method2040(true);
        class114.method980(-74);
        class148.method1229(arg0 ^ 0x6);
        class18.method194(119);
        class139.method1166(-1);
        class153.method1263((byte) -93);
        class66.method657(-116);
        class244.method1843(9);
        class217.method1629(false);
        class342.method2406(0);
        class356.method2502(12);
        class171.method1349(true);
        class317.method2234(-104);
        class37.method368(false);
        class292.method2115(-128);
        class38.method382(32);
        class266.method1961((byte) 111);
        class13.method146(arg0 - 8);
        class252.method1880((byte) -48);
        class262.method1928((byte) 111);
        class207.method1541(arg0 ^ 0xB32CB129);
        class93.method830((byte) -73);
        class91.method820(0);
        class329.method2325((byte) -128);
        class36.method367(10018);
        class227.method1698(123);
        class332.method2341((byte) 117);
        class172.method1358(-1378791256);
        class43.method447((byte) -100);
        class104.method910(28793);
        class335.method2357((byte) -98);
        class162.method1300((byte) -111);
        class349.method2451((byte) -117);
        class363.method2550(256);
        class359.method2521((byte) -84);
        class82.method742((byte) -80);
        class146.method1217(-102);
        class170.method1343((byte) -118);
        class233.method1750(false);
        class261.method1923(false);
        class287.method2078((byte) -63);
        class31.method338(-124);
        class9.method96(arg0 ^ 0x5E);
        class32.method341(false);
        class357.method2513();
        class71.method677(-20144);
        class157.method1276(-120);
        class99.method869(arg0 ^ 0x7F);
        class256.method1894(arg0 + 13);
        class208.method1544(-1500664592);
        class212.method1574(-39);
        class201.method1504(arg0 ^ 0xFFFF975B);
        class103.method890();
        class40.method396();
        class56.method567();
        class263.method1930(arg0 - 97);
        class124.method1070();
        class190.method1452(32);
        class223.method1674(arg0 - 4);
        class313.method2215(-109);
        class214.method1607(arg0 - 1879044103);
        class28.method323();
        class8.method94();
        class106.method917(true);
        class67.method658(74);
        class331.method2338((byte) 127);
        class145.method1196();
        class101.method881(-2749);
        class284.method2065(arg0 - 21663);
        class97.method849();
        class347.method2443(-1);
        class235.method1753((byte) 10);
        class274.method2018(-1);
        class22.method235(true);
        class330.method2335();
        class314.method2219((byte) -9);
        class181.method1402(arg0 ^ 0xFFFFFFFD);
        class115.method991(0);
        class286.method2071(true);
        class87.method787(98);
        class60.method597();
        class355.method2496(false);
        class193.method1472(75);
        class140.method1170(-107);
        class320.method2257(-72);
        class177.method1380((byte) -23);
        class192.method1462(arg0 ^ 0xFFFFFF8E);
        class143.method1185(15955);
        class203.method1515((byte) -29);
        class300.method2162(0);
        class149.method1236((byte) -72);
        class268.method1969(arg0 - 7);
        class102.method885(arg0 + 121);
        class109.method948((byte) 95);
        class281.method2051((byte) 27);
        class222.method1663(true);
        class75.method696(false);
        class229.method1726();
        class205.method1529(128);
        class81.method738(arg0 ^ 0x6);
        class119.method1013((byte) 121);
        class10.method101(true);
        class116.method995(-892);
        class111.method958(arg0 ^ 0xFFFF8CC0);
        class219.method1635();
        class46.method458(8);
        class173.method1362((byte) -126);
        class186.method1431((byte) -127);
        class321.method2269(-3);
        class178.method1392(arg0 ^ 0x4);
        class224.method1681((byte) -34);
        class55.method532(false);
        class232.method1736(5);
        class326.method2303((byte) 106);
        class24.method246();
        class85.method769(121);
        class107.method925();
        class166.method1323(arg0 - 53);
        class340.method2388(1);
        class159.method1285(6817);
        class278.method2035(7796);
        class316.method2227(-82);
        class161.method1293(arg0 - 7);
        class78.method718(false);
        class333.method2348();
        class110.method957((byte) -126);
        class96.method842();
        class147.method1224(arg0 + 114);
        class248.method1858(37);
        class210.method1557((byte) -116);
        class204.method1526(12);
        class112.method964((byte) 113);
        class72.method686(-103);
        class64.method636(false);
        class270.method1981((byte) -102);
        class125.method1086();
        class297.method2138((byte) -121);
        class100.method876(8);
        class202.method1512(24);
        class280.method2044(arg0 - 3);
        class44.method451(0);
        class348.method2448((byte) 115);
        class117.method1001();
        class293.method2116((byte) -127);
        class358.method2517(-64);
        class19.method219(97);
        class189.method1450();
        class299.method2159();
        class127.method1108();
        class69.method668();
        class195.method1481(-121);
        class29.method329(false);
        class131.method1129(true);
        class17.method172();
        class213.method1584();
        class183.method1414();
        class165.method1319(-99);
        class155.method1272(true);
        class295.method2132(true);
        class315.method2225(true);
        class138.method1155(29);
        class133.method1136((byte) 73);
        class160.method1289(0);
        class353.method2490((byte) -117);
        class341.method2397();
        class303.method2186((byte) -102);
        class62.method622(68);
        class230.method1729(arg0 + 100);
        class337.method2365(-116);
        class3.method29((byte) -38);
        class206.method1531((byte) -117);
        class4.method35(true);
        class311.method2209(-5);
        class89.method799((byte) 27);
        class108.method946(false);
        class345.method2436(arg0 ^ 0x7F);
        class83.method747((byte) -83);
        class164.method1306(7484);
        class241.method1821();
        class338.method2377((byte) -22);
        class234.method1752(19482);
        class168.method1337(0);
        class113.method979(true);
        class42.method429(50);
        class134.method1137(-71);
        class346.method2439((byte) 22);
        class151.method1254(arg0 - 18);
        class23.method241(false);
        class196.method1484();
        class6.method46(arg0 + 86);
        class174.method1364(1);
        class308.method2201(63);
        class184.method1421(-23032);
        class61.method619((byte) 126);
        class163.method1303(arg0 ^ 0xFFFFFFF9);
        class312.method2214();
        class16.method169();
        class126.method1092((byte) -97);
        class123.method1062((byte) 120);
        class309.method2202(false);
        class187.method1438(684);
        class265.method1955();
        class275.method2021();
        class283.method2062((byte) -75);
        class105.method914((byte) -50);
        class152.method1258();
        class306.method2197(-28214);
        class302.method2178();
        class216.method1614();
        class243.method1836(-3);
        class49.method479(-27631);
        class120.method1048(false);
        class86.method773((byte) 15);
        class276.method2027(13050);
        class260.method1913(arg0 ^ 0x60);
        class158.method1278(arg0 ^ 0x60);
        class185.method1426(-7);
        class191.method1456(2);
        class129.method1115((byte) 122);
        class339.method2384((byte) 57);
        class20.method225((byte) -53);
        class239.method1770(0);
        class253.method1883(arg0 - 122);
        class88.method792();
        class34.method353((byte) -22);
        class90.method805(110);
        class175.method1369(28213);
        class245.method1846((byte) 4);
        class53.method518(false);
        class58.method578((byte) 107);
        class310.method2205((byte) -114);
        class296.method2134(56);
        class128.method1114((byte) -58);
        class48.method468(arg0 ^ 0xFFFFFFDE);
        class194.method1479((byte) 29);
        class197.method1498((byte) 124);
        class188.method1449(arg0 ^ 0x68);
        class199.method1501(arg0 - 110);
        class271.method1985(17188);
        class209.method1548((byte) 41);
        class94.method837(-22390);
        class360.method2527(52);
        class167.method1333(21528);
        class318.method2247((byte) -97);
        class327.method2318(false);
        class334.method2352(2);
        class282.method2057(-125);
        class249.method1860((byte) -115);
        class14.method160(arg0 - 13549);
        class277.method2030(25787);
        class63.method629((byte) -53);
        class135.method1141(-128);
        class301.method2172((byte) -118);
        class79.method725(arg0 - 4);
        class238.method1767(2217);
        class74.method690(9129);
        class259.method1906((byte) 83);
        class51.method484(arg0 - 28011);
        class41.method425(true);
        class343.method2416(256);
        class247.method1856(false);
        class45.method454((byte) 112);
        class328.method2322((byte) -61);
        class221.method1660(false);
        class150.method1246((byte) 118);
        class231.method1734(true);
        class324.method2296(-1);
        class236.method1763((byte) -92);
        class176.method1374(arg0 ^ arg0);
        class76.method700(0);
        class50.method481((byte) -90);
        class305.method2192((byte) -74);
        class255.method1888(true);
        class264.method1952(true);
        class15.method161((byte) 118);
        class298.method2141((byte) 22);
        class294.method2126(-1313);
        class362.method2547(118);
        class352.method2486(16777215);
        class226.method1689((byte) -55);
        if (class350.field5587) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 1221)
    public static final void method1033() {
        for (int var0 = -1; var0 < class66.field995 + class6.field80; var0++) {
            class91 var1;
            long var2;
            if (var0 < 0) {
                var1 = class173.field2746;
                var2 = 8791798054912L;
            } else if (var0 < class66.field995) {
                int var4 = class345.field5495[var0];
                var1 = class177.field2795[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class126.field2114[var0 - class66.field995];
                class244 var6 = class110.field1683[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field3802.field2205) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field1387 >= 0) {
                int var7 = var1.method808(102);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field1359 & 0x7F) == 0 && (var1.field1286 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var1.field1359 & 0x7F) == 64 && (var1.field1286 & 0x7F) == 64) {
                    continue;
                }
                if (var1 instanceof class171 && var1.field1322 != null && class360.field5718 >= var1.field1370 && class360.field5718 < var1.field1388) {
                    ((class171) var1).field2705 = false;
                    var1.field1325 = class193.method1469(var1.field1286, var1.field1359, (byte) -47, class119.field1826);
                    class319.method2251(class119.field1826, var1.field1359, var1.field1286, var1.field1325, var1, var1.field1320, var2, var1.field1313, var1.field1365, var1.field1318, var1.field1311);
                } else {
                    var1.field1325 = class193.method1469(var1.field1286, var1.field1359, (byte) -47, class119.field1826);
                    class276.method2028(class119.field1826, var1.field1359, var1.field1286, var1.field1325, (var7 - 1) * 64 + 60, var1, var1.field1320, var2, var1.field1383);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 1289)
    public static final void method1034() {
        boolean var0 = class86.field1241 && class66.field995 > 200 || class66.field995 > 50;
        for (int var1 = 0; var1 < class66.field995; var1++) {
            class171 var2 = class177.field2795[class345.field5495[var1]];
            var2.field1328 = false;
            if (var2.method811(256)) {
                var2.field2705 = var2.field1350 == var2.method813((byte) -125).field1663 ? var0 : false;
                int var3 = 0;
                if (!var2.field1291) {
                    var3++;
                }
                if (var2.field1348 > class360.field5718) {
                    var3 += 2;
                }
                int var4 = var3 + (5 - var2.method808(-108) << 2);
                if (class31.field489 == 0) {
                    var4 += 32;
                } else {
                    var4 += 128;
                }
                var4 += 256;
                var2.field1387 = var4 + 1;
            } else {
                var2.field1387 = -1;
            }
        }
        for (int var5 = 0; var5 < class6.field80; var5++) {
            class244 var6 = class110.field1683[class126.field2114[var5]];
            var6.field1328 = false;
            if (var6.method811(256) && var6.field3802.method1119(false)) {
                int var7 = 0;
                if (!var6.field1291) {
                    var7++;
                }
                if (var6.field1348 > class360.field5718) {
                    var7 += 2;
                }
                int var8 = var7 + (5 - var6.method808(79) << 2);
                if (class31.field489 == 0) {
                    if (var6.field3802.field2196) {
                        var8 += 64;
                    } else {
                        var8 += 128;
                    }
                } else if (class31.field489 == 1) {
                    if (var6.field3802.field2196) {
                        var8 += 32;
                    } else {
                        var8 += 64;
                    }
                }
                if (var6.field3802.field2180) {
                    var8 += 512;
                } else if (!var6.field3802.field2177) {
                    var8 += 256;
                }
                var6.field1387 = var8 + 1;
            } else {
                var6.field1387 = -1;
            }
        }
        for (int var9 = 0; var9 < class301.field4677.length; var9++) {
            class68 var10 = class301.field4677[var9];
            if (var10 != null) {
                if (var10.field1036 == 1) {
                    class244 var11 = class110.field1683[var10.field1035];
                    if (var11 != null && var11.field1387 != -1) {
                        var11.field1387 += 1024;
                    }
                } else if (var10.field1036 == 10) {
                    class171 var12 = class177.field2795[var10.field1035];
                    if (var12 != null && var12.field1387 != -1) {
                        var12.field1387 += 1024;
                    }
                }
            }
        }
        class173.field2746.field1387 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1413)
    public final void method1035(int arg0) {
        field1846++;
        if (class240.field3737) {
            class240.method1802();
        }
        if (class212.field3321 != null) {
            class353.method2489(class212.field3321, class340.field5234, arg0 + 12787);
            class212.field3321 = null;
        }
        if (class105.field1583 != null) {
            class105.field1583.field4753 = false;
        }
        class105.field1583 = null;
        if (class188.field2950 != null) {
            class188.field2950.method2429(false);
            class188.field2950 = null;
        }
        class329.method2324(class64.field974, -31);
        class204.method1524(-83, class64.field974);
        if (class166.field2634 != null) {
            class166.field2634.method318(class64.field974, 37);
        }
        class310.method2206((byte) 120);
        class345.method2437(true);
        class166.field2634 = null;
        if (class94.field1434 != null) {
            class94.field1434.method1879(true);
        }
        if (class68.field1048 != null) {
            class68.field1048.method1879(true);
        }
        if (arg0 != -32769) {
            field1848 = (class330) null;
        }
        class160.field2553.method1719(20);
        class113.field1745.method2043((byte) 110);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 1460)
    public final void method1036(int arg0) {
        field1840++;
        if (class295.field4578 == 1000) {
            return;
        }
        class360.field5718++;
        if (arg0 > -121) {
            field1848 = (class330) null;
        }
        if (class360.field5718 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class76.field1119 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class311.field4821.setSeed((long) class76.field1119);
        }
        this.method1024(-27637);
        if (class191.field3010 != null) {
            class191.field3010.method987(5883);
        }
        class149.method1245(true);
        class102.method886(true);
        class23.method236((byte) -118);
        class356.method2500(false);
        if (class240.field3737) {
            class28.method321();
        }
        if (class166.field2634 != null) {
            int var3 = class166.field2634.method317((byte) 76);
            class283.field4382 = var3;
        }
        if (class295.field4578 == 0) {
            this.method1041(-91);
            class63.method627(-33);
        } else if (class295.field4578 == 5) {
            this.method1041(-91);
            class63.method627(-33);
        } else if (class295.field4578 == 25 || class295.field4578 == 28) {
            class258.method1899(66);
        }
        if (class295.field4578 == 10) {
            this.method1021(-111);
            class335.method2356(90);
            class304.method2191(-19234);
            class101.method883(2);
        } else if (class295.field4578 == 30) {
            class9.method97(1);
        } else if (class295.field4578 == 40) {
            class101.method883(2);
            if (class248.field3849 != -3) {
                if (class248.field3849 == 15) {
                    class355.method2493(0);
                } else if (class248.field3849 != 2) {
                    class197.method1493(92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lrg;IIIIIII)V", line = 1552)
    public static final void method1037(class342[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class342 var9 = arg0[var8];
            if (var9 != null && var9.field5296 == arg1 && (!var9.field5340 || var9.field5279 == 0 || var9.field5375 || method1022(var9).field3544 != 0 || class348.field5523 == var9 || var9.field5427 == 1338) && (!var9.field5340 || !method1043(var9))) {
                int var10 = var9.field5350 + arg6;
                int var11 = var9.field5300 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field5279 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field5374 + var10;
                    int var17 = var9.field5339 + var11;
                    if (var9.field5279 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class256.field3937 == var9) {
                    class215.field3361 = true;
                    class204.field3158 = var10;
                    class261.field4002 = var11;
                }
                if (!var9.field5340 || var12 < var14 && var13 < var15) {
                    if (var9.field5279 == 0) {
                        if (!var9.field5340 && method1043(var9) && class53.field804 != var9) {
                            continue;
                        }
                        if (var9.field5329 && class268.field4137 >= var12 && class78.field1129 >= var13 && class268.field4137 < var14 && class78.field1129 < var15) {
                            for (class112 var18 = (class112) class197.field3073.method2244((byte) -128); var18 != null; var18 = (class112) class197.field3073.method2241(-1)) {
                                if (var18.field1720) {
                                    var18.method1357(947647010);
                                    var18.field1706.field5367 = false;
                                }
                            }
                            if (class346.field5505 == 0) {
                                class256.field3937 = null;
                                class348.field5523 = null;
                            }
                            class133.field2228 = 0;
                            class327.field5038 = false;
                        }
                    }
                    if (var9.field5340) {
                        boolean var19;
                        if (class268.field4137 >= var12 && class78.field1129 >= var13 && class268.field4137 < var14 && class78.field1129 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class210.field3242 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class86.field1230 == 1 && class305.field4745 >= var12 && class254.field3916 >= var13 && class305.field4745 < var14 && class254.field3916 < var15) {
                            var21 = true;
                        }
                        if (var9.field5393 != null) {
                            for (int var22 = 0; var22 < var9.field5393.length; var22++) {
                                if (class116.field1774[var9.field5393[var22]]) {
                                    if (var9.field5414 == null || class360.field5718 >= var9.field5414[var22]) {
                                        byte var23 = var9.field5359[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class116.field1774[86] && !class116.field1774[82] && !class116.field1774[81]) && ((var23 & 0x2) == 0 || class116.field1774[86]) && ((var23 & 0x1) == 0 || class116.field1774[82]) && ((var23 & 0x4) == 0 || class116.field1774[81])) {
                                            class221.method1659(-1, 12832, var9.field5433, var22 + 1, "");
                                            int var24 = var9.field5420[var22];
                                            if (var9.field5414 == null) {
                                                var9.field5414 = new int[var9.field5393.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field5414[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field5414[var22] = class360.field5718 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field5414 != null) {
                                    var9.field5414[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class33.method346(var9, class254.field3916 - var11, -3, class305.field4745 - var10);
                        }
                        if (class256.field3937 != null && class256.field3937 != var9 && var19 && method1022(var9).method1697((byte) -127)) {
                            class297.field4619 = var9;
                        }
                        if (class348.field5523 == var9) {
                            class62.field955 = true;
                            class67.field1030 = var10;
                            class81.field1185 = var11;
                        }
                        if (var9.field5375 || var9.field5427 != 0) {
                            if (var19 && class283.field4382 != 0 && var9.field5436 != null) {
                                class112 var25 = new class112();
                                var25.field1720 = true;
                                var25.field1706 = var9;
                                var25.field1708 = class283.field4382;
                                var25.field1711 = var9.field5436;
                                class197.field3073.method2245(var25, 44);
                            }
                            if (class256.field3937 != null || class212.field3283 != null || class6.field89 || var9.field5427 != 1400 && class133.field2228 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field5427 != 0) {
                                if (var9.field5427 == 1337) {
                                    class85.field1220 = var9;
                                    continue;
                                }
                                if (var9.field5427 == 1338) {
                                    if (var21) {
                                        class283.field4381 = class305.field4745 - var10;
                                        class50.field782 = class254.field3916 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field5427 == 1400) {
                                    class122.field1950 = var9;
                                    if (var19) {
                                        class327.field5038 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class305.field4745 - var10 - var9.field5374 / 2) * 2.0D / (double) class351.field5597);
                                        int var27 = (int) ((double) (class254.field3916 - var11 - var9.field5339 / 2) * 2.0D / (double) class351.field5597);
                                        int var28 = class335.field5120 + var26;
                                        int var29 = class348.field5530 + var27;
                                        int var30 = class351.field5592 + var28;
                                        int var31 = class351.field5593 + class351.field5598 - var29 - 1;
                                        class57 var32 = class98.method866(false);
                                        if (var32 == null) {
                                            continue;
                                        }
                                        int[] var33 = new int[3];
                                        var32.method571(var33, var30, 2203, var31);
                                        if (var33 != null) {
                                            if (class116.field1774[82] && class270.field4168 > 0) {
                                                class271.method1988(var33[0], 63, var33[2], var33[1]);
                                                class194.method1477(227670764);
                                                continue;
                                            }
                                            class249.field3853++;
                                            class99.field1491.method1628((byte) -118, 111);
                                            class99.field1491.method310(118, var33[0] << 28 | var33[1] << 14 | var33[2]);
                                        }
                                        class133.field2228 = 1;
                                        class363.field5751 = false;
                                        class66.field994 = class268.field4137;
                                        class210.field3243 = class78.field1129;
                                        continue;
                                    }
                                    if (var20 && class133.field2228 > 0) {
                                        if (class133.field2228 == 1 && (class66.field994 != class268.field4137 || class78.field1129 != class210.field3243)) {
                                            class311.field4820 = class335.field5120;
                                            class178.field2812 = class348.field5530;
                                            class133.field2228 = 2;
                                        }
                                        if (class133.field2228 == 2) {
                                            class363.field5751 = true;
                                            class163.method1304((int) ((double) (class66.field994 - class268.field4137) * 2.0D / (double) class351.field5595) + class311.field4820, (byte) -63);
                                            class90.method806((int) ((double) (class210.field3243 - class78.field1129) * 2.0D / (double) class351.field5595) + class178.field2812, -1);
                                        }
                                        continue;
                                    }
                                    if (class133.field2228 > 0 && !class363.field5751) {
                                        if ((class120.field1865 == 1 || class350.method2457(false, class66.field1006 - 1)) && class66.field1006 > 2) {
                                            class10.method103(59);
                                        } else if (class66.field1006 > 0) {
                                            class57.method570(29311);
                                        }
                                    }
                                    class133.field2228 = 0;
                                    continue;
                                }
                                if (var9.field5427 == 1401) {
                                    if (var20) {
                                        class298.method2142(class268.field4137 - var10, var9.field5374, class78.field1129 - var11, -128, var9.field5339);
                                    }
                                    continue;
                                }
                                if (var9.field5427 == 1402) {
                                    if (!class240.field3737) {
                                        class339.method2380(var9, 127);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field5283 && var21) {
                                var9.field5283 = true;
                                if (var9.field5309 != null) {
                                    class112 var34 = new class112();
                                    var34.field1720 = true;
                                    var34.field1706 = var9;
                                    var34.field1709 = class305.field4745 - var10;
                                    var34.field1708 = class254.field3916 - var11;
                                    var34.field1711 = var9.field5309;
                                    class197.field3073.method2245(var34, 24);
                                }
                            }
                            if (var9.field5283 && var20 && var9.field5358 != null) {
                                class112 var35 = new class112();
                                var35.field1720 = true;
                                var35.field1706 = var9;
                                var35.field1709 = class268.field4137 - var10;
                                var35.field1708 = class78.field1129 - var11;
                                var35.field1711 = var9.field5358;
                                class197.field3073.method2245(var35, 98);
                            }
                            if (var9.field5283 && !var20) {
                                var9.field5283 = false;
                                if (var9.field5402 != null) {
                                    class112 var36 = new class112();
                                    var36.field1720 = true;
                                    var36.field1706 = var9;
                                    var36.field1709 = class268.field4137 - var10;
                                    var36.field1708 = class78.field1129 - var11;
                                    var36.field1711 = var9.field5402;
                                    class126.field2106.method2245(var36, 113);
                                }
                            }
                            if (var20 && var9.field5292 != null) {
                                class112 var37 = new class112();
                                var37.field1720 = true;
                                var37.field1706 = var9;
                                var37.field1709 = class268.field4137 - var10;
                                var37.field1708 = class78.field1129 - var11;
                                var37.field1711 = var9.field5292;
                                class197.field3073.method2245(var37, 72);
                            }
                            if (!var9.field5367 && var19) {
                                var9.field5367 = true;
                                if (var9.field5430 != null) {
                                    class112 var38 = new class112();
                                    var38.field1720 = true;
                                    var38.field1706 = var9;
                                    var38.field1709 = class268.field4137 - var10;
                                    var38.field1708 = class78.field1129 - var11;
                                    var38.field1711 = var9.field5430;
                                    class197.field3073.method2245(var38, 68);
                                }
                            }
                            if (var9.field5367 && var19 && var9.field5407 != null) {
                                class112 var39 = new class112();
                                var39.field1720 = true;
                                var39.field1706 = var9;
                                var39.field1709 = class268.field4137 - var10;
                                var39.field1708 = class78.field1129 - var11;
                                var39.field1711 = var9.field5407;
                                class197.field3073.method2245(var39, 79);
                            }
                            if (var9.field5367 && !var19) {
                                var9.field5367 = false;
                                if (var9.field5349 != null) {
                                    class112 var40 = new class112();
                                    var40.field1720 = true;
                                    var40.field1706 = var9;
                                    var40.field1709 = class268.field4137 - var10;
                                    var40.field1708 = class78.field1129 - var11;
                                    var40.field1711 = var9.field5349;
                                    class126.field2106.method2245(var40, 100);
                                }
                            }
                            if (var9.field5262 != null) {
                                class112 var41 = new class112();
                                var41.field1706 = var9;
                                var41.field1711 = var9.field5262;
                                class276.field4272.method2245(var41, 97);
                            }
                            if (var9.field5416 != null && class224.field3505 > var9.field5317) {
                                if (var9.field5291 == null || class224.field3505 - var9.field5317 > 32) {
                                    class112 var46 = new class112();
                                    var46.field1706 = var9;
                                    var46.field1711 = var9.field5416;
                                    class197.field3073.method2245(var46, 126);
                                } else {
                                    label603: for (int var42 = var9.field5317; var42 < class224.field3505; var42++) {
                                        int var43 = class335.field5126[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field5291.length; var44++) {
                                            if (var9.field5291[var44] == var43) {
                                                class112 var45 = new class112();
                                                var45.field1706 = var9;
                                                var45.field1711 = var9.field5416;
                                                class197.field3073.method2245(var45, 84);
                                                break label603;
                                            }
                                        }
                                    }
                                }
                                var9.field5317 = class224.field3505;
                            }
                            if (var9.field5318 != null && class10.field144 > var9.field5382) {
                                if (var9.field5423 == null || class10.field144 - var9.field5382 > 32) {
                                    class112 var51 = new class112();
                                    var51.field1706 = var9;
                                    var51.field1711 = var9.field5318;
                                    class197.field3073.method2245(var51, 53);
                                } else {
                                    label579: for (int var47 = var9.field5382; var47 < class10.field144; var47++) {
                                        int var48 = class99.field1495[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field5423.length; var49++) {
                                            if (var9.field5423[var49] == var48) {
                                                class112 var50 = new class112();
                                                var50.field1706 = var9;
                                                var50.field1711 = var9.field5318;
                                                class197.field3073.method2245(var50, 30);
                                                break label579;
                                            }
                                        }
                                    }
                                }
                                var9.field5382 = class10.field144;
                            }
                            if (var9.field5316 != null && class238.field3695 > var9.field5354) {
                                if (var9.field5419 == null || class238.field3695 - var9.field5354 > 32) {
                                    class112 var56 = new class112();
                                    var56.field1706 = var9;
                                    var56.field1711 = var9.field5316;
                                    class197.field3073.method2245(var56, 37);
                                } else {
                                    label555: for (int var52 = var9.field5354; var52 < class238.field3695; var52++) {
                                        int var53 = class104.field1574[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field5419.length; var54++) {
                                            if (var9.field5419[var54] == var53) {
                                                class112 var55 = new class112();
                                                var55.field1706 = var9;
                                                var55.field1711 = var9.field5316;
                                                class197.field3073.method2245(var55, 119);
                                                break label555;
                                            }
                                        }
                                    }
                                }
                                var9.field5354 = class238.field3695;
                            }
                            if (var9.field5390 != null && class33.field504 > var9.field5429) {
                                if (var9.field5426 == null || class33.field504 - var9.field5429 > 32) {
                                    class112 var61 = new class112();
                                    var61.field1706 = var9;
                                    var61.field1711 = var9.field5390;
                                    class197.field3073.method2245(var61, 51);
                                } else {
                                    label531: for (int var57 = var9.field5429; var57 < class33.field504; var57++) {
                                        int var58 = class353.field5640[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field5426.length; var59++) {
                                            if (var9.field5426[var59] == var58) {
                                                class112 var60 = new class112();
                                                var60.field1706 = var9;
                                                var60.field1711 = var9.field5390;
                                                class197.field3073.method2245(var60, 25);
                                                break label531;
                                            }
                                        }
                                    }
                                }
                                var9.field5429 = class33.field504;
                            }
                            if (var9.field5268 != null && class90.field1279 > var9.field5323) {
                                if (var9.field5373 == null || class90.field1279 - var9.field5323 > 32) {
                                    class112 var66 = new class112();
                                    var66.field1706 = var9;
                                    var66.field1711 = var9.field5268;
                                    class197.field3073.method2245(var66, 119);
                                } else {
                                    label507: for (int var62 = var9.field5323; var62 < class90.field1279; var62++) {
                                        int var63 = class329.field5071[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field5373.length; var64++) {
                                            if (var9.field5373[var64] == var63) {
                                                class112 var65 = new class112();
                                                var65.field1706 = var9;
                                                var65.field1711 = var9.field5268;
                                                class197.field3073.method2245(var65, 33);
                                                break label507;
                                            }
                                        }
                                    }
                                }
                                var9.field5323 = class90.field1279;
                            }
                            if (class188.field2955 > var9.field5383 && var9.field5345 != null) {
                                class112 var67 = new class112();
                                var67.field1706 = var9;
                                var67.field1711 = var9.field5345;
                                class197.field3073.method2245(var67, 108);
                            }
                            if (class66.field1013 > var9.field5383 && var9.field5330 != null) {
                                class112 var68 = new class112();
                                var68.field1706 = var9;
                                var68.field1711 = var9.field5330;
                                class197.field3073.method2245(var68, 101);
                            }
                            if (class287.field4456 > var9.field5383 && var9.field5284 != null) {
                                class112 var69 = new class112();
                                var69.field1706 = var9;
                                var69.field1711 = var9.field5284;
                                class197.field3073.method2245(var69, 95);
                            }
                            if (class129.field2144 > var9.field5383 && var9.field5321 != null) {
                                class112 var70 = new class112();
                                var70.field1706 = var9;
                                var70.field1711 = var9.field5321;
                                class197.field3073.method2245(var70, 110);
                            }
                            if (class305.field4738 > var9.field5383 && var9.field5365 != null) {
                                class112 var71 = new class112();
                                var71.field1706 = var9;
                                var71.field1711 = var9.field5365;
                                class197.field3073.method2245(var71, 47);
                            }
                            var9.field5383 = class327.field5030;
                            if (var9.field5408 != null) {
                                for (int var72 = 0; var72 < class58.field910; var72++) {
                                    class112 var73 = new class112();
                                    var73.field1706 = var9;
                                    var73.field1705 = class166.field2644[var72];
                                    var73.field1717 = class362.field5742[var72];
                                    var73.field1711 = var9.field5408;
                                    class197.field3073.method2245(var73, 113);
                                }
                            }
                            if (class349.field5545 && var9.field5432 != null) {
                                class112 var74 = new class112();
                                var74.field1706 = var9;
                                var74.field1711 = var9.field5432;
                                class197.field3073.method2245(var74, 111);
                            }
                        }
                    }
                    if (!var9.field5340 && class256.field3937 == null && class212.field3283 == null && !class6.field89) {
                        if ((var9.field5331 >= 0 || var9.field5343 != 0) && class268.field4137 >= var12 && class78.field1129 >= var13 && class268.field4137 < var14 && class78.field1129 < var15) {
                            if (var9.field5331 >= 0) {
                                class53.field804 = arg0[var9.field5331];
                            } else {
                                class53.field804 = var9;
                            }
                        }
                        if (var9.field5279 == 8 && class268.field4137 >= var12 && class78.field1129 >= var13 && class268.field4137 < var14 && class78.field1129 < var15) {
                            class355.field5654 = var9;
                        }
                        if (var9.field5264 > var9.field5339) {
                            class25.method312(var9.field5264, var9.field5374 + var10, var9, (byte) -84, class78.field1129, var9.field5339, var11, class268.field4137);
                        }
                    }
                    if (var9.field5279 == 0) {
                        method1037(arg0, var9.field5433, var12, var13, var14, var15, var10 - var9.field5351, var11 - var9.field5334);
                        if (var9.field5312 != null) {
                            method1037(var9.field5312, var9.field5433, var12, var13, var14, var15, var10 - var9.field5351, var11 - var9.field5334);
                        }
                        class36 var75 = (class36) class135.field2251.method370((byte) -120, (long) var9.field5433);
                        if (var75 != null) {
                            class31.method334(var75.field540, var10, (byte) -34, var11, var15, var14, var13, var12);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lrg;)Lrg;", line = 2349)
    public static final class342 method1038(class342 arg0) {
        int var1 = method1022(arg0).method1696(2089534706);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class355.method2497(0, arg0.field5296);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 2375)
    private final void method1039(byte[] arg0, int arg1) {
        field1842++;
        if (arg1 != 0) {
            field1837 = (String) null;
        }
        class25 var3 = new class25(arg0);
        while (true) {
            int var4;
            do {
                while (true) {
                    var4 = var3.method281(arg1 + 113);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 != 1) {
                        break;
                    }
                    int[] var7 = class305.field4741 = new int[6];
                    var7[0] = var3.method314((byte) 97);
                    var7[1] = var3.method314((byte) 79);
                    var7[2] = var3.method314((byte) 77);
                    var7[3] = var3.method314((byte) 31);
                    var7[4] = var3.method314((byte) 97);
                    var7[5] = var3.method314((byte) 108);
                }
            } while (var4 != 4);
            int var5 = var3.method281(arg1 + 105);
            class153.field2477 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class153.field2477[var6] = var3.method314((byte) 37);
                if (class153.field2477[var6] == 65535) {
                    class153.field2477[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2439)
    public static void method1040(int arg0) {
        if (arg0 != 15418) {
            field1837 = (String) null;
        }
        field1837 = null;
        field1848 = null;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 2453)
    private final void method1041(int arg0) {
        field1844++;
        if (!class4.field56) {
            label240: while (true) {
                do {
                    if (!class23.method238((byte) -21)) {
                        break label240;
                    }
                } while (class209.field3221 != 's' && class209.field3221 != 'S');
                class4.field56 = true;
            }
        }
        if (class71.field1067 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class156.method1273((byte) -70);
            if (class310.field4792 == 0L) {
                class310.field4792 = var28;
            }
            if (var27 > 16384 && (var28 - class310.field4792) < 5000L) {
                if ((var28 - class318.field4907) > 1000L) {
                    System.gc();
                    class318.field4907 = var28;
                }
                class195.field3069 = class153.field2489;
                class338.field5196 = 5;
            } else {
                class338.field5196 = 5;
                class195.field3069 = class94.field1440;
                class71.field1067 = 10;
            }
        } else if (class71.field1067 == 10) {
            for (int var2 = 0; var2 < 4; var2++) {
                class57.field905[var2] = new class290(104, 104);
            }
            class195.field3069 = field1837;
            class338.field5196 = 10;
            class71.field1067 = 30;
        } else if (class71.field1067 == 30) {
            if (class191.field3010 == null) {
                class191.field3010 = new class114(class160.field2553, class113.field1745);
            }
            if (class191.field3010.method986((byte) -39)) {
                class155.field2506 = class114.method982(true, false, 0, true, 1000000);
                class133.field2226 = class114.method982(true, false, 1, true, 1000000);
                class91.field1362 = class114.method982(true, true, 2, false, arg0 + 1000091);
                class41.field659 = class114.method982(true, false, 3, true, 1000000);
                class239.field3701 = class114.method982(true, false, 4, true, 1000000);
                class181.field2856 = class114.method982(true, true, 5, true, 1000000);
                class155.field2504 = class114.method982(false, true, 6, true, 1000000);
                class81.field1188 = class114.method982(true, false, 7, true, 1000000);
                class303.field4725 = class114.method982(true, false, 8, true, arg0 + 1000091);
                class171.field2713 = class114.method982(true, false, 9, true, 1000000);
                class226.field3521 = class114.method982(true, false, 10, true, 1000000);
                class160.field2548 = class114.method982(true, false, 11, true, 1000000);
                class163.field2599 = class114.method982(true, false, 12, true, 1000000);
                class271.field4184 = class114.method982(true, false, 13, true, 1000000);
                class206.field3170 = class114.method982(false, false, 14, true, 1000000);
                class36.field545 = class114.method982(true, false, 15, true, 1000000);
                class64.field986 = class114.method982(true, false, 16, true, 1000000);
                class178.field2816 = class114.method982(true, false, 17, true, 1000000);
                class109.field1661 = class114.method982(true, false, 18, true, arg0 + 1000091);
                class66.field1017 = class114.method982(true, false, 19, true, 1000000);
                class326.field5016 = class114.method982(true, false, 20, true, 1000000);
                class162.field2575 = class114.method982(true, false, 21, true, 1000000);
                class185.field2897 = class114.method982(true, false, 22, true, 1000000);
                class266.field4129 = class114.method982(true, true, 23, true, 1000000);
                class345.field5498 = class114.method982(true, false, 24, true, 1000000);
                class303.field4727 = class114.method982(true, false, 25, true, 1000000);
                class90.field1274 = class114.method982(true, true, 26, true, 1000000);
                class42.field677 = class114.method982(true, false, 27, true, 1000000);
                class178.field2815 = class114.method982(true, true, 28, true, 1000000);
                class338.field5196 = 15;
                class71.field1067 = 40;
                class195.field3069 = class263.field4096;
            } else {
                class338.field5196 = 12;
                class195.field3069 = class45.field716;
            }
        } else if (class71.field1067 == 40) {
            int var24 = 0;
            for (int var25 = 0; var25 < 29; var25++) {
                var24 += class90.field1280[var25].method1231(arg0 + 191) * class13.field193[var25] / 100;
            }
            if (var24 == 100) {
                class195.field3069 = class178.field2807;
                class338.field5196 = 20;
                method1020(class303.field4725, false);
                class74.method694(-12459, class303.field4725);
                class353.method2491(-1, class303.field4725);
                class71.field1067 = 41;
            } else {
                if (var24 != 0) {
                    class195.field3069 = class120.field1876 + var24 + "%";
                }
                class338.field5196 = 20;
            }
        } else if (class71.field1067 == 41) {
            if (class178.field2815.method200((byte) -116)) {
                this.method1039(class178.field2815.method203(1, (byte) 47), 0);
                class338.field5196 = 25;
                class195.field3069 = class162.field2577;
                class71.field1067 = 45;
            } else {
                class195.field3069 = class165.field2628 + class178.field2815.method190((byte) -106) + "%";
                class338.field5196 = 25;
            }
        } else if (class71.field1067 == 45) {
            class195.method1482((byte) -128, 2, class110.field1686, 22050);
            class93.field1409 = new class13();
            class93.field1409.method147(9, (byte) 123, 128);
            class94.field1434 = class98.method868(0, class64.field974, (byte) 20, 22050, class340.field5234);
            class94.field1434.method1876(30555, class93.field1409);
            class223.method1673(class93.field1409, class206.field3170, -31771, class36.field545, class239.field3701);
            class68.field1048 = class98.method868(1, class64.field974, (byte) -101, 2048, class340.field5234);
            class19.field316 = new class11();
            class68.field1048.method1876(30555, class19.field316);
            class234.field3647 = new class262(22050, class294.field4571);
            class144.field2358 = class155.field2504.method186(false, "scape main");
            class71.field1067 = 50;
            class195.field3069 = class350.field5559;
            class338.field5196 = 30;
        } else if (class71.field1067 == 50) {
            int var3 = class159.method1286(class271.field4184, class303.field4725, (byte) -3);
            int var4 = class140.method1172((byte) -61);
            if (var3 < var4) {
                class195.field3069 = class223.field3471 + var3 * 100 / var4 + "%";
                class338.field5196 = 35;
            } else {
                class71.field1067 = 60;
                class195.field3069 = class128.field2123;
                class338.field5196 = 35;
            }
        } else if (class71.field1067 == 60) {
            int var22 = class155.method1271(true, class303.field4725);
            int var23 = class202.method1506(-19215);
            if (var23 > var22) {
                class338.field5196 = 40;
                class195.field3069 = class6.field76 + var22 * 100 / var23 + "%";
            } else {
                class195.field3069 = class277.field4281;
                class338.field5196 = 40;
                class71.field1067 = 65;
            }
        } else if (class71.field1067 == 65) {
            class41.method428(0, class303.field4725, class271.field4184);
            class338.field5196 = 45;
            class195.field3069 = class49.field778;
            class175.method1370(5, (byte) -83);
            class71.field1067 = 70;
        } else if (class71.field1067 == 70) {
            byte var5 = 0;
            class91.field1362.method200((byte) -119);
            int var6 = var5 + class91.field1362.method190((byte) -106);
            class64.field986.method200((byte) -118);
            int var7 = var6 + class64.field986.method190((byte) -106);
            class178.field2816.method200((byte) -116);
            int var8 = var7 + class178.field2816.method190((byte) -106);
            class109.field1661.method200((byte) -126);
            int var9 = var8 + class109.field1661.method190((byte) -106);
            class66.field1017.method200((byte) -126);
            int var10 = var9 + class66.field1017.method190((byte) -106);
            class326.field5016.method200((byte) -116);
            int var11 = var10 + class326.field5016.method190((byte) -106);
            class162.field2575.method200((byte) -123);
            int var12 = var11 + class162.field2575.method190((byte) -106);
            class185.field2897.method200((byte) -121);
            int var13 = var12 + class185.field2897.method190((byte) -106);
            class345.field5498.method200((byte) -116);
            int var14 = var13 + class345.field5498.method190((byte) -106);
            class303.field4727.method200((byte) -116);
            int var15 = var14 + class303.field4727.method190((byte) -106);
            class42.field677.method200((byte) -119);
            int var16 = var15 + class42.field677.method190((byte) -106);
            if (var16 < 1100) {
                class338.field5196 = 50;
                class195.field3069 = class82.field1190 + var16 / 11 + "%";
            } else {
                class33.method349(110, class91.field1362);
                class297.method2140(0, class91.field1362);
                class222.method1668(8, class91.field1362);
                class282.method2054(class81.field1188, false, class91.field1362);
                class91.method817(128, class64.field986, class81.field1188, true);
                class259.method1905(class109.field1661, class81.field1188, true, (byte) 38);
                class146.method1220(class43.field690, class66.field1017, true, -5789, class81.field1188);
                class144.method1188(class91.field1362, -14363);
                class292.method2114(class155.field2506, class133.field2226, 73, class326.field5016);
                class348.method2446(class91.field1362, 73);
                class3.method30(class162.field2575, class81.field1188, arg0 ^ 0xFFFFFFDA);
                class45.method456(arg0 ^ 0xFFFFFFA4, class185.field2897);
                class158.method1280(16, class91.field1362);
                class158.method1279(false, class41.field659, class271.field4184, class303.field4725, class81.field1188);
                class346.method2440(class91.field1362, arg0 - 10);
                class282.method2055(class178.field2816, (byte) -116);
                class42.method432(class345.field5498, -62, class303.field4727, new class10());
                class94.method839(class345.field5498, class303.field4727, -17381);
                class165.method1318(class91.field1362, 54);
                class221.method1655(class91.field1362, 64);
                class112.method966(8, class91.field1362);
                class68.method666(class303.field4725, class91.field1362, (byte) -127);
                class82.method740(class303.field4725, class91.field1362, -10);
                class31.method335(class91.field1362, (byte) -89, class303.field4725);
                class338.field5196 = 50;
                class195.field3069 = class10.field136;
                class345.method2433((byte) 114);
                class71.field1067 = 80;
            }
        } else if (class71.field1067 == 80) {
            int var20 = class223.method1675(class303.field4725, (byte) 78);
            int var21 = class300.method2167(14);
            if (var20 < var21) {
                class338.field5196 = 60;
                class195.field3069 = class284.field4410 + var20 * 100 / var21 + "%";
            } else {
                class249.method1862((byte) 60, class303.field4725);
                class195.field3069 = class217.field3403;
                class338.field5196 = 60;
                class71.field1067 = 90;
            }
        } else if (~class71.field1067 == arg0) {
            if (class90.field1274.method200((byte) -127)) {
                class224 var19 = new class224(class171.field2713, class90.field1274, class303.field4725, 20, !class121.field1878);
                class107.method932(var19);
                if (class139.field2321 == 1) {
                    class107.method929(0.9F);
                }
                if (class139.field2321 == 2) {
                    class107.method929(0.8F);
                }
                if (class139.field2321 == 3) {
                    class107.method929(0.7F);
                }
                if (class139.field2321 == 4) {
                    class107.method929(0.6F);
                }
                class338.field5196 = 70;
                class195.field3069 = class309.field4774;
                class71.field1067 = 100;
            } else {
                class195.field3069 = class255.field3933 + class90.field1274.method190((byte) -106) + "%";
                class338.field5196 = 70;
            }
        } else if (class71.field1067 == 100) {
            if (class331.method2337((byte) -111, class303.field4725)) {
                class71.field1067 = 110;
            }
        } else if (class71.field1067 == 110) {
            class105.field1583 = new class307();
            class340.field5234.method2290((byte) -99, class105.field1583, 10);
            class338.field5196 = 75;
            class195.field3069 = class353.field5635;
            class71.field1067 = 120;
        } else if (class71.field1067 == 120) {
            if (class226.field3521.method206("", 16721, "huffman")) {
                class166 var17 = new class166(class226.field3521.method215("", false, "huffman"));
                class285.method2068(var17, -1);
                class195.field3069 = class194.field3065;
                class338.field5196 = 80;
                class71.field1067 = 130;
            } else {
                class195.field3069 = class115.field1771 + "0%";
                class338.field5196 = 80;
            }
        } else if (class71.field1067 == 130) {
            if (!class41.field659.method200((byte) -126)) {
                class195.field3069 = class206.field3169 + class41.field659.method190((byte) -106) * 3 / 4 + "%";
                class338.field5196 = 85;
            } else if (!class163.field2599.method200((byte) -127)) {
                class195.field3069 = class206.field3169 + (class163.field2599.method190((byte) -106) / 10 + 75) + "%";
                class338.field5196 = 85;
            } else if (!class271.field4184.method200((byte) -123)) {
                class195.field3069 = class206.field3169 + ((class271.field4184.method190((byte) -106) / 20) + 85) + "%";
                class338.field5196 = 85;
            } else if (class266.field4129.method211("details", -97)) {
                class351.method2475(class266.field4129);
                class273.method1994(class42.field677);
                class229.method1727(class81.field1188);
                class195.field3069 = class344.field5477;
                class338.field5196 = 95;
                class71.field1067 = 135;
            } else {
                class195.field3069 = class206.field3169 + (class266.field4129.method209((byte) 113, "details") / 10 + 90) + "%";
                class338.field5196 = 85;
            }
        } else if (class71.field1067 == 135) {
            int var18 = class243.method1835(29619);
            if (var18 == -1) {
                class195.field3069 = class134.field2246;
                class338.field5196 = 95;
            } else if (var18 == 7 || var18 == 9) {
                this.method2460("worldlistfull", -6835);
                class175.method1370(1000, (byte) -83);
            } else if (class339.field5220) {
                class338.field5196 = 96;
                class71.field1067 = 140;
                class195.field3069 = class158.field2529;
            } else {
                this.method2460("worldlistio_" + var18, -6835);
                class175.method1370(1000, (byte) -83);
            }
        } else if (class71.field1067 == 140) {
            class104.field1573 = class41.field659.method186(false, "loginscreen");
            class181.field2856.method217(arg0 ^ 0xFFFFFFA4, false, true);
            class155.field2504.method217(arg0 ^ 0xFFFFFFA4, true, true);
            class303.field4725.method217(1, true, true);
            class271.field4184.method217(1, true, true);
            class226.field3521.method217(arg0 + 92, true, true);
            class41.field659.method217(1, true, true);
            class71.field1067 = 150;
            class338.field5196 = 97;
            class195.field3069 = class93.field1402;
            class49.field775 = true;
        } else if (class71.field1067 == 150) {
            class333.method2349();
            if (class4.field56) {
                class271.field4194 = 0;
                class64.field989 = 0;
                class123.field1968 = 0;
                class74.field1091 = 0;
            }
            class4.field56 = true;
            class235.method1756(false, class340.field5234);
            class207.method1543(-1, 75, false, -1, class123.field1968);
            class71.field1067 = 160;
            class338.field5196 = 100;
            class195.field3069 = class238.field3680;
        } else if (class71.field1067 == 160) {
            class48.method470(true, -1);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2974)
    public final void init() {
        field1852++;
        if (!this.method2458((byte) -101)) {
            return;
        }
        class264.field4106 = Integer.parseInt(this.getParameter("worldid"));
        class353.field5636 = Integer.parseInt(this.getParameter("modewhere"));
        if (class353.field5636 < 0 || class353.field5636 > 1) {
            class353.field5636 = 0;
        }
        class232.field3624 = Integer.parseInt(this.getParameter("modewhat"));
        if (class232.field3624 < 0 || class232.field3624 > 2) {
            class232.field3624 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class148.field2428 = true;
        } else {
            class148.field2428 = false;
        }
        try {
            class339.field5211 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class339.field5211 = 0;
        }
        class314.method2222(-91, class339.field5211);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class89.field1266 = true;
        } else {
            class89.field1266 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class23.field354 = true;
        } else {
            class23.field354 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class165.field2629 = 1;
        } else {
            class165.field2629 = 0;
        }
        try {
            class350.field5549 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class350.field5549 = 0;
        }
        class181.field2853 = this.getParameter("settings");
        if (class181.field2853 == null) {
            class181.field2853 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class99.field1487 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class99.field1487 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class181.field2833 = true;
        } else {
            class181.field2833 = false;
        }
        class110.field1674 = this;
        this.method2456(1554, 503, class232.field3624 + 32, -117, 765);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 3059)
    public final void method1042(int arg0) {
        field1849++;
        if (class295.field4578 == 1000) {
            return;
        }
        long var2 = class194.method1478((byte) 100) / 1000000L - class235.field3659;
        class235.field3659 = class194.method1478((byte) 89) / 1000000L;
        boolean var4 = class19.method220(-13230);
        if (var4 && class212.field3331 && class94.field1434 != null) {
            class94.field1434.method1877(-43);
        }
        if ((class295.field4578 == 30 || class295.field4578 == 10) && (class309.field4776 || class260.field3993 != 0L && class156.method1273((byte) -26) > class260.field3993)) {
            class207.method1543(class134.field2245, 82, class309.field4776, class68.field1047, class113.method969(arg0 + 1));
        }
        if (class212.field3321 == null) {
            Container var5;
            if (class212.field3321 != null) {
                var5 = class212.field3321;
            } else if (class67.field1028 == null) {
                var5 = class340.field5234.field4975;
            } else {
                var5 = class67.field1028;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class67.field1028 == var5) {
                Insets var8 = class67.field1028.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class101.field1528 != var6 || class277.field4283 != var7) {
                if (class323.field4961.startsWith("mac")) {
                    class277.field4283 = var7;
                    class101.field1528 = var6;
                } else {
                    class178.method1391(false);
                }
                class260.field3993 = class156.method1273((byte) -42) + 500L;
            }
        }
        if (class212.field3321 != null && !class64.field985 && (class295.field4578 == 30 || class295.field4578 == 10)) {
            class207.method1543(-1, 34, false, -1, class123.field1968);
        }
        boolean var9 = false;
        if (class208.field3207) {
            var9 = true;
            class208.field3207 = false;
        }
        if (var9) {
            class293.method2120(5447);
        }
        if (class240.field3737) {
            for (int var10 = 0; var10 < 100; var10++) {
                class227.field3540[var10] = true;
            }
        }
        if (class295.field4578 == arg0) {
            class143.method1184(var9, 86, (Color) null, class338.field5196, class195.field3069);
        } else if (class295.field4578 == 5) {
            class188.method1445(class64.field988, (byte) -46, false);
        } else if (class295.field4578 == 10) {
            class140.method1175(arg0 - 63);
        } else if (class295.field4578 == 25 || class295.field4578 == 28) {
            if (class164.field2608 == 1) {
                if (class106.field1600 > class204.field3153) {
                    class204.field3153 = class106.field1600;
                }
                int var12 = (class204.field3153 - class106.field1600) * 50 / class204.field3153;
                class307.method2198(-1, class268.field4134 + "<br>(" + var12 + "%)", false);
            } else if (class164.field2608 == 2) {
                if (class339.field5213 < class148.field2432) {
                    class339.field5213 = class148.field2432;
                }
                int var11 = ((class339.field5213 - class148.field2432) * 50 / class339.field5213) + 50;
                class307.method2198(-1, class268.field4134 + "<br>(" + var11 + "%)", false);
            } else {
                class307.method2198(-1, class268.field4134, false);
            }
        } else if (class295.field4578 == 30) {
            class249.method1863(var2, arg0 - 1);
        } else if (class295.field4578 == 40) {
            class307.method2198(~arg0, class279.field4307 + "<br>" + class313.field4847, false);
        }
        if (class240.field3737 && class295.field4578 != 0) {
            class240.method1787();
            for (int var19 = 0; var19 < class362.field5732; var19++) {
                class349.field5544[var19] = false;
            }
        } else if ((class295.field4578 == 30 || class295.field4578 == 10) && class284.field4398 == 0 && !var9) {
            try {
                Graphics var13 = class64.field974.getGraphics();
                for (int var14 = 0; var14 < class362.field5732; var14++) {
                    if (class349.field5544[var14]) {
                        class42.field665.method976(arg0 ^ 0x8, class212.field3299[var14], class91.field1390[var14], class188.field2958[var14], class236.field3677[var14], var13);
                        class349.field5544[var14] = false;
                    }
                }
            } catch (Exception var21) {
                class64.field974.repaint();
            }
        } else if (class295.field4578 != 0) {
            try {
                Graphics var16 = class64.field974.getGraphics();
                class42.field665.method970(0, 0, (byte) 122, var16);
                for (int var17 = 0; var17 < class362.field5732; var17++) {
                    class349.field5544[var17] = false;
                }
            } catch (Exception var20) {
                class64.field974.repaint();
            }
        }
        if (class49.field775) {
            class192.method1463((byte) -52);
        }
        if (class4.field56 && class295.field4578 == 10 && class164.field2604 != -1) {
            class4.field56 = false;
            class235.method1756(false, class340.field5234);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lrg;)Z", line = 3278)
    public static final boolean method1043(class342 arg0) {
        if (class18.field290) {
            if (method1022(arg0).field3544 != 0) {
                return false;
            }
            if (arg0.field5279 == 0) {
                return false;
            }
        }
        return arg0.field5384;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 3298)
    public final void method1044(int arg0) {
        class178.method1391(false);
        field1839++;
        class113.field1745 = new class279();
        if (arg0 >= -52) {
            field1848 = (class330) null;
        }
        class160.field2553 = new class228();
        if (class232.field3624 != 0) {
            class149.field2448 = new byte[50][];
        }
        class239.method1771(2016, class340.field5234);
        if (class353.field5636 == 0) {
            class23.field361 = this.getCodeBase().getHost();
            class42.field663 = 43594;
            class258.field3948 = 443;
        } else if (class353.field5636 == 1) {
            class23.field361 = this.getCodeBase().getHost();
            class42.field663 = class264.field4106 + 40000;
            class258.field3948 = class264.field4106 + 50000;
        } else if (class353.field5636 == 2) {
            class258.field3948 = class264.field4106 + 50000;
            class23.field361 = "127.0.0.1";
            class42.field663 = class264.field4106 + 40000;
        }
        class147.field2393 = class42.field663;
        if (class165.field2629 == 1) {
            class270.field4162 = class188.field2952;
            class103.field1551 = 16777215;
            class103.field1545 = 0;
            class186.field2910 = class233.field3639;
            class296.field4596 = class187.field2939;
            class208.field3205 = true;
            class212.field3335 = class348.field5534;
        } else {
            class296.field4596 = class167.field2648;
            class270.field4162 = class68.field1049;
            class212.field3335 = class164.field2606;
            class186.field2910 = class175.field2769;
        }
        class166.field2643 = class23.field361;
        class207.field3188 = class42.field663;
        class301.field4681 = class147.field2393;
        class66.field1011 = class258.field3948;
        if (class323.field4971 == 3 && class353.field5636 != 2) {
            class207.field3196 = class264.field4106;
        }
        class3.field28 = class363.field5752 = class339.field5212 = class48.field751 = new short[256];
        class319.method2254((byte) -89);
        class359.method2522(-32769, class64.field974);
        class233.method1749(class64.field974, 8825);
        class166.field2634 = class327.method2316((byte) 75);
        if (class166.field2634 != null) {
            class166.field2634.method316((byte) 24, class64.field974);
        }
        class193.field3041 = class323.field4971;
        try {
            if (class340.field5234.field4973 != null) {
                class167.field2651 = new class139(class340.field5234.field4973, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class309.field4777[var2] = new class139(class340.field5234.field4970[var2], 6000, 0);
                }
                class170.field2684 = new class139(class340.field5234.field4972, 6000, 0);
                class165.field2627 = new class153(255, class167.field2651, class170.field2684, 500000);
                class31.field491 = new class139(class340.field5234.field4960, 24, 0);
                class340.field5234.field4973 = null;
                class340.field5234.field4970 = null;
                class340.field5234.field4972 = null;
                class340.field5234.field4960 = null;
            }
        } catch (IOException var4) {
            class170.field2684 = null;
            class167.field2651 = null;
            class165.field2627 = null;
            class31.field491 = null;
        }
        if (class165.field2629 == 0) {
            class45.field721 = class352.field5627;
        } else if (class165.field2629 == 1) {
            class45.field721 = class31.field483;
        }
        if (class353.field5636 != 0) {
            class116.field1783 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 3424)
    public static final void method1045() {
        for (int var0 = 0; var0 < 104; var0++) {
            int[] var1 = class244.field3809[var0];
            for (int var2 = 0; var2 < 104; var2++) {
                var1[var2] = 0;
            }
        }
    }
}
