import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class313 {

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    private int field4545 = class42.method243(16);

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    private int field4544 = class42.method243(24);

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    private int field4548 = class42.method243(24);

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    private int field4547 = class42.method243(24) + 1;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    private int field4546 = class42.method243(6) + 1;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    private int field4549 = class42.method243(8);

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "[I")
    private int[] field4543;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method1889(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class42.field460[this.field4549].field5531;
        int var6 = this.field4548 - this.field4544;
        int var7 = var6 / this.field4547;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class42.field460[this.field4549].method2280();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4546;
                        }
                        var11 /= this.field4546;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4543[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4547 * var10 + this.field4544;
                        class394 var17 = class42.field460[var15];
                        if (this.field4545 == 0) {
                            int var18 = this.field4547 / var17.field5531;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2281();
                                for (int var21 = 0; var21 < var17.field5531; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4547) {
                                float[] var23 = var17.method2281();
                                for (int var24 = 0; var24 < var17.field5531; var24++) {
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

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V", line = 133)
    public class313() {
        int[] var1 = new int[this.field4546];
        for (int var2 = 0; var2 < this.field4546; var2++) {
            int var4 = 0;
            int var5 = class42.method243(3);
            boolean var6 = class42.method245() != 0;
            if (var6) {
                var4 = class42.method243(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4543 = new int[this.field4546 * 8];
        for (int var3 = 0; var3 < this.field4546 * 8; var3++) {
            this.field4543[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class42.method243(8);
        }
    }
}
