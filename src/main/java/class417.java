import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class417 {

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    private int field6263 = class177.method1212(16);

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    private int field6259 = class177.method1212(24);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    private int field6257 = class177.method1212(24);

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    private int field6261 = class177.method1212(24) + 1;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    private int field6260 = class177.method1212(6) + 1;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    private int field6258 = class177.method1212(8);

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "[I")
    private int[] field6262;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([FIZ)V")
    public final void method2490(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class177.field2630[this.field6258].field5851;
        int var6 = this.field6257 - this.field6259;
        int var7 = var6 / this.field6261;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class177.field2630[this.field6258].method2330();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6260;
                        }
                        var11 /= this.field6260;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6262[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6261 * var10 + this.field6259;
                        class388 var17 = class177.field2630[var15];
                        if (this.field6263 == 0) {
                            int var18 = this.field6261 / var17.field5851;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2327();
                                for (int var21 = 0; var21 < var17.field5851; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6261) {
                                float[] var23 = var17.method2327();
                                for (int var24 = 0; var24 < var17.field5851; var24++) {
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

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
    public class417() {
        int[] var1 = new int[this.field6260];
        for (int var2 = 0; var2 < this.field6260; var2++) {
            int var4 = 0;
            int var5 = class177.method1212(3);
            boolean var6 = class177.method1215() != 0;
            if (var6) {
                var4 = class177.method1212(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6262 = new int[this.field6260 * 8];
        for (int var3 = 0; var3 < this.field6260 * 8; var3++) {
            this.field6262[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class177.method1212(8);
        }
    }
}
