import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class398 extends class311 {

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Ljb;")
    public class422 field5467;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lh;")
    public static class572 field5466 = new class572("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Z")
    public static boolean field5469 = false;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Lwf;")
    public static class117 field5471 = new class117(8);

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Lh;")
    public static class572 field5472 = new class572("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static void method2360(int arg0) {
        if (arg0 != 8) {
            method2361((byte) 118);
        }
        field5471 = null;
        field5466 = null;
        field5472 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)I")
    public static final int method2361(byte arg0) {
        field5468++;
        if (arg0 < 110) {
            method2360(-95);
        }
        return class333.field4617++;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lcb;II[B)V")
    public class398(class444 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5467 = arg0.method2622(false, arg2, 3000, arg3, arg1, class613.field9072);
        this.field5467.method1648(false, false, true);
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lcb;II[I)V")
    public class398(class444 arg0, int arg1, int arg2, int[] arg3) {
        this.field5467 = arg0.method2631(arg1, arg3, false, false, arg2);
        this.field5467.method1648(false, false, true);
    }
}
