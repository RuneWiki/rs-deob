import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class181 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    private int field3453;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "[I")
    private int[] field3451;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[I")
    private int[] field3454;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[[F")
    private float[][] field3452;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
    private int[] field3455;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()[F")
    public final float[] method1185() {
        return this.field3452[this.method1187()];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I")
    private static final int method1186(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class115.method782((byte) 120, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()I")
    public final int method1187() {
        int var1;
        for (var1 = 0; this.field3455[var1] >= 0; var1 = class24.method152() == 0 ? var1 + 1 : this.field3455[var1]) {
        }
        return ~this.field3455[var1];
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()V")
    private final void method1188() {
        int[] var1 = new int[this.field3453];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3453; var3++) {
            int var14 = this.field3451[var3];
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
        this.field3455 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3453; var5++) {
            int var6 = this.field3451[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field3455[var8] == 0) {
                            this.field3455[var8] = var4;
                        }
                        var8 = this.field3455[var8];
                    }
                    if (var8 >= this.field3455.length) {
                        int[] var11 = new int[this.field3455.length * 2];
                        for (int var12 = 0; var12 < this.field3455.length; var12++) {
                            var11[var12] = this.field3455[var12];
                        }
                        this.field3455 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field3455[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class181() {
        class24.method150(24);
        this.field3450 = class24.method150(16);
        this.field3453 = class24.method150(24);
        this.field3451 = new int[this.field3453];
        boolean var1 = class24.method152() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class24.method150(5) + 1;
            while (var2 < this.field3453) {
                int var4 = class24.method150(class130.method860((byte) -128, this.field3453 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3451[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class24.method152() != 0;
            for (int var7 = 0; var7 < this.field3453; var7++) {
                if (var6 && class24.method152() == 0) {
                    this.field3451[var7] = 0;
                } else {
                    this.field3451[var7] = class24.method150(5) + 1;
                }
            }
        }
        this.method1188();
        int var8 = class24.method150(4);
        if (var8 > 0) {
            float var9 = class24.method148(class24.method150(32));
            float var10 = class24.method148(class24.method150(32));
            int var11 = class24.method150(4) + 1;
            boolean var12 = class24.method152() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1186(this.field3453, this.field3450);
            } else {
                var13 = this.field3453 * this.field3450;
            }
            this.field3454 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3454[var14] = class24.method150(var11);
            }
            this.field3452 = new float[this.field3453][this.field3450];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3453; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3450; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3454[var19] * var10 + var9 + var16;
                        this.field3452[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field3453; var21++) {
                float var22 = 0.0F;
                int var23 = this.field3450 * var21;
                for (int var24 = 0; var24 < this.field3450; var24++) {
                    float var25 = (float) this.field3454[var23] * var10 + var9 + var22;
                    this.field3452[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
