import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class276 extends class5 {

    @OriginalMember(owner = "client!ada", name = "L", descriptor = "[I")
    private int[] field3462 = new int[3];

    @OriginalMember(owner = "client!ada", name = "K", descriptor = "I")
    private int field3461 = 4096;

    @OriginalMember(owner = "client!ada", name = "I", descriptor = "I")
    private int field3459 = 409;

    @OriginalMember(owner = "client!ada", name = "P", descriptor = "I")
    private int field3466 = 4096;

    @OriginalMember(owner = "client!ada", name = "J", descriptor = "I")
    private int field3460 = 4096;

    @OriginalMember(owner = "client!ada", name = "H", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ada", name = "N", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ada", name = "O", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ada", name = "Q", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ada", name = "M", descriptor = "Lpl;")
    public static class612 field3463;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILes;I)V", line = 5)
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field3467;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            int var5 = arg1.method3517(arg0 + -2);
                            this.field3462[2] = class695.method3921(var5, 255) >> 12;
                            this.field3462[0] = class695.method3921(267386880, var5 << 4);
                            this.field3462[1] = class695.method3921(65280, var5) >> 4;
                        }
                    } else {
                        this.field3466 = arg1.method3470(arg0 ^ 13110);
                    }
                } else {
                    this.field3461 = arg1.method3470(13111);
                }
            } else {
                this.field3460 = arg1.method3470(13111);
            }
        } else {
            this.field3459 = arg1.method3470(13111);
        }
        if (arg0 != 1) {
            method1572(-128);
        }
    }

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "(I)V", line = 73)
    public static void method1572(int arg0) {
        field3463 = null;
        if (arg0 != 0) {
            field3464 = -49;
        }
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V", line = 185)
    public class276() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IZ)[[I", line = 87)
    public final int[][] method44(int arg0, boolean arg1) {
        ++field3465;
        int[][] var3 = super.field135.method2706(arg0, -103);
        if (!arg1) {
            this.field3466 = 35;
        }
        if (super.field135.field6667) {
            int[][] var4 = this.method45(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class657.field9287; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3462[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field3459 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3462[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field3459) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3462[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field3459) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3466 * var12 >> 12;
                            var9[var11] = this.field3461 * var14 >> 12;
                            var10[var11] = this.field3460 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
