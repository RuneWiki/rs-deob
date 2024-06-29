import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class308 extends class615 {

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    private int field4243 = 8;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    private int field4251 = 0;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    private int field4248 = 81;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    private int field4256 = 4;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    private int field4245 = 1024;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    private int field4242 = 1024;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    private int field4255 = 204;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    private int field4246 = 409;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Lqw;")
    public static class71 field4241 = new class71(2, 3);

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    private int field4247;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    private int field4260;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "[I")
    private int[] field4263;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "[[I")
    private int[][] field4250;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "[[I")
    private int[][] field4259;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)[I", line = 6)
    public final int[] method8(int arg0, byte arg1) {
        ++field4254;
        int[] var3 = super.field8125.method298(arg0, arg1 + -100);
        if (arg1 != -18) {
            this.method10(32);
        }
        if (super.field8125.field579) {
            int var4 = 0;
            int var5;
            for (var5 = class402.field5353[arg0] + this.field4251; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field4243 && var5 >= this.field4263[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field4263[var4];
            int var9 = this.field4263[var4 + -1];
            if (var5 > var9 - -this.field4247 && var5 < var8 - this.field4247) {
                for (int var10 = 0; var10 < class505.field6740; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field4245 : this.field4245;
                    int var13;
                    for (var13 = (this.field4260 * var12 >> 12) + class168.field2599[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field4256 && var13 >= this.field4259[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field4259[var6][var11];
                    int var16 = this.field4259[var6][var14];
                    if (var16 - -this.field4247 < var13 && ~var13 > ~(-this.field4247 + var15)) {
                        var3[var10] = this.field4250[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class83.method684(var3, 0, class505.field6740, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 111)
    public class308() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V", line = 123)
    public static void method1848(int arg0) {
        field4241 = null;
        if (arg0 != 4096) {
            field4261 = 13;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLeh;)V", line = 144)
    public static final void method1849(byte arg0, class335 arg1) {
        if (arg0 == -12) {
            ++field4262;
            byte[] var2 = new byte[24];
            if (class221.field3134 != null) {
                try {
                    class221.field3134.method3302(0L, (byte) -51);
                    class221.field3134.method3301(var2, 0);
                    int var3;
                    for (var3 = 0; ~var3 > -25 && var2[var3] == 0; ++var3) {
                    }
                    if (~var3 <= -25) {
                        throw new IOException();
                    }
                } catch (Exception var5) {
                    for (int var4 = 0; var4 < 24; ++var4) {
                        var2[var4] = -1;
                    }
                }
            }
            arg1.method2004(255, var2, 0, 24);
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V", line = 193)
    private final void method1850(int arg0) {
        ++field4244;
        Random var2 = new Random((long) this.field4243);
        this.field4252 = 4096 / this.field4243;
        this.field4260 = 4096 / this.field4256;
        this.field4247 = this.field4248 / 2;
        int var3 = this.field4260 / 2;
        this.field4263 = new int[this.field4243 + 1];
        int var4 = this.field4252 / 2;
        this.field4250 = new int[this.field4243][this.field4256];
        this.field4259 = new int[this.field4243][this.field4256 + 1];
        this.field4263[0] = 0;
        if (arg0 == 6749) {
            for (int var5 = 0; ~var5 > ~this.field4243; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field4252;
                    int var7 = (class660.method3697(0, 4096, var2) + -2048) * this.field4255 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field4263[var5] = this.field4263[var5 + -1] - -var8;
                }
                this.field4259[var5][0] = 0;
                for (int var9 = 0; ~var9 > ~this.field4256; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field4260;
                        int var11 = (class660.method3697(arg0 ^ 6749, 4096, var2) + -2048) * this.field4246 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field4259[var5][var9] = this.field4259[var5][var9 + -1] + var12;
                    }
                    this.field4250[var5][var9] = ~this.field4242 >= -1 ? 4096 : 4096 + -class660.method3697(0, this.field4242, var2);
                }
                this.field4259[var5][this.field4256] = 4096;
            }
            this.field4263[this.field4243] = 4096;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILeh;)V", line = 257)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field4249;
        if (arg0 <= 44) {
            this.field4251 = -14;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field4242 = arg2.method2001((byte) -83);
                                    }
                                } else {
                                    this.field4248 = arg2.method2001((byte) -83);
                                }
                            } else {
                                this.field4251 = arg2.method2001((byte) -83);
                            }
                        } else {
                            this.field4245 = arg2.method2001((byte) -83);
                        }
                    } else {
                        this.field4255 = arg2.method2001((byte) -83);
                    }
                } else {
                    this.field4246 = arg2.method2001((byte) -83);
                }
            } else {
                this.field4243 = arg2.method2034(255);
            }
        } else {
            this.field4256 = arg2.method2034(255);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 346)
    public final void method10(int arg0) {
        if (arg0 == 12404) {
            ++field4253;
            this.method1850(6749);
        }
    }
}
