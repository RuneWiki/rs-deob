import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class385 extends class496 {

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public int field5633 = -1;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Z")
    public boolean field5637 = false;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field5632 = 0;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lnj;")
    public static class487 field5629 = new class487("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Z")
    public static boolean field5638 = false;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lqu;")
    public static class364 field5639 = new class364(54, 12);

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public int field5627;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public int field5630;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public int field5631;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public int field5634;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public int field5635;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lm;")
    public static class105 field5628;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Ljaa;", line = 9)
    public static final class62 method2335(byte arg0) {
        field5636++;
        try {
            return new class132();
        } catch (Throwable var2) {
            if (arg0 <= 2) {
                return null;
            }
            try {
                return (class62) Class.forName("ek").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class146();
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 34)
    public static void method2336(boolean arg0) {
        field5629 = null;
        field5639 = null;
        field5628 = null;
        if (arg0) {
            field5629 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V", line = 65)
    public class385(int arg0) {
        this.field5633 = arg0;
    }
}
