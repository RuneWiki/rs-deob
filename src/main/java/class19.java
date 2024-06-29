import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    private int field411 = class128.method994(16);

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    private int field414 = class128.method994(24);

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    private int field415 = class128.method994(24);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    private int field410 = class128.method994(24) + 1;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    private int field412 = class128.method994(6) + 1;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    private int field409 = class128.method994(8);

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
    private int[] field413;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([FIZ)V")
    public final void method151(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class128.field2925[this.field409].field1616;
        int var6 = this.field415 - this.field414;
        int var7 = var6 / this.field410;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class128.field2925[this.field409].method518();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field412;
                        }
                        var11 /= this.field412;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field413[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field410 * var10 + this.field414;
                        class76 var17 = class128.field2925[var15];
                        if (this.field411 == 0) {
                            int var18 = this.field410 / var17.field1616;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method521();
                                for (int var21 = 0; var21 < var17.field1616; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field410) {
                                float[] var23 = var17.method521();
                                for (int var24 = 0; var24 < var17.field1616; var24++) {
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

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class19() {
        int[] var1 = new int[this.field412];
        for (int var2 = 0; var2 < this.field412; var2++) {
            int var4 = 0;
            int var5 = class128.method994(3);
            boolean var6 = class128.method986() != 0;
            if (var6) {
                var4 = class128.method994(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field413 = new int[this.field412 * 8];
        for (int var3 = 0; var3 < this.field412 * 8; var3++) {
            this.field413[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class128.method994(8);
        }
    }
}
