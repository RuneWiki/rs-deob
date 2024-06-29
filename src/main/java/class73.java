import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class73 extends class366 {

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    private int field879;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "[I")
    public static int[] field880 = new int[1000];

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "[I")
    public static int[] field881 = new int[50];

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public static int field890 = 0;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIZ)V")
    public final void method370(int arg0, int arg1, boolean arg2) {
        ++field891;
        int var4 = this.field889 * arg0 >> 12;
        if (arg2) {
            int var5 = this.field885 * arg0 >> 12;
            int var6 = this.field888 * arg1 >> 12;
            int var7 = this.field879 * arg1 >> 12;
            class112.method540(super.field5239, var7, super.field5242, var5, var6, (byte) -32, super.field5241, var4);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIZIIII)V")
    public static final void method371(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        class192.method1049((byte) 116, 0, arg6, arg3, arg8, arg2, arg7, arg1, arg0, arg5);
        if (!arg4) {
            method377((String) null, -64);
        }
        ++field886;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "([Lab;II)V")
    public static final void method372(class256[] arg0, int arg1, int arg2) {
        if (arg1 <= 30) {
            field881 = null;
        }
        for (int var3 = 0; arg0.length > var3; ++var3) {
            class256 var4 = arg0[var3];
            if (var4 != null && var4.field3646 == arg2 && !client.method1675(var4)) {
                if (var4.field3654 == 0) {
                    method372(arg0, 107, var4.field3659);
                    if (var4.field3643 != null) {
                        method372(var4.field3643, 69, var4.field3659);
                    }
                    class68 var5 = (class68) class369.field5270.method233(107, (long) var4.field3659);
                    if (var5 != null) {
                        class258.method1586(var5.field850, -24134);
                    }
                }
                if (var4.field3654 == 6 && ~var4.field3572 != 0) {
                    class207 var6 = class175.field2103.method1267(-91, var4.field3572);
                    if (var6 != null) {
                        var4.field3696 += class263.field3805;
                        while (~var4.field3696 < ~var6.field2843[var4.field3639]) {
                            var4.field3696 -= var6.field2843[var4.field3639];
                            ++var4.field3639;
                            if (~var6.field2853.length >= ~var4.field3639) {
                                var4.field3639 -= var6.field2864;
                                if (var4.field3639 < 0 || var6.field2853.length <= var4.field3639) {
                                    var4.field3639 = 0;
                                }
                            }
                            var4.field3637 = var4.field3639 - -1;
                            if (var6.field2853.length <= var4.field3637) {
                                var4.field3637 -= var6.field2864;
                                if (~var4.field3637 > -1 || ~var4.field3637 <= ~var6.field2853.length) {
                                    var4.field3637 = -1;
                                }
                            }
                            class398.method2383(var4, 69);
                        }
                    }
                }
            }
        }
        ++field883;
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
    public static void method373(int arg0) {
        field880 = null;
        field881 = null;
        if (arg0 != 28127) {
            method377((String) null, -98);
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(IIIIIII)V")
    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field888 = arg1;
        this.field879 = arg3;
        this.field889 = arg0;
        this.field885 = arg2;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)V")
    public final void method374(boolean arg0, int arg1, int arg2) {
        ++field887;
        int var4 = this.field889 * arg2 >> 12;
        if (arg0) {
            this.method375((byte) 86, -39, 48);
        }
        int var5 = this.field885 * arg2 >> 12;
        int var6 = this.field888 * arg1 >> 12;
        int var7 = this.field879 * arg1 >> 12;
        class450.method2637(super.field5239, var4, var7, var6, (byte) -73, var5, super.field5241);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BII)V")
    public final void method375(byte arg0, int arg1, int arg2) {
        ++field882;
        if (arg0 <= 44) {
            method372((class256[]) null, 4, 110);
        }
        int var4 = this.field889 * arg1 >> 12;
        int var5 = this.field885 * arg1 >> 12;
        int var6 = this.field888 * arg2 >> 12;
        int var7 = this.field879 * arg2 >> 12;
        class349.method2112(var7, super.field5242, var4, 0, var5, var6);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIII)V")
    public static final void method376(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field878;
        if (~class75.field912 >= ~(-arg2 + arg4) && ~class453.field6396 <= ~(arg2 + arg4) && ~(-arg2 + arg0) <= ~class357.field5123 && ~(arg0 + arg2) >= ~class328.field4729) {
            class379.method2268(arg4, arg0, arg3, arg2, (byte) 119);
        } else {
            class260.method1594(arg0, arg4, arg2, arg3, -82);
        }
        if (arg1 != -20535) {
            field881 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method377(String arg0, int arg1) {
        ++field884;
        String var2 = class63.method323(class41.method207(0, arg0), -42);
        if (var2 == null) {
            var2 = "";
        }
        return arg1 != -4941 ? null : var2;
    }
}
