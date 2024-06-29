import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class120 extends class326 {

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    private int field1751 = 1024;

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
    private int field1755 = 8;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    private int field1746 = 409;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    private int field1750 = 0;

    @OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
    private int field1760 = 81;

    @OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
    private int field1761 = 1024;

    @OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
    private int field1758 = 204;

    @OriginalMember(owner = "client!pk", name = "gb", descriptor = "I")
    private int field1764 = 4;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lh;")
    public static class434 field1748 = new class434(2, 2);

    @OriginalMember(owner = "client!pk", name = "hb", descriptor = "Lh;")
    public static class434 field1765 = new class434(78, 6);

    @OriginalMember(owner = "client!pk", name = "ib", descriptor = "I")
    public static int field1766 = -1;

    @OriginalMember(owner = "client!pk", name = "jb", descriptor = "Lh;")
    public static class434 field1767 = new class434(0, 10);

    @OriginalMember(owner = "client!pk", name = "kb", descriptor = "Lmc;")
    public static class78 field1768 = new class78(0, 2);

    @OriginalMember(owner = "client!pk", name = "lb", descriptor = "Ls;")
    public static class169 field1769 = new class169(1, 15);

    @OriginalMember(owner = "client!pk", name = "mb", descriptor = "[I")
    public static int[] field1770 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    private int field1749;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
    private int field1752;

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!pk", name = "eb", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!pk", name = "fb", descriptor = "I")
    private int field1763;

    @OriginalMember(owner = "client!pk", name = "nb", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "[I")
    private int[] field1756;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "[[I")
    private int[][] field1745;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "[[I")
    private int[][] field1754;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V", line = 3)
    public final void method65(int arg0) {
        this.method749(true);
        if (arg0 > -100) {
            this.field1764 = -113;
        }
        ++field1747;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 16)
    public static final void method747(boolean arg0, String arg1, int arg2) {
        String var3 = arg1.toLowerCase();
        ++field1759;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class190.field2584 : class28.field376) + var6;
        if (arg2 != 2) {
            field1748 = null;
        }
        for (int var8 = var6; ~var7 < ~var8; ++var8) {
            class251 var11 = class455.method2674((byte) 97, var8);
            if (var11.field3348 && var11.method1408((byte) 63).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class390.field5418 = null;
                    class251.field3345 = -1;
                    return;
                }
                if (~var5 <= ~var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var5 > var13; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class251.field3345 = var5;
        class413.field5645 = 0;
        class390.field5418 = var4;
        String[] var9 = new String[class251.field3345];
        for (int var10 = 0; ~var10 > ~class251.field3345; ++var10) {
            var9[var10] = class455.method2674((byte) 101, var4[var10]).method1408((byte) 63);
        }
        class92.method586(var9, 99, class390.field5418);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)[I", line = 90)
    public final int[] method30(byte arg0, int arg1) {
        ++field1762;
        int[] var3 = super.field4344.method130(arg1, 62);
        if (arg0 >= -6) {
            return null;
        } else {
            if (super.field4344.field286) {
                int var4 = 0;
                int var5;
                for (var5 = class95.field1400[arg1] + this.field1750; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (var4 < this.field1755 && this.field1756[var4] <= var5) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(1 & var4) == -1;
                int var8 = this.field1756[var4];
                int var9 = this.field1756[var4 + -1];
                if (~var5 < ~(this.field1763 + var9) && var5 < var8 - this.field1763) {
                    for (int var10 = 0; ~class181.field2495 < ~var10; ++var10) {
                        int var11 = 0;
                        int var12 = var7 ? this.field1761 : -this.field1761;
                        int var13;
                        for (var13 = class389.field5375[var10] - -(this.field1752 * var12 >> 12); ~var13 > -1; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (~var11 > ~this.field1764 && var13 >= this.field1754[var6][var11]) {
                            ++var11;
                        }
                        int var14 = var11 - 1;
                        int var15 = this.field1754[var6][var11];
                        int var16 = this.field1754[var6][var14];
                        if (var16 - -this.field1763 < var13 && var15 - this.field1763 > var13) {
                            var3[var10] = this.field1745[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class380.method2337(var3, 0, class181.field2495, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILbt;I)V", line = 189)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field1751 = arg1.method215((byte) 91);
                                    }
                                } else {
                                    this.field1760 = arg1.method215((byte) 108);
                                }
                            } else {
                                this.field1750 = arg1.method215((byte) 113);
                            }
                        } else {
                            this.field1761 = arg1.method215((byte) 125);
                        }
                    } else {
                        this.field1758 = arg1.method215((byte) 123);
                    }
                } else {
                    this.field1746 = arg1.method215((byte) 115);
                }
            } else {
                this.field1755 = arg1.method201((byte) -126);
            }
        } else {
            this.field1764 = arg1.method201((byte) -111);
        }
        if (arg2 >= -3) {
            this.field1758 = 13;
        }
        ++field1757;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 376)
    public class120() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V", line = 292)
    public static void method748(int arg0) {
        field1768 = null;
        if (arg0 <= 66) {
            field1765 = null;
        }
        field1765 = null;
        field1770 = null;
        field1748 = null;
        field1769 = null;
        field1767 = null;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(Z)V", line = 313)
    private final void method749(boolean arg0) {
        ++field1753;
        Random var2 = new Random((long) this.field1755);
        this.field1749 = 4096 / this.field1755;
        this.field1763 = this.field1760 / 2;
        this.field1752 = 4096 / this.field1764;
        int var3 = this.field1752 / 2;
        if (!arg0) {
            this.method65(-119);
        }
        int var4 = this.field1749 / 2;
        this.field1745 = new int[this.field1755][this.field1764];
        this.field1756 = new int[this.field1755 + 1];
        this.field1754 = new int[this.field1755][this.field1764 + 1];
        this.field1756[0] = 0;
        for (int var5 = 0; var5 < this.field1755; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1749;
                int var7 = (class257.method1447(20094, 4096, var2) - 2048) * this.field1758 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1756[var5] = this.field1756[var5 - 1] - -var8;
            }
            this.field1754[var5][0] = 0;
            for (int var9 = 0; ~this.field1764 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1752;
                    int var11 = (-2048 + class257.method1447(20094, 4096, var2)) * this.field1746 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1754[var5][var9] = this.field1754[var5][var9 + -1] + var12;
                }
                this.field1745[var5][var9] = this.field1751 > 0 ? 4096 + -class257.method1447(20094, this.field1751, var2) : 4096;
            }
            this.field1754[var5][this.field1764] = 4096;
        }
        this.field1756[this.field1755] = 4096;
    }
}
