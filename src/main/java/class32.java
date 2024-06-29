import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class32 extends class495 {

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field955;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public static int field956 = 0;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "Lqfa;")
    public static class85 field953 = new class85(0, 8);

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public static void method509(byte arg0) {
        field953 = null;
        if (arg0 != 99) {
            field956 = -49;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 15124) {
            method512((byte) 79, -126, -17);
        }
        for (class543 var7 = (class543) class648.field9334.method3317(-121); var7 != null; var7 = (class543) class648.field9334.method3321(-121)) {
            if (class336.field5031 >= var7.field7579) {
                var7.method1318(8);
            } else {
                class152.method1190((byte) -124, (var7.field7577 << 9) + 256, (var7.field7573 << 9) + 256, arg5, arg6 >> 1, var7.field7582, arg4 >> 1, arg2, var7.field7575 * 2);
                class367.field5445.method2559(class559.field7906[1] + arg1, 0, arg3 + class559.field7906[0], var7.field7576, 23610, var7.field7574 | 0xFF000000);
            }
        }
        field954++;
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
    public final void method511(byte arg0) {
        field957++;
        this.field955.method3568();
        if (arg0 > -98) {
            field960 = 40;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)Z")
    public static final boolean method512(byte arg0, int arg1, int arg2) {
        if (arg0 != -68) {
            field960 = -126;
        }
        field958++;
        return (arg2 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(I)V")
    public class32(int arg0) {
        this.field955 = new NativeHeap(arg0);
    }
}
