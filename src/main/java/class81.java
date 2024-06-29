import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class81 {

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lqd;")
    private static class40 field1424 = class147.method1106("Examine", (byte) -52);

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1426 = -1;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Lqd;")
    public static class40 field1428 = class147.method1106("overlay2", (byte) -105);

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1422 = 0;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lqd;")
    public static class40 field1427 = class147.method1106("<col=ffffff> )4 ", (byte) -59);

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Z")
    public static boolean field1429 = true;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Lqd;")
    public static class40 field1432 = field1424;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "[I")
    public static int[] field1433 = new int[100];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lce;")
    public static class239 field1420;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 7)
    public static void method630(int arg0) {
        if (arg0 != -185909240) {
            method631(75, -97);
        }
        field1420 = null;
        field1433 = null;
        field1432 = null;
        field1428 = null;
        field1424 = null;
        field1427 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I", line = 36)
    public static final int method631(int arg0, int arg1) {
        field1430++;
        if (arg0 < 104) {
            method631(41, 30);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIJ)Z", line = 72)
    public static final boolean method632(int arg0, int arg1, int arg2, long arg3) {
        class14 var5 = class93.field1690[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field235 != null && var5.field235.field5061 == arg3) {
            return true;
        } else if (var5.field225 != null && var5.field225.field338 == arg3) {
            return true;
        } else if (var5.field222 != null && var5.field222.field1804 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field216; var6++) {
                if (var5.field230[var6].field3101 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
