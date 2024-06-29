import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class54 extends class479 {

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public int field628 = -1;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Ljc;")
    public static class305 field625 = new class305("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Z")
    public static boolean field630 = true;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Ljava/lang/String;")
    public String field626;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Ljava/lang/String;")
    public String field629;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "[Lav;")
    public static class454[] field623;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V", line = 5)
    public static void method320(byte arg0) {
        field623 = null;
        if (arg0 != -75) {
            field625 = null;
        }
        field625 = null;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)Lqb;", line = 16)
    public final class151 method321(int arg0) {
        ++field624;
        return arg0 > -9 ? null : class527.field7742[super.field7091];
    }
}
