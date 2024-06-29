import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class156 extends class202 {

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field2372;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "Lqp;")
    public static class466 field2371 = new class466("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1038(boolean arg0) {
        field2371 = null;
        if (!arg0) {
            field2371 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 15)
    public final Object method1039(int arg0) {
        field2373++;
        if (arg0 != 0) {
            this.field2372 = null;
        }
        return this.field2372;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;)V", line = 26)
    public static final void method1040(int arg0, String arg1) {
        if (arg0 != -21411) {
            return;
        }
        field2374++;
        if (class63.field790 == null) {
            class515.method3073(500);
        }
        String[] var2 = class38.method284('\n', arg1, false);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class410.field5996; var4 > 0; var4--) {
                class63.field790[var4] = class63.field790[var4 - 1];
            }
            class63.field790[0] = var2[var3];
            if (class410.field5996 < class63.field790.length - 1) {
                class410.field5996++;
                if (class6.field107 > 0) {
                    class6.field107++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Z", line = 69)
    public final boolean method1041(byte arg0) {
        if (arg0 >= -106) {
            this.method1041((byte) -83);
        }
        field2375++;
        return false;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 88)
    public class156(Object arg0, int arg1) {
        super(arg1);
        this.field2372 = arg0;
    }
}
