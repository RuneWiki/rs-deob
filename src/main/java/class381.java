import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class381 extends InputStream {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field5600 = 0;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Ldn;")
    public static class205 field5604 = null;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[J")
    public static long[] field5602;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5601;

    @OriginalMember(owner = "client!jb", name = "read", descriptor = "()I")
    public final int read() {
        field5599++;
        class468.method2848(30000L, (byte) -43);
        return -1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method2418(byte arg0) {
        field5601 = null;
        field5604 = null;
        field5602 = null;
        if (arg0 < 27) {
            method2418((byte) 37);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2419(int arg0, int arg1, boolean arg2) {
        field5603++;
        if (!arg2) {
            field5602 = null;
        }
        return class463.method2836(arg1, arg0, 119) | (arg1 & 0x40000) != 0 || class229.method1555(arg1, arg0, (byte) 109);
    }
}
