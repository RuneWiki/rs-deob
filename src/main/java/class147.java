import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class147 {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    private int field2406 = class292.method1975(16);

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    private int field2410 = class292.method1975(24);

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    private int field2407 = class292.method1975(24);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    private int field2404 = class292.method1975(24) + 1;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    private int field2408 = class292.method1975(6) + 1;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    private int field2405 = class292.method1975(8);

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "[I")
    private int[] field2409;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([FIZ)V")
    public final void method1049(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class292.field4633[this.field2405].field4367;
        int var6 = this.field2407 - this.field2410;
        int var7 = var6 / this.field2404;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class292.field4633[this.field2405].method1880();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2408;
                        }
                        var11 /= this.field2408;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2409[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2404 * var10 + this.field2410;
                        class271 var17 = class292.field4633[var15];
                        if (this.field2406 == 0) {
                            int var18 = this.field2404 / var17.field4367;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1881();
                                for (int var21 = 0; var21 < var17.field4367; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2404) {
                                float[] var23 = var17.method1881();
                                for (int var24 = 0; var24 < var17.field4367; var24++) {
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

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class147() {
        int[] var1 = new int[this.field2408];
        for (int var2 = 0; var2 < this.field2408; var2++) {
            int var4 = 0;
            int var5 = class292.method1975(3);
            boolean var6 = class292.method1981() != 0;
            if (var6) {
                var4 = class292.method1975(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2409 = new int[this.field2408 * 8];
        for (int var3 = 0; var3 < this.field2408 * 8; var3++) {
            this.field2409[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class292.method1975(8);
        }
    }
}
