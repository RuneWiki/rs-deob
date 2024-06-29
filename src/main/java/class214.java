import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class214 extends class154 {

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
    private int field3692 = 4;

    @OriginalMember(owner = "client!ii", name = "gb", descriptor = "I")
    private int field3695 = 1024;

    @OriginalMember(owner = "client!ii", name = "sb", descriptor = "I")
    private int field3707 = 0;

    @OriginalMember(owner = "client!ii", name = "jb", descriptor = "I")
    private int field3698 = 409;

    @OriginalMember(owner = "client!ii", name = "ub", descriptor = "I")
    private int field3709 = 8;

    @OriginalMember(owner = "client!ii", name = "vb", descriptor = "I")
    private int field3710 = 81;

    @OriginalMember(owner = "client!ii", name = "yb", descriptor = "I")
    private int field3713 = 1024;

    @OriginalMember(owner = "client!ii", name = "nb", descriptor = "I")
    private int field3702 = 204;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "Lmg;")
    public static class53 field3688 = new class53(64);

    @OriginalMember(owner = "client!ii", name = "wb", descriptor = "[I")
    public static int[] field3711 = new int[2];

    @OriginalMember(owner = "client!ii", name = "tb", descriptor = "Leg;")
    public static class37 field3708 = class174.method1167(" <col=00ff80>", 65);

    @OriginalMember(owner = "client!ii", name = "qb", descriptor = "Leg;")
    public static class37 field3705 = class174.method1167("", -93);

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!ii", name = "eb", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ii", name = "fb", descriptor = "I")
    private int field3694;

    @OriginalMember(owner = "client!ii", name = "ib", descriptor = "I")
    private int field3697;

    @OriginalMember(owner = "client!ii", name = "kb", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ii", name = "lb", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!ii", name = "mb", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ii", name = "ob", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ii", name = "pb", descriptor = "I")
    private int field3704;

    @OriginalMember(owner = "client!ii", name = "rb", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ii", name = "xb", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!ii", name = "hb", descriptor = "[I")
    private int[] field3696;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "[[I")
    private int[][] field3687;

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "[[I")
    private int[][] field3691;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field3699;
        if (arg0 != -9) {
            this.method143(116, 90);
        }
        this.method1522((byte) 26);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)V")
    public static void method1518(byte arg0) {
        field3688 = null;
        field3711 = null;
        field3705 = null;
        if (arg0 != 43) {
            method1521(-35, true);
        }
        field3708 = null;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(III)Loa;")
    public static final class273 method1519(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1875;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class214() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field3713 = arg0.method1244(false);
                                    }
                                } else {
                                    this.field3710 = arg0.method1244(false);
                                }
                            } else {
                                this.field3707 = arg0.method1244(false);
                            }
                        } else {
                            this.field3695 = arg0.method1244(false);
                        }
                    } else {
                        this.field3702 = arg0.method1244(false);
                    }
                } else {
                    this.field3698 = arg0.method1244(false);
                }
            } else {
                this.field3709 = arg0.method1268(255);
            }
        } else {
            this.field3692 = arg0.method1268(255);
        }
        if (arg1 == -14015) {
            ++field3703;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBLsb;)V")
    public static final void method1520(int arg0, byte arg1, class109 arg2) {
        if (class72.field1146 < arg2.field1763) {
            class32.method190(arg2, arg1 + -18765);
        } else if (class72.field1146 > arg2.field1823) {
            class20.method127(arg2, (byte) -99);
        } else {
            class148.method1021(-125, arg2);
        }
        if (arg2.field1799 < 128 || arg2.field1793 < 128 || ~arg2.field1799 <= -13185 || arg2.field1793 >= 13184) {
            arg2.field1823 = 0;
            arg2.field1814 = -1;
            arg2.field1800 = -1;
            arg2.field1763 = 0;
            arg2.field1799 = arg2.field1812[0] * 128 - -(64 * arg2.method763(-1));
            arg2.field1793 = arg2.field1780[0] * 128 + arg2.method763(arg1 + 65) * 64;
            arg2.method761(-120);
        }
        ++field3700;
        if (class82.field1285 == arg2 && (~arg2.field1799 > -1537 || arg2.field1793 < 1536 || ~arg2.field1799 <= -11777 || ~arg2.field1793 <= -11777)) {
            arg2.field1823 = 0;
            arg2.field1814 = -1;
            arg2.field1800 = -1;
            arg2.field1763 = 0;
            arg2.field1799 = arg2.field1812[0] * 128 - -(arg2.method763(-1) * 64);
            arg2.field1793 = arg2.field1780[0] * 128 + arg2.method763(-1) * 64;
            arg2.method761(112);
        }
        if (arg1 == -66) {
            class40.method271(arg2, true);
            class239.method1642(arg2, 125);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        if (arg1 != 1075962732) {
            this.field3687 = null;
        }
        ++field3689;
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int var4 = 0;
            int var5;
            for (var5 = class62.field1029[arg0] + this.field3707; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field3709 && ~var5 <= ~this.field3696[var4]) {
                ++var4;
            }
            int var6 = this.field3696[var4];
            int var7 = var4 + -1;
            boolean var8 = ~(1 & var4) == -1;
            int var9 = this.field3696[var4 + -1];
            if (var9 - -this.field3694 < var5 && -this.field3694 + var6 > var5) {
                for (int var10 = 0; ~class227.field3898 < ~var10; ++var10) {
                    int var11 = var8 ? this.field3695 : -this.field3695;
                    int var12;
                    for (var12 = (this.field3704 * var11 >> 12) + class239.field4263[var10]; var12 < 0; var12 += 4096) {
                    }
                    int var13 = 0;
                    while (~var12 < -4097) {
                        var12 -= 4096;
                    }
                    while (~var13 > ~this.field3692 && var12 >= this.field3691[var7][var13]) {
                        ++var13;
                    }
                    int var14 = var13 + -1;
                    int var15 = this.field3691[var7][var13];
                    int var16 = this.field3691[var7][var14];
                    if (var12 > this.field3694 + var16 && ~var12 > ~(var15 - this.field3694)) {
                        var3[var10] = this.field3687[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class54.method350(var3, 0, class227.field3898, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)V")
    public static final void method1521(int arg0, boolean arg1) {
        ++field3686;
        if (class262.method1772(0, arg0)) {
            class237[] var2 = class232.field4000[arg0];
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class237 var4 = var2[var3];
                if (var4 != null) {
                    var4.field4165 = 0;
                    var4.field4110 = 0;
                }
            }
            if (!arg1) {
                field3708 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(B)V")
    private final void method1522(byte arg0) {
        Random var2 = new Random((long) this.field3709);
        this.field3704 = 4096 / this.field3692;
        this.field3691 = new int[this.field3709][this.field3692 + 1];
        this.field3687 = new int[this.field3709][this.field3692];
        this.field3694 = this.field3710 / 2;
        this.field3697 = 4096 / this.field3709;
        this.field3696 = new int[this.field3709 + 1];
        this.field3696[0] = 0;
        int var3 = this.field3704 / 2;
        int var4 = this.field3697 / 2;
        ++field3690;
        if (arg0 != 26) {
            this.field3710 = -101;
        }
        for (int var5 = 0; var5 < this.field3709; ++var5) {
            if (var5 > 0) {
                int var6 = this.field3697;
                int var7 = (class46.method304(var2, 4096, -7486) - 2048) * this.field3702 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3696[var5] = this.field3696[var5 + -1] + var8;
            }
            this.field3691[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3692; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3704;
                    int var11 = (-2048 + class46.method304(var2, 4096, -7486)) * this.field3698 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3691[var5][var9] = this.field3691[var5][var9 + -1] + var12;
                }
                this.field3687[var5][var9] = this.field3713 <= 0 ? 4096 : 4096 + -class46.method304(var2, this.field3713, -7486);
            }
            this.field3691[var5][this.field3692] = 4096;
        }
        this.field3696[this.field3709] = 4096;
    }
}
