import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class83 {

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    private int field1273 = class64.method464(16);

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    private int field1274 = class64.method464(24);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    private int field1269 = class64.method464(24);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    private int field1268 = class64.method464(24) + 1;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    private int field1270 = class64.method464(6) + 1;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    private int field1271 = class64.method464(8);

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
    private int[] field1272;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([FIZ)V", line = 7)
    public final void method561(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class64.field999[this.field1271].field1309;
        int var6 = this.field1269 - this.field1274;
        int var7 = var6 / this.field1268;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class64.field999[this.field1271].method576();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1270;
                        }
                        var11 /= this.field1270;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1272[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1268 * var10 + this.field1274;
                        class87 var17 = class64.field999[var15];
                        if (this.field1273 == 0) {
                            int var18 = this.field1268 / var17.field1309;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method578();
                                for (int var21 = 0; var21 < var17.field1309; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1268) {
                                float[] var23 = var17.method578();
                                for (int var24 = 0; var24 < var17.field1309; var24++) {
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

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 133)
    public class83() {
        int[] var1 = new int[this.field1270];
        for (int var2 = 0; var2 < this.field1270; var2++) {
            int var3 = 0;
            int var4 = class64.method464(3);
            boolean var5 = class64.method466() != 0;
            if (var5) {
                var3 = class64.method464(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1272 = new int[this.field1270 * 8];
        for (int var6 = 0; var6 < this.field1270 * 8; var6++) {
            this.field1272[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class64.method464(8);
        }
    }
}
