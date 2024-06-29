import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class344 {

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field4768;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Z")
    public static boolean field4773 = false;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Lbv;")
    public static class568 field4774;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "Luda;")
    public static class509 field4775;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!vt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4770++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
    public static final void method2156(int arg0, int arg1) {
        class253.field3154 = arg0;
        field4772++;
        class58 var2 = class255.field3171;
        synchronized (class255.field3171) {
            class255.field3171.method315(1);
            if (arg1 <= 30) {
                field4771 = 54;
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method2157(int arg0, int arg1) {
        if (arg1 != 4074) {
            field4771 = -67;
        }
        field4769++;
        return this.field4768[arg0];
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class344(String arg0, String arg1, String arg2, String arg3) {
        this.field4768 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method2158(int arg0) {
        field4774 = null;
        field4775 = null;
        if (arg0 != -26607) {
            method2158(73);
        }
    }

    static {
        new class344("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field4774 = new class568();
        field4775 = new class509(1);
    }
}
