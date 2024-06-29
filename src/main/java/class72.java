import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class72 {

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    private int field1412 = class130.method842(16);

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    private int field1414 = class130.method842(24);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    private int field1409 = class130.method842(24);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    private int field1410 = class130.method842(24) + 1;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    private int field1415 = class130.method842(6) + 1;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    private int field1411 = class130.method842(8);

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[I")
    private int[] field1413;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([FIZ)V")
    public final void method442(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class130.field2724[this.field1411].field2138;
        int var6 = this.field1409 - this.field1414;
        int var7 = var6 / this.field1410;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class130.field2724[this.field1411].method689();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1415;
                        }
                        var11 /= this.field1415;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1413[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1410 * var10 + this.field1414;
                        class111 var17 = class130.field2724[var15];
                        if (this.field1412 == 0) {
                            int var18 = this.field1410 / var17.field2138;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method688();
                                for (int var21 = 0; var21 < var17.field2138; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1410) {
                                float[] var23 = var17.method688();
                                for (int var24 = 0; var24 < var17.field2138; var24++) {
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

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class72() {
        int[] var1 = new int[this.field1415];
        for (int var2 = 0; var2 < this.field1415; var2++) {
            int var4 = 0;
            int var5 = class130.method842(3);
            boolean var6 = class130.method848() != 0;
            if (var6) {
                var4 = class130.method842(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1413 = new int[this.field1415 * 8];
        for (int var3 = 0; var3 < this.field1415 * 8; var3++) {
            this.field1413[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class130.method842(8);
        }
    }
}
