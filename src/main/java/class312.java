import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class312 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    private int field4966 = class33.method229(16);

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    private int field4968 = class33.method229(24);

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    private int field4971 = class33.method229(24);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    private int field4967 = class33.method229(24) + 1;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    private int field4965 = class33.method229(6) + 1;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    private int field4969 = class33.method229(8);

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "[I")
    private int[] field4970;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([FIZ)V", line = 8)
    public final void method2214(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class33.field488[this.field4969].field1551;
        int var6 = this.field4971 - this.field4968;
        int var7 = var6 / this.field4967;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class33.field488[this.field4969].method721();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4965;
                        }
                        var11 /= this.field4965;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4970[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4967 * var10 + this.field4968;
                        class91 var17 = class33.field488[var15];
                        if (this.field4966 == 0) {
                            int var18 = this.field4967 / var17.field1551;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method720();
                                for (int var21 = 0; var21 < var17.field1551; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4967) {
                                float[] var23 = var17.method720();
                                for (int var24 = 0; var24 < var17.field1551; var24++) {
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

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 133)
    public class312() {
        int[] var1 = new int[this.field4965];
        for (int var2 = 0; var2 < this.field4965; var2++) {
            int var3 = 0;
            int var4 = class33.method229(3);
            boolean var5 = class33.method232() != 0;
            if (var5) {
                var3 = class33.method229(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field4970 = new int[this.field4965 * 8];
        for (int var6 = 0; var6 < this.field4965 * 8; var6++) {
            this.field4970[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class33.method229(8);
        }
    }
}
