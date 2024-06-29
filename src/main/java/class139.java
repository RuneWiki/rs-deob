import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class139 {

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    private int field1984 = class363.method2193(16);

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    private int field1982 = class363.method2193(24);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    private int field1978 = class363.method2193(24);

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    private int field1981 = class363.method2193(24) + 1;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    private int field1983 = class363.method2193(6) + 1;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    private int field1979 = class363.method2193(8);

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
    private int[] field1980;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([FIZ)V")
    public final void method936(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class363.field5313[this.field1979].field7808;
        int var6 = this.field1978 - this.field1982;
        int var7 = var6 / this.field1981;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class363.field5313[this.field1979].method3134();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1983;
                        }
                        var11 /= this.field1983;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1980[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1981 * var10 + this.field1982;
                        class530 var17 = class363.field5313[var15];
                        if (this.field1984 == 0) {
                            int var18 = this.field1981 / var17.field7808;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method3137();
                                for (int var21 = 0; var21 < var17.field7808; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1981) {
                                float[] var23 = var17.method3137();
                                for (int var24 = 0; var24 < var17.field7808; var24++) {
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

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class139() {
        int[] var1 = new int[this.field1983];
        for (int var2 = 0; var2 < this.field1983; var2++) {
            int var4 = 0;
            int var5 = class363.method2193(3);
            boolean var6 = class363.method2185() != 0;
            if (var6) {
                var4 = class363.method2193(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1980 = new int[this.field1983 * 8];
        for (int var3 = 0; var3 < this.field1983 * 8; var3++) {
            this.field1980[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class363.method2193(8);
        }
    }
}
