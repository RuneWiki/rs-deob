import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class103 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field1746 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1741 = 0;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILja;I)V", line = 8)
    private final void method803(int arg0, class60 arg1, int arg2) {
        if (arg0 != 4358) {
            method805(28, (class75) null);
        }
        if (arg2 == 5) {
            this.field1746 = arg1.method485((byte) -2);
        }
        field1742++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lja;B)V", line = 33)
    public final void method804(class60 arg0, byte arg1) {
        field1744++;
        while (true) {
            int var3 = arg0.method501(0);
            if (var3 == 0) {
                if (arg1 < 48) {
                    this.field1746 = -113;
                }
                return;
            }
            this.method803(4358, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILwa;)I", line = 58)
    public static final int method805(int arg0, class75 arg1) {
        field1743++;
        if (arg0 >= -44) {
            return -115;
        }
        for (int var2 = 0; var2 < class216.field3688.length; var2++) {
            if (class216.field3688[var2].method614(arg1, -66)) {
                return var2;
            }
        }
        return -1;
    }
}
