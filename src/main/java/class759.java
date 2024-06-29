import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class759 extends class243 {

    @OriginalMember(owner = "client!wia", name = "I", descriptor = "I")
    private int field10577 = 409;

    @OriginalMember(owner = "client!wia", name = "K", descriptor = "I")
    private int field10579 = 0;

    @OriginalMember(owner = "client!wia", name = "T", descriptor = "I")
    private int field10588 = 8;

    @OriginalMember(owner = "client!wia", name = "Q", descriptor = "I")
    private int field10585 = 1024;

    @OriginalMember(owner = "client!wia", name = "M", descriptor = "I")
    private int field10581 = 1024;

    @OriginalMember(owner = "client!wia", name = "cb", descriptor = "I")
    private int field10597 = 4;

    @OriginalMember(owner = "client!wia", name = "ab", descriptor = "I")
    private int field10595 = 204;

    @OriginalMember(owner = "client!wia", name = "X", descriptor = "I")
    private int field10592 = 81;

    @OriginalMember(owner = "client!wia", name = "P", descriptor = "[Z")
    public static boolean[] field10584 = new boolean[100];

    @OriginalMember(owner = "client!wia", name = "G", descriptor = "I")
    public static int field10576 = 0;

    @OriginalMember(owner = "client!wia", name = "L", descriptor = "Z")
    public static boolean field10580 = false;

    @OriginalMember(owner = "client!wia", name = "D", descriptor = "I")
    public static int field10573;

    @OriginalMember(owner = "client!wia", name = "E", descriptor = "I")
    public static int field10574;

    @OriginalMember(owner = "client!wia", name = "F", descriptor = "I")
    public static int field10575;

    @OriginalMember(owner = "client!wia", name = "J", descriptor = "I")
    public static int field10578;

    @OriginalMember(owner = "client!wia", name = "N", descriptor = "I")
    private int field10582;

    @OriginalMember(owner = "client!wia", name = "O", descriptor = "I")
    public static int field10583;

    @OriginalMember(owner = "client!wia", name = "R", descriptor = "I")
    public static int field10586;

    @OriginalMember(owner = "client!wia", name = "W", descriptor = "I")
    public static int field10591;

    @OriginalMember(owner = "client!wia", name = "Z", descriptor = "I")
    private int field10594;

    @OriginalMember(owner = "client!wia", name = "bb", descriptor = "I")
    private int field10596;

    @OriginalMember(owner = "client!wia", name = "db", descriptor = "I")
    public static int field10598;

    @OriginalMember(owner = "client!wia", name = "V", descriptor = "Ljd;")
    public static class232 field10590;

    @OriginalMember(owner = "client!wia", name = "Y", descriptor = "[I")
    private int[] field10593;

    @OriginalMember(owner = "client!wia", name = "S", descriptor = "[[I")
    private int[][] field10587;

    @OriginalMember(owner = "client!wia", name = "U", descriptor = "[[I")
    private int[][] field10589;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 < -92) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (~arg0 != -6) {
                                    if (~arg0 != -7) {
                                        if (arg0 == 7) {
                                            this.field10581 = arg1.method3402((byte) 127);
                                        }
                                    } else {
                                        this.field10592 = arg1.method3402((byte) 127);
                                    }
                                } else {
                                    this.field10579 = arg1.method3402((byte) 127);
                                }
                            } else {
                                this.field10585 = arg1.method3402((byte) 127);
                            }
                        } else {
                            this.field10595 = arg1.method3402((byte) 127);
                        }
                    } else {
                        this.field10577 = arg1.method3402((byte) 127);
                    }
                } else {
                    this.field10588 = arg1.method3428((byte) 79);
                }
            } else {
                this.field10597 = arg1.method3428((byte) -123);
            }
            ++field10574;
        }
    }

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "(III)I")
    public static final int method4217(int arg0, int arg1, int arg2) {
        ++field10583;
        if (arg1 != 1391) {
            return 124;
        } else {
            int var3 = (arg0 & 127) * arg2 >> 7;
            if (var3 >= 2) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (arg0 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field10598;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int var4 = 0;
            int var5;
            for (var5 = class685.field9613[arg1] + this.field10579; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field10588 > var4 && var5 >= this.field10593[var4]) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field10593[var4];
            int var9 = this.field10593[var4 + -1];
            if (this.field10594 + var9 < var5 && ~var5 > ~(-this.field10594 + var8)) {
                for (int var10 = 0; var10 < class687.field9628; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field10585 : -this.field10585;
                    int var13;
                    for (var13 = (this.field10582 * var12 >> 12) + class666.field9279[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field10597 && this.field10589[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field10589[var6][var14];
                    int var16 = this.field10589[var6][var11];
                    if (var15 - -this.field10594 < var13 && ~(-this.field10594 + var16) < ~var13) {
                        var3[var10] = this.field10587[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class373.method2196(var3, 0, class687.field9628, 0);
            }
        }
        if (arg0 != 255) {
            this.field10595 = 39;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "(B)V")
    public final void method85(byte arg0) {
        this.method4218(64);
        if (arg0 != 66) {
            this.field10582 = -87;
        }
        ++field10578;
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(I)V")
    private final void method4218(int arg0) {
        ++field10591;
        Random var2 = new Random((long) this.field10588);
        this.field10594 = this.field10592 / 2;
        this.field10582 = 4096 / this.field10597;
        this.field10596 = 4096 / this.field10588;
        int var3 = this.field10582 / 2;
        this.field10589 = new int[this.field10588][this.field10597 + 1];
        this.field10593 = new int[this.field10588 + 1];
        this.field10587 = new int[this.field10588][this.field10597];
        int var4 = this.field10596 / 2;
        this.field10593[0] = 0;
        for (int var5 = 0; ~var5 > ~this.field10588; ++var5) {
            if (var5 > 0) {
                int var6 = this.field10596;
                int var7 = (class676.method3842(-28737, 4096, var2) + -2048) * this.field10595 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field10593[var5] = this.field10593[var5 + -1] + var8;
            }
            this.field10589[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field10597; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field10582;
                    int var11 = (class676.method3842(-28737, 4096, var2) + -2048) * this.field10577 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field10589[var5][var9] = this.field10589[var5][var9 - 1] + var12;
                }
                this.field10587[var5][var9] = ~this.field10581 >= -1 ? 4096 : 4096 + -class676.method3842(-28737, this.field10581, var2);
            }
            this.field10589[var5][this.field10597] = 4096;
        }
        if (arg0 < 62) {
            field10575 = -113;
        }
        this.field10593[this.field10588] = 4096;
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "()V")
    public class759() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Z)V")
    public static void method4219(boolean arg0) {
        field10590 = null;
        field10584 = null;
        if (!arg0) {
            field10590 = null;
        }
    }
}
