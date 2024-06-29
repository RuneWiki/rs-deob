import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class44 {

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    private int field750 = class185.method1361(16);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    private int field745 = class185.method1361(24);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    private int field744 = class185.method1361(24);

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    private int field748 = class185.method1361(24) + 1;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    private int field749 = class185.method1361(6) + 1;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    private int field747 = class185.method1361(8);

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
    private int[] field746;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([FIZ)V")
    public final void method330(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class185.field3373[this.field747].field392;
        int var6 = this.field744 - this.field745;
        int var7 = var6 / this.field748;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class185.field3373[this.field747].method161();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field749;
                        }
                        var11 /= this.field749;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field746[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field748 * var10 + this.field745;
                        class25 var17 = class185.field3373[var15];
                        if (this.field750 == 0) {
                            int var18 = this.field748 / var17.field392;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method160();
                                for (int var21 = 0; var21 < var17.field392; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field748) {
                                float[] var23 = var17.method160();
                                for (int var24 = 0; var24 < var17.field392; var24++) {
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

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class44() {
        int[] var1 = new int[this.field749];
        for (int var2 = 0; var2 < this.field749; var2++) {
            int var4 = 0;
            int var5 = class185.method1361(3);
            boolean var6 = class185.method1364() != 0;
            if (var6) {
                var4 = class185.method1361(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field746 = new int[this.field749 * 8];
        for (int var3 = 0; var3 < this.field749 * 8; var3++) {
            this.field746[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class185.method1361(8);
        }
    }
}
