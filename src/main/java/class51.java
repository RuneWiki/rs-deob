import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lrd;")
    public static class114 field1055 = class84.method656(" hat sich ausgeloggt)3", (byte) 116);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lrd;")
    private static class114 field1054 = class84.method656("Add friend", (byte) 116);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Lrd;")
    public static class114 field1053 = class84.method656("Bitte laden Sie die Seite neu)3", (byte) 120);

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lrd;")
    public static class114 field1062 = field1054;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Lrd;")
    private static class114 field1064 = class84.method656("glow2:", (byte) 124);

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Lrd;")
    public static class114 field1065 = field1064;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field1056 = 0;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field1063 = 0;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lhe;")
    public static class54 field1066;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method360(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1054 = null;
        field1062 = null;
        field1053 = null;
        field1066 = null;
        field1065 = null;
        field1064 = null;
        field1055 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Ltb;")
    public static final class124 method361(int arg0, byte arg1) {
        field1059++;
        class124 var2 = (class124) class32.field651.method194((byte) -115, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class24.field452.method762(9, arg0, (byte) 66);
        class124 var4 = new class124();
        var4.field2933 = arg0;
        if (var3 != null) {
            var4.method962(0, new class60(var3));
        }
        var4.method968((byte) -55);
        class32.field651.method193(-128, var4, (long) arg0);
        if (arg1 != 48) {
            method362((byte) -89);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static final void method362(byte arg0) {
        field1058++;
        class48.field1004 = 0;
        if (arg0 > -56) {
            field1053 = null;
        }
        class85.field1902 = 0;
        class90.method695(2);
        class34.method243(32555);
        class64.method522((byte) 46);
        for (int var1 = 0; var1 < class85.field1902; var1++) {
            int var3 = class102.field2375[var1];
            if (class20.field370 != class123.field2894[var3].field714) {
                class123.field2894[var3].field121 = null;
                class123.field2894[var3] = null;
            }
        }
        if (class74.field1697 != class77.field1752.field1227) {
            throw new RuntimeException("gnp1 pos:" + class77.field1752.field1227 + " psize:" + class74.field1697);
        }
        for (int var2 = 0; var2 < class77.field1765; var2++) {
            if (class123.field2894[class16.field317[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class77.field1765);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static final void method363(int arg0) {
        class62.field1308.method200(-118);
        if (arg0 < 116) {
            method360(true);
        }
        class135.field3286.method200(-103);
        field1060++;
    }
}
