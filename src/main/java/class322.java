import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class322 {

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    private int field4376 = class168.method1201(16);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    private int field4375 = class168.method1201(24);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    private int field4371 = class168.method1201(24);

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    private int field4373 = class168.method1201(24) + 1;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    private int field4372 = class168.method1201(6) + 1;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    private int field4377 = class168.method1201(8);

    @OriginalMember(owner = "client!si", name = "d", descriptor = "[I")
    private int[] field4374;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([FIZ)V")
    public final void method1965(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class168.field2353[this.field4377].field3754;
        int var6 = this.field4371 - this.field4375;
        int var7 = var6 / this.field4373;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class168.field2353[this.field4377].method1738();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4372;
                        }
                        var11 /= this.field4372;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4374[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4373 * var10 + this.field4375;
                        class275 var17 = class168.field2353[var15];
                        if (this.field4376 == 0) {
                            int var18 = this.field4373 / var17.field3754;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1736();
                                for (int var21 = 0; var21 < var17.field3754; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4373) {
                                float[] var23 = var17.method1736();
                                for (int var24 = 0; var24 < var17.field3754; var24++) {
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

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class322() {
        int[] var1 = new int[this.field4372];
        for (int var2 = 0; var2 < this.field4372; var2++) {
            int var4 = 0;
            int var5 = class168.method1201(3);
            boolean var6 = class168.method1194() != 0;
            if (var6) {
                var4 = class168.method1201(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4374 = new int[this.field4372 * 8];
        for (int var3 = 0; var3 < this.field4372 * 8; var3++) {
            this.field4374[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class168.method1201(8);
        }
    }
}
