import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class87 extends class230 {

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    private int field1574 = 0;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "Lo;")
    private class199 field1573 = new class199(16);

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    private int field1582 = 0;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "Lhi;")
    private class282 field1583 = new class282();

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "J")
    private long field1586 = 0L;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "Lfk;")
    private class41 field1563;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "Z")
    private boolean field1585;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "Lhi;")
    private class282 field1584;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "Lkk;")
    private class225 field1561;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "Z")
    private boolean field1587;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "Lnb;")
    private class304 field1564;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Lfk;")
    private class41 field1549;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Lud;")
    private class272 field1557;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Lqd;")
    public static class40 field1547 = class147.method1106("Zugewiesener Speicher)3", (byte) -64);

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "Lqd;")
    public static class40 field1569 = class147.method1106(")2", (byte) -78);

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field1555 = 0;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "Lqd;")
    private static class40 field1571 = class147.method1106("You can(Wt add yourself to your own friend list)3", (byte) -95);

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Lqd;")
    public static class40 field1558 = field1571;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Lpd;")
    private class3 field1556;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "Z")
    private boolean field1581;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "[B")
    private byte[] field1576;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "[[[I")
    public static int[][][] field1579;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)I", line = 5)
    public final int method669(int arg0) {
        field1562++;
        if (this.method676(arg0) == null) {
            return this.field1557 == null ? 0 : this.field1557.method290((byte) -128);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V", line = 23)
    public final void method670(int arg0) {
        field1566++;
        if (this.field1584 != null) {
            if (this.method676(0) == null) {
                return;
            }
            if (this.field1585) {
                boolean var6 = true;
                for (class307 var7 = this.field1584.method1971(100); var7 != null; var7 = this.field1584.method1967(arg0 ^ 0x65)) {
                    int var8 = (int) var7.field5149;
                    if (this.field1576[var8] == 0) {
                        this.method680(var8, (byte) -120, 1);
                    }
                    if (this.field1576[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method2095(0);
                    }
                }
                while (this.field1556.field44.length > this.field1582) {
                    if (this.field1556.field44[this.field1582] == 0) {
                        this.field1582++;
                    } else {
                        if (this.field1561.field3728 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field1576[this.field1582] == 0) {
                            this.method680(this.field1582, (byte) -128, 1);
                        }
                        if (this.field1576[this.field1582] == 0) {
                            var6 = false;
                            class307 var9 = new class307();
                            var9.field5149 = (long) this.field1582;
                            this.field1584.method1972(var9, arg0 ^ 0xFFFFFF81);
                        }
                        this.field1582++;
                    }
                }
                if (var6) {
                    this.field1585 = false;
                    this.field1582 = 0;
                }
            } else if (this.field1581) {
                boolean var2 = true;
                for (class307 var3 = this.field1584.method1971(arg0 + 99); var3 != null; var3 = this.field1584.method1967(arg0 + 99)) {
                    int var4 = (int) var3.field5149;
                    if (this.field1576[var4] != 1) {
                        this.method680(var4, (byte) -128, 2);
                    }
                    if (this.field1576[var4] == 1) {
                        var3.method2095(0);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field1582 < this.field1556.field44.length) {
                    if (this.field1556.field44[this.field1582] == 0) {
                        this.field1582++;
                    } else {
                        if (this.field1564.method2086((byte) -127)) {
                            var2 = false;
                            break;
                        }
                        if (this.field1576[this.field1582] != 1) {
                            this.method680(this.field1582, (byte) -123, 2);
                        }
                        if (this.field1576[this.field1582] != 1) {
                            var2 = false;
                            class307 var5 = new class307();
                            var5.field5149 = (long) this.field1582;
                            this.field1584.method1972(var5, 4);
                        }
                        this.field1582++;
                    }
                }
                if (var2) {
                    this.field1581 = false;
                    this.field1582 = 0;
                }
            } else {
                this.field1584 = null;
            }
        }
        if (arg0 != 1) {
            this.method670(124);
        }
        if (!this.field1587 || this.field1586 > class69.method535(true)) {
            return;
        }
        for (class272 var10 = (class272) this.field1573.method1400(arg0 ^ 0xFFFFFFFE); var10 != null; var10 = (class272) this.field1573.method1403(-115)) {
            if (!var10.field4515) {
                if (var10.field4525) {
                    if (!var10.field4523) {
                        throw new RuntimeException();
                    }
                    var10.method2095(0);
                } else {
                    var10.field4525 = true;
                }
            }
        }
        this.field1586 = class69.method535(true) + 1000L;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I", line = 208)
    public final int method671(int arg0, int arg1) {
        field1580++;
        class272 var3 = (class272) this.field1573.method1405((byte) 115, (long) arg1);
        int var4 = -83 % ((37 - arg0) / 41);
        return var3 == null ? 0 : var3.method290((byte) -127);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIB)V", line = 227)
    public static final void method672(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1575++;
        if (arg4 < 109) {
            method674(39);
        }
        if (arg1 <= arg2) {
            for (int var5 = arg1; var5 < arg2; var5++) {
                class37.field694[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg1; var6++) {
                class37.field694[var6][arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V", line = 263)
    public static final void method673(int arg0) {
        class89.field1608.method1349(true);
        field1570++;
        if (arg0 != 0) {
            field1579 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)[F", line = 286)
    public static final float[] method674(int arg0) {
        field1550++;
        float var1 = class273.method1894() + class273.method1888();
        float var2 = 0.58823526F;
        int var3 = class273.method1889();
        float var4 = (float) (var3 & 0xFF) / 255.0F;
        class221.field3676[3] = 1.0F;
        float var5 = (float) ((var3 & 0xFFF6) >> 8) / 255.0F;
        class221.field3676[2] = class196.field3150[2] * var4 * var2 * var1;
        float var6 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        class221.field3676[1] = class196.field3150[1] * var5 * var2 * var1;
        class221.field3676[0] = class196.field3150[arg0] * var6 * var2 * var1;
        return class221.field3676;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)[B", line = 315)
    public final byte[] method675(int arg0, boolean arg1) {
        if (!arg1) {
            method672(127, -121, -42, -48, (byte) 5);
        }
        field1552++;
        class272 var3 = this.method680(arg0, (byte) -128, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method289((byte) -56);
            var3.method2095(0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Lpd;", line = 339)
    public final class3 method676(int arg0) {
        if (arg0 != 0) {
            return (class3) null;
        }
        field1548++;
        if (this.field1556 != null) {
            return this.field1556;
        }
        if (this.field1557 == null) {
            if (this.field1564.method2077(0)) {
                return null;
            }
            this.field1557 = this.field1564.method2084(this.field1554, (byte) 122, true, 255, (byte) 0);
        }
        if (this.field1557.field4515) {
            return null;
        }
        byte[] var2 = this.field1557.method289((byte) -56);
        if (this.field1557 instanceof class83) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1556 = new class3(var2, this.field1577);
                if (this.field1556.field26 != this.field1572) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field1556 = null;
                if (this.field1564.method2077(0)) {
                    this.field1557 = null;
                } else {
                    this.field1557 = this.field1564.method2084(this.field1554, (byte) 104, true, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1556 = new class3(var2, this.field1577);
            } catch (RuntimeException var6) {
                this.field1564.method2080(-1);
                this.field1556 = null;
                if (this.field1564.method2077(0)) {
                    this.field1557 = null;
                } else {
                    this.field1557 = this.field1564.method2084(this.field1554, (byte) 81, true, 255, (byte) 0);
                }
                return null;
            }
            if (this.field1549 != null) {
                this.field1561.method1575(this.field1554, this.field1549, 9835, var2);
            }
        }
        if (this.field1563 != null) {
            this.field1574 = 0;
            this.field1576 = new byte[this.field1556.field24];
        }
        this.field1557 = null;
        return this.field1556;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V", line = 453)
    public final void method677(int arg0, int arg1) {
        field1553++;
        if (this.field1563 == null) {
            return;
        }
        for (class307 var3 = this.field1583.method1971(100); var3 != null; var3 = this.field1583.method1967(100)) {
            if (((long) arg1) == var3.field5149) {
                return;
            }
        }
        int var4 = -65 % ((-arg0 - 39) / 60);
        class307 var5 = new class307();
        var5.field5149 = (long) arg1;
        this.field1583.method1972(var5, -108);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V", line = 481)
    public static void method678(byte arg0) {
        field1569 = null;
        field1579 = (int[][][]) null;
        field1571 = null;
        if (arg0 < 7) {
            method673(67);
        }
        field1547 = null;
        field1558 = null;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)I", line = 498)
    public final int method679(byte arg0) {
        field1551++;
        if (this.field1556 == null) {
            return 0;
        } else if (this.field1585) {
            if (arg0 != -104) {
                this.field1549 = (class41) null;
            }
            class307 var2 = this.field1584.method1971(100);
            return var2 == null ? 0 : (int) var2.field5149;
        } else {
            return this.field1556.field33;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBI)Lud;", line = 526)
    private final class272 method680(int arg0, byte arg1, int arg2) {
        class272 var4 = (class272) this.field1573.method1405((byte) 115, (long) arg0);
        field1559++;
        if (arg1 > -117) {
            field1569 = (class40) null;
        }
        if (var4 != null && arg2 == 0 && !var4.field4523 && var4.field4515) {
            var4.method2095(0);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field1563 == null || this.field1576[arg0] == -1) {
                    if (this.field1564.method2077(0)) {
                        return null;
                    }
                    var4 = this.field1564.method2084(arg0, (byte) 83, true, this.field1554, (byte) 2);
                } else {
                    var4 = this.field1561.method1581(arg0, this.field1563, -2943);
                }
            } else if (arg2 == 1) {
                if (this.field1563 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1561.method1577(arg0, 3, this.field1563);
            } else if (arg2 == 2) {
                if (this.field1563 == null) {
                    throw new RuntimeException();
                }
                if (this.field1576[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1564.method2086((byte) -74)) {
                    return null;
                }
                var4 = this.field1564.method2084(arg0, (byte) 105, false, this.field1554, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field1573.method1396(-19928, (long) arg0, var4);
        }
        if (var4.field4515) {
            return null;
        }
        byte[] var5 = var4.method289((byte) -56);
        if (!var4 instanceof class83) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class108.field1891.reset();
                class108.field1891.update(var5, 0, var5.length - 2);
                int var6 = (int) class108.field1891.getValue();
                if (this.field1556.field39[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field1564.field5113 = 0;
                this.field1564.field5112 = 0;
            } catch (RuntimeException var14) {
                this.field1564.method2080(-1);
                var4.method2095(0);
                if (var4.field4523 && !this.field1564.method2077(0)) {
                    class33 var8 = this.field1564.method2084(arg0, (byte) 88, true, this.field1554, (byte) 2);
                    this.field1573.method1396(-19928, (long) arg0, var8);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1556.field30[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field1556.field30[arg0];
            if (this.field1563 != null) {
                this.field1561.method1575(arg0, this.field1563, 9835, var5);
                if (this.field1576[arg0] != 1) {
                    this.field1574++;
                    this.field1576[arg0] = 1;
                }
            }
            if (!var4.field4523) {
                var4.method2095(0);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class108.field1891.reset();
            class108.field1891.update(var5, 0, var5.length - 2);
            int var9 = (int) class108.field1891.getValue();
            if (this.field1556.field39[arg0] != var9) {
                throw new RuntimeException();
            }
            int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1556.field30[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field1576[arg0] != 1) {
                if (this.field1576[arg0] == 0) {
                }
                this.field1574++;
                this.field1576[arg0] = 1;
            }
            if (!var4.field4523) {
                var4.method2095(0);
            }
            return var4;
        } catch (Exception var13) {
            this.field1576[arg0] = -1;
            var4.method2095(0);
            if (var4.field4523 && !this.field1564.method2077(0)) {
                class33 var12 = this.field1564.method2084(arg0, (byte) 127, true, this.field1554, (byte) 2);
                this.field1573.method1396(-19928, (long) arg0, var12);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)I", line = 738)
    public final int method681(int arg0) {
        field1568++;
        if (arg0 != 100) {
            field1567 = -71;
        }
        return this.field1556 == null ? 0 : this.field1556.field33;
    }

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "(I)I", line = 772)
    public final int method682(int arg0) {
        field1560++;
        return arg0 > -64 ? -70 : this.field1574;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(B)V", line = 785)
    public final void method683(byte arg0) {
        field1565++;
        if (arg0 < 95) {
            this.method669(-25);
        }
        if (this.field1584 == null || this.method676(0) == null) {
            return;
        }
        for (class307 var2 = this.field1583.method1971(100); var2 != null; var2 = this.field1583.method1967(100)) {
            int var3 = (int) var2.field5149;
            if (var3 < 0 || this.field1556.field24 <= var3 || this.field1556.field44[var3] == 0) {
                var2.method2095(0);
            } else {
                if (this.field1576[var3] == 0) {
                    this.method680(var3, (byte) -125, 1);
                }
                if (this.field1576[var3] == -1) {
                    this.method680(var3, (byte) -119, 2);
                }
                if (this.field1576[var3] == 1) {
                    var2.method2095(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)V", line = 833)
    public final void method684(byte arg0) {
        if (arg0 != -46) {
            this.method681(4);
        }
        field1578++;
        if (this.field1563 != null) {
            this.field1581 = true;
            if (this.field1584 == null) {
                this.field1584 = new class282();
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(ILfk;Lfk;Lnb;Lkk;IIZ)V", line = 874)
    public class87(int arg0, class41 arg1, class41 arg2, class304 arg3, class225 arg4, int arg5, int arg6, boolean arg7) {
        this.field1563 = arg1;
        this.field1554 = arg0;
        if (this.field1563 == null) {
            this.field1585 = false;
        } else {
            this.field1585 = true;
            this.field1584 = new class282();
        }
        this.field1572 = arg6;
        this.field1577 = arg5;
        this.field1561 = arg4;
        this.field1587 = arg7;
        this.field1564 = arg3;
        this.field1549 = arg2;
        if (this.field1549 != null) {
            this.field1557 = this.field1561.method1581(this.field1554, this.field1549, -2943);
        }
    }
}
