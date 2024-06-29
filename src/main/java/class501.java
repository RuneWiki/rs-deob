import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class501 {

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "Los;")
    private class468 field7496;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "J")
    public long field7498;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "Z")
    public static boolean field7500;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7497;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public static void method3011(byte arg0) {
        if (arg0 < 110) {
            method3012(-23, -52);
        }
        field7497 = null;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)I")
    public static final int method3012(int arg0, int arg1) {
        return class206.field3077 == null ? 0 : class206.field3077[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Los;J[Lvt;)V")
    public class501(class468 arg0, long arg1, class346[] arg2) {
        this.field7496 = arg0;
        this.field7498 = arg1;
    }

    @OriginalMember(owner = "client!dca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7496.method2840(this.field7498, 9);
        field7501++;
        super.finalize();
    }

    static {
        new class487("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field7499 = 0;
        field7500 = false;
    }
}
