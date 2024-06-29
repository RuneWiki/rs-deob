import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class236 {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    private int field3762 = class196.method1396(16);

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    private int field3767 = class196.method1396(24);

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    private int field3764 = class196.method1396(24);

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    private int field3766 = class196.method1396(24) + 1;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    private int field3768 = class196.method1396(6) + 1;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    private int field3763 = class196.method1396(8);

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "[I")
    private int[] field3765;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([FIZ)V", line = 11)
    public final void method1655(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class196.field2932[this.field3763].field416;
        int var6 = this.field3764 - this.field3767;
        int var7 = var6 / this.field3766;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class196.field2932[this.field3763].method245();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3768;
                        }
                        var11 /= this.field3768;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3765[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3766 * var10 + this.field3767;
                        class27 var17 = class196.field2932[var15];
                        if (this.field3762 == 0) {
                            int var18 = this.field3766 / var17.field416;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method242();
                                for (int var21 = 0; var21 < var17.field416; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3766) {
                                float[] var23 = var17.method242();
                                for (int var24 = 0; var24 < var17.field416; var24++) {
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

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 133)
    public class236() {
        int[] var1 = new int[this.field3768];
        for (int var2 = 0; var2 < this.field3768; var2++) {
            int var3 = 0;
            int var4 = class196.method1396(3);
            boolean var5 = class196.method1398() != 0;
            if (var5) {
                var3 = class196.method1396(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field3765 = new int[this.field3768 * 8];
        for (int var6 = 0; var6 < this.field3768 * 8; var6++) {
            this.field3765[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class196.method1396(8);
        }
    }
}
