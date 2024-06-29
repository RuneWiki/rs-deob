import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class409 extends class285 implements class186 {

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    private int field5938;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "[[S")
    public static short[][] field5940 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Llt;")
    public static class458 field5934;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "[[Ltq;")
    public static class427[][] field5933;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)J")
    public final long method1156(int arg0) {
        ++field5935;
        if (arg0 != 14522) {
            method2420(-73);
        }
        return super.field4317.method2479();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)I")
    public final int method1154(byte arg0) {
        ++field5936;
        if (arg0 != 22) {
            method2420(103);
        }
        return this.field5938;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lbl;I[BI)V")
    public class409(class442 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5938 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lbl;ILjaggl/memory/NativeBuffer;)V")
    public class409(class442 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field5938 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public static void method2420(int arg0) {
        field5933 = null;
        if (arg0 != -16581) {
            method2420(110);
        }
        field5940 = null;
        field5934 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)I")
    public final int method1155(boolean arg0) {
        if (!arg0) {
            return -96;
        } else {
            ++field5937;
            return 0;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([BIII)V")
    public final void method1153(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field5939;
        this.method1739(arg0, arg1);
        if (arg2 != -2805) {
            this.method1153((byte[]) null, -30, 126, 65);
        }
        this.field5938 = arg3;
    }
}
