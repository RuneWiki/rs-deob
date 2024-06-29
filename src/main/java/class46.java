import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class46 {

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    private int field916 = class142.method855(16);

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    private int field917 = class142.method855(24);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    private int field914 = class142.method855(24);

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    private int field919 = class142.method855(24) + 1;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    private int field913 = class142.method855(6) + 1;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    private int field915 = class142.method855(8);

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[I")
    private int[] field918;

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class46() {
        int[] var1 = new int[this.field913];
        for (int var2 = 0; var2 < this.field913; var2++) {
            int var4 = 0;
            int var5 = class142.method855(3);
            boolean var6 = class142.method858() != 0;
            if (var6) {
                var4 = class142.method855(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field918 = new int[this.field913 * 8];
        for (int var3 = 0; var3 < this.field913 * 8; var3++) {
            this.field918[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class142.method855(8);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([FIZ)V")
    public final void method285(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class142.field2477[this.field915].field3646;
        int var6 = this.field914 - this.field917;
        int var7 = var6 / this.field919;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class142.field2477[this.field915].method1375();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field913;
                        }
                        var11 /= this.field913;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field918[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field919 * var10 + this.field917;
                        class199 var17 = class142.field2477[var15];
                        if (this.field916 == 0) {
                            int var18 = this.field919 / var17.field3646;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1372();
                                for (int var21 = 0; var21 < var17.field3646; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field919) {
                                float[] var23 = var17.method1372();
                                for (int var24 = 0; var24 < var17.field3646; var24++) {
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
}
