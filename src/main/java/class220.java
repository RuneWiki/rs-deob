import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class220 extends OutputStream {

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field3079 = 0;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "Ljm;")
    public static class485 field3081 = new class485(11, 3);

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Z")
    public static boolean field3082 = false;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "[B")
    public static byte[] field3083 = new byte[2048];

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
    public static void method1299(byte arg0) {
        if (arg0 != 7) {
            method1299((byte) -116);
        }
        field3081 = null;
        field3083 = null;
    }

    @OriginalMember(owner = "client!on", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3080++;
        throw new IOException();
    }
}
