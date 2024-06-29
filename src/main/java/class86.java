import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class86 extends class131 {

    @OriginalMember(owner = "client!ob", name = "bc", descriptor = "Lhb;")
    public static class44 field2191 = class102.method810(" zuerst von Ihrer Ignorieren)2Liste(Q", -28606);

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field2185 = 0;

    @OriginalMember(owner = "client!ob", name = "Zb", descriptor = "I")
    public static int field2189 = 0;

    @OriginalMember(owner = "client!ob", name = "ic", descriptor = "Lhb;")
    private static class44 field2198 = class102.method810("Connecting to server)3)3)3", -28606);

    @OriginalMember(owner = "client!ob", name = "fc", descriptor = "Lhb;")
    public static class44 field2195 = field2198;

    @OriginalMember(owner = "client!ob", name = "lc", descriptor = "Lhb;")
    public static class44 field2201 = class102.method810("Ihr Spielkonto wurde deaktiviert)3", -28606);

    @OriginalMember(owner = "client!ob", name = "cc", descriptor = "Lhb;")
    private static class44 field2192 = class102.method810("Loading ignore list", -28606);

    @OriginalMember(owner = "client!ob", name = "Xb", descriptor = "Lhb;")
    public static class44 field2187 = field2192;

    @OriginalMember(owner = "client!ob", name = "ac", descriptor = "I")
    public static int field2190 = 0;

    @OriginalMember(owner = "client!ob", name = "mc", descriptor = "I")
    public static int field2202 = 0;

    @OriginalMember(owner = "client!ob", name = "oc", descriptor = "Lhb;")
    private static class44 field2204 = class102.method810("Please reload this page)3", -28606);

    @OriginalMember(owner = "client!ob", name = "ec", descriptor = "Lhb;")
    public static class44 field2194 = field2204;

    @OriginalMember(owner = "client!ob", name = "wc", descriptor = "Lhb;")
    public static class44 field2212 = class102.method810("backleft1", -28606);

    @OriginalMember(owner = "client!ob", name = "Wb", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ob", name = "Yb", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ob", name = "dc", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ob", name = "hc", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ob", name = "jc", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ob", name = "kc", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ob", name = "nc", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ob", name = "pc", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ob", name = "qc", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ob", name = "sc", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ob", name = "tc", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ob", name = "uc", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ob", name = "vc", descriptor = "I")
    private int field2211;

    @OriginalMember(owner = "client!ob", name = "gc", descriptor = "Lne;")
    public static class83 field2196;

    @OriginalMember(owner = "client!ob", name = "rc", descriptor = "Loa;")
    private class85 field2207;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "(B)V", line = 9)
    public static void method697(byte arg0) {
        if (arg0 != 73) {
            field2195 = null;
        }
        field2196 = null;
        field2194 = null;
        field2212 = null;
        field2187 = null;
        field2192 = null;
        field2201 = null;
        field2204 = null;
        field2198 = null;
        field2191 = null;
        field2195 = null;
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(BI)V", line = 29)
    public static final void method698(byte arg0, int arg1) {
        ++field2210;
        if (class103.field2635 != null) {
            if (arg0 >= 126) {
                if (class18.field352 == 0) {
                    if (~class44.field1122 <= -1) {
                        class44.field1122 = arg1;
                        class103.field2635.method45(0, (byte) -87, arg1);
                        return;
                    }
                } else {
                    if (class25.field582 == null) {
                        return;
                    }
                    class97.field2460 = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(Z)V", line = 70)
    public final void method699(boolean arg0) {
        if (!arg0) {
            ++field2208;
            this.field2211 = super.field3182 * 8;
        }
    }

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "(II)I", line = 85)
    public final int method700(int arg0, int arg1) {
        int var3 = -96 / ((26 - arg1) / 57);
        ++field2193;
        int var4 = -(this.field2211 & 7) + 8;
        int var5 = this.field2211 >> 3;
        this.field2211 += arg0;
        int var6 = 0;
        while (~var4 > ~arg0) {
            var6 += (class117.field2869[var4] & super.field3172[var5++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg0 != var4) {
            var7 = (class117.field2869[arg0] & super.field3172[var5] >> -arg0 + var4) + var6;
        } else {
            var7 = (class117.field2869[var4] & super.field3172[var5]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "(I)I", line = 118)
    public final int method701(int arg0) {
        if (arg0 != 255) {
            return -49;
        } else {
            ++field2203;
            return super.field3172[super.field3182++] + -this.field2207.method693((byte) 85) & 255;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V", line = 136)
    public class86(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V", line = 147)
    public final void method702(boolean arg0, int arg1) {
        super.field3172[super.field3182++] = (byte) (this.field2207.method693((byte) 85) + arg1);
        if (!arg0) {
            field2202 = 63;
        }
        ++field2188;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([IB)V", line = 183)
    public final void method703(int[] arg0, byte arg1) {
        this.field2207 = new class85(arg0);
        if (arg1 != 0) {
            field2196 = null;
        }
        ++field2197;
    }

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "(I)V", line = 197)
    public final void method704(int arg0) {
        if (arg0 < -80) {
            ++field2206;
            super.field3182 = (this.field2211 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILja;)V", line = 221)
    public static final void method705(int arg0, int arg1, class55 arg2) {
        if (arg1 != -1277592829) {
            field2191 = null;
        }
        ++field2205;
        class31.method311(arg2.field1384, arg2.field1371, arg0, arg1 + 1277592996);
    }

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "(II)I", line = 238)
    public final int method706(int arg0, int arg1) {
        if (arg1 != 8) {
            method705(-52, -105, (class55) null);
        }
        ++field2200;
        return arg0 * 8 + -this.field2211;
    }
}
