import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class67 {

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Led;")
    private static class43 field1346 = class191.method1219("Take", false);

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Led;")
    public static class43 field1350 = field1346;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Led;")
    public static class43 field1342 = class191.method1219("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", false);

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Led;")
    public static class43 field1340 = class191.method1219("Cabbage", false);

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[I")
    public static int[] field1347 = new int[2048];

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "[I")
    public static int[] field1345 = new int[128];

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field1357 = -1;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "J")
    public long field1353;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "La;")
    public static class1 field1348;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lhb;")
    public class67 field1343;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Lhb;")
    public class67 field1356;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[[[B")
    public static byte[][][] field1351;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)V")
    public static final void method416(byte arg0, int arg1, int arg2) {
        field1355++;
        if (class54.method335(-758973232, arg2) && arg0 <= -33) {
            class1.method6(class12.field177[arg2], 0, arg1);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method417(int arg0) {
        field1338++;
        int var2 = -94 / ((arg0 - 61) / 38);
        if (this.field1343 != null) {
            this.field1343.field1356 = this.field1356;
            this.field1356.field1343 = this.field1343;
            this.field1343 = null;
            this.field1356 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Z")
    public final boolean method418(int arg0) {
        field1354++;
        if (this.field1343 == null) {
            return false;
        } else {
            int var2 = 48 / ((-arg0 - 25) / 51);
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method419(boolean arg0) {
        field1351 = null;
        field1345 = null;
        field1346 = null;
        if (arg0) {
            field1357 = -66;
        }
        field1340 = null;
        field1350 = null;
        field1348 = null;
        field1342 = null;
        field1347 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
    public static final void method420(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1352++;
        class168.method1044(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class135.method866();
        class115.field2256++;
        class79.method486(true, 267);
        class81.method501(true, 753130416);
        class79.method486(false, 267);
        class81.method501(false, 753130416);
        class154.method981((byte) -19);
        class161.method1014(4107);
        if (!class117.field2282) {
            int var5 = class142.field2933 + class149.field3026 & 0x7FF;
            int var6 = class88.field1715;
            if (class73.field1433 / 256 > var6) {
                var6 = class73.field1433 / 256;
            }
            if (class108.field2067[4] && class137.field2838[4] + 128 > var6) {
                var6 = class137.field2838[4] + 128;
            }
            class4.method25(var6 * 3 + 600, var6, class102.field1945, 20679, class108.method668(field1348.field2328, field1348.field2347, -127, class93.field1839) - 50, class184.field3628, var5);
        }
        int var7;
        if (class117.field2282) {
            var7 = class137.method890((byte) -1);
        } else {
            var7 = class142.method904(65536);
        }
        int var8 = class185.field3647;
        int var9 = class51.field1034;
        int var10 = class32.field591;
        int var11 = class184.field3617;
        int var12 = class188.field3686;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class108.field2067[var13]) {
                int var16 = (int) ((double) -class23.field432[var13] + (double) (class23.field432[var13] * 2 + 1) * Math.random() + Math.sin((double) class109.field2108[var13] / 100.0D * (double) class156.field3155[var13]) * (double) class137.field2838[var13]);
                if (var13 == 2) {
                    class188.field3686 += var16;
                }
                if (var13 == 3) {
                    class32.field591 = class32.field591 + var16 & 0x7FF;
                }
                if (var13 == 4) {
                    class51.field1034 += var16;
                    if (class51.field1034 < 128) {
                        class51.field1034 = 128;
                    }
                    if (class51.field1034 > 383) {
                        class51.field1034 = 383;
                    }
                }
                if (var13 == 1) {
                    class185.field3647 += var16;
                }
                if (var13 == 0) {
                    class184.field3617 += var16;
                }
            }
        }
        int var14 = class185.field3654;
        if (arg4 > -86) {
            method422(-74);
        }
        int var15 = class105.field1998;
        if (var14 >= arg0 && arg0 + arg2 > var14 && arg1 <= var15 && var15 < arg1 + arg3) {
            class199.field3908 = 0;
            class199.field3926 = true;
            class199.field3907 = class185.field3654 - arg0;
            class199.field3918 = class105.field1998 - arg1;
        } else {
            class199.field3908 = 0;
            class199.field3926 = false;
        }
        class41.method228((byte) -100);
        class168.method1046(arg0, arg1, arg2, arg3, 0);
        class41.method228((byte) -91);
        class137.field2842.method1123(class184.field3617, class185.field3647, class188.field3686, class51.field1034, class32.field591, var7);
        class41.method228((byte) -128);
        class137.field2842.method1143();
        class147.method922(arg3, arg2, 5, arg1, arg0);
        class126.method812((byte) 90, arg0, arg1);
        ((class2) class135.field2802).method17(class65.field1325, (byte) -91);
        class35.method200(40, arg3, arg0, arg2, arg1);
        class185.field3647 = var8;
        class188.field3686 = var12;
        class32.field591 = var10;
        class51.field1034 = var9;
        class184.field3617 = var11;
        if (class153.field3093 && class191.method1218(false, true, false) == 0) {
            class153.field3093 = false;
        }
        if (class153.field3093) {
            class168.method1046(arg0, arg1, arg2, arg3, 0);
            class5.method33(false, class201.field3951, (byte) 127);
        }
        if (!class153.field3093 && !class186.field3665 && arg0 <= var14 && arg0 + arg2 > var14 && var15 >= arg1 && var15 < arg1 + arg3) {
            class37.method208(arg0, var14, arg1, -26849, var15);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB)Led;")
    public static final class43 method421(int arg0, int arg1, byte arg2) {
        field1341++;
        int var3 = arg0 - arg1;
        int var4 = -123 % ((arg2 - 53) / 55);
        if (var3 < -9) {
            return class184.field3619;
        } else if (var3 < -6) {
            return class27.field490;
        } else if (var3 < -3) {
            return class83.field1632;
        } else if (var3 < 0) {
            return class16.field255;
        } else if (var3 > 9) {
            return class172.field3431;
        } else if (var3 > 6) {
            return class110.field2134;
        } else if (var3 > 3) {
            return client.field553;
        } else if (var3 > 0) {
            return class4.field99;
        } else {
            return class18.field306;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static final void method422(int arg0) {
        field1344++;
        try {
            if (class18.field304 == 0) {
                if (class48.field977 != null) {
                    class48.field977.method522(-23002);
                    class48.field977 = null;
                }
                class18.field304 = 1;
                class40.field757 = false;
                class132.field2758 = null;
                class76.field1535 = 0;
            }
            if (class18.field304 == 1) {
                if (class132.field2758 == null) {
                    class132.field2758 = class32.field585.method1005(-42, class87.field1691, class30.field571);
                }
                if (class132.field2758.field2927 == 2) {
                    throw new IOException();
                }
                if (class132.field2758.field2927 == 1) {
                    class48.field977 = new class87((Socket) class132.field2758.field2930, class32.field585);
                    class132.field2758 = null;
                    class18.field304 = 2;
                }
            }
            if (class18.field304 == 2) {
                long var1 = class9.field162 = class68.field1374.method249(arg0 - 48);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class29.field522.field1727 = 0;
                class29.field522.method539(14, 27678);
                class29.field522.method539(var3, arg0 ^ 0x6C1E);
                class48.field977.method524(class29.field522.field1769, 2, (byte) 118, 0);
                class38.field723.field1727 = 0;
                class18.field304 = 3;
            }
            if (class18.field304 == 3) {
                if (class82.field1621 != null) {
                    class82.field1621.method455(127);
                }
                if (class167.field3295 != null) {
                    class167.field3295.method455(124);
                }
                int var4 = class48.field977.method525(-12000);
                if (class82.field1621 != null) {
                    class82.field1621.method455(122);
                }
                if (class167.field3295 != null) {
                    class167.field3295.method455(125);
                }
                if (var4 != 0) {
                    class167.method1033(var4, (byte) 58);
                    return;
                }
                class18.field304 = 4;
                class38.field723.field1727 = 0;
            }
            if (class18.field304 == 4) {
                if (class38.field723.field1727 < 8) {
                    int var5 = class48.field977.method523(arg0 ^ 0xFFFFFFAE);
                    if (8 - class38.field723.field1727 < var5) {
                        var5 = 8 - class38.field723.field1727;
                    }
                    if (var5 > 0) {
                        class48.field977.method526(var5, (byte) 103, class38.field723.field1727, class38.field723.field1769);
                        class38.field723.field1727 += var5;
                    }
                }
                if (class38.field723.field1727 == 8) {
                    class38.field723.field1727 = 0;
                    class175.field3478 = class38.field723.method561((byte) 46);
                    class18.field304 = 5;
                }
            }
            if (class18.field304 == 5) {
                class29.field522.field1727 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class175.field3478 >> 32), (int) class175.field3478 };
                class29.field522.method539(10, 27678);
                class29.field522.method581(var6[0], arg0 ^ 0xF0000000);
                class29.field522.method581(var6[1], -268435456);
                class29.field522.method581(var6[2], -268435456);
                class29.field522.method581(var6[3], -268435456);
                class29.field522.method550(-125, class68.field1374.method249(-48));
                class29.field522.method535(class68.field1368, (byte) 0);
                class29.field522.method553(class205.field3985, 14770, class158.field3197);
                class182.field3594.field1727 = 0;
                if (class174.field3473 == 40) {
                    class182.field3594.method539(18, 27678);
                } else {
                    class182.field3594.method539(16, 27678);
                }
                class182.field3594.method539(class29.field522.field1727 + 93, arg0 + 27678);
                class182.field3594.method581(478, arg0 - 268435456);
                class182.field3594.method539(class9.field163 ? 1 : 0, 27678);
                class117.method741(class182.field3594, arg0 ^ 0xFFFFF3CC);
                class182.field3594.method581(class36.field662.field1149, -268435456);
                class182.field3594.method581(class157.field3181.field1149, -268435456);
                class182.field3594.method581(class144.field2968.field1149, -268435456);
                class182.field3594.method581(class32.field596.field1149, -268435456);
                class182.field3594.method581(class182.field3597.field1149, -268435456);
                class182.field3594.method581(class4.field90.field1149, -268435456);
                class182.field3594.method581(class189.field3695.field1149, -268435456);
                class182.field3594.method581(class108.field2069.field1149, -268435456);
                class182.field3594.method581(class157.field3171.field1149, -268435456);
                class182.field3594.method581(class47.field948.field1149, -268435456);
                class182.field3594.method581(class58.field1166.field1149, -268435456);
                class182.field3594.method581(class80.field1596.field1149, arg0 - 268435456);
                class182.field3594.method581(class128.field2553.field1149, arg0 ^ 0xF0000000);
                class182.field3594.method581(class184.field3632.field1149, -268435456);
                class182.field3594.method581(class93.field1835.field1149, -268435456);
                class182.field3594.method581(class133.field2777.field1149, -268435456);
                class182.field3594.method542(94, class29.field522.field1769, 0, class29.field522.field1727);
                class48.field977.method524(class182.field3594.field1769, class182.field3594.field1727, (byte) 52, 0);
                class29.field522.method329(var6, (byte) 82);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class38.field723.method329(var6, (byte) 82);
                class18.field304 = 6;
            }
            if (class18.field304 == 6 && class48.field977.method523(-48) > 0) {
                int var8 = class48.field977.method525(-12000);
                if (var8 == 21 && class174.field3473 == 20) {
                    class18.field304 = 7;
                } else if (var8 == 2) {
                    class18.field304 = 9;
                } else if (var8 == 15 && class174.field3473 == 40) {
                    class125.method805((byte) 90);
                    return;
                } else if (var8 == 23 && class12.field180 < 1) {
                    class12.field180++;
                    class18.field304 = 0;
                } else {
                    class167.method1033(var8, (byte) 60);
                    return;
                }
            }
            if (class18.field304 == 7 && class48.field977.method523(-1) > 0) {
                class132.field2764 = (class48.field977.method525(-12000) + 3) * 60;
                class18.field304 = 8;
            }
            if (class18.field304 == 8) {
                class76.field1535 = 0;
                class84.method514(-88, class167.method1036(new class43[] { class30.method161(class132.field2764 / 60, 10), class147.field3008 }, true), class16.field258, class110.field2129);
                if (--class132.field2764 <= 0) {
                    class18.field304 = 0;
                }
            } else {
                if (arg0 != 0) {
                    field1357 = -61;
                }
                if (class18.field304 == 9 && class48.field977.method523(arg0 ^ 0xFFFFFFA6) >= 9) {
                    class144.field2957 = class48.field977.method525(arg0 - 12000);
                    class171.field3402 = class48.field977.method525(-12000);
                    class58.field1174 = class48.field977.method525(arg0 ^ 0xFFFFD120) == 1;
                    class80.field1593 = class48.field977.method525(-12000);
                    class80.field1593 <<= 0x8;
                    class80.field1593 += class48.field977.method525(-12000);
                    class68.field1370 = class48.field977.method525(-12000);
                    class48.field977.method526(1, (byte) 103, 0, class38.field723.field1769);
                    class38.field723.field1727 = 0;
                    class18.field298 = class38.field723.method336(-115);
                    class48.field977.method526(2, (byte) 103, 0, class38.field723.field1769);
                    class38.field723.field1727 = 0;
                    class114.field2215 = class38.field723.method555(-1113627096);
                    class18.field304 = 10;
                }
                if (class18.field304 != 10) {
                    class76.field1535++;
                    if (class76.field1535 > 2000) {
                        if (class12.field180 < 1) {
                            if (class87.field1691 == class53.field1070) {
                                class87.field1691 = class147.field3013;
                            } else {
                                class87.field1691 = class53.field1070;
                            }
                            class18.field304 = 0;
                            class12.field180++;
                        } else {
                            class167.method1033(-3, (byte) 60);
                        }
                    }
                } else if (class48.field977.method523(-2) >= class114.field2215) {
                    class38.field723.field1727 = 0;
                    class48.field977.method526(class114.field2215, (byte) 103, 0, class38.field723.field1769);
                    class144.method913((byte) -114);
                    class51.field1044 = -1;
                    class77.method476(false, false);
                    class18.field298 = -1;
                }
            }
        } catch (IOException var9) {
            if (class12.field180 < 1) {
                class18.field304 = 0;
                class12.field180++;
                if (class87.field1691 == class53.field1070) {
                    class87.field1691 = class147.field3013;
                } else {
                    class87.field1691 = class53.field1070;
                }
            } else {
                class167.method1033(-2, (byte) 104);
            }
        }
    }
}
