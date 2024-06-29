import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class462 {

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public int field6221;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    private int field6219;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "[I")
    private int[] field6217;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[I")
    private int[] field6220;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[[F")
    private float[][] field6218;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[I")
    private int[] field6222;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I", line = 4)
    private static final int method2631(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class471.method2685(arg1, true, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()[F", line = 11)
    public final float[] method2632() {
        return this.field6218[this.method2634()];
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()V", line = 18)
    private final void method2633() {
        int[] var1 = new int[this.field6219];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field6219; var3++) {
            int var14 = this.field6217[var3];
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
        this.field6222 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field6219; var5++) {
            int var6 = this.field6217[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field6222[var8] == 0) {
                            this.field6222[var8] = var4;
                        }
                        var8 = this.field6222[var8];
                    }
                    if (var8 >= this.field6222.length) {
                        int[] var11 = new int[this.field6222.length * 2];
                        for (int var12 = 0; var12 < this.field6222.length; var12++) {
                            var11[var12] = this.field6222[var12];
                        }
                        this.field6222 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field6222[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 157)
    public class462() {
        class413.method2319(24);
        this.field6221 = class413.method2319(16);
        this.field6219 = class413.method2319(24);
        this.field6217 = new int[this.field6219];
        boolean var1 = class413.method2321() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class413.method2319(5) + 1;
            while (var2 < this.field6219) {
                int var4 = class413.method2319(class423.method2356(this.field6219 - var2, 1));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6217[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class413.method2321() != 0;
            for (int var7 = 0; var7 < this.field6219; var7++) {
                if (var6 && class413.method2321() == 0) {
                    this.field6217[var7] = 0;
                } else {
                    this.field6217[var7] = class413.method2319(5) + 1;
                }
            }
        }
        this.method2633();
        int var8 = class413.method2319(4);
        if (var8 > 0) {
            float var9 = class413.method2317(class413.method2319(32));
            float var10 = class413.method2317(class413.method2319(32));
            int var11 = class413.method2319(4) + 1;
            boolean var12 = class413.method2321() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2631(this.field6219, this.field6221);
            } else {
                var13 = this.field6221 * this.field6219;
            }
            this.field6220 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field6220[var14] = class413.method2319(var11);
            }
            this.field6218 = new float[this.field6219][this.field6221];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field6219; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field6221; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field6220[var19] * var10 + var9 + var16;
                        this.field6218[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field6219; var21++) {
                float var22 = 0.0F;
                int var23 = this.field6221 * var21;
                for (int var24 = 0; var24 < this.field6221; var24++) {
                    float var25 = (float) this.field6220[var23] * var10 + var9 + var22;
                    this.field6218[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "()I", line = 300)
    public final int method2634() {
        int var1;
        for (var1 = 0; this.field6222[var1] >= 0; var1 = class413.method2321() == 0 ? var1 + 1 : this.field6222[var1]) {
        }
        return ~this.field6222[var1];
    }
}
