import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class32 extends OutputStream {

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "F")
    public static float field330 = 0.0F;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "[I")
    public static int[] field329 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "[I")
    public static int[] field331 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!bja", name = "d", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bja", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field332++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
    public static void method162(int arg0) {
        field329 = null;
        field331 = null;
        if (arg0 != -31870) {
            method162(117);
        }
    }
}
