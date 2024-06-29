import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class434 extends OutputStream {

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Llh;")
    public static class487 field6041 = new class487(48, 15);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
    public static void method2488(byte arg0) {
        field6041 = null;
        int var1 = -77 / ((52 - arg0) / 38);
    }

    @OriginalMember(owner = "client!so", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field6040++;
        throw new IOException();
    }
}
