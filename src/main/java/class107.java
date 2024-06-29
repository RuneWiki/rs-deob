import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class107 extends class431 {

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Z")
    private boolean field1491 = false;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    private int field1492 = -1;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    private int field1487 = 0;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "I")
    private int field1519 = -32768;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    private int field1517 = 0;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "Z")
    private boolean field1499;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "Llp;")
    private class267 field1509;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field1484 = 0;

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
    public static int field1521 = 0;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "D")
    private double field1485;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "D")
    private double field1496;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "D")
    private double field1497;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "D")
    private double field1500;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "D")
    private double field1502;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "D")
    private double field1512;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "D")
    private double field1516;

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "D")
    private double field1522;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "Lao;")
    private class189 field1490;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(Lya;I)Lfk;", line = 5)
    public final class462 method38(class38 arg0, int arg1) {
        ++field1489;
        class471 var3 = this.method887(2048, arg0, -126);
        if (var3 == null) {
            return null;
        } else {
            class122 var4 = arg0.method362();
            var4.method252(this.field1493);
            var4.method247(this.field1511);
            var4.method251((int) this.field1485, (int) this.field1497, (int) this.field1512);
            if (this.field1490 == null) {
                var3.method457(var4, (class341) null, 0);
            } else {
                class88 var5 = this.field1490.method1331();
                arg0.method324(var3, var5, var4, (class341) null, 0);
            }
            this.field1519 = var3.method463();
            this.method886(0, var3, arg0);
            if (arg1 >= -87) {
                this.field1502 = -1.8573298928985096D;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)Z", line = 50)
    public final boolean method32(byte arg0) {
        ++field1503;
        if (arg0 < 104) {
            this.method38((class38) null, 112);
        }
        return false;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V", line = 338)
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class66.method643(arg2, -103, arg1, arg3) + -arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field1494 = arg6;
        this.field1525 = arg4;
        this.field1491 = false;
        this.field1499 = arg11;
        this.field1507 = arg7;
        this.field1505 = arg9;
        this.field1510 = arg0;
        this.field1513 = arg8;
        this.field1520 = arg5;
        this.field1504 = arg10;
        int var13 = class151.field2145.method2115(-137, this.field1510).field4611;
        if (var13 != -1) {
            this.field1509 = class153.field2169.method1585(3, var13);
        } else {
            this.field1509 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 71)
    public final void method884(byte arg0) {
        ++field1508;
        if (this.field1490 != null) {
            this.field1490.method1326();
        }
        if (arg0 > -93) {
            this.method38((class38) null, -123);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Lya;I)V", line = 87)
    public final void method35(class38 arg0, int arg1) {
        ++field1486;
        class471 var3 = this.method887(0, arg0, -127);
        if (var3 != null) {
            class122 var4 = arg0.method362();
            var4.method252(this.field1493);
            if (arg1 <= 53) {
                this.field1493 = 58;
            }
            var4.method247(this.field1511);
            var4.method251((int) this.field1485, (int) this.field1497, (int) this.field1512);
            this.field1519 = var3.method463();
            this.method886(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V", line = 112)
    protected final void finalize() {
        if (this.field1490 != null) {
            this.field1490.method1326();
        }
        ++field1488;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V", line = 133)
    public final void method885(int arg0) {
        if (arg0 != 11264) {
            this.method32((byte) 69);
        }
        super.field6332 = super.field6340 = (short) ((int) (this.field1485 / 128.0D));
        super.field6339 = super.field6337 = (short) ((int) (this.field1512 / 128.0D));
        ++field1495;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILt;Lya;)V", line = 145)
    private final void method886(int arg0, class471 arg1, class38 arg2) {
        ++field1498;
        if (arg0 != 0) {
            this.method884((byte) 127);
        }
        class17[] var4 = arg1.method454();
        class410[] var5 = arg1.method444();
        if ((this.field1490 == null || this.field1490.field2781) && (var4 != null || var5 != null)) {
            this.field1490 = new class189(class263.field3867);
        }
        if (this.field1490 != null) {
            this.field1490.method1329(arg2, (long) class263.field3867, var4, var5, false);
            this.field1490.method1334(super.field6328, super.field6332, super.field6340, super.field6339, super.field6337);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILya;I)Lt;", line = 171)
    private final class471 method887(int arg0, class38 arg1, int arg2) {
        ++field1506;
        if (arg2 > -125) {
            this.method29(-41);
        }
        class330 var4 = class151.field2145.method2115(-137, this.field1510);
        return var4.method2023(this.field1487, this.field1517, class153.field2169, (byte) -117, this.field1492, arg0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILya;I)Z", line = 184)
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        ++field1524;
        if (arg1 != 0) {
            this.method888(-123, 118, -11, 15, -46);
        }
        return false;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILfi;BZLya;I)V", line = 198)
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        ++field1523;
        if (arg3 != -99) {
            this.field1499 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V", line = 209)
    public final void method888(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1501;
        if (!this.field1491) {
            double var6 = (double) (-super.field6335 + arg1);
            double var8 = (double) (-super.field6334 + arg3);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1512 = (double) this.field1513 * var8 / var10 + (double) super.field6334;
            this.field1485 = (double) this.field1513 * var6 / var10 + (double) super.field6335;
            if (!this.field1499) {
                this.field1497 = (double) super.field6327;
            } else {
                this.field1497 = (double) (class66.method643((int) this.field1485, -43, super.field6328, (int) this.field1512) - this.field1525);
            }
        }
        double var12 = (double) (this.field1494 - (arg0 + -1));
        this.field1500 = ((double) arg1 + -this.field1485) / var12;
        if (arg4 < 1) {
            this.method888(-49, -105, 54, -34, 124);
        }
        this.field1516 = ((double) arg3 + -this.field1512) / var12;
        this.field1502 = Math.sqrt(this.field1516 * this.field1516 + this.field1500 * this.field1500);
        if (~this.field1507 == 0) {
            this.field1522 = ((double) arg2 + -this.field1497) / var12;
        } else {
            if (!this.field1491) {
                this.field1522 = -this.field1502 * Math.tan((double) this.field1507 * 0.02454369D);
            }
            this.field1496 = ((double) arg2 - this.field1497 - this.field1522 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V", line = 257)
    public final void method29(int arg0) {
        ++field1515;
        int var2 = -88 / ((57 - arg0) / 44);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V", line = 277)
    public final void method889(byte arg0, int arg1) {
        this.field1512 += (double) arg1 * this.field1516;
        this.field1491 = true;
        ++field1514;
        this.field1485 += (double) arg1 * this.field1500;
        int var3 = -73 / ((31 - arg0) / 63);
        if (this.field1499) {
            this.field1497 = (double) (class66.method643((int) this.field1485, -106, super.field6328, (int) this.field1512) + -this.field1525);
        } else if (~this.field1507 != 0) {
            this.field1497 += this.field1496 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1522;
            this.field1522 += (double) arg1 * this.field1496;
        } else {
            this.field1497 += (double) arg1 * this.field1522;
        }
        this.field1511 = 16383 & 8192 + (int) (2607.5945876176133D * Math.atan2(this.field1500, this.field1516));
        this.field1493 = (int) (2607.5945876176133D * Math.atan2(this.field1522, this.field1502)) & 16383;
        if (this.field1509 != null) {
            this.field1517 += arg1;
            while (true) {
                do {
                    do {
                        if (~this.field1509.field3940[this.field1487] <= ~this.field1517) {
                            return;
                        }
                        this.field1517 -= this.field1509.field3940[this.field1487];
                        ++this.field1487;
                        if (~this.field1487 <= ~this.field1509.field3919.length) {
                            this.field1487 -= this.field1509.field3926;
                            if (~this.field1487 > -1 || ~this.field1509.field3919.length >= ~this.field1487) {
                                this.field1487 = 0;
                            }
                        }
                        this.field1492 = this.field1487 + 1;
                    } while (this.field1492 < this.field1509.field3919.length);
                    this.field1492 -= this.field1509.field3926;
                } while (this.field1492 >= 0 && this.field1492 < this.field1509.field3919.length);
                this.field1492 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)I", line = 364)
    public final int method890(int arg0) {
        if (arg0 != -25430) {
            return -89;
        } else {
            ++field1518;
            return this.field1519;
        }
    }
}
