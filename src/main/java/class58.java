import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class58 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    private int field1211 = class132.method851(16);

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    private int field1216 = class132.method851(24);

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    private int field1217 = class132.method851(24);

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    private int field1215 = class132.method851(24) + 1;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    private int field1214 = class132.method851(6) + 1;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    private int field1212 = class132.method851(8);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[I")
    private int[] field1213;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([FIZ)V")
    public final void method361(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class132.field2419[this.field1212].field3994;
        int var6 = this.field1217 - this.field1216;
        int var7 = var6 / this.field1215;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class132.field2419[this.field1212].method1543();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1214;
                        }
                        var11 /= this.field1214;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1213[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1215 * var10 + this.field1216;
                        class227 var17 = class132.field2419[var15];
                        if (this.field1211 == 0) {
                            int var18 = this.field1215 / var17.field3994;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1540();
                                for (int var21 = 0; var21 < var17.field3994; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1215) {
                                float[] var23 = var17.method1540();
                                for (int var24 = 0; var24 < var17.field3994; var24++) {
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

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class58() {
        int[] var1 = new int[this.field1214];
        for (int var2 = 0; var2 < this.field1214; var2++) {
            int var4 = 0;
            int var5 = class132.method851(3);
            boolean var6 = class132.method852() != 0;
            if (var6) {
                var4 = class132.method851(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1213 = new int[this.field1214 * 8];
        for (int var3 = 0; var3 < this.field1214 * 8; var3++) {
            this.field1213[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class132.method851(8);
        }
    }
}
