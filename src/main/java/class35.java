import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class35 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    private int field511 = class168.method1257(16);

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    private int field515 = class168.method1257(24);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    private int field514 = class168.method1257(24);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    private int field510 = class168.method1257(24) + 1;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field509 = class168.method1257(6) + 1;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    private int field512 = class168.method1257(8);

    @OriginalMember(owner = "client!u", name = "e", descriptor = "[I")
    private int[] field513;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([FIZ)V", line = 6)
    public final void method310(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class168.field2762[this.field512].field3703;
        int var6 = this.field514 - this.field515;
        int var7 = var6 / this.field510;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class168.field2762[this.field512].method1696();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field509;
                        }
                        var11 /= this.field509;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field513[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field510 * var10 + this.field515;
                        class236 var17 = class168.field2762[var15];
                        if (this.field511 == 0) {
                            int var18 = this.field510 / var17.field3703;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1697();
                                for (int var21 = 0; var21 < var17.field3703; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field510) {
                                float[] var23 = var17.method1697();
                                for (int var24 = 0; var24 < var17.field3703; var24++) {
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

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 133)
    public class35() {
        int[] var1 = new int[this.field509];
        for (int var2 = 0; var2 < this.field509; var2++) {
            int var3 = 0;
            int var4 = class168.method1257(3);
            boolean var5 = class168.method1254() != 0;
            if (var5) {
                var3 = class168.method1257(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field513 = new int[this.field509 * 8];
        for (int var6 = 0; var6 < this.field509 * 8; var6++) {
            this.field513[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class168.method1257(8);
        }
    }
}
