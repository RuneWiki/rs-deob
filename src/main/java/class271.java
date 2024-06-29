import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class271 extends class436 {

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    private int field3699 = -1;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "Lbr;")
    public static class223 field3700 = new class223(8);

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "[I")
    public static int[] field3703 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public int field3691;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "Lqj;")
    public static class296 field3704;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "[I")
    public int[] field3694;

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 9)
    public class271() {
        super(0, false);
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)Z", line = 15)
    public final boolean method1663(byte arg0) {
        if (arg0 != 26) {
            field3704 = null;
        }
        ++field3697;
        if (this.field3694 != null) {
            return true;
        } else if (this.field3699 >= 0) {
            class18 var2 = ~class198.field2739 > -1 ? class18.method118(class182.field2541, this.field3699) : class18.method119(class182.field2541, class198.field2739, this.field3699);
            var2.method110();
            this.field3694 = var2.method113();
            this.field3691 = var2.field247;
            this.field3696 = var2.field242;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 41)
    public static final void method1664(String arg0, byte arg1) {
        class441.field6390 = arg0;
        ++field3692;
        if (class204.field2772.field4888 != null) {
            try {
                String var2 = class204.field2772.field4888.getParameter("cookieprefix");
                String var3 = class204.field2772.field4888.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg0.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class378.method2469(class224.method1425(-26805) + 94608000000L, 10) + "; Max-Age=" + 94608000L;
                }
                class274.method1685(class204.field2772.field4888, "document.cookie=\"" + var5 + "\"", (byte) 87);
                int var6 = 44 % ((arg1 - 28) / 43);
            } catch (Throwable var7) {
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILeb;)V", line = 74)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 == 34) {
            ++field3689;
            if (arg1 == 0) {
                this.field3699 = arg2.method2403((byte) 74);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 88)
    public static final int method1665(int arg0, String arg1, int arg2) {
        ++field3701;
        return arg2 != 10062 ? 114 : class79.method562(arg1, true, arg0, 114);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIBIIII)V", line = 99)
    public static final void method1666(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3690;
        int var7 = arg1 - arg6;
        int var8 = arg3 + arg6;
        for (int var9 = arg3; var8 > var9; ++var9) {
            class73.method486(arg4, class84.field1286[var9], arg5, -4, arg0);
        }
        int var10 = arg4 + arg6;
        for (int var11 = arg1; var11 > var7; --var11) {
            class73.method486(arg4, class84.field1286[var11], arg5, 68, arg0);
        }
        int var12 = -arg6 + arg0;
        if (arg2 > -53) {
            method1664((String) null, (byte) -74);
        }
        for (int var13 = var8; ~var7 <= ~var13; ++var13) {
            int[] var14 = class84.field1286[var13];
            class73.method486(arg4, var14, arg5, -94, var10);
            class73.method486(var12, var14, arg5, 100, arg0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)I", line = 150)
    public final int method1667(int arg0) {
        ++field3698;
        return arg0 != -1 ? 38 : this.field3699;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V", line = 162)
    public final void method1668(int arg0) {
        super.method1668(arg0);
        ++field3693;
        this.field3694 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 173)
    public static void method1669(boolean arg0) {
        field3700 = null;
        field3704 = null;
        field3703 = null;
        if (arg0) {
            method1666(15, -35, (byte) -36, 23, -3, 49, 40);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[[I", line = 190)
    public int[][] method85(int arg0, int arg1) {
        ++field3702;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950 && this.method1663((byte) 26)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field3691 * (class123.field1728 == this.field3696 ? arg1 : this.field3696 * arg1 / class123.field1728);
            if (class43.field653 != this.field3691) {
                for (int var8 = 0; ~var8 > ~class43.field653; ++var8) {
                    int var9 = this.field3691 * var8 / class43.field653;
                    int var10 = this.field3694[var7 + var9];
                    var6[var8] = class318.method2028(4080, var10 << 4);
                    var5[var8] = class318.method2028(4080, var10 >> 4);
                    var4[var8] = class318.method2028(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class43.field653; ++var11) {
                    int var12 = this.field3694[var7++];
                    var6[var11] = class318.method2028(255, var12) << 4;
                    var5[var11] = class318.method2028(65280, var12) >> 4;
                    var4[var11] = class318.method2028(var12 >> 12, 4080);
                }
            }
        }
        if (arg0 != -13348) {
            this.method18(-82, 107, (class371) null);
        }
        return var3;
    }
}
