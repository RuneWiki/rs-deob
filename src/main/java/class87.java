import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class87 {

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[I")
    private int[] field1308;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    private int[] field1312;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[[F")
    private float[][] field1310;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[I")
    private int[] field1313;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 4)
    private static final int method575(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class97.method622((byte) -115, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()I", line = 12)
    public final int method576() {
        int var1;
        for (var1 = 0; this.field1313[var1] >= 0; var1 = class64.method466() == 0 ? var1 + 1 : this.field1313[var1]) {
        }
        return ~this.field1313[var1];
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()V", line = 21)
    private final void method577() {
        int[] var1 = new int[this.field1311];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1311; var3++) {
            int var4 = this.field1308[var3];
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
        this.field1313 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1311; var14++) {
            int var15 = this.field1308[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1313[var17] == 0) {
                            this.field1313[var17] = var13;
                        }
                        var17 = this.field1313[var17];
                    }
                    if (var17 >= this.field1313.length) {
                        int[] var20 = new int[this.field1313.length * 2];
                        for (int var21 = 0; var21 < this.field1313.length; var21++) {
                            var20[var21] = this.field1313[var21];
                        }
                        this.field1313 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1313[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()[F", line = 159)
    public final float[] method578() {
        return this.field1310[this.method576()];
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V", line = 165)
    public class87() {
        class64.method464(24);
        this.field1309 = class64.method464(16);
        this.field1311 = class64.method464(24);
        this.field1308 = new int[this.field1311];
        boolean var1 = class64.method466() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class64.method464(5) + 1;
            while (var2 < this.field1311) {
                int var4 = class64.method464(class276.method1877(this.field1311 - var2, (byte) -62));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1308[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class64.method466() != 0;
            for (int var7 = 0; var7 < this.field1311; var7++) {
                if (var6 && class64.method466() == 0) {
                    this.field1308[var7] = 0;
                } else {
                    this.field1308[var7] = class64.method464(5) + 1;
                }
            }
        }
        this.method577();
        int var8 = class64.method464(4);
        if (var8 > 0) {
            float var9 = class64.method463(class64.method464(32));
            float var10 = class64.method463(class64.method464(32));
            int var11 = class64.method464(4) + 1;
            boolean var12 = class64.method466() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method575(this.field1311, this.field1309);
            } else {
                var13 = this.field1311 * this.field1309;
            }
            this.field1312 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1312[var14] = class64.method464(var11);
            }
            this.field1310 = new float[this.field1311][this.field1309];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1311; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1309; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1312[var19] * var10 + var9 + var16;
                        this.field1310[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1311; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1309 * var21;
                    for (int var24 = 0; var24 < this.field1309; var24++) {
                        float var25 = (float) this.field1312[var23] * var10 + var9 + var22;
                        this.field1310[var21][var24] = var25;
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
