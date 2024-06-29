import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class118 {

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    private int field2229;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
    private int[] field2231;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "[I")
    private int[] field2230;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[[F")
    private float[][] field2232;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
    private int[] field2234;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
    private final void method828() {
        int[] var1 = new int[this.field2229];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field2229; var3++) {
            int var14 = this.field2231[var3];
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
        this.field2234 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2229; var5++) {
            int var6 = this.field2231[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field2234[var8] == 0) {
                            this.field2234[var8] = var4;
                        }
                        var8 = this.field2234[var8];
                    }
                    if (var8 >= this.field2234.length) {
                        int[] var11 = new int[this.field2234.length * 2];
                        for (int var12 = 0; var12 < this.field2234.length; var12++) {
                            var11[var12] = this.field2234[var12];
                        }
                        this.field2234 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field2234[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()[F")
    public final float[] method829() {
        return this.field2232[this.method830()];
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()I")
    public final int method830() {
        int var1;
        for (var1 = 0; this.field2234[var1] >= 0; var1 = class192.method1289() == 0 ? var1 + 1 : this.field2234[var1]) {
        }
        return ~this.field2234[var1];
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I")
    private static final int method831(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class145.method991(17899, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class118() {
        class192.method1285(24);
        this.field2233 = class192.method1285(16);
        this.field2229 = class192.method1285(24);
        this.field2231 = new int[this.field2229];
        boolean var1 = class192.method1289() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class192.method1285(5) + 1;
            while (var2 < this.field2229) {
                int var4 = class192.method1285(class31.method265(-257, this.field2229 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2231[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class192.method1289() != 0;
            for (int var7 = 0; var7 < this.field2229; var7++) {
                if (var6 && class192.method1289() == 0) {
                    this.field2231[var7] = 0;
                } else {
                    this.field2231[var7] = class192.method1285(5) + 1;
                }
            }
        }
        this.method828();
        int var8 = class192.method1285(4);
        if (var8 > 0) {
            float var9 = class192.method1287(class192.method1285(32));
            float var10 = class192.method1287(class192.method1285(32));
            int var11 = class192.method1285(4) + 1;
            boolean var12 = class192.method1289() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method831(this.field2229, this.field2233);
            } else {
                var13 = this.field2233 * this.field2229;
            }
            this.field2230 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2230[var14] = class192.method1285(var11);
            }
            this.field2232 = new float[this.field2229][this.field2233];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field2229; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field2233; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field2230[var19] * var10 + var9 + var16;
                        this.field2232[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field2229; var21++) {
                float var22 = 0.0F;
                int var23 = this.field2233 * var21;
                for (int var24 = 0; var24 < this.field2233; var24++) {
                    float var25 = (float) this.field2230[var23] * var10 + var9 + var22;
                    this.field2232[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
