import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class206 {

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    private int field2760;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lea;")
    public static class474 field2761 = new class474("Loading shaders", "Lade shaders", "Chargement des nuanceurs", "Carregando sombreamento - ");

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Z")
    public static boolean field2767 = false;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lkca;")
    public static class73 field2764 = new class73(69, -1);

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Le;")
    public static class462 field2762;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[Lxa;")
    public static class433[] field2768;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I", line = 13)
    public final int method1318(int arg0) {
        field2766++;
        int var2 = -56 / ((-arg0 - 15) / 60);
        return this.field2760;
    }

    @OriginalMember(owner = "client!ig", name = "toString", descriptor = "()Ljava/lang/String;", line = 25)
    public final String toString() {
        field2763++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V", line = 37)
    public static void method1319(int arg0) {
        if (arg0 == 0) {
            field2764 = null;
            field2761 = null;
            field2762 = null;
            field2768 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(II)V", line = 61)
    public class206(int arg0, int arg1) {
        this.field2765 = arg1;
        this.field2760 = arg0;
    }
}
