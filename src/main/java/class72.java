import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class72 extends InputStream {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Ljn;")
    public static class409 field935 = new class409("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lvq;")
    public static class24 field936 = new class24(57, -2);

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "[I")
    public static int[] field938 = new int[32];

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Ljn;")
    public static class409 field939 = new class409("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lvq;")
    public static class24 field940 = new class24(77, 7);

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Z")
    public static boolean field941 = false;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lh;")
    public static class440 field933;

    @OriginalMember(owner = "client!kh", name = "read", descriptor = "()I", line = 6)
    public final int read() {
        field937++;
        class418.method2587(false, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 21)
    public static void method519(boolean arg0) {
        field940 = null;
        field936 = null;
        field933 = null;
        field939 = null;
        field935 = null;
        if (!arg0) {
            method519(false);
        }
        field938 = null;
    }
}
