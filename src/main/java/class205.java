import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class205 extends OutputStream {

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field3107 = 0;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!rs", name = "write", descriptor = "(I)V", line = 4)
    public final void write(int arg0) throws IOException {
        field3108++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILje;)V", line = 15)
    public static final void method1396(int arg0, class178 arg1) {
        if (class483.field6780 == arg1.field2644) {
            class103.field1442[arg1.field2527] = true;
        }
        if (arg0 > 62) {
            field3110++;
        }
    }
}
