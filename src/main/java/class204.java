import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class204 extends class259 {

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    private int field3641 = 81;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
    private int field3640 = 204;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    private int field3635 = 409;

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
    private int field3645 = 1024;

    @OriginalMember(owner = "client!f", name = "ob", descriptor = "I")
    private int field3654 = 0;

    @OriginalMember(owner = "client!f", name = "pb", descriptor = "I")
    private int field3655 = 1024;

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "I")
    private int field3648 = 4;

    @OriginalMember(owner = "client!f", name = "ub", descriptor = "I")
    private int field3660 = 8;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "Lsg;")
    private static class30 field3642 = class167.method1221((byte) 33, "M");

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "Lsg;")
    public static class30 field3639 = field3642;

    @OriginalMember(owner = "client!f", name = "nb", descriptor = "Lsg;")
    public static class30 field3653 = field3642;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "Lub;")
    public static class17 field3636 = new class17(64);

    @OriginalMember(owner = "client!f", name = "vb", descriptor = "[Lsg;")
    public static class30[] field3661 = new class30[200];

    @OriginalMember(owner = "client!f", name = "rb", descriptor = "Z")
    public static boolean field3657 = false;

    @OriginalMember(owner = "client!f", name = "qb", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!f", name = "sb", descriptor = "Lsg;")
    public static class30 field3658 = class167.method1221((byte) 33, "(Z");

    @OriginalMember(owner = "client!f", name = "wb", descriptor = "Lsg;")
    public static class30 field3662 = class167.method1221((byte) 33, "Angreifen");

    @OriginalMember(owner = "client!f", name = "tb", descriptor = "Lb;")
    public static class48 field3659 = new class48();

    @OriginalMember(owner = "client!f", name = "yb", descriptor = "Z")
    public static boolean field3664 = false;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "I")
    private int field3643;

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "I")
    private int field3647;

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!f", name = "kb", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!f", name = "mb", descriptor = "I")
    private int field3652;

    @OriginalMember(owner = "client!f", name = "xb", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "[I")
    private int[] field3637;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "[[I")
    private int[][] field3644;

    @OriginalMember(owner = "client!f", name = "lb", descriptor = "[[I")
    private int[][] field3651;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field3634;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field3655 = arg2.method65((byte) 119);
                                    }
                                } else {
                                    this.field3641 = arg2.method65((byte) 122);
                                }
                            } else {
                                this.field3654 = arg2.method65((byte) 121);
                            }
                        } else {
                            this.field3645 = arg2.method65((byte) 126);
                        }
                    } else {
                        this.field3640 = arg2.method65((byte) 108);
                    }
                } else {
                    this.field3635 = arg2.method65((byte) 109);
                }
            } else {
                this.field3660 = arg2.method63((byte) 76);
            }
        } else {
            this.field3648 = arg2.method63((byte) 127);
        }
        if (arg1 != -1586849108) {
            this.field3660 = -117;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class204() {
        super(0, true);
    }

    @OriginalMember(owner = "client!f", name = "i", descriptor = "(I)V")
    private final void method1439(int arg0) {
        ++field3646;
        if (arg0 != 17035) {
            this.field3648 = 77;
        }
        Random var2 = new Random((long) this.field3660);
        this.field3637 = new int[this.field3660 + 1];
        this.field3652 = 4096 / this.field3660;
        int var3 = this.field3652 / 2;
        this.field3644 = new int[this.field3660][this.field3648];
        this.field3637[0] = 0;
        this.field3643 = this.field3641 / 2;
        this.field3651 = new int[this.field3660][this.field3648 + 1];
        this.field3647 = 4096 / this.field3648;
        int var4 = this.field3647 / 2;
        for (int var5 = 0; ~var5 > ~this.field3660; ++var5) {
            if (var5 > 0) {
                int var6 = this.field3652;
                int var7 = (-2048 + class256.method1779(122, var2, 4096)) * this.field3640 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field3637[var5] = this.field3637[var5 - 1] - -var8;
            }
            this.field3651[var5][0] = 0;
            for (int var9 = 0; ~this.field3648 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3647;
                    int var11 = (class256.method1779(124, var2, 4096) + -2048) * this.field3635 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field3651[var5][var9] = this.field3651[var5][var9 + -1] + var12;
                }
                this.field3644[var5][var9] = this.field3655 > 0 ? 4096 - class256.method1779(126, var2, this.field3655) : 4096;
            }
            this.field3651[var5][this.field3648] = 4096;
        }
        this.field3637[this.field3660] = 4096;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            this.field3643 = 21;
        }
        ++field3649;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int var4 = 0;
            int var5;
            for (var5 = class154.field2910[arg0] - -this.field3654; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field3660 && var5 >= this.field3637[var4]) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field3637[var4];
            int var9 = this.field3637[var4 + -1];
            if (~var5 < ~(var9 - -this.field3643) && ~(-this.field3643 + var8) < ~var5) {
                for (int var10 = 0; ~class223.field3999 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field3645 : this.field3645;
                    int var13;
                    for (var13 = (this.field3647 * var12 >> 12) + class29.field558[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field3648 > var11 && var13 >= this.field3651[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field3651[var6][var14];
                    int var16 = this.field3651[var6][var11];
                    if (var13 > this.field3643 + var15 && var13 < -this.field3643 + var16) {
                        var3[var10] = this.field3644[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class26.method234(var3, 0, class223.field3999, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 <= 11) {
            this.field3654 = -19;
        }
        ++field3650;
        this.method1439(17035);
    }

    @OriginalMember(owner = "client!f", name = "j", descriptor = "(I)V")
    public static void method1440(int arg0) {
        field3636 = null;
        field3642 = null;
        int var1 = 80 / ((-10 - arg0) / 47);
        field3639 = null;
        field3661 = null;
        field3653 = null;
        field3658 = null;
        field3662 = null;
        field3659 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIII)V")
    public static final void method1441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= 49) {
            if (class48.field1096 <= arg3 && arg5 <= class252.field4458 && class275.field4804 <= arg0 && ~arg1 >= ~class167.field3064) {
                class257.method1785(arg5, arg4, 100, arg1, arg0, arg3);
            } else {
                class270.method1851(94, arg0, arg3, arg1, arg4, arg5);
            }
            ++field3633;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)Lce;")
    public static final class205 method1442(boolean arg0) {
        ++field3638;
        if (arg0) {
            field3653 = null;
        }
        return class260.field4600.length > class69.field1545 ? class260.field4600[class69.field1545++] : null;
    }
}
