import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class645 extends class30 {

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    private int field8908 = 204;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    private int field8899 = 1024;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    private int field8910 = 409;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    private int field8904 = 0;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    private int field8902 = 81;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    private int field8916 = 8;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    private int field8919 = 1024;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    private int field8918 = 4;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "Lgca;")
    public static class227 field8903 = new class227();

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    private int field8901;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    private int field8906;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    private int field8909;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "[I")
    private int[] field8913;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "[I")
    public static int[] field8917;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "[[I")
    private int[][] field8898;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "[[I")
    private int[][] field8911;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field8915;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int var4 = 0;
            int var5;
            for (var5 = class430.field6016[arg1] + this.field8904; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (var4 < this.field8916 && this.field8913[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field8913[var4];
            int var9 = this.field8913[var4 + -1];
            if (var5 > this.field8901 + var9 && ~(-this.field8901 + var8) < ~var5) {
                for (int var10 = 0; class31.field399 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field8899 : -this.field8899;
                    int var13;
                    for (var13 = (this.field8909 * var12 >> 12) + class48.field568[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field8918 && ~var13 <= ~this.field8898[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field8898[var6][var14];
                    int var16 = this.field8898[var6][var11];
                    if (~(this.field8901 + var15) > ~var13 && ~(-this.field8901 + var16) < ~var13) {
                        var3[var10] = this.field8911[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class359.method2051(var3, 0, class31.field399, 0);
            }
        }
        if (arg0 != 1) {
            this.method48(-57, 80);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    private final void method3594(int arg0) {
        ++field8907;
        Random var2 = new Random((long) this.field8916);
        this.field8901 = this.field8902 / 2;
        this.field8906 = 4096 / this.field8916;
        this.field8909 = 4096 / this.field8918;
        if (arg0 == -5873) {
            int var3 = this.field8909 / 2;
            this.field8913 = new int[this.field8916 + 1];
            this.field8898 = new int[this.field8916][this.field8918 + 1];
            int var4 = this.field8906 / 2;
            this.field8911 = new int[this.field8916][this.field8918];
            this.field8913[0] = 0;
            for (int var5 = 0; this.field8916 > var5; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field8906;
                    int var7 = (-2048 + class351.method2023(4096, -78, var2)) * this.field8908 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field8913[var5] = this.field8913[var5 - 1] + var8;
                }
                this.field8898[var5][0] = 0;
                for (int var9 = 0; ~var9 > ~this.field8918; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field8909;
                        int var11 = (class351.method2023(4096, -117, var2) + -2048) * this.field8910 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field8898[var5][var9] = this.field8898[var5][var9 + -1] + var12;
                    }
                    this.field8911[var5][var9] = this.field8919 > 0 ? -class351.method2023(this.field8919, -72, var2) + 4096 : 4096;
                }
                this.field8898[var5][this.field8918] = 4096;
            }
            this.field8913[this.field8916] = 4096;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BII)Z")
    public static final boolean method3595(byte arg0, int arg1, int arg2) {
        ++field8905;
        if (arg0 > -56) {
            field8903 = null;
        }
        return (arg1 & 2048) != 0;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public final void method29(byte arg0) {
        ++field8914;
        if (arg0 > -10) {
            this.field8909 = 84;
        }
        this.method3594(-5873);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
    public static void method3596(byte arg0) {
        if (arg0 > 0) {
            field8903 = null;
            field8917 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3597(int arg0, int arg1, boolean arg2) {
        ++field8912;
        if (arg2) {
            field8917 = null;
        }
        return (256 & arg0) != 0;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class645() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        ++field8900;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field8919 = arg2.method2845(-1);
                                    }
                                } else {
                                    this.field8902 = arg2.method2845(-1);
                                }
                            } else {
                                this.field8904 = arg2.method2845(-1);
                            }
                        } else {
                            this.field8899 = arg2.method2845(-1);
                        }
                    } else {
                        this.field8908 = arg2.method2845(-1);
                    }
                } else {
                    this.field8910 = arg2.method2845(-1);
                }
            } else {
                this.field8916 = arg2.method2874((byte) -75);
            }
        } else {
            this.field8918 = arg2.method2874((byte) -75);
        }
        if (arg0 <= 100) {
            this.field8904 = 59;
        }
    }
}
