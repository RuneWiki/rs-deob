import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class211 {

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field2695 = 0;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "Lkh;")
    public static class354 field2697 = new class354();

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "Lbba;")
    public static class721 field2698 = new class721();

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "Lkha;")
    public static class687 field2699;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZLjava/io/File;[BI)V", line = 7)
    public static final void method1287(boolean arg0, File arg1, byte[] arg2, int arg3) throws IOException {
        field2696++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        try {
            var4.readFully(arg2, 0, arg3);
            if (!arg0) {
                field2700 = -43;
            }
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V", line = 25)
    public static void method1288(int arg0) {
        field2697 = null;
        field2699 = null;
        field2698 = null;
        if (arg0 != 0) {
            field2698 = null;
        }
    }
}
