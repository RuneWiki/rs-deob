import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class181 {

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field2220 = 328;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "Z")
    public static boolean field2224 = false;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Lni;")
    public static class522 field2219;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)Z", line = 5)
    public static final boolean method1030(int arg0, byte arg1) {
        if (arg1 != -108) {
            method1032(null, (byte) -13, -123);
        }
        field2221++;
        return arg0 == 2 || arg0 == 3;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V", line = 18)
    public static void method1031(byte arg0) {
        if (arg0 != -73) {
            field2220 = -23;
        }
        field2219 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/io/File;BI)[B", line = 36)
    public static final byte[] method1032(File arg0, byte arg1, int arg2) {
        field2222++;
        if (arg1 != 78) {
            field2224 = true;
        }
        try {
            byte[] var3 = new byte[arg2];
            class186.method1047(var3, 124, arg2, arg0);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }
}
