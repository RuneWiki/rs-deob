import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class45 {

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    private int field930;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    private int[] field932;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
    private int[] field931;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[[F")
    private float[][] field929;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
    private int[] field934;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()[F")
    public final float[] method334() {
        return this.field929[this.method337()];
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
    private final void method335() {
        int[] var1 = new int[this.field930];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field930; var3++) {
            int var14 = this.field932[var3];
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
        this.field934 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field930; var5++) {
            int var6 = this.field932[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field934[var8] == 0) {
                            this.field934[var8] = var4;
                        }
                        var8 = this.field934[var8];
                    }
                    if (var8 >= this.field934.length) {
                        int[] var11 = new int[this.field934.length * 2];
                        for (int var12 = 0; var12 < this.field934.length; var12++) {
                            var11[var12] = this.field934[var12];
                        }
                        this.field934 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field934[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    private static final int method336(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class162.method1019((byte) -100, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()I")
    public final int method337() {
        int var1;
        for (var1 = 0; this.field934[var1] >= 0; var1 = class136.method863() == 0 ? var1 + 1 : this.field934[var1]) {
        }
        return ~this.field934[var1];
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class45() {
        class136.method855(24);
        this.field933 = class136.method855(16);
        this.field930 = class136.method855(24);
        this.field932 = new int[this.field930];
        boolean var1 = class136.method863() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class136.method855(5) + 1;
            while (var2 < this.field930) {
                int var4 = class136.method855(class128.method808(this.field930 - var2, 0));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field932[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class136.method863() != 0;
            for (int var7 = 0; var7 < this.field930; var7++) {
                if (var6 && class136.method863() == 0) {
                    this.field932[var7] = 0;
                } else {
                    this.field932[var7] = class136.method855(5) + 1;
                }
            }
        }
        this.method335();
        int var8 = class136.method855(4);
        if (var8 > 0) {
            float var9 = class136.method854(class136.method855(32));
            float var10 = class136.method854(class136.method855(32));
            int var11 = class136.method855(4) + 1;
            boolean var12 = class136.method863() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method336(this.field930, this.field933);
            } else {
                var13 = this.field933 * this.field930;
            }
            this.field931 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field931[var14] = class136.method855(var11);
            }
            this.field929 = new float[this.field930][this.field933];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field930; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field933; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field931[var19] * var10 + var9 + var16;
                        this.field929[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field930; var21++) {
                float var22 = 0.0F;
                int var23 = this.field933 * var21;
                for (int var24 = 0; var24 < this.field933; var24++) {
                    float var25 = (float) this.field931[var23] * var10 + var9 + var22;
                    this.field929[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
