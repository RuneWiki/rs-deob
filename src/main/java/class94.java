import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class94 {

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    private int field1217;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "[I")
    private int[] field1219;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "[I")
    private int[] field1218;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "[[F")
    private float[][] field1220;

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "[I")
    private int[] field1221;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "()V")
    private final void method667() {
        int[] var1 = new int[this.field1217];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1217; var3++) {
            int var14 = this.field1219[var3];
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
        this.field1221 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1217; var5++) {
            int var6 = this.field1219[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field1221[var8] == 0) {
                            this.field1221[var8] = var4;
                        }
                        var8 = this.field1221[var8];
                    }
                    if (var8 >= this.field1221.length) {
                        int[] var11 = new int[this.field1221.length * 2];
                        for (int var12 = 0; var12 < this.field1221.length; var12++) {
                            var11[var12] = this.field1221[var12];
                        }
                        this.field1221 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field1221[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)I")
    private static final int method668(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class10.method118(arg1, 200, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "()[F")
    public final float[] method669() {
        return this.field1220[this.method670()];
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "()V")
    public class94() {
        class198.method1434(24);
        this.field1216 = class198.method1434(16);
        this.field1217 = class198.method1434(24);
        this.field1219 = new int[this.field1217];
        boolean var1 = class198.method1430() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class198.method1434(5) + 1;
            while (var2 < this.field1217) {
                int var4 = class198.method1434(class305.method2009(this.field1217 - var2, (byte) 63));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1219[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class198.method1430() != 0;
            for (int var7 = 0; var7 < this.field1217; var7++) {
                if (var6 && class198.method1430() == 0) {
                    this.field1219[var7] = 0;
                } else {
                    this.field1219[var7] = class198.method1434(5) + 1;
                }
            }
        }
        this.method667();
        int var8 = class198.method1434(4);
        if (var8 > 0) {
            float var9 = class198.method1439(class198.method1434(32));
            float var10 = class198.method1439(class198.method1434(32));
            int var11 = class198.method1434(4) + 1;
            boolean var12 = class198.method1430() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method668(this.field1217, this.field1216);
            } else {
                var13 = this.field1217 * this.field1216;
            }
            this.field1218 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1218[var14] = class198.method1434(var11);
            }
            this.field1220 = new float[this.field1217][this.field1216];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1217; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1216; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1218[var19] * var10 + var9 + var16;
                        this.field1220[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field1217; var21++) {
                float var22 = 0.0F;
                int var23 = this.field1216 * var21;
                for (int var24 = 0; var24 < this.field1216; var24++) {
                    float var25 = (float) this.field1218[var23] * var10 + var9 + var22;
                    this.field1220[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "()I")
    public final int method670() {
        int var1;
        for (var1 = 0; this.field1221[var1] >= 0; var1 = class198.method1430() == 0 ? var1 + 1 : this.field1221[var1]) {
        }
        return ~this.field1221[var1];
    }
}
