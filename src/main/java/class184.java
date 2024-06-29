import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class184 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3029 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lic;")
    public static class160 field3031 = new class160(64);

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lic;")
    public static class160 field3034 = new class160(64);

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3036 = "Loaded update list";

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lsb;")
    public static class124 field3032;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lsb;")
    public static class124 field3035;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field3031 = null;
        field3035 = null;
        field3034 = null;
        field3029 = null;
        field3032 = null;
        field3036 = null;
        if (arg0 != 29) {
            method1286((byte) -97, -117);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)Lfl;")
    public static final class80 method1285(boolean arg0) {
        field3030++;
        if (!arg0) {
            method1286((byte) -23, 121);
        }
        class235.field3725 = 0;
        return class226.method1512((byte) 119);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)Lbh;")
    public static final class234 method1286(byte arg0, int arg1) {
        int var2 = -25 / ((51 - arg0) / 62);
        field3028++;
        class234 var3 = (class234) class3.field31.method1155((long) arg1, true);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class216.field3473.method900(29, arg1, false);
        class234 var5 = new class234();
        if (var4 != null) {
            var5.method1553(-115, new class136(var4), arg1);
        }
        class3.field31.method1161(var5, (byte) -110, (long) arg1);
        return var5;
    }
}
