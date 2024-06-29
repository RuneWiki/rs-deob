import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class374 extends class35 {

    @OriginalMember(owner = "client!io", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5700;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "[[I")
    public static int[][] field5702 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V", line = 7)
    public class374(int arg0) {
        this.field5700 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 15)
    public static void method2408(int arg0) {
        if (arg0 <= 94) {
            method2409(107);
        }
        field5702 = null;
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "(I)[Lhb;", line = 26)
    public static final class629[] method2409(int arg0) {
        field5699++;
        int var1 = 67 / ((-arg0 - 51) / 60);
        return new class629[] { class72.field774, class301.field4426, class151.field1859, class10.field85, class261.field3711, class309.field4543, class111.field1369, class135.field1690, class421.field6301, class202.field2697, class287.field3968, class351.field5012, class390.field5968, class96.field1133, class91.field1041, class93.field1096 };
    }

    @OriginalMember(owner = "client!io", name = "f", descriptor = "(I)V", line = 37)
    public final void method2410(int arg0) {
        this.field5700.method3410();
        if (arg0 != -4296) {
            this.method2410(-92);
        }
        field5701++;
    }
}
