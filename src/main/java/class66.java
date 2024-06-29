import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class66 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "[B")
    public static byte[] field1020 = new byte[2048];

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lm;")
    public static class126 field1022;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 3)
    public static void method448(byte arg0) {
        int var1 = -23 / ((arg0 + 61) / 32);
        field1022 = null;
        field1020 = null;
    }
}
