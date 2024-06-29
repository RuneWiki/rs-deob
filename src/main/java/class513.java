import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class513 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field7610 = 1;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[C")
    public static char[] field7608 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "C")
    public char field7613;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lds;")
    public static class12 field7614;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lmc;")
    public static class242 field7615;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILtl;)V", line = 8)
    public final void method3052(int arg0, class91 arg1) {
        field7609++;
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                int var4 = -103 / ((arg0 - 47) / 39);
                return;
            }
            this.method3053(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ltl;ZI)V", line = 27)
    private final void method3053(class91 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field7608 = null;
        }
        if (arg2 == 1) {
            this.field7613 = class396.method2437(arg0.method619((byte) -23), -5513);
        } else if (arg2 == 2) {
            this.field7610 = 0;
        }
        field7612++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 57)
    public static void method3054(byte arg0) {
        if (arg0 >= -101) {
            method3054((byte) 108);
        }
        field7615 = null;
        field7614 = null;
        field7608 = null;
    }
}
