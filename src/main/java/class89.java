import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class89 {

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    private int field1442 = class252.method1511(16);

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    private int field1445 = class252.method1511(24);

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    private int field1448 = class252.method1511(24);

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    private int field1447 = class252.method1511(24) + 1;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    private int field1444 = class252.method1511(6) + 1;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    private int field1446 = class252.method1511(8);

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "[I")
    private int[] field1443;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([FIZ)V", line = 6)
    public final void method736(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class252.field3464[this.field1446].field151;
        int var6 = this.field1448 - this.field1445;
        int var7 = var6 / this.field1447;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class252.field3464[this.field1446].method95();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1444;
                        }
                        var11 /= this.field1444;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1443[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1447 * var10 + this.field1445;
                        class15 var17 = class252.field3464[var15];
                        if (this.field1442 == 0) {
                            int var18 = this.field1447 / var17.field151;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method98();
                                for (int var21 = 0; var21 < var17.field151; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1447) {
                                float[] var23 = var17.method98();
                                for (int var24 = 0; var24 < var17.field151; var24++) {
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

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V", line = 133)
    public class89() {
        int[] var1 = new int[this.field1444];
        for (int var2 = 0; var2 < this.field1444; var2++) {
            int var4 = 0;
            int var5 = class252.method1511(3);
            boolean var6 = class252.method1512() != 0;
            if (var6) {
                var4 = class252.method1511(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1443 = new int[this.field1444 * 8];
        for (int var3 = 0; var3 < this.field1444 * 8; var3++) {
            this.field1443[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class252.method1511(8);
        }
    }
}
