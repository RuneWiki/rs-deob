import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class12 {

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    private int field129 = class250.method1760(16);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    private int field131 = class250.method1760(24);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    private int field127 = class250.method1760(24);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    private int field126 = class250.method1760(24) + 1;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    private int field130 = class250.method1760(6) + 1;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    private int field128 = class250.method1760(8);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "[I")
    private int[] field125;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([FIZ)V", line = 10)
    public final void method92(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class250.field3667[this.field128].field2830;
        int var6 = this.field127 - this.field131;
        int var7 = var6 / this.field126;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class250.field3667[this.field128].method1481();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field130;
                        }
                        var11 /= this.field130;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field125[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field126 * var10 + this.field131;
                        class203 var17 = class250.field3667[var15];
                        if (this.field129 == 0) {
                            int var18 = this.field126 / var17.field2830;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1478();
                                for (int var21 = 0; var21 < var17.field2830; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field126) {
                                float[] var23 = var17.method1478();
                                for (int var24 = 0; var24 < var17.field2830; var24++) {
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

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 133)
    public class12() {
        int[] var1 = new int[this.field130];
        for (int var2 = 0; var2 < this.field130; var2++) {
            int var3 = 0;
            int var4 = class250.method1760(3);
            boolean var5 = class250.method1755() != 0;
            if (var5) {
                var3 = class250.method1760(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field125 = new int[this.field130 * 8];
        for (int var6 = 0; var6 < this.field130 * 8; var6++) {
            this.field125[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class250.method1760(8);
        }
    }
}
