import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class366 extends OutputStream {

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "F")
    public static float field5112;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!mn", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field5113++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public static final void method2275(int arg0) {
        if (arg0 <= 51) {
            field5112 = -0.12434648F;
        }
        field5110++;
        if (class555.field7767 != null) {
            try {
                class555.field7767.close();
            } catch (IOException var1) {
            }
        }
        class555.field7767 = null;
    }
}
