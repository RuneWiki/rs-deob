import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class159 extends OutputStream {

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "[I")
    public static int[] field2389 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "F")
    public static float field2388 = 1.0F;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public static int field2396 = 0;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2395 = "";

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "Lof;")
    public static class413 field2393;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "Lmf;")
    public static class51 field2391;

    @OriginalMember(owner = "client!kv", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2392++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I")
    public static final int method1128(int arg0) {
        field2390++;
        if (arg0 > -33) {
            method1128(81);
        }
        return 16;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z")
    public static final boolean method1129(int arg0, int arg1, int arg2) {
        field2394++;
        if (arg2 < 36) {
            method1130(-42);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
    public static void method1130(int arg0) {
        field2389 = null;
        field2391 = null;
        field2393 = null;
        field2395 = null;
        if (arg0 != 21196) {
            field2389 = null;
        }
    }
}
