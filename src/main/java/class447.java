import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class447 extends OutputStream {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Z")
    public static boolean field6599 = false;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field6600 = -1;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!gj", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field6602++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I")
    public static final int method2714(int arg0, int arg1) {
        field6603++;
        return arg1 == -1 ? arg0 & 0x7F : -16;
    }
}
