import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class425 extends class108 {

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static final void method2495(int arg0) {
        field5749++;
        if (arg0 != 0) {
            field5750 = -124;
        }
        class155.field2008.method315(1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
    public static final void method2496(int arg0, byte arg1) {
        field5748++;
        class579.field8064 = arg0;
        if (arg1 > -61) {
            field5751 = -40;
        }
        class583.field8437.method315(1);
    }

    static {
        new class344("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field5750 = 0;
        field5751 = 0;
    }
}
