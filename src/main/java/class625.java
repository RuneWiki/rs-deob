import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class625 extends class529 {

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    private int field8715 = -1;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field8713 = -1;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "Lus;")
    public static class328 field8725 = new class328(81, 8);

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field8728 = 0;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public int field8714;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public int field8721;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "Lrr;")
    public static class395 field8727;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "[I")
    public int[] field8711;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)I")
    public final int method3027(int arg0) {
        if (arg0 != 20152) {
            return 57;
        } else {
            ++field8719;
            return this.field8715;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)I")
    public static final int method3415(int arg0, int arg1, int arg2, int arg3) {
        ++field8718;
        int var4 = arg0 / arg2;
        int var5 = arg2 - 1 & arg0;
        int var6 = arg3 / arg2;
        int var7 = arg3 & arg2 + -1;
        int var8 = class538.method3062(var4, var6, (byte) 104);
        int var9 = class538.method3062(var4 + 1, var6, (byte) 104);
        int var10 = class538.method3062(var4, var6 - -1, (byte) 104);
        if (arg1 > -54) {
            method3415(-6, 35, 41, 71);
        }
        int var11 = class538.method3062(var4 + 1, var6 + 1, (byte) 104);
        int var12 = class83.method590((byte) -85, var9, arg2, var8, var5);
        int var13 = class83.method590((byte) -86, var11, arg2, var10, var5);
        return class83.method590((byte) -85, var13, arg2, var12, var7);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (~arg0 == -1) {
            this.field8715 = arg2.method1107(false);
        }
        if (arg1 < 45) {
            this.field8711 = null;
        }
        ++field8720;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public final void method2608(byte arg0) {
        super.method2608((byte) -109);
        if (arg0 < -20) {
            ++field8724;
            this.field8711 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([I[IILbm;IB)Ljj;")
    public static final class251 method3416(int[] arg0, int[] arg1, int arg2, class684 arg3, int arg4, byte arg5) {
        if (arg5 >= -31) {
            field8713 = 119;
        }
        ++field8717;
        if (arg3.method1399(class240.field3093, (byte) 62, class15.field215)) {
            byte[] var6 = new byte[arg2 * arg4];
            for (int var7 = 0; arg2 > var7; ++var7) {
                int var8 = arg4 * var7 + arg1[var7];
                for (int var9 = 0; ~var9 > ~arg0[var7]; ++var9) {
                    var6[var8++] = -1;
                }
            }
            return new class251(arg3, arg4, arg2, var6);
        } else {
            int[] var10 = new int[arg2 * arg4];
            for (int var11 = 0; arg2 > var11; ++var11) {
                int var12 = arg4 * var11 + arg1[var11];
                for (int var13 = 0; arg0[var11] > var13; ++var13) {
                    var10[var12++] = -16777216;
                }
            }
            return new class251(arg3, arg4, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(B)V")
    public static void method3417(byte arg0) {
        field8725 = null;
        field8727 = null;
        if (arg0 != 47) {
            method3416((int[]) null, (int[]) null, -110, (class684) null, -56, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I")
    public int[][] method592(int arg0, int arg1) {
        ++field8726;
        if (arg1 != 2) {
            method3418(14, false, 17);
        }
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (super.field7450.field5165 && this.method3419(-75)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field8721 * (~class424.field6042 != ~this.field8714 ? this.field8714 * arg0 / class424.field6042 : arg0);
            if (~class304.field3909 == ~this.field8721) {
                for (int var8 = 0; var8 < class304.field3909; ++var8) {
                    int var9 = this.field8711[var7++];
                    var6[var8] = class272.method1629(var9 << 4, 4080);
                    var5[var8] = class272.method1629(65280, var9) >> 4;
                    var4[var8] = class272.method1629(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~class304.field3909 < ~var10; ++var10) {
                    int var11 = this.field8721 * var10 / class304.field3909;
                    int var12 = this.field8711[var7 + var11];
                    var6[var10] = class272.method1629(4080, var12 << 4);
                    var5[var10] = class272.method1629(65280, var12) >> 4;
                    var4[var10] = class272.method1629(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class625() {
        super(0, false);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZI)I")
    public static final int method3418(int arg0, boolean arg1, int arg2) {
        ++field8722;
        int var3 = arg0 * 57 + arg2;
        if (!arg1) {
            return 114;
        } else {
            int var4 = var3 << 13 ^ var3;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 - -789221) * var4 - -1376312589;
            return 255 & var5 >> 19;
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)Z")
    public final boolean method3419(int arg0) {
        ++field8716;
        if (this.field8711 != null) {
            return true;
        } else {
            if (arg0 >= -32) {
                this.field8714 = 123;
            }
            if (this.field8715 >= 0) {
                class196 var2 = ~class373.field5240 <= -1 ? class196.method1231(class44.field666, class373.field5240, this.field8715) : class196.method1223(class44.field666, this.field8715);
                var2.method1230();
                this.field8711 = var2.method1229();
                this.field8714 = var2.field2525;
                this.field8721 = var2.field2527;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)Z")
    public static final boolean method3420(int arg0) {
        ++field8723;
        try {
            if (arg0 != 0) {
                field8713 = 123;
            }
            class534 var1 = new class534();
            byte[] var2 = var1.method3036(class537.field7543, true);
            class707.method3911((byte) -79, var2);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }
}
