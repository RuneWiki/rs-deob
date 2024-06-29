import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
    private int[] field1137;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[I")
    private int[] field1138;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[[F")
    private float[][] field1136;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[I")
    private int[] field1140;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
    private final void method444() {
        int[] var1 = new int[this.field1139];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1139; var3++) {
            int var14 = this.field1137[var3];
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
        this.field1140 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1139; var5++) {
            int var6 = this.field1137[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field1140[var8] == 0) {
                            this.field1140[var8] = var4;
                        }
                        var8 = this.field1140[var8];
                    }
                    if (var8 >= this.field1140.length) {
                        int[] var11 = new int[this.field1140.length * 2];
                        for (int var12 = 0; var12 < this.field1140.length; var12++) {
                            var11[var12] = this.field1140[var12];
                        }
                        this.field1140 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field1140[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()I")
    public final int method445() {
        int var1;
        for (var1 = 0; this.field1140[var1] >= 0; var1 = class103.method832() == 0 ? var1 + 1 : this.field1140[var1]) {
        }
        return ~this.field1140[var1];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
    private static final int method446(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class71.method573(arg1, var2, (byte) -63) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()[F")
    public final float[] method447() {
        return this.field1136[this.method445()];
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class56() {
        class103.method830(24);
        this.field1135 = class103.method830(16);
        this.field1139 = class103.method830(24);
        this.field1137 = new int[this.field1139];
        boolean var1 = class103.method832() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class103.method830(5) + 1;
            while (var2 < this.field1139) {
                int var4 = class103.method830(class124.method1009(17613, this.field1139 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1137[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class103.method832() != 0;
            for (int var7 = 0; var7 < this.field1139; var7++) {
                if (var6 && class103.method832() == 0) {
                    this.field1137[var7] = 0;
                } else {
                    this.field1137[var7] = class103.method830(5) + 1;
                }
            }
        }
        this.method444();
        int var8 = class103.method830(4);
        if (var8 > 0) {
            float var9 = class103.method828(class103.method830(32));
            float var10 = class103.method828(class103.method830(32));
            int var11 = class103.method830(4) + 1;
            boolean var12 = class103.method832() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method446(this.field1139, this.field1135);
            } else {
                var13 = this.field1139 * this.field1135;
            }
            this.field1138 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1138[var14] = class103.method830(var11);
            }
            this.field1136 = new float[this.field1139][this.field1135];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1139; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1135; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1138[var19] * var10 + var9 + var16;
                        this.field1136[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field1139; var21++) {
                float var22 = 0.0F;
                int var23 = this.field1135 * var21;
                for (int var24 = 0; var24 < this.field1135; var24++) {
                    float var25 = (float) this.field1138[var23] * var10 + var9 + var22;
                    this.field1136[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
