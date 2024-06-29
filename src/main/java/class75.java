import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class75 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field1230 = 0;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lve;")
    public static class255 field1232 = class87.method607(84, ":trade:");

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field1231 = 0;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Ls;")
    public static class260 field1235 = new class260(0, 0);

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Lve;")
    public static class255 field1240 = class87.method607(110, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Lve;")
    public static class255 field1241 = class87.method607(49, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lve;")
    public static class255 field1236 = class87.method607(67, " ");

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lve;")
    public static class255 field1237 = class87.method607(88, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Lve;")
    public static class255 field1238 = class87.method607(36, "(U3");

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "[I")
    public static int[] field1242 = new int[128];

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lve;")
    public static class255 field1243 = class87.method607(38, ":chalreq:");

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 6)
    public static void method535(int arg0) {
        field1240 = null;
        field1235 = null;
        field1243 = null;
        field1232 = null;
        if (arg0 < 59) {
            return;
        }
        field1241 = null;
        field1242 = null;
        field1236 = null;
        field1237 = null;
        field1238 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I", line = 36)
    public static final int method536(int arg0, int arg1, int arg2) {
        field1233++;
        if (arg0 != 1627291839) {
            field1240 = (class255) null;
        }
        int var3 = arg2 >> 31 & arg1 - 1;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I", line = 56)
    public static final int method537(int arg0, int arg1) {
        field1234++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg1 != 29150) {
            return -71;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }
}
