import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class526 {

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public int field7770;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    private int field7768;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "[I")
    private int[] field7769;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "[I")
    private int[] field7767;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "[[F")
    private float[][] field7771;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "[I")
    private int[] field7772;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)I")
    private static final int method3131(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class415.method2452(arg1, var2, (byte) -127) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "()I")
    public final int method3132() {
        int var1;
        for (var1 = 0; this.field7772[var1] >= 0; var1 = class396.method2359() == 0 ? var1 + 1 : this.field7772[var1]) {
        }
        return ~this.field7772[var1];
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
    public class526() {
        class396.method2363(24);
        this.field7770 = class396.method2363(16);
        this.field7768 = class396.method2363(24);
        this.field7769 = new int[this.field7768];
        boolean var1 = class396.method2359() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class396.method2363(5) + 1;
            while (var2 < this.field7768) {
                int var4 = class396.method2363(class135.method933(this.field7768 - var2, 13634));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field7769[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class396.method2359() != 0;
            for (int var7 = 0; var7 < this.field7768; var7++) {
                if (var6 && class396.method2359() == 0) {
                    this.field7769[var7] = 0;
                } else {
                    this.field7769[var7] = class396.method2363(5) + 1;
                }
            }
        }
        this.method3133();
        int var8 = class396.method2363(4);
        if (var8 > 0) {
            float var9 = class396.method2360(class396.method2363(32));
            float var10 = class396.method2360(class396.method2363(32));
            int var11 = class396.method2363(4) + 1;
            boolean var12 = class396.method2359() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method3131(this.field7768, this.field7770);
            } else {
                var13 = this.field7770 * this.field7768;
            }
            this.field7767 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field7767[var14] = class396.method2363(var11);
            }
            this.field7771 = new float[this.field7768][this.field7770];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field7768; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field7770; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field7767[var19] * var10 + var9 + var16;
                        this.field7771[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field7768; var21++) {
                float var22 = 0.0F;
                int var23 = this.field7770 * var21;
                for (int var24 = 0; var24 < this.field7770; var24++) {
                    float var25 = (float) this.field7767[var23] * var10 + var9 + var22;
                    this.field7771[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "()V")
    private final void method3133() {
        int[] var1 = new int[this.field7768];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field7768; var3++) {
            int var14 = this.field7769[var3];
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
        this.field7772 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field7768; var5++) {
            int var6 = this.field7769[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field7772[var8] == 0) {
                            this.field7772[var8] = var4;
                        }
                        var8 = this.field7772[var8];
                    }
                    if (var8 >= this.field7772.length) {
                        int[] var11 = new int[this.field7772.length * 2];
                        for (int var12 = 0; var12 < this.field7772.length; var12++) {
                            var11[var12] = this.field7772[var12];
                        }
                        this.field7772 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field7772[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "()[F")
    public final float[] method3134() {
        return this.field7771[this.method3132()];
    }
}
