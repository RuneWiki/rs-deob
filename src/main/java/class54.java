import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class54 {

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "[I")
    private int[] field546;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "[I")
    private int[] field547;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "[[F")
    private float[][] field548;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "[I")
    private int[] field551;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "()I")
    public final int method283() {
        int var1;
        for (var1 = 0; this.field551[var1] >= 0; var1 = class253.method1488() == 0 ? var1 + 1 : this.field551[var1]) {
        }
        return ~this.field551[var1];
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
    private static final int method284(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class224.method1353(var2, arg1, 67) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "()[F")
    public final float[] method285() {
        return this.field548[this.method283()];
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "()V")
    private final void method286() {
        int[] var1 = new int[this.field549];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field549; var3++) {
            int var14 = this.field546[var3];
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
        this.field551 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field549; var5++) {
            int var6 = this.field546[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field551[var8] == 0) {
                            this.field551[var8] = var4;
                        }
                        var8 = this.field551[var8];
                    }
                    if (var8 >= this.field551.length) {
                        int[] var11 = new int[this.field551.length * 2];
                        for (int var12 = 0; var12 < this.field551.length; var12++) {
                            var11[var12] = this.field551[var12];
                        }
                        this.field551 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field551[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
    public class54() {
        class253.method1490(24);
        this.field550 = class253.method1490(16);
        this.field549 = class253.method1490(24);
        this.field546 = new int[this.field549];
        boolean var1 = class253.method1488() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class253.method1490(5) + 1;
            while (var2 < this.field549) {
                int var4 = class253.method1490(class258.method1532(this.field549 - var2, false));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field546[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class253.method1488() != 0;
            for (int var7 = 0; var7 < this.field549; var7++) {
                if (var6 && class253.method1488() == 0) {
                    this.field546[var7] = 0;
                } else {
                    this.field546[var7] = class253.method1490(5) + 1;
                }
            }
        }
        this.method286();
        int var8 = class253.method1490(4);
        if (var8 > 0) {
            float var9 = class253.method1493(class253.method1490(32));
            float var10 = class253.method1493(class253.method1490(32));
            int var11 = class253.method1490(4) + 1;
            boolean var12 = class253.method1488() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method284(this.field549, this.field550);
            } else {
                var13 = this.field550 * this.field549;
            }
            this.field547 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field547[var14] = class253.method1490(var11);
            }
            this.field548 = new float[this.field549][this.field550];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field549; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field550; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field547[var19] * var10 + var9 + var16;
                        this.field548[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field549; var21++) {
                float var22 = 0.0F;
                int var23 = this.field550 * var21;
                for (int var24 = 0; var24 < this.field550; var24++) {
                    float var25 = (float) this.field547[var23] * var10 + var9 + var22;
                    this.field548[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
