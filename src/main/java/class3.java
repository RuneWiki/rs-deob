import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
    private int[] field36;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "[I")
    private int[] field32;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[[F")
    private float[][] field34;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
    private int[] field37;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
    private final void method7() {
        int[] var1 = new int[this.field35];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field35; var3++) {
            int var14 = this.field36[var3];
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
        this.field37 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field35; var5++) {
            int var6 = this.field36[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field37[var8] == 0) {
                            this.field37[var8] = var4;
                        }
                        var8 = this.field37[var8];
                    }
                    if (var8 >= this.field37.length) {
                        int[] var11 = new int[this.field37.length * 2];
                        for (int var12 = 0; var12 < this.field37.length; var12++) {
                            var11[var12] = this.field37[var12];
                        }
                        this.field37 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field37[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I")
    public final int method8() {
        int var1;
        for (var1 = 0; this.field37[var1] >= 0; var1 = class88.method687() == 0 ? var1 + 1 : this.field37[var1]) {
        }
        return ~this.field37[var1];
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()[F")
    public final float[] method9() {
        return this.field34[this.method8()];
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
    private static final int method10(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class141.method1157(1, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class3() {
        class88.method690(24);
        this.field33 = class88.method690(16);
        this.field35 = class88.method690(24);
        this.field36 = new int[this.field35];
        boolean var1 = class88.method687() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class88.method690(5) + 1;
            while (var2 < this.field35) {
                int var4 = class88.method690(class21.method179(this.field35 - var2, (byte) -125));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field36[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class88.method687() != 0;
            for (int var7 = 0; var7 < this.field35; var7++) {
                if (var6 && class88.method687() == 0) {
                    this.field36[var7] = 0;
                } else {
                    this.field36[var7] = class88.method690(5) + 1;
                }
            }
        }
        this.method7();
        int var8 = class88.method690(4);
        if (var8 > 0) {
            float var9 = class88.method693(class88.method690(32));
            float var10 = class88.method693(class88.method690(32));
            int var11 = class88.method690(4) + 1;
            boolean var12 = class88.method687() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method10(this.field35, this.field33);
            } else {
                var13 = this.field35 * this.field33;
            }
            this.field32 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field32[var14] = class88.method690(var11);
            }
            this.field34 = new float[this.field35][this.field33];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field35; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field33; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field32[var19] * var10 + var9 + var16;
                        this.field34[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field35; var21++) {
                float var22 = 0.0F;
                int var23 = this.field33 * var21;
                for (int var24 = 0; var24 < this.field33; var24++) {
                    float var25 = (float) this.field32[var23] * var10 + var9 + var22;
                    this.field34[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
