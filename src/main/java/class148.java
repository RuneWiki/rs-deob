import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class148 {

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    private int field2489 = class250.method1703(16);

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    private int field2485 = class250.method1703(24);

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    private int field2484 = class250.method1703(24);

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    private int field2488 = class250.method1703(24) + 1;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    private int field2483 = class250.method1703(6) + 1;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    private int field2486 = class250.method1703(8);

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "[I")
    private int[] field2487;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([FIZ)V")
    public final void method1073(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class250.field4399[this.field2486].field4445;
        int var6 = this.field2484 - this.field2485;
        int var7 = var6 / this.field2488;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class250.field4399[this.field2486].method1724();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2483;
                        }
                        var11 /= this.field2483;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2487[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2488 * var10 + this.field2485;
                        class253 var17 = class250.field4399[var15];
                        if (this.field2489 == 0) {
                            int var18 = this.field2488 / var17.field4445;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1721();
                                for (int var21 = 0; var21 < var17.field4445; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2488) {
                                float[] var23 = var17.method1721();
                                for (int var24 = 0; var24 < var17.field4445; var24++) {
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

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class148() {
        int[] var1 = new int[this.field2483];
        for (int var2 = 0; var2 < this.field2483; var2++) {
            int var4 = 0;
            int var5 = class250.method1703(3);
            boolean var6 = class250.method1704() != 0;
            if (var6) {
                var4 = class250.method1703(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2487 = new int[this.field2483 * 8];
        for (int var3 = 0; var3 < this.field2483 * 8; var3++) {
            this.field2487[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class250.method1703(8);
        }
    }
}
