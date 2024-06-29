import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class28 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
    private int[] field467;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[I")
    private int[] field469;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[[F")
    private float[][] field468;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
    private int[] field471;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()V")
    private final void method184() {
        int[] var1 = new int[this.field466];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field466; var3++) {
            int var14 = this.field467[var3];
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
        this.field471 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field466; var5++) {
            int var6 = this.field467[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field471[var8] == 0) {
                            this.field471[var8] = var4;
                        }
                        var8 = this.field471[var8];
                    }
                    if (var8 >= this.field471.length) {
                        int[] var11 = new int[this.field471.length * 2];
                        for (int var12 = 0; var12 < this.field471.length; var12++) {
                            var11[var12] = this.field471[var12];
                        }
                        this.field471 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field471[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()I")
    public final int method185() {
        int var1;
        for (var1 = 0; this.field471[var1] >= 0; var1 = class184.method1297() == 0 ? var1 + 1 : this.field471[var1]) {
        }
        return ~this.field471[var1];
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
    private static final int method186(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class130.method982(var2, arg1, (byte) -116) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "()[F")
    public final float[] method187() {
        return this.field468[this.method185()];
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class28() {
        class184.method1295(24);
        this.field470 = class184.method1295(16);
        this.field466 = class184.method1295(24);
        this.field467 = new int[this.field466];
        boolean var1 = class184.method1297() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class184.method1295(5) + 1;
            while (var2 < this.field466) {
                int var4 = class184.method1295(class91.method643(this.field466 - var2, 39));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field467[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class184.method1297() != 0;
            for (int var7 = 0; var7 < this.field466; var7++) {
                if (var6 && class184.method1297() == 0) {
                    this.field467[var7] = 0;
                } else {
                    this.field467[var7] = class184.method1295(5) + 1;
                }
            }
        }
        this.method184();
        int var8 = class184.method1295(4);
        if (var8 > 0) {
            float var9 = class184.method1299(class184.method1295(32));
            float var10 = class184.method1299(class184.method1295(32));
            int var11 = class184.method1295(4) + 1;
            boolean var12 = class184.method1297() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method186(this.field466, this.field470);
            } else {
                var13 = this.field470 * this.field466;
            }
            this.field469 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field469[var14] = class184.method1295(var11);
            }
            this.field468 = new float[this.field466][this.field470];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field466; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field470; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field469[var19] * var10 + var9 + var16;
                        this.field468[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field466; var21++) {
                float var22 = 0.0F;
                int var23 = this.field470 * var21;
                for (int var24 = 0; var24 < this.field470; var24++) {
                    float var25 = (float) this.field469[var23] * var10 + var9 + var22;
                    this.field468[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
