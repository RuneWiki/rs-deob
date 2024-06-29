import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class751 extends class627 {

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public int field10504;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public int field10508;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[Z")
    public static boolean[] field10505 = new boolean[8];

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "[I")
    public static int[] field10506 = new int[2];

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field10507;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Lnl;", line = 8)
    public static final class681 method4196(int arg0) {
        field10507++;
        if (arg0 != 8) {
            field10505 = null;
        }
        return class106.field1297;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 20)
    public static void method4197(int arg0) {
        if (arg0 != 2) {
            field10505 = null;
        }
        field10506 = null;
        field10505 = null;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V", line = 37)
    public class751(int arg0, int arg1) {
        this.field10504 = arg1;
        this.field10508 = arg0;
    }
}
