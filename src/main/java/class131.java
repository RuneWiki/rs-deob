import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class131 extends class60 {

    @OriginalMember(owner = "client!uc", name = "Vb", descriptor = "I")
    public static int field3154 = 0;

    @OriginalMember(owner = "client!uc", name = "Ub", descriptor = "Lrd;")
    private static class114 field3153 = class84.method656("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", (byte) 119);

    @OriginalMember(owner = "client!uc", name = "lc", descriptor = "I")
    public static int field3170 = 0;

    @OriginalMember(owner = "client!uc", name = "kc", descriptor = "Lrd;")
    private static class114 field3169 = class84.method656("red:", (byte) 127);

    @OriginalMember(owner = "client!uc", name = "sc", descriptor = "Lrd;")
    private static class114 field3177 = class84.method656("Loading textures )2 ", (byte) 119);

    @OriginalMember(owner = "client!uc", name = "pc", descriptor = "Lrd;")
    public static class114 field3174 = field3153;

    @OriginalMember(owner = "client!uc", name = "qc", descriptor = "Lrd;")
    public static class114 field3175 = class84.method656("mod_icons", (byte) 124);

    @OriginalMember(owner = "client!uc", name = "cc", descriptor = "Lrd;")
    private static class114 field3161 = class84.method656("Public chat", (byte) 117);

    @OriginalMember(owner = "client!uc", name = "hc", descriptor = "[I")
    public static int[] field3166 = new int[5];

    @OriginalMember(owner = "client!uc", name = "oc", descriptor = "Lrd;")
    public static class114 field3173 = field3161;

    @OriginalMember(owner = "client!uc", name = "Xb", descriptor = "Lrd;")
    public static class114 field3156 = field3177;

    @OriginalMember(owner = "client!uc", name = "ac", descriptor = "Lrd;")
    public static class114 field3159 = class84.method656("m-Ochte sich mit Ihnen duellieren)3", (byte) 122);

    @OriginalMember(owner = "client!uc", name = "uc", descriptor = "Lrd;")
    public static class114 field3179 = class84.method656("::fpson", (byte) 117);

    @OriginalMember(owner = "client!uc", name = "Wb", descriptor = "Lrd;")
    public static class114 field3155 = class84.method656("scape main", (byte) 114);

    @OriginalMember(owner = "client!uc", name = "vc", descriptor = "Lrd;")
    public static class114 field3180 = field3169;

    @OriginalMember(owner = "client!uc", name = "wc", descriptor = "Lrd;")
    private static class114 field3181 = class84.method656("Your ignore list is full)3 Max of 100 hit", (byte) 115);

    @OriginalMember(owner = "client!uc", name = "jc", descriptor = "Lrd;")
    public static class114 field3168 = field3181;

    @OriginalMember(owner = "client!uc", name = "Yb", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!uc", name = "Zb", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!uc", name = "bc", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!uc", name = "dc", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!uc", name = "ec", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!uc", name = "fc", descriptor = "I")
    private int field3164;

    @OriginalMember(owner = "client!uc", name = "gc", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!uc", name = "ic", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!uc", name = "mc", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!uc", name = "rc", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!uc", name = "tc", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!uc", name = "xc", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!uc", name = "nc", descriptor = "Ldc;")
    private class25 field3172;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "(I)Z")
    public static final boolean method1049(int arg0) {
        if (arg0 >= -49) {
            return false;
        } else {
            ++field3162;
            return class98.field2216 != null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(BI)I")
    public final int method1050(byte arg0, int arg1) {
        int var3 = this.field3164 >> 3;
        int var4 = 8 - (this.field3164 & 7);
        if (arg0 < 13) {
            this.method1054(105, 25);
        }
        this.field3164 += arg1;
        ++field3167;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (class28.field572[var4] & super.field1248[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field1248[var3] & class28.field572[var4]) + var5;
        } else {
            var6 = (super.field1248[var3] >> -arg1 + var4 & class28.field572[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "(I)I")
    public final int method1051(int arg0) {
        ++field3171;
        if (arg0 != 50) {
            field3169 = null;
        }
        return super.field1248[super.field1227++] - this.field3172.method189(-4) & 255;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([IZ)V")
    public final void method1052(int[] arg0, boolean arg1) {
        ++field3176;
        this.field3172 = new class25(arg0);
        if (!arg1) {
            this.method1050((byte) -58, -29);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
    public static final void method1053(int arg0, boolean arg1) {
        ++field3163;
        ++class142.field3391;
        if (arg0 != 13870) {
            method1049(46);
        }
        if (class142.field3391 >= 50 || arg1) {
            class142.field3391 = 0;
            if (!class62.field1339 && class18.field343 != null) {
                ++class28.field554;
                class61.field1303.method1054(8, 249);
                try {
                    class18.field343.method290(false, class61.field1303.field1227, 0, class61.field1303.field1248);
                    class61.field1303.field1227 = 0;
                } catch (IOException var2) {
                    class62.field1339 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "(II)V")
    public final void method1054(int arg0, int arg1) {
        ++field3160;
        if (arg0 != 8) {
            field3180 = null;
        }
        super.field1248[super.field1227++] = (byte) (arg1 + this.field3172.method189(-4));
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
    public class131(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "(B)V")
    public final void method1055(byte arg0) {
        if (arg0 != 61) {
            this.method1056(-75);
        }
        super.field1227 = (this.field3164 + 7) / 8;
        ++field3178;
    }

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "(I)V")
    public final void method1056(int arg0) {
        ++field3157;
        this.field3164 = super.field1227 * 8;
        if (arg0 >= -78) {
            this.method1056(-84);
        }
    }

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "(B)V")
    public static void method1057(byte arg0) {
        field3161 = null;
        field3180 = null;
        field3174 = null;
        field3181 = null;
        field3159 = null;
        field3179 = null;
        field3166 = null;
        field3173 = null;
        field3156 = null;
        field3155 = null;
        if (arg0 > 4) {
            field3177 = null;
            field3153 = null;
            field3175 = null;
            field3169 = null;
            field3168 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "(II)I")
    public final int method1058(int arg0, int arg1) {
        if (arg0 >= -76) {
            return 33;
        } else {
            ++field3158;
            return arg1 * 8 + -this.field3164;
        }
    }
}
