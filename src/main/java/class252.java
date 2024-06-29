import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class252 {

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "Lkn;")
    public static class737 field3637 = new class737(3, 2);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "Ll;")
    public static class18 field3638;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([BBILjava/io/File;)V")
    public static final void method1706(byte[] arg0, byte arg1, int arg2, File arg3) throws IOException {
        field3636++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
        try {
            int var5 = -11 % ((-arg1 - 43) / 33);
            var4.readFully(arg0, 0, arg2);
        } catch (EOFException var6) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)V")
    public static void method1707(boolean arg0) {
        if (!arg0) {
            field3637 = null;
        }
        field3637 = null;
        field3638 = null;
    }
}
