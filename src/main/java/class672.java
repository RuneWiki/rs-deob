import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class672 extends class731 {

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9442;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "[Lho;")
    public static class318[] field9437;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLae;)V", line = 4)
    public static final void method3832(boolean arg0, class283 arg1) {
        class128.field1671 = arg1.method1839(-1, "p11_full");
        field9440++;
        class510.field6918 = arg1.method1839(-1, "p12_full");
        class656.field9261 = arg1.method1839(-1, "b12_full");
        if (!arg0) {
            field9437 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBIZ)I", line = 18)
    public static final int method3833(int arg0, byte arg1, int arg2, boolean arg3) {
        field9438++;
        class717 var4 = class159.method1020(arg3, false, arg2);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var4.field9937.length) {
            return arg1 > -57 ? -5 : var4.field9937[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 40)
    public final void method3834(int arg0) {
        field9435++;
        if (arg0 <= -76) {
            this.field9442.method2334();
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 52)
    public static void method3835(int arg0) {
        int var1 = 35 / ((30 - arg0) / 59);
        field9437 = null;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V", line = 63)
    public class672(int arg0) {
        this.field9442 = new NativeHeap(arg0);
    }
}
