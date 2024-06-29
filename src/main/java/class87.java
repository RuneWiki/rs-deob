import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class87 extends class205 {

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
    private int field1646 = 10;

    @OriginalMember(owner = "client!i", name = "nb", descriptor = "I")
    private int field1654 = 2048;

    @OriginalMember(owner = "client!i", name = "pb", descriptor = "I")
    private int field1656 = 0;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "Z")
    public static volatile boolean field1637 = true;

    @OriginalMember(owner = "client!i", name = "jb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1650 = Calendar.getInstance();

    @OriginalMember(owner = "client!i", name = "mb", descriptor = "Lvd;")
    private static class222 field1653 = class212.method1357(" more options", 10731);

    @OriginalMember(owner = "client!i", name = "kb", descriptor = "Lvd;")
    public static class222 field1651 = field1653;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!i", name = "db", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!i", name = "hb", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!i", name = "ib", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!i", name = "lb", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!i", name = "ob", descriptor = "Lve;")
    public static class223 field1655;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "[I")
    private int[] field1643;

    @OriginalMember(owner = "client!i", name = "gb", descriptor = "[I")
    private int[] field1647;

    @OriginalMember(owner = "client!i", name = "qb", descriptor = "[I")
    public static int[] field1657;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I")
    public static final int method558(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method560((byte) 110);
        }
        ++field1644;
        if (~arg0 == 0) {
            return 12345678;
        } else {
            int var3 = (127 & arg0) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "(I)V")
    private final void method559(int arg0) {
        ++field1639;
        this.field1647 = new int[this.field1646 - -1];
        this.field1643 = new int[this.field1646 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field1646;
        int var4 = this.field1654 * var3 >> 12;
        for (int var5 = arg0; ~this.field1646 < ~var5; ++var5) {
            this.field1647[var5] = var2;
            this.field1643[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1647[this.field1646] = 4096;
        this.field1643[this.field1646] = this.field1643[0] + 4096;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field3810.method557(6978, arg1);
            ++field1640;
            if (super.field3810.field1635) {
                int var4 = class218.field4051[arg1];
                if (~this.field1656 != -1) {
                    for (int var5 = 0; ~class118.field2245 < ~var5; ++var5) {
                        int var6 = 0;
                        int var7 = class230.field4319[var5];
                        int var8 = this.field1656;
                        if (~var8 != -2) {
                            if (var8 != 2) {
                                if (~var8 == -4) {
                                    var6 = (-var4 + var7 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var4 + -4096 + var7 >> 1) + 2048;
                            }
                        } else {
                            var6 = var7;
                        }
                        short var9 = 0;
                        for (int var10 = 0; ~this.field1646 < ~var10; ++var10) {
                            if (~var6 <= ~this.field1647[var10] && ~var6 > ~this.field1647[var10 + 1]) {
                                if (~var6 > ~this.field1643[var10]) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var9;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; this.field1646 > var12; ++var12) {
                        if (~this.field1647[var12] >= ~var4 && this.field1647[var12 + 1] > var4) {
                            if (~this.field1643[var12] < ~var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class163.method1027(var3, 0, class118.field2245, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class87() {
        super(0, true);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1656 = arg0.method662((byte) -100);
                }
            } else {
                this.field1654 = arg0.method675(2);
            }
        } else {
            this.field1646 = arg0.method662((byte) -86);
        }
        int var5 = -105 % ((-47 - arg1) / 34);
        ++field1642;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
    public static final void method560(byte arg0) {
        if (arg0 == 99) {
            class42.field895.method1347((byte) -104, 200);
            ++class128.field2494;
            ++field1645;
            class42.field895.method668(0L, 8);
        }
    }

    @OriginalMember(owner = "client!i", name = "i", descriptor = "(I)V")
    public static void method561(int arg0) {
        field1650 = null;
        field1651 = null;
        field1655 = null;
        field1653 = null;
        if (arg0 != 65408) {
            method562(-90, (class100) null);
        }
        field1657 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILjc;)V")
    public static final void method562(int arg0, class100 arg1) {
        arg1.field1870 = false;
        ++field1636;
        if (arg1.field1871 != null) {
            arg1.field1871.field3212 = 0;
        }
        if (arg0 > -8) {
            field1637 = true;
        }
        for (class100 var2 = arg1.method572(); var2 != null; var2 = arg1.method568()) {
            method562(-100, var2);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IB)V")
    public static final void method563(int arg0, byte arg1) {
        if (arg1 <= 42) {
            method560((byte) -63);
        }
        class208 var2 = (class208) class78.field1505.method1520((long) arg0, 20);
        ++field1641;
        if (var2 != null) {
            var2.method826(-22101);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        ++field1638;
        this.method559(0);
        if (arg0) {
            method558(116, 8, 95);
        }
    }
}
