import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class65 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    private int field818 = class9.method62(16);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    private int field813 = class9.method62(24);

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    private int field819 = class9.method62(24);

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    private int field815 = class9.method62(24) + 1;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    private int field814 = class9.method62(6) + 1;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    private int field817 = class9.method62(8);

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
    private int[] field816;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([FIZ)V")
    public final void method336(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class9.field88[this.field817].field6587;
        int var6 = this.field819 - this.field813;
        int var7 = var6 / this.field815;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class9.field88[this.field817].method2745();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field814;
                        }
                        var11 /= this.field814;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field816[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field815 * var10 + this.field813;
                        class469 var17 = class9.field88[var15];
                        if (this.field818 == 0) {
                            int var18 = this.field815 / var17.field6587;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2746();
                                for (int var21 = 0; var21 < var17.field6587; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field815) {
                                float[] var23 = var17.method2746();
                                for (int var24 = 0; var24 < var17.field6587; var24++) {
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

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class65() {
        int[] var1 = new int[this.field814];
        for (int var2 = 0; var2 < this.field814; var2++) {
            int var4 = 0;
            int var5 = class9.method62(3);
            boolean var6 = class9.method65() != 0;
            if (var6) {
                var4 = class9.method62(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field816 = new int[this.field814 * 8];
        for (int var3 = 0; var3 < this.field814 * 8; var3++) {
            this.field816[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class9.method62(8);
        }
    }
}
