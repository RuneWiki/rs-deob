import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class295 {

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    private int field4214 = class187.method1176(16);

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    private int field4216 = class187.method1176(24);

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    private int field4218 = class187.method1176(24);

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    private int field4215 = class187.method1176(24) + 1;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    private int field4219 = class187.method1176(6) + 1;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    private int field4220 = class187.method1176(8);

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "[I")
    private int[] field4217;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "([FIZ)V")
    public final void method1946(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class187.field2555[this.field4220].field8409;
        int var6 = this.field4218 - this.field4216;
        int var7 = var6 / this.field4215;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class187.field2555[this.field4220].method3518();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4219;
                        }
                        var11 /= this.field4219;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4217[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4215 * var10 + this.field4216;
                        class624 var17 = class187.field2555[var15];
                        if (this.field4214 == 0) {
                            int var18 = this.field4215 / var17.field8409;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method3520();
                                for (int var21 = 0; var21 < var17.field8409; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4215) {
                                float[] var23 = var17.method3520();
                                for (int var24 = 0; var24 < var17.field8409; var24++) {
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

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "()V")
    public class295() {
        int[] var1 = new int[this.field4219];
        for (int var2 = 0; var2 < this.field4219; var2++) {
            int var4 = 0;
            int var5 = class187.method1176(3);
            boolean var6 = class187.method1171() != 0;
            if (var6) {
                var4 = class187.method1176(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4217 = new int[this.field4219 * 8];
        for (int var3 = 0; var3 < this.field4219 * 8; var3++) {
            this.field4217[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class187.method1176(8);
        }
    }
}
