import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class328 extends OutputStream {

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!qja", name = "write", descriptor = "(I)V", line = 9)
    public final void write(int arg0) throws IOException {
        field4464++;
        throw new IOException();
    }
}
