import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class218 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    private int field3693 = class47.method365(16);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    private int field3695 = class47.method365(24);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    private int field3697 = class47.method365(24);

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    private int field3694 = class47.method365(24) + 1;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    private int field3691 = class47.method365(6) + 1;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    private int field3696 = class47.method365(8);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
    private int[] field3692;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([FIZ)V")
    public final void method1443(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class47.field1080[this.field3696].field4040;
        int var6 = this.field3697 - this.field3695;
        int var7 = var6 / this.field3694;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class47.field1080[this.field3696].method1546();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3691;
                        }
                        var11 /= this.field3691;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3692[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3694 * var10 + this.field3695;
                        class235 var17 = class47.field1080[var15];
                        if (this.field3693 == 0) {
                            int var18 = this.field3694 / var17.field4040;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1547();
                                for (int var21 = 0; var21 < var17.field4040; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3694) {
                                float[] var23 = var17.method1547();
                                for (int var24 = 0; var24 < var17.field4040; var24++) {
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

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class218() {
        int[] var1 = new int[this.field3691];
        for (int var2 = 0; var2 < this.field3691; var2++) {
            int var4 = 0;
            int var5 = class47.method365(3);
            boolean var6 = class47.method369() != 0;
            if (var6) {
                var4 = class47.method365(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3692 = new int[this.field3691 * 8];
        for (int var3 = 0; var3 < this.field3691 * 8; var3++) {
            this.field3692[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class47.method365(8);
        }
    }
}
