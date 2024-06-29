import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class89 {

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "[I")
    private int[] field1056;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "[I")
    private int[] field1058;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "[[F")
    private float[][] field1057;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "[I")
    private int[] field1061;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)I", line = 5)
    private static final int method658(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class636.method3649(1, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "()V", line = 13)
    private final void method659() {
        int[] var1 = new int[this.field1059];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1059; var3++) {
            int var14 = this.field1056[var3];
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
        this.field1061 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1059; var5++) {
            int var6 = this.field1056[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field1061[var8] == 0) {
                            this.field1061[var8] = var4;
                        }
                        var8 = this.field1061[var8];
                    }
                    if (var8 >= this.field1061.length) {
                        int[] var11 = new int[this.field1061.length * 2];
                        for (int var12 = 0; var12 < this.field1061.length; var12++) {
                            var11[var12] = this.field1061[var12];
                        }
                        this.field1061 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field1061[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "()[F", line = 151)
    public final float[] method660() {
        return this.field1057[this.method661()];
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "()I", line = 155)
    public final int method661() {
        int var1;
        for (var1 = 0; this.field1061[var1] >= 0; var1 = class622.method3574() == 0 ? var1 + 1 : this.field1061[var1]) {
        }
        return ~this.field1061[var1];
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V", line = 165)
    public class89() {
        class622.method3577(24);
        this.field1060 = class622.method3577(16);
        this.field1059 = class622.method3577(24);
        this.field1056 = new int[this.field1059];
        boolean var1 = class622.method3574() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class622.method3577(5) + 1;
            while (var2 < this.field1059) {
                int var4 = class622.method3577(class550.method3249(this.field1059 - var2, 6520));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1056[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class622.method3574() != 0;
            for (int var7 = 0; var7 < this.field1059; var7++) {
                if (var6 && class622.method3574() == 0) {
                    this.field1056[var7] = 0;
                } else {
                    this.field1056[var7] = class622.method3577(5) + 1;
                }
            }
        }
        this.method659();
        int var8 = class622.method3577(4);
        if (var8 > 0) {
            float var9 = class622.method3572(class622.method3577(32));
            float var10 = class622.method3572(class622.method3577(32));
            int var11 = class622.method3577(4) + 1;
            boolean var12 = class622.method3574() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method658(this.field1059, this.field1060);
            } else {
                var13 = this.field1060 * this.field1059;
            }
            this.field1058 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1058[var14] = class622.method3577(var11);
            }
            this.field1057 = new float[this.field1059][this.field1060];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1059; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1060; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1058[var19] * var10 + var9 + var16;
                        this.field1057[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field1059; var21++) {
                float var22 = 0.0F;
                int var23 = this.field1060 * var21;
                for (int var24 = 0; var24 < this.field1060; var24++) {
                    float var25 = (float) this.field1058[var23] * var10 + var9 + var22;
                    this.field1057[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
