import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class286 extends class194 {

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    private int field3763 = -1;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field3774 = 0;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public int field3775;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "[I")
    public int[] field3773;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "[Lc;")
    public static class436[] field3766;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 3)
    public static void method1824(boolean arg0) {
        field3766 = null;
        if (!arg0) {
            field3766 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V", line = 13)
    public final void method1206(int arg0) {
        ++field3768;
        super.method1206(arg0);
        if (arg0 == 11097) {
            this.field3773 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBIIIII)V", line = 27)
    public static final void method1825(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~class295.field3937 >= ~arg0 && class427.field5844 >= arg6 && class53.field624 <= arg3 && ~arg5 >= ~class118.field1356) {
            if (~arg4 == -2) {
                class167.method1066(arg5, (byte) 86, arg3, arg2, arg0, arg6);
            } else {
                class356.method2254(-18176, arg0, arg4, arg3, arg2, arg5, arg6);
            }
        } else if (~arg4 != -2) {
            class51.method290(arg6, (byte) -59, arg2, arg4, arg5, arg0, arg3);
        } else {
            class249.method1623(arg0, arg6, arg2, 0, arg5, arg3);
        }
        if (arg1 >= 30) {
            ++field3762;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)Ljava/lang/String;", line = 58)
    public static final String method1826(int arg0, int arg1) {
        ++field3772;
        String var2 = Integer.toString(arg0);
        if (arg1 != -10) {
            method1824(false);
        }
        for (int var3 = -3 + var2.length(); var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (~var2.length() < -10) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class394.field5364.method434(class373.field5057, -8192) + " (" + var2 + ")</col>";
        } else {
            return ~var2.length() < -7 ? " <col=ffffff>" + var2.substring(0, var2.length() + -4) + class194.field2291.method434(class373.field5057, -8192) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[[I", line = 88)
    public int[][] method59(int arg0, int arg1) {
        ++field3769;
        if (arg0 != -730) {
            method1825(-42, (byte) 75, 105, -93, 112, -56, -90);
        }
        int[][] var3 = super.field2283.method1667(arg1, -127);
        if (super.field2283.field3451 && this.method1828(-70)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class250.field3286 != this.field3775 ? this.field3775 * arg1 / class250.field3286 : arg1) * this.field3764;
            if (~class138.field1579 == ~this.field3764) {
                for (int var8 = 0; class138.field1579 > var8; ++var8) {
                    int var9 = this.field3773[var7++];
                    var6[var8] = class191.method1183(var9 << 4, 4080);
                    var5[var8] = class191.method1183(var9 >> 4, 4080);
                    var4[var8] = class191.method1183(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class138.field1579; ++var10) {
                    int var11 = this.field3764 * var10 / class138.field1579;
                    int var12 = this.field3773[var7 + var11];
                    var6[var10] = class191.method1183(4080, var12 << 4);
                    var5[var10] = class191.method1183(65280, var12) >> 4;
                    var4[var10] = class191.method1183(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I", line = 158)
    public final int method1197(int arg0) {
        ++field3765;
        if (arg0 != 0) {
            field3776 = -6;
        }
        return this.field3763;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 191)
    public class286() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILbg;)V", line = 177)
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = -115 / ((arg1 - 52) / 61);
        ++field3767;
        if (~arg0 == -1) {
            this.field3763 = arg2.method1587((byte) -102);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIII)V", line = 194)
    public static final void method1827(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= arg2) {
            class384.method2394(arg1, 112, class228.field2877[arg4], arg2, arg3);
        } else {
            class384.method2394(arg1, 100, class228.field2877[arg4], arg3, arg2);
        }
        if (arg0) {
            method1825(-56, (byte) 124, -39, 34, 111, 14, 65);
        }
        ++field3771;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)Z", line = 217)
    public final boolean method1828(int arg0) {
        int var2 = -105 / ((arg0 - 63) / 54);
        ++field3770;
        if (this.field3773 != null) {
            return true;
        } else if (this.field3763 >= 0) {
            class132 var3 = class451.field6306 < 0 ? class132.method855(class96.field1135, this.field3763) : class132.method849(class96.field1135, class451.field6306, this.field3763);
            var3.method862();
            this.field3773 = var3.method858();
            this.field3764 = var3.field1507;
            this.field3775 = var3.field1509;
            return true;
        } else {
            return false;
        }
    }
}
