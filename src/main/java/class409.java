import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class409 {

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    private int field5742 = class354.method2207(16);

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    private int field5743 = class354.method2207(24);

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    private int field5739 = class354.method2207(24);

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    private int field5744 = class354.method2207(24) + 1;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    private int field5738 = class354.method2207(6) + 1;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    private int field5740 = class354.method2207(8);

    @OriginalMember(owner = "client!go", name = "d", descriptor = "[I")
    private int[] field5741;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([FIZ)V")
    public final void method2423(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class354.field5113[this.field5740].field1520;
        int var6 = this.field5739 - this.field5743;
        int var7 = var6 / this.field5744;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class354.field5113[this.field5740].method746();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5738;
                        }
                        var11 /= this.field5738;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5741[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5744 * var10 + this.field5743;
                        class123 var17 = class354.field5113[var15];
                        if (this.field5742 == 0) {
                            int var18 = this.field5744 / var17.field1520;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method743();
                                for (int var21 = 0; var21 < var17.field1520; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5744) {
                                float[] var23 = var17.method743();
                                for (int var24 = 0; var24 < var17.field1520; var24++) {
                                    arg0[var16 + var22] += var23[var24];
                                    var22++;
                                }
                            }
                        }
                    }
                    var10++;
                    if (var10 >= var7) {
                        break;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
    public class409() {
        int[] var1 = new int[this.field5738];
        for (int var2 = 0; var2 < this.field5738; var2++) {
            int var4 = 0;
            int var5 = class354.method2207(3);
            boolean var6 = class354.method2205() != 0;
            if (var6) {
                var4 = class354.method2207(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field5741 = new int[this.field5738 * 8];
        for (int var3 = 0; var3 < this.field5738 * 8; var3++) {
            this.field5741[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class354.method2207(8);
        }
    }
}
