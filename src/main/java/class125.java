import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class125 extends class64 {

    @OriginalMember(owner = "client!vc", name = "Xb", descriptor = "Lv;")
    public static class122 field3025 = class55.method425(-68, "Weiter");

    @OriginalMember(owner = "client!vc", name = "kc", descriptor = "Lv;")
    public static class122 field3038 = class55.method425(-58, "(U3");

    @OriginalMember(owner = "client!vc", name = "jc", descriptor = "Lv;")
    public static class122 field3037 = class55.method425(-57, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!vc", name = "pc", descriptor = "[Lja;")
    public static class55[] field3043 = new class55[2048];

    @OriginalMember(owner = "client!vc", name = "nc", descriptor = "I")
    public static int field3041 = 0;

    @OriginalMember(owner = "client!vc", name = "lc", descriptor = "Lec;")
    public static class28 field3039 = new class28();

    @OriginalMember(owner = "client!vc", name = "sc", descriptor = "[I")
    public static int[] field3046 = new int[25];

    @OriginalMember(owner = "client!vc", name = "xc", descriptor = "Lv;")
    private static class122 field3051 = class55.method425(-128, "Malformed login packet)3");

    @OriginalMember(owner = "client!vc", name = "vc", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!vc", name = "tc", descriptor = "Lv;")
    public static class122 field3047 = field3051;

    @OriginalMember(owner = "client!vc", name = "zc", descriptor = "Lv;")
    private static class122 field3053 = class55.method425(-113, "Enter name:");

    @OriginalMember(owner = "client!vc", name = "uc", descriptor = "Lv;")
    private static class122 field3048 = class55.method425(-111, "Loaded sprites");

    @OriginalMember(owner = "client!vc", name = "wc", descriptor = "Lv;")
    public static class122 field3050 = field3048;

    @OriginalMember(owner = "client!vc", name = "yc", descriptor = "Lv;")
    public static class122 field3052 = field3053;

    @OriginalMember(owner = "client!vc", name = "Yb", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!vc", name = "Zb", descriptor = "I")
    private int field3027;

    @OriginalMember(owner = "client!vc", name = "ac", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!vc", name = "cc", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!vc", name = "fc", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!vc", name = "gc", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!vc", name = "ic", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!vc", name = "mc", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!vc", name = "oc", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!vc", name = "qc", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!vc", name = "rc", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!vc", name = "dc", descriptor = "Ls;")
    private class107 field3031;

    @OriginalMember(owner = "client!vc", name = "bc", descriptor = "Lvb;")
    public static class124 field3029;

    @OriginalMember(owner = "client!vc", name = "ec", descriptor = "Lce;")
    public static class18 field3032;

    @OriginalMember(owner = "client!vc", name = "hc", descriptor = "Lmb;")
    public static class74 field3035;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(BI)Lea;", line = 3)
    public static final class26 method987(byte arg0, int arg1) {
        ++field3036;
        class26 var2 = (class26) class81.field2103.method436(-112, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 >= -126) {
                method989(-54);
            }
            byte[] var3 = class8.field182.method611(0, 16, arg1);
            class26 var4 = new class26();
            if (var3 != null) {
                var4.method267(new class64(var3), -21626);
            }
            class81.field2103.method437((long) arg1, var4, (byte) 69);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "(B)V", line = 46)
    public final void method988(byte arg0) {
        ++field3042;
        this.field3027 = super.field1617 * 8;
        if (arg0 != -63) {
            this.method988((byte) -95);
        }
    }

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "(I)V", line = 64)
    public static void method989(int arg0) {
        field3048 = null;
        field3035 = null;
        if (arg0 != 7) {
            method987((byte) -128, 28);
        }
        field3053 = null;
        field3029 = null;
        field3043 = null;
        field3052 = null;
        field3046 = null;
        field3025 = null;
        field3039 = null;
        field3032 = null;
        field3047 = null;
        field3038 = null;
        field3037 = null;
        field3050 = null;
        field3051 = null;
    }

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "(I)I", line = 88)
    public final int method990(int arg0) {
        ++field3044;
        return arg0 != 255 ? 52 : 255 & super.field1679[super.field1617++] + -this.field3031.method829(arg0 + -267);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 100)
    public static final Class method991(String arg0, int arg1) throws ClassNotFoundException {
        int var2 = -7 % ((-23 - arg1) / 57);
        ++field3026;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(II)I", line = 141)
    public final int method992(int arg0, int arg1) {
        ++field3040;
        if (arg0 <= 88) {
            field3052 = null;
        }
        return arg1 * 8 + -this.field3027;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([II)V", line = 176)
    public final void method993(int[] arg0, int arg1) {
        this.field3031 = new class107(arg0);
        ++field3030;
        if (arg1 < 56) {
            field3041 = -40;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(IB)I", line = 188)
    public final int method994(int arg0, byte arg1) {
        ++field3033;
        int var3 = this.field3027 >> 3;
        int var4 = -(this.field3027 & 7) + 8;
        int var5 = 0;
        this.field3027 += arg0;
        while (arg0 > var4) {
            var5 += (super.field1679[var3++] & class88.field2256[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        if (arg1 >= -74) {
            this.method990(-44);
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field1679[var3] >> -arg0 + var4 & class88.field2256[arg0]) + var5;
        } else {
            var6 = (class88.field2256[var4] & super.field1679[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V", line = 228)
    public final void method995(boolean arg0) {
        if (arg0) {
            method989(10);
        }
        super.field1617 = (this.field3027 + 7) / 8;
        ++field3028;
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(BI)V", line = 240)
    public final void method996(byte arg0, int arg1) {
        if (arg0 <= 51) {
            field3048 = null;
        }
        ++field3034;
        super.field1679[super.field1617++] = (byte) (arg1 + this.field3031.method829(126));
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V", line = 255)
    public class125(int arg0) {
        super(arg0);
    }
}
