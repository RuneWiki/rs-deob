import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class64 extends class53 {

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field682;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "[I")
    public static int[] field681 = new int[4096];

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "(B)Z")
    public final boolean method267(byte arg0) {
        if (arg0 > -116) {
            this.method266((byte) -107);
        }
        field683++;
        return false;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method266(byte arg0) {
        if (arg0 == 13) {
            field680++;
            return this.field682;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V")
    public static void method427(int arg0) {
        field681 = null;
        if (arg0 != -20790) {
            method427(39);
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class64(Object arg0, int arg1) {
        super(arg1);
        this.field682 = arg0;
    }
}
