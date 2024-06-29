import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class172 extends class64 {

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    private int field3316 = 81;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    private int field3315 = 409;

    @OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
    private int field3324 = 204;

    @OriginalMember(owner = "client!ta", name = "ob", descriptor = "I")
    private int field3327 = 8;

    @OriginalMember(owner = "client!ta", name = "yb", descriptor = "I")
    private int field3337 = 4;

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
    private int field3320 = 1024;

    @OriginalMember(owner = "client!ta", name = "pb", descriptor = "I")
    private int field3328 = 0;

    @OriginalMember(owner = "client!ta", name = "Cb", descriptor = "I")
    private int field3341 = 1024;

    @OriginalMember(owner = "client!ta", name = "wb", descriptor = "Z")
    public static boolean field3335 = false;

    @OriginalMember(owner = "client!ta", name = "sb", descriptor = "I")
    public static int field3331 = 0;

    @OriginalMember(owner = "client!ta", name = "xb", descriptor = "I")
    public static int field3336 = 0;

    @OriginalMember(owner = "client!ta", name = "nb", descriptor = "J")
    public static long field3326 = 0L;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ta", name = "mb", descriptor = "I")
    private int field3325;

    @OriginalMember(owner = "client!ta", name = "qb", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ta", name = "rb", descriptor = "I")
    private int field3330;

    @OriginalMember(owner = "client!ta", name = "tb", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!ta", name = "ub", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!ta", name = "Ab", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ta", name = "Bb", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "Lfa;")
    public static class48 field3319;

    @OriginalMember(owner = "client!ta", name = "kb", descriptor = "Lke;")
    public static class95 field3323;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "[I")
    private int[] field3318;

    @OriginalMember(owner = "client!ta", name = "jb", descriptor = "[Lbg;")
    public static class18[] field3322;

    @OriginalMember(owner = "client!ta", name = "vb", descriptor = "[[I")
    private int[][] field3334;

    @OriginalMember(owner = "client!ta", name = "zb", descriptor = "[[I")
    private int[][] field3338;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field3329;
        int[] var3 = super.field1192.method19((byte) 126, arg0);
        if (arg1 != 19) {
            this.method14((byte) 63, (class127) null, -32);
        }
        if (super.field1192.field75) {
            int var4 = 0;
            int var5;
            for (var5 = class189.field3699[arg0] + this.field3328; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field3327 < ~var4 && ~var5 <= ~this.field3318[var4]) {
                ++var4;
            }
            float var6 = (float) this.field3318[var4 + -1];
            float var7 = (float) this.field3318[var4];
            if ((float) this.field3325 + var6 < (float) var5 && (float) var5 < var7 - (float) this.field3325) {
                for (int var8 = 0; class147.field2715 > var8; ++var8) {
                    int var9 = 0;
                    int var10 = var4 % 2 != 0 ? -this.field3320 : this.field3320;
                    int var11;
                    for (var11 = (this.field3330 * var10 >> 12) + class185.field3607[var8]; var11 < 0; var11 += 4096) {
                    }
                    while (var11 > 4096) {
                        var11 -= 4096;
                    }
                    while (~var9 > ~this.field3337 && this.field3338[var4 - 1][var9] <= var11) {
                        ++var9;
                    }
                    float var12 = (float) this.field3338[var4 + -1][var9 + -1];
                    float var13 = (float) this.field3338[var4 - 1][var9];
                    if ((float) var11 > (float) this.field3325 + var12 && (float) var11 < (float) (-this.field3325) + var13) {
                        var3[var8] = this.field3334[var4 + -1][var9 - 1];
                    } else {
                        var3[var8] = 0;
                    }
                }
            } else {
                class97.method581(var3, 0, class147.field2715, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "(I)V")
    private final void method1145(int arg0) {
        Random var2 = new Random((long) this.field3327);
        ++field3321;
        this.field3318 = new int[this.field3327 + 1];
        this.field3325 = this.field3316 / 2;
        this.field3333 = 4096 / this.field3327;
        int var3 = this.field3333 / 2;
        this.field3330 = 4096 / this.field3337;
        this.field3338 = new int[this.field3327][this.field3337 - -1];
        this.field3318[0] = 0;
        this.field3334 = new int[this.field3327][this.field3337];
        int var4 = this.field3330 / 2;
        if (arg0 != -3) {
            method1146(-40);
        }
        for (int var5 = 0; var5 < this.field3327; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3333;
                int var7 = (-2048 + class45.method283(arg0 ^ 1838102749, var2, 4096)) * this.field3324 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field3318[var5] = this.field3318[var5 + -1] + var8;
            }
            this.field3338[var5][0] = 0;
            for (int var9 = 0; this.field3337 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3330;
                    int var11 = (-2048 + class45.method283(-1838102752, var2, 4096)) * this.field3315 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field3338[var5][var9] = this.field3338[var5][var9 - 1] + var12;
                }
                this.field3334[var5][var9] = this.field3341 <= 0 ? 4096 : 4096 + -class45.method283(-1838102752, var2, this.field3341);
            }
            this.field3338[var5][this.field3337] = 4096;
        }
        this.field3318[this.field3327] = 4096;
    }

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(I)V")
    public static void method1146(int arg0) {
        field3322 = null;
        if (arg0 != 28432) {
            field3319 = null;
        }
        field3319 = null;
        field3323 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field3341 = arg1.method785(true);
                                    }
                                } else {
                                    this.field3316 = arg1.method785(true);
                                }
                            } else {
                                this.field3328 = arg1.method785(true);
                            }
                        } else {
                            this.field3320 = arg1.method785(true);
                        }
                    } else {
                        this.field3324 = arg1.method785(true);
                    }
                } else {
                    this.field3315 = arg1.method785(true);
                }
            } else {
                this.field3327 = arg1.method819((byte) 22);
            }
        } else {
            this.field3337 = arg1.method819((byte) 22);
        }
        int var5 = -36 % ((arg0 - -60) / 36);
        ++field3340;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        ++field3332;
        this.method1145(-3);
        if (arg0) {
            this.method14((byte) -5, (class127) null, -27);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILwb;)V")
    public static final void method1147(int arg0, class200 arg1) {
        ++field3314;
        class63.method391(4894, 200000, arg1);
        if (arg0 != -19955) {
            method1149(true);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
    public static final void method1148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3317;
        if (arg4 == -15062) {
            for (int var5 = 0; class201.field3930 > var5; ++var5) {
                if (~(class63.field1164[var5] + class107.field1952[var5]) < ~arg2 && ~class63.field1164[var5] > ~(arg0 + arg2) && ~arg1 > ~(class85.field1570[var5] + class112.field2055[var5]) && class85.field1570[var5] < arg1 + arg3) {
                    class176.field3449[var5] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Z)Lo;")
    public static final class126 method1149(boolean arg0) {
        ++field3339;
        try {
            if (arg0) {
                method1147(-113, (class200) null);
            }
            return (class126) Class.forName("dd").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class172() {
        super(0, true);
    }
}
