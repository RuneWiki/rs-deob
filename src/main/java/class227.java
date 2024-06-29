import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class227 extends class37 {

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3260;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Ltv;")
    public static class515 field3261 = new class515(0, 0);

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "[[S")
    public static short[][] field3262;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lpj;BLe;)V")
    public static final void method1450(class132 arg0, byte arg1, class489 arg2) {
        class423.field5965 = arg0;
        class570.field7665 = arg2;
        int var3 = -118 % ((arg1 + 24) / 43);
        field3258++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)[Ldu;")
    public static final class324[] method1451(byte arg0) {
        if (arg0 < 65) {
            method1450(null, (byte) 25, null);
        }
        field3263++;
        return new class324[] { class150.field2236, class448.field6267, class318.field4722 };
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public final void method1452(int arg0) {
        this.field3260.method3414();
        if (arg0 != 0) {
            field3261 = null;
        }
        field3259++;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
    public class227(int arg0) {
        this.field3260 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
    public static void method1453(int arg0) {
        if (arg0 != 0) {
            field3262 = null;
        }
        field3261 = null;
        field3262 = null;
    }
}
