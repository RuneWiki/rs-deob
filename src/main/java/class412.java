import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class412 {

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    private int field6242 = class40.method244(16);

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    private int field6245 = class40.method244(24);

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    private int field6243 = class40.method244(24);

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    private int field6241 = class40.method244(24) + 1;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    private int field6239 = class40.method244(6) + 1;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    private int field6240 = class40.method244(8);

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "[I")
    private int[] field6244;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "([FIZ)V")
    public final void method2632(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class40.field405[this.field6240].field1725;
        int var6 = this.field6243 - this.field6245;
        int var7 = var6 / this.field6241;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class40.field405[this.field6240].method793();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6239;
                        }
                        var11 /= this.field6239;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6244[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6241 * var10 + this.field6245;
                        class127 var17 = class40.field405[var15];
                        if (this.field6242 == 0) {
                            int var18 = this.field6241 / var17.field1725;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method790();
                                for (int var21 = 0; var21 < var17.field1725; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6241) {
                                float[] var23 = var17.method790();
                                for (int var24 = 0; var24 < var17.field1725; var24++) {
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

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
    public class412() {
        int[] var1 = new int[this.field6239];
        for (int var2 = 0; var2 < this.field6239; var2++) {
            int var4 = 0;
            int var5 = class40.method244(3);
            boolean var6 = class40.method242() != 0;
            if (var6) {
                var4 = class40.method244(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6244 = new int[this.field6239 * 8];
        for (int var3 = 0; var3 < this.field6239 * 8; var3++) {
            this.field6244[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class40.method244(8);
        }
    }
}
