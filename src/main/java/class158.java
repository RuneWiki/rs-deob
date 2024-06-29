import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class158 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    private int field2566 = class109.method810(16);

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    private int field2565 = class109.method810(24);

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    private int field2562 = class109.method810(24);

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    private int field2564 = class109.method810(24) + 1;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    private int field2563 = class109.method810(6) + 1;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    private int field2560 = class109.method810(8);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
    private int[] field2561;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([FIZ)V")
    public final void method1137(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class109.field1660[this.field2560].field1370;
        int var6 = this.field2562 - this.field2565;
        int var7 = var6 / this.field2564;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class109.field1660[this.field2560].method668();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2563;
                        }
                        var11 /= this.field2563;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2561[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2564 * var10 + this.field2565;
                        class83 var17 = class109.field1660[var15];
                        if (this.field2566 == 0) {
                            int var18 = this.field2564 / var17.field1370;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method669();
                                for (int var21 = 0; var21 < var17.field1370; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2564) {
                                float[] var23 = var17.method669();
                                for (int var24 = 0; var24 < var17.field1370; var24++) {
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

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class158() {
        int[] var1 = new int[this.field2563];
        for (int var2 = 0; var2 < this.field2563; var2++) {
            int var4 = 0;
            int var5 = class109.method810(3);
            boolean var6 = class109.method816() != 0;
            if (var6) {
                var4 = class109.method810(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2561 = new int[this.field2563 * 8];
        for (int var3 = 0; var3 < this.field2563 * 8; var3++) {
            this.field2561[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class109.method810(8);
        }
    }
}
