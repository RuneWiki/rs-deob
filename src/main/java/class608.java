import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class608 extends class134 {

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "Lo;")
    public static class29 field8493 = new class29();

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    public static int field8501 = 1403;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "[Llv;")
    public static class446[] field8502 = new class446[4];

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "Lni;")
    public static class522 field8498;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "Lni;")
    public static class522 field8500;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        ++field8497;
        if (arg0 >= 118) {
            if (super.field1712.method2277((byte) 104) == class257.field3338) {
                if (super.field1712.method2282((byte) 117)) {
                    super.field1708 = 0;
                }
            } else {
                super.field1708 = 1;
            }
            if (super.field1708 != 0 && super.field1708 != 1) {
                super.field1708 = this.method58(0);
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            this.method57(68, 122);
        }
        ++field8492;
        if (super.field1712.method2277((byte) 104) == class257.field3338) {
            if (super.field1712.method2282((byte) 114)) {
                return 3;
            } else {
                return arg0 != 0 && super.field1712.field5499.method249((byte) 126) != 1 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)V")
    public static final void method3357(int arg0) {
        if (class743.field10333 != null) {
            for (int var1 = 0; ~class282.field3738 < ~var1; ++var1) {
                class743.field10333[var1] = null;
            }
            class743.field10333 = null;
        }
        ++field8490;
        if (arg0 != 0) {
            field8502 = null;
        }
        if (class431.field6085 != null) {
            for (int var2 = 0; ~var2 > ~class387.field5458; ++var2) {
                class431.field6085[var2] = null;
            }
            class431.field6085 = null;
        }
        if (class393.field5575 != null) {
            for (int var3 = 0; var3 < class60.field631; ++var3) {
                class393.field5575[var3] = null;
            }
            class393.field5575 = null;
        }
        class462.field6395 = null;
        class648.field9025 = null;
        class547.field7720 = -1;
        class38.field394 = -1;
        class435.field6105 = null;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)I")
    public final int method3358(byte arg0) {
        ++field8489;
        if (arg0 <= 119) {
            method3361(-83);
        }
        return super.field1708;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        ++field8495;
        int var3 = 68 % ((arg0 - -26) / 41);
        super.field1708 = arg1;
    }

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "(I)Z")
    public final boolean method3359(int arg0) {
        if (arg0 != -1) {
            method3357(-77);
        }
        ++field8491;
        if (super.field1712.method2277((byte) 104) == class257.field3338) {
            return !super.field1712.method2282((byte) 120);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lkda;)V")
    public class608(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)Lnha;")
    public static final class325 method3360(byte arg0) {
        ++field8496;
        try {
            if (arg0 != 5) {
                method3361(20);
            }
            return (class325) Class.forName("uea").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "(I)V")
    public static void method3361(int arg0) {
        field8498 = null;
        field8493 = null;
        if (arg0 != 0) {
            method3360((byte) 45);
        }
        field8500 = null;
        field8502 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        ++field8494;
        if (arg0 != 0) {
            field8498 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(ILkda;)V")
    public class608(int arg0, class391 arg1) {
        super(arg0, arg1);
    }
}
