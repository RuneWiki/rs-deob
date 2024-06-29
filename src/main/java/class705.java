import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class705 extends class492 {

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9921;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field9918 = 0;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field9922;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
    public static final void method3923(int arg0) {
        if (class420.field6113 == 3) {
            class112.method868(4, (byte) 83);
        } else if (class420.field6113 == 7) {
            class112.method868(8, (byte) -114);
        } else if (class420.field6113 == 10) {
            class112.method868(11, (byte) 98);
        }
        field9923++;
        if (arg0 != 4) {
            field9920 = 29;
        }
    }

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "(I)V")
    public final void method3924(int arg0) {
        this.field9921.method3470();
        field9919++;
        if (arg0 != -8) {
            method3925(-52, -39);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
    public static final void method3925(int arg0, int arg1) {
        field9922++;
        class191 var2 = class6.method38(arg0, -121, arg1);
        var2.method1284((byte) -104);
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(I)V")
    public class705(int arg0) {
        this.field9921 = new NativeHeap(arg0);
    }
}
