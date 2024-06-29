import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class21 {

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[I")
    private int[] field359;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[I")
    private int[] field358;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[[F")
    private float[][] field357;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
    private int[] field361;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
    public final int method139() {
        int var1;
        for (var1 = 0; this.field361[var1] >= 0; var1 = class181.method1230() == 0 ? var1 + 1 : this.field361[var1]) {
        }
        return ~this.field361[var1];
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
    private static final int method140(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class180.method1221((byte) -106, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()[F")
    public final float[] method141() {
        return this.field357[this.method139()];
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
    private final void method142() {
        int[] var1 = new int[this.field356];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field356; var3++) {
            int var14 = this.field359[var3];
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
        this.field361 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field356; var5++) {
            int var6 = this.field359[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field361[var8] == 0) {
                            this.field361[var8] = var4;
                        }
                        var8 = this.field361[var8];
                    }
                    if (var8 >= this.field361.length) {
                        int[] var11 = new int[this.field361.length * 2];
                        for (int var12 = 0; var12 < this.field361.length; var12++) {
                            var11[var12] = this.field361[var12];
                        }
                        this.field361 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field361[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class21() {
        class181.method1226(24);
        this.field360 = class181.method1226(16);
        this.field356 = class181.method1226(24);
        this.field359 = new int[this.field356];
        boolean var1 = class181.method1230() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class181.method1226(5) + 1;
            while (var2 < this.field356) {
                int var4 = class181.method1226(class98.method738(this.field356 - var2, false));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field359[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class181.method1230() != 0;
            for (int var7 = 0; var7 < this.field356; var7++) {
                if (var6 && class181.method1230() == 0) {
                    this.field359[var7] = 0;
                } else {
                    this.field359[var7] = class181.method1226(5) + 1;
                }
            }
        }
        this.method142();
        int var8 = class181.method1226(4);
        if (var8 > 0) {
            float var9 = class181.method1227(class181.method1226(32));
            float var10 = class181.method1227(class181.method1226(32));
            int var11 = class181.method1226(4) + 1;
            boolean var12 = class181.method1230() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method140(this.field356, this.field360);
            } else {
                var13 = this.field360 * this.field356;
            }
            this.field358 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field358[var14] = class181.method1226(var11);
            }
            this.field357 = new float[this.field356][this.field360];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field356; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field360; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field358[var19] * var10 + var9 + var16;
                        this.field357[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field356; var21++) {
                float var22 = 0.0F;
                int var23 = this.field360 * var21;
                for (int var24 = 0; var24 < this.field360; var24++) {
                    float var25 = (float) this.field358[var23] * var10 + var9 + var22;
                    this.field357[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
