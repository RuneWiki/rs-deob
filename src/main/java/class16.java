import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class16 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public int field283 = -1;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public int field282 = 1190717;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public int field286 = 8;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public int field292 = 16;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public int field295 = 0;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Z")
    public boolean field291 = true;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Z")
    public boolean field293 = true;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public int field301 = 128;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public int field298 = -1;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Z")
    public boolean field297 = false;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "S")
    public static short field287 = 256;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field294 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field300 = -1;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lni;ILma;)Lvg;", line = 11)
    public static final class23 method139(class202 arg0, int arg1, class5 arg2) {
        if (arg1 != -32734) {
            field287 = 72;
        }
        field284++;
        int var3 = arg0.method1346((byte) 87, arg2);
        if (var3 == -1) {
            return new class23(0);
        }
        int[] var4 = arg0.method1325((byte) -92, var3);
        class23 var5 = new class23(var4.length);
        for (int var6 = 0; var6 < var5.field403; var6++) {
            class221 var7 = new class221(arg0.method1342(29, var3, var4[var6]));
            var5.field397[var6] = var7.method1501((byte) -56);
            var5.field399[var6] = var7.method1543(false);
            var5.field396[var6] = (short) var7.method1524((byte) 103);
            var5.field395[var6] = (short) var7.method1524((byte) 65);
            var5.field398[var6] = var7.method1517((byte) -111);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)I", line = 53)
    public static final int method140(int arg0, byte arg1, int arg2) {
        if (arg1 != -46) {
            field294 = -104;
        }
        long var3 = (long) ((arg0 << 16) + arg2);
        field285++;
        return class241.field4009 != null && class241.field4009.field5004 == var3 ? class99.field1482.field3610 * 99 / (class99.field1482.field3617.length - class241.field4009.field2009) + 1 : 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 78)
    public static final void method141(int arg0) {
        field289++;
        if (class164.field2511 == null) {
            return;
        }
        try {
            if (arg0 != -17473) {
                field287 = 84;
            }
            byte[] var1 = class164.field2511.method1489((byte) -56);
            if (var1 != null) {
                class221 var2 = new class221(var1);
                class241.field4023 = var2.method1524((byte) 57);
                class266.field4549 = new class303[class241.field4023];
                for (int var3 = 0; var3 < class241.field4023; var3++) {
                    class303 var4 = class266.field4549[var3] = new class303();
                    int var5 = var2.method1524((byte) 115);
                    var4.field5117 = (var5 & 0x8000) != 0;
                    var4.field5100 = var5 & 0x7FFF;
                    var4.field5105 = var2.method1501((byte) -56);
                    var4.field5118 = var2.method1505(-54);
                    var4.field5110 = var3;
                    int var6 = var2.method1524((byte) 98);
                    var4.field5112 = class218.method1484(var6, arg0 ^ 0x443F);
                }
                class210.method1393(class266.field4549, 74, 0, class266.field4549.length - 1);
                class164.field2511 = null;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            class164.field2511 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 130)
    public static final void method142(boolean arg0) {
        field296++;
        if (class283.field4799 == null) {
            return;
        }
        if (class130.field1948 < 10) {
            if (!class35.field552.method1333(class283.field4799.field1486, true) || !class35.field552.method1333(class288.method1940((byte) 61, new class5[] { class283.field4799.field1486, class208.field3308 }), true)) {
                class130.field1948 = class93.field1420.method1338(-100, class283.field4799.field1486) / 10;
                return;
            }
            class85.method570(-5);
            class130.field1948 = 10;
        }
        if (class130.field1948 == 10) {
            class289.field4918 = class283.field4799.field1490 >> 6 << 6;
            class206.field3284 = class283.field4799.field1493 >> 6 << 6;
            class98.field1473 = 8.0F;
            class168.field2557 = 8.0F;
            class97.field1460 = (class283.field4799.field1503 >> 6 << 6) + 64 - class289.field4918;
            int var1 = class97.field1460 + class289.field4918 - (class151.field2183.field211 >> 7) - class74.field1158 - 1;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = (class151.field2183.field178 >> 7) + class193.field3017 - class206.field3284;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            class139.field2066 = (class283.field4799.field1504 >> 6 << 6) + 64 - class206.field3284;
            if (var4 >= 0 && class139.field2066 > var4 && var2 >= 0 && class97.field1460 > var2) {
                class14.field269 = var2;
                class284.field4811 = var4;
            } else {
                class284.field4811 = class283.field4799.field1492 * 64 - class206.field3284;
                class14.field269 = class289.field4918 + class97.field1460 - (class283.field4799.field1496 * 64) - 1;
            }
            class113.method747((byte) -70);
            int var5 = class260.field4436 >> 1;
            class43.field650 = new int[class301.field5069 + 1];
            int var6 = class218.field3526 >> 2 << 10;
            int var7 = class97.field1460 >> 6;
            int var8 = class139.field2066 >> 6;
            class248.field4102 = new int[var8][var7][];
            class230.field3825 = new byte[var8][var7][];
            class276.field4707 = new byte[var8][var7][];
            class170.field2614 = new byte[var8][var7][];
            class278.field4722 = new int[var8][var7][];
            class141.field2076 = new short[var8][var7][];
            class289.field4912 = new byte[var8][var7][];
            class267.field4594 = new byte[var8][var7][];
            class76.method534(1820, var5, var6);
            class130.field1948 = 20;
        } else if (class130.field1948 == 20) {
            class29.method212(789221, new class221(class35.field552.method1323(-128, class283.field4799.field1486, class282.field4792)));
            class130.field1948 = 30;
            class40.method287(0, true);
            class105.method665(0);
        } else if (class130.field1948 == 30) {
            class169.method1122(new class221(class35.field552.method1323(-128, class283.field4799.field1486, class96.field1436)), 63);
            class130.field1948 = 40;
            class105.method665(0);
        } else if (class130.field1948 == 40) {
            class261.method1809((byte) 83, new class221(class35.field552.method1323(-128, class283.field4799.field1486, class242.field4024)));
            class130.field1948 = 50;
            class105.method665(0);
        } else if (class130.field1948 == 50) {
            class265.method1824((byte) -114, new class221(class35.field552.method1323(-128, class283.field4799.field1486, class99.field1481)));
            class130.field1948 = 60;
            class40.method287(0, true);
            class105.method665(0);
        } else if (class130.field1948 == 60) {
            class46.field704 = method139(class35.field552, -32734, class288.method1940((byte) 84, new class5[] { class283.field4799.field1486, class208.field3308 }));
            class130.field1948 = 70;
            class105.method665(0);
        } else if (class130.field1948 == 70) {
            class70.field1112 = new class295(11, true, class147.field2141);
            class130.field1948 = 73;
            class40.method287(0, true);
            class105.method665(0);
        } else if (class130.field1948 == 73) {
            class50.field787 = new class295(12, true, class147.field2141);
            class130.field1948 = 76;
            class40.method287(0, true);
            class105.method665(0);
        } else if (class130.field1948 == 76) {
            class69.field1090 = new class295(14, true, class147.field2141);
            class130.field1948 = 79;
            class40.method287(0, true);
            class105.method665(0);
        } else if (class130.field1948 == 79) {
            class86.field1307 = new class295(17, true, class147.field2141);
            class130.field1948 = 82;
            class40.method287(0, true);
            class105.method665(0);
        } else if (class130.field1948 == 82) {
            class236.field3905 = new class295(19, true, class147.field2141);
            class130.field1948 = 85;
            class40.method287(0, true);
            class105.method665(0);
        } else if (class130.field1948 == 85) {
            class274.field4678 = new class295(22, true, class147.field2141);
            class130.field1948 = 88;
            class40.method287(0, true);
            class105.method665(0);
        } else if (class130.field1948 == 88) {
            class167.field2551 = new class295(26, true, class147.field2141);
            class130.field1948 = 91;
            class40.method287(0, true);
            class105.method665(0);
        } else {
            if (arg0) {
                field294 = 12;
            }
            class96.field1433 = new class295(30, true, class147.field2141);
            class130.field1948 = 100;
            class40.method287(0, true);
            class105.method665(0);
            class153.field2240 = -1;
            class171.field2634 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lii;III)V", line = 340)
    private final void method143(class221 arg0, int arg1, int arg2, int arg3) {
        field299++;
        if (arg2 == arg3) {
            this.field295 = class253.method1771(arg0.method1497(3610), true);
        } else if (arg3 == 2) {
            this.field283 = arg0.method1509(true);
        } else if (arg3 == 3) {
            this.field283 = arg0.method1524((byte) 44);
            if (this.field283 == 65535) {
                this.field283 = -1;
            }
        } else if (arg3 == 5) {
            this.field293 = false;
        } else if (arg3 == 7) {
            this.field298 = class253.method1771(arg0.method1497(3610), true);
        } else if (arg3 == 8) {
            class210.field3337 = arg1;
        } else if (arg3 == 9) {
            this.field301 = arg0.method1524((byte) 75);
        } else if (arg3 == 10) {
            this.field291 = false;
        } else if (arg3 == 11) {
            this.field286 = arg0.method1509(true);
        } else if (arg3 == 12) {
            this.field297 = true;
        } else if (arg3 == 13) {
            this.field282 = arg0.method1497(3610);
        } else if (arg3 == 14) {
            this.field292 = arg0.method1509(true);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILma;)Lma;", line = 407)
    public static final class5 method144(int arg0, class5 arg1) {
        int var2 = class190.method1244(arg1, 1);
        field288++;
        return arg0 == var2 ? class10.field152 : class46.field704.field397[var2].method49(class204.field3264, class219.field3556, true);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILii;I)V", line = 423)
    public final void method145(int arg0, class221 arg1, int arg2) {
        field290++;
        while (true) {
            int var4 = arg1.method1509(true);
            if (var4 == 0) {
                if (arg0 != 27415) {
                    field287 = 51;
                }
                return;
            }
            this.method143(arg1, arg2, 1, var4);
        }
    }
}
