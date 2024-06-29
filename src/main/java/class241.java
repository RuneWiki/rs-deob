import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class241 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static volatile int field3895 = 0;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field3900 = 0;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3902 = "glow3:";

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field3903 = 0;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field3898 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3896;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLog;)Ldf;")
    public static final class55 method1662(byte arg0, class221 arg1) {
        class55 var2 = new class55(arg1.method1539(-124), arg1.method1539(-126), arg1.method1521((byte) 113), arg1.method1521((byte) 113), arg1.method1526(-16777216), arg1.method1517((byte) -96) == 1, arg1.method1517((byte) -96));
        field3897++;
        int var3 = arg1.method1517((byte) -96);
        if (arg0 > -68) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field942.method855(false, new class142(arg1.method1521((byte) 113), arg1.method1521((byte) 113), arg1.method1521((byte) 113), arg1.method1521((byte) 113)));
        }
        var2.method415((byte) -112);
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Lah;")
    public static final class278 method1663(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class278 var4 = var3.field2143;
            var3.field2143 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method1664(int arg0) {
        field3896 = null;
        if (arg0 == 19517) {
            field3902 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)V")
    public static final void method1665(int arg0, int arg1, int arg2) {
        field3899++;
        if (class228.method1606(arg2 - 1, arg1)) {
            if (arg2 != 0) {
                method1664(45);
            }
            class145.method992(class136.field2250[arg1], arg2 ^ 0x6B, arg0);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)V")
    public static final void method1666(int arg0, int arg1, int arg2, int arg3) {
        field3901++;
        if (arg3 == -2358) {
            String var4 = "::tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
            System.out.println(var4);
            class115.method851(127, var4);
        }
    }
}
