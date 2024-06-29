import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class181 {

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    private int field2754;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "[I")
    private int[] field2750;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "[I")
    private int[] field2753;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "[[F")
    private float[][] field2752;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "[I")
    private int[] field2755;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "()[F")
    public final float[] method1205() {
        return this.field2752[this.method1207()];
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)I")
    private static final int method1206(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class706.method3899(arg1, var2, -78) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "()I")
    public final int method1207() {
        int var1;
        for (var1 = 0; this.field2755[var1] >= 0; var1 = class211.method1355() == 0 ? var1 + 1 : this.field2755[var1]) {
        }
        return ~this.field2755[var1];
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "()V")
    private final void method1208() {
        int[] var1 = new int[this.field2754];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field2754; var3++) {
            int var14 = this.field2750[var3];
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
        this.field2755 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2754; var5++) {
            int var6 = this.field2750[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field2755[var8] == 0) {
                            this.field2755[var8] = var4;
                        }
                        var8 = this.field2755[var8];
                    }
                    if (var8 >= this.field2755.length) {
                        int[] var11 = new int[this.field2755.length * 2];
                        for (int var12 = 0; var12 < this.field2755.length; var12++) {
                            var11[var12] = this.field2755[var12];
                        }
                        this.field2755 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field2755[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
    public class181() {
        class211.method1347(24);
        this.field2751 = class211.method1347(16);
        this.field2754 = class211.method1347(24);
        this.field2750 = new int[this.field2754];
        boolean var1 = class211.method1355() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class211.method1347(5) + 1;
            while (var2 < this.field2754) {
                int var4 = class211.method1347(class364.method2153((byte) -79, this.field2754 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2750[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class211.method1355() != 0;
            for (int var7 = 0; var7 < this.field2754; var7++) {
                if (var6 && class211.method1355() == 0) {
                    this.field2750[var7] = 0;
                } else {
                    this.field2750[var7] = class211.method1347(5) + 1;
                }
            }
        }
        this.method1208();
        int var8 = class211.method1347(4);
        if (var8 > 0) {
            float var9 = class211.method1356(class211.method1347(32));
            float var10 = class211.method1356(class211.method1347(32));
            int var11 = class211.method1347(4) + 1;
            boolean var12 = class211.method1355() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1206(this.field2754, this.field2751);
            } else {
                var13 = this.field2754 * this.field2751;
            }
            this.field2753 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2753[var14] = class211.method1347(var11);
            }
            this.field2752 = new float[this.field2754][this.field2751];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field2754; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field2751; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field2753[var19] * var10 + var9 + var16;
                        this.field2752[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field2754; var21++) {
                float var22 = 0.0F;
                int var23 = this.field2751 * var21;
                for (int var24 = 0; var24 < this.field2751; var24++) {
                    float var25 = (float) this.field2753[var23] * var10 + var9 + var22;
                    this.field2752[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
