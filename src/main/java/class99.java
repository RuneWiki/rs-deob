import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class99 extends OutputStream {

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
    public static int[] field1170 = new int[3];

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
    public static boolean field1173 = false;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lam;")
    public static class286 field1166;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[I")
    public static int[] field1167;

    @OriginalMember(owner = "client!rc", name = "write", descriptor = "(I)V", line = 6)
    public final void write(int arg0) throws IOException {
        field1171++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 14)
    public static void method538(boolean arg0) {
        field1166 = null;
        field1167 = null;
        field1170 = null;
        if (!arg0) {
            method538(false);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 26)
    public static final void method539(byte arg0) {
        class427.field6253.method613(true);
        if (arg0 == -49) {
            field1169++;
        }
    }
}
