import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class56 extends class298 {

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "Lvf;")
    public static class166 field712 = new class166();

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
    public static int field713 = 0;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public static int field714 = 0;

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!bq", name = "P", descriptor = "Lbg;")
    public static class406 field715;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ)[I", line = 4)
    public final int[] method13(int arg0, boolean arg1) {
        field711++;
        if (!arg1) {
            method291(2);
        }
        return class236.field3260;
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V", line = 15)
    public static void method291(int arg0) {
        field712 = null;
        field715 = null;
        if (arg0 != 0) {
            field713 = -33;
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V", line = 29)
    public class56() {
        super(0, true);
    }
}
