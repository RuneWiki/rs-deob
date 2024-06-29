import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class207 extends class646 {

    @OriginalMember(owner = "client!iw", name = "I", descriptor = "[I")
    public static int[] field3193 = new int[25];

    @OriginalMember(owner = "client!iw", name = "J", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!iw", name = "K", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "()V")
    public class207() {
        super(0, true);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZ)I")
    public static final int method1433(int arg0, boolean arg1) {
        if (!arg1) {
            method1433(-94, false);
        }
        field3195++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)V")
    public static void method1434(int arg0) {
        if (arg0 >= -13) {
            method1433(-125, false);
        }
        field3193 = null;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        if (arg1 == -120) {
            field3194++;
            return class518.field7652;
        } else {
            return null;
        }
    }
}
