import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class588 {

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    private int field8303;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "J")
    private long field8299;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Lgj;")
    public static class662 field8300;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I", line = 3)
    public final int method3375(int arg0) {
        field8306++;
        if (arg0 != 1) {
            this.method3375(69);
        }
        return this.field8303;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Lbha;", line = 15)
    public final class601 method3376(int arg0, int arg1) {
        field8301++;
        return arg0 == 0 ? class601.method3408(3, this.method3378((byte) 63, arg1)) : null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILbha;)V", line = 27)
    private final void method3377(int arg0, class601 arg1) {
        field8305++;
        this.field8299 |= (arg1.field8398 << class601.field8408 * this.field8303++);
        if (arg0 != 15) {
            field8300 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I", line = 39)
    private final int method3378(byte arg0, int arg1) {
        if (arg0 == 63) {
            field8304++;
            return (int) (this.field8299 >> class601.field8408 * arg1) & 0xF;
        } else {
            return -61;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 53)
    public static void method3379(byte arg0) {
        if (arg0 != 116) {
            field8300 = null;
        }
        field8300 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BII)V", line = 64)
    public static final void method3380(byte arg0, int arg1, int arg2) {
        int var3 = 106 % ((arg0 + 2) / 36);
        field8302++;
        if (class586.field8293 == 1) {
            class63.method436(class354.field4748, arg2, 90, arg1);
        } else if (class586.field8293 == 2) {
            if (class618.field8597) {
                class568.method3282(16, class146.method1175(-29909) + arg2, arg1 + class605.method3435((byte) -98));
            } else {
                class568.method3282(16, arg2, arg1);
            }
        }
        class354.field4748 = null;
        class586.field8293 = 0;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lbha;)V", line = 90)
    public class588(class601 arg0) {
        this.field8303 = 1;
        this.field8299 = arg0.field8398;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([Lbha;)V", line = 99)
    public class588(class601[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method3377(15, arg0[var2]);
        }
    }
}
