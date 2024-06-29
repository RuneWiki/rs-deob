import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class178 extends class264 {

    @OriginalMember(owner = "client!fh", name = "Nb", descriptor = "Lui;")
    public static class239 field2887 = new class239(64);

    @OriginalMember(owner = "client!fh", name = "Rb", descriptor = "Z")
    public static boolean field2891 = false;

    @OriginalMember(owner = "client!fh", name = "Qb", descriptor = "[I")
    public static int[] field2890 = new int[256];

    @OriginalMember(owner = "client!fh", name = "Sb", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!fh", name = "Bb", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!fh", name = "Cb", descriptor = "I")
    private int field2876;

    @OriginalMember(owner = "client!fh", name = "Db", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!fh", name = "Eb", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!fh", name = "Fb", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!fh", name = "Ib", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!fh", name = "Jb", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!fh", name = "Kb", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!fh", name = "Lb", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!fh", name = "Mb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!fh", name = "Ob", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!fh", name = "Pb", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!fh", name = "Tb", descriptor = "Ljj;")
    public static class134 field2893;

    @OriginalMember(owner = "client!fh", name = "Ub", descriptor = "Llc;")
    public static class148 field2894;

    @OriginalMember(owner = "client!fh", name = "Gb", descriptor = "Lt;")
    public static class228 field2880;

    @OriginalMember(owner = "client!fh", name = "Hb", descriptor = "Llj;")
    private class42 field2881;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBILjava/awt/Component;)Lgb;")
    public static final class152 method1231(int arg0, byte arg1, int arg2, Component arg3) {
        ++field2886;
        try {
            if (arg1 != 0) {
                return null;
            } else {
                Class var4 = Class.forName("rg");
                class152 var5 = (class152) var4.newInstance();
                var5.method428(arg3, arg2, (byte) 48, arg0);
                return var5;
            }
        } catch (Throwable var7) {
            class55 var6 = new class55();
            var6.method428(arg3, arg2, (byte) 71, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "(I)I")
    public final int method1232(int arg0) {
        int var2 = 82 / ((71 - arg0) / 43);
        ++field2885;
        return super.field4198[super.field4195++] - this.field2881.method322((byte) 121) & 255;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([II)V")
    public final void method1233(int[] arg0, int arg1) {
        if (arg1 < 95) {
            method1231(-56, (byte) 14, -12, (Component) null);
        }
        this.field2881 = new class42(arg0);
        ++field2888;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
    public class178(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "(I)V")
    public final void method1234(int arg0) {
        this.field2876 = super.field4195 * arg0;
        ++field2879;
    }

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "(I)V")
    public static final void method1235(int arg0) {
        if (arg0 == 2) {
            ++field2875;
            try {
                if (class130.field2178 == 1) {
                    int var1 = class93.field1326.method767(arg0 ^ 107);
                    if (var1 > 0 && class93.field1326.method772(true)) {
                        int var2 = var1 - class111.field1919;
                        if (var2 < 0) {
                            var2 = 0;
                        }
                        class93.field1326.method773(var2, (byte) -120);
                    } else {
                        class93.field1326.method775(2430);
                        class93.field1326.method757(true);
                        if (class110.field1899 != null) {
                            class130.field2178 = 2;
                        } else {
                            class130.field2178 = 0;
                        }
                        class257.field4104 = null;
                        class177.field2848 = null;
                    }
                }
            } catch (Exception var4) {
                var4.printStackTrace();
                class93.field1326.method775(2430);
                class257.field4104 = null;
                class130.field2178 = 0;
                class110.field1899 = null;
                class177.field2848 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[BI)V")
    public final void method1236(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = -31 % ((arg1 - 13) / 58);
        ++field2877;
        for (int var6 = 0; ~var6 > ~arg0; ++var6) {
            arg2[var6 - -arg3] = (byte) (super.field4198[super.field4195++] + -this.field2881.method322((byte) 121));
        }
    }

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "(II)I")
    public final int method1237(int arg0, int arg1) {
        if (arg1 != 8) {
            return -42;
        } else {
            ++field2884;
            return arg0 * 8 + -this.field2876;
        }
    }

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "(II)V")
    public final void method1238(int arg0, int arg1) {
        ++field2883;
        if (arg1 == -136478397) {
            super.field4198[super.field4195++] = (byte) (this.field2881.method322((byte) 121) + arg0);
        }
    }

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "(II)I")
    public final int method1239(int arg0, int arg1) {
        ++field2878;
        int var3 = -128 % ((49 - arg0) / 44);
        int var4 = this.field2876 >> 3;
        int var5 = 0;
        int var6 = -(7 & this.field2876) + 8;
        this.field2876 += arg1;
        while (~var6 > ~arg1) {
            var5 += (class202.field3249[var6] & super.field4198[var4++]) << arg1 - var6;
            arg1 -= var6;
            var6 = 8;
        }
        int var7;
        if (arg1 == var6) {
            var7 = (super.field4198[var4] & class202.field3249[var6]) + var5;
        } else {
            var7 = (super.field4198[var4] >> -arg1 + var6 & class202.field3249[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "(I)V")
    public static void method1240(int arg0) {
        field2890 = null;
        field2887 = null;
        field2894 = null;
        if (arg0 <= 63) {
            method1235(-96);
        }
        field2893 = null;
        field2880 = null;
    }

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "(B)V")
    public final void method1241(byte arg0) {
        super.field4195 = (this.field2876 + 7) / 8;
        ++field2882;
        if (arg0 != 0) {
            field2887 = null;
        }
    }
}
