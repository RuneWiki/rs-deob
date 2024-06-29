import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class148 extends InputStream {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!un", name = "read", descriptor = "()I", line = 9)
    public final int read() {
        class688.method3874(30000L, -7375);
        field2059++;
        return -1;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([SII)[S", line = 18)
    public static final short[] method950(short[] arg0, int arg1, int arg2) {
        if (arg1 == 13192) {
            field2060++;
            short[] var3 = new short[arg2];
            class245.method1652(arg0, 0, var3, 0, arg2);
            return var3;
        } else {
            return null;
        }
    }
}
