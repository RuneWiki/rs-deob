import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class80 extends class8 {

    @OriginalMember(owner = "client!nc", name = "bd", descriptor = "Lpd;")
    private static class94 field2035 = class28.method249(91, "Please use a different world)3");

    @OriginalMember(owner = "client!nc", name = "fd", descriptor = "Lpd;")
    public static class94 field2039 = field2035;

    @OriginalMember(owner = "client!nc", name = "od", descriptor = "I")
    public static int field2048 = 0;

    @OriginalMember(owner = "client!nc", name = "md", descriptor = "Lpd;")
    public static class94 field2046 = class28.method249(80, "blinken2:");

    @OriginalMember(owner = "client!nc", name = "td", descriptor = "I")
    public static int field2053 = 0;

    @OriginalMember(owner = "client!nc", name = "sd", descriptor = "Lpd;")
    public static class94 field2052 = class28.method249(-53, "M");

    @OriginalMember(owner = "client!nc", name = "nd", descriptor = "Lpd;")
    public static class94 field2047 = class28.method249(116, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!nc", name = "ud", descriptor = "I")
    public static int field2054 = 0;

    @OriginalMember(owner = "client!nc", name = "wd", descriptor = "I")
    public static int field2056 = -1;

    @OriginalMember(owner = "client!nc", name = "qd", descriptor = "I")
    public static int field2050 = 0;

    @OriginalMember(owner = "client!nc", name = "Xc", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!nc", name = "Zc", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!nc", name = "ad", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!nc", name = "cd", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!nc", name = "ed", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!nc", name = "gd", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!nc", name = "hd", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!nc", name = "jd", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!nc", name = "pd", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!nc", name = "rd", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!nc", name = "vd", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!nc", name = "dd", descriptor = "Lse;")
    public class113 field2037;

    @OriginalMember(owner = "client!nc", name = "ld", descriptor = "Lad;")
    public static class5 field2045;

    @OriginalMember(owner = "client!nc", name = "Yc", descriptor = "Lmb;")
    public static class73 field2032;

    @OriginalMember(owner = "client!nc", name = "kd", descriptor = "Loe;")
    public static class89 field2044;

    @OriginalMember(owner = "client!nc", name = "id", descriptor = "[Lad;")
    public static class5[] field2042;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ldd;Z)V", line = 5)
    public static final void method596(class23 arg0, boolean arg1) {
        class110.field2755 = arg0;
        ++field2043;
        if (arg1) {
            field2042 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method597(int arg0, int arg1, int arg2) {
        if (arg1 != -4) {
            field2047 = null;
        }
        ++field2041;
        if (~arg0 == -1 && ~class40.field1031 == ~arg2) {
            return true;
        } else if (~arg0 == -2 && ~class102.field2584 == ~arg2) {
            return true;
        } else {
            return (~arg0 == -3 || ~arg0 == -4) && ~class126.field3176 == ~arg2;
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V", line = 45)
    public static void method598(int arg0) {
        field2045 = null;
        if (arg0 != 64) {
            field2053 = 43;
        }
        field2032 = null;
        field2046 = null;
        field2047 = null;
        field2035 = null;
        field2052 = null;
        field2044 = null;
        field2039 = null;
        field2042 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([Lod;II[BIIIIII)V", line = 73)
    public static final void method599(class88[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2049;
        for (int var10 = 0; var10 < 8; ++var10) {
            for (int var15 = 0; ~var15 > -9; ++var15) {
                if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg7 + var15 > 0 && arg7 - -var15 < 103) {
                    arg0[arg6].field2269[arg2 + var10][arg7 + var15] = class81.method605(arg0[arg6].field2269[arg2 + var10][arg7 + var15], -16777217);
                }
            }
        }
        class122 var11 = new class122(arg3);
        if (arg8 != 8) {
            field2044 = null;
        }
        for (int var12 = 0; ~var12 > -5; ++var12) {
            for (int var13 = 0; var13 < 64; ++var13) {
                for (int var14 = 0; var14 < 64; ++var14) {
                    if (arg9 == var12 && ~var13 <= ~arg4 && arg4 + 8 > var13 && ~var14 <= ~arg5 && arg5 - -8 > var14) {
                        class23.method169((byte) -128, var11, 0, arg1, arg6, client.method138((byte) -4, 7 & var13, var14 & 7, arg1) + arg2, arg7 - -class135.method1064(7, 7 & var13, 7 & var14, arg1), 0);
                    } else {
                        class23.method169((byte) -127, var11, 0, 0, 0, -1, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)Z", line = 135)
    public final boolean method48(byte arg0) {
        if (arg0 >= -114) {
            field2048 = 49;
        }
        ++field2031;
        return this.field2037 != null;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)Lia;", line = 169)
    public final class48 method77(int arg0) {
        ++field2055;
        if (this.field2037 == null) {
            return null;
        } else {
            class57 var2 = ~super.field210 != 0 && super.field192 == 0 ? class70.method519(5, super.field210) : null;
            class57 var3 = ~super.field216 == 0 || super.field216 == super.field158 && var2 != null ? null : class70.method519(5, super.field216);
            class48 var4 = this.field2037.method845((byte) -63, super.field176, var3, var2, super.field180);
            if (var4 == null) {
                return null;
            } else {
                var4.method354();
                if (arg0 != 1536) {
                    return null;
                } else {
                    super.field183 = var4.field297;
                    if (super.field190 != -1 && super.field211 != -1) {
                        class48 var5 = class41.method309(13, super.field190).method627(arg0 ^ -11078, super.field211);
                        if (var5 != null) {
                            class48[] var6 = new class48[] { var4, var5 };
                            var5.method374(0, -super.field169, 0);
                            var4 = new class48(var6, 2, true);
                        }
                    }
                    if (~this.field2037.field2854 == -2) {
                        var4.field1165 = true;
                    }
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V", line = 225)
    public static final void method600(int arg0) {
        class33.field917.method1013(-1);
        ++field2051;
        class12.field302.method1013(~arg0);
        class50.field1233.method1013(-1);
        class8.field170.method1013(-1);
        if (arg0 != 0) {
            field2050 = 50;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lbb;I)V", line = 254)
    public static final void method601(class8 arg0, int arg1) {
        ++field2040;
        int var2 = arg0.field208 - class26.field699;
        int var3 = arg0.field195 * 128 - -(arg0.field207 * 64);
        arg0.field172 = 0;
        if (arg0.field196 == 0) {
            arg0.field167 = 1024;
        }
        if (arg0.field196 == 1) {
            arg0.field167 = 1536;
        }
        if (arg0.field196 == 2) {
            arg0.field167 = 0;
        }
        if (~arg0.field196 == arg1) {
            arg0.field167 = 512;
        }
        arg0.field177 += (-arg0.field177 + var3) / var2;
        int var4 = arg0.field217 * 128 + arg0.field207 * 64;
        arg0.field222 += (-arg0.field222 + var4) / var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLs;)V", line = 285)
    public static final void method602(byte arg0, class111 arg1) {
        if (arg0 < 57) {
            field2047 = null;
        }
        ++field2038;
        class79.field2029 = arg1;
    }
}
