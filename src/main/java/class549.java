import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class549 extends class188 {

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field8068;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field8067 = 0;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class549(Object arg0, int arg1) {
        super(arg1);
        this.field8068 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Z")
    public static final boolean method3217(int arg0, byte arg1) {
        if (arg1 <= 118) {
            return true;
        } else {
            field8063++;
            return arg0 == 2 || arg0 == 6 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)I")
    public static final int method3218(int arg0, int arg1, byte arg2) {
        field8066++;
        if (arg2 <= 14) {
            method3217(-116, (byte) 117);
        }
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)Z")
    public final boolean method122(byte arg0) {
        field8069++;
        if (arg0 <= 38) {
            this.method121((byte) -13);
        }
        return false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method121(byte arg0) {
        int var2 = 15 % ((arg0 - 67) / 48);
        field8065++;
        return this.field8068;
    }
}
