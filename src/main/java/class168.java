import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class168 extends OutputStream {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field2590 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!uh", name = "write", descriptor = "(I)V", line = 6)
    public final void write(int arg0) throws IOException {
        field2589++;
        throw new IOException();
    }
}
