import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class560 extends class334 {

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    private int field7756 = 4096;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    private int field7762 = 4096;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    private int field7761 = 4096;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Lin;")
    public static class380 field7759 = new class380(39, 3);

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V", line = 4)
    public class560() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZLol;)V", line = 12)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field7763;
        if (arg1) {
            method3260(-94);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field7756 = arg2.method2565((byte) -88);
                }
            } else {
                this.field7761 = arg2.method2565((byte) -97);
            }
        } else {
            this.field7762 = arg2.method2565((byte) -99);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)[[I", line = 57)
    public final int[][] method283(boolean arg0, int arg1) {
        ++field7760;
        if (!arg0) {
            this.method29(-113, true, (class431) null);
        }
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (super.field4734.field425) {
            int[][] var4 = this.method2053(1, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class439.field6099 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field7762 * var12 >> 12;
                    var9[var11] = this.field7761 * var13 >> 12;
                    var10[var11] = this.field7756 * var14 >> 12;
                } else {
                    var8[var11] = this.field7762;
                    var9[var11] = this.field7761;
                    var10[var11] = this.field7756;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V", line = 122)
    public static final void method3260(int arg0) {
        ++field7757;
        if (arg0 == -1) {
            class370.field5223 = null;
            class393.field5461 = null;
            class349.field4954 = null;
            class667.field9379 = null;
            class163.field2509 = null;
            class219.field3210 = false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII[BII)V", line = 138)
    public static final void method3261(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        ++field7758;
        if (~arg0 < -1 && !class362.method2181(arg0, -1)) {
            throw new IllegalArgumentException("");
        } else if (~arg5 < -1 && !class362.method2181(arg5, -1)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class752.method4155(arg1, (byte) -116);
            if (arg3 != -24523) {
                method3261(79, 120, 79, -23, (byte[]) null, -40, 31);
            }
            int var8 = 0;
            int var9 = ~arg0 <= ~arg5 ? arg5 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg5 >> 1;
            byte[] var12 = arg4;
            byte[] var13 = new byte[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg6, var8, arg2, arg0, arg5, 0, arg1, 5121, var12, 0);
                if (~var9 >= -2) {
                    return;
                }
                int var14 = arg0 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var7 > var16; ++var16) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var11 > var20; ++var20) {
                        for (int var21 = 0; ~var10 < ~var21; ++var21) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                arg5 = var11;
                arg0 = var10;
                var12 = var15;
                var9 >>= 1;
                var11 >>= 1;
                ++var8;
                var10 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V", line = 240)
    public static void method3262(int arg0) {
        if (arg0 == -474453951) {
            field7759 = null;
        }
    }
}
