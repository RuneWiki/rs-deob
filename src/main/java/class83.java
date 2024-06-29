import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class83 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[I")
    private int[] field1476;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
    private int[] field1473;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[[F")
    private float[][] field1474;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "[I")
    private int[] field1478;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()[F", line = 3)
    public final float[] method528() {
        return this.field1474[this.method531()];
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I", line = 12)
    private static final int method529(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class26.method169(arg1, var2, (byte) -97) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V", line = 20)
    private final void method530() {
        int[] var1 = new int[this.field1477];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1477; var3++) {
            int var4 = this.field1476[var3];
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
        this.field1478 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1477; var14++) {
            int var15 = this.field1476[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1478[var17] == 0) {
                            this.field1478[var17] = var13;
                        }
                        var17 = this.field1478[var17];
                    }
                    if (var17 >= this.field1478.length) {
                        int[] var20 = new int[this.field1478.length * 2];
                        for (int var21 = 0; var21 < this.field1478.length; var21++) {
                            var20[var21] = this.field1478[var21];
                        }
                        this.field1478 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1478[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 157)
    public class83() {
        class18.method139(24);
        this.field1475 = class18.method139(16);
        this.field1477 = class18.method139(24);
        this.field1476 = new int[this.field1477];
        boolean var1 = class18.method140() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class18.method139(5) + 1;
            while (var2 < this.field1477) {
                int var4 = class18.method139(class294.method2012(4, this.field1477 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1476[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class18.method140() != 0;
            for (int var7 = 0; var7 < this.field1477; var7++) {
                if (var6 && class18.method140() == 0) {
                    this.field1476[var7] = 0;
                } else {
                    this.field1476[var7] = class18.method139(5) + 1;
                }
            }
        }
        this.method530();
        int var8 = class18.method139(4);
        if (var8 > 0) {
            float var9 = class18.method135(class18.method139(32));
            float var10 = class18.method135(class18.method139(32));
            int var11 = class18.method139(4) + 1;
            boolean var12 = class18.method140() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method529(this.field1477, this.field1475);
            } else {
                var13 = this.field1477 * this.field1475;
            }
            this.field1473 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1473[var14] = class18.method139(var11);
            }
            this.field1474 = new float[this.field1477][this.field1475];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1477; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1475; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1473[var19] * var10 + var9 + var16;
                        this.field1474[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1477; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1475 * var21;
                    for (int var24 = 0; var24 < this.field1475; var24++) {
                        float var25 = (float) this.field1473[var23] * var10 + var9 + var22;
                        this.field1474[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()I", line = 300)
    public final int method531() {
        int var1;
        for (var1 = 0; this.field1478[var1] >= 0; var1 = class18.method140() == 0 ? var1 + 1 : this.field1478[var1]) {
        }
        return ~this.field1478[var1];
    }
}
