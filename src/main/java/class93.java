import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class93 extends class137 {

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    private final int field1887;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    private final int field1885;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    private final int field1876;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    private final int field1879;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "Ljd;")
    private static class86 field1878 = class122.method868("K", true);

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "Ljd;")
    public static class86 field1883 = null;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Ljd;")
    public static class86 field1875 = field1878;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "Ljd;")
    public static class86 field1880 = field1878;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "Ljd;")
    public static class86 field1889 = class122.method868("Speicher wird zugewiesen)3", true);

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V")
    public final void method467(int arg0, int arg1, byte arg2) {
        ++field1881;
        int var4 = this.field1876 * arg0 >> 12;
        int var5 = this.field1885 * arg0 >> 12;
        int var6 = -19 / ((arg2 - 77) / 46);
        int var7 = this.field1879 * arg1 >> 12;
        int var8 = this.field1887 * arg1 >> 12;
        class9.method79(-18170, var8, super.field2613, super.field2619, var7, var4, var5);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIII)V")
    public class93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1887 = arg1;
        this.field1885 = arg2;
        this.field1876 = arg0;
        this.field1879 = arg3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
    public final void method471(int arg0, int arg1, int arg2) {
        if (arg1 == 9) {
            int var4 = this.field1885 * arg0 >> 12;
            ++field1886;
            int var5 = this.field1879 * arg2 >> 12;
            int var6 = this.field1887 * arg2 >> 12;
            int var7 = this.field1876 * arg0 >> 12;
            class187.method1287(var4, var7, var6, (byte) 123, super.field2617, var5);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public static void method685(byte arg0) {
        field1875 = null;
        field1878 = null;
        if (arg0 > 49) {
            field1889 = null;
            field1880 = null;
            field1883 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
    public static final void method686(byte arg0) {
        ++field1882;
        if (class88.field1769 > class202.field3658) {
            class202.field3658 = (float) ((double) class202.field3658 / 30.0D + (double) class202.field3658);
            if (class88.field1769 < class202.field3658) {
                class202.field3658 = class88.field1769;
            }
            class188.method1293(arg0 ^ 107);
        } else if (class202.field3658 > class88.field1769) {
            class202.field3658 = (float) ((double) class202.field3658 - (double) class202.field3658 / 30.0D);
            if (class202.field3658 < class88.field1769) {
                class202.field3658 = class88.field1769;
            }
            class188.method1293(arg0 ^ -119);
        }
        if (class51.field1074 != -1 && class152.field2875 != -1) {
            int var1 = -class156.field2952 + class152.field2875;
            int var2 = -class274.field4814 + class51.field1074;
            if (~var2 > -3 || var2 > 2) {
                var2 >>= 4;
            }
            class274.field4814 += var2;
            if (var1 < 2 || ~var1 < -3) {
                var1 >>= 4;
            }
            if (~var2 == -1 && ~var1 == -1) {
                class51.field1074 = -1;
                class152.field2875 = -1;
            }
            class156.field2952 += var1;
            class188.method1293(-118);
        }
        if (arg0 != -45) {
            method685((byte) -103);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)V")
    public final void method468(int arg0, int arg1, int arg2) {
        int var4 = this.field1876 * arg0 >> 12;
        int var5 = this.field1885 * arg0 >> 12;
        int var6 = this.field1887 * arg2 >> 12;
        if (arg1 != 500) {
            field1880 = null;
        }
        ++field1877;
        int var7 = this.field1879 * arg2 >> 12;
        class134.method964(0, var6, var5, super.field2619, super.field2617, var7, var4, super.field2613);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILbl;)V")
    public static final void method687(int arg0, class33 arg1) {
        ++field1888;
        arg1.field694 = false;
        if (~arg1.field701 != 0) {
            class122 var2 = class133.method952(arg1.field701, arg0 + 128);
            if (var2 != null && var2.field2361 != null) {
                ++arg1.field727;
                if (~arg1.field693 > ~var2.field2361.length && ~var2.field2357[arg1.field693] > ~arg1.field727) {
                    arg1.field727 = 1;
                    ++arg1.field693;
                    class168.method1212(arg1.field676, arg1.field693, class124.field2412 == arg1, var2, 1928670186, arg1.field685);
                }
                if (~var2.field2361.length >= ~arg1.field693) {
                    arg1.field693 = 0;
                    arg1.field727 = 0;
                    class168.method1212(arg1.field676, arg1.field693, class124.field2412 == arg1, var2, 1928670186, arg1.field685);
                }
            } else {
                arg1.field701 = -1;
            }
        }
        if (~arg1.field690 != 0 && ~class236.field4265 <= ~arg1.field741) {
            int var3 = class219.method1547(arg1.field690, -118).field2466;
            if (~var3 != 0) {
                class122 var4 = class133.method952(var3, 127);
                if (var4 != null && var4.field2361 != null) {
                    if (arg1.field691 < 0) {
                        arg1.field691 = 0;
                        class168.method1212(arg1.field676, 0, class124.field2412 == arg1, var4, arg0 ^ -1928670187, arg1.field685);
                    }
                    ++arg1.field713;
                    if (arg1.field691 < var4.field2361.length && ~var4.field2357[arg1.field691] > ~arg1.field713) {
                        ++arg1.field691;
                        arg1.field713 = 1;
                        class168.method1212(arg1.field676, arg1.field691, class124.field2412 == arg1, var4, arg0 ^ -1928670187, arg1.field685);
                    }
                    if (arg1.field691 >= var4.field2361.length) {
                        arg1.field690 = -1;
                    }
                } else {
                    arg1.field690 = -1;
                }
            } else {
                arg1.field690 = -1;
            }
        }
        if (~arg1.field683 != 0 && ~arg1.field724 >= -2) {
            class122 var5 = class133.method952(arg1.field683, 127);
            if (~var5.field2354 == -2 && arg1.field742 > 0 && ~class236.field4265 <= ~arg1.field747 && class236.field4265 > arg1.field697) {
                arg1.field724 = 1;
                return;
            }
        }
        if (arg1.field683 != arg0 && arg1.field724 == 0) {
            class122 var6 = class133.method952(arg1.field683, 127);
            if (var6 != null && var6.field2361 != null) {
                ++arg1.field695;
                if (~var6.field2361.length < ~arg1.field708 && var6.field2357[arg1.field708] < arg1.field695) {
                    ++arg1.field708;
                    arg1.field695 = 1;
                    class168.method1212(arg1.field676, arg1.field708, class124.field2412 == arg1, var6, 1928670186, arg1.field685);
                }
                if (~var6.field2361.length >= ~arg1.field708) {
                    arg1.field708 -= var6.field2368;
                    ++arg1.field715;
                    if (arg1.field715 >= var6.field2385) {
                        arg1.field683 = -1;
                    } else if (arg1.field708 >= 0 && var6.field2361.length > arg1.field708) {
                        class168.method1212(arg1.field676, arg1.field708, class124.field2412 == arg1, var6, arg0 + 1928670187, arg1.field685);
                    } else {
                        arg1.field683 = -1;
                    }
                }
                arg1.field694 = var6.field2386;
            } else {
                arg1.field683 = -1;
            }
        }
        if (arg1.field724 > 0) {
            --arg1.field724;
        }
    }
}
