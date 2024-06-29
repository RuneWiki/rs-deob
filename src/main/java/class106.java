import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class106 extends class190 {

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Z")
    public boolean field1442 = false;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Z")
    private boolean field1443 = false;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    private int field1470 = 0;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "Lrf;")
    public class48 field1468;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "J")
    private long field1465;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Le;")
    public class313 field1449;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Ltj;")
    public class108 field1458;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "Lwd;")
    public class149 field1474;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "[Z")
    public static boolean[] field1460 = new boolean[8];

    @OriginalMember(owner = "client!me", name = "O", descriptor = "Z")
    public static boolean field1472 = true;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "[Lhd;")
    public static class443[] field1440;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IJIZLuo;)V")
    public final void method751(int arg0, long arg1, int arg2, boolean arg3, class345 arg4) {
        if (this.field1442) {
            arg3 = false;
        } else if (this.field1458.field1544 > class178.field2456) {
            arg3 = false;
        } else if (class39.field571[class178.field2456] < class370.field5201) {
            arg3 = false;
        } else if (this.field1443) {
            arg3 = false;
        } else if (this.field1458.field1515 != -1) {
            int var7 = (int) (arg1 - this.field1465);
            if (this.field1458.field1505 || var7 <= this.field1458.field1515) {
                var7 %= this.field1458.field1515;
            } else {
                arg3 = false;
            }
            if (!this.field1458.field1523 && var7 < this.field1458.field1526) {
                arg3 = false;
            }
            if (this.field1458.field1523 && this.field1458.field1526 <= var7) {
                arg3 = false;
            }
        }
        field1475++;
        if (arg3) {
            this.field1470 += (int) ((Math.random() * (double) (this.field1458.field1528 - this.field1458.field1498) + (double) this.field1458.field1498) * (double) arg2);
            if (this.field1470 > 63) {
                int var8 = this.field1470 >> 6;
                this.field1470 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field1458.field1546 <= 0 && this.field1458.field1510 <= 0) {
                        var10 = this.field1476;
                        var11 = this.field1467;
                        var12 = this.field1462;
                    } else {
                        int var13 = this.field1444 + (int) (Math.random() * (double) this.field1463);
                        int var14 = var13 & 0x3FFF;
                        int var15 = class133.field1913[var14];
                        int var16 = class133.field1908[var14];
                        int var17 = this.field1441 + ((int) (Math.random() * (double) this.field1457));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class133.field1913[var18];
                        var10 = var16 * var19 >> 15;
                        int var20 = class133.field1908[var18];
                        var11 = var20 * -1;
                        var12 = var15 * var19 >> 15;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if ((var21 + var22) > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field1459 * var22 + this.field1477 * var23 + this.field1446 * var21 >> 16;
                    int var25 = this.field1461 * var21 + this.field1469 * var23 + this.field1456 * var22 >> 16;
                    int var26 = this.field1471 * var21 - (-(this.field1464 * var22) - this.field1466 * var23) >> 16;
                    int var27 = this.field1458.field1524 + (int) ((double) (this.field1458.field1553 - this.field1458.field1524) * Math.random());
                    int var28 = (int) (Math.random() * (double) (this.field1458.field1538 - this.field1458.field1508)) + this.field1458.field1508;
                    int var29 = (int) ((double) (this.field1458.field1499 - this.field1458.field1520) * Math.random()) + this.field1458.field1520;
                    int var30;
                    if (this.field1458.field1533) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field1458.field1486 * var31 + (double) this.field1458.field1531) << 24 | (int) ((double) this.field1458.field1534 * var31 + (double) this.field1458.field1497) | (int) ((double) this.field1458.field1542 * var31 + (double) this.field1458.field1513) << 16 | (int) ((double) this.field1458.field1506 * var31 + (double) this.field1458.field1509) << 8;
                    } else {
                        var30 = (int) ((double) this.field1458.field1497 + (double) this.field1458.field1534 * Math.random()) | (int) ((double) this.field1458.field1513 + (double) this.field1458.field1542 * Math.random()) << 16 | (int) ((double) this.field1458.field1506 * Math.random() + (double) this.field1458.field1509) << 8 | (int) ((double) this.field1458.field1531 + (double) this.field1458.field1486 * Math.random()) << 24;
                    }
                    int var33 = this.field1458.field1554;
                    if (!arg4.method124() && !this.field1458.field1529) {
                        var33 = -1;
                    }
                    if (class446.field6256 == class260.field3645) {
                        new class443(this, var24, var25, var26, var10, var11, var12, var27, var28, var30, var29, var33, this.field1458.field1541);
                    } else {
                        class443 var34 = field1440[class446.field6256];
                        class446.field6256 = class446.field6256 + 1 & 0x3FF;
                        var34.method2775(this, var24, var25, var26, var10, var11, var12, var27, var28, var30, var29, var33, this.field1458.field1541);
                    }
                }
            }
        }
        this.field1445 = 0;
        for (class443 var36 = (class443) this.field1474.method1005(-1); var36 != null; var36 = (class443) this.field1474.method1012((byte) 75)) {
            var36.method2771(arg1, arg2);
            this.field1445++;
        }
        if (arg0 != -2025367384) {
            this.method756(89);
        }
        class274.field3820 += this.field1445;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([SI)[S")
    public static final short[] method752(short[] arg0, int arg1) {
        field1452++;
        int var2 = -105 / ((arg1 - 11) / 54);
        if (arg0 == null) {
            return null;
        } else {
            short[] var3 = new short[arg0.length];
            class36.method345(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
    public static final void method753(int arg0, int arg1) {
        if (arg1 >= -55) {
            field1473 = 6;
        }
        class131 var2 = class366.field5155;
        synchronized (class366.field5155) {
            class366.field5155.method901(arg0, 12223);
        }
        field1455++;
        class131 var3 = class99.field1365;
        synchronized (class99.field1365) {
            class99.field1365.method901(arg0, 12223);
        }
        class416 var4 = class63.field867;
        synchronized (class63.field867) {
            class63.field867.method2606(0, arg0);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(JB)V")
    public final void method754(long arg0, byte arg1) {
        for (class443 var4 = (class443) this.field1474.method1005(-1); var4 != null; var4 = (class443) this.field1474.method1012((byte) -70)) {
            var4.method2774(arg0);
        }
        if (arg1 != -126) {
            this.field1449 = null;
        }
        field1450++;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public static void method755(byte arg0) {
        field1460 = null;
        field1440 = null;
        if (arg0 != 21) {
            method755((byte) -69);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Luo;Lrf;Le;J)V")
    public class106(class345 arg0, class48 arg1, class313 arg2, long arg3) {
        this.field1468 = arg1;
        this.field1465 = arg3;
        this.field1449 = arg2;
        this.field1458 = class64.method484(this.field1468.field664, (byte) -66);
        if (!arg0.method124() && this.field1458.field1550 != -1) {
            this.field1458 = class64.method484(this.field1458.field1550, (byte) -66);
        }
        this.field1474 = new class149();
        this.field1470 = (int) ((double) this.field1470 + Math.random() * 64.0D);
        this.method756(-1);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public final void method756(int arg0) {
        this.field1471 = this.field1468.field677;
        field1448++;
        this.field1456 = this.field1468.field670;
        this.field1477 = this.field1468.field680;
        this.field1446 = this.field1468.field676;
        this.field1461 = this.field1468.field673;
        this.field1466 = this.field1468.field667;
        this.field1469 = this.field1468.field672;
        this.field1464 = this.field1468.field669;
        this.field1459 = this.field1468.field674;
        if (this.field1459 == this.field1446 && this.field1477 == this.field1459 && this.field1461 == this.field1456 && this.field1469 == this.field1456 && this.field1471 == this.field1464 && this.field1466 == this.field1464) {
            this.field1443 = true;
            return;
        }
        this.field1443 = false;
        int var2 = (this.field1459 + this.field1446 + this.field1477) / 3;
        int var3 = (this.field1461 + this.field1456 + this.field1469) / 3;
        if (arg0 != -1) {
            this.method754(2L, (byte) 68);
        }
        int var4 = (this.field1471 - (-this.field1466 - this.field1464)) / 3;
        if (this.field1454 == var2 && this.field1451 == var3 && this.field1453 == var4) {
            return;
        }
        this.field1453 = var4;
        this.field1451 = var3;
        this.field1454 = var2;
        int var5 = this.field1459 - this.field1446;
        int var6 = this.field1456 - this.field1461;
        int var7 = this.field1464 - this.field1471;
        int var8 = this.field1477 - this.field1446;
        int var9 = this.field1469 - this.field1461;
        int var10 = this.field1466 - this.field1471;
        this.field1467 = var7 * var8 - (var5 * var10);
        this.field1462 = var5 * var9 - (var6 * var8);
        this.field1476 = var6 * var10 - (var7 * var9);
        while (this.field1476 > 32767 || this.field1467 > 32767 || this.field1462 > 32767 || this.field1476 < -32767 || this.field1467 < -32767 || this.field1462 < -32767) {
            this.field1462 >>= 0x1;
            this.field1476 >>= 0x1;
            this.field1467 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field1467 * this.field1467 + this.field1476 * this.field1476 + this.field1462 * this.field1462));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field1467 = this.field1467 * 32767 / var11;
        this.field1476 = this.field1476 * 32767 / var11;
        this.field1462 = this.field1462 * 32767 / var11;
        if (this.field1458.field1546 <= 0 && this.field1458.field1510 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field1462, (double) this.field1476) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field1467, Math.sqrt((double) (this.field1476 * this.field1476 + this.field1462 * this.field1462))) * 2607.5945876176133D);
        this.field1463 = this.field1458.field1546 - this.field1458.field1539;
        this.field1457 = this.field1458.field1510 - this.field1458.field1536;
        this.field1444 = this.field1458.field1539 + var12 - (this.field1463 >> 1);
        this.field1441 = var13 + this.field1458.field1536 - (this.field1457 >> 1);
    }
}
