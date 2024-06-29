import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class100 {

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field1395 = -1;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public int field1398 = 8;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public int field1393 = 0;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field1400 = 128;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public int field1403 = 16;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field1407 = -1;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
    public boolean field1399 = true;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
    public boolean field1402 = true;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Z")
    public boolean field1409 = false;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public int field1408 = 1190717;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public int field1410 = -1;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1394 = 0;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[[I")
    public static int[][] field1404 = new int[128][128];

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field1411 = 0;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lcb;")
    public static class386 field1396 = new class386();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V", line = 6)
    public final void method680(byte arg0, int arg1) {
        this.field1398 = arg1 | this.field1398 << 8;
        int var3 = -17 / ((arg0 - 29) / 56);
        field1392++;
        if (this.field1395 == -1) {
            this.field1395 = this.field1410;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 21)
    public static final void method681(boolean arg0) {
        field1391++;
        class350 var1 = null;
        if (!arg0) {
            return;
        }
        try {
            class429 var2 = class76.field1085.method243(0);
            while (var2.field6308 == 0) {
                class144.method918(1L, arg0);
            }
            if (var2.field6308 == 1) {
                var1 = (class350) var2.field6309;
                byte[] var3 = new byte[(int) var1.method2307((byte) -45)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2308(var3, var3.length - var4, -5921, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class212.method1262(!arg0, new class228(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2304(-17644);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIILnj;)V", line = 75)
    private final void method682(byte arg0, int arg1, int arg2, class228 arg3) {
        if (arg1 == 1) {
            this.field1393 = class228.method1354((byte) -101, arg3.method1333((byte) -115));
        } else if (arg1 == 2) {
            this.field1410 = arg3.method1348(-96);
        } else if (arg1 == 3) {
            this.field1410 = arg3.method1343(255);
            if (this.field1410 == 65535) {
                this.field1410 = -1;
            }
        } else if (arg1 == 5) {
            this.field1402 = false;
        } else if (arg1 == 7) {
            this.field1407 = class228.method1354((byte) 37, arg3.method1333((byte) -77));
        } else if (arg1 == 8) {
            class89.field1250 = arg2;
        } else if (arg1 == 9) {
            this.field1400 = arg3.method1343(255);
        } else if (arg1 == 10) {
            this.field1399 = false;
        } else if (arg1 == 11) {
            this.field1398 = arg3.method1348(-93);
        } else if (arg1 == 12) {
            this.field1409 = true;
        } else if (arg1 == 13) {
            this.field1408 = arg3.method1333((byte) -118);
        } else if (arg1 == 14) {
            this.field1403 = arg3.method1348(-114);
        } else if (arg1 == 15) {
            this.field1395 = arg3.method1343(arg0 + 133);
            if (this.field1395 == 65535) {
                this.field1395 = -1;
            }
        }
        field1401++;
        if (arg0 != 122) {
            this.field1398 = 11;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V", line = 166)
    public static void method683(boolean arg0) {
        field1404 = null;
        field1396 = null;
        if (!arg0) {
            field1396 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZII)V", line = 180)
    public static final void method684(boolean arg0, int arg1, int arg2) {
        field1405++;
        if (arg1 == 0) {
            class61.field807 = class405.method2611(10402, class202.field2708, class328.field4780, class76.field1085, class115.field1611 * 2, arg1);
        } else {
            if (arg0) {
                class61.field807 = class405.method2611(10402, class202.field2708, class328.field4780, class76.field1085, 0, 0);
                class61.field807.method1686(0);
                class313 var3 = class271.method1868(76, class377.field5493, 0, class291.field4169);
                class273 var4 = class61.field807.method1683(var3, class441.method2779(class362.field5227, class377.field5493, 0), true);
                class89.method629(0, true, class372.field5413, var4);
                class61.field807.method1748();
                class329.method2189((byte) -57);
                class61.field807.method2617(1);
            }
            try {
                class61.field807 = class405.method2611(10402, class202.field2708, class328.field4780, class76.field1085, class115.field1611 * 2, arg1);
            } catch (Throwable var7) {
                arg1 = 0;
                class61.field807 = class405.method2611(10402, class202.field2708, class328.field4780, class76.field1085, 0, 0);
            }
        }
        if (class61.field807.method1695()) {
            class139 var5 = class61.field807.method1693(134217728);
            class61.field807.method1780(var5);
        }
        class373.field5422 = arg1;
        class145.method925(2);
        if (!class61.field807.method1625()) {
            class352.field5096 = 1;
        }
        class61.field807.method1682(class352.field5096);
        class61.field807.method1649(0);
        class199.field2644 = class61.field807.method1645();
        class227.field2978 = class61.field807.method1645();
        int var6 = (int) ((double) class192.field2574 * 34.46D);
        if (class61.field807.method1728()) {
            var6 += 128;
        }
        class61.field807.method1764(50, var6);
        class61.field807.method1698(!class411.field6069);
        if (arg2 < 50) {
            method683(false);
        }
        if (class61.field807.method1730()) {
            class42.method300((byte) -79, class324.field4753);
        }
        class317.field4643 = !class11.method79((byte) 125);
        class106.method715(class61.field807, class364.field5262 >> 3, class192.field2574 >> 3, (byte) 0);
        class245.method1484((byte) 64);
        class68.field874 = false;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILnj;B)V", line = 274)
    public final void method685(int arg0, class228 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method1348(-103);
            if (var4 == 0) {
                if (arg2 <= 16) {
                    this.method680((byte) -102, 64);
                }
                field1406++;
                return;
            }
            this.method682((byte) 122, var4, arg0, arg1);
        }
    }
}
