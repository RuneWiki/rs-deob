import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class27 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[I")
    private int[] field415;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[I")
    private int[] field414;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "[[F")
    private float[][] field412;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
    private int[] field417;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()[F", line = 5)
    public final float[] method242() {
        return this.field412[this.method245()];
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I", line = 11)
    private static final int method243(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class62.method484(var2, (byte) -64, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 18)
    public class27() {
        class196.method1396(24);
        this.field416 = class196.method1396(16);
        this.field413 = class196.method1396(24);
        this.field415 = new int[this.field413];
        boolean var1 = class196.method1398() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class196.method1396(5) + 1;
            while (var2 < this.field413) {
                int var4 = class196.method1396(class34.method284(this.field413 - var2, (byte) 18));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field415[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class196.method1398() != 0;
            for (int var7 = 0; var7 < this.field413; var7++) {
                if (var6 && class196.method1398() == 0) {
                    this.field415[var7] = 0;
                } else {
                    this.field415[var7] = class196.method1396(5) + 1;
                }
            }
        }
        this.method244();
        int var8 = class196.method1396(4);
        if (var8 > 0) {
            float var9 = class196.method1392(class196.method1396(32));
            float var10 = class196.method1392(class196.method1396(32));
            int var11 = class196.method1396(4) + 1;
            boolean var12 = class196.method1398() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method243(this.field413, this.field416);
            } else {
                var13 = this.field416 * this.field413;
            }
            this.field414 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field414[var14] = class196.method1396(var11);
            }
            this.field412 = new float[this.field413][this.field416];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field413; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field416; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field414[var19] * var10 + var9 + var16;
                        this.field412[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field413; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field416 * var21;
                    for (int var24 = 0; var24 < this.field416; var24++) {
                        float var25 = (float) this.field414[var23] * var10 + var9 + var22;
                        this.field412[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()V", line = 161)
    private final void method244() {
        int[] var1 = new int[this.field413];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field413; var3++) {
            int var4 = this.field415[var3];
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
        this.field417 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field413; var14++) {
            int var15 = this.field415[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field417[var17] == 0) {
                            this.field417[var17] = var13;
                        }
                        var17 = this.field417[var17];
                    }
                    if (var17 >= this.field417.length) {
                        int[] var20 = new int[this.field417.length * 2];
                        for (int var21 = 0; var21 < this.field417.length; var21++) {
                            var20[var21] = this.field417[var21];
                        }
                        this.field417 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field417[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "()I", line = 300)
    public final int method245() {
        int var1;
        for (var1 = 0; this.field417[var1] >= 0; var1 = class196.method1398() == 0 ? var1 + 1 : this.field417[var1]) {
        }
        return ~this.field417[var1];
    }
}
