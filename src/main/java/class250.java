import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class250 extends class64 {

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3450;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
    public final void method1533(int arg0) {
        if (arg0 > -49) {
            this.field3450 = null;
        }
        this.field3450.method3287();
        field3449++;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(I)V")
    public class250(int arg0) {
        this.field3450 = new NativeHeap(arg0);
    }

    static {
        new class104("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        new class104("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }
}
