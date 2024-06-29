import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class84 extends class263 {

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!dba", name = "w", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "client!dba", name = "u", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "Ldr;")
    public static class675 field1075 = new class675(91, -2);

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V", line = 3)
    public static void method636(int arg0) {
        field1075 = null;
        if (arg0 <= 34) {
            method636(-78);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZILsaa;Lsaa;I)I", line = 13)
    public static final int method637(boolean arg0, int arg1, class305 arg2, class305 arg3, int arg4) {
        field1071++;
        if (arg1 != -1) {
            method643(109, 9);
        }
        if (arg4 == 1) {
            int var5 = arg2.field6646;
            int var6 = arg3.field6646;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class7.method24(arg2.method1818(8).field3283, arg3.method1818(8).field3283, class71.field912, 0);
        } else if (arg4 == 3) {
            if (arg2.field3860.equals("-")) {
                if (arg3.field3860.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field3860.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class7.method24(arg2.field3860, arg3.field3860, class71.field912, ~arg1);
            }
        } else if (arg4 == 4) {
            if (arg2.method2839(0)) {
                return arg3.method2839(0) ? 0 : 1;
            } else if (arg3.method2839(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg2.method2844(false)) {
                return arg3.method2844(false) ? 0 : 1;
            } else if (arg3.method2844(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg2.method2840(false)) {
                return arg3.method2840(false) ? 0 : 1;
            } else if (arg3.method2840(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 7) {
            if (arg2.method2843(-22050)) {
                return arg3.method2843(arg1 ^ 0x5621) ? 0 : 1;
            } else if (arg3.method2843(arg1 ^ 0x5621)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 8) {
            int var7 = arg2.field3864;
            int var8 = arg3.field3864;
            if (arg0) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg2.field3865 - arg3.field3865;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)Z", line = 114)
    public final boolean method638(int arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            field1075 = null;
        }
        field1068++;
        return this.field1083 <= arg2 && this.field1079 >= arg2 && arg0 >= this.field1072 && arg0 <= this.field1082;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II[IB)V", line = 132)
    public final void method639(int arg0, int arg1, int[] arg2, byte arg3) {
        arg2[2] = this.field1074 + arg0 - this.field1072;
        arg2[0] = this.field1080;
        field1073++;
        int var5 = 123 % ((arg3 + 28) / 40);
        arg2[1] = this.field1078 + arg1 - this.field1083;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II[II)V", line = 144)
    public final void method640(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[2] = this.field1072 + arg1 - this.field1074;
        arg2[1] = arg3 - (this.field1078 - this.field1083);
        field1081++;
        arg2[arg0] = 0;
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(III)Z", line = 158)
    public final boolean method641(int arg0, int arg1, int arg2) {
        if (arg2 == 91) {
            field1070++;
            return this.field1078 <= arg1 && this.field1069 >= arg1 && this.field1074 <= arg0 && arg0 <= this.field1084;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IBII)Z", line = 175)
    public final boolean method642(int arg0, byte arg1, int arg2, int arg3) {
        field1077++;
        if (arg1 <= 37) {
            this.field1080 = 120;
        }
        return this.field1080 == arg0 && arg2 >= this.field1078 && arg2 <= this.field1069 && this.field1074 <= arg3 && arg3 <= this.field1084;
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(IIIIIIIII)V", line = 199)
    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1069 = arg3;
        this.field1074 = arg2;
        this.field1080 = arg0;
        this.field1079 = arg7;
        this.field1083 = arg5;
        this.field1084 = arg4;
        this.field1072 = arg6;
        this.field1078 = arg1;
        this.field1082 = arg8;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)V", line = 218)
    public static final void method643(int arg0, int arg1) {
        if (arg0 != 6) {
            field1075 = null;
        }
        field1076++;
        class650.field8783.method1222(14564, arg1);
    }
}
