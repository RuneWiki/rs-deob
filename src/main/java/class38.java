import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Loa;")
    public static class98 field933 = method349(255, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Loa;")
    public static class98 field932 = method349(255, "blaugr-Un:");

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field939 = 0;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[Lwd;")
    public static class150[] field935 = new class150[32768];

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Loa;")
    public static class98 field940 = method349(255, "hel");

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "J")
    public static long field937;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lmd;")
    public static class87 field936;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)Loa;")
    public static final class98 method349(int arg0, String arg1) {
        field931++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class98 var4 = new class98();
        if (arg0 != 255) {
            field937 = -50L;
        }
        var4.field2255 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field2255[var4.field2277++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field2255[var4.field2277++] = (byte) var6;
            }
        }
        var4.method797((byte) 126);
        return var4.method805((byte) -103);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method350(byte arg0) {
        if (arg0 != 102) {
            field939 = -15;
        }
        field936 = null;
        field935 = null;
        field932 = null;
        field940 = null;
        field933 = null;
    }
}
