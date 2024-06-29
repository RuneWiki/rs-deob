import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class272 extends class145 {

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    private int field3655 = -1;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static volatile int field3653 = -1;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "[I")
    public int[] field3658;

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 9)
    public class272() {
        super(0, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lap;BI)V", line = 12)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field3655 = arg0.method1853(-83);
        }
        ++field3650;
        int var4 = -58 / ((11 - arg1) / 52);
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)Z", line = 25)
    public final boolean method1739(int arg0) {
        ++field3656;
        if (arg0 != 4080) {
            method1740(-105, (class427) null, (class391) null, (class427) null);
        }
        if (this.field3658 != null) {
            return true;
        } else if (~this.field3655 <= -1) {
            class214 var2 = ~class390.field5478 <= -1 ? class214.method1459(class7.field45, class390.field5478, this.field3655) : class214.method1456(class7.field45, this.field3655);
            var2.method1457();
            this.field3658 = var2.method1458();
            this.field3654 = var2.field2974;
            this.field3648 = var2.field2973;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILrk;Lpe;Lrk;)V", line = 50)
    public static final void method1740(int arg0, class427 arg1, class391 arg2, class427 arg3) {
        class138.field1946 = class77.method667(0, (byte) -28, arg1, class14.field107);
        ++field3649;
        class43.field650 = arg2.method89(class138.field1946, class214.method1455(arg3, class14.field107, 0), true);
        class442.field6362 = class77.method667(0, (byte) 109, arg1, class398.field5563);
        class22.field414 = arg2.method89(class442.field6362, class214.method1455(arg3, class398.field5563, 0), true);
        if (arg0 > -113) {
            method1741(74, -105, 28);
        }
        class19.field375 = class77.method667(0, (byte) 126, arg1, class128.field1805);
        class96.field1387 = arg2.method89(class19.field375, class214.method1455(arg3, class128.field1805, 0), true);
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(III)Z", line = 68)
    public static final boolean method1741(int arg0, int arg1, int arg2) {
        ++field3652;
        return ~(2 & class7.field57[1][arg2][arg0]) != arg1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[[I", line = 81)
    public int[][] method4(boolean arg0, int arg1) {
        ++field3662;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771 && this.method1739(4080)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class81.field1209 == this.field3654 ? arg1 : this.field3654 * arg1 / class81.field1209) * this.field3648;
            if (class156.field2364 == this.field3648) {
                for (int var8 = 0; class156.field2364 > var8; ++var8) {
                    int var9 = this.field3658[var7++];
                    var6[var8] = class323.method2059(4080, var9 << 4);
                    var5[var8] = class323.method2059(var9, 65280) >> 4;
                    var4[var8] = class323.method2059(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class156.field2364; ++var10) {
                    int var11 = this.field3648 * var10 / class156.field2364;
                    int var12 = this.field3658[var7 + var11];
                    var6[var10] = class323.method2059(var12, 255) << 4;
                    var5[var10] = class323.method2059(var12 >> 4, 4080);
                    var4[var10] = class323.method2059(16711680, var12) >> 12;
                }
            }
        }
        if (!arg0) {
            this.field3654 = -7;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V", line = 152)
    public final void method1118(byte arg0) {
        ++field3660;
        super.method1118(arg0);
        this.field3658 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBZ)Ljava/lang/String;", line = 173)
    public static final String method1742(int arg0, byte arg1, boolean arg2) {
        if (arg1 != -6) {
            method1741(-123, 26, -60);
        }
        ++field3659;
        return arg2 && arg0 >= 0 ? class139.method1093(true, 10, arg2, arg0) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I", line = 189)
    public final int method1120(int arg0) {
        ++field3657;
        return arg0 != 3 ? -83 : this.field3655;
    }
}
