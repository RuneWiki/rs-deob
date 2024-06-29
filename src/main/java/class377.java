import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class377 {

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public int field5865;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    private int field5867;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "[I")
    private int[] field5866;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "[I")
    private int[] field5868;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "[[F")
    private float[][] field5869;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "[I")
    private int[] field5870;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "()[F", line = 3)
    public final float[] method2393() {
        return this.field5869[this.method2395()];
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "()V", line = 7)
    private final void method2394() {
        int[] var1 = new int[this.field5867];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5867; var3++) {
            int var14 = this.field5866[var3];
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
        this.field5870 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field5867; var5++) {
            int var6 = this.field5866[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field5870[var8] == 0) {
                            this.field5870[var8] = var4;
                        }
                        var8 = this.field5870[var8];
                    }
                    if (var8 >= this.field5870.length) {
                        int[] var11 = new int[this.field5870.length * 2];
                        for (int var12 = 0; var12 < this.field5870.length; var12++) {
                            var11[var12] = this.field5870[var12];
                        }
                        this.field5870 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field5870[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "()I", line = 148)
    public final int method2395() {
        int var1;
        for (var1 = 0; this.field5870[var1] >= 0; var1 = class354.method2276() == 0 ? var1 + 1 : this.field5870[var1]) {
        }
        return ~this.field5870[var1];
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V", line = 157)
    public class377() {
        class354.method2272(24);
        this.field5865 = class354.method2272(16);
        this.field5867 = class354.method2272(24);
        this.field5866 = new int[this.field5867];
        boolean var1 = class354.method2276() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class354.method2272(5) + 1;
            while (var2 < this.field5867) {
                int var4 = class354.method2272(class54.method376(this.field5867 - var2, 32238));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5866[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class354.method2276() != 0;
            for (int var7 = 0; var7 < this.field5867; var7++) {
                if (var6 && class354.method2276() == 0) {
                    this.field5866[var7] = 0;
                } else {
                    this.field5866[var7] = class354.method2272(5) + 1;
                }
            }
        }
        this.method2394();
        int var8 = class354.method2272(4);
        if (var8 > 0) {
            float var9 = class354.method2269(class354.method2272(32));
            float var10 = class354.method2269(class354.method2272(32));
            int var11 = class354.method2272(4) + 1;
            boolean var12 = class354.method2276() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2396(this.field5867, this.field5865);
            } else {
                var13 = this.field5867 * this.field5865;
            }
            this.field5868 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5868[var14] = class354.method2272(var11);
            }
            this.field5869 = new float[this.field5867][this.field5865];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5867; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5865; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5868[var19] * var10 + var9 + var16;
                        this.field5869[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field5867; var21++) {
                float var22 = 0.0F;
                int var23 = this.field5865 * var21;
                for (int var24 = 0; var24 < this.field5865; var24++) {
                    float var25 = (float) this.field5868[var23] * var10 + var9 + var22;
                    this.field5869[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I", line = 301)
    private static final int method2396(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class289.method1869(arg1, 23491, var2) > arg0; var2--) {
        }
        return var2;
    }
}
