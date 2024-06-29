import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class330 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    private int field4744 = class357.method2293(16);

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    private int field4747 = class357.method2293(24);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    private int field4743 = class357.method2293(24);

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    private int field4746 = class357.method2293(24) + 1;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    private int field4749 = class357.method2293(6) + 1;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    private int field4745 = class357.method2293(8);

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[I")
    private int[] field4748;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([FIZ)V")
    public final void method2165(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class357.field5082[this.field4745].field2656;
        int var6 = this.field4743 - this.field4747;
        int var7 = var6 / this.field4746;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class357.field5082[this.field4745].method1396();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4749;
                        }
                        var11 /= this.field4749;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4748[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4746 * var10 + this.field4747;
                        class178 var17 = class357.field5082[var15];
                        if (this.field4744 == 0) {
                            int var18 = this.field4746 / var17.field2656;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1394();
                                for (int var21 = 0; var21 < var17.field2656; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4746) {
                                float[] var23 = var17.method1394();
                                for (int var24 = 0; var24 < var17.field2656; var24++) {
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

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class330() {
        int[] var1 = new int[this.field4749];
        for (int var2 = 0; var2 < this.field4749; var2++) {
            int var4 = 0;
            int var5 = class357.method2293(3);
            boolean var6 = class357.method2286() != 0;
            if (var6) {
                var4 = class357.method2293(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4748 = new int[this.field4749 * 8];
        for (int var3 = 0; var3 < this.field4749 * 8; var3++) {
            this.field4748[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class357.method2293(8);
        }
    }
}
