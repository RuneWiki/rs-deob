import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class680 extends OutputStream {

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "Lrq;")
    public static class482 field9576 = new class482();

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "Lqk;")
    public static class148 field9577 = new class148(47, -1);

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public static void method3894(byte arg0) {
        field9576 = null;
        field9577 = null;
        if (arg0 != -107) {
            field9576 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field9578++;
        throw new IOException();
    }
}
