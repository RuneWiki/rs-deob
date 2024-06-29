import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class46 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    private int field717;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
    private int[] field715;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    private int[] field719;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[[F")
    private float[][] field716;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    private int[] field720;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()I", line = 4)
    public final int method397() {
        int var1;
        for (var1 = 0; this.field720[var1] >= 0; var1 = class63.method597() == 0 ? var1 + 1 : this.field720[var1]) {
        }
        return ~this.field720[var1];
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()[F", line = 12)
    public final float[] method398() {
        return this.field716[this.method397()];
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()V", line = 19)
    private final void method399() {
        int[] var1 = new int[this.field717];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field717; var3++) {
            int var4 = this.field715[var3];
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
        this.field720 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field717; var14++) {
            int var15 = this.field715[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field720[var17] == 0) {
                            this.field720[var17] = var13;
                        }
                        var17 = this.field720[var17];
                    }
                    if (var17 >= this.field720.length) {
                        int[] var20 = new int[this.field720.length * 2];
                        for (int var21 = 0; var21 < this.field720.length; var21++) {
                            var20[var21] = this.field720[var21];
                        }
                        this.field720 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field720[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I", line = 158)
    private static final int method400(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class287.method1959(arg1, var2, -3047) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 165)
    public class46() {
        class63.method601(24);
        this.field718 = class63.method601(16);
        this.field717 = class63.method601(24);
        this.field715 = new int[this.field717];
        boolean var1 = class63.method597() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class63.method601(5) + 1;
            while (var2 < this.field717) {
                int var4 = class63.method601(class272.method1857((byte) -120, this.field717 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field715[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class63.method597() != 0;
            for (int var7 = 0; var7 < this.field717; var7++) {
                if (var6 && class63.method597() == 0) {
                    this.field715[var7] = 0;
                } else {
                    this.field715[var7] = class63.method601(5) + 1;
                }
            }
        }
        this.method399();
        int var8 = class63.method601(4);
        if (var8 > 0) {
            float var9 = class63.method595(class63.method601(32));
            float var10 = class63.method595(class63.method601(32));
            int var11 = class63.method601(4) + 1;
            boolean var12 = class63.method597() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method400(this.field717, this.field718);
            } else {
                var13 = this.field718 * this.field717;
            }
            this.field719 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field719[var14] = class63.method601(var11);
            }
            this.field716 = new float[this.field717][this.field718];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field717; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field718; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field719[var19] * var10 + var9 + var16;
                        this.field716[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field717; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field718 * var21;
                    for (int var24 = 0; var24 < this.field718; var24++) {
                        float var25 = (float) this.field719[var23] * var10 + var9 + var22;
                        this.field716[var21][var24] = var25;
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
