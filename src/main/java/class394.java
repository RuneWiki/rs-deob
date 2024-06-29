import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class394 {

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field5531;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    private int field5530;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[I")
    private int[] field5529;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[I")
    private int[] field5532;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[[F")
    private float[][] field5528;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
    private int[] field5533;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I", line = 6)
    private static final int method2279(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class75.method572(arg1, var2, true) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()I", line = 15)
    public final int method2280() {
        int var1;
        for (var1 = 0; this.field5533[var1] >= 0; var1 = class42.method245() == 0 ? var1 + 1 : this.field5533[var1]) {
        }
        return ~this.field5533[var1];
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()[F", line = 22)
    public final float[] method2281() {
        return this.field5528[this.method2280()];
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V", line = 26)
    public class394() {
        class42.method243(24);
        this.field5531 = class42.method243(16);
        this.field5530 = class42.method243(24);
        this.field5529 = new int[this.field5530];
        boolean var1 = class42.method245() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class42.method243(5) + 1;
            while (var2 < this.field5530) {
                int var4 = class42.method243(class25.method164((byte) -50, this.field5530 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5529[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class42.method245() != 0;
            for (int var7 = 0; var7 < this.field5530; var7++) {
                if (var6 && class42.method245() == 0) {
                    this.field5529[var7] = 0;
                } else {
                    this.field5529[var7] = class42.method243(5) + 1;
                }
            }
        }
        this.method2282();
        int var8 = class42.method243(4);
        if (var8 > 0) {
            float var9 = class42.method239(class42.method243(32));
            float var10 = class42.method239(class42.method243(32));
            int var11 = class42.method243(4) + 1;
            boolean var12 = class42.method245() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2279(this.field5530, this.field5531);
            } else {
                var13 = this.field5531 * this.field5530;
            }
            this.field5532 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5532[var14] = class42.method243(var11);
            }
            this.field5528 = new float[this.field5530][this.field5531];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5530; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5531; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5532[var19] * var10 + var9 + var16;
                        this.field5528[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field5530; var21++) {
                float var22 = 0.0F;
                int var23 = this.field5531 * var21;
                for (int var24 = 0; var24 < this.field5531; var24++) {
                    float var25 = (float) this.field5532[var23] * var10 + var9 + var22;
                    this.field5528[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()V", line = 169)
    private final void method2282() {
        int[] var1 = new int[this.field5530];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5530; var3++) {
            int var14 = this.field5529[var3];
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
        this.field5533 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field5530; var5++) {
            int var6 = this.field5529[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field5533[var8] == 0) {
                            this.field5533[var8] = var4;
                        }
                        var8 = this.field5533[var8];
                    }
                    if (var8 >= this.field5533.length) {
                        int[] var11 = new int[this.field5533.length * 2];
                        for (int var12 = 0; var12 < this.field5533.length; var12++) {
                            var11[var12] = this.field5533[var12];
                        }
                        this.field5533 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field5533[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }
}
