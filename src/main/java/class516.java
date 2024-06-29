import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class516 extends class484 {

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field7503;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
    public static int field7505 = 0;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "Lnv;")
    public static class44 field7506 = new class44();

    @OriginalMember(owner = "client!lw", name = "C", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "Lum;")
    public static class83 field7502;

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 4)
    public class516(Object arg0, int arg1) {
        super(arg1);
        this.field7503 = arg0;
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 13)
    public final Object method2842(byte arg0) {
        field7501++;
        if (arg0 != -15) {
            method3054(8);
        }
        return this.field7503;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Z", line = 25)
    public final boolean method2843(int arg0) {
        field7504++;
        if (arg0 != 20716) {
            field7505 = -85;
        }
        return false;
    }

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "(I)V", line = 39)
    public static void method3054(int arg0) {
        field7502 = null;
        field7506 = null;
        if (arg0 != 0) {
            method3054(80);
        }
    }
}
