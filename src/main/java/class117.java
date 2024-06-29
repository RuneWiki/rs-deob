import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class117 {

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    private int field2073 = class465.method2793(16);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    private int field2072 = class465.method2793(24);

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    private int field2077 = class465.method2793(24);

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    private int field2074 = class465.method2793(24) + 1;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    private int field2075 = class465.method2793(6) + 1;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    private int field2076 = class465.method2793(8);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
    private int[] field2071;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([FIZ)V")
    public final void method956(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class465.field6905[this.field2076].field1959;
        int var6 = this.field2077 - this.field2072;
        int var7 = var6 / this.field2074;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class465.field6905[this.field2076].method902();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2075;
                        }
                        var11 /= this.field2075;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2071[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2074 * var10 + this.field2072;
                        class104 var17 = class465.field6905[var15];
                        if (this.field2073 == 0) {
                            int var18 = this.field2074 / var17.field1959;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method900();
                                for (int var21 = 0; var21 < var17.field1959; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2074) {
                                float[] var23 = var17.method900();
                                for (int var24 = 0; var24 < var17.field1959; var24++) {
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

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class117() {
        int[] var1 = new int[this.field2075];
        for (int var2 = 0; var2 < this.field2075; var2++) {
            int var4 = 0;
            int var5 = class465.method2793(3);
            boolean var6 = class465.method2788() != 0;
            if (var6) {
                var4 = class465.method2793(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2071 = new int[this.field2075 * 8];
        for (int var3 = 0; var3 < this.field2075 * 8; var3++) {
            this.field2071[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class465.method2793(8);
        }
    }
}
