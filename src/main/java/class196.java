import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class196 extends class23 {

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    private int field3762 = -1;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "Li;")
    public static class88 field3759 = class208.method1425(105, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!s", name = "V", descriptor = "Li;")
    public static class88 field3757 = class208.method1425(105, "blaugr-Un:");

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "Li;")
    private static class88 field3770 = class208.method1425(105, "Loading)3)3)3");

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field3760 = 0;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field3756 = 0;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "Li;")
    private static class88 field3769 = class208.method1425(105, "To create a new account you need to");

    @OriginalMember(owner = "client!s", name = "db", descriptor = "Li;")
    public static class88 field3765 = field3770;

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "Li;")
    public static class88 field3774 = class208.method1425(105, ")1 ");

    @OriginalMember(owner = "client!s", name = "T", descriptor = "Li;")
    public static class88 field3755 = field3769;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    private int field3753;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    private int field3754;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "Lbj;")
    public static class22 field3773;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "Lgi;")
    public static class75 field3764;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "Lic;")
    public static class91 field3766;

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "[I")
    private int[] field3771;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field3768;
        if (arg1 != 13) {
            return null;
        } else {
            int[][] var3 = super.field364.method1541(true, arg0);
            if (super.field364.field4312 && this.method1363(42)) {
                int var4 = this.field3754 * (class27.field460 == this.field3753 ? arg0 : this.field3753 * arg0 / class27.field460);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class70.field1276 != ~this.field3754) {
                    for (int var8 = 0; class70.field1276 > var8; ++var8) {
                        int var9 = this.field3754 * var8 / class70.field1276;
                        int var10 = this.field3771[var4 + var9];
                        var7[var8] = class70.method470(var10, 255) << 4;
                        var6[var8] = class70.method470(4080, var10 >> 4);
                        var5[var8] = class70.method470(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; class70.field1276 > var11; ++var11) {
                        int var12 = this.field3771[var4++];
                        var7[var11] = class70.method470(4080, var12 << 4);
                        var6[var11] = class70.method470(65280, var12) >> 4;
                        var5[var11] = class70.method470(16711680, var12) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        ++field3763;
        if (~arg2 == -1) {
            this.field3762 = arg0.method301(114);
        }
        if (arg1 != -3) {
            field3770 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(Z)V")
    public static final void method1359(boolean arg0) {
        class93.field1741.method134(50);
        ++field3772;
        if (arg0) {
            field3769 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Lhi;")
    public static final class86 method1360(int arg0) {
        ++field3758;
        if (arg0 != 0) {
            field3774 = null;
        }
        try {
            return (class86) Class.forName("qh").newInstance();
        } catch (Throwable var1) {
            return new class32();
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(Z)V")
    public static final void method1361(boolean arg0) {
        ++field3761;
        for (int var1 = 0; ~class192.field3704 < ~var1; ++var1) {
            int var2 = class139.field2581[var1];
            class191 var3 = class225.field4225[var2];
            int var4 = class230.field4314.method347(26119);
            if (~(var4 & 8) != -1) {
                int var5 = class230.field4314.method302(255);
                int var6 = class230.field4314.method352(24758);
                if (~var5 == -65536) {
                    var5 = -1;
                }
                class141.method927(var5, !arg0, var6, var3);
            }
            if (~(1 & var4) != -1) {
                var3.field4073 = class230.field4314.method298(-128);
                var3.field4114 = 100;
            }
            if ((32 & var4) != 0) {
                var3.field4098 = class230.field4314.method302(255);
                var3.field4101 = class230.field4314.method301(117);
            }
            if (~(128 & var4) != -1) {
                var3.field4082 = class230.field4314.method343(104);
                int var7 = class230.field4314.method313(126);
                if (var3.field4082 == 65535) {
                    var3.field4082 = -1;
                }
                var3.field4127 = var7 >> 16;
                var3.field4077 = 0;
                var3.field4122 = 0;
                var3.field4084 = (var7 & 65535) + class117.field2115;
                if (class117.field2115 < var3.field4084) {
                    var3.field4077 = -1;
                }
            }
            if ((2 & var4) != 0) {
                var3.field4116 = class230.field4314.method349(true);
                if (var3.field4116 == 65535) {
                    var3.field4116 = -1;
                }
            }
            if ((16 & var4) != 0) {
                var3.field3684 = class147.method987(class230.field4314.method349(true), -123);
                var3.field4104 = var3.field3684.field2341;
                var3.field4105 = var3.field3684.field2351;
                var3.field4093 = var3.field3684.field2319;
                var3.field4130 = var3.field3684.field2362;
                var3.field4107 = var3.field3684.field2327;
                var3.field4124 = var3.field3684.field2339;
                var3.field4125 = var3.field3684.field2345;
                var3.field4086 = var3.field3684.field2353;
                var3.field4094 = var3.field3684.field2324;
            }
            if (~(var4 & 64) != -1) {
                int var8 = class230.field4314.method319(4633);
                int var9 = class230.field4314.method319(4633);
                var3.method1479(class117.field2115, 31632, var9, var8);
            }
            if (~(var4 & 4) != -1) {
                int var10 = class230.field4314.method295((byte) -115);
                int var11 = class230.field4314.method347(26119);
                var3.method1479(class117.field2115, 31632, var11, var10);
                var3.field4120 = class117.field2115 - -300;
                var3.field4111 = class230.field4314.method319(4633);
            }
        }
        if (!arg0) {
            field3770 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)I")
    public final int method129(int arg0) {
        ++field3752;
        return arg0 != -285853214 ? 20 : this.field3762;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
    public static void method1362(byte arg0) {
        field3773 = null;
        field3765 = null;
        field3755 = null;
        if (arg0 >= -46) {
            field3770 = null;
        }
        field3759 = null;
        field3770 = null;
        field3766 = null;
        field3764 = null;
        field3757 = null;
        field3774 = null;
        field3769 = null;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
    public final void method127(int arg0) {
        super.method127(arg0);
        ++field3767;
        this.field3771 = null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class196() {
        super(0, false);
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Z")
    private final boolean method1363(int arg0) {
        ++field3775;
        if (this.field3771 != null) {
            return true;
        } else if (this.field3762 >= 0) {
            int var2 = class70.field1276;
            int var3 = class27.field460;
            int var4 = !class244.field4490.method437(this.field3762, (byte) -115) ? 128 : 64;
            this.field3771 = class244.field4490.method440(this.field3762, 80);
            this.field3753 = var4;
            this.field3754 = var4;
            class118.method804(var2, 80, var3);
            return this.field3771 != null;
        } else {
            return arg0 <= 32 ? false : false;
        }
    }
}
