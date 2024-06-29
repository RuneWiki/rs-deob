import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class38 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    private int field639 = class5.method26(16);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    private int field635 = class5.method26(24);

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    private int field637 = class5.method26(24);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    private int field636 = class5.method26(24) + 1;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    private int field638 = class5.method26(6) + 1;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    private int field640 = class5.method26(8);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "[I")
    private int[] field634;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([FIZ)V")
    public final void method210(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class5.field83[this.field640].field3831;
        int var6 = this.field637 - this.field635;
        int var7 = var6 / this.field636;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class5.field83[this.field640].method1257();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field638;
                        }
                        var11 /= this.field638;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field634[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field636 * var10 + this.field635;
                        class196 var17 = class5.field83[var15];
                        if (this.field639 == 0) {
                            int var18 = this.field636 / var17.field3831;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1259();
                                for (int var21 = 0; var21 < var17.field3831; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field636) {
                                float[] var23 = var17.method1259();
                                for (int var24 = 0; var24 < var17.field3831; var24++) {
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

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class38() {
        int[] var1 = new int[this.field638];
        for (int var2 = 0; var2 < this.field638; var2++) {
            int var4 = 0;
            int var5 = class5.method26(3);
            boolean var6 = class5.method24() != 0;
            if (var6) {
                var4 = class5.method26(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field634 = new int[this.field638 * 8];
        for (int var3 = 0; var3 < this.field638 * 8; var3++) {
            this.field634[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class5.method26(8);
        }
    }
}
