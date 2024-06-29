import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    private int field959 = class5.method19(16);

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    private int field957 = class5.method19(24);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    private int field958 = class5.method19(24);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    private int field956 = class5.method19(24) + 1;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    private int field960 = class5.method19(6) + 1;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    private int field962 = class5.method19(8);

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[I")
    private int[] field961;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([FIZ)V")
    public final void method330(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class5.field87[this.field962].field3604;
        int var6 = this.field958 - this.field957;
        int var7 = var6 / this.field956;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class5.field87[this.field962].method1220();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field960;
                        }
                        var11 /= this.field960;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field961[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field956 * var10 + this.field957;
                        class156 var17 = class5.field87[var15];
                        if (this.field959 == 0) {
                            int var18 = this.field956 / var17.field3604;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1221();
                                for (int var21 = 0; var21 < var17.field3604; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field956) {
                                float[] var23 = var17.method1221();
                                for (int var24 = 0; var24 < var17.field3604; var24++) {
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

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class40() {
        int[] var1 = new int[this.field960];
        for (int var2 = 0; var2 < this.field960; var2++) {
            int var4 = 0;
            int var5 = class5.method19(3);
            boolean var6 = class5.method26() != 0;
            if (var6) {
                var4 = class5.method19(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field961 = new int[this.field960 * 8];
        for (int var3 = 0; var3 < this.field960 * 8; var3++) {
            this.field961[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class5.method19(8);
        }
    }
}
