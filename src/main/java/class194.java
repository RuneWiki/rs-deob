import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class194 extends class152 {

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field2920;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "Lnj;")
    public static class487 field2922 = new class487("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "Lnj;")
    public static class487 field2923 = new class487("Profiling", "Profiling", "Profilage", "Profiling");

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class194(Object arg0, int arg1) {
        super(arg1);
        this.field2920 = arg0;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z")
    public final boolean method887(byte arg0) {
        field2918++;
        int var2 = -128 % ((75 - arg0) / 51);
        return false;
    }

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)V")
    public static void method1250(int arg0) {
        field2922 = null;
        field2923 = null;
        if (arg0 <= 81) {
            field2922 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)I")
    public static final int method1251(int arg0, int arg1, int arg2, int arg3) {
        field2921++;
        if (arg0 != 30683) {
            field2924 = -64;
        }
        if ((class237.field3473[arg1][arg3][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (class237.field3473[1][arg3][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method892(boolean arg0) {
        if (arg0) {
            field2922 = null;
        }
        field2919++;
        return this.field2920;
    }
}
