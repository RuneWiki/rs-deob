import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class464 extends class325 {

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    private int field6436 = 0;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
    private int field6449 = 204;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    private int field6441 = 1024;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    private int field6440 = 409;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    private int field6442 = 4;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "I")
    private int field6447 = 8;

    @OriginalMember(owner = "client!io", name = "V", descriptor = "I")
    private int field6454 = 81;

    @OriginalMember(owner = "client!io", name = "T", descriptor = "I")
    private int field6452 = 1024;

    @OriginalMember(owner = "client!io", name = "W", descriptor = "D")
    public static double field6455;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    private int field6437;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    private int field6438;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    private int field6439;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!io", name = "U", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "[I")
    private int[] field6446;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "[[I")
    private int[][] field6443;

    @OriginalMember(owner = "client!io", name = "S", descriptor = "[[I")
    private int[][] field6451;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        if (arg0 < 21) {
            return null;
        } else {
            ++field6448;
            int[] var3 = super.field4727.method2603(arg1, -13476);
            if (super.field4727.field6067) {
                int var4 = 0;
                int var5;
                for (var5 = class621.field8370[arg1] - -this.field6436; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (~this.field6447 < ~var4 && var5 >= this.field6446[var4]) {
                    ++var4;
                }
                int var6 = var4 - 1;
                boolean var7 = (var4 & 1) == 0;
                int var8 = this.field6446[var4];
                int var9 = this.field6446[var4 + -1];
                if (this.field6439 + var9 < var5 && ~var5 > ~(var8 - this.field6439)) {
                    for (int var10 = 0; var10 < class261.field3874; ++var10) {
                        int var11 = 0;
                        int var12 = var7 ? this.field6452 : -this.field6452;
                        int var13;
                        for (var13 = (this.field6438 * var12 >> 12) + class556.field7498[var10]; ~var13 > -1; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (var11 < this.field6442 && ~this.field6443[var6][var11] >= ~var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field6443[var6][var11];
                        int var16 = this.field6443[var6][var14];
                        if (~(var16 - -this.field6439) > ~var13 && ~(-this.field6439 + var15) < ~var13) {
                            var3[var10] = this.field6451[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class278.method1802(var3, 0, class261.field3874, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
    public final void method101(boolean arg0) {
        ++field6453;
        if (arg0) {
            this.method2751((byte) 108);
        }
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "(B)V")
    private final void method2751(byte arg0) {
        ++field6444;
        Random var2 = new Random((long) this.field6447);
        int var3 = -92 / ((55 - arg0) / 52);
        this.field6439 = this.field6454 / 2;
        this.field6438 = 4096 / this.field6442;
        this.field6437 = 4096 / this.field6447;
        int var4 = this.field6438 / 2;
        this.field6451 = new int[this.field6447][this.field6442];
        this.field6446 = new int[this.field6447 + 1];
        int var5 = this.field6437 / 2;
        this.field6443 = new int[this.field6447][this.field6442 + 1];
        this.field6446[0] = 0;
        for (int var6 = 0; ~var6 > ~this.field6447; ++var6) {
            if (var6 > 0) {
                int var7 = this.field6437;
                int var8 = (class739.method4090(var2, 122, 4096) + -2048) * this.field6449 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field6446[var6] = this.field6446[var6 + -1] + var9;
            }
            this.field6443[var6][0] = 0;
            for (int var10 = 0; var10 < this.field6442; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field6438;
                    int var12 = (-2048 + class739.method4090(var2, 48, 4096)) * this.field6440 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field6443[var6][var10] = this.field6443[var6][var10 + -1] - -var13;
                }
                this.field6451[var6][var10] = this.field6441 <= 0 ? 4096 : 4096 + -class739.method4090(var2, 124, this.field6441);
            }
            this.field6443[var6][this.field6442] = 4096;
        }
        this.field6446[this.field6447] = 4096;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field6450;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 == -8) {
                                        this.field6441 = arg0.method2359(-1);
                                    }
                                } else {
                                    this.field6454 = arg0.method2359(-1);
                                }
                            } else {
                                this.field6436 = arg0.method2359(-1);
                            }
                        } else {
                            this.field6452 = arg0.method2359(-1);
                        }
                    } else {
                        this.field6449 = arg0.method2359(-1);
                    }
                } else {
                    this.field6440 = arg0.method2359(-1);
                }
            } else {
                this.field6447 = arg0.method2398(-1372747256);
            }
        } else {
            this.field6442 = arg0.method2398(-1372747256);
        }
        if (arg2 >= -41) {
            this.method100((byte) 28, -8);
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
    public class464() {
        super(0, true);
    }
}
