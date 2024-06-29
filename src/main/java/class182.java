import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class182 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    private int field2755;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[I")
    private int[] field2754;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    private int[] field2752;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[[F")
    private float[][] field2756;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
    private int[] field2757;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
    private static final int method1134(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class92.method593(var2, (byte) -70, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
    public final int method1135() {
        int var1;
        for (var1 = 0; this.field2757[var1] >= 0; var1 = class121.method772() == 0 ? var1 + 1 : this.field2757[var1]) {
        }
        return ~this.field2757[var1];
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()V")
    private final void method1136() {
        int[] var1 = new int[this.field2755];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field2755; var3++) {
            int var14 = this.field2754[var3];
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
        this.field2757 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2755; var5++) {
            int var6 = this.field2754[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field2757[var8] == 0) {
                            this.field2757[var8] = var4;
                        }
                        var8 = this.field2757[var8];
                    }
                    if (var8 >= this.field2757.length) {
                        int[] var11 = new int[this.field2757.length * 2];
                        for (int var12 = 0; var12 < this.field2757.length; var12++) {
                            var11[var12] = this.field2757[var12];
                        }
                        this.field2757 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field2757[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()[F")
    public final float[] method1137() {
        return this.field2756[this.method1135()];
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class182() {
        class121.method763(24);
        this.field2753 = class121.method763(16);
        this.field2755 = class121.method763(24);
        this.field2754 = new int[this.field2755];
        boolean var1 = class121.method772() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class121.method763(5) + 1;
            while (var2 < this.field2755) {
                int var4 = class121.method763(class114.method734(this.field2755 - var2, 76));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2754[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class121.method772() != 0;
            for (int var7 = 0; var7 < this.field2755; var7++) {
                if (var6 && class121.method772() == 0) {
                    this.field2754[var7] = 0;
                } else {
                    this.field2754[var7] = class121.method763(5) + 1;
                }
            }
        }
        this.method1136();
        int var8 = class121.method763(4);
        if (var8 > 0) {
            float var9 = class121.method766(class121.method763(32));
            float var10 = class121.method766(class121.method763(32));
            int var11 = class121.method763(4) + 1;
            boolean var12 = class121.method772() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1134(this.field2755, this.field2753);
            } else {
                var13 = this.field2755 * this.field2753;
            }
            this.field2752 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2752[var14] = class121.method763(var11);
            }
            this.field2756 = new float[this.field2755][this.field2753];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field2755; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field2753; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field2752[var19] * var10 + var9 + var16;
                        this.field2756[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field2755; var21++) {
                float var22 = 0.0F;
                int var23 = this.field2753 * var21;
                for (int var24 = 0; var24 < this.field2753; var24++) {
                    float var25 = (float) this.field2752[var23] * var10 + var9 + var22;
                    this.field2756[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
