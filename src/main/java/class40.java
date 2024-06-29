import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class40 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "J")
    private long field494;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "J")
    public static long field495 = -1L;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)I")
    private final int method218(byte arg0, int arg1) {
        field497++;
        return arg0 >= -17 ? -95 : (int) (this.field494 >> class385.field5529 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)I")
    public final int method219(int arg0) {
        if (arg0 != -1) {
            field495 = -93L;
        }
        field491++;
        return this.field493;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqf;B)V")
    private final void method220(class385 arg0, byte arg1) {
        field498++;
        this.field494 |= (arg0.field5519 << this.field493++ * class385.field5529);
        if (arg1 != -85) {
            this.method221(-59, 26);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lqf;")
    public final class385 method221(int arg0, int arg1) {
        if (arg1 == -1321) {
            field496++;
            return class385.method2415(this.method218((byte) -99, arg0), (byte) -114);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lqf;)V")
    public class40(class385 arg0) {
        this.field494 = arg0.field5519;
        this.field493 = 1;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([Lqf;)V")
    public class40(class385[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method220(arg0[var2], (byte) -85);
        }
    }
}
