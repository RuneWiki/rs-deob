import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class239 extends class44 {

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    private int field3813;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    private int field3826;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    private int field3820;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    private int field3825;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Z")
    public static boolean field3814 = true;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3819 = "Loading config - ";

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Ldl;")
    public static class123 field3824;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lhc;")
    public static class229 field3812;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Ldf;")
    public static class55 field3821;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method1617(String arg0, boolean arg1) {
        ++field3828;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~var2 > ~class228.field3692; ++var2) {
                if (arg0.equalsIgnoreCase(class94.field1464[var2])) {
                    return true;
                }
            }
            if (!arg1) {
                return false;
            } else {
                return arg0.equalsIgnoreCase(class149.field2227.field2912);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public static final void method1618(int arg0) {
        class164.field2553 = 0;
        ++field3818;
        class218.field3542 = arg0;
        class228.method1561((byte) 107);
        class165.method1133((byte) -87);
        class124.method839((byte) 107);
        class130.method882(4462);
        for (int var1 = 0; ~var1 > ~class218.field3542; ++var1) {
            int var3 = class178.field2775[var1];
            if (class111.field1684 != class153.field2277[var3].field1210) {
                if (class153.field2277[var3].field2925 > 0) {
                    class172.method1215(121, class153.field2277[var3]);
                }
                class153.field2277[var3] = null;
            }
        }
        if (~class179.field2793 != ~class235.field3766.field349) {
            throw new RuntimeException("gpp1 pos:" + class235.field3766.field349 + " psize:" + class179.field2793);
        } else {
            for (int var2 = 0; class73.field1040 > var2; ++var2) {
                if (class153.field2277[class8.field117[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class73.field1040);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1619(byte arg0, String arg1) {
        ++field3815;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 < 86) {
            return -74;
        } else {
            for (int var4 = 0; var4 < var2; ++var4) {
                var3 = class58.method421((byte) -123, arg1.charAt(var4)) + (var3 << 5) + -var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)I")
    public static final int method1620(int arg0, int arg1, int arg2) {
        ++field3829;
        if (~arg2 == 0) {
            return 12345678;
        } else {
            int var3 = (127 & arg2) * arg0 >> 7;
            if (arg1 < 41) {
                method1618(-57);
            }
            if (~var3 <= -3) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (65408 & arg2) + var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method332(int arg0, int arg1, int arg2) {
        ++field3817;
        int var4 = this.field3813 * arg2 >> 12;
        if (arg1 <= 113) {
            field3812 = null;
        }
        int var5 = this.field3820 * arg0 >> 12;
        int var6 = this.field3825 * arg0 >> 12;
        int var7 = this.field3826 * arg2 >> 12;
        class153.method1018(90, super.field564, var5, var6, super.field567, var4, super.field565, var7);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
    public final void method333(int arg0, int arg1, int arg2) {
        int var4 = this.field3825 * arg1 >> 12;
        if (arg0 != 0) {
            this.method336(-64, (byte) -106, 39);
        }
        ++field3822;
        int var5 = this.field3820 * arg1 >> 12;
        int var6 = this.field3813 * arg2 >> 12;
        int var7 = this.field3826 * arg2 >> 12;
        class282.method1882(super.field564, var7, var6, var4, 41, var5);
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
    public static void method1621(int arg0) {
        field3819 = null;
        field3821 = null;
        field3824 = null;
        field3812 = null;
        if (arg0 != -1229893588) {
            method1622(-117, true);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
    public final void method336(int arg0, byte arg1, int arg2) {
        ++field3816;
        int var4 = this.field3820 * arg2 >> 12;
        if (arg1 != 43) {
            field3812 = null;
        }
        int var5 = this.field3825 * arg2 >> 12;
        int var6 = this.field3813 * arg0 >> 12;
        int var7 = this.field3826 * arg0 >> 12;
        class286.method1905(var7, var5, var6, super.field567, (byte) -121, var4, super.field565);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIII)V")
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3813 = arg1;
        this.field3826 = arg3;
        this.field3820 = arg0;
        this.field3825 = arg2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)V")
    public static final void method1622(int arg0, boolean arg1) {
        ++field3823;
        if (!class130.field1898 != !arg1) {
            if (arg0 >= 69) {
                class130.field1898 = arg1;
                class164.method1129(-1597295167);
            }
        }
    }
}
