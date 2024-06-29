import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class118 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    private int field1597 = class244.method1679(16);

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    private int field1600 = class244.method1679(24);

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    private int field1598 = class244.method1679(24);

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    private int field1596 = class244.method1679(24) + 1;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    private int field1595 = class244.method1679(6) + 1;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    private int field1599 = class244.method1679(8);

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[I")
    private int[] field1601;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([FIZ)V", line = 8)
    public final void method864(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class244.field3504[this.field1599].field4987;
        int var6 = this.field1598 - this.field1600;
        int var7 = var6 / this.field1596;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class244.field3504[this.field1599].method2307();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1595;
                        }
                        var11 /= this.field1595;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1601[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1596 * var10 + this.field1600;
                        class331 var17 = class244.field3504[var15];
                        if (this.field1597 == 0) {
                            int var18 = this.field1596 / var17.field4987;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2309();
                                for (int var21 = 0; var21 < var17.field4987; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1596) {
                                float[] var23 = var17.method2309();
                                for (int var24 = 0; var24 < var17.field4987; var24++) {
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

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 133)
    public class118() {
        int[] var1 = new int[this.field1595];
        for (int var2 = 0; var2 < this.field1595; var2++) {
            int var3 = 0;
            int var4 = class244.method1679(3);
            boolean var5 = class244.method1677() != 0;
            if (var5) {
                var3 = class244.method1679(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1601 = new int[this.field1595 * 8];
        for (int var6 = 0; var6 < this.field1595 * 8; var6++) {
            this.field1601[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class244.method1679(8);
        }
    }
}
