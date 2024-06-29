import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class51 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lwt;")
    public static class194 field760 = new class194(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "[[Z")
    public static boolean[][] field762 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lum;")
    public static class347 field763 = new class347();

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[[B")
    public static byte[][] field761;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
    public static int method379(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(III)V")
    public class51(int arg0, int arg1, int arg2) {
        this.field757 = arg0;
        this.field758 = arg2;
        this.field759 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static void method380(byte arg0) {
        field763 = null;
        if (arg0 >= 118) {
            field760 = null;
            field762 = null;
            field761 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
    public abstract void method117(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(III)V")
    public abstract void method115(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(III)V")
    public abstract void method116(int arg0, int arg1, int arg2);
}
