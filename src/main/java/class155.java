import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class155 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    private int field2148 = class217.method1412(16);

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    private int field2151 = class217.method1412(24);

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    private int field2150 = class217.method1412(24);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    private int field2149 = class217.method1412(24) + 1;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    private int field2146 = class217.method1412(6) + 1;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    private int field2152 = class217.method1412(8);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "[I")
    private int[] field2147;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([FIZ)V")
    public final void method967(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class217.field3340[this.field2152].field845;
        int var6 = this.field2150 - this.field2151;
        int var7 = var6 / this.field2149;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class217.field3340[this.field2152].method385();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2146;
                        }
                        var11 /= this.field2146;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2147[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2149 * var10 + this.field2151;
                        class62 var17 = class217.field3340[var15];
                        if (this.field2148 == 0) {
                            int var18 = this.field2149 / var17.field845;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method388();
                                for (int var21 = 0; var21 < var17.field845; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2149) {
                                float[] var23 = var17.method388();
                                for (int var24 = 0; var24 < var17.field845; var24++) {
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

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class155() {
        int[] var1 = new int[this.field2146];
        for (int var2 = 0; var2 < this.field2146; var2++) {
            int var4 = 0;
            int var5 = class217.method1412(3);
            boolean var6 = class217.method1414() != 0;
            if (var6) {
                var4 = class217.method1412(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2147 = new int[this.field2146 * 8];
        for (int var3 = 0; var3 < this.field2146 * 8; var3++) {
            this.field2147[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class217.method1412(8);
        }
    }
}
