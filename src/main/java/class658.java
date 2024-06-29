import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class658 extends OutputStream {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lqj;")
    public static class511 field9279 = new class511(6, 3);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!pg", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field9280++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method3709(int arg0) {
        if (arg0 != 6058) {
            method3709(-128);
        }
        field9279 = null;
    }
}
