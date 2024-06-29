import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class648 extends class60 {

    @OriginalMember(owner = "client!kia", name = "n", descriptor = "Lhj;")
    public static class596 field8835 = new class596(52, 3);

    @OriginalMember(owner = "client!kia", name = "k", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!kia", name = "l", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!kia", name = "m", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!kia", name = "o", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!kia", name = "q", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!kia", name = "r", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!kia", name = "s", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!kia", name = "t", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!kia", name = "u", descriptor = "Lhu;")
    public static class143 field8842;

    @OriginalMember(owner = "client!kia", name = "v", descriptor = "Ltf;")
    public static class312 field8843;

    @OriginalMember(owner = "client!kia", name = "p", descriptor = "[I")
    public static int[] field8837;

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(II)I", line = 3)
    public final int method406(int arg0, int arg1) {
        ++field8834;
        return arg0 != 0 ? -107 : 1;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V", line = 15)
    public static void method3654(int arg0) {
        field8837 = null;
        field8842 = null;
        if (arg0 != -1) {
            field8837 = null;
        }
        field8843 = null;
        field8835 = null;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Les;Z)V", line = 29)
    public static final void method3655(class403 arg0, boolean arg1) {
        ++field8840;
        if (arg0.field5275.length + -arg0.field5262 >= 1) {
            if (arg1) {
                field8835 = null;
            }
            int var2 = arg0.method2396((byte) 118);
            if (~var2 <= -1 && ~var2 >= -2) {
                if (arg0.field5275.length + -arg0.field5262 >= 2) {
                    int var3 = arg0.method2390((byte) -125);
                    if (~(var3 * 6) >= ~(arg0.field5275.length - arg0.field5262)) {
                        for (int var4 = 0; var3 > var4; ++var4) {
                            int var5 = arg0.method2390((byte) 35);
                            int var6 = arg0.method2381((byte) 95);
                            if (var5 < class480.field6716.length && class307.field3801[var5] && (class708.field9940.method2795(124, var5).field7211 != '1' || ~var6 <= 0 && var6 <= 1)) {
                                class480.field6716[var5] = var6;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)I", line = 77)
    public final int method3656(int arg0) {
        if (arg0 != 0) {
            return -6;
        } else {
            ++field8836;
            return super.field799;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(BI)V", line = 88)
    public final void method407(byte arg0, int arg1) {
        int var3 = 85 % ((arg0 - 28) / 50);
        ++field8832;
        super.field799 = arg1;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Z)I", line = 100)
    public final int method405(boolean arg0) {
        ++field8841;
        return arg0 ? -101 : 0;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)Z", line = 115)
    public static final boolean method3657(int arg0, int arg1, int arg2) {
        ++field8839;
        if (arg2 != -1) {
            method3655((class403) null, true);
        }
        return ~(393216 & arg1) != -1 | class473.method2827(arg0, arg1, 110) || class388.method2276(arg1, arg2 ^ 5844, arg0) || class52.method475(arg1, arg0, (byte) 8);
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(B)V", line = 127)
    public final void method409(byte arg0) {
        ++field8833;
        if (arg0 >= -27) {
            this.method409((byte) 40);
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(ILhd;)V", line = 137)
    public class648(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lhd;)V", line = 142)
    public class648(class773 arg0) {
        super(arg0);
    }
}
