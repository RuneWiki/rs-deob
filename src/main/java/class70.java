import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 {

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field1475 = 0;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Lqf;")
    public static class117 field1480 = class72.method514(123, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static volatile int field1485 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[[I")
    public static int[][] field1468 = new int[5][5000];

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lqf;")
    public static class117 field1478 = class72.method514(111, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "[I")
    public static int[] field1486 = new int[100];

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field1482 = -1;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Lqf;")
    public static class117 field1489 = class72.method514(106, "Freunde");

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "[Z")
    public static boolean[] field1493 = new boolean[5];

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "Lqf;")
    public static class117 field1491 = class72.method514(103, "<col=ffffff>");

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "[B")
    public static byte[] field1488 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "Lqf;")
    public static class117 field1496 = class72.method514(121, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "J")
    public long field1495;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Ldf;")
    public static class28 field1492;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Lka;")
    public class70 field1483;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "Lka;")
    public class70 field1487;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "Llc;")
    public static class79 field1490;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z")
    public final boolean method490(int arg0) {
        if (arg0 < 20) {
            this.method490(22);
        }
        field1469++;
        return this.field1487 != null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static final void method491(int arg0) {
        field1479++;
        int var1 = 15 % ((arg0 + 30) / 45);
        for (class22 var2 = (class22) class66.field1374.method27(18823); var2 != null; var2 = (class22) class66.field1374.method25((byte) -126)) {
            if (var2.field415 != null) {
                class147.field3592.method279(var2.field415);
                var2.field415 = null;
            }
            if (var2.field405 != null) {
                class147.field3592.method279(var2.field405);
                var2.field405 = null;
            }
        }
        class66.field1374.method26(125);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lrc;")
    public static final class121 method492(Throwable arg0, String arg1) {
        field1474++;
        class121 var2;
        if (arg0 instanceof class121) {
            var2 = (class121) arg0;
            var2.field2889 = var2.field2889 + ' ' + arg1;
        } else {
            var2 = new class121(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lkf;")
    public static final class75 method493(int arg0, int arg1) {
        field1484++;
        class75 var2 = (class75) class75.field1629.method247(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class47.field945.method458(false, arg0, 4);
        class75 var4 = new class75();
        if (var3 != null) {
            var4.method542(new class77(var3), arg0, arg1 ^ 0xFFFFD2B1);
        }
        var4.method538(arg1);
        class75.field1629.method248((long) arg0, (byte) -113, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static final void method494(boolean arg0) {
        int var1 = class31.field658 * 128 + 64;
        field1477++;
        int var2 = class114.field2696 * 128 + 64;
        int var3 = class80.method626(var1, class140.field3344, var2, -126) - class52.field1065;
        if (class117.field2813 < var2) {
            class117.field2813 += (var2 - class117.field2813) * class135.field3241 / 1000 + class66.field1392;
            if (class117.field2813 > var2) {
                class117.field2813 = var2;
            }
        }
        if (var3 > class136.field3247) {
            class136.field3247 += class66.field1392 + (var3 - class136.field3247) * class135.field3241 / 1000;
            if (class136.field3247 > var3) {
                class136.field3247 = var3;
            }
        }
        if (!arg0) {
            field1492 = null;
        }
        if (var3 < class136.field3247) {
            class136.field3247 -= class66.field1392 + (class136.field3247 - var3) * class135.field3241 / 1000;
            if (var3 > class136.field3247) {
                class136.field3247 = var3;
            }
        }
        if (class87.field1959 < var1) {
            class87.field1959 += (var1 - class87.field1959) * class135.field3241 / 1000 + class66.field1392;
            if (class87.field1959 > var1) {
                class87.field1959 = var1;
            }
        }
        if (var1 < class87.field1959) {
            class87.field1959 -= (class87.field1959 - var1) * class135.field3241 / 1000 + class66.field1392;
            if (class87.field1959 < var1) {
                class87.field1959 = var1;
            }
        }
        if (var2 < class117.field2813) {
            class117.field2813 -= class66.field1392 + (class117.field2813 - var2) * class135.field3241 / 1000;
            if (class117.field2813 < var2) {
                class117.field2813 = var2;
            }
        }
        int var4 = class66.field1379 * 128 + 64;
        int var5 = class133.field3152 * 128 + 64;
        int var6 = class80.method626(var4, class140.field3344, var5, 97) - class35.field739;
        int var7 = var5 - class117.field2813;
        int var8 = var4 - class87.field1959;
        int var9 = var6 - class136.field3247;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var7 * var7));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var7)) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var13 = var12 - class27.field530;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class27.field530 += class27.field536 * var13 / 1000 + class78.field1767;
            class27.field530 &= 0x7FF;
        }
        if (var13 < 0) {
            class27.field530 -= class78.field1767 + -var13 * class27.field536 / 1000;
            class27.field530 &= 0x7FF;
        }
        int var14 = var12 - class27.field530;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var11 > class77.field1722) {
            class77.field1722 += (var11 - class77.field1722) * class27.field536 / 1000 + class78.field1767;
            if (class77.field1722 > var11) {
                class77.field1722 = var11;
            }
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class27.field530 = var12;
        }
        if (var11 >= class77.field1722) {
            return;
        }
        class77.field1722 -= class78.field1767 + (class77.field1722 - var11) * class27.field536 / 1000;
        if (var11 > class77.field1722) {
            class77.field1722 = var11;
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
    public final void method495(int arg0) {
        field1476++;
        if (arg0 < -12 && this.field1487 != null) {
            this.field1487.field1483 = this.field1483;
            this.field1483.field1487 = this.field1487;
            this.field1483 = null;
            this.field1487 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static final void method496(byte arg0) {
        if (arg0 != 84) {
            return;
        }
        int var1 = class96.field2338.method963(-61, 8);
        field1470++;
        if (class66.field1387 > var1) {
            for (int var2 = var1; var2 < class66.field1387; var2++) {
                class91.field2221[class139.field3318++] = class20.field326[var2];
            }
        }
        if (var1 > class66.field1387) {
            throw new RuntimeException("gppov1");
        }
        class66.field1387 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class20.field326[var3];
            class21 var5 = class149.field3709[var4];
            int var6 = class96.field2338.method963(-85, 1);
            if (var6 == 0) {
                class20.field326[class66.field1387++] = var4;
                var5.field2008 = class43.field856;
            } else {
                int var7 = class96.field2338.method963(arg0 ^ 0xFFFFFFFB, 2);
                if (var7 == 0) {
                    class20.field326[class66.field1387++] = var4;
                    var5.field2008 = class43.field856;
                    class56.field1151[class91.field2225++] = var4;
                } else if (var7 == 1) {
                    class20.field326[class66.field1387++] = var4;
                    var5.field2008 = class43.field856;
                    int var8 = class96.field2338.method963(-107, 3);
                    var5.method686((byte) -32, false, var8);
                    int var9 = class96.field2338.method963(-68, 1);
                    if (var9 == 1) {
                        class56.field1151[class91.field2225++] = var4;
                    }
                } else if (var7 == 2) {
                    class20.field326[class66.field1387++] = var4;
                    var5.field2008 = class43.field856;
                    int var10 = class96.field2338.method963(-57, 3);
                    var5.method686((byte) -107, true, var10);
                    int var11 = class96.field2338.method963(-68, 3);
                    var5.method686((byte) 78, true, var11);
                    int var12 = class96.field2338.method963(-91, 1);
                    if (var12 == 1) {
                        class56.field1151[class91.field2225++] = var4;
                    }
                } else if (var7 == 3) {
                    class91.field2221[class139.field3318++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)I")
    public static final int method497(byte arg0, int arg1) {
        field1471++;
        if (arg0 != 111) {
            method492(null, null);
        }
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBI)I")
    public static final int method498(int arg0, int arg1, byte arg2, int arg3) {
        field1473++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else {
            int var5 = -117 % ((-arg2 - 31) / 40);
            return var4 == 2 ? 7 - arg3 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
    public static final void method499(int arg0) {
        if (arg0 != 1000) {
            method496((byte) -4);
        }
        field1494++;
        while (true) {
            class5 var1 = class34.field710;
            class124 var2;
            synchronized (class34.field710) {
                var2 = (class124) client.field385.method13(true);
            }
            if (var2 == null) {
                return;
            }
            var2.field2918.method367(var2.field2914, true, false, var2.field2927, (int) var2.field1495);
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
    public static void method500(int arg0) {
        field1496 = null;
        field1478 = null;
        field1480 = null;
        field1468 = null;
        if (arg0 != 17484) {
            field1496 = null;
        }
        field1491 = null;
        field1493 = null;
        field1488 = null;
        field1486 = null;
        field1490 = null;
        field1492 = null;
        field1489 = null;
    }
}
