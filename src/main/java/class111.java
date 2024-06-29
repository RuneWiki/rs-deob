import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class111 extends class198 {

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field1557;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "Lla;")
    public static class319 field1556 = new class319(103, 12);

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "Lof;")
    public static class446 field1558 = new class446("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
    public class111(int arg0) {
        this.field1557 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)V")
    public final void method697(int arg0) {
        if (arg0 == 0) {
            this.field1557.method2732();
            field1555++;
        }
    }

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)V")
    public static void method698(int arg0) {
        field1558 = null;
        field1556 = null;
        int var1 = -74 % ((25 - arg0) / 44);
    }
}
