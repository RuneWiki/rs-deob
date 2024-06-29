import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class36 extends class99 {

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "[B")
    public byte[] field938;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "Lpd;")
    public static class94 field936 = class28.method249(-96, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!fe", name = "lb", descriptor = "I")
    public static volatile int field944 = 0;

    @OriginalMember(owner = "client!fe", name = "kb", descriptor = "Lpd;")
    public static class94 field943 = class28.method249(123, "(U(Y");

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "[B")
    public static byte[] field940 = new byte[520];

    @OriginalMember(owner = "client!fe", name = "mb", descriptor = "Lpd;")
    public static class94 field945 = class28.method249(-81, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!fe", name = "nb", descriptor = "I")
    public static int field946 = -1;

    @OriginalMember(owner = "client!fe", name = "qb", descriptor = "Lpd;")
    public static class94 field949 = class28.method249(-120, "Wordpack geladen)3");

    @OriginalMember(owner = "client!fe", name = "rb", descriptor = "Lpd;")
    public static class94 field950 = class28.method249(59, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!fe", name = "ob", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!fe", name = "pb", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([B)V", line = 34)
    public class36(byte[] arg0) {
        this.field938 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZI)I", line = 42)
    public static final int method283(int arg0, boolean arg1, int arg2) {
        field939++;
        int var3 = class23.method165(arg0 + 45365, arg2 + 91923, 1, 4) + (class23.method165(arg0 + 10294, arg2 + 37821, 1, 2) - 128 >> 1) + (class23.method165(arg0, arg2, 1, 1) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (!arg1) {
            method285(null, (byte) -98, null, null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(Z)[Ltc;", line = 72)
    public static final class116[] method284(boolean arg0) {
        field947++;
        class116[] var1 = new class116[class31.field887];
        if (!arg0) {
            method285(null, (byte) -81, null, null);
        }
        for (int var2 = 0; var2 < class31.field887; var2++) {
            class116 var3 = var1[var2] = new class116();
            var3.field2928 = class74.field1804;
            var3.field2931 = class51.field1274;
            var3.field2932 = class126.field3159[var2];
            var3.field2934 = class21.field585[var2];
            var3.field2929 = class17.field442[var2];
            var3.field2930 = class100.field2543[var2];
            int var4 = var3.field2930 * var3.field2929;
            byte[] var5 = class63.field1561[var2];
            var3.field2933 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field2933[var6] = class13.field331[class81.method605(var5[var6], 255)];
            }
        }
        class1.method3(124);
        return var1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ls;BLpd;Lpd;)Lad;", line = 119)
    public static final class5 method285(class111 arg0, byte arg1, class94 arg2, class94 arg3) {
        int var4 = arg0.method815(arg2, (byte) 71);
        int var5 = arg0.method828(arg3, false, var4);
        if (arg1 == -114) {
            field935++;
            return class2.method16((byte) -47, var5, arg0, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(Z)V", line = 147)
    public static void method286(boolean arg0) {
        field936 = null;
        field949 = null;
        field943 = null;
        if (!arg0) {
            method286(true);
        }
        field940 = null;
        field950 = null;
        field945 = null;
    }
}
