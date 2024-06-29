import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class714 extends class260 {

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "[C")
    public static char[] field9988 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
    public static int field9980;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    public static int field9982;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
    public static int field9985;

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
    public static int field9987;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)I", line = 3)
    public final int method3993(int arg0) {
        ++field9986;
        if (arg0 < 3) {
            method3996((byte) -102);
        }
        return super.field3868;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IB)I", line = 14)
    public final int method4(int arg0, byte arg1) {
        int var3 = -50 % ((arg1 - -53) / 50);
        ++field9987;
        return 1;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIZLpu;I)V", line = 26)
    public static final void method3994(int arg0, int arg1, boolean arg2, class589 arg3, int arg4) {
        ++field9980;
        for (class39 var5 = (class39) class255.field3809.method2551((byte) -108); var5 != null; var5 = (class39) class255.field3809.method2542(-114)) {
            if (var5.field618 == arg0 && ~(arg1 << 9) == ~var5.field627 && arg4 << 9 == var5.field612 && var5.field593.field7856 == arg3.field7856) {
                if (var5.field611 != null) {
                    class686.field9647.method590(var5.field611);
                    var5.field611 = null;
                }
                if (var5.field616 != null) {
                    class686.field9647.method590(var5.field616);
                    var5.field616 = null;
                }
                var5.method792((byte) -125);
                return;
            }
        }
        if (arg2) {
            field9988 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(IB)V", line = 67)
    public final void method9(int arg0, byte arg1) {
        super.field3868 = arg0;
        ++field9984;
        if (arg1 != -107) {
            field9981 = -23;
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(ILfca;)V", line = 79)
    public class714(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIZ)Z", line = 83)
    public static final boolean method3995(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field9981 = 117;
        }
        ++field9983;
        return (arg0 & 32768) != 0;
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lfca;)V", line = 94)
    public class714(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)V", line = 97)
    public final void method2(boolean arg0) {
        if (!arg0) {
            ++field9982;
            if (super.field3868 < 0 && ~super.field3868 < -5) {
                super.field3868 = this.method8((byte) 4);
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)I", line = 111)
    public final int method8(byte arg0) {
        ++field9985;
        if (super.field3867.method733(67).method3990(-20773) > 1) {
            return 4;
        } else {
            if (arg0 != 4) {
                field9981 = 123;
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)V", line = 125)
    public static void method3996(byte arg0) {
        field9988 = null;
        if (arg0 > -86) {
            method3995(59, -125, false);
        }
    }
}
