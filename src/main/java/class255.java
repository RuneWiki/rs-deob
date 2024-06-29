import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class255 extends class642 {

    @OriginalMember(owner = "client!uea", name = "B", descriptor = "I")
    private int field3314 = 1024;

    @OriginalMember(owner = "client!uea", name = "D", descriptor = "I")
    private int field3316 = 1024;

    @OriginalMember(owner = "client!uea", name = "F", descriptor = "I")
    private int field3318 = 204;

    @OriginalMember(owner = "client!uea", name = "I", descriptor = "I")
    private int field3321 = 0;

    @OriginalMember(owner = "client!uea", name = "N", descriptor = "I")
    private int field3325 = 8;

    @OriginalMember(owner = "client!uea", name = "T", descriptor = "I")
    private int field3331 = 4;

    @OriginalMember(owner = "client!uea", name = "S", descriptor = "I")
    private int field3330 = 409;

    @OriginalMember(owner = "client!uea", name = "Q", descriptor = "I")
    private int field3328 = 81;

    @OriginalMember(owner = "client!uea", name = "G", descriptor = "I")
    public static int field3319 = 0;

    @OriginalMember(owner = "client!uea", name = "C", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!uea", name = "E", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!uea", name = "H", descriptor = "I")
    private int field3320;

    @OriginalMember(owner = "client!uea", name = "K", descriptor = "I")
    private int field3322;

    @OriginalMember(owner = "client!uea", name = "L", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!uea", name = "R", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!uea", name = "U", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!uea", name = "V", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!uea", name = "O", descriptor = "[I")
    private int[] field3326;

    @OriginalMember(owner = "client!uea", name = "M", descriptor = "[[I")
    private int[][] field3324;

    @OriginalMember(owner = "client!uea", name = "P", descriptor = "[[I")
    private int[][] field3327;

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V", line = 16)
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILgk;B)V", line = 22)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field3316 = arg1.method3169(26488);
                                    }
                                } else {
                                    this.field3328 = arg1.method3169(26488);
                                }
                            } else {
                                this.field3321 = arg1.method3169(26488);
                            }
                        } else {
                            this.field3314 = arg1.method3169(26488);
                        }
                    } else {
                        this.field3318 = arg1.method3169(26488);
                    }
                } else {
                    this.field3330 = arg1.method3169(26488);
                }
            } else {
                this.field3325 = arg1.method3115(29871);
            }
        } else {
            this.field3331 = arg1.method3115(29871);
        }
        ++field3315;
        if (arg2 < 29) {
            this.field3314 = 90;
        }
    }

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "(I)V", line = 108)
    public final void method2(int arg0) {
        if (arg0 != 6276) {
            this.field3320 = 98;
        }
        ++field3332;
        this.method1524(0);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "([BB)Ljava/lang/String;", line = 119)
    public static final String method1523(byte[] arg0, byte arg1) {
        if (arg1 < 80) {
            method1523((byte[]) null, (byte) 29);
        }
        ++field3323;
        return class279.method1652(arg0, 0, arg0.length, 110);
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)[I", line = 130)
    public final int[] method3(int arg0, int arg1) {
        if (arg1 != -9) {
            return null;
        } else {
            ++field3329;
            int[] var3 = super.field9216.method1185(arg0, -126);
            if (super.field9216.field2418) {
                int var4 = 0;
                int var5;
                for (var5 = class400.field6026[arg0] + this.field3321; var5 < 0; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (~var4 > ~this.field3325 && this.field3326[var4] <= var5) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(1 & var4) == -1;
                int var8 = this.field3326[var4];
                int var9 = this.field3326[var4 + -1];
                if (var9 - -this.field3333 < var5 && var8 - this.field3333 > var5) {
                    for (int var10 = 0; class338.field4909 > var10; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field3314 : this.field3314;
                        int var13;
                        for (var13 = (this.field3322 * var12 >> 12) + class542.field8026[var10]; ~var13 > -1; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (~var11 > ~this.field3331 && ~this.field3327[var6][var11] >= ~var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field3327[var6][var11];
                        int var16 = this.field3327[var6][var14];
                        if (~var13 < ~(this.field3333 + var16) && var13 < -this.field3333 + var15) {
                            var3[var10] = this.field3324[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class667.method3738(var3, 0, class338.field4909, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "(I)V", line = 231)
    private final void method1524(int arg0) {
        ++field3317;
        Random var2 = new Random((long) this.field3325);
        this.field3320 = 4096 / this.field3325;
        this.field3333 = this.field3328 / 2;
        this.field3322 = 4096 / this.field3331;
        int var3 = this.field3322 / 2;
        this.field3326 = new int[this.field3325 + 1];
        int var4 = this.field3320 / 2;
        this.field3327 = new int[this.field3325][this.field3331 + 1];
        this.field3324 = new int[this.field3325][this.field3331];
        this.field3326[arg0] = 0;
        for (int var5 = 0; ~var5 > ~this.field3325; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3320;
                int var7 = (-2048 + class339.method2095(true, var2, 4096)) * this.field3318 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3326[var5] = this.field3326[var5 - 1] + var8;
            }
            this.field3327[var5][0] = 0;
            for (int var9 = 0; ~this.field3331 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field3322;
                    int var11 = (class339.method2095(true, var2, 4096) - 2048) * this.field3330 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3327[var5][var9] = this.field3327[var5][var9 - 1] - -var12;
                }
                this.field3324[var5][var9] = this.field3316 <= 0 ? 4096 : 4096 - class339.method2095(true, var2, this.field3316);
            }
            this.field3327[var5][this.field3331] = 4096;
        }
        this.field3326[this.field3325] = 4096;
    }
}
