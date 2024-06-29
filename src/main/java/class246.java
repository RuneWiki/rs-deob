import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class246 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "J")
    public long field3651;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lko;")
    private class529 field3652;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field3650 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
    public static boolean field3648 = false;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "D")
    public static double field3654;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3652.method3197((byte) -116, this.field3651);
        field3655++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
    public static final int method1630(byte arg0) {
        if (arg0 < 74) {
            return 63;
        } else {
            field3653++;
            return class590.field8323.method3137(2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static final void method1631(int arg0) {
        if (arg0 > -97) {
            return;
        }
        field3649++;
        for (int var1 = 0; var1 < class422.field5771; var1++) {
            int var2 = class37.method290(class793.field10902 + var1, class422.field5771, -1365732769) * class703.field9803;
            for (int var3 = 0; var3 < class703.field9803; var3++) {
                int var4 = var2 + class37.method290(class725.field10028 + var3, class703.field9803, -1365732769);
                if (class641.field8975[var4] == class601.field8432) {
                    class537.field7719[var4].method1547(0, 0, class103.field1192, class373.field5148, class103.field1192 * var3, class373.field5148 * var1, true, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lko;JI)V")
    public class246(class529 arg0, long arg1, int arg2) {
        this.field3651 = arg1;
        this.field3652 = arg0;
    }
}
