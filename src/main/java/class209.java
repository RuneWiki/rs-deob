import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class209 {

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    private int field2910 = class622.method3577(16);

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    private int field2911 = class622.method3577(24);

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    private int field2912 = class622.method3577(24);

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    private int field2915 = class622.method3577(24) + 1;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    private int field2909 = class622.method3577(6) + 1;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    private int field2913 = class622.method3577(8);

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "[I")
    private int[] field2914;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "([FIZ)V", line = 7)
    public final void method1327(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class622.field8702[this.field2913].field1060;
        int var6 = this.field2912 - this.field2911;
        int var7 = var6 / this.field2915;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class622.field8702[this.field2913].method661();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2909;
                        }
                        var11 /= this.field2909;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2914[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2915 * var10 + this.field2911;
                        class89 var17 = class622.field8702[var15];
                        if (this.field2910 == 0) {
                            int var18 = this.field2915 / var17.field1060;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method660();
                                for (int var21 = 0; var21 < var17.field1060; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2915) {
                                float[] var23 = var17.method660();
                                for (int var24 = 0; var24 < var17.field1060; var24++) {
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

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "()V", line = 133)
    public class209() {
        int[] var1 = new int[this.field2909];
        for (int var2 = 0; var2 < this.field2909; var2++) {
            int var4 = 0;
            int var5 = class622.method3577(3);
            boolean var6 = class622.method3574() != 0;
            if (var6) {
                var4 = class622.method3577(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2914 = new int[this.field2909 * 8];
        for (int var3 = 0; var3 < this.field2909 * 8; var3++) {
            this.field2914[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class622.method3577(8);
        }
    }
}
