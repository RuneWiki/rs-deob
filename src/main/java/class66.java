import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class66 {

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    private int field984 = class543.method3142(16);

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
    private int field989 = class543.method3142(24);

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "I")
    private int field990 = class543.method3142(24);

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    private int field986 = class543.method3142(24) + 1;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    private int field987 = class543.method3142(6) + 1;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
    private int field985 = class543.method3142(8);

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "[I")
    private int[] field988;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "([FIZ)V", line = 7)
    public final void method656(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class543.field7523[this.field985].field7436;
        int var6 = this.field990 - this.field989;
        int var7 = var6 / this.field986;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class543.field7523[this.field985].method3103();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field987;
                        }
                        var11 /= this.field987;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field988[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field986 * var10 + this.field989;
                        class534 var17 = class543.field7523[var15];
                        if (this.field984 == 0) {
                            int var18 = this.field986 / var17.field7436;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method3106();
                                for (int var21 = 0; var21 < var17.field7436; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field986) {
                                float[] var23 = var17.method3106();
                                for (int var24 = 0; var24 < var17.field7436; var24++) {
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

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V", line = 133)
    public class66() {
        int[] var1 = new int[this.field987];
        for (int var2 = 0; var2 < this.field987; var2++) {
            int var4 = 0;
            int var5 = class543.method3142(3);
            boolean var6 = class543.method3134() != 0;
            if (var6) {
                var4 = class543.method3142(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field988 = new int[this.field987 * 8];
        for (int var3 = 0; var3 < this.field987 * 8; var3++) {
            this.field988[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class543.method3142(8);
        }
    }
}
