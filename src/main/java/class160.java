import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class160 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public int field2714;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    private int field2711;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[I")
    private int[] field2715;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[I")
    private int[] field2712;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[[F")
    private float[][] field2713;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[I")
    private int[] field2716;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()[F")
    public final float[] method1081() {
        return this.field2713[this.method1084()];
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
    private final void method1082() {
        int[] var1 = new int[this.field2711];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field2711; var3++) {
            int var14 = this.field2715[var3];
            if (var14 != 0) {
                int var15 = 0x1 << 32 - var14;
                int var16 = var2[var14];
                var1[var3] = var16;
                int var17;
                if ((var16 & var15) == 0) {
                    var17 = var16 | var15;
                    for (int var18 = var14 - 1; var18 >= 1; var18--) {
                        int var19 = var2[var18];
                        if (var16 != var19) {
                            break;
                        }
                        int var20 = 0x1 << 32 - var18;
                        if ((var19 & var20) != 0) {
                            var2[var18] = var2[var18 - 1];
                            break;
                        }
                        var2[var18] = var19 | var20;
                    }
                } else {
                    var17 = var2[var14 - 1];
                }
                var2[var14] = var17;
                for (int var21 = var14 + 1; var21 <= 32; var21++) {
                    int var22 = var2[var21];
                    if (var16 == var22) {
                        var2[var21] = var17;
                    }
                }
            }
        }
        this.field2716 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2711; var5++) {
            int var6 = this.field2715[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field2716[var8] == 0) {
                            this.field2716[var8] = var4;
                        }
                        var8 = this.field2716[var8];
                    }
                    if (var8 >= this.field2716.length) {
                        int[] var11 = new int[this.field2716.length * 2];
                        for (int var12 = 0; var12 < this.field2716.length; var12++) {
                            var11[var12] = this.field2716[var12];
                        }
                        this.field2716 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field2716[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I")
    private static final int method1083(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class193.method1374(arg1, var2, -2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()I")
    public final int method1084() {
        int var1;
        for (var1 = 0; this.field2716[var1] >= 0; var1 = class108.method696() == 0 ? var1 + 1 : this.field2716[var1]) {
        }
        return ~this.field2716[var1];
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class160() {
        class108.method690(24);
        this.field2714 = class108.method690(16);
        this.field2711 = class108.method690(24);
        this.field2715 = new int[this.field2711];
        boolean var1 = class108.method696() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class108.method690(5) + 1;
            while (var2 < this.field2711) {
                int var4 = class108.method690(class91.method553(this.field2711 - var2, 53));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2715[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class108.method696() != 0;
            for (int var7 = 0; var7 < this.field2711; var7++) {
                if (var6 && class108.method696() == 0) {
                    this.field2715[var7] = 0;
                } else {
                    this.field2715[var7] = class108.method690(5) + 1;
                }
            }
        }
        this.method1082();
        int var8 = class108.method690(4);
        if (var8 > 0) {
            float var9 = class108.method697(class108.method690(32));
            float var10 = class108.method697(class108.method690(32));
            int var11 = class108.method690(4) + 1;
            boolean var12 = class108.method696() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1083(this.field2711, this.field2714);
            } else {
                var13 = this.field2714 * this.field2711;
            }
            this.field2712 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2712[var14] = class108.method690(var11);
            }
            this.field2713 = new float[this.field2711][this.field2714];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field2711; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field2714; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field2712[var19] * var10 + var9 + var16;
                        this.field2713[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field2711; var21++) {
                float var22 = 0.0F;
                int var23 = this.field2714 * var21;
                for (int var24 = 0; var24 < this.field2714; var24++) {
                    float var25 = (float) this.field2712[var23] * var10 + var9 + var22;
                    this.field2713[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
