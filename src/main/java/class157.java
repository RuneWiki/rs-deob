import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class157 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    private int field2351 = class280.method1972(16);

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    private int field2355 = class280.method1972(24);

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    private int field2354 = class280.method1972(24);

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    private int field2353 = class280.method1972(24) + 1;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    private int field2350 = class280.method1972(6) + 1;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    private int field2349 = class280.method1972(8);

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[I")
    private int[] field2352;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method1139(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class280.field4297[this.field2349].field3399;
        int var6 = this.field2354 - this.field2355;
        int var7 = var6 / this.field2353;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class280.field4297[this.field2349].method1544();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2350;
                        }
                        var11 /= this.field2350;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2352[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2353 * var10 + this.field2355;
                        class215 var17 = class280.field4297[var15];
                        if (this.field2351 == 0) {
                            int var18 = this.field2353 / var17.field3399;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1545();
                                for (int var21 = 0; var21 < var17.field3399; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2353) {
                                float[] var23 = var17.method1545();
                                for (int var24 = 0; var24 < var17.field3399; var24++) {
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

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 133)
    public class157() {
        int[] var1 = new int[this.field2350];
        for (int var2 = 0; var2 < this.field2350; var2++) {
            int var3 = 0;
            int var4 = class280.method1972(3);
            boolean var5 = class280.method1967() != 0;
            if (var5) {
                var3 = class280.method1972(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field2352 = new int[this.field2350 * 8];
        for (int var6 = 0; var6 < this.field2350 * 8; var6++) {
            this.field2352[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class280.method1972(8);
        }
    }
}
