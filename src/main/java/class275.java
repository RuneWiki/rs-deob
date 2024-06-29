import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class275 extends class748 {

    @OriginalMember(owner = "client!fga", name = "P", descriptor = "I")
    private int field3696 = 1;

    @OriginalMember(owner = "client!fga", name = "N", descriptor = "I")
    private int field3694 = 0;

    @OriginalMember(owner = "client!fga", name = "U", descriptor = "I")
    private int field3701 = 0;

    @OriginalMember(owner = "client!fga", name = "R", descriptor = "Lju;")
    public static class102 field3698 = new class102(15, 3);

    @OriginalMember(owner = "client!fga", name = "T", descriptor = "Lju;")
    public static class102 field3700 = new class102(83, 4);

    @OriginalMember(owner = "client!fga", name = "H", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!fga", name = "I", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!fga", name = "J", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!fga", name = "K", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!fga", name = "L", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!fga", name = "M", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!fga", name = "O", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!fga", name = "Q", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!fga", name = "S", descriptor = "Lge;")
    public static class405 field3699;

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V", line = 5)
    public class275() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIBI)V", line = 8)
    public static final void method1665(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field3689;
        int var5 = -124 / ((arg3 - -31) / 46);
        class118 var6 = class126.method814(true, arg2, 10);
        var6.method771(-30559);
        var6.field1634 = arg0;
        var6.field1629 = arg1;
        var6.field1636 = arg4;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)[I", line = 24)
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != 255) {
            field3698 = null;
        }
        ++field3688;
        int[] var3 = super.field10407.method3873(arg1 + -255, arg0);
        if (super.field10407.field9527) {
            int var4 = class370.field4727[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class424.field5889; ++var6) {
                int var7 = class237.field3298[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field3694 == 0) {
                    var9 = (-var4 + var7) * this.field3696;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3696 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field3701 != 0) {
                    if (this.field3701 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class510.field7112[(var12 & 4095) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "(I)V", line = 94)
    public static final void method1666(int arg0) {
        ++field3691;
        class464.method2772(arg0 ^ -4408);
        if (arg0 != 2) {
            method1667(-63);
        }
    }

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "(I)V", line = 105)
    public static void method1667(int arg0) {
        if (arg0 != 2048) {
            field3700 = null;
        }
        field3698 = null;
        field3699 = null;
        field3700 = null;
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(II)I", line = 117)
    public static final int method1668(int arg0, int arg1) {
        ++field3695;
        int var2 = (-715827883 & arg1 >>> 1) + (1431655765 & arg1);
        int var3 = (-214748365 & var2 >>> 2) + (858993459 & var2);
        int var4 = (var3 >>> 4) + var3 & 252645135;
        if (arg0 != -1706255295) {
            field3698 = null;
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return 255 & var6;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIIII)Z", line = 133)
    public static final boolean method1669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 4096) {
            method1666(24);
        }
        ++field3692;
        if (arg3 < arg7 + arg8 && arg1 + arg3 > arg8) {
            return arg0 < arg4 + arg6 && ~arg4 > ~(arg0 + arg5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V", line = 155)
    public final void method23(byte arg0) {
        if (arg0 != 67) {
            method1667(116);
        }
        class503.method3003((byte) 117);
        ++field3697;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZLvj;)V", line = 166)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field3693;
        if (arg1) {
            this.method23((byte) -105);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field3696 = arg2.method194((byte) 119);
                }
            } else {
                this.field3701 = arg2.method194((byte) 119);
            }
        } else {
            this.field3694 = arg2.method194((byte) 119);
        }
    }

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "(II)Z", line = 215)
    public static final boolean method1670(int arg0, int arg1) {
        if (arg0 != -97) {
            return true;
        } else {
            ++field3690;
            return ~arg1 == -8 || ~arg1 == -9 || ~arg1 == -10;
        }
    }
}
