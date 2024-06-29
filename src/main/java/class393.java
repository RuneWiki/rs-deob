import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class393 {

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public int field5522 = 1;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Lot;")
    public static class255 field5521 = new class255();

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Z")
    public static boolean field5523 = true;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Ltm;")
    public static class112 field5524 = new class112(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!am", name = "f", descriptor = "C")
    public char field5526;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Lcr;")
    public static class195 field5529;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILlk;I)V")
    private final void method2345(int arg0, class425 arg1, int arg2) {
        if (arg0 == 1) {
            this.field5526 = class104.method665(arg1.method2480(-8315), (byte) 69);
        } else if (arg0 == 2) {
            this.field5522 = 0;
        }
        int var4 = 65 / ((arg2 + 68) / 41);
        field5528++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public static void method2346(boolean arg0) {
        field5521 = null;
        field5524 = null;
        if (!arg0) {
            field5523 = true;
        }
        field5529 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Llk;Z)V")
    public final void method2347(class425 arg0, boolean arg1) {
        field5527++;
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                if (arg1) {
                    field5523 = true;
                    return;
                } else {
                    return;
                }
            }
            this.method2345(var3, arg0, -117);
        }
    }
}
