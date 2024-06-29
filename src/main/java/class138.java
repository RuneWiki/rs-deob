import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class138 {

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Z")
    public static boolean field2588 = false;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field2589 = 0;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field2591 = -1;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[I")
    public static int[] field2585;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)Z")
    public static final boolean method863(byte arg0, int arg1) {
        int var2 = -17 % ((53 - arg0) / 36);
        field2590++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method864(int arg0) {
        field2585 = null;
        if (arg0 != 0) {
            field2591 = -102;
        }
    }
}
