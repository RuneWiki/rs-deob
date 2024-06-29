import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class50 {

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "[I")
    private int[] field628;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "[I")
    private int[] field629;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "[[F")
    private float[][] field631;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "[I")
    private int[] field633;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "()V", line = 5)
    private final void method353() {
        int[] var1 = new int[this.field630];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field630; var3++) {
            int var14 = this.field628[var3];
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
        this.field633 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field630; var5++) {
            int var6 = this.field628[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field633[var8] == 0) {
                            this.field633[var8] = var4;
                        }
                        var8 = this.field633[var8];
                    }
                    if (var8 >= this.field633.length) {
                        int[] var11 = new int[this.field633.length * 2];
                        for (int var12 = 0; var12 < this.field633.length; var12++) {
                            var11[var12] = this.field633[var12];
                        }
                        this.field633 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field633[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "()[F", line = 144)
    public final float[] method354() {
        return this.field631[this.method355()];
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "()I", line = 150)
    public final int method355() {
        int var1;
        for (var1 = 0; this.field633[var1] >= 0; var1 = class175.method1274() == 0 ? var1 + 1 : this.field633[var1]) {
        }
        return ~this.field633[var1];
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)I", line = 158)
    private static final int method356(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class659.method3763(1, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "()V", line = 165)
    public class50() {
        class175.method1268(24);
        this.field632 = class175.method1268(16);
        this.field630 = class175.method1268(24);
        this.field628 = new int[this.field630];
        boolean var1 = class175.method1274() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class175.method1268(5) + 1;
            while (var2 < this.field630) {
                int var4 = class175.method1268(class89.method668(this.field630 - var2, (byte) 45));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field628[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class175.method1274() != 0;
            for (int var7 = 0; var7 < this.field630; var7++) {
                if (var6 && class175.method1274() == 0) {
                    this.field628[var7] = 0;
                } else {
                    this.field628[var7] = class175.method1268(5) + 1;
                }
            }
        }
        this.method353();
        int var8 = class175.method1268(4);
        if (var8 > 0) {
            float var9 = class175.method1270(class175.method1268(32));
            float var10 = class175.method1270(class175.method1268(32));
            int var11 = class175.method1268(4) + 1;
            boolean var12 = class175.method1274() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method356(this.field630, this.field632);
            } else {
                var13 = this.field632 * this.field630;
            }
            this.field629 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field629[var14] = class175.method1268(var11);
            }
            this.field631 = new float[this.field630][this.field632];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field630; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field632; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field629[var19] * var10 + var9 + var16;
                        this.field631[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field630; var21++) {
                float var22 = 0.0F;
                int var23 = this.field632 * var21;
                for (int var24 = 0; var24 < this.field632; var24++) {
                    float var25 = (float) this.field629[var23] * var10 + var9 + var22;
                    this.field631[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
