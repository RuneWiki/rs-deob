import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class275 extends OutputStream {

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!vt", name = "write", descriptor = "(I)V", line = 3)
    public final void write(int arg0) throws IOException {
        field3873++;
        throw new IOException();
    }
}
