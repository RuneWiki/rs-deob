import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class195 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    private int field3504 = class188.method1342(16);

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    private int field3507 = class188.method1342(24);

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    private int field3505 = class188.method1342(24);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    private int field3503 = class188.method1342(24) + 1;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    private int field3506 = class188.method1342(6) + 1;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    private int field3509 = class188.method1342(8);

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[I")
    private int[] field3508;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([FIZ)V")
    public final void method1392(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class188.field3298[this.field3509].field2572;
        int var6 = this.field3505 - this.field3507;
        int var7 = var6 / this.field3503;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class188.field3298[this.field3509].method1095();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3506;
                        }
                        var11 /= this.field3506;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3508[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3503 * var10 + this.field3507;
                        class143 var17 = class188.field3298[var15];
                        if (this.field3504 == 0) {
                            int var18 = this.field3503 / var17.field2572;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1092();
                                for (int var21 = 0; var21 < var17.field2572; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3503) {
                                float[] var23 = var17.method1092();
                                for (int var24 = 0; var24 < var17.field2572; var24++) {
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

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class195() {
        int[] var1 = new int[this.field3506];
        for (int var2 = 0; var2 < this.field3506; var2++) {
            int var4 = 0;
            int var5 = class188.method1342(3);
            boolean var6 = class188.method1341() != 0;
            if (var6) {
                var4 = class188.method1342(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3508 = new int[this.field3506 * 8];
        for (int var3 = 0; var3 < this.field3506 * 8; var3++) {
            this.field3508[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class188.method1342(8);
        }
    }
}
