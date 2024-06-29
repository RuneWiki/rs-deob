import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class427 {

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "D")
    public static double field6295 = -1.0D;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Lia;")
    public static class350 field6293 = class292.method1960((byte) 88);

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "[[S")
    public static short[][] field6302 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Lal;")
    public static class52 field6300 = new class52(4);

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field6303 = 0;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[Z")
    public static boolean[] field6297;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "[[[B")
    public static byte[][][] field6304;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2645(boolean arg0) {
        field6302 = null;
        field6300 = null;
        field6293 = null;
        field6304 = null;
        field6297 = null;
        if (arg0) {
            method2649(105, -46, -28);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZB)V", line = 23)
    public static final void method2646(boolean arg0, byte arg1) {
        class409.method2566(true);
        field6294++;
        if (arg1 >= -64) {
            method2646(false, (byte) -49);
        }
        if (class262.field4219 != 30 && class262.field4219 != 25) {
            return;
        }
        class403.field6012++;
        if (class403.field6012 < 50 && !arg0) {
            return;
        }
        class403.field6012 = 0;
        if (!class19.field242 && class421.field6216 != null) {
            class298.field4738++;
            class11.field139.method2224(248, (byte) 0);
            try {
                class421.field6216.method1101(class11.field139.field3066, 0, class11.field139.field3044, 3);
                class11.field139.field3044 = 0;
            } catch (IOException var2) {
                class19.field242 = true;
            }
        }
        class409.method2566(true);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 59)
    public static final void method2647(byte arg0) {
        field6298++;
        if (class426.field6281 == 0) {
            return;
        }
        try {
            if (++class422.field6226 > 1500) {
                if (class421.field6216 != null) {
                    class421.field6216.method1098((byte) 104);
                    class421.field6216 = null;
                }
                if (class325.field5106 >= 1) {
                    class357.field5463 = -5;
                    class426.field6281 = 0;
                    return;
                }
                class325.field5106++;
                class426.field6281 = 1;
                if (class382.field5769 == class11.field153) {
                    class11.field153 = class424.field6264;
                } else {
                    class11.field153 = class382.field5769;
                }
                class422.field6226 = 0;
            }
            if (class426.field6281 == 1) {
                class234.field3906 = class63.field822.method1894(0, class316.field4959, class11.field153);
                class426.field6281 = 2;
            }
            if (arg0 >= 93) {
                if (class426.field6281 == 2) {
                    if (class234.field3906.field304 == 2) {
                        throw new IOException();
                    }
                    if (class234.field3906.field304 != 1) {
                        return;
                    }
                    class421.field6216 = new class156((Socket) class234.field3906.field305, class63.field822);
                    class234.field3906 = null;
                    class421.field6216.method1101(class11.field139.field3066, 0, class11.field139.field3044, 3);
                    if (class441.field6457 != null) {
                        class441.field6457.method1546(2124);
                    }
                    if (class313.field4928 != null) {
                        class313.field4928.method1546(2124);
                    }
                    int var1 = class421.field6216.method1105(false);
                    if (class441.field6457 != null) {
                        class441.field6457.method1546(2124);
                    }
                    if (class313.field4928 != null) {
                        class313.field4928.method1546(2124);
                    }
                    if (var1 != 101) {
                        class426.field6281 = 0;
                        class357.field5463 = var1;
                        class421.field6216.method1098((byte) 75);
                        class421.field6216 = null;
                        return;
                    }
                    class426.field6281 = 3;
                }
                if (class426.field6281 == 3 && class421.field6216.method1102(30000) >= 2) {
                    int var2 = class421.field6216.method1105(false) << 8 | class421.field6216.method1105(false);
                    class380.method2419(4, var2);
                    if (class155.field2434 == -1) {
                        class357.field5463 = 6;
                        class426.field6281 = 0;
                        class421.field6216.method1098((byte) 109);
                        class421.field6216 = null;
                    } else {
                        class426.field6281 = 0;
                        class421.field6216.method1098((byte) 121);
                        class421.field6216 = null;
                        class42.method281(-110);
                    }
                }
            }
        } catch (IOException var3) {
            if (class421.field6216 != null) {
                class421.field6216.method1098((byte) 53);
                class421.field6216 = null;
            }
            if (class325.field5106 < 1) {
                class325.field5106++;
                if (class382.field5769 == class11.field153) {
                    class11.field153 = class424.field6264;
                } else {
                    class11.field153 = class382.field5769;
                }
                class426.field6281 = 1;
                class422.field6226 = 0;
            } else {
                class426.field6281 = 0;
                class357.field5463 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V", line = 207)
    public static final void method2648(boolean arg0) {
        field6296++;
        int var1 = class158.field2514.method2225(84, 8);
        if (var1 < class107.field1500) {
            for (int var2 = var1; var2 < class107.field1500; var2++) {
                class134.field2112[class11.field155++] = class132.field2063[var2];
            }
        }
        if (class107.field1500 < var1) {
            throw new RuntimeException("gppov1");
        }
        class107.field1500 = 0;
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class132.field2063[var3];
            class219 var5 = class216.field3517[var4];
            int var6 = class158.field2514.method2225(-81, 1);
            if (var6 == 0) {
                class132.field2063[class107.field1500++] = var4;
                var5.field1839 = class183.field2987;
            } else {
                int var7 = class158.field2514.method2225(-125, 2);
                if (var7 == 0) {
                    class132.field2063[class107.field1500++] = var4;
                    var5.field1839 = class183.field2987;
                    class208.field3349[class21.field274++] = var4;
                } else if (var7 == 1) {
                    class132.field2063[class107.field1500++] = var4;
                    var5.field1839 = class183.field2987;
                    int var8 = class158.field2514.method2225(-61, 3);
                    var5.method909(var8, 1, 120);
                    int var9 = class158.field2514.method2225(-83, 1);
                    if (var9 == 1) {
                        class208.field3349[class21.field274++] = var4;
                    }
                } else if (var7 == 2) {
                    class132.field2063[class107.field1500++] = var4;
                    var5.field1839 = class183.field2987;
                    if (class158.field2514.method2225(-98, 1) == 1) {
                        int var11 = class158.field2514.method2225(90, 3);
                        var5.method909(var11, 2, 67);
                        int var12 = class158.field2514.method2225(-76, 3);
                        var5.method909(var12, 2, 29);
                    } else {
                        int var10 = class158.field2514.method2225(120, 3);
                        var5.method909(var10, 0, 82);
                    }
                    int var13 = class158.field2514.method2225(83, 1);
                    if (var13 == 1) {
                        class208.field3349[class21.field274++] = var4;
                    }
                } else if (var7 == 3) {
                    class134.field2112[class11.field155++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Z", line = 330)
    public static final boolean method2649(int arg0, int arg1, int arg2) {
        int var3 = class79.field989[arg0][arg1][arg2];
        if (-class381.field5764 == var3) {
            return false;
        } else if (class381.field5764 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class318.method2117(var4 + 1, class275.field4396[arg0].method779(arg1, arg2), var5 + 1) && class318.method2117(var4 + 128 - 1, class275.field4396[arg0].method779(arg1 + 1, arg2), var5 + 1) && class318.method2117(var4 + 128 - 1, class275.field4396[arg0].method779(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class318.method2117(var4 + 1, class275.field4396[arg0].method779(arg1, arg2 + 1), var5 + 128 - 1)) {
                class79.field989[arg0][arg1][arg2] = class381.field5764;
                return true;
            } else {
                class79.field989[arg0][arg1][arg2] = -class381.field5764;
                return false;
            }
        }
    }
}
