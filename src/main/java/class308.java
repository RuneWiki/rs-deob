import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class308 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    private int field4978 = class212.method1505(16);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    private int field4974 = class212.method1505(24);

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    private int field4975 = class212.method1505(24);

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    private int field4979 = class212.method1505(24) + 1;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    private int field4977 = class212.method1505(6) + 1;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    private int field4976 = class212.method1505(8);

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[I")
    private int[] field4980;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([FIZ)V")
    public final void method2079(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class212.field3568[this.field4976].field1737;
        int var6 = this.field4975 - this.field4974;
        int var7 = var6 / this.field4979;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class212.field3568[this.field4976].method791();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4977;
                        }
                        var11 /= this.field4977;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4980[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4979 * var10 + this.field4974;
                        class106 var17 = class212.field3568[var15];
                        if (this.field4978 == 0) {
                            int var18 = this.field4979 / var17.field1737;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method793();
                                for (int var21 = 0; var21 < var17.field1737; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4979) {
                                float[] var23 = var17.method793();
                                for (int var24 = 0; var24 < var17.field1737; var24++) {
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

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class308() {
        int[] var1 = new int[this.field4977];
        for (int var2 = 0; var2 < this.field4977; var2++) {
            int var4 = 0;
            int var5 = class212.method1505(3);
            boolean var6 = class212.method1509() != 0;
            if (var6) {
                var4 = class212.method1505(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4980 = new int[this.field4977 * 8];
        for (int var3 = 0; var3 < this.field4977 * 8; var3++) {
            this.field4980[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class212.method1505(8);
        }
    }
}
