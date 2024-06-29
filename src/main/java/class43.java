import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class43 extends class104 {

    @OriginalMember(owner = "client!hb", name = "ac", descriptor = "Lgd;")
    public static class40 field1074 = class14.method90(false, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!hb", name = "gc", descriptor = "I")
    public static int field1080 = 0;

    @OriginalMember(owner = "client!hb", name = "fc", descriptor = "Z")
    public static boolean field1079 = false;

    @OriginalMember(owner = "client!hb", name = "bc", descriptor = "Z")
    public static boolean field1075 = false;

    @OriginalMember(owner = "client!hb", name = "ic", descriptor = "Lgd;")
    public static class40 field1082 = class14.method90(false, "(Y");

    @OriginalMember(owner = "client!hb", name = "qc", descriptor = "I")
    public static int field1090 = 0;

    @OriginalMember(owner = "client!hb", name = "vc", descriptor = "Lgd;")
    private static class40 field1095 = class14.method90(false, "glow1:");

    @OriginalMember(owner = "client!hb", name = "rc", descriptor = "Lgd;")
    public static class40 field1091 = field1095;

    @OriginalMember(owner = "client!hb", name = "Xb", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!hb", name = "Yb", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!hb", name = "Zb", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hb", name = "cc", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!hb", name = "ec", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!hb", name = "hc", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!hb", name = "jc", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!hb", name = "lc", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!hb", name = "nc", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!hb", name = "oc", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "client!hb", name = "pc", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!hb", name = "tc", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!hb", name = "uc", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!hb", name = "dc", descriptor = "Lw;")
    public static class135 field1077;

    @OriginalMember(owner = "client!hb", name = "kc", descriptor = "Lhd;")
    public static class46 field1084;

    @OriginalMember(owner = "client!hb", name = "mc", descriptor = "Lkd;")
    private class64 field1086;

    @OriginalMember(owner = "client!hb", name = "sc", descriptor = "Lmb;")
    public static class73 field1092;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "(B)V", line = 7)
    public final void method289(byte arg0) {
        ++field1085;
        super.field2563 = (this.field1088 + 7) / 8;
        if (arg0 != -58) {
            this.method292(-120);
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(BI)V", line = 18)
    public final void method290(byte arg0, int arg1) {
        ++field1081;
        super.field2554[super.field2563++] = (byte) (this.field1086.method459((byte) -37) + arg1);
        if (arg0 != 0) {
            this.field1088 = 117;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLv;)V", line = 33)
    public static final void method291(byte arg0, class129 arg1) {
        ++field1094;
        class70.field1694 = arg1;
        if (arg0 != -25) {
            method296((byte) 69);
        }
    }

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "(I)V", line = 48)
    public final void method292(int arg0) {
        this.field1088 = super.field2563 * 8;
        if (arg0 <= -119) {
            ++field1073;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[I)V", line = 59)
    public final void method293(byte arg0, int[] arg1) {
        this.field1086 = new class64(arg1);
        if (arg0 == 25) {
            ++field1071;
        }
    }

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "(II)I", line = 75)
    public static int method294(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "(B)I", line = 82)
    public final int method295(byte arg0) {
        int var2 = 23 % ((-28 - arg0) / 59);
        ++field1078;
        return 255 & super.field2554[super.field2563++] + -this.field1086.method459((byte) -37);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V", line = 95)
    public class43(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "(B)V", line = 108)
    public static void method296(byte arg0) {
        field1091 = null;
        field1082 = null;
        field1095 = null;
        field1077 = null;
        if (arg0 != 74) {
            method291((byte) -80, (class129) null);
        }
        field1074 = null;
        field1092 = null;
        field1084 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILrb;)Z", line = 126)
    public static final boolean method297(int arg0, int arg1, class103 arg2) {
        ++field1087;
        if (arg1 != 19230) {
            return true;
        } else {
            byte[] var3 = arg2.method735(arg0, (byte) 127);
            if (var3 == null) {
                return false;
            } else {
                class10.method55(var3, 8);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "(II)I", line = 158)
    public final int method298(int arg0, int arg1) {
        ++field1072;
        int var3 = this.field1088 >> 3;
        int var4 = -(this.field1088 & 7) + 8;
        int var5 = 0;
        if (arg1 != 19600) {
            return 23;
        } else {
            this.field1088 += arg0;
            while (arg0 > var4) {
                var5 += (class2.field32[var4] & super.field2554[var3++]) << arg0 - var4;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg0 != var4) {
                var6 = (class2.field32[arg0] & super.field2554[var3] >> var4 - arg0) + var5;
            } else {
                var6 = (class2.field32[var4] & super.field2554[var3]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(IZ)V", line = 188)
    public static final void method299(int arg0, boolean arg1) {
        ++field1089;
        class133 var2 = (class133) class10.field259.method142((long) arg0, 23056);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field3241.length; ++var3) {
                var2.field3241[var3] = -1;
                var2.field3244[var3] = 0;
            }
            if (!arg1) {
                field1075 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "(II)I", line = 232)
    public final int method300(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method293((byte) -45, (int[]) null);
        }
        ++field1093;
        return arg1 * 8 + -this.field1088;
    }
}
