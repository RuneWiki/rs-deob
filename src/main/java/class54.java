import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 {

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    private int field1109 = class103.method830(16);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    private int field1105 = class103.method830(24);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    private int field1107 = class103.method830(24);

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    private int field1108 = class103.method830(24) + 1;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    private int field1110 = class103.method830(6) + 1;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    private int field1106 = class103.method830(8);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
    private int[] field1104;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([FIZ)V")
    public final void method436(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class103.field2164[this.field1106].field1135;
        int var6 = this.field1107 - this.field1105;
        int var7 = var6 / this.field1108;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class103.field2164[this.field1106].method445();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1110;
                        }
                        var11 /= this.field1110;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1104[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1108 * var10 + this.field1105;
                        class56 var17 = class103.field2164[var15];
                        if (this.field1109 == 0) {
                            int var18 = this.field1108 / var17.field1135;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method447();
                                for (int var21 = 0; var21 < var17.field1135; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1108) {
                                float[] var23 = var17.method447();
                                for (int var24 = 0; var24 < var17.field1135; var24++) {
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

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class54() {
        int[] var1 = new int[this.field1110];
        for (int var2 = 0; var2 < this.field1110; var2++) {
            int var4 = 0;
            int var5 = class103.method830(3);
            boolean var6 = class103.method832() != 0;
            if (var6) {
                var4 = class103.method830(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1104 = new int[this.field1110 * 8];
        for (int var3 = 0; var3 < this.field1110 * 8; var3++) {
            this.field1104[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class103.method830(8);
        }
    }
}
