import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class348 extends class349 {

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    private int field5089 = 4096;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "[I")
    private int[] field5087 = new int[3];

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    private int field5092 = 4096;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    private int field5093 = 409;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    private int field5091 = 4096;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "Ljj;")
    public static class398 field5095 = new class398(8, -1);

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "Len;")
    public static class5 field5096;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(III)I")
    public static final int method2177(int arg0, int arg1, int arg2) {
        ++field5090;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        if (arg1 != 133981816) {
            return 24;
        } else {
            int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
            return (var5 & 133981816) >> 19;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public static void method2178(boolean arg0) {
        field5096 = null;
        if (!arg0) {
            method2177(25, 105, -128);
        }
        field5095 = null;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class348() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        ++field5088;
        int var3 = -50 % ((arg1 - -32) / 47);
        int[][] var4 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314) {
            int[][] var5 = this.method2180(0, 118, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class39.field497; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field5087[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (~var14 < ~this.field5093) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = var15 - this.field5087[1];
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~this.field5093 > ~var16) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = var17 - this.field5087[2];
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (var18 > this.field5093) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field5091 * var13 >> 12;
                            var10[var12] = this.field5092 * var15 >> 12;
                            var11[var12] = this.field5089 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            method2178(false);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            int var5 = arg2.method904(127);
                            this.field5087[2] = class230.method1424(0, var5 >> 12);
                            this.field5087[1] = class230.method1424(var5 >> 4, 4080);
                            this.field5087[0] = class230.method1424(var5, 16711680) << 4;
                        }
                    } else {
                        this.field5091 = arg2.method922((byte) -127);
                    }
                } else {
                    this.field5092 = arg2.method922((byte) -125);
                }
            } else {
                this.field5089 = arg2.method922((byte) -117);
            }
        } else {
            this.field5093 = arg2.method922((byte) -128);
        }
        ++field5094;
    }
}
