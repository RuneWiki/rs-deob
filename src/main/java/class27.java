import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class27 extends class155 {

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "Z")
    public boolean field295 = false;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "Lvd;")
    public class19 field296;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "Z")
    private boolean field293;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Z")
    private boolean field294;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "F")
    private float field299;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "[I")
    private int[] field300;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "[I")
    public static int[] field301;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
    public static void method174() {
        field301 = null;
    }

    @OriginalMember(owner = "client!bd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lib;Llc;)Z")
    public final boolean method175(class61 arg0, class270 arg1) {
        return this.field296.method131(arg1, -118, arg0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lib;Llc;FZ)[I")
    public final int[] method176(class61 arg0, class270 arg1, float arg2, boolean arg3) {
        if (this.field300 == null || this.field299 != arg2) {
            if (!this.field296.method131(arg1, -113, arg0)) {
                return null;
            }
            this.field302 = arg3 ? 64 : 128;
            this.field300 = this.field296.method133((double) arg2, true, 1, this.field302, arg0, arg1, this.field302, this.field294);
            this.field299 = arg2;
            if (this.field293) {
                int[] var5 = new int[this.field302];
                int[] var6 = new int[this.field302];
                int[] var7 = new int[this.field302];
                int[] var8 = new int[this.field302 * this.field302];
                int var9 = this.field302;
                int var10 = this.field302;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field300[var14];
                        var5[var32] += var33 >> 16 & 0xFF;
                        var6[var32] += var33 >> 8 & 0xFF;
                        var7[var32] += var33 & 0xFF;
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                }
                int var17 = var13;
                for (int var18 = var12; var18 >= 0; var18--) {
                    int var19 = 1;
                    int var20 = 1;
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    for (int var24 = 2; var24 >= 0; var24--) {
                        var20--;
                        var23 += var5[var20];
                        var21 += var6[var20];
                        var22 += var7[var20];
                        if (var20 == 0) {
                            var20 = var9;
                        }
                    }
                    for (int var25 = var11; var25 >= 0; var25--) {
                        var20--;
                        var19--;
                        int var29 = var23 / 9;
                        int var30 = var21 / 9;
                        int var31 = var22 / 9;
                        var17--;
                        var8[var17] = var29 << 16 | var30 << 8 | var31;
                        var23 += var5[var20] - var5[var19];
                        var22 += var7[var20] - var7[var19];
                        var21 += var6[var20] - var6[var19];
                        if (var20 == 0) {
                            var20 = var9;
                        }
                        if (var19 == 0) {
                            var19 = var9;
                        }
                    }
                    for (int var26 = var11; var26 >= 0; var26--) {
                        var14--;
                        int var27 = this.field300[var14];
                        var15--;
                        int var28 = this.field300[var15];
                        var5[var26] += (var27 >> 16 & 0xFF) - (var28 >> 16 & 0xFF);
                        var6[var26] += (var27 >> 8 & 0xFF) - (var28 >> 8 & 0xFF);
                        var7[var26] += (var27 & 0xFF) - (var28 & 0xFF);
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                    if (var15 == 0) {
                        var15 = var13;
                    }
                }
                this.field300 = var8;
            }
        }
        return this.field300;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public final void method177(int arg0) {
        if (this.field300 == null || this.field298 == 0 && this.field297 == 0) {
            return;
        }
        if (field301 == null || field301.length < this.field300.length) {
            field301 = new int[this.field300.length];
        }
        int var2 = this.field300.length;
        int var3 = this.field297 * arg0;
        int var4 = this.field302 - 1;
        int var5 = this.field302 * arg0 * this.field298;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field302) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field302; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field301[var11] = this.field300[var12];
            }
        }
        int[] var8 = this.field300;
        this.field300 = field301;
        field301 = var8;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lhc;)V")
    public class27(class53 arg0) {
        this.field296 = new class19(arg0);
        this.field293 = arg0.method366(-16505) == 1;
        this.field294 = arg0.method366(-16505) == 1;
        arg0.method366(-16505);
        arg0.method366(-16505);
        int var2 = arg0.method366(-16505) & 0x3;
        this.field297 = arg0.method335((byte) 26);
        this.field298 = arg0.method335((byte) 26);
        arg0.method366(-16505);
        arg0.method366(-16505);
        arg0.method366(-16505);
    }
}
