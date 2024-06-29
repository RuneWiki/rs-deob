import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class301 extends class425 {

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3914;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Ldh;")
    public static class321 field3916;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "Lqa;")
    public static class167 field3918;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public final void method1837(int arg0) {
        field3915++;
        this.field3914.method3192();
        if (arg0 != 12) {
            this.method1837(-57);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static void method1838(byte arg0) {
        field3916 = null;
        field3918 = null;
        if (arg0 != -67) {
            field3916 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(I)V")
    public class301(int arg0) {
        this.field3914 = new NativeHeap(arg0);
    }

    static {
        new class344("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field3916 = new class321("", 12);
    }
}
