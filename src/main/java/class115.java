import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class115 extends class322 {

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "I")
    public static int field1387 = 0;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!uaa", name = "v", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "[[I")
    public static int[][] field1388;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)V", line = 3)
    public static final void method801(int arg0) {
        if (arg0 == 0) {
            ++field1385;
            class238.field3180.method4023((byte) -128);
            class347.field4909.method4023((byte) 65);
            class297.field4177.method4023((byte) 82);
            class167.field2290.method4023((byte) 54);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I", line = 17)
    public final int method17(byte arg0) {
        ++field1382;
        if (super.field4450.method2753(true).method1130((byte) -83) < 96) {
            return 0;
        } else {
            int var2 = 116 % ((arg0 - 70) / 51);
            return 2;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(Z)I", line = 33)
    public final int method802(boolean arg0) {
        if (arg0) {
            field1388 = null;
        }
        ++field1381;
        return super.field4451;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)I", line = 45)
    public final int method19(int arg0, int arg1) {
        ++field1384;
        if (~super.field4450.method2753(true).method1130((byte) -83) > -97) {
            return 3;
        } else {
            if (arg1 < 10) {
                this.method19(42, 115);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(ILch;)V", line = 61)
    public class115(int arg0, class463 arg1) {
        super(arg0, arg1);
        class597.method3365((byte) 127, super.field4451);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V", line = 69)
    public final void method23(boolean arg0) {
        if (super.field4450.method2753(true).method1130((byte) -83) < 96) {
            super.field4451 = 0;
        }
        ++field1380;
        if (!arg0) {
            if (super.field4451 < 0 || super.field4451 > 2) {
                super.field4451 = this.method17((byte) -68);
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)V", line = 88)
    public final void method22(int arg0, int arg1) {
        ++field1390;
        super.field4451 = arg1;
        if (arg0 != 0) {
            method801(117);
        }
        class597.method3365((byte) 126, super.field4451);
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lch;)V", line = 102)
    public class115(class463 arg0) {
        super(arg0);
        class597.method3365((byte) -19, super.field4451);
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(Z)I", line = 112)
    public static final int method803(boolean arg0) {
        ++field1383;
        return !arg0 ? -125 : class348.field4922;
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)V", line = 123)
    public static void method804(int arg0) {
        if (arg0 < 29) {
            method805((byte) 110);
        }
        field1388 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)I", line = 138)
    public static final int method805(byte arg0) {
        if (arg0 != 53) {
            method801(-59);
        }
        ++field1389;
        return ~class221.field2883 == -2 ? class712.field9900 : class586.field8252;
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)Z", line = 153)
    public final boolean method806(byte arg0) {
        if (arg0 != -53) {
            field1388 = null;
        }
        ++field1386;
        return ~super.field4450.method2753(true).method1130((byte) -83) <= -97;
    }
}
