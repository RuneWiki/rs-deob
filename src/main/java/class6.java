import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class6 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    private int field129 = class29.method189(16);

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    private int field135 = class29.method189(24);

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    private int field130 = class29.method189(24);

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    private int field131 = class29.method189(24) + 1;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    private int field132 = class29.method189(6) + 1;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    private int field134 = class29.method189(8);

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "[I")
    private int[] field133;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([FIZ)V", line = 10)
    public final void method37(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class29.field496[this.field134].field231;
        int var6 = this.field130 - this.field135;
        int var7 = var6 / this.field131;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class29.field496[this.field134].method73();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field132;
                        }
                        var11 /= this.field132;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field133[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field131 * var10 + this.field135;
                        class12 var17 = class29.field496[var15];
                        if (this.field129 == 0) {
                            int var18 = this.field131 / var17.field231;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method71();
                                for (int var21 = 0; var21 < var17.field231; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field131) {
                                float[] var23 = var17.method71();
                                for (int var24 = 0; var24 < var17.field231; var24++) {
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

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 133)
    public class6() {
        int[] var1 = new int[this.field132];
        for (int var2 = 0; var2 < this.field132; var2++) {
            int var3 = 0;
            int var4 = class29.method189(3);
            boolean var5 = class29.method186() != 0;
            if (var5) {
                var3 = class29.method189(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field133 = new int[this.field132 * 8];
        for (int var6 = 0; var6 < this.field132 * 8; var6++) {
            this.field133[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class29.method189(8);
        }
    }
}
