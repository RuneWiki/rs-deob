import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class248 extends OutputStream {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lwp;")
    public static class179 field3008 = new class179(7500);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3012;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[[I")
    public static int[][] field3011;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I", line = 3)
    public static final int method1495(int arg0, int arg1) {
        field3009++;
        return arg1 == 1023 ? arg0 & 0x3FF : -3;
    }

    @OriginalMember(owner = "client!qa", name = "write", descriptor = "(I)V", line = 19)
    public final void write(int arg0) throws IOException {
        field3010++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 29)
    public static void method1496(byte arg0) {
        field3011 = null;
        field3008 = null;
        if (arg0 != -96) {
            field3012 = null;
        }
        field3012 = null;
    }
}
