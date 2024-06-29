import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class189 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    private int field2803 = class67.method502(16);

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    private int field2808 = class67.method502(24);

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    private int field2806 = class67.method502(24);

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    private int field2807 = class67.method502(24) + 1;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    private int field2804 = class67.method502(6) + 1;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    private int field2805 = class67.method502(8);

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[I")
    private int[] field2809;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([FIZ)V")
    public final void method1349(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class67.field1035[this.field2805].field4952;
        int var6 = this.field2806 - this.field2808;
        int var7 = var6 / this.field2807;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class67.field1035[this.field2805].method2082();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2804;
                        }
                        var11 /= this.field2804;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2809[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2807 * var10 + this.field2808;
                        class307 var17 = class67.field1035[var15];
                        if (this.field2803 == 0) {
                            int var18 = this.field2807 / var17.field4952;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2081();
                                for (int var21 = 0; var21 < var17.field4952; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2807) {
                                float[] var23 = var17.method2081();
                                for (int var24 = 0; var24 < var17.field4952; var24++) {
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

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class189() {
        int[] var1 = new int[this.field2804];
        for (int var2 = 0; var2 < this.field2804; var2++) {
            int var4 = 0;
            int var5 = class67.method502(3);
            boolean var6 = class67.method500() != 0;
            if (var6) {
                var4 = class67.method502(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2809 = new int[this.field2804 * 8];
        for (int var3 = 0; var3 < this.field2804 * 8; var3++) {
            this.field2809[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class67.method502(8);
        }
    }
}
