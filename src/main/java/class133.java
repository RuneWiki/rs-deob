import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("oc")
public class class133 {

    @OriginalMember(owner = "oc", name = "e", descriptor = "I")
    private int field2561 = class56.method363(16);

    @OriginalMember(owner = "oc", name = "b", descriptor = "I")
    private int field2558 = class56.method363(24);

    @OriginalMember(owner = "oc", name = "d", descriptor = "I")
    private int field2560 = class56.method363(24);

    @OriginalMember(owner = "oc", name = "g", descriptor = "I")
    private int field2563 = class56.method363(24) + 1;

    @OriginalMember(owner = "oc", name = "a", descriptor = "I")
    private int field2557 = class56.method363(6) + 1;

    @OriginalMember(owner = "oc", name = "c", descriptor = "I")
    private int field2559 = class56.method363(8);

    @OriginalMember(owner = "oc", name = "f", descriptor = "[I")
    private int[] field2562;

    @OriginalMember(owner = "oc", name = "a", descriptor = "([FIZ)V")
    public final void method947(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class56.field1124[this.field2559].field1240;
        int var6 = this.field2560 - this.field2558;
        int var7 = var6 / this.field2563;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class56.field1124[this.field2559].method412();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2557;
                        }
                        var11 /= this.field2557;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2562[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2563 * var10 + this.field2558;
                        class64 var17 = class56.field1124[var15];
                        if (this.field2561 == 0) {
                            int var18 = this.field2563 / var17.field1240;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method414();
                                for (int var21 = 0; var21 < var17.field1240; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2563) {
                                float[] var23 = var17.method414();
                                for (int var24 = 0; var24 < var17.field1240; var24++) {
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

    @OriginalMember(owner = "oc", name = "<init>", descriptor = "()V")
    public class133() {
        int[] var1 = new int[this.field2557];
        for (int var2 = 0; var2 < this.field2557; var2++) {
            int var4 = 0;
            int var5 = class56.method363(3);
            boolean var6 = class56.method372() != 0;
            if (var6) {
                var4 = class56.method363(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2562 = new int[this.field2557 * 8];
        for (int var3 = 0; var3 < this.field2557 * 8; var3++) {
            this.field2562[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class56.method363(8);
        }
    }
}
