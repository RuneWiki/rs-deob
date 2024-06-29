import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 extends class242 {

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
    private int field1578 = 81;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    private int field1566 = 409;

    @OriginalMember(owner = "client!oa", name = "mb", descriptor = "I")
    private int field1585 = 1024;

    @OriginalMember(owner = "client!oa", name = "tb", descriptor = "I")
    private int field1592 = 204;

    @OriginalMember(owner = "client!oa", name = "ub", descriptor = "I")
    private int field1593 = 8;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    private int field1569 = 1024;

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    private int field1575 = 0;

    @OriginalMember(owner = "client!oa", name = "vb", descriptor = "I")
    private int field1594 = 4;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "Lp;")
    public static class280 field1571 = class18.method140((byte) -126, "Shift)2click disabled)3");

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "Lp;")
    public static class280 field1570 = class18.method140((byte) -117, "overlay");

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "Lp;")
    public static class280 field1577 = class18.method140((byte) -117, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "[I")
    public static int[] field1581 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
    public static int field1572 = 0;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Z")
    public static boolean field1565 = false;

    @OriginalMember(owner = "client!oa", name = "qb", descriptor = "[I")
    public static int[] field1589 = new int[8];

    @OriginalMember(owner = "client!oa", name = "wb", descriptor = "I")
    public static int field1595 = -1;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
    public static int field1573 = 0;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!oa", name = "lb", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!oa", name = "nb", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!oa", name = "ob", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!oa", name = "pb", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client!oa", name = "rb", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!oa", name = "xb", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "Ltg;")
    public static class180 field1568;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "[I")
    private int[] field1564;

    @OriginalMember(owner = "client!oa", name = "kb", descriptor = "[[I")
    private int[][] field1583;

    @OriginalMember(owner = "client!oa", name = "sb", descriptor = "[[I")
    private int[][] field1591;

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = -16 % ((arg1 - 73) / 41);
        ++field1596;
        int[] var4 = super.field4251.method1417((byte) 105, arg0);
        if (super.field4251.field3655) {
            int var5 = 0;
            int var6;
            for (var6 = class117.field2106[arg0] + this.field1575; ~var6 > -1; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (~var5 > ~this.field1593 && var6 >= this.field1564[var5]) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = (var5 & 1) == 0;
            int var9 = this.field1564[var5];
            int var10 = this.field1564[var5 + -1];
            if (~(var10 - -this.field1567) > ~var6 && ~var6 > ~(var9 - this.field1567)) {
                for (int var11 = 0; ~var11 > ~class264.field4654; ++var11) {
                    int var12 = 0;
                    int var13 = var8 ? this.field1569 : -this.field1569;
                    int var14;
                    for (var14 = (this.field1588 * var13 >> 12) + class102.field1701[var11]; var14 < 0; var14 += 4096) {
                    }
                    while (~var14 < -4097) {
                        var14 -= 4096;
                    }
                    while (this.field1594 > var12 && this.field1583[var7][var12] <= var14) {
                        ++var12;
                    }
                    int var15 = var12 + -1;
                    int var16 = this.field1583[var7][var15];
                    int var17 = this.field1583[var7][var12];
                    if (this.field1567 + var16 < var14 && ~var14 > ~(-this.field1567 + var17)) {
                        var4[var11] = this.field1591[var7][var15];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class143.method986(var4, 0, class264.field4654, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)Z")
    public static final boolean method688(byte arg0) {
        if (arg0 > -96) {
            method689((byte) 47);
        }
        ++field1584;
        return class253.field4441 != 0 ? true : class232.field4055.method25(123);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        this.method690(4459);
        ++field1582;
        if (arg0 < 122) {
            this.field1575 = -22;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    public static void method689(byte arg0) {
        field1570 = null;
        if (arg0 == 0) {
            field1581 = null;
            field1568 = null;
            field1571 = null;
            field1589 = null;
            field1577 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg0 <= -119) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (~arg1 != -7) {
                                        if (arg1 == 7) {
                                            this.field1585 = arg2.method193((byte) 77);
                                        }
                                    } else {
                                        this.field1578 = arg2.method193((byte) 77);
                                    }
                                } else {
                                    this.field1575 = arg2.method193((byte) 77);
                                }
                            } else {
                                this.field1569 = arg2.method193((byte) 77);
                            }
                        } else {
                            this.field1592 = arg2.method193((byte) 77);
                        }
                    } else {
                        this.field1566 = arg2.method193((byte) 77);
                    }
                } else {
                    this.field1593 = arg2.method189((byte) -103);
                }
            } else {
                this.field1594 = arg2.method189((byte) -103);
            }
            ++field1587;
        }
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    private final void method690(int arg0) {
        Random var2 = new Random((long) this.field1593);
        this.field1567 = this.field1578 / 2;
        this.field1564 = new int[this.field1593 + 1];
        this.field1564[0] = 0;
        this.field1579 = 4096 / this.field1593;
        ++field1580;
        this.field1583 = new int[this.field1593][this.field1594 + 1];
        this.field1591 = new int[this.field1593][this.field1594];
        this.field1588 = 4096 / this.field1594;
        int var3 = this.field1588 / 2;
        int var4 = this.field1579 / 2;
        if (arg0 != 4459) {
            field1581 = null;
        }
        for (int var5 = 0; this.field1593 > var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1579;
                int var7 = (-2048 + class47.method352(1, var2, 4096)) * this.field1592 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1564[var5] = this.field1564[var5 - 1] + var8;
            }
            this.field1583[var5][0] = 0;
            for (int var9 = 0; var9 < this.field1594; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1588;
                    int var11 = (class47.method352(arg0 ^ 4458, var2, 4096) - 2048) * this.field1566 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1583[var5][var9] = this.field1583[var5][var9 + -1] - -var12;
                }
                this.field1591[var5][var9] = ~this.field1585 < -1 ? -class47.method352(1, var2, this.field1585) + 4096 : 4096;
            }
            this.field1583[var5][this.field1594] = 4096;
        }
        this.field1564[this.field1593] = 4096;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLp;)V")
    public static final void method691(byte arg0, class280 arg1) {
        if (arg0 == 95) {
            int var2 = class15.method120(arg1, 7818);
            ++field1586;
            if (var2 != -1) {
                class126.method874(class14.field280.field3247[var2], true, class14.field280.field3237[var2]);
            }
        }
    }
}
