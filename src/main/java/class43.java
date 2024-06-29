import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class43 extends class122 {

    @OriginalMember(owner = "client!hb", name = "Mb", descriptor = "Lpd;")
    private static class94 field1070 = class28.method249(-92, "World");

    @OriginalMember(owner = "client!hb", name = "Ub", descriptor = "I")
    public static int field1078 = 0;

    @OriginalMember(owner = "client!hb", name = "Xb", descriptor = "I")
    public static int field1081 = 0;

    @OriginalMember(owner = "client!hb", name = "Ob", descriptor = "I")
    public static int field1072 = 0;

    @OriginalMember(owner = "client!hb", name = "bc", descriptor = "I")
    public static int field1085 = 2301979;

    @OriginalMember(owner = "client!hb", name = "dc", descriptor = "[I")
    public static int[] field1087 = new int[5];

    @OriginalMember(owner = "client!hb", name = "hc", descriptor = "Lpd;")
    public static class94 field1091 = field1070;

    @OriginalMember(owner = "client!hb", name = "ec", descriptor = "Lpd;")
    public static class94 field1088 = class28.method249(-84, "@whi@");

    @OriginalMember(owner = "client!hb", name = "gc", descriptor = "Lvc;")
    public static class128 field1090 = new class128(64);

    @OriginalMember(owner = "client!hb", name = "Nb", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!hb", name = "Pb", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hb", name = "Qb", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!hb", name = "Rb", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!hb", name = "Sb", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!hb", name = "Tb", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!hb", name = "Vb", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!hb", name = "Wb", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!hb", name = "Yb", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!hb", name = "Zb", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!hb", name = "fc", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!hb", name = "cc", descriptor = "Ltc;")
    public static class116 field1086;

    @OriginalMember(owner = "client!hb", name = "ac", descriptor = "Lua;")
    private class120 field1084;

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V", line = 13)
    public class43(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "(II)I", line = 26)
    public final int method319(int arg0, int arg1) {
        ++field1075;
        int var3 = -(7 & this.field1077) + arg1;
        int var4 = this.field1077 >> 3;
        this.field1077 += arg0;
        int var5 = 0;
        while (~var3 > ~arg0) {
            var5 += (super.field3074[var4++] & class101.field2556[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 != var3) {
            var6 = (super.field3074[var4] >> -arg0 + var3 & class101.field2556[arg0]) + var5;
        } else {
            var6 = (class101.field2556[var3] & super.field3074[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "(I)I", line = 57)
    public final int method320(int arg0) {
        ++field1071;
        int var2 = -45 % ((arg0 - -38) / 49);
        return 255 & super.field3074[super.field3047++] + -this.field1084.method905(-88);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILs;I)Z", line = 73)
    public static final boolean method321(int arg0, int arg1, class111 arg2, int arg3) {
        if (arg3 != -12404) {
            method321(-51, -32, (class111) null, -86);
        }
        ++field1079;
        byte[] var4 = arg2.method808((byte) -89, arg1, arg0);
        if (var4 == null) {
            return false;
        } else {
            class17.method125((byte) 121, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "(II)I", line = 101)
    public final int method322(int arg0, int arg1) {
        if (arg0 != 8) {
            this.field1077 = 45;
        }
        ++field1080;
        return arg1 * 8 + -this.field1077;
    }

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "(I)V", line = 112)
    public final void method323(int arg0) {
        this.field1077 = super.field3047 * 8;
        ++field1074;
        if (arg0 != 28901) {
            field1083 = 27;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([II)V", line = 138)
    public final void method324(int[] arg0, int arg1) {
        this.field1084 = new class120(arg0);
        if (arg1 != -22668) {
            method325((byte) 123);
        }
        ++field1082;
    }

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "(B)V", line = 156)
    public static void method325(byte arg0) {
        field1088 = null;
        field1087 = null;
        field1070 = null;
        if (arg0 != -109) {
            field1070 = null;
        }
        field1090 = null;
        field1091 = null;
        field1086 = null;
    }

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "(II)V", line = 176)
    public final void method326(int arg0, int arg1) {
        if (arg1 > -100) {
            field1081 = 107;
        }
        super.field3074[super.field3047++] = (byte) (this.field1084.method905(-123) + arg0);
        ++field1073;
    }

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "(I)V", line = 190)
    public final void method327(int arg0) {
        ++field1076;
        super.field3047 = (this.field1077 + arg0) / 8;
    }
}
