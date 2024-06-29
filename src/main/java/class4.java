import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    private int field51 = class138.method1025(16);

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    private int field55 = class138.method1025(24);

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    private int field52 = class138.method1025(24);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    private int field49 = class138.method1025(24) + 1;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    private int field50 = class138.method1025(6) + 1;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    private int field53 = class138.method1025(8);

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[I")
    private int[] field54;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([FIZ)V", line = 11)
    public final void method16(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class138.field2327[this.field53].field1232;
        int var6 = this.field52 - this.field55;
        int var7 = var6 / this.field49;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class138.field2327[this.field53].method525();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field50;
                        }
                        var11 /= this.field50;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field54[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field49 * var10 + this.field55;
                        class67 var17 = class138.field2327[var15];
                        if (this.field51 == 0) {
                            int var18 = this.field49 / var17.field1232;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method527();
                                for (int var21 = 0; var21 < var17.field1232; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field49) {
                                float[] var23 = var17.method527();
                                for (int var24 = 0; var24 < var17.field1232; var24++) {
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

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 133)
    public class4() {
        int[] var1 = new int[this.field50];
        for (int var2 = 0; var2 < this.field50; var2++) {
            int var3 = 0;
            int var4 = class138.method1025(3);
            boolean var5 = class138.method1015() != 0;
            if (var5) {
                var3 = class138.method1025(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field54 = new int[this.field50 * 8];
        for (int var6 = 0; var6 < this.field50 * 8; var6++) {
            this.field54[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class138.method1025(8);
        }
    }
}
