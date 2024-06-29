import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class570 {

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    public static int field553 = 0;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)Z")
    public static final boolean method278(int arg0, int arg1) {
        ++field559;
        for (class300 var2 = (class300) class126.field2292.method1224(arg0 + 914424434); var2 != null; var2 = (class300) class126.field2292.method1232(-2)) {
            if (class219.method1522(72, var2.field4465) && ~((long) arg1) == ~var2.field4472) {
                return true;
            }
        }
        if (arg0 != -914424436) {
            method278(-125, -36);
        }
        return false;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIB)V")
    public final void method279(int arg0, int arg1, byte arg2) {
        ++field551;
        if (arg2 != 127) {
            this.field557 = 105;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)V")
    public final void method280(int arg0, int arg1, int arg2) {
        ++field561;
        if (arg1 != 38) {
            this.method280(79, -53, 36);
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZ)Z")
    public static final boolean method281(int arg0, boolean arg1) {
        ++field555;
        if (!arg1) {
            field553 = 118;
        }
        return ~arg0 == -11 || arg0 == 57 || arg0 == 1006 || arg0 == 2 || ~arg0 == -47;
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(IIIIII)V")
    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field560 = arg0;
        this.field557 = arg2;
        this.field556 = arg1;
        this.field552 = arg3;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZI)V")
    public final void method282(int arg0, boolean arg1, int arg2) {
        ++field554;
        int var4 = this.field560 * arg0 >> 12;
        int var5 = this.field557 * arg0 >> 12;
        int var6 = this.field556 * arg2 >> 12;
        if (arg1) {
            field558 = -27;
        }
        int var7 = this.field552 * arg2 >> 12;
        class645.method3678(var7, super.field8298, var4, true, var6, var5);
    }
}
