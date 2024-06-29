import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class245 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    private int field4368 = class225.method1583(16);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    private int field4370 = class225.method1583(24);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    private int field4366 = class225.method1583(24);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    private int field4371 = class225.method1583(24) + 1;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    private int field4369 = class225.method1583(6) + 1;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    private int field4372 = class225.method1583(8);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "[I")
    private int[] field4367;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([FIZ)V")
    public final void method1668(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class225.field4076[this.field4372].field1892;
        int var6 = this.field4366 - this.field4370;
        int var7 = var6 / this.field4371;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class225.field4076[this.field4372].method690();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4369;
                        }
                        var11 /= this.field4369;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4367[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4371 * var10 + this.field4370;
                        class95 var17 = class225.field4076[var15];
                        if (this.field4368 == 0) {
                            int var18 = this.field4371 / var17.field1892;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method689();
                                for (int var21 = 0; var21 < var17.field1892; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4371) {
                                float[] var23 = var17.method689();
                                for (int var24 = 0; var24 < var17.field1892; var24++) {
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

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class245() {
        int[] var1 = new int[this.field4369];
        for (int var2 = 0; var2 < this.field4369; var2++) {
            int var4 = 0;
            int var5 = class225.method1583(3);
            boolean var6 = class225.method1585() != 0;
            if (var6) {
                var4 = class225.method1583(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4367 = new int[this.field4369 * 8];
        for (int var3 = 0; var3 < this.field4369 * 8; var3++) {
            this.field4367[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class225.method1583(8);
        }
    }
}
