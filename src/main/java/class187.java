import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class187 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3030 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3036 = 0;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "S")
    public static short field3038 = 205;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3039 = new String[100];

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "F")
    public static float field3034;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Loj;")
    public static class283 field3031;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Ltl;")
    public static class62 field3037;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1193(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)I", line = 21)
    public static final int method1194(int arg0, int arg1, int arg2) {
        field3032++;
        if (arg0 != 1904560007) {
            method1194(27, -73, 27);
        }
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Ljava/lang/String;", line = 52)
    public static final String method1195(byte arg0) {
        field3035++;
        String var1 = "";
        if (class228.field3604 != null) {
            var1 = "/p=" + class228.field3604;
        }
        if (arg0 <= 7) {
            return (String) null;
        }
        String var2 = "www";
        if (class260.field4068 != 0) {
            var2 = "www-wtqa";
        }
        return "http://" + var2 + ".runescape.com/l=" + class321.field4894 + "/a=" + class190.field3090 + var1 + "/";
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V", line = 87)
    public static void method1196(byte arg0) {
        field3039 = null;
        int var1 = 99 % ((-arg0 - 10) / 39);
        field3037 = null;
        field3031 = null;
    }
}
