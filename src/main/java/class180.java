import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class180 {

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    private int field2918 = class52.method315(16);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private int field2920 = class52.method315(24);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    private int field2919 = class52.method315(24);

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    private int field2917 = class52.method315(24) + 1;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    private int field2915 = class52.method315(6) + 1;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    private int field2914 = class52.method315(8);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
    private int[] field2916;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method1268(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class52.field785[this.field2914].field3493;
        int var6 = this.field2919 - this.field2920;
        int var7 = var6 / this.field2917;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class52.field785[this.field2914].method1464();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2915;
                        }
                        var11 /= this.field2915;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2916[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2917 * var10 + this.field2920;
                        class202 var17 = class52.field785[var15];
                        if (this.field2918 == 0) {
                            int var18 = this.field2917 / var17.field3493;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1467();
                                for (int var21 = 0; var21 < var17.field3493; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2917) {
                                float[] var23 = var17.method1467();
                                for (int var24 = 0; var24 < var17.field3493; var24++) {
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

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 133)
    public class180() {
        int[] var1 = new int[this.field2915];
        for (int var2 = 0; var2 < this.field2915; var2++) {
            int var3 = 0;
            int var4 = class52.method315(3);
            boolean var5 = class52.method318() != 0;
            if (var5) {
                var3 = class52.method315(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field2916 = new int[this.field2915 * 8];
        for (int var6 = 0; var6 < this.field2915 * 8; var6++) {
            this.field2916[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class52.method315(8);
        }
    }
}
