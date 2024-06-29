import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public abstract class class553 extends class102 {

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "Lh;")
    public static class572 field8233 = new class572("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "Lh;")
    public static class572 field8240 = new class572("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public int field8232;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    public int field8235;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    public int field8237;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "Lde;")
    public static class455 field8236;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "Z")
    public boolean field8238;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZ)Ltda;", line = 4)
    public static final class546 method3342(int arg0, boolean arg1) {
        if (!arg1) {
            method3343(114);
        }
        field8231++;
        class546[] var2 = class66.method418(8);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field8154 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lqa;IZIILco;I)V", line = 28)
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        if (arg6 != 21130) {
            this.method180((byte) -49);
        }
        field8234++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(B)Z", line = 44)
    public final boolean method180(byte arg0) {
        if (arg0 == 58) {
            field8230++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "(I)V", line = 56)
    public final void method179(int arg0) {
        if (arg0 != 1) {
            this.method180((byte) 3);
        }
        field8239++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 72)
    public static void method3343(int arg0) {
        field8233 = null;
        field8240 = null;
        field8236 = null;
        if (arg0 != 0) {
            field8241 = -66;
        }
    }
}
