import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class497 {

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Lsga;")
    public static class583 field7028 = new class583(64);

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "Lus;")
    public static class328 field7029 = new class328(47, 3);

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "[B")
    public static byte[] field7032 = new byte[520];

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lmq;")
    public static class78 field7031 = new class78(12, 3);

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public static int field7034 = 0;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "Lac;")
    public static class712 field7033;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V", line = 5)
    public static void method2885(byte arg0) {
        field7032 = null;
        field7033 = null;
        if (arg0 >= -19) {
            field7034 = -120;
        }
        field7031 = null;
        field7029 = null;
        field7028 = null;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V", line = 19)
    public static final void method2886(byte arg0) {
        field7030++;
        if (class542.field7641 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class48.field701.length; var2++) {
                if (class48.field701[var2].indexOf("--> ") != -1) {
                    int var10000 = ~class542.field7641;
                    var1++;
                    if (var10000 == ~var1) {
                        class534.field7501 = class48.field701[var2].substring(class48.field701[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        } else {
            class534.field7501 = "";
        }
        if (arg0 != -115) {
            method2887(50, null);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILnl;)Lnl;", line = 60)
    public static final class681 method2887(int arg0, class681 arg1) {
        field7027++;
        class681 var2 = arg1 == null ? new class681() : new class681(arg1);
        var2.method3664(128, arg0, (byte) 127);
        return var2;
    }
}
