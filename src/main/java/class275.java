import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class275 extends class208 {

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    private int field3728;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    private int field3736;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    private int field3727;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    private int field3734;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field3733 = -1;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field3735 = 0;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "Lza;")
    public static class295 field3737;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V")
    public final void method818(int arg0, int arg1, int arg2) {
        ++field3731;
        int var4 = this.field3736 * arg0 >> 12;
        if (arg2 != 32627) {
            field3733 = 4;
        }
        int var5 = this.field3734 * arg0 >> 12;
        int var6 = this.field3727 * arg1 >> 12;
        int var7 = this.field3728 * arg1 >> 12;
        class187.method1252(var6, var5, true, var7, var4, super.field2971);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public static void method1606(int arg0) {
        field3737 = null;
        if (arg0 != -121166164) {
            method1608((byte) -121, -53, 118);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZI)I")
    public static final int method1607(boolean arg0, int arg1) {
        ++field3732;
        if (arg1 < 96) {
            return 0;
        } else {
            if (!arg0) {
                method1607(false, 21);
            }
            return ~arg1 > -129 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZII)V")
    public final void method814(boolean arg0, int arg1, int arg2) {
        ++field3726;
        int var4 = this.field3736 * arg2 >> 12;
        int var5 = this.field3734 * arg2 >> 12;
        int var6 = this.field3727 * arg1 >> 12;
        if (arg0) {
            field3733 = 35;
        }
        int var7 = this.field3728 * arg1 >> 12;
        class266.method1566(-3, super.field2970, var6, var7, var5, var4, super.field2972, super.field2971);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BII)I")
    public static final int method1608(byte arg0, int arg1, int arg2) {
        if (arg0 != 121) {
            field3733 = -15;
        }
        ++field3729;
        return arg2 != 1 && ~arg2 != -4 ? class415.field6021[3 & arg1] : class516.field7577[3 & arg1];
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(III)V")
    public final void method820(int arg0, int arg1, int arg2) {
        ++field3730;
        int var4 = this.field3736 * arg0 >> 12;
        int var5 = this.field3734 * arg0 >> 12;
        if (arg2 != 31431) {
            this.method818(109, -5, -79);
        }
        int var6 = this.field3727 * arg1 >> 12;
        int var7 = this.field3728 * arg1 >> 12;
        class239.method1456(var5, 1, super.field2972, var7, var4, var6, super.field2970);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIII)V")
    public class275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3728 = arg3;
        this.field3736 = arg0;
        this.field3727 = arg1;
        this.field3734 = arg2;
    }

    static {
        new class157("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
    }
}
