import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class339 {

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    private int field5010 = class44.method321(16);

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    private int field5011 = class44.method321(24);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    private int field5008 = class44.method321(24);

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    private int field5012 = class44.method321(24) + 1;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    private int field5009 = class44.method321(6) + 1;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    private int field5007 = class44.method321(8);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
    private int[] field5006;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method2202(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class44.field661[this.field5007].field5476;
        int var6 = this.field5008 - this.field5011;
        int var7 = var6 / this.field5012;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class44.field661[this.field5007].method2441();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5009;
                        }
                        var11 /= this.field5009;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5006[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5012 * var10 + this.field5011;
                        class371 var17 = class44.field661[var15];
                        if (this.field5010 == 0) {
                            int var18 = this.field5012 / var17.field5476;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2443();
                                for (int var21 = 0; var21 < var17.field5476; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5012) {
                                float[] var23 = var17.method2443();
                                for (int var24 = 0; var24 < var17.field5476; var24++) {
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

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 133)
    public class339() {
        int[] var1 = new int[this.field5009];
        for (int var2 = 0; var2 < this.field5009; var2++) {
            int var4 = 0;
            int var5 = class44.method321(3);
            boolean var6 = class44.method311() != 0;
            if (var6) {
                var4 = class44.method321(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field5006 = new int[this.field5009 * 8];
        for (int var3 = 0; var3 < this.field5009 * 8; var3++) {
            this.field5006[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class44.method321(8);
        }
    }
}
