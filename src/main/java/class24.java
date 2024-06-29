import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class24 {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    private int field325 = class338.method2335(16);

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    private int field326 = class338.method2335(24);

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    private int field330 = class338.method2335(24);

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    private int field328 = class338.method2335(24) + 1;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    private int field329 = class338.method2335(6) + 1;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    private int field327 = class338.method2335(8);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
    private int[] field324;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method157(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class338.field5248[this.field327].field1798;
        int var6 = this.field330 - this.field326;
        int var7 = var6 / this.field328;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class338.field5248[this.field327].method874();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field329;
                        }
                        var11 /= this.field329;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field324[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field328 * var10 + this.field326;
                        class131 var17 = class338.field5248[var15];
                        if (this.field325 == 0) {
                            int var18 = this.field328 / var17.field1798;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method873();
                                for (int var21 = 0; var21 < var17.field1798; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field328) {
                                float[] var23 = var17.method873();
                                for (int var24 = 0; var24 < var17.field1798; var24++) {
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

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 133)
    public class24() {
        int[] var1 = new int[this.field329];
        for (int var2 = 0; var2 < this.field329; var2++) {
            int var3 = 0;
            int var4 = class338.method2335(3);
            boolean var5 = class338.method2341() != 0;
            if (var5) {
                var3 = class338.method2335(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field324 = new int[this.field329 * 8];
        for (int var6 = 0; var6 < this.field329 * 8; var6++) {
            this.field324[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class338.method2335(8);
        }
    }
}
