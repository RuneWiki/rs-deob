import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class96 extends class260 {

    @OriginalMember(owner = "client!eha", name = "m", descriptor = "Lfba;")
    public static class27 field1091 = new class27(63, -1);

    @OriginalMember(owner = "client!eha", name = "q", descriptor = "I")
    public static int field1095 = 0;

    @OriginalMember(owner = "client!eha", name = "u", descriptor = "S")
    public static short field1099 = 1;

    @OriginalMember(owner = "client!eha", name = "s", descriptor = "I")
    public static int field1097 = 0;

    @OriginalMember(owner = "client!eha", name = "h", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!eha", name = "i", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!eha", name = "j", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!eha", name = "k", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!eha", name = "l", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!eha", name = "n", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!eha", name = "o", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!eha", name = "p", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!eha", name = "t", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!eha", name = "r", descriptor = "Ld;")
    public static class160 field1096;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(BLqfa;III)Lcw;", line = 4)
    public static final class192 method696(byte arg0, class106 arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 38) {
            field1091 = null;
        }
        ++field1098;
        if (!arg1.field1515 && (!class262.method1704(arg4, 3) || !class262.method1704(arg3, arg0 + -35))) {
            return !arg1.field1517 ? new class192(arg1, arg2, arg4, arg3, class433.method2595(arg4, (byte) -82), class433.method2595(arg3, (byte) -82)) : new class192(arg1, 34037, arg2, arg4, arg3);
        } else {
            return new class192(arg1, 3553, arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "(I)I", line = 25)
    public final int method697(int arg0) {
        if (arg0 > -14) {
            method696((byte) -21, (class106) null, -105, 20, 90);
        }
        ++field1092;
        return super.field3828;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IB)V", line = 37)
    public final void method128(int arg0, byte arg1) {
        ++field1093;
        super.field3828 = arg0;
        if (arg1 != 122) {
            field1099 = -122;
        }
    }

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "(I)Z", line = 50)
    public final boolean method698(int arg0) {
        ++field1089;
        if (arg0 < 73) {
            field1091 = null;
        }
        return !super.field3829.method4076(-5569);
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(BI)I", line = 66)
    public static final int method699(byte arg0, int arg1) {
        if (arg0 <= 44) {
            method701((byte) 41);
        }
        ++field1094;
        return arg1 & 127;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V", line = 77)
    public final void method126(int arg0) {
        ++field1087;
        if (super.field3829.method4076(-5569)) {
            super.field3828 = 0;
        }
        if (~super.field3828 > -1 && ~super.field3828 < -3) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 < 102) {
            field1099 = 123;
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V", line = 95)
    public static void method700(byte arg0) {
        if (arg0 < 0) {
            field1091 = null;
        }
        field1096 = null;
        field1091 = null;
    }

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(ILgn;)V", line = 107)
    public class96(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(Lgn;)V", line = 112)
    public class96(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "(II)I", line = 115)
    public final int method129(int arg0, int arg1) {
        ++field1088;
        if (super.field3829.method4076(-5569)) {
            return 3;
        } else {
            return ~arg1 != arg0 && ~super.field3829.field10089.method124(-52) != -2 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "(B)V", line = 130)
    public static final void method701(byte arg0) {
        class757.method4205((byte) -111);
        ++field1090;
        class154.field2189 = 0;
        class467.field6559 = null;
        class197.field3014 = null;
        class518.field7312 = null;
        class110.field1640.field7042 = 0;
        class625.field8754 = 0;
        class15.field293 = 0;
        class556.field7934 = null;
        class678.method3844(0);
        if (arg0 <= 0) {
            field1095 = 20;
        }
        class214.method1471(86);
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class767.field10560[var1] = null;
        }
        class210.field3250 = null;
        for (int var2 = 0; var2 < class36.field483; ++var2) {
            class665 var4 = class164.field2601[var2].field3181;
            if (var4 != null) {
                var4.field4584 = -1;
            }
        }
        class717.method4022((byte) 78);
        class375.field5176 = -1;
        class429.field5830 = -1;
        class416.field5704 = 1;
        class225.method1539(false, 10);
        for (int var3 = 0; var3 < 100; ++var3) {
            class698.field9719[var3] = true;
        }
        class301.method1949(-83);
        class714.field9901 = 0L;
        class262.field3846 = null;
    }

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "(I)I", line = 195)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return 8;
        } else {
            ++field1086;
            return 1;
        }
    }
}
