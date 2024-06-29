import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class429 {

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    private int field5425 = class494.method2679(16);

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    private int field5429 = class494.method2679(24);

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    private int field5430 = class494.method2679(24);

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    private int field5427 = class494.method2679(24) + 1;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    private int field5426 = class494.method2679(6) + 1;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    private int field5428 = class494.method2679(8);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "[I")
    private int[] field5424;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([FIZ)V")
    public final void method2364(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class494.field6179[this.field5428].field4862;
        int var6 = this.field5430 - this.field5429;
        int var7 = var6 / this.field5427;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class494.field6179[this.field5428].method2182();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5426;
                        }
                        var11 /= this.field5426;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5424[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5427 * var10 + this.field5429;
                        class378 var17 = class494.field6179[var15];
                        if (this.field5425 == 0) {
                            int var18 = this.field5427 / var17.field4862;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2181();
                                for (int var21 = 0; var21 < var17.field4862; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5427) {
                                float[] var23 = var17.method2181();
                                for (int var24 = 0; var24 < var17.field4862; var24++) {
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

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class429() {
        int[] var1 = new int[this.field5426];
        for (int var2 = 0; var2 < this.field5426; var2++) {
            int var4 = 0;
            int var5 = class494.method2679(3);
            boolean var6 = class494.method2680() != 0;
            if (var6) {
                var4 = class494.method2679(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field5424 = new int[this.field5426 * 8];
        for (int var3 = 0; var3 < this.field5426 * 8; var3++) {
            this.field5424[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class494.method2679(8);
        }
    }
}
