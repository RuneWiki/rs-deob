import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class462 extends OutputStream {

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field6643 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!ek", name = "write", descriptor = "(I)V", line = 8)
    public final void write(int arg0) throws IOException {
        field6642++;
        throw new IOException();
    }
}
