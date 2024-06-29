import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class207 extends class601 {

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "D")
    public static double field2713;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 3)
    public static final boolean method1241(String arg0, int arg1) {
        ++field2712;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~class239.field3558 < ~var2; ++var2) {
                if (arg0.equalsIgnoreCase(class193.field2627[var2])) {
                    return true;
                }
            }
            if (arg1 != 3) {
                field2713 = 1.3755539809711526D;
            }
            return arg0.equalsIgnoreCase(class388.field5601.field1313);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(ILqea;)V", line = 35)
    public class207(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V", line = 38)
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        int var3 = 6 / ((arg0 - 22) / 34);
        ++field2707;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)I", line = 51)
    public final int method1242(int arg0) {
        ++field2705;
        return arg0 != 0 ? 14 : super.field8131;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 63)
    public final void method41(byte arg0) {
        super.field8131 = this.method45(8976);
        int var2 = 111 % ((arg0 - 59) / 33);
        ++field2710;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lqea;)V", line = 75)
    public class207(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)I", line = 86)
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            return -54;
        } else {
            ++field2706;
            return 3;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)Lnk;", line = 98)
    public static final class429 method1243(byte arg0) {
        ++field2708;
        class429 var1 = (class429) class528.field7319.method1644(-23698);
        if (var1 != null) {
            --class451.field6256;
            return var1;
        } else {
            if (arg0 != -83) {
                method1241((String) null, 66);
            }
            return new class429();
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I", line = 118)
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            field2713 = -1.2659307372346316D;
        }
        ++field2709;
        return super.field8137.method2153(-9) == class540.field7508 && super.field8137.method2161(0) ? 0 : 1;
    }
}
