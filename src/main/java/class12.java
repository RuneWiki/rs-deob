import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class12 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public int field231;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "[I")
    private int[] field233;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[I")
    private int[] field230;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[[F")
    private float[][] field232;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "[I")
    private int[] field235;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()[F", line = 4)
    public final float[] method71() {
        return this.field232[this.method73()];
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I", line = 9)
    private static final int method72(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class223.method1646(arg1, var2, true) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()I", line = 20)
    public final int method73() {
        int var1;
        for (var1 = 0; this.field235[var1] >= 0; var1 = class29.method186() == 0 ? var1 + 1 : this.field235[var1]) {
        }
        return ~this.field235[var1];
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()V", line = 28)
    private final void method74() {
        int[] var1 = new int[this.field234];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field234; var3++) {
            int var4 = this.field233[var3];
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
        this.field235 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field234; var14++) {
            int var15 = this.field233[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field235[var17] == 0) {
                            this.field235[var17] = var13;
                        }
                        var17 = this.field235[var17];
                    }
                    if (var17 >= this.field235.length) {
                        int[] var20 = new int[this.field235.length * 2];
                        for (int var21 = 0; var21 < this.field235.length; var21++) {
                            var20[var21] = this.field235[var21];
                        }
                        this.field235 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field235[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 165)
    public class12() {
        class29.method189(24);
        this.field231 = class29.method189(16);
        this.field234 = class29.method189(24);
        this.field233 = new int[this.field234];
        boolean var1 = class29.method186() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class29.method189(5) + 1;
            while (var2 < this.field234) {
                int var4 = class29.method189(class242.method1753((byte) 94, this.field234 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field233[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class29.method186() != 0;
            for (int var7 = 0; var7 < this.field234; var7++) {
                if (var6 && class29.method186() == 0) {
                    this.field233[var7] = 0;
                } else {
                    this.field233[var7] = class29.method189(5) + 1;
                }
            }
        }
        this.method74();
        int var8 = class29.method189(4);
        if (var8 > 0) {
            float var9 = class29.method193(class29.method189(32));
            float var10 = class29.method193(class29.method189(32));
            int var11 = class29.method189(4) + 1;
            boolean var12 = class29.method186() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method72(this.field234, this.field231);
            } else {
                var13 = this.field234 * this.field231;
            }
            this.field230 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field230[var14] = class29.method189(var11);
            }
            this.field232 = new float[this.field234][this.field231];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field234; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field231; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field230[var19] * var10 + var9 + var16;
                        this.field232[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field234; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field231 * var21;
                    for (int var24 = 0; var24 < this.field231; var24++) {
                        float var25 = (float) this.field230[var23] * var10 + var9 + var22;
                        this.field232[var21][var24] = var25;
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
