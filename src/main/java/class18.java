import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class18 extends RuntimeException {

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "Ljava/lang/String;")
    public String field179;

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field180;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Lta;")
    public static class37 field178 = class20.method87(-83, "Shield Shop");

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "Lta;")
    public static class37 field181 = class20.method87(-94, "Summoning Obelisk");

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "Lta;")
    public static class37 field177 = class20.method87(-83, "Transportation");

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 15)
    public static final void method85(int arg0) {
        if (class3.field23.toLowerCase().indexOf("microsoft") == -1) {
            if (class3.field37 == null) {
                class31.field460[222] = 59;
                class31.field460[192] = 58;
            } else {
                class31.field460[192] = 28;
                class31.field460[222] = 58;
                class31.field460[520] = 59;
            }
            class31.field460[44] = 71;
            class31.field460[61] = 27;
            class31.field460[45] = 26;
            class31.field460[47] = 73;
            class31.field460[59] = 57;
            class31.field460[46] = 72;
            class31.field460[92] = 74;
            class31.field460[93] = 43;
            class31.field460[91] = 42;
        } else {
            class31.field460[190] = 72;
            class31.field460[191] = 73;
            class31.field460[192] = 58;
            class31.field460[222] = 59;
            class31.field460[219] = 42;
            class31.field460[220] = 74;
            class31.field460[188] = 71;
            class31.field460[221] = 43;
            class31.field460[186] = 57;
            class31.field460[187] = 27;
            class31.field460[223] = 28;
            class31.field460[189] = 26;
        }
        if (arg0 != 71) {
            field177 = null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(I)V", line = 67)
    public static void method86(int arg0) {
        field177 = null;
        if (arg0 != 46) {
            method85(107);
        }
        field178 = null;
        field181 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 89)
    public class18(Throwable arg0, String arg1) {
        this.field179 = arg1;
        this.field180 = arg0;
    }
}
