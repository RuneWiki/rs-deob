import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lu;")
    public static class135 field2065 = method676((byte) -87, "Angreifen");

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lu;")
    public static class135 field2070 = method676((byte) -112, "welle:");

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lu;")
    private static class135 field2069 = method676((byte) -70, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lu;")
    public static class135 field2063 = method676((byte) -119, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lu;")
    private static class135 field2067 = method676((byte) -93, "Off");

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lu;")
    private static class135 field2073 = method676((byte) -96, "Please enter your password)3");

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lu;")
    public static class135 field2064 = field2067;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Lu;")
    public static class135 field2078 = method676((byte) -71, "bevor Sie die (WRegelversto-8 melden(W Option benutzen");

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[Lu;")
    public static class135[] field2076 = new class135[1000];

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lu;")
    public static class135 field2077 = field2069;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lu;")
    public static class135 field2068 = field2073;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lre;")
    public static class122 field2071;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Lg;")
    public static class43 field2079;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[Lbc;")
    public static class11[] field2066;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/lang/String;)Lu;")
    public static final class135 method676(byte arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        field2072++;
        int var3 = var2.length;
        if (arg0 > -38) {
            return null;
        }
        class135 var4 = new class135();
        var4.field3266 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3266[var4.field3255++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field3266[var4.field3255++] = (byte) var6;
            }
        }
        var4.method1096(false);
        return var4.method1091((byte) 102);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method677(byte arg0) {
        field2079 = null;
        field2071 = null;
        field2067 = null;
        field2065 = null;
        field2063 = null;
        if (arg0 < 99) {
            method676((byte) -101, null);
        }
        field2064 = null;
        field2068 = null;
        field2078 = null;
        field2069 = null;
        field2066 = null;
        field2070 = null;
        field2076 = null;
        field2077 = null;
        field2073 = null;
    }
}
