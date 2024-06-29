import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class435 extends class314 {

    @OriginalMember(owner = "client!so", name = "X", descriptor = "I")
    private int field6625 = -1;

    @OriginalMember(owner = "client!so", name = "L", descriptor = "Lrl;")
    public static class672 field6614 = new class672(39, 5);

    @OriginalMember(owner = "client!so", name = "V", descriptor = "[I")
    public static int[] field6623 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!so", name = "T", descriptor = "Lrl;")
    public static class672 field6621 = new class672(19, 6);

    @OriginalMember(owner = "client!so", name = "M", descriptor = "F")
    public static float field6615;

    @OriginalMember(owner = "client!so", name = "O", descriptor = "I")
    public int field6616;

    @OriginalMember(owner = "client!so", name = "P", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!so", name = "Q", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!so", name = "R", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!so", name = "S", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!so", name = "W", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!so", name = "Y", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!so", name = "Z", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!so", name = "ab", descriptor = "I")
    public int field6628;

    @OriginalMember(owner = "client!so", name = "U", descriptor = "[I")
    public int[] field6622;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "(I)Z", line = 4)
    public final boolean method2764(int arg0) {
        if (arg0 > -47) {
            field6623 = null;
        }
        ++field6617;
        if (this.field6622 != null) {
            return true;
        } else if (~this.field6625 <= -1) {
            class284 var2 = ~class550.field7993 > -1 ? class284.method2029(class126.field2069, this.field6625) : class284.method2027(class126.field2069, class550.field7993, this.field6625);
            var2.method2017();
            this.field6622 = var2.method2030();
            this.field6628 = var2.field4535;
            this.field6616 = var2.field4537;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)I", line = 32)
    public final int method2145(int arg0) {
        ++field6626;
        int var2 = 35 % ((4 - arg0) / 48);
        return this.field6625;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)[[I", line = 42)
    public int[][] method4(int arg0, byte arg1) {
        ++field6620;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (arg1 < 68) {
            this.method4(14, (byte) -108);
        }
        if (super.field4931.field2799 && this.method2764(-72)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class246.field3926 != ~this.field6616 ? this.field6616 * arg0 / class246.field3926 : arg0) * this.field6628;
            if (~class81.field1009 == ~this.field6628) {
                for (int var8 = 0; ~class81.field1009 < ~var8; ++var8) {
                    int var9 = this.field6622[var7++];
                    var6[var8] = class453.method2846(var9 << 4, 4080);
                    var5[var8] = class453.method2846(4080, var9 >> 4);
                    var4[var8] = class453.method2846(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class81.field1009; ++var10) {
                    int var11 = this.field6628 * var10 / class81.field1009;
                    int var12 = this.field6622[var7 - -var11];
                    var6[var10] = class453.method2846(var12 << 4, 4080);
                    var5[var10] = class453.method2846(var12 >> 4, 4080);
                    var4[var10] = class453.method2846(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLie;I)V", line = 111)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field6627;
        if (arg0 <= -1) {
            if (~arg2 == -1) {
                this.field6625 = arg1.method67(12021);
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIBII)V", line = 126)
    public static final void method2765(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class424.field6447 == 1) {
            class330.field5109[class165.field2772 / 100].method3960(class234.field3713 - 8, class618.field8747 - 8);
        }
        ++field6624;
        if (~class424.field6447 == -3) {
            class330.field5109[class165.field2772 / 100 + 4].method3960(class234.field3713 + -8, class618.field8747 - 8);
        }
        class530.method3207(-102);
        if (arg2 != -55) {
            method2767('>', false, -126);
        }
    }

    @OriginalMember(owner = "client!so", name = "i", descriptor = "(I)V", line = 148)
    public static void method2766(int arg0) {
        if (arg0 > 60) {
            field6621 = null;
            field6614 = null;
            field6623 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V", line = 170)
    public class435() {
        super(0, false);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 174)
    public final void method2141(int arg0) {
        ++field6618;
        super.method2141(arg0);
        this.field6622 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(CZI)C", line = 189)
    public static final char method2767(char arg0, boolean arg1, int arg2) {
        ++field6619;
        if (~arg0 <= -193 && arg0 <= 255) {
            if (~arg0 <= -193 && ~arg0 >= -199) {
                return 'A';
            }
            if (~arg0 == -200) {
                return 'C';
            }
            if (~arg0 <= -201 && ~arg0 >= -204) {
                return 'E';
            }
            if (arg0 >= 204 && ~arg0 >= -208) {
                return 'I';
            }
            if (~arg0 <= -211 && arg0 <= 214) {
                return 'O';
            }
            if (~arg0 <= -218 && ~arg0 >= -221) {
                return 'U';
            }
            if (~arg0 == -222) {
                return 'Y';
            }
            if (~arg0 == -224) {
                return 's';
            }
            if (~arg0 <= -225 && arg0 <= 230) {
                return 'a';
            }
            if (~arg0 == -232) {
                return 'c';
            }
            if (~arg0 <= -233 && ~arg0 >= -236) {
                return 'e';
            }
            if (~arg0 <= -237 && ~arg0 >= -240) {
                return 'i';
            }
            if (arg0 >= 242 && arg0 <= 246) {
                return 'o';
            }
            if (arg0 >= 249 && ~arg0 >= -253) {
                return 'u';
            }
            if (~arg0 == -254 || ~arg0 == -256) {
                return 'y';
            }
        }
        if (~arg0 == -339) {
            return 'O';
        } else if (~arg0 == -340) {
            return 'o';
        } else {
            if (arg1) {
                method2765(-101, 14, (byte) -1, 34, -81);
            }
            if (~arg0 == -377) {
                return 'Y';
            } else {
                return arg0;
            }
        }
    }
}
