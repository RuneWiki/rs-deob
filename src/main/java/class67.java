import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class67 extends class37 {

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    private int field1560 = 0;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    private int field1558 = 8;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    private int field1563 = 4;

    @OriginalMember(owner = "client!gg", name = "ib", descriptor = "I")
    private int field1569 = 81;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    private int field1556 = 1024;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    private int field1555 = 409;

    @OriginalMember(owner = "client!gg", name = "ob", descriptor = "I")
    private int field1575 = 204;

    @OriginalMember(owner = "client!gg", name = "nb", descriptor = "I")
    private int field1574 = 1024;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    public static int field1561 = 0;

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "Ldd;")
    private static class35 field1565 = class180.method1196((byte) 127, "Loaded update list");

    @OriginalMember(owner = "client!gg", name = "gb", descriptor = "[Ldd;")
    public static class35[] field1567 = new class35[200];

    @OriginalMember(owner = "client!gg", name = "kb", descriptor = "Ldd;")
    private static class35 field1571 = class180.method1196((byte) -83, "Connecting to update server");

    @OriginalMember(owner = "client!gg", name = "jb", descriptor = "Ldd;")
    private static class35 field1570 = class180.method1196((byte) -60, "Loaded title screen");

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "Ldd;")
    public static class35 field1562 = field1571;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "Ldd;")
    public static class35 field1553 = field1570;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "Ldd;")
    public static class35 field1564 = field1565;

    @OriginalMember(owner = "client!gg", name = "vb", descriptor = "I")
    public static int field1582 = 0;

    @OriginalMember(owner = "client!gg", name = "wb", descriptor = "J")
    public static volatile long field1583 = 0L;

    @OriginalMember(owner = "client!gg", name = "tb", descriptor = "[I")
    public static int[] field1580 = new int[32];

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!gg", name = "hb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!gg", name = "lb", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!gg", name = "mb", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!gg", name = "pb", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!gg", name = "qb", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!gg", name = "rb", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!gg", name = "ub", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!gg", name = "xb", descriptor = "[I")
    private int[] field1584;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "[[I")
    private int[][] field1559;

    @OriginalMember(owner = "client!gg", name = "sb", descriptor = "[[I")
    private int[][] field1579;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        ++field1554;
        this.method549(4096);
        if (arg0) {
            field1583 = 46L;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class67() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)I")
    public static final int method544(int arg0, byte arg1) {
        if (arg1 > -126) {
            method548(true);
        }
        ++field1566;
        return arg0 >> 17 & 7;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)I")
    public static final int method545(boolean arg0) {
        if (!arg0) {
            method544(2, (byte) 38);
        }
        ++field1578;
        return class17.field343++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field1581;
        if (arg1 != 1) {
            this.field1584 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field1574 = arg2.method256((byte) -78);
                                    }
                                } else {
                                    this.field1569 = arg2.method256((byte) -78);
                                }
                            } else {
                                this.field1560 = arg2.method256((byte) -78);
                            }
                        } else {
                            this.field1556 = arg2.method256((byte) -78);
                        }
                    } else {
                        this.field1575 = arg2.method256((byte) -78);
                    }
                } else {
                    this.field1555 = arg2.method256((byte) -78);
                }
            } else {
                this.field1558 = arg2.method221(-120);
            }
        } else {
            this.field1563 = arg2.method221(arg1 ^ -120);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JI)V")
    public static final void method546(long arg0, int arg1) {
        if (arg1 != -21069) {
            field1564 = null;
        }
        ++field1572;
        if (arg0 != 0L) {
            if (~class136.field2912 <= -101) {
                class190.method1252(class20.field387, arg1 ^ -21069, class173.field3459, 0);
            } else {
                class35 var3 = class49.method436(arg0, false).method346(arg1 + 21135);
                for (int var4 = 0; ~class136.field2912 < ~var4; ++var4) {
                    if (class5.field82[var4] == arg0) {
                        class190.method1252(class20.field387, 0, class63.method529(new class35[] { var3, class120.field2638 }, (byte) 85), 0);
                        return;
                    }
                }
                for (int var5 = 0; class25.field505 > var5; ++var5) {
                    if (class167.field3373[var5] == arg0) {
                        class190.method1252(class20.field387, arg1 ^ -21069, class63.method529(new class35[] { class17.field331, var3, class127.field2753 }, (byte) 66), 0);
                        return;
                    }
                }
                if (var3.method332(18732, class71.field1704.field2254)) {
                    class190.method1252(class20.field387, arg1 + 21069, class29.field588, 0);
                } else {
                    ++class58.field1458;
                    class5.field82[class136.field2912] = arg0;
                    class58.field1449[class136.field2912++] = class49.method436(arg0, false);
                    class100.field2208 = class13.field232;
                    class1.field11.method659(241, true);
                    class1.field11.method239((byte) 103, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        ++field1576;
        if (super.field816.field3661) {
            int var4 = 0;
            int var5;
            for (var5 = class22.field450[arg1] + this.field1560; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field1558 && var5 >= this.field1584[var4]) {
                ++var4;
            }
            float var6 = (float) this.field1584[var4 + -1];
            float var7 = (float) this.field1584[var4];
            if ((float) var5 > (float) this.field1577 + var6 && (float) (-this.field1577) + var7 > (float) var5) {
                for (int var8 = 0; ~class72.field1719 < ~var8; ++var8) {
                    int var9 = var4 % 2 == 0 ? this.field1556 : -this.field1556;
                    int var10 = (this.field1557 * var9 >> 12) + class118.field2622[var8];
                    int var11 = 0;
                    while (var10 < 0) {
                        var10 += 4096;
                    }
                    while (var10 > 4096) {
                        var10 -= 4096;
                    }
                    while (var11 < this.field1563 && ~var10 <= ~this.field1559[var4 + -1][var11]) {
                        ++var11;
                    }
                    float var12 = (float) this.field1559[var4 - 1][var11];
                    float var13 = (float) this.field1559[var4 + -1][var11 + -1];
                    if ((float) var10 > (float) this.field1577 + var13 && (float) var10 < (float) (-this.field1577) + var12) {
                        var3[var8] = this.field1579[var4 + -1][var11 + -1];
                    } else {
                        var3[var8] = 0;
                    }
                }
            } else {
                class156.method1047(var3, 0, class72.field1719, 0);
            }
        }
        if (arg0 != 75) {
            this.field1575 = 118;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(B)V")
    public static final void method547(byte arg0) {
        class95 var1 = class158.field3210;
        synchronized (class158.field3210) {
            if (arg0 > -105) {
                return;
            }
            class166.field3364 = class207.field4124;
            class17.field329 = class132.field2840;
            class98.field2168 = class63.field1518;
            class121.field2667 = class124.field2728;
            class134.field2859 = class37.field809;
            class9.field187 = class99.field2171;
            class84.field1930 = class75.field1797;
            class124.field2728 = 0;
        }
        ++field1568;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)V")
    public static void method548(boolean arg0) {
        field1580 = null;
        field1553 = null;
        if (arg0) {
            method545(true);
        }
        field1570 = null;
        field1565 = null;
        field1564 = null;
        field1562 = null;
        field1567 = null;
        field1571 = null;
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
    private final void method549(int arg0) {
        ++field1573;
        Random var2 = new Random((long) this.field1558);
        this.field1559 = new int[this.field1558][this.field1563 + 1];
        this.field1579 = new int[this.field1558][this.field1563];
        this.field1584 = new int[this.field1558 + 1];
        this.field1577 = this.field1569 / 2;
        this.field1557 = 4096 / this.field1563;
        this.field1551 = 4096 / this.field1558;
        int var3 = this.field1557 / 2;
        this.field1584[0] = 0;
        int var4 = this.field1551 / 2;
        for (int var5 = 0; ~this.field1558 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field1551;
                int var7 = (-2048 + class183.method1218(1804454752, 4096, var2)) * this.field1575 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1584[var5] = this.field1584[var5 + -1] + var8;
            }
            this.field1559[var5][0] = 0;
            for (int var9 = 0; ~this.field1563 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1557;
                    int var11 = (class183.method1218(1804454752, 4096, var2) + -2048) * this.field1555 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1559[var5][var9] = this.field1559[var5][var9 + -1] + var12;
                }
                this.field1579[var5][var9] = this.field1574 > 0 ? -class183.method1218(1804454752, this.field1574, var2) + 4096 : 4096;
            }
            this.field1559[var5][this.field1563] = 4096;
        }
        this.field1584[this.field1558] = arg0;
    }
}
