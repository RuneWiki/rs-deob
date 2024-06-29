import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class106 extends OutputStream {

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Leda;")
    public static class116 field1754 = new class116(73, 8);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "F")
    public static float field1752;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
    public static int[] field1755;

    @OriginalMember(owner = "client!bk", name = "write", descriptor = "(I)V", line = 9)
    public final void write(int arg0) throws IOException {
        field1753++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 17)
    public static void method886(int arg0) {
        field1754 = null;
        if (arg0 <= 28) {
            method886(-40);
        }
        field1755 = null;
    }
}
