import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class69 extends class50 {

    @OriginalMember(owner = "client!ka", name = "Sb", descriptor = "Z")
    private boolean field1513 = false;

    @OriginalMember(owner = "client!ka", name = "Hb", descriptor = "I")
    private int field1502 = 0;

    @OriginalMember(owner = "client!ka", name = "Yb", descriptor = "I")
    private int field1519 = 0;

    @OriginalMember(owner = "client!ka", name = "ac", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client!ka", name = "Mb", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!ka", name = "wb", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!ka", name = "zb", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client!ka", name = "Jb", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client!ka", name = "Db", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!ka", name = "Ab", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!ka", name = "Bb", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!ka", name = "hc", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!ka", name = "Wb", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!ka", name = "Xb", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client!ka", name = "ic", descriptor = "Le;")
    private class29 field1529;

    @OriginalMember(owner = "client!ka", name = "sb", descriptor = "Lrd;")
    public static class114 field1487 = class84.method656("logo", (byte) 120);

    @OriginalMember(owner = "client!ka", name = "Kb", descriptor = "I")
    public static int field1505 = 0;

    @OriginalMember(owner = "client!ka", name = "Ub", descriptor = "[I")
    public static int[] field1515 = new int[32];

    @OriginalMember(owner = "client!ka", name = "Rb", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!ka", name = "gc", descriptor = "Lrd;")
    private static class114 field1527;

    @OriginalMember(owner = "client!ka", name = "ec", descriptor = "Lrd;")
    public static class114 field1525;

    @OriginalMember(owner = "client!ka", name = "cc", descriptor = "Lrd;")
    public static class114 field1523;

    @OriginalMember(owner = "client!ka", name = "tb", descriptor = "D")
    private double field1488;

    @OriginalMember(owner = "client!ka", name = "vb", descriptor = "D")
    public double field1490;

    @OriginalMember(owner = "client!ka", name = "Cb", descriptor = "D")
    private double field1497;

    @OriginalMember(owner = "client!ka", name = "Eb", descriptor = "D")
    public double field1499;

    @OriginalMember(owner = "client!ka", name = "Gb", descriptor = "D")
    private double field1501;

    @OriginalMember(owner = "client!ka", name = "Lb", descriptor = "D")
    private double field1506;

    @OriginalMember(owner = "client!ka", name = "Nb", descriptor = "D")
    private double field1508;

    @OriginalMember(owner = "client!ka", name = "Ob", descriptor = "D")
    public double field1509;

    @OriginalMember(owner = "client!ka", name = "rb", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ka", name = "ub", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!ka", name = "xb", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ka", name = "yb", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ka", name = "Ib", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!ka", name = "Pb", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!ka", name = "Qb", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ka", name = "bc", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!ka", name = "dc", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ka", name = "fc", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ka", name = "Vb", descriptor = "Lpb;")
    public static class100 field1516;

    @OriginalMember(owner = "client!ka", name = "Tb", descriptor = "Ld;")
    public static class22 field1514;

    @OriginalMember(owner = "client!ka", name = "Zb", descriptor = "Ljd;")
    public static class66 field1520;

    @OriginalMember(owner = "client!ka", name = "Fb", descriptor = "[I")
    public static int[] field1500;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
    public static void method546(byte arg0) {
        field1514 = null;
        field1523 = null;
        field1520 = null;
        field1515 = null;
        field1487 = null;
        field1516 = null;
        field1525 = null;
        field1500 = null;
        if (arg0 == -128) {
            field1527 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
    public final void method547(int arg0, int arg1) {
        this.field1490 += (double) arg1 * this.field1501;
        this.field1509 += (double) arg1 * this.field1488;
        this.field1513 = true;
        this.field1499 += this.field1508 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1497;
        field1492++;
        this.field1497 += (double) arg1 * this.field1508;
        this.field1489 = (int) (Math.atan2(this.field1501, this.field1488) * 325.949D) + 1024 & 0x7FF;
        this.field1503 = (int) (Math.atan2(this.field1497, this.field1506) * 325.949D) & 0x7FF;
        if (this.field1529 != null) {
            this.field1502 += arg1;
            label30: while (true) {
                do {
                    do {
                        if (this.field1502 <= this.field1529.field605[this.field1519]) {
                            break label30;
                        }
                        this.field1502 -= this.field1529.field605[this.field1519];
                        this.field1519++;
                    } while (this.field1519 < this.field1529.field607.length);
                    this.field1519 -= this.field1529.field602;
                } while (this.field1519 >= 0 && this.field1529.field607.length > this.field1519);
                this.field1519 = 0;
            }
        }
        if (arg0 != 20) {
            this.method550(-51, 68, 110, (byte) -44, 127);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)Z")
    public static final boolean method548(int arg0, int arg1) {
        if (arg0 < 14) {
            return false;
        }
        field1493++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILmc;)V")
    public static final void method549(int arg0, class83 arg1) {
        int var2 = 18 / ((81 - arg0) / 44);
        arg1.field1858 = false;
        field1511++;
        if (arg1.field1855 != null) {
            arg1.field1855.field548 = 0;
        }
        for (class83 var3 = arg1.method42(); var3 != null; var3 = arg1.method32()) {
            method549(-22, var3);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIBI)V")
    public final void method550(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1522++;
        if (!this.field1513) {
            double var6 = (double) (arg2 - this.field1494);
            double var8 = (double) (arg1 - this.field1518);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1509 = (double) this.field1521 * var8 / var10 + (double) this.field1518;
            this.field1499 = this.field1495;
            this.field1490 = (double) this.field1521 * var6 / var10 + (double) this.field1494;
        }
        double var12 = (double) (this.field1528 + 1 - arg4);
        this.field1501 = ((double) arg2 - this.field1490) / var12;
        this.field1488 = ((double) arg1 - this.field1509) / var12;
        int var14 = -122 % ((arg3 - 44) / 36);
        this.field1506 = Math.sqrt(this.field1501 * this.field1501 + this.field1488 * this.field1488);
        if (!this.field1513) {
            this.field1497 = -this.field1506 * Math.tan((double) this.field1504 * 0.02454369D);
        }
        this.field1508 = ((double) arg0 - this.field1499 - this.field1497 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)Lue;")
    public final class133 method67(byte arg0) {
        field1526++;
        class62 var2 = class74.method606(true, this.field1498);
        if (arg0 > -9) {
            this.method550(99, 8, -51, (byte) 49, -14);
        }
        class133 var3 = var2.method511(-1565796086, this.field1519);
        if (var3 == null) {
            return null;
        } else {
            var3.method1068(this.field1503);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnd;I)V")
    public static final void method551(class90 arg0, int arg1) {
        field1510++;
        int var2 = arg0.field2049;
        if (var2 >= 1 && var2 <= 100 || !(var2 < 701 || var2 > 800)) {
            if (class73.field1630 == 0) {
                if (var2 == 1) {
                    arg0.field2025 = class48.field1001;
                    arg0.field2066 = 0;
                    return;
                }
                if (var2 == 2) {
                    arg0.field2066 = 0;
                    arg0.field2025 = class67.field1452;
                    return;
                }
            }
            if (class73.field1630 == 1) {
                if (var2 == 1) {
                    arg0.field2066 = 0;
                    arg0.field2025 = class22.field423;
                    return;
                }
                if (var2 == 2) {
                    arg0.field2025 = class67.field1446;
                    arg0.field2066 = 0;
                    return;
                }
                if (var2 == 3) {
                    arg0.field2025 = class102.field2369;
                    arg0.field2066 = 0;
                    return;
                }
            }
            if (var2 <= 700) {
                var2--;
            } else {
                var2 -= 601;
            }
            int var3 = class128.field3058;
            if (class73.field1630 != 2) {
                var3 = 0;
            }
            if (var2 >= var3) {
                arg0.field2066 = 0;
                arg0.field2025 = class72.field1610;
            } else {
                arg0.field2025 = class5.field64[var2];
                arg0.field2066 = 1;
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class128.field3058;
            if (class73.field1630 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field2025 = class72.field1610;
                arg0.field2066 = 0;
            } else {
                if (class34.field674[var2] == 0) {
                    arg0.field2025 = class101.method786((byte) 125, new class114[] { class102.field2363, class18.field336 });
                } else if (class34.field674[var2] < 5000) {
                    if (class34.field674[var2] == class117.field2741) {
                        arg0.field2025 = class101.method786((byte) 125, new class114[] { class85.field1885, class78.field1777, class14.method113(class34.field674[var2], -31766) });
                    } else {
                        arg0.field2025 = class101.method786((byte) 126, new class114[] { class3.field27, class78.field1777, class14.method113(class34.field674[var2], -31766) });
                    }
                } else if (class34.field674[var2] == class117.field2741) {
                    arg0.field2025 = class101.method786((byte) 126, new class114[] { class85.field1885, class48.field1003, class14.method113(class34.field674[var2] - 5000, -31766) });
                } else {
                    arg0.field2025 = class101.method786((byte) 127, new class114[] { class3.field27, class48.field1003, class14.method113(class34.field674[var2] - 5000, -31766) });
                }
                arg0.field2066 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class128.field3058;
            if (class73.field1630 != 2) {
                var5 = 0;
            }
            arg0.field2017 = var5 * 15 + 20;
            if (arg0.field2044 >= arg0.field2017) {
                arg0.field2017 = arg0.field2044 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class73.field1630 == 0) {
                arg0.field2025 = class31.field625;
                arg0.field2066 = 0;
            } else if (var2 == 1 && class73.field1630 == 0) {
                arg0.field2025 = class67.field1452;
                arg0.field2066 = 0;
            } else {
                int var6 = class89.field1986;
                if (class73.field1630 == 0) {
                    var6 = 0;
                }
                if (var6 <= var2) {
                    arg0.field2066 = 0;
                    arg0.field2025 = class72.field1610;
                } else {
                    arg0.field2025 = class42.method295(arg1 ^ 0x13A3, class84.field1874[var2]).method863(-100);
                    arg0.field2066 = 1;
                }
            }
        } else if (var2 == 503) {
            arg0.field2017 = class89.field1986 * 15 + 20;
            if (arg0.field2017 <= arg0.field2044) {
                arg0.field2017 = arg0.field2044 + 1;
            }
        } else {
            if (arg1 != -29798) {
                field1523 = null;
            }
            if (var2 == 324) {
                if (class32.field661 == -1) {
                    class73.field1653 = arg0.field2070;
                    class32.field661 = arg0.field2005;
                }
                if (class116.field2708.field2161) {
                    arg0.field2005 = class32.field661;
                } else {
                    arg0.field2005 = class73.field1653;
                }
            } else if (var2 == 325) {
                if (class32.field661 == -1) {
                    class73.field1653 = arg0.field2070;
                    class32.field661 = arg0.field2005;
                }
                if (class116.field2708.field2161) {
                    arg0.field2005 = class73.field1653;
                } else {
                    arg0.field2005 = class32.field661;
                }
            } else if (var2 == 327) {
                arg0.field2117 = 150;
                arg0.field2127 = (int) (Math.sin((double) class20.field370 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2123 = 5;
                arg0.field2067 = 0;
            } else if (var2 == 328) {
                arg0.field2117 = 150;
                arg0.field2127 = (int) (Math.sin((double) class20.field370 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2123 = 5;
                arg0.field2067 = 1;
            } else if (var2 == 600) {
                arg0.field2025 = class101.method786((byte) 126, new class114[] { class72.field1617, class88.field1957 });
            } else if (var2 == 620) {
                if (class58.field1205 < 1) {
                    arg0.field2025 = class72.field1610;
                } else if (class20.field364) {
                    arg0.field2025 = class62.field1333;
                    arg0.field2004 = 16711680;
                } else {
                    arg0.field2004 = 16777215;
                    arg0.field2025 = class121.field2818;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
    public static final void method552(byte arg0) {
        field1486++;
        if (class34.field678) {
            class34.field678 = false;
            class60.method484((byte) 126);
            class140.field3335 = true;
            class103.field2410 = true;
            class24.field466 = true;
            class24.field460 = true;
        }
        class117.method903(-110);
        if (class116.field2714 && class14.field304 == 1) {
            class24.field460 = true;
        }
        if (class123.field2905 != -1) {
            boolean var1 = client.method150(class123.field2905, 0);
            if (var1) {
                class24.field460 = true;
            }
        }
        if (class141.field3374 == 2) {
            class24.field460 = true;
        }
        if (class14.field312 == 2) {
            class24.field460 = true;
        }
        if (class24.field460) {
            class24.field460 = false;
            class111.method844(9236);
        }
        if (class123.field2899 == -1) {
            class142.field3379.field2013 = class85.field1888 - class52.field1114 - 77;
            if (class100.field2289 > 17 && class100.field2289 < 560 && class75.field1741 > 332) {
                class88.method668(class85.field1888, 77, 0, class75.field1741 - 357, -1, -97, class100.field2289 - 17, class142.field3379, 463);
            }
            int var2 = class85.field1888 - class142.field3379.field2013 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (class85.field1888 - 77 < var2) {
                var2 = class85.field1888 - 77;
            }
            if (class52.field1114 != var2) {
                class140.field3335 = true;
                class52.field1114 = var2;
            }
        }
        if (class123.field2899 == -1 && class142.field3382 == 3) {
            class142.field3379.field2013 = class96.field2206;
            int var3 = class26.field543 * 14 + 7;
            if (class100.field2289 > 17 && class100.field2289 < 560 && class75.field1741 > 332) {
                class88.method668(var3, 77, 0, class75.field1741 - 357, -1, -122, class100.field2289 - 17, class142.field3379, 463);
            }
            int var4 = class142.field3379.field2013;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (class96.field2206 != var4) {
                class140.field3335 = true;
                class96.field2206 = var4;
            }
        }
        if (class123.field2899 != -1) {
            boolean var5 = client.method150(class123.field2899, arg0 - 92);
            if (var5) {
                class140.field3335 = true;
            }
        }
        if (class141.field3374 == 3) {
            class140.field3335 = true;
        }
        if (class14.field312 == 3) {
            class140.field3335 = true;
        }
        if (class60.field1250 != null) {
            class140.field3335 = true;
        }
        if (class116.field2714 && class14.field304 == 2) {
            class140.field3335 = true;
        }
        if (class140.field3335) {
            class140.field3335 = false;
            class110.method838(false);
        }
        if (arg0 != 92) {
            field1514 = null;
        }
        class102.method791(false);
        if (class39.field822 != -1) {
            class103.field2410 = true;
        }
        if (class103.field2410) {
            if (class39.field822 != -1 && class39.field822 == class102.field2351) {
                class120.field2806++;
                class39.field822 = -1;
                class61.field1303.method1054(8, 148);
                class61.field1303.method478((byte) -34, class102.field2351);
            }
            class61.field1302 = true;
            class103.field2410 = false;
            class24.method173((byte) 123, class102.field2351, class123.field2906, class20.field370 % 20 < 10 ? -1 : class39.field822, class123.field2905 == -1);
        }
        if (class24.field466) {
            class24.field466 = false;
            class61.field1302 = true;
            class130.method1047(class130.field3149, arg0 - 51, class12.field253, class5.field54, class99.field2255);
        }
        class145.method1151(class20.field346, class7.field103.field712, class7.field103.field756, 84, class135.field3289);
        class135.field3289 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1521 = arg8;
        this.field1507 = arg9;
        this.field1491 = arg5;
        this.field1494 = arg2;
        this.field1504 = arg7;
        this.field1498 = arg0;
        this.field1495 = arg4;
        this.field1513 = false;
        this.field1496 = arg10;
        this.field1528 = arg6;
        this.field1517 = arg1;
        this.field1518 = arg3;
        int var12 = class74.method606(true, this.field1498).field1332;
        if (var12 == -1) {
            this.field1529 = null;
        } else {
            this.field1529 = class12.method97(var12, false);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1515[var1] = var0 - 1;
            var0 += var0;
        }
        field1527 = class84.method656("Please contact customer support)3", (byte) 122);
        field1525 = field1527;
        field1523 = class84.method656("overlay_multiway", (byte) 123);
    }
}
