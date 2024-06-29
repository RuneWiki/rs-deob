import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    private int field2567 = class36.method323(16);

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    private int field2570 = class36.method323(24);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    private int field2566 = class36.method323(24);

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    private int field2571 = class36.method323(24) + 1;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    private int field2572 = class36.method323(6) + 1;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    private int field2569 = class36.method323(8);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
    private int[] field2568;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([FIZ)V")
    public final void method849(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class36.field917[this.field2569].field2701;
        int var6 = this.field2566 - this.field2570;
        int var7 = var6 / this.field2571;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class36.field917[this.field2569].method887();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2572;
                        }
                        var11 /= this.field2572;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2568[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2571 * var10 + this.field2570;
                        class112 var17 = class36.field917[var15];
                        if (this.field2567 == 0) {
                            int var18 = this.field2571 / var17.field2701;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method888();
                                for (int var21 = 0; var21 < var17.field2701; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2571) {
                                float[] var23 = var17.method888();
                                for (int var24 = 0; var24 < var17.field2701; var24++) {
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

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class104() {
        int[] var1 = new int[this.field2572];
        for (int var2 = 0; var2 < this.field2572; var2++) {
            int var4 = 0;
            int var5 = class36.method323(3);
            boolean var6 = class36.method316() != 0;
            if (var6) {
                var4 = class36.method323(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2568 = new int[this.field2572 * 8];
        for (int var3 = 0; var3 < this.field2572 * 8; var3++) {
            this.field2568[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class36.method323(8);
        }
    }
}
