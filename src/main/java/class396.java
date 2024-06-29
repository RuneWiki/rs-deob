import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class396 extends class64 {

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5225;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "Lcea;")
    public static class180 field5227 = new class180("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "F")
    public static float field5229;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Lvs;")
    public static class506 field5228;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V")
    public static final void method2279(byte arg0) {
        field5224++;
        class641 var1 = class342.field4407;
        synchronized (class342.field4407) {
            int var2 = 96 % ((15 - arg0) / 37);
            class342.field4407.method3687(1402);
        }
        class641 var3 = class325.field4116;
        synchronized (class325.field4116) {
            class325.field4116.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)V")
    public static void method2280(byte arg0) {
        if (arg0 == 89) {
            field5228 = null;
            field5227 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I)V")
    public class396(int arg0) {
        this.field5225 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(B)V")
    public final void method2281(byte arg0) {
        if (arg0 != 4) {
            this.method2281((byte) 38);
        }
        field5226++;
        this.field5225.method3334();
    }
}
