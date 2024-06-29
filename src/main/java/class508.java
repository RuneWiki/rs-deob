import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class508 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public int field6877;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    private int field6878;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "[I")
    private int[] field6881;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "[I")
    private int[] field6879;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[[F")
    private float[][] field6880;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "[I")
    private int[] field6882;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V", line = 4)
    private final void method2823() {
        int[] var1 = new int[this.field6878];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field6878; var3++) {
            int var14 = this.field6881[var3];
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
        this.field6882 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field6878; var5++) {
            int var6 = this.field6881[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field6882[var8] == 0) {
                            this.field6882[var8] = var4;
                        }
                        var8 = this.field6882[var8];
                    }
                    if (var8 >= this.field6882.length) {
                        int[] var11 = new int[this.field6882.length * 2];
                        for (int var12 = 0; var12 < this.field6882.length; var12++) {
                            var11[var12] = this.field6882[var12];
                        }
                        this.field6882 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field6882[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)I", line = 146)
    private static final int method2824(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class703.method3961(var2, -1, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()I", line = 154)
    public final int method2825() {
        int var1;
        for (var1 = 0; this.field6882[var1] >= 0; var1 = class57.method323() == 0 ? var1 + 1 : this.field6882[var1]) {
        }
        return ~this.field6882[var1];
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()[F", line = 161)
    public final float[] method2826() {
        return this.field6880[this.method2825()];
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 165)
    public class508() {
        class57.method327(24);
        this.field6877 = class57.method327(16);
        this.field6878 = class57.method327(24);
        this.field6881 = new int[this.field6878];
        boolean var1 = class57.method323() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class57.method327(5) + 1;
            while (var2 < this.field6878) {
                int var4 = class57.method327(class185.method1043(this.field6878 - var2, (byte) 31));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6881[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class57.method323() != 0;
            for (int var7 = 0; var7 < this.field6878; var7++) {
                if (var6 && class57.method323() == 0) {
                    this.field6881[var7] = 0;
                } else {
                    this.field6881[var7] = class57.method327(5) + 1;
                }
            }
        }
        this.method2823();
        int var8 = class57.method327(4);
        if (var8 > 0) {
            float var9 = class57.method328(class57.method327(32));
            float var10 = class57.method328(class57.method327(32));
            int var11 = class57.method327(4) + 1;
            boolean var12 = class57.method323() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2824(this.field6878, this.field6877);
            } else {
                var13 = this.field6878 * this.field6877;
            }
            this.field6879 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field6879[var14] = class57.method327(var11);
            }
            this.field6880 = new float[this.field6878][this.field6877];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field6878; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field6877; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field6879[var19] * var10 + var9 + var16;
                        this.field6880[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field6878; var21++) {
                float var22 = 0.0F;
                int var23 = this.field6877 * var21;
                for (int var24 = 0; var24 < this.field6877; var24++) {
                    float var25 = (float) this.field6879[var23] * var10 + var9 + var22;
                    this.field6880[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
