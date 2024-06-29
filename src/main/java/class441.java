import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class441 {

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(CB)Z")
    public static final boolean method2614(char arg0, byte arg1) {
        if (arg1 <= 11) {
            return false;
        } else {
            field6108++;
            return arg0 >= '0' && arg0 <= '9';
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(BLjava/io/File;)[B")
    public static final byte[] method2615(byte arg0, File arg1) {
        if (arg0 > -18) {
            return null;
        } else {
            field6107++;
            return class58.method616((int) arg1.length(), arg1, 111);
        }
    }
}
