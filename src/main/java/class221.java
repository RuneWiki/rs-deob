import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class221 extends OutputStream {

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "[I")
    public static int[] field2885 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "Z")
    public static boolean field2888 = true;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)Z")
    public static final boolean method1351(int arg0) {
        field2886++;
        if (arg0 != 1) {
            method1351(74);
        }
        return class608.method3425("jaclib", true) ? class608.method3425("hw3d", true) : false;
    }

    @OriginalMember(owner = "client!bea", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2887++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
    public static void method1352(int arg0) {
        field2885 = null;
        if (arg0 < 92) {
            field2888 = false;
        }
    }
}
