import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class140 {

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    private int field3398 = class137.method1108(16);

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    private int field3397 = class137.method1108(24);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    private int field3393 = class137.method1108(24);

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    private int field3399 = class137.method1108(24) + 1;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    private int field3396 = class137.method1108(6) + 1;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    private int field3394 = class137.method1108(8);

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
    private int[] field3395;

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class140() {
        int[] var1 = new int[this.field3396];
        for (int var2 = 0; var2 < this.field3396; var2++) {
            int var4 = 0;
            int var5 = class137.method1108(3);
            boolean var6 = class137.method1117() != 0;
            if (var6) {
                var4 = class137.method1108(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3395 = new int[this.field3396 * 8];
        for (int var3 = 0; var3 < this.field3396 * 8; var3++) {
            this.field3395[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class137.method1108(8);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([FIZ)V")
    public final void method1130(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class137.field3311[this.field3394].field1650;
        int var6 = this.field3393 - this.field3397;
        int var7 = var6 / this.field3399;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class137.field3311[this.field3394].method543();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3396;
                        }
                        var11 /= this.field3396;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3395[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3399 * var10 + this.field3397;
                        class67 var17 = class137.field3311[var15];
                        if (this.field3398 == 0) {
                            int var18 = this.field3399 / var17.field1650;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method542();
                                for (int var21 = 0; var21 < var17.field1650; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3399) {
                                float[] var23 = var17.method542();
                                for (int var24 = 0; var24 < var17.field1650; var24++) {
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
}
