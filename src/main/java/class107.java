import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class107 {

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    private int field1939 = class124.method1008(16);

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    private int field1934 = class124.method1008(24);

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    private int field1936 = class124.method1008(24);

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    private int field1940 = class124.method1008(24) + 1;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    private int field1935 = class124.method1008(6) + 1;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    private int field1937 = class124.method1008(8);

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    private int[] field1938;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([FIZ)V", line = 6)
    public final void method870(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class124.field2266[this.field1937].field39;
        int var6 = this.field1936 - this.field1934;
        int var7 = var6 / this.field1940;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class124.field2266[this.field1937].method23();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1935;
                        }
                        var11 /= this.field1935;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1938[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1940 * var10 + this.field1934;
                        class5 var17 = class124.field2266[var15];
                        if (this.field1939 == 0) {
                            int var18 = this.field1940 / var17.field39;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method25();
                                for (int var21 = 0; var21 < var17.field39; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1940) {
                                float[] var23 = var17.method25();
                                for (int var24 = 0; var24 < var17.field39; var24++) {
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

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 133)
    public class107() {
        int[] var1 = new int[this.field1935];
        for (int var2 = 0; var2 < this.field1935; var2++) {
            int var3 = 0;
            int var4 = class124.method1008(3);
            boolean var5 = class124.method1001() != 0;
            if (var5) {
                var3 = class124.method1008(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1938 = new int[this.field1935 * 8];
        for (int var6 = 0; var6 < this.field1935 * 8; var6++) {
            this.field1938[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class124.method1008(8);
        }
    }
}
