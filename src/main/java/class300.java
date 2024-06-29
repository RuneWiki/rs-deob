import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class300 {

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public int field5227;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    private int field5223;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "[I")
    private int[] field5224;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "[I")
    private int[] field5226;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "[[F")
    private float[][] field5225;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "[I")
    private int[] field5228;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()[F", line = 3)
    public final float[] method2114() {
        return this.field5225[this.method2115()];
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I", line = 8)
    public final int method2115() {
        int var1;
        for (var1 = 0; this.field5228[var1] >= 0; var1 = class127.method876() == 0 ? var1 + 1 : this.field5228[var1]) {
        }
        return ~this.field5228[var1];
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()V", line = 16)
    private final void method2116() {
        int[] var1 = new int[this.field5223];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5223; var3++) {
            int var4 = this.field5224[var3];
            if (var4 != 0) {
                int var5 = 0x1 << 32 - var4;
                int var6 = var2[var4];
                var1[var3] = var6;
                int var7;
                if ((var6 & var5) == 0) {
                    var7 = var6 | var5;
                    for (int var8 = var4 - 1; var8 >= 1; var8--) {
                        int var9 = var2[var8];
                        if (var6 != var9) {
                            break;
                        }
                        int var10 = 0x1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }
                        var2[var8] = var9 | var10;
                    }
                } else {
                    var7 = var2[var4 - 1];
                }
                var2[var4] = var7;
                for (int var11 = var4 + 1; var11 <= 32; var11++) {
                    int var12 = var2[var11];
                    if (var6 == var12) {
                        var2[var11] = var7;
                    }
                }
            }
        }
        this.field5228 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field5223; var14++) {
            int var15 = this.field5224[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field5228[var17] == 0) {
                            this.field5228[var17] = var13;
                        }
                        var17 = this.field5228[var17];
                    }
                    if (var17 >= this.field5228.length) {
                        int[] var20 = new int[this.field5228.length * 2];
                        for (int var21 = 0; var21 < this.field5228.length; var21++) {
                            var20[var21] = this.field5228[var21];
                        }
                        this.field5228 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field5228[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I", line = 158)
    private static final int method2117(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class132.method909(var2, -29462, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 165)
    public class300() {
        class127.method880(24);
        this.field5227 = class127.method880(16);
        this.field5223 = class127.method880(24);
        this.field5224 = new int[this.field5223];
        boolean var1 = class127.method876() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class127.method880(5) + 1;
            while (var2 < this.field5223) {
                int var4 = class127.method880(class55.method382(-14, this.field5223 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5224[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class127.method876() != 0;
            for (int var7 = 0; var7 < this.field5223; var7++) {
                if (var6 && class127.method876() == 0) {
                    this.field5224[var7] = 0;
                } else {
                    this.field5224[var7] = class127.method880(5) + 1;
                }
            }
        }
        this.method2116();
        int var8 = class127.method880(4);
        if (var8 > 0) {
            float var9 = class127.method872(class127.method880(32));
            float var10 = class127.method872(class127.method880(32));
            int var11 = class127.method880(4) + 1;
            boolean var12 = class127.method876() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2117(this.field5223, this.field5227);
            } else {
                var13 = this.field5227 * this.field5223;
            }
            this.field5226 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5226[var14] = class127.method880(var11);
            }
            this.field5225 = new float[this.field5223][this.field5227];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5223; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5227; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5226[var19] * var10 + var9 + var16;
                        this.field5225[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field5223; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field5227 * var21;
                    for (int var24 = 0; var24 < this.field5227; var24++) {
                        float var25 = (float) this.field5226[var23] * var10 + var9 + var22;
                        this.field5225[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }
}
