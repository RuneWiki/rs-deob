import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class130 {

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    private int field2080 = class71.method519(16);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    private int field2079 = class71.method519(24);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    private int field2076 = class71.method519(24);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    private int field2075 = class71.method519(24) + 1;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    private int field2077 = class71.method519(6) + 1;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    private int field2078 = class71.method519(8);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[I")
    private int[] field2074;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([FIZ)V")
    public final void method871(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class71.field1252[this.field2078].field4997;
        int var6 = this.field2076 - this.field2079;
        int var7 = var6 / this.field2075;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class71.field1252[this.field2078].method2078();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2077;
                        }
                        var11 /= this.field2077;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2074[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2075 * var10 + this.field2079;
                        class335 var17 = class71.field1252[var15];
                        if (this.field2080 == 0) {
                            int var18 = this.field2075 / var17.field4997;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2077();
                                for (int var21 = 0; var21 < var17.field4997; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2075) {
                                float[] var23 = var17.method2077();
                                for (int var24 = 0; var24 < var17.field4997; var24++) {
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

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class130() {
        int[] var1 = new int[this.field2077];
        for (int var2 = 0; var2 < this.field2077; var2++) {
            int var4 = 0;
            int var5 = class71.method519(3);
            boolean var6 = class71.method520() != 0;
            if (var6) {
                var4 = class71.method519(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2074 = new int[this.field2077 * 8];
        for (int var3 = 0; var3 < this.field2077 * 8; var3++) {
            this.field2074[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class71.method519(8);
        }
    }
}
