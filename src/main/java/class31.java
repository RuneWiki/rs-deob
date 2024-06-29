import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 {

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[I")
    public static int[] field363 = new int[32];

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field365 = 255;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lvh;")
    public static class62 field358 = new class62(64);

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[I")
    public static int[] field366 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 5)
    public static void method217(int arg0) {
        int var1 = 16 % ((arg0 - 21) / 50);
        field366 = null;
        field358 = null;
        field363 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lvj;", line = 21)
    public static final class122 method218(int arg0) {
        field359++;
        if (arg0 == 0) {
            return class356.field5656 < class324.field5211.length ? class324.field5211[class356.field5656++] : null;
        } else {
            return (class122) null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 36)
    public static final String method219(boolean arg0) {
        field360++;
        String var1 = "www";
        if (class296.field4656 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (!arg0) {
            method220((String) null, -38, 56);
        }
        if (client.field4444 != null) {
            var2 = "/p=" + client.field4444;
        }
        return "http://" + var1 + ".runescape.com/l=" + class234.field3567 + "/a=" + class233.field3522 + var2 + "/";
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 57)
    public static final void method220(String arg0, int arg1, int arg2) {
        if (arg2 != -24589) {
            method220((String) null, -109, -10);
        }
        field357++;
        class279 var3 = class147.method1085(arg1, -19443, 3);
        var3.method1989(0);
        var3.field4399 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V", line = 72)
    public static final void method221(int arg0, int arg1, int arg2, int arg3) {
        field364++;
        if (arg1 == 0) {
            class168.field2576++;
            class328.field5282.method304(152, 19830);
        }
        int var4 = 114 % ((arg3 + 30) / 62);
        if (arg1 == 1) {
            class346.field5488++;
            class328.field5282.method304(189, 19830);
        }
        class328.field5282.method1010(101, class276.field4349[82] ? 1 : 0);
        class328.field5282.method1006(100, class322.field4999 + arg0);
        class328.field5282.method1014(++class333.field5333, -125);
        class328.field5282.method1006(-119, class16.field160 + arg2);
    }
}
