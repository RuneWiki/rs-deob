import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class101 extends class76 {

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "Z")
    private boolean field1544 = false;

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
    private int field1555 = -32768;

    @OriginalMember(owner = "client!gu", name = "kb", descriptor = "I")
    private int field1577 = 0;

    @OriginalMember(owner = "client!gu", name = "mb", descriptor = "I")
    private int field1579 = -1;

    @OriginalMember(owner = "client!gu", name = "qb", descriptor = "I")
    private int field1583 = 0;

    @OriginalMember(owner = "client!gu", name = "U", descriptor = "Z")
    private boolean field1561;

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!gu", name = "Q", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!gu", name = "P", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!gu", name = "T", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "client!gu", name = "R", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client!gu", name = "W", descriptor = "I")
    private int field1563;

    @OriginalMember(owner = "client!gu", name = "hb", descriptor = "Lkt;")
    private class61 field1574;

    @OriginalMember(owner = "client!gu", name = "S", descriptor = "[I")
    public static int[] field1559 = new int[16];

    @OriginalMember(owner = "client!gu", name = "gb", descriptor = "Lpn;")
    public static class49 field1573 = new class49(5, 8);

    @OriginalMember(owner = "client!gu", name = "nb", descriptor = "Ljp;")
    public static class55 field1580 = new class55(71, 0);

    @OriginalMember(owner = "client!gu", name = "E", descriptor = "D")
    private double field1546;

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "D")
    private double field1550;

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "D")
    private double field1551;

    @OriginalMember(owner = "client!gu", name = "N", descriptor = "D")
    private double field1554;

    @OriginalMember(owner = "client!gu", name = "Z", descriptor = "D")
    private double field1566;

    @OriginalMember(owner = "client!gu", name = "bb", descriptor = "D")
    private double field1568;

    @OriginalMember(owner = "client!gu", name = "lb", descriptor = "D")
    private double field1578;

    @OriginalMember(owner = "client!gu", name = "ob", descriptor = "D")
    private double field1581;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!gu", name = "F", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!gu", name = "G", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!gu", name = "L", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!gu", name = "V", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!gu", name = "X", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "client!gu", name = "Y", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!gu", name = "ab", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!gu", name = "cb", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!gu", name = "db", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!gu", name = "eb", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!gu", name = "fb", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!gu", name = "ib", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!gu", name = "jb", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!gu", name = "pb", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!gu", name = "D", descriptor = "Ltd;")
    private class382 field1545;

    @OriginalMember(owner = "client!gu", name = "B", descriptor = "[[B")
    public static byte[][] field1543;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Le;BLza;)V")
    private final void method819(class289 arg0, byte arg1, class299 arg2) {
        ++field1571;
        if (arg1 <= 103) {
            this.method821(59);
        }
        class476[] var4 = arg0.method665();
        class349[] var5 = arg0.method634();
        if ((this.field1545 == null || this.field1545.field5606) && (var4 != null || var5 != null)) {
            this.field1545 = new class382(class446.field6625);
        }
        if (this.field1545 != null) {
            this.field1545.method2421(arg2, (long) class446.field6625, var4, var5, false);
            this.field1545.method2431(super.field1274, super.field1283, super.field1271, super.field1277, super.field1272);
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(ILza;)Lhp;")
    public final class293 method110(int arg0, class299 arg1) {
        if (arg0 != 0) {
            this.finalize();
        }
        ++field1541;
        class289 var3 = this.method823(-124, arg1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class517 var4 = arg1.method538();
            var4.method963(this.field1553);
            var4.method952(this.field1564);
            var4.method957((int) this.field1550, (int) this.field1581, (int) this.field1554);
            if (this.field1545 != null) {
                class320 var5 = this.field1545.method2424();
                arg1.method584(var3, var5, var4, (class41) null, 0);
            } else {
                var3.method673(var4, (class41) null, 0);
            }
            this.field1555 = var3.method654();
            this.method819(var3, (byte) 122, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
    public final void method698(int arg0) {
        ++field1582;
        if (arg0 >= 7) {
            super.field1277 = super.field1272 = (short) ((int) (this.field1554 / 128.0D));
            super.field1283 = super.field1271 = (short) ((int) (this.field1550 / 128.0D));
        }
    }

    @OriginalMember(owner = "client!gu", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1548;
        if (this.field1545 != null) {
            this.field1545.method2430();
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)V")
    public final void method820(int arg0, boolean arg1) {
        this.field1550 += (double) arg0 * this.field1568;
        ++field1576;
        this.field1554 += (double) arg0 * this.field1546;
        this.field1544 = true;
        if (!this.field1561) {
            if (~this.field1552 == 0) {
                this.field1581 += (double) arg0 * this.field1551;
            } else {
                this.field1581 += this.field1578 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1551;
                this.field1551 += (double) arg0 * this.field1578;
            }
        } else {
            this.field1581 = (double) (class416.method2605((int) this.field1554, (int) this.field1550, (byte) -17, super.field1274) - this.field1558);
        }
        if (!arg1) {
            this.field1564 = (int) (2607.5945876176133D * Math.atan2(this.field1568, this.field1546)) - -8192 & 16383;
            this.field1553 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field1551, this.field1566));
            if (this.field1574 != null) {
                this.field1577 += arg0;
                while (true) {
                    do {
                        do {
                            if (~this.field1574.field962[this.field1583] <= ~this.field1577) {
                                return;
                            }
                            this.field1577 -= this.field1574.field962[this.field1583];
                            ++this.field1583;
                            if (this.field1574.field976.length <= this.field1583) {
                                this.field1583 -= this.field1574.field973;
                                if (this.field1583 < 0 || ~this.field1574.field976.length >= ~this.field1583) {
                                    this.field1583 = 0;
                                }
                            }
                            this.field1579 = this.field1583 + 1;
                        } while (~this.field1574.field976.length < ~this.field1579);
                        this.field1579 -= this.field1574.field973;
                    } while (this.field1579 >= 0 && this.field1579 < this.field1574.field976.length);
                    this.field1579 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public final void method821(int arg0) {
        if (arg0 != 0) {
            method824(-79);
        }
        ++field1570;
        if (this.field1545 != null) {
            this.field1545.method2430();
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIII)V")
    public final void method822(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1562;
        if (!this.field1544) {
            double var6 = (double) (-super.field1275 + arg3);
            double var8 = (double) (-super.field1279 + arg2);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1554 = (double) this.field1540 * var8 / var10 + (double) super.field1279;
            this.field1550 = (double) this.field1540 * var6 / var10 + (double) super.field1275;
            if (this.field1561) {
                this.field1581 = (double) (class416.method2605((int) this.field1554, (int) this.field1550, (byte) -94, super.field1274) + -this.field1558);
            } else {
                this.field1581 = (double) super.field1278;
            }
        }
        double var12 = (double) (this.field1549 + arg4 + -arg1);
        this.field1546 = ((double) arg2 - this.field1554) / var12;
        this.field1568 = ((double) arg3 + -this.field1550) / var12;
        this.field1566 = Math.sqrt(this.field1568 * this.field1568 + this.field1546 * this.field1546);
        if (~this.field1552 != 0) {
            if (!this.field1544) {
                this.field1551 = -this.field1566 * Math.tan((double) this.field1552 * 0.02454369D);
            }
            this.field1578 = ((double) arg0 - this.field1581 - this.field1551 * var12) * 2.0D / (var12 * var12);
        } else {
            this.field1551 = ((double) arg0 + -this.field1581) / var12;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 23) {
            return true;
        } else {
            ++field1567;
            return false;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
    public final int method101(boolean arg0) {
        ++field1569;
        if (arg0) {
            field1580 = null;
        }
        return this.field1555;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, -arg4 + class416.method2605(arg3, arg2, (byte) 110, arg1), arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field1544 = false;
        this.field1561 = arg11;
        this.field1552 = arg7;
        this.field1549 = arg6;
        this.field1557 = arg10;
        this.field1540 = arg8;
        this.field1556 = arg5;
        this.field1560 = arg9;
        this.field1558 = arg4;
        this.field1563 = arg0;
        int var13 = class232.field3490.method2625((byte) 116, this.field1563).field6450;
        if (~var13 != 0) {
            this.field1574 = class393.field5735.method1538(-4031, var13);
        } else {
            this.field1574 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lza;IIILps;IZ)V")
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg3 != -750) {
            this.method110(117, (class299) null);
        }
        ++field1572;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILza;)V")
    public final void method98(int arg0, class299 arg1) {
        ++field1547;
        class289 var3 = this.method823(-116, arg1, 0);
        if (var3 != null) {
            class517 var4 = arg1.method538();
            var4.method963(this.field1553);
            var4.method952(this.field1564);
            var4.method957((int) this.field1550, (int) this.field1581, (int) this.field1554);
            if (arg0 != 31203) {
                this.field1581 = -0.22311405877392462D;
            }
            this.field1555 = var3.method654();
            this.method819(var3, (byte) 108, arg1);
        }
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
    public final void method108(int arg0) {
        int var2 = -55 % ((arg0 - 48) / 37);
        ++field1565;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILza;I)Le;")
    private final class289 method823(int arg0, class299 arg1, int arg2) {
        ++field1542;
        if (arg0 > -115) {
            this.method822(38, 39, -42, -107, 52);
        }
        class434 var4 = class232.field3490.method2625((byte) 116, this.field1563);
        return var4.method2691(arg2, class393.field5735, this.field1579, 101, this.field1577, this.field1583, arg1);
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        if (arg0 != -88) {
            return true;
        } else {
            ++field1575;
            return false;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
    public static void method824(int arg0) {
        field1580 = null;
        field1543 = null;
        if (arg0 != 3158) {
            field1573 = null;
        }
        field1573 = null;
        field1559 = null;
    }
}
