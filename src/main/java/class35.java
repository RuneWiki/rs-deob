import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class35 extends InputStream {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[I")
    public static int[] field470 = new int[1];

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Lsv;")
    public static class686 field473;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 12)
    public static void method283(boolean arg0) {
        field473 = null;
        if (arg0) {
            method283(true);
        }
        field470 = null;
    }

    @OriginalMember(owner = "client!rk", name = "read", descriptor = "()I", line = 25)
    public final int read() {
        class107.method828(30000L, (byte) -114);
        field471++;
        return -1;
    }
}
