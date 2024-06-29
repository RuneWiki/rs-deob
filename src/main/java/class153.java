import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class153 extends class89 {

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "[I")
    public static int[] field1934 = new int[1000];

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "Lkg;")
    public static class179 field1939 = new class179(65, 12);

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "F")
    public static float field1935;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public int field1928;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "Ljava/lang/String;")
    public String field1932;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public final void method997(byte arg0) {
        super.field1098 = Long.MIN_VALUE & super.field1098 | class504.method3034((byte) -118) + 500L;
        ++field1931;
        if (arg0 != 93) {
            method999(true, (class194) null);
        }
        class414.field5893.method1400(false, this);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
    public static final void method998(int arg0, int arg1, int arg2) {
        class282.method1669(class91.field1111, false);
        if (arg1 != -25347) {
            field1934 = null;
        }
        ++class276.field3459;
        ++field1926;
        class40.field511.method2783(arg0, arg1 + -578347765);
        class40.field511.method2753(arg2, -25597);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLtf;)I")
    public static final int method999(boolean arg0, class194 arg1) {
        if (!arg0) {
            method998(-68, 34, -62);
        }
        ++field1929;
        int var2 = arg1.method1199(30304, 2);
        int var3;
        if (var2 != 0) {
            if (var2 == 1) {
                var3 = arg1.method1199(30304, 5);
            } else if (var2 != 2) {
                var3 = arg1.method1199(30304, 11);
            } else {
                var3 = arg1.method1199(30304, 8);
            }
        } else {
            var3 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)I")
    public final int method1000(int arg0) {
        ++field1938;
        return arg0 >= -65 ? 112 : (int) (255L & super.field5043 >>> 32);
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public static void method1001(int arg0) {
        if (arg0 != 0) {
            method1001(-53);
        }
        field1939 = null;
        field1934 = null;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)J")
    public final long method1002(byte arg0) {
        ++field1924;
        if (arg0 < 98) {
            this.field1930 = 45;
        }
        return Long.MAX_VALUE & super.field1098;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
    public final void method1003(byte arg0) {
        ++field1927;
        super.field1098 |= Long.MIN_VALUE;
        int var2 = 100 % ((44 - arg0) / 50);
        if (this.method1002((byte) 111) == 0L) {
            class291.field3704.method1400(false, this);
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
    public static final void method1004(byte arg0) {
        ++field1925;
        if (class495.field7198 == 5) {
            if (arg0 != 103) {
                method1001(-49);
            }
            class495.field7198 = 6;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(II)V")
    public class153(int arg0, int arg1) {
        super.field5043 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lrd;I)I")
    public static final int method1005(class223 arg0, int arg1) {
        ++field1937;
        int var2 = arg0.field2810;
        class511 var3 = arg0.method2128(-65);
        if (!arg0.field4872) {
            if (arg0.field4888 != var3.field7375 && ~arg0.field4888 != ~var3.field7395 && ~arg0.field4888 != ~var3.field7397 && ~arg0.field4888 != ~var3.field7380) {
                if (arg0.field4888 == var3.field7374 || arg0.field4888 == var3.field7405 || arg0.field4888 == var3.field7393 || ~arg0.field4888 == ~var3.field7418) {
                    var2 = arg0.field2824;
                }
            } else {
                var2 = arg0.field2857;
            }
        } else {
            var2 = arg0.field2842;
        }
        int var4 = 94 % ((55 - arg1) / 59);
        return var2;
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(B)I")
    public final int method1006(byte arg0) {
        int var2 = 43 / ((arg0 - 50) / 35);
        ++field1923;
        return (int) super.field5043;
    }
}
