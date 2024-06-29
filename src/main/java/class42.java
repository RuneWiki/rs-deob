import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class42 {

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "[Z")
    public static boolean[] field688 = new boolean[100];

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "([BII)[B", line = 7)
    public static final byte[] method464(byte[] arg0, int arg1, int arg2) {
        int var3 = -25 / ((74 - arg2) / 47);
        field687++;
        byte[] var4 = new byte[arg1];
        class476.method2792(arg0, 0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 21)
    public static void method465(int arg0) {
        field688 = null;
        if (arg0 != 21801) {
            method464(null, -71, 20);
        }
    }
}
