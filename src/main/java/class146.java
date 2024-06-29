import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class146 extends OutputStream {

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "[B")
    public static byte[] field2070 = new byte[520];

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field2069 = 0;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lff;")
    public static class9 field2067 = new class9(49, -1);

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "[I")
    public static int[] field2071 = new int[1];

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
    public static final void method1006(int arg0, int arg1) {
        field2072++;
        class253 var2 = class332.method1911(arg1, (byte) 48, 14);
        if (arg0 <= 62) {
            method1007(23);
        }
        var2.method1523((byte) -126);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field2071 = null;
        field2067 = null;
        if (arg0 >= -10) {
            method1007(-114);
        }
        field2070 = null;
    }

    @OriginalMember(owner = "client!hm", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2068++;
        throw new IOException();
    }
}
