import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class559 extends class335 {

    @OriginalMember(owner = "client!eda", name = "B", descriptor = "I")
    private int field7617 = 0;

    @OriginalMember(owner = "client!eda", name = "D", descriptor = "I")
    private int field7619 = 81;

    @OriginalMember(owner = "client!eda", name = "P", descriptor = "I")
    private int field7630 = 1024;

    @OriginalMember(owner = "client!eda", name = "C", descriptor = "I")
    private int field7618 = 1024;

    @OriginalMember(owner = "client!eda", name = "O", descriptor = "I")
    private int field7629 = 4;

    @OriginalMember(owner = "client!eda", name = "S", descriptor = "I")
    private int field7633 = 204;

    @OriginalMember(owner = "client!eda", name = "T", descriptor = "I")
    private int field7634 = 8;

    @OriginalMember(owner = "client!eda", name = "N", descriptor = "I")
    private int field7628 = 409;

    @OriginalMember(owner = "client!eda", name = "M", descriptor = "Z")
    public static boolean field7627 = false;

    @OriginalMember(owner = "client!eda", name = "E", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!eda", name = "G", descriptor = "I")
    private int field7621;

    @OriginalMember(owner = "client!eda", name = "I", descriptor = "I")
    private int field7623;

    @OriginalMember(owner = "client!eda", name = "K", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!eda", name = "Q", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!eda", name = "R", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!eda", name = "V", descriptor = "I")
    private int field7636;

    @OriginalMember(owner = "client!eda", name = "L", descriptor = "Ltq;")
    public static class92 field7626;

    @OriginalMember(owner = "client!eda", name = "J", descriptor = "[I")
    private int[] field7624;

    @OriginalMember(owner = "client!eda", name = "H", descriptor = "[[I")
    private int[][] field7622;

    @OriginalMember(owner = "client!eda", name = "U", descriptor = "[[I")
    private int[][] field7635;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field7618 = arg1.method963(arg2 + -61);
                                    }
                                } else {
                                    this.field7619 = arg1.method963(-123);
                                }
                            } else {
                                this.field7617 = arg1.method963(-119);
                            }
                        } else {
                            this.field7630 = arg1.method963(-121);
                        }
                    } else {
                        this.field7633 = arg1.method963(-128);
                    }
                } else {
                    this.field7628 = arg1.method963(-122);
                }
            } else {
                this.field7634 = arg1.method930(255);
            }
        } else {
            this.field7629 = arg1.method930(arg2 ^ -191);
        }
        ++field7631;
        if (arg2 != -66) {
            this.field7634 = 93;
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
    public class559() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    public final void method317(byte arg0) {
        this.method3103(111);
        int var2 = -76 / ((58 - arg0) / 60);
        ++field7632;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            method3102(false);
        }
        ++field7625;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int var4 = 0;
            int var5;
            for (var5 = class686.field9697[arg1] + this.field7617; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field7634 < ~var4 && var5 >= this.field7624[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field7624[var4];
            int var9 = this.field7624[var4 + -1];
            if (~var5 < ~(this.field7621 + var9) && ~var5 > ~(-this.field7621 + var8)) {
                for (int var10 = 0; var10 < class649.field8968; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field7630 : this.field7630;
                    int var13;
                    for (var13 = (this.field7623 * var12 >> 12) + class376.field4981[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field7629 && this.field7622[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field7622[var6][var11];
                    int var16 = this.field7622[var6][var14];
                    if (var13 > this.field7621 + var16 && ~var13 > ~(-this.field7621 + var15)) {
                        var3[var10] = this.field7635[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class2.method8(var3, 0, class649.field8968, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(Z)V")
    public static void method3102(boolean arg0) {
        if (arg0) {
            field7626 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V")
    private final void method3103(int arg0) {
        ++field7620;
        Random var2 = new Random((long) this.field7634);
        this.field7623 = 4096 / this.field7629;
        this.field7621 = this.field7619 / 2;
        this.field7636 = 4096 / this.field7634;
        int var3 = -80 % ((arg0 - -42) / 53);
        int var4 = this.field7623 / 2;
        int var5 = this.field7636 / 2;
        this.field7622 = new int[this.field7634][this.field7629 + 1];
        this.field7635 = new int[this.field7634][this.field7629];
        this.field7624 = new int[this.field7634 - -1];
        this.field7624[0] = 0;
        for (int var6 = 0; ~var6 > ~this.field7634; ++var6) {
            if (var6 > 0) {
                int var7 = this.field7636;
                int var8 = (class584.method3227(false, 4096, var2) + -2048) * this.field7633 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field7624[var6] = this.field7624[var6 + -1] - -var9;
            }
            this.field7622[var6][0] = 0;
            for (int var10 = 0; ~this.field7629 < ~var10; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field7623;
                    int var12 = (class584.method3227(false, 4096, var2) + -2048) * this.field7628 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field7622[var6][var10] = this.field7622[var6][var10 + -1] + var13;
                }
                this.field7635[var6][var10] = this.field7618 <= 0 ? 4096 : -class584.method3227(false, this.field7618, var2) + 4096;
            }
            this.field7622[var6][this.field7629] = 4096;
        }
        this.field7624[this.field7634] = 4096;
    }
}
