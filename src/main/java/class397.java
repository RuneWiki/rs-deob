import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class397 {

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public int field5880;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    private int field5876;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "[I")
    private int[] field5878;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "[I")
    private int[] field5879;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "[[F")
    private float[][] field5877;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "[I")
    private int[] field5881;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "()V", line = 5)
    private final void method2437() {
        int[] var1 = new int[this.field5876];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5876; var3++) {
            int var14 = this.field5878[var3];
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
        this.field5881 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field5876; var5++) {
            int var6 = this.field5878[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field5881[var8] == 0) {
                            this.field5881[var8] = var4;
                        }
                        var8 = this.field5881[var8];
                    }
                    if (var8 >= this.field5881.length) {
                        int[] var11 = new int[this.field5881.length * 2];
                        for (int var12 = 0; var12 < this.field5881.length; var12++) {
                            var11[var12] = this.field5881[var12];
                        }
                        this.field5881 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field5881[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "()I", line = 144)
    public final int method2438() {
        int var1;
        for (var1 = 0; this.field5881[var1] >= 0; var1 = class359.method2196() == 0 ? var1 + 1 : this.field5881[var1]) {
        }
        return ~this.field5881[var1];
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)I", line = 155)
    private static final int method2439(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class64.method659(1, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "()[F", line = 162)
    public final float[] method2440() {
        return this.field5877[this.method2438()];
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V", line = 165)
    public class397() {
        class359.method2186(24);
        this.field5880 = class359.method2186(16);
        this.field5876 = class359.method2186(24);
        this.field5878 = new int[this.field5876];
        boolean var1 = class359.method2196() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class359.method2186(5) + 1;
            while (var2 < this.field5876) {
                int var4 = class359.method2186(class608.method3411((byte) -91, this.field5876 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5878[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class359.method2196() != 0;
            for (int var7 = 0; var7 < this.field5876; var7++) {
                if (var6 && class359.method2196() == 0) {
                    this.field5878[var7] = 0;
                } else {
                    this.field5878[var7] = class359.method2186(5) + 1;
                }
            }
        }
        this.method2437();
        int var8 = class359.method2186(4);
        if (var8 > 0) {
            float var9 = class359.method2195(class359.method2186(32));
            float var10 = class359.method2195(class359.method2186(32));
            int var11 = class359.method2186(4) + 1;
            boolean var12 = class359.method2196() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2439(this.field5876, this.field5880);
            } else {
                var13 = this.field5880 * this.field5876;
            }
            this.field5879 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5879[var14] = class359.method2186(var11);
            }
            this.field5877 = new float[this.field5876][this.field5880];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5876; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5880; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5879[var19] * var10 + var9 + var16;
                        this.field5877[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field5876; var21++) {
                float var22 = 0.0F;
                int var23 = this.field5880 * var21;
                for (int var24 = 0; var24 < this.field5880; var24++) {
                    float var25 = (float) this.field5879[var23] * var10 + var9 + var22;
                    this.field5877[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
