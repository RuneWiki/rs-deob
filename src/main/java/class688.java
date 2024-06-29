import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class688 {

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field9723 = 1338;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II[S)[S", line = 4)
    public static final short[] method3882(int arg0, int arg1, short[] arg2) {
        if (arg1 >= -8) {
            field9723 = 63;
        }
        field9722++;
        short[] var3 = new short[arg0];
        class171.method1266(arg2, 0, var3, 0, arg0);
        return var3;
    }
}
