import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class363 extends class330 {

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    private int field5228 = 1024;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "I")
    private int field5235 = 81;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
    private int field5237 = 4;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    private int field5234 = 1024;

    @OriginalMember(owner = "client!hp", name = "W", descriptor = "I")
    private int field5247 = 409;

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "I")
    private int field5241 = 204;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    private int field5231 = 0;

    @OriginalMember(owner = "client!hp", name = "Z", descriptor = "I")
    private int field5250 = 8;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "Lqk;")
    public static class1 field5233 = new class1(67, 0);

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "[I")
    public static int[] field5236 = new int[2048];

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "[Z")
    public static boolean[] field5240 = new boolean[100];

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    private int field5238;

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!hp", name = "S", descriptor = "I")
    private int field5243;

    @OriginalMember(owner = "client!hp", name = "U", descriptor = "I")
    private int field5245;

    @OriginalMember(owner = "client!hp", name = "V", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!hp", name = "Y", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!hp", name = "ab", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!hp", name = "X", descriptor = "[I")
    private int[] field5248;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "[[I")
    private int[][] field5239;

    @OriginalMember(owner = "client!hp", name = "T", descriptor = "[[I")
    private int[][] field5244;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 4)
    public static void method2282(int arg0) {
        if (arg0 != 4096) {
            field5240 = null;
        }
        field5233 = null;
        field5236 = null;
        field5240 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)[I", line = 16)
    public final int[] method464(int arg0, boolean arg1) {
        ++field5246;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int var4 = 0;
            int var5;
            for (var5 = class300.field4352[arg0] + this.field5231; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field5250 > var4 && this.field5248[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field5248[var4];
            int var9 = this.field5248[var4 + -1];
            if (var9 - -this.field5245 < var5 && var8 - this.field5245 > var5) {
                for (int var10 = 0; var10 < class80.field901; ++var10) {
                    int var11 = var7 ? this.field5234 : -this.field5234;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field5243 * var11 >> 12) + class404.field5705[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field5237 < ~var12 && ~this.field5239[var6][var12] >= ~var13) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field5239[var6][var14];
                    int var16 = this.field5239[var6][var12];
                    if (~(this.field5245 + var15) > ~var13 && -this.field5245 + var16 > var13) {
                        var3[var10] = this.field5244[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class335.method2121(var3, 0, class80.field901, 0);
            }
        }
        if (arg1) {
            this.field5231 = 102;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V", line = 118)
    private final void method2283(int arg0) {
        ++field5229;
        Random var2 = new Random((long) this.field5250);
        this.field5245 = this.field5235 / 2;
        this.field5243 = 4096 / this.field5237;
        this.field5238 = 4096 / this.field5250;
        int var3 = this.field5243 / 2;
        int var4 = this.field5238 / 2;
        this.field5248 = new int[this.field5250 - -1];
        this.field5244 = new int[this.field5250][this.field5237];
        this.field5239 = new int[this.field5250][this.field5237 - -1];
        this.field5248[0] = 0;
        int var5 = 0;
        int var6 = -101 % ((arg0 - 61) / 44);
        while (var5 < this.field5250) {
            if (var5 > 0) {
                int var7 = this.field5238;
                int var8 = (class427.method2573(var2, 4096, -91) - 2048) * this.field5241 >> 12;
                int var9 = (var4 * var8 >> 12) + var7;
                this.field5248[var5] = this.field5248[var5 + -1] + var9;
            }
            this.field5239[var5][0] = 0;
            for (int var10 = 0; ~this.field5237 < ~var10; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field5243;
                    int var12 = (class427.method2573(var2, 4096, -102) + -2048) * this.field5247 >> 12;
                    int var13 = (var3 * var12 >> 12) + var11;
                    this.field5239[var5][var10] = this.field5239[var5][var10 + -1] + var13;
                }
                this.field5244[var5][var10] = ~this.field5228 >= -1 ? 4096 : 4096 + -class427.method2573(var2, this.field5228, -126);
            }
            this.field5239[var5][this.field5237] = 4096;
            ++var5;
        }
        this.field5248[this.field5250] = 4096;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V", line = 220)
    public class363() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(B)V", line = 188)
    public final void method653(byte arg0) {
        ++field5249;
        this.method2283(111);
        int var2 = -122 % ((arg0 - 50) / 41);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(DB)V", line = 205)
    public static final void method2284(double arg0, byte arg1) {
        int var3 = -98 % ((arg1 - -48) / 56);
        ++field5242;
        class579.field8132.method49(class747.field10317);
        class579.field8132.method47(0, 0, (int) arg0);
        class377.field5424.method194(class579.field8132);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Loaa;I[BI)Leca;", line = 237)
    public static final class356 method2285(class556 arg0, int arg1, byte[] arg2, int arg3) {
        ++field5230;
        if (arg2 == null) {
            return null;
        } else {
            if (arg3 != -750) {
                field5236 = null;
            }
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg1, var4);
            OpenGL.glProgramRawARB(arg1, 34933, arg2);
            OpenGL.glGetIntegerv(34379, class399.field5645, 0);
            if (~class399.field5645[0] != 0) {
                OpenGL.glBindProgramARB(arg1, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg1, 0);
                return new class356(arg0, arg1, var4);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lgga;IB)V", line = 267)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        int var4 = 65 / ((arg2 - -41) / 42);
        ++field5251;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field5228 = arg0.method3002(-1);
                                    }
                                } else {
                                    this.field5235 = arg0.method3002(-1);
                                }
                            } else {
                                this.field5231 = arg0.method3002(-1);
                            }
                        } else {
                            this.field5234 = arg0.method3002(-1);
                        }
                    } else {
                        this.field5241 = arg0.method3002(-1);
                    }
                } else {
                    this.field5247 = arg0.method3002(-1);
                }
            } else {
                this.field5250 = arg0.method3013(-109);
            }
        } else {
            this.field5237 = arg0.method3013(-124);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)Z", line = 369)
    public static final boolean method2286(byte arg0, int arg1) {
        ++field5232;
        if (arg0 != -24) {
            return false;
        } else {
            return arg1 == 4 || arg1 == 8 || arg1 == 11;
        }
    }
}
