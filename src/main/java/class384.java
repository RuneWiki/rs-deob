import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class384 {

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public int field5829;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    private int field5830;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
    private int[] field5831;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
    private int[] field5827;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[[F")
    private float[][] field5828;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
    private int[] field5832;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()[F", line = 3)
    public final float[] method2349() {
        return this.field5828[this.method2350()];
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()I", line = 9)
    public final int method2350() {
        int var1;
        for (var1 = 0; this.field5832[var1] >= 0; var1 = class383.method2343() == 0 ? var1 + 1 : this.field5832[var1]) {
        }
        return ~this.field5832[var1];
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "()V", line = 18)
    private final void method2351() {
        int[] var1 = new int[this.field5830];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5830; var3++) {
            int var14 = this.field5831[var3];
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
        this.field5832 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field5830; var5++) {
            int var6 = this.field5831[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field5832[var8] == 0) {
                            this.field5832[var8] = var4;
                        }
                        var8 = this.field5832[var8];
                    }
                    if (var8 >= this.field5832.length) {
                        int[] var11 = new int[this.field5832.length * 2];
                        for (int var12 = 0; var12 < this.field5832.length; var12++) {
                            var11[var12] = this.field5832[var12];
                        }
                        this.field5832 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field5832[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 157)
    public class384() {
        class383.method2344(24);
        this.field5829 = class383.method2344(16);
        this.field5830 = class383.method2344(24);
        this.field5831 = new int[this.field5830];
        boolean var1 = class383.method2343() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class383.method2344(5) + 1;
            while (var2 < this.field5830) {
                int var4 = class383.method2344(class495.method2972(this.field5830 - var2, false));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5831[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class383.method2343() != 0;
            for (int var7 = 0; var7 < this.field5830; var7++) {
                if (var6 && class383.method2343() == 0) {
                    this.field5831[var7] = 0;
                } else {
                    this.field5831[var7] = class383.method2344(5) + 1;
                }
            }
        }
        this.method2351();
        int var8 = class383.method2344(4);
        if (var8 > 0) {
            float var9 = class383.method2340(class383.method2344(32));
            float var10 = class383.method2340(class383.method2344(32));
            int var11 = class383.method2344(4) + 1;
            boolean var12 = class383.method2343() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2352(this.field5830, this.field5829);
            } else {
                var13 = this.field5830 * this.field5829;
            }
            this.field5827 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5827[var14] = class383.method2344(var11);
            }
            this.field5828 = new float[this.field5830][this.field5829];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5830; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5829; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5827[var19] * var10 + var9 + var16;
                        this.field5828[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field5830; var21++) {
                float var22 = 0.0F;
                int var23 = this.field5829 * var21;
                for (int var24 = 0; var24 < this.field5829; var24++) {
                    float var25 = (float) this.field5827[var23] * var10 + var9 + var22;
                    this.field5828[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)I", line = 301)
    private static final int method2352(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class242.method1627(arg1, var2, false) > arg0; var2--) {
        }
        return var2;
    }
}
