import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class62 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    private int[] field1212;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[I")
    private int[] field1213;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "[[F")
    private float[][] field1215;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    private int[] field1216;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()I")
    public final int method420() {
        int var1;
        for (var1 = 0; this.field1216[var1] >= 0; var1 = class127.method770() == 0 ? var1 + 1 : this.field1216[var1]) {
        }
        return ~this.field1216[var1];
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V")
    private final void method421() {
        int[] var1 = new int[this.field1214];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1214; var3++) {
            int var14 = this.field1212[var3];
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
        this.field1216 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1214; var5++) {
            int var6 = this.field1212[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field1216[var8] == 0) {
                            this.field1216[var8] = var4;
                        }
                        var8 = this.field1216[var8];
                    }
                    if (var8 >= this.field1216.length) {
                        int[] var11 = new int[this.field1216.length * 2];
                        for (int var12 = 0; var12 < this.field1216.length; var12++) {
                            var11[var12] = this.field1216[var12];
                        }
                        this.field1216 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field1216[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()[F")
    public final float[] method422() {
        return this.field1215[this.method420()];
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
    private static final int method423(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class46.method325((byte) -86, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class62() {
        class127.method768(24);
        this.field1211 = class127.method768(16);
        this.field1214 = class127.method768(24);
        this.field1212 = new int[this.field1214];
        boolean var1 = class127.method770() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class127.method768(5) + 1;
            while (var2 < this.field1214) {
                int var4 = class127.method768(class152.method1003(this.field1214 - var2, (byte) 113));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1212[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class127.method770() != 0;
            for (int var7 = 0; var7 < this.field1214; var7++) {
                if (var6 && class127.method770() == 0) {
                    this.field1212[var7] = 0;
                } else {
                    this.field1212[var7] = class127.method768(5) + 1;
                }
            }
        }
        this.method421();
        int var8 = class127.method768(4);
        if (var8 > 0) {
            float var9 = class127.method773(class127.method768(32));
            float var10 = class127.method773(class127.method768(32));
            int var11 = class127.method768(4) + 1;
            boolean var12 = class127.method770() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method423(this.field1214, this.field1211);
            } else {
                var13 = this.field1214 * this.field1211;
            }
            this.field1213 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1213[var14] = class127.method768(var11);
            }
            this.field1215 = new float[this.field1214][this.field1211];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1214; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1211; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1213[var19] * var10 + var9 + var16;
                        this.field1215[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field1214; var21++) {
                float var22 = 0.0F;
                int var23 = this.field1211 * var21;
                for (int var24 = 0; var24 < this.field1211; var24++) {
                    float var25 = (float) this.field1213[var23] * var10 + var9 + var22;
                    this.field1215[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
