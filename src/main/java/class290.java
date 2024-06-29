import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class290 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field4708;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    private int field4711;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
    private int[] field4709;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    private int[] field4710;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[[F")
    private float[][] field4707;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "[I")
    private int[] field4712;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()I", line = 4)
    public final int method2060() {
        int var1;
        for (var1 = 0; this.field4712[var1] >= 0; var1 = class307.method2238() == 0 ? var1 + 1 : this.field4712[var1]) {
        }
        return ~this.field4712[var1];
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)I", line = 13)
    private static final int method2061(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class55.method472((byte) 102, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()[F", line = 21)
    public final float[] method2062() {
        return this.field4707[this.method2060()];
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()V", line = 27)
    private final void method2063() {
        int[] var1 = new int[this.field4711];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4711; var3++) {
            int var4 = this.field4709[var3];
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
        this.field4712 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field4711; var14++) {
            int var15 = this.field4709[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field4712[var17] == 0) {
                            this.field4712[var17] = var13;
                        }
                        var17 = this.field4712[var17];
                    }
                    if (var17 >= this.field4712.length) {
                        int[] var20 = new int[this.field4712.length * 2];
                        for (int var21 = 0; var21 < this.field4712.length; var21++) {
                            var20[var21] = this.field4712[var21];
                        }
                        this.field4712 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field4712[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 165)
    public class290() {
        class307.method2242(24);
        this.field4708 = class307.method2242(16);
        this.field4711 = class307.method2242(24);
        this.field4709 = new int[this.field4711];
        boolean var1 = class307.method2238() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class307.method2242(5) + 1;
            while (var2 < this.field4711) {
                int var4 = class307.method2242(class52.method454(this.field4711 - var2, (byte) -113));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4709[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class307.method2238() != 0;
            for (int var7 = 0; var7 < this.field4711; var7++) {
                if (var6 && class307.method2238() == 0) {
                    this.field4709[var7] = 0;
                } else {
                    this.field4709[var7] = class307.method2242(5) + 1;
                }
            }
        }
        this.method2063();
        int var8 = class307.method2242(4);
        if (var8 > 0) {
            float var9 = class307.method2241(class307.method2242(32));
            float var10 = class307.method2241(class307.method2242(32));
            int var11 = class307.method2242(4) + 1;
            boolean var12 = class307.method2238() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2061(this.field4711, this.field4708);
            } else {
                var13 = this.field4711 * this.field4708;
            }
            this.field4710 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4710[var14] = class307.method2242(var11);
            }
            this.field4707 = new float[this.field4711][this.field4708];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4711; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4708; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4710[var19] * var10 + var9 + var16;
                        this.field4707[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field4711; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field4708 * var21;
                    for (int var24 = 0; var24 < this.field4708; var24++) {
                        float var25 = (float) this.field4710[var23] * var10 + var9 + var22;
                        this.field4707[var21][var24] = var25;
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
