import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class337 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    private int field4999 = class198.method1434(16);

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    private int field5001 = class198.method1434(24);

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    private int field5002 = class198.method1434(24);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    private int field5000 = class198.method1434(24) + 1;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    private int field5003 = class198.method1434(6) + 1;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    private int field4998 = class198.method1434(8);

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[I")
    private int[] field5004;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([FIZ)V", line = 6)
    public final void method2166(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class198.field2902[this.field4998].field1216;
        int var6 = this.field5002 - this.field5001;
        int var7 = var6 / this.field5000;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class198.field2902[this.field4998].method670();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5003;
                        }
                        var11 /= this.field5003;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5004[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5000 * var10 + this.field5001;
                        class94 var17 = class198.field2902[var15];
                        if (this.field4999 == 0) {
                            int var18 = this.field5000 / var17.field1216;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method669();
                                for (int var21 = 0; var21 < var17.field1216; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5000) {
                                float[] var23 = var17.method669();
                                for (int var24 = 0; var24 < var17.field1216; var24++) {
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

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 133)
    public class337() {
        int[] var1 = new int[this.field5003];
        for (int var2 = 0; var2 < this.field5003; var2++) {
            int var4 = 0;
            int var5 = class198.method1434(3);
            boolean var6 = class198.method1430() != 0;
            if (var6) {
                var4 = class198.method1434(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field5004 = new int[this.field5003 * 8];
        for (int var3 = 0; var3 < this.field5003 * 8; var3++) {
            this.field5004[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class198.method1434(8);
        }
    }
}
