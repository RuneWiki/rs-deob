import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class112 {

    @OriginalMember(owner = "client!qha", name = "s", descriptor = "I")
    private int field1316 = 0;

    @OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "[Lme;")
    public class206[] field1303;

    @OriginalMember(owner = "client!qha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1318 = new String[] { method982(method981("Cew\r\u0003\u001a")), method982(method981("Zz%G")), method982(method981("XlqW.WbdB")), method982(method981("XlqD*")), method982(method981("VhbB/^~")), method982(method981("Az%G")), method982(method981("Cew\r\u0004\u001a")), method982(method981("XlqG>")), method982(method981("XluO/P")), method982(method981("ZxpE+Sc")), method982(method981("XlqN/An")), method982(method981("I#8\r;")), method982(method981("Cew\r\u0005\u001a")), method982(method981("\\xzO")), method982(method981("Cew\r\u000b\u001a")), method982(method981("Cew\r\n\u001a")), method982(method981("Cew\r\u0002\u001a")), method982(method981("Cew\r\u000e\u001a")), method982(method981("Cew\r\u0007\u001a")), method982(method981("Cew\r\u000f\u001a")), method982(method981("Cew\r\r\u001a")), method982(method981("Cew\r\u0001\u001a")), method982(method981("Cew\r\f\u001a")), method982(method981("Cew\r\u0000\u001a")), method982(method981("Cew\rz[c\u007fWx\u001a")) };

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "Lef;")
    public static class513 field1301 = new class513();

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!qha", name = "t", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!qha", name = "i", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!qha", name = "q", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!qha", name = "u", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!qha", name = "l", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!qha", name = "m", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!qha", name = "h", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!qha", name = "j", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!qha", name = "k", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!qha", name = "n", descriptor = "J")
    private long field1305;

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "Lme;")
    private class206 field1313;

    @OriginalMember(owner = "client!qha", name = "r", descriptor = "Lme;")
    private class206 field1315;

    @OriginalMember(owner = "client!qha", name = "p", descriptor = "Lla;")
    public static class476 field1317;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(BJLme;)V")
    public final void method968(byte arg0, long arg1, class206 arg2) {
        try {
            if (arg2.field3179 != null) {
                arg2.method1824(1);
            }
            field1308++;
            if (arg0 != -111) {
                field1301 = null;
            }
            class206 var5 = this.field1303[(int) (arg1 & (long) (this.field1306 - 1))];
            arg2.field3179 = var5.field3179;
            arg2.field3180 = var5;
            arg2.field3179.field3180 = arg2;
            arg2.field3177 = arg1;
            arg2.field3180.field3179 = arg2;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1318[12] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1318[13] : field1318[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)Lme;")
    public final class206 method969(int arg0) {
        try {
            field1300++;
            if (this.field1313 == null) {
                return null;
            }
            class206 var2 = this.field1303[(int) ((long) (this.field1306 - 1) & this.field1305)];
            while (this.field1313 != var2) {
                if (this.field1305 == this.field1313.field3177) {
                    class206 var3 = this.field1313;
                    this.field1313 = this.field1313.field3180;
                    return var3;
                }
                this.field1313 = this.field1313.field3180;
            }
            this.field1313 = null;
            if (arg0 > -15) {
                this.method970(91);
            }
            return null;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1318[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V")
    public final void method970(int arg0) {
        try {
            if (arg0 >= -89) {
                field1301 = null;
            }
            field1311++;
            for (int var2 = 0; var2 < this.field1306; var2++) {
                class206 var3 = this.field1303[var2];
                while (true) {
                    class206 var4 = var3.field3180;
                    if (var3 == var4) {
                        break;
                    }
                    var4.method1824(1);
                }
            }
            this.field1315 = null;
            this.field1313 = null;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1318[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)Lme;")
    public final class206 method971(int arg0) {
        try {
            field1310++;
            this.field1316 = 0;
            if (arg0 != 347) {
                field1301 = null;
            }
            return this.method973(true);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1318[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(BI)V")
    public static final void method972(byte arg0, int arg1) {
        try {
            field1297++;
            class313 var2 = class196.method1670((long) arg1, 17, -120);
            var2.method2635(true);
            if (arg0 != 23) {
                field1301 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1318[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(Z)Lme;")
    public final class206 method973(boolean arg0) {
        try {
            field1314++;
            if (this.field1316 > 0 && this.field1303[this.field1316 - 1] != this.field1315) {
                class206 var2 = this.field1315;
                this.field1315 = var2.field3180;
                return var2;
            } else if (arg0) {
                while (this.field1306 > this.field1316) {
                    class206 var3 = this.field1303[this.field1316++].field3180;
                    if (this.field1303[this.field1316 - 1] != var3) {
                        this.field1315 = var3.field3180;
                        return var3;
                    }
                }
                return null;
            } else {
                return null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1318[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I[Lme;)I")
    public final int method974(int arg0, class206[] arg1) {
        try {
            field1298++;
            int var3 = 0;
            for (int var4 = arg0; var4 < this.field1306; var4++) {
                class206 var5 = this.field1303[var4];
                for (class206 var6 = var5.field3180; var6 != var5; var6 = var6.field3180) {
                    arg1[var3++] = var6;
                }
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1318[18] + arg0 + ',' + (arg1 == null ? field1318[13] : field1318[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V")
    public static void method975(byte arg0) {
        try {
            if (arg0 != 8) {
                method978(-94);
            }
            field1301 = null;
            field1317 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1318[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "(I)I")
    public final int method976(int arg0) {
        try {
            if (arg0 <= 4) {
                this.field1313 = null;
            }
            field1309++;
            return this.field1306;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1318[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(JI)Lme;")
    public final class206 method977(long arg0, int arg1) {
        try {
            this.field1305 = arg0;
            field1312++;
            class206 var4 = this.field1303[(int) ((long) (this.field1306 - arg1) & arg0)];
            for (this.field1313 = var4.field3180; this.field1313 != var4; this.field1313 = this.field1313.field3180) {
                if (this.field1313.field3177 == arg0) {
                    class206 var5 = this.field1313;
                    this.field1313 = this.field1313.field3180;
                    return var5;
                }
            }
            this.field1313 = null;
            return null;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1318[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)I")
    public static final int method978(int arg0) {
        try {
            field1304++;
            if (class379.field5770 == 0) {
                class176.field2429.method1547(new class274(field1318[8]), 2);
                if (class176.field2429.method1548((byte) -121).method670(18366) != 100) {
                    return 1;
                }
                if (!((class274) class176.field2429.method1548((byte) -96)).method2266((byte) -124)) {
                    class43.field504.method1339((byte) -113);
                }
                class379.field5770 = 1;
            }
            if (class379.field5770 == 1) {
                class294.field4339 = class176.method1544((byte) -33);
                class176.field2425.method1547(new class262(class443.field6513), 2);
                class176.field2430.method1547(new class274(field1318[3]), 2);
                class176.field2431.method1547(new class274(field1318[7]), 2);
                class176.field2432.method1547(new class274(field1318[10]), 2);
                class176.field2433.method1547(new class274(field1318[5]), 2);
                class176.field2434.method1547(new class274(field1318[1]), arg0 + 2);
                class176.field2435.method1547(new class274(field1318[2]), arg0 ^ 0x2);
                class176.field2436.method1547(new class262(class426.field6273), 2);
                class176.field2437.method1547(new class262(class710.field10289), 2);
                class176.field2438.method1547(new class262(class669.field9714), 2);
                class176.field2439.method1547(new class262(class234.field3531), arg0 + 2);
                class176.field2440.method1547(new class262(class489.field7024), 2);
                class176.field2441.method1547(new class262(class137.field1631), 2);
                class176.field2442.method1547(new class262(class411.field6075), 2);
                class176.field2443.method1547(new class262(class604.field8851), arg0 ^ 0x2);
                class176.field2444.method1547(new class262(class122.field1440), 2);
                class176.field2445.method1547(new class262(class304.field4754), 2);
                class176.field2446.method1547(new class262(class85.field952), 2);
                class176.field2447.method1547(new class262(class729.field10586), 2);
                class176.field2448.method1547(new class262(class630.field9209), arg0 + 2);
                class176.field2449.method1547(new class262(class523.field7639), 2);
                class176.field2450.method1547(new class568(class107.field1239, field1318[9]), 2);
                class176.field2451.method1547(new class262(class72.field794), 2);
                class176.field2452.method1547(new class262(class743.field10810), arg0 + 2);
                class176.field2453.method1547(new class262(class753.field10953), arg0 + 2);
                class176.field2454.method1547(new class74(class366.field5598, field1318[4]), 2);
                for (int var1 = 0; var1 < class294.field4339.length; var1++) {
                    if (class294.field4339[var1].method1548((byte) -98) == null) {
                        throw new RuntimeException();
                    }
                }
                int var2 = 0;
                class176[] var3 = class294.field4339;
                for (int var4 = 0; var4 < var3.length; var4++) {
                    class176 var5 = var3[var4];
                    int var6 = var5.method1541(1);
                    int var7 = var5.method1548((byte) -116).method670(18366);
                    var2 += var6 * var7 / 100;
                }
                class557.field8290 = var2;
                class379.field5770 = 2;
            }
            if (class294.field4339 == null) {
                return 100;
            }
            int var8 = 0;
            int var9 = arg0;
            boolean var10 = true;
            class176[] var11 = class294.field4339;
            for (int var12 = 0; var12 < var11.length; var12++) {
                class176 var13 = var11[var12];
                int var14 = var13.method1541(1);
                int var15 = var13.method1548((byte) -94).method670(18366);
                var8 += var14;
                var9 += var14 * var15 / 100;
                if (var15 < 100) {
                    var10 = false;
                }
            }
            if (var10) {
                if (!((class274) class176.field2432.method1548((byte) -102)).method2266((byte) -126)) {
                    class43.field504.method1328((byte) -9);
                }
                if (!((class274) class176.field2435.method1548((byte) -113)).method2266((byte) -100)) {
                    class204.field3168 = class43.field504.method1329(108);
                }
                class294.field4339 = null;
            }
            int var16 = var8 - class557.field8290;
            int var17 = var9 - class557.field8290;
            int var18 = var16 > 0 ? var17 * 100 / var16 : 100;
            if (!var10 && var18 > 99) {
                var18 = 99;
            }
            return var18;
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field1318[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(I)V")
    public class112(int arg0) {
        try {
            this.field1306 = arg0;
            this.field1303 = new class206[arg0];
            for (int var2 = 0; var2 < arg0; var2++) {
                class206 var3 = this.field1303[var2] = new class206();
                var3.field3180 = var3;
                var3.field3179 = var3;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1318[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)I")
    public final int method979(boolean arg0) {
        try {
            field1307++;
            int var2 = 0;
            if (arg0) {
                return -10;
            }
            for (int var3 = 0; var3 < this.field1306; var3++) {
                class206 var4 = this.field1303[var3];
                class206 var5 = var4.field3180;
                while (var4 != var5) {
                    var5 = var5.field3180;
                    var2++;
                }
            }
            return var2;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1318[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(BI)I")
    public static final int method980(byte arg0, int arg1) {
        try {
            if (arg0 < 20) {
                return -33;
            } else {
                field1302++;
                return arg1 & 0x7F;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1318[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method981(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method982(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
