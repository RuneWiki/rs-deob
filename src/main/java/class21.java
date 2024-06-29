import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class21 extends OutputStream {

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "D")
    public static double field270;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "Leq;")
    public static class209 field269;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "Lda;")
    public static class59 field268;

    @OriginalMember(owner = "client!qia", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field265++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
    public static void method126(int arg0) {
        field268 = null;
        field269 = null;
        if (arg0 != -24264) {
            method126(56);
        }
    }
}
