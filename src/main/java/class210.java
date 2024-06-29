import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class210 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public int field3639;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    private int field3642;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "[I")
    private int[] field3641;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
    private int[] field3640;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "[[F")
    private float[][] field3638;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    private int[] field3643;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()V")
    private final void method1359() {
        int[] var1 = new int[this.field3642];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3642; var3++) {
            int var14 = this.field3641[var3];
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
        this.field3643 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3642; var5++) {
            int var6 = this.field3641[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field3643[var8] == 0) {
                            this.field3643[var8] = var4;
                        }
                        var8 = this.field3643[var8];
                    }
                    if (var8 >= this.field3643.length) {
                        int[] var11 = new int[this.field3643.length * 2];
                        for (int var12 = 0; var12 < this.field3643.length; var12++) {
                            var11[var12] = this.field3643[var12];
                        }
                        this.field3643 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field3643[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()[F")
    public final float[] method1360() {
        return this.field3638[this.method1362()];
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    private static final int method1361(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class86.method569(-120, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class210() {
        class235.method1519(24);
        this.field3639 = class235.method1519(16);
        this.field3642 = class235.method1519(24);
        this.field3641 = new int[this.field3642];
        boolean var1 = class235.method1515() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class235.method1519(5) + 1;
            while (var2 < this.field3642) {
                int var4 = class235.method1519(class153.method1011(this.field3642 - var2, -1953808724));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3641[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class235.method1515() != 0;
            for (int var7 = 0; var7 < this.field3642; var7++) {
                if (var6 && class235.method1515() == 0) {
                    this.field3641[var7] = 0;
                } else {
                    this.field3641[var7] = class235.method1519(5) + 1;
                }
            }
        }
        this.method1359();
        int var8 = class235.method1519(4);
        if (var8 > 0) {
            float var9 = class235.method1522(class235.method1519(32));
            float var10 = class235.method1522(class235.method1519(32));
            int var11 = class235.method1519(4) + 1;
            boolean var12 = class235.method1515() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1361(this.field3642, this.field3639);
            } else {
                var13 = this.field3642 * this.field3639;
            }
            this.field3640 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3640[var14] = class235.method1519(var11);
            }
            this.field3638 = new float[this.field3642][this.field3639];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3642; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3639; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3640[var19] * var10 + var9 + var16;
                        this.field3638[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field3642; var21++) {
                float var22 = 0.0F;
                int var23 = this.field3639 * var21;
                for (int var24 = 0; var24 < this.field3639; var24++) {
                    float var25 = (float) this.field3640[var23] * var10 + var9 + var22;
                    this.field3638[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()I")
    public final int method1362() {
        int var1;
        for (var1 = 0; this.field3643[var1] >= 0; var1 = class235.method1515() == 0 ? var1 + 1 : this.field3643[var1]) {
        }
        return ~this.field3643[var1];
    }
}
