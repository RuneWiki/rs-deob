import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class241 extends InputStream {

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lqu;")
    public static class219 field3918 = new class219(49, 5);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)I")
    public static final int method1678(int arg0, boolean arg1) {
        field3917++;
        int var2 = 0;
        if (arg1) {
            field3919 = -50;
        }
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method1679(byte arg0) {
        field3918 = null;
        if (arg0 != 31) {
            field3919 = 89;
        }
    }

    @OriginalMember(owner = "client!fe", name = "read", descriptor = "()I")
    public final int read() {
        class208.method1464((byte) -87, 30000L);
        field3916++;
        return -1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)I")
    public static final int method1680(int arg0) {
        int var1 = 52 / ((arg0 + 57) / 59);
        field3914++;
        return class359.field5567;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(IZ)I")
    public static final int method1681(int arg0, boolean arg1) {
        field3915++;
        if (!arg1) {
            field3919 = 62;
        }
        return arg0 & 0x7F;
    }
}
