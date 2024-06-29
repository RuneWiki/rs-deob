import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class121 {

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    private int field1454 = class163.method1077(16);

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    private int field1458 = class163.method1077(24);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    private int field1452 = class163.method1077(24);

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    private int field1456 = class163.method1077(24) + 1;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    private int field1457 = class163.method1077(6) + 1;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    private int field1453 = class163.method1077(8);

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[I")
    private int[] field1455;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([FIZ)V", line = 10)
    public final void method829(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class163.field2226[this.field1453].field4580;
        int var6 = this.field1452 - this.field1458;
        int var7 = var6 / this.field1456;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class163.field2226[this.field1453].method2152();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1457;
                        }
                        var11 /= this.field1457;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1455[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1456 * var10 + this.field1458;
                        class329 var17 = class163.field2226[var15];
                        if (this.field1454 == 0) {
                            int var18 = this.field1456 / var17.field4580;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2150();
                                for (int var21 = 0; var21 < var17.field4580; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1456) {
                                float[] var23 = var17.method2150();
                                for (int var24 = 0; var24 < var17.field4580; var24++) {
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

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 133)
    public class121() {
        int[] var1 = new int[this.field1457];
        for (int var2 = 0; var2 < this.field1457; var2++) {
            int var4 = 0;
            int var5 = class163.method1077(3);
            boolean var6 = class163.method1070() != 0;
            if (var6) {
                var4 = class163.method1077(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1455 = new int[this.field1457 * 8];
        for (int var3 = 0; var3 < this.field1457 * 8; var3++) {
            this.field1455[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class163.method1077(8);
        }
    }
}
