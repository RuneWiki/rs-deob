import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class98 {

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    private int field1669 = class173.method1128(16);

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    private int field1668 = class173.method1128(24);

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    private int field1666 = class173.method1128(24);

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    private int field1670 = class173.method1128(24) + 1;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    private int field1667 = class173.method1128(6) + 1;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    private int field1664 = class173.method1128(8);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[I")
    private int[] field1665;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([FIZ)V", line = 6)
    public final void method653(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class173.field2949[this.field1664].field1811;
        int var6 = this.field1666 - this.field1668;
        int var7 = var6 / this.field1670;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class173.field2949[this.field1664].method705();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1667;
                        }
                        var11 /= this.field1667;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1665[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1670 * var10 + this.field1668;
                        class106 var17 = class173.field2949[var15];
                        if (this.field1669 == 0) {
                            int var18 = this.field1670 / var17.field1811;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method706();
                                for (int var21 = 0; var21 < var17.field1811; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1670) {
                                float[] var23 = var17.method706();
                                for (int var24 = 0; var24 < var17.field1811; var24++) {
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

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 133)
    public class98() {
        int[] var1 = new int[this.field1667];
        for (int var2 = 0; var2 < this.field1667; var2++) {
            int var3 = 0;
            int var4 = class173.method1128(3);
            boolean var5 = class173.method1130() != 0;
            if (var5) {
                var3 = class173.method1128(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1665 = new int[this.field1667 * 8];
        for (int var6 = 0; var6 < this.field1667 * 8; var6++) {
            this.field1665[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class173.method1128(8);
        }
    }
}
