import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 {

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    private int field2702;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[I")
    private int[] field2698;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[I")
    private int[] field2700;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[[F")
    private float[][] field2699;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
    private int[] field2703;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    private static final int method885(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class20.method188(var2, (byte) -87, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    private final void method886() {
        int[] var1 = new int[this.field2702];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field2702; var3++) {
            int var14 = this.field2698[var3];
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
        this.field2703 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2702; var5++) {
            int var6 = this.field2698[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field2703[var8] == 0) {
                            this.field2703[var8] = var4;
                        }
                        var8 = this.field2703[var8];
                    }
                    if (var8 >= this.field2703.length) {
                        int[] var11 = new int[this.field2703.length * 2];
                        for (int var12 = 0; var12 < this.field2703.length; var12++) {
                            var11[var12] = this.field2703[var12];
                        }
                        this.field2703 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field2703[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()I")
    public final int method887() {
        int var1;
        for (var1 = 0; this.field2703[var1] >= 0; var1 = class36.method316() == 0 ? var1 + 1 : this.field2703[var1]) {
        }
        return ~this.field2703[var1];
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class112() {
        class36.method323(24);
        this.field2701 = class36.method323(16);
        this.field2702 = class36.method323(24);
        this.field2698 = new int[this.field2702];
        boolean var1 = class36.method316() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class36.method323(5) + 1;
            while (var2 < this.field2702) {
                int var4 = class36.method323(class28.method251(this.field2702 - var2, -19287));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2698[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class36.method316() != 0;
            for (int var7 = 0; var7 < this.field2702; var7++) {
                if (var6 && class36.method316() == 0) {
                    this.field2698[var7] = 0;
                } else {
                    this.field2698[var7] = class36.method323(5) + 1;
                }
            }
        }
        this.method886();
        int var8 = class36.method323(4);
        if (var8 > 0) {
            float var9 = class36.method319(class36.method323(32));
            float var10 = class36.method319(class36.method323(32));
            int var11 = class36.method323(4) + 1;
            boolean var12 = class36.method316() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method885(this.field2702, this.field2701);
            } else {
                var13 = this.field2702 * this.field2701;
            }
            this.field2700 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2700[var14] = class36.method323(var11);
            }
            this.field2699 = new float[this.field2702][this.field2701];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field2702; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field2701; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field2700[var19] * var10 + var9 + var16;
                        this.field2699[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field2702; var21++) {
                float var22 = 0.0F;
                int var23 = this.field2701 * var21;
                for (int var24 = 0; var24 < this.field2701; var24++) {
                    float var25 = (float) this.field2700[var23] * var10 + var9 + var22;
                    this.field2699[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()[F")
    public final float[] method888() {
        return this.field2699[this.method887()];
    }
}
