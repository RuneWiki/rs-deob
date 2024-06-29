import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class94 extends OutputStream {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1366 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "J")
    public static long field1368 = 0L;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Z")
    public static boolean field1369 = false;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lbi;")
    public static class139 field1370;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Lig;")
    public static class13 field1372;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)B", line = 7)
    public static final byte method807(int arg0, int arg1, int arg2) {
        field1367++;
        if (arg0 == arg1) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "write", descriptor = "(I)V", line = 25)
    public final void write(int arg0) throws IOException {
        field1373++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 46)
    public static void method808(boolean arg0) {
        field1370 = null;
        field1366 = null;
        if (arg0) {
            field1372 = null;
        }
    }
}
