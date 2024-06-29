import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class328 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    private int field5102 = class307.method2154(16);

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    private int field5106 = class307.method2154(24);

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    private int field5104 = class307.method2154(24);

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    private int field5103 = class307.method2154(24) + 1;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    private int field5108 = class307.method2154(6) + 1;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    private int field5105 = class307.method2154(8);

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "[I")
    private int[] field5107;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([FIZ)V", line = 6)
    public final void method2271(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class307.field4808[this.field5105].field3203;
        int var6 = this.field5104 - this.field5106;
        int var7 = var6 / this.field5103;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class307.field4808[this.field5105].method1432();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5108;
                        }
                        var11 /= this.field5108;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5107[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5103 * var10 + this.field5106;
                        class195 var17 = class307.field4808[var15];
                        if (this.field5102 == 0) {
                            int var18 = this.field5103 / var17.field3203;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1431();
                                for (int var21 = 0; var21 < var17.field3203; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5103) {
                                float[] var23 = var17.method1431();
                                for (int var24 = 0; var24 < var17.field3203; var24++) {
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

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 133)
    public class328() {
        int[] var1 = new int[this.field5108];
        for (int var2 = 0; var2 < this.field5108; var2++) {
            int var3 = 0;
            int var4 = class307.method2154(3);
            boolean var5 = class307.method2153() != 0;
            if (var5) {
                var3 = class307.method2154(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field5107 = new int[this.field5108 * 8];
        for (int var6 = 0; var6 < this.field5108 * 8; var6++) {
            this.field5107[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class307.method2154(8);
        }
    }
}
