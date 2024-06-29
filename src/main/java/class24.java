import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class24 extends class158 {

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "[B")
    public static byte[] field419 = new byte[520];

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Ldc;")
    public static class37 field423 = class185.method1233((byte) 86, "settings");

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Ldc;")
    public static class37 field421 = class185.method1233((byte) 86, ":clanreq:");

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Ldc;")
    public static class37 field425 = class185.method1233((byte) 86, "Standort");

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "[Lji;")
    public static class106[] field416;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lwa;Ldc;ILdc;)Lji;")
    public static final class106 method168(class238 arg0, class37 arg1, int arg2, class37 arg3) {
        int var4 = 105 / ((arg2 + 4) / 42);
        field422++;
        int var5 = arg0.method1543(110, arg1);
        int var6 = arg0.method1546(arg3, -85, var5);
        return class107.method703(var5, arg0, true, var6);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ldc;B)Ln;")
    public static final class141 method169(class37 arg0, byte arg1) {
        field424++;
        if (arg0.method334(-61) == 0) {
            return null;
        }
        class141 var2 = (class141) class37.field788.method1338(12);
        if (arg1 != 79) {
            return null;
        }
        while (var2 != null) {
            if (var2.field2727.method313(arg0, -22215)) {
                return var2;
            }
            var2 = (class141) class37.field788.method1332((byte) -89);
        }
        return null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static void method170(boolean arg0) {
        field423 = null;
        field419 = null;
        field421 = null;
        field416 = null;
        if (arg0) {
            method168(null, null, -66, null);
        }
        field425 = null;
    }
}
