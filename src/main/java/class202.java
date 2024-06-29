import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class202 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    private int field3492;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[I")
    private int[] field3489;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[I")
    private int[] field3490;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[[F")
    private float[][] field3491;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
    private int[] field3494;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()I", line = 4)
    public final int method1464() {
        int var1;
        for (var1 = 0; this.field3494[var1] >= 0; var1 = class52.method318() == 0 ? var1 + 1 : this.field3494[var1]) {
        }
        return ~this.field3494[var1];
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()V", line = 14)
    private final void method1465() {
        int[] var1 = new int[this.field3492];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3492; var3++) {
            int var4 = this.field3489[var3];
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
        this.field3494 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field3492; var14++) {
            int var15 = this.field3489[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field3494[var17] == 0) {
                            this.field3494[var17] = var13;
                        }
                        var17 = this.field3494[var17];
                    }
                    if (var17 >= this.field3494.length) {
                        int[] var20 = new int[this.field3494.length * 2];
                        for (int var21 = 0; var21 < this.field3494.length; var21++) {
                            var20[var21] = this.field3494[var21];
                        }
                        this.field3494 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field3494[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I", line = 153)
    private static final int method1466(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class277.method1937(var2, arg1, 0) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()[F", line = 161)
    public final float[] method1467() {
        return this.field3491[this.method1464()];
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V", line = 165)
    public class202() {
        class52.method315(24);
        this.field3493 = class52.method315(16);
        this.field3492 = class52.method315(24);
        this.field3489 = new int[this.field3492];
        boolean var1 = class52.method318() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class52.method315(5) + 1;
            while (var2 < this.field3492) {
                int var4 = class52.method315(class127.method944(this.field3492 - var2, (byte) -72));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3489[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class52.method318() != 0;
            for (int var7 = 0; var7 < this.field3492; var7++) {
                if (var6 && class52.method318() == 0) {
                    this.field3489[var7] = 0;
                } else {
                    this.field3489[var7] = class52.method315(5) + 1;
                }
            }
        }
        this.method1465();
        int var8 = class52.method315(4);
        if (var8 > 0) {
            float var9 = class52.method312(class52.method315(32));
            float var10 = class52.method312(class52.method315(32));
            int var11 = class52.method315(4) + 1;
            boolean var12 = class52.method318() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1466(this.field3492, this.field3493);
            } else {
                var13 = this.field3493 * this.field3492;
            }
            this.field3490 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3490[var14] = class52.method315(var11);
            }
            this.field3491 = new float[this.field3492][this.field3493];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3492; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3493; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3490[var19] * var10 + var9 + var16;
                        this.field3491[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3492; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field3493 * var21;
                    for (int var24 = 0; var24 < this.field3493; var24++) {
                        float var25 = (float) this.field3490[var23] * var10 + var9 + var22;
                        this.field3491[var21][var24] = var25;
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
