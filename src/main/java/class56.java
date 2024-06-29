import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    private int field998 = class153.method1087(16);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    private int field995 = class153.method1087(24);

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    private int field999 = class153.method1087(24);

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    private int field1001 = class153.method1087(24) + 1;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    private int field996 = class153.method1087(6) + 1;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    private int field997 = class153.method1087(8);

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[I")
    private int[] field1000;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([FIZ)V")
    public final void method353(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class153.field2782[this.field997].field2057;
        int var6 = this.field999 - this.field995;
        int var7 = var6 / this.field1001;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class153.field2782[this.field997].method825();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field996;
                        }
                        var11 /= this.field996;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1000[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1001 * var10 + this.field995;
                        class120 var17 = class153.field2782[var15];
                        if (this.field998 == 0) {
                            int var18 = this.field1001 / var17.field2057;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method823();
                                for (int var21 = 0; var21 < var17.field2057; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1001) {
                                float[] var23 = var17.method823();
                                for (int var24 = 0; var24 < var17.field2057; var24++) {
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

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class56() {
        int[] var1 = new int[this.field996];
        for (int var2 = 0; var2 < this.field996; var2++) {
            int var4 = 0;
            int var5 = class153.method1087(3);
            boolean var6 = class153.method1080() != 0;
            if (var6) {
                var4 = class153.method1087(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1000 = new int[this.field996 * 8];
        for (int var3 = 0; var3 < this.field996 * 8; var3++) {
            this.field1000[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class153.method1087(8);
        }
    }
}
