import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class704 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "[I")
    public static int[] field9811 = new int[8];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 9)
    public static void method3849(byte arg0) {
        field9811 = null;
        if (arg0 > -47) {
            field9810 = 73;
        }
    }
}
