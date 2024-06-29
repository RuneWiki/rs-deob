import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class75 extends class143 implements class265 {

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "Lth;")
    public class354 field829;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "Z")
    private boolean field840;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Ljava/lang/String;")
    public static String field825 = null;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field832 = -1;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field841 = 0;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field833 = -1;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field834 = 255;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "Lwq;")
    public static class93 field835;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 4)
    public final void method207(byte arg0) {
        ++field824;
        if (arg0 != 111) {
            this.method210(-72);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLen;)V", line = 16)
    public final void method212(byte arg0, class174 arg1) {
        if (arg0 >= -29) {
            this.method214(49);
        }
        this.field829.method2253(false, arg1);
        ++field842;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILen;)Lir;", line = 27)
    public final class19 method213(int arg0, class174 arg1) {
        if (arg0 > -5) {
            this.method213(-74, (class174) null);
        }
        ++field830;
        class393 var3 = this.field829.method2261(super.field2021, true, arg1, false, super.field2018, (byte) -124, 1024);
        if (var3 == null) {
            return null;
        } else {
            class71 var4 = arg1.method1015();
            var4.method123(super.field2030 + super.field2018, super.field2015, super.field2025 + super.field2021);
            class19 var5 = null;
            if (this.field840) {
                var5 = class358.method2286(true, 1);
            }
            if (this.field829.field5163 == null) {
                var3.method775(var4, var5 == null ? null : var5.field197[0], 0);
            } else {
                class271 var6 = this.field829.field5163.method2492();
                arg1.method964(var3, var6, var4, var5 != null ? var5.field197[0] : null, 0);
            }
            this.field829.method2258(super.field2018 >> 7, super.field2018 >> 7, super.field2021 >> 7, true, (byte) 127, arg1, super.field2021 >> 7, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V", line = 64)
    public static void method430(byte arg0) {
        field835 = null;
        if (arg0 != -36) {
            field834 = -69;
        }
        field825 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Len;B)V", line = 76)
    public final void method226(class174 arg0, byte arg1) {
        if (arg1 >= 88) {
            ++field836;
            this.field829.method2257(arg0, -29617);
        }
    }

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)I", line = 91)
    public final int method431(int arg0) {
        ++field837;
        if (arg0 <= 23) {
            field832 = -12;
        }
        return this.field829.method2260(11);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I", line = 102)
    public final int method225(int arg0) {
        if (arg0 <= 66) {
            return 67;
        } else {
            ++field826;
            return this.field829.field5180;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)I", line = 114)
    public final int method214(int arg0) {
        if (arg0 > -95) {
            this.method214(109);
        }
        ++field839;
        return this.field829.field5174;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Len;Lnl;IIIIIIIZIIII)V", line = 125)
    public class75(class174 arg0, class327 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class261.method1643(arg2, arg3, 2));
        this.field829 = new class354(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field840 = ~arg1.field4677 != -1;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)I", line = 134)
    public final int method210(int arg0) {
        ++field828;
        return arg0 != -23890 ? -85 : this.field829.field5178;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILen;)Lmj;", line = 147)
    public final class393 method209(byte arg0, int arg1, class174 arg2) {
        if (arg0 != 58) {
            field835 = null;
        }
        ++field823;
        return this.field829.method2261(0, false, arg2, false, 0, (byte) -128, arg1);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZLen;)Z", line = 161)
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        ++field838;
        class393 var5 = this.field829.method2261(super.field2021, false, arg3, false, super.field2018, (byte) -127, 65536);
        if (var5 == null) {
            return false;
        } else {
            class71 var6 = arg3.method1015();
            var6.method123(super.field2030 + super.field2018, super.field2015, super.field2025 + super.field2021);
            if (!arg2) {
                this.method207((byte) -123);
            }
            return var5.method724(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Len;I)V", line = 183)
    public final void method211(class174 arg0, int arg1) {
        ++field827;
        if (arg1 != 0) {
            field825 = null;
        }
        class393 var3 = this.field829.method2261(super.field2021, true, arg0, false, super.field2018, (byte) -111, 131072);
        if (var3 != null) {
            this.field829.method2258(super.field2018 >> 7, super.field2018 >> 7, super.field2021 >> 7, false, (byte) 123, arg0, super.field2021 >> 7, var3);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z", line = 203)
    public final boolean method215(int arg0) {
        if (arg0 >= -92) {
            return false;
        } else {
            ++field831;
            return this.field829.method2259(97);
        }
    }
}
