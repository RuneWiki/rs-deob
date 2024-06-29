import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class122 extends class273 {

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lwm;")
    public static class152 field1719 = class157.method1048("0(U", 125);

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lwm;")
    public static class152 field1718 = class157.method1048("Fermer", 127);

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "J")
    public static volatile long field1717 = 0L;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lwm;")
    public static class152 field1722 = class157.method1048("lila:", 127);

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lah;")
    public static class205 field1721;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "[[[B")
    public static byte[][][] field1720;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 6)
    public static void method787(byte arg0) {
        field1720 = (byte[][][]) null;
        if (arg0 != -5) {
            method788((byte) -39, (byte[]) null, 105);
        }
        field1722 = null;
        field1718 = null;
        field1719 = null;
        field1721 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B[BI)I", line = 34)
    public static final int method788(byte arg0, byte[] arg1, int arg2) {
        field1716++;
        if (arg0 != 69) {
            method788((byte) 75, (byte[]) null, -60);
        }
        return class295.method2034(961145416, arg2, arg1, 0);
    }
}
