import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 extends class260 {

    @OriginalMember(owner = "client!sja", name = "i", descriptor = "I")
    public static int field213 = 0;

    @OriginalMember(owner = "client!sja", name = "m", descriptor = "Ljo;")
    public static class353 field217 = new class353(8);

    @OriginalMember(owner = "client!sja", name = "p", descriptor = "[I")
    public static int[] field220 = new int[1000];

    @OriginalMember(owner = "client!sja", name = "h", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!sja", name = "j", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!sja", name = "k", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!sja", name = "l", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!sja", name = "n", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!sja", name = "o", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!sja", name = "q", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(ILgn;)V", line = 5)
    public class11(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method122(int arg0, int arg1, int arg2) {
        if (arg1 != -12305) {
            method127(-90);
        }
        ++field221;
        return (arg0 & 55) != 0;
    }

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "(I)I", line = 19)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return 80;
        } else {
            ++field218;
            return 1;
        }
    }

    @OriginalMember(owner = "client!sja", name = "d", descriptor = "(I)I", line = 30)
    public final int method124(int arg0) {
        ++field214;
        if (arg0 > -14) {
            field220 = null;
        }
        return super.field3828;
    }

    @OriginalMember(owner = "client!sja", name = "e", descriptor = "(I)Z", line = 41)
    public final boolean method125(int arg0) {
        ++field219;
        if (super.field3829.method4076(-5569)) {
            return false;
        } else if (super.field3829.method4081(24) == class422.field5780) {
            return true;
        } else {
            if (arg0 <= 73) {
                this.method123(122);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V", line = 61)
    public final void method126(int arg0) {
        if (super.field3829.method4081(24) != class422.field5780) {
            super.field3828 = 1;
        } else if (super.field3829.method4076(-5569)) {
            super.field3828 = 0;
        }
        ++field215;
        if (arg0 < 102) {
            this.method128(60, (byte) 0);
        }
        if (super.field3828 != 0 && ~super.field3828 != -2) {
            super.field3828 = this.method123(4377);
        }
    }

    @OriginalMember(owner = "client!sja", name = "f", descriptor = "(I)V", line = 83)
    public static void method127(int arg0) {
        field220 = null;
        if (arg0 != 21963) {
            field217 = null;
        }
        field217 = null;
    }

    @OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(Lgn;)V", line = 102)
    public class11(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(IB)V", line = 115)
    public final void method128(int arg0, byte arg1) {
        ++field216;
        super.field3828 = arg0;
        if (arg1 != 122) {
            field213 = 6;
        }
    }

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "(II)I", line = 126)
    public final int method129(int arg0, int arg1) {
        ++field212;
        if (super.field3829.method4076(arg0 ^ 5568)) {
            return 3;
        } else if (arg0 != -1) {
            return -19;
        } else if (super.field3829.method4081(24) == class422.field5780) {
            if (~arg1 == -1) {
                if (~super.field3829.field10091.method1432(-65) == -2) {
                    return 2;
                }
                if (super.field3829.field10057.method1024(-42) == 1) {
                    return 2;
                }
                if (super.field3829.field10072.method697(-31) > 0) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }
}
