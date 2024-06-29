import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class426 {

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    private int field6288 = class83.method741(16);

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    private int field6289 = class83.method741(24);

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    private int field6292 = class83.method741(24);

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    private int field6290 = class83.method741(24) + 1;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    private int field6287 = class83.method741(6) + 1;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    private int field6286 = class83.method741(8);

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "[I")
    private int[] field6291;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "([FIZ)V", line = 8)
    public final void method2602(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class83.field1117[this.field6286].field4240;
        int var6 = this.field6292 - this.field6289;
        int var7 = var6 / this.field6290;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class83.field1117[this.field6286].method1865();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6287;
                        }
                        var11 /= this.field6287;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6291[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6290 * var10 + this.field6289;
                        class295 var17 = class83.field1117[var15];
                        if (this.field6288 == 0) {
                            int var18 = this.field6290 / var17.field4240;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1867();
                                for (int var21 = 0; var21 < var17.field4240; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6290) {
                                float[] var23 = var17.method1867();
                                for (int var24 = 0; var24 < var17.field4240; var24++) {
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

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V", line = 133)
    public class426() {
        int[] var1 = new int[this.field6287];
        for (int var2 = 0; var2 < this.field6287; var2++) {
            int var4 = 0;
            int var5 = class83.method741(3);
            boolean var6 = class83.method744() != 0;
            if (var6) {
                var4 = class83.method741(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6291 = new int[this.field6287 * 8];
        for (int var3 = 0; var3 < this.field6287 * 8; var3++) {
            this.field6291[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class83.method741(8);
        }
    }
}
