import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class114 {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    private int field1942 = class256.method1826(16);

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    private int field1941 = class256.method1826(24);

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    private int field1939 = class256.method1826(24);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    private int field1937 = class256.method1826(24) + 1;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    private int field1936 = class256.method1826(6) + 1;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    private int field1938 = class256.method1826(8);

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
    private int[] field1940;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([FIZ)V", line = 11)
    public final void method880(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class256.field4283[this.field1938].field918;
        int var6 = this.field1939 - this.field1941;
        int var7 = var6 / this.field1937;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class256.field4283[this.field1938].method404();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1936;
                        }
                        var11 /= this.field1936;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1940[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1937 * var10 + this.field1941;
                        class56 var17 = class256.field4283[var15];
                        if (this.field1942 == 0) {
                            int var18 = this.field1937 / var17.field918;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method405();
                                for (int var21 = 0; var21 < var17.field918; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1937) {
                                float[] var23 = var17.method405();
                                for (int var24 = 0; var24 < var17.field918; var24++) {
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

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 133)
    public class114() {
        int[] var1 = new int[this.field1936];
        for (int var2 = 0; var2 < this.field1936; var2++) {
            int var3 = 0;
            int var4 = class256.method1826(3);
            boolean var5 = class256.method1829() != 0;
            if (var5) {
                var3 = class256.method1826(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1940 = new int[this.field1936 * 8];
        for (int var6 = 0; var6 < this.field1936 * 8; var6++) {
            this.field1940[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class256.method1826(8);
        }
    }
}
