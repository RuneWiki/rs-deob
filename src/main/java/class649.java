import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class649 extends class260 {

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
    public static int field9066 = 0;

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lwia;BILwia;)V")
    public static final void method3717(class791 arg0, byte arg1, int arg2, class791 arg3) {
        class216.field3355 = arg0;
        ++field9070;
        class339.field4744 = arg3;
        if (arg1 >= -89) {
            method3717((class791) null, (byte) -28, 51, (class791) null);
        }
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)I")
    public static final int method3718(int arg0) {
        if (arg0 != 1) {
            field9066 = -119;
        }
        ++field9073;
        return class316.field4490;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IB)V")
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        ++field9069;
        if (arg1 != 122) {
            field9066 = 102;
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lgn;)V")
    public class649(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(ILgn;)V")
    public class649(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "(I)I")
    public final int method3719(int arg0) {
        if (arg0 >= -14) {
            this.method123(31);
        }
        ++field9068;
        return super.field3828;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)I")
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return -81;
        } else {
            ++field9067;
            return 1;
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            return -84;
        } else {
            ++field9071;
            return 1;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        ++field9072;
        if (arg0 <= 102) {
            field9066 = -72;
        }
        if (~super.field3828 != -2 && super.field3828 != 0) {
            super.field3828 = this.method123(4377);
        }
    }

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "(I)V")
    public static final void method3720(int arg0) {
        class126.field1953 = arg0;
        for (int var1 = 0; var1 < class81.field902; ++var1) {
            for (int var2 = 0; var2 < class48.field615; ++var2) {
                if (class767.field10562[arg0][var1][var2] == null) {
                    class767.field10562[arg0][var1][var2] = new class46(arg0);
                }
            }
        }
    }
}
