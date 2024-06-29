import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class236 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    private int field3707;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
    private int[] field3704;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    private int[] field3705;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[[F")
    private float[][] field3706;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[I")
    private int[] field3708;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V", line = 4)
    private final void method1695() {
        int[] var1 = new int[this.field3707];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3707; var3++) {
            int var4 = this.field3704[var3];
            if (var4 != 0) {
                int var5 = 0x1 << 32 - var4;
                int var6 = var2[var4];
                var1[var3] = var6;
                int var7;
                if ((var6 & var5) == 0) {
                    var7 = var6 | var5;
                    for (int var8 = var4 - 1; var8 >= 1; var8--) {
                        int var9 = var2[var8];
                        if (var6 != var9) {
                            break;
                        }
                        int var10 = 0x1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }
                        var2[var8] = var9 | var10;
                    }
                } else {
                    var7 = var2[var4 - 1];
                }
                var2[var4] = var7;
                for (int var11 = var4 + 1; var11 <= 32; var11++) {
                    int var12 = var2[var11];
                    if (var6 == var12) {
                        var2[var11] = var7;
                    }
                }
            }
        }
        this.field3708 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field3707; var14++) {
            int var15 = this.field3704[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field3708[var17] == 0) {
                            this.field3708[var17] = var13;
                        }
                        var17 = this.field3708[var17];
                    }
                    if (var17 >= this.field3708.length) {
                        int[] var20 = new int[this.field3708.length * 2];
                        for (int var21 = 0; var21 < this.field3708.length; var21++) {
                            var20[var21] = this.field3708[var21];
                        }
                        this.field3708 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field3708[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()I", line = 143)
    public final int method1696() {
        int var1;
        for (var1 = 0; this.field3708[var1] >= 0; var1 = class168.method1254() == 0 ? var1 + 1 : this.field3708[var1]) {
        }
        return ~this.field3708[var1];
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()[F", line = 150)
    public final float[] method1697() {
        return this.field3706[this.method1696()];
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)I", line = 156)
    private static final int method1698(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class193.method1425(0, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 165)
    public class236() {
        class168.method1257(24);
        this.field3703 = class168.method1257(16);
        this.field3707 = class168.method1257(24);
        this.field3704 = new int[this.field3707];
        boolean var1 = class168.method1254() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class168.method1257(5) + 1;
            while (var2 < this.field3707) {
                int var4 = class168.method1257(class141.method1050(this.field3707 - var2, (byte) -41));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3704[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class168.method1254() != 0;
            for (int var7 = 0; var7 < this.field3707; var7++) {
                if (var6 && class168.method1254() == 0) {
                    this.field3704[var7] = 0;
                } else {
                    this.field3704[var7] = class168.method1257(5) + 1;
                }
            }
        }
        this.method1695();
        int var8 = class168.method1257(4);
        if (var8 > 0) {
            float var9 = class168.method1256(class168.method1257(32));
            float var10 = class168.method1256(class168.method1257(32));
            int var11 = class168.method1257(4) + 1;
            boolean var12 = class168.method1254() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1698(this.field3707, this.field3703);
            } else {
                var13 = this.field3707 * this.field3703;
            }
            this.field3705 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3705[var14] = class168.method1257(var11);
            }
            this.field3706 = new float[this.field3707][this.field3703];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3707; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3703; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3705[var19] * var10 + var9 + var16;
                        this.field3706[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3707; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field3703 * var21;
                    for (int var24 = 0; var24 < this.field3703; var24++) {
                        float var25 = (float) this.field3705[var23] * var10 + var9 + var22;
                        this.field3706[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }
}
