import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class195 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    private int field3372;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[I")
    private int[] field3375;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[I")
    private int[] field3373;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[[F")
    private float[][] field3374;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
    private int[] field3377;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()[F")
    public final float[] method1341() {
        return this.field3374[this.method1344()];
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()V")
    private final void method1342() {
        int[] var1 = new int[this.field3372];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3372; var3++) {
            int var14 = this.field3375[var3];
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
        this.field3377 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3372; var5++) {
            int var6 = this.field3375[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field3377[var8] == 0) {
                            this.field3377[var8] = var4;
                        }
                        var8 = this.field3377[var8];
                    }
                    if (var8 >= this.field3377.length) {
                        int[] var11 = new int[this.field3377.length * 2];
                        for (int var12 = 0; var12 < this.field3377.length; var12++) {
                            var11[var12] = this.field3377[var12];
                        }
                        this.field3377 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field3377[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
    private static final int method1343(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class167.method1193(arg1, 1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()I")
    public final int method1344() {
        int var1;
        for (var1 = 0; this.field3377[var1] >= 0; var1 = class40.method328() == 0 ? var1 + 1 : this.field3377[var1]) {
        }
        return ~this.field3377[var1];
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class195() {
        class40.method327(24);
        this.field3376 = class40.method327(16);
        this.field3372 = class40.method327(24);
        this.field3375 = new int[this.field3372];
        boolean var1 = class40.method328() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class40.method327(5) + 1;
            while (var2 < this.field3372) {
                int var4 = class40.method327(class103.method794(147, this.field3372 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3375[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class40.method328() != 0;
            for (int var7 = 0; var7 < this.field3372; var7++) {
                if (var6 && class40.method328() == 0) {
                    this.field3375[var7] = 0;
                } else {
                    this.field3375[var7] = class40.method327(5) + 1;
                }
            }
        }
        this.method1342();
        int var8 = class40.method327(4);
        if (var8 > 0) {
            float var9 = class40.method323(class40.method327(32));
            float var10 = class40.method323(class40.method327(32));
            int var11 = class40.method327(4) + 1;
            boolean var12 = class40.method328() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1343(this.field3372, this.field3376);
            } else {
                var13 = this.field3376 * this.field3372;
            }
            this.field3373 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3373[var14] = class40.method327(var11);
            }
            this.field3374 = new float[this.field3372][this.field3376];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3372; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3376; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3373[var19] * var10 + var9 + var16;
                        this.field3374[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field3372; var21++) {
                float var22 = 0.0F;
                int var23 = this.field3376 * var21;
                for (int var24 = 0; var24 < this.field3376; var24++) {
                    float var25 = (float) this.field3373[var23] * var10 + var9 + var22;
                    this.field3374[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
