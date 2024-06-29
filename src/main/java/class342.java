import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class342 extends class437 {

    @OriginalMember(owner = "client!nha", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4607;

    @OriginalMember(owner = "client!nha", name = "o", descriptor = "Lfja;")
    public static class783 field4608 = new class783(8, 4);

    @OriginalMember(owner = "client!nha", name = "q", descriptor = "Lvl;")
    public static class15 field4610 = new class15(19, 15);

    @OriginalMember(owner = "client!nha", name = "s", descriptor = "Lfja;")
    public static class783 field4612 = new class783(53, 6);

    @OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!nha", name = "m", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!nha", name = "p", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!nha", name = "r", descriptor = "Lgo;")
    public static class655 field4611;

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(I)V")
    public class342(int arg0) {
        this.field4607 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
    public static final void method2125(int arg0) {
        if (arg0 != 53) {
            field4608 = null;
        }
        class663.field9208.method273(-107);
        field4605++;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V")
    public final void method2126(byte arg0) {
        field4606++;
        int var2 = -72 / ((61 - arg0) / 41);
        this.field4607.method3899();
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)V")
    public static void method2127(int arg0) {
        field4611 = null;
        if (arg0 != -22745) {
            method2125(-95);
        }
        field4612 = null;
        field4610 = null;
        field4608 = null;
    }
}
