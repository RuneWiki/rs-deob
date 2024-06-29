import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class325 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljm;")
    public static class591 field4373 = new class591();

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "[I")
    public static int[] field4376 = new int[1];

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lej;")
    public static class104 field4375 = new class104("Loading shaders", "Lade shaders", "Chargement des nuanceurs", "Carregando sombreamento - ");

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method2013(byte arg0) {
        field4376 = null;
        field4375 = null;
        field4373 = null;
        if (arg0 <= 74) {
            field4375 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4372++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(II)V")
    public class325(int arg0, int arg1) {
    }
}
