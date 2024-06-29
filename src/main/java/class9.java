import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class9 extends OutputStream {

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!kw", name = "write", descriptor = "(I)V", line = 7)
    public final void write(int arg0) throws IOException {
        field54++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method23(boolean arg0) {
        if (!arg0) {
            class664.field9335.method314(-2);
            field55++;
        }
    }
}
