import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class559 extends OutputStream {

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "Lefa;")
    public static class528 field7941 = new class528();

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public static int field7945 = 0;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!vw", name = "write", descriptor = "(I)V", line = 3)
    public final void write(int arg0) throws IOException {
        field7943++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)V", line = 17)
    public static void method3347(boolean arg0) {
        field7941 = null;
        if (!arg0) {
            method3347(false);
        }
    }
}
