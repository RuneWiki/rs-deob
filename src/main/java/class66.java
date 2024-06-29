import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class66 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    private int field1297 = class267.method1780(16);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    private int field1298 = class267.method1780(24);

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    private int field1301 = class267.method1780(24);

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    private int field1300 = class267.method1780(24) + 1;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    private int field1302 = class267.method1780(6) + 1;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    private int field1299 = class267.method1780(8);

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
    private int[] field1303;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([FIZ)V")
    public final void method540(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class267.field4548[this.field1299].field188;
        int var6 = this.field1301 - this.field1298;
        int var7 = var6 / this.field1300;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class267.field4548[this.field1299].method109();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1302;
                        }
                        var11 /= this.field1302;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1303[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1300 * var10 + this.field1298;
                        class9 var17 = class267.field4548[var15];
                        if (this.field1297 == 0) {
                            int var18 = this.field1300 / var17.field188;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method107();
                                for (int var21 = 0; var21 < var17.field188; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1300) {
                                float[] var23 = var17.method107();
                                for (int var24 = 0; var24 < var17.field188; var24++) {
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

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class66() {
        int[] var1 = new int[this.field1302];
        for (int var2 = 0; var2 < this.field1302; var2++) {
            int var4 = 0;
            int var5 = class267.method1780(3);
            boolean var6 = class267.method1775() != 0;
            if (var6) {
                var4 = class267.method1780(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1303 = new int[this.field1302 * 8];
        for (int var3 = 0; var3 < this.field1302 * 8; var3++) {
            this.field1303[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class267.method1780(8);
        }
    }
}
