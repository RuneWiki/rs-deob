import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class35 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
    private int[] field780;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
    private int[] field777;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[[F")
    private float[][] field778;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[I")
    private int[] field781;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()I")
    public final int method226() {
        int var1;
        for (var1 = 0; this.field781[var1] >= 0; var1 = class20.method144() == 0 ? var1 + 1 : this.field781[var1]) {
        }
        return ~this.field781[var1];
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()[F")
    public final float[] method227() {
        return this.field778[this.method226()];
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
    private static final int method228(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class3.method21(-24985, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()V")
    private final void method229() {
        int[] var1 = new int[this.field779];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field779; var3++) {
            int var14 = this.field780[var3];
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
        this.field781 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field779; var5++) {
            int var6 = this.field780[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field781[var8] == 0) {
                            this.field781[var8] = var4;
                        }
                        var8 = this.field781[var8];
                    }
                    if (var8 >= this.field781.length) {
                        int[] var11 = new int[this.field781.length * 2];
                        for (int var12 = 0; var12 < this.field781.length; var12++) {
                            var11[var12] = this.field781[var12];
                        }
                        this.field781 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field781[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class35() {
        class20.method142(24);
        this.field776 = class20.method142(16);
        this.field779 = class20.method142(24);
        this.field780 = new int[this.field779];
        boolean var1 = class20.method144() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class20.method142(5) + 1;
            while (var2 < this.field779) {
                int var4 = class20.method142(class30.method198((byte) -120, this.field779 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field780[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class20.method144() != 0;
            for (int var7 = 0; var7 < this.field779; var7++) {
                if (var6 && class20.method144() == 0) {
                    this.field780[var7] = 0;
                } else {
                    this.field780[var7] = class20.method142(5) + 1;
                }
            }
        }
        this.method229();
        int var8 = class20.method142(4);
        if (var8 > 0) {
            float var9 = class20.method146(class20.method142(32));
            float var10 = class20.method146(class20.method142(32));
            int var11 = class20.method142(4) + 1;
            boolean var12 = class20.method144() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method228(this.field779, this.field776);
            } else {
                var13 = this.field779 * this.field776;
            }
            this.field777 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field777[var14] = class20.method142(var11);
            }
            this.field778 = new float[this.field779][this.field776];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field779; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field776; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field777[var19] * var10 + var9 + var16;
                        this.field778[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field779; var21++) {
                float var22 = 0.0F;
                int var23 = this.field776 * var21;
                for (int var24 = 0; var24 < this.field776; var24++) {
                    float var25 = (float) this.field777[var23] * var10 + var9 + var22;
                    this.field778[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
