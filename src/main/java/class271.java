import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class271 {

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    private int field4369;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[I")
    private int[] field4368;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[I")
    private int[] field4366;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[[F")
    private float[][] field4365;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
    private int[] field4370;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
    private final void method1878() {
        int[] var1 = new int[this.field4369];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4369; var3++) {
            int var14 = this.field4368[var3];
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
        this.field4370 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field4369; var5++) {
            int var6 = this.field4368[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field4370[var8] == 0) {
                            this.field4370[var8] = var4;
                        }
                        var8 = this.field4370[var8];
                    }
                    if (var8 >= this.field4370.length) {
                        int[] var11 = new int[this.field4370.length * 2];
                        for (int var12 = 0; var12 < this.field4370.length; var12++) {
                            var11[var12] = this.field4370[var12];
                        }
                        this.field4370 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field4370[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
    private static final int method1879(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class193.method1438((byte) 83, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
    public final int method1880() {
        int var1;
        for (var1 = 0; this.field4370[var1] >= 0; var1 = class292.method1981() == 0 ? var1 + 1 : this.field4370[var1]) {
        }
        return ~this.field4370[var1];
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()[F")
    public final float[] method1881() {
        return this.field4365[this.method1880()];
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class271() {
        class292.method1975(24);
        this.field4367 = class292.method1975(16);
        this.field4369 = class292.method1975(24);
        this.field4368 = new int[this.field4369];
        boolean var1 = class292.method1981() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class292.method1975(5) + 1;
            while (var2 < this.field4369) {
                int var4 = class292.method1975(class138.method982(this.field4369 - var2, -25030));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4368[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class292.method1981() != 0;
            for (int var7 = 0; var7 < this.field4369; var7++) {
                if (var6 && class292.method1981() == 0) {
                    this.field4368[var7] = 0;
                } else {
                    this.field4368[var7] = class292.method1975(5) + 1;
                }
            }
        }
        this.method1878();
        int var8 = class292.method1975(4);
        if (var8 > 0) {
            float var9 = class292.method1976(class292.method1975(32));
            float var10 = class292.method1976(class292.method1975(32));
            int var11 = class292.method1975(4) + 1;
            boolean var12 = class292.method1981() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1879(this.field4369, this.field4367);
            } else {
                var13 = this.field4369 * this.field4367;
            }
            this.field4366 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4366[var14] = class292.method1975(var11);
            }
            this.field4365 = new float[this.field4369][this.field4367];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4369; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4367; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4366[var19] * var10 + var9 + var16;
                        this.field4365[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field4369; var21++) {
                float var22 = 0.0F;
                int var23 = this.field4367 * var21;
                for (int var24 = 0; var24 < this.field4367; var24++) {
                    float var25 = (float) this.field4366[var23] * var10 + var9 + var22;
                    this.field4365[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
