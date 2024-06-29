import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class500 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Led;")
    public static final class732 method2929(int arg0, int arg1) {
        if (arg1 > -38) {
            field7000 = -24;
        }
        field7001++;
        class732[] var2 = class259.method1756(1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field9905 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }
}
