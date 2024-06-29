import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class139 extends InputStream {

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Ldh;")
    public static class320 field1563 = new class320(44, -2);

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[Lcs;")
    public static class340[] field1560;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method877(byte arg0) {
        int var1 = 27 / ((36 - arg0) / 59);
        field1563 = null;
        field1560 = null;
    }

    @OriginalMember(owner = "client!ls", name = "read", descriptor = "()I")
    public final int read() {
        class524.method3076(1, 30000L);
        field1562++;
        return -1;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI)Z")
    public static final boolean method878(int arg0, byte arg1, int arg2) {
        field1561++;
        if (arg1 != 0) {
            field1563 = null;
        }
        return class467.method2832(-1, arg0, arg2) & ((arg0 & 0x2000) != 0 | class688.method3889(arg1 ^ 0x78, arg0, arg2) | class678.method3849(arg2, arg0, -1));
    }
}
