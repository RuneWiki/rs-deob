import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class20 {

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public int field293;

    static {
        new class157("Select", "Auswählen", "Sélectionner", "Selecionar");
        field294 = 64;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZI)Z", line = 3)
    public static final boolean method133(int arg0, boolean arg1, int arg2) {
        field292++;
        if (!arg1) {
            method133(113, true, -61);
        }
        return class356.method2127(arg0, arg2, false) & class159.method1132(arg1, arg2, arg0);
    }
}
