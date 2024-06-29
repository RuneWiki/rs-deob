import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class492 extends class66 {

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public int field7205;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public int field7206;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "[I")
    public static int[] field7204 = new int[1];

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method3008(byte arg0) {
        field7204 = null;
        if (arg0 >= -45) {
            method3008((byte) -8);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(II)V")
    public class492(int arg0, int arg1) {
        this.field7205 = arg0;
        this.field7206 = arg1;
    }
}
