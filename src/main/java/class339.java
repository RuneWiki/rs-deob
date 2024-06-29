import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class339 {

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    private int field4552 = class379.method2321(16);

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    private int field4553 = class379.method2321(24);

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    private int field4556 = class379.method2321(24);

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    private int field4554 = class379.method2321(24) + 1;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    private int field4557 = class379.method2321(6) + 1;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    private int field4555 = class379.method2321(8);

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "[I")
    private int[] field4551;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([FIZ)V", line = 6)
    public final void method1930(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class379.field5220[this.field4555].field1929;
        int var6 = this.field4556 - this.field4553;
        int var7 = var6 / this.field4554;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class379.field5220[this.field4555].method802();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4557;
                        }
                        var11 /= this.field4557;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4551[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4554 * var10 + this.field4553;
                        class131 var17 = class379.field5220[var15];
                        if (this.field4552 == 0) {
                            int var18 = this.field4554 / var17.field1929;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method801();
                                for (int var21 = 0; var21 < var17.field1929; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4554) {
                                float[] var23 = var17.method801();
                                for (int var24 = 0; var24 < var17.field1929; var24++) {
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

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V", line = 133)
    public class339() {
        int[] var1 = new int[this.field4557];
        for (int var2 = 0; var2 < this.field4557; var2++) {
            int var4 = 0;
            int var5 = class379.method2321(3);
            boolean var6 = class379.method2330() != 0;
            if (var6) {
                var4 = class379.method2321(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4551 = new int[this.field4557 * 8];
        for (int var3 = 0; var3 < this.field4557 * 8; var3++) {
            this.field4551[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class379.method2321(8);
        }
    }
}
