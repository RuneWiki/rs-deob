import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class75 {

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lke;")
    public static class65 field2007 = class1.method17("Bitte warten Sie)3)3)3", -119);

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2010 = new CRC32();

    @OriginalMember(owner = "client!m", name = "t", descriptor = "[I")
    public static int[] field2017 = new int[500];

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lke;")
    private static class65 field2015 = class1.method17("glow3:", -121);

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field2018 = 0;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
    public static int[] field2014 = new int[1000];

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lke;")
    public static class65 field2012 = field2015;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Lke;")
    public static class65 field2016 = class1.method17("Chat panel redrawn", -111);

    @OriginalMember(owner = "client!m", name = "w", descriptor = "Z")
    public static boolean field2020 = false;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field2019 = 0;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "Lke;")
    private static class65 field2022 = class1.method17("Enter name:", -116);

    @OriginalMember(owner = "client!m", name = "A", descriptor = "[Z")
    public static boolean[] field2024 = new boolean[112];

    @OriginalMember(owner = "client!m", name = "x", descriptor = "Lke;")
    public static class65 field2021 = field2022;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "Lke;")
    public static class65 field2025 = class1.method17("Titelbild geladen)3", -127);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lpa;")
    public static class90 field2013;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 3)
    public static final void method661(byte arg0) {
        if (arg0 != 74) {
            field2013 = null;
        }
        for (class87 var1 = (class87) class13.field262.method421(1); var1 != null; var1 = (class87) class13.field262.method428(arg0 ^ 0x589D)) {
            if (var1.field2340 != null) {
                class12.field245.method866(var1.field2340);
                var1.field2340 = null;
            }
            if (var1.field2337 != null) {
                class12.field245.method866(var1.field2337);
                var1.field2337 = null;
            }
        }
        class13.field262.method420(116);
        field2023++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 35)
    public static void method662(int arg0) {
        field2021 = null;
        field2022 = null;
        field2015 = null;
        field2014 = null;
        field2025 = null;
        field2007 = null;
        field2016 = null;
        field2013 = null;
        field2017 = null;
        field2024 = null;
        field2012 = null;
        field2010 = null;
        if (arg0 < 0) {
            method672(-97, -60, 29);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)V", line = 57)
    public static final void method663(byte arg0, int arg1) {
        field2005++;
        if (class19.field456 == arg1) {
            return;
        }
        if (class19.field456 == 0) {
            class81.method704(5);
        }
        int var2 = 74 / ((arg0 + 89) / 32);
        if (arg1 == 20 || arg1 == 40) {
            class129.field3127 = 0;
            class100.field2595 = 0;
            class101.field2640 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class27.field656 != null) {
            class27.field656.method73(85);
        }
        if (class19.field456 == 25 || class19.field456 == 40) {
            class44.method376((byte) -122);
            class108.method885();
        }
        if (class19.field456 == 25) {
            class111.field2751 = 1;
            class9.field151 = 0;
            class21.field497 = 0;
            class21.field510 = 1;
            class24.field575 = 0;
        }
        if (arg1 == 0 || arg1 == 35) {
            class125.method987((byte) 127);
            class24.method190(10);
            if (class22.field535 == null) {
                class22.field535 = class87.method776(765, 503, class10.field210, 96);
            }
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class22.field535 = null;
            class125.method987((byte) 127);
            class23.method176(19135, class23.field569, class10.field210, class100.field2604);
        }
        if (arg1 == 25 || arg1 == 30 || arg1 == 40) {
            class22.field535 = null;
            class24.method190(10);
            class78.method691(class10.field210, (byte) -122, class23.field569);
        }
        class5.field90 = true;
        class19.field456 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([II)V", line = 140)
    public static final synchronized void method664(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class114.field2871 != null) {
            class114.field2871.method213(arg0, 0, var3);
        }
        class24.method197(var3, (byte) 42);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V", line = 164)
    public static final void method665(byte arg0) {
        if (arg0 <= 118) {
            method661((byte) 58);
        }
        field2009++;
        while (true) {
            label289: do {
                while (class117.method952(127)) {
                    if (class93.field2472 != -1 && class93.field2472 == class53.field1345) {
                        if (class128.field3102 == 85 && class100.field2599.method528(62) > 0) {
                            class100.field2599 = class100.field2599.method555(0, class100.field2599.method528(98) - 1, (byte) -78);
                        }
                        continue label289;
                    }
                    if (class10.field218) {
                        if (class128.field3102 == 85 && class100.field2615.method528(99) > 0) {
                            class100.field2615 = class100.field2615.method555(0, class100.field2615.method528(104) - 1, (byte) -78);
                            class39.field996 = true;
                        }
                        if (class110.method900(127, class66.field1755) && class100.field2615.method528(73) < 80) {
                            class100.field2615 = class100.field2615.method535(class66.field1755, true);
                            class39.field996 = true;
                        }
                        if (class128.field3102 == 84) {
                            class10.field218 = false;
                            class39.field996 = true;
                            if (class56.field1455 == 1) {
                                long var10 = class100.field2615.method530((byte) -88);
                                class87.method777(true, var10);
                            }
                            if (class56.field1455 == 2 && class87.field2317 > 0) {
                                long var12 = class100.field2615.method530((byte) 49);
                                class80.method701(var12, 0);
                            }
                            if (class56.field1455 == 3 && class100.field2615.method528(102) > 0) {
                                class56.field1453.method642(100, false);
                                class7.field129++;
                                class56.field1453.method305(false, 0);
                                int var14 = class56.field1453.field998;
                                class56.field1453.method323(class121.field2972, 14);
                                class104.method853(0, class100.field2615, class56.field1453);
                                class56.field1453.method319(class56.field1453.field998 - var14, -1332453464);
                                if (class114.field2865 == 2) {
                                    class114.field2865 = 1;
                                    class32.field832++;
                                    class60.field1611 = true;
                                    class56.field1453.method642(164, false);
                                    class56.field1453.method305(false, class6.field108);
                                    class56.field1453.method305(false, class114.field2865);
                                    class56.field1453.method305(false, class93.field2442);
                                }
                            }
                            if (class56.field1455 == 4 && class51.field1311 < 100) {
                                long var15 = class100.field2615.method530((byte) 24);
                                method670((byte) -118, var15);
                            }
                            if (class56.field1455 == 5 && class51.field1311 > 0) {
                                long var17 = class100.field2615.method530((byte) 100);
                                class74.method658(var17, false);
                            }
                        }
                    } else if (class116.field2916 == 1) {
                        if (class128.field3102 == 85 && class100.field2593.method528(87) > 0) {
                            class100.field2593 = class100.field2593.method555(0, class100.field2593.method528(103) - 1, (byte) -78);
                            class39.field996 = true;
                        }
                        if (class92.method799(-18266, class66.field1755) && class100.field2593.method528(70) < 10) {
                            class100.field2593 = class100.field2593.method535(class66.field1755, true);
                            class39.field996 = true;
                        }
                        if (class128.field3102 == 84) {
                            if (class100.field2593.method528(87) > 0) {
                                class113.field2817++;
                                int var1 = 0;
                                if (class100.field2593.method549(0)) {
                                    var1 = class100.field2593.method551(5401);
                                }
                                class56.field1453.method642(157, false);
                                class56.field1453.method351(var1, -124);
                            }
                            class116.field2916 = 0;
                            class39.field996 = true;
                        }
                    } else if (class116.field2916 == 2) {
                        if (class128.field3102 == 85 && class100.field2593.method528(100) > 0) {
                            class100.field2593 = class100.field2593.method555(0, class100.field2593.method528(72) - 1, (byte) -78);
                            class39.field996 = true;
                        }
                        if ((class78.method690(-123, class66.field1755) || class66.field1755 == 32) && class100.field2593.method528(91) < 12) {
                            class100.field2593 = class100.field2593.method535(class66.field1755, true);
                            class39.field996 = true;
                        }
                        if (class128.field3102 == 84) {
                            if (class100.field2593.method528(111) > 0) {
                                class56.field1453.method642(66, false);
                                class77.field2047++;
                                class56.field1453.method323(class100.field2593.method530((byte) 106), -102);
                            }
                            class39.field996 = true;
                            class116.field2916 = 0;
                        }
                    } else if (class116.field2916 == 3) {
                        if (class128.field3102 == 85 && class100.field2593.method528(66) > 0) {
                            class100.field2593 = class100.field2593.method555(0, class100.field2593.method528(94) - 1, (byte) -78);
                            class39.field996 = true;
                        }
                        if (class110.method900(127, class66.field1755) && class100.field2593.method528(93) < 40) {
                            class100.field2593 = class100.field2593.method535(class66.field1755, true);
                            class39.field996 = true;
                        }
                    } else if (class117.field2939 == -1 && class10.field213 == -1) {
                        if (class128.field3102 == 85 && class100.field2606.method528(119) > 0) {
                            class100.field2606 = class100.field2606.method555(0, class100.field2606.method528(75) - 1, (byte) -78);
                            class39.field996 = true;
                        }
                        if (class110.method900(127, class66.field1755) && class100.field2606.method528(83) < 80) {
                            class100.field2606 = class100.field2606.method535(class66.field1755, true);
                            class39.field996 = true;
                        }
                        if (class128.field3102 == 84 && class100.field2606.method528(98) > 0) {
                            if (class89.field2374 == 2) {
                                if (class100.field2606.method564((byte) -124, class129.field3113)) {
                                    class123.method978((byte) 118);
                                }
                                if (class100.field2606.method564((byte) -101, class123.field2997)) {
                                    class12.field253 = true;
                                }
                                if (class100.field2606.method564((byte) -127, class13.field292)) {
                                    class12.field253 = false;
                                }
                                if (class100.field2606.method564((byte) -108, class51.field1296)) {
                                    for (int var2 = 0; var2 < 4; var2++) {
                                        for (int var3 = 1; var3 < 103; var3++) {
                                            for (int var4 = 1; var4 < 103; var4++) {
                                                class5.field99[var2].field2174[var3][var4] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class100.field2606.method564((byte) -103, class78.field2071) && class44.field1168 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class100.field2606.method564((byte) 122, class6.field128)) {
                                    class6.field121 = true;
                                }
                            }
                            if (class100.field2606.method533(class83.field2202, false)) {
                                class56.field1453.method642(207, false);
                                class56.field1453.method305(false, class100.field2606.method528(99) - 1);
                                class56.field1453.method350((byte) -5, class100.field2606.method539(-27693, 2));
                                class70.field1797++;
                            } else {
                                class56.field1454++;
                                class65 var5 = class100.field2606.method547((byte) -127);
                                byte var6 = 0;
                                if (var5.method533(class65.field1719, false)) {
                                    var6 = 0;
                                    class100.field2606 = class100.field2606.method539(-27693, class65.field1719.method528(81));
                                } else if (var5.method533(class115.field2890, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class115.field2890.method528(66));
                                    var6 = 1;
                                } else if (var5.method533(class32.field844, false)) {
                                    var6 = 2;
                                    class100.field2606 = class100.field2606.method539(-27693, class32.field844.method528(103));
                                } else if (var5.method533(class93.field2455, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class93.field2455.method528(95));
                                    var6 = 3;
                                } else if (var5.method533(class74.field1978, false)) {
                                    var6 = 4;
                                    class100.field2606 = class100.field2606.method539(-27693, class74.field1978.method528(118));
                                } else if (var5.method533(class29.field795, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class29.field795.method528(118));
                                    var6 = 5;
                                } else if (var5.method533(class128.field3106, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class128.field3106.method528(75));
                                    var6 = 6;
                                } else if (var5.method533(class97.field2513, false)) {
                                    var6 = 7;
                                    class100.field2606 = class100.field2606.method539(-27693, class97.field2513.method528(81));
                                } else if (var5.method533(class57.field1533, false)) {
                                    var6 = 8;
                                    class100.field2606 = class100.field2606.method539(-27693, class57.field1533.method528(97));
                                } else if (var5.method533(class43.field1141, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class43.field1141.method528(125));
                                    var6 = 9;
                                } else if (var5.method533(class84.field2212, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class84.field2212.method528(80));
                                    var6 = 10;
                                } else if (var5.method533(field2012, false)) {
                                    var6 = 11;
                                    class100.field2606 = class100.field2606.method539(-27693, field2012.method528(118));
                                }
                                class65 var7 = class100.field2606.method547((byte) -122);
                                byte var8 = 0;
                                if (var7.method533(class31.field824, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class31.field824.method528(104));
                                    var8 = 1;
                                } else if (var7.method533(class65.field1748, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class65.field1748.method528(93));
                                    var8 = 2;
                                } else if (var7.method533(class57.field1537, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class57.field1537.method528(118));
                                    var8 = 3;
                                } else if (var7.method533(class70.field1803, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class70.field1803.method528(88));
                                    var8 = 4;
                                } else if (var7.method533(class73.field1948, false)) {
                                    class100.field2606 = class100.field2606.method539(-27693, class73.field1948.method528(127));
                                    var8 = 5;
                                }
                                class56.field1453.method642(211, false);
                                class56.field1453.method305(false, 0);
                                int var9 = class56.field1453.field998;
                                class56.field1453.method305(false, var6);
                                class56.field1453.method305(false, var8);
                                class104.method853(0, class100.field2606, class56.field1453);
                                class56.field1453.method319(class56.field1453.field998 - var9, -1332453464);
                                if (class6.field108 == 2) {
                                    class32.field832++;
                                    class6.field108 = 3;
                                    class60.field1611 = true;
                                    class56.field1453.method642(164, false);
                                    class56.field1453.method305(false, class6.field108);
                                    class56.field1453.method305(false, class114.field2865);
                                    class56.field1453.method305(false, class93.field2442);
                                }
                            }
                            class100.field2606 = class100.field2591;
                            class39.field996 = true;
                        }
                    }
                }
                return;
            } while (!class78.method690(-123, class66.field1755) && class66.field1755 != 32);
            if (class100.field2599.method528(112) < 12) {
                class100.field2599 = class100.field2599.method535(class66.field1755, true);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 652)
    public static final synchronized void method666(int arg0, int arg1) {
        field1999++;
        if (class114.field2871 != null) {
            class114.field2871.method212(arg1);
        }
        class24.method197(arg1, (byte) 42);
        if (arg0 != 18839) {
            field2022 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)Lt;", line = 679)
    public static final class115 method667(int arg0, int arg1) {
        field2002++;
        class115 var2 = (class115) class72.field1921.method833((byte) -53, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        int var3 = -103 % ((arg1 - 67) / 46);
        byte[] var4 = class62.field1630.method477(1, (byte) 127, arg0);
        class115 var5 = new class115();
        if (var4 != null) {
            var5.method942(arg0, new class39(var4), -8704);
        }
        var5.method944(0);
        class72.field1921.method836((long) arg0, var5, true);
        return var5;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V", line = 705)
    public class75(int arg0) {
        class66.field1776 = arg0;
        class112.field2769 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLub;)V", line = 714)
    public static final synchronized void method668(boolean arg0, class118 arg1) {
        field2001++;
        if (arg0) {
            field2010 = null;
        }
        class114.field2871 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V", line = 727)
    public void method266() {
        field2004++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBII)I", line = 740)
    public static final int method669(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = 256 - arg0;
        int var5 = 16 / ((arg1 + 83) / 32);
        field1998++;
        return ((arg2 & 0xFF00FF) * arg0 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg0 + (arg3 & 0xFF00) * var4 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BJ)V", line = 758)
    public static final void method670(byte arg0, long arg1) {
        field2000++;
        if (arg1 == 0L) {
            return;
        }
        if (class51.field1311 >= 100) {
            class101.method841(class44.field1171, 0, class100.field2591, 10751);
            return;
        }
        class65 var3 = class26.method216(16972, arg1).method560(-46);
        for (int var4 = 0; var4 < class51.field1311; var4++) {
            if (class35.field885[var4] == arg1) {
                class101.method841(class21.method172(-51, new class65[] { var3, class117.field2944 }), 0, class100.field2591, 10751);
                return;
            }
        }
        int var5 = 0;
        if (arg0 != -118) {
            return;
        }
        while (class87.field2317 > var5) {
            if (class4.field82[var5] == arg1) {
                class101.method841(class21.method172(-41, new class65[] { class4.field71, var3, class43.field1127 }), 0, class100.field2591, 10751);
                return;
            }
            var5++;
        }
        if (var3.method564((byte) -103, class32.field833.field2866)) {
            return;
        }
        class81.field2156++;
        class35.field885[class51.field1311++] = arg1;
        class116.field2910 = true;
        class56.field1453.method642(29, false);
        class56.field1453.method323(arg1, -108);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(J)V", line = 819)
    public void method384(long arg0) {
        field2011++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V", line = 843)
    public static final void method671(boolean arg0) {
        field2006++;
        if (class125.field3040 < 2 && client.field382 == 0 && class101.field2635 == 0) {
            return;
        }
        class65 var1;
        if (client.field382 == 1 && class125.field3040 < 2) {
            var1 = class21.method172(-59, new class65[] { class88.field2351, class128.field3092, class101.field2634, class6.field113 });
        } else if (class101.field2635 == 1 && class125.field3040 < 2) {
            var1 = class21.method172(-72, new class65[] { class28.field749, class128.field3092, class51.field1286, class6.field113 });
        } else {
            var1 = class29.field783[class125.field3040 - 1];
        }
        if (class125.field3040 > 2) {
            var1 = class21.method172(-36, new class65[] { var1, class24.field589, class39.method320(class125.field3040 - 2, (byte) -36), class1.field37 });
        }
        class27.field660.method114(var1, 4, 15, 16777215, arg0, class76.field2028 / 1000);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I", line = 868)
    public static final int method672(int arg0, int arg1, int arg2) {
        field2008++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = -45 % ((-arg2 - 54) / 51);
        int var4 = (arg0 & 0x7F) * arg1 / 128;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg0 & 0xFF80) + var4;
    }
}
