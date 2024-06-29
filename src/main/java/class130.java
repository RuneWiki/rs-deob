import jaclib.memory.heap.NativeHeap;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class130 extends class413 {

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1569;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "Lgda;")
    public static class53 field1564 = new class53(3, -1);

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "[I")
    public static int[] field1570 = new int[8];

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "Z")
    public static boolean field1571 = false;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "Liha;")
    public static class30 field1568;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "[[S")
    public static short[][] field1565;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V")
    public static void method872(byte arg0) {
        field1570 = null;
        field1565 = null;
        if (arg0 != -86) {
            field1565 = null;
        }
        field1564 = null;
        field1568 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILd;Ljava/awt/Canvas;I)Lha;")
    public static final class58 method873(int arg0, class149 arg1, Canvas arg2, int arg3) {
        field1563++;
        if (arg3 != 18785) {
            field1570 = null;
        }
        return new class131(arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
    public final void method874(int arg0) {
        this.field1569.method3651();
        if (arg0 == 3) {
            field1566++;
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(I)V")
    public class130(int arg0) {
        this.field1569 = new NativeHeap(arg0);
    }
}
