import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class707 {

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public int field9846;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "Lhj;")
    private class47 field9851;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "Ljava/lang/String;")
    public static String field9849 = "";

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "F")
    public static float field9850;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
    public static void method3975(byte arg0) {
        if (arg0 != -91) {
            method3975((byte) 8);
        }
        field9849 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lsga;Z)I")
    public static final int method3976(class651 arg0, boolean arg1) {
        field9848++;
        if (arg1) {
            field9850 = 0.10988262F;
        }
        if (class139.field1985 == arg0) {
            return 9216;
        } else if (class433.field6041 == arg0) {
            return 34065;
        } else if (class171.field2379 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jfa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field9851.method316(this.field9846, 9898);
        field9847++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lhj;II)V")
    public class707(class47 arg0, int arg1, int arg2) {
        this.field9846 = arg2;
        this.field9851 = arg0;
    }
}
