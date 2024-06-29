import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class79 extends OutputStream {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Luu;")
    public static class191 field1131;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[I")
    public static int[] field1129;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method541(int arg0) {
        field1131 = null;
        field1129 = null;
        if (arg0 != 15507) {
            field1129 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
    public static final void method542(int arg0, byte arg1) {
        if (arg1 <= 47) {
            field1129 = null;
        }
        field1128++;
        if (class445.field6688 == 1) {
            class460.field6889 = arg0;
        } else if (class445.field6688 == 2 || class445.field6688 == 3) {
            class250.field3478 = arg0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1130++;
        throw new IOException();
    }
}
