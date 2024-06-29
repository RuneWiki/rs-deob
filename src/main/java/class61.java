import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class61 {

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "I")
    private int field1121 = class5.method22(16);

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "I")
    private int field1117 = class5.method22(24);

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "I")
    private int field1116 = class5.method22(24);

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
    private int field1122 = class5.method22(24) + 1;

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "I")
    private int field1120 = class5.method22(6) + 1;

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "I")
    private int field1118 = class5.method22(8);

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "[I")
    private int[] field1119;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "([FIZ)V")
    public final void method669(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class5.field95[this.field1118].field6729;
        int var6 = this.field1116 - this.field1117;
        int var7 = var6 / this.field1122;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class5.field95[this.field1118].method2833();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1120;
                        }
                        var11 /= this.field1120;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1119[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1122 * var10 + this.field1117;
                        class466 var17 = class5.field95[var15];
                        if (this.field1121 == 0) {
                            int var18 = this.field1122 / var17.field6729;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2831();
                                for (int var21 = 0; var21 < var17.field6729; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1122) {
                                float[] var23 = var17.method2831();
                                for (int var24 = 0; var24 < var17.field6729; var24++) {
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

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "()V")
    public class61() {
        int[] var1 = new int[this.field1120];
        for (int var2 = 0; var2 < this.field1120; var2++) {
            int var4 = 0;
            int var5 = class5.method22(3);
            boolean var6 = class5.method26() != 0;
            if (var6) {
                var4 = class5.method22(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1119 = new int[this.field1120 * 8];
        for (int var3 = 0; var3 < this.field1120 * 8; var3++) {
            this.field1119[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class5.method22(8);
        }
    }
}
