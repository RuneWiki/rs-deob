import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class24 {

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Ljn;")
    public static class409 field331 = new class409("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "[[B")
    public static byte[][] field336;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)I", line = 3)
    public final int method249(byte arg0) {
        field329++;
        return arg0 >= -64 ? 41 : this.field334;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)I", line = 16)
    public static final int method250(boolean arg0, int arg1) {
        if (arg0) {
            field336 = null;
        }
        field330++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vq", name = "toString", descriptor = "()Ljava/lang/String;", line = 29)
    public final String toString() {
        field333++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(II)V", line = 40)
    public class24(int arg0, int arg1) {
        this.field334 = arg0;
        this.field335 = arg1;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V", line = 52)
    public static void method251(boolean arg0) {
        field336 = null;
        if (arg0) {
            field331 = null;
        }
    }
}
