import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class520 extends class328 {

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    private int field7217 = 409;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    private int field7219 = 0;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    private int field7230 = 8;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    private int field7220 = 1024;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    private int field7225 = 4;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    private int field7231 = 204;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    private int field7221 = 1024;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    private int field7227 = 81;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "F")
    public static float field7232 = 1.0F;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    private int field7226;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    private int field7228;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    private int field7233;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "[I")
    private int[] field7218;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "[[I")
    private int[][] field7224;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "[[I")
    private int[][] field7229;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[I[II)V")
    public static final void method2940(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        ++field7222;
        if (arg4 == 1) {
            if (~arg0 < ~arg1) {
                int var5 = (arg0 + arg1) / 2;
                int var6 = arg1;
                int var7 = arg2[var5];
                arg2[var5] = arg2[arg0];
                arg2[arg0] = var7;
                int var8 = arg3[var5];
                arg3[var5] = arg3[arg0];
                arg3[arg0] = var8;
                int var9 = var7 != Integer.MAX_VALUE ? 1 : 0;
                for (int var10 = arg1; ~arg0 < ~var10; ++var10) {
                    if (~((var9 & var10) + var7) < ~arg2[var10]) {
                        int var11 = arg2[var10];
                        arg2[var10] = arg2[var6];
                        arg2[var6] = var11;
                        int var12 = arg3[var10];
                        arg3[var10] = arg3[var6];
                        arg3[var6++] = var12;
                    }
                }
                arg2[arg0] = arg2[var6];
                arg2[var6] = var7;
                arg3[arg0] = arg3[var6];
                arg3[var6] = var8;
                method2940(var6 + -1, arg1, arg2, arg3, arg4);
                method2940(arg0, var6 + 1, arg2, arg3, 1);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class520() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (arg0 > -97) {
            method2940(89, -68, (int[]) null, (int[]) null, 48);
        }
        ++field7215;
        this.method2941(-108);
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    private final void method2941(int arg0) {
        ++field7216;
        Random var2 = new Random((long) this.field7230);
        this.field7228 = 4096 / this.field7225;
        this.field7226 = 4096 / this.field7230;
        this.field7233 = this.field7227 / 2;
        int var3 = this.field7228 / 2;
        this.field7229 = new int[this.field7230][this.field7225 + 1];
        int var4 = this.field7226 / 2;
        this.field7218 = new int[this.field7230 + 1];
        this.field7224 = new int[this.field7230][this.field7225];
        this.field7218[0] = 0;
        for (int var5 = 0; var5 < this.field7230; ++var5) {
            if (var5 > 0) {
                int var7 = this.field7226;
                int var8 = (class407.method2472(40, var2, 4096) - 2048) * this.field7231 >> 12;
                int var9 = (var4 * var8 >> 12) + var7;
                this.field7218[var5] = this.field7218[var5 + -1] + var9;
            }
            this.field7229[var5][0] = 0;
            for (int var10 = 0; ~var10 > ~this.field7225; ++var10) {
                if (var10 > 0) {
                    int var11 = this.field7228;
                    int var12 = (-2048 + class407.method2472(-105, var2, 4096)) * this.field7217 >> 12;
                    int var13 = (var3 * var12 >> 12) + var11;
                    this.field7229[var5][var10] = this.field7229[var5][var10 + -1] - -var13;
                }
                this.field7224[var5][var10] = ~this.field7221 < -1 ? 4096 - class407.method2472(-91, var2, this.field7221) : 4096;
            }
            this.field7229[var5][this.field7225] = 4096;
        }
        int var6 = -70 / ((-37 - arg0) / 58);
        this.field7218[this.field7230] = 4096;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        int var3 = -23 / ((arg1 - 48) / 56);
        ++field7234;
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int var5 = 0;
            int var6;
            for (var6 = class638.field9258[arg0] + this.field7219; ~var6 > -1; var6 += 4096) {
            }
            while (~var6 < -4097) {
                var6 -= 4096;
            }
            while (var5 < this.field7230 && ~this.field7218[var5] >= ~var6) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = ~(var5 & 1) == -1;
            int var9 = this.field7218[var5];
            int var10 = this.field7218[var5 + -1];
            if (var6 > var10 - -this.field7233 && ~(-this.field7233 + var9) < ~var6) {
                for (int var11 = 0; class449.field6539 > var11; ++var11) {
                    int var12 = 0;
                    int var13 = var8 ? this.field7220 : -this.field7220;
                    int var14;
                    for (var14 = class206.field2924[var11] - -(this.field7228 * var13 >> 12); ~var14 > -1; var14 += 4096) {
                    }
                    while (~var14 < -4097) {
                        var14 -= 4096;
                    }
                    while (var12 < this.field7225 && ~this.field7229[var7][var12] >= ~var14) {
                        ++var12;
                    }
                    int var15 = var12 + -1;
                    int var16 = this.field7229[var7][var15];
                    int var17 = this.field7229[var7][var12];
                    if (~var14 < ~(this.field7233 + var16) && var14 < -this.field7233 + var17) {
                        var4[var11] = this.field7224[var7][var15];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class164.method1149(var4, 0, class449.field6539, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field7223;
        if (arg0 < 75) {
            this.field7227 = 32;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field7221 = arg2.method1745(32132);
                                    }
                                } else {
                                    this.field7227 = arg2.method1745(32132);
                                }
                            } else {
                                this.field7219 = arg2.method1745(32132);
                            }
                        } else {
                            this.field7220 = arg2.method1745(32132);
                        }
                    } else {
                        this.field7231 = arg2.method1745(32132);
                    }
                } else {
                    this.field7217 = arg2.method1745(32132);
                }
            } else {
                this.field7230 = arg2.method1738(255);
            }
        } else {
            this.field7225 = arg2.method1738(255);
        }
    }
}
