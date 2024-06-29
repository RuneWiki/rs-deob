import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 {

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    private int field1429 = class110.method865(16);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    private int field1425 = class110.method865(24);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    private int field1426 = class110.method865(24);

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    private int field1430 = class110.method865(24) + 1;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    private int field1428 = class110.method865(6) + 1;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    private int field1427 = class110.method865(8);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
    private int[] field1424;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([FIZ)V")
    public final void method510(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class110.field2480[this.field1427].field661;
        int var6 = this.field1426 - this.field1425;
        int var7 = var6 / this.field1430;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class110.field2480[this.field1427].method229();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1428;
                        }
                        var11 /= this.field1428;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1424[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1430 * var10 + this.field1425;
                        class36 var17 = class110.field2480[var15];
                        if (this.field1429 == 0) {
                            int var18 = this.field1430 / var17.field661;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method230();
                                for (int var21 = 0; var21 < var17.field661; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1430) {
                                float[] var23 = var17.method230();
                                for (int var24 = 0; var24 < var17.field661; var24++) {
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
    public class70() {
        int[] var1 = new int[this.field1428];
        for (int var2 = 0; var2 < this.field1428; var2++) {
            int var4 = 0;
            int var5 = class110.method865(3);
            boolean var6 = class110.method863() != 0;
            if (var6) {
                var4 = class110.method865(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1424 = new int[this.field1428 * 8];
        for (int var3 = 0; var3 < this.field1428 * 8; var3++) {
            this.field1424[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class110.method865(8);
        }
    }
}
