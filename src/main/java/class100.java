import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class100 extends OutputStream {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field1832 = 0;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!jo", name = "write", descriptor = "(I)V", line = 6)
    public final void write(int arg0) throws IOException {
        field1833++;
        throw new IOException();
    }
}
