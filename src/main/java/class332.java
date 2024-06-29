import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class332 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    private int field5410 = class136.method934(16);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    private int field5409 = class136.method934(24);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    private int field5407 = class136.method934(24);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    private int field5406 = class136.method934(24) + 1;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    private int field5412 = class136.method934(6) + 1;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    private int field5411 = class136.method934(8);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    private int[] field5408;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([FIZ)V", line = 8)
    public final void method2359(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class136.field2140[this.field5411].field544;
        int var6 = this.field5407 - this.field5409;
        int var7 = var6 / this.field5406;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class136.field2140[this.field5411].method298();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5412;
                        }
                        var11 /= this.field5412;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5408[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5406 * var10 + this.field5409;
                        class36 var17 = class136.field2140[var15];
                        if (this.field5410 == 0) {
                            int var18 = this.field5406 / var17.field544;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method300();
                                for (int var21 = 0; var21 < var17.field544; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5406) {
                                float[] var23 = var17.method300();
                                for (int var24 = 0; var24 < var17.field544; var24++) {
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

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 133)
    public class332() {
        int[] var1 = new int[this.field5412];
        for (int var2 = 0; var2 < this.field5412; var2++) {
            int var3 = 0;
            int var4 = class136.method934(3);
            boolean var5 = class136.method943() != 0;
            if (var5) {
                var3 = class136.method934(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field5408 = new int[this.field5412 * 8];
        for (int var6 = 0; var6 < this.field5412 * 8; var6++) {
            this.field5408[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class136.method934(8);
        }
    }
}
