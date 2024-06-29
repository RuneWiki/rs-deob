import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class106 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    private int field1741;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[I")
    private int[] field1738;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[I")
    private int[] field1740;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[[F")
    private float[][] field1739;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[I")
    private int[] field1742;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()I")
    public final int method791() {
        int var1;
        for (var1 = 0; this.field1742[var1] >= 0; var1 = class212.method1509() == 0 ? var1 + 1 : this.field1742[var1]) {
        }
        return ~this.field1742[var1];
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
    private static final int method792(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class313.method2115(var2, arg1, 121) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class106() {
        class212.method1505(24);
        this.field1737 = class212.method1505(16);
        this.field1741 = class212.method1505(24);
        this.field1738 = new int[this.field1741];
        boolean var1 = class212.method1509() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class212.method1505(5) + 1;
            while (var2 < this.field1741) {
                int var4 = class212.method1505(class123.method932((byte) -23, this.field1741 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1738[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class212.method1509() != 0;
            for (int var7 = 0; var7 < this.field1741; var7++) {
                if (var6 && class212.method1509() == 0) {
                    this.field1738[var7] = 0;
                } else {
                    this.field1738[var7] = class212.method1505(5) + 1;
                }
            }
        }
        this.method794();
        int var8 = class212.method1505(4);
        if (var8 > 0) {
            float var9 = class212.method1507(class212.method1505(32));
            float var10 = class212.method1507(class212.method1505(32));
            int var11 = class212.method1505(4) + 1;
            boolean var12 = class212.method1509() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method792(this.field1741, this.field1737);
            } else {
                var13 = this.field1741 * this.field1737;
            }
            this.field1740 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1740[var14] = class212.method1505(var11);
            }
            this.field1739 = new float[this.field1741][this.field1737];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1741; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1737; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1740[var19] * var10 + var9 + var16;
                        this.field1739[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field1741; var21++) {
                float var22 = 0.0F;
                int var23 = this.field1737 * var21;
                for (int var24 = 0; var24 < this.field1737; var24++) {
                    float var25 = (float) this.field1740[var23] * var10 + var9 + var22;
                    this.field1739[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()[F")
    public final float[] method793() {
        return this.field1739[this.method791()];
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
    private final void method794() {
        int[] var1 = new int[this.field1741];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1741; var3++) {
            int var14 = this.field1738[var3];
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
        this.field1742 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1741; var5++) {
            int var6 = this.field1738[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field1742[var8] == 0) {
                            this.field1742[var8] = var4;
                        }
                        var8 = this.field1742[var8];
                    }
                    if (var8 >= this.field1742.length) {
                        int[] var11 = new int[this.field1742.length * 2];
                        for (int var12 = 0; var12 < this.field1742.length; var12++) {
                            var11[var12] = this.field1742[var12];
                        }
                        this.field1742 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field1742[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }
}
