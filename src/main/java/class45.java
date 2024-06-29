import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class45 {

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    private int field732;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "[I")
    private int[] field729;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "[I")
    private int[] field733;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "[[F")
    private float[][] field730;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "[I")
    private int[] field734;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "()[F", line = 4)
    public final float[] method356() {
        return this.field730[this.method357()];
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "()I", line = 8)
    public final int method357() {
        int var1;
        for (var1 = 0; this.field734[var1] >= 0; var1 = class360.method2159() == 0 ? var1 + 1 : this.field734[var1]) {
        }
        return ~this.field734[var1];
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V", line = 18)
    public class45() {
        class360.method2156(24);
        this.field731 = class360.method2156(16);
        this.field732 = class360.method2156(24);
        this.field729 = new int[this.field732];
        boolean var1 = class360.method2159() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class360.method2156(5) + 1;
            while (var2 < this.field732) {
                int var4 = class360.method2156(class138.method842(-257, this.field732 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field729[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class360.method2159() != 0;
            for (int var7 = 0; var7 < this.field732; var7++) {
                if (var6 && class360.method2159() == 0) {
                    this.field729[var7] = 0;
                } else {
                    this.field729[var7] = class360.method2156(5) + 1;
                }
            }
        }
        this.method358();
        int var8 = class360.method2156(4);
        if (var8 > 0) {
            float var9 = class360.method2160(class360.method2156(32));
            float var10 = class360.method2160(class360.method2156(32));
            int var11 = class360.method2156(4) + 1;
            boolean var12 = class360.method2159() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method359(this.field732, this.field731);
            } else {
                var13 = this.field732 * this.field731;
            }
            this.field733 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field733[var14] = class360.method2156(var11);
            }
            this.field730 = new float[this.field732][this.field731];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field732; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field731; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field733[var19] * var10 + var9 + var16;
                        this.field730[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field732; var21++) {
                float var22 = 0.0F;
                int var23 = this.field731 * var21;
                for (int var24 = 0; var24 < this.field731; var24++) {
                    float var25 = (float) this.field733[var23] * var10 + var9 + var22;
                    this.field730[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "()V", line = 161)
    private final void method358() {
        int[] var1 = new int[this.field732];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field732; var3++) {
            int var14 = this.field729[var3];
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
        this.field734 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field732; var5++) {
            int var6 = this.field729[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field734[var8] == 0) {
                            this.field734[var8] = var4;
                        }
                        var8 = this.field734[var8];
                    }
                    if (var8 >= this.field734.length) {
                        int[] var11 = new int[this.field734.length * 2];
                        for (int var12 = 0; var12 < this.field734.length; var12++) {
                            var11[var12] = this.field734[var12];
                        }
                        this.field734 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field734[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I", line = 301)
    private static final int method359(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class68.method483(var2, (byte) -91, arg1) > arg0; var2--) {
        }
        return var2;
    }
}
