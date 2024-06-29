import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class20 {

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
    private int[] field302;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
    private int[] field299;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[[F")
    private float[][] field301;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[I")
    private int[] field304;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I")
    private static final int method172(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class256.method1702(arg1, 105, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    private final void method173() {
        int[] var1 = new int[this.field300];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field300; var3++) {
            int var14 = this.field302[var3];
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
        this.field304 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field300; var5++) {
            int var6 = this.field302[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field304[var8] == 0) {
                            this.field304[var8] = var4;
                        }
                        var8 = this.field304[var8];
                    }
                    if (var8 >= this.field304.length) {
                        int[] var11 = new int[this.field304.length * 2];
                        for (int var12 = 0; var12 < this.field304.length; var12++) {
                            var11[var12] = this.field304[var12];
                        }
                        this.field304 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field304[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()[F")
    public final float[] method174() {
        return this.field301[this.method175()];
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()I")
    public final int method175() {
        int var1;
        for (var1 = 0; this.field304[var1] >= 0; var1 = class104.method794() == 0 ? var1 + 1 : this.field304[var1]) {
        }
        return ~this.field304[var1];
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class20() {
        class104.method800(24);
        this.field303 = class104.method800(16);
        this.field300 = class104.method800(24);
        this.field302 = new int[this.field300];
        boolean var1 = class104.method794() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class104.method800(5) + 1;
            while (var2 < this.field300) {
                int var4 = class104.method800(class259.method1721(19049, this.field300 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field302[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class104.method794() != 0;
            for (int var7 = 0; var7 < this.field300; var7++) {
                if (var6 && class104.method794() == 0) {
                    this.field302[var7] = 0;
                } else {
                    this.field302[var7] = class104.method800(5) + 1;
                }
            }
        }
        this.method173();
        int var8 = class104.method800(4);
        if (var8 > 0) {
            float var9 = class104.method793(class104.method800(32));
            float var10 = class104.method793(class104.method800(32));
            int var11 = class104.method800(4) + 1;
            boolean var12 = class104.method794() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method172(this.field300, this.field303);
            } else {
                var13 = this.field303 * this.field300;
            }
            this.field299 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field299[var14] = class104.method800(var11);
            }
            this.field301 = new float[this.field300][this.field303];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field300; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field303; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field299[var19] * var10 + var9 + var16;
                        this.field301[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field300; var21++) {
                float var22 = 0.0F;
                int var23 = this.field303 * var21;
                for (int var24 = 0; var24 < this.field303; var24++) {
                    float var25 = (float) this.field299[var23] * var10 + var9 + var22;
                    this.field301[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
