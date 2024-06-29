import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class43 extends class129 {

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "[B")
    public byte[] field878;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lrd;")
    public static class173 field872 = class133.method843("Benutzername: ", 108);

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "Lrd;")
    public static class173 field877 = class133.method843(": ", -119);

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field879 = 0;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "[I")
    public static int[] field880 = new int[32];

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Lrd;")
    private static class173 field876 = class133.method843("New User", 99);

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lrd;")
    public static class173 field873 = field876;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Lrd;")
    public static class173 field875 = class133.method843("l", 22);

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public static void method308(byte arg0) {
        field876 = null;
        int var1 = 15 / ((53 - arg0) / 33);
        field872 = null;
        field880 = null;
        field873 = null;
        field877 = null;
        field875 = null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
    public class43(byte[] arg0) {
        this.field878 = arg0;
    }
}
