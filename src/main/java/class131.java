import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class131 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    private int field2997 = class102.method850(16);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    private int field2999 = class102.method850(24);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    private int field3003 = class102.method850(24);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    private int field2998 = class102.method850(24) + 1;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    private int field3002 = class102.method850(6) + 1;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    private int field3001 = class102.method850(8);

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
    private int[] field3000;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([FIZ)V")
    public final void method979(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class102.field2485[this.field3001].field1262;
        int var6 = this.field3003 - this.field2999;
        int var7 = var6 / this.field2998;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class102.field2485[this.field3001].method373();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3002;
                        }
                        var11 /= this.field3002;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3000[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2998 * var10 + this.field2999;
                        class55 var17 = class102.field2485[var15];
                        if (this.field2997 == 0) {
                            int var18 = this.field2998 / var17.field1262;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method372();
                                for (int var21 = 0; var21 < var17.field1262; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2998) {
                                float[] var23 = var17.method372();
                                for (int var24 = 0; var24 < var17.field1262; var24++) {
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

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class131() {
        int[] var1 = new int[this.field3002];
        for (int var2 = 0; var2 < this.field3002; var2++) {
            int var4 = 0;
            int var5 = class102.method850(3);
            boolean var6 = class102.method843() != 0;
            if (var6) {
                var4 = class102.method850(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3000 = new int[this.field3002 * 8];
        for (int var3 = 0; var3 < this.field3002 * 8; var3++) {
            this.field3000[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class102.method850(8);
        }
    }
}
