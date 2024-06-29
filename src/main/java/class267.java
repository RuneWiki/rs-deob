import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class267 {

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "[I")
    private int[] field3536;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "[I")
    private int[] field3538;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "[[F")
    private float[][] field3534;

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "[I")
    private int[] field3539;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "()I")
    public final int method1679() {
        int var1;
        for (var1 = 0; this.field3539[var1] >= 0; var1 = class74.method437() == 0 ? var1 + 1 : this.field3539[var1]) {
        }
        return ~this.field3539[var1];
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)I")
    private static final int method1680(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class55.method338(-5729, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "()V")
    private final void method1681() {
        int[] var1 = new int[this.field3537];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3537; var3++) {
            int var14 = this.field3536[var3];
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
        this.field3539 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3537; var5++) {
            int var6 = this.field3536[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field3539[var8] == 0) {
                            this.field3539[var8] = var4;
                        }
                        var8 = this.field3539[var8];
                    }
                    if (var8 >= this.field3539.length) {
                        int[] var11 = new int[this.field3539.length * 2];
                        for (int var12 = 0; var12 < this.field3539.length; var12++) {
                            var11[var12] = this.field3539[var12];
                        }
                        this.field3539 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field3539[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "()V")
    public class267() {
        class74.method438(24);
        this.field3535 = class74.method438(16);
        this.field3537 = class74.method438(24);
        this.field3536 = new int[this.field3537];
        boolean var1 = class74.method437() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class74.method438(5) + 1;
            while (var2 < this.field3537) {
                int var4 = class74.method438(class194.method1347(this.field3537 - var2, true));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3536[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class74.method437() != 0;
            for (int var7 = 0; var7 < this.field3537; var7++) {
                if (var6 && class74.method437() == 0) {
                    this.field3536[var7] = 0;
                } else {
                    this.field3536[var7] = class74.method438(5) + 1;
                }
            }
        }
        this.method1681();
        int var8 = class74.method438(4);
        if (var8 > 0) {
            float var9 = class74.method434(class74.method438(32));
            float var10 = class74.method434(class74.method438(32));
            int var11 = class74.method438(4) + 1;
            boolean var12 = class74.method437() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1680(this.field3537, this.field3535);
            } else {
                var13 = this.field3537 * this.field3535;
            }
            this.field3538 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3538[var14] = class74.method438(var11);
            }
            this.field3534 = new float[this.field3537][this.field3535];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3537; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3535; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3538[var19] * var10 + var9 + var16;
                        this.field3534[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field3537; var21++) {
                float var22 = 0.0F;
                int var23 = this.field3535 * var21;
                for (int var24 = 0; var24 < this.field3535; var24++) {
                    float var25 = (float) this.field3538[var23] * var10 + var9 + var22;
                    this.field3534[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "()[F")
    public final float[] method1682() {
        return this.field3534[this.method1679()];
    }
}
