import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class420 {

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    private int field5344 = class413.method2319(16);

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    private int field5345 = class413.method2319(24);

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    private int field5347 = class413.method2319(24);

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    private int field5346 = class413.method2319(24) + 1;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    private int field5348 = class413.method2319(6) + 1;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    private int field5343 = class413.method2319(8);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "[I")
    private int[] field5342;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([FIZ)V")
    public final void method2345(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class413.field5280[this.field5343].field6221;
        int var6 = this.field5347 - this.field5345;
        int var7 = var6 / this.field5346;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class413.field5280[this.field5343].method2634();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field5348;
                        }
                        var11 /= this.field5348;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field5342[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field5346 * var10 + this.field5345;
                        class462 var17 = class413.field5280[var15];
                        if (this.field5344 == 0) {
                            int var18 = this.field5346 / var17.field6221;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2632();
                                for (int var21 = 0; var21 < var17.field6221; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field5346) {
                                float[] var23 = var17.method2632();
                                for (int var24 = 0; var24 < var17.field6221; var24++) {
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

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V")
    public class420() {
        int[] var1 = new int[this.field5348];
        for (int var2 = 0; var2 < this.field5348; var2++) {
            int var4 = 0;
            int var5 = class413.method2319(3);
            boolean var6 = class413.method2321() != 0;
            if (var6) {
                var4 = class413.method2319(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field5342 = new int[this.field5348 * 8];
        for (int var3 = 0; var3 < this.field5348 * 8; var3++) {
            this.field5342[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class413.method2319(8);
        }
    }
}
