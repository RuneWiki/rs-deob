import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class87 {

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Z")
    public boolean field1339 = false;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[I")
    public static int[] field1327 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1331 = "green:";

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1333 = "purple:";

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "J")
    public long field1338;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Ldg;")
    public class320 field1325;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "[I")
    public static int[] field1337;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[Lai;")
    public static class126[] field1330;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "[[Z")
    public static boolean[][] field1329;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 6)
    public static void method625(int arg0) {
        field1331 = null;
        if (arg0 > -31) {
            method625(-5);
        }
        field1330 = null;
        field1337 = null;
        field1327 = null;
        field1333 = null;
        field1329 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 24)
    public static final void method626(int arg0) {
        field1332++;
        if (arg0 != 14845) {
            method627(111, 5, 5);
        }
        class11.field218++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Ljava/lang/String;", line = 55)
    public static final String method627(int arg0, int arg1, int arg2) {
        field1335++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < arg0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 <= 3) {
            return var3 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
        } else {
            return "<col=80ff00>";
        }
    }
}
