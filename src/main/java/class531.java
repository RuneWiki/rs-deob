import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class531 extends class491 {

    @OriginalMember(owner = "client!am", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field7816;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "Lhb;")
    public static class250 field7815 = new class250(80, 8);

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "Lfr;")
    public static class493 field7820;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 3)
    public final Object method2327(boolean arg0) {
        field7819++;
        if (!arg0) {
            field7815 = null;
        }
        return this.field7816;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(B)Z", line = 14)
    public final boolean method2326(byte arg0) {
        if (arg0 != 6) {
            method3144((byte) 62, -49);
        }
        field7817++;
        return false;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V", line = 25)
    public static void method3143(int arg0) {
        if (arg0 == -9) {
            field7815 = null;
            field7820 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)Z", line = 42)
    public static final boolean method3144(byte arg0, int arg1) {
        if (arg0 != -102) {
            method3144((byte) -61, -117);
        }
        field7818++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ls;Ljava/lang/Object;I)V", line = 54)
    public class531(class160 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7816 = arg1;
    }
}
