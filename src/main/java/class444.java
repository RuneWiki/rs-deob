import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class444 extends OutputStream {

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[I")
    public static int[] field6364 = new int[200];

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!go", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field6363++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static void method2621(int arg0) {
        if (arg0 >= -37) {
            method2621(-76);
        }
        field6364 = null;
    }
}
