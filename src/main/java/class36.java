import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class36 extends OutputStream {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljava/lang/String;")
    public static String field437 = "Continue";

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field436 = 7759444;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Ljf;")
    public static class216 field438 = new class216(100);

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static volatile int field442 = 0;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static final void method196(int arg0) {
        field443++;
        class23.field291.method1511((byte) 112);
        class38.field453.method1511((byte) 118);
        if (arg0 != 0) {
            field437 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method197(byte arg0) {
        if (arg0 < -71) {
            field438 = null;
            field437 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field439++;
        throw new IOException();
    }
}
