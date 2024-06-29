import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class88 {

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Lud;")
    public static class279 field1679 = class130.method1024("W-=hlen Sie eine Option", 255);

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "[I")
    public static int[] field1680 = new int[4096];

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lud;")
    public static class279 field1681;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "[Lud;")
    public static class279[] field1682;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 6)
    public static void method764(byte arg0) {
        field1679 = null;
        field1681 = null;
        field1682 = null;
        field1680 = null;
        if (arg0 != -8) {
            method764((byte) 2);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1680[var0] = class110.method906((byte) 36, var0);
        }
        field1681 = class130.method1024(")0", 255);
        field1682 = new class279[100];
    }
}
