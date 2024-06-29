import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[I")
    private int[] field1614;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[I")
    private int[] field1618;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "[[F")
    private float[][] field1615;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "[I")
    private int[] field1619;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()I")
    public final int method518() {
        int var1;
        for (var1 = 0; this.field1619[var1] >= 0; var1 = class128.method986() == 0 ? var1 + 1 : this.field1619[var1]) {
        }
        return ~this.field1619[var1];
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    private static final int method519(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class10.method46(var2, 83, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()V")
    private final void method520() {
        int[] var1 = new int[this.field1617];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1617; var3++) {
            int var14 = this.field1614[var3];
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
        this.field1619 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1617; var5++) {
            int var6 = this.field1614[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field1619[var8] == 0) {
                            this.field1619[var8] = var4;
                        }
                        var8 = this.field1619[var8];
                    }
                    if (var8 >= this.field1619.length) {
                        int[] var11 = new int[this.field1619.length * 2];
                        for (int var12 = 0; var12 < this.field1619.length; var12++) {
                            var11[var12] = this.field1619[var12];
                        }
                        this.field1619 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field1619[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()[F")
    public final float[] method521() {
        return this.field1615[this.method518()];
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class76() {
        class128.method994(24);
        this.field1616 = class128.method994(16);
        this.field1617 = class128.method994(24);
        this.field1614 = new int[this.field1617];
        boolean var1 = class128.method986() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class128.method994(5) + 1;
            while (var2 < this.field1617) {
                int var4 = class128.method994(class67.method454(-116, this.field1617 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1614[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class128.method986() != 0;
            for (int var7 = 0; var7 < this.field1617; var7++) {
                if (var6 && class128.method986() == 0) {
                    this.field1614[var7] = 0;
                } else {
                    this.field1614[var7] = class128.method994(5) + 1;
                }
            }
        }
        this.method520();
        int var8 = class128.method994(4);
        if (var8 > 0) {
            float var9 = class128.method988(class128.method994(32));
            float var10 = class128.method988(class128.method994(32));
            int var11 = class128.method994(4) + 1;
            boolean var12 = class128.method986() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method519(this.field1617, this.field1616);
            } else {
                var13 = this.field1617 * this.field1616;
            }
            this.field1618 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1618[var14] = class128.method994(var11);
            }
            this.field1615 = new float[this.field1617][this.field1616];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1617; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1616; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1618[var19] * var10 + var9 + var16;
                        this.field1615[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field1617; var21++) {
                float var22 = 0.0F;
                int var23 = this.field1616 * var21;
                for (int var24 = 0; var24 < this.field1616; var24++) {
                    float var25 = (float) this.field1618[var23] * var10 + var9 + var22;
                    this.field1615[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
