import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class class633 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[S")
    public static short[] field8899 = new short[] { 19, 16, 9, 8, 47, 18, 22, 59 };

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 5)
    public static void method3680(int arg0) {
        field8899 = null;
        if (arg0 < 30) {
            method3680(-53);
        }
    }
}
