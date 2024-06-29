import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class1 {

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "[I")
    public static int[] field16 = new int[5];

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "[B")
    public static byte[] field12 = new byte[32896];

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "Ljava/lang/String;")
    public static String field20;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "J")
    public static long field19;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Lrc;")
    public static class9 field21;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "[[S")
    public static short[][] field9;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    public abstract void method1(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
    public static final byte[] method2(Object arg0, boolean arg1, int arg2) {
        if (arg2 >= -116) {
            method5(39);
        }
        field6++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class45.method286(-106, var3) : var3;
        } else if (arg0 instanceof class170) {
            class170 var4 = (class170) arg0;
            return var4.method1115((byte) 68);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
    public abstract void method3(int arg0, int arg1);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)Le;")
    public static final class166 method4(int arg0, int arg1, int arg2, int arg3) {
        field10++;
        if (arg2 != 30200) {
            method4(-6, 83, 89, -64);
        }
        class166 var4 = new class166();
        var4.field2381 = arg3;
        var4.field2395 = arg0;
        class189.field2705.method1894(-1, var4, (long) arg1);
        class114.method737(arg0, arg2 ^ 0x6661);
        class82 var5 = class182.method1187((byte) -41, arg1);
        if (var5 != null) {
            class255.method1632(arg2 + 16681480, var5);
        }
        if (class165.field2365 != null) {
            class255.method1632(16711680, class165.field2365);
            class165.field2365 = null;
        }
        int var6 = class112.field1496;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class285.method1902(class190.field2749[var7], false)) {
                class32.method202(arg2 - 30199, var7);
            }
        }
        if (class112.field1496 == 1) {
            class177.field2518 = false;
            class9.method66(class267.field3901, class76.field911, class263.field3814, -35, class221.field3134);
        } else {
            class9.method66(class267.field3901, class76.field911, class263.field3814, arg2 - 30235, class221.field3134);
            int var8 = class248.field3614.method539(class164.field2349);
            for (int var9 = 0; var9 < class112.field1496; var9++) {
                int var10 = class248.field3614.method539(class59.method368(var9, (byte) -128));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class267.field3901 = var8 + 8;
            class76.field911 = (class154.field2226 ? 26 : 22) + class112.field1496 * 15;
        }
        if (var5 != null) {
            class54.method324((byte) 39, var5, false);
        }
        class71.method436((byte) 117, arg0);
        if (class123.field1776 != -1) {
            class200.method1290(1, class123.field1776, arg2 ^ 0x1502);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method5(int arg0) {
        field20 = null;
        field3 = null;
        field9 = null;
        field12 = null;
        field16 = null;
        field21 = null;
        if (arg0 >= -14) {
            method5(-103);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static final void method6(int arg0) {
        field8++;
        if (class240.field3484 == 0 || class240.field3484 == 5) {
            return;
        }
        try {
            if (++class238.field3427 > 2000) {
                if (class117.field1637 != null) {
                    class117.field1637.method1199(-81);
                    class117.field1637 = null;
                }
                if (class63.field744 >= 1) {
                    class20.field247 = -5;
                    class240.field3484 = 0;
                    return;
                }
                if (class267.field3851 == class182.field2601) {
                    class182.field2601 = class263.field3811;
                } else {
                    class182.field2601 = class267.field3851;
                }
                class240.field3484 = 1;
                class63.field744++;
                class238.field3427 = 0;
            }
            if (~class240.field3484 == arg0) {
                class163.field2344 = class115.field1592.method349(0, class182.field2601, class151.field2198);
                class240.field3484 = 2;
            }
            if (class240.field3484 == 2) {
                if (class163.field2344.field960 == 2) {
                    throw new IOException();
                }
                if (class163.field2344.field960 != 1) {
                    return;
                }
                class117.field1637 = new class185((Socket) class163.field2344.field958, class115.field1592);
                class163.field2344 = null;
                long var1 = class296.field4680 = class60.method370((byte) -8, class280.field4256);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class94.field1259.field3021 = 0;
                class94.field1259.method1373(14, arg0 - 13983);
                class94.field1259.method1373(var3, arg0 - 13983);
                class117.field1637.method1206(class94.field1259.field3030, 2, (byte) -43, 0);
                if (class73.field878 != null) {
                    class73.field878.method830(32237);
                }
                if (class282.field4282 != null) {
                    class282.field4282.method830(32237);
                }
                int var4 = class117.field1637.method1209((byte) 100);
                if (class73.field878 != null) {
                    class73.field878.method830(32237);
                }
                if (class282.field4282 != null) {
                    class282.field4282.method830(arg0 + 32239);
                }
                if (var4 != 0) {
                    class240.field3484 = 0;
                    class20.field247 = var4;
                    class117.field1637.method1199(-127);
                    class117.field1637 = null;
                    return;
                }
                class240.field3484 = 3;
            }
            if (class240.field3484 == 3) {
                if (class117.field1637.method1202((byte) -101) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class117.field1637.method1205(class163.field2332.field3030, 8, false, 0);
                class163.field2332.field3021 = 0;
                class135.field1972 = class163.field2332.method1386((byte) 124);
                class94.field1259.field3021 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class135.field1972;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class135.field1972 >> 32);
                class94.field1259.method1373(10, -13985);
                class94.field1259.method1410(var5[0], (byte) 39);
                class94.field1259.method1410(var5[1], (byte) -128);
                class94.field1259.method1410(var5[2], (byte) -126);
                class94.field1259.method1410(var5[3], (byte) -125);
                class94.field1259.method1379(-59, class60.method370((byte) -8, class280.field4256));
                class94.field1259.method1353(class189.field2712, (byte) -115);
                class94.field1259.method1394(class289.field4491, 119, class217.field3080);
                class238.field3416.field3021 = 0;
                if (class141.field2034 == 40) {
                    class238.field3416.method1373(18, -13985);
                } else {
                    class238.field3416.method1373(16, -13985);
                }
                class238.field3416.method1387(class94.field1259.field3021 + class109.method681(client.field4449, arg0 - 2793) + 163, 4);
                class238.field3416.method1410(541, (byte) 21);
                class238.field3416.method1373(class66.field787, -13985);
                class238.field3416.method1373(class255.field3681 ? 1 : 0, arg0 - 13983);
                class238.field3416.method1373(0, -13985);
                class238.field3416.method1373(class285.method1903(32113), -13985);
                class238.field3416.method1387(class84.field1166, 4);
                class238.field3416.method1387(client.field4437, 4);
                class238.field3416.method1373(class54.field624, -13985);
                class237.method1547(class238.field3416, -30275);
                class238.field3416.method1353(client.field4449, (byte) -115);
                class238.field3416.method1410(class133.field1939, (byte) -124);
                class238.field3416.method1410(class71.method439(arg0 - 1814797366), (byte) -15);
                class115.field1596 = true;
                class238.field3416.method1387(class7.field97, 4);
                class238.field3416.method1410(class206.field2920.method1868((byte) -92), (byte) -125);
                class238.field3416.method1410(class188.field2701.method1868((byte) -109), (byte) -128);
                class238.field3416.method1410(class100.field1357.method1868((byte) -113), (byte) 10);
                class238.field3416.method1410(class185.field2685.method1868((byte) -101), (byte) -125);
                class238.field3416.method1410(class61.field723.method1868((byte) -86), (byte) -124);
                class238.field3416.method1410(class26.field305.method1868((byte) -83), (byte) -126);
                class238.field3416.method1410(class163.field2346.method1868((byte) -111), (byte) -124);
                class238.field3416.method1410(class217.field3074.method1868((byte) -89), (byte) -128);
                class238.field3416.method1410(class120.field1705.method1868((byte) -98), (byte) -124);
                class238.field3416.method1410(class28.field343.method1868((byte) -127), (byte) -127);
                class238.field3416.method1410(class38.field465.method1868((byte) -88), (byte) -34);
                class238.field3416.method1410(class235.field3393.method1868((byte) -127), (byte) -32);
                class238.field3416.method1410(class168.field2420.method1868((byte) -126), (byte) 105);
                class238.field3416.method1410(class72.field853.method1868((byte) -120), (byte) 71);
                class238.field3416.method1410(class63.field740.method1868((byte) -79), (byte) 36);
                class238.field3416.method1410(class104.field1419.method1868((byte) -86), (byte) -125);
                class238.field3416.method1410(class193.field2776.method1868((byte) -87), (byte) -128);
                class238.field3416.method1410(class40.field484.method1868((byte) -108), (byte) 124);
                class238.field3416.method1410(class233.field3359.method1868((byte) -95), (byte) -125);
                class238.field3416.method1410(class215.field3004.method1868((byte) -95), (byte) 53);
                class238.field3416.method1410(class116.field1628.method1868((byte) -91), (byte) -124);
                class238.field3416.method1410(class274.field4089.method1868((byte) -98), (byte) -25);
                class238.field3416.method1410(class123.field1768.method1868((byte) -116), (byte) -126);
                class238.field3416.method1410(class292.field4619.method1868((byte) -117), (byte) -12);
                class238.field3416.method1410(class136.field1982.method1868((byte) -111), (byte) 37);
                class238.field3416.method1410(class220.field3119.method1868((byte) -120), (byte) -36);
                class238.field3416.method1410(class12.field158.method1868((byte) -88), (byte) 94);
                class238.field3416.method1410(class76.field908.method1868((byte) -120), (byte) -128);
                class238.field3416.method1410(class119.field1690.method1868((byte) -128), (byte) -23);
                class238.field3416.method1405(class94.field1259.field3021, (byte) -108, 0, class94.field1259.field3030);
                class117.field1637.method1206(class238.field3416.field3030, class238.field3416.field3021, (byte) -43, 0);
                class94.field1259.method588((byte) 1, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class163.field2332.method588((byte) 1, var5);
                class240.field3484 = 4;
            }
            if (class240.field3484 == 4) {
                if (class117.field1637.method1202((byte) 80) < 1) {
                    return;
                }
                int var7 = class117.field1637.method1209((byte) 100);
                if (var7 == 21) {
                    class240.field3484 = 7;
                } else if (var7 == 29) {
                    class240.field3484 = 10;
                } else if (var7 == 1) {
                    class20.field247 = var7;
                    class240.field3484 = 5;
                    return;
                } else if (var7 == 2) {
                    class240.field3484 = 8;
                } else if (var7 == 15) {
                    class240.field3484 = 0;
                    class20.field247 = var7;
                    return;
                } else if (var7 == 23 && class63.field744 < 1) {
                    class240.field3484 = 1;
                    class63.field744++;
                    class238.field3427 = 0;
                    class117.field1637.method1199(-38);
                    class117.field1637 = null;
                    return;
                } else {
                    class20.field247 = var7;
                    class240.field3484 = 0;
                    class117.field1637.method1199(-109);
                    class117.field1637 = null;
                    return;
                }
            }
            if (class240.field3484 == 6) {
                class94.field1259.field3021 = 0;
                class94.field1259.method592(17, false);
                class117.field1637.method1206(class94.field1259.field3030, class94.field1259.field3021, (byte) -43, 0);
                class240.field3484 = 4;
            } else if (class240.field3484 == 7) {
                if (class117.field1637.method1202((byte) 72) >= 1) {
                    class37.field422 = class117.field1637.method1209((byte) 100) * 60 + 180;
                    class240.field3484 = 0;
                    class20.field247 = 21;
                    class117.field1637.method1199(-36);
                    class117.field1637 = null;
                }
            } else if (class240.field3484 != 10) {
                if (class240.field3484 == 8) {
                    if (class117.field1637.method1202((byte) 70) < 14) {
                        return;
                    }
                    class117.field1637.method1205(class163.field2332.field3030, 14, false, 0);
                    class163.field2332.field3021 = 0;
                    class88.field1192 = class163.field2332.method1407(114);
                    class88.field1191 = class163.field2332.method1407(105);
                    class252.field3647 = class163.field2332.method1407(122) == 1;
                    class143.field2048 = class163.field2332.method1407(124) == 1;
                    class60.field721 = class163.field2332.method1407(116) == 1;
                    class44.field527 = class163.field2332.method1407(124) == 1;
                    class88.field1198 = class163.field2332.method1407(arg0 ^ 0xFFFFFF8F) == 1;
                    class33.field385 = class163.field2332.method1380(true);
                    class204.field2899 = class163.field2332.method1407(114) == 1;
                    class263.field3809 = class163.field2332.method1407(105) == 1;
                    class166.method1087((byte) -4, class263.field3809);
                    class279.method1834(false, class263.field3809);
                    if (!class255.field3681) {
                        if ((!class252.field3647 || class60.field721) && !class204.field2899) {
                            try {
                                class208.method1328(arg0 - 24230, class115.field1592.field664, "unzap");
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class208.method1328(arg0 - 24230, class115.field1592.field664, "zap");
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    try {
                        class208.method1328(-24232, class115.field1592.field664, "loggedin");
                    } catch (Throwable var8) {
                    }
                    class6.field79 = class163.field2332.method589(-119);
                    class230.field3314 = class163.field2332.method1380(true);
                    class240.field3484 = 9;
                }
                if (class240.field3484 == 9 && class117.field1637.method1202((byte) 91) >= class230.field3314) {
                    class163.field2332.field3021 = 0;
                    class117.field1637.method1205(class163.field2332.field3030, class230.field3314, false, 0);
                    class20.field247 = 2;
                    class240.field3484 = 0;
                    class173.method1127(false);
                    class181.field2575 = -1;
                    class280.method1836(false, false);
                    class6.field79 = -1;
                }
            } else if (class117.field1637.method1202((byte) 89) >= 1) {
                class125.field1796 = class117.field1637.method1209((byte) 100);
                class240.field3484 = 0;
                class20.field247 = 29;
                class117.field1637.method1199(-28);
                class117.field1637 = null;
            }
        } catch (IOException var11) {
            if (class117.field1637 != null) {
                class117.field1637.method1199(-108);
                class117.field1637 = null;
            }
            if (class63.field744 < 1) {
                class63.field744++;
                if (class267.field3851 == class182.field2601) {
                    class182.field2601 = class263.field3811;
                } else {
                    class182.field2601 = class267.field3851;
                }
                class240.field3484 = 1;
                class238.field3427 = 0;
            } else {
                class240.field3484 = 0;
                class20.field247 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)Lak;")
    public static final class19 method7(int arg0, int arg1) {
        field15++;
        class19 var2 = (class19) class285.field4395.method65((byte) -85, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -5629) {
            byte[] var3 = class129.field1866.method1861(arg0, 1, arg1 ^ 0xFFFFEA02);
            class19 var4 = new class19();
            if (var3 != null) {
                var4.method116(new class216(var3), 28777, arg0);
            }
            class285.field4395.method64((long) arg0, -1, var4);
            return var4;
        } else {
            return null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field12[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
        field20 = "Loaded config";
        field19 = 0L;
        field21 = new class9(64);
        field22 = 5063219;
    }
}
