import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class709 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    private int field9903 = class110.method739(16);

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    private int field9905 = class110.method739(24);

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    private int field9907 = class110.method739(24);

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    private int field9904 = class110.method739(24) + 1;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    private int field9906 = class110.method739(6) + 1;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    private int field9908 = class110.method739(8);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "[I")
    private int[] field9902;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([FIZ)V")
    public final void method3988(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class110.field1581[this.field9908].field4415;
        int var6 = this.field9907 - this.field9905;
        int var7 = var6 / this.field9904;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class110.field1581[this.field9908].method1990();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field9906;
                        }
                        var11 /= this.field9906;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field9902[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field9904 * var10 + this.field9905;
                        class348 var17 = class110.field1581[var15];
                        if (this.field9903 == 0) {
                            int var18 = this.field9904 / var17.field4415;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1989();
                                for (int var21 = 0; var21 < var17.field4415; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field9904) {
                                float[] var23 = var17.method1989();
                                for (int var24 = 0; var24 < var17.field4415; var24++) {
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

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class709() {
        int[] var1 = new int[this.field9906];
        for (int var2 = 0; var2 < this.field9906; var2++) {
            int var4 = 0;
            int var5 = class110.method739(3);
            boolean var6 = class110.method741() != 0;
            if (var6) {
                var4 = class110.method739(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field9902 = new int[this.field9906 * 8];
        for (int var3 = 0; var3 < this.field9906 * 8; var3++) {
            this.field9902[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class110.method739(8);
        }
    }
}
