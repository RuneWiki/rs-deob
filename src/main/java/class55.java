import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[I")
    private int[] field1259;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
    private int[] field1261;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[[F")
    private float[][] field1260;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    private int[] field1263;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V")
    private final void method370() {
        int[] var1 = new int[this.field1258];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1258; var3++) {
            int var14 = this.field1259[var3];
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
        this.field1263 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1258; var5++) {
            int var6 = this.field1259[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field1263[var8] == 0) {
                            this.field1263[var8] = var4;
                        }
                        var8 = this.field1263[var8];
                    }
                    if (var8 >= this.field1263.length) {
                        int[] var11 = new int[this.field1263.length * 2];
                        for (int var12 = 0; var12 < this.field1263.length; var12++) {
                            var11[var12] = this.field1263[var12];
                        }
                        this.field1263 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field1263[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)I")
    private static final int method371(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class63.method460(arg1, var2, -90) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()[F")
    public final float[] method372() {
        return this.field1260[this.method373()];
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class55() {
        class102.method850(24);
        this.field1262 = class102.method850(16);
        this.field1258 = class102.method850(24);
        this.field1259 = new int[this.field1258];
        boolean var1 = class102.method843() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class102.method850(5) + 1;
            while (var2 < this.field1258) {
                int var4 = class102.method850(class47.method327(this.field1258 - var2, (byte) 65));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1259[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class102.method843() != 0;
            for (int var7 = 0; var7 < this.field1258; var7++) {
                if (var6 && class102.method843() == 0) {
                    this.field1259[var7] = 0;
                } else {
                    this.field1259[var7] = class102.method850(5) + 1;
                }
            }
        }
        this.method370();
        int var8 = class102.method850(4);
        if (var8 > 0) {
            float var9 = class102.method848(class102.method850(32));
            float var10 = class102.method848(class102.method850(32));
            int var11 = class102.method850(4) + 1;
            boolean var12 = class102.method843() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method371(this.field1258, this.field1262);
            } else {
                var13 = this.field1262 * this.field1258;
            }
            this.field1261 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1261[var14] = class102.method850(var11);
            }
            this.field1260 = new float[this.field1258][this.field1262];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1258; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1262; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1261[var19] * var10 + var9 + var16;
                        this.field1260[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field1258; var21++) {
                float var22 = 0.0F;
                int var23 = this.field1262 * var21;
                for (int var24 = 0; var24 < this.field1262; var24++) {
                    float var25 = (float) this.field1261[var23] * var10 + var9 + var22;
                    this.field1260[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "()I")
    public final int method373() {
        int var1;
        for (var1 = 0; this.field1263[var1] >= 0; var1 = class102.method843() == 0 ? var1 + 1 : this.field1263[var1]) {
        }
        return ~this.field1263[var1];
    }
}
