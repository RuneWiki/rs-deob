import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class391 {

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    private int field5635 = class102.method550(16);

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    private int field5633 = class102.method550(24);

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    private int field5632 = class102.method550(24);

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    private int field5636 = class102.method550(24) + 1;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    private int field5637 = class102.method550(6) + 1;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    private int field5631 = class102.method550(8);

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "[I")
    private int[] field5634;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([FIZ)V", line = 10)
    public final void method2437(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class102.field1209[this.field5631].field5269;
        int var6 = this.field5632 - this.field5633;
        int var7 = var6 / this.field5636;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class102.field1209[this.field5631].method2253();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5637;
                        }
                        var11 /= this.field5637;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5634[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5636 * var10 + this.field5633;
                        class375 var17 = class102.field1209[var15];
                        if (this.field5635 == 0) {
                            int var18 = this.field5636 / var17.field5269;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2254();
                                for (int var21 = 0; var21 < var17.field5269; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5636) {
                                float[] var23 = var17.method2254();
                                for (int var24 = 0; var24 < var17.field5269; var24++) {
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

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 133)
    public class391() {
        int[] var1 = new int[this.field5637];
        for (int var2 = 0; var2 < this.field5637; var2++) {
            int var4 = 0;
            int var5 = class102.method550(3);
            boolean var6 = class102.method551() != 0;
            if (var6) {
                var4 = class102.method550(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field5634 = new int[this.field5637 * 8];
        for (int var3 = 0; var3 < this.field5637 * 8; var3++) {
            this.field5634[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class102.method550(8);
        }
    }
}
