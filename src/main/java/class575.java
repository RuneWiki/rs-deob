import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class575 {

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public int field8315;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    private int field8316;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
    private int[] field8314;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "[I")
    private int[] field8317;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "[[F")
    private float[][] field8318;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "[I")
    private int[] field8319;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I")
    private static final int method4275(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class379.method2999(var2, arg1, -92) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "()I")
    public final int method4276() {
        int var1;
        for (var1 = 0; this.field8319[var1] >= 0; var1 = class186.method1534() == 0 ? var1 + 1 : this.field8319[var1]) {
        }
        return ~this.field8319[var1];
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "()V")
    private final void method4277() {
        int[] var1 = new int[this.field8316];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field8316; var3++) {
            int var14 = this.field8314[var3];
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
        this.field8319 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field8316; var5++) {
            int var6 = this.field8314[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field8319[var8] == 0) {
                            this.field8319[var8] = var4;
                        }
                        var8 = this.field8319[var8];
                    }
                    if (var8 >= this.field8319.length) {
                        int[] var11 = new int[this.field8319.length * 2];
                        for (int var12 = 0; var12 < this.field8319.length; var12++) {
                            var11[var12] = this.field8319[var12];
                        }
                        this.field8319 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field8319[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
    public class575() {
        class186.method1540(24);
        this.field8315 = class186.method1540(16);
        this.field8316 = class186.method1540(24);
        this.field8314 = new int[this.field8316];
        boolean var1 = class186.method1534() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class186.method1540(5) + 1;
            while (var2 < this.field8316) {
                int var4 = class186.method1540(class626.method4593(3, this.field8316 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field8314[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class186.method1534() != 0;
            for (int var7 = 0; var7 < this.field8316; var7++) {
                if (var6 && class186.method1534() == 0) {
                    this.field8314[var7] = 0;
                } else {
                    this.field8314[var7] = class186.method1540(5) + 1;
                }
            }
        }
        this.method4277();
        int var8 = class186.method1540(4);
        if (var8 > 0) {
            float var9 = class186.method1531(class186.method1540(32));
            float var10 = class186.method1531(class186.method1540(32));
            int var11 = class186.method1540(4) + 1;
            boolean var12 = class186.method1534() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method4275(this.field8316, this.field8315);
            } else {
                var13 = this.field8316 * this.field8315;
            }
            this.field8317 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field8317[var14] = class186.method1540(var11);
            }
            this.field8318 = new float[this.field8316][this.field8315];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field8316; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field8315; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field8317[var19] * var10 + var9 + var16;
                        this.field8318[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field8316; var21++) {
                float var22 = 0.0F;
                int var23 = this.field8315 * var21;
                for (int var24 = 0; var24 < this.field8315; var24++) {
                    float var25 = (float) this.field8317[var23] * var10 + var9 + var22;
                    this.field8318[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "()[F")
    public final float[] method4278() {
        return this.field8318[this.method4276()];
    }
}
