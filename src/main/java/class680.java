import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class680 {

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "J")
    private long field9612;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    private int field9611;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)I", line = 5)
    public final int method3817(int arg0) {
        field9613++;
        if (arg0 != 15) {
            this.field9611 = -58;
        }
        return this.field9611;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Luq;", line = 16)
    public final class455 method3818(int arg0, int arg1) {
        field9615++;
        return arg1 == 0 ? class455.method2667(this.method3820(arg0, (byte) -117), 6) : null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Luq;I)V", line = 29)
    private final void method3819(class455 arg0, int arg1) {
        if (arg1 < 31) {
            field9610 = 120;
        }
        this.field9612 |= (arg0.field6562 << this.field9611++ * class455.field6572);
        field9616++;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Luq;)V", line = 41)
    public class680(class455 arg0) {
        this.field9612 = arg0.field6562;
        this.field9611 = 1;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)I", line = 50)
    private final int method3820(int arg0, byte arg1) {
        field9614++;
        int var3 = -37 / ((-arg1 - 47) / 59);
        return (int) (this.field9612 >> class455.field6572 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "([Luq;)V", line = 61)
    public class680(class455[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method3819(arg0[var2], 118);
        }
    }
}
