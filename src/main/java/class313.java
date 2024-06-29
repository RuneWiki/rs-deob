import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class313 {

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public int field5528;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    private int field5527;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "[I")
    private int[] field5529;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    private int[] field5526;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[[F")
    private float[][] field5530;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[I")
    private int[] field5531;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V", line = 5)
    private final void method2217() {
        int[] var1 = new int[this.field5527];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5527; var3++) {
            int var4 = this.field5529[var3];
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
        this.field5531 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field5527; var14++) {
            int var15 = this.field5529[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field5531[var17] == 0) {
                            this.field5531[var17] = var13;
                        }
                        var17 = this.field5531[var17];
                    }
                    if (var17 >= this.field5531.length) {
                        int[] var20 = new int[this.field5531.length * 2];
                        for (int var21 = 0; var21 < this.field5531.length; var21++) {
                            var20[var21] = this.field5531[var21];
                        }
                        this.field5531 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field5531[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()[F", line = 145)
    public final float[] method2218() {
        return this.field5530[this.method2219()];
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()I", line = 150)
    public final int method2219() {
        int var1;
        for (var1 = 0; this.field5531[var1] >= 0; var1 = class258.method1846() == 0 ? var1 + 1 : this.field5531[var1]) {
        }
        return ~this.field5531[var1];
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I", line = 159)
    private static final int method2220(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class292.method2082((byte) 41, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 165)
    public class313() {
        class258.method1853(24);
        this.field5528 = class258.method1853(16);
        this.field5527 = class258.method1853(24);
        this.field5529 = new int[this.field5527];
        boolean var1 = class258.method1846() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class258.method1853(5) + 1;
            while (var2 < this.field5527) {
                int var4 = class258.method1853(class172.method1344(this.field5527 - var2, 2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5529[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class258.method1846() != 0;
            for (int var7 = 0; var7 < this.field5527; var7++) {
                if (var6 && class258.method1846() == 0) {
                    this.field5529[var7] = 0;
                } else {
                    this.field5529[var7] = class258.method1853(5) + 1;
                }
            }
        }
        this.method2217();
        int var8 = class258.method1853(4);
        if (var8 > 0) {
            float var9 = class258.method1855(class258.method1853(32));
            float var10 = class258.method1855(class258.method1853(32));
            int var11 = class258.method1853(4) + 1;
            boolean var12 = class258.method1846() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2220(this.field5527, this.field5528);
            } else {
                var13 = this.field5528 * this.field5527;
            }
            this.field5526 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5526[var14] = class258.method1853(var11);
            }
            this.field5530 = new float[this.field5527][this.field5528];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5527; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5528; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5526[var19] * var10 + var9 + var16;
                        this.field5530[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field5527; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field5528 * var21;
                    for (int var24 = 0; var24 < this.field5528; var24++) {
                        float var25 = (float) this.field5526[var23] * var10 + var9 + var22;
                        this.field5530[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }
}
