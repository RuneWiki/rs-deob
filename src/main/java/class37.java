import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class37 {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    private int field516 = class127.method880(16);

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    private int field519 = class127.method880(24);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private int field514 = class127.method880(24);

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    private int field518 = class127.method880(24) + 1;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    private int field517 = class127.method880(6) + 1;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    private int field515 = class127.method880(8);

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
    private int[] field520;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([FIZ)V", line = 8)
    public final void method254(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class127.field2164[this.field515].field5227;
        int var6 = this.field514 - this.field519;
        int var7 = var6 / this.field518;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class127.field2164[this.field515].method2115();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field517;
                        }
                        var11 /= this.field517;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field520[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field518 * var10 + this.field519;
                        class300 var17 = class127.field2164[var15];
                        if (this.field516 == 0) {
                            int var18 = this.field518 / var17.field5227;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2114();
                                for (int var21 = 0; var21 < var17.field5227; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field518) {
                                float[] var23 = var17.method2114();
                                for (int var24 = 0; var24 < var17.field5227; var24++) {
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

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 133)
    public class37() {
        int[] var1 = new int[this.field517];
        for (int var2 = 0; var2 < this.field517; var2++) {
            int var3 = 0;
            int var4 = class127.method880(3);
            boolean var5 = class127.method876() != 0;
            if (var5) {
                var3 = class127.method880(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field520 = new int[this.field517 * 8];
        for (int var6 = 0; var6 < this.field517 * 8; var6++) {
            this.field520[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class127.method880(8);
        }
    }
}
