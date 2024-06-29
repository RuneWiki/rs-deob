import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class148 {

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    private int field2162 = class184.method1192(16);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    private int field2160 = class184.method1192(24);

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    private int field2164 = class184.method1192(24);

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    private int field2163 = class184.method1192(24) + 1;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    private int field2159 = class184.method1192(6) + 1;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    private int field2158 = class184.method1192(8);

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[I")
    private int[] field2161;

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class148() {
        int[] var1 = new int[this.field2159];
        for (int var2 = 0; var2 < this.field2159; var2++) {
            int var4 = 0;
            int var5 = class184.method1192(3);
            boolean var6 = class184.method1198() != 0;
            if (var6) {
                var4 = class184.method1192(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2161 = new int[this.field2159 * 8];
        for (int var3 = 0; var3 < this.field2159 * 8; var3++) {
            this.field2161[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class184.method1192(8);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([FIZ)V")
    public final void method978(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class184.field2646[this.field2158].field2937;
        int var6 = this.field2164 - this.field2160;
        int var7 = var6 / this.field2163;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class184.field2646[this.field2158].method1327();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2159;
                        }
                        var11 /= this.field2159;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2161[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2163 * var10 + this.field2160;
                        class207 var17 = class184.field2646[var15];
                        if (this.field2162 == 0) {
                            int var18 = this.field2163 / var17.field2937;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1324();
                                for (int var21 = 0; var21 < var17.field2937; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2163) {
                                float[] var23 = var17.method1324();
                                for (int var24 = 0; var24 < var17.field2937; var24++) {
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
}
