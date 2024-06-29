import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class57 {

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    private int field892 = 0;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lub;")
    private class18 field894;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Z")
    public static boolean field885 = false;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "J")
    public static long field891 = 0L;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lvj;")
    public static class304 field886 = new class304("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lvj;")
    public static class304 field896 = new class304("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lda;")
    private class42 field888;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Lda;")
    public final class42 method406(boolean arg0) {
        field887++;
        if (arg0) {
            method408(null, -44, false);
        }
        if (this.field892 > 0 && this.field894.field299[this.field892 - 1] != this.field888) {
            class42 var2 = this.field888;
            this.field888 = var2.field619;
            return var2;
        }
        while (this.field892 < this.field894.field314) {
            class42 var3 = this.field894.field299[this.field892++].field619;
            if (this.field894.field299[this.field892 - 1] != var3) {
                this.field888 = var3.field619;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method407(byte arg0) {
        field896 = null;
        if (arg0 != 33) {
            field895 = 92;
        }
        field886 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lpc;IZ)Lre;")
    public static final class425 method408(class473 arg0, int arg1, boolean arg2) {
        field889++;
        if (!arg2) {
            field886 = null;
        }
        byte[] var3 = arg0.method2707(arg1, 0);
        return var3 == null ? null : new class425(var3);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static final void method409(int arg0) {
        class54.field859 = null;
        field890++;
        class292.method1716(0, -1, 0, arg0 ^ 0x4ACF, class175.field2555, class474.field6555, 0, 0, class149.field2132);
        if (arg0 != -19089) {
            field895 = -42;
        }
        if (class54.field859 != null) {
            class490.method2825(0, class175.field2555, class149.field2132, 4403, -1412584499, class195.field2712, 0, class155.field2266, class393.field5317.field5501, class54.field859);
            class54.field859 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Lda;")
    public final class42 method410(int arg0) {
        this.field892 = 0;
        field893++;
        if (arg0 != 1) {
            method408(null, 56, true);
        }
        return this.method406(false);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lub;)V")
    public class57(class18 arg0) {
        this.field894 = arg0;
    }
}
