import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    private int field1371 = class129.method1050(16);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    private int field1367 = class129.method1050(24);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    private int field1368 = class129.method1050(24);

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    private int field1369 = class129.method1050(24) + 1;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    private int field1370 = class129.method1050(6) + 1;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    private int field1373 = class129.method1050(8);

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    private int[] field1372;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([FIZ)V")
    public final void method379(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class129.field2934[this.field1373].field2807;
        int var6 = this.field1368 - this.field1367;
        int var7 = var6 / this.field1369;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class129.field2934[this.field1373].method971();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1370;
                        }
                        var11 /= this.field1370;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1372[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1369 * var10 + this.field1367;
                        class123 var17 = class129.field2934[var15];
                        if (this.field1371 == 0) {
                            int var18 = this.field1369 / var17.field2807;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method969();
                                for (int var21 = 0; var21 < var17.field2807; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1369) {
                                float[] var23 = var17.method969();
                                for (int var24 = 0; var24 < var17.field2807; var24++) {
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

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class55() {
        int[] var1 = new int[this.field1370];
        for (int var2 = 0; var2 < this.field1370; var2++) {
            int var4 = 0;
            int var5 = class129.method1050(3);
            boolean var6 = class129.method1042() != 0;
            if (var6) {
                var4 = class129.method1050(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1372 = new int[this.field1370 * 8];
        for (int var3 = 0; var3 < this.field1370 * 8; var3++) {
            this.field1372[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class129.method1050(8);
        }
    }
}
