import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class579 {

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Lnj;")
    public static class487 field8527 = new class487(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "[Lcba;")
    public static class234[] field8530;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "Lqq;")
    public static class599 field8529;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Z")
    public static boolean field8531;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLas;)V")
    public static final void method3381(byte arg0, class25 arg1) {
        arg1.field221 = null;
        field8526++;
        if (class141.field1847 < 20) {
            class233.field3434.method770(-65537, arg1);
            class141.field1847++;
        }
        if (arg0 >= -126) {
            method3381((byte) 80, null);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public static final void method3382(byte arg0) {
        for (int var1 = 0; var1 < class68.field779; var1++) {
            class585 var2 = class10.field94[var1];
            if (var2.field8695 == 2) {
                if (var2.field8696 == null) {
                    var2.field8694 = Integer.MIN_VALUE;
                } else {
                    class105.field1321.method2085(var2.field8696);
                }
            }
        }
        field8525++;
        if (arg0 > -94) {
            field8528 = -10;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public static void method3383(int arg0) {
        if (arg0 != 0) {
            field8530 = null;
        }
        field8527 = null;
        field8530 = null;
        field8529 = null;
    }

    static {
        new class487("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field8530 = new class234[1024];
        field8529 = new class599();
        field8532 = 0;
        field8531 = false;
    }
}
