import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class75 extends OutputStream {

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "Lcv;")
    public static class264 field948 = new class264();

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "Ljj;")
    public static class398 field951 = new class398(48, 8);

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "Lsaa;")
    public static class507 field952 = new class507("WTI", 5);

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "Ljava/lang/String;")
    public static String field953;

    @OriginalMember(owner = "client!oba", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field949++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V")
    public static void method433(boolean arg0) {
        field948 = null;
        field953 = null;
        field952 = null;
        field951 = null;
        if (!arg0) {
            method433(true);
        }
    }
}
