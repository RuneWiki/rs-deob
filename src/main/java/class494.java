import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class494 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7000 = null;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lpv;")
    public static class70 field6999 = new class70();

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field7003 = 0;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
    public static int[] field7002 = new int[1000];

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method2955(int arg0) {
        if (arg0 != 10678) {
            method2955(-85);
        }
        field6999 = null;
        field7002 = null;
        field7000 = null;
    }
}
