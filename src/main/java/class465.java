import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class465 extends class449 {

    @OriginalMember(owner = "client!on", name = "s", descriptor = "Z")
    public boolean field6550;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public int field6555;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public int field6551;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    public int field6554;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public int field6553;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public int field6552;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "Lap;")
    public static class310 field6548 = new class310(35, 8);

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lvc;Lnl;I)V")
    public static final void method2774(class89 arg0, class435 arg1, int arg2) {
        field6549++;
        if (class281.field4046) {
            return;
        }
        arg0.method373(0);
        int var3 = 5 / ((arg2 - 10) / 53);
        class318.field4497 = arg0.method302(class355.method2190(arg1, class284.field4074), true);
        class318.field4497.method2493((class364.field5007 - class318.field4497.method1294()) / 2, (class431.field6099 - class318.field4497.method1295()) / 2);
        class464.field6545 = arg0.method302(class355.method2190(arg1, class366.field5026), true);
        class464.field6545.method2493((class364.field5007 - class464.field6545.method1294()) / 2, 18);
        class281.field4046 = true;
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V")
    public static void method2775(int arg0) {
        if (arg0 != -21044) {
            field6548 = null;
        }
        field6548 = null;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(IIIIIZ)V")
    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field6550 = arg5;
        this.field6555 = arg3;
        this.field6551 = arg2;
        this.field6554 = arg4;
        this.field6553 = arg0;
        this.field6552 = arg1;
    }

    static {
        new class151("Select", "Auswählen", "Sélectionner", "Selecionar");
    }
}
